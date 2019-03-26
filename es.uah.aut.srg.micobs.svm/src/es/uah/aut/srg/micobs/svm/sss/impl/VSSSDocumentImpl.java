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

import es.uah.aut.srg.micobs.doctpl.doc.DAbstractFigure;
import es.uah.aut.srg.micobs.doctpl.doc.DAbstractSection;
import es.uah.aut.srg.micobs.doctpl.doc.DAbstractTable;
import es.uah.aut.srg.micobs.doctpl.doc.DApplicableDocument;
import es.uah.aut.srg.micobs.doctpl.doc.DReferenceDocument;
import es.uah.aut.srg.micobs.doctpl.doc.impl.DDocumentTemplateImpl;

import es.uah.aut.srg.micobs.svm.sss.VSSSApplicableDocuments;
import es.uah.aut.srg.micobs.svm.sss.VSSSDocument;
import es.uah.aut.srg.micobs.svm.sss.VSSSGeneralDescription;
import es.uah.aut.srg.micobs.svm.sss.VSSSIntroduction;
import es.uah.aut.srg.micobs.svm.sss.VSSSReferenceDocuments;
import es.uah.aut.srg.micobs.svm.sss.VSSSSpecificRequirements;
import es.uah.aut.srg.micobs.svm.sss.VSSSSystemModels;
import es.uah.aut.srg.micobs.svm.sss.VSSSTermsDefinitionsAbbreviations;
import es.uah.aut.srg.micobs.svm.sss.VSSSVerificationValidationIntegrationRequirements;
import es.uah.aut.srg.micobs.svm.sss.sssPackage;

import es.uah.aut.srg.micobs.svm.tdm.VTraceableDocument;
import es.uah.aut.srg.micobs.svm.tdm.VTraceableDocumentAbstractGroup;
import es.uah.aut.srg.micobs.svm.tdm.tdmPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

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
 *   <li>{@link es.uah.aut.srg.micobs.svm.sss.impl.VSSSDocumentImpl#getParents <em>Parents</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.svm.sss.impl.VSSSDocumentImpl#getGroups <em>Groups</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.svm.sss.impl.VSSSDocumentImpl#getIntroduction <em>Introduction</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.svm.sss.impl.VSSSDocumentImpl#getApplicableDocumentsSection <em>Applicable Documents Section</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.svm.sss.impl.VSSSDocumentImpl#getReferenceDocumentsSection <em>Reference Documents Section</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.svm.sss.impl.VSSSDocumentImpl#getTermsDefinitionsAbbreviations <em>Terms Definitions Abbreviations</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.svm.sss.impl.VSSSDocumentImpl#getGeneralDescription <em>General Description</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.svm.sss.impl.VSSSDocumentImpl#getSpecificRequirements <em>Specific Requirements</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.svm.sss.impl.VSSSDocumentImpl#getVerificationValidationIntegration <em>Verification Validation Integration</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.svm.sss.impl.VSSSDocumentImpl#getSystemModels <em>System Models</em>}</li>
 * </ul>
 *
 * @generated
 */
public class VSSSDocumentImpl extends DDocumentTemplateImpl implements VSSSDocument {
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
	 * The cached value of the '{@link #getParents() <em>Parents</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParents()
	 * @generated
	 * @ordered
	 */
	protected EList<VTraceableDocument> parents;

	/**
	 * The cached value of the '{@link #getIntroduction() <em>Introduction</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIntroduction()
	 * @generated
	 * @ordered
	 */
	protected VSSSIntroduction introduction;

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
	 * The cached value of the '{@link #getTermsDefinitionsAbbreviations() <em>Terms Definitions Abbreviations</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTermsDefinitionsAbbreviations()
	 * @generated
	 * @ordered
	 */
	protected VSSSTermsDefinitionsAbbreviations termsDefinitionsAbbreviations;

	/**
	 * The cached value of the '{@link #getGeneralDescription() <em>General Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGeneralDescription()
	 * @generated
	 * @ordered
	 */
	protected VSSSGeneralDescription generalDescription;

	/**
	 * The cached value of the '{@link #getSpecificRequirements() <em>Specific Requirements</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpecificRequirements()
	 * @generated
	 * @ordered
	 */
	protected VSSSSpecificRequirements specificRequirements;

	/**
	 * The cached value of the '{@link #getVerificationValidationIntegration() <em>Verification Validation Integration</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVerificationValidationIntegration()
	 * @generated
	 * @ordered
	 */
	protected VSSSVerificationValidationIntegrationRequirements verificationValidationIntegration;

	/**
	 * The cached value of the '{@link #getSystemModels() <em>System Models</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSystemModels()
	 * @generated
	 * @ordered
	 */
	protected VSSSSystemModels systemModels;

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

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<VTraceableDocument> getParents() {
		if (parents == null) {
			parents = new EObjectResolvingEList<VTraceableDocument>(VTraceableDocument.class, this, sssPackage.VSSS_DOCUMENT__PARENTS);
		}
		return parents;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public EList<VTraceableDocumentAbstractGroup> getGroups() {
		EList<VTraceableDocumentAbstractGroup> groups = new BasicEList<VTraceableDocumentAbstractGroup>();
		groups.add((VTraceableDocumentAbstractGroup) getSpecificRequirements().getGeneral());
		groups.add((VTraceableDocumentAbstractGroup) getSpecificRequirements().getCapabilities());
		groups.add((VTraceableDocumentAbstractGroup) getSpecificRequirements().getSystemInterface());
		groups.add((VTraceableDocumentAbstractGroup) getSpecificRequirements().getAdaptationMissionization());
		groups.add((VTraceableDocumentAbstractGroup) getSpecificRequirements().getComputerResource());
		groups.add((VTraceableDocumentAbstractGroup) getSpecificRequirements().getSecurity());
		groups.add((VTraceableDocumentAbstractGroup) getSpecificRequirements().getSafety());
		groups.add((VTraceableDocumentAbstractGroup) getSpecificRequirements().getReliabiltyAvailability());
		groups.add((VTraceableDocumentAbstractGroup) getSpecificRequirements().getQuality());
		groups.add((VTraceableDocumentAbstractGroup) getSpecificRequirements().getDesign());
		groups.add((VTraceableDocumentAbstractGroup) getSpecificRequirements().getSoftwareOperations());
		groups.add((VTraceableDocumentAbstractGroup) getSpecificRequirements().getSoftwareMaintenance());
		groups.add((VTraceableDocumentAbstractGroup) getSpecificRequirements().getSystemSoftwareObservability());
		groups.add((VTraceableDocumentAbstractGroup) getVerificationValidationIntegration().getVerificationValidationProcess());
		groups.add((VTraceableDocumentAbstractGroup) getVerificationValidationIntegration().getValidationApproach());
		groups.add((VTraceableDocumentAbstractGroup) getVerificationValidationIntegration().getValidation());
		groups.add((VTraceableDocumentAbstractGroup) getVerificationValidationIntegration().getVerification());
		return groups;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VSSSIntroduction getIntroduction() {
		return introduction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIntroduction(VSSSIntroduction newIntroduction, NotificationChain msgs) {
		VSSSIntroduction oldIntroduction = introduction;
		introduction = newIntroduction;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, sssPackage.VSSS_DOCUMENT__INTRODUCTION, oldIntroduction, newIntroduction);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIntroduction(VSSSIntroduction newIntroduction) {
		if (newIntroduction != introduction) {
			NotificationChain msgs = null;
			if (introduction != null)
				msgs = ((InternalEObject)introduction).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - sssPackage.VSSS_DOCUMENT__INTRODUCTION, null, msgs);
			if (newIntroduction != null)
				msgs = ((InternalEObject)newIntroduction).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - sssPackage.VSSS_DOCUMENT__INTRODUCTION, null, msgs);
			msgs = basicSetIntroduction(newIntroduction, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, sssPackage.VSSS_DOCUMENT__INTRODUCTION, newIntroduction, newIntroduction));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VSSSApplicableDocuments getApplicableDocumentsSection() {
		return applicableDocumentsSection;
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
	public VSSSTermsDefinitionsAbbreviations getTermsDefinitionsAbbreviations() {
		return termsDefinitionsAbbreviations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTermsDefinitionsAbbreviations(VSSSTermsDefinitionsAbbreviations newTermsDefinitionsAbbreviations, NotificationChain msgs) {
		VSSSTermsDefinitionsAbbreviations oldTermsDefinitionsAbbreviations = termsDefinitionsAbbreviations;
		termsDefinitionsAbbreviations = newTermsDefinitionsAbbreviations;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, sssPackage.VSSS_DOCUMENT__TERMS_DEFINITIONS_ABBREVIATIONS, oldTermsDefinitionsAbbreviations, newTermsDefinitionsAbbreviations);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTermsDefinitionsAbbreviations(VSSSTermsDefinitionsAbbreviations newTermsDefinitionsAbbreviations) {
		if (newTermsDefinitionsAbbreviations != termsDefinitionsAbbreviations) {
			NotificationChain msgs = null;
			if (termsDefinitionsAbbreviations != null)
				msgs = ((InternalEObject)termsDefinitionsAbbreviations).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - sssPackage.VSSS_DOCUMENT__TERMS_DEFINITIONS_ABBREVIATIONS, null, msgs);
			if (newTermsDefinitionsAbbreviations != null)
				msgs = ((InternalEObject)newTermsDefinitionsAbbreviations).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - sssPackage.VSSS_DOCUMENT__TERMS_DEFINITIONS_ABBREVIATIONS, null, msgs);
			msgs = basicSetTermsDefinitionsAbbreviations(newTermsDefinitionsAbbreviations, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, sssPackage.VSSS_DOCUMENT__TERMS_DEFINITIONS_ABBREVIATIONS, newTermsDefinitionsAbbreviations, newTermsDefinitionsAbbreviations));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VSSSGeneralDescription getGeneralDescription() {
		return generalDescription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGeneralDescription(VSSSGeneralDescription newGeneralDescription, NotificationChain msgs) {
		VSSSGeneralDescription oldGeneralDescription = generalDescription;
		generalDescription = newGeneralDescription;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, sssPackage.VSSS_DOCUMENT__GENERAL_DESCRIPTION, oldGeneralDescription, newGeneralDescription);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGeneralDescription(VSSSGeneralDescription newGeneralDescription) {
		if (newGeneralDescription != generalDescription) {
			NotificationChain msgs = null;
			if (generalDescription != null)
				msgs = ((InternalEObject)generalDescription).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - sssPackage.VSSS_DOCUMENT__GENERAL_DESCRIPTION, null, msgs);
			if (newGeneralDescription != null)
				msgs = ((InternalEObject)newGeneralDescription).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - sssPackage.VSSS_DOCUMENT__GENERAL_DESCRIPTION, null, msgs);
			msgs = basicSetGeneralDescription(newGeneralDescription, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, sssPackage.VSSS_DOCUMENT__GENERAL_DESCRIPTION, newGeneralDescription, newGeneralDescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VSSSSpecificRequirements getSpecificRequirements() {
		return specificRequirements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSpecificRequirements(VSSSSpecificRequirements newSpecificRequirements, NotificationChain msgs) {
		VSSSSpecificRequirements oldSpecificRequirements = specificRequirements;
		specificRequirements = newSpecificRequirements;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, sssPackage.VSSS_DOCUMENT__SPECIFIC_REQUIREMENTS, oldSpecificRequirements, newSpecificRequirements);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSpecificRequirements(VSSSSpecificRequirements newSpecificRequirements) {
		if (newSpecificRequirements != specificRequirements) {
			NotificationChain msgs = null;
			if (specificRequirements != null)
				msgs = ((InternalEObject)specificRequirements).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - sssPackage.VSSS_DOCUMENT__SPECIFIC_REQUIREMENTS, null, msgs);
			if (newSpecificRequirements != null)
				msgs = ((InternalEObject)newSpecificRequirements).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - sssPackage.VSSS_DOCUMENT__SPECIFIC_REQUIREMENTS, null, msgs);
			msgs = basicSetSpecificRequirements(newSpecificRequirements, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, sssPackage.VSSS_DOCUMENT__SPECIFIC_REQUIREMENTS, newSpecificRequirements, newSpecificRequirements));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VSSSVerificationValidationIntegrationRequirements getVerificationValidationIntegration() {
		return verificationValidationIntegration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetVerificationValidationIntegration(VSSSVerificationValidationIntegrationRequirements newVerificationValidationIntegration, NotificationChain msgs) {
		VSSSVerificationValidationIntegrationRequirements oldVerificationValidationIntegration = verificationValidationIntegration;
		verificationValidationIntegration = newVerificationValidationIntegration;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, sssPackage.VSSS_DOCUMENT__VERIFICATION_VALIDATION_INTEGRATION, oldVerificationValidationIntegration, newVerificationValidationIntegration);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVerificationValidationIntegration(VSSSVerificationValidationIntegrationRequirements newVerificationValidationIntegration) {
		if (newVerificationValidationIntegration != verificationValidationIntegration) {
			NotificationChain msgs = null;
			if (verificationValidationIntegration != null)
				msgs = ((InternalEObject)verificationValidationIntegration).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - sssPackage.VSSS_DOCUMENT__VERIFICATION_VALIDATION_INTEGRATION, null, msgs);
			if (newVerificationValidationIntegration != null)
				msgs = ((InternalEObject)newVerificationValidationIntegration).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - sssPackage.VSSS_DOCUMENT__VERIFICATION_VALIDATION_INTEGRATION, null, msgs);
			msgs = basicSetVerificationValidationIntegration(newVerificationValidationIntegration, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, sssPackage.VSSS_DOCUMENT__VERIFICATION_VALIDATION_INTEGRATION, newVerificationValidationIntegration, newVerificationValidationIntegration));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VSSSSystemModels getSystemModels() {
		return systemModels;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSystemModels(VSSSSystemModels newSystemModels, NotificationChain msgs) {
		VSSSSystemModels oldSystemModels = systemModels;
		systemModels = newSystemModels;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, sssPackage.VSSS_DOCUMENT__SYSTEM_MODELS, oldSystemModels, newSystemModels);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSystemModels(VSSSSystemModels newSystemModels) {
		if (newSystemModels != systemModels) {
			NotificationChain msgs = null;
			if (systemModels != null)
				msgs = ((InternalEObject)systemModels).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - sssPackage.VSSS_DOCUMENT__SYSTEM_MODELS, null, msgs);
			if (newSystemModels != null)
				msgs = ((InternalEObject)newSystemModels).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - sssPackage.VSSS_DOCUMENT__SYSTEM_MODELS, null, msgs);
			msgs = basicSetSystemModels(newSystemModels, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, sssPackage.VSSS_DOCUMENT__SYSTEM_MODELS, newSystemModels, newSystemModels));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case sssPackage.VSSS_DOCUMENT__INTRODUCTION:
				return basicSetIntroduction(null, msgs);
			case sssPackage.VSSS_DOCUMENT__APPLICABLE_DOCUMENTS_SECTION:
				return basicSetApplicableDocumentsSection(null, msgs);
			case sssPackage.VSSS_DOCUMENT__REFERENCE_DOCUMENTS_SECTION:
				return basicSetReferenceDocumentsSection(null, msgs);
			case sssPackage.VSSS_DOCUMENT__TERMS_DEFINITIONS_ABBREVIATIONS:
				return basicSetTermsDefinitionsAbbreviations(null, msgs);
			case sssPackage.VSSS_DOCUMENT__GENERAL_DESCRIPTION:
				return basicSetGeneralDescription(null, msgs);
			case sssPackage.VSSS_DOCUMENT__SPECIFIC_REQUIREMENTS:
				return basicSetSpecificRequirements(null, msgs);
			case sssPackage.VSSS_DOCUMENT__VERIFICATION_VALIDATION_INTEGRATION:
				return basicSetVerificationValidationIntegration(null, msgs);
			case sssPackage.VSSS_DOCUMENT__SYSTEM_MODELS:
				return basicSetSystemModels(null, msgs);
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
			case sssPackage.VSSS_DOCUMENT__PARENTS:
				return getParents();
			case sssPackage.VSSS_DOCUMENT__GROUPS:
				return getGroups();
			case sssPackage.VSSS_DOCUMENT__INTRODUCTION:
				return getIntroduction();
			case sssPackage.VSSS_DOCUMENT__APPLICABLE_DOCUMENTS_SECTION:
				return getApplicableDocumentsSection();
			case sssPackage.VSSS_DOCUMENT__REFERENCE_DOCUMENTS_SECTION:
				return getReferenceDocumentsSection();
			case sssPackage.VSSS_DOCUMENT__TERMS_DEFINITIONS_ABBREVIATIONS:
				return getTermsDefinitionsAbbreviations();
			case sssPackage.VSSS_DOCUMENT__GENERAL_DESCRIPTION:
				return getGeneralDescription();
			case sssPackage.VSSS_DOCUMENT__SPECIFIC_REQUIREMENTS:
				return getSpecificRequirements();
			case sssPackage.VSSS_DOCUMENT__VERIFICATION_VALIDATION_INTEGRATION:
				return getVerificationValidationIntegration();
			case sssPackage.VSSS_DOCUMENT__SYSTEM_MODELS:
				return getSystemModels();
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
			case sssPackage.VSSS_DOCUMENT__PARENTS:
				getParents().clear();
				getParents().addAll((Collection<? extends VTraceableDocument>)newValue);
				return;
			case sssPackage.VSSS_DOCUMENT__GROUPS:
				getGroups().clear();
				getGroups().addAll((Collection<? extends VTraceableDocumentAbstractGroup>)newValue);
				return;
			case sssPackage.VSSS_DOCUMENT__INTRODUCTION:
				setIntroduction((VSSSIntroduction)newValue);
				return;
			case sssPackage.VSSS_DOCUMENT__APPLICABLE_DOCUMENTS_SECTION:
				setApplicableDocumentsSection((VSSSApplicableDocuments)newValue);
				return;
			case sssPackage.VSSS_DOCUMENT__REFERENCE_DOCUMENTS_SECTION:
				setReferenceDocumentsSection((VSSSReferenceDocuments)newValue);
				return;
			case sssPackage.VSSS_DOCUMENT__TERMS_DEFINITIONS_ABBREVIATIONS:
				setTermsDefinitionsAbbreviations((VSSSTermsDefinitionsAbbreviations)newValue);
				return;
			case sssPackage.VSSS_DOCUMENT__GENERAL_DESCRIPTION:
				setGeneralDescription((VSSSGeneralDescription)newValue);
				return;
			case sssPackage.VSSS_DOCUMENT__SPECIFIC_REQUIREMENTS:
				setSpecificRequirements((VSSSSpecificRequirements)newValue);
				return;
			case sssPackage.VSSS_DOCUMENT__VERIFICATION_VALIDATION_INTEGRATION:
				setVerificationValidationIntegration((VSSSVerificationValidationIntegrationRequirements)newValue);
				return;
			case sssPackage.VSSS_DOCUMENT__SYSTEM_MODELS:
				setSystemModels((VSSSSystemModels)newValue);
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
			case sssPackage.VSSS_DOCUMENT__PARENTS:
				getParents().clear();
				return;
			case sssPackage.VSSS_DOCUMENT__GROUPS:
				getGroups().clear();
				return;
			case sssPackage.VSSS_DOCUMENT__INTRODUCTION:
				setIntroduction((VSSSIntroduction)null);
				return;
			case sssPackage.VSSS_DOCUMENT__APPLICABLE_DOCUMENTS_SECTION:
				setApplicableDocumentsSection((VSSSApplicableDocuments)null);
				return;
			case sssPackage.VSSS_DOCUMENT__REFERENCE_DOCUMENTS_SECTION:
				setReferenceDocumentsSection((VSSSReferenceDocuments)null);
				return;
			case sssPackage.VSSS_DOCUMENT__TERMS_DEFINITIONS_ABBREVIATIONS:
				setTermsDefinitionsAbbreviations((VSSSTermsDefinitionsAbbreviations)null);
				return;
			case sssPackage.VSSS_DOCUMENT__GENERAL_DESCRIPTION:
				setGeneralDescription((VSSSGeneralDescription)null);
				return;
			case sssPackage.VSSS_DOCUMENT__SPECIFIC_REQUIREMENTS:
				setSpecificRequirements((VSSSSpecificRequirements)null);
				return;
			case sssPackage.VSSS_DOCUMENT__VERIFICATION_VALIDATION_INTEGRATION:
				setVerificationValidationIntegration((VSSSVerificationValidationIntegrationRequirements)null);
				return;
			case sssPackage.VSSS_DOCUMENT__SYSTEM_MODELS:
				setSystemModels((VSSSSystemModels)null);
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
			case sssPackage.VSSS_DOCUMENT__PARENTS:
				return parents != null && !parents.isEmpty();
			case sssPackage.VSSS_DOCUMENT__GROUPS:
				return !getGroups().isEmpty();
			case sssPackage.VSSS_DOCUMENT__INTRODUCTION:
				return introduction != null;
			case sssPackage.VSSS_DOCUMENT__APPLICABLE_DOCUMENTS_SECTION:
				return applicableDocumentsSection != null;
			case sssPackage.VSSS_DOCUMENT__REFERENCE_DOCUMENTS_SECTION:
				return referenceDocumentsSection != null;
			case sssPackage.VSSS_DOCUMENT__TERMS_DEFINITIONS_ABBREVIATIONS:
				return termsDefinitionsAbbreviations != null;
			case sssPackage.VSSS_DOCUMENT__GENERAL_DESCRIPTION:
				return generalDescription != null;
			case sssPackage.VSSS_DOCUMENT__SPECIFIC_REQUIREMENTS:
				return specificRequirements != null;
			case sssPackage.VSSS_DOCUMENT__VERIFICATION_VALIDATION_INTEGRATION:
				return verificationValidationIntegration != null;
			case sssPackage.VSSS_DOCUMENT__SYSTEM_MODELS:
				return systemModels != null;
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
		if (baseClass == VTraceableDocument.class) {
			switch (derivedFeatureID) {
				case sssPackage.VSSS_DOCUMENT__NAME: return tdmPackage.VTRACEABLE_DOCUMENT__NAME;
				case sssPackage.VSSS_DOCUMENT__ID: return tdmPackage.VTRACEABLE_DOCUMENT__ID;
				case sssPackage.VSSS_DOCUMENT__ISSUE: return tdmPackage.VTRACEABLE_DOCUMENT__ISSUE;
				case sssPackage.VSSS_DOCUMENT__REVISION: return tdmPackage.VTRACEABLE_DOCUMENT__REVISION;
				case sssPackage.VSSS_DOCUMENT__DATE: return tdmPackage.VTRACEABLE_DOCUMENT__DATE;
				case sssPackage.VSSS_DOCUMENT__PARENTS: return tdmPackage.VTRACEABLE_DOCUMENT__PARENTS;
				case sssPackage.VSSS_DOCUMENT__GROUPS: return tdmPackage.VTRACEABLE_DOCUMENT__GROUPS;
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
		if (baseClass == VTraceableDocument.class) {
			switch (baseFeatureID) {
				case tdmPackage.VTRACEABLE_DOCUMENT__NAME: return sssPackage.VSSS_DOCUMENT__NAME;
				case tdmPackage.VTRACEABLE_DOCUMENT__ID: return sssPackage.VSSS_DOCUMENT__ID;
				case tdmPackage.VTRACEABLE_DOCUMENT__ISSUE: return sssPackage.VSSS_DOCUMENT__ISSUE;
				case tdmPackage.VTRACEABLE_DOCUMENT__REVISION: return sssPackage.VSSS_DOCUMENT__REVISION;
				case tdmPackage.VTRACEABLE_DOCUMENT__DATE: return sssPackage.VSSS_DOCUMENT__DATE;
				case tdmPackage.VTRACEABLE_DOCUMENT__PARENTS: return sssPackage.VSSS_DOCUMENT__PARENTS;
				case tdmPackage.VTRACEABLE_DOCUMENT__GROUPS: return sssPackage.VSSS_DOCUMENT__GROUPS;
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
	
	@Override
	public EList<DApplicableDocument> getApplicableDocuments() {
		EList<DApplicableDocument> appdocs = new BasicEList<DApplicableDocument>();
		appdocs.add((DApplicableDocument) getApplicableDocumentsSection().getApplicableDocuments());
		return appdocs;
	}
	
	@Override
	public EList<DReferenceDocument> getReferenceDocuments() {
		EList<DReferenceDocument> refdocs = new BasicEList<DReferenceDocument>();
		refdocs.add((DReferenceDocument) getApplicableDocumentsSection().getApplicableDocuments());
		return refdocs;
	}
	
	@Override
	public EList<DAbstractTable> getTables() {
		// TODO Auto-generated method stub
		return super.getTables();
	}
	
	@Override
	public EList<DAbstractFigure> getFigures() {
		// TODO Auto-generated method stub
		return super.getFigures();
	}
	
	@Override
	public EList<DAbstractSection> getSections() {
		EList<DAbstractSection> sections = new BasicEList<DAbstractSection>();
		sections.add((DAbstractSection) getIntroduction());
		sections.add((DAbstractSection) getApplicableDocumentsSection());
		sections.add((DAbstractSection) getReferenceDocumentsSection());
		sections.add((DAbstractSection) getTermsDefinitionsAbbreviations());
		sections.add((DAbstractSection) getSpecificRequirements());
		sections.add((DAbstractSection) getVerificationValidationIntegration());
		sections.add((DAbstractSection) getSystemModels());
		return sections;
	}

} //VSSSDocumentImpl
