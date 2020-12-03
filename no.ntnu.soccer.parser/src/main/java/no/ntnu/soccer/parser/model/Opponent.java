package no.ntnu.soccer.parser.model;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.BufferedWriter;
import java.io.IOException;
import java.util.function.Function;

public class Opponent implements XmiParsable {
    private static final Logger LOGGER = LoggerFactory.getLogger(Opponent.class);
    private final Team team;
    private final String type;

    public Opponent(Team team, String type) {
        this.team = team;
        this.type = type;
    }

    @Override
    public void toXmi(BufferedWriter writer, Function<Void, Void> childrenFunction) {
        try {
            writer.write(indent() + "<opponents\n"
                    + indent() + "    team=" + "\""  + team.getTeamApiId() + "\"\n"
                    + indent() + "    type=" + "\""  + type + "\"");

            if(childrenFunction != null) {
                writer.write(">\n");
                childrenFunction.apply(null);
                writer.write(indent() + "</opponents>\n");
            } else {
                writer.write("/>\n");

            }
        } catch (IOException e) {
            LOGGER.info("Exception occurred: ",e);
        }
    }

    @Override
    public String indent() {
        return "            ";
    }

    public Team getTeam() {
        return team;
    }

    public String getType() {
        return type;
    }
}
