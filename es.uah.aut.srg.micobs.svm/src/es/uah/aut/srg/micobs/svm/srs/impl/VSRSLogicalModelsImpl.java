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
package es.uah.aut.srg.micobs.svm.srs.impl;

import es.uah.aut.srg.micobs.doctpl.doctpl.DAbstractSection;
import es.uah.aut.srg.micobs.svm.srs.VSRSLogicalModel;
import es.uah.aut.srg.micobs.svm.srs.VSRSLogicalModels;
import es.uah.aut.srg.micobs.svm.srs.srsPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.ECollections;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>VSRS Logical Models</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link es.uah.aut.srg.micobs.svm.srs.impl.VSRSLogicalModelsImpl#getLogicalModels <em>Logical Models</em>}</li>
 * </ul>
 *
 * @generated
 */
public class VSRSLogicalModelsImpl extends es.uah.aut.srg.micobs.doctpl.doctpl.impl.DFixedSectionImpl implements VSRSLogicalModels {
	/**
	 * The cached value of the '{@link #getLogicalModels() <em>Logical Models</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLogicalModels()
	 * @generated
	 * @ordered
	 */
	protected EList<VSRSLogicalModel> logicalModels;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VSRSLogicalModelsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return srsPackage.Literals.VSRS_LOGICAL_MODELS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<VSRSLogicalModel> getLogicalModels() {
		if (logicalModels == null) {
			logicalModels = new EObjectContainmentEList<VSRSLogicalModel>(VSRSLogicalModel.class, this, srsPackage.VSRS_LOGICAL_MODELS__LOGICAL_MODELS);
		}
		return logicalModels;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case srsPackage.VSRS_LOGICAL_MODELS__LOGICAL_MODELS:
				return ((InternalEList<?>)getLogicalModels()).basicRemove(otherEnd, msgs);
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
			case srsPackage.VSRS_LOGICAL_MODELS__LOGICAL_MODELS:
				return getLogicalModels();
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
			case srsPackage.VSRS_LOGICAL_MODELS__LOGICAL_MODELS:
				getLogicalModels().clear();
				getLogicalModels().addAll((Collection<? extends VSRSLogicalModel>)newValue);
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
			case srsPackage.VSRS_LOGICAL_MODELS__LOGICAL_MODELS:
				getLogicalModels().clear();
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
			case srsPackage.VSRS_LOGICAL_MODELS__LOGICAL_MODELS:
				return logicalModels != null && !logicalModels.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	@Override
	public EList<DAbstractSection> getSubsections() {
		return ECollections.emptyEList();
	}
} //VSRSLogicalModelsImpl
