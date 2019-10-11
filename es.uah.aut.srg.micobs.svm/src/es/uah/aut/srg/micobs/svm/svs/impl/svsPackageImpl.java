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
import es.uah.aut.srg.micobs.svm.svs.VSVSFixedTestSection;
import es.uah.aut.srg.micobs.svm.svs.VSVSInstantiableSection;
import es.uah.aut.srg.micobs.svm.svs.VSVSIntroduction;
import es.uah.aut.srg.micobs.svm.svs.VSVSProcedureStep;
import es.uah.aut.srg.micobs.svm.svs.VSVSProcedureSteps;
import es.uah.aut.srg.micobs.svm.svs.VSVSReferenceDocuments;
import es.uah.aut.srg.micobs.svm.svs.VSVSSoftwareOverview;
import es.uah.aut.srg.micobs.svm.svs.VSVSStepCheckmode;
import es.uah.aut.srg.micobs.svm.svs.VSVSStepConcurrentStep;
import es.uah.aut.srg.micobs.svm.svs.VSVSStepConcurrentSteps;
import es.uah.aut.srg.micobs.svm.svs.VSVSStepEnableDisable;
import es.uah.aut.srg.micobs.svm.svs.VSVSStepFilter;
import es.uah.aut.srg.micobs.svm.svs.VSVSStepInput;
import es.uah.aut.srg.micobs.svm.svs.VSVSStepInputLevel0;
import es.uah.aut.srg.micobs.svm.svs.VSVSStepInputLevel1;
import es.uah.aut.srg.micobs.svm.svs.VSVSStepInputLevel2;
import es.uah.aut.srg.micobs.svm.svs.VSVSStepInputLevel3;
import es.uah.aut.srg.micobs.svm.svs.VSVSStepInputs;
import es.uah.aut.srg.micobs.svm.svs.VSVSStepMode;
import es.uah.aut.srg.micobs.svm.svs.VSVSStepNextStep;
import es.uah.aut.srg.micobs.svm.svs.VSVSStepOutput;
import es.uah.aut.srg.micobs.svm.svs.VSVSStepOutputLevel0;
import es.uah.aut.srg.micobs.svm.svs.VSVSStepOutputLevel1;
import es.uah.aut.srg.micobs.svm.svs.VSVSStepOutputLevel2;
import es.uah.aut.srg.micobs.svm.svs.VSVSStepOutputLevel3;
import es.uah.aut.srg.micobs.svm.svs.VSVSStepOutputs;
import es.uah.aut.srg.micobs.svm.svs.VSVSStepSpecialPackets;
import es.uah.aut.srg.micobs.svm.svs.VSVSStepUnit;
import es.uah.aut.srg.micobs.svm.svs.VSVSStepYesNo;
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

import es.uah.aut.srg.tmtcif.export.exportPackage;

import es.uah.aut.srg.tmtcif.filter.filterPackage;

import es.uah.aut.srg.tmtcif.format.formatPackage;

import es.uah.aut.srg.tmtcif.import_.importPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
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
	private EClass vsvsFixedTestSectionEClass = null;

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
	private EClass vsvsProcedureStepsEClass = null;

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
	private EClass vsvsStepInputsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass vsvsStepOutputsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass vsvsStepSpecialPacketsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass vsvsStepEnableDisableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass vsvsStepConcurrentStepsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass vsvsStepNextStepEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass vsvsStepConcurrentStepEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass vsvsStepInputEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass vsvsStepInputLevel3EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass vsvsStepInputLevel2EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass vsvsStepInputLevel1EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass vsvsStepInputLevel0EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass vsvsStepOutputEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass vsvsStepOutputLevel3EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass vsvsStepOutputLevel2EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass vsvsStepOutputLevel1EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass vsvsStepOutputLevel0EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass vsvsStepFilterEClass = null;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum vsvsStepModeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum vsvsStepUnitEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum vsvsStepCheckmodeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum vsvsStepYesNoEEnum = null;

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
		exportPackage.eINSTANCE.eClass();
		filterPackage.eINSTANCE.eClass();
		importPackage.eINSTANCE.eClass();
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
	public EAttribute getVSVSTestDesign_Name() {
		return (EAttribute)vsvsTestDesignEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVSVSTestDesign_General() {
		return (EReference)vsvsTestDesignEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVSVSTestDesign_FeaturesToBeTested() {
		return (EReference)vsvsTestDesignEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVSVSTestDesign_ApproachRefinements() {
		return (EReference)vsvsTestDesignEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVSVSFixedTestSection() {
		return vsvsFixedTestSectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVSVSFixedTestSection_Body() {
		return (EReference)vsvsFixedTestSectionEClass.getEStructuralFeatures().get(0);
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
	public EAttribute getVSVSTestProcedure_Name() {
		return (EAttribute)vsvsTestProcedureEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVSVSTestProcedure_Identifier() {
		return (EReference)vsvsTestProcedureEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVSVSTestProcedure_Purpose() {
		return (EReference)vsvsTestProcedureEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVSVSTestProcedure_ProcedureSteps() {
		return (EReference)vsvsTestProcedureEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVSVSTestProcedure_TestScript() {
		return (EReference)vsvsTestProcedureEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVSVSTestProcedure_TestCase() {
		return (EReference)vsvsTestProcedureEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVSVSProcedureSteps() {
		return vsvsProcedureStepsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVSVSProcedureSteps_Step() {
		return (EReference)vsvsProcedureStepsEClass.getEStructuralFeatures().get(0);
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
	public EAttribute getVSVSProcedureStep_Name() {
		return (EAttribute)vsvsProcedureStepEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVSVSProcedureStep_Description() {
		return (EAttribute)vsvsProcedureStepEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVSVSProcedureStep_Id() {
		return (EAttribute)vsvsProcedureStepEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVSVSProcedureStep_Mode() {
		return (EAttribute)vsvsProcedureStepEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVSVSProcedureStep_Replays() {
		return (EAttribute)vsvsProcedureStepEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVSVSProcedureStep_Prev_step_idref() {
		return (EReference)vsvsProcedureStepEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVSVSProcedureStep_Output_idref_from_prev_step() {
		return (EReference)vsvsProcedureStepEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVSVSProcedureStep_Inputs() {
		return (EReference)vsvsProcedureStepEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVSVSProcedureStep_Outputs() {
		return (EReference)vsvsProcedureStepEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVSVSProcedureStep_SpecialPackets() {
		return (EReference)vsvsProcedureStepEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVSVSProcedureStep_Concurrent_steps() {
		return (EReference)vsvsProcedureStepEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVSVSStepInputs() {
		return vsvsStepInputsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVSVSStepInputs_Input_level_3() {
		return (EReference)vsvsStepInputsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVSVSStepInputs_Input_level_2() {
		return (EReference)vsvsStepInputsEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVSVSStepInputs_Input_level_1() {
		return (EReference)vsvsStepInputsEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVSVSStepInputs_Input_level_0() {
		return (EReference)vsvsStepInputsEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVSVSStepOutputs() {
		return vsvsStepOutputsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVSVSStepOutputs_Checkmode() {
		return (EAttribute)vsvsStepOutputsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVSVSStepOutputs_Valid_time_interval_value() {
		return (EAttribute)vsvsStepOutputsEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVSVSStepOutputs_Valid_time_interval_unit() {
		return (EAttribute)vsvsStepOutputsEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVSVSStepOutputs_Output_level_3() {
		return (EReference)vsvsStepOutputsEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVSVSStepOutputs_Output_level_2() {
		return (EReference)vsvsStepOutputsEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVSVSStepOutputs_Output_level_1() {
		return (EReference)vsvsStepOutputsEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVSVSStepOutputs_Output_level_0() {
		return (EReference)vsvsStepOutputsEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVSVSStepSpecialPackets() {
		return vsvsStepSpecialPacketsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVSVSStepSpecialPackets_Enable() {
		return (EReference)vsvsStepSpecialPacketsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVSVSStepSpecialPackets_Disable() {
		return (EReference)vsvsStepSpecialPacketsEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVSVSStepSpecialPackets_Enable_print() {
		return (EReference)vsvsStepSpecialPacketsEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVSVSStepSpecialPackets_Disable_print() {
		return (EReference)vsvsStepSpecialPacketsEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVSVSStepEnableDisable() {
		return vsvsStepEnableDisableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVSVSStepEnableDisable_Id() {
		return (EAttribute)vsvsStepEnableDisableEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVSVSStepConcurrentSteps() {
		return vsvsStepConcurrentStepsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVSVSStepConcurrentSteps_NextStep() {
		return (EReference)vsvsStepConcurrentStepsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVSVSStepConcurrentSteps_Concurrent_step() {
		return (EReference)vsvsStepConcurrentStepsEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVSVSStepNextStep() {
		return vsvsStepNextStepEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVSVSStepNextStep_Id() {
		return (EAttribute)vsvsStepNextStepEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVSVSStepNextStep_IsConcurrent() {
		return (EAttribute)vsvsStepNextStepEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVSVSStepConcurrentStep() {
		return vsvsStepConcurrentStepEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVSVSStepConcurrentStep_Id() {
		return (EAttribute)vsvsStepConcurrentStepEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVSVSStepInput() {
		return vsvsStepInputEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVSVSStepInput_Name() {
		return (EAttribute)vsvsStepInputEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVSVSStepInput_IfRef() {
		return (EAttribute)vsvsStepInputEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVSVSStepInput_Delay_value() {
		return (EAttribute)vsvsStepInputEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVSVSStepInput_Delay_unit() {
		return (EAttribute)vsvsStepInputEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVSVSStepInputLevel3() {
		return vsvsStepInputLevel3EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVSVSStepInputLevel3_Level3() {
		return (EReference)vsvsStepInputLevel3EClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVSVSStepInputLevel3_App_to_level3() {
		return (EReference)vsvsStepInputLevel3EClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVSVSStepInputLevel3_Level2() {
		return (EReference)vsvsStepInputLevel3EClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVSVSStepInputLevel3_Level3_to_level2() {
		return (EReference)vsvsStepInputLevel3EClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVSVSStepInputLevel3_Level1() {
		return (EReference)vsvsStepInputLevel3EClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVSVSStepInputLevel3_Level2_to_level1() {
		return (EReference)vsvsStepInputLevel3EClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVSVSStepInputLevel3_Level0() {
		return (EReference)vsvsStepInputLevel3EClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVSVSStepInputLevel3_Level1_to_level0() {
		return (EReference)vsvsStepInputLevel3EClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVSVSStepInputLevel2() {
		return vsvsStepInputLevel2EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVSVSStepInputLevel2_Level2() {
		return (EReference)vsvsStepInputLevel2EClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVSVSStepInputLevel2_App_to_level2() {
		return (EReference)vsvsStepInputLevel2EClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVSVSStepInputLevel2_Level1() {
		return (EReference)vsvsStepInputLevel2EClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVSVSStepInputLevel2_Level2_to_level1() {
		return (EReference)vsvsStepInputLevel2EClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVSVSStepInputLevel2_Level0() {
		return (EReference)vsvsStepInputLevel2EClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVSVSStepInputLevel2_Level1_to_level0() {
		return (EReference)vsvsStepInputLevel2EClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVSVSStepInputLevel1() {
		return vsvsStepInputLevel1EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVSVSStepInputLevel1_Level1() {
		return (EReference)vsvsStepInputLevel1EClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVSVSStepInputLevel1_App_to_level1() {
		return (EReference)vsvsStepInputLevel1EClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVSVSStepInputLevel1_Level0() {
		return (EReference)vsvsStepInputLevel1EClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVSVSStepInputLevel1_Level1_to_level0() {
		return (EReference)vsvsStepInputLevel1EClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVSVSStepInputLevel0() {
		return vsvsStepInputLevel0EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVSVSStepInputLevel0_Level0() {
		return (EReference)vsvsStepInputLevel0EClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVSVSStepInputLevel0_App_to_level0() {
		return (EReference)vsvsStepInputLevel0EClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVSVSStepOutput() {
		return vsvsStepOutputEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVSVSStepOutput_Name() {
		return (EAttribute)vsvsStepOutputEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVSVSStepOutput_Id() {
		return (EAttribute)vsvsStepOutputEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVSVSStepOutput_IfRef() {
		return (EAttribute)vsvsStepOutputEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVSVSStepOutput_Optional() {
		return (EAttribute)vsvsStepOutputEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVSVSStepOutputLevel3() {
		return vsvsStepOutputLevel3EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVSVSStepOutputLevel3_Level3() {
		return (EReference)vsvsStepOutputLevel3EClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVSVSStepOutputLevel3_Level3_filter() {
		return (EReference)vsvsStepOutputLevel3EClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVSVSStepOutputLevel3_Level2() {
		return (EReference)vsvsStepOutputLevel3EClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVSVSStepOutputLevel3_Level3_from_level2() {
		return (EReference)vsvsStepOutputLevel3EClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVSVSStepOutputLevel3_Level2_filter() {
		return (EReference)vsvsStepOutputLevel3EClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVSVSStepOutputLevel3_Level1() {
		return (EReference)vsvsStepOutputLevel3EClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVSVSStepOutputLevel3_Level2_from_level1() {
		return (EReference)vsvsStepOutputLevel3EClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVSVSStepOutputLevel3_Level1_filter() {
		return (EReference)vsvsStepOutputLevel3EClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVSVSStepOutputLevel3_Level0() {
		return (EReference)vsvsStepOutputLevel3EClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVSVSStepOutputLevel3_Level1_from_level0() {
		return (EReference)vsvsStepOutputLevel3EClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVSVSStepOutputLevel3_Level0_filter() {
		return (EReference)vsvsStepOutputLevel3EClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVSVSStepOutputLevel2() {
		return vsvsStepOutputLevel2EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVSVSStepOutputLevel2_Level2() {
		return (EReference)vsvsStepOutputLevel2EClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVSVSStepOutputLevel2_Level2_filter() {
		return (EReference)vsvsStepOutputLevel2EClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVSVSStepOutputLevel2_Level1() {
		return (EReference)vsvsStepOutputLevel2EClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVSVSStepOutputLevel2_Level2_from_level1() {
		return (EReference)vsvsStepOutputLevel2EClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVSVSStepOutputLevel2_Level1_filter() {
		return (EReference)vsvsStepOutputLevel2EClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVSVSStepOutputLevel2_Level0() {
		return (EReference)vsvsStepOutputLevel2EClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVSVSStepOutputLevel2_Level1_from_level0() {
		return (EReference)vsvsStepOutputLevel2EClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVSVSStepOutputLevel2_Level0_filter() {
		return (EReference)vsvsStepOutputLevel2EClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVSVSStepOutputLevel1() {
		return vsvsStepOutputLevel1EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVSVSStepOutputLevel1_Level1() {
		return (EReference)vsvsStepOutputLevel1EClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVSVSStepOutputLevel1_Level1_filter() {
		return (EReference)vsvsStepOutputLevel1EClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVSVSStepOutputLevel1_Level0() {
		return (EReference)vsvsStepOutputLevel1EClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVSVSStepOutputLevel1_Level1_from_level0() {
		return (EReference)vsvsStepOutputLevel1EClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVSVSStepOutputLevel1_Level0_filter() {
		return (EReference)vsvsStepOutputLevel1EClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVSVSStepOutputLevel0() {
		return vsvsStepOutputLevel0EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVSVSStepOutputLevel0_Level0() {
		return (EReference)vsvsStepOutputLevel0EClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVSVSStepOutputLevel0_Level0_filter() {
		return (EReference)vsvsStepOutputLevel0EClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVSVSStepFilter() {
		return vsvsStepFilterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVSVSStepFilter_Apply_def_filter() {
		return (EAttribute)vsvsStepFilterEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVSVSStepFilter_Extra_filter() {
		return (EReference)vsvsStepFilterEClass.getEStructuralFeatures().get(1);
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
	public EEnum getVSVSStepMode() {
		return vsvsStepModeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getVSVSStepUnit() {
		return vsvsStepUnitEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getVSVSStepCheckmode() {
		return vsvsStepCheckmodeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getVSVSStepYesNo() {
		return vsvsStepYesNoEEnum;
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
		createEAttribute(vsvsTestDesignEClass, VSVS_TEST_DESIGN__NAME);
		createEReference(vsvsTestDesignEClass, VSVS_TEST_DESIGN__GENERAL);
		createEReference(vsvsTestDesignEClass, VSVS_TEST_DESIGN__FEATURES_TO_BE_TESTED);
		createEReference(vsvsTestDesignEClass, VSVS_TEST_DESIGN__APPROACH_REFINEMENTS);

		vsvsFixedTestSectionEClass = createEClass(VSVS_FIXED_TEST_SECTION);
		createEReference(vsvsFixedTestSectionEClass, VSVS_FIXED_TEST_SECTION__BODY);

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
		createEAttribute(vsvsTestProcedureEClass, VSVS_TEST_PROCEDURE__NAME);
		createEReference(vsvsTestProcedureEClass, VSVS_TEST_PROCEDURE__IDENTIFIER);
		createEReference(vsvsTestProcedureEClass, VSVS_TEST_PROCEDURE__PURPOSE);
		createEReference(vsvsTestProcedureEClass, VSVS_TEST_PROCEDURE__PROCEDURE_STEPS);
		createEReference(vsvsTestProcedureEClass, VSVS_TEST_PROCEDURE__TEST_SCRIPT);
		createEReference(vsvsTestProcedureEClass, VSVS_TEST_PROCEDURE__TEST_CASE);

		vsvsProcedureStepsEClass = createEClass(VSVS_PROCEDURE_STEPS);
		createEReference(vsvsProcedureStepsEClass, VSVS_PROCEDURE_STEPS__STEP);

		vsvsProcedureStepEClass = createEClass(VSVS_PROCEDURE_STEP);
		createEAttribute(vsvsProcedureStepEClass, VSVS_PROCEDURE_STEP__NAME);
		createEAttribute(vsvsProcedureStepEClass, VSVS_PROCEDURE_STEP__DESCRIPTION);
		createEAttribute(vsvsProcedureStepEClass, VSVS_PROCEDURE_STEP__ID);
		createEAttribute(vsvsProcedureStepEClass, VSVS_PROCEDURE_STEP__MODE);
		createEAttribute(vsvsProcedureStepEClass, VSVS_PROCEDURE_STEP__REPLAYS);
		createEReference(vsvsProcedureStepEClass, VSVS_PROCEDURE_STEP__PREV_STEP_IDREF);
		createEReference(vsvsProcedureStepEClass, VSVS_PROCEDURE_STEP__OUTPUT_IDREF_FROM_PREV_STEP);
		createEReference(vsvsProcedureStepEClass, VSVS_PROCEDURE_STEP__INPUTS);
		createEReference(vsvsProcedureStepEClass, VSVS_PROCEDURE_STEP__OUTPUTS);
		createEReference(vsvsProcedureStepEClass, VSVS_PROCEDURE_STEP__SPECIAL_PACKETS);
		createEReference(vsvsProcedureStepEClass, VSVS_PROCEDURE_STEP__CONCURRENT_STEPS);

		vsvsStepInputsEClass = createEClass(VSVS_STEP_INPUTS);
		createEReference(vsvsStepInputsEClass, VSVS_STEP_INPUTS__INPUT_LEVEL_3);
		createEReference(vsvsStepInputsEClass, VSVS_STEP_INPUTS__INPUT_LEVEL_2);
		createEReference(vsvsStepInputsEClass, VSVS_STEP_INPUTS__INPUT_LEVEL_1);
		createEReference(vsvsStepInputsEClass, VSVS_STEP_INPUTS__INPUT_LEVEL_0);

		vsvsStepOutputsEClass = createEClass(VSVS_STEP_OUTPUTS);
		createEAttribute(vsvsStepOutputsEClass, VSVS_STEP_OUTPUTS__CHECKMODE);
		createEAttribute(vsvsStepOutputsEClass, VSVS_STEP_OUTPUTS__VALID_TIME_INTERVAL_VALUE);
		createEAttribute(vsvsStepOutputsEClass, VSVS_STEP_OUTPUTS__VALID_TIME_INTERVAL_UNIT);
		createEReference(vsvsStepOutputsEClass, VSVS_STEP_OUTPUTS__OUTPUT_LEVEL_3);
		createEReference(vsvsStepOutputsEClass, VSVS_STEP_OUTPUTS__OUTPUT_LEVEL_2);
		createEReference(vsvsStepOutputsEClass, VSVS_STEP_OUTPUTS__OUTPUT_LEVEL_1);
		createEReference(vsvsStepOutputsEClass, VSVS_STEP_OUTPUTS__OUTPUT_LEVEL_0);

		vsvsStepSpecialPacketsEClass = createEClass(VSVS_STEP_SPECIAL_PACKETS);
		createEReference(vsvsStepSpecialPacketsEClass, VSVS_STEP_SPECIAL_PACKETS__ENABLE);
		createEReference(vsvsStepSpecialPacketsEClass, VSVS_STEP_SPECIAL_PACKETS__DISABLE);
		createEReference(vsvsStepSpecialPacketsEClass, VSVS_STEP_SPECIAL_PACKETS__ENABLE_PRINT);
		createEReference(vsvsStepSpecialPacketsEClass, VSVS_STEP_SPECIAL_PACKETS__DISABLE_PRINT);

		vsvsStepEnableDisableEClass = createEClass(VSVS_STEP_ENABLE_DISABLE);
		createEAttribute(vsvsStepEnableDisableEClass, VSVS_STEP_ENABLE_DISABLE__ID);

		vsvsStepConcurrentStepsEClass = createEClass(VSVS_STEP_CONCURRENT_STEPS);
		createEReference(vsvsStepConcurrentStepsEClass, VSVS_STEP_CONCURRENT_STEPS__NEXT_STEP);
		createEReference(vsvsStepConcurrentStepsEClass, VSVS_STEP_CONCURRENT_STEPS__CONCURRENT_STEP);

		vsvsStepNextStepEClass = createEClass(VSVS_STEP_NEXT_STEP);
		createEAttribute(vsvsStepNextStepEClass, VSVS_STEP_NEXT_STEP__ID);
		createEAttribute(vsvsStepNextStepEClass, VSVS_STEP_NEXT_STEP__IS_CONCURRENT);

		vsvsStepConcurrentStepEClass = createEClass(VSVS_STEP_CONCURRENT_STEP);
		createEAttribute(vsvsStepConcurrentStepEClass, VSVS_STEP_CONCURRENT_STEP__ID);

		vsvsStepInputEClass = createEClass(VSVS_STEP_INPUT);
		createEAttribute(vsvsStepInputEClass, VSVS_STEP_INPUT__NAME);
		createEAttribute(vsvsStepInputEClass, VSVS_STEP_INPUT__IF_REF);
		createEAttribute(vsvsStepInputEClass, VSVS_STEP_INPUT__DELAY_VALUE);
		createEAttribute(vsvsStepInputEClass, VSVS_STEP_INPUT__DELAY_UNIT);

		vsvsStepInputLevel3EClass = createEClass(VSVS_STEP_INPUT_LEVEL3);
		createEReference(vsvsStepInputLevel3EClass, VSVS_STEP_INPUT_LEVEL3__LEVEL3);
		createEReference(vsvsStepInputLevel3EClass, VSVS_STEP_INPUT_LEVEL3__APP_TO_LEVEL3);
		createEReference(vsvsStepInputLevel3EClass, VSVS_STEP_INPUT_LEVEL3__LEVEL2);
		createEReference(vsvsStepInputLevel3EClass, VSVS_STEP_INPUT_LEVEL3__LEVEL3_TO_LEVEL2);
		createEReference(vsvsStepInputLevel3EClass, VSVS_STEP_INPUT_LEVEL3__LEVEL1);
		createEReference(vsvsStepInputLevel3EClass, VSVS_STEP_INPUT_LEVEL3__LEVEL2_TO_LEVEL1);
		createEReference(vsvsStepInputLevel3EClass, VSVS_STEP_INPUT_LEVEL3__LEVEL0);
		createEReference(vsvsStepInputLevel3EClass, VSVS_STEP_INPUT_LEVEL3__LEVEL1_TO_LEVEL0);

		vsvsStepInputLevel2EClass = createEClass(VSVS_STEP_INPUT_LEVEL2);
		createEReference(vsvsStepInputLevel2EClass, VSVS_STEP_INPUT_LEVEL2__LEVEL2);
		createEReference(vsvsStepInputLevel2EClass, VSVS_STEP_INPUT_LEVEL2__APP_TO_LEVEL2);
		createEReference(vsvsStepInputLevel2EClass, VSVS_STEP_INPUT_LEVEL2__LEVEL1);
		createEReference(vsvsStepInputLevel2EClass, VSVS_STEP_INPUT_LEVEL2__LEVEL2_TO_LEVEL1);
		createEReference(vsvsStepInputLevel2EClass, VSVS_STEP_INPUT_LEVEL2__LEVEL0);
		createEReference(vsvsStepInputLevel2EClass, VSVS_STEP_INPUT_LEVEL2__LEVEL1_TO_LEVEL0);

		vsvsStepInputLevel1EClass = createEClass(VSVS_STEP_INPUT_LEVEL1);
		createEReference(vsvsStepInputLevel1EClass, VSVS_STEP_INPUT_LEVEL1__LEVEL1);
		createEReference(vsvsStepInputLevel1EClass, VSVS_STEP_INPUT_LEVEL1__APP_TO_LEVEL1);
		createEReference(vsvsStepInputLevel1EClass, VSVS_STEP_INPUT_LEVEL1__LEVEL0);
		createEReference(vsvsStepInputLevel1EClass, VSVS_STEP_INPUT_LEVEL1__LEVEL1_TO_LEVEL0);

		vsvsStepInputLevel0EClass = createEClass(VSVS_STEP_INPUT_LEVEL0);
		createEReference(vsvsStepInputLevel0EClass, VSVS_STEP_INPUT_LEVEL0__LEVEL0);
		createEReference(vsvsStepInputLevel0EClass, VSVS_STEP_INPUT_LEVEL0__APP_TO_LEVEL0);

		vsvsStepOutputEClass = createEClass(VSVS_STEP_OUTPUT);
		createEAttribute(vsvsStepOutputEClass, VSVS_STEP_OUTPUT__NAME);
		createEAttribute(vsvsStepOutputEClass, VSVS_STEP_OUTPUT__ID);
		createEAttribute(vsvsStepOutputEClass, VSVS_STEP_OUTPUT__IF_REF);
		createEAttribute(vsvsStepOutputEClass, VSVS_STEP_OUTPUT__OPTIONAL);

		vsvsStepOutputLevel3EClass = createEClass(VSVS_STEP_OUTPUT_LEVEL3);
		createEReference(vsvsStepOutputLevel3EClass, VSVS_STEP_OUTPUT_LEVEL3__LEVEL3);
		createEReference(vsvsStepOutputLevel3EClass, VSVS_STEP_OUTPUT_LEVEL3__LEVEL3_FILTER);
		createEReference(vsvsStepOutputLevel3EClass, VSVS_STEP_OUTPUT_LEVEL3__LEVEL2);
		createEReference(vsvsStepOutputLevel3EClass, VSVS_STEP_OUTPUT_LEVEL3__LEVEL3_FROM_LEVEL2);
		createEReference(vsvsStepOutputLevel3EClass, VSVS_STEP_OUTPUT_LEVEL3__LEVEL2_FILTER);
		createEReference(vsvsStepOutputLevel3EClass, VSVS_STEP_OUTPUT_LEVEL3__LEVEL1);
		createEReference(vsvsStepOutputLevel3EClass, VSVS_STEP_OUTPUT_LEVEL3__LEVEL2_FROM_LEVEL1);
		createEReference(vsvsStepOutputLevel3EClass, VSVS_STEP_OUTPUT_LEVEL3__LEVEL1_FILTER);
		createEReference(vsvsStepOutputLevel3EClass, VSVS_STEP_OUTPUT_LEVEL3__LEVEL0);
		createEReference(vsvsStepOutputLevel3EClass, VSVS_STEP_OUTPUT_LEVEL3__LEVEL1_FROM_LEVEL0);
		createEReference(vsvsStepOutputLevel3EClass, VSVS_STEP_OUTPUT_LEVEL3__LEVEL0_FILTER);

		vsvsStepOutputLevel2EClass = createEClass(VSVS_STEP_OUTPUT_LEVEL2);
		createEReference(vsvsStepOutputLevel2EClass, VSVS_STEP_OUTPUT_LEVEL2__LEVEL2);
		createEReference(vsvsStepOutputLevel2EClass, VSVS_STEP_OUTPUT_LEVEL2__LEVEL2_FILTER);
		createEReference(vsvsStepOutputLevel2EClass, VSVS_STEP_OUTPUT_LEVEL2__LEVEL1);
		createEReference(vsvsStepOutputLevel2EClass, VSVS_STEP_OUTPUT_LEVEL2__LEVEL2_FROM_LEVEL1);
		createEReference(vsvsStepOutputLevel2EClass, VSVS_STEP_OUTPUT_LEVEL2__LEVEL1_FILTER);
		createEReference(vsvsStepOutputLevel2EClass, VSVS_STEP_OUTPUT_LEVEL2__LEVEL0);
		createEReference(vsvsStepOutputLevel2EClass, VSVS_STEP_OUTPUT_LEVEL2__LEVEL1_FROM_LEVEL0);
		createEReference(vsvsStepOutputLevel2EClass, VSVS_STEP_OUTPUT_LEVEL2__LEVEL0_FILTER);

		vsvsStepOutputLevel1EClass = createEClass(VSVS_STEP_OUTPUT_LEVEL1);
		createEReference(vsvsStepOutputLevel1EClass, VSVS_STEP_OUTPUT_LEVEL1__LEVEL1);
		createEReference(vsvsStepOutputLevel1EClass, VSVS_STEP_OUTPUT_LEVEL1__LEVEL1_FILTER);
		createEReference(vsvsStepOutputLevel1EClass, VSVS_STEP_OUTPUT_LEVEL1__LEVEL0);
		createEReference(vsvsStepOutputLevel1EClass, VSVS_STEP_OUTPUT_LEVEL1__LEVEL1_FROM_LEVEL0);
		createEReference(vsvsStepOutputLevel1EClass, VSVS_STEP_OUTPUT_LEVEL1__LEVEL0_FILTER);

		vsvsStepOutputLevel0EClass = createEClass(VSVS_STEP_OUTPUT_LEVEL0);
		createEReference(vsvsStepOutputLevel0EClass, VSVS_STEP_OUTPUT_LEVEL0__LEVEL0);
		createEReference(vsvsStepOutputLevel0EClass, VSVS_STEP_OUTPUT_LEVEL0__LEVEL0_FILTER);

		vsvsStepFilterEClass = createEClass(VSVS_STEP_FILTER);
		createEAttribute(vsvsStepFilterEClass, VSVS_STEP_FILTER__APPLY_DEF_FILTER);
		createEReference(vsvsStepFilterEClass, VSVS_STEP_FILTER__EXTRA_FILTER);

		vsvsAnalysisInspectionReviewEClass = createEClass(VSVS_ANALYSIS_INSPECTION_REVIEW);

		vsvsTestPlatformRequirementsEClass = createEClass(VSVS_TEST_PLATFORM_REQUIREMENTS);

		vsvsAdditionalInformationEClass = createEClass(VSVS_ADDITIONAL_INFORMATION);

		// Create enums
		vsvsStepModeEEnum = createEEnum(VSVS_STEP_MODE);
		vsvsStepUnitEEnum = createEEnum(VSVS_STEP_UNIT);
		vsvsStepCheckmodeEEnum = createEEnum(VSVS_STEP_CHECKMODE);
		vsvsStepYesNoEEnum = createEEnum(VSVS_STEP_YES_NO);
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
		formatPackage theformatPackage = (formatPackage)EPackage.Registry.INSTANCE.getEPackage(formatPackage.eNS_URI);
		exportPackage theexportPackage = (exportPackage)EPackage.Registry.INSTANCE.getEPackage(exportPackage.eNS_URI);
		importPackage theimportPackage = (importPackage)EPackage.Registry.INSTANCE.getEPackage(importPackage.eNS_URI);
		filterPackage thefilterPackage = (filterPackage)EPackage.Registry.INSTANCE.getEPackage(filterPackage.eNS_URI);

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
		vsvsSoftwareOverviewEClass.getESuperTypes().add(this.getVSVSFixedSection());
		vsvsTaskIdentificationEClass.getESuperTypes().add(thedocPackage.getDFixedSection());
		vsvsTestingSpecificationDesignEClass.getESuperTypes().add(thedocPackage.getDFixedSection());
		vsvsTestDesignEClass.getESuperTypes().add(thedocPackage.getDFixedSection());
		vsvsFixedTestSectionEClass.getESuperTypes().add(thedocPackage.getDFixedSection());
		vsvsTestCasesEClass.getESuperTypes().add(thevdmPackage.getVValidationDocumentFixedGroup());
		vsvsTestCasesEClass.getESuperTypes().add(thedocPackage.getDFixedSection());
		vsvsTestCaseEClass.getESuperTypes().add(thevdmPackage.getVValidationDocumentAbstractItem());
		vsvsTestCaseEClass.getESuperTypes().add(thedocPackage.getDFixedSection());
		vsvsTestProceduresEClass.getESuperTypes().add(thedocPackage.getDFixedSection());
		vsvsTestProcedureEClass.getESuperTypes().add(thedocPackage.getDFixedSection());
		vsvsStepInputLevel3EClass.getESuperTypes().add(this.getVSVSStepInput());
		vsvsStepInputLevel2EClass.getESuperTypes().add(this.getVSVSStepInput());
		vsvsStepInputLevel1EClass.getESuperTypes().add(this.getVSVSStepInput());
		vsvsStepInputLevel0EClass.getESuperTypes().add(this.getVSVSStepInput());
		vsvsStepOutputLevel3EClass.getESuperTypes().add(this.getVSVSStepOutput());
		vsvsStepOutputLevel2EClass.getESuperTypes().add(this.getVSVSStepOutput());
		vsvsStepOutputLevel1EClass.getESuperTypes().add(this.getVSVSStepOutput());
		vsvsStepOutputLevel0EClass.getESuperTypes().add(this.getVSVSStepOutput());
		vsvsAnalysisInspectionReviewEClass.getESuperTypes().add(this.getVSVSFixedSection());
		vsvsTestPlatformRequirementsEClass.getESuperTypes().add(this.getVSVSFixedSection());
		vsvsAdditionalInformationEClass.getESuperTypes().add(this.getVSVSFixedSection());

		// Initialize classes, features, and operations; add parameters
		initEClass(vsvsDocumentEClass, VSVSDocument.class, "VSVSDocument", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getVSVSDocument_IntroductionSection(), this.getVSVSIntroduction(), null, "introductionSection", null, 1, 1, VSVSDocument.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVSVSDocument_ApplicableDocumentsSection(), this.getVSVSApplicableDocuments(), null, "applicableDocumentsSection", null, 1, 1, VSVSDocument.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVSVSDocument_ReferenceDocumentsSection(), this.getVSVSReferenceDocuments(), null, "referenceDocumentsSection", null, 1, 1, VSVSDocument.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVSVSDocument_TermsDefinitionsAbbreviationsSection(), this.getVSVSTermsDefinitionsAbbreviations(), null, "termsDefinitionsAbbreviationsSection", null, 1, 1, VSVSDocument.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVSVSDocument_SoftwareOverviewSection(), this.getVSVSSoftwareOverview(), null, "softwareOverviewSection", null, 1, 1, VSVSDocument.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
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

		initEClass(vsvsTaskIdentificationEClass, VSVSTaskIdentification.class, "VSVSTaskIdentification", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getVSVSTaskIdentification_TaskCriteria(), this.getVSVSFixedSection(), null, "taskCriteria", null, 1, 1, VSVSTaskIdentification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVSVSTaskIdentification_FeaturesToBeTested(), this.getVSVSFixedSection(), null, "featuresToBeTested", null, 1, 1, VSVSTaskIdentification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVSVSTaskIdentification_FeaturesNotToBeTested(), this.getVSVSFixedSection(), null, "featuresNotToBeTested", null, 1, 1, VSVSTaskIdentification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVSVSTaskIdentification_TestPassFailCriteria(), this.getVSVSFixedSection(), null, "testPassFailCriteria", null, 1, 1, VSVSTaskIdentification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVSVSTaskIdentification_ItemsCanNotBeValidated(), this.getVSVSFixedSection(), null, "itemsCanNotBeValidated", null, 1, 1, VSVSTaskIdentification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVSVSTaskIdentification_ManuallyAutoGeneratedCode(), this.getVSVSFixedSection(), null, "manuallyAutoGeneratedCode", null, 1, 1, VSVSTaskIdentification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(vsvsTestingSpecificationDesignEClass, VSVSTestingSpecificationDesign.class, "VSVSTestingSpecificationDesign", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getVSVSTestingSpecificationDesign_General(), this.getVSVSFixedSection(), null, "general", null, 1, 1, VSVSTestingSpecificationDesign.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVSVSTestingSpecificationDesign_TestDesigns(), this.getVSVSTestDesign(), null, "testDesigns", null, 1, -1, VSVSTestingSpecificationDesign.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(vsvsTestDesignEClass, VSVSTestDesign.class, "VSVSTestDesign", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getVSVSTestDesign_Name(), ecorePackage.getEString(), "name", null, 1, 1, VSVSTestDesign.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVSVSTestDesign_General(), this.getVSVSFixedSection(), null, "general", null, 1, 1, VSVSTestDesign.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVSVSTestDesign_FeaturesToBeTested(), this.getVSVSFixedSection(), null, "featuresToBeTested", null, 1, 1, VSVSTestDesign.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVSVSTestDesign_ApproachRefinements(), this.getVSVSFixedSection(), null, "approachRefinements", null, 1, 1, VSVSTestDesign.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(vsvsFixedTestSectionEClass, VSVSFixedTestSection.class, "VSVSFixedTestSection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getVSVSFixedTestSection_Body(), thedocPackage.getDBody(), null, "body", null, 0, 1, VSVSFixedTestSection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(vsvsTestCasesEClass, VSVSTestCases.class, "VSVSTestCases", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getVSVSTestCases_General(), this.getVSVSFixedSection(), null, "general", null, 1, 1, VSVSTestCases.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVSVSTestCases_TestCases(), this.getVSVSTestCase(), null, "testCases", null, 1, -1, VSVSTestCases.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(vsvsTestCaseEClass, VSVSTestCase.class, "VSVSTestCase", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getVSVSTestCase_Identifier(), this.getVSVSFixedTestSection(), null, "identifier", null, 1, 1, VSVSTestCase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVSVSTestCase_Inputs(), this.getVSVSFixedTestSection(), null, "inputs", null, 1, 1, VSVSTestCase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVSVSTestCase_Outputs(), this.getVSVSFixedTestSection(), null, "outputs", null, 1, 1, VSVSTestCase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVSVSTestCase_PassFailCriteria(), this.getVSVSFixedTestSection(), null, "passFailCriteria", null, 1, 1, VSVSTestCase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVSVSTestCase_EnvironmentalNeeds(), this.getVSVSFixedTestSection(), null, "environmentalNeeds", null, 1, 1, VSVSTestCase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVSVSTestCase_SpecialConstraints(), this.getVSVSFixedTestSection(), null, "specialConstraints", null, 1, 1, VSVSTestCase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVSVSTestCase_InterfaceDependencies(), this.getVSVSFixedTestSection(), null, "interfaceDependencies", null, 1, 1, VSVSTestCase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(vsvsTestProceduresEClass, VSVSTestProcedures.class, "VSVSTestProcedures", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getVSVSTestProcedures_General(), this.getVSVSFixedSection(), null, "general", null, 1, 1, VSVSTestProcedures.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVSVSTestProcedures_TestProcedures(), this.getVSVSTestProcedure(), null, "testProcedures", null, 1, -1, VSVSTestProcedures.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(vsvsTestProcedureEClass, VSVSTestProcedure.class, "VSVSTestProcedure", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getVSVSTestProcedure_Name(), ecorePackage.getEString(), "name", null, 1, 1, VSVSTestProcedure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVSVSTestProcedure_Identifier(), this.getVSVSFixedTestSection(), null, "identifier", null, 1, 1, VSVSTestProcedure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVSVSTestProcedure_Purpose(), this.getVSVSFixedTestSection(), null, "purpose", null, 1, 1, VSVSTestProcedure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVSVSTestProcedure_ProcedureSteps(), this.getVSVSProcedureSteps(), null, "procedureSteps", null, 1, 1, VSVSTestProcedure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVSVSTestProcedure_TestScript(), this.getVSVSFixedTestSection(), null, "testScript", null, 0, 1, VSVSTestProcedure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVSVSTestProcedure_TestCase(), this.getVSVSTestCase(), null, "testCase", null, 1, -1, VSVSTestProcedure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(vsvsProcedureStepsEClass, VSVSProcedureSteps.class, "VSVSProcedureSteps", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getVSVSProcedureSteps_Step(), this.getVSVSProcedureStep(), null, "step", null, 1, 1900, VSVSProcedureSteps.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(vsvsProcedureStepEClass, VSVSProcedureStep.class, "VSVSProcedureStep", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getVSVSProcedureStep_Name(), ecorePackage.getEString(), "name", null, 1, 1, VSVSProcedureStep.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVSVSProcedureStep_Description(), ecorePackage.getEString(), "description", null, 0, 1, VSVSProcedureStep.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVSVSProcedureStep_Id(), ecorePackage.getEString(), "id", null, 1, 1, VSVSProcedureStep.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVSVSProcedureStep_Mode(), this.getVSVSStepMode(), "mode", null, 1, 1, VSVSProcedureStep.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVSVSProcedureStep_Replays(), ecorePackage.getEString(), "replays", null, 0, 1, VSVSProcedureStep.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVSVSProcedureStep_Prev_step_idref(), this.getVSVSProcedureStep(), null, "prev_step_idref", null, 0, 1, VSVSProcedureStep.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVSVSProcedureStep_Output_idref_from_prev_step(), this.getVSVSStepOutput(), null, "output_idref_from_prev_step", null, 0, 1, VSVSProcedureStep.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVSVSProcedureStep_Inputs(), this.getVSVSStepInputs(), null, "inputs", null, 1, 1, VSVSProcedureStep.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVSVSProcedureStep_Outputs(), this.getVSVSStepOutputs(), null, "outputs", null, 0, 1, VSVSProcedureStep.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVSVSProcedureStep_SpecialPackets(), this.getVSVSStepSpecialPackets(), null, "specialPackets", null, 0, 1, VSVSProcedureStep.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVSVSProcedureStep_Concurrent_steps(), this.getVSVSStepConcurrentSteps(), null, "concurrent_steps", null, 0, 1, VSVSProcedureStep.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(vsvsStepInputsEClass, VSVSStepInputs.class, "VSVSStepInputs", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getVSVSStepInputs_Input_level_3(), this.getVSVSStepInputLevel3(), null, "input_level_3", null, 0, -1, VSVSStepInputs.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVSVSStepInputs_Input_level_2(), this.getVSVSStepInputLevel2(), null, "input_level_2", null, 0, -1, VSVSStepInputs.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVSVSStepInputs_Input_level_1(), this.getVSVSStepInputLevel1(), null, "input_level_1", null, 0, -1, VSVSStepInputs.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVSVSStepInputs_Input_level_0(), this.getVSVSStepInputLevel0(), null, "input_level_0", null, 0, -1, VSVSStepInputs.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(vsvsStepOutputsEClass, VSVSStepOutputs.class, "VSVSStepOutputs", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getVSVSStepOutputs_Checkmode(), this.getVSVSStepCheckmode(), "checkmode", null, 1, 1, VSVSStepOutputs.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVSVSStepOutputs_Valid_time_interval_value(), ecorePackage.getEString(), "valid_time_interval_value", null, 1, 1, VSVSStepOutputs.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVSVSStepOutputs_Valid_time_interval_unit(), this.getVSVSStepUnit(), "valid_time_interval_unit", null, 1, 1, VSVSStepOutputs.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVSVSStepOutputs_Output_level_3(), this.getVSVSStepOutputLevel3(), null, "output_level_3", null, 0, -1, VSVSStepOutputs.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVSVSStepOutputs_Output_level_2(), this.getVSVSStepOutputLevel2(), null, "output_level_2", null, 0, -1, VSVSStepOutputs.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVSVSStepOutputs_Output_level_1(), this.getVSVSStepOutputLevel1(), null, "output_level_1", null, 0, -1, VSVSStepOutputs.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVSVSStepOutputs_Output_level_0(), this.getVSVSStepOutputLevel0(), null, "output_level_0", null, 0, -1, VSVSStepOutputs.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(vsvsStepSpecialPacketsEClass, VSVSStepSpecialPackets.class, "VSVSStepSpecialPackets", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getVSVSStepSpecialPackets_Enable(), this.getVSVSStepEnableDisable(), null, "enable", null, 0, -1, VSVSStepSpecialPackets.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVSVSStepSpecialPackets_Disable(), this.getVSVSStepEnableDisable(), null, "disable", null, 0, -1, VSVSStepSpecialPackets.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVSVSStepSpecialPackets_Enable_print(), this.getVSVSStepEnableDisable(), null, "enable_print", null, 0, -1, VSVSStepSpecialPackets.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVSVSStepSpecialPackets_Disable_print(), this.getVSVSStepEnableDisable(), null, "disable_print", null, 0, -1, VSVSStepSpecialPackets.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(vsvsStepEnableDisableEClass, VSVSStepEnableDisable.class, "VSVSStepEnableDisable", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getVSVSStepEnableDisable_Id(), ecorePackage.getEString(), "id", null, 1, 1, VSVSStepEnableDisable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(vsvsStepConcurrentStepsEClass, VSVSStepConcurrentSteps.class, "VSVSStepConcurrentSteps", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getVSVSStepConcurrentSteps_NextStep(), this.getVSVSStepNextStep(), null, "nextStep", null, 1, 1, VSVSStepConcurrentSteps.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVSVSStepConcurrentSteps_Concurrent_step(), this.getVSVSStepConcurrentStep(), null, "concurrent_step", null, 1, -1, VSVSStepConcurrentSteps.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(vsvsStepNextStepEClass, VSVSStepNextStep.class, "VSVSStepNextStep", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getVSVSStepNextStep_Id(), ecorePackage.getEString(), "id", null, 1, 1, VSVSStepNextStep.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVSVSStepNextStep_IsConcurrent(), this.getVSVSStepYesNo(), "isConcurrent", null, 1, 1, VSVSStepNextStep.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(vsvsStepConcurrentStepEClass, VSVSStepConcurrentStep.class, "VSVSStepConcurrentStep", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getVSVSStepConcurrentStep_Id(), ecorePackage.getEString(), "id", null, 1, 1, VSVSStepConcurrentStep.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(vsvsStepInputEClass, VSVSStepInput.class, "VSVSStepInput", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getVSVSStepInput_Name(), ecorePackage.getEString(), "name", null, 1, 1, VSVSStepInput.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVSVSStepInput_IfRef(), ecorePackage.getEString(), "ifRef", null, 1, 1, VSVSStepInput.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVSVSStepInput_Delay_value(), ecorePackage.getEString(), "delay_value", null, 1, 1, VSVSStepInput.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVSVSStepInput_Delay_unit(), this.getVSVSStepUnit(), "delay_unit", null, 1, 1, VSVSStepInput.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(vsvsStepInputLevel3EClass, VSVSStepInputLevel3.class, "VSVSStepInputLevel3", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getVSVSStepInputLevel3_Level3(), theformatPackage.getTMTCIFFormatFormat(), null, "level3", null, 0, 1, VSVSStepInputLevel3.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVSVSStepInputLevel3_App_to_level3(), theexportPackage.getTMTCIFExportExport(), null, "app_to_level3", null, 0, 1, VSVSStepInputLevel3.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVSVSStepInputLevel3_Level2(), theformatPackage.getTMTCIFFormatFormat(), null, "level2", null, 0, 1, VSVSStepInputLevel3.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVSVSStepInputLevel3_Level3_to_level2(), theexportPackage.getTMTCIFExportExport(), null, "level3_to_level2", null, 0, 1, VSVSStepInputLevel3.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVSVSStepInputLevel3_Level1(), theformatPackage.getTMTCIFFormatFormat(), null, "level1", null, 0, 1, VSVSStepInputLevel3.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVSVSStepInputLevel3_Level2_to_level1(), theexportPackage.getTMTCIFExportExport(), null, "level2_to_level1", null, 0, 1, VSVSStepInputLevel3.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVSVSStepInputLevel3_Level0(), theformatPackage.getTMTCIFFormatFormat(), null, "level0", null, 0, 1, VSVSStepInputLevel3.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVSVSStepInputLevel3_Level1_to_level0(), theexportPackage.getTMTCIFExportExport(), null, "level1_to_level0", null, 0, 1, VSVSStepInputLevel3.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(vsvsStepInputLevel2EClass, VSVSStepInputLevel2.class, "VSVSStepInputLevel2", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getVSVSStepInputLevel2_Level2(), theformatPackage.getTMTCIFFormatFormat(), null, "level2", null, 0, 1, VSVSStepInputLevel2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVSVSStepInputLevel2_App_to_level2(), theexportPackage.getTMTCIFExportExport(), null, "app_to_level2", null, 0, 1, VSVSStepInputLevel2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVSVSStepInputLevel2_Level1(), theformatPackage.getTMTCIFFormatFormat(), null, "level1", null, 0, 1, VSVSStepInputLevel2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVSVSStepInputLevel2_Level2_to_level1(), theexportPackage.getTMTCIFExportExport(), null, "level2_to_level1", null, 0, 1, VSVSStepInputLevel2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVSVSStepInputLevel2_Level0(), theformatPackage.getTMTCIFFormatFormat(), null, "level0", null, 0, 1, VSVSStepInputLevel2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVSVSStepInputLevel2_Level1_to_level0(), theexportPackage.getTMTCIFExportExport(), null, "level1_to_level0", null, 0, 1, VSVSStepInputLevel2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(vsvsStepInputLevel1EClass, VSVSStepInputLevel1.class, "VSVSStepInputLevel1", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getVSVSStepInputLevel1_Level1(), theformatPackage.getTMTCIFFormatFormat(), null, "level1", null, 0, 1, VSVSStepInputLevel1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVSVSStepInputLevel1_App_to_level1(), theexportPackage.getTMTCIFExportExport(), null, "app_to_level1", null, 0, 1, VSVSStepInputLevel1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVSVSStepInputLevel1_Level0(), theformatPackage.getTMTCIFFormatFormat(), null, "level0", null, 0, 1, VSVSStepInputLevel1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVSVSStepInputLevel1_Level1_to_level0(), theexportPackage.getTMTCIFExportExport(), null, "level1_to_level0", null, 0, 1, VSVSStepInputLevel1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(vsvsStepInputLevel0EClass, VSVSStepInputLevel0.class, "VSVSStepInputLevel0", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getVSVSStepInputLevel0_Level0(), theformatPackage.getTMTCIFFormatFormat(), null, "level0", null, 0, 1, VSVSStepInputLevel0.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVSVSStepInputLevel0_App_to_level0(), theexportPackage.getTMTCIFExportExport(), null, "app_to_level0", null, 0, 1, VSVSStepInputLevel0.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(vsvsStepOutputEClass, VSVSStepOutput.class, "VSVSStepOutput", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getVSVSStepOutput_Name(), ecorePackage.getEString(), "name", null, 1, 1, VSVSStepOutput.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVSVSStepOutput_Id(), ecorePackage.getEString(), "id", null, 1, 1, VSVSStepOutput.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVSVSStepOutput_IfRef(), ecorePackage.getEString(), "ifRef", null, 1, 1, VSVSStepOutput.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVSVSStepOutput_Optional(), ecorePackage.getEString(), "optional", null, 0, 1, VSVSStepOutput.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(vsvsStepOutputLevel3EClass, VSVSStepOutputLevel3.class, "VSVSStepOutputLevel3", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getVSVSStepOutputLevel3_Level3(), theformatPackage.getTMTCIFFormatFormat(), null, "level3", null, 0, 1, VSVSStepOutputLevel3.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVSVSStepOutputLevel3_Level3_filter(), this.getVSVSStepFilter(), null, "level3_filter", null, 1, 1, VSVSStepOutputLevel3.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVSVSStepOutputLevel3_Level2(), theformatPackage.getTMTCIFFormatFormat(), null, "level2", null, 0, 1, VSVSStepOutputLevel3.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVSVSStepOutputLevel3_Level3_from_level2(), theimportPackage.getTMTCIFImportImport(), null, "level3_from_level2", null, 0, 1, VSVSStepOutputLevel3.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVSVSStepOutputLevel3_Level2_filter(), this.getVSVSStepFilter(), null, "level2_filter", null, 1, 1, VSVSStepOutputLevel3.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVSVSStepOutputLevel3_Level1(), theformatPackage.getTMTCIFFormatFormat(), null, "level1", null, 0, 1, VSVSStepOutputLevel3.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVSVSStepOutputLevel3_Level2_from_level1(), theimportPackage.getTMTCIFImportImport(), null, "level2_from_level1", null, 0, 1, VSVSStepOutputLevel3.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVSVSStepOutputLevel3_Level1_filter(), this.getVSVSStepFilter(), null, "level1_filter", null, 1, 1, VSVSStepOutputLevel3.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVSVSStepOutputLevel3_Level0(), theformatPackage.getTMTCIFFormatFormat(), null, "level0", null, 0, 1, VSVSStepOutputLevel3.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVSVSStepOutputLevel3_Level1_from_level0(), theimportPackage.getTMTCIFImportImport(), null, "level1_from_level0", null, 0, 1, VSVSStepOutputLevel3.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVSVSStepOutputLevel3_Level0_filter(), this.getVSVSStepFilter(), null, "level0_filter", null, 1, 1, VSVSStepOutputLevel3.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(vsvsStepOutputLevel2EClass, VSVSStepOutputLevel2.class, "VSVSStepOutputLevel2", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getVSVSStepOutputLevel2_Level2(), theformatPackage.getTMTCIFFormatFormat(), null, "level2", null, 0, 1, VSVSStepOutputLevel2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVSVSStepOutputLevel2_Level2_filter(), this.getVSVSStepFilter(), null, "level2_filter", null, 1, 1, VSVSStepOutputLevel2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVSVSStepOutputLevel2_Level1(), theformatPackage.getTMTCIFFormatFormat(), null, "level1", null, 0, 1, VSVSStepOutputLevel2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVSVSStepOutputLevel2_Level2_from_level1(), theimportPackage.getTMTCIFImportImport(), null, "level2_from_level1", null, 0, 1, VSVSStepOutputLevel2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVSVSStepOutputLevel2_Level1_filter(), this.getVSVSStepFilter(), null, "level1_filter", null, 1, 1, VSVSStepOutputLevel2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVSVSStepOutputLevel2_Level0(), theformatPackage.getTMTCIFFormatFormat(), null, "level0", null, 0, 1, VSVSStepOutputLevel2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVSVSStepOutputLevel2_Level1_from_level0(), theimportPackage.getTMTCIFImportImport(), null, "level1_from_level0", null, 0, 1, VSVSStepOutputLevel2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVSVSStepOutputLevel2_Level0_filter(), this.getVSVSStepFilter(), null, "level0_filter", null, 1, 1, VSVSStepOutputLevel2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(vsvsStepOutputLevel1EClass, VSVSStepOutputLevel1.class, "VSVSStepOutputLevel1", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getVSVSStepOutputLevel1_Level1(), theformatPackage.getTMTCIFFormatFormat(), null, "level1", null, 0, 1, VSVSStepOutputLevel1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVSVSStepOutputLevel1_Level1_filter(), this.getVSVSStepFilter(), null, "level1_filter", null, 1, 1, VSVSStepOutputLevel1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVSVSStepOutputLevel1_Level0(), theformatPackage.getTMTCIFFormatFormat(), null, "level0", null, 0, 1, VSVSStepOutputLevel1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVSVSStepOutputLevel1_Level1_from_level0(), theimportPackage.getTMTCIFImportImport(), null, "level1_from_level0", null, 0, 1, VSVSStepOutputLevel1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVSVSStepOutputLevel1_Level0_filter(), this.getVSVSStepFilter(), null, "level0_filter", null, 1, 1, VSVSStepOutputLevel1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(vsvsStepOutputLevel0EClass, VSVSStepOutputLevel0.class, "VSVSStepOutputLevel0", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getVSVSStepOutputLevel0_Level0(), theformatPackage.getTMTCIFFormatFormat(), null, "level0", null, 0, 1, VSVSStepOutputLevel0.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVSVSStepOutputLevel0_Level0_filter(), this.getVSVSStepFilter(), null, "level0_filter", null, 1, 1, VSVSStepOutputLevel0.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(vsvsStepFilterEClass, VSVSStepFilter.class, "VSVSStepFilter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getVSVSStepFilter_Apply_def_filter(), this.getVSVSStepYesNo(), "apply_def_filter", null, 1, 1, VSVSStepFilter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVSVSStepFilter_Extra_filter(), thefilterPackage.getTMTCIFFilterFilter(), null, "extra_filter", null, 0, 1, VSVSStepFilter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(vsvsAnalysisInspectionReviewEClass, VSVSAnalysisInspectionReview.class, "VSVSAnalysisInspectionReview", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(vsvsTestPlatformRequirementsEClass, VSVSTestPlatformRequirements.class, "VSVSTestPlatformRequirements", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(vsvsAdditionalInformationEClass, VSVSAdditionalInformation.class, "VSVSAdditionalInformation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Initialize enums and add enum literals
		initEEnum(vsvsStepModeEEnum, VSVSStepMode.class, "VSVSStepMode");
		addEEnumLiteral(vsvsStepModeEEnum, VSVSStepMode.CONTINUOUS);
		addEEnumLiteral(vsvsStepModeEEnum, VSVSStepMode.MANUAL);
		addEEnumLiteral(vsvsStepModeEEnum, VSVSStepMode.CONCURRENT);

		initEEnum(vsvsStepUnitEEnum, VSVSStepUnit.class, "VSVSStepUnit");
		addEEnumLiteral(vsvsStepUnitEEnum, VSVSStepUnit.MILISECONDS);
		addEEnumLiteral(vsvsStepUnitEEnum, VSVSStepUnit.SECONDS);

		initEEnum(vsvsStepCheckmodeEEnum, VSVSStepCheckmode.class, "VSVSStepCheckmode");
		addEEnumLiteral(vsvsStepCheckmodeEEnum, VSVSStepCheckmode.ALL);
		addEEnumLiteral(vsvsStepCheckmodeEEnum, VSVSStepCheckmode.ALLUNSORTED);
		addEEnumLiteral(vsvsStepCheckmodeEEnum, VSVSStepCheckmode.ANY);

		initEEnum(vsvsStepYesNoEEnum, VSVSStepYesNo.class, "VSVSStepYesNo");
		addEEnumLiteral(vsvsStepYesNoEEnum, VSVSStepYesNo.YES);
		addEEnumLiteral(vsvsStepYesNoEEnum, VSVSStepYesNo.NO);

		// Create resource
		createResource(eNS_URI);
	}

} //svsPackageImpl
