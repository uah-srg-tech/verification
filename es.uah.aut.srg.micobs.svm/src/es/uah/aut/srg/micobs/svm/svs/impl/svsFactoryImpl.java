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
package es.uah.aut.srg.micobs.svm.svs.impl;

import es.uah.aut.srg.micobs.svm.svs.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class svsFactoryImpl extends EFactoryImpl implements svsFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static svsFactory init() {
		try {
			svsFactory thesvsFactory = (svsFactory)EPackage.Registry.INSTANCE.getEFactory(svsPackage.eNS_URI);
			if (thesvsFactory != null) {
				return thesvsFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new svsFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public svsFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case svsPackage.VSVS_DOCUMENT: return createVSVSDocument();
			case svsPackage.VSVS_INSTANTIABLE_SECTION: return createVSVSInstantiableSection();
			case svsPackage.VSVS_INTRODUCTION: return createVSVSIntroduction();
			case svsPackage.VSVS_APPLICABLE_DOCUMENTS: return createVSVSApplicableDocuments();
			case svsPackage.VSVS_REFERENCE_DOCUMENTS: return createVSVSReferenceDocuments();
			case svsPackage.VSVS_TERMS_DEFINITIONS_ABBREVIATIONS: return createVSVSTermsDefinitionsAbbreviations();
			case svsPackage.VSVS_TERM: return createVSVSTerm();
			case svsPackage.VSVS_DEFINITION: return createVSVSDefinition();
			case svsPackage.VSVS_ABBREVIATION: return createVSVSAbbreviation();
			case svsPackage.VSVS_FIXED_SECTION: return createVSVSFixedSection();
			case svsPackage.VSVS_SOFTWARE_OVERVIEW: return createVSVSSoftwareOverview();
			case svsPackage.VSVS_TASK_IDENTIFICATION: return createVSVSTaskIdentification();
			case svsPackage.VSVS_TESTING_SPECIFICATION_DESIGN: return createVSVSTestingSpecificationDesign();
			case svsPackage.VSVS_TEST_DESIGN: return createVSVSTestDesign();
			case svsPackage.VSVS_TEST_CASES: return createVSVSTestCases();
			case svsPackage.VSVS_TEST_CASE: return createVSVSTestCase();
			case svsPackage.VSVS_TEST_PROCEDURES: return createVSVSTestProcedures();
			case svsPackage.VSVS_TEST_PROCEDURE: return createVSVSTestProcedure();
			case svsPackage.VSVS_PROCEDURE_STEPS: return createVSVSProcedureSteps();
			case svsPackage.VSVS_PROCEDURE_STEP: return createVSVSProcedureStep();
			case svsPackage.VSVS_STEP_INPUTS: return createVSVSStepInputs();
			case svsPackage.VSVS_STEP_OUTPUTS: return createVSVSStepOutputs();
			case svsPackage.VSVS_STEP_SPECIAL_PACKETS: return createVSVSStepSpecialPackets();
			case svsPackage.VSVS_STEP_ENABLE_DISABLE: return createVSVSStepEnableDisable();
			case svsPackage.VSVS_STEP_CONCURRENT_STEPS: return createVSVSStepConcurrentSteps();
			case svsPackage.VSVS_STEP_NEXT_STEP: return createVSVSStepNextStep();
			case svsPackage.VSVS_STEP_CONCURRENT_STEP: return createVSVSStepConcurrentStep();
			case svsPackage.VSVS_STEP_INPUT: return createVSVSStepInput();
			case svsPackage.VSVS_STEP_INPUT_LEVEL3: return createVSVSStepInputLevel3();
			case svsPackage.VSVS_STEP_INPUT_LEVEL2: return createVSVSStepInputLevel2();
			case svsPackage.VSVS_STEP_INPUT_LEVEL1: return createVSVSStepInputLevel1();
			case svsPackage.VSVS_STEP_INPUT_LEVEL0: return createVSVSStepInputLevel0();
			case svsPackage.VSVS_STEP_OUTPUT_LEVEL3: return createVSVSStepOutputLevel3();
			case svsPackage.VSVS_STEP_OUTPUT_LEVEL2: return createVSVSStepOutputLevel2();
			case svsPackage.VSVS_STEP_OUTPUT_LEVEL1: return createVSVSStepOutputLevel1();
			case svsPackage.VSVS_STEP_OUTPUT_LEVEL0: return createVSVSStepOutputLevel0();
			case svsPackage.VSVS_STEP_FILTER: return createVSVSStepFilter();
			case svsPackage.VSVS_ANALYSIS_INSPECTION_REVIEW: return createVSVSAnalysisInspectionReview();
			case svsPackage.VSVS_TEST_PLATFORM_REQUIREMENTS: return createVSVSTestPlatformRequirements();
			case svsPackage.VSVS_ADDITIONAL_INFORMATION: return createVSVSAdditionalInformation();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case svsPackage.VSVS_STEP_MODE:
				return createVSVSStepModeFromString(eDataType, initialValue);
			case svsPackage.VSVS_STEP_UNIT:
				return createVSVSStepUnitFromString(eDataType, initialValue);
			case svsPackage.VSVS_STEP_CHECKMODE:
				return createVSVSStepCheckmodeFromString(eDataType, initialValue);
			case svsPackage.VSVS_STEP_YES_NO:
				return createVSVSStepYesNoFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case svsPackage.VSVS_STEP_MODE:
				return convertVSVSStepModeToString(eDataType, instanceValue);
			case svsPackage.VSVS_STEP_UNIT:
				return convertVSVSStepUnitToString(eDataType, instanceValue);
			case svsPackage.VSVS_STEP_CHECKMODE:
				return convertVSVSStepCheckmodeToString(eDataType, instanceValue);
			case svsPackage.VSVS_STEP_YES_NO:
				return convertVSVSStepYesNoToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VSVSDocument createVSVSDocument() {
		VSVSDocumentImpl vsvsDocument = new VSVSDocumentImpl();
		return vsvsDocument;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VSVSInstantiableSection createVSVSInstantiableSection() {
		VSVSInstantiableSectionImpl vsvsInstantiableSection = new VSVSInstantiableSectionImpl();
		return vsvsInstantiableSection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VSVSIntroduction createVSVSIntroduction() {
		VSVSIntroductionImpl vsvsIntroduction = new VSVSIntroductionImpl();
		return vsvsIntroduction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VSVSApplicableDocuments createVSVSApplicableDocuments() {
		VSVSApplicableDocumentsImpl vsvsApplicableDocuments = new VSVSApplicableDocumentsImpl();
		return vsvsApplicableDocuments;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VSVSReferenceDocuments createVSVSReferenceDocuments() {
		VSVSReferenceDocumentsImpl vsvsReferenceDocuments = new VSVSReferenceDocumentsImpl();
		return vsvsReferenceDocuments;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VSVSTermsDefinitionsAbbreviations createVSVSTermsDefinitionsAbbreviations() {
		VSVSTermsDefinitionsAbbreviationsImpl vsvsTermsDefinitionsAbbreviations = new VSVSTermsDefinitionsAbbreviationsImpl();
		return vsvsTermsDefinitionsAbbreviations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VSVSTerm createVSVSTerm() {
		VSVSTermImpl vsvsTerm = new VSVSTermImpl();
		return vsvsTerm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VSVSDefinition createVSVSDefinition() {
		VSVSDefinitionImpl vsvsDefinition = new VSVSDefinitionImpl();
		return vsvsDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VSVSAbbreviation createVSVSAbbreviation() {
		VSVSAbbreviationImpl vsvsAbbreviation = new VSVSAbbreviationImpl();
		return vsvsAbbreviation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VSVSFixedSection createVSVSFixedSection() {
		VSVSFixedSectionImpl vsvsFixedSection = new VSVSFixedSectionImpl();
		return vsvsFixedSection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VSVSSoftwareOverview createVSVSSoftwareOverview() {
		VSVSSoftwareOverviewImpl vsvsSoftwareOverview = new VSVSSoftwareOverviewImpl();
		return vsvsSoftwareOverview;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VSVSTaskIdentification createVSVSTaskIdentification() {
		VSVSTaskIdentificationImpl vsvsTaskIdentification = new VSVSTaskIdentificationImpl();
		return vsvsTaskIdentification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VSVSTestingSpecificationDesign createVSVSTestingSpecificationDesign() {
		VSVSTestingSpecificationDesignImpl vsvsTestingSpecificationDesign = new VSVSTestingSpecificationDesignImpl();
		return vsvsTestingSpecificationDesign;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VSVSTestDesign createVSVSTestDesign() {
		VSVSTestDesignImpl vsvsTestDesign = new VSVSTestDesignImpl();
		return vsvsTestDesign;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VSVSTestCases createVSVSTestCases() {
		VSVSTestCasesImpl vsvsTestCases = new VSVSTestCasesImpl();
		return vsvsTestCases;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VSVSTestCase createVSVSTestCase() {
		VSVSTestCaseImpl vsvsTestCase = new VSVSTestCaseImpl();
		return vsvsTestCase;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VSVSTestProcedures createVSVSTestProcedures() {
		VSVSTestProceduresImpl vsvsTestProcedures = new VSVSTestProceduresImpl();
		return vsvsTestProcedures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VSVSTestProcedure createVSVSTestProcedure() {
		VSVSTestProcedureImpl vsvsTestProcedure = new VSVSTestProcedureImpl();
		return vsvsTestProcedure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VSVSProcedureSteps createVSVSProcedureSteps() {
		VSVSProcedureStepsImpl vsvsProcedureSteps = new VSVSProcedureStepsImpl();
		return vsvsProcedureSteps;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VSVSProcedureStep createVSVSProcedureStep() {
		VSVSProcedureStepImpl vsvsProcedureStep = new VSVSProcedureStepImpl();
		return vsvsProcedureStep;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VSVSStepInputs createVSVSStepInputs() {
		VSVSStepInputsImpl vsvsStepInputs = new VSVSStepInputsImpl();
		return vsvsStepInputs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VSVSStepOutputs createVSVSStepOutputs() {
		VSVSStepOutputsImpl vsvsStepOutputs = new VSVSStepOutputsImpl();
		return vsvsStepOutputs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VSVSStepSpecialPackets createVSVSStepSpecialPackets() {
		VSVSStepSpecialPacketsImpl vsvsStepSpecialPackets = new VSVSStepSpecialPacketsImpl();
		return vsvsStepSpecialPackets;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VSVSStepEnableDisable createVSVSStepEnableDisable() {
		VSVSStepEnableDisableImpl vsvsStepEnableDisable = new VSVSStepEnableDisableImpl();
		return vsvsStepEnableDisable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VSVSStepConcurrentSteps createVSVSStepConcurrentSteps() {
		VSVSStepConcurrentStepsImpl vsvsStepConcurrentSteps = new VSVSStepConcurrentStepsImpl();
		return vsvsStepConcurrentSteps;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VSVSStepNextStep createVSVSStepNextStep() {
		VSVSStepNextStepImpl vsvsStepNextStep = new VSVSStepNextStepImpl();
		return vsvsStepNextStep;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VSVSStepConcurrentStep createVSVSStepConcurrentStep() {
		VSVSStepConcurrentStepImpl vsvsStepConcurrentStep = new VSVSStepConcurrentStepImpl();
		return vsvsStepConcurrentStep;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VSVSStepInput createVSVSStepInput() {
		VSVSStepInputImpl vsvsStepInput = new VSVSStepInputImpl();
		return vsvsStepInput;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VSVSStepInputLevel3 createVSVSStepInputLevel3() {
		VSVSStepInputLevel3Impl vsvsStepInputLevel3 = new VSVSStepInputLevel3Impl();
		return vsvsStepInputLevel3;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VSVSStepInputLevel2 createVSVSStepInputLevel2() {
		VSVSStepInputLevel2Impl vsvsStepInputLevel2 = new VSVSStepInputLevel2Impl();
		return vsvsStepInputLevel2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VSVSStepInputLevel1 createVSVSStepInputLevel1() {
		VSVSStepInputLevel1Impl vsvsStepInputLevel1 = new VSVSStepInputLevel1Impl();
		return vsvsStepInputLevel1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VSVSStepInputLevel0 createVSVSStepInputLevel0() {
		VSVSStepInputLevel0Impl vsvsStepInputLevel0 = new VSVSStepInputLevel0Impl();
		return vsvsStepInputLevel0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VSVSStepOutputLevel3 createVSVSStepOutputLevel3() {
		VSVSStepOutputLevel3Impl vsvsStepOutputLevel3 = new VSVSStepOutputLevel3Impl();
		return vsvsStepOutputLevel3;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VSVSStepOutputLevel2 createVSVSStepOutputLevel2() {
		VSVSStepOutputLevel2Impl vsvsStepOutputLevel2 = new VSVSStepOutputLevel2Impl();
		return vsvsStepOutputLevel2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VSVSStepOutputLevel1 createVSVSStepOutputLevel1() {
		VSVSStepOutputLevel1Impl vsvsStepOutputLevel1 = new VSVSStepOutputLevel1Impl();
		return vsvsStepOutputLevel1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VSVSStepOutputLevel0 createVSVSStepOutputLevel0() {
		VSVSStepOutputLevel0Impl vsvsStepOutputLevel0 = new VSVSStepOutputLevel0Impl();
		return vsvsStepOutputLevel0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VSVSStepFilter createVSVSStepFilter() {
		VSVSStepFilterImpl vsvsStepFilter = new VSVSStepFilterImpl();
		return vsvsStepFilter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VSVSAnalysisInspectionReview createVSVSAnalysisInspectionReview() {
		VSVSAnalysisInspectionReviewImpl vsvsAnalysisInspectionReview = new VSVSAnalysisInspectionReviewImpl();
		return vsvsAnalysisInspectionReview;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VSVSTestPlatformRequirements createVSVSTestPlatformRequirements() {
		VSVSTestPlatformRequirementsImpl vsvsTestPlatformRequirements = new VSVSTestPlatformRequirementsImpl();
		return vsvsTestPlatformRequirements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VSVSAdditionalInformation createVSVSAdditionalInformation() {
		VSVSAdditionalInformationImpl vsvsAdditionalInformation = new VSVSAdditionalInformationImpl();
		return vsvsAdditionalInformation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VSVSStepMode createVSVSStepModeFromString(EDataType eDataType, String initialValue) {
		VSVSStepMode result = VSVSStepMode.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertVSVSStepModeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VSVSStepUnit createVSVSStepUnitFromString(EDataType eDataType, String initialValue) {
		VSVSStepUnit result = VSVSStepUnit.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertVSVSStepUnitToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VSVSStepCheckmode createVSVSStepCheckmodeFromString(EDataType eDataType, String initialValue) {
		VSVSStepCheckmode result = VSVSStepCheckmode.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertVSVSStepCheckmodeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VSVSStepYesNo createVSVSStepYesNoFromString(EDataType eDataType, String initialValue) {
		VSVSStepYesNo result = VSVSStepYesNo.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertVSVSStepYesNoToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public svsPackage getsvsPackage() {
		return (svsPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static svsPackage getPackage() {
		return svsPackage.eINSTANCE;
	}

} //svsFactoryImpl
