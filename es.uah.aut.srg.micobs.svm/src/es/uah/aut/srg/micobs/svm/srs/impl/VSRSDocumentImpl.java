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
import es.uah.aut.srg.micobs.svm.srs.VSRSApplicableDocuments;
import es.uah.aut.srg.micobs.svm.srs.VSRSDocument;
import es.uah.aut.srg.micobs.svm.srs.VSRSIntroduction;
import es.uah.aut.srg.micobs.svm.srs.VSRSLogicalModels;
import es.uah.aut.srg.micobs.svm.srs.VSRSReferenceDocuments;
import es.uah.aut.srg.micobs.svm.srs.VSRSRequirements;
import es.uah.aut.srg.micobs.svm.srs.VSRSSoftwareOverview;
import es.uah.aut.srg.micobs.svm.srs.VSRSTBCsTBDs;
import es.uah.aut.srg.micobs.svm.srs.VSRSTermsDefinitionsAbbreviations;
import es.uah.aut.srg.micobs.svm.srs.srsPackage;
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
 * An implementation of the model object '<em><b>VSRS Document</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link es.uah.aut.srg.micobs.svm.srs.impl.VSRSDocumentImpl#getName <em>Name</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.svm.srs.impl.VSRSDocumentImpl#getId <em>Id</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.svm.srs.impl.VSRSDocumentImpl#getIssue <em>Issue</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.svm.srs.impl.VSRSDocumentImpl#getRevision <em>Revision</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.svm.srs.impl.VSRSDocumentImpl#getDate <em>Date</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.svm.srs.impl.VSRSDocumentImpl#getTbcs <em>Tbcs</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.svm.srs.impl.VSRSDocumentImpl#getTbds <em>Tbds</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.svm.srs.impl.VSRSDocumentImpl#getApplicableDocuments <em>Applicable Documents</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.svm.srs.impl.VSRSDocumentImpl#getReferenceDocuments <em>Reference Documents</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.svm.srs.impl.VSRSDocumentImpl#getFigures <em>Figures</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.svm.srs.impl.VSRSDocumentImpl#getTables <em>Tables</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.svm.srs.impl.VSRSDocumentImpl#getSections <em>Sections</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.svm.srs.impl.VSRSDocumentImpl#getParagraphs <em>Paragraphs</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.svm.srs.impl.VSRSDocumentImpl#getTbcsTbdsSection <em>Tbcs Tbds Section</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.svm.srs.impl.VSRSDocumentImpl#getIntroductionSection <em>Introduction Section</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.svm.srs.impl.VSRSDocumentImpl#getApplicableDocumentsSection <em>Applicable Documents Section</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.svm.srs.impl.VSRSDocumentImpl#getReferenceDocumentsSection <em>Reference Documents Section</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.svm.srs.impl.VSRSDocumentImpl#getTermsDefinitionsAbbreviationsSection <em>Terms Definitions Abbreviations Section</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.svm.srs.impl.VSRSDocumentImpl#getSoftwareOverviewSection <em>Software Overview Section</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.svm.srs.impl.VSRSDocumentImpl#getRequirementsSection <em>Requirements Section</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.svm.srs.impl.VSRSDocumentImpl#getLogicalModelsSection <em>Logical Models Section</em>}</li>
 * </ul>
 *
 * @generated
 */
public class VSRSDocumentImpl extends VTraceableDocumentImpl implements VSRSDocument {
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
	protected VSRSTBCsTBDs tbcsTbdsSection;

	/**
	 * The cached value of the '{@link #getIntroductionSection() <em>Introduction Section</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIntroductionSection()
	 * @generated
	 * @ordered
	 */
	protected VSRSIntroduction introductionSection;

	/**
	 * The cached value of the '{@link #getApplicableDocumentsSection() <em>Applicable Documents Section</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getApplicableDocumentsSection()
	 * @generated
	 * @ordered
	 */
	protected VSRSApplicableDocuments applicableDocumentsSection;

	/**
	 * The cached value of the '{@link #getReferenceDocumentsSection() <em>Reference Documents Section</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReferenceDocumentsSection()
	 * @generated
	 * @ordered
	 */
	protected VSRSReferenceDocuments referenceDocumentsSection;

	/**
	 * The cached value of the '{@link #getTermsDefinitionsAbbreviationsSection() <em>Terms Definitions Abbreviations Section</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTermsDefinitionsAbbreviationsSection()
	 * @generated
	 * @ordered
	 */
	protected VSRSTermsDefinitionsAbbreviations termsDefinitionsAbbreviationsSection;

	/**
	 * The cached value of the '{@link #getSoftwareOverviewSection() <em>Software Overview Section</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSoftwareOverviewSection()
	 * @generated
	 * @ordered
	 */
	protected VSRSSoftwareOverview softwareOverviewSection;

	/**
	 * The cached value of the '{@link #getRequirementsSection() <em>Requirements Section</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequirementsSection()
	 * @generated
	 * @ordered
	 */
	protected VSRSRequirements requirementsSection;

	/**
	 * The cached value of the '{@link #getLogicalModelsSection() <em>Logical Models Section</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLogicalModelsSection()
	 * @generated
	 * @ordered
	 */
	protected VSRSLogicalModels logicalModelsSection;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VSRSDocumentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return srsPackage.Literals.VSRS_DOCUMENT;
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
			eNotify(new ENotificationImpl(this, Notification.SET, srsPackage.VSRS_DOCUMENT__NAME, oldName, name));
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
			eNotify(new ENotificationImpl(this, Notification.SET, srsPackage.VSRS_DOCUMENT__ID, oldId, id));
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
			eNotify(new ENotificationImpl(this, Notification.SET, srsPackage.VSRS_DOCUMENT__ISSUE, oldIssue, issue));
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
			eNotify(new ENotificationImpl(this, Notification.SET, srsPackage.VSRS_DOCUMENT__REVISION, oldRevision, revision));
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
			eNotify(new ENotificationImpl(this, Notification.SET, srsPackage.VSRS_DOCUMENT__DATE, oldDate, date));
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
		objects.addAll(getSoftwareOverviewSection().getReferenceableObjects(ReferenceableObjectType));
		objects.addAll(getRequirementsSection().getReferenceableObjects(ReferenceableObjectType));
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

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VSRSTBCsTBDs getTbcsTbdsSection() {
		return tbcsTbdsSection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTbcsTbdsSection(VSRSTBCsTBDs newTbcsTbdsSection, NotificationChain msgs) {
		VSRSTBCsTBDs oldTbcsTbdsSection = tbcsTbdsSection;
		tbcsTbdsSection = newTbcsTbdsSection;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, srsPackage.VSRS_DOCUMENT__TBCS_TBDS_SECTION, oldTbcsTbdsSection, newTbcsTbdsSection);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTbcsTbdsSection(VSRSTBCsTBDs newTbcsTbdsSection) {
		if (newTbcsTbdsSection != tbcsTbdsSection) {
			NotificationChain msgs = null;
			if (tbcsTbdsSection != null)
				msgs = ((InternalEObject)tbcsTbdsSection).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - srsPackage.VSRS_DOCUMENT__TBCS_TBDS_SECTION, null, msgs);
			if (newTbcsTbdsSection != null)
				msgs = ((InternalEObject)newTbcsTbdsSection).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - srsPackage.VSRS_DOCUMENT__TBCS_TBDS_SECTION, null, msgs);
			msgs = basicSetTbcsTbdsSection(newTbcsTbdsSection, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, srsPackage.VSRS_DOCUMENT__TBCS_TBDS_SECTION, newTbcsTbdsSection, newTbcsTbdsSection));
	}

	@Override
	public EList<DAbstractSection> getSections() {
		EList<DAbstractSection> sections = new BasicEList<DAbstractSection>();
		sections.add((DAbstractSection) getIntroductionSection());
		sections.add((DAbstractSection) getApplicableDocumentsSection());
		sections.add((DAbstractSection) getReferenceDocumentsSection());
		sections.add((DAbstractSection) getTermsDefinitionsAbbreviationsSection());
		sections.add((DAbstractSection) getSoftwareOverviewSection());
		sections.add((DAbstractSection) getRequirementsSection());
		sections.add((DAbstractSection) getLogicalModelsSection());
		return sections;
	}
	
	@Override
	public EList<VTraceableDocumentAbstractGroup> getGroups() {
		EList<VTraceableDocumentAbstractGroup> groups = new BasicEList<VTraceableDocumentAbstractGroup>();
		groups.add((VTraceableDocumentAbstractGroup) getRequirementsSection().getGeneral());
		groups.add((VTraceableDocumentAbstractGroup) getRequirementsSection().getFunctional());
		groups.add((VTraceableDocumentAbstractGroup) getRequirementsSection().getPerformance());
		groups.add((VTraceableDocumentAbstractGroup) getRequirementsSection().getInterface());
		groups.add((VTraceableDocumentAbstractGroup) getRequirementsSection().getOperational());
		groups.add((VTraceableDocumentAbstractGroup) getRequirementsSection().getResources());
		groups.add((VTraceableDocumentAbstractGroup) getRequirementsSection().getDesign());
		groups.add((VTraceableDocumentAbstractGroup) getRequirementsSection().getSecurityPrivacy());
		groups.add((VTraceableDocumentAbstractGroup) getRequirementsSection().getPortability());
		groups.add((VTraceableDocumentAbstractGroup) getRequirementsSection().getSwQuality());
		groups.add((VTraceableDocumentAbstractGroup) getRequirementsSection().getSwReliability());
		groups.add((VTraceableDocumentAbstractGroup) getRequirementsSection().getSwMaintainability());
		groups.add((VTraceableDocumentAbstractGroup) getRequirementsSection().getSwSafety());
		groups.add((VTraceableDocumentAbstractGroup) getRequirementsSection().getSwConfigurationDelivery());
		groups.add((VTraceableDocumentAbstractGroup) getRequirementsSection().getDataDefinitionDB());
		groups.add((VTraceableDocumentAbstractGroup) getRequirementsSection().getHumanFactors());
		groups.add((VTraceableDocumentAbstractGroup) getRequirementsSection().getAdaptationInstallation());
		return groups;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VSRSIntroduction getIntroductionSection() {
		return introductionSection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIntroductionSection(VSRSIntroduction newIntroductionSection, NotificationChain msgs) {
		VSRSIntroduction oldIntroductionSection = introductionSection;
		introductionSection = newIntroductionSection;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, srsPackage.VSRS_DOCUMENT__INTRODUCTION_SECTION, oldIntroductionSection, newIntroductionSection);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIntroductionSection(VSRSIntroduction newIntroductionSection) {
		if (newIntroductionSection != introductionSection) {
			NotificationChain msgs = null;
			if (introductionSection != null)
				msgs = ((InternalEObject)introductionSection).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - srsPackage.VSRS_DOCUMENT__INTRODUCTION_SECTION, null, msgs);
			if (newIntroductionSection != null)
				msgs = ((InternalEObject)newIntroductionSection).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - srsPackage.VSRS_DOCUMENT__INTRODUCTION_SECTION, null, msgs);
			msgs = basicSetIntroductionSection(newIntroductionSection, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, srsPackage.VSRS_DOCUMENT__INTRODUCTION_SECTION, newIntroductionSection, newIntroductionSection));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VSRSApplicableDocuments getApplicableDocumentsSection() {
		return applicableDocumentsSection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetApplicableDocumentsSection(VSRSApplicableDocuments newApplicableDocumentsSection, NotificationChain msgs) {
		VSRSApplicableDocuments oldApplicableDocumentsSection = applicableDocumentsSection;
		applicableDocumentsSection = newApplicableDocumentsSection;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, srsPackage.VSRS_DOCUMENT__APPLICABLE_DOCUMENTS_SECTION, oldApplicableDocumentsSection, newApplicableDocumentsSection);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setApplicableDocumentsSection(VSRSApplicableDocuments newApplicableDocumentsSection) {
		if (newApplicableDocumentsSection != applicableDocumentsSection) {
			NotificationChain msgs = null;
			if (applicableDocumentsSection != null)
				msgs = ((InternalEObject)applicableDocumentsSection).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - srsPackage.VSRS_DOCUMENT__APPLICABLE_DOCUMENTS_SECTION, null, msgs);
			if (newApplicableDocumentsSection != null)
				msgs = ((InternalEObject)newApplicableDocumentsSection).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - srsPackage.VSRS_DOCUMENT__APPLICABLE_DOCUMENTS_SECTION, null, msgs);
			msgs = basicSetApplicableDocumentsSection(newApplicableDocumentsSection, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, srsPackage.VSRS_DOCUMENT__APPLICABLE_DOCUMENTS_SECTION, newApplicableDocumentsSection, newApplicableDocumentsSection));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VSRSReferenceDocuments getReferenceDocumentsSection() {
		return referenceDocumentsSection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetReferenceDocumentsSection(VSRSReferenceDocuments newReferenceDocumentsSection, NotificationChain msgs) {
		VSRSReferenceDocuments oldReferenceDocumentsSection = referenceDocumentsSection;
		referenceDocumentsSection = newReferenceDocumentsSection;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, srsPackage.VSRS_DOCUMENT__REFERENCE_DOCUMENTS_SECTION, oldReferenceDocumentsSection, newReferenceDocumentsSection);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReferenceDocumentsSection(VSRSReferenceDocuments newReferenceDocumentsSection) {
		if (newReferenceDocumentsSection != referenceDocumentsSection) {
			NotificationChain msgs = null;
			if (referenceDocumentsSection != null)
				msgs = ((InternalEObject)referenceDocumentsSection).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - srsPackage.VSRS_DOCUMENT__REFERENCE_DOCUMENTS_SECTION, null, msgs);
			if (newReferenceDocumentsSection != null)
				msgs = ((InternalEObject)newReferenceDocumentsSection).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - srsPackage.VSRS_DOCUMENT__REFERENCE_DOCUMENTS_SECTION, null, msgs);
			msgs = basicSetReferenceDocumentsSection(newReferenceDocumentsSection, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, srsPackage.VSRS_DOCUMENT__REFERENCE_DOCUMENTS_SECTION, newReferenceDocumentsSection, newReferenceDocumentsSection));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VSRSTermsDefinitionsAbbreviations getTermsDefinitionsAbbreviationsSection() {
		return termsDefinitionsAbbreviationsSection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTermsDefinitionsAbbreviationsSection(VSRSTermsDefinitionsAbbreviations newTermsDefinitionsAbbreviationsSection, NotificationChain msgs) {
		VSRSTermsDefinitionsAbbreviations oldTermsDefinitionsAbbreviationsSection = termsDefinitionsAbbreviationsSection;
		termsDefinitionsAbbreviationsSection = newTermsDefinitionsAbbreviationsSection;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, srsPackage.VSRS_DOCUMENT__TERMS_DEFINITIONS_ABBREVIATIONS_SECTION, oldTermsDefinitionsAbbreviationsSection, newTermsDefinitionsAbbreviationsSection);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTermsDefinitionsAbbreviationsSection(VSRSTermsDefinitionsAbbreviations newTermsDefinitionsAbbreviationsSection) {
		if (newTermsDefinitionsAbbreviationsSection != termsDefinitionsAbbreviationsSection) {
			NotificationChain msgs = null;
			if (termsDefinitionsAbbreviationsSection != null)
				msgs = ((InternalEObject)termsDefinitionsAbbreviationsSection).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - srsPackage.VSRS_DOCUMENT__TERMS_DEFINITIONS_ABBREVIATIONS_SECTION, null, msgs);
			if (newTermsDefinitionsAbbreviationsSection != null)
				msgs = ((InternalEObject)newTermsDefinitionsAbbreviationsSection).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - srsPackage.VSRS_DOCUMENT__TERMS_DEFINITIONS_ABBREVIATIONS_SECTION, null, msgs);
			msgs = basicSetTermsDefinitionsAbbreviationsSection(newTermsDefinitionsAbbreviationsSection, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, srsPackage.VSRS_DOCUMENT__TERMS_DEFINITIONS_ABBREVIATIONS_SECTION, newTermsDefinitionsAbbreviationsSection, newTermsDefinitionsAbbreviationsSection));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VSRSSoftwareOverview getSoftwareOverviewSection() {
		return softwareOverviewSection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSoftwareOverviewSection(VSRSSoftwareOverview newSoftwareOverviewSection, NotificationChain msgs) {
		VSRSSoftwareOverview oldSoftwareOverviewSection = softwareOverviewSection;
		softwareOverviewSection = newSoftwareOverviewSection;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, srsPackage.VSRS_DOCUMENT__SOFTWARE_OVERVIEW_SECTION, oldSoftwareOverviewSection, newSoftwareOverviewSection);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSoftwareOverviewSection(VSRSSoftwareOverview newSoftwareOverviewSection) {
		if (newSoftwareOverviewSection != softwareOverviewSection) {
			NotificationChain msgs = null;
			if (softwareOverviewSection != null)
				msgs = ((InternalEObject)softwareOverviewSection).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - srsPackage.VSRS_DOCUMENT__SOFTWARE_OVERVIEW_SECTION, null, msgs);
			if (newSoftwareOverviewSection != null)
				msgs = ((InternalEObject)newSoftwareOverviewSection).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - srsPackage.VSRS_DOCUMENT__SOFTWARE_OVERVIEW_SECTION, null, msgs);
			msgs = basicSetSoftwareOverviewSection(newSoftwareOverviewSection, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, srsPackage.VSRS_DOCUMENT__SOFTWARE_OVERVIEW_SECTION, newSoftwareOverviewSection, newSoftwareOverviewSection));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VSRSRequirements getRequirementsSection() {
		return requirementsSection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRequirementsSection(VSRSRequirements newRequirementsSection, NotificationChain msgs) {
		VSRSRequirements oldRequirementsSection = requirementsSection;
		requirementsSection = newRequirementsSection;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, srsPackage.VSRS_DOCUMENT__REQUIREMENTS_SECTION, oldRequirementsSection, newRequirementsSection);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRequirementsSection(VSRSRequirements newRequirementsSection) {
		if (newRequirementsSection != requirementsSection) {
			NotificationChain msgs = null;
			if (requirementsSection != null)
				msgs = ((InternalEObject)requirementsSection).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - srsPackage.VSRS_DOCUMENT__REQUIREMENTS_SECTION, null, msgs);
			if (newRequirementsSection != null)
				msgs = ((InternalEObject)newRequirementsSection).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - srsPackage.VSRS_DOCUMENT__REQUIREMENTS_SECTION, null, msgs);
			msgs = basicSetRequirementsSection(newRequirementsSection, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, srsPackage.VSRS_DOCUMENT__REQUIREMENTS_SECTION, newRequirementsSection, newRequirementsSection));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VSRSLogicalModels getLogicalModelsSection() {
		return logicalModelsSection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLogicalModelsSection(VSRSLogicalModels newLogicalModelsSection, NotificationChain msgs) {
		VSRSLogicalModels oldLogicalModelsSection = logicalModelsSection;
		logicalModelsSection = newLogicalModelsSection;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, srsPackage.VSRS_DOCUMENT__LOGICAL_MODELS_SECTION, oldLogicalModelsSection, newLogicalModelsSection);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLogicalModelsSection(VSRSLogicalModels newLogicalModelsSection) {
		if (newLogicalModelsSection != logicalModelsSection) {
			NotificationChain msgs = null;
			if (logicalModelsSection != null)
				msgs = ((InternalEObject)logicalModelsSection).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - srsPackage.VSRS_DOCUMENT__LOGICAL_MODELS_SECTION, null, msgs);
			if (newLogicalModelsSection != null)
				msgs = ((InternalEObject)newLogicalModelsSection).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - srsPackage.VSRS_DOCUMENT__LOGICAL_MODELS_SECTION, null, msgs);
			msgs = basicSetLogicalModelsSection(newLogicalModelsSection, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, srsPackage.VSRS_DOCUMENT__LOGICAL_MODELS_SECTION, newLogicalModelsSection, newLogicalModelsSection));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case srsPackage.VSRS_DOCUMENT__TBCS_TBDS_SECTION:
				return basicSetTbcsTbdsSection(null, msgs);
			case srsPackage.VSRS_DOCUMENT__INTRODUCTION_SECTION:
				return basicSetIntroductionSection(null, msgs);
			case srsPackage.VSRS_DOCUMENT__APPLICABLE_DOCUMENTS_SECTION:
				return basicSetApplicableDocumentsSection(null, msgs);
			case srsPackage.VSRS_DOCUMENT__REFERENCE_DOCUMENTS_SECTION:
				return basicSetReferenceDocumentsSection(null, msgs);
			case srsPackage.VSRS_DOCUMENT__TERMS_DEFINITIONS_ABBREVIATIONS_SECTION:
				return basicSetTermsDefinitionsAbbreviationsSection(null, msgs);
			case srsPackage.VSRS_DOCUMENT__SOFTWARE_OVERVIEW_SECTION:
				return basicSetSoftwareOverviewSection(null, msgs);
			case srsPackage.VSRS_DOCUMENT__REQUIREMENTS_SECTION:
				return basicSetRequirementsSection(null, msgs);
			case srsPackage.VSRS_DOCUMENT__LOGICAL_MODELS_SECTION:
				return basicSetLogicalModelsSection(null, msgs);
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
			case srsPackage.VSRS_DOCUMENT__NAME:
				return getName();
			case srsPackage.VSRS_DOCUMENT__ID:
				return getId();
			case srsPackage.VSRS_DOCUMENT__ISSUE:
				return getIssue();
			case srsPackage.VSRS_DOCUMENT__REVISION:
				return getRevision();
			case srsPackage.VSRS_DOCUMENT__DATE:
				return getDate();
			case srsPackage.VSRS_DOCUMENT__TBCS:
				return getTbcs();
			case srsPackage.VSRS_DOCUMENT__TBDS:
				return getTbds();
			case srsPackage.VSRS_DOCUMENT__APPLICABLE_DOCUMENTS:
				return getApplicableDocuments();
			case srsPackage.VSRS_DOCUMENT__REFERENCE_DOCUMENTS:
				return getReferenceDocuments();
			case srsPackage.VSRS_DOCUMENT__FIGURES:
				return getFigures();
			case srsPackage.VSRS_DOCUMENT__TABLES:
				return getTables();
			case srsPackage.VSRS_DOCUMENT__SECTIONS:
				return getSections();
			case srsPackage.VSRS_DOCUMENT__PARAGRAPHS:
				return getParagraphs();
			case srsPackage.VSRS_DOCUMENT__TBCS_TBDS_SECTION:
				return getTbcsTbdsSection();
			case srsPackage.VSRS_DOCUMENT__INTRODUCTION_SECTION:
				return getIntroductionSection();
			case srsPackage.VSRS_DOCUMENT__APPLICABLE_DOCUMENTS_SECTION:
				return getApplicableDocumentsSection();
			case srsPackage.VSRS_DOCUMENT__REFERENCE_DOCUMENTS_SECTION:
				return getReferenceDocumentsSection();
			case srsPackage.VSRS_DOCUMENT__TERMS_DEFINITIONS_ABBREVIATIONS_SECTION:
				return getTermsDefinitionsAbbreviationsSection();
			case srsPackage.VSRS_DOCUMENT__SOFTWARE_OVERVIEW_SECTION:
				return getSoftwareOverviewSection();
			case srsPackage.VSRS_DOCUMENT__REQUIREMENTS_SECTION:
				return getRequirementsSection();
			case srsPackage.VSRS_DOCUMENT__LOGICAL_MODELS_SECTION:
				return getLogicalModelsSection();
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
			case srsPackage.VSRS_DOCUMENT__NAME:
				setName((String)newValue);
				return;
			case srsPackage.VSRS_DOCUMENT__ID:
				setId((String)newValue);
				return;
			case srsPackage.VSRS_DOCUMENT__ISSUE:
				setIssue((String)newValue);
				return;
			case srsPackage.VSRS_DOCUMENT__REVISION:
				setRevision((String)newValue);
				return;
			case srsPackage.VSRS_DOCUMENT__DATE:
				setDate((String)newValue);
				return;
			case srsPackage.VSRS_DOCUMENT__TBCS:
				getTbcs().clear();
				getTbcs().addAll((Collection<? extends DTBC>)newValue);
				return;
			case srsPackage.VSRS_DOCUMENT__TBDS:
				getTbds().clear();
				getTbds().addAll((Collection<? extends DTBD>)newValue);
				return;
			case srsPackage.VSRS_DOCUMENT__APPLICABLE_DOCUMENTS:
				getApplicableDocuments().clear();
				getApplicableDocuments().addAll((Collection<? extends DApplicableDocument>)newValue);
				return;
			case srsPackage.VSRS_DOCUMENT__REFERENCE_DOCUMENTS:
				getReferenceDocuments().clear();
				getReferenceDocuments().addAll((Collection<? extends DReferenceDocument>)newValue);
				return;
			case srsPackage.VSRS_DOCUMENT__FIGURES:
				getFigures().clear();
				getFigures().addAll((Collection<? extends DAbstractFigure>)newValue);
				return;
			case srsPackage.VSRS_DOCUMENT__TABLES:
				getTables().clear();
				getTables().addAll((Collection<? extends DAbstractTable>)newValue);
				return;
			case srsPackage.VSRS_DOCUMENT__SECTIONS:
				getSections().clear();
				getSections().addAll((Collection<? extends DAbstractSection>)newValue);
				return;
			case srsPackage.VSRS_DOCUMENT__PARAGRAPHS:
				getParagraphs().clear();
				getParagraphs().addAll((Collection<? extends DParagraph>)newValue);
				return;
			case srsPackage.VSRS_DOCUMENT__TBCS_TBDS_SECTION:
				setTbcsTbdsSection((VSRSTBCsTBDs)newValue);
				return;
			case srsPackage.VSRS_DOCUMENT__INTRODUCTION_SECTION:
				setIntroductionSection((VSRSIntroduction)newValue);
				return;
			case srsPackage.VSRS_DOCUMENT__APPLICABLE_DOCUMENTS_SECTION:
				setApplicableDocumentsSection((VSRSApplicableDocuments)newValue);
				return;
			case srsPackage.VSRS_DOCUMENT__REFERENCE_DOCUMENTS_SECTION:
				setReferenceDocumentsSection((VSRSReferenceDocuments)newValue);
				return;
			case srsPackage.VSRS_DOCUMENT__TERMS_DEFINITIONS_ABBREVIATIONS_SECTION:
				setTermsDefinitionsAbbreviationsSection((VSRSTermsDefinitionsAbbreviations)newValue);
				return;
			case srsPackage.VSRS_DOCUMENT__SOFTWARE_OVERVIEW_SECTION:
				setSoftwareOverviewSection((VSRSSoftwareOverview)newValue);
				return;
			case srsPackage.VSRS_DOCUMENT__REQUIREMENTS_SECTION:
				setRequirementsSection((VSRSRequirements)newValue);
				return;
			case srsPackage.VSRS_DOCUMENT__LOGICAL_MODELS_SECTION:
				setLogicalModelsSection((VSRSLogicalModels)newValue);
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
			case srsPackage.VSRS_DOCUMENT__NAME:
				setName(NAME_EDEFAULT);
				return;
			case srsPackage.VSRS_DOCUMENT__ID:
				setId(ID_EDEFAULT);
				return;
			case srsPackage.VSRS_DOCUMENT__ISSUE:
				setIssue(ISSUE_EDEFAULT);
				return;
			case srsPackage.VSRS_DOCUMENT__REVISION:
				setRevision(REVISION_EDEFAULT);
				return;
			case srsPackage.VSRS_DOCUMENT__DATE:
				setDate(DATE_EDEFAULT);
				return;
			case srsPackage.VSRS_DOCUMENT__TBCS:
				getTbcs().clear();
				return;
			case srsPackage.VSRS_DOCUMENT__TBDS:
				getTbds().clear();
				return;
			case srsPackage.VSRS_DOCUMENT__APPLICABLE_DOCUMENTS:
				getApplicableDocuments().clear();
				return;
			case srsPackage.VSRS_DOCUMENT__REFERENCE_DOCUMENTS:
				getReferenceDocuments().clear();
				return;
			case srsPackage.VSRS_DOCUMENT__FIGURES:
				getFigures().clear();
				return;
			case srsPackage.VSRS_DOCUMENT__TABLES:
				getTables().clear();
				return;
			case srsPackage.VSRS_DOCUMENT__SECTIONS:
				getSections().clear();
				return;
			case srsPackage.VSRS_DOCUMENT__PARAGRAPHS:
				getParagraphs().clear();
				return;
			case srsPackage.VSRS_DOCUMENT__TBCS_TBDS_SECTION:
				setTbcsTbdsSection((VSRSTBCsTBDs)null);
				return;
			case srsPackage.VSRS_DOCUMENT__INTRODUCTION_SECTION:
				setIntroductionSection((VSRSIntroduction)null);
				return;
			case srsPackage.VSRS_DOCUMENT__APPLICABLE_DOCUMENTS_SECTION:
				setApplicableDocumentsSection((VSRSApplicableDocuments)null);
				return;
			case srsPackage.VSRS_DOCUMENT__REFERENCE_DOCUMENTS_SECTION:
				setReferenceDocumentsSection((VSRSReferenceDocuments)null);
				return;
			case srsPackage.VSRS_DOCUMENT__TERMS_DEFINITIONS_ABBREVIATIONS_SECTION:
				setTermsDefinitionsAbbreviationsSection((VSRSTermsDefinitionsAbbreviations)null);
				return;
			case srsPackage.VSRS_DOCUMENT__SOFTWARE_OVERVIEW_SECTION:
				setSoftwareOverviewSection((VSRSSoftwareOverview)null);
				return;
			case srsPackage.VSRS_DOCUMENT__REQUIREMENTS_SECTION:
				setRequirementsSection((VSRSRequirements)null);
				return;
			case srsPackage.VSRS_DOCUMENT__LOGICAL_MODELS_SECTION:
				setLogicalModelsSection((VSRSLogicalModels)null);
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
			case srsPackage.VSRS_DOCUMENT__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case srsPackage.VSRS_DOCUMENT__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case srsPackage.VSRS_DOCUMENT__ISSUE:
				return ISSUE_EDEFAULT == null ? issue != null : !ISSUE_EDEFAULT.equals(issue);
			case srsPackage.VSRS_DOCUMENT__REVISION:
				return REVISION_EDEFAULT == null ? revision != null : !REVISION_EDEFAULT.equals(revision);
			case srsPackage.VSRS_DOCUMENT__DATE:
				return DATE_EDEFAULT == null ? date != null : !DATE_EDEFAULT.equals(date);
			case srsPackage.VSRS_DOCUMENT__TBCS:
				return !getTbcs().isEmpty();
			case srsPackage.VSRS_DOCUMENT__TBDS:
				return !getTbds().isEmpty();
			case srsPackage.VSRS_DOCUMENT__APPLICABLE_DOCUMENTS:
				return !getApplicableDocuments().isEmpty();
			case srsPackage.VSRS_DOCUMENT__REFERENCE_DOCUMENTS:
				return !getReferenceDocuments().isEmpty();
			case srsPackage.VSRS_DOCUMENT__FIGURES:
				return !getFigures().isEmpty();
			case srsPackage.VSRS_DOCUMENT__TABLES:
				return !getTables().isEmpty();
			case srsPackage.VSRS_DOCUMENT__SECTIONS:
				return !getSections().isEmpty();
			case srsPackage.VSRS_DOCUMENT__PARAGRAPHS:
				return !getParagraphs().isEmpty();
			case srsPackage.VSRS_DOCUMENT__TBCS_TBDS_SECTION:
				return tbcsTbdsSection != null;
			case srsPackage.VSRS_DOCUMENT__INTRODUCTION_SECTION:
				return introductionSection != null;
			case srsPackage.VSRS_DOCUMENT__APPLICABLE_DOCUMENTS_SECTION:
				return applicableDocumentsSection != null;
			case srsPackage.VSRS_DOCUMENT__REFERENCE_DOCUMENTS_SECTION:
				return referenceDocumentsSection != null;
			case srsPackage.VSRS_DOCUMENT__TERMS_DEFINITIONS_ABBREVIATIONS_SECTION:
				return termsDefinitionsAbbreviationsSection != null;
			case srsPackage.VSRS_DOCUMENT__SOFTWARE_OVERVIEW_SECTION:
				return softwareOverviewSection != null;
			case srsPackage.VSRS_DOCUMENT__REQUIREMENTS_SECTION:
				return requirementsSection != null;
			case srsPackage.VSRS_DOCUMENT__LOGICAL_MODELS_SECTION:
				return logicalModelsSection != null;
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
				case srsPackage.VSRS_DOCUMENT__NAME: return doctplPackage.DDOCUMENT_TEMPLATE__NAME;
				case srsPackage.VSRS_DOCUMENT__ID: return doctplPackage.DDOCUMENT_TEMPLATE__ID;
				case srsPackage.VSRS_DOCUMENT__ISSUE: return doctplPackage.DDOCUMENT_TEMPLATE__ISSUE;
				case srsPackage.VSRS_DOCUMENT__REVISION: return doctplPackage.DDOCUMENT_TEMPLATE__REVISION;
				case srsPackage.VSRS_DOCUMENT__DATE: return doctplPackage.DDOCUMENT_TEMPLATE__DATE;
				case srsPackage.VSRS_DOCUMENT__TBCS: return doctplPackage.DDOCUMENT_TEMPLATE__TBCS;
				case srsPackage.VSRS_DOCUMENT__TBDS: return doctplPackage.DDOCUMENT_TEMPLATE__TBDS;
				case srsPackage.VSRS_DOCUMENT__APPLICABLE_DOCUMENTS: return doctplPackage.DDOCUMENT_TEMPLATE__APPLICABLE_DOCUMENTS;
				case srsPackage.VSRS_DOCUMENT__REFERENCE_DOCUMENTS: return doctplPackage.DDOCUMENT_TEMPLATE__REFERENCE_DOCUMENTS;
				case srsPackage.VSRS_DOCUMENT__FIGURES: return doctplPackage.DDOCUMENT_TEMPLATE__FIGURES;
				case srsPackage.VSRS_DOCUMENT__TABLES: return doctplPackage.DDOCUMENT_TEMPLATE__TABLES;
				case srsPackage.VSRS_DOCUMENT__SECTIONS: return doctplPackage.DDOCUMENT_TEMPLATE__SECTIONS;
				case srsPackage.VSRS_DOCUMENT__PARAGRAPHS: return doctplPackage.DDOCUMENT_TEMPLATE__PARAGRAPHS;
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
				case doctplPackage.DDOCUMENT_TEMPLATE__NAME: return srsPackage.VSRS_DOCUMENT__NAME;
				case doctplPackage.DDOCUMENT_TEMPLATE__ID: return srsPackage.VSRS_DOCUMENT__ID;
				case doctplPackage.DDOCUMENT_TEMPLATE__ISSUE: return srsPackage.VSRS_DOCUMENT__ISSUE;
				case doctplPackage.DDOCUMENT_TEMPLATE__REVISION: return srsPackage.VSRS_DOCUMENT__REVISION;
				case doctplPackage.DDOCUMENT_TEMPLATE__DATE: return srsPackage.VSRS_DOCUMENT__DATE;
				case doctplPackage.DDOCUMENT_TEMPLATE__TBCS: return srsPackage.VSRS_DOCUMENT__TBCS;
				case doctplPackage.DDOCUMENT_TEMPLATE__TBDS: return srsPackage.VSRS_DOCUMENT__TBDS;
				case doctplPackage.DDOCUMENT_TEMPLATE__APPLICABLE_DOCUMENTS: return srsPackage.VSRS_DOCUMENT__APPLICABLE_DOCUMENTS;
				case doctplPackage.DDOCUMENT_TEMPLATE__REFERENCE_DOCUMENTS: return srsPackage.VSRS_DOCUMENT__REFERENCE_DOCUMENTS;
				case doctplPackage.DDOCUMENT_TEMPLATE__FIGURES: return srsPackage.VSRS_DOCUMENT__FIGURES;
				case doctplPackage.DDOCUMENT_TEMPLATE__TABLES: return srsPackage.VSRS_DOCUMENT__TABLES;
				case doctplPackage.DDOCUMENT_TEMPLATE__SECTIONS: return srsPackage.VSRS_DOCUMENT__SECTIONS;
				case doctplPackage.DDOCUMENT_TEMPLATE__PARAGRAPHS: return srsPackage.VSRS_DOCUMENT__PARAGRAPHS;
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

} //VSRSDocumentImpl
