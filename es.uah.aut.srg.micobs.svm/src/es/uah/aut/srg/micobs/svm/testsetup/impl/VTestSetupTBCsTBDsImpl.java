/**
 * Copyright (c) 2020 UAH Space Research Group.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 * 
 * Contributors:
 *     SRG Team - Initial API and implementation
 */
package es.uah.aut.srg.micobs.svm.testsetup.impl;

import es.uah.aut.srg.micobs.doctpl.doctpl.DAbstractSection;
import es.uah.aut.srg.micobs.doctpl.doctpl.DTBC;
import es.uah.aut.srg.micobs.doctpl.doctpl.DTBD;

import es.uah.aut.srg.micobs.doctpl.doctpl.impl.DFixedSectionImpl;

import es.uah.aut.srg.micobs.svm.testsetup.VTestSetupTBCsTBDs;
import es.uah.aut.srg.micobs.svm.testsetup.testsetupPackage;

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
 * An implementation of the model object '<em><b>VTest Setup TB Cs TB Ds</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link es.uah.aut.srg.micobs.svm.testsetup.impl.VTestSetupTBCsTBDsImpl#getTbcs <em>Tbcs</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.svm.testsetup.impl.VTestSetupTBCsTBDsImpl#getTbds <em>Tbds</em>}</li>
 * </ul>
 *
 * @generated
 */
public class VTestSetupTBCsTBDsImpl extends DFixedSectionImpl implements VTestSetupTBCsTBDs {
	/**
	 * The cached value of the '{@link #getTbcs() <em>Tbcs</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTbcs()
	 * @generated
	 * @ordered
	 */
	protected EList<DTBC> tbcs;

	/**
	 * The cached value of the '{@link #getTbds() <em>Tbds</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTbds()
	 * @generated
	 * @ordered
	 */
	protected EList<DTBD> tbds;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VTestSetupTBCsTBDsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return testsetupPackage.Literals.VTEST_SETUP_TB_CS_TB_DS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DTBC> getTbcs() {
		if (tbcs == null) {
			tbcs = new EObjectContainmentEList<DTBC>(DTBC.class, this, testsetupPackage.VTEST_SETUP_TB_CS_TB_DS__TBCS);
		}
		return tbcs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DTBD> getTbds() {
		if (tbds == null) {
			tbds = new EObjectContainmentEList<DTBD>(DTBD.class, this, testsetupPackage.VTEST_SETUP_TB_CS_TB_DS__TBDS);
		}
		return tbds;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case testsetupPackage.VTEST_SETUP_TB_CS_TB_DS__TBCS:
				return ((InternalEList<?>)getTbcs()).basicRemove(otherEnd, msgs);
			case testsetupPackage.VTEST_SETUP_TB_CS_TB_DS__TBDS:
				return ((InternalEList<?>)getTbds()).basicRemove(otherEnd, msgs);
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
			case testsetupPackage.VTEST_SETUP_TB_CS_TB_DS__TBCS:
				return getTbcs();
			case testsetupPackage.VTEST_SETUP_TB_CS_TB_DS__TBDS:
				return getTbds();
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
			case testsetupPackage.VTEST_SETUP_TB_CS_TB_DS__TBCS:
				getTbcs().clear();
				getTbcs().addAll((Collection<? extends DTBC>)newValue);
				return;
			case testsetupPackage.VTEST_SETUP_TB_CS_TB_DS__TBDS:
				getTbds().clear();
				getTbds().addAll((Collection<? extends DTBD>)newValue);
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
			case testsetupPackage.VTEST_SETUP_TB_CS_TB_DS__TBCS:
				getTbcs().clear();
				return;
			case testsetupPackage.VTEST_SETUP_TB_CS_TB_DS__TBDS:
				getTbds().clear();
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
			case testsetupPackage.VTEST_SETUP_TB_CS_TB_DS__TBCS:
				return tbcs != null && !tbcs.isEmpty();
			case testsetupPackage.VTEST_SETUP_TB_CS_TB_DS__TBDS:
				return tbds != null && !tbds.isEmpty();
		}
		return super.eIsSet(featureID);
	}
	
	@Override
	public EList<DAbstractSection> getSubsections() {
		return ECollections.emptyEList();
	}

} //VTestSetupTBCsTBDsImpl
