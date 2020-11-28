package no.ntnu.soccer.parser.model;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.BufferedWriter;
import java.io.IOException;
import java.util.function.Function;

public class Season implements XmiParsable {
    private static final Logger LOGGER = LoggerFactory.getLogger(Season.class);
    private String seasonName;

    public Season(String seasonName) {
        this.seasonName = seasonName;
    }

    public String getSeasonName() {
        return seasonName;
    }

    public void setSeasonName(String seasonName) {
        this.seasonName = seasonName;
    }

    @Override
    public void toXmi(BufferedWriter writer, Function<Void, Void> childrenFunction) {
        try {
            writer.write(indent() + "<season \n"
                    + indent() + " seasonName=" + "\""  + seasonName + "\""
            );

            if(childrenFunction != null) {
                writer.write(">\n");
                childrenFunction.apply(null);
                writer.write(indent() + "</season>\n");
            } else {
                writer.write("/>\n");

            }
        } catch (IOException e) {
            LOGGER.info("Exception occurred: ",e);
        }
    }

    @Override
    public String indent() {
        return "        ";
    }
}
