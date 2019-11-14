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
package es.uah.aut.srg.micobs.svm.srs;

import es.uah.aut.srg.micobs.doctpl.doctpl.DAbstractTable;
import es.uah.aut.srg.micobs.doctpl.doctpl.DDocumentTemplate;
import es.uah.aut.srg.micobs.doctpl.doctpl.DFigureFromFile;
import es.uah.aut.srg.micobs.svm.tdm.VTraceableDocument;
import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>VSRS Document</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link es.uah.aut.srg.micobs.svm.srs.VSRSDocument#getIntroductionSection <em>Introduction Section</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.svm.srs.VSRSDocument#getApplicableDocumentsSection <em>Applicable Documents Section</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.svm.srs.VSRSDocument#getReferenceDocumentsSection <em>Reference Documents Section</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.svm.srs.VSRSDocument#getTermsDefinitionsAbbreviationsSection <em>Terms Definitions Abbreviations Section</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.svm.srs.VSRSDocument#getSoftwareOverviewSection <em>Software Overview Section</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.svm.srs.VSRSDocument#getRequirementsSection <em>Requirements Section</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.svm.srs.VSRSDocument#getLogicalModelsSection <em>Logical Models Section</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.svm.srs.VSRSDocument#getSrsFigures <em>Srs Figures</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.svm.srs.VSRSDocument#getSrsTables <em>Srs Tables</em>}</li>
 * </ul>
 *
 * @see es.uah.aut.srg.micobs.svm.srs.srsPackage#getVSRSDocument()
 * @model
 * @generated
 */
public interface VSRSDocument extends VTraceableDocument, DDocumentTemplate {
	/**
	 * Returns the value of the '<em><b>Introduction Section</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Introduction Section</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Introduction Section</em>' containment reference.
	 * @see #setIntroductionSection(VSRSIntroduction)
	 * @see es.uah.aut.srg.micobs.svm.srs.srsPackage#getVSRSDocument_IntroductionSection()
	 * @model containment="true" required="true"
	 * @generated
	 */
	VSRSIntroduction getIntroductionSection();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.micobs.svm.srs.VSRSDocument#getIntroductionSection <em>Introduction Section</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Introduction Section</em>' containment reference.
	 * @see #getIntroductionSection()
	 * @generated
	 */
	void setIntroductionSection(VSRSIntroduction value);

	/**
	 * Returns the value of the '<em><b>Applicable Documents Section</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Applicable Documents Section</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Applicable Documents Section</em>' containment reference.
	 * @see #setApplicableDocumentsSection(VSRSApplicableDocuments)
	 * @see es.uah.aut.srg.micobs.svm.srs.srsPackage#getVSRSDocument_ApplicableDocumentsSection()
	 * @model containment="true" required="true"
	 * @generated
	 */
	VSRSApplicableDocuments getApplicableDocumentsSection();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.micobs.svm.srs.VSRSDocument#getApplicableDocumentsSection <em>Applicable Documents Section</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Applicable Documents Section</em>' containment reference.
	 * @see #getApplicableDocumentsSection()
	 * @generated
	 */
	void setApplicableDocumentsSection(VSRSApplicableDocuments value);

	/**
	 * Returns the value of the '<em><b>Reference Documents Section</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reference Documents Section</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reference Documents Section</em>' containment reference.
	 * @see #setReferenceDocumentsSection(VSRSReferenceDocuments)
	 * @see es.uah.aut.srg.micobs.svm.srs.srsPackage#getVSRSDocument_ReferenceDocumentsSection()
	 * @model containment="true" required="true"
	 * @generated
	 */
	VSRSReferenceDocuments getReferenceDocumentsSection();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.micobs.svm.srs.VSRSDocument#getReferenceDocumentsSection <em>Reference Documents Section</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reference Documents Section</em>' containment reference.
	 * @see #getReferenceDocumentsSection()
	 * @generated
	 */
	void setReferenceDocumentsSection(VSRSReferenceDocuments value);

	/**
	 * Returns the value of the '<em><b>Terms Definitions Abbreviations Section</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Terms Definitions Abbreviations Section</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Terms Definitions Abbreviations Section</em>' containment reference.
	 * @see #setTermsDefinitionsAbbreviationsSection(VSRSTermsDefinitionsAbbreviations)
	 * @see es.uah.aut.srg.micobs.svm.srs.srsPackage#getVSRSDocument_TermsDefinitionsAbbreviationsSection()
	 * @model containment="true" required="true"
	 * @generated
	 */
	VSRSTermsDefinitionsAbbreviations getTermsDefinitionsAbbreviationsSection();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.micobs.svm.srs.VSRSDocument#getTermsDefinitionsAbbreviationsSection <em>Terms Definitions Abbreviations Section</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Terms Definitions Abbreviations Section</em>' containment reference.
	 * @see #getTermsDefinitionsAbbreviationsSection()
	 * @generated
	 */
	void setTermsDefinitionsAbbreviationsSection(VSRSTermsDefinitionsAbbreviations value);

	/**
	 * Returns the value of the '<em><b>Software Overview Section</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Software Overview Section</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Software Overview Section</em>' containment reference.
	 * @see #setSoftwareOverviewSection(VSRSSoftwareOverview)
	 * @see es.uah.aut.srg.micobs.svm.srs.srsPackage#getVSRSDocument_SoftwareOverviewSection()
	 * @model containment="true" required="true"
	 * @generated
	 */
	VSRSSoftwareOverview getSoftwareOverviewSection();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.micobs.svm.srs.VSRSDocument#getSoftwareOverviewSection <em>Software Overview Section</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Software Overview Section</em>' containment reference.
	 * @see #getSoftwareOverviewSection()
	 * @generated
	 */
	void setSoftwareOverviewSection(VSRSSoftwareOverview value);

	/**
	 * Returns the value of the '<em><b>Requirements Section</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Requirements Section</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Requirements Section</em>' containment reference.
	 * @see #setRequirementsSection(VSRSRequirements)
	 * @see es.uah.aut.srg.micobs.svm.srs.srsPackage#getVSRSDocument_RequirementsSection()
	 * @model containment="true" required="true"
	 * @generated
	 */
	VSRSRequirements getRequirementsSection();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.micobs.svm.srs.VSRSDocument#getRequirementsSection <em>Requirements Section</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Requirements Section</em>' containment reference.
	 * @see #getRequirementsSection()
	 * @generated
	 */
	void setRequirementsSection(VSRSRequirements value);

	/**
	 * Returns the value of the '<em><b>Logical Models Section</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Logical Models Section</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Logical Models Section</em>' containment reference.
	 * @see #setLogicalModelsSection(VSRSLogicalModels)
	 * @see es.uah.aut.srg.micobs.svm.srs.srsPackage#getVSRSDocument_LogicalModelsSection()
	 * @model containment="true" required="true"
	 * @generated
	 */
	VSRSLogicalModels getLogicalModelsSection();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.micobs.svm.srs.VSRSDocument#getLogicalModelsSection <em>Logical Models Section</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Logical Models Section</em>' containment reference.
	 * @see #getLogicalModelsSection()
	 * @generated
	 */
	void setLogicalModelsSection(VSRSLogicalModels value);

	/**
	 * Returns the value of the '<em><b>Srs Figures</b></em>' containment reference list.
	 * The list contents are of type {@link es.uah.aut.srg.micobs.doctpl.doctpl.DFigureFromFile}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Srs Figures</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Srs Figures</em>' containment reference list.
	 * @see es.uah.aut.srg.micobs.svm.srs.srsPackage#getVSRSDocument_SrsFigures()
	 * @model containment="true"
	 * @generated
	 */
	EList<DFigureFromFile> getSrsFigures();

	/**
	 * Returns the value of the '<em><b>Srs Tables</b></em>' containment reference list.
	 * The list contents are of type {@link es.uah.aut.srg.micobs.doctpl.doctpl.DAbstractTable}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Srs Tables</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Srs Tables</em>' containment reference list.
	 * @see es.uah.aut.srg.micobs.svm.srs.srsPackage#getVSRSDocument_SrsTables()
	 * @model containment="true"
	 * @generated
	 */
	EList<DAbstractTable> getSrsTables();

} // VSRSDocument
