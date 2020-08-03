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
import tinyos_metamodel.Helper_Function;
import tinyos_metamodel.Module_Implementation;
import tinyos_metamodel.Task;
import tinyos_metamodel.Tinyos_metamodelPackage;
import tinyos_metamodel.nesC;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Module Implementation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link tinyos_metamodel.impl.Module_ImplementationImpl#getHas_nesC_code <em>Has nes Ccode</em>}</li>
 *   <li>{@link tinyos_metamodel.impl.Module_ImplementationImpl#getImplementsEvent <em>Implements Event</em>}</li>
 *   <li>{@link tinyos_metamodel.impl.Module_ImplementationImpl#getImplementsCommand <em>Implements Command</em>}</li>
 *   <li>{@link tinyos_metamodel.impl.Module_ImplementationImpl#getImplementsTask <em>Implements Task</em>}</li>
 *   <li>{@link tinyos_metamodel.impl.Module_ImplementationImpl#getImplements_helper_function <em>Implements helper function</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Module_ImplementationImpl extends MinimalEObjectImpl.Container implements Module_Implementation {
	/**
	 * The cached value of the '{@link #getHas_nesC_code() <em>Has nes Ccode</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHas_nesC_code()
	 * @generated
	 * @ordered
	 */
	protected EList<nesC> has_nesC_code;

	/**
	 * The cached value of the '{@link #getImplementsEvent() <em>Implements Event</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImplementsEvent()
	 * @generated
	 * @ordered
	 */
	protected EList<Event> implementsEvent;

	/**
	 * The cached value of the '{@link #getImplementsCommand() <em>Implements Command</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImplementsCommand()
	 * @generated
	 * @ordered
	 */
	protected EList<Command> implementsCommand;

	/**
	 * The cached value of the '{@link #getImplementsTask() <em>Implements Task</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImplementsTask()
	 * @generated
	 * @ordered
	 */
	protected EList<Task> implementsTask;

	/**
	 * The cached value of the '{@link #getImplements_helper_function() <em>Implements helper function</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImplements_helper_function()
	 * @generated
	 * @ordered
	 */
	protected EList<Helper_Function> implements_helper_function;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Module_ImplementationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Tinyos_metamodelPackage.Literals.MODULE_IMPLEMENTATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<nesC> getHas_nesC_code() {
		if (has_nesC_code == null) {
			has_nesC_code = new EObjectContainmentEList<nesC>(nesC.class, this,
					Tinyos_metamodelPackage.MODULE_IMPLEMENTATION__HAS_NES_CCODE);
		}
		return has_nesC_code;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Event> getImplementsEvent() {
		if (implementsEvent == null) {
			implementsEvent = new EObjectContainmentEList<Event>(Event.class, this,
					Tinyos_metamodelPackage.MODULE_IMPLEMENTATION__IMPLEMENTS_EVENT);
		}
		return implementsEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Command> getImplementsCommand() {
		if (implementsCommand == null) {
			implementsCommand = new EObjectContainmentEList<Command>(Command.class, this,
					Tinyos_metamodelPackage.MODULE_IMPLEMENTATION__IMPLEMENTS_COMMAND);
		}
		return implementsCommand;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Task> getImplementsTask() {
		if (implementsTask == null) {
			implementsTask = new EObjectContainmentEList<Task>(Task.class, this,
					Tinyos_metamodelPackage.MODULE_IMPLEMENTATION__IMPLEMENTS_TASK);
		}
		return implementsTask;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Helper_Function> getImplements_helper_function() {
		if (implements_helper_function == null) {
			implements_helper_function = new EObjectContainmentEList<Helper_Function>(Helper_Function.class, this,
					Tinyos_metamodelPackage.MODULE_IMPLEMENTATION__IMPLEMENTS_HELPER_FUNCTION);
		}
		return implements_helper_function;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case Tinyos_metamodelPackage.MODULE_IMPLEMENTATION__HAS_NES_CCODE:
			return ((InternalEList<?>) getHas_nesC_code()).basicRemove(otherEnd, msgs);
		case Tinyos_metamodelPackage.MODULE_IMPLEMENTATION__IMPLEMENTS_EVENT:
			return ((InternalEList<?>) getImplementsEvent()).basicRemove(otherEnd, msgs);
		case Tinyos_metamodelPackage.MODULE_IMPLEMENTATION__IMPLEMENTS_COMMAND:
			return ((InternalEList<?>) getImplementsCommand()).basicRemove(otherEnd, msgs);
		case Tinyos_metamodelPackage.MODULE_IMPLEMENTATION__IMPLEMENTS_TASK:
			return ((InternalEList<?>) getImplementsTask()).basicRemove(otherEnd, msgs);
		case Tinyos_metamodelPackage.MODULE_IMPLEMENTATION__IMPLEMENTS_HELPER_FUNCTION:
			return ((InternalEList<?>) getImplements_helper_function()).basicRemove(otherEnd, msgs);
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
		case Tinyos_metamodelPackage.MODULE_IMPLEMENTATION__HAS_NES_CCODE:
			return getHas_nesC_code();
		case Tinyos_metamodelPackage.MODULE_IMPLEMENTATION__IMPLEMENTS_EVENT:
			return getImplementsEvent();
		case Tinyos_metamodelPackage.MODULE_IMPLEMENTATION__IMPLEMENTS_COMMAND:
			return getImplementsCommand();
		case Tinyos_metamodelPackage.MODULE_IMPLEMENTATION__IMPLEMENTS_TASK:
			return getImplementsTask();
		case Tinyos_metamodelPackage.MODULE_IMPLEMENTATION__IMPLEMENTS_HELPER_FUNCTION:
			return getImplements_helper_function();
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
		case Tinyos_metamodelPackage.MODULE_IMPLEMENTATION__HAS_NES_CCODE:
			getHas_nesC_code().clear();
			getHas_nesC_code().addAll((Collection<? extends nesC>) newValue);
			return;
		case Tinyos_metamodelPackage.MODULE_IMPLEMENTATION__IMPLEMENTS_EVENT:
			getImplementsEvent().clear();
			getImplementsEvent().addAll((Collection<? extends Event>) newValue);
			return;
		case Tinyos_metamodelPackage.MODULE_IMPLEMENTATION__IMPLEMENTS_COMMAND:
			getImplementsCommand().clear();
			getImplementsCommand().addAll((Collection<? extends Command>) newValue);
			return;
		case Tinyos_metamodelPackage.MODULE_IMPLEMENTATION__IMPLEMENTS_TASK:
			getImplementsTask().clear();
			getImplementsTask().addAll((Collection<? extends Task>) newValue);
			return;
		case Tinyos_metamodelPackage.MODULE_IMPLEMENTATION__IMPLEMENTS_HELPER_FUNCTION:
			getImplements_helper_function().clear();
			getImplements_helper_function().addAll((Collection<? extends Helper_Function>) newValue);
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
		case Tinyos_metamodelPackage.MODULE_IMPLEMENTATION__HAS_NES_CCODE:
			getHas_nesC_code().clear();
			return;
		case Tinyos_metamodelPackage.MODULE_IMPLEMENTATION__IMPLEMENTS_EVENT:
			getImplementsEvent().clear();
			return;
		case Tinyos_metamodelPackage.MODULE_IMPLEMENTATION__IMPLEMENTS_COMMAND:
			getImplementsCommand().clear();
			return;
		case Tinyos_metamodelPackage.MODULE_IMPLEMENTATION__IMPLEMENTS_TASK:
			getImplementsTask().clear();
			return;
		case Tinyos_metamodelPackage.MODULE_IMPLEMENTATION__IMPLEMENTS_HELPER_FUNCTION:
			getImplements_helper_function().clear();
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
		case Tinyos_metamodelPackage.MODULE_IMPLEMENTATION__HAS_NES_CCODE:
			return has_nesC_code != null && !has_nesC_code.isEmpty();
		case Tinyos_metamodelPackage.MODULE_IMPLEMENTATION__IMPLEMENTS_EVENT:
			return implementsEvent != null && !implementsEvent.isEmpty();
		case Tinyos_metamodelPackage.MODULE_IMPLEMENTATION__IMPLEMENTS_COMMAND:
			return implementsCommand != null && !implementsCommand.isEmpty();
		case Tinyos_metamodelPackage.MODULE_IMPLEMENTATION__IMPLEMENTS_TASK:
			return implementsTask != null && !implementsTask.isEmpty();
		case Tinyos_metamodelPackage.MODULE_IMPLEMENTATION__IMPLEMENTS_HELPER_FUNCTION:
			return implements_helper_function != null && !implements_helper_function.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //Module_ImplementationImpl
