package no.ntnu.soccer.parser.model;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.BufferedWriter;
import java.io.IOException;
import java.util.*;
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
        setHomeTeamApiId(match.getHomeTeamApiId());
        setAwayTeamApiId(match.getAwayTeamApiId());
        setHomeTeamGoal(match.getHomeTeamGoal());

        awayTeam = findTeamById(match.getAwayTeamApiId(), allTeams);
        homeTeam = findTeamById(match.getHomeTeamApiId(), allTeams);

        setLeagueId(match.getLeagueId());
        setCountryId(match.getCountryId());

        Map<Integer, Position> awayPlayersWithPositions = new HashMap<>();

        awayPlayersWithPositions.put(match.getHomePlayer1(), new Position(match.getHomePlayerX1(), match.getHomePlayerY1()));
        awayPlayersWithPositions.put(match.getHomePlayer2(), new Position(match.getHomePlayerX2(), match.getHomePlayerY2()));
        awayPlayersWithPositions.put(match.getHomePlayer3(), new Position(match.getHomePlayerX3(), match.getHomePlayerY3()));
        awayPlayersWithPositions.put(match.getHomePlayer4(), new Position(match.getHomePlayerX1(), match.getHomePlayerY1()));
        awayPlayersWithPositions.put(match.getHomePlayer5(), new Position(match.getHomePlayerX5(), match.getHomePlayerY5()));
        awayPlayersWithPositions.put(match.getHomePlayer6(), new Position(match.getHomePlayerX6(), match.getHomePlayerY6()));
        awayPlayersWithPositions.put(match.getHomePlayer7(), new Position(match.getHomePlayerX7(), match.getHomePlayerY7()));
        awayPlayersWithPositions.put(match.getHomePlayer8(), new Position(match.getHomePlayerX8(), match.getHomePlayerY8()));
        awayPlayersWithPositions.put(match.getHomePlayer9(), new Position(match.getHomePlayerX9(), match.getHomePlayerY9()));
        awayPlayersWithPositions.put(match.getHomePlayer10(), new Position(match.getHomePlayerX10(), match.getHomePlayerY10()));
        awayPlayersWithPositions.put(match.getHomePlayer11(), new Position(match.getHomePlayerX11(), match.getHomePlayerY11()));


        Map<Integer, Position> homePlayersWithPositions = new HashMap<>();

        homePlayersWithPositions.put(match.getHomePlayer1(), new Position(match.getHomePlayerX1(), match.getHomePlayerY1()));
        homePlayersWithPositions.put(match.getHomePlayer2(), new Position(match.getHomePlayerX2(), match.getHomePlayerY2()));
        homePlayersWithPositions.put(match.getHomePlayer3(), new Position(match.getHomePlayerX3(), match.getHomePlayerY3()));
        homePlayersWithPositions.put(match.getHomePlayer4(), new Position(match.getHomePlayerX1(), match.getHomePlayerY1()));
        homePlayersWithPositions.put(match.getHomePlayer5(), new Position(match.getHomePlayerX5(), match.getHomePlayerY5()));
        homePlayersWithPositions.put(match.getHomePlayer6(), new Position(match.getHomePlayerX6(), match.getHomePlayerY6()));
        homePlayersWithPositions.put(match.getHomePlayer7(), new Position(match.getHomePlayerX7(), match.getHomePlayerY7()));
        homePlayersWithPositions.put(match.getHomePlayer8(), new Position(match.getHomePlayerX8(), match.getHomePlayerY8()));
        homePlayersWithPositions.put(match.getHomePlayer9(), new Position(match.getHomePlayerX9(), match.getHomePlayerY9()));
        homePlayersWithPositions.put(match.getHomePlayer10(), new Position(match.getHomePlayerX10(), match.getHomePlayerY10()));
        homePlayersWithPositions.put(match.getHomePlayer11(), new Position(match.getHomePlayerX11(), match.getHomePlayerY11()));


        homePlayers = findPlayersByPlayerIds(awayPlayersWithPositions, allPlayers);
        awayPlayers = findPlayersByPlayerIds(homePlayersWithPositions, allPlayers);
    }

    public Team findTeamById(int anyTeamId, List<Team> allTeams) {
        return allTeams.stream().filter(x -> x.getTeamApiId() == anyTeamId).findFirst().orElse(null);
    }

    private List<Player> findPlayersByPlayerIds(Map<Integer, Position> playerIdsWithPositions, List<Player> allPlayers) {
        return playerIdsWithPositions.keySet()
                .stream()
                .map(playerId -> {

                    Optional<Player> first = allPlayers.stream()
                            .filter(player -> player.getId() == playerId)
                            .findFirst();
                    return first.orElse(null);
                }).filter(Objects::nonNull)
                .peek(player -> {
                    player.setX(playerIdsWithPositions.get(player.getId()).getX());
                    player.setY(playerIdsWithPositions.get(player.getId()).getY());
                })
                .collect(Collectors.toList());
    }

    public Team getAwayTeam() {
        return awayTeam;
    }

    public Team getHomeTeam() {
        return homeTeam;
    }

    @Override
    public void toXmi(BufferedWriter writer, Function<Void, Void> unusedFunction) {
        if (homeTeam == null || awayTeam == null) {
            return;
        }

        try {
            writer.write(indent() + "<match \n"
                    + indent() + " id=" + "\"" + getId() + "\"\n"
                    + indent() + " awayTeamGoal=" + "\"" + getAwayTeamGoal() + "\"\n"
                    + indent() + " homeTeamGoal=" + "\"" + getHomeTeamGoal() + "\"\n"
                    + indent() + " winner=" + "\"" + determineMatchWinner() + "\">\n");
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
