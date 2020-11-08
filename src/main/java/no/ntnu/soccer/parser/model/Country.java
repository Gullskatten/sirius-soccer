package no.ntnu.soccer.parser.model;

import com.opencsv.bean.CsvBindByPosition;

public class Country implements XmiParsable {

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
    public String toXmi(String children) {
        return "<country "
                + "id=" + getId()
                + "name=" + getName()
                + ">"
                + children
                + "</country>";
    }
}
