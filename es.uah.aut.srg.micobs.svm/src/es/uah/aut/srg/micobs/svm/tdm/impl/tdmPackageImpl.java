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
package es.uah.aut.srg.micobs.svm.tdm.impl;

import es.uah.aut.srg.micobs.common.commonPackage;

import es.uah.aut.srg.micobs.svm.tdm.VTraceableDocument;
import es.uah.aut.srg.micobs.svm.tdm.VTraceableDocumentAbstractGroup;
import es.uah.aut.srg.micobs.svm.tdm.VTraceableDocumentAbstractSection;
import es.uah.aut.srg.micobs.svm.tdm.VTraceableDocumentFixedGroup;
import es.uah.aut.srg.micobs.svm.tdm.VTraceableDocumentFixedSection;
import es.uah.aut.srg.micobs.svm.tdm.VTraceableDocumentInstantiableGroup;
import es.uah.aut.srg.micobs.svm.tdm.VTraceableDocumentInstantiableSection;
import es.uah.aut.srg.micobs.svm.tdm.VTraceableDocumentItem;
import es.uah.aut.srg.micobs.svm.tdm.VVerificationMethod;
import es.uah.aut.srg.micobs.svm.tdm.tdmFactory;
import es.uah.aut.srg.micobs.svm.tdm.tdmPackage;

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
public class tdmPackageImpl extends EPackageImpl implements tdmPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass vTraceableDocumentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass vTraceableDocumentAbstractSectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass vTraceableDocumentFixedSectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass vTraceableDocumentInstantiableSectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass vTraceableDocumentAbstractGroupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass vTraceableDocumentFixedGroupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass vTraceableDocumentInstantiableGroupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass vTraceableDocumentItemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum vVerificationMethodEEnum = null;

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
	 * @see es.uah.aut.srg.micobs.svm.tdm.tdmPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private tdmPackageImpl() {
		super(eNS_URI, tdmFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link tdmPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static tdmPackage init() {
		if (isInited) return (tdmPackage)EPackage.Registry.INSTANCE.getEPackage(tdmPackage.eNS_URI);

		// Obtain or create and register package
		tdmPackageImpl thetdmPackage = (tdmPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof tdmPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new tdmPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		commonPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		thetdmPackage.createPackageContents();

		// Initialize created meta-data
		thetdmPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		thetdmPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(tdmPackage.eNS_URI, thetdmPackage);
		return thetdmPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVTraceableDocument() {
		return vTraceableDocumentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVTraceableDocument_Id() {
		return (EAttribute)vTraceableDocumentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVTraceableDocument_Issue() {
		return (EAttribute)vTraceableDocumentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVTraceableDocument_Revision() {
		return (EAttribute)vTraceableDocumentEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVTraceableDocument_Date() {
		return (EAttribute)vTraceableDocumentEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVTraceableDocument_Sections() {
		return (EReference)vTraceableDocumentEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVTraceableDocument_Parents() {
		return (EReference)vTraceableDocumentEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVTraceableDocument_Groups() {
		return (EReference)vTraceableDocumentEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVTraceableDocumentAbstractSection() {
		return vTraceableDocumentAbstractSectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVTraceableDocumentAbstractSection_Prefix() {
		return (EAttribute)vTraceableDocumentAbstractSectionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVTraceableDocumentAbstractSection_Groups() {
		return (EReference)vTraceableDocumentAbstractSectionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVTraceableDocumentAbstractSection_Document() {
		return (EReference)vTraceableDocumentAbstractSectionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVTraceableDocumentFixedSection() {
		return vTraceableDocumentFixedSectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVTraceableDocumentFixedSection_Name() {
		return (EAttribute)vTraceableDocumentFixedSectionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVTraceableDocumentInstantiableSection() {
		return vTraceableDocumentInstantiableSectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVTraceableDocumentAbstractGroup() {
		return vTraceableDocumentAbstractGroupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVTraceableDocumentAbstractGroup_Prefix() {
		return (EAttribute)vTraceableDocumentAbstractGroupEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVTraceableDocumentAbstractGroup_Items() {
		return (EReference)vTraceableDocumentAbstractGroupEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVTraceableDocumentAbstractGroup_Section() {
		return (EReference)vTraceableDocumentAbstractGroupEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVTraceableDocumentFixedGroup() {
		return vTraceableDocumentFixedGroupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVTraceableDocumentFixedGroup_Name() {
		return (EAttribute)vTraceableDocumentFixedGroupEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVTraceableDocumentInstantiableGroup() {
		return vTraceableDocumentInstantiableGroupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVTraceableDocumentItem() {
		return vTraceableDocumentItemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVTraceableDocumentItem_Id() {
		return (EAttribute)vTraceableDocumentItemEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVTraceableDocumentItem_VerificationMethod() {
		return (EAttribute)vTraceableDocumentItemEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVTraceableDocumentItem_Group() {
		return (EReference)vTraceableDocumentItemEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getVVerificationMethod() {
		return vVerificationMethodEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public tdmFactory gettdmFactory() {
		return (tdmFactory)getEFactoryInstance();
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
		vTraceableDocumentEClass = createEClass(VTRACEABLE_DOCUMENT);
		createEAttribute(vTraceableDocumentEClass, VTRACEABLE_DOCUMENT__ID);
		createEAttribute(vTraceableDocumentEClass, VTRACEABLE_DOCUMENT__ISSUE);
		createEAttribute(vTraceableDocumentEClass, VTRACEABLE_DOCUMENT__REVISION);
		createEAttribute(vTraceableDocumentEClass, VTRACEABLE_DOCUMENT__DATE);
		createEReference(vTraceableDocumentEClass, VTRACEABLE_DOCUMENT__SECTIONS);
		createEReference(vTraceableDocumentEClass, VTRACEABLE_DOCUMENT__PARENTS);
		createEReference(vTraceableDocumentEClass, VTRACEABLE_DOCUMENT__GROUPS);

		vTraceableDocumentAbstractSectionEClass = createEClass(VTRACEABLE_DOCUMENT_ABSTRACT_SECTION);
		createEAttribute(vTraceableDocumentAbstractSectionEClass, VTRACEABLE_DOCUMENT_ABSTRACT_SECTION__PREFIX);
		createEReference(vTraceableDocumentAbstractSectionEClass, VTRACEABLE_DOCUMENT_ABSTRACT_SECTION__GROUPS);
		createEReference(vTraceableDocumentAbstractSectionEClass, VTRACEABLE_DOCUMENT_ABSTRACT_SECTION__DOCUMENT);

		vTraceableDocumentFixedSectionEClass = createEClass(VTRACEABLE_DOCUMENT_FIXED_SECTION);
		createEAttribute(vTraceableDocumentFixedSectionEClass, VTRACEABLE_DOCUMENT_FIXED_SECTION__NAME);

		vTraceableDocumentInstantiableSectionEClass = createEClass(VTRACEABLE_DOCUMENT_INSTANTIABLE_SECTION);

		vTraceableDocumentAbstractGroupEClass = createEClass(VTRACEABLE_DOCUMENT_ABSTRACT_GROUP);
		createEAttribute(vTraceableDocumentAbstractGroupEClass, VTRACEABLE_DOCUMENT_ABSTRACT_GROUP__PREFIX);
		createEReference(vTraceableDocumentAbstractGroupEClass, VTRACEABLE_DOCUMENT_ABSTRACT_GROUP__ITEMS);
		createEReference(vTraceableDocumentAbstractGroupEClass, VTRACEABLE_DOCUMENT_ABSTRACT_GROUP__SECTION);

		vTraceableDocumentFixedGroupEClass = createEClass(VTRACEABLE_DOCUMENT_FIXED_GROUP);
		createEAttribute(vTraceableDocumentFixedGroupEClass, VTRACEABLE_DOCUMENT_FIXED_GROUP__NAME);

		vTraceableDocumentInstantiableGroupEClass = createEClass(VTRACEABLE_DOCUMENT_INSTANTIABLE_GROUP);

		vTraceableDocumentItemEClass = createEClass(VTRACEABLE_DOCUMENT_ITEM);
		createEAttribute(vTraceableDocumentItemEClass, VTRACEABLE_DOCUMENT_ITEM__ID);
		createEAttribute(vTraceableDocumentItemEClass, VTRACEABLE_DOCUMENT_ITEM__VERIFICATION_METHOD);
		createEReference(vTraceableDocumentItemEClass, VTRACEABLE_DOCUMENT_ITEM__GROUP);

		// Create enums
		vVerificationMethodEEnum = createEEnum(VVERIFICATION_METHOD);
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
		commonPackage thecommonPackage = (commonPackage)EPackage.Registry.INSTANCE.getEPackage(commonPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		vTraceableDocumentEClass.getESuperTypes().add(thecommonPackage.getMCommonPackageElement());
		vTraceableDocumentFixedSectionEClass.getESuperTypes().add(this.getVTraceableDocumentAbstractSection());
		vTraceableDocumentInstantiableSectionEClass.getESuperTypes().add(this.getVTraceableDocumentAbstractSection());
		vTraceableDocumentInstantiableSectionEClass.getESuperTypes().add(thecommonPackage.getMCommonReferenceableObj());
		vTraceableDocumentFixedGroupEClass.getESuperTypes().add(this.getVTraceableDocumentAbstractGroup());
		vTraceableDocumentInstantiableGroupEClass.getESuperTypes().add(this.getVTraceableDocumentAbstractGroup());
		vTraceableDocumentInstantiableGroupEClass.getESuperTypes().add(thecommonPackage.getMCommonReferenceableObj());
		vTraceableDocumentItemEClass.getESuperTypes().add(thecommonPackage.getMCommonReferenceableObj());

		// Initialize classes, features, and operations; add parameters
		initEClass(vTraceableDocumentEClass, VTraceableDocument.class, "VTraceableDocument", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getVTraceableDocument_Id(), ecorePackage.getEString(), "id", null, 1, 1, VTraceableDocument.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVTraceableDocument_Issue(), ecorePackage.getEString(), "issue", null, 1, 1, VTraceableDocument.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVTraceableDocument_Revision(), ecorePackage.getEString(), "revision", null, 1, 1, VTraceableDocument.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVTraceableDocument_Date(), ecorePackage.getEString(), "date", null, 1, 1, VTraceableDocument.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVTraceableDocument_Sections(), this.getVTraceableDocumentAbstractSection(), null, "sections", null, 1, -1, VTraceableDocument.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getVTraceableDocument_Parents(), this.getVTraceableDocument(), null, "parents", null, 0, -1, VTraceableDocument.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVTraceableDocument_Groups(), this.getVTraceableDocumentAbstractGroup(), null, "groups", null, 1, -1, VTraceableDocument.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(vTraceableDocumentAbstractSectionEClass, VTraceableDocumentAbstractSection.class, "VTraceableDocumentAbstractSection", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getVTraceableDocumentAbstractSection_Prefix(), ecorePackage.getEString(), "prefix", null, 1, 1, VTraceableDocumentAbstractSection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVTraceableDocumentAbstractSection_Groups(), this.getVTraceableDocumentAbstractGroup(), null, "groups", null, 1, -1, VTraceableDocumentAbstractSection.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getVTraceableDocumentAbstractSection_Document(), this.getVTraceableDocument(), null, "document", null, 1, 1, VTraceableDocumentAbstractSection.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(vTraceableDocumentFixedSectionEClass, VTraceableDocumentFixedSection.class, "VTraceableDocumentFixedSection", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getVTraceableDocumentFixedSection_Name(), ecorePackage.getEString(), "name", null, 1, 1, VTraceableDocumentFixedSection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(vTraceableDocumentInstantiableSectionEClass, VTraceableDocumentInstantiableSection.class, "VTraceableDocumentInstantiableSection", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(vTraceableDocumentAbstractGroupEClass, VTraceableDocumentAbstractGroup.class, "VTraceableDocumentAbstractGroup", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getVTraceableDocumentAbstractGroup_Prefix(), ecorePackage.getEString(), "prefix", null, 1, 1, VTraceableDocumentAbstractGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVTraceableDocumentAbstractGroup_Items(), this.getVTraceableDocumentItem(), null, "items", null, 1, -1, VTraceableDocumentAbstractGroup.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getVTraceableDocumentAbstractGroup_Section(), this.getVTraceableDocumentAbstractSection(), null, "section", null, 1, 1, VTraceableDocumentAbstractGroup.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(vTraceableDocumentFixedGroupEClass, VTraceableDocumentFixedGroup.class, "VTraceableDocumentFixedGroup", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getVTraceableDocumentFixedGroup_Name(), ecorePackage.getEString(), "name", null, 1, 1, VTraceableDocumentFixedGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(vTraceableDocumentInstantiableGroupEClass, VTraceableDocumentInstantiableGroup.class, "VTraceableDocumentInstantiableGroup", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(vTraceableDocumentItemEClass, VTraceableDocumentItem.class, "VTraceableDocumentItem", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getVTraceableDocumentItem_Id(), ecorePackage.getEString(), "id", null, 1, 1, VTraceableDocumentItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVTraceableDocumentItem_VerificationMethod(), this.getVVerificationMethod(), "verificationMethod", null, 1, 1, VTraceableDocumentItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVTraceableDocumentItem_Group(), this.getVTraceableDocumentAbstractGroup(), null, "group", null, 1, 1, VTraceableDocumentItem.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(vVerificationMethodEEnum, VVerificationMethod.class, "VVerificationMethod");
		addEEnumLiteral(vVerificationMethodEEnum, VVerificationMethod.ANALYSIS);
		addEEnumLiteral(vVerificationMethodEEnum, VVerificationMethod.INSPECTION);
		addEEnumLiteral(vVerificationMethodEEnum, VVerificationMethod.TESTING);
		addEEnumLiteral(vVerificationMethodEEnum, VVerificationMethod.REVIEW);
		addEEnumLiteral(vVerificationMethodEEnum, VVerificationMethod.MODEL_SIMULATION);
		addEEnumLiteral(vVerificationMethodEEnum, VVerificationMethod.WALK_THROUGH);
		addEEnumLiteral(vVerificationMethodEEnum, VVerificationMethod.CROSS_READING);
		addEEnumLiteral(vVerificationMethodEEnum, VVerificationMethod.DESK_CHECKING);

		// Create resource
		createResource(eNS_URI);
	}

} //tdmPackageImpl
