/**
 */
package soccer.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

import soccer.Match;
import soccer.Opponent;
import soccer.SoccerPackage;
import soccer.Team;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Opponent</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link soccer.impl.OpponentImpl#getMatch <em>Match</em>}</li>
 *   <li>{@link soccer.impl.OpponentImpl#getTeam <em>Team</em>}</li>
 *   <li>{@link soccer.impl.OpponentImpl#getOpponentType <em>Opponent Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OpponentImpl extends MinimalEObjectImpl.Container implements Opponent {
	/**
	 * The cached value of the '{@link #getTeam() <em>Team</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTeam()
	 * @generated
	 * @ordered
	 */
	protected Team team;

	/**
	 * The default value of the '{@link #getOpponentType() <em>Opponent Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOpponentType()
	 * @generated
	 * @ordered
	 */
	protected static final String OPPONENT_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOpponentType() <em>Opponent Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOpponentType()
	 * @generated
	 * @ordered
	 */
	protected String opponentType = OPPONENT_TYPE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OpponentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SoccerPackage.Literals.OPPONENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Match getMatch() {
		if (eContainerFeatureID() != SoccerPackage.OPPONENT__MATCH) return null;
		return (Match)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMatch(Match newMatch, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newMatch, SoccerPackage.OPPONENT__MATCH, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMatch(Match newMatch) {
		if (newMatch != eInternalContainer() || (eContainerFeatureID() != SoccerPackage.OPPONENT__MATCH && newMatch != null)) {
			if (EcoreUtil.isAncestor(this, newMatch))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newMatch != null)
				msgs = ((InternalEObject)newMatch).eInverseAdd(this, SoccerPackage.MATCH__OPPONENTS, Match.class, msgs);
			msgs = basicSetMatch(newMatch, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SoccerPackage.OPPONENT__MATCH, newMatch, newMatch));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Team getTeam() {
		if (team != null && team.eIsProxy()) {
			InternalEObject oldTeam = (InternalEObject)team;
			team = (Team)eResolveProxy(oldTeam);
			if (team != oldTeam) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SoccerPackage.OPPONENT__TEAM, oldTeam, team));
			}
		}
		return team;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Team basicGetTeam() {
		return team;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTeam(Team newTeam) {
		Team oldTeam = team;
		team = newTeam;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SoccerPackage.OPPONENT__TEAM, oldTeam, team));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getOpponentType() {
		return opponentType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOpponentType(String newOpponentType) {
		String oldOpponentType = opponentType;
		opponentType = newOpponentType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SoccerPackage.OPPONENT__OPPONENT_TYPE, oldOpponentType, opponentType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SoccerPackage.OPPONENT__MATCH:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetMatch((Match)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SoccerPackage.OPPONENT__MATCH:
				return basicSetMatch(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case SoccerPackage.OPPONENT__MATCH:
				return eInternalContainer().eInverseRemove(this, SoccerPackage.MATCH__OPPONENTS, Match.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SoccerPackage.OPPONENT__MATCH:
				return getMatch();
			case SoccerPackage.OPPONENT__TEAM:
				if (resolve) return getTeam();
				return basicGetTeam();
			case SoccerPackage.OPPONENT__OPPONENT_TYPE:
				return getOpponentType();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case SoccerPackage.OPPONENT__MATCH:
				setMatch((Match)newValue);
				return;
			case SoccerPackage.OPPONENT__TEAM:
				setTeam((Team)newValue);
				return;
			case SoccerPackage.OPPONENT__OPPONENT_TYPE:
				setOpponentType((String)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case SoccerPackage.OPPONENT__MATCH:
				setMatch((Match)null);
				return;
			case SoccerPackage.OPPONENT__TEAM:
				setTeam((Team)null);
				return;
			case SoccerPackage.OPPONENT__OPPONENT_TYPE:
				setOpponentType(OPPONENT_TYPE_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case SoccerPackage.OPPONENT__MATCH:
				return getMatch() != null;
			case SoccerPackage.OPPONENT__TEAM:
				return team != null;
			case SoccerPackage.OPPONENT__OPPONENT_TYPE:
				return OPPONENT_TYPE_EDEFAULT == null ? opponentType != null : !OPPONENT_TYPE_EDEFAULT.equals(opponentType);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (opponentType: ");
		result.append(opponentType);
		result.append(')');
		return result.toString();
	}

} //OpponentImpl
