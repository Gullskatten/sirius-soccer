/**
 */
package soccer;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Match Day</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link soccer.MatchDay#getDate <em>Date</em>}</li>
 *   <li>{@link soccer.MatchDay#getMatch <em>Match</em>}</li>
 *   <li>{@link soccer.MatchDay#getSeason <em>Season</em>}</li>
 * </ul>
 *
 * @see soccer.SoccerPackage#getMatchDay()
 * @model
 * @generated
 */
public interface MatchDay extends EObject {
	/**
	 * Returns the value of the '<em><b>Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Date</em>' attribute.
	 * @see #setDate(String)
	 * @see soccer.SoccerPackage#getMatchDay_Date()
	 * @model
	 * @generated
	 */
	String getDate();

	/**
	 * Sets the value of the '{@link soccer.MatchDay#getDate <em>Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Date</em>' attribute.
	 * @see #getDate()
	 * @generated
	 */
	void setDate(String value);

	/**
	 * Returns the value of the '<em><b>Match</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link soccer.Match#getMatchDay <em>Match Day</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Match</em>' containment reference.
	 * @see #setMatch(Match)
	 * @see soccer.SoccerPackage#getMatchDay_Match()
	 * @see soccer.Match#getMatchDay
	 * @model opposite="matchDay" containment="true"
	 * @generated
	 */
	Match getMatch();

	/**
	 * Sets the value of the '{@link soccer.MatchDay#getMatch <em>Match</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Match</em>' containment reference.
	 * @see #getMatch()
	 * @generated
	 */
	void setMatch(Match value);

	/**
	 * Returns the value of the '<em><b>Season</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link soccer.Season#getMatchDay <em>Match Day</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Season</em>' container reference.
	 * @see #setSeason(Season)
	 * @see soccer.SoccerPackage#getMatchDay_Season()
	 * @see soccer.Season#getMatchDay
	 * @model opposite="matchDay" transient="false"
	 * @generated
	 */
	Season getSeason();

	/**
	 * Sets the value of the '{@link soccer.MatchDay#getSeason <em>Season</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Season</em>' container reference.
	 * @see #getSeason()
	 * @generated
	 */
	void setSeason(Season value);

} // MatchDay
