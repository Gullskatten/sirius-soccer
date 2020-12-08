package no.ntnu.soccer.parser.model;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.BufferedWriter;
import java.io.IOException;
import java.util.function.Function;

/**
 * "Artificial" top-level entity for our e-core model
 */
public class Federation implements XmiParsable {
    private static final Logger LOGGER = LoggerFactory.getLogger(Federation.class);
    private String name;

    public Federation(String name) {
    this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void toXmi(BufferedWriter writer, Function<Void, Void> childrenFunction) {
        try {
            writer.write("<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n" +
                    "<soccer:Federation\n" +
                    "    xmi:version=\"2.0\"\n" +
                    "    xmlns:xmi=\"http://www.omg.org/XMI\"\n" +
                    "    xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"\n" +
                    "    xmlns:soccer=\"platform:/plugin/no.ntnu.soccer.model/model/soccer.ecore\"\n" +
                    "    name=\"" + getName() + "\"");

            if(childrenFunction != null) {
                writer.write(">\n");
                childrenFunction.apply(null);
                writer.write("</soccer:Federation>");
            } else {
                writer.write("/>\n");

            }
        } catch (IOException e) {
            LOGGER.info("Exception occurred: ",e);
        }
    }

    @Override
    public String indent() {
        return "";
    }
}
