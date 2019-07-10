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

import es.uah.aut.srg.micobs.svm.svs.VSVSStepConcurrentStep;
import es.uah.aut.srg.micobs.svm.svs.VSVSStepConcurrentSteps;
import es.uah.aut.srg.micobs.svm.svs.VSVSStepNextStep;
import es.uah.aut.srg.micobs.svm.svs.svsPackage;

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

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>VSVS Step Concurrent Steps</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link es.uah.aut.srg.micobs.svm.svs.impl.VSVSStepConcurrentStepsImpl#getNextStep <em>Next Step</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.svm.svs.impl.VSVSStepConcurrentStepsImpl#getConcurrent_step <em>Concurrent step</em>}</li>
 * </ul>
 *
 * @generated
 */
public class VSVSStepConcurrentStepsImpl extends MinimalEObjectImpl.Container implements VSVSStepConcurrentSteps {
	/**
	 * The cached value of the '{@link #getNextStep() <em>Next Step</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNextStep()
	 * @generated
	 * @ordered
	 */
	protected VSVSStepNextStep nextStep;

	/**
	 * The cached value of the '{@link #getConcurrent_step() <em>Concurrent step</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConcurrent_step()
	 * @generated
	 * @ordered
	 */
	protected EList<VSVSStepConcurrentStep> concurrent_step;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VSVSStepConcurrentStepsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return svsPackage.Literals.VSVS_STEP_CONCURRENT_STEPS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VSVSStepNextStep getNextStep() {
		return nextStep;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNextStep(VSVSStepNextStep newNextStep, NotificationChain msgs) {
		VSVSStepNextStep oldNextStep = nextStep;
		nextStep = newNextStep;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, svsPackage.VSVS_STEP_CONCURRENT_STEPS__NEXT_STEP, oldNextStep, newNextStep);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNextStep(VSVSStepNextStep newNextStep) {
		if (newNextStep != nextStep) {
			NotificationChain msgs = null;
			if (nextStep != null)
				msgs = ((InternalEObject)nextStep).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - svsPackage.VSVS_STEP_CONCURRENT_STEPS__NEXT_STEP, null, msgs);
			if (newNextStep != null)
				msgs = ((InternalEObject)newNextStep).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - svsPackage.VSVS_STEP_CONCURRENT_STEPS__NEXT_STEP, null, msgs);
			msgs = basicSetNextStep(newNextStep, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, svsPackage.VSVS_STEP_CONCURRENT_STEPS__NEXT_STEP, newNextStep, newNextStep));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<VSVSStepConcurrentStep> getConcurrent_step() {
		if (concurrent_step == null) {
			concurrent_step = new EObjectContainmentEList<VSVSStepConcurrentStep>(VSVSStepConcurrentStep.class, this, svsPackage.VSVS_STEP_CONCURRENT_STEPS__CONCURRENT_STEP);
		}
		return concurrent_step;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case svsPackage.VSVS_STEP_CONCURRENT_STEPS__NEXT_STEP:
				return basicSetNextStep(null, msgs);
			case svsPackage.VSVS_STEP_CONCURRENT_STEPS__CONCURRENT_STEP:
				return ((InternalEList<?>)getConcurrent_step()).basicRemove(otherEnd, msgs);
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
			case svsPackage.VSVS_STEP_CONCURRENT_STEPS__NEXT_STEP:
				return getNextStep();
			case svsPackage.VSVS_STEP_CONCURRENT_STEPS__CONCURRENT_STEP:
				return getConcurrent_step();
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
			case svsPackage.VSVS_STEP_CONCURRENT_STEPS__NEXT_STEP:
				setNextStep((VSVSStepNextStep)newValue);
				return;
			case svsPackage.VSVS_STEP_CONCURRENT_STEPS__CONCURRENT_STEP:
				getConcurrent_step().clear();
				getConcurrent_step().addAll((Collection<? extends VSVSStepConcurrentStep>)newValue);
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
			case svsPackage.VSVS_STEP_CONCURRENT_STEPS__NEXT_STEP:
				setNextStep((VSVSStepNextStep)null);
				return;
			case svsPackage.VSVS_STEP_CONCURRENT_STEPS__CONCURRENT_STEP:
				getConcurrent_step().clear();
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
			case svsPackage.VSVS_STEP_CONCURRENT_STEPS__NEXT_STEP:
				return nextStep != null;
			case svsPackage.VSVS_STEP_CONCURRENT_STEPS__CONCURRENT_STEP:
				return concurrent_step != null && !concurrent_step.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //VSVSStepConcurrentStepsImpl
