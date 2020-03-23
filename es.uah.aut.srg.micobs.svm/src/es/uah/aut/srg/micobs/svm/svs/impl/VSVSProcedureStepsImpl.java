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

import es.uah.aut.srg.micobs.doctpl.doctpl.DAbstractSection;
import es.uah.aut.srg.micobs.doctpl.doctpl.impl.DFixedSectionImpl;
import es.uah.aut.srg.micobs.svm.svs.VSVSProcedureStep;
import es.uah.aut.srg.micobs.svm.svs.VSVSProcedureSteps;
import es.uah.aut.srg.micobs.svm.svs.svsPackage;

import es.uah.aut.srg.micobs.svm.testsetup.VTestSetupSupportedActionOverVariable;
import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.ECollections;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>VSVS Procedure Steps</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link es.uah.aut.srg.micobs.svm.svs.impl.VSVSProcedureStepsImpl#getStep <em>Step</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.svm.svs.impl.VSVSProcedureStepsImpl#getPriorActionOverVariable <em>Prior Action Over Variable</em>}</li>
 * </ul>
 *
 * @generated
 */
public class VSVSProcedureStepsImpl extends DFixedSectionImpl implements VSVSProcedureSteps {
	/**
	 * The cached value of the '{@link #getStep() <em>Step</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStep()
	 * @generated
	 * @ordered
	 */
	protected EList<VSVSProcedureStep> step;

	/**
	 * The cached value of the '{@link #getPriorActionOverVariable() <em>Prior Action Over Variable</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPriorActionOverVariable()
	 * @generated
	 * @ordered
	 */
	protected VTestSetupSupportedActionOverVariable priorActionOverVariable;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VSVSProcedureStepsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return svsPackage.Literals.VSVS_PROCEDURE_STEPS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<VSVSProcedureStep> getStep() {
		if (step == null) {
			step = new EObjectContainmentEList<VSVSProcedureStep>(VSVSProcedureStep.class, this, svsPackage.VSVS_PROCEDURE_STEPS__STEP);
		}
		return step;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VTestSetupSupportedActionOverVariable getPriorActionOverVariable() {
		if (priorActionOverVariable != null && priorActionOverVariable.eIsProxy()) {
			InternalEObject oldPriorActionOverVariable = (InternalEObject)priorActionOverVariable;
			priorActionOverVariable = (VTestSetupSupportedActionOverVariable)eResolveProxy(oldPriorActionOverVariable);
			if (priorActionOverVariable != oldPriorActionOverVariable) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, svsPackage.VSVS_PROCEDURE_STEPS__PRIOR_ACTION_OVER_VARIABLE, oldPriorActionOverVariable, priorActionOverVariable));
			}
		}
		return priorActionOverVariable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VTestSetupSupportedActionOverVariable basicGetPriorActionOverVariable() {
		return priorActionOverVariable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPriorActionOverVariable(VTestSetupSupportedActionOverVariable newPriorActionOverVariable) {
		VTestSetupSupportedActionOverVariable oldPriorActionOverVariable = priorActionOverVariable;
		priorActionOverVariable = newPriorActionOverVariable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, svsPackage.VSVS_PROCEDURE_STEPS__PRIOR_ACTION_OVER_VARIABLE, oldPriorActionOverVariable, priorActionOverVariable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case svsPackage.VSVS_PROCEDURE_STEPS__STEP:
				return ((InternalEList<?>)getStep()).basicRemove(otherEnd, msgs);
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
			case svsPackage.VSVS_PROCEDURE_STEPS__STEP:
				return getStep();
			case svsPackage.VSVS_PROCEDURE_STEPS__PRIOR_ACTION_OVER_VARIABLE:
				if (resolve) return getPriorActionOverVariable();
				return basicGetPriorActionOverVariable();
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
			case svsPackage.VSVS_PROCEDURE_STEPS__STEP:
				getStep().clear();
				getStep().addAll((Collection<? extends VSVSProcedureStep>)newValue);
				return;
			case svsPackage.VSVS_PROCEDURE_STEPS__PRIOR_ACTION_OVER_VARIABLE:
				setPriorActionOverVariable((VTestSetupSupportedActionOverVariable)newValue);
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
			case svsPackage.VSVS_PROCEDURE_STEPS__STEP:
				getStep().clear();
				return;
			case svsPackage.VSVS_PROCEDURE_STEPS__PRIOR_ACTION_OVER_VARIABLE:
				setPriorActionOverVariable((VTestSetupSupportedActionOverVariable)null);
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
			case svsPackage.VSVS_PROCEDURE_STEPS__STEP:
				return step != null && !step.isEmpty();
			case svsPackage.VSVS_PROCEDURE_STEPS__PRIOR_ACTION_OVER_VARIABLE:
				return priorActionOverVariable != null;
		}
		return super.eIsSet(featureID);
	}
	
	@Override
	public EList<DAbstractSection> getSubsections() {
		return ECollections.emptyEList();
	}

} //VSVSProcedureStepsImpl
