/**
 */
package tinyos_metamodel.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import tinyos_metamodel.Configuration;
import tinyos_metamodel.Configuration_Implementation;
import tinyos_metamodel.Configuration_Signature;
import tinyos_metamodel.Tinyos_metamodelPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Configuration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link tinyos_metamodel.impl.ConfigurationImpl#getHas_configuration_signature <em>Has configuration signature</em>}</li>
 *   <li>{@link tinyos_metamodel.impl.ConfigurationImpl#getHas_configuration_implementation <em>Has configuration implementation</em>}</li>
 *   <li>{@link tinyos_metamodel.impl.ConfigurationImpl#getName <em>Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ConfigurationImpl extends MinimalEObjectImpl.Container implements Configuration {
	/**
	 * The cached value of the '{@link #getHas_configuration_signature() <em>Has configuration signature</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHas_configuration_signature()
	 * @generated
	 * @ordered
	 */
	protected Configuration_Signature has_configuration_signature;

	/**
	 * The cached value of the '{@link #getHas_configuration_implementation() <em>Has configuration implementation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHas_configuration_implementation()
	 * @generated
	 * @ordered
	 */
	protected Configuration_Implementation has_configuration_implementation;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConfigurationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Tinyos_metamodelPackage.Literals.CONFIGURATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Configuration_Signature getHas_configuration_signature() {
		return has_configuration_signature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetHas_configuration_signature(Configuration_Signature newHas_configuration_signature,
			NotificationChain msgs) {
		Configuration_Signature oldHas_configuration_signature = has_configuration_signature;
		has_configuration_signature = newHas_configuration_signature;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					Tinyos_metamodelPackage.CONFIGURATION__HAS_CONFIGURATION_SIGNATURE, oldHas_configuration_signature,
					newHas_configuration_signature);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHas_configuration_signature(Configuration_Signature newHas_configuration_signature) {
		if (newHas_configuration_signature != has_configuration_signature) {
			NotificationChain msgs = null;
			if (has_configuration_signature != null)
				msgs = ((InternalEObject) has_configuration_signature).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - Tinyos_metamodelPackage.CONFIGURATION__HAS_CONFIGURATION_SIGNATURE,
						null, msgs);
			if (newHas_configuration_signature != null)
				msgs = ((InternalEObject) newHas_configuration_signature).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - Tinyos_metamodelPackage.CONFIGURATION__HAS_CONFIGURATION_SIGNATURE,
						null, msgs);
			msgs = basicSetHas_configuration_signature(newHas_configuration_signature, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					Tinyos_metamodelPackage.CONFIGURATION__HAS_CONFIGURATION_SIGNATURE, newHas_configuration_signature,
					newHas_configuration_signature));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Configuration_Implementation getHas_configuration_implementation() {
		return has_configuration_implementation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetHas_configuration_implementation(
			Configuration_Implementation newHas_configuration_implementation, NotificationChain msgs) {
		Configuration_Implementation oldHas_configuration_implementation = has_configuration_implementation;
		has_configuration_implementation = newHas_configuration_implementation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					Tinyos_metamodelPackage.CONFIGURATION__HAS_CONFIGURATION_IMPLEMENTATION,
					oldHas_configuration_implementation, newHas_configuration_implementation);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHas_configuration_implementation(Configuration_Implementation newHas_configuration_implementation) {
		if (newHas_configuration_implementation != has_configuration_implementation) {
			NotificationChain msgs = null;
			if (has_configuration_implementation != null)
				msgs = ((InternalEObject) has_configuration_implementation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE
						- Tinyos_metamodelPackage.CONFIGURATION__HAS_CONFIGURATION_IMPLEMENTATION, null, msgs);
			if (newHas_configuration_implementation != null)
				msgs = ((InternalEObject) newHas_configuration_implementation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE
						- Tinyos_metamodelPackage.CONFIGURATION__HAS_CONFIGURATION_IMPLEMENTATION, null, msgs);
			msgs = basicSetHas_configuration_implementation(newHas_configuration_implementation, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					Tinyos_metamodelPackage.CONFIGURATION__HAS_CONFIGURATION_IMPLEMENTATION,
					newHas_configuration_implementation, newHas_configuration_implementation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Tinyos_metamodelPackage.CONFIGURATION__NAME, oldName,
					name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case Tinyos_metamodelPackage.CONFIGURATION__HAS_CONFIGURATION_SIGNATURE:
			return basicSetHas_configuration_signature(null, msgs);
		case Tinyos_metamodelPackage.CONFIGURATION__HAS_CONFIGURATION_IMPLEMENTATION:
			return basicSetHas_configuration_implementation(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case Tinyos_metamodelPackage.CONFIGURATION__HAS_CONFIGURATION_SIGNATURE:
			return getHas_configuration_signature();
		case Tinyos_metamodelPackage.CONFIGURATION__HAS_CONFIGURATION_IMPLEMENTATION:
			return getHas_configuration_implementation();
		case Tinyos_metamodelPackage.CONFIGURATION__NAME:
			return getName();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case Tinyos_metamodelPackage.CONFIGURATION__HAS_CONFIGURATION_SIGNATURE:
			setHas_configuration_signature((Configuration_Signature) newValue);
			return;
		case Tinyos_metamodelPackage.CONFIGURATION__HAS_CONFIGURATION_IMPLEMENTATION:
			setHas_configuration_implementation((Configuration_Implementation) newValue);
			return;
		case Tinyos_metamodelPackage.CONFIGURATION__NAME:
			setName((String) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case Tinyos_metamodelPackage.CONFIGURATION__HAS_CONFIGURATION_SIGNATURE:
			setHas_configuration_signature((Configuration_Signature) null);
			return;
		case Tinyos_metamodelPackage.CONFIGURATION__HAS_CONFIGURATION_IMPLEMENTATION:
			setHas_configuration_implementation((Configuration_Implementation) null);
			return;
		case Tinyos_metamodelPackage.CONFIGURATION__NAME:
			setName(NAME_EDEFAULT);
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case Tinyos_metamodelPackage.CONFIGURATION__HAS_CONFIGURATION_SIGNATURE:
			return has_configuration_signature != null;
		case Tinyos_metamodelPackage.CONFIGURATION__HAS_CONFIGURATION_IMPLEMENTATION:
			return has_configuration_implementation != null;
		case Tinyos_metamodelPackage.CONFIGURATION__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (Name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //ConfigurationImpl
