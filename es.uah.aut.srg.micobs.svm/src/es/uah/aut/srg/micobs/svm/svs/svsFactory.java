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

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see es.uah.aut.srg.micobs.svm.svs.svsPackage
 * @generated
 */
public interface svsFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	svsFactory eINSTANCE = es.uah.aut.srg.micobs.svm.svs.impl.svsFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>VSVS Document</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>VSVS Document</em>'.
	 * @generated
	 */
	VSVSDocument createVSVSDocument();

	/**
	 * Returns a new object of class '<em>VSVSTB Cs TB Ds</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>VSVSTB Cs TB Ds</em>'.
	 * @generated
	 */
	VSVSTBCsTBDs createVSVSTBCsTBDs();

	/**
	 * Returns a new object of class '<em>VSVS Instantiable Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>VSVS Instantiable Section</em>'.
	 * @generated
	 */
	VSVSInstantiableSection createVSVSInstantiableSection();

	/**
	 * Returns a new object of class '<em>VSVS Introduction</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>VSVS Introduction</em>'.
	 * @generated
	 */
	VSVSIntroduction createVSVSIntroduction();

	/**
	 * Returns a new object of class '<em>VSVS Applicable Documents</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>VSVS Applicable Documents</em>'.
	 * @generated
	 */
	VSVSApplicableDocuments createVSVSApplicableDocuments();

	/**
	 * Returns a new object of class '<em>VSVS Reference Documents</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>VSVS Reference Documents</em>'.
	 * @generated
	 */
	VSVSReferenceDocuments createVSVSReferenceDocuments();

	/**
	 * Returns a new object of class '<em>VSVS Terms Definitions Abbreviations</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>VSVS Terms Definitions Abbreviations</em>'.
	 * @generated
	 */
	VSVSTermsDefinitionsAbbreviations createVSVSTermsDefinitionsAbbreviations();

	/**
	 * Returns a new object of class '<em>VSVS Term</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>VSVS Term</em>'.
	 * @generated
	 */
	VSVSTerm createVSVSTerm();

	/**
	 * Returns a new object of class '<em>VSVS Definition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>VSVS Definition</em>'.
	 * @generated
	 */
	VSVSDefinition createVSVSDefinition();

	/**
	 * Returns a new object of class '<em>VSVS Abbreviation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>VSVS Abbreviation</em>'.
	 * @generated
	 */
	VSVSAbbreviation createVSVSAbbreviation();

	/**
	 * Returns a new object of class '<em>VSVS Fixed Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>VSVS Fixed Section</em>'.
	 * @generated
	 */
	VSVSFixedSection createVSVSFixedSection();

	/**
	 * Returns a new object of class '<em>VSVS Software Overview</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>VSVS Software Overview</em>'.
	 * @generated
	 */
	VSVSSoftwareOverview createVSVSSoftwareOverview();

	/**
	 * Returns a new object of class '<em>VSVS Task Identification</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>VSVS Task Identification</em>'.
	 * @generated
	 */
	VSVSTaskIdentification createVSVSTaskIdentification();

	/**
	 * Returns a new object of class '<em>VSVS Testing Specification Design</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>VSVS Testing Specification Design</em>'.
	 * @generated
	 */
	VSVSTestingSpecificationDesign createVSVSTestingSpecificationDesign();

	/**
	 * Returns a new object of class '<em>VSVS Test Design</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>VSVS Test Design</em>'.
	 * @generated
	 */
	VSVSTestDesign createVSVSTestDesign();

	/**
	 * Returns a new object of class '<em>VSVS Test Info</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>VSVS Test Info</em>'.
	 * @generated
	 */
	VSVSTestInfo createVSVSTestInfo();

	/**
	 * Returns a new object of class '<em>VSVS Test Cases</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>VSVS Test Cases</em>'.
	 * @generated
	 */
	VSVSTestCases createVSVSTestCases();

	/**
	 * Returns a new object of class '<em>VSVS Test Case</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>VSVS Test Case</em>'.
	 * @generated
	 */
	VSVSTestCase createVSVSTestCase();

	/**
	 * Returns a new object of class '<em>VSVS Test Procedures</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>VSVS Test Procedures</em>'.
	 * @generated
	 */
	VSVSTestProcedures createVSVSTestProcedures();

	/**
	 * Returns a new object of class '<em>VSVS Test Procedure</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>VSVS Test Procedure</em>'.
	 * @generated
	 */
	VSVSTestProcedure createVSVSTestProcedure();

	/**
	 * Returns a new object of class '<em>VSVS Procedure Steps</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>VSVS Procedure Steps</em>'.
	 * @generated
	 */
	VSVSProcedureSteps createVSVSProcedureSteps();

	/**
	 * Returns a new object of class '<em>VSVS Procedure Step</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>VSVS Procedure Step</em>'.
	 * @generated
	 */
	VSVSProcedureStep createVSVSProcedureStep();

	/**
	 * Returns a new object of class '<em>VSVS Step Outputs</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>VSVS Step Outputs</em>'.
	 * @generated
	 */
	VSVSStepOutputs createVSVSStepOutputs();

	/**
	 * Returns a new object of class '<em>VSVS Step Telemetry Set</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>VSVS Step Telemetry Set</em>'.
	 * @generated
	 */
	VSVSStepTelemetrySet createVSVSStepTelemetrySet();

	/**
	 * Returns a new object of class '<em>VSVS Step Telemetry</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>VSVS Step Telemetry</em>'.
	 * @generated
	 */
	VSVSStepTelemetry createVSVSStepTelemetry();

	/**
	 * Returns a new object of class '<em>VSVS Step Telemetry Data</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>VSVS Step Telemetry Data</em>'.
	 * @generated
	 */
	VSVSStepTelemetryData createVSVSStepTelemetryData();

	/**
	 * Returns a new object of class '<em>VSVS Step Telemetry Data Field</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>VSVS Step Telemetry Data Field</em>'.
	 * @generated
	 */
	VSVSStepTelemetryDataField createVSVSStepTelemetryDataField();

	/**
	 * Returns a new object of class '<em>VSVS Step Telemetry Header</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>VSVS Step Telemetry Header</em>'.
	 * @generated
	 */
	VSVSStepTelemetryHeader createVSVSStepTelemetryHeader();

	/**
	 * Returns a new object of class '<em>VSVS Step Telemetry Header Field</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>VSVS Step Telemetry Header Field</em>'.
	 * @generated
	 */
	VSVSStepTelemetryHeaderField createVSVSStepTelemetryHeaderField();

	/**
	 * Returns a new object of class '<em>VSVS Step Configurations</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>VSVS Step Configurations</em>'.
	 * @generated
	 */
	VSVSStepConfigurations createVSVSStepConfigurations();

	/**
	 * Returns a new object of class '<em>VSVS Step Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>VSVS Step Configuration</em>'.
	 * @generated
	 */
	VSVSStepConfiguration createVSVSStepConfiguration();

	/**
	 * Returns a new object of class '<em>VSVS Step Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>VSVS Step Action</em>'.
	 * @generated
	 */
	VSVSStepAction createVSVSStepAction();

	/**
	 * Returns a new object of class '<em>VSVS Step Telecommand Sequence</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>VSVS Step Telecommand Sequence</em>'.
	 * @generated
	 */
	VSVSStepTelecommandSequence createVSVSStepTelecommandSequence();

	/**
	 * Returns a new object of class '<em>VSVS Step Telecommand</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>VSVS Step Telecommand</em>'.
	 * @generated
	 */
	VSVSStepTelecommand createVSVSStepTelecommand();

	/**
	 * Returns a new object of class '<em>VSVS Step Telecommand Data</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>VSVS Step Telecommand Data</em>'.
	 * @generated
	 */
	VSVSStepTelecommandData createVSVSStepTelecommandData();

	/**
	 * Returns a new object of class '<em>VSVS Step Telecommand Data Field</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>VSVS Step Telecommand Data Field</em>'.
	 * @generated
	 */
	VSVSStepTelecommandDataField createVSVSStepTelecommandDataField();

	/**
	 * Returns a new object of class '<em>VSVS Step Telecommand Header</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>VSVS Step Telecommand Header</em>'.
	 * @generated
	 */
	VSVSStepTelecommandHeader createVSVSStepTelecommandHeader();

	/**
	 * Returns a new object of class '<em>VSVS Step Telecommand Header Field</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>VSVS Step Telecommand Header Field</em>'.
	 * @generated
	 */
	VSVSStepTelecommandHeaderField createVSVSStepTelecommandHeaderField();

	/**
	 * Returns a new object of class '<em>VSVS Analysis Inspection Review</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>VSVS Analysis Inspection Review</em>'.
	 * @generated
	 */
	VSVSAnalysisInspectionReview createVSVSAnalysisInspectionReview();

	/**
	 * Returns a new object of class '<em>VSVS Test Platform Requirements</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>VSVS Test Platform Requirements</em>'.
	 * @generated
	 */
	VSVSTestPlatformRequirements createVSVSTestPlatformRequirements();

	/**
	 * Returns a new object of class '<em>VSVS Additional Information</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>VSVS Additional Information</em>'.
	 * @generated
	 */
	VSVSAdditionalInformation createVSVSAdditionalInformation();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	svsPackage getsvsPackage();

} //svsFactory
