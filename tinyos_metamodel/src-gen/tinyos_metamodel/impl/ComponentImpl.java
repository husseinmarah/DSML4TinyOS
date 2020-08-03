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

import tinyos_metamodel.Component;
import tinyos_metamodel.Configuration;
import tinyos_metamodel.IncludeDecleration;
import tinyos_metamodel.Module;
import tinyos_metamodel.Tinyos_metamodelPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Component</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link tinyos_metamodel.impl.ComponentImpl#getName <em>Name</em>}</li>
 *   <li>{@link tinyos_metamodel.impl.ComponentImpl#getContainsModule <em>Contains Module</em>}</li>
 *   <li>{@link tinyos_metamodel.impl.ComponentImpl#getContainsConfiguration <em>Contains Configuration</em>}</li>
 *   <li>{@link tinyos_metamodel.impl.ComponentImpl#getHasIncludeDecleration <em>Has Include Decleration</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ComponentImpl extends MinimalEObjectImpl.Container implements Component {
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
	 * The cached value of the '{@link #getContainsModule() <em>Contains Module</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContainsModule()
	 * @generated
	 * @ordered
	 */
	protected Module containsModule;

	/**
	 * The cached value of the '{@link #getContainsConfiguration() <em>Contains Configuration</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContainsConfiguration()
	 * @generated
	 * @ordered
	 */
	protected Configuration containsConfiguration;

	/**
	 * The cached value of the '{@link #getHasIncludeDecleration() <em>Has Include Decleration</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasIncludeDecleration()
	 * @generated
	 * @ordered
	 */
	protected EList<IncludeDecleration> hasIncludeDecleration;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComponentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Tinyos_metamodelPackage.Literals.COMPONENT;
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
			eNotify(new ENotificationImpl(this, Notification.SET, Tinyos_metamodelPackage.COMPONENT__NAME, oldName,
					name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Module getContainsModule() {
		return containsModule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetContainsModule(Module newContainsModule, NotificationChain msgs) {
		Module oldContainsModule = containsModule;
		containsModule = newContainsModule;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					Tinyos_metamodelPackage.COMPONENT__CONTAINS_MODULE, oldContainsModule, newContainsModule);
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
	public void setContainsModule(Module newContainsModule) {
		if (newContainsModule != containsModule) {
			NotificationChain msgs = null;
			if (containsModule != null)
				msgs = ((InternalEObject) containsModule).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - Tinyos_metamodelPackage.COMPONENT__CONTAINS_MODULE, null, msgs);
			if (newContainsModule != null)
				msgs = ((InternalEObject) newContainsModule).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - Tinyos_metamodelPackage.COMPONENT__CONTAINS_MODULE, null, msgs);
			msgs = basicSetContainsModule(newContainsModule, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Tinyos_metamodelPackage.COMPONENT__CONTAINS_MODULE,
					newContainsModule, newContainsModule));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Configuration getContainsConfiguration() {
		return containsConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetContainsConfiguration(Configuration newContainsConfiguration,
			NotificationChain msgs) {
		Configuration oldContainsConfiguration = containsConfiguration;
		containsConfiguration = newContainsConfiguration;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					Tinyos_metamodelPackage.COMPONENT__CONTAINS_CONFIGURATION, oldContainsConfiguration,
					newContainsConfiguration);
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
	public void setContainsConfiguration(Configuration newContainsConfiguration) {
		if (newContainsConfiguration != containsConfiguration) {
			NotificationChain msgs = null;
			if (containsConfiguration != null)
				msgs = ((InternalEObject) containsConfiguration).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - Tinyos_metamodelPackage.COMPONENT__CONTAINS_CONFIGURATION, null, msgs);
			if (newContainsConfiguration != null)
				msgs = ((InternalEObject) newContainsConfiguration).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - Tinyos_metamodelPackage.COMPONENT__CONTAINS_CONFIGURATION, null, msgs);
			msgs = basicSetContainsConfiguration(newContainsConfiguration, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					Tinyos_metamodelPackage.COMPONENT__CONTAINS_CONFIGURATION, newContainsConfiguration,
					newContainsConfiguration));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IncludeDecleration> getHasIncludeDecleration() {
		if (hasIncludeDecleration == null) {
			hasIncludeDecleration = new EObjectContainmentEList<IncludeDecleration>(IncludeDecleration.class, this,
					Tinyos_metamodelPackage.COMPONENT__HAS_INCLUDE_DECLERATION);
		}
		return hasIncludeDecleration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case Tinyos_metamodelPackage.COMPONENT__CONTAINS_MODULE:
			return basicSetContainsModule(null, msgs);
		case Tinyos_metamodelPackage.COMPONENT__CONTAINS_CONFIGURATION:
			return basicSetContainsConfiguration(null, msgs);
		case Tinyos_metamodelPackage.COMPONENT__HAS_INCLUDE_DECLERATION:
			return ((InternalEList<?>) getHasIncludeDecleration()).basicRemove(otherEnd, msgs);
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
		case Tinyos_metamodelPackage.COMPONENT__NAME:
			return getName();
		case Tinyos_metamodelPackage.COMPONENT__CONTAINS_MODULE:
			return getContainsModule();
		case Tinyos_metamodelPackage.COMPONENT__CONTAINS_CONFIGURATION:
			return getContainsConfiguration();
		case Tinyos_metamodelPackage.COMPONENT__HAS_INCLUDE_DECLERATION:
			return getHasIncludeDecleration();
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
		case Tinyos_metamodelPackage.COMPONENT__NAME:
			setName((String) newValue);
			return;
		case Tinyos_metamodelPackage.COMPONENT__CONTAINS_MODULE:
			setContainsModule((Module) newValue);
			return;
		case Tinyos_metamodelPackage.COMPONENT__CONTAINS_CONFIGURATION:
			setContainsConfiguration((Configuration) newValue);
			return;
		case Tinyos_metamodelPackage.COMPONENT__HAS_INCLUDE_DECLERATION:
			getHasIncludeDecleration().clear();
			getHasIncludeDecleration().addAll((Collection<? extends IncludeDecleration>) newValue);
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
		case Tinyos_metamodelPackage.COMPONENT__NAME:
			setName(NAME_EDEFAULT);
			return;
		case Tinyos_metamodelPackage.COMPONENT__CONTAINS_MODULE:
			setContainsModule((Module) null);
			return;
		case Tinyos_metamodelPackage.COMPONENT__CONTAINS_CONFIGURATION:
			setContainsConfiguration((Configuration) null);
			return;
		case Tinyos_metamodelPackage.COMPONENT__HAS_INCLUDE_DECLERATION:
			getHasIncludeDecleration().clear();
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
		case Tinyos_metamodelPackage.COMPONENT__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case Tinyos_metamodelPackage.COMPONENT__CONTAINS_MODULE:
			return containsModule != null;
		case Tinyos_metamodelPackage.COMPONENT__CONTAINS_CONFIGURATION:
			return containsConfiguration != null;
		case Tinyos_metamodelPackage.COMPONENT__HAS_INCLUDE_DECLERATION:
			return hasIncludeDecleration != null && !hasIncludeDecleration.isEmpty();
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

} //ComponentImpl
