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

import es.uah.aut.srg.micobs.svm.svs.VSVSStepTelemetryData;
import es.uah.aut.srg.micobs.svm.svs.VSVSStepTelemetryDataField;
import es.uah.aut.srg.micobs.svm.svs.svsPackage;

import es.uah.aut.srg.micobs.svm.tmtemplate.VTMTemplate;
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
 * An implementation of the model object '<em><b>VSVS Step Telemetry Data</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link es.uah.aut.srg.micobs.svm.svs.impl.VSVSStepTelemetryDataImpl#getTmTemplate <em>Tm Template</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.svm.svs.impl.VSVSStepTelemetryDataImpl#getFields <em>Fields</em>}</li>
 * </ul>
 *
 * @generated
 */
public class VSVSStepTelemetryDataImpl extends MinimalEObjectImpl.Container implements VSVSStepTelemetryData {
	/**
	 * The cached value of the '{@link #getTmTemplate() <em>Tm Template</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTmTemplate()
	 * @generated
	 * @ordered
	 */
	protected VTMTemplate tmTemplate;

	/**
	 * The cached value of the '{@link #getFields() <em>Fields</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFields()
	 * @generated
	 * @ordered
	 */
	protected EList<VSVSStepTelemetryDataField> fields;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VSVSStepTelemetryDataImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return svsPackage.Literals.VSVS_STEP_TELEMETRY_DATA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VTMTemplate getTmTemplate() {
		if (tmTemplate != null && tmTemplate.eIsProxy()) {
			InternalEObject oldTmTemplate = (InternalEObject)tmTemplate;
			tmTemplate = (VTMTemplate)eResolveProxy(oldTmTemplate);
			if (tmTemplate != oldTmTemplate) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, svsPackage.VSVS_STEP_TELEMETRY_DATA__TM_TEMPLATE, oldTmTemplate, tmTemplate));
			}
		}
		return tmTemplate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VTMTemplate basicGetTmTemplate() {
		return tmTemplate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTmTemplate(VTMTemplate newTmTemplate) {
		VTMTemplate oldTmTemplate = tmTemplate;
		tmTemplate = newTmTemplate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, svsPackage.VSVS_STEP_TELEMETRY_DATA__TM_TEMPLATE, oldTmTemplate, tmTemplate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<VSVSStepTelemetryDataField> getFields() {
		if (fields == null) {
			fields = new EObjectContainmentEList<VSVSStepTelemetryDataField>(VSVSStepTelemetryDataField.class, this, svsPackage.VSVS_STEP_TELEMETRY_DATA__FIELDS);
		}
		return fields;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case svsPackage.VSVS_STEP_TELEMETRY_DATA__FIELDS:
				return ((InternalEList<?>)getFields()).basicRemove(otherEnd, msgs);
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
			case svsPackage.VSVS_STEP_TELEMETRY_DATA__TM_TEMPLATE:
				if (resolve) return getTmTemplate();
				return basicGetTmTemplate();
			case svsPackage.VSVS_STEP_TELEMETRY_DATA__FIELDS:
				return getFields();
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
			case svsPackage.VSVS_STEP_TELEMETRY_DATA__TM_TEMPLATE:
				setTmTemplate((VTMTemplate)newValue);
				return;
			case svsPackage.VSVS_STEP_TELEMETRY_DATA__FIELDS:
				getFields().clear();
				getFields().addAll((Collection<? extends VSVSStepTelemetryDataField>)newValue);
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
			case svsPackage.VSVS_STEP_TELEMETRY_DATA__TM_TEMPLATE:
				setTmTemplate((VTMTemplate)null);
				return;
			case svsPackage.VSVS_STEP_TELEMETRY_DATA__FIELDS:
				getFields().clear();
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
			case svsPackage.VSVS_STEP_TELEMETRY_DATA__TM_TEMPLATE:
				return tmTemplate != null;
			case svsPackage.VSVS_STEP_TELEMETRY_DATA__FIELDS:
				return fields != null && !fields.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //VSVSStepTelemetryDataImpl
