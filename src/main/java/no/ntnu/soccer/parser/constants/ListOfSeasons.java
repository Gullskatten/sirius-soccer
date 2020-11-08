package no.ntnu.soccer.parser.constants;

import no.ntnu.soccer.parser.model.Season;

import java.util.Arrays;
import java.util.List;

public class ListOfSeasons {

    public static final List<Season> ALL_SEASONS = Arrays.asList(
            new Season("2015/2016"),
            new Season("2014/2015"),
            new Season("2013/2014"),
            new Season("2012/2013"),
            new Season("2011/2012"),
            new Season("2010/2011"),
            new Season("2009/2010"),
            new Season("2008/2009")

    );
}
