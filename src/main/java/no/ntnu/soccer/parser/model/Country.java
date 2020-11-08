package no.ntnu.soccer.parser.model;

import com.opencsv.bean.CsvBindByPosition;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.BufferedWriter;
import java.io.IOException;
import java.util.function.Function;

public class Country implements XmiParsable {
    private static final Logger LOGGER = LoggerFactory.getLogger(Country.class);

    public static final String RESOURCE_CSV_FILE = "countries.csv";
    public static final String CSV_DELIMITER = ";";

    @CsvBindByPosition(position = 0)
    private int id;

    @CsvBindByPosition(position = 1)
    private String name;

    public Country() {
        // Empty default constructor
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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
            writer.write("<country "
                    + "id=" + "\""  + id + "\""+ "\n"
                    + "name=" + "\""  + name + "\""+ "\n"
                    + ">");

            if(childrenFunction != null) {
                writer.write(">\n");
                childrenFunction.apply(null);
                writer.write("</country>\n");
            } else {
                writer.write("/>\n");
            }
        } catch (IOException e) {
            LOGGER.info("Exception occurred: ",e);
        }
    }
}
