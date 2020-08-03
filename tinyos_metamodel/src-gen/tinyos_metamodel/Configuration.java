/**
 */
package tinyos_metamodel;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Configuration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link tinyos_metamodel.Configuration#getHas_configuration_signature <em>Has configuration signature</em>}</li>
 *   <li>{@link tinyos_metamodel.Configuration#getHas_configuration_implementation <em>Has configuration implementation</em>}</li>
 *   <li>{@link tinyos_metamodel.Configuration#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see tinyos_metamodel.Tinyos_metamodelPackage#getConfiguration()
 * @model
 * @generated
 */
public interface Configuration extends EObject {
	/**
	 * Returns the value of the '<em><b>Has configuration signature</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has configuration signature</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has configuration signature</em>' containment reference.
	 * @see #setHas_configuration_signature(Configuration_Signature)
	 * @see tinyos_metamodel.Tinyos_metamodelPackage#getConfiguration_Has_configuration_signature()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Configuration_Signature getHas_configuration_signature();

	/**
	 * Sets the value of the '{@link tinyos_metamodel.Configuration#getHas_configuration_signature <em>Has configuration signature</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Has configuration signature</em>' containment reference.
	 * @see #getHas_configuration_signature()
	 * @generated
	 */
	void setHas_configuration_signature(Configuration_Signature value);

	/**
	 * Returns the value of the '<em><b>Has configuration implementation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has configuration implementation</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has configuration implementation</em>' containment reference.
	 * @see #setHas_configuration_implementation(Configuration_Implementation)
	 * @see tinyos_metamodel.Tinyos_metamodelPackage#getConfiguration_Has_configuration_implementation()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Configuration_Implementation getHas_configuration_implementation();

	/**
	 * Sets the value of the '{@link tinyos_metamodel.Configuration#getHas_configuration_implementation <em>Has configuration implementation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Has configuration implementation</em>' containment reference.
	 * @see #getHas_configuration_implementation()
	 * @generated
	 */
	void setHas_configuration_implementation(Configuration_Implementation value);

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
	 * @see tinyos_metamodel.Tinyos_metamodelPackage#getConfiguration_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link tinyos_metamodel.Configuration#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // Configuration
