/**
 */
package tinyos_metamodel;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Module</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link tinyos_metamodel.Module#getHas_module_signature <em>Has module signature</em>}</li>
 *   <li>{@link tinyos_metamodel.Module#getHas_module_implementation <em>Has module implementation</em>}</li>
 *   <li>{@link tinyos_metamodel.Module#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see tinyos_metamodel.Tinyos_metamodelPackage#getModule()
 * @model
 * @generated
 */
public interface Module extends EObject {
	/**
	 * Returns the value of the '<em><b>Has module signature</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has module signature</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has module signature</em>' containment reference.
	 * @see #setHas_module_signature(Module_Signature)
	 * @see tinyos_metamodel.Tinyos_metamodelPackage#getModule_Has_module_signature()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Module_Signature getHas_module_signature();

	/**
	 * Sets the value of the '{@link tinyos_metamodel.Module#getHas_module_signature <em>Has module signature</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Has module signature</em>' containment reference.
	 * @see #getHas_module_signature()
	 * @generated
	 */
	void setHas_module_signature(Module_Signature value);

	/**
	 * Returns the value of the '<em><b>Has module implementation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has module implementation</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has module implementation</em>' containment reference.
	 * @see #setHas_module_implementation(Module_Implementation)
	 * @see tinyos_metamodel.Tinyos_metamodelPackage#getModule_Has_module_implementation()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Module_Implementation getHas_module_implementation();

	/**
	 * Sets the value of the '{@link tinyos_metamodel.Module#getHas_module_implementation <em>Has module implementation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Has module implementation</em>' containment reference.
	 * @see #getHas_module_implementation()
	 * @generated
	 */
	void setHas_module_implementation(Module_Implementation value);

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
	 * @see tinyos_metamodel.Tinyos_metamodelPackage#getModule_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link tinyos_metamodel.Module#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // Module
