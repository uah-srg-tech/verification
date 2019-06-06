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
package es.uah.aut.srg.micobs.svm.svs;

import es.uah.aut.srg.micobs.doctpl.doc.DAbstractFigure;
import es.uah.aut.srg.micobs.doctpl.doc.DAbstractTable;
import es.uah.aut.srg.micobs.doctpl.doc.DDocumentTemplate;

import es.uah.aut.srg.micobs.svm.vdm.VValidationDocument;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>VSVS Document</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link es.uah.aut.srg.micobs.svm.svs.VSVSDocument#getIntroductionSection <em>Introduction Section</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.svm.svs.VSVSDocument#getApplicableDocumentsSection <em>Applicable Documents Section</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.svm.svs.VSVSDocument#getReferenceDocumentsSection <em>Reference Documents Section</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.svm.svs.VSVSDocument#getTermsDefinitionsAbbreviationsSection <em>Terms Definitions Abbreviations Section</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.svm.svs.VSVSDocument#getSoftwareOverviewSection <em>Software Overview Section</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.svm.svs.VSVSDocument#getTaskIdentificationSection <em>Task Identification Section</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.svm.svs.VSVSDocument#getTestingSpecificationDesignSection <em>Testing Specification Design Section</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.svm.svs.VSVSDocument#getTestCasesSection <em>Test Cases Section</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.svm.svs.VSVSDocument#getTestProceduresSection <em>Test Procedures Section</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.svm.svs.VSVSDocument#getAnalysisInspectionReviewSection <em>Analysis Inspection Review Section</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.svm.svs.VSVSDocument#getTestPlatformRequirementsSection <em>Test Platform Requirements Section</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.svm.svs.VSVSDocument#getAdditionalInformationSection <em>Additional Information Section</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.svm.svs.VSVSDocument#getSvsFigures <em>Svs Figures</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.svm.svs.VSVSDocument#getSvsTables <em>Svs Tables</em>}</li>
 * </ul>
 *
 * @see es.uah.aut.srg.micobs.svm.svs.svsPackage#getVSVSDocument()
 * @model
 * @generated
 */
public interface VSVSDocument extends VValidationDocument, DDocumentTemplate {
	/**
	 * Returns the value of the '<em><b>Introduction Section</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Introduction Section</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Introduction Section</em>' containment reference.
	 * @see #setIntroductionSection(VSVSIntroduction)
	 * @see es.uah.aut.srg.micobs.svm.svs.svsPackage#getVSVSDocument_IntroductionSection()
	 * @model containment="true" required="true"
	 * @generated
	 */
	VSVSIntroduction getIntroductionSection();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.micobs.svm.svs.VSVSDocument#getIntroductionSection <em>Introduction Section</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Introduction Section</em>' containment reference.
	 * @see #getIntroductionSection()
	 * @generated
	 */
	void setIntroductionSection(VSVSIntroduction value);

	/**
	 * Returns the value of the '<em><b>Applicable Documents Section</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Applicable Documents Section</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Applicable Documents Section</em>' containment reference.
	 * @see #setApplicableDocumentsSection(VSVSApplicableDocuments)
	 * @see es.uah.aut.srg.micobs.svm.svs.svsPackage#getVSVSDocument_ApplicableDocumentsSection()
	 * @model containment="true" required="true"
	 * @generated
	 */
	VSVSApplicableDocuments getApplicableDocumentsSection();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.micobs.svm.svs.VSVSDocument#getApplicableDocumentsSection <em>Applicable Documents Section</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Applicable Documents Section</em>' containment reference.
	 * @see #getApplicableDocumentsSection()
	 * @generated
	 */
	void setApplicableDocumentsSection(VSVSApplicableDocuments value);

	/**
	 * Returns the value of the '<em><b>Reference Documents Section</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reference Documents Section</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reference Documents Section</em>' containment reference.
	 * @see #setReferenceDocumentsSection(VSVSReferenceDocuments)
	 * @see es.uah.aut.srg.micobs.svm.svs.svsPackage#getVSVSDocument_ReferenceDocumentsSection()
	 * @model containment="true" required="true"
	 * @generated
	 */
	VSVSReferenceDocuments getReferenceDocumentsSection();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.micobs.svm.svs.VSVSDocument#getReferenceDocumentsSection <em>Reference Documents Section</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reference Documents Section</em>' containment reference.
	 * @see #getReferenceDocumentsSection()
	 * @generated
	 */
	void setReferenceDocumentsSection(VSVSReferenceDocuments value);

	/**
	 * Returns the value of the '<em><b>Terms Definitions Abbreviations Section</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Terms Definitions Abbreviations Section</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Terms Definitions Abbreviations Section</em>' containment reference.
	 * @see #setTermsDefinitionsAbbreviationsSection(VSVSTermsDefinitionsAbbreviations)
	 * @see es.uah.aut.srg.micobs.svm.svs.svsPackage#getVSVSDocument_TermsDefinitionsAbbreviationsSection()
	 * @model containment="true" required="true"
	 * @generated
	 */
	VSVSTermsDefinitionsAbbreviations getTermsDefinitionsAbbreviationsSection();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.micobs.svm.svs.VSVSDocument#getTermsDefinitionsAbbreviationsSection <em>Terms Definitions Abbreviations Section</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Terms Definitions Abbreviations Section</em>' containment reference.
	 * @see #getTermsDefinitionsAbbreviationsSection()
	 * @generated
	 */
	void setTermsDefinitionsAbbreviationsSection(VSVSTermsDefinitionsAbbreviations value);

	/**
	 * Returns the value of the '<em><b>Software Overview Section</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Software Overview Section</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Software Overview Section</em>' containment reference.
	 * @see #setSoftwareOverviewSection(VSVSSoftwareOverview)
	 * @see es.uah.aut.srg.micobs.svm.svs.svsPackage#getVSVSDocument_SoftwareOverviewSection()
	 * @model containment="true" required="true"
	 * @generated
	 */
	VSVSSoftwareOverview getSoftwareOverviewSection();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.micobs.svm.svs.VSVSDocument#getSoftwareOverviewSection <em>Software Overview Section</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Software Overview Section</em>' containment reference.
	 * @see #getSoftwareOverviewSection()
	 * @generated
	 */
	void setSoftwareOverviewSection(VSVSSoftwareOverview value);

	/**
	 * Returns the value of the '<em><b>Task Identification Section</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Task Identification Section</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Task Identification Section</em>' containment reference.
	 * @see #setTaskIdentificationSection(VSVSTaskIdentification)
	 * @see es.uah.aut.srg.micobs.svm.svs.svsPackage#getVSVSDocument_TaskIdentificationSection()
	 * @model containment="true" required="true"
	 * @generated
	 */
	VSVSTaskIdentification getTaskIdentificationSection();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.micobs.svm.svs.VSVSDocument#getTaskIdentificationSection <em>Task Identification Section</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Task Identification Section</em>' containment reference.
	 * @see #getTaskIdentificationSection()
	 * @generated
	 */
	void setTaskIdentificationSection(VSVSTaskIdentification value);

	/**
	 * Returns the value of the '<em><b>Testing Specification Design Section</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Testing Specification Design Section</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Testing Specification Design Section</em>' containment reference.
	 * @see #setTestingSpecificationDesignSection(VSVSTestingSpecificationDesign)
	 * @see es.uah.aut.srg.micobs.svm.svs.svsPackage#getVSVSDocument_TestingSpecificationDesignSection()
	 * @model containment="true" required="true"
	 * @generated
	 */
	VSVSTestingSpecificationDesign getTestingSpecificationDesignSection();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.micobs.svm.svs.VSVSDocument#getTestingSpecificationDesignSection <em>Testing Specification Design Section</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Testing Specification Design Section</em>' containment reference.
	 * @see #getTestingSpecificationDesignSection()
	 * @generated
	 */
	void setTestingSpecificationDesignSection(VSVSTestingSpecificationDesign value);

	/**
	 * Returns the value of the '<em><b>Test Cases Section</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Test Cases Section</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Test Cases Section</em>' containment reference.
	 * @see #setTestCasesSection(VSVSTestCases)
	 * @see es.uah.aut.srg.micobs.svm.svs.svsPackage#getVSVSDocument_TestCasesSection()
	 * @model containment="true" required="true"
	 * @generated
	 */
	VSVSTestCases getTestCasesSection();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.micobs.svm.svs.VSVSDocument#getTestCasesSection <em>Test Cases Section</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Test Cases Section</em>' containment reference.
	 * @see #getTestCasesSection()
	 * @generated
	 */
	void setTestCasesSection(VSVSTestCases value);

	/**
	 * Returns the value of the '<em><b>Test Procedures Section</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Test Procedures Section</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Test Procedures Section</em>' containment reference.
	 * @see #setTestProceduresSection(VSVSTestProcedures)
	 * @see es.uah.aut.srg.micobs.svm.svs.svsPackage#getVSVSDocument_TestProceduresSection()
	 * @model containment="true" required="true"
	 * @generated
	 */
	VSVSTestProcedures getTestProceduresSection();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.micobs.svm.svs.VSVSDocument#getTestProceduresSection <em>Test Procedures Section</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Test Procedures Section</em>' containment reference.
	 * @see #getTestProceduresSection()
	 * @generated
	 */
	void setTestProceduresSection(VSVSTestProcedures value);

	/**
	 * Returns the value of the '<em><b>Analysis Inspection Review Section</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Analysis Inspection Review Section</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Analysis Inspection Review Section</em>' containment reference.
	 * @see #setAnalysisInspectionReviewSection(VSVSAnalysisInspectionReview)
	 * @see es.uah.aut.srg.micobs.svm.svs.svsPackage#getVSVSDocument_AnalysisInspectionReviewSection()
	 * @model containment="true" required="true"
	 * @generated
	 */
	VSVSAnalysisInspectionReview getAnalysisInspectionReviewSection();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.micobs.svm.svs.VSVSDocument#getAnalysisInspectionReviewSection <em>Analysis Inspection Review Section</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Analysis Inspection Review Section</em>' containment reference.
	 * @see #getAnalysisInspectionReviewSection()
	 * @generated
	 */
	void setAnalysisInspectionReviewSection(VSVSAnalysisInspectionReview value);

	/**
	 * Returns the value of the '<em><b>Test Platform Requirements Section</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Test Platform Requirements Section</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Test Platform Requirements Section</em>' containment reference.
	 * @see #setTestPlatformRequirementsSection(VSVSTestPlatformRequirements)
	 * @see es.uah.aut.srg.micobs.svm.svs.svsPackage#getVSVSDocument_TestPlatformRequirementsSection()
	 * @model containment="true" required="true"
	 * @generated
	 */
	VSVSTestPlatformRequirements getTestPlatformRequirementsSection();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.micobs.svm.svs.VSVSDocument#getTestPlatformRequirementsSection <em>Test Platform Requirements Section</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Test Platform Requirements Section</em>' containment reference.
	 * @see #getTestPlatformRequirementsSection()
	 * @generated
	 */
	void setTestPlatformRequirementsSection(VSVSTestPlatformRequirements value);

	/**
	 * Returns the value of the '<em><b>Additional Information Section</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Additional Information Section</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Additional Information Section</em>' containment reference.
	 * @see #setAdditionalInformationSection(VSVSAdditionalInformation)
	 * @see es.uah.aut.srg.micobs.svm.svs.svsPackage#getVSVSDocument_AdditionalInformationSection()
	 * @model containment="true" required="true"
	 * @generated
	 */
	VSVSAdditionalInformation getAdditionalInformationSection();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.micobs.svm.svs.VSVSDocument#getAdditionalInformationSection <em>Additional Information Section</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Additional Information Section</em>' containment reference.
	 * @see #getAdditionalInformationSection()
	 * @generated
	 */
	void setAdditionalInformationSection(VSVSAdditionalInformation value);

	/**
	 * Returns the value of the '<em><b>Svs Figures</b></em>' containment reference list.
	 * The list contents are of type {@link es.uah.aut.srg.micobs.doctpl.doc.DAbstractFigure}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Svs Figures</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Svs Figures</em>' containment reference list.
	 * @see es.uah.aut.srg.micobs.svm.svs.svsPackage#getVSVSDocument_SvsFigures()
	 * @model containment="true"
	 * @generated
	 */
	EList<DAbstractFigure> getSvsFigures();

	/**
	 * Returns the value of the '<em><b>Svs Tables</b></em>' containment reference list.
	 * The list contents are of type {@link es.uah.aut.srg.micobs.doctpl.doc.DAbstractTable}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Svs Tables</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Svs Tables</em>' containment reference list.
	 * @see es.uah.aut.srg.micobs.svm.svs.svsPackage#getVSVSDocument_SvsTables()
	 * @model containment="true"
	 * @generated
	 */
	EList<DAbstractTable> getSvsTables();

} // VSVSDocument
