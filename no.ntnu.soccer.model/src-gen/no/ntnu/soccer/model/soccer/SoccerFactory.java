/**
 */
package no.ntnu.soccer.model.soccer;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see no.ntnu.soccer.model.soccer.SoccerPackage
 * @generated
 */
public interface SoccerFactory extends EFactory {
    /**
     * The singleton instance of the factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    SoccerFactory eINSTANCE = no.ntnu.soccer.model.soccer.impl.SoccerFactoryImpl.init();

    /**
     * Returns a new object of class '<em>Federation</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Federation</em>'.
     * @generated
     */
    Federation createFederation();

    /**
     * Returns a new object of class '<em>Country</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Country</em>'.
     * @generated
     */
    Country createCountry();

    /**
     * Returns a new object of class '<em>League</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>League</em>'.
     * @generated
     */
    League createLeague();

    /**
     * Returns a new object of class '<em>Season</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Season</em>'.
     * @generated
     */
    Season createSeason();

    /**
     * Returns a new object of class '<em>Match Day</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Match Day</em>'.
     * @generated
     */
    MatchDay createMatchDay();

    /**
     * Returns a new object of class '<em>Player</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Player</em>'.
     * @generated
     */
    Player createPlayer();

    /**
     * Returns a new object of class '<em>Team</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Team</em>'.
     * @generated
     */
    Team createTeam();

    /**
     * Returns a new object of class '<em>Placement</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Placement</em>'.
     * @generated
     */
    Placement createPlacement();

    /**
     * Returns a new object of class '<em>Standing</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Standing</em>'.
     * @generated
     */
    Standing createStanding();

    /**
     * Returns a new object of class '<em>Match</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Match</em>'.
     * @generated
     */
    Match createMatch();

    /**
     * Returns a new object of class '<em>Opponent</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Opponent</em>'.
     * @generated
     */
    Opponent createOpponent();

    /**
     * Returns a new object of class '<em>Position</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Position</em>'.
     * @generated
     */
    Position createPosition();

    /**
     * Returns the package supported by this factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the package supported by this factory.
     * @generated
     */
    SoccerPackage getSoccerPackage();

} //SoccerFactory
