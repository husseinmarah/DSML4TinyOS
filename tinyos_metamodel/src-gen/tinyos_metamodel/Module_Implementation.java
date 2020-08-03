/**
 */
package tinyos_metamodel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Module Implementation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link tinyos_metamodel.Module_Implementation#getHas_nesC_code <em>Has nes Ccode</em>}</li>
 *   <li>{@link tinyos_metamodel.Module_Implementation#getImplementsEvent <em>Implements Event</em>}</li>
 *   <li>{@link tinyos_metamodel.Module_Implementation#getImplementsCommand <em>Implements Command</em>}</li>
 *   <li>{@link tinyos_metamodel.Module_Implementation#getImplementsTask <em>Implements Task</em>}</li>
 *   <li>{@link tinyos_metamodel.Module_Implementation#getImplements_helper_function <em>Implements helper function</em>}</li>
 * </ul>
 *
 * @see tinyos_metamodel.Tinyos_metamodelPackage#getModule_Implementation()
 * @model
 * @generated
 */
public interface Module_Implementation extends EObject {
	/**
	 * Returns the value of the '<em><b>Has nes Ccode</b></em>' containment reference list.
	 * The list contents are of type {@link tinyos_metamodel.nesC}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has nes Ccode</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has nes Ccode</em>' containment reference list.
	 * @see tinyos_metamodel.Tinyos_metamodelPackage#getModule_Implementation_Has_nesC_code()
	 * @model containment="true"
	 * @generated
	 */
	EList<nesC> getHas_nesC_code();

	/**
	 * Returns the value of the '<em><b>Implements Event</b></em>' containment reference list.
	 * The list contents are of type {@link tinyos_metamodel.Event}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Implements Event</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Implements Event</em>' containment reference list.
	 * @see tinyos_metamodel.Tinyos_metamodelPackage#getModule_Implementation_ImplementsEvent()
	 * @model containment="true"
	 * @generated
	 */
	EList<Event> getImplementsEvent();

	/**
	 * Returns the value of the '<em><b>Implements Command</b></em>' containment reference list.
	 * The list contents are of type {@link tinyos_metamodel.Command}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Implements Command</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Implements Command</em>' containment reference list.
	 * @see tinyos_metamodel.Tinyos_metamodelPackage#getModule_Implementation_ImplementsCommand()
	 * @model containment="true"
	 * @generated
	 */
	EList<Command> getImplementsCommand();

	/**
	 * Returns the value of the '<em><b>Implements Task</b></em>' containment reference list.
	 * The list contents are of type {@link tinyos_metamodel.Task}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Implements Task</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Implements Task</em>' containment reference list.
	 * @see tinyos_metamodel.Tinyos_metamodelPackage#getModule_Implementation_ImplementsTask()
	 * @model containment="true"
	 * @generated
	 */
	EList<Task> getImplementsTask();

	/**
	 * Returns the value of the '<em><b>Implements helper function</b></em>' containment reference list.
	 * The list contents are of type {@link tinyos_metamodel.Helper_Function}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Implements helper function</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Implements helper function</em>' containment reference list.
	 * @see tinyos_metamodel.Tinyos_metamodelPackage#getModule_Implementation_Implements_helper_function()
	 * @model containment="true"
	 * @generated
	 */
	EList<Helper_Function> getImplements_helper_function();

} // Module_Implementation
