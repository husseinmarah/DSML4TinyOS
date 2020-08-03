/**
 */
package tinyos_metamodel.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import tinyos_metamodel.Module;
import tinyos_metamodel.Module_Implementation;
import tinyos_metamodel.Module_Signature;
import tinyos_metamodel.Tinyos_metamodelPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Module</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link tinyos_metamodel.impl.ModuleImpl#getHas_module_signature <em>Has module signature</em>}</li>
 *   <li>{@link tinyos_metamodel.impl.ModuleImpl#getHas_module_implementation <em>Has module implementation</em>}</li>
 *   <li>{@link tinyos_metamodel.impl.ModuleImpl#getName <em>Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ModuleImpl extends MinimalEObjectImpl.Container implements Module {
	/**
	 * The cached value of the '{@link #getHas_module_signature() <em>Has module signature</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHas_module_signature()
	 * @generated
	 * @ordered
	 */
	protected Module_Signature has_module_signature;

	/**
	 * The cached value of the '{@link #getHas_module_implementation() <em>Has module implementation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHas_module_implementation()
	 * @generated
	 * @ordered
	 */
	protected Module_Implementation has_module_implementation;

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
	protected ModuleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Tinyos_metamodelPackage.Literals.MODULE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Module_Signature getHas_module_signature() {
		return has_module_signature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetHas_module_signature(Module_Signature newHas_module_signature,
			NotificationChain msgs) {
		Module_Signature oldHas_module_signature = has_module_signature;
		has_module_signature = newHas_module_signature;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					Tinyos_metamodelPackage.MODULE__HAS_MODULE_SIGNATURE, oldHas_module_signature,
					newHas_module_signature);
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
	public void setHas_module_signature(Module_Signature newHas_module_signature) {
		if (newHas_module_signature != has_module_signature) {
			NotificationChain msgs = null;
			if (has_module_signature != null)
				msgs = ((InternalEObject) has_module_signature).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - Tinyos_metamodelPackage.MODULE__HAS_MODULE_SIGNATURE, null, msgs);
			if (newHas_module_signature != null)
				msgs = ((InternalEObject) newHas_module_signature).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - Tinyos_metamodelPackage.MODULE__HAS_MODULE_SIGNATURE, null, msgs);
			msgs = basicSetHas_module_signature(newHas_module_signature, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Tinyos_metamodelPackage.MODULE__HAS_MODULE_SIGNATURE,
					newHas_module_signature, newHas_module_signature));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Module_Implementation getHas_module_implementation() {
		return has_module_implementation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetHas_module_implementation(Module_Implementation newHas_module_implementation,
			NotificationChain msgs) {
		Module_Implementation oldHas_module_implementation = has_module_implementation;
		has_module_implementation = newHas_module_implementation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					Tinyos_metamodelPackage.MODULE__HAS_MODULE_IMPLEMENTATION, oldHas_module_implementation,
					newHas_module_implementation);
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
	public void setHas_module_implementation(Module_Implementation newHas_module_implementation) {
		if (newHas_module_implementation != has_module_implementation) {
			NotificationChain msgs = null;
			if (has_module_implementation != null)
				msgs = ((InternalEObject) has_module_implementation).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - Tinyos_metamodelPackage.MODULE__HAS_MODULE_IMPLEMENTATION, null, msgs);
			if (newHas_module_implementation != null)
				msgs = ((InternalEObject) newHas_module_implementation).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - Tinyos_metamodelPackage.MODULE__HAS_MODULE_IMPLEMENTATION, null, msgs);
			msgs = basicSetHas_module_implementation(newHas_module_implementation, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					Tinyos_metamodelPackage.MODULE__HAS_MODULE_IMPLEMENTATION, newHas_module_implementation,
					newHas_module_implementation));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Tinyos_metamodelPackage.MODULE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case Tinyos_metamodelPackage.MODULE__HAS_MODULE_SIGNATURE:
			return basicSetHas_module_signature(null, msgs);
		case Tinyos_metamodelPackage.MODULE__HAS_MODULE_IMPLEMENTATION:
			return basicSetHas_module_implementation(null, msgs);
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
		case Tinyos_metamodelPackage.MODULE__HAS_MODULE_SIGNATURE:
			return getHas_module_signature();
		case Tinyos_metamodelPackage.MODULE__HAS_MODULE_IMPLEMENTATION:
			return getHas_module_implementation();
		case Tinyos_metamodelPackage.MODULE__NAME:
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
		case Tinyos_metamodelPackage.MODULE__HAS_MODULE_SIGNATURE:
			setHas_module_signature((Module_Signature) newValue);
			return;
		case Tinyos_metamodelPackage.MODULE__HAS_MODULE_IMPLEMENTATION:
			setHas_module_implementation((Module_Implementation) newValue);
			return;
		case Tinyos_metamodelPackage.MODULE__NAME:
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
		case Tinyos_metamodelPackage.MODULE__HAS_MODULE_SIGNATURE:
			setHas_module_signature((Module_Signature) null);
			return;
		case Tinyos_metamodelPackage.MODULE__HAS_MODULE_IMPLEMENTATION:
			setHas_module_implementation((Module_Implementation) null);
			return;
		case Tinyos_metamodelPackage.MODULE__NAME:
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
		case Tinyos_metamodelPackage.MODULE__HAS_MODULE_SIGNATURE:
			return has_module_signature != null;
		case Tinyos_metamodelPackage.MODULE__HAS_MODULE_IMPLEMENTATION:
			return has_module_implementation != null;
		case Tinyos_metamodelPackage.MODULE__NAME:
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

} //ModuleImpl
