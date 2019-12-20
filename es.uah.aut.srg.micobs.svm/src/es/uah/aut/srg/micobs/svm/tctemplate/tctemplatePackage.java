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
package es.uah.aut.srg.micobs.svm.tctemplate;

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
 * @see es.uah.aut.srg.micobs.svm.tctemplate.tctemplateFactory
 * @model kind="package"
 * @generated
 */
public interface tctemplatePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "tctemplate";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://srg.aut.uah.es/micobs/svm/tctemplate";

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
	tctemplatePackage eINSTANCE = es.uah.aut.srg.micobs.svm.tctemplate.impl.tctemplatePackageImpl.init();

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.micobs.svm.tctemplate.impl.VTCTemplateImpl <em>VTC Template</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uah.aut.srg.micobs.svm.tctemplate.impl.VTCTemplateImpl
	 * @see es.uah.aut.srg.micobs.svm.tctemplate.impl.tctemplatePackageImpl#getVTCTemplate()
	 * @generated
	 */
	int VTC_TEMPLATE = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VTC_TEMPLATE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Tc Input</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VTC_TEMPLATE__TC_INPUT = 1;

	/**
	 * The feature id for the '<em><b>Fields</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VTC_TEMPLATE__FIELDS = 2;

	/**
	 * The number of structural features of the '<em>VTC Template</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VTC_TEMPLATE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>VTC Template</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VTC_TEMPLATE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.micobs.svm.tctemplate.impl.VTCTemplateFieldImpl <em>VTC Template Field</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uah.aut.srg.micobs.svm.tctemplate.impl.VTCTemplateFieldImpl
	 * @see es.uah.aut.srg.micobs.svm.tctemplate.impl.tctemplatePackageImpl#getVTCTemplateField()
	 * @generated
	 */
	int VTC_TEMPLATE_FIELD = 1;

	/**
	 * The feature id for the '<em><b>Field Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VTC_TEMPLATE_FIELD__FIELD_REF = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VTC_TEMPLATE_FIELD__VALUE = 1;

	/**
	 * The number of structural features of the '<em>VTC Template Field</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VTC_TEMPLATE_FIELD_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>VTC Template Field</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VTC_TEMPLATE_FIELD_OPERATION_COUNT = 0;

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.micobs.svm.tctemplate.VTCTemplate <em>VTC Template</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>VTC Template</em>'.
	 * @see es.uah.aut.srg.micobs.svm.tctemplate.VTCTemplate
	 * @generated
	 */
	EClass getVTCTemplate();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.micobs.svm.tctemplate.VTCTemplate#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see es.uah.aut.srg.micobs.svm.tctemplate.VTCTemplate#getName()
	 * @see #getVTCTemplate()
	 * @generated
	 */
	EAttribute getVTCTemplate_Name();

	/**
	 * Returns the meta object for the reference '{@link es.uah.aut.srg.micobs.svm.tctemplate.VTCTemplate#getTcInput <em>Tc Input</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Tc Input</em>'.
	 * @see es.uah.aut.srg.micobs.svm.tctemplate.VTCTemplate#getTcInput()
	 * @see #getVTCTemplate()
	 * @generated
	 */
	EReference getVTCTemplate_TcInput();

	/**
	 * Returns the meta object for the containment reference list '{@link es.uah.aut.srg.micobs.svm.tctemplate.VTCTemplate#getFields <em>Fields</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Fields</em>'.
	 * @see es.uah.aut.srg.micobs.svm.tctemplate.VTCTemplate#getFields()
	 * @see #getVTCTemplate()
	 * @generated
	 */
	EReference getVTCTemplate_Fields();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.micobs.svm.tctemplate.VTCTemplateField <em>VTC Template Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>VTC Template Field</em>'.
	 * @see es.uah.aut.srg.micobs.svm.tctemplate.VTCTemplateField
	 * @generated
	 */
	EClass getVTCTemplateField();

	/**
	 * Returns the meta object for the reference '{@link es.uah.aut.srg.micobs.svm.tctemplate.VTCTemplateField#getFieldRef <em>Field Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Field Ref</em>'.
	 * @see es.uah.aut.srg.micobs.svm.tctemplate.VTCTemplateField#getFieldRef()
	 * @see #getVTCTemplateField()
	 * @generated
	 */
	EReference getVTCTemplateField_FieldRef();

	/**
	 * Returns the meta object for the containment reference '{@link es.uah.aut.srg.micobs.svm.tctemplate.VTCTemplateField#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Value</em>'.
	 * @see es.uah.aut.srg.micobs.svm.tctemplate.VTCTemplateField#getValue()
	 * @see #getVTCTemplateField()
	 * @generated
	 */
	EReference getVTCTemplateField_Value();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	tctemplateFactory gettctemplateFactory();

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
		 * The meta object literal for the '{@link es.uah.aut.srg.micobs.svm.tctemplate.impl.VTCTemplateImpl <em>VTC Template</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uah.aut.srg.micobs.svm.tctemplate.impl.VTCTemplateImpl
		 * @see es.uah.aut.srg.micobs.svm.tctemplate.impl.tctemplatePackageImpl#getVTCTemplate()
		 * @generated
		 */
		EClass VTC_TEMPLATE = eINSTANCE.getVTCTemplate();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VTC_TEMPLATE__NAME = eINSTANCE.getVTCTemplate_Name();

		/**
		 * The meta object literal for the '<em><b>Tc Input</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VTC_TEMPLATE__TC_INPUT = eINSTANCE.getVTCTemplate_TcInput();

		/**
		 * The meta object literal for the '<em><b>Fields</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VTC_TEMPLATE__FIELDS = eINSTANCE.getVTCTemplate_Fields();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.micobs.svm.tctemplate.impl.VTCTemplateFieldImpl <em>VTC Template Field</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uah.aut.srg.micobs.svm.tctemplate.impl.VTCTemplateFieldImpl
		 * @see es.uah.aut.srg.micobs.svm.tctemplate.impl.tctemplatePackageImpl#getVTCTemplateField()
		 * @generated
		 */
		EClass VTC_TEMPLATE_FIELD = eINSTANCE.getVTCTemplateField();

		/**
		 * The meta object literal for the '<em><b>Field Ref</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VTC_TEMPLATE_FIELD__FIELD_REF = eINSTANCE.getVTCTemplateField_FieldRef();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VTC_TEMPLATE_FIELD__VALUE = eINSTANCE.getVTCTemplateField_Value();

	}

} //tctemplatePackage
