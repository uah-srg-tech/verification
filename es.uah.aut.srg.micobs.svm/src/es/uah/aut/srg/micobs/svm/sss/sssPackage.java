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
	String eNS_PREFIX = "micobs.svm";

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
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSSS_DOCUMENT__NAME = tdmPackage.VTRACEABLE_DOCUMENT__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSSS_DOCUMENT__ID = tdmPackage.VTRACEABLE_DOCUMENT__ID;

	/**
	 * The feature id for the '<em><b>Issue</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSSS_DOCUMENT__ISSUE = tdmPackage.VTRACEABLE_DOCUMENT__ISSUE;

	/**
	 * The feature id for the '<em><b>Revision</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSSS_DOCUMENT__REVISION = tdmPackage.VTRACEABLE_DOCUMENT__REVISION;

	/**
	 * The feature id for the '<em><b>Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSSS_DOCUMENT__DATE = tdmPackage.VTRACEABLE_DOCUMENT__DATE;

	/**
	 * The feature id for the '<em><b>Parents</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSSS_DOCUMENT__PARENTS = tdmPackage.VTRACEABLE_DOCUMENT__PARENTS;

	/**
	 * The feature id for the '<em><b>Groups</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSSS_DOCUMENT__GROUPS = tdmPackage.VTRACEABLE_DOCUMENT__GROUPS;

	/**
	 * The feature id for the '<em><b>Applicable Documents</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSSS_DOCUMENT__APPLICABLE_DOCUMENTS = tdmPackage.VTRACEABLE_DOCUMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Reference Documents</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSSS_DOCUMENT__REFERENCE_DOCUMENTS = tdmPackage.VTRACEABLE_DOCUMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Figures</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSSS_DOCUMENT__FIGURES = tdmPackage.VTRACEABLE_DOCUMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Tables</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSSS_DOCUMENT__TABLES = tdmPackage.VTRACEABLE_DOCUMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Sections</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSSS_DOCUMENT__SECTIONS = tdmPackage.VTRACEABLE_DOCUMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Introduction Section</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSSS_DOCUMENT__INTRODUCTION_SECTION = tdmPackage.VTRACEABLE_DOCUMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Applicable Documents Section</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSSS_DOCUMENT__APPLICABLE_DOCUMENTS_SECTION = tdmPackage.VTRACEABLE_DOCUMENT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Reference Documents Section</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSSS_DOCUMENT__REFERENCE_DOCUMENTS_SECTION = tdmPackage.VTRACEABLE_DOCUMENT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Terms Definitions Abbreviations Section</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSSS_DOCUMENT__TERMS_DEFINITIONS_ABBREVIATIONS_SECTION = tdmPackage.VTRACEABLE_DOCUMENT_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>General Description Section</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSSS_DOCUMENT__GENERAL_DESCRIPTION_SECTION = tdmPackage.VTRACEABLE_DOCUMENT_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Specific Requirements Section</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSSS_DOCUMENT__SPECIFIC_REQUIREMENTS_SECTION = tdmPackage.VTRACEABLE_DOCUMENT_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Verification Validation Integration Section</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSSS_DOCUMENT__VERIFICATION_VALIDATION_INTEGRATION_SECTION = tdmPackage.VTRACEABLE_DOCUMENT_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>System Models Section</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSSS_DOCUMENT__SYSTEM_MODELS_SECTION = tdmPackage.VTRACEABLE_DOCUMENT_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Sss Figures</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSSS_DOCUMENT__SSS_FIGURES = tdmPackage.VTRACEABLE_DOCUMENT_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>Sss Tables</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSSS_DOCUMENT__SSS_TABLES = tdmPackage.VTRACEABLE_DOCUMENT_FEATURE_COUNT + 14;

	/**
	 * The number of structural features of the '<em>VSSS Document</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSSS_DOCUMENT_FEATURE_COUNT = tdmPackage.VTRACEABLE_DOCUMENT_FEATURE_COUNT + 15;

	/**
	 * The number of operations of the '<em>VSSS Document</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSSS_DOCUMENT_OPERATION_COUNT = tdmPackage.VTRACEABLE_DOCUMENT_OPERATION_COUNT + 0;

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
	 * The feature id for the '<em><b>Sss Instatiable Subsections</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSSS_INTRODUCTION__SSS_INSTATIABLE_SUBSECTIONS = docPackage.DFIXED_SECTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>VSSS Introduction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSSS_INTRODUCTION_FEATURE_COUNT = docPackage.DFIXED_SECTION_FEATURE_COUNT + 1;

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
	 * The meta object id for the '{@link es.uah.aut.srg.micobs.svm.sss.impl.VSSSAbstractBriefDescriptionImpl <em>VSSS Abstract Brief Description</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uah.aut.srg.micobs.svm.sss.impl.VSSSAbstractBriefDescriptionImpl
	 * @see es.uah.aut.srg.micobs.svm.sss.impl.sssPackageImpl#getVSSSAbstractBriefDescription()
	 * @generated
	 */
	int VSSS_ABSTRACT_BRIEF_DESCRIPTION = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSSS_ABSTRACT_BRIEF_DESCRIPTION__NAME = 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSSS_ABSTRACT_BRIEF_DESCRIPTION__DESCRIPTION = 1;

	/**
	 * The number of structural features of the '<em>VSSS Abstract Brief Description</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSSS_ABSTRACT_BRIEF_DESCRIPTION_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>VSSS Abstract Brief Description</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSSS_ABSTRACT_BRIEF_DESCRIPTION_OPERATION_COUNT = 0;

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
	int VSSS_TERM__NAME = VSSS_ABSTRACT_BRIEF_DESCRIPTION__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSSS_TERM__DESCRIPTION = VSSS_ABSTRACT_BRIEF_DESCRIPTION__DESCRIPTION;

	/**
	 * The number of structural features of the '<em>VSSS Term</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSSS_TERM_FEATURE_COUNT = VSSS_ABSTRACT_BRIEF_DESCRIPTION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>VSSS Term</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSSS_TERM_OPERATION_COUNT = VSSS_ABSTRACT_BRIEF_DESCRIPTION_OPERATION_COUNT + 0;

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
	int VSSS_DEFINITION__NAME = VSSS_ABSTRACT_BRIEF_DESCRIPTION__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSSS_DEFINITION__DESCRIPTION = VSSS_ABSTRACT_BRIEF_DESCRIPTION__DESCRIPTION;

	/**
	 * The number of structural features of the '<em>VSSS Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSSS_DEFINITION_FEATURE_COUNT = VSSS_ABSTRACT_BRIEF_DESCRIPTION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>VSSS Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSSS_DEFINITION_OPERATION_COUNT = VSSS_ABSTRACT_BRIEF_DESCRIPTION_OPERATION_COUNT + 0;

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
	int VSSS_ABBREVIATION__NAME = VSSS_ABSTRACT_BRIEF_DESCRIPTION__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSSS_ABBREVIATION__DESCRIPTION = VSSS_ABSTRACT_BRIEF_DESCRIPTION__DESCRIPTION;

	/**
	 * The number of structural features of the '<em>VSSS Abbreviation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSSS_ABBREVIATION_FEATURE_COUNT = VSSS_ABSTRACT_BRIEF_DESCRIPTION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>VSSS Abbreviation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSSS_ABBREVIATION_OPERATION_COUNT = VSSS_ABSTRACT_BRIEF_DESCRIPTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.micobs.svm.sss.impl.VSSSFixedSectionImpl <em>VSSS Fixed Section</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uah.aut.srg.micobs.svm.sss.impl.VSSSFixedSectionImpl
	 * @see es.uah.aut.srg.micobs.svm.sss.impl.sssPackageImpl#getVSSSFixedSection()
	 * @generated
	 */
	int VSSS_FIXED_SECTION = 9;

	/**
	 * The feature id for the '<em><b>Subsections</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSSS_FIXED_SECTION__SUBSECTIONS = docPackage.DFIXED_SECTION__SUBSECTIONS;

	/**
	 * The feature id for the '<em><b>Body</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSSS_FIXED_SECTION__BODY = docPackage.DFIXED_SECTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Sss Instatiable Subsections</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSSS_FIXED_SECTION__SSS_INSTATIABLE_SUBSECTIONS = docPackage.DFIXED_SECTION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>VSSS Fixed Section</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSSS_FIXED_SECTION_FEATURE_COUNT = docPackage.DFIXED_SECTION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>VSSS Fixed Section</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSSS_FIXED_SECTION_OPERATION_COUNT = docPackage.DFIXED_SECTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.micobs.svm.sss.impl.VSSSInstantiableSectionImpl <em>VSSS Instantiable Section</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uah.aut.srg.micobs.svm.sss.impl.VSSSInstantiableSectionImpl
	 * @see es.uah.aut.srg.micobs.svm.sss.impl.sssPackageImpl#getVSSSInstantiableSection()
	 * @generated
	 */
	int VSSS_INSTANTIABLE_SECTION = 10;

	/**
	 * The feature id for the '<em><b>Subsections</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSSS_INSTANTIABLE_SECTION__SUBSECTIONS = docPackage.DINSTANTIABLE_SECTION__SUBSECTIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSSS_INSTANTIABLE_SECTION__NAME = docPackage.DINSTANTIABLE_SECTION__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSSS_INSTANTIABLE_SECTION__DESCRIPTION = docPackage.DINSTANTIABLE_SECTION__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Body</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSSS_INSTANTIABLE_SECTION__BODY = docPackage.DINSTANTIABLE_SECTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Sss Instatiable Subsections</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSSS_INSTANTIABLE_SECTION__SSS_INSTATIABLE_SUBSECTIONS = docPackage.DINSTANTIABLE_SECTION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>VSSS Instantiable Section</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSSS_INSTANTIABLE_SECTION_FEATURE_COUNT = docPackage.DINSTANTIABLE_SECTION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>VSSS Instantiable Section</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSSS_INSTANTIABLE_SECTION_OPERATION_COUNT = docPackage.DINSTANTIABLE_SECTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.micobs.svm.sss.impl.VSSSGeneralDescriptionImpl <em>VSSS General Description</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uah.aut.srg.micobs.svm.sss.impl.VSSSGeneralDescriptionImpl
	 * @see es.uah.aut.srg.micobs.svm.sss.impl.sssPackageImpl#getVSSSGeneralDescription()
	 * @generated
	 */
	int VSSS_GENERAL_DESCRIPTION = 11;

	/**
	 * The feature id for the '<em><b>Subsections</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSSS_GENERAL_DESCRIPTION__SUBSECTIONS = docPackage.DFIXED_SECTION__SUBSECTIONS;

	/**
	 * The feature id for the '<em><b>Product Perspective</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSSS_GENERAL_DESCRIPTION__PRODUCT_PERSPECTIVE = docPackage.DFIXED_SECTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>General Capabilities</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSSS_GENERAL_DESCRIPTION__GENERAL_CAPABILITIES = docPackage.DFIXED_SECTION_FEATURE_COUNT + 1;

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
	 * The meta object id for the '{@link es.uah.aut.srg.micobs.svm.sss.impl.VSSSAbstractRequirementSectionImpl <em>VSSS Abstract Requirement Section</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uah.aut.srg.micobs.svm.sss.impl.VSSSAbstractRequirementSectionImpl
	 * @see es.uah.aut.srg.micobs.svm.sss.impl.sssPackageImpl#getVSSSAbstractRequirementSection()
	 * @generated
	 */
	int VSSS_ABSTRACT_REQUIREMENT_SECTION = 12;

	/**
	 * The feature id for the '<em><b>Items</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSSS_ABSTRACT_REQUIREMENT_SECTION__ITEMS = tdmPackage.VTRACEABLE_DOCUMENT_ABSTRACT_GROUP__ITEMS;

	/**
	 * The feature id for the '<em><b>Subsections</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSSS_ABSTRACT_REQUIREMENT_SECTION__SUBSECTIONS = tdmPackage.VTRACEABLE_DOCUMENT_ABSTRACT_GROUP_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Section Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSSS_ABSTRACT_REQUIREMENT_SECTION__SECTION_DESCRIPTION = tdmPackage.VTRACEABLE_DOCUMENT_ABSTRACT_GROUP_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Sss Items</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSSS_ABSTRACT_REQUIREMENT_SECTION__SSS_ITEMS = tdmPackage.VTRACEABLE_DOCUMENT_ABSTRACT_GROUP_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Sss Requirement Subsections</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSSS_ABSTRACT_REQUIREMENT_SECTION__SSS_REQUIREMENT_SUBSECTIONS = tdmPackage.VTRACEABLE_DOCUMENT_ABSTRACT_GROUP_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>VSSS Abstract Requirement Section</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSSS_ABSTRACT_REQUIREMENT_SECTION_FEATURE_COUNT = tdmPackage.VTRACEABLE_DOCUMENT_ABSTRACT_GROUP_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>VSSS Abstract Requirement Section</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSSS_ABSTRACT_REQUIREMENT_SECTION_OPERATION_COUNT = tdmPackage.VTRACEABLE_DOCUMENT_ABSTRACT_GROUP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.micobs.svm.sss.impl.VSSSSpecificRequirementsImpl <em>VSSS Specific Requirements</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uah.aut.srg.micobs.svm.sss.impl.VSSSSpecificRequirementsImpl
	 * @see es.uah.aut.srg.micobs.svm.sss.impl.sssPackageImpl#getVSSSSpecificRequirements()
	 * @generated
	 */
	int VSSS_SPECIFIC_REQUIREMENTS = 14;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.micobs.svm.sss.impl.VSSSInstantiableRequirementSectionImpl <em>VSSS Instantiable Requirement Section</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uah.aut.srg.micobs.svm.sss.impl.VSSSInstantiableRequirementSectionImpl
	 * @see es.uah.aut.srg.micobs.svm.sss.impl.sssPackageImpl#getVSSSInstantiableRequirementSection()
	 * @generated
	 */
	int VSSS_INSTANTIABLE_REQUIREMENT_SECTION = 13;

	/**
	 * The feature id for the '<em><b>Subsections</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSSS_INSTANTIABLE_REQUIREMENT_SECTION__SUBSECTIONS = docPackage.DINSTANTIABLE_SECTION__SUBSECTIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSSS_INSTANTIABLE_REQUIREMENT_SECTION__NAME = docPackage.DINSTANTIABLE_SECTION__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSSS_INSTANTIABLE_REQUIREMENT_SECTION__DESCRIPTION = docPackage.DINSTANTIABLE_SECTION__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Section Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSSS_INSTANTIABLE_REQUIREMENT_SECTION__SECTION_DESCRIPTION = docPackage.DINSTANTIABLE_SECTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Sss Items</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSSS_INSTANTIABLE_REQUIREMENT_SECTION__SSS_ITEMS = docPackage.DINSTANTIABLE_SECTION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>VSSS Instantiable Requirement Section</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSSS_INSTANTIABLE_REQUIREMENT_SECTION_FEATURE_COUNT = docPackage.DINSTANTIABLE_SECTION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>VSSS Instantiable Requirement Section</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSSS_INSTANTIABLE_REQUIREMENT_SECTION_OPERATION_COUNT = docPackage.DINSTANTIABLE_SECTION_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Subsections</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSSS_SPECIFIC_REQUIREMENTS__SUBSECTIONS = docPackage.DFIXED_SECTION__SUBSECTIONS;

	/**
	 * The feature id for the '<em><b>Section Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSSS_SPECIFIC_REQUIREMENTS__SECTION_DESCRIPTION = docPackage.DFIXED_SECTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>General</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSSS_SPECIFIC_REQUIREMENTS__GENERAL = docPackage.DFIXED_SECTION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Capabilities</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSSS_SPECIFIC_REQUIREMENTS__CAPABILITIES = docPackage.DFIXED_SECTION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>System Interface</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSSS_SPECIFIC_REQUIREMENTS__SYSTEM_INTERFACE = docPackage.DFIXED_SECTION_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Adaptation Missionization</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSSS_SPECIFIC_REQUIREMENTS__ADAPTATION_MISSIONIZATION = docPackage.DFIXED_SECTION_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Computer Resource</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSSS_SPECIFIC_REQUIREMENTS__COMPUTER_RESOURCE = docPackage.DFIXED_SECTION_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Security</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSSS_SPECIFIC_REQUIREMENTS__SECURITY = docPackage.DFIXED_SECTION_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Safety</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSSS_SPECIFIC_REQUIREMENTS__SAFETY = docPackage.DFIXED_SECTION_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Reliabilty Availability</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSSS_SPECIFIC_REQUIREMENTS__RELIABILTY_AVAILABILITY = docPackage.DFIXED_SECTION_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Quality</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSSS_SPECIFIC_REQUIREMENTS__QUALITY = docPackage.DFIXED_SECTION_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Design</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSSS_SPECIFIC_REQUIREMENTS__DESIGN = docPackage.DFIXED_SECTION_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Software Operations</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSSS_SPECIFIC_REQUIREMENTS__SOFTWARE_OPERATIONS = docPackage.DFIXED_SECTION_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Software Maintenance</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSSS_SPECIFIC_REQUIREMENTS__SOFTWARE_MAINTENANCE = docPackage.DFIXED_SECTION_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>System Software Observability</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSSS_SPECIFIC_REQUIREMENTS__SYSTEM_SOFTWARE_OBSERVABILITY = docPackage.DFIXED_SECTION_FEATURE_COUNT + 13;

	/**
	 * The number of structural features of the '<em>VSSS Specific Requirements</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSSS_SPECIFIC_REQUIREMENTS_FEATURE_COUNT = docPackage.DFIXED_SECTION_FEATURE_COUNT + 14;

	/**
	 * The number of operations of the '<em>VSSS Specific Requirements</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSSS_SPECIFIC_REQUIREMENTS_OPERATION_COUNT = docPackage.DFIXED_SECTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.micobs.svm.sss.impl.VSSSGeneralRequirementsImpl <em>VSSS General Requirements</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uah.aut.srg.micobs.svm.sss.impl.VSSSGeneralRequirementsImpl
	 * @see es.uah.aut.srg.micobs.svm.sss.impl.sssPackageImpl#getVSSSGeneralRequirements()
	 * @generated
	 */
	int VSSS_GENERAL_REQUIREMENTS = 15;

	/**
	 * The feature id for the '<em><b>Items</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSSS_GENERAL_REQUIREMENTS__ITEMS = VSSS_ABSTRACT_REQUIREMENT_SECTION__ITEMS;

	/**
	 * The feature id for the '<em><b>Subsections</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSSS_GENERAL_REQUIREMENTS__SUBSECTIONS = VSSS_ABSTRACT_REQUIREMENT_SECTION__SUBSECTIONS;

	/**
	 * The feature id for the '<em><b>Section Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSSS_GENERAL_REQUIREMENTS__SECTION_DESCRIPTION = VSSS_ABSTRACT_REQUIREMENT_SECTION__SECTION_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Sss Items</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSSS_GENERAL_REQUIREMENTS__SSS_ITEMS = VSSS_ABSTRACT_REQUIREMENT_SECTION__SSS_ITEMS;

	/**
	 * The feature id for the '<em><b>Sss Requirement Subsections</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSSS_GENERAL_REQUIREMENTS__SSS_REQUIREMENT_SUBSECTIONS = VSSS_ABSTRACT_REQUIREMENT_SECTION__SSS_REQUIREMENT_SUBSECTIONS;

	/**
	 * The number of structural features of the '<em>VSSS General Requirements</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSSS_GENERAL_REQUIREMENTS_FEATURE_COUNT = VSSS_ABSTRACT_REQUIREMENT_SECTION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>VSSS General Requirements</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSSS_GENERAL_REQUIREMENTS_OPERATION_COUNT = VSSS_ABSTRACT_REQUIREMENT_SECTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.micobs.svm.sss.impl.VSSSCapabilitiesRequirementsImpl <em>VSSS Capabilities Requirements</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uah.aut.srg.micobs.svm.sss.impl.VSSSCapabilitiesRequirementsImpl
	 * @see es.uah.aut.srg.micobs.svm.sss.impl.sssPackageImpl#getVSSSCapabilitiesRequirements()
	 * @generated
	 */
	int VSSS_CAPABILITIES_REQUIREMENTS = 16;

	/**
	 * The feature id for the '<em><b>Items</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSSS_CAPABILITIES_REQUIREMENTS__ITEMS = VSSS_ABSTRACT_REQUIREMENT_SECTION__ITEMS;

	/**
	 * The feature id for the '<em><b>Subsections</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSSS_CAPABILITIES_REQUIREMENTS__SUBSECTIONS = VSSS_ABSTRACT_REQUIREMENT_SECTION__SUBSECTIONS;

	/**
	 * The feature id for the '<em><b>Section Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSSS_CAPABILITIES_REQUIREMENTS__SECTION_DESCRIPTION = VSSS_ABSTRACT_REQUIREMENT_SECTION__SECTION_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Sss Items</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSSS_CAPABILITIES_REQUIREMENTS__SSS_ITEMS = VSSS_ABSTRACT_REQUIREMENT_SECTION__SSS_ITEMS;

	/**
	 * The feature id for the '<em><b>Sss Requirement Subsections</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSSS_CAPABILITIES_REQUIREMENTS__SSS_REQUIREMENT_SUBSECTIONS = VSSS_ABSTRACT_REQUIREMENT_SECTION__SSS_REQUIREMENT_SUBSECTIONS;

	/**
	 * The number of structural features of the '<em>VSSS Capabilities Requirements</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSSS_CAPABILITIES_REQUIREMENTS_FEATURE_COUNT = VSSS_ABSTRACT_REQUIREMENT_SECTION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>VSSS Capabilities Requirements</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSSS_CAPABILITIES_REQUIREMENTS_OPERATION_COUNT = VSSS_ABSTRACT_REQUIREMENT_SECTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.micobs.svm.sss.impl.VSSSSystemInterfaceRequirementsImpl <em>VSSS System Interface Requirements</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uah.aut.srg.micobs.svm.sss.impl.VSSSSystemInterfaceRequirementsImpl
	 * @see es.uah.aut.srg.micobs.svm.sss.impl.sssPackageImpl#getVSSSSystemInterfaceRequirements()
	 * @generated
	 */
	int VSSS_SYSTEM_INTERFACE_REQUIREMENTS = 17;

	/**
	 * The feature id for the '<em><b>Items</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSSS_SYSTEM_INTERFACE_REQUIREMENTS__ITEMS = VSSS_ABSTRACT_REQUIREMENT_SECTION__ITEMS;

	/**
	 * The feature id for the '<em><b>Subsections</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSSS_SYSTEM_INTERFACE_REQUIREMENTS__SUBSECTIONS = VSSS_ABSTRACT_REQUIREMENT_SECTION__SUBSECTIONS;

	/**
	 * The feature id for the '<em><b>Section Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSSS_SYSTEM_INTERFACE_REQUIREMENTS__SECTION_DESCRIPTION = VSSS_ABSTRACT_REQUIREMENT_SECTION__SECTION_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Sss Items</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSSS_SYSTEM_INTERFACE_REQUIREMENTS__SSS_ITEMS = VSSS_ABSTRACT_REQUIREMENT_SECTION__SSS_ITEMS;

	/**
	 * The feature id for the '<em><b>Sss Requirement Subsections</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSSS_SYSTEM_INTERFACE_REQUIREMENTS__SSS_REQUIREMENT_SUBSECTIONS = VSSS_ABSTRACT_REQUIREMENT_SECTION__SSS_REQUIREMENT_SUBSECTIONS;

	/**
	 * The number of structural features of the '<em>VSSS System Interface Requirements</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSSS_SYSTEM_INTERFACE_REQUIREMENTS_FEATURE_COUNT = VSSS_ABSTRACT_REQUIREMENT_SECTION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>VSSS System Interface Requirements</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSSS_SYSTEM_INTERFACE_REQUIREMENTS_OPERATION_COUNT = VSSS_ABSTRACT_REQUIREMENT_SECTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.micobs.svm.sss.impl.VSSSAdaptationMissionizationRequirementsImpl <em>VSSS Adaptation Missionization Requirements</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uah.aut.srg.micobs.svm.sss.impl.VSSSAdaptationMissionizationRequirementsImpl
	 * @see es.uah.aut.srg.micobs.svm.sss.impl.sssPackageImpl#getVSSSAdaptationMissionizationRequirements()
	 * @generated
	 */
	int VSSS_ADAPTATION_MISSIONIZATION_REQUIREMENTS = 18;

	/**
	 * The feature id for the '<em><b>Items</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSSS_ADAPTATION_MISSIONIZATION_REQUIREMENTS__ITEMS = VSSS_ABSTRACT_REQUIREMENT_SECTION__ITEMS;

	/**
	 * The feature id for the '<em><b>Subsections</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSSS_ADAPTATION_MISSIONIZATION_REQUIREMENTS__SUBSECTIONS = VSSS_ABSTRACT_REQUIREMENT_SECTION__SUBSECTIONS;

	/**
	 * The feature id for the '<em><b>Section Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSSS_ADAPTATION_MISSIONIZATION_REQUIREMENTS__SECTION_DESCRIPTION = VSSS_ABSTRACT_REQUIREMENT_SECTION__SECTION_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Sss Items</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSSS_ADAPTATION_MISSIONIZATION_REQUIREMENTS__SSS_ITEMS = VSSS_ABSTRACT_REQUIREMENT_SECTION__SSS_ITEMS;

	/**
	 * The feature id for the '<em><b>Sss Requirement Subsections</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSSS_ADAPTATION_MISSIONIZATION_REQUIREMENTS__SSS_REQUIREMENT_SUBSECTIONS = VSSS_ABSTRACT_REQUIREMENT_SECTION__SSS_REQUIREMENT_SUBSECTIONS;

	/**
	 * The number of structural features of the '<em>VSSS Adaptation Missionization Requirements</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSSS_ADAPTATION_MISSIONIZATION_REQUIREMENTS_FEATURE_COUNT = VSSS_ABSTRACT_REQUIREMENT_SECTION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>VSSS Adaptation Missionization Requirements</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSSS_ADAPTATION_MISSIONIZATION_REQUIREMENTS_OPERATION_COUNT = VSSS_ABSTRACT_REQUIREMENT_SECTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.micobs.svm.sss.impl.VSSSComputerResourceRequirementsImpl <em>VSSS Computer Resource Requirements</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uah.aut.srg.micobs.svm.sss.impl.VSSSComputerResourceRequirementsImpl
	 * @see es.uah.aut.srg.micobs.svm.sss.impl.sssPackageImpl#getVSSSComputerResourceRequirements()
	 * @generated
	 */
	int VSSS_COMPUTER_RESOURCE_REQUIREMENTS = 19;

	/**
	 * The feature id for the '<em><b>Items</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSSS_COMPUTER_RESOURCE_REQUIREMENTS__ITEMS = VSSS_ABSTRACT_REQUIREMENT_SECTION__ITEMS;

	/**
	 * The feature id for the '<em><b>Subsections</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSSS_COMPUTER_RESOURCE_REQUIREMENTS__SUBSECTIONS = VSSS_ABSTRACT_REQUIREMENT_SECTION__SUBSECTIONS;

	/**
	 * The feature id for the '<em><b>Section Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSSS_COMPUTER_RESOURCE_REQUIREMENTS__SECTION_DESCRIPTION = VSSS_ABSTRACT_REQUIREMENT_SECTION__SECTION_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Sss Items</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSSS_COMPUTER_RESOURCE_REQUIREMENTS__SSS_ITEMS = VSSS_ABSTRACT_REQUIREMENT_SECTION__SSS_ITEMS;

	/**
	 * The feature id for the '<em><b>Sss Requirement Subsections</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSSS_COMPUTER_RESOURCE_REQUIREMENTS__SSS_REQUIREMENT_SUBSECTIONS = VSSS_ABSTRACT_REQUIREMENT_SECTION__SSS_REQUIREMENT_SUBSECTIONS;

	/**
	 * The number of structural features of the '<em>VSSS Computer Resource Requirements</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSSS_COMPUTER_RESOURCE_REQUIREMENTS_FEATURE_COUNT = VSSS_ABSTRACT_REQUIREMENT_SECTION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>VSSS Computer Resource Requirements</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSSS_COMPUTER_RESOURCE_REQUIREMENTS_OPERATION_COUNT = VSSS_ABSTRACT_REQUIREMENT_SECTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.micobs.svm.sss.impl.VSSSSecurityRequirementsImpl <em>VSSS Security Requirements</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uah.aut.srg.micobs.svm.sss.impl.VSSSSecurityRequirementsImpl
	 * @see es.uah.aut.srg.micobs.svm.sss.impl.sssPackageImpl#getVSSSSecurityRequirements()
	 * @generated
	 */
	int VSSS_SECURITY_REQUIREMENTS = 20;

	/**
	 * The feature id for the '<em><b>Items</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSSS_SECURITY_REQUIREMENTS__ITEMS = VSSS_ABSTRACT_REQUIREMENT_SECTION__ITEMS;

	/**
	 * The feature id for the '<em><b>Subsections</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSSS_SECURITY_REQUIREMENTS__SUBSECTIONS = VSSS_ABSTRACT_REQUIREMENT_SECTION__SUBSECTIONS;

	/**
	 * The feature id for the '<em><b>Section Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSSS_SECURITY_REQUIREMENTS__SECTION_DESCRIPTION = VSSS_ABSTRACT_REQUIREMENT_SECTION__SECTION_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Sss Items</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSSS_SECURITY_REQUIREMENTS__SSS_ITEMS = VSSS_ABSTRACT_REQUIREMENT_SECTION__SSS_ITEMS;

	/**
	 * The feature id for the '<em><b>Sss Requirement Subsections</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSSS_SECURITY_REQUIREMENTS__SSS_REQUIREMENT_SUBSECTIONS = VSSS_ABSTRACT_REQUIREMENT_SECTION__SSS_REQUIREMENT_SUBSECTIONS;

	/**
	 * The number of structural features of the '<em>VSSS Security Requirements</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSSS_SECURITY_REQUIREMENTS_FEATURE_COUNT = VSSS_ABSTRACT_REQUIREMENT_SECTION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>VSSS Security Requirements</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSSS_SECURITY_REQUIREMENTS_OPERATION_COUNT = VSSS_ABSTRACT_REQUIREMENT_SECTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.micobs.svm.sss.impl.VSSSSafetyRequirementsImpl <em>VSSS Safety Requirements</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uah.aut.srg.micobs.svm.sss.impl.VSSSSafetyRequirementsImpl
	 * @see es.uah.aut.srg.micobs.svm.sss.impl.sssPackageImpl#getVSSSSafetyRequirements()
	 * @generated
	 */
	int VSSS_SAFETY_REQUIREMENTS = 21;

	/**
	 * The feature id for the '<em><b>Items</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSSS_SAFETY_REQUIREMENTS__ITEMS = VSSS_ABSTRACT_REQUIREMENT_SECTION__ITEMS;

	/**
	 * The feature id for the '<em><b>Subsections</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSSS_SAFETY_REQUIREMENTS__SUBSECTIONS = VSSS_ABSTRACT_REQUIREMENT_SECTION__SUBSECTIONS;

	/**
	 * The feature id for the '<em><b>Section Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSSS_SAFETY_REQUIREMENTS__SECTION_DESCRIPTION = VSSS_ABSTRACT_REQUIREMENT_SECTION__SECTION_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Sss Items</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSSS_SAFETY_REQUIREMENTS__SSS_ITEMS = VSSS_ABSTRACT_REQUIREMENT_SECTION__SSS_ITEMS;

	/**
	 * The feature id for the '<em><b>Sss Requirement Subsections</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSSS_SAFETY_REQUIREMENTS__SSS_REQUIREMENT_SUBSECTIONS = VSSS_ABSTRACT_REQUIREMENT_SECTION__SSS_REQUIREMENT_SUBSECTIONS;

	/**
	 * The number of structural features of the '<em>VSSS Safety Requirements</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSSS_SAFETY_REQUIREMENTS_FEATURE_COUNT = VSSS_ABSTRACT_REQUIREMENT_SECTION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>VSSS Safety Requirements</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSSS_SAFETY_REQUIREMENTS_OPERATION_COUNT = VSSS_ABSTRACT_REQUIREMENT_SECTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.micobs.svm.sss.impl.VSSSReliabiltyAvailabilityRequirementsImpl <em>VSSS Reliabilty Availability Requirements</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uah.aut.srg.micobs.svm.sss.impl.VSSSReliabiltyAvailabilityRequirementsImpl
	 * @see es.uah.aut.srg.micobs.svm.sss.impl.sssPackageImpl#getVSSSReliabiltyAvailabilityRequirements()
	 * @generated
	 */
	int VSSS_RELIABILTY_AVAILABILITY_REQUIREMENTS = 22;

	/**
	 * The feature id for the '<em><b>Items</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSSS_RELIABILTY_AVAILABILITY_REQUIREMENTS__ITEMS = VSSS_ABSTRACT_REQUIREMENT_SECTION__ITEMS;

	/**
	 * The feature id for the '<em><b>Subsections</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSSS_RELIABILTY_AVAILABILITY_REQUIREMENTS__SUBSECTIONS = VSSS_ABSTRACT_REQUIREMENT_SECTION__SUBSECTIONS;

	/**
	 * The feature id for the '<em><b>Section Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSSS_RELIABILTY_AVAILABILITY_REQUIREMENTS__SECTION_DESCRIPTION = VSSS_ABSTRACT_REQUIREMENT_SECTION__SECTION_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Sss Items</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSSS_RELIABILTY_AVAILABILITY_REQUIREMENTS__SSS_ITEMS = VSSS_ABSTRACT_REQUIREMENT_SECTION__SSS_ITEMS;

	/**
	 * The feature id for the '<em><b>Sss Requirement Subsections</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSSS_RELIABILTY_AVAILABILITY_REQUIREMENTS__SSS_REQUIREMENT_SUBSECTIONS = VSSS_ABSTRACT_REQUIREMENT_SECTION__SSS_REQUIREMENT_SUBSECTIONS;

	/**
	 * The number of structural features of the '<em>VSSS Reliabilty Availability Requirements</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSSS_RELIABILTY_AVAILABILITY_REQUIREMENTS_FEATURE_COUNT = VSSS_ABSTRACT_REQUIREMENT_SECTION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>VSSS Reliabilty Availability Requirements</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSSS_RELIABILTY_AVAILABILITY_REQUIREMENTS_OPERATION_COUNT = VSSS_ABSTRACT_REQUIREMENT_SECTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.micobs.svm.sss.impl.VSSSQualityRequirementsImpl <em>VSSS Quality Requirements</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uah.aut.srg.micobs.svm.sss.impl.VSSSQualityRequirementsImpl
	 * @see es.uah.aut.srg.micobs.svm.sss.impl.sssPackageImpl#getVSSSQualityRequirements()
	 * @generated
	 */
	int VSSS_QUALITY_REQUIREMENTS = 23;

	/**
	 * The feature id for the '<em><b>Items</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSSS_QUALITY_REQUIREMENTS__ITEMS = VSSS_ABSTRACT_REQUIREMENT_SECTION__ITEMS;

	/**
	 * The feature id for the '<em><b>Subsections</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSSS_QUALITY_REQUIREMENTS__SUBSECTIONS = VSSS_ABSTRACT_REQUIREMENT_SECTION__SUBSECTIONS;

	/**
	 * The feature id for the '<em><b>Section Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSSS_QUALITY_REQUIREMENTS__SECTION_DESCRIPTION = VSSS_ABSTRACT_REQUIREMENT_SECTION__SECTION_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Sss Items</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSSS_QUALITY_REQUIREMENTS__SSS_ITEMS = VSSS_ABSTRACT_REQUIREMENT_SECTION__SSS_ITEMS;

	/**
	 * The feature id for the '<em><b>Sss Requirement Subsections</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSSS_QUALITY_REQUIREMENTS__SSS_REQUIREMENT_SUBSECTIONS = VSSS_ABSTRACT_REQUIREMENT_SECTION__SSS_REQUIREMENT_SUBSECTIONS;

	/**
	 * The number of structural features of the '<em>VSSS Quality Requirements</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSSS_QUALITY_REQUIREMENTS_FEATURE_COUNT = VSSS_ABSTRACT_REQUIREMENT_SECTION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>VSSS Quality Requirements</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSSS_QUALITY_REQUIREMENTS_OPERATION_COUNT = VSSS_ABSTRACT_REQUIREMENT_SECTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.micobs.svm.sss.impl.VSSSDesignRequirementsImpl <em>VSSS Design Requirements</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uah.aut.srg.micobs.svm.sss.impl.VSSSDesignRequirementsImpl
	 * @see es.uah.aut.srg.micobs.svm.sss.impl.sssPackageImpl#getVSSSDesignRequirements()
	 * @generated
	 */
	int VSSS_DESIGN_REQUIREMENTS = 24;

	/**
	 * The feature id for the '<em><b>Items</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSSS_DESIGN_REQUIREMENTS__ITEMS = VSSS_ABSTRACT_REQUIREMENT_SECTION__ITEMS;

	/**
	 * The feature id for the '<em><b>Subsections</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSSS_DESIGN_REQUIREMENTS__SUBSECTIONS = VSSS_ABSTRACT_REQUIREMENT_SECTION__SUBSECTIONS;

	/**
	 * The feature id for the '<em><b>Section Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSSS_DESIGN_REQUIREMENTS__SECTION_DESCRIPTION = VSSS_ABSTRACT_REQUIREMENT_SECTION__SECTION_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Sss Items</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSSS_DESIGN_REQUIREMENTS__SSS_ITEMS = VSSS_ABSTRACT_REQUIREMENT_SECTION__SSS_ITEMS;

	/**
	 * The feature id for the '<em><b>Sss Requirement Subsections</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSSS_DESIGN_REQUIREMENTS__SSS_REQUIREMENT_SUBSECTIONS = VSSS_ABSTRACT_REQUIREMENT_SECTION__SSS_REQUIREMENT_SUBSECTIONS;

	/**
	 * The number of structural features of the '<em>VSSS Design Requirements</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSSS_DESIGN_REQUIREMENTS_FEATURE_COUNT = VSSS_ABSTRACT_REQUIREMENT_SECTION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>VSSS Design Requirements</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSSS_DESIGN_REQUIREMENTS_OPERATION_COUNT = VSSS_ABSTRACT_REQUIREMENT_SECTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.micobs.svm.sss.impl.VSSSSoftwareOperationsRequirementsImpl <em>VSSS Software Operations Requirements</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uah.aut.srg.micobs.svm.sss.impl.VSSSSoftwareOperationsRequirementsImpl
	 * @see es.uah.aut.srg.micobs.svm.sss.impl.sssPackageImpl#getVSSSSoftwareOperationsRequirements()
	 * @generated
	 */
	int VSSS_SOFTWARE_OPERATIONS_REQUIREMENTS = 25;

	/**
	 * The feature id for the '<em><b>Items</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSSS_SOFTWARE_OPERATIONS_REQUIREMENTS__ITEMS = VSSS_ABSTRACT_REQUIREMENT_SECTION__ITEMS;

	/**
	 * The feature id for the '<em><b>Subsections</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSSS_SOFTWARE_OPERATIONS_REQUIREMENTS__SUBSECTIONS = VSSS_ABSTRACT_REQUIREMENT_SECTION__SUBSECTIONS;

	/**
	 * The feature id for the '<em><b>Section Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSSS_SOFTWARE_OPERATIONS_REQUIREMENTS__SECTION_DESCRIPTION = VSSS_ABSTRACT_REQUIREMENT_SECTION__SECTION_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Sss Items</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSSS_SOFTWARE_OPERATIONS_REQUIREMENTS__SSS_ITEMS = VSSS_ABSTRACT_REQUIREMENT_SECTION__SSS_ITEMS;

	/**
	 * The feature id for the '<em><b>Sss Requirement Subsections</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSSS_SOFTWARE_OPERATIONS_REQUIREMENTS__SSS_REQUIREMENT_SUBSECTIONS = VSSS_ABSTRACT_REQUIREMENT_SECTION__SSS_REQUIREMENT_SUBSECTIONS;

	/**
	 * The number of structural features of the '<em>VSSS Software Operations Requirements</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSSS_SOFTWARE_OPERATIONS_REQUIREMENTS_FEATURE_COUNT = VSSS_ABSTRACT_REQUIREMENT_SECTION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>VSSS Software Operations Requirements</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSSS_SOFTWARE_OPERATIONS_REQUIREMENTS_OPERATION_COUNT = VSSS_ABSTRACT_REQUIREMENT_SECTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.micobs.svm.sss.impl.VSSSSoftwareMaintenanceRequirementsImpl <em>VSSS Software Maintenance Requirements</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uah.aut.srg.micobs.svm.sss.impl.VSSSSoftwareMaintenanceRequirementsImpl
	 * @see es.uah.aut.srg.micobs.svm.sss.impl.sssPackageImpl#getVSSSSoftwareMaintenanceRequirements()
	 * @generated
	 */
	int VSSS_SOFTWARE_MAINTENANCE_REQUIREMENTS = 26;

	/**
	 * The feature id for the '<em><b>Items</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSSS_SOFTWARE_MAINTENANCE_REQUIREMENTS__ITEMS = VSSS_ABSTRACT_REQUIREMENT_SECTION__ITEMS;

	/**
	 * The feature id for the '<em><b>Subsections</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSSS_SOFTWARE_MAINTENANCE_REQUIREMENTS__SUBSECTIONS = VSSS_ABSTRACT_REQUIREMENT_SECTION__SUBSECTIONS;

	/**
	 * The feature id for the '<em><b>Section Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSSS_SOFTWARE_MAINTENANCE_REQUIREMENTS__SECTION_DESCRIPTION = VSSS_ABSTRACT_REQUIREMENT_SECTION__SECTION_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Sss Items</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSSS_SOFTWARE_MAINTENANCE_REQUIREMENTS__SSS_ITEMS = VSSS_ABSTRACT_REQUIREMENT_SECTION__SSS_ITEMS;

	/**
	 * The feature id for the '<em><b>Sss Requirement Subsections</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSSS_SOFTWARE_MAINTENANCE_REQUIREMENTS__SSS_REQUIREMENT_SUBSECTIONS = VSSS_ABSTRACT_REQUIREMENT_SECTION__SSS_REQUIREMENT_SUBSECTIONS;

	/**
	 * The number of structural features of the '<em>VSSS Software Maintenance Requirements</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSSS_SOFTWARE_MAINTENANCE_REQUIREMENTS_FEATURE_COUNT = VSSS_ABSTRACT_REQUIREMENT_SECTION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>VSSS Software Maintenance Requirements</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSSS_SOFTWARE_MAINTENANCE_REQUIREMENTS_OPERATION_COUNT = VSSS_ABSTRACT_REQUIREMENT_SECTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.micobs.svm.sss.impl.VSSSSystemSoftwareObservabilityRequirementsImpl <em>VSSS System Software Observability Requirements</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uah.aut.srg.micobs.svm.sss.impl.VSSSSystemSoftwareObservabilityRequirementsImpl
	 * @see es.uah.aut.srg.micobs.svm.sss.impl.sssPackageImpl#getVSSSSystemSoftwareObservabilityRequirements()
	 * @generated
	 */
	int VSSS_SYSTEM_SOFTWARE_OBSERVABILITY_REQUIREMENTS = 27;

	/**
	 * The feature id for the '<em><b>Items</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSSS_SYSTEM_SOFTWARE_OBSERVABILITY_REQUIREMENTS__ITEMS = VSSS_ABSTRACT_REQUIREMENT_SECTION__ITEMS;

	/**
	 * The feature id for the '<em><b>Subsections</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSSS_SYSTEM_SOFTWARE_OBSERVABILITY_REQUIREMENTS__SUBSECTIONS = VSSS_ABSTRACT_REQUIREMENT_SECTION__SUBSECTIONS;

	/**
	 * The feature id for the '<em><b>Section Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSSS_SYSTEM_SOFTWARE_OBSERVABILITY_REQUIREMENTS__SECTION_DESCRIPTION = VSSS_ABSTRACT_REQUIREMENT_SECTION__SECTION_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Sss Items</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSSS_SYSTEM_SOFTWARE_OBSERVABILITY_REQUIREMENTS__SSS_ITEMS = VSSS_ABSTRACT_REQUIREMENT_SECTION__SSS_ITEMS;

	/**
	 * The feature id for the '<em><b>Sss Requirement Subsections</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSSS_SYSTEM_SOFTWARE_OBSERVABILITY_REQUIREMENTS__SSS_REQUIREMENT_SUBSECTIONS = VSSS_ABSTRACT_REQUIREMENT_SECTION__SSS_REQUIREMENT_SUBSECTIONS;

	/**
	 * The number of structural features of the '<em>VSSS System Software Observability Requirements</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSSS_SYSTEM_SOFTWARE_OBSERVABILITY_REQUIREMENTS_FEATURE_COUNT = VSSS_ABSTRACT_REQUIREMENT_SECTION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>VSSS System Software Observability Requirements</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSSS_SYSTEM_SOFTWARE_OBSERVABILITY_REQUIREMENTS_OPERATION_COUNT = VSSS_ABSTRACT_REQUIREMENT_SECTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.micobs.svm.sss.impl.VSSSVerificationValidationIntegrationRequirementsImpl <em>VSSS Verification Validation Integration Requirements</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uah.aut.srg.micobs.svm.sss.impl.VSSSVerificationValidationIntegrationRequirementsImpl
	 * @see es.uah.aut.srg.micobs.svm.sss.impl.sssPackageImpl#getVSSSVerificationValidationIntegrationRequirements()
	 * @generated
	 */
	int VSSS_VERIFICATION_VALIDATION_INTEGRATION_REQUIREMENTS = 28;

	/**
	 * The feature id for the '<em><b>Subsections</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSSS_VERIFICATION_VALIDATION_INTEGRATION_REQUIREMENTS__SUBSECTIONS = docPackage.DFIXED_SECTION__SUBSECTIONS;

	/**
	 * The feature id for the '<em><b>Section Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSSS_VERIFICATION_VALIDATION_INTEGRATION_REQUIREMENTS__SECTION_DESCRIPTION = docPackage.DFIXED_SECTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Verification Validation Process</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSSS_VERIFICATION_VALIDATION_INTEGRATION_REQUIREMENTS__VERIFICATION_VALIDATION_PROCESS = docPackage.DFIXED_SECTION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Validation Approach</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSSS_VERIFICATION_VALIDATION_INTEGRATION_REQUIREMENTS__VALIDATION_APPROACH = docPackage.DFIXED_SECTION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Validation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSSS_VERIFICATION_VALIDATION_INTEGRATION_REQUIREMENTS__VALIDATION = docPackage.DFIXED_SECTION_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Verification</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSSS_VERIFICATION_VALIDATION_INTEGRATION_REQUIREMENTS__VERIFICATION = docPackage.DFIXED_SECTION_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>VSSS Verification Validation Integration Requirements</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSSS_VERIFICATION_VALIDATION_INTEGRATION_REQUIREMENTS_FEATURE_COUNT = docPackage.DFIXED_SECTION_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>VSSS Verification Validation Integration Requirements</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSSS_VERIFICATION_VALIDATION_INTEGRATION_REQUIREMENTS_OPERATION_COUNT = docPackage.DFIXED_SECTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.micobs.svm.sss.impl.VSSSVerificationValidationProcessRequirementsImpl <em>VSSS Verification Validation Process Requirements</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uah.aut.srg.micobs.svm.sss.impl.VSSSVerificationValidationProcessRequirementsImpl
	 * @see es.uah.aut.srg.micobs.svm.sss.impl.sssPackageImpl#getVSSSVerificationValidationProcessRequirements()
	 * @generated
	 */
	int VSSS_VERIFICATION_VALIDATION_PROCESS_REQUIREMENTS = 29;

	/**
	 * The feature id for the '<em><b>Items</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSSS_VERIFICATION_VALIDATION_PROCESS_REQUIREMENTS__ITEMS = VSSS_ABSTRACT_REQUIREMENT_SECTION__ITEMS;

	/**
	 * The feature id for the '<em><b>Subsections</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSSS_VERIFICATION_VALIDATION_PROCESS_REQUIREMENTS__SUBSECTIONS = VSSS_ABSTRACT_REQUIREMENT_SECTION__SUBSECTIONS;

	/**
	 * The feature id for the '<em><b>Section Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSSS_VERIFICATION_VALIDATION_PROCESS_REQUIREMENTS__SECTION_DESCRIPTION = VSSS_ABSTRACT_REQUIREMENT_SECTION__SECTION_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Sss Items</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSSS_VERIFICATION_VALIDATION_PROCESS_REQUIREMENTS__SSS_ITEMS = VSSS_ABSTRACT_REQUIREMENT_SECTION__SSS_ITEMS;

	/**
	 * The feature id for the '<em><b>Sss Requirement Subsections</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSSS_VERIFICATION_VALIDATION_PROCESS_REQUIREMENTS__SSS_REQUIREMENT_SUBSECTIONS = VSSS_ABSTRACT_REQUIREMENT_SECTION__SSS_REQUIREMENT_SUBSECTIONS;

	/**
	 * The number of structural features of the '<em>VSSS Verification Validation Process Requirements</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSSS_VERIFICATION_VALIDATION_PROCESS_REQUIREMENTS_FEATURE_COUNT = VSSS_ABSTRACT_REQUIREMENT_SECTION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>VSSS Verification Validation Process Requirements</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSSS_VERIFICATION_VALIDATION_PROCESS_REQUIREMENTS_OPERATION_COUNT = VSSS_ABSTRACT_REQUIREMENT_SECTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.micobs.svm.sss.impl.VSSSValidationApproachImpl <em>VSSS Validation Approach</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uah.aut.srg.micobs.svm.sss.impl.VSSSValidationApproachImpl
	 * @see es.uah.aut.srg.micobs.svm.sss.impl.sssPackageImpl#getVSSSValidationApproach()
	 * @generated
	 */
	int VSSS_VALIDATION_APPROACH = 30;

	/**
	 * The feature id for the '<em><b>Items</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSSS_VALIDATION_APPROACH__ITEMS = VSSS_ABSTRACT_REQUIREMENT_SECTION__ITEMS;

	/**
	 * The feature id for the '<em><b>Subsections</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSSS_VALIDATION_APPROACH__SUBSECTIONS = VSSS_ABSTRACT_REQUIREMENT_SECTION__SUBSECTIONS;

	/**
	 * The feature id for the '<em><b>Section Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSSS_VALIDATION_APPROACH__SECTION_DESCRIPTION = VSSS_ABSTRACT_REQUIREMENT_SECTION__SECTION_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Sss Items</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSSS_VALIDATION_APPROACH__SSS_ITEMS = VSSS_ABSTRACT_REQUIREMENT_SECTION__SSS_ITEMS;

	/**
	 * The feature id for the '<em><b>Sss Requirement Subsections</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSSS_VALIDATION_APPROACH__SSS_REQUIREMENT_SUBSECTIONS = VSSS_ABSTRACT_REQUIREMENT_SECTION__SSS_REQUIREMENT_SUBSECTIONS;

	/**
	 * The number of structural features of the '<em>VSSS Validation Approach</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSSS_VALIDATION_APPROACH_FEATURE_COUNT = VSSS_ABSTRACT_REQUIREMENT_SECTION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>VSSS Validation Approach</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSSS_VALIDATION_APPROACH_OPERATION_COUNT = VSSS_ABSTRACT_REQUIREMENT_SECTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.micobs.svm.sss.impl.VSSSVerificationRequirementsImpl <em>VSSS Verification Requirements</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uah.aut.srg.micobs.svm.sss.impl.VSSSVerificationRequirementsImpl
	 * @see es.uah.aut.srg.micobs.svm.sss.impl.sssPackageImpl#getVSSSVerificationRequirements()
	 * @generated
	 */
	int VSSS_VERIFICATION_REQUIREMENTS = 31;

	/**
	 * The feature id for the '<em><b>Items</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSSS_VERIFICATION_REQUIREMENTS__ITEMS = VSSS_ABSTRACT_REQUIREMENT_SECTION__ITEMS;

	/**
	 * The feature id for the '<em><b>Subsections</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSSS_VERIFICATION_REQUIREMENTS__SUBSECTIONS = VSSS_ABSTRACT_REQUIREMENT_SECTION__SUBSECTIONS;

	/**
	 * The feature id for the '<em><b>Section Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSSS_VERIFICATION_REQUIREMENTS__SECTION_DESCRIPTION = VSSS_ABSTRACT_REQUIREMENT_SECTION__SECTION_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Sss Items</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSSS_VERIFICATION_REQUIREMENTS__SSS_ITEMS = VSSS_ABSTRACT_REQUIREMENT_SECTION__SSS_ITEMS;

	/**
	 * The feature id for the '<em><b>Sss Requirement Subsections</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSSS_VERIFICATION_REQUIREMENTS__SSS_REQUIREMENT_SUBSECTIONS = VSSS_ABSTRACT_REQUIREMENT_SECTION__SSS_REQUIREMENT_SUBSECTIONS;

	/**
	 * The number of structural features of the '<em>VSSS Verification Requirements</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSSS_VERIFICATION_REQUIREMENTS_FEATURE_COUNT = VSSS_ABSTRACT_REQUIREMENT_SECTION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>VSSS Verification Requirements</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSSS_VERIFICATION_REQUIREMENTS_OPERATION_COUNT = VSSS_ABSTRACT_REQUIREMENT_SECTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.micobs.svm.sss.impl.VSSSValidationRequirementsImpl <em>VSSS Validation Requirements</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uah.aut.srg.micobs.svm.sss.impl.VSSSValidationRequirementsImpl
	 * @see es.uah.aut.srg.micobs.svm.sss.impl.sssPackageImpl#getVSSSValidationRequirements()
	 * @generated
	 */
	int VSSS_VALIDATION_REQUIREMENTS = 32;

	/**
	 * The feature id for the '<em><b>Items</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSSS_VALIDATION_REQUIREMENTS__ITEMS = VSSS_ABSTRACT_REQUIREMENT_SECTION__ITEMS;

	/**
	 * The feature id for the '<em><b>Subsections</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSSS_VALIDATION_REQUIREMENTS__SUBSECTIONS = VSSS_ABSTRACT_REQUIREMENT_SECTION__SUBSECTIONS;

	/**
	 * The feature id for the '<em><b>Section Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSSS_VALIDATION_REQUIREMENTS__SECTION_DESCRIPTION = VSSS_ABSTRACT_REQUIREMENT_SECTION__SECTION_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Sss Items</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSSS_VALIDATION_REQUIREMENTS__SSS_ITEMS = VSSS_ABSTRACT_REQUIREMENT_SECTION__SSS_ITEMS;

	/**
	 * The feature id for the '<em><b>Sss Requirement Subsections</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSSS_VALIDATION_REQUIREMENTS__SSS_REQUIREMENT_SUBSECTIONS = VSSS_ABSTRACT_REQUIREMENT_SECTION__SSS_REQUIREMENT_SUBSECTIONS;

	/**
	 * The number of structural features of the '<em>VSSS Validation Requirements</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSSS_VALIDATION_REQUIREMENTS_FEATURE_COUNT = VSSS_ABSTRACT_REQUIREMENT_SECTION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>VSSS Validation Requirements</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSSS_VALIDATION_REQUIREMENTS_OPERATION_COUNT = VSSS_ABSTRACT_REQUIREMENT_SECTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.micobs.svm.sss.impl.VSSSDocumentItemImpl <em>VSSS Document Item</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uah.aut.srg.micobs.svm.sss.impl.VSSSDocumentItemImpl
	 * @see es.uah.aut.srg.micobs.svm.sss.impl.sssPackageImpl#getVSSSDocumentItem()
	 * @generated
	 */
	int VSSS_DOCUMENT_ITEM = 33;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSSS_DOCUMENT_ITEM__NAME = tdmPackage.VTRACEABLE_DOCUMENT_ABSTRACT_ITEM__NAME;

	/**
	 * The feature id for the '<em><b>Validation Method</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSSS_DOCUMENT_ITEM__VALIDATION_METHOD = tdmPackage.VTRACEABLE_DOCUMENT_ABSTRACT_ITEM__VALIDATION_METHOD;

	/**
	 * The feature id for the '<em><b>Group</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSSS_DOCUMENT_ITEM__GROUP = tdmPackage.VTRACEABLE_DOCUMENT_ABSTRACT_ITEM__GROUP;

	/**
	 * The feature id for the '<em><b>Parent Item</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSSS_DOCUMENT_ITEM__PARENT_ITEM = tdmPackage.VTRACEABLE_DOCUMENT_ABSTRACT_ITEM__PARENT_ITEM;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSSS_DOCUMENT_ITEM__DESCRIPTION = tdmPackage.VTRACEABLE_DOCUMENT_ABSTRACT_ITEM_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Extended Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSSS_DOCUMENT_ITEM__EXTENDED_DESCRIPTION = tdmPackage.VTRACEABLE_DOCUMENT_ABSTRACT_ITEM_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>VSSS Document Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSSS_DOCUMENT_ITEM_FEATURE_COUNT = tdmPackage.VTRACEABLE_DOCUMENT_ABSTRACT_ITEM_FEATURE_COUNT + 2;

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
	int VSSS_SYSTEM_MODELS = 34;

	/**
	 * The feature id for the '<em><b>Subsections</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSSS_SYSTEM_MODELS__SUBSECTIONS = docPackage.DFIXED_SECTION__SUBSECTIONS;

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
	int VSSS_SYSTEM_MODEL = 35;

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
	 * Returns the meta object for the containment reference '{@link es.uah.aut.srg.micobs.svm.sss.VSSSDocument#getIntroductionSection <em>Introduction Section</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Introduction Section</em>'.
	 * @see es.uah.aut.srg.micobs.svm.sss.VSSSDocument#getIntroductionSection()
	 * @see #getVSSSDocument()
	 * @generated
	 */
	EReference getVSSSDocument_IntroductionSection();

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
	 * Returns the meta object for the containment reference '{@link es.uah.aut.srg.micobs.svm.sss.VSSSDocument#getTermsDefinitionsAbbreviationsSection <em>Terms Definitions Abbreviations Section</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Terms Definitions Abbreviations Section</em>'.
	 * @see es.uah.aut.srg.micobs.svm.sss.VSSSDocument#getTermsDefinitionsAbbreviationsSection()
	 * @see #getVSSSDocument()
	 * @generated
	 */
	EReference getVSSSDocument_TermsDefinitionsAbbreviationsSection();

	/**
	 * Returns the meta object for the containment reference '{@link es.uah.aut.srg.micobs.svm.sss.VSSSDocument#getGeneralDescriptionSection <em>General Description Section</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>General Description Section</em>'.
	 * @see es.uah.aut.srg.micobs.svm.sss.VSSSDocument#getGeneralDescriptionSection()
	 * @see #getVSSSDocument()
	 * @generated
	 */
	EReference getVSSSDocument_GeneralDescriptionSection();

	/**
	 * Returns the meta object for the containment reference '{@link es.uah.aut.srg.micobs.svm.sss.VSSSDocument#getSpecificRequirementsSection <em>Specific Requirements Section</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Specific Requirements Section</em>'.
	 * @see es.uah.aut.srg.micobs.svm.sss.VSSSDocument#getSpecificRequirementsSection()
	 * @see #getVSSSDocument()
	 * @generated
	 */
	EReference getVSSSDocument_SpecificRequirementsSection();

	/**
	 * Returns the meta object for the containment reference '{@link es.uah.aut.srg.micobs.svm.sss.VSSSDocument#getVerificationValidationIntegrationSection <em>Verification Validation Integration Section</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Verification Validation Integration Section</em>'.
	 * @see es.uah.aut.srg.micobs.svm.sss.VSSSDocument#getVerificationValidationIntegrationSection()
	 * @see #getVSSSDocument()
	 * @generated
	 */
	EReference getVSSSDocument_VerificationValidationIntegrationSection();

	/**
	 * Returns the meta object for the containment reference '{@link es.uah.aut.srg.micobs.svm.sss.VSSSDocument#getSystemModelsSection <em>System Models Section</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>System Models Section</em>'.
	 * @see es.uah.aut.srg.micobs.svm.sss.VSSSDocument#getSystemModelsSection()
	 * @see #getVSSSDocument()
	 * @generated
	 */
	EReference getVSSSDocument_SystemModelsSection();

	/**
	 * Returns the meta object for the containment reference list '{@link es.uah.aut.srg.micobs.svm.sss.VSSSDocument#getSssFigures <em>Sss Figures</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sss Figures</em>'.
	 * @see es.uah.aut.srg.micobs.svm.sss.VSSSDocument#getSssFigures()
	 * @see #getVSSSDocument()
	 * @generated
	 */
	EReference getVSSSDocument_SssFigures();

	/**
	 * Returns the meta object for the containment reference list '{@link es.uah.aut.srg.micobs.svm.sss.VSSSDocument#getSssTables <em>Sss Tables</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sss Tables</em>'.
	 * @see es.uah.aut.srg.micobs.svm.sss.VSSSDocument#getSssTables()
	 * @see #getVSSSDocument()
	 * @generated
	 */
	EReference getVSSSDocument_SssTables();

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
	 * Returns the meta object for the containment reference list '{@link es.uah.aut.srg.micobs.svm.sss.VSSSIntroduction#getSssInstatiableSubsections <em>Sss Instatiable Subsections</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sss Instatiable Subsections</em>'.
	 * @see es.uah.aut.srg.micobs.svm.sss.VSSSIntroduction#getSssInstatiableSubsections()
	 * @see #getVSSSIntroduction()
	 * @generated
	 */
	EReference getVSSSIntroduction_SssInstatiableSubsections();

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
	 * Returns the meta object for class '{@link es.uah.aut.srg.micobs.svm.sss.VSSSAbstractBriefDescription <em>VSSS Abstract Brief Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>VSSS Abstract Brief Description</em>'.
	 * @see es.uah.aut.srg.micobs.svm.sss.VSSSAbstractBriefDescription
	 * @generated
	 */
	EClass getVSSSAbstractBriefDescription();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.micobs.svm.sss.VSSSAbstractBriefDescription#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see es.uah.aut.srg.micobs.svm.sss.VSSSAbstractBriefDescription#getName()
	 * @see #getVSSSAbstractBriefDescription()
	 * @generated
	 */
	EAttribute getVSSSAbstractBriefDescription_Name();

	/**
	 * Returns the meta object for the containment reference '{@link es.uah.aut.srg.micobs.svm.sss.VSSSAbstractBriefDescription#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Description</em>'.
	 * @see es.uah.aut.srg.micobs.svm.sss.VSSSAbstractBriefDescription#getDescription()
	 * @see #getVSSSAbstractBriefDescription()
	 * @generated
	 */
	EReference getVSSSAbstractBriefDescription_Description();

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
	 * Returns the meta object for class '{@link es.uah.aut.srg.micobs.svm.sss.VSSSFixedSection <em>VSSS Fixed Section</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>VSSS Fixed Section</em>'.
	 * @see es.uah.aut.srg.micobs.svm.sss.VSSSFixedSection
	 * @generated
	 */
	EClass getVSSSFixedSection();

	/**
	 * Returns the meta object for the containment reference '{@link es.uah.aut.srg.micobs.svm.sss.VSSSFixedSection#getBody <em>Body</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Body</em>'.
	 * @see es.uah.aut.srg.micobs.svm.sss.VSSSFixedSection#getBody()
	 * @see #getVSSSFixedSection()
	 * @generated
	 */
	EReference getVSSSFixedSection_Body();

	/**
	 * Returns the meta object for the containment reference list '{@link es.uah.aut.srg.micobs.svm.sss.VSSSFixedSection#getSssInstatiableSubsections <em>Sss Instatiable Subsections</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sss Instatiable Subsections</em>'.
	 * @see es.uah.aut.srg.micobs.svm.sss.VSSSFixedSection#getSssInstatiableSubsections()
	 * @see #getVSSSFixedSection()
	 * @generated
	 */
	EReference getVSSSFixedSection_SssInstatiableSubsections();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.micobs.svm.sss.VSSSInstantiableSection <em>VSSS Instantiable Section</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>VSSS Instantiable Section</em>'.
	 * @see es.uah.aut.srg.micobs.svm.sss.VSSSInstantiableSection
	 * @generated
	 */
	EClass getVSSSInstantiableSection();

	/**
	 * Returns the meta object for the containment reference '{@link es.uah.aut.srg.micobs.svm.sss.VSSSInstantiableSection#getBody <em>Body</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Body</em>'.
	 * @see es.uah.aut.srg.micobs.svm.sss.VSSSInstantiableSection#getBody()
	 * @see #getVSSSInstantiableSection()
	 * @generated
	 */
	EReference getVSSSInstantiableSection_Body();

	/**
	 * Returns the meta object for the containment reference list '{@link es.uah.aut.srg.micobs.svm.sss.VSSSInstantiableSection#getSssInstatiableSubsections <em>Sss Instatiable Subsections</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sss Instatiable Subsections</em>'.
	 * @see es.uah.aut.srg.micobs.svm.sss.VSSSInstantiableSection#getSssInstatiableSubsections()
	 * @see #getVSSSInstantiableSection()
	 * @generated
	 */
	EReference getVSSSInstantiableSection_SssInstatiableSubsections();

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
	 * Returns the meta object for the containment reference '{@link es.uah.aut.srg.micobs.svm.sss.VSSSGeneralDescription#getGeneralCapabilities <em>General Capabilities</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>General Capabilities</em>'.
	 * @see es.uah.aut.srg.micobs.svm.sss.VSSSGeneralDescription#getGeneralCapabilities()
	 * @see #getVSSSGeneralDescription()
	 * @generated
	 */
	EReference getVSSSGeneralDescription_GeneralCapabilities();

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
	 * Returns the meta object for class '{@link es.uah.aut.srg.micobs.svm.sss.VSSSAbstractRequirementSection <em>VSSS Abstract Requirement Section</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>VSSS Abstract Requirement Section</em>'.
	 * @see es.uah.aut.srg.micobs.svm.sss.VSSSAbstractRequirementSection
	 * @generated
	 */
	EClass getVSSSAbstractRequirementSection();

	/**
	 * Returns the meta object for the containment reference '{@link es.uah.aut.srg.micobs.svm.sss.VSSSAbstractRequirementSection#getSectionDescription <em>Section Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Section Description</em>'.
	 * @see es.uah.aut.srg.micobs.svm.sss.VSSSAbstractRequirementSection#getSectionDescription()
	 * @see #getVSSSAbstractRequirementSection()
	 * @generated
	 */
	EReference getVSSSAbstractRequirementSection_SectionDescription();

	/**
	 * Returns the meta object for the containment reference list '{@link es.uah.aut.srg.micobs.svm.sss.VSSSAbstractRequirementSection#getSssItems <em>Sss Items</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sss Items</em>'.
	 * @see es.uah.aut.srg.micobs.svm.sss.VSSSAbstractRequirementSection#getSssItems()
	 * @see #getVSSSAbstractRequirementSection()
	 * @generated
	 */
	EReference getVSSSAbstractRequirementSection_SssItems();

	/**
	 * Returns the meta object for the containment reference list '{@link es.uah.aut.srg.micobs.svm.sss.VSSSAbstractRequirementSection#getSssRequirementSubsections <em>Sss Requirement Subsections</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sss Requirement Subsections</em>'.
	 * @see es.uah.aut.srg.micobs.svm.sss.VSSSAbstractRequirementSection#getSssRequirementSubsections()
	 * @see #getVSSSAbstractRequirementSection()
	 * @generated
	 */
	EReference getVSSSAbstractRequirementSection_SssRequirementSubsections();

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
	 * Returns the meta object for the containment reference '{@link es.uah.aut.srg.micobs.svm.sss.VSSSSpecificRequirements#getSectionDescription <em>Section Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Section Description</em>'.
	 * @see es.uah.aut.srg.micobs.svm.sss.VSSSSpecificRequirements#getSectionDescription()
	 * @see #getVSSSSpecificRequirements()
	 * @generated
	 */
	EReference getVSSSSpecificRequirements_SectionDescription();

	/**
	 * Returns the meta object for the containment reference '{@link es.uah.aut.srg.micobs.svm.sss.VSSSSpecificRequirements#getGeneral <em>General</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>General</em>'.
	 * @see es.uah.aut.srg.micobs.svm.sss.VSSSSpecificRequirements#getGeneral()
	 * @see #getVSSSSpecificRequirements()
	 * @generated
	 */
	EReference getVSSSSpecificRequirements_General();

	/**
	 * Returns the meta object for the containment reference '{@link es.uah.aut.srg.micobs.svm.sss.VSSSSpecificRequirements#getCapabilities <em>Capabilities</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Capabilities</em>'.
	 * @see es.uah.aut.srg.micobs.svm.sss.VSSSSpecificRequirements#getCapabilities()
	 * @see #getVSSSSpecificRequirements()
	 * @generated
	 */
	EReference getVSSSSpecificRequirements_Capabilities();

	/**
	 * Returns the meta object for the containment reference '{@link es.uah.aut.srg.micobs.svm.sss.VSSSSpecificRequirements#getSystemInterface <em>System Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>System Interface</em>'.
	 * @see es.uah.aut.srg.micobs.svm.sss.VSSSSpecificRequirements#getSystemInterface()
	 * @see #getVSSSSpecificRequirements()
	 * @generated
	 */
	EReference getVSSSSpecificRequirements_SystemInterface();

	/**
	 * Returns the meta object for the containment reference '{@link es.uah.aut.srg.micobs.svm.sss.VSSSSpecificRequirements#getAdaptationMissionization <em>Adaptation Missionization</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Adaptation Missionization</em>'.
	 * @see es.uah.aut.srg.micobs.svm.sss.VSSSSpecificRequirements#getAdaptationMissionization()
	 * @see #getVSSSSpecificRequirements()
	 * @generated
	 */
	EReference getVSSSSpecificRequirements_AdaptationMissionization();

	/**
	 * Returns the meta object for the containment reference '{@link es.uah.aut.srg.micobs.svm.sss.VSSSSpecificRequirements#getComputerResource <em>Computer Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Computer Resource</em>'.
	 * @see es.uah.aut.srg.micobs.svm.sss.VSSSSpecificRequirements#getComputerResource()
	 * @see #getVSSSSpecificRequirements()
	 * @generated
	 */
	EReference getVSSSSpecificRequirements_ComputerResource();

	/**
	 * Returns the meta object for the containment reference '{@link es.uah.aut.srg.micobs.svm.sss.VSSSSpecificRequirements#getSecurity <em>Security</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Security</em>'.
	 * @see es.uah.aut.srg.micobs.svm.sss.VSSSSpecificRequirements#getSecurity()
	 * @see #getVSSSSpecificRequirements()
	 * @generated
	 */
	EReference getVSSSSpecificRequirements_Security();

	/**
	 * Returns the meta object for the containment reference '{@link es.uah.aut.srg.micobs.svm.sss.VSSSSpecificRequirements#getSafety <em>Safety</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Safety</em>'.
	 * @see es.uah.aut.srg.micobs.svm.sss.VSSSSpecificRequirements#getSafety()
	 * @see #getVSSSSpecificRequirements()
	 * @generated
	 */
	EReference getVSSSSpecificRequirements_Safety();

	/**
	 * Returns the meta object for the containment reference '{@link es.uah.aut.srg.micobs.svm.sss.VSSSSpecificRequirements#getReliabiltyAvailability <em>Reliabilty Availability</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Reliabilty Availability</em>'.
	 * @see es.uah.aut.srg.micobs.svm.sss.VSSSSpecificRequirements#getReliabiltyAvailability()
	 * @see #getVSSSSpecificRequirements()
	 * @generated
	 */
	EReference getVSSSSpecificRequirements_ReliabiltyAvailability();

	/**
	 * Returns the meta object for the containment reference '{@link es.uah.aut.srg.micobs.svm.sss.VSSSSpecificRequirements#getQuality <em>Quality</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Quality</em>'.
	 * @see es.uah.aut.srg.micobs.svm.sss.VSSSSpecificRequirements#getQuality()
	 * @see #getVSSSSpecificRequirements()
	 * @generated
	 */
	EReference getVSSSSpecificRequirements_Quality();

	/**
	 * Returns the meta object for the containment reference '{@link es.uah.aut.srg.micobs.svm.sss.VSSSSpecificRequirements#getDesign <em>Design</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Design</em>'.
	 * @see es.uah.aut.srg.micobs.svm.sss.VSSSSpecificRequirements#getDesign()
	 * @see #getVSSSSpecificRequirements()
	 * @generated
	 */
	EReference getVSSSSpecificRequirements_Design();

	/**
	 * Returns the meta object for the containment reference '{@link es.uah.aut.srg.micobs.svm.sss.VSSSSpecificRequirements#getSoftwareOperations <em>Software Operations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Software Operations</em>'.
	 * @see es.uah.aut.srg.micobs.svm.sss.VSSSSpecificRequirements#getSoftwareOperations()
	 * @see #getVSSSSpecificRequirements()
	 * @generated
	 */
	EReference getVSSSSpecificRequirements_SoftwareOperations();

	/**
	 * Returns the meta object for the containment reference '{@link es.uah.aut.srg.micobs.svm.sss.VSSSSpecificRequirements#getSoftwareMaintenance <em>Software Maintenance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Software Maintenance</em>'.
	 * @see es.uah.aut.srg.micobs.svm.sss.VSSSSpecificRequirements#getSoftwareMaintenance()
	 * @see #getVSSSSpecificRequirements()
	 * @generated
	 */
	EReference getVSSSSpecificRequirements_SoftwareMaintenance();

	/**
	 * Returns the meta object for the containment reference '{@link es.uah.aut.srg.micobs.svm.sss.VSSSSpecificRequirements#getSystemSoftwareObservability <em>System Software Observability</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>System Software Observability</em>'.
	 * @see es.uah.aut.srg.micobs.svm.sss.VSSSSpecificRequirements#getSystemSoftwareObservability()
	 * @see #getVSSSSpecificRequirements()
	 * @generated
	 */
	EReference getVSSSSpecificRequirements_SystemSoftwareObservability();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.micobs.svm.sss.VSSSInstantiableRequirementSection <em>VSSS Instantiable Requirement Section</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>VSSS Instantiable Requirement Section</em>'.
	 * @see es.uah.aut.srg.micobs.svm.sss.VSSSInstantiableRequirementSection
	 * @generated
	 */
	EClass getVSSSInstantiableRequirementSection();

	/**
	 * Returns the meta object for the containment reference '{@link es.uah.aut.srg.micobs.svm.sss.VSSSInstantiableRequirementSection#getSectionDescription <em>Section Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Section Description</em>'.
	 * @see es.uah.aut.srg.micobs.svm.sss.VSSSInstantiableRequirementSection#getSectionDescription()
	 * @see #getVSSSInstantiableRequirementSection()
	 * @generated
	 */
	EReference getVSSSInstantiableRequirementSection_SectionDescription();

	/**
	 * Returns the meta object for the containment reference list '{@link es.uah.aut.srg.micobs.svm.sss.VSSSInstantiableRequirementSection#getSssItems <em>Sss Items</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sss Items</em>'.
	 * @see es.uah.aut.srg.micobs.svm.sss.VSSSInstantiableRequirementSection#getSssItems()
	 * @see #getVSSSInstantiableRequirementSection()
	 * @generated
	 */
	EReference getVSSSInstantiableRequirementSection_SssItems();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.micobs.svm.sss.VSSSGeneralRequirements <em>VSSS General Requirements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>VSSS General Requirements</em>'.
	 * @see es.uah.aut.srg.micobs.svm.sss.VSSSGeneralRequirements
	 * @generated
	 */
	EClass getVSSSGeneralRequirements();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.micobs.svm.sss.VSSSCapabilitiesRequirements <em>VSSS Capabilities Requirements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>VSSS Capabilities Requirements</em>'.
	 * @see es.uah.aut.srg.micobs.svm.sss.VSSSCapabilitiesRequirements
	 * @generated
	 */
	EClass getVSSSCapabilitiesRequirements();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.micobs.svm.sss.VSSSSystemInterfaceRequirements <em>VSSS System Interface Requirements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>VSSS System Interface Requirements</em>'.
	 * @see es.uah.aut.srg.micobs.svm.sss.VSSSSystemInterfaceRequirements
	 * @generated
	 */
	EClass getVSSSSystemInterfaceRequirements();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.micobs.svm.sss.VSSSAdaptationMissionizationRequirements <em>VSSS Adaptation Missionization Requirements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>VSSS Adaptation Missionization Requirements</em>'.
	 * @see es.uah.aut.srg.micobs.svm.sss.VSSSAdaptationMissionizationRequirements
	 * @generated
	 */
	EClass getVSSSAdaptationMissionizationRequirements();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.micobs.svm.sss.VSSSComputerResourceRequirements <em>VSSS Computer Resource Requirements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>VSSS Computer Resource Requirements</em>'.
	 * @see es.uah.aut.srg.micobs.svm.sss.VSSSComputerResourceRequirements
	 * @generated
	 */
	EClass getVSSSComputerResourceRequirements();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.micobs.svm.sss.VSSSSecurityRequirements <em>VSSS Security Requirements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>VSSS Security Requirements</em>'.
	 * @see es.uah.aut.srg.micobs.svm.sss.VSSSSecurityRequirements
	 * @generated
	 */
	EClass getVSSSSecurityRequirements();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.micobs.svm.sss.VSSSSafetyRequirements <em>VSSS Safety Requirements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>VSSS Safety Requirements</em>'.
	 * @see es.uah.aut.srg.micobs.svm.sss.VSSSSafetyRequirements
	 * @generated
	 */
	EClass getVSSSSafetyRequirements();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.micobs.svm.sss.VSSSReliabiltyAvailabilityRequirements <em>VSSS Reliabilty Availability Requirements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>VSSS Reliabilty Availability Requirements</em>'.
	 * @see es.uah.aut.srg.micobs.svm.sss.VSSSReliabiltyAvailabilityRequirements
	 * @generated
	 */
	EClass getVSSSReliabiltyAvailabilityRequirements();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.micobs.svm.sss.VSSSQualityRequirements <em>VSSS Quality Requirements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>VSSS Quality Requirements</em>'.
	 * @see es.uah.aut.srg.micobs.svm.sss.VSSSQualityRequirements
	 * @generated
	 */
	EClass getVSSSQualityRequirements();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.micobs.svm.sss.VSSSDesignRequirements <em>VSSS Design Requirements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>VSSS Design Requirements</em>'.
	 * @see es.uah.aut.srg.micobs.svm.sss.VSSSDesignRequirements
	 * @generated
	 */
	EClass getVSSSDesignRequirements();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.micobs.svm.sss.VSSSSoftwareOperationsRequirements <em>VSSS Software Operations Requirements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>VSSS Software Operations Requirements</em>'.
	 * @see es.uah.aut.srg.micobs.svm.sss.VSSSSoftwareOperationsRequirements
	 * @generated
	 */
	EClass getVSSSSoftwareOperationsRequirements();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.micobs.svm.sss.VSSSSoftwareMaintenanceRequirements <em>VSSS Software Maintenance Requirements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>VSSS Software Maintenance Requirements</em>'.
	 * @see es.uah.aut.srg.micobs.svm.sss.VSSSSoftwareMaintenanceRequirements
	 * @generated
	 */
	EClass getVSSSSoftwareMaintenanceRequirements();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.micobs.svm.sss.VSSSSystemSoftwareObservabilityRequirements <em>VSSS System Software Observability Requirements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>VSSS System Software Observability Requirements</em>'.
	 * @see es.uah.aut.srg.micobs.svm.sss.VSSSSystemSoftwareObservabilityRequirements
	 * @generated
	 */
	EClass getVSSSSystemSoftwareObservabilityRequirements();

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
	 * Returns the meta object for the containment reference '{@link es.uah.aut.srg.micobs.svm.sss.VSSSVerificationValidationIntegrationRequirements#getSectionDescription <em>Section Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Section Description</em>'.
	 * @see es.uah.aut.srg.micobs.svm.sss.VSSSVerificationValidationIntegrationRequirements#getSectionDescription()
	 * @see #getVSSSVerificationValidationIntegrationRequirements()
	 * @generated
	 */
	EReference getVSSSVerificationValidationIntegrationRequirements_SectionDescription();

	/**
	 * Returns the meta object for the containment reference '{@link es.uah.aut.srg.micobs.svm.sss.VSSSVerificationValidationIntegrationRequirements#getVerificationValidationProcess <em>Verification Validation Process</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Verification Validation Process</em>'.
	 * @see es.uah.aut.srg.micobs.svm.sss.VSSSVerificationValidationIntegrationRequirements#getVerificationValidationProcess()
	 * @see #getVSSSVerificationValidationIntegrationRequirements()
	 * @generated
	 */
	EReference getVSSSVerificationValidationIntegrationRequirements_VerificationValidationProcess();

	/**
	 * Returns the meta object for the containment reference '{@link es.uah.aut.srg.micobs.svm.sss.VSSSVerificationValidationIntegrationRequirements#getValidationApproach <em>Validation Approach</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Validation Approach</em>'.
	 * @see es.uah.aut.srg.micobs.svm.sss.VSSSVerificationValidationIntegrationRequirements#getValidationApproach()
	 * @see #getVSSSVerificationValidationIntegrationRequirements()
	 * @generated
	 */
	EReference getVSSSVerificationValidationIntegrationRequirements_ValidationApproach();

	/**
	 * Returns the meta object for the containment reference '{@link es.uah.aut.srg.micobs.svm.sss.VSSSVerificationValidationIntegrationRequirements#getValidation <em>Validation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Validation</em>'.
	 * @see es.uah.aut.srg.micobs.svm.sss.VSSSVerificationValidationIntegrationRequirements#getValidation()
	 * @see #getVSSSVerificationValidationIntegrationRequirements()
	 * @generated
	 */
	EReference getVSSSVerificationValidationIntegrationRequirements_Validation();

	/**
	 * Returns the meta object for the containment reference '{@link es.uah.aut.srg.micobs.svm.sss.VSSSVerificationValidationIntegrationRequirements#getVerification <em>Verification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Verification</em>'.
	 * @see es.uah.aut.srg.micobs.svm.sss.VSSSVerificationValidationIntegrationRequirements#getVerification()
	 * @see #getVSSSVerificationValidationIntegrationRequirements()
	 * @generated
	 */
	EReference getVSSSVerificationValidationIntegrationRequirements_Verification();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.micobs.svm.sss.VSSSVerificationValidationProcessRequirements <em>VSSS Verification Validation Process Requirements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>VSSS Verification Validation Process Requirements</em>'.
	 * @see es.uah.aut.srg.micobs.svm.sss.VSSSVerificationValidationProcessRequirements
	 * @generated
	 */
	EClass getVSSSVerificationValidationProcessRequirements();

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
	 * Returns the meta object for class '{@link es.uah.aut.srg.micobs.svm.sss.VSSSVerificationRequirements <em>VSSS Verification Requirements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>VSSS Verification Requirements</em>'.
	 * @see es.uah.aut.srg.micobs.svm.sss.VSSSVerificationRequirements
	 * @generated
	 */
	EClass getVSSSVerificationRequirements();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.micobs.svm.sss.VSSSValidationRequirements <em>VSSS Validation Requirements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>VSSS Validation Requirements</em>'.
	 * @see es.uah.aut.srg.micobs.svm.sss.VSSSValidationRequirements
	 * @generated
	 */
	EClass getVSSSValidationRequirements();

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
	 * Returns the meta object for the containment reference '{@link es.uah.aut.srg.micobs.svm.sss.VSSSDocumentItem#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Description</em>'.
	 * @see es.uah.aut.srg.micobs.svm.sss.VSSSDocumentItem#getDescription()
	 * @see #getVSSSDocumentItem()
	 * @generated
	 */
	EReference getVSSSDocumentItem_Description();

	/**
	 * Returns the meta object for the containment reference '{@link es.uah.aut.srg.micobs.svm.sss.VSSSDocumentItem#getExtendedDescription <em>Extended Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Extended Description</em>'.
	 * @see es.uah.aut.srg.micobs.svm.sss.VSSSDocumentItem#getExtendedDescription()
	 * @see #getVSSSDocumentItem()
	 * @generated
	 */
	EReference getVSSSDocumentItem_ExtendedDescription();

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
		 * The meta object literal for the '<em><b>Introduction Section</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VSSS_DOCUMENT__INTRODUCTION_SECTION = eINSTANCE.getVSSSDocument_IntroductionSection();

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
		 * The meta object literal for the '<em><b>Terms Definitions Abbreviations Section</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VSSS_DOCUMENT__TERMS_DEFINITIONS_ABBREVIATIONS_SECTION = eINSTANCE.getVSSSDocument_TermsDefinitionsAbbreviationsSection();

		/**
		 * The meta object literal for the '<em><b>General Description Section</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VSSS_DOCUMENT__GENERAL_DESCRIPTION_SECTION = eINSTANCE.getVSSSDocument_GeneralDescriptionSection();

		/**
		 * The meta object literal for the '<em><b>Specific Requirements Section</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VSSS_DOCUMENT__SPECIFIC_REQUIREMENTS_SECTION = eINSTANCE.getVSSSDocument_SpecificRequirementsSection();

		/**
		 * The meta object literal for the '<em><b>Verification Validation Integration Section</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VSSS_DOCUMENT__VERIFICATION_VALIDATION_INTEGRATION_SECTION = eINSTANCE.getVSSSDocument_VerificationValidationIntegrationSection();

		/**
		 * The meta object literal for the '<em><b>System Models Section</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VSSS_DOCUMENT__SYSTEM_MODELS_SECTION = eINSTANCE.getVSSSDocument_SystemModelsSection();

		/**
		 * The meta object literal for the '<em><b>Sss Figures</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VSSS_DOCUMENT__SSS_FIGURES = eINSTANCE.getVSSSDocument_SssFigures();

		/**
		 * The meta object literal for the '<em><b>Sss Tables</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VSSS_DOCUMENT__SSS_TABLES = eINSTANCE.getVSSSDocument_SssTables();

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
		 * The meta object literal for the '<em><b>Sss Instatiable Subsections</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VSSS_INTRODUCTION__SSS_INSTATIABLE_SUBSECTIONS = eINSTANCE.getVSSSIntroduction_SssInstatiableSubsections();

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
		 * The meta object literal for the '{@link es.uah.aut.srg.micobs.svm.sss.impl.VSSSAbstractBriefDescriptionImpl <em>VSSS Abstract Brief Description</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uah.aut.srg.micobs.svm.sss.impl.VSSSAbstractBriefDescriptionImpl
		 * @see es.uah.aut.srg.micobs.svm.sss.impl.sssPackageImpl#getVSSSAbstractBriefDescription()
		 * @generated
		 */
		EClass VSSS_ABSTRACT_BRIEF_DESCRIPTION = eINSTANCE.getVSSSAbstractBriefDescription();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VSSS_ABSTRACT_BRIEF_DESCRIPTION__NAME = eINSTANCE.getVSSSAbstractBriefDescription_Name();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VSSS_ABSTRACT_BRIEF_DESCRIPTION__DESCRIPTION = eINSTANCE.getVSSSAbstractBriefDescription_Description();

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
		 * The meta object literal for the '{@link es.uah.aut.srg.micobs.svm.sss.impl.VSSSFixedSectionImpl <em>VSSS Fixed Section</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uah.aut.srg.micobs.svm.sss.impl.VSSSFixedSectionImpl
		 * @see es.uah.aut.srg.micobs.svm.sss.impl.sssPackageImpl#getVSSSFixedSection()
		 * @generated
		 */
		EClass VSSS_FIXED_SECTION = eINSTANCE.getVSSSFixedSection();

		/**
		 * The meta object literal for the '<em><b>Body</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VSSS_FIXED_SECTION__BODY = eINSTANCE.getVSSSFixedSection_Body();

		/**
		 * The meta object literal for the '<em><b>Sss Instatiable Subsections</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VSSS_FIXED_SECTION__SSS_INSTATIABLE_SUBSECTIONS = eINSTANCE.getVSSSFixedSection_SssInstatiableSubsections();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.micobs.svm.sss.impl.VSSSInstantiableSectionImpl <em>VSSS Instantiable Section</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uah.aut.srg.micobs.svm.sss.impl.VSSSInstantiableSectionImpl
		 * @see es.uah.aut.srg.micobs.svm.sss.impl.sssPackageImpl#getVSSSInstantiableSection()
		 * @generated
		 */
		EClass VSSS_INSTANTIABLE_SECTION = eINSTANCE.getVSSSInstantiableSection();

		/**
		 * The meta object literal for the '<em><b>Body</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VSSS_INSTANTIABLE_SECTION__BODY = eINSTANCE.getVSSSInstantiableSection_Body();

		/**
		 * The meta object literal for the '<em><b>Sss Instatiable Subsections</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VSSS_INSTANTIABLE_SECTION__SSS_INSTATIABLE_SUBSECTIONS = eINSTANCE.getVSSSInstantiableSection_SssInstatiableSubsections();

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
		 * The meta object literal for the '<em><b>General Capabilities</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VSSS_GENERAL_DESCRIPTION__GENERAL_CAPABILITIES = eINSTANCE.getVSSSGeneralDescription_GeneralCapabilities();

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
		 * The meta object literal for the '{@link es.uah.aut.srg.micobs.svm.sss.impl.VSSSAbstractRequirementSectionImpl <em>VSSS Abstract Requirement Section</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uah.aut.srg.micobs.svm.sss.impl.VSSSAbstractRequirementSectionImpl
		 * @see es.uah.aut.srg.micobs.svm.sss.impl.sssPackageImpl#getVSSSAbstractRequirementSection()
		 * @generated
		 */
		EClass VSSS_ABSTRACT_REQUIREMENT_SECTION = eINSTANCE.getVSSSAbstractRequirementSection();

		/**
		 * The meta object literal for the '<em><b>Section Description</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VSSS_ABSTRACT_REQUIREMENT_SECTION__SECTION_DESCRIPTION = eINSTANCE.getVSSSAbstractRequirementSection_SectionDescription();

		/**
		 * The meta object literal for the '<em><b>Sss Items</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VSSS_ABSTRACT_REQUIREMENT_SECTION__SSS_ITEMS = eINSTANCE.getVSSSAbstractRequirementSection_SssItems();

		/**
		 * The meta object literal for the '<em><b>Sss Requirement Subsections</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VSSS_ABSTRACT_REQUIREMENT_SECTION__SSS_REQUIREMENT_SUBSECTIONS = eINSTANCE.getVSSSAbstractRequirementSection_SssRequirementSubsections();

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
		 * The meta object literal for the '<em><b>Section Description</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VSSS_SPECIFIC_REQUIREMENTS__SECTION_DESCRIPTION = eINSTANCE.getVSSSSpecificRequirements_SectionDescription();

		/**
		 * The meta object literal for the '<em><b>General</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VSSS_SPECIFIC_REQUIREMENTS__GENERAL = eINSTANCE.getVSSSSpecificRequirements_General();

		/**
		 * The meta object literal for the '<em><b>Capabilities</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VSSS_SPECIFIC_REQUIREMENTS__CAPABILITIES = eINSTANCE.getVSSSSpecificRequirements_Capabilities();

		/**
		 * The meta object literal for the '<em><b>System Interface</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VSSS_SPECIFIC_REQUIREMENTS__SYSTEM_INTERFACE = eINSTANCE.getVSSSSpecificRequirements_SystemInterface();

		/**
		 * The meta object literal for the '<em><b>Adaptation Missionization</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VSSS_SPECIFIC_REQUIREMENTS__ADAPTATION_MISSIONIZATION = eINSTANCE.getVSSSSpecificRequirements_AdaptationMissionization();

		/**
		 * The meta object literal for the '<em><b>Computer Resource</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VSSS_SPECIFIC_REQUIREMENTS__COMPUTER_RESOURCE = eINSTANCE.getVSSSSpecificRequirements_ComputerResource();

		/**
		 * The meta object literal for the '<em><b>Security</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VSSS_SPECIFIC_REQUIREMENTS__SECURITY = eINSTANCE.getVSSSSpecificRequirements_Security();

		/**
		 * The meta object literal for the '<em><b>Safety</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VSSS_SPECIFIC_REQUIREMENTS__SAFETY = eINSTANCE.getVSSSSpecificRequirements_Safety();

		/**
		 * The meta object literal for the '<em><b>Reliabilty Availability</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VSSS_SPECIFIC_REQUIREMENTS__RELIABILTY_AVAILABILITY = eINSTANCE.getVSSSSpecificRequirements_ReliabiltyAvailability();

		/**
		 * The meta object literal for the '<em><b>Quality</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VSSS_SPECIFIC_REQUIREMENTS__QUALITY = eINSTANCE.getVSSSSpecificRequirements_Quality();

		/**
		 * The meta object literal for the '<em><b>Design</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VSSS_SPECIFIC_REQUIREMENTS__DESIGN = eINSTANCE.getVSSSSpecificRequirements_Design();

		/**
		 * The meta object literal for the '<em><b>Software Operations</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VSSS_SPECIFIC_REQUIREMENTS__SOFTWARE_OPERATIONS = eINSTANCE.getVSSSSpecificRequirements_SoftwareOperations();

		/**
		 * The meta object literal for the '<em><b>Software Maintenance</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VSSS_SPECIFIC_REQUIREMENTS__SOFTWARE_MAINTENANCE = eINSTANCE.getVSSSSpecificRequirements_SoftwareMaintenance();

		/**
		 * The meta object literal for the '<em><b>System Software Observability</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VSSS_SPECIFIC_REQUIREMENTS__SYSTEM_SOFTWARE_OBSERVABILITY = eINSTANCE.getVSSSSpecificRequirements_SystemSoftwareObservability();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.micobs.svm.sss.impl.VSSSInstantiableRequirementSectionImpl <em>VSSS Instantiable Requirement Section</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uah.aut.srg.micobs.svm.sss.impl.VSSSInstantiableRequirementSectionImpl
		 * @see es.uah.aut.srg.micobs.svm.sss.impl.sssPackageImpl#getVSSSInstantiableRequirementSection()
		 * @generated
		 */
		EClass VSSS_INSTANTIABLE_REQUIREMENT_SECTION = eINSTANCE.getVSSSInstantiableRequirementSection();

		/**
		 * The meta object literal for the '<em><b>Section Description</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VSSS_INSTANTIABLE_REQUIREMENT_SECTION__SECTION_DESCRIPTION = eINSTANCE.getVSSSInstantiableRequirementSection_SectionDescription();

		/**
		 * The meta object literal for the '<em><b>Sss Items</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VSSS_INSTANTIABLE_REQUIREMENT_SECTION__SSS_ITEMS = eINSTANCE.getVSSSInstantiableRequirementSection_SssItems();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.micobs.svm.sss.impl.VSSSGeneralRequirementsImpl <em>VSSS General Requirements</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uah.aut.srg.micobs.svm.sss.impl.VSSSGeneralRequirementsImpl
		 * @see es.uah.aut.srg.micobs.svm.sss.impl.sssPackageImpl#getVSSSGeneralRequirements()
		 * @generated
		 */
		EClass VSSS_GENERAL_REQUIREMENTS = eINSTANCE.getVSSSGeneralRequirements();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.micobs.svm.sss.impl.VSSSCapabilitiesRequirementsImpl <em>VSSS Capabilities Requirements</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uah.aut.srg.micobs.svm.sss.impl.VSSSCapabilitiesRequirementsImpl
		 * @see es.uah.aut.srg.micobs.svm.sss.impl.sssPackageImpl#getVSSSCapabilitiesRequirements()
		 * @generated
		 */
		EClass VSSS_CAPABILITIES_REQUIREMENTS = eINSTANCE.getVSSSCapabilitiesRequirements();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.micobs.svm.sss.impl.VSSSSystemInterfaceRequirementsImpl <em>VSSS System Interface Requirements</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uah.aut.srg.micobs.svm.sss.impl.VSSSSystemInterfaceRequirementsImpl
		 * @see es.uah.aut.srg.micobs.svm.sss.impl.sssPackageImpl#getVSSSSystemInterfaceRequirements()
		 * @generated
		 */
		EClass VSSS_SYSTEM_INTERFACE_REQUIREMENTS = eINSTANCE.getVSSSSystemInterfaceRequirements();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.micobs.svm.sss.impl.VSSSAdaptationMissionizationRequirementsImpl <em>VSSS Adaptation Missionization Requirements</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uah.aut.srg.micobs.svm.sss.impl.VSSSAdaptationMissionizationRequirementsImpl
		 * @see es.uah.aut.srg.micobs.svm.sss.impl.sssPackageImpl#getVSSSAdaptationMissionizationRequirements()
		 * @generated
		 */
		EClass VSSS_ADAPTATION_MISSIONIZATION_REQUIREMENTS = eINSTANCE.getVSSSAdaptationMissionizationRequirements();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.micobs.svm.sss.impl.VSSSComputerResourceRequirementsImpl <em>VSSS Computer Resource Requirements</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uah.aut.srg.micobs.svm.sss.impl.VSSSComputerResourceRequirementsImpl
		 * @see es.uah.aut.srg.micobs.svm.sss.impl.sssPackageImpl#getVSSSComputerResourceRequirements()
		 * @generated
		 */
		EClass VSSS_COMPUTER_RESOURCE_REQUIREMENTS = eINSTANCE.getVSSSComputerResourceRequirements();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.micobs.svm.sss.impl.VSSSSecurityRequirementsImpl <em>VSSS Security Requirements</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uah.aut.srg.micobs.svm.sss.impl.VSSSSecurityRequirementsImpl
		 * @see es.uah.aut.srg.micobs.svm.sss.impl.sssPackageImpl#getVSSSSecurityRequirements()
		 * @generated
		 */
		EClass VSSS_SECURITY_REQUIREMENTS = eINSTANCE.getVSSSSecurityRequirements();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.micobs.svm.sss.impl.VSSSSafetyRequirementsImpl <em>VSSS Safety Requirements</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uah.aut.srg.micobs.svm.sss.impl.VSSSSafetyRequirementsImpl
		 * @see es.uah.aut.srg.micobs.svm.sss.impl.sssPackageImpl#getVSSSSafetyRequirements()
		 * @generated
		 */
		EClass VSSS_SAFETY_REQUIREMENTS = eINSTANCE.getVSSSSafetyRequirements();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.micobs.svm.sss.impl.VSSSReliabiltyAvailabilityRequirementsImpl <em>VSSS Reliabilty Availability Requirements</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uah.aut.srg.micobs.svm.sss.impl.VSSSReliabiltyAvailabilityRequirementsImpl
		 * @see es.uah.aut.srg.micobs.svm.sss.impl.sssPackageImpl#getVSSSReliabiltyAvailabilityRequirements()
		 * @generated
		 */
		EClass VSSS_RELIABILTY_AVAILABILITY_REQUIREMENTS = eINSTANCE.getVSSSReliabiltyAvailabilityRequirements();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.micobs.svm.sss.impl.VSSSQualityRequirementsImpl <em>VSSS Quality Requirements</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uah.aut.srg.micobs.svm.sss.impl.VSSSQualityRequirementsImpl
		 * @see es.uah.aut.srg.micobs.svm.sss.impl.sssPackageImpl#getVSSSQualityRequirements()
		 * @generated
		 */
		EClass VSSS_QUALITY_REQUIREMENTS = eINSTANCE.getVSSSQualityRequirements();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.micobs.svm.sss.impl.VSSSDesignRequirementsImpl <em>VSSS Design Requirements</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uah.aut.srg.micobs.svm.sss.impl.VSSSDesignRequirementsImpl
		 * @see es.uah.aut.srg.micobs.svm.sss.impl.sssPackageImpl#getVSSSDesignRequirements()
		 * @generated
		 */
		EClass VSSS_DESIGN_REQUIREMENTS = eINSTANCE.getVSSSDesignRequirements();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.micobs.svm.sss.impl.VSSSSoftwareOperationsRequirementsImpl <em>VSSS Software Operations Requirements</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uah.aut.srg.micobs.svm.sss.impl.VSSSSoftwareOperationsRequirementsImpl
		 * @see es.uah.aut.srg.micobs.svm.sss.impl.sssPackageImpl#getVSSSSoftwareOperationsRequirements()
		 * @generated
		 */
		EClass VSSS_SOFTWARE_OPERATIONS_REQUIREMENTS = eINSTANCE.getVSSSSoftwareOperationsRequirements();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.micobs.svm.sss.impl.VSSSSoftwareMaintenanceRequirementsImpl <em>VSSS Software Maintenance Requirements</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uah.aut.srg.micobs.svm.sss.impl.VSSSSoftwareMaintenanceRequirementsImpl
		 * @see es.uah.aut.srg.micobs.svm.sss.impl.sssPackageImpl#getVSSSSoftwareMaintenanceRequirements()
		 * @generated
		 */
		EClass VSSS_SOFTWARE_MAINTENANCE_REQUIREMENTS = eINSTANCE.getVSSSSoftwareMaintenanceRequirements();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.micobs.svm.sss.impl.VSSSSystemSoftwareObservabilityRequirementsImpl <em>VSSS System Software Observability Requirements</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uah.aut.srg.micobs.svm.sss.impl.VSSSSystemSoftwareObservabilityRequirementsImpl
		 * @see es.uah.aut.srg.micobs.svm.sss.impl.sssPackageImpl#getVSSSSystemSoftwareObservabilityRequirements()
		 * @generated
		 */
		EClass VSSS_SYSTEM_SOFTWARE_OBSERVABILITY_REQUIREMENTS = eINSTANCE.getVSSSSystemSoftwareObservabilityRequirements();

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
		 * The meta object literal for the '<em><b>Section Description</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VSSS_VERIFICATION_VALIDATION_INTEGRATION_REQUIREMENTS__SECTION_DESCRIPTION = eINSTANCE.getVSSSVerificationValidationIntegrationRequirements_SectionDescription();

		/**
		 * The meta object literal for the '<em><b>Verification Validation Process</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VSSS_VERIFICATION_VALIDATION_INTEGRATION_REQUIREMENTS__VERIFICATION_VALIDATION_PROCESS = eINSTANCE.getVSSSVerificationValidationIntegrationRequirements_VerificationValidationProcess();

		/**
		 * The meta object literal for the '<em><b>Validation Approach</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VSSS_VERIFICATION_VALIDATION_INTEGRATION_REQUIREMENTS__VALIDATION_APPROACH = eINSTANCE.getVSSSVerificationValidationIntegrationRequirements_ValidationApproach();

		/**
		 * The meta object literal for the '<em><b>Validation</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VSSS_VERIFICATION_VALIDATION_INTEGRATION_REQUIREMENTS__VALIDATION = eINSTANCE.getVSSSVerificationValidationIntegrationRequirements_Validation();

		/**
		 * The meta object literal for the '<em><b>Verification</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VSSS_VERIFICATION_VALIDATION_INTEGRATION_REQUIREMENTS__VERIFICATION = eINSTANCE.getVSSSVerificationValidationIntegrationRequirements_Verification();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.micobs.svm.sss.impl.VSSSVerificationValidationProcessRequirementsImpl <em>VSSS Verification Validation Process Requirements</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uah.aut.srg.micobs.svm.sss.impl.VSSSVerificationValidationProcessRequirementsImpl
		 * @see es.uah.aut.srg.micobs.svm.sss.impl.sssPackageImpl#getVSSSVerificationValidationProcessRequirements()
		 * @generated
		 */
		EClass VSSS_VERIFICATION_VALIDATION_PROCESS_REQUIREMENTS = eINSTANCE.getVSSSVerificationValidationProcessRequirements();

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
		 * The meta object literal for the '{@link es.uah.aut.srg.micobs.svm.sss.impl.VSSSVerificationRequirementsImpl <em>VSSS Verification Requirements</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uah.aut.srg.micobs.svm.sss.impl.VSSSVerificationRequirementsImpl
		 * @see es.uah.aut.srg.micobs.svm.sss.impl.sssPackageImpl#getVSSSVerificationRequirements()
		 * @generated
		 */
		EClass VSSS_VERIFICATION_REQUIREMENTS = eINSTANCE.getVSSSVerificationRequirements();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.micobs.svm.sss.impl.VSSSValidationRequirementsImpl <em>VSSS Validation Requirements</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uah.aut.srg.micobs.svm.sss.impl.VSSSValidationRequirementsImpl
		 * @see es.uah.aut.srg.micobs.svm.sss.impl.sssPackageImpl#getVSSSValidationRequirements()
		 * @generated
		 */
		EClass VSSS_VALIDATION_REQUIREMENTS = eINSTANCE.getVSSSValidationRequirements();

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
		 * The meta object literal for the '<em><b>Description</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VSSS_DOCUMENT_ITEM__DESCRIPTION = eINSTANCE.getVSSSDocumentItem_Description();

		/**
		 * The meta object literal for the '<em><b>Extended Description</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VSSS_DOCUMENT_ITEM__EXTENDED_DESCRIPTION = eINSTANCE.getVSSSDocumentItem_ExtendedDescription();

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
