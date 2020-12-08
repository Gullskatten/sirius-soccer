/**
 */
package no.ntnu.soccer.model.soccer;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Standing</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link no.ntnu.soccer.model.soccer.Standing#getPlacements <em>Placements</em>}</li>
 * </ul>
 *
 * @see no.ntnu.soccer.model.soccer.SoccerPackage#getStanding()
 * @model
 * @generated
 */
public interface Standing extends EObject {
    /**
     * Returns the value of the '<em><b>Placements</b></em>' containment reference list.
     * The list contents are of type {@link no.ntnu.soccer.model.soccer.Placement}.
     * It is bidirectional and its opposite is '{@link no.ntnu.soccer.model.soccer.Placement#getStanding <em>Standing</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Placements</em>' containment reference list.
     * @see no.ntnu.soccer.model.soccer.SoccerPackage#getStanding_Placements()
     * @see no.ntnu.soccer.model.soccer.Placement#getStanding
     * @model opposite="standing" containment="true"
     * @generated
     */
    EList<Placement> getPlacements();

} // Standing
