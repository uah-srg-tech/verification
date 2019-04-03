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
import es.uah.aut.srg.micobs.svm.sss.VSSSAdaptationMissionizationRequirements;
import es.uah.aut.srg.micobs.svm.sss.VSSSApplicableDocuments;
import es.uah.aut.srg.micobs.svm.sss.VSSSBriefDescription;
import es.uah.aut.srg.micobs.svm.sss.VSSSCapabilitiesRequirements;
import es.uah.aut.srg.micobs.svm.sss.VSSSComputerResourceRequirements;
import es.uah.aut.srg.micobs.svm.sss.VSSSDefinition;
import es.uah.aut.srg.micobs.svm.sss.VSSSDesignRequirements;
import es.uah.aut.srg.micobs.svm.sss.VSSSDocument;
import es.uah.aut.srg.micobs.svm.sss.VSSSDocumentItem;
import es.uah.aut.srg.micobs.svm.sss.VSSSGeneralDescription;
import es.uah.aut.srg.micobs.svm.sss.VSSSGeneralDescriptionSubsection;
import es.uah.aut.srg.micobs.svm.sss.VSSSGeneralRequirements;
import es.uah.aut.srg.micobs.svm.sss.VSSSIntroduction;
import es.uah.aut.srg.micobs.svm.sss.VSSSQualityRequirements;
import es.uah.aut.srg.micobs.svm.sss.VSSSReferenceDocuments;
import es.uah.aut.srg.micobs.svm.sss.VSSSReliabiltyAvailabilityRequirements;
import es.uah.aut.srg.micobs.svm.sss.VSSSSafetyRequirements;
import es.uah.aut.srg.micobs.svm.sss.VSSSSecurityRequirements;
import es.uah.aut.srg.micobs.svm.sss.VSSSSoftwareMaintenanceRequirements;
import es.uah.aut.srg.micobs.svm.sss.VSSSSoftwareOperationsRequirements;
import es.uah.aut.srg.micobs.svm.sss.VSSSSpecificRequirements;
import es.uah.aut.srg.micobs.svm.sss.VSSSSystemInterfaceRequirements;
import es.uah.aut.srg.micobs.svm.sss.VSSSSystemModel;
import es.uah.aut.srg.micobs.svm.sss.VSSSSystemModels;
import es.uah.aut.srg.micobs.svm.sss.VSSSSystemSoftwareObservabilityRequirements;
import es.uah.aut.srg.micobs.svm.sss.VSSSTerm;
import es.uah.aut.srg.micobs.svm.sss.VSSSTermsDefinitionsAbbreviations;
import es.uah.aut.srg.micobs.svm.sss.VSSSValidationApproach;
import es.uah.aut.srg.micobs.svm.sss.VSSSValidationRequirements;
import es.uah.aut.srg.micobs.svm.sss.VSSSVerificationRequirements;
import es.uah.aut.srg.micobs.svm.sss.VSSSVerificationValidationIntegrationRequirements;
import es.uah.aut.srg.micobs.svm.sss.VSSSVerificationValidationProcessRequirements;
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
	private EClass vsssGeneralDescriptionSubsectionEClass = null;

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
	private EClass vsssGeneralRequirementsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass vsssCapabilitiesRequirementsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass vsssSystemInterfaceRequirementsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass vsssAdaptationMissionizationRequirementsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass vsssComputerResourceRequirementsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass vsssSecurityRequirementsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass vsssSafetyRequirementsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass vsssReliabiltyAvailabilityRequirementsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass vsssQualityRequirementsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass vsssDesignRequirementsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass vsssSoftwareOperationsRequirementsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass vsssSoftwareMaintenanceRequirementsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass vsssSystemSoftwareObservabilityRequirementsEClass = null;

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
	private EClass vsssVerificationValidationProcessRequirementsEClass = null;

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
	private EClass vsssVerificationRequirementsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass vsssValidationRequirementsEClass = null;

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
	public EReference getVSSSDocument_IntroductionSection() {
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
	public EReference getVSSSDocument_TermsDefinitionsAbbreviationsSection() {
		return (EReference)vsssDocumentEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVSSSDocument_GeneralDescriptionSection() {
		return (EReference)vsssDocumentEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVSSSDocument_SpecificRequirementsSection() {
		return (EReference)vsssDocumentEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVSSSDocument_VerificationValidationIntegrationSection() {
		return (EReference)vsssDocumentEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVSSSDocument_SystemModelsSection() {
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
	public EReference getVSSSIntroduction_Objective() {
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
	public EReference getVSSSGeneralDescription_GeneralCapabilities() {
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
	public EClass getVSSSGeneralDescriptionSubsection() {
		return vsssGeneralDescriptionSubsectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVSSSGeneralDescriptionSubsection_Body() {
		return (EReference)vsssGeneralDescriptionSubsectionEClass.getEStructuralFeatures().get(0);
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
	public EClass getVSSSGeneralRequirements() {
		return vsssGeneralRequirementsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVSSSGeneralRequirements_SssItems() {
		return (EReference)vsssGeneralRequirementsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVSSSCapabilitiesRequirements() {
		return vsssCapabilitiesRequirementsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVSSSCapabilitiesRequirements_SssItems() {
		return (EReference)vsssCapabilitiesRequirementsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVSSSSystemInterfaceRequirements() {
		return vsssSystemInterfaceRequirementsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVSSSSystemInterfaceRequirements_SssItems() {
		return (EReference)vsssSystemInterfaceRequirementsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVSSSAdaptationMissionizationRequirements() {
		return vsssAdaptationMissionizationRequirementsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVSSSAdaptationMissionizationRequirements_SssItems() {
		return (EReference)vsssAdaptationMissionizationRequirementsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVSSSComputerResourceRequirements() {
		return vsssComputerResourceRequirementsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVSSSComputerResourceRequirements_SssItems() {
		return (EReference)vsssComputerResourceRequirementsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVSSSSecurityRequirements() {
		return vsssSecurityRequirementsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVSSSSecurityRequirements_SssItems() {
		return (EReference)vsssSecurityRequirementsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVSSSSafetyRequirements() {
		return vsssSafetyRequirementsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVSSSSafetyRequirements_SssItems() {
		return (EReference)vsssSafetyRequirementsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVSSSReliabiltyAvailabilityRequirements() {
		return vsssReliabiltyAvailabilityRequirementsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVSSSReliabiltyAvailabilityRequirements_SssItems() {
		return (EReference)vsssReliabiltyAvailabilityRequirementsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVSSSQualityRequirements() {
		return vsssQualityRequirementsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVSSSQualityRequirements_SssItems() {
		return (EReference)vsssQualityRequirementsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVSSSDesignRequirements() {
		return vsssDesignRequirementsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVSSSDesignRequirements_SssItems() {
		return (EReference)vsssDesignRequirementsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVSSSSoftwareOperationsRequirements() {
		return vsssSoftwareOperationsRequirementsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVSSSSoftwareOperationsRequirements_SssItems() {
		return (EReference)vsssSoftwareOperationsRequirementsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVSSSSoftwareMaintenanceRequirements() {
		return vsssSoftwareMaintenanceRequirementsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVSSSSoftwareMaintenanceRequirements_SssItems() {
		return (EReference)vsssSoftwareMaintenanceRequirementsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVSSSSystemSoftwareObservabilityRequirements() {
		return vsssSystemSoftwareObservabilityRequirementsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVSSSSystemSoftwareObservabilityRequirements_SssItems() {
		return (EReference)vsssSystemSoftwareObservabilityRequirementsEClass.getEStructuralFeatures().get(0);
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
	public EClass getVSSSVerificationValidationProcessRequirements() {
		return vsssVerificationValidationProcessRequirementsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVSSSVerificationValidationProcessRequirements_SssItems() {
		return (EReference)vsssVerificationValidationProcessRequirementsEClass.getEStructuralFeatures().get(0);
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
	public EClass getVSSSVerificationRequirements() {
		return vsssVerificationRequirementsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVSSSVerificationRequirements_SssItems() {
		return (EReference)vsssVerificationRequirementsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVSSSValidationRequirements() {
		return vsssValidationRequirementsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVSSSValidationRequirements_SssItems() {
		return (EReference)vsssValidationRequirementsEClass.getEStructuralFeatures().get(0);
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
	public EReference getVSSSDocumentItem_Body() {
		return (EReference)vsssDocumentItemEClass.getEStructuralFeatures().get(0);
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
		createEReference(vsssDocumentEClass, VSSS_DOCUMENT__INTRODUCTION_SECTION);
		createEReference(vsssDocumentEClass, VSSS_DOCUMENT__APPLICABLE_DOCUMENTS_SECTION);
		createEReference(vsssDocumentEClass, VSSS_DOCUMENT__REFERENCE_DOCUMENTS_SECTION);
		createEReference(vsssDocumentEClass, VSSS_DOCUMENT__TERMS_DEFINITIONS_ABBREVIATIONS_SECTION);
		createEReference(vsssDocumentEClass, VSSS_DOCUMENT__GENERAL_DESCRIPTION_SECTION);
		createEReference(vsssDocumentEClass, VSSS_DOCUMENT__SPECIFIC_REQUIREMENTS_SECTION);
		createEReference(vsssDocumentEClass, VSSS_DOCUMENT__VERIFICATION_VALIDATION_INTEGRATION_SECTION);
		createEReference(vsssDocumentEClass, VSSS_DOCUMENT__SYSTEM_MODELS_SECTION);

		vsssIntroductionEClass = createEClass(VSSS_INTRODUCTION);
		createEReference(vsssIntroductionEClass, VSSS_INTRODUCTION__PURPOSE);
		createEReference(vsssIntroductionEClass, VSSS_INTRODUCTION__OBJECTIVE);
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
		createEReference(vsssGeneralDescriptionEClass, VSSS_GENERAL_DESCRIPTION__GENERAL_CAPABILITIES);
		createEReference(vsssGeneralDescriptionEClass, VSSS_GENERAL_DESCRIPTION__GENERAL_CONSTRAINTS);
		createEReference(vsssGeneralDescriptionEClass, VSSS_GENERAL_DESCRIPTION__OPERATIONAL_ENVIRONMENT);
		createEReference(vsssGeneralDescriptionEClass, VSSS_GENERAL_DESCRIPTION__ASSUMPTIONS_DEPENDENCIES);

		vsssGeneralDescriptionSubsectionEClass = createEClass(VSSS_GENERAL_DESCRIPTION_SUBSECTION);
		createEReference(vsssGeneralDescriptionSubsectionEClass, VSSS_GENERAL_DESCRIPTION_SUBSECTION__BODY);

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

		vsssGeneralRequirementsEClass = createEClass(VSSS_GENERAL_REQUIREMENTS);
		createEReference(vsssGeneralRequirementsEClass, VSSS_GENERAL_REQUIREMENTS__SSS_ITEMS);

		vsssCapabilitiesRequirementsEClass = createEClass(VSSS_CAPABILITIES_REQUIREMENTS);
		createEReference(vsssCapabilitiesRequirementsEClass, VSSS_CAPABILITIES_REQUIREMENTS__SSS_ITEMS);

		vsssSystemInterfaceRequirementsEClass = createEClass(VSSS_SYSTEM_INTERFACE_REQUIREMENTS);
		createEReference(vsssSystemInterfaceRequirementsEClass, VSSS_SYSTEM_INTERFACE_REQUIREMENTS__SSS_ITEMS);

		vsssAdaptationMissionizationRequirementsEClass = createEClass(VSSS_ADAPTATION_MISSIONIZATION_REQUIREMENTS);
		createEReference(vsssAdaptationMissionizationRequirementsEClass, VSSS_ADAPTATION_MISSIONIZATION_REQUIREMENTS__SSS_ITEMS);

		vsssComputerResourceRequirementsEClass = createEClass(VSSS_COMPUTER_RESOURCE_REQUIREMENTS);
		createEReference(vsssComputerResourceRequirementsEClass, VSSS_COMPUTER_RESOURCE_REQUIREMENTS__SSS_ITEMS);

		vsssSecurityRequirementsEClass = createEClass(VSSS_SECURITY_REQUIREMENTS);
		createEReference(vsssSecurityRequirementsEClass, VSSS_SECURITY_REQUIREMENTS__SSS_ITEMS);

		vsssSafetyRequirementsEClass = createEClass(VSSS_SAFETY_REQUIREMENTS);
		createEReference(vsssSafetyRequirementsEClass, VSSS_SAFETY_REQUIREMENTS__SSS_ITEMS);

		vsssReliabiltyAvailabilityRequirementsEClass = createEClass(VSSS_RELIABILTY_AVAILABILITY_REQUIREMENTS);
		createEReference(vsssReliabiltyAvailabilityRequirementsEClass, VSSS_RELIABILTY_AVAILABILITY_REQUIREMENTS__SSS_ITEMS);

		vsssQualityRequirementsEClass = createEClass(VSSS_QUALITY_REQUIREMENTS);
		createEReference(vsssQualityRequirementsEClass, VSSS_QUALITY_REQUIREMENTS__SSS_ITEMS);

		vsssDesignRequirementsEClass = createEClass(VSSS_DESIGN_REQUIREMENTS);
		createEReference(vsssDesignRequirementsEClass, VSSS_DESIGN_REQUIREMENTS__SSS_ITEMS);

		vsssSoftwareOperationsRequirementsEClass = createEClass(VSSS_SOFTWARE_OPERATIONS_REQUIREMENTS);
		createEReference(vsssSoftwareOperationsRequirementsEClass, VSSS_SOFTWARE_OPERATIONS_REQUIREMENTS__SSS_ITEMS);

		vsssSoftwareMaintenanceRequirementsEClass = createEClass(VSSS_SOFTWARE_MAINTENANCE_REQUIREMENTS);
		createEReference(vsssSoftwareMaintenanceRequirementsEClass, VSSS_SOFTWARE_MAINTENANCE_REQUIREMENTS__SSS_ITEMS);

		vsssSystemSoftwareObservabilityRequirementsEClass = createEClass(VSSS_SYSTEM_SOFTWARE_OBSERVABILITY_REQUIREMENTS);
		createEReference(vsssSystemSoftwareObservabilityRequirementsEClass, VSSS_SYSTEM_SOFTWARE_OBSERVABILITY_REQUIREMENTS__SSS_ITEMS);

		vsssVerificationValidationIntegrationRequirementsEClass = createEClass(VSSS_VERIFICATION_VALIDATION_INTEGRATION_REQUIREMENTS);
		createEReference(vsssVerificationValidationIntegrationRequirementsEClass, VSSS_VERIFICATION_VALIDATION_INTEGRATION_REQUIREMENTS__VERIFICATION_VALIDATION_PROCESS);
		createEReference(vsssVerificationValidationIntegrationRequirementsEClass, VSSS_VERIFICATION_VALIDATION_INTEGRATION_REQUIREMENTS__VALIDATION_APPROACH);
		createEReference(vsssVerificationValidationIntegrationRequirementsEClass, VSSS_VERIFICATION_VALIDATION_INTEGRATION_REQUIREMENTS__VALIDATION);
		createEReference(vsssVerificationValidationIntegrationRequirementsEClass, VSSS_VERIFICATION_VALIDATION_INTEGRATION_REQUIREMENTS__VERIFICATION);

		vsssVerificationValidationProcessRequirementsEClass = createEClass(VSSS_VERIFICATION_VALIDATION_PROCESS_REQUIREMENTS);
		createEReference(vsssVerificationValidationProcessRequirementsEClass, VSSS_VERIFICATION_VALIDATION_PROCESS_REQUIREMENTS__SSS_ITEMS);

		vsssValidationApproachEClass = createEClass(VSSS_VALIDATION_APPROACH);
		createEReference(vsssValidationApproachEClass, VSSS_VALIDATION_APPROACH__SSS_ITEMS);

		vsssVerificationRequirementsEClass = createEClass(VSSS_VERIFICATION_REQUIREMENTS);
		createEReference(vsssVerificationRequirementsEClass, VSSS_VERIFICATION_REQUIREMENTS__SSS_ITEMS);

		vsssValidationRequirementsEClass = createEClass(VSSS_VALIDATION_REQUIREMENTS);
		createEReference(vsssValidationRequirementsEClass, VSSS_VALIDATION_REQUIREMENTS__SSS_ITEMS);

		vsssDocumentItemEClass = createEClass(VSSS_DOCUMENT_ITEM);
		createEReference(vsssDocumentItemEClass, VSSS_DOCUMENT_ITEM__BODY);

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
		tdmPackage thetdmPackage = (tdmPackage)EPackage.Registry.INSTANCE.getEPackage(tdmPackage.eNS_URI);
		docPackage thedocPackage = (docPackage)EPackage.Registry.INSTANCE.getEPackage(docPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		vsssDocumentEClass.getESuperTypes().add(thetdmPackage.getVTraceableDocument());
		vsssDocumentEClass.getESuperTypes().add(thedocPackage.getDDocumentTemplate());
		vsssIntroductionEClass.getESuperTypes().add(thedocPackage.getDFixedSection());
		vsssApplicableDocumentsEClass.getESuperTypes().add(thedocPackage.getDFixedSection());
		vsssReferenceDocumentsEClass.getESuperTypes().add(thedocPackage.getDFixedSection());
		vsssTermsDefinitionsAbbreviationsEClass.getESuperTypes().add(thedocPackage.getDFixedSection());
		vsssTermEClass.getESuperTypes().add(this.getVSSSBriefDescription());
		vsssDefinitionEClass.getESuperTypes().add(this.getVSSSBriefDescription());
		vsssAbbreviationEClass.getESuperTypes().add(this.getVSSSBriefDescription());
		vsssGeneralDescriptionEClass.getESuperTypes().add(thedocPackage.getDFixedSection());
		vsssGeneralDescriptionSubsectionEClass.getESuperTypes().add(thedocPackage.getDFixedSection());
		vsssSpecificRequirementsEClass.getESuperTypes().add(thedocPackage.getDFixedSection());
		vsssGeneralRequirementsEClass.getESuperTypes().add(thetdmPackage.getVTraceableDocumentFixedGroup());
		vsssGeneralRequirementsEClass.getESuperTypes().add(thedocPackage.getDFixedSection());
		vsssCapabilitiesRequirementsEClass.getESuperTypes().add(thetdmPackage.getVTraceableDocumentFixedGroup());
		vsssCapabilitiesRequirementsEClass.getESuperTypes().add(thedocPackage.getDFixedSection());
		vsssSystemInterfaceRequirementsEClass.getESuperTypes().add(thetdmPackage.getVTraceableDocumentFixedGroup());
		vsssSystemInterfaceRequirementsEClass.getESuperTypes().add(thedocPackage.getDFixedSection());
		vsssAdaptationMissionizationRequirementsEClass.getESuperTypes().add(thetdmPackage.getVTraceableDocumentFixedGroup());
		vsssAdaptationMissionizationRequirementsEClass.getESuperTypes().add(thedocPackage.getDFixedSection());
		vsssComputerResourceRequirementsEClass.getESuperTypes().add(thetdmPackage.getVTraceableDocumentFixedGroup());
		vsssComputerResourceRequirementsEClass.getESuperTypes().add(thedocPackage.getDFixedSection());
		vsssSecurityRequirementsEClass.getESuperTypes().add(thetdmPackage.getVTraceableDocumentFixedGroup());
		vsssSecurityRequirementsEClass.getESuperTypes().add(thedocPackage.getDFixedSection());
		vsssSafetyRequirementsEClass.getESuperTypes().add(thetdmPackage.getVTraceableDocumentFixedGroup());
		vsssSafetyRequirementsEClass.getESuperTypes().add(thedocPackage.getDFixedSection());
		vsssReliabiltyAvailabilityRequirementsEClass.getESuperTypes().add(thetdmPackage.getVTraceableDocumentFixedGroup());
		vsssReliabiltyAvailabilityRequirementsEClass.getESuperTypes().add(thedocPackage.getDFixedSection());
		vsssQualityRequirementsEClass.getESuperTypes().add(thetdmPackage.getVTraceableDocumentFixedGroup());
		vsssQualityRequirementsEClass.getESuperTypes().add(thedocPackage.getDFixedSection());
		vsssDesignRequirementsEClass.getESuperTypes().add(thetdmPackage.getVTraceableDocumentFixedGroup());
		vsssDesignRequirementsEClass.getESuperTypes().add(thedocPackage.getDFixedSection());
		vsssSoftwareOperationsRequirementsEClass.getESuperTypes().add(thetdmPackage.getVTraceableDocumentFixedGroup());
		vsssSoftwareOperationsRequirementsEClass.getESuperTypes().add(thedocPackage.getDFixedSection());
		vsssSoftwareMaintenanceRequirementsEClass.getESuperTypes().add(thetdmPackage.getVTraceableDocumentFixedGroup());
		vsssSoftwareMaintenanceRequirementsEClass.getESuperTypes().add(thedocPackage.getDFixedSection());
		vsssSystemSoftwareObservabilityRequirementsEClass.getESuperTypes().add(thetdmPackage.getVTraceableDocumentFixedGroup());
		vsssSystemSoftwareObservabilityRequirementsEClass.getESuperTypes().add(thedocPackage.getDFixedSection());
		vsssVerificationValidationIntegrationRequirementsEClass.getESuperTypes().add(thedocPackage.getDFixedSection());
		vsssVerificationValidationProcessRequirementsEClass.getESuperTypes().add(thetdmPackage.getVTraceableDocumentFixedGroup());
		vsssVerificationValidationProcessRequirementsEClass.getESuperTypes().add(thedocPackage.getDFixedSection());
		vsssValidationApproachEClass.getESuperTypes().add(thetdmPackage.getVTraceableDocumentFixedGroup());
		vsssValidationApproachEClass.getESuperTypes().add(thedocPackage.getDFixedSection());
		vsssVerificationRequirementsEClass.getESuperTypes().add(thetdmPackage.getVTraceableDocumentFixedGroup());
		vsssVerificationRequirementsEClass.getESuperTypes().add(thedocPackage.getDFixedSection());
		vsssValidationRequirementsEClass.getESuperTypes().add(thetdmPackage.getVTraceableDocumentFixedGroup());
		vsssValidationRequirementsEClass.getESuperTypes().add(thedocPackage.getDFixedSection());
		vsssDocumentItemEClass.getESuperTypes().add(thetdmPackage.getVTraceableDocumentAbstractItem());
		vsssSystemModelsEClass.getESuperTypes().add(thedocPackage.getDFixedSection());

		// Initialize classes, features, and operations; add parameters
		initEClass(vsssDocumentEClass, VSSSDocument.class, "VSSSDocument", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getVSSSDocument_IntroductionSection(), this.getVSSSIntroduction(), null, "introductionSection", null, 1, 1, VSSSDocument.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVSSSDocument_ApplicableDocumentsSection(), this.getVSSSApplicableDocuments(), null, "applicableDocumentsSection", null, 1, 1, VSSSDocument.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVSSSDocument_ReferenceDocumentsSection(), this.getVSSSReferenceDocuments(), null, "referenceDocumentsSection", null, 1, 1, VSSSDocument.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVSSSDocument_TermsDefinitionsAbbreviationsSection(), this.getVSSSTermsDefinitionsAbbreviations(), null, "termsDefinitionsAbbreviationsSection", null, 1, 1, VSSSDocument.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVSSSDocument_GeneralDescriptionSection(), this.getVSSSGeneralDescription(), null, "generalDescriptionSection", null, 1, 1, VSSSDocument.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVSSSDocument_SpecificRequirementsSection(), this.getVSSSSpecificRequirements(), null, "specificRequirementsSection", null, 1, 1, VSSSDocument.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVSSSDocument_VerificationValidationIntegrationSection(), this.getVSSSVerificationValidationIntegrationRequirements(), null, "verificationValidationIntegrationSection", null, 1, 1, VSSSDocument.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVSSSDocument_SystemModelsSection(), this.getVSSSSystemModels(), null, "systemModelsSection", null, 1, 1, VSSSDocument.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(vsssIntroductionEClass, VSSSIntroduction.class, "VSSSIntroduction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getVSSSIntroduction_Purpose(), thedocPackage.getDBody(), null, "purpose", null, 1, 1, VSSSIntroduction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVSSSIntroduction_Objective(), thedocPackage.getDBody(), null, "objective", null, 1, 1, VSSSIntroduction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
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
		initEReference(getVSSSBriefDescription_Description(), thedocPackage.getDRun(), null, "description", null, 1, 1, VSSSBriefDescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(vsssTermEClass, VSSSTerm.class, "VSSSTerm", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(vsssDefinitionEClass, VSSSDefinition.class, "VSSSDefinition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(vsssAbbreviationEClass, VSSSAbbreviation.class, "VSSSAbbreviation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(vsssGeneralDescriptionEClass, VSSSGeneralDescription.class, "VSSSGeneralDescription", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getVSSSGeneralDescription_ProductPerspective(), this.getVSSSGeneralDescriptionSubsection(), null, "productPerspective", null, 1, 1, VSSSGeneralDescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVSSSGeneralDescription_GeneralCapabilities(), this.getVSSSGeneralDescriptionSubsection(), null, "generalCapabilities", null, 1, 1, VSSSGeneralDescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVSSSGeneralDescription_GeneralConstraints(), this.getVSSSGeneralDescriptionSubsection(), null, "generalConstraints", null, 1, 1, VSSSGeneralDescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVSSSGeneralDescription_OperationalEnvironment(), this.getVSSSGeneralDescriptionSubsection(), null, "operationalEnvironment", null, 1, 1, VSSSGeneralDescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVSSSGeneralDescription_AssumptionsDependencies(), this.getVSSSGeneralDescriptionSubsection(), null, "assumptionsDependencies", null, 1, 1, VSSSGeneralDescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(vsssGeneralDescriptionSubsectionEClass, VSSSGeneralDescriptionSubsection.class, "VSSSGeneralDescriptionSubsection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getVSSSGeneralDescriptionSubsection_Body(), thedocPackage.getDBody(), null, "body", null, 1, 1, VSSSGeneralDescriptionSubsection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(vsssSpecificRequirementsEClass, VSSSSpecificRequirements.class, "VSSSSpecificRequirements", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getVSSSSpecificRequirements_General(), this.getVSSSGeneralRequirements(), null, "general", null, 1, 1, VSSSSpecificRequirements.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVSSSSpecificRequirements_Capabilities(), this.getVSSSCapabilitiesRequirements(), null, "capabilities", null, 1, 1, VSSSSpecificRequirements.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVSSSSpecificRequirements_SystemInterface(), this.getVSSSSystemInterfaceRequirements(), null, "systemInterface", null, 1, 1, VSSSSpecificRequirements.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVSSSSpecificRequirements_AdaptationMissionization(), this.getVSSSAdaptationMissionizationRequirements(), null, "adaptationMissionization", null, 1, 1, VSSSSpecificRequirements.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVSSSSpecificRequirements_ComputerResource(), this.getVSSSComputerResourceRequirements(), null, "computerResource", null, 1, 1, VSSSSpecificRequirements.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVSSSSpecificRequirements_Security(), this.getVSSSSecurityRequirements(), null, "security", null, 1, 1, VSSSSpecificRequirements.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVSSSSpecificRequirements_Safety(), this.getVSSSSafetyRequirements(), null, "safety", null, 1, 1, VSSSSpecificRequirements.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVSSSSpecificRequirements_ReliabiltyAvailability(), this.getVSSSReliabiltyAvailabilityRequirements(), null, "reliabiltyAvailability", null, 1, 1, VSSSSpecificRequirements.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVSSSSpecificRequirements_Quality(), this.getVSSSQualityRequirements(), null, "quality", null, 1, 1, VSSSSpecificRequirements.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVSSSSpecificRequirements_Design(), this.getVSSSDesignRequirements(), null, "design", null, 1, 1, VSSSSpecificRequirements.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVSSSSpecificRequirements_SoftwareOperations(), this.getVSSSSoftwareOperationsRequirements(), null, "softwareOperations", null, 1, 1, VSSSSpecificRequirements.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVSSSSpecificRequirements_SoftwareMaintenance(), this.getVSSSSoftwareMaintenanceRequirements(), null, "softwareMaintenance", null, 1, 1, VSSSSpecificRequirements.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVSSSSpecificRequirements_SystemSoftwareObservability(), this.getVSSSSystemSoftwareObservabilityRequirements(), null, "systemSoftwareObservability", null, 1, 1, VSSSSpecificRequirements.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(vsssGeneralRequirementsEClass, VSSSGeneralRequirements.class, "VSSSGeneralRequirements", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getVSSSGeneralRequirements_SssItems(), this.getVSSSDocumentItem(), null, "sssItems", null, 0, -1, VSSSGeneralRequirements.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(vsssCapabilitiesRequirementsEClass, VSSSCapabilitiesRequirements.class, "VSSSCapabilitiesRequirements", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getVSSSCapabilitiesRequirements_SssItems(), this.getVSSSDocumentItem(), null, "sssItems", null, 0, -1, VSSSCapabilitiesRequirements.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(vsssSystemInterfaceRequirementsEClass, VSSSSystemInterfaceRequirements.class, "VSSSSystemInterfaceRequirements", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getVSSSSystemInterfaceRequirements_SssItems(), this.getVSSSDocumentItem(), null, "sssItems", null, 0, -1, VSSSSystemInterfaceRequirements.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(vsssAdaptationMissionizationRequirementsEClass, VSSSAdaptationMissionizationRequirements.class, "VSSSAdaptationMissionizationRequirements", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getVSSSAdaptationMissionizationRequirements_SssItems(), this.getVSSSDocumentItem(), null, "sssItems", null, 0, -1, VSSSAdaptationMissionizationRequirements.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(vsssComputerResourceRequirementsEClass, VSSSComputerResourceRequirements.class, "VSSSComputerResourceRequirements", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getVSSSComputerResourceRequirements_SssItems(), this.getVSSSDocumentItem(), null, "sssItems", null, 0, -1, VSSSComputerResourceRequirements.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(vsssSecurityRequirementsEClass, VSSSSecurityRequirements.class, "VSSSSecurityRequirements", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getVSSSSecurityRequirements_SssItems(), this.getVSSSDocumentItem(), null, "sssItems", null, 0, -1, VSSSSecurityRequirements.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(vsssSafetyRequirementsEClass, VSSSSafetyRequirements.class, "VSSSSafetyRequirements", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getVSSSSafetyRequirements_SssItems(), this.getVSSSDocumentItem(), null, "sssItems", null, 0, -1, VSSSSafetyRequirements.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(vsssReliabiltyAvailabilityRequirementsEClass, VSSSReliabiltyAvailabilityRequirements.class, "VSSSReliabiltyAvailabilityRequirements", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getVSSSReliabiltyAvailabilityRequirements_SssItems(), this.getVSSSDocumentItem(), null, "sssItems", null, 0, -1, VSSSReliabiltyAvailabilityRequirements.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(vsssQualityRequirementsEClass, VSSSQualityRequirements.class, "VSSSQualityRequirements", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getVSSSQualityRequirements_SssItems(), this.getVSSSDocumentItem(), null, "sssItems", null, 0, -1, VSSSQualityRequirements.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(vsssDesignRequirementsEClass, VSSSDesignRequirements.class, "VSSSDesignRequirements", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getVSSSDesignRequirements_SssItems(), this.getVSSSDocumentItem(), null, "sssItems", null, 0, -1, VSSSDesignRequirements.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(vsssSoftwareOperationsRequirementsEClass, VSSSSoftwareOperationsRequirements.class, "VSSSSoftwareOperationsRequirements", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getVSSSSoftwareOperationsRequirements_SssItems(), this.getVSSSDocumentItem(), null, "sssItems", null, 0, -1, VSSSSoftwareOperationsRequirements.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(vsssSoftwareMaintenanceRequirementsEClass, VSSSSoftwareMaintenanceRequirements.class, "VSSSSoftwareMaintenanceRequirements", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getVSSSSoftwareMaintenanceRequirements_SssItems(), this.getVSSSDocumentItem(), null, "sssItems", null, 0, -1, VSSSSoftwareMaintenanceRequirements.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(vsssSystemSoftwareObservabilityRequirementsEClass, VSSSSystemSoftwareObservabilityRequirements.class, "VSSSSystemSoftwareObservabilityRequirements", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getVSSSSystemSoftwareObservabilityRequirements_SssItems(), this.getVSSSDocumentItem(), null, "sssItems", null, 0, -1, VSSSSystemSoftwareObservabilityRequirements.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(vsssVerificationValidationIntegrationRequirementsEClass, VSSSVerificationValidationIntegrationRequirements.class, "VSSSVerificationValidationIntegrationRequirements", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getVSSSVerificationValidationIntegrationRequirements_VerificationValidationProcess(), this.getVSSSVerificationValidationProcessRequirements(), null, "verificationValidationProcess", null, 1, 1, VSSSVerificationValidationIntegrationRequirements.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVSSSVerificationValidationIntegrationRequirements_ValidationApproach(), this.getVSSSValidationApproach(), null, "validationApproach", null, 1, 1, VSSSVerificationValidationIntegrationRequirements.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVSSSVerificationValidationIntegrationRequirements_Validation(), this.getVSSSValidationRequirements(), null, "validation", null, 1, 1, VSSSVerificationValidationIntegrationRequirements.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVSSSVerificationValidationIntegrationRequirements_Verification(), this.getVSSSVerificationRequirements(), null, "verification", null, 1, 1, VSSSVerificationValidationIntegrationRequirements.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(vsssVerificationValidationProcessRequirementsEClass, VSSSVerificationValidationProcessRequirements.class, "VSSSVerificationValidationProcessRequirements", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getVSSSVerificationValidationProcessRequirements_SssItems(), this.getVSSSDocumentItem(), null, "sssItems", null, 0, -1, VSSSVerificationValidationProcessRequirements.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(vsssValidationApproachEClass, VSSSValidationApproach.class, "VSSSValidationApproach", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getVSSSValidationApproach_SssItems(), this.getVSSSDocumentItem(), null, "sssItems", null, 0, -1, VSSSValidationApproach.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(vsssVerificationRequirementsEClass, VSSSVerificationRequirements.class, "VSSSVerificationRequirements", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getVSSSVerificationRequirements_SssItems(), this.getVSSSDocumentItem(), null, "sssItems", null, 0, -1, VSSSVerificationRequirements.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(vsssValidationRequirementsEClass, VSSSValidationRequirements.class, "VSSSValidationRequirements", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getVSSSValidationRequirements_SssItems(), this.getVSSSDocumentItem(), null, "sssItems", null, 0, -1, VSSSValidationRequirements.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(vsssDocumentItemEClass, VSSSDocumentItem.class, "VSSSDocumentItem", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getVSSSDocumentItem_Body(), thedocPackage.getDBody(), null, "body", null, 1, 1, VSSSDocumentItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(vsssSystemModelsEClass, VSSSSystemModels.class, "VSSSSystemModels", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getVSSSSystemModels_SystemModels(), this.getVSSSSystemModel(), null, "systemModels", null, 0, -1, VSSSSystemModels.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(vsssSystemModelEClass, VSSSSystemModel.class, "VSSSSystemModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //sssPackageImpl
