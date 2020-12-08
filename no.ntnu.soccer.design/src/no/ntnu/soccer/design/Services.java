package no.ntnu.soccer.design;

import java.util.stream.Collectors;

import org.eclipse.emf.ecore.EObject;

import no.ntnu.soccer.model.soccer.Match;
import no.ntnu.soccer.model.soccer.Placement;
import no.ntnu.soccer.model.soccer.Position;

/**
 * The services class used by VSM.
 */
public class Services {

    static final String FIRST_PLACE = "\uD83E\uDD47";
    static final String SECOND_PLACE = "\uD83E\uDD48";
    static final String THRID_PLACE = "\uD83E\uDD49";
    static final String SOCCER_BALL = "\u26BD";
    static final String COLD_SWEAT = "\uD83D\uDE30";
    static final String THUMB_DOWN = "\uD83D\uDC4E";

    static final int NUM_RELAGATING = 3;
    static final boolean HAS_PLAYOFF = true;

    /**
     * See
     * http://help.eclipse.org/neon/index.jsp?topic=%2Forg.eclipse.sirius.doc%2Fdoc%2Findex.html&cp=24
     * for documentation on how to write service methods.
     */
    public EObject myService(EObject self, String arg) {
        // TODO Auto-generated code
        return self;
    }

    public int getNumberOfTeams(Placement placement) {
        return placement.getStanding().getPlacements().size();
    }

    public boolean willRelegate(Placement placement) {
        return placement.getRank() > getNumberOfTeams(placement) - NUM_RELAGATING;
    }

    public boolean needsPlayoff(Placement placement) {
        return HAS_PLAYOFF && placement.getRank() == getNumberOfTeams(placement) - NUM_RELAGATING;
    }

    public String getEmoji(Placement placement) {
        int rank = placement.getRank();
        int playoff = getNumberOfTeams(placement) - NUM_RELAGATING;

        if (HAS_PLAYOFF && rank == playoff) {
            return COLD_SWEAT;
        } else if (rank > playoff) {
            return THUMB_DOWN;
        }

        switch (rank) {
        case 1:
            return FIRST_PLACE;
        case 2:
            return SECOND_PLACE;
        case 3:
            return THRID_PLACE;
        case 4:
            return SOCCER_BALL;
        default:
            return "";
        }
    }

    public String getMatchName(Match match) {
        return match.getOpponents()
                .stream().map(opp -> opp.getTeam().getShortName())
                .collect(Collectors.joining(" vs "));
    }

    public boolean positionsNotFilled(Position posistion) {
        int numPlayers = posistion.getPlayers().size();
        switch (posistion.getType()) {
        case KEEPER:
            return numPlayers != 1;
        case DEFENCE:
        case MIDFIELD:
        case FORWARD:
            return numPlayers > 2;
        }
        return false;
    }
}
