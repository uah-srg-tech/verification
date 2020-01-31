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
package es.uah.aut.srg.micobs.svm.tmtemplate.impl;

import es.uah.aut.srg.micobs.svm.tmtemplate.VTMTemplate;
import es.uah.aut.srg.micobs.svm.tmtemplate.VTMTemplateField;
import es.uah.aut.srg.micobs.svm.tmtemplate.tmtemplateFactory;
import es.uah.aut.srg.micobs.svm.tmtemplate.tmtemplatePackage;

import es.uah.aut.srg.tmtcif.fieldvalue.fieldvaluePackage;

import es.uah.aut.srg.tmtcif.tm.tmPackage;

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
public class tmtemplatePackageImpl extends EPackageImpl implements tmtemplatePackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass vtmTemplateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass vtmTemplateFieldEClass = null;

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
	 * @see es.uah.aut.srg.micobs.svm.tmtemplate.tmtemplatePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private tmtemplatePackageImpl() {
		super(eNS_URI, tmtemplateFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link tmtemplatePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static tmtemplatePackage init() {
		if (isInited) return (tmtemplatePackage)EPackage.Registry.INSTANCE.getEPackage(tmtemplatePackage.eNS_URI);

		// Obtain or create and register package
		tmtemplatePackageImpl thetmtemplatePackage = (tmtemplatePackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof tmtemplatePackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new tmtemplatePackageImpl());

		isInited = true;

		// Initialize simple dependencies
		fieldvaluePackage.eINSTANCE.eClass();
		tmPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		thetmtemplatePackage.createPackageContents();

		// Initialize created meta-data
		thetmtemplatePackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		thetmtemplatePackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(tmtemplatePackage.eNS_URI, thetmtemplatePackage);
		return thetmtemplatePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVTMTemplate() {
		return vtmTemplateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVTMTemplate_Name() {
		return (EAttribute)vtmTemplateEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVTMTemplate_Tm() {
		return (EReference)vtmTemplateEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVTMTemplate_Fields() {
		return (EReference)vtmTemplateEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVTMTemplateField() {
		return vtmTemplateFieldEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVTMTemplateField_FieldRef() {
		return (EReference)vtmTemplateFieldEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVTMTemplateField_Value() {
		return (EReference)vtmTemplateFieldEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public tmtemplateFactory gettmtemplateFactory() {
		return (tmtemplateFactory)getEFactoryInstance();
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
		vtmTemplateEClass = createEClass(VTM_TEMPLATE);
		createEAttribute(vtmTemplateEClass, VTM_TEMPLATE__NAME);
		createEReference(vtmTemplateEClass, VTM_TEMPLATE__TM);
		createEReference(vtmTemplateEClass, VTM_TEMPLATE__FIELDS);

		vtmTemplateFieldEClass = createEClass(VTM_TEMPLATE_FIELD);
		createEReference(vtmTemplateFieldEClass, VTM_TEMPLATE_FIELD__FIELD_REF);
		createEReference(vtmTemplateFieldEClass, VTM_TEMPLATE_FIELD__VALUE);
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
		tmPackage thetmPackage = (tmPackage)EPackage.Registry.INSTANCE.getEPackage(tmPackage.eNS_URI);
		fieldvaluePackage thefieldvaluePackage = (fieldvaluePackage)EPackage.Registry.INSTANCE.getEPackage(fieldvaluePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes, features, and operations; add parameters
		initEClass(vtmTemplateEClass, VTMTemplate.class, "VTMTemplate", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getVTMTemplate_Name(), ecorePackage.getEString(), "name", null, 1, 1, VTMTemplate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVTMTemplate_Tm(), thetmPackage.getTMTCIFTM(), null, "tm", null, 1, 1, VTMTemplate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVTMTemplate_Fields(), this.getVTMTemplateField(), null, "fields", null, 0, -1, VTMTemplate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(vtmTemplateFieldEClass, VTMTemplateField.class, "VTMTemplateField", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getVTMTemplateField_FieldRef(), thetmPackage.getTMTCIFTMField(), null, "fieldRef", null, 1, 1, VTMTemplateField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVTMTemplateField_Value(), thefieldvaluePackage.getTMTCIFFieldValue(), null, "value", null, 1, 1, VTMTemplateField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //tmtemplatePackageImpl
