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

import tinyos_metamodel.Command;
import tinyos_metamodel.Event;
import tinyos_metamodel.Function;
import tinyos_metamodel.Helper_Function;
import tinyos_metamodel.Task;
import tinyos_metamodel.Tinyos_metamodelPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Function</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link tinyos_metamodel.impl.FunctionImpl#getHasCommand <em>Has Command</em>}</li>
 *   <li>{@link tinyos_metamodel.impl.FunctionImpl#getHasEvent <em>Has Event</em>}</li>
 *   <li>{@link tinyos_metamodel.impl.FunctionImpl#getHasTask <em>Has Task</em>}</li>
 *   <li>{@link tinyos_metamodel.impl.FunctionImpl#getHas_helper_function <em>Has helper function</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class FunctionImpl extends MinimalEObjectImpl.Container implements Function {
	/**
	 * The cached value of the '{@link #getHasCommand() <em>Has Command</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasCommand()
	 * @generated
	 * @ordered
	 */
	protected EList<Command> hasCommand;

	/**
	 * The cached value of the '{@link #getHasEvent() <em>Has Event</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasEvent()
	 * @generated
	 * @ordered
	 */
	protected EList<Event> hasEvent;

	/**
	 * The cached value of the '{@link #getHasTask() <em>Has Task</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasTask()
	 * @generated
	 * @ordered
	 */
	protected EList<Task> hasTask;

	/**
	 * The cached value of the '{@link #getHas_helper_function() <em>Has helper function</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHas_helper_function()
	 * @generated
	 * @ordered
	 */
	protected EList<Helper_Function> has_helper_function;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FunctionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Tinyos_metamodelPackage.Literals.FUNCTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Command> getHasCommand() {
		if (hasCommand == null) {
			hasCommand = new EObjectContainmentEList<Command>(Command.class, this,
					Tinyos_metamodelPackage.FUNCTION__HAS_COMMAND);
		}
		return hasCommand;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Event> getHasEvent() {
		if (hasEvent == null) {
			hasEvent = new EObjectContainmentEList<Event>(Event.class, this,
					Tinyos_metamodelPackage.FUNCTION__HAS_EVENT);
		}
		return hasEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Task> getHasTask() {
		if (hasTask == null) {
			hasTask = new EObjectContainmentEList<Task>(Task.class, this, Tinyos_metamodelPackage.FUNCTION__HAS_TASK);
		}
		return hasTask;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Helper_Function> getHas_helper_function() {
		if (has_helper_function == null) {
			has_helper_function = new EObjectContainmentEList<Helper_Function>(Helper_Function.class, this,
					Tinyos_metamodelPackage.FUNCTION__HAS_HELPER_FUNCTION);
		}
		return has_helper_function;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case Tinyos_metamodelPackage.FUNCTION__HAS_COMMAND:
			return ((InternalEList<?>) getHasCommand()).basicRemove(otherEnd, msgs);
		case Tinyos_metamodelPackage.FUNCTION__HAS_EVENT:
			return ((InternalEList<?>) getHasEvent()).basicRemove(otherEnd, msgs);
		case Tinyos_metamodelPackage.FUNCTION__HAS_TASK:
			return ((InternalEList<?>) getHasTask()).basicRemove(otherEnd, msgs);
		case Tinyos_metamodelPackage.FUNCTION__HAS_HELPER_FUNCTION:
			return ((InternalEList<?>) getHas_helper_function()).basicRemove(otherEnd, msgs);
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
		case Tinyos_metamodelPackage.FUNCTION__HAS_COMMAND:
			return getHasCommand();
		case Tinyos_metamodelPackage.FUNCTION__HAS_EVENT:
			return getHasEvent();
		case Tinyos_metamodelPackage.FUNCTION__HAS_TASK:
			return getHasTask();
		case Tinyos_metamodelPackage.FUNCTION__HAS_HELPER_FUNCTION:
			return getHas_helper_function();
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
		case Tinyos_metamodelPackage.FUNCTION__HAS_COMMAND:
			getHasCommand().clear();
			getHasCommand().addAll((Collection<? extends Command>) newValue);
			return;
		case Tinyos_metamodelPackage.FUNCTION__HAS_EVENT:
			getHasEvent().clear();
			getHasEvent().addAll((Collection<? extends Event>) newValue);
			return;
		case Tinyos_metamodelPackage.FUNCTION__HAS_TASK:
			getHasTask().clear();
			getHasTask().addAll((Collection<? extends Task>) newValue);
			return;
		case Tinyos_metamodelPackage.FUNCTION__HAS_HELPER_FUNCTION:
			getHas_helper_function().clear();
			getHas_helper_function().addAll((Collection<? extends Helper_Function>) newValue);
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
		case Tinyos_metamodelPackage.FUNCTION__HAS_COMMAND:
			getHasCommand().clear();
			return;
		case Tinyos_metamodelPackage.FUNCTION__HAS_EVENT:
			getHasEvent().clear();
			return;
		case Tinyos_metamodelPackage.FUNCTION__HAS_TASK:
			getHasTask().clear();
			return;
		case Tinyos_metamodelPackage.FUNCTION__HAS_HELPER_FUNCTION:
			getHas_helper_function().clear();
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
		case Tinyos_metamodelPackage.FUNCTION__HAS_COMMAND:
			return hasCommand != null && !hasCommand.isEmpty();
		case Tinyos_metamodelPackage.FUNCTION__HAS_EVENT:
			return hasEvent != null && !hasEvent.isEmpty();
		case Tinyos_metamodelPackage.FUNCTION__HAS_TASK:
			return hasTask != null && !hasTask.isEmpty();
		case Tinyos_metamodelPackage.FUNCTION__HAS_HELPER_FUNCTION:
			return has_helper_function != null && !has_helper_function.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //FunctionImpl
