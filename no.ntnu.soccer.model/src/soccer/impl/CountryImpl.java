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
import soccer.Country;
import soccer.League;
import soccer.SoccerPackage;
import soccer.Sport;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Country</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link soccer.impl.CountryImpl#getId <em>Id</em>}</li>
 *   <li>{@link soccer.impl.CountryImpl#getName <em>Name</em>}</li>
 *   <li>{@link soccer.impl.CountryImpl#getLeague <em>League</em>}</li>
 *   <li>{@link soccer.impl.CountryImpl#getSport <em>Sport</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CountryImpl extends MinimalEObjectImpl.Container implements Country {
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
	 * The cached value of the '{@link #getLeague() <em>League</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLeague()
	 * @generated
	 * @ordered
	 */
	protected League league;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CountryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SoccerPackage.Literals.COUNTRY;
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
			eNotify(new ENotificationImpl(this, Notification.SET, SoccerPackage.COUNTRY__ID, oldId, id));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SoccerPackage.COUNTRY__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public League getLeague() {
		return league;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLeague(League newLeague, NotificationChain msgs) {
		League oldLeague = league;
		league = newLeague;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SoccerPackage.COUNTRY__LEAGUE, oldLeague, newLeague);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLeague(League newLeague) {
		if (newLeague != league) {
			NotificationChain msgs = null;
			if (league != null)
				msgs = ((InternalEObject)league).eInverseRemove(this, SoccerPackage.LEAGUE__COUNTRY, League.class, msgs);
			if (newLeague != null)
				msgs = ((InternalEObject)newLeague).eInverseAdd(this, SoccerPackage.LEAGUE__COUNTRY, League.class, msgs);
			msgs = basicSetLeague(newLeague, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SoccerPackage.COUNTRY__LEAGUE, newLeague, newLeague));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Sport getSport() {
		if (eContainerFeatureID() != SoccerPackage.COUNTRY__SPORT) return null;
		return (Sport)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSport(Sport newSport, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newSport, SoccerPackage.COUNTRY__SPORT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSport(Sport newSport) {
		if (newSport != eInternalContainer() || (eContainerFeatureID() != SoccerPackage.COUNTRY__SPORT && newSport != null)) {
			if (EcoreUtil.isAncestor(this, newSport))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newSport != null)
				msgs = ((InternalEObject)newSport).eInverseAdd(this, SoccerPackage.SPORT__COUNTRIES, Sport.class, msgs);
			msgs = basicSetSport(newSport, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SoccerPackage.COUNTRY__SPORT, newSport, newSport));
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
			case SoccerPackage.COUNTRY__LEAGUE:
				if (league != null)
					msgs = ((InternalEObject)league).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SoccerPackage.COUNTRY__LEAGUE, null, msgs);
				return basicSetLeague((League)otherEnd, msgs);
			case SoccerPackage.COUNTRY__SPORT:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetSport((Sport)otherEnd, msgs);
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
			case SoccerPackage.COUNTRY__LEAGUE:
				return basicSetLeague(null, msgs);
			case SoccerPackage.COUNTRY__SPORT:
				return basicSetSport(null, msgs);
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
			case SoccerPackage.COUNTRY__SPORT:
				return eInternalContainer().eInverseRemove(this, SoccerPackage.SPORT__COUNTRIES, Sport.class, msgs);
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
			case SoccerPackage.COUNTRY__ID:
				return getId();
			case SoccerPackage.COUNTRY__NAME:
				return getName();
			case SoccerPackage.COUNTRY__LEAGUE:
				return getLeague();
			case SoccerPackage.COUNTRY__SPORT:
				return getSport();
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
			case SoccerPackage.COUNTRY__ID:
				setId((String)newValue);
				return;
			case SoccerPackage.COUNTRY__NAME:
				setName((String)newValue);
				return;
			case SoccerPackage.COUNTRY__LEAGUE:
				setLeague((League)newValue);
				return;
			case SoccerPackage.COUNTRY__SPORT:
				setSport((Sport)newValue);
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
			case SoccerPackage.COUNTRY__ID:
				setId(ID_EDEFAULT);
				return;
			case SoccerPackage.COUNTRY__NAME:
				setName(NAME_EDEFAULT);
				return;
			case SoccerPackage.COUNTRY__LEAGUE:
				setLeague((League)null);
				return;
			case SoccerPackage.COUNTRY__SPORT:
				setSport((Sport)null);
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
			case SoccerPackage.COUNTRY__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case SoccerPackage.COUNTRY__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case SoccerPackage.COUNTRY__LEAGUE:
				return league != null;
			case SoccerPackage.COUNTRY__SPORT:
				return getSport() != null;
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

} //CountryImpl
