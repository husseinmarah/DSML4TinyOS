/**
 */
package tinyos_metamodel.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import tinyos_metamodel.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Tinyos_metamodelFactoryImpl extends EFactoryImpl implements Tinyos_metamodelFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Tinyos_metamodelFactory init() {
		try {
			Tinyos_metamodelFactory theTinyos_metamodelFactory = (Tinyos_metamodelFactory) EPackage.Registry.INSTANCE
					.getEFactory(Tinyos_metamodelPackage.eNS_URI);
			if (theTinyos_metamodelFactory != null) {
				return theTinyos_metamodelFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new Tinyos_metamodelFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Tinyos_metamodelFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
		case Tinyos_metamodelPackage.APPLICATION:
			return createApplication();
		case Tinyos_metamodelPackage.COMPONENT:
			return createComponent();
		case Tinyos_metamodelPackage.MODULE:
			return createModule();
		case Tinyos_metamodelPackage.CONFIGURATION:
			return createConfiguration();
		case Tinyos_metamodelPackage.MODULE_SIGNATURE:
			return createModule_Signature();
		case Tinyos_metamodelPackage.MODULE_IMPLEMENTATION:
			return createModule_Implementation();
		case Tinyos_metamodelPackage.CONFIGURATION_IMPLEMENTATION:
			return createConfiguration_Implementation();
		case Tinyos_metamodelPackage.CONFIGURATION_SIGNATURE:
			return createConfiguration_Signature();
		case Tinyos_metamodelPackage.INTERFACE:
			return createInterface();
		case Tinyos_metamodelPackage.EVENT:
			return createEvent();
		case Tinyos_metamodelPackage.COMMAND:
			return createCommand();
		case Tinyos_metamodelPackage.NES_C:
			return createnesC();
		case Tinyos_metamodelPackage.WIRING:
			return createWiring();
		case Tinyos_metamodelPackage.COMPONENTS:
			return createComponents();
		case Tinyos_metamodelPackage.TASK:
			return createTask();
		case Tinyos_metamodelPackage.MOTE:
			return createMote();
		case Tinyos_metamodelPackage.INCLUDE_DECLERATION:
			return createIncludeDecleration();
		case Tinyos_metamodelPackage.HELPER_FUNCTION:
			return createHelper_Function();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Application createApplication() {
		ApplicationImpl application = new ApplicationImpl();
		return application;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Component createComponent() {
		ComponentImpl component = new ComponentImpl();
		return component;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Module createModule() {
		ModuleImpl module = new ModuleImpl();
		return module;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Configuration createConfiguration() {
		ConfigurationImpl configuration = new ConfigurationImpl();
		return configuration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Module_Signature createModule_Signature() {
		Module_SignatureImpl module_Signature = new Module_SignatureImpl();
		return module_Signature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Module_Implementation createModule_Implementation() {
		Module_ImplementationImpl module_Implementation = new Module_ImplementationImpl();
		return module_Implementation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Configuration_Implementation createConfiguration_Implementation() {
		Configuration_ImplementationImpl configuration_Implementation = new Configuration_ImplementationImpl();
		return configuration_Implementation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Configuration_Signature createConfiguration_Signature() {
		Configuration_SignatureImpl configuration_Signature = new Configuration_SignatureImpl();
		return configuration_Signature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Interface createInterface() {
		InterfaceImpl interface_ = new InterfaceImpl();
		return interface_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Event createEvent() {
		EventImpl event = new EventImpl();
		return event;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Command createCommand() {
		CommandImpl command = new CommandImpl();
		return command;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public nesC createnesC() {
		nesCImpl nesC = new nesCImpl();
		return nesC;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Wiring createWiring() {
		WiringImpl wiring = new WiringImpl();
		return wiring;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Components createComponents() {
		ComponentsImpl components = new ComponentsImpl();
		return components;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Task createTask() {
		TaskImpl task = new TaskImpl();
		return task;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Mote createMote() {
		MoteImpl mote = new MoteImpl();
		return mote;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IncludeDecleration createIncludeDecleration() {
		IncludeDeclerationImpl includeDecleration = new IncludeDeclerationImpl();
		return includeDecleration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Helper_Function createHelper_Function() {
		Helper_FunctionImpl helper_Function = new Helper_FunctionImpl();
		return helper_Function;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Tinyos_metamodelPackage getTinyos_metamodelPackage() {
		return (Tinyos_metamodelPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static Tinyos_metamodelPackage getPackage() {
		return Tinyos_metamodelPackage.eINSTANCE;
	}

} //Tinyos_metamodelFactoryImpl
