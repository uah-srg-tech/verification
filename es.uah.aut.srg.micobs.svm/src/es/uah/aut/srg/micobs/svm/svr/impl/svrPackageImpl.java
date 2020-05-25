/**
 * Copyright (c) 2020 UAH Space Research Group.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 * 
 * Contributors:
 *     SRG Team - Initial API and implementation
 */
package es.uah.aut.srg.micobs.svm.svr.impl;

import es.uah.aut.srg.micobs.doctpl.doctpl.doctplPackage;

import es.uah.aut.srg.micobs.svm.svr.VSVRAbbreviation;
import es.uah.aut.srg.micobs.svm.svr.VSVRAbstractBriefDescription;
import es.uah.aut.srg.micobs.svm.svr.VSVRApplicableDocuments;
import es.uah.aut.srg.micobs.svm.svr.VSVRDefinition;
import es.uah.aut.srg.micobs.svm.svr.VSVRDocument;
import es.uah.aut.srg.micobs.svm.svr.VSVRFixedSection;
import es.uah.aut.srg.micobs.svm.svr.VSVRInstantiableSection;
import es.uah.aut.srg.micobs.svm.svr.VSVRIntroduction;
import es.uah.aut.srg.micobs.svm.svr.VSVRReferenceDocuments;
import es.uah.aut.srg.micobs.svm.svr.VSVRSWValProcessVerification;
import es.uah.aut.srg.micobs.svm.svr.VSVRTBCsTBDs;
import es.uah.aut.srg.micobs.svm.svr.VSVRTerm;
import es.uah.aut.srg.micobs.svm.svr.VSVRTermsDefinitionsAbbreviations;
import es.uah.aut.srg.micobs.svm.svr.svrFactory;
import es.uah.aut.srg.micobs.svm.svr.svrPackage;

import es.uah.aut.srg.micobs.svm.svs.svsPackage;

import es.uah.aut.srg.micobs.svm.tcr.tcrPackage;

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
public class svrPackageImpl extends EPackageImpl implements svrPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass vsvrDocumentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass vsvrtbCsTBDsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass vsvrIntroductionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass vsvrApplicableDocumentsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass vsvrReferenceDocumentsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass vsvrTermsDefinitionsAbbreviationsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass vsvrAbstractBriefDescriptionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass vsvrTermEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass vsvrDefinitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass vsvrAbbreviationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass vsvrFixedSectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass vsvrInstantiableSectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass vsvrswValProcessVerificationEClass = null;

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
	 * @see es.uah.aut.srg.micobs.svm.svr.svrPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private svrPackageImpl() {
		super(eNS_URI, svrFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link svrPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static svrPackage init() {
		if (isInited) return (svrPackage)EPackage.Registry.INSTANCE.getEPackage(svrPackage.eNS_URI);

		// Obtain or create and register package
		svrPackageImpl thesvrPackage = (svrPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof svrPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new svrPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		svsPackage.eINSTANCE.eClass();
		tcrPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		thesvrPackage.createPackageContents();

		// Initialize created meta-data
		thesvrPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		thesvrPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(svrPackage.eNS_URI, thesvrPackage);
		return thesvrPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVSVRDocument() {
		return vsvrDocumentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVSVRDocument_SvsParent() {
		return (EReference)vsvrDocumentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVSVRDocument_TcrParent() {
		return (EReference)vsvrDocumentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVSVRDocument_TbcsTbdsSection() {
		return (EReference)vsvrDocumentEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVSVRDocument_IntroductionSection() {
		return (EReference)vsvrDocumentEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVSVRDocument_ApplicableDocumentsSection() {
		return (EReference)vsvrDocumentEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVSVRDocument_ReferenceDocumentsSection() {
		return (EReference)vsvrDocumentEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVSVRDocument_TermsDefinitionsAbbreviationsSection() {
		return (EReference)vsvrDocumentEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVSVRDocument_SwValProcessVerificationSection() {
		return (EReference)vsvrDocumentEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVSVRTBCsTBDs() {
		return vsvrtbCsTBDsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVSVRTBCsTBDs_Tbcs() {
		return (EReference)vsvrtbCsTBDsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVSVRTBCsTBDs_Tbds() {
		return (EReference)vsvrtbCsTBDsEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVSVRIntroduction() {
		return vsvrIntroductionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVSVRIntroduction_SvrInstatiableSubsections() {
		return (EReference)vsvrIntroductionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVSVRApplicableDocuments() {
		return vsvrApplicableDocumentsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVSVRApplicableDocuments_ApplicableDocuments() {
		return (EReference)vsvrApplicableDocumentsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVSVRReferenceDocuments() {
		return vsvrReferenceDocumentsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVSVRReferenceDocuments_ReferenceDocuments() {
		return (EReference)vsvrReferenceDocumentsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVSVRTermsDefinitionsAbbreviations() {
		return vsvrTermsDefinitionsAbbreviationsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVSVRTermsDefinitionsAbbreviations_Terms() {
		return (EReference)vsvrTermsDefinitionsAbbreviationsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVSVRTermsDefinitionsAbbreviations_Definitions() {
		return (EReference)vsvrTermsDefinitionsAbbreviationsEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVSVRTermsDefinitionsAbbreviations_Abbreviations() {
		return (EReference)vsvrTermsDefinitionsAbbreviationsEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVSVRAbstractBriefDescription() {
		return vsvrAbstractBriefDescriptionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVSVRAbstractBriefDescription_Name() {
		return (EAttribute)vsvrAbstractBriefDescriptionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVSVRAbstractBriefDescription_Description() {
		return (EReference)vsvrAbstractBriefDescriptionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVSVRTerm() {
		return vsvrTermEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVSVRDefinition() {
		return vsvrDefinitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVSVRAbbreviation() {
		return vsvrAbbreviationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVSVRFixedSection() {
		return vsvrFixedSectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVSVRFixedSection_Body() {
		return (EReference)vsvrFixedSectionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVSVRFixedSection_SvrInstatiableSubsections() {
		return (EReference)vsvrFixedSectionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVSVRInstantiableSection() {
		return vsvrInstantiableSectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVSVRInstantiableSection_Body() {
		return (EReference)vsvrInstantiableSectionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVSVRInstantiableSection_SvrInstatiableSubsections() {
		return (EReference)vsvrInstantiableSectionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVSVRSWValProcessVerification() {
		return vsvrswValProcessVerificationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVSVRSWValProcessVerification_Traceability() {
		return (EReference)vsvrswValProcessVerificationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVSVRSWValProcessVerification_Feasibility() {
		return (EReference)vsvrswValProcessVerificationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public svrFactory getsvrFactory() {
		return (svrFactory)getEFactoryInstance();
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
		vsvrDocumentEClass = createEClass(VSVR_DOCUMENT);
		createEReference(vsvrDocumentEClass, VSVR_DOCUMENT__SVS_PARENT);
		createEReference(vsvrDocumentEClass, VSVR_DOCUMENT__TCR_PARENT);
		createEReference(vsvrDocumentEClass, VSVR_DOCUMENT__TBCS_TBDS_SECTION);
		createEReference(vsvrDocumentEClass, VSVR_DOCUMENT__INTRODUCTION_SECTION);
		createEReference(vsvrDocumentEClass, VSVR_DOCUMENT__APPLICABLE_DOCUMENTS_SECTION);
		createEReference(vsvrDocumentEClass, VSVR_DOCUMENT__REFERENCE_DOCUMENTS_SECTION);
		createEReference(vsvrDocumentEClass, VSVR_DOCUMENT__TERMS_DEFINITIONS_ABBREVIATIONS_SECTION);
		createEReference(vsvrDocumentEClass, VSVR_DOCUMENT__SW_VAL_PROCESS_VERIFICATION_SECTION);

		vsvrtbCsTBDsEClass = createEClass(VSVRTB_CS_TB_DS);
		createEReference(vsvrtbCsTBDsEClass, VSVRTB_CS_TB_DS__TBCS);
		createEReference(vsvrtbCsTBDsEClass, VSVRTB_CS_TB_DS__TBDS);

		vsvrIntroductionEClass = createEClass(VSVR_INTRODUCTION);
		createEReference(vsvrIntroductionEClass, VSVR_INTRODUCTION__SVR_INSTATIABLE_SUBSECTIONS);

		vsvrApplicableDocumentsEClass = createEClass(VSVR_APPLICABLE_DOCUMENTS);
		createEReference(vsvrApplicableDocumentsEClass, VSVR_APPLICABLE_DOCUMENTS__APPLICABLE_DOCUMENTS);

		vsvrReferenceDocumentsEClass = createEClass(VSVR_REFERENCE_DOCUMENTS);
		createEReference(vsvrReferenceDocumentsEClass, VSVR_REFERENCE_DOCUMENTS__REFERENCE_DOCUMENTS);

		vsvrTermsDefinitionsAbbreviationsEClass = createEClass(VSVR_TERMS_DEFINITIONS_ABBREVIATIONS);
		createEReference(vsvrTermsDefinitionsAbbreviationsEClass, VSVR_TERMS_DEFINITIONS_ABBREVIATIONS__TERMS);
		createEReference(vsvrTermsDefinitionsAbbreviationsEClass, VSVR_TERMS_DEFINITIONS_ABBREVIATIONS__DEFINITIONS);
		createEReference(vsvrTermsDefinitionsAbbreviationsEClass, VSVR_TERMS_DEFINITIONS_ABBREVIATIONS__ABBREVIATIONS);

		vsvrAbstractBriefDescriptionEClass = createEClass(VSVR_ABSTRACT_BRIEF_DESCRIPTION);
		createEAttribute(vsvrAbstractBriefDescriptionEClass, VSVR_ABSTRACT_BRIEF_DESCRIPTION__NAME);
		createEReference(vsvrAbstractBriefDescriptionEClass, VSVR_ABSTRACT_BRIEF_DESCRIPTION__DESCRIPTION);

		vsvrTermEClass = createEClass(VSVR_TERM);

		vsvrDefinitionEClass = createEClass(VSVR_DEFINITION);

		vsvrAbbreviationEClass = createEClass(VSVR_ABBREVIATION);

		vsvrFixedSectionEClass = createEClass(VSVR_FIXED_SECTION);
		createEReference(vsvrFixedSectionEClass, VSVR_FIXED_SECTION__BODY);
		createEReference(vsvrFixedSectionEClass, VSVR_FIXED_SECTION__SVR_INSTATIABLE_SUBSECTIONS);

		vsvrInstantiableSectionEClass = createEClass(VSVR_INSTANTIABLE_SECTION);
		createEReference(vsvrInstantiableSectionEClass, VSVR_INSTANTIABLE_SECTION__BODY);
		createEReference(vsvrInstantiableSectionEClass, VSVR_INSTANTIABLE_SECTION__SVR_INSTATIABLE_SUBSECTIONS);

		vsvrswValProcessVerificationEClass = createEClass(VSVRSW_VAL_PROCESS_VERIFICATION);
		createEReference(vsvrswValProcessVerificationEClass, VSVRSW_VAL_PROCESS_VERIFICATION__TRACEABILITY);
		createEReference(vsvrswValProcessVerificationEClass, VSVRSW_VAL_PROCESS_VERIFICATION__FEASIBILITY);
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
		doctplPackage thedoctplPackage = (doctplPackage)EPackage.Registry.INSTANCE.getEPackage(doctplPackage.eNS_URI);
		svsPackage thesvsPackage = (svsPackage)EPackage.Registry.INSTANCE.getEPackage(svsPackage.eNS_URI);
		tcrPackage thetcrPackage = (tcrPackage)EPackage.Registry.INSTANCE.getEPackage(tcrPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		vsvrDocumentEClass.getESuperTypes().add(thedoctplPackage.getDDocumentTemplate());
		vsvrtbCsTBDsEClass.getESuperTypes().add(thedoctplPackage.getDFixedSection());
		vsvrIntroductionEClass.getESuperTypes().add(thedoctplPackage.getDFixedSection());
		vsvrApplicableDocumentsEClass.getESuperTypes().add(thedoctplPackage.getDFixedSection());
		vsvrReferenceDocumentsEClass.getESuperTypes().add(thedoctplPackage.getDFixedSection());
		vsvrTermsDefinitionsAbbreviationsEClass.getESuperTypes().add(thedoctplPackage.getDFixedSection());
		vsvrTermEClass.getESuperTypes().add(this.getVSVRAbstractBriefDescription());
		vsvrDefinitionEClass.getESuperTypes().add(this.getVSVRAbstractBriefDescription());
		vsvrAbbreviationEClass.getESuperTypes().add(this.getVSVRAbstractBriefDescription());
		vsvrFixedSectionEClass.getESuperTypes().add(thedoctplPackage.getDFixedSection());
		vsvrInstantiableSectionEClass.getESuperTypes().add(thedoctplPackage.getDInstantiableSection());
		vsvrswValProcessVerificationEClass.getESuperTypes().add(this.getVSVRFixedSection());

		// Initialize classes, features, and operations; add parameters
		initEClass(vsvrDocumentEClass, VSVRDocument.class, "VSVRDocument", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getVSVRDocument_SvsParent(), thesvsPackage.getVSVSDocument(), null, "svsParent", null, 1, 1, VSVRDocument.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVSVRDocument_TcrParent(), thetcrPackage.getVTCRTestCampaignReport(), null, "tcrParent", null, 1, -1, VSVRDocument.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVSVRDocument_TbcsTbdsSection(), this.getVSVRTBCsTBDs(), null, "tbcsTbdsSection", null, 0, 1, VSVRDocument.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVSVRDocument_IntroductionSection(), this.getVSVRIntroduction(), null, "introductionSection", null, 1, 1, VSVRDocument.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVSVRDocument_ApplicableDocumentsSection(), this.getVSVRApplicableDocuments(), null, "applicableDocumentsSection", null, 1, 1, VSVRDocument.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVSVRDocument_ReferenceDocumentsSection(), this.getVSVRReferenceDocuments(), null, "referenceDocumentsSection", null, 1, 1, VSVRDocument.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVSVRDocument_TermsDefinitionsAbbreviationsSection(), this.getVSVRTermsDefinitionsAbbreviations(), null, "termsDefinitionsAbbreviationsSection", null, 1, 1, VSVRDocument.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVSVRDocument_SwValProcessVerificationSection(), this.getVSVRSWValProcessVerification(), null, "swValProcessVerificationSection", null, 1, 1, VSVRDocument.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(vsvrtbCsTBDsEClass, VSVRTBCsTBDs.class, "VSVRTBCsTBDs", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getVSVRTBCsTBDs_Tbcs(), thedoctplPackage.getDTBC(), null, "tbcs", null, 0, -1, VSVRTBCsTBDs.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVSVRTBCsTBDs_Tbds(), thedoctplPackage.getDTBD(), null, "tbds", null, 0, -1, VSVRTBCsTBDs.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(vsvrIntroductionEClass, VSVRIntroduction.class, "VSVRIntroduction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getVSVRIntroduction_SvrInstatiableSubsections(), this.getVSVRInstantiableSection(), null, "svrInstatiableSubsections", null, 1, -1, VSVRIntroduction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(vsvrApplicableDocumentsEClass, VSVRApplicableDocuments.class, "VSVRApplicableDocuments", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getVSVRApplicableDocuments_ApplicableDocuments(), thedoctplPackage.getDApplicableDocument(), null, "applicableDocuments", null, 0, -1, VSVRApplicableDocuments.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(vsvrReferenceDocumentsEClass, VSVRReferenceDocuments.class, "VSVRReferenceDocuments", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getVSVRReferenceDocuments_ReferenceDocuments(), thedoctplPackage.getDReferenceDocument(), null, "referenceDocuments", null, 0, -1, VSVRReferenceDocuments.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(vsvrTermsDefinitionsAbbreviationsEClass, VSVRTermsDefinitionsAbbreviations.class, "VSVRTermsDefinitionsAbbreviations", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getVSVRTermsDefinitionsAbbreviations_Terms(), this.getVSVRTerm(), null, "terms", null, 0, -1, VSVRTermsDefinitionsAbbreviations.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVSVRTermsDefinitionsAbbreviations_Definitions(), this.getVSVRDefinition(), null, "definitions", null, 0, -1, VSVRTermsDefinitionsAbbreviations.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVSVRTermsDefinitionsAbbreviations_Abbreviations(), this.getVSVRAbbreviation(), null, "abbreviations", null, 0, -1, VSVRTermsDefinitionsAbbreviations.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(vsvrAbstractBriefDescriptionEClass, VSVRAbstractBriefDescription.class, "VSVRAbstractBriefDescription", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getVSVRAbstractBriefDescription_Name(), ecorePackage.getEString(), "name", null, 1, 1, VSVRAbstractBriefDescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVSVRAbstractBriefDescription_Description(), thedoctplPackage.getDRun(), null, "description", null, 1, 1, VSVRAbstractBriefDescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(vsvrTermEClass, VSVRTerm.class, "VSVRTerm", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(vsvrDefinitionEClass, VSVRDefinition.class, "VSVRDefinition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(vsvrAbbreviationEClass, VSVRAbbreviation.class, "VSVRAbbreviation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(vsvrFixedSectionEClass, VSVRFixedSection.class, "VSVRFixedSection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getVSVRFixedSection_Body(), thedoctplPackage.getDBody(), null, "body", null, 0, 1, VSVRFixedSection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVSVRFixedSection_SvrInstatiableSubsections(), this.getVSVRInstantiableSection(), null, "svrInstatiableSubsections", null, 0, -1, VSVRFixedSection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(vsvrInstantiableSectionEClass, VSVRInstantiableSection.class, "VSVRInstantiableSection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getVSVRInstantiableSection_Body(), thedoctplPackage.getDBody(), null, "body", null, 0, 1, VSVRInstantiableSection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVSVRInstantiableSection_SvrInstatiableSubsections(), this.getVSVRInstantiableSection(), null, "svrInstatiableSubsections", null, 0, -1, VSVRInstantiableSection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(vsvrswValProcessVerificationEClass, VSVRSWValProcessVerification.class, "VSVRSWValProcessVerification", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getVSVRSWValProcessVerification_Traceability(), this.getVSVRFixedSection(), null, "traceability", null, 1, 1, VSVRSWValProcessVerification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVSVRSWValProcessVerification_Feasibility(), this.getVSVRFixedSection(), null, "feasibility", null, 1, 1, VSVRSWValProcessVerification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //svrPackageImpl
