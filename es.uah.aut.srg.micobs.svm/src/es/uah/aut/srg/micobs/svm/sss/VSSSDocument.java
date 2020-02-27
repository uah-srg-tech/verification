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
package es.uah.aut.srg.micobs.svm.sss;

import org.eclipse.emf.common.util.EList;

import es.uah.aut.srg.micobs.doctpl.doctpl.DDocumentTemplate;
import es.uah.aut.srg.micobs.doctpl.doctpl.DReferenceableObject;
import es.uah.aut.srg.micobs.svm.tdm.VTraceableDocument;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>VSSS Document</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link es.uah.aut.srg.micobs.svm.sss.VSSSDocument#getTbcsTbdsSection <em>Tbcs Tbds Section</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.svm.sss.VSSSDocument#getIntroductionSection <em>Introduction Section</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.svm.sss.VSSSDocument#getApplicableDocumentsSection <em>Applicable Documents Section</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.svm.sss.VSSSDocument#getReferenceDocumentsSection <em>Reference Documents Section</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.svm.sss.VSSSDocument#getTermsDefinitionsAbbreviationsSection <em>Terms Definitions Abbreviations Section</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.svm.sss.VSSSDocument#getGeneralDescriptionSection <em>General Description Section</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.svm.sss.VSSSDocument#getSpecificRequirementsSection <em>Specific Requirements Section</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.svm.sss.VSSSDocument#getVerificationValidationIntegrationSection <em>Verification Validation Integration Section</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.svm.sss.VSSSDocument#getSystemModelsSection <em>System Models Section</em>}</li>
 * </ul>
 *
 * @see es.uah.aut.srg.micobs.svm.sss.sssPackage#getVSSSDocument()
 * @model
 * @generated
 */
public interface VSSSDocument extends VTraceableDocument, DDocumentTemplate {
	/**
	 * Returns the value of the '<em><b>Introduction Section</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Introduction Section</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Introduction Section</em>' containment reference.
	 * @see #setIntroductionSection(VSSSIntroduction)
	 * @see es.uah.aut.srg.micobs.svm.sss.sssPackage#getVSSSDocument_IntroductionSection()
	 * @model containment="true" required="true"
	 * @generated
	 */
	VSSSIntroduction getIntroductionSection();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.micobs.svm.sss.VSSSDocument#getIntroductionSection <em>Introduction Section</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Introduction Section</em>' containment reference.
	 * @see #getIntroductionSection()
	 * @generated
	 */
	void setIntroductionSection(VSSSIntroduction value);

	/**
	 * Returns the value of the '<em><b>Tbcs Tbds Section</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tbcs Tbds Section</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tbcs Tbds Section</em>' containment reference.
	 * @see #setTbcsTbdsSection(VSSSTBCsTBDs)
	 * @see es.uah.aut.srg.micobs.svm.sss.sssPackage#getVSSSDocument_TbcsTbdsSection()
	 * @model containment="true"
	 * @generated
	 */
	VSSSTBCsTBDs getTbcsTbdsSection();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.micobs.svm.sss.VSSSDocument#getTbcsTbdsSection <em>Tbcs Tbds Section</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tbcs Tbds Section</em>' containment reference.
	 * @see #getTbcsTbdsSection()
	 * @generated
	 */
	void setTbcsTbdsSection(VSSSTBCsTBDs value);

	/**
	 * Returns the value of the '<em><b>Applicable Documents Section</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Applicable Documents Section</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Applicable Documents Section</em>' containment reference.
	 * @see #setApplicableDocumentsSection(VSSSApplicableDocuments)
	 * @see es.uah.aut.srg.micobs.svm.sss.sssPackage#getVSSSDocument_ApplicableDocumentsSection()
	 * @model containment="true" required="true"
	 * @generated
	 */
	VSSSApplicableDocuments getApplicableDocumentsSection();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.micobs.svm.sss.VSSSDocument#getApplicableDocumentsSection <em>Applicable Documents Section</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Applicable Documents Section</em>' containment reference.
	 * @see #getApplicableDocumentsSection()
	 * @generated
	 */
	void setApplicableDocumentsSection(VSSSApplicableDocuments value);

	/**
	 * Returns the value of the '<em><b>Reference Documents Section</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reference Documents Section</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reference Documents Section</em>' containment reference.
	 * @see #setReferenceDocumentsSection(VSSSReferenceDocuments)
	 * @see es.uah.aut.srg.micobs.svm.sss.sssPackage#getVSSSDocument_ReferenceDocumentsSection()
	 * @model containment="true" required="true"
	 * @generated
	 */
	VSSSReferenceDocuments getReferenceDocumentsSection();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.micobs.svm.sss.VSSSDocument#getReferenceDocumentsSection <em>Reference Documents Section</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reference Documents Section</em>' containment reference.
	 * @see #getReferenceDocumentsSection()
	 * @generated
	 */
	void setReferenceDocumentsSection(VSSSReferenceDocuments value);

	/**
	 * Returns the value of the '<em><b>Terms Definitions Abbreviations Section</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Terms Definitions Abbreviations Section</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Terms Definitions Abbreviations Section</em>' containment reference.
	 * @see #setTermsDefinitionsAbbreviationsSection(VSSSTermsDefinitionsAbbreviations)
	 * @see es.uah.aut.srg.micobs.svm.sss.sssPackage#getVSSSDocument_TermsDefinitionsAbbreviationsSection()
	 * @model containment="true" required="true"
	 * @generated
	 */
	VSSSTermsDefinitionsAbbreviations getTermsDefinitionsAbbreviationsSection();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.micobs.svm.sss.VSSSDocument#getTermsDefinitionsAbbreviationsSection <em>Terms Definitions Abbreviations Section</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Terms Definitions Abbreviations Section</em>' containment reference.
	 * @see #getTermsDefinitionsAbbreviationsSection()
	 * @generated
	 */
	void setTermsDefinitionsAbbreviationsSection(VSSSTermsDefinitionsAbbreviations value);

	/**
	 * Returns the value of the '<em><b>General Description Section</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>General Description Section</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>General Description Section</em>' containment reference.
	 * @see #setGeneralDescriptionSection(VSSSGeneralDescription)
	 * @see es.uah.aut.srg.micobs.svm.sss.sssPackage#getVSSSDocument_GeneralDescriptionSection()
	 * @model containment="true" required="true"
	 * @generated
	 */
	VSSSGeneralDescription getGeneralDescriptionSection();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.micobs.svm.sss.VSSSDocument#getGeneralDescriptionSection <em>General Description Section</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>General Description Section</em>' containment reference.
	 * @see #getGeneralDescriptionSection()
	 * @generated
	 */
	void setGeneralDescriptionSection(VSSSGeneralDescription value);

	/**
	 * Returns the value of the '<em><b>Specific Requirements Section</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Specific Requirements Section</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Specific Requirements Section</em>' containment reference.
	 * @see #setSpecificRequirementsSection(VSSSSpecificRequirements)
	 * @see es.uah.aut.srg.micobs.svm.sss.sssPackage#getVSSSDocument_SpecificRequirementsSection()
	 * @model containment="true" required="true"
	 * @generated
	 */
	VSSSSpecificRequirements getSpecificRequirementsSection();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.micobs.svm.sss.VSSSDocument#getSpecificRequirementsSection <em>Specific Requirements Section</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Specific Requirements Section</em>' containment reference.
	 * @see #getSpecificRequirementsSection()
	 * @generated
	 */
	void setSpecificRequirementsSection(VSSSSpecificRequirements value);

	/**
	 * Returns the value of the '<em><b>Verification Validation Integration Section</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Verification Validation Integration Section</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Verification Validation Integration Section</em>' containment reference.
	 * @see #setVerificationValidationIntegrationSection(VSSSVerificationValidationIntegrationRequirements)
	 * @see es.uah.aut.srg.micobs.svm.sss.sssPackage#getVSSSDocument_VerificationValidationIntegrationSection()
	 * @model containment="true" required="true"
	 * @generated
	 */
	VSSSVerificationValidationIntegrationRequirements getVerificationValidationIntegrationSection();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.micobs.svm.sss.VSSSDocument#getVerificationValidationIntegrationSection <em>Verification Validation Integration Section</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Verification Validation Integration Section</em>' containment reference.
	 * @see #getVerificationValidationIntegrationSection()
	 * @generated
	 */
	void setVerificationValidationIntegrationSection(VSSSVerificationValidationIntegrationRequirements value);

	/**
	 * Returns the value of the '<em><b>System Models Section</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>System Models Section</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>System Models Section</em>' containment reference.
	 * @see #setSystemModelsSection(VSSSSystemModels)
	 * @see es.uah.aut.srg.micobs.svm.sss.sssPackage#getVSSSDocument_SystemModelsSection()
	 * @model containment="true" required="true"
	 * @generated
	 */
	VSSSSystemModels getSystemModelsSection();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.micobs.svm.sss.VSSSDocument#getSystemModelsSection <em>System Models Section</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>System Models Section</em>' containment reference.
	 * @see #getSystemModelsSection()
	 * @generated
	 */
	void setSystemModelsSection(VSSSSystemModels value);

	EList<DReferenceableObject> getReferenceableObjects(String ReferenceableObjectType);

} // VSSSDocument
