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

import es.uah.aut.srg.micobs.doctpl.doc.DAbstractFigure;
import es.uah.aut.srg.micobs.doctpl.doc.DAbstractSection;
import es.uah.aut.srg.micobs.doctpl.doc.DAbstractTable;
import es.uah.aut.srg.micobs.doctpl.doc.DApplicableDocument;
import es.uah.aut.srg.micobs.doctpl.doc.DDocumentTemplate;
import es.uah.aut.srg.micobs.doctpl.doc.DReferenceDocument;
import es.uah.aut.srg.micobs.doctpl.doc.docPackage;

import es.uah.aut.srg.micobs.svm.svs.VSVSAdditionalInformation;
import es.uah.aut.srg.micobs.svm.svs.VSVSAnalysisInspectionReview;
import es.uah.aut.srg.micobs.svm.svs.VSVSApplicableDocuments;
import es.uah.aut.srg.micobs.svm.svs.VSVSDocument;
import es.uah.aut.srg.micobs.svm.svs.VSVSIntroduction;
import es.uah.aut.srg.micobs.svm.svs.VSVSReferenceDocuments;
import es.uah.aut.srg.micobs.svm.svs.VSVSSoftwareOverview;
import es.uah.aut.srg.micobs.svm.svs.VSVSTaskIdentification;
import es.uah.aut.srg.micobs.svm.svs.VSVSTermsDefinitionsAbbreviations;
import es.uah.aut.srg.micobs.svm.svs.VSVSTestCases;
import es.uah.aut.srg.micobs.svm.svs.VSVSTestPlatformRequirements;
import es.uah.aut.srg.micobs.svm.svs.VSVSTestProcedures;
import es.uah.aut.srg.micobs.svm.svs.VSVSTestingSpecificationDesign;
import es.uah.aut.srg.micobs.svm.svs.svsPackage;
import es.uah.aut.srg.micobs.svm.vdm.VValidationDocumentAbstractGroup;
import es.uah.aut.srg.micobs.svm.vdm.impl.VValidationDocumentImpl;

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
 * An implementation of the model object '<em><b>VSVS Document</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link es.uah.aut.srg.micobs.svm.svs.impl.VSVSDocumentImpl#getApplicableDocuments <em>Applicable Documents</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.svm.svs.impl.VSVSDocumentImpl#getReferenceDocuments <em>Reference Documents</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.svm.svs.impl.VSVSDocumentImpl#getFigures <em>Figures</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.svm.svs.impl.VSVSDocumentImpl#getTables <em>Tables</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.svm.svs.impl.VSVSDocumentImpl#getSections <em>Sections</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.svm.svs.impl.VSVSDocumentImpl#getIntroductionSection <em>Introduction Section</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.svm.svs.impl.VSVSDocumentImpl#getApplicableDocumentsSection <em>Applicable Documents Section</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.svm.svs.impl.VSVSDocumentImpl#getReferenceDocumentsSection <em>Reference Documents Section</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.svm.svs.impl.VSVSDocumentImpl#getTermsDefinitionsAbbreviationsSection <em>Terms Definitions Abbreviations Section</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.svm.svs.impl.VSVSDocumentImpl#getSoftwareOverviewSection <em>Software Overview Section</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.svm.svs.impl.VSVSDocumentImpl#getTaskIdentificationSection <em>Task Identification Section</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.svm.svs.impl.VSVSDocumentImpl#getTestingSpecificationDesignSection <em>Testing Specification Design Section</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.svm.svs.impl.VSVSDocumentImpl#getTestCasesSection <em>Test Cases Section</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.svm.svs.impl.VSVSDocumentImpl#getTestProceduresSection <em>Test Procedures Section</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.svm.svs.impl.VSVSDocumentImpl#getAnalysisInspectionReviewSection <em>Analysis Inspection Review Section</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.svm.svs.impl.VSVSDocumentImpl#getTestPlatformRequirementsSection <em>Test Platform Requirements Section</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.svm.svs.impl.VSVSDocumentImpl#getAdditionalInformationSection <em>Additional Information Section</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.svm.svs.impl.VSVSDocumentImpl#getSvsFigures <em>Svs Figures</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.svm.svs.impl.VSVSDocumentImpl#getSvsTables <em>Svs Tables</em>}</li>
 * </ul>
 *
 * @generated
 */
public class VSVSDocumentImpl extends VValidationDocumentImpl implements VSVSDocument {
	/**
	 * The cached value of the '{@link #getIntroductionSection() <em>Introduction Section</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIntroductionSection()
	 * @generated
	 * @ordered
	 */
	protected VSVSIntroduction introductionSection;

	/**
	 * The cached value of the '{@link #getApplicableDocumentsSection() <em>Applicable Documents Section</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getApplicableDocumentsSection()
	 * @generated
	 * @ordered
	 */
	protected VSVSApplicableDocuments applicableDocumentsSection;

	/**
	 * The cached value of the '{@link #getReferenceDocumentsSection() <em>Reference Documents Section</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReferenceDocumentsSection()
	 * @generated
	 * @ordered
	 */
	protected VSVSReferenceDocuments referenceDocumentsSection;

	/**
	 * The cached value of the '{@link #getTermsDefinitionsAbbreviationsSection() <em>Terms Definitions Abbreviations Section</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTermsDefinitionsAbbreviationsSection()
	 * @generated
	 * @ordered
	 */
	protected VSVSTermsDefinitionsAbbreviations termsDefinitionsAbbreviationsSection;

	/**
	 * The cached value of the '{@link #getSoftwareOverviewSection() <em>Software Overview Section</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSoftwareOverviewSection()
	 * @generated
	 * @ordered
	 */
	protected VSVSSoftwareOverview softwareOverviewSection;

	/**
	 * The cached value of the '{@link #getTaskIdentificationSection() <em>Task Identification Section</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTaskIdentificationSection()
	 * @generated
	 * @ordered
	 */
	protected VSVSTaskIdentification taskIdentificationSection;

	/**
	 * The cached value of the '{@link #getTestingSpecificationDesignSection() <em>Testing Specification Design Section</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTestingSpecificationDesignSection()
	 * @generated
	 * @ordered
	 */
	protected VSVSTestingSpecificationDesign testingSpecificationDesignSection;

	/**
	 * The cached value of the '{@link #getTestCasesSection() <em>Test Cases Section</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTestCasesSection()
	 * @generated
	 * @ordered
	 */
	protected VSVSTestCases testCasesSection;

	/**
	 * The cached value of the '{@link #getTestProceduresSection() <em>Test Procedures Section</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTestProceduresSection()
	 * @generated
	 * @ordered
	 */
	protected VSVSTestProcedures testProceduresSection;

	/**
	 * The cached value of the '{@link #getAnalysisInspectionReviewSection() <em>Analysis Inspection Review Section</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnalysisInspectionReviewSection()
	 * @generated
	 * @ordered
	 */
	protected VSVSAnalysisInspectionReview analysisInspectionReviewSection;

	/**
	 * The cached value of the '{@link #getTestPlatformRequirementsSection() <em>Test Platform Requirements Section</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTestPlatformRequirementsSection()
	 * @generated
	 * @ordered
	 */
	protected VSVSTestPlatformRequirements testPlatformRequirementsSection;

	/**
	 * The cached value of the '{@link #getAdditionalInformationSection() <em>Additional Information Section</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdditionalInformationSection()
	 * @generated
	 * @ordered
	 */
	protected VSVSAdditionalInformation additionalInformationSection;

	/**
	 * The cached value of the '{@link #getSvsFigures() <em>Svs Figures</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSvsFigures()
	 * @generated
	 * @ordered
	 */
	protected EList<DAbstractFigure> svsFigures;

	/**
	 * The cached value of the '{@link #getSvsTables() <em>Svs Tables</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSvsTables()
	 * @generated
	 * @ordered
	 */
	protected EList<DAbstractTable> svsTables;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VSVSDocumentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return svsPackage.Literals.VSVS_DOCUMENT;
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
	public EList<DAbstractFigure> getFigures() {
		EList<DAbstractFigure> figures = new BasicEList<DAbstractFigure>();

		for(DAbstractFigure figure : getSvsFigures()) {
			figures.add(figure);
		}
		return figures;
	}

	@Override
	public EList<DAbstractTable> getTables() {
		EList<DAbstractTable> tables = new BasicEList<DAbstractTable>();

		for(DAbstractTable table : getSvsTables()) {
			tables.add(table);
		}
		return tables;
	}

	@Override
	public EList<DAbstractSection> getSections() {
		EList<DAbstractSection> sections = new BasicEList<DAbstractSection>();
		sections.add((DAbstractSection) getIntroductionSection());
		sections.add((DAbstractSection) getApplicableDocumentsSection());
		sections.add((DAbstractSection) getReferenceDocumentsSection());
		sections.add((DAbstractSection) getSoftwareOverviewSection());
		sections.add((DAbstractSection) getTaskIdentificationSection());
		sections.add((DAbstractSection) getTestingSpecificationDesignSection());
		sections.add((DAbstractSection) getTestCasesSection());
		sections.add((DAbstractSection) getTestProceduresSection());
		sections.add((DAbstractSection) getAnalysisInspectionReviewSection());
		sections.add((DAbstractSection) getTestPlatformRequirementsSection());
		sections.add((DAbstractSection) getAdditionalInformationSection());
		return sections;
	}
	
	@Override
	public EList<VValidationDocumentAbstractGroup> getGroups() {
		EList<VValidationDocumentAbstractGroup> groups = new BasicEList<VValidationDocumentAbstractGroup>();
		groups.add((VValidationDocumentAbstractGroup) getTestCasesSection());
		return groups;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VSVSIntroduction getIntroductionSection() {
		return introductionSection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIntroductionSection(VSVSIntroduction newIntroductionSection, NotificationChain msgs) {
		VSVSIntroduction oldIntroductionSection = introductionSection;
		introductionSection = newIntroductionSection;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, svsPackage.VSVS_DOCUMENT__INTRODUCTION_SECTION, oldIntroductionSection, newIntroductionSection);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIntroductionSection(VSVSIntroduction newIntroductionSection) {
		if (newIntroductionSection != introductionSection) {
			NotificationChain msgs = null;
			if (introductionSection != null)
				msgs = ((InternalEObject)introductionSection).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - svsPackage.VSVS_DOCUMENT__INTRODUCTION_SECTION, null, msgs);
			if (newIntroductionSection != null)
				msgs = ((InternalEObject)newIntroductionSection).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - svsPackage.VSVS_DOCUMENT__INTRODUCTION_SECTION, null, msgs);
			msgs = basicSetIntroductionSection(newIntroductionSection, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, svsPackage.VSVS_DOCUMENT__INTRODUCTION_SECTION, newIntroductionSection, newIntroductionSection));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VSVSApplicableDocuments getApplicableDocumentsSection() {
		return applicableDocumentsSection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetApplicableDocumentsSection(VSVSApplicableDocuments newApplicableDocumentsSection, NotificationChain msgs) {
		VSVSApplicableDocuments oldApplicableDocumentsSection = applicableDocumentsSection;
		applicableDocumentsSection = newApplicableDocumentsSection;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, svsPackage.VSVS_DOCUMENT__APPLICABLE_DOCUMENTS_SECTION, oldApplicableDocumentsSection, newApplicableDocumentsSection);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setApplicableDocumentsSection(VSVSApplicableDocuments newApplicableDocumentsSection) {
		if (newApplicableDocumentsSection != applicableDocumentsSection) {
			NotificationChain msgs = null;
			if (applicableDocumentsSection != null)
				msgs = ((InternalEObject)applicableDocumentsSection).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - svsPackage.VSVS_DOCUMENT__APPLICABLE_DOCUMENTS_SECTION, null, msgs);
			if (newApplicableDocumentsSection != null)
				msgs = ((InternalEObject)newApplicableDocumentsSection).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - svsPackage.VSVS_DOCUMENT__APPLICABLE_DOCUMENTS_SECTION, null, msgs);
			msgs = basicSetApplicableDocumentsSection(newApplicableDocumentsSection, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, svsPackage.VSVS_DOCUMENT__APPLICABLE_DOCUMENTS_SECTION, newApplicableDocumentsSection, newApplicableDocumentsSection));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VSVSReferenceDocuments getReferenceDocumentsSection() {
		return referenceDocumentsSection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetReferenceDocumentsSection(VSVSReferenceDocuments newReferenceDocumentsSection, NotificationChain msgs) {
		VSVSReferenceDocuments oldReferenceDocumentsSection = referenceDocumentsSection;
		referenceDocumentsSection = newReferenceDocumentsSection;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, svsPackage.VSVS_DOCUMENT__REFERENCE_DOCUMENTS_SECTION, oldReferenceDocumentsSection, newReferenceDocumentsSection);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReferenceDocumentsSection(VSVSReferenceDocuments newReferenceDocumentsSection) {
		if (newReferenceDocumentsSection != referenceDocumentsSection) {
			NotificationChain msgs = null;
			if (referenceDocumentsSection != null)
				msgs = ((InternalEObject)referenceDocumentsSection).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - svsPackage.VSVS_DOCUMENT__REFERENCE_DOCUMENTS_SECTION, null, msgs);
			if (newReferenceDocumentsSection != null)
				msgs = ((InternalEObject)newReferenceDocumentsSection).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - svsPackage.VSVS_DOCUMENT__REFERENCE_DOCUMENTS_SECTION, null, msgs);
			msgs = basicSetReferenceDocumentsSection(newReferenceDocumentsSection, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, svsPackage.VSVS_DOCUMENT__REFERENCE_DOCUMENTS_SECTION, newReferenceDocumentsSection, newReferenceDocumentsSection));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VSVSTermsDefinitionsAbbreviations getTermsDefinitionsAbbreviationsSection() {
		return termsDefinitionsAbbreviationsSection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTermsDefinitionsAbbreviationsSection(VSVSTermsDefinitionsAbbreviations newTermsDefinitionsAbbreviationsSection, NotificationChain msgs) {
		VSVSTermsDefinitionsAbbreviations oldTermsDefinitionsAbbreviationsSection = termsDefinitionsAbbreviationsSection;
		termsDefinitionsAbbreviationsSection = newTermsDefinitionsAbbreviationsSection;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, svsPackage.VSVS_DOCUMENT__TERMS_DEFINITIONS_ABBREVIATIONS_SECTION, oldTermsDefinitionsAbbreviationsSection, newTermsDefinitionsAbbreviationsSection);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTermsDefinitionsAbbreviationsSection(VSVSTermsDefinitionsAbbreviations newTermsDefinitionsAbbreviationsSection) {
		if (newTermsDefinitionsAbbreviationsSection != termsDefinitionsAbbreviationsSection) {
			NotificationChain msgs = null;
			if (termsDefinitionsAbbreviationsSection != null)
				msgs = ((InternalEObject)termsDefinitionsAbbreviationsSection).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - svsPackage.VSVS_DOCUMENT__TERMS_DEFINITIONS_ABBREVIATIONS_SECTION, null, msgs);
			if (newTermsDefinitionsAbbreviationsSection != null)
				msgs = ((InternalEObject)newTermsDefinitionsAbbreviationsSection).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - svsPackage.VSVS_DOCUMENT__TERMS_DEFINITIONS_ABBREVIATIONS_SECTION, null, msgs);
			msgs = basicSetTermsDefinitionsAbbreviationsSection(newTermsDefinitionsAbbreviationsSection, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, svsPackage.VSVS_DOCUMENT__TERMS_DEFINITIONS_ABBREVIATIONS_SECTION, newTermsDefinitionsAbbreviationsSection, newTermsDefinitionsAbbreviationsSection));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VSVSSoftwareOverview getSoftwareOverviewSection() {
		return softwareOverviewSection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSoftwareOverviewSection(VSVSSoftwareOverview newSoftwareOverviewSection, NotificationChain msgs) {
		VSVSSoftwareOverview oldSoftwareOverviewSection = softwareOverviewSection;
		softwareOverviewSection = newSoftwareOverviewSection;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, svsPackage.VSVS_DOCUMENT__SOFTWARE_OVERVIEW_SECTION, oldSoftwareOverviewSection, newSoftwareOverviewSection);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSoftwareOverviewSection(VSVSSoftwareOverview newSoftwareOverviewSection) {
		if (newSoftwareOverviewSection != softwareOverviewSection) {
			NotificationChain msgs = null;
			if (softwareOverviewSection != null)
				msgs = ((InternalEObject)softwareOverviewSection).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - svsPackage.VSVS_DOCUMENT__SOFTWARE_OVERVIEW_SECTION, null, msgs);
			if (newSoftwareOverviewSection != null)
				msgs = ((InternalEObject)newSoftwareOverviewSection).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - svsPackage.VSVS_DOCUMENT__SOFTWARE_OVERVIEW_SECTION, null, msgs);
			msgs = basicSetSoftwareOverviewSection(newSoftwareOverviewSection, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, svsPackage.VSVS_DOCUMENT__SOFTWARE_OVERVIEW_SECTION, newSoftwareOverviewSection, newSoftwareOverviewSection));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VSVSTaskIdentification getTaskIdentificationSection() {
		return taskIdentificationSection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTaskIdentificationSection(VSVSTaskIdentification newTaskIdentificationSection, NotificationChain msgs) {
		VSVSTaskIdentification oldTaskIdentificationSection = taskIdentificationSection;
		taskIdentificationSection = newTaskIdentificationSection;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, svsPackage.VSVS_DOCUMENT__TASK_IDENTIFICATION_SECTION, oldTaskIdentificationSection, newTaskIdentificationSection);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTaskIdentificationSection(VSVSTaskIdentification newTaskIdentificationSection) {
		if (newTaskIdentificationSection != taskIdentificationSection) {
			NotificationChain msgs = null;
			if (taskIdentificationSection != null)
				msgs = ((InternalEObject)taskIdentificationSection).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - svsPackage.VSVS_DOCUMENT__TASK_IDENTIFICATION_SECTION, null, msgs);
			if (newTaskIdentificationSection != null)
				msgs = ((InternalEObject)newTaskIdentificationSection).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - svsPackage.VSVS_DOCUMENT__TASK_IDENTIFICATION_SECTION, null, msgs);
			msgs = basicSetTaskIdentificationSection(newTaskIdentificationSection, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, svsPackage.VSVS_DOCUMENT__TASK_IDENTIFICATION_SECTION, newTaskIdentificationSection, newTaskIdentificationSection));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VSVSTestingSpecificationDesign getTestingSpecificationDesignSection() {
		return testingSpecificationDesignSection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTestingSpecificationDesignSection(VSVSTestingSpecificationDesign newTestingSpecificationDesignSection, NotificationChain msgs) {
		VSVSTestingSpecificationDesign oldTestingSpecificationDesignSection = testingSpecificationDesignSection;
		testingSpecificationDesignSection = newTestingSpecificationDesignSection;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, svsPackage.VSVS_DOCUMENT__TESTING_SPECIFICATION_DESIGN_SECTION, oldTestingSpecificationDesignSection, newTestingSpecificationDesignSection);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTestingSpecificationDesignSection(VSVSTestingSpecificationDesign newTestingSpecificationDesignSection) {
		if (newTestingSpecificationDesignSection != testingSpecificationDesignSection) {
			NotificationChain msgs = null;
			if (testingSpecificationDesignSection != null)
				msgs = ((InternalEObject)testingSpecificationDesignSection).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - svsPackage.VSVS_DOCUMENT__TESTING_SPECIFICATION_DESIGN_SECTION, null, msgs);
			if (newTestingSpecificationDesignSection != null)
				msgs = ((InternalEObject)newTestingSpecificationDesignSection).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - svsPackage.VSVS_DOCUMENT__TESTING_SPECIFICATION_DESIGN_SECTION, null, msgs);
			msgs = basicSetTestingSpecificationDesignSection(newTestingSpecificationDesignSection, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, svsPackage.VSVS_DOCUMENT__TESTING_SPECIFICATION_DESIGN_SECTION, newTestingSpecificationDesignSection, newTestingSpecificationDesignSection));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VSVSTestCases getTestCasesSection() {
		return testCasesSection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTestCasesSection(VSVSTestCases newTestCasesSection, NotificationChain msgs) {
		VSVSTestCases oldTestCasesSection = testCasesSection;
		testCasesSection = newTestCasesSection;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, svsPackage.VSVS_DOCUMENT__TEST_CASES_SECTION, oldTestCasesSection, newTestCasesSection);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTestCasesSection(VSVSTestCases newTestCasesSection) {
		if (newTestCasesSection != testCasesSection) {
			NotificationChain msgs = null;
			if (testCasesSection != null)
				msgs = ((InternalEObject)testCasesSection).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - svsPackage.VSVS_DOCUMENT__TEST_CASES_SECTION, null, msgs);
			if (newTestCasesSection != null)
				msgs = ((InternalEObject)newTestCasesSection).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - svsPackage.VSVS_DOCUMENT__TEST_CASES_SECTION, null, msgs);
			msgs = basicSetTestCasesSection(newTestCasesSection, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, svsPackage.VSVS_DOCUMENT__TEST_CASES_SECTION, newTestCasesSection, newTestCasesSection));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VSVSTestProcedures getTestProceduresSection() {
		return testProceduresSection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTestProceduresSection(VSVSTestProcedures newTestProceduresSection, NotificationChain msgs) {
		VSVSTestProcedures oldTestProceduresSection = testProceduresSection;
		testProceduresSection = newTestProceduresSection;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, svsPackage.VSVS_DOCUMENT__TEST_PROCEDURES_SECTION, oldTestProceduresSection, newTestProceduresSection);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTestProceduresSection(VSVSTestProcedures newTestProceduresSection) {
		if (newTestProceduresSection != testProceduresSection) {
			NotificationChain msgs = null;
			if (testProceduresSection != null)
				msgs = ((InternalEObject)testProceduresSection).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - svsPackage.VSVS_DOCUMENT__TEST_PROCEDURES_SECTION, null, msgs);
			if (newTestProceduresSection != null)
				msgs = ((InternalEObject)newTestProceduresSection).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - svsPackage.VSVS_DOCUMENT__TEST_PROCEDURES_SECTION, null, msgs);
			msgs = basicSetTestProceduresSection(newTestProceduresSection, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, svsPackage.VSVS_DOCUMENT__TEST_PROCEDURES_SECTION, newTestProceduresSection, newTestProceduresSection));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VSVSAnalysisInspectionReview getAnalysisInspectionReviewSection() {
		return analysisInspectionReviewSection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAnalysisInspectionReviewSection(VSVSAnalysisInspectionReview newAnalysisInspectionReviewSection, NotificationChain msgs) {
		VSVSAnalysisInspectionReview oldAnalysisInspectionReviewSection = analysisInspectionReviewSection;
		analysisInspectionReviewSection = newAnalysisInspectionReviewSection;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, svsPackage.VSVS_DOCUMENT__ANALYSIS_INSPECTION_REVIEW_SECTION, oldAnalysisInspectionReviewSection, newAnalysisInspectionReviewSection);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAnalysisInspectionReviewSection(VSVSAnalysisInspectionReview newAnalysisInspectionReviewSection) {
		if (newAnalysisInspectionReviewSection != analysisInspectionReviewSection) {
			NotificationChain msgs = null;
			if (analysisInspectionReviewSection != null)
				msgs = ((InternalEObject)analysisInspectionReviewSection).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - svsPackage.VSVS_DOCUMENT__ANALYSIS_INSPECTION_REVIEW_SECTION, null, msgs);
			if (newAnalysisInspectionReviewSection != null)
				msgs = ((InternalEObject)newAnalysisInspectionReviewSection).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - svsPackage.VSVS_DOCUMENT__ANALYSIS_INSPECTION_REVIEW_SECTION, null, msgs);
			msgs = basicSetAnalysisInspectionReviewSection(newAnalysisInspectionReviewSection, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, svsPackage.VSVS_DOCUMENT__ANALYSIS_INSPECTION_REVIEW_SECTION, newAnalysisInspectionReviewSection, newAnalysisInspectionReviewSection));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VSVSTestPlatformRequirements getTestPlatformRequirementsSection() {
		return testPlatformRequirementsSection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTestPlatformRequirementsSection(VSVSTestPlatformRequirements newTestPlatformRequirementsSection, NotificationChain msgs) {
		VSVSTestPlatformRequirements oldTestPlatformRequirementsSection = testPlatformRequirementsSection;
		testPlatformRequirementsSection = newTestPlatformRequirementsSection;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, svsPackage.VSVS_DOCUMENT__TEST_PLATFORM_REQUIREMENTS_SECTION, oldTestPlatformRequirementsSection, newTestPlatformRequirementsSection);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTestPlatformRequirementsSection(VSVSTestPlatformRequirements newTestPlatformRequirementsSection) {
		if (newTestPlatformRequirementsSection != testPlatformRequirementsSection) {
			NotificationChain msgs = null;
			if (testPlatformRequirementsSection != null)
				msgs = ((InternalEObject)testPlatformRequirementsSection).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - svsPackage.VSVS_DOCUMENT__TEST_PLATFORM_REQUIREMENTS_SECTION, null, msgs);
			if (newTestPlatformRequirementsSection != null)
				msgs = ((InternalEObject)newTestPlatformRequirementsSection).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - svsPackage.VSVS_DOCUMENT__TEST_PLATFORM_REQUIREMENTS_SECTION, null, msgs);
			msgs = basicSetTestPlatformRequirementsSection(newTestPlatformRequirementsSection, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, svsPackage.VSVS_DOCUMENT__TEST_PLATFORM_REQUIREMENTS_SECTION, newTestPlatformRequirementsSection, newTestPlatformRequirementsSection));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VSVSAdditionalInformation getAdditionalInformationSection() {
		return additionalInformationSection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAdditionalInformationSection(VSVSAdditionalInformation newAdditionalInformationSection, NotificationChain msgs) {
		VSVSAdditionalInformation oldAdditionalInformationSection = additionalInformationSection;
		additionalInformationSection = newAdditionalInformationSection;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, svsPackage.VSVS_DOCUMENT__ADDITIONAL_INFORMATION_SECTION, oldAdditionalInformationSection, newAdditionalInformationSection);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAdditionalInformationSection(VSVSAdditionalInformation newAdditionalInformationSection) {
		if (newAdditionalInformationSection != additionalInformationSection) {
			NotificationChain msgs = null;
			if (additionalInformationSection != null)
				msgs = ((InternalEObject)additionalInformationSection).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - svsPackage.VSVS_DOCUMENT__ADDITIONAL_INFORMATION_SECTION, null, msgs);
			if (newAdditionalInformationSection != null)
				msgs = ((InternalEObject)newAdditionalInformationSection).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - svsPackage.VSVS_DOCUMENT__ADDITIONAL_INFORMATION_SECTION, null, msgs);
			msgs = basicSetAdditionalInformationSection(newAdditionalInformationSection, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, svsPackage.VSVS_DOCUMENT__ADDITIONAL_INFORMATION_SECTION, newAdditionalInformationSection, newAdditionalInformationSection));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DAbstractFigure> getSvsFigures() {
		if (svsFigures == null) {
			svsFigures = new EObjectContainmentEList<DAbstractFigure>(DAbstractFigure.class, this, svsPackage.VSVS_DOCUMENT__SVS_FIGURES);
		}
		return svsFigures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DAbstractTable> getSvsTables() {
		if (svsTables == null) {
			svsTables = new EObjectContainmentEList<DAbstractTable>(DAbstractTable.class, this, svsPackage.VSVS_DOCUMENT__SVS_TABLES);
		}
		return svsTables;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case svsPackage.VSVS_DOCUMENT__INTRODUCTION_SECTION:
				return basicSetIntroductionSection(null, msgs);
			case svsPackage.VSVS_DOCUMENT__APPLICABLE_DOCUMENTS_SECTION:
				return basicSetApplicableDocumentsSection(null, msgs);
			case svsPackage.VSVS_DOCUMENT__REFERENCE_DOCUMENTS_SECTION:
				return basicSetReferenceDocumentsSection(null, msgs);
			case svsPackage.VSVS_DOCUMENT__TERMS_DEFINITIONS_ABBREVIATIONS_SECTION:
				return basicSetTermsDefinitionsAbbreviationsSection(null, msgs);
			case svsPackage.VSVS_DOCUMENT__SOFTWARE_OVERVIEW_SECTION:
				return basicSetSoftwareOverviewSection(null, msgs);
			case svsPackage.VSVS_DOCUMENT__TASK_IDENTIFICATION_SECTION:
				return basicSetTaskIdentificationSection(null, msgs);
			case svsPackage.VSVS_DOCUMENT__TESTING_SPECIFICATION_DESIGN_SECTION:
				return basicSetTestingSpecificationDesignSection(null, msgs);
			case svsPackage.VSVS_DOCUMENT__TEST_CASES_SECTION:
				return basicSetTestCasesSection(null, msgs);
			case svsPackage.VSVS_DOCUMENT__TEST_PROCEDURES_SECTION:
				return basicSetTestProceduresSection(null, msgs);
			case svsPackage.VSVS_DOCUMENT__ANALYSIS_INSPECTION_REVIEW_SECTION:
				return basicSetAnalysisInspectionReviewSection(null, msgs);
			case svsPackage.VSVS_DOCUMENT__TEST_PLATFORM_REQUIREMENTS_SECTION:
				return basicSetTestPlatformRequirementsSection(null, msgs);
			case svsPackage.VSVS_DOCUMENT__ADDITIONAL_INFORMATION_SECTION:
				return basicSetAdditionalInformationSection(null, msgs);
			case svsPackage.VSVS_DOCUMENT__SVS_FIGURES:
				return ((InternalEList<?>)getSvsFigures()).basicRemove(otherEnd, msgs);
			case svsPackage.VSVS_DOCUMENT__SVS_TABLES:
				return ((InternalEList<?>)getSvsTables()).basicRemove(otherEnd, msgs);
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
			case svsPackage.VSVS_DOCUMENT__APPLICABLE_DOCUMENTS:
				return getApplicableDocuments();
			case svsPackage.VSVS_DOCUMENT__REFERENCE_DOCUMENTS:
				return getReferenceDocuments();
			case svsPackage.VSVS_DOCUMENT__FIGURES:
				return getFigures();
			case svsPackage.VSVS_DOCUMENT__TABLES:
				return getTables();
			case svsPackage.VSVS_DOCUMENT__SECTIONS:
				return getSections();
			case svsPackage.VSVS_DOCUMENT__INTRODUCTION_SECTION:
				return getIntroductionSection();
			case svsPackage.VSVS_DOCUMENT__APPLICABLE_DOCUMENTS_SECTION:
				return getApplicableDocumentsSection();
			case svsPackage.VSVS_DOCUMENT__REFERENCE_DOCUMENTS_SECTION:
				return getReferenceDocumentsSection();
			case svsPackage.VSVS_DOCUMENT__TERMS_DEFINITIONS_ABBREVIATIONS_SECTION:
				return getTermsDefinitionsAbbreviationsSection();
			case svsPackage.VSVS_DOCUMENT__SOFTWARE_OVERVIEW_SECTION:
				return getSoftwareOverviewSection();
			case svsPackage.VSVS_DOCUMENT__TASK_IDENTIFICATION_SECTION:
				return getTaskIdentificationSection();
			case svsPackage.VSVS_DOCUMENT__TESTING_SPECIFICATION_DESIGN_SECTION:
				return getTestingSpecificationDesignSection();
			case svsPackage.VSVS_DOCUMENT__TEST_CASES_SECTION:
				return getTestCasesSection();
			case svsPackage.VSVS_DOCUMENT__TEST_PROCEDURES_SECTION:
				return getTestProceduresSection();
			case svsPackage.VSVS_DOCUMENT__ANALYSIS_INSPECTION_REVIEW_SECTION:
				return getAnalysisInspectionReviewSection();
			case svsPackage.VSVS_DOCUMENT__TEST_PLATFORM_REQUIREMENTS_SECTION:
				return getTestPlatformRequirementsSection();
			case svsPackage.VSVS_DOCUMENT__ADDITIONAL_INFORMATION_SECTION:
				return getAdditionalInformationSection();
			case svsPackage.VSVS_DOCUMENT__SVS_FIGURES:
				return getSvsFigures();
			case svsPackage.VSVS_DOCUMENT__SVS_TABLES:
				return getSvsTables();
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
			case svsPackage.VSVS_DOCUMENT__APPLICABLE_DOCUMENTS:
				getApplicableDocuments().clear();
				getApplicableDocuments().addAll((Collection<? extends DApplicableDocument>)newValue);
				return;
			case svsPackage.VSVS_DOCUMENT__REFERENCE_DOCUMENTS:
				getReferenceDocuments().clear();
				getReferenceDocuments().addAll((Collection<? extends DReferenceDocument>)newValue);
				return;
			case svsPackage.VSVS_DOCUMENT__FIGURES:
				getFigures().clear();
				getFigures().addAll((Collection<? extends DAbstractFigure>)newValue);
				return;
			case svsPackage.VSVS_DOCUMENT__TABLES:
				getTables().clear();
				getTables().addAll((Collection<? extends DAbstractTable>)newValue);
				return;
			case svsPackage.VSVS_DOCUMENT__SECTIONS:
				getSections().clear();
				getSections().addAll((Collection<? extends DAbstractSection>)newValue);
				return;
			case svsPackage.VSVS_DOCUMENT__INTRODUCTION_SECTION:
				setIntroductionSection((VSVSIntroduction)newValue);
				return;
			case svsPackage.VSVS_DOCUMENT__APPLICABLE_DOCUMENTS_SECTION:
				setApplicableDocumentsSection((VSVSApplicableDocuments)newValue);
				return;
			case svsPackage.VSVS_DOCUMENT__REFERENCE_DOCUMENTS_SECTION:
				setReferenceDocumentsSection((VSVSReferenceDocuments)newValue);
				return;
			case svsPackage.VSVS_DOCUMENT__TERMS_DEFINITIONS_ABBREVIATIONS_SECTION:
				setTermsDefinitionsAbbreviationsSection((VSVSTermsDefinitionsAbbreviations)newValue);
				return;
			case svsPackage.VSVS_DOCUMENT__SOFTWARE_OVERVIEW_SECTION:
				setSoftwareOverviewSection((VSVSSoftwareOverview)newValue);
				return;
			case svsPackage.VSVS_DOCUMENT__TASK_IDENTIFICATION_SECTION:
				setTaskIdentificationSection((VSVSTaskIdentification)newValue);
				return;
			case svsPackage.VSVS_DOCUMENT__TESTING_SPECIFICATION_DESIGN_SECTION:
				setTestingSpecificationDesignSection((VSVSTestingSpecificationDesign)newValue);
				return;
			case svsPackage.VSVS_DOCUMENT__TEST_CASES_SECTION:
				setTestCasesSection((VSVSTestCases)newValue);
				return;
			case svsPackage.VSVS_DOCUMENT__TEST_PROCEDURES_SECTION:
				setTestProceduresSection((VSVSTestProcedures)newValue);
				return;
			case svsPackage.VSVS_DOCUMENT__ANALYSIS_INSPECTION_REVIEW_SECTION:
				setAnalysisInspectionReviewSection((VSVSAnalysisInspectionReview)newValue);
				return;
			case svsPackage.VSVS_DOCUMENT__TEST_PLATFORM_REQUIREMENTS_SECTION:
				setTestPlatformRequirementsSection((VSVSTestPlatformRequirements)newValue);
				return;
			case svsPackage.VSVS_DOCUMENT__ADDITIONAL_INFORMATION_SECTION:
				setAdditionalInformationSection((VSVSAdditionalInformation)newValue);
				return;
			case svsPackage.VSVS_DOCUMENT__SVS_FIGURES:
				getSvsFigures().clear();
				getSvsFigures().addAll((Collection<? extends DAbstractFigure>)newValue);
				return;
			case svsPackage.VSVS_DOCUMENT__SVS_TABLES:
				getSvsTables().clear();
				getSvsTables().addAll((Collection<? extends DAbstractTable>)newValue);
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
			case svsPackage.VSVS_DOCUMENT__APPLICABLE_DOCUMENTS:
				getApplicableDocuments().clear();
				return;
			case svsPackage.VSVS_DOCUMENT__REFERENCE_DOCUMENTS:
				getReferenceDocuments().clear();
				return;
			case svsPackage.VSVS_DOCUMENT__FIGURES:
				getFigures().clear();
				return;
			case svsPackage.VSVS_DOCUMENT__TABLES:
				getTables().clear();
				return;
			case svsPackage.VSVS_DOCUMENT__SECTIONS:
				getSections().clear();
				return;
			case svsPackage.VSVS_DOCUMENT__INTRODUCTION_SECTION:
				setIntroductionSection((VSVSIntroduction)null);
				return;
			case svsPackage.VSVS_DOCUMENT__APPLICABLE_DOCUMENTS_SECTION:
				setApplicableDocumentsSection((VSVSApplicableDocuments)null);
				return;
			case svsPackage.VSVS_DOCUMENT__REFERENCE_DOCUMENTS_SECTION:
				setReferenceDocumentsSection((VSVSReferenceDocuments)null);
				return;
			case svsPackage.VSVS_DOCUMENT__TERMS_DEFINITIONS_ABBREVIATIONS_SECTION:
				setTermsDefinitionsAbbreviationsSection((VSVSTermsDefinitionsAbbreviations)null);
				return;
			case svsPackage.VSVS_DOCUMENT__SOFTWARE_OVERVIEW_SECTION:
				setSoftwareOverviewSection((VSVSSoftwareOverview)null);
				return;
			case svsPackage.VSVS_DOCUMENT__TASK_IDENTIFICATION_SECTION:
				setTaskIdentificationSection((VSVSTaskIdentification)null);
				return;
			case svsPackage.VSVS_DOCUMENT__TESTING_SPECIFICATION_DESIGN_SECTION:
				setTestingSpecificationDesignSection((VSVSTestingSpecificationDesign)null);
				return;
			case svsPackage.VSVS_DOCUMENT__TEST_CASES_SECTION:
				setTestCasesSection((VSVSTestCases)null);
				return;
			case svsPackage.VSVS_DOCUMENT__TEST_PROCEDURES_SECTION:
				setTestProceduresSection((VSVSTestProcedures)null);
				return;
			case svsPackage.VSVS_DOCUMENT__ANALYSIS_INSPECTION_REVIEW_SECTION:
				setAnalysisInspectionReviewSection((VSVSAnalysisInspectionReview)null);
				return;
			case svsPackage.VSVS_DOCUMENT__TEST_PLATFORM_REQUIREMENTS_SECTION:
				setTestPlatformRequirementsSection((VSVSTestPlatformRequirements)null);
				return;
			case svsPackage.VSVS_DOCUMENT__ADDITIONAL_INFORMATION_SECTION:
				setAdditionalInformationSection((VSVSAdditionalInformation)null);
				return;
			case svsPackage.VSVS_DOCUMENT__SVS_FIGURES:
				getSvsFigures().clear();
				return;
			case svsPackage.VSVS_DOCUMENT__SVS_TABLES:
				getSvsTables().clear();
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
			case svsPackage.VSVS_DOCUMENT__APPLICABLE_DOCUMENTS:
				return !getApplicableDocuments().isEmpty();
			case svsPackage.VSVS_DOCUMENT__REFERENCE_DOCUMENTS:
				return !getReferenceDocuments().isEmpty();
			case svsPackage.VSVS_DOCUMENT__FIGURES:
				return !getFigures().isEmpty();
			case svsPackage.VSVS_DOCUMENT__TABLES:
				return !getTables().isEmpty();
			case svsPackage.VSVS_DOCUMENT__SECTIONS:
				return !getSections().isEmpty();
			case svsPackage.VSVS_DOCUMENT__INTRODUCTION_SECTION:
				return introductionSection != null;
			case svsPackage.VSVS_DOCUMENT__APPLICABLE_DOCUMENTS_SECTION:
				return applicableDocumentsSection != null;
			case svsPackage.VSVS_DOCUMENT__REFERENCE_DOCUMENTS_SECTION:
				return referenceDocumentsSection != null;
			case svsPackage.VSVS_DOCUMENT__TERMS_DEFINITIONS_ABBREVIATIONS_SECTION:
				return termsDefinitionsAbbreviationsSection != null;
			case svsPackage.VSVS_DOCUMENT__SOFTWARE_OVERVIEW_SECTION:
				return softwareOverviewSection != null;
			case svsPackage.VSVS_DOCUMENT__TASK_IDENTIFICATION_SECTION:
				return taskIdentificationSection != null;
			case svsPackage.VSVS_DOCUMENT__TESTING_SPECIFICATION_DESIGN_SECTION:
				return testingSpecificationDesignSection != null;
			case svsPackage.VSVS_DOCUMENT__TEST_CASES_SECTION:
				return testCasesSection != null;
			case svsPackage.VSVS_DOCUMENT__TEST_PROCEDURES_SECTION:
				return testProceduresSection != null;
			case svsPackage.VSVS_DOCUMENT__ANALYSIS_INSPECTION_REVIEW_SECTION:
				return analysisInspectionReviewSection != null;
			case svsPackage.VSVS_DOCUMENT__TEST_PLATFORM_REQUIREMENTS_SECTION:
				return testPlatformRequirementsSection != null;
			case svsPackage.VSVS_DOCUMENT__ADDITIONAL_INFORMATION_SECTION:
				return additionalInformationSection != null;
			case svsPackage.VSVS_DOCUMENT__SVS_FIGURES:
				return svsFigures != null && !svsFigures.isEmpty();
			case svsPackage.VSVS_DOCUMENT__SVS_TABLES:
				return svsTables != null && !svsTables.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == DDocumentTemplate.class) {
			switch (derivedFeatureID) {
				case svsPackage.VSVS_DOCUMENT__APPLICABLE_DOCUMENTS: return docPackage.DDOCUMENT_TEMPLATE__APPLICABLE_DOCUMENTS;
				case svsPackage.VSVS_DOCUMENT__REFERENCE_DOCUMENTS: return docPackage.DDOCUMENT_TEMPLATE__REFERENCE_DOCUMENTS;
				case svsPackage.VSVS_DOCUMENT__FIGURES: return docPackage.DDOCUMENT_TEMPLATE__FIGURES;
				case svsPackage.VSVS_DOCUMENT__TABLES: return docPackage.DDOCUMENT_TEMPLATE__TABLES;
				case svsPackage.VSVS_DOCUMENT__SECTIONS: return docPackage.DDOCUMENT_TEMPLATE__SECTIONS;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == DDocumentTemplate.class) {
			switch (baseFeatureID) {
				case docPackage.DDOCUMENT_TEMPLATE__APPLICABLE_DOCUMENTS: return svsPackage.VSVS_DOCUMENT__APPLICABLE_DOCUMENTS;
				case docPackage.DDOCUMENT_TEMPLATE__REFERENCE_DOCUMENTS: return svsPackage.VSVS_DOCUMENT__REFERENCE_DOCUMENTS;
				case docPackage.DDOCUMENT_TEMPLATE__FIGURES: return svsPackage.VSVS_DOCUMENT__FIGURES;
				case docPackage.DDOCUMENT_TEMPLATE__TABLES: return svsPackage.VSVS_DOCUMENT__TABLES;
				case docPackage.DDOCUMENT_TEMPLATE__SECTIONS: return svsPackage.VSVS_DOCUMENT__SECTIONS;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //VSVSDocumentImpl
