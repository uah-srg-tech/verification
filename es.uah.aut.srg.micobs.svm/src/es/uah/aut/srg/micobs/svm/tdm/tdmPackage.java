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
	 * The feature id for the '<em><b>Revision</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VTRACEABLE_DOCUMENT__REVISION = commonPackage.MCOMMON_PACKAGE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VTRACEABLE_DOCUMENT__DATE = commonPackage.MCOMMON_PACKAGE_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Sections</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VTRACEABLE_DOCUMENT__SECTIONS = commonPackage.MCOMMON_PACKAGE_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Parents</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VTRACEABLE_DOCUMENT__PARENTS = commonPackage.MCOMMON_PACKAGE_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Groups</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VTRACEABLE_DOCUMENT__GROUPS = commonPackage.MCOMMON_PACKAGE_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>VTraceable Document</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VTRACEABLE_DOCUMENT_FEATURE_COUNT = commonPackage.MCOMMON_PACKAGE_ELEMENT_FEATURE_COUNT + 7;

	/**
	 * The number of operations of the '<em>VTraceable Document</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VTRACEABLE_DOCUMENT_OPERATION_COUNT = commonPackage.MCOMMON_PACKAGE_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.micobs.svm.tdm.impl.VTraceableDocumentAbstractSectionImpl <em>VTraceable Document Abstract Section</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uah.aut.srg.micobs.svm.tdm.impl.VTraceableDocumentAbstractSectionImpl
	 * @see es.uah.aut.srg.micobs.svm.tdm.impl.tdmPackageImpl#getVTraceableDocumentAbstractSection()
	 * @generated
	 */
	int VTRACEABLE_DOCUMENT_ABSTRACT_SECTION = 1;

	/**
	 * The feature id for the '<em><b>Prefix</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VTRACEABLE_DOCUMENT_ABSTRACT_SECTION__PREFIX = 0;

	/**
	 * The feature id for the '<em><b>Groups</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VTRACEABLE_DOCUMENT_ABSTRACT_SECTION__GROUPS = 1;

	/**
	 * The feature id for the '<em><b>Document</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VTRACEABLE_DOCUMENT_ABSTRACT_SECTION__DOCUMENT = 2;

	/**
	 * The number of structural features of the '<em>VTraceable Document Abstract Section</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VTRACEABLE_DOCUMENT_ABSTRACT_SECTION_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>VTraceable Document Abstract Section</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VTRACEABLE_DOCUMENT_ABSTRACT_SECTION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.micobs.svm.tdm.impl.VTraceableDocumentFixedSectionImpl <em>VTraceable Document Fixed Section</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uah.aut.srg.micobs.svm.tdm.impl.VTraceableDocumentFixedSectionImpl
	 * @see es.uah.aut.srg.micobs.svm.tdm.impl.tdmPackageImpl#getVTraceableDocumentFixedSection()
	 * @generated
	 */
	int VTRACEABLE_DOCUMENT_FIXED_SECTION = 2;

	/**
	 * The feature id for the '<em><b>Prefix</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VTRACEABLE_DOCUMENT_FIXED_SECTION__PREFIX = VTRACEABLE_DOCUMENT_ABSTRACT_SECTION__PREFIX;

	/**
	 * The feature id for the '<em><b>Groups</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VTRACEABLE_DOCUMENT_FIXED_SECTION__GROUPS = VTRACEABLE_DOCUMENT_ABSTRACT_SECTION__GROUPS;

	/**
	 * The feature id for the '<em><b>Document</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VTRACEABLE_DOCUMENT_FIXED_SECTION__DOCUMENT = VTRACEABLE_DOCUMENT_ABSTRACT_SECTION__DOCUMENT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VTRACEABLE_DOCUMENT_FIXED_SECTION__NAME = VTRACEABLE_DOCUMENT_ABSTRACT_SECTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>VTraceable Document Fixed Section</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VTRACEABLE_DOCUMENT_FIXED_SECTION_FEATURE_COUNT = VTRACEABLE_DOCUMENT_ABSTRACT_SECTION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>VTraceable Document Fixed Section</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VTRACEABLE_DOCUMENT_FIXED_SECTION_OPERATION_COUNT = VTRACEABLE_DOCUMENT_ABSTRACT_SECTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.micobs.svm.tdm.impl.VTraceableDocumentInstantiableSectionImpl <em>VTraceable Document Instantiable Section</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uah.aut.srg.micobs.svm.tdm.impl.VTraceableDocumentInstantiableSectionImpl
	 * @see es.uah.aut.srg.micobs.svm.tdm.impl.tdmPackageImpl#getVTraceableDocumentInstantiableSection()
	 * @generated
	 */
	int VTRACEABLE_DOCUMENT_INSTANTIABLE_SECTION = 3;

	/**
	 * The feature id for the '<em><b>Prefix</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VTRACEABLE_DOCUMENT_INSTANTIABLE_SECTION__PREFIX = VTRACEABLE_DOCUMENT_ABSTRACT_SECTION__PREFIX;

	/**
	 * The feature id for the '<em><b>Groups</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VTRACEABLE_DOCUMENT_INSTANTIABLE_SECTION__GROUPS = VTRACEABLE_DOCUMENT_ABSTRACT_SECTION__GROUPS;

	/**
	 * The feature id for the '<em><b>Document</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VTRACEABLE_DOCUMENT_INSTANTIABLE_SECTION__DOCUMENT = VTRACEABLE_DOCUMENT_ABSTRACT_SECTION__DOCUMENT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VTRACEABLE_DOCUMENT_INSTANTIABLE_SECTION__NAME = VTRACEABLE_DOCUMENT_ABSTRACT_SECTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VTRACEABLE_DOCUMENT_INSTANTIABLE_SECTION__DESCRIPTION = VTRACEABLE_DOCUMENT_ABSTRACT_SECTION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>VTraceable Document Instantiable Section</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VTRACEABLE_DOCUMENT_INSTANTIABLE_SECTION_FEATURE_COUNT = VTRACEABLE_DOCUMENT_ABSTRACT_SECTION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>VTraceable Document Instantiable Section</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VTRACEABLE_DOCUMENT_INSTANTIABLE_SECTION_OPERATION_COUNT = VTRACEABLE_DOCUMENT_ABSTRACT_SECTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.micobs.svm.tdm.impl.VTraceableDocumentAbstractGroupImpl <em>VTraceable Document Abstract Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uah.aut.srg.micobs.svm.tdm.impl.VTraceableDocumentAbstractGroupImpl
	 * @see es.uah.aut.srg.micobs.svm.tdm.impl.tdmPackageImpl#getVTraceableDocumentAbstractGroup()
	 * @generated
	 */
	int VTRACEABLE_DOCUMENT_ABSTRACT_GROUP = 4;

	/**
	 * The feature id for the '<em><b>Prefix</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VTRACEABLE_DOCUMENT_ABSTRACT_GROUP__PREFIX = 0;

	/**
	 * The feature id for the '<em><b>Items</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VTRACEABLE_DOCUMENT_ABSTRACT_GROUP__ITEMS = 1;

	/**
	 * The feature id for the '<em><b>Section</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VTRACEABLE_DOCUMENT_ABSTRACT_GROUP__SECTION = 2;

	/**
	 * The number of structural features of the '<em>VTraceable Document Abstract Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VTRACEABLE_DOCUMENT_ABSTRACT_GROUP_FEATURE_COUNT = 3;

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
	int VTRACEABLE_DOCUMENT_FIXED_GROUP = 5;

	/**
	 * The feature id for the '<em><b>Prefix</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VTRACEABLE_DOCUMENT_FIXED_GROUP__PREFIX = VTRACEABLE_DOCUMENT_ABSTRACT_GROUP__PREFIX;

	/**
	 * The feature id for the '<em><b>Items</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VTRACEABLE_DOCUMENT_FIXED_GROUP__ITEMS = VTRACEABLE_DOCUMENT_ABSTRACT_GROUP__ITEMS;

	/**
	 * The feature id for the '<em><b>Section</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VTRACEABLE_DOCUMENT_FIXED_GROUP__SECTION = VTRACEABLE_DOCUMENT_ABSTRACT_GROUP__SECTION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VTRACEABLE_DOCUMENT_FIXED_GROUP__NAME = VTRACEABLE_DOCUMENT_ABSTRACT_GROUP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>VTraceable Document Fixed Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VTRACEABLE_DOCUMENT_FIXED_GROUP_FEATURE_COUNT = VTRACEABLE_DOCUMENT_ABSTRACT_GROUP_FEATURE_COUNT + 1;

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
	int VTRACEABLE_DOCUMENT_INSTANTIABLE_GROUP = 6;

	/**
	 * The feature id for the '<em><b>Prefix</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VTRACEABLE_DOCUMENT_INSTANTIABLE_GROUP__PREFIX = VTRACEABLE_DOCUMENT_ABSTRACT_GROUP__PREFIX;

	/**
	 * The feature id for the '<em><b>Items</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VTRACEABLE_DOCUMENT_INSTANTIABLE_GROUP__ITEMS = VTRACEABLE_DOCUMENT_ABSTRACT_GROUP__ITEMS;

	/**
	 * The feature id for the '<em><b>Section</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VTRACEABLE_DOCUMENT_INSTANTIABLE_GROUP__SECTION = VTRACEABLE_DOCUMENT_ABSTRACT_GROUP__SECTION;

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
	 * The meta object id for the '{@link es.uah.aut.srg.micobs.svm.tdm.impl.VTraceableDocumentItemImpl <em>VTraceable Document Item</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uah.aut.srg.micobs.svm.tdm.impl.VTraceableDocumentItemImpl
	 * @see es.uah.aut.srg.micobs.svm.tdm.impl.tdmPackageImpl#getVTraceableDocumentItem()
	 * @generated
	 */
	int VTRACEABLE_DOCUMENT_ITEM = 7;

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
	 * The feature id for the '<em><b>Group</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VTRACEABLE_DOCUMENT_ITEM__GROUP = commonPackage.MCOMMON_REFERENCEABLE_OBJ_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>VTraceable Document Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VTRACEABLE_DOCUMENT_ITEM_FEATURE_COUNT = commonPackage.MCOMMON_REFERENCEABLE_OBJ_FEATURE_COUNT + 3;

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
	int VVERIFICATION_METHOD = 8;


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
	 * Returns the meta object for the reference list '{@link es.uah.aut.srg.micobs.svm.tdm.VTraceableDocument#getSections <em>Sections</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Sections</em>'.
	 * @see es.uah.aut.srg.micobs.svm.tdm.VTraceableDocument#getSections()
	 * @see #getVTraceableDocument()
	 * @generated
	 */
	EReference getVTraceableDocument_Sections();

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
	 * Returns the meta object for class '{@link es.uah.aut.srg.micobs.svm.tdm.VTraceableDocumentAbstractSection <em>VTraceable Document Abstract Section</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>VTraceable Document Abstract Section</em>'.
	 * @see es.uah.aut.srg.micobs.svm.tdm.VTraceableDocumentAbstractSection
	 * @generated
	 */
	EClass getVTraceableDocumentAbstractSection();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.micobs.svm.tdm.VTraceableDocumentAbstractSection#getPrefix <em>Prefix</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Prefix</em>'.
	 * @see es.uah.aut.srg.micobs.svm.tdm.VTraceableDocumentAbstractSection#getPrefix()
	 * @see #getVTraceableDocumentAbstractSection()
	 * @generated
	 */
	EAttribute getVTraceableDocumentAbstractSection_Prefix();

	/**
	 * Returns the meta object for the reference list '{@link es.uah.aut.srg.micobs.svm.tdm.VTraceableDocumentAbstractSection#getGroups <em>Groups</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Groups</em>'.
	 * @see es.uah.aut.srg.micobs.svm.tdm.VTraceableDocumentAbstractSection#getGroups()
	 * @see #getVTraceableDocumentAbstractSection()
	 * @generated
	 */
	EReference getVTraceableDocumentAbstractSection_Groups();

	/**
	 * Returns the meta object for the reference '{@link es.uah.aut.srg.micobs.svm.tdm.VTraceableDocumentAbstractSection#getDocument <em>Document</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Document</em>'.
	 * @see es.uah.aut.srg.micobs.svm.tdm.VTraceableDocumentAbstractSection#getDocument()
	 * @see #getVTraceableDocumentAbstractSection()
	 * @generated
	 */
	EReference getVTraceableDocumentAbstractSection_Document();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.micobs.svm.tdm.VTraceableDocumentFixedSection <em>VTraceable Document Fixed Section</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>VTraceable Document Fixed Section</em>'.
	 * @see es.uah.aut.srg.micobs.svm.tdm.VTraceableDocumentFixedSection
	 * @generated
	 */
	EClass getVTraceableDocumentFixedSection();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.micobs.svm.tdm.VTraceableDocumentFixedSection#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see es.uah.aut.srg.micobs.svm.tdm.VTraceableDocumentFixedSection#getName()
	 * @see #getVTraceableDocumentFixedSection()
	 * @generated
	 */
	EAttribute getVTraceableDocumentFixedSection_Name();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.micobs.svm.tdm.VTraceableDocumentInstantiableSection <em>VTraceable Document Instantiable Section</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>VTraceable Document Instantiable Section</em>'.
	 * @see es.uah.aut.srg.micobs.svm.tdm.VTraceableDocumentInstantiableSection
	 * @generated
	 */
	EClass getVTraceableDocumentInstantiableSection();

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
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.micobs.svm.tdm.VTraceableDocumentAbstractGroup#getPrefix <em>Prefix</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Prefix</em>'.
	 * @see es.uah.aut.srg.micobs.svm.tdm.VTraceableDocumentAbstractGroup#getPrefix()
	 * @see #getVTraceableDocumentAbstractGroup()
	 * @generated
	 */
	EAttribute getVTraceableDocumentAbstractGroup_Prefix();

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
	 * Returns the meta object for the reference '{@link es.uah.aut.srg.micobs.svm.tdm.VTraceableDocumentAbstractGroup#getSection <em>Section</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Section</em>'.
	 * @see es.uah.aut.srg.micobs.svm.tdm.VTraceableDocumentAbstractGroup#getSection()
	 * @see #getVTraceableDocumentAbstractGroup()
	 * @generated
	 */
	EReference getVTraceableDocumentAbstractGroup_Section();

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
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.micobs.svm.tdm.VTraceableDocumentFixedGroup#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see es.uah.aut.srg.micobs.svm.tdm.VTraceableDocumentFixedGroup#getName()
	 * @see #getVTraceableDocumentFixedGroup()
	 * @generated
	 */
	EAttribute getVTraceableDocumentFixedGroup_Name();

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
	 * Returns the meta object for the reference '{@link es.uah.aut.srg.micobs.svm.tdm.VTraceableDocumentItem#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Group</em>'.
	 * @see es.uah.aut.srg.micobs.svm.tdm.VTraceableDocumentItem#getGroup()
	 * @see #getVTraceableDocumentItem()
	 * @generated
	 */
	EReference getVTraceableDocumentItem_Group();

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
		 * The meta object literal for the '<em><b>Sections</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VTRACEABLE_DOCUMENT__SECTIONS = eINSTANCE.getVTraceableDocument_Sections();

		/**
		 * The meta object literal for the '<em><b>Parents</b></em>' reference list feature.
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
		 * The meta object literal for the '{@link es.uah.aut.srg.micobs.svm.tdm.impl.VTraceableDocumentAbstractSectionImpl <em>VTraceable Document Abstract Section</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uah.aut.srg.micobs.svm.tdm.impl.VTraceableDocumentAbstractSectionImpl
		 * @see es.uah.aut.srg.micobs.svm.tdm.impl.tdmPackageImpl#getVTraceableDocumentAbstractSection()
		 * @generated
		 */
		EClass VTRACEABLE_DOCUMENT_ABSTRACT_SECTION = eINSTANCE.getVTraceableDocumentAbstractSection();

		/**
		 * The meta object literal for the '<em><b>Prefix</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VTRACEABLE_DOCUMENT_ABSTRACT_SECTION__PREFIX = eINSTANCE.getVTraceableDocumentAbstractSection_Prefix();

		/**
		 * The meta object literal for the '<em><b>Groups</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VTRACEABLE_DOCUMENT_ABSTRACT_SECTION__GROUPS = eINSTANCE.getVTraceableDocumentAbstractSection_Groups();

		/**
		 * The meta object literal for the '<em><b>Document</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VTRACEABLE_DOCUMENT_ABSTRACT_SECTION__DOCUMENT = eINSTANCE.getVTraceableDocumentAbstractSection_Document();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.micobs.svm.tdm.impl.VTraceableDocumentFixedSectionImpl <em>VTraceable Document Fixed Section</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uah.aut.srg.micobs.svm.tdm.impl.VTraceableDocumentFixedSectionImpl
		 * @see es.uah.aut.srg.micobs.svm.tdm.impl.tdmPackageImpl#getVTraceableDocumentFixedSection()
		 * @generated
		 */
		EClass VTRACEABLE_DOCUMENT_FIXED_SECTION = eINSTANCE.getVTraceableDocumentFixedSection();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VTRACEABLE_DOCUMENT_FIXED_SECTION__NAME = eINSTANCE.getVTraceableDocumentFixedSection_Name();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.micobs.svm.tdm.impl.VTraceableDocumentInstantiableSectionImpl <em>VTraceable Document Instantiable Section</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uah.aut.srg.micobs.svm.tdm.impl.VTraceableDocumentInstantiableSectionImpl
		 * @see es.uah.aut.srg.micobs.svm.tdm.impl.tdmPackageImpl#getVTraceableDocumentInstantiableSection()
		 * @generated
		 */
		EClass VTRACEABLE_DOCUMENT_INSTANTIABLE_SECTION = eINSTANCE.getVTraceableDocumentInstantiableSection();

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
		 * The meta object literal for the '<em><b>Prefix</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VTRACEABLE_DOCUMENT_ABSTRACT_GROUP__PREFIX = eINSTANCE.getVTraceableDocumentAbstractGroup_Prefix();

		/**
		 * The meta object literal for the '<em><b>Items</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VTRACEABLE_DOCUMENT_ABSTRACT_GROUP__ITEMS = eINSTANCE.getVTraceableDocumentAbstractGroup_Items();

		/**
		 * The meta object literal for the '<em><b>Section</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VTRACEABLE_DOCUMENT_ABSTRACT_GROUP__SECTION = eINSTANCE.getVTraceableDocumentAbstractGroup_Section();

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
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VTRACEABLE_DOCUMENT_FIXED_GROUP__NAME = eINSTANCE.getVTraceableDocumentFixedGroup_Name();

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
		 * The meta object literal for the '<em><b>Group</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VTRACEABLE_DOCUMENT_ITEM__GROUP = eINSTANCE.getVTraceableDocumentItem_Group();

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
