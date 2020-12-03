/**
 */
package soccer;

import org.eclipse.emf.common.util.EList;
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
 *   <li>{@link soccer.Match#getId <em>Id</em>}</li>
 *   <li>{@link soccer.Match#getHomeTeamGoal <em>Home Team Goal</em>}</li>
 *   <li>{@link soccer.Match#getAwayTeamGoal <em>Away Team Goal</em>}</li>
 *   <li>{@link soccer.Match#getResult <em>Result</em>}</li>
 *   <li>{@link soccer.Match#getOpponents <em>Opponents</em>}</li>
 * </ul>
 *
 * @see soccer.SoccerPackage#getMatch()
 * @model
 * @generated
 */
public interface Match extends EObject {
	/**
	 * Returns the value of the '<em><b>Match Day</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link soccer.MatchDay#getMatches <em>Matches</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Match Day</em>' container reference.
	 * @see #setMatchDay(MatchDay)
	 * @see soccer.SoccerPackage#getMatch_MatchDay()
	 * @see soccer.MatchDay#getMatches
	 * @model opposite="matches" transient="false"
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
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see soccer.SoccerPackage#getMatch_Id()
	 * @model
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link soccer.Match#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

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
	 * Returns the value of the '<em><b>Result</b></em>' attribute.
	 * The literals are from the enumeration {@link soccer.MatchResult}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Result</em>' attribute.
	 * @see soccer.MatchResult
	 * @see #setResult(MatchResult)
	 * @see soccer.SoccerPackage#getMatch_Result()
	 * @model
	 * @generated
	 */
	MatchResult getResult();

	/**
	 * Sets the value of the '{@link soccer.Match#getResult <em>Result</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Result</em>' attribute.
	 * @see soccer.MatchResult
	 * @see #getResult()
	 * @generated
	 */
	void setResult(MatchResult value);

	/**
	 * Returns the value of the '<em><b>Opponents</b></em>' containment reference list.
	 * The list contents are of type {@link soccer.Opponent}.
	 * It is bidirectional and its opposite is '{@link soccer.Opponent#getMatch <em>Match</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Opponents</em>' containment reference list.
	 * @see soccer.SoccerPackage#getMatch_Opponents()
	 * @see soccer.Opponent#getMatch
	 * @model opposite="match" containment="true" lower="2" upper="2"
	 * @generated
	 */
	EList<Opponent> getOpponents();

} // Match
