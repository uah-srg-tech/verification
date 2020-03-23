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
package es.uah.aut.srg.micobs.svm.tctemplate.impl;

import es.uah.aut.srg.micobs.svm.tctemplate.VTCTemplate;
import es.uah.aut.srg.micobs.svm.tctemplate.VTCTemplateField;
import es.uah.aut.srg.micobs.svm.tctemplate.tctemplateFactory;
import es.uah.aut.srg.micobs.svm.tctemplate.tctemplatePackage;
import es.uah.aut.srg.tmtcif.fieldvalue.fieldvaluePackage;
import es.uah.aut.srg.tmtcif.tc.tcPackage;
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
public class tctemplatePackageImpl extends EPackageImpl implements tctemplatePackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass vtcTemplateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass vtcTemplateFieldEClass = null;

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
	 * @see es.uah.aut.srg.micobs.svm.tctemplate.tctemplatePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private tctemplatePackageImpl() {
		super(eNS_URI, tctemplateFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link tctemplatePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static tctemplatePackage init() {
		if (isInited) return (tctemplatePackage)EPackage.Registry.INSTANCE.getEPackage(tctemplatePackage.eNS_URI);

		// Obtain or create and register package
		tctemplatePackageImpl thetctemplatePackage = (tctemplatePackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof tctemplatePackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new tctemplatePackageImpl());

		isInited = true;

		// Initialize simple dependencies
		fieldvaluePackage.eINSTANCE.eClass();
		tcPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		thetctemplatePackage.createPackageContents();

		// Initialize created meta-data
		thetctemplatePackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		thetctemplatePackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(tctemplatePackage.eNS_URI, thetctemplatePackage);
		return thetctemplatePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVTCTemplate() {
		return vtcTemplateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVTCTemplate_Name() {
		return (EAttribute)vtcTemplateEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVTCTemplate_Tc() {
		return (EReference)vtcTemplateEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVTCTemplate_Fields() {
		return (EReference)vtcTemplateEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVTCTemplateField() {
		return vtcTemplateFieldEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVTCTemplateField_FieldRef() {
		return (EReference)vtcTemplateFieldEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVTCTemplateField_Value() {
		return (EReference)vtcTemplateFieldEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public tctemplateFactory gettctemplateFactory() {
		return (tctemplateFactory)getEFactoryInstance();
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
		vtcTemplateEClass = createEClass(VTC_TEMPLATE);
		createEAttribute(vtcTemplateEClass, VTC_TEMPLATE__NAME);
		createEReference(vtcTemplateEClass, VTC_TEMPLATE__TC);
		createEReference(vtcTemplateEClass, VTC_TEMPLATE__FIELDS);

		vtcTemplateFieldEClass = createEClass(VTC_TEMPLATE_FIELD);
		createEReference(vtcTemplateFieldEClass, VTC_TEMPLATE_FIELD__FIELD_REF);
		createEReference(vtcTemplateFieldEClass, VTC_TEMPLATE_FIELD__VALUE);
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

		// Obtain other dependent packages
		tcPackage thetcPackage = (tcPackage)EPackage.Registry.INSTANCE.getEPackage(tcPackage.eNS_URI);
		fieldvaluePackage thefieldvaluePackage = (fieldvaluePackage)EPackage.Registry.INSTANCE.getEPackage(fieldvaluePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes, features, and operations; add parameters
		initEClass(vtcTemplateEClass, VTCTemplate.class, "VTCTemplate", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getVTCTemplate_Name(), ecorePackage.getEString(), "name", null, 1, 1, VTCTemplate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVTCTemplate_Tc(), thetcPackage.getTMTCIFTC(), null, "tc", null, 1, 1, VTCTemplate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVTCTemplate_Fields(), this.getVTCTemplateField(), null, "fields", null, 0, -1, VTCTemplate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(vtcTemplateFieldEClass, VTCTemplateField.class, "VTCTemplateField", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getVTCTemplateField_FieldRef(), thetcPackage.getTMTCIFTCField(), null, "fieldRef", null, 1, 1, VTCTemplateField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVTCTemplateField_Value(), thefieldvaluePackage.getTMTCIFFieldValue(), null, "value", null, 1, 1, VTCTemplateField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //tctemplatePackageImpl
