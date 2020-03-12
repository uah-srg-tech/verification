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
package es.uah.aut.srg.micobs.svm.tcr;

import es.uah.aut.srg.micobs.doctpl.doctpl.doctplPackage;
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
 * @see es.uah.aut.srg.micobs.svm.tcr.tcrFactory
 * @model kind="package"
 * @generated
 */
public interface tcrPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "tcr";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://srg.aut.uah.es/micobs/svm/tcr";

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
	tcrPackage eINSTANCE = es.uah.aut.srg.micobs.svm.tcr.impl.tcrPackageImpl.init();

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.micobs.svm.tcr.impl.VTCRTestCampaignReportImpl <em>VTCR Test Campaign Report</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uah.aut.srg.micobs.svm.tcr.impl.VTCRTestCampaignReportImpl
	 * @see es.uah.aut.srg.micobs.svm.tcr.impl.tcrPackageImpl#getVTCRTestCampaignReport()
	 * @generated
	 */
	int VTCR_TEST_CAMPAIGN_REPORT = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VTCR_TEST_CAMPAIGN_REPORT__NAME = doctplPackage.DDOCUMENT_TEMPLATE__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VTCR_TEST_CAMPAIGN_REPORT__ID = doctplPackage.DDOCUMENT_TEMPLATE__ID;

	/**
	 * The feature id for the '<em><b>Issue</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VTCR_TEST_CAMPAIGN_REPORT__ISSUE = doctplPackage.DDOCUMENT_TEMPLATE__ISSUE;

	/**
	 * The feature id for the '<em><b>Revision</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VTCR_TEST_CAMPAIGN_REPORT__REVISION = doctplPackage.DDOCUMENT_TEMPLATE__REVISION;

	/**
	 * The feature id for the '<em><b>Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VTCR_TEST_CAMPAIGN_REPORT__DATE = doctplPackage.DDOCUMENT_TEMPLATE__DATE;

	/**
	 * The feature id for the '<em><b>Tbcs</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VTCR_TEST_CAMPAIGN_REPORT__TBCS = doctplPackage.DDOCUMENT_TEMPLATE__TBCS;

	/**
	 * The feature id for the '<em><b>Tbds</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VTCR_TEST_CAMPAIGN_REPORT__TBDS = doctplPackage.DDOCUMENT_TEMPLATE__TBDS;

	/**
	 * The feature id for the '<em><b>Applicable Documents</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VTCR_TEST_CAMPAIGN_REPORT__APPLICABLE_DOCUMENTS = doctplPackage.DDOCUMENT_TEMPLATE__APPLICABLE_DOCUMENTS;

	/**
	 * The feature id for the '<em><b>Reference Documents</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VTCR_TEST_CAMPAIGN_REPORT__REFERENCE_DOCUMENTS = doctplPackage.DDOCUMENT_TEMPLATE__REFERENCE_DOCUMENTS;

	/**
	 * The feature id for the '<em><b>Figures</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VTCR_TEST_CAMPAIGN_REPORT__FIGURES = doctplPackage.DDOCUMENT_TEMPLATE__FIGURES;

	/**
	 * The feature id for the '<em><b>Tables</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VTCR_TEST_CAMPAIGN_REPORT__TABLES = doctplPackage.DDOCUMENT_TEMPLATE__TABLES;

	/**
	 * The feature id for the '<em><b>Sections</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VTCR_TEST_CAMPAIGN_REPORT__SECTIONS = doctplPackage.DDOCUMENT_TEMPLATE__SECTIONS;

	/**
	 * The feature id for the '<em><b>Paragraphs</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VTCR_TEST_CAMPAIGN_REPORT__PARAGRAPHS = doctplPackage.DDOCUMENT_TEMPLATE__PARAGRAPHS;

	/**
	 * The feature id for the '<em><b>Test Reports</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VTCR_TEST_CAMPAIGN_REPORT__TEST_REPORTS = doctplPackage.DDOCUMENT_TEMPLATE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>VTCR Test Campaign Report</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VTCR_TEST_CAMPAIGN_REPORT_FEATURE_COUNT = doctplPackage.DDOCUMENT_TEMPLATE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>VTCR Test Campaign Report</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VTCR_TEST_CAMPAIGN_REPORT_OPERATION_COUNT = doctplPackage.DDOCUMENT_TEMPLATE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.micobs.svm.tcr.impl.VTCRTestReportImpl <em>VTCR Test Report</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uah.aut.srg.micobs.svm.tcr.impl.VTCRTestReportImpl
	 * @see es.uah.aut.srg.micobs.svm.tcr.impl.tcrPackageImpl#getVTCRTestReport()
	 * @generated
	 */
	int VTCR_TEST_REPORT = 1;

	/**
	 * The feature id for the '<em><b>Test procedure</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VTCR_TEST_REPORT__TEST_PROCEDURE = 0;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VTCR_TEST_REPORT__STATUS = 1;

	/**
	 * The feature id for the '<em><b>Evidence</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VTCR_TEST_REPORT__EVIDENCE = 2;

	/**
	 * The number of structural features of the '<em>VTCR Test Report</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VTCR_TEST_REPORT_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>VTCR Test Report</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VTCR_TEST_REPORT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.micobs.svm.tcr.VTCRTestStatus <em>VTCR Test Status</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uah.aut.srg.micobs.svm.tcr.VTCRTestStatus
	 * @see es.uah.aut.srg.micobs.svm.tcr.impl.tcrPackageImpl#getVTCRTestStatus()
	 * @generated
	 */
	int VTCR_TEST_STATUS = 2;


	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.micobs.svm.tcr.VTCRTestCampaignReport <em>VTCR Test Campaign Report</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>VTCR Test Campaign Report</em>'.
	 * @see es.uah.aut.srg.micobs.svm.tcr.VTCRTestCampaignReport
	 * @generated
	 */
	EClass getVTCRTestCampaignReport();

	/**
	 * Returns the meta object for the containment reference list '{@link es.uah.aut.srg.micobs.svm.tcr.VTCRTestCampaignReport#getTestReports <em>Test Reports</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Test Reports</em>'.
	 * @see es.uah.aut.srg.micobs.svm.tcr.VTCRTestCampaignReport#getTestReports()
	 * @see #getVTCRTestCampaignReport()
	 * @generated
	 */
	EReference getVTCRTestCampaignReport_TestReports();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.micobs.svm.tcr.VTCRTestReport <em>VTCR Test Report</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>VTCR Test Report</em>'.
	 * @see es.uah.aut.srg.micobs.svm.tcr.VTCRTestReport
	 * @generated
	 */
	EClass getVTCRTestReport();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.micobs.svm.tcr.VTCRTestReport#getTest_procedure <em>Test procedure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Test procedure</em>'.
	 * @see es.uah.aut.srg.micobs.svm.tcr.VTCRTestReport#getTest_procedure()
	 * @see #getVTCRTestReport()
	 * @generated
	 */
	EAttribute getVTCRTestReport_Test_procedure();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.micobs.svm.tcr.VTCRTestReport#getStatus <em>Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Status</em>'.
	 * @see es.uah.aut.srg.micobs.svm.tcr.VTCRTestReport#getStatus()
	 * @see #getVTCRTestReport()
	 * @generated
	 */
	EAttribute getVTCRTestReport_Status();

	/**
	 * Returns the meta object for the containment reference '{@link es.uah.aut.srg.micobs.svm.tcr.VTCRTestReport#getEvidence <em>Evidence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Evidence</em>'.
	 * @see es.uah.aut.srg.micobs.svm.tcr.VTCRTestReport#getEvidence()
	 * @see #getVTCRTestReport()
	 * @generated
	 */
	EReference getVTCRTestReport_Evidence();

	/**
	 * Returns the meta object for enum '{@link es.uah.aut.srg.micobs.svm.tcr.VTCRTestStatus <em>VTCR Test Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>VTCR Test Status</em>'.
	 * @see es.uah.aut.srg.micobs.svm.tcr.VTCRTestStatus
	 * @generated
	 */
	EEnum getVTCRTestStatus();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	tcrFactory gettcrFactory();

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
		 * The meta object literal for the '{@link es.uah.aut.srg.micobs.svm.tcr.impl.VTCRTestCampaignReportImpl <em>VTCR Test Campaign Report</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uah.aut.srg.micobs.svm.tcr.impl.VTCRTestCampaignReportImpl
		 * @see es.uah.aut.srg.micobs.svm.tcr.impl.tcrPackageImpl#getVTCRTestCampaignReport()
		 * @generated
		 */
		EClass VTCR_TEST_CAMPAIGN_REPORT = eINSTANCE.getVTCRTestCampaignReport();

		/**
		 * The meta object literal for the '<em><b>Test Reports</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VTCR_TEST_CAMPAIGN_REPORT__TEST_REPORTS = eINSTANCE.getVTCRTestCampaignReport_TestReports();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.micobs.svm.tcr.impl.VTCRTestReportImpl <em>VTCR Test Report</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uah.aut.srg.micobs.svm.tcr.impl.VTCRTestReportImpl
		 * @see es.uah.aut.srg.micobs.svm.tcr.impl.tcrPackageImpl#getVTCRTestReport()
		 * @generated
		 */
		EClass VTCR_TEST_REPORT = eINSTANCE.getVTCRTestReport();

		/**
		 * The meta object literal for the '<em><b>Test procedure</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VTCR_TEST_REPORT__TEST_PROCEDURE = eINSTANCE.getVTCRTestReport_Test_procedure();

		/**
		 * The meta object literal for the '<em><b>Status</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VTCR_TEST_REPORT__STATUS = eINSTANCE.getVTCRTestReport_Status();

		/**
		 * The meta object literal for the '<em><b>Evidence</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VTCR_TEST_REPORT__EVIDENCE = eINSTANCE.getVTCRTestReport_Evidence();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.micobs.svm.tcr.VTCRTestStatus <em>VTCR Test Status</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uah.aut.srg.micobs.svm.tcr.VTCRTestStatus
		 * @see es.uah.aut.srg.micobs.svm.tcr.impl.tcrPackageImpl#getVTCRTestStatus()
		 * @generated
		 */
		EEnum VTCR_TEST_STATUS = eINSTANCE.getVTCRTestStatus();

	}

} //tcrPackage
