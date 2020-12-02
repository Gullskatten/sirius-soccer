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

import soccer.Country;
import soccer.League;
import soccer.Season;
import soccer.SoccerPackage;
import soccer.Team;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>League</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link soccer.impl.LeagueImpl#getId <em>Id</em>}</li>
 *   <li>{@link soccer.impl.LeagueImpl#getName <em>Name</em>}</li>
 *   <li>{@link soccer.impl.LeagueImpl#getCountry <em>Country</em>}</li>
 *   <li>{@link soccer.impl.LeagueImpl#getSeason <em>Season</em>}</li>
 *   <li>{@link soccer.impl.LeagueImpl#getTeam <em>Team</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LeagueImpl extends MinimalEObjectImpl.Container implements League {
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
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSeason() <em>Season</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSeason()
	 * @generated
	 * @ordered
	 */
	protected EList<Season> season;

	/**
	 * The cached value of the '{@link #getTeam() <em>Team</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTeam()
	 * @generated
	 * @ordered
	 */
	protected EList<Team> team;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LeagueImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SoccerPackage.Literals.LEAGUE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, SoccerPackage.LEAGUE__ID, oldId, id));
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
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SoccerPackage.LEAGUE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Country getCountry() {
		if (eContainerFeatureID() != SoccerPackage.LEAGUE__COUNTRY) return null;
		return (Country)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCountry(Country newCountry, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newCountry, SoccerPackage.LEAGUE__COUNTRY, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCountry(Country newCountry) {
		if (newCountry != eInternalContainer() || (eContainerFeatureID() != SoccerPackage.LEAGUE__COUNTRY && newCountry != null)) {
			if (EcoreUtil.isAncestor(this, newCountry))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newCountry != null)
				msgs = ((InternalEObject)newCountry).eInverseAdd(this, SoccerPackage.COUNTRY__LEAGUE, Country.class, msgs);
			msgs = basicSetCountry(newCountry, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SoccerPackage.LEAGUE__COUNTRY, newCountry, newCountry));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Season> getSeason() {
		if (season == null) {
			season = new EObjectContainmentWithInverseEList<Season>(Season.class, this, SoccerPackage.LEAGUE__SEASON, SoccerPackage.SEASON__LEAGUE);
		}
		return season;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Team> getTeam() {
		if (team == null) {
			team = new EObjectContainmentWithInverseEList<Team>(Team.class, this, SoccerPackage.LEAGUE__TEAM, SoccerPackage.TEAM__LEAGUE);
		}
		return team;
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
			case SoccerPackage.LEAGUE__COUNTRY:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetCountry((Country)otherEnd, msgs);
			case SoccerPackage.LEAGUE__SEASON:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getSeason()).basicAdd(otherEnd, msgs);
			case SoccerPackage.LEAGUE__TEAM:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getTeam()).basicAdd(otherEnd, msgs);
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
			case SoccerPackage.LEAGUE__COUNTRY:
				return basicSetCountry(null, msgs);
			case SoccerPackage.LEAGUE__SEASON:
				return ((InternalEList<?>)getSeason()).basicRemove(otherEnd, msgs);
			case SoccerPackage.LEAGUE__TEAM:
				return ((InternalEList<?>)getTeam()).basicRemove(otherEnd, msgs);
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
			case SoccerPackage.LEAGUE__COUNTRY:
				return eInternalContainer().eInverseRemove(this, SoccerPackage.COUNTRY__LEAGUE, Country.class, msgs);
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
			case SoccerPackage.LEAGUE__ID:
				return getId();
			case SoccerPackage.LEAGUE__NAME:
				return getName();
			case SoccerPackage.LEAGUE__COUNTRY:
				return getCountry();
			case SoccerPackage.LEAGUE__SEASON:
				return getSeason();
			case SoccerPackage.LEAGUE__TEAM:
				return getTeam();
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
			case SoccerPackage.LEAGUE__ID:
				setId((String)newValue);
				return;
			case SoccerPackage.LEAGUE__NAME:
				setName((String)newValue);
				return;
			case SoccerPackage.LEAGUE__COUNTRY:
				setCountry((Country)newValue);
				return;
			case SoccerPackage.LEAGUE__SEASON:
				getSeason().clear();
				getSeason().addAll((Collection<? extends Season>)newValue);
				return;
			case SoccerPackage.LEAGUE__TEAM:
				getTeam().clear();
				getTeam().addAll((Collection<? extends Team>)newValue);
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
			case SoccerPackage.LEAGUE__ID:
				setId(ID_EDEFAULT);
				return;
			case SoccerPackage.LEAGUE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case SoccerPackage.LEAGUE__COUNTRY:
				setCountry((Country)null);
				return;
			case SoccerPackage.LEAGUE__SEASON:
				getSeason().clear();
				return;
			case SoccerPackage.LEAGUE__TEAM:
				getTeam().clear();
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
			case SoccerPackage.LEAGUE__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case SoccerPackage.LEAGUE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case SoccerPackage.LEAGUE__COUNTRY:
				return getCountry() != null;
			case SoccerPackage.LEAGUE__SEASON:
				return season != null && !season.isEmpty();
			case SoccerPackage.LEAGUE__TEAM:
				return team != null && !team.isEmpty();
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
		result.append(", name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //LeagueImpl
