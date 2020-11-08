package no.ntnu.soccer.parser.model;

import com.opencsv.bean.CsvBindByPosition;

public class Player {
    public static final String RESOURCE_CSV_FILE = "players.csv";
    public static final String CSV_DELIMITER = ";";

    @CsvBindByPosition(position = 0)
    private int id;

    @CsvBindByPosition(position = 2)
    private String name;

    @CsvBindByPosition(position = 5)
    private int height;

    @CsvBindByPosition(position = 6)
    private int weight;

    public Player() {
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

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
}
