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
	 * Returns a new object of class '<em>VSVS Scenarios Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>VSVS Scenarios Section</em>'.
	 * @generated
	 */
	VSVSScenariosSection createVSVSScenariosSection();

	/**
	 * Returns a new object of class '<em>VSVS Scenario Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>VSVS Scenario Section</em>'.
	 * @generated
	 */
	VSVSScenarioSection createVSVSScenarioSection();

	/**
	 * Returns a new object of class '<em>VSVS Fixed Test Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>VSVS Fixed Test Section</em>'.
	 * @generated
	 */
	VSVSFixedTestSection createVSVSFixedTestSection();

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
	 * Returns a new object of class '<em>VSVS Step Inputs</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>VSVS Step Inputs</em>'.
	 * @generated
	 */
	VSVSStepInputs createVSVSStepInputs();

	/**
	 * Returns a new object of class '<em>VSVS Step Outputs</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>VSVS Step Outputs</em>'.
	 * @generated
	 */
	VSVSStepOutputs createVSVSStepOutputs();

	/**
	 * Returns a new object of class '<em>VSVS Step Special Packets</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>VSVS Step Special Packets</em>'.
	 * @generated
	 */
	VSVSStepSpecialPackets createVSVSStepSpecialPackets();

	/**
	 * Returns a new object of class '<em>VSVS Step Enable Disable</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>VSVS Step Enable Disable</em>'.
	 * @generated
	 */
	VSVSStepEnableDisable createVSVSStepEnableDisable();

	/**
	 * Returns a new object of class '<em>VSVS Step Concurrent Steps</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>VSVS Step Concurrent Steps</em>'.
	 * @generated
	 */
	VSVSStepConcurrentSteps createVSVSStepConcurrentSteps();

	/**
	 * Returns a new object of class '<em>VSVS Step Next Step</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>VSVS Step Next Step</em>'.
	 * @generated
	 */
	VSVSStepNextStep createVSVSStepNextStep();

	/**
	 * Returns a new object of class '<em>VSVS Step Concurrent Step</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>VSVS Step Concurrent Step</em>'.
	 * @generated
	 */
	VSVSStepConcurrentStep createVSVSStepConcurrentStep();

	/**
	 * Returns a new object of class '<em>VSVS Step Input</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>VSVS Step Input</em>'.
	 * @generated
	 */
	VSVSStepInput createVSVSStepInput();

	/**
	 * Returns a new object of class '<em>VSVS Step Input Level3</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>VSVS Step Input Level3</em>'.
	 * @generated
	 */
	VSVSStepInputLevel3 createVSVSStepInputLevel3();

	/**
	 * Returns a new object of class '<em>VSVS Step Input Level2</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>VSVS Step Input Level2</em>'.
	 * @generated
	 */
	VSVSStepInputLevel2 createVSVSStepInputLevel2();

	/**
	 * Returns a new object of class '<em>VSVS Step Input Level1</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>VSVS Step Input Level1</em>'.
	 * @generated
	 */
	VSVSStepInputLevel1 createVSVSStepInputLevel1();

	/**
	 * Returns a new object of class '<em>VSVS Step Input Level0</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>VSVS Step Input Level0</em>'.
	 * @generated
	 */
	VSVSStepInputLevel0 createVSVSStepInputLevel0();

	/**
	 * Returns a new object of class '<em>VSVS Step Output Level3</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>VSVS Step Output Level3</em>'.
	 * @generated
	 */
	VSVSStepOutputLevel3 createVSVSStepOutputLevel3();

	/**
	 * Returns a new object of class '<em>VSVS Step Output Level2</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>VSVS Step Output Level2</em>'.
	 * @generated
	 */
	VSVSStepOutputLevel2 createVSVSStepOutputLevel2();

	/**
	 * Returns a new object of class '<em>VSVS Step Output Level1</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>VSVS Step Output Level1</em>'.
	 * @generated
	 */
	VSVSStepOutputLevel1 createVSVSStepOutputLevel1();

	/**
	 * Returns a new object of class '<em>VSVS Step Output Level0</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>VSVS Step Output Level0</em>'.
	 * @generated
	 */
	VSVSStepOutputLevel0 createVSVSStepOutputLevel0();

	/**
	 * Returns a new object of class '<em>VSVS Step Filter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>VSVS Step Filter</em>'.
	 * @generated
	 */
	VSVSStepFilter createVSVSStepFilter();

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
