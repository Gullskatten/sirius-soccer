/**
 */
package soccer;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Team</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link soccer.Team#getId <em>Id</em>}</li>
 *   <li>{@link soccer.Team#getTeamName <em>Team Name</em>}</li>
 *   <li>{@link soccer.Team#getShortName <em>Short Name</em>}</li>
 *   <li>{@link soccer.Team#getPlayer <em>Player</em>}</li>
 * </ul>
 *
 * @see soccer.SoccerPackage#getTeam()
 * @model
 * @generated
 */
public interface Team extends EObject {
	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see soccer.SoccerPackage#getTeam_Id()
	 * @model
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link soccer.Team#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>Team Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Team Name</em>' attribute.
	 * @see #setTeamName(String)
	 * @see soccer.SoccerPackage#getTeam_TeamName()
	 * @model required="true"
	 * @generated
	 */
	String getTeamName();

	/**
	 * Sets the value of the '{@link soccer.Team#getTeamName <em>Team Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Team Name</em>' attribute.
	 * @see #getTeamName()
	 * @generated
	 */
	void setTeamName(String value);

	/**
	 * Returns the value of the '<em><b>Short Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Short Name</em>' attribute.
	 * @see #setShortName(String)
	 * @see soccer.SoccerPackage#getTeam_ShortName()
	 * @model required="true"
	 * @generated
	 */
	String getShortName();

	/**
	 * Sets the value of the '{@link soccer.Team#getShortName <em>Short Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Short Name</em>' attribute.
	 * @see #getShortName()
	 * @generated
	 */
	void setShortName(String value);

	/**
	 * Returns the value of the '<em><b>Player</b></em>' containment reference list.
	 * The list contents are of type {@link soccer.Player}.
	 * It is bidirectional and its opposite is '{@link soccer.Player#getTeam <em>Team</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Player</em>' containment reference list.
	 * @see soccer.SoccerPackage#getTeam_Player()
	 * @see soccer.Player#getTeam
	 * @model opposite="team" containment="true"
	 * @generated
	 */
	EList<Player> getPlayer();

} // Team
