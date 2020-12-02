/**
 */
package soccer;

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
 *   <li>{@link soccer.Opponent#getOpponentType <em>Opponent Type</em>}</li>
 * </ul>
 *
 * @see soccer.SoccerPackage#getOpponent()
 * @model
 * @generated
 */
public interface Opponent extends EObject {
	/**
	 * Returns the value of the '<em><b>Match</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link soccer.Match#getOpponent <em>Opponent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Match</em>' container reference.
	 * @see #setMatch(Match)
	 * @see soccer.SoccerPackage#getOpponent_Match()
	 * @see soccer.Match#getOpponent
	 * @model opposite="opponent" required="true" transient="false"
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
	 * Returns the value of the '<em><b>Opponent Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Opponent Type</em>' attribute.
	 * @see #setOpponentType(String)
	 * @see soccer.SoccerPackage#getOpponent_OpponentType()
	 * @model
	 * @generated
	 */
	String getOpponentType();

	/**
	 * Sets the value of the '{@link soccer.Opponent#getOpponentType <em>Opponent Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Opponent Type</em>' attribute.
	 * @see #getOpponentType()
	 * @generated
	 */
	void setOpponentType(String value);

} // Opponent
