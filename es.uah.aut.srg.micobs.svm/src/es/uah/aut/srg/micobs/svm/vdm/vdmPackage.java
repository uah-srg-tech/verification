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
package es.uah.aut.srg.micobs.svm.vdm;

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
 * @see es.uah.aut.srg.micobs.svm.vdm.vdmFactory
 * @model kind="package"
 * @generated
 */
public interface vdmPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "vdm";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://srg.aut.uah.es/micobs/svm/vdm";

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
	vdmPackage eINSTANCE = es.uah.aut.srg.micobs.svm.vdm.impl.vdmPackageImpl.init();

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.micobs.svm.vdm.impl.VValidationDocumentImpl <em>VValidation Document</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uah.aut.srg.micobs.svm.vdm.impl.VValidationDocumentImpl
	 * @see es.uah.aut.srg.micobs.svm.vdm.impl.vdmPackageImpl#getVValidationDocument()
	 * @generated
	 */
	int VVALIDATION_DOCUMENT = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VVALIDATION_DOCUMENT__NAME = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VVALIDATION_DOCUMENT__ID = 1;

	/**
	 * The feature id for the '<em><b>Issue</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VVALIDATION_DOCUMENT__ISSUE = 2;

	/**
	 * The feature id for the '<em><b>Revision</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VVALIDATION_DOCUMENT__REVISION = 3;

	/**
	 * The feature id for the '<em><b>Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VVALIDATION_DOCUMENT__DATE = 4;

	/**
	 * The feature id for the '<em><b>Parents</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VVALIDATION_DOCUMENT__PARENTS = 5;

	/**
	 * The feature id for the '<em><b>Groups</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VVALIDATION_DOCUMENT__GROUPS = 6;

	/**
	 * The number of structural features of the '<em>VValidation Document</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VVALIDATION_DOCUMENT_FEATURE_COUNT = 7;

	/**
	 * The number of operations of the '<em>VValidation Document</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VVALIDATION_DOCUMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.micobs.svm.vdm.impl.VValidationDocumentAbstractGroupImpl <em>VValidation Document Abstract Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uah.aut.srg.micobs.svm.vdm.impl.VValidationDocumentAbstractGroupImpl
	 * @see es.uah.aut.srg.micobs.svm.vdm.impl.vdmPackageImpl#getVValidationDocumentAbstractGroup()
	 * @generated
	 */
	int VVALIDATION_DOCUMENT_ABSTRACT_GROUP = 1;

	/**
	 * The feature id for the '<em><b>Items</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VVALIDATION_DOCUMENT_ABSTRACT_GROUP__ITEMS = 0;

	/**
	 * The number of structural features of the '<em>VValidation Document Abstract Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VVALIDATION_DOCUMENT_ABSTRACT_GROUP_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>VValidation Document Abstract Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VVALIDATION_DOCUMENT_ABSTRACT_GROUP_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.micobs.svm.vdm.impl.VValidationDocumentFixedGroupImpl <em>VValidation Document Fixed Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uah.aut.srg.micobs.svm.vdm.impl.VValidationDocumentFixedGroupImpl
	 * @see es.uah.aut.srg.micobs.svm.vdm.impl.vdmPackageImpl#getVValidationDocumentFixedGroup()
	 * @generated
	 */
	int VVALIDATION_DOCUMENT_FIXED_GROUP = 2;

	/**
	 * The feature id for the '<em><b>Items</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VVALIDATION_DOCUMENT_FIXED_GROUP__ITEMS = VVALIDATION_DOCUMENT_ABSTRACT_GROUP__ITEMS;

	/**
	 * The number of structural features of the '<em>VValidation Document Fixed Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VVALIDATION_DOCUMENT_FIXED_GROUP_FEATURE_COUNT = VVALIDATION_DOCUMENT_ABSTRACT_GROUP_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>VValidation Document Fixed Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VVALIDATION_DOCUMENT_FIXED_GROUP_OPERATION_COUNT = VVALIDATION_DOCUMENT_ABSTRACT_GROUP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.micobs.svm.vdm.impl.VValidationDocumentInstantiableGroupImpl <em>VValidation Document Instantiable Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uah.aut.srg.micobs.svm.vdm.impl.VValidationDocumentInstantiableGroupImpl
	 * @see es.uah.aut.srg.micobs.svm.vdm.impl.vdmPackageImpl#getVValidationDocumentInstantiableGroup()
	 * @generated
	 */
	int VVALIDATION_DOCUMENT_INSTANTIABLE_GROUP = 3;

	/**
	 * The feature id for the '<em><b>Items</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VVALIDATION_DOCUMENT_INSTANTIABLE_GROUP__ITEMS = VVALIDATION_DOCUMENT_ABSTRACT_GROUP__ITEMS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VVALIDATION_DOCUMENT_INSTANTIABLE_GROUP__NAME = VVALIDATION_DOCUMENT_ABSTRACT_GROUP_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VVALIDATION_DOCUMENT_INSTANTIABLE_GROUP__DESCRIPTION = VVALIDATION_DOCUMENT_ABSTRACT_GROUP_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Prefix</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VVALIDATION_DOCUMENT_INSTANTIABLE_GROUP__PREFIX = VVALIDATION_DOCUMENT_ABSTRACT_GROUP_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>VValidation Document Instantiable Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VVALIDATION_DOCUMENT_INSTANTIABLE_GROUP_FEATURE_COUNT = VVALIDATION_DOCUMENT_ABSTRACT_GROUP_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>VValidation Document Instantiable Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VVALIDATION_DOCUMENT_INSTANTIABLE_GROUP_OPERATION_COUNT = VVALIDATION_DOCUMENT_ABSTRACT_GROUP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.micobs.svm.vdm.impl.VValidationDocumentAbstractItemImpl <em>VValidation Document Abstract Item</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uah.aut.srg.micobs.svm.vdm.impl.VValidationDocumentAbstractItemImpl
	 * @see es.uah.aut.srg.micobs.svm.vdm.impl.vdmPackageImpl#getVValidationDocumentAbstractItem()
	 * @generated
	 */
	int VVALIDATION_DOCUMENT_ABSTRACT_ITEM = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VVALIDATION_DOCUMENT_ABSTRACT_ITEM__NAME = 0;

	/**
	 * The feature id for the '<em><b>Validating Items</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VVALIDATION_DOCUMENT_ABSTRACT_ITEM__VALIDATING_ITEMS = 1;

	/**
	 * The number of structural features of the '<em>VValidation Document Abstract Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VVALIDATION_DOCUMENT_ABSTRACT_ITEM_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>VValidation Document Abstract Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VVALIDATION_DOCUMENT_ABSTRACT_ITEM_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.micobs.svm.vdm.VValidationDocument <em>VValidation Document</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>VValidation Document</em>'.
	 * @see es.uah.aut.srg.micobs.svm.vdm.VValidationDocument
	 * @generated
	 */
	EClass getVValidationDocument();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.micobs.svm.vdm.VValidationDocument#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see es.uah.aut.srg.micobs.svm.vdm.VValidationDocument#getName()
	 * @see #getVValidationDocument()
	 * @generated
	 */
	EAttribute getVValidationDocument_Name();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.micobs.svm.vdm.VValidationDocument#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see es.uah.aut.srg.micobs.svm.vdm.VValidationDocument#getId()
	 * @see #getVValidationDocument()
	 * @generated
	 */
	EAttribute getVValidationDocument_Id();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.micobs.svm.vdm.VValidationDocument#getIssue <em>Issue</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Issue</em>'.
	 * @see es.uah.aut.srg.micobs.svm.vdm.VValidationDocument#getIssue()
	 * @see #getVValidationDocument()
	 * @generated
	 */
	EAttribute getVValidationDocument_Issue();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.micobs.svm.vdm.VValidationDocument#getRevision <em>Revision</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Revision</em>'.
	 * @see es.uah.aut.srg.micobs.svm.vdm.VValidationDocument#getRevision()
	 * @see #getVValidationDocument()
	 * @generated
	 */
	EAttribute getVValidationDocument_Revision();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.micobs.svm.vdm.VValidationDocument#getDate <em>Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Date</em>'.
	 * @see es.uah.aut.srg.micobs.svm.vdm.VValidationDocument#getDate()
	 * @see #getVValidationDocument()
	 * @generated
	 */
	EAttribute getVValidationDocument_Date();

	/**
	 * Returns the meta object for the reference list '{@link es.uah.aut.srg.micobs.svm.vdm.VValidationDocument#getParents <em>Parents</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Parents</em>'.
	 * @see es.uah.aut.srg.micobs.svm.vdm.VValidationDocument#getParents()
	 * @see #getVValidationDocument()
	 * @generated
	 */
	EReference getVValidationDocument_Parents();

	/**
	 * Returns the meta object for the reference list '{@link es.uah.aut.srg.micobs.svm.vdm.VValidationDocument#getGroups <em>Groups</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Groups</em>'.
	 * @see es.uah.aut.srg.micobs.svm.vdm.VValidationDocument#getGroups()
	 * @see #getVValidationDocument()
	 * @generated
	 */
	EReference getVValidationDocument_Groups();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.micobs.svm.vdm.VValidationDocumentAbstractGroup <em>VValidation Document Abstract Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>VValidation Document Abstract Group</em>'.
	 * @see es.uah.aut.srg.micobs.svm.vdm.VValidationDocumentAbstractGroup
	 * @generated
	 */
	EClass getVValidationDocumentAbstractGroup();

	/**
	 * Returns the meta object for the reference list '{@link es.uah.aut.srg.micobs.svm.vdm.VValidationDocumentAbstractGroup#getItems <em>Items</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Items</em>'.
	 * @see es.uah.aut.srg.micobs.svm.vdm.VValidationDocumentAbstractGroup#getItems()
	 * @see #getVValidationDocumentAbstractGroup()
	 * @generated
	 */
	EReference getVValidationDocumentAbstractGroup_Items();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.micobs.svm.vdm.VValidationDocumentFixedGroup <em>VValidation Document Fixed Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>VValidation Document Fixed Group</em>'.
	 * @see es.uah.aut.srg.micobs.svm.vdm.VValidationDocumentFixedGroup
	 * @generated
	 */
	EClass getVValidationDocumentFixedGroup();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.micobs.svm.vdm.VValidationDocumentInstantiableGroup <em>VValidation Document Instantiable Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>VValidation Document Instantiable Group</em>'.
	 * @see es.uah.aut.srg.micobs.svm.vdm.VValidationDocumentInstantiableGroup
	 * @generated
	 */
	EClass getVValidationDocumentInstantiableGroup();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.micobs.svm.vdm.VValidationDocumentInstantiableGroup#getPrefix <em>Prefix</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Prefix</em>'.
	 * @see es.uah.aut.srg.micobs.svm.vdm.VValidationDocumentInstantiableGroup#getPrefix()
	 * @see #getVValidationDocumentInstantiableGroup()
	 * @generated
	 */
	EAttribute getVValidationDocumentInstantiableGroup_Prefix();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.micobs.svm.vdm.VValidationDocumentAbstractItem <em>VValidation Document Abstract Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>VValidation Document Abstract Item</em>'.
	 * @see es.uah.aut.srg.micobs.svm.vdm.VValidationDocumentAbstractItem
	 * @generated
	 */
	EClass getVValidationDocumentAbstractItem();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.micobs.svm.vdm.VValidationDocumentAbstractItem#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see es.uah.aut.srg.micobs.svm.vdm.VValidationDocumentAbstractItem#getName()
	 * @see #getVValidationDocumentAbstractItem()
	 * @generated
	 */
	EAttribute getVValidationDocumentAbstractItem_Name();

	/**
	 * Returns the meta object for the reference list '{@link es.uah.aut.srg.micobs.svm.vdm.VValidationDocumentAbstractItem#getValidatingItems <em>Validating Items</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Validating Items</em>'.
	 * @see es.uah.aut.srg.micobs.svm.vdm.VValidationDocumentAbstractItem#getValidatingItems()
	 * @see #getVValidationDocumentAbstractItem()
	 * @generated
	 */
	EReference getVValidationDocumentAbstractItem_ValidatingItems();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	vdmFactory getvdmFactory();

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
		 * The meta object literal for the '{@link es.uah.aut.srg.micobs.svm.vdm.impl.VValidationDocumentImpl <em>VValidation Document</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uah.aut.srg.micobs.svm.vdm.impl.VValidationDocumentImpl
		 * @see es.uah.aut.srg.micobs.svm.vdm.impl.vdmPackageImpl#getVValidationDocument()
		 * @generated
		 */
		EClass VVALIDATION_DOCUMENT = eINSTANCE.getVValidationDocument();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VVALIDATION_DOCUMENT__NAME = eINSTANCE.getVValidationDocument_Name();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VVALIDATION_DOCUMENT__ID = eINSTANCE.getVValidationDocument_Id();

		/**
		 * The meta object literal for the '<em><b>Issue</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VVALIDATION_DOCUMENT__ISSUE = eINSTANCE.getVValidationDocument_Issue();

		/**
		 * The meta object literal for the '<em><b>Revision</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VVALIDATION_DOCUMENT__REVISION = eINSTANCE.getVValidationDocument_Revision();

		/**
		 * The meta object literal for the '<em><b>Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VVALIDATION_DOCUMENT__DATE = eINSTANCE.getVValidationDocument_Date();

		/**
		 * The meta object literal for the '<em><b>Parents</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VVALIDATION_DOCUMENT__PARENTS = eINSTANCE.getVValidationDocument_Parents();

		/**
		 * The meta object literal for the '<em><b>Groups</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VVALIDATION_DOCUMENT__GROUPS = eINSTANCE.getVValidationDocument_Groups();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.micobs.svm.vdm.impl.VValidationDocumentAbstractGroupImpl <em>VValidation Document Abstract Group</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uah.aut.srg.micobs.svm.vdm.impl.VValidationDocumentAbstractGroupImpl
		 * @see es.uah.aut.srg.micobs.svm.vdm.impl.vdmPackageImpl#getVValidationDocumentAbstractGroup()
		 * @generated
		 */
		EClass VVALIDATION_DOCUMENT_ABSTRACT_GROUP = eINSTANCE.getVValidationDocumentAbstractGroup();

		/**
		 * The meta object literal for the '<em><b>Items</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VVALIDATION_DOCUMENT_ABSTRACT_GROUP__ITEMS = eINSTANCE.getVValidationDocumentAbstractGroup_Items();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.micobs.svm.vdm.impl.VValidationDocumentFixedGroupImpl <em>VValidation Document Fixed Group</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uah.aut.srg.micobs.svm.vdm.impl.VValidationDocumentFixedGroupImpl
		 * @see es.uah.aut.srg.micobs.svm.vdm.impl.vdmPackageImpl#getVValidationDocumentFixedGroup()
		 * @generated
		 */
		EClass VVALIDATION_DOCUMENT_FIXED_GROUP = eINSTANCE.getVValidationDocumentFixedGroup();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.micobs.svm.vdm.impl.VValidationDocumentInstantiableGroupImpl <em>VValidation Document Instantiable Group</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uah.aut.srg.micobs.svm.vdm.impl.VValidationDocumentInstantiableGroupImpl
		 * @see es.uah.aut.srg.micobs.svm.vdm.impl.vdmPackageImpl#getVValidationDocumentInstantiableGroup()
		 * @generated
		 */
		EClass VVALIDATION_DOCUMENT_INSTANTIABLE_GROUP = eINSTANCE.getVValidationDocumentInstantiableGroup();

		/**
		 * The meta object literal for the '<em><b>Prefix</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VVALIDATION_DOCUMENT_INSTANTIABLE_GROUP__PREFIX = eINSTANCE.getVValidationDocumentInstantiableGroup_Prefix();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.micobs.svm.vdm.impl.VValidationDocumentAbstractItemImpl <em>VValidation Document Abstract Item</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uah.aut.srg.micobs.svm.vdm.impl.VValidationDocumentAbstractItemImpl
		 * @see es.uah.aut.srg.micobs.svm.vdm.impl.vdmPackageImpl#getVValidationDocumentAbstractItem()
		 * @generated
		 */
		EClass VVALIDATION_DOCUMENT_ABSTRACT_ITEM = eINSTANCE.getVValidationDocumentAbstractItem();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VVALIDATION_DOCUMENT_ABSTRACT_ITEM__NAME = eINSTANCE.getVValidationDocumentAbstractItem_Name();

		/**
		 * The meta object literal for the '<em><b>Validating Items</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VVALIDATION_DOCUMENT_ABSTRACT_ITEM__VALIDATING_ITEMS = eINSTANCE.getVValidationDocumentAbstractItem_ValidatingItems();

	}

} //vdmPackage
