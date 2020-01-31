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
package es.uah.aut.srg.micobs.svm.tmtemplate;

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
 * @see es.uah.aut.srg.micobs.svm.tmtemplate.tmtemplateFactory
 * @model kind="package"
 * @generated
 */
public interface tmtemplatePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "tmtemplate";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://srg.aut.uah.es/micobs/svm/tmtemplate";

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
	tmtemplatePackage eINSTANCE = es.uah.aut.srg.micobs.svm.tmtemplate.impl.tmtemplatePackageImpl.init();

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.micobs.svm.tmtemplate.impl.VTMTemplateImpl <em>VTM Template</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uah.aut.srg.micobs.svm.tmtemplate.impl.VTMTemplateImpl
	 * @see es.uah.aut.srg.micobs.svm.tmtemplate.impl.tmtemplatePackageImpl#getVTMTemplate()
	 * @generated
	 */
	int VTM_TEMPLATE = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VTM_TEMPLATE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Tm</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VTM_TEMPLATE__TM = 1;

	/**
	 * The feature id for the '<em><b>Fields</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VTM_TEMPLATE__FIELDS = 2;

	/**
	 * The number of structural features of the '<em>VTM Template</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VTM_TEMPLATE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>VTM Template</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VTM_TEMPLATE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.micobs.svm.tmtemplate.impl.VTMTemplateFieldImpl <em>VTM Template Field</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uah.aut.srg.micobs.svm.tmtemplate.impl.VTMTemplateFieldImpl
	 * @see es.uah.aut.srg.micobs.svm.tmtemplate.impl.tmtemplatePackageImpl#getVTMTemplateField()
	 * @generated
	 */
	int VTM_TEMPLATE_FIELD = 1;

	/**
	 * The feature id for the '<em><b>Field Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VTM_TEMPLATE_FIELD__FIELD_REF = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VTM_TEMPLATE_FIELD__VALUE = 1;

	/**
	 * The number of structural features of the '<em>VTM Template Field</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VTM_TEMPLATE_FIELD_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>VTM Template Field</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VTM_TEMPLATE_FIELD_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.micobs.svm.tmtemplate.VTMTemplate <em>VTM Template</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>VTM Template</em>'.
	 * @see es.uah.aut.srg.micobs.svm.tmtemplate.VTMTemplate
	 * @generated
	 */
	EClass getVTMTemplate();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.micobs.svm.tmtemplate.VTMTemplate#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see es.uah.aut.srg.micobs.svm.tmtemplate.VTMTemplate#getName()
	 * @see #getVTMTemplate()
	 * @generated
	 */
	EAttribute getVTMTemplate_Name();

	/**
	 * Returns the meta object for the reference '{@link es.uah.aut.srg.micobs.svm.tmtemplate.VTMTemplate#getTm <em>Tm</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Tm</em>'.
	 * @see es.uah.aut.srg.micobs.svm.tmtemplate.VTMTemplate#getTm()
	 * @see #getVTMTemplate()
	 * @generated
	 */
	EReference getVTMTemplate_Tm();

	/**
	 * Returns the meta object for the containment reference list '{@link es.uah.aut.srg.micobs.svm.tmtemplate.VTMTemplate#getFields <em>Fields</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Fields</em>'.
	 * @see es.uah.aut.srg.micobs.svm.tmtemplate.VTMTemplate#getFields()
	 * @see #getVTMTemplate()
	 * @generated
	 */
	EReference getVTMTemplate_Fields();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.micobs.svm.tmtemplate.VTMTemplateField <em>VTM Template Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>VTM Template Field</em>'.
	 * @see es.uah.aut.srg.micobs.svm.tmtemplate.VTMTemplateField
	 * @generated
	 */
	EClass getVTMTemplateField();

	/**
	 * Returns the meta object for the reference '{@link es.uah.aut.srg.micobs.svm.tmtemplate.VTMTemplateField#getFieldRef <em>Field Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Field Ref</em>'.
	 * @see es.uah.aut.srg.micobs.svm.tmtemplate.VTMTemplateField#getFieldRef()
	 * @see #getVTMTemplateField()
	 * @generated
	 */
	EReference getVTMTemplateField_FieldRef();

	/**
	 * Returns the meta object for the containment reference '{@link es.uah.aut.srg.micobs.svm.tmtemplate.VTMTemplateField#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Value</em>'.
	 * @see es.uah.aut.srg.micobs.svm.tmtemplate.VTMTemplateField#getValue()
	 * @see #getVTMTemplateField()
	 * @generated
	 */
	EReference getVTMTemplateField_Value();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	tmtemplateFactory gettmtemplateFactory();

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
		 * The meta object literal for the '{@link es.uah.aut.srg.micobs.svm.tmtemplate.impl.VTMTemplateImpl <em>VTM Template</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uah.aut.srg.micobs.svm.tmtemplate.impl.VTMTemplateImpl
		 * @see es.uah.aut.srg.micobs.svm.tmtemplate.impl.tmtemplatePackageImpl#getVTMTemplate()
		 * @generated
		 */
		EClass VTM_TEMPLATE = eINSTANCE.getVTMTemplate();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VTM_TEMPLATE__NAME = eINSTANCE.getVTMTemplate_Name();

		/**
		 * The meta object literal for the '<em><b>Tm</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VTM_TEMPLATE__TM = eINSTANCE.getVTMTemplate_Tm();

		/**
		 * The meta object literal for the '<em><b>Fields</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VTM_TEMPLATE__FIELDS = eINSTANCE.getVTMTemplate_Fields();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.micobs.svm.tmtemplate.impl.VTMTemplateFieldImpl <em>VTM Template Field</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uah.aut.srg.micobs.svm.tmtemplate.impl.VTMTemplateFieldImpl
		 * @see es.uah.aut.srg.micobs.svm.tmtemplate.impl.tmtemplatePackageImpl#getVTMTemplateField()
		 * @generated
		 */
		EClass VTM_TEMPLATE_FIELD = eINSTANCE.getVTMTemplateField();

		/**
		 * The meta object literal for the '<em><b>Field Ref</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VTM_TEMPLATE_FIELD__FIELD_REF = eINSTANCE.getVTMTemplateField_FieldRef();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VTM_TEMPLATE_FIELD__VALUE = eINSTANCE.getVTMTemplateField_Value();

	}

} //tmtemplatePackage
