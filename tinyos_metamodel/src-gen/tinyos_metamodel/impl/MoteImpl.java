/**
 */
package tinyos_metamodel.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import tinyos_metamodel.Application;
import tinyos_metamodel.Mote;
import tinyos_metamodel.Tinyos_metamodelPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Mote</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link tinyos_metamodel.impl.MoteImpl#getID <em>ID</em>}</li>
 *   <li>{@link tinyos_metamodel.impl.MoteImpl#getPort <em>Port</em>}</li>
 *   <li>{@link tinyos_metamodel.impl.MoteImpl#getHasApplication <em>Has Application</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MoteImpl extends MinimalEObjectImpl.Container implements Mote {
	/**
	 * The default value of the '{@link #getID() <em>ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getID()
	 * @generated
	 * @ordered
	 */
	protected static final int ID_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getID() <em>ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getID()
	 * @generated
	 * @ordered
	 */
	protected int id = ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getPort() <em>Port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPort()
	 * @generated
	 * @ordered
	 */
	protected static final String PORT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPort() <em>Port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPort()
	 * @generated
	 * @ordered
	 */
	protected String port = PORT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getHasApplication() <em>Has Application</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasApplication()
	 * @generated
	 * @ordered
	 */
	protected Application hasApplication;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MoteImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Tinyos_metamodelPackage.Literals.MOTE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getID() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setID(int newID) {
		int oldID = id;
		id = newID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Tinyos_metamodelPackage.MOTE__ID, oldID, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPort() {
		return port;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPort(String newPort) {
		String oldPort = port;
		port = newPort;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Tinyos_metamodelPackage.MOTE__PORT, oldPort, port));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Application getHasApplication() {
		return hasApplication;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetHasApplication(Application newHasApplication, NotificationChain msgs) {
		Application oldHasApplication = hasApplication;
		hasApplication = newHasApplication;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					Tinyos_metamodelPackage.MOTE__HAS_APPLICATION, oldHasApplication, newHasApplication);
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
	public void setHasApplication(Application newHasApplication) {
		if (newHasApplication != hasApplication) {
			NotificationChain msgs = null;
			if (hasApplication != null)
				msgs = ((InternalEObject) hasApplication).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - Tinyos_metamodelPackage.MOTE__HAS_APPLICATION, null, msgs);
			if (newHasApplication != null)
				msgs = ((InternalEObject) newHasApplication).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - Tinyos_metamodelPackage.MOTE__HAS_APPLICATION, null, msgs);
			msgs = basicSetHasApplication(newHasApplication, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Tinyos_metamodelPackage.MOTE__HAS_APPLICATION,
					newHasApplication, newHasApplication));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case Tinyos_metamodelPackage.MOTE__HAS_APPLICATION:
			return basicSetHasApplication(null, msgs);
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
		case Tinyos_metamodelPackage.MOTE__ID:
			return getID();
		case Tinyos_metamodelPackage.MOTE__PORT:
			return getPort();
		case Tinyos_metamodelPackage.MOTE__HAS_APPLICATION:
			return getHasApplication();
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
		case Tinyos_metamodelPackage.MOTE__ID:
			setID((Integer) newValue);
			return;
		case Tinyos_metamodelPackage.MOTE__PORT:
			setPort((String) newValue);
			return;
		case Tinyos_metamodelPackage.MOTE__HAS_APPLICATION:
			setHasApplication((Application) newValue);
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
		case Tinyos_metamodelPackage.MOTE__ID:
			setID(ID_EDEFAULT);
			return;
		case Tinyos_metamodelPackage.MOTE__PORT:
			setPort(PORT_EDEFAULT);
			return;
		case Tinyos_metamodelPackage.MOTE__HAS_APPLICATION:
			setHasApplication((Application) null);
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
		case Tinyos_metamodelPackage.MOTE__ID:
			return id != ID_EDEFAULT;
		case Tinyos_metamodelPackage.MOTE__PORT:
			return PORT_EDEFAULT == null ? port != null : !PORT_EDEFAULT.equals(port);
		case Tinyos_metamodelPackage.MOTE__HAS_APPLICATION:
			return hasApplication != null;
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
		result.append(" (ID: ");
		result.append(id);
		result.append(", Port: ");
		result.append(port);
		result.append(')');
		return result.toString();
	}

} //MoteImpl
