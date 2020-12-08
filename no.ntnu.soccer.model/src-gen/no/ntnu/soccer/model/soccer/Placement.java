/**
 */
package no.ntnu.soccer.model.soccer;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Placement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link no.ntnu.soccer.model.soccer.Placement#getRank <em>Rank</em>}</li>
 *   <li>{@link no.ntnu.soccer.model.soccer.Placement#getWins <em>Wins</em>}</li>
 *   <li>{@link no.ntnu.soccer.model.soccer.Placement#getDraws <em>Draws</em>}</li>
 *   <li>{@link no.ntnu.soccer.model.soccer.Placement#getLosses <em>Losses</em>}</li>
 *   <li>{@link no.ntnu.soccer.model.soccer.Placement#getGoalsFor <em>Goals For</em>}</li>
 *   <li>{@link no.ntnu.soccer.model.soccer.Placement#getGoalsAgainst <em>Goals Against</em>}</li>
 *   <li>{@link no.ntnu.soccer.model.soccer.Placement#getGoalDifference <em>Goal Difference</em>}</li>
 *   <li>{@link no.ntnu.soccer.model.soccer.Placement#getPoints <em>Points</em>}</li>
 *   <li>{@link no.ntnu.soccer.model.soccer.Placement#getTeam <em>Team</em>}</li>
 *   <li>{@link no.ntnu.soccer.model.soccer.Placement#getStanding <em>Standing</em>}</li>
 * </ul>
 *
 * @see no.ntnu.soccer.model.soccer.SoccerPackage#getPlacement()
 * @model
 * @generated
 */
public interface Placement extends EObject {
    /**
     * Returns the value of the '<em><b>Rank</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Rank</em>' attribute.
     * @see #setRank(int)
     * @see no.ntnu.soccer.model.soccer.SoccerPackage#getPlacement_Rank()
     * @model
     * @generated
     */
    int getRank();

    /**
     * Sets the value of the '{@link no.ntnu.soccer.model.soccer.Placement#getRank <em>Rank</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Rank</em>' attribute.
     * @see #getRank()
     * @generated
     */
    void setRank(int value);

    /**
     * Returns the value of the '<em><b>Wins</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Wins</em>' attribute.
     * @see #setWins(int)
     * @see no.ntnu.soccer.model.soccer.SoccerPackage#getPlacement_Wins()
     * @model
     * @generated
     */
    int getWins();

    /**
     * Sets the value of the '{@link no.ntnu.soccer.model.soccer.Placement#getWins <em>Wins</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Wins</em>' attribute.
     * @see #getWins()
     * @generated
     */
    void setWins(int value);

    /**
     * Returns the value of the '<em><b>Draws</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Draws</em>' attribute.
     * @see #setDraws(int)
     * @see no.ntnu.soccer.model.soccer.SoccerPackage#getPlacement_Draws()
     * @model
     * @generated
     */
    int getDraws();

    /**
     * Sets the value of the '{@link no.ntnu.soccer.model.soccer.Placement#getDraws <em>Draws</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Draws</em>' attribute.
     * @see #getDraws()
     * @generated
     */
    void setDraws(int value);

    /**
     * Returns the value of the '<em><b>Losses</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Losses</em>' attribute.
     * @see #setLosses(int)
     * @see no.ntnu.soccer.model.soccer.SoccerPackage#getPlacement_Losses()
     * @model
     * @generated
     */
    int getLosses();

    /**
     * Sets the value of the '{@link no.ntnu.soccer.model.soccer.Placement#getLosses <em>Losses</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Losses</em>' attribute.
     * @see #getLosses()
     * @generated
     */
    void setLosses(int value);

    /**
     * Returns the value of the '<em><b>Goals For</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Goals For</em>' attribute.
     * @see #setGoalsFor(int)
     * @see no.ntnu.soccer.model.soccer.SoccerPackage#getPlacement_GoalsFor()
     * @model
     * @generated
     */
    int getGoalsFor();

    /**
     * Sets the value of the '{@link no.ntnu.soccer.model.soccer.Placement#getGoalsFor <em>Goals For</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Goals For</em>' attribute.
     * @see #getGoalsFor()
     * @generated
     */
    void setGoalsFor(int value);

    /**
     * Returns the value of the '<em><b>Goals Against</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Goals Against</em>' attribute.
     * @see #setGoalsAgainst(int)
     * @see no.ntnu.soccer.model.soccer.SoccerPackage#getPlacement_GoalsAgainst()
     * @model
     * @generated
     */
    int getGoalsAgainst();

    /**
     * Sets the value of the '{@link no.ntnu.soccer.model.soccer.Placement#getGoalsAgainst <em>Goals Against</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Goals Against</em>' attribute.
     * @see #getGoalsAgainst()
     * @generated
     */
    void setGoalsAgainst(int value);

    /**
     * Returns the value of the '<em><b>Goal Difference</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Goal Difference</em>' attribute.
     * @see #setGoalDifference(int)
     * @see no.ntnu.soccer.model.soccer.SoccerPackage#getPlacement_GoalDifference()
     * @model
     * @generated
     */
    int getGoalDifference();

    /**
     * Sets the value of the '{@link no.ntnu.soccer.model.soccer.Placement#getGoalDifference <em>Goal Difference</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Goal Difference</em>' attribute.
     * @see #getGoalDifference()
     * @generated
     */
    void setGoalDifference(int value);

    /**
     * Returns the value of the '<em><b>Points</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Points</em>' attribute.
     * @see #setPoints(int)
     * @see no.ntnu.soccer.model.soccer.SoccerPackage#getPlacement_Points()
     * @model
     * @generated
     */
    int getPoints();

    /**
     * Sets the value of the '{@link no.ntnu.soccer.model.soccer.Placement#getPoints <em>Points</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Points</em>' attribute.
     * @see #getPoints()
     * @generated
     */
    void setPoints(int value);

    /**
     * Returns the value of the '<em><b>Team</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Team</em>' reference.
     * @see #setTeam(Team)
     * @see no.ntnu.soccer.model.soccer.SoccerPackage#getPlacement_Team()
     * @model
     * @generated
     */
    Team getTeam();

    /**
     * Sets the value of the '{@link no.ntnu.soccer.model.soccer.Placement#getTeam <em>Team</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Team</em>' reference.
     * @see #getTeam()
     * @generated
     */
    void setTeam(Team value);

    /**
     * Returns the value of the '<em><b>Standing</b></em>' container reference.
     * It is bidirectional and its opposite is '{@link no.ntnu.soccer.model.soccer.Standing#getPlacements <em>Placements</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Standing</em>' container reference.
     * @see #setStanding(Standing)
     * @see no.ntnu.soccer.model.soccer.SoccerPackage#getPlacement_Standing()
     * @see no.ntnu.soccer.model.soccer.Standing#getPlacements
     * @model opposite="placements" required="true" transient="false"
     * @generated
     */
    Standing getStanding();

    /**
     * Sets the value of the '{@link no.ntnu.soccer.model.soccer.Placement#getStanding <em>Standing</em>}' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Standing</em>' container reference.
     * @see #getStanding()
     * @generated
     */
    void setStanding(Standing value);

} // Placement
