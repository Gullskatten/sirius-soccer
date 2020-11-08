import com.google.common.collect.Lists;
import com.opencsv.CSVWriter;
import com.opencsv.bean.StatefulBeanToCsv;
import com.opencsv.bean.StatefulBeanToCsvBuilder;
import com.opencsv.exceptions.CsvDataTypeMismatchException;
import com.opencsv.exceptions.CsvRequiredFieldEmptyException;
import no.ntnu.soccer.parser.constants.ListOfSeasons;
import no.ntnu.soccer.parser.csv.CsvUtil;
import no.ntnu.soccer.parser.model.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.function.Function;
import java.util.stream.Collectors;

public class PerformParsing {

    private static final Logger LOGGER = LoggerFactory.getLogger(PerformParsing.class);


    /**
     * Parses an SQLite database of soccer data to XMI-instances used for EMF
     *
     * @param args Optional arguments to runnable
     */
    public static void main(String[] args) {
        Sport sport = new Sport("Football");

        final CsvUtil<Player> playerCsvUtil = new CsvUtil<>();
        final List<Player> players = playerCsvUtil.readCsv(Player.RESOURCE_CSV_FILE, Player.class, Player.CSV_DELIMITER, Charset.defaultCharset());

        final CsvUtil<Team> teamCsvUtil = new CsvUtil<>();
        final List<Team> teams = teamCsvUtil.readCsv(Team.RESOURCE_CSV_FILE, Team.class, Team.CSV_DELIMITER, Charset.defaultCharset());

        final CsvUtil<League> leagueCsvUtil = new CsvUtil<>();
        final List<League> leagues = leagueCsvUtil.readCsv(League.RESOURCE_CSV_FILE, League.class, League.CSV_DELIMITER, Charset.defaultCharset());

        final CsvUtil<Match> matchCsvUtil = new CsvUtil<>();
        final List<Match> matches = matchCsvUtil.readCsv(Match.RESOURCE_CSV_FILE, Match.class, Match.CSV_DELIMITER, Charset.defaultCharset());

        final CsvUtil<Country> countryCsvUtil = new CsvUtil<>();
        final List<Country> countries = countryCsvUtil.readCsv(Country.RESOURCE_CSV_FILE, Country.class, Country.CSV_DELIMITER, Charset.defaultCharset());

        ExecutorService threadPoolExecutor = Executors.newWorkStealingPool();
        LOGGER.info("Initialized thread pool, prep parallel execution of match -> match output transformation");
        List<Callable<List<MatchOutput>>> workLoad = Lists.partition(matches, 5000).stream().map(listOfMatches ->
                (Callable<List<MatchOutput>>) () -> listOfMatches.stream().map(match -> new MatchOutput(match, players, teams)).collect(Collectors.toList())
        ).collect(Collectors.toList());

        List<MatchOutput> matchOutputs = new ArrayList<>();

        LOGGER.info("Performing parallel execution with {} workers", workLoad.size());
        try {
            threadPoolExecutor.invokeAll(workLoad).forEach(listFuture -> {
                try {
                    matchOutputs.addAll(listFuture.get());

                    if (matchOutputs.size() % 10000 == 0 && matchOutputs.size() > 0) {
                        LOGGER.info("Processed {} matches", workLoad.size());
                    }
                } catch (InterruptedException | ExecutionException e) {
                    LOGGER.error("Error during invocation: {}", e.getMessage());
                }
            });

        } catch (InterruptedException e) {
            LOGGER.error("Thread was interrupted: {}", e.getMessage());
        }

        LOGGER.info("\n");
        LOGGER.info("GENERATING hierarchy for {} matches", matchOutputs.size());

        // Sport
        // - Country
        // - - League
        // - - - Season
        // - - - - Matches
        // - - - - - Teams
        // - - - - - - Players

        File file = new File(System.currentTimeMillis() + "_" + "football.xmi");
        try (FileWriter writer = new FileWriter(file);
             BufferedWriter bufferedWriter = new BufferedWriter(writer)) {
            sport.toXmi(
                    bufferedWriter,
                    unused -> {
                        countries.forEach(
                                country -> country.toXmi(
                                        bufferedWriter,
                                        unused2 -> {
                                            leagues.forEach(
                                                    league -> league.toXmi(
                                                            bufferedWriter,
                                                            unused1 -> {
                                                                ListOfSeasons.ALL_SEASONS.forEach(season -> season.toXmi(
                                                                        bufferedWriter,
                                                                        unused3 -> {
                                                                            matchOutputs.stream().filter(
                                                                                    match ->
                                                                                            country.getId() == match.getCountryId() &&
                                                                                                    season.getSeasonName().equals(match.getSeason()) &&
                                                                                                    league.getId() == (match.getLeagueId())
                                                                            ).forEach(
                                                                                    matchOutput -> {
                                                                                        matchOutput.toXmi(
                                                                                                bufferedWriter,
                                                                                                null
                                                                                        );
                                                                                    }
                                                                            );

                                                                            return null;
                                                                        }
                                                                ));
                                                                return null;
                                                            })
                                            );
                                            return null;
                                        }
                                ));

                        return null;
                    });

            /*

             */
        } catch (IOException e) {
            LOGGER.error("Failed to write output file: {}", e.getMessage());
        }
    }
}
