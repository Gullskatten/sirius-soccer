/**
 */
package no.ntnu.soccer.model.soccer;

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
 *   <li>{@link no.ntnu.soccer.model.soccer.Season#getName <em>Name</em>}</li>
 *   <li>{@link no.ntnu.soccer.model.soccer.Season#getLeague <em>League</em>}</li>
 *   <li>{@link no.ntnu.soccer.model.soccer.Season#getMatchDays <em>Match Days</em>}</li>
 *   <li>{@link no.ntnu.soccer.model.soccer.Season#getStanding <em>Standing</em>}</li>
 * </ul>
 *
 * @see no.ntnu.soccer.model.soccer.SoccerPackage#getSeason()
 * @model
 * @generated
 */
public interface Season extends EObject {
    /**
     * Returns the value of the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Name</em>' attribute.
     * @see #setName(String)
     * @see no.ntnu.soccer.model.soccer.SoccerPackage#getSeason_Name()
     * @model
     * @generated
     */
    String getName();

    /**
     * Sets the value of the '{@link no.ntnu.soccer.model.soccer.Season#getName <em>Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Name</em>' attribute.
     * @see #getName()
     * @generated
     */
    void setName(String value);

    /**
     * Returns the value of the '<em><b>League</b></em>' container reference.
     * It is bidirectional and its opposite is '{@link no.ntnu.soccer.model.soccer.League#getSeasons <em>Seasons</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>League</em>' container reference.
     * @see #setLeague(League)
     * @see no.ntnu.soccer.model.soccer.SoccerPackage#getSeason_League()
     * @see no.ntnu.soccer.model.soccer.League#getSeasons
     * @model opposite="seasons" required="true" transient="false"
     * @generated
     */
    League getLeague();

    /**
     * Sets the value of the '{@link no.ntnu.soccer.model.soccer.Season#getLeague <em>League</em>}' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>League</em>' container reference.
     * @see #getLeague()
     * @generated
     */
    void setLeague(League value);

    /**
     * Returns the value of the '<em><b>Match Days</b></em>' containment reference list.
     * The list contents are of type {@link no.ntnu.soccer.model.soccer.MatchDay}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Match Days</em>' containment reference list.
     * @see no.ntnu.soccer.model.soccer.SoccerPackage#getSeason_MatchDays()
     * @model containment="true"
     * @generated
     */
    EList<MatchDay> getMatchDays();

    /**
     * Returns the value of the '<em><b>Standing</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Standing</em>' containment reference.
     * @see #setStanding(Standing)
     * @see no.ntnu.soccer.model.soccer.SoccerPackage#getSeason_Standing()
     * @model containment="true" required="true"
     * @generated
     */
    Standing getStanding();

    /**
     * Sets the value of the '{@link no.ntnu.soccer.model.soccer.Season#getStanding <em>Standing</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Standing</em>' containment reference.
     * @see #getStanding()
     * @generated
     */
    void setStanding(Standing value);

} // Season
