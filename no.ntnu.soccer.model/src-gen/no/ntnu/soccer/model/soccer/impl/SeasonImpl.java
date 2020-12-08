/**
 */
package no.ntnu.soccer.model.soccer.impl;

import java.util.Collection;

import no.ntnu.soccer.model.soccer.League;
import no.ntnu.soccer.model.soccer.MatchDay;
import no.ntnu.soccer.model.soccer.Season;
import no.ntnu.soccer.model.soccer.SoccerPackage;
import no.ntnu.soccer.model.soccer.Standing;

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

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Season</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link no.ntnu.soccer.model.soccer.impl.SeasonImpl#getName <em>Name</em>}</li>
 *   <li>{@link no.ntnu.soccer.model.soccer.impl.SeasonImpl#getLeague <em>League</em>}</li>
 *   <li>{@link no.ntnu.soccer.model.soccer.impl.SeasonImpl#getMatchDays <em>Match Days</em>}</li>
 *   <li>{@link no.ntnu.soccer.model.soccer.impl.SeasonImpl#getStanding <em>Standing</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SeasonImpl extends MinimalEObjectImpl.Container implements Season {
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
     * The cached value of the '{@link #getMatchDays() <em>Match Days</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMatchDays()
     * @generated
     * @ordered
     */
    protected EList<MatchDay> matchDays;

    /**
     * The cached value of the '{@link #getStanding() <em>Standing</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getStanding()
     * @generated
     * @ordered
     */
    protected Standing standing;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected SeasonImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return SoccerPackage.Literals.SEASON;
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
            eNotify(new ENotificationImpl(this, Notification.SET, SoccerPackage.SEASON__NAME, oldName, name));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public League getLeague() {
        if (eContainerFeatureID() != SoccerPackage.SEASON__LEAGUE)
            return null;
        return (League) eInternalContainer();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetLeague(League newLeague, NotificationChain msgs) {
        msgs = eBasicSetContainer((InternalEObject) newLeague, SoccerPackage.SEASON__LEAGUE, msgs);
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setLeague(League newLeague) {
        if (newLeague != eInternalContainer()
                || (eContainerFeatureID() != SoccerPackage.SEASON__LEAGUE && newLeague != null)) {
            if (EcoreUtil.isAncestor(this, newLeague))
                throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
            NotificationChain msgs = null;
            if (eInternalContainer() != null)
                msgs = eBasicRemoveFromContainer(msgs);
            if (newLeague != null)
                msgs = ((InternalEObject) newLeague).eInverseAdd(this, SoccerPackage.LEAGUE__SEASONS, League.class,
                        msgs);
            msgs = basicSetLeague(newLeague, msgs);
            if (msgs != null)
                msgs.dispatch();
        } else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SoccerPackage.SEASON__LEAGUE, newLeague, newLeague));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<MatchDay> getMatchDays() {
        if (matchDays == null) {
            matchDays = new EObjectContainmentEList<MatchDay>(MatchDay.class, this, SoccerPackage.SEASON__MATCH_DAYS);
        }
        return matchDays;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Standing getStanding() {
        return standing;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetStanding(Standing newStanding, NotificationChain msgs) {
        Standing oldStanding = standing;
        standing = newStanding;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
                    SoccerPackage.SEASON__STANDING, oldStanding, newStanding);
            if (msgs == null)
                msgs = notification;
            else
                msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setStanding(Standing newStanding) {
        if (newStanding != standing) {
            NotificationChain msgs = null;
            if (standing != null)
                msgs = ((InternalEObject) standing).eInverseRemove(this,
                        EOPPOSITE_FEATURE_BASE - SoccerPackage.SEASON__STANDING, null, msgs);
            if (newStanding != null)
                msgs = ((InternalEObject) newStanding).eInverseAdd(this,
                        EOPPOSITE_FEATURE_BASE - SoccerPackage.SEASON__STANDING, null, msgs);
            msgs = basicSetStanding(newStanding, msgs);
            if (msgs != null)
                msgs.dispatch();
        } else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SoccerPackage.SEASON__STANDING, newStanding,
                    newStanding));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
        case SoccerPackage.SEASON__LEAGUE:
            if (eInternalContainer() != null)
                msgs = eBasicRemoveFromContainer(msgs);
            return basicSetLeague((League) otherEnd, msgs);
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
        case SoccerPackage.SEASON__LEAGUE:
            return basicSetLeague(null, msgs);
        case SoccerPackage.SEASON__MATCH_DAYS:
            return ((InternalEList<?>) getMatchDays()).basicRemove(otherEnd, msgs);
        case SoccerPackage.SEASON__STANDING:
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
        case SoccerPackage.SEASON__LEAGUE:
            return eInternalContainer().eInverseRemove(this, SoccerPackage.LEAGUE__SEASONS, League.class, msgs);
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
        case SoccerPackage.SEASON__NAME:
            return getName();
        case SoccerPackage.SEASON__LEAGUE:
            return getLeague();
        case SoccerPackage.SEASON__MATCH_DAYS:
            return getMatchDays();
        case SoccerPackage.SEASON__STANDING:
            return getStanding();
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
        case SoccerPackage.SEASON__NAME:
            setName((String) newValue);
            return;
        case SoccerPackage.SEASON__LEAGUE:
            setLeague((League) newValue);
            return;
        case SoccerPackage.SEASON__MATCH_DAYS:
            getMatchDays().clear();
            getMatchDays().addAll((Collection<? extends MatchDay>) newValue);
            return;
        case SoccerPackage.SEASON__STANDING:
            setStanding((Standing) newValue);
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
        case SoccerPackage.SEASON__NAME:
            setName(NAME_EDEFAULT);
            return;
        case SoccerPackage.SEASON__LEAGUE:
            setLeague((League) null);
            return;
        case SoccerPackage.SEASON__MATCH_DAYS:
            getMatchDays().clear();
            return;
        case SoccerPackage.SEASON__STANDING:
            setStanding((Standing) null);
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
        case SoccerPackage.SEASON__NAME:
            return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
        case SoccerPackage.SEASON__LEAGUE:
            return getLeague() != null;
        case SoccerPackage.SEASON__MATCH_DAYS:
            return matchDays != null && !matchDays.isEmpty();
        case SoccerPackage.SEASON__STANDING:
            return standing != null;
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
        result.append(" (name: ");
        result.append(name);
        result.append(')');
        return result.toString();
    }

} //SeasonImpl
