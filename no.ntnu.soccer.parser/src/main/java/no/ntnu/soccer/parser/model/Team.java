package no.ntnu.soccer.parser.model;

import com.opencsv.bean.CsvBindByPosition;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.BufferedWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Team implements XmiParsable {
    private static final Logger LOGGER = LoggerFactory.getLogger(Team.class);
    public static final String RESOURCE_CSV_FILE = "teams.csv";
    public static final String CSV_DELIMITER = ",";

    @CsvBindByPosition(position = 0)
    private int id;

    @CsvBindByPosition(position = 1)
    private int apiId;

    @CsvBindByPosition(position = 3)
    private String name;

    @CsvBindByPosition(position = 4)
    private String shortName;

    private List<Player> players;
    private List<Placement> placements;

    public Team() {
        this.placements = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTeamName() {
        return name;
    }

    public void setTeamName(String name) {
        this.name = name;
    }

    public String getShortName() {
        return shortName;
    }

    public void setShortName(String shortName) {
        this.shortName = shortName;
    }

    public int getTeamApiId() {
        return apiId;
    }

    public void setTeamApiId(int apiId) {
        this.apiId = apiId;
    }

    @Override
    public void toXmi(BufferedWriter writer, Function<Void, Void> childrenFunction) {
        try {
            writer.write(indent() + "<teams\n"
                    + indent() + "    name=" + "\""  + name + "\"\n"
                    + indent() + "    shortName=" + "\""  + shortName + "\"\n"
                    + indent() + "    placements=" + "\""  + placements.stream().map(Placement::getId).collect(Collectors.joining(" ")) + "\"\n"
                    + indent() + "    id=" + "\""  + apiId + "\""
            );

            if(childrenFunction != null) {
                writer.write(">\n");
                childrenFunction.apply(null);
                writer.write(indent() + "</teams>\n");
            } else {
                writer.write("/>\n");

            }
        } catch (IOException e) {
            LOGGER.info("Exception occurred: ",e);
        }
    }

    @Override
    public String indent() {
        return "      ";
    }

    public List<Player> getPlayers() {
        return players;
    }

    public void setPlayers(List<Player> players) {
        this.players = players;
    }

    public List<Placement> getPlacements() {
        return placements;
    }

    public void setPlacements(List<Placement> placements) {
        this.placements = placements;
    }

    public void addPlacement(Placement placement) {

        if(placements == null) {
            this.placements = new ArrayList<>();
        }

        this.placements.add(placement);
    }
}
