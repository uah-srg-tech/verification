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
package es.uah.aut.srg.micobs.svm.srs.impl;

import es.uah.aut.srg.micobs.doctpl.doc.docPackage;

import es.uah.aut.srg.micobs.svm.srs.VSRSAbbreviation;
import es.uah.aut.srg.micobs.svm.srs.VSRSAbstractBriefDescription;
import es.uah.aut.srg.micobs.svm.srs.VSRSAbstractRequirementSection;
import es.uah.aut.srg.micobs.svm.srs.VSRSAdaptationInstallationRequirements;
import es.uah.aut.srg.micobs.svm.srs.VSRSApplicableDocuments;
import es.uah.aut.srg.micobs.svm.srs.VSRSDataDefinitionDBRequirements;
import es.uah.aut.srg.micobs.svm.srs.VSRSDefinition;
import es.uah.aut.srg.micobs.svm.srs.VSRSDesignRequirements;
import es.uah.aut.srg.micobs.svm.srs.VSRSDocument;
import es.uah.aut.srg.micobs.svm.srs.VSRSDocumentItem;
import es.uah.aut.srg.micobs.svm.srs.VSRSFixedSection;
import es.uah.aut.srg.micobs.svm.srs.VSRSFunctionalRequirements;
import es.uah.aut.srg.micobs.svm.srs.VSRSGeneralRequirements;
import es.uah.aut.srg.micobs.svm.srs.VSRSHumanFactorsRequirements;
import es.uah.aut.srg.micobs.svm.srs.VSRSInstantiableRequirementSection;
import es.uah.aut.srg.micobs.svm.srs.VSRSInstantiableSection;
import es.uah.aut.srg.micobs.svm.srs.VSRSInterfaceRequirements;
import es.uah.aut.srg.micobs.svm.srs.VSRSIntroduction;
import es.uah.aut.srg.micobs.svm.srs.VSRSLogicalModel;
import es.uah.aut.srg.micobs.svm.srs.VSRSLogicalModels;
import es.uah.aut.srg.micobs.svm.srs.VSRSOperationalRequirements;
import es.uah.aut.srg.micobs.svm.srs.VSRSPerformanceRequirements;
import es.uah.aut.srg.micobs.svm.srs.VSRSPortabilityRequirements;
import es.uah.aut.srg.micobs.svm.srs.VSRSReferenceDocuments;
import es.uah.aut.srg.micobs.svm.srs.VSRSRequirements;
import es.uah.aut.srg.micobs.svm.srs.VSRSResourcesRequirements;
import es.uah.aut.srg.micobs.svm.srs.VSRSSWConfigurationDeliveryRequirements;
import es.uah.aut.srg.micobs.svm.srs.VSRSSWMaintainabilityRequirements;
import es.uah.aut.srg.micobs.svm.srs.VSRSSWQualityRequirements;
import es.uah.aut.srg.micobs.svm.srs.VSRSSWReliabiltyRequirements;
import es.uah.aut.srg.micobs.svm.srs.VSRSSWSafetyRequirements;
import es.uah.aut.srg.micobs.svm.srs.VSRSSecurityPrivacyRequirements;
import es.uah.aut.srg.micobs.svm.srs.VSRSSoftwareOverview;
import es.uah.aut.srg.micobs.svm.srs.VSRSTerm;
import es.uah.aut.srg.micobs.svm.srs.VSRSTermsDefinitionsAbbreviations;
import es.uah.aut.srg.micobs.svm.srs.VSRSTraceabilty;
import es.uah.aut.srg.micobs.svm.srs.srsFactory;
import es.uah.aut.srg.micobs.svm.srs.srsPackage;

import es.uah.aut.srg.micobs.svm.tdm.tdmPackage;

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
public class srsPackageImpl extends EPackageImpl implements srsPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass vsrsDocumentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass vsrsIntroductionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass vsrsApplicableDocumentsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass vsrsReferenceDocumentsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass vsrsTermsDefinitionsAbbreviationsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass vsrsAbstractBriefDescriptionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass vsrsTermEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass vsrsDefinitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass vsrsAbbreviationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass vsrsFixedSectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass vsrsInstantiableSectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass vsrsSoftwareOverviewEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass vsrsAbstractRequirementSectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass vsrsInstantiableRequirementSectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass vsrsRequirementsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass vsrsGeneralRequirementsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass vsrsFunctionalRequirementsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass vsrsPerformanceRequirementsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass vsrsInterfaceRequirementsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass vsrsOperationalRequirementsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass vsrsResourcesRequirementsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass vsrsDesignRequirementsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass vsrsSecurityPrivacyRequirementsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass vsrsPortabilityRequirementsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass vsrsswQualityRequirementsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass vsrsswReliabiltyRequirementsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass vsrsswMaintainabilityRequirementsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass vsrsswSafetyRequirementsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass vsrsswConfigurationDeliveryRequirementsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass vsrsDataDefinitionDBRequirementsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass vsrsHumanFactorsRequirementsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass vsrsAdaptationInstallationRequirementsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass vsrsDocumentItemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass vsrsTraceabiltyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass vsrsLogicalModelsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass vsrsLogicalModelEClass = null;

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
	 * @see es.uah.aut.srg.micobs.svm.srs.srsPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private srsPackageImpl() {
		super(eNS_URI, srsFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link srsPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static srsPackage init() {
		if (isInited) return (srsPackage)EPackage.Registry.INSTANCE.getEPackage(srsPackage.eNS_URI);

		// Obtain or create and register package
		srsPackageImpl thesrsPackage = (srsPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof srsPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new srsPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		docPackage.eINSTANCE.eClass();
		tdmPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		thesrsPackage.createPackageContents();

		// Initialize created meta-data
		thesrsPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		thesrsPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(srsPackage.eNS_URI, thesrsPackage);
		return thesrsPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVSRSDocument() {
		return vsrsDocumentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVSRSDocument_IntroductionSection() {
		return (EReference)vsrsDocumentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVSRSDocument_ApplicableDocumentsSection() {
		return (EReference)vsrsDocumentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVSRSDocument_ReferenceDocumentsSection() {
		return (EReference)vsrsDocumentEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVSRSDocument_TermsDefinitionsAbbreviationsSection() {
		return (EReference)vsrsDocumentEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVSRSDocument_GeneralDescriptionSection() {
		return (EReference)vsrsDocumentEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVSRSDocument_RequirementsSection() {
		return (EReference)vsrsDocumentEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVSRSDocument_TraceabiltySection() {
		return (EReference)vsrsDocumentEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVSRSDocument_LogicalModelsSection() {
		return (EReference)vsrsDocumentEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVSRSDocument_SrsFigures() {
		return (EReference)vsrsDocumentEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVSRSDocument_SrsTables() {
		return (EReference)vsrsDocumentEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVSRSIntroduction() {
		return vsrsIntroductionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVSRSIntroduction_SrsInstatiableSubsections() {
		return (EReference)vsrsIntroductionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVSRSApplicableDocuments() {
		return vsrsApplicableDocumentsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVSRSApplicableDocuments_ApplicableDocuments() {
		return (EReference)vsrsApplicableDocumentsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVSRSReferenceDocuments() {
		return vsrsReferenceDocumentsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVSRSReferenceDocuments_ReferenceDocuments() {
		return (EReference)vsrsReferenceDocumentsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVSRSTermsDefinitionsAbbreviations() {
		return vsrsTermsDefinitionsAbbreviationsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVSRSTermsDefinitionsAbbreviations_Terms() {
		return (EReference)vsrsTermsDefinitionsAbbreviationsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVSRSTermsDefinitionsAbbreviations_Definitions() {
		return (EReference)vsrsTermsDefinitionsAbbreviationsEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVSRSTermsDefinitionsAbbreviations_Abbreviations() {
		return (EReference)vsrsTermsDefinitionsAbbreviationsEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVSRSAbstractBriefDescription() {
		return vsrsAbstractBriefDescriptionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVSRSAbstractBriefDescription_Name() {
		return (EAttribute)vsrsAbstractBriefDescriptionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVSRSAbstractBriefDescription_Description() {
		return (EReference)vsrsAbstractBriefDescriptionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVSRSTerm() {
		return vsrsTermEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVSRSDefinition() {
		return vsrsDefinitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVSRSAbbreviation() {
		return vsrsAbbreviationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVSRSFixedSection() {
		return vsrsFixedSectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVSRSFixedSection_Body() {
		return (EReference)vsrsFixedSectionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVSRSFixedSection_SrsInstatiableSubsections() {
		return (EReference)vsrsFixedSectionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVSRSInstantiableSection() {
		return vsrsInstantiableSectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVSRSInstantiableSection_Body() {
		return (EReference)vsrsInstantiableSectionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVSRSSoftwareOverview() {
		return vsrsSoftwareOverviewEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVSRSSoftwareOverview_FunctionPurpose() {
		return (EReference)vsrsSoftwareOverviewEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVSRSSoftwareOverview_EnvironmentalConsideration() {
		return (EReference)vsrsSoftwareOverviewEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVSRSSoftwareOverview_RelationOtherSystems() {
		return (EReference)vsrsSoftwareOverviewEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVSRSSoftwareOverview_Constraints() {
		return (EReference)vsrsSoftwareOverviewEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVSRSAbstractRequirementSection() {
		return vsrsAbstractRequirementSectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVSRSAbstractRequirementSection_SectionDescription() {
		return (EReference)vsrsAbstractRequirementSectionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVSRSAbstractRequirementSection_SrsItems() {
		return (EReference)vsrsAbstractRequirementSectionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVSRSAbstractRequirementSection_SrsRequirementSubsections() {
		return (EReference)vsrsAbstractRequirementSectionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVSRSInstantiableRequirementSection() {
		return vsrsInstantiableRequirementSectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVSRSInstantiableRequirementSection_SectionDescription() {
		return (EReference)vsrsInstantiableRequirementSectionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVSRSInstantiableRequirementSection_SrsItems() {
		return (EReference)vsrsInstantiableRequirementSectionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVSRSRequirements() {
		return vsrsRequirementsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVSRSRequirements_SectionDescription() {
		return (EReference)vsrsRequirementsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVSRSRequirements_General() {
		return (EReference)vsrsRequirementsEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVSRSRequirements_Functional() {
		return (EReference)vsrsRequirementsEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVSRSRequirements_Performance() {
		return (EReference)vsrsRequirementsEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVSRSRequirements_Interface() {
		return (EReference)vsrsRequirementsEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVSRSRequirements_Operational() {
		return (EReference)vsrsRequirementsEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVSRSRequirements_Resources() {
		return (EReference)vsrsRequirementsEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVSRSRequirements_Design() {
		return (EReference)vsrsRequirementsEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVSRSRequirements_SecurityPrivacy() {
		return (EReference)vsrsRequirementsEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVSRSRequirements_Portability() {
		return (EReference)vsrsRequirementsEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVSRSRequirements_SwQuality() {
		return (EReference)vsrsRequirementsEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVSRSRequirements_SwReliabilty() {
		return (EReference)vsrsRequirementsEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVSRSRequirements_SwMaintainability() {
		return (EReference)vsrsRequirementsEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVSRSRequirements_SwSafety() {
		return (EReference)vsrsRequirementsEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVSRSRequirements_SwConfigurationDelivery() {
		return (EReference)vsrsRequirementsEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVSRSRequirements_DataDefinitionDB() {
		return (EReference)vsrsRequirementsEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVSRSRequirements_HumanFactors() {
		return (EReference)vsrsRequirementsEClass.getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVSRSRequirements_AdaptationInstallation() {
		return (EReference)vsrsRequirementsEClass.getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVSRSGeneralRequirements() {
		return vsrsGeneralRequirementsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVSRSFunctionalRequirements() {
		return vsrsFunctionalRequirementsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVSRSPerformanceRequirements() {
		return vsrsPerformanceRequirementsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVSRSInterfaceRequirements() {
		return vsrsInterfaceRequirementsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVSRSOperationalRequirements() {
		return vsrsOperationalRequirementsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVSRSResourcesRequirements() {
		return vsrsResourcesRequirementsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVSRSDesignRequirements() {
		return vsrsDesignRequirementsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVSRSSecurityPrivacyRequirements() {
		return vsrsSecurityPrivacyRequirementsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVSRSPortabilityRequirements() {
		return vsrsPortabilityRequirementsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVSRSSWQualityRequirements() {
		return vsrsswQualityRequirementsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVSRSSWReliabiltyRequirements() {
		return vsrsswReliabiltyRequirementsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVSRSSWMaintainabilityRequirements() {
		return vsrsswMaintainabilityRequirementsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVSRSSWSafetyRequirements() {
		return vsrsswSafetyRequirementsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVSRSSWConfigurationDeliveryRequirements() {
		return vsrsswConfigurationDeliveryRequirementsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVSRSDataDefinitionDBRequirements() {
		return vsrsDataDefinitionDBRequirementsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVSRSHumanFactorsRequirements() {
		return vsrsHumanFactorsRequirementsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVSRSAdaptationInstallationRequirements() {
		return vsrsAdaptationInstallationRequirementsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVSRSDocumentItem() {
		return vsrsDocumentItemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVSRSDocumentItem_Description() {
		return (EReference)vsrsDocumentItemEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVSRSDocumentItem_ExtendedDescription() {
		return (EReference)vsrsDocumentItemEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVSRSTraceabilty() {
		return vsrsTraceabiltyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVSRSTraceabilty_SectionDescription() {
		return (EReference)vsrsTraceabiltyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVSRSLogicalModels() {
		return vsrsLogicalModelsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVSRSLogicalModels_LogicalModels() {
		return (EReference)vsrsLogicalModelsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVSRSLogicalModel() {
		return vsrsLogicalModelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public srsFactory getsrsFactory() {
		return (srsFactory)getEFactoryInstance();
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
		vsrsDocumentEClass = createEClass(VSRS_DOCUMENT);
		createEReference(vsrsDocumentEClass, VSRS_DOCUMENT__INTRODUCTION_SECTION);
		createEReference(vsrsDocumentEClass, VSRS_DOCUMENT__APPLICABLE_DOCUMENTS_SECTION);
		createEReference(vsrsDocumentEClass, VSRS_DOCUMENT__REFERENCE_DOCUMENTS_SECTION);
		createEReference(vsrsDocumentEClass, VSRS_DOCUMENT__TERMS_DEFINITIONS_ABBREVIATIONS_SECTION);
		createEReference(vsrsDocumentEClass, VSRS_DOCUMENT__GENERAL_DESCRIPTION_SECTION);
		createEReference(vsrsDocumentEClass, VSRS_DOCUMENT__REQUIREMENTS_SECTION);
		createEReference(vsrsDocumentEClass, VSRS_DOCUMENT__TRACEABILTY_SECTION);
		createEReference(vsrsDocumentEClass, VSRS_DOCUMENT__LOGICAL_MODELS_SECTION);
		createEReference(vsrsDocumentEClass, VSRS_DOCUMENT__SRS_FIGURES);
		createEReference(vsrsDocumentEClass, VSRS_DOCUMENT__SRS_TABLES);

		vsrsIntroductionEClass = createEClass(VSRS_INTRODUCTION);
		createEReference(vsrsIntroductionEClass, VSRS_INTRODUCTION__SRS_INSTATIABLE_SUBSECTIONS);

		vsrsApplicableDocumentsEClass = createEClass(VSRS_APPLICABLE_DOCUMENTS);
		createEReference(vsrsApplicableDocumentsEClass, VSRS_APPLICABLE_DOCUMENTS__APPLICABLE_DOCUMENTS);

		vsrsReferenceDocumentsEClass = createEClass(VSRS_REFERENCE_DOCUMENTS);
		createEReference(vsrsReferenceDocumentsEClass, VSRS_REFERENCE_DOCUMENTS__REFERENCE_DOCUMENTS);

		vsrsTermsDefinitionsAbbreviationsEClass = createEClass(VSRS_TERMS_DEFINITIONS_ABBREVIATIONS);
		createEReference(vsrsTermsDefinitionsAbbreviationsEClass, VSRS_TERMS_DEFINITIONS_ABBREVIATIONS__TERMS);
		createEReference(vsrsTermsDefinitionsAbbreviationsEClass, VSRS_TERMS_DEFINITIONS_ABBREVIATIONS__DEFINITIONS);
		createEReference(vsrsTermsDefinitionsAbbreviationsEClass, VSRS_TERMS_DEFINITIONS_ABBREVIATIONS__ABBREVIATIONS);

		vsrsAbstractBriefDescriptionEClass = createEClass(VSRS_ABSTRACT_BRIEF_DESCRIPTION);
		createEAttribute(vsrsAbstractBriefDescriptionEClass, VSRS_ABSTRACT_BRIEF_DESCRIPTION__NAME);
		createEReference(vsrsAbstractBriefDescriptionEClass, VSRS_ABSTRACT_BRIEF_DESCRIPTION__DESCRIPTION);

		vsrsTermEClass = createEClass(VSRS_TERM);

		vsrsDefinitionEClass = createEClass(VSRS_DEFINITION);

		vsrsAbbreviationEClass = createEClass(VSRS_ABBREVIATION);

		vsrsFixedSectionEClass = createEClass(VSRS_FIXED_SECTION);
		createEReference(vsrsFixedSectionEClass, VSRS_FIXED_SECTION__BODY);
		createEReference(vsrsFixedSectionEClass, VSRS_FIXED_SECTION__SRS_INSTATIABLE_SUBSECTIONS);

		vsrsInstantiableSectionEClass = createEClass(VSRS_INSTANTIABLE_SECTION);
		createEReference(vsrsInstantiableSectionEClass, VSRS_INSTANTIABLE_SECTION__BODY);

		vsrsSoftwareOverviewEClass = createEClass(VSRS_SOFTWARE_OVERVIEW);
		createEReference(vsrsSoftwareOverviewEClass, VSRS_SOFTWARE_OVERVIEW__FUNCTION_PURPOSE);
		createEReference(vsrsSoftwareOverviewEClass, VSRS_SOFTWARE_OVERVIEW__ENVIRONMENTAL_CONSIDERATION);
		createEReference(vsrsSoftwareOverviewEClass, VSRS_SOFTWARE_OVERVIEW__RELATION_OTHER_SYSTEMS);
		createEReference(vsrsSoftwareOverviewEClass, VSRS_SOFTWARE_OVERVIEW__CONSTRAINTS);

		vsrsAbstractRequirementSectionEClass = createEClass(VSRS_ABSTRACT_REQUIREMENT_SECTION);
		createEReference(vsrsAbstractRequirementSectionEClass, VSRS_ABSTRACT_REQUIREMENT_SECTION__SECTION_DESCRIPTION);
		createEReference(vsrsAbstractRequirementSectionEClass, VSRS_ABSTRACT_REQUIREMENT_SECTION__SRS_ITEMS);
		createEReference(vsrsAbstractRequirementSectionEClass, VSRS_ABSTRACT_REQUIREMENT_SECTION__SRS_REQUIREMENT_SUBSECTIONS);

		vsrsInstantiableRequirementSectionEClass = createEClass(VSRS_INSTANTIABLE_REQUIREMENT_SECTION);
		createEReference(vsrsInstantiableRequirementSectionEClass, VSRS_INSTANTIABLE_REQUIREMENT_SECTION__SECTION_DESCRIPTION);
		createEReference(vsrsInstantiableRequirementSectionEClass, VSRS_INSTANTIABLE_REQUIREMENT_SECTION__SRS_ITEMS);

		vsrsRequirementsEClass = createEClass(VSRS_REQUIREMENTS);
		createEReference(vsrsRequirementsEClass, VSRS_REQUIREMENTS__SECTION_DESCRIPTION);
		createEReference(vsrsRequirementsEClass, VSRS_REQUIREMENTS__GENERAL);
		createEReference(vsrsRequirementsEClass, VSRS_REQUIREMENTS__FUNCTIONAL);
		createEReference(vsrsRequirementsEClass, VSRS_REQUIREMENTS__PERFORMANCE);
		createEReference(vsrsRequirementsEClass, VSRS_REQUIREMENTS__INTERFACE);
		createEReference(vsrsRequirementsEClass, VSRS_REQUIREMENTS__OPERATIONAL);
		createEReference(vsrsRequirementsEClass, VSRS_REQUIREMENTS__RESOURCES);
		createEReference(vsrsRequirementsEClass, VSRS_REQUIREMENTS__DESIGN);
		createEReference(vsrsRequirementsEClass, VSRS_REQUIREMENTS__SECURITY_PRIVACY);
		createEReference(vsrsRequirementsEClass, VSRS_REQUIREMENTS__PORTABILITY);
		createEReference(vsrsRequirementsEClass, VSRS_REQUIREMENTS__SW_QUALITY);
		createEReference(vsrsRequirementsEClass, VSRS_REQUIREMENTS__SW_RELIABILTY);
		createEReference(vsrsRequirementsEClass, VSRS_REQUIREMENTS__SW_MAINTAINABILITY);
		createEReference(vsrsRequirementsEClass, VSRS_REQUIREMENTS__SW_SAFETY);
		createEReference(vsrsRequirementsEClass, VSRS_REQUIREMENTS__SW_CONFIGURATION_DELIVERY);
		createEReference(vsrsRequirementsEClass, VSRS_REQUIREMENTS__DATA_DEFINITION_DB);
		createEReference(vsrsRequirementsEClass, VSRS_REQUIREMENTS__HUMAN_FACTORS);
		createEReference(vsrsRequirementsEClass, VSRS_REQUIREMENTS__ADAPTATION_INSTALLATION);

		vsrsGeneralRequirementsEClass = createEClass(VSRS_GENERAL_REQUIREMENTS);

		vsrsFunctionalRequirementsEClass = createEClass(VSRS_FUNCTIONAL_REQUIREMENTS);

		vsrsPerformanceRequirementsEClass = createEClass(VSRS_PERFORMANCE_REQUIREMENTS);

		vsrsInterfaceRequirementsEClass = createEClass(VSRS_INTERFACE_REQUIREMENTS);

		vsrsOperationalRequirementsEClass = createEClass(VSRS_OPERATIONAL_REQUIREMENTS);

		vsrsResourcesRequirementsEClass = createEClass(VSRS_RESOURCES_REQUIREMENTS);

		vsrsDesignRequirementsEClass = createEClass(VSRS_DESIGN_REQUIREMENTS);

		vsrsSecurityPrivacyRequirementsEClass = createEClass(VSRS_SECURITY_PRIVACY_REQUIREMENTS);

		vsrsPortabilityRequirementsEClass = createEClass(VSRS_PORTABILITY_REQUIREMENTS);

		vsrsswQualityRequirementsEClass = createEClass(VSRSSW_QUALITY_REQUIREMENTS);

		vsrsswReliabiltyRequirementsEClass = createEClass(VSRSSW_RELIABILTY_REQUIREMENTS);

		vsrsswMaintainabilityRequirementsEClass = createEClass(VSRSSW_MAINTAINABILITY_REQUIREMENTS);

		vsrsswSafetyRequirementsEClass = createEClass(VSRSSW_SAFETY_REQUIREMENTS);

		vsrsswConfigurationDeliveryRequirementsEClass = createEClass(VSRSSW_CONFIGURATION_DELIVERY_REQUIREMENTS);

		vsrsDataDefinitionDBRequirementsEClass = createEClass(VSRS_DATA_DEFINITION_DB_REQUIREMENTS);

		vsrsHumanFactorsRequirementsEClass = createEClass(VSRS_HUMAN_FACTORS_REQUIREMENTS);

		vsrsAdaptationInstallationRequirementsEClass = createEClass(VSRS_ADAPTATION_INSTALLATION_REQUIREMENTS);

		vsrsDocumentItemEClass = createEClass(VSRS_DOCUMENT_ITEM);
		createEReference(vsrsDocumentItemEClass, VSRS_DOCUMENT_ITEM__DESCRIPTION);
		createEReference(vsrsDocumentItemEClass, VSRS_DOCUMENT_ITEM__EXTENDED_DESCRIPTION);

		vsrsTraceabiltyEClass = createEClass(VSRS_TRACEABILTY);
		createEReference(vsrsTraceabiltyEClass, VSRS_TRACEABILTY__SECTION_DESCRIPTION);

		vsrsLogicalModelsEClass = createEClass(VSRS_LOGICAL_MODELS);
		createEReference(vsrsLogicalModelsEClass, VSRS_LOGICAL_MODELS__LOGICAL_MODELS);

		vsrsLogicalModelEClass = createEClass(VSRS_LOGICAL_MODEL);
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
		tdmPackage thetdmPackage = (tdmPackage)EPackage.Registry.INSTANCE.getEPackage(tdmPackage.eNS_URI);
		docPackage thedocPackage = (docPackage)EPackage.Registry.INSTANCE.getEPackage(docPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		vsrsDocumentEClass.getESuperTypes().add(thetdmPackage.getVTraceableDocument());
		vsrsDocumentEClass.getESuperTypes().add(thedocPackage.getDDocumentTemplate());
		vsrsIntroductionEClass.getESuperTypes().add(thedocPackage.getDFixedSection());
		vsrsApplicableDocumentsEClass.getESuperTypes().add(thedocPackage.getDFixedSection());
		vsrsReferenceDocumentsEClass.getESuperTypes().add(thedocPackage.getDFixedSection());
		vsrsTermsDefinitionsAbbreviationsEClass.getESuperTypes().add(thedocPackage.getDFixedSection());
		vsrsTermEClass.getESuperTypes().add(this.getVSRSAbstractBriefDescription());
		vsrsDefinitionEClass.getESuperTypes().add(this.getVSRSAbstractBriefDescription());
		vsrsAbbreviationEClass.getESuperTypes().add(this.getVSRSAbstractBriefDescription());
		vsrsFixedSectionEClass.getESuperTypes().add(thedocPackage.getDFixedSection());
		vsrsInstantiableSectionEClass.getESuperTypes().add(thedocPackage.getDInstantiableSection());
		vsrsSoftwareOverviewEClass.getESuperTypes().add(thedocPackage.getDFixedSection());
		vsrsAbstractRequirementSectionEClass.getESuperTypes().add(thetdmPackage.getVTraceableDocumentAbstractGroup());
		vsrsAbstractRequirementSectionEClass.getESuperTypes().add(thedocPackage.getDFixedSection());
		vsrsInstantiableRequirementSectionEClass.getESuperTypes().add(thedocPackage.getDInstantiableSection());
		vsrsRequirementsEClass.getESuperTypes().add(thedocPackage.getDFixedSection());
		vsrsGeneralRequirementsEClass.getESuperTypes().add(this.getVSRSAbstractRequirementSection());
		vsrsFunctionalRequirementsEClass.getESuperTypes().add(this.getVSRSAbstractRequirementSection());
		vsrsPerformanceRequirementsEClass.getESuperTypes().add(this.getVSRSAbstractRequirementSection());
		vsrsInterfaceRequirementsEClass.getESuperTypes().add(this.getVSRSAbstractRequirementSection());
		vsrsOperationalRequirementsEClass.getESuperTypes().add(this.getVSRSAbstractRequirementSection());
		vsrsResourcesRequirementsEClass.getESuperTypes().add(this.getVSRSAbstractRequirementSection());
		vsrsDesignRequirementsEClass.getESuperTypes().add(this.getVSRSAbstractRequirementSection());
		vsrsSecurityPrivacyRequirementsEClass.getESuperTypes().add(this.getVSRSAbstractRequirementSection());
		vsrsPortabilityRequirementsEClass.getESuperTypes().add(this.getVSRSAbstractRequirementSection());
		vsrsswQualityRequirementsEClass.getESuperTypes().add(this.getVSRSAbstractRequirementSection());
		vsrsswReliabiltyRequirementsEClass.getESuperTypes().add(this.getVSRSAbstractRequirementSection());
		vsrsswMaintainabilityRequirementsEClass.getESuperTypes().add(this.getVSRSAbstractRequirementSection());
		vsrsswSafetyRequirementsEClass.getESuperTypes().add(this.getVSRSAbstractRequirementSection());
		vsrsswConfigurationDeliveryRequirementsEClass.getESuperTypes().add(this.getVSRSAbstractRequirementSection());
		vsrsDataDefinitionDBRequirementsEClass.getESuperTypes().add(this.getVSRSAbstractRequirementSection());
		vsrsHumanFactorsRequirementsEClass.getESuperTypes().add(this.getVSRSAbstractRequirementSection());
		vsrsAdaptationInstallationRequirementsEClass.getESuperTypes().add(this.getVSRSAbstractRequirementSection());
		vsrsDocumentItemEClass.getESuperTypes().add(thetdmPackage.getVTraceableDocumentAbstractItem());
		vsrsTraceabiltyEClass.getESuperTypes().add(thedocPackage.getDFixedSection());
		vsrsLogicalModelsEClass.getESuperTypes().add(thedocPackage.getDFixedSection());

		// Initialize classes, features, and operations; add parameters
		initEClass(vsrsDocumentEClass, VSRSDocument.class, "VSRSDocument", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getVSRSDocument_IntroductionSection(), this.getVSRSIntroduction(), null, "introductionSection", null, 1, 1, VSRSDocument.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVSRSDocument_ApplicableDocumentsSection(), this.getVSRSApplicableDocuments(), null, "applicableDocumentsSection", null, 1, 1, VSRSDocument.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVSRSDocument_ReferenceDocumentsSection(), this.getVSRSReferenceDocuments(), null, "referenceDocumentsSection", null, 1, 1, VSRSDocument.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVSRSDocument_TermsDefinitionsAbbreviationsSection(), this.getVSRSTermsDefinitionsAbbreviations(), null, "termsDefinitionsAbbreviationsSection", null, 1, 1, VSRSDocument.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVSRSDocument_GeneralDescriptionSection(), this.getVSRSSoftwareOverview(), null, "generalDescriptionSection", null, 1, 1, VSRSDocument.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVSRSDocument_RequirementsSection(), this.getVSRSRequirements(), null, "requirementsSection", null, 1, 1, VSRSDocument.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVSRSDocument_TraceabiltySection(), this.getVSRSTraceabilty(), null, "traceabiltySection", null, 1, 1, VSRSDocument.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVSRSDocument_LogicalModelsSection(), this.getVSRSLogicalModels(), null, "logicalModelsSection", null, 1, 1, VSRSDocument.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVSRSDocument_SrsFigures(), thedocPackage.getDAbstractFigure(), null, "srsFigures", null, 0, -1, VSRSDocument.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVSRSDocument_SrsTables(), thedocPackage.getDAbstractTable(), null, "srsTables", null, 0, -1, VSRSDocument.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(vsrsIntroductionEClass, VSRSIntroduction.class, "VSRSIntroduction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getVSRSIntroduction_SrsInstatiableSubsections(), this.getVSRSInstantiableSection(), null, "srsInstatiableSubsections", null, 1, -1, VSRSIntroduction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(vsrsApplicableDocumentsEClass, VSRSApplicableDocuments.class, "VSRSApplicableDocuments", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getVSRSApplicableDocuments_ApplicableDocuments(), thedocPackage.getDApplicableDocument(), null, "applicableDocuments", null, 0, -1, VSRSApplicableDocuments.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(vsrsReferenceDocumentsEClass, VSRSReferenceDocuments.class, "VSRSReferenceDocuments", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getVSRSReferenceDocuments_ReferenceDocuments(), thedocPackage.getDReferenceDocument(), null, "referenceDocuments", null, 0, -1, VSRSReferenceDocuments.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(vsrsTermsDefinitionsAbbreviationsEClass, VSRSTermsDefinitionsAbbreviations.class, "VSRSTermsDefinitionsAbbreviations", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getVSRSTermsDefinitionsAbbreviations_Terms(), this.getVSRSTerm(), null, "terms", null, 0, -1, VSRSTermsDefinitionsAbbreviations.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVSRSTermsDefinitionsAbbreviations_Definitions(), this.getVSRSDefinition(), null, "definitions", null, 0, -1, VSRSTermsDefinitionsAbbreviations.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVSRSTermsDefinitionsAbbreviations_Abbreviations(), this.getVSRSAbbreviation(), null, "abbreviations", null, 0, -1, VSRSTermsDefinitionsAbbreviations.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(vsrsAbstractBriefDescriptionEClass, VSRSAbstractBriefDescription.class, "VSRSAbstractBriefDescription", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getVSRSAbstractBriefDescription_Name(), ecorePackage.getEString(), "name", null, 1, 1, VSRSAbstractBriefDescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVSRSAbstractBriefDescription_Description(), thedocPackage.getDRun(), null, "description", null, 1, 1, VSRSAbstractBriefDescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(vsrsTermEClass, VSRSTerm.class, "VSRSTerm", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(vsrsDefinitionEClass, VSRSDefinition.class, "VSRSDefinition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(vsrsAbbreviationEClass, VSRSAbbreviation.class, "VSRSAbbreviation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(vsrsFixedSectionEClass, VSRSFixedSection.class, "VSRSFixedSection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getVSRSFixedSection_Body(), thedocPackage.getDBody(), null, "body", null, 1, 1, VSRSFixedSection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVSRSFixedSection_SrsInstatiableSubsections(), this.getVSRSInstantiableSection(), null, "srsInstatiableSubsections", null, 0, -1, VSRSFixedSection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(vsrsInstantiableSectionEClass, VSRSInstantiableSection.class, "VSRSInstantiableSection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getVSRSInstantiableSection_Body(), thedocPackage.getDBody(), null, "body", null, 1, 1, VSRSInstantiableSection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(vsrsSoftwareOverviewEClass, VSRSSoftwareOverview.class, "VSRSSoftwareOverview", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getVSRSSoftwareOverview_FunctionPurpose(), this.getVSRSFixedSection(), null, "functionPurpose", null, 1, 1, VSRSSoftwareOverview.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVSRSSoftwareOverview_EnvironmentalConsideration(), this.getVSRSFixedSection(), null, "environmentalConsideration", null, 1, 1, VSRSSoftwareOverview.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVSRSSoftwareOverview_RelationOtherSystems(), this.getVSRSFixedSection(), null, "relationOtherSystems", null, 1, 1, VSRSSoftwareOverview.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVSRSSoftwareOverview_Constraints(), this.getVSRSFixedSection(), null, "constraints", null, 1, 1, VSRSSoftwareOverview.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(vsrsAbstractRequirementSectionEClass, VSRSAbstractRequirementSection.class, "VSRSAbstractRequirementSection", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getVSRSAbstractRequirementSection_SectionDescription(), thedocPackage.getDBody(), null, "sectionDescription", null, 0, 1, VSRSAbstractRequirementSection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVSRSAbstractRequirementSection_SrsItems(), this.getVSRSDocumentItem(), null, "srsItems", null, 0, -1, VSRSAbstractRequirementSection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVSRSAbstractRequirementSection_SrsRequirementSubsections(), this.getVSRSInstantiableRequirementSection(), null, "srsRequirementSubsections", null, 0, -1, VSRSAbstractRequirementSection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(vsrsInstantiableRequirementSectionEClass, VSRSInstantiableRequirementSection.class, "VSRSInstantiableRequirementSection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getVSRSInstantiableRequirementSection_SectionDescription(), thedocPackage.getDBody(), null, "sectionDescription", null, 0, 1, VSRSInstantiableRequirementSection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVSRSInstantiableRequirementSection_SrsItems(), this.getVSRSDocumentItem(), null, "srsItems", null, 0, -1, VSRSInstantiableRequirementSection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(vsrsRequirementsEClass, VSRSRequirements.class, "VSRSRequirements", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getVSRSRequirements_SectionDescription(), thedocPackage.getDBody(), null, "sectionDescription", null, 0, 1, VSRSRequirements.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVSRSRequirements_General(), this.getVSRSGeneralRequirements(), null, "general", null, 1, 1, VSRSRequirements.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVSRSRequirements_Functional(), this.getVSRSFunctionalRequirements(), null, "functional", null, 1, 1, VSRSRequirements.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVSRSRequirements_Performance(), this.getVSRSPerformanceRequirements(), null, "performance", null, 1, 1, VSRSRequirements.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVSRSRequirements_Interface(), this.getVSRSInterfaceRequirements(), null, "interface", null, 1, 1, VSRSRequirements.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVSRSRequirements_Operational(), this.getVSRSOperationalRequirements(), null, "operational", null, 1, 1, VSRSRequirements.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVSRSRequirements_Resources(), this.getVSRSResourcesRequirements(), null, "resources", null, 1, 1, VSRSRequirements.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVSRSRequirements_Design(), this.getVSRSDesignRequirements(), null, "design", null, 1, 1, VSRSRequirements.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVSRSRequirements_SecurityPrivacy(), this.getVSRSSecurityPrivacyRequirements(), null, "securityPrivacy", null, 1, 1, VSRSRequirements.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVSRSRequirements_Portability(), this.getVSRSPortabilityRequirements(), null, "portability", null, 1, 1, VSRSRequirements.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVSRSRequirements_SwQuality(), this.getVSRSSWQualityRequirements(), null, "swQuality", null, 1, 1, VSRSRequirements.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVSRSRequirements_SwReliabilty(), this.getVSRSSWReliabiltyRequirements(), null, "swReliabilty", null, 1, 1, VSRSRequirements.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVSRSRequirements_SwMaintainability(), this.getVSRSSWMaintainabilityRequirements(), null, "swMaintainability", null, 1, 1, VSRSRequirements.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVSRSRequirements_SwSafety(), this.getVSRSSWSafetyRequirements(), null, "swSafety", null, 1, 1, VSRSRequirements.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVSRSRequirements_SwConfigurationDelivery(), this.getVSRSSWConfigurationDeliveryRequirements(), null, "swConfigurationDelivery", null, 1, 1, VSRSRequirements.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVSRSRequirements_DataDefinitionDB(), this.getVSRSDataDefinitionDBRequirements(), null, "dataDefinitionDB", null, 1, 1, VSRSRequirements.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVSRSRequirements_HumanFactors(), this.getVSRSHumanFactorsRequirements(), null, "humanFactors", null, 1, 1, VSRSRequirements.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVSRSRequirements_AdaptationInstallation(), this.getVSRSAdaptationInstallationRequirements(), null, "adaptationInstallation", null, 1, 1, VSRSRequirements.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(vsrsGeneralRequirementsEClass, VSRSGeneralRequirements.class, "VSRSGeneralRequirements", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(vsrsFunctionalRequirementsEClass, VSRSFunctionalRequirements.class, "VSRSFunctionalRequirements", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(vsrsPerformanceRequirementsEClass, VSRSPerformanceRequirements.class, "VSRSPerformanceRequirements", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(vsrsInterfaceRequirementsEClass, VSRSInterfaceRequirements.class, "VSRSInterfaceRequirements", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(vsrsOperationalRequirementsEClass, VSRSOperationalRequirements.class, "VSRSOperationalRequirements", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(vsrsResourcesRequirementsEClass, VSRSResourcesRequirements.class, "VSRSResourcesRequirements", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(vsrsDesignRequirementsEClass, VSRSDesignRequirements.class, "VSRSDesignRequirements", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(vsrsSecurityPrivacyRequirementsEClass, VSRSSecurityPrivacyRequirements.class, "VSRSSecurityPrivacyRequirements", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(vsrsPortabilityRequirementsEClass, VSRSPortabilityRequirements.class, "VSRSPortabilityRequirements", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(vsrsswQualityRequirementsEClass, VSRSSWQualityRequirements.class, "VSRSSWQualityRequirements", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(vsrsswReliabiltyRequirementsEClass, VSRSSWReliabiltyRequirements.class, "VSRSSWReliabiltyRequirements", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(vsrsswMaintainabilityRequirementsEClass, VSRSSWMaintainabilityRequirements.class, "VSRSSWMaintainabilityRequirements", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(vsrsswSafetyRequirementsEClass, VSRSSWSafetyRequirements.class, "VSRSSWSafetyRequirements", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(vsrsswConfigurationDeliveryRequirementsEClass, VSRSSWConfigurationDeliveryRequirements.class, "VSRSSWConfigurationDeliveryRequirements", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(vsrsDataDefinitionDBRequirementsEClass, VSRSDataDefinitionDBRequirements.class, "VSRSDataDefinitionDBRequirements", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(vsrsHumanFactorsRequirementsEClass, VSRSHumanFactorsRequirements.class, "VSRSHumanFactorsRequirements", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(vsrsAdaptationInstallationRequirementsEClass, VSRSAdaptationInstallationRequirements.class, "VSRSAdaptationInstallationRequirements", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(vsrsDocumentItemEClass, VSRSDocumentItem.class, "VSRSDocumentItem", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getVSRSDocumentItem_Description(), thedocPackage.getDBody(), null, "description", null, 0, 1, VSRSDocumentItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVSRSDocumentItem_ExtendedDescription(), thedocPackage.getDBody(), null, "extendedDescription", null, 0, 1, VSRSDocumentItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(vsrsTraceabiltyEClass, VSRSTraceabilty.class, "VSRSTraceabilty", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getVSRSTraceabilty_SectionDescription(), thedocPackage.getDBody(), null, "sectionDescription", null, 1, 1, VSRSTraceabilty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(vsrsLogicalModelsEClass, VSRSLogicalModels.class, "VSRSLogicalModels", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getVSRSLogicalModels_LogicalModels(), this.getVSRSLogicalModel(), null, "logicalModels", null, 0, -1, VSRSLogicalModels.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(vsrsLogicalModelEClass, VSRSLogicalModel.class, "VSRSLogicalModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //srsPackageImpl
