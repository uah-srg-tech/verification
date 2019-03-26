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
package es.uah.aut.srg.micobs.svm.sss.impl;

import es.uah.aut.srg.micobs.doctpl.doc.docPackage;

import es.uah.aut.srg.micobs.svm.sss.VSSSAbbreviation;
import es.uah.aut.srg.micobs.svm.sss.VSSSAdaptationMissionizationRequirement;
import es.uah.aut.srg.micobs.svm.sss.VSSSApplicableDocuments;
import es.uah.aut.srg.micobs.svm.sss.VSSSAssumptionsDependencies;
import es.uah.aut.srg.micobs.svm.sss.VSSSBriefDescription;
import es.uah.aut.srg.micobs.svm.sss.VSSSCapabilitiesRequirement;
import es.uah.aut.srg.micobs.svm.sss.VSSSComputerResourceRequirement;
import es.uah.aut.srg.micobs.svm.sss.VSSSDefinition;
import es.uah.aut.srg.micobs.svm.sss.VSSSDesignRequirement;
import es.uah.aut.srg.micobs.svm.sss.VSSSDocument;
import es.uah.aut.srg.micobs.svm.sss.VSSSDocumentItem;
import es.uah.aut.srg.micobs.svm.sss.VSSSGeneralCapabilites;
import es.uah.aut.srg.micobs.svm.sss.VSSSGeneralConstraints;
import es.uah.aut.srg.micobs.svm.sss.VSSSGeneralDescription;
import es.uah.aut.srg.micobs.svm.sss.VSSSGeneralRequirement;
import es.uah.aut.srg.micobs.svm.sss.VSSSIntroduction;
import es.uah.aut.srg.micobs.svm.sss.VSSSOperationalEnvironment;
import es.uah.aut.srg.micobs.svm.sss.VSSSProductPerspective;
import es.uah.aut.srg.micobs.svm.sss.VSSSQualityRequirement;
import es.uah.aut.srg.micobs.svm.sss.VSSSReferenceDocuments;
import es.uah.aut.srg.micobs.svm.sss.VSSSReliabiltyAvailabilityRequirement;
import es.uah.aut.srg.micobs.svm.sss.VSSSSafetyRequirement;
import es.uah.aut.srg.micobs.svm.sss.VSSSSecurityRequirement;
import es.uah.aut.srg.micobs.svm.sss.VSSSSoftwareMaintenanceRequirement;
import es.uah.aut.srg.micobs.svm.sss.VSSSSoftwareOperationsRequirement;
import es.uah.aut.srg.micobs.svm.sss.VSSSSpecificRequirements;
import es.uah.aut.srg.micobs.svm.sss.VSSSSystemInterfaceRequirement;
import es.uah.aut.srg.micobs.svm.sss.VSSSSystemModel;
import es.uah.aut.srg.micobs.svm.sss.VSSSSystemModels;
import es.uah.aut.srg.micobs.svm.sss.VSSSSystemSoftwareObservabilityRequirement;
import es.uah.aut.srg.micobs.svm.sss.VSSSTerm;
import es.uah.aut.srg.micobs.svm.sss.VSSSTermsDefinitionsAbbreviations;
import es.uah.aut.srg.micobs.svm.sss.VSSSValidationApproach;
import es.uah.aut.srg.micobs.svm.sss.VSSSValidationRequirement;
import es.uah.aut.srg.micobs.svm.sss.VSSSVerificationRequirement;
import es.uah.aut.srg.micobs.svm.sss.VSSSVerificationValidationIntegrationRequirements;
import es.uah.aut.srg.micobs.svm.sss.VSSSVerificationValidationProcessRequirement;
import es.uah.aut.srg.micobs.svm.sss.sssFactory;
import es.uah.aut.srg.micobs.svm.sss.sssPackage;

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
public class sssPackageImpl extends EPackageImpl implements sssPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass vsssDocumentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass vsssIntroductionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass vsssApplicableDocumentsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass vsssReferenceDocumentsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass vsssTermsDefinitionsAbbreviationsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass vsssBriefDescriptionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass vsssTermEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass vsssDefinitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass vsssAbbreviationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass vsssGeneralDescriptionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass vsssProductPerspectiveEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass vsssGeneralCapabilitesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass vsssGeneralConstraintsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass vsssOperationalEnvironmentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass vsssAssumptionsDependenciesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass vsssSpecificRequirementsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass vsssGeneralRequirementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass vsssCapabilitiesRequirementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass vsssSystemInterfaceRequirementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass vsssAdaptationMissionizationRequirementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass vsssComputerResourceRequirementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass vsssSecurityRequirementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass vsssSafetyRequirementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass vsssReliabiltyAvailabilityRequirementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass vsssQualityRequirementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass vsssDesignRequirementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass vsssSoftwareOperationsRequirementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass vsssSoftwareMaintenanceRequirementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass vsssSystemSoftwareObservabilityRequirementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass vsssVerificationValidationIntegrationRequirementsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass vsssVerificationValidationProcessRequirementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass vsssValidationApproachEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass vsssVerificationRequirementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass vsssValidationRequirementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass vsssDocumentItemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass vsssSystemModelsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass vsssSystemModelEClass = null;

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
	 * @see es.uah.aut.srg.micobs.svm.sss.sssPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private sssPackageImpl() {
		super(eNS_URI, sssFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link sssPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static sssPackage init() {
		if (isInited) return (sssPackage)EPackage.Registry.INSTANCE.getEPackage(sssPackage.eNS_URI);

		// Obtain or create and register package
		sssPackageImpl thesssPackage = (sssPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof sssPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new sssPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		docPackage.eINSTANCE.eClass();
		tdmPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		thesssPackage.createPackageContents();

		// Initialize created meta-data
		thesssPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		thesssPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(sssPackage.eNS_URI, thesssPackage);
		return thesssPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVSSSDocument() {
		return vsssDocumentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVSSSDocument_Introduction() {
		return (EReference)vsssDocumentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVSSSDocument_ApplicableDocumentsSection() {
		return (EReference)vsssDocumentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVSSSDocument_ReferenceDocumentsSection() {
		return (EReference)vsssDocumentEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVSSSDocument_TermsDefinitionsAbbreviations() {
		return (EReference)vsssDocumentEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVSSSDocument_GeneralDescription() {
		return (EReference)vsssDocumentEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVSSSDocument_SpecificRequirements() {
		return (EReference)vsssDocumentEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVSSSDocument_VerificationValidationIntegration() {
		return (EReference)vsssDocumentEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVSSSDocument_SystemModels() {
		return (EReference)vsssDocumentEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVSSSIntroduction() {
		return vsssIntroductionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVSSSIntroduction_Purpose() {
		return (EReference)vsssIntroductionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVSSSIntroduction_Objetive() {
		return (EReference)vsssIntroductionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVSSSIntroduction_Content() {
		return (EReference)vsssIntroductionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVSSSIntroduction_Reason() {
		return (EReference)vsssIntroductionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVSSSApplicableDocuments() {
		return vsssApplicableDocumentsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVSSSApplicableDocuments_ApplicableDocuments() {
		return (EReference)vsssApplicableDocumentsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVSSSReferenceDocuments() {
		return vsssReferenceDocumentsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVSSSReferenceDocuments_ReferenceDocuments() {
		return (EReference)vsssReferenceDocumentsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVSSSTermsDefinitionsAbbreviations() {
		return vsssTermsDefinitionsAbbreviationsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVSSSTermsDefinitionsAbbreviations_Terms() {
		return (EReference)vsssTermsDefinitionsAbbreviationsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVSSSTermsDefinitionsAbbreviations_Definitions() {
		return (EReference)vsssTermsDefinitionsAbbreviationsEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVSSSTermsDefinitionsAbbreviations_Abbreviations() {
		return (EReference)vsssTermsDefinitionsAbbreviationsEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVSSSBriefDescription() {
		return vsssBriefDescriptionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVSSSBriefDescription_Name() {
		return (EAttribute)vsssBriefDescriptionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVSSSBriefDescription_Description() {
		return (EReference)vsssBriefDescriptionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVSSSTerm() {
		return vsssTermEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVSSSDefinition() {
		return vsssDefinitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVSSSAbbreviation() {
		return vsssAbbreviationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVSSSGeneralDescription() {
		return vsssGeneralDescriptionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVSSSGeneralDescription_ProductPerspective() {
		return (EReference)vsssGeneralDescriptionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVSSSGeneralDescription_GeneralCapabilites() {
		return (EReference)vsssGeneralDescriptionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVSSSGeneralDescription_GeneralConstraints() {
		return (EReference)vsssGeneralDescriptionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVSSSGeneralDescription_OperationalEnvironment() {
		return (EReference)vsssGeneralDescriptionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVSSSGeneralDescription_AssumptionsDependencies() {
		return (EReference)vsssGeneralDescriptionEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVSSSProductPerspective() {
		return vsssProductPerspectiveEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVSSSGeneralCapabilites() {
		return vsssGeneralCapabilitesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVSSSGeneralConstraints() {
		return vsssGeneralConstraintsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVSSSOperationalEnvironment() {
		return vsssOperationalEnvironmentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVSSSAssumptionsDependencies() {
		return vsssAssumptionsDependenciesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVSSSSpecificRequirements() {
		return vsssSpecificRequirementsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVSSSSpecificRequirements_General() {
		return (EReference)vsssSpecificRequirementsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVSSSSpecificRequirements_Capabilities() {
		return (EReference)vsssSpecificRequirementsEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVSSSSpecificRequirements_SystemInterface() {
		return (EReference)vsssSpecificRequirementsEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVSSSSpecificRequirements_AdaptationMissionization() {
		return (EReference)vsssSpecificRequirementsEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVSSSSpecificRequirements_ComputerResource() {
		return (EReference)vsssSpecificRequirementsEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVSSSSpecificRequirements_Security() {
		return (EReference)vsssSpecificRequirementsEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVSSSSpecificRequirements_Safety() {
		return (EReference)vsssSpecificRequirementsEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVSSSSpecificRequirements_ReliabiltyAvailability() {
		return (EReference)vsssSpecificRequirementsEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVSSSSpecificRequirements_Quality() {
		return (EReference)vsssSpecificRequirementsEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVSSSSpecificRequirements_Design() {
		return (EReference)vsssSpecificRequirementsEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVSSSSpecificRequirements_SoftwareOperations() {
		return (EReference)vsssSpecificRequirementsEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVSSSSpecificRequirements_SoftwareMaintenance() {
		return (EReference)vsssSpecificRequirementsEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVSSSSpecificRequirements_SystemSoftwareObservability() {
		return (EReference)vsssSpecificRequirementsEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVSSSGeneralRequirement() {
		return vsssGeneralRequirementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVSSSGeneralRequirement_SssItems() {
		return (EReference)vsssGeneralRequirementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVSSSCapabilitiesRequirement() {
		return vsssCapabilitiesRequirementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVSSSCapabilitiesRequirement_SssItems() {
		return (EReference)vsssCapabilitiesRequirementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVSSSSystemInterfaceRequirement() {
		return vsssSystemInterfaceRequirementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVSSSSystemInterfaceRequirement_SssItems() {
		return (EReference)vsssSystemInterfaceRequirementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVSSSAdaptationMissionizationRequirement() {
		return vsssAdaptationMissionizationRequirementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVSSSAdaptationMissionizationRequirement_SssItems() {
		return (EReference)vsssAdaptationMissionizationRequirementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVSSSComputerResourceRequirement() {
		return vsssComputerResourceRequirementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVSSSComputerResourceRequirement_SssItems() {
		return (EReference)vsssComputerResourceRequirementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVSSSSecurityRequirement() {
		return vsssSecurityRequirementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVSSSSecurityRequirement_SssItems() {
		return (EReference)vsssSecurityRequirementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVSSSSafetyRequirement() {
		return vsssSafetyRequirementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVSSSSafetyRequirement_SssItems() {
		return (EReference)vsssSafetyRequirementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVSSSReliabiltyAvailabilityRequirement() {
		return vsssReliabiltyAvailabilityRequirementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVSSSReliabiltyAvailabilityRequirement_SssItems() {
		return (EReference)vsssReliabiltyAvailabilityRequirementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVSSSQualityRequirement() {
		return vsssQualityRequirementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVSSSQualityRequirement_SssItems() {
		return (EReference)vsssQualityRequirementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVSSSDesignRequirement() {
		return vsssDesignRequirementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVSSSDesignRequirement_SssItems() {
		return (EReference)vsssDesignRequirementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVSSSSoftwareOperationsRequirement() {
		return vsssSoftwareOperationsRequirementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVSSSSoftwareOperationsRequirement_SssItems() {
		return (EReference)vsssSoftwareOperationsRequirementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVSSSSoftwareMaintenanceRequirement() {
		return vsssSoftwareMaintenanceRequirementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVSSSSoftwareMaintenanceRequirement_SssItems() {
		return (EReference)vsssSoftwareMaintenanceRequirementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVSSSSystemSoftwareObservabilityRequirement() {
		return vsssSystemSoftwareObservabilityRequirementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVSSSSystemSoftwareObservabilityRequirement_SssItems() {
		return (EReference)vsssSystemSoftwareObservabilityRequirementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVSSSVerificationValidationIntegrationRequirements() {
		return vsssVerificationValidationIntegrationRequirementsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVSSSVerificationValidationIntegrationRequirements_VerificationValidationProcess() {
		return (EReference)vsssVerificationValidationIntegrationRequirementsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVSSSVerificationValidationIntegrationRequirements_ValidationApproach() {
		return (EReference)vsssVerificationValidationIntegrationRequirementsEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVSSSVerificationValidationIntegrationRequirements_Validation() {
		return (EReference)vsssVerificationValidationIntegrationRequirementsEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVSSSVerificationValidationIntegrationRequirements_Verification() {
		return (EReference)vsssVerificationValidationIntegrationRequirementsEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVSSSVerificationValidationProcessRequirement() {
		return vsssVerificationValidationProcessRequirementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVSSSVerificationValidationProcessRequirement_SssItems() {
		return (EReference)vsssVerificationValidationProcessRequirementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVSSSValidationApproach() {
		return vsssValidationApproachEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVSSSValidationApproach_SssItems() {
		return (EReference)vsssValidationApproachEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVSSSVerificationRequirement() {
		return vsssVerificationRequirementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVSSSVerificationRequirement_SssItems() {
		return (EReference)vsssVerificationRequirementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVSSSValidationRequirement() {
		return vsssValidationRequirementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVSSSValidationRequirement_SssItems() {
		return (EReference)vsssValidationRequirementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVSSSDocumentItem() {
		return vsssDocumentItemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVSSSSystemModels() {
		return vsssSystemModelsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVSSSSystemModels_SystemModels() {
		return (EReference)vsssSystemModelsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVSSSSystemModel() {
		return vsssSystemModelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public sssFactory getsssFactory() {
		return (sssFactory)getEFactoryInstance();
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
		vsssDocumentEClass = createEClass(VSSS_DOCUMENT);
		createEReference(vsssDocumentEClass, VSSS_DOCUMENT__INTRODUCTION);
		createEReference(vsssDocumentEClass, VSSS_DOCUMENT__APPLICABLE_DOCUMENTS_SECTION);
		createEReference(vsssDocumentEClass, VSSS_DOCUMENT__REFERENCE_DOCUMENTS_SECTION);
		createEReference(vsssDocumentEClass, VSSS_DOCUMENT__TERMS_DEFINITIONS_ABBREVIATIONS);
		createEReference(vsssDocumentEClass, VSSS_DOCUMENT__GENERAL_DESCRIPTION);
		createEReference(vsssDocumentEClass, VSSS_DOCUMENT__SPECIFIC_REQUIREMENTS);
		createEReference(vsssDocumentEClass, VSSS_DOCUMENT__VERIFICATION_VALIDATION_INTEGRATION);
		createEReference(vsssDocumentEClass, VSSS_DOCUMENT__SYSTEM_MODELS);

		vsssIntroductionEClass = createEClass(VSSS_INTRODUCTION);
		createEReference(vsssIntroductionEClass, VSSS_INTRODUCTION__PURPOSE);
		createEReference(vsssIntroductionEClass, VSSS_INTRODUCTION__OBJETIVE);
		createEReference(vsssIntroductionEClass, VSSS_INTRODUCTION__CONTENT);
		createEReference(vsssIntroductionEClass, VSSS_INTRODUCTION__REASON);

		vsssApplicableDocumentsEClass = createEClass(VSSS_APPLICABLE_DOCUMENTS);
		createEReference(vsssApplicableDocumentsEClass, VSSS_APPLICABLE_DOCUMENTS__APPLICABLE_DOCUMENTS);

		vsssReferenceDocumentsEClass = createEClass(VSSS_REFERENCE_DOCUMENTS);
		createEReference(vsssReferenceDocumentsEClass, VSSS_REFERENCE_DOCUMENTS__REFERENCE_DOCUMENTS);

		vsssTermsDefinitionsAbbreviationsEClass = createEClass(VSSS_TERMS_DEFINITIONS_ABBREVIATIONS);
		createEReference(vsssTermsDefinitionsAbbreviationsEClass, VSSS_TERMS_DEFINITIONS_ABBREVIATIONS__TERMS);
		createEReference(vsssTermsDefinitionsAbbreviationsEClass, VSSS_TERMS_DEFINITIONS_ABBREVIATIONS__DEFINITIONS);
		createEReference(vsssTermsDefinitionsAbbreviationsEClass, VSSS_TERMS_DEFINITIONS_ABBREVIATIONS__ABBREVIATIONS);

		vsssBriefDescriptionEClass = createEClass(VSSS_BRIEF_DESCRIPTION);
		createEAttribute(vsssBriefDescriptionEClass, VSSS_BRIEF_DESCRIPTION__NAME);
		createEReference(vsssBriefDescriptionEClass, VSSS_BRIEF_DESCRIPTION__DESCRIPTION);

		vsssTermEClass = createEClass(VSSS_TERM);

		vsssDefinitionEClass = createEClass(VSSS_DEFINITION);

		vsssAbbreviationEClass = createEClass(VSSS_ABBREVIATION);

		vsssGeneralDescriptionEClass = createEClass(VSSS_GENERAL_DESCRIPTION);
		createEReference(vsssGeneralDescriptionEClass, VSSS_GENERAL_DESCRIPTION__PRODUCT_PERSPECTIVE);
		createEReference(vsssGeneralDescriptionEClass, VSSS_GENERAL_DESCRIPTION__GENERAL_CAPABILITES);
		createEReference(vsssGeneralDescriptionEClass, VSSS_GENERAL_DESCRIPTION__GENERAL_CONSTRAINTS);
		createEReference(vsssGeneralDescriptionEClass, VSSS_GENERAL_DESCRIPTION__OPERATIONAL_ENVIRONMENT);
		createEReference(vsssGeneralDescriptionEClass, VSSS_GENERAL_DESCRIPTION__ASSUMPTIONS_DEPENDENCIES);

		vsssProductPerspectiveEClass = createEClass(VSSS_PRODUCT_PERSPECTIVE);

		vsssGeneralCapabilitesEClass = createEClass(VSSS_GENERAL_CAPABILITES);

		vsssGeneralConstraintsEClass = createEClass(VSSS_GENERAL_CONSTRAINTS);

		vsssOperationalEnvironmentEClass = createEClass(VSSS_OPERATIONAL_ENVIRONMENT);

		vsssAssumptionsDependenciesEClass = createEClass(VSSS_ASSUMPTIONS_DEPENDENCIES);

		vsssSpecificRequirementsEClass = createEClass(VSSS_SPECIFIC_REQUIREMENTS);
		createEReference(vsssSpecificRequirementsEClass, VSSS_SPECIFIC_REQUIREMENTS__GENERAL);
		createEReference(vsssSpecificRequirementsEClass, VSSS_SPECIFIC_REQUIREMENTS__CAPABILITIES);
		createEReference(vsssSpecificRequirementsEClass, VSSS_SPECIFIC_REQUIREMENTS__SYSTEM_INTERFACE);
		createEReference(vsssSpecificRequirementsEClass, VSSS_SPECIFIC_REQUIREMENTS__ADAPTATION_MISSIONIZATION);
		createEReference(vsssSpecificRequirementsEClass, VSSS_SPECIFIC_REQUIREMENTS__COMPUTER_RESOURCE);
		createEReference(vsssSpecificRequirementsEClass, VSSS_SPECIFIC_REQUIREMENTS__SECURITY);
		createEReference(vsssSpecificRequirementsEClass, VSSS_SPECIFIC_REQUIREMENTS__SAFETY);
		createEReference(vsssSpecificRequirementsEClass, VSSS_SPECIFIC_REQUIREMENTS__RELIABILTY_AVAILABILITY);
		createEReference(vsssSpecificRequirementsEClass, VSSS_SPECIFIC_REQUIREMENTS__QUALITY);
		createEReference(vsssSpecificRequirementsEClass, VSSS_SPECIFIC_REQUIREMENTS__DESIGN);
		createEReference(vsssSpecificRequirementsEClass, VSSS_SPECIFIC_REQUIREMENTS__SOFTWARE_OPERATIONS);
		createEReference(vsssSpecificRequirementsEClass, VSSS_SPECIFIC_REQUIREMENTS__SOFTWARE_MAINTENANCE);
		createEReference(vsssSpecificRequirementsEClass, VSSS_SPECIFIC_REQUIREMENTS__SYSTEM_SOFTWARE_OBSERVABILITY);

		vsssGeneralRequirementEClass = createEClass(VSSS_GENERAL_REQUIREMENT);
		createEReference(vsssGeneralRequirementEClass, VSSS_GENERAL_REQUIREMENT__SSS_ITEMS);

		vsssCapabilitiesRequirementEClass = createEClass(VSSS_CAPABILITIES_REQUIREMENT);
		createEReference(vsssCapabilitiesRequirementEClass, VSSS_CAPABILITIES_REQUIREMENT__SSS_ITEMS);

		vsssSystemInterfaceRequirementEClass = createEClass(VSSS_SYSTEM_INTERFACE_REQUIREMENT);
		createEReference(vsssSystemInterfaceRequirementEClass, VSSS_SYSTEM_INTERFACE_REQUIREMENT__SSS_ITEMS);

		vsssAdaptationMissionizationRequirementEClass = createEClass(VSSS_ADAPTATION_MISSIONIZATION_REQUIREMENT);
		createEReference(vsssAdaptationMissionizationRequirementEClass, VSSS_ADAPTATION_MISSIONIZATION_REQUIREMENT__SSS_ITEMS);

		vsssComputerResourceRequirementEClass = createEClass(VSSS_COMPUTER_RESOURCE_REQUIREMENT);
		createEReference(vsssComputerResourceRequirementEClass, VSSS_COMPUTER_RESOURCE_REQUIREMENT__SSS_ITEMS);

		vsssSecurityRequirementEClass = createEClass(VSSS_SECURITY_REQUIREMENT);
		createEReference(vsssSecurityRequirementEClass, VSSS_SECURITY_REQUIREMENT__SSS_ITEMS);

		vsssSafetyRequirementEClass = createEClass(VSSS_SAFETY_REQUIREMENT);
		createEReference(vsssSafetyRequirementEClass, VSSS_SAFETY_REQUIREMENT__SSS_ITEMS);

		vsssReliabiltyAvailabilityRequirementEClass = createEClass(VSSS_RELIABILTY_AVAILABILITY_REQUIREMENT);
		createEReference(vsssReliabiltyAvailabilityRequirementEClass, VSSS_RELIABILTY_AVAILABILITY_REQUIREMENT__SSS_ITEMS);

		vsssQualityRequirementEClass = createEClass(VSSS_QUALITY_REQUIREMENT);
		createEReference(vsssQualityRequirementEClass, VSSS_QUALITY_REQUIREMENT__SSS_ITEMS);

		vsssDesignRequirementEClass = createEClass(VSSS_DESIGN_REQUIREMENT);
		createEReference(vsssDesignRequirementEClass, VSSS_DESIGN_REQUIREMENT__SSS_ITEMS);

		vsssSoftwareOperationsRequirementEClass = createEClass(VSSS_SOFTWARE_OPERATIONS_REQUIREMENT);
		createEReference(vsssSoftwareOperationsRequirementEClass, VSSS_SOFTWARE_OPERATIONS_REQUIREMENT__SSS_ITEMS);

		vsssSoftwareMaintenanceRequirementEClass = createEClass(VSSS_SOFTWARE_MAINTENANCE_REQUIREMENT);
		createEReference(vsssSoftwareMaintenanceRequirementEClass, VSSS_SOFTWARE_MAINTENANCE_REQUIREMENT__SSS_ITEMS);

		vsssSystemSoftwareObservabilityRequirementEClass = createEClass(VSSS_SYSTEM_SOFTWARE_OBSERVABILITY_REQUIREMENT);
		createEReference(vsssSystemSoftwareObservabilityRequirementEClass, VSSS_SYSTEM_SOFTWARE_OBSERVABILITY_REQUIREMENT__SSS_ITEMS);

		vsssVerificationValidationIntegrationRequirementsEClass = createEClass(VSSS_VERIFICATION_VALIDATION_INTEGRATION_REQUIREMENTS);
		createEReference(vsssVerificationValidationIntegrationRequirementsEClass, VSSS_VERIFICATION_VALIDATION_INTEGRATION_REQUIREMENTS__VERIFICATION_VALIDATION_PROCESS);
		createEReference(vsssVerificationValidationIntegrationRequirementsEClass, VSSS_VERIFICATION_VALIDATION_INTEGRATION_REQUIREMENTS__VALIDATION_APPROACH);
		createEReference(vsssVerificationValidationIntegrationRequirementsEClass, VSSS_VERIFICATION_VALIDATION_INTEGRATION_REQUIREMENTS__VALIDATION);
		createEReference(vsssVerificationValidationIntegrationRequirementsEClass, VSSS_VERIFICATION_VALIDATION_INTEGRATION_REQUIREMENTS__VERIFICATION);

		vsssVerificationValidationProcessRequirementEClass = createEClass(VSSS_VERIFICATION_VALIDATION_PROCESS_REQUIREMENT);
		createEReference(vsssVerificationValidationProcessRequirementEClass, VSSS_VERIFICATION_VALIDATION_PROCESS_REQUIREMENT__SSS_ITEMS);

		vsssValidationApproachEClass = createEClass(VSSS_VALIDATION_APPROACH);
		createEReference(vsssValidationApproachEClass, VSSS_VALIDATION_APPROACH__SSS_ITEMS);

		vsssVerificationRequirementEClass = createEClass(VSSS_VERIFICATION_REQUIREMENT);
		createEReference(vsssVerificationRequirementEClass, VSSS_VERIFICATION_REQUIREMENT__SSS_ITEMS);

		vsssValidationRequirementEClass = createEClass(VSSS_VALIDATION_REQUIREMENT);
		createEReference(vsssValidationRequirementEClass, VSSS_VALIDATION_REQUIREMENT__SSS_ITEMS);

		vsssDocumentItemEClass = createEClass(VSSS_DOCUMENT_ITEM);

		vsssSystemModelsEClass = createEClass(VSSS_SYSTEM_MODELS);
		createEReference(vsssSystemModelsEClass, VSSS_SYSTEM_MODELS__SYSTEM_MODELS);

		vsssSystemModelEClass = createEClass(VSSS_SYSTEM_MODEL);
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
		docPackage thedocPackage = (docPackage)EPackage.Registry.INSTANCE.getEPackage(docPackage.eNS_URI);
		tdmPackage thetdmPackage = (tdmPackage)EPackage.Registry.INSTANCE.getEPackage(tdmPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		vsssDocumentEClass.getESuperTypes().add(thedocPackage.getDDocumentTemplate());
		vsssDocumentEClass.getESuperTypes().add(thetdmPackage.getVTraceableDocument());
		vsssIntroductionEClass.getESuperTypes().add(thedocPackage.getDFixedSection());
		vsssApplicableDocumentsEClass.getESuperTypes().add(thedocPackage.getDFixedSection());
		vsssReferenceDocumentsEClass.getESuperTypes().add(thedocPackage.getDFixedSection());
		vsssTermsDefinitionsAbbreviationsEClass.getESuperTypes().add(thedocPackage.getDFixedSection());
		vsssTermEClass.getESuperTypes().add(this.getVSSSBriefDescription());
		vsssDefinitionEClass.getESuperTypes().add(this.getVSSSBriefDescription());
		vsssAbbreviationEClass.getESuperTypes().add(this.getVSSSBriefDescription());
		vsssGeneralDescriptionEClass.getESuperTypes().add(thedocPackage.getDFixedSection());
		vsssProductPerspectiveEClass.getESuperTypes().add(thedocPackage.getDBody());
		vsssProductPerspectiveEClass.getESuperTypes().add(thedocPackage.getDFixedSection());
		vsssGeneralCapabilitesEClass.getESuperTypes().add(thedocPackage.getDBody());
		vsssGeneralCapabilitesEClass.getESuperTypes().add(thedocPackage.getDFixedSection());
		vsssGeneralConstraintsEClass.getESuperTypes().add(thedocPackage.getDBody());
		vsssGeneralConstraintsEClass.getESuperTypes().add(thedocPackage.getDFixedSection());
		vsssOperationalEnvironmentEClass.getESuperTypes().add(thedocPackage.getDBody());
		vsssOperationalEnvironmentEClass.getESuperTypes().add(thedocPackage.getDFixedSection());
		vsssAssumptionsDependenciesEClass.getESuperTypes().add(thedocPackage.getDBody());
		vsssAssumptionsDependenciesEClass.getESuperTypes().add(thedocPackage.getDFixedSection());
		vsssSpecificRequirementsEClass.getESuperTypes().add(thedocPackage.getDFixedSection());
		vsssGeneralRequirementEClass.getESuperTypes().add(thetdmPackage.getVTraceableDocumentFixedGroup());
		vsssGeneralRequirementEClass.getESuperTypes().add(thedocPackage.getDFixedSection());
		vsssCapabilitiesRequirementEClass.getESuperTypes().add(thetdmPackage.getVTraceableDocumentFixedGroup());
		vsssCapabilitiesRequirementEClass.getESuperTypes().add(thedocPackage.getDFixedSection());
		vsssSystemInterfaceRequirementEClass.getESuperTypes().add(thetdmPackage.getVTraceableDocumentFixedGroup());
		vsssSystemInterfaceRequirementEClass.getESuperTypes().add(thedocPackage.getDFixedSection());
		vsssAdaptationMissionizationRequirementEClass.getESuperTypes().add(thetdmPackage.getVTraceableDocumentFixedGroup());
		vsssAdaptationMissionizationRequirementEClass.getESuperTypes().add(thedocPackage.getDFixedSection());
		vsssComputerResourceRequirementEClass.getESuperTypes().add(thetdmPackage.getVTraceableDocumentFixedGroup());
		vsssComputerResourceRequirementEClass.getESuperTypes().add(thedocPackage.getDFixedSection());
		vsssSecurityRequirementEClass.getESuperTypes().add(thetdmPackage.getVTraceableDocumentFixedGroup());
		vsssSecurityRequirementEClass.getESuperTypes().add(thedocPackage.getDFixedSection());
		vsssSafetyRequirementEClass.getESuperTypes().add(thetdmPackage.getVTraceableDocumentFixedGroup());
		vsssSafetyRequirementEClass.getESuperTypes().add(thedocPackage.getDFixedSection());
		vsssReliabiltyAvailabilityRequirementEClass.getESuperTypes().add(thetdmPackage.getVTraceableDocumentFixedGroup());
		vsssReliabiltyAvailabilityRequirementEClass.getESuperTypes().add(thedocPackage.getDFixedSection());
		vsssQualityRequirementEClass.getESuperTypes().add(thetdmPackage.getVTraceableDocumentFixedGroup());
		vsssQualityRequirementEClass.getESuperTypes().add(thedocPackage.getDFixedSection());
		vsssDesignRequirementEClass.getESuperTypes().add(thetdmPackage.getVTraceableDocumentFixedGroup());
		vsssDesignRequirementEClass.getESuperTypes().add(thedocPackage.getDFixedSection());
		vsssSoftwareOperationsRequirementEClass.getESuperTypes().add(thetdmPackage.getVTraceableDocumentFixedGroup());
		vsssSoftwareOperationsRequirementEClass.getESuperTypes().add(thedocPackage.getDFixedSection());
		vsssSoftwareMaintenanceRequirementEClass.getESuperTypes().add(thetdmPackage.getVTraceableDocumentFixedGroup());
		vsssSoftwareMaintenanceRequirementEClass.getESuperTypes().add(thedocPackage.getDFixedSection());
		vsssSystemSoftwareObservabilityRequirementEClass.getESuperTypes().add(thetdmPackage.getVTraceableDocumentFixedGroup());
		vsssSystemSoftwareObservabilityRequirementEClass.getESuperTypes().add(thedocPackage.getDFixedSection());
		vsssVerificationValidationIntegrationRequirementsEClass.getESuperTypes().add(thedocPackage.getDFixedSection());
		vsssVerificationValidationProcessRequirementEClass.getESuperTypes().add(thetdmPackage.getVTraceableDocumentFixedGroup());
		vsssVerificationValidationProcessRequirementEClass.getESuperTypes().add(thedocPackage.getDFixedSection());
		vsssValidationApproachEClass.getESuperTypes().add(thetdmPackage.getVTraceableDocumentFixedGroup());
		vsssValidationApproachEClass.getESuperTypes().add(thedocPackage.getDFixedSection());
		vsssVerificationRequirementEClass.getESuperTypes().add(thetdmPackage.getVTraceableDocumentFixedGroup());
		vsssVerificationRequirementEClass.getESuperTypes().add(thedocPackage.getDFixedSection());
		vsssValidationRequirementEClass.getESuperTypes().add(thetdmPackage.getVTraceableDocumentFixedGroup());
		vsssValidationRequirementEClass.getESuperTypes().add(thedocPackage.getDFixedSection());
		vsssDocumentItemEClass.getESuperTypes().add(thetdmPackage.getVTraceableDocumentAbstractItem());
		vsssDocumentItemEClass.getESuperTypes().add(thedocPackage.getDBody());
		vsssSystemModelsEClass.getESuperTypes().add(thedocPackage.getDFixedSection());

		// Initialize classes, features, and operations; add parameters
		initEClass(vsssDocumentEClass, VSSSDocument.class, "VSSSDocument", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getVSSSDocument_Introduction(), this.getVSSSIntroduction(), null, "introduction", null, 1, 1, VSSSDocument.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVSSSDocument_ApplicableDocumentsSection(), this.getVSSSApplicableDocuments(), null, "applicableDocumentsSection", null, 1, 1, VSSSDocument.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVSSSDocument_ReferenceDocumentsSection(), this.getVSSSReferenceDocuments(), null, "referenceDocumentsSection", null, 1, 1, VSSSDocument.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVSSSDocument_TermsDefinitionsAbbreviations(), this.getVSSSTermsDefinitionsAbbreviations(), null, "termsDefinitionsAbbreviations", null, 1, 1, VSSSDocument.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVSSSDocument_GeneralDescription(), this.getVSSSGeneralDescription(), null, "generalDescription", null, 1, 1, VSSSDocument.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVSSSDocument_SpecificRequirements(), this.getVSSSSpecificRequirements(), null, "specificRequirements", null, 1, 1, VSSSDocument.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVSSSDocument_VerificationValidationIntegration(), this.getVSSSVerificationValidationIntegrationRequirements(), null, "verificationValidationIntegration", null, 1, 1, VSSSDocument.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVSSSDocument_SystemModels(), this.getVSSSSystemModels(), null, "systemModels", null, 0, 1, VSSSDocument.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(vsssIntroductionEClass, VSSSIntroduction.class, "VSSSIntroduction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getVSSSIntroduction_Purpose(), thedocPackage.getDBody(), null, "purpose", null, 1, 1, VSSSIntroduction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVSSSIntroduction_Objetive(), thedocPackage.getDBody(), null, "objetive", null, 1, 1, VSSSIntroduction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVSSSIntroduction_Content(), thedocPackage.getDBody(), null, "content", null, 1, 1, VSSSIntroduction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVSSSIntroduction_Reason(), thedocPackage.getDBody(), null, "reason", null, 1, 1, VSSSIntroduction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(vsssApplicableDocumentsEClass, VSSSApplicableDocuments.class, "VSSSApplicableDocuments", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getVSSSApplicableDocuments_ApplicableDocuments(), thedocPackage.getDApplicableDocument(), null, "applicableDocuments", null, 0, -1, VSSSApplicableDocuments.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(vsssReferenceDocumentsEClass, VSSSReferenceDocuments.class, "VSSSReferenceDocuments", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getVSSSReferenceDocuments_ReferenceDocuments(), thedocPackage.getDReferenceDocument(), null, "referenceDocuments", null, 0, -1, VSSSReferenceDocuments.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(vsssTermsDefinitionsAbbreviationsEClass, VSSSTermsDefinitionsAbbreviations.class, "VSSSTermsDefinitionsAbbreviations", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getVSSSTermsDefinitionsAbbreviations_Terms(), this.getVSSSTerm(), null, "terms", null, 0, -1, VSSSTermsDefinitionsAbbreviations.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVSSSTermsDefinitionsAbbreviations_Definitions(), this.getVSSSDefinition(), null, "definitions", null, 0, -1, VSSSTermsDefinitionsAbbreviations.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVSSSTermsDefinitionsAbbreviations_Abbreviations(), this.getVSSSAbbreviation(), null, "abbreviations", null, 0, -1, VSSSTermsDefinitionsAbbreviations.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(vsssBriefDescriptionEClass, VSSSBriefDescription.class, "VSSSBriefDescription", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getVSSSBriefDescription_Name(), ecorePackage.getEString(), "name", null, 1, 1, VSSSBriefDescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVSSSBriefDescription_Description(), thedocPackage.getDParagraph(), null, "description", null, 1, 1, VSSSBriefDescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(vsssTermEClass, VSSSTerm.class, "VSSSTerm", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(vsssDefinitionEClass, VSSSDefinition.class, "VSSSDefinition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(vsssAbbreviationEClass, VSSSAbbreviation.class, "VSSSAbbreviation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(vsssGeneralDescriptionEClass, VSSSGeneralDescription.class, "VSSSGeneralDescription", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getVSSSGeneralDescription_ProductPerspective(), this.getVSSSProductPerspective(), null, "productPerspective", null, 1, 1, VSSSGeneralDescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVSSSGeneralDescription_GeneralCapabilites(), this.getVSSSGeneralCapabilites(), null, "generalCapabilites", null, 1, 1, VSSSGeneralDescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVSSSGeneralDescription_GeneralConstraints(), this.getVSSSGeneralConstraints(), null, "generalConstraints", null, 1, 1, VSSSGeneralDescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVSSSGeneralDescription_OperationalEnvironment(), this.getVSSSOperationalEnvironment(), null, "operationalEnvironment", null, 1, 1, VSSSGeneralDescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVSSSGeneralDescription_AssumptionsDependencies(), this.getVSSSAssumptionsDependencies(), null, "assumptionsDependencies", null, 1, 1, VSSSGeneralDescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(vsssProductPerspectiveEClass, VSSSProductPerspective.class, "VSSSProductPerspective", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(vsssGeneralCapabilitesEClass, VSSSGeneralCapabilites.class, "VSSSGeneralCapabilites", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(vsssGeneralConstraintsEClass, VSSSGeneralConstraints.class, "VSSSGeneralConstraints", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(vsssOperationalEnvironmentEClass, VSSSOperationalEnvironment.class, "VSSSOperationalEnvironment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(vsssAssumptionsDependenciesEClass, VSSSAssumptionsDependencies.class, "VSSSAssumptionsDependencies", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(vsssSpecificRequirementsEClass, VSSSSpecificRequirements.class, "VSSSSpecificRequirements", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getVSSSSpecificRequirements_General(), this.getVSSSGeneralRequirement(), null, "general", null, 0, -1, VSSSSpecificRequirements.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVSSSSpecificRequirements_Capabilities(), this.getVSSSCapabilitiesRequirement(), null, "capabilities", null, 0, -1, VSSSSpecificRequirements.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVSSSSpecificRequirements_SystemInterface(), this.getVSSSSystemInterfaceRequirement(), null, "systemInterface", null, 0, -1, VSSSSpecificRequirements.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVSSSSpecificRequirements_AdaptationMissionization(), this.getVSSSAdaptationMissionizationRequirement(), null, "adaptationMissionization", null, 0, -1, VSSSSpecificRequirements.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVSSSSpecificRequirements_ComputerResource(), this.getVSSSComputerResourceRequirement(), null, "computerResource", null, 0, -1, VSSSSpecificRequirements.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVSSSSpecificRequirements_Security(), this.getVSSSSecurityRequirement(), null, "security", null, 0, -1, VSSSSpecificRequirements.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVSSSSpecificRequirements_Safety(), this.getVSSSSafetyRequirement(), null, "safety", null, 0, -1, VSSSSpecificRequirements.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVSSSSpecificRequirements_ReliabiltyAvailability(), this.getVSSSReliabiltyAvailabilityRequirement(), null, "reliabiltyAvailability", null, 0, -1, VSSSSpecificRequirements.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVSSSSpecificRequirements_Quality(), this.getVSSSQualityRequirement(), null, "quality", null, 0, -1, VSSSSpecificRequirements.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVSSSSpecificRequirements_Design(), this.getVSSSDesignRequirement(), null, "design", null, 0, -1, VSSSSpecificRequirements.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVSSSSpecificRequirements_SoftwareOperations(), this.getVSSSSoftwareOperationsRequirement(), null, "softwareOperations", null, 0, -1, VSSSSpecificRequirements.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVSSSSpecificRequirements_SoftwareMaintenance(), this.getVSSSSoftwareMaintenanceRequirement(), null, "softwareMaintenance", null, 0, -1, VSSSSpecificRequirements.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVSSSSpecificRequirements_SystemSoftwareObservability(), this.getVSSSSystemSoftwareObservabilityRequirement(), null, "systemSoftwareObservability", null, 0, -1, VSSSSpecificRequirements.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(vsssGeneralRequirementEClass, VSSSGeneralRequirement.class, "VSSSGeneralRequirement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getVSSSGeneralRequirement_SssItems(), this.getVSSSDocumentItem(), null, "sssItems", null, 1, -1, VSSSGeneralRequirement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(vsssCapabilitiesRequirementEClass, VSSSCapabilitiesRequirement.class, "VSSSCapabilitiesRequirement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getVSSSCapabilitiesRequirement_SssItems(), this.getVSSSDocumentItem(), null, "sssItems", null, 1, -1, VSSSCapabilitiesRequirement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(vsssSystemInterfaceRequirementEClass, VSSSSystemInterfaceRequirement.class, "VSSSSystemInterfaceRequirement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getVSSSSystemInterfaceRequirement_SssItems(), this.getVSSSDocumentItem(), null, "sssItems", null, 1, -1, VSSSSystemInterfaceRequirement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(vsssAdaptationMissionizationRequirementEClass, VSSSAdaptationMissionizationRequirement.class, "VSSSAdaptationMissionizationRequirement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getVSSSAdaptationMissionizationRequirement_SssItems(), this.getVSSSDocumentItem(), null, "sssItems", null, 1, -1, VSSSAdaptationMissionizationRequirement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(vsssComputerResourceRequirementEClass, VSSSComputerResourceRequirement.class, "VSSSComputerResourceRequirement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getVSSSComputerResourceRequirement_SssItems(), this.getVSSSDocumentItem(), null, "sssItems", null, 1, -1, VSSSComputerResourceRequirement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(vsssSecurityRequirementEClass, VSSSSecurityRequirement.class, "VSSSSecurityRequirement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getVSSSSecurityRequirement_SssItems(), this.getVSSSDocumentItem(), null, "sssItems", null, 1, -1, VSSSSecurityRequirement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(vsssSafetyRequirementEClass, VSSSSafetyRequirement.class, "VSSSSafetyRequirement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getVSSSSafetyRequirement_SssItems(), this.getVSSSDocumentItem(), null, "sssItems", null, 1, -1, VSSSSafetyRequirement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(vsssReliabiltyAvailabilityRequirementEClass, VSSSReliabiltyAvailabilityRequirement.class, "VSSSReliabiltyAvailabilityRequirement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getVSSSReliabiltyAvailabilityRequirement_SssItems(), this.getVSSSDocumentItem(), null, "sssItems", null, 1, -1, VSSSReliabiltyAvailabilityRequirement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(vsssQualityRequirementEClass, VSSSQualityRequirement.class, "VSSSQualityRequirement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getVSSSQualityRequirement_SssItems(), this.getVSSSDocumentItem(), null, "sssItems", null, 1, -1, VSSSQualityRequirement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(vsssDesignRequirementEClass, VSSSDesignRequirement.class, "VSSSDesignRequirement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getVSSSDesignRequirement_SssItems(), this.getVSSSDocumentItem(), null, "sssItems", null, 1, -1, VSSSDesignRequirement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(vsssSoftwareOperationsRequirementEClass, VSSSSoftwareOperationsRequirement.class, "VSSSSoftwareOperationsRequirement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getVSSSSoftwareOperationsRequirement_SssItems(), this.getVSSSDocumentItem(), null, "sssItems", null, 1, -1, VSSSSoftwareOperationsRequirement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(vsssSoftwareMaintenanceRequirementEClass, VSSSSoftwareMaintenanceRequirement.class, "VSSSSoftwareMaintenanceRequirement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getVSSSSoftwareMaintenanceRequirement_SssItems(), this.getVSSSDocumentItem(), null, "sssItems", null, 1, -1, VSSSSoftwareMaintenanceRequirement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(vsssSystemSoftwareObservabilityRequirementEClass, VSSSSystemSoftwareObservabilityRequirement.class, "VSSSSystemSoftwareObservabilityRequirement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getVSSSSystemSoftwareObservabilityRequirement_SssItems(), this.getVSSSDocumentItem(), null, "sssItems", null, 1, -1, VSSSSystemSoftwareObservabilityRequirement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(vsssVerificationValidationIntegrationRequirementsEClass, VSSSVerificationValidationIntegrationRequirements.class, "VSSSVerificationValidationIntegrationRequirements", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getVSSSVerificationValidationIntegrationRequirements_VerificationValidationProcess(), this.getVSSSVerificationValidationProcessRequirement(), null, "verificationValidationProcess", null, 0, -1, VSSSVerificationValidationIntegrationRequirements.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVSSSVerificationValidationIntegrationRequirements_ValidationApproach(), this.getVSSSValidationApproach(), null, "validationApproach", null, 0, -1, VSSSVerificationValidationIntegrationRequirements.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVSSSVerificationValidationIntegrationRequirements_Validation(), this.getVSSSValidationRequirement(), null, "validation", null, 0, -1, VSSSVerificationValidationIntegrationRequirements.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVSSSVerificationValidationIntegrationRequirements_Verification(), this.getVSSSVerificationRequirement(), null, "verification", null, 0, -1, VSSSVerificationValidationIntegrationRequirements.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(vsssVerificationValidationProcessRequirementEClass, VSSSVerificationValidationProcessRequirement.class, "VSSSVerificationValidationProcessRequirement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getVSSSVerificationValidationProcessRequirement_SssItems(), this.getVSSSDocumentItem(), null, "sssItems", null, 1, -1, VSSSVerificationValidationProcessRequirement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(vsssValidationApproachEClass, VSSSValidationApproach.class, "VSSSValidationApproach", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getVSSSValidationApproach_SssItems(), this.getVSSSDocumentItem(), null, "sssItems", null, 1, -1, VSSSValidationApproach.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(vsssVerificationRequirementEClass, VSSSVerificationRequirement.class, "VSSSVerificationRequirement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getVSSSVerificationRequirement_SssItems(), this.getVSSSDocumentItem(), null, "sssItems", null, 1, -1, VSSSVerificationRequirement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(vsssValidationRequirementEClass, VSSSValidationRequirement.class, "VSSSValidationRequirement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getVSSSValidationRequirement_SssItems(), this.getVSSSDocumentItem(), null, "sssItems", null, 1, -1, VSSSValidationRequirement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(vsssDocumentItemEClass, VSSSDocumentItem.class, "VSSSDocumentItem", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(vsssSystemModelsEClass, VSSSSystemModels.class, "VSSSSystemModels", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getVSSSSystemModels_SystemModels(), this.getVSSSSystemModel(), null, "systemModels", null, 1, -1, VSSSSystemModels.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(vsssSystemModelEClass, VSSSSystemModel.class, "VSSSSystemModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //sssPackageImpl
