/**
 */
package tinyos_metamodel.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import tinyos_metamodel.Configuration_Signature;
import tinyos_metamodel.Interface;
import tinyos_metamodel.Tinyos_metamodelPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Configuration Signature</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link tinyos_metamodel.impl.Configuration_SignatureImpl#getUsesInterface <em>Uses Interface</em>}</li>
 *   <li>{@link tinyos_metamodel.impl.Configuration_SignatureImpl#getProvidesInterface <em>Provides Interface</em>}</li>
 *   <li>{@link tinyos_metamodel.impl.Configuration_SignatureImpl#getName <em>Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Configuration_SignatureImpl extends MinimalEObjectImpl.Container implements Configuration_Signature {
	/**
	 * The cached value of the '{@link #getUsesInterface() <em>Uses Interface</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUsesInterface()
	 * @generated
	 * @ordered
	 */
	protected EList<Interface> usesInterface;

	/**
	 * The cached value of the '{@link #getProvidesInterface() <em>Provides Interface</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProvidesInterface()
	 * @generated
	 * @ordered
	 */
	protected EList<Interface> providesInterface;

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
	protected Configuration_SignatureImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Tinyos_metamodelPackage.Literals.CONFIGURATION_SIGNATURE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Interface> getUsesInterface() {
		if (usesInterface == null) {
			usesInterface = new EObjectContainmentEList<Interface>(Interface.class, this,
					Tinyos_metamodelPackage.CONFIGURATION_SIGNATURE__USES_INTERFACE);
		}
		return usesInterface;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Interface> getProvidesInterface() {
		if (providesInterface == null) {
			providesInterface = new EObjectContainmentEList<Interface>(Interface.class, this,
					Tinyos_metamodelPackage.CONFIGURATION_SIGNATURE__PROVIDES_INTERFACE);
		}
		return providesInterface;
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
			eNotify(new ENotificationImpl(this, Notification.SET, Tinyos_metamodelPackage.CONFIGURATION_SIGNATURE__NAME,
					oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case Tinyos_metamodelPackage.CONFIGURATION_SIGNATURE__USES_INTERFACE:
			return ((InternalEList<?>) getUsesInterface()).basicRemove(otherEnd, msgs);
		case Tinyos_metamodelPackage.CONFIGURATION_SIGNATURE__PROVIDES_INTERFACE:
			return ((InternalEList<?>) getProvidesInterface()).basicRemove(otherEnd, msgs);
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
		case Tinyos_metamodelPackage.CONFIGURATION_SIGNATURE__USES_INTERFACE:
			return getUsesInterface();
		case Tinyos_metamodelPackage.CONFIGURATION_SIGNATURE__PROVIDES_INTERFACE:
			return getProvidesInterface();
		case Tinyos_metamodelPackage.CONFIGURATION_SIGNATURE__NAME:
			return getName();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case Tinyos_metamodelPackage.CONFIGURATION_SIGNATURE__USES_INTERFACE:
			getUsesInterface().clear();
			getUsesInterface().addAll((Collection<? extends Interface>) newValue);
			return;
		case Tinyos_metamodelPackage.CONFIGURATION_SIGNATURE__PROVIDES_INTERFACE:
			getProvidesInterface().clear();
			getProvidesInterface().addAll((Collection<? extends Interface>) newValue);
			return;
		case Tinyos_metamodelPackage.CONFIGURATION_SIGNATURE__NAME:
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
		case Tinyos_metamodelPackage.CONFIGURATION_SIGNATURE__USES_INTERFACE:
			getUsesInterface().clear();
			return;
		case Tinyos_metamodelPackage.CONFIGURATION_SIGNATURE__PROVIDES_INTERFACE:
			getProvidesInterface().clear();
			return;
		case Tinyos_metamodelPackage.CONFIGURATION_SIGNATURE__NAME:
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
		case Tinyos_metamodelPackage.CONFIGURATION_SIGNATURE__USES_INTERFACE:
			return usesInterface != null && !usesInterface.isEmpty();
		case Tinyos_metamodelPackage.CONFIGURATION_SIGNATURE__PROVIDES_INTERFACE:
			return providesInterface != null && !providesInterface.isEmpty();
		case Tinyos_metamodelPackage.CONFIGURATION_SIGNATURE__NAME:
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

} //Configuration_SignatureImpl
