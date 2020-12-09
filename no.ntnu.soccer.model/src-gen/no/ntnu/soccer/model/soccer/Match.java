/**
 */
package no.ntnu.soccer.model.soccer;

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
 *   <li>{@link no.ntnu.soccer.model.soccer.Match#getId <em>Id</em>}</li>
 *   <li>{@link no.ntnu.soccer.model.soccer.Match#getHomeTeamGoal <em>Home Team Goal</em>}</li>
 *   <li>{@link no.ntnu.soccer.model.soccer.Match#getAwayTeamGoal <em>Away Team Goal</em>}</li>
 *   <li>{@link no.ntnu.soccer.model.soccer.Match#getResult <em>Result</em>}</li>
 *   <li>{@link no.ntnu.soccer.model.soccer.Match#getOpponents <em>Opponents</em>}</li>
 * </ul>
 *
 * @see no.ntnu.soccer.model.soccer.SoccerPackage#getMatch()
 * @model
 * @generated
 */
public interface Match extends EObject {
	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(int)
	 * @see no.ntnu.soccer.model.soccer.SoccerPackage#getMatch_Id()
	 * @model id="true"
	 * @generated
	 */
	int getId();

	/**
	 * Sets the value of the '{@link no.ntnu.soccer.model.soccer.Match#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(int value);

	/**
	 * Returns the value of the '<em><b>Home Team Goal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Home Team Goal</em>' attribute.
	 * @see #setHomeTeamGoal(int)
	 * @see no.ntnu.soccer.model.soccer.SoccerPackage#getMatch_HomeTeamGoal()
	 * @model
	 * @generated
	 */
	int getHomeTeamGoal();

	/**
	 * Sets the value of the '{@link no.ntnu.soccer.model.soccer.Match#getHomeTeamGoal <em>Home Team Goal</em>}' attribute.
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
	 * @see no.ntnu.soccer.model.soccer.SoccerPackage#getMatch_AwayTeamGoal()
	 * @model
	 * @generated
	 */
	int getAwayTeamGoal();

	/**
	 * Sets the value of the '{@link no.ntnu.soccer.model.soccer.Match#getAwayTeamGoal <em>Away Team Goal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Away Team Goal</em>' attribute.
	 * @see #getAwayTeamGoal()
	 * @generated
	 */
	void setAwayTeamGoal(int value);

	/**
	 * Returns the value of the '<em><b>Result</b></em>' attribute.
	 * The literals are from the enumeration {@link no.ntnu.soccer.model.soccer.MatchResult}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Result</em>' attribute.
	 * @see no.ntnu.soccer.model.soccer.MatchResult
	 * @see #setResult(MatchResult)
	 * @see no.ntnu.soccer.model.soccer.SoccerPackage#getMatch_Result()
	 * @model
	 * @generated
	 */
	MatchResult getResult();

	/**
	 * Sets the value of the '{@link no.ntnu.soccer.model.soccer.Match#getResult <em>Result</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Result</em>' attribute.
	 * @see no.ntnu.soccer.model.soccer.MatchResult
	 * @see #getResult()
	 * @generated
	 */
	void setResult(MatchResult value);

	/**
	 * Returns the value of the '<em><b>Opponents</b></em>' containment reference list.
	 * The list contents are of type {@link no.ntnu.soccer.model.soccer.Opponent}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Opponents</em>' containment reference list.
	 * @see no.ntnu.soccer.model.soccer.SoccerPackage#getMatch_Opponents()
	 * @model containment="true" lower="2" upper="2"
	 * @generated
	 */
	EList<Opponent> getOpponents();

} // Match
