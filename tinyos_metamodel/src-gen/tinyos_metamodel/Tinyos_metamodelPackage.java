/**
 */
package tinyos_metamodel;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * As a component must implement commands for interfaces it provides and events for interfaces it uses, a module’s code must define these functions.
 * <!-- end-model-doc -->
 * @see tinyos_metamodel.Tinyos_metamodelFactory
 * @model kind="package"
 * @generated
 */
public interface Tinyos_metamodelPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "tinyos_metamodel";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://emf.tinyos_metamodel";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "tinyos_metamodel";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Tinyos_metamodelPackage eINSTANCE = tinyos_metamodel.impl.Tinyos_metamodelPackageImpl.init();

	/**
	 * The meta object id for the '{@link tinyos_metamodel.impl.ApplicationImpl <em>Application</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tinyos_metamodel.impl.ApplicationImpl
	 * @see tinyos_metamodel.impl.Tinyos_metamodelPackageImpl#getApplication()
	 * @generated
	 */
	int APPLICATION = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION__NAME = 0;

	/**
	 * The feature id for the '<em><b>Has Component</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION__HAS_COMPONENT = 1;

	/**
	 * The feature id for the '<em><b>Information</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION__INFORMATION = 2;

	/**
	 * The number of structural features of the '<em>Application</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Application</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link tinyos_metamodel.impl.ComponentImpl <em>Component</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tinyos_metamodel.impl.ComponentImpl
	 * @see tinyos_metamodel.impl.Tinyos_metamodelPackageImpl#getComponent()
	 * @generated
	 */
	int COMPONENT = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__NAME = 0;

	/**
	 * The feature id for the '<em><b>Contains Module</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__CONTAINS_MODULE = 1;

	/**
	 * The feature id for the '<em><b>Contains Configuration</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__CONTAINS_CONFIGURATION = 2;

	/**
	 * The feature id for the '<em><b>Has Include Decleration</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__HAS_INCLUDE_DECLERATION = 3;

	/**
	 * The number of structural features of the '<em>Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link tinyos_metamodel.impl.ModuleImpl <em>Module</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tinyos_metamodel.impl.ModuleImpl
	 * @see tinyos_metamodel.impl.Tinyos_metamodelPackageImpl#getModule()
	 * @generated
	 */
	int MODULE = 2;

	/**
	 * The feature id for the '<em><b>Has module signature</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE__HAS_MODULE_SIGNATURE = 0;

	/**
	 * The feature id for the '<em><b>Has module implementation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE__HAS_MODULE_IMPLEMENTATION = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE__NAME = 2;

	/**
	 * The number of structural features of the '<em>Module</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Module</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link tinyos_metamodel.impl.ConfigurationImpl <em>Configuration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tinyos_metamodel.impl.ConfigurationImpl
	 * @see tinyos_metamodel.impl.Tinyos_metamodelPackageImpl#getConfiguration()
	 * @generated
	 */
	int CONFIGURATION = 3;

	/**
	 * The feature id for the '<em><b>Has configuration signature</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION__HAS_CONFIGURATION_SIGNATURE = 0;

	/**
	 * The feature id for the '<em><b>Has configuration implementation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION__HAS_CONFIGURATION_IMPLEMENTATION = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION__NAME = 2;

	/**
	 * The number of structural features of the '<em>Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link tinyos_metamodel.impl.Module_SignatureImpl <em>Module Signature</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tinyos_metamodel.impl.Module_SignatureImpl
	 * @see tinyos_metamodel.impl.Tinyos_metamodelPackageImpl#getModule_Signature()
	 * @generated
	 */
	int MODULE_SIGNATURE = 4;

	/**
	 * The feature id for the '<em><b>Uses Interface</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_SIGNATURE__USES_INTERFACE = 0;

	/**
	 * The feature id for the '<em><b>Provides Interface</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_SIGNATURE__PROVIDES_INTERFACE = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_SIGNATURE__NAME = 2;

	/**
	 * The number of structural features of the '<em>Module Signature</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_SIGNATURE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Module Signature</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_SIGNATURE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link tinyos_metamodel.impl.Module_ImplementationImpl <em>Module Implementation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tinyos_metamodel.impl.Module_ImplementationImpl
	 * @see tinyos_metamodel.impl.Tinyos_metamodelPackageImpl#getModule_Implementation()
	 * @generated
	 */
	int MODULE_IMPLEMENTATION = 5;

	/**
	 * The feature id for the '<em><b>Has nes Ccode</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_IMPLEMENTATION__HAS_NES_CCODE = 0;

	/**
	 * The feature id for the '<em><b>Implements Event</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_IMPLEMENTATION__IMPLEMENTS_EVENT = 1;

	/**
	 * The feature id for the '<em><b>Implements Command</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_IMPLEMENTATION__IMPLEMENTS_COMMAND = 2;

	/**
	 * The feature id for the '<em><b>Implements Task</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_IMPLEMENTATION__IMPLEMENTS_TASK = 3;

	/**
	 * The feature id for the '<em><b>Implements helper function</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_IMPLEMENTATION__IMPLEMENTS_HELPER_FUNCTION = 4;

	/**
	 * The number of structural features of the '<em>Module Implementation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_IMPLEMENTATION_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Module Implementation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_IMPLEMENTATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link tinyos_metamodel.impl.Configuration_ImplementationImpl <em>Configuration Implementation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tinyos_metamodel.impl.Configuration_ImplementationImpl
	 * @see tinyos_metamodel.impl.Tinyos_metamodelPackageImpl#getConfiguration_Implementation()
	 * @generated
	 */
	int CONFIGURATION_IMPLEMENTATION = 6;

	/**
	 * The feature id for the '<em><b>Has Wiring</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION_IMPLEMENTATION__HAS_WIRING = 0;

	/**
	 * The feature id for the '<em><b>Defines Components</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION_IMPLEMENTATION__DEFINES_COMPONENTS = 1;

	/**
	 * The number of structural features of the '<em>Configuration Implementation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION_IMPLEMENTATION_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Configuration Implementation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION_IMPLEMENTATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link tinyos_metamodel.impl.Configuration_SignatureImpl <em>Configuration Signature</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tinyos_metamodel.impl.Configuration_SignatureImpl
	 * @see tinyos_metamodel.impl.Tinyos_metamodelPackageImpl#getConfiguration_Signature()
	 * @generated
	 */
	int CONFIGURATION_SIGNATURE = 7;

	/**
	 * The feature id for the '<em><b>Uses Interface</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION_SIGNATURE__USES_INTERFACE = 0;

	/**
	 * The feature id for the '<em><b>Provides Interface</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION_SIGNATURE__PROVIDES_INTERFACE = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION_SIGNATURE__NAME = 2;

	/**
	 * The number of structural features of the '<em>Configuration Signature</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION_SIGNATURE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Configuration Signature</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION_SIGNATURE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link tinyos_metamodel.impl.InterfaceImpl <em>Interface</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tinyos_metamodel.impl.InterfaceImpl
	 * @see tinyos_metamodel.impl.Tinyos_metamodelPackageImpl#getInterface()
	 * @generated
	 */
	int INTERFACE = 8;

	/**
	 * The feature id for the '<em><b>Has Function</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE__HAS_FUNCTION = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE__NAME = 1;

	/**
	 * The number of structural features of the '<em>Interface</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Interface</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link tinyos_metamodel.impl.FunctionImpl <em>Function</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tinyos_metamodel.impl.FunctionImpl
	 * @see tinyos_metamodel.impl.Tinyos_metamodelPackageImpl#getFunction()
	 * @generated
	 */
	int FUNCTION = 9;

	/**
	 * The feature id for the '<em><b>Has Command</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION__HAS_COMMAND = 0;

	/**
	 * The feature id for the '<em><b>Has Event</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION__HAS_EVENT = 1;

	/**
	 * The feature id for the '<em><b>Has Task</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION__HAS_TASK = 2;

	/**
	 * The feature id for the '<em><b>Has helper function</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION__HAS_HELPER_FUNCTION = 3;

	/**
	 * The number of structural features of the '<em>Function</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Function</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link tinyos_metamodel.impl.EventImpl <em>Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tinyos_metamodel.impl.EventImpl
	 * @see tinyos_metamodel.impl.Tinyos_metamodelPackageImpl#getEvent()
	 * @generated
	 */
	int EVENT = 10;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT__NAME = 0;

	/**
	 * The feature id for the '<em><b>Has Task</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT__HAS_TASK = 1;

	/**
	 * The feature id for the '<em><b>Contents</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT__CONTENTS = 2;

	/**
	 * The number of structural features of the '<em>Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link tinyos_metamodel.impl.CommandImpl <em>Command</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tinyos_metamodel.impl.CommandImpl
	 * @see tinyos_metamodel.impl.Tinyos_metamodelPackageImpl#getCommand()
	 * @generated
	 */
	int COMMAND = 11;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND__NAME = 0;

	/**
	 * The feature id for the '<em><b>Has Task</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND__HAS_TASK = 1;

	/**
	 * The feature id for the '<em><b>Contents</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND__CONTENTS = 2;

	/**
	 * The number of structural features of the '<em>Command</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Command</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link tinyos_metamodel.impl.nesCImpl <em>nes C</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tinyos_metamodel.impl.nesCImpl
	 * @see tinyos_metamodel.impl.Tinyos_metamodelPackageImpl#getnesC()
	 * @generated
	 */
	int NES_C = 12;

	/**
	 * The feature id for the '<em><b>Content</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NES_C__CONTENT = 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NES_C__DESCRIPTION = 1;

	/**
	 * The number of structural features of the '<em>nes C</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NES_C_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>nes C</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NES_C_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link tinyos_metamodel.impl.WiringImpl <em>Wiring</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tinyos_metamodel.impl.WiringImpl
	 * @see tinyos_metamodel.impl.Tinyos_metamodelPackageImpl#getWiring()
	 * @generated
	 */
	int WIRING = 13;

	/**
	 * The feature id for the '<em><b>Wires Component</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIRING__WIRES_COMPONENT = 0;

	/**
	 * The feature id for the '<em><b>Has nes Cwiring code</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIRING__HAS_NES_CWIRING_CODE = 1;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIRING__DESCRIPTION = 2;

	/**
	 * The number of structural features of the '<em>Wiring</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIRING_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Wiring</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIRING_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link tinyos_metamodel.impl.ComponentsImpl <em>Components</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tinyos_metamodel.impl.ComponentsImpl
	 * @see tinyos_metamodel.impl.Tinyos_metamodelPackageImpl#getComponents()
	 * @generated
	 */
	int COMPONENTS = 14;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENTS__NAME = 0;

	/**
	 * The number of structural features of the '<em>Components</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENTS_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Components</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENTS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link tinyos_metamodel.impl.TaskImpl <em>Task</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tinyos_metamodel.impl.TaskImpl
	 * @see tinyos_metamodel.impl.Tinyos_metamodelPackageImpl#getTask()
	 * @generated
	 */
	int TASK = 15;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__NAME = 0;

	/**
	 * The feature id for the '<em><b>Contents</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__CONTENTS = 1;

	/**
	 * The number of structural features of the '<em>Task</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Task</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link tinyos_metamodel.impl.MoteImpl <em>Mote</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tinyos_metamodel.impl.MoteImpl
	 * @see tinyos_metamodel.impl.Tinyos_metamodelPackageImpl#getMote()
	 * @generated
	 */
	int MOTE = 16;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOTE__ID = 0;

	/**
	 * The feature id for the '<em><b>Port</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOTE__PORT = 1;

	/**
	 * The feature id for the '<em><b>Has Application</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOTE__HAS_APPLICATION = 2;

	/**
	 * The number of structural features of the '<em>Mote</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOTE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Mote</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOTE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link tinyos_metamodel.impl.IncludeDeclerationImpl <em>Include Decleration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tinyos_metamodel.impl.IncludeDeclerationImpl
	 * @see tinyos_metamodel.impl.Tinyos_metamodelPackageImpl#getIncludeDecleration()
	 * @generated
	 */
	int INCLUDE_DECLERATION = 17;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCLUDE_DECLERATION__NAME = 0;

	/**
	 * The number of structural features of the '<em>Include Decleration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCLUDE_DECLERATION_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Include Decleration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCLUDE_DECLERATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link tinyos_metamodel.impl.Helper_FunctionImpl <em>Helper Function</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tinyos_metamodel.impl.Helper_FunctionImpl
	 * @see tinyos_metamodel.impl.Tinyos_metamodelPackageImpl#getHelper_Function()
	 * @generated
	 */
	int HELPER_FUNCTION = 18;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HELPER_FUNCTION__NAME = 0;

	/**
	 * The feature id for the '<em><b>Contents</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HELPER_FUNCTION__CONTENTS = 1;

	/**
	 * The number of structural features of the '<em>Helper Function</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HELPER_FUNCTION_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Helper Function</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HELPER_FUNCTION_OPERATION_COUNT = 0;

	/**
	 * Returns the meta object for class '{@link tinyos_metamodel.Application <em>Application</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Application</em>'.
	 * @see tinyos_metamodel.Application
	 * @generated
	 */
	EClass getApplication();

	/**
	 * Returns the meta object for the attribute '{@link tinyos_metamodel.Application#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see tinyos_metamodel.Application#getName()
	 * @see #getApplication()
	 * @generated
	 */
	EAttribute getApplication_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link tinyos_metamodel.Application#getHasComponent <em>Has Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Has Component</em>'.
	 * @see tinyos_metamodel.Application#getHasComponent()
	 * @see #getApplication()
	 * @generated
	 */
	EReference getApplication_HasComponent();

	/**
	 * Returns the meta object for the attribute '{@link tinyos_metamodel.Application#getInformation <em>Information</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Information</em>'.
	 * @see tinyos_metamodel.Application#getInformation()
	 * @see #getApplication()
	 * @generated
	 */
	EAttribute getApplication_Information();

	/**
	 * Returns the meta object for class '{@link tinyos_metamodel.Component <em>Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Component</em>'.
	 * @see tinyos_metamodel.Component
	 * @generated
	 */
	EClass getComponent();

	/**
	 * Returns the meta object for the attribute '{@link tinyos_metamodel.Component#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see tinyos_metamodel.Component#getName()
	 * @see #getComponent()
	 * @generated
	 */
	EAttribute getComponent_Name();

	/**
	 * Returns the meta object for the containment reference '{@link tinyos_metamodel.Component#getContainsModule <em>Contains Module</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Contains Module</em>'.
	 * @see tinyos_metamodel.Component#getContainsModule()
	 * @see #getComponent()
	 * @generated
	 */
	EReference getComponent_ContainsModule();

	/**
	 * Returns the meta object for the containment reference '{@link tinyos_metamodel.Component#getContainsConfiguration <em>Contains Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Contains Configuration</em>'.
	 * @see tinyos_metamodel.Component#getContainsConfiguration()
	 * @see #getComponent()
	 * @generated
	 */
	EReference getComponent_ContainsConfiguration();

	/**
	 * Returns the meta object for the containment reference list '{@link tinyos_metamodel.Component#getHasIncludeDecleration <em>Has Include Decleration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Has Include Decleration</em>'.
	 * @see tinyos_metamodel.Component#getHasIncludeDecleration()
	 * @see #getComponent()
	 * @generated
	 */
	EReference getComponent_HasIncludeDecleration();

	/**
	 * Returns the meta object for class '{@link tinyos_metamodel.Module <em>Module</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Module</em>'.
	 * @see tinyos_metamodel.Module
	 * @generated
	 */
	EClass getModule();

	/**
	 * Returns the meta object for the containment reference '{@link tinyos_metamodel.Module#getHas_module_signature <em>Has module signature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Has module signature</em>'.
	 * @see tinyos_metamodel.Module#getHas_module_signature()
	 * @see #getModule()
	 * @generated
	 */
	EReference getModule_Has_module_signature();

	/**
	 * Returns the meta object for the containment reference '{@link tinyos_metamodel.Module#getHas_module_implementation <em>Has module implementation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Has module implementation</em>'.
	 * @see tinyos_metamodel.Module#getHas_module_implementation()
	 * @see #getModule()
	 * @generated
	 */
	EReference getModule_Has_module_implementation();

	/**
	 * Returns the meta object for the attribute '{@link tinyos_metamodel.Module#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see tinyos_metamodel.Module#getName()
	 * @see #getModule()
	 * @generated
	 */
	EAttribute getModule_Name();

	/**
	 * Returns the meta object for class '{@link tinyos_metamodel.Configuration <em>Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Configuration</em>'.
	 * @see tinyos_metamodel.Configuration
	 * @generated
	 */
	EClass getConfiguration();

	/**
	 * Returns the meta object for the containment reference '{@link tinyos_metamodel.Configuration#getHas_configuration_signature <em>Has configuration signature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Has configuration signature</em>'.
	 * @see tinyos_metamodel.Configuration#getHas_configuration_signature()
	 * @see #getConfiguration()
	 * @generated
	 */
	EReference getConfiguration_Has_configuration_signature();

	/**
	 * Returns the meta object for the containment reference '{@link tinyos_metamodel.Configuration#getHas_configuration_implementation <em>Has configuration implementation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Has configuration implementation</em>'.
	 * @see tinyos_metamodel.Configuration#getHas_configuration_implementation()
	 * @see #getConfiguration()
	 * @generated
	 */
	EReference getConfiguration_Has_configuration_implementation();

	/**
	 * Returns the meta object for the attribute '{@link tinyos_metamodel.Configuration#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see tinyos_metamodel.Configuration#getName()
	 * @see #getConfiguration()
	 * @generated
	 */
	EAttribute getConfiguration_Name();

	/**
	 * Returns the meta object for class '{@link tinyos_metamodel.Module_Signature <em>Module Signature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Module Signature</em>'.
	 * @see tinyos_metamodel.Module_Signature
	 * @generated
	 */
	EClass getModule_Signature();

	/**
	 * Returns the meta object for the containment reference list '{@link tinyos_metamodel.Module_Signature#getUsesInterface <em>Uses Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Uses Interface</em>'.
	 * @see tinyos_metamodel.Module_Signature#getUsesInterface()
	 * @see #getModule_Signature()
	 * @generated
	 */
	EReference getModule_Signature_UsesInterface();

	/**
	 * Returns the meta object for the containment reference list '{@link tinyos_metamodel.Module_Signature#getProvidesInterface <em>Provides Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Provides Interface</em>'.
	 * @see tinyos_metamodel.Module_Signature#getProvidesInterface()
	 * @see #getModule_Signature()
	 * @generated
	 */
	EReference getModule_Signature_ProvidesInterface();

	/**
	 * Returns the meta object for the attribute '{@link tinyos_metamodel.Module_Signature#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see tinyos_metamodel.Module_Signature#getName()
	 * @see #getModule_Signature()
	 * @generated
	 */
	EAttribute getModule_Signature_Name();

	/**
	 * Returns the meta object for class '{@link tinyos_metamodel.Module_Implementation <em>Module Implementation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Module Implementation</em>'.
	 * @see tinyos_metamodel.Module_Implementation
	 * @generated
	 */
	EClass getModule_Implementation();

	/**
	 * Returns the meta object for the containment reference list '{@link tinyos_metamodel.Module_Implementation#getHas_nesC_code <em>Has nes Ccode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Has nes Ccode</em>'.
	 * @see tinyos_metamodel.Module_Implementation#getHas_nesC_code()
	 * @see #getModule_Implementation()
	 * @generated
	 */
	EReference getModule_Implementation_Has_nesC_code();

	/**
	 * Returns the meta object for the containment reference list '{@link tinyos_metamodel.Module_Implementation#getImplementsEvent <em>Implements Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Implements Event</em>'.
	 * @see tinyos_metamodel.Module_Implementation#getImplementsEvent()
	 * @see #getModule_Implementation()
	 * @generated
	 */
	EReference getModule_Implementation_ImplementsEvent();

	/**
	 * Returns the meta object for the containment reference list '{@link tinyos_metamodel.Module_Implementation#getImplementsCommand <em>Implements Command</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Implements Command</em>'.
	 * @see tinyos_metamodel.Module_Implementation#getImplementsCommand()
	 * @see #getModule_Implementation()
	 * @generated
	 */
	EReference getModule_Implementation_ImplementsCommand();

	/**
	 * Returns the meta object for the containment reference list '{@link tinyos_metamodel.Module_Implementation#getImplementsTask <em>Implements Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Implements Task</em>'.
	 * @see tinyos_metamodel.Module_Implementation#getImplementsTask()
	 * @see #getModule_Implementation()
	 * @generated
	 */
	EReference getModule_Implementation_ImplementsTask();

	/**
	 * Returns the meta object for the containment reference list '{@link tinyos_metamodel.Module_Implementation#getImplements_helper_function <em>Implements helper function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Implements helper function</em>'.
	 * @see tinyos_metamodel.Module_Implementation#getImplements_helper_function()
	 * @see #getModule_Implementation()
	 * @generated
	 */
	EReference getModule_Implementation_Implements_helper_function();

	/**
	 * Returns the meta object for class '{@link tinyos_metamodel.Configuration_Implementation <em>Configuration Implementation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Configuration Implementation</em>'.
	 * @see tinyos_metamodel.Configuration_Implementation
	 * @generated
	 */
	EClass getConfiguration_Implementation();

	/**
	 * Returns the meta object for the containment reference list '{@link tinyos_metamodel.Configuration_Implementation#getHasWiring <em>Has Wiring</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Has Wiring</em>'.
	 * @see tinyos_metamodel.Configuration_Implementation#getHasWiring()
	 * @see #getConfiguration_Implementation()
	 * @generated
	 */
	EReference getConfiguration_Implementation_HasWiring();

	/**
	 * Returns the meta object for the containment reference list '{@link tinyos_metamodel.Configuration_Implementation#getDefinesComponents <em>Defines Components</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Defines Components</em>'.
	 * @see tinyos_metamodel.Configuration_Implementation#getDefinesComponents()
	 * @see #getConfiguration_Implementation()
	 * @generated
	 */
	EReference getConfiguration_Implementation_DefinesComponents();

	/**
	 * Returns the meta object for class '{@link tinyos_metamodel.Configuration_Signature <em>Configuration Signature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Configuration Signature</em>'.
	 * @see tinyos_metamodel.Configuration_Signature
	 * @generated
	 */
	EClass getConfiguration_Signature();

	/**
	 * Returns the meta object for the containment reference list '{@link tinyos_metamodel.Configuration_Signature#getUsesInterface <em>Uses Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Uses Interface</em>'.
	 * @see tinyos_metamodel.Configuration_Signature#getUsesInterface()
	 * @see #getConfiguration_Signature()
	 * @generated
	 */
	EReference getConfiguration_Signature_UsesInterface();

	/**
	 * Returns the meta object for the containment reference list '{@link tinyos_metamodel.Configuration_Signature#getProvidesInterface <em>Provides Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Provides Interface</em>'.
	 * @see tinyos_metamodel.Configuration_Signature#getProvidesInterface()
	 * @see #getConfiguration_Signature()
	 * @generated
	 */
	EReference getConfiguration_Signature_ProvidesInterface();

	/**
	 * Returns the meta object for the attribute '{@link tinyos_metamodel.Configuration_Signature#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see tinyos_metamodel.Configuration_Signature#getName()
	 * @see #getConfiguration_Signature()
	 * @generated
	 */
	EAttribute getConfiguration_Signature_Name();

	/**
	 * Returns the meta object for class '{@link tinyos_metamodel.Interface <em>Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Interface</em>'.
	 * @see tinyos_metamodel.Interface
	 * @generated
	 */
	EClass getInterface();

	/**
	 * Returns the meta object for the containment reference list '{@link tinyos_metamodel.Interface#getHasFunction <em>Has Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Has Function</em>'.
	 * @see tinyos_metamodel.Interface#getHasFunction()
	 * @see #getInterface()
	 * @generated
	 */
	EReference getInterface_HasFunction();

	/**
	 * Returns the meta object for the attribute '{@link tinyos_metamodel.Interface#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see tinyos_metamodel.Interface#getName()
	 * @see #getInterface()
	 * @generated
	 */
	EAttribute getInterface_Name();

	/**
	 * Returns the meta object for class '{@link tinyos_metamodel.Function <em>Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Function</em>'.
	 * @see tinyos_metamodel.Function
	 * @generated
	 */
	EClass getFunction();

	/**
	 * Returns the meta object for the containment reference list '{@link tinyos_metamodel.Function#getHasCommand <em>Has Command</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Has Command</em>'.
	 * @see tinyos_metamodel.Function#getHasCommand()
	 * @see #getFunction()
	 * @generated
	 */
	EReference getFunction_HasCommand();

	/**
	 * Returns the meta object for the containment reference list '{@link tinyos_metamodel.Function#getHasEvent <em>Has Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Has Event</em>'.
	 * @see tinyos_metamodel.Function#getHasEvent()
	 * @see #getFunction()
	 * @generated
	 */
	EReference getFunction_HasEvent();

	/**
	 * Returns the meta object for the containment reference list '{@link tinyos_metamodel.Function#getHasTask <em>Has Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Has Task</em>'.
	 * @see tinyos_metamodel.Function#getHasTask()
	 * @see #getFunction()
	 * @generated
	 */
	EReference getFunction_HasTask();

	/**
	 * Returns the meta object for the containment reference list '{@link tinyos_metamodel.Function#getHas_helper_function <em>Has helper function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Has helper function</em>'.
	 * @see tinyos_metamodel.Function#getHas_helper_function()
	 * @see #getFunction()
	 * @generated
	 */
	EReference getFunction_Has_helper_function();

	/**
	 * Returns the meta object for class '{@link tinyos_metamodel.Event <em>Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Event</em>'.
	 * @see tinyos_metamodel.Event
	 * @generated
	 */
	EClass getEvent();

	/**
	 * Returns the meta object for the attribute '{@link tinyos_metamodel.Event#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see tinyos_metamodel.Event#getName()
	 * @see #getEvent()
	 * @generated
	 */
	EAttribute getEvent_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link tinyos_metamodel.Event#getHasTask <em>Has Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Has Task</em>'.
	 * @see tinyos_metamodel.Event#getHasTask()
	 * @see #getEvent()
	 * @generated
	 */
	EReference getEvent_HasTask();

	/**
	 * Returns the meta object for the attribute '{@link tinyos_metamodel.Event#getContents <em>Contents</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Contents</em>'.
	 * @see tinyos_metamodel.Event#getContents()
	 * @see #getEvent()
	 * @generated
	 */
	EAttribute getEvent_Contents();

	/**
	 * Returns the meta object for class '{@link tinyos_metamodel.Command <em>Command</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Command</em>'.
	 * @see tinyos_metamodel.Command
	 * @generated
	 */
	EClass getCommand();

	/**
	 * Returns the meta object for the attribute '{@link tinyos_metamodel.Command#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see tinyos_metamodel.Command#getName()
	 * @see #getCommand()
	 * @generated
	 */
	EAttribute getCommand_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link tinyos_metamodel.Command#getHasTask <em>Has Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Has Task</em>'.
	 * @see tinyos_metamodel.Command#getHasTask()
	 * @see #getCommand()
	 * @generated
	 */
	EReference getCommand_HasTask();

	/**
	 * Returns the meta object for the attribute '{@link tinyos_metamodel.Command#getContents <em>Contents</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Contents</em>'.
	 * @see tinyos_metamodel.Command#getContents()
	 * @see #getCommand()
	 * @generated
	 */
	EAttribute getCommand_Contents();

	/**
	 * Returns the meta object for class '{@link tinyos_metamodel.nesC <em>nes C</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>nes C</em>'.
	 * @see tinyos_metamodel.nesC
	 * @generated
	 */
	EClass getnesC();

	/**
	 * Returns the meta object for the attribute '{@link tinyos_metamodel.nesC#getContent <em>Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Content</em>'.
	 * @see tinyos_metamodel.nesC#getContent()
	 * @see #getnesC()
	 * @generated
	 */
	EAttribute getnesC_Content();

	/**
	 * Returns the meta object for the attribute '{@link tinyos_metamodel.nesC#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see tinyos_metamodel.nesC#getDescription()
	 * @see #getnesC()
	 * @generated
	 */
	EAttribute getnesC_Description();

	/**
	 * Returns the meta object for class '{@link tinyos_metamodel.Wiring <em>Wiring</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Wiring</em>'.
	 * @see tinyos_metamodel.Wiring
	 * @generated
	 */
	EClass getWiring();

	/**
	 * Returns the meta object for the reference list '{@link tinyos_metamodel.Wiring#getWiresComponent <em>Wires Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Wires Component</em>'.
	 * @see tinyos_metamodel.Wiring#getWiresComponent()
	 * @see #getWiring()
	 * @generated
	 */
	EReference getWiring_WiresComponent();

	/**
	 * Returns the meta object for the containment reference list '{@link tinyos_metamodel.Wiring#getHas_nesC_wiring_code <em>Has nes Cwiring code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Has nes Cwiring code</em>'.
	 * @see tinyos_metamodel.Wiring#getHas_nesC_wiring_code()
	 * @see #getWiring()
	 * @generated
	 */
	EReference getWiring_Has_nesC_wiring_code();

	/**
	 * Returns the meta object for the attribute '{@link tinyos_metamodel.Wiring#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see tinyos_metamodel.Wiring#getDescription()
	 * @see #getWiring()
	 * @generated
	 */
	EAttribute getWiring_Description();

	/**
	 * Returns the meta object for class '{@link tinyos_metamodel.Components <em>Components</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Components</em>'.
	 * @see tinyos_metamodel.Components
	 * @generated
	 */
	EClass getComponents();

	/**
	 * Returns the meta object for the attribute '{@link tinyos_metamodel.Components#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see tinyos_metamodel.Components#getName()
	 * @see #getComponents()
	 * @generated
	 */
	EAttribute getComponents_Name();

	/**
	 * Returns the meta object for class '{@link tinyos_metamodel.Task <em>Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Task</em>'.
	 * @see tinyos_metamodel.Task
	 * @generated
	 */
	EClass getTask();

	/**
	 * Returns the meta object for the attribute '{@link tinyos_metamodel.Task#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see tinyos_metamodel.Task#getName()
	 * @see #getTask()
	 * @generated
	 */
	EAttribute getTask_Name();

	/**
	 * Returns the meta object for the attribute '{@link tinyos_metamodel.Task#getContents <em>Contents</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Contents</em>'.
	 * @see tinyos_metamodel.Task#getContents()
	 * @see #getTask()
	 * @generated
	 */
	EAttribute getTask_Contents();

	/**
	 * Returns the meta object for class '{@link tinyos_metamodel.Mote <em>Mote</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mote</em>'.
	 * @see tinyos_metamodel.Mote
	 * @generated
	 */
	EClass getMote();

	/**
	 * Returns the meta object for the attribute '{@link tinyos_metamodel.Mote#getID <em>ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ID</em>'.
	 * @see tinyos_metamodel.Mote#getID()
	 * @see #getMote()
	 * @generated
	 */
	EAttribute getMote_ID();

	/**
	 * Returns the meta object for the attribute '{@link tinyos_metamodel.Mote#getPort <em>Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Port</em>'.
	 * @see tinyos_metamodel.Mote#getPort()
	 * @see #getMote()
	 * @generated
	 */
	EAttribute getMote_Port();

	/**
	 * Returns the meta object for the containment reference '{@link tinyos_metamodel.Mote#getHasApplication <em>Has Application</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Has Application</em>'.
	 * @see tinyos_metamodel.Mote#getHasApplication()
	 * @see #getMote()
	 * @generated
	 */
	EReference getMote_HasApplication();

	/**
	 * Returns the meta object for class '{@link tinyos_metamodel.IncludeDecleration <em>Include Decleration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Include Decleration</em>'.
	 * @see tinyos_metamodel.IncludeDecleration
	 * @generated
	 */
	EClass getIncludeDecleration();

	/**
	 * Returns the meta object for the attribute '{@link tinyos_metamodel.IncludeDecleration#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see tinyos_metamodel.IncludeDecleration#getName()
	 * @see #getIncludeDecleration()
	 * @generated
	 */
	EAttribute getIncludeDecleration_Name();

	/**
	 * Returns the meta object for class '{@link tinyos_metamodel.Helper_Function <em>Helper Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Helper Function</em>'.
	 * @see tinyos_metamodel.Helper_Function
	 * @generated
	 */
	EClass getHelper_Function();

	/**
	 * Returns the meta object for the attribute '{@link tinyos_metamodel.Helper_Function#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see tinyos_metamodel.Helper_Function#getName()
	 * @see #getHelper_Function()
	 * @generated
	 */
	EAttribute getHelper_Function_Name();

	/**
	 * Returns the meta object for the attribute '{@link tinyos_metamodel.Helper_Function#getContents <em>Contents</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Contents</em>'.
	 * @see tinyos_metamodel.Helper_Function#getContents()
	 * @see #getHelper_Function()
	 * @generated
	 */
	EAttribute getHelper_Function_Contents();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	Tinyos_metamodelFactory getTinyos_metamodelFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link tinyos_metamodel.impl.ApplicationImpl <em>Application</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tinyos_metamodel.impl.ApplicationImpl
		 * @see tinyos_metamodel.impl.Tinyos_metamodelPackageImpl#getApplication()
		 * @generated
		 */
		EClass APPLICATION = eINSTANCE.getApplication();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute APPLICATION__NAME = eINSTANCE.getApplication_Name();

		/**
		 * The meta object literal for the '<em><b>Has Component</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference APPLICATION__HAS_COMPONENT = eINSTANCE.getApplication_HasComponent();

		/**
		 * The meta object literal for the '<em><b>Information</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute APPLICATION__INFORMATION = eINSTANCE.getApplication_Information();

		/**
		 * The meta object literal for the '{@link tinyos_metamodel.impl.ComponentImpl <em>Component</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tinyos_metamodel.impl.ComponentImpl
		 * @see tinyos_metamodel.impl.Tinyos_metamodelPackageImpl#getComponent()
		 * @generated
		 */
		EClass COMPONENT = eINSTANCE.getComponent();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPONENT__NAME = eINSTANCE.getComponent_Name();

		/**
		 * The meta object literal for the '<em><b>Contains Module</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT__CONTAINS_MODULE = eINSTANCE.getComponent_ContainsModule();

		/**
		 * The meta object literal for the '<em><b>Contains Configuration</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT__CONTAINS_CONFIGURATION = eINSTANCE.getComponent_ContainsConfiguration();

		/**
		 * The meta object literal for the '<em><b>Has Include Decleration</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT__HAS_INCLUDE_DECLERATION = eINSTANCE.getComponent_HasIncludeDecleration();

		/**
		 * The meta object literal for the '{@link tinyos_metamodel.impl.ModuleImpl <em>Module</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tinyos_metamodel.impl.ModuleImpl
		 * @see tinyos_metamodel.impl.Tinyos_metamodelPackageImpl#getModule()
		 * @generated
		 */
		EClass MODULE = eINSTANCE.getModule();

		/**
		 * The meta object literal for the '<em><b>Has module signature</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODULE__HAS_MODULE_SIGNATURE = eINSTANCE.getModule_Has_module_signature();

		/**
		 * The meta object literal for the '<em><b>Has module implementation</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODULE__HAS_MODULE_IMPLEMENTATION = eINSTANCE.getModule_Has_module_implementation();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODULE__NAME = eINSTANCE.getModule_Name();

		/**
		 * The meta object literal for the '{@link tinyos_metamodel.impl.ConfigurationImpl <em>Configuration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tinyos_metamodel.impl.ConfigurationImpl
		 * @see tinyos_metamodel.impl.Tinyos_metamodelPackageImpl#getConfiguration()
		 * @generated
		 */
		EClass CONFIGURATION = eINSTANCE.getConfiguration();

		/**
		 * The meta object literal for the '<em><b>Has configuration signature</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONFIGURATION__HAS_CONFIGURATION_SIGNATURE = eINSTANCE
				.getConfiguration_Has_configuration_signature();

		/**
		 * The meta object literal for the '<em><b>Has configuration implementation</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONFIGURATION__HAS_CONFIGURATION_IMPLEMENTATION = eINSTANCE
				.getConfiguration_Has_configuration_implementation();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONFIGURATION__NAME = eINSTANCE.getConfiguration_Name();

		/**
		 * The meta object literal for the '{@link tinyos_metamodel.impl.Module_SignatureImpl <em>Module Signature</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tinyos_metamodel.impl.Module_SignatureImpl
		 * @see tinyos_metamodel.impl.Tinyos_metamodelPackageImpl#getModule_Signature()
		 * @generated
		 */
		EClass MODULE_SIGNATURE = eINSTANCE.getModule_Signature();

		/**
		 * The meta object literal for the '<em><b>Uses Interface</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODULE_SIGNATURE__USES_INTERFACE = eINSTANCE.getModule_Signature_UsesInterface();

		/**
		 * The meta object literal for the '<em><b>Provides Interface</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODULE_SIGNATURE__PROVIDES_INTERFACE = eINSTANCE.getModule_Signature_ProvidesInterface();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODULE_SIGNATURE__NAME = eINSTANCE.getModule_Signature_Name();

		/**
		 * The meta object literal for the '{@link tinyos_metamodel.impl.Module_ImplementationImpl <em>Module Implementation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tinyos_metamodel.impl.Module_ImplementationImpl
		 * @see tinyos_metamodel.impl.Tinyos_metamodelPackageImpl#getModule_Implementation()
		 * @generated
		 */
		EClass MODULE_IMPLEMENTATION = eINSTANCE.getModule_Implementation();

		/**
		 * The meta object literal for the '<em><b>Has nes Ccode</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODULE_IMPLEMENTATION__HAS_NES_CCODE = eINSTANCE.getModule_Implementation_Has_nesC_code();

		/**
		 * The meta object literal for the '<em><b>Implements Event</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODULE_IMPLEMENTATION__IMPLEMENTS_EVENT = eINSTANCE.getModule_Implementation_ImplementsEvent();

		/**
		 * The meta object literal for the '<em><b>Implements Command</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODULE_IMPLEMENTATION__IMPLEMENTS_COMMAND = eINSTANCE.getModule_Implementation_ImplementsCommand();

		/**
		 * The meta object literal for the '<em><b>Implements Task</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODULE_IMPLEMENTATION__IMPLEMENTS_TASK = eINSTANCE.getModule_Implementation_ImplementsTask();

		/**
		 * The meta object literal for the '<em><b>Implements helper function</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODULE_IMPLEMENTATION__IMPLEMENTS_HELPER_FUNCTION = eINSTANCE
				.getModule_Implementation_Implements_helper_function();

		/**
		 * The meta object literal for the '{@link tinyos_metamodel.impl.Configuration_ImplementationImpl <em>Configuration Implementation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tinyos_metamodel.impl.Configuration_ImplementationImpl
		 * @see tinyos_metamodel.impl.Tinyos_metamodelPackageImpl#getConfiguration_Implementation()
		 * @generated
		 */
		EClass CONFIGURATION_IMPLEMENTATION = eINSTANCE.getConfiguration_Implementation();

		/**
		 * The meta object literal for the '<em><b>Has Wiring</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONFIGURATION_IMPLEMENTATION__HAS_WIRING = eINSTANCE.getConfiguration_Implementation_HasWiring();

		/**
		 * The meta object literal for the '<em><b>Defines Components</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONFIGURATION_IMPLEMENTATION__DEFINES_COMPONENTS = eINSTANCE
				.getConfiguration_Implementation_DefinesComponents();

		/**
		 * The meta object literal for the '{@link tinyos_metamodel.impl.Configuration_SignatureImpl <em>Configuration Signature</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tinyos_metamodel.impl.Configuration_SignatureImpl
		 * @see tinyos_metamodel.impl.Tinyos_metamodelPackageImpl#getConfiguration_Signature()
		 * @generated
		 */
		EClass CONFIGURATION_SIGNATURE = eINSTANCE.getConfiguration_Signature();

		/**
		 * The meta object literal for the '<em><b>Uses Interface</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONFIGURATION_SIGNATURE__USES_INTERFACE = eINSTANCE.getConfiguration_Signature_UsesInterface();

		/**
		 * The meta object literal for the '<em><b>Provides Interface</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONFIGURATION_SIGNATURE__PROVIDES_INTERFACE = eINSTANCE
				.getConfiguration_Signature_ProvidesInterface();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONFIGURATION_SIGNATURE__NAME = eINSTANCE.getConfiguration_Signature_Name();

		/**
		 * The meta object literal for the '{@link tinyos_metamodel.impl.InterfaceImpl <em>Interface</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tinyos_metamodel.impl.InterfaceImpl
		 * @see tinyos_metamodel.impl.Tinyos_metamodelPackageImpl#getInterface()
		 * @generated
		 */
		EClass INTERFACE = eINSTANCE.getInterface();

		/**
		 * The meta object literal for the '<em><b>Has Function</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERFACE__HAS_FUNCTION = eINSTANCE.getInterface_HasFunction();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTERFACE__NAME = eINSTANCE.getInterface_Name();

		/**
		 * The meta object literal for the '{@link tinyos_metamodel.impl.FunctionImpl <em>Function</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tinyos_metamodel.impl.FunctionImpl
		 * @see tinyos_metamodel.impl.Tinyos_metamodelPackageImpl#getFunction()
		 * @generated
		 */
		EClass FUNCTION = eINSTANCE.getFunction();

		/**
		 * The meta object literal for the '<em><b>Has Command</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FUNCTION__HAS_COMMAND = eINSTANCE.getFunction_HasCommand();

		/**
		 * The meta object literal for the '<em><b>Has Event</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FUNCTION__HAS_EVENT = eINSTANCE.getFunction_HasEvent();

		/**
		 * The meta object literal for the '<em><b>Has Task</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FUNCTION__HAS_TASK = eINSTANCE.getFunction_HasTask();

		/**
		 * The meta object literal for the '<em><b>Has helper function</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FUNCTION__HAS_HELPER_FUNCTION = eINSTANCE.getFunction_Has_helper_function();

		/**
		 * The meta object literal for the '{@link tinyos_metamodel.impl.EventImpl <em>Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tinyos_metamodel.impl.EventImpl
		 * @see tinyos_metamodel.impl.Tinyos_metamodelPackageImpl#getEvent()
		 * @generated
		 */
		EClass EVENT = eINSTANCE.getEvent();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EVENT__NAME = eINSTANCE.getEvent_Name();

		/**
		 * The meta object literal for the '<em><b>Has Task</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EVENT__HAS_TASK = eINSTANCE.getEvent_HasTask();

		/**
		 * The meta object literal for the '<em><b>Contents</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EVENT__CONTENTS = eINSTANCE.getEvent_Contents();

		/**
		 * The meta object literal for the '{@link tinyos_metamodel.impl.CommandImpl <em>Command</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tinyos_metamodel.impl.CommandImpl
		 * @see tinyos_metamodel.impl.Tinyos_metamodelPackageImpl#getCommand()
		 * @generated
		 */
		EClass COMMAND = eINSTANCE.getCommand();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMMAND__NAME = eINSTANCE.getCommand_Name();

		/**
		 * The meta object literal for the '<em><b>Has Task</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMMAND__HAS_TASK = eINSTANCE.getCommand_HasTask();

		/**
		 * The meta object literal for the '<em><b>Contents</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMMAND__CONTENTS = eINSTANCE.getCommand_Contents();

		/**
		 * The meta object literal for the '{@link tinyos_metamodel.impl.nesCImpl <em>nes C</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tinyos_metamodel.impl.nesCImpl
		 * @see tinyos_metamodel.impl.Tinyos_metamodelPackageImpl#getnesC()
		 * @generated
		 */
		EClass NES_C = eINSTANCE.getnesC();

		/**
		 * The meta object literal for the '<em><b>Content</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NES_C__CONTENT = eINSTANCE.getnesC_Content();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NES_C__DESCRIPTION = eINSTANCE.getnesC_Description();

		/**
		 * The meta object literal for the '{@link tinyos_metamodel.impl.WiringImpl <em>Wiring</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tinyos_metamodel.impl.WiringImpl
		 * @see tinyos_metamodel.impl.Tinyos_metamodelPackageImpl#getWiring()
		 * @generated
		 */
		EClass WIRING = eINSTANCE.getWiring();

		/**
		 * The meta object literal for the '<em><b>Wires Component</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WIRING__WIRES_COMPONENT = eINSTANCE.getWiring_WiresComponent();

		/**
		 * The meta object literal for the '<em><b>Has nes Cwiring code</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WIRING__HAS_NES_CWIRING_CODE = eINSTANCE.getWiring_Has_nesC_wiring_code();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WIRING__DESCRIPTION = eINSTANCE.getWiring_Description();

		/**
		 * The meta object literal for the '{@link tinyos_metamodel.impl.ComponentsImpl <em>Components</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tinyos_metamodel.impl.ComponentsImpl
		 * @see tinyos_metamodel.impl.Tinyos_metamodelPackageImpl#getComponents()
		 * @generated
		 */
		EClass COMPONENTS = eINSTANCE.getComponents();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPONENTS__NAME = eINSTANCE.getComponents_Name();

		/**
		 * The meta object literal for the '{@link tinyos_metamodel.impl.TaskImpl <em>Task</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tinyos_metamodel.impl.TaskImpl
		 * @see tinyos_metamodel.impl.Tinyos_metamodelPackageImpl#getTask()
		 * @generated
		 */
		EClass TASK = eINSTANCE.getTask();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TASK__NAME = eINSTANCE.getTask_Name();

		/**
		 * The meta object literal for the '<em><b>Contents</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TASK__CONTENTS = eINSTANCE.getTask_Contents();

		/**
		 * The meta object literal for the '{@link tinyos_metamodel.impl.MoteImpl <em>Mote</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tinyos_metamodel.impl.MoteImpl
		 * @see tinyos_metamodel.impl.Tinyos_metamodelPackageImpl#getMote()
		 * @generated
		 */
		EClass MOTE = eINSTANCE.getMote();

		/**
		 * The meta object literal for the '<em><b>ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MOTE__ID = eINSTANCE.getMote_ID();

		/**
		 * The meta object literal for the '<em><b>Port</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MOTE__PORT = eINSTANCE.getMote_Port();

		/**
		 * The meta object literal for the '<em><b>Has Application</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MOTE__HAS_APPLICATION = eINSTANCE.getMote_HasApplication();

		/**
		 * The meta object literal for the '{@link tinyos_metamodel.impl.IncludeDeclerationImpl <em>Include Decleration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tinyos_metamodel.impl.IncludeDeclerationImpl
		 * @see tinyos_metamodel.impl.Tinyos_metamodelPackageImpl#getIncludeDecleration()
		 * @generated
		 */
		EClass INCLUDE_DECLERATION = eINSTANCE.getIncludeDecleration();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INCLUDE_DECLERATION__NAME = eINSTANCE.getIncludeDecleration_Name();

		/**
		 * The meta object literal for the '{@link tinyos_metamodel.impl.Helper_FunctionImpl <em>Helper Function</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tinyos_metamodel.impl.Helper_FunctionImpl
		 * @see tinyos_metamodel.impl.Tinyos_metamodelPackageImpl#getHelper_Function()
		 * @generated
		 */
		EClass HELPER_FUNCTION = eINSTANCE.getHelper_Function();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HELPER_FUNCTION__NAME = eINSTANCE.getHelper_Function_Name();

		/**
		 * The meta object literal for the '<em><b>Contents</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HELPER_FUNCTION__CONTENTS = eINSTANCE.getHelper_Function_Contents();

	}

} //Tinyos_metamodelPackage
