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
package es.uah.aut.srg.micobs.svm.svs;

import es.uah.aut.srg.micobs.doctpl.doc.docPackage;

import es.uah.aut.srg.micobs.svm.vdm.vdmPackage;

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
 * @see es.uah.aut.srg.micobs.svm.svs.svsFactory
 * @model kind="package"
 * @generated
 */
public interface svsPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "svs";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://srg.aut.uah.es/micobs/svm/svs";

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
	svsPackage eINSTANCE = es.uah.aut.srg.micobs.svm.svs.impl.svsPackageImpl.init();

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.micobs.svm.svs.impl.VSVSDocumentImpl <em>VSVS Document</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uah.aut.srg.micobs.svm.svs.impl.VSVSDocumentImpl
	 * @see es.uah.aut.srg.micobs.svm.svs.impl.svsPackageImpl#getVSVSDocument()
	 * @generated
	 */
	int VSVS_DOCUMENT = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSVS_DOCUMENT__NAME = vdmPackage.VVALIDATION_DOCUMENT__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSVS_DOCUMENT__ID = vdmPackage.VVALIDATION_DOCUMENT__ID;

	/**
	 * The feature id for the '<em><b>Issue</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSVS_DOCUMENT__ISSUE = vdmPackage.VVALIDATION_DOCUMENT__ISSUE;

	/**
	 * The feature id for the '<em><b>Revision</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSVS_DOCUMENT__REVISION = vdmPackage.VVALIDATION_DOCUMENT__REVISION;

	/**
	 * The feature id for the '<em><b>Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSVS_DOCUMENT__DATE = vdmPackage.VVALIDATION_DOCUMENT__DATE;

	/**
	 * The feature id for the '<em><b>Parents</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSVS_DOCUMENT__PARENTS = vdmPackage.VVALIDATION_DOCUMENT__PARENTS;

	/**
	 * The feature id for the '<em><b>Groups</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSVS_DOCUMENT__GROUPS = vdmPackage.VVALIDATION_DOCUMENT__GROUPS;

	/**
	 * The feature id for the '<em><b>Applicable Documents</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSVS_DOCUMENT__APPLICABLE_DOCUMENTS = vdmPackage.VVALIDATION_DOCUMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Reference Documents</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSVS_DOCUMENT__REFERENCE_DOCUMENTS = vdmPackage.VVALIDATION_DOCUMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Figures</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSVS_DOCUMENT__FIGURES = vdmPackage.VVALIDATION_DOCUMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Tables</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSVS_DOCUMENT__TABLES = vdmPackage.VVALIDATION_DOCUMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Sections</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSVS_DOCUMENT__SECTIONS = vdmPackage.VVALIDATION_DOCUMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Introduction Section</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSVS_DOCUMENT__INTRODUCTION_SECTION = vdmPackage.VVALIDATION_DOCUMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Applicable Documents Section</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSVS_DOCUMENT__APPLICABLE_DOCUMENTS_SECTION = vdmPackage.VVALIDATION_DOCUMENT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Reference Documents Section</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSVS_DOCUMENT__REFERENCE_DOCUMENTS_SECTION = vdmPackage.VVALIDATION_DOCUMENT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Terms Definitions Abbreviations Section</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSVS_DOCUMENT__TERMS_DEFINITIONS_ABBREVIATIONS_SECTION = vdmPackage.VVALIDATION_DOCUMENT_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Software Overview Section</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSVS_DOCUMENT__SOFTWARE_OVERVIEW_SECTION = vdmPackage.VVALIDATION_DOCUMENT_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Task Identification Section</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSVS_DOCUMENT__TASK_IDENTIFICATION_SECTION = vdmPackage.VVALIDATION_DOCUMENT_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Testing Specification Design Section</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSVS_DOCUMENT__TESTING_SPECIFICATION_DESIGN_SECTION = vdmPackage.VVALIDATION_DOCUMENT_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Test Cases Section</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSVS_DOCUMENT__TEST_CASES_SECTION = vdmPackage.VVALIDATION_DOCUMENT_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Test Procedures Section</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSVS_DOCUMENT__TEST_PROCEDURES_SECTION = vdmPackage.VVALIDATION_DOCUMENT_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>Analysis Inspection Review Section</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSVS_DOCUMENT__ANALYSIS_INSPECTION_REVIEW_SECTION = vdmPackage.VVALIDATION_DOCUMENT_FEATURE_COUNT + 14;

	/**
	 * The feature id for the '<em><b>Test Platform Requirements Section</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSVS_DOCUMENT__TEST_PLATFORM_REQUIREMENTS_SECTION = vdmPackage.VVALIDATION_DOCUMENT_FEATURE_COUNT + 15;

	/**
	 * The feature id for the '<em><b>Additional Information Section</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSVS_DOCUMENT__ADDITIONAL_INFORMATION_SECTION = vdmPackage.VVALIDATION_DOCUMENT_FEATURE_COUNT + 16;

	/**
	 * The feature id for the '<em><b>Svs Figures</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSVS_DOCUMENT__SVS_FIGURES = vdmPackage.VVALIDATION_DOCUMENT_FEATURE_COUNT + 17;

	/**
	 * The feature id for the '<em><b>Svs Tables</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSVS_DOCUMENT__SVS_TABLES = vdmPackage.VVALIDATION_DOCUMENT_FEATURE_COUNT + 18;

	/**
	 * The number of structural features of the '<em>VSVS Document</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSVS_DOCUMENT_FEATURE_COUNT = vdmPackage.VVALIDATION_DOCUMENT_FEATURE_COUNT + 19;

	/**
	 * The number of operations of the '<em>VSVS Document</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSVS_DOCUMENT_OPERATION_COUNT = vdmPackage.VVALIDATION_DOCUMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.micobs.svm.svs.impl.VSVSInstantiableSectionImpl <em>VSVS Instantiable Section</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uah.aut.srg.micobs.svm.svs.impl.VSVSInstantiableSectionImpl
	 * @see es.uah.aut.srg.micobs.svm.svs.impl.svsPackageImpl#getVSVSInstantiableSection()
	 * @generated
	 */
	int VSVS_INSTANTIABLE_SECTION = 1;

	/**
	 * The feature id for the '<em><b>Subsections</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSVS_INSTANTIABLE_SECTION__SUBSECTIONS = docPackage.DINSTANTIABLE_SECTION__SUBSECTIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSVS_INSTANTIABLE_SECTION__NAME = docPackage.DINSTANTIABLE_SECTION__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSVS_INSTANTIABLE_SECTION__DESCRIPTION = docPackage.DINSTANTIABLE_SECTION__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Body</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSVS_INSTANTIABLE_SECTION__BODY = docPackage.DINSTANTIABLE_SECTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Svs Instatiable Subsections</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSVS_INSTANTIABLE_SECTION__SVS_INSTATIABLE_SUBSECTIONS = docPackage.DINSTANTIABLE_SECTION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>VSVS Instantiable Section</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSVS_INSTANTIABLE_SECTION_FEATURE_COUNT = docPackage.DINSTANTIABLE_SECTION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>VSVS Instantiable Section</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSVS_INSTANTIABLE_SECTION_OPERATION_COUNT = docPackage.DINSTANTIABLE_SECTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.micobs.svm.svs.impl.VSVSIntroductionImpl <em>VSVS Introduction</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uah.aut.srg.micobs.svm.svs.impl.VSVSIntroductionImpl
	 * @see es.uah.aut.srg.micobs.svm.svs.impl.svsPackageImpl#getVSVSIntroduction()
	 * @generated
	 */
	int VSVS_INTRODUCTION = 2;

	/**
	 * The feature id for the '<em><b>Subsections</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSVS_INTRODUCTION__SUBSECTIONS = docPackage.DFIXED_SECTION__SUBSECTIONS;

	/**
	 * The feature id for the '<em><b>Svs Instatiable Subsections</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSVS_INTRODUCTION__SVS_INSTATIABLE_SUBSECTIONS = docPackage.DFIXED_SECTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>VSVS Introduction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSVS_INTRODUCTION_FEATURE_COUNT = docPackage.DFIXED_SECTION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>VSVS Introduction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSVS_INTRODUCTION_OPERATION_COUNT = docPackage.DFIXED_SECTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.micobs.svm.svs.impl.VSVSApplicableDocumentsImpl <em>VSVS Applicable Documents</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uah.aut.srg.micobs.svm.svs.impl.VSVSApplicableDocumentsImpl
	 * @see es.uah.aut.srg.micobs.svm.svs.impl.svsPackageImpl#getVSVSApplicableDocuments()
	 * @generated
	 */
	int VSVS_APPLICABLE_DOCUMENTS = 3;

	/**
	 * The feature id for the '<em><b>Subsections</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSVS_APPLICABLE_DOCUMENTS__SUBSECTIONS = docPackage.DFIXED_SECTION__SUBSECTIONS;

	/**
	 * The feature id for the '<em><b>Applicable Documents</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSVS_APPLICABLE_DOCUMENTS__APPLICABLE_DOCUMENTS = docPackage.DFIXED_SECTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>VSVS Applicable Documents</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSVS_APPLICABLE_DOCUMENTS_FEATURE_COUNT = docPackage.DFIXED_SECTION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>VSVS Applicable Documents</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSVS_APPLICABLE_DOCUMENTS_OPERATION_COUNT = docPackage.DFIXED_SECTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.micobs.svm.svs.impl.VSVSReferenceDocumentsImpl <em>VSVS Reference Documents</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uah.aut.srg.micobs.svm.svs.impl.VSVSReferenceDocumentsImpl
	 * @see es.uah.aut.srg.micobs.svm.svs.impl.svsPackageImpl#getVSVSReferenceDocuments()
	 * @generated
	 */
	int VSVS_REFERENCE_DOCUMENTS = 4;

	/**
	 * The feature id for the '<em><b>Subsections</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSVS_REFERENCE_DOCUMENTS__SUBSECTIONS = docPackage.DFIXED_SECTION__SUBSECTIONS;

	/**
	 * The feature id for the '<em><b>Reference Documents</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSVS_REFERENCE_DOCUMENTS__REFERENCE_DOCUMENTS = docPackage.DFIXED_SECTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>VSVS Reference Documents</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSVS_REFERENCE_DOCUMENTS_FEATURE_COUNT = docPackage.DFIXED_SECTION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>VSVS Reference Documents</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSVS_REFERENCE_DOCUMENTS_OPERATION_COUNT = docPackage.DFIXED_SECTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.micobs.svm.svs.impl.VSVSTermsDefinitionsAbbreviationsImpl <em>VSVS Terms Definitions Abbreviations</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uah.aut.srg.micobs.svm.svs.impl.VSVSTermsDefinitionsAbbreviationsImpl
	 * @see es.uah.aut.srg.micobs.svm.svs.impl.svsPackageImpl#getVSVSTermsDefinitionsAbbreviations()
	 * @generated
	 */
	int VSVS_TERMS_DEFINITIONS_ABBREVIATIONS = 5;

	/**
	 * The feature id for the '<em><b>Subsections</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSVS_TERMS_DEFINITIONS_ABBREVIATIONS__SUBSECTIONS = docPackage.DFIXED_SECTION__SUBSECTIONS;

	/**
	 * The feature id for the '<em><b>Terms</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSVS_TERMS_DEFINITIONS_ABBREVIATIONS__TERMS = docPackage.DFIXED_SECTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Definitions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSVS_TERMS_DEFINITIONS_ABBREVIATIONS__DEFINITIONS = docPackage.DFIXED_SECTION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Abbreviations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSVS_TERMS_DEFINITIONS_ABBREVIATIONS__ABBREVIATIONS = docPackage.DFIXED_SECTION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>VSVS Terms Definitions Abbreviations</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSVS_TERMS_DEFINITIONS_ABBREVIATIONS_FEATURE_COUNT = docPackage.DFIXED_SECTION_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>VSVS Terms Definitions Abbreviations</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSVS_TERMS_DEFINITIONS_ABBREVIATIONS_OPERATION_COUNT = docPackage.DFIXED_SECTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.micobs.svm.svs.impl.VSVSAbstractBriefDescriptionImpl <em>VSVS Abstract Brief Description</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uah.aut.srg.micobs.svm.svs.impl.VSVSAbstractBriefDescriptionImpl
	 * @see es.uah.aut.srg.micobs.svm.svs.impl.svsPackageImpl#getVSVSAbstractBriefDescription()
	 * @generated
	 */
	int VSVS_ABSTRACT_BRIEF_DESCRIPTION = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSVS_ABSTRACT_BRIEF_DESCRIPTION__NAME = 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSVS_ABSTRACT_BRIEF_DESCRIPTION__DESCRIPTION = 1;

	/**
	 * The number of structural features of the '<em>VSVS Abstract Brief Description</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSVS_ABSTRACT_BRIEF_DESCRIPTION_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>VSVS Abstract Brief Description</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSVS_ABSTRACT_BRIEF_DESCRIPTION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.micobs.svm.svs.impl.VSVSTermImpl <em>VSVS Term</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uah.aut.srg.micobs.svm.svs.impl.VSVSTermImpl
	 * @see es.uah.aut.srg.micobs.svm.svs.impl.svsPackageImpl#getVSVSTerm()
	 * @generated
	 */
	int VSVS_TERM = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSVS_TERM__NAME = VSVS_ABSTRACT_BRIEF_DESCRIPTION__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSVS_TERM__DESCRIPTION = VSVS_ABSTRACT_BRIEF_DESCRIPTION__DESCRIPTION;

	/**
	 * The number of structural features of the '<em>VSVS Term</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSVS_TERM_FEATURE_COUNT = VSVS_ABSTRACT_BRIEF_DESCRIPTION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>VSVS Term</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSVS_TERM_OPERATION_COUNT = VSVS_ABSTRACT_BRIEF_DESCRIPTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.micobs.svm.svs.impl.VSVSDefinitionImpl <em>VSVS Definition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uah.aut.srg.micobs.svm.svs.impl.VSVSDefinitionImpl
	 * @see es.uah.aut.srg.micobs.svm.svs.impl.svsPackageImpl#getVSVSDefinition()
	 * @generated
	 */
	int VSVS_DEFINITION = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSVS_DEFINITION__NAME = VSVS_ABSTRACT_BRIEF_DESCRIPTION__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSVS_DEFINITION__DESCRIPTION = VSVS_ABSTRACT_BRIEF_DESCRIPTION__DESCRIPTION;

	/**
	 * The number of structural features of the '<em>VSVS Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSVS_DEFINITION_FEATURE_COUNT = VSVS_ABSTRACT_BRIEF_DESCRIPTION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>VSVS Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSVS_DEFINITION_OPERATION_COUNT = VSVS_ABSTRACT_BRIEF_DESCRIPTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.micobs.svm.svs.impl.VSVSAbbreviationImpl <em>VSVS Abbreviation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uah.aut.srg.micobs.svm.svs.impl.VSVSAbbreviationImpl
	 * @see es.uah.aut.srg.micobs.svm.svs.impl.svsPackageImpl#getVSVSAbbreviation()
	 * @generated
	 */
	int VSVS_ABBREVIATION = 9;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSVS_ABBREVIATION__NAME = VSVS_ABSTRACT_BRIEF_DESCRIPTION__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSVS_ABBREVIATION__DESCRIPTION = VSVS_ABSTRACT_BRIEF_DESCRIPTION__DESCRIPTION;

	/**
	 * The number of structural features of the '<em>VSVS Abbreviation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSVS_ABBREVIATION_FEATURE_COUNT = VSVS_ABSTRACT_BRIEF_DESCRIPTION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>VSVS Abbreviation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSVS_ABBREVIATION_OPERATION_COUNT = VSVS_ABSTRACT_BRIEF_DESCRIPTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.micobs.svm.svs.impl.VSVSFixedSectionImpl <em>VSVS Fixed Section</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uah.aut.srg.micobs.svm.svs.impl.VSVSFixedSectionImpl
	 * @see es.uah.aut.srg.micobs.svm.svs.impl.svsPackageImpl#getVSVSFixedSection()
	 * @generated
	 */
	int VSVS_FIXED_SECTION = 10;

	/**
	 * The feature id for the '<em><b>Subsections</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSVS_FIXED_SECTION__SUBSECTIONS = docPackage.DFIXED_SECTION__SUBSECTIONS;

	/**
	 * The feature id for the '<em><b>Body</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSVS_FIXED_SECTION__BODY = docPackage.DFIXED_SECTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Svs Instatiable Subsections</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSVS_FIXED_SECTION__SVS_INSTATIABLE_SUBSECTIONS = docPackage.DFIXED_SECTION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>VSVS Fixed Section</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSVS_FIXED_SECTION_FEATURE_COUNT = docPackage.DFIXED_SECTION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>VSVS Fixed Section</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSVS_FIXED_SECTION_OPERATION_COUNT = docPackage.DFIXED_SECTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.micobs.svm.svs.impl.VSVSSoftwareOverviewImpl <em>VSVS Software Overview</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uah.aut.srg.micobs.svm.svs.impl.VSVSSoftwareOverviewImpl
	 * @see es.uah.aut.srg.micobs.svm.svs.impl.svsPackageImpl#getVSVSSoftwareOverview()
	 * @generated
	 */
	int VSVS_SOFTWARE_OVERVIEW = 11;

	/**
	 * The feature id for the '<em><b>Subsections</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSVS_SOFTWARE_OVERVIEW__SUBSECTIONS = VSVS_FIXED_SECTION__SUBSECTIONS;

	/**
	 * The feature id for the '<em><b>Body</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSVS_SOFTWARE_OVERVIEW__BODY = VSVS_FIXED_SECTION__BODY;

	/**
	 * The feature id for the '<em><b>Svs Instatiable Subsections</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSVS_SOFTWARE_OVERVIEW__SVS_INSTATIABLE_SUBSECTIONS = VSVS_FIXED_SECTION__SVS_INSTATIABLE_SUBSECTIONS;

	/**
	 * The number of structural features of the '<em>VSVS Software Overview</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSVS_SOFTWARE_OVERVIEW_FEATURE_COUNT = VSVS_FIXED_SECTION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>VSVS Software Overview</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSVS_SOFTWARE_OVERVIEW_OPERATION_COUNT = VSVS_FIXED_SECTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.micobs.svm.svs.impl.VSVSTaskIdentificationImpl <em>VSVS Task Identification</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uah.aut.srg.micobs.svm.svs.impl.VSVSTaskIdentificationImpl
	 * @see es.uah.aut.srg.micobs.svm.svs.impl.svsPackageImpl#getVSVSTaskIdentification()
	 * @generated
	 */
	int VSVS_TASK_IDENTIFICATION = 12;

	/**
	 * The feature id for the '<em><b>Subsections</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSVS_TASK_IDENTIFICATION__SUBSECTIONS = docPackage.DFIXED_SECTION__SUBSECTIONS;

	/**
	 * The feature id for the '<em><b>Task Criteria</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSVS_TASK_IDENTIFICATION__TASK_CRITERIA = docPackage.DFIXED_SECTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Features To Be Tested</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSVS_TASK_IDENTIFICATION__FEATURES_TO_BE_TESTED = docPackage.DFIXED_SECTION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Features Not To Be Tested</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSVS_TASK_IDENTIFICATION__FEATURES_NOT_TO_BE_TESTED = docPackage.DFIXED_SECTION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Test Pass Fail Criteria</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSVS_TASK_IDENTIFICATION__TEST_PASS_FAIL_CRITERIA = docPackage.DFIXED_SECTION_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Items Can Not Be Validated</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSVS_TASK_IDENTIFICATION__ITEMS_CAN_NOT_BE_VALIDATED = docPackage.DFIXED_SECTION_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Manually Auto Generated Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSVS_TASK_IDENTIFICATION__MANUALLY_AUTO_GENERATED_CODE = docPackage.DFIXED_SECTION_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>VSVS Task Identification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSVS_TASK_IDENTIFICATION_FEATURE_COUNT = docPackage.DFIXED_SECTION_FEATURE_COUNT + 6;

	/**
	 * The number of operations of the '<em>VSVS Task Identification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSVS_TASK_IDENTIFICATION_OPERATION_COUNT = docPackage.DFIXED_SECTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.micobs.svm.svs.impl.VSVSTestingSpecificationDesignImpl <em>VSVS Testing Specification Design</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uah.aut.srg.micobs.svm.svs.impl.VSVSTestingSpecificationDesignImpl
	 * @see es.uah.aut.srg.micobs.svm.svs.impl.svsPackageImpl#getVSVSTestingSpecificationDesign()
	 * @generated
	 */
	int VSVS_TESTING_SPECIFICATION_DESIGN = 13;

	/**
	 * The feature id for the '<em><b>Subsections</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSVS_TESTING_SPECIFICATION_DESIGN__SUBSECTIONS = docPackage.DFIXED_SECTION__SUBSECTIONS;

	/**
	 * The feature id for the '<em><b>General</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSVS_TESTING_SPECIFICATION_DESIGN__GENERAL = docPackage.DFIXED_SECTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Test Designs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSVS_TESTING_SPECIFICATION_DESIGN__TEST_DESIGNS = docPackage.DFIXED_SECTION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>VSVS Testing Specification Design</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSVS_TESTING_SPECIFICATION_DESIGN_FEATURE_COUNT = docPackage.DFIXED_SECTION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>VSVS Testing Specification Design</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSVS_TESTING_SPECIFICATION_DESIGN_OPERATION_COUNT = docPackage.DFIXED_SECTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.micobs.svm.svs.impl.VSVSTestDesignImpl <em>VSVS Test Design</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uah.aut.srg.micobs.svm.svs.impl.VSVSTestDesignImpl
	 * @see es.uah.aut.srg.micobs.svm.svs.impl.svsPackageImpl#getVSVSTestDesign()
	 * @generated
	 */
	int VSVS_TEST_DESIGN = 14;

	/**
	 * The feature id for the '<em><b>Subsections</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSVS_TEST_DESIGN__SUBSECTIONS = docPackage.DFIXED_SECTION__SUBSECTIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSVS_TEST_DESIGN__NAME = docPackage.DFIXED_SECTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>General</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSVS_TEST_DESIGN__GENERAL = docPackage.DFIXED_SECTION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Features To Be Tested</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSVS_TEST_DESIGN__FEATURES_TO_BE_TESTED = docPackage.DFIXED_SECTION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Approach Refinements</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSVS_TEST_DESIGN__APPROACH_REFINEMENTS = docPackage.DFIXED_SECTION_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>VSVS Test Design</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSVS_TEST_DESIGN_FEATURE_COUNT = docPackage.DFIXED_SECTION_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>VSVS Test Design</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSVS_TEST_DESIGN_OPERATION_COUNT = docPackage.DFIXED_SECTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.micobs.svm.svs.impl.VSVSTestCasesImpl <em>VSVS Test Cases</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uah.aut.srg.micobs.svm.svs.impl.VSVSTestCasesImpl
	 * @see es.uah.aut.srg.micobs.svm.svs.impl.svsPackageImpl#getVSVSTestCases()
	 * @generated
	 */
	int VSVS_TEST_CASES = 15;

	/**
	 * The feature id for the '<em><b>Items</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSVS_TEST_CASES__ITEMS = vdmPackage.VVALIDATION_DOCUMENT_FIXED_GROUP__ITEMS;

	/**
	 * The feature id for the '<em><b>Subsections</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSVS_TEST_CASES__SUBSECTIONS = vdmPackage.VVALIDATION_DOCUMENT_FIXED_GROUP_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>General</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSVS_TEST_CASES__GENERAL = vdmPackage.VVALIDATION_DOCUMENT_FIXED_GROUP_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Test Cases</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSVS_TEST_CASES__TEST_CASES = vdmPackage.VVALIDATION_DOCUMENT_FIXED_GROUP_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>VSVS Test Cases</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSVS_TEST_CASES_FEATURE_COUNT = vdmPackage.VVALIDATION_DOCUMENT_FIXED_GROUP_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>VSVS Test Cases</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSVS_TEST_CASES_OPERATION_COUNT = vdmPackage.VVALIDATION_DOCUMENT_FIXED_GROUP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.micobs.svm.svs.impl.VSVSTestCaseImpl <em>VSVS Test Case</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uah.aut.srg.micobs.svm.svs.impl.VSVSTestCaseImpl
	 * @see es.uah.aut.srg.micobs.svm.svs.impl.svsPackageImpl#getVSVSTestCase()
	 * @generated
	 */
	int VSVS_TEST_CASE = 16;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSVS_TEST_CASE__NAME = vdmPackage.VVALIDATION_DOCUMENT_ABSTRACT_ITEM__NAME;

	/**
	 * The feature id for the '<em><b>Group</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSVS_TEST_CASE__GROUP = vdmPackage.VVALIDATION_DOCUMENT_ABSTRACT_ITEM__GROUP;

	/**
	 * The feature id for the '<em><b>Validating Items</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSVS_TEST_CASE__VALIDATING_ITEMS = vdmPackage.VVALIDATION_DOCUMENT_ABSTRACT_ITEM__VALIDATING_ITEMS;

	/**
	 * The feature id for the '<em><b>Subsections</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSVS_TEST_CASE__SUBSECTIONS = vdmPackage.VVALIDATION_DOCUMENT_ABSTRACT_ITEM_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSVS_TEST_CASE__IDENTIFIER = vdmPackage.VVALIDATION_DOCUMENT_ABSTRACT_ITEM_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Inputs</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSVS_TEST_CASE__INPUTS = vdmPackage.VVALIDATION_DOCUMENT_ABSTRACT_ITEM_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Outputs</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSVS_TEST_CASE__OUTPUTS = vdmPackage.VVALIDATION_DOCUMENT_ABSTRACT_ITEM_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Pass Fail Criteria</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSVS_TEST_CASE__PASS_FAIL_CRITERIA = vdmPackage.VVALIDATION_DOCUMENT_ABSTRACT_ITEM_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Environmental Needs</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSVS_TEST_CASE__ENVIRONMENTAL_NEEDS = vdmPackage.VVALIDATION_DOCUMENT_ABSTRACT_ITEM_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Special Constraints</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSVS_TEST_CASE__SPECIAL_CONSTRAINTS = vdmPackage.VVALIDATION_DOCUMENT_ABSTRACT_ITEM_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Interface Dependencies</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSVS_TEST_CASE__INTERFACE_DEPENDENCIES = vdmPackage.VVALIDATION_DOCUMENT_ABSTRACT_ITEM_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>VSVS Test Case</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSVS_TEST_CASE_FEATURE_COUNT = vdmPackage.VVALIDATION_DOCUMENT_ABSTRACT_ITEM_FEATURE_COUNT + 8;

	/**
	 * The number of operations of the '<em>VSVS Test Case</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSVS_TEST_CASE_OPERATION_COUNT = vdmPackage.VVALIDATION_DOCUMENT_ABSTRACT_ITEM_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.micobs.svm.svs.impl.VSVSTestProceduresImpl <em>VSVS Test Procedures</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uah.aut.srg.micobs.svm.svs.impl.VSVSTestProceduresImpl
	 * @see es.uah.aut.srg.micobs.svm.svs.impl.svsPackageImpl#getVSVSTestProcedures()
	 * @generated
	 */
	int VSVS_TEST_PROCEDURES = 17;

	/**
	 * The feature id for the '<em><b>Subsections</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSVS_TEST_PROCEDURES__SUBSECTIONS = docPackage.DFIXED_SECTION__SUBSECTIONS;

	/**
	 * The feature id for the '<em><b>General</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSVS_TEST_PROCEDURES__GENERAL = docPackage.DFIXED_SECTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Test Procedures</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSVS_TEST_PROCEDURES__TEST_PROCEDURES = docPackage.DFIXED_SECTION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>VSVS Test Procedures</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSVS_TEST_PROCEDURES_FEATURE_COUNT = docPackage.DFIXED_SECTION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>VSVS Test Procedures</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSVS_TEST_PROCEDURES_OPERATION_COUNT = docPackage.DFIXED_SECTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.micobs.svm.svs.impl.VSVSTestProcedureImpl <em>VSVS Test Procedure</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uah.aut.srg.micobs.svm.svs.impl.VSVSTestProcedureImpl
	 * @see es.uah.aut.srg.micobs.svm.svs.impl.svsPackageImpl#getVSVSTestProcedure()
	 * @generated
	 */
	int VSVS_TEST_PROCEDURE = 18;

	/**
	 * The feature id for the '<em><b>Subsections</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSVS_TEST_PROCEDURE__SUBSECTIONS = docPackage.DFIXED_SECTION__SUBSECTIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSVS_TEST_PROCEDURE__NAME = docPackage.DFIXED_SECTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSVS_TEST_PROCEDURE__IDENTIFIER = docPackage.DFIXED_SECTION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Purpose</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSVS_TEST_PROCEDURE__PURPOSE = docPackage.DFIXED_SECTION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Steps</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSVS_TEST_PROCEDURE__STEPS = docPackage.DFIXED_SECTION_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Test Script</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSVS_TEST_PROCEDURE__TEST_SCRIPT = docPackage.DFIXED_SECTION_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Test Case</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSVS_TEST_PROCEDURE__TEST_CASE = docPackage.DFIXED_SECTION_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>VSVS Test Procedure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSVS_TEST_PROCEDURE_FEATURE_COUNT = docPackage.DFIXED_SECTION_FEATURE_COUNT + 6;

	/**
	 * The number of operations of the '<em>VSVS Test Procedure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSVS_TEST_PROCEDURE_OPERATION_COUNT = docPackage.DFIXED_SECTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.micobs.svm.svs.impl.VSVSProcedureStepImpl <em>VSVS Procedure Step</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uah.aut.srg.micobs.svm.svs.impl.VSVSProcedureStepImpl
	 * @see es.uah.aut.srg.micobs.svm.svs.impl.svsPackageImpl#getVSVSProcedureStep()
	 * @generated
	 */
	int VSVS_PROCEDURE_STEP = 19;

	/**
	 * The number of structural features of the '<em>VSVS Procedure Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSVS_PROCEDURE_STEP_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>VSVS Procedure Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSVS_PROCEDURE_STEP_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.micobs.svm.svs.impl.VSVSAnalysisInspectionReviewImpl <em>VSVS Analysis Inspection Review</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uah.aut.srg.micobs.svm.svs.impl.VSVSAnalysisInspectionReviewImpl
	 * @see es.uah.aut.srg.micobs.svm.svs.impl.svsPackageImpl#getVSVSAnalysisInspectionReview()
	 * @generated
	 */
	int VSVS_ANALYSIS_INSPECTION_REVIEW = 20;

	/**
	 * The feature id for the '<em><b>Subsections</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSVS_ANALYSIS_INSPECTION_REVIEW__SUBSECTIONS = VSVS_FIXED_SECTION__SUBSECTIONS;

	/**
	 * The feature id for the '<em><b>Body</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSVS_ANALYSIS_INSPECTION_REVIEW__BODY = VSVS_FIXED_SECTION__BODY;

	/**
	 * The feature id for the '<em><b>Svs Instatiable Subsections</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSVS_ANALYSIS_INSPECTION_REVIEW__SVS_INSTATIABLE_SUBSECTIONS = VSVS_FIXED_SECTION__SVS_INSTATIABLE_SUBSECTIONS;

	/**
	 * The number of structural features of the '<em>VSVS Analysis Inspection Review</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSVS_ANALYSIS_INSPECTION_REVIEW_FEATURE_COUNT = VSVS_FIXED_SECTION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>VSVS Analysis Inspection Review</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSVS_ANALYSIS_INSPECTION_REVIEW_OPERATION_COUNT = VSVS_FIXED_SECTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.micobs.svm.svs.impl.VSVSTestPlatformRequirementsImpl <em>VSVS Test Platform Requirements</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uah.aut.srg.micobs.svm.svs.impl.VSVSTestPlatformRequirementsImpl
	 * @see es.uah.aut.srg.micobs.svm.svs.impl.svsPackageImpl#getVSVSTestPlatformRequirements()
	 * @generated
	 */
	int VSVS_TEST_PLATFORM_REQUIREMENTS = 21;

	/**
	 * The feature id for the '<em><b>Subsections</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSVS_TEST_PLATFORM_REQUIREMENTS__SUBSECTIONS = VSVS_FIXED_SECTION__SUBSECTIONS;

	/**
	 * The feature id for the '<em><b>Body</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSVS_TEST_PLATFORM_REQUIREMENTS__BODY = VSVS_FIXED_SECTION__BODY;

	/**
	 * The feature id for the '<em><b>Svs Instatiable Subsections</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSVS_TEST_PLATFORM_REQUIREMENTS__SVS_INSTATIABLE_SUBSECTIONS = VSVS_FIXED_SECTION__SVS_INSTATIABLE_SUBSECTIONS;

	/**
	 * The number of structural features of the '<em>VSVS Test Platform Requirements</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSVS_TEST_PLATFORM_REQUIREMENTS_FEATURE_COUNT = VSVS_FIXED_SECTION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>VSVS Test Platform Requirements</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSVS_TEST_PLATFORM_REQUIREMENTS_OPERATION_COUNT = VSVS_FIXED_SECTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.micobs.svm.svs.impl.VSVSAdditionalInformationImpl <em>VSVS Additional Information</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uah.aut.srg.micobs.svm.svs.impl.VSVSAdditionalInformationImpl
	 * @see es.uah.aut.srg.micobs.svm.svs.impl.svsPackageImpl#getVSVSAdditionalInformation()
	 * @generated
	 */
	int VSVS_ADDITIONAL_INFORMATION = 22;

	/**
	 * The feature id for the '<em><b>Subsections</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSVS_ADDITIONAL_INFORMATION__SUBSECTIONS = VSVS_FIXED_SECTION__SUBSECTIONS;

	/**
	 * The feature id for the '<em><b>Body</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSVS_ADDITIONAL_INFORMATION__BODY = VSVS_FIXED_SECTION__BODY;

	/**
	 * The feature id for the '<em><b>Svs Instatiable Subsections</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSVS_ADDITIONAL_INFORMATION__SVS_INSTATIABLE_SUBSECTIONS = VSVS_FIXED_SECTION__SVS_INSTATIABLE_SUBSECTIONS;

	/**
	 * The number of structural features of the '<em>VSVS Additional Information</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSVS_ADDITIONAL_INFORMATION_FEATURE_COUNT = VSVS_FIXED_SECTION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>VSVS Additional Information</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSVS_ADDITIONAL_INFORMATION_OPERATION_COUNT = VSVS_FIXED_SECTION_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.micobs.svm.svs.VSVSDocument <em>VSVS Document</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>VSVS Document</em>'.
	 * @see es.uah.aut.srg.micobs.svm.svs.VSVSDocument
	 * @generated
	 */
	EClass getVSVSDocument();

	/**
	 * Returns the meta object for the containment reference '{@link es.uah.aut.srg.micobs.svm.svs.VSVSDocument#getIntroductionSection <em>Introduction Section</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Introduction Section</em>'.
	 * @see es.uah.aut.srg.micobs.svm.svs.VSVSDocument#getIntroductionSection()
	 * @see #getVSVSDocument()
	 * @generated
	 */
	EReference getVSVSDocument_IntroductionSection();

	/**
	 * Returns the meta object for the containment reference '{@link es.uah.aut.srg.micobs.svm.svs.VSVSDocument#getApplicableDocumentsSection <em>Applicable Documents Section</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Applicable Documents Section</em>'.
	 * @see es.uah.aut.srg.micobs.svm.svs.VSVSDocument#getApplicableDocumentsSection()
	 * @see #getVSVSDocument()
	 * @generated
	 */
	EReference getVSVSDocument_ApplicableDocumentsSection();

	/**
	 * Returns the meta object for the containment reference '{@link es.uah.aut.srg.micobs.svm.svs.VSVSDocument#getReferenceDocumentsSection <em>Reference Documents Section</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Reference Documents Section</em>'.
	 * @see es.uah.aut.srg.micobs.svm.svs.VSVSDocument#getReferenceDocumentsSection()
	 * @see #getVSVSDocument()
	 * @generated
	 */
	EReference getVSVSDocument_ReferenceDocumentsSection();

	/**
	 * Returns the meta object for the containment reference '{@link es.uah.aut.srg.micobs.svm.svs.VSVSDocument#getTermsDefinitionsAbbreviationsSection <em>Terms Definitions Abbreviations Section</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Terms Definitions Abbreviations Section</em>'.
	 * @see es.uah.aut.srg.micobs.svm.svs.VSVSDocument#getTermsDefinitionsAbbreviationsSection()
	 * @see #getVSVSDocument()
	 * @generated
	 */
	EReference getVSVSDocument_TermsDefinitionsAbbreviationsSection();

	/**
	 * Returns the meta object for the containment reference '{@link es.uah.aut.srg.micobs.svm.svs.VSVSDocument#getSoftwareOverviewSection <em>Software Overview Section</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Software Overview Section</em>'.
	 * @see es.uah.aut.srg.micobs.svm.svs.VSVSDocument#getSoftwareOverviewSection()
	 * @see #getVSVSDocument()
	 * @generated
	 */
	EReference getVSVSDocument_SoftwareOverviewSection();

	/**
	 * Returns the meta object for the containment reference '{@link es.uah.aut.srg.micobs.svm.svs.VSVSDocument#getTaskIdentificationSection <em>Task Identification Section</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Task Identification Section</em>'.
	 * @see es.uah.aut.srg.micobs.svm.svs.VSVSDocument#getTaskIdentificationSection()
	 * @see #getVSVSDocument()
	 * @generated
	 */
	EReference getVSVSDocument_TaskIdentificationSection();

	/**
	 * Returns the meta object for the containment reference '{@link es.uah.aut.srg.micobs.svm.svs.VSVSDocument#getTestingSpecificationDesignSection <em>Testing Specification Design Section</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Testing Specification Design Section</em>'.
	 * @see es.uah.aut.srg.micobs.svm.svs.VSVSDocument#getTestingSpecificationDesignSection()
	 * @see #getVSVSDocument()
	 * @generated
	 */
	EReference getVSVSDocument_TestingSpecificationDesignSection();

	/**
	 * Returns the meta object for the containment reference '{@link es.uah.aut.srg.micobs.svm.svs.VSVSDocument#getTestCasesSection <em>Test Cases Section</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Test Cases Section</em>'.
	 * @see es.uah.aut.srg.micobs.svm.svs.VSVSDocument#getTestCasesSection()
	 * @see #getVSVSDocument()
	 * @generated
	 */
	EReference getVSVSDocument_TestCasesSection();

	/**
	 * Returns the meta object for the containment reference '{@link es.uah.aut.srg.micobs.svm.svs.VSVSDocument#getTestProceduresSection <em>Test Procedures Section</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Test Procedures Section</em>'.
	 * @see es.uah.aut.srg.micobs.svm.svs.VSVSDocument#getTestProceduresSection()
	 * @see #getVSVSDocument()
	 * @generated
	 */
	EReference getVSVSDocument_TestProceduresSection();

	/**
	 * Returns the meta object for the containment reference '{@link es.uah.aut.srg.micobs.svm.svs.VSVSDocument#getAnalysisInspectionReviewSection <em>Analysis Inspection Review Section</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Analysis Inspection Review Section</em>'.
	 * @see es.uah.aut.srg.micobs.svm.svs.VSVSDocument#getAnalysisInspectionReviewSection()
	 * @see #getVSVSDocument()
	 * @generated
	 */
	EReference getVSVSDocument_AnalysisInspectionReviewSection();

	/**
	 * Returns the meta object for the containment reference '{@link es.uah.aut.srg.micobs.svm.svs.VSVSDocument#getTestPlatformRequirementsSection <em>Test Platform Requirements Section</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Test Platform Requirements Section</em>'.
	 * @see es.uah.aut.srg.micobs.svm.svs.VSVSDocument#getTestPlatformRequirementsSection()
	 * @see #getVSVSDocument()
	 * @generated
	 */
	EReference getVSVSDocument_TestPlatformRequirementsSection();

	/**
	 * Returns the meta object for the containment reference '{@link es.uah.aut.srg.micobs.svm.svs.VSVSDocument#getAdditionalInformationSection <em>Additional Information Section</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Additional Information Section</em>'.
	 * @see es.uah.aut.srg.micobs.svm.svs.VSVSDocument#getAdditionalInformationSection()
	 * @see #getVSVSDocument()
	 * @generated
	 */
	EReference getVSVSDocument_AdditionalInformationSection();

	/**
	 * Returns the meta object for the containment reference list '{@link es.uah.aut.srg.micobs.svm.svs.VSVSDocument#getSvsFigures <em>Svs Figures</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Svs Figures</em>'.
	 * @see es.uah.aut.srg.micobs.svm.svs.VSVSDocument#getSvsFigures()
	 * @see #getVSVSDocument()
	 * @generated
	 */
	EReference getVSVSDocument_SvsFigures();

	/**
	 * Returns the meta object for the containment reference list '{@link es.uah.aut.srg.micobs.svm.svs.VSVSDocument#getSvsTables <em>Svs Tables</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Svs Tables</em>'.
	 * @see es.uah.aut.srg.micobs.svm.svs.VSVSDocument#getSvsTables()
	 * @see #getVSVSDocument()
	 * @generated
	 */
	EReference getVSVSDocument_SvsTables();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.micobs.svm.svs.VSVSInstantiableSection <em>VSVS Instantiable Section</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>VSVS Instantiable Section</em>'.
	 * @see es.uah.aut.srg.micobs.svm.svs.VSVSInstantiableSection
	 * @generated
	 */
	EClass getVSVSInstantiableSection();

	/**
	 * Returns the meta object for the containment reference '{@link es.uah.aut.srg.micobs.svm.svs.VSVSInstantiableSection#getBody <em>Body</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Body</em>'.
	 * @see es.uah.aut.srg.micobs.svm.svs.VSVSInstantiableSection#getBody()
	 * @see #getVSVSInstantiableSection()
	 * @generated
	 */
	EReference getVSVSInstantiableSection_Body();

	/**
	 * Returns the meta object for the containment reference list '{@link es.uah.aut.srg.micobs.svm.svs.VSVSInstantiableSection#getSvsInstatiableSubsections <em>Svs Instatiable Subsections</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Svs Instatiable Subsections</em>'.
	 * @see es.uah.aut.srg.micobs.svm.svs.VSVSInstantiableSection#getSvsInstatiableSubsections()
	 * @see #getVSVSInstantiableSection()
	 * @generated
	 */
	EReference getVSVSInstantiableSection_SvsInstatiableSubsections();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.micobs.svm.svs.VSVSIntroduction <em>VSVS Introduction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>VSVS Introduction</em>'.
	 * @see es.uah.aut.srg.micobs.svm.svs.VSVSIntroduction
	 * @generated
	 */
	EClass getVSVSIntroduction();

	/**
	 * Returns the meta object for the containment reference list '{@link es.uah.aut.srg.micobs.svm.svs.VSVSIntroduction#getSvsInstatiableSubsections <em>Svs Instatiable Subsections</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Svs Instatiable Subsections</em>'.
	 * @see es.uah.aut.srg.micobs.svm.svs.VSVSIntroduction#getSvsInstatiableSubsections()
	 * @see #getVSVSIntroduction()
	 * @generated
	 */
	EReference getVSVSIntroduction_SvsInstatiableSubsections();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.micobs.svm.svs.VSVSApplicableDocuments <em>VSVS Applicable Documents</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>VSVS Applicable Documents</em>'.
	 * @see es.uah.aut.srg.micobs.svm.svs.VSVSApplicableDocuments
	 * @generated
	 */
	EClass getVSVSApplicableDocuments();

	/**
	 * Returns the meta object for the containment reference list '{@link es.uah.aut.srg.micobs.svm.svs.VSVSApplicableDocuments#getApplicableDocuments <em>Applicable Documents</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Applicable Documents</em>'.
	 * @see es.uah.aut.srg.micobs.svm.svs.VSVSApplicableDocuments#getApplicableDocuments()
	 * @see #getVSVSApplicableDocuments()
	 * @generated
	 */
	EReference getVSVSApplicableDocuments_ApplicableDocuments();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.micobs.svm.svs.VSVSReferenceDocuments <em>VSVS Reference Documents</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>VSVS Reference Documents</em>'.
	 * @see es.uah.aut.srg.micobs.svm.svs.VSVSReferenceDocuments
	 * @generated
	 */
	EClass getVSVSReferenceDocuments();

	/**
	 * Returns the meta object for the containment reference list '{@link es.uah.aut.srg.micobs.svm.svs.VSVSReferenceDocuments#getReferenceDocuments <em>Reference Documents</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Reference Documents</em>'.
	 * @see es.uah.aut.srg.micobs.svm.svs.VSVSReferenceDocuments#getReferenceDocuments()
	 * @see #getVSVSReferenceDocuments()
	 * @generated
	 */
	EReference getVSVSReferenceDocuments_ReferenceDocuments();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.micobs.svm.svs.VSVSTermsDefinitionsAbbreviations <em>VSVS Terms Definitions Abbreviations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>VSVS Terms Definitions Abbreviations</em>'.
	 * @see es.uah.aut.srg.micobs.svm.svs.VSVSTermsDefinitionsAbbreviations
	 * @generated
	 */
	EClass getVSVSTermsDefinitionsAbbreviations();

	/**
	 * Returns the meta object for the containment reference list '{@link es.uah.aut.srg.micobs.svm.svs.VSVSTermsDefinitionsAbbreviations#getTerms <em>Terms</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Terms</em>'.
	 * @see es.uah.aut.srg.micobs.svm.svs.VSVSTermsDefinitionsAbbreviations#getTerms()
	 * @see #getVSVSTermsDefinitionsAbbreviations()
	 * @generated
	 */
	EReference getVSVSTermsDefinitionsAbbreviations_Terms();

	/**
	 * Returns the meta object for the containment reference list '{@link es.uah.aut.srg.micobs.svm.svs.VSVSTermsDefinitionsAbbreviations#getDefinitions <em>Definitions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Definitions</em>'.
	 * @see es.uah.aut.srg.micobs.svm.svs.VSVSTermsDefinitionsAbbreviations#getDefinitions()
	 * @see #getVSVSTermsDefinitionsAbbreviations()
	 * @generated
	 */
	EReference getVSVSTermsDefinitionsAbbreviations_Definitions();

	/**
	 * Returns the meta object for the containment reference list '{@link es.uah.aut.srg.micobs.svm.svs.VSVSTermsDefinitionsAbbreviations#getAbbreviations <em>Abbreviations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Abbreviations</em>'.
	 * @see es.uah.aut.srg.micobs.svm.svs.VSVSTermsDefinitionsAbbreviations#getAbbreviations()
	 * @see #getVSVSTermsDefinitionsAbbreviations()
	 * @generated
	 */
	EReference getVSVSTermsDefinitionsAbbreviations_Abbreviations();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.micobs.svm.svs.VSVSAbstractBriefDescription <em>VSVS Abstract Brief Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>VSVS Abstract Brief Description</em>'.
	 * @see es.uah.aut.srg.micobs.svm.svs.VSVSAbstractBriefDescription
	 * @generated
	 */
	EClass getVSVSAbstractBriefDescription();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.micobs.svm.svs.VSVSAbstractBriefDescription#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see es.uah.aut.srg.micobs.svm.svs.VSVSAbstractBriefDescription#getName()
	 * @see #getVSVSAbstractBriefDescription()
	 * @generated
	 */
	EAttribute getVSVSAbstractBriefDescription_Name();

	/**
	 * Returns the meta object for the containment reference '{@link es.uah.aut.srg.micobs.svm.svs.VSVSAbstractBriefDescription#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Description</em>'.
	 * @see es.uah.aut.srg.micobs.svm.svs.VSVSAbstractBriefDescription#getDescription()
	 * @see #getVSVSAbstractBriefDescription()
	 * @generated
	 */
	EReference getVSVSAbstractBriefDescription_Description();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.micobs.svm.svs.VSVSTerm <em>VSVS Term</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>VSVS Term</em>'.
	 * @see es.uah.aut.srg.micobs.svm.svs.VSVSTerm
	 * @generated
	 */
	EClass getVSVSTerm();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.micobs.svm.svs.VSVSDefinition <em>VSVS Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>VSVS Definition</em>'.
	 * @see es.uah.aut.srg.micobs.svm.svs.VSVSDefinition
	 * @generated
	 */
	EClass getVSVSDefinition();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.micobs.svm.svs.VSVSAbbreviation <em>VSVS Abbreviation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>VSVS Abbreviation</em>'.
	 * @see es.uah.aut.srg.micobs.svm.svs.VSVSAbbreviation
	 * @generated
	 */
	EClass getVSVSAbbreviation();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.micobs.svm.svs.VSVSFixedSection <em>VSVS Fixed Section</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>VSVS Fixed Section</em>'.
	 * @see es.uah.aut.srg.micobs.svm.svs.VSVSFixedSection
	 * @generated
	 */
	EClass getVSVSFixedSection();

	/**
	 * Returns the meta object for the containment reference '{@link es.uah.aut.srg.micobs.svm.svs.VSVSFixedSection#getBody <em>Body</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Body</em>'.
	 * @see es.uah.aut.srg.micobs.svm.svs.VSVSFixedSection#getBody()
	 * @see #getVSVSFixedSection()
	 * @generated
	 */
	EReference getVSVSFixedSection_Body();

	/**
	 * Returns the meta object for the containment reference list '{@link es.uah.aut.srg.micobs.svm.svs.VSVSFixedSection#getSvsInstatiableSubsections <em>Svs Instatiable Subsections</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Svs Instatiable Subsections</em>'.
	 * @see es.uah.aut.srg.micobs.svm.svs.VSVSFixedSection#getSvsInstatiableSubsections()
	 * @see #getVSVSFixedSection()
	 * @generated
	 */
	EReference getVSVSFixedSection_SvsInstatiableSubsections();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.micobs.svm.svs.VSVSSoftwareOverview <em>VSVS Software Overview</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>VSVS Software Overview</em>'.
	 * @see es.uah.aut.srg.micobs.svm.svs.VSVSSoftwareOverview
	 * @generated
	 */
	EClass getVSVSSoftwareOverview();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.micobs.svm.svs.VSVSTaskIdentification <em>VSVS Task Identification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>VSVS Task Identification</em>'.
	 * @see es.uah.aut.srg.micobs.svm.svs.VSVSTaskIdentification
	 * @generated
	 */
	EClass getVSVSTaskIdentification();

	/**
	 * Returns the meta object for the containment reference '{@link es.uah.aut.srg.micobs.svm.svs.VSVSTaskIdentification#getTaskCriteria <em>Task Criteria</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Task Criteria</em>'.
	 * @see es.uah.aut.srg.micobs.svm.svs.VSVSTaskIdentification#getTaskCriteria()
	 * @see #getVSVSTaskIdentification()
	 * @generated
	 */
	EReference getVSVSTaskIdentification_TaskCriteria();

	/**
	 * Returns the meta object for the containment reference '{@link es.uah.aut.srg.micobs.svm.svs.VSVSTaskIdentification#getFeaturesToBeTested <em>Features To Be Tested</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Features To Be Tested</em>'.
	 * @see es.uah.aut.srg.micobs.svm.svs.VSVSTaskIdentification#getFeaturesToBeTested()
	 * @see #getVSVSTaskIdentification()
	 * @generated
	 */
	EReference getVSVSTaskIdentification_FeaturesToBeTested();

	/**
	 * Returns the meta object for the containment reference '{@link es.uah.aut.srg.micobs.svm.svs.VSVSTaskIdentification#getFeaturesNotToBeTested <em>Features Not To Be Tested</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Features Not To Be Tested</em>'.
	 * @see es.uah.aut.srg.micobs.svm.svs.VSVSTaskIdentification#getFeaturesNotToBeTested()
	 * @see #getVSVSTaskIdentification()
	 * @generated
	 */
	EReference getVSVSTaskIdentification_FeaturesNotToBeTested();

	/**
	 * Returns the meta object for the containment reference '{@link es.uah.aut.srg.micobs.svm.svs.VSVSTaskIdentification#getTestPassFailCriteria <em>Test Pass Fail Criteria</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Test Pass Fail Criteria</em>'.
	 * @see es.uah.aut.srg.micobs.svm.svs.VSVSTaskIdentification#getTestPassFailCriteria()
	 * @see #getVSVSTaskIdentification()
	 * @generated
	 */
	EReference getVSVSTaskIdentification_TestPassFailCriteria();

	/**
	 * Returns the meta object for the containment reference '{@link es.uah.aut.srg.micobs.svm.svs.VSVSTaskIdentification#getItemsCanNotBeValidated <em>Items Can Not Be Validated</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Items Can Not Be Validated</em>'.
	 * @see es.uah.aut.srg.micobs.svm.svs.VSVSTaskIdentification#getItemsCanNotBeValidated()
	 * @see #getVSVSTaskIdentification()
	 * @generated
	 */
	EReference getVSVSTaskIdentification_ItemsCanNotBeValidated();

	/**
	 * Returns the meta object for the containment reference '{@link es.uah.aut.srg.micobs.svm.svs.VSVSTaskIdentification#getManuallyAutoGeneratedCode <em>Manually Auto Generated Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Manually Auto Generated Code</em>'.
	 * @see es.uah.aut.srg.micobs.svm.svs.VSVSTaskIdentification#getManuallyAutoGeneratedCode()
	 * @see #getVSVSTaskIdentification()
	 * @generated
	 */
	EReference getVSVSTaskIdentification_ManuallyAutoGeneratedCode();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.micobs.svm.svs.VSVSTestingSpecificationDesign <em>VSVS Testing Specification Design</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>VSVS Testing Specification Design</em>'.
	 * @see es.uah.aut.srg.micobs.svm.svs.VSVSTestingSpecificationDesign
	 * @generated
	 */
	EClass getVSVSTestingSpecificationDesign();

	/**
	 * Returns the meta object for the containment reference '{@link es.uah.aut.srg.micobs.svm.svs.VSVSTestingSpecificationDesign#getGeneral <em>General</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>General</em>'.
	 * @see es.uah.aut.srg.micobs.svm.svs.VSVSTestingSpecificationDesign#getGeneral()
	 * @see #getVSVSTestingSpecificationDesign()
	 * @generated
	 */
	EReference getVSVSTestingSpecificationDesign_General();

	/**
	 * Returns the meta object for the containment reference list '{@link es.uah.aut.srg.micobs.svm.svs.VSVSTestingSpecificationDesign#getTestDesigns <em>Test Designs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Test Designs</em>'.
	 * @see es.uah.aut.srg.micobs.svm.svs.VSVSTestingSpecificationDesign#getTestDesigns()
	 * @see #getVSVSTestingSpecificationDesign()
	 * @generated
	 */
	EReference getVSVSTestingSpecificationDesign_TestDesigns();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.micobs.svm.svs.VSVSTestDesign <em>VSVS Test Design</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>VSVS Test Design</em>'.
	 * @see es.uah.aut.srg.micobs.svm.svs.VSVSTestDesign
	 * @generated
	 */
	EClass getVSVSTestDesign();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.micobs.svm.svs.VSVSTestDesign#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see es.uah.aut.srg.micobs.svm.svs.VSVSTestDesign#getName()
	 * @see #getVSVSTestDesign()
	 * @generated
	 */
	EAttribute getVSVSTestDesign_Name();

	/**
	 * Returns the meta object for the containment reference '{@link es.uah.aut.srg.micobs.svm.svs.VSVSTestDesign#getGeneral <em>General</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>General</em>'.
	 * @see es.uah.aut.srg.micobs.svm.svs.VSVSTestDesign#getGeneral()
	 * @see #getVSVSTestDesign()
	 * @generated
	 */
	EReference getVSVSTestDesign_General();

	/**
	 * Returns the meta object for the containment reference '{@link es.uah.aut.srg.micobs.svm.svs.VSVSTestDesign#getFeaturesToBeTested <em>Features To Be Tested</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Features To Be Tested</em>'.
	 * @see es.uah.aut.srg.micobs.svm.svs.VSVSTestDesign#getFeaturesToBeTested()
	 * @see #getVSVSTestDesign()
	 * @generated
	 */
	EReference getVSVSTestDesign_FeaturesToBeTested();

	/**
	 * Returns the meta object for the containment reference '{@link es.uah.aut.srg.micobs.svm.svs.VSVSTestDesign#getApproachRefinements <em>Approach Refinements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Approach Refinements</em>'.
	 * @see es.uah.aut.srg.micobs.svm.svs.VSVSTestDesign#getApproachRefinements()
	 * @see #getVSVSTestDesign()
	 * @generated
	 */
	EReference getVSVSTestDesign_ApproachRefinements();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.micobs.svm.svs.VSVSTestCases <em>VSVS Test Cases</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>VSVS Test Cases</em>'.
	 * @see es.uah.aut.srg.micobs.svm.svs.VSVSTestCases
	 * @generated
	 */
	EClass getVSVSTestCases();

	/**
	 * Returns the meta object for the containment reference '{@link es.uah.aut.srg.micobs.svm.svs.VSVSTestCases#getGeneral <em>General</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>General</em>'.
	 * @see es.uah.aut.srg.micobs.svm.svs.VSVSTestCases#getGeneral()
	 * @see #getVSVSTestCases()
	 * @generated
	 */
	EReference getVSVSTestCases_General();

	/**
	 * Returns the meta object for the containment reference list '{@link es.uah.aut.srg.micobs.svm.svs.VSVSTestCases#getTestCases <em>Test Cases</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Test Cases</em>'.
	 * @see es.uah.aut.srg.micobs.svm.svs.VSVSTestCases#getTestCases()
	 * @see #getVSVSTestCases()
	 * @generated
	 */
	EReference getVSVSTestCases_TestCases();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.micobs.svm.svs.VSVSTestCase <em>VSVS Test Case</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>VSVS Test Case</em>'.
	 * @see es.uah.aut.srg.micobs.svm.svs.VSVSTestCase
	 * @generated
	 */
	EClass getVSVSTestCase();

	/**
	 * Returns the meta object for the containment reference '{@link es.uah.aut.srg.micobs.svm.svs.VSVSTestCase#getIdentifier <em>Identifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Identifier</em>'.
	 * @see es.uah.aut.srg.micobs.svm.svs.VSVSTestCase#getIdentifier()
	 * @see #getVSVSTestCase()
	 * @generated
	 */
	EReference getVSVSTestCase_Identifier();

	/**
	 * Returns the meta object for the containment reference '{@link es.uah.aut.srg.micobs.svm.svs.VSVSTestCase#getInputs <em>Inputs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Inputs</em>'.
	 * @see es.uah.aut.srg.micobs.svm.svs.VSVSTestCase#getInputs()
	 * @see #getVSVSTestCase()
	 * @generated
	 */
	EReference getVSVSTestCase_Inputs();

	/**
	 * Returns the meta object for the containment reference '{@link es.uah.aut.srg.micobs.svm.svs.VSVSTestCase#getOutputs <em>Outputs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Outputs</em>'.
	 * @see es.uah.aut.srg.micobs.svm.svs.VSVSTestCase#getOutputs()
	 * @see #getVSVSTestCase()
	 * @generated
	 */
	EReference getVSVSTestCase_Outputs();

	/**
	 * Returns the meta object for the containment reference '{@link es.uah.aut.srg.micobs.svm.svs.VSVSTestCase#getPassFailCriteria <em>Pass Fail Criteria</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Pass Fail Criteria</em>'.
	 * @see es.uah.aut.srg.micobs.svm.svs.VSVSTestCase#getPassFailCriteria()
	 * @see #getVSVSTestCase()
	 * @generated
	 */
	EReference getVSVSTestCase_PassFailCriteria();

	/**
	 * Returns the meta object for the containment reference '{@link es.uah.aut.srg.micobs.svm.svs.VSVSTestCase#getEnvironmentalNeeds <em>Environmental Needs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Environmental Needs</em>'.
	 * @see es.uah.aut.srg.micobs.svm.svs.VSVSTestCase#getEnvironmentalNeeds()
	 * @see #getVSVSTestCase()
	 * @generated
	 */
	EReference getVSVSTestCase_EnvironmentalNeeds();

	/**
	 * Returns the meta object for the containment reference '{@link es.uah.aut.srg.micobs.svm.svs.VSVSTestCase#getSpecialConstraints <em>Special Constraints</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Special Constraints</em>'.
	 * @see es.uah.aut.srg.micobs.svm.svs.VSVSTestCase#getSpecialConstraints()
	 * @see #getVSVSTestCase()
	 * @generated
	 */
	EReference getVSVSTestCase_SpecialConstraints();

	/**
	 * Returns the meta object for the containment reference '{@link es.uah.aut.srg.micobs.svm.svs.VSVSTestCase#getInterfaceDependencies <em>Interface Dependencies</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Interface Dependencies</em>'.
	 * @see es.uah.aut.srg.micobs.svm.svs.VSVSTestCase#getInterfaceDependencies()
	 * @see #getVSVSTestCase()
	 * @generated
	 */
	EReference getVSVSTestCase_InterfaceDependencies();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.micobs.svm.svs.VSVSTestProcedures <em>VSVS Test Procedures</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>VSVS Test Procedures</em>'.
	 * @see es.uah.aut.srg.micobs.svm.svs.VSVSTestProcedures
	 * @generated
	 */
	EClass getVSVSTestProcedures();

	/**
	 * Returns the meta object for the containment reference '{@link es.uah.aut.srg.micobs.svm.svs.VSVSTestProcedures#getGeneral <em>General</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>General</em>'.
	 * @see es.uah.aut.srg.micobs.svm.svs.VSVSTestProcedures#getGeneral()
	 * @see #getVSVSTestProcedures()
	 * @generated
	 */
	EReference getVSVSTestProcedures_General();

	/**
	 * Returns the meta object for the containment reference list '{@link es.uah.aut.srg.micobs.svm.svs.VSVSTestProcedures#getTestProcedures <em>Test Procedures</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Test Procedures</em>'.
	 * @see es.uah.aut.srg.micobs.svm.svs.VSVSTestProcedures#getTestProcedures()
	 * @see #getVSVSTestProcedures()
	 * @generated
	 */
	EReference getVSVSTestProcedures_TestProcedures();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.micobs.svm.svs.VSVSTestProcedure <em>VSVS Test Procedure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>VSVS Test Procedure</em>'.
	 * @see es.uah.aut.srg.micobs.svm.svs.VSVSTestProcedure
	 * @generated
	 */
	EClass getVSVSTestProcedure();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.micobs.svm.svs.VSVSTestProcedure#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see es.uah.aut.srg.micobs.svm.svs.VSVSTestProcedure#getName()
	 * @see #getVSVSTestProcedure()
	 * @generated
	 */
	EAttribute getVSVSTestProcedure_Name();

	/**
	 * Returns the meta object for the containment reference '{@link es.uah.aut.srg.micobs.svm.svs.VSVSTestProcedure#getIdentifier <em>Identifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Identifier</em>'.
	 * @see es.uah.aut.srg.micobs.svm.svs.VSVSTestProcedure#getIdentifier()
	 * @see #getVSVSTestProcedure()
	 * @generated
	 */
	EReference getVSVSTestProcedure_Identifier();

	/**
	 * Returns the meta object for the containment reference '{@link es.uah.aut.srg.micobs.svm.svs.VSVSTestProcedure#getPurpose <em>Purpose</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Purpose</em>'.
	 * @see es.uah.aut.srg.micobs.svm.svs.VSVSTestProcedure#getPurpose()
	 * @see #getVSVSTestProcedure()
	 * @generated
	 */
	EReference getVSVSTestProcedure_Purpose();

	/**
	 * Returns the meta object for the containment reference list '{@link es.uah.aut.srg.micobs.svm.svs.VSVSTestProcedure#getSteps <em>Steps</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Steps</em>'.
	 * @see es.uah.aut.srg.micobs.svm.svs.VSVSTestProcedure#getSteps()
	 * @see #getVSVSTestProcedure()
	 * @generated
	 */
	EReference getVSVSTestProcedure_Steps();

	/**
	 * Returns the meta object for the containment reference '{@link es.uah.aut.srg.micobs.svm.svs.VSVSTestProcedure#getTestScript <em>Test Script</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Test Script</em>'.
	 * @see es.uah.aut.srg.micobs.svm.svs.VSVSTestProcedure#getTestScript()
	 * @see #getVSVSTestProcedure()
	 * @generated
	 */
	EReference getVSVSTestProcedure_TestScript();

	/**
	 * Returns the meta object for the reference list '{@link es.uah.aut.srg.micobs.svm.svs.VSVSTestProcedure#getTestCase <em>Test Case</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Test Case</em>'.
	 * @see es.uah.aut.srg.micobs.svm.svs.VSVSTestProcedure#getTestCase()
	 * @see #getVSVSTestProcedure()
	 * @generated
	 */
	EReference getVSVSTestProcedure_TestCase();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.micobs.svm.svs.VSVSProcedureStep <em>VSVS Procedure Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>VSVS Procedure Step</em>'.
	 * @see es.uah.aut.srg.micobs.svm.svs.VSVSProcedureStep
	 * @generated
	 */
	EClass getVSVSProcedureStep();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.micobs.svm.svs.VSVSAnalysisInspectionReview <em>VSVS Analysis Inspection Review</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>VSVS Analysis Inspection Review</em>'.
	 * @see es.uah.aut.srg.micobs.svm.svs.VSVSAnalysisInspectionReview
	 * @generated
	 */
	EClass getVSVSAnalysisInspectionReview();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.micobs.svm.svs.VSVSTestPlatformRequirements <em>VSVS Test Platform Requirements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>VSVS Test Platform Requirements</em>'.
	 * @see es.uah.aut.srg.micobs.svm.svs.VSVSTestPlatformRequirements
	 * @generated
	 */
	EClass getVSVSTestPlatformRequirements();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.micobs.svm.svs.VSVSAdditionalInformation <em>VSVS Additional Information</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>VSVS Additional Information</em>'.
	 * @see es.uah.aut.srg.micobs.svm.svs.VSVSAdditionalInformation
	 * @generated
	 */
	EClass getVSVSAdditionalInformation();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	svsFactory getsvsFactory();

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
		 * The meta object literal for the '{@link es.uah.aut.srg.micobs.svm.svs.impl.VSVSDocumentImpl <em>VSVS Document</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uah.aut.srg.micobs.svm.svs.impl.VSVSDocumentImpl
		 * @see es.uah.aut.srg.micobs.svm.svs.impl.svsPackageImpl#getVSVSDocument()
		 * @generated
		 */
		EClass VSVS_DOCUMENT = eINSTANCE.getVSVSDocument();

		/**
		 * The meta object literal for the '<em><b>Introduction Section</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VSVS_DOCUMENT__INTRODUCTION_SECTION = eINSTANCE.getVSVSDocument_IntroductionSection();

		/**
		 * The meta object literal for the '<em><b>Applicable Documents Section</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VSVS_DOCUMENT__APPLICABLE_DOCUMENTS_SECTION = eINSTANCE.getVSVSDocument_ApplicableDocumentsSection();

		/**
		 * The meta object literal for the '<em><b>Reference Documents Section</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VSVS_DOCUMENT__REFERENCE_DOCUMENTS_SECTION = eINSTANCE.getVSVSDocument_ReferenceDocumentsSection();

		/**
		 * The meta object literal for the '<em><b>Terms Definitions Abbreviations Section</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VSVS_DOCUMENT__TERMS_DEFINITIONS_ABBREVIATIONS_SECTION = eINSTANCE.getVSVSDocument_TermsDefinitionsAbbreviationsSection();

		/**
		 * The meta object literal for the '<em><b>Software Overview Section</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VSVS_DOCUMENT__SOFTWARE_OVERVIEW_SECTION = eINSTANCE.getVSVSDocument_SoftwareOverviewSection();

		/**
		 * The meta object literal for the '<em><b>Task Identification Section</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VSVS_DOCUMENT__TASK_IDENTIFICATION_SECTION = eINSTANCE.getVSVSDocument_TaskIdentificationSection();

		/**
		 * The meta object literal for the '<em><b>Testing Specification Design Section</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VSVS_DOCUMENT__TESTING_SPECIFICATION_DESIGN_SECTION = eINSTANCE.getVSVSDocument_TestingSpecificationDesignSection();

		/**
		 * The meta object literal for the '<em><b>Test Cases Section</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VSVS_DOCUMENT__TEST_CASES_SECTION = eINSTANCE.getVSVSDocument_TestCasesSection();

		/**
		 * The meta object literal for the '<em><b>Test Procedures Section</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VSVS_DOCUMENT__TEST_PROCEDURES_SECTION = eINSTANCE.getVSVSDocument_TestProceduresSection();

		/**
		 * The meta object literal for the '<em><b>Analysis Inspection Review Section</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VSVS_DOCUMENT__ANALYSIS_INSPECTION_REVIEW_SECTION = eINSTANCE.getVSVSDocument_AnalysisInspectionReviewSection();

		/**
		 * The meta object literal for the '<em><b>Test Platform Requirements Section</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VSVS_DOCUMENT__TEST_PLATFORM_REQUIREMENTS_SECTION = eINSTANCE.getVSVSDocument_TestPlatformRequirementsSection();

		/**
		 * The meta object literal for the '<em><b>Additional Information Section</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VSVS_DOCUMENT__ADDITIONAL_INFORMATION_SECTION = eINSTANCE.getVSVSDocument_AdditionalInformationSection();

		/**
		 * The meta object literal for the '<em><b>Svs Figures</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VSVS_DOCUMENT__SVS_FIGURES = eINSTANCE.getVSVSDocument_SvsFigures();

		/**
		 * The meta object literal for the '<em><b>Svs Tables</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VSVS_DOCUMENT__SVS_TABLES = eINSTANCE.getVSVSDocument_SvsTables();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.micobs.svm.svs.impl.VSVSInstantiableSectionImpl <em>VSVS Instantiable Section</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uah.aut.srg.micobs.svm.svs.impl.VSVSInstantiableSectionImpl
		 * @see es.uah.aut.srg.micobs.svm.svs.impl.svsPackageImpl#getVSVSInstantiableSection()
		 * @generated
		 */
		EClass VSVS_INSTANTIABLE_SECTION = eINSTANCE.getVSVSInstantiableSection();

		/**
		 * The meta object literal for the '<em><b>Body</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VSVS_INSTANTIABLE_SECTION__BODY = eINSTANCE.getVSVSInstantiableSection_Body();

		/**
		 * The meta object literal for the '<em><b>Svs Instatiable Subsections</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VSVS_INSTANTIABLE_SECTION__SVS_INSTATIABLE_SUBSECTIONS = eINSTANCE.getVSVSInstantiableSection_SvsInstatiableSubsections();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.micobs.svm.svs.impl.VSVSIntroductionImpl <em>VSVS Introduction</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uah.aut.srg.micobs.svm.svs.impl.VSVSIntroductionImpl
		 * @see es.uah.aut.srg.micobs.svm.svs.impl.svsPackageImpl#getVSVSIntroduction()
		 * @generated
		 */
		EClass VSVS_INTRODUCTION = eINSTANCE.getVSVSIntroduction();

		/**
		 * The meta object literal for the '<em><b>Svs Instatiable Subsections</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VSVS_INTRODUCTION__SVS_INSTATIABLE_SUBSECTIONS = eINSTANCE.getVSVSIntroduction_SvsInstatiableSubsections();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.micobs.svm.svs.impl.VSVSApplicableDocumentsImpl <em>VSVS Applicable Documents</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uah.aut.srg.micobs.svm.svs.impl.VSVSApplicableDocumentsImpl
		 * @see es.uah.aut.srg.micobs.svm.svs.impl.svsPackageImpl#getVSVSApplicableDocuments()
		 * @generated
		 */
		EClass VSVS_APPLICABLE_DOCUMENTS = eINSTANCE.getVSVSApplicableDocuments();

		/**
		 * The meta object literal for the '<em><b>Applicable Documents</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VSVS_APPLICABLE_DOCUMENTS__APPLICABLE_DOCUMENTS = eINSTANCE.getVSVSApplicableDocuments_ApplicableDocuments();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.micobs.svm.svs.impl.VSVSReferenceDocumentsImpl <em>VSVS Reference Documents</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uah.aut.srg.micobs.svm.svs.impl.VSVSReferenceDocumentsImpl
		 * @see es.uah.aut.srg.micobs.svm.svs.impl.svsPackageImpl#getVSVSReferenceDocuments()
		 * @generated
		 */
		EClass VSVS_REFERENCE_DOCUMENTS = eINSTANCE.getVSVSReferenceDocuments();

		/**
		 * The meta object literal for the '<em><b>Reference Documents</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VSVS_REFERENCE_DOCUMENTS__REFERENCE_DOCUMENTS = eINSTANCE.getVSVSReferenceDocuments_ReferenceDocuments();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.micobs.svm.svs.impl.VSVSTermsDefinitionsAbbreviationsImpl <em>VSVS Terms Definitions Abbreviations</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uah.aut.srg.micobs.svm.svs.impl.VSVSTermsDefinitionsAbbreviationsImpl
		 * @see es.uah.aut.srg.micobs.svm.svs.impl.svsPackageImpl#getVSVSTermsDefinitionsAbbreviations()
		 * @generated
		 */
		EClass VSVS_TERMS_DEFINITIONS_ABBREVIATIONS = eINSTANCE.getVSVSTermsDefinitionsAbbreviations();

		/**
		 * The meta object literal for the '<em><b>Terms</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VSVS_TERMS_DEFINITIONS_ABBREVIATIONS__TERMS = eINSTANCE.getVSVSTermsDefinitionsAbbreviations_Terms();

		/**
		 * The meta object literal for the '<em><b>Definitions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VSVS_TERMS_DEFINITIONS_ABBREVIATIONS__DEFINITIONS = eINSTANCE.getVSVSTermsDefinitionsAbbreviations_Definitions();

		/**
		 * The meta object literal for the '<em><b>Abbreviations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VSVS_TERMS_DEFINITIONS_ABBREVIATIONS__ABBREVIATIONS = eINSTANCE.getVSVSTermsDefinitionsAbbreviations_Abbreviations();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.micobs.svm.svs.impl.VSVSAbstractBriefDescriptionImpl <em>VSVS Abstract Brief Description</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uah.aut.srg.micobs.svm.svs.impl.VSVSAbstractBriefDescriptionImpl
		 * @see es.uah.aut.srg.micobs.svm.svs.impl.svsPackageImpl#getVSVSAbstractBriefDescription()
		 * @generated
		 */
		EClass VSVS_ABSTRACT_BRIEF_DESCRIPTION = eINSTANCE.getVSVSAbstractBriefDescription();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VSVS_ABSTRACT_BRIEF_DESCRIPTION__NAME = eINSTANCE.getVSVSAbstractBriefDescription_Name();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VSVS_ABSTRACT_BRIEF_DESCRIPTION__DESCRIPTION = eINSTANCE.getVSVSAbstractBriefDescription_Description();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.micobs.svm.svs.impl.VSVSTermImpl <em>VSVS Term</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uah.aut.srg.micobs.svm.svs.impl.VSVSTermImpl
		 * @see es.uah.aut.srg.micobs.svm.svs.impl.svsPackageImpl#getVSVSTerm()
		 * @generated
		 */
		EClass VSVS_TERM = eINSTANCE.getVSVSTerm();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.micobs.svm.svs.impl.VSVSDefinitionImpl <em>VSVS Definition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uah.aut.srg.micobs.svm.svs.impl.VSVSDefinitionImpl
		 * @see es.uah.aut.srg.micobs.svm.svs.impl.svsPackageImpl#getVSVSDefinition()
		 * @generated
		 */
		EClass VSVS_DEFINITION = eINSTANCE.getVSVSDefinition();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.micobs.svm.svs.impl.VSVSAbbreviationImpl <em>VSVS Abbreviation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uah.aut.srg.micobs.svm.svs.impl.VSVSAbbreviationImpl
		 * @see es.uah.aut.srg.micobs.svm.svs.impl.svsPackageImpl#getVSVSAbbreviation()
		 * @generated
		 */
		EClass VSVS_ABBREVIATION = eINSTANCE.getVSVSAbbreviation();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.micobs.svm.svs.impl.VSVSFixedSectionImpl <em>VSVS Fixed Section</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uah.aut.srg.micobs.svm.svs.impl.VSVSFixedSectionImpl
		 * @see es.uah.aut.srg.micobs.svm.svs.impl.svsPackageImpl#getVSVSFixedSection()
		 * @generated
		 */
		EClass VSVS_FIXED_SECTION = eINSTANCE.getVSVSFixedSection();

		/**
		 * The meta object literal for the '<em><b>Body</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VSVS_FIXED_SECTION__BODY = eINSTANCE.getVSVSFixedSection_Body();

		/**
		 * The meta object literal for the '<em><b>Svs Instatiable Subsections</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VSVS_FIXED_SECTION__SVS_INSTATIABLE_SUBSECTIONS = eINSTANCE.getVSVSFixedSection_SvsInstatiableSubsections();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.micobs.svm.svs.impl.VSVSSoftwareOverviewImpl <em>VSVS Software Overview</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uah.aut.srg.micobs.svm.svs.impl.VSVSSoftwareOverviewImpl
		 * @see es.uah.aut.srg.micobs.svm.svs.impl.svsPackageImpl#getVSVSSoftwareOverview()
		 * @generated
		 */
		EClass VSVS_SOFTWARE_OVERVIEW = eINSTANCE.getVSVSSoftwareOverview();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.micobs.svm.svs.impl.VSVSTaskIdentificationImpl <em>VSVS Task Identification</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uah.aut.srg.micobs.svm.svs.impl.VSVSTaskIdentificationImpl
		 * @see es.uah.aut.srg.micobs.svm.svs.impl.svsPackageImpl#getVSVSTaskIdentification()
		 * @generated
		 */
		EClass VSVS_TASK_IDENTIFICATION = eINSTANCE.getVSVSTaskIdentification();

		/**
		 * The meta object literal for the '<em><b>Task Criteria</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VSVS_TASK_IDENTIFICATION__TASK_CRITERIA = eINSTANCE.getVSVSTaskIdentification_TaskCriteria();

		/**
		 * The meta object literal for the '<em><b>Features To Be Tested</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VSVS_TASK_IDENTIFICATION__FEATURES_TO_BE_TESTED = eINSTANCE.getVSVSTaskIdentification_FeaturesToBeTested();

		/**
		 * The meta object literal for the '<em><b>Features Not To Be Tested</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VSVS_TASK_IDENTIFICATION__FEATURES_NOT_TO_BE_TESTED = eINSTANCE.getVSVSTaskIdentification_FeaturesNotToBeTested();

		/**
		 * The meta object literal for the '<em><b>Test Pass Fail Criteria</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VSVS_TASK_IDENTIFICATION__TEST_PASS_FAIL_CRITERIA = eINSTANCE.getVSVSTaskIdentification_TestPassFailCriteria();

		/**
		 * The meta object literal for the '<em><b>Items Can Not Be Validated</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VSVS_TASK_IDENTIFICATION__ITEMS_CAN_NOT_BE_VALIDATED = eINSTANCE.getVSVSTaskIdentification_ItemsCanNotBeValidated();

		/**
		 * The meta object literal for the '<em><b>Manually Auto Generated Code</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VSVS_TASK_IDENTIFICATION__MANUALLY_AUTO_GENERATED_CODE = eINSTANCE.getVSVSTaskIdentification_ManuallyAutoGeneratedCode();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.micobs.svm.svs.impl.VSVSTestingSpecificationDesignImpl <em>VSVS Testing Specification Design</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uah.aut.srg.micobs.svm.svs.impl.VSVSTestingSpecificationDesignImpl
		 * @see es.uah.aut.srg.micobs.svm.svs.impl.svsPackageImpl#getVSVSTestingSpecificationDesign()
		 * @generated
		 */
		EClass VSVS_TESTING_SPECIFICATION_DESIGN = eINSTANCE.getVSVSTestingSpecificationDesign();

		/**
		 * The meta object literal for the '<em><b>General</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VSVS_TESTING_SPECIFICATION_DESIGN__GENERAL = eINSTANCE.getVSVSTestingSpecificationDesign_General();

		/**
		 * The meta object literal for the '<em><b>Test Designs</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VSVS_TESTING_SPECIFICATION_DESIGN__TEST_DESIGNS = eINSTANCE.getVSVSTestingSpecificationDesign_TestDesigns();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.micobs.svm.svs.impl.VSVSTestDesignImpl <em>VSVS Test Design</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uah.aut.srg.micobs.svm.svs.impl.VSVSTestDesignImpl
		 * @see es.uah.aut.srg.micobs.svm.svs.impl.svsPackageImpl#getVSVSTestDesign()
		 * @generated
		 */
		EClass VSVS_TEST_DESIGN = eINSTANCE.getVSVSTestDesign();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VSVS_TEST_DESIGN__NAME = eINSTANCE.getVSVSTestDesign_Name();

		/**
		 * The meta object literal for the '<em><b>General</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VSVS_TEST_DESIGN__GENERAL = eINSTANCE.getVSVSTestDesign_General();

		/**
		 * The meta object literal for the '<em><b>Features To Be Tested</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VSVS_TEST_DESIGN__FEATURES_TO_BE_TESTED = eINSTANCE.getVSVSTestDesign_FeaturesToBeTested();

		/**
		 * The meta object literal for the '<em><b>Approach Refinements</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VSVS_TEST_DESIGN__APPROACH_REFINEMENTS = eINSTANCE.getVSVSTestDesign_ApproachRefinements();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.micobs.svm.svs.impl.VSVSTestCasesImpl <em>VSVS Test Cases</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uah.aut.srg.micobs.svm.svs.impl.VSVSTestCasesImpl
		 * @see es.uah.aut.srg.micobs.svm.svs.impl.svsPackageImpl#getVSVSTestCases()
		 * @generated
		 */
		EClass VSVS_TEST_CASES = eINSTANCE.getVSVSTestCases();

		/**
		 * The meta object literal for the '<em><b>General</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VSVS_TEST_CASES__GENERAL = eINSTANCE.getVSVSTestCases_General();

		/**
		 * The meta object literal for the '<em><b>Test Cases</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VSVS_TEST_CASES__TEST_CASES = eINSTANCE.getVSVSTestCases_TestCases();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.micobs.svm.svs.impl.VSVSTestCaseImpl <em>VSVS Test Case</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uah.aut.srg.micobs.svm.svs.impl.VSVSTestCaseImpl
		 * @see es.uah.aut.srg.micobs.svm.svs.impl.svsPackageImpl#getVSVSTestCase()
		 * @generated
		 */
		EClass VSVS_TEST_CASE = eINSTANCE.getVSVSTestCase();

		/**
		 * The meta object literal for the '<em><b>Identifier</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VSVS_TEST_CASE__IDENTIFIER = eINSTANCE.getVSVSTestCase_Identifier();

		/**
		 * The meta object literal for the '<em><b>Inputs</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VSVS_TEST_CASE__INPUTS = eINSTANCE.getVSVSTestCase_Inputs();

		/**
		 * The meta object literal for the '<em><b>Outputs</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VSVS_TEST_CASE__OUTPUTS = eINSTANCE.getVSVSTestCase_Outputs();

		/**
		 * The meta object literal for the '<em><b>Pass Fail Criteria</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VSVS_TEST_CASE__PASS_FAIL_CRITERIA = eINSTANCE.getVSVSTestCase_PassFailCriteria();

		/**
		 * The meta object literal for the '<em><b>Environmental Needs</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VSVS_TEST_CASE__ENVIRONMENTAL_NEEDS = eINSTANCE.getVSVSTestCase_EnvironmentalNeeds();

		/**
		 * The meta object literal for the '<em><b>Special Constraints</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VSVS_TEST_CASE__SPECIAL_CONSTRAINTS = eINSTANCE.getVSVSTestCase_SpecialConstraints();

		/**
		 * The meta object literal for the '<em><b>Interface Dependencies</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VSVS_TEST_CASE__INTERFACE_DEPENDENCIES = eINSTANCE.getVSVSTestCase_InterfaceDependencies();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.micobs.svm.svs.impl.VSVSTestProceduresImpl <em>VSVS Test Procedures</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uah.aut.srg.micobs.svm.svs.impl.VSVSTestProceduresImpl
		 * @see es.uah.aut.srg.micobs.svm.svs.impl.svsPackageImpl#getVSVSTestProcedures()
		 * @generated
		 */
		EClass VSVS_TEST_PROCEDURES = eINSTANCE.getVSVSTestProcedures();

		/**
		 * The meta object literal for the '<em><b>General</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VSVS_TEST_PROCEDURES__GENERAL = eINSTANCE.getVSVSTestProcedures_General();

		/**
		 * The meta object literal for the '<em><b>Test Procedures</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VSVS_TEST_PROCEDURES__TEST_PROCEDURES = eINSTANCE.getVSVSTestProcedures_TestProcedures();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.micobs.svm.svs.impl.VSVSTestProcedureImpl <em>VSVS Test Procedure</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uah.aut.srg.micobs.svm.svs.impl.VSVSTestProcedureImpl
		 * @see es.uah.aut.srg.micobs.svm.svs.impl.svsPackageImpl#getVSVSTestProcedure()
		 * @generated
		 */
		EClass VSVS_TEST_PROCEDURE = eINSTANCE.getVSVSTestProcedure();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VSVS_TEST_PROCEDURE__NAME = eINSTANCE.getVSVSTestProcedure_Name();

		/**
		 * The meta object literal for the '<em><b>Identifier</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VSVS_TEST_PROCEDURE__IDENTIFIER = eINSTANCE.getVSVSTestProcedure_Identifier();

		/**
		 * The meta object literal for the '<em><b>Purpose</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VSVS_TEST_PROCEDURE__PURPOSE = eINSTANCE.getVSVSTestProcedure_Purpose();

		/**
		 * The meta object literal for the '<em><b>Steps</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VSVS_TEST_PROCEDURE__STEPS = eINSTANCE.getVSVSTestProcedure_Steps();

		/**
		 * The meta object literal for the '<em><b>Test Script</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VSVS_TEST_PROCEDURE__TEST_SCRIPT = eINSTANCE.getVSVSTestProcedure_TestScript();

		/**
		 * The meta object literal for the '<em><b>Test Case</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VSVS_TEST_PROCEDURE__TEST_CASE = eINSTANCE.getVSVSTestProcedure_TestCase();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.micobs.svm.svs.impl.VSVSProcedureStepImpl <em>VSVS Procedure Step</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uah.aut.srg.micobs.svm.svs.impl.VSVSProcedureStepImpl
		 * @see es.uah.aut.srg.micobs.svm.svs.impl.svsPackageImpl#getVSVSProcedureStep()
		 * @generated
		 */
		EClass VSVS_PROCEDURE_STEP = eINSTANCE.getVSVSProcedureStep();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.micobs.svm.svs.impl.VSVSAnalysisInspectionReviewImpl <em>VSVS Analysis Inspection Review</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uah.aut.srg.micobs.svm.svs.impl.VSVSAnalysisInspectionReviewImpl
		 * @see es.uah.aut.srg.micobs.svm.svs.impl.svsPackageImpl#getVSVSAnalysisInspectionReview()
		 * @generated
		 */
		EClass VSVS_ANALYSIS_INSPECTION_REVIEW = eINSTANCE.getVSVSAnalysisInspectionReview();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.micobs.svm.svs.impl.VSVSTestPlatformRequirementsImpl <em>VSVS Test Platform Requirements</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uah.aut.srg.micobs.svm.svs.impl.VSVSTestPlatformRequirementsImpl
		 * @see es.uah.aut.srg.micobs.svm.svs.impl.svsPackageImpl#getVSVSTestPlatformRequirements()
		 * @generated
		 */
		EClass VSVS_TEST_PLATFORM_REQUIREMENTS = eINSTANCE.getVSVSTestPlatformRequirements();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.micobs.svm.svs.impl.VSVSAdditionalInformationImpl <em>VSVS Additional Information</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uah.aut.srg.micobs.svm.svs.impl.VSVSAdditionalInformationImpl
		 * @see es.uah.aut.srg.micobs.svm.svs.impl.svsPackageImpl#getVSVSAdditionalInformation()
		 * @generated
		 */
		EClass VSVS_ADDITIONAL_INFORMATION = eINSTANCE.getVSVSAdditionalInformation();

	}

} //svsPackage
