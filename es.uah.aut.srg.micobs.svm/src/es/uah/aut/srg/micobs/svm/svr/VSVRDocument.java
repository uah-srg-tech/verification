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
package es.uah.aut.srg.micobs.svm.svr;

import es.uah.aut.srg.micobs.doctpl.doctpl.DDocumentTemplate;
import es.uah.aut.srg.micobs.doctpl.doctpl.DReferenceableObject;
import es.uah.aut.srg.micobs.svm.svs.VSVSDocument;

import es.uah.aut.srg.micobs.svm.tcr.VTCRTestCampaignReport;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>VSVR Document</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link es.uah.aut.srg.micobs.svm.svr.VSVRDocument#getSvsParent <em>Svs Parent</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.svm.svr.VSVRDocument#getTcrParent <em>Tcr Parent</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.svm.svr.VSVRDocument#getTbcsTbdsSection <em>Tbcs Tbds Section</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.svm.svr.VSVRDocument#getIntroductionSection <em>Introduction Section</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.svm.svr.VSVRDocument#getApplicableDocumentsSection <em>Applicable Documents Section</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.svm.svr.VSVRDocument#getReferenceDocumentsSection <em>Reference Documents Section</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.svm.svr.VSVRDocument#getTermsDefinitionsAbbreviationsSection <em>Terms Definitions Abbreviations Section</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.svm.svr.VSVRDocument#getSwValProcessVerificationSection <em>Sw Val Process Verification Section</em>}</li>
 * </ul>
 *
 * @see es.uah.aut.srg.micobs.svm.svr.svrPackage#getVSVRDocument()
 * @model
 * @generated
 */
public interface VSVRDocument extends DDocumentTemplate {
	/**
	 * Returns the value of the '<em><b>Svs Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Svs Parent</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Svs Parent</em>' reference.
	 * @see #setSvsParent(VSVSDocument)
	 * @see es.uah.aut.srg.micobs.svm.svr.svrPackage#getVSVRDocument_SvsParent()
	 * @model required="true"
	 * @generated
	 */
	VSVSDocument getSvsParent();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.micobs.svm.svr.VSVRDocument#getSvsParent <em>Svs Parent</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Svs Parent</em>' reference.
	 * @see #getSvsParent()
	 * @generated
	 */
	void setSvsParent(VSVSDocument value);

	/**
	 * Returns the value of the '<em><b>Tcr Parent</b></em>' reference list.
	 * The list contents are of type {@link es.uah.aut.srg.micobs.svm.tcr.VTCRTestCampaignReport}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tcr Parent</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tcr Parent</em>' reference list.
	 * @see es.uah.aut.srg.micobs.svm.svr.svrPackage#getVSVRDocument_TcrParent()
	 * @model required="true"
	 * @generated
	 */
	EList<VTCRTestCampaignReport> getTcrParent();

	/**
	 * Returns the value of the '<em><b>Tbcs Tbds Section</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tbcs Tbds Section</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tbcs Tbds Section</em>' containment reference.
	 * @see #setTbcsTbdsSection(VSVRTBCsTBDs)
	 * @see es.uah.aut.srg.micobs.svm.svr.svrPackage#getVSVRDocument_TbcsTbdsSection()
	 * @model containment="true"
	 * @generated
	 */
	VSVRTBCsTBDs getTbcsTbdsSection();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.micobs.svm.svr.VSVRDocument#getTbcsTbdsSection <em>Tbcs Tbds Section</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tbcs Tbds Section</em>' containment reference.
	 * @see #getTbcsTbdsSection()
	 * @generated
	 */
	void setTbcsTbdsSection(VSVRTBCsTBDs value);

	/**
	 * Returns the value of the '<em><b>Introduction Section</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Introduction Section</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Introduction Section</em>' containment reference.
	 * @see #setIntroductionSection(VSVRIntroduction)
	 * @see es.uah.aut.srg.micobs.svm.svr.svrPackage#getVSVRDocument_IntroductionSection()
	 * @model containment="true" required="true"
	 * @generated
	 */
	VSVRIntroduction getIntroductionSection();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.micobs.svm.svr.VSVRDocument#getIntroductionSection <em>Introduction Section</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Introduction Section</em>' containment reference.
	 * @see #getIntroductionSection()
	 * @generated
	 */
	void setIntroductionSection(VSVRIntroduction value);

	/**
	 * Returns the value of the '<em><b>Applicable Documents Section</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Applicable Documents Section</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Applicable Documents Section</em>' containment reference.
	 * @see #setApplicableDocumentsSection(VSVRApplicableDocuments)
	 * @see es.uah.aut.srg.micobs.svm.svr.svrPackage#getVSVRDocument_ApplicableDocumentsSection()
	 * @model containment="true" required="true"
	 * @generated
	 */
	VSVRApplicableDocuments getApplicableDocumentsSection();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.micobs.svm.svr.VSVRDocument#getApplicableDocumentsSection <em>Applicable Documents Section</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Applicable Documents Section</em>' containment reference.
	 * @see #getApplicableDocumentsSection()
	 * @generated
	 */
	void setApplicableDocumentsSection(VSVRApplicableDocuments value);

	/**
	 * Returns the value of the '<em><b>Reference Documents Section</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reference Documents Section</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reference Documents Section</em>' containment reference.
	 * @see #setReferenceDocumentsSection(VSVRReferenceDocuments)
	 * @see es.uah.aut.srg.micobs.svm.svr.svrPackage#getVSVRDocument_ReferenceDocumentsSection()
	 * @model containment="true" required="true"
	 * @generated
	 */
	VSVRReferenceDocuments getReferenceDocumentsSection();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.micobs.svm.svr.VSVRDocument#getReferenceDocumentsSection <em>Reference Documents Section</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reference Documents Section</em>' containment reference.
	 * @see #getReferenceDocumentsSection()
	 * @generated
	 */
	void setReferenceDocumentsSection(VSVRReferenceDocuments value);

	/**
	 * Returns the value of the '<em><b>Terms Definitions Abbreviations Section</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Terms Definitions Abbreviations Section</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Terms Definitions Abbreviations Section</em>' containment reference.
	 * @see #setTermsDefinitionsAbbreviationsSection(VSVRTermsDefinitionsAbbreviations)
	 * @see es.uah.aut.srg.micobs.svm.svr.svrPackage#getVSVRDocument_TermsDefinitionsAbbreviationsSection()
	 * @model containment="true" required="true"
	 * @generated
	 */
	VSVRTermsDefinitionsAbbreviations getTermsDefinitionsAbbreviationsSection();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.micobs.svm.svr.VSVRDocument#getTermsDefinitionsAbbreviationsSection <em>Terms Definitions Abbreviations Section</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Terms Definitions Abbreviations Section</em>' containment reference.
	 * @see #getTermsDefinitionsAbbreviationsSection()
	 * @generated
	 */
	void setTermsDefinitionsAbbreviationsSection(VSVRTermsDefinitionsAbbreviations value);

	/**
	 * Returns the value of the '<em><b>Sw Val Process Verification Section</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sw Val Process Verification Section</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sw Val Process Verification Section</em>' containment reference.
	 * @see #setSwValProcessVerificationSection(VSVRSWValProcessVerification)
	 * @see es.uah.aut.srg.micobs.svm.svr.svrPackage#getVSVRDocument_SwValProcessVerificationSection()
	 * @model containment="true" required="true"
	 * @generated
	 */
	VSVRSWValProcessVerification getSwValProcessVerificationSection();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.micobs.svm.svr.VSVRDocument#getSwValProcessVerificationSection <em>Sw Val Process Verification Section</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sw Val Process Verification Section</em>' containment reference.
	 * @see #getSwValProcessVerificationSection()
	 * @generated
	 */
	void setSwValProcessVerificationSection(VSVRSWValProcessVerification value);

	EList<DReferenceableObject> getReferenceableObjects(String ReferenceableObjectType);

} // VSVRDocument
