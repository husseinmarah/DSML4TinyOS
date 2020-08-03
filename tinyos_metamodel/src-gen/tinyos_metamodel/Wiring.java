/**
 */
package tinyos_metamodel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Wiring</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link tinyos_metamodel.Wiring#getWiresComponent <em>Wires Component</em>}</li>
 *   <li>{@link tinyos_metamodel.Wiring#getHas_nesC_wiring_code <em>Has nes Cwiring code</em>}</li>
 *   <li>{@link tinyos_metamodel.Wiring#getDescription <em>Description</em>}</li>
 * </ul>
 *
 * @see tinyos_metamodel.Tinyos_metamodelPackage#getWiring()
 * @model
 * @generated
 */
public interface Wiring extends EObject {
	/**
	 * Returns the value of the '<em><b>Wires Component</b></em>' reference list.
	 * The list contents are of type {@link tinyos_metamodel.Component}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Wires Component</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Wires Component</em>' reference list.
	 * @see tinyos_metamodel.Tinyos_metamodelPackage#getWiring_WiresComponent()
	 * @model
	 * @generated
	 */
	EList<Component> getWiresComponent();

	/**
	 * Returns the value of the '<em><b>Has nes Cwiring code</b></em>' containment reference list.
	 * The list contents are of type {@link tinyos_metamodel.nesC}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has nes Cwiring code</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has nes Cwiring code</em>' containment reference list.
	 * @see tinyos_metamodel.Tinyos_metamodelPackage#getWiring_Has_nesC_wiring_code()
	 * @model containment="true"
	 * @generated
	 */
	EList<nesC> getHas_nesC_wiring_code();

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see tinyos_metamodel.Tinyos_metamodelPackage#getWiring_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link tinyos_metamodel.Wiring#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

} // Wiring
