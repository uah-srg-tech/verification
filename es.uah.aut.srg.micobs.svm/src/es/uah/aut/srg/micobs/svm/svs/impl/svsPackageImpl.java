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

import es.uah.aut.srg.micobs.doctpl.doc.docPackage;

import es.uah.aut.srg.micobs.svm.svs.VSVSAbbreviation;
import es.uah.aut.srg.micobs.svm.svs.VSVSAbstractBriefDescription;
import es.uah.aut.srg.micobs.svm.svs.VSVSAdditionalInformation;
import es.uah.aut.srg.micobs.svm.svs.VSVSAnalysisInspectionReview;
import es.uah.aut.srg.micobs.svm.svs.VSVSApplicableDocuments;
import es.uah.aut.srg.micobs.svm.svs.VSVSDefinition;
import es.uah.aut.srg.micobs.svm.svs.VSVSDocument;
import es.uah.aut.srg.micobs.svm.svs.VSVSFixedSection;
import es.uah.aut.srg.micobs.svm.svs.VSVSInstantiableSection;
import es.uah.aut.srg.micobs.svm.svs.VSVSIntroduction;
import es.uah.aut.srg.micobs.svm.svs.VSVSProcedureStep;
import es.uah.aut.srg.micobs.svm.svs.VSVSReferenceDocuments;
import es.uah.aut.srg.micobs.svm.svs.VSVSSoftwareOverview;
import es.uah.aut.srg.micobs.svm.svs.VSVSTaskIdentification;
import es.uah.aut.srg.micobs.svm.svs.VSVSTerm;
import es.uah.aut.srg.micobs.svm.svs.VSVSTermsDefinitionsAbbreviations;
import es.uah.aut.srg.micobs.svm.svs.VSVSTestCase;
import es.uah.aut.srg.micobs.svm.svs.VSVSTestCases;
import es.uah.aut.srg.micobs.svm.svs.VSVSTestDesign;
import es.uah.aut.srg.micobs.svm.svs.VSVSTestPlatformRequirements;
import es.uah.aut.srg.micobs.svm.svs.VSVSTestProcedure;
import es.uah.aut.srg.micobs.svm.svs.VSVSTestProcedures;
import es.uah.aut.srg.micobs.svm.svs.VSVSTestingSpecificationDesign;
import es.uah.aut.srg.micobs.svm.svs.svsFactory;
import es.uah.aut.srg.micobs.svm.svs.svsPackage;

import es.uah.aut.srg.micobs.svm.vdm.vdmPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class svsPackageImpl extends EPackageImpl implements svsPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass vsvsDocumentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass vsvsInstantiableSectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass vsvsIntroductionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass vsvsApplicableDocumentsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass vsvsReferenceDocumentsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass vsvsTermsDefinitionsAbbreviationsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass vsvsAbstractBriefDescriptionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass vsvsTermEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass vsvsDefinitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass vsvsAbbreviationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass vsvsFixedSectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass vsvsSoftwareOverviewEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass vsvsTaskIdentificationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass vsvsTestingSpecificationDesignEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass vsvsTestDesignEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass vsvsTestCasesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass vsvsTestCaseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass vsvsTestProceduresEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass vsvsTestProcedureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass vsvsProcedureStepEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass vsvsAnalysisInspectionReviewEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass vsvsTestPlatformRequirementsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass vsvsAdditionalInformationEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see es.uah.aut.srg.micobs.svm.svs.svsPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private svsPackageImpl() {
		super(eNS_URI, svsFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link svsPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static svsPackage init() {
		if (isInited) return (svsPackage)EPackage.Registry.INSTANCE.getEPackage(svsPackage.eNS_URI);

		// Obtain or create and register package
		svsPackageImpl thesvsPackage = (svsPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof svsPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new svsPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		docPackage.eINSTANCE.eClass();
		vdmPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		thesvsPackage.createPackageContents();

		// Initialize created meta-data
		thesvsPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		thesvsPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(svsPackage.eNS_URI, thesvsPackage);
		return thesvsPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVSVSDocument() {
		return vsvsDocumentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVSVSDocument_IntroductionSection() {
		return (EReference)vsvsDocumentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVSVSDocument_ApplicableDocumentsSection() {
		return (EReference)vsvsDocumentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVSVSDocument_ReferenceDocumentsSection() {
		return (EReference)vsvsDocumentEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVSVSDocument_TermsDefinitionsAbbreviationsSection() {
		return (EReference)vsvsDocumentEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVSVSDocument_SoftwareOverviewSection() {
		return (EReference)vsvsDocumentEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVSVSDocument_TaskIdentificationSection() {
		return (EReference)vsvsDocumentEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVSVSDocument_TestingSpecificationDesignSection() {
		return (EReference)vsvsDocumentEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVSVSDocument_TestCasesSection() {
		return (EReference)vsvsDocumentEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVSVSDocument_TestProceduresSection() {
		return (EReference)vsvsDocumentEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVSVSDocument_AnalysisInspectionReviewSection() {
		return (EReference)vsvsDocumentEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVSVSDocument_TestPlatformRequirementsSection() {
		return (EReference)vsvsDocumentEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVSVSDocument_AdditionalInformationSection() {
		return (EReference)vsvsDocumentEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVSVSDocument_SvsFigures() {
		return (EReference)vsvsDocumentEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVSVSDocument_SvsTables() {
		return (EReference)vsvsDocumentEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVSVSInstantiableSection() {
		return vsvsInstantiableSectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVSVSInstantiableSection_Body() {
		return (EReference)vsvsInstantiableSectionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVSVSInstantiableSection_SvsInstatiableSubsections() {
		return (EReference)vsvsInstantiableSectionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVSVSIntroduction() {
		return vsvsIntroductionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVSVSIntroduction_SvsInstatiableSubsections() {
		return (EReference)vsvsIntroductionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVSVSApplicableDocuments() {
		return vsvsApplicableDocumentsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVSVSApplicableDocuments_ApplicableDocuments() {
		return (EReference)vsvsApplicableDocumentsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVSVSReferenceDocuments() {
		return vsvsReferenceDocumentsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVSVSReferenceDocuments_ReferenceDocuments() {
		return (EReference)vsvsReferenceDocumentsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVSVSTermsDefinitionsAbbreviations() {
		return vsvsTermsDefinitionsAbbreviationsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVSVSTermsDefinitionsAbbreviations_Terms() {
		return (EReference)vsvsTermsDefinitionsAbbreviationsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVSVSTermsDefinitionsAbbreviations_Definitions() {
		return (EReference)vsvsTermsDefinitionsAbbreviationsEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVSVSTermsDefinitionsAbbreviations_Abbreviations() {
		return (EReference)vsvsTermsDefinitionsAbbreviationsEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVSVSAbstractBriefDescription() {
		return vsvsAbstractBriefDescriptionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVSVSAbstractBriefDescription_Name() {
		return (EAttribute)vsvsAbstractBriefDescriptionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVSVSAbstractBriefDescription_Description() {
		return (EReference)vsvsAbstractBriefDescriptionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVSVSTerm() {
		return vsvsTermEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVSVSDefinition() {
		return vsvsDefinitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVSVSAbbreviation() {
		return vsvsAbbreviationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVSVSFixedSection() {
		return vsvsFixedSectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVSVSFixedSection_Body() {
		return (EReference)vsvsFixedSectionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVSVSFixedSection_SvsInstatiableSubsections() {
		return (EReference)vsvsFixedSectionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVSVSSoftwareOverview() {
		return vsvsSoftwareOverviewEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVSVSSoftwareOverview_SvsInstatiableSubsections() {
		return (EReference)vsvsSoftwareOverviewEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVSVSTaskIdentification() {
		return vsvsTaskIdentificationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVSVSTaskIdentification_TaskCriteria() {
		return (EReference)vsvsTaskIdentificationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVSVSTaskIdentification_FeaturesToBeTested() {
		return (EReference)vsvsTaskIdentificationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVSVSTaskIdentification_FeaturesNotToBeTested() {
		return (EReference)vsvsTaskIdentificationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVSVSTaskIdentification_TestPassFailCriteria() {
		return (EReference)vsvsTaskIdentificationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVSVSTaskIdentification_ItemsCanNotBeValidated() {
		return (EReference)vsvsTaskIdentificationEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVSVSTaskIdentification_ManuallyAutoGeneratedCode() {
		return (EReference)vsvsTaskIdentificationEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVSVSTestingSpecificationDesign() {
		return vsvsTestingSpecificationDesignEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVSVSTestingSpecificationDesign_General() {
		return (EReference)vsvsTestingSpecificationDesignEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVSVSTestingSpecificationDesign_TestDesigns() {
		return (EReference)vsvsTestingSpecificationDesignEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVSVSTestDesign() {
		return vsvsTestDesignEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVSVSTestDesign_General() {
		return (EReference)vsvsTestDesignEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVSVSTestDesign_FeaturesToBeTested() {
		return (EReference)vsvsTestDesignEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVSVSTestDesign_ApproachRefinements() {
		return (EReference)vsvsTestDesignEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVSVSTestCases() {
		return vsvsTestCasesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVSVSTestCases_General() {
		return (EReference)vsvsTestCasesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVSVSTestCases_TestCases() {
		return (EReference)vsvsTestCasesEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVSVSTestCase() {
		return vsvsTestCaseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVSVSTestCase_Identifier() {
		return (EReference)vsvsTestCaseEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVSVSTestCase_Inputs() {
		return (EReference)vsvsTestCaseEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVSVSTestCase_Outputs() {
		return (EReference)vsvsTestCaseEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVSVSTestCase_PassFailCriteria() {
		return (EReference)vsvsTestCaseEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVSVSTestCase_EnvironmentalNeeds() {
		return (EReference)vsvsTestCaseEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVSVSTestCase_SpecialConstraints() {
		return (EReference)vsvsTestCaseEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVSVSTestCase_InterfaceDependencies() {
		return (EReference)vsvsTestCaseEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVSVSTestProcedures() {
		return vsvsTestProceduresEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVSVSTestProcedures_General() {
		return (EReference)vsvsTestProceduresEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVSVSTestProcedures_TestProcedures() {
		return (EReference)vsvsTestProceduresEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVSVSTestProcedure() {
		return vsvsTestProcedureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVSVSTestProcedure_Identifier() {
		return (EReference)vsvsTestProcedureEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVSVSTestProcedure_Purpose() {
		return (EReference)vsvsTestProcedureEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVSVSTestProcedure_Steps() {
		return (EReference)vsvsTestProcedureEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVSVSTestProcedure_TestScript() {
		return (EReference)vsvsTestProcedureEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVSVSProcedureStep() {
		return vsvsProcedureStepEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVSVSAnalysisInspectionReview() {
		return vsvsAnalysisInspectionReviewEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVSVSTestPlatformRequirements() {
		return vsvsTestPlatformRequirementsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVSVSAdditionalInformation() {
		return vsvsAdditionalInformationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public svsFactory getsvsFactory() {
		return (svsFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		vsvsDocumentEClass = createEClass(VSVS_DOCUMENT);
		createEReference(vsvsDocumentEClass, VSVS_DOCUMENT__INTRODUCTION_SECTION);
		createEReference(vsvsDocumentEClass, VSVS_DOCUMENT__APPLICABLE_DOCUMENTS_SECTION);
		createEReference(vsvsDocumentEClass, VSVS_DOCUMENT__REFERENCE_DOCUMENTS_SECTION);
		createEReference(vsvsDocumentEClass, VSVS_DOCUMENT__TERMS_DEFINITIONS_ABBREVIATIONS_SECTION);
		createEReference(vsvsDocumentEClass, VSVS_DOCUMENT__SOFTWARE_OVERVIEW_SECTION);
		createEReference(vsvsDocumentEClass, VSVS_DOCUMENT__TASK_IDENTIFICATION_SECTION);
		createEReference(vsvsDocumentEClass, VSVS_DOCUMENT__TESTING_SPECIFICATION_DESIGN_SECTION);
		createEReference(vsvsDocumentEClass, VSVS_DOCUMENT__TEST_CASES_SECTION);
		createEReference(vsvsDocumentEClass, VSVS_DOCUMENT__TEST_PROCEDURES_SECTION);
		createEReference(vsvsDocumentEClass, VSVS_DOCUMENT__ANALYSIS_INSPECTION_REVIEW_SECTION);
		createEReference(vsvsDocumentEClass, VSVS_DOCUMENT__TEST_PLATFORM_REQUIREMENTS_SECTION);
		createEReference(vsvsDocumentEClass, VSVS_DOCUMENT__ADDITIONAL_INFORMATION_SECTION);
		createEReference(vsvsDocumentEClass, VSVS_DOCUMENT__SVS_FIGURES);
		createEReference(vsvsDocumentEClass, VSVS_DOCUMENT__SVS_TABLES);

		vsvsInstantiableSectionEClass = createEClass(VSVS_INSTANTIABLE_SECTION);
		createEReference(vsvsInstantiableSectionEClass, VSVS_INSTANTIABLE_SECTION__BODY);
		createEReference(vsvsInstantiableSectionEClass, VSVS_INSTANTIABLE_SECTION__SVS_INSTATIABLE_SUBSECTIONS);

		vsvsIntroductionEClass = createEClass(VSVS_INTRODUCTION);
		createEReference(vsvsIntroductionEClass, VSVS_INTRODUCTION__SVS_INSTATIABLE_SUBSECTIONS);

		vsvsApplicableDocumentsEClass = createEClass(VSVS_APPLICABLE_DOCUMENTS);
		createEReference(vsvsApplicableDocumentsEClass, VSVS_APPLICABLE_DOCUMENTS__APPLICABLE_DOCUMENTS);

		vsvsReferenceDocumentsEClass = createEClass(VSVS_REFERENCE_DOCUMENTS);
		createEReference(vsvsReferenceDocumentsEClass, VSVS_REFERENCE_DOCUMENTS__REFERENCE_DOCUMENTS);

		vsvsTermsDefinitionsAbbreviationsEClass = createEClass(VSVS_TERMS_DEFINITIONS_ABBREVIATIONS);
		createEReference(vsvsTermsDefinitionsAbbreviationsEClass, VSVS_TERMS_DEFINITIONS_ABBREVIATIONS__TERMS);
		createEReference(vsvsTermsDefinitionsAbbreviationsEClass, VSVS_TERMS_DEFINITIONS_ABBREVIATIONS__DEFINITIONS);
		createEReference(vsvsTermsDefinitionsAbbreviationsEClass, VSVS_TERMS_DEFINITIONS_ABBREVIATIONS__ABBREVIATIONS);

		vsvsAbstractBriefDescriptionEClass = createEClass(VSVS_ABSTRACT_BRIEF_DESCRIPTION);
		createEAttribute(vsvsAbstractBriefDescriptionEClass, VSVS_ABSTRACT_BRIEF_DESCRIPTION__NAME);
		createEReference(vsvsAbstractBriefDescriptionEClass, VSVS_ABSTRACT_BRIEF_DESCRIPTION__DESCRIPTION);

		vsvsTermEClass = createEClass(VSVS_TERM);

		vsvsDefinitionEClass = createEClass(VSVS_DEFINITION);

		vsvsAbbreviationEClass = createEClass(VSVS_ABBREVIATION);

		vsvsFixedSectionEClass = createEClass(VSVS_FIXED_SECTION);
		createEReference(vsvsFixedSectionEClass, VSVS_FIXED_SECTION__BODY);
		createEReference(vsvsFixedSectionEClass, VSVS_FIXED_SECTION__SVS_INSTATIABLE_SUBSECTIONS);

		vsvsSoftwareOverviewEClass = createEClass(VSVS_SOFTWARE_OVERVIEW);
		createEReference(vsvsSoftwareOverviewEClass, VSVS_SOFTWARE_OVERVIEW__SVS_INSTATIABLE_SUBSECTIONS);

		vsvsTaskIdentificationEClass = createEClass(VSVS_TASK_IDENTIFICATION);
		createEReference(vsvsTaskIdentificationEClass, VSVS_TASK_IDENTIFICATION__TASK_CRITERIA);
		createEReference(vsvsTaskIdentificationEClass, VSVS_TASK_IDENTIFICATION__FEATURES_TO_BE_TESTED);
		createEReference(vsvsTaskIdentificationEClass, VSVS_TASK_IDENTIFICATION__FEATURES_NOT_TO_BE_TESTED);
		createEReference(vsvsTaskIdentificationEClass, VSVS_TASK_IDENTIFICATION__TEST_PASS_FAIL_CRITERIA);
		createEReference(vsvsTaskIdentificationEClass, VSVS_TASK_IDENTIFICATION__ITEMS_CAN_NOT_BE_VALIDATED);
		createEReference(vsvsTaskIdentificationEClass, VSVS_TASK_IDENTIFICATION__MANUALLY_AUTO_GENERATED_CODE);

		vsvsTestingSpecificationDesignEClass = createEClass(VSVS_TESTING_SPECIFICATION_DESIGN);
		createEReference(vsvsTestingSpecificationDesignEClass, VSVS_TESTING_SPECIFICATION_DESIGN__GENERAL);
		createEReference(vsvsTestingSpecificationDesignEClass, VSVS_TESTING_SPECIFICATION_DESIGN__TEST_DESIGNS);

		vsvsTestDesignEClass = createEClass(VSVS_TEST_DESIGN);
		createEReference(vsvsTestDesignEClass, VSVS_TEST_DESIGN__GENERAL);
		createEReference(vsvsTestDesignEClass, VSVS_TEST_DESIGN__FEATURES_TO_BE_TESTED);
		createEReference(vsvsTestDesignEClass, VSVS_TEST_DESIGN__APPROACH_REFINEMENTS);

		vsvsTestCasesEClass = createEClass(VSVS_TEST_CASES);
		createEReference(vsvsTestCasesEClass, VSVS_TEST_CASES__GENERAL);
		createEReference(vsvsTestCasesEClass, VSVS_TEST_CASES__TEST_CASES);

		vsvsTestCaseEClass = createEClass(VSVS_TEST_CASE);
		createEReference(vsvsTestCaseEClass, VSVS_TEST_CASE__IDENTIFIER);
		createEReference(vsvsTestCaseEClass, VSVS_TEST_CASE__INPUTS);
		createEReference(vsvsTestCaseEClass, VSVS_TEST_CASE__OUTPUTS);
		createEReference(vsvsTestCaseEClass, VSVS_TEST_CASE__PASS_FAIL_CRITERIA);
		createEReference(vsvsTestCaseEClass, VSVS_TEST_CASE__ENVIRONMENTAL_NEEDS);
		createEReference(vsvsTestCaseEClass, VSVS_TEST_CASE__SPECIAL_CONSTRAINTS);
		createEReference(vsvsTestCaseEClass, VSVS_TEST_CASE__INTERFACE_DEPENDENCIES);

		vsvsTestProceduresEClass = createEClass(VSVS_TEST_PROCEDURES);
		createEReference(vsvsTestProceduresEClass, VSVS_TEST_PROCEDURES__GENERAL);
		createEReference(vsvsTestProceduresEClass, VSVS_TEST_PROCEDURES__TEST_PROCEDURES);

		vsvsTestProcedureEClass = createEClass(VSVS_TEST_PROCEDURE);
		createEReference(vsvsTestProcedureEClass, VSVS_TEST_PROCEDURE__IDENTIFIER);
		createEReference(vsvsTestProcedureEClass, VSVS_TEST_PROCEDURE__PURPOSE);
		createEReference(vsvsTestProcedureEClass, VSVS_TEST_PROCEDURE__STEPS);
		createEReference(vsvsTestProcedureEClass, VSVS_TEST_PROCEDURE__TEST_SCRIPT);

		vsvsProcedureStepEClass = createEClass(VSVS_PROCEDURE_STEP);

		vsvsAnalysisInspectionReviewEClass = createEClass(VSVS_ANALYSIS_INSPECTION_REVIEW);

		vsvsTestPlatformRequirementsEClass = createEClass(VSVS_TEST_PLATFORM_REQUIREMENTS);

		vsvsAdditionalInformationEClass = createEClass(VSVS_ADDITIONAL_INFORMATION);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		vdmPackage thevdmPackage = (vdmPackage)EPackage.Registry.INSTANCE.getEPackage(vdmPackage.eNS_URI);
		docPackage thedocPackage = (docPackage)EPackage.Registry.INSTANCE.getEPackage(docPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		vsvsDocumentEClass.getESuperTypes().add(thevdmPackage.getVValidationDocument());
		vsvsDocumentEClass.getESuperTypes().add(thedocPackage.getDDocumentTemplate());
		vsvsInstantiableSectionEClass.getESuperTypes().add(thedocPackage.getDInstantiableSection());
		vsvsIntroductionEClass.getESuperTypes().add(thedocPackage.getDFixedSection());
		vsvsApplicableDocumentsEClass.getESuperTypes().add(thedocPackage.getDFixedSection());
		vsvsReferenceDocumentsEClass.getESuperTypes().add(thedocPackage.getDFixedSection());
		vsvsTermsDefinitionsAbbreviationsEClass.getESuperTypes().add(thedocPackage.getDFixedSection());
		vsvsTermEClass.getESuperTypes().add(this.getVSVSAbstractBriefDescription());
		vsvsDefinitionEClass.getESuperTypes().add(this.getVSVSAbstractBriefDescription());
		vsvsAbbreviationEClass.getESuperTypes().add(this.getVSVSAbstractBriefDescription());
		vsvsFixedSectionEClass.getESuperTypes().add(thedocPackage.getDFixedSection());
		vsvsSoftwareOverviewEClass.getESuperTypes().add(thedocPackage.getDFixedSection());
		vsvsTaskIdentificationEClass.getESuperTypes().add(thedocPackage.getDFixedSection());
		vsvsTestingSpecificationDesignEClass.getESuperTypes().add(thedocPackage.getDFixedSection());
		vsvsTestDesignEClass.getESuperTypes().add(thedocPackage.getDFixedSection());
		vsvsTestCasesEClass.getESuperTypes().add(thevdmPackage.getVValidationDocumentFixedGroup());
		vsvsTestCasesEClass.getESuperTypes().add(thedocPackage.getDFixedSection());
		vsvsTestCaseEClass.getESuperTypes().add(thevdmPackage.getVValidationDocumentAbstractItem());
		vsvsTestCaseEClass.getESuperTypes().add(thedocPackage.getDFixedSection());
		vsvsTestProceduresEClass.getESuperTypes().add(thedocPackage.getDFixedSection());
		vsvsTestProcedureEClass.getESuperTypes().add(thedocPackage.getDFixedSection());
		vsvsAnalysisInspectionReviewEClass.getESuperTypes().add(this.getVSVSFixedSection());
		vsvsTestPlatformRequirementsEClass.getESuperTypes().add(this.getVSVSFixedSection());
		vsvsAdditionalInformationEClass.getESuperTypes().add(this.getVSVSFixedSection());

		// Initialize classes, features, and operations; add parameters
		initEClass(vsvsDocumentEClass, VSVSDocument.class, "VSVSDocument", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getVSVSDocument_IntroductionSection(), this.getVSVSIntroduction(), null, "introductionSection", null, 1, 1, VSVSDocument.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVSVSDocument_ApplicableDocumentsSection(), this.getVSVSApplicableDocuments(), null, "applicableDocumentsSection", null, 1, 1, VSVSDocument.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVSVSDocument_ReferenceDocumentsSection(), this.getVSVSReferenceDocuments(), null, "referenceDocumentsSection", null, 1, 1, VSVSDocument.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVSVSDocument_TermsDefinitionsAbbreviationsSection(), this.getVSVSTermsDefinitionsAbbreviations(), null, "termsDefinitionsAbbreviationsSection", null, 1, 1, VSVSDocument.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVSVSDocument_SoftwareOverviewSection(), this.getVSVSTaskIdentification(), null, "softwareOverviewSection", null, 1, 1, VSVSDocument.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVSVSDocument_TaskIdentificationSection(), this.getVSVSTaskIdentification(), null, "taskIdentificationSection", null, 1, 1, VSVSDocument.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVSVSDocument_TestingSpecificationDesignSection(), this.getVSVSTestingSpecificationDesign(), null, "testingSpecificationDesignSection", null, 1, 1, VSVSDocument.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVSVSDocument_TestCasesSection(), this.getVSVSTestCases(), null, "testCasesSection", null, 1, 1, VSVSDocument.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVSVSDocument_TestProceduresSection(), this.getVSVSTestProcedures(), null, "testProceduresSection", null, 1, 1, VSVSDocument.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVSVSDocument_AnalysisInspectionReviewSection(), this.getVSVSAnalysisInspectionReview(), null, "analysisInspectionReviewSection", null, 1, 1, VSVSDocument.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVSVSDocument_TestPlatformRequirementsSection(), this.getVSVSTestPlatformRequirements(), null, "testPlatformRequirementsSection", null, 1, 1, VSVSDocument.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVSVSDocument_AdditionalInformationSection(), this.getVSVSAdditionalInformation(), null, "additionalInformationSection", null, 1, 1, VSVSDocument.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVSVSDocument_SvsFigures(), thedocPackage.getDAbstractFigure(), null, "svsFigures", null, 0, -1, VSVSDocument.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVSVSDocument_SvsTables(), thedocPackage.getDAbstractTable(), null, "svsTables", null, 0, -1, VSVSDocument.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(vsvsInstantiableSectionEClass, VSVSInstantiableSection.class, "VSVSInstantiableSection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getVSVSInstantiableSection_Body(), thedocPackage.getDBody(), null, "body", null, 0, 1, VSVSInstantiableSection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVSVSInstantiableSection_SvsInstatiableSubsections(), this.getVSVSInstantiableSection(), null, "svsInstatiableSubsections", null, 0, -1, VSVSInstantiableSection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(vsvsIntroductionEClass, VSVSIntroduction.class, "VSVSIntroduction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getVSVSIntroduction_SvsInstatiableSubsections(), this.getVSVSInstantiableSection(), null, "svsInstatiableSubsections", null, 1, -1, VSVSIntroduction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(vsvsApplicableDocumentsEClass, VSVSApplicableDocuments.class, "VSVSApplicableDocuments", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getVSVSApplicableDocuments_ApplicableDocuments(), thedocPackage.getDApplicableDocument(), null, "applicableDocuments", null, 0, -1, VSVSApplicableDocuments.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(vsvsReferenceDocumentsEClass, VSVSReferenceDocuments.class, "VSVSReferenceDocuments", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getVSVSReferenceDocuments_ReferenceDocuments(), thedocPackage.getDReferenceDocument(), null, "referenceDocuments", null, 0, -1, VSVSReferenceDocuments.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(vsvsTermsDefinitionsAbbreviationsEClass, VSVSTermsDefinitionsAbbreviations.class, "VSVSTermsDefinitionsAbbreviations", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getVSVSTermsDefinitionsAbbreviations_Terms(), this.getVSVSTerm(), null, "terms", null, 0, -1, VSVSTermsDefinitionsAbbreviations.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVSVSTermsDefinitionsAbbreviations_Definitions(), this.getVSVSDefinition(), null, "definitions", null, 0, -1, VSVSTermsDefinitionsAbbreviations.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVSVSTermsDefinitionsAbbreviations_Abbreviations(), this.getVSVSAbbreviation(), null, "abbreviations", null, 0, -1, VSVSTermsDefinitionsAbbreviations.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(vsvsAbstractBriefDescriptionEClass, VSVSAbstractBriefDescription.class, "VSVSAbstractBriefDescription", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getVSVSAbstractBriefDescription_Name(), ecorePackage.getEString(), "name", null, 1, 1, VSVSAbstractBriefDescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVSVSAbstractBriefDescription_Description(), thedocPackage.getDRun(), null, "description", null, 1, 1, VSVSAbstractBriefDescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(vsvsTermEClass, VSVSTerm.class, "VSVSTerm", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(vsvsDefinitionEClass, VSVSDefinition.class, "VSVSDefinition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(vsvsAbbreviationEClass, VSVSAbbreviation.class, "VSVSAbbreviation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(vsvsFixedSectionEClass, VSVSFixedSection.class, "VSVSFixedSection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getVSVSFixedSection_Body(), thedocPackage.getDBody(), null, "body", null, 0, 1, VSVSFixedSection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVSVSFixedSection_SvsInstatiableSubsections(), this.getVSVSInstantiableSection(), null, "svsInstatiableSubsections", null, 0, -1, VSVSFixedSection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(vsvsSoftwareOverviewEClass, VSVSSoftwareOverview.class, "VSVSSoftwareOverview", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getVSVSSoftwareOverview_SvsInstatiableSubsections(), this.getVSVSInstantiableSection(), null, "svsInstatiableSubsections", null, 1, -1, VSVSSoftwareOverview.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(vsvsTaskIdentificationEClass, VSVSTaskIdentification.class, "VSVSTaskIdentification", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getVSVSTaskIdentification_TaskCriteria(), this.getVSVSFixedSection(), null, "taskCriteria", null, 1, 1, VSVSTaskIdentification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVSVSTaskIdentification_FeaturesToBeTested(), this.getVSVSFixedSection(), null, "featuresToBeTested", null, 1, 1, VSVSTaskIdentification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVSVSTaskIdentification_FeaturesNotToBeTested(), this.getVSVSFixedSection(), null, "featuresNotToBeTested", null, 1, 1, VSVSTaskIdentification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVSVSTaskIdentification_TestPassFailCriteria(), this.getVSVSFixedSection(), null, "testPassFailCriteria", null, 1, 1, VSVSTaskIdentification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVSVSTaskIdentification_ItemsCanNotBeValidated(), this.getVSVSFixedSection(), null, "itemsCanNotBeValidated", null, 1, 1, VSVSTaskIdentification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVSVSTaskIdentification_ManuallyAutoGeneratedCode(), this.getVSVSFixedSection(), null, "manuallyAutoGeneratedCode", null, 1, 1, VSVSTaskIdentification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(vsvsTestingSpecificationDesignEClass, VSVSTestingSpecificationDesign.class, "VSVSTestingSpecificationDesign", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getVSVSTestingSpecificationDesign_General(), this.getVSVSFixedSection(), null, "general", null, 1, 1, VSVSTestingSpecificationDesign.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVSVSTestingSpecificationDesign_TestDesigns(), this.getVSVSTestDesign(), null, "testDesigns", null, 0, -1, VSVSTestingSpecificationDesign.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(vsvsTestDesignEClass, VSVSTestDesign.class, "VSVSTestDesign", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getVSVSTestDesign_General(), this.getVSVSFixedSection(), null, "general", null, 1, 1, VSVSTestDesign.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVSVSTestDesign_FeaturesToBeTested(), this.getVSVSFixedSection(), null, "featuresToBeTested", null, 1, 1, VSVSTestDesign.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVSVSTestDesign_ApproachRefinements(), this.getVSVSFixedSection(), null, "approachRefinements", null, 1, 1, VSVSTestDesign.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(vsvsTestCasesEClass, VSVSTestCases.class, "VSVSTestCases", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getVSVSTestCases_General(), this.getVSVSFixedSection(), null, "general", null, 1, 1, VSVSTestCases.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVSVSTestCases_TestCases(), this.getVSVSTestCase(), null, "testCases", null, 0, -1, VSVSTestCases.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(vsvsTestCaseEClass, VSVSTestCase.class, "VSVSTestCase", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getVSVSTestCase_Identifier(), this.getVSVSFixedSection(), null, "identifier", null, 1, 1, VSVSTestCase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVSVSTestCase_Inputs(), this.getVSVSFixedSection(), null, "inputs", null, 1, 1, VSVSTestCase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVSVSTestCase_Outputs(), this.getVSVSFixedSection(), null, "outputs", null, 1, 1, VSVSTestCase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVSVSTestCase_PassFailCriteria(), this.getVSVSFixedSection(), null, "passFailCriteria", null, 1, 1, VSVSTestCase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVSVSTestCase_EnvironmentalNeeds(), this.getVSVSFixedSection(), null, "environmentalNeeds", null, 1, 1, VSVSTestCase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVSVSTestCase_SpecialConstraints(), this.getVSVSFixedSection(), null, "specialConstraints", null, 1, 1, VSVSTestCase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVSVSTestCase_InterfaceDependencies(), this.getVSVSFixedSection(), null, "interfaceDependencies", null, 1, 1, VSVSTestCase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(vsvsTestProceduresEClass, VSVSTestProcedures.class, "VSVSTestProcedures", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getVSVSTestProcedures_General(), this.getVSVSFixedSection(), null, "general", null, 1, 1, VSVSTestProcedures.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVSVSTestProcedures_TestProcedures(), this.getVSVSTestProcedure(), null, "testProcedures", null, 0, -1, VSVSTestProcedures.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(vsvsTestProcedureEClass, VSVSTestProcedure.class, "VSVSTestProcedure", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getVSVSTestProcedure_Identifier(), this.getVSVSFixedSection(), null, "identifier", null, 1, 1, VSVSTestProcedure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVSVSTestProcedure_Purpose(), this.getVSVSFixedSection(), null, "purpose", null, 1, 1, VSVSTestProcedure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVSVSTestProcedure_Steps(), this.getVSVSProcedureStep(), null, "steps", null, 1, -1, VSVSTestProcedure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVSVSTestProcedure_TestScript(), this.getVSVSFixedSection(), null, "testScript", null, 1, 1, VSVSTestProcedure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(vsvsProcedureStepEClass, VSVSProcedureStep.class, "VSVSProcedureStep", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(vsvsAnalysisInspectionReviewEClass, VSVSAnalysisInspectionReview.class, "VSVSAnalysisInspectionReview", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(vsvsTestPlatformRequirementsEClass, VSVSTestPlatformRequirements.class, "VSVSTestPlatformRequirements", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(vsvsAdditionalInformationEClass, VSVSAdditionalInformation.class, "VSVSAdditionalInformation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //svsPackageImpl
