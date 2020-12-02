package no.ntnu.soccer.parser.model;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.BufferedWriter;
import java.io.IOException;
import java.util.function.Function;

public class Season implements XmiParsable {
    private static final Logger LOGGER = LoggerFactory.getLogger(Season.class);
    private String name;

    public Season(String name) {
        this.name = name;
    }

    public String getSeasonName() {
        return name;
    }

    public void setSeasonName(String name) {
        this.name = name;
    }

    @Override
    public void toXmi(BufferedWriter writer, Function<Void, Void> childrenFunction) {
        try {
            writer.write(indent() + "<seasons\n"
                    + indent() + " name=" + "\""  + name + "\""
            );

            if(childrenFunction != null) {
                writer.write(">\n");
                childrenFunction.apply(null);
                writer.write(indent() + "</seasons>\n");
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
