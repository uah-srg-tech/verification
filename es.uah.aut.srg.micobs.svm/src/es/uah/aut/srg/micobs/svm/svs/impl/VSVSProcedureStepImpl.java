/**
 * Copyright (c) 2019 UAH Space Research Group.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 * 
 * Contributors:
 *     SRG Team - Initial API and implementation
 */
package es.uah.aut.srg.micobs.svm.svs.impl;

import es.uah.aut.srg.micobs.svm.svs.VSVSProcedureStep;
import es.uah.aut.srg.micobs.svm.svs.VSVSStepConfigurations;
import es.uah.aut.srg.micobs.svm.svs.VSVSStepInputs;
import es.uah.aut.srg.micobs.svm.svs.VSVSStepOutputs;
import es.uah.aut.srg.micobs.svm.svs.VSVSStepTelemetry;
import es.uah.aut.srg.micobs.svm.svs.svsPackage;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>VSVS Procedure Step</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link es.uah.aut.srg.micobs.svm.svs.impl.VSVSProcedureStepImpl#getName <em>Name</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.svm.svs.impl.VSVSProcedureStepImpl#getPrev_step <em>Prev step</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.svm.svs.impl.VSVSProcedureStepImpl#getPrev_tm_from_prev_step <em>Prev tm from prev step</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.svm.svs.impl.VSVSProcedureStepImpl#getReplays <em>Replays</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.svm.svs.impl.VSVSProcedureStepImpl#getConfigurations <em>Configurations</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.svm.svs.impl.VSVSProcedureStepImpl#getInputs <em>Inputs</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.svm.svs.impl.VSVSProcedureStepImpl#getOutputs <em>Outputs</em>}</li>
 * </ul>
 *
 * @generated
 */
public class VSVSProcedureStepImpl extends MinimalEObjectImpl.Container implements VSVSProcedureStep {
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
	 * The cached value of the '{@link #getPrev_step() <em>Prev step</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrev_step()
	 * @generated
	 * @ordered
	 */
	protected VSVSProcedureStep prev_step;

	/**
	 * The cached value of the '{@link #getPrev_tm_from_prev_step() <em>Prev tm from prev step</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrev_tm_from_prev_step()
	 * @generated
	 * @ordered
	 */
	protected VSVSStepTelemetry prev_tm_from_prev_step;

	/**
	 * The default value of the '{@link #getReplays() <em>Replays</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReplays()
	 * @generated
	 * @ordered
	 */
	protected static final String REPLAYS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getReplays() <em>Replays</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReplays()
	 * @generated
	 * @ordered
	 */
	protected String replays = REPLAYS_EDEFAULT;

	/**
	 * The cached value of the '{@link #getConfigurations() <em>Configurations</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConfigurations()
	 * @generated
	 * @ordered
	 */
	protected VSVSStepConfigurations configurations;

	/**
	 * The cached value of the '{@link #getInputs() <em>Inputs</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInputs()
	 * @generated
	 * @ordered
	 */
	protected VSVSStepInputs inputs;

	/**
	 * The cached value of the '{@link #getOutputs() <em>Outputs</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutputs()
	 * @generated
	 * @ordered
	 */
	protected VSVSStepOutputs outputs;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VSVSProcedureStepImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return svsPackage.Literals.VSVS_PROCEDURE_STEP;
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
			eNotify(new ENotificationImpl(this, Notification.SET, svsPackage.VSVS_PROCEDURE_STEP__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VSVSProcedureStep getPrev_step() {
		if (prev_step != null && prev_step.eIsProxy()) {
			InternalEObject oldPrev_step = (InternalEObject)prev_step;
			prev_step = (VSVSProcedureStep)eResolveProxy(oldPrev_step);
			if (prev_step != oldPrev_step) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, svsPackage.VSVS_PROCEDURE_STEP__PREV_STEP, oldPrev_step, prev_step));
			}
		}
		return prev_step;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VSVSProcedureStep basicGetPrev_step() {
		return prev_step;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPrev_step(VSVSProcedureStep newPrev_step) {
		VSVSProcedureStep oldPrev_step = prev_step;
		prev_step = newPrev_step;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, svsPackage.VSVS_PROCEDURE_STEP__PREV_STEP, oldPrev_step, prev_step));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VSVSStepTelemetry getPrev_tm_from_prev_step() {
		if (prev_tm_from_prev_step != null && prev_tm_from_prev_step.eIsProxy()) {
			InternalEObject oldPrev_tm_from_prev_step = (InternalEObject)prev_tm_from_prev_step;
			prev_tm_from_prev_step = (VSVSStepTelemetry)eResolveProxy(oldPrev_tm_from_prev_step);
			if (prev_tm_from_prev_step != oldPrev_tm_from_prev_step) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, svsPackage.VSVS_PROCEDURE_STEP__PREV_TM_FROM_PREV_STEP, oldPrev_tm_from_prev_step, prev_tm_from_prev_step));
			}
		}
		return prev_tm_from_prev_step;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VSVSStepTelemetry basicGetPrev_tm_from_prev_step() {
		return prev_tm_from_prev_step;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPrev_tm_from_prev_step(VSVSStepTelemetry newPrev_tm_from_prev_step) {
		VSVSStepTelemetry oldPrev_tm_from_prev_step = prev_tm_from_prev_step;
		prev_tm_from_prev_step = newPrev_tm_from_prev_step;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, svsPackage.VSVS_PROCEDURE_STEP__PREV_TM_FROM_PREV_STEP, oldPrev_tm_from_prev_step, prev_tm_from_prev_step));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VSVSStepOutputs getOutputs() {
		return outputs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOutputs(VSVSStepOutputs newOutputs, NotificationChain msgs) {
		VSVSStepOutputs oldOutputs = outputs;
		outputs = newOutputs;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, svsPackage.VSVS_PROCEDURE_STEP__OUTPUTS, oldOutputs, newOutputs);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOutputs(VSVSStepOutputs newOutputs) {
		if (newOutputs != outputs) {
			NotificationChain msgs = null;
			if (outputs != null)
				msgs = ((InternalEObject)outputs).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - svsPackage.VSVS_PROCEDURE_STEP__OUTPUTS, null, msgs);
			if (newOutputs != null)
				msgs = ((InternalEObject)newOutputs).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - svsPackage.VSVS_PROCEDURE_STEP__OUTPUTS, null, msgs);
			msgs = basicSetOutputs(newOutputs, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, svsPackage.VSVS_PROCEDURE_STEP__OUTPUTS, newOutputs, newOutputs));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VSVSStepConfigurations getConfigurations() {
		return configurations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetConfigurations(VSVSStepConfigurations newConfigurations, NotificationChain msgs) {
		VSVSStepConfigurations oldConfigurations = configurations;
		configurations = newConfigurations;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, svsPackage.VSVS_PROCEDURE_STEP__CONFIGURATIONS, oldConfigurations, newConfigurations);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConfigurations(VSVSStepConfigurations newConfigurations) {
		if (newConfigurations != configurations) {
			NotificationChain msgs = null;
			if (configurations != null)
				msgs = ((InternalEObject)configurations).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - svsPackage.VSVS_PROCEDURE_STEP__CONFIGURATIONS, null, msgs);
			if (newConfigurations != null)
				msgs = ((InternalEObject)newConfigurations).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - svsPackage.VSVS_PROCEDURE_STEP__CONFIGURATIONS, null, msgs);
			msgs = basicSetConfigurations(newConfigurations, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, svsPackage.VSVS_PROCEDURE_STEP__CONFIGURATIONS, newConfigurations, newConfigurations));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VSVSStepInputs getInputs() {
		return inputs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInputs(VSVSStepInputs newInputs, NotificationChain msgs) {
		VSVSStepInputs oldInputs = inputs;
		inputs = newInputs;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, svsPackage.VSVS_PROCEDURE_STEP__INPUTS, oldInputs, newInputs);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInputs(VSVSStepInputs newInputs) {
		if (newInputs != inputs) {
			NotificationChain msgs = null;
			if (inputs != null)
				msgs = ((InternalEObject)inputs).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - svsPackage.VSVS_PROCEDURE_STEP__INPUTS, null, msgs);
			if (newInputs != null)
				msgs = ((InternalEObject)newInputs).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - svsPackage.VSVS_PROCEDURE_STEP__INPUTS, null, msgs);
			msgs = basicSetInputs(newInputs, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, svsPackage.VSVS_PROCEDURE_STEP__INPUTS, newInputs, newInputs));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getReplays() {
		return replays;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReplays(String newReplays) {
		String oldReplays = replays;
		replays = newReplays;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, svsPackage.VSVS_PROCEDURE_STEP__REPLAYS, oldReplays, replays));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case svsPackage.VSVS_PROCEDURE_STEP__CONFIGURATIONS:
				return basicSetConfigurations(null, msgs);
			case svsPackage.VSVS_PROCEDURE_STEP__INPUTS:
				return basicSetInputs(null, msgs);
			case svsPackage.VSVS_PROCEDURE_STEP__OUTPUTS:
				return basicSetOutputs(null, msgs);
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
			case svsPackage.VSVS_PROCEDURE_STEP__NAME:
				return getName();
			case svsPackage.VSVS_PROCEDURE_STEP__PREV_STEP:
				if (resolve) return getPrev_step();
				return basicGetPrev_step();
			case svsPackage.VSVS_PROCEDURE_STEP__PREV_TM_FROM_PREV_STEP:
				if (resolve) return getPrev_tm_from_prev_step();
				return basicGetPrev_tm_from_prev_step();
			case svsPackage.VSVS_PROCEDURE_STEP__REPLAYS:
				return getReplays();
			case svsPackage.VSVS_PROCEDURE_STEP__CONFIGURATIONS:
				return getConfigurations();
			case svsPackage.VSVS_PROCEDURE_STEP__INPUTS:
				return getInputs();
			case svsPackage.VSVS_PROCEDURE_STEP__OUTPUTS:
				return getOutputs();
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
			case svsPackage.VSVS_PROCEDURE_STEP__NAME:
				setName((String)newValue);
				return;
			case svsPackage.VSVS_PROCEDURE_STEP__PREV_STEP:
				setPrev_step((VSVSProcedureStep)newValue);
				return;
			case svsPackage.VSVS_PROCEDURE_STEP__PREV_TM_FROM_PREV_STEP:
				setPrev_tm_from_prev_step((VSVSStepTelemetry)newValue);
				return;
			case svsPackage.VSVS_PROCEDURE_STEP__REPLAYS:
				setReplays((String)newValue);
				return;
			case svsPackage.VSVS_PROCEDURE_STEP__CONFIGURATIONS:
				setConfigurations((VSVSStepConfigurations)newValue);
				return;
			case svsPackage.VSVS_PROCEDURE_STEP__INPUTS:
				setInputs((VSVSStepInputs)newValue);
				return;
			case svsPackage.VSVS_PROCEDURE_STEP__OUTPUTS:
				setOutputs((VSVSStepOutputs)newValue);
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
			case svsPackage.VSVS_PROCEDURE_STEP__NAME:
				setName(NAME_EDEFAULT);
				return;
			case svsPackage.VSVS_PROCEDURE_STEP__PREV_STEP:
				setPrev_step((VSVSProcedureStep)null);
				return;
			case svsPackage.VSVS_PROCEDURE_STEP__PREV_TM_FROM_PREV_STEP:
				setPrev_tm_from_prev_step((VSVSStepTelemetry)null);
				return;
			case svsPackage.VSVS_PROCEDURE_STEP__REPLAYS:
				setReplays(REPLAYS_EDEFAULT);
				return;
			case svsPackage.VSVS_PROCEDURE_STEP__CONFIGURATIONS:
				setConfigurations((VSVSStepConfigurations)null);
				return;
			case svsPackage.VSVS_PROCEDURE_STEP__INPUTS:
				setInputs((VSVSStepInputs)null);
				return;
			case svsPackage.VSVS_PROCEDURE_STEP__OUTPUTS:
				setOutputs((VSVSStepOutputs)null);
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
			case svsPackage.VSVS_PROCEDURE_STEP__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case svsPackage.VSVS_PROCEDURE_STEP__PREV_STEP:
				return prev_step != null;
			case svsPackage.VSVS_PROCEDURE_STEP__PREV_TM_FROM_PREV_STEP:
				return prev_tm_from_prev_step != null;
			case svsPackage.VSVS_PROCEDURE_STEP__REPLAYS:
				return REPLAYS_EDEFAULT == null ? replays != null : !REPLAYS_EDEFAULT.equals(replays);
			case svsPackage.VSVS_PROCEDURE_STEP__CONFIGURATIONS:
				return configurations != null;
			case svsPackage.VSVS_PROCEDURE_STEP__INPUTS:
				return inputs != null;
			case svsPackage.VSVS_PROCEDURE_STEP__OUTPUTS:
				return outputs != null;
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
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(", replays: ");
		result.append(replays);
		result.append(')');
		return result.toString();
	}

} //VSVSProcedureStepImpl
