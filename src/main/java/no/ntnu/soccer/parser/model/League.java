package no.ntnu.soccer.parser.model;

import com.opencsv.bean.CsvBindByPosition;

public class League {
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
}
