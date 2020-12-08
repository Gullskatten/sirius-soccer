/**
 */
package no.ntnu.soccer.model.soccer.impl;

import java.util.Collection;

import no.ntnu.soccer.model.soccer.Country;
import no.ntnu.soccer.model.soccer.Federation;
import no.ntnu.soccer.model.soccer.Player;
import no.ntnu.soccer.model.soccer.SoccerPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Federation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link no.ntnu.soccer.model.soccer.impl.FederationImpl#getName <em>Name</em>}</li>
 *   <li>{@link no.ntnu.soccer.model.soccer.impl.FederationImpl#getPlayers <em>Players</em>}</li>
 *   <li>{@link no.ntnu.soccer.model.soccer.impl.FederationImpl#getCountries <em>Countries</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FederationImpl extends MinimalEObjectImpl.Container implements Federation {
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
     * The cached value of the '{@link #getPlayers() <em>Players</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPlayers()
     * @generated
     * @ordered
     */
    protected EList<Player> players;

    /**
     * The cached value of the '{@link #getCountries() <em>Countries</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getCountries()
     * @generated
     * @ordered
     */
    protected EList<Country> countries;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected FederationImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return SoccerPackage.Literals.FEDERATION;
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
            eNotify(new ENotificationImpl(this, Notification.SET, SoccerPackage.FEDERATION__NAME, oldName, name));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<Player> getPlayers() {
        if (players == null) {
            players = new EObjectContainmentEList<Player>(Player.class, this, SoccerPackage.FEDERATION__PLAYERS);
        }
        return players;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<Country> getCountries() {
        if (countries == null) {
            countries = new EObjectContainmentEList<Country>(Country.class, this, SoccerPackage.FEDERATION__COUNTRIES);
        }
        return countries;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
        case SoccerPackage.FEDERATION__PLAYERS:
            return ((InternalEList<?>) getPlayers()).basicRemove(otherEnd, msgs);
        case SoccerPackage.FEDERATION__COUNTRIES:
            return ((InternalEList<?>) getCountries()).basicRemove(otherEnd, msgs);
        }
        return super.eInverseRemove(otherEnd, featureID, msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
        case SoccerPackage.FEDERATION__NAME:
            return getName();
        case SoccerPackage.FEDERATION__PLAYERS:
            return getPlayers();
        case SoccerPackage.FEDERATION__COUNTRIES:
            return getCountries();
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
        case SoccerPackage.FEDERATION__NAME:
            setName((String) newValue);
            return;
        case SoccerPackage.FEDERATION__PLAYERS:
            getPlayers().clear();
            getPlayers().addAll((Collection<? extends Player>) newValue);
            return;
        case SoccerPackage.FEDERATION__COUNTRIES:
            getCountries().clear();
            getCountries().addAll((Collection<? extends Country>) newValue);
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
        case SoccerPackage.FEDERATION__NAME:
            setName(NAME_EDEFAULT);
            return;
        case SoccerPackage.FEDERATION__PLAYERS:
            getPlayers().clear();
            return;
        case SoccerPackage.FEDERATION__COUNTRIES:
            getCountries().clear();
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
        case SoccerPackage.FEDERATION__NAME:
            return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
        case SoccerPackage.FEDERATION__PLAYERS:
            return players != null && !players.isEmpty();
        case SoccerPackage.FEDERATION__COUNTRIES:
            return countries != null && !countries.isEmpty();
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

} //FederationImpl
