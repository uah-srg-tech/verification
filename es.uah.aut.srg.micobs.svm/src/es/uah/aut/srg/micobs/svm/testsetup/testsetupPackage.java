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
package es.uah.aut.srg.micobs.svm.testsetup;

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
 * @see es.uah.aut.srg.micobs.svm.testsetup.testsetupFactory
 * @model kind="package"
 * @generated
 */
public interface testsetupPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "testsetup";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://srg.aut.uah.es/micobs/svm/testsetup";

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
	testsetupPackage eINSTANCE = es.uah.aut.srg.micobs.svm.testsetup.impl.testsetupPackageImpl.init();

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.micobs.svm.testsetup.impl.VTestSetupDocumentImpl <em>VTest Setup Document</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uah.aut.srg.micobs.svm.testsetup.impl.VTestSetupDocumentImpl
	 * @see es.uah.aut.srg.micobs.svm.testsetup.impl.testsetupPackageImpl#getVTestSetupDocument()
	 * @generated
	 */
	int VTEST_SETUP_DOCUMENT = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VTEST_SETUP_DOCUMENT__NAME = doctplPackage.DDOCUMENT_TEMPLATE__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VTEST_SETUP_DOCUMENT__ID = doctplPackage.DDOCUMENT_TEMPLATE__ID;

	/**
	 * The feature id for the '<em><b>Issue</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VTEST_SETUP_DOCUMENT__ISSUE = doctplPackage.DDOCUMENT_TEMPLATE__ISSUE;

	/**
	 * The feature id for the '<em><b>Revision</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VTEST_SETUP_DOCUMENT__REVISION = doctplPackage.DDOCUMENT_TEMPLATE__REVISION;

	/**
	 * The feature id for the '<em><b>Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VTEST_SETUP_DOCUMENT__DATE = doctplPackage.DDOCUMENT_TEMPLATE__DATE;

	/**
	 * The feature id for the '<em><b>Tbcs</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VTEST_SETUP_DOCUMENT__TBCS = doctplPackage.DDOCUMENT_TEMPLATE__TBCS;

	/**
	 * The feature id for the '<em><b>Tbds</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VTEST_SETUP_DOCUMENT__TBDS = doctplPackage.DDOCUMENT_TEMPLATE__TBDS;

	/**
	 * The feature id for the '<em><b>Applicable Documents</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VTEST_SETUP_DOCUMENT__APPLICABLE_DOCUMENTS = doctplPackage.DDOCUMENT_TEMPLATE__APPLICABLE_DOCUMENTS;

	/**
	 * The feature id for the '<em><b>Reference Documents</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VTEST_SETUP_DOCUMENT__REFERENCE_DOCUMENTS = doctplPackage.DDOCUMENT_TEMPLATE__REFERENCE_DOCUMENTS;

	/**
	 * The feature id for the '<em><b>Figures</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VTEST_SETUP_DOCUMENT__FIGURES = doctplPackage.DDOCUMENT_TEMPLATE__FIGURES;

	/**
	 * The feature id for the '<em><b>Tables</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VTEST_SETUP_DOCUMENT__TABLES = doctplPackage.DDOCUMENT_TEMPLATE__TABLES;

	/**
	 * The feature id for the '<em><b>Sections</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VTEST_SETUP_DOCUMENT__SECTIONS = doctplPackage.DDOCUMENT_TEMPLATE__SECTIONS;

	/**
	 * The feature id for the '<em><b>Paragraphs</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VTEST_SETUP_DOCUMENT__PARAGRAPHS = doctplPackage.DDOCUMENT_TEMPLATE__PARAGRAPHS;

	/**
	 * The feature id for the '<em><b>Tbcs Tbds Section</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VTEST_SETUP_DOCUMENT__TBCS_TBDS_SECTION = doctplPackage.DDOCUMENT_TEMPLATE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Applicable Documents Section</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VTEST_SETUP_DOCUMENT__APPLICABLE_DOCUMENTS_SECTION = doctplPackage.DDOCUMENT_TEMPLATE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Reference Documents Section</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VTEST_SETUP_DOCUMENT__REFERENCE_DOCUMENTS_SECTION = doctplPackage.DDOCUMENT_TEMPLATE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Interfaces</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VTEST_SETUP_DOCUMENT__INTERFACES = doctplPackage.DDOCUMENT_TEMPLATE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Configurations</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VTEST_SETUP_DOCUMENT__CONFIGURATIONS = doctplPackage.DDOCUMENT_TEMPLATE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Actions</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VTEST_SETUP_DOCUMENT__ACTIONS = doctplPackage.DDOCUMENT_TEMPLATE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Actions Over Variables</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VTEST_SETUP_DOCUMENT__ACTIONS_OVER_VARIABLES = doctplPackage.DDOCUMENT_TEMPLATE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Scenarios</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VTEST_SETUP_DOCUMENT__SCENARIOS = doctplPackage.DDOCUMENT_TEMPLATE_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>VTest Setup Document</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VTEST_SETUP_DOCUMENT_FEATURE_COUNT = doctplPackage.DDOCUMENT_TEMPLATE_FEATURE_COUNT + 8;

	/**
	 * The number of operations of the '<em>VTest Setup Document</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VTEST_SETUP_DOCUMENT_OPERATION_COUNT = doctplPackage.DDOCUMENT_TEMPLATE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.micobs.svm.testsetup.impl.VTestSetupTBCsTBDsImpl <em>VTest Setup TB Cs TB Ds</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uah.aut.srg.micobs.svm.testsetup.impl.VTestSetupTBCsTBDsImpl
	 * @see es.uah.aut.srg.micobs.svm.testsetup.impl.testsetupPackageImpl#getVTestSetupTBCsTBDs()
	 * @generated
	 */
	int VTEST_SETUP_TB_CS_TB_DS = 1;

	/**
	 * The feature id for the '<em><b>Subsections</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VTEST_SETUP_TB_CS_TB_DS__SUBSECTIONS = doctplPackage.DFIXED_SECTION__SUBSECTIONS;

	/**
	 * The feature id for the '<em><b>Tbcs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VTEST_SETUP_TB_CS_TB_DS__TBCS = doctplPackage.DFIXED_SECTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Tbds</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VTEST_SETUP_TB_CS_TB_DS__TBDS = doctplPackage.DFIXED_SECTION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>VTest Setup TB Cs TB Ds</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VTEST_SETUP_TB_CS_TB_DS_FEATURE_COUNT = doctplPackage.DFIXED_SECTION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>VTest Setup TB Cs TB Ds</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VTEST_SETUP_TB_CS_TB_DS_OPERATION_COUNT = doctplPackage.DFIXED_SECTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.micobs.svm.testsetup.impl.VTestSetupApplicableDocumentsImpl <em>VTest Setup Applicable Documents</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uah.aut.srg.micobs.svm.testsetup.impl.VTestSetupApplicableDocumentsImpl
	 * @see es.uah.aut.srg.micobs.svm.testsetup.impl.testsetupPackageImpl#getVTestSetupApplicableDocuments()
	 * @generated
	 */
	int VTEST_SETUP_APPLICABLE_DOCUMENTS = 2;

	/**
	 * The feature id for the '<em><b>Subsections</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VTEST_SETUP_APPLICABLE_DOCUMENTS__SUBSECTIONS = doctplPackage.DFIXED_SECTION__SUBSECTIONS;

	/**
	 * The feature id for the '<em><b>Applicable Documents</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VTEST_SETUP_APPLICABLE_DOCUMENTS__APPLICABLE_DOCUMENTS = doctplPackage.DFIXED_SECTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>VTest Setup Applicable Documents</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VTEST_SETUP_APPLICABLE_DOCUMENTS_FEATURE_COUNT = doctplPackage.DFIXED_SECTION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>VTest Setup Applicable Documents</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VTEST_SETUP_APPLICABLE_DOCUMENTS_OPERATION_COUNT = doctplPackage.DFIXED_SECTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.micobs.svm.testsetup.impl.VTestSetupReferenceDocumentsImpl <em>VTest Setup Reference Documents</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uah.aut.srg.micobs.svm.testsetup.impl.VTestSetupReferenceDocumentsImpl
	 * @see es.uah.aut.srg.micobs.svm.testsetup.impl.testsetupPackageImpl#getVTestSetupReferenceDocuments()
	 * @generated
	 */
	int VTEST_SETUP_REFERENCE_DOCUMENTS = 3;

	/**
	 * The feature id for the '<em><b>Subsections</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VTEST_SETUP_REFERENCE_DOCUMENTS__SUBSECTIONS = doctplPackage.DFIXED_SECTION__SUBSECTIONS;

	/**
	 * The feature id for the '<em><b>Reference Documents</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VTEST_SETUP_REFERENCE_DOCUMENTS__REFERENCE_DOCUMENTS = doctplPackage.DFIXED_SECTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>VTest Setup Reference Documents</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VTEST_SETUP_REFERENCE_DOCUMENTS_FEATURE_COUNT = doctplPackage.DFIXED_SECTION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>VTest Setup Reference Documents</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VTEST_SETUP_REFERENCE_DOCUMENTS_OPERATION_COUNT = doctplPackage.DFIXED_SECTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.micobs.svm.testsetup.impl.VTestSetupInterfacesSectionImpl <em>VTest Setup Interfaces Section</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uah.aut.srg.micobs.svm.testsetup.impl.VTestSetupInterfacesSectionImpl
	 * @see es.uah.aut.srg.micobs.svm.testsetup.impl.testsetupPackageImpl#getVTestSetupInterfacesSection()
	 * @generated
	 */
	int VTEST_SETUP_INTERFACES_SECTION = 4;

	/**
	 * The feature id for the '<em><b>Subsections</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VTEST_SETUP_INTERFACES_SECTION__SUBSECTIONS = doctplPackage.DFIXED_SECTION__SUBSECTIONS;

	/**
	 * The feature id for the '<em><b>Interfaces</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VTEST_SETUP_INTERFACES_SECTION__INTERFACES = doctplPackage.DFIXED_SECTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>VTest Setup Interfaces Section</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VTEST_SETUP_INTERFACES_SECTION_FEATURE_COUNT = doctplPackage.DFIXED_SECTION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>VTest Setup Interfaces Section</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VTEST_SETUP_INTERFACES_SECTION_OPERATION_COUNT = doctplPackage.DFIXED_SECTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.micobs.svm.testsetup.impl.VTestSetupInterfaceImpl <em>VTest Setup Interface</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uah.aut.srg.micobs.svm.testsetup.impl.VTestSetupInterfaceImpl
	 * @see es.uah.aut.srg.micobs.svm.testsetup.impl.testsetupPackageImpl#getVTestSetupInterface()
	 * @generated
	 */
	int VTEST_SETUP_INTERFACE = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VTEST_SETUP_INTERFACE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VTEST_SETUP_INTERFACE__DESCRIPTION = 1;

	/**
	 * The feature id for the '<em><b>Tc Header</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VTEST_SETUP_INTERFACE__TC_HEADER = 2;

	/**
	 * The feature id for the '<em><b>Tm Header</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VTEST_SETUP_INTERFACE__TM_HEADER = 3;

	/**
	 * The number of structural features of the '<em>VTest Setup Interface</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VTEST_SETUP_INTERFACE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>VTest Setup Interface</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VTEST_SETUP_INTERFACE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.micobs.svm.testsetup.impl.VTestSetupPacketConfigurationsSectionImpl <em>VTest Setup Packet Configurations Section</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uah.aut.srg.micobs.svm.testsetup.impl.VTestSetupPacketConfigurationsSectionImpl
	 * @see es.uah.aut.srg.micobs.svm.testsetup.impl.testsetupPackageImpl#getVTestSetupPacketConfigurationsSection()
	 * @generated
	 */
	int VTEST_SETUP_PACKET_CONFIGURATIONS_SECTION = 6;

	/**
	 * The feature id for the '<em><b>Subsections</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VTEST_SETUP_PACKET_CONFIGURATIONS_SECTION__SUBSECTIONS = doctplPackage.DFIXED_SECTION__SUBSECTIONS;

	/**
	 * The feature id for the '<em><b>Packet Configurations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VTEST_SETUP_PACKET_CONFIGURATIONS_SECTION__PACKET_CONFIGURATIONS = doctplPackage.DFIXED_SECTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>VTest Setup Packet Configurations Section</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VTEST_SETUP_PACKET_CONFIGURATIONS_SECTION_FEATURE_COUNT = doctplPackage.DFIXED_SECTION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>VTest Setup Packet Configurations Section</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VTEST_SETUP_PACKET_CONFIGURATIONS_SECTION_OPERATION_COUNT = doctplPackage.DFIXED_SECTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.micobs.svm.testsetup.impl.VTestSetupPacketConfigurationImpl <em>VTest Setup Packet Configuration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uah.aut.srg.micobs.svm.testsetup.impl.VTestSetupPacketConfigurationImpl
	 * @see es.uah.aut.srg.micobs.svm.testsetup.impl.testsetupPackageImpl#getVTestSetupPacketConfiguration()
	 * @generated
	 */
	int VTEST_SETUP_PACKET_CONFIGURATION = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VTEST_SETUP_PACKET_CONFIGURATION__NAME = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VTEST_SETUP_PACKET_CONFIGURATION__ID = 1;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VTEST_SETUP_PACKET_CONFIGURATION__DESCRIPTION = 2;

	/**
	 * The number of structural features of the '<em>VTest Setup Packet Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VTEST_SETUP_PACKET_CONFIGURATION_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>VTest Setup Packet Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VTEST_SETUP_PACKET_CONFIGURATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.micobs.svm.testsetup.impl.VTestSetupActionsSectionImpl <em>VTest Setup Actions Section</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uah.aut.srg.micobs.svm.testsetup.impl.VTestSetupActionsSectionImpl
	 * @see es.uah.aut.srg.micobs.svm.testsetup.impl.testsetupPackageImpl#getVTestSetupActionsSection()
	 * @generated
	 */
	int VTEST_SETUP_ACTIONS_SECTION = 8;

	/**
	 * The feature id for the '<em><b>Subsections</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VTEST_SETUP_ACTIONS_SECTION__SUBSECTIONS = doctplPackage.DFIXED_SECTION__SUBSECTIONS;

	/**
	 * The feature id for the '<em><b>Actions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VTEST_SETUP_ACTIONS_SECTION__ACTIONS = doctplPackage.DFIXED_SECTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>VTest Setup Actions Section</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VTEST_SETUP_ACTIONS_SECTION_FEATURE_COUNT = doctplPackage.DFIXED_SECTION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>VTest Setup Actions Section</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VTEST_SETUP_ACTIONS_SECTION_OPERATION_COUNT = doctplPackage.DFIXED_SECTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.micobs.svm.testsetup.impl.VTestSetupActionImpl <em>VTest Setup Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uah.aut.srg.micobs.svm.testsetup.impl.VTestSetupActionImpl
	 * @see es.uah.aut.srg.micobs.svm.testsetup.impl.testsetupPackageImpl#getVTestSetupAction()
	 * @generated
	 */
	int VTEST_SETUP_ACTION = 9;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VTEST_SETUP_ACTION__NAME = 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VTEST_SETUP_ACTION__DESCRIPTION = 1;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VTEST_SETUP_ACTION__TYPE = 2;

	/**
	 * The number of structural features of the '<em>VTest Setup Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VTEST_SETUP_ACTION_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>VTest Setup Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VTEST_SETUP_ACTION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.micobs.svm.testsetup.impl.VTestSetupActionsOverVariablesSectionImpl <em>VTest Setup Actions Over Variables Section</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uah.aut.srg.micobs.svm.testsetup.impl.VTestSetupActionsOverVariablesSectionImpl
	 * @see es.uah.aut.srg.micobs.svm.testsetup.impl.testsetupPackageImpl#getVTestSetupActionsOverVariablesSection()
	 * @generated
	 */
	int VTEST_SETUP_ACTIONS_OVER_VARIABLES_SECTION = 10;

	/**
	 * The feature id for the '<em><b>Subsections</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VTEST_SETUP_ACTIONS_OVER_VARIABLES_SECTION__SUBSECTIONS = doctplPackage.DFIXED_SECTION__SUBSECTIONS;

	/**
	 * The feature id for the '<em><b>Actions Over Variable</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VTEST_SETUP_ACTIONS_OVER_VARIABLES_SECTION__ACTIONS_OVER_VARIABLE = doctplPackage.DFIXED_SECTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>VTest Setup Actions Over Variables Section</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VTEST_SETUP_ACTIONS_OVER_VARIABLES_SECTION_FEATURE_COUNT = doctplPackage.DFIXED_SECTION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>VTest Setup Actions Over Variables Section</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VTEST_SETUP_ACTIONS_OVER_VARIABLES_SECTION_OPERATION_COUNT = doctplPackage.DFIXED_SECTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.micobs.svm.testsetup.impl.VTestSetupActionOverVariableImpl <em>VTest Setup Action Over Variable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uah.aut.srg.micobs.svm.testsetup.impl.VTestSetupActionOverVariableImpl
	 * @see es.uah.aut.srg.micobs.svm.testsetup.impl.testsetupPackageImpl#getVTestSetupActionOverVariable()
	 * @generated
	 */
	int VTEST_SETUP_ACTION_OVER_VARIABLE = 11;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VTEST_SETUP_ACTION_OVER_VARIABLE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VTEST_SETUP_ACTION_OVER_VARIABLE__DESCRIPTION = 1;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VTEST_SETUP_ACTION_OVER_VARIABLE__TYPE = 2;

	/**
	 * The number of structural features of the '<em>VTest Setup Action Over Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VTEST_SETUP_ACTION_OVER_VARIABLE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>VTest Setup Action Over Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VTEST_SETUP_ACTION_OVER_VARIABLE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.micobs.svm.testsetup.impl.VTestSetupScenariosSectionImpl <em>VTest Setup Scenarios Section</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uah.aut.srg.micobs.svm.testsetup.impl.VTestSetupScenariosSectionImpl
	 * @see es.uah.aut.srg.micobs.svm.testsetup.impl.testsetupPackageImpl#getVTestSetupScenariosSection()
	 * @generated
	 */
	int VTEST_SETUP_SCENARIOS_SECTION = 12;

	/**
	 * The feature id for the '<em><b>Subsections</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VTEST_SETUP_SCENARIOS_SECTION__SUBSECTIONS = doctplPackage.DFIXED_SECTION__SUBSECTIONS;

	/**
	 * The feature id for the '<em><b>Scenarios</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VTEST_SETUP_SCENARIOS_SECTION__SCENARIOS = doctplPackage.DFIXED_SECTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>VTest Setup Scenarios Section</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VTEST_SETUP_SCENARIOS_SECTION_FEATURE_COUNT = doctplPackage.DFIXED_SECTION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>VTest Setup Scenarios Section</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VTEST_SETUP_SCENARIOS_SECTION_OPERATION_COUNT = doctplPackage.DFIXED_SECTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.micobs.svm.testsetup.impl.VTestSetupScenarioSectionImpl <em>VTest Setup Scenario Section</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uah.aut.srg.micobs.svm.testsetup.impl.VTestSetupScenarioSectionImpl
	 * @see es.uah.aut.srg.micobs.svm.testsetup.impl.testsetupPackageImpl#getVTestSetupScenarioSection()
	 * @generated
	 */
	int VTEST_SETUP_SCENARIO_SECTION = 13;

	/**
	 * The feature id for the '<em><b>Subsections</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VTEST_SETUP_SCENARIO_SECTION__SUBSECTIONS = doctplPackage.DINSTANTIABLE_SECTION__SUBSECTIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VTEST_SETUP_SCENARIO_SECTION__NAME = doctplPackage.DINSTANTIABLE_SECTION__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VTEST_SETUP_SCENARIO_SECTION__DESCRIPTION = doctplPackage.DINSTANTIABLE_SECTION__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Scenario</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VTEST_SETUP_SCENARIO_SECTION__SCENARIO = doctplPackage.DINSTANTIABLE_SECTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Supported Interface</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VTEST_SETUP_SCENARIO_SECTION__SUPPORTED_INTERFACE = doctplPackage.DINSTANTIABLE_SECTION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Selected Configuration</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VTEST_SETUP_SCENARIO_SECTION__SELECTED_CONFIGURATION = doctplPackage.DINSTANTIABLE_SECTION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Supported Action</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VTEST_SETUP_SCENARIO_SECTION__SUPPORTED_ACTION = doctplPackage.DINSTANTIABLE_SECTION_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Supported Action Over Variable</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VTEST_SETUP_SCENARIO_SECTION__SUPPORTED_ACTION_OVER_VARIABLE = doctplPackage.DINSTANTIABLE_SECTION_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Body</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VTEST_SETUP_SCENARIO_SECTION__BODY = doctplPackage.DINSTANTIABLE_SECTION_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>VTest Setup Scenario Section</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VTEST_SETUP_SCENARIO_SECTION_FEATURE_COUNT = doctplPackage.DINSTANTIABLE_SECTION_FEATURE_COUNT + 6;

	/**
	 * The number of operations of the '<em>VTest Setup Scenario Section</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VTEST_SETUP_SCENARIO_SECTION_OPERATION_COUNT = doctplPackage.DINSTANTIABLE_SECTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.micobs.svm.testsetup.impl.VTestSetupSupportedInterfaceImpl <em>VTest Setup Supported Interface</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uah.aut.srg.micobs.svm.testsetup.impl.VTestSetupSupportedInterfaceImpl
	 * @see es.uah.aut.srg.micobs.svm.testsetup.impl.testsetupPackageImpl#getVTestSetupSupportedInterface()
	 * @generated
	 */
	int VTEST_SETUP_SUPPORTED_INTERFACE = 14;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VTEST_SETUP_SUPPORTED_INTERFACE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Interface</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VTEST_SETUP_SUPPORTED_INTERFACE__INTERFACE = 1;

	/**
	 * The feature id for the '<em><b>Scenario Interface</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VTEST_SETUP_SUPPORTED_INTERFACE__SCENARIO_INTERFACE = 2;

	/**
	 * The number of structural features of the '<em>VTest Setup Supported Interface</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VTEST_SETUP_SUPPORTED_INTERFACE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>VTest Setup Supported Interface</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VTEST_SETUP_SUPPORTED_INTERFACE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.micobs.svm.testsetup.impl.VTestSetupSelectedConfigurationImpl <em>VTest Setup Selected Configuration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uah.aut.srg.micobs.svm.testsetup.impl.VTestSetupSelectedConfigurationImpl
	 * @see es.uah.aut.srg.micobs.svm.testsetup.impl.testsetupPackageImpl#getVTestSetupSelectedConfiguration()
	 * @generated
	 */
	int VTEST_SETUP_SELECTED_CONFIGURATION = 15;

	/**
	 * The feature id for the '<em><b>Configuration</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VTEST_SETUP_SELECTED_CONFIGURATION__CONFIGURATION = 0;

	/**
	 * The feature id for the '<em><b>Default Filter Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VTEST_SETUP_SELECTED_CONFIGURATION__DEFAULT_FILTER_STATUS = 1;

	/**
	 * The feature id for the '<em><b>Default Print Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VTEST_SETUP_SELECTED_CONFIGURATION__DEFAULT_PRINT_STATUS = 2;

	/**
	 * The number of structural features of the '<em>VTest Setup Selected Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VTEST_SETUP_SELECTED_CONFIGURATION_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>VTest Setup Selected Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VTEST_SETUP_SELECTED_CONFIGURATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.micobs.svm.testsetup.impl.VTestSetupSupportedActionOverVariableImpl <em>VTest Setup Supported Action Over Variable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uah.aut.srg.micobs.svm.testsetup.impl.VTestSetupSupportedActionOverVariableImpl
	 * @see es.uah.aut.srg.micobs.svm.testsetup.impl.testsetupPackageImpl#getVTestSetupSupportedActionOverVariable()
	 * @generated
	 */
	int VTEST_SETUP_SUPPORTED_ACTION_OVER_VARIABLE = 16;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VTEST_SETUP_SUPPORTED_ACTION_OVER_VARIABLE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Action Over Variable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VTEST_SETUP_SUPPORTED_ACTION_OVER_VARIABLE__ACTION_OVER_VARIABLE = 1;

	/**
	 * The feature id for the '<em><b>Scenario Variable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VTEST_SETUP_SUPPORTED_ACTION_OVER_VARIABLE__SCENARIO_VARIABLE = 2;

	/**
	 * The number of structural features of the '<em>VTest Setup Supported Action Over Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VTEST_SETUP_SUPPORTED_ACTION_OVER_VARIABLE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>VTest Setup Supported Action Over Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VTEST_SETUP_SUPPORTED_ACTION_OVER_VARIABLE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.micobs.svm.testsetup.VTestSetupActionType <em>VTest Setup Action Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uah.aut.srg.micobs.svm.testsetup.VTestSetupActionType
	 * @see es.uah.aut.srg.micobs.svm.testsetup.impl.testsetupPackageImpl#getVTestSetupActionType()
	 * @generated
	 */
	int VTEST_SETUP_ACTION_TYPE = 17;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.micobs.svm.testsetup.VTestSetupActionOverVariableType <em>VTest Setup Action Over Variable Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uah.aut.srg.micobs.svm.testsetup.VTestSetupActionOverVariableType
	 * @see es.uah.aut.srg.micobs.svm.testsetup.impl.testsetupPackageImpl#getVTestSetupActionOverVariableType()
	 * @generated
	 */
	int VTEST_SETUP_ACTION_OVER_VARIABLE_TYPE = 18;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.micobs.svm.testsetup.VTestSetupConfigurationStatus <em>VTest Setup Configuration Status</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uah.aut.srg.micobs.svm.testsetup.VTestSetupConfigurationStatus
	 * @see es.uah.aut.srg.micobs.svm.testsetup.impl.testsetupPackageImpl#getVTestSetupConfigurationStatus()
	 * @generated
	 */
	int VTEST_SETUP_CONFIGURATION_STATUS = 19;


	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.micobs.svm.testsetup.VTestSetupDocument <em>VTest Setup Document</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>VTest Setup Document</em>'.
	 * @see es.uah.aut.srg.micobs.svm.testsetup.VTestSetupDocument
	 * @generated
	 */
	EClass getVTestSetupDocument();

	/**
	 * Returns the meta object for the containment reference '{@link es.uah.aut.srg.micobs.svm.testsetup.VTestSetupDocument#getTbcsTbdsSection <em>Tbcs Tbds Section</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Tbcs Tbds Section</em>'.
	 * @see es.uah.aut.srg.micobs.svm.testsetup.VTestSetupDocument#getTbcsTbdsSection()
	 * @see #getVTestSetupDocument()
	 * @generated
	 */
	EReference getVTestSetupDocument_TbcsTbdsSection();

	/**
	 * Returns the meta object for the containment reference '{@link es.uah.aut.srg.micobs.svm.testsetup.VTestSetupDocument#getApplicableDocumentsSection <em>Applicable Documents Section</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Applicable Documents Section</em>'.
	 * @see es.uah.aut.srg.micobs.svm.testsetup.VTestSetupDocument#getApplicableDocumentsSection()
	 * @see #getVTestSetupDocument()
	 * @generated
	 */
	EReference getVTestSetupDocument_ApplicableDocumentsSection();

	/**
	 * Returns the meta object for the containment reference '{@link es.uah.aut.srg.micobs.svm.testsetup.VTestSetupDocument#getReferenceDocumentsSection <em>Reference Documents Section</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Reference Documents Section</em>'.
	 * @see es.uah.aut.srg.micobs.svm.testsetup.VTestSetupDocument#getReferenceDocumentsSection()
	 * @see #getVTestSetupDocument()
	 * @generated
	 */
	EReference getVTestSetupDocument_ReferenceDocumentsSection();

	/**
	 * Returns the meta object for the containment reference '{@link es.uah.aut.srg.micobs.svm.testsetup.VTestSetupDocument#getInterfaces <em>Interfaces</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Interfaces</em>'.
	 * @see es.uah.aut.srg.micobs.svm.testsetup.VTestSetupDocument#getInterfaces()
	 * @see #getVTestSetupDocument()
	 * @generated
	 */
	EReference getVTestSetupDocument_Interfaces();

	/**
	 * Returns the meta object for the containment reference '{@link es.uah.aut.srg.micobs.svm.testsetup.VTestSetupDocument#getConfigurations <em>Configurations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Configurations</em>'.
	 * @see es.uah.aut.srg.micobs.svm.testsetup.VTestSetupDocument#getConfigurations()
	 * @see #getVTestSetupDocument()
	 * @generated
	 */
	EReference getVTestSetupDocument_Configurations();

	/**
	 * Returns the meta object for the containment reference '{@link es.uah.aut.srg.micobs.svm.testsetup.VTestSetupDocument#getActions <em>Actions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Actions</em>'.
	 * @see es.uah.aut.srg.micobs.svm.testsetup.VTestSetupDocument#getActions()
	 * @see #getVTestSetupDocument()
	 * @generated
	 */
	EReference getVTestSetupDocument_Actions();

	/**
	 * Returns the meta object for the containment reference '{@link es.uah.aut.srg.micobs.svm.testsetup.VTestSetupDocument#getActionsOverVariables <em>Actions Over Variables</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Actions Over Variables</em>'.
	 * @see es.uah.aut.srg.micobs.svm.testsetup.VTestSetupDocument#getActionsOverVariables()
	 * @see #getVTestSetupDocument()
	 * @generated
	 */
	EReference getVTestSetupDocument_ActionsOverVariables();

	/**
	 * Returns the meta object for the containment reference '{@link es.uah.aut.srg.micobs.svm.testsetup.VTestSetupDocument#getScenarios <em>Scenarios</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Scenarios</em>'.
	 * @see es.uah.aut.srg.micobs.svm.testsetup.VTestSetupDocument#getScenarios()
	 * @see #getVTestSetupDocument()
	 * @generated
	 */
	EReference getVTestSetupDocument_Scenarios();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.micobs.svm.testsetup.VTestSetupTBCsTBDs <em>VTest Setup TB Cs TB Ds</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>VTest Setup TB Cs TB Ds</em>'.
	 * @see es.uah.aut.srg.micobs.svm.testsetup.VTestSetupTBCsTBDs
	 * @generated
	 */
	EClass getVTestSetupTBCsTBDs();

	/**
	 * Returns the meta object for the containment reference list '{@link es.uah.aut.srg.micobs.svm.testsetup.VTestSetupTBCsTBDs#getTbcs <em>Tbcs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Tbcs</em>'.
	 * @see es.uah.aut.srg.micobs.svm.testsetup.VTestSetupTBCsTBDs#getTbcs()
	 * @see #getVTestSetupTBCsTBDs()
	 * @generated
	 */
	EReference getVTestSetupTBCsTBDs_Tbcs();

	/**
	 * Returns the meta object for the containment reference list '{@link es.uah.aut.srg.micobs.svm.testsetup.VTestSetupTBCsTBDs#getTbds <em>Tbds</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Tbds</em>'.
	 * @see es.uah.aut.srg.micobs.svm.testsetup.VTestSetupTBCsTBDs#getTbds()
	 * @see #getVTestSetupTBCsTBDs()
	 * @generated
	 */
	EReference getVTestSetupTBCsTBDs_Tbds();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.micobs.svm.testsetup.VTestSetupApplicableDocuments <em>VTest Setup Applicable Documents</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>VTest Setup Applicable Documents</em>'.
	 * @see es.uah.aut.srg.micobs.svm.testsetup.VTestSetupApplicableDocuments
	 * @generated
	 */
	EClass getVTestSetupApplicableDocuments();

	/**
	 * Returns the meta object for the containment reference list '{@link es.uah.aut.srg.micobs.svm.testsetup.VTestSetupApplicableDocuments#getApplicableDocuments <em>Applicable Documents</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Applicable Documents</em>'.
	 * @see es.uah.aut.srg.micobs.svm.testsetup.VTestSetupApplicableDocuments#getApplicableDocuments()
	 * @see #getVTestSetupApplicableDocuments()
	 * @generated
	 */
	EReference getVTestSetupApplicableDocuments_ApplicableDocuments();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.micobs.svm.testsetup.VTestSetupReferenceDocuments <em>VTest Setup Reference Documents</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>VTest Setup Reference Documents</em>'.
	 * @see es.uah.aut.srg.micobs.svm.testsetup.VTestSetupReferenceDocuments
	 * @generated
	 */
	EClass getVTestSetupReferenceDocuments();

	/**
	 * Returns the meta object for the containment reference list '{@link es.uah.aut.srg.micobs.svm.testsetup.VTestSetupReferenceDocuments#getReferenceDocuments <em>Reference Documents</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Reference Documents</em>'.
	 * @see es.uah.aut.srg.micobs.svm.testsetup.VTestSetupReferenceDocuments#getReferenceDocuments()
	 * @see #getVTestSetupReferenceDocuments()
	 * @generated
	 */
	EReference getVTestSetupReferenceDocuments_ReferenceDocuments();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.micobs.svm.testsetup.VTestSetupInterfacesSection <em>VTest Setup Interfaces Section</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>VTest Setup Interfaces Section</em>'.
	 * @see es.uah.aut.srg.micobs.svm.testsetup.VTestSetupInterfacesSection
	 * @generated
	 */
	EClass getVTestSetupInterfacesSection();

	/**
	 * Returns the meta object for the containment reference list '{@link es.uah.aut.srg.micobs.svm.testsetup.VTestSetupInterfacesSection#getInterfaces <em>Interfaces</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Interfaces</em>'.
	 * @see es.uah.aut.srg.micobs.svm.testsetup.VTestSetupInterfacesSection#getInterfaces()
	 * @see #getVTestSetupInterfacesSection()
	 * @generated
	 */
	EReference getVTestSetupInterfacesSection_Interfaces();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.micobs.svm.testsetup.VTestSetupInterface <em>VTest Setup Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>VTest Setup Interface</em>'.
	 * @see es.uah.aut.srg.micobs.svm.testsetup.VTestSetupInterface
	 * @generated
	 */
	EClass getVTestSetupInterface();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.micobs.svm.testsetup.VTestSetupInterface#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see es.uah.aut.srg.micobs.svm.testsetup.VTestSetupInterface#getName()
	 * @see #getVTestSetupInterface()
	 * @generated
	 */
	EAttribute getVTestSetupInterface_Name();

	/**
	 * Returns the meta object for the containment reference '{@link es.uah.aut.srg.micobs.svm.testsetup.VTestSetupInterface#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Description</em>'.
	 * @see es.uah.aut.srg.micobs.svm.testsetup.VTestSetupInterface#getDescription()
	 * @see #getVTestSetupInterface()
	 * @generated
	 */
	EReference getVTestSetupInterface_Description();

	/**
	 * Returns the meta object for the reference '{@link es.uah.aut.srg.micobs.svm.testsetup.VTestSetupInterface#getTcHeader <em>Tc Header</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Tc Header</em>'.
	 * @see es.uah.aut.srg.micobs.svm.testsetup.VTestSetupInterface#getTcHeader()
	 * @see #getVTestSetupInterface()
	 * @generated
	 */
	EReference getVTestSetupInterface_TcHeader();

	/**
	 * Returns the meta object for the reference '{@link es.uah.aut.srg.micobs.svm.testsetup.VTestSetupInterface#getTmHeader <em>Tm Header</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Tm Header</em>'.
	 * @see es.uah.aut.srg.micobs.svm.testsetup.VTestSetupInterface#getTmHeader()
	 * @see #getVTestSetupInterface()
	 * @generated
	 */
	EReference getVTestSetupInterface_TmHeader();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.micobs.svm.testsetup.VTestSetupPacketConfigurationsSection <em>VTest Setup Packet Configurations Section</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>VTest Setup Packet Configurations Section</em>'.
	 * @see es.uah.aut.srg.micobs.svm.testsetup.VTestSetupPacketConfigurationsSection
	 * @generated
	 */
	EClass getVTestSetupPacketConfigurationsSection();

	/**
	 * Returns the meta object for the containment reference list '{@link es.uah.aut.srg.micobs.svm.testsetup.VTestSetupPacketConfigurationsSection#getPacketConfigurations <em>Packet Configurations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Packet Configurations</em>'.
	 * @see es.uah.aut.srg.micobs.svm.testsetup.VTestSetupPacketConfigurationsSection#getPacketConfigurations()
	 * @see #getVTestSetupPacketConfigurationsSection()
	 * @generated
	 */
	EReference getVTestSetupPacketConfigurationsSection_PacketConfigurations();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.micobs.svm.testsetup.VTestSetupPacketConfiguration <em>VTest Setup Packet Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>VTest Setup Packet Configuration</em>'.
	 * @see es.uah.aut.srg.micobs.svm.testsetup.VTestSetupPacketConfiguration
	 * @generated
	 */
	EClass getVTestSetupPacketConfiguration();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.micobs.svm.testsetup.VTestSetupPacketConfiguration#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see es.uah.aut.srg.micobs.svm.testsetup.VTestSetupPacketConfiguration#getName()
	 * @see #getVTestSetupPacketConfiguration()
	 * @generated
	 */
	EAttribute getVTestSetupPacketConfiguration_Name();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.micobs.svm.testsetup.VTestSetupPacketConfiguration#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see es.uah.aut.srg.micobs.svm.testsetup.VTestSetupPacketConfiguration#getId()
	 * @see #getVTestSetupPacketConfiguration()
	 * @generated
	 */
	EAttribute getVTestSetupPacketConfiguration_Id();

	/**
	 * Returns the meta object for the containment reference '{@link es.uah.aut.srg.micobs.svm.testsetup.VTestSetupPacketConfiguration#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Description</em>'.
	 * @see es.uah.aut.srg.micobs.svm.testsetup.VTestSetupPacketConfiguration#getDescription()
	 * @see #getVTestSetupPacketConfiguration()
	 * @generated
	 */
	EReference getVTestSetupPacketConfiguration_Description();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.micobs.svm.testsetup.VTestSetupActionsSection <em>VTest Setup Actions Section</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>VTest Setup Actions Section</em>'.
	 * @see es.uah.aut.srg.micobs.svm.testsetup.VTestSetupActionsSection
	 * @generated
	 */
	EClass getVTestSetupActionsSection();

	/**
	 * Returns the meta object for the containment reference list '{@link es.uah.aut.srg.micobs.svm.testsetup.VTestSetupActionsSection#getActions <em>Actions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Actions</em>'.
	 * @see es.uah.aut.srg.micobs.svm.testsetup.VTestSetupActionsSection#getActions()
	 * @see #getVTestSetupActionsSection()
	 * @generated
	 */
	EReference getVTestSetupActionsSection_Actions();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.micobs.svm.testsetup.VTestSetupAction <em>VTest Setup Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>VTest Setup Action</em>'.
	 * @see es.uah.aut.srg.micobs.svm.testsetup.VTestSetupAction
	 * @generated
	 */
	EClass getVTestSetupAction();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.micobs.svm.testsetup.VTestSetupAction#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see es.uah.aut.srg.micobs.svm.testsetup.VTestSetupAction#getName()
	 * @see #getVTestSetupAction()
	 * @generated
	 */
	EAttribute getVTestSetupAction_Name();

	/**
	 * Returns the meta object for the containment reference '{@link es.uah.aut.srg.micobs.svm.testsetup.VTestSetupAction#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Description</em>'.
	 * @see es.uah.aut.srg.micobs.svm.testsetup.VTestSetupAction#getDescription()
	 * @see #getVTestSetupAction()
	 * @generated
	 */
	EReference getVTestSetupAction_Description();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.micobs.svm.testsetup.VTestSetupAction#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see es.uah.aut.srg.micobs.svm.testsetup.VTestSetupAction#getType()
	 * @see #getVTestSetupAction()
	 * @generated
	 */
	EAttribute getVTestSetupAction_Type();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.micobs.svm.testsetup.VTestSetupActionsOverVariablesSection <em>VTest Setup Actions Over Variables Section</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>VTest Setup Actions Over Variables Section</em>'.
	 * @see es.uah.aut.srg.micobs.svm.testsetup.VTestSetupActionsOverVariablesSection
	 * @generated
	 */
	EClass getVTestSetupActionsOverVariablesSection();

	/**
	 * Returns the meta object for the containment reference list '{@link es.uah.aut.srg.micobs.svm.testsetup.VTestSetupActionsOverVariablesSection#getActionsOverVariable <em>Actions Over Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Actions Over Variable</em>'.
	 * @see es.uah.aut.srg.micobs.svm.testsetup.VTestSetupActionsOverVariablesSection#getActionsOverVariable()
	 * @see #getVTestSetupActionsOverVariablesSection()
	 * @generated
	 */
	EReference getVTestSetupActionsOverVariablesSection_ActionsOverVariable();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.micobs.svm.testsetup.VTestSetupActionOverVariable <em>VTest Setup Action Over Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>VTest Setup Action Over Variable</em>'.
	 * @see es.uah.aut.srg.micobs.svm.testsetup.VTestSetupActionOverVariable
	 * @generated
	 */
	EClass getVTestSetupActionOverVariable();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.micobs.svm.testsetup.VTestSetupActionOverVariable#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see es.uah.aut.srg.micobs.svm.testsetup.VTestSetupActionOverVariable#getName()
	 * @see #getVTestSetupActionOverVariable()
	 * @generated
	 */
	EAttribute getVTestSetupActionOverVariable_Name();

	/**
	 * Returns the meta object for the containment reference '{@link es.uah.aut.srg.micobs.svm.testsetup.VTestSetupActionOverVariable#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Description</em>'.
	 * @see es.uah.aut.srg.micobs.svm.testsetup.VTestSetupActionOverVariable#getDescription()
	 * @see #getVTestSetupActionOverVariable()
	 * @generated
	 */
	EReference getVTestSetupActionOverVariable_Description();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.micobs.svm.testsetup.VTestSetupActionOverVariable#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see es.uah.aut.srg.micobs.svm.testsetup.VTestSetupActionOverVariable#getType()
	 * @see #getVTestSetupActionOverVariable()
	 * @generated
	 */
	EAttribute getVTestSetupActionOverVariable_Type();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.micobs.svm.testsetup.VTestSetupScenariosSection <em>VTest Setup Scenarios Section</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>VTest Setup Scenarios Section</em>'.
	 * @see es.uah.aut.srg.micobs.svm.testsetup.VTestSetupScenariosSection
	 * @generated
	 */
	EClass getVTestSetupScenariosSection();

	/**
	 * Returns the meta object for the containment reference list '{@link es.uah.aut.srg.micobs.svm.testsetup.VTestSetupScenariosSection#getScenarios <em>Scenarios</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Scenarios</em>'.
	 * @see es.uah.aut.srg.micobs.svm.testsetup.VTestSetupScenariosSection#getScenarios()
	 * @see #getVTestSetupScenariosSection()
	 * @generated
	 */
	EReference getVTestSetupScenariosSection_Scenarios();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.micobs.svm.testsetup.VTestSetupScenarioSection <em>VTest Setup Scenario Section</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>VTest Setup Scenario Section</em>'.
	 * @see es.uah.aut.srg.micobs.svm.testsetup.VTestSetupScenarioSection
	 * @generated
	 */
	EClass getVTestSetupScenarioSection();

	/**
	 * Returns the meta object for the reference '{@link es.uah.aut.srg.micobs.svm.testsetup.VTestSetupScenarioSection#getScenario <em>Scenario</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Scenario</em>'.
	 * @see es.uah.aut.srg.micobs.svm.testsetup.VTestSetupScenarioSection#getScenario()
	 * @see #getVTestSetupScenarioSection()
	 * @generated
	 */
	EReference getVTestSetupScenarioSection_Scenario();

	/**
	 * Returns the meta object for the containment reference list '{@link es.uah.aut.srg.micobs.svm.testsetup.VTestSetupScenarioSection#getSupportedInterface <em>Supported Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Supported Interface</em>'.
	 * @see es.uah.aut.srg.micobs.svm.testsetup.VTestSetupScenarioSection#getSupportedInterface()
	 * @see #getVTestSetupScenarioSection()
	 * @generated
	 */
	EReference getVTestSetupScenarioSection_SupportedInterface();

	/**
	 * Returns the meta object for the containment reference list '{@link es.uah.aut.srg.micobs.svm.testsetup.VTestSetupScenarioSection#getSelectedConfiguration <em>Selected Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Selected Configuration</em>'.
	 * @see es.uah.aut.srg.micobs.svm.testsetup.VTestSetupScenarioSection#getSelectedConfiguration()
	 * @see #getVTestSetupScenarioSection()
	 * @generated
	 */
	EReference getVTestSetupScenarioSection_SelectedConfiguration();

	/**
	 * Returns the meta object for the reference list '{@link es.uah.aut.srg.micobs.svm.testsetup.VTestSetupScenarioSection#getSupportedAction <em>Supported Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Supported Action</em>'.
	 * @see es.uah.aut.srg.micobs.svm.testsetup.VTestSetupScenarioSection#getSupportedAction()
	 * @see #getVTestSetupScenarioSection()
	 * @generated
	 */
	EReference getVTestSetupScenarioSection_SupportedAction();

	/**
	 * Returns the meta object for the containment reference list '{@link es.uah.aut.srg.micobs.svm.testsetup.VTestSetupScenarioSection#getSupportedActionOverVariable <em>Supported Action Over Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Supported Action Over Variable</em>'.
	 * @see es.uah.aut.srg.micobs.svm.testsetup.VTestSetupScenarioSection#getSupportedActionOverVariable()
	 * @see #getVTestSetupScenarioSection()
	 * @generated
	 */
	EReference getVTestSetupScenarioSection_SupportedActionOverVariable();

	/**
	 * Returns the meta object for the containment reference '{@link es.uah.aut.srg.micobs.svm.testsetup.VTestSetupScenarioSection#getBody <em>Body</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Body</em>'.
	 * @see es.uah.aut.srg.micobs.svm.testsetup.VTestSetupScenarioSection#getBody()
	 * @see #getVTestSetupScenarioSection()
	 * @generated
	 */
	EReference getVTestSetupScenarioSection_Body();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.micobs.svm.testsetup.VTestSetupSupportedInterface <em>VTest Setup Supported Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>VTest Setup Supported Interface</em>'.
	 * @see es.uah.aut.srg.micobs.svm.testsetup.VTestSetupSupportedInterface
	 * @generated
	 */
	EClass getVTestSetupSupportedInterface();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.micobs.svm.testsetup.VTestSetupSupportedInterface#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see es.uah.aut.srg.micobs.svm.testsetup.VTestSetupSupportedInterface#getName()
	 * @see #getVTestSetupSupportedInterface()
	 * @generated
	 */
	EAttribute getVTestSetupSupportedInterface_Name();

	/**
	 * Returns the meta object for the reference '{@link es.uah.aut.srg.micobs.svm.testsetup.VTestSetupSupportedInterface#getInterface <em>Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Interface</em>'.
	 * @see es.uah.aut.srg.micobs.svm.testsetup.VTestSetupSupportedInterface#getInterface()
	 * @see #getVTestSetupSupportedInterface()
	 * @generated
	 */
	EReference getVTestSetupSupportedInterface_Interface();

	/**
	 * Returns the meta object for the reference '{@link es.uah.aut.srg.micobs.svm.testsetup.VTestSetupSupportedInterface#getScenarioInterface <em>Scenario Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Scenario Interface</em>'.
	 * @see es.uah.aut.srg.micobs.svm.testsetup.VTestSetupSupportedInterface#getScenarioInterface()
	 * @see #getVTestSetupSupportedInterface()
	 * @generated
	 */
	EReference getVTestSetupSupportedInterface_ScenarioInterface();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.micobs.svm.testsetup.VTestSetupSelectedConfiguration <em>VTest Setup Selected Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>VTest Setup Selected Configuration</em>'.
	 * @see es.uah.aut.srg.micobs.svm.testsetup.VTestSetupSelectedConfiguration
	 * @generated
	 */
	EClass getVTestSetupSelectedConfiguration();

	/**
	 * Returns the meta object for the reference '{@link es.uah.aut.srg.micobs.svm.testsetup.VTestSetupSelectedConfiguration#getConfiguration <em>Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Configuration</em>'.
	 * @see es.uah.aut.srg.micobs.svm.testsetup.VTestSetupSelectedConfiguration#getConfiguration()
	 * @see #getVTestSetupSelectedConfiguration()
	 * @generated
	 */
	EReference getVTestSetupSelectedConfiguration_Configuration();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.micobs.svm.testsetup.VTestSetupSelectedConfiguration#getDefaultFilterStatus <em>Default Filter Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Default Filter Status</em>'.
	 * @see es.uah.aut.srg.micobs.svm.testsetup.VTestSetupSelectedConfiguration#getDefaultFilterStatus()
	 * @see #getVTestSetupSelectedConfiguration()
	 * @generated
	 */
	EAttribute getVTestSetupSelectedConfiguration_DefaultFilterStatus();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.micobs.svm.testsetup.VTestSetupSelectedConfiguration#getDefaultPrintStatus <em>Default Print Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Default Print Status</em>'.
	 * @see es.uah.aut.srg.micobs.svm.testsetup.VTestSetupSelectedConfiguration#getDefaultPrintStatus()
	 * @see #getVTestSetupSelectedConfiguration()
	 * @generated
	 */
	EAttribute getVTestSetupSelectedConfiguration_DefaultPrintStatus();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.micobs.svm.testsetup.VTestSetupSupportedActionOverVariable <em>VTest Setup Supported Action Over Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>VTest Setup Supported Action Over Variable</em>'.
	 * @see es.uah.aut.srg.micobs.svm.testsetup.VTestSetupSupportedActionOverVariable
	 * @generated
	 */
	EClass getVTestSetupSupportedActionOverVariable();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.micobs.svm.testsetup.VTestSetupSupportedActionOverVariable#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see es.uah.aut.srg.micobs.svm.testsetup.VTestSetupSupportedActionOverVariable#getName()
	 * @see #getVTestSetupSupportedActionOverVariable()
	 * @generated
	 */
	EAttribute getVTestSetupSupportedActionOverVariable_Name();

	/**
	 * Returns the meta object for the reference '{@link es.uah.aut.srg.micobs.svm.testsetup.VTestSetupSupportedActionOverVariable#getActionOverVariable <em>Action Over Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Action Over Variable</em>'.
	 * @see es.uah.aut.srg.micobs.svm.testsetup.VTestSetupSupportedActionOverVariable#getActionOverVariable()
	 * @see #getVTestSetupSupportedActionOverVariable()
	 * @generated
	 */
	EReference getVTestSetupSupportedActionOverVariable_ActionOverVariable();

	/**
	 * Returns the meta object for the reference '{@link es.uah.aut.srg.micobs.svm.testsetup.VTestSetupSupportedActionOverVariable#getScenarioVariable <em>Scenario Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Scenario Variable</em>'.
	 * @see es.uah.aut.srg.micobs.svm.testsetup.VTestSetupSupportedActionOverVariable#getScenarioVariable()
	 * @see #getVTestSetupSupportedActionOverVariable()
	 * @generated
	 */
	EReference getVTestSetupSupportedActionOverVariable_ScenarioVariable();

	/**
	 * Returns the meta object for enum '{@link es.uah.aut.srg.micobs.svm.testsetup.VTestSetupActionType <em>VTest Setup Action Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>VTest Setup Action Type</em>'.
	 * @see es.uah.aut.srg.micobs.svm.testsetup.VTestSetupActionType
	 * @generated
	 */
	EEnum getVTestSetupActionType();

	/**
	 * Returns the meta object for enum '{@link es.uah.aut.srg.micobs.svm.testsetup.VTestSetupActionOverVariableType <em>VTest Setup Action Over Variable Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>VTest Setup Action Over Variable Type</em>'.
	 * @see es.uah.aut.srg.micobs.svm.testsetup.VTestSetupActionOverVariableType
	 * @generated
	 */
	EEnum getVTestSetupActionOverVariableType();

	/**
	 * Returns the meta object for enum '{@link es.uah.aut.srg.micobs.svm.testsetup.VTestSetupConfigurationStatus <em>VTest Setup Configuration Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>VTest Setup Configuration Status</em>'.
	 * @see es.uah.aut.srg.micobs.svm.testsetup.VTestSetupConfigurationStatus
	 * @generated
	 */
	EEnum getVTestSetupConfigurationStatus();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	testsetupFactory gettestsetupFactory();

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
		 * The meta object literal for the '{@link es.uah.aut.srg.micobs.svm.testsetup.impl.VTestSetupDocumentImpl <em>VTest Setup Document</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uah.aut.srg.micobs.svm.testsetup.impl.VTestSetupDocumentImpl
		 * @see es.uah.aut.srg.micobs.svm.testsetup.impl.testsetupPackageImpl#getVTestSetupDocument()
		 * @generated
		 */
		EClass VTEST_SETUP_DOCUMENT = eINSTANCE.getVTestSetupDocument();

		/**
		 * The meta object literal for the '<em><b>Tbcs Tbds Section</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VTEST_SETUP_DOCUMENT__TBCS_TBDS_SECTION = eINSTANCE.getVTestSetupDocument_TbcsTbdsSection();

		/**
		 * The meta object literal for the '<em><b>Applicable Documents Section</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VTEST_SETUP_DOCUMENT__APPLICABLE_DOCUMENTS_SECTION = eINSTANCE.getVTestSetupDocument_ApplicableDocumentsSection();

		/**
		 * The meta object literal for the '<em><b>Reference Documents Section</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VTEST_SETUP_DOCUMENT__REFERENCE_DOCUMENTS_SECTION = eINSTANCE.getVTestSetupDocument_ReferenceDocumentsSection();

		/**
		 * The meta object literal for the '<em><b>Interfaces</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VTEST_SETUP_DOCUMENT__INTERFACES = eINSTANCE.getVTestSetupDocument_Interfaces();

		/**
		 * The meta object literal for the '<em><b>Configurations</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VTEST_SETUP_DOCUMENT__CONFIGURATIONS = eINSTANCE.getVTestSetupDocument_Configurations();

		/**
		 * The meta object literal for the '<em><b>Actions</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VTEST_SETUP_DOCUMENT__ACTIONS = eINSTANCE.getVTestSetupDocument_Actions();

		/**
		 * The meta object literal for the '<em><b>Actions Over Variables</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VTEST_SETUP_DOCUMENT__ACTIONS_OVER_VARIABLES = eINSTANCE.getVTestSetupDocument_ActionsOverVariables();

		/**
		 * The meta object literal for the '<em><b>Scenarios</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VTEST_SETUP_DOCUMENT__SCENARIOS = eINSTANCE.getVTestSetupDocument_Scenarios();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.micobs.svm.testsetup.impl.VTestSetupTBCsTBDsImpl <em>VTest Setup TB Cs TB Ds</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uah.aut.srg.micobs.svm.testsetup.impl.VTestSetupTBCsTBDsImpl
		 * @see es.uah.aut.srg.micobs.svm.testsetup.impl.testsetupPackageImpl#getVTestSetupTBCsTBDs()
		 * @generated
		 */
		EClass VTEST_SETUP_TB_CS_TB_DS = eINSTANCE.getVTestSetupTBCsTBDs();

		/**
		 * The meta object literal for the '<em><b>Tbcs</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VTEST_SETUP_TB_CS_TB_DS__TBCS = eINSTANCE.getVTestSetupTBCsTBDs_Tbcs();

		/**
		 * The meta object literal for the '<em><b>Tbds</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VTEST_SETUP_TB_CS_TB_DS__TBDS = eINSTANCE.getVTestSetupTBCsTBDs_Tbds();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.micobs.svm.testsetup.impl.VTestSetupApplicableDocumentsImpl <em>VTest Setup Applicable Documents</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uah.aut.srg.micobs.svm.testsetup.impl.VTestSetupApplicableDocumentsImpl
		 * @see es.uah.aut.srg.micobs.svm.testsetup.impl.testsetupPackageImpl#getVTestSetupApplicableDocuments()
		 * @generated
		 */
		EClass VTEST_SETUP_APPLICABLE_DOCUMENTS = eINSTANCE.getVTestSetupApplicableDocuments();

		/**
		 * The meta object literal for the '<em><b>Applicable Documents</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VTEST_SETUP_APPLICABLE_DOCUMENTS__APPLICABLE_DOCUMENTS = eINSTANCE.getVTestSetupApplicableDocuments_ApplicableDocuments();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.micobs.svm.testsetup.impl.VTestSetupReferenceDocumentsImpl <em>VTest Setup Reference Documents</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uah.aut.srg.micobs.svm.testsetup.impl.VTestSetupReferenceDocumentsImpl
		 * @see es.uah.aut.srg.micobs.svm.testsetup.impl.testsetupPackageImpl#getVTestSetupReferenceDocuments()
		 * @generated
		 */
		EClass VTEST_SETUP_REFERENCE_DOCUMENTS = eINSTANCE.getVTestSetupReferenceDocuments();

		/**
		 * The meta object literal for the '<em><b>Reference Documents</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VTEST_SETUP_REFERENCE_DOCUMENTS__REFERENCE_DOCUMENTS = eINSTANCE.getVTestSetupReferenceDocuments_ReferenceDocuments();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.micobs.svm.testsetup.impl.VTestSetupInterfacesSectionImpl <em>VTest Setup Interfaces Section</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uah.aut.srg.micobs.svm.testsetup.impl.VTestSetupInterfacesSectionImpl
		 * @see es.uah.aut.srg.micobs.svm.testsetup.impl.testsetupPackageImpl#getVTestSetupInterfacesSection()
		 * @generated
		 */
		EClass VTEST_SETUP_INTERFACES_SECTION = eINSTANCE.getVTestSetupInterfacesSection();

		/**
		 * The meta object literal for the '<em><b>Interfaces</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VTEST_SETUP_INTERFACES_SECTION__INTERFACES = eINSTANCE.getVTestSetupInterfacesSection_Interfaces();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.micobs.svm.testsetup.impl.VTestSetupInterfaceImpl <em>VTest Setup Interface</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uah.aut.srg.micobs.svm.testsetup.impl.VTestSetupInterfaceImpl
		 * @see es.uah.aut.srg.micobs.svm.testsetup.impl.testsetupPackageImpl#getVTestSetupInterface()
		 * @generated
		 */
		EClass VTEST_SETUP_INTERFACE = eINSTANCE.getVTestSetupInterface();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VTEST_SETUP_INTERFACE__NAME = eINSTANCE.getVTestSetupInterface_Name();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VTEST_SETUP_INTERFACE__DESCRIPTION = eINSTANCE.getVTestSetupInterface_Description();

		/**
		 * The meta object literal for the '<em><b>Tc Header</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VTEST_SETUP_INTERFACE__TC_HEADER = eINSTANCE.getVTestSetupInterface_TcHeader();

		/**
		 * The meta object literal for the '<em><b>Tm Header</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VTEST_SETUP_INTERFACE__TM_HEADER = eINSTANCE.getVTestSetupInterface_TmHeader();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.micobs.svm.testsetup.impl.VTestSetupPacketConfigurationsSectionImpl <em>VTest Setup Packet Configurations Section</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uah.aut.srg.micobs.svm.testsetup.impl.VTestSetupPacketConfigurationsSectionImpl
		 * @see es.uah.aut.srg.micobs.svm.testsetup.impl.testsetupPackageImpl#getVTestSetupPacketConfigurationsSection()
		 * @generated
		 */
		EClass VTEST_SETUP_PACKET_CONFIGURATIONS_SECTION = eINSTANCE.getVTestSetupPacketConfigurationsSection();

		/**
		 * The meta object literal for the '<em><b>Packet Configurations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VTEST_SETUP_PACKET_CONFIGURATIONS_SECTION__PACKET_CONFIGURATIONS = eINSTANCE.getVTestSetupPacketConfigurationsSection_PacketConfigurations();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.micobs.svm.testsetup.impl.VTestSetupPacketConfigurationImpl <em>VTest Setup Packet Configuration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uah.aut.srg.micobs.svm.testsetup.impl.VTestSetupPacketConfigurationImpl
		 * @see es.uah.aut.srg.micobs.svm.testsetup.impl.testsetupPackageImpl#getVTestSetupPacketConfiguration()
		 * @generated
		 */
		EClass VTEST_SETUP_PACKET_CONFIGURATION = eINSTANCE.getVTestSetupPacketConfiguration();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VTEST_SETUP_PACKET_CONFIGURATION__NAME = eINSTANCE.getVTestSetupPacketConfiguration_Name();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VTEST_SETUP_PACKET_CONFIGURATION__ID = eINSTANCE.getVTestSetupPacketConfiguration_Id();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VTEST_SETUP_PACKET_CONFIGURATION__DESCRIPTION = eINSTANCE.getVTestSetupPacketConfiguration_Description();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.micobs.svm.testsetup.impl.VTestSetupActionsSectionImpl <em>VTest Setup Actions Section</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uah.aut.srg.micobs.svm.testsetup.impl.VTestSetupActionsSectionImpl
		 * @see es.uah.aut.srg.micobs.svm.testsetup.impl.testsetupPackageImpl#getVTestSetupActionsSection()
		 * @generated
		 */
		EClass VTEST_SETUP_ACTIONS_SECTION = eINSTANCE.getVTestSetupActionsSection();

		/**
		 * The meta object literal for the '<em><b>Actions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VTEST_SETUP_ACTIONS_SECTION__ACTIONS = eINSTANCE.getVTestSetupActionsSection_Actions();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.micobs.svm.testsetup.impl.VTestSetupActionImpl <em>VTest Setup Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uah.aut.srg.micobs.svm.testsetup.impl.VTestSetupActionImpl
		 * @see es.uah.aut.srg.micobs.svm.testsetup.impl.testsetupPackageImpl#getVTestSetupAction()
		 * @generated
		 */
		EClass VTEST_SETUP_ACTION = eINSTANCE.getVTestSetupAction();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VTEST_SETUP_ACTION__NAME = eINSTANCE.getVTestSetupAction_Name();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VTEST_SETUP_ACTION__DESCRIPTION = eINSTANCE.getVTestSetupAction_Description();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VTEST_SETUP_ACTION__TYPE = eINSTANCE.getVTestSetupAction_Type();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.micobs.svm.testsetup.impl.VTestSetupActionsOverVariablesSectionImpl <em>VTest Setup Actions Over Variables Section</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uah.aut.srg.micobs.svm.testsetup.impl.VTestSetupActionsOverVariablesSectionImpl
		 * @see es.uah.aut.srg.micobs.svm.testsetup.impl.testsetupPackageImpl#getVTestSetupActionsOverVariablesSection()
		 * @generated
		 */
		EClass VTEST_SETUP_ACTIONS_OVER_VARIABLES_SECTION = eINSTANCE.getVTestSetupActionsOverVariablesSection();

		/**
		 * The meta object literal for the '<em><b>Actions Over Variable</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VTEST_SETUP_ACTIONS_OVER_VARIABLES_SECTION__ACTIONS_OVER_VARIABLE = eINSTANCE.getVTestSetupActionsOverVariablesSection_ActionsOverVariable();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.micobs.svm.testsetup.impl.VTestSetupActionOverVariableImpl <em>VTest Setup Action Over Variable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uah.aut.srg.micobs.svm.testsetup.impl.VTestSetupActionOverVariableImpl
		 * @see es.uah.aut.srg.micobs.svm.testsetup.impl.testsetupPackageImpl#getVTestSetupActionOverVariable()
		 * @generated
		 */
		EClass VTEST_SETUP_ACTION_OVER_VARIABLE = eINSTANCE.getVTestSetupActionOverVariable();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VTEST_SETUP_ACTION_OVER_VARIABLE__NAME = eINSTANCE.getVTestSetupActionOverVariable_Name();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VTEST_SETUP_ACTION_OVER_VARIABLE__DESCRIPTION = eINSTANCE.getVTestSetupActionOverVariable_Description();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VTEST_SETUP_ACTION_OVER_VARIABLE__TYPE = eINSTANCE.getVTestSetupActionOverVariable_Type();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.micobs.svm.testsetup.impl.VTestSetupScenariosSectionImpl <em>VTest Setup Scenarios Section</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uah.aut.srg.micobs.svm.testsetup.impl.VTestSetupScenariosSectionImpl
		 * @see es.uah.aut.srg.micobs.svm.testsetup.impl.testsetupPackageImpl#getVTestSetupScenariosSection()
		 * @generated
		 */
		EClass VTEST_SETUP_SCENARIOS_SECTION = eINSTANCE.getVTestSetupScenariosSection();

		/**
		 * The meta object literal for the '<em><b>Scenarios</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VTEST_SETUP_SCENARIOS_SECTION__SCENARIOS = eINSTANCE.getVTestSetupScenariosSection_Scenarios();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.micobs.svm.testsetup.impl.VTestSetupScenarioSectionImpl <em>VTest Setup Scenario Section</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uah.aut.srg.micobs.svm.testsetup.impl.VTestSetupScenarioSectionImpl
		 * @see es.uah.aut.srg.micobs.svm.testsetup.impl.testsetupPackageImpl#getVTestSetupScenarioSection()
		 * @generated
		 */
		EClass VTEST_SETUP_SCENARIO_SECTION = eINSTANCE.getVTestSetupScenarioSection();

		/**
		 * The meta object literal for the '<em><b>Scenario</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VTEST_SETUP_SCENARIO_SECTION__SCENARIO = eINSTANCE.getVTestSetupScenarioSection_Scenario();

		/**
		 * The meta object literal for the '<em><b>Supported Interface</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VTEST_SETUP_SCENARIO_SECTION__SUPPORTED_INTERFACE = eINSTANCE.getVTestSetupScenarioSection_SupportedInterface();

		/**
		 * The meta object literal for the '<em><b>Selected Configuration</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VTEST_SETUP_SCENARIO_SECTION__SELECTED_CONFIGURATION = eINSTANCE.getVTestSetupScenarioSection_SelectedConfiguration();

		/**
		 * The meta object literal for the '<em><b>Supported Action</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VTEST_SETUP_SCENARIO_SECTION__SUPPORTED_ACTION = eINSTANCE.getVTestSetupScenarioSection_SupportedAction();

		/**
		 * The meta object literal for the '<em><b>Supported Action Over Variable</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VTEST_SETUP_SCENARIO_SECTION__SUPPORTED_ACTION_OVER_VARIABLE = eINSTANCE.getVTestSetupScenarioSection_SupportedActionOverVariable();

		/**
		 * The meta object literal for the '<em><b>Body</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VTEST_SETUP_SCENARIO_SECTION__BODY = eINSTANCE.getVTestSetupScenarioSection_Body();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.micobs.svm.testsetup.impl.VTestSetupSupportedInterfaceImpl <em>VTest Setup Supported Interface</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uah.aut.srg.micobs.svm.testsetup.impl.VTestSetupSupportedInterfaceImpl
		 * @see es.uah.aut.srg.micobs.svm.testsetup.impl.testsetupPackageImpl#getVTestSetupSupportedInterface()
		 * @generated
		 */
		EClass VTEST_SETUP_SUPPORTED_INTERFACE = eINSTANCE.getVTestSetupSupportedInterface();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VTEST_SETUP_SUPPORTED_INTERFACE__NAME = eINSTANCE.getVTestSetupSupportedInterface_Name();

		/**
		 * The meta object literal for the '<em><b>Interface</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VTEST_SETUP_SUPPORTED_INTERFACE__INTERFACE = eINSTANCE.getVTestSetupSupportedInterface_Interface();

		/**
		 * The meta object literal for the '<em><b>Scenario Interface</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VTEST_SETUP_SUPPORTED_INTERFACE__SCENARIO_INTERFACE = eINSTANCE.getVTestSetupSupportedInterface_ScenarioInterface();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.micobs.svm.testsetup.impl.VTestSetupSelectedConfigurationImpl <em>VTest Setup Selected Configuration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uah.aut.srg.micobs.svm.testsetup.impl.VTestSetupSelectedConfigurationImpl
		 * @see es.uah.aut.srg.micobs.svm.testsetup.impl.testsetupPackageImpl#getVTestSetupSelectedConfiguration()
		 * @generated
		 */
		EClass VTEST_SETUP_SELECTED_CONFIGURATION = eINSTANCE.getVTestSetupSelectedConfiguration();

		/**
		 * The meta object literal for the '<em><b>Configuration</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VTEST_SETUP_SELECTED_CONFIGURATION__CONFIGURATION = eINSTANCE.getVTestSetupSelectedConfiguration_Configuration();

		/**
		 * The meta object literal for the '<em><b>Default Filter Status</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VTEST_SETUP_SELECTED_CONFIGURATION__DEFAULT_FILTER_STATUS = eINSTANCE.getVTestSetupSelectedConfiguration_DefaultFilterStatus();

		/**
		 * The meta object literal for the '<em><b>Default Print Status</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VTEST_SETUP_SELECTED_CONFIGURATION__DEFAULT_PRINT_STATUS = eINSTANCE.getVTestSetupSelectedConfiguration_DefaultPrintStatus();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.micobs.svm.testsetup.impl.VTestSetupSupportedActionOverVariableImpl <em>VTest Setup Supported Action Over Variable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uah.aut.srg.micobs.svm.testsetup.impl.VTestSetupSupportedActionOverVariableImpl
		 * @see es.uah.aut.srg.micobs.svm.testsetup.impl.testsetupPackageImpl#getVTestSetupSupportedActionOverVariable()
		 * @generated
		 */
		EClass VTEST_SETUP_SUPPORTED_ACTION_OVER_VARIABLE = eINSTANCE.getVTestSetupSupportedActionOverVariable();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VTEST_SETUP_SUPPORTED_ACTION_OVER_VARIABLE__NAME = eINSTANCE.getVTestSetupSupportedActionOverVariable_Name();

		/**
		 * The meta object literal for the '<em><b>Action Over Variable</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VTEST_SETUP_SUPPORTED_ACTION_OVER_VARIABLE__ACTION_OVER_VARIABLE = eINSTANCE.getVTestSetupSupportedActionOverVariable_ActionOverVariable();

		/**
		 * The meta object literal for the '<em><b>Scenario Variable</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VTEST_SETUP_SUPPORTED_ACTION_OVER_VARIABLE__SCENARIO_VARIABLE = eINSTANCE.getVTestSetupSupportedActionOverVariable_ScenarioVariable();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.micobs.svm.testsetup.VTestSetupActionType <em>VTest Setup Action Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uah.aut.srg.micobs.svm.testsetup.VTestSetupActionType
		 * @see es.uah.aut.srg.micobs.svm.testsetup.impl.testsetupPackageImpl#getVTestSetupActionType()
		 * @generated
		 */
		EEnum VTEST_SETUP_ACTION_TYPE = eINSTANCE.getVTestSetupActionType();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.micobs.svm.testsetup.VTestSetupActionOverVariableType <em>VTest Setup Action Over Variable Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uah.aut.srg.micobs.svm.testsetup.VTestSetupActionOverVariableType
		 * @see es.uah.aut.srg.micobs.svm.testsetup.impl.testsetupPackageImpl#getVTestSetupActionOverVariableType()
		 * @generated
		 */
		EEnum VTEST_SETUP_ACTION_OVER_VARIABLE_TYPE = eINSTANCE.getVTestSetupActionOverVariableType();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.micobs.svm.testsetup.VTestSetupConfigurationStatus <em>VTest Setup Configuration Status</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uah.aut.srg.micobs.svm.testsetup.VTestSetupConfigurationStatus
		 * @see es.uah.aut.srg.micobs.svm.testsetup.impl.testsetupPackageImpl#getVTestSetupConfigurationStatus()
		 * @generated
		 */
		EEnum VTEST_SETUP_CONFIGURATION_STATUS = eINSTANCE.getVTestSetupConfigurationStatus();

	}

} //testsetupPackage
