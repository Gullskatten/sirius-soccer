/**
 */
package no.ntnu.soccer.model.soccer;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Player</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link no.ntnu.soccer.model.soccer.Player#getId <em>Id</em>}</li>
 *   <li>{@link no.ntnu.soccer.model.soccer.Player#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see no.ntnu.soccer.model.soccer.SoccerPackage#getPlayer()
 * @model
 * @generated
 */
public interface Player extends EObject {
    /**
     * Returns the value of the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Id</em>' attribute.
     * @see #setId(int)
     * @see no.ntnu.soccer.model.soccer.SoccerPackage#getPlayer_Id()
     * @model id="true"
     * @generated
     */
    int getId();

    /**
     * Sets the value of the '{@link no.ntnu.soccer.model.soccer.Player#getId <em>Id</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Id</em>' attribute.
     * @see #getId()
     * @generated
     */
    void setId(int value);

    /**
     * Returns the value of the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Name</em>' attribute.
     * @see #setName(String)
     * @see no.ntnu.soccer.model.soccer.SoccerPackage#getPlayer_Name()
     * @model
     * @generated
     */
    String getName();

    /**
     * Sets the value of the '{@link no.ntnu.soccer.model.soccer.Player#getName <em>Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Name</em>' attribute.
     * @see #getName()
     * @generated
     */
    void setName(String value);

} // Player
