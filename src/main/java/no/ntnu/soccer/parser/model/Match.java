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

    @CsvBindByPosition(position = 11)
    private int homePlayerX1;
    @CsvBindByPosition(position = 12)
    private int homePlayerX2;
    @CsvBindByPosition(position = 13)
    private int homePlayerX3;
    @CsvBindByPosition(position = 14)
    private int homePlayerX4;
    @CsvBindByPosition(position = 15)
    private int homePlayerX5;
    @CsvBindByPosition(position = 16)
    private int homePlayerX6;
    @CsvBindByPosition(position = 17)
    private int homePlayerX7;
    @CsvBindByPosition(position = 18)
    private int homePlayerX8;
    @CsvBindByPosition(position = 19)
    private int homePlayerX9;
    @CsvBindByPosition(position = 20)
    private int homePlayerX10;
    @CsvBindByPosition(position = 21)
    private int homePlayerX11;
    @CsvBindByPosition(position = 22)
    private int awayPlayerX1;
    @CsvBindByPosition(position = 23)
    private int awayPlayerX2;
    @CsvBindByPosition(position = 24)
    private int awayPlayerX3;
    @CsvBindByPosition(position = 25)
    private int awayPlayerX4;
    @CsvBindByPosition(position = 26)
    private int awayPlayerX5;
    @CsvBindByPosition(position = 27)
    private int awayPlayerX6;
    @CsvBindByPosition(position = 28)
    private int awayPlayerX7;
    @CsvBindByPosition(position = 29)
    private int awayPlayerX8;
    @CsvBindByPosition(position = 30)
    private int awayPlayerX9;
    @CsvBindByPosition(position = 31)
    private int awayPlayerX10;
    @CsvBindByPosition(position = 32)
    private int awayPlayerX11;
    @CsvBindByPosition(position = 33)
    private int homePlayerY1;
    @CsvBindByPosition(position = 34)
    private int homePlayerY2;
    @CsvBindByPosition(position = 35)
    private int homePlayerY3;
    @CsvBindByPosition(position = 36)
    private int homePlayerY4;
    @CsvBindByPosition(position = 37)
    private int homePlayerY5;
    @CsvBindByPosition(position = 38)
    private int homePlayerY6;
    @CsvBindByPosition(position = 39)
    private int homePlayerY7;
    @CsvBindByPosition(position = 40)
    private int homePlayerY8;
    @CsvBindByPosition(position = 41)
    private int homePlayerY9;
    @CsvBindByPosition(position = 42)
    private int homePlayerY10;
    @CsvBindByPosition(position = 43)
    private int homePlayerY11;
    @CsvBindByPosition(position = 44)
    private int awayPlayerY1;
    @CsvBindByPosition(position = 45)
    private int awayPlayerY2;
    @CsvBindByPosition(position = 46)
    private int awayPlayerY3;
    @CsvBindByPosition(position = 47)
    private int awayPlayerY4;
    @CsvBindByPosition(position = 48)
    private int awayPlayerY5;
    @CsvBindByPosition(position = 49)
    private int awayPlayerY6;
    @CsvBindByPosition(position = 50)
    private int awayPlayerY7;
    @CsvBindByPosition(position = 51)
    private int awayPlayerY8;
    @CsvBindByPosition(position = 52)
    private int awayPlayerY9;
    @CsvBindByPosition(position = 53)
    private int awayPlayerY10;
    @CsvBindByPosition(position = 54)
    private int awayPlayerY11;
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

    public int getHomePlayerX1() {
        return homePlayerX1;
    }

    public void setHomePlayerX1(int homePlayerX1) {
        this.homePlayerX1 = homePlayerX1;
    }

    public int getHomePlayerX2() {
        return homePlayerX2;
    }

    public void setHomePlayerX2(int homePlayerX2) {
        this.homePlayerX2 = homePlayerX2;
    }

    public int getHomePlayerX3() {
        return homePlayerX3;
    }

    public void setHomePlayerX3(int homePlayerX3) {
        this.homePlayerX3 = homePlayerX3;
    }

    public int getHomePlayerX4() {
        return homePlayerX4;
    }

    public void setHomePlayerX4(int homePlayerX4) {
        this.homePlayerX4 = homePlayerX4;
    }

    public int getHomePlayerX5() {
        return homePlayerX5;
    }

    public void setHomePlayerX5(int homePlayerX5) {
        this.homePlayerX5 = homePlayerX5;
    }

    public int getHomePlayerX6() {
        return homePlayerX6;
    }

    public void setHomePlayerX6(int homePlayerX6) {
        this.homePlayerX6 = homePlayerX6;
    }

    public int getHomePlayerX7() {
        return homePlayerX7;
    }

    public void setHomePlayerX7(int homePlayerX7) {
        this.homePlayerX7 = homePlayerX7;
    }

    public int getHomePlayerX8() {
        return homePlayerX8;
    }

    public void setHomePlayerX8(int homePlayerX8) {
        this.homePlayerX8 = homePlayerX8;
    }

    public int getHomePlayerX9() {
        return homePlayerX9;
    }

    public void setHomePlayerX9(int homePlayerX9) {
        this.homePlayerX9 = homePlayerX9;
    }

    public int getHomePlayerX10() {
        return homePlayerX10;
    }

    public void setHomePlayerX10(int homePlayerX10) {
        this.homePlayerX10 = homePlayerX10;
    }

    public int getHomePlayerX11() {
        return homePlayerX11;
    }

    public void setHomePlayerX11(int homePlayerX11) {
        this.homePlayerX11 = homePlayerX11;
    }

    public int getAwayPlayerX1() {
        return awayPlayerX1;
    }

    public void setAwayPlayerX1(int awayPlayerX1) {
        this.awayPlayerX1 = awayPlayerX1;
    }

    public int getAwayPlayerX2() {
        return awayPlayerX2;
    }

    public void setAwayPlayerX2(int awayPlayerX2) {
        this.awayPlayerX2 = awayPlayerX2;
    }

    public int getAwayPlayerX3() {
        return awayPlayerX3;
    }

    public void setAwayPlayerX3(int awayPlayerX3) {
        this.awayPlayerX3 = awayPlayerX3;
    }

    public int getAwayPlayerX4() {
        return awayPlayerX4;
    }

    public void setAwayPlayerX4(int awayPlayerX4) {
        this.awayPlayerX4 = awayPlayerX4;
    }

    public int getAwayPlayerX5() {
        return awayPlayerX5;
    }

    public void setAwayPlayerX5(int awayPlayerX5) {
        this.awayPlayerX5 = awayPlayerX5;
    }

    public int getAwayPlayerX6() {
        return awayPlayerX6;
    }

    public void setAwayPlayerX6(int awayPlayerX6) {
        this.awayPlayerX6 = awayPlayerX6;
    }

    public int getAwayPlayerX7() {
        return awayPlayerX7;
    }

    public void setAwayPlayerX7(int awayPlayerX7) {
        this.awayPlayerX7 = awayPlayerX7;
    }

    public int getAwayPlayerX8() {
        return awayPlayerX8;
    }

    public void setAwayPlayerX8(int awayPlayerX8) {
        this.awayPlayerX8 = awayPlayerX8;
    }

    public int getAwayPlayerX9() {
        return awayPlayerX9;
    }

    public void setAwayPlayerX9(int awayPlayerX9) {
        this.awayPlayerX9 = awayPlayerX9;
    }

    public int getAwayPlayerX10() {
        return awayPlayerX10;
    }

    public void setAwayPlayerX10(int awayPlayerX10) {
        this.awayPlayerX10 = awayPlayerX10;
    }

    public int getAwayPlayerX11() {
        return awayPlayerX11;
    }

    public void setAwayPlayerX11(int awayPlayerX11) {
        this.awayPlayerX11 = awayPlayerX11;
    }

    public int getHomePlayerY1() {
        return homePlayerY1;
    }

    public void setHomePlayerY1(int homePlayerY1) {
        this.homePlayerY1 = homePlayerY1;
    }

    public int getHomePlayerY2() {
        return homePlayerY2;
    }

    public void setHomePlayerY2(int homePlayerY2) {
        this.homePlayerY2 = homePlayerY2;
    }

    public int getHomePlayerY3() {
        return homePlayerY3;
    }

    public void setHomePlayerY3(int homePlayerY3) {
        this.homePlayerY3 = homePlayerY3;
    }

    public int getHomePlayerY4() {
        return homePlayerY4;
    }

    public void setHomePlayerY4(int homePlayerY4) {
        this.homePlayerY4 = homePlayerY4;
    }

    public int getHomePlayerY5() {
        return homePlayerY5;
    }

    public void setHomePlayerY5(int homePlayerY5) {
        this.homePlayerY5 = homePlayerY5;
    }

    public int getHomePlayerY6() {
        return homePlayerY6;
    }

    public void setHomePlayerY6(int homePlayerY6) {
        this.homePlayerY6 = homePlayerY6;
    }

    public int getHomePlayerY7() {
        return homePlayerY7;
    }

    public void setHomePlayerY7(int homePlayerY7) {
        this.homePlayerY7 = homePlayerY7;
    }

    public int getHomePlayerY8() {
        return homePlayerY8;
    }

    public void setHomePlayerY8(int homePlayerY8) {
        this.homePlayerY8 = homePlayerY8;
    }

    public int getHomePlayerY9() {
        return homePlayerY9;
    }

    public void setHomePlayerY9(int homePlayerY9) {
        this.homePlayerY9 = homePlayerY9;
    }

    public int getHomePlayerY10() {
        return homePlayerY10;
    }

    public void setHomePlayerY10(int homePlayerY10) {
        this.homePlayerY10 = homePlayerY10;
    }

    public int getHomePlayerY11() {
        return homePlayerY11;
    }

    public void setHomePlayerY11(int homePlayerY11) {
        this.homePlayerY11 = homePlayerY11;
    }

    public int getAwayPlayerY1() {
        return awayPlayerY1;
    }

    public void setAwayPlayerY1(int awayPlayerY1) {
        this.awayPlayerY1 = awayPlayerY1;
    }

    public int getAwayPlayerY2() {
        return awayPlayerY2;
    }

    public void setAwayPlayerY2(int awayPlayerY2) {
        this.awayPlayerY2 = awayPlayerY2;
    }

    public int getAwayPlayerY3() {
        return awayPlayerY3;
    }

    public void setAwayPlayerY3(int awayPlayerY3) {
        this.awayPlayerY3 = awayPlayerY3;
    }

    public int getAwayPlayerY4() {
        return awayPlayerY4;
    }

    public void setAwayPlayerY4(int awayPlayerY4) {
        this.awayPlayerY4 = awayPlayerY4;
    }

    public int getAwayPlayerY5() {
        return awayPlayerY5;
    }

    public void setAwayPlayerY5(int awayPlayerY5) {
        this.awayPlayerY5 = awayPlayerY5;
    }

    public int getAwayPlayerY6() {
        return awayPlayerY6;
    }

    public void setAwayPlayerY6(int awayPlayerY6) {
        this.awayPlayerY6 = awayPlayerY6;
    }

    public int getAwayPlayerY7() {
        return awayPlayerY7;
    }

    public void setAwayPlayerY7(int awayPlayerY7) {
        this.awayPlayerY7 = awayPlayerY7;
    }

    public int getAwayPlayerY8() {
        return awayPlayerY8;
    }

    public void setAwayPlayerY8(int awayPlayerY8) {
        this.awayPlayerY8 = awayPlayerY8;
    }

    public int getAwayPlayerY9() {
        return awayPlayerY9;
    }

    public void setAwayPlayerY9(int awayPlayerY9) {
        this.awayPlayerY9 = awayPlayerY9;
    }

    public int getAwayPlayerY10() {
        return awayPlayerY10;
    }

    public void setAwayPlayerY10(int awayPlayerY10) {
        this.awayPlayerY10 = awayPlayerY10;
    }

    public int getAwayPlayerY11() {
        return awayPlayerY11;
    }

    public void setAwayPlayerY11(int awayPlayerY11) {
        this.awayPlayerY11 = awayPlayerY11;
    }
}
