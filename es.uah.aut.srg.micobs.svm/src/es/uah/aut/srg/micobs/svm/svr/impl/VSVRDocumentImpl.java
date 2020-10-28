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
package es.uah.aut.srg.micobs.svm.svr.impl;

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

import es.uah.aut.srg.micobs.svm.svr.VSVRApplicableDocuments;
import es.uah.aut.srg.micobs.svm.svr.VSVRDocument;
import es.uah.aut.srg.micobs.svm.svr.VSVRIntroduction;
import es.uah.aut.srg.micobs.svm.svr.VSVRReferenceDocuments;
import es.uah.aut.srg.micobs.svm.svr.VSVRTBCsTBDs;
import es.uah.aut.srg.micobs.svm.svr.VSVRTermsDefinitionsAbbreviations;
import es.uah.aut.srg.micobs.svm.svr.svrPackage;

import es.uah.aut.srg.micobs.svm.svs.VSVSDocument;

import es.uah.aut.srg.micobs.svm.tcr.VTCRTestCampaignReport;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.ECollections;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>VSVR Document</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link es.uah.aut.srg.micobs.svm.svr.impl.VSVRDocumentImpl#getSvsParent <em>Svs Parent</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.svm.svr.impl.VSVRDocumentImpl#getTcrParent <em>Tcr Parent</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.svm.svr.impl.VSVRDocumentImpl#getTbcsTbdsSection <em>Tbcs Tbds Section</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.svm.svr.impl.VSVRDocumentImpl#getIntroductionSection <em>Introduction Section</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.svm.svr.impl.VSVRDocumentImpl#getApplicableDocumentsSection <em>Applicable Documents Section</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.svm.svr.impl.VSVRDocumentImpl#getReferenceDocumentsSection <em>Reference Documents Section</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.svm.svr.impl.VSVRDocumentImpl#getTermsDefinitionsAbbreviationsSection <em>Terms Definitions Abbreviations Section</em>}</li>
 * </ul>
 *
 * @generated
 */
public class VSVRDocumentImpl extends DDocumentTemplateImpl implements VSVRDocument {
	/**
	 * The cached value of the '{@link #getSvsParent() <em>Svs Parent</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSvsParent()
	 * @generated
	 * @ordered
	 */
	protected VSVSDocument svsParent;

	/**
	 * The cached value of the '{@link #getTcrParent() <em>Tcr Parent</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTcrParent()
	 * @generated
	 * @ordered
	 */
	protected EList<VTCRTestCampaignReport> tcrParent;

	/**
	 * The cached value of the '{@link #getTbcsTbdsSection() <em>Tbcs Tbds Section</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTbcsTbdsSection()
	 * @generated
	 * @ordered
	 */
	protected VSVRTBCsTBDs tbcsTbdsSection;

	/**
	 * The cached value of the '{@link #getIntroductionSection() <em>Introduction Section</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIntroductionSection()
	 * @generated
	 * @ordered
	 */
	protected VSVRIntroduction introductionSection;

	/**
	 * The cached value of the '{@link #getApplicableDocumentsSection() <em>Applicable Documents Section</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getApplicableDocumentsSection()
	 * @generated
	 * @ordered
	 */
	protected VSVRApplicableDocuments applicableDocumentsSection;

	/**
	 * The cached value of the '{@link #getReferenceDocumentsSection() <em>Reference Documents Section</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReferenceDocumentsSection()
	 * @generated
	 * @ordered
	 */
	protected VSVRReferenceDocuments referenceDocumentsSection;

	/**
	 * The cached value of the '{@link #getTermsDefinitionsAbbreviationsSection() <em>Terms Definitions Abbreviations Section</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTermsDefinitionsAbbreviationsSection()
	 * @generated
	 * @ordered
	 */
	protected VSVRTermsDefinitionsAbbreviations termsDefinitionsAbbreviationsSection;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VSVRDocumentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return svrPackage.Literals.VSVR_DOCUMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VSVSDocument getSvsParent() {
		if (svsParent != null && svsParent.eIsProxy()) {
			InternalEObject oldSvsParent = (InternalEObject)svsParent;
			svsParent = (VSVSDocument)eResolveProxy(oldSvsParent);
			if (svsParent != oldSvsParent) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, svrPackage.VSVR_DOCUMENT__SVS_PARENT, oldSvsParent, svsParent));
			}
		}
		return svsParent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VSVSDocument basicGetSvsParent() {
		return svsParent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSvsParent(VSVSDocument newSvsParent) {
		VSVSDocument oldSvsParent = svsParent;
		svsParent = newSvsParent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, svrPackage.VSVR_DOCUMENT__SVS_PARENT, oldSvsParent, svsParent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<VTCRTestCampaignReport> getTcrParent() {
		if (tcrParent == null) {
			tcrParent = new EObjectResolvingEList<VTCRTestCampaignReport>(VTCRTestCampaignReport.class, this, svrPackage.VSVR_DOCUMENT__TCR_PARENT);
		}
		return tcrParent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VSVRTBCsTBDs getTbcsTbdsSection() {
		return tbcsTbdsSection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTbcsTbdsSection(VSVRTBCsTBDs newTbcsTbdsSection, NotificationChain msgs) {
		VSVRTBCsTBDs oldTbcsTbdsSection = tbcsTbdsSection;
		tbcsTbdsSection = newTbcsTbdsSection;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, svrPackage.VSVR_DOCUMENT__TBCS_TBDS_SECTION, oldTbcsTbdsSection, newTbcsTbdsSection);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTbcsTbdsSection(VSVRTBCsTBDs newTbcsTbdsSection) {
		if (newTbcsTbdsSection != tbcsTbdsSection) {
			NotificationChain msgs = null;
			if (tbcsTbdsSection != null)
				msgs = ((InternalEObject)tbcsTbdsSection).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - svrPackage.VSVR_DOCUMENT__TBCS_TBDS_SECTION, null, msgs);
			if (newTbcsTbdsSection != null)
				msgs = ((InternalEObject)newTbcsTbdsSection).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - svrPackage.VSVR_DOCUMENT__TBCS_TBDS_SECTION, null, msgs);
			msgs = basicSetTbcsTbdsSection(newTbcsTbdsSection, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, svrPackage.VSVR_DOCUMENT__TBCS_TBDS_SECTION, newTbcsTbdsSection, newTbcsTbdsSection));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VSVRIntroduction getIntroductionSection() {
		return introductionSection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIntroductionSection(VSVRIntroduction newIntroductionSection, NotificationChain msgs) {
		VSVRIntroduction oldIntroductionSection = introductionSection;
		introductionSection = newIntroductionSection;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, svrPackage.VSVR_DOCUMENT__INTRODUCTION_SECTION, oldIntroductionSection, newIntroductionSection);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIntroductionSection(VSVRIntroduction newIntroductionSection) {
		if (newIntroductionSection != introductionSection) {
			NotificationChain msgs = null;
			if (introductionSection != null)
				msgs = ((InternalEObject)introductionSection).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - svrPackage.VSVR_DOCUMENT__INTRODUCTION_SECTION, null, msgs);
			if (newIntroductionSection != null)
				msgs = ((InternalEObject)newIntroductionSection).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - svrPackage.VSVR_DOCUMENT__INTRODUCTION_SECTION, null, msgs);
			msgs = basicSetIntroductionSection(newIntroductionSection, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, svrPackage.VSVR_DOCUMENT__INTRODUCTION_SECTION, newIntroductionSection, newIntroductionSection));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VSVRApplicableDocuments getApplicableDocumentsSection() {
		return applicableDocumentsSection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetApplicableDocumentsSection(VSVRApplicableDocuments newApplicableDocumentsSection, NotificationChain msgs) {
		VSVRApplicableDocuments oldApplicableDocumentsSection = applicableDocumentsSection;
		applicableDocumentsSection = newApplicableDocumentsSection;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, svrPackage.VSVR_DOCUMENT__APPLICABLE_DOCUMENTS_SECTION, oldApplicableDocumentsSection, newApplicableDocumentsSection);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setApplicableDocumentsSection(VSVRApplicableDocuments newApplicableDocumentsSection) {
		if (newApplicableDocumentsSection != applicableDocumentsSection) {
			NotificationChain msgs = null;
			if (applicableDocumentsSection != null)
				msgs = ((InternalEObject)applicableDocumentsSection).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - svrPackage.VSVR_DOCUMENT__APPLICABLE_DOCUMENTS_SECTION, null, msgs);
			if (newApplicableDocumentsSection != null)
				msgs = ((InternalEObject)newApplicableDocumentsSection).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - svrPackage.VSVR_DOCUMENT__APPLICABLE_DOCUMENTS_SECTION, null, msgs);
			msgs = basicSetApplicableDocumentsSection(newApplicableDocumentsSection, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, svrPackage.VSVR_DOCUMENT__APPLICABLE_DOCUMENTS_SECTION, newApplicableDocumentsSection, newApplicableDocumentsSection));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VSVRReferenceDocuments getReferenceDocumentsSection() {
		return referenceDocumentsSection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetReferenceDocumentsSection(VSVRReferenceDocuments newReferenceDocumentsSection, NotificationChain msgs) {
		VSVRReferenceDocuments oldReferenceDocumentsSection = referenceDocumentsSection;
		referenceDocumentsSection = newReferenceDocumentsSection;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, svrPackage.VSVR_DOCUMENT__REFERENCE_DOCUMENTS_SECTION, oldReferenceDocumentsSection, newReferenceDocumentsSection);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReferenceDocumentsSection(VSVRReferenceDocuments newReferenceDocumentsSection) {
		if (newReferenceDocumentsSection != referenceDocumentsSection) {
			NotificationChain msgs = null;
			if (referenceDocumentsSection != null)
				msgs = ((InternalEObject)referenceDocumentsSection).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - svrPackage.VSVR_DOCUMENT__REFERENCE_DOCUMENTS_SECTION, null, msgs);
			if (newReferenceDocumentsSection != null)
				msgs = ((InternalEObject)newReferenceDocumentsSection).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - svrPackage.VSVR_DOCUMENT__REFERENCE_DOCUMENTS_SECTION, null, msgs);
			msgs = basicSetReferenceDocumentsSection(newReferenceDocumentsSection, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, svrPackage.VSVR_DOCUMENT__REFERENCE_DOCUMENTS_SECTION, newReferenceDocumentsSection, newReferenceDocumentsSection));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VSVRTermsDefinitionsAbbreviations getTermsDefinitionsAbbreviationsSection() {
		return termsDefinitionsAbbreviationsSection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTermsDefinitionsAbbreviationsSection(VSVRTermsDefinitionsAbbreviations newTermsDefinitionsAbbreviationsSection, NotificationChain msgs) {
		VSVRTermsDefinitionsAbbreviations oldTermsDefinitionsAbbreviationsSection = termsDefinitionsAbbreviationsSection;
		termsDefinitionsAbbreviationsSection = newTermsDefinitionsAbbreviationsSection;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, svrPackage.VSVR_DOCUMENT__TERMS_DEFINITIONS_ABBREVIATIONS_SECTION, oldTermsDefinitionsAbbreviationsSection, newTermsDefinitionsAbbreviationsSection);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTermsDefinitionsAbbreviationsSection(VSVRTermsDefinitionsAbbreviations newTermsDefinitionsAbbreviationsSection) {
		if (newTermsDefinitionsAbbreviationsSection != termsDefinitionsAbbreviationsSection) {
			NotificationChain msgs = null;
			if (termsDefinitionsAbbreviationsSection != null)
				msgs = ((InternalEObject)termsDefinitionsAbbreviationsSection).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - svrPackage.VSVR_DOCUMENT__TERMS_DEFINITIONS_ABBREVIATIONS_SECTION, null, msgs);
			if (newTermsDefinitionsAbbreviationsSection != null)
				msgs = ((InternalEObject)newTermsDefinitionsAbbreviationsSection).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - svrPackage.VSVR_DOCUMENT__TERMS_DEFINITIONS_ABBREVIATIONS_SECTION, null, msgs);
			msgs = basicSetTermsDefinitionsAbbreviationsSection(newTermsDefinitionsAbbreviationsSection, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, svrPackage.VSVR_DOCUMENT__TERMS_DEFINITIONS_ABBREVIATIONS_SECTION, newTermsDefinitionsAbbreviationsSection, newTermsDefinitionsAbbreviationsSection));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case svrPackage.VSVR_DOCUMENT__TBCS_TBDS_SECTION:
				return basicSetTbcsTbdsSection(null, msgs);
			case svrPackage.VSVR_DOCUMENT__INTRODUCTION_SECTION:
				return basicSetIntroductionSection(null, msgs);
			case svrPackage.VSVR_DOCUMENT__APPLICABLE_DOCUMENTS_SECTION:
				return basicSetApplicableDocumentsSection(null, msgs);
			case svrPackage.VSVR_DOCUMENT__REFERENCE_DOCUMENTS_SECTION:
				return basicSetReferenceDocumentsSection(null, msgs);
			case svrPackage.VSVR_DOCUMENT__TERMS_DEFINITIONS_ABBREVIATIONS_SECTION:
				return basicSetTermsDefinitionsAbbreviationsSection(null, msgs);
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
			case svrPackage.VSVR_DOCUMENT__SVS_PARENT:
				if (resolve) return getSvsParent();
				return basicGetSvsParent();
			case svrPackage.VSVR_DOCUMENT__TCR_PARENT:
				return getTcrParent();
			case svrPackage.VSVR_DOCUMENT__TBCS_TBDS_SECTION:
				return getTbcsTbdsSection();
			case svrPackage.VSVR_DOCUMENT__INTRODUCTION_SECTION:
				return getIntroductionSection();
			case svrPackage.VSVR_DOCUMENT__APPLICABLE_DOCUMENTS_SECTION:
				return getApplicableDocumentsSection();
			case svrPackage.VSVR_DOCUMENT__REFERENCE_DOCUMENTS_SECTION:
				return getReferenceDocumentsSection();
			case svrPackage.VSVR_DOCUMENT__TERMS_DEFINITIONS_ABBREVIATIONS_SECTION:
				return getTermsDefinitionsAbbreviationsSection();
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
			case svrPackage.VSVR_DOCUMENT__SVS_PARENT:
				setSvsParent((VSVSDocument)newValue);
				return;
			case svrPackage.VSVR_DOCUMENT__TCR_PARENT:
				getTcrParent().clear();
				getTcrParent().addAll((Collection<? extends VTCRTestCampaignReport>)newValue);
				return;
			case svrPackage.VSVR_DOCUMENT__TBCS_TBDS_SECTION:
				setTbcsTbdsSection((VSVRTBCsTBDs)newValue);
				return;
			case svrPackage.VSVR_DOCUMENT__INTRODUCTION_SECTION:
				setIntroductionSection((VSVRIntroduction)newValue);
				return;
			case svrPackage.VSVR_DOCUMENT__APPLICABLE_DOCUMENTS_SECTION:
				setApplicableDocumentsSection((VSVRApplicableDocuments)newValue);
				return;
			case svrPackage.VSVR_DOCUMENT__REFERENCE_DOCUMENTS_SECTION:
				setReferenceDocumentsSection((VSVRReferenceDocuments)newValue);
				return;
			case svrPackage.VSVR_DOCUMENT__TERMS_DEFINITIONS_ABBREVIATIONS_SECTION:
				setTermsDefinitionsAbbreviationsSection((VSVRTermsDefinitionsAbbreviations)newValue);
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
			case svrPackage.VSVR_DOCUMENT__SVS_PARENT:
				setSvsParent((VSVSDocument)null);
				return;
			case svrPackage.VSVR_DOCUMENT__TCR_PARENT:
				getTcrParent().clear();
				return;
			case svrPackage.VSVR_DOCUMENT__TBCS_TBDS_SECTION:
				setTbcsTbdsSection((VSVRTBCsTBDs)null);
				return;
			case svrPackage.VSVR_DOCUMENT__INTRODUCTION_SECTION:
				setIntroductionSection((VSVRIntroduction)null);
				return;
			case svrPackage.VSVR_DOCUMENT__APPLICABLE_DOCUMENTS_SECTION:
				setApplicableDocumentsSection((VSVRApplicableDocuments)null);
				return;
			case svrPackage.VSVR_DOCUMENT__REFERENCE_DOCUMENTS_SECTION:
				setReferenceDocumentsSection((VSVRReferenceDocuments)null);
				return;
			case svrPackage.VSVR_DOCUMENT__TERMS_DEFINITIONS_ABBREVIATIONS_SECTION:
				setTermsDefinitionsAbbreviationsSection((VSVRTermsDefinitionsAbbreviations)null);
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
			case svrPackage.VSVR_DOCUMENT__SVS_PARENT:
				return svsParent != null;
			case svrPackage.VSVR_DOCUMENT__TCR_PARENT:
				return tcrParent != null && !tcrParent.isEmpty();
			case svrPackage.VSVR_DOCUMENT__TBCS_TBDS_SECTION:
				return tbcsTbdsSection != null;
			case svrPackage.VSVR_DOCUMENT__INTRODUCTION_SECTION:
				return introductionSection != null;
			case svrPackage.VSVR_DOCUMENT__APPLICABLE_DOCUMENTS_SECTION:
				return applicableDocumentsSection != null;
			case svrPackage.VSVR_DOCUMENT__REFERENCE_DOCUMENTS_SECTION:
				return referenceDocumentsSection != null;
			case svrPackage.VSVR_DOCUMENT__TERMS_DEFINITIONS_ABBREVIATIONS_SECTION:
				return termsDefinitionsAbbreviationsSection != null;
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
		objects.addAll(getIntroductionSection().getReferenceableObjects(ReferenceableObjectType));
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
		return sections;
	}

} //VSVRDocumentImpl
