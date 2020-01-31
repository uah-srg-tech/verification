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
import es.uah.aut.srg.micobs.doctpl.doctpl.DBody;
import es.uah.aut.srg.micobs.doctpl.doctpl.DReferenceableObject;
import es.uah.aut.srg.micobs.doctpl.doctpl.impl.DInstantiableSectionImpl;
import es.uah.aut.srg.micobs.svm.testsetup.VTestSetupAction;
import es.uah.aut.srg.micobs.svm.testsetup.VTestSetupScenarioSection;
import es.uah.aut.srg.micobs.svm.testsetup.VTestSetupSelectedConfiguration;
import es.uah.aut.srg.micobs.svm.testsetup.VTestSetupSupportedInterface;
import es.uah.aut.srg.micobs.svm.testsetup.testsetupPackage;

import es.uah.aut.srg.tmtcif.scenario.TMTCIFScenario;
import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.ECollections;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>VTest Setup Scenario Section</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link es.uah.aut.srg.micobs.svm.testsetup.impl.VTestSetupScenarioSectionImpl#getScenario <em>Scenario</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.svm.testsetup.impl.VTestSetupScenarioSectionImpl#getSupportedInterface <em>Supported Interface</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.svm.testsetup.impl.VTestSetupScenarioSectionImpl#getSelectedConfiguration <em>Selected Configuration</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.svm.testsetup.impl.VTestSetupScenarioSectionImpl#getSupportedAction <em>Supported Action</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.svm.testsetup.impl.VTestSetupScenarioSectionImpl#getBody <em>Body</em>}</li>
 * </ul>
 *
 * @generated
 */
public class VTestSetupScenarioSectionImpl extends DInstantiableSectionImpl implements VTestSetupScenarioSection {
	/**
	 * The cached value of the '{@link #getScenario() <em>Scenario</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScenario()
	 * @generated
	 * @ordered
	 */
	protected TMTCIFScenario scenario;

	/**
	 * The cached value of the '{@link #getSupportedInterface() <em>Supported Interface</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSupportedInterface()
	 * @generated
	 * @ordered
	 */
	protected EList<VTestSetupSupportedInterface> supportedInterface;

	/**
	 * The cached value of the '{@link #getSelectedConfiguration() <em>Selected Configuration</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSelectedConfiguration()
	 * @generated
	 * @ordered
	 */
	protected EList<VTestSetupSelectedConfiguration> selectedConfiguration;

	/**
	 * The cached value of the '{@link #getSupportedAction() <em>Supported Action</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSupportedAction()
	 * @generated
	 * @ordered
	 */
	protected EList<VTestSetupAction> supportedAction;

	/**
	 * The cached value of the '{@link #getBody() <em>Body</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBody()
	 * @generated
	 * @ordered
	 */
	protected DBody body;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VTestSetupScenarioSectionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return testsetupPackage.Literals.VTEST_SETUP_SCENARIO_SECTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TMTCIFScenario getScenario() {
		if (scenario != null && scenario.eIsProxy()) {
			InternalEObject oldScenario = (InternalEObject)scenario;
			scenario = (TMTCIFScenario)eResolveProxy(oldScenario);
			if (scenario != oldScenario) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, testsetupPackage.VTEST_SETUP_SCENARIO_SECTION__SCENARIO, oldScenario, scenario));
			}
		}
		return scenario;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TMTCIFScenario basicGetScenario() {
		return scenario;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setScenario(TMTCIFScenario newScenario) {
		TMTCIFScenario oldScenario = scenario;
		scenario = newScenario;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, testsetupPackage.VTEST_SETUP_SCENARIO_SECTION__SCENARIO, oldScenario, scenario));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<VTestSetupSupportedInterface> getSupportedInterface() {
		if (supportedInterface == null) {
			supportedInterface = new EObjectContainmentEList<VTestSetupSupportedInterface>(VTestSetupSupportedInterface.class, this, testsetupPackage.VTEST_SETUP_SCENARIO_SECTION__SUPPORTED_INTERFACE);
		}
		return supportedInterface;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<VTestSetupSelectedConfiguration> getSelectedConfiguration() {
		if (selectedConfiguration == null) {
			selectedConfiguration = new EObjectContainmentEList<VTestSetupSelectedConfiguration>(VTestSetupSelectedConfiguration.class, this, testsetupPackage.VTEST_SETUP_SCENARIO_SECTION__SELECTED_CONFIGURATION);
		}
		return selectedConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<VTestSetupAction> getSupportedAction() {
		if (supportedAction == null) {
			supportedAction = new EObjectResolvingEList<VTestSetupAction>(VTestSetupAction.class, this, testsetupPackage.VTEST_SETUP_SCENARIO_SECTION__SUPPORTED_ACTION);
		}
		return supportedAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DBody getBody() {
		return body;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBody(DBody newBody, NotificationChain msgs) {
		DBody oldBody = body;
		body = newBody;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, testsetupPackage.VTEST_SETUP_SCENARIO_SECTION__BODY, oldBody, newBody);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBody(DBody newBody) {
		if (newBody != body) {
			NotificationChain msgs = null;
			if (body != null)
				msgs = ((InternalEObject)body).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - testsetupPackage.VTEST_SETUP_SCENARIO_SECTION__BODY, null, msgs);
			if (newBody != null)
				msgs = ((InternalEObject)newBody).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - testsetupPackage.VTEST_SETUP_SCENARIO_SECTION__BODY, null, msgs);
			msgs = basicSetBody(newBody, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, testsetupPackage.VTEST_SETUP_SCENARIO_SECTION__BODY, newBody, newBody));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case testsetupPackage.VTEST_SETUP_SCENARIO_SECTION__SUPPORTED_INTERFACE:
				return ((InternalEList<?>)getSupportedInterface()).basicRemove(otherEnd, msgs);
			case testsetupPackage.VTEST_SETUP_SCENARIO_SECTION__SELECTED_CONFIGURATION:
				return ((InternalEList<?>)getSelectedConfiguration()).basicRemove(otherEnd, msgs);
			case testsetupPackage.VTEST_SETUP_SCENARIO_SECTION__BODY:
				return basicSetBody(null, msgs);
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
			case testsetupPackage.VTEST_SETUP_SCENARIO_SECTION__SCENARIO:
				if (resolve) return getScenario();
				return basicGetScenario();
			case testsetupPackage.VTEST_SETUP_SCENARIO_SECTION__SUPPORTED_INTERFACE:
				return getSupportedInterface();
			case testsetupPackage.VTEST_SETUP_SCENARIO_SECTION__SELECTED_CONFIGURATION:
				return getSelectedConfiguration();
			case testsetupPackage.VTEST_SETUP_SCENARIO_SECTION__SUPPORTED_ACTION:
				return getSupportedAction();
			case testsetupPackage.VTEST_SETUP_SCENARIO_SECTION__BODY:
				return getBody();
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
			case testsetupPackage.VTEST_SETUP_SCENARIO_SECTION__SCENARIO:
				setScenario((TMTCIFScenario)newValue);
				return;
			case testsetupPackage.VTEST_SETUP_SCENARIO_SECTION__SUPPORTED_INTERFACE:
				getSupportedInterface().clear();
				getSupportedInterface().addAll((Collection<? extends VTestSetupSupportedInterface>)newValue);
				return;
			case testsetupPackage.VTEST_SETUP_SCENARIO_SECTION__SELECTED_CONFIGURATION:
				getSelectedConfiguration().clear();
				getSelectedConfiguration().addAll((Collection<? extends VTestSetupSelectedConfiguration>)newValue);
				return;
			case testsetupPackage.VTEST_SETUP_SCENARIO_SECTION__SUPPORTED_ACTION:
				getSupportedAction().clear();
				getSupportedAction().addAll((Collection<? extends VTestSetupAction>)newValue);
				return;
			case testsetupPackage.VTEST_SETUP_SCENARIO_SECTION__BODY:
				setBody((DBody)newValue);
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
			case testsetupPackage.VTEST_SETUP_SCENARIO_SECTION__SCENARIO:
				setScenario((TMTCIFScenario)null);
				return;
			case testsetupPackage.VTEST_SETUP_SCENARIO_SECTION__SUPPORTED_INTERFACE:
				getSupportedInterface().clear();
				return;
			case testsetupPackage.VTEST_SETUP_SCENARIO_SECTION__SELECTED_CONFIGURATION:
				getSelectedConfiguration().clear();
				return;
			case testsetupPackage.VTEST_SETUP_SCENARIO_SECTION__SUPPORTED_ACTION:
				getSupportedAction().clear();
				return;
			case testsetupPackage.VTEST_SETUP_SCENARIO_SECTION__BODY:
				setBody((DBody)null);
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
			case testsetupPackage.VTEST_SETUP_SCENARIO_SECTION__SCENARIO:
				return scenario != null;
			case testsetupPackage.VTEST_SETUP_SCENARIO_SECTION__SUPPORTED_INTERFACE:
				return supportedInterface != null && !supportedInterface.isEmpty();
			case testsetupPackage.VTEST_SETUP_SCENARIO_SECTION__SELECTED_CONFIGURATION:
				return selectedConfiguration != null && !selectedConfiguration.isEmpty();
			case testsetupPackage.VTEST_SETUP_SCENARIO_SECTION__SUPPORTED_ACTION:
				return supportedAction != null && !supportedAction.isEmpty();
			case testsetupPackage.VTEST_SETUP_SCENARIO_SECTION__BODY:
				return body != null;
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
} //VTestSetupScenarioSectionImpl
