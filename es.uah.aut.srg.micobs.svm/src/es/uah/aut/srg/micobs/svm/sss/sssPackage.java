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

import es.uah.aut.srg.micobs.doctpl.doc.docPackage;

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
	 * The meta object id for the '{@link es.uah.aut.srg.micobs.svm.sss.impl.VSSSDocumentImpl <em>VSSS Document</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uah.aut.srg.micobs.svm.sss.impl.VSSSDocumentImpl
	 * @see es.uah.aut.srg.micobs.svm.sss.impl.sssPackageImpl#getVSSSDocument()
	 * @generated
	 */
	int VSSS_DOCUMENT = 0;

	/**
	 * The feature id for the '<em><b>Applicable Documents</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSSS_DOCUMENT__APPLICABLE_DOCUMENTS = docPackage.DDOCUMENT_TEMPLATE__APPLICABLE_DOCUMENTS;

	/**
	 * The feature id for the '<em><b>Reference Documents</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSSS_DOCUMENT__REFERENCE_DOCUMENTS = docPackage.DDOCUMENT_TEMPLATE__REFERENCE_DOCUMENTS;

	/**
	 * The feature id for the '<em><b>Figures</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSSS_DOCUMENT__FIGURES = docPackage.DDOCUMENT_TEMPLATE__FIGURES;

	/**
	 * The feature id for the '<em><b>Tables</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSSS_DOCUMENT__TABLES = docPackage.DDOCUMENT_TEMPLATE__TABLES;

	/**
	 * The feature id for the '<em><b>Sections</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSSS_DOCUMENT__SECTIONS = docPackage.DDOCUMENT_TEMPLATE__SECTIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSSS_DOCUMENT__NAME = docPackage.DDOCUMENT_TEMPLATE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSSS_DOCUMENT__ID = docPackage.DDOCUMENT_TEMPLATE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Issue</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSSS_DOCUMENT__ISSUE = docPackage.DDOCUMENT_TEMPLATE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Revision</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSSS_DOCUMENT__REVISION = docPackage.DDOCUMENT_TEMPLATE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSSS_DOCUMENT__DATE = docPackage.DDOCUMENT_TEMPLATE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Parents</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSSS_DOCUMENT__PARENTS = docPackage.DDOCUMENT_TEMPLATE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Groups</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSSS_DOCUMENT__GROUPS = docPackage.DDOCUMENT_TEMPLATE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Introduction</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSSS_DOCUMENT__INTRODUCTION = docPackage.DDOCUMENT_TEMPLATE_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Applicable Documents Section</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSSS_DOCUMENT__APPLICABLE_DOCUMENTS_SECTION = docPackage.DDOCUMENT_TEMPLATE_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Reference Documents Section</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSSS_DOCUMENT__REFERENCE_DOCUMENTS_SECTION = docPackage.DDOCUMENT_TEMPLATE_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Terms Definitions Abbreviations</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSSS_DOCUMENT__TERMS_DEFINITIONS_ABBREVIATIONS = docPackage.DDOCUMENT_TEMPLATE_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>General Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSSS_DOCUMENT__GENERAL_DESCRIPTION = docPackage.DDOCUMENT_TEMPLATE_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Specific Requirements</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSSS_DOCUMENT__SPECIFIC_REQUIREMENTS = docPackage.DDOCUMENT_TEMPLATE_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Verification Validation Integration</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSSS_DOCUMENT__VERIFICATION_VALIDATION_INTEGRATION = docPackage.DDOCUMENT_TEMPLATE_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>System Models</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSSS_DOCUMENT__SYSTEM_MODELS = docPackage.DDOCUMENT_TEMPLATE_FEATURE_COUNT + 14;

	/**
	 * The number of structural features of the '<em>VSSS Document</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSSS_DOCUMENT_FEATURE_COUNT = docPackage.DDOCUMENT_TEMPLATE_FEATURE_COUNT + 15;

	/**
	 * The number of operations of the '<em>VSSS Document</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSSS_DOCUMENT_OPERATION_COUNT = docPackage.DDOCUMENT_TEMPLATE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.micobs.svm.sss.impl.VSSSIntroductionImpl <em>VSSS Introduction</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uah.aut.srg.micobs.svm.sss.impl.VSSSIntroductionImpl
	 * @see es.uah.aut.srg.micobs.svm.sss.impl.sssPackageImpl#getVSSSIntroduction()
	 * @generated
	 */
	int VSSS_INTRODUCTION = 1;

	/**
	 * The feature id for the '<em><b>Subsections</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSSS_INTRODUCTION__SUBSECTIONS = docPackage.DFIXED_SECTION__SUBSECTIONS;

	/**
	 * The feature id for the '<em><b>Document</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSSS_INTRODUCTION__DOCUMENT = docPackage.DFIXED_SECTION__DOCUMENT;

	/**
	 * The feature id for the '<em><b>Purpose</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSSS_INTRODUCTION__PURPOSE = docPackage.DFIXED_SECTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Objetive</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSSS_INTRODUCTION__OBJETIVE = docPackage.DFIXED_SECTION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Content</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSSS_INTRODUCTION__CONTENT = docPackage.DFIXED_SECTION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Reason</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSSS_INTRODUCTION__REASON = docPackage.DFIXED_SECTION_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>VSSS Introduction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSSS_INTRODUCTION_FEATURE_COUNT = docPackage.DFIXED_SECTION_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>VSSS Introduction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSSS_INTRODUCTION_OPERATION_COUNT = docPackage.DFIXED_SECTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.micobs.svm.sss.impl.VSSSApplicableDocumentsImpl <em>VSSS Applicable Documents</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uah.aut.srg.micobs.svm.sss.impl.VSSSApplicableDocumentsImpl
	 * @see es.uah.aut.srg.micobs.svm.sss.impl.sssPackageImpl#getVSSSApplicableDocuments()
	 * @generated
	 */
	int VSSS_APPLICABLE_DOCUMENTS = 2;

	/**
	 * The feature id for the '<em><b>Subsections</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSSS_APPLICABLE_DOCUMENTS__SUBSECTIONS = docPackage.DFIXED_SECTION__SUBSECTIONS;

	/**
	 * The feature id for the '<em><b>Document</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSSS_APPLICABLE_DOCUMENTS__DOCUMENT = docPackage.DFIXED_SECTION__DOCUMENT;

	/**
	 * The feature id for the '<em><b>Applicable Documents</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSSS_APPLICABLE_DOCUMENTS__APPLICABLE_DOCUMENTS = docPackage.DFIXED_SECTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>VSSS Applicable Documents</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSSS_APPLICABLE_DOCUMENTS_FEATURE_COUNT = docPackage.DFIXED_SECTION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>VSSS Applicable Documents</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSSS_APPLICABLE_DOCUMENTS_OPERATION_COUNT = docPackage.DFIXED_SECTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.micobs.svm.sss.impl.VSSSReferenceDocumentsImpl <em>VSSS Reference Documents</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uah.aut.srg.micobs.svm.sss.impl.VSSSReferenceDocumentsImpl
	 * @see es.uah.aut.srg.micobs.svm.sss.impl.sssPackageImpl#getVSSSReferenceDocuments()
	 * @generated
	 */
	int VSSS_REFERENCE_DOCUMENTS = 3;

	/**
	 * The feature id for the '<em><b>Subsections</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSSS_REFERENCE_DOCUMENTS__SUBSECTIONS = docPackage.DFIXED_SECTION__SUBSECTIONS;

	/**
	 * The feature id for the '<em><b>Document</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSSS_REFERENCE_DOCUMENTS__DOCUMENT = docPackage.DFIXED_SECTION__DOCUMENT;

	/**
	 * The feature id for the '<em><b>Reference Documents</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSSS_REFERENCE_DOCUMENTS__REFERENCE_DOCUMENTS = docPackage.DFIXED_SECTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>VSSS Reference Documents</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSSS_REFERENCE_DOCUMENTS_FEATURE_COUNT = docPackage.DFIXED_SECTION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>VSSS Reference Documents</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSSS_REFERENCE_DOCUMENTS_OPERATION_COUNT = docPackage.DFIXED_SECTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.micobs.svm.sss.impl.VSSSTermsDefinitionsAbbreviationsImpl <em>VSSS Terms Definitions Abbreviations</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uah.aut.srg.micobs.svm.sss.impl.VSSSTermsDefinitionsAbbreviationsImpl
	 * @see es.uah.aut.srg.micobs.svm.sss.impl.sssPackageImpl#getVSSSTermsDefinitionsAbbreviations()
	 * @generated
	 */
	int VSSS_TERMS_DEFINITIONS_ABBREVIATIONS = 4;

	/**
	 * The feature id for the '<em><b>Subsections</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSSS_TERMS_DEFINITIONS_ABBREVIATIONS__SUBSECTIONS = docPackage.DFIXED_SECTION__SUBSECTIONS;

	/**
	 * The feature id for the '<em><b>Document</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSSS_TERMS_DEFINITIONS_ABBREVIATIONS__DOCUMENT = docPackage.DFIXED_SECTION__DOCUMENT;

	/**
	 * The feature id for the '<em><b>Terms</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSSS_TERMS_DEFINITIONS_ABBREVIATIONS__TERMS = docPackage.DFIXED_SECTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Definitions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSSS_TERMS_DEFINITIONS_ABBREVIATIONS__DEFINITIONS = docPackage.DFIXED_SECTION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Abbreviations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSSS_TERMS_DEFINITIONS_ABBREVIATIONS__ABBREVIATIONS = docPackage.DFIXED_SECTION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>VSSS Terms Definitions Abbreviations</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSSS_TERMS_DEFINITIONS_ABBREVIATIONS_FEATURE_COUNT = docPackage.DFIXED_SECTION_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>VSSS Terms Definitions Abbreviations</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSSS_TERMS_DEFINITIONS_ABBREVIATIONS_OPERATION_COUNT = docPackage.DFIXED_SECTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.micobs.svm.sss.impl.VSSSBriefDescriptionImpl <em>VSSS Brief Description</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uah.aut.srg.micobs.svm.sss.impl.VSSSBriefDescriptionImpl
	 * @see es.uah.aut.srg.micobs.svm.sss.impl.sssPackageImpl#getVSSSBriefDescription()
	 * @generated
	 */
	int VSSS_BRIEF_DESCRIPTION = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSSS_BRIEF_DESCRIPTION__NAME = 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSSS_BRIEF_DESCRIPTION__DESCRIPTION = 1;

	/**
	 * The number of structural features of the '<em>VSSS Brief Description</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSSS_BRIEF_DESCRIPTION_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>VSSS Brief Description</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSSS_BRIEF_DESCRIPTION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.micobs.svm.sss.impl.VSSSTermImpl <em>VSSS Term</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uah.aut.srg.micobs.svm.sss.impl.VSSSTermImpl
	 * @see es.uah.aut.srg.micobs.svm.sss.impl.sssPackageImpl#getVSSSTerm()
	 * @generated
	 */
	int VSSS_TERM = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSSS_TERM__NAME = VSSS_BRIEF_DESCRIPTION__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSSS_TERM__DESCRIPTION = VSSS_BRIEF_DESCRIPTION__DESCRIPTION;

	/**
	 * The number of structural features of the '<em>VSSS Term</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSSS_TERM_FEATURE_COUNT = VSSS_BRIEF_DESCRIPTION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>VSSS Term</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSSS_TERM_OPERATION_COUNT = VSSS_BRIEF_DESCRIPTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.micobs.svm.sss.impl.VSSSDefinitionImpl <em>VSSS Definition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uah.aut.srg.micobs.svm.sss.impl.VSSSDefinitionImpl
	 * @see es.uah.aut.srg.micobs.svm.sss.impl.sssPackageImpl#getVSSSDefinition()
	 * @generated
	 */
	int VSSS_DEFINITION = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSSS_DEFINITION__NAME = VSSS_BRIEF_DESCRIPTION__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSSS_DEFINITION__DESCRIPTION = VSSS_BRIEF_DESCRIPTION__DESCRIPTION;

	/**
	 * The number of structural features of the '<em>VSSS Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSSS_DEFINITION_FEATURE_COUNT = VSSS_BRIEF_DESCRIPTION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>VSSS Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSSS_DEFINITION_OPERATION_COUNT = VSSS_BRIEF_DESCRIPTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.micobs.svm.sss.impl.VSSSAbbreviationImpl <em>VSSS Abbreviation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uah.aut.srg.micobs.svm.sss.impl.VSSSAbbreviationImpl
	 * @see es.uah.aut.srg.micobs.svm.sss.impl.sssPackageImpl#getVSSSAbbreviation()
	 * @generated
	 */
	int VSSS_ABBREVIATION = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSSS_ABBREVIATION__NAME = VSSS_BRIEF_DESCRIPTION__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSSS_ABBREVIATION__DESCRIPTION = VSSS_BRIEF_DESCRIPTION__DESCRIPTION;

	/**
	 * The number of structural features of the '<em>VSSS Abbreviation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSSS_ABBREVIATION_FEATURE_COUNT = VSSS_BRIEF_DESCRIPTION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>VSSS Abbreviation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSSS_ABBREVIATION_OPERATION_COUNT = VSSS_BRIEF_DESCRIPTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.micobs.svm.sss.impl.VSSSGeneralDescriptionImpl <em>VSSS General Description</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uah.aut.srg.micobs.svm.sss.impl.VSSSGeneralDescriptionImpl
	 * @see es.uah.aut.srg.micobs.svm.sss.impl.sssPackageImpl#getVSSSGeneralDescription()
	 * @generated
	 */
	int VSSS_GENERAL_DESCRIPTION = 9;

	/**
	 * The feature id for the '<em><b>Subsections</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSSS_GENERAL_DESCRIPTION__SUBSECTIONS = docPackage.DFIXED_SECTION__SUBSECTIONS;

	/**
	 * The feature id for the '<em><b>Document</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSSS_GENERAL_DESCRIPTION__DOCUMENT = docPackage.DFIXED_SECTION__DOCUMENT;

	/**
	 * The feature id for the '<em><b>Product Perspective</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSSS_GENERAL_DESCRIPTION__PRODUCT_PERSPECTIVE = docPackage.DFIXED_SECTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>General Capabilites</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSSS_GENERAL_DESCRIPTION__GENERAL_CAPABILITES = docPackage.DFIXED_SECTION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>General Constraints</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSSS_GENERAL_DESCRIPTION__GENERAL_CONSTRAINTS = docPackage.DFIXED_SECTION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Operational Environment</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSSS_GENERAL_DESCRIPTION__OPERATIONAL_ENVIRONMENT = docPackage.DFIXED_SECTION_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Assumptions Dependencies</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSSS_GENERAL_DESCRIPTION__ASSUMPTIONS_DEPENDENCIES = docPackage.DFIXED_SECTION_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>VSSS General Description</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSSS_GENERAL_DESCRIPTION_FEATURE_COUNT = docPackage.DFIXED_SECTION_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>VSSS General Description</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSSS_GENERAL_DESCRIPTION_OPERATION_COUNT = docPackage.DFIXED_SECTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.micobs.svm.sss.impl.VSSSProductPerspectiveImpl <em>VSSS Product Perspective</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uah.aut.srg.micobs.svm.sss.impl.VSSSProductPerspectiveImpl
	 * @see es.uah.aut.srg.micobs.svm.sss.impl.sssPackageImpl#getVSSSProductPerspective()
	 * @generated
	 */
	int VSSS_PRODUCT_PERSPECTIVE = 10;

	/**
	 * The feature id for the '<em><b>BContent</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSSS_PRODUCT_PERSPECTIVE__BCONTENT = docPackage.DBODY__BCONTENT;

	/**
	 * The feature id for the '<em><b>Subsections</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSSS_PRODUCT_PERSPECTIVE__SUBSECTIONS = docPackage.DBODY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Document</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSSS_PRODUCT_PERSPECTIVE__DOCUMENT = docPackage.DBODY_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>VSSS Product Perspective</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSSS_PRODUCT_PERSPECTIVE_FEATURE_COUNT = docPackage.DBODY_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>VSSS Product Perspective</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSSS_PRODUCT_PERSPECTIVE_OPERATION_COUNT = docPackage.DBODY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.micobs.svm.sss.impl.VSSSGeneralCapabilitesImpl <em>VSSS General Capabilites</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uah.aut.srg.micobs.svm.sss.impl.VSSSGeneralCapabilitesImpl
	 * @see es.uah.aut.srg.micobs.svm.sss.impl.sssPackageImpl#getVSSSGeneralCapabilites()
	 * @generated
	 */
	int VSSS_GENERAL_CAPABILITES = 11;

	/**
	 * The feature id for the '<em><b>BContent</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSSS_GENERAL_CAPABILITES__BCONTENT = docPackage.DBODY__BCONTENT;

	/**
	 * The feature id for the '<em><b>Subsections</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSSS_GENERAL_CAPABILITES__SUBSECTIONS = docPackage.DBODY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Document</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSSS_GENERAL_CAPABILITES__DOCUMENT = docPackage.DBODY_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>VSSS General Capabilites</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSSS_GENERAL_CAPABILITES_FEATURE_COUNT = docPackage.DBODY_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>VSSS General Capabilites</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSSS_GENERAL_CAPABILITES_OPERATION_COUNT = docPackage.DBODY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.micobs.svm.sss.impl.VSSSGeneralConstraintsImpl <em>VSSS General Constraints</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uah.aut.srg.micobs.svm.sss.impl.VSSSGeneralConstraintsImpl
	 * @see es.uah.aut.srg.micobs.svm.sss.impl.sssPackageImpl#getVSSSGeneralConstraints()
	 * @generated
	 */
	int VSSS_GENERAL_CONSTRAINTS = 12;

	/**
	 * The feature id for the '<em><b>BContent</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSSS_GENERAL_CONSTRAINTS__BCONTENT = docPackage.DBODY__BCONTENT;

	/**
	 * The feature id for the '<em><b>Subsections</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSSS_GENERAL_CONSTRAINTS__SUBSECTIONS = docPackage.DBODY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Document</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSSS_GENERAL_CONSTRAINTS__DOCUMENT = docPackage.DBODY_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>VSSS General Constraints</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSSS_GENERAL_CONSTRAINTS_FEATURE_COUNT = docPackage.DBODY_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>VSSS General Constraints</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSSS_GENERAL_CONSTRAINTS_OPERATION_COUNT = docPackage.DBODY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.micobs.svm.sss.impl.VSSSOperationalEnvironmentImpl <em>VSSS Operational Environment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uah.aut.srg.micobs.svm.sss.impl.VSSSOperationalEnvironmentImpl
	 * @see es.uah.aut.srg.micobs.svm.sss.impl.sssPackageImpl#getVSSSOperationalEnvironment()
	 * @generated
	 */
	int VSSS_OPERATIONAL_ENVIRONMENT = 13;

	/**
	 * The feature id for the '<em><b>BContent</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSSS_OPERATIONAL_ENVIRONMENT__BCONTENT = docPackage.DBODY__BCONTENT;

	/**
	 * The feature id for the '<em><b>Subsections</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSSS_OPERATIONAL_ENVIRONMENT__SUBSECTIONS = docPackage.DBODY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Document</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSSS_OPERATIONAL_ENVIRONMENT__DOCUMENT = docPackage.DBODY_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>VSSS Operational Environment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSSS_OPERATIONAL_ENVIRONMENT_FEATURE_COUNT = docPackage.DBODY_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>VSSS Operational Environment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSSS_OPERATIONAL_ENVIRONMENT_OPERATION_COUNT = docPackage.DBODY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.micobs.svm.sss.impl.VSSSAssumptionsDependenciesImpl <em>VSSS Assumptions Dependencies</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uah.aut.srg.micobs.svm.sss.impl.VSSSAssumptionsDependenciesImpl
	 * @see es.uah.aut.srg.micobs.svm.sss.impl.sssPackageImpl#getVSSSAssumptionsDependencies()
	 * @generated
	 */
	int VSSS_ASSUMPTIONS_DEPENDENCIES = 14;

	/**
	 * The feature id for the '<em><b>BContent</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSSS_ASSUMPTIONS_DEPENDENCIES__BCONTENT = docPackage.DBODY__BCONTENT;

	/**
	 * The feature id for the '<em><b>Subsections</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSSS_ASSUMPTIONS_DEPENDENCIES__SUBSECTIONS = docPackage.DBODY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Document</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSSS_ASSUMPTIONS_DEPENDENCIES__DOCUMENT = docPackage.DBODY_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>VSSS Assumptions Dependencies</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSSS_ASSUMPTIONS_DEPENDENCIES_FEATURE_COUNT = docPackage.DBODY_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>VSSS Assumptions Dependencies</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSSS_ASSUMPTIONS_DEPENDENCIES_OPERATION_COUNT = docPackage.DBODY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.micobs.svm.sss.impl.VSSSSpecificRequirementsImpl <em>VSSS Specific Requirements</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uah.aut.srg.micobs.svm.sss.impl.VSSSSpecificRequirementsImpl
	 * @see es.uah.aut.srg.micobs.svm.sss.impl.sssPackageImpl#getVSSSSpecificRequirements()
	 * @generated
	 */
	int VSSS_SPECIFIC_REQUIREMENTS = 15;

	/**
	 * The feature id for the '<em><b>Subsections</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSSS_SPECIFIC_REQUIREMENTS__SUBSECTIONS = docPackage.DFIXED_SECTION__SUBSECTIONS;

	/**
	 * The feature id for the '<em><b>Document</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSSS_SPECIFIC_REQUIREMENTS__DOCUMENT = docPackage.DFIXED_SECTION__DOCUMENT;

	/**
	 * The feature id for the '<em><b>General</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSSS_SPECIFIC_REQUIREMENTS__GENERAL = docPackage.DFIXED_SECTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Capabilities</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSSS_SPECIFIC_REQUIREMENTS__CAPABILITIES = docPackage.DFIXED_SECTION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>System Interface</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSSS_SPECIFIC_REQUIREMENTS__SYSTEM_INTERFACE = docPackage.DFIXED_SECTION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Adaptation Missionization</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSSS_SPECIFIC_REQUIREMENTS__ADAPTATION_MISSIONIZATION = docPackage.DFIXED_SECTION_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Computer Resource</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSSS_SPECIFIC_REQUIREMENTS__COMPUTER_RESOURCE = docPackage.DFIXED_SECTION_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Security</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSSS_SPECIFIC_REQUIREMENTS__SECURITY = docPackage.DFIXED_SECTION_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Safety</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSSS_SPECIFIC_REQUIREMENTS__SAFETY = docPackage.DFIXED_SECTION_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Reliabilty Availability</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSSS_SPECIFIC_REQUIREMENTS__RELIABILTY_AVAILABILITY = docPackage.DFIXED_SECTION_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Quality</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSSS_SPECIFIC_REQUIREMENTS__QUALITY = docPackage.DFIXED_SECTION_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Design</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSSS_SPECIFIC_REQUIREMENTS__DESIGN = docPackage.DFIXED_SECTION_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Software Operations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSSS_SPECIFIC_REQUIREMENTS__SOFTWARE_OPERATIONS = docPackage.DFIXED_SECTION_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Software Maintenance</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSSS_SPECIFIC_REQUIREMENTS__SOFTWARE_MAINTENANCE = docPackage.DFIXED_SECTION_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>System Software Observability</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSSS_SPECIFIC_REQUIREMENTS__SYSTEM_SOFTWARE_OBSERVABILITY = docPackage.DFIXED_SECTION_FEATURE_COUNT + 12;

	/**
	 * The number of structural features of the '<em>VSSS Specific Requirements</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSSS_SPECIFIC_REQUIREMENTS_FEATURE_COUNT = docPackage.DFIXED_SECTION_FEATURE_COUNT + 13;

	/**
	 * The number of operations of the '<em>VSSS Specific Requirements</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSSS_SPECIFIC_REQUIREMENTS_OPERATION_COUNT = docPackage.DFIXED_SECTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.micobs.svm.sss.impl.VSSSGeneralRequirementImpl <em>VSSS General Requirement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uah.aut.srg.micobs.svm.sss.impl.VSSSGeneralRequirementImpl
	 * @see es.uah.aut.srg.micobs.svm.sss.impl.sssPackageImpl#getVSSSGeneralRequirement()
	 * @generated
	 */
	int VSSS_GENERAL_REQUIREMENT = 16;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSSS_GENERAL_REQUIREMENT__NAME = tdmPackage.VTRACEABLE_DOCUMENT_FIXED_GROUP__NAME;

	/**
	 * The feature id for the '<em><b>Prefix</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSSS_GENERAL_REQUIREMENT__PREFIX = tdmPackage.VTRACEABLE_DOCUMENT_FIXED_GROUP__PREFIX;

	/**
	 * The feature id for the '<em><b>Items</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSSS_GENERAL_REQUIREMENT__ITEMS = tdmPackage.VTRACEABLE_DOCUMENT_FIXED_GROUP__ITEMS;

	/**
	 * The feature id for the '<em><b>TDocument</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSSS_GENERAL_REQUIREMENT__TDOCUMENT = tdmPackage.VTRACEABLE_DOCUMENT_FIXED_GROUP__TDOCUMENT;

	/**
	 * The feature id for the '<em><b>Subsections</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSSS_GENERAL_REQUIREMENT__SUBSECTIONS = tdmPackage.VTRACEABLE_DOCUMENT_FIXED_GROUP_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Document</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSSS_GENERAL_REQUIREMENT__DOCUMENT = tdmPackage.VTRACEABLE_DOCUMENT_FIXED_GROUP_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Sss Items</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSSS_GENERAL_REQUIREMENT__SSS_ITEMS = tdmPackage.VTRACEABLE_DOCUMENT_FIXED_GROUP_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>VSSS General Requirement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSSS_GENERAL_REQUIREMENT_FEATURE_COUNT = tdmPackage.VTRACEABLE_DOCUMENT_FIXED_GROUP_FEATURE_COUNT + 3;

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
	int VSSS_CAPABILITIES_REQUIREMENT = 17;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSSS_CAPABILITIES_REQUIREMENT__NAME = tdmPackage.VTRACEABLE_DOCUMENT_FIXED_GROUP__NAME;

	/**
	 * The feature id for the '<em><b>Prefix</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSSS_CAPABILITIES_REQUIREMENT__PREFIX = tdmPackage.VTRACEABLE_DOCUMENT_FIXED_GROUP__PREFIX;

	/**
	 * The feature id for the '<em><b>Items</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSSS_CAPABILITIES_REQUIREMENT__ITEMS = tdmPackage.VTRACEABLE_DOCUMENT_FIXED_GROUP__ITEMS;

	/**
	 * The feature id for the '<em><b>TDocument</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSSS_CAPABILITIES_REQUIREMENT__TDOCUMENT = tdmPackage.VTRACEABLE_DOCUMENT_FIXED_GROUP__TDOCUMENT;

	/**
	 * The feature id for the '<em><b>Subsections</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSSS_CAPABILITIES_REQUIREMENT__SUBSECTIONS = tdmPackage.VTRACEABLE_DOCUMENT_FIXED_GROUP_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Document</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSSS_CAPABILITIES_REQUIREMENT__DOCUMENT = tdmPackage.VTRACEABLE_DOCUMENT_FIXED_GROUP_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Sss Items</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSSS_CAPABILITIES_REQUIREMENT__SSS_ITEMS = tdmPackage.VTRACEABLE_DOCUMENT_FIXED_GROUP_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>VSSS Capabilities Requirement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSSS_CAPABILITIES_REQUIREMENT_FEATURE_COUNT = tdmPackage.VTRACEABLE_DOCUMENT_FIXED_GROUP_FEATURE_COUNT + 3;

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
	int VSSS_SYSTEM_INTERFACE_REQUIREMENT = 18;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSSS_SYSTEM_INTERFACE_REQUIREMENT__NAME = tdmPackage.VTRACEABLE_DOCUMENT_FIXED_GROUP__NAME;

	/**
	 * The feature id for the '<em><b>Prefix</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSSS_SYSTEM_INTERFACE_REQUIREMENT__PREFIX = tdmPackage.VTRACEABLE_DOCUMENT_FIXED_GROUP__PREFIX;

	/**
	 * The feature id for the '<em><b>Items</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSSS_SYSTEM_INTERFACE_REQUIREMENT__ITEMS = tdmPackage.VTRACEABLE_DOCUMENT_FIXED_GROUP__ITEMS;

	/**
	 * The feature id for the '<em><b>TDocument</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSSS_SYSTEM_INTERFACE_REQUIREMENT__TDOCUMENT = tdmPackage.VTRACEABLE_DOCUMENT_FIXED_GROUP__TDOCUMENT;

	/**
	 * The feature id for the '<em><b>Subsections</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSSS_SYSTEM_INTERFACE_REQUIREMENT__SUBSECTIONS = tdmPackage.VTRACEABLE_DOCUMENT_FIXED_GROUP_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Document</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSSS_SYSTEM_INTERFACE_REQUIREMENT__DOCUMENT = tdmPackage.VTRACEABLE_DOCUMENT_FIXED_GROUP_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Sss Items</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSSS_SYSTEM_INTERFACE_REQUIREMENT__SSS_ITEMS = tdmPackage.VTRACEABLE_DOCUMENT_FIXED_GROUP_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>VSSS System Interface Requirement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSSS_SYSTEM_INTERFACE_REQUIREMENT_FEATURE_COUNT = tdmPackage.VTRACEABLE_DOCUMENT_FIXED_GROUP_FEATURE_COUNT + 3;

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
	int VSSS_ADAPTATION_MISSIONIZATION_REQUIREMENT = 19;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSSS_ADAPTATION_MISSIONIZATION_REQUIREMENT__NAME = tdmPackage.VTRACEABLE_DOCUMENT_FIXED_GROUP__NAME;

	/**
	 * The feature id for the '<em><b>Prefix</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSSS_ADAPTATION_MISSIONIZATION_REQUIREMENT__PREFIX = tdmPackage.VTRACEABLE_DOCUMENT_FIXED_GROUP__PREFIX;

	/**
	 * The feature id for the '<em><b>Items</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSSS_ADAPTATION_MISSIONIZATION_REQUIREMENT__ITEMS = tdmPackage.VTRACEABLE_DOCUMENT_FIXED_GROUP__ITEMS;

	/**
	 * The feature id for the '<em><b>TDocument</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSSS_ADAPTATION_MISSIONIZATION_REQUIREMENT__TDOCUMENT = tdmPackage.VTRACEABLE_DOCUMENT_FIXED_GROUP__TDOCUMENT;

	/**
	 * The feature id for the '<em><b>Subsections</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSSS_ADAPTATION_MISSIONIZATION_REQUIREMENT__SUBSECTIONS = tdmPackage.VTRACEABLE_DOCUMENT_FIXED_GROUP_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Document</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSSS_ADAPTATION_MISSIONIZATION_REQUIREMENT__DOCUMENT = tdmPackage.VTRACEABLE_DOCUMENT_FIXED_GROUP_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Sss Items</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSSS_ADAPTATION_MISSIONIZATION_REQUIREMENT__SSS_ITEMS = tdmPackage.VTRACEABLE_DOCUMENT_FIXED_GROUP_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>VSSS Adaptation Missionization Requirement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSSS_ADAPTATION_MISSIONIZATION_REQUIREMENT_FEATURE_COUNT = tdmPackage.VTRACEABLE_DOCUMENT_FIXED_GROUP_FEATURE_COUNT + 3;

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
	int VSSS_COMPUTER_RESOURCE_REQUIREMENT = 20;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSSS_COMPUTER_RESOURCE_REQUIREMENT__NAME = tdmPackage.VTRACEABLE_DOCUMENT_FIXED_GROUP__NAME;

	/**
	 * The feature id for the '<em><b>Prefix</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSSS_COMPUTER_RESOURCE_REQUIREMENT__PREFIX = tdmPackage.VTRACEABLE_DOCUMENT_FIXED_GROUP__PREFIX;

	/**
	 * The feature id for the '<em><b>Items</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSSS_COMPUTER_RESOURCE_REQUIREMENT__ITEMS = tdmPackage.VTRACEABLE_DOCUMENT_FIXED_GROUP__ITEMS;

	/**
	 * The feature id for the '<em><b>TDocument</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSSS_COMPUTER_RESOURCE_REQUIREMENT__TDOCUMENT = tdmPackage.VTRACEABLE_DOCUMENT_FIXED_GROUP__TDOCUMENT;

	/**
	 * The feature id for the '<em><b>Subsections</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSSS_COMPUTER_RESOURCE_REQUIREMENT__SUBSECTIONS = tdmPackage.VTRACEABLE_DOCUMENT_FIXED_GROUP_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Document</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSSS_COMPUTER_RESOURCE_REQUIREMENT__DOCUMENT = tdmPackage.VTRACEABLE_DOCUMENT_FIXED_GROUP_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Sss Items</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSSS_COMPUTER_RESOURCE_REQUIREMENT__SSS_ITEMS = tdmPackage.VTRACEABLE_DOCUMENT_FIXED_GROUP_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>VSSS Computer Resource Requirement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSSS_COMPUTER_RESOURCE_REQUIREMENT_FEATURE_COUNT = tdmPackage.VTRACEABLE_DOCUMENT_FIXED_GROUP_FEATURE_COUNT + 3;

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
	int VSSS_SECURITY_REQUIREMENT = 21;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSSS_SECURITY_REQUIREMENT__NAME = tdmPackage.VTRACEABLE_DOCUMENT_FIXED_GROUP__NAME;

	/**
	 * The feature id for the '<em><b>Prefix</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSSS_SECURITY_REQUIREMENT__PREFIX = tdmPackage.VTRACEABLE_DOCUMENT_FIXED_GROUP__PREFIX;

	/**
	 * The feature id for the '<em><b>Items</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSSS_SECURITY_REQUIREMENT__ITEMS = tdmPackage.VTRACEABLE_DOCUMENT_FIXED_GROUP__ITEMS;

	/**
	 * The feature id for the '<em><b>TDocument</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSSS_SECURITY_REQUIREMENT__TDOCUMENT = tdmPackage.VTRACEABLE_DOCUMENT_FIXED_GROUP__TDOCUMENT;

	/**
	 * The feature id for the '<em><b>Subsections</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSSS_SECURITY_REQUIREMENT__SUBSECTIONS = tdmPackage.VTRACEABLE_DOCUMENT_FIXED_GROUP_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Document</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSSS_SECURITY_REQUIREMENT__DOCUMENT = tdmPackage.VTRACEABLE_DOCUMENT_FIXED_GROUP_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Sss Items</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSSS_SECURITY_REQUIREMENT__SSS_ITEMS = tdmPackage.VTRACEABLE_DOCUMENT_FIXED_GROUP_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>VSSS Security Requirement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSSS_SECURITY_REQUIREMENT_FEATURE_COUNT = tdmPackage.VTRACEABLE_DOCUMENT_FIXED_GROUP_FEATURE_COUNT + 3;

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
	int VSSS_SAFETY_REQUIREMENT = 22;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSSS_SAFETY_REQUIREMENT__NAME = tdmPackage.VTRACEABLE_DOCUMENT_FIXED_GROUP__NAME;

	/**
	 * The feature id for the '<em><b>Prefix</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSSS_SAFETY_REQUIREMENT__PREFIX = tdmPackage.VTRACEABLE_DOCUMENT_FIXED_GROUP__PREFIX;

	/**
	 * The feature id for the '<em><b>Items</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSSS_SAFETY_REQUIREMENT__ITEMS = tdmPackage.VTRACEABLE_DOCUMENT_FIXED_GROUP__ITEMS;

	/**
	 * The feature id for the '<em><b>TDocument</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSSS_SAFETY_REQUIREMENT__TDOCUMENT = tdmPackage.VTRACEABLE_DOCUMENT_FIXED_GROUP__TDOCUMENT;

	/**
	 * The feature id for the '<em><b>Subsections</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSSS_SAFETY_REQUIREMENT__SUBSECTIONS = tdmPackage.VTRACEABLE_DOCUMENT_FIXED_GROUP_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Document</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSSS_SAFETY_REQUIREMENT__DOCUMENT = tdmPackage.VTRACEABLE_DOCUMENT_FIXED_GROUP_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Sss Items</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSSS_SAFETY_REQUIREMENT__SSS_ITEMS = tdmPackage.VTRACEABLE_DOCUMENT_FIXED_GROUP_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>VSSS Safety Requirement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSSS_SAFETY_REQUIREMENT_FEATURE_COUNT = tdmPackage.VTRACEABLE_DOCUMENT_FIXED_GROUP_FEATURE_COUNT + 3;

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
	int VSSS_RELIABILTY_AVAILABILITY_REQUIREMENT = 23;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSSS_RELIABILTY_AVAILABILITY_REQUIREMENT__NAME = tdmPackage.VTRACEABLE_DOCUMENT_FIXED_GROUP__NAME;

	/**
	 * The feature id for the '<em><b>Prefix</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSSS_RELIABILTY_AVAILABILITY_REQUIREMENT__PREFIX = tdmPackage.VTRACEABLE_DOCUMENT_FIXED_GROUP__PREFIX;

	/**
	 * The feature id for the '<em><b>Items</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSSS_RELIABILTY_AVAILABILITY_REQUIREMENT__ITEMS = tdmPackage.VTRACEABLE_DOCUMENT_FIXED_GROUP__ITEMS;

	/**
	 * The feature id for the '<em><b>TDocument</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSSS_RELIABILTY_AVAILABILITY_REQUIREMENT__TDOCUMENT = tdmPackage.VTRACEABLE_DOCUMENT_FIXED_GROUP__TDOCUMENT;

	/**
	 * The feature id for the '<em><b>Subsections</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSSS_RELIABILTY_AVAILABILITY_REQUIREMENT__SUBSECTIONS = tdmPackage.VTRACEABLE_DOCUMENT_FIXED_GROUP_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Document</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSSS_RELIABILTY_AVAILABILITY_REQUIREMENT__DOCUMENT = tdmPackage.VTRACEABLE_DOCUMENT_FIXED_GROUP_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Sss Items</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSSS_RELIABILTY_AVAILABILITY_REQUIREMENT__SSS_ITEMS = tdmPackage.VTRACEABLE_DOCUMENT_FIXED_GROUP_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>VSSS Reliabilty Availability Requirement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSSS_RELIABILTY_AVAILABILITY_REQUIREMENT_FEATURE_COUNT = tdmPackage.VTRACEABLE_DOCUMENT_FIXED_GROUP_FEATURE_COUNT + 3;

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
	int VSSS_QUALITY_REQUIREMENT = 24;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSSS_QUALITY_REQUIREMENT__NAME = tdmPackage.VTRACEABLE_DOCUMENT_FIXED_GROUP__NAME;

	/**
	 * The feature id for the '<em><b>Prefix</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSSS_QUALITY_REQUIREMENT__PREFIX = tdmPackage.VTRACEABLE_DOCUMENT_FIXED_GROUP__PREFIX;

	/**
	 * The feature id for the '<em><b>Items</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSSS_QUALITY_REQUIREMENT__ITEMS = tdmPackage.VTRACEABLE_DOCUMENT_FIXED_GROUP__ITEMS;

	/**
	 * The feature id for the '<em><b>TDocument</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSSS_QUALITY_REQUIREMENT__TDOCUMENT = tdmPackage.VTRACEABLE_DOCUMENT_FIXED_GROUP__TDOCUMENT;

	/**
	 * The feature id for the '<em><b>Subsections</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSSS_QUALITY_REQUIREMENT__SUBSECTIONS = tdmPackage.VTRACEABLE_DOCUMENT_FIXED_GROUP_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Document</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSSS_QUALITY_REQUIREMENT__DOCUMENT = tdmPackage.VTRACEABLE_DOCUMENT_FIXED_GROUP_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Sss Items</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSSS_QUALITY_REQUIREMENT__SSS_ITEMS = tdmPackage.VTRACEABLE_DOCUMENT_FIXED_GROUP_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>VSSS Quality Requirement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSSS_QUALITY_REQUIREMENT_FEATURE_COUNT = tdmPackage.VTRACEABLE_DOCUMENT_FIXED_GROUP_FEATURE_COUNT + 3;

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
	int VSSS_DESIGN_REQUIREMENT = 25;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSSS_DESIGN_REQUIREMENT__NAME = tdmPackage.VTRACEABLE_DOCUMENT_FIXED_GROUP__NAME;

	/**
	 * The feature id for the '<em><b>Prefix</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSSS_DESIGN_REQUIREMENT__PREFIX = tdmPackage.VTRACEABLE_DOCUMENT_FIXED_GROUP__PREFIX;

	/**
	 * The feature id for the '<em><b>Items</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSSS_DESIGN_REQUIREMENT__ITEMS = tdmPackage.VTRACEABLE_DOCUMENT_FIXED_GROUP__ITEMS;

	/**
	 * The feature id for the '<em><b>TDocument</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSSS_DESIGN_REQUIREMENT__TDOCUMENT = tdmPackage.VTRACEABLE_DOCUMENT_FIXED_GROUP__TDOCUMENT;

	/**
	 * The feature id for the '<em><b>Subsections</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSSS_DESIGN_REQUIREMENT__SUBSECTIONS = tdmPackage.VTRACEABLE_DOCUMENT_FIXED_GROUP_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Document</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSSS_DESIGN_REQUIREMENT__DOCUMENT = tdmPackage.VTRACEABLE_DOCUMENT_FIXED_GROUP_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Sss Items</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSSS_DESIGN_REQUIREMENT__SSS_ITEMS = tdmPackage.VTRACEABLE_DOCUMENT_FIXED_GROUP_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>VSSS Design Requirement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSSS_DESIGN_REQUIREMENT_FEATURE_COUNT = tdmPackage.VTRACEABLE_DOCUMENT_FIXED_GROUP_FEATURE_COUNT + 3;

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
	int VSSS_SOFTWARE_OPERATIONS_REQUIREMENT = 26;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSSS_SOFTWARE_OPERATIONS_REQUIREMENT__NAME = tdmPackage.VTRACEABLE_DOCUMENT_FIXED_GROUP__NAME;

	/**
	 * The feature id for the '<em><b>Prefix</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSSS_SOFTWARE_OPERATIONS_REQUIREMENT__PREFIX = tdmPackage.VTRACEABLE_DOCUMENT_FIXED_GROUP__PREFIX;

	/**
	 * The feature id for the '<em><b>Items</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSSS_SOFTWARE_OPERATIONS_REQUIREMENT__ITEMS = tdmPackage.VTRACEABLE_DOCUMENT_FIXED_GROUP__ITEMS;

	/**
	 * The feature id for the '<em><b>TDocument</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSSS_SOFTWARE_OPERATIONS_REQUIREMENT__TDOCUMENT = tdmPackage.VTRACEABLE_DOCUMENT_FIXED_GROUP__TDOCUMENT;

	/**
	 * The feature id for the '<em><b>Subsections</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSSS_SOFTWARE_OPERATIONS_REQUIREMENT__SUBSECTIONS = tdmPackage.VTRACEABLE_DOCUMENT_FIXED_GROUP_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Document</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSSS_SOFTWARE_OPERATIONS_REQUIREMENT__DOCUMENT = tdmPackage.VTRACEABLE_DOCUMENT_FIXED_GROUP_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Sss Items</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSSS_SOFTWARE_OPERATIONS_REQUIREMENT__SSS_ITEMS = tdmPackage.VTRACEABLE_DOCUMENT_FIXED_GROUP_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>VSSS Software Operations Requirement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSSS_SOFTWARE_OPERATIONS_REQUIREMENT_FEATURE_COUNT = tdmPackage.VTRACEABLE_DOCUMENT_FIXED_GROUP_FEATURE_COUNT + 3;

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
	int VSSS_SOFTWARE_MAINTENANCE_REQUIREMENT = 27;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSSS_SOFTWARE_MAINTENANCE_REQUIREMENT__NAME = tdmPackage.VTRACEABLE_DOCUMENT_FIXED_GROUP__NAME;

	/**
	 * The feature id for the '<em><b>Prefix</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSSS_SOFTWARE_MAINTENANCE_REQUIREMENT__PREFIX = tdmPackage.VTRACEABLE_DOCUMENT_FIXED_GROUP__PREFIX;

	/**
	 * The feature id for the '<em><b>Items</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSSS_SOFTWARE_MAINTENANCE_REQUIREMENT__ITEMS = tdmPackage.VTRACEABLE_DOCUMENT_FIXED_GROUP__ITEMS;

	/**
	 * The feature id for the '<em><b>TDocument</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSSS_SOFTWARE_MAINTENANCE_REQUIREMENT__TDOCUMENT = tdmPackage.VTRACEABLE_DOCUMENT_FIXED_GROUP__TDOCUMENT;

	/**
	 * The feature id for the '<em><b>Subsections</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSSS_SOFTWARE_MAINTENANCE_REQUIREMENT__SUBSECTIONS = tdmPackage.VTRACEABLE_DOCUMENT_FIXED_GROUP_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Document</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSSS_SOFTWARE_MAINTENANCE_REQUIREMENT__DOCUMENT = tdmPackage.VTRACEABLE_DOCUMENT_FIXED_GROUP_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Sss Items</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSSS_SOFTWARE_MAINTENANCE_REQUIREMENT__SSS_ITEMS = tdmPackage.VTRACEABLE_DOCUMENT_FIXED_GROUP_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>VSSS Software Maintenance Requirement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSSS_SOFTWARE_MAINTENANCE_REQUIREMENT_FEATURE_COUNT = tdmPackage.VTRACEABLE_DOCUMENT_FIXED_GROUP_FEATURE_COUNT + 3;

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
	int VSSS_SYSTEM_SOFTWARE_OBSERVABILITY_REQUIREMENT = 28;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSSS_SYSTEM_SOFTWARE_OBSERVABILITY_REQUIREMENT__NAME = tdmPackage.VTRACEABLE_DOCUMENT_FIXED_GROUP__NAME;

	/**
	 * The feature id for the '<em><b>Prefix</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSSS_SYSTEM_SOFTWARE_OBSERVABILITY_REQUIREMENT__PREFIX = tdmPackage.VTRACEABLE_DOCUMENT_FIXED_GROUP__PREFIX;

	/**
	 * The feature id for the '<em><b>Items</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSSS_SYSTEM_SOFTWARE_OBSERVABILITY_REQUIREMENT__ITEMS = tdmPackage.VTRACEABLE_DOCUMENT_FIXED_GROUP__ITEMS;

	/**
	 * The feature id for the '<em><b>TDocument</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSSS_SYSTEM_SOFTWARE_OBSERVABILITY_REQUIREMENT__TDOCUMENT = tdmPackage.VTRACEABLE_DOCUMENT_FIXED_GROUP__TDOCUMENT;

	/**
	 * The feature id for the '<em><b>Subsections</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSSS_SYSTEM_SOFTWARE_OBSERVABILITY_REQUIREMENT__SUBSECTIONS = tdmPackage.VTRACEABLE_DOCUMENT_FIXED_GROUP_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Document</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSSS_SYSTEM_SOFTWARE_OBSERVABILITY_REQUIREMENT__DOCUMENT = tdmPackage.VTRACEABLE_DOCUMENT_FIXED_GROUP_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Sss Items</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSSS_SYSTEM_SOFTWARE_OBSERVABILITY_REQUIREMENT__SSS_ITEMS = tdmPackage.VTRACEABLE_DOCUMENT_FIXED_GROUP_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>VSSS System Software Observability Requirement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSSS_SYSTEM_SOFTWARE_OBSERVABILITY_REQUIREMENT_FEATURE_COUNT = tdmPackage.VTRACEABLE_DOCUMENT_FIXED_GROUP_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>VSSS System Software Observability Requirement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSSS_SYSTEM_SOFTWARE_OBSERVABILITY_REQUIREMENT_OPERATION_COUNT = tdmPackage.VTRACEABLE_DOCUMENT_FIXED_GROUP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.micobs.svm.sss.impl.VSSSVerificationValidationIntegrationRequirementsImpl <em>VSSS Verification Validation Integration Requirements</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uah.aut.srg.micobs.svm.sss.impl.VSSSVerificationValidationIntegrationRequirementsImpl
	 * @see es.uah.aut.srg.micobs.svm.sss.impl.sssPackageImpl#getVSSSVerificationValidationIntegrationRequirements()
	 * @generated
	 */
	int VSSS_VERIFICATION_VALIDATION_INTEGRATION_REQUIREMENTS = 29;

	/**
	 * The feature id for the '<em><b>Subsections</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSSS_VERIFICATION_VALIDATION_INTEGRATION_REQUIREMENTS__SUBSECTIONS = docPackage.DFIXED_SECTION__SUBSECTIONS;

	/**
	 * The feature id for the '<em><b>Document</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSSS_VERIFICATION_VALIDATION_INTEGRATION_REQUIREMENTS__DOCUMENT = docPackage.DFIXED_SECTION__DOCUMENT;

	/**
	 * The feature id for the '<em><b>Verification Validation Process</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSSS_VERIFICATION_VALIDATION_INTEGRATION_REQUIREMENTS__VERIFICATION_VALIDATION_PROCESS = docPackage.DFIXED_SECTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Validation Approach</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSSS_VERIFICATION_VALIDATION_INTEGRATION_REQUIREMENTS__VALIDATION_APPROACH = docPackage.DFIXED_SECTION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Validation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSSS_VERIFICATION_VALIDATION_INTEGRATION_REQUIREMENTS__VALIDATION = docPackage.DFIXED_SECTION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Verification</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSSS_VERIFICATION_VALIDATION_INTEGRATION_REQUIREMENTS__VERIFICATION = docPackage.DFIXED_SECTION_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>VSSS Verification Validation Integration Requirements</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSSS_VERIFICATION_VALIDATION_INTEGRATION_REQUIREMENTS_FEATURE_COUNT = docPackage.DFIXED_SECTION_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>VSSS Verification Validation Integration Requirements</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSSS_VERIFICATION_VALIDATION_INTEGRATION_REQUIREMENTS_OPERATION_COUNT = docPackage.DFIXED_SECTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.micobs.svm.sss.impl.VSSSVerificationValidationProcessRequirementImpl <em>VSSS Verification Validation Process Requirement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uah.aut.srg.micobs.svm.sss.impl.VSSSVerificationValidationProcessRequirementImpl
	 * @see es.uah.aut.srg.micobs.svm.sss.impl.sssPackageImpl#getVSSSVerificationValidationProcessRequirement()
	 * @generated
	 */
	int VSSS_VERIFICATION_VALIDATION_PROCESS_REQUIREMENT = 30;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSSS_VERIFICATION_VALIDATION_PROCESS_REQUIREMENT__NAME = tdmPackage.VTRACEABLE_DOCUMENT_FIXED_GROUP__NAME;

	/**
	 * The feature id for the '<em><b>Prefix</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSSS_VERIFICATION_VALIDATION_PROCESS_REQUIREMENT__PREFIX = tdmPackage.VTRACEABLE_DOCUMENT_FIXED_GROUP__PREFIX;

	/**
	 * The feature id for the '<em><b>Items</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSSS_VERIFICATION_VALIDATION_PROCESS_REQUIREMENT__ITEMS = tdmPackage.VTRACEABLE_DOCUMENT_FIXED_GROUP__ITEMS;

	/**
	 * The feature id for the '<em><b>TDocument</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSSS_VERIFICATION_VALIDATION_PROCESS_REQUIREMENT__TDOCUMENT = tdmPackage.VTRACEABLE_DOCUMENT_FIXED_GROUP__TDOCUMENT;

	/**
	 * The feature id for the '<em><b>Subsections</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSSS_VERIFICATION_VALIDATION_PROCESS_REQUIREMENT__SUBSECTIONS = tdmPackage.VTRACEABLE_DOCUMENT_FIXED_GROUP_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Document</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSSS_VERIFICATION_VALIDATION_PROCESS_REQUIREMENT__DOCUMENT = tdmPackage.VTRACEABLE_DOCUMENT_FIXED_GROUP_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Sss Items</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSSS_VERIFICATION_VALIDATION_PROCESS_REQUIREMENT__SSS_ITEMS = tdmPackage.VTRACEABLE_DOCUMENT_FIXED_GROUP_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>VSSS Verification Validation Process Requirement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSSS_VERIFICATION_VALIDATION_PROCESS_REQUIREMENT_FEATURE_COUNT = tdmPackage.VTRACEABLE_DOCUMENT_FIXED_GROUP_FEATURE_COUNT + 3;

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
	int VSSS_VALIDATION_APPROACH = 31;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSSS_VALIDATION_APPROACH__NAME = tdmPackage.VTRACEABLE_DOCUMENT_FIXED_GROUP__NAME;

	/**
	 * The feature id for the '<em><b>Prefix</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSSS_VALIDATION_APPROACH__PREFIX = tdmPackage.VTRACEABLE_DOCUMENT_FIXED_GROUP__PREFIX;

	/**
	 * The feature id for the '<em><b>Items</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSSS_VALIDATION_APPROACH__ITEMS = tdmPackage.VTRACEABLE_DOCUMENT_FIXED_GROUP__ITEMS;

	/**
	 * The feature id for the '<em><b>TDocument</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSSS_VALIDATION_APPROACH__TDOCUMENT = tdmPackage.VTRACEABLE_DOCUMENT_FIXED_GROUP__TDOCUMENT;

	/**
	 * The feature id for the '<em><b>Subsections</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSSS_VALIDATION_APPROACH__SUBSECTIONS = tdmPackage.VTRACEABLE_DOCUMENT_FIXED_GROUP_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Document</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSSS_VALIDATION_APPROACH__DOCUMENT = tdmPackage.VTRACEABLE_DOCUMENT_FIXED_GROUP_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Sss Items</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSSS_VALIDATION_APPROACH__SSS_ITEMS = tdmPackage.VTRACEABLE_DOCUMENT_FIXED_GROUP_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>VSSS Validation Approach</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSSS_VALIDATION_APPROACH_FEATURE_COUNT = tdmPackage.VTRACEABLE_DOCUMENT_FIXED_GROUP_FEATURE_COUNT + 3;

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
	int VSSS_VERIFICATION_REQUIREMENT = 32;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSSS_VERIFICATION_REQUIREMENT__NAME = tdmPackage.VTRACEABLE_DOCUMENT_FIXED_GROUP__NAME;

	/**
	 * The feature id for the '<em><b>Prefix</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSSS_VERIFICATION_REQUIREMENT__PREFIX = tdmPackage.VTRACEABLE_DOCUMENT_FIXED_GROUP__PREFIX;

	/**
	 * The feature id for the '<em><b>Items</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSSS_VERIFICATION_REQUIREMENT__ITEMS = tdmPackage.VTRACEABLE_DOCUMENT_FIXED_GROUP__ITEMS;

	/**
	 * The feature id for the '<em><b>TDocument</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSSS_VERIFICATION_REQUIREMENT__TDOCUMENT = tdmPackage.VTRACEABLE_DOCUMENT_FIXED_GROUP__TDOCUMENT;

	/**
	 * The feature id for the '<em><b>Subsections</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSSS_VERIFICATION_REQUIREMENT__SUBSECTIONS = tdmPackage.VTRACEABLE_DOCUMENT_FIXED_GROUP_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Document</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSSS_VERIFICATION_REQUIREMENT__DOCUMENT = tdmPackage.VTRACEABLE_DOCUMENT_FIXED_GROUP_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Sss Items</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSSS_VERIFICATION_REQUIREMENT__SSS_ITEMS = tdmPackage.VTRACEABLE_DOCUMENT_FIXED_GROUP_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>VSSS Verification Requirement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSSS_VERIFICATION_REQUIREMENT_FEATURE_COUNT = tdmPackage.VTRACEABLE_DOCUMENT_FIXED_GROUP_FEATURE_COUNT + 3;

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
	int VSSS_VALIDATION_REQUIREMENT = 33;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSSS_VALIDATION_REQUIREMENT__NAME = tdmPackage.VTRACEABLE_DOCUMENT_FIXED_GROUP__NAME;

	/**
	 * The feature id for the '<em><b>Prefix</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSSS_VALIDATION_REQUIREMENT__PREFIX = tdmPackage.VTRACEABLE_DOCUMENT_FIXED_GROUP__PREFIX;

	/**
	 * The feature id for the '<em><b>Items</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSSS_VALIDATION_REQUIREMENT__ITEMS = tdmPackage.VTRACEABLE_DOCUMENT_FIXED_GROUP__ITEMS;

	/**
	 * The feature id for the '<em><b>TDocument</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSSS_VALIDATION_REQUIREMENT__TDOCUMENT = tdmPackage.VTRACEABLE_DOCUMENT_FIXED_GROUP__TDOCUMENT;

	/**
	 * The feature id for the '<em><b>Subsections</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSSS_VALIDATION_REQUIREMENT__SUBSECTIONS = tdmPackage.VTRACEABLE_DOCUMENT_FIXED_GROUP_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Document</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSSS_VALIDATION_REQUIREMENT__DOCUMENT = tdmPackage.VTRACEABLE_DOCUMENT_FIXED_GROUP_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Sss Items</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSSS_VALIDATION_REQUIREMENT__SSS_ITEMS = tdmPackage.VTRACEABLE_DOCUMENT_FIXED_GROUP_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>VSSS Validation Requirement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSSS_VALIDATION_REQUIREMENT_FEATURE_COUNT = tdmPackage.VTRACEABLE_DOCUMENT_FIXED_GROUP_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>VSSS Validation Requirement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSSS_VALIDATION_REQUIREMENT_OPERATION_COUNT = tdmPackage.VTRACEABLE_DOCUMENT_FIXED_GROUP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.micobs.svm.sss.impl.VSSSDocumentItemImpl <em>VSSS Document Item</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uah.aut.srg.micobs.svm.sss.impl.VSSSDocumentItemImpl
	 * @see es.uah.aut.srg.micobs.svm.sss.impl.sssPackageImpl#getVSSSDocumentItem()
	 * @generated
	 */
	int VSSS_DOCUMENT_ITEM = 34;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSSS_DOCUMENT_ITEM__ID = tdmPackage.VTRACEABLE_DOCUMENT_ABSTRACT_ITEM__ID;

	/**
	 * The feature id for the '<em><b>Short Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSSS_DOCUMENT_ITEM__SHORT_DESCRIPTION = tdmPackage.VTRACEABLE_DOCUMENT_ABSTRACT_ITEM__SHORT_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Verification Method</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSSS_DOCUMENT_ITEM__VERIFICATION_METHOD = tdmPackage.VTRACEABLE_DOCUMENT_ABSTRACT_ITEM__VERIFICATION_METHOD;

	/**
	 * The feature id for the '<em><b>Group</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSSS_DOCUMENT_ITEM__GROUP = tdmPackage.VTRACEABLE_DOCUMENT_ABSTRACT_ITEM__GROUP;

	/**
	 * The feature id for the '<em><b>BContent</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSSS_DOCUMENT_ITEM__BCONTENT = tdmPackage.VTRACEABLE_DOCUMENT_ABSTRACT_ITEM_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>VSSS Document Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSSS_DOCUMENT_ITEM_FEATURE_COUNT = tdmPackage.VTRACEABLE_DOCUMENT_ABSTRACT_ITEM_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>VSSS Document Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSSS_DOCUMENT_ITEM_OPERATION_COUNT = tdmPackage.VTRACEABLE_DOCUMENT_ABSTRACT_ITEM_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.micobs.svm.sss.impl.VSSSSystemModelsImpl <em>VSSS System Models</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uah.aut.srg.micobs.svm.sss.impl.VSSSSystemModelsImpl
	 * @see es.uah.aut.srg.micobs.svm.sss.impl.sssPackageImpl#getVSSSSystemModels()
	 * @generated
	 */
	int VSSS_SYSTEM_MODELS = 35;

	/**
	 * The feature id for the '<em><b>Subsections</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSSS_SYSTEM_MODELS__SUBSECTIONS = docPackage.DFIXED_SECTION__SUBSECTIONS;

	/**
	 * The feature id for the '<em><b>Document</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSSS_SYSTEM_MODELS__DOCUMENT = docPackage.DFIXED_SECTION__DOCUMENT;

	/**
	 * The feature id for the '<em><b>System Models</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSSS_SYSTEM_MODELS__SYSTEM_MODELS = docPackage.DFIXED_SECTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>VSSS System Models</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSSS_SYSTEM_MODELS_FEATURE_COUNT = docPackage.DFIXED_SECTION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>VSSS System Models</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSSS_SYSTEM_MODELS_OPERATION_COUNT = docPackage.DFIXED_SECTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.micobs.svm.sss.impl.VSSSSystemModelImpl <em>VSSS System Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uah.aut.srg.micobs.svm.sss.impl.VSSSSystemModelImpl
	 * @see es.uah.aut.srg.micobs.svm.sss.impl.sssPackageImpl#getVSSSSystemModel()
	 * @generated
	 */
	int VSSS_SYSTEM_MODEL = 36;

	/**
	 * The number of structural features of the '<em>VSSS System Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSSS_SYSTEM_MODEL_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>VSSS System Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSSS_SYSTEM_MODEL_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.micobs.svm.sss.VSSSDocument <em>VSSS Document</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>VSSS Document</em>'.
	 * @see es.uah.aut.srg.micobs.svm.sss.VSSSDocument
	 * @generated
	 */
	EClass getVSSSDocument();

	/**
	 * Returns the meta object for the containment reference '{@link es.uah.aut.srg.micobs.svm.sss.VSSSDocument#getIntroduction <em>Introduction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Introduction</em>'.
	 * @see es.uah.aut.srg.micobs.svm.sss.VSSSDocument#getIntroduction()
	 * @see #getVSSSDocument()
	 * @generated
	 */
	EReference getVSSSDocument_Introduction();

	/**
	 * Returns the meta object for the containment reference '{@link es.uah.aut.srg.micobs.svm.sss.VSSSDocument#getApplicableDocumentsSection <em>Applicable Documents Section</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Applicable Documents Section</em>'.
	 * @see es.uah.aut.srg.micobs.svm.sss.VSSSDocument#getApplicableDocumentsSection()
	 * @see #getVSSSDocument()
	 * @generated
	 */
	EReference getVSSSDocument_ApplicableDocumentsSection();

	/**
	 * Returns the meta object for the containment reference '{@link es.uah.aut.srg.micobs.svm.sss.VSSSDocument#getReferenceDocumentsSection <em>Reference Documents Section</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Reference Documents Section</em>'.
	 * @see es.uah.aut.srg.micobs.svm.sss.VSSSDocument#getReferenceDocumentsSection()
	 * @see #getVSSSDocument()
	 * @generated
	 */
	EReference getVSSSDocument_ReferenceDocumentsSection();

	/**
	 * Returns the meta object for the containment reference '{@link es.uah.aut.srg.micobs.svm.sss.VSSSDocument#getTermsDefinitionsAbbreviations <em>Terms Definitions Abbreviations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Terms Definitions Abbreviations</em>'.
	 * @see es.uah.aut.srg.micobs.svm.sss.VSSSDocument#getTermsDefinitionsAbbreviations()
	 * @see #getVSSSDocument()
	 * @generated
	 */
	EReference getVSSSDocument_TermsDefinitionsAbbreviations();

	/**
	 * Returns the meta object for the containment reference '{@link es.uah.aut.srg.micobs.svm.sss.VSSSDocument#getGeneralDescription <em>General Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>General Description</em>'.
	 * @see es.uah.aut.srg.micobs.svm.sss.VSSSDocument#getGeneralDescription()
	 * @see #getVSSSDocument()
	 * @generated
	 */
	EReference getVSSSDocument_GeneralDescription();

	/**
	 * Returns the meta object for the containment reference '{@link es.uah.aut.srg.micobs.svm.sss.VSSSDocument#getSpecificRequirements <em>Specific Requirements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Specific Requirements</em>'.
	 * @see es.uah.aut.srg.micobs.svm.sss.VSSSDocument#getSpecificRequirements()
	 * @see #getVSSSDocument()
	 * @generated
	 */
	EReference getVSSSDocument_SpecificRequirements();

	/**
	 * Returns the meta object for the containment reference '{@link es.uah.aut.srg.micobs.svm.sss.VSSSDocument#getVerificationValidationIntegration <em>Verification Validation Integration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Verification Validation Integration</em>'.
	 * @see es.uah.aut.srg.micobs.svm.sss.VSSSDocument#getVerificationValidationIntegration()
	 * @see #getVSSSDocument()
	 * @generated
	 */
	EReference getVSSSDocument_VerificationValidationIntegration();

	/**
	 * Returns the meta object for the containment reference '{@link es.uah.aut.srg.micobs.svm.sss.VSSSDocument#getSystemModels <em>System Models</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>System Models</em>'.
	 * @see es.uah.aut.srg.micobs.svm.sss.VSSSDocument#getSystemModels()
	 * @see #getVSSSDocument()
	 * @generated
	 */
	EReference getVSSSDocument_SystemModels();

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
	 * Returns the meta object for the containment reference '{@link es.uah.aut.srg.micobs.svm.sss.VSSSIntroduction#getPurpose <em>Purpose</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Purpose</em>'.
	 * @see es.uah.aut.srg.micobs.svm.sss.VSSSIntroduction#getPurpose()
	 * @see #getVSSSIntroduction()
	 * @generated
	 */
	EReference getVSSSIntroduction_Purpose();

	/**
	 * Returns the meta object for the containment reference '{@link es.uah.aut.srg.micobs.svm.sss.VSSSIntroduction#getObjetive <em>Objetive</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Objetive</em>'.
	 * @see es.uah.aut.srg.micobs.svm.sss.VSSSIntroduction#getObjetive()
	 * @see #getVSSSIntroduction()
	 * @generated
	 */
	EReference getVSSSIntroduction_Objetive();

	/**
	 * Returns the meta object for the containment reference '{@link es.uah.aut.srg.micobs.svm.sss.VSSSIntroduction#getContent <em>Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Content</em>'.
	 * @see es.uah.aut.srg.micobs.svm.sss.VSSSIntroduction#getContent()
	 * @see #getVSSSIntroduction()
	 * @generated
	 */
	EReference getVSSSIntroduction_Content();

	/**
	 * Returns the meta object for the containment reference '{@link es.uah.aut.srg.micobs.svm.sss.VSSSIntroduction#getReason <em>Reason</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Reason</em>'.
	 * @see es.uah.aut.srg.micobs.svm.sss.VSSSIntroduction#getReason()
	 * @see #getVSSSIntroduction()
	 * @generated
	 */
	EReference getVSSSIntroduction_Reason();

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
	 * Returns the meta object for the containment reference list '{@link es.uah.aut.srg.micobs.svm.sss.VSSSApplicableDocuments#getApplicableDocuments <em>Applicable Documents</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Applicable Documents</em>'.
	 * @see es.uah.aut.srg.micobs.svm.sss.VSSSApplicableDocuments#getApplicableDocuments()
	 * @see #getVSSSApplicableDocuments()
	 * @generated
	 */
	EReference getVSSSApplicableDocuments_ApplicableDocuments();

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
	 * Returns the meta object for the containment reference list '{@link es.uah.aut.srg.micobs.svm.sss.VSSSReferenceDocuments#getReferenceDocuments <em>Reference Documents</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Reference Documents</em>'.
	 * @see es.uah.aut.srg.micobs.svm.sss.VSSSReferenceDocuments#getReferenceDocuments()
	 * @see #getVSSSReferenceDocuments()
	 * @generated
	 */
	EReference getVSSSReferenceDocuments_ReferenceDocuments();

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
	 * Returns the meta object for the containment reference list '{@link es.uah.aut.srg.micobs.svm.sss.VSSSTermsDefinitionsAbbreviations#getTerms <em>Terms</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Terms</em>'.
	 * @see es.uah.aut.srg.micobs.svm.sss.VSSSTermsDefinitionsAbbreviations#getTerms()
	 * @see #getVSSSTermsDefinitionsAbbreviations()
	 * @generated
	 */
	EReference getVSSSTermsDefinitionsAbbreviations_Terms();

	/**
	 * Returns the meta object for the containment reference list '{@link es.uah.aut.srg.micobs.svm.sss.VSSSTermsDefinitionsAbbreviations#getDefinitions <em>Definitions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Definitions</em>'.
	 * @see es.uah.aut.srg.micobs.svm.sss.VSSSTermsDefinitionsAbbreviations#getDefinitions()
	 * @see #getVSSSTermsDefinitionsAbbreviations()
	 * @generated
	 */
	EReference getVSSSTermsDefinitionsAbbreviations_Definitions();

	/**
	 * Returns the meta object for the containment reference list '{@link es.uah.aut.srg.micobs.svm.sss.VSSSTermsDefinitionsAbbreviations#getAbbreviations <em>Abbreviations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Abbreviations</em>'.
	 * @see es.uah.aut.srg.micobs.svm.sss.VSSSTermsDefinitionsAbbreviations#getAbbreviations()
	 * @see #getVSSSTermsDefinitionsAbbreviations()
	 * @generated
	 */
	EReference getVSSSTermsDefinitionsAbbreviations_Abbreviations();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.micobs.svm.sss.VSSSBriefDescription <em>VSSS Brief Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>VSSS Brief Description</em>'.
	 * @see es.uah.aut.srg.micobs.svm.sss.VSSSBriefDescription
	 * @generated
	 */
	EClass getVSSSBriefDescription();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.micobs.svm.sss.VSSSBriefDescription#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see es.uah.aut.srg.micobs.svm.sss.VSSSBriefDescription#getName()
	 * @see #getVSSSBriefDescription()
	 * @generated
	 */
	EAttribute getVSSSBriefDescription_Name();

	/**
	 * Returns the meta object for the reference '{@link es.uah.aut.srg.micobs.svm.sss.VSSSBriefDescription#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Description</em>'.
	 * @see es.uah.aut.srg.micobs.svm.sss.VSSSBriefDescription#getDescription()
	 * @see #getVSSSBriefDescription()
	 * @generated
	 */
	EReference getVSSSBriefDescription_Description();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.micobs.svm.sss.VSSSTerm <em>VSSS Term</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>VSSS Term</em>'.
	 * @see es.uah.aut.srg.micobs.svm.sss.VSSSTerm
	 * @generated
	 */
	EClass getVSSSTerm();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.micobs.svm.sss.VSSSDefinition <em>VSSS Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>VSSS Definition</em>'.
	 * @see es.uah.aut.srg.micobs.svm.sss.VSSSDefinition
	 * @generated
	 */
	EClass getVSSSDefinition();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.micobs.svm.sss.VSSSAbbreviation <em>VSSS Abbreviation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>VSSS Abbreviation</em>'.
	 * @see es.uah.aut.srg.micobs.svm.sss.VSSSAbbreviation
	 * @generated
	 */
	EClass getVSSSAbbreviation();

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
	 * Returns the meta object for the containment reference '{@link es.uah.aut.srg.micobs.svm.sss.VSSSGeneralDescription#getProductPerspective <em>Product Perspective</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Product Perspective</em>'.
	 * @see es.uah.aut.srg.micobs.svm.sss.VSSSGeneralDescription#getProductPerspective()
	 * @see #getVSSSGeneralDescription()
	 * @generated
	 */
	EReference getVSSSGeneralDescription_ProductPerspective();

	/**
	 * Returns the meta object for the containment reference '{@link es.uah.aut.srg.micobs.svm.sss.VSSSGeneralDescription#getGeneralCapabilites <em>General Capabilites</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>General Capabilites</em>'.
	 * @see es.uah.aut.srg.micobs.svm.sss.VSSSGeneralDescription#getGeneralCapabilites()
	 * @see #getVSSSGeneralDescription()
	 * @generated
	 */
	EReference getVSSSGeneralDescription_GeneralCapabilites();

	/**
	 * Returns the meta object for the containment reference '{@link es.uah.aut.srg.micobs.svm.sss.VSSSGeneralDescription#getGeneralConstraints <em>General Constraints</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>General Constraints</em>'.
	 * @see es.uah.aut.srg.micobs.svm.sss.VSSSGeneralDescription#getGeneralConstraints()
	 * @see #getVSSSGeneralDescription()
	 * @generated
	 */
	EReference getVSSSGeneralDescription_GeneralConstraints();

	/**
	 * Returns the meta object for the containment reference '{@link es.uah.aut.srg.micobs.svm.sss.VSSSGeneralDescription#getOperationalEnvironment <em>Operational Environment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Operational Environment</em>'.
	 * @see es.uah.aut.srg.micobs.svm.sss.VSSSGeneralDescription#getOperationalEnvironment()
	 * @see #getVSSSGeneralDescription()
	 * @generated
	 */
	EReference getVSSSGeneralDescription_OperationalEnvironment();

	/**
	 * Returns the meta object for the containment reference '{@link es.uah.aut.srg.micobs.svm.sss.VSSSGeneralDescription#getAssumptionsDependencies <em>Assumptions Dependencies</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Assumptions Dependencies</em>'.
	 * @see es.uah.aut.srg.micobs.svm.sss.VSSSGeneralDescription#getAssumptionsDependencies()
	 * @see #getVSSSGeneralDescription()
	 * @generated
	 */
	EReference getVSSSGeneralDescription_AssumptionsDependencies();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.micobs.svm.sss.VSSSProductPerspective <em>VSSS Product Perspective</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>VSSS Product Perspective</em>'.
	 * @see es.uah.aut.srg.micobs.svm.sss.VSSSProductPerspective
	 * @generated
	 */
	EClass getVSSSProductPerspective();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.micobs.svm.sss.VSSSGeneralCapabilites <em>VSSS General Capabilites</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>VSSS General Capabilites</em>'.
	 * @see es.uah.aut.srg.micobs.svm.sss.VSSSGeneralCapabilites
	 * @generated
	 */
	EClass getVSSSGeneralCapabilites();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.micobs.svm.sss.VSSSGeneralConstraints <em>VSSS General Constraints</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>VSSS General Constraints</em>'.
	 * @see es.uah.aut.srg.micobs.svm.sss.VSSSGeneralConstraints
	 * @generated
	 */
	EClass getVSSSGeneralConstraints();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.micobs.svm.sss.VSSSOperationalEnvironment <em>VSSS Operational Environment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>VSSS Operational Environment</em>'.
	 * @see es.uah.aut.srg.micobs.svm.sss.VSSSOperationalEnvironment
	 * @generated
	 */
	EClass getVSSSOperationalEnvironment();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.micobs.svm.sss.VSSSAssumptionsDependencies <em>VSSS Assumptions Dependencies</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>VSSS Assumptions Dependencies</em>'.
	 * @see es.uah.aut.srg.micobs.svm.sss.VSSSAssumptionsDependencies
	 * @generated
	 */
	EClass getVSSSAssumptionsDependencies();

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
	 * Returns the meta object for the containment reference list '{@link es.uah.aut.srg.micobs.svm.sss.VSSSSpecificRequirements#getGeneral <em>General</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>General</em>'.
	 * @see es.uah.aut.srg.micobs.svm.sss.VSSSSpecificRequirements#getGeneral()
	 * @see #getVSSSSpecificRequirements()
	 * @generated
	 */
	EReference getVSSSSpecificRequirements_General();

	/**
	 * Returns the meta object for the containment reference list '{@link es.uah.aut.srg.micobs.svm.sss.VSSSSpecificRequirements#getCapabilities <em>Capabilities</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Capabilities</em>'.
	 * @see es.uah.aut.srg.micobs.svm.sss.VSSSSpecificRequirements#getCapabilities()
	 * @see #getVSSSSpecificRequirements()
	 * @generated
	 */
	EReference getVSSSSpecificRequirements_Capabilities();

	/**
	 * Returns the meta object for the containment reference list '{@link es.uah.aut.srg.micobs.svm.sss.VSSSSpecificRequirements#getSystemInterface <em>System Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>System Interface</em>'.
	 * @see es.uah.aut.srg.micobs.svm.sss.VSSSSpecificRequirements#getSystemInterface()
	 * @see #getVSSSSpecificRequirements()
	 * @generated
	 */
	EReference getVSSSSpecificRequirements_SystemInterface();

	/**
	 * Returns the meta object for the containment reference list '{@link es.uah.aut.srg.micobs.svm.sss.VSSSSpecificRequirements#getAdaptationMissionization <em>Adaptation Missionization</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Adaptation Missionization</em>'.
	 * @see es.uah.aut.srg.micobs.svm.sss.VSSSSpecificRequirements#getAdaptationMissionization()
	 * @see #getVSSSSpecificRequirements()
	 * @generated
	 */
	EReference getVSSSSpecificRequirements_AdaptationMissionization();

	/**
	 * Returns the meta object for the containment reference list '{@link es.uah.aut.srg.micobs.svm.sss.VSSSSpecificRequirements#getComputerResource <em>Computer Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Computer Resource</em>'.
	 * @see es.uah.aut.srg.micobs.svm.sss.VSSSSpecificRequirements#getComputerResource()
	 * @see #getVSSSSpecificRequirements()
	 * @generated
	 */
	EReference getVSSSSpecificRequirements_ComputerResource();

	/**
	 * Returns the meta object for the containment reference list '{@link es.uah.aut.srg.micobs.svm.sss.VSSSSpecificRequirements#getSecurity <em>Security</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Security</em>'.
	 * @see es.uah.aut.srg.micobs.svm.sss.VSSSSpecificRequirements#getSecurity()
	 * @see #getVSSSSpecificRequirements()
	 * @generated
	 */
	EReference getVSSSSpecificRequirements_Security();

	/**
	 * Returns the meta object for the containment reference list '{@link es.uah.aut.srg.micobs.svm.sss.VSSSSpecificRequirements#getSafety <em>Safety</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Safety</em>'.
	 * @see es.uah.aut.srg.micobs.svm.sss.VSSSSpecificRequirements#getSafety()
	 * @see #getVSSSSpecificRequirements()
	 * @generated
	 */
	EReference getVSSSSpecificRequirements_Safety();

	/**
	 * Returns the meta object for the containment reference list '{@link es.uah.aut.srg.micobs.svm.sss.VSSSSpecificRequirements#getReliabiltyAvailability <em>Reliabilty Availability</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Reliabilty Availability</em>'.
	 * @see es.uah.aut.srg.micobs.svm.sss.VSSSSpecificRequirements#getReliabiltyAvailability()
	 * @see #getVSSSSpecificRequirements()
	 * @generated
	 */
	EReference getVSSSSpecificRequirements_ReliabiltyAvailability();

	/**
	 * Returns the meta object for the containment reference list '{@link es.uah.aut.srg.micobs.svm.sss.VSSSSpecificRequirements#getQuality <em>Quality</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Quality</em>'.
	 * @see es.uah.aut.srg.micobs.svm.sss.VSSSSpecificRequirements#getQuality()
	 * @see #getVSSSSpecificRequirements()
	 * @generated
	 */
	EReference getVSSSSpecificRequirements_Quality();

	/**
	 * Returns the meta object for the containment reference list '{@link es.uah.aut.srg.micobs.svm.sss.VSSSSpecificRequirements#getDesign <em>Design</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Design</em>'.
	 * @see es.uah.aut.srg.micobs.svm.sss.VSSSSpecificRequirements#getDesign()
	 * @see #getVSSSSpecificRequirements()
	 * @generated
	 */
	EReference getVSSSSpecificRequirements_Design();

	/**
	 * Returns the meta object for the containment reference list '{@link es.uah.aut.srg.micobs.svm.sss.VSSSSpecificRequirements#getSoftwareOperations <em>Software Operations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Software Operations</em>'.
	 * @see es.uah.aut.srg.micobs.svm.sss.VSSSSpecificRequirements#getSoftwareOperations()
	 * @see #getVSSSSpecificRequirements()
	 * @generated
	 */
	EReference getVSSSSpecificRequirements_SoftwareOperations();

	/**
	 * Returns the meta object for the containment reference list '{@link es.uah.aut.srg.micobs.svm.sss.VSSSSpecificRequirements#getSoftwareMaintenance <em>Software Maintenance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Software Maintenance</em>'.
	 * @see es.uah.aut.srg.micobs.svm.sss.VSSSSpecificRequirements#getSoftwareMaintenance()
	 * @see #getVSSSSpecificRequirements()
	 * @generated
	 */
	EReference getVSSSSpecificRequirements_SoftwareMaintenance();

	/**
	 * Returns the meta object for the containment reference list '{@link es.uah.aut.srg.micobs.svm.sss.VSSSSpecificRequirements#getSystemSoftwareObservability <em>System Software Observability</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>System Software Observability</em>'.
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
	 * Returns the meta object for the containment reference list '{@link es.uah.aut.srg.micobs.svm.sss.VSSSGeneralRequirement#getSssItems <em>Sss Items</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sss Items</em>'.
	 * @see es.uah.aut.srg.micobs.svm.sss.VSSSGeneralRequirement#getSssItems()
	 * @see #getVSSSGeneralRequirement()
	 * @generated
	 */
	EReference getVSSSGeneralRequirement_SssItems();

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
	 * Returns the meta object for the containment reference list '{@link es.uah.aut.srg.micobs.svm.sss.VSSSCapabilitiesRequirement#getSssItems <em>Sss Items</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sss Items</em>'.
	 * @see es.uah.aut.srg.micobs.svm.sss.VSSSCapabilitiesRequirement#getSssItems()
	 * @see #getVSSSCapabilitiesRequirement()
	 * @generated
	 */
	EReference getVSSSCapabilitiesRequirement_SssItems();

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
	 * Returns the meta object for the containment reference list '{@link es.uah.aut.srg.micobs.svm.sss.VSSSSystemInterfaceRequirement#getSssItems <em>Sss Items</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sss Items</em>'.
	 * @see es.uah.aut.srg.micobs.svm.sss.VSSSSystemInterfaceRequirement#getSssItems()
	 * @see #getVSSSSystemInterfaceRequirement()
	 * @generated
	 */
	EReference getVSSSSystemInterfaceRequirement_SssItems();

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
	 * Returns the meta object for the containment reference list '{@link es.uah.aut.srg.micobs.svm.sss.VSSSAdaptationMissionizationRequirement#getSssItems <em>Sss Items</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sss Items</em>'.
	 * @see es.uah.aut.srg.micobs.svm.sss.VSSSAdaptationMissionizationRequirement#getSssItems()
	 * @see #getVSSSAdaptationMissionizationRequirement()
	 * @generated
	 */
	EReference getVSSSAdaptationMissionizationRequirement_SssItems();

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
	 * Returns the meta object for the containment reference list '{@link es.uah.aut.srg.micobs.svm.sss.VSSSComputerResourceRequirement#getSssItems <em>Sss Items</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sss Items</em>'.
	 * @see es.uah.aut.srg.micobs.svm.sss.VSSSComputerResourceRequirement#getSssItems()
	 * @see #getVSSSComputerResourceRequirement()
	 * @generated
	 */
	EReference getVSSSComputerResourceRequirement_SssItems();

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
	 * Returns the meta object for the containment reference list '{@link es.uah.aut.srg.micobs.svm.sss.VSSSSecurityRequirement#getSssItems <em>Sss Items</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sss Items</em>'.
	 * @see es.uah.aut.srg.micobs.svm.sss.VSSSSecurityRequirement#getSssItems()
	 * @see #getVSSSSecurityRequirement()
	 * @generated
	 */
	EReference getVSSSSecurityRequirement_SssItems();

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
	 * Returns the meta object for the containment reference list '{@link es.uah.aut.srg.micobs.svm.sss.VSSSSafetyRequirement#getSssItems <em>Sss Items</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sss Items</em>'.
	 * @see es.uah.aut.srg.micobs.svm.sss.VSSSSafetyRequirement#getSssItems()
	 * @see #getVSSSSafetyRequirement()
	 * @generated
	 */
	EReference getVSSSSafetyRequirement_SssItems();

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
	 * Returns the meta object for the containment reference list '{@link es.uah.aut.srg.micobs.svm.sss.VSSSReliabiltyAvailabilityRequirement#getSssItems <em>Sss Items</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sss Items</em>'.
	 * @see es.uah.aut.srg.micobs.svm.sss.VSSSReliabiltyAvailabilityRequirement#getSssItems()
	 * @see #getVSSSReliabiltyAvailabilityRequirement()
	 * @generated
	 */
	EReference getVSSSReliabiltyAvailabilityRequirement_SssItems();

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
	 * Returns the meta object for the containment reference list '{@link es.uah.aut.srg.micobs.svm.sss.VSSSQualityRequirement#getSssItems <em>Sss Items</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sss Items</em>'.
	 * @see es.uah.aut.srg.micobs.svm.sss.VSSSQualityRequirement#getSssItems()
	 * @see #getVSSSQualityRequirement()
	 * @generated
	 */
	EReference getVSSSQualityRequirement_SssItems();

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
	 * Returns the meta object for the containment reference list '{@link es.uah.aut.srg.micobs.svm.sss.VSSSDesignRequirement#getSssItems <em>Sss Items</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sss Items</em>'.
	 * @see es.uah.aut.srg.micobs.svm.sss.VSSSDesignRequirement#getSssItems()
	 * @see #getVSSSDesignRequirement()
	 * @generated
	 */
	EReference getVSSSDesignRequirement_SssItems();

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
	 * Returns the meta object for the containment reference list '{@link es.uah.aut.srg.micobs.svm.sss.VSSSSoftwareOperationsRequirement#getSssItems <em>Sss Items</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sss Items</em>'.
	 * @see es.uah.aut.srg.micobs.svm.sss.VSSSSoftwareOperationsRequirement#getSssItems()
	 * @see #getVSSSSoftwareOperationsRequirement()
	 * @generated
	 */
	EReference getVSSSSoftwareOperationsRequirement_SssItems();

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
	 * Returns the meta object for the containment reference list '{@link es.uah.aut.srg.micobs.svm.sss.VSSSSoftwareMaintenanceRequirement#getSssItems <em>Sss Items</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sss Items</em>'.
	 * @see es.uah.aut.srg.micobs.svm.sss.VSSSSoftwareMaintenanceRequirement#getSssItems()
	 * @see #getVSSSSoftwareMaintenanceRequirement()
	 * @generated
	 */
	EReference getVSSSSoftwareMaintenanceRequirement_SssItems();

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
	 * Returns the meta object for the containment reference list '{@link es.uah.aut.srg.micobs.svm.sss.VSSSSystemSoftwareObservabilityRequirement#getSssItems <em>Sss Items</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sss Items</em>'.
	 * @see es.uah.aut.srg.micobs.svm.sss.VSSSSystemSoftwareObservabilityRequirement#getSssItems()
	 * @see #getVSSSSystemSoftwareObservabilityRequirement()
	 * @generated
	 */
	EReference getVSSSSystemSoftwareObservabilityRequirement_SssItems();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.micobs.svm.sss.VSSSVerificationValidationIntegrationRequirements <em>VSSS Verification Validation Integration Requirements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>VSSS Verification Validation Integration Requirements</em>'.
	 * @see es.uah.aut.srg.micobs.svm.sss.VSSSVerificationValidationIntegrationRequirements
	 * @generated
	 */
	EClass getVSSSVerificationValidationIntegrationRequirements();

	/**
	 * Returns the meta object for the containment reference list '{@link es.uah.aut.srg.micobs.svm.sss.VSSSVerificationValidationIntegrationRequirements#getVerificationValidationProcess <em>Verification Validation Process</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Verification Validation Process</em>'.
	 * @see es.uah.aut.srg.micobs.svm.sss.VSSSVerificationValidationIntegrationRequirements#getVerificationValidationProcess()
	 * @see #getVSSSVerificationValidationIntegrationRequirements()
	 * @generated
	 */
	EReference getVSSSVerificationValidationIntegrationRequirements_VerificationValidationProcess();

	/**
	 * Returns the meta object for the containment reference list '{@link es.uah.aut.srg.micobs.svm.sss.VSSSVerificationValidationIntegrationRequirements#getValidationApproach <em>Validation Approach</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Validation Approach</em>'.
	 * @see es.uah.aut.srg.micobs.svm.sss.VSSSVerificationValidationIntegrationRequirements#getValidationApproach()
	 * @see #getVSSSVerificationValidationIntegrationRequirements()
	 * @generated
	 */
	EReference getVSSSVerificationValidationIntegrationRequirements_ValidationApproach();

	/**
	 * Returns the meta object for the containment reference list '{@link es.uah.aut.srg.micobs.svm.sss.VSSSVerificationValidationIntegrationRequirements#getValidation <em>Validation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Validation</em>'.
	 * @see es.uah.aut.srg.micobs.svm.sss.VSSSVerificationValidationIntegrationRequirements#getValidation()
	 * @see #getVSSSVerificationValidationIntegrationRequirements()
	 * @generated
	 */
	EReference getVSSSVerificationValidationIntegrationRequirements_Validation();

	/**
	 * Returns the meta object for the containment reference list '{@link es.uah.aut.srg.micobs.svm.sss.VSSSVerificationValidationIntegrationRequirements#getVerification <em>Verification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Verification</em>'.
	 * @see es.uah.aut.srg.micobs.svm.sss.VSSSVerificationValidationIntegrationRequirements#getVerification()
	 * @see #getVSSSVerificationValidationIntegrationRequirements()
	 * @generated
	 */
	EReference getVSSSVerificationValidationIntegrationRequirements_Verification();

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
	 * Returns the meta object for the containment reference list '{@link es.uah.aut.srg.micobs.svm.sss.VSSSVerificationValidationProcessRequirement#getSssItems <em>Sss Items</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sss Items</em>'.
	 * @see es.uah.aut.srg.micobs.svm.sss.VSSSVerificationValidationProcessRequirement#getSssItems()
	 * @see #getVSSSVerificationValidationProcessRequirement()
	 * @generated
	 */
	EReference getVSSSVerificationValidationProcessRequirement_SssItems();

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
	 * Returns the meta object for the containment reference list '{@link es.uah.aut.srg.micobs.svm.sss.VSSSValidationApproach#getSssItems <em>Sss Items</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sss Items</em>'.
	 * @see es.uah.aut.srg.micobs.svm.sss.VSSSValidationApproach#getSssItems()
	 * @see #getVSSSValidationApproach()
	 * @generated
	 */
	EReference getVSSSValidationApproach_SssItems();

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
	 * Returns the meta object for the containment reference list '{@link es.uah.aut.srg.micobs.svm.sss.VSSSVerificationRequirement#getSssItems <em>Sss Items</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sss Items</em>'.
	 * @see es.uah.aut.srg.micobs.svm.sss.VSSSVerificationRequirement#getSssItems()
	 * @see #getVSSSVerificationRequirement()
	 * @generated
	 */
	EReference getVSSSVerificationRequirement_SssItems();

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
	 * Returns the meta object for the containment reference list '{@link es.uah.aut.srg.micobs.svm.sss.VSSSValidationRequirement#getSssItems <em>Sss Items</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sss Items</em>'.
	 * @see es.uah.aut.srg.micobs.svm.sss.VSSSValidationRequirement#getSssItems()
	 * @see #getVSSSValidationRequirement()
	 * @generated
	 */
	EReference getVSSSValidationRequirement_SssItems();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.micobs.svm.sss.VSSSDocumentItem <em>VSSS Document Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>VSSS Document Item</em>'.
	 * @see es.uah.aut.srg.micobs.svm.sss.VSSSDocumentItem
	 * @generated
	 */
	EClass getVSSSDocumentItem();

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
	 * Returns the meta object for the containment reference list '{@link es.uah.aut.srg.micobs.svm.sss.VSSSSystemModels#getSystemModels <em>System Models</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>System Models</em>'.
	 * @see es.uah.aut.srg.micobs.svm.sss.VSSSSystemModels#getSystemModels()
	 * @see #getVSSSSystemModels()
	 * @generated
	 */
	EReference getVSSSSystemModels_SystemModels();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.micobs.svm.sss.VSSSSystemModel <em>VSSS System Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>VSSS System Model</em>'.
	 * @see es.uah.aut.srg.micobs.svm.sss.VSSSSystemModel
	 * @generated
	 */
	EClass getVSSSSystemModel();

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
		 * The meta object literal for the '{@link es.uah.aut.srg.micobs.svm.sss.impl.VSSSDocumentImpl <em>VSSS Document</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uah.aut.srg.micobs.svm.sss.impl.VSSSDocumentImpl
		 * @see es.uah.aut.srg.micobs.svm.sss.impl.sssPackageImpl#getVSSSDocument()
		 * @generated
		 */
		EClass VSSS_DOCUMENT = eINSTANCE.getVSSSDocument();

		/**
		 * The meta object literal for the '<em><b>Introduction</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VSSS_DOCUMENT__INTRODUCTION = eINSTANCE.getVSSSDocument_Introduction();

		/**
		 * The meta object literal for the '<em><b>Applicable Documents Section</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VSSS_DOCUMENT__APPLICABLE_DOCUMENTS_SECTION = eINSTANCE.getVSSSDocument_ApplicableDocumentsSection();

		/**
		 * The meta object literal for the '<em><b>Reference Documents Section</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VSSS_DOCUMENT__REFERENCE_DOCUMENTS_SECTION = eINSTANCE.getVSSSDocument_ReferenceDocumentsSection();

		/**
		 * The meta object literal for the '<em><b>Terms Definitions Abbreviations</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VSSS_DOCUMENT__TERMS_DEFINITIONS_ABBREVIATIONS = eINSTANCE.getVSSSDocument_TermsDefinitionsAbbreviations();

		/**
		 * The meta object literal for the '<em><b>General Description</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VSSS_DOCUMENT__GENERAL_DESCRIPTION = eINSTANCE.getVSSSDocument_GeneralDescription();

		/**
		 * The meta object literal for the '<em><b>Specific Requirements</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VSSS_DOCUMENT__SPECIFIC_REQUIREMENTS = eINSTANCE.getVSSSDocument_SpecificRequirements();

		/**
		 * The meta object literal for the '<em><b>Verification Validation Integration</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VSSS_DOCUMENT__VERIFICATION_VALIDATION_INTEGRATION = eINSTANCE.getVSSSDocument_VerificationValidationIntegration();

		/**
		 * The meta object literal for the '<em><b>System Models</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VSSS_DOCUMENT__SYSTEM_MODELS = eINSTANCE.getVSSSDocument_SystemModels();

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
		 * The meta object literal for the '<em><b>Purpose</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VSSS_INTRODUCTION__PURPOSE = eINSTANCE.getVSSSIntroduction_Purpose();

		/**
		 * The meta object literal for the '<em><b>Objetive</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VSSS_INTRODUCTION__OBJETIVE = eINSTANCE.getVSSSIntroduction_Objetive();

		/**
		 * The meta object literal for the '<em><b>Content</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VSSS_INTRODUCTION__CONTENT = eINSTANCE.getVSSSIntroduction_Content();

		/**
		 * The meta object literal for the '<em><b>Reason</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VSSS_INTRODUCTION__REASON = eINSTANCE.getVSSSIntroduction_Reason();

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
		 * The meta object literal for the '<em><b>Applicable Documents</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VSSS_APPLICABLE_DOCUMENTS__APPLICABLE_DOCUMENTS = eINSTANCE.getVSSSApplicableDocuments_ApplicableDocuments();

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
		 * The meta object literal for the '<em><b>Reference Documents</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VSSS_REFERENCE_DOCUMENTS__REFERENCE_DOCUMENTS = eINSTANCE.getVSSSReferenceDocuments_ReferenceDocuments();

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
		 * The meta object literal for the '<em><b>Terms</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VSSS_TERMS_DEFINITIONS_ABBREVIATIONS__TERMS = eINSTANCE.getVSSSTermsDefinitionsAbbreviations_Terms();

		/**
		 * The meta object literal for the '<em><b>Definitions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VSSS_TERMS_DEFINITIONS_ABBREVIATIONS__DEFINITIONS = eINSTANCE.getVSSSTermsDefinitionsAbbreviations_Definitions();

		/**
		 * The meta object literal for the '<em><b>Abbreviations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VSSS_TERMS_DEFINITIONS_ABBREVIATIONS__ABBREVIATIONS = eINSTANCE.getVSSSTermsDefinitionsAbbreviations_Abbreviations();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.micobs.svm.sss.impl.VSSSBriefDescriptionImpl <em>VSSS Brief Description</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uah.aut.srg.micobs.svm.sss.impl.VSSSBriefDescriptionImpl
		 * @see es.uah.aut.srg.micobs.svm.sss.impl.sssPackageImpl#getVSSSBriefDescription()
		 * @generated
		 */
		EClass VSSS_BRIEF_DESCRIPTION = eINSTANCE.getVSSSBriefDescription();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VSSS_BRIEF_DESCRIPTION__NAME = eINSTANCE.getVSSSBriefDescription_Name();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VSSS_BRIEF_DESCRIPTION__DESCRIPTION = eINSTANCE.getVSSSBriefDescription_Description();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.micobs.svm.sss.impl.VSSSTermImpl <em>VSSS Term</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uah.aut.srg.micobs.svm.sss.impl.VSSSTermImpl
		 * @see es.uah.aut.srg.micobs.svm.sss.impl.sssPackageImpl#getVSSSTerm()
		 * @generated
		 */
		EClass VSSS_TERM = eINSTANCE.getVSSSTerm();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.micobs.svm.sss.impl.VSSSDefinitionImpl <em>VSSS Definition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uah.aut.srg.micobs.svm.sss.impl.VSSSDefinitionImpl
		 * @see es.uah.aut.srg.micobs.svm.sss.impl.sssPackageImpl#getVSSSDefinition()
		 * @generated
		 */
		EClass VSSS_DEFINITION = eINSTANCE.getVSSSDefinition();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.micobs.svm.sss.impl.VSSSAbbreviationImpl <em>VSSS Abbreviation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uah.aut.srg.micobs.svm.sss.impl.VSSSAbbreviationImpl
		 * @see es.uah.aut.srg.micobs.svm.sss.impl.sssPackageImpl#getVSSSAbbreviation()
		 * @generated
		 */
		EClass VSSS_ABBREVIATION = eINSTANCE.getVSSSAbbreviation();

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
		 * The meta object literal for the '<em><b>Product Perspective</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VSSS_GENERAL_DESCRIPTION__PRODUCT_PERSPECTIVE = eINSTANCE.getVSSSGeneralDescription_ProductPerspective();

		/**
		 * The meta object literal for the '<em><b>General Capabilites</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VSSS_GENERAL_DESCRIPTION__GENERAL_CAPABILITES = eINSTANCE.getVSSSGeneralDescription_GeneralCapabilites();

		/**
		 * The meta object literal for the '<em><b>General Constraints</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VSSS_GENERAL_DESCRIPTION__GENERAL_CONSTRAINTS = eINSTANCE.getVSSSGeneralDescription_GeneralConstraints();

		/**
		 * The meta object literal for the '<em><b>Operational Environment</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VSSS_GENERAL_DESCRIPTION__OPERATIONAL_ENVIRONMENT = eINSTANCE.getVSSSGeneralDescription_OperationalEnvironment();

		/**
		 * The meta object literal for the '<em><b>Assumptions Dependencies</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VSSS_GENERAL_DESCRIPTION__ASSUMPTIONS_DEPENDENCIES = eINSTANCE.getVSSSGeneralDescription_AssumptionsDependencies();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.micobs.svm.sss.impl.VSSSProductPerspectiveImpl <em>VSSS Product Perspective</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uah.aut.srg.micobs.svm.sss.impl.VSSSProductPerspectiveImpl
		 * @see es.uah.aut.srg.micobs.svm.sss.impl.sssPackageImpl#getVSSSProductPerspective()
		 * @generated
		 */
		EClass VSSS_PRODUCT_PERSPECTIVE = eINSTANCE.getVSSSProductPerspective();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.micobs.svm.sss.impl.VSSSGeneralCapabilitesImpl <em>VSSS General Capabilites</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uah.aut.srg.micobs.svm.sss.impl.VSSSGeneralCapabilitesImpl
		 * @see es.uah.aut.srg.micobs.svm.sss.impl.sssPackageImpl#getVSSSGeneralCapabilites()
		 * @generated
		 */
		EClass VSSS_GENERAL_CAPABILITES = eINSTANCE.getVSSSGeneralCapabilites();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.micobs.svm.sss.impl.VSSSGeneralConstraintsImpl <em>VSSS General Constraints</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uah.aut.srg.micobs.svm.sss.impl.VSSSGeneralConstraintsImpl
		 * @see es.uah.aut.srg.micobs.svm.sss.impl.sssPackageImpl#getVSSSGeneralConstraints()
		 * @generated
		 */
		EClass VSSS_GENERAL_CONSTRAINTS = eINSTANCE.getVSSSGeneralConstraints();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.micobs.svm.sss.impl.VSSSOperationalEnvironmentImpl <em>VSSS Operational Environment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uah.aut.srg.micobs.svm.sss.impl.VSSSOperationalEnvironmentImpl
		 * @see es.uah.aut.srg.micobs.svm.sss.impl.sssPackageImpl#getVSSSOperationalEnvironment()
		 * @generated
		 */
		EClass VSSS_OPERATIONAL_ENVIRONMENT = eINSTANCE.getVSSSOperationalEnvironment();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.micobs.svm.sss.impl.VSSSAssumptionsDependenciesImpl <em>VSSS Assumptions Dependencies</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uah.aut.srg.micobs.svm.sss.impl.VSSSAssumptionsDependenciesImpl
		 * @see es.uah.aut.srg.micobs.svm.sss.impl.sssPackageImpl#getVSSSAssumptionsDependencies()
		 * @generated
		 */
		EClass VSSS_ASSUMPTIONS_DEPENDENCIES = eINSTANCE.getVSSSAssumptionsDependencies();

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
		 * The meta object literal for the '<em><b>General</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VSSS_SPECIFIC_REQUIREMENTS__GENERAL = eINSTANCE.getVSSSSpecificRequirements_General();

		/**
		 * The meta object literal for the '<em><b>Capabilities</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VSSS_SPECIFIC_REQUIREMENTS__CAPABILITIES = eINSTANCE.getVSSSSpecificRequirements_Capabilities();

		/**
		 * The meta object literal for the '<em><b>System Interface</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VSSS_SPECIFIC_REQUIREMENTS__SYSTEM_INTERFACE = eINSTANCE.getVSSSSpecificRequirements_SystemInterface();

		/**
		 * The meta object literal for the '<em><b>Adaptation Missionization</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VSSS_SPECIFIC_REQUIREMENTS__ADAPTATION_MISSIONIZATION = eINSTANCE.getVSSSSpecificRequirements_AdaptationMissionization();

		/**
		 * The meta object literal for the '<em><b>Computer Resource</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VSSS_SPECIFIC_REQUIREMENTS__COMPUTER_RESOURCE = eINSTANCE.getVSSSSpecificRequirements_ComputerResource();

		/**
		 * The meta object literal for the '<em><b>Security</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VSSS_SPECIFIC_REQUIREMENTS__SECURITY = eINSTANCE.getVSSSSpecificRequirements_Security();

		/**
		 * The meta object literal for the '<em><b>Safety</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VSSS_SPECIFIC_REQUIREMENTS__SAFETY = eINSTANCE.getVSSSSpecificRequirements_Safety();

		/**
		 * The meta object literal for the '<em><b>Reliabilty Availability</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VSSS_SPECIFIC_REQUIREMENTS__RELIABILTY_AVAILABILITY = eINSTANCE.getVSSSSpecificRequirements_ReliabiltyAvailability();

		/**
		 * The meta object literal for the '<em><b>Quality</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VSSS_SPECIFIC_REQUIREMENTS__QUALITY = eINSTANCE.getVSSSSpecificRequirements_Quality();

		/**
		 * The meta object literal for the '<em><b>Design</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VSSS_SPECIFIC_REQUIREMENTS__DESIGN = eINSTANCE.getVSSSSpecificRequirements_Design();

		/**
		 * The meta object literal for the '<em><b>Software Operations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VSSS_SPECIFIC_REQUIREMENTS__SOFTWARE_OPERATIONS = eINSTANCE.getVSSSSpecificRequirements_SoftwareOperations();

		/**
		 * The meta object literal for the '<em><b>Software Maintenance</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VSSS_SPECIFIC_REQUIREMENTS__SOFTWARE_MAINTENANCE = eINSTANCE.getVSSSSpecificRequirements_SoftwareMaintenance();

		/**
		 * The meta object literal for the '<em><b>System Software Observability</b></em>' containment reference list feature.
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
		 * The meta object literal for the '<em><b>Sss Items</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VSSS_GENERAL_REQUIREMENT__SSS_ITEMS = eINSTANCE.getVSSSGeneralRequirement_SssItems();

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
		 * The meta object literal for the '<em><b>Sss Items</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VSSS_CAPABILITIES_REQUIREMENT__SSS_ITEMS = eINSTANCE.getVSSSCapabilitiesRequirement_SssItems();

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
		 * The meta object literal for the '<em><b>Sss Items</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VSSS_SYSTEM_INTERFACE_REQUIREMENT__SSS_ITEMS = eINSTANCE.getVSSSSystemInterfaceRequirement_SssItems();

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
		 * The meta object literal for the '<em><b>Sss Items</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VSSS_ADAPTATION_MISSIONIZATION_REQUIREMENT__SSS_ITEMS = eINSTANCE.getVSSSAdaptationMissionizationRequirement_SssItems();

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
		 * The meta object literal for the '<em><b>Sss Items</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VSSS_COMPUTER_RESOURCE_REQUIREMENT__SSS_ITEMS = eINSTANCE.getVSSSComputerResourceRequirement_SssItems();

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
		 * The meta object literal for the '<em><b>Sss Items</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VSSS_SECURITY_REQUIREMENT__SSS_ITEMS = eINSTANCE.getVSSSSecurityRequirement_SssItems();

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
		 * The meta object literal for the '<em><b>Sss Items</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VSSS_SAFETY_REQUIREMENT__SSS_ITEMS = eINSTANCE.getVSSSSafetyRequirement_SssItems();

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
		 * The meta object literal for the '<em><b>Sss Items</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VSSS_RELIABILTY_AVAILABILITY_REQUIREMENT__SSS_ITEMS = eINSTANCE.getVSSSReliabiltyAvailabilityRequirement_SssItems();

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
		 * The meta object literal for the '<em><b>Sss Items</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VSSS_QUALITY_REQUIREMENT__SSS_ITEMS = eINSTANCE.getVSSSQualityRequirement_SssItems();

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
		 * The meta object literal for the '<em><b>Sss Items</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VSSS_DESIGN_REQUIREMENT__SSS_ITEMS = eINSTANCE.getVSSSDesignRequirement_SssItems();

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
		 * The meta object literal for the '<em><b>Sss Items</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VSSS_SOFTWARE_OPERATIONS_REQUIREMENT__SSS_ITEMS = eINSTANCE.getVSSSSoftwareOperationsRequirement_SssItems();

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
		 * The meta object literal for the '<em><b>Sss Items</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VSSS_SOFTWARE_MAINTENANCE_REQUIREMENT__SSS_ITEMS = eINSTANCE.getVSSSSoftwareMaintenanceRequirement_SssItems();

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
		 * The meta object literal for the '<em><b>Sss Items</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VSSS_SYSTEM_SOFTWARE_OBSERVABILITY_REQUIREMENT__SSS_ITEMS = eINSTANCE.getVSSSSystemSoftwareObservabilityRequirement_SssItems();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.micobs.svm.sss.impl.VSSSVerificationValidationIntegrationRequirementsImpl <em>VSSS Verification Validation Integration Requirements</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uah.aut.srg.micobs.svm.sss.impl.VSSSVerificationValidationIntegrationRequirementsImpl
		 * @see es.uah.aut.srg.micobs.svm.sss.impl.sssPackageImpl#getVSSSVerificationValidationIntegrationRequirements()
		 * @generated
		 */
		EClass VSSS_VERIFICATION_VALIDATION_INTEGRATION_REQUIREMENTS = eINSTANCE.getVSSSVerificationValidationIntegrationRequirements();

		/**
		 * The meta object literal for the '<em><b>Verification Validation Process</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VSSS_VERIFICATION_VALIDATION_INTEGRATION_REQUIREMENTS__VERIFICATION_VALIDATION_PROCESS = eINSTANCE.getVSSSVerificationValidationIntegrationRequirements_VerificationValidationProcess();

		/**
		 * The meta object literal for the '<em><b>Validation Approach</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VSSS_VERIFICATION_VALIDATION_INTEGRATION_REQUIREMENTS__VALIDATION_APPROACH = eINSTANCE.getVSSSVerificationValidationIntegrationRequirements_ValidationApproach();

		/**
		 * The meta object literal for the '<em><b>Validation</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VSSS_VERIFICATION_VALIDATION_INTEGRATION_REQUIREMENTS__VALIDATION = eINSTANCE.getVSSSVerificationValidationIntegrationRequirements_Validation();

		/**
		 * The meta object literal for the '<em><b>Verification</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VSSS_VERIFICATION_VALIDATION_INTEGRATION_REQUIREMENTS__VERIFICATION = eINSTANCE.getVSSSVerificationValidationIntegrationRequirements_Verification();

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
		 * The meta object literal for the '<em><b>Sss Items</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VSSS_VERIFICATION_VALIDATION_PROCESS_REQUIREMENT__SSS_ITEMS = eINSTANCE.getVSSSVerificationValidationProcessRequirement_SssItems();

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
		 * The meta object literal for the '<em><b>Sss Items</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VSSS_VALIDATION_APPROACH__SSS_ITEMS = eINSTANCE.getVSSSValidationApproach_SssItems();

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
		 * The meta object literal for the '<em><b>Sss Items</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VSSS_VERIFICATION_REQUIREMENT__SSS_ITEMS = eINSTANCE.getVSSSVerificationRequirement_SssItems();

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
		 * The meta object literal for the '<em><b>Sss Items</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VSSS_VALIDATION_REQUIREMENT__SSS_ITEMS = eINSTANCE.getVSSSValidationRequirement_SssItems();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.micobs.svm.sss.impl.VSSSDocumentItemImpl <em>VSSS Document Item</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uah.aut.srg.micobs.svm.sss.impl.VSSSDocumentItemImpl
		 * @see es.uah.aut.srg.micobs.svm.sss.impl.sssPackageImpl#getVSSSDocumentItem()
		 * @generated
		 */
		EClass VSSS_DOCUMENT_ITEM = eINSTANCE.getVSSSDocumentItem();

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
		 * The meta object literal for the '<em><b>System Models</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VSSS_SYSTEM_MODELS__SYSTEM_MODELS = eINSTANCE.getVSSSSystemModels_SystemModels();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.micobs.svm.sss.impl.VSSSSystemModelImpl <em>VSSS System Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uah.aut.srg.micobs.svm.sss.impl.VSSSSystemModelImpl
		 * @see es.uah.aut.srg.micobs.svm.sss.impl.sssPackageImpl#getVSSSSystemModel()
		 * @generated
		 */
		EClass VSSS_SYSTEM_MODEL = eINSTANCE.getVSSSSystemModel();

	}

} //sssPackage
