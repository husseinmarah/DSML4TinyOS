/**
 */
package tinyos_metamodel.provider;

import java.util.ArrayList;
import java.util.Collection;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.edit.provider.ChangeNotifier;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.IChangeNotifier;
import org.eclipse.emf.edit.provider.IDisposable;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemColorProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.INotifyChangedListener;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;

import tinyos_metamodel.util.Tinyos_metamodelAdapterFactory;

/**
 * This is the factory that is used to provide the interfaces needed to support Viewers.
 * The adapters generated by this factory convert EMF adapter notifications into calls to {@link #fireNotifyChanged fireNotifyChanged}.
 * The adapters also support Eclipse property sheets.
 * Note that most of the adapters are shared among multiple instances.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class Tinyos_metamodelItemProviderAdapterFactory extends Tinyos_metamodelAdapterFactory
		implements ComposeableAdapterFactory, IChangeNotifier, IDisposable {
	/**
	 * This keeps track of the root adapter factory that delegates to this adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComposedAdapterFactory parentAdapterFactory;

	/**
	 * This is used to implement {@link org.eclipse.emf.edit.provider.IChangeNotifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IChangeNotifier changeNotifier = new ChangeNotifier();

	/**
	 * This keeps track of all the supported types checked by {@link #isFactoryForType isFactoryForType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Collection<Object> supportedTypes = new ArrayList<Object>();

	/**
	 * This constructs an instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Tinyos_metamodelItemProviderAdapterFactory() {
		supportedTypes.add(IEditingDomainItemProvider.class);
		supportedTypes.add(IStructuredItemContentProvider.class);
		supportedTypes.add(ITreeItemContentProvider.class);
		supportedTypes.add(IItemLabelProvider.class);
		supportedTypes.add(IItemPropertySource.class);
		supportedTypes.add(IItemColorProvider.class);
	}

	/**
	 * This keeps track of the one adapter used for all {@link tinyos_metamodel.Application} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ApplicationItemProvider applicationItemProvider;

	/**
	 * This creates an adapter for a {@link tinyos_metamodel.Application}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createApplicationAdapter() {
		if (applicationItemProvider == null) {
			applicationItemProvider = new ApplicationItemProvider(this);
		}

		return applicationItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link tinyos_metamodel.Component} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComponentItemProvider componentItemProvider;

	/**
	 * This creates an adapter for a {@link tinyos_metamodel.Component}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createComponentAdapter() {
		if (componentItemProvider == null) {
			componentItemProvider = new ComponentItemProvider(this);
		}

		return componentItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link tinyos_metamodel.Module} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ModuleItemProvider moduleItemProvider;

	/**
	 * This creates an adapter for a {@link tinyos_metamodel.Module}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createModuleAdapter() {
		if (moduleItemProvider == null) {
			moduleItemProvider = new ModuleItemProvider(this);
		}

		return moduleItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link tinyos_metamodel.Configuration} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConfigurationItemProvider configurationItemProvider;

	/**
	 * This creates an adapter for a {@link tinyos_metamodel.Configuration}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createConfigurationAdapter() {
		if (configurationItemProvider == null) {
			configurationItemProvider = new ConfigurationItemProvider(this);
		}

		return configurationItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link tinyos_metamodel.Module_Signature} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Module_SignatureItemProvider module_SignatureItemProvider;

	/**
	 * This creates an adapter for a {@link tinyos_metamodel.Module_Signature}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createModule_SignatureAdapter() {
		if (module_SignatureItemProvider == null) {
			module_SignatureItemProvider = new Module_SignatureItemProvider(this);
		}

		return module_SignatureItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link tinyos_metamodel.Module_Implementation} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Module_ImplementationItemProvider module_ImplementationItemProvider;

	/**
	 * This creates an adapter for a {@link tinyos_metamodel.Module_Implementation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createModule_ImplementationAdapter() {
		if (module_ImplementationItemProvider == null) {
			module_ImplementationItemProvider = new Module_ImplementationItemProvider(this);
		}

		return module_ImplementationItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link tinyos_metamodel.Configuration_Implementation} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Configuration_ImplementationItemProvider configuration_ImplementationItemProvider;

	/**
	 * This creates an adapter for a {@link tinyos_metamodel.Configuration_Implementation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createConfiguration_ImplementationAdapter() {
		if (configuration_ImplementationItemProvider == null) {
			configuration_ImplementationItemProvider = new Configuration_ImplementationItemProvider(this);
		}

		return configuration_ImplementationItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link tinyos_metamodel.Configuration_Signature} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Configuration_SignatureItemProvider configuration_SignatureItemProvider;

	/**
	 * This creates an adapter for a {@link tinyos_metamodel.Configuration_Signature}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createConfiguration_SignatureAdapter() {
		if (configuration_SignatureItemProvider == null) {
			configuration_SignatureItemProvider = new Configuration_SignatureItemProvider(this);
		}

		return configuration_SignatureItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link tinyos_metamodel.Interface} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InterfaceItemProvider interfaceItemProvider;

	/**
	 * This creates an adapter for a {@link tinyos_metamodel.Interface}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createInterfaceAdapter() {
		if (interfaceItemProvider == null) {
			interfaceItemProvider = new InterfaceItemProvider(this);
		}

		return interfaceItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link tinyos_metamodel.Event} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EventItemProvider eventItemProvider;

	/**
	 * This creates an adapter for a {@link tinyos_metamodel.Event}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createEventAdapter() {
		if (eventItemProvider == null) {
			eventItemProvider = new EventItemProvider(this);
		}

		return eventItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link tinyos_metamodel.Command} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CommandItemProvider commandItemProvider;

	/**
	 * This creates an adapter for a {@link tinyos_metamodel.Command}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createCommandAdapter() {
		if (commandItemProvider == null) {
			commandItemProvider = new CommandItemProvider(this);
		}

		return commandItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link tinyos_metamodel.nesC} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected nesCItemProvider nesCItemProvider;

	/**
	 * This creates an adapter for a {@link tinyos_metamodel.nesC}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createnesCAdapter() {
		if (nesCItemProvider == null) {
			nesCItemProvider = new nesCItemProvider(this);
		}

		return nesCItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link tinyos_metamodel.Wiring} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WiringItemProvider wiringItemProvider;

	/**
	 * This creates an adapter for a {@link tinyos_metamodel.Wiring}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createWiringAdapter() {
		if (wiringItemProvider == null) {
			wiringItemProvider = new WiringItemProvider(this);
		}

		return wiringItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link tinyos_metamodel.Components} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComponentsItemProvider componentsItemProvider;

	/**
	 * This creates an adapter for a {@link tinyos_metamodel.Components}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createComponentsAdapter() {
		if (componentsItemProvider == null) {
			componentsItemProvider = new ComponentsItemProvider(this);
		}

		return componentsItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link tinyos_metamodel.Task} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TaskItemProvider taskItemProvider;

	/**
	 * This creates an adapter for a {@link tinyos_metamodel.Task}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createTaskAdapter() {
		if (taskItemProvider == null) {
			taskItemProvider = new TaskItemProvider(this);
		}

		return taskItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link tinyos_metamodel.Mote} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MoteItemProvider moteItemProvider;

	/**
	 * This creates an adapter for a {@link tinyos_metamodel.Mote}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createMoteAdapter() {
		if (moteItemProvider == null) {
			moteItemProvider = new MoteItemProvider(this);
		}

		return moteItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link tinyos_metamodel.IncludeDecleration} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IncludeDeclerationItemProvider includeDeclerationItemProvider;

	/**
	 * This creates an adapter for a {@link tinyos_metamodel.IncludeDecleration}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createIncludeDeclerationAdapter() {
		if (includeDeclerationItemProvider == null) {
			includeDeclerationItemProvider = new IncludeDeclerationItemProvider(this);
		}

		return includeDeclerationItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link tinyos_metamodel.Helper_Function} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Helper_FunctionItemProvider helper_FunctionItemProvider;

	/**
	 * This creates an adapter for a {@link tinyos_metamodel.Helper_Function}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createHelper_FunctionAdapter() {
		if (helper_FunctionItemProvider == null) {
			helper_FunctionItemProvider = new Helper_FunctionItemProvider(this);
		}

		return helper_FunctionItemProvider;
	}

	/**
	 * This returns the root adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComposeableAdapterFactory getRootAdapterFactory() {
		return parentAdapterFactory == null ? this : parentAdapterFactory.getRootAdapterFactory();
	}

	/**
	 * This sets the composed adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParentAdapterFactory(ComposedAdapterFactory parentAdapterFactory) {
		this.parentAdapterFactory = parentAdapterFactory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object type) {
		return supportedTypes.contains(type) || super.isFactoryForType(type);
	}

	/**
	 * This implementation substitutes the factory itself as the key for the adapter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter adapt(Notifier notifier, Object type) {
		return super.adapt(notifier, this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object adapt(Object object, Object type) {
		if (isFactoryForType(type)) {
			Object adapter = super.adapt(object, type);
			if (!(type instanceof Class<?>) || (((Class<?>) type).isInstance(adapter))) {
				return adapter;
			}
		}

		return null;
	}

	/**
	 * This adds a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void addListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.addListener(notifyChangedListener);
	}

	/**
	 * This removes a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void removeListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.removeListener(notifyChangedListener);
	}

	/**
	 * This delegates to {@link #changeNotifier} and to {@link #parentAdapterFactory}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void fireNotifyChanged(Notification notification) {
		changeNotifier.fireNotifyChanged(notification);

		if (parentAdapterFactory != null) {
			parentAdapterFactory.fireNotifyChanged(notification);
		}
	}

	/**
	 * This disposes all of the item providers created by this factory. 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void dispose() {
		if (applicationItemProvider != null)
			applicationItemProvider.dispose();
		if (componentItemProvider != null)
			componentItemProvider.dispose();
		if (moduleItemProvider != null)
			moduleItemProvider.dispose();
		if (configurationItemProvider != null)
			configurationItemProvider.dispose();
		if (module_SignatureItemProvider != null)
			module_SignatureItemProvider.dispose();
		if (module_ImplementationItemProvider != null)
			module_ImplementationItemProvider.dispose();
		if (configuration_ImplementationItemProvider != null)
			configuration_ImplementationItemProvider.dispose();
		if (configuration_SignatureItemProvider != null)
			configuration_SignatureItemProvider.dispose();
		if (interfaceItemProvider != null)
			interfaceItemProvider.dispose();
		if (eventItemProvider != null)
			eventItemProvider.dispose();
		if (commandItemProvider != null)
			commandItemProvider.dispose();
		if (nesCItemProvider != null)
			nesCItemProvider.dispose();
		if (wiringItemProvider != null)
			wiringItemProvider.dispose();
		if (componentsItemProvider != null)
			componentsItemProvider.dispose();
		if (taskItemProvider != null)
			taskItemProvider.dispose();
		if (moteItemProvider != null)
			moteItemProvider.dispose();
		if (includeDeclerationItemProvider != null)
			includeDeclerationItemProvider.dispose();
		if (helper_FunctionItemProvider != null)
			helper_FunctionItemProvider.dispose();
	}

}