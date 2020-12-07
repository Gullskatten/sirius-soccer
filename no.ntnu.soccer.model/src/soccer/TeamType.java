/**
 */
package soccer;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Team Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see soccer.SoccerPackage#getTeamType()
 * @model
 * @generated
 */
public enum TeamType implements Enumerator {
	/**
	 * The '<em><b>HOME TEAM</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HOME_TEAM_VALUE
	 * @generated
	 * @ordered
	 */
	HOME_TEAM(1, "HOME_TEAM", "HOME_TEAM"),

	/**
	 * The '<em><b>AWAY TEAM</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #AWAY_TEAM_VALUE
	 * @generated
	 * @ordered
	 */
	AWAY_TEAM(2, "AWAY_TEAM", "AWAY_TEAM");

	/**
	 * The '<em><b>HOME TEAM</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HOME_TEAM
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int HOME_TEAM_VALUE = 1;

	/**
	 * The '<em><b>AWAY TEAM</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #AWAY_TEAM
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int AWAY_TEAM_VALUE = 2;

	/**
	 * An array of all the '<em><b>Team Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final TeamType[] VALUES_ARRAY =
		new TeamType[] {
			HOME_TEAM,
			AWAY_TEAM,
		};

	/**
	 * A public read-only list of all the '<em><b>Team Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<TeamType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Team Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static TeamType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TeamType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Team Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static TeamType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TeamType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Team Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static TeamType get(int value) {
		switch (value) {
			case HOME_TEAM_VALUE: return HOME_TEAM;
			case AWAY_TEAM_VALUE: return AWAY_TEAM;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private TeamType(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
	
} //TeamType
