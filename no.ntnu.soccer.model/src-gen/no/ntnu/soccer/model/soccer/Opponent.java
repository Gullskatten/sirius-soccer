/**
 */
package no.ntnu.soccer.model.soccer;

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
 *   <li>{@link no.ntnu.soccer.model.soccer.Opponent#getType <em>Type</em>}</li>
 *   <li>{@link no.ntnu.soccer.model.soccer.Opponent#getLineup <em>Lineup</em>}</li>
 *   <li>{@link no.ntnu.soccer.model.soccer.Opponent#getTeam <em>Team</em>}</li>
 * </ul>
 *
 * @see no.ntnu.soccer.model.soccer.SoccerPackage#getOpponent()
 * @model
 * @generated
 */
public interface Opponent extends EObject {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link no.ntnu.soccer.model.soccer.TeamType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see no.ntnu.soccer.model.soccer.TeamType
	 * @see #setType(TeamType)
	 * @see no.ntnu.soccer.model.soccer.SoccerPackage#getOpponent_Type()
	 * @model
	 * @generated
	 */
	TeamType getType();

	/**
	 * Sets the value of the '{@link no.ntnu.soccer.model.soccer.Opponent#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see no.ntnu.soccer.model.soccer.TeamType
	 * @see #getType()
	 * @generated
	 */
	void setType(TeamType value);

	/**
	 * Returns the value of the '<em><b>Lineup</b></em>' containment reference list.
	 * The list contents are of type {@link no.ntnu.soccer.model.soccer.Position}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lineup</em>' containment reference list.
	 * @see no.ntnu.soccer.model.soccer.SoccerPackage#getOpponent_Lineup()
	 * @model containment="true" upper="4"
	 * @generated
	 */
	EList<Position> getLineup();

	/**
	 * Returns the value of the '<em><b>Team</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Team</em>' reference.
	 * @see #setTeam(Team)
	 * @see no.ntnu.soccer.model.soccer.SoccerPackage#getOpponent_Team()
	 * @model required="true"
	 * @generated
	 */
	Team getTeam();

	/**
	 * Sets the value of the '{@link no.ntnu.soccer.model.soccer.Opponent#getTeam <em>Team</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Team</em>' reference.
	 * @see #getTeam()
	 * @generated
	 */
	void setTeam(Team value);

} // Opponent
