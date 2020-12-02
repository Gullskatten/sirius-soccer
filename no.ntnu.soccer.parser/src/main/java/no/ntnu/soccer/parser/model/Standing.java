package no.ntnu.soccer.parser.model;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.BufferedWriter;
import java.io.IOException;
import java.util.function.Function;

public class Standing implements XmiParsable {
    private static final Logger LOGGER = LoggerFactory.getLogger(Standing.class);

    @Override
    public void toXmi(BufferedWriter writer, Function<Void, Void> childrenFunction) {
        try {
            writer.write(indent() + "<standing");

            if(childrenFunction != null) {
                writer.write(">\n");
                childrenFunction.apply(null);
                writer.write(indent() + "</standing>\n");
            } else {
                writer.write("/>\n");

            }
        } catch (IOException e) {
            LOGGER.info("Exception occurred: ",e);
        }
    }

    @Override
    public String indent() {
        return "          ";
    }
}
