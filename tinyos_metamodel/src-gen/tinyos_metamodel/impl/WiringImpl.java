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
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import tinyos_metamodel.Component;
import tinyos_metamodel.Tinyos_metamodelPackage;
import tinyos_metamodel.Wiring;
import tinyos_metamodel.nesC;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Wiring</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link tinyos_metamodel.impl.WiringImpl#getWiresComponent <em>Wires Component</em>}</li>
 *   <li>{@link tinyos_metamodel.impl.WiringImpl#getHas_nesC_wiring_code <em>Has nes Cwiring code</em>}</li>
 *   <li>{@link tinyos_metamodel.impl.WiringImpl#getDescription <em>Description</em>}</li>
 * </ul>
 *
 * @generated
 */
public class WiringImpl extends MinimalEObjectImpl.Container implements Wiring {
	/**
	 * The cached value of the '{@link #getWiresComponent() <em>Wires Component</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWiresComponent()
	 * @generated
	 * @ordered
	 */
	protected EList<Component> wiresComponent;

	/**
	 * The cached value of the '{@link #getHas_nesC_wiring_code() <em>Has nes Cwiring code</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHas_nesC_wiring_code()
	 * @generated
	 * @ordered
	 */
	protected EList<nesC> has_nesC_wiring_code;

	/**
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected String description = DESCRIPTION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WiringImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Tinyos_metamodelPackage.Literals.WIRING;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Component> getWiresComponent() {
		if (wiresComponent == null) {
			wiresComponent = new EObjectResolvingEList<Component>(Component.class, this,
					Tinyos_metamodelPackage.WIRING__WIRES_COMPONENT);
		}
		return wiresComponent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<nesC> getHas_nesC_wiring_code() {
		if (has_nesC_wiring_code == null) {
			has_nesC_wiring_code = new EObjectContainmentEList<nesC>(nesC.class, this,
					Tinyos_metamodelPackage.WIRING__HAS_NES_CWIRING_CODE);
		}
		return has_nesC_wiring_code;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription(String newDescription) {
		String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Tinyos_metamodelPackage.WIRING__DESCRIPTION,
					oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case Tinyos_metamodelPackage.WIRING__HAS_NES_CWIRING_CODE:
			return ((InternalEList<?>) getHas_nesC_wiring_code()).basicRemove(otherEnd, msgs);
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
		case Tinyos_metamodelPackage.WIRING__WIRES_COMPONENT:
			return getWiresComponent();
		case Tinyos_metamodelPackage.WIRING__HAS_NES_CWIRING_CODE:
			return getHas_nesC_wiring_code();
		case Tinyos_metamodelPackage.WIRING__DESCRIPTION:
			return getDescription();
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
		case Tinyos_metamodelPackage.WIRING__WIRES_COMPONENT:
			getWiresComponent().clear();
			getWiresComponent().addAll((Collection<? extends Component>) newValue);
			return;
		case Tinyos_metamodelPackage.WIRING__HAS_NES_CWIRING_CODE:
			getHas_nesC_wiring_code().clear();
			getHas_nesC_wiring_code().addAll((Collection<? extends nesC>) newValue);
			return;
		case Tinyos_metamodelPackage.WIRING__DESCRIPTION:
			setDescription((String) newValue);
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
		case Tinyos_metamodelPackage.WIRING__WIRES_COMPONENT:
			getWiresComponent().clear();
			return;
		case Tinyos_metamodelPackage.WIRING__HAS_NES_CWIRING_CODE:
			getHas_nesC_wiring_code().clear();
			return;
		case Tinyos_metamodelPackage.WIRING__DESCRIPTION:
			setDescription(DESCRIPTION_EDEFAULT);
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
		case Tinyos_metamodelPackage.WIRING__WIRES_COMPONENT:
			return wiresComponent != null && !wiresComponent.isEmpty();
		case Tinyos_metamodelPackage.WIRING__HAS_NES_CWIRING_CODE:
			return has_nesC_wiring_code != null && !has_nesC_wiring_code.isEmpty();
		case Tinyos_metamodelPackage.WIRING__DESCRIPTION:
			return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
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
		result.append(" (Description: ");
		result.append(description);
		result.append(')');
		return result.toString();
	}

} //WiringImpl
