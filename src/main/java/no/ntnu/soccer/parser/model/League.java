package no.ntnu.soccer.parser.model;

import com.opencsv.bean.CsvBindByPosition;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.BufferedWriter;
import java.io.IOException;
import java.util.function.Function;

public class League implements XmiParsable {
    private static final Logger LOGGER = LoggerFactory.getLogger(League.class);

    public static final String RESOURCE_CSV_FILE = "leagues.csv";
    public static final String CSV_DELIMITER = ";";

    @CsvBindByPosition(position = 0)
    private int id;
    @CsvBindByPosition(position = 1)
    private int countryId;
    @CsvBindByPosition(position = 2)
    private String name;

    public League() {
        // Empty default constructor
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCountryId() {
        return countryId;
    }

    public void setCountryId(int countryId) {
        this.countryId = countryId;
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
            writer.write("<league " + "\n"
                    + "id=" + "\""  + id + "\""+ "\n"
                    + "name=" + "\""  + name + "\""+ "\n");

            if(childrenFunction != null) {
                writer.write(">\n");
                childrenFunction.apply(null);
                writer.write("</league>\n");
            } else {
                writer.write("/>\n");
            }
        } catch (IOException e) {
            LOGGER.info("Exception occurred: ",e);
        }
    }
}
