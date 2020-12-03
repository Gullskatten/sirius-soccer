/**
 */
package soccer.impl;

import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EcoreUtil;

import org.eclipse.emf.ecore.util.InternalEList;
import soccer.Match;
import soccer.MatchDay;
import soccer.MatchResult;
import soccer.Opponent;
import soccer.SoccerPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Match</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link soccer.impl.MatchImpl#getMatchDay <em>Match Day</em>}</li>
 *   <li>{@link soccer.impl.MatchImpl#getId <em>Id</em>}</li>
 *   <li>{@link soccer.impl.MatchImpl#getHomeTeamGoal <em>Home Team Goal</em>}</li>
 *   <li>{@link soccer.impl.MatchImpl#getAwayTeamGoal <em>Away Team Goal</em>}</li>
 *   <li>{@link soccer.impl.MatchImpl#getResult <em>Result</em>}</li>
 *   <li>{@link soccer.impl.MatchImpl#getOpponents <em>Opponents</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MatchImpl extends MinimalEObjectImpl.Container implements Match {
	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected String id = ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getHomeTeamGoal() <em>Home Team Goal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHomeTeamGoal()
	 * @generated
	 * @ordered
	 */
	protected static final int HOME_TEAM_GOAL_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getHomeTeamGoal() <em>Home Team Goal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHomeTeamGoal()
	 * @generated
	 * @ordered
	 */
	protected int homeTeamGoal = HOME_TEAM_GOAL_EDEFAULT;

	/**
	 * The default value of the '{@link #getAwayTeamGoal() <em>Away Team Goal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAwayTeamGoal()
	 * @generated
	 * @ordered
	 */
	protected static final int AWAY_TEAM_GOAL_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getAwayTeamGoal() <em>Away Team Goal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAwayTeamGoal()
	 * @generated
	 * @ordered
	 */
	protected int awayTeamGoal = AWAY_TEAM_GOAL_EDEFAULT;

	/**
	 * The default value of the '{@link #getResult() <em>Result</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResult()
	 * @generated
	 * @ordered
	 */
	protected static final MatchResult RESULT_EDEFAULT = MatchResult.HOME_WIN;

	/**
	 * The cached value of the '{@link #getResult() <em>Result</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResult()
	 * @generated
	 * @ordered
	 */
	protected MatchResult result = RESULT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getOpponents() <em>Opponents</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOpponents()
	 * @generated
	 * @ordered
	 */
	protected EList<Opponent> opponents;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MatchImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SoccerPackage.Literals.MATCH;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MatchDay getMatchDay() {
		if (eContainerFeatureID() != SoccerPackage.MATCH__MATCH_DAY) return null;
		return (MatchDay)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMatchDay(MatchDay newMatchDay, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newMatchDay, SoccerPackage.MATCH__MATCH_DAY, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMatchDay(MatchDay newMatchDay) {
		if (newMatchDay != eInternalContainer() || (eContainerFeatureID() != SoccerPackage.MATCH__MATCH_DAY && newMatchDay != null)) {
			if (EcoreUtil.isAncestor(this, newMatchDay))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newMatchDay != null)
				msgs = ((InternalEObject)newMatchDay).eInverseAdd(this, SoccerPackage.MATCH_DAY__MATCHES, MatchDay.class, msgs);
			msgs = basicSetMatchDay(newMatchDay, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SoccerPackage.MATCH__MATCH_DAY, newMatchDay, newMatchDay));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setId(String newId) {
		String oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SoccerPackage.MATCH__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getHomeTeamGoal() {
		return homeTeamGoal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHomeTeamGoal(int newHomeTeamGoal) {
		int oldHomeTeamGoal = homeTeamGoal;
		homeTeamGoal = newHomeTeamGoal;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SoccerPackage.MATCH__HOME_TEAM_GOAL, oldHomeTeamGoal, homeTeamGoal));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getAwayTeamGoal() {
		return awayTeamGoal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAwayTeamGoal(int newAwayTeamGoal) {
		int oldAwayTeamGoal = awayTeamGoal;
		awayTeamGoal = newAwayTeamGoal;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SoccerPackage.MATCH__AWAY_TEAM_GOAL, oldAwayTeamGoal, awayTeamGoal));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MatchResult getResult() {
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResult(MatchResult newResult) {
		MatchResult oldResult = result;
		result = newResult == null ? RESULT_EDEFAULT : newResult;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SoccerPackage.MATCH__RESULT, oldResult, result));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Opponent> getOpponents() {
		if (opponents == null) {
			opponents = new EObjectContainmentWithInverseEList<Opponent>(Opponent.class, this, SoccerPackage.MATCH__OPPONENTS, SoccerPackage.OPPONENT__MATCH);
		}
		return opponents;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SoccerPackage.MATCH__MATCH_DAY:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetMatchDay((MatchDay)otherEnd, msgs);
			case SoccerPackage.MATCH__OPPONENTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getOpponents()).basicAdd(otherEnd, msgs);
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
			case SoccerPackage.MATCH__MATCH_DAY:
				return basicSetMatchDay(null, msgs);
			case SoccerPackage.MATCH__OPPONENTS:
				return ((InternalEList<?>)getOpponents()).basicRemove(otherEnd, msgs);
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
			case SoccerPackage.MATCH__MATCH_DAY:
				return eInternalContainer().eInverseRemove(this, SoccerPackage.MATCH_DAY__MATCHES, MatchDay.class, msgs);
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
			case SoccerPackage.MATCH__MATCH_DAY:
				return getMatchDay();
			case SoccerPackage.MATCH__ID:
				return getId();
			case SoccerPackage.MATCH__HOME_TEAM_GOAL:
				return getHomeTeamGoal();
			case SoccerPackage.MATCH__AWAY_TEAM_GOAL:
				return getAwayTeamGoal();
			case SoccerPackage.MATCH__RESULT:
				return getResult();
			case SoccerPackage.MATCH__OPPONENTS:
				return getOpponents();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case SoccerPackage.MATCH__MATCH_DAY:
				setMatchDay((MatchDay)newValue);
				return;
			case SoccerPackage.MATCH__ID:
				setId((String)newValue);
				return;
			case SoccerPackage.MATCH__HOME_TEAM_GOAL:
				setHomeTeamGoal((Integer)newValue);
				return;
			case SoccerPackage.MATCH__AWAY_TEAM_GOAL:
				setAwayTeamGoal((Integer)newValue);
				return;
			case SoccerPackage.MATCH__RESULT:
				setResult((MatchResult)newValue);
				return;
			case SoccerPackage.MATCH__OPPONENTS:
				getOpponents().clear();
				getOpponents().addAll((Collection<? extends Opponent>)newValue);
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
			case SoccerPackage.MATCH__MATCH_DAY:
				setMatchDay((MatchDay)null);
				return;
			case SoccerPackage.MATCH__ID:
				setId(ID_EDEFAULT);
				return;
			case SoccerPackage.MATCH__HOME_TEAM_GOAL:
				setHomeTeamGoal(HOME_TEAM_GOAL_EDEFAULT);
				return;
			case SoccerPackage.MATCH__AWAY_TEAM_GOAL:
				setAwayTeamGoal(AWAY_TEAM_GOAL_EDEFAULT);
				return;
			case SoccerPackage.MATCH__RESULT:
				setResult(RESULT_EDEFAULT);
				return;
			case SoccerPackage.MATCH__OPPONENTS:
				getOpponents().clear();
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
			case SoccerPackage.MATCH__MATCH_DAY:
				return getMatchDay() != null;
			case SoccerPackage.MATCH__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case SoccerPackage.MATCH__HOME_TEAM_GOAL:
				return homeTeamGoal != HOME_TEAM_GOAL_EDEFAULT;
			case SoccerPackage.MATCH__AWAY_TEAM_GOAL:
				return awayTeamGoal != AWAY_TEAM_GOAL_EDEFAULT;
			case SoccerPackage.MATCH__RESULT:
				return result != RESULT_EDEFAULT;
			case SoccerPackage.MATCH__OPPONENTS:
				return opponents != null && !opponents.isEmpty();
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
		result.append(" (id: ");
		result.append(id);
		result.append(", homeTeamGoal: ");
		result.append(homeTeamGoal);
		result.append(", awayTeamGoal: ");
		result.append(awayTeamGoal);
		result.append(", result: ");
		result.append(result);
		result.append(')');
		return result.toString();
	}

} //MatchImpl
