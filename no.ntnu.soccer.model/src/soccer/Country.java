/**
 */
package soccer;

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
 *   <li>{@link soccer.Country#getId <em>Id</em>}</li>
 *   <li>{@link soccer.Country#getName <em>Name</em>}</li>
 *   <li>{@link soccer.Country#getLeague <em>League</em>}</li>
 *   <li>{@link soccer.Country#getSport <em>Sport</em>}</li>
 * </ul>
 *
 * @see soccer.SoccerPackage#getCountry()
 * @model
 * @generated
 */
public interface Country extends EObject {
	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see soccer.SoccerPackage#getCountry_Id()
	 * @model
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link soccer.Country#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see soccer.SoccerPackage#getCountry_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link soccer.Country#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>League</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link soccer.League#getCountry <em>Country</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>League</em>' containment reference.
	 * @see #setLeague(League)
	 * @see soccer.SoccerPackage#getCountry_League()
	 * @see soccer.League#getCountry
	 * @model opposite="country" containment="true"
	 * @generated
	 */
	League getLeague();

	/**
	 * Sets the value of the '{@link soccer.Country#getLeague <em>League</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>League</em>' containment reference.
	 * @see #getLeague()
	 * @generated
	 */
	void setLeague(League value);

	/**
	 * Returns the value of the '<em><b>Sport</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link soccer.Sport#getCountries <em>Countries</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sport</em>' container reference.
	 * @see #setSport(Sport)
	 * @see soccer.SoccerPackage#getCountry_Sport()
	 * @see soccer.Sport#getCountries
	 * @model opposite="countries" transient="false"
	 * @generated
	 */
	Sport getSport();

	/**
	 * Sets the value of the '{@link soccer.Country#getSport <em>Sport</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sport</em>' container reference.
	 * @see #getSport()
	 * @generated
	 */
	void setSport(Sport value);

} // Country
