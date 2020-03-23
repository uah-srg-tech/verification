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
package es.uah.aut.srg.micobs.svm.testsetup.impl;

import es.uah.aut.srg.micobs.doctpl.doctpl.DAbstractSection;
import es.uah.aut.srg.micobs.doctpl.doctpl.DReferenceableObject;
import es.uah.aut.srg.micobs.doctpl.doctpl.impl.DFixedSectionImpl;

import es.uah.aut.srg.micobs.svm.testsetup.VTestSetupScenarioSection;
import es.uah.aut.srg.micobs.svm.testsetup.VTestSetupScenariosSection;
import es.uah.aut.srg.micobs.svm.testsetup.testsetupPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>VTest Setup Scenarios Section</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link es.uah.aut.srg.micobs.svm.testsetup.impl.VTestSetupScenariosSectionImpl#getScenarios <em>Scenarios</em>}</li>
 * </ul>
 *
 * @generated
 */
public class VTestSetupScenariosSectionImpl extends DFixedSectionImpl implements VTestSetupScenariosSection {
	/**
	 * The cached value of the '{@link #getScenarios() <em>Scenarios</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScenarios()
	 * @generated
	 * @ordered
	 */
	protected EList<VTestSetupScenarioSection> scenarios;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VTestSetupScenariosSectionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return testsetupPackage.Literals.VTEST_SETUP_SCENARIOS_SECTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<VTestSetupScenarioSection> getScenarios() {
		if (scenarios == null) {
			scenarios = new EObjectContainmentEList<VTestSetupScenarioSection>(VTestSetupScenarioSection.class, this, testsetupPackage.VTEST_SETUP_SCENARIOS_SECTION__SCENARIOS);
		}
		return scenarios;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case testsetupPackage.VTEST_SETUP_SCENARIOS_SECTION__SCENARIOS:
				return ((InternalEList<?>)getScenarios()).basicRemove(otherEnd, msgs);
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
			case testsetupPackage.VTEST_SETUP_SCENARIOS_SECTION__SCENARIOS:
				return getScenarios();
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
			case testsetupPackage.VTEST_SETUP_SCENARIOS_SECTION__SCENARIOS:
				getScenarios().clear();
				getScenarios().addAll((Collection<? extends VTestSetupScenarioSection>)newValue);
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
			case testsetupPackage.VTEST_SETUP_SCENARIOS_SECTION__SCENARIOS:
				getScenarios().clear();
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
			case testsetupPackage.VTEST_SETUP_SCENARIOS_SECTION__SCENARIOS:
				return scenarios != null && !scenarios.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	@Override
	public EList<DAbstractSection> getSubsections() {
		EList<DAbstractSection> subsections = new BasicEList<DAbstractSection>();
		for(VTestSetupScenarioSection scenario : getScenarios()) {
			subsections.add(scenario);
		}
		return subsections;
	}

	@Override
	public EList<DReferenceableObject> getReferenceableObjects(String ReferenceableObjectType) {

		EList<DReferenceableObject> objects = new BasicEList<DReferenceableObject>();
		for(VTestSetupScenarioSection scenario : getScenarios()) {
			objects.addAll(scenario.getReferenceableObjects(ReferenceableObjectType));
		}
		return objects;
	}
	
} //VTestSetupScenariosSectionImpl
