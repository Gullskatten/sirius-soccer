package no.ntnu.soccer.parser.model;

import com.opencsv.bean.CsvBindByPosition;
import com.opencsv.bean.CsvCustomBindByPosition;

import java.time.LocalDate;

public class Match {
    public static final String RESOURCE_CSV_FILE = "matches.csv";
    public static final String CSV_DELIMITER = ",";

    @CsvBindByPosition(position = 0)
    private int id;
    @CsvBindByPosition(position = 1)
    private int countryId;
    @CsvBindByPosition(position = 2)
    private int leagueId;
    @CsvBindByPosition(position = 3)
    private String season;
    @CsvCustomBindByPosition(converter = LocalDateConverter.class, position = 5)
    private LocalDate date;
    @CsvBindByPosition(position = 7)
    private int homeTeamApiId;
    @CsvBindByPosition(position = 8)
    private int awayTeamApiId;
    @CsvBindByPosition(position = 9)
    private int homeTeamGoal;
    @CsvBindByPosition(position = 10)
    private int awayTeamGoal;
    @CsvBindByPosition(position = 55)
    private int homePlayer1;
    @CsvBindByPosition(position = 56)
    private int homePlayer2;
    @CsvBindByPosition(position = 57)
    private int homePlayer3;
    @CsvBindByPosition(position = 58)
    private int homePlayer4;
    @CsvBindByPosition(position = 59)
    private int homePlayer5;
    @CsvBindByPosition(position = 60)
    private int homePlayer6;
    @CsvBindByPosition(position = 61)
    private int homePlayer7;
    @CsvBindByPosition(position = 62)
    private int homePlayer8;
    @CsvBindByPosition(position = 63)
    private int homePlayer9;
    @CsvBindByPosition(position = 64)
    private int homePlayer10;
    @CsvBindByPosition(position = 65)
    private int homePlayer11;
    @CsvBindByPosition(position = 66)
    private int awayPlayer1;
    @CsvBindByPosition(position = 67)
    private int awayPlayer2;
    @CsvBindByPosition(position = 68)
    private int awayPlayer3;
    @CsvBindByPosition(position = 69)
    private int awayPlayer4;
    @CsvBindByPosition(position = 70)
    private int awayPlayer5;
    @CsvBindByPosition(position = 71)
    private int awayPlayer6;
    @CsvBindByPosition(position = 72)
    private int awayPlayer7;
    @CsvBindByPosition(position = 73)
    private int awayPlayer8;
    @CsvBindByPosition(position = 74)
    private int awayPlayer9;
    @CsvBindByPosition(position = 75)
    private int awayPlayer10;
    @CsvBindByPosition(position = 76)
    private int awayPlayer11;

    public Match() {
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

    public int getLeagueId() {
        return leagueId;
    }

    public void setLeagueId(int leagueId) {
        this.leagueId = leagueId;
    }

    public String getSeason() {
        return season;
    }

    public void setSeason(String season) {
        this.season = season;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public int getHomeTeamApiId() {
        return homeTeamApiId;
    }

    public void setHomeTeamApiId(int homeTeamApiId) {
        this.homeTeamApiId = homeTeamApiId;
    }

    public int getAwayTeamApiId() {
        return awayTeamApiId;
    }

    public void setAwayTeamApiId(int awayTeamApiId) {
        this.awayTeamApiId = awayTeamApiId;
    }

    public int getHomeTeamGoal() {
        return homeTeamGoal;
    }

    public void setHomeTeamGoal(int homeTeamGoal) {
        this.homeTeamGoal = homeTeamGoal;
    }

    public int getAwayTeamGoal() {
        return awayTeamGoal;
    }

    public void setAwayTeamGoal(int awayTeamGoal) {
        this.awayTeamGoal = awayTeamGoal;
    }

    public int getHomePlayer1() {
        return homePlayer1;
    }

    public void setHomePlayer1(int homePlayer1) {
        this.homePlayer1 = homePlayer1;
    }

    public int getHomePlayer2() {
        return homePlayer2;
    }

    public void setHomePlayer2(int homePlayer2) {
        this.homePlayer2 = homePlayer2;
    }

    public int getHomePlayer3() {
        return homePlayer3;
    }

    public void setHomePlayer3(int homePlayer3) {
        this.homePlayer3 = homePlayer3;
    }

    public int getHomePlayer4() {
        return homePlayer4;
    }

    public void setHomePlayer4(int homePlayer4) {
        this.homePlayer4 = homePlayer4;
    }

    public int getHomePlayer5() {
        return homePlayer5;
    }

    public void setHomePlayer5(int homePlayer5) {
        this.homePlayer5 = homePlayer5;
    }

    public int getHomePlayer6() {
        return homePlayer6;
    }

    public void setHomePlayer6(int homePlayer6) {
        this.homePlayer6 = homePlayer6;
    }

    public int getHomePlayer7() {
        return homePlayer7;
    }

    public void setHomePlayer7(int homePlayer7) {
        this.homePlayer7 = homePlayer7;
    }

    public int getHomePlayer8() {
        return homePlayer8;
    }

    public void setHomePlayer8(int homePlayer8) {
        this.homePlayer8 = homePlayer8;
    }

    public int getHomePlayer9() {
        return homePlayer9;
    }

    public void setHomePlayer9(int homePlayer9) {
        this.homePlayer9 = homePlayer9;
    }

    public int getHomePlayer10() {
        return homePlayer10;
    }

    public void setHomePlayer10(int homePlayer10) {
        this.homePlayer10 = homePlayer10;
    }

    public int getHomePlayer11() {
        return homePlayer11;
    }

    public void setHomePlayer11(int homePlayer11) {
        this.homePlayer11 = homePlayer11;
    }

    public int getAwayPlayer1() {
        return awayPlayer1;
    }

    public void setAwayPlayer1(int awayPlayer1) {
        this.awayPlayer1 = awayPlayer1;
    }

    public int getAwayPlayer2() {
        return awayPlayer2;
    }

    public void setAwayPlayer2(int awayPlayer2) {
        this.awayPlayer2 = awayPlayer2;
    }

    public int getAwayPlayer3() {
        return awayPlayer3;
    }

    public void setAwayPlayer3(int awayPlayer3) {
        this.awayPlayer3 = awayPlayer3;
    }

    public int getAwayPlayer4() {
        return awayPlayer4;
    }

    public void setAwayPlayer4(int awayPlayer4) {
        this.awayPlayer4 = awayPlayer4;
    }

    public int getAwayPlayer5() {
        return awayPlayer5;
    }

    public void setAwayPlayer5(int awayPlayer5) {
        this.awayPlayer5 = awayPlayer5;
    }

    public int getAwayPlayer6() {
        return awayPlayer6;
    }

    public void setAwayPlayer6(int awayPlayer6) {
        this.awayPlayer6 = awayPlayer6;
    }

    public int getAwayPlayer7() {
        return awayPlayer7;
    }

    public void setAwayPlayer7(int awayPlayer7) {
        this.awayPlayer7 = awayPlayer7;
    }

    public int getAwayPlayer8() {
        return awayPlayer8;
    }

    public void setAwayPlayer8(int awayPlayer8) {
        this.awayPlayer8 = awayPlayer8;
    }

    public int getAwayPlayer9() {
        return awayPlayer9;
    }

    public void setAwayPlayer9(int awayPlayer9) {
        this.awayPlayer9 = awayPlayer9;
    }

    public int getAwayPlayer10() {
        return awayPlayer10;
    }

    public void setAwayPlayer10(int awayPlayer10) {
        this.awayPlayer10 = awayPlayer10;
    }

    public int getAwayPlayer11() {
        return awayPlayer11;
    }

    public void setAwayPlayer11(int awayPlayer11) {
        this.awayPlayer11 = awayPlayer11;
    }
}
