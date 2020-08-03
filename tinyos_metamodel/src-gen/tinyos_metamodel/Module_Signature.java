/**
 */
package tinyos_metamodel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Module Signature</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link tinyos_metamodel.Module_Signature#getUsesInterface <em>Uses Interface</em>}</li>
 *   <li>{@link tinyos_metamodel.Module_Signature#getProvidesInterface <em>Provides Interface</em>}</li>
 *   <li>{@link tinyos_metamodel.Module_Signature#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see tinyos_metamodel.Tinyos_metamodelPackage#getModule_Signature()
 * @model
 * @generated
 */
public interface Module_Signature extends EObject {
	/**
	 * Returns the value of the '<em><b>Uses Interface</b></em>' containment reference list.
	 * The list contents are of type {@link tinyos_metamodel.Interface}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Uses Interface</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Uses Interface</em>' containment reference list.
	 * @see tinyos_metamodel.Tinyos_metamodelPackage#getModule_Signature_UsesInterface()
	 * @model containment="true"
	 * @generated
	 */
	EList<Interface> getUsesInterface();

	/**
	 * Returns the value of the '<em><b>Provides Interface</b></em>' containment reference list.
	 * The list contents are of type {@link tinyos_metamodel.Interface}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Provides Interface</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Provides Interface</em>' containment reference list.
	 * @see tinyos_metamodel.Tinyos_metamodelPackage#getModule_Signature_ProvidesInterface()
	 * @model containment="true"
	 * @generated
	 */
	EList<Interface> getProvidesInterface();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see tinyos_metamodel.Tinyos_metamodelPackage#getModule_Signature_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link tinyos_metamodel.Module_Signature#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // Module_Signature
