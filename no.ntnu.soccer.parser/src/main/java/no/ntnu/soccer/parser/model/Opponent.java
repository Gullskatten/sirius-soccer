package no.ntnu.soccer.parser.model;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.BufferedWriter;
import java.io.IOException;
import java.util.function.Function;

public class Opponent implements XmiParsable {
    private static final Logger LOGGER = LoggerFactory.getLogger(Opponent.class);
    private final String teamType;
    private final int teamApiId;

    public Opponent(Team originalTeam, String teamType) {
        this.teamApiId = originalTeam.getTeamApiId();
        this.teamType = teamType;
    }

    @Override
    public void toXmi(BufferedWriter writer, Function<Void, Void> childrenFunction) {
        try {
            writer.write(indent() + "<opponents\n"
                    + indent() + "team=" + "\""  + getTeamApiId() + "\"\n"
                    + indent() + "opponentType=" + "\""  + teamType + "\"/>\n");
        } catch (IOException e) {
            LOGGER.info("Exception occurred: ",e);
        }
    }

    @Override
    public String indent() {
        return "              ";
    }

    public String getTeamType() {
        return teamType;
    }

    public int getTeamApiId() {
        return teamApiId;
    }
}
