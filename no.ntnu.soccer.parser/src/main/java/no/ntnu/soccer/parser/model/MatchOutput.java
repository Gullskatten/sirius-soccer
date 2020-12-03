package no.ntnu.soccer.parser.model;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.BufferedWriter;
import java.io.IOException;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

import static no.ntnu.soccer.parser.model.FieldPositionType.*;

public class MatchOutput extends Match implements XmiParsable {
    private static final Logger LOGGER = LoggerFactory.getLogger(MatchOutput.class);

    private final Team awayTeam;
    private final Team homeTeam;


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

        if(awayTeam == null) {
            LOGGER.error("AWAY TEAM {} NOT FOUND NOT FOUND IN MATCH {} IN SEASON {}!", match.getAwayTeamApiId(), match.getId(), match.getSeason());
        }

        if(homeTeam == null) {
            LOGGER.error("HOME TEAM {} NOT FOUND IN MATCH {} IN SEASON {}!", match.getHomeTeamApiId(), match.getId(), match.getSeason());
        }

        setLeagueId(match.getLeagueId());
        setCountryId(match.getCountryId());

        Map<Integer, PositionCoordinate> awayPlayersWithPositions = new HashMap<>();

        awayPlayersWithPositions.put(match.getHomePlayer1(), new PositionCoordinate(match.getHomePlayerX1(), match.getHomePlayerY1()));
        awayPlayersWithPositions.put(match.getHomePlayer2(), new PositionCoordinate(match.getHomePlayerX2(), match.getHomePlayerY2()));
        awayPlayersWithPositions.put(match.getHomePlayer3(), new PositionCoordinate(match.getHomePlayerX3(), match.getHomePlayerY3()));
        awayPlayersWithPositions.put(match.getHomePlayer4(), new PositionCoordinate(match.getHomePlayerX1(), match.getHomePlayerY1()));
        awayPlayersWithPositions.put(match.getHomePlayer5(), new PositionCoordinate(match.getHomePlayerX5(), match.getHomePlayerY5()));
        awayPlayersWithPositions.put(match.getHomePlayer6(), new PositionCoordinate(match.getHomePlayerX6(), match.getHomePlayerY6()));
        awayPlayersWithPositions.put(match.getHomePlayer7(), new PositionCoordinate(match.getHomePlayerX7(), match.getHomePlayerY7()));
        awayPlayersWithPositions.put(match.getHomePlayer8(), new PositionCoordinate(match.getHomePlayerX8(), match.getHomePlayerY8()));
        awayPlayersWithPositions.put(match.getHomePlayer9(), new PositionCoordinate(match.getHomePlayerX9(), match.getHomePlayerY9()));
        awayPlayersWithPositions.put(match.getHomePlayer10(), new PositionCoordinate(match.getHomePlayerX10(), match.getHomePlayerY10()));
        awayPlayersWithPositions.put(match.getHomePlayer11(), new PositionCoordinate(match.getHomePlayerX11(), match.getHomePlayerY11()));


        Map<Integer, PositionCoordinate> homePlayersWithPositions = new HashMap<>();

        homePlayersWithPositions.put(match.getHomePlayer1(), new PositionCoordinate(match.getHomePlayerX1(), match.getHomePlayerY1()));
        homePlayersWithPositions.put(match.getHomePlayer2(), new PositionCoordinate(match.getHomePlayerX2(), match.getHomePlayerY2()));
        homePlayersWithPositions.put(match.getHomePlayer3(), new PositionCoordinate(match.getHomePlayerX3(), match.getHomePlayerY3()));
        homePlayersWithPositions.put(match.getHomePlayer4(), new PositionCoordinate(match.getHomePlayerX1(), match.getHomePlayerY1()));
        homePlayersWithPositions.put(match.getHomePlayer5(), new PositionCoordinate(match.getHomePlayerX5(), match.getHomePlayerY5()));
        homePlayersWithPositions.put(match.getHomePlayer6(), new PositionCoordinate(match.getHomePlayerX6(), match.getHomePlayerY6()));
        homePlayersWithPositions.put(match.getHomePlayer7(), new PositionCoordinate(match.getHomePlayerX7(), match.getHomePlayerY7()));
        homePlayersWithPositions.put(match.getHomePlayer8(), new PositionCoordinate(match.getHomePlayerX8(), match.getHomePlayerY8()));
        homePlayersWithPositions.put(match.getHomePlayer9(), new PositionCoordinate(match.getHomePlayerX9(), match.getHomePlayerY9()));
        homePlayersWithPositions.put(match.getHomePlayer10(), new PositionCoordinate(match.getHomePlayerX10(), match.getHomePlayerY10()));
        homePlayersWithPositions.put(match.getHomePlayer11(), new PositionCoordinate(match.getHomePlayerX11(), match.getHomePlayerY11()));


        List<Player> homePlayers = findPlayersByPlayerIds(awayPlayersWithPositions, allPlayers);
        List<Player> awayPlayers = findPlayersByPlayerIds(homePlayersWithPositions, allPlayers);

        if(homeTeam != null) {
            homeTeam.setPlayers(homePlayers);
        }

        if(awayTeam != null) {
            awayTeam.setPlayers(awayPlayers);
        }
    }

    public Team findTeamById(int anyTeamId, List<Team> allTeams) {
        return allTeams.stream().filter(x -> x.getTeamApiId() == anyTeamId).findFirst().orElse(null);
    }

    private List<Player> findPlayersByPlayerIds(Map<Integer, PositionCoordinate> playerIdsWithPositions, List<Player> allPlayers) {
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
            writer.write(indent() + "<matches\n"
                    + indent() + "    id=" + "\"" + getId() + "\"\n"
                    + indent() + "    awayTeamGoal=" + "\"" + getAwayTeamGoal() + "\"\n"
                    + indent() + "    homeTeamGoal=" + "\"" + getHomeTeamGoal() + "\"\n"
                    + indent() + "    result=" + "\"" + determineMatchResult() + "\">\n");
            appendOpponent(new Opponent(awayTeam, "AWAY_TEAM"), writer);
            appendOpponent(new Opponent(homeTeam, "HOME_TEAM"), writer);
            writer.write(indent() + "</matches>\n");
        } catch (IOException e) {
            LOGGER.info("Exception occurred: ", e);
        }
    }

    private String determineMatchResult() {
        if (getHomeTeamGoal() == getAwayTeamGoal()) {
            return "DRAW";
        }

        return getHomeTeamGoal() > getAwayTeamGoal() ? "HOME_WIN" : "AWAY_WIN";
    }

    @Override
    public String indent() {
        return "          ";
    }

    private void appendOpponent(Opponent opponent, BufferedWriter writer) {
        opponent.toXmi(writer, unused -> {
            Arrays.asList(KEEPER, DEFENCE, MIDFIELD, FORWARD).forEach(type -> {
                Position position = new Position(findPlayersByPosition(opponent.getTeam().getPlayers(), type), type);
                position.toXmi(writer, null);
            });
        return null;
        });
    }

    private List<Player> findPlayersByPosition(List<Player> players, FieldPositionType type) {
        switch (type) {
            case KEEPER:
                return players.stream().filter(player -> player.getY() == 1).collect(Collectors.toList());
            case DEFENCE:
                return players.stream().filter(player -> player.getY() >= 2 && player.getY() <= 5).collect(Collectors.toList());
            case MIDFIELD:
                return players.stream().filter(player -> player.getY() >= 6 && player.getY() <= 7).collect(Collectors.toList());
            case FORWARD:
                return players.stream().filter(player -> player.getY() >= 8 && player.getY() <= 11).collect(Collectors.toList());
            default:
                return Collections.emptyList();
        }
    }
}
