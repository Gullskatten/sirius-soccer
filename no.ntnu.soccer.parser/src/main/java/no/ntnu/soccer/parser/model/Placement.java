package no.ntnu.soccer.parser.model;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.BufferedWriter;
import java.io.IOException;
import java.util.function.Function;

public class Placement implements XmiParsable {
    private static final Logger LOGGER = LoggerFactory.getLogger(Placement.class);

    private final int teamApiId;
    private int draws;
    private int wins;
    private int losses;
    private int seasonPoints;
    private int homeGoals;
    private int awayGoals;
    private int goalDifference;
    private int gamesPlayed;
    private final String name;

    public Placement(Team team) {
        this.teamApiId = team.getTeamApiId();
        this.name = team.getTeamName();
    }

    public void updatePlacementInfo(Match match) {
        this.gamesPlayed += 1;

        if(match.getHomeTeamApiId() == teamApiId) {
            updateMatchResult(match.getHomeTeamGoal(), match.getAwayTeamGoal());
            this.homeGoals += match.getHomeTeamGoal();
            this.goalDifference += match.getHomeTeamGoal() - match.getAwayTeamGoal();
        } else if (match.getAwayTeamApiId() == teamApiId) {
            updateMatchResult(match.getAwayTeamGoal(), match.getHomeTeamGoal());
            this.awayGoals += match.getAwayTeamGoal();
            this.goalDifference += match.getAwayTeamGoal() - match.getHomeTeamGoal();
        }
    }

    private void updateMatchResult(int teamGoals, int otherTeamGoals) {
        if(teamGoals > otherTeamGoals) {
            this.wins += 1;
            this.seasonPoints += 3;
        }
        if(teamGoals < otherTeamGoals) {
            this.losses += 1;
        }
        if(teamGoals == otherTeamGoals) {
            this.draws += 1;
            this.seasonPoints += 1;
        }
    }

    public int getTeamApiId() {
        return teamApiId;
    }

    public int getDraws() {
        return draws;
    }

    public void setDraws(int draws) {
        this.draws = draws;
    }

    public int getWins() {
        return wins;
    }

    public void setWins(int wins) {
        this.wins = wins;
    }

    public int getLosses() {
        return losses;
    }

    public void setLosses(int losses) {
        this.losses = losses;
    }

    public int getSeasonPoints() {
        return seasonPoints;
    }

    public void setSeasonPoints(int seasonPoints) {
        this.seasonPoints = seasonPoints;
    }

    public int getHomeGoals() {
        return homeGoals;
    }

    public void setHomeGoals(int homeGoals) {
        this.homeGoals = homeGoals;
    }

    public int getAwayGoals() {
        return awayGoals;
    }

    public void setAwayGoals(int awayGoals) {
        this.awayGoals = awayGoals;
    }

    public int getGoalDifference() {
        return goalDifference;
    }

    public void setGoalDifference(int goalDifference) {
        this.goalDifference = goalDifference;
    }

    public int getGamesPlayed() {
        return gamesPlayed;
    }

    public void setGamesPlayed(int gamesPlayed) {
        this.gamesPlayed = gamesPlayed;
    }

    @Override
    public void toXmi(BufferedWriter writer, Function<Void, Void> unusedFunction) {
        try {
            writer.write(indent() + "<placements\n"
                    + indent() + "    team=" + "\"" + getTeamApiId() + "\"\n"
                    + indent() + "    name=" + "\"" + getName() + "\"\n"
                    + indent() + "    awayTeamGoal=" + "\"" + getAwayGoals() + "\"\n"
                    + indent() + "    homeTeamGoal=" + "\"" + getHomeGoals() + "\"\n"
                    + indent() + "    goalDifference=" + "\"" + getGoalDifference() + "\"\n"
                    + indent() + "    wins=" + "\"" + getWins() + "\"\n"
                    + indent() + "    losses=" + "\"" + getLosses() + "\"\n"
                    + indent() + "    draws=" + "\"" + getDraws() + "\"\n"
                    + indent() + "    seasonPoints=" + "\"" + getSeasonPoints() + "\">\n");
            writer.write(indent() + "</placements>\n");
        } catch (IOException e) {
            LOGGER.info("Exception occurred: ", e);
        }
    }

    @Override
    public String indent() {
        return "            ";
    }

    public String getName() {
        return name;
    }
}
