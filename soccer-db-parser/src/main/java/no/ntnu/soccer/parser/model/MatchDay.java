package no.ntnu.soccer.parser.model;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.BufferedWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.function.Function;

public class MatchDay implements XmiParsable {
    private static final Logger LOGGER = LoggerFactory.getLogger(MatchDay.class);
    private static final DateTimeFormatter fmt = DateTimeFormatter.ofPattern("yyyy-MM-dd");
    private String league;
    private String season;
    private LocalDate matchDate;

    public MatchDay() {
        // default empty constructor
    }

    public MatchDay(String season, LocalDate day, String league) {
        this.matchDate = day;
        this.season = season;
        this.league = league;
    }

    @Override
    public void toXmi(BufferedWriter writer, Function<Void, Void> childrenFunction) {

        try {
            writer.write(indent() + "<matchDay \n"
                    + indent() + " date=" + "\""  + getMatchDate().format(fmt) + "\""
                   );
            if(childrenFunction != null) {
                writer.write(">\n");
                childrenFunction.apply(null);
                writer.write(indent() + "</matchDay>\n");
            } else {
                writer.write("/>\n");

            }
        } catch (IOException e) {
            LOGGER.info("Exception occurred: ", e);
        }
    }
    @Override
    public String indent() {
        return "          ";
    }

    public LocalDate getMatchDate() {
        return matchDate;
    }

    public void setMatchDate(LocalDate matchDate) {
        this.matchDate = matchDate;
    }

    public String getSeason() {
        return season;
    }

    public void setSeason(String season) {
        this.season = season;
    }

    public String getLeague() {
        return league;
    }

    public void setLeague(String league) {
        this.league = league;
    }
}
