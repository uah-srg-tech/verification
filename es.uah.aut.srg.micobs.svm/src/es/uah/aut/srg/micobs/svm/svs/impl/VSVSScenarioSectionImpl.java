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
import es.uah.aut.srg.micobs.doctpl.doctpl.DReferenceableObject;
import es.uah.aut.srg.micobs.svm.svs.VSVSInterface;
import es.uah.aut.srg.micobs.svm.svs.VSVSScenarioSection;
import es.uah.aut.srg.micobs.svm.svs.svsPackage;

import java.util.Collection;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.ECollections;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>VSVS Scenario Section</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link es.uah.aut.srg.micobs.svm.svs.impl.VSVSScenarioSectionImpl#getInterface <em>Interface</em>}</li>
 * </ul>
 *
 * @generated
 */
public class VSVSScenarioSectionImpl extends VSVSInstantiableSectionImpl implements VSVSScenarioSection {
	/**
	 * The cached value of the '{@link #getInterface() <em>Interface</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInterface()
	 * @generated
	 * @ordered
	 */
	protected EList<VSVSInterface> interface_;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VSVSScenarioSectionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return svsPackage.Literals.VSVS_SCENARIO_SECTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<VSVSInterface> getInterface() {
		if (interface_ == null) {
			interface_ = new EObjectResolvingEList<VSVSInterface>(VSVSInterface.class, this, svsPackage.VSVS_SCENARIO_SECTION__INTERFACE);
		}
		return interface_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case svsPackage.VSVS_SCENARIO_SECTION__INTERFACE:
				return getInterface();
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
			case svsPackage.VSVS_SCENARIO_SECTION__INTERFACE:
				getInterface().clear();
				getInterface().addAll((Collection<? extends VSVSInterface>)newValue);
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
			case svsPackage.VSVS_SCENARIO_SECTION__INTERFACE:
				getInterface().clear();
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
			case svsPackage.VSVS_SCENARIO_SECTION__INTERFACE:
				return interface_ != null && !interface_.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	@Override
	public EList<DAbstractSection> getSubsections() {
		return ECollections.emptyEList();
	}

	@Override
	public EList<DReferenceableObject> getReferenceableObjects(String ReferenceableObjectType) {

		EList<DReferenceableObject> objects = new BasicEList<DReferenceableObject>();
		if(getBody() != null) {
			objects.addAll(getBody().getReferenceableObjects(ReferenceableObjectType));
		}
		return objects;
	}

} //VSVSScenarioSectionImpl
