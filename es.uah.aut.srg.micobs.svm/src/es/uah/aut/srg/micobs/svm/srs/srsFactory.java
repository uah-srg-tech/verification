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

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see es.uah.aut.srg.micobs.svm.srs.srsPackage
 * @generated
 */
public interface srsFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	srsFactory eINSTANCE = es.uah.aut.srg.micobs.svm.srs.impl.srsFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>VSRS Document</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>VSRS Document</em>'.
	 * @generated
	 */
	VSRSDocument createVSRSDocument();

	/**
	 * Returns a new object of class '<em>VSRS Introduction</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>VSRS Introduction</em>'.
	 * @generated
	 */
	VSRSIntroduction createVSRSIntroduction();

	/**
	 * Returns a new object of class '<em>VSRS Applicable Documents</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>VSRS Applicable Documents</em>'.
	 * @generated
	 */
	VSRSApplicableDocuments createVSRSApplicableDocuments();

	/**
	 * Returns a new object of class '<em>VSRS Reference Documents</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>VSRS Reference Documents</em>'.
	 * @generated
	 */
	VSRSReferenceDocuments createVSRSReferenceDocuments();

	/**
	 * Returns a new object of class '<em>VSRS Terms Definitions Abbreviations</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>VSRS Terms Definitions Abbreviations</em>'.
	 * @generated
	 */
	VSRSTermsDefinitionsAbbreviations createVSRSTermsDefinitionsAbbreviations();

	/**
	 * Returns a new object of class '<em>VSRS Term</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>VSRS Term</em>'.
	 * @generated
	 */
	VSRSTerm createVSRSTerm();

	/**
	 * Returns a new object of class '<em>VSRS Definition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>VSRS Definition</em>'.
	 * @generated
	 */
	VSRSDefinition createVSRSDefinition();

	/**
	 * Returns a new object of class '<em>VSRS Abbreviation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>VSRS Abbreviation</em>'.
	 * @generated
	 */
	VSRSAbbreviation createVSRSAbbreviation();

	/**
	 * Returns a new object of class '<em>VSRS Fixed Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>VSRS Fixed Section</em>'.
	 * @generated
	 */
	VSRSFixedSection createVSRSFixedSection();

	/**
	 * Returns a new object of class '<em>VSRS Instantiable Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>VSRS Instantiable Section</em>'.
	 * @generated
	 */
	VSRSInstantiableSection createVSRSInstantiableSection();

	/**
	 * Returns a new object of class '<em>VSRS Software Overview</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>VSRS Software Overview</em>'.
	 * @generated
	 */
	VSRSSoftwareOverview createVSRSSoftwareOverview();

	/**
	 * Returns a new object of class '<em>VSRS Instantiable Requirement Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>VSRS Instantiable Requirement Section</em>'.
	 * @generated
	 */
	VSRSInstantiableRequirementSection createVSRSInstantiableRequirementSection();

	/**
	 * Returns a new object of class '<em>VSRS Requirements</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>VSRS Requirements</em>'.
	 * @generated
	 */
	VSRSRequirements createVSRSRequirements();

	/**
	 * Returns a new object of class '<em>VSRS General Requirements</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>VSRS General Requirements</em>'.
	 * @generated
	 */
	VSRSGeneralRequirements createVSRSGeneralRequirements();

	/**
	 * Returns a new object of class '<em>VSRS Functional Requirements</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>VSRS Functional Requirements</em>'.
	 * @generated
	 */
	VSRSFunctionalRequirements createVSRSFunctionalRequirements();

	/**
	 * Returns a new object of class '<em>VSRS Performance Requirements</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>VSRS Performance Requirements</em>'.
	 * @generated
	 */
	VSRSPerformanceRequirements createVSRSPerformanceRequirements();

	/**
	 * Returns a new object of class '<em>VSRS Interface Requirements</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>VSRS Interface Requirements</em>'.
	 * @generated
	 */
	VSRSInterfaceRequirements createVSRSInterfaceRequirements();

	/**
	 * Returns a new object of class '<em>VSRS Operational Requirements</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>VSRS Operational Requirements</em>'.
	 * @generated
	 */
	VSRSOperationalRequirements createVSRSOperationalRequirements();

	/**
	 * Returns a new object of class '<em>VSRS Resources Requirements</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>VSRS Resources Requirements</em>'.
	 * @generated
	 */
	VSRSResourcesRequirements createVSRSResourcesRequirements();

	/**
	 * Returns a new object of class '<em>VSRS Design Requirements</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>VSRS Design Requirements</em>'.
	 * @generated
	 */
	VSRSDesignRequirements createVSRSDesignRequirements();

	/**
	 * Returns a new object of class '<em>VSRS Security Privacy Requirements</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>VSRS Security Privacy Requirements</em>'.
	 * @generated
	 */
	VSRSSecurityPrivacyRequirements createVSRSSecurityPrivacyRequirements();

	/**
	 * Returns a new object of class '<em>VSRS Portability Requirements</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>VSRS Portability Requirements</em>'.
	 * @generated
	 */
	VSRSPortabilityRequirements createVSRSPortabilityRequirements();

	/**
	 * Returns a new object of class '<em>VSRSSW Quality Requirements</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>VSRSSW Quality Requirements</em>'.
	 * @generated
	 */
	VSRSSWQualityRequirements createVSRSSWQualityRequirements();

	/**
	 * Returns a new object of class '<em>VSRSSW Reliabilty Requirements</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>VSRSSW Reliabilty Requirements</em>'.
	 * @generated
	 */
	VSRSSWReliabiltyRequirements createVSRSSWReliabiltyRequirements();

	/**
	 * Returns a new object of class '<em>VSRSSW Maintainability Requirements</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>VSRSSW Maintainability Requirements</em>'.
	 * @generated
	 */
	VSRSSWMaintainabilityRequirements createVSRSSWMaintainabilityRequirements();

	/**
	 * Returns a new object of class '<em>VSRSSW Safety Requirements</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>VSRSSW Safety Requirements</em>'.
	 * @generated
	 */
	VSRSSWSafetyRequirements createVSRSSWSafetyRequirements();

	/**
	 * Returns a new object of class '<em>VSRSSW Configuration Delivery Requirements</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>VSRSSW Configuration Delivery Requirements</em>'.
	 * @generated
	 */
	VSRSSWConfigurationDeliveryRequirements createVSRSSWConfigurationDeliveryRequirements();

	/**
	 * Returns a new object of class '<em>VSRS Data Definition DB Requirements</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>VSRS Data Definition DB Requirements</em>'.
	 * @generated
	 */
	VSRSDataDefinitionDBRequirements createVSRSDataDefinitionDBRequirements();

	/**
	 * Returns a new object of class '<em>VSRS Human Factors Requirements</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>VSRS Human Factors Requirements</em>'.
	 * @generated
	 */
	VSRSHumanFactorsRequirements createVSRSHumanFactorsRequirements();

	/**
	 * Returns a new object of class '<em>VSRS Adaptation Installation Requirements</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>VSRS Adaptation Installation Requirements</em>'.
	 * @generated
	 */
	VSRSAdaptationInstallationRequirements createVSRSAdaptationInstallationRequirements();

	/**
	 * Returns a new object of class '<em>VSRS Document Item</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>VSRS Document Item</em>'.
	 * @generated
	 */
	VSRSDocumentItem createVSRSDocumentItem();

	/**
	 * Returns a new object of class '<em>VSRS Logical Models</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>VSRS Logical Models</em>'.
	 * @generated
	 */
	VSRSLogicalModels createVSRSLogicalModels();

	/**
	 * Returns a new object of class '<em>VSRS Logical Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>VSRS Logical Model</em>'.
	 * @generated
	 */
	VSRSLogicalModel createVSRSLogicalModel();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	srsPackage getsrsPackage();

} //srsFactory
