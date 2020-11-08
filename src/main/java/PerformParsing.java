import no.ntnu.soccer.parser.csv.CsvUtil;
import no.ntnu.soccer.parser.model.*;

import java.nio.charset.Charset;
import java.util.List;

public class PerformParsing {
    /**
     * Parses an SQLite database of soccer data to XMI-instances used for EMF
     *
     * @param args Optional arguments to runnable
     */
    public static void main(String[] args) {
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

        // TODO: Find relevant columns
        // TODO: Decide if we should add some derived attributes (e.g. 'team' for a player)
        // TODO: Merge to XMI-schema


    }
}
