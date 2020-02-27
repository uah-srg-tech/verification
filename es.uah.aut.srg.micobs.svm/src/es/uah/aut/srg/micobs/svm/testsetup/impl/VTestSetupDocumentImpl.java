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

import es.uah.aut.srg.micobs.doctpl.doctpl.DAbstractFigure;
import es.uah.aut.srg.micobs.doctpl.doctpl.DAbstractSection;
import es.uah.aut.srg.micobs.doctpl.doctpl.DAbstractTable;
import es.uah.aut.srg.micobs.doctpl.doctpl.DApplicableDocument;
import es.uah.aut.srg.micobs.doctpl.doctpl.DParagraph;
import es.uah.aut.srg.micobs.doctpl.doctpl.DReferenceDocument;
import es.uah.aut.srg.micobs.doctpl.doctpl.DReferenceableObject;
import es.uah.aut.srg.micobs.doctpl.doctpl.DTBC;
import es.uah.aut.srg.micobs.doctpl.doctpl.DTBD;
import es.uah.aut.srg.micobs.doctpl.doctpl.impl.DDocumentTemplateImpl;

import es.uah.aut.srg.micobs.svm.testsetup.VTestSetupActionsSection;
import es.uah.aut.srg.micobs.svm.testsetup.VTestSetupApplicableDocuments;
import es.uah.aut.srg.micobs.svm.testsetup.VTestSetupDocument;
import es.uah.aut.srg.micobs.svm.testsetup.VTestSetupInterfacesSection;
import es.uah.aut.srg.micobs.svm.testsetup.VTestSetupPacketConfigurationsSection;
import es.uah.aut.srg.micobs.svm.testsetup.VTestSetupReferenceDocuments;
import es.uah.aut.srg.micobs.svm.testsetup.VTestSetupScenariosSection;
import es.uah.aut.srg.micobs.svm.testsetup.VTestSetupTBCsTBDs;
import es.uah.aut.srg.micobs.svm.testsetup.testsetupPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.ECollections;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>VTest Setup Document</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link es.uah.aut.srg.micobs.svm.testsetup.impl.VTestSetupDocumentImpl#getTbcsTbdsSection <em>Tbcs Tbds Section</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.svm.testsetup.impl.VTestSetupDocumentImpl#getApplicableDocumentsSection <em>Applicable Documents Section</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.svm.testsetup.impl.VTestSetupDocumentImpl#getReferenceDocumentsSection <em>Reference Documents Section</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.svm.testsetup.impl.VTestSetupDocumentImpl#getInterfaces <em>Interfaces</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.svm.testsetup.impl.VTestSetupDocumentImpl#getConfigurations <em>Configurations</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.svm.testsetup.impl.VTestSetupDocumentImpl#getActions <em>Actions</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.svm.testsetup.impl.VTestSetupDocumentImpl#getScenarios <em>Scenarios</em>}</li>
 * </ul>
 *
 * @generated
 */
public class VTestSetupDocumentImpl extends DDocumentTemplateImpl implements VTestSetupDocument {
	/**
	 * The cached value of the '{@link #getTbcsTbdsSection() <em>Tbcs Tbds Section</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTbcsTbdsSection()
	 * @generated
	 * @ordered
	 */
	protected VTestSetupTBCsTBDs tbcsTbdsSection;

	/**
	 * The cached value of the '{@link #getApplicableDocumentsSection() <em>Applicable Documents Section</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getApplicableDocumentsSection()
	 * @generated
	 * @ordered
	 */
	protected VTestSetupApplicableDocuments applicableDocumentsSection;

	/**
	 * The cached value of the '{@link #getReferenceDocumentsSection() <em>Reference Documents Section</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReferenceDocumentsSection()
	 * @generated
	 * @ordered
	 */
	protected VTestSetupReferenceDocuments referenceDocumentsSection;

	/**
	 * The cached value of the '{@link #getInterfaces() <em>Interfaces</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInterfaces()
	 * @generated
	 * @ordered
	 */
	protected VTestSetupInterfacesSection interfaces;

	/**
	 * The cached value of the '{@link #getConfigurations() <em>Configurations</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConfigurations()
	 * @generated
	 * @ordered
	 */
	protected VTestSetupPacketConfigurationsSection configurations;

	/**
	 * The cached value of the '{@link #getActions() <em>Actions</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActions()
	 * @generated
	 * @ordered
	 */
	protected VTestSetupActionsSection actions;

	/**
	 * The cached value of the '{@link #getScenarios() <em>Scenarios</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScenarios()
	 * @generated
	 * @ordered
	 */
	protected VTestSetupScenariosSection scenarios;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VTestSetupDocumentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return testsetupPackage.Literals.VTEST_SETUP_DOCUMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VTestSetupTBCsTBDs getTbcsTbdsSection() {
		return tbcsTbdsSection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTbcsTbdsSection(VTestSetupTBCsTBDs newTbcsTbdsSection, NotificationChain msgs) {
		VTestSetupTBCsTBDs oldTbcsTbdsSection = tbcsTbdsSection;
		tbcsTbdsSection = newTbcsTbdsSection;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, testsetupPackage.VTEST_SETUP_DOCUMENT__TBCS_TBDS_SECTION, oldTbcsTbdsSection, newTbcsTbdsSection);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTbcsTbdsSection(VTestSetupTBCsTBDs newTbcsTbdsSection) {
		if (newTbcsTbdsSection != tbcsTbdsSection) {
			NotificationChain msgs = null;
			if (tbcsTbdsSection != null)
				msgs = ((InternalEObject)tbcsTbdsSection).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - testsetupPackage.VTEST_SETUP_DOCUMENT__TBCS_TBDS_SECTION, null, msgs);
			if (newTbcsTbdsSection != null)
				msgs = ((InternalEObject)newTbcsTbdsSection).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - testsetupPackage.VTEST_SETUP_DOCUMENT__TBCS_TBDS_SECTION, null, msgs);
			msgs = basicSetTbcsTbdsSection(newTbcsTbdsSection, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, testsetupPackage.VTEST_SETUP_DOCUMENT__TBCS_TBDS_SECTION, newTbcsTbdsSection, newTbcsTbdsSection));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VTestSetupApplicableDocuments getApplicableDocumentsSection() {
		return applicableDocumentsSection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetApplicableDocumentsSection(VTestSetupApplicableDocuments newApplicableDocumentsSection, NotificationChain msgs) {
		VTestSetupApplicableDocuments oldApplicableDocumentsSection = applicableDocumentsSection;
		applicableDocumentsSection = newApplicableDocumentsSection;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, testsetupPackage.VTEST_SETUP_DOCUMENT__APPLICABLE_DOCUMENTS_SECTION, oldApplicableDocumentsSection, newApplicableDocumentsSection);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setApplicableDocumentsSection(VTestSetupApplicableDocuments newApplicableDocumentsSection) {
		if (newApplicableDocumentsSection != applicableDocumentsSection) {
			NotificationChain msgs = null;
			if (applicableDocumentsSection != null)
				msgs = ((InternalEObject)applicableDocumentsSection).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - testsetupPackage.VTEST_SETUP_DOCUMENT__APPLICABLE_DOCUMENTS_SECTION, null, msgs);
			if (newApplicableDocumentsSection != null)
				msgs = ((InternalEObject)newApplicableDocumentsSection).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - testsetupPackage.VTEST_SETUP_DOCUMENT__APPLICABLE_DOCUMENTS_SECTION, null, msgs);
			msgs = basicSetApplicableDocumentsSection(newApplicableDocumentsSection, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, testsetupPackage.VTEST_SETUP_DOCUMENT__APPLICABLE_DOCUMENTS_SECTION, newApplicableDocumentsSection, newApplicableDocumentsSection));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VTestSetupReferenceDocuments getReferenceDocumentsSection() {
		return referenceDocumentsSection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetReferenceDocumentsSection(VTestSetupReferenceDocuments newReferenceDocumentsSection, NotificationChain msgs) {
		VTestSetupReferenceDocuments oldReferenceDocumentsSection = referenceDocumentsSection;
		referenceDocumentsSection = newReferenceDocumentsSection;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, testsetupPackage.VTEST_SETUP_DOCUMENT__REFERENCE_DOCUMENTS_SECTION, oldReferenceDocumentsSection, newReferenceDocumentsSection);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReferenceDocumentsSection(VTestSetupReferenceDocuments newReferenceDocumentsSection) {
		if (newReferenceDocumentsSection != referenceDocumentsSection) {
			NotificationChain msgs = null;
			if (referenceDocumentsSection != null)
				msgs = ((InternalEObject)referenceDocumentsSection).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - testsetupPackage.VTEST_SETUP_DOCUMENT__REFERENCE_DOCUMENTS_SECTION, null, msgs);
			if (newReferenceDocumentsSection != null)
				msgs = ((InternalEObject)newReferenceDocumentsSection).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - testsetupPackage.VTEST_SETUP_DOCUMENT__REFERENCE_DOCUMENTS_SECTION, null, msgs);
			msgs = basicSetReferenceDocumentsSection(newReferenceDocumentsSection, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, testsetupPackage.VTEST_SETUP_DOCUMENT__REFERENCE_DOCUMENTS_SECTION, newReferenceDocumentsSection, newReferenceDocumentsSection));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VTestSetupInterfacesSection getInterfaces() {
		return interfaces;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInterfaces(VTestSetupInterfacesSection newInterfaces, NotificationChain msgs) {
		VTestSetupInterfacesSection oldInterfaces = interfaces;
		interfaces = newInterfaces;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, testsetupPackage.VTEST_SETUP_DOCUMENT__INTERFACES, oldInterfaces, newInterfaces);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInterfaces(VTestSetupInterfacesSection newInterfaces) {
		if (newInterfaces != interfaces) {
			NotificationChain msgs = null;
			if (interfaces != null)
				msgs = ((InternalEObject)interfaces).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - testsetupPackage.VTEST_SETUP_DOCUMENT__INTERFACES, null, msgs);
			if (newInterfaces != null)
				msgs = ((InternalEObject)newInterfaces).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - testsetupPackage.VTEST_SETUP_DOCUMENT__INTERFACES, null, msgs);
			msgs = basicSetInterfaces(newInterfaces, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, testsetupPackage.VTEST_SETUP_DOCUMENT__INTERFACES, newInterfaces, newInterfaces));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VTestSetupPacketConfigurationsSection getConfigurations() {
		return configurations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetConfigurations(VTestSetupPacketConfigurationsSection newConfigurations, NotificationChain msgs) {
		VTestSetupPacketConfigurationsSection oldConfigurations = configurations;
		configurations = newConfigurations;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, testsetupPackage.VTEST_SETUP_DOCUMENT__CONFIGURATIONS, oldConfigurations, newConfigurations);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConfigurations(VTestSetupPacketConfigurationsSection newConfigurations) {
		if (newConfigurations != configurations) {
			NotificationChain msgs = null;
			if (configurations != null)
				msgs = ((InternalEObject)configurations).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - testsetupPackage.VTEST_SETUP_DOCUMENT__CONFIGURATIONS, null, msgs);
			if (newConfigurations != null)
				msgs = ((InternalEObject)newConfigurations).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - testsetupPackage.VTEST_SETUP_DOCUMENT__CONFIGURATIONS, null, msgs);
			msgs = basicSetConfigurations(newConfigurations, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, testsetupPackage.VTEST_SETUP_DOCUMENT__CONFIGURATIONS, newConfigurations, newConfigurations));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VTestSetupActionsSection getActions() {
		return actions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetActions(VTestSetupActionsSection newActions, NotificationChain msgs) {
		VTestSetupActionsSection oldActions = actions;
		actions = newActions;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, testsetupPackage.VTEST_SETUP_DOCUMENT__ACTIONS, oldActions, newActions);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setActions(VTestSetupActionsSection newActions) {
		if (newActions != actions) {
			NotificationChain msgs = null;
			if (actions != null)
				msgs = ((InternalEObject)actions).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - testsetupPackage.VTEST_SETUP_DOCUMENT__ACTIONS, null, msgs);
			if (newActions != null)
				msgs = ((InternalEObject)newActions).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - testsetupPackage.VTEST_SETUP_DOCUMENT__ACTIONS, null, msgs);
			msgs = basicSetActions(newActions, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, testsetupPackage.VTEST_SETUP_DOCUMENT__ACTIONS, newActions, newActions));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VTestSetupScenariosSection getScenarios() {
		return scenarios;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetScenarios(VTestSetupScenariosSection newScenarios, NotificationChain msgs) {
		VTestSetupScenariosSection oldScenarios = scenarios;
		scenarios = newScenarios;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, testsetupPackage.VTEST_SETUP_DOCUMENT__SCENARIOS, oldScenarios, newScenarios);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setScenarios(VTestSetupScenariosSection newScenarios) {
		if (newScenarios != scenarios) {
			NotificationChain msgs = null;
			if (scenarios != null)
				msgs = ((InternalEObject)scenarios).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - testsetupPackage.VTEST_SETUP_DOCUMENT__SCENARIOS, null, msgs);
			if (newScenarios != null)
				msgs = ((InternalEObject)newScenarios).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - testsetupPackage.VTEST_SETUP_DOCUMENT__SCENARIOS, null, msgs);
			msgs = basicSetScenarios(newScenarios, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, testsetupPackage.VTEST_SETUP_DOCUMENT__SCENARIOS, newScenarios, newScenarios));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case testsetupPackage.VTEST_SETUP_DOCUMENT__TBCS_TBDS_SECTION:
				return basicSetTbcsTbdsSection(null, msgs);
			case testsetupPackage.VTEST_SETUP_DOCUMENT__APPLICABLE_DOCUMENTS_SECTION:
				return basicSetApplicableDocumentsSection(null, msgs);
			case testsetupPackage.VTEST_SETUP_DOCUMENT__REFERENCE_DOCUMENTS_SECTION:
				return basicSetReferenceDocumentsSection(null, msgs);
			case testsetupPackage.VTEST_SETUP_DOCUMENT__INTERFACES:
				return basicSetInterfaces(null, msgs);
			case testsetupPackage.VTEST_SETUP_DOCUMENT__CONFIGURATIONS:
				return basicSetConfigurations(null, msgs);
			case testsetupPackage.VTEST_SETUP_DOCUMENT__ACTIONS:
				return basicSetActions(null, msgs);
			case testsetupPackage.VTEST_SETUP_DOCUMENT__SCENARIOS:
				return basicSetScenarios(null, msgs);
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
			case testsetupPackage.VTEST_SETUP_DOCUMENT__TBCS_TBDS_SECTION:
				return getTbcsTbdsSection();
			case testsetupPackage.VTEST_SETUP_DOCUMENT__APPLICABLE_DOCUMENTS_SECTION:
				return getApplicableDocumentsSection();
			case testsetupPackage.VTEST_SETUP_DOCUMENT__REFERENCE_DOCUMENTS_SECTION:
				return getReferenceDocumentsSection();
			case testsetupPackage.VTEST_SETUP_DOCUMENT__INTERFACES:
				return getInterfaces();
			case testsetupPackage.VTEST_SETUP_DOCUMENT__CONFIGURATIONS:
				return getConfigurations();
			case testsetupPackage.VTEST_SETUP_DOCUMENT__ACTIONS:
				return getActions();
			case testsetupPackage.VTEST_SETUP_DOCUMENT__SCENARIOS:
				return getScenarios();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case testsetupPackage.VTEST_SETUP_DOCUMENT__TBCS_TBDS_SECTION:
				setTbcsTbdsSection((VTestSetupTBCsTBDs)newValue);
				return;
			case testsetupPackage.VTEST_SETUP_DOCUMENT__APPLICABLE_DOCUMENTS_SECTION:
				setApplicableDocumentsSection((VTestSetupApplicableDocuments)newValue);
				return;
			case testsetupPackage.VTEST_SETUP_DOCUMENT__REFERENCE_DOCUMENTS_SECTION:
				setReferenceDocumentsSection((VTestSetupReferenceDocuments)newValue);
				return;
			case testsetupPackage.VTEST_SETUP_DOCUMENT__INTERFACES:
				setInterfaces((VTestSetupInterfacesSection)newValue);
				return;
			case testsetupPackage.VTEST_SETUP_DOCUMENT__CONFIGURATIONS:
				setConfigurations((VTestSetupPacketConfigurationsSection)newValue);
				return;
			case testsetupPackage.VTEST_SETUP_DOCUMENT__ACTIONS:
				setActions((VTestSetupActionsSection)newValue);
				return;
			case testsetupPackage.VTEST_SETUP_DOCUMENT__SCENARIOS:
				setScenarios((VTestSetupScenariosSection)newValue);
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
			case testsetupPackage.VTEST_SETUP_DOCUMENT__TBCS_TBDS_SECTION:
				setTbcsTbdsSection((VTestSetupTBCsTBDs)null);
				return;
			case testsetupPackage.VTEST_SETUP_DOCUMENT__APPLICABLE_DOCUMENTS_SECTION:
				setApplicableDocumentsSection((VTestSetupApplicableDocuments)null);
				return;
			case testsetupPackage.VTEST_SETUP_DOCUMENT__REFERENCE_DOCUMENTS_SECTION:
				setReferenceDocumentsSection((VTestSetupReferenceDocuments)null);
				return;
			case testsetupPackage.VTEST_SETUP_DOCUMENT__INTERFACES:
				setInterfaces((VTestSetupInterfacesSection)null);
				return;
			case testsetupPackage.VTEST_SETUP_DOCUMENT__CONFIGURATIONS:
				setConfigurations((VTestSetupPacketConfigurationsSection)null);
				return;
			case testsetupPackage.VTEST_SETUP_DOCUMENT__ACTIONS:
				setActions((VTestSetupActionsSection)null);
				return;
			case testsetupPackage.VTEST_SETUP_DOCUMENT__SCENARIOS:
				setScenarios((VTestSetupScenariosSection)null);
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
			case testsetupPackage.VTEST_SETUP_DOCUMENT__TBCS_TBDS_SECTION:
				return tbcsTbdsSection != null;
			case testsetupPackage.VTEST_SETUP_DOCUMENT__APPLICABLE_DOCUMENTS_SECTION:
				return applicableDocumentsSection != null;
			case testsetupPackage.VTEST_SETUP_DOCUMENT__REFERENCE_DOCUMENTS_SECTION:
				return referenceDocumentsSection != null;
			case testsetupPackage.VTEST_SETUP_DOCUMENT__INTERFACES:
				return interfaces != null;
			case testsetupPackage.VTEST_SETUP_DOCUMENT__CONFIGURATIONS:
				return configurations != null;
			case testsetupPackage.VTEST_SETUP_DOCUMENT__ACTIONS:
				return actions != null;
			case testsetupPackage.VTEST_SETUP_DOCUMENT__SCENARIOS:
				return scenarios != null;
		}
		return super.eIsSet(featureID);
	}

	@Override
	public EList<DTBC> getTbcs() {
		if(getTbcsTbdsSection() == null) {
			return ECollections.emptyEList();
		} else {
			EList<DTBC> tbcs = new BasicEList<DTBC>();
			for(DTBC tbc : getTbcsTbdsSection().getTbcs()) {
				tbcs.add(tbc);
			}
			return tbcs;
		}
	}

	@Override
	public EList<DTBD> getTbds() {
		if(getTbcsTbdsSection() == null) {
			return ECollections.emptyEList();
		} else {
			EList<DTBD> tbds = new BasicEList<DTBD>();
			for(DTBD tbd : getTbcsTbdsSection().getTbds()) {
				tbds.add(tbd);
			};
			return tbds;
		}
	}

	@Override
	public EList<DApplicableDocument> getApplicableDocuments() {
		EList<DApplicableDocument> appdocs = new BasicEList<DApplicableDocument>();
		for(DApplicableDocument appdoc : getApplicableDocumentsSection().getApplicableDocuments()) {
			appdocs.add(appdoc);
		}
		return appdocs;
	}
	
	@Override
	public EList<DReferenceDocument> getReferenceDocuments() {
		EList<DReferenceDocument> refdocs = new BasicEList<DReferenceDocument>();
		for(DReferenceDocument refdoc : getReferenceDocumentsSection().getReferenceDocuments()) {
			refdocs.add(refdoc);
		}
		return refdocs;
	}

	@Override
	public EList<DReferenceableObject> getReferenceableObjects(String ReferenceableObjectType) {
		EList<DReferenceableObject> objects = new BasicEList<DReferenceableObject>();
		if(getActions() != null)
			objects.addAll(getActions().getReferenceableObjects(ReferenceableObjectType));
		return objects;
	}
	
	@Override
	public EList<DAbstractFigure> getFigures() {
		EList<DAbstractFigure> figures = new BasicEList<DAbstractFigure>();
		EList<DReferenceableObject> objects = getReferenceableObjects("DFigureFromFile");
		for(DReferenceableObject object : objects) {
			figures.add((DAbstractFigure)object);
		};
		return figures;
	}

	@Override
	public EList<DAbstractTable> getTables() {
		EList<DAbstractTable> tables = new BasicEList<DAbstractTable>();
		EList<DReferenceableObject> basicObjects = getReferenceableObjects("DBasicTable");
		for(DReferenceableObject object : basicObjects) {
			tables.add((DAbstractTable)object);
		};
		EList<DReferenceableObject> fromFileObjects = getReferenceableObjects("DTableFromFile");
		for(DReferenceableObject object : fromFileObjects) {
			tables.add((DAbstractTable)object);
		};
		return tables;
	}

	@Override
	public EList<DParagraph> getParagraphs() {
		EList<DParagraph> paragraphs = new BasicEList<DParagraph>();
		EList<DReferenceableObject> objects = getReferenceableObjects("DParagraph");
		for(DReferenceableObject object : objects) {
			paragraphs.add((DParagraph)object);
		};
		return paragraphs;
	}
	
	@Override
	public EList<DAbstractSection> getSections() {
		EList<DAbstractSection> sections = new BasicEList<DAbstractSection>();
		sections.add((DAbstractSection) getApplicableDocumentsSection());
		sections.add((DAbstractSection) getReferenceDocumentsSection());
		sections.add((DAbstractSection) getInterfaces());
		sections.add((DAbstractSection) getConfigurations());
		sections.add((DAbstractSection) getActions());
		sections.add((DAbstractSection) getScenarios());
		return sections;
	}

} //VTestSetupDocumentImpl
