/**
 */
package soccer;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Opponent</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link soccer.Opponent#getMatch <em>Match</em>}</li>
 *   <li>{@link soccer.Opponent#getTeam <em>Team</em>}</li>
 *   <li>{@link soccer.Opponent#getType <em>Type</em>}</li>
 *   <li>{@link soccer.Opponent#getLineup <em>Lineup</em>}</li>
 * </ul>
 *
 * @see soccer.SoccerPackage#getOpponent()
 * @model
 * @generated
 */
public interface Opponent extends EObject {
	/**
	 * Returns the value of the '<em><b>Match</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link soccer.Match#getOpponents <em>Opponents</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Match</em>' container reference.
	 * @see #setMatch(Match)
	 * @see soccer.SoccerPackage#getOpponent_Match()
	 * @see soccer.Match#getOpponents
	 * @model opposite="opponents" required="true" transient="false"
	 * @generated
	 */
	Match getMatch();

	/**
	 * Sets the value of the '{@link soccer.Opponent#getMatch <em>Match</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Match</em>' container reference.
	 * @see #getMatch()
	 * @generated
	 */
	void setMatch(Match value);

	/**
	 * Returns the value of the '<em><b>Team</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Team</em>' reference.
	 * @see #setTeam(Team)
	 * @see soccer.SoccerPackage#getOpponent_Team()
	 * @model
	 * @generated
	 */
	Team getTeam();

	/**
	 * Sets the value of the '{@link soccer.Opponent#getTeam <em>Team</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Team</em>' reference.
	 * @see #getTeam()
	 * @generated
	 */
	void setTeam(Team value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link soccer.TeamType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see soccer.TeamType
	 * @see #setType(TeamType)
	 * @see soccer.SoccerPackage#getOpponent_Type()
	 * @model
	 * @generated
	 */
	TeamType getType();

	/**
	 * Sets the value of the '{@link soccer.Opponent#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see soccer.TeamType
	 * @see #getType()
	 * @generated
	 */
	void setType(TeamType value);

	/**
	 * Returns the value of the '<em><b>Lineup</b></em>' containment reference list.
	 * The list contents are of type {@link soccer.Position}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lineup</em>' containment reference list.
	 * @see soccer.SoccerPackage#getOpponent_Lineup()
	 * @model containment="true"
	 * @generated
	 */
	EList<Position> getLineup();

} // Opponent
