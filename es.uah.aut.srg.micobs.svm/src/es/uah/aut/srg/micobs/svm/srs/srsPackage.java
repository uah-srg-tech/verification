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
package es.uah.aut.srg.micobs.svm.srs;

import es.uah.aut.srg.micobs.doctpl.doc.docPackage;

import es.uah.aut.srg.micobs.svm.tdm.tdmPackage;

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
 * @see es.uah.aut.srg.micobs.svm.srs.srsFactory
 * @model kind="package"
 * @generated
 */
public interface srsPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "srs";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://srg.aut.uah.es/micobs/svm/srs";

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
	srsPackage eINSTANCE = es.uah.aut.srg.micobs.svm.srs.impl.srsPackageImpl.init();

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.micobs.svm.srs.impl.VSRSDocumentImpl <em>VSRS Document</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uah.aut.srg.micobs.svm.srs.impl.VSRSDocumentImpl
	 * @see es.uah.aut.srg.micobs.svm.srs.impl.srsPackageImpl#getVSRSDocument()
	 * @generated
	 */
	int VSRS_DOCUMENT = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSRS_DOCUMENT__NAME = tdmPackage.VTRACEABLE_DOCUMENT__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSRS_DOCUMENT__ID = tdmPackage.VTRACEABLE_DOCUMENT__ID;

	/**
	 * The feature id for the '<em><b>Issue</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSRS_DOCUMENT__ISSUE = tdmPackage.VTRACEABLE_DOCUMENT__ISSUE;

	/**
	 * The feature id for the '<em><b>Revision</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSRS_DOCUMENT__REVISION = tdmPackage.VTRACEABLE_DOCUMENT__REVISION;

	/**
	 * The feature id for the '<em><b>Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSRS_DOCUMENT__DATE = tdmPackage.VTRACEABLE_DOCUMENT__DATE;

	/**
	 * The feature id for the '<em><b>Parents</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSRS_DOCUMENT__PARENTS = tdmPackage.VTRACEABLE_DOCUMENT__PARENTS;

	/**
	 * The feature id for the '<em><b>Groups</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSRS_DOCUMENT__GROUPS = tdmPackage.VTRACEABLE_DOCUMENT__GROUPS;

	/**
	 * The feature id for the '<em><b>Applicable Documents</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSRS_DOCUMENT__APPLICABLE_DOCUMENTS = tdmPackage.VTRACEABLE_DOCUMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Reference Documents</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSRS_DOCUMENT__REFERENCE_DOCUMENTS = tdmPackage.VTRACEABLE_DOCUMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Figures</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSRS_DOCUMENT__FIGURES = tdmPackage.VTRACEABLE_DOCUMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Tables</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSRS_DOCUMENT__TABLES = tdmPackage.VTRACEABLE_DOCUMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Sections</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSRS_DOCUMENT__SECTIONS = tdmPackage.VTRACEABLE_DOCUMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Introduction Section</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSRS_DOCUMENT__INTRODUCTION_SECTION = tdmPackage.VTRACEABLE_DOCUMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Applicable Documents Section</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSRS_DOCUMENT__APPLICABLE_DOCUMENTS_SECTION = tdmPackage.VTRACEABLE_DOCUMENT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Reference Documents Section</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSRS_DOCUMENT__REFERENCE_DOCUMENTS_SECTION = tdmPackage.VTRACEABLE_DOCUMENT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Terms Definitions Abbreviations Section</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSRS_DOCUMENT__TERMS_DEFINITIONS_ABBREVIATIONS_SECTION = tdmPackage.VTRACEABLE_DOCUMENT_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Software Overview Section</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSRS_DOCUMENT__SOFTWARE_OVERVIEW_SECTION = tdmPackage.VTRACEABLE_DOCUMENT_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Requirements Section</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSRS_DOCUMENT__REQUIREMENTS_SECTION = tdmPackage.VTRACEABLE_DOCUMENT_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Logical Models Section</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSRS_DOCUMENT__LOGICAL_MODELS_SECTION = tdmPackage.VTRACEABLE_DOCUMENT_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Srs Figures</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSRS_DOCUMENT__SRS_FIGURES = tdmPackage.VTRACEABLE_DOCUMENT_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Srs Tables</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSRS_DOCUMENT__SRS_TABLES = tdmPackage.VTRACEABLE_DOCUMENT_FEATURE_COUNT + 13;

	/**
	 * The number of structural features of the '<em>VSRS Document</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSRS_DOCUMENT_FEATURE_COUNT = tdmPackage.VTRACEABLE_DOCUMENT_FEATURE_COUNT + 14;

	/**
	 * The number of operations of the '<em>VSRS Document</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSRS_DOCUMENT_OPERATION_COUNT = tdmPackage.VTRACEABLE_DOCUMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.micobs.svm.srs.impl.VSRSIntroductionImpl <em>VSRS Introduction</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uah.aut.srg.micobs.svm.srs.impl.VSRSIntroductionImpl
	 * @see es.uah.aut.srg.micobs.svm.srs.impl.srsPackageImpl#getVSRSIntroduction()
	 * @generated
	 */
	int VSRS_INTRODUCTION = 1;

	/**
	 * The feature id for the '<em><b>Subsections</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSRS_INTRODUCTION__SUBSECTIONS = docPackage.DFIXED_SECTION__SUBSECTIONS;

	/**
	 * The feature id for the '<em><b>Srs Instatiable Subsections</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSRS_INTRODUCTION__SRS_INSTATIABLE_SUBSECTIONS = docPackage.DFIXED_SECTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>VSRS Introduction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSRS_INTRODUCTION_FEATURE_COUNT = docPackage.DFIXED_SECTION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>VSRS Introduction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSRS_INTRODUCTION_OPERATION_COUNT = docPackage.DFIXED_SECTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.micobs.svm.srs.impl.VSRSApplicableDocumentsImpl <em>VSRS Applicable Documents</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uah.aut.srg.micobs.svm.srs.impl.VSRSApplicableDocumentsImpl
	 * @see es.uah.aut.srg.micobs.svm.srs.impl.srsPackageImpl#getVSRSApplicableDocuments()
	 * @generated
	 */
	int VSRS_APPLICABLE_DOCUMENTS = 2;

	/**
	 * The feature id for the '<em><b>Subsections</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSRS_APPLICABLE_DOCUMENTS__SUBSECTIONS = docPackage.DFIXED_SECTION__SUBSECTIONS;

	/**
	 * The feature id for the '<em><b>Applicable Documents</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSRS_APPLICABLE_DOCUMENTS__APPLICABLE_DOCUMENTS = docPackage.DFIXED_SECTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>VSRS Applicable Documents</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSRS_APPLICABLE_DOCUMENTS_FEATURE_COUNT = docPackage.DFIXED_SECTION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>VSRS Applicable Documents</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSRS_APPLICABLE_DOCUMENTS_OPERATION_COUNT = docPackage.DFIXED_SECTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.micobs.svm.srs.impl.VSRSReferenceDocumentsImpl <em>VSRS Reference Documents</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uah.aut.srg.micobs.svm.srs.impl.VSRSReferenceDocumentsImpl
	 * @see es.uah.aut.srg.micobs.svm.srs.impl.srsPackageImpl#getVSRSReferenceDocuments()
	 * @generated
	 */
	int VSRS_REFERENCE_DOCUMENTS = 3;

	/**
	 * The feature id for the '<em><b>Subsections</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSRS_REFERENCE_DOCUMENTS__SUBSECTIONS = docPackage.DFIXED_SECTION__SUBSECTIONS;

	/**
	 * The feature id for the '<em><b>Reference Documents</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSRS_REFERENCE_DOCUMENTS__REFERENCE_DOCUMENTS = docPackage.DFIXED_SECTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>VSRS Reference Documents</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSRS_REFERENCE_DOCUMENTS_FEATURE_COUNT = docPackage.DFIXED_SECTION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>VSRS Reference Documents</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSRS_REFERENCE_DOCUMENTS_OPERATION_COUNT = docPackage.DFIXED_SECTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.micobs.svm.srs.impl.VSRSTermsDefinitionsAbbreviationsImpl <em>VSRS Terms Definitions Abbreviations</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uah.aut.srg.micobs.svm.srs.impl.VSRSTermsDefinitionsAbbreviationsImpl
	 * @see es.uah.aut.srg.micobs.svm.srs.impl.srsPackageImpl#getVSRSTermsDefinitionsAbbreviations()
	 * @generated
	 */
	int VSRS_TERMS_DEFINITIONS_ABBREVIATIONS = 4;

	/**
	 * The feature id for the '<em><b>Subsections</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSRS_TERMS_DEFINITIONS_ABBREVIATIONS__SUBSECTIONS = docPackage.DFIXED_SECTION__SUBSECTIONS;

	/**
	 * The feature id for the '<em><b>Terms</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSRS_TERMS_DEFINITIONS_ABBREVIATIONS__TERMS = docPackage.DFIXED_SECTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Definitions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSRS_TERMS_DEFINITIONS_ABBREVIATIONS__DEFINITIONS = docPackage.DFIXED_SECTION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Abbreviations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSRS_TERMS_DEFINITIONS_ABBREVIATIONS__ABBREVIATIONS = docPackage.DFIXED_SECTION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>VSRS Terms Definitions Abbreviations</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSRS_TERMS_DEFINITIONS_ABBREVIATIONS_FEATURE_COUNT = docPackage.DFIXED_SECTION_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>VSRS Terms Definitions Abbreviations</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSRS_TERMS_DEFINITIONS_ABBREVIATIONS_OPERATION_COUNT = docPackage.DFIXED_SECTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.micobs.svm.srs.impl.VSRSAbstractBriefDescriptionImpl <em>VSRS Abstract Brief Description</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uah.aut.srg.micobs.svm.srs.impl.VSRSAbstractBriefDescriptionImpl
	 * @see es.uah.aut.srg.micobs.svm.srs.impl.srsPackageImpl#getVSRSAbstractBriefDescription()
	 * @generated
	 */
	int VSRS_ABSTRACT_BRIEF_DESCRIPTION = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSRS_ABSTRACT_BRIEF_DESCRIPTION__NAME = 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSRS_ABSTRACT_BRIEF_DESCRIPTION__DESCRIPTION = 1;

	/**
	 * The number of structural features of the '<em>VSRS Abstract Brief Description</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSRS_ABSTRACT_BRIEF_DESCRIPTION_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>VSRS Abstract Brief Description</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSRS_ABSTRACT_BRIEF_DESCRIPTION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.micobs.svm.srs.impl.VSRSTermImpl <em>VSRS Term</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uah.aut.srg.micobs.svm.srs.impl.VSRSTermImpl
	 * @see es.uah.aut.srg.micobs.svm.srs.impl.srsPackageImpl#getVSRSTerm()
	 * @generated
	 */
	int VSRS_TERM = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSRS_TERM__NAME = VSRS_ABSTRACT_BRIEF_DESCRIPTION__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSRS_TERM__DESCRIPTION = VSRS_ABSTRACT_BRIEF_DESCRIPTION__DESCRIPTION;

	/**
	 * The number of structural features of the '<em>VSRS Term</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSRS_TERM_FEATURE_COUNT = VSRS_ABSTRACT_BRIEF_DESCRIPTION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>VSRS Term</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSRS_TERM_OPERATION_COUNT = VSRS_ABSTRACT_BRIEF_DESCRIPTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.micobs.svm.srs.impl.VSRSDefinitionImpl <em>VSRS Definition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uah.aut.srg.micobs.svm.srs.impl.VSRSDefinitionImpl
	 * @see es.uah.aut.srg.micobs.svm.srs.impl.srsPackageImpl#getVSRSDefinition()
	 * @generated
	 */
	int VSRS_DEFINITION = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSRS_DEFINITION__NAME = VSRS_ABSTRACT_BRIEF_DESCRIPTION__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSRS_DEFINITION__DESCRIPTION = VSRS_ABSTRACT_BRIEF_DESCRIPTION__DESCRIPTION;

	/**
	 * The number of structural features of the '<em>VSRS Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSRS_DEFINITION_FEATURE_COUNT = VSRS_ABSTRACT_BRIEF_DESCRIPTION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>VSRS Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSRS_DEFINITION_OPERATION_COUNT = VSRS_ABSTRACT_BRIEF_DESCRIPTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.micobs.svm.srs.impl.VSRSAbbreviationImpl <em>VSRS Abbreviation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uah.aut.srg.micobs.svm.srs.impl.VSRSAbbreviationImpl
	 * @see es.uah.aut.srg.micobs.svm.srs.impl.srsPackageImpl#getVSRSAbbreviation()
	 * @generated
	 */
	int VSRS_ABBREVIATION = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSRS_ABBREVIATION__NAME = VSRS_ABSTRACT_BRIEF_DESCRIPTION__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSRS_ABBREVIATION__DESCRIPTION = VSRS_ABSTRACT_BRIEF_DESCRIPTION__DESCRIPTION;

	/**
	 * The number of structural features of the '<em>VSRS Abbreviation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSRS_ABBREVIATION_FEATURE_COUNT = VSRS_ABSTRACT_BRIEF_DESCRIPTION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>VSRS Abbreviation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSRS_ABBREVIATION_OPERATION_COUNT = VSRS_ABSTRACT_BRIEF_DESCRIPTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.micobs.svm.srs.impl.VSRSFixedSectionImpl <em>VSRS Fixed Section</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uah.aut.srg.micobs.svm.srs.impl.VSRSFixedSectionImpl
	 * @see es.uah.aut.srg.micobs.svm.srs.impl.srsPackageImpl#getVSRSFixedSection()
	 * @generated
	 */
	int VSRS_FIXED_SECTION = 9;

	/**
	 * The feature id for the '<em><b>Subsections</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSRS_FIXED_SECTION__SUBSECTIONS = docPackage.DFIXED_SECTION__SUBSECTIONS;

	/**
	 * The feature id for the '<em><b>Body</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSRS_FIXED_SECTION__BODY = docPackage.DFIXED_SECTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Srs Instatiable Subsections</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSRS_FIXED_SECTION__SRS_INSTATIABLE_SUBSECTIONS = docPackage.DFIXED_SECTION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>VSRS Fixed Section</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSRS_FIXED_SECTION_FEATURE_COUNT = docPackage.DFIXED_SECTION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>VSRS Fixed Section</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSRS_FIXED_SECTION_OPERATION_COUNT = docPackage.DFIXED_SECTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.micobs.svm.srs.impl.VSRSInstantiableSectionImpl <em>VSRS Instantiable Section</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uah.aut.srg.micobs.svm.srs.impl.VSRSInstantiableSectionImpl
	 * @see es.uah.aut.srg.micobs.svm.srs.impl.srsPackageImpl#getVSRSInstantiableSection()
	 * @generated
	 */
	int VSRS_INSTANTIABLE_SECTION = 10;

	/**
	 * The feature id for the '<em><b>Subsections</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSRS_INSTANTIABLE_SECTION__SUBSECTIONS = docPackage.DINSTANTIABLE_SECTION__SUBSECTIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSRS_INSTANTIABLE_SECTION__NAME = docPackage.DINSTANTIABLE_SECTION__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSRS_INSTANTIABLE_SECTION__DESCRIPTION = docPackage.DINSTANTIABLE_SECTION__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Body</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSRS_INSTANTIABLE_SECTION__BODY = docPackage.DINSTANTIABLE_SECTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Srs Instatiable Subsections</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSRS_INSTANTIABLE_SECTION__SRS_INSTATIABLE_SUBSECTIONS = docPackage.DINSTANTIABLE_SECTION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>VSRS Instantiable Section</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSRS_INSTANTIABLE_SECTION_FEATURE_COUNT = docPackage.DINSTANTIABLE_SECTION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>VSRS Instantiable Section</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSRS_INSTANTIABLE_SECTION_OPERATION_COUNT = docPackage.DINSTANTIABLE_SECTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.micobs.svm.srs.impl.VSRSSoftwareOverviewImpl <em>VSRS Software Overview</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uah.aut.srg.micobs.svm.srs.impl.VSRSSoftwareOverviewImpl
	 * @see es.uah.aut.srg.micobs.svm.srs.impl.srsPackageImpl#getVSRSSoftwareOverview()
	 * @generated
	 */
	int VSRS_SOFTWARE_OVERVIEW = 11;

	/**
	 * The feature id for the '<em><b>Subsections</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSRS_SOFTWARE_OVERVIEW__SUBSECTIONS = docPackage.DFIXED_SECTION__SUBSECTIONS;

	/**
	 * The feature id for the '<em><b>Function Purpose</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSRS_SOFTWARE_OVERVIEW__FUNCTION_PURPOSE = docPackage.DFIXED_SECTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Environmental Considerations</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSRS_SOFTWARE_OVERVIEW__ENVIRONMENTAL_CONSIDERATIONS = docPackage.DFIXED_SECTION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Relation Other Systems</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSRS_SOFTWARE_OVERVIEW__RELATION_OTHER_SYSTEMS = docPackage.DFIXED_SECTION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Constraints</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSRS_SOFTWARE_OVERVIEW__CONSTRAINTS = docPackage.DFIXED_SECTION_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>VSRS Software Overview</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSRS_SOFTWARE_OVERVIEW_FEATURE_COUNT = docPackage.DFIXED_SECTION_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>VSRS Software Overview</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSRS_SOFTWARE_OVERVIEW_OPERATION_COUNT = docPackage.DFIXED_SECTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.micobs.svm.srs.impl.VSRSAbstractRequirementSectionImpl <em>VSRS Abstract Requirement Section</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uah.aut.srg.micobs.svm.srs.impl.VSRSAbstractRequirementSectionImpl
	 * @see es.uah.aut.srg.micobs.svm.srs.impl.srsPackageImpl#getVSRSAbstractRequirementSection()
	 * @generated
	 */
	int VSRS_ABSTRACT_REQUIREMENT_SECTION = 12;

	/**
	 * The feature id for the '<em><b>Items</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSRS_ABSTRACT_REQUIREMENT_SECTION__ITEMS = tdmPackage.VTRACEABLE_DOCUMENT_FIXED_GROUP__ITEMS;

	/**
	 * The feature id for the '<em><b>Subsections</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSRS_ABSTRACT_REQUIREMENT_SECTION__SUBSECTIONS = tdmPackage.VTRACEABLE_DOCUMENT_FIXED_GROUP_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Section Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSRS_ABSTRACT_REQUIREMENT_SECTION__SECTION_DESCRIPTION = tdmPackage.VTRACEABLE_DOCUMENT_FIXED_GROUP_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Srs Items</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSRS_ABSTRACT_REQUIREMENT_SECTION__SRS_ITEMS = tdmPackage.VTRACEABLE_DOCUMENT_FIXED_GROUP_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Srs Requirement Subsections</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSRS_ABSTRACT_REQUIREMENT_SECTION__SRS_REQUIREMENT_SUBSECTIONS = tdmPackage.VTRACEABLE_DOCUMENT_FIXED_GROUP_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>VSRS Abstract Requirement Section</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSRS_ABSTRACT_REQUIREMENT_SECTION_FEATURE_COUNT = tdmPackage.VTRACEABLE_DOCUMENT_FIXED_GROUP_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>VSRS Abstract Requirement Section</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSRS_ABSTRACT_REQUIREMENT_SECTION_OPERATION_COUNT = tdmPackage.VTRACEABLE_DOCUMENT_FIXED_GROUP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.micobs.svm.srs.impl.VSRSInstantiableRequirementSectionImpl <em>VSRS Instantiable Requirement Section</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uah.aut.srg.micobs.svm.srs.impl.VSRSInstantiableRequirementSectionImpl
	 * @see es.uah.aut.srg.micobs.svm.srs.impl.srsPackageImpl#getVSRSInstantiableRequirementSection()
	 * @generated
	 */
	int VSRS_INSTANTIABLE_REQUIREMENT_SECTION = 13;

	/**
	 * The feature id for the '<em><b>Items</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSRS_INSTANTIABLE_REQUIREMENT_SECTION__ITEMS = tdmPackage.VTRACEABLE_DOCUMENT_INSTANTIABLE_GROUP__ITEMS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSRS_INSTANTIABLE_REQUIREMENT_SECTION__NAME = tdmPackage.VTRACEABLE_DOCUMENT_INSTANTIABLE_GROUP__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSRS_INSTANTIABLE_REQUIREMENT_SECTION__DESCRIPTION = tdmPackage.VTRACEABLE_DOCUMENT_INSTANTIABLE_GROUP__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Subsections</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSRS_INSTANTIABLE_REQUIREMENT_SECTION__SUBSECTIONS = tdmPackage.VTRACEABLE_DOCUMENT_INSTANTIABLE_GROUP_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Section Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSRS_INSTANTIABLE_REQUIREMENT_SECTION__SECTION_DESCRIPTION = tdmPackage.VTRACEABLE_DOCUMENT_INSTANTIABLE_GROUP_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Srs Items</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSRS_INSTANTIABLE_REQUIREMENT_SECTION__SRS_ITEMS = tdmPackage.VTRACEABLE_DOCUMENT_INSTANTIABLE_GROUP_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>VSRS Instantiable Requirement Section</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSRS_INSTANTIABLE_REQUIREMENT_SECTION_FEATURE_COUNT = tdmPackage.VTRACEABLE_DOCUMENT_INSTANTIABLE_GROUP_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>VSRS Instantiable Requirement Section</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSRS_INSTANTIABLE_REQUIREMENT_SECTION_OPERATION_COUNT = tdmPackage.VTRACEABLE_DOCUMENT_INSTANTIABLE_GROUP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.micobs.svm.srs.impl.VSRSRequirementsImpl <em>VSRS Requirements</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uah.aut.srg.micobs.svm.srs.impl.VSRSRequirementsImpl
	 * @see es.uah.aut.srg.micobs.svm.srs.impl.srsPackageImpl#getVSRSRequirements()
	 * @generated
	 */
	int VSRS_REQUIREMENTS = 14;

	/**
	 * The feature id for the '<em><b>Subsections</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSRS_REQUIREMENTS__SUBSECTIONS = docPackage.DFIXED_SECTION__SUBSECTIONS;

	/**
	 * The feature id for the '<em><b>Section Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSRS_REQUIREMENTS__SECTION_DESCRIPTION = docPackage.DFIXED_SECTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>General</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSRS_REQUIREMENTS__GENERAL = docPackage.DFIXED_SECTION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Functional</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSRS_REQUIREMENTS__FUNCTIONAL = docPackage.DFIXED_SECTION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Performance</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSRS_REQUIREMENTS__PERFORMANCE = docPackage.DFIXED_SECTION_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Interface</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSRS_REQUIREMENTS__INTERFACE = docPackage.DFIXED_SECTION_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Operational</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSRS_REQUIREMENTS__OPERATIONAL = docPackage.DFIXED_SECTION_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Resources</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSRS_REQUIREMENTS__RESOURCES = docPackage.DFIXED_SECTION_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Design</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSRS_REQUIREMENTS__DESIGN = docPackage.DFIXED_SECTION_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Security Privacy</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSRS_REQUIREMENTS__SECURITY_PRIVACY = docPackage.DFIXED_SECTION_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Portability</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSRS_REQUIREMENTS__PORTABILITY = docPackage.DFIXED_SECTION_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Sw Quality</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSRS_REQUIREMENTS__SW_QUALITY = docPackage.DFIXED_SECTION_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Sw Reliabilty</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSRS_REQUIREMENTS__SW_RELIABILTY = docPackage.DFIXED_SECTION_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Sw Maintainability</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSRS_REQUIREMENTS__SW_MAINTAINABILITY = docPackage.DFIXED_SECTION_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Sw Safety</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSRS_REQUIREMENTS__SW_SAFETY = docPackage.DFIXED_SECTION_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>Sw Configuration Delivery</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSRS_REQUIREMENTS__SW_CONFIGURATION_DELIVERY = docPackage.DFIXED_SECTION_FEATURE_COUNT + 14;

	/**
	 * The feature id for the '<em><b>Data Definition DB</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSRS_REQUIREMENTS__DATA_DEFINITION_DB = docPackage.DFIXED_SECTION_FEATURE_COUNT + 15;

	/**
	 * The feature id for the '<em><b>Human Factors</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSRS_REQUIREMENTS__HUMAN_FACTORS = docPackage.DFIXED_SECTION_FEATURE_COUNT + 16;

	/**
	 * The feature id for the '<em><b>Adaptation Installation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSRS_REQUIREMENTS__ADAPTATION_INSTALLATION = docPackage.DFIXED_SECTION_FEATURE_COUNT + 17;

	/**
	 * The number of structural features of the '<em>VSRS Requirements</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSRS_REQUIREMENTS_FEATURE_COUNT = docPackage.DFIXED_SECTION_FEATURE_COUNT + 18;

	/**
	 * The number of operations of the '<em>VSRS Requirements</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSRS_REQUIREMENTS_OPERATION_COUNT = docPackage.DFIXED_SECTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.micobs.svm.srs.impl.VSRSGeneralRequirementsImpl <em>VSRS General Requirements</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uah.aut.srg.micobs.svm.srs.impl.VSRSGeneralRequirementsImpl
	 * @see es.uah.aut.srg.micobs.svm.srs.impl.srsPackageImpl#getVSRSGeneralRequirements()
	 * @generated
	 */
	int VSRS_GENERAL_REQUIREMENTS = 15;

	/**
	 * The feature id for the '<em><b>Items</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSRS_GENERAL_REQUIREMENTS__ITEMS = VSRS_ABSTRACT_REQUIREMENT_SECTION__ITEMS;

	/**
	 * The feature id for the '<em><b>Subsections</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSRS_GENERAL_REQUIREMENTS__SUBSECTIONS = VSRS_ABSTRACT_REQUIREMENT_SECTION__SUBSECTIONS;

	/**
	 * The feature id for the '<em><b>Section Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSRS_GENERAL_REQUIREMENTS__SECTION_DESCRIPTION = VSRS_ABSTRACT_REQUIREMENT_SECTION__SECTION_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Srs Items</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSRS_GENERAL_REQUIREMENTS__SRS_ITEMS = VSRS_ABSTRACT_REQUIREMENT_SECTION__SRS_ITEMS;

	/**
	 * The feature id for the '<em><b>Srs Requirement Subsections</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSRS_GENERAL_REQUIREMENTS__SRS_REQUIREMENT_SUBSECTIONS = VSRS_ABSTRACT_REQUIREMENT_SECTION__SRS_REQUIREMENT_SUBSECTIONS;

	/**
	 * The number of structural features of the '<em>VSRS General Requirements</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSRS_GENERAL_REQUIREMENTS_FEATURE_COUNT = VSRS_ABSTRACT_REQUIREMENT_SECTION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>VSRS General Requirements</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSRS_GENERAL_REQUIREMENTS_OPERATION_COUNT = VSRS_ABSTRACT_REQUIREMENT_SECTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.micobs.svm.srs.impl.VSRSFunctionalRequirementsImpl <em>VSRS Functional Requirements</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uah.aut.srg.micobs.svm.srs.impl.VSRSFunctionalRequirementsImpl
	 * @see es.uah.aut.srg.micobs.svm.srs.impl.srsPackageImpl#getVSRSFunctionalRequirements()
	 * @generated
	 */
	int VSRS_FUNCTIONAL_REQUIREMENTS = 16;

	/**
	 * The feature id for the '<em><b>Items</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSRS_FUNCTIONAL_REQUIREMENTS__ITEMS = VSRS_ABSTRACT_REQUIREMENT_SECTION__ITEMS;

	/**
	 * The feature id for the '<em><b>Subsections</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSRS_FUNCTIONAL_REQUIREMENTS__SUBSECTIONS = VSRS_ABSTRACT_REQUIREMENT_SECTION__SUBSECTIONS;

	/**
	 * The feature id for the '<em><b>Section Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSRS_FUNCTIONAL_REQUIREMENTS__SECTION_DESCRIPTION = VSRS_ABSTRACT_REQUIREMENT_SECTION__SECTION_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Srs Items</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSRS_FUNCTIONAL_REQUIREMENTS__SRS_ITEMS = VSRS_ABSTRACT_REQUIREMENT_SECTION__SRS_ITEMS;

	/**
	 * The feature id for the '<em><b>Srs Requirement Subsections</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSRS_FUNCTIONAL_REQUIREMENTS__SRS_REQUIREMENT_SUBSECTIONS = VSRS_ABSTRACT_REQUIREMENT_SECTION__SRS_REQUIREMENT_SUBSECTIONS;

	/**
	 * The number of structural features of the '<em>VSRS Functional Requirements</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSRS_FUNCTIONAL_REQUIREMENTS_FEATURE_COUNT = VSRS_ABSTRACT_REQUIREMENT_SECTION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>VSRS Functional Requirements</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSRS_FUNCTIONAL_REQUIREMENTS_OPERATION_COUNT = VSRS_ABSTRACT_REQUIREMENT_SECTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.micobs.svm.srs.impl.VSRSPerformanceRequirementsImpl <em>VSRS Performance Requirements</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uah.aut.srg.micobs.svm.srs.impl.VSRSPerformanceRequirementsImpl
	 * @see es.uah.aut.srg.micobs.svm.srs.impl.srsPackageImpl#getVSRSPerformanceRequirements()
	 * @generated
	 */
	int VSRS_PERFORMANCE_REQUIREMENTS = 17;

	/**
	 * The feature id for the '<em><b>Items</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSRS_PERFORMANCE_REQUIREMENTS__ITEMS = VSRS_ABSTRACT_REQUIREMENT_SECTION__ITEMS;

	/**
	 * The feature id for the '<em><b>Subsections</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSRS_PERFORMANCE_REQUIREMENTS__SUBSECTIONS = VSRS_ABSTRACT_REQUIREMENT_SECTION__SUBSECTIONS;

	/**
	 * The feature id for the '<em><b>Section Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSRS_PERFORMANCE_REQUIREMENTS__SECTION_DESCRIPTION = VSRS_ABSTRACT_REQUIREMENT_SECTION__SECTION_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Srs Items</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSRS_PERFORMANCE_REQUIREMENTS__SRS_ITEMS = VSRS_ABSTRACT_REQUIREMENT_SECTION__SRS_ITEMS;

	/**
	 * The feature id for the '<em><b>Srs Requirement Subsections</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSRS_PERFORMANCE_REQUIREMENTS__SRS_REQUIREMENT_SUBSECTIONS = VSRS_ABSTRACT_REQUIREMENT_SECTION__SRS_REQUIREMENT_SUBSECTIONS;

	/**
	 * The number of structural features of the '<em>VSRS Performance Requirements</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSRS_PERFORMANCE_REQUIREMENTS_FEATURE_COUNT = VSRS_ABSTRACT_REQUIREMENT_SECTION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>VSRS Performance Requirements</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSRS_PERFORMANCE_REQUIREMENTS_OPERATION_COUNT = VSRS_ABSTRACT_REQUIREMENT_SECTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.micobs.svm.srs.impl.VSRSInterfaceRequirementsImpl <em>VSRS Interface Requirements</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uah.aut.srg.micobs.svm.srs.impl.VSRSInterfaceRequirementsImpl
	 * @see es.uah.aut.srg.micobs.svm.srs.impl.srsPackageImpl#getVSRSInterfaceRequirements()
	 * @generated
	 */
	int VSRS_INTERFACE_REQUIREMENTS = 18;

	/**
	 * The feature id for the '<em><b>Items</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSRS_INTERFACE_REQUIREMENTS__ITEMS = VSRS_ABSTRACT_REQUIREMENT_SECTION__ITEMS;

	/**
	 * The feature id for the '<em><b>Subsections</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSRS_INTERFACE_REQUIREMENTS__SUBSECTIONS = VSRS_ABSTRACT_REQUIREMENT_SECTION__SUBSECTIONS;

	/**
	 * The feature id for the '<em><b>Section Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSRS_INTERFACE_REQUIREMENTS__SECTION_DESCRIPTION = VSRS_ABSTRACT_REQUIREMENT_SECTION__SECTION_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Srs Items</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSRS_INTERFACE_REQUIREMENTS__SRS_ITEMS = VSRS_ABSTRACT_REQUIREMENT_SECTION__SRS_ITEMS;

	/**
	 * The feature id for the '<em><b>Srs Requirement Subsections</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSRS_INTERFACE_REQUIREMENTS__SRS_REQUIREMENT_SUBSECTIONS = VSRS_ABSTRACT_REQUIREMENT_SECTION__SRS_REQUIREMENT_SUBSECTIONS;

	/**
	 * The number of structural features of the '<em>VSRS Interface Requirements</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSRS_INTERFACE_REQUIREMENTS_FEATURE_COUNT = VSRS_ABSTRACT_REQUIREMENT_SECTION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>VSRS Interface Requirements</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSRS_INTERFACE_REQUIREMENTS_OPERATION_COUNT = VSRS_ABSTRACT_REQUIREMENT_SECTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.micobs.svm.srs.impl.VSRSOperationalRequirementsImpl <em>VSRS Operational Requirements</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uah.aut.srg.micobs.svm.srs.impl.VSRSOperationalRequirementsImpl
	 * @see es.uah.aut.srg.micobs.svm.srs.impl.srsPackageImpl#getVSRSOperationalRequirements()
	 * @generated
	 */
	int VSRS_OPERATIONAL_REQUIREMENTS = 19;

	/**
	 * The feature id for the '<em><b>Items</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSRS_OPERATIONAL_REQUIREMENTS__ITEMS = VSRS_ABSTRACT_REQUIREMENT_SECTION__ITEMS;

	/**
	 * The feature id for the '<em><b>Subsections</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSRS_OPERATIONAL_REQUIREMENTS__SUBSECTIONS = VSRS_ABSTRACT_REQUIREMENT_SECTION__SUBSECTIONS;

	/**
	 * The feature id for the '<em><b>Section Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSRS_OPERATIONAL_REQUIREMENTS__SECTION_DESCRIPTION = VSRS_ABSTRACT_REQUIREMENT_SECTION__SECTION_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Srs Items</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSRS_OPERATIONAL_REQUIREMENTS__SRS_ITEMS = VSRS_ABSTRACT_REQUIREMENT_SECTION__SRS_ITEMS;

	/**
	 * The feature id for the '<em><b>Srs Requirement Subsections</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSRS_OPERATIONAL_REQUIREMENTS__SRS_REQUIREMENT_SUBSECTIONS = VSRS_ABSTRACT_REQUIREMENT_SECTION__SRS_REQUIREMENT_SUBSECTIONS;

	/**
	 * The number of structural features of the '<em>VSRS Operational Requirements</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSRS_OPERATIONAL_REQUIREMENTS_FEATURE_COUNT = VSRS_ABSTRACT_REQUIREMENT_SECTION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>VSRS Operational Requirements</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSRS_OPERATIONAL_REQUIREMENTS_OPERATION_COUNT = VSRS_ABSTRACT_REQUIREMENT_SECTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.micobs.svm.srs.impl.VSRSResourcesRequirementsImpl <em>VSRS Resources Requirements</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uah.aut.srg.micobs.svm.srs.impl.VSRSResourcesRequirementsImpl
	 * @see es.uah.aut.srg.micobs.svm.srs.impl.srsPackageImpl#getVSRSResourcesRequirements()
	 * @generated
	 */
	int VSRS_RESOURCES_REQUIREMENTS = 20;

	/**
	 * The feature id for the '<em><b>Items</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSRS_RESOURCES_REQUIREMENTS__ITEMS = VSRS_ABSTRACT_REQUIREMENT_SECTION__ITEMS;

	/**
	 * The feature id for the '<em><b>Subsections</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSRS_RESOURCES_REQUIREMENTS__SUBSECTIONS = VSRS_ABSTRACT_REQUIREMENT_SECTION__SUBSECTIONS;

	/**
	 * The feature id for the '<em><b>Section Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSRS_RESOURCES_REQUIREMENTS__SECTION_DESCRIPTION = VSRS_ABSTRACT_REQUIREMENT_SECTION__SECTION_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Srs Items</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSRS_RESOURCES_REQUIREMENTS__SRS_ITEMS = VSRS_ABSTRACT_REQUIREMENT_SECTION__SRS_ITEMS;

	/**
	 * The feature id for the '<em><b>Srs Requirement Subsections</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSRS_RESOURCES_REQUIREMENTS__SRS_REQUIREMENT_SUBSECTIONS = VSRS_ABSTRACT_REQUIREMENT_SECTION__SRS_REQUIREMENT_SUBSECTIONS;

	/**
	 * The number of structural features of the '<em>VSRS Resources Requirements</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSRS_RESOURCES_REQUIREMENTS_FEATURE_COUNT = VSRS_ABSTRACT_REQUIREMENT_SECTION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>VSRS Resources Requirements</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSRS_RESOURCES_REQUIREMENTS_OPERATION_COUNT = VSRS_ABSTRACT_REQUIREMENT_SECTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.micobs.svm.srs.impl.VSRSDesignRequirementsImpl <em>VSRS Design Requirements</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uah.aut.srg.micobs.svm.srs.impl.VSRSDesignRequirementsImpl
	 * @see es.uah.aut.srg.micobs.svm.srs.impl.srsPackageImpl#getVSRSDesignRequirements()
	 * @generated
	 */
	int VSRS_DESIGN_REQUIREMENTS = 21;

	/**
	 * The feature id for the '<em><b>Items</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSRS_DESIGN_REQUIREMENTS__ITEMS = VSRS_ABSTRACT_REQUIREMENT_SECTION__ITEMS;

	/**
	 * The feature id for the '<em><b>Subsections</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSRS_DESIGN_REQUIREMENTS__SUBSECTIONS = VSRS_ABSTRACT_REQUIREMENT_SECTION__SUBSECTIONS;

	/**
	 * The feature id for the '<em><b>Section Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSRS_DESIGN_REQUIREMENTS__SECTION_DESCRIPTION = VSRS_ABSTRACT_REQUIREMENT_SECTION__SECTION_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Srs Items</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSRS_DESIGN_REQUIREMENTS__SRS_ITEMS = VSRS_ABSTRACT_REQUIREMENT_SECTION__SRS_ITEMS;

	/**
	 * The feature id for the '<em><b>Srs Requirement Subsections</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSRS_DESIGN_REQUIREMENTS__SRS_REQUIREMENT_SUBSECTIONS = VSRS_ABSTRACT_REQUIREMENT_SECTION__SRS_REQUIREMENT_SUBSECTIONS;

	/**
	 * The number of structural features of the '<em>VSRS Design Requirements</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSRS_DESIGN_REQUIREMENTS_FEATURE_COUNT = VSRS_ABSTRACT_REQUIREMENT_SECTION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>VSRS Design Requirements</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSRS_DESIGN_REQUIREMENTS_OPERATION_COUNT = VSRS_ABSTRACT_REQUIREMENT_SECTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.micobs.svm.srs.impl.VSRSSecurityPrivacyRequirementsImpl <em>VSRS Security Privacy Requirements</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uah.aut.srg.micobs.svm.srs.impl.VSRSSecurityPrivacyRequirementsImpl
	 * @see es.uah.aut.srg.micobs.svm.srs.impl.srsPackageImpl#getVSRSSecurityPrivacyRequirements()
	 * @generated
	 */
	int VSRS_SECURITY_PRIVACY_REQUIREMENTS = 22;

	/**
	 * The feature id for the '<em><b>Items</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSRS_SECURITY_PRIVACY_REQUIREMENTS__ITEMS = VSRS_ABSTRACT_REQUIREMENT_SECTION__ITEMS;

	/**
	 * The feature id for the '<em><b>Subsections</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSRS_SECURITY_PRIVACY_REQUIREMENTS__SUBSECTIONS = VSRS_ABSTRACT_REQUIREMENT_SECTION__SUBSECTIONS;

	/**
	 * The feature id for the '<em><b>Section Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSRS_SECURITY_PRIVACY_REQUIREMENTS__SECTION_DESCRIPTION = VSRS_ABSTRACT_REQUIREMENT_SECTION__SECTION_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Srs Items</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSRS_SECURITY_PRIVACY_REQUIREMENTS__SRS_ITEMS = VSRS_ABSTRACT_REQUIREMENT_SECTION__SRS_ITEMS;

	/**
	 * The feature id for the '<em><b>Srs Requirement Subsections</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSRS_SECURITY_PRIVACY_REQUIREMENTS__SRS_REQUIREMENT_SUBSECTIONS = VSRS_ABSTRACT_REQUIREMENT_SECTION__SRS_REQUIREMENT_SUBSECTIONS;

	/**
	 * The number of structural features of the '<em>VSRS Security Privacy Requirements</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSRS_SECURITY_PRIVACY_REQUIREMENTS_FEATURE_COUNT = VSRS_ABSTRACT_REQUIREMENT_SECTION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>VSRS Security Privacy Requirements</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSRS_SECURITY_PRIVACY_REQUIREMENTS_OPERATION_COUNT = VSRS_ABSTRACT_REQUIREMENT_SECTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.micobs.svm.srs.impl.VSRSPortabilityRequirementsImpl <em>VSRS Portability Requirements</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uah.aut.srg.micobs.svm.srs.impl.VSRSPortabilityRequirementsImpl
	 * @see es.uah.aut.srg.micobs.svm.srs.impl.srsPackageImpl#getVSRSPortabilityRequirements()
	 * @generated
	 */
	int VSRS_PORTABILITY_REQUIREMENTS = 23;

	/**
	 * The feature id for the '<em><b>Items</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSRS_PORTABILITY_REQUIREMENTS__ITEMS = VSRS_ABSTRACT_REQUIREMENT_SECTION__ITEMS;

	/**
	 * The feature id for the '<em><b>Subsections</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSRS_PORTABILITY_REQUIREMENTS__SUBSECTIONS = VSRS_ABSTRACT_REQUIREMENT_SECTION__SUBSECTIONS;

	/**
	 * The feature id for the '<em><b>Section Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSRS_PORTABILITY_REQUIREMENTS__SECTION_DESCRIPTION = VSRS_ABSTRACT_REQUIREMENT_SECTION__SECTION_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Srs Items</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSRS_PORTABILITY_REQUIREMENTS__SRS_ITEMS = VSRS_ABSTRACT_REQUIREMENT_SECTION__SRS_ITEMS;

	/**
	 * The feature id for the '<em><b>Srs Requirement Subsections</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSRS_PORTABILITY_REQUIREMENTS__SRS_REQUIREMENT_SUBSECTIONS = VSRS_ABSTRACT_REQUIREMENT_SECTION__SRS_REQUIREMENT_SUBSECTIONS;

	/**
	 * The number of structural features of the '<em>VSRS Portability Requirements</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSRS_PORTABILITY_REQUIREMENTS_FEATURE_COUNT = VSRS_ABSTRACT_REQUIREMENT_SECTION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>VSRS Portability Requirements</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSRS_PORTABILITY_REQUIREMENTS_OPERATION_COUNT = VSRS_ABSTRACT_REQUIREMENT_SECTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.micobs.svm.srs.impl.VSRSSWQualityRequirementsImpl <em>VSRSSW Quality Requirements</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uah.aut.srg.micobs.svm.srs.impl.VSRSSWQualityRequirementsImpl
	 * @see es.uah.aut.srg.micobs.svm.srs.impl.srsPackageImpl#getVSRSSWQualityRequirements()
	 * @generated
	 */
	int VSRSSW_QUALITY_REQUIREMENTS = 24;

	/**
	 * The feature id for the '<em><b>Items</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSRSSW_QUALITY_REQUIREMENTS__ITEMS = VSRS_ABSTRACT_REQUIREMENT_SECTION__ITEMS;

	/**
	 * The feature id for the '<em><b>Subsections</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSRSSW_QUALITY_REQUIREMENTS__SUBSECTIONS = VSRS_ABSTRACT_REQUIREMENT_SECTION__SUBSECTIONS;

	/**
	 * The feature id for the '<em><b>Section Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSRSSW_QUALITY_REQUIREMENTS__SECTION_DESCRIPTION = VSRS_ABSTRACT_REQUIREMENT_SECTION__SECTION_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Srs Items</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSRSSW_QUALITY_REQUIREMENTS__SRS_ITEMS = VSRS_ABSTRACT_REQUIREMENT_SECTION__SRS_ITEMS;

	/**
	 * The feature id for the '<em><b>Srs Requirement Subsections</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSRSSW_QUALITY_REQUIREMENTS__SRS_REQUIREMENT_SUBSECTIONS = VSRS_ABSTRACT_REQUIREMENT_SECTION__SRS_REQUIREMENT_SUBSECTIONS;

	/**
	 * The number of structural features of the '<em>VSRSSW Quality Requirements</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSRSSW_QUALITY_REQUIREMENTS_FEATURE_COUNT = VSRS_ABSTRACT_REQUIREMENT_SECTION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>VSRSSW Quality Requirements</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSRSSW_QUALITY_REQUIREMENTS_OPERATION_COUNT = VSRS_ABSTRACT_REQUIREMENT_SECTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.micobs.svm.srs.impl.VSRSSWReliabiltyRequirementsImpl <em>VSRSSW Reliabilty Requirements</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uah.aut.srg.micobs.svm.srs.impl.VSRSSWReliabiltyRequirementsImpl
	 * @see es.uah.aut.srg.micobs.svm.srs.impl.srsPackageImpl#getVSRSSWReliabiltyRequirements()
	 * @generated
	 */
	int VSRSSW_RELIABILTY_REQUIREMENTS = 25;

	/**
	 * The feature id for the '<em><b>Items</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSRSSW_RELIABILTY_REQUIREMENTS__ITEMS = VSRS_ABSTRACT_REQUIREMENT_SECTION__ITEMS;

	/**
	 * The feature id for the '<em><b>Subsections</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSRSSW_RELIABILTY_REQUIREMENTS__SUBSECTIONS = VSRS_ABSTRACT_REQUIREMENT_SECTION__SUBSECTIONS;

	/**
	 * The feature id for the '<em><b>Section Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSRSSW_RELIABILTY_REQUIREMENTS__SECTION_DESCRIPTION = VSRS_ABSTRACT_REQUIREMENT_SECTION__SECTION_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Srs Items</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSRSSW_RELIABILTY_REQUIREMENTS__SRS_ITEMS = VSRS_ABSTRACT_REQUIREMENT_SECTION__SRS_ITEMS;

	/**
	 * The feature id for the '<em><b>Srs Requirement Subsections</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSRSSW_RELIABILTY_REQUIREMENTS__SRS_REQUIREMENT_SUBSECTIONS = VSRS_ABSTRACT_REQUIREMENT_SECTION__SRS_REQUIREMENT_SUBSECTIONS;

	/**
	 * The number of structural features of the '<em>VSRSSW Reliabilty Requirements</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSRSSW_RELIABILTY_REQUIREMENTS_FEATURE_COUNT = VSRS_ABSTRACT_REQUIREMENT_SECTION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>VSRSSW Reliabilty Requirements</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSRSSW_RELIABILTY_REQUIREMENTS_OPERATION_COUNT = VSRS_ABSTRACT_REQUIREMENT_SECTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.micobs.svm.srs.impl.VSRSSWMaintainabilityRequirementsImpl <em>VSRSSW Maintainability Requirements</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uah.aut.srg.micobs.svm.srs.impl.VSRSSWMaintainabilityRequirementsImpl
	 * @see es.uah.aut.srg.micobs.svm.srs.impl.srsPackageImpl#getVSRSSWMaintainabilityRequirements()
	 * @generated
	 */
	int VSRSSW_MAINTAINABILITY_REQUIREMENTS = 26;

	/**
	 * The feature id for the '<em><b>Items</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSRSSW_MAINTAINABILITY_REQUIREMENTS__ITEMS = VSRS_ABSTRACT_REQUIREMENT_SECTION__ITEMS;

	/**
	 * The feature id for the '<em><b>Subsections</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSRSSW_MAINTAINABILITY_REQUIREMENTS__SUBSECTIONS = VSRS_ABSTRACT_REQUIREMENT_SECTION__SUBSECTIONS;

	/**
	 * The feature id for the '<em><b>Section Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSRSSW_MAINTAINABILITY_REQUIREMENTS__SECTION_DESCRIPTION = VSRS_ABSTRACT_REQUIREMENT_SECTION__SECTION_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Srs Items</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSRSSW_MAINTAINABILITY_REQUIREMENTS__SRS_ITEMS = VSRS_ABSTRACT_REQUIREMENT_SECTION__SRS_ITEMS;

	/**
	 * The feature id for the '<em><b>Srs Requirement Subsections</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSRSSW_MAINTAINABILITY_REQUIREMENTS__SRS_REQUIREMENT_SUBSECTIONS = VSRS_ABSTRACT_REQUIREMENT_SECTION__SRS_REQUIREMENT_SUBSECTIONS;

	/**
	 * The number of structural features of the '<em>VSRSSW Maintainability Requirements</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSRSSW_MAINTAINABILITY_REQUIREMENTS_FEATURE_COUNT = VSRS_ABSTRACT_REQUIREMENT_SECTION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>VSRSSW Maintainability Requirements</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSRSSW_MAINTAINABILITY_REQUIREMENTS_OPERATION_COUNT = VSRS_ABSTRACT_REQUIREMENT_SECTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.micobs.svm.srs.impl.VSRSSWSafetyRequirementsImpl <em>VSRSSW Safety Requirements</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uah.aut.srg.micobs.svm.srs.impl.VSRSSWSafetyRequirementsImpl
	 * @see es.uah.aut.srg.micobs.svm.srs.impl.srsPackageImpl#getVSRSSWSafetyRequirements()
	 * @generated
	 */
	int VSRSSW_SAFETY_REQUIREMENTS = 27;

	/**
	 * The feature id for the '<em><b>Items</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSRSSW_SAFETY_REQUIREMENTS__ITEMS = VSRS_ABSTRACT_REQUIREMENT_SECTION__ITEMS;

	/**
	 * The feature id for the '<em><b>Subsections</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSRSSW_SAFETY_REQUIREMENTS__SUBSECTIONS = VSRS_ABSTRACT_REQUIREMENT_SECTION__SUBSECTIONS;

	/**
	 * The feature id for the '<em><b>Section Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSRSSW_SAFETY_REQUIREMENTS__SECTION_DESCRIPTION = VSRS_ABSTRACT_REQUIREMENT_SECTION__SECTION_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Srs Items</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSRSSW_SAFETY_REQUIREMENTS__SRS_ITEMS = VSRS_ABSTRACT_REQUIREMENT_SECTION__SRS_ITEMS;

	/**
	 * The feature id for the '<em><b>Srs Requirement Subsections</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSRSSW_SAFETY_REQUIREMENTS__SRS_REQUIREMENT_SUBSECTIONS = VSRS_ABSTRACT_REQUIREMENT_SECTION__SRS_REQUIREMENT_SUBSECTIONS;

	/**
	 * The number of structural features of the '<em>VSRSSW Safety Requirements</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSRSSW_SAFETY_REQUIREMENTS_FEATURE_COUNT = VSRS_ABSTRACT_REQUIREMENT_SECTION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>VSRSSW Safety Requirements</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSRSSW_SAFETY_REQUIREMENTS_OPERATION_COUNT = VSRS_ABSTRACT_REQUIREMENT_SECTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.micobs.svm.srs.impl.VSRSSWConfigurationDeliveryRequirementsImpl <em>VSRSSW Configuration Delivery Requirements</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uah.aut.srg.micobs.svm.srs.impl.VSRSSWConfigurationDeliveryRequirementsImpl
	 * @see es.uah.aut.srg.micobs.svm.srs.impl.srsPackageImpl#getVSRSSWConfigurationDeliveryRequirements()
	 * @generated
	 */
	int VSRSSW_CONFIGURATION_DELIVERY_REQUIREMENTS = 28;

	/**
	 * The feature id for the '<em><b>Items</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSRSSW_CONFIGURATION_DELIVERY_REQUIREMENTS__ITEMS = VSRS_ABSTRACT_REQUIREMENT_SECTION__ITEMS;

	/**
	 * The feature id for the '<em><b>Subsections</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSRSSW_CONFIGURATION_DELIVERY_REQUIREMENTS__SUBSECTIONS = VSRS_ABSTRACT_REQUIREMENT_SECTION__SUBSECTIONS;

	/**
	 * The feature id for the '<em><b>Section Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSRSSW_CONFIGURATION_DELIVERY_REQUIREMENTS__SECTION_DESCRIPTION = VSRS_ABSTRACT_REQUIREMENT_SECTION__SECTION_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Srs Items</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSRSSW_CONFIGURATION_DELIVERY_REQUIREMENTS__SRS_ITEMS = VSRS_ABSTRACT_REQUIREMENT_SECTION__SRS_ITEMS;

	/**
	 * The feature id for the '<em><b>Srs Requirement Subsections</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSRSSW_CONFIGURATION_DELIVERY_REQUIREMENTS__SRS_REQUIREMENT_SUBSECTIONS = VSRS_ABSTRACT_REQUIREMENT_SECTION__SRS_REQUIREMENT_SUBSECTIONS;

	/**
	 * The number of structural features of the '<em>VSRSSW Configuration Delivery Requirements</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSRSSW_CONFIGURATION_DELIVERY_REQUIREMENTS_FEATURE_COUNT = VSRS_ABSTRACT_REQUIREMENT_SECTION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>VSRSSW Configuration Delivery Requirements</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSRSSW_CONFIGURATION_DELIVERY_REQUIREMENTS_OPERATION_COUNT = VSRS_ABSTRACT_REQUIREMENT_SECTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.micobs.svm.srs.impl.VSRSDataDefinitionDBRequirementsImpl <em>VSRS Data Definition DB Requirements</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uah.aut.srg.micobs.svm.srs.impl.VSRSDataDefinitionDBRequirementsImpl
	 * @see es.uah.aut.srg.micobs.svm.srs.impl.srsPackageImpl#getVSRSDataDefinitionDBRequirements()
	 * @generated
	 */
	int VSRS_DATA_DEFINITION_DB_REQUIREMENTS = 29;

	/**
	 * The feature id for the '<em><b>Items</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSRS_DATA_DEFINITION_DB_REQUIREMENTS__ITEMS = VSRS_ABSTRACT_REQUIREMENT_SECTION__ITEMS;

	/**
	 * The feature id for the '<em><b>Subsections</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSRS_DATA_DEFINITION_DB_REQUIREMENTS__SUBSECTIONS = VSRS_ABSTRACT_REQUIREMENT_SECTION__SUBSECTIONS;

	/**
	 * The feature id for the '<em><b>Section Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSRS_DATA_DEFINITION_DB_REQUIREMENTS__SECTION_DESCRIPTION = VSRS_ABSTRACT_REQUIREMENT_SECTION__SECTION_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Srs Items</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSRS_DATA_DEFINITION_DB_REQUIREMENTS__SRS_ITEMS = VSRS_ABSTRACT_REQUIREMENT_SECTION__SRS_ITEMS;

	/**
	 * The feature id for the '<em><b>Srs Requirement Subsections</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSRS_DATA_DEFINITION_DB_REQUIREMENTS__SRS_REQUIREMENT_SUBSECTIONS = VSRS_ABSTRACT_REQUIREMENT_SECTION__SRS_REQUIREMENT_SUBSECTIONS;

	/**
	 * The number of structural features of the '<em>VSRS Data Definition DB Requirements</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSRS_DATA_DEFINITION_DB_REQUIREMENTS_FEATURE_COUNT = VSRS_ABSTRACT_REQUIREMENT_SECTION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>VSRS Data Definition DB Requirements</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSRS_DATA_DEFINITION_DB_REQUIREMENTS_OPERATION_COUNT = VSRS_ABSTRACT_REQUIREMENT_SECTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.micobs.svm.srs.impl.VSRSHumanFactorsRequirementsImpl <em>VSRS Human Factors Requirements</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uah.aut.srg.micobs.svm.srs.impl.VSRSHumanFactorsRequirementsImpl
	 * @see es.uah.aut.srg.micobs.svm.srs.impl.srsPackageImpl#getVSRSHumanFactorsRequirements()
	 * @generated
	 */
	int VSRS_HUMAN_FACTORS_REQUIREMENTS = 30;

	/**
	 * The feature id for the '<em><b>Items</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSRS_HUMAN_FACTORS_REQUIREMENTS__ITEMS = VSRS_ABSTRACT_REQUIREMENT_SECTION__ITEMS;

	/**
	 * The feature id for the '<em><b>Subsections</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSRS_HUMAN_FACTORS_REQUIREMENTS__SUBSECTIONS = VSRS_ABSTRACT_REQUIREMENT_SECTION__SUBSECTIONS;

	/**
	 * The feature id for the '<em><b>Section Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSRS_HUMAN_FACTORS_REQUIREMENTS__SECTION_DESCRIPTION = VSRS_ABSTRACT_REQUIREMENT_SECTION__SECTION_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Srs Items</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSRS_HUMAN_FACTORS_REQUIREMENTS__SRS_ITEMS = VSRS_ABSTRACT_REQUIREMENT_SECTION__SRS_ITEMS;

	/**
	 * The feature id for the '<em><b>Srs Requirement Subsections</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSRS_HUMAN_FACTORS_REQUIREMENTS__SRS_REQUIREMENT_SUBSECTIONS = VSRS_ABSTRACT_REQUIREMENT_SECTION__SRS_REQUIREMENT_SUBSECTIONS;

	/**
	 * The number of structural features of the '<em>VSRS Human Factors Requirements</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSRS_HUMAN_FACTORS_REQUIREMENTS_FEATURE_COUNT = VSRS_ABSTRACT_REQUIREMENT_SECTION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>VSRS Human Factors Requirements</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSRS_HUMAN_FACTORS_REQUIREMENTS_OPERATION_COUNT = VSRS_ABSTRACT_REQUIREMENT_SECTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.micobs.svm.srs.impl.VSRSAdaptationInstallationRequirementsImpl <em>VSRS Adaptation Installation Requirements</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uah.aut.srg.micobs.svm.srs.impl.VSRSAdaptationInstallationRequirementsImpl
	 * @see es.uah.aut.srg.micobs.svm.srs.impl.srsPackageImpl#getVSRSAdaptationInstallationRequirements()
	 * @generated
	 */
	int VSRS_ADAPTATION_INSTALLATION_REQUIREMENTS = 31;

	/**
	 * The feature id for the '<em><b>Items</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSRS_ADAPTATION_INSTALLATION_REQUIREMENTS__ITEMS = VSRS_ABSTRACT_REQUIREMENT_SECTION__ITEMS;

	/**
	 * The feature id for the '<em><b>Subsections</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSRS_ADAPTATION_INSTALLATION_REQUIREMENTS__SUBSECTIONS = VSRS_ABSTRACT_REQUIREMENT_SECTION__SUBSECTIONS;

	/**
	 * The feature id for the '<em><b>Section Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSRS_ADAPTATION_INSTALLATION_REQUIREMENTS__SECTION_DESCRIPTION = VSRS_ABSTRACT_REQUIREMENT_SECTION__SECTION_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Srs Items</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSRS_ADAPTATION_INSTALLATION_REQUIREMENTS__SRS_ITEMS = VSRS_ABSTRACT_REQUIREMENT_SECTION__SRS_ITEMS;

	/**
	 * The feature id for the '<em><b>Srs Requirement Subsections</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSRS_ADAPTATION_INSTALLATION_REQUIREMENTS__SRS_REQUIREMENT_SUBSECTIONS = VSRS_ABSTRACT_REQUIREMENT_SECTION__SRS_REQUIREMENT_SUBSECTIONS;

	/**
	 * The number of structural features of the '<em>VSRS Adaptation Installation Requirements</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSRS_ADAPTATION_INSTALLATION_REQUIREMENTS_FEATURE_COUNT = VSRS_ABSTRACT_REQUIREMENT_SECTION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>VSRS Adaptation Installation Requirements</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSRS_ADAPTATION_INSTALLATION_REQUIREMENTS_OPERATION_COUNT = VSRS_ABSTRACT_REQUIREMENT_SECTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.micobs.svm.srs.impl.VSRSDocumentItemImpl <em>VSRS Document Item</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uah.aut.srg.micobs.svm.srs.impl.VSRSDocumentItemImpl
	 * @see es.uah.aut.srg.micobs.svm.srs.impl.srsPackageImpl#getVSRSDocumentItem()
	 * @generated
	 */
	int VSRS_DOCUMENT_ITEM = 32;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSRS_DOCUMENT_ITEM__NAME = tdmPackage.VTRACEABLE_DOCUMENT_ABSTRACT_ITEM__NAME;

	/**
	 * The feature id for the '<em><b>Validation Method</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSRS_DOCUMENT_ITEM__VALIDATION_METHOD = tdmPackage.VTRACEABLE_DOCUMENT_ABSTRACT_ITEM__VALIDATION_METHOD;

	/**
	 * The feature id for the '<em><b>Group</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSRS_DOCUMENT_ITEM__GROUP = tdmPackage.VTRACEABLE_DOCUMENT_ABSTRACT_ITEM__GROUP;

	/**
	 * The feature id for the '<em><b>Parent Item</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSRS_DOCUMENT_ITEM__PARENT_ITEM = tdmPackage.VTRACEABLE_DOCUMENT_ABSTRACT_ITEM__PARENT_ITEM;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSRS_DOCUMENT_ITEM__DESCRIPTION = tdmPackage.VTRACEABLE_DOCUMENT_ABSTRACT_ITEM_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Extended Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSRS_DOCUMENT_ITEM__EXTENDED_DESCRIPTION = tdmPackage.VTRACEABLE_DOCUMENT_ABSTRACT_ITEM_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Mode</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSRS_DOCUMENT_ITEM__MODE = tdmPackage.VTRACEABLE_DOCUMENT_ABSTRACT_ITEM_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>VSRS Document Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSRS_DOCUMENT_ITEM_FEATURE_COUNT = tdmPackage.VTRACEABLE_DOCUMENT_ABSTRACT_ITEM_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>VSRS Document Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSRS_DOCUMENT_ITEM_OPERATION_COUNT = tdmPackage.VTRACEABLE_DOCUMENT_ABSTRACT_ITEM_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.micobs.svm.srs.impl.VSRSLogicalModelsImpl <em>VSRS Logical Models</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uah.aut.srg.micobs.svm.srs.impl.VSRSLogicalModelsImpl
	 * @see es.uah.aut.srg.micobs.svm.srs.impl.srsPackageImpl#getVSRSLogicalModels()
	 * @generated
	 */
	int VSRS_LOGICAL_MODELS = 33;

	/**
	 * The feature id for the '<em><b>Subsections</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSRS_LOGICAL_MODELS__SUBSECTIONS = docPackage.DFIXED_SECTION__SUBSECTIONS;

	/**
	 * The feature id for the '<em><b>Logical Models</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSRS_LOGICAL_MODELS__LOGICAL_MODELS = docPackage.DFIXED_SECTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>VSRS Logical Models</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSRS_LOGICAL_MODELS_FEATURE_COUNT = docPackage.DFIXED_SECTION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>VSRS Logical Models</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSRS_LOGICAL_MODELS_OPERATION_COUNT = docPackage.DFIXED_SECTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.micobs.svm.srs.impl.VSRSLogicalModelImpl <em>VSRS Logical Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uah.aut.srg.micobs.svm.srs.impl.VSRSLogicalModelImpl
	 * @see es.uah.aut.srg.micobs.svm.srs.impl.srsPackageImpl#getVSRSLogicalModel()
	 * @generated
	 */
	int VSRS_LOGICAL_MODEL = 34;

	/**
	 * The number of structural features of the '<em>VSRS Logical Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSRS_LOGICAL_MODEL_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>VSRS Logical Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSRS_LOGICAL_MODEL_OPERATION_COUNT = 0;


	/**
	 * The meta object id for the '{@link es.uah.aut.srg.micobs.svm.srs.VSRSDocumentItemModes <em>VSRS Document Item Modes</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uah.aut.srg.micobs.svm.srs.VSRSDocumentItemModes
	 * @see es.uah.aut.srg.micobs.svm.srs.impl.srsPackageImpl#getVSRSDocumentItemModes()
	 * @generated
	 */
	int VSRS_DOCUMENT_ITEM_MODES = 35;


	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.micobs.svm.srs.VSRSDocument <em>VSRS Document</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>VSRS Document</em>'.
	 * @see es.uah.aut.srg.micobs.svm.srs.VSRSDocument
	 * @generated
	 */
	EClass getVSRSDocument();

	/**
	 * Returns the meta object for the containment reference '{@link es.uah.aut.srg.micobs.svm.srs.VSRSDocument#getIntroductionSection <em>Introduction Section</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Introduction Section</em>'.
	 * @see es.uah.aut.srg.micobs.svm.srs.VSRSDocument#getIntroductionSection()
	 * @see #getVSRSDocument()
	 * @generated
	 */
	EReference getVSRSDocument_IntroductionSection();

	/**
	 * Returns the meta object for the containment reference '{@link es.uah.aut.srg.micobs.svm.srs.VSRSDocument#getApplicableDocumentsSection <em>Applicable Documents Section</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Applicable Documents Section</em>'.
	 * @see es.uah.aut.srg.micobs.svm.srs.VSRSDocument#getApplicableDocumentsSection()
	 * @see #getVSRSDocument()
	 * @generated
	 */
	EReference getVSRSDocument_ApplicableDocumentsSection();

	/**
	 * Returns the meta object for the containment reference '{@link es.uah.aut.srg.micobs.svm.srs.VSRSDocument#getReferenceDocumentsSection <em>Reference Documents Section</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Reference Documents Section</em>'.
	 * @see es.uah.aut.srg.micobs.svm.srs.VSRSDocument#getReferenceDocumentsSection()
	 * @see #getVSRSDocument()
	 * @generated
	 */
	EReference getVSRSDocument_ReferenceDocumentsSection();

	/**
	 * Returns the meta object for the containment reference '{@link es.uah.aut.srg.micobs.svm.srs.VSRSDocument#getTermsDefinitionsAbbreviationsSection <em>Terms Definitions Abbreviations Section</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Terms Definitions Abbreviations Section</em>'.
	 * @see es.uah.aut.srg.micobs.svm.srs.VSRSDocument#getTermsDefinitionsAbbreviationsSection()
	 * @see #getVSRSDocument()
	 * @generated
	 */
	EReference getVSRSDocument_TermsDefinitionsAbbreviationsSection();

	/**
	 * Returns the meta object for the containment reference '{@link es.uah.aut.srg.micobs.svm.srs.VSRSDocument#getSoftwareOverviewSection <em>Software Overview Section</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Software Overview Section</em>'.
	 * @see es.uah.aut.srg.micobs.svm.srs.VSRSDocument#getSoftwareOverviewSection()
	 * @see #getVSRSDocument()
	 * @generated
	 */
	EReference getVSRSDocument_SoftwareOverviewSection();

	/**
	 * Returns the meta object for the containment reference '{@link es.uah.aut.srg.micobs.svm.srs.VSRSDocument#getRequirementsSection <em>Requirements Section</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Requirements Section</em>'.
	 * @see es.uah.aut.srg.micobs.svm.srs.VSRSDocument#getRequirementsSection()
	 * @see #getVSRSDocument()
	 * @generated
	 */
	EReference getVSRSDocument_RequirementsSection();

	/**
	 * Returns the meta object for the containment reference '{@link es.uah.aut.srg.micobs.svm.srs.VSRSDocument#getLogicalModelsSection <em>Logical Models Section</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Logical Models Section</em>'.
	 * @see es.uah.aut.srg.micobs.svm.srs.VSRSDocument#getLogicalModelsSection()
	 * @see #getVSRSDocument()
	 * @generated
	 */
	EReference getVSRSDocument_LogicalModelsSection();

	/**
	 * Returns the meta object for the containment reference list '{@link es.uah.aut.srg.micobs.svm.srs.VSRSDocument#getSrsFigures <em>Srs Figures</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Srs Figures</em>'.
	 * @see es.uah.aut.srg.micobs.svm.srs.VSRSDocument#getSrsFigures()
	 * @see #getVSRSDocument()
	 * @generated
	 */
	EReference getVSRSDocument_SrsFigures();

	/**
	 * Returns the meta object for the containment reference list '{@link es.uah.aut.srg.micobs.svm.srs.VSRSDocument#getSrsTables <em>Srs Tables</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Srs Tables</em>'.
	 * @see es.uah.aut.srg.micobs.svm.srs.VSRSDocument#getSrsTables()
	 * @see #getVSRSDocument()
	 * @generated
	 */
	EReference getVSRSDocument_SrsTables();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.micobs.svm.srs.VSRSIntroduction <em>VSRS Introduction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>VSRS Introduction</em>'.
	 * @see es.uah.aut.srg.micobs.svm.srs.VSRSIntroduction
	 * @generated
	 */
	EClass getVSRSIntroduction();

	/**
	 * Returns the meta object for the containment reference list '{@link es.uah.aut.srg.micobs.svm.srs.VSRSIntroduction#getSrsInstatiableSubsections <em>Srs Instatiable Subsections</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Srs Instatiable Subsections</em>'.
	 * @see es.uah.aut.srg.micobs.svm.srs.VSRSIntroduction#getSrsInstatiableSubsections()
	 * @see #getVSRSIntroduction()
	 * @generated
	 */
	EReference getVSRSIntroduction_SrsInstatiableSubsections();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.micobs.svm.srs.VSRSApplicableDocuments <em>VSRS Applicable Documents</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>VSRS Applicable Documents</em>'.
	 * @see es.uah.aut.srg.micobs.svm.srs.VSRSApplicableDocuments
	 * @generated
	 */
	EClass getVSRSApplicableDocuments();

	/**
	 * Returns the meta object for the containment reference list '{@link es.uah.aut.srg.micobs.svm.srs.VSRSApplicableDocuments#getApplicableDocuments <em>Applicable Documents</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Applicable Documents</em>'.
	 * @see es.uah.aut.srg.micobs.svm.srs.VSRSApplicableDocuments#getApplicableDocuments()
	 * @see #getVSRSApplicableDocuments()
	 * @generated
	 */
	EReference getVSRSApplicableDocuments_ApplicableDocuments();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.micobs.svm.srs.VSRSReferenceDocuments <em>VSRS Reference Documents</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>VSRS Reference Documents</em>'.
	 * @see es.uah.aut.srg.micobs.svm.srs.VSRSReferenceDocuments
	 * @generated
	 */
	EClass getVSRSReferenceDocuments();

	/**
	 * Returns the meta object for the containment reference list '{@link es.uah.aut.srg.micobs.svm.srs.VSRSReferenceDocuments#getReferenceDocuments <em>Reference Documents</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Reference Documents</em>'.
	 * @see es.uah.aut.srg.micobs.svm.srs.VSRSReferenceDocuments#getReferenceDocuments()
	 * @see #getVSRSReferenceDocuments()
	 * @generated
	 */
	EReference getVSRSReferenceDocuments_ReferenceDocuments();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.micobs.svm.srs.VSRSTermsDefinitionsAbbreviations <em>VSRS Terms Definitions Abbreviations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>VSRS Terms Definitions Abbreviations</em>'.
	 * @see es.uah.aut.srg.micobs.svm.srs.VSRSTermsDefinitionsAbbreviations
	 * @generated
	 */
	EClass getVSRSTermsDefinitionsAbbreviations();

	/**
	 * Returns the meta object for the containment reference list '{@link es.uah.aut.srg.micobs.svm.srs.VSRSTermsDefinitionsAbbreviations#getTerms <em>Terms</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Terms</em>'.
	 * @see es.uah.aut.srg.micobs.svm.srs.VSRSTermsDefinitionsAbbreviations#getTerms()
	 * @see #getVSRSTermsDefinitionsAbbreviations()
	 * @generated
	 */
	EReference getVSRSTermsDefinitionsAbbreviations_Terms();

	/**
	 * Returns the meta object for the containment reference list '{@link es.uah.aut.srg.micobs.svm.srs.VSRSTermsDefinitionsAbbreviations#getDefinitions <em>Definitions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Definitions</em>'.
	 * @see es.uah.aut.srg.micobs.svm.srs.VSRSTermsDefinitionsAbbreviations#getDefinitions()
	 * @see #getVSRSTermsDefinitionsAbbreviations()
	 * @generated
	 */
	EReference getVSRSTermsDefinitionsAbbreviations_Definitions();

	/**
	 * Returns the meta object for the containment reference list '{@link es.uah.aut.srg.micobs.svm.srs.VSRSTermsDefinitionsAbbreviations#getAbbreviations <em>Abbreviations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Abbreviations</em>'.
	 * @see es.uah.aut.srg.micobs.svm.srs.VSRSTermsDefinitionsAbbreviations#getAbbreviations()
	 * @see #getVSRSTermsDefinitionsAbbreviations()
	 * @generated
	 */
	EReference getVSRSTermsDefinitionsAbbreviations_Abbreviations();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.micobs.svm.srs.VSRSAbstractBriefDescription <em>VSRS Abstract Brief Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>VSRS Abstract Brief Description</em>'.
	 * @see es.uah.aut.srg.micobs.svm.srs.VSRSAbstractBriefDescription
	 * @generated
	 */
	EClass getVSRSAbstractBriefDescription();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.micobs.svm.srs.VSRSAbstractBriefDescription#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see es.uah.aut.srg.micobs.svm.srs.VSRSAbstractBriefDescription#getName()
	 * @see #getVSRSAbstractBriefDescription()
	 * @generated
	 */
	EAttribute getVSRSAbstractBriefDescription_Name();

	/**
	 * Returns the meta object for the containment reference '{@link es.uah.aut.srg.micobs.svm.srs.VSRSAbstractBriefDescription#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Description</em>'.
	 * @see es.uah.aut.srg.micobs.svm.srs.VSRSAbstractBriefDescription#getDescription()
	 * @see #getVSRSAbstractBriefDescription()
	 * @generated
	 */
	EReference getVSRSAbstractBriefDescription_Description();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.micobs.svm.srs.VSRSTerm <em>VSRS Term</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>VSRS Term</em>'.
	 * @see es.uah.aut.srg.micobs.svm.srs.VSRSTerm
	 * @generated
	 */
	EClass getVSRSTerm();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.micobs.svm.srs.VSRSDefinition <em>VSRS Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>VSRS Definition</em>'.
	 * @see es.uah.aut.srg.micobs.svm.srs.VSRSDefinition
	 * @generated
	 */
	EClass getVSRSDefinition();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.micobs.svm.srs.VSRSAbbreviation <em>VSRS Abbreviation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>VSRS Abbreviation</em>'.
	 * @see es.uah.aut.srg.micobs.svm.srs.VSRSAbbreviation
	 * @generated
	 */
	EClass getVSRSAbbreviation();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.micobs.svm.srs.VSRSFixedSection <em>VSRS Fixed Section</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>VSRS Fixed Section</em>'.
	 * @see es.uah.aut.srg.micobs.svm.srs.VSRSFixedSection
	 * @generated
	 */
	EClass getVSRSFixedSection();

	/**
	 * Returns the meta object for the containment reference '{@link es.uah.aut.srg.micobs.svm.srs.VSRSFixedSection#getBody <em>Body</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Body</em>'.
	 * @see es.uah.aut.srg.micobs.svm.srs.VSRSFixedSection#getBody()
	 * @see #getVSRSFixedSection()
	 * @generated
	 */
	EReference getVSRSFixedSection_Body();

	/**
	 * Returns the meta object for the containment reference list '{@link es.uah.aut.srg.micobs.svm.srs.VSRSFixedSection#getSrsInstatiableSubsections <em>Srs Instatiable Subsections</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Srs Instatiable Subsections</em>'.
	 * @see es.uah.aut.srg.micobs.svm.srs.VSRSFixedSection#getSrsInstatiableSubsections()
	 * @see #getVSRSFixedSection()
	 * @generated
	 */
	EReference getVSRSFixedSection_SrsInstatiableSubsections();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.micobs.svm.srs.VSRSInstantiableSection <em>VSRS Instantiable Section</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>VSRS Instantiable Section</em>'.
	 * @see es.uah.aut.srg.micobs.svm.srs.VSRSInstantiableSection
	 * @generated
	 */
	EClass getVSRSInstantiableSection();

	/**
	 * Returns the meta object for the containment reference '{@link es.uah.aut.srg.micobs.svm.srs.VSRSInstantiableSection#getBody <em>Body</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Body</em>'.
	 * @see es.uah.aut.srg.micobs.svm.srs.VSRSInstantiableSection#getBody()
	 * @see #getVSRSInstantiableSection()
	 * @generated
	 */
	EReference getVSRSInstantiableSection_Body();

	/**
	 * Returns the meta object for the containment reference list '{@link es.uah.aut.srg.micobs.svm.srs.VSRSInstantiableSection#getSrsInstatiableSubsections <em>Srs Instatiable Subsections</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Srs Instatiable Subsections</em>'.
	 * @see es.uah.aut.srg.micobs.svm.srs.VSRSInstantiableSection#getSrsInstatiableSubsections()
	 * @see #getVSRSInstantiableSection()
	 * @generated
	 */
	EReference getVSRSInstantiableSection_SrsInstatiableSubsections();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.micobs.svm.srs.VSRSSoftwareOverview <em>VSRS Software Overview</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>VSRS Software Overview</em>'.
	 * @see es.uah.aut.srg.micobs.svm.srs.VSRSSoftwareOverview
	 * @generated
	 */
	EClass getVSRSSoftwareOverview();

	/**
	 * Returns the meta object for the containment reference '{@link es.uah.aut.srg.micobs.svm.srs.VSRSSoftwareOverview#getFunctionPurpose <em>Function Purpose</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Function Purpose</em>'.
	 * @see es.uah.aut.srg.micobs.svm.srs.VSRSSoftwareOverview#getFunctionPurpose()
	 * @see #getVSRSSoftwareOverview()
	 * @generated
	 */
	EReference getVSRSSoftwareOverview_FunctionPurpose();

	/**
	 * Returns the meta object for the containment reference '{@link es.uah.aut.srg.micobs.svm.srs.VSRSSoftwareOverview#getEnvironmentalConsiderations <em>Environmental Considerations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Environmental Considerations</em>'.
	 * @see es.uah.aut.srg.micobs.svm.srs.VSRSSoftwareOverview#getEnvironmentalConsiderations()
	 * @see #getVSRSSoftwareOverview()
	 * @generated
	 */
	EReference getVSRSSoftwareOverview_EnvironmentalConsiderations();

	/**
	 * Returns the meta object for the containment reference '{@link es.uah.aut.srg.micobs.svm.srs.VSRSSoftwareOverview#getRelationOtherSystems <em>Relation Other Systems</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Relation Other Systems</em>'.
	 * @see es.uah.aut.srg.micobs.svm.srs.VSRSSoftwareOverview#getRelationOtherSystems()
	 * @see #getVSRSSoftwareOverview()
	 * @generated
	 */
	EReference getVSRSSoftwareOverview_RelationOtherSystems();

	/**
	 * Returns the meta object for the containment reference '{@link es.uah.aut.srg.micobs.svm.srs.VSRSSoftwareOverview#getConstraints <em>Constraints</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Constraints</em>'.
	 * @see es.uah.aut.srg.micobs.svm.srs.VSRSSoftwareOverview#getConstraints()
	 * @see #getVSRSSoftwareOverview()
	 * @generated
	 */
	EReference getVSRSSoftwareOverview_Constraints();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.micobs.svm.srs.VSRSAbstractRequirementSection <em>VSRS Abstract Requirement Section</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>VSRS Abstract Requirement Section</em>'.
	 * @see es.uah.aut.srg.micobs.svm.srs.VSRSAbstractRequirementSection
	 * @generated
	 */
	EClass getVSRSAbstractRequirementSection();

	/**
	 * Returns the meta object for the containment reference '{@link es.uah.aut.srg.micobs.svm.srs.VSRSAbstractRequirementSection#getSectionDescription <em>Section Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Section Description</em>'.
	 * @see es.uah.aut.srg.micobs.svm.srs.VSRSAbstractRequirementSection#getSectionDescription()
	 * @see #getVSRSAbstractRequirementSection()
	 * @generated
	 */
	EReference getVSRSAbstractRequirementSection_SectionDescription();

	/**
	 * Returns the meta object for the containment reference list '{@link es.uah.aut.srg.micobs.svm.srs.VSRSAbstractRequirementSection#getSrsItems <em>Srs Items</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Srs Items</em>'.
	 * @see es.uah.aut.srg.micobs.svm.srs.VSRSAbstractRequirementSection#getSrsItems()
	 * @see #getVSRSAbstractRequirementSection()
	 * @generated
	 */
	EReference getVSRSAbstractRequirementSection_SrsItems();

	/**
	 * Returns the meta object for the containment reference list '{@link es.uah.aut.srg.micobs.svm.srs.VSRSAbstractRequirementSection#getSrsRequirementSubsections <em>Srs Requirement Subsections</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Srs Requirement Subsections</em>'.
	 * @see es.uah.aut.srg.micobs.svm.srs.VSRSAbstractRequirementSection#getSrsRequirementSubsections()
	 * @see #getVSRSAbstractRequirementSection()
	 * @generated
	 */
	EReference getVSRSAbstractRequirementSection_SrsRequirementSubsections();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.micobs.svm.srs.VSRSInstantiableRequirementSection <em>VSRS Instantiable Requirement Section</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>VSRS Instantiable Requirement Section</em>'.
	 * @see es.uah.aut.srg.micobs.svm.srs.VSRSInstantiableRequirementSection
	 * @generated
	 */
	EClass getVSRSInstantiableRequirementSection();

	/**
	 * Returns the meta object for the containment reference '{@link es.uah.aut.srg.micobs.svm.srs.VSRSInstantiableRequirementSection#getSectionDescription <em>Section Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Section Description</em>'.
	 * @see es.uah.aut.srg.micobs.svm.srs.VSRSInstantiableRequirementSection#getSectionDescription()
	 * @see #getVSRSInstantiableRequirementSection()
	 * @generated
	 */
	EReference getVSRSInstantiableRequirementSection_SectionDescription();

	/**
	 * Returns the meta object for the containment reference list '{@link es.uah.aut.srg.micobs.svm.srs.VSRSInstantiableRequirementSection#getSrsItems <em>Srs Items</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Srs Items</em>'.
	 * @see es.uah.aut.srg.micobs.svm.srs.VSRSInstantiableRequirementSection#getSrsItems()
	 * @see #getVSRSInstantiableRequirementSection()
	 * @generated
	 */
	EReference getVSRSInstantiableRequirementSection_SrsItems();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.micobs.svm.srs.VSRSRequirements <em>VSRS Requirements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>VSRS Requirements</em>'.
	 * @see es.uah.aut.srg.micobs.svm.srs.VSRSRequirements
	 * @generated
	 */
	EClass getVSRSRequirements();

	/**
	 * Returns the meta object for the containment reference '{@link es.uah.aut.srg.micobs.svm.srs.VSRSRequirements#getSectionDescription <em>Section Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Section Description</em>'.
	 * @see es.uah.aut.srg.micobs.svm.srs.VSRSRequirements#getSectionDescription()
	 * @see #getVSRSRequirements()
	 * @generated
	 */
	EReference getVSRSRequirements_SectionDescription();

	/**
	 * Returns the meta object for the containment reference '{@link es.uah.aut.srg.micobs.svm.srs.VSRSRequirements#getGeneral <em>General</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>General</em>'.
	 * @see es.uah.aut.srg.micobs.svm.srs.VSRSRequirements#getGeneral()
	 * @see #getVSRSRequirements()
	 * @generated
	 */
	EReference getVSRSRequirements_General();

	/**
	 * Returns the meta object for the containment reference '{@link es.uah.aut.srg.micobs.svm.srs.VSRSRequirements#getFunctional <em>Functional</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Functional</em>'.
	 * @see es.uah.aut.srg.micobs.svm.srs.VSRSRequirements#getFunctional()
	 * @see #getVSRSRequirements()
	 * @generated
	 */
	EReference getVSRSRequirements_Functional();

	/**
	 * Returns the meta object for the containment reference '{@link es.uah.aut.srg.micobs.svm.srs.VSRSRequirements#getPerformance <em>Performance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Performance</em>'.
	 * @see es.uah.aut.srg.micobs.svm.srs.VSRSRequirements#getPerformance()
	 * @see #getVSRSRequirements()
	 * @generated
	 */
	EReference getVSRSRequirements_Performance();

	/**
	 * Returns the meta object for the containment reference '{@link es.uah.aut.srg.micobs.svm.srs.VSRSRequirements#getInterface <em>Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Interface</em>'.
	 * @see es.uah.aut.srg.micobs.svm.srs.VSRSRequirements#getInterface()
	 * @see #getVSRSRequirements()
	 * @generated
	 */
	EReference getVSRSRequirements_Interface();

	/**
	 * Returns the meta object for the containment reference '{@link es.uah.aut.srg.micobs.svm.srs.VSRSRequirements#getOperational <em>Operational</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Operational</em>'.
	 * @see es.uah.aut.srg.micobs.svm.srs.VSRSRequirements#getOperational()
	 * @see #getVSRSRequirements()
	 * @generated
	 */
	EReference getVSRSRequirements_Operational();

	/**
	 * Returns the meta object for the containment reference '{@link es.uah.aut.srg.micobs.svm.srs.VSRSRequirements#getResources <em>Resources</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Resources</em>'.
	 * @see es.uah.aut.srg.micobs.svm.srs.VSRSRequirements#getResources()
	 * @see #getVSRSRequirements()
	 * @generated
	 */
	EReference getVSRSRequirements_Resources();

	/**
	 * Returns the meta object for the containment reference '{@link es.uah.aut.srg.micobs.svm.srs.VSRSRequirements#getDesign <em>Design</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Design</em>'.
	 * @see es.uah.aut.srg.micobs.svm.srs.VSRSRequirements#getDesign()
	 * @see #getVSRSRequirements()
	 * @generated
	 */
	EReference getVSRSRequirements_Design();

	/**
	 * Returns the meta object for the containment reference '{@link es.uah.aut.srg.micobs.svm.srs.VSRSRequirements#getSecurityPrivacy <em>Security Privacy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Security Privacy</em>'.
	 * @see es.uah.aut.srg.micobs.svm.srs.VSRSRequirements#getSecurityPrivacy()
	 * @see #getVSRSRequirements()
	 * @generated
	 */
	EReference getVSRSRequirements_SecurityPrivacy();

	/**
	 * Returns the meta object for the containment reference '{@link es.uah.aut.srg.micobs.svm.srs.VSRSRequirements#getPortability <em>Portability</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Portability</em>'.
	 * @see es.uah.aut.srg.micobs.svm.srs.VSRSRequirements#getPortability()
	 * @see #getVSRSRequirements()
	 * @generated
	 */
	EReference getVSRSRequirements_Portability();

	/**
	 * Returns the meta object for the containment reference '{@link es.uah.aut.srg.micobs.svm.srs.VSRSRequirements#getSwQuality <em>Sw Quality</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Sw Quality</em>'.
	 * @see es.uah.aut.srg.micobs.svm.srs.VSRSRequirements#getSwQuality()
	 * @see #getVSRSRequirements()
	 * @generated
	 */
	EReference getVSRSRequirements_SwQuality();

	/**
	 * Returns the meta object for the containment reference '{@link es.uah.aut.srg.micobs.svm.srs.VSRSRequirements#getSwReliabilty <em>Sw Reliabilty</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Sw Reliabilty</em>'.
	 * @see es.uah.aut.srg.micobs.svm.srs.VSRSRequirements#getSwReliabilty()
	 * @see #getVSRSRequirements()
	 * @generated
	 */
	EReference getVSRSRequirements_SwReliabilty();

	/**
	 * Returns the meta object for the containment reference '{@link es.uah.aut.srg.micobs.svm.srs.VSRSRequirements#getSwMaintainability <em>Sw Maintainability</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Sw Maintainability</em>'.
	 * @see es.uah.aut.srg.micobs.svm.srs.VSRSRequirements#getSwMaintainability()
	 * @see #getVSRSRequirements()
	 * @generated
	 */
	EReference getVSRSRequirements_SwMaintainability();

	/**
	 * Returns the meta object for the containment reference '{@link es.uah.aut.srg.micobs.svm.srs.VSRSRequirements#getSwSafety <em>Sw Safety</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Sw Safety</em>'.
	 * @see es.uah.aut.srg.micobs.svm.srs.VSRSRequirements#getSwSafety()
	 * @see #getVSRSRequirements()
	 * @generated
	 */
	EReference getVSRSRequirements_SwSafety();

	/**
	 * Returns the meta object for the containment reference '{@link es.uah.aut.srg.micobs.svm.srs.VSRSRequirements#getSwConfigurationDelivery <em>Sw Configuration Delivery</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Sw Configuration Delivery</em>'.
	 * @see es.uah.aut.srg.micobs.svm.srs.VSRSRequirements#getSwConfigurationDelivery()
	 * @see #getVSRSRequirements()
	 * @generated
	 */
	EReference getVSRSRequirements_SwConfigurationDelivery();

	/**
	 * Returns the meta object for the containment reference '{@link es.uah.aut.srg.micobs.svm.srs.VSRSRequirements#getDataDefinitionDB <em>Data Definition DB</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Data Definition DB</em>'.
	 * @see es.uah.aut.srg.micobs.svm.srs.VSRSRequirements#getDataDefinitionDB()
	 * @see #getVSRSRequirements()
	 * @generated
	 */
	EReference getVSRSRequirements_DataDefinitionDB();

	/**
	 * Returns the meta object for the containment reference '{@link es.uah.aut.srg.micobs.svm.srs.VSRSRequirements#getHumanFactors <em>Human Factors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Human Factors</em>'.
	 * @see es.uah.aut.srg.micobs.svm.srs.VSRSRequirements#getHumanFactors()
	 * @see #getVSRSRequirements()
	 * @generated
	 */
	EReference getVSRSRequirements_HumanFactors();

	/**
	 * Returns the meta object for the containment reference '{@link es.uah.aut.srg.micobs.svm.srs.VSRSRequirements#getAdaptationInstallation <em>Adaptation Installation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Adaptation Installation</em>'.
	 * @see es.uah.aut.srg.micobs.svm.srs.VSRSRequirements#getAdaptationInstallation()
	 * @see #getVSRSRequirements()
	 * @generated
	 */
	EReference getVSRSRequirements_AdaptationInstallation();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.micobs.svm.srs.VSRSGeneralRequirements <em>VSRS General Requirements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>VSRS General Requirements</em>'.
	 * @see es.uah.aut.srg.micobs.svm.srs.VSRSGeneralRequirements
	 * @generated
	 */
	EClass getVSRSGeneralRequirements();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.micobs.svm.srs.VSRSFunctionalRequirements <em>VSRS Functional Requirements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>VSRS Functional Requirements</em>'.
	 * @see es.uah.aut.srg.micobs.svm.srs.VSRSFunctionalRequirements
	 * @generated
	 */
	EClass getVSRSFunctionalRequirements();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.micobs.svm.srs.VSRSPerformanceRequirements <em>VSRS Performance Requirements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>VSRS Performance Requirements</em>'.
	 * @see es.uah.aut.srg.micobs.svm.srs.VSRSPerformanceRequirements
	 * @generated
	 */
	EClass getVSRSPerformanceRequirements();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.micobs.svm.srs.VSRSInterfaceRequirements <em>VSRS Interface Requirements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>VSRS Interface Requirements</em>'.
	 * @see es.uah.aut.srg.micobs.svm.srs.VSRSInterfaceRequirements
	 * @generated
	 */
	EClass getVSRSInterfaceRequirements();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.micobs.svm.srs.VSRSOperationalRequirements <em>VSRS Operational Requirements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>VSRS Operational Requirements</em>'.
	 * @see es.uah.aut.srg.micobs.svm.srs.VSRSOperationalRequirements
	 * @generated
	 */
	EClass getVSRSOperationalRequirements();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.micobs.svm.srs.VSRSResourcesRequirements <em>VSRS Resources Requirements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>VSRS Resources Requirements</em>'.
	 * @see es.uah.aut.srg.micobs.svm.srs.VSRSResourcesRequirements
	 * @generated
	 */
	EClass getVSRSResourcesRequirements();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.micobs.svm.srs.VSRSDesignRequirements <em>VSRS Design Requirements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>VSRS Design Requirements</em>'.
	 * @see es.uah.aut.srg.micobs.svm.srs.VSRSDesignRequirements
	 * @generated
	 */
	EClass getVSRSDesignRequirements();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.micobs.svm.srs.VSRSSecurityPrivacyRequirements <em>VSRS Security Privacy Requirements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>VSRS Security Privacy Requirements</em>'.
	 * @see es.uah.aut.srg.micobs.svm.srs.VSRSSecurityPrivacyRequirements
	 * @generated
	 */
	EClass getVSRSSecurityPrivacyRequirements();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.micobs.svm.srs.VSRSPortabilityRequirements <em>VSRS Portability Requirements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>VSRS Portability Requirements</em>'.
	 * @see es.uah.aut.srg.micobs.svm.srs.VSRSPortabilityRequirements
	 * @generated
	 */
	EClass getVSRSPortabilityRequirements();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.micobs.svm.srs.VSRSSWQualityRequirements <em>VSRSSW Quality Requirements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>VSRSSW Quality Requirements</em>'.
	 * @see es.uah.aut.srg.micobs.svm.srs.VSRSSWQualityRequirements
	 * @generated
	 */
	EClass getVSRSSWQualityRequirements();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.micobs.svm.srs.VSRSSWReliabiltyRequirements <em>VSRSSW Reliabilty Requirements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>VSRSSW Reliabilty Requirements</em>'.
	 * @see es.uah.aut.srg.micobs.svm.srs.VSRSSWReliabiltyRequirements
	 * @generated
	 */
	EClass getVSRSSWReliabiltyRequirements();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.micobs.svm.srs.VSRSSWMaintainabilityRequirements <em>VSRSSW Maintainability Requirements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>VSRSSW Maintainability Requirements</em>'.
	 * @see es.uah.aut.srg.micobs.svm.srs.VSRSSWMaintainabilityRequirements
	 * @generated
	 */
	EClass getVSRSSWMaintainabilityRequirements();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.micobs.svm.srs.VSRSSWSafetyRequirements <em>VSRSSW Safety Requirements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>VSRSSW Safety Requirements</em>'.
	 * @see es.uah.aut.srg.micobs.svm.srs.VSRSSWSafetyRequirements
	 * @generated
	 */
	EClass getVSRSSWSafetyRequirements();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.micobs.svm.srs.VSRSSWConfigurationDeliveryRequirements <em>VSRSSW Configuration Delivery Requirements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>VSRSSW Configuration Delivery Requirements</em>'.
	 * @see es.uah.aut.srg.micobs.svm.srs.VSRSSWConfigurationDeliveryRequirements
	 * @generated
	 */
	EClass getVSRSSWConfigurationDeliveryRequirements();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.micobs.svm.srs.VSRSDataDefinitionDBRequirements <em>VSRS Data Definition DB Requirements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>VSRS Data Definition DB Requirements</em>'.
	 * @see es.uah.aut.srg.micobs.svm.srs.VSRSDataDefinitionDBRequirements
	 * @generated
	 */
	EClass getVSRSDataDefinitionDBRequirements();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.micobs.svm.srs.VSRSHumanFactorsRequirements <em>VSRS Human Factors Requirements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>VSRS Human Factors Requirements</em>'.
	 * @see es.uah.aut.srg.micobs.svm.srs.VSRSHumanFactorsRequirements
	 * @generated
	 */
	EClass getVSRSHumanFactorsRequirements();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.micobs.svm.srs.VSRSAdaptationInstallationRequirements <em>VSRS Adaptation Installation Requirements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>VSRS Adaptation Installation Requirements</em>'.
	 * @see es.uah.aut.srg.micobs.svm.srs.VSRSAdaptationInstallationRequirements
	 * @generated
	 */
	EClass getVSRSAdaptationInstallationRequirements();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.micobs.svm.srs.VSRSDocumentItem <em>VSRS Document Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>VSRS Document Item</em>'.
	 * @see es.uah.aut.srg.micobs.svm.srs.VSRSDocumentItem
	 * @generated
	 */
	EClass getVSRSDocumentItem();

	/**
	 * Returns the meta object for the containment reference '{@link es.uah.aut.srg.micobs.svm.srs.VSRSDocumentItem#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Description</em>'.
	 * @see es.uah.aut.srg.micobs.svm.srs.VSRSDocumentItem#getDescription()
	 * @see #getVSRSDocumentItem()
	 * @generated
	 */
	EReference getVSRSDocumentItem_Description();

	/**
	 * Returns the meta object for the containment reference '{@link es.uah.aut.srg.micobs.svm.srs.VSRSDocumentItem#getExtendedDescription <em>Extended Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Extended Description</em>'.
	 * @see es.uah.aut.srg.micobs.svm.srs.VSRSDocumentItem#getExtendedDescription()
	 * @see #getVSRSDocumentItem()
	 * @generated
	 */
	EReference getVSRSDocumentItem_ExtendedDescription();

	/**
	 * Returns the meta object for the attribute list '{@link es.uah.aut.srg.micobs.svm.srs.VSRSDocumentItem#getMode <em>Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mode</em>'.
	 * @see es.uah.aut.srg.micobs.svm.srs.VSRSDocumentItem#getMode()
	 * @see #getVSRSDocumentItem()
	 * @generated
	 */
	EAttribute getVSRSDocumentItem_Mode();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.micobs.svm.srs.VSRSLogicalModels <em>VSRS Logical Models</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>VSRS Logical Models</em>'.
	 * @see es.uah.aut.srg.micobs.svm.srs.VSRSLogicalModels
	 * @generated
	 */
	EClass getVSRSLogicalModels();

	/**
	 * Returns the meta object for the containment reference list '{@link es.uah.aut.srg.micobs.svm.srs.VSRSLogicalModels#getLogicalModels <em>Logical Models</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Logical Models</em>'.
	 * @see es.uah.aut.srg.micobs.svm.srs.VSRSLogicalModels#getLogicalModels()
	 * @see #getVSRSLogicalModels()
	 * @generated
	 */
	EReference getVSRSLogicalModels_LogicalModels();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.micobs.svm.srs.VSRSLogicalModel <em>VSRS Logical Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>VSRS Logical Model</em>'.
	 * @see es.uah.aut.srg.micobs.svm.srs.VSRSLogicalModel
	 * @generated
	 */
	EClass getVSRSLogicalModel();

	/**
	 * Returns the meta object for enum '{@link es.uah.aut.srg.micobs.svm.srs.VSRSDocumentItemModes <em>VSRS Document Item Modes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>VSRS Document Item Modes</em>'.
	 * @see es.uah.aut.srg.micobs.svm.srs.VSRSDocumentItemModes
	 * @generated
	 */
	EEnum getVSRSDocumentItemModes();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	srsFactory getsrsFactory();

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
		 * The meta object literal for the '{@link es.uah.aut.srg.micobs.svm.srs.impl.VSRSDocumentImpl <em>VSRS Document</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uah.aut.srg.micobs.svm.srs.impl.VSRSDocumentImpl
		 * @see es.uah.aut.srg.micobs.svm.srs.impl.srsPackageImpl#getVSRSDocument()
		 * @generated
		 */
		EClass VSRS_DOCUMENT = eINSTANCE.getVSRSDocument();

		/**
		 * The meta object literal for the '<em><b>Introduction Section</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VSRS_DOCUMENT__INTRODUCTION_SECTION = eINSTANCE.getVSRSDocument_IntroductionSection();

		/**
		 * The meta object literal for the '<em><b>Applicable Documents Section</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VSRS_DOCUMENT__APPLICABLE_DOCUMENTS_SECTION = eINSTANCE.getVSRSDocument_ApplicableDocumentsSection();

		/**
		 * The meta object literal for the '<em><b>Reference Documents Section</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VSRS_DOCUMENT__REFERENCE_DOCUMENTS_SECTION = eINSTANCE.getVSRSDocument_ReferenceDocumentsSection();

		/**
		 * The meta object literal for the '<em><b>Terms Definitions Abbreviations Section</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VSRS_DOCUMENT__TERMS_DEFINITIONS_ABBREVIATIONS_SECTION = eINSTANCE.getVSRSDocument_TermsDefinitionsAbbreviationsSection();

		/**
		 * The meta object literal for the '<em><b>Software Overview Section</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VSRS_DOCUMENT__SOFTWARE_OVERVIEW_SECTION = eINSTANCE.getVSRSDocument_SoftwareOverviewSection();

		/**
		 * The meta object literal for the '<em><b>Requirements Section</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VSRS_DOCUMENT__REQUIREMENTS_SECTION = eINSTANCE.getVSRSDocument_RequirementsSection();

		/**
		 * The meta object literal for the '<em><b>Logical Models Section</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VSRS_DOCUMENT__LOGICAL_MODELS_SECTION = eINSTANCE.getVSRSDocument_LogicalModelsSection();

		/**
		 * The meta object literal for the '<em><b>Srs Figures</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VSRS_DOCUMENT__SRS_FIGURES = eINSTANCE.getVSRSDocument_SrsFigures();

		/**
		 * The meta object literal for the '<em><b>Srs Tables</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VSRS_DOCUMENT__SRS_TABLES = eINSTANCE.getVSRSDocument_SrsTables();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.micobs.svm.srs.impl.VSRSIntroductionImpl <em>VSRS Introduction</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uah.aut.srg.micobs.svm.srs.impl.VSRSIntroductionImpl
		 * @see es.uah.aut.srg.micobs.svm.srs.impl.srsPackageImpl#getVSRSIntroduction()
		 * @generated
		 */
		EClass VSRS_INTRODUCTION = eINSTANCE.getVSRSIntroduction();

		/**
		 * The meta object literal for the '<em><b>Srs Instatiable Subsections</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VSRS_INTRODUCTION__SRS_INSTATIABLE_SUBSECTIONS = eINSTANCE.getVSRSIntroduction_SrsInstatiableSubsections();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.micobs.svm.srs.impl.VSRSApplicableDocumentsImpl <em>VSRS Applicable Documents</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uah.aut.srg.micobs.svm.srs.impl.VSRSApplicableDocumentsImpl
		 * @see es.uah.aut.srg.micobs.svm.srs.impl.srsPackageImpl#getVSRSApplicableDocuments()
		 * @generated
		 */
		EClass VSRS_APPLICABLE_DOCUMENTS = eINSTANCE.getVSRSApplicableDocuments();

		/**
		 * The meta object literal for the '<em><b>Applicable Documents</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VSRS_APPLICABLE_DOCUMENTS__APPLICABLE_DOCUMENTS = eINSTANCE.getVSRSApplicableDocuments_ApplicableDocuments();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.micobs.svm.srs.impl.VSRSReferenceDocumentsImpl <em>VSRS Reference Documents</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uah.aut.srg.micobs.svm.srs.impl.VSRSReferenceDocumentsImpl
		 * @see es.uah.aut.srg.micobs.svm.srs.impl.srsPackageImpl#getVSRSReferenceDocuments()
		 * @generated
		 */
		EClass VSRS_REFERENCE_DOCUMENTS = eINSTANCE.getVSRSReferenceDocuments();

		/**
		 * The meta object literal for the '<em><b>Reference Documents</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VSRS_REFERENCE_DOCUMENTS__REFERENCE_DOCUMENTS = eINSTANCE.getVSRSReferenceDocuments_ReferenceDocuments();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.micobs.svm.srs.impl.VSRSTermsDefinitionsAbbreviationsImpl <em>VSRS Terms Definitions Abbreviations</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uah.aut.srg.micobs.svm.srs.impl.VSRSTermsDefinitionsAbbreviationsImpl
		 * @see es.uah.aut.srg.micobs.svm.srs.impl.srsPackageImpl#getVSRSTermsDefinitionsAbbreviations()
		 * @generated
		 */
		EClass VSRS_TERMS_DEFINITIONS_ABBREVIATIONS = eINSTANCE.getVSRSTermsDefinitionsAbbreviations();

		/**
		 * The meta object literal for the '<em><b>Terms</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VSRS_TERMS_DEFINITIONS_ABBREVIATIONS__TERMS = eINSTANCE.getVSRSTermsDefinitionsAbbreviations_Terms();

		/**
		 * The meta object literal for the '<em><b>Definitions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VSRS_TERMS_DEFINITIONS_ABBREVIATIONS__DEFINITIONS = eINSTANCE.getVSRSTermsDefinitionsAbbreviations_Definitions();

		/**
		 * The meta object literal for the '<em><b>Abbreviations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VSRS_TERMS_DEFINITIONS_ABBREVIATIONS__ABBREVIATIONS = eINSTANCE.getVSRSTermsDefinitionsAbbreviations_Abbreviations();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.micobs.svm.srs.impl.VSRSAbstractBriefDescriptionImpl <em>VSRS Abstract Brief Description</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uah.aut.srg.micobs.svm.srs.impl.VSRSAbstractBriefDescriptionImpl
		 * @see es.uah.aut.srg.micobs.svm.srs.impl.srsPackageImpl#getVSRSAbstractBriefDescription()
		 * @generated
		 */
		EClass VSRS_ABSTRACT_BRIEF_DESCRIPTION = eINSTANCE.getVSRSAbstractBriefDescription();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VSRS_ABSTRACT_BRIEF_DESCRIPTION__NAME = eINSTANCE.getVSRSAbstractBriefDescription_Name();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VSRS_ABSTRACT_BRIEF_DESCRIPTION__DESCRIPTION = eINSTANCE.getVSRSAbstractBriefDescription_Description();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.micobs.svm.srs.impl.VSRSTermImpl <em>VSRS Term</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uah.aut.srg.micobs.svm.srs.impl.VSRSTermImpl
		 * @see es.uah.aut.srg.micobs.svm.srs.impl.srsPackageImpl#getVSRSTerm()
		 * @generated
		 */
		EClass VSRS_TERM = eINSTANCE.getVSRSTerm();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.micobs.svm.srs.impl.VSRSDefinitionImpl <em>VSRS Definition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uah.aut.srg.micobs.svm.srs.impl.VSRSDefinitionImpl
		 * @see es.uah.aut.srg.micobs.svm.srs.impl.srsPackageImpl#getVSRSDefinition()
		 * @generated
		 */
		EClass VSRS_DEFINITION = eINSTANCE.getVSRSDefinition();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.micobs.svm.srs.impl.VSRSAbbreviationImpl <em>VSRS Abbreviation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uah.aut.srg.micobs.svm.srs.impl.VSRSAbbreviationImpl
		 * @see es.uah.aut.srg.micobs.svm.srs.impl.srsPackageImpl#getVSRSAbbreviation()
		 * @generated
		 */
		EClass VSRS_ABBREVIATION = eINSTANCE.getVSRSAbbreviation();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.micobs.svm.srs.impl.VSRSFixedSectionImpl <em>VSRS Fixed Section</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uah.aut.srg.micobs.svm.srs.impl.VSRSFixedSectionImpl
		 * @see es.uah.aut.srg.micobs.svm.srs.impl.srsPackageImpl#getVSRSFixedSection()
		 * @generated
		 */
		EClass VSRS_FIXED_SECTION = eINSTANCE.getVSRSFixedSection();

		/**
		 * The meta object literal for the '<em><b>Body</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VSRS_FIXED_SECTION__BODY = eINSTANCE.getVSRSFixedSection_Body();

		/**
		 * The meta object literal for the '<em><b>Srs Instatiable Subsections</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VSRS_FIXED_SECTION__SRS_INSTATIABLE_SUBSECTIONS = eINSTANCE.getVSRSFixedSection_SrsInstatiableSubsections();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.micobs.svm.srs.impl.VSRSInstantiableSectionImpl <em>VSRS Instantiable Section</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uah.aut.srg.micobs.svm.srs.impl.VSRSInstantiableSectionImpl
		 * @see es.uah.aut.srg.micobs.svm.srs.impl.srsPackageImpl#getVSRSInstantiableSection()
		 * @generated
		 */
		EClass VSRS_INSTANTIABLE_SECTION = eINSTANCE.getVSRSInstantiableSection();

		/**
		 * The meta object literal for the '<em><b>Body</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VSRS_INSTANTIABLE_SECTION__BODY = eINSTANCE.getVSRSInstantiableSection_Body();

		/**
		 * The meta object literal for the '<em><b>Srs Instatiable Subsections</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VSRS_INSTANTIABLE_SECTION__SRS_INSTATIABLE_SUBSECTIONS = eINSTANCE.getVSRSInstantiableSection_SrsInstatiableSubsections();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.micobs.svm.srs.impl.VSRSSoftwareOverviewImpl <em>VSRS Software Overview</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uah.aut.srg.micobs.svm.srs.impl.VSRSSoftwareOverviewImpl
		 * @see es.uah.aut.srg.micobs.svm.srs.impl.srsPackageImpl#getVSRSSoftwareOverview()
		 * @generated
		 */
		EClass VSRS_SOFTWARE_OVERVIEW = eINSTANCE.getVSRSSoftwareOverview();

		/**
		 * The meta object literal for the '<em><b>Function Purpose</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VSRS_SOFTWARE_OVERVIEW__FUNCTION_PURPOSE = eINSTANCE.getVSRSSoftwareOverview_FunctionPurpose();

		/**
		 * The meta object literal for the '<em><b>Environmental Considerations</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VSRS_SOFTWARE_OVERVIEW__ENVIRONMENTAL_CONSIDERATIONS = eINSTANCE.getVSRSSoftwareOverview_EnvironmentalConsiderations();

		/**
		 * The meta object literal for the '<em><b>Relation Other Systems</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VSRS_SOFTWARE_OVERVIEW__RELATION_OTHER_SYSTEMS = eINSTANCE.getVSRSSoftwareOverview_RelationOtherSystems();

		/**
		 * The meta object literal for the '<em><b>Constraints</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VSRS_SOFTWARE_OVERVIEW__CONSTRAINTS = eINSTANCE.getVSRSSoftwareOverview_Constraints();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.micobs.svm.srs.impl.VSRSAbstractRequirementSectionImpl <em>VSRS Abstract Requirement Section</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uah.aut.srg.micobs.svm.srs.impl.VSRSAbstractRequirementSectionImpl
		 * @see es.uah.aut.srg.micobs.svm.srs.impl.srsPackageImpl#getVSRSAbstractRequirementSection()
		 * @generated
		 */
		EClass VSRS_ABSTRACT_REQUIREMENT_SECTION = eINSTANCE.getVSRSAbstractRequirementSection();

		/**
		 * The meta object literal for the '<em><b>Section Description</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VSRS_ABSTRACT_REQUIREMENT_SECTION__SECTION_DESCRIPTION = eINSTANCE.getVSRSAbstractRequirementSection_SectionDescription();

		/**
		 * The meta object literal for the '<em><b>Srs Items</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VSRS_ABSTRACT_REQUIREMENT_SECTION__SRS_ITEMS = eINSTANCE.getVSRSAbstractRequirementSection_SrsItems();

		/**
		 * The meta object literal for the '<em><b>Srs Requirement Subsections</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VSRS_ABSTRACT_REQUIREMENT_SECTION__SRS_REQUIREMENT_SUBSECTIONS = eINSTANCE.getVSRSAbstractRequirementSection_SrsRequirementSubsections();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.micobs.svm.srs.impl.VSRSInstantiableRequirementSectionImpl <em>VSRS Instantiable Requirement Section</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uah.aut.srg.micobs.svm.srs.impl.VSRSInstantiableRequirementSectionImpl
		 * @see es.uah.aut.srg.micobs.svm.srs.impl.srsPackageImpl#getVSRSInstantiableRequirementSection()
		 * @generated
		 */
		EClass VSRS_INSTANTIABLE_REQUIREMENT_SECTION = eINSTANCE.getVSRSInstantiableRequirementSection();

		/**
		 * The meta object literal for the '<em><b>Section Description</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VSRS_INSTANTIABLE_REQUIREMENT_SECTION__SECTION_DESCRIPTION = eINSTANCE.getVSRSInstantiableRequirementSection_SectionDescription();

		/**
		 * The meta object literal for the '<em><b>Srs Items</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VSRS_INSTANTIABLE_REQUIREMENT_SECTION__SRS_ITEMS = eINSTANCE.getVSRSInstantiableRequirementSection_SrsItems();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.micobs.svm.srs.impl.VSRSRequirementsImpl <em>VSRS Requirements</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uah.aut.srg.micobs.svm.srs.impl.VSRSRequirementsImpl
		 * @see es.uah.aut.srg.micobs.svm.srs.impl.srsPackageImpl#getVSRSRequirements()
		 * @generated
		 */
		EClass VSRS_REQUIREMENTS = eINSTANCE.getVSRSRequirements();

		/**
		 * The meta object literal for the '<em><b>Section Description</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VSRS_REQUIREMENTS__SECTION_DESCRIPTION = eINSTANCE.getVSRSRequirements_SectionDescription();

		/**
		 * The meta object literal for the '<em><b>General</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VSRS_REQUIREMENTS__GENERAL = eINSTANCE.getVSRSRequirements_General();

		/**
		 * The meta object literal for the '<em><b>Functional</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VSRS_REQUIREMENTS__FUNCTIONAL = eINSTANCE.getVSRSRequirements_Functional();

		/**
		 * The meta object literal for the '<em><b>Performance</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VSRS_REQUIREMENTS__PERFORMANCE = eINSTANCE.getVSRSRequirements_Performance();

		/**
		 * The meta object literal for the '<em><b>Interface</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VSRS_REQUIREMENTS__INTERFACE = eINSTANCE.getVSRSRequirements_Interface();

		/**
		 * The meta object literal for the '<em><b>Operational</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VSRS_REQUIREMENTS__OPERATIONAL = eINSTANCE.getVSRSRequirements_Operational();

		/**
		 * The meta object literal for the '<em><b>Resources</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VSRS_REQUIREMENTS__RESOURCES = eINSTANCE.getVSRSRequirements_Resources();

		/**
		 * The meta object literal for the '<em><b>Design</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VSRS_REQUIREMENTS__DESIGN = eINSTANCE.getVSRSRequirements_Design();

		/**
		 * The meta object literal for the '<em><b>Security Privacy</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VSRS_REQUIREMENTS__SECURITY_PRIVACY = eINSTANCE.getVSRSRequirements_SecurityPrivacy();

		/**
		 * The meta object literal for the '<em><b>Portability</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VSRS_REQUIREMENTS__PORTABILITY = eINSTANCE.getVSRSRequirements_Portability();

		/**
		 * The meta object literal for the '<em><b>Sw Quality</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VSRS_REQUIREMENTS__SW_QUALITY = eINSTANCE.getVSRSRequirements_SwQuality();

		/**
		 * The meta object literal for the '<em><b>Sw Reliabilty</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VSRS_REQUIREMENTS__SW_RELIABILTY = eINSTANCE.getVSRSRequirements_SwReliabilty();

		/**
		 * The meta object literal for the '<em><b>Sw Maintainability</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VSRS_REQUIREMENTS__SW_MAINTAINABILITY = eINSTANCE.getVSRSRequirements_SwMaintainability();

		/**
		 * The meta object literal for the '<em><b>Sw Safety</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VSRS_REQUIREMENTS__SW_SAFETY = eINSTANCE.getVSRSRequirements_SwSafety();

		/**
		 * The meta object literal for the '<em><b>Sw Configuration Delivery</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VSRS_REQUIREMENTS__SW_CONFIGURATION_DELIVERY = eINSTANCE.getVSRSRequirements_SwConfigurationDelivery();

		/**
		 * The meta object literal for the '<em><b>Data Definition DB</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VSRS_REQUIREMENTS__DATA_DEFINITION_DB = eINSTANCE.getVSRSRequirements_DataDefinitionDB();

		/**
		 * The meta object literal for the '<em><b>Human Factors</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VSRS_REQUIREMENTS__HUMAN_FACTORS = eINSTANCE.getVSRSRequirements_HumanFactors();

		/**
		 * The meta object literal for the '<em><b>Adaptation Installation</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VSRS_REQUIREMENTS__ADAPTATION_INSTALLATION = eINSTANCE.getVSRSRequirements_AdaptationInstallation();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.micobs.svm.srs.impl.VSRSGeneralRequirementsImpl <em>VSRS General Requirements</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uah.aut.srg.micobs.svm.srs.impl.VSRSGeneralRequirementsImpl
		 * @see es.uah.aut.srg.micobs.svm.srs.impl.srsPackageImpl#getVSRSGeneralRequirements()
		 * @generated
		 */
		EClass VSRS_GENERAL_REQUIREMENTS = eINSTANCE.getVSRSGeneralRequirements();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.micobs.svm.srs.impl.VSRSFunctionalRequirementsImpl <em>VSRS Functional Requirements</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uah.aut.srg.micobs.svm.srs.impl.VSRSFunctionalRequirementsImpl
		 * @see es.uah.aut.srg.micobs.svm.srs.impl.srsPackageImpl#getVSRSFunctionalRequirements()
		 * @generated
		 */
		EClass VSRS_FUNCTIONAL_REQUIREMENTS = eINSTANCE.getVSRSFunctionalRequirements();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.micobs.svm.srs.impl.VSRSPerformanceRequirementsImpl <em>VSRS Performance Requirements</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uah.aut.srg.micobs.svm.srs.impl.VSRSPerformanceRequirementsImpl
		 * @see es.uah.aut.srg.micobs.svm.srs.impl.srsPackageImpl#getVSRSPerformanceRequirements()
		 * @generated
		 */
		EClass VSRS_PERFORMANCE_REQUIREMENTS = eINSTANCE.getVSRSPerformanceRequirements();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.micobs.svm.srs.impl.VSRSInterfaceRequirementsImpl <em>VSRS Interface Requirements</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uah.aut.srg.micobs.svm.srs.impl.VSRSInterfaceRequirementsImpl
		 * @see es.uah.aut.srg.micobs.svm.srs.impl.srsPackageImpl#getVSRSInterfaceRequirements()
		 * @generated
		 */
		EClass VSRS_INTERFACE_REQUIREMENTS = eINSTANCE.getVSRSInterfaceRequirements();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.micobs.svm.srs.impl.VSRSOperationalRequirementsImpl <em>VSRS Operational Requirements</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uah.aut.srg.micobs.svm.srs.impl.VSRSOperationalRequirementsImpl
		 * @see es.uah.aut.srg.micobs.svm.srs.impl.srsPackageImpl#getVSRSOperationalRequirements()
		 * @generated
		 */
		EClass VSRS_OPERATIONAL_REQUIREMENTS = eINSTANCE.getVSRSOperationalRequirements();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.micobs.svm.srs.impl.VSRSResourcesRequirementsImpl <em>VSRS Resources Requirements</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uah.aut.srg.micobs.svm.srs.impl.VSRSResourcesRequirementsImpl
		 * @see es.uah.aut.srg.micobs.svm.srs.impl.srsPackageImpl#getVSRSResourcesRequirements()
		 * @generated
		 */
		EClass VSRS_RESOURCES_REQUIREMENTS = eINSTANCE.getVSRSResourcesRequirements();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.micobs.svm.srs.impl.VSRSDesignRequirementsImpl <em>VSRS Design Requirements</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uah.aut.srg.micobs.svm.srs.impl.VSRSDesignRequirementsImpl
		 * @see es.uah.aut.srg.micobs.svm.srs.impl.srsPackageImpl#getVSRSDesignRequirements()
		 * @generated
		 */
		EClass VSRS_DESIGN_REQUIREMENTS = eINSTANCE.getVSRSDesignRequirements();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.micobs.svm.srs.impl.VSRSSecurityPrivacyRequirementsImpl <em>VSRS Security Privacy Requirements</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uah.aut.srg.micobs.svm.srs.impl.VSRSSecurityPrivacyRequirementsImpl
		 * @see es.uah.aut.srg.micobs.svm.srs.impl.srsPackageImpl#getVSRSSecurityPrivacyRequirements()
		 * @generated
		 */
		EClass VSRS_SECURITY_PRIVACY_REQUIREMENTS = eINSTANCE.getVSRSSecurityPrivacyRequirements();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.micobs.svm.srs.impl.VSRSPortabilityRequirementsImpl <em>VSRS Portability Requirements</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uah.aut.srg.micobs.svm.srs.impl.VSRSPortabilityRequirementsImpl
		 * @see es.uah.aut.srg.micobs.svm.srs.impl.srsPackageImpl#getVSRSPortabilityRequirements()
		 * @generated
		 */
		EClass VSRS_PORTABILITY_REQUIREMENTS = eINSTANCE.getVSRSPortabilityRequirements();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.micobs.svm.srs.impl.VSRSSWQualityRequirementsImpl <em>VSRSSW Quality Requirements</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uah.aut.srg.micobs.svm.srs.impl.VSRSSWQualityRequirementsImpl
		 * @see es.uah.aut.srg.micobs.svm.srs.impl.srsPackageImpl#getVSRSSWQualityRequirements()
		 * @generated
		 */
		EClass VSRSSW_QUALITY_REQUIREMENTS = eINSTANCE.getVSRSSWQualityRequirements();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.micobs.svm.srs.impl.VSRSSWReliabiltyRequirementsImpl <em>VSRSSW Reliabilty Requirements</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uah.aut.srg.micobs.svm.srs.impl.VSRSSWReliabiltyRequirementsImpl
		 * @see es.uah.aut.srg.micobs.svm.srs.impl.srsPackageImpl#getVSRSSWReliabiltyRequirements()
		 * @generated
		 */
		EClass VSRSSW_RELIABILTY_REQUIREMENTS = eINSTANCE.getVSRSSWReliabiltyRequirements();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.micobs.svm.srs.impl.VSRSSWMaintainabilityRequirementsImpl <em>VSRSSW Maintainability Requirements</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uah.aut.srg.micobs.svm.srs.impl.VSRSSWMaintainabilityRequirementsImpl
		 * @see es.uah.aut.srg.micobs.svm.srs.impl.srsPackageImpl#getVSRSSWMaintainabilityRequirements()
		 * @generated
		 */
		EClass VSRSSW_MAINTAINABILITY_REQUIREMENTS = eINSTANCE.getVSRSSWMaintainabilityRequirements();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.micobs.svm.srs.impl.VSRSSWSafetyRequirementsImpl <em>VSRSSW Safety Requirements</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uah.aut.srg.micobs.svm.srs.impl.VSRSSWSafetyRequirementsImpl
		 * @see es.uah.aut.srg.micobs.svm.srs.impl.srsPackageImpl#getVSRSSWSafetyRequirements()
		 * @generated
		 */
		EClass VSRSSW_SAFETY_REQUIREMENTS = eINSTANCE.getVSRSSWSafetyRequirements();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.micobs.svm.srs.impl.VSRSSWConfigurationDeliveryRequirementsImpl <em>VSRSSW Configuration Delivery Requirements</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uah.aut.srg.micobs.svm.srs.impl.VSRSSWConfigurationDeliveryRequirementsImpl
		 * @see es.uah.aut.srg.micobs.svm.srs.impl.srsPackageImpl#getVSRSSWConfigurationDeliveryRequirements()
		 * @generated
		 */
		EClass VSRSSW_CONFIGURATION_DELIVERY_REQUIREMENTS = eINSTANCE.getVSRSSWConfigurationDeliveryRequirements();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.micobs.svm.srs.impl.VSRSDataDefinitionDBRequirementsImpl <em>VSRS Data Definition DB Requirements</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uah.aut.srg.micobs.svm.srs.impl.VSRSDataDefinitionDBRequirementsImpl
		 * @see es.uah.aut.srg.micobs.svm.srs.impl.srsPackageImpl#getVSRSDataDefinitionDBRequirements()
		 * @generated
		 */
		EClass VSRS_DATA_DEFINITION_DB_REQUIREMENTS = eINSTANCE.getVSRSDataDefinitionDBRequirements();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.micobs.svm.srs.impl.VSRSHumanFactorsRequirementsImpl <em>VSRS Human Factors Requirements</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uah.aut.srg.micobs.svm.srs.impl.VSRSHumanFactorsRequirementsImpl
		 * @see es.uah.aut.srg.micobs.svm.srs.impl.srsPackageImpl#getVSRSHumanFactorsRequirements()
		 * @generated
		 */
		EClass VSRS_HUMAN_FACTORS_REQUIREMENTS = eINSTANCE.getVSRSHumanFactorsRequirements();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.micobs.svm.srs.impl.VSRSAdaptationInstallationRequirementsImpl <em>VSRS Adaptation Installation Requirements</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uah.aut.srg.micobs.svm.srs.impl.VSRSAdaptationInstallationRequirementsImpl
		 * @see es.uah.aut.srg.micobs.svm.srs.impl.srsPackageImpl#getVSRSAdaptationInstallationRequirements()
		 * @generated
		 */
		EClass VSRS_ADAPTATION_INSTALLATION_REQUIREMENTS = eINSTANCE.getVSRSAdaptationInstallationRequirements();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.micobs.svm.srs.impl.VSRSDocumentItemImpl <em>VSRS Document Item</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uah.aut.srg.micobs.svm.srs.impl.VSRSDocumentItemImpl
		 * @see es.uah.aut.srg.micobs.svm.srs.impl.srsPackageImpl#getVSRSDocumentItem()
		 * @generated
		 */
		EClass VSRS_DOCUMENT_ITEM = eINSTANCE.getVSRSDocumentItem();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VSRS_DOCUMENT_ITEM__DESCRIPTION = eINSTANCE.getVSRSDocumentItem_Description();

		/**
		 * The meta object literal for the '<em><b>Extended Description</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VSRS_DOCUMENT_ITEM__EXTENDED_DESCRIPTION = eINSTANCE.getVSRSDocumentItem_ExtendedDescription();

		/**
		 * The meta object literal for the '<em><b>Mode</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VSRS_DOCUMENT_ITEM__MODE = eINSTANCE.getVSRSDocumentItem_Mode();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.micobs.svm.srs.impl.VSRSLogicalModelsImpl <em>VSRS Logical Models</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uah.aut.srg.micobs.svm.srs.impl.VSRSLogicalModelsImpl
		 * @see es.uah.aut.srg.micobs.svm.srs.impl.srsPackageImpl#getVSRSLogicalModels()
		 * @generated
		 */
		EClass VSRS_LOGICAL_MODELS = eINSTANCE.getVSRSLogicalModels();

		/**
		 * The meta object literal for the '<em><b>Logical Models</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VSRS_LOGICAL_MODELS__LOGICAL_MODELS = eINSTANCE.getVSRSLogicalModels_LogicalModels();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.micobs.svm.srs.impl.VSRSLogicalModelImpl <em>VSRS Logical Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uah.aut.srg.micobs.svm.srs.impl.VSRSLogicalModelImpl
		 * @see es.uah.aut.srg.micobs.svm.srs.impl.srsPackageImpl#getVSRSLogicalModel()
		 * @generated
		 */
		EClass VSRS_LOGICAL_MODEL = eINSTANCE.getVSRSLogicalModel();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.micobs.svm.srs.VSRSDocumentItemModes <em>VSRS Document Item Modes</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uah.aut.srg.micobs.svm.srs.VSRSDocumentItemModes
		 * @see es.uah.aut.srg.micobs.svm.srs.impl.srsPackageImpl#getVSRSDocumentItemModes()
		 * @generated
		 */
		EEnum VSRS_DOCUMENT_ITEM_MODES = eINSTANCE.getVSRSDocumentItemModes();

	}

} //srsPackage
