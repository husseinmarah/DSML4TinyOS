/**
 */
package tinyos_metamodel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Function</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link tinyos_metamodel.Function#getHasCommand <em>Has Command</em>}</li>
 *   <li>{@link tinyos_metamodel.Function#getHasEvent <em>Has Event</em>}</li>
 *   <li>{@link tinyos_metamodel.Function#getHasTask <em>Has Task</em>}</li>
 *   <li>{@link tinyos_metamodel.Function#getHas_helper_function <em>Has helper function</em>}</li>
 * </ul>
 *
 * @see tinyos_metamodel.Tinyos_metamodelPackage#getFunction()
 * @model abstract="true"
 * @generated
 */
public interface Function extends EObject {
	/**
	 * Returns the value of the '<em><b>Has Command</b></em>' containment reference list.
	 * The list contents are of type {@link tinyos_metamodel.Command}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has Command</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Command</em>' containment reference list.
	 * @see tinyos_metamodel.Tinyos_metamodelPackage#getFunction_HasCommand()
	 * @model containment="true"
	 * @generated
	 */
	EList<Command> getHasCommand();

	/**
	 * Returns the value of the '<em><b>Has Event</b></em>' containment reference list.
	 * The list contents are of type {@link tinyos_metamodel.Event}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has Event</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Event</em>' containment reference list.
	 * @see tinyos_metamodel.Tinyos_metamodelPackage#getFunction_HasEvent()
	 * @model containment="true"
	 * @generated
	 */
	EList<Event> getHasEvent();

	/**
	 * Returns the value of the '<em><b>Has Task</b></em>' containment reference list.
	 * The list contents are of type {@link tinyos_metamodel.Task}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has Task</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Task</em>' containment reference list.
	 * @see tinyos_metamodel.Tinyos_metamodelPackage#getFunction_HasTask()
	 * @model containment="true"
	 * @generated
	 */
	EList<Task> getHasTask();

	/**
	 * Returns the value of the '<em><b>Has helper function</b></em>' containment reference list.
	 * The list contents are of type {@link tinyos_metamodel.Helper_Function}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has helper function</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has helper function</em>' containment reference list.
	 * @see tinyos_metamodel.Tinyos_metamodelPackage#getFunction_Has_helper_function()
	 * @model containment="true"
	 * @generated
	 */
	EList<Helper_Function> getHas_helper_function();

} // Function
