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

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see es.uah.aut.srg.micobs.svm.svs.svsPackage
 * @generated
 */
public class svsAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static svsPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public svsAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = svsPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected svsSwitch<Adapter> modelSwitch =
		new svsSwitch<Adapter>() {
			@Override
			public Adapter caseVSVSDocument(VSVSDocument object) {
				return createVSVSDocumentAdapter();
			}
			@Override
			public Adapter caseVSVSInstantiableSection(VSVSInstantiableSection object) {
				return createVSVSInstantiableSectionAdapter();
			}
			@Override
			public Adapter caseVSVSIntroduction(VSVSIntroduction object) {
				return createVSVSIntroductionAdapter();
			}
			@Override
			public Adapter caseVSVSApplicableDocuments(VSVSApplicableDocuments object) {
				return createVSVSApplicableDocumentsAdapter();
			}
			@Override
			public Adapter caseVSVSReferenceDocuments(VSVSReferenceDocuments object) {
				return createVSVSReferenceDocumentsAdapter();
			}
			@Override
			public Adapter caseVSVSTermsDefinitionsAbbreviations(VSVSTermsDefinitionsAbbreviations object) {
				return createVSVSTermsDefinitionsAbbreviationsAdapter();
			}
			@Override
			public Adapter caseVSVSAbstractBriefDescription(VSVSAbstractBriefDescription object) {
				return createVSVSAbstractBriefDescriptionAdapter();
			}
			@Override
			public Adapter caseVSVSTerm(VSVSTerm object) {
				return createVSVSTermAdapter();
			}
			@Override
			public Adapter caseVSVSDefinition(VSVSDefinition object) {
				return createVSVSDefinitionAdapter();
			}
			@Override
			public Adapter caseVSVSAbbreviation(VSVSAbbreviation object) {
				return createVSVSAbbreviationAdapter();
			}
			@Override
			public Adapter caseVSVSFixedSection(VSVSFixedSection object) {
				return createVSVSFixedSectionAdapter();
			}
			@Override
			public Adapter caseVSVSSoftwareOverview(VSVSSoftwareOverview object) {
				return createVSVSSoftwareOverviewAdapter();
			}
			@Override
			public Adapter caseVSVSTaskIdentification(VSVSTaskIdentification object) {
				return createVSVSTaskIdentificationAdapter();
			}
			@Override
			public Adapter caseVSVSTestingSpecificationDesign(VSVSTestingSpecificationDesign object) {
				return createVSVSTestingSpecificationDesignAdapter();
			}
			@Override
			public Adapter caseVSVSTestDesign(VSVSTestDesign object) {
				return createVSVSTestDesignAdapter();
			}
			@Override
			public Adapter caseVSVSTestInfo(VSVSTestInfo object) {
				return createVSVSTestInfoAdapter();
			}
			@Override
			public Adapter caseVSVSTestCases(VSVSTestCases object) {
				return createVSVSTestCasesAdapter();
			}
			@Override
			public Adapter caseVSVSTestCase(VSVSTestCase object) {
				return createVSVSTestCaseAdapter();
			}
			@Override
			public Adapter caseVSVSTestProcedures(VSVSTestProcedures object) {
				return createVSVSTestProceduresAdapter();
			}
			@Override
			public Adapter caseVSVSTestProcedure(VSVSTestProcedure object) {
				return createVSVSTestProcedureAdapter();
			}
			@Override
			public Adapter caseVSVSProcedureSteps(VSVSProcedureSteps object) {
				return createVSVSProcedureStepsAdapter();
			}
			@Override
			public Adapter caseVSVSProcedureStep(VSVSProcedureStep object) {
				return createVSVSProcedureStepAdapter();
			}
			@Override
			public Adapter caseVSVSStepConfigurations(VSVSStepConfigurations object) {
				return createVSVSStepConfigurationsAdapter();
			}
			@Override
			public Adapter caseVSVSStepConfiguration(VSVSStepConfiguration object) {
				return createVSVSStepConfigurationAdapter();
			}
			@Override
			public Adapter caseVSVSStepInputs(VSVSStepInputs object) {
				return createVSVSStepInputsAdapter();
			}
			@Override
			public Adapter caseVSVSStepAction(VSVSStepAction object) {
				return createVSVSStepActionAdapter();
			}
			@Override
			public Adapter caseVSVSStepTelecommandSequence(VSVSStepTelecommandSequence object) {
				return createVSVSStepTelecommandSequenceAdapter();
			}
			@Override
			public Adapter caseVSVSStepTelecommand(VSVSStepTelecommand object) {
				return createVSVSStepTelecommandAdapter();
			}
			@Override
			public Adapter caseVSVSStepTelecommandData(VSVSStepTelecommandData object) {
				return createVSVSStepTelecommandDataAdapter();
			}
			@Override
			public Adapter caseVSVSStepTelecommandDataField(VSVSStepTelecommandDataField object) {
				return createVSVSStepTelecommandDataFieldAdapter();
			}
			@Override
			public Adapter caseVSVSStepTelecommandHeader(VSVSStepTelecommandHeader object) {
				return createVSVSStepTelecommandHeaderAdapter();
			}
			@Override
			public Adapter caseVSVSStepTelecommandHeaderField(VSVSStepTelecommandHeaderField object) {
				return createVSVSStepTelecommandHeaderFieldAdapter();
			}
			@Override
			public Adapter caseVSVSStepOutputs(VSVSStepOutputs object) {
				return createVSVSStepOutputsAdapter();
			}
			@Override
			public Adapter caseVSVSStepTelemetrySet(VSVSStepTelemetrySet object) {
				return createVSVSStepTelemetrySetAdapter();
			}
			@Override
			public Adapter caseVSVSStepTelemetry(VSVSStepTelemetry object) {
				return createVSVSStepTelemetryAdapter();
			}
			@Override
			public Adapter caseVSVSStepTelemetryData(VSVSStepTelemetryData object) {
				return createVSVSStepTelemetryDataAdapter();
			}
			@Override
			public Adapter caseVSVSStepTelemetryDataField(VSVSStepTelemetryDataField object) {
				return createVSVSStepTelemetryDataFieldAdapter();
			}
			@Override
			public Adapter caseVSVSStepTelemetryHeader(VSVSStepTelemetryHeader object) {
				return createVSVSStepTelemetryHeaderAdapter();
			}
			@Override
			public Adapter caseVSVSStepTelemetryHeaderField(VSVSStepTelemetryHeaderField object) {
				return createVSVSStepTelemetryHeaderFieldAdapter();
			}
			@Override
			public Adapter caseVSVSAnalysisInspectionReview(VSVSAnalysisInspectionReview object) {
				return createVSVSAnalysisInspectionReviewAdapter();
			}
			@Override
			public Adapter caseVSVSTestPlatformRequirements(VSVSTestPlatformRequirements object) {
				return createVSVSTestPlatformRequirementsAdapter();
			}
			@Override
			public Adapter caseVSVSAdditionalInformation(VSVSAdditionalInformation object) {
				return createVSVSAdditionalInformationAdapter();
			}
			@Override
			public Adapter caseVValidationDocument(VValidationDocument object) {
				return createVValidationDocumentAdapter();
			}
			@Override
			public Adapter caseDDocumentTemplate(DDocumentTemplate object) {
				return createDDocumentTemplateAdapter();
			}
			@Override
			public Adapter caseDAbstractSection(DAbstractSection object) {
				return createDAbstractSectionAdapter();
			}
			@Override
			public Adapter caseMCommonReferenceableObj(MCommonReferenceableObj object) {
				return createMCommonReferenceableObjAdapter();
			}
			@Override
			public Adapter caseDInstantiableSection(DInstantiableSection object) {
				return createDInstantiableSectionAdapter();
			}
			@Override
			public Adapter caseDFixedSection(DFixedSection object) {
				return createDFixedSectionAdapter();
			}
			@Override
			public Adapter caseVValidationDocumentAbstractGroup(VValidationDocumentAbstractGroup object) {
				return createVValidationDocumentAbstractGroupAdapter();
			}
			@Override
			public Adapter caseVValidationDocumentFixedGroup(VValidationDocumentFixedGroup object) {
				return createVValidationDocumentFixedGroupAdapter();
			}
			@Override
			public Adapter caseVValidationDocumentAbstractItem(VValidationDocumentAbstractItem object) {
				return createVValidationDocumentAbstractItemAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.micobs.svm.svs.VSVSDocument <em>VSVS Document</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.uah.aut.srg.micobs.svm.svs.VSVSDocument
	 * @generated
	 */
	public Adapter createVSVSDocumentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.micobs.svm.svs.VSVSInstantiableSection <em>VSVS Instantiable Section</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.uah.aut.srg.micobs.svm.svs.VSVSInstantiableSection
	 * @generated
	 */
	public Adapter createVSVSInstantiableSectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.micobs.svm.svs.VSVSIntroduction <em>VSVS Introduction</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.uah.aut.srg.micobs.svm.svs.VSVSIntroduction
	 * @generated
	 */
	public Adapter createVSVSIntroductionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.micobs.svm.svs.VSVSApplicableDocuments <em>VSVS Applicable Documents</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.uah.aut.srg.micobs.svm.svs.VSVSApplicableDocuments
	 * @generated
	 */
	public Adapter createVSVSApplicableDocumentsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.micobs.svm.svs.VSVSReferenceDocuments <em>VSVS Reference Documents</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.uah.aut.srg.micobs.svm.svs.VSVSReferenceDocuments
	 * @generated
	 */
	public Adapter createVSVSReferenceDocumentsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.micobs.svm.svs.VSVSTermsDefinitionsAbbreviations <em>VSVS Terms Definitions Abbreviations</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.uah.aut.srg.micobs.svm.svs.VSVSTermsDefinitionsAbbreviations
	 * @generated
	 */
	public Adapter createVSVSTermsDefinitionsAbbreviationsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.micobs.svm.svs.VSVSAbstractBriefDescription <em>VSVS Abstract Brief Description</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.uah.aut.srg.micobs.svm.svs.VSVSAbstractBriefDescription
	 * @generated
	 */
	public Adapter createVSVSAbstractBriefDescriptionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.micobs.svm.svs.VSVSTerm <em>VSVS Term</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.uah.aut.srg.micobs.svm.svs.VSVSTerm
	 * @generated
	 */
	public Adapter createVSVSTermAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.micobs.svm.svs.VSVSDefinition <em>VSVS Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.uah.aut.srg.micobs.svm.svs.VSVSDefinition
	 * @generated
	 */
	public Adapter createVSVSDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.micobs.svm.svs.VSVSAbbreviation <em>VSVS Abbreviation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.uah.aut.srg.micobs.svm.svs.VSVSAbbreviation
	 * @generated
	 */
	public Adapter createVSVSAbbreviationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.micobs.svm.svs.VSVSFixedSection <em>VSVS Fixed Section</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.uah.aut.srg.micobs.svm.svs.VSVSFixedSection
	 * @generated
	 */
	public Adapter createVSVSFixedSectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.micobs.svm.svs.VSVSSoftwareOverview <em>VSVS Software Overview</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.uah.aut.srg.micobs.svm.svs.VSVSSoftwareOverview
	 * @generated
	 */
	public Adapter createVSVSSoftwareOverviewAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.micobs.svm.svs.VSVSTaskIdentification <em>VSVS Task Identification</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.uah.aut.srg.micobs.svm.svs.VSVSTaskIdentification
	 * @generated
	 */
	public Adapter createVSVSTaskIdentificationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.micobs.svm.svs.VSVSTestingSpecificationDesign <em>VSVS Testing Specification Design</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.uah.aut.srg.micobs.svm.svs.VSVSTestingSpecificationDesign
	 * @generated
	 */
	public Adapter createVSVSTestingSpecificationDesignAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.micobs.svm.svs.VSVSTestDesign <em>VSVS Test Design</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.uah.aut.srg.micobs.svm.svs.VSVSTestDesign
	 * @generated
	 */
	public Adapter createVSVSTestDesignAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.micobs.svm.svs.VSVSTestInfo <em>VSVS Test Info</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.uah.aut.srg.micobs.svm.svs.VSVSTestInfo
	 * @generated
	 */
	public Adapter createVSVSTestInfoAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.micobs.svm.svs.VSVSTestCases <em>VSVS Test Cases</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.uah.aut.srg.micobs.svm.svs.VSVSTestCases
	 * @generated
	 */
	public Adapter createVSVSTestCasesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.micobs.svm.svs.VSVSTestCase <em>VSVS Test Case</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.uah.aut.srg.micobs.svm.svs.VSVSTestCase
	 * @generated
	 */
	public Adapter createVSVSTestCaseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.micobs.svm.svs.VSVSTestProcedures <em>VSVS Test Procedures</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.uah.aut.srg.micobs.svm.svs.VSVSTestProcedures
	 * @generated
	 */
	public Adapter createVSVSTestProceduresAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.micobs.svm.svs.VSVSTestProcedure <em>VSVS Test Procedure</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.uah.aut.srg.micobs.svm.svs.VSVSTestProcedure
	 * @generated
	 */
	public Adapter createVSVSTestProcedureAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.micobs.svm.svs.VSVSProcedureSteps <em>VSVS Procedure Steps</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.uah.aut.srg.micobs.svm.svs.VSVSProcedureSteps
	 * @generated
	 */
	public Adapter createVSVSProcedureStepsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.micobs.svm.svs.VSVSProcedureStep <em>VSVS Procedure Step</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.uah.aut.srg.micobs.svm.svs.VSVSProcedureStep
	 * @generated
	 */
	public Adapter createVSVSProcedureStepAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.micobs.svm.svs.VSVSStepOutputs <em>VSVS Step Outputs</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.uah.aut.srg.micobs.svm.svs.VSVSStepOutputs
	 * @generated
	 */
	public Adapter createVSVSStepOutputsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.micobs.svm.svs.VSVSStepTelemetrySet <em>VSVS Step Telemetry Set</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.uah.aut.srg.micobs.svm.svs.VSVSStepTelemetrySet
	 * @generated
	 */
	public Adapter createVSVSStepTelemetrySetAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.micobs.svm.svs.VSVSStepTelemetry <em>VSVS Step Telemetry</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.uah.aut.srg.micobs.svm.svs.VSVSStepTelemetry
	 * @generated
	 */
	public Adapter createVSVSStepTelemetryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.micobs.svm.svs.VSVSStepTelemetryData <em>VSVS Step Telemetry Data</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.uah.aut.srg.micobs.svm.svs.VSVSStepTelemetryData
	 * @generated
	 */
	public Adapter createVSVSStepTelemetryDataAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.micobs.svm.svs.VSVSStepTelemetryDataField <em>VSVS Step Telemetry Data Field</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.uah.aut.srg.micobs.svm.svs.VSVSStepTelemetryDataField
	 * @generated
	 */
	public Adapter createVSVSStepTelemetryDataFieldAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.micobs.svm.svs.VSVSStepTelemetryHeader <em>VSVS Step Telemetry Header</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.uah.aut.srg.micobs.svm.svs.VSVSStepTelemetryHeader
	 * @generated
	 */
	public Adapter createVSVSStepTelemetryHeaderAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.micobs.svm.svs.VSVSStepTelemetryHeaderField <em>VSVS Step Telemetry Header Field</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.uah.aut.srg.micobs.svm.svs.VSVSStepTelemetryHeaderField
	 * @generated
	 */
	public Adapter createVSVSStepTelemetryHeaderFieldAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.micobs.svm.svs.VSVSStepConfigurations <em>VSVS Step Configurations</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.uah.aut.srg.micobs.svm.svs.VSVSStepConfigurations
	 * @generated
	 */
	public Adapter createVSVSStepConfigurationsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.micobs.svm.svs.VSVSStepConfiguration <em>VSVS Step Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.uah.aut.srg.micobs.svm.svs.VSVSStepConfiguration
	 * @generated
	 */
	public Adapter createVSVSStepConfigurationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.micobs.svm.svs.VSVSStepInputs <em>VSVS Step Inputs</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.uah.aut.srg.micobs.svm.svs.VSVSStepInputs
	 * @generated
	 */
	public Adapter createVSVSStepInputsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.micobs.svm.svs.VSVSStepAction <em>VSVS Step Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.uah.aut.srg.micobs.svm.svs.VSVSStepAction
	 * @generated
	 */
	public Adapter createVSVSStepActionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.micobs.svm.svs.VSVSStepTelecommandSequence <em>VSVS Step Telecommand Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.uah.aut.srg.micobs.svm.svs.VSVSStepTelecommandSequence
	 * @generated
	 */
	public Adapter createVSVSStepTelecommandSequenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.micobs.svm.svs.VSVSStepTelecommand <em>VSVS Step Telecommand</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.uah.aut.srg.micobs.svm.svs.VSVSStepTelecommand
	 * @generated
	 */
	public Adapter createVSVSStepTelecommandAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.micobs.svm.svs.VSVSStepTelecommandData <em>VSVS Step Telecommand Data</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.uah.aut.srg.micobs.svm.svs.VSVSStepTelecommandData
	 * @generated
	 */
	public Adapter createVSVSStepTelecommandDataAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.micobs.svm.svs.VSVSStepTelecommandDataField <em>VSVS Step Telecommand Data Field</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.uah.aut.srg.micobs.svm.svs.VSVSStepTelecommandDataField
	 * @generated
	 */
	public Adapter createVSVSStepTelecommandDataFieldAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.micobs.svm.svs.VSVSStepTelecommandHeader <em>VSVS Step Telecommand Header</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.uah.aut.srg.micobs.svm.svs.VSVSStepTelecommandHeader
	 * @generated
	 */
	public Adapter createVSVSStepTelecommandHeaderAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.micobs.svm.svs.VSVSStepTelecommandHeaderField <em>VSVS Step Telecommand Header Field</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.uah.aut.srg.micobs.svm.svs.VSVSStepTelecommandHeaderField
	 * @generated
	 */
	public Adapter createVSVSStepTelecommandHeaderFieldAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.micobs.svm.svs.VSVSAnalysisInspectionReview <em>VSVS Analysis Inspection Review</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.uah.aut.srg.micobs.svm.svs.VSVSAnalysisInspectionReview
	 * @generated
	 */
	public Adapter createVSVSAnalysisInspectionReviewAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.micobs.svm.svs.VSVSTestPlatformRequirements <em>VSVS Test Platform Requirements</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.uah.aut.srg.micobs.svm.svs.VSVSTestPlatformRequirements
	 * @generated
	 */
	public Adapter createVSVSTestPlatformRequirementsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.micobs.svm.svs.VSVSAdditionalInformation <em>VSVS Additional Information</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.uah.aut.srg.micobs.svm.svs.VSVSAdditionalInformation
	 * @generated
	 */
	public Adapter createVSVSAdditionalInformationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.micobs.svm.vdm.VValidationDocument <em>VValidation Document</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.uah.aut.srg.micobs.svm.vdm.VValidationDocument
	 * @generated
	 */
	public Adapter createVValidationDocumentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.micobs.doctpl.doctpl.DDocumentTemplate <em>DDocument Template</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.uah.aut.srg.micobs.doctpl.doctpl.DDocumentTemplate
	 * @generated
	 */
	public Adapter createDDocumentTemplateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.micobs.doctpl.doctpl.DAbstractSection <em>DAbstract Section</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.uah.aut.srg.micobs.doctpl.doctpl.DAbstractSection
	 * @generated
	 */
	public Adapter createDAbstractSectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.micobs.common.MCommonReferenceableObj <em>MCommon Referenceable Obj</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.uah.aut.srg.micobs.common.MCommonReferenceableObj
	 * @generated
	 */
	public Adapter createMCommonReferenceableObjAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.micobs.doctpl.doctpl.DInstantiableSection <em>DInstantiable Section</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.uah.aut.srg.micobs.doctpl.doctpl.DInstantiableSection
	 * @generated
	 */
	public Adapter createDInstantiableSectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.micobs.doctpl.doctpl.DFixedSection <em>DFixed Section</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.uah.aut.srg.micobs.doctpl.doctpl.DFixedSection
	 * @generated
	 */
	public Adapter createDFixedSectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.micobs.svm.vdm.VValidationDocumentAbstractGroup <em>VValidation Document Abstract Group</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.uah.aut.srg.micobs.svm.vdm.VValidationDocumentAbstractGroup
	 * @generated
	 */
	public Adapter createVValidationDocumentAbstractGroupAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.micobs.svm.vdm.VValidationDocumentFixedGroup <em>VValidation Document Fixed Group</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.uah.aut.srg.micobs.svm.vdm.VValidationDocumentFixedGroup
	 * @generated
	 */
	public Adapter createVValidationDocumentFixedGroupAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.micobs.svm.vdm.VValidationDocumentAbstractItem <em>VValidation Document Abstract Item</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.uah.aut.srg.micobs.svm.vdm.VValidationDocumentAbstractItem
	 * @generated
	 */
	public Adapter createVValidationDocumentAbstractItemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //svsAdapterFactory
