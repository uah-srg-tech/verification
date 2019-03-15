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

import es.uah.aut.srg.micobs.common.commonPackage;

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
	String eNS_PREFIX = "svm";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	vdmPackage eINSTANCE = es.uah.aut.srg.micobs.svm.vdm.impl.vdmPackageImpl.init();

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.micobs.svm.vdm.impl.VVerificationDocumentImpl <em>VVerification Document</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uah.aut.srg.micobs.svm.vdm.impl.VVerificationDocumentImpl
	 * @see es.uah.aut.srg.micobs.svm.vdm.impl.vdmPackageImpl#getVVerificationDocument()
	 * @generated
	 */
	int VVERIFICATION_DOCUMENT = 0;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VVERIFICATION_DOCUMENT__VERSION = commonPackage.MCOMMON_PACKAGE_ELEMENT__VERSION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VVERIFICATION_DOCUMENT__NAME = commonPackage.MCOMMON_PACKAGE_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VVERIFICATION_DOCUMENT__URI = commonPackage.MCOMMON_PACKAGE_ELEMENT__URI;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VVERIFICATION_DOCUMENT__ID = commonPackage.MCOMMON_PACKAGE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Issue</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VVERIFICATION_DOCUMENT__ISSUE = commonPackage.MCOMMON_PACKAGE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VVERIFICATION_DOCUMENT__DATE = commonPackage.MCOMMON_PACKAGE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Item</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VVERIFICATION_DOCUMENT__ITEM = commonPackage.MCOMMON_PACKAGE_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>VVerification Document</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VVERIFICATION_DOCUMENT_FEATURE_COUNT = commonPackage.MCOMMON_PACKAGE_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>VVerification Document</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VVERIFICATION_DOCUMENT_OPERATION_COUNT = commonPackage.MCOMMON_PACKAGE_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.micobs.svm.vdm.impl.VVerificationDocumentItemImpl <em>VVerification Document Item</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uah.aut.srg.micobs.svm.vdm.impl.VVerificationDocumentItemImpl
	 * @see es.uah.aut.srg.micobs.svm.vdm.impl.vdmPackageImpl#getVVerificationDocumentItem()
	 * @generated
	 */
	int VVERIFICATION_DOCUMENT_ITEM = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VVERIFICATION_DOCUMENT_ITEM__NAME = commonPackage.MCOMMON_REFERENCEABLE_OBJ__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VVERIFICATION_DOCUMENT_ITEM__DESCRIPTION = commonPackage.MCOMMON_REFERENCEABLE_OBJ__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VVERIFICATION_DOCUMENT_ITEM__ID = commonPackage.MCOMMON_REFERENCEABLE_OBJ_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Evidence Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VVERIFICATION_DOCUMENT_ITEM__EVIDENCE_OF = commonPackage.MCOMMON_REFERENCEABLE_OBJ_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>VVerification Document Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VVERIFICATION_DOCUMENT_ITEM_FEATURE_COUNT = commonPackage.MCOMMON_REFERENCEABLE_OBJ_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>VVerification Document Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VVERIFICATION_DOCUMENT_ITEM_OPERATION_COUNT = commonPackage.MCOMMON_REFERENCEABLE_OBJ_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.micobs.svm.vdm.VVerificationDocument <em>VVerification Document</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>VVerification Document</em>'.
	 * @see es.uah.aut.srg.micobs.svm.vdm.VVerificationDocument
	 * @generated
	 */
	EClass getVVerificationDocument();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.micobs.svm.vdm.VVerificationDocument#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see es.uah.aut.srg.micobs.svm.vdm.VVerificationDocument#getId()
	 * @see #getVVerificationDocument()
	 * @generated
	 */
	EAttribute getVVerificationDocument_Id();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.micobs.svm.vdm.VVerificationDocument#getIssue <em>Issue</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Issue</em>'.
	 * @see es.uah.aut.srg.micobs.svm.vdm.VVerificationDocument#getIssue()
	 * @see #getVVerificationDocument()
	 * @generated
	 */
	EAttribute getVVerificationDocument_Issue();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.micobs.svm.vdm.VVerificationDocument#getDate <em>Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Date</em>'.
	 * @see es.uah.aut.srg.micobs.svm.vdm.VVerificationDocument#getDate()
	 * @see #getVVerificationDocument()
	 * @generated
	 */
	EAttribute getVVerificationDocument_Date();

	/**
	 * Returns the meta object for the reference list '{@link es.uah.aut.srg.micobs.svm.vdm.VVerificationDocument#getItem <em>Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Item</em>'.
	 * @see es.uah.aut.srg.micobs.svm.vdm.VVerificationDocument#getItem()
	 * @see #getVVerificationDocument()
	 * @generated
	 */
	EReference getVVerificationDocument_Item();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.micobs.svm.vdm.VVerificationDocumentItem <em>VVerification Document Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>VVerification Document Item</em>'.
	 * @see es.uah.aut.srg.micobs.svm.vdm.VVerificationDocumentItem
	 * @generated
	 */
	EClass getVVerificationDocumentItem();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.micobs.svm.vdm.VVerificationDocumentItem#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see es.uah.aut.srg.micobs.svm.vdm.VVerificationDocumentItem#getId()
	 * @see #getVVerificationDocumentItem()
	 * @generated
	 */
	EAttribute getVVerificationDocumentItem_Id();

	/**
	 * Returns the meta object for the reference list '{@link es.uah.aut.srg.micobs.svm.vdm.VVerificationDocumentItem#getEvidenceOf <em>Evidence Of</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Evidence Of</em>'.
	 * @see es.uah.aut.srg.micobs.svm.vdm.VVerificationDocumentItem#getEvidenceOf()
	 * @see #getVVerificationDocumentItem()
	 * @generated
	 */
	EReference getVVerificationDocumentItem_EvidenceOf();

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
		 * The meta object literal for the '{@link es.uah.aut.srg.micobs.svm.vdm.impl.VVerificationDocumentImpl <em>VVerification Document</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uah.aut.srg.micobs.svm.vdm.impl.VVerificationDocumentImpl
		 * @see es.uah.aut.srg.micobs.svm.vdm.impl.vdmPackageImpl#getVVerificationDocument()
		 * @generated
		 */
		EClass VVERIFICATION_DOCUMENT = eINSTANCE.getVVerificationDocument();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VVERIFICATION_DOCUMENT__ID = eINSTANCE.getVVerificationDocument_Id();

		/**
		 * The meta object literal for the '<em><b>Issue</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VVERIFICATION_DOCUMENT__ISSUE = eINSTANCE.getVVerificationDocument_Issue();

		/**
		 * The meta object literal for the '<em><b>Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VVERIFICATION_DOCUMENT__DATE = eINSTANCE.getVVerificationDocument_Date();

		/**
		 * The meta object literal for the '<em><b>Item</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VVERIFICATION_DOCUMENT__ITEM = eINSTANCE.getVVerificationDocument_Item();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.micobs.svm.vdm.impl.VVerificationDocumentItemImpl <em>VVerification Document Item</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uah.aut.srg.micobs.svm.vdm.impl.VVerificationDocumentItemImpl
		 * @see es.uah.aut.srg.micobs.svm.vdm.impl.vdmPackageImpl#getVVerificationDocumentItem()
		 * @generated
		 */
		EClass VVERIFICATION_DOCUMENT_ITEM = eINSTANCE.getVVerificationDocumentItem();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VVERIFICATION_DOCUMENT_ITEM__ID = eINSTANCE.getVVerificationDocumentItem_Id();

		/**
		 * The meta object literal for the '<em><b>Evidence Of</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VVERIFICATION_DOCUMENT_ITEM__EVIDENCE_OF = eINSTANCE.getVVerificationDocumentItem_EvidenceOf();

	}

} //vdmPackage
