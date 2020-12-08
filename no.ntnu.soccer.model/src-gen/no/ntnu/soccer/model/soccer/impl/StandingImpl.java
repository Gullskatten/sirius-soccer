/**
 */
package no.ntnu.soccer.model.soccer.impl;

import java.util.Collection;

import no.ntnu.soccer.model.soccer.Placement;
import no.ntnu.soccer.model.soccer.SoccerPackage;
import no.ntnu.soccer.model.soccer.Standing;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Standing</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link no.ntnu.soccer.model.soccer.impl.StandingImpl#getPlacements <em>Placements</em>}</li>
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
            placements = new EObjectContainmentWithInverseEList<Placement>(Placement.class, this,
                    SoccerPackage.STANDING__PLACEMENTS, SoccerPackage.PLACEMENT__STANDING);
        }
        return placements;
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
        case SoccerPackage.STANDING__PLACEMENTS:
            return ((InternalEList<InternalEObject>) (InternalEList<?>) getPlacements()).basicAdd(otherEnd, msgs);
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
            return ((InternalEList<?>) getPlacements()).basicRemove(otherEnd, msgs);
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
        case SoccerPackage.STANDING__PLACEMENTS:
            return getPlacements();
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
            getPlacements().addAll((Collection<? extends Placement>) newValue);
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
        }
        return super.eIsSet(featureID);
    }

} //StandingImpl
