/**
 */
package no.ntnu.soccer.model.soccer.impl;

import java.util.Collection;
import no.ntnu.soccer.model.soccer.Placement;
import no.ntnu.soccer.model.soccer.SoccerPackage;
import no.ntnu.soccer.model.soccer.Standing;
import no.ntnu.soccer.model.soccer.Team;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Placement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link no.ntnu.soccer.model.soccer.impl.PlacementImpl#getRank <em>Rank</em>}</li>
 *   <li>{@link no.ntnu.soccer.model.soccer.impl.PlacementImpl#getWins <em>Wins</em>}</li>
 *   <li>{@link no.ntnu.soccer.model.soccer.impl.PlacementImpl#getDraws <em>Draws</em>}</li>
 *   <li>{@link no.ntnu.soccer.model.soccer.impl.PlacementImpl#getLosses <em>Losses</em>}</li>
 *   <li>{@link no.ntnu.soccer.model.soccer.impl.PlacementImpl#getGoalsFor <em>Goals For</em>}</li>
 *   <li>{@link no.ntnu.soccer.model.soccer.impl.PlacementImpl#getGoalsAgainst <em>Goals Against</em>}</li>
 *   <li>{@link no.ntnu.soccer.model.soccer.impl.PlacementImpl#getGoalDifference <em>Goal Difference</em>}</li>
 *   <li>{@link no.ntnu.soccer.model.soccer.impl.PlacementImpl#getPoints <em>Points</em>}</li>
 *   <li>{@link no.ntnu.soccer.model.soccer.impl.PlacementImpl#getTeam <em>Team</em>}</li>
 *   <li>{@link no.ntnu.soccer.model.soccer.impl.PlacementImpl#getStanding <em>Standing</em>}</li>
 *   <li>{@link no.ntnu.soccer.model.soccer.impl.PlacementImpl#getId <em>Id</em>}</li>
 *   <li>{@link no.ntnu.soccer.model.soccer.impl.PlacementImpl#getSeason <em>Season</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PlacementImpl extends MinimalEObjectImpl.Container implements Placement {
	/**
	 * The default value of the '{@link #getRank() <em>Rank</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRank()
	 * @generated
	 * @ordered
	 */
	protected static final int RANK_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getRank() <em>Rank</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRank()
	 * @generated
	 * @ordered
	 */
	protected int rank = RANK_EDEFAULT;

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
	 * The default value of the '{@link #getGoalsFor() <em>Goals For</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGoalsFor()
	 * @generated
	 * @ordered
	 */
	protected static final int GOALS_FOR_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getGoalsFor() <em>Goals For</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGoalsFor()
	 * @generated
	 * @ordered
	 */
	protected int goalsFor = GOALS_FOR_EDEFAULT;

	/**
	 * The default value of the '{@link #getGoalsAgainst() <em>Goals Against</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGoalsAgainst()
	 * @generated
	 * @ordered
	 */
	protected static final int GOALS_AGAINST_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getGoalsAgainst() <em>Goals Against</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGoalsAgainst()
	 * @generated
	 * @ordered
	 */
	protected int goalsAgainst = GOALS_AGAINST_EDEFAULT;

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
	 * The default value of the '{@link #getPoints() <em>Points</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPoints()
	 * @generated
	 * @ordered
	 */
	protected static final int POINTS_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getPoints() <em>Points</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPoints()
	 * @generated
	 * @ordered
	 */
	protected int points = POINTS_EDEFAULT;

	/**
	 * The cached value of the '{@link #getTeam() <em>Team</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTeam()
	 * @generated
	 * @ordered
	 */
	protected EList<Team> team;

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
	 * The default value of the '{@link #getSeason() <em>Season</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSeason()
	 * @generated
	 * @ordered
	 */
	protected static final String SEASON_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSeason() <em>Season</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSeason()
	 * @generated
	 * @ordered
	 */
	protected String season = SEASON_EDEFAULT;

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
	public int getRank() {
		return rank;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRank(int newRank) {
		int oldRank = rank;
		rank = newRank;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SoccerPackage.PLACEMENT__RANK, oldRank, rank));
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
	public int getGoalsFor() {
		return goalsFor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGoalsFor(int newGoalsFor) {
		int oldGoalsFor = goalsFor;
		goalsFor = newGoalsFor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SoccerPackage.PLACEMENT__GOALS_FOR, oldGoalsFor,
					goalsFor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getGoalsAgainst() {
		return goalsAgainst;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGoalsAgainst(int newGoalsAgainst) {
		int oldGoalsAgainst = goalsAgainst;
		goalsAgainst = newGoalsAgainst;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SoccerPackage.PLACEMENT__GOALS_AGAINST,
					oldGoalsAgainst, goalsAgainst));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated not
	 */
	public int getGoalDifference() {
		return goalsFor - goalsAgainst;
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
			eNotify(new ENotificationImpl(this, Notification.SET, SoccerPackage.PLACEMENT__GOAL_DIFFERENCE,
					oldGoalDifference, goalDifference));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getPoints() {
		return points;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPoints(int newPoints) {
		int oldPoints = points;
		points = newPoints;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SoccerPackage.PLACEMENT__POINTS, oldPoints, points));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Team> getTeam() {
		if (team == null) {
			team = new EObjectWithInverseResolvingEList<Team>(Team.class, this, SoccerPackage.PLACEMENT__TEAM,
					SoccerPackage.TEAM__PLACEMENTS);
		}
		return team;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Standing getStanding() {
		if (eContainerFeatureID() != SoccerPackage.PLACEMENT__STANDING)
			return null;
		return (Standing) eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStanding(Standing newStanding, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject) newStanding, SoccerPackage.PLACEMENT__STANDING, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStanding(Standing newStanding) {
		if (newStanding != eInternalContainer()
				|| (eContainerFeatureID() != SoccerPackage.PLACEMENT__STANDING && newStanding != null)) {
			if (EcoreUtil.isAncestor(this, newStanding))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newStanding != null)
				msgs = ((InternalEObject) newStanding).eInverseAdd(this, SoccerPackage.STANDING__PLACEMENTS,
						Standing.class, msgs);
			msgs = basicSetStanding(newStanding, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SoccerPackage.PLACEMENT__STANDING, newStanding,
					newStanding));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SoccerPackage.PLACEMENT__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSeason() {
		return season;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSeason(String newSeason) {
		String oldSeason = season;
		season = newSeason;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SoccerPackage.PLACEMENT__SEASON, oldSeason, season));
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
		case SoccerPackage.PLACEMENT__TEAM:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getTeam()).basicAdd(otherEnd, msgs);
		case SoccerPackage.PLACEMENT__STANDING:
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			return basicSetStanding((Standing) otherEnd, msgs);
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
		case SoccerPackage.PLACEMENT__TEAM:
			return ((InternalEList<?>) getTeam()).basicRemove(otherEnd, msgs);
		case SoccerPackage.PLACEMENT__STANDING:
			return basicSetStanding(null, msgs);
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
		case SoccerPackage.PLACEMENT__STANDING:
			return eInternalContainer().eInverseRemove(this, SoccerPackage.STANDING__PLACEMENTS, Standing.class, msgs);
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
		case SoccerPackage.PLACEMENT__RANK:
			return getRank();
		case SoccerPackage.PLACEMENT__WINS:
			return getWins();
		case SoccerPackage.PLACEMENT__DRAWS:
			return getDraws();
		case SoccerPackage.PLACEMENT__LOSSES:
			return getLosses();
		case SoccerPackage.PLACEMENT__GOALS_FOR:
			return getGoalsFor();
		case SoccerPackage.PLACEMENT__GOALS_AGAINST:
			return getGoalsAgainst();
		case SoccerPackage.PLACEMENT__GOAL_DIFFERENCE:
			return getGoalDifference();
		case SoccerPackage.PLACEMENT__POINTS:
			return getPoints();
		case SoccerPackage.PLACEMENT__TEAM:
			return getTeam();
		case SoccerPackage.PLACEMENT__STANDING:
			return getStanding();
		case SoccerPackage.PLACEMENT__ID:
			return getId();
		case SoccerPackage.PLACEMENT__SEASON:
			return getSeason();
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
		case SoccerPackage.PLACEMENT__RANK:
			setRank((Integer) newValue);
			return;
		case SoccerPackage.PLACEMENT__WINS:
			setWins((Integer) newValue);
			return;
		case SoccerPackage.PLACEMENT__DRAWS:
			setDraws((Integer) newValue);
			return;
		case SoccerPackage.PLACEMENT__LOSSES:
			setLosses((Integer) newValue);
			return;
		case SoccerPackage.PLACEMENT__GOALS_FOR:
			setGoalsFor((Integer) newValue);
			return;
		case SoccerPackage.PLACEMENT__GOALS_AGAINST:
			setGoalsAgainst((Integer) newValue);
			return;
		case SoccerPackage.PLACEMENT__GOAL_DIFFERENCE:
			setGoalDifference((Integer) newValue);
			return;
		case SoccerPackage.PLACEMENT__POINTS:
			setPoints((Integer) newValue);
			return;
		case SoccerPackage.PLACEMENT__TEAM:
			getTeam().clear();
			getTeam().addAll((Collection<? extends Team>) newValue);
			return;
		case SoccerPackage.PLACEMENT__STANDING:
			setStanding((Standing) newValue);
			return;
		case SoccerPackage.PLACEMENT__ID:
			setId((String) newValue);
			return;
		case SoccerPackage.PLACEMENT__SEASON:
			setSeason((String) newValue);
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
		case SoccerPackage.PLACEMENT__RANK:
			setRank(RANK_EDEFAULT);
			return;
		case SoccerPackage.PLACEMENT__WINS:
			setWins(WINS_EDEFAULT);
			return;
		case SoccerPackage.PLACEMENT__DRAWS:
			setDraws(DRAWS_EDEFAULT);
			return;
		case SoccerPackage.PLACEMENT__LOSSES:
			setLosses(LOSSES_EDEFAULT);
			return;
		case SoccerPackage.PLACEMENT__GOALS_FOR:
			setGoalsFor(GOALS_FOR_EDEFAULT);
			return;
		case SoccerPackage.PLACEMENT__GOALS_AGAINST:
			setGoalsAgainst(GOALS_AGAINST_EDEFAULT);
			return;
		case SoccerPackage.PLACEMENT__GOAL_DIFFERENCE:
			setGoalDifference(GOAL_DIFFERENCE_EDEFAULT);
			return;
		case SoccerPackage.PLACEMENT__POINTS:
			setPoints(POINTS_EDEFAULT);
			return;
		case SoccerPackage.PLACEMENT__TEAM:
			getTeam().clear();
			return;
		case SoccerPackage.PLACEMENT__STANDING:
			setStanding((Standing) null);
			return;
		case SoccerPackage.PLACEMENT__ID:
			setId(ID_EDEFAULT);
			return;
		case SoccerPackage.PLACEMENT__SEASON:
			setSeason(SEASON_EDEFAULT);
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
		case SoccerPackage.PLACEMENT__RANK:
			return rank != RANK_EDEFAULT;
		case SoccerPackage.PLACEMENT__WINS:
			return wins != WINS_EDEFAULT;
		case SoccerPackage.PLACEMENT__DRAWS:
			return draws != DRAWS_EDEFAULT;
		case SoccerPackage.PLACEMENT__LOSSES:
			return losses != LOSSES_EDEFAULT;
		case SoccerPackage.PLACEMENT__GOALS_FOR:
			return goalsFor != GOALS_FOR_EDEFAULT;
		case SoccerPackage.PLACEMENT__GOALS_AGAINST:
			return goalsAgainst != GOALS_AGAINST_EDEFAULT;
		case SoccerPackage.PLACEMENT__GOAL_DIFFERENCE:
			return goalDifference != GOAL_DIFFERENCE_EDEFAULT;
		case SoccerPackage.PLACEMENT__POINTS:
			return points != POINTS_EDEFAULT;
		case SoccerPackage.PLACEMENT__TEAM:
			return team != null && !team.isEmpty();
		case SoccerPackage.PLACEMENT__STANDING:
			return getStanding() != null;
		case SoccerPackage.PLACEMENT__ID:
			return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
		case SoccerPackage.PLACEMENT__SEASON:
			return SEASON_EDEFAULT == null ? season != null : !SEASON_EDEFAULT.equals(season);
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
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (rank: ");
		result.append(rank);
		result.append(", wins: ");
		result.append(wins);
		result.append(", draws: ");
		result.append(draws);
		result.append(", losses: ");
		result.append(losses);
		result.append(", goalsFor: ");
		result.append(goalsFor);
		result.append(", goalsAgainst: ");
		result.append(goalsAgainst);
		result.append(", goalDifference: ");
		result.append(goalDifference);
		result.append(", points: ");
		result.append(points);
		result.append(", id: ");
		result.append(id);
		result.append(", season: ");
		result.append(season);
		result.append(')');
		return result.toString();
	}

} //PlacementImpl
