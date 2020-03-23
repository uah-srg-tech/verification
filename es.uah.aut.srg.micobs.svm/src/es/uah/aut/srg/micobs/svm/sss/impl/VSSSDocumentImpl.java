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
package es.uah.aut.srg.micobs.svm.sss.impl;

import es.uah.aut.srg.micobs.doctpl.doctpl.DAbstractFigure;
import es.uah.aut.srg.micobs.doctpl.doctpl.DAbstractSection;
import es.uah.aut.srg.micobs.doctpl.doctpl.DAbstractTable;
import es.uah.aut.srg.micobs.doctpl.doctpl.DApplicableDocument;
import es.uah.aut.srg.micobs.doctpl.doctpl.DDocumentTemplate;
import es.uah.aut.srg.micobs.doctpl.doctpl.DParagraph;
import es.uah.aut.srg.micobs.doctpl.doctpl.DReferenceDocument;
import es.uah.aut.srg.micobs.doctpl.doctpl.DReferenceableObject;
import es.uah.aut.srg.micobs.doctpl.doctpl.DTBC;
import es.uah.aut.srg.micobs.doctpl.doctpl.DTBD;
import es.uah.aut.srg.micobs.doctpl.doctpl.doctplPackage;
import es.uah.aut.srg.micobs.svm.sss.VSSSApplicableDocuments;
import es.uah.aut.srg.micobs.svm.sss.VSSSDocument;
import es.uah.aut.srg.micobs.svm.sss.VSSSGeneralDescription;
import es.uah.aut.srg.micobs.svm.sss.VSSSIntroduction;
import es.uah.aut.srg.micobs.svm.sss.VSSSReferenceDocuments;
import es.uah.aut.srg.micobs.svm.sss.VSSSSpecificRequirements;
import es.uah.aut.srg.micobs.svm.sss.VSSSSystemModels;
import es.uah.aut.srg.micobs.svm.sss.VSSSTBCsTBDs;
import es.uah.aut.srg.micobs.svm.sss.VSSSTermsDefinitionsAbbreviations;
import es.uah.aut.srg.micobs.svm.sss.VSSSVerificationValidationIntegrationRequirements;
import es.uah.aut.srg.micobs.svm.sss.sssPackage;
import es.uah.aut.srg.micobs.svm.tdm.VTraceableDocumentAbstractGroup;
import es.uah.aut.srg.micobs.svm.tdm.impl.VTraceableDocumentImpl;
import java.util.Collection;

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
 * An implementation of the model object '<em><b>VSSS Document</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link es.uah.aut.srg.micobs.svm.sss.impl.VSSSDocumentImpl#getName <em>Name</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.svm.sss.impl.VSSSDocumentImpl#getId <em>Id</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.svm.sss.impl.VSSSDocumentImpl#getIssue <em>Issue</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.svm.sss.impl.VSSSDocumentImpl#getRevision <em>Revision</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.svm.sss.impl.VSSSDocumentImpl#getDate <em>Date</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.svm.sss.impl.VSSSDocumentImpl#getTbcs <em>Tbcs</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.svm.sss.impl.VSSSDocumentImpl#getTbds <em>Tbds</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.svm.sss.impl.VSSSDocumentImpl#getApplicableDocuments <em>Applicable Documents</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.svm.sss.impl.VSSSDocumentImpl#getReferenceDocuments <em>Reference Documents</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.svm.sss.impl.VSSSDocumentImpl#getFigures <em>Figures</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.svm.sss.impl.VSSSDocumentImpl#getTables <em>Tables</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.svm.sss.impl.VSSSDocumentImpl#getSections <em>Sections</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.svm.sss.impl.VSSSDocumentImpl#getParagraphs <em>Paragraphs</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.svm.sss.impl.VSSSDocumentImpl#getTbcsTbdsSection <em>Tbcs Tbds Section</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.svm.sss.impl.VSSSDocumentImpl#getIntroductionSection <em>Introduction Section</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.svm.sss.impl.VSSSDocumentImpl#getApplicableDocumentsSection <em>Applicable Documents Section</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.svm.sss.impl.VSSSDocumentImpl#getReferenceDocumentsSection <em>Reference Documents Section</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.svm.sss.impl.VSSSDocumentImpl#getTermsDefinitionsAbbreviationsSection <em>Terms Definitions Abbreviations Section</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.svm.sss.impl.VSSSDocumentImpl#getGeneralDescriptionSection <em>General Description Section</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.svm.sss.impl.VSSSDocumentImpl#getSpecificRequirementsSection <em>Specific Requirements Section</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.svm.sss.impl.VSSSDocumentImpl#getVerificationValidationIntegrationSection <em>Verification Validation Integration Section</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.svm.sss.impl.VSSSDocumentImpl#getSystemModelsSection <em>System Models Section</em>}</li>
 * </ul>
 *
 * @generated
 */
public class VSSSDocumentImpl extends VTraceableDocumentImpl implements VSSSDocument {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected String id = ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getIssue() <em>Issue</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIssue()
	 * @generated
	 * @ordered
	 */
	protected static final String ISSUE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIssue() <em>Issue</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIssue()
	 * @generated
	 * @ordered
	 */
	protected String issue = ISSUE_EDEFAULT;

	/**
	 * The default value of the '{@link #getRevision() <em>Revision</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRevision()
	 * @generated
	 * @ordered
	 */
	protected static final String REVISION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRevision() <em>Revision</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRevision()
	 * @generated
	 * @ordered
	 */
	protected String revision = REVISION_EDEFAULT;

	/**
	 * The default value of the '{@link #getDate() <em>Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDate()
	 * @generated
	 * @ordered
	 */
	protected static final String DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDate() <em>Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDate()
	 * @generated
	 * @ordered
	 */
	protected String date = DATE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getTbcsTbdsSection() <em>Tbcs Tbds Section</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTbcsTbdsSection()
	 * @generated
	 * @ordered
	 */
	protected VSSSTBCsTBDs tbcsTbdsSection;

	/**
	 * The cached value of the '{@link #getIntroductionSection() <em>Introduction Section</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIntroductionSection()
	 * @generated
	 * @ordered
	 */
	protected VSSSIntroduction introductionSection;

	/**
	 * The cached value of the '{@link #getApplicableDocumentsSection() <em>Applicable Documents Section</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getApplicableDocumentsSection()
	 * @generated
	 * @ordered
	 */
	protected VSSSApplicableDocuments applicableDocumentsSection;

	/**
	 * The cached value of the '{@link #getReferenceDocumentsSection() <em>Reference Documents Section</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReferenceDocumentsSection()
	 * @generated
	 * @ordered
	 */
	protected VSSSReferenceDocuments referenceDocumentsSection;

	/**
	 * The cached value of the '{@link #getTermsDefinitionsAbbreviationsSection() <em>Terms Definitions Abbreviations Section</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTermsDefinitionsAbbreviationsSection()
	 * @generated
	 * @ordered
	 */
	protected VSSSTermsDefinitionsAbbreviations termsDefinitionsAbbreviationsSection;

	/**
	 * The cached value of the '{@link #getGeneralDescriptionSection() <em>General Description Section</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGeneralDescriptionSection()
	 * @generated
	 * @ordered
	 */
	protected VSSSGeneralDescription generalDescriptionSection;

	/**
	 * The cached value of the '{@link #getSpecificRequirementsSection() <em>Specific Requirements Section</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpecificRequirementsSection()
	 * @generated
	 * @ordered
	 */
	protected VSSSSpecificRequirements specificRequirementsSection;

	/**
	 * The cached value of the '{@link #getVerificationValidationIntegrationSection() <em>Verification Validation Integration Section</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVerificationValidationIntegrationSection()
	 * @generated
	 * @ordered
	 */
	protected VSSSVerificationValidationIntegrationRequirements verificationValidationIntegrationSection;

	/**
	 * The cached value of the '{@link #getSystemModelsSection() <em>System Models Section</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSystemModelsSection()
	 * @generated
	 * @ordered
	 */
	protected VSSSSystemModels systemModelsSection;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VSSSDocumentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return sssPackage.Literals.VSSS_DOCUMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, sssPackage.VSSS_DOCUMENT__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setId(String newId) {
		String oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, sssPackage.VSSS_DOCUMENT__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getIssue() {
		return issue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIssue(String newIssue) {
		String oldIssue = issue;
		issue = newIssue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, sssPackage.VSSS_DOCUMENT__ISSUE, oldIssue, issue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRevision() {
		return revision;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRevision(String newRevision) {
		String oldRevision = revision;
		revision = newRevision;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, sssPackage.VSSS_DOCUMENT__REVISION, oldRevision, revision));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDate() {
		return date;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDate(String newDate) {
		String oldDate = date;
		date = newDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, sssPackage.VSSS_DOCUMENT__DATE, oldDate, date));
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
		objects.addAll(getIntroductionSection().getReferenceableObjects(ReferenceableObjectType));
		objects.addAll(getGeneralDescriptionSection().getReferenceableObjects(ReferenceableObjectType));
		objects.addAll(getSpecificRequirementsSection().getReferenceableObjects(ReferenceableObjectType));
		objects.addAll(getVerificationValidationIntegrationSection().getReferenceableObjects(ReferenceableObjectType));
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
		sections.add((DAbstractSection) getIntroductionSection());
		sections.add((DAbstractSection) getApplicableDocumentsSection());
		sections.add((DAbstractSection) getReferenceDocumentsSection());
		sections.add((DAbstractSection) getTermsDefinitionsAbbreviationsSection());
		sections.add((DAbstractSection) getSpecificRequirementsSection());
		sections.add((DAbstractSection) getVerificationValidationIntegrationSection());
		sections.add((DAbstractSection) getSystemModelsSection());
		return sections;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VSSSIntroduction getIntroductionSection() {
		return introductionSection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIntroductionSection(VSSSIntroduction newIntroductionSection, NotificationChain msgs) {
		VSSSIntroduction oldIntroductionSection = introductionSection;
		introductionSection = newIntroductionSection;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, sssPackage.VSSS_DOCUMENT__INTRODUCTION_SECTION, oldIntroductionSection, newIntroductionSection);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIntroductionSection(VSSSIntroduction newIntroductionSection) {
		if (newIntroductionSection != introductionSection) {
			NotificationChain msgs = null;
			if (introductionSection != null)
				msgs = ((InternalEObject)introductionSection).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - sssPackage.VSSS_DOCUMENT__INTRODUCTION_SECTION, null, msgs);
			if (newIntroductionSection != null)
				msgs = ((InternalEObject)newIntroductionSection).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - sssPackage.VSSS_DOCUMENT__INTRODUCTION_SECTION, null, msgs);
			msgs = basicSetIntroductionSection(newIntroductionSection, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, sssPackage.VSSS_DOCUMENT__INTRODUCTION_SECTION, newIntroductionSection, newIntroductionSection));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VSSSTBCsTBDs getTbcsTbdsSection() {
		return tbcsTbdsSection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTbcsTbdsSection(VSSSTBCsTBDs newTbcsTbdsSection, NotificationChain msgs) {
		VSSSTBCsTBDs oldTbcsTbdsSection = tbcsTbdsSection;
		tbcsTbdsSection = newTbcsTbdsSection;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, sssPackage.VSSS_DOCUMENT__TBCS_TBDS_SECTION, oldTbcsTbdsSection, newTbcsTbdsSection);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTbcsTbdsSection(VSSSTBCsTBDs newTbcsTbdsSection) {
		if (newTbcsTbdsSection != tbcsTbdsSection) {
			NotificationChain msgs = null;
			if (tbcsTbdsSection != null)
				msgs = ((InternalEObject)tbcsTbdsSection).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - sssPackage.VSSS_DOCUMENT__TBCS_TBDS_SECTION, null, msgs);
			if (newTbcsTbdsSection != null)
				msgs = ((InternalEObject)newTbcsTbdsSection).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - sssPackage.VSSS_DOCUMENT__TBCS_TBDS_SECTION, null, msgs);
			msgs = basicSetTbcsTbdsSection(newTbcsTbdsSection, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, sssPackage.VSSS_DOCUMENT__TBCS_TBDS_SECTION, newTbcsTbdsSection, newTbcsTbdsSection));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VSSSApplicableDocuments getApplicableDocumentsSection() {
		return applicableDocumentsSection;
	}
	
	@Override
	public EList<VTraceableDocumentAbstractGroup> getGroups() {
		EList<VTraceableDocumentAbstractGroup> groups = new BasicEList<VTraceableDocumentAbstractGroup>();
		groups.add((VTraceableDocumentAbstractGroup) getSpecificRequirementsSection().getGeneral());
		groups.add((VTraceableDocumentAbstractGroup) getSpecificRequirementsSection().getCapabilities());
		groups.add((VTraceableDocumentAbstractGroup) getSpecificRequirementsSection().getSystemInterface());
		groups.add((VTraceableDocumentAbstractGroup) getSpecificRequirementsSection().getAdaptationMissionization());
		groups.add((VTraceableDocumentAbstractGroup) getSpecificRequirementsSection().getComputerResource());
		groups.add((VTraceableDocumentAbstractGroup) getSpecificRequirementsSection().getSecurity());
		groups.add((VTraceableDocumentAbstractGroup) getSpecificRequirementsSection().getSafety());
		groups.add((VTraceableDocumentAbstractGroup) getSpecificRequirementsSection().getReliabilityAvailability());
		groups.add((VTraceableDocumentAbstractGroup) getSpecificRequirementsSection().getQuality());
		groups.add((VTraceableDocumentAbstractGroup) getSpecificRequirementsSection().getDesign());
		groups.add((VTraceableDocumentAbstractGroup) getSpecificRequirementsSection().getSoftwareOperations());
		groups.add((VTraceableDocumentAbstractGroup) getSpecificRequirementsSection().getSoftwareMaintenance());
		groups.add((VTraceableDocumentAbstractGroup) getSpecificRequirementsSection().getSystemSoftwareObservability());
		groups.add((VTraceableDocumentAbstractGroup) getVerificationValidationIntegrationSection().getVerificationValidationProcess());
		groups.add((VTraceableDocumentAbstractGroup) getVerificationValidationIntegrationSection().getValidationApproach());
		groups.add((VTraceableDocumentAbstractGroup) getVerificationValidationIntegrationSection().getValidation());
		groups.add((VTraceableDocumentAbstractGroup) getVerificationValidationIntegrationSection().getVerification());
		return groups;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetApplicableDocumentsSection(VSSSApplicableDocuments newApplicableDocumentsSection, NotificationChain msgs) {
		VSSSApplicableDocuments oldApplicableDocumentsSection = applicableDocumentsSection;
		applicableDocumentsSection = newApplicableDocumentsSection;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, sssPackage.VSSS_DOCUMENT__APPLICABLE_DOCUMENTS_SECTION, oldApplicableDocumentsSection, newApplicableDocumentsSection);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setApplicableDocumentsSection(VSSSApplicableDocuments newApplicableDocumentsSection) {
		if (newApplicableDocumentsSection != applicableDocumentsSection) {
			NotificationChain msgs = null;
			if (applicableDocumentsSection != null)
				msgs = ((InternalEObject)applicableDocumentsSection).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - sssPackage.VSSS_DOCUMENT__APPLICABLE_DOCUMENTS_SECTION, null, msgs);
			if (newApplicableDocumentsSection != null)
				msgs = ((InternalEObject)newApplicableDocumentsSection).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - sssPackage.VSSS_DOCUMENT__APPLICABLE_DOCUMENTS_SECTION, null, msgs);
			msgs = basicSetApplicableDocumentsSection(newApplicableDocumentsSection, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, sssPackage.VSSS_DOCUMENT__APPLICABLE_DOCUMENTS_SECTION, newApplicableDocumentsSection, newApplicableDocumentsSection));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VSSSReferenceDocuments getReferenceDocumentsSection() {
		return referenceDocumentsSection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetReferenceDocumentsSection(VSSSReferenceDocuments newReferenceDocumentsSection, NotificationChain msgs) {
		VSSSReferenceDocuments oldReferenceDocumentsSection = referenceDocumentsSection;
		referenceDocumentsSection = newReferenceDocumentsSection;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, sssPackage.VSSS_DOCUMENT__REFERENCE_DOCUMENTS_SECTION, oldReferenceDocumentsSection, newReferenceDocumentsSection);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReferenceDocumentsSection(VSSSReferenceDocuments newReferenceDocumentsSection) {
		if (newReferenceDocumentsSection != referenceDocumentsSection) {
			NotificationChain msgs = null;
			if (referenceDocumentsSection != null)
				msgs = ((InternalEObject)referenceDocumentsSection).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - sssPackage.VSSS_DOCUMENT__REFERENCE_DOCUMENTS_SECTION, null, msgs);
			if (newReferenceDocumentsSection != null)
				msgs = ((InternalEObject)newReferenceDocumentsSection).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - sssPackage.VSSS_DOCUMENT__REFERENCE_DOCUMENTS_SECTION, null, msgs);
			msgs = basicSetReferenceDocumentsSection(newReferenceDocumentsSection, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, sssPackage.VSSS_DOCUMENT__REFERENCE_DOCUMENTS_SECTION, newReferenceDocumentsSection, newReferenceDocumentsSection));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VSSSTermsDefinitionsAbbreviations getTermsDefinitionsAbbreviationsSection() {
		return termsDefinitionsAbbreviationsSection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTermsDefinitionsAbbreviationsSection(VSSSTermsDefinitionsAbbreviations newTermsDefinitionsAbbreviationsSection, NotificationChain msgs) {
		VSSSTermsDefinitionsAbbreviations oldTermsDefinitionsAbbreviationsSection = termsDefinitionsAbbreviationsSection;
		termsDefinitionsAbbreviationsSection = newTermsDefinitionsAbbreviationsSection;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, sssPackage.VSSS_DOCUMENT__TERMS_DEFINITIONS_ABBREVIATIONS_SECTION, oldTermsDefinitionsAbbreviationsSection, newTermsDefinitionsAbbreviationsSection);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTermsDefinitionsAbbreviationsSection(VSSSTermsDefinitionsAbbreviations newTermsDefinitionsAbbreviationsSection) {
		if (newTermsDefinitionsAbbreviationsSection != termsDefinitionsAbbreviationsSection) {
			NotificationChain msgs = null;
			if (termsDefinitionsAbbreviationsSection != null)
				msgs = ((InternalEObject)termsDefinitionsAbbreviationsSection).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - sssPackage.VSSS_DOCUMENT__TERMS_DEFINITIONS_ABBREVIATIONS_SECTION, null, msgs);
			if (newTermsDefinitionsAbbreviationsSection != null)
				msgs = ((InternalEObject)newTermsDefinitionsAbbreviationsSection).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - sssPackage.VSSS_DOCUMENT__TERMS_DEFINITIONS_ABBREVIATIONS_SECTION, null, msgs);
			msgs = basicSetTermsDefinitionsAbbreviationsSection(newTermsDefinitionsAbbreviationsSection, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, sssPackage.VSSS_DOCUMENT__TERMS_DEFINITIONS_ABBREVIATIONS_SECTION, newTermsDefinitionsAbbreviationsSection, newTermsDefinitionsAbbreviationsSection));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VSSSGeneralDescription getGeneralDescriptionSection() {
		return generalDescriptionSection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGeneralDescriptionSection(VSSSGeneralDescription newGeneralDescriptionSection, NotificationChain msgs) {
		VSSSGeneralDescription oldGeneralDescriptionSection = generalDescriptionSection;
		generalDescriptionSection = newGeneralDescriptionSection;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, sssPackage.VSSS_DOCUMENT__GENERAL_DESCRIPTION_SECTION, oldGeneralDescriptionSection, newGeneralDescriptionSection);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGeneralDescriptionSection(VSSSGeneralDescription newGeneralDescriptionSection) {
		if (newGeneralDescriptionSection != generalDescriptionSection) {
			NotificationChain msgs = null;
			if (generalDescriptionSection != null)
				msgs = ((InternalEObject)generalDescriptionSection).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - sssPackage.VSSS_DOCUMENT__GENERAL_DESCRIPTION_SECTION, null, msgs);
			if (newGeneralDescriptionSection != null)
				msgs = ((InternalEObject)newGeneralDescriptionSection).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - sssPackage.VSSS_DOCUMENT__GENERAL_DESCRIPTION_SECTION, null, msgs);
			msgs = basicSetGeneralDescriptionSection(newGeneralDescriptionSection, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, sssPackage.VSSS_DOCUMENT__GENERAL_DESCRIPTION_SECTION, newGeneralDescriptionSection, newGeneralDescriptionSection));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VSSSSpecificRequirements getSpecificRequirementsSection() {
		return specificRequirementsSection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSpecificRequirementsSection(VSSSSpecificRequirements newSpecificRequirementsSection, NotificationChain msgs) {
		VSSSSpecificRequirements oldSpecificRequirementsSection = specificRequirementsSection;
		specificRequirementsSection = newSpecificRequirementsSection;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, sssPackage.VSSS_DOCUMENT__SPECIFIC_REQUIREMENTS_SECTION, oldSpecificRequirementsSection, newSpecificRequirementsSection);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSpecificRequirementsSection(VSSSSpecificRequirements newSpecificRequirementsSection) {
		if (newSpecificRequirementsSection != specificRequirementsSection) {
			NotificationChain msgs = null;
			if (specificRequirementsSection != null)
				msgs = ((InternalEObject)specificRequirementsSection).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - sssPackage.VSSS_DOCUMENT__SPECIFIC_REQUIREMENTS_SECTION, null, msgs);
			if (newSpecificRequirementsSection != null)
				msgs = ((InternalEObject)newSpecificRequirementsSection).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - sssPackage.VSSS_DOCUMENT__SPECIFIC_REQUIREMENTS_SECTION, null, msgs);
			msgs = basicSetSpecificRequirementsSection(newSpecificRequirementsSection, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, sssPackage.VSSS_DOCUMENT__SPECIFIC_REQUIREMENTS_SECTION, newSpecificRequirementsSection, newSpecificRequirementsSection));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VSSSVerificationValidationIntegrationRequirements getVerificationValidationIntegrationSection() {
		return verificationValidationIntegrationSection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetVerificationValidationIntegrationSection(VSSSVerificationValidationIntegrationRequirements newVerificationValidationIntegrationSection, NotificationChain msgs) {
		VSSSVerificationValidationIntegrationRequirements oldVerificationValidationIntegrationSection = verificationValidationIntegrationSection;
		verificationValidationIntegrationSection = newVerificationValidationIntegrationSection;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, sssPackage.VSSS_DOCUMENT__VERIFICATION_VALIDATION_INTEGRATION_SECTION, oldVerificationValidationIntegrationSection, newVerificationValidationIntegrationSection);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVerificationValidationIntegrationSection(VSSSVerificationValidationIntegrationRequirements newVerificationValidationIntegrationSection) {
		if (newVerificationValidationIntegrationSection != verificationValidationIntegrationSection) {
			NotificationChain msgs = null;
			if (verificationValidationIntegrationSection != null)
				msgs = ((InternalEObject)verificationValidationIntegrationSection).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - sssPackage.VSSS_DOCUMENT__VERIFICATION_VALIDATION_INTEGRATION_SECTION, null, msgs);
			if (newVerificationValidationIntegrationSection != null)
				msgs = ((InternalEObject)newVerificationValidationIntegrationSection).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - sssPackage.VSSS_DOCUMENT__VERIFICATION_VALIDATION_INTEGRATION_SECTION, null, msgs);
			msgs = basicSetVerificationValidationIntegrationSection(newVerificationValidationIntegrationSection, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, sssPackage.VSSS_DOCUMENT__VERIFICATION_VALIDATION_INTEGRATION_SECTION, newVerificationValidationIntegrationSection, newVerificationValidationIntegrationSection));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VSSSSystemModels getSystemModelsSection() {
		return systemModelsSection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSystemModelsSection(VSSSSystemModels newSystemModelsSection, NotificationChain msgs) {
		VSSSSystemModels oldSystemModelsSection = systemModelsSection;
		systemModelsSection = newSystemModelsSection;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, sssPackage.VSSS_DOCUMENT__SYSTEM_MODELS_SECTION, oldSystemModelsSection, newSystemModelsSection);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSystemModelsSection(VSSSSystemModels newSystemModelsSection) {
		if (newSystemModelsSection != systemModelsSection) {
			NotificationChain msgs = null;
			if (systemModelsSection != null)
				msgs = ((InternalEObject)systemModelsSection).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - sssPackage.VSSS_DOCUMENT__SYSTEM_MODELS_SECTION, null, msgs);
			if (newSystemModelsSection != null)
				msgs = ((InternalEObject)newSystemModelsSection).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - sssPackage.VSSS_DOCUMENT__SYSTEM_MODELS_SECTION, null, msgs);
			msgs = basicSetSystemModelsSection(newSystemModelsSection, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, sssPackage.VSSS_DOCUMENT__SYSTEM_MODELS_SECTION, newSystemModelsSection, newSystemModelsSection));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case sssPackage.VSSS_DOCUMENT__TBCS_TBDS_SECTION:
				return basicSetTbcsTbdsSection(null, msgs);
			case sssPackage.VSSS_DOCUMENT__INTRODUCTION_SECTION:
				return basicSetIntroductionSection(null, msgs);
			case sssPackage.VSSS_DOCUMENT__APPLICABLE_DOCUMENTS_SECTION:
				return basicSetApplicableDocumentsSection(null, msgs);
			case sssPackage.VSSS_DOCUMENT__REFERENCE_DOCUMENTS_SECTION:
				return basicSetReferenceDocumentsSection(null, msgs);
			case sssPackage.VSSS_DOCUMENT__TERMS_DEFINITIONS_ABBREVIATIONS_SECTION:
				return basicSetTermsDefinitionsAbbreviationsSection(null, msgs);
			case sssPackage.VSSS_DOCUMENT__GENERAL_DESCRIPTION_SECTION:
				return basicSetGeneralDescriptionSection(null, msgs);
			case sssPackage.VSSS_DOCUMENT__SPECIFIC_REQUIREMENTS_SECTION:
				return basicSetSpecificRequirementsSection(null, msgs);
			case sssPackage.VSSS_DOCUMENT__VERIFICATION_VALIDATION_INTEGRATION_SECTION:
				return basicSetVerificationValidationIntegrationSection(null, msgs);
			case sssPackage.VSSS_DOCUMENT__SYSTEM_MODELS_SECTION:
				return basicSetSystemModelsSection(null, msgs);
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
			case sssPackage.VSSS_DOCUMENT__NAME:
				return getName();
			case sssPackage.VSSS_DOCUMENT__ID:
				return getId();
			case sssPackage.VSSS_DOCUMENT__ISSUE:
				return getIssue();
			case sssPackage.VSSS_DOCUMENT__REVISION:
				return getRevision();
			case sssPackage.VSSS_DOCUMENT__DATE:
				return getDate();
			case sssPackage.VSSS_DOCUMENT__TBCS:
				return getTbcs();
			case sssPackage.VSSS_DOCUMENT__TBDS:
				return getTbds();
			case sssPackage.VSSS_DOCUMENT__APPLICABLE_DOCUMENTS:
				return getApplicableDocuments();
			case sssPackage.VSSS_DOCUMENT__REFERENCE_DOCUMENTS:
				return getReferenceDocuments();
			case sssPackage.VSSS_DOCUMENT__FIGURES:
				return getFigures();
			case sssPackage.VSSS_DOCUMENT__TABLES:
				return getTables();
			case sssPackage.VSSS_DOCUMENT__SECTIONS:
				return getSections();
			case sssPackage.VSSS_DOCUMENT__PARAGRAPHS:
				return getParagraphs();
			case sssPackage.VSSS_DOCUMENT__TBCS_TBDS_SECTION:
				return getTbcsTbdsSection();
			case sssPackage.VSSS_DOCUMENT__INTRODUCTION_SECTION:
				return getIntroductionSection();
			case sssPackage.VSSS_DOCUMENT__APPLICABLE_DOCUMENTS_SECTION:
				return getApplicableDocumentsSection();
			case sssPackage.VSSS_DOCUMENT__REFERENCE_DOCUMENTS_SECTION:
				return getReferenceDocumentsSection();
			case sssPackage.VSSS_DOCUMENT__TERMS_DEFINITIONS_ABBREVIATIONS_SECTION:
				return getTermsDefinitionsAbbreviationsSection();
			case sssPackage.VSSS_DOCUMENT__GENERAL_DESCRIPTION_SECTION:
				return getGeneralDescriptionSection();
			case sssPackage.VSSS_DOCUMENT__SPECIFIC_REQUIREMENTS_SECTION:
				return getSpecificRequirementsSection();
			case sssPackage.VSSS_DOCUMENT__VERIFICATION_VALIDATION_INTEGRATION_SECTION:
				return getVerificationValidationIntegrationSection();
			case sssPackage.VSSS_DOCUMENT__SYSTEM_MODELS_SECTION:
				return getSystemModelsSection();
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
			case sssPackage.VSSS_DOCUMENT__NAME:
				setName((String)newValue);
				return;
			case sssPackage.VSSS_DOCUMENT__ID:
				setId((String)newValue);
				return;
			case sssPackage.VSSS_DOCUMENT__ISSUE:
				setIssue((String)newValue);
				return;
			case sssPackage.VSSS_DOCUMENT__REVISION:
				setRevision((String)newValue);
				return;
			case sssPackage.VSSS_DOCUMENT__DATE:
				setDate((String)newValue);
				return;
			case sssPackage.VSSS_DOCUMENT__TBCS:
				getTbcs().clear();
				getTbcs().addAll((Collection<? extends DTBC>)newValue);
				return;
			case sssPackage.VSSS_DOCUMENT__TBDS:
				getTbds().clear();
				getTbds().addAll((Collection<? extends DTBD>)newValue);
				return;
			case sssPackage.VSSS_DOCUMENT__APPLICABLE_DOCUMENTS:
				getApplicableDocuments().clear();
				getApplicableDocuments().addAll((Collection<? extends DApplicableDocument>)newValue);
				return;
			case sssPackage.VSSS_DOCUMENT__REFERENCE_DOCUMENTS:
				getReferenceDocuments().clear();
				getReferenceDocuments().addAll((Collection<? extends DReferenceDocument>)newValue);
				return;
			case sssPackage.VSSS_DOCUMENT__FIGURES:
				getFigures().clear();
				getFigures().addAll((Collection<? extends DAbstractFigure>)newValue);
				return;
			case sssPackage.VSSS_DOCUMENT__TABLES:
				getTables().clear();
				getTables().addAll((Collection<? extends DAbstractTable>)newValue);
				return;
			case sssPackage.VSSS_DOCUMENT__SECTIONS:
				getSections().clear();
				getSections().addAll((Collection<? extends DAbstractSection>)newValue);
				return;
			case sssPackage.VSSS_DOCUMENT__PARAGRAPHS:
				getParagraphs().clear();
				getParagraphs().addAll((Collection<? extends DParagraph>)newValue);
				return;
			case sssPackage.VSSS_DOCUMENT__TBCS_TBDS_SECTION:
				setTbcsTbdsSection((VSSSTBCsTBDs)newValue);
				return;
			case sssPackage.VSSS_DOCUMENT__INTRODUCTION_SECTION:
				setIntroductionSection((VSSSIntroduction)newValue);
				return;
			case sssPackage.VSSS_DOCUMENT__APPLICABLE_DOCUMENTS_SECTION:
				setApplicableDocumentsSection((VSSSApplicableDocuments)newValue);
				return;
			case sssPackage.VSSS_DOCUMENT__REFERENCE_DOCUMENTS_SECTION:
				setReferenceDocumentsSection((VSSSReferenceDocuments)newValue);
				return;
			case sssPackage.VSSS_DOCUMENT__TERMS_DEFINITIONS_ABBREVIATIONS_SECTION:
				setTermsDefinitionsAbbreviationsSection((VSSSTermsDefinitionsAbbreviations)newValue);
				return;
			case sssPackage.VSSS_DOCUMENT__GENERAL_DESCRIPTION_SECTION:
				setGeneralDescriptionSection((VSSSGeneralDescription)newValue);
				return;
			case sssPackage.VSSS_DOCUMENT__SPECIFIC_REQUIREMENTS_SECTION:
				setSpecificRequirementsSection((VSSSSpecificRequirements)newValue);
				return;
			case sssPackage.VSSS_DOCUMENT__VERIFICATION_VALIDATION_INTEGRATION_SECTION:
				setVerificationValidationIntegrationSection((VSSSVerificationValidationIntegrationRequirements)newValue);
				return;
			case sssPackage.VSSS_DOCUMENT__SYSTEM_MODELS_SECTION:
				setSystemModelsSection((VSSSSystemModels)newValue);
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
			case sssPackage.VSSS_DOCUMENT__NAME:
				setName(NAME_EDEFAULT);
				return;
			case sssPackage.VSSS_DOCUMENT__ID:
				setId(ID_EDEFAULT);
				return;
			case sssPackage.VSSS_DOCUMENT__ISSUE:
				setIssue(ISSUE_EDEFAULT);
				return;
			case sssPackage.VSSS_DOCUMENT__REVISION:
				setRevision(REVISION_EDEFAULT);
				return;
			case sssPackage.VSSS_DOCUMENT__DATE:
				setDate(DATE_EDEFAULT);
				return;
			case sssPackage.VSSS_DOCUMENT__TBCS:
				getTbcs().clear();
				return;
			case sssPackage.VSSS_DOCUMENT__TBDS:
				getTbds().clear();
				return;
			case sssPackage.VSSS_DOCUMENT__APPLICABLE_DOCUMENTS:
				getApplicableDocuments().clear();
				return;
			case sssPackage.VSSS_DOCUMENT__REFERENCE_DOCUMENTS:
				getReferenceDocuments().clear();
				return;
			case sssPackage.VSSS_DOCUMENT__FIGURES:
				getFigures().clear();
				return;
			case sssPackage.VSSS_DOCUMENT__TABLES:
				getTables().clear();
				return;
			case sssPackage.VSSS_DOCUMENT__SECTIONS:
				getSections().clear();
				return;
			case sssPackage.VSSS_DOCUMENT__PARAGRAPHS:
				getParagraphs().clear();
				return;
			case sssPackage.VSSS_DOCUMENT__TBCS_TBDS_SECTION:
				setTbcsTbdsSection((VSSSTBCsTBDs)null);
				return;
			case sssPackage.VSSS_DOCUMENT__INTRODUCTION_SECTION:
				setIntroductionSection((VSSSIntroduction)null);
				return;
			case sssPackage.VSSS_DOCUMENT__APPLICABLE_DOCUMENTS_SECTION:
				setApplicableDocumentsSection((VSSSApplicableDocuments)null);
				return;
			case sssPackage.VSSS_DOCUMENT__REFERENCE_DOCUMENTS_SECTION:
				setReferenceDocumentsSection((VSSSReferenceDocuments)null);
				return;
			case sssPackage.VSSS_DOCUMENT__TERMS_DEFINITIONS_ABBREVIATIONS_SECTION:
				setTermsDefinitionsAbbreviationsSection((VSSSTermsDefinitionsAbbreviations)null);
				return;
			case sssPackage.VSSS_DOCUMENT__GENERAL_DESCRIPTION_SECTION:
				setGeneralDescriptionSection((VSSSGeneralDescription)null);
				return;
			case sssPackage.VSSS_DOCUMENT__SPECIFIC_REQUIREMENTS_SECTION:
				setSpecificRequirementsSection((VSSSSpecificRequirements)null);
				return;
			case sssPackage.VSSS_DOCUMENT__VERIFICATION_VALIDATION_INTEGRATION_SECTION:
				setVerificationValidationIntegrationSection((VSSSVerificationValidationIntegrationRequirements)null);
				return;
			case sssPackage.VSSS_DOCUMENT__SYSTEM_MODELS_SECTION:
				setSystemModelsSection((VSSSSystemModels)null);
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
			case sssPackage.VSSS_DOCUMENT__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case sssPackage.VSSS_DOCUMENT__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case sssPackage.VSSS_DOCUMENT__ISSUE:
				return ISSUE_EDEFAULT == null ? issue != null : !ISSUE_EDEFAULT.equals(issue);
			case sssPackage.VSSS_DOCUMENT__REVISION:
				return REVISION_EDEFAULT == null ? revision != null : !REVISION_EDEFAULT.equals(revision);
			case sssPackage.VSSS_DOCUMENT__DATE:
				return DATE_EDEFAULT == null ? date != null : !DATE_EDEFAULT.equals(date);
			case sssPackage.VSSS_DOCUMENT__TBCS:
				return !getTbcs().isEmpty();
			case sssPackage.VSSS_DOCUMENT__TBDS:
				return !getTbds().isEmpty();
			case sssPackage.VSSS_DOCUMENT__APPLICABLE_DOCUMENTS:
				return !getApplicableDocuments().isEmpty();
			case sssPackage.VSSS_DOCUMENT__REFERENCE_DOCUMENTS:
				return !getReferenceDocuments().isEmpty();
			case sssPackage.VSSS_DOCUMENT__FIGURES:
				return !getFigures().isEmpty();
			case sssPackage.VSSS_DOCUMENT__TABLES:
				return !getTables().isEmpty();
			case sssPackage.VSSS_DOCUMENT__SECTIONS:
				return !getSections().isEmpty();
			case sssPackage.VSSS_DOCUMENT__PARAGRAPHS:
				return !getParagraphs().isEmpty();
			case sssPackage.VSSS_DOCUMENT__TBCS_TBDS_SECTION:
				return tbcsTbdsSection != null;
			case sssPackage.VSSS_DOCUMENT__INTRODUCTION_SECTION:
				return introductionSection != null;
			case sssPackage.VSSS_DOCUMENT__APPLICABLE_DOCUMENTS_SECTION:
				return applicableDocumentsSection != null;
			case sssPackage.VSSS_DOCUMENT__REFERENCE_DOCUMENTS_SECTION:
				return referenceDocumentsSection != null;
			case sssPackage.VSSS_DOCUMENT__TERMS_DEFINITIONS_ABBREVIATIONS_SECTION:
				return termsDefinitionsAbbreviationsSection != null;
			case sssPackage.VSSS_DOCUMENT__GENERAL_DESCRIPTION_SECTION:
				return generalDescriptionSection != null;
			case sssPackage.VSSS_DOCUMENT__SPECIFIC_REQUIREMENTS_SECTION:
				return specificRequirementsSection != null;
			case sssPackage.VSSS_DOCUMENT__VERIFICATION_VALIDATION_INTEGRATION_SECTION:
				return verificationValidationIntegrationSection != null;
			case sssPackage.VSSS_DOCUMENT__SYSTEM_MODELS_SECTION:
				return systemModelsSection != null;
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
				case sssPackage.VSSS_DOCUMENT__NAME: return doctplPackage.DDOCUMENT_TEMPLATE__NAME;
				case sssPackage.VSSS_DOCUMENT__ID: return doctplPackage.DDOCUMENT_TEMPLATE__ID;
				case sssPackage.VSSS_DOCUMENT__ISSUE: return doctplPackage.DDOCUMENT_TEMPLATE__ISSUE;
				case sssPackage.VSSS_DOCUMENT__REVISION: return doctplPackage.DDOCUMENT_TEMPLATE__REVISION;
				case sssPackage.VSSS_DOCUMENT__DATE: return doctplPackage.DDOCUMENT_TEMPLATE__DATE;
				case sssPackage.VSSS_DOCUMENT__TBCS: return doctplPackage.DDOCUMENT_TEMPLATE__TBCS;
				case sssPackage.VSSS_DOCUMENT__TBDS: return doctplPackage.DDOCUMENT_TEMPLATE__TBDS;
				case sssPackage.VSSS_DOCUMENT__APPLICABLE_DOCUMENTS: return doctplPackage.DDOCUMENT_TEMPLATE__APPLICABLE_DOCUMENTS;
				case sssPackage.VSSS_DOCUMENT__REFERENCE_DOCUMENTS: return doctplPackage.DDOCUMENT_TEMPLATE__REFERENCE_DOCUMENTS;
				case sssPackage.VSSS_DOCUMENT__FIGURES: return doctplPackage.DDOCUMENT_TEMPLATE__FIGURES;
				case sssPackage.VSSS_DOCUMENT__TABLES: return doctplPackage.DDOCUMENT_TEMPLATE__TABLES;
				case sssPackage.VSSS_DOCUMENT__SECTIONS: return doctplPackage.DDOCUMENT_TEMPLATE__SECTIONS;
				case sssPackage.VSSS_DOCUMENT__PARAGRAPHS: return doctplPackage.DDOCUMENT_TEMPLATE__PARAGRAPHS;
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
				case doctplPackage.DDOCUMENT_TEMPLATE__NAME: return sssPackage.VSSS_DOCUMENT__NAME;
				case doctplPackage.DDOCUMENT_TEMPLATE__ID: return sssPackage.VSSS_DOCUMENT__ID;
				case doctplPackage.DDOCUMENT_TEMPLATE__ISSUE: return sssPackage.VSSS_DOCUMENT__ISSUE;
				case doctplPackage.DDOCUMENT_TEMPLATE__REVISION: return sssPackage.VSSS_DOCUMENT__REVISION;
				case doctplPackage.DDOCUMENT_TEMPLATE__DATE: return sssPackage.VSSS_DOCUMENT__DATE;
				case doctplPackage.DDOCUMENT_TEMPLATE__TBCS: return sssPackage.VSSS_DOCUMENT__TBCS;
				case doctplPackage.DDOCUMENT_TEMPLATE__TBDS: return sssPackage.VSSS_DOCUMENT__TBDS;
				case doctplPackage.DDOCUMENT_TEMPLATE__APPLICABLE_DOCUMENTS: return sssPackage.VSSS_DOCUMENT__APPLICABLE_DOCUMENTS;
				case doctplPackage.DDOCUMENT_TEMPLATE__REFERENCE_DOCUMENTS: return sssPackage.VSSS_DOCUMENT__REFERENCE_DOCUMENTS;
				case doctplPackage.DDOCUMENT_TEMPLATE__FIGURES: return sssPackage.VSSS_DOCUMENT__FIGURES;
				case doctplPackage.DDOCUMENT_TEMPLATE__TABLES: return sssPackage.VSSS_DOCUMENT__TABLES;
				case doctplPackage.DDOCUMENT_TEMPLATE__SECTIONS: return sssPackage.VSSS_DOCUMENT__SECTIONS;
				case doctplPackage.DDOCUMENT_TEMPLATE__PARAGRAPHS: return sssPackage.VSSS_DOCUMENT__PARAGRAPHS;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(", id: ");
		result.append(id);
		result.append(", issue: ");
		result.append(issue);
		result.append(", revision: ");
		result.append(revision);
		result.append(", date: ");
		result.append(date);
		result.append(')');
		return result.toString();
	}

} //VSSSDocumentImpl
