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
package es.uah.aut.srg.micobs.svm.vdm.impl;

import es.uah.aut.srg.micobs.common.commonPackage;

import es.uah.aut.srg.micobs.svm.tdm.tdmPackage;

import es.uah.aut.srg.micobs.svm.vdm.VValidationDocument;
import es.uah.aut.srg.micobs.svm.vdm.VValidationDocumentAbstractGroup;
import es.uah.aut.srg.micobs.svm.vdm.VValidationDocumentAbstractItem;
import es.uah.aut.srg.micobs.svm.vdm.VValidationDocumentFixedGroup;
import es.uah.aut.srg.micobs.svm.vdm.VValidationDocumentInstantiableGroup;
import es.uah.aut.srg.micobs.svm.vdm.vdmFactory;
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
public class vdmPackageImpl extends EPackageImpl implements vdmPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass vValidationDocumentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass vValidationDocumentAbstractGroupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass vValidationDocumentFixedGroupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass vValidationDocumentInstantiableGroupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass vValidationDocumentAbstractItemEClass = null;

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
	 * @see es.uah.aut.srg.micobs.svm.vdm.vdmPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private vdmPackageImpl() {
		super(eNS_URI, vdmFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link vdmPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static vdmPackage init() {
		if (isInited) return (vdmPackage)EPackage.Registry.INSTANCE.getEPackage(vdmPackage.eNS_URI);

		// Obtain or create and register package
		vdmPackageImpl thevdmPackage = (vdmPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof vdmPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new vdmPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		tdmPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		thevdmPackage.createPackageContents();

		// Initialize created meta-data
		thevdmPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		thevdmPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(vdmPackage.eNS_URI, thevdmPackage);
		return thevdmPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVValidationDocument() {
		return vValidationDocumentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVValidationDocument_Name() {
		return (EAttribute)vValidationDocumentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVValidationDocument_Id() {
		return (EAttribute)vValidationDocumentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVValidationDocument_Issue() {
		return (EAttribute)vValidationDocumentEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVValidationDocument_Revision() {
		return (EAttribute)vValidationDocumentEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVValidationDocument_Date() {
		return (EAttribute)vValidationDocumentEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVValidationDocument_Parents() {
		return (EReference)vValidationDocumentEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVValidationDocument_Groups() {
		return (EReference)vValidationDocumentEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVValidationDocumentAbstractGroup() {
		return vValidationDocumentAbstractGroupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVValidationDocumentAbstractGroup_Items() {
		return (EReference)vValidationDocumentAbstractGroupEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVValidationDocumentFixedGroup() {
		return vValidationDocumentFixedGroupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVValidationDocumentInstantiableGroup() {
		return vValidationDocumentInstantiableGroupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVValidationDocumentInstantiableGroup_Prefix() {
		return (EAttribute)vValidationDocumentInstantiableGroupEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVValidationDocumentAbstractItem() {
		return vValidationDocumentAbstractItemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVValidationDocumentAbstractItem_Name() {
		return (EAttribute)vValidationDocumentAbstractItemEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVValidationDocumentAbstractItem_Group() {
		return (EReference)vValidationDocumentAbstractItemEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVValidationDocumentAbstractItem_ValidatingItems() {
		return (EReference)vValidationDocumentAbstractItemEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public vdmFactory getvdmFactory() {
		return (vdmFactory)getEFactoryInstance();
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
		vValidationDocumentEClass = createEClass(VVALIDATION_DOCUMENT);
		createEAttribute(vValidationDocumentEClass, VVALIDATION_DOCUMENT__NAME);
		createEAttribute(vValidationDocumentEClass, VVALIDATION_DOCUMENT__ID);
		createEAttribute(vValidationDocumentEClass, VVALIDATION_DOCUMENT__ISSUE);
		createEAttribute(vValidationDocumentEClass, VVALIDATION_DOCUMENT__REVISION);
		createEAttribute(vValidationDocumentEClass, VVALIDATION_DOCUMENT__DATE);
		createEReference(vValidationDocumentEClass, VVALIDATION_DOCUMENT__PARENTS);
		createEReference(vValidationDocumentEClass, VVALIDATION_DOCUMENT__GROUPS);

		vValidationDocumentAbstractGroupEClass = createEClass(VVALIDATION_DOCUMENT_ABSTRACT_GROUP);
		createEReference(vValidationDocumentAbstractGroupEClass, VVALIDATION_DOCUMENT_ABSTRACT_GROUP__ITEMS);

		vValidationDocumentFixedGroupEClass = createEClass(VVALIDATION_DOCUMENT_FIXED_GROUP);

		vValidationDocumentInstantiableGroupEClass = createEClass(VVALIDATION_DOCUMENT_INSTANTIABLE_GROUP);
		createEAttribute(vValidationDocumentInstantiableGroupEClass, VVALIDATION_DOCUMENT_INSTANTIABLE_GROUP__PREFIX);

		vValidationDocumentAbstractItemEClass = createEClass(VVALIDATION_DOCUMENT_ABSTRACT_ITEM);
		createEAttribute(vValidationDocumentAbstractItemEClass, VVALIDATION_DOCUMENT_ABSTRACT_ITEM__NAME);
		createEReference(vValidationDocumentAbstractItemEClass, VVALIDATION_DOCUMENT_ABSTRACT_ITEM__GROUP);
		createEReference(vValidationDocumentAbstractItemEClass, VVALIDATION_DOCUMENT_ABSTRACT_ITEM__VALIDATING_ITEMS);
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
		tdmPackage thetdmPackage = (tdmPackage)EPackage.Registry.INSTANCE.getEPackage(tdmPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		vValidationDocumentFixedGroupEClass.getESuperTypes().add(this.getVValidationDocumentAbstractGroup());
		vValidationDocumentInstantiableGroupEClass.getESuperTypes().add(this.getVValidationDocumentAbstractGroup());
		vValidationDocumentInstantiableGroupEClass.getESuperTypes().add(thecommonPackage.getMCommonReferenceableObj());

		// Initialize classes, features, and operations; add parameters
		initEClass(vValidationDocumentEClass, VValidationDocument.class, "VValidationDocument", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getVValidationDocument_Name(), ecorePackage.getEString(), "name", null, 1, 1, VValidationDocument.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVValidationDocument_Id(), ecorePackage.getEString(), "id", null, 1, 1, VValidationDocument.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVValidationDocument_Issue(), ecorePackage.getEString(), "issue", null, 1, 1, VValidationDocument.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVValidationDocument_Revision(), ecorePackage.getEString(), "revision", null, 1, 1, VValidationDocument.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVValidationDocument_Date(), ecorePackage.getEString(), "date", null, 1, 1, VValidationDocument.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVValidationDocument_Parents(), this.getVValidationDocument(), null, "parents", null, 0, -1, VValidationDocument.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVValidationDocument_Groups(), this.getVValidationDocumentAbstractItem(), null, "groups", null, 1, -1, VValidationDocument.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(vValidationDocumentAbstractGroupEClass, VValidationDocumentAbstractGroup.class, "VValidationDocumentAbstractGroup", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getVValidationDocumentAbstractGroup_Items(), this.getVValidationDocumentAbstractItem(), null, "items", null, 0, -1, VValidationDocumentAbstractGroup.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(vValidationDocumentFixedGroupEClass, VValidationDocumentFixedGroup.class, "VValidationDocumentFixedGroup", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(vValidationDocumentInstantiableGroupEClass, VValidationDocumentInstantiableGroup.class, "VValidationDocumentInstantiableGroup", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getVValidationDocumentInstantiableGroup_Prefix(), ecorePackage.getEString(), "prefix", null, 1, 1, VValidationDocumentInstantiableGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(vValidationDocumentAbstractItemEClass, VValidationDocumentAbstractItem.class, "VValidationDocumentAbstractItem", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getVValidationDocumentAbstractItem_Name(), ecorePackage.getEString(), "name", null, 1, 1, VValidationDocumentAbstractItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVValidationDocumentAbstractItem_Group(), this.getVValidationDocumentAbstractGroup(), null, "group", null, 1, 1, VValidationDocumentAbstractItem.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getVValidationDocumentAbstractItem_ValidatingItems(), thetdmPackage.getVTraceableDocumentAbstractItem(), null, "validatingItems", null, 1, -1, VValidationDocumentAbstractItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //vdmPackageImpl
