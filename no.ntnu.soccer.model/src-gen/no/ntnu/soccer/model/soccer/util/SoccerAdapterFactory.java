/**
 */
package no.ntnu.soccer.model.soccer.util;

import no.ntnu.soccer.model.soccer.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see no.ntnu.soccer.model.soccer.SoccerPackage
 * @generated
 */
public class SoccerAdapterFactory extends AdapterFactoryImpl {
    /**
     * The cached model package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected static SoccerPackage modelPackage;

    /**
     * Creates an instance of the adapter factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public SoccerAdapterFactory() {
        if (modelPackage == null) {
            modelPackage = SoccerPackage.eINSTANCE;
        }
    }

    /**
     * Returns whether this factory is applicable for the type of the object.
     * <!-- begin-user-doc -->
     * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
     * <!-- end-user-doc -->
     * @return whether this factory is applicable for the type of the object.
     * @generated
     */
    @Override
    public boolean isFactoryForType(Object object) {
        if (object == modelPackage) {
            return true;
        }
        if (object instanceof EObject) {
            return ((EObject) object).eClass().getEPackage() == modelPackage;
        }
        return false;
    }

    /**
     * The switch that delegates to the <code>createXXX</code> methods.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected SoccerSwitch<Adapter> modelSwitch = new SoccerSwitch<Adapter>() {
        @Override
        public Adapter caseFederation(Federation object) {
            return createFederationAdapter();
        }

        @Override
        public Adapter caseCountry(Country object) {
            return createCountryAdapter();
        }

        @Override
        public Adapter caseLeague(League object) {
            return createLeagueAdapter();
        }

        @Override
        public Adapter caseSeason(Season object) {
            return createSeasonAdapter();
        }

        @Override
        public Adapter caseMatchDay(MatchDay object) {
            return createMatchDayAdapter();
        }

        @Override
        public Adapter casePlayer(Player object) {
            return createPlayerAdapter();
        }

        @Override
        public Adapter caseTeam(Team object) {
            return createTeamAdapter();
        }

        @Override
        public Adapter casePlacement(Placement object) {
            return createPlacementAdapter();
        }

        @Override
        public Adapter caseStanding(Standing object) {
            return createStandingAdapter();
        }

        @Override
        public Adapter caseMatch(Match object) {
            return createMatchAdapter();
        }

        @Override
        public Adapter caseOpponent(Opponent object) {
            return createOpponentAdapter();
        }

        @Override
        public Adapter casePosition(Position object) {
            return createPositionAdapter();
        }

        @Override
        public Adapter defaultCase(EObject object) {
            return createEObjectAdapter();
        }
    };

    /**
     * Creates an adapter for the <code>target</code>.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param target the object to adapt.
     * @return the adapter for the <code>target</code>.
     * @generated
     */
    @Override
    public Adapter createAdapter(Notifier target) {
        return modelSwitch.doSwitch((EObject) target);
    }

    /**
     * Creates a new adapter for an object of class '{@link no.ntnu.soccer.model.soccer.Federation <em>Federation</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see no.ntnu.soccer.model.soccer.Federation
     * @generated
     */
    public Adapter createFederationAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link no.ntnu.soccer.model.soccer.Country <em>Country</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see no.ntnu.soccer.model.soccer.Country
     * @generated
     */
    public Adapter createCountryAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link no.ntnu.soccer.model.soccer.League <em>League</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see no.ntnu.soccer.model.soccer.League
     * @generated
     */
    public Adapter createLeagueAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link no.ntnu.soccer.model.soccer.Season <em>Season</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see no.ntnu.soccer.model.soccer.Season
     * @generated
     */
    public Adapter createSeasonAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link no.ntnu.soccer.model.soccer.MatchDay <em>Match Day</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see no.ntnu.soccer.model.soccer.MatchDay
     * @generated
     */
    public Adapter createMatchDayAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link no.ntnu.soccer.model.soccer.Player <em>Player</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see no.ntnu.soccer.model.soccer.Player
     * @generated
     */
    public Adapter createPlayerAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link no.ntnu.soccer.model.soccer.Team <em>Team</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see no.ntnu.soccer.model.soccer.Team
     * @generated
     */
    public Adapter createTeamAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link no.ntnu.soccer.model.soccer.Placement <em>Placement</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see no.ntnu.soccer.model.soccer.Placement
     * @generated
     */
    public Adapter createPlacementAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link no.ntnu.soccer.model.soccer.Standing <em>Standing</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see no.ntnu.soccer.model.soccer.Standing
     * @generated
     */
    public Adapter createStandingAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link no.ntnu.soccer.model.soccer.Match <em>Match</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see no.ntnu.soccer.model.soccer.Match
     * @generated
     */
    public Adapter createMatchAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link no.ntnu.soccer.model.soccer.Opponent <em>Opponent</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see no.ntnu.soccer.model.soccer.Opponent
     * @generated
     */
    public Adapter createOpponentAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link no.ntnu.soccer.model.soccer.Position <em>Position</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see no.ntnu.soccer.model.soccer.Position
     * @generated
     */
    public Adapter createPositionAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for the default case.
     * <!-- begin-user-doc -->
     * This default implementation returns null.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @generated
     */
    public Adapter createEObjectAdapter() {
        return null;
    }

} //SoccerAdapterFactory
