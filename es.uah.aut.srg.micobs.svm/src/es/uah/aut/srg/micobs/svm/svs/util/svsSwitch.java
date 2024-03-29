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
package es.uah.aut.srg.micobs.svm.svs.util;

import es.uah.aut.srg.micobs.common.MCommonReferenceableObj;

import es.uah.aut.srg.micobs.doctpl.doctpl.DAbstractSection;
import es.uah.aut.srg.micobs.doctpl.doctpl.DDocumentTemplate;
import es.uah.aut.srg.micobs.doctpl.doctpl.DFixedSection;
import es.uah.aut.srg.micobs.doctpl.doctpl.DInstantiableSection;

import es.uah.aut.srg.micobs.svm.svs.*;

import es.uah.aut.srg.micobs.svm.vdm.VValidationDocument;
import es.uah.aut.srg.micobs.svm.vdm.VValidationDocumentAbstractGroup;
import es.uah.aut.srg.micobs.svm.vdm.VValidationDocumentAbstractItem;
import es.uah.aut.srg.micobs.svm.vdm.VValidationDocumentFixedGroup;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see es.uah.aut.srg.micobs.svm.svs.svsPackage
 * @generated
 */
public class svsSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static svsPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public svsSwitch() {
		if (modelPackage == null) {
			modelPackage = svsPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case svsPackage.VSVS_DOCUMENT: {
				VSVSDocument vsvsDocument = (VSVSDocument)theEObject;
				T result = caseVSVSDocument(vsvsDocument);
				if (result == null) result = caseVValidationDocument(vsvsDocument);
				if (result == null) result = caseDDocumentTemplate(vsvsDocument);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case svsPackage.VSVSTB_CS_TB_DS: {
				VSVSTBCsTBDs vsvstbCsTBDs = (VSVSTBCsTBDs)theEObject;
				T result = caseVSVSTBCsTBDs(vsvstbCsTBDs);
				if (result == null) result = caseDFixedSection(vsvstbCsTBDs);
				if (result == null) result = caseDAbstractSection(vsvstbCsTBDs);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case svsPackage.VSVS_INSTANTIABLE_SECTION: {
				VSVSInstantiableSection vsvsInstantiableSection = (VSVSInstantiableSection)theEObject;
				T result = caseVSVSInstantiableSection(vsvsInstantiableSection);
				if (result == null) result = caseDInstantiableSection(vsvsInstantiableSection);
				if (result == null) result = caseDAbstractSection(vsvsInstantiableSection);
				if (result == null) result = caseMCommonReferenceableObj(vsvsInstantiableSection);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case svsPackage.VSVS_INTRODUCTION: {
				VSVSIntroduction vsvsIntroduction = (VSVSIntroduction)theEObject;
				T result = caseVSVSIntroduction(vsvsIntroduction);
				if (result == null) result = caseDFixedSection(vsvsIntroduction);
				if (result == null) result = caseDAbstractSection(vsvsIntroduction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case svsPackage.VSVS_APPLICABLE_DOCUMENTS: {
				VSVSApplicableDocuments vsvsApplicableDocuments = (VSVSApplicableDocuments)theEObject;
				T result = caseVSVSApplicableDocuments(vsvsApplicableDocuments);
				if (result == null) result = caseDFixedSection(vsvsApplicableDocuments);
				if (result == null) result = caseDAbstractSection(vsvsApplicableDocuments);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case svsPackage.VSVS_REFERENCE_DOCUMENTS: {
				VSVSReferenceDocuments vsvsReferenceDocuments = (VSVSReferenceDocuments)theEObject;
				T result = caseVSVSReferenceDocuments(vsvsReferenceDocuments);
				if (result == null) result = caseDFixedSection(vsvsReferenceDocuments);
				if (result == null) result = caseDAbstractSection(vsvsReferenceDocuments);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case svsPackage.VSVS_TERMS_DEFINITIONS_ABBREVIATIONS: {
				VSVSTermsDefinitionsAbbreviations vsvsTermsDefinitionsAbbreviations = (VSVSTermsDefinitionsAbbreviations)theEObject;
				T result = caseVSVSTermsDefinitionsAbbreviations(vsvsTermsDefinitionsAbbreviations);
				if (result == null) result = caseDFixedSection(vsvsTermsDefinitionsAbbreviations);
				if (result == null) result = caseDAbstractSection(vsvsTermsDefinitionsAbbreviations);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case svsPackage.VSVS_ABSTRACT_BRIEF_DESCRIPTION: {
				VSVSAbstractBriefDescription vsvsAbstractBriefDescription = (VSVSAbstractBriefDescription)theEObject;
				T result = caseVSVSAbstractBriefDescription(vsvsAbstractBriefDescription);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case svsPackage.VSVS_TERM: {
				VSVSTerm vsvsTerm = (VSVSTerm)theEObject;
				T result = caseVSVSTerm(vsvsTerm);
				if (result == null) result = caseVSVSAbstractBriefDescription(vsvsTerm);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case svsPackage.VSVS_DEFINITION: {
				VSVSDefinition vsvsDefinition = (VSVSDefinition)theEObject;
				T result = caseVSVSDefinition(vsvsDefinition);
				if (result == null) result = caseVSVSAbstractBriefDescription(vsvsDefinition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case svsPackage.VSVS_ABBREVIATION: {
				VSVSAbbreviation vsvsAbbreviation = (VSVSAbbreviation)theEObject;
				T result = caseVSVSAbbreviation(vsvsAbbreviation);
				if (result == null) result = caseVSVSAbstractBriefDescription(vsvsAbbreviation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case svsPackage.VSVS_FIXED_SECTION: {
				VSVSFixedSection vsvsFixedSection = (VSVSFixedSection)theEObject;
				T result = caseVSVSFixedSection(vsvsFixedSection);
				if (result == null) result = caseDFixedSection(vsvsFixedSection);
				if (result == null) result = caseDAbstractSection(vsvsFixedSection);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case svsPackage.VSVS_SOFTWARE_OVERVIEW: {
				VSVSSoftwareOverview vsvsSoftwareOverview = (VSVSSoftwareOverview)theEObject;
				T result = caseVSVSSoftwareOverview(vsvsSoftwareOverview);
				if (result == null) result = caseVSVSFixedSection(vsvsSoftwareOverview);
				if (result == null) result = caseDFixedSection(vsvsSoftwareOverview);
				if (result == null) result = caseDAbstractSection(vsvsSoftwareOverview);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case svsPackage.VSVS_TASK_IDENTIFICATION: {
				VSVSTaskIdentification vsvsTaskIdentification = (VSVSTaskIdentification)theEObject;
				T result = caseVSVSTaskIdentification(vsvsTaskIdentification);
				if (result == null) result = caseDFixedSection(vsvsTaskIdentification);
				if (result == null) result = caseDAbstractSection(vsvsTaskIdentification);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case svsPackage.VSVS_TESTING_SPECIFICATION_DESIGN: {
				VSVSTestingSpecificationDesign vsvsTestingSpecificationDesign = (VSVSTestingSpecificationDesign)theEObject;
				T result = caseVSVSTestingSpecificationDesign(vsvsTestingSpecificationDesign);
				if (result == null) result = caseDFixedSection(vsvsTestingSpecificationDesign);
				if (result == null) result = caseDAbstractSection(vsvsTestingSpecificationDesign);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case svsPackage.VSVS_TEST_DESIGN: {
				VSVSTestDesign vsvsTestDesign = (VSVSTestDesign)theEObject;
				T result = caseVSVSTestDesign(vsvsTestDesign);
				if (result == null) result = caseDFixedSection(vsvsTestDesign);
				if (result == null) result = caseDAbstractSection(vsvsTestDesign);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case svsPackage.VSVS_TEST_INFO: {
				VSVSTestInfo vsvsTestInfo = (VSVSTestInfo)theEObject;
				T result = caseVSVSTestInfo(vsvsTestInfo);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case svsPackage.VSVS_TEST_CASES: {
				VSVSTestCases vsvsTestCases = (VSVSTestCases)theEObject;
				T result = caseVSVSTestCases(vsvsTestCases);
				if (result == null) result = caseVValidationDocumentFixedGroup(vsvsTestCases);
				if (result == null) result = caseDFixedSection(vsvsTestCases);
				if (result == null) result = caseVValidationDocumentAbstractGroup(vsvsTestCases);
				if (result == null) result = caseDAbstractSection(vsvsTestCases);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case svsPackage.VSVS_TEST_CASE: {
				VSVSTestCase vsvsTestCase = (VSVSTestCase)theEObject;
				T result = caseVSVSTestCase(vsvsTestCase);
				if (result == null) result = caseVValidationDocumentAbstractItem(vsvsTestCase);
				if (result == null) result = caseDFixedSection(vsvsTestCase);
				if (result == null) result = caseDAbstractSection(vsvsTestCase);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case svsPackage.VSVS_TEST_PROCEDURES: {
				VSVSTestProcedures vsvsTestProcedures = (VSVSTestProcedures)theEObject;
				T result = caseVSVSTestProcedures(vsvsTestProcedures);
				if (result == null) result = caseDFixedSection(vsvsTestProcedures);
				if (result == null) result = caseDAbstractSection(vsvsTestProcedures);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case svsPackage.VSVS_TEST_PROCEDURE: {
				VSVSTestProcedure vsvsTestProcedure = (VSVSTestProcedure)theEObject;
				T result = caseVSVSTestProcedure(vsvsTestProcedure);
				if (result == null) result = caseDFixedSection(vsvsTestProcedure);
				if (result == null) result = caseDAbstractSection(vsvsTestProcedure);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case svsPackage.VSVS_PROCEDURE_STEPS: {
				VSVSProcedureSteps vsvsProcedureSteps = (VSVSProcedureSteps)theEObject;
				T result = caseVSVSProcedureSteps(vsvsProcedureSteps);
				if (result == null) result = caseDFixedSection(vsvsProcedureSteps);
				if (result == null) result = caseDAbstractSection(vsvsProcedureSteps);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case svsPackage.VSVS_PROCEDURE_STEP: {
				VSVSProcedureStep vsvsProcedureStep = (VSVSProcedureStep)theEObject;
				T result = caseVSVSProcedureStep(vsvsProcedureStep);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case svsPackage.VSVS_STEP_CONFIGURATIONS: {
				VSVSStepConfigurations vsvsStepConfigurations = (VSVSStepConfigurations)theEObject;
				T result = caseVSVSStepConfigurations(vsvsStepConfigurations);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case svsPackage.VSVS_STEP_CONFIGURATION: {
				VSVSStepConfiguration vsvsStepConfiguration = (VSVSStepConfiguration)theEObject;
				T result = caseVSVSStepConfiguration(vsvsStepConfiguration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case svsPackage.VSVS_STEP_INPUTS: {
				VSVSStepInputs vsvsStepInputs = (VSVSStepInputs)theEObject;
				T result = caseVSVSStepInputs(vsvsStepInputs);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case svsPackage.VSVS_STEP_ACTION: {
				VSVSStepAction vsvsStepAction = (VSVSStepAction)theEObject;
				T result = caseVSVSStepAction(vsvsStepAction);
				if (result == null) result = caseVSVSStepInputs(vsvsStepAction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case svsPackage.VSVS_STEP_TELECOMMAND_SEQUENCE: {
				VSVSStepTelecommandSequence vsvsStepTelecommandSequence = (VSVSStepTelecommandSequence)theEObject;
				T result = caseVSVSStepTelecommandSequence(vsvsStepTelecommandSequence);
				if (result == null) result = caseVSVSStepInputs(vsvsStepTelecommandSequence);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case svsPackage.VSVS_STEP_TELECOMMAND: {
				VSVSStepTelecommand vsvsStepTelecommand = (VSVSStepTelecommand)theEObject;
				T result = caseVSVSStepTelecommand(vsvsStepTelecommand);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case svsPackage.VSVS_STEP_TELECOMMAND_DATA: {
				VSVSStepTelecommandData vsvsStepTelecommandData = (VSVSStepTelecommandData)theEObject;
				T result = caseVSVSStepTelecommandData(vsvsStepTelecommandData);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case svsPackage.VSVS_STEP_TELECOMMAND_DATA_FIELD: {
				VSVSStepTelecommandDataField vsvsStepTelecommandDataField = (VSVSStepTelecommandDataField)theEObject;
				T result = caseVSVSStepTelecommandDataField(vsvsStepTelecommandDataField);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case svsPackage.VSVS_STEP_TELECOMMAND_HEADER: {
				VSVSStepTelecommandHeader vsvsStepTelecommandHeader = (VSVSStepTelecommandHeader)theEObject;
				T result = caseVSVSStepTelecommandHeader(vsvsStepTelecommandHeader);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case svsPackage.VSVS_STEP_TELECOMMAND_HEADER_FIELD: {
				VSVSStepTelecommandHeaderField vsvsStepTelecommandHeaderField = (VSVSStepTelecommandHeaderField)theEObject;
				T result = caseVSVSStepTelecommandHeaderField(vsvsStepTelecommandHeaderField);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case svsPackage.VSVS_STEP_OUTPUTS: {
				VSVSStepOutputs vsvsStepOutputs = (VSVSStepOutputs)theEObject;
				T result = caseVSVSStepOutputs(vsvsStepOutputs);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case svsPackage.VSVS_STEP_TELEMETRY_SET: {
				VSVSStepTelemetrySet vsvsStepTelemetrySet = (VSVSStepTelemetrySet)theEObject;
				T result = caseVSVSStepTelemetrySet(vsvsStepTelemetrySet);
				if (result == null) result = caseVSVSStepOutputs(vsvsStepTelemetrySet);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case svsPackage.VSVS_STEP_TELEMETRY: {
				VSVSStepTelemetry vsvsStepTelemetry = (VSVSStepTelemetry)theEObject;
				T result = caseVSVSStepTelemetry(vsvsStepTelemetry);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case svsPackage.VSVS_STEP_TELEMETRY_DATA: {
				VSVSStepTelemetryData vsvsStepTelemetryData = (VSVSStepTelemetryData)theEObject;
				T result = caseVSVSStepTelemetryData(vsvsStepTelemetryData);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case svsPackage.VSVS_STEP_TELEMETRY_DATA_FIELD: {
				VSVSStepTelemetryDataField vsvsStepTelemetryDataField = (VSVSStepTelemetryDataField)theEObject;
				T result = caseVSVSStepTelemetryDataField(vsvsStepTelemetryDataField);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case svsPackage.VSVS_STEP_TELEMETRY_HEADER: {
				VSVSStepTelemetryHeader vsvsStepTelemetryHeader = (VSVSStepTelemetryHeader)theEObject;
				T result = caseVSVSStepTelemetryHeader(vsvsStepTelemetryHeader);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case svsPackage.VSVS_STEP_TELEMETRY_HEADER_FIELD: {
				VSVSStepTelemetryHeaderField vsvsStepTelemetryHeaderField = (VSVSStepTelemetryHeaderField)theEObject;
				T result = caseVSVSStepTelemetryHeaderField(vsvsStepTelemetryHeaderField);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case svsPackage.VSVS_ANALYSIS_INSPECTION_REVIEW: {
				VSVSAnalysisInspectionReview vsvsAnalysisInspectionReview = (VSVSAnalysisInspectionReview)theEObject;
				T result = caseVSVSAnalysisInspectionReview(vsvsAnalysisInspectionReview);
				if (result == null) result = caseVSVSFixedSection(vsvsAnalysisInspectionReview);
				if (result == null) result = caseDFixedSection(vsvsAnalysisInspectionReview);
				if (result == null) result = caseDAbstractSection(vsvsAnalysisInspectionReview);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case svsPackage.VSVS_TEST_PLATFORM_REQUIREMENTS: {
				VSVSTestPlatformRequirements vsvsTestPlatformRequirements = (VSVSTestPlatformRequirements)theEObject;
				T result = caseVSVSTestPlatformRequirements(vsvsTestPlatformRequirements);
				if (result == null) result = caseVSVSFixedSection(vsvsTestPlatformRequirements);
				if (result == null) result = caseDFixedSection(vsvsTestPlatformRequirements);
				if (result == null) result = caseDAbstractSection(vsvsTestPlatformRequirements);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case svsPackage.VSVS_ADDITIONAL_INFORMATION: {
				VSVSAdditionalInformation vsvsAdditionalInformation = (VSVSAdditionalInformation)theEObject;
				T result = caseVSVSAdditionalInformation(vsvsAdditionalInformation);
				if (result == null) result = caseVSVSFixedSection(vsvsAdditionalInformation);
				if (result == null) result = caseDFixedSection(vsvsAdditionalInformation);
				if (result == null) result = caseDAbstractSection(vsvsAdditionalInformation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>VSVS Document</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>VSVS Document</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVSVSDocument(VSVSDocument object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>VSVSTB Cs TB Ds</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>VSVSTB Cs TB Ds</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVSVSTBCsTBDs(VSVSTBCsTBDs object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>VSVS Instantiable Section</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>VSVS Instantiable Section</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVSVSInstantiableSection(VSVSInstantiableSection object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>VSVS Introduction</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>VSVS Introduction</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVSVSIntroduction(VSVSIntroduction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>VSVS Applicable Documents</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>VSVS Applicable Documents</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVSVSApplicableDocuments(VSVSApplicableDocuments object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>VSVS Reference Documents</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>VSVS Reference Documents</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVSVSReferenceDocuments(VSVSReferenceDocuments object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>VSVS Terms Definitions Abbreviations</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>VSVS Terms Definitions Abbreviations</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVSVSTermsDefinitionsAbbreviations(VSVSTermsDefinitionsAbbreviations object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>VSVS Abstract Brief Description</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>VSVS Abstract Brief Description</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVSVSAbstractBriefDescription(VSVSAbstractBriefDescription object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>VSVS Term</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>VSVS Term</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVSVSTerm(VSVSTerm object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>VSVS Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>VSVS Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVSVSDefinition(VSVSDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>VSVS Abbreviation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>VSVS Abbreviation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVSVSAbbreviation(VSVSAbbreviation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>VSVS Fixed Section</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>VSVS Fixed Section</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVSVSFixedSection(VSVSFixedSection object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>VSVS Software Overview</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>VSVS Software Overview</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVSVSSoftwareOverview(VSVSSoftwareOverview object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>VSVS Task Identification</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>VSVS Task Identification</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVSVSTaskIdentification(VSVSTaskIdentification object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>VSVS Testing Specification Design</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>VSVS Testing Specification Design</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVSVSTestingSpecificationDesign(VSVSTestingSpecificationDesign object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>VSVS Test Design</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>VSVS Test Design</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVSVSTestDesign(VSVSTestDesign object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>VSVS Test Info</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>VSVS Test Info</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVSVSTestInfo(VSVSTestInfo object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>VSVS Test Cases</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>VSVS Test Cases</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVSVSTestCases(VSVSTestCases object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>VSVS Test Case</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>VSVS Test Case</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVSVSTestCase(VSVSTestCase object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>VSVS Test Procedures</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>VSVS Test Procedures</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVSVSTestProcedures(VSVSTestProcedures object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>VSVS Test Procedure</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>VSVS Test Procedure</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVSVSTestProcedure(VSVSTestProcedure object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>VSVS Procedure Steps</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>VSVS Procedure Steps</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVSVSProcedureSteps(VSVSProcedureSteps object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>VSVS Procedure Step</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>VSVS Procedure Step</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVSVSProcedureStep(VSVSProcedureStep object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>VSVS Step Outputs</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>VSVS Step Outputs</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVSVSStepOutputs(VSVSStepOutputs object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>VSVS Step Telemetry Set</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>VSVS Step Telemetry Set</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVSVSStepTelemetrySet(VSVSStepTelemetrySet object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>VSVS Step Telemetry</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>VSVS Step Telemetry</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVSVSStepTelemetry(VSVSStepTelemetry object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>VSVS Step Telemetry Data</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>VSVS Step Telemetry Data</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVSVSStepTelemetryData(VSVSStepTelemetryData object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>VSVS Step Telemetry Data Field</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>VSVS Step Telemetry Data Field</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVSVSStepTelemetryDataField(VSVSStepTelemetryDataField object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>VSVS Step Telemetry Header</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>VSVS Step Telemetry Header</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVSVSStepTelemetryHeader(VSVSStepTelemetryHeader object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>VSVS Step Telemetry Header Field</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>VSVS Step Telemetry Header Field</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVSVSStepTelemetryHeaderField(VSVSStepTelemetryHeaderField object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>VSVS Step Configurations</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>VSVS Step Configurations</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVSVSStepConfigurations(VSVSStepConfigurations object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>VSVS Step Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>VSVS Step Configuration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVSVSStepConfiguration(VSVSStepConfiguration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>VSVS Step Inputs</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>VSVS Step Inputs</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVSVSStepInputs(VSVSStepInputs object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>VSVS Step Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>VSVS Step Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVSVSStepAction(VSVSStepAction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>VSVS Step Telecommand Sequence</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>VSVS Step Telecommand Sequence</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVSVSStepTelecommandSequence(VSVSStepTelecommandSequence object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>VSVS Step Telecommand</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>VSVS Step Telecommand</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVSVSStepTelecommand(VSVSStepTelecommand object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>VSVS Step Telecommand Data</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>VSVS Step Telecommand Data</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVSVSStepTelecommandData(VSVSStepTelecommandData object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>VSVS Step Telecommand Data Field</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>VSVS Step Telecommand Data Field</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVSVSStepTelecommandDataField(VSVSStepTelecommandDataField object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>VSVS Step Telecommand Header</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>VSVS Step Telecommand Header</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVSVSStepTelecommandHeader(VSVSStepTelecommandHeader object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>VSVS Step Telecommand Header Field</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>VSVS Step Telecommand Header Field</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVSVSStepTelecommandHeaderField(VSVSStepTelecommandHeaderField object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>VSVS Analysis Inspection Review</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>VSVS Analysis Inspection Review</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVSVSAnalysisInspectionReview(VSVSAnalysisInspectionReview object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>VSVS Test Platform Requirements</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>VSVS Test Platform Requirements</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVSVSTestPlatformRequirements(VSVSTestPlatformRequirements object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>VSVS Additional Information</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>VSVS Additional Information</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVSVSAdditionalInformation(VSVSAdditionalInformation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>VValidation Document</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>VValidation Document</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVValidationDocument(VValidationDocument object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>DDocument Template</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>DDocument Template</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDDocumentTemplate(DDocumentTemplate object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>DAbstract Section</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>DAbstract Section</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDAbstractSection(DAbstractSection object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MCommon Referenceable Obj</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MCommon Referenceable Obj</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMCommonReferenceableObj(MCommonReferenceableObj object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>DInstantiable Section</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>DInstantiable Section</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDInstantiableSection(DInstantiableSection object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>DFixed Section</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>DFixed Section</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDFixedSection(DFixedSection object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>VValidation Document Abstract Group</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>VValidation Document Abstract Group</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVValidationDocumentAbstractGroup(VValidationDocumentAbstractGroup object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>VValidation Document Fixed Group</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>VValidation Document Fixed Group</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVValidationDocumentFixedGroup(VValidationDocumentFixedGroup object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>VValidation Document Abstract Item</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>VValidation Document Abstract Item</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVValidationDocumentAbstractItem(VValidationDocumentAbstractItem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //svsSwitch
