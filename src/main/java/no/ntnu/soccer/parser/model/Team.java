package no.ntnu.soccer.parser.model;

import com.opencsv.bean.CsvBindByPosition;

public class Team {
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
}
