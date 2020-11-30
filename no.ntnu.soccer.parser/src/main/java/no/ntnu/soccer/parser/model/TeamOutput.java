package no.ntnu.soccer.parser.model;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.BufferedWriter;
import java.io.IOException;
import java.util.function.Function;

public class TeamOutput extends Team implements XmiParsable {
    private static final Logger LOGGER = LoggerFactory.getLogger(Team.class);
    private final String teamType;

    public TeamOutput(Team originalTeam, String teamType) {
        setId(originalTeam.getId());
        setShortName(originalTeam.getShortName());
        setTeamName(originalTeam.getTeamName());
        this.teamType = teamType;
    }


    @Override
    public void toXmi(BufferedWriter writer, Function<Void, Void> childrenFunction) {
        try {
            writer.write(indent() + "<opponent\n"
                    + indent() + "opponentType=" + "\""  + teamType + "\">\n");

            writer.write(indent() + "<team\n"
                    + indent() + " id=" + "\""  + getId() + "\"\n"
                    + indent() + " shortName=" + "\""  + getShortName() + "\"\n"
                    + indent() + " teamName=" + "\""  + getTeamName() + "\"");

            if(childrenFunction != null) {
                writer.write(">\n");
                childrenFunction.apply(null);
                writer.write(indent() + "</team>\n");
                writer.write(indent() + "</opponent>\n");
            } else {
                writer.write("/>\n");
                writer.write("</opponent>\n");

            }
        } catch (IOException e) {
            LOGGER.info("Exception occurred: ",e);
        }
    }

    @Override
    public String indent() {
        return "              ";
    }

}
