/**
 */
package tinyos_metamodel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Configuration Implementation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link tinyos_metamodel.Configuration_Implementation#getHasWiring <em>Has Wiring</em>}</li>
 *   <li>{@link tinyos_metamodel.Configuration_Implementation#getDefinesComponents <em>Defines Components</em>}</li>
 * </ul>
 *
 * @see tinyos_metamodel.Tinyos_metamodelPackage#getConfiguration_Implementation()
 * @model
 * @generated
 */
public interface Configuration_Implementation extends EObject {
	/**
	 * Returns the value of the '<em><b>Has Wiring</b></em>' containment reference list.
	 * The list contents are of type {@link tinyos_metamodel.Wiring}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has Wiring</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Wiring</em>' containment reference list.
	 * @see tinyos_metamodel.Tinyos_metamodelPackage#getConfiguration_Implementation_HasWiring()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Wiring> getHasWiring();

	/**
	 * Returns the value of the '<em><b>Defines Components</b></em>' containment reference list.
	 * The list contents are of type {@link tinyos_metamodel.Components}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Defines Components</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Defines Components</em>' containment reference list.
	 * @see tinyos_metamodel.Tinyos_metamodelPackage#getConfiguration_Implementation_DefinesComponents()
	 * @model containment="true"
	 * @generated
	 */
	EList<Components> getDefinesComponents();

} // Configuration_Implementation
