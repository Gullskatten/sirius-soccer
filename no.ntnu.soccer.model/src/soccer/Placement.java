/**
 */
package soccer;

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
 *   <li>{@link soccer.Placement#getName <em>Name</em>}</li>
 *   <li>{@link soccer.Placement#getAwayTeamGoal <em>Away Team Goal</em>}</li>
 *   <li>{@link soccer.Placement#getHomeTeamGoal <em>Home Team Goal</em>}</li>
 *   <li>{@link soccer.Placement#getGoalDifference <em>Goal Difference</em>}</li>
 *   <li>{@link soccer.Placement#getWins <em>Wins</em>}</li>
 *   <li>{@link soccer.Placement#getLosses <em>Losses</em>}</li>
 *   <li>{@link soccer.Placement#getDraws <em>Draws</em>}</li>
 *   <li>{@link soccer.Placement#getSeasonPoints <em>Season Points</em>}</li>
 *   <li>{@link soccer.Placement#getTeamApiId <em>Team Api Id</em>}</li>
 *   <li>{@link soccer.Placement#getTeam <em>Team</em>}</li>
 * </ul>
 *
 * @see soccer.SoccerPackage#getPlacement()
 * @model
 * @generated
 */
public interface Placement extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see soccer.SoccerPackage#getPlacement_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link soccer.Placement#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Away Team Goal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Away Team Goal</em>' attribute.
	 * @see #setAwayTeamGoal(int)
	 * @see soccer.SoccerPackage#getPlacement_AwayTeamGoal()
	 * @model
	 * @generated
	 */
	int getAwayTeamGoal();

	/**
	 * Sets the value of the '{@link soccer.Placement#getAwayTeamGoal <em>Away Team Goal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Away Team Goal</em>' attribute.
	 * @see #getAwayTeamGoal()
	 * @generated
	 */
	void setAwayTeamGoal(int value);

	/**
	 * Returns the value of the '<em><b>Home Team Goal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Home Team Goal</em>' attribute.
	 * @see #setHomeTeamGoal(int)
	 * @see soccer.SoccerPackage#getPlacement_HomeTeamGoal()
	 * @model
	 * @generated
	 */
	int getHomeTeamGoal();

	/**
	 * Sets the value of the '{@link soccer.Placement#getHomeTeamGoal <em>Home Team Goal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Home Team Goal</em>' attribute.
	 * @see #getHomeTeamGoal()
	 * @generated
	 */
	void setHomeTeamGoal(int value);

	/**
	 * Returns the value of the '<em><b>Goal Difference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Goal Difference</em>' attribute.
	 * @see #setGoalDifference(int)
	 * @see soccer.SoccerPackage#getPlacement_GoalDifference()
	 * @model
	 * @generated
	 */
	int getGoalDifference();

	/**
	 * Sets the value of the '{@link soccer.Placement#getGoalDifference <em>Goal Difference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Goal Difference</em>' attribute.
	 * @see #getGoalDifference()
	 * @generated
	 */
	void setGoalDifference(int value);

	/**
	 * Returns the value of the '<em><b>Wins</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Wins</em>' attribute.
	 * @see #setWins(int)
	 * @see soccer.SoccerPackage#getPlacement_Wins()
	 * @model
	 * @generated
	 */
	int getWins();

	/**
	 * Sets the value of the '{@link soccer.Placement#getWins <em>Wins</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Wins</em>' attribute.
	 * @see #getWins()
	 * @generated
	 */
	void setWins(int value);

	/**
	 * Returns the value of the '<em><b>Losses</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Losses</em>' attribute.
	 * @see #setLosses(int)
	 * @see soccer.SoccerPackage#getPlacement_Losses()
	 * @model
	 * @generated
	 */
	int getLosses();

	/**
	 * Sets the value of the '{@link soccer.Placement#getLosses <em>Losses</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Losses</em>' attribute.
	 * @see #getLosses()
	 * @generated
	 */
	void setLosses(int value);

	/**
	 * Returns the value of the '<em><b>Draws</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Draws</em>' attribute.
	 * @see #setDraws(int)
	 * @see soccer.SoccerPackage#getPlacement_Draws()
	 * @model
	 * @generated
	 */
	int getDraws();

	/**
	 * Sets the value of the '{@link soccer.Placement#getDraws <em>Draws</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Draws</em>' attribute.
	 * @see #getDraws()
	 * @generated
	 */
	void setDraws(int value);

	/**
	 * Returns the value of the '<em><b>Season Points</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Season Points</em>' attribute.
	 * @see #setSeasonPoints(int)
	 * @see soccer.SoccerPackage#getPlacement_SeasonPoints()
	 * @model
	 * @generated
	 */
	int getSeasonPoints();

	/**
	 * Sets the value of the '{@link soccer.Placement#getSeasonPoints <em>Season Points</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Season Points</em>' attribute.
	 * @see #getSeasonPoints()
	 * @generated
	 */
	void setSeasonPoints(int value);

	/**
	 * Returns the value of the '<em><b>Team Api Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Team Api Id</em>' attribute.
	 * @see #setTeamApiId(int)
	 * @see soccer.SoccerPackage#getPlacement_TeamApiId()
	 * @model
	 * @generated
	 */
	int getTeamApiId();

	/**
	 * Sets the value of the '{@link soccer.Placement#getTeamApiId <em>Team Api Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Team Api Id</em>' attribute.
	 * @see #getTeamApiId()
	 * @generated
	 */
	void setTeamApiId(int value);

	/**
	 * Returns the value of the '<em><b>Team</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Team</em>' reference.
	 * @see #setTeam(Team)
	 * @see soccer.SoccerPackage#getPlacement_Team()
	 * @model
	 * @generated
	 */
	Team getTeam();

	/**
	 * Sets the value of the '{@link soccer.Placement#getTeam <em>Team</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Team</em>' reference.
	 * @see #getTeam()
	 * @generated
	 */
	void setTeam(Team value);

} // Placement
