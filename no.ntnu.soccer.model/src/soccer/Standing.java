/**
 */
package soccer;

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
 *   <li>{@link soccer.Standing#getPlacement <em>Placement</em>}</li>
 *   <li>{@link soccer.Standing#getSeason <em>Season</em>}</li>
 * </ul>
 *
 * @see soccer.SoccerPackage#getStanding()
 * @model
 * @generated
 */
public interface Standing extends EObject {
	/**
	 * Returns the value of the '<em><b>Placement</b></em>' containment reference list.
	 * The list contents are of type {@link soccer.Placement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Placement</em>' containment reference list.
	 * @see soccer.SoccerPackage#getStanding_Placement()
	 * @model containment="true"
	 * @generated
	 */
	EList<Placement> getPlacement();

	/**
	 * Returns the value of the '<em><b>Season</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link soccer.Season#getStanding <em>Standing</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Season</em>' container reference.
	 * @see #setSeason(Season)
	 * @see soccer.SoccerPackage#getStanding_Season()
	 * @see soccer.Season#getStanding
	 * @model opposite="standing" transient="false"
	 * @generated
	 */
	Season getSeason();

	/**
	 * Sets the value of the '{@link soccer.Standing#getSeason <em>Season</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Season</em>' container reference.
	 * @see #getSeason()
	 * @generated
	 */
	void setSeason(Season value);

} // Standing
