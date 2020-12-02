package no.ntnu.soccer.parser.model;

import com.opencsv.bean.CsvBindByPosition;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.BufferedWriter;
import java.io.IOException;
import java.util.List;
import java.util.function.Function;

public class Team implements XmiParsable {
    private static final Logger LOGGER = LoggerFactory.getLogger(Team.class);
    public static final String RESOURCE_CSV_FILE = "teams.csv";
    public static final String CSV_DELIMITER = ",";

    @CsvBindByPosition(position = 0)
    private int id;

    @CsvBindByPosition(position = 1)
    private int teamApiId;

    @CsvBindByPosition(position = 3)
    private String teamName;

    @CsvBindByPosition(position = 4)
    private String shortName;

    private List<Player> players;

    public Team() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public String getShortName() {
        return shortName;
    }

    public void setShortName(String shortName) {
        this.shortName = shortName;
    }

    public int getTeamApiId() {
        return teamApiId;
    }

    public void setTeamApiId(int teamApiId) {
        this.teamApiId = teamApiId;
    }

    @Override
    public void toXmi(BufferedWriter writer, Function<Void, Void> childrenFunction) {
        try {
            writer.write(indent() + "<team \n"
                    + indent() + " name=" + "\""  + teamName + "\"\n"
                    + indent() + " shortName=" + "\""  + shortName + "\"\n"
                    + indent() + " id=" + "\""  + teamApiId + "\""
            );

            if(childrenFunction != null) {
                writer.write(">\n");
                childrenFunction.apply(null);
                writer.write(indent() + "</team>\n");
            } else {
                writer.write("/>\n");

            }
        } catch (IOException e) {
            LOGGER.info("Exception occurred: ",e);
        }
    }

    @Override
    public String indent() {
        return "    ";
    }

    public List<Player> getPlayers() {
        return players;
    }

    public void setPlayers(List<Player> players) {
        this.players = players;
    }
}
