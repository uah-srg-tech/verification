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

import es.uah.aut.srg.micobs.svm.svs.VSVSStepTelecommandData;
import es.uah.aut.srg.micobs.svm.svs.VSVSStepTelecommandDataField;
import es.uah.aut.srg.micobs.svm.svs.svsPackage;

import es.uah.aut.srg.micobs.svm.tctemplate.VTCTemplate;

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
 * An implementation of the model object '<em><b>VSVS Step Telecommand Data</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link es.uah.aut.srg.micobs.svm.svs.impl.VSVSStepTelecommandDataImpl#getTcTemplate <em>Tc Template</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.svm.svs.impl.VSVSStepTelecommandDataImpl#getFields <em>Fields</em>}</li>
 * </ul>
 *
 * @generated
 */
public class VSVSStepTelecommandDataImpl extends MinimalEObjectImpl.Container implements VSVSStepTelecommandData {
	/**
	 * The cached value of the '{@link #getTcTemplate() <em>Tc Template</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTcTemplate()
	 * @generated
	 * @ordered
	 */
	protected VTCTemplate tcTemplate;

	/**
	 * The cached value of the '{@link #getFields() <em>Fields</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFields()
	 * @generated
	 * @ordered
	 */
	protected EList<VSVSStepTelecommandDataField> fields;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VSVSStepTelecommandDataImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return svsPackage.Literals.VSVS_STEP_TELECOMMAND_DATA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VTCTemplate getTcTemplate() {
		if (tcTemplate != null && tcTemplate.eIsProxy()) {
			InternalEObject oldTcTemplate = (InternalEObject)tcTemplate;
			tcTemplate = (VTCTemplate)eResolveProxy(oldTcTemplate);
			if (tcTemplate != oldTcTemplate) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, svsPackage.VSVS_STEP_TELECOMMAND_DATA__TC_TEMPLATE, oldTcTemplate, tcTemplate));
			}
		}
		return tcTemplate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VTCTemplate basicGetTcTemplate() {
		return tcTemplate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTcTemplate(VTCTemplate newTcTemplate) {
		VTCTemplate oldTcTemplate = tcTemplate;
		tcTemplate = newTcTemplate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, svsPackage.VSVS_STEP_TELECOMMAND_DATA__TC_TEMPLATE, oldTcTemplate, tcTemplate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<VSVSStepTelecommandDataField> getFields() {
		if (fields == null) {
			fields = new EObjectContainmentEList<VSVSStepTelecommandDataField>(VSVSStepTelecommandDataField.class, this, svsPackage.VSVS_STEP_TELECOMMAND_DATA__FIELDS);
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
			case svsPackage.VSVS_STEP_TELECOMMAND_DATA__FIELDS:
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
			case svsPackage.VSVS_STEP_TELECOMMAND_DATA__TC_TEMPLATE:
				if (resolve) return getTcTemplate();
				return basicGetTcTemplate();
			case svsPackage.VSVS_STEP_TELECOMMAND_DATA__FIELDS:
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
			case svsPackage.VSVS_STEP_TELECOMMAND_DATA__TC_TEMPLATE:
				setTcTemplate((VTCTemplate)newValue);
				return;
			case svsPackage.VSVS_STEP_TELECOMMAND_DATA__FIELDS:
				getFields().clear();
				getFields().addAll((Collection<? extends VSVSStepTelecommandDataField>)newValue);
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
			case svsPackage.VSVS_STEP_TELECOMMAND_DATA__TC_TEMPLATE:
				setTcTemplate((VTCTemplate)null);
				return;
			case svsPackage.VSVS_STEP_TELECOMMAND_DATA__FIELDS:
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
			case svsPackage.VSVS_STEP_TELECOMMAND_DATA__TC_TEMPLATE:
				return tcTemplate != null;
			case svsPackage.VSVS_STEP_TELECOMMAND_DATA__FIELDS:
				return fields != null && !fields.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //VSVSStepTelecommandDataImpl
