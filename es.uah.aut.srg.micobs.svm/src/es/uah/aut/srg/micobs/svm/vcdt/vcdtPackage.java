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
package es.uah.aut.srg.micobs.svm.vcdt;

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
 * @see es.uah.aut.srg.micobs.svm.vcdt.vcdtFactory
 * @model kind="package"
 * @generated
 */
public interface vcdtPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "vcdt";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://srg.aut.uah.es/micobs/svm/vcdt";

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
	vcdtPackage eINSTANCE = es.uah.aut.srg.micobs.svm.vcdt.impl.vcdtPackageImpl.init();

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.micobs.svm.vcdt.impl.VCDTListImpl <em>VCDT List</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uah.aut.srg.micobs.svm.vcdt.impl.VCDTListImpl
	 * @see es.uah.aut.srg.micobs.svm.vcdt.impl.vcdtPackageImpl#getVCDTList()
	 * @generated
	 */
	int VCDT_LIST = 0;

	/**
	 * The feature id for the '<em><b>Doc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VCDT_LIST__DOC = 0;

	/**
	 * The feature id for the '<em><b>Items</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VCDT_LIST__ITEMS = 1;

	/**
	 * The feature id for the '<em><b>Parent Items</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VCDT_LIST__PARENT_ITEMS = 2;

	/**
	 * The number of structural features of the '<em>VCDT List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VCDT_LIST_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>VCDT List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VCDT_LIST_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.micobs.svm.vcdt.impl.VCDTItemsImpl <em>VCDT Items</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uah.aut.srg.micobs.svm.vcdt.impl.VCDTItemsImpl
	 * @see es.uah.aut.srg.micobs.svm.vcdt.impl.vcdtPackageImpl#getVCDTItems()
	 * @generated
	 */
	int VCDT_ITEMS = 1;

	/**
	 * The feature id for the '<em><b>Item</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VCDT_ITEMS__ITEM = 0;

	/**
	 * The number of structural features of the '<em>VCDT Items</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VCDT_ITEMS_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>VCDT Items</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VCDT_ITEMS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.micobs.svm.vcdt.impl.VCDTItemImpl <em>VCDT Item</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uah.aut.srg.micobs.svm.vcdt.impl.VCDTItemImpl
	 * @see es.uah.aut.srg.micobs.svm.vcdt.impl.vcdtPackageImpl#getVCDTItem()
	 * @generated
	 */
	int VCDT_ITEM = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VCDT_ITEM__NAME = 0;

	/**
	 * The feature id for the '<em><b>Parent Ref Item</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VCDT_ITEM__PARENT_REF_ITEM = 1;

	/**
	 * The number of structural features of the '<em>VCDT Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VCDT_ITEM_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>VCDT Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VCDT_ITEM_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.micobs.svm.vcdt.impl.VCDTParentRefItemImpl <em>VCDT Parent Ref Item</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uah.aut.srg.micobs.svm.vcdt.impl.VCDTParentRefItemImpl
	 * @see es.uah.aut.srg.micobs.svm.vcdt.impl.vcdtPackageImpl#getVCDTParentRefItem()
	 * @generated
	 */
	int VCDT_PARENT_REF_ITEM = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VCDT_PARENT_REF_ITEM__NAME = 0;

	/**
	 * The feature id for the '<em><b>Parent Doc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VCDT_PARENT_REF_ITEM__PARENT_DOC = 1;

	/**
	 * The number of structural features of the '<em>VCDT Parent Ref Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VCDT_PARENT_REF_ITEM_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>VCDT Parent Ref Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VCDT_PARENT_REF_ITEM_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.micobs.svm.vcdt.impl.VCDTParentItemsImpl <em>VCDT Parent Items</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uah.aut.srg.micobs.svm.vcdt.impl.VCDTParentItemsImpl
	 * @see es.uah.aut.srg.micobs.svm.vcdt.impl.vcdtPackageImpl#getVCDTParentItems()
	 * @generated
	 */
	int VCDT_PARENT_ITEMS = 4;

	/**
	 * The feature id for the '<em><b>Parent Item</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VCDT_PARENT_ITEMS__PARENT_ITEM = 0;

	/**
	 * The number of structural features of the '<em>VCDT Parent Items</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VCDT_PARENT_ITEMS_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>VCDT Parent Items</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VCDT_PARENT_ITEMS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.micobs.svm.vcdt.impl.VCDTParentItemImpl <em>VCDT Parent Item</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uah.aut.srg.micobs.svm.vcdt.impl.VCDTParentItemImpl
	 * @see es.uah.aut.srg.micobs.svm.vcdt.impl.vcdtPackageImpl#getVCDTParentItem()
	 * @generated
	 */
	int VCDT_PARENT_ITEM = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VCDT_PARENT_ITEM__NAME = 0;

	/**
	 * The feature id for the '<em><b>Parent Doc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VCDT_PARENT_ITEM__PARENT_DOC = 1;

	/**
	 * The feature id for the '<em><b>Ref Item</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VCDT_PARENT_ITEM__REF_ITEM = 2;

	/**
	 * The number of structural features of the '<em>VCDT Parent Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VCDT_PARENT_ITEM_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>VCDT Parent Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VCDT_PARENT_ITEM_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.micobs.svm.vcdt.impl.VCDTRefItemImpl <em>VCDT Ref Item</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uah.aut.srg.micobs.svm.vcdt.impl.VCDTRefItemImpl
	 * @see es.uah.aut.srg.micobs.svm.vcdt.impl.vcdtPackageImpl#getVCDTRefItem()
	 * @generated
	 */
	int VCDT_REF_ITEM = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VCDT_REF_ITEM__NAME = 0;

	/**
	 * The number of structural features of the '<em>VCDT Ref Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VCDT_REF_ITEM_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>VCDT Ref Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VCDT_REF_ITEM_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.micobs.svm.vcdt.VCDTList <em>VCDT List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>VCDT List</em>'.
	 * @see es.uah.aut.srg.micobs.svm.vcdt.VCDTList
	 * @generated
	 */
	EClass getVCDTList();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.micobs.svm.vcdt.VCDTList#getDoc <em>Doc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Doc</em>'.
	 * @see es.uah.aut.srg.micobs.svm.vcdt.VCDTList#getDoc()
	 * @see #getVCDTList()
	 * @generated
	 */
	EAttribute getVCDTList_Doc();

	/**
	 * Returns the meta object for the containment reference '{@link es.uah.aut.srg.micobs.svm.vcdt.VCDTList#getItems <em>Items</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Items</em>'.
	 * @see es.uah.aut.srg.micobs.svm.vcdt.VCDTList#getItems()
	 * @see #getVCDTList()
	 * @generated
	 */
	EReference getVCDTList_Items();

	/**
	 * Returns the meta object for the containment reference '{@link es.uah.aut.srg.micobs.svm.vcdt.VCDTList#getParentItems <em>Parent Items</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Parent Items</em>'.
	 * @see es.uah.aut.srg.micobs.svm.vcdt.VCDTList#getParentItems()
	 * @see #getVCDTList()
	 * @generated
	 */
	EReference getVCDTList_ParentItems();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.micobs.svm.vcdt.VCDTItems <em>VCDT Items</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>VCDT Items</em>'.
	 * @see es.uah.aut.srg.micobs.svm.vcdt.VCDTItems
	 * @generated
	 */
	EClass getVCDTItems();

	/**
	 * Returns the meta object for the containment reference list '{@link es.uah.aut.srg.micobs.svm.vcdt.VCDTItems#getItem <em>Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Item</em>'.
	 * @see es.uah.aut.srg.micobs.svm.vcdt.VCDTItems#getItem()
	 * @see #getVCDTItems()
	 * @generated
	 */
	EReference getVCDTItems_Item();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.micobs.svm.vcdt.VCDTItem <em>VCDT Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>VCDT Item</em>'.
	 * @see es.uah.aut.srg.micobs.svm.vcdt.VCDTItem
	 * @generated
	 */
	EClass getVCDTItem();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.micobs.svm.vcdt.VCDTItem#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see es.uah.aut.srg.micobs.svm.vcdt.VCDTItem#getName()
	 * @see #getVCDTItem()
	 * @generated
	 */
	EAttribute getVCDTItem_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link es.uah.aut.srg.micobs.svm.vcdt.VCDTItem#getParentRefItem <em>Parent Ref Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Parent Ref Item</em>'.
	 * @see es.uah.aut.srg.micobs.svm.vcdt.VCDTItem#getParentRefItem()
	 * @see #getVCDTItem()
	 * @generated
	 */
	EReference getVCDTItem_ParentRefItem();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.micobs.svm.vcdt.VCDTParentRefItem <em>VCDT Parent Ref Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>VCDT Parent Ref Item</em>'.
	 * @see es.uah.aut.srg.micobs.svm.vcdt.VCDTParentRefItem
	 * @generated
	 */
	EClass getVCDTParentRefItem();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.micobs.svm.vcdt.VCDTParentRefItem#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see es.uah.aut.srg.micobs.svm.vcdt.VCDTParentRefItem#getName()
	 * @see #getVCDTParentRefItem()
	 * @generated
	 */
	EAttribute getVCDTParentRefItem_Name();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.micobs.svm.vcdt.VCDTParentRefItem#getParentDoc <em>Parent Doc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Parent Doc</em>'.
	 * @see es.uah.aut.srg.micobs.svm.vcdt.VCDTParentRefItem#getParentDoc()
	 * @see #getVCDTParentRefItem()
	 * @generated
	 */
	EAttribute getVCDTParentRefItem_ParentDoc();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.micobs.svm.vcdt.VCDTParentItems <em>VCDT Parent Items</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>VCDT Parent Items</em>'.
	 * @see es.uah.aut.srg.micobs.svm.vcdt.VCDTParentItems
	 * @generated
	 */
	EClass getVCDTParentItems();

	/**
	 * Returns the meta object for the containment reference list '{@link es.uah.aut.srg.micobs.svm.vcdt.VCDTParentItems#getParentItem <em>Parent Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Parent Item</em>'.
	 * @see es.uah.aut.srg.micobs.svm.vcdt.VCDTParentItems#getParentItem()
	 * @see #getVCDTParentItems()
	 * @generated
	 */
	EReference getVCDTParentItems_ParentItem();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.micobs.svm.vcdt.VCDTParentItem <em>VCDT Parent Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>VCDT Parent Item</em>'.
	 * @see es.uah.aut.srg.micobs.svm.vcdt.VCDTParentItem
	 * @generated
	 */
	EClass getVCDTParentItem();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.micobs.svm.vcdt.VCDTParentItem#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see es.uah.aut.srg.micobs.svm.vcdt.VCDTParentItem#getName()
	 * @see #getVCDTParentItem()
	 * @generated
	 */
	EAttribute getVCDTParentItem_Name();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.micobs.svm.vcdt.VCDTParentItem#getParentDoc <em>Parent Doc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Parent Doc</em>'.
	 * @see es.uah.aut.srg.micobs.svm.vcdt.VCDTParentItem#getParentDoc()
	 * @see #getVCDTParentItem()
	 * @generated
	 */
	EAttribute getVCDTParentItem_ParentDoc();

	/**
	 * Returns the meta object for the containment reference list '{@link es.uah.aut.srg.micobs.svm.vcdt.VCDTParentItem#getRefItem <em>Ref Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Ref Item</em>'.
	 * @see es.uah.aut.srg.micobs.svm.vcdt.VCDTParentItem#getRefItem()
	 * @see #getVCDTParentItem()
	 * @generated
	 */
	EReference getVCDTParentItem_RefItem();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.micobs.svm.vcdt.VCDTRefItem <em>VCDT Ref Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>VCDT Ref Item</em>'.
	 * @see es.uah.aut.srg.micobs.svm.vcdt.VCDTRefItem
	 * @generated
	 */
	EClass getVCDTRefItem();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.micobs.svm.vcdt.VCDTRefItem#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see es.uah.aut.srg.micobs.svm.vcdt.VCDTRefItem#getName()
	 * @see #getVCDTRefItem()
	 * @generated
	 */
	EAttribute getVCDTRefItem_Name();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	vcdtFactory getvcdtFactory();

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
		 * The meta object literal for the '{@link es.uah.aut.srg.micobs.svm.vcdt.impl.VCDTListImpl <em>VCDT List</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uah.aut.srg.micobs.svm.vcdt.impl.VCDTListImpl
		 * @see es.uah.aut.srg.micobs.svm.vcdt.impl.vcdtPackageImpl#getVCDTList()
		 * @generated
		 */
		EClass VCDT_LIST = eINSTANCE.getVCDTList();

		/**
		 * The meta object literal for the '<em><b>Doc</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VCDT_LIST__DOC = eINSTANCE.getVCDTList_Doc();

		/**
		 * The meta object literal for the '<em><b>Items</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VCDT_LIST__ITEMS = eINSTANCE.getVCDTList_Items();

		/**
		 * The meta object literal for the '<em><b>Parent Items</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VCDT_LIST__PARENT_ITEMS = eINSTANCE.getVCDTList_ParentItems();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.micobs.svm.vcdt.impl.VCDTItemsImpl <em>VCDT Items</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uah.aut.srg.micobs.svm.vcdt.impl.VCDTItemsImpl
		 * @see es.uah.aut.srg.micobs.svm.vcdt.impl.vcdtPackageImpl#getVCDTItems()
		 * @generated
		 */
		EClass VCDT_ITEMS = eINSTANCE.getVCDTItems();

		/**
		 * The meta object literal for the '<em><b>Item</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VCDT_ITEMS__ITEM = eINSTANCE.getVCDTItems_Item();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.micobs.svm.vcdt.impl.VCDTItemImpl <em>VCDT Item</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uah.aut.srg.micobs.svm.vcdt.impl.VCDTItemImpl
		 * @see es.uah.aut.srg.micobs.svm.vcdt.impl.vcdtPackageImpl#getVCDTItem()
		 * @generated
		 */
		EClass VCDT_ITEM = eINSTANCE.getVCDTItem();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VCDT_ITEM__NAME = eINSTANCE.getVCDTItem_Name();

		/**
		 * The meta object literal for the '<em><b>Parent Ref Item</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VCDT_ITEM__PARENT_REF_ITEM = eINSTANCE.getVCDTItem_ParentRefItem();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.micobs.svm.vcdt.impl.VCDTParentRefItemImpl <em>VCDT Parent Ref Item</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uah.aut.srg.micobs.svm.vcdt.impl.VCDTParentRefItemImpl
		 * @see es.uah.aut.srg.micobs.svm.vcdt.impl.vcdtPackageImpl#getVCDTParentRefItem()
		 * @generated
		 */
		EClass VCDT_PARENT_REF_ITEM = eINSTANCE.getVCDTParentRefItem();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VCDT_PARENT_REF_ITEM__NAME = eINSTANCE.getVCDTParentRefItem_Name();

		/**
		 * The meta object literal for the '<em><b>Parent Doc</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VCDT_PARENT_REF_ITEM__PARENT_DOC = eINSTANCE.getVCDTParentRefItem_ParentDoc();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.micobs.svm.vcdt.impl.VCDTParentItemsImpl <em>VCDT Parent Items</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uah.aut.srg.micobs.svm.vcdt.impl.VCDTParentItemsImpl
		 * @see es.uah.aut.srg.micobs.svm.vcdt.impl.vcdtPackageImpl#getVCDTParentItems()
		 * @generated
		 */
		EClass VCDT_PARENT_ITEMS = eINSTANCE.getVCDTParentItems();

		/**
		 * The meta object literal for the '<em><b>Parent Item</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VCDT_PARENT_ITEMS__PARENT_ITEM = eINSTANCE.getVCDTParentItems_ParentItem();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.micobs.svm.vcdt.impl.VCDTParentItemImpl <em>VCDT Parent Item</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uah.aut.srg.micobs.svm.vcdt.impl.VCDTParentItemImpl
		 * @see es.uah.aut.srg.micobs.svm.vcdt.impl.vcdtPackageImpl#getVCDTParentItem()
		 * @generated
		 */
		EClass VCDT_PARENT_ITEM = eINSTANCE.getVCDTParentItem();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VCDT_PARENT_ITEM__NAME = eINSTANCE.getVCDTParentItem_Name();

		/**
		 * The meta object literal for the '<em><b>Parent Doc</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VCDT_PARENT_ITEM__PARENT_DOC = eINSTANCE.getVCDTParentItem_ParentDoc();

		/**
		 * The meta object literal for the '<em><b>Ref Item</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VCDT_PARENT_ITEM__REF_ITEM = eINSTANCE.getVCDTParentItem_RefItem();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.micobs.svm.vcdt.impl.VCDTRefItemImpl <em>VCDT Ref Item</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uah.aut.srg.micobs.svm.vcdt.impl.VCDTRefItemImpl
		 * @see es.uah.aut.srg.micobs.svm.vcdt.impl.vcdtPackageImpl#getVCDTRefItem()
		 * @generated
		 */
		EClass VCDT_REF_ITEM = eINSTANCE.getVCDTRefItem();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VCDT_REF_ITEM__NAME = eINSTANCE.getVCDTRefItem_Name();

	}

} //vcdtPackage
