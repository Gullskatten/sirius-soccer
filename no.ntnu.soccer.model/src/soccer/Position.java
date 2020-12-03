/**
 */
package soccer;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Position</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link soccer.Position#getPlayers <em>Players</em>}</li>
 *   <li>{@link soccer.Position#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see soccer.SoccerPackage#getPosition()
 * @model
 * @generated
 */
public interface Position extends EObject {
	/**
	 * Returns the value of the '<em><b>Players</b></em>' reference list.
	 * The list contents are of type {@link soccer.Player}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Players</em>' reference list.
	 * @see soccer.SoccerPackage#getPosition_Players()
	 * @model upper="11"
	 * @generated
	 */
	EList<Player> getPlayers();

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link soccer.PositionType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see soccer.PositionType
	 * @see #setType(PositionType)
	 * @see soccer.SoccerPackage#getPosition_Type()
	 * @model
	 * @generated
	 */
	PositionType getType();

	/**
	 * Sets the value of the '{@link soccer.Position#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see soccer.PositionType
	 * @see #getType()
	 * @generated
	 */
	void setType(PositionType value);

} // Position
