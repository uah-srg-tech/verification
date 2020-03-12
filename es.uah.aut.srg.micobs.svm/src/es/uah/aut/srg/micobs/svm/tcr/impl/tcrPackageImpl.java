/**
 * Copyright (c) 2020 UAH Space Research Group.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 * 
 * Contributors:
 *     SRG Team - Initial API and implementation
 */
package es.uah.aut.srg.micobs.svm.tcr.impl;

import es.uah.aut.srg.micobs.doctpl.doctpl.doctplPackage;
import es.uah.aut.srg.micobs.svm.tcr.VTCRTestCampaignReport;
import es.uah.aut.srg.micobs.svm.tcr.VTCRTestReport;
import es.uah.aut.srg.micobs.svm.tcr.VTCRTestStatus;
import es.uah.aut.srg.micobs.svm.tcr.tcrFactory;
import es.uah.aut.srg.micobs.svm.tcr.tcrPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class tcrPackageImpl extends EPackageImpl implements tcrPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass vtcrTestCampaignReportEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass vtcrTestReportEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum vtcrTestStatusEEnum = null;

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
	 * @see es.uah.aut.srg.micobs.svm.tcr.tcrPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private tcrPackageImpl() {
		super(eNS_URI, tcrFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link tcrPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static tcrPackage init() {
		if (isInited) return (tcrPackage)EPackage.Registry.INSTANCE.getEPackage(tcrPackage.eNS_URI);

		// Obtain or create and register package
		tcrPackageImpl thetcrPackage = (tcrPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof tcrPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new tcrPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		doctplPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		thetcrPackage.createPackageContents();

		// Initialize created meta-data
		thetcrPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		thetcrPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(tcrPackage.eNS_URI, thetcrPackage);
		return thetcrPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVTCRTestCampaignReport() {
		return vtcrTestCampaignReportEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVTCRTestCampaignReport_TestReports() {
		return (EReference)vtcrTestCampaignReportEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVTCRTestReport() {
		return vtcrTestReportEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVTCRTestReport_Test_procedure() {
		return (EAttribute)vtcrTestReportEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVTCRTestReport_Status() {
		return (EAttribute)vtcrTestReportEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVTCRTestReport_Evidence() {
		return (EReference)vtcrTestReportEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getVTCRTestStatus() {
		return vtcrTestStatusEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public tcrFactory gettcrFactory() {
		return (tcrFactory)getEFactoryInstance();
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
		vtcrTestCampaignReportEClass = createEClass(VTCR_TEST_CAMPAIGN_REPORT);
		createEReference(vtcrTestCampaignReportEClass, VTCR_TEST_CAMPAIGN_REPORT__TEST_REPORTS);

		vtcrTestReportEClass = createEClass(VTCR_TEST_REPORT);
		createEAttribute(vtcrTestReportEClass, VTCR_TEST_REPORT__TEST_PROCEDURE);
		createEAttribute(vtcrTestReportEClass, VTCR_TEST_REPORT__STATUS);
		createEReference(vtcrTestReportEClass, VTCR_TEST_REPORT__EVIDENCE);

		// Create enums
		vtcrTestStatusEEnum = createEEnum(VTCR_TEST_STATUS);
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
		doctplPackage thedoctplPackage = (doctplPackage)EPackage.Registry.INSTANCE.getEPackage(doctplPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		vtcrTestCampaignReportEClass.getESuperTypes().add(thedoctplPackage.getDDocumentTemplate());

		// Initialize classes, features, and operations; add parameters
		initEClass(vtcrTestCampaignReportEClass, VTCRTestCampaignReport.class, "VTCRTestCampaignReport", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getVTCRTestCampaignReport_TestReports(), this.getVTCRTestReport(), null, "testReports", null, 1, -1, VTCRTestCampaignReport.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(vtcrTestReportEClass, VTCRTestReport.class, "VTCRTestReport", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getVTCRTestReport_Test_procedure(), ecorePackage.getEString(), "test_procedure", null, 1, 1, VTCRTestReport.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVTCRTestReport_Status(), this.getVTCRTestStatus(), "status", null, 1, 1, VTCRTestReport.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVTCRTestReport_Evidence(), thedoctplPackage.getDParagraph(), null, "evidence", null, 1, 1, VTCRTestReport.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(vtcrTestStatusEEnum, VTCRTestStatus.class, "VTCRTestStatus");
		addEEnumLiteral(vtcrTestStatusEEnum, VTCRTestStatus.FAIL);
		addEEnumLiteral(vtcrTestStatusEEnum, VTCRTestStatus.PASS);
		addEEnumLiteral(vtcrTestStatusEEnum, VTCRTestStatus.NOT_TESTED);

		// Create resource
		createResource(eNS_URI);
	}

} //tcrPackageImpl
