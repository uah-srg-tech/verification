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
	String eNS_PREFIX = "micobs.svm";

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
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VTRACEABLE_DOCUMENT__NAME = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VTRACEABLE_DOCUMENT__ID = 1;

	/**
	 * The feature id for the '<em><b>Issue</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VTRACEABLE_DOCUMENT__ISSUE = 2;

	/**
	 * The feature id for the '<em><b>Revision</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VTRACEABLE_DOCUMENT__REVISION = 3;

	/**
	 * The feature id for the '<em><b>Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VTRACEABLE_DOCUMENT__DATE = 4;

	/**
	 * The feature id for the '<em><b>Parents</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VTRACEABLE_DOCUMENT__PARENTS = 5;

	/**
	 * The feature id for the '<em><b>Groups</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VTRACEABLE_DOCUMENT__GROUPS = 6;

	/**
	 * The number of structural features of the '<em>VTraceable Document</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VTRACEABLE_DOCUMENT_FEATURE_COUNT = 7;

	/**
	 * The number of operations of the '<em>VTraceable Document</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VTRACEABLE_DOCUMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.micobs.svm.tdm.impl.VTraceableDocumentAbstractGroupImpl <em>VTraceable Document Abstract Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uah.aut.srg.micobs.svm.tdm.impl.VTraceableDocumentAbstractGroupImpl
	 * @see es.uah.aut.srg.micobs.svm.tdm.impl.tdmPackageImpl#getVTraceableDocumentAbstractGroup()
	 * @generated
	 */
	int VTRACEABLE_DOCUMENT_ABSTRACT_GROUP = 1;

	/**
	 * The feature id for the '<em><b>Items</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VTRACEABLE_DOCUMENT_ABSTRACT_GROUP__ITEMS = 0;

	/**
	 * The feature id for the '<em><b>Doc</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VTRACEABLE_DOCUMENT_ABSTRACT_GROUP__DOC = 1;

	/**
	 * The number of structural features of the '<em>VTraceable Document Abstract Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VTRACEABLE_DOCUMENT_ABSTRACT_GROUP_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>VTraceable Document Abstract Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VTRACEABLE_DOCUMENT_ABSTRACT_GROUP_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.micobs.svm.tdm.impl.VTraceableDocumentFixedGroupImpl <em>VTraceable Document Fixed Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uah.aut.srg.micobs.svm.tdm.impl.VTraceableDocumentFixedGroupImpl
	 * @see es.uah.aut.srg.micobs.svm.tdm.impl.tdmPackageImpl#getVTraceableDocumentFixedGroup()
	 * @generated
	 */
	int VTRACEABLE_DOCUMENT_FIXED_GROUP = 2;

	/**
	 * The feature id for the '<em><b>Items</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VTRACEABLE_DOCUMENT_FIXED_GROUP__ITEMS = VTRACEABLE_DOCUMENT_ABSTRACT_GROUP__ITEMS;

	/**
	 * The feature id for the '<em><b>Doc</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VTRACEABLE_DOCUMENT_FIXED_GROUP__DOC = VTRACEABLE_DOCUMENT_ABSTRACT_GROUP__DOC;

	/**
	 * The number of structural features of the '<em>VTraceable Document Fixed Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VTRACEABLE_DOCUMENT_FIXED_GROUP_FEATURE_COUNT = VTRACEABLE_DOCUMENT_ABSTRACT_GROUP_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>VTraceable Document Fixed Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VTRACEABLE_DOCUMENT_FIXED_GROUP_OPERATION_COUNT = VTRACEABLE_DOCUMENT_ABSTRACT_GROUP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.micobs.svm.tdm.impl.VTraceableDocumentInstantiableGroupImpl <em>VTraceable Document Instantiable Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uah.aut.srg.micobs.svm.tdm.impl.VTraceableDocumentInstantiableGroupImpl
	 * @see es.uah.aut.srg.micobs.svm.tdm.impl.tdmPackageImpl#getVTraceableDocumentInstantiableGroup()
	 * @generated
	 */
	int VTRACEABLE_DOCUMENT_INSTANTIABLE_GROUP = 3;

	/**
	 * The feature id for the '<em><b>Items</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VTRACEABLE_DOCUMENT_INSTANTIABLE_GROUP__ITEMS = VTRACEABLE_DOCUMENT_ABSTRACT_GROUP__ITEMS;

	/**
	 * The feature id for the '<em><b>Doc</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VTRACEABLE_DOCUMENT_INSTANTIABLE_GROUP__DOC = VTRACEABLE_DOCUMENT_ABSTRACT_GROUP__DOC;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VTRACEABLE_DOCUMENT_INSTANTIABLE_GROUP__NAME = VTRACEABLE_DOCUMENT_ABSTRACT_GROUP_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VTRACEABLE_DOCUMENT_INSTANTIABLE_GROUP__DESCRIPTION = VTRACEABLE_DOCUMENT_ABSTRACT_GROUP_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>VTraceable Document Instantiable Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VTRACEABLE_DOCUMENT_INSTANTIABLE_GROUP_FEATURE_COUNT = VTRACEABLE_DOCUMENT_ABSTRACT_GROUP_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>VTraceable Document Instantiable Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VTRACEABLE_DOCUMENT_INSTANTIABLE_GROUP_OPERATION_COUNT = VTRACEABLE_DOCUMENT_ABSTRACT_GROUP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.micobs.svm.tdm.impl.VTraceableDocumentAbstractItemImpl <em>VTraceable Document Abstract Item</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uah.aut.srg.micobs.svm.tdm.impl.VTraceableDocumentAbstractItemImpl
	 * @see es.uah.aut.srg.micobs.svm.tdm.impl.tdmPackageImpl#getVTraceableDocumentAbstractItem()
	 * @generated
	 */
	int VTRACEABLE_DOCUMENT_ABSTRACT_ITEM = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VTRACEABLE_DOCUMENT_ABSTRACT_ITEM__NAME = 0;

	/**
	 * The feature id for the '<em><b>Validation Method</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VTRACEABLE_DOCUMENT_ABSTRACT_ITEM__VALIDATION_METHOD = 1;

	/**
	 * The feature id for the '<em><b>Group</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VTRACEABLE_DOCUMENT_ABSTRACT_ITEM__GROUP = 2;

	/**
	 * The feature id for the '<em><b>Parent Item</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VTRACEABLE_DOCUMENT_ABSTRACT_ITEM__PARENT_ITEM = 3;

	/**
	 * The number of structural features of the '<em>VTraceable Document Abstract Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VTRACEABLE_DOCUMENT_ABSTRACT_ITEM_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>VTraceable Document Abstract Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VTRACEABLE_DOCUMENT_ABSTRACT_ITEM_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.micobs.svm.tdm.impl.VTraceableParentDocumentImpl <em>VTraceable Parent Document</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uah.aut.srg.micobs.svm.tdm.impl.VTraceableParentDocumentImpl
	 * @see es.uah.aut.srg.micobs.svm.tdm.impl.tdmPackageImpl#getVTraceableParentDocument()
	 * @generated
	 */
	int VTRACEABLE_PARENT_DOCUMENT = 5;

	/**
	 * The feature id for the '<em><b>Document</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VTRACEABLE_PARENT_DOCUMENT__DOCUMENT = 0;

	/**
	 * The feature id for the '<em><b>Not Applicable Item</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VTRACEABLE_PARENT_DOCUMENT__NOT_APPLICABLE_ITEM = 1;

	/**
	 * The number of structural features of the '<em>VTraceable Parent Document</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VTRACEABLE_PARENT_DOCUMENT_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>VTraceable Parent Document</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VTRACEABLE_PARENT_DOCUMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.micobs.svm.tdm.VValidationMethod <em>VValidation Method</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uah.aut.srg.micobs.svm.tdm.VValidationMethod
	 * @see es.uah.aut.srg.micobs.svm.tdm.impl.tdmPackageImpl#getVValidationMethod()
	 * @generated
	 */
	int VVALIDATION_METHOD = 6;

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
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.micobs.svm.tdm.VTraceableDocument#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see es.uah.aut.srg.micobs.svm.tdm.VTraceableDocument#getName()
	 * @see #getVTraceableDocument()
	 * @generated
	 */
	EAttribute getVTraceableDocument_Name();

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
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.micobs.svm.tdm.VTraceableDocument#getRevision <em>Revision</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Revision</em>'.
	 * @see es.uah.aut.srg.micobs.svm.tdm.VTraceableDocument#getRevision()
	 * @see #getVTraceableDocument()
	 * @generated
	 */
	EAttribute getVTraceableDocument_Revision();

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
	 * Returns the meta object for the containment reference list '{@link es.uah.aut.srg.micobs.svm.tdm.VTraceableDocument#getParents <em>Parents</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Parents</em>'.
	 * @see es.uah.aut.srg.micobs.svm.tdm.VTraceableDocument#getParents()
	 * @see #getVTraceableDocument()
	 * @generated
	 */
	EReference getVTraceableDocument_Parents();

	/**
	 * Returns the meta object for the reference list '{@link es.uah.aut.srg.micobs.svm.tdm.VTraceableDocument#getGroups <em>Groups</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Groups</em>'.
	 * @see es.uah.aut.srg.micobs.svm.tdm.VTraceableDocument#getGroups()
	 * @see #getVTraceableDocument()
	 * @generated
	 */
	EReference getVTraceableDocument_Groups();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.micobs.svm.tdm.VTraceableDocumentAbstractGroup <em>VTraceable Document Abstract Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>VTraceable Document Abstract Group</em>'.
	 * @see es.uah.aut.srg.micobs.svm.tdm.VTraceableDocumentAbstractGroup
	 * @generated
	 */
	EClass getVTraceableDocumentAbstractGroup();

	/**
	 * Returns the meta object for the reference list '{@link es.uah.aut.srg.micobs.svm.tdm.VTraceableDocumentAbstractGroup#getItems <em>Items</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Items</em>'.
	 * @see es.uah.aut.srg.micobs.svm.tdm.VTraceableDocumentAbstractGroup#getItems()
	 * @see #getVTraceableDocumentAbstractGroup()
	 * @generated
	 */
	EReference getVTraceableDocumentAbstractGroup_Items();

	/**
	 * Returns the meta object for the reference '{@link es.uah.aut.srg.micobs.svm.tdm.VTraceableDocumentAbstractGroup#getDoc <em>Doc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Doc</em>'.
	 * @see es.uah.aut.srg.micobs.svm.tdm.VTraceableDocumentAbstractGroup#getDoc()
	 * @see #getVTraceableDocumentAbstractGroup()
	 * @generated
	 */
	EReference getVTraceableDocumentAbstractGroup_Doc();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.micobs.svm.tdm.VTraceableDocumentFixedGroup <em>VTraceable Document Fixed Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>VTraceable Document Fixed Group</em>'.
	 * @see es.uah.aut.srg.micobs.svm.tdm.VTraceableDocumentFixedGroup
	 * @generated
	 */
	EClass getVTraceableDocumentFixedGroup();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.micobs.svm.tdm.VTraceableDocumentInstantiableGroup <em>VTraceable Document Instantiable Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>VTraceable Document Instantiable Group</em>'.
	 * @see es.uah.aut.srg.micobs.svm.tdm.VTraceableDocumentInstantiableGroup
	 * @generated
	 */
	EClass getVTraceableDocumentInstantiableGroup();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.micobs.svm.tdm.VTraceableDocumentAbstractItem <em>VTraceable Document Abstract Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>VTraceable Document Abstract Item</em>'.
	 * @see es.uah.aut.srg.micobs.svm.tdm.VTraceableDocumentAbstractItem
	 * @generated
	 */
	EClass getVTraceableDocumentAbstractItem();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.micobs.svm.tdm.VTraceableDocumentAbstractItem#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see es.uah.aut.srg.micobs.svm.tdm.VTraceableDocumentAbstractItem#getName()
	 * @see #getVTraceableDocumentAbstractItem()
	 * @generated
	 */
	EAttribute getVTraceableDocumentAbstractItem_Name();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.micobs.svm.tdm.VTraceableDocumentAbstractItem#getValidationMethod <em>Validation Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Validation Method</em>'.
	 * @see es.uah.aut.srg.micobs.svm.tdm.VTraceableDocumentAbstractItem#getValidationMethod()
	 * @see #getVTraceableDocumentAbstractItem()
	 * @generated
	 */
	EAttribute getVTraceableDocumentAbstractItem_ValidationMethod();

	/**
	 * Returns the meta object for the reference '{@link es.uah.aut.srg.micobs.svm.tdm.VTraceableDocumentAbstractItem#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Group</em>'.
	 * @see es.uah.aut.srg.micobs.svm.tdm.VTraceableDocumentAbstractItem#getGroup()
	 * @see #getVTraceableDocumentAbstractItem()
	 * @generated
	 */
	EReference getVTraceableDocumentAbstractItem_Group();

	/**
	 * Returns the meta object for the reference list '{@link es.uah.aut.srg.micobs.svm.tdm.VTraceableDocumentAbstractItem#getParentItem <em>Parent Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Parent Item</em>'.
	 * @see es.uah.aut.srg.micobs.svm.tdm.VTraceableDocumentAbstractItem#getParentItem()
	 * @see #getVTraceableDocumentAbstractItem()
	 * @generated
	 */
	EReference getVTraceableDocumentAbstractItem_ParentItem();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.micobs.svm.tdm.VTraceableParentDocument <em>VTraceable Parent Document</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>VTraceable Parent Document</em>'.
	 * @see es.uah.aut.srg.micobs.svm.tdm.VTraceableParentDocument
	 * @generated
	 */
	EClass getVTraceableParentDocument();

	/**
	 * Returns the meta object for the reference '{@link es.uah.aut.srg.micobs.svm.tdm.VTraceableParentDocument#getDocument <em>Document</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Document</em>'.
	 * @see es.uah.aut.srg.micobs.svm.tdm.VTraceableParentDocument#getDocument()
	 * @see #getVTraceableParentDocument()
	 * @generated
	 */
	EReference getVTraceableParentDocument_Document();

	/**
	 * Returns the meta object for the reference list '{@link es.uah.aut.srg.micobs.svm.tdm.VTraceableParentDocument#getNotApplicableItem <em>Not Applicable Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Not Applicable Item</em>'.
	 * @see es.uah.aut.srg.micobs.svm.tdm.VTraceableParentDocument#getNotApplicableItem()
	 * @see #getVTraceableParentDocument()
	 * @generated
	 */
	EReference getVTraceableParentDocument_NotApplicableItem();

	/**
	 * Returns the meta object for enum '{@link es.uah.aut.srg.micobs.svm.tdm.VValidationMethod <em>VValidation Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>VValidation Method</em>'.
	 * @see es.uah.aut.srg.micobs.svm.tdm.VValidationMethod
	 * @generated
	 */
	EEnum getVValidationMethod();

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
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VTRACEABLE_DOCUMENT__NAME = eINSTANCE.getVTraceableDocument_Name();

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
		 * The meta object literal for the '<em><b>Revision</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VTRACEABLE_DOCUMENT__REVISION = eINSTANCE.getVTraceableDocument_Revision();

		/**
		 * The meta object literal for the '<em><b>Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VTRACEABLE_DOCUMENT__DATE = eINSTANCE.getVTraceableDocument_Date();

		/**
		 * The meta object literal for the '<em><b>Parents</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VTRACEABLE_DOCUMENT__PARENTS = eINSTANCE.getVTraceableDocument_Parents();

		/**
		 * The meta object literal for the '<em><b>Groups</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VTRACEABLE_DOCUMENT__GROUPS = eINSTANCE.getVTraceableDocument_Groups();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.micobs.svm.tdm.impl.VTraceableDocumentAbstractGroupImpl <em>VTraceable Document Abstract Group</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uah.aut.srg.micobs.svm.tdm.impl.VTraceableDocumentAbstractGroupImpl
		 * @see es.uah.aut.srg.micobs.svm.tdm.impl.tdmPackageImpl#getVTraceableDocumentAbstractGroup()
		 * @generated
		 */
		EClass VTRACEABLE_DOCUMENT_ABSTRACT_GROUP = eINSTANCE.getVTraceableDocumentAbstractGroup();

		/**
		 * The meta object literal for the '<em><b>Items</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VTRACEABLE_DOCUMENT_ABSTRACT_GROUP__ITEMS = eINSTANCE.getVTraceableDocumentAbstractGroup_Items();

		/**
		 * The meta object literal for the '<em><b>Doc</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VTRACEABLE_DOCUMENT_ABSTRACT_GROUP__DOC = eINSTANCE.getVTraceableDocumentAbstractGroup_Doc();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.micobs.svm.tdm.impl.VTraceableDocumentFixedGroupImpl <em>VTraceable Document Fixed Group</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uah.aut.srg.micobs.svm.tdm.impl.VTraceableDocumentFixedGroupImpl
		 * @see es.uah.aut.srg.micobs.svm.tdm.impl.tdmPackageImpl#getVTraceableDocumentFixedGroup()
		 * @generated
		 */
		EClass VTRACEABLE_DOCUMENT_FIXED_GROUP = eINSTANCE.getVTraceableDocumentFixedGroup();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.micobs.svm.tdm.impl.VTraceableDocumentInstantiableGroupImpl <em>VTraceable Document Instantiable Group</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uah.aut.srg.micobs.svm.tdm.impl.VTraceableDocumentInstantiableGroupImpl
		 * @see es.uah.aut.srg.micobs.svm.tdm.impl.tdmPackageImpl#getVTraceableDocumentInstantiableGroup()
		 * @generated
		 */
		EClass VTRACEABLE_DOCUMENT_INSTANTIABLE_GROUP = eINSTANCE.getVTraceableDocumentInstantiableGroup();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.micobs.svm.tdm.impl.VTraceableDocumentAbstractItemImpl <em>VTraceable Document Abstract Item</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uah.aut.srg.micobs.svm.tdm.impl.VTraceableDocumentAbstractItemImpl
		 * @see es.uah.aut.srg.micobs.svm.tdm.impl.tdmPackageImpl#getVTraceableDocumentAbstractItem()
		 * @generated
		 */
		EClass VTRACEABLE_DOCUMENT_ABSTRACT_ITEM = eINSTANCE.getVTraceableDocumentAbstractItem();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VTRACEABLE_DOCUMENT_ABSTRACT_ITEM__NAME = eINSTANCE.getVTraceableDocumentAbstractItem_Name();

		/**
		 * The meta object literal for the '<em><b>Validation Method</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VTRACEABLE_DOCUMENT_ABSTRACT_ITEM__VALIDATION_METHOD = eINSTANCE.getVTraceableDocumentAbstractItem_ValidationMethod();

		/**
		 * The meta object literal for the '<em><b>Group</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VTRACEABLE_DOCUMENT_ABSTRACT_ITEM__GROUP = eINSTANCE.getVTraceableDocumentAbstractItem_Group();

		/**
		 * The meta object literal for the '<em><b>Parent Item</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VTRACEABLE_DOCUMENT_ABSTRACT_ITEM__PARENT_ITEM = eINSTANCE.getVTraceableDocumentAbstractItem_ParentItem();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.micobs.svm.tdm.impl.VTraceableParentDocumentImpl <em>VTraceable Parent Document</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uah.aut.srg.micobs.svm.tdm.impl.VTraceableParentDocumentImpl
		 * @see es.uah.aut.srg.micobs.svm.tdm.impl.tdmPackageImpl#getVTraceableParentDocument()
		 * @generated
		 */
		EClass VTRACEABLE_PARENT_DOCUMENT = eINSTANCE.getVTraceableParentDocument();

		/**
		 * The meta object literal for the '<em><b>Document</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VTRACEABLE_PARENT_DOCUMENT__DOCUMENT = eINSTANCE.getVTraceableParentDocument_Document();

		/**
		 * The meta object literal for the '<em><b>Not Applicable Item</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VTRACEABLE_PARENT_DOCUMENT__NOT_APPLICABLE_ITEM = eINSTANCE.getVTraceableParentDocument_NotApplicableItem();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.micobs.svm.tdm.VValidationMethod <em>VValidation Method</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uah.aut.srg.micobs.svm.tdm.VValidationMethod
		 * @see es.uah.aut.srg.micobs.svm.tdm.impl.tdmPackageImpl#getVValidationMethod()
		 * @generated
		 */
		EEnum VVALIDATION_METHOD = eINSTANCE.getVValidationMethod();

	}

} //tdmPackage
