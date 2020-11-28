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
 *   <li>{@link soccer.Season#getSeasonName <em>Season Name</em>}</li>
 *   <li>{@link soccer.Season#getLeague <em>League</em>}</li>
 *   <li>{@link soccer.Season#getMatchDay <em>Match Day</em>}</li>
 * </ul>
 *
 * @see soccer.SoccerPackage#getSeason()
 * @model
 * @generated
 */
public interface Season extends EObject {
	/**
	 * Returns the value of the '<em><b>Season Name</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Season Name</em>' attribute.
	 * @see soccer.SoccerPackage#getSeason_SeasonName()
	 * @model default="" changeable="false" derived="true"
	 * @generated
	 */
	String getSeasonName();

	/**
	 * Returns the value of the '<em><b>League</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link soccer.League#getSeason <em>Season</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>League</em>' container reference.
	 * @see #setLeague(League)
	 * @see soccer.SoccerPackage#getSeason_League()
	 * @see soccer.League#getSeason
	 * @model opposite="season" required="true" transient="false"
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
	 * Returns the value of the '<em><b>Match Day</b></em>' containment reference list.
	 * The list contents are of type {@link soccer.MatchDay}.
	 * It is bidirectional and its opposite is '{@link soccer.MatchDay#getSeason <em>Season</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Match Day</em>' containment reference list.
	 * @see soccer.SoccerPackage#getSeason_MatchDay()
	 * @see soccer.MatchDay#getSeason
	 * @model opposite="season" containment="true"
	 * @generated
	 */
	EList<MatchDay> getMatchDay();

} // Season
