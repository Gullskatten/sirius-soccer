import com.google.common.collect.Lists;
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
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class PerformParsing {

    private static final Logger LOGGER = LoggerFactory.getLogger(PerformParsing.class);
    public static final DateTimeFormatter DATE_TIME_FORMATTER = DateTimeFormatter.ofPattern("yyyy-MM-dd ");


    /**
     * Parses a series of soccer data (CSV) to XMI-instances used for EMF
     *
     * @param args (Unused) Optional arguments to runnable
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

        final List<MatchDay> matchDays = matches.stream()
                // Map all dates with seasons
                .map(match -> match.getDate().format(DATE_TIME_FORMATTER) + match.getSeason() + " " + match.getLeagueId())
                // For each distinct day - create a MatchDay object
                .distinct().map(distinctDayInSeason -> {
                    String dayString = distinctDayInSeason.split(" ")[0];
                    String season = distinctDayInSeason.split(" ")[1];
                    String league = distinctDayInSeason.split(" ")[2];
                    LocalDate day =  LocalDate.parse(dayString);

                    return new MatchDay(season, day, league);
                }).collect(Collectors.toList());

        ExecutorService threadPoolExecutor = Executors.newWorkStealingPool();
        LOGGER.info("Initialized thread pool, prep parallel execution of match -> match output transformation");
        List<Callable<List<MatchOutput>>> workLoad = Lists.partition(matches, 1000).stream().map(listOfMatches ->
                (Callable<List<MatchOutput>>) () -> listOfMatches.stream().map(match -> {

                    // Do not include matches that don't have player coordinates!
                    if(match.getAwayPlayerX1() + match.getAwayPlayerY1() +
                    match.getAwayPlayerX2() + match.getAwayPlayerY2() +
                    match.getAwayPlayerX3() + match.getAwayPlayerY3() +
                    match.getAwayPlayerX4() + match.getAwayPlayerY4() == 0
                    ) {
                        return null;
                    }

                    return new MatchOutput(match, players, teams);
                }).filter(Objects::nonNull).collect(Collectors.toList())
        ).collect(Collectors.toList());

        List<MatchOutput> matchOutputs = new ArrayList<>();

        LOGGER.info("Performing parallel execution with {} workers", workLoad.size());
        try {
            threadPoolExecutor.invokeAll(workLoad).forEach(listFuture -> {
                try {
                    matchOutputs.addAll(listFuture.get());

                    if (matchOutputs.size() % 5000 == 0 && matchOutputs.size() > 0) {
                        LOGGER.info("Processed 5000 matches");
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

        // Sport -> has participating countries as child
        // - Country -> has leagues as child
        // - - League -> has seasons as child
        // - - - Season -> has matches as child
        // - - - - Matches -> has team as child
        // - - - - - Teams -> has players as child
        // - - - - - - Players

        File file = new File(System.currentTimeMillis() + "_" + "football.xmi");
        LOGGER.info("Writing XMI file to {}", file.getAbsolutePath());
        try (FileWriter writer = new FileWriter(file);
             BufferedWriter bufferedWriter = new BufferedWriter(writer)) {
            sport.toXmi(
                    bufferedWriter,
                    unused -> {
                        countries.forEach(
                                country -> country.toXmi(
                                        bufferedWriter,
                                        unused2 -> {
                                            leagues.stream().filter(league -> league.getCountryId() == country.getId()).forEach(
                                                    league -> league.toXmi(
                                                            bufferedWriter,
                                                            unused1 -> {
                                                                ListOfSeasons.ALL_SEASONS.forEach(season -> season.toXmi(
                                                                        bufferedWriter,
                                                                        unused3 -> {

                                                                            List<Placement> allPlacementsInSeason = new ArrayList<>();

                                                                            matchDays.stream().filter(
                                                                                    matchDay -> matchDay.getSeason().equals(season.getSeasonName())
                                                                                                && matchDay.getLeague().equals(String.valueOf(league.getId())
                                                                                    )
                                                                            ).forEach(matchDay -> matchDay.toXmi(bufferedWriter, unused4 -> {
                                                                                matchOutputs.stream().filter(
                                                                                        match ->
                                                                                                country.getId() == match.getCountryId() &&
                                                                                                        league.getId() == (match.getLeagueId()) &&
                                                                                                        matchDay.getMatchDate().isEqual(match.getDate())
                                                                                ).forEach(
                                                                                        matchOutput -> {

                                                                                           Optional<Placement> homeTeamPlacement = allPlacementsInSeason.stream()
                                                                                                    .filter(x -> x.getTeamApiId() == matchOutput.getHomeTeam().getTeamApiId()).findFirst();

                                                                                            createOrUpdatePlacement(allPlacementsInSeason, matchOutput, homeTeamPlacement, matchOutput.getHomeTeam());

                                                                                            Optional<Placement> awayTeamPlacement = allPlacementsInSeason.stream()
                                                                                                    .filter(x -> x.getTeamApiId() == matchOutput.getAwayTeam().getTeamApiId()).findFirst();

                                                                                            createOrUpdatePlacement(allPlacementsInSeason, matchOutput, awayTeamPlacement, matchOutput.getAwayTeam());

                                                                                            matchOutput.toXmi(
                                                                                                    bufferedWriter,
                                                                                                    null
                                                                                            );
                                                                                        }
                                                                                );

                                                                                return null;

                                                                            }));
                                                                            new Standing().toXmi(bufferedWriter,
                                                                                unused5 -> {
                                                                                    List<Placement> placementsSorted = allPlacementsInSeason.stream()
                                                                                            .sorted(Comparator.comparingInt(Placement::getSeasonPoints)).collect(Collectors.toList());
                                                                                    Collections.reverse(placementsSorted);

                                                                                    placementsSorted.forEach(placement -> placement.toXmi(bufferedWriter, null));
                                                                                return null;
                                                                            });
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

    private static void createOrUpdatePlacement(List<Placement> allPlacementsInSeason, MatchOutput matchOutput, Optional<Placement> awayTeamPlacement, Team awayTeam) {
        if (awayTeamPlacement.isPresent()) {
            awayTeamPlacement.get().updatePlacementInfo(matchOutput);
        } else {
            Placement placement = new Placement(awayTeam);
            placement.updatePlacementInfo(matchOutput);
            allPlacementsInSeason.add(placement);
        }
    }
}
