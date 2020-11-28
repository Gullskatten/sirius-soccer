/**
 */
package soccer.impl;

import java.util.Date;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

import soccer.Match;
import soccer.MatchDay;
import soccer.SoccerPackage;
import soccer.Team;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Match</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link soccer.impl.MatchImpl#getMatchDay <em>Match Day</em>}</li>
 *   <li>{@link soccer.impl.MatchImpl#getDate <em>Date</em>}</li>
 *   <li>{@link soccer.impl.MatchImpl#getHomeTeam <em>Home Team</em>}</li>
 *   <li>{@link soccer.impl.MatchImpl#getAwayTeam <em>Away Team</em>}</li>
 *   <li>{@link soccer.impl.MatchImpl#getHomeTeamGoal <em>Home Team Goal</em>}</li>
 *   <li>{@link soccer.impl.MatchImpl#getAwayTeamGoal <em>Away Team Goal</em>}</li>
 *   <li>{@link soccer.impl.MatchImpl#getWinner <em>Winner</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MatchImpl extends MinimalEObjectImpl.Container implements Match {
	/**
	 * The default value of the '{@link #getDate() <em>Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDate()
	 * @generated
	 * @ordered
	 */
	protected static final Date DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDate() <em>Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDate()
	 * @generated
	 * @ordered
	 */
	protected Date date = DATE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getHomeTeam() <em>Home Team</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHomeTeam()
	 * @generated
	 * @ordered
	 */
	protected Team homeTeam;

	/**
	 * The cached value of the '{@link #getAwayTeam() <em>Away Team</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAwayTeam()
	 * @generated
	 * @ordered
	 */
	protected Team awayTeam;

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
	 * The default value of the '{@link #getWinner() <em>Winner</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWinner()
	 * @generated
	 * @ordered
	 */
	protected static final String WINNER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getWinner() <em>Winner</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWinner()
	 * @generated
	 * @ordered
	 */
	protected String winner = WINNER_EDEFAULT;

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
				msgs = ((InternalEObject)newMatchDay).eInverseAdd(this, SoccerPackage.MATCH_DAY__MATCH, MatchDay.class, msgs);
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
	public Date getDate() {
		return date;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDate(Date newDate) {
		Date oldDate = date;
		date = newDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SoccerPackage.MATCH__DATE, oldDate, date));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Team getHomeTeam() {
		if (homeTeam != null && homeTeam.eIsProxy()) {
			InternalEObject oldHomeTeam = (InternalEObject)homeTeam;
			homeTeam = (Team)eResolveProxy(oldHomeTeam);
			if (homeTeam != oldHomeTeam) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SoccerPackage.MATCH__HOME_TEAM, oldHomeTeam, homeTeam));
			}
		}
		return homeTeam;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Team basicGetHomeTeam() {
		return homeTeam;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHomeTeam(Team newHomeTeam) {
		Team oldHomeTeam = homeTeam;
		homeTeam = newHomeTeam;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SoccerPackage.MATCH__HOME_TEAM, oldHomeTeam, homeTeam));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Team getAwayTeam() {
		if (awayTeam != null && awayTeam.eIsProxy()) {
			InternalEObject oldAwayTeam = (InternalEObject)awayTeam;
			awayTeam = (Team)eResolveProxy(oldAwayTeam);
			if (awayTeam != oldAwayTeam) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SoccerPackage.MATCH__AWAY_TEAM, oldAwayTeam, awayTeam));
			}
		}
		return awayTeam;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Team basicGetAwayTeam() {
		return awayTeam;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAwayTeam(Team newAwayTeam) {
		Team oldAwayTeam = awayTeam;
		awayTeam = newAwayTeam;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SoccerPackage.MATCH__AWAY_TEAM, oldAwayTeam, awayTeam));
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
	public String getWinner() {
		return winner;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWinner(String newWinner) {
		String oldWinner = winner;
		winner = newWinner;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SoccerPackage.MATCH__WINNER, oldWinner, winner));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SoccerPackage.MATCH__MATCH_DAY:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetMatchDay((MatchDay)otherEnd, msgs);
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
				return eInternalContainer().eInverseRemove(this, SoccerPackage.MATCH_DAY__MATCH, MatchDay.class, msgs);
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
			case SoccerPackage.MATCH__DATE:
				return getDate();
			case SoccerPackage.MATCH__HOME_TEAM:
				if (resolve) return getHomeTeam();
				return basicGetHomeTeam();
			case SoccerPackage.MATCH__AWAY_TEAM:
				if (resolve) return getAwayTeam();
				return basicGetAwayTeam();
			case SoccerPackage.MATCH__HOME_TEAM_GOAL:
				return getHomeTeamGoal();
			case SoccerPackage.MATCH__AWAY_TEAM_GOAL:
				return getAwayTeamGoal();
			case SoccerPackage.MATCH__WINNER:
				return getWinner();
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
			case SoccerPackage.MATCH__MATCH_DAY:
				setMatchDay((MatchDay)newValue);
				return;
			case SoccerPackage.MATCH__DATE:
				setDate((Date)newValue);
				return;
			case SoccerPackage.MATCH__HOME_TEAM:
				setHomeTeam((Team)newValue);
				return;
			case SoccerPackage.MATCH__AWAY_TEAM:
				setAwayTeam((Team)newValue);
				return;
			case SoccerPackage.MATCH__HOME_TEAM_GOAL:
				setHomeTeamGoal((Integer)newValue);
				return;
			case SoccerPackage.MATCH__AWAY_TEAM_GOAL:
				setAwayTeamGoal((Integer)newValue);
				return;
			case SoccerPackage.MATCH__WINNER:
				setWinner((String)newValue);
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
			case SoccerPackage.MATCH__DATE:
				setDate(DATE_EDEFAULT);
				return;
			case SoccerPackage.MATCH__HOME_TEAM:
				setHomeTeam((Team)null);
				return;
			case SoccerPackage.MATCH__AWAY_TEAM:
				setAwayTeam((Team)null);
				return;
			case SoccerPackage.MATCH__HOME_TEAM_GOAL:
				setHomeTeamGoal(HOME_TEAM_GOAL_EDEFAULT);
				return;
			case SoccerPackage.MATCH__AWAY_TEAM_GOAL:
				setAwayTeamGoal(AWAY_TEAM_GOAL_EDEFAULT);
				return;
			case SoccerPackage.MATCH__WINNER:
				setWinner(WINNER_EDEFAULT);
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
			case SoccerPackage.MATCH__DATE:
				return DATE_EDEFAULT == null ? date != null : !DATE_EDEFAULT.equals(date);
			case SoccerPackage.MATCH__HOME_TEAM:
				return homeTeam != null;
			case SoccerPackage.MATCH__AWAY_TEAM:
				return awayTeam != null;
			case SoccerPackage.MATCH__HOME_TEAM_GOAL:
				return homeTeamGoal != HOME_TEAM_GOAL_EDEFAULT;
			case SoccerPackage.MATCH__AWAY_TEAM_GOAL:
				return awayTeamGoal != AWAY_TEAM_GOAL_EDEFAULT;
			case SoccerPackage.MATCH__WINNER:
				return WINNER_EDEFAULT == null ? winner != null : !WINNER_EDEFAULT.equals(winner);
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
		result.append(" (date: ");
		result.append(date);
		result.append(", homeTeamGoal: ");
		result.append(homeTeamGoal);
		result.append(", awayTeamGoal: ");
		result.append(awayTeamGoal);
		result.append(", winner: ");
		result.append(winner);
		result.append(')');
		return result.toString();
	}

} //MatchImpl
