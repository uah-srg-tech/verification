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
			case svsPackage.VSVS_PROCEDURE_STEP: return createVSVSProcedureStep();
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
	public VSVSProcedureStep createVSVSProcedureStep() {
		VSVSProcedureStepImpl vsvsProcedureStep = new VSVSProcedureStepImpl();
		return vsvsProcedureStep;
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
