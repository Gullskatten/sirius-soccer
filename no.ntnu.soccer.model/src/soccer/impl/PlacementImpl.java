/**
 */
package soccer.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import soccer.Placement;
import soccer.SoccerPackage;
import soccer.Team;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Placement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link soccer.impl.PlacementImpl#getAwayTeamGoal <em>Away Team Goal</em>}</li>
 *   <li>{@link soccer.impl.PlacementImpl#getHomeTeamGoal <em>Home Team Goal</em>}</li>
 *   <li>{@link soccer.impl.PlacementImpl#getGoalDifference <em>Goal Difference</em>}</li>
 *   <li>{@link soccer.impl.PlacementImpl#getWins <em>Wins</em>}</li>
 *   <li>{@link soccer.impl.PlacementImpl#getLosses <em>Losses</em>}</li>
 *   <li>{@link soccer.impl.PlacementImpl#getDraws <em>Draws</em>}</li>
 *   <li>{@link soccer.impl.PlacementImpl#getSeasonPoints <em>Season Points</em>}</li>
 *   <li>{@link soccer.impl.PlacementImpl#getTeam <em>Team</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PlacementImpl extends MinimalEObjectImpl.Container implements Placement {
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
	 * The default value of the '{@link #getGoalDifference() <em>Goal Difference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGoalDifference()
	 * @generated
	 * @ordered
	 */
	protected static final int GOAL_DIFFERENCE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getGoalDifference() <em>Goal Difference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGoalDifference()
	 * @generated
	 * @ordered
	 */
	protected int goalDifference = GOAL_DIFFERENCE_EDEFAULT;

	/**
	 * The default value of the '{@link #getWins() <em>Wins</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWins()
	 * @generated
	 * @ordered
	 */
	protected static final int WINS_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getWins() <em>Wins</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWins()
	 * @generated
	 * @ordered
	 */
	protected int wins = WINS_EDEFAULT;

	/**
	 * The default value of the '{@link #getLosses() <em>Losses</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLosses()
	 * @generated
	 * @ordered
	 */
	protected static final int LOSSES_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getLosses() <em>Losses</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLosses()
	 * @generated
	 * @ordered
	 */
	protected int losses = LOSSES_EDEFAULT;

	/**
	 * The default value of the '{@link #getDraws() <em>Draws</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDraws()
	 * @generated
	 * @ordered
	 */
	protected static final int DRAWS_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getDraws() <em>Draws</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDraws()
	 * @generated
	 * @ordered
	 */
	protected int draws = DRAWS_EDEFAULT;

	/**
	 * The default value of the '{@link #getSeasonPoints() <em>Season Points</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSeasonPoints()
	 * @generated
	 * @ordered
	 */
	protected static final int SEASON_POINTS_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getSeasonPoints() <em>Season Points</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSeasonPoints()
	 * @generated
	 * @ordered
	 */
	protected int seasonPoints = SEASON_POINTS_EDEFAULT;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PlacementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SoccerPackage.Literals.PLACEMENT;
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
			eNotify(new ENotificationImpl(this, Notification.SET, SoccerPackage.PLACEMENT__AWAY_TEAM_GOAL, oldAwayTeamGoal, awayTeamGoal));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SoccerPackage.PLACEMENT__HOME_TEAM_GOAL, oldHomeTeamGoal, homeTeamGoal));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getGoalDifference() {
		return goalDifference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGoalDifference(int newGoalDifference) {
		int oldGoalDifference = goalDifference;
		goalDifference = newGoalDifference;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SoccerPackage.PLACEMENT__GOAL_DIFFERENCE, oldGoalDifference, goalDifference));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getWins() {
		return wins;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWins(int newWins) {
		int oldWins = wins;
		wins = newWins;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SoccerPackage.PLACEMENT__WINS, oldWins, wins));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getLosses() {
		return losses;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLosses(int newLosses) {
		int oldLosses = losses;
		losses = newLosses;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SoccerPackage.PLACEMENT__LOSSES, oldLosses, losses));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getDraws() {
		return draws;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDraws(int newDraws) {
		int oldDraws = draws;
		draws = newDraws;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SoccerPackage.PLACEMENT__DRAWS, oldDraws, draws));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getSeasonPoints() {
		return seasonPoints;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSeasonPoints(int newSeasonPoints) {
		int oldSeasonPoints = seasonPoints;
		seasonPoints = newSeasonPoints;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SoccerPackage.PLACEMENT__SEASON_POINTS, oldSeasonPoints, seasonPoints));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SoccerPackage.PLACEMENT__TEAM, oldTeam, team));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SoccerPackage.PLACEMENT__TEAM, oldTeam, team));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SoccerPackage.PLACEMENT__AWAY_TEAM_GOAL:
				return getAwayTeamGoal();
			case SoccerPackage.PLACEMENT__HOME_TEAM_GOAL:
				return getHomeTeamGoal();
			case SoccerPackage.PLACEMENT__GOAL_DIFFERENCE:
				return getGoalDifference();
			case SoccerPackage.PLACEMENT__WINS:
				return getWins();
			case SoccerPackage.PLACEMENT__LOSSES:
				return getLosses();
			case SoccerPackage.PLACEMENT__DRAWS:
				return getDraws();
			case SoccerPackage.PLACEMENT__SEASON_POINTS:
				return getSeasonPoints();
			case SoccerPackage.PLACEMENT__TEAM:
				if (resolve) return getTeam();
				return basicGetTeam();
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
			case SoccerPackage.PLACEMENT__AWAY_TEAM_GOAL:
				setAwayTeamGoal((Integer)newValue);
				return;
			case SoccerPackage.PLACEMENT__HOME_TEAM_GOAL:
				setHomeTeamGoal((Integer)newValue);
				return;
			case SoccerPackage.PLACEMENT__GOAL_DIFFERENCE:
				setGoalDifference((Integer)newValue);
				return;
			case SoccerPackage.PLACEMENT__WINS:
				setWins((Integer)newValue);
				return;
			case SoccerPackage.PLACEMENT__LOSSES:
				setLosses((Integer)newValue);
				return;
			case SoccerPackage.PLACEMENT__DRAWS:
				setDraws((Integer)newValue);
				return;
			case SoccerPackage.PLACEMENT__SEASON_POINTS:
				setSeasonPoints((Integer)newValue);
				return;
			case SoccerPackage.PLACEMENT__TEAM:
				setTeam((Team)newValue);
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
			case SoccerPackage.PLACEMENT__AWAY_TEAM_GOAL:
				setAwayTeamGoal(AWAY_TEAM_GOAL_EDEFAULT);
				return;
			case SoccerPackage.PLACEMENT__HOME_TEAM_GOAL:
				setHomeTeamGoal(HOME_TEAM_GOAL_EDEFAULT);
				return;
			case SoccerPackage.PLACEMENT__GOAL_DIFFERENCE:
				setGoalDifference(GOAL_DIFFERENCE_EDEFAULT);
				return;
			case SoccerPackage.PLACEMENT__WINS:
				setWins(WINS_EDEFAULT);
				return;
			case SoccerPackage.PLACEMENT__LOSSES:
				setLosses(LOSSES_EDEFAULT);
				return;
			case SoccerPackage.PLACEMENT__DRAWS:
				setDraws(DRAWS_EDEFAULT);
				return;
			case SoccerPackage.PLACEMENT__SEASON_POINTS:
				setSeasonPoints(SEASON_POINTS_EDEFAULT);
				return;
			case SoccerPackage.PLACEMENT__TEAM:
				setTeam((Team)null);
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
			case SoccerPackage.PLACEMENT__AWAY_TEAM_GOAL:
				return awayTeamGoal != AWAY_TEAM_GOAL_EDEFAULT;
			case SoccerPackage.PLACEMENT__HOME_TEAM_GOAL:
				return homeTeamGoal != HOME_TEAM_GOAL_EDEFAULT;
			case SoccerPackage.PLACEMENT__GOAL_DIFFERENCE:
				return goalDifference != GOAL_DIFFERENCE_EDEFAULT;
			case SoccerPackage.PLACEMENT__WINS:
				return wins != WINS_EDEFAULT;
			case SoccerPackage.PLACEMENT__LOSSES:
				return losses != LOSSES_EDEFAULT;
			case SoccerPackage.PLACEMENT__DRAWS:
				return draws != DRAWS_EDEFAULT;
			case SoccerPackage.PLACEMENT__SEASON_POINTS:
				return seasonPoints != SEASON_POINTS_EDEFAULT;
			case SoccerPackage.PLACEMENT__TEAM:
				return team != null;
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
		result.append(" (awayTeamGoal: ");
		result.append(awayTeamGoal);
		result.append(", homeTeamGoal: ");
		result.append(homeTeamGoal);
		result.append(", goalDifference: ");
		result.append(goalDifference);
		result.append(", wins: ");
		result.append(wins);
		result.append(", losses: ");
		result.append(losses);
		result.append(", draws: ");
		result.append(draws);
		result.append(", seasonPoints: ");
		result.append(seasonPoints);
		result.append(')');
		return result.toString();
	}

} //PlacementImpl
