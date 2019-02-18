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
package es.uah.aut.srg.micobs.svm.tdm;

import es.uah.aut.srg.micobs.common.commonPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
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
 * @see es.uah.aut.srg.micobs.svm.tdm.tdmFactory
 * @model kind="package"
 * @generated
 */
public interface tdmPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "tdm";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://srg.aut.uah.es/micobs/svm/tdm";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "svm";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	tdmPackage eINSTANCE = es.uah.aut.srg.micobs.svm.tdm.impl.tdmPackageImpl.init();

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.micobs.svm.tdm.impl.VTraceableDocumentImpl <em>VTraceable Document</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uah.aut.srg.micobs.svm.tdm.impl.VTraceableDocumentImpl
	 * @see es.uah.aut.srg.micobs.svm.tdm.impl.tdmPackageImpl#getVTraceableDocument()
	 * @generated
	 */
	int VTRACEABLE_DOCUMENT = 0;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VTRACEABLE_DOCUMENT__VERSION = commonPackage.MCOMMON_PACKAGE_ELEMENT__VERSION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VTRACEABLE_DOCUMENT__NAME = commonPackage.MCOMMON_PACKAGE_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VTRACEABLE_DOCUMENT__URI = commonPackage.MCOMMON_PACKAGE_ELEMENT__URI;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VTRACEABLE_DOCUMENT__ID = commonPackage.MCOMMON_PACKAGE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Issue</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VTRACEABLE_DOCUMENT__ISSUE = commonPackage.MCOMMON_PACKAGE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VTRACEABLE_DOCUMENT__DATE = commonPackage.MCOMMON_PACKAGE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Item Group</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VTRACEABLE_DOCUMENT__ITEM_GROUP = commonPackage.MCOMMON_PACKAGE_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Parents</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VTRACEABLE_DOCUMENT__PARENTS = commonPackage.MCOMMON_PACKAGE_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>VTraceable Document</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VTRACEABLE_DOCUMENT_FEATURE_COUNT = commonPackage.MCOMMON_PACKAGE_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>VTraceable Document</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VTRACEABLE_DOCUMENT_OPERATION_COUNT = commonPackage.MCOMMON_PACKAGE_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.micobs.svm.tdm.impl.VTraceableDocumentItemGroupImpl <em>VTraceable Document Item Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uah.aut.srg.micobs.svm.tdm.impl.VTraceableDocumentItemGroupImpl
	 * @see es.uah.aut.srg.micobs.svm.tdm.impl.tdmPackageImpl#getVTraceableDocumentItemGroup()
	 * @generated
	 */
	int VTRACEABLE_DOCUMENT_ITEM_GROUP = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VTRACEABLE_DOCUMENT_ITEM_GROUP__NAME = commonPackage.MCOMMON_REFERENCEABLE_OBJ__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VTRACEABLE_DOCUMENT_ITEM_GROUP__DESCRIPTION = commonPackage.MCOMMON_REFERENCEABLE_OBJ__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Item</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VTRACEABLE_DOCUMENT_ITEM_GROUP__ITEM = commonPackage.MCOMMON_REFERENCEABLE_OBJ_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>VTraceable Document Item Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VTRACEABLE_DOCUMENT_ITEM_GROUP_FEATURE_COUNT = commonPackage.MCOMMON_REFERENCEABLE_OBJ_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>VTraceable Document Item Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VTRACEABLE_DOCUMENT_ITEM_GROUP_OPERATION_COUNT = commonPackage.MCOMMON_REFERENCEABLE_OBJ_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.micobs.svm.tdm.impl.VTraceableDocumentItemImpl <em>VTraceable Document Item</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uah.aut.srg.micobs.svm.tdm.impl.VTraceableDocumentItemImpl
	 * @see es.uah.aut.srg.micobs.svm.tdm.impl.tdmPackageImpl#getVTraceableDocumentItem()
	 * @generated
	 */
	int VTRACEABLE_DOCUMENT_ITEM = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VTRACEABLE_DOCUMENT_ITEM__NAME = commonPackage.MCOMMON_REFERENCEABLE_OBJ__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VTRACEABLE_DOCUMENT_ITEM__DESCRIPTION = commonPackage.MCOMMON_REFERENCEABLE_OBJ__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VTRACEABLE_DOCUMENT_ITEM__ID = commonPackage.MCOMMON_REFERENCEABLE_OBJ_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Verification Method</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VTRACEABLE_DOCUMENT_ITEM__VERIFICATION_METHOD = commonPackage.MCOMMON_REFERENCEABLE_OBJ_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>VTraceable Document Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VTRACEABLE_DOCUMENT_ITEM_FEATURE_COUNT = commonPackage.MCOMMON_REFERENCEABLE_OBJ_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>VTraceable Document Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VTRACEABLE_DOCUMENT_ITEM_OPERATION_COUNT = commonPackage.MCOMMON_REFERENCEABLE_OBJ_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.micobs.svm.tdm.VVerificationMethod <em>VVerification Method</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uah.aut.srg.micobs.svm.tdm.VVerificationMethod
	 * @see es.uah.aut.srg.micobs.svm.tdm.impl.tdmPackageImpl#getVVerificationMethod()
	 * @generated
	 */
	int VVERIFICATION_METHOD = 3;


	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.micobs.svm.tdm.VTraceableDocument <em>VTraceable Document</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>VTraceable Document</em>'.
	 * @see es.uah.aut.srg.micobs.svm.tdm.VTraceableDocument
	 * @generated
	 */
	EClass getVTraceableDocument();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.micobs.svm.tdm.VTraceableDocument#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see es.uah.aut.srg.micobs.svm.tdm.VTraceableDocument#getId()
	 * @see #getVTraceableDocument()
	 * @generated
	 */
	EAttribute getVTraceableDocument_Id();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.micobs.svm.tdm.VTraceableDocument#getIssue <em>Issue</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Issue</em>'.
	 * @see es.uah.aut.srg.micobs.svm.tdm.VTraceableDocument#getIssue()
	 * @see #getVTraceableDocument()
	 * @generated
	 */
	EAttribute getVTraceableDocument_Issue();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.micobs.svm.tdm.VTraceableDocument#getDate <em>Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Date</em>'.
	 * @see es.uah.aut.srg.micobs.svm.tdm.VTraceableDocument#getDate()
	 * @see #getVTraceableDocument()
	 * @generated
	 */
	EAttribute getVTraceableDocument_Date();

	/**
	 * Returns the meta object for the reference list '{@link es.uah.aut.srg.micobs.svm.tdm.VTraceableDocument#getItemGroup <em>Item Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Item Group</em>'.
	 * @see es.uah.aut.srg.micobs.svm.tdm.VTraceableDocument#getItemGroup()
	 * @see #getVTraceableDocument()
	 * @generated
	 */
	EReference getVTraceableDocument_ItemGroup();

	/**
	 * Returns the meta object for the reference list '{@link es.uah.aut.srg.micobs.svm.tdm.VTraceableDocument#getParents <em>Parents</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Parents</em>'.
	 * @see es.uah.aut.srg.micobs.svm.tdm.VTraceableDocument#getParents()
	 * @see #getVTraceableDocument()
	 * @generated
	 */
	EReference getVTraceableDocument_Parents();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.micobs.svm.tdm.VTraceableDocumentItemGroup <em>VTraceable Document Item Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>VTraceable Document Item Group</em>'.
	 * @see es.uah.aut.srg.micobs.svm.tdm.VTraceableDocumentItemGroup
	 * @generated
	 */
	EClass getVTraceableDocumentItemGroup();

	/**
	 * Returns the meta object for the reference list '{@link es.uah.aut.srg.micobs.svm.tdm.VTraceableDocumentItemGroup#getItem <em>Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Item</em>'.
	 * @see es.uah.aut.srg.micobs.svm.tdm.VTraceableDocumentItemGroup#getItem()
	 * @see #getVTraceableDocumentItemGroup()
	 * @generated
	 */
	EReference getVTraceableDocumentItemGroup_Item();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.micobs.svm.tdm.VTraceableDocumentItem <em>VTraceable Document Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>VTraceable Document Item</em>'.
	 * @see es.uah.aut.srg.micobs.svm.tdm.VTraceableDocumentItem
	 * @generated
	 */
	EClass getVTraceableDocumentItem();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.micobs.svm.tdm.VTraceableDocumentItem#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see es.uah.aut.srg.micobs.svm.tdm.VTraceableDocumentItem#getId()
	 * @see #getVTraceableDocumentItem()
	 * @generated
	 */
	EAttribute getVTraceableDocumentItem_Id();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.micobs.svm.tdm.VTraceableDocumentItem#getVerificationMethod <em>Verification Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Verification Method</em>'.
	 * @see es.uah.aut.srg.micobs.svm.tdm.VTraceableDocumentItem#getVerificationMethod()
	 * @see #getVTraceableDocumentItem()
	 * @generated
	 */
	EAttribute getVTraceableDocumentItem_VerificationMethod();

	/**
	 * Returns the meta object for enum '{@link es.uah.aut.srg.micobs.svm.tdm.VVerificationMethod <em>VVerification Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>VVerification Method</em>'.
	 * @see es.uah.aut.srg.micobs.svm.tdm.VVerificationMethod
	 * @generated
	 */
	EEnum getVVerificationMethod();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	tdmFactory gettdmFactory();

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
		 * The meta object literal for the '{@link es.uah.aut.srg.micobs.svm.tdm.impl.VTraceableDocumentImpl <em>VTraceable Document</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uah.aut.srg.micobs.svm.tdm.impl.VTraceableDocumentImpl
		 * @see es.uah.aut.srg.micobs.svm.tdm.impl.tdmPackageImpl#getVTraceableDocument()
		 * @generated
		 */
		EClass VTRACEABLE_DOCUMENT = eINSTANCE.getVTraceableDocument();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VTRACEABLE_DOCUMENT__ID = eINSTANCE.getVTraceableDocument_Id();

		/**
		 * The meta object literal for the '<em><b>Issue</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VTRACEABLE_DOCUMENT__ISSUE = eINSTANCE.getVTraceableDocument_Issue();

		/**
		 * The meta object literal for the '<em><b>Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VTRACEABLE_DOCUMENT__DATE = eINSTANCE.getVTraceableDocument_Date();

		/**
		 * The meta object literal for the '<em><b>Item Group</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VTRACEABLE_DOCUMENT__ITEM_GROUP = eINSTANCE.getVTraceableDocument_ItemGroup();

		/**
		 * The meta object literal for the '<em><b>Parents</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VTRACEABLE_DOCUMENT__PARENTS = eINSTANCE.getVTraceableDocument_Parents();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.micobs.svm.tdm.impl.VTraceableDocumentItemGroupImpl <em>VTraceable Document Item Group</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uah.aut.srg.micobs.svm.tdm.impl.VTraceableDocumentItemGroupImpl
		 * @see es.uah.aut.srg.micobs.svm.tdm.impl.tdmPackageImpl#getVTraceableDocumentItemGroup()
		 * @generated
		 */
		EClass VTRACEABLE_DOCUMENT_ITEM_GROUP = eINSTANCE.getVTraceableDocumentItemGroup();

		/**
		 * The meta object literal for the '<em><b>Item</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VTRACEABLE_DOCUMENT_ITEM_GROUP__ITEM = eINSTANCE.getVTraceableDocumentItemGroup_Item();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.micobs.svm.tdm.impl.VTraceableDocumentItemImpl <em>VTraceable Document Item</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uah.aut.srg.micobs.svm.tdm.impl.VTraceableDocumentItemImpl
		 * @see es.uah.aut.srg.micobs.svm.tdm.impl.tdmPackageImpl#getVTraceableDocumentItem()
		 * @generated
		 */
		EClass VTRACEABLE_DOCUMENT_ITEM = eINSTANCE.getVTraceableDocumentItem();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VTRACEABLE_DOCUMENT_ITEM__ID = eINSTANCE.getVTraceableDocumentItem_Id();

		/**
		 * The meta object literal for the '<em><b>Verification Method</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VTRACEABLE_DOCUMENT_ITEM__VERIFICATION_METHOD = eINSTANCE.getVTraceableDocumentItem_VerificationMethod();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.micobs.svm.tdm.VVerificationMethod <em>VVerification Method</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uah.aut.srg.micobs.svm.tdm.VVerificationMethod
		 * @see es.uah.aut.srg.micobs.svm.tdm.impl.tdmPackageImpl#getVVerificationMethod()
		 * @generated
		 */
		EEnum VVERIFICATION_METHOD = eINSTANCE.getVVerificationMethod();

	}

} //tdmPackage
