package no.ntnu.soccer.parser.model;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.BufferedWriter;
import java.io.IOException;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

public class MatchOutput extends Match implements XmiParsable {
    private static final Logger LOGGER = LoggerFactory.getLogger(MatchOutput.class);

    private final Team awayTeam;
    private final Team homeTeam;
    private final List<Player> homePlayers;
    private final List<Player> awayPlayers;


    public MatchOutput(Match match,
                       final List<Player> allPlayers,
                       final List<Team> allTeams) {
        setId(match.getId());
        setDate(match.getDate());
        setSeason(match.getSeason());
        setAwayTeamGoal(match.getAwayTeamGoal());
        setHomeTeamGoal(match.getHomeTeamGoal());

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

    private Team findTeamById(int awayTeamApiId, List<Team> allTeams) {
        return allTeams.stream().filter(x -> x.getTeamApiId() == awayTeamApiId).findFirst().orElse(null);
    }

    List<Player> findPlayersByPlayerIds(List<Integer> playerIds, List<Player> allPlayers) {
        return playerIds.stream()
                .map(playerId -> {
                    Optional<Player> first = allPlayers.stream()
                            .filter(player -> player.getId() == playerId)
                            .findFirst();
                    return first.orElse(null);
                }).filter(Objects::nonNull)
                .collect(Collectors.toList());
    }

    @Override
    public void toXmi(BufferedWriter writer, Function<Void, Void> unusedFunction) {
        if(homeTeam == null || awayTeam == null) {
            return;
        }

        try {
            writer.write(indent() + "<match \n"
                    + indent() + " id=" + "\""  + getId() + "\">\n"
                    + indent() + " awayTeamGoal=" + "\""  + getAwayTeamGoal() + "\">\n"
                    + indent() + " homeTeamGoal=" + "\""  + getHomeTeamGoal() + "\">\n"
                    + indent() + " winner=" + "\""  + determineMatchWinner() + "\">\n");
            appendTeam(new TeamOutput(awayTeam, "awayTeam"), awayPlayers, writer);
            appendTeam(new TeamOutput(homeTeam, "homeTeam"), homePlayers, writer);
            writer.write(indent() + "</match>\n");
        } catch (IOException e) {
            LOGGER.info("Exception occurred: ", e);
        }
    }

    private String determineMatchWinner() {
        if (getHomeTeamGoal() == getAwayTeamGoal()) {
            return "DRAW";
        }

        return getHomeTeamGoal() > getAwayTeamGoal() ? "HOME_TEAM" : "AWAY_TEAM";
    }

    @Override
    public String indent() {
        return "            ";
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
