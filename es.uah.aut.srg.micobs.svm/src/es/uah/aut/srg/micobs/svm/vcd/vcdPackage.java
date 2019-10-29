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
package es.uah.aut.srg.micobs.svm.vcd;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see es.uah.aut.srg.micobs.svm.vcd.vcdFactory
 * @model kind="package"
 * @generated
 */
public interface vcdPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "vcd";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://srg.aut.uah.es/micobs/svm/vcd";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "micobs.svm";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	vcdPackage eINSTANCE = es.uah.aut.srg.micobs.svm.vcd.impl.vcdPackageImpl.init();

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.micobs.svm.vcd.impl.VVCDListImpl <em>VVCD List</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uah.aut.srg.micobs.svm.vcd.impl.VVCDListImpl
	 * @see es.uah.aut.srg.micobs.svm.vcd.impl.vcdPackageImpl#getVVCDList()
	 * @generated
	 */
	int VVCD_LIST = 0;

	/**
	 * The feature id for the '<em><b>Doc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VVCD_LIST__DOC = 0;

	/**
	 * The feature id for the '<em><b>Items</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VVCD_LIST__ITEMS = 1;

	/**
	 * The feature id for the '<em><b>Parent Items</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VVCD_LIST__PARENT_ITEMS = 2;

	/**
	 * The number of structural features of the '<em>VVCD List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VVCD_LIST_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>VVCD List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VVCD_LIST_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.micobs.svm.vcd.impl.VVCDItemsImpl <em>VVCD Items</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uah.aut.srg.micobs.svm.vcd.impl.VVCDItemsImpl
	 * @see es.uah.aut.srg.micobs.svm.vcd.impl.vcdPackageImpl#getVVCDItems()
	 * @generated
	 */
	int VVCD_ITEMS = 1;

	/**
	 * The feature id for the '<em><b>Item</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VVCD_ITEMS__ITEM = 0;

	/**
	 * The number of structural features of the '<em>VVCD Items</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VVCD_ITEMS_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>VVCD Items</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VVCD_ITEMS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.micobs.svm.vcd.impl.VVCDItemImpl <em>VVCD Item</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uah.aut.srg.micobs.svm.vcd.impl.VVCDItemImpl
	 * @see es.uah.aut.srg.micobs.svm.vcd.impl.vcdPackageImpl#getVVCDItem()
	 * @generated
	 */
	int VVCD_ITEM = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VVCD_ITEM__NAME = 0;

	/**
	 * The feature id for the '<em><b>Parent Ref Item</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VVCD_ITEM__PARENT_REF_ITEM = 1;

	/**
	 * The number of structural features of the '<em>VVCD Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VVCD_ITEM_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>VVCD Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VVCD_ITEM_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.micobs.svm.vcd.impl.VVCDParentRefItemImpl <em>VVCD Parent Ref Item</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uah.aut.srg.micobs.svm.vcd.impl.VVCDParentRefItemImpl
	 * @see es.uah.aut.srg.micobs.svm.vcd.impl.vcdPackageImpl#getVVCDParentRefItem()
	 * @generated
	 */
	int VVCD_PARENT_REF_ITEM = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VVCD_PARENT_REF_ITEM__NAME = 0;

	/**
	 * The feature id for the '<em><b>Parent Doc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VVCD_PARENT_REF_ITEM__PARENT_DOC = 1;

	/**
	 * The number of structural features of the '<em>VVCD Parent Ref Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VVCD_PARENT_REF_ITEM_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>VVCD Parent Ref Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VVCD_PARENT_REF_ITEM_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.micobs.svm.vcd.impl.VVCDParentItemsImpl <em>VVCD Parent Items</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uah.aut.srg.micobs.svm.vcd.impl.VVCDParentItemsImpl
	 * @see es.uah.aut.srg.micobs.svm.vcd.impl.vcdPackageImpl#getVVCDParentItems()
	 * @generated
	 */
	int VVCD_PARENT_ITEMS = 4;

	/**
	 * The feature id for the '<em><b>Parent Item</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VVCD_PARENT_ITEMS__PARENT_ITEM = 0;

	/**
	 * The number of structural features of the '<em>VVCD Parent Items</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VVCD_PARENT_ITEMS_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>VVCD Parent Items</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VVCD_PARENT_ITEMS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.micobs.svm.vcd.impl.VVCDParentItemImpl <em>VVCD Parent Item</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uah.aut.srg.micobs.svm.vcd.impl.VVCDParentItemImpl
	 * @see es.uah.aut.srg.micobs.svm.vcd.impl.vcdPackageImpl#getVVCDParentItem()
	 * @generated
	 */
	int VVCD_PARENT_ITEM = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VVCD_PARENT_ITEM__NAME = 0;

	/**
	 * The feature id for the '<em><b>Parent Doc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VVCD_PARENT_ITEM__PARENT_DOC = 1;

	/**
	 * The feature id for the '<em><b>Ref Item</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VVCD_PARENT_ITEM__REF_ITEM = 2;

	/**
	 * The number of structural features of the '<em>VVCD Parent Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VVCD_PARENT_ITEM_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>VVCD Parent Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VVCD_PARENT_ITEM_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.micobs.svm.vcd.impl.VVCDRefItemImpl <em>VVCD Ref Item</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uah.aut.srg.micobs.svm.vcd.impl.VVCDRefItemImpl
	 * @see es.uah.aut.srg.micobs.svm.vcd.impl.vcdPackageImpl#getVVCDRefItem()
	 * @generated
	 */
	int VVCD_REF_ITEM = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VVCD_REF_ITEM__NAME = 0;

	/**
	 * The number of structural features of the '<em>VVCD Ref Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VVCD_REF_ITEM_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>VVCD Ref Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VVCD_REF_ITEM_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.micobs.svm.vcd.VVCDList <em>VVCD List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>VVCD List</em>'.
	 * @see es.uah.aut.srg.micobs.svm.vcd.VVCDList
	 * @generated
	 */
	EClass getVVCDList();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.micobs.svm.vcd.VVCDList#getDoc <em>Doc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Doc</em>'.
	 * @see es.uah.aut.srg.micobs.svm.vcd.VVCDList#getDoc()
	 * @see #getVVCDList()
	 * @generated
	 */
	EAttribute getVVCDList_Doc();

	/**
	 * Returns the meta object for the containment reference '{@link es.uah.aut.srg.micobs.svm.vcd.VVCDList#getItems <em>Items</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Items</em>'.
	 * @see es.uah.aut.srg.micobs.svm.vcd.VVCDList#getItems()
	 * @see #getVVCDList()
	 * @generated
	 */
	EReference getVVCDList_Items();

	/**
	 * Returns the meta object for the containment reference '{@link es.uah.aut.srg.micobs.svm.vcd.VVCDList#getParentItems <em>Parent Items</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Parent Items</em>'.
	 * @see es.uah.aut.srg.micobs.svm.vcd.VVCDList#getParentItems()
	 * @see #getVVCDList()
	 * @generated
	 */
	EReference getVVCDList_ParentItems();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.micobs.svm.vcd.VVCDItems <em>VVCD Items</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>VVCD Items</em>'.
	 * @see es.uah.aut.srg.micobs.svm.vcd.VVCDItems
	 * @generated
	 */
	EClass getVVCDItems();

	/**
	 * Returns the meta object for the containment reference list '{@link es.uah.aut.srg.micobs.svm.vcd.VVCDItems#getItem <em>Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Item</em>'.
	 * @see es.uah.aut.srg.micobs.svm.vcd.VVCDItems#getItem()
	 * @see #getVVCDItems()
	 * @generated
	 */
	EReference getVVCDItems_Item();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.micobs.svm.vcd.VVCDItem <em>VVCD Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>VVCD Item</em>'.
	 * @see es.uah.aut.srg.micobs.svm.vcd.VVCDItem
	 * @generated
	 */
	EClass getVVCDItem();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.micobs.svm.vcd.VVCDItem#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see es.uah.aut.srg.micobs.svm.vcd.VVCDItem#getName()
	 * @see #getVVCDItem()
	 * @generated
	 */
	EAttribute getVVCDItem_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link es.uah.aut.srg.micobs.svm.vcd.VVCDItem#getParentRefItem <em>Parent Ref Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Parent Ref Item</em>'.
	 * @see es.uah.aut.srg.micobs.svm.vcd.VVCDItem#getParentRefItem()
	 * @see #getVVCDItem()
	 * @generated
	 */
	EReference getVVCDItem_ParentRefItem();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.micobs.svm.vcd.VVCDParentRefItem <em>VVCD Parent Ref Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>VVCD Parent Ref Item</em>'.
	 * @see es.uah.aut.srg.micobs.svm.vcd.VVCDParentRefItem
	 * @generated
	 */
	EClass getVVCDParentRefItem();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.micobs.svm.vcd.VVCDParentRefItem#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see es.uah.aut.srg.micobs.svm.vcd.VVCDParentRefItem#getName()
	 * @see #getVVCDParentRefItem()
	 * @generated
	 */
	EAttribute getVVCDParentRefItem_Name();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.micobs.svm.vcd.VVCDParentRefItem#getParentDoc <em>Parent Doc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Parent Doc</em>'.
	 * @see es.uah.aut.srg.micobs.svm.vcd.VVCDParentRefItem#getParentDoc()
	 * @see #getVVCDParentRefItem()
	 * @generated
	 */
	EAttribute getVVCDParentRefItem_ParentDoc();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.micobs.svm.vcd.VVCDParentItems <em>VVCD Parent Items</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>VVCD Parent Items</em>'.
	 * @see es.uah.aut.srg.micobs.svm.vcd.VVCDParentItems
	 * @generated
	 */
	EClass getVVCDParentItems();

	/**
	 * Returns the meta object for the containment reference list '{@link es.uah.aut.srg.micobs.svm.vcd.VVCDParentItems#getParentItem <em>Parent Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Parent Item</em>'.
	 * @see es.uah.aut.srg.micobs.svm.vcd.VVCDParentItems#getParentItem()
	 * @see #getVVCDParentItems()
	 * @generated
	 */
	EReference getVVCDParentItems_ParentItem();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.micobs.svm.vcd.VVCDParentItem <em>VVCD Parent Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>VVCD Parent Item</em>'.
	 * @see es.uah.aut.srg.micobs.svm.vcd.VVCDParentItem
	 * @generated
	 */
	EClass getVVCDParentItem();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.micobs.svm.vcd.VVCDParentItem#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see es.uah.aut.srg.micobs.svm.vcd.VVCDParentItem#getName()
	 * @see #getVVCDParentItem()
	 * @generated
	 */
	EAttribute getVVCDParentItem_Name();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.micobs.svm.vcd.VVCDParentItem#getParentDoc <em>Parent Doc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Parent Doc</em>'.
	 * @see es.uah.aut.srg.micobs.svm.vcd.VVCDParentItem#getParentDoc()
	 * @see #getVVCDParentItem()
	 * @generated
	 */
	EAttribute getVVCDParentItem_ParentDoc();

	/**
	 * Returns the meta object for the containment reference list '{@link es.uah.aut.srg.micobs.svm.vcd.VVCDParentItem#getRefItem <em>Ref Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Ref Item</em>'.
	 * @see es.uah.aut.srg.micobs.svm.vcd.VVCDParentItem#getRefItem()
	 * @see #getVVCDParentItem()
	 * @generated
	 */
	EReference getVVCDParentItem_RefItem();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.micobs.svm.vcd.VVCDRefItem <em>VVCD Ref Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>VVCD Ref Item</em>'.
	 * @see es.uah.aut.srg.micobs.svm.vcd.VVCDRefItem
	 * @generated
	 */
	EClass getVVCDRefItem();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.micobs.svm.vcd.VVCDRefItem#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see es.uah.aut.srg.micobs.svm.vcd.VVCDRefItem#getName()
	 * @see #getVVCDRefItem()
	 * @generated
	 */
	EAttribute getVVCDRefItem_Name();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	vcdFactory getvcdFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.micobs.svm.vcd.impl.VVCDListImpl <em>VVCD List</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uah.aut.srg.micobs.svm.vcd.impl.VVCDListImpl
		 * @see es.uah.aut.srg.micobs.svm.vcd.impl.vcdPackageImpl#getVVCDList()
		 * @generated
		 */
		EClass VVCD_LIST = eINSTANCE.getVVCDList();

		/**
		 * The meta object literal for the '<em><b>Doc</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VVCD_LIST__DOC = eINSTANCE.getVVCDList_Doc();

		/**
		 * The meta object literal for the '<em><b>Items</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VVCD_LIST__ITEMS = eINSTANCE.getVVCDList_Items();

		/**
		 * The meta object literal for the '<em><b>Parent Items</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VVCD_LIST__PARENT_ITEMS = eINSTANCE.getVVCDList_ParentItems();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.micobs.svm.vcd.impl.VVCDItemsImpl <em>VVCD Items</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uah.aut.srg.micobs.svm.vcd.impl.VVCDItemsImpl
		 * @see es.uah.aut.srg.micobs.svm.vcd.impl.vcdPackageImpl#getVVCDItems()
		 * @generated
		 */
		EClass VVCD_ITEMS = eINSTANCE.getVVCDItems();

		/**
		 * The meta object literal for the '<em><b>Item</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VVCD_ITEMS__ITEM = eINSTANCE.getVVCDItems_Item();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.micobs.svm.vcd.impl.VVCDItemImpl <em>VVCD Item</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uah.aut.srg.micobs.svm.vcd.impl.VVCDItemImpl
		 * @see es.uah.aut.srg.micobs.svm.vcd.impl.vcdPackageImpl#getVVCDItem()
		 * @generated
		 */
		EClass VVCD_ITEM = eINSTANCE.getVVCDItem();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VVCD_ITEM__NAME = eINSTANCE.getVVCDItem_Name();

		/**
		 * The meta object literal for the '<em><b>Parent Ref Item</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VVCD_ITEM__PARENT_REF_ITEM = eINSTANCE.getVVCDItem_ParentRefItem();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.micobs.svm.vcd.impl.VVCDParentRefItemImpl <em>VVCD Parent Ref Item</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uah.aut.srg.micobs.svm.vcd.impl.VVCDParentRefItemImpl
		 * @see es.uah.aut.srg.micobs.svm.vcd.impl.vcdPackageImpl#getVVCDParentRefItem()
		 * @generated
		 */
		EClass VVCD_PARENT_REF_ITEM = eINSTANCE.getVVCDParentRefItem();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VVCD_PARENT_REF_ITEM__NAME = eINSTANCE.getVVCDParentRefItem_Name();

		/**
		 * The meta object literal for the '<em><b>Parent Doc</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VVCD_PARENT_REF_ITEM__PARENT_DOC = eINSTANCE.getVVCDParentRefItem_ParentDoc();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.micobs.svm.vcd.impl.VVCDParentItemsImpl <em>VVCD Parent Items</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uah.aut.srg.micobs.svm.vcd.impl.VVCDParentItemsImpl
		 * @see es.uah.aut.srg.micobs.svm.vcd.impl.vcdPackageImpl#getVVCDParentItems()
		 * @generated
		 */
		EClass VVCD_PARENT_ITEMS = eINSTANCE.getVVCDParentItems();

		/**
		 * The meta object literal for the '<em><b>Parent Item</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VVCD_PARENT_ITEMS__PARENT_ITEM = eINSTANCE.getVVCDParentItems_ParentItem();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.micobs.svm.vcd.impl.VVCDParentItemImpl <em>VVCD Parent Item</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uah.aut.srg.micobs.svm.vcd.impl.VVCDParentItemImpl
		 * @see es.uah.aut.srg.micobs.svm.vcd.impl.vcdPackageImpl#getVVCDParentItem()
		 * @generated
		 */
		EClass VVCD_PARENT_ITEM = eINSTANCE.getVVCDParentItem();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VVCD_PARENT_ITEM__NAME = eINSTANCE.getVVCDParentItem_Name();

		/**
		 * The meta object literal for the '<em><b>Parent Doc</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VVCD_PARENT_ITEM__PARENT_DOC = eINSTANCE.getVVCDParentItem_ParentDoc();

		/**
		 * The meta object literal for the '<em><b>Ref Item</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VVCD_PARENT_ITEM__REF_ITEM = eINSTANCE.getVVCDParentItem_RefItem();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.micobs.svm.vcd.impl.VVCDRefItemImpl <em>VVCD Ref Item</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uah.aut.srg.micobs.svm.vcd.impl.VVCDRefItemImpl
		 * @see es.uah.aut.srg.micobs.svm.vcd.impl.vcdPackageImpl#getVVCDRefItem()
		 * @generated
		 */
		EClass VVCD_REF_ITEM = eINSTANCE.getVVCDRefItem();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VVCD_REF_ITEM__NAME = eINSTANCE.getVVCDRefItem_Name();

	}

} //vcdPackage
