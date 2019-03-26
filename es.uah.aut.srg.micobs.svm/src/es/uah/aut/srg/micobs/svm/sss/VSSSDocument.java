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

import es.uah.aut.srg.micobs.doctpl.doc.DDocumentTemplate;

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
 *   <li>{@link es.uah.aut.srg.micobs.svm.sss.VSSSDocument#getIntroduction <em>Introduction</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.svm.sss.VSSSDocument#getApplicableDocumentsSection <em>Applicable Documents Section</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.svm.sss.VSSSDocument#getReferenceDocumentsSection <em>Reference Documents Section</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.svm.sss.VSSSDocument#getTermsDefinitionsAbbreviations <em>Terms Definitions Abbreviations</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.svm.sss.VSSSDocument#getGeneralDescription <em>General Description</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.svm.sss.VSSSDocument#getSpecificRequirements <em>Specific Requirements</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.svm.sss.VSSSDocument#getVerificationValidationIntegration <em>Verification Validation Integration</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.svm.sss.VSSSDocument#getSystemModels <em>System Models</em>}</li>
 * </ul>
 *
 * @see es.uah.aut.srg.micobs.svm.sss.sssPackage#getVSSSDocument()
 * @model
 * @generated
 */
public interface VSSSDocument extends DDocumentTemplate, VTraceableDocument {
	/**
	 * Returns the value of the '<em><b>Introduction</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Introduction</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Introduction</em>' containment reference.
	 * @see #setIntroduction(VSSSIntroduction)
	 * @see es.uah.aut.srg.micobs.svm.sss.sssPackage#getVSSSDocument_Introduction()
	 * @model containment="true" required="true"
	 * @generated
	 */
	VSSSIntroduction getIntroduction();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.micobs.svm.sss.VSSSDocument#getIntroduction <em>Introduction</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Introduction</em>' containment reference.
	 * @see #getIntroduction()
	 * @generated
	 */
	void setIntroduction(VSSSIntroduction value);

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
	 * Returns the value of the '<em><b>Terms Definitions Abbreviations</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Terms Definitions Abbreviations</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Terms Definitions Abbreviations</em>' containment reference.
	 * @see #setTermsDefinitionsAbbreviations(VSSSTermsDefinitionsAbbreviations)
	 * @see es.uah.aut.srg.micobs.svm.sss.sssPackage#getVSSSDocument_TermsDefinitionsAbbreviations()
	 * @model containment="true" required="true"
	 * @generated
	 */
	VSSSTermsDefinitionsAbbreviations getTermsDefinitionsAbbreviations();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.micobs.svm.sss.VSSSDocument#getTermsDefinitionsAbbreviations <em>Terms Definitions Abbreviations</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Terms Definitions Abbreviations</em>' containment reference.
	 * @see #getTermsDefinitionsAbbreviations()
	 * @generated
	 */
	void setTermsDefinitionsAbbreviations(VSSSTermsDefinitionsAbbreviations value);

	/**
	 * Returns the value of the '<em><b>General Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>General Description</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>General Description</em>' containment reference.
	 * @see #setGeneralDescription(VSSSGeneralDescription)
	 * @see es.uah.aut.srg.micobs.svm.sss.sssPackage#getVSSSDocument_GeneralDescription()
	 * @model containment="true" required="true"
	 * @generated
	 */
	VSSSGeneralDescription getGeneralDescription();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.micobs.svm.sss.VSSSDocument#getGeneralDescription <em>General Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>General Description</em>' containment reference.
	 * @see #getGeneralDescription()
	 * @generated
	 */
	void setGeneralDescription(VSSSGeneralDescription value);

	/**
	 * Returns the value of the '<em><b>Specific Requirements</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Specific Requirements</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Specific Requirements</em>' containment reference.
	 * @see #setSpecificRequirements(VSSSSpecificRequirements)
	 * @see es.uah.aut.srg.micobs.svm.sss.sssPackage#getVSSSDocument_SpecificRequirements()
	 * @model containment="true" required="true"
	 * @generated
	 */
	VSSSSpecificRequirements getSpecificRequirements();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.micobs.svm.sss.VSSSDocument#getSpecificRequirements <em>Specific Requirements</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Specific Requirements</em>' containment reference.
	 * @see #getSpecificRequirements()
	 * @generated
	 */
	void setSpecificRequirements(VSSSSpecificRequirements value);

	/**
	 * Returns the value of the '<em><b>Verification Validation Integration</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Verification Validation Integration</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Verification Validation Integration</em>' containment reference.
	 * @see #setVerificationValidationIntegration(VSSSVerificationValidationIntegrationRequirements)
	 * @see es.uah.aut.srg.micobs.svm.sss.sssPackage#getVSSSDocument_VerificationValidationIntegration()
	 * @model containment="true" required="true"
	 * @generated
	 */
	VSSSVerificationValidationIntegrationRequirements getVerificationValidationIntegration();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.micobs.svm.sss.VSSSDocument#getVerificationValidationIntegration <em>Verification Validation Integration</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Verification Validation Integration</em>' containment reference.
	 * @see #getVerificationValidationIntegration()
	 * @generated
	 */
	void setVerificationValidationIntegration(VSSSVerificationValidationIntegrationRequirements value);

	/**
	 * Returns the value of the '<em><b>System Models</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>System Models</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>System Models</em>' containment reference.
	 * @see #setSystemModels(VSSSSystemModels)
	 * @see es.uah.aut.srg.micobs.svm.sss.sssPackage#getVSSSDocument_SystemModels()
	 * @model containment="true"
	 * @generated
	 */
	VSSSSystemModels getSystemModels();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.micobs.svm.sss.VSSSDocument#getSystemModels <em>System Models</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>System Models</em>' containment reference.
	 * @see #getSystemModels()
	 * @generated
	 */
	void setSystemModels(VSSSSystemModels value);

} // VSSSDocument
