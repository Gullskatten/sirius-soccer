/**
 */
package soccer;

import java.util.Date;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Match</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link soccer.Match#getMatchDay <em>Match Day</em>}</li>
 *   <li>{@link soccer.Match#getDate <em>Date</em>}</li>
 *   <li>{@link soccer.Match#getHomeTeam <em>Home Team</em>}</li>
 *   <li>{@link soccer.Match#getAwayTeam <em>Away Team</em>}</li>
 *   <li>{@link soccer.Match#getHomeTeamGoal <em>Home Team Goal</em>}</li>
 *   <li>{@link soccer.Match#getAwayTeamGoal <em>Away Team Goal</em>}</li>
 *   <li>{@link soccer.Match#getWinner <em>Winner</em>}</li>
 * </ul>
 *
 * @see soccer.SoccerPackage#getMatch()
 * @model
 * @generated
 */
public interface Match extends EObject {
	/**
	 * Returns the value of the '<em><b>Match Day</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link soccer.MatchDay#getMatch <em>Match</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Match Day</em>' container reference.
	 * @see #setMatchDay(MatchDay)
	 * @see soccer.SoccerPackage#getMatch_MatchDay()
	 * @see soccer.MatchDay#getMatch
	 * @model opposite="match" transient="false"
	 * @generated
	 */
	MatchDay getMatchDay();

	/**
	 * Sets the value of the '{@link soccer.Match#getMatchDay <em>Match Day</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Match Day</em>' container reference.
	 * @see #getMatchDay()
	 * @generated
	 */
	void setMatchDay(MatchDay value);

	/**
	 * Returns the value of the '<em><b>Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Date</em>' attribute.
	 * @see #setDate(Date)
	 * @see soccer.SoccerPackage#getMatch_Date()
	 * @model
	 * @generated
	 */
	Date getDate();

	/**
	 * Sets the value of the '{@link soccer.Match#getDate <em>Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Date</em>' attribute.
	 * @see #getDate()
	 * @generated
	 */
	void setDate(Date value);

	/**
	 * Returns the value of the '<em><b>Home Team</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Home Team</em>' reference.
	 * @see #setHomeTeam(Team)
	 * @see soccer.SoccerPackage#getMatch_HomeTeam()
	 * @model required="true"
	 * @generated
	 */
	Team getHomeTeam();

	/**
	 * Sets the value of the '{@link soccer.Match#getHomeTeam <em>Home Team</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Home Team</em>' reference.
	 * @see #getHomeTeam()
	 * @generated
	 */
	void setHomeTeam(Team value);

	/**
	 * Returns the value of the '<em><b>Away Team</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Away Team</em>' reference.
	 * @see #setAwayTeam(Team)
	 * @see soccer.SoccerPackage#getMatch_AwayTeam()
	 * @model required="true"
	 * @generated
	 */
	Team getAwayTeam();

	/**
	 * Sets the value of the '{@link soccer.Match#getAwayTeam <em>Away Team</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Away Team</em>' reference.
	 * @see #getAwayTeam()
	 * @generated
	 */
	void setAwayTeam(Team value);

	/**
	 * Returns the value of the '<em><b>Home Team Goal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Home Team Goal</em>' attribute.
	 * @see #setHomeTeamGoal(int)
	 * @see soccer.SoccerPackage#getMatch_HomeTeamGoal()
	 * @model
	 * @generated
	 */
	int getHomeTeamGoal();

	/**
	 * Sets the value of the '{@link soccer.Match#getHomeTeamGoal <em>Home Team Goal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Home Team Goal</em>' attribute.
	 * @see #getHomeTeamGoal()
	 * @generated
	 */
	void setHomeTeamGoal(int value);

	/**
	 * Returns the value of the '<em><b>Away Team Goal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Away Team Goal</em>' attribute.
	 * @see #setAwayTeamGoal(int)
	 * @see soccer.SoccerPackage#getMatch_AwayTeamGoal()
	 * @model
	 * @generated
	 */
	int getAwayTeamGoal();

	/**
	 * Sets the value of the '{@link soccer.Match#getAwayTeamGoal <em>Away Team Goal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Away Team Goal</em>' attribute.
	 * @see #getAwayTeamGoal()
	 * @generated
	 */
	void setAwayTeamGoal(int value);

	/**
	 * Returns the value of the '<em><b>Winner</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Winner</em>' attribute.
	 * @see #setWinner(String)
	 * @see soccer.SoccerPackage#getMatch_Winner()
	 * @model
	 * @generated
	 */
	String getWinner();

	/**
	 * Sets the value of the '{@link soccer.Match#getWinner <em>Winner</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Winner</em>' attribute.
	 * @see #getWinner()
	 * @generated
	 */
	void setWinner(String value);

} // Match
