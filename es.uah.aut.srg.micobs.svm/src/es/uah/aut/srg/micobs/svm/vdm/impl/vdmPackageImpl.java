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
package es.uah.aut.srg.micobs.svm.vdm.impl;

import es.uah.aut.srg.micobs.common.commonPackage;

import es.uah.aut.srg.micobs.svm.tdm.tdmPackage;

import es.uah.aut.srg.micobs.svm.vdm.VVerificationDocument;
import es.uah.aut.srg.micobs.svm.vdm.VVerificationDocumentItem;
import es.uah.aut.srg.micobs.svm.vdm.vdmFactory;
import es.uah.aut.srg.micobs.svm.vdm.vdmPackage;

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
public class vdmPackageImpl extends EPackageImpl implements vdmPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass vVerificationDocumentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass vVerificationDocumentItemEClass = null;

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
	 * @see es.uah.aut.srg.micobs.svm.vdm.vdmPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private vdmPackageImpl() {
		super(eNS_URI, vdmFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link vdmPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static vdmPackage init() {
		if (isInited) return (vdmPackage)EPackage.Registry.INSTANCE.getEPackage(vdmPackage.eNS_URI);

		// Obtain or create and register package
		vdmPackageImpl thevdmPackage = (vdmPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof vdmPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new vdmPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		tdmPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		thevdmPackage.createPackageContents();

		// Initialize created meta-data
		thevdmPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		thevdmPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(vdmPackage.eNS_URI, thevdmPackage);
		return thevdmPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVVerificationDocument() {
		return vVerificationDocumentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVVerificationDocument_Id() {
		return (EAttribute)vVerificationDocumentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVVerificationDocument_Issue() {
		return (EAttribute)vVerificationDocumentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVVerificationDocument_Date() {
		return (EAttribute)vVerificationDocumentEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVVerificationDocument_Item() {
		return (EReference)vVerificationDocumentEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVVerificationDocumentItem() {
		return vVerificationDocumentItemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVVerificationDocumentItem_Id() {
		return (EAttribute)vVerificationDocumentItemEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVVerificationDocumentItem_EvidenceOf() {
		return (EReference)vVerificationDocumentItemEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public vdmFactory getvdmFactory() {
		return (vdmFactory)getEFactoryInstance();
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
		vVerificationDocumentEClass = createEClass(VVERIFICATION_DOCUMENT);
		createEAttribute(vVerificationDocumentEClass, VVERIFICATION_DOCUMENT__ID);
		createEAttribute(vVerificationDocumentEClass, VVERIFICATION_DOCUMENT__ISSUE);
		createEAttribute(vVerificationDocumentEClass, VVERIFICATION_DOCUMENT__DATE);
		createEReference(vVerificationDocumentEClass, VVERIFICATION_DOCUMENT__ITEM);

		vVerificationDocumentItemEClass = createEClass(VVERIFICATION_DOCUMENT_ITEM);
		createEAttribute(vVerificationDocumentItemEClass, VVERIFICATION_DOCUMENT_ITEM__ID);
		createEReference(vVerificationDocumentItemEClass, VVERIFICATION_DOCUMENT_ITEM__EVIDENCE_OF);
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
		commonPackage thecommonPackage = (commonPackage)EPackage.Registry.INSTANCE.getEPackage(commonPackage.eNS_URI);
		tdmPackage thetdmPackage = (tdmPackage)EPackage.Registry.INSTANCE.getEPackage(tdmPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		vVerificationDocumentEClass.getESuperTypes().add(thecommonPackage.getMCommonPackageElement());
		vVerificationDocumentItemEClass.getESuperTypes().add(thecommonPackage.getMCommonReferenceableObj());

		// Initialize classes, features, and operations; add parameters
		initEClass(vVerificationDocumentEClass, VVerificationDocument.class, "VVerificationDocument", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getVVerificationDocument_Id(), ecorePackage.getEString(), "id", null, 1, 1, VVerificationDocument.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVVerificationDocument_Issue(), ecorePackage.getEString(), "issue", null, 1, 1, VVerificationDocument.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVVerificationDocument_Date(), ecorePackage.getEString(), "date", null, 1, 1, VVerificationDocument.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVVerificationDocument_Item(), this.getVVerificationDocumentItem(), null, "item", null, 1, -1, VVerificationDocument.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(vVerificationDocumentItemEClass, VVerificationDocumentItem.class, "VVerificationDocumentItem", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getVVerificationDocumentItem_Id(), ecorePackage.getEString(), "id", null, 1, 1, VVerificationDocumentItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVVerificationDocumentItem_EvidenceOf(), thetdmPackage.getVTraceableDocumentItem(), null, "evidenceOf", null, 1, -1, VVerificationDocumentItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //vdmPackageImpl
