/**
 */
package soccer;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Season</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link soccer.Season#getName <em>Name</em>}</li>
 *   <li>{@link soccer.Season#getLeague <em>League</em>}</li>
 *   <li>{@link soccer.Season#getMatchDays <em>Match Days</em>}</li>
 *   <li>{@link soccer.Season#getStanding <em>Standing</em>}</li>
 * </ul>
 *
 * @see soccer.SoccerPackage#getSeason()
 * @model
 * @generated
 */
public interface Season extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see soccer.SoccerPackage#getSeason_Name()
	 * @model default="" derived="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link soccer.Season#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>League</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link soccer.League#getSeasons <em>Seasons</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>League</em>' container reference.
	 * @see #setLeague(League)
	 * @see soccer.SoccerPackage#getSeason_League()
	 * @see soccer.League#getSeasons
	 * @model opposite="seasons" required="true" transient="false"
	 * @generated
	 */
	League getLeague();

	/**
	 * Sets the value of the '{@link soccer.Season#getLeague <em>League</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>League</em>' container reference.
	 * @see #getLeague()
	 * @generated
	 */
	void setLeague(League value);

	/**
	 * Returns the value of the '<em><b>Match Days</b></em>' containment reference list.
	 * The list contents are of type {@link soccer.MatchDay}.
	 * It is bidirectional and its opposite is '{@link soccer.MatchDay#getSeason <em>Season</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Match Days</em>' containment reference list.
	 * @see soccer.SoccerPackage#getSeason_MatchDays()
	 * @see soccer.MatchDay#getSeason
	 * @model opposite="season" containment="true"
	 * @generated
	 */
	EList<MatchDay> getMatchDays();

	/**
	 * Returns the value of the '<em><b>Standing</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link soccer.Standing#getSeason <em>Season</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Standing</em>' containment reference.
	 * @see #setStanding(Standing)
	 * @see soccer.SoccerPackage#getSeason_Standing()
	 * @see soccer.Standing#getSeason
	 * @model opposite="season" containment="true"
	 * @generated
	 */
	Standing getStanding();

	/**
	 * Sets the value of the '{@link soccer.Season#getStanding <em>Standing</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Standing</em>' containment reference.
	 * @see #getStanding()
	 * @generated
	 */
	void setStanding(Standing value);

} // Season
