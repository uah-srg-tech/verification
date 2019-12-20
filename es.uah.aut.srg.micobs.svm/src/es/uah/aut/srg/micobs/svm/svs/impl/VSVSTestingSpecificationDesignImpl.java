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
import es.uah.aut.srg.micobs.doctpl.doctpl.DFixedSection;
import es.uah.aut.srg.micobs.doctpl.doctpl.DReferenceableObject;
import es.uah.aut.srg.micobs.doctpl.doctpl.impl.DFixedSectionImpl;
import es.uah.aut.srg.micobs.svm.svs.VSVSActionsSection;
import es.uah.aut.srg.micobs.svm.svs.VSVSFixedSection;
import es.uah.aut.srg.micobs.svm.svs.VSVSInterfacesSection;
import es.uah.aut.srg.micobs.svm.svs.VSVSPacketConfigurationsSection;
import es.uah.aut.srg.micobs.svm.svs.VSVSScenariosSection;
import es.uah.aut.srg.micobs.svm.svs.VSVSTestDesign;
import es.uah.aut.srg.micobs.svm.svs.VSVSTestingSpecificationDesign;
import es.uah.aut.srg.micobs.svm.svs.svsPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>VSVS Testing Specification Design</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link es.uah.aut.srg.micobs.svm.svs.impl.VSVSTestingSpecificationDesignImpl#getGeneral <em>General</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.svm.svs.impl.VSVSTestingSpecificationDesignImpl#getInterfaces <em>Interfaces</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.svm.svs.impl.VSVSTestingSpecificationDesignImpl#getConfigurations <em>Configurations</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.svm.svs.impl.VSVSTestingSpecificationDesignImpl#getActions <em>Actions</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.svm.svs.impl.VSVSTestingSpecificationDesignImpl#getScenarios <em>Scenarios</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.svm.svs.impl.VSVSTestingSpecificationDesignImpl#getTestDesigns <em>Test Designs</em>}</li>
 * </ul>
 *
 * @generated
 */
public class VSVSTestingSpecificationDesignImpl extends DFixedSectionImpl implements VSVSTestingSpecificationDesign {
	/**
	 * The cached value of the '{@link #getGeneral() <em>General</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGeneral()
	 * @generated
	 * @ordered
	 */
	protected VSVSFixedSection general;

	/**
	 * The cached value of the '{@link #getInterfaces() <em>Interfaces</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInterfaces()
	 * @generated
	 * @ordered
	 */
	protected VSVSInterfacesSection interfaces;

	/**
	 * The cached value of the '{@link #getConfigurations() <em>Configurations</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConfigurations()
	 * @generated
	 * @ordered
	 */
	protected VSVSPacketConfigurationsSection configurations;

	/**
	 * The cached value of the '{@link #getActions() <em>Actions</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActions()
	 * @generated
	 * @ordered
	 */
	protected VSVSActionsSection actions;

	/**
	 * The cached value of the '{@link #getScenarios() <em>Scenarios</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScenarios()
	 * @generated
	 * @ordered
	 */
	protected VSVSScenariosSection scenarios;

	/**
	 * The cached value of the '{@link #getTestDesigns() <em>Test Designs</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTestDesigns()
	 * @generated
	 * @ordered
	 */
	protected EList<VSVSTestDesign> testDesigns;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VSVSTestingSpecificationDesignImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return svsPackage.Literals.VSVS_TESTING_SPECIFICATION_DESIGN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VSVSFixedSection getGeneral() {
		return general;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGeneral(VSVSFixedSection newGeneral, NotificationChain msgs) {
		VSVSFixedSection oldGeneral = general;
		general = newGeneral;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, svsPackage.VSVS_TESTING_SPECIFICATION_DESIGN__GENERAL, oldGeneral, newGeneral);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGeneral(VSVSFixedSection newGeneral) {
		if (newGeneral != general) {
			NotificationChain msgs = null;
			if (general != null)
				msgs = ((InternalEObject)general).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - svsPackage.VSVS_TESTING_SPECIFICATION_DESIGN__GENERAL, null, msgs);
			if (newGeneral != null)
				msgs = ((InternalEObject)newGeneral).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - svsPackage.VSVS_TESTING_SPECIFICATION_DESIGN__GENERAL, null, msgs);
			msgs = basicSetGeneral(newGeneral, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, svsPackage.VSVS_TESTING_SPECIFICATION_DESIGN__GENERAL, newGeneral, newGeneral));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VSVSInterfacesSection getInterfaces() {
		return interfaces;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInterfaces(VSVSInterfacesSection newInterfaces, NotificationChain msgs) {
		VSVSInterfacesSection oldInterfaces = interfaces;
		interfaces = newInterfaces;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, svsPackage.VSVS_TESTING_SPECIFICATION_DESIGN__INTERFACES, oldInterfaces, newInterfaces);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInterfaces(VSVSInterfacesSection newInterfaces) {
		if (newInterfaces != interfaces) {
			NotificationChain msgs = null;
			if (interfaces != null)
				msgs = ((InternalEObject)interfaces).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - svsPackage.VSVS_TESTING_SPECIFICATION_DESIGN__INTERFACES, null, msgs);
			if (newInterfaces != null)
				msgs = ((InternalEObject)newInterfaces).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - svsPackage.VSVS_TESTING_SPECIFICATION_DESIGN__INTERFACES, null, msgs);
			msgs = basicSetInterfaces(newInterfaces, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, svsPackage.VSVS_TESTING_SPECIFICATION_DESIGN__INTERFACES, newInterfaces, newInterfaces));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VSVSPacketConfigurationsSection getConfigurations() {
		return configurations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetConfigurations(VSVSPacketConfigurationsSection newConfigurations, NotificationChain msgs) {
		VSVSPacketConfigurationsSection oldConfigurations = configurations;
		configurations = newConfigurations;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, svsPackage.VSVS_TESTING_SPECIFICATION_DESIGN__CONFIGURATIONS, oldConfigurations, newConfigurations);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConfigurations(VSVSPacketConfigurationsSection newConfigurations) {
		if (newConfigurations != configurations) {
			NotificationChain msgs = null;
			if (configurations != null)
				msgs = ((InternalEObject)configurations).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - svsPackage.VSVS_TESTING_SPECIFICATION_DESIGN__CONFIGURATIONS, null, msgs);
			if (newConfigurations != null)
				msgs = ((InternalEObject)newConfigurations).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - svsPackage.VSVS_TESTING_SPECIFICATION_DESIGN__CONFIGURATIONS, null, msgs);
			msgs = basicSetConfigurations(newConfigurations, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, svsPackage.VSVS_TESTING_SPECIFICATION_DESIGN__CONFIGURATIONS, newConfigurations, newConfigurations));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VSVSActionsSection getActions() {
		return actions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetActions(VSVSActionsSection newActions, NotificationChain msgs) {
		VSVSActionsSection oldActions = actions;
		actions = newActions;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, svsPackage.VSVS_TESTING_SPECIFICATION_DESIGN__ACTIONS, oldActions, newActions);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setActions(VSVSActionsSection newActions) {
		if (newActions != actions) {
			NotificationChain msgs = null;
			if (actions != null)
				msgs = ((InternalEObject)actions).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - svsPackage.VSVS_TESTING_SPECIFICATION_DESIGN__ACTIONS, null, msgs);
			if (newActions != null)
				msgs = ((InternalEObject)newActions).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - svsPackage.VSVS_TESTING_SPECIFICATION_DESIGN__ACTIONS, null, msgs);
			msgs = basicSetActions(newActions, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, svsPackage.VSVS_TESTING_SPECIFICATION_DESIGN__ACTIONS, newActions, newActions));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VSVSScenariosSection getScenarios() {
		return scenarios;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetScenarios(VSVSScenariosSection newScenarios, NotificationChain msgs) {
		VSVSScenariosSection oldScenarios = scenarios;
		scenarios = newScenarios;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, svsPackage.VSVS_TESTING_SPECIFICATION_DESIGN__SCENARIOS, oldScenarios, newScenarios);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setScenarios(VSVSScenariosSection newScenarios) {
		if (newScenarios != scenarios) {
			NotificationChain msgs = null;
			if (scenarios != null)
				msgs = ((InternalEObject)scenarios).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - svsPackage.VSVS_TESTING_SPECIFICATION_DESIGN__SCENARIOS, null, msgs);
			if (newScenarios != null)
				msgs = ((InternalEObject)newScenarios).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - svsPackage.VSVS_TESTING_SPECIFICATION_DESIGN__SCENARIOS, null, msgs);
			msgs = basicSetScenarios(newScenarios, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, svsPackage.VSVS_TESTING_SPECIFICATION_DESIGN__SCENARIOS, newScenarios, newScenarios));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<VSVSTestDesign> getTestDesigns() {
		if (testDesigns == null) {
			testDesigns = new EObjectContainmentEList<VSVSTestDesign>(VSVSTestDesign.class, this, svsPackage.VSVS_TESTING_SPECIFICATION_DESIGN__TEST_DESIGNS);
		}
		return testDesigns;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case svsPackage.VSVS_TESTING_SPECIFICATION_DESIGN__GENERAL:
				return basicSetGeneral(null, msgs);
			case svsPackage.VSVS_TESTING_SPECIFICATION_DESIGN__INTERFACES:
				return basicSetInterfaces(null, msgs);
			case svsPackage.VSVS_TESTING_SPECIFICATION_DESIGN__CONFIGURATIONS:
				return basicSetConfigurations(null, msgs);
			case svsPackage.VSVS_TESTING_SPECIFICATION_DESIGN__ACTIONS:
				return basicSetActions(null, msgs);
			case svsPackage.VSVS_TESTING_SPECIFICATION_DESIGN__SCENARIOS:
				return basicSetScenarios(null, msgs);
			case svsPackage.VSVS_TESTING_SPECIFICATION_DESIGN__TEST_DESIGNS:
				return ((InternalEList<?>)getTestDesigns()).basicRemove(otherEnd, msgs);
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
			case svsPackage.VSVS_TESTING_SPECIFICATION_DESIGN__GENERAL:
				return getGeneral();
			case svsPackage.VSVS_TESTING_SPECIFICATION_DESIGN__INTERFACES:
				return getInterfaces();
			case svsPackage.VSVS_TESTING_SPECIFICATION_DESIGN__CONFIGURATIONS:
				return getConfigurations();
			case svsPackage.VSVS_TESTING_SPECIFICATION_DESIGN__ACTIONS:
				return getActions();
			case svsPackage.VSVS_TESTING_SPECIFICATION_DESIGN__SCENARIOS:
				return getScenarios();
			case svsPackage.VSVS_TESTING_SPECIFICATION_DESIGN__TEST_DESIGNS:
				return getTestDesigns();
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
			case svsPackage.VSVS_TESTING_SPECIFICATION_DESIGN__GENERAL:
				setGeneral((VSVSFixedSection)newValue);
				return;
			case svsPackage.VSVS_TESTING_SPECIFICATION_DESIGN__INTERFACES:
				setInterfaces((VSVSInterfacesSection)newValue);
				return;
			case svsPackage.VSVS_TESTING_SPECIFICATION_DESIGN__CONFIGURATIONS:
				setConfigurations((VSVSPacketConfigurationsSection)newValue);
				return;
			case svsPackage.VSVS_TESTING_SPECIFICATION_DESIGN__ACTIONS:
				setActions((VSVSActionsSection)newValue);
				return;
			case svsPackage.VSVS_TESTING_SPECIFICATION_DESIGN__SCENARIOS:
				setScenarios((VSVSScenariosSection)newValue);
				return;
			case svsPackage.VSVS_TESTING_SPECIFICATION_DESIGN__TEST_DESIGNS:
				getTestDesigns().clear();
				getTestDesigns().addAll((Collection<? extends VSVSTestDesign>)newValue);
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
			case svsPackage.VSVS_TESTING_SPECIFICATION_DESIGN__GENERAL:
				setGeneral((VSVSFixedSection)null);
				return;
			case svsPackage.VSVS_TESTING_SPECIFICATION_DESIGN__INTERFACES:
				setInterfaces((VSVSInterfacesSection)null);
				return;
			case svsPackage.VSVS_TESTING_SPECIFICATION_DESIGN__CONFIGURATIONS:
				setConfigurations((VSVSPacketConfigurationsSection)null);
				return;
			case svsPackage.VSVS_TESTING_SPECIFICATION_DESIGN__ACTIONS:
				setActions((VSVSActionsSection)null);
				return;
			case svsPackage.VSVS_TESTING_SPECIFICATION_DESIGN__SCENARIOS:
				setScenarios((VSVSScenariosSection)null);
				return;
			case svsPackage.VSVS_TESTING_SPECIFICATION_DESIGN__TEST_DESIGNS:
				getTestDesigns().clear();
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
			case svsPackage.VSVS_TESTING_SPECIFICATION_DESIGN__GENERAL:
				return general != null;
			case svsPackage.VSVS_TESTING_SPECIFICATION_DESIGN__INTERFACES:
				return interfaces != null;
			case svsPackage.VSVS_TESTING_SPECIFICATION_DESIGN__CONFIGURATIONS:
				return configurations != null;
			case svsPackage.VSVS_TESTING_SPECIFICATION_DESIGN__ACTIONS:
				return actions != null;
			case svsPackage.VSVS_TESTING_SPECIFICATION_DESIGN__SCENARIOS:
				return scenarios != null;
			case svsPackage.VSVS_TESTING_SPECIFICATION_DESIGN__TEST_DESIGNS:
				return testDesigns != null && !testDesigns.isEmpty();
		}
		return super.eIsSet(featureID);
	}
	
	@Override
	public EList<DAbstractSection> getSubsections() {
		EList<DAbstractSection> subsections = new BasicEList<DAbstractSection>();
		subsections.add((DAbstractSection) getGeneral());
		subsections.add((DAbstractSection) getInterfaces());
		subsections.add((DAbstractSection) getConfigurations());
		subsections.add((DAbstractSection) getActions());
		subsections.add((DAbstractSection) getScenarios());
		for(DFixedSection testDesign : getTestDesigns()) {
			subsections.add(testDesign);
		}
		return subsections;
	}

	@Override
	public EList<DReferenceableObject> getReferenceableObjects(String ReferenceableObjectType) {

		EList<DReferenceableObject> objects = new BasicEList<DReferenceableObject>();
		objects.addAll(getGeneral().getReferenceableObjects(ReferenceableObjectType));
		if(getActions() != null)
			objects.addAll(getActions().getReferenceableObjects(ReferenceableObjectType));
		objects.addAll(getScenarios().getReferenceableObjects(ReferenceableObjectType));
		for(VSVSTestDesign testDesign : getTestDesigns()) {
			objects.addAll(testDesign.getReferenceableObjects(ReferenceableObjectType));
		}
		return objects;
	}

} //VSVSTestingSpecificationDesignImpl
