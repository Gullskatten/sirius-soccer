/**
 */
package no.ntnu.soccer.model.soccer;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>League</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link no.ntnu.soccer.model.soccer.League#getName <em>Name</em>}</li>
 *   <li>{@link no.ntnu.soccer.model.soccer.League#getCountry <em>Country</em>}</li>
 *   <li>{@link no.ntnu.soccer.model.soccer.League#getSeasons <em>Seasons</em>}</li>
 *   <li>{@link no.ntnu.soccer.model.soccer.League#getTeams <em>Teams</em>}</li>
 * </ul>
 *
 * @see no.ntnu.soccer.model.soccer.SoccerPackage#getLeague()
 * @model
 * @generated
 */
public interface League extends EObject {
    /**
     * Returns the value of the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Name</em>' attribute.
     * @see #setName(String)
     * @see no.ntnu.soccer.model.soccer.SoccerPackage#getLeague_Name()
     * @model
     * @generated
     */
    String getName();

    /**
     * Sets the value of the '{@link no.ntnu.soccer.model.soccer.League#getName <em>Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Name</em>' attribute.
     * @see #getName()
     * @generated
     */
    void setName(String value);

    /**
     * Returns the value of the '<em><b>Country</b></em>' container reference.
     * It is bidirectional and its opposite is '{@link no.ntnu.soccer.model.soccer.Country#getLeague <em>League</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Country</em>' container reference.
     * @see #setCountry(Country)
     * @see no.ntnu.soccer.model.soccer.SoccerPackage#getLeague_Country()
     * @see no.ntnu.soccer.model.soccer.Country#getLeague
     * @model opposite="league" required="true" transient="false"
     * @generated
     */
    Country getCountry();

    /**
     * Sets the value of the '{@link no.ntnu.soccer.model.soccer.League#getCountry <em>Country</em>}' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Country</em>' container reference.
     * @see #getCountry()
     * @generated
     */
    void setCountry(Country value);

    /**
     * Returns the value of the '<em><b>Seasons</b></em>' containment reference list.
     * The list contents are of type {@link no.ntnu.soccer.model.soccer.Season}.
     * It is bidirectional and its opposite is '{@link no.ntnu.soccer.model.soccer.Season#getLeague <em>League</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Seasons</em>' containment reference list.
     * @see no.ntnu.soccer.model.soccer.SoccerPackage#getLeague_Seasons()
     * @see no.ntnu.soccer.model.soccer.Season#getLeague
     * @model opposite="league" containment="true"
     * @generated
     */
    EList<Season> getSeasons();

    /**
     * Returns the value of the '<em><b>Teams</b></em>' containment reference list.
     * The list contents are of type {@link no.ntnu.soccer.model.soccer.Team}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Teams</em>' containment reference list.
     * @see no.ntnu.soccer.model.soccer.SoccerPackage#getLeague_Teams()
     * @model containment="true"
     * @generated
     */
    EList<Team> getTeams();

} // League
