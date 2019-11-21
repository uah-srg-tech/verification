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
import es.uah.aut.srg.micobs.svm.svs.VSVSStepInputs;
import es.uah.aut.srg.micobs.svm.svs.VSVSStepOutput;
import es.uah.aut.srg.micobs.svm.svs.VSVSStepOutputs;
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
 *   <li>{@link es.uah.aut.srg.micobs.svm.svs.impl.VSVSProcedureStepImpl#getPrev_step_idref <em>Prev step idref</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.svm.svs.impl.VSVSProcedureStepImpl#getOutput_idref_from_prev_step <em>Output idref from prev step</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.svm.svs.impl.VSVSProcedureStepImpl#getReplays <em>Replays</em>}</li>
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
	 * The cached value of the '{@link #getPrev_step_idref() <em>Prev step idref</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrev_step_idref()
	 * @generated
	 * @ordered
	 */
	protected VSVSProcedureStep prev_step_idref;

	/**
	 * The cached value of the '{@link #getOutput_idref_from_prev_step() <em>Output idref from prev step</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutput_idref_from_prev_step()
	 * @generated
	 * @ordered
	 */
	protected VSVSStepOutput output_idref_from_prev_step;

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
	public VSVSProcedureStep getPrev_step_idref() {
		if (prev_step_idref != null && prev_step_idref.eIsProxy()) {
			InternalEObject oldPrev_step_idref = (InternalEObject)prev_step_idref;
			prev_step_idref = (VSVSProcedureStep)eResolveProxy(oldPrev_step_idref);
			if (prev_step_idref != oldPrev_step_idref) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, svsPackage.VSVS_PROCEDURE_STEP__PREV_STEP_IDREF, oldPrev_step_idref, prev_step_idref));
			}
		}
		return prev_step_idref;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VSVSProcedureStep basicGetPrev_step_idref() {
		return prev_step_idref;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPrev_step_idref(VSVSProcedureStep newPrev_step_idref) {
		VSVSProcedureStep oldPrev_step_idref = prev_step_idref;
		prev_step_idref = newPrev_step_idref;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, svsPackage.VSVS_PROCEDURE_STEP__PREV_STEP_IDREF, oldPrev_step_idref, prev_step_idref));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VSVSStepOutput getOutput_idref_from_prev_step() {
		if (output_idref_from_prev_step != null && output_idref_from_prev_step.eIsProxy()) {
			InternalEObject oldOutput_idref_from_prev_step = (InternalEObject)output_idref_from_prev_step;
			output_idref_from_prev_step = (VSVSStepOutput)eResolveProxy(oldOutput_idref_from_prev_step);
			if (output_idref_from_prev_step != oldOutput_idref_from_prev_step) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, svsPackage.VSVS_PROCEDURE_STEP__OUTPUT_IDREF_FROM_PREV_STEP, oldOutput_idref_from_prev_step, output_idref_from_prev_step));
			}
		}
		return output_idref_from_prev_step;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VSVSStepOutput basicGetOutput_idref_from_prev_step() {
		return output_idref_from_prev_step;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOutput_idref_from_prev_step(VSVSStepOutput newOutput_idref_from_prev_step) {
		VSVSStepOutput oldOutput_idref_from_prev_step = output_idref_from_prev_step;
		output_idref_from_prev_step = newOutput_idref_from_prev_step;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, svsPackage.VSVS_PROCEDURE_STEP__OUTPUT_IDREF_FROM_PREV_STEP, oldOutput_idref_from_prev_step, output_idref_from_prev_step));
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
			case svsPackage.VSVS_PROCEDURE_STEP__PREV_STEP_IDREF:
				if (resolve) return getPrev_step_idref();
				return basicGetPrev_step_idref();
			case svsPackage.VSVS_PROCEDURE_STEP__OUTPUT_IDREF_FROM_PREV_STEP:
				if (resolve) return getOutput_idref_from_prev_step();
				return basicGetOutput_idref_from_prev_step();
			case svsPackage.VSVS_PROCEDURE_STEP__REPLAYS:
				return getReplays();
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
			case svsPackage.VSVS_PROCEDURE_STEP__PREV_STEP_IDREF:
				setPrev_step_idref((VSVSProcedureStep)newValue);
				return;
			case svsPackage.VSVS_PROCEDURE_STEP__OUTPUT_IDREF_FROM_PREV_STEP:
				setOutput_idref_from_prev_step((VSVSStepOutput)newValue);
				return;
			case svsPackage.VSVS_PROCEDURE_STEP__REPLAYS:
				setReplays((String)newValue);
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
			case svsPackage.VSVS_PROCEDURE_STEP__PREV_STEP_IDREF:
				setPrev_step_idref((VSVSProcedureStep)null);
				return;
			case svsPackage.VSVS_PROCEDURE_STEP__OUTPUT_IDREF_FROM_PREV_STEP:
				setOutput_idref_from_prev_step((VSVSStepOutput)null);
				return;
			case svsPackage.VSVS_PROCEDURE_STEP__REPLAYS:
				setReplays(REPLAYS_EDEFAULT);
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
			case svsPackage.VSVS_PROCEDURE_STEP__PREV_STEP_IDREF:
				return prev_step_idref != null;
			case svsPackage.VSVS_PROCEDURE_STEP__OUTPUT_IDREF_FROM_PREV_STEP:
				return output_idref_from_prev_step != null;
			case svsPackage.VSVS_PROCEDURE_STEP__REPLAYS:
				return REPLAYS_EDEFAULT == null ? replays != null : !REPLAYS_EDEFAULT.equals(replays);
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
