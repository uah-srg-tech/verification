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
package es.uah.aut.srg.micobs.svm.sss;

import es.uah.aut.srg.micobs.svm.tdm.tdmPackage;

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
 * @see es.uah.aut.srg.micobs.svm.sss.sssFactory
 * @model kind="package"
 * @generated
 */
public interface sssPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "sss";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://srg.aut.uah.es/micobs/svm/sss";

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
	sssPackage eINSTANCE = es.uah.aut.srg.micobs.svm.sss.impl.sssPackageImpl.init();

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.micobs.svm.sss.impl.VSSSIntroductionImpl <em>VSSS Introduction</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uah.aut.srg.micobs.svm.sss.impl.VSSSIntroductionImpl
	 * @see es.uah.aut.srg.micobs.svm.sss.impl.sssPackageImpl#getVSSSIntroduction()
	 * @generated
	 */
	int VSSS_INTRODUCTION = 0;

	/**
	 * The feature id for the '<em><b>VSSS Purpose</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSSS_INTRODUCTION__VSSS_PURPOSE = 0;

	/**
	 * The feature id for the '<em><b>VSSS Objetive</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSSS_INTRODUCTION__VSSS_OBJETIVE = 1;

	/**
	 * The feature id for the '<em><b>VSSS Content</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSSS_INTRODUCTION__VSSS_CONTENT = 2;

	/**
	 * The feature id for the '<em><b>VSSS Reason</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSSS_INTRODUCTION__VSSS_REASON = 3;

	/**
	 * The number of structural features of the '<em>VSSS Introduction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSSS_INTRODUCTION_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>VSSS Introduction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSSS_INTRODUCTION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.micobs.svm.sss.impl.VSSSApplicableDocumentsImpl <em>VSSS Applicable Documents</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uah.aut.srg.micobs.svm.sss.impl.VSSSApplicableDocumentsImpl
	 * @see es.uah.aut.srg.micobs.svm.sss.impl.sssPackageImpl#getVSSSApplicableDocuments()
	 * @generated
	 */
	int VSSS_APPLICABLE_DOCUMENTS = 1;

	/**
	 * The feature id for the '<em><b>VSSS Applicable Document</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSSS_APPLICABLE_DOCUMENTS__VSSS_APPLICABLE_DOCUMENT = 0;

	/**
	 * The number of structural features of the '<em>VSSS Applicable Documents</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSSS_APPLICABLE_DOCUMENTS_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>VSSS Applicable Documents</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSSS_APPLICABLE_DOCUMENTS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.micobs.svm.sss.impl.VSSSReferenceDocumentsImpl <em>VSSS Reference Documents</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uah.aut.srg.micobs.svm.sss.impl.VSSSReferenceDocumentsImpl
	 * @see es.uah.aut.srg.micobs.svm.sss.impl.sssPackageImpl#getVSSSReferenceDocuments()
	 * @generated
	 */
	int VSSS_REFERENCE_DOCUMENTS = 2;

	/**
	 * The feature id for the '<em><b>VSSS Reference Document</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSSS_REFERENCE_DOCUMENTS__VSSS_REFERENCE_DOCUMENT = 0;

	/**
	 * The number of structural features of the '<em>VSSS Reference Documents</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSSS_REFERENCE_DOCUMENTS_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>VSSS Reference Documents</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSSS_REFERENCE_DOCUMENTS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.micobs.svm.sss.impl.VSSSTermsDefinitionsAbbreviationsImpl <em>VSSS Terms Definitions Abbreviations</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uah.aut.srg.micobs.svm.sss.impl.VSSSTermsDefinitionsAbbreviationsImpl
	 * @see es.uah.aut.srg.micobs.svm.sss.impl.sssPackageImpl#getVSSSTermsDefinitionsAbbreviations()
	 * @generated
	 */
	int VSSS_TERMS_DEFINITIONS_ABBREVIATIONS = 3;

	/**
	 * The feature id for the '<em><b>VSSS Term</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSSS_TERMS_DEFINITIONS_ABBREVIATIONS__VSSS_TERM = 0;

	/**
	 * The feature id for the '<em><b>VSSS Definition</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSSS_TERMS_DEFINITIONS_ABBREVIATIONS__VSSS_DEFINITION = 1;

	/**
	 * The feature id for the '<em><b>VSSS Abbreviation</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSSS_TERMS_DEFINITIONS_ABBREVIATIONS__VSSS_ABBREVIATION = 2;

	/**
	 * The number of structural features of the '<em>VSSS Terms Definitions Abbreviations</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSSS_TERMS_DEFINITIONS_ABBREVIATIONS_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>VSSS Terms Definitions Abbreviations</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSSS_TERMS_DEFINITIONS_ABBREVIATIONS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.micobs.svm.sss.impl.VSSSGeneralDescriptionImpl <em>VSSS General Description</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uah.aut.srg.micobs.svm.sss.impl.VSSSGeneralDescriptionImpl
	 * @see es.uah.aut.srg.micobs.svm.sss.impl.sssPackageImpl#getVSSSGeneralDescription()
	 * @generated
	 */
	int VSSS_GENERAL_DESCRIPTION = 4;

	/**
	 * The feature id for the '<em><b>VSSS Product Perspective</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSSS_GENERAL_DESCRIPTION__VSSS_PRODUCT_PERSPECTIVE = 0;

	/**
	 * The feature id for the '<em><b>VSSS General Capabilites</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSSS_GENERAL_DESCRIPTION__VSSS_GENERAL_CAPABILITES = 1;

	/**
	 * The feature id for the '<em><b>VSSS General Constraints</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSSS_GENERAL_DESCRIPTION__VSSS_GENERAL_CONSTRAINTS = 2;

	/**
	 * The feature id for the '<em><b>VSSS Operational Environment</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSSS_GENERAL_DESCRIPTION__VSSS_OPERATIONAL_ENVIRONMENT = 3;

	/**
	 * The feature id for the '<em><b>VSSS Assumptions Dependencies</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSSS_GENERAL_DESCRIPTION__VSSS_ASSUMPTIONS_DEPENDENCIES = 4;

	/**
	 * The number of structural features of the '<em>VSSS General Description</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSSS_GENERAL_DESCRIPTION_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>VSSS General Description</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSSS_GENERAL_DESCRIPTION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.micobs.svm.sss.impl.VSSSSpecificRequirementsImpl <em>VSSS Specific Requirements</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uah.aut.srg.micobs.svm.sss.impl.VSSSSpecificRequirementsImpl
	 * @see es.uah.aut.srg.micobs.svm.sss.impl.sssPackageImpl#getVSSSSpecificRequirements()
	 * @generated
	 */
	int VSSS_SPECIFIC_REQUIREMENTS = 5;

	/**
	 * The feature id for the '<em><b>Group</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSSS_SPECIFIC_REQUIREMENTS__GROUP = tdmPackage.VTRACEABLE_DOCUMENT_FIXED_SECTION__GROUP;

	/**
	 * The feature id for the '<em><b>General</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSSS_SPECIFIC_REQUIREMENTS__GENERAL = tdmPackage.VTRACEABLE_DOCUMENT_FIXED_SECTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Capabilities</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSSS_SPECIFIC_REQUIREMENTS__CAPABILITIES = tdmPackage.VTRACEABLE_DOCUMENT_FIXED_SECTION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>System Interface</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSSS_SPECIFIC_REQUIREMENTS__SYSTEM_INTERFACE = tdmPackage.VTRACEABLE_DOCUMENT_FIXED_SECTION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Adaptation Missionization</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSSS_SPECIFIC_REQUIREMENTS__ADAPTATION_MISSIONIZATION = tdmPackage.VTRACEABLE_DOCUMENT_FIXED_SECTION_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Computer Resource</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSSS_SPECIFIC_REQUIREMENTS__COMPUTER_RESOURCE = tdmPackage.VTRACEABLE_DOCUMENT_FIXED_SECTION_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Security</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSSS_SPECIFIC_REQUIREMENTS__SECURITY = tdmPackage.VTRACEABLE_DOCUMENT_FIXED_SECTION_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Safety</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSSS_SPECIFIC_REQUIREMENTS__SAFETY = tdmPackage.VTRACEABLE_DOCUMENT_FIXED_SECTION_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Reliabilty Availability</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSSS_SPECIFIC_REQUIREMENTS__RELIABILTY_AVAILABILITY = tdmPackage.VTRACEABLE_DOCUMENT_FIXED_SECTION_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Quality</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSSS_SPECIFIC_REQUIREMENTS__QUALITY = tdmPackage.VTRACEABLE_DOCUMENT_FIXED_SECTION_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Design</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSSS_SPECIFIC_REQUIREMENTS__DESIGN = tdmPackage.VTRACEABLE_DOCUMENT_FIXED_SECTION_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Software Operations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSSS_SPECIFIC_REQUIREMENTS__SOFTWARE_OPERATIONS = tdmPackage.VTRACEABLE_DOCUMENT_FIXED_SECTION_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Software Maintenance</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSSS_SPECIFIC_REQUIREMENTS__SOFTWARE_MAINTENANCE = tdmPackage.VTRACEABLE_DOCUMENT_FIXED_SECTION_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>System Software Observability</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSSS_SPECIFIC_REQUIREMENTS__SYSTEM_SOFTWARE_OBSERVABILITY = tdmPackage.VTRACEABLE_DOCUMENT_FIXED_SECTION_FEATURE_COUNT + 12;

	/**
	 * The number of structural features of the '<em>VSSS Specific Requirements</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSSS_SPECIFIC_REQUIREMENTS_FEATURE_COUNT = tdmPackage.VTRACEABLE_DOCUMENT_FIXED_SECTION_FEATURE_COUNT + 13;

	/**
	 * The number of operations of the '<em>VSSS Specific Requirements</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSSS_SPECIFIC_REQUIREMENTS_OPERATION_COUNT = tdmPackage.VTRACEABLE_DOCUMENT_FIXED_SECTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.micobs.svm.sss.impl.VSSSGeneralRequirementImpl <em>VSSS General Requirement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uah.aut.srg.micobs.svm.sss.impl.VSSSGeneralRequirementImpl
	 * @see es.uah.aut.srg.micobs.svm.sss.impl.sssPackageImpl#getVSSSGeneralRequirement()
	 * @generated
	 */
	int VSSS_GENERAL_REQUIREMENT = 6;

	/**
	 * The feature id for the '<em><b>Item</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSSS_GENERAL_REQUIREMENT__ITEM = tdmPackage.VTRACEABLE_DOCUMENT_FIXED_GROUP__ITEM;

	/**
	 * The number of structural features of the '<em>VSSS General Requirement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSSS_GENERAL_REQUIREMENT_FEATURE_COUNT = tdmPackage.VTRACEABLE_DOCUMENT_FIXED_GROUP_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>VSSS General Requirement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSSS_GENERAL_REQUIREMENT_OPERATION_COUNT = tdmPackage.VTRACEABLE_DOCUMENT_FIXED_GROUP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.micobs.svm.sss.impl.VSSSCapabilitiesRequirementImpl <em>VSSS Capabilities Requirement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uah.aut.srg.micobs.svm.sss.impl.VSSSCapabilitiesRequirementImpl
	 * @see es.uah.aut.srg.micobs.svm.sss.impl.sssPackageImpl#getVSSSCapabilitiesRequirement()
	 * @generated
	 */
	int VSSS_CAPABILITIES_REQUIREMENT = 7;

	/**
	 * The feature id for the '<em><b>Item</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSSS_CAPABILITIES_REQUIREMENT__ITEM = tdmPackage.VTRACEABLE_DOCUMENT_FIXED_GROUP__ITEM;

	/**
	 * The number of structural features of the '<em>VSSS Capabilities Requirement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSSS_CAPABILITIES_REQUIREMENT_FEATURE_COUNT = tdmPackage.VTRACEABLE_DOCUMENT_FIXED_GROUP_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>VSSS Capabilities Requirement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSSS_CAPABILITIES_REQUIREMENT_OPERATION_COUNT = tdmPackage.VTRACEABLE_DOCUMENT_FIXED_GROUP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.micobs.svm.sss.impl.VSSSSystemInterfaceRequirementImpl <em>VSSS System Interface Requirement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uah.aut.srg.micobs.svm.sss.impl.VSSSSystemInterfaceRequirementImpl
	 * @see es.uah.aut.srg.micobs.svm.sss.impl.sssPackageImpl#getVSSSSystemInterfaceRequirement()
	 * @generated
	 */
	int VSSS_SYSTEM_INTERFACE_REQUIREMENT = 8;

	/**
	 * The feature id for the '<em><b>Item</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSSS_SYSTEM_INTERFACE_REQUIREMENT__ITEM = tdmPackage.VTRACEABLE_DOCUMENT_FIXED_GROUP__ITEM;

	/**
	 * The number of structural features of the '<em>VSSS System Interface Requirement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSSS_SYSTEM_INTERFACE_REQUIREMENT_FEATURE_COUNT = tdmPackage.VTRACEABLE_DOCUMENT_FIXED_GROUP_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>VSSS System Interface Requirement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSSS_SYSTEM_INTERFACE_REQUIREMENT_OPERATION_COUNT = tdmPackage.VTRACEABLE_DOCUMENT_FIXED_GROUP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.micobs.svm.sss.impl.VSSSAdaptationMissionizationRequirementImpl <em>VSSS Adaptation Missionization Requirement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uah.aut.srg.micobs.svm.sss.impl.VSSSAdaptationMissionizationRequirementImpl
	 * @see es.uah.aut.srg.micobs.svm.sss.impl.sssPackageImpl#getVSSSAdaptationMissionizationRequirement()
	 * @generated
	 */
	int VSSS_ADAPTATION_MISSIONIZATION_REQUIREMENT = 9;

	/**
	 * The feature id for the '<em><b>Item</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSSS_ADAPTATION_MISSIONIZATION_REQUIREMENT__ITEM = tdmPackage.VTRACEABLE_DOCUMENT_FIXED_GROUP__ITEM;

	/**
	 * The number of structural features of the '<em>VSSS Adaptation Missionization Requirement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSSS_ADAPTATION_MISSIONIZATION_REQUIREMENT_FEATURE_COUNT = tdmPackage.VTRACEABLE_DOCUMENT_FIXED_GROUP_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>VSSS Adaptation Missionization Requirement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSSS_ADAPTATION_MISSIONIZATION_REQUIREMENT_OPERATION_COUNT = tdmPackage.VTRACEABLE_DOCUMENT_FIXED_GROUP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.micobs.svm.sss.impl.VSSSComputerResourceRequirementImpl <em>VSSS Computer Resource Requirement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uah.aut.srg.micobs.svm.sss.impl.VSSSComputerResourceRequirementImpl
	 * @see es.uah.aut.srg.micobs.svm.sss.impl.sssPackageImpl#getVSSSComputerResourceRequirement()
	 * @generated
	 */
	int VSSS_COMPUTER_RESOURCE_REQUIREMENT = 10;

	/**
	 * The feature id for the '<em><b>Item</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSSS_COMPUTER_RESOURCE_REQUIREMENT__ITEM = tdmPackage.VTRACEABLE_DOCUMENT_FIXED_GROUP__ITEM;

	/**
	 * The number of structural features of the '<em>VSSS Computer Resource Requirement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSSS_COMPUTER_RESOURCE_REQUIREMENT_FEATURE_COUNT = tdmPackage.VTRACEABLE_DOCUMENT_FIXED_GROUP_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>VSSS Computer Resource Requirement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSSS_COMPUTER_RESOURCE_REQUIREMENT_OPERATION_COUNT = tdmPackage.VTRACEABLE_DOCUMENT_FIXED_GROUP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.micobs.svm.sss.impl.VSSSSecurityRequirementImpl <em>VSSS Security Requirement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uah.aut.srg.micobs.svm.sss.impl.VSSSSecurityRequirementImpl
	 * @see es.uah.aut.srg.micobs.svm.sss.impl.sssPackageImpl#getVSSSSecurityRequirement()
	 * @generated
	 */
	int VSSS_SECURITY_REQUIREMENT = 11;

	/**
	 * The feature id for the '<em><b>Item</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSSS_SECURITY_REQUIREMENT__ITEM = tdmPackage.VTRACEABLE_DOCUMENT_FIXED_GROUP__ITEM;

	/**
	 * The number of structural features of the '<em>VSSS Security Requirement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSSS_SECURITY_REQUIREMENT_FEATURE_COUNT = tdmPackage.VTRACEABLE_DOCUMENT_FIXED_GROUP_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>VSSS Security Requirement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSSS_SECURITY_REQUIREMENT_OPERATION_COUNT = tdmPackage.VTRACEABLE_DOCUMENT_FIXED_GROUP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.micobs.svm.sss.impl.VSSSSafetyRequirementImpl <em>VSSS Safety Requirement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uah.aut.srg.micobs.svm.sss.impl.VSSSSafetyRequirementImpl
	 * @see es.uah.aut.srg.micobs.svm.sss.impl.sssPackageImpl#getVSSSSafetyRequirement()
	 * @generated
	 */
	int VSSS_SAFETY_REQUIREMENT = 12;

	/**
	 * The feature id for the '<em><b>Item</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSSS_SAFETY_REQUIREMENT__ITEM = tdmPackage.VTRACEABLE_DOCUMENT_FIXED_GROUP__ITEM;

	/**
	 * The number of structural features of the '<em>VSSS Safety Requirement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSSS_SAFETY_REQUIREMENT_FEATURE_COUNT = tdmPackage.VTRACEABLE_DOCUMENT_FIXED_GROUP_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>VSSS Safety Requirement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSSS_SAFETY_REQUIREMENT_OPERATION_COUNT = tdmPackage.VTRACEABLE_DOCUMENT_FIXED_GROUP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.micobs.svm.sss.impl.VSSSReliabiltyAvailabilityRequirementImpl <em>VSSS Reliabilty Availability Requirement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uah.aut.srg.micobs.svm.sss.impl.VSSSReliabiltyAvailabilityRequirementImpl
	 * @see es.uah.aut.srg.micobs.svm.sss.impl.sssPackageImpl#getVSSSReliabiltyAvailabilityRequirement()
	 * @generated
	 */
	int VSSS_RELIABILTY_AVAILABILITY_REQUIREMENT = 13;

	/**
	 * The feature id for the '<em><b>Item</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSSS_RELIABILTY_AVAILABILITY_REQUIREMENT__ITEM = tdmPackage.VTRACEABLE_DOCUMENT_FIXED_GROUP__ITEM;

	/**
	 * The number of structural features of the '<em>VSSS Reliabilty Availability Requirement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSSS_RELIABILTY_AVAILABILITY_REQUIREMENT_FEATURE_COUNT = tdmPackage.VTRACEABLE_DOCUMENT_FIXED_GROUP_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>VSSS Reliabilty Availability Requirement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSSS_RELIABILTY_AVAILABILITY_REQUIREMENT_OPERATION_COUNT = tdmPackage.VTRACEABLE_DOCUMENT_FIXED_GROUP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.micobs.svm.sss.impl.VSSSQualityRequirementImpl <em>VSSS Quality Requirement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uah.aut.srg.micobs.svm.sss.impl.VSSSQualityRequirementImpl
	 * @see es.uah.aut.srg.micobs.svm.sss.impl.sssPackageImpl#getVSSSQualityRequirement()
	 * @generated
	 */
	int VSSS_QUALITY_REQUIREMENT = 14;

	/**
	 * The feature id for the '<em><b>Item</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSSS_QUALITY_REQUIREMENT__ITEM = tdmPackage.VTRACEABLE_DOCUMENT_FIXED_GROUP__ITEM;

	/**
	 * The number of structural features of the '<em>VSSS Quality Requirement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSSS_QUALITY_REQUIREMENT_FEATURE_COUNT = tdmPackage.VTRACEABLE_DOCUMENT_FIXED_GROUP_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>VSSS Quality Requirement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSSS_QUALITY_REQUIREMENT_OPERATION_COUNT = tdmPackage.VTRACEABLE_DOCUMENT_FIXED_GROUP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.micobs.svm.sss.impl.VSSSDesignRequirementImpl <em>VSSS Design Requirement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uah.aut.srg.micobs.svm.sss.impl.VSSSDesignRequirementImpl
	 * @see es.uah.aut.srg.micobs.svm.sss.impl.sssPackageImpl#getVSSSDesignRequirement()
	 * @generated
	 */
	int VSSS_DESIGN_REQUIREMENT = 15;

	/**
	 * The feature id for the '<em><b>Item</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSSS_DESIGN_REQUIREMENT__ITEM = tdmPackage.VTRACEABLE_DOCUMENT_FIXED_GROUP__ITEM;

	/**
	 * The number of structural features of the '<em>VSSS Design Requirement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSSS_DESIGN_REQUIREMENT_FEATURE_COUNT = tdmPackage.VTRACEABLE_DOCUMENT_FIXED_GROUP_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>VSSS Design Requirement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSSS_DESIGN_REQUIREMENT_OPERATION_COUNT = tdmPackage.VTRACEABLE_DOCUMENT_FIXED_GROUP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.micobs.svm.sss.impl.VSSSSoftwareOperationsRequirementImpl <em>VSSS Software Operations Requirement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uah.aut.srg.micobs.svm.sss.impl.VSSSSoftwareOperationsRequirementImpl
	 * @see es.uah.aut.srg.micobs.svm.sss.impl.sssPackageImpl#getVSSSSoftwareOperationsRequirement()
	 * @generated
	 */
	int VSSS_SOFTWARE_OPERATIONS_REQUIREMENT = 16;

	/**
	 * The feature id for the '<em><b>Item</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSSS_SOFTWARE_OPERATIONS_REQUIREMENT__ITEM = tdmPackage.VTRACEABLE_DOCUMENT_FIXED_GROUP__ITEM;

	/**
	 * The number of structural features of the '<em>VSSS Software Operations Requirement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSSS_SOFTWARE_OPERATIONS_REQUIREMENT_FEATURE_COUNT = tdmPackage.VTRACEABLE_DOCUMENT_FIXED_GROUP_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>VSSS Software Operations Requirement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSSS_SOFTWARE_OPERATIONS_REQUIREMENT_OPERATION_COUNT = tdmPackage.VTRACEABLE_DOCUMENT_FIXED_GROUP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.micobs.svm.sss.impl.VSSSSoftwareMaintenanceRequirementImpl <em>VSSS Software Maintenance Requirement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uah.aut.srg.micobs.svm.sss.impl.VSSSSoftwareMaintenanceRequirementImpl
	 * @see es.uah.aut.srg.micobs.svm.sss.impl.sssPackageImpl#getVSSSSoftwareMaintenanceRequirement()
	 * @generated
	 */
	int VSSS_SOFTWARE_MAINTENANCE_REQUIREMENT = 17;

	/**
	 * The feature id for the '<em><b>Item</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSSS_SOFTWARE_MAINTENANCE_REQUIREMENT__ITEM = tdmPackage.VTRACEABLE_DOCUMENT_FIXED_GROUP__ITEM;

	/**
	 * The number of structural features of the '<em>VSSS Software Maintenance Requirement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSSS_SOFTWARE_MAINTENANCE_REQUIREMENT_FEATURE_COUNT = tdmPackage.VTRACEABLE_DOCUMENT_FIXED_GROUP_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>VSSS Software Maintenance Requirement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSSS_SOFTWARE_MAINTENANCE_REQUIREMENT_OPERATION_COUNT = tdmPackage.VTRACEABLE_DOCUMENT_FIXED_GROUP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.micobs.svm.sss.impl.VSSSSystemSoftwareObservabilityRequirementImpl <em>VSSS System Software Observability Requirement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uah.aut.srg.micobs.svm.sss.impl.VSSSSystemSoftwareObservabilityRequirementImpl
	 * @see es.uah.aut.srg.micobs.svm.sss.impl.sssPackageImpl#getVSSSSystemSoftwareObservabilityRequirement()
	 * @generated
	 */
	int VSSS_SYSTEM_SOFTWARE_OBSERVABILITY_REQUIREMENT = 18;

	/**
	 * The feature id for the '<em><b>Item</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSSS_SYSTEM_SOFTWARE_OBSERVABILITY_REQUIREMENT__ITEM = tdmPackage.VTRACEABLE_DOCUMENT_FIXED_GROUP__ITEM;

	/**
	 * The number of structural features of the '<em>VSSS System Software Observability Requirement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSSS_SYSTEM_SOFTWARE_OBSERVABILITY_REQUIREMENT_FEATURE_COUNT = tdmPackage.VTRACEABLE_DOCUMENT_FIXED_GROUP_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>VSSS System Software Observability Requirement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSSS_SYSTEM_SOFTWARE_OBSERVABILITY_REQUIREMENT_OPERATION_COUNT = tdmPackage.VTRACEABLE_DOCUMENT_FIXED_GROUP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.micobs.svm.sss.impl.VSSSVerificationValidationIntegrationImpl <em>VSSS Verification Validation Integration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uah.aut.srg.micobs.svm.sss.impl.VSSSVerificationValidationIntegrationImpl
	 * @see es.uah.aut.srg.micobs.svm.sss.impl.sssPackageImpl#getVSSSVerificationValidationIntegration()
	 * @generated
	 */
	int VSSS_VERIFICATION_VALIDATION_INTEGRATION = 19;

	/**
	 * The feature id for the '<em><b>Group</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSSS_VERIFICATION_VALIDATION_INTEGRATION__GROUP = tdmPackage.VTRACEABLE_DOCUMENT_FIXED_SECTION__GROUP;

	/**
	 * The feature id for the '<em><b>Verification Validation Process</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSSS_VERIFICATION_VALIDATION_INTEGRATION__VERIFICATION_VALIDATION_PROCESS = tdmPackage.VTRACEABLE_DOCUMENT_FIXED_SECTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Validation Approach</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSSS_VERIFICATION_VALIDATION_INTEGRATION__VALIDATION_APPROACH = tdmPackage.VTRACEABLE_DOCUMENT_FIXED_SECTION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Validation</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSSS_VERIFICATION_VALIDATION_INTEGRATION__VALIDATION = tdmPackage.VTRACEABLE_DOCUMENT_FIXED_SECTION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Verification</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSSS_VERIFICATION_VALIDATION_INTEGRATION__VERIFICATION = tdmPackage.VTRACEABLE_DOCUMENT_FIXED_SECTION_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>VSSS Verification Validation Integration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSSS_VERIFICATION_VALIDATION_INTEGRATION_FEATURE_COUNT = tdmPackage.VTRACEABLE_DOCUMENT_FIXED_SECTION_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>VSSS Verification Validation Integration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSSS_VERIFICATION_VALIDATION_INTEGRATION_OPERATION_COUNT = tdmPackage.VTRACEABLE_DOCUMENT_FIXED_SECTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.micobs.svm.sss.impl.VSSSVerificationValidationProcessRequirementImpl <em>VSSS Verification Validation Process Requirement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uah.aut.srg.micobs.svm.sss.impl.VSSSVerificationValidationProcessRequirementImpl
	 * @see es.uah.aut.srg.micobs.svm.sss.impl.sssPackageImpl#getVSSSVerificationValidationProcessRequirement()
	 * @generated
	 */
	int VSSS_VERIFICATION_VALIDATION_PROCESS_REQUIREMENT = 20;

	/**
	 * The feature id for the '<em><b>Item</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSSS_VERIFICATION_VALIDATION_PROCESS_REQUIREMENT__ITEM = tdmPackage.VTRACEABLE_DOCUMENT_FIXED_GROUP__ITEM;

	/**
	 * The number of structural features of the '<em>VSSS Verification Validation Process Requirement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSSS_VERIFICATION_VALIDATION_PROCESS_REQUIREMENT_FEATURE_COUNT = tdmPackage.VTRACEABLE_DOCUMENT_FIXED_GROUP_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>VSSS Verification Validation Process Requirement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSSS_VERIFICATION_VALIDATION_PROCESS_REQUIREMENT_OPERATION_COUNT = tdmPackage.VTRACEABLE_DOCUMENT_FIXED_GROUP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.micobs.svm.sss.impl.VSSSValidationApproachImpl <em>VSSS Validation Approach</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uah.aut.srg.micobs.svm.sss.impl.VSSSValidationApproachImpl
	 * @see es.uah.aut.srg.micobs.svm.sss.impl.sssPackageImpl#getVSSSValidationApproach()
	 * @generated
	 */
	int VSSS_VALIDATION_APPROACH = 21;

	/**
	 * The feature id for the '<em><b>Item</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSSS_VALIDATION_APPROACH__ITEM = tdmPackage.VTRACEABLE_DOCUMENT_FIXED_GROUP__ITEM;

	/**
	 * The number of structural features of the '<em>VSSS Validation Approach</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSSS_VALIDATION_APPROACH_FEATURE_COUNT = tdmPackage.VTRACEABLE_DOCUMENT_FIXED_GROUP_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>VSSS Validation Approach</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSSS_VALIDATION_APPROACH_OPERATION_COUNT = tdmPackage.VTRACEABLE_DOCUMENT_FIXED_GROUP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.micobs.svm.sss.impl.VSSSVerificationRequirementImpl <em>VSSS Verification Requirement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uah.aut.srg.micobs.svm.sss.impl.VSSSVerificationRequirementImpl
	 * @see es.uah.aut.srg.micobs.svm.sss.impl.sssPackageImpl#getVSSSVerificationRequirement()
	 * @generated
	 */
	int VSSS_VERIFICATION_REQUIREMENT = 22;

	/**
	 * The feature id for the '<em><b>Item</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSSS_VERIFICATION_REQUIREMENT__ITEM = tdmPackage.VTRACEABLE_DOCUMENT_FIXED_GROUP__ITEM;

	/**
	 * The number of structural features of the '<em>VSSS Verification Requirement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSSS_VERIFICATION_REQUIREMENT_FEATURE_COUNT = tdmPackage.VTRACEABLE_DOCUMENT_FIXED_GROUP_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>VSSS Verification Requirement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSSS_VERIFICATION_REQUIREMENT_OPERATION_COUNT = tdmPackage.VTRACEABLE_DOCUMENT_FIXED_GROUP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.micobs.svm.sss.impl.VSSSValidationRequirementImpl <em>VSSS Validation Requirement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uah.aut.srg.micobs.svm.sss.impl.VSSSValidationRequirementImpl
	 * @see es.uah.aut.srg.micobs.svm.sss.impl.sssPackageImpl#getVSSSValidationRequirement()
	 * @generated
	 */
	int VSSS_VALIDATION_REQUIREMENT = 23;

	/**
	 * The feature id for the '<em><b>Item</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSSS_VALIDATION_REQUIREMENT__ITEM = tdmPackage.VTRACEABLE_DOCUMENT_FIXED_GROUP__ITEM;

	/**
	 * The number of structural features of the '<em>VSSS Validation Requirement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSSS_VALIDATION_REQUIREMENT_FEATURE_COUNT = tdmPackage.VTRACEABLE_DOCUMENT_FIXED_GROUP_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>VSSS Validation Requirement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSSS_VALIDATION_REQUIREMENT_OPERATION_COUNT = tdmPackage.VTRACEABLE_DOCUMENT_FIXED_GROUP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.micobs.svm.sss.impl.VSSSSystemModelsImpl <em>VSSS System Models</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uah.aut.srg.micobs.svm.sss.impl.VSSSSystemModelsImpl
	 * @see es.uah.aut.srg.micobs.svm.sss.impl.sssPackageImpl#getVSSSSystemModels()
	 * @generated
	 */
	int VSSS_SYSTEM_MODELS = 24;

	/**
	 * The feature id for the '<em><b>System Model</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSSS_SYSTEM_MODELS__SYSTEM_MODEL = 0;

	/**
	 * The number of structural features of the '<em>VSSS System Models</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSSS_SYSTEM_MODELS_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>VSSS System Models</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSSS_SYSTEM_MODELS_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.micobs.svm.sss.VSSSIntroduction <em>VSSS Introduction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>VSSS Introduction</em>'.
	 * @see es.uah.aut.srg.micobs.svm.sss.VSSSIntroduction
	 * @generated
	 */
	EClass getVSSSIntroduction();

	/**
	 * Returns the meta object for the attribute list '{@link es.uah.aut.srg.micobs.svm.sss.VSSSIntroduction#getVSSSPurpose <em>VSSS Purpose</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>VSSS Purpose</em>'.
	 * @see es.uah.aut.srg.micobs.svm.sss.VSSSIntroduction#getVSSSPurpose()
	 * @see #getVSSSIntroduction()
	 * @generated
	 */
	EAttribute getVSSSIntroduction_VSSSPurpose();

	/**
	 * Returns the meta object for the attribute list '{@link es.uah.aut.srg.micobs.svm.sss.VSSSIntroduction#getVSSSObjetive <em>VSSS Objetive</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>VSSS Objetive</em>'.
	 * @see es.uah.aut.srg.micobs.svm.sss.VSSSIntroduction#getVSSSObjetive()
	 * @see #getVSSSIntroduction()
	 * @generated
	 */
	EAttribute getVSSSIntroduction_VSSSObjetive();

	/**
	 * Returns the meta object for the attribute list '{@link es.uah.aut.srg.micobs.svm.sss.VSSSIntroduction#getVSSSContent <em>VSSS Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>VSSS Content</em>'.
	 * @see es.uah.aut.srg.micobs.svm.sss.VSSSIntroduction#getVSSSContent()
	 * @see #getVSSSIntroduction()
	 * @generated
	 */
	EAttribute getVSSSIntroduction_VSSSContent();

	/**
	 * Returns the meta object for the attribute list '{@link es.uah.aut.srg.micobs.svm.sss.VSSSIntroduction#getVSSSReason <em>VSSS Reason</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>VSSS Reason</em>'.
	 * @see es.uah.aut.srg.micobs.svm.sss.VSSSIntroduction#getVSSSReason()
	 * @see #getVSSSIntroduction()
	 * @generated
	 */
	EAttribute getVSSSIntroduction_VSSSReason();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.micobs.svm.sss.VSSSApplicableDocuments <em>VSSS Applicable Documents</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>VSSS Applicable Documents</em>'.
	 * @see es.uah.aut.srg.micobs.svm.sss.VSSSApplicableDocuments
	 * @generated
	 */
	EClass getVSSSApplicableDocuments();

	/**
	 * Returns the meta object for the attribute list '{@link es.uah.aut.srg.micobs.svm.sss.VSSSApplicableDocuments#getVSSSApplicableDocument <em>VSSS Applicable Document</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>VSSS Applicable Document</em>'.
	 * @see es.uah.aut.srg.micobs.svm.sss.VSSSApplicableDocuments#getVSSSApplicableDocument()
	 * @see #getVSSSApplicableDocuments()
	 * @generated
	 */
	EAttribute getVSSSApplicableDocuments_VSSSApplicableDocument();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.micobs.svm.sss.VSSSReferenceDocuments <em>VSSS Reference Documents</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>VSSS Reference Documents</em>'.
	 * @see es.uah.aut.srg.micobs.svm.sss.VSSSReferenceDocuments
	 * @generated
	 */
	EClass getVSSSReferenceDocuments();

	/**
	 * Returns the meta object for the attribute list '{@link es.uah.aut.srg.micobs.svm.sss.VSSSReferenceDocuments#getVSSSReferenceDocument <em>VSSS Reference Document</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>VSSS Reference Document</em>'.
	 * @see es.uah.aut.srg.micobs.svm.sss.VSSSReferenceDocuments#getVSSSReferenceDocument()
	 * @see #getVSSSReferenceDocuments()
	 * @generated
	 */
	EAttribute getVSSSReferenceDocuments_VSSSReferenceDocument();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.micobs.svm.sss.VSSSTermsDefinitionsAbbreviations <em>VSSS Terms Definitions Abbreviations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>VSSS Terms Definitions Abbreviations</em>'.
	 * @see es.uah.aut.srg.micobs.svm.sss.VSSSTermsDefinitionsAbbreviations
	 * @generated
	 */
	EClass getVSSSTermsDefinitionsAbbreviations();

	/**
	 * Returns the meta object for the attribute list '{@link es.uah.aut.srg.micobs.svm.sss.VSSSTermsDefinitionsAbbreviations#getVSSSTerm <em>VSSS Term</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>VSSS Term</em>'.
	 * @see es.uah.aut.srg.micobs.svm.sss.VSSSTermsDefinitionsAbbreviations#getVSSSTerm()
	 * @see #getVSSSTermsDefinitionsAbbreviations()
	 * @generated
	 */
	EAttribute getVSSSTermsDefinitionsAbbreviations_VSSSTerm();

	/**
	 * Returns the meta object for the attribute list '{@link es.uah.aut.srg.micobs.svm.sss.VSSSTermsDefinitionsAbbreviations#getVSSSDefinition <em>VSSS Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>VSSS Definition</em>'.
	 * @see es.uah.aut.srg.micobs.svm.sss.VSSSTermsDefinitionsAbbreviations#getVSSSDefinition()
	 * @see #getVSSSTermsDefinitionsAbbreviations()
	 * @generated
	 */
	EAttribute getVSSSTermsDefinitionsAbbreviations_VSSSDefinition();

	/**
	 * Returns the meta object for the attribute list '{@link es.uah.aut.srg.micobs.svm.sss.VSSSTermsDefinitionsAbbreviations#getVSSSAbbreviation <em>VSSS Abbreviation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>VSSS Abbreviation</em>'.
	 * @see es.uah.aut.srg.micobs.svm.sss.VSSSTermsDefinitionsAbbreviations#getVSSSAbbreviation()
	 * @see #getVSSSTermsDefinitionsAbbreviations()
	 * @generated
	 */
	EAttribute getVSSSTermsDefinitionsAbbreviations_VSSSAbbreviation();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.micobs.svm.sss.VSSSGeneralDescription <em>VSSS General Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>VSSS General Description</em>'.
	 * @see es.uah.aut.srg.micobs.svm.sss.VSSSGeneralDescription
	 * @generated
	 */
	EClass getVSSSGeneralDescription();

	/**
	 * Returns the meta object for the attribute list '{@link es.uah.aut.srg.micobs.svm.sss.VSSSGeneralDescription#getVSSSProductPerspective <em>VSSS Product Perspective</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>VSSS Product Perspective</em>'.
	 * @see es.uah.aut.srg.micobs.svm.sss.VSSSGeneralDescription#getVSSSProductPerspective()
	 * @see #getVSSSGeneralDescription()
	 * @generated
	 */
	EAttribute getVSSSGeneralDescription_VSSSProductPerspective();

	/**
	 * Returns the meta object for the attribute list '{@link es.uah.aut.srg.micobs.svm.sss.VSSSGeneralDescription#getVSSSGeneralCapabilites <em>VSSS General Capabilites</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>VSSS General Capabilites</em>'.
	 * @see es.uah.aut.srg.micobs.svm.sss.VSSSGeneralDescription#getVSSSGeneralCapabilites()
	 * @see #getVSSSGeneralDescription()
	 * @generated
	 */
	EAttribute getVSSSGeneralDescription_VSSSGeneralCapabilites();

	/**
	 * Returns the meta object for the attribute list '{@link es.uah.aut.srg.micobs.svm.sss.VSSSGeneralDescription#getVSSSGeneralConstraints <em>VSSS General Constraints</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>VSSS General Constraints</em>'.
	 * @see es.uah.aut.srg.micobs.svm.sss.VSSSGeneralDescription#getVSSSGeneralConstraints()
	 * @see #getVSSSGeneralDescription()
	 * @generated
	 */
	EAttribute getVSSSGeneralDescription_VSSSGeneralConstraints();

	/**
	 * Returns the meta object for the attribute list '{@link es.uah.aut.srg.micobs.svm.sss.VSSSGeneralDescription#getVSSSOperationalEnvironment <em>VSSS Operational Environment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>VSSS Operational Environment</em>'.
	 * @see es.uah.aut.srg.micobs.svm.sss.VSSSGeneralDescription#getVSSSOperationalEnvironment()
	 * @see #getVSSSGeneralDescription()
	 * @generated
	 */
	EAttribute getVSSSGeneralDescription_VSSSOperationalEnvironment();

	/**
	 * Returns the meta object for the attribute list '{@link es.uah.aut.srg.micobs.svm.sss.VSSSGeneralDescription#getVSSSAssumptionsDependencies <em>VSSS Assumptions Dependencies</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>VSSS Assumptions Dependencies</em>'.
	 * @see es.uah.aut.srg.micobs.svm.sss.VSSSGeneralDescription#getVSSSAssumptionsDependencies()
	 * @see #getVSSSGeneralDescription()
	 * @generated
	 */
	EAttribute getVSSSGeneralDescription_VSSSAssumptionsDependencies();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.micobs.svm.sss.VSSSSpecificRequirements <em>VSSS Specific Requirements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>VSSS Specific Requirements</em>'.
	 * @see es.uah.aut.srg.micobs.svm.sss.VSSSSpecificRequirements
	 * @generated
	 */
	EClass getVSSSSpecificRequirements();

	/**
	 * Returns the meta object for the reference list '{@link es.uah.aut.srg.micobs.svm.sss.VSSSSpecificRequirements#getGeneral <em>General</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>General</em>'.
	 * @see es.uah.aut.srg.micobs.svm.sss.VSSSSpecificRequirements#getGeneral()
	 * @see #getVSSSSpecificRequirements()
	 * @generated
	 */
	EReference getVSSSSpecificRequirements_General();

	/**
	 * Returns the meta object for the reference list '{@link es.uah.aut.srg.micobs.svm.sss.VSSSSpecificRequirements#getCapabilities <em>Capabilities</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Capabilities</em>'.
	 * @see es.uah.aut.srg.micobs.svm.sss.VSSSSpecificRequirements#getCapabilities()
	 * @see #getVSSSSpecificRequirements()
	 * @generated
	 */
	EReference getVSSSSpecificRequirements_Capabilities();

	/**
	 * Returns the meta object for the reference list '{@link es.uah.aut.srg.micobs.svm.sss.VSSSSpecificRequirements#getSystemInterface <em>System Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>System Interface</em>'.
	 * @see es.uah.aut.srg.micobs.svm.sss.VSSSSpecificRequirements#getSystemInterface()
	 * @see #getVSSSSpecificRequirements()
	 * @generated
	 */
	EReference getVSSSSpecificRequirements_SystemInterface();

	/**
	 * Returns the meta object for the reference list '{@link es.uah.aut.srg.micobs.svm.sss.VSSSSpecificRequirements#getAdaptationMissionization <em>Adaptation Missionization</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Adaptation Missionization</em>'.
	 * @see es.uah.aut.srg.micobs.svm.sss.VSSSSpecificRequirements#getAdaptationMissionization()
	 * @see #getVSSSSpecificRequirements()
	 * @generated
	 */
	EReference getVSSSSpecificRequirements_AdaptationMissionization();

	/**
	 * Returns the meta object for the reference list '{@link es.uah.aut.srg.micobs.svm.sss.VSSSSpecificRequirements#getComputerResource <em>Computer Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Computer Resource</em>'.
	 * @see es.uah.aut.srg.micobs.svm.sss.VSSSSpecificRequirements#getComputerResource()
	 * @see #getVSSSSpecificRequirements()
	 * @generated
	 */
	EReference getVSSSSpecificRequirements_ComputerResource();

	/**
	 * Returns the meta object for the reference list '{@link es.uah.aut.srg.micobs.svm.sss.VSSSSpecificRequirements#getSecurity <em>Security</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Security</em>'.
	 * @see es.uah.aut.srg.micobs.svm.sss.VSSSSpecificRequirements#getSecurity()
	 * @see #getVSSSSpecificRequirements()
	 * @generated
	 */
	EReference getVSSSSpecificRequirements_Security();

	/**
	 * Returns the meta object for the reference list '{@link es.uah.aut.srg.micobs.svm.sss.VSSSSpecificRequirements#getSafety <em>Safety</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Safety</em>'.
	 * @see es.uah.aut.srg.micobs.svm.sss.VSSSSpecificRequirements#getSafety()
	 * @see #getVSSSSpecificRequirements()
	 * @generated
	 */
	EReference getVSSSSpecificRequirements_Safety();

	/**
	 * Returns the meta object for the reference list '{@link es.uah.aut.srg.micobs.svm.sss.VSSSSpecificRequirements#getReliabiltyAvailability <em>Reliabilty Availability</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Reliabilty Availability</em>'.
	 * @see es.uah.aut.srg.micobs.svm.sss.VSSSSpecificRequirements#getReliabiltyAvailability()
	 * @see #getVSSSSpecificRequirements()
	 * @generated
	 */
	EReference getVSSSSpecificRequirements_ReliabiltyAvailability();

	/**
	 * Returns the meta object for the reference list '{@link es.uah.aut.srg.micobs.svm.sss.VSSSSpecificRequirements#getQuality <em>Quality</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Quality</em>'.
	 * @see es.uah.aut.srg.micobs.svm.sss.VSSSSpecificRequirements#getQuality()
	 * @see #getVSSSSpecificRequirements()
	 * @generated
	 */
	EReference getVSSSSpecificRequirements_Quality();

	/**
	 * Returns the meta object for the reference list '{@link es.uah.aut.srg.micobs.svm.sss.VSSSSpecificRequirements#getDesign <em>Design</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Design</em>'.
	 * @see es.uah.aut.srg.micobs.svm.sss.VSSSSpecificRequirements#getDesign()
	 * @see #getVSSSSpecificRequirements()
	 * @generated
	 */
	EReference getVSSSSpecificRequirements_Design();

	/**
	 * Returns the meta object for the reference list '{@link es.uah.aut.srg.micobs.svm.sss.VSSSSpecificRequirements#getSoftwareOperations <em>Software Operations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Software Operations</em>'.
	 * @see es.uah.aut.srg.micobs.svm.sss.VSSSSpecificRequirements#getSoftwareOperations()
	 * @see #getVSSSSpecificRequirements()
	 * @generated
	 */
	EReference getVSSSSpecificRequirements_SoftwareOperations();

	/**
	 * Returns the meta object for the reference list '{@link es.uah.aut.srg.micobs.svm.sss.VSSSSpecificRequirements#getSoftwareMaintenance <em>Software Maintenance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Software Maintenance</em>'.
	 * @see es.uah.aut.srg.micobs.svm.sss.VSSSSpecificRequirements#getSoftwareMaintenance()
	 * @see #getVSSSSpecificRequirements()
	 * @generated
	 */
	EReference getVSSSSpecificRequirements_SoftwareMaintenance();

	/**
	 * Returns the meta object for the reference list '{@link es.uah.aut.srg.micobs.svm.sss.VSSSSpecificRequirements#getSystemSoftwareObservability <em>System Software Observability</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>System Software Observability</em>'.
	 * @see es.uah.aut.srg.micobs.svm.sss.VSSSSpecificRequirements#getSystemSoftwareObservability()
	 * @see #getVSSSSpecificRequirements()
	 * @generated
	 */
	EReference getVSSSSpecificRequirements_SystemSoftwareObservability();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.micobs.svm.sss.VSSSGeneralRequirement <em>VSSS General Requirement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>VSSS General Requirement</em>'.
	 * @see es.uah.aut.srg.micobs.svm.sss.VSSSGeneralRequirement
	 * @generated
	 */
	EClass getVSSSGeneralRequirement();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.micobs.svm.sss.VSSSCapabilitiesRequirement <em>VSSS Capabilities Requirement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>VSSS Capabilities Requirement</em>'.
	 * @see es.uah.aut.srg.micobs.svm.sss.VSSSCapabilitiesRequirement
	 * @generated
	 */
	EClass getVSSSCapabilitiesRequirement();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.micobs.svm.sss.VSSSSystemInterfaceRequirement <em>VSSS System Interface Requirement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>VSSS System Interface Requirement</em>'.
	 * @see es.uah.aut.srg.micobs.svm.sss.VSSSSystemInterfaceRequirement
	 * @generated
	 */
	EClass getVSSSSystemInterfaceRequirement();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.micobs.svm.sss.VSSSAdaptationMissionizationRequirement <em>VSSS Adaptation Missionization Requirement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>VSSS Adaptation Missionization Requirement</em>'.
	 * @see es.uah.aut.srg.micobs.svm.sss.VSSSAdaptationMissionizationRequirement
	 * @generated
	 */
	EClass getVSSSAdaptationMissionizationRequirement();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.micobs.svm.sss.VSSSComputerResourceRequirement <em>VSSS Computer Resource Requirement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>VSSS Computer Resource Requirement</em>'.
	 * @see es.uah.aut.srg.micobs.svm.sss.VSSSComputerResourceRequirement
	 * @generated
	 */
	EClass getVSSSComputerResourceRequirement();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.micobs.svm.sss.VSSSSecurityRequirement <em>VSSS Security Requirement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>VSSS Security Requirement</em>'.
	 * @see es.uah.aut.srg.micobs.svm.sss.VSSSSecurityRequirement
	 * @generated
	 */
	EClass getVSSSSecurityRequirement();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.micobs.svm.sss.VSSSSafetyRequirement <em>VSSS Safety Requirement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>VSSS Safety Requirement</em>'.
	 * @see es.uah.aut.srg.micobs.svm.sss.VSSSSafetyRequirement
	 * @generated
	 */
	EClass getVSSSSafetyRequirement();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.micobs.svm.sss.VSSSReliabiltyAvailabilityRequirement <em>VSSS Reliabilty Availability Requirement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>VSSS Reliabilty Availability Requirement</em>'.
	 * @see es.uah.aut.srg.micobs.svm.sss.VSSSReliabiltyAvailabilityRequirement
	 * @generated
	 */
	EClass getVSSSReliabiltyAvailabilityRequirement();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.micobs.svm.sss.VSSSQualityRequirement <em>VSSS Quality Requirement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>VSSS Quality Requirement</em>'.
	 * @see es.uah.aut.srg.micobs.svm.sss.VSSSQualityRequirement
	 * @generated
	 */
	EClass getVSSSQualityRequirement();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.micobs.svm.sss.VSSSDesignRequirement <em>VSSS Design Requirement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>VSSS Design Requirement</em>'.
	 * @see es.uah.aut.srg.micobs.svm.sss.VSSSDesignRequirement
	 * @generated
	 */
	EClass getVSSSDesignRequirement();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.micobs.svm.sss.VSSSSoftwareOperationsRequirement <em>VSSS Software Operations Requirement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>VSSS Software Operations Requirement</em>'.
	 * @see es.uah.aut.srg.micobs.svm.sss.VSSSSoftwareOperationsRequirement
	 * @generated
	 */
	EClass getVSSSSoftwareOperationsRequirement();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.micobs.svm.sss.VSSSSoftwareMaintenanceRequirement <em>VSSS Software Maintenance Requirement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>VSSS Software Maintenance Requirement</em>'.
	 * @see es.uah.aut.srg.micobs.svm.sss.VSSSSoftwareMaintenanceRequirement
	 * @generated
	 */
	EClass getVSSSSoftwareMaintenanceRequirement();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.micobs.svm.sss.VSSSSystemSoftwareObservabilityRequirement <em>VSSS System Software Observability Requirement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>VSSS System Software Observability Requirement</em>'.
	 * @see es.uah.aut.srg.micobs.svm.sss.VSSSSystemSoftwareObservabilityRequirement
	 * @generated
	 */
	EClass getVSSSSystemSoftwareObservabilityRequirement();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.micobs.svm.sss.VSSSVerificationValidationIntegration <em>VSSS Verification Validation Integration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>VSSS Verification Validation Integration</em>'.
	 * @see es.uah.aut.srg.micobs.svm.sss.VSSSVerificationValidationIntegration
	 * @generated
	 */
	EClass getVSSSVerificationValidationIntegration();

	/**
	 * Returns the meta object for the reference list '{@link es.uah.aut.srg.micobs.svm.sss.VSSSVerificationValidationIntegration#getVerificationValidationProcess <em>Verification Validation Process</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Verification Validation Process</em>'.
	 * @see es.uah.aut.srg.micobs.svm.sss.VSSSVerificationValidationIntegration#getVerificationValidationProcess()
	 * @see #getVSSSVerificationValidationIntegration()
	 * @generated
	 */
	EReference getVSSSVerificationValidationIntegration_VerificationValidationProcess();

	/**
	 * Returns the meta object for the reference list '{@link es.uah.aut.srg.micobs.svm.sss.VSSSVerificationValidationIntegration#getValidationApproach <em>Validation Approach</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Validation Approach</em>'.
	 * @see es.uah.aut.srg.micobs.svm.sss.VSSSVerificationValidationIntegration#getValidationApproach()
	 * @see #getVSSSVerificationValidationIntegration()
	 * @generated
	 */
	EReference getVSSSVerificationValidationIntegration_ValidationApproach();

	/**
	 * Returns the meta object for the reference list '{@link es.uah.aut.srg.micobs.svm.sss.VSSSVerificationValidationIntegration#getValidation <em>Validation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Validation</em>'.
	 * @see es.uah.aut.srg.micobs.svm.sss.VSSSVerificationValidationIntegration#getValidation()
	 * @see #getVSSSVerificationValidationIntegration()
	 * @generated
	 */
	EReference getVSSSVerificationValidationIntegration_Validation();

	/**
	 * Returns the meta object for the reference list '{@link es.uah.aut.srg.micobs.svm.sss.VSSSVerificationValidationIntegration#getVerification <em>Verification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Verification</em>'.
	 * @see es.uah.aut.srg.micobs.svm.sss.VSSSVerificationValidationIntegration#getVerification()
	 * @see #getVSSSVerificationValidationIntegration()
	 * @generated
	 */
	EReference getVSSSVerificationValidationIntegration_Verification();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.micobs.svm.sss.VSSSVerificationValidationProcessRequirement <em>VSSS Verification Validation Process Requirement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>VSSS Verification Validation Process Requirement</em>'.
	 * @see es.uah.aut.srg.micobs.svm.sss.VSSSVerificationValidationProcessRequirement
	 * @generated
	 */
	EClass getVSSSVerificationValidationProcessRequirement();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.micobs.svm.sss.VSSSValidationApproach <em>VSSS Validation Approach</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>VSSS Validation Approach</em>'.
	 * @see es.uah.aut.srg.micobs.svm.sss.VSSSValidationApproach
	 * @generated
	 */
	EClass getVSSSValidationApproach();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.micobs.svm.sss.VSSSVerificationRequirement <em>VSSS Verification Requirement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>VSSS Verification Requirement</em>'.
	 * @see es.uah.aut.srg.micobs.svm.sss.VSSSVerificationRequirement
	 * @generated
	 */
	EClass getVSSSVerificationRequirement();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.micobs.svm.sss.VSSSValidationRequirement <em>VSSS Validation Requirement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>VSSS Validation Requirement</em>'.
	 * @see es.uah.aut.srg.micobs.svm.sss.VSSSValidationRequirement
	 * @generated
	 */
	EClass getVSSSValidationRequirement();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.micobs.svm.sss.VSSSSystemModels <em>VSSS System Models</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>VSSS System Models</em>'.
	 * @see es.uah.aut.srg.micobs.svm.sss.VSSSSystemModels
	 * @generated
	 */
	EClass getVSSSSystemModels();

	/**
	 * Returns the meta object for the attribute list '{@link es.uah.aut.srg.micobs.svm.sss.VSSSSystemModels#getSystemModel <em>System Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>System Model</em>'.
	 * @see es.uah.aut.srg.micobs.svm.sss.VSSSSystemModels#getSystemModel()
	 * @see #getVSSSSystemModels()
	 * @generated
	 */
	EAttribute getVSSSSystemModels_SystemModel();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	sssFactory getsssFactory();

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
		 * The meta object literal for the '{@link es.uah.aut.srg.micobs.svm.sss.impl.VSSSIntroductionImpl <em>VSSS Introduction</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uah.aut.srg.micobs.svm.sss.impl.VSSSIntroductionImpl
		 * @see es.uah.aut.srg.micobs.svm.sss.impl.sssPackageImpl#getVSSSIntroduction()
		 * @generated
		 */
		EClass VSSS_INTRODUCTION = eINSTANCE.getVSSSIntroduction();

		/**
		 * The meta object literal for the '<em><b>VSSS Purpose</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VSSS_INTRODUCTION__VSSS_PURPOSE = eINSTANCE.getVSSSIntroduction_VSSSPurpose();

		/**
		 * The meta object literal for the '<em><b>VSSS Objetive</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VSSS_INTRODUCTION__VSSS_OBJETIVE = eINSTANCE.getVSSSIntroduction_VSSSObjetive();

		/**
		 * The meta object literal for the '<em><b>VSSS Content</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VSSS_INTRODUCTION__VSSS_CONTENT = eINSTANCE.getVSSSIntroduction_VSSSContent();

		/**
		 * The meta object literal for the '<em><b>VSSS Reason</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VSSS_INTRODUCTION__VSSS_REASON = eINSTANCE.getVSSSIntroduction_VSSSReason();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.micobs.svm.sss.impl.VSSSApplicableDocumentsImpl <em>VSSS Applicable Documents</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uah.aut.srg.micobs.svm.sss.impl.VSSSApplicableDocumentsImpl
		 * @see es.uah.aut.srg.micobs.svm.sss.impl.sssPackageImpl#getVSSSApplicableDocuments()
		 * @generated
		 */
		EClass VSSS_APPLICABLE_DOCUMENTS = eINSTANCE.getVSSSApplicableDocuments();

		/**
		 * The meta object literal for the '<em><b>VSSS Applicable Document</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VSSS_APPLICABLE_DOCUMENTS__VSSS_APPLICABLE_DOCUMENT = eINSTANCE.getVSSSApplicableDocuments_VSSSApplicableDocument();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.micobs.svm.sss.impl.VSSSReferenceDocumentsImpl <em>VSSS Reference Documents</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uah.aut.srg.micobs.svm.sss.impl.VSSSReferenceDocumentsImpl
		 * @see es.uah.aut.srg.micobs.svm.sss.impl.sssPackageImpl#getVSSSReferenceDocuments()
		 * @generated
		 */
		EClass VSSS_REFERENCE_DOCUMENTS = eINSTANCE.getVSSSReferenceDocuments();

		/**
		 * The meta object literal for the '<em><b>VSSS Reference Document</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VSSS_REFERENCE_DOCUMENTS__VSSS_REFERENCE_DOCUMENT = eINSTANCE.getVSSSReferenceDocuments_VSSSReferenceDocument();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.micobs.svm.sss.impl.VSSSTermsDefinitionsAbbreviationsImpl <em>VSSS Terms Definitions Abbreviations</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uah.aut.srg.micobs.svm.sss.impl.VSSSTermsDefinitionsAbbreviationsImpl
		 * @see es.uah.aut.srg.micobs.svm.sss.impl.sssPackageImpl#getVSSSTermsDefinitionsAbbreviations()
		 * @generated
		 */
		EClass VSSS_TERMS_DEFINITIONS_ABBREVIATIONS = eINSTANCE.getVSSSTermsDefinitionsAbbreviations();

		/**
		 * The meta object literal for the '<em><b>VSSS Term</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VSSS_TERMS_DEFINITIONS_ABBREVIATIONS__VSSS_TERM = eINSTANCE.getVSSSTermsDefinitionsAbbreviations_VSSSTerm();

		/**
		 * The meta object literal for the '<em><b>VSSS Definition</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VSSS_TERMS_DEFINITIONS_ABBREVIATIONS__VSSS_DEFINITION = eINSTANCE.getVSSSTermsDefinitionsAbbreviations_VSSSDefinition();

		/**
		 * The meta object literal for the '<em><b>VSSS Abbreviation</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VSSS_TERMS_DEFINITIONS_ABBREVIATIONS__VSSS_ABBREVIATION = eINSTANCE.getVSSSTermsDefinitionsAbbreviations_VSSSAbbreviation();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.micobs.svm.sss.impl.VSSSGeneralDescriptionImpl <em>VSSS General Description</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uah.aut.srg.micobs.svm.sss.impl.VSSSGeneralDescriptionImpl
		 * @see es.uah.aut.srg.micobs.svm.sss.impl.sssPackageImpl#getVSSSGeneralDescription()
		 * @generated
		 */
		EClass VSSS_GENERAL_DESCRIPTION = eINSTANCE.getVSSSGeneralDescription();

		/**
		 * The meta object literal for the '<em><b>VSSS Product Perspective</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VSSS_GENERAL_DESCRIPTION__VSSS_PRODUCT_PERSPECTIVE = eINSTANCE.getVSSSGeneralDescription_VSSSProductPerspective();

		/**
		 * The meta object literal for the '<em><b>VSSS General Capabilites</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VSSS_GENERAL_DESCRIPTION__VSSS_GENERAL_CAPABILITES = eINSTANCE.getVSSSGeneralDescription_VSSSGeneralCapabilites();

		/**
		 * The meta object literal for the '<em><b>VSSS General Constraints</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VSSS_GENERAL_DESCRIPTION__VSSS_GENERAL_CONSTRAINTS = eINSTANCE.getVSSSGeneralDescription_VSSSGeneralConstraints();

		/**
		 * The meta object literal for the '<em><b>VSSS Operational Environment</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VSSS_GENERAL_DESCRIPTION__VSSS_OPERATIONAL_ENVIRONMENT = eINSTANCE.getVSSSGeneralDescription_VSSSOperationalEnvironment();

		/**
		 * The meta object literal for the '<em><b>VSSS Assumptions Dependencies</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VSSS_GENERAL_DESCRIPTION__VSSS_ASSUMPTIONS_DEPENDENCIES = eINSTANCE.getVSSSGeneralDescription_VSSSAssumptionsDependencies();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.micobs.svm.sss.impl.VSSSSpecificRequirementsImpl <em>VSSS Specific Requirements</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uah.aut.srg.micobs.svm.sss.impl.VSSSSpecificRequirementsImpl
		 * @see es.uah.aut.srg.micobs.svm.sss.impl.sssPackageImpl#getVSSSSpecificRequirements()
		 * @generated
		 */
		EClass VSSS_SPECIFIC_REQUIREMENTS = eINSTANCE.getVSSSSpecificRequirements();

		/**
		 * The meta object literal for the '<em><b>General</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VSSS_SPECIFIC_REQUIREMENTS__GENERAL = eINSTANCE.getVSSSSpecificRequirements_General();

		/**
		 * The meta object literal for the '<em><b>Capabilities</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VSSS_SPECIFIC_REQUIREMENTS__CAPABILITIES = eINSTANCE.getVSSSSpecificRequirements_Capabilities();

		/**
		 * The meta object literal for the '<em><b>System Interface</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VSSS_SPECIFIC_REQUIREMENTS__SYSTEM_INTERFACE = eINSTANCE.getVSSSSpecificRequirements_SystemInterface();

		/**
		 * The meta object literal for the '<em><b>Adaptation Missionization</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VSSS_SPECIFIC_REQUIREMENTS__ADAPTATION_MISSIONIZATION = eINSTANCE.getVSSSSpecificRequirements_AdaptationMissionization();

		/**
		 * The meta object literal for the '<em><b>Computer Resource</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VSSS_SPECIFIC_REQUIREMENTS__COMPUTER_RESOURCE = eINSTANCE.getVSSSSpecificRequirements_ComputerResource();

		/**
		 * The meta object literal for the '<em><b>Security</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VSSS_SPECIFIC_REQUIREMENTS__SECURITY = eINSTANCE.getVSSSSpecificRequirements_Security();

		/**
		 * The meta object literal for the '<em><b>Safety</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VSSS_SPECIFIC_REQUIREMENTS__SAFETY = eINSTANCE.getVSSSSpecificRequirements_Safety();

		/**
		 * The meta object literal for the '<em><b>Reliabilty Availability</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VSSS_SPECIFIC_REQUIREMENTS__RELIABILTY_AVAILABILITY = eINSTANCE.getVSSSSpecificRequirements_ReliabiltyAvailability();

		/**
		 * The meta object literal for the '<em><b>Quality</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VSSS_SPECIFIC_REQUIREMENTS__QUALITY = eINSTANCE.getVSSSSpecificRequirements_Quality();

		/**
		 * The meta object literal for the '<em><b>Design</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VSSS_SPECIFIC_REQUIREMENTS__DESIGN = eINSTANCE.getVSSSSpecificRequirements_Design();

		/**
		 * The meta object literal for the '<em><b>Software Operations</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VSSS_SPECIFIC_REQUIREMENTS__SOFTWARE_OPERATIONS = eINSTANCE.getVSSSSpecificRequirements_SoftwareOperations();

		/**
		 * The meta object literal for the '<em><b>Software Maintenance</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VSSS_SPECIFIC_REQUIREMENTS__SOFTWARE_MAINTENANCE = eINSTANCE.getVSSSSpecificRequirements_SoftwareMaintenance();

		/**
		 * The meta object literal for the '<em><b>System Software Observability</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VSSS_SPECIFIC_REQUIREMENTS__SYSTEM_SOFTWARE_OBSERVABILITY = eINSTANCE.getVSSSSpecificRequirements_SystemSoftwareObservability();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.micobs.svm.sss.impl.VSSSGeneralRequirementImpl <em>VSSS General Requirement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uah.aut.srg.micobs.svm.sss.impl.VSSSGeneralRequirementImpl
		 * @see es.uah.aut.srg.micobs.svm.sss.impl.sssPackageImpl#getVSSSGeneralRequirement()
		 * @generated
		 */
		EClass VSSS_GENERAL_REQUIREMENT = eINSTANCE.getVSSSGeneralRequirement();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.micobs.svm.sss.impl.VSSSCapabilitiesRequirementImpl <em>VSSS Capabilities Requirement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uah.aut.srg.micobs.svm.sss.impl.VSSSCapabilitiesRequirementImpl
		 * @see es.uah.aut.srg.micobs.svm.sss.impl.sssPackageImpl#getVSSSCapabilitiesRequirement()
		 * @generated
		 */
		EClass VSSS_CAPABILITIES_REQUIREMENT = eINSTANCE.getVSSSCapabilitiesRequirement();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.micobs.svm.sss.impl.VSSSSystemInterfaceRequirementImpl <em>VSSS System Interface Requirement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uah.aut.srg.micobs.svm.sss.impl.VSSSSystemInterfaceRequirementImpl
		 * @see es.uah.aut.srg.micobs.svm.sss.impl.sssPackageImpl#getVSSSSystemInterfaceRequirement()
		 * @generated
		 */
		EClass VSSS_SYSTEM_INTERFACE_REQUIREMENT = eINSTANCE.getVSSSSystemInterfaceRequirement();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.micobs.svm.sss.impl.VSSSAdaptationMissionizationRequirementImpl <em>VSSS Adaptation Missionization Requirement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uah.aut.srg.micobs.svm.sss.impl.VSSSAdaptationMissionizationRequirementImpl
		 * @see es.uah.aut.srg.micobs.svm.sss.impl.sssPackageImpl#getVSSSAdaptationMissionizationRequirement()
		 * @generated
		 */
		EClass VSSS_ADAPTATION_MISSIONIZATION_REQUIREMENT = eINSTANCE.getVSSSAdaptationMissionizationRequirement();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.micobs.svm.sss.impl.VSSSComputerResourceRequirementImpl <em>VSSS Computer Resource Requirement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uah.aut.srg.micobs.svm.sss.impl.VSSSComputerResourceRequirementImpl
		 * @see es.uah.aut.srg.micobs.svm.sss.impl.sssPackageImpl#getVSSSComputerResourceRequirement()
		 * @generated
		 */
		EClass VSSS_COMPUTER_RESOURCE_REQUIREMENT = eINSTANCE.getVSSSComputerResourceRequirement();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.micobs.svm.sss.impl.VSSSSecurityRequirementImpl <em>VSSS Security Requirement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uah.aut.srg.micobs.svm.sss.impl.VSSSSecurityRequirementImpl
		 * @see es.uah.aut.srg.micobs.svm.sss.impl.sssPackageImpl#getVSSSSecurityRequirement()
		 * @generated
		 */
		EClass VSSS_SECURITY_REQUIREMENT = eINSTANCE.getVSSSSecurityRequirement();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.micobs.svm.sss.impl.VSSSSafetyRequirementImpl <em>VSSS Safety Requirement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uah.aut.srg.micobs.svm.sss.impl.VSSSSafetyRequirementImpl
		 * @see es.uah.aut.srg.micobs.svm.sss.impl.sssPackageImpl#getVSSSSafetyRequirement()
		 * @generated
		 */
		EClass VSSS_SAFETY_REQUIREMENT = eINSTANCE.getVSSSSafetyRequirement();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.micobs.svm.sss.impl.VSSSReliabiltyAvailabilityRequirementImpl <em>VSSS Reliabilty Availability Requirement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uah.aut.srg.micobs.svm.sss.impl.VSSSReliabiltyAvailabilityRequirementImpl
		 * @see es.uah.aut.srg.micobs.svm.sss.impl.sssPackageImpl#getVSSSReliabiltyAvailabilityRequirement()
		 * @generated
		 */
		EClass VSSS_RELIABILTY_AVAILABILITY_REQUIREMENT = eINSTANCE.getVSSSReliabiltyAvailabilityRequirement();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.micobs.svm.sss.impl.VSSSQualityRequirementImpl <em>VSSS Quality Requirement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uah.aut.srg.micobs.svm.sss.impl.VSSSQualityRequirementImpl
		 * @see es.uah.aut.srg.micobs.svm.sss.impl.sssPackageImpl#getVSSSQualityRequirement()
		 * @generated
		 */
		EClass VSSS_QUALITY_REQUIREMENT = eINSTANCE.getVSSSQualityRequirement();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.micobs.svm.sss.impl.VSSSDesignRequirementImpl <em>VSSS Design Requirement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uah.aut.srg.micobs.svm.sss.impl.VSSSDesignRequirementImpl
		 * @see es.uah.aut.srg.micobs.svm.sss.impl.sssPackageImpl#getVSSSDesignRequirement()
		 * @generated
		 */
		EClass VSSS_DESIGN_REQUIREMENT = eINSTANCE.getVSSSDesignRequirement();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.micobs.svm.sss.impl.VSSSSoftwareOperationsRequirementImpl <em>VSSS Software Operations Requirement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uah.aut.srg.micobs.svm.sss.impl.VSSSSoftwareOperationsRequirementImpl
		 * @see es.uah.aut.srg.micobs.svm.sss.impl.sssPackageImpl#getVSSSSoftwareOperationsRequirement()
		 * @generated
		 */
		EClass VSSS_SOFTWARE_OPERATIONS_REQUIREMENT = eINSTANCE.getVSSSSoftwareOperationsRequirement();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.micobs.svm.sss.impl.VSSSSoftwareMaintenanceRequirementImpl <em>VSSS Software Maintenance Requirement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uah.aut.srg.micobs.svm.sss.impl.VSSSSoftwareMaintenanceRequirementImpl
		 * @see es.uah.aut.srg.micobs.svm.sss.impl.sssPackageImpl#getVSSSSoftwareMaintenanceRequirement()
		 * @generated
		 */
		EClass VSSS_SOFTWARE_MAINTENANCE_REQUIREMENT = eINSTANCE.getVSSSSoftwareMaintenanceRequirement();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.micobs.svm.sss.impl.VSSSSystemSoftwareObservabilityRequirementImpl <em>VSSS System Software Observability Requirement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uah.aut.srg.micobs.svm.sss.impl.VSSSSystemSoftwareObservabilityRequirementImpl
		 * @see es.uah.aut.srg.micobs.svm.sss.impl.sssPackageImpl#getVSSSSystemSoftwareObservabilityRequirement()
		 * @generated
		 */
		EClass VSSS_SYSTEM_SOFTWARE_OBSERVABILITY_REQUIREMENT = eINSTANCE.getVSSSSystemSoftwareObservabilityRequirement();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.micobs.svm.sss.impl.VSSSVerificationValidationIntegrationImpl <em>VSSS Verification Validation Integration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uah.aut.srg.micobs.svm.sss.impl.VSSSVerificationValidationIntegrationImpl
		 * @see es.uah.aut.srg.micobs.svm.sss.impl.sssPackageImpl#getVSSSVerificationValidationIntegration()
		 * @generated
		 */
		EClass VSSS_VERIFICATION_VALIDATION_INTEGRATION = eINSTANCE.getVSSSVerificationValidationIntegration();

		/**
		 * The meta object literal for the '<em><b>Verification Validation Process</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VSSS_VERIFICATION_VALIDATION_INTEGRATION__VERIFICATION_VALIDATION_PROCESS = eINSTANCE.getVSSSVerificationValidationIntegration_VerificationValidationProcess();

		/**
		 * The meta object literal for the '<em><b>Validation Approach</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VSSS_VERIFICATION_VALIDATION_INTEGRATION__VALIDATION_APPROACH = eINSTANCE.getVSSSVerificationValidationIntegration_ValidationApproach();

		/**
		 * The meta object literal for the '<em><b>Validation</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VSSS_VERIFICATION_VALIDATION_INTEGRATION__VALIDATION = eINSTANCE.getVSSSVerificationValidationIntegration_Validation();

		/**
		 * The meta object literal for the '<em><b>Verification</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VSSS_VERIFICATION_VALIDATION_INTEGRATION__VERIFICATION = eINSTANCE.getVSSSVerificationValidationIntegration_Verification();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.micobs.svm.sss.impl.VSSSVerificationValidationProcessRequirementImpl <em>VSSS Verification Validation Process Requirement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uah.aut.srg.micobs.svm.sss.impl.VSSSVerificationValidationProcessRequirementImpl
		 * @see es.uah.aut.srg.micobs.svm.sss.impl.sssPackageImpl#getVSSSVerificationValidationProcessRequirement()
		 * @generated
		 */
		EClass VSSS_VERIFICATION_VALIDATION_PROCESS_REQUIREMENT = eINSTANCE.getVSSSVerificationValidationProcessRequirement();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.micobs.svm.sss.impl.VSSSValidationApproachImpl <em>VSSS Validation Approach</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uah.aut.srg.micobs.svm.sss.impl.VSSSValidationApproachImpl
		 * @see es.uah.aut.srg.micobs.svm.sss.impl.sssPackageImpl#getVSSSValidationApproach()
		 * @generated
		 */
		EClass VSSS_VALIDATION_APPROACH = eINSTANCE.getVSSSValidationApproach();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.micobs.svm.sss.impl.VSSSVerificationRequirementImpl <em>VSSS Verification Requirement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uah.aut.srg.micobs.svm.sss.impl.VSSSVerificationRequirementImpl
		 * @see es.uah.aut.srg.micobs.svm.sss.impl.sssPackageImpl#getVSSSVerificationRequirement()
		 * @generated
		 */
		EClass VSSS_VERIFICATION_REQUIREMENT = eINSTANCE.getVSSSVerificationRequirement();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.micobs.svm.sss.impl.VSSSValidationRequirementImpl <em>VSSS Validation Requirement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uah.aut.srg.micobs.svm.sss.impl.VSSSValidationRequirementImpl
		 * @see es.uah.aut.srg.micobs.svm.sss.impl.sssPackageImpl#getVSSSValidationRequirement()
		 * @generated
		 */
		EClass VSSS_VALIDATION_REQUIREMENT = eINSTANCE.getVSSSValidationRequirement();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.micobs.svm.sss.impl.VSSSSystemModelsImpl <em>VSSS System Models</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uah.aut.srg.micobs.svm.sss.impl.VSSSSystemModelsImpl
		 * @see es.uah.aut.srg.micobs.svm.sss.impl.sssPackageImpl#getVSSSSystemModels()
		 * @generated
		 */
		EClass VSSS_SYSTEM_MODELS = eINSTANCE.getVSSSSystemModels();

		/**
		 * The meta object literal for the '<em><b>System Model</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VSSS_SYSTEM_MODELS__SYSTEM_MODEL = eINSTANCE.getVSSSSystemModels_SystemModel();

	}

} //sssPackage
