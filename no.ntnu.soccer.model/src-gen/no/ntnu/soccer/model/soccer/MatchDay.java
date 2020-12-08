/**
 */
package no.ntnu.soccer.model.soccer;

import org.eclipse.emf.common.util.EList;

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
 *   <li>{@link no.ntnu.soccer.model.soccer.MatchDay#getDate <em>Date</em>}</li>
 *   <li>{@link no.ntnu.soccer.model.soccer.MatchDay#getMatches <em>Matches</em>}</li>
 * </ul>
 *
 * @see no.ntnu.soccer.model.soccer.SoccerPackage#getMatchDay()
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
     * @see no.ntnu.soccer.model.soccer.SoccerPackage#getMatchDay_Date()
     * @model
     * @generated
     */
    String getDate();

    /**
     * Sets the value of the '{@link no.ntnu.soccer.model.soccer.MatchDay#getDate <em>Date</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Date</em>' attribute.
     * @see #getDate()
     * @generated
     */
    void setDate(String value);

    /**
     * Returns the value of the '<em><b>Matches</b></em>' containment reference list.
     * The list contents are of type {@link no.ntnu.soccer.model.soccer.Match}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Matches</em>' containment reference list.
     * @see no.ntnu.soccer.model.soccer.SoccerPackage#getMatchDay_Matches()
     * @model containment="true"
     * @generated
     */
    EList<Match> getMatches();

} // MatchDay
