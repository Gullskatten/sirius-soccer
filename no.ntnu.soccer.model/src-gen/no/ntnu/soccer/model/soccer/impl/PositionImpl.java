/**
 */
package no.ntnu.soccer.model.soccer.impl;

import java.util.Collection;

import no.ntnu.soccer.model.soccer.Player;
import no.ntnu.soccer.model.soccer.Position;
import no.ntnu.soccer.model.soccer.PositionType;
import no.ntnu.soccer.model.soccer.SoccerPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Position</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link no.ntnu.soccer.model.soccer.impl.PositionImpl#getType <em>Type</em>}</li>
 *   <li>{@link no.ntnu.soccer.model.soccer.impl.PositionImpl#getPlayers <em>Players</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PositionImpl extends MinimalEObjectImpl.Container implements Position {
    /**
     * The default value of the '{@link #getType() <em>Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getType()
     * @generated
     * @ordered
     */
    protected static final PositionType TYPE_EDEFAULT = PositionType.KEEPER;

    /**
     * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getType()
     * @generated
     * @ordered
     */
    protected PositionType type = TYPE_EDEFAULT;

    /**
     * The cached value of the '{@link #getPlayers() <em>Players</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPlayers()
     * @generated
     * @ordered
     */
    protected EList<Player> players;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected PositionImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return SoccerPackage.Literals.POSITION;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public PositionType getType() {
        return type;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setType(PositionType newType) {
        PositionType oldType = type;
        type = newType == null ? TYPE_EDEFAULT : newType;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SoccerPackage.POSITION__TYPE, oldType, type));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<Player> getPlayers() {
        if (players == null) {
            players = new EObjectResolvingEList<Player>(Player.class, this, SoccerPackage.POSITION__PLAYERS);
        }
        return players;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
        case SoccerPackage.POSITION__TYPE:
            return getType();
        case SoccerPackage.POSITION__PLAYERS:
            return getPlayers();
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
        case SoccerPackage.POSITION__TYPE:
            setType((PositionType) newValue);
            return;
        case SoccerPackage.POSITION__PLAYERS:
            getPlayers().clear();
            getPlayers().addAll((Collection<? extends Player>) newValue);
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
        case SoccerPackage.POSITION__TYPE:
            setType(TYPE_EDEFAULT);
            return;
        case SoccerPackage.POSITION__PLAYERS:
            getPlayers().clear();
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
        case SoccerPackage.POSITION__TYPE:
            return type != TYPE_EDEFAULT;
        case SoccerPackage.POSITION__PLAYERS:
            return players != null && !players.isEmpty();
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
        result.append(" (type: ");
        result.append(type);
        result.append(')');
        return result.toString();
    }

} //PositionImpl
