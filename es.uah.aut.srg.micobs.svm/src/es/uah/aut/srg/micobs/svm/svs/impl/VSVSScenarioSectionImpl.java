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
import es.uah.aut.srg.micobs.svm.svs.VSVSAction;
import es.uah.aut.srg.micobs.svm.svs.VSVSInterface;
import es.uah.aut.srg.micobs.svm.svs.VSVSScenarioSection;
import es.uah.aut.srg.micobs.svm.svs.VSVSSelectedConfiguration;
import es.uah.aut.srg.micobs.svm.svs.svsPackage;

import java.util.Collection;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.ECollections;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>VSVS Scenario Section</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link es.uah.aut.srg.micobs.svm.svs.impl.VSVSScenarioSectionImpl#getSupportedInterface <em>Supported Interface</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.svm.svs.impl.VSVSScenarioSectionImpl#getSelectedConfiguration <em>Selected Configuration</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.svm.svs.impl.VSVSScenarioSectionImpl#getSupportedAction <em>Supported Action</em>}</li>
 * </ul>
 *
 * @generated
 */
public class VSVSScenarioSectionImpl extends VSVSInstantiableSectionImpl implements VSVSScenarioSection {
	/**
	 * The cached value of the '{@link #getSupportedInterface() <em>Supported Interface</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSupportedInterface()
	 * @generated
	 * @ordered
	 */
	protected EList<VSVSInterface> supportedInterface;
	/**
	 * The cached value of the '{@link #getSelectedConfiguration() <em>Selected Configuration</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSelectedConfiguration()
	 * @generated
	 * @ordered
	 */
	protected EList<VSVSSelectedConfiguration> selectedConfiguration;
	/**
	 * The cached value of the '{@link #getSupportedAction() <em>Supported Action</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSupportedAction()
	 * @generated
	 * @ordered
	 */
	protected EList<VSVSAction> supportedAction;
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
	public EList<VSVSInterface> getSupportedInterface() {
		if (supportedInterface == null) {
			supportedInterface = new EObjectResolvingEList<VSVSInterface>(VSVSInterface.class, this, svsPackage.VSVS_SCENARIO_SECTION__SUPPORTED_INTERFACE);
		}
		return supportedInterface;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<VSVSSelectedConfiguration> getSelectedConfiguration() {
		if (selectedConfiguration == null) {
			selectedConfiguration = new EObjectContainmentEList<VSVSSelectedConfiguration>(VSVSSelectedConfiguration.class, this, svsPackage.VSVS_SCENARIO_SECTION__SELECTED_CONFIGURATION);
		}
		return selectedConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<VSVSAction> getSupportedAction() {
		if (supportedAction == null) {
			supportedAction = new EObjectResolvingEList<VSVSAction>(VSVSAction.class, this, svsPackage.VSVS_SCENARIO_SECTION__SUPPORTED_ACTION);
		}
		return supportedAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case svsPackage.VSVS_SCENARIO_SECTION__SELECTED_CONFIGURATION:
				return ((InternalEList<?>)getSelectedConfiguration()).basicRemove(otherEnd, msgs);
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
			case svsPackage.VSVS_SCENARIO_SECTION__SUPPORTED_INTERFACE:
				return getSupportedInterface();
			case svsPackage.VSVS_SCENARIO_SECTION__SELECTED_CONFIGURATION:
				return getSelectedConfiguration();
			case svsPackage.VSVS_SCENARIO_SECTION__SUPPORTED_ACTION:
				return getSupportedAction();
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
			case svsPackage.VSVS_SCENARIO_SECTION__SUPPORTED_INTERFACE:
				getSupportedInterface().clear();
				getSupportedInterface().addAll((Collection<? extends VSVSInterface>)newValue);
				return;
			case svsPackage.VSVS_SCENARIO_SECTION__SELECTED_CONFIGURATION:
				getSelectedConfiguration().clear();
				getSelectedConfiguration().addAll((Collection<? extends VSVSSelectedConfiguration>)newValue);
				return;
			case svsPackage.VSVS_SCENARIO_SECTION__SUPPORTED_ACTION:
				getSupportedAction().clear();
				getSupportedAction().addAll((Collection<? extends VSVSAction>)newValue);
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
			case svsPackage.VSVS_SCENARIO_SECTION__SUPPORTED_INTERFACE:
				getSupportedInterface().clear();
				return;
			case svsPackage.VSVS_SCENARIO_SECTION__SELECTED_CONFIGURATION:
				getSelectedConfiguration().clear();
				return;
			case svsPackage.VSVS_SCENARIO_SECTION__SUPPORTED_ACTION:
				getSupportedAction().clear();
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
			case svsPackage.VSVS_SCENARIO_SECTION__SUPPORTED_INTERFACE:
				return supportedInterface != null && !supportedInterface.isEmpty();
			case svsPackage.VSVS_SCENARIO_SECTION__SELECTED_CONFIGURATION:
				return selectedConfiguration != null && !selectedConfiguration.isEmpty();
			case svsPackage.VSVS_SCENARIO_SECTION__SUPPORTED_ACTION:
				return supportedAction != null && !supportedAction.isEmpty();
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
