/**
 */
package no.ntnu.soccer.model.soccer;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Country</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link no.ntnu.soccer.model.soccer.Country#getId <em>Id</em>}</li>
 *   <li>{@link no.ntnu.soccer.model.soccer.Country#getName <em>Name</em>}</li>
 *   <li>{@link no.ntnu.soccer.model.soccer.Country#getLeague <em>League</em>}</li>
 * </ul>
 *
 * @see no.ntnu.soccer.model.soccer.SoccerPackage#getCountry()
 * @model
 * @generated
 */
public interface Country extends EObject {
	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(int)
	 * @see no.ntnu.soccer.model.soccer.SoccerPackage#getCountry_Id()
	 * @model id="true"
	 * @generated
	 */
	int getId();

	/**
	 * Sets the value of the '{@link no.ntnu.soccer.model.soccer.Country#getId <em>Id</em>}' attribute.
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
	 * @see no.ntnu.soccer.model.soccer.SoccerPackage#getCountry_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link no.ntnu.soccer.model.soccer.Country#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>League</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link no.ntnu.soccer.model.soccer.League#getCountry <em>Country</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>League</em>' containment reference.
	 * @see #setLeague(League)
	 * @see no.ntnu.soccer.model.soccer.SoccerPackage#getCountry_League()
	 * @see no.ntnu.soccer.model.soccer.League#getCountry
	 * @model opposite="country" containment="true"
	 * @generated
	 */
	League getLeague();

	/**
	 * Sets the value of the '{@link no.ntnu.soccer.model.soccer.Country#getLeague <em>League</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>League</em>' containment reference.
	 * @see #getLeague()
	 * @generated
	 */
	void setLeague(League value);

} // Country
