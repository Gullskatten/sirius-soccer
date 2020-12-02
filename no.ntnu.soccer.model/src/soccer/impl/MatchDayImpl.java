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
import soccer.Season;
import soccer.SoccerPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Match Day</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link soccer.impl.MatchDayImpl#getDate <em>Date</em>}</li>
 *   <li>{@link soccer.impl.MatchDayImpl#getMatches <em>Matches</em>}</li>
 *   <li>{@link soccer.impl.MatchDayImpl#getSeason <em>Season</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MatchDayImpl extends MinimalEObjectImpl.Container implements MatchDay {
	/**
	 * The default value of the '{@link #getDate() <em>Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDate()
	 * @generated
	 * @ordered
	 */
	protected static final String DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDate() <em>Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDate()
	 * @generated
	 * @ordered
	 */
	protected String date = DATE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getMatches() <em>Matches</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMatches()
	 * @generated
	 * @ordered
	 */
	protected EList<Match> matches;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MatchDayImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SoccerPackage.Literals.MATCH_DAY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDate() {
		return date;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDate(String newDate) {
		String oldDate = date;
		date = newDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SoccerPackage.MATCH_DAY__DATE, oldDate, date));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Match> getMatches() {
		if (matches == null) {
			matches = new EObjectContainmentWithInverseEList<Match>(Match.class, this, SoccerPackage.MATCH_DAY__MATCHES, SoccerPackage.MATCH__MATCH_DAY);
		}
		return matches;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Season getSeason() {
		if (eContainerFeatureID() != SoccerPackage.MATCH_DAY__SEASON) return null;
		return (Season)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSeason(Season newSeason, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newSeason, SoccerPackage.MATCH_DAY__SEASON, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSeason(Season newSeason) {
		if (newSeason != eInternalContainer() || (eContainerFeatureID() != SoccerPackage.MATCH_DAY__SEASON && newSeason != null)) {
			if (EcoreUtil.isAncestor(this, newSeason))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newSeason != null)
				msgs = ((InternalEObject)newSeason).eInverseAdd(this, SoccerPackage.SEASON__MATCH_DAYS, Season.class, msgs);
			msgs = basicSetSeason(newSeason, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SoccerPackage.MATCH_DAY__SEASON, newSeason, newSeason));
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
			case SoccerPackage.MATCH_DAY__MATCHES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getMatches()).basicAdd(otherEnd, msgs);
			case SoccerPackage.MATCH_DAY__SEASON:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetSeason((Season)otherEnd, msgs);
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
			case SoccerPackage.MATCH_DAY__MATCHES:
				return ((InternalEList<?>)getMatches()).basicRemove(otherEnd, msgs);
			case SoccerPackage.MATCH_DAY__SEASON:
				return basicSetSeason(null, msgs);
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
			case SoccerPackage.MATCH_DAY__SEASON:
				return eInternalContainer().eInverseRemove(this, SoccerPackage.SEASON__MATCH_DAYS, Season.class, msgs);
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
			case SoccerPackage.MATCH_DAY__DATE:
				return getDate();
			case SoccerPackage.MATCH_DAY__MATCHES:
				return getMatches();
			case SoccerPackage.MATCH_DAY__SEASON:
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
			case SoccerPackage.MATCH_DAY__DATE:
				setDate((String)newValue);
				return;
			case SoccerPackage.MATCH_DAY__MATCHES:
				getMatches().clear();
				getMatches().addAll((Collection<? extends Match>)newValue);
				return;
			case SoccerPackage.MATCH_DAY__SEASON:
				setSeason((Season)newValue);
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
			case SoccerPackage.MATCH_DAY__DATE:
				setDate(DATE_EDEFAULT);
				return;
			case SoccerPackage.MATCH_DAY__MATCHES:
				getMatches().clear();
				return;
			case SoccerPackage.MATCH_DAY__SEASON:
				setSeason((Season)null);
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
			case SoccerPackage.MATCH_DAY__DATE:
				return DATE_EDEFAULT == null ? date != null : !DATE_EDEFAULT.equals(date);
			case SoccerPackage.MATCH_DAY__MATCHES:
				return matches != null && !matches.isEmpty();
			case SoccerPackage.MATCH_DAY__SEASON:
				return getSeason() != null;
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
		result.append(')');
		return result.toString();
	}

} //MatchDayImpl
