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

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

import soccer.Placement;
import soccer.Season;
import soccer.SoccerPackage;
import soccer.Standing;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Standing</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link soccer.impl.StandingImpl#getPlacements <em>Placements</em>}</li>
 *   <li>{@link soccer.impl.StandingImpl#getSeason <em>Season</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StandingImpl extends MinimalEObjectImpl.Container implements Standing {
	/**
	 * The cached value of the '{@link #getPlacements() <em>Placements</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlacements()
	 * @generated
	 * @ordered
	 */
	protected EList<Placement> placements;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StandingImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SoccerPackage.Literals.STANDING;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Placement> getPlacements() {
		if (placements == null) {
			placements = new EObjectContainmentEList<Placement>(Placement.class, this, SoccerPackage.STANDING__PLACEMENTS);
		}
		return placements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Season getSeason() {
		if (eContainerFeatureID() != SoccerPackage.STANDING__SEASON) return null;
		return (Season)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSeason(Season newSeason, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newSeason, SoccerPackage.STANDING__SEASON, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSeason(Season newSeason) {
		if (newSeason != eInternalContainer() || (eContainerFeatureID() != SoccerPackage.STANDING__SEASON && newSeason != null)) {
			if (EcoreUtil.isAncestor(this, newSeason))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newSeason != null)
				msgs = ((InternalEObject)newSeason).eInverseAdd(this, SoccerPackage.SEASON__STANDING, Season.class, msgs);
			msgs = basicSetSeason(newSeason, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SoccerPackage.STANDING__SEASON, newSeason, newSeason));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SoccerPackage.STANDING__SEASON:
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
			case SoccerPackage.STANDING__PLACEMENTS:
				return ((InternalEList<?>)getPlacements()).basicRemove(otherEnd, msgs);
			case SoccerPackage.STANDING__SEASON:
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
			case SoccerPackage.STANDING__SEASON:
				return eInternalContainer().eInverseRemove(this, SoccerPackage.SEASON__STANDING, Season.class, msgs);
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
			case SoccerPackage.STANDING__PLACEMENTS:
				return getPlacements();
			case SoccerPackage.STANDING__SEASON:
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
			case SoccerPackage.STANDING__PLACEMENTS:
				getPlacements().clear();
				getPlacements().addAll((Collection<? extends Placement>)newValue);
				return;
			case SoccerPackage.STANDING__SEASON:
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
			case SoccerPackage.STANDING__PLACEMENTS:
				getPlacements().clear();
				return;
			case SoccerPackage.STANDING__SEASON:
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
			case SoccerPackage.STANDING__PLACEMENTS:
				return placements != null && !placements.isEmpty();
			case SoccerPackage.STANDING__SEASON:
				return getSeason() != null;
		}
		return super.eIsSet(featureID);
	}

} //StandingImpl
