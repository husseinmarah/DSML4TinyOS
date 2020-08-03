/**
 */
package tinyos_metamodel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Component</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link tinyos_metamodel.Component#getName <em>Name</em>}</li>
 *   <li>{@link tinyos_metamodel.Component#getContainsModule <em>Contains Module</em>}</li>
 *   <li>{@link tinyos_metamodel.Component#getContainsConfiguration <em>Contains Configuration</em>}</li>
 *   <li>{@link tinyos_metamodel.Component#getHasIncludeDecleration <em>Has Include Decleration</em>}</li>
 * </ul>
 *
 * @see tinyos_metamodel.Tinyos_metamodelPackage#getComponent()
 * @model
 * @generated
 */
public interface Component extends EObject {
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
	 * @see tinyos_metamodel.Tinyos_metamodelPackage#getComponent_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link tinyos_metamodel.Component#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Contains Module</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Contains Module</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contains Module</em>' containment reference.
	 * @see #setContainsModule(Module)
	 * @see tinyos_metamodel.Tinyos_metamodelPackage#getComponent_ContainsModule()
	 * @model containment="true"
	 * @generated
	 */
	Module getContainsModule();

	/**
	 * Sets the value of the '{@link tinyos_metamodel.Component#getContainsModule <em>Contains Module</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Contains Module</em>' containment reference.
	 * @see #getContainsModule()
	 * @generated
	 */
	void setContainsModule(Module value);

	/**
	 * Returns the value of the '<em><b>Contains Configuration</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Contains Configuration</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contains Configuration</em>' containment reference.
	 * @see #setContainsConfiguration(Configuration)
	 * @see tinyos_metamodel.Tinyos_metamodelPackage#getComponent_ContainsConfiguration()
	 * @model containment="true"
	 * @generated
	 */
	Configuration getContainsConfiguration();

	/**
	 * Sets the value of the '{@link tinyos_metamodel.Component#getContainsConfiguration <em>Contains Configuration</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Contains Configuration</em>' containment reference.
	 * @see #getContainsConfiguration()
	 * @generated
	 */
	void setContainsConfiguration(Configuration value);

	/**
	 * Returns the value of the '<em><b>Has Include Decleration</b></em>' containment reference list.
	 * The list contents are of type {@link tinyos_metamodel.IncludeDecleration}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has Include Decleration</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Include Decleration</em>' containment reference list.
	 * @see tinyos_metamodel.Tinyos_metamodelPackage#getComponent_HasIncludeDecleration()
	 * @model containment="true"
	 * @generated
	 */
	EList<IncludeDecleration> getHasIncludeDecleration();

} // Component
