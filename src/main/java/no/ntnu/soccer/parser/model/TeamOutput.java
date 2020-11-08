package no.ntnu.soccer.parser.model;

import org.apache.commons.lang3.StringUtils;
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
            writer.write("<team \n"
                    + "id=" + "\""  + getId() + "\"\n"
                    + "teamType=" + "\""  + teamType + "\"\n"
                    + "shortName=" + "\""  + getShortName() + "\"\n"
                    + "teamName=" + "\""  + getTeamName() + "\"\n");

            if(childrenFunction != null) {
                writer.write(">\n");
                childrenFunction.apply(null);
                writer.write("</team>");
            } else {
                writer.write("/>\n");

            }
        } catch (IOException e) {
            LOGGER.info("Exception occurred: ",e);
        }
    }
}
