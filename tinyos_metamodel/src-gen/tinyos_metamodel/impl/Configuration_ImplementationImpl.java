/**
 */
package tinyos_metamodel.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import tinyos_metamodel.Components;
import tinyos_metamodel.Configuration_Implementation;
import tinyos_metamodel.Tinyos_metamodelPackage;
import tinyos_metamodel.Wiring;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Configuration Implementation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link tinyos_metamodel.impl.Configuration_ImplementationImpl#getHasWiring <em>Has Wiring</em>}</li>
 *   <li>{@link tinyos_metamodel.impl.Configuration_ImplementationImpl#getDefinesComponents <em>Defines Components</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Configuration_ImplementationImpl extends MinimalEObjectImpl.Container
		implements Configuration_Implementation {
	/**
	 * The cached value of the '{@link #getHasWiring() <em>Has Wiring</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasWiring()
	 * @generated
	 * @ordered
	 */
	protected EList<Wiring> hasWiring;

	/**
	 * The cached value of the '{@link #getDefinesComponents() <em>Defines Components</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefinesComponents()
	 * @generated
	 * @ordered
	 */
	protected EList<Components> definesComponents;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Configuration_ImplementationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Tinyos_metamodelPackage.Literals.CONFIGURATION_IMPLEMENTATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Wiring> getHasWiring() {
		if (hasWiring == null) {
			hasWiring = new EObjectContainmentEList<Wiring>(Wiring.class, this,
					Tinyos_metamodelPackage.CONFIGURATION_IMPLEMENTATION__HAS_WIRING);
		}
		return hasWiring;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Components> getDefinesComponents() {
		if (definesComponents == null) {
			definesComponents = new EObjectContainmentEList<Components>(Components.class, this,
					Tinyos_metamodelPackage.CONFIGURATION_IMPLEMENTATION__DEFINES_COMPONENTS);
		}
		return definesComponents;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case Tinyos_metamodelPackage.CONFIGURATION_IMPLEMENTATION__HAS_WIRING:
			return ((InternalEList<?>) getHasWiring()).basicRemove(otherEnd, msgs);
		case Tinyos_metamodelPackage.CONFIGURATION_IMPLEMENTATION__DEFINES_COMPONENTS:
			return ((InternalEList<?>) getDefinesComponents()).basicRemove(otherEnd, msgs);
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
		case Tinyos_metamodelPackage.CONFIGURATION_IMPLEMENTATION__HAS_WIRING:
			return getHasWiring();
		case Tinyos_metamodelPackage.CONFIGURATION_IMPLEMENTATION__DEFINES_COMPONENTS:
			return getDefinesComponents();
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
		case Tinyos_metamodelPackage.CONFIGURATION_IMPLEMENTATION__HAS_WIRING:
			getHasWiring().clear();
			getHasWiring().addAll((Collection<? extends Wiring>) newValue);
			return;
		case Tinyos_metamodelPackage.CONFIGURATION_IMPLEMENTATION__DEFINES_COMPONENTS:
			getDefinesComponents().clear();
			getDefinesComponents().addAll((Collection<? extends Components>) newValue);
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
		case Tinyos_metamodelPackage.CONFIGURATION_IMPLEMENTATION__HAS_WIRING:
			getHasWiring().clear();
			return;
		case Tinyos_metamodelPackage.CONFIGURATION_IMPLEMENTATION__DEFINES_COMPONENTS:
			getDefinesComponents().clear();
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
		case Tinyos_metamodelPackage.CONFIGURATION_IMPLEMENTATION__HAS_WIRING:
			return hasWiring != null && !hasWiring.isEmpty();
		case Tinyos_metamodelPackage.CONFIGURATION_IMPLEMENTATION__DEFINES_COMPONENTS:
			return definesComponents != null && !definesComponents.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //Configuration_ImplementationImpl
