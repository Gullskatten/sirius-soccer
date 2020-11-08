package no.ntnu.soccer.parser.model;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.BufferedWriter;
import java.io.IOException;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

public class MatchOutput extends Match implements XmiParsable {
    private static final Logger LOGGER = LoggerFactory.getLogger(MatchOutput.class);
    private static final DateTimeFormatter fmt = DateTimeFormatter.ofPattern("yyyy-MM-dd");

    private final Team awayTeam;
    private final Team homeTeam;
    private final List<Player> homePlayers;
    private final List<Player> awayPlayers;


    public MatchOutput(Match match,
                       final List<Player> allPlayers,
                       final List<Team> allTeams) {

        setDate(match.getDate());
        setSeason(match.getSeason());

        awayTeam = findTeamById(match.getAwayTeamApiId(), allTeams);
        homeTeam = findTeamById(match.getHomeTeamApiId(), allTeams);

        setLeagueId(match.getLeagueId());
        setCountryId(match.getCountryId());

        List<Integer> awayPlayerIds = Arrays.asList(
                match.getAwayPlayer1(),
                match.getAwayPlayer2(),
                match.getAwayPlayer3(),
                match.getAwayPlayer4(),
                match.getAwayPlayer5(),
                match.getAwayPlayer6(),
                match.getAwayPlayer7(),
                match.getAwayPlayer8(),
                match.getAwayPlayer9(),
                match.getAwayPlayer10(),
                match.getAwayPlayer11()
        );

        List<Integer> homePlayerIds = Arrays.asList(
                match.getHomePlayer1(),
                match.getHomePlayer2(),
                match.getHomePlayer3(),
                match.getHomePlayer4(),
                match.getHomePlayer5(),
                match.getHomePlayer6(),
                match.getHomePlayer7(),
                match.getHomePlayer8(),
                match.getHomePlayer9(),
                match.getHomePlayer10(),
                match.getHomePlayer11()
        );

        homePlayers = findPlayersByPlayerIds(awayPlayerIds, allPlayers);
        awayPlayers = findPlayersByPlayerIds(homePlayerIds, allPlayers);
    }

    private Country findCountryById(int countryId, List<Country> allCountries) {
        return allCountries.stream().filter(x -> x.getId() == countryId).findFirst().orElse(null);
    }

    private League findLeagueById(int leagueId, List<League> allLeagues) {
        return allLeagues.stream().filter(x -> x.getId() == leagueId).findFirst().orElse(null);
    }

    private Team findTeamById(int awayTeamApiId, List<Team> allTeams) {
        return allTeams.stream().filter(x -> x.getTeamApiId() == awayTeamApiId).findFirst().orElse(null);
    }

    List<Player> findPlayersByPlayerIds(List<Integer> playerIds, List<Player> allPlayers) {
        return playerIds.stream()
                .filter(playerId -> playerId != 0)
                .map(playerId -> {
                    Optional<Player> first = allPlayers.stream()
                            .filter(player -> player.getId() == playerId)
                            .findFirst();
                    return first.orElse(null);
                })
                .collect(Collectors.toList());
    }

    @Override
    public void toXmi(BufferedWriter writer, Function<Void, Void> unusedFunction) {
        try {
            writer.write("<match \n"
                    + "date=" + "\""  + getDate().format(fmt) + "\"\n"
                    + "id=" + "\""  + getId() + "\"\n"
                    + ">\n");
            appendTeam(new TeamOutput(awayTeam, "awayTeam"), awayPlayers, writer);
            appendTeam(new TeamOutput(homeTeam, "homeTeam"), homePlayers, writer);
            writer.write("</match>\n");
        } catch (IOException e) {
            LOGGER.info("Exception occurred: ", e);
        }
    }

    private void appendTeam(TeamOutput team, List<Player> players, BufferedWriter writer) {
        team.toXmi(writer, unused -> {
            players.forEach(
                    player -> player.toXmi(writer, null)
            );
            return null;
        });
    }
}
