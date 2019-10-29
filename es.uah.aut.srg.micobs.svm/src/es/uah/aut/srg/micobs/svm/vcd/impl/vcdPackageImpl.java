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
package es.uah.aut.srg.micobs.svm.vcd.impl;

import es.uah.aut.srg.micobs.svm.vcd.VVCDItem;
import es.uah.aut.srg.micobs.svm.vcd.VVCDItems;
import es.uah.aut.srg.micobs.svm.vcd.VVCDList;
import es.uah.aut.srg.micobs.svm.vcd.VVCDParentItem;
import es.uah.aut.srg.micobs.svm.vcd.VVCDParentItems;
import es.uah.aut.srg.micobs.svm.vcd.VVCDParentRefItem;
import es.uah.aut.srg.micobs.svm.vcd.VVCDRefItem;
import es.uah.aut.srg.micobs.svm.vcd.vcdFactory;
import es.uah.aut.srg.micobs.svm.vcd.vcdPackage;

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
public class vcdPackageImpl extends EPackageImpl implements vcdPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass vvcdListEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass vvcdItemsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass vvcdItemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass vvcdParentRefItemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass vvcdParentItemsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass vvcdParentItemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass vvcdRefItemEClass = null;

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
	 * @see es.uah.aut.srg.micobs.svm.vcd.vcdPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private vcdPackageImpl() {
		super(eNS_URI, vcdFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link vcdPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static vcdPackage init() {
		if (isInited) return (vcdPackage)EPackage.Registry.INSTANCE.getEPackage(vcdPackage.eNS_URI);

		// Obtain or create and register package
		vcdPackageImpl thevcdPackage = (vcdPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof vcdPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new vcdPackageImpl());

		isInited = true;

		// Create package meta-data objects
		thevcdPackage.createPackageContents();

		// Initialize created meta-data
		thevcdPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		thevcdPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(vcdPackage.eNS_URI, thevcdPackage);
		return thevcdPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVVCDList() {
		return vvcdListEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVVCDList_Doc() {
		return (EAttribute)vvcdListEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVVCDList_Items() {
		return (EReference)vvcdListEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVVCDList_ParentItems() {
		return (EReference)vvcdListEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVVCDItems() {
		return vvcdItemsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVVCDItems_Item() {
		return (EReference)vvcdItemsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVVCDItem() {
		return vvcdItemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVVCDItem_Name() {
		return (EAttribute)vvcdItemEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVVCDItem_ParentRefItem() {
		return (EReference)vvcdItemEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVVCDParentRefItem() {
		return vvcdParentRefItemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVVCDParentRefItem_Name() {
		return (EAttribute)vvcdParentRefItemEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVVCDParentRefItem_ParentDoc() {
		return (EAttribute)vvcdParentRefItemEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVVCDParentItems() {
		return vvcdParentItemsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVVCDParentItems_ParentItem() {
		return (EReference)vvcdParentItemsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVVCDParentItem() {
		return vvcdParentItemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVVCDParentItem_Name() {
		return (EAttribute)vvcdParentItemEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVVCDParentItem_ParentDoc() {
		return (EAttribute)vvcdParentItemEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVVCDParentItem_RefItem() {
		return (EReference)vvcdParentItemEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVVCDRefItem() {
		return vvcdRefItemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVVCDRefItem_Name() {
		return (EAttribute)vvcdRefItemEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public vcdFactory getvcdFactory() {
		return (vcdFactory)getEFactoryInstance();
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
		vvcdListEClass = createEClass(VVCD_LIST);
		createEAttribute(vvcdListEClass, VVCD_LIST__DOC);
		createEReference(vvcdListEClass, VVCD_LIST__ITEMS);
		createEReference(vvcdListEClass, VVCD_LIST__PARENT_ITEMS);

		vvcdItemsEClass = createEClass(VVCD_ITEMS);
		createEReference(vvcdItemsEClass, VVCD_ITEMS__ITEM);

		vvcdItemEClass = createEClass(VVCD_ITEM);
		createEAttribute(vvcdItemEClass, VVCD_ITEM__NAME);
		createEReference(vvcdItemEClass, VVCD_ITEM__PARENT_REF_ITEM);

		vvcdParentRefItemEClass = createEClass(VVCD_PARENT_REF_ITEM);
		createEAttribute(vvcdParentRefItemEClass, VVCD_PARENT_REF_ITEM__NAME);
		createEAttribute(vvcdParentRefItemEClass, VVCD_PARENT_REF_ITEM__PARENT_DOC);

		vvcdParentItemsEClass = createEClass(VVCD_PARENT_ITEMS);
		createEReference(vvcdParentItemsEClass, VVCD_PARENT_ITEMS__PARENT_ITEM);

		vvcdParentItemEClass = createEClass(VVCD_PARENT_ITEM);
		createEAttribute(vvcdParentItemEClass, VVCD_PARENT_ITEM__NAME);
		createEAttribute(vvcdParentItemEClass, VVCD_PARENT_ITEM__PARENT_DOC);
		createEReference(vvcdParentItemEClass, VVCD_PARENT_ITEM__REF_ITEM);

		vvcdRefItemEClass = createEClass(VVCD_REF_ITEM);
		createEAttribute(vvcdRefItemEClass, VVCD_REF_ITEM__NAME);
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
		initEClass(vvcdListEClass, VVCDList.class, "VVCDList", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getVVCDList_Doc(), ecorePackage.getEString(), "doc", null, 1, 1, VVCDList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVVCDList_Items(), this.getVVCDItems(), null, "items", null, 1, 1, VVCDList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVVCDList_ParentItems(), this.getVVCDParentItems(), null, "parentItems", null, 1, 1, VVCDList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(vvcdItemsEClass, VVCDItems.class, "VVCDItems", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getVVCDItems_Item(), this.getVVCDItem(), null, "item", null, 1, -1, VVCDItems.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(vvcdItemEClass, VVCDItem.class, "VVCDItem", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getVVCDItem_Name(), ecorePackage.getEString(), "name", null, 1, 1, VVCDItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVVCDItem_ParentRefItem(), this.getVVCDParentRefItem(), null, "parentRefItem", null, 1, -1, VVCDItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(vvcdParentRefItemEClass, VVCDParentRefItem.class, "VVCDParentRefItem", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getVVCDParentRefItem_Name(), ecorePackage.getEString(), "name", null, 1, 1, VVCDParentRefItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVVCDParentRefItem_ParentDoc(), ecorePackage.getEString(), "parentDoc", null, 1, 1, VVCDParentRefItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(vvcdParentItemsEClass, VVCDParentItems.class, "VVCDParentItems", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getVVCDParentItems_ParentItem(), this.getVVCDParentItem(), null, "parentItem", null, 1, -1, VVCDParentItems.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(vvcdParentItemEClass, VVCDParentItem.class, "VVCDParentItem", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getVVCDParentItem_Name(), ecorePackage.getEString(), "name", null, 1, 1, VVCDParentItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVVCDParentItem_ParentDoc(), ecorePackage.getEString(), "parentDoc", null, 1, 1, VVCDParentItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVVCDParentItem_RefItem(), this.getVVCDRefItem(), null, "refItem", null, 1, -1, VVCDParentItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(vvcdRefItemEClass, VVCDRefItem.class, "VVCDRefItem", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getVVCDRefItem_Name(), ecorePackage.getEString(), "name", null, 1, 1, VVCDRefItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //vcdPackageImpl
