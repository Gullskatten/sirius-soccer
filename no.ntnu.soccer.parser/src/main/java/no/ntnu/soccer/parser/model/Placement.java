package no.ntnu.soccer.parser.model;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.BufferedWriter;
import java.io.IOException;
import java.util.function.Function;

public class Placement implements XmiParsable {
    private static final Logger LOGGER = LoggerFactory.getLogger(Placement.class);

    private final int teamApiId;
    private int rank;
    private int draws;
    private int wins;
    private int losses;
    private int points;
    private int goalsFor;
    private int goalsAgainst;
    private int goalDifference;
    private int gamesPlayed;

    public Placement(Team team) {
        this.teamApiId = team.getTeamApiId();
    }

    public void updatePlacementInfo(Match match) {
        this.gamesPlayed += 1;

        if(match.getHomeTeamApiId() == teamApiId) {
            updateMatchResult(match.getHomeTeamGoal(), match.getAwayTeamGoal());
            this.goalsFor += match.getHomeTeamGoal();
            this.goalsAgainst += match.getAwayTeamGoal();
        } else if (match.getAwayTeamApiId() == teamApiId) {
            updateMatchResult(match.getAwayTeamGoal(), match.getHomeTeamGoal());
            this.goalsFor += match.getAwayTeamGoal();
            this.goalsAgainst += match.getHomeTeamGoal();
        }
		this.goalDifference = this.goalsFor - this.goalsAgainst;
    }

    private void updateMatchResult(int teamGoals, int otherTeamGoals) {
        if(teamGoals > otherTeamGoals) {
            this.wins += 1;
            this.points += 3;
        }
        if(teamGoals < otherTeamGoals) {
            this.losses += 1;
        }
        if(teamGoals == otherTeamGoals) {
            this.draws += 1;
            this.points += 1;
        }
    }

    public int getTeamApiId() {
        return teamApiId;
    }
    
    public int getRank() {
    	return rank;
    }
    
    public void setRank(int rank) {
    	this.rank = rank;
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

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }

    public int getGoalsFor() {
        return goalsFor;
    }

    public void setGoalsFor(int goalsFor) {
        this.goalsFor = goalsFor;
    }

    public int getGoalsAgainst() {
        return goalsAgainst;
    }

    public void setGoalsAgainst(int goalsAgainst) {
        this.goalsAgainst = goalsAgainst;
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
                    + indent() + "    rank=" + "\"" + getRank() + "\"\n"
                    + indent() + "    goalsFor=" + "\"" + getGoalsFor() + "\"\n"
                    + indent() + "    goalsAgainst=" + "\"" + getGoalsAgainst() + "\"\n"
                    + indent() + "    goalDifference=" + "\"" + getGoalDifference() + "\"\n"
                    + indent() + "    wins=" + "\"" + getWins() + "\"\n"
                    + indent() + "    losses=" + "\"" + getLosses() + "\"\n"
                    + indent() + "    draws=" + "\"" + getDraws() + "\"\n"
                    + indent() + "    points=" + "\"" + getPoints() + "\">\n");
            writer.write(indent() + "</placements>\n");
        } catch (IOException e) {
            LOGGER.info("Exception occurred: ", e);
        }
    }

    @Override
    public String indent() {
        return "            ";
    }
}
