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
			case svsPackage.VSVSTB_CS_TB_DS: return createVSVSTBCsTBDs();
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
			case svsPackage.VSVS_TEST_INFO: return createVSVSTestInfo();
			case svsPackage.VSVS_TEST_CASES: return createVSVSTestCases();
			case svsPackage.VSVS_TEST_CASE: return createVSVSTestCase();
			case svsPackage.VSVS_TEST_PROCEDURES: return createVSVSTestProcedures();
			case svsPackage.VSVS_TEST_PROCEDURE: return createVSVSTestProcedure();
			case svsPackage.VSVS_PROCEDURE_STEPS: return createVSVSProcedureSteps();
			case svsPackage.VSVS_PROCEDURE_STEP: return createVSVSProcedureStep();
			case svsPackage.VSVS_STEP_CONFIGURATIONS: return createVSVSStepConfigurations();
			case svsPackage.VSVS_STEP_CONFIGURATION: return createVSVSStepConfiguration();
			case svsPackage.VSVS_STEP_ACTION: return createVSVSStepAction();
			case svsPackage.VSVS_STEP_TELECOMMAND_SEQUENCE: return createVSVSStepTelecommandSequence();
			case svsPackage.VSVS_STEP_TELECOMMAND: return createVSVSStepTelecommand();
			case svsPackage.VSVS_STEP_TELECOMMAND_DATA: return createVSVSStepTelecommandData();
			case svsPackage.VSVS_STEP_TELECOMMAND_DATA_FIELD: return createVSVSStepTelecommandDataField();
			case svsPackage.VSVS_STEP_TELECOMMAND_HEADER: return createVSVSStepTelecommandHeader();
			case svsPackage.VSVS_STEP_TELECOMMAND_HEADER_FIELD: return createVSVSStepTelecommandHeaderField();
			case svsPackage.VSVS_STEP_OUTPUTS: return createVSVSStepOutputs();
			case svsPackage.VSVS_STEP_TELEMETRY_SET: return createVSVSStepTelemetrySet();
			case svsPackage.VSVS_STEP_TELEMETRY: return createVSVSStepTelemetry();
			case svsPackage.VSVS_STEP_TELEMETRY_DATA: return createVSVSStepTelemetryData();
			case svsPackage.VSVS_STEP_TELEMETRY_DATA_FIELD: return createVSVSStepTelemetryDataField();
			case svsPackage.VSVS_STEP_TELEMETRY_HEADER: return createVSVSStepTelemetryHeader();
			case svsPackage.VSVS_STEP_TELEMETRY_HEADER_FIELD: return createVSVSStepTelemetryHeaderField();
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
			case svsPackage.VSVS_TIME_UNIT:
				return createVSVSTimeUnitFromString(eDataType, initialValue);
			case svsPackage.VSVS_STEP_TELEMETRY_SET_CHECKMODE:
				return createVSVSStepTelemetrySetCheckmodeFromString(eDataType, initialValue);
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
			case svsPackage.VSVS_TIME_UNIT:
				return convertVSVSTimeUnitToString(eDataType, instanceValue);
			case svsPackage.VSVS_STEP_TELEMETRY_SET_CHECKMODE:
				return convertVSVSStepTelemetrySetCheckmodeToString(eDataType, instanceValue);
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
	public VSVSTBCsTBDs createVSVSTBCsTBDs() {
		VSVSTBCsTBDsImpl vsvstbCsTBDs = new VSVSTBCsTBDsImpl();
		return vsvstbCsTBDs;
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
	public VSVSTestInfo createVSVSTestInfo() {
		VSVSTestInfoImpl vsvsTestInfo = new VSVSTestInfoImpl();
		return vsvsTestInfo;
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
	public VSVSStepOutputs createVSVSStepOutputs() {
		VSVSStepOutputsImpl vsvsStepOutputs = new VSVSStepOutputsImpl();
		return vsvsStepOutputs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VSVSStepTelemetrySet createVSVSStepTelemetrySet() {
		VSVSStepTelemetrySetImpl vsvsStepTelemetrySet = new VSVSStepTelemetrySetImpl();
		return vsvsStepTelemetrySet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VSVSStepTelemetry createVSVSStepTelemetry() {
		VSVSStepTelemetryImpl vsvsStepTelemetry = new VSVSStepTelemetryImpl();
		return vsvsStepTelemetry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VSVSStepTelemetryData createVSVSStepTelemetryData() {
		VSVSStepTelemetryDataImpl vsvsStepTelemetryData = new VSVSStepTelemetryDataImpl();
		return vsvsStepTelemetryData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VSVSStepTelemetryDataField createVSVSStepTelemetryDataField() {
		VSVSStepTelemetryDataFieldImpl vsvsStepTelemetryDataField = new VSVSStepTelemetryDataFieldImpl();
		return vsvsStepTelemetryDataField;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VSVSStepTelemetryHeader createVSVSStepTelemetryHeader() {
		VSVSStepTelemetryHeaderImpl vsvsStepTelemetryHeader = new VSVSStepTelemetryHeaderImpl();
		return vsvsStepTelemetryHeader;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VSVSStepTelemetryHeaderField createVSVSStepTelemetryHeaderField() {
		VSVSStepTelemetryHeaderFieldImpl vsvsStepTelemetryHeaderField = new VSVSStepTelemetryHeaderFieldImpl();
		return vsvsStepTelemetryHeaderField;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VSVSStepConfigurations createVSVSStepConfigurations() {
		VSVSStepConfigurationsImpl vsvsStepConfigurations = new VSVSStepConfigurationsImpl();
		return vsvsStepConfigurations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VSVSStepConfiguration createVSVSStepConfiguration() {
		VSVSStepConfigurationImpl vsvsStepConfiguration = new VSVSStepConfigurationImpl();
		return vsvsStepConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VSVSStepAction createVSVSStepAction() {
		VSVSStepActionImpl vsvsStepAction = new VSVSStepActionImpl();
		return vsvsStepAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VSVSStepTelecommandSequence createVSVSStepTelecommandSequence() {
		VSVSStepTelecommandSequenceImpl vsvsStepTelecommandSequence = new VSVSStepTelecommandSequenceImpl();
		return vsvsStepTelecommandSequence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VSVSStepTelecommand createVSVSStepTelecommand() {
		VSVSStepTelecommandImpl vsvsStepTelecommand = new VSVSStepTelecommandImpl();
		return vsvsStepTelecommand;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VSVSStepTelecommandData createVSVSStepTelecommandData() {
		VSVSStepTelecommandDataImpl vsvsStepTelecommandData = new VSVSStepTelecommandDataImpl();
		return vsvsStepTelecommandData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VSVSStepTelecommandDataField createVSVSStepTelecommandDataField() {
		VSVSStepTelecommandDataFieldImpl vsvsStepTelecommandDataField = new VSVSStepTelecommandDataFieldImpl();
		return vsvsStepTelecommandDataField;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VSVSStepTelecommandHeader createVSVSStepTelecommandHeader() {
		VSVSStepTelecommandHeaderImpl vsvsStepTelecommandHeader = new VSVSStepTelecommandHeaderImpl();
		return vsvsStepTelecommandHeader;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VSVSStepTelecommandHeaderField createVSVSStepTelecommandHeaderField() {
		VSVSStepTelecommandHeaderFieldImpl vsvsStepTelecommandHeaderField = new VSVSStepTelecommandHeaderFieldImpl();
		return vsvsStepTelecommandHeaderField;
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
	public VSVSTimeUnit createVSVSTimeUnitFromString(EDataType eDataType, String initialValue) {
		VSVSTimeUnit result = VSVSTimeUnit.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertVSVSTimeUnitToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VSVSStepTelemetrySetCheckmode createVSVSStepTelemetrySetCheckmodeFromString(EDataType eDataType, String initialValue) {
		VSVSStepTelemetrySetCheckmode result = VSVSStepTelemetrySetCheckmode.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertVSVSStepTelemetrySetCheckmodeToString(EDataType eDataType, Object instanceValue) {
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
