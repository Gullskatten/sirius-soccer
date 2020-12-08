/**
 */
package no.ntnu.soccer.model.soccer.provider;

import java.util.Collection;
import java.util.List;

import no.ntnu.soccer.model.soccer.Placement;
import no.ntnu.soccer.model.soccer.SoccerPackage;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link no.ntnu.soccer.model.soccer.Placement} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class PlacementItemProvider extends ItemProviderAdapter implements IEditingDomainItemProvider,
        IStructuredItemContentProvider, ITreeItemContentProvider, IItemLabelProvider, IItemPropertySource {
    /**
     * This constructs an instance from a factory and a notifier.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public PlacementItemProvider(AdapterFactory adapterFactory) {
        super(adapterFactory);
    }

    /**
     * This returns the property descriptors for the adapted class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
        if (itemPropertyDescriptors == null) {
            super.getPropertyDescriptors(object);

            addRankPropertyDescriptor(object);
            addWinsPropertyDescriptor(object);
            addDrawsPropertyDescriptor(object);
            addLossesPropertyDescriptor(object);
            addGoalsForPropertyDescriptor(object);
            addGoalsAgainstPropertyDescriptor(object);
            addGoalDifferencePropertyDescriptor(object);
            addPointsPropertyDescriptor(object);
            addTeamPropertyDescriptor(object);
            addStandingPropertyDescriptor(object);
        }
        return itemPropertyDescriptors;
    }

    /**
     * This adds a property descriptor for the Rank feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addRankPropertyDescriptor(Object object) {
        itemPropertyDescriptors
                .add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
                        getResourceLocator(), getString("_UI_Placement_rank_feature"),
                        getString("_UI_PropertyDescriptor_description", "_UI_Placement_rank_feature",
                                "_UI_Placement_type"),
                        SoccerPackage.Literals.PLACEMENT__RANK, true, false, false,
                        ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE, null, null));
    }

    /**
     * This adds a property descriptor for the Wins feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addWinsPropertyDescriptor(Object object) {
        itemPropertyDescriptors
                .add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
                        getResourceLocator(), getString("_UI_Placement_wins_feature"),
                        getString("_UI_PropertyDescriptor_description", "_UI_Placement_wins_feature",
                                "_UI_Placement_type"),
                        SoccerPackage.Literals.PLACEMENT__WINS, true, false, false,
                        ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE, null, null));
    }

    /**
     * This adds a property descriptor for the Draws feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addDrawsPropertyDescriptor(Object object) {
        itemPropertyDescriptors
                .add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
                        getResourceLocator(), getString("_UI_Placement_draws_feature"),
                        getString("_UI_PropertyDescriptor_description", "_UI_Placement_draws_feature",
                                "_UI_Placement_type"),
                        SoccerPackage.Literals.PLACEMENT__DRAWS, true, false, false,
                        ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE, null, null));
    }

    /**
     * This adds a property descriptor for the Losses feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addLossesPropertyDescriptor(Object object) {
        itemPropertyDescriptors
                .add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
                        getResourceLocator(), getString("_UI_Placement_losses_feature"),
                        getString("_UI_PropertyDescriptor_description", "_UI_Placement_losses_feature",
                                "_UI_Placement_type"),
                        SoccerPackage.Literals.PLACEMENT__LOSSES, true, false, false,
                        ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE, null, null));
    }

    /**
     * This adds a property descriptor for the Goals For feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addGoalsForPropertyDescriptor(Object object) {
        itemPropertyDescriptors
                .add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
                        getResourceLocator(), getString("_UI_Placement_goalsFor_feature"),
                        getString("_UI_PropertyDescriptor_description", "_UI_Placement_goalsFor_feature",
                                "_UI_Placement_type"),
                        SoccerPackage.Literals.PLACEMENT__GOALS_FOR, true, false, false,
                        ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE, null, null));
    }

    /**
     * This adds a property descriptor for the Goals Against feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addGoalsAgainstPropertyDescriptor(Object object) {
        itemPropertyDescriptors
                .add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
                        getResourceLocator(), getString("_UI_Placement_goalsAgainst_feature"),
                        getString("_UI_PropertyDescriptor_description", "_UI_Placement_goalsAgainst_feature",
                                "_UI_Placement_type"),
                        SoccerPackage.Literals.PLACEMENT__GOALS_AGAINST, true, false, false,
                        ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE, null, null));
    }

    /**
     * This adds a property descriptor for the Goal Difference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addGoalDifferencePropertyDescriptor(Object object) {
        itemPropertyDescriptors
                .add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
                        getResourceLocator(), getString("_UI_Placement_goalDifference_feature"),
                        getString("_UI_PropertyDescriptor_description", "_UI_Placement_goalDifference_feature",
                                "_UI_Placement_type"),
                        SoccerPackage.Literals.PLACEMENT__GOAL_DIFFERENCE, true, false, false,
                        ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE, null, null));
    }

    /**
     * This adds a property descriptor for the Points feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addPointsPropertyDescriptor(Object object) {
        itemPropertyDescriptors
                .add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
                        getResourceLocator(), getString("_UI_Placement_points_feature"),
                        getString("_UI_PropertyDescriptor_description", "_UI_Placement_points_feature",
                                "_UI_Placement_type"),
                        SoccerPackage.Literals.PLACEMENT__POINTS, true, false, false,
                        ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE, null, null));
    }

    /**
     * This adds a property descriptor for the Team feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addTeamPropertyDescriptor(Object object) {
        itemPropertyDescriptors
                .add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
                        getResourceLocator(), getString("_UI_Placement_team_feature"),
                        getString("_UI_PropertyDescriptor_description", "_UI_Placement_team_feature",
                                "_UI_Placement_type"),
                        SoccerPackage.Literals.PLACEMENT__TEAM, true, false, true, null, null, null));
    }

    /**
     * This adds a property descriptor for the Standing feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addStandingPropertyDescriptor(Object object) {
        itemPropertyDescriptors
                .add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
                        getResourceLocator(), getString("_UI_Placement_standing_feature"),
                        getString("_UI_PropertyDescriptor_description", "_UI_Placement_standing_feature",
                                "_UI_Placement_type"),
                        SoccerPackage.Literals.PLACEMENT__STANDING, true, false, true, null, null, null));
    }

    /**
     * This returns Placement.gif.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object getImage(Object object) {
        return overlayImage(object, getResourceLocator().getImage("full/obj16/Placement"));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected boolean shouldComposeCreationImage() {
        return true;
    }

    /**
     * This returns the label text for the adapted class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getText(Object object) {
        Placement placement = (Placement) object;
        return getString("_UI_Placement_type") + " " + placement.getRank();
    }

    /**
     * This handles model notifications by calling {@link #updateChildren} to update any cached
     * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void notifyChanged(Notification notification) {
        updateChildren(notification);

        switch (notification.getFeatureID(Placement.class)) {
        case SoccerPackage.PLACEMENT__RANK:
        case SoccerPackage.PLACEMENT__WINS:
        case SoccerPackage.PLACEMENT__DRAWS:
        case SoccerPackage.PLACEMENT__LOSSES:
        case SoccerPackage.PLACEMENT__GOALS_FOR:
        case SoccerPackage.PLACEMENT__GOALS_AGAINST:
        case SoccerPackage.PLACEMENT__GOAL_DIFFERENCE:
        case SoccerPackage.PLACEMENT__POINTS:
            fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
            return;
        }
        super.notifyChanged(notification);
    }

    /**
     * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
     * that can be created under this object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
        super.collectNewChildDescriptors(newChildDescriptors, object);
    }

    /**
     * Return the resource locator for this item provider's resources.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public ResourceLocator getResourceLocator() {
        return SoccerEditPlugin.INSTANCE;
    }

}
