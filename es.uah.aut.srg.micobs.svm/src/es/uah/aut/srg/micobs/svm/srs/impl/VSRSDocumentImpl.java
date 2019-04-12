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

import es.uah.aut.srg.micobs.doctpl.doc.DAbstractFigure;
import es.uah.aut.srg.micobs.doctpl.doc.DAbstractSection;
import es.uah.aut.srg.micobs.doctpl.doc.DAbstractTable;
import es.uah.aut.srg.micobs.doctpl.doc.DApplicableDocument;
import es.uah.aut.srg.micobs.doctpl.doc.DDocumentTemplate;
import es.uah.aut.srg.micobs.doctpl.doc.DReferenceDocument;
import es.uah.aut.srg.micobs.doctpl.doc.docPackage;

import es.uah.aut.srg.micobs.svm.srs.VSRSApplicableDocuments;
import es.uah.aut.srg.micobs.svm.srs.VSRSDocument;
import es.uah.aut.srg.micobs.svm.srs.VSRSIntroduction;
import es.uah.aut.srg.micobs.svm.srs.VSRSLogicalModels;
import es.uah.aut.srg.micobs.svm.srs.VSRSReferenceDocuments;
import es.uah.aut.srg.micobs.svm.srs.VSRSRequirements;
import es.uah.aut.srg.micobs.svm.srs.VSRSSoftwareOverview;
import es.uah.aut.srg.micobs.svm.srs.VSRSTermsDefinitionsAbbreviations;
import es.uah.aut.srg.micobs.svm.srs.VSRSTraceabilty;
import es.uah.aut.srg.micobs.svm.srs.srsPackage;
import es.uah.aut.srg.micobs.svm.tdm.VTraceableDocumentAbstractGroup;
import es.uah.aut.srg.micobs.svm.tdm.impl.VTraceableDocumentImpl;

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
 * An implementation of the model object '<em><b>VSRS Document</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link es.uah.aut.srg.micobs.svm.srs.impl.VSRSDocumentImpl#getApplicableDocuments <em>Applicable Documents</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.svm.srs.impl.VSRSDocumentImpl#getReferenceDocuments <em>Reference Documents</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.svm.srs.impl.VSRSDocumentImpl#getFigures <em>Figures</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.svm.srs.impl.VSRSDocumentImpl#getTables <em>Tables</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.svm.srs.impl.VSRSDocumentImpl#getSections <em>Sections</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.svm.srs.impl.VSRSDocumentImpl#getIntroductionSection <em>Introduction Section</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.svm.srs.impl.VSRSDocumentImpl#getApplicableDocumentsSection <em>Applicable Documents Section</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.svm.srs.impl.VSRSDocumentImpl#getReferenceDocumentsSection <em>Reference Documents Section</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.svm.srs.impl.VSRSDocumentImpl#getTermsDefinitionsAbbreviationsSection <em>Terms Definitions Abbreviations Section</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.svm.srs.impl.VSRSDocumentImpl#getGeneralDescriptionSection <em>General Description Section</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.svm.srs.impl.VSRSDocumentImpl#getRequirementsSection <em>Requirements Section</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.svm.srs.impl.VSRSDocumentImpl#getTraceabiltySection <em>Traceabilty Section</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.svm.srs.impl.VSRSDocumentImpl#getLogicalModelsSection <em>Logical Models Section</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.svm.srs.impl.VSRSDocumentImpl#getSrsFigures <em>Srs Figures</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.svm.srs.impl.VSRSDocumentImpl#getSrsTables <em>Srs Tables</em>}</li>
 * </ul>
 *
 * @generated
 */
public class VSRSDocumentImpl extends VTraceableDocumentImpl implements VSRSDocument {
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
	 * The cached value of the '{@link #getGeneralDescriptionSection() <em>General Description Section</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGeneralDescriptionSection()
	 * @generated
	 * @ordered
	 */
	protected VSRSSoftwareOverview generalDescriptionSection;

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
	 * The cached value of the '{@link #getTraceabiltySection() <em>Traceabilty Section</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTraceabiltySection()
	 * @generated
	 * @ordered
	 */
	protected VSRSTraceabilty traceabiltySection;

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
	 * The cached value of the '{@link #getSrsFigures() <em>Srs Figures</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSrsFigures()
	 * @generated
	 * @ordered
	 */
	protected EList<DAbstractFigure> srsFigures;

	/**
	 * The cached value of the '{@link #getSrsTables() <em>Srs Tables</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSrsTables()
	 * @generated
	 * @ordered
	 */
	protected EList<DAbstractTable> srsTables;

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
	public EList<DAbstractFigure> getFigures() {
		EList<DAbstractFigure> figures = new BasicEList<DAbstractFigure>();
		figures.add((DAbstractFigure) getSrsFigures());
		return figures;
	}

	@Override
	public EList<DAbstractTable> getTables() {
		EList<DAbstractTable> tables = new BasicEList<DAbstractTable>();
		tables.add((DAbstractTable) getSrsTables());
		return tables;
	}

	@Override
	public EList<DAbstractSection> getSections() {
		EList<DAbstractSection> sections = new BasicEList<DAbstractSection>();
		sections.add((DAbstractSection) getIntroductionSection());
		sections.add((DAbstractSection) getApplicableDocumentsSection());
		sections.add((DAbstractSection) getReferenceDocumentsSection());
		sections.add((DAbstractSection) getTermsDefinitionsAbbreviationsSection());
		sections.add((DAbstractSection) getRequirementsSection());
		sections.add((DAbstractSection) getTraceabiltySection());
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
		groups.add((VTraceableDocumentAbstractGroup) getRequirementsSection().getSwReliabilty());
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
	public VSRSSoftwareOverview getGeneralDescriptionSection() {
		return generalDescriptionSection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGeneralDescriptionSection(VSRSSoftwareOverview newGeneralDescriptionSection, NotificationChain msgs) {
		VSRSSoftwareOverview oldGeneralDescriptionSection = generalDescriptionSection;
		generalDescriptionSection = newGeneralDescriptionSection;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, srsPackage.VSRS_DOCUMENT__GENERAL_DESCRIPTION_SECTION, oldGeneralDescriptionSection, newGeneralDescriptionSection);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGeneralDescriptionSection(VSRSSoftwareOverview newGeneralDescriptionSection) {
		if (newGeneralDescriptionSection != generalDescriptionSection) {
			NotificationChain msgs = null;
			if (generalDescriptionSection != null)
				msgs = ((InternalEObject)generalDescriptionSection).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - srsPackage.VSRS_DOCUMENT__GENERAL_DESCRIPTION_SECTION, null, msgs);
			if (newGeneralDescriptionSection != null)
				msgs = ((InternalEObject)newGeneralDescriptionSection).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - srsPackage.VSRS_DOCUMENT__GENERAL_DESCRIPTION_SECTION, null, msgs);
			msgs = basicSetGeneralDescriptionSection(newGeneralDescriptionSection, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, srsPackage.VSRS_DOCUMENT__GENERAL_DESCRIPTION_SECTION, newGeneralDescriptionSection, newGeneralDescriptionSection));
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
	public VSRSTraceabilty getTraceabiltySection() {
		return traceabiltySection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTraceabiltySection(VSRSTraceabilty newTraceabiltySection, NotificationChain msgs) {
		VSRSTraceabilty oldTraceabiltySection = traceabiltySection;
		traceabiltySection = newTraceabiltySection;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, srsPackage.VSRS_DOCUMENT__TRACEABILTY_SECTION, oldTraceabiltySection, newTraceabiltySection);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTraceabiltySection(VSRSTraceabilty newTraceabiltySection) {
		if (newTraceabiltySection != traceabiltySection) {
			NotificationChain msgs = null;
			if (traceabiltySection != null)
				msgs = ((InternalEObject)traceabiltySection).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - srsPackage.VSRS_DOCUMENT__TRACEABILTY_SECTION, null, msgs);
			if (newTraceabiltySection != null)
				msgs = ((InternalEObject)newTraceabiltySection).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - srsPackage.VSRS_DOCUMENT__TRACEABILTY_SECTION, null, msgs);
			msgs = basicSetTraceabiltySection(newTraceabiltySection, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, srsPackage.VSRS_DOCUMENT__TRACEABILTY_SECTION, newTraceabiltySection, newTraceabiltySection));
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
	public EList<DAbstractFigure> getSrsFigures() {
		if (srsFigures == null) {
			srsFigures = new EObjectContainmentEList<DAbstractFigure>(DAbstractFigure.class, this, srsPackage.VSRS_DOCUMENT__SRS_FIGURES);
		}
		return srsFigures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DAbstractTable> getSrsTables() {
		if (srsTables == null) {
			srsTables = new EObjectContainmentEList<DAbstractTable>(DAbstractTable.class, this, srsPackage.VSRS_DOCUMENT__SRS_TABLES);
		}
		return srsTables;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case srsPackage.VSRS_DOCUMENT__INTRODUCTION_SECTION:
				return basicSetIntroductionSection(null, msgs);
			case srsPackage.VSRS_DOCUMENT__APPLICABLE_DOCUMENTS_SECTION:
				return basicSetApplicableDocumentsSection(null, msgs);
			case srsPackage.VSRS_DOCUMENT__REFERENCE_DOCUMENTS_SECTION:
				return basicSetReferenceDocumentsSection(null, msgs);
			case srsPackage.VSRS_DOCUMENT__TERMS_DEFINITIONS_ABBREVIATIONS_SECTION:
				return basicSetTermsDefinitionsAbbreviationsSection(null, msgs);
			case srsPackage.VSRS_DOCUMENT__GENERAL_DESCRIPTION_SECTION:
				return basicSetGeneralDescriptionSection(null, msgs);
			case srsPackage.VSRS_DOCUMENT__REQUIREMENTS_SECTION:
				return basicSetRequirementsSection(null, msgs);
			case srsPackage.VSRS_DOCUMENT__TRACEABILTY_SECTION:
				return basicSetTraceabiltySection(null, msgs);
			case srsPackage.VSRS_DOCUMENT__LOGICAL_MODELS_SECTION:
				return basicSetLogicalModelsSection(null, msgs);
			case srsPackage.VSRS_DOCUMENT__SRS_FIGURES:
				return ((InternalEList<?>)getSrsFigures()).basicRemove(otherEnd, msgs);
			case srsPackage.VSRS_DOCUMENT__SRS_TABLES:
				return ((InternalEList<?>)getSrsTables()).basicRemove(otherEnd, msgs);
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
			case srsPackage.VSRS_DOCUMENT__INTRODUCTION_SECTION:
				return getIntroductionSection();
			case srsPackage.VSRS_DOCUMENT__APPLICABLE_DOCUMENTS_SECTION:
				return getApplicableDocumentsSection();
			case srsPackage.VSRS_DOCUMENT__REFERENCE_DOCUMENTS_SECTION:
				return getReferenceDocumentsSection();
			case srsPackage.VSRS_DOCUMENT__TERMS_DEFINITIONS_ABBREVIATIONS_SECTION:
				return getTermsDefinitionsAbbreviationsSection();
			case srsPackage.VSRS_DOCUMENT__GENERAL_DESCRIPTION_SECTION:
				return getGeneralDescriptionSection();
			case srsPackage.VSRS_DOCUMENT__REQUIREMENTS_SECTION:
				return getRequirementsSection();
			case srsPackage.VSRS_DOCUMENT__TRACEABILTY_SECTION:
				return getTraceabiltySection();
			case srsPackage.VSRS_DOCUMENT__LOGICAL_MODELS_SECTION:
				return getLogicalModelsSection();
			case srsPackage.VSRS_DOCUMENT__SRS_FIGURES:
				return getSrsFigures();
			case srsPackage.VSRS_DOCUMENT__SRS_TABLES:
				return getSrsTables();
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
			case srsPackage.VSRS_DOCUMENT__GENERAL_DESCRIPTION_SECTION:
				setGeneralDescriptionSection((VSRSSoftwareOverview)newValue);
				return;
			case srsPackage.VSRS_DOCUMENT__REQUIREMENTS_SECTION:
				setRequirementsSection((VSRSRequirements)newValue);
				return;
			case srsPackage.VSRS_DOCUMENT__TRACEABILTY_SECTION:
				setTraceabiltySection((VSRSTraceabilty)newValue);
				return;
			case srsPackage.VSRS_DOCUMENT__LOGICAL_MODELS_SECTION:
				setLogicalModelsSection((VSRSLogicalModels)newValue);
				return;
			case srsPackage.VSRS_DOCUMENT__SRS_FIGURES:
				getSrsFigures().clear();
				getSrsFigures().addAll((Collection<? extends DAbstractFigure>)newValue);
				return;
			case srsPackage.VSRS_DOCUMENT__SRS_TABLES:
				getSrsTables().clear();
				getSrsTables().addAll((Collection<? extends DAbstractTable>)newValue);
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
			case srsPackage.VSRS_DOCUMENT__GENERAL_DESCRIPTION_SECTION:
				setGeneralDescriptionSection((VSRSSoftwareOverview)null);
				return;
			case srsPackage.VSRS_DOCUMENT__REQUIREMENTS_SECTION:
				setRequirementsSection((VSRSRequirements)null);
				return;
			case srsPackage.VSRS_DOCUMENT__TRACEABILTY_SECTION:
				setTraceabiltySection((VSRSTraceabilty)null);
				return;
			case srsPackage.VSRS_DOCUMENT__LOGICAL_MODELS_SECTION:
				setLogicalModelsSection((VSRSLogicalModels)null);
				return;
			case srsPackage.VSRS_DOCUMENT__SRS_FIGURES:
				getSrsFigures().clear();
				return;
			case srsPackage.VSRS_DOCUMENT__SRS_TABLES:
				getSrsTables().clear();
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
			case srsPackage.VSRS_DOCUMENT__INTRODUCTION_SECTION:
				return introductionSection != null;
			case srsPackage.VSRS_DOCUMENT__APPLICABLE_DOCUMENTS_SECTION:
				return applicableDocumentsSection != null;
			case srsPackage.VSRS_DOCUMENT__REFERENCE_DOCUMENTS_SECTION:
				return referenceDocumentsSection != null;
			case srsPackage.VSRS_DOCUMENT__TERMS_DEFINITIONS_ABBREVIATIONS_SECTION:
				return termsDefinitionsAbbreviationsSection != null;
			case srsPackage.VSRS_DOCUMENT__GENERAL_DESCRIPTION_SECTION:
				return generalDescriptionSection != null;
			case srsPackage.VSRS_DOCUMENT__REQUIREMENTS_SECTION:
				return requirementsSection != null;
			case srsPackage.VSRS_DOCUMENT__TRACEABILTY_SECTION:
				return traceabiltySection != null;
			case srsPackage.VSRS_DOCUMENT__LOGICAL_MODELS_SECTION:
				return logicalModelsSection != null;
			case srsPackage.VSRS_DOCUMENT__SRS_FIGURES:
				return srsFigures != null && !srsFigures.isEmpty();
			case srsPackage.VSRS_DOCUMENT__SRS_TABLES:
				return srsTables != null && !srsTables.isEmpty();
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
				case srsPackage.VSRS_DOCUMENT__APPLICABLE_DOCUMENTS: return docPackage.DDOCUMENT_TEMPLATE__APPLICABLE_DOCUMENTS;
				case srsPackage.VSRS_DOCUMENT__REFERENCE_DOCUMENTS: return docPackage.DDOCUMENT_TEMPLATE__REFERENCE_DOCUMENTS;
				case srsPackage.VSRS_DOCUMENT__FIGURES: return docPackage.DDOCUMENT_TEMPLATE__FIGURES;
				case srsPackage.VSRS_DOCUMENT__TABLES: return docPackage.DDOCUMENT_TEMPLATE__TABLES;
				case srsPackage.VSRS_DOCUMENT__SECTIONS: return docPackage.DDOCUMENT_TEMPLATE__SECTIONS;
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
				case docPackage.DDOCUMENT_TEMPLATE__APPLICABLE_DOCUMENTS: return srsPackage.VSRS_DOCUMENT__APPLICABLE_DOCUMENTS;
				case docPackage.DDOCUMENT_TEMPLATE__REFERENCE_DOCUMENTS: return srsPackage.VSRS_DOCUMENT__REFERENCE_DOCUMENTS;
				case docPackage.DDOCUMENT_TEMPLATE__FIGURES: return srsPackage.VSRS_DOCUMENT__FIGURES;
				case docPackage.DDOCUMENT_TEMPLATE__TABLES: return srsPackage.VSRS_DOCUMENT__TABLES;
				case docPackage.DDOCUMENT_TEMPLATE__SECTIONS: return srsPackage.VSRS_DOCUMENT__SECTIONS;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //VSRSDocumentImpl
