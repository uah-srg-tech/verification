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

import es.uah.aut.srg.micobs.svm.sss.VSSSAdaptationMissionizationRequirement;
import es.uah.aut.srg.micobs.svm.sss.VSSSApplicableDocument;
import es.uah.aut.srg.micobs.svm.sss.VSSSApplicableDocuments;
import es.uah.aut.srg.micobs.svm.sss.VSSSCapabilitiesRequirement;
import es.uah.aut.srg.micobs.svm.sss.VSSSComputerResourceRequirement;
import es.uah.aut.srg.micobs.svm.sss.VSSSDesignRequirement;
import es.uah.aut.srg.micobs.svm.sss.VSSSGeneralDescription;
import es.uah.aut.srg.micobs.svm.sss.VSSSGeneralRequirement;
import es.uah.aut.srg.micobs.svm.sss.VSSSIntroduction;
import es.uah.aut.srg.micobs.svm.sss.VSSSQualityRequirement;
import es.uah.aut.srg.micobs.svm.sss.VSSSReferenceDocument;
import es.uah.aut.srg.micobs.svm.sss.VSSSReferenceDocuments;
import es.uah.aut.srg.micobs.svm.sss.VSSSReliabiltyAvailabilityRequirement;
import es.uah.aut.srg.micobs.svm.sss.VSSSSafetyRequirement;
import es.uah.aut.srg.micobs.svm.sss.VSSSSecurityRequirement;
import es.uah.aut.srg.micobs.svm.sss.VSSSSoftwareMaintenanceRequirement;
import es.uah.aut.srg.micobs.svm.sss.VSSSSoftwareOperationsRequirement;
import es.uah.aut.srg.micobs.svm.sss.VSSSSpecificRequirements;
import es.uah.aut.srg.micobs.svm.sss.VSSSSystemInterfaceRequirement;
import es.uah.aut.srg.micobs.svm.sss.VSSSSystemModels;
import es.uah.aut.srg.micobs.svm.sss.VSSSSystemSoftwareObservabilityRequirement;
import es.uah.aut.srg.micobs.svm.sss.VSSSTermsDefinitionsAbbreviations;
import es.uah.aut.srg.micobs.svm.sss.VSSSValidationApproach;
import es.uah.aut.srg.micobs.svm.sss.VSSSValidationRequirement;
import es.uah.aut.srg.micobs.svm.sss.VSSSVerificationRequirement;
import es.uah.aut.srg.micobs.svm.sss.VSSSVerificationValidationIntegration;
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
	private EClass vsssApplicableDocumentEClass = null;

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
	private EClass vsssReferenceDocumentEClass = null;

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
	private EClass vsssGeneralDescriptionEClass = null;

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
	private EClass vsssVerificationValidationIntegrationEClass = null;

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
	private EClass vsssSystemModelsEClass = null;

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
	public EClass getVSSSIntroduction() {
		return vsssIntroductionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVSSSIntroduction_Purpose() {
		return (EAttribute)vsssIntroductionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVSSSIntroduction_Objetive() {
		return (EAttribute)vsssIntroductionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVSSSIntroduction_Content() {
		return (EAttribute)vsssIntroductionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVSSSIntroduction_Reason() {
		return (EAttribute)vsssIntroductionEClass.getEStructuralFeatures().get(3);
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
	public EReference getVSSSApplicableDocuments_ApplicableDocument() {
		return (EReference)vsssApplicableDocumentsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVSSSApplicableDocument() {
		return vsssApplicableDocumentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVSSSApplicableDocument_Id() {
		return (EAttribute)vsssApplicableDocumentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVSSSApplicableDocument_Name() {
		return (EAttribute)vsssApplicableDocumentEClass.getEStructuralFeatures().get(1);
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
	public EClass getVSSSReferenceDocument() {
		return vsssReferenceDocumentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVSSSReferenceDocument_Id() {
		return (EAttribute)vsssReferenceDocumentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVSSSReferenceDocument_Name() {
		return (EAttribute)vsssReferenceDocumentEClass.getEStructuralFeatures().get(1);
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
	public EAttribute getVSSSTermsDefinitionsAbbreviations_Term() {
		return (EAttribute)vsssTermsDefinitionsAbbreviationsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVSSSTermsDefinitionsAbbreviations_Definition() {
		return (EAttribute)vsssTermsDefinitionsAbbreviationsEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVSSSTermsDefinitionsAbbreviations_Abbreviation() {
		return (EAttribute)vsssTermsDefinitionsAbbreviationsEClass.getEStructuralFeatures().get(2);
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
	public EAttribute getVSSSGeneralDescription_ProductPerspective() {
		return (EAttribute)vsssGeneralDescriptionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVSSSGeneralDescription_GeneralCapabilites() {
		return (EAttribute)vsssGeneralDescriptionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVSSSGeneralDescription_GeneralConstraints() {
		return (EAttribute)vsssGeneralDescriptionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVSSSGeneralDescription_OperationalEnvironment() {
		return (EAttribute)vsssGeneralDescriptionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVSSSGeneralDescription_AssumptionsDependencies() {
		return (EAttribute)vsssGeneralDescriptionEClass.getEStructuralFeatures().get(4);
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
	public EClass getVSSSCapabilitiesRequirement() {
		return vsssCapabilitiesRequirementEClass;
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
	public EClass getVSSSAdaptationMissionizationRequirement() {
		return vsssAdaptationMissionizationRequirementEClass;
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
	public EClass getVSSSSecurityRequirement() {
		return vsssSecurityRequirementEClass;
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
	public EClass getVSSSReliabiltyAvailabilityRequirement() {
		return vsssReliabiltyAvailabilityRequirementEClass;
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
	public EClass getVSSSDesignRequirement() {
		return vsssDesignRequirementEClass;
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
	public EClass getVSSSSoftwareMaintenanceRequirement() {
		return vsssSoftwareMaintenanceRequirementEClass;
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
	public EClass getVSSSVerificationValidationIntegration() {
		return vsssVerificationValidationIntegrationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVSSSVerificationValidationIntegration_VerificationValidationProcess() {
		return (EReference)vsssVerificationValidationIntegrationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVSSSVerificationValidationIntegration_ValidationApproach() {
		return (EReference)vsssVerificationValidationIntegrationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVSSSVerificationValidationIntegration_Validation() {
		return (EReference)vsssVerificationValidationIntegrationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVSSSVerificationValidationIntegration_Verification() {
		return (EReference)vsssVerificationValidationIntegrationEClass.getEStructuralFeatures().get(3);
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
	public EClass getVSSSValidationApproach() {
		return vsssValidationApproachEClass;
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
	public EClass getVSSSValidationRequirement() {
		return vsssValidationRequirementEClass;
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
	public EAttribute getVSSSSystemModels_SystemModel() {
		return (EAttribute)vsssSystemModelsEClass.getEStructuralFeatures().get(0);
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
		vsssIntroductionEClass = createEClass(VSSS_INTRODUCTION);
		createEAttribute(vsssIntroductionEClass, VSSS_INTRODUCTION__PURPOSE);
		createEAttribute(vsssIntroductionEClass, VSSS_INTRODUCTION__OBJETIVE);
		createEAttribute(vsssIntroductionEClass, VSSS_INTRODUCTION__CONTENT);
		createEAttribute(vsssIntroductionEClass, VSSS_INTRODUCTION__REASON);

		vsssApplicableDocumentsEClass = createEClass(VSSS_APPLICABLE_DOCUMENTS);
		createEReference(vsssApplicableDocumentsEClass, VSSS_APPLICABLE_DOCUMENTS__APPLICABLE_DOCUMENT);

		vsssApplicableDocumentEClass = createEClass(VSSS_APPLICABLE_DOCUMENT);
		createEAttribute(vsssApplicableDocumentEClass, VSSS_APPLICABLE_DOCUMENT__ID);
		createEAttribute(vsssApplicableDocumentEClass, VSSS_APPLICABLE_DOCUMENT__NAME);

		vsssReferenceDocumentsEClass = createEClass(VSSS_REFERENCE_DOCUMENTS);
		createEReference(vsssReferenceDocumentsEClass, VSSS_REFERENCE_DOCUMENTS__REFERENCE_DOCUMENTS);

		vsssReferenceDocumentEClass = createEClass(VSSS_REFERENCE_DOCUMENT);
		createEAttribute(vsssReferenceDocumentEClass, VSSS_REFERENCE_DOCUMENT__ID);
		createEAttribute(vsssReferenceDocumentEClass, VSSS_REFERENCE_DOCUMENT__NAME);

		vsssTermsDefinitionsAbbreviationsEClass = createEClass(VSSS_TERMS_DEFINITIONS_ABBREVIATIONS);
		createEAttribute(vsssTermsDefinitionsAbbreviationsEClass, VSSS_TERMS_DEFINITIONS_ABBREVIATIONS__TERM);
		createEAttribute(vsssTermsDefinitionsAbbreviationsEClass, VSSS_TERMS_DEFINITIONS_ABBREVIATIONS__DEFINITION);
		createEAttribute(vsssTermsDefinitionsAbbreviationsEClass, VSSS_TERMS_DEFINITIONS_ABBREVIATIONS__ABBREVIATION);

		vsssGeneralDescriptionEClass = createEClass(VSSS_GENERAL_DESCRIPTION);
		createEAttribute(vsssGeneralDescriptionEClass, VSSS_GENERAL_DESCRIPTION__PRODUCT_PERSPECTIVE);
		createEAttribute(vsssGeneralDescriptionEClass, VSSS_GENERAL_DESCRIPTION__GENERAL_CAPABILITES);
		createEAttribute(vsssGeneralDescriptionEClass, VSSS_GENERAL_DESCRIPTION__GENERAL_CONSTRAINTS);
		createEAttribute(vsssGeneralDescriptionEClass, VSSS_GENERAL_DESCRIPTION__OPERATIONAL_ENVIRONMENT);
		createEAttribute(vsssGeneralDescriptionEClass, VSSS_GENERAL_DESCRIPTION__ASSUMPTIONS_DEPENDENCIES);

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

		vsssCapabilitiesRequirementEClass = createEClass(VSSS_CAPABILITIES_REQUIREMENT);

		vsssSystemInterfaceRequirementEClass = createEClass(VSSS_SYSTEM_INTERFACE_REQUIREMENT);

		vsssAdaptationMissionizationRequirementEClass = createEClass(VSSS_ADAPTATION_MISSIONIZATION_REQUIREMENT);

		vsssComputerResourceRequirementEClass = createEClass(VSSS_COMPUTER_RESOURCE_REQUIREMENT);

		vsssSecurityRequirementEClass = createEClass(VSSS_SECURITY_REQUIREMENT);

		vsssSafetyRequirementEClass = createEClass(VSSS_SAFETY_REQUIREMENT);

		vsssReliabiltyAvailabilityRequirementEClass = createEClass(VSSS_RELIABILTY_AVAILABILITY_REQUIREMENT);

		vsssQualityRequirementEClass = createEClass(VSSS_QUALITY_REQUIREMENT);

		vsssDesignRequirementEClass = createEClass(VSSS_DESIGN_REQUIREMENT);

		vsssSoftwareOperationsRequirementEClass = createEClass(VSSS_SOFTWARE_OPERATIONS_REQUIREMENT);

		vsssSoftwareMaintenanceRequirementEClass = createEClass(VSSS_SOFTWARE_MAINTENANCE_REQUIREMENT);

		vsssSystemSoftwareObservabilityRequirementEClass = createEClass(VSSS_SYSTEM_SOFTWARE_OBSERVABILITY_REQUIREMENT);

		vsssVerificationValidationIntegrationEClass = createEClass(VSSS_VERIFICATION_VALIDATION_INTEGRATION);
		createEReference(vsssVerificationValidationIntegrationEClass, VSSS_VERIFICATION_VALIDATION_INTEGRATION__VERIFICATION_VALIDATION_PROCESS);
		createEReference(vsssVerificationValidationIntegrationEClass, VSSS_VERIFICATION_VALIDATION_INTEGRATION__VALIDATION_APPROACH);
		createEReference(vsssVerificationValidationIntegrationEClass, VSSS_VERIFICATION_VALIDATION_INTEGRATION__VALIDATION);
		createEReference(vsssVerificationValidationIntegrationEClass, VSSS_VERIFICATION_VALIDATION_INTEGRATION__VERIFICATION);

		vsssVerificationValidationProcessRequirementEClass = createEClass(VSSS_VERIFICATION_VALIDATION_PROCESS_REQUIREMENT);

		vsssValidationApproachEClass = createEClass(VSSS_VALIDATION_APPROACH);

		vsssVerificationRequirementEClass = createEClass(VSSS_VERIFICATION_REQUIREMENT);

		vsssValidationRequirementEClass = createEClass(VSSS_VALIDATION_REQUIREMENT);

		vsssSystemModelsEClass = createEClass(VSSS_SYSTEM_MODELS);
		createEAttribute(vsssSystemModelsEClass, VSSS_SYSTEM_MODELS__SYSTEM_MODEL);
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

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		vsssSpecificRequirementsEClass.getESuperTypes().add(thetdmPackage.getVTraceableDocumentFixedSection());
		vsssGeneralRequirementEClass.getESuperTypes().add(thetdmPackage.getVTraceableDocumentFixedGroup());
		vsssCapabilitiesRequirementEClass.getESuperTypes().add(thetdmPackage.getVTraceableDocumentFixedGroup());
		vsssSystemInterfaceRequirementEClass.getESuperTypes().add(thetdmPackage.getVTraceableDocumentFixedGroup());
		vsssAdaptationMissionizationRequirementEClass.getESuperTypes().add(thetdmPackage.getVTraceableDocumentFixedGroup());
		vsssComputerResourceRequirementEClass.getESuperTypes().add(thetdmPackage.getVTraceableDocumentFixedGroup());
		vsssSecurityRequirementEClass.getESuperTypes().add(thetdmPackage.getVTraceableDocumentFixedGroup());
		vsssSafetyRequirementEClass.getESuperTypes().add(thetdmPackage.getVTraceableDocumentFixedGroup());
		vsssReliabiltyAvailabilityRequirementEClass.getESuperTypes().add(thetdmPackage.getVTraceableDocumentFixedGroup());
		vsssQualityRequirementEClass.getESuperTypes().add(thetdmPackage.getVTraceableDocumentFixedGroup());
		vsssDesignRequirementEClass.getESuperTypes().add(thetdmPackage.getVTraceableDocumentFixedGroup());
		vsssSoftwareOperationsRequirementEClass.getESuperTypes().add(thetdmPackage.getVTraceableDocumentFixedGroup());
		vsssSoftwareMaintenanceRequirementEClass.getESuperTypes().add(thetdmPackage.getVTraceableDocumentFixedGroup());
		vsssSystemSoftwareObservabilityRequirementEClass.getESuperTypes().add(thetdmPackage.getVTraceableDocumentFixedGroup());
		vsssVerificationValidationIntegrationEClass.getESuperTypes().add(thetdmPackage.getVTraceableDocumentFixedSection());
		vsssVerificationValidationProcessRequirementEClass.getESuperTypes().add(thetdmPackage.getVTraceableDocumentFixedGroup());
		vsssValidationApproachEClass.getESuperTypes().add(thetdmPackage.getVTraceableDocumentFixedGroup());
		vsssVerificationRequirementEClass.getESuperTypes().add(thetdmPackage.getVTraceableDocumentFixedGroup());
		vsssValidationRequirementEClass.getESuperTypes().add(thetdmPackage.getVTraceableDocumentFixedGroup());

		// Initialize classes, features, and operations; add parameters
		initEClass(vsssIntroductionEClass, VSSSIntroduction.class, "VSSSIntroduction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getVSSSIntroduction_Purpose(), ecorePackage.getEString(), "purpose", null, 1, 1, VSSSIntroduction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVSSSIntroduction_Objetive(), ecorePackage.getEString(), "objetive", null, 1, 1, VSSSIntroduction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVSSSIntroduction_Content(), ecorePackage.getEString(), "content", null, 1, 1, VSSSIntroduction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVSSSIntroduction_Reason(), ecorePackage.getEString(), "reason", null, 1, 1, VSSSIntroduction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(vsssApplicableDocumentsEClass, VSSSApplicableDocuments.class, "VSSSApplicableDocuments", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getVSSSApplicableDocuments_ApplicableDocument(), this.getVSSSApplicableDocument(), null, "applicableDocument", null, 0, -1, VSSSApplicableDocuments.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(vsssApplicableDocumentEClass, VSSSApplicableDocument.class, "VSSSApplicableDocument", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getVSSSApplicableDocument_Id(), ecorePackage.getEString(), "id", null, 1, 1, VSSSApplicableDocument.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVSSSApplicableDocument_Name(), ecorePackage.getEString(), "name", null, 1, 1, VSSSApplicableDocument.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(vsssReferenceDocumentsEClass, VSSSReferenceDocuments.class, "VSSSReferenceDocuments", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getVSSSReferenceDocuments_ReferenceDocuments(), this.getVSSSReferenceDocument(), null, "referenceDocuments", null, 0, -1, VSSSReferenceDocuments.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(vsssReferenceDocumentEClass, VSSSReferenceDocument.class, "VSSSReferenceDocument", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getVSSSReferenceDocument_Id(), ecorePackage.getEString(), "id", null, 1, 1, VSSSReferenceDocument.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVSSSReferenceDocument_Name(), ecorePackage.getEString(), "name", null, 1, 1, VSSSReferenceDocument.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(vsssTermsDefinitionsAbbreviationsEClass, VSSSTermsDefinitionsAbbreviations.class, "VSSSTermsDefinitionsAbbreviations", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getVSSSTermsDefinitionsAbbreviations_Term(), ecorePackage.getEString(), "term", null, 0, -1, VSSSTermsDefinitionsAbbreviations.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVSSSTermsDefinitionsAbbreviations_Definition(), ecorePackage.getEString(), "definition", null, 0, -1, VSSSTermsDefinitionsAbbreviations.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVSSSTermsDefinitionsAbbreviations_Abbreviation(), ecorePackage.getEString(), "abbreviation", null, 0, -1, VSSSTermsDefinitionsAbbreviations.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(vsssGeneralDescriptionEClass, VSSSGeneralDescription.class, "VSSSGeneralDescription", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getVSSSGeneralDescription_ProductPerspective(), ecorePackage.getEString(), "productPerspective", null, 1, 1, VSSSGeneralDescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVSSSGeneralDescription_GeneralCapabilites(), ecorePackage.getEString(), "generalCapabilites", null, 0, -1, VSSSGeneralDescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVSSSGeneralDescription_GeneralConstraints(), ecorePackage.getEString(), "generalConstraints", null, 0, -1, VSSSGeneralDescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVSSSGeneralDescription_OperationalEnvironment(), ecorePackage.getEString(), "operationalEnvironment", null, 0, -1, VSSSGeneralDescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVSSSGeneralDescription_AssumptionsDependencies(), ecorePackage.getEString(), "assumptionsDependencies", null, 0, -1, VSSSGeneralDescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(vsssSpecificRequirementsEClass, VSSSSpecificRequirements.class, "VSSSSpecificRequirements", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getVSSSSpecificRequirements_General(), this.getVSSSGeneralDescription(), null, "general", null, 0, -1, VSSSSpecificRequirements.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
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

		initEClass(vsssCapabilitiesRequirementEClass, VSSSCapabilitiesRequirement.class, "VSSSCapabilitiesRequirement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(vsssSystemInterfaceRequirementEClass, VSSSSystemInterfaceRequirement.class, "VSSSSystemInterfaceRequirement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(vsssAdaptationMissionizationRequirementEClass, VSSSAdaptationMissionizationRequirement.class, "VSSSAdaptationMissionizationRequirement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(vsssComputerResourceRequirementEClass, VSSSComputerResourceRequirement.class, "VSSSComputerResourceRequirement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(vsssSecurityRequirementEClass, VSSSSecurityRequirement.class, "VSSSSecurityRequirement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(vsssSafetyRequirementEClass, VSSSSafetyRequirement.class, "VSSSSafetyRequirement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(vsssReliabiltyAvailabilityRequirementEClass, VSSSReliabiltyAvailabilityRequirement.class, "VSSSReliabiltyAvailabilityRequirement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(vsssQualityRequirementEClass, VSSSQualityRequirement.class, "VSSSQualityRequirement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(vsssDesignRequirementEClass, VSSSDesignRequirement.class, "VSSSDesignRequirement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(vsssSoftwareOperationsRequirementEClass, VSSSSoftwareOperationsRequirement.class, "VSSSSoftwareOperationsRequirement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(vsssSoftwareMaintenanceRequirementEClass, VSSSSoftwareMaintenanceRequirement.class, "VSSSSoftwareMaintenanceRequirement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(vsssSystemSoftwareObservabilityRequirementEClass, VSSSSystemSoftwareObservabilityRequirement.class, "VSSSSystemSoftwareObservabilityRequirement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(vsssVerificationValidationIntegrationEClass, VSSSVerificationValidationIntegration.class, "VSSSVerificationValidationIntegration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getVSSSVerificationValidationIntegration_VerificationValidationProcess(), this.getVSSSVerificationValidationProcessRequirement(), null, "verificationValidationProcess", null, 0, -1, VSSSVerificationValidationIntegration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVSSSVerificationValidationIntegration_ValidationApproach(), this.getVSSSValidationApproach(), null, "validationApproach", null, 0, -1, VSSSVerificationValidationIntegration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVSSSVerificationValidationIntegration_Validation(), this.getVSSSValidationRequirement(), null, "validation", null, 0, -1, VSSSVerificationValidationIntegration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVSSSVerificationValidationIntegration_Verification(), this.getVSSSVerificationRequirement(), null, "verification", null, 0, -1, VSSSVerificationValidationIntegration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(vsssVerificationValidationProcessRequirementEClass, VSSSVerificationValidationProcessRequirement.class, "VSSSVerificationValidationProcessRequirement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(vsssValidationApproachEClass, VSSSValidationApproach.class, "VSSSValidationApproach", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(vsssVerificationRequirementEClass, VSSSVerificationRequirement.class, "VSSSVerificationRequirement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(vsssValidationRequirementEClass, VSSSValidationRequirement.class, "VSSSValidationRequirement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(vsssSystemModelsEClass, VSSSSystemModels.class, "VSSSSystemModels", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getVSSSSystemModels_SystemModel(), ecorePackage.getEString(), "systemModel", null, 0, -1, VSSSSystemModels.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //sssPackageImpl
