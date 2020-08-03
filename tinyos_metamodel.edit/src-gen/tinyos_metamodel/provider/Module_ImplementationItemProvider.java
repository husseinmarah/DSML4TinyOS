/**
 */
package tinyos_metamodel.provider;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemColorProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

import tinyos_metamodel.Module_Implementation;
import tinyos_metamodel.Tinyos_metamodelFactory;
import tinyos_metamodel.Tinyos_metamodelPackage;

/**
 * This is the item provider adapter for a {@link tinyos_metamodel.Module_Implementation} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class Module_ImplementationItemProvider extends ItemProviderAdapter
		implements IEditingDomainItemProvider, IStructuredItemContentProvider, ITreeItemContentProvider,
		IItemLabelProvider, IItemPropertySource, IItemColorProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Module_ImplementationItemProvider(AdapterFactory adapterFactory) {
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

		}
		return itemPropertyDescriptors;
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(Tinyos_metamodelPackage.Literals.MODULE_IMPLEMENTATION__HAS_NES_CCODE);
			childrenFeatures.add(Tinyos_metamodelPackage.Literals.MODULE_IMPLEMENTATION__IMPLEMENTS_EVENT);
			childrenFeatures.add(Tinyos_metamodelPackage.Literals.MODULE_IMPLEMENTATION__IMPLEMENTS_COMMAND);
			childrenFeatures.add(Tinyos_metamodelPackage.Literals.MODULE_IMPLEMENTATION__IMPLEMENTS_TASK);
			childrenFeatures.add(Tinyos_metamodelPackage.Literals.MODULE_IMPLEMENTATION__IMPLEMENTS_HELPER_FUNCTION);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns Module_Implementation.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Module_Implementation"));
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
		return getString("_UI_Module_Implementation_type");
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

		switch (notification.getFeatureID(Module_Implementation.class)) {
		case Tinyos_metamodelPackage.MODULE_IMPLEMENTATION__HAS_NES_CCODE:
		case Tinyos_metamodelPackage.MODULE_IMPLEMENTATION__IMPLEMENTS_EVENT:
		case Tinyos_metamodelPackage.MODULE_IMPLEMENTATION__IMPLEMENTS_COMMAND:
		case Tinyos_metamodelPackage.MODULE_IMPLEMENTATION__IMPLEMENTS_TASK:
		case Tinyos_metamodelPackage.MODULE_IMPLEMENTATION__IMPLEMENTS_HELPER_FUNCTION:
			fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
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

		newChildDescriptors
				.add(createChildParameter(Tinyos_metamodelPackage.Literals.MODULE_IMPLEMENTATION__HAS_NES_CCODE,
						Tinyos_metamodelFactory.eINSTANCE.createnesC()));

		newChildDescriptors
				.add(createChildParameter(Tinyos_metamodelPackage.Literals.MODULE_IMPLEMENTATION__IMPLEMENTS_EVENT,
						Tinyos_metamodelFactory.eINSTANCE.createEvent()));

		newChildDescriptors
				.add(createChildParameter(Tinyos_metamodelPackage.Literals.MODULE_IMPLEMENTATION__IMPLEMENTS_COMMAND,
						Tinyos_metamodelFactory.eINSTANCE.createCommand()));

		newChildDescriptors
				.add(createChildParameter(Tinyos_metamodelPackage.Literals.MODULE_IMPLEMENTATION__IMPLEMENTS_TASK,
						Tinyos_metamodelFactory.eINSTANCE.createTask()));

		newChildDescriptors.add(
				createChildParameter(Tinyos_metamodelPackage.Literals.MODULE_IMPLEMENTATION__IMPLEMENTS_HELPER_FUNCTION,
						Tinyos_metamodelFactory.eINSTANCE.createHelper_Function()));
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return Tinyos_metamodelEditPlugin.INSTANCE;
	}

}