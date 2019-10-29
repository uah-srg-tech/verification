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
package es.uah.aut.srg.micobs.svm.vcdt.impl;

import es.uah.aut.srg.micobs.svm.vcdt.VCDTItem;
import es.uah.aut.srg.micobs.svm.vcdt.VCDTItems;
import es.uah.aut.srg.micobs.svm.vcdt.VCDTList;
import es.uah.aut.srg.micobs.svm.vcdt.VCDTParentItem;
import es.uah.aut.srg.micobs.svm.vcdt.VCDTParentItems;
import es.uah.aut.srg.micobs.svm.vcdt.VCDTParentRefItem;
import es.uah.aut.srg.micobs.svm.vcdt.VCDTRefItem;
import es.uah.aut.srg.micobs.svm.vcdt.vcdtFactory;
import es.uah.aut.srg.micobs.svm.vcdt.vcdtPackage;

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
public class vcdtPackageImpl extends EPackageImpl implements vcdtPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass vcdtListEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass vcdtItemsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass vcdtItemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass vcdtParentRefItemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass vcdtParentItemsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass vcdtParentItemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass vcdtRefItemEClass = null;

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
	 * @see es.uah.aut.srg.micobs.svm.vcdt.vcdtPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private vcdtPackageImpl() {
		super(eNS_URI, vcdtFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link vcdtPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static vcdtPackage init() {
		if (isInited) return (vcdtPackage)EPackage.Registry.INSTANCE.getEPackage(vcdtPackage.eNS_URI);

		// Obtain or create and register package
		vcdtPackageImpl thevcdtPackage = (vcdtPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof vcdtPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new vcdtPackageImpl());

		isInited = true;

		// Create package meta-data objects
		thevcdtPackage.createPackageContents();

		// Initialize created meta-data
		thevcdtPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		thevcdtPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(vcdtPackage.eNS_URI, thevcdtPackage);
		return thevcdtPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVCDTList() {
		return vcdtListEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVCDTList_Doc() {
		return (EAttribute)vcdtListEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVCDTList_Items() {
		return (EReference)vcdtListEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVCDTList_ParentItems() {
		return (EReference)vcdtListEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVCDTItems() {
		return vcdtItemsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVCDTItems_Item() {
		return (EReference)vcdtItemsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVCDTItem() {
		return vcdtItemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVCDTItem_Name() {
		return (EAttribute)vcdtItemEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVCDTItem_ParentRefItem() {
		return (EReference)vcdtItemEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVCDTParentRefItem() {
		return vcdtParentRefItemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVCDTParentRefItem_Name() {
		return (EAttribute)vcdtParentRefItemEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVCDTParentRefItem_ParentDoc() {
		return (EAttribute)vcdtParentRefItemEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVCDTParentItems() {
		return vcdtParentItemsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVCDTParentItems_ParentItem() {
		return (EReference)vcdtParentItemsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVCDTParentItem() {
		return vcdtParentItemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVCDTParentItem_Name() {
		return (EAttribute)vcdtParentItemEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVCDTParentItem_ParentDoc() {
		return (EAttribute)vcdtParentItemEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVCDTParentItem_RefItem() {
		return (EReference)vcdtParentItemEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVCDTRefItem() {
		return vcdtRefItemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVCDTRefItem_Name() {
		return (EAttribute)vcdtRefItemEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public vcdtFactory getvcdtFactory() {
		return (vcdtFactory)getEFactoryInstance();
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
		vcdtListEClass = createEClass(VCDT_LIST);
		createEAttribute(vcdtListEClass, VCDT_LIST__DOC);
		createEReference(vcdtListEClass, VCDT_LIST__ITEMS);
		createEReference(vcdtListEClass, VCDT_LIST__PARENT_ITEMS);

		vcdtItemsEClass = createEClass(VCDT_ITEMS);
		createEReference(vcdtItemsEClass, VCDT_ITEMS__ITEM);

		vcdtItemEClass = createEClass(VCDT_ITEM);
		createEAttribute(vcdtItemEClass, VCDT_ITEM__NAME);
		createEReference(vcdtItemEClass, VCDT_ITEM__PARENT_REF_ITEM);

		vcdtParentRefItemEClass = createEClass(VCDT_PARENT_REF_ITEM);
		createEAttribute(vcdtParentRefItemEClass, VCDT_PARENT_REF_ITEM__NAME);
		createEAttribute(vcdtParentRefItemEClass, VCDT_PARENT_REF_ITEM__PARENT_DOC);

		vcdtParentItemsEClass = createEClass(VCDT_PARENT_ITEMS);
		createEReference(vcdtParentItemsEClass, VCDT_PARENT_ITEMS__PARENT_ITEM);

		vcdtParentItemEClass = createEClass(VCDT_PARENT_ITEM);
		createEAttribute(vcdtParentItemEClass, VCDT_PARENT_ITEM__NAME);
		createEAttribute(vcdtParentItemEClass, VCDT_PARENT_ITEM__PARENT_DOC);
		createEReference(vcdtParentItemEClass, VCDT_PARENT_ITEM__REF_ITEM);

		vcdtRefItemEClass = createEClass(VCDT_REF_ITEM);
		createEAttribute(vcdtRefItemEClass, VCDT_REF_ITEM__NAME);
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

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes, features, and operations; add parameters
		initEClass(vcdtListEClass, VCDTList.class, "VCDTList", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getVCDTList_Doc(), ecorePackage.getEString(), "doc", null, 1, 1, VCDTList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVCDTList_Items(), this.getVCDTItems(), null, "items", null, 1, 1, VCDTList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVCDTList_ParentItems(), this.getVCDTParentItems(), null, "parentItems", null, 1, 1, VCDTList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(vcdtItemsEClass, VCDTItems.class, "VCDTItems", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getVCDTItems_Item(), this.getVCDTItem(), null, "item", null, 1, -1, VCDTItems.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(vcdtItemEClass, VCDTItem.class, "VCDTItem", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getVCDTItem_Name(), ecorePackage.getEString(), "name", null, 1, 1, VCDTItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVCDTItem_ParentRefItem(), this.getVCDTParentRefItem(), null, "parentRefItem", null, 1, -1, VCDTItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(vcdtParentRefItemEClass, VCDTParentRefItem.class, "VCDTParentRefItem", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getVCDTParentRefItem_Name(), ecorePackage.getEString(), "name", null, 1, 1, VCDTParentRefItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVCDTParentRefItem_ParentDoc(), ecorePackage.getEString(), "parentDoc", null, 1, 1, VCDTParentRefItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(vcdtParentItemsEClass, VCDTParentItems.class, "VCDTParentItems", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getVCDTParentItems_ParentItem(), this.getVCDTParentItem(), null, "parentItem", null, 1, -1, VCDTParentItems.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(vcdtParentItemEClass, VCDTParentItem.class, "VCDTParentItem", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getVCDTParentItem_Name(), ecorePackage.getEString(), "name", null, 1, 1, VCDTParentItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVCDTParentItem_ParentDoc(), ecorePackage.getEString(), "parentDoc", null, 1, 1, VCDTParentItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVCDTParentItem_RefItem(), this.getVCDTRefItem(), null, "refItem", null, 1, -1, VCDTParentItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(vcdtRefItemEClass, VCDTRefItem.class, "VCDTRefItem", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getVCDTRefItem_Name(), ecorePackage.getEString(), "name", null, 1, 1, VCDTRefItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //vcdtPackageImpl
