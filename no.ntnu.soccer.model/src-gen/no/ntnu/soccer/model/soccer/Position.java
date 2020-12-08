/**
 */
package no.ntnu.soccer.model.soccer;

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
 *   <li>{@link no.ntnu.soccer.model.soccer.Position#getType <em>Type</em>}</li>
 *   <li>{@link no.ntnu.soccer.model.soccer.Position#getPlayers <em>Players</em>}</li>
 * </ul>
 *
 * @see no.ntnu.soccer.model.soccer.SoccerPackage#getPosition()
 * @model
 * @generated
 */
public interface Position extends EObject {
    /**
     * Returns the value of the '<em><b>Type</b></em>' attribute.
     * The literals are from the enumeration {@link no.ntnu.soccer.model.soccer.PositionType}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Type</em>' attribute.
     * @see no.ntnu.soccer.model.soccer.PositionType
     * @see #setType(PositionType)
     * @see no.ntnu.soccer.model.soccer.SoccerPackage#getPosition_Type()
     * @model
     * @generated
     */
    PositionType getType();

    /**
     * Sets the value of the '{@link no.ntnu.soccer.model.soccer.Position#getType <em>Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Type</em>' attribute.
     * @see no.ntnu.soccer.model.soccer.PositionType
     * @see #getType()
     * @generated
     */
    void setType(PositionType value);

    /**
     * Returns the value of the '<em><b>Players</b></em>' reference list.
     * The list contents are of type {@link no.ntnu.soccer.model.soccer.Player}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Players</em>' reference list.
     * @see no.ntnu.soccer.model.soccer.SoccerPackage#getPosition_Players()
     * @model upper="11"
     * @generated
     */
    EList<Player> getPlayers();

} // Position
