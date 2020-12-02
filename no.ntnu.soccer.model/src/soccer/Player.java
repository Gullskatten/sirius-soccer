/**
 */
package soccer;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Player</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link soccer.Player#getId <em>Id</em>}</li>
 *   <li>{@link soccer.Player#getName <em>Name</em>}</li>
 *   <li>{@link soccer.Player#getHeight <em>Height</em>}</li>
 *   <li>{@link soccer.Player#getWeight <em>Weight</em>}</li>
 *   <li>{@link soccer.Player#getTeam <em>Team</em>}</li>
 *   <li>{@link soccer.Player#getPosX <em>Pos X</em>}</li>
 *   <li>{@link soccer.Player#getPosY <em>Pos Y</em>}</li>
 * </ul>
 *
 * @see soccer.SoccerPackage#getPlayer()
 * @model
 * @generated
 */
public interface Player extends EObject {
	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see soccer.SoccerPackage#getPlayer_Id()
	 * @model id="true"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link soccer.Player#getId <em>Id</em>}' attribute.
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
	 * @see soccer.SoccerPackage#getPlayer_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link soccer.Player#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Height</em>' attribute.
	 * @see #setHeight(float)
	 * @see soccer.SoccerPackage#getPlayer_Height()
	 * @model
	 * @generated
	 */
	float getHeight();

	/**
	 * Sets the value of the '{@link soccer.Player#getHeight <em>Height</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Height</em>' attribute.
	 * @see #getHeight()
	 * @generated
	 */
	void setHeight(float value);

	/**
	 * Returns the value of the '<em><b>Weight</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Weight</em>' attribute.
	 * @see #setWeight(float)
	 * @see soccer.SoccerPackage#getPlayer_Weight()
	 * @model
	 * @generated
	 */
	float getWeight();

	/**
	 * Sets the value of the '{@link soccer.Player#getWeight <em>Weight</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Weight</em>' attribute.
	 * @see #getWeight()
	 * @generated
	 */
	void setWeight(float value);

	/**
	 * Returns the value of the '<em><b>Team</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link soccer.Team#getPlayers <em>Players</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Team</em>' container reference.
	 * @see #setTeam(Team)
	 * @see soccer.SoccerPackage#getPlayer_Team()
	 * @see soccer.Team#getPlayers
	 * @model opposite="players" transient="false"
	 * @generated
	 */
	Team getTeam();

	/**
	 * Sets the value of the '{@link soccer.Player#getTeam <em>Team</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Team</em>' container reference.
	 * @see #getTeam()
	 * @generated
	 */
	void setTeam(Team value);

	/**
	 * Returns the value of the '<em><b>Pos X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pos X</em>' attribute.
	 * @see #setPosX(int)
	 * @see soccer.SoccerPackage#getPlayer_PosX()
	 * @model
	 * @generated
	 */
	int getPosX();

	/**
	 * Sets the value of the '{@link soccer.Player#getPosX <em>Pos X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pos X</em>' attribute.
	 * @see #getPosX()
	 * @generated
	 */
	void setPosX(int value);

	/**
	 * Returns the value of the '<em><b>Pos Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pos Y</em>' attribute.
	 * @see #setPosY(int)
	 * @see soccer.SoccerPackage#getPlayer_PosY()
	 * @model
	 * @generated
	 */
	int getPosY();

	/**
	 * Sets the value of the '{@link soccer.Player#getPosY <em>Pos Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pos Y</em>' attribute.
	 * @see #getPosY()
	 * @generated
	 */
	void setPosY(int value);

} // Player
