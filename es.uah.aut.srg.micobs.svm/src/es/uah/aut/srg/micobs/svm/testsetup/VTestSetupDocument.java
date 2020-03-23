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
package es.uah.aut.srg.micobs.svm.testsetup;

import org.eclipse.emf.common.util.EList;

import es.uah.aut.srg.micobs.doctpl.doctpl.DDocumentTemplate;
import es.uah.aut.srg.micobs.doctpl.doctpl.DReferenceableObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>VTest Setup Document</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link es.uah.aut.srg.micobs.svm.testsetup.VTestSetupDocument#getTbcsTbdsSection <em>Tbcs Tbds Section</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.svm.testsetup.VTestSetupDocument#getApplicableDocumentsSection <em>Applicable Documents Section</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.svm.testsetup.VTestSetupDocument#getReferenceDocumentsSection <em>Reference Documents Section</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.svm.testsetup.VTestSetupDocument#getInterfaces <em>Interfaces</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.svm.testsetup.VTestSetupDocument#getConfigurations <em>Configurations</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.svm.testsetup.VTestSetupDocument#getActions <em>Actions</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.svm.testsetup.VTestSetupDocument#getActionsOverVariables <em>Actions Over Variables</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.svm.testsetup.VTestSetupDocument#getScenarios <em>Scenarios</em>}</li>
 * </ul>
 *
 * @see es.uah.aut.srg.micobs.svm.testsetup.testsetupPackage#getVTestSetupDocument()
 * @model
 * @generated
 */
public interface VTestSetupDocument extends DDocumentTemplate {
	/**
	 * Returns the value of the '<em><b>Tbcs Tbds Section</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tbcs Tbds Section</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tbcs Tbds Section</em>' containment reference.
	 * @see #setTbcsTbdsSection(VTestSetupTBCsTBDs)
	 * @see es.uah.aut.srg.micobs.svm.testsetup.testsetupPackage#getVTestSetupDocument_TbcsTbdsSection()
	 * @model containment="true"
	 * @generated
	 */
	VTestSetupTBCsTBDs getTbcsTbdsSection();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.micobs.svm.testsetup.VTestSetupDocument#getTbcsTbdsSection <em>Tbcs Tbds Section</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tbcs Tbds Section</em>' containment reference.
	 * @see #getTbcsTbdsSection()
	 * @generated
	 */
	void setTbcsTbdsSection(VTestSetupTBCsTBDs value);

	/**
	 * Returns the value of the '<em><b>Applicable Documents Section</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Applicable Documents Section</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Applicable Documents Section</em>' containment reference.
	 * @see #setApplicableDocumentsSection(VTestSetupApplicableDocuments)
	 * @see es.uah.aut.srg.micobs.svm.testsetup.testsetupPackage#getVTestSetupDocument_ApplicableDocumentsSection()
	 * @model containment="true" required="true"
	 * @generated
	 */
	VTestSetupApplicableDocuments getApplicableDocumentsSection();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.micobs.svm.testsetup.VTestSetupDocument#getApplicableDocumentsSection <em>Applicable Documents Section</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Applicable Documents Section</em>' containment reference.
	 * @see #getApplicableDocumentsSection()
	 * @generated
	 */
	void setApplicableDocumentsSection(VTestSetupApplicableDocuments value);

	/**
	 * Returns the value of the '<em><b>Reference Documents Section</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reference Documents Section</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reference Documents Section</em>' containment reference.
	 * @see #setReferenceDocumentsSection(VTestSetupReferenceDocuments)
	 * @see es.uah.aut.srg.micobs.svm.testsetup.testsetupPackage#getVTestSetupDocument_ReferenceDocumentsSection()
	 * @model containment="true" required="true"
	 * @generated
	 */
	VTestSetupReferenceDocuments getReferenceDocumentsSection();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.micobs.svm.testsetup.VTestSetupDocument#getReferenceDocumentsSection <em>Reference Documents Section</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reference Documents Section</em>' containment reference.
	 * @see #getReferenceDocumentsSection()
	 * @generated
	 */
	void setReferenceDocumentsSection(VTestSetupReferenceDocuments value);

	/**
	 * Returns the value of the '<em><b>Interfaces</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Interfaces</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Interfaces</em>' containment reference.
	 * @see #setInterfaces(VTestSetupInterfacesSection)
	 * @see es.uah.aut.srg.micobs.svm.testsetup.testsetupPackage#getVTestSetupDocument_Interfaces()
	 * @model containment="true" required="true"
	 * @generated
	 */
	VTestSetupInterfacesSection getInterfaces();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.micobs.svm.testsetup.VTestSetupDocument#getInterfaces <em>Interfaces</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Interfaces</em>' containment reference.
	 * @see #getInterfaces()
	 * @generated
	 */
	void setInterfaces(VTestSetupInterfacesSection value);

	/**
	 * Returns the value of the '<em><b>Configurations</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Configurations</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Configurations</em>' containment reference.
	 * @see #setConfigurations(VTestSetupPacketConfigurationsSection)
	 * @see es.uah.aut.srg.micobs.svm.testsetup.testsetupPackage#getVTestSetupDocument_Configurations()
	 * @model containment="true"
	 * @generated
	 */
	VTestSetupPacketConfigurationsSection getConfigurations();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.micobs.svm.testsetup.VTestSetupDocument#getConfigurations <em>Configurations</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Configurations</em>' containment reference.
	 * @see #getConfigurations()
	 * @generated
	 */
	void setConfigurations(VTestSetupPacketConfigurationsSection value);

	/**
	 * Returns the value of the '<em><b>Actions</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Actions</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Actions</em>' containment reference.
	 * @see #setActions(VTestSetupActionsSection)
	 * @see es.uah.aut.srg.micobs.svm.testsetup.testsetupPackage#getVTestSetupDocument_Actions()
	 * @model containment="true"
	 * @generated
	 */
	VTestSetupActionsSection getActions();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.micobs.svm.testsetup.VTestSetupDocument#getActions <em>Actions</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Actions</em>' containment reference.
	 * @see #getActions()
	 * @generated
	 */
	void setActions(VTestSetupActionsSection value);

	/**
	 * Returns the value of the '<em><b>Actions Over Variables</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Actions Over Variables</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Actions Over Variables</em>' containment reference.
	 * @see #setActionsOverVariables(VTestSetupActionsOverVariablesSection)
	 * @see es.uah.aut.srg.micobs.svm.testsetup.testsetupPackage#getVTestSetupDocument_ActionsOverVariables()
	 * @model containment="true"
	 * @generated
	 */
	VTestSetupActionsOverVariablesSection getActionsOverVariables();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.micobs.svm.testsetup.VTestSetupDocument#getActionsOverVariables <em>Actions Over Variables</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Actions Over Variables</em>' containment reference.
	 * @see #getActionsOverVariables()
	 * @generated
	 */
	void setActionsOverVariables(VTestSetupActionsOverVariablesSection value);

	/**
	 * Returns the value of the '<em><b>Scenarios</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Scenarios</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Scenarios</em>' containment reference.
	 * @see #setScenarios(VTestSetupScenariosSection)
	 * @see es.uah.aut.srg.micobs.svm.testsetup.testsetupPackage#getVTestSetupDocument_Scenarios()
	 * @model containment="true" required="true"
	 * @generated
	 */
	VTestSetupScenariosSection getScenarios();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.micobs.svm.testsetup.VTestSetupDocument#getScenarios <em>Scenarios</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Scenarios</em>' containment reference.
	 * @see #getScenarios()
	 * @generated
	 */
	void setScenarios(VTestSetupScenariosSection value);
	
	EList<DReferenceableObject> getReferenceableObjects(String ReferenceableObjectType);

} // VTestSetupDocument
