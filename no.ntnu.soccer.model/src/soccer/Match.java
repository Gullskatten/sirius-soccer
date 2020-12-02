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
 *   <li>{@link soccer.Match#getWinner <em>Winner</em>}</li>
 *   <li>{@link soccer.Match#getOpponent <em>Opponent</em>}</li>
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
	 * Returns the value of the '<em><b>Winner</b></em>' attribute.
	 * The literals are from the enumeration {@link soccer.MatchWinner}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Winner</em>' attribute.
	 * @see soccer.MatchWinner
	 * @see #setWinner(MatchWinner)
	 * @see soccer.SoccerPackage#getMatch_Winner()
	 * @model
	 * @generated
	 */
	MatchWinner getWinner();

	/**
	 * Sets the value of the '{@link soccer.Match#getWinner <em>Winner</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Winner</em>' attribute.
	 * @see soccer.MatchWinner
	 * @see #getWinner()
	 * @generated
	 */
	void setWinner(MatchWinner value);

	/**
	 * Returns the value of the '<em><b>Opponent</b></em>' containment reference list.
	 * The list contents are of type {@link soccer.Opponent}.
	 * It is bidirectional and its opposite is '{@link soccer.Opponent#getMatch <em>Match</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Opponent</em>' containment reference list.
	 * @see soccer.SoccerPackage#getMatch_Opponent()
	 * @see soccer.Opponent#getMatch
	 * @model opposite="match" containment="true" lower="2" upper="2"
	 * @generated
	 */
	EList<Opponent> getOpponent();

} // Match
