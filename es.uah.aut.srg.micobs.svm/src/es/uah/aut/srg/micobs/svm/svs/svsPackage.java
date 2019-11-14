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

import es.uah.aut.srg.micobs.doctpl.doctpl.doctplPackage;

import es.uah.aut.srg.micobs.svm.vdm.vdmPackage;

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
	int VSVS_INSTANTIABLE_SECTION__SUBSECTIONS = doctplPackage.DINSTANTIABLE_SECTION__SUBSECTIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSVS_INSTANTIABLE_SECTION__NAME = doctplPackage.DINSTANTIABLE_SECTION__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSVS_INSTANTIABLE_SECTION__DESCRIPTION = doctplPackage.DINSTANTIABLE_SECTION__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Body</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSVS_INSTANTIABLE_SECTION__BODY = doctplPackage.DINSTANTIABLE_SECTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Svs Instatiable Subsections</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSVS_INSTANTIABLE_SECTION__SVS_INSTATIABLE_SUBSECTIONS = doctplPackage.DINSTANTIABLE_SECTION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>VSVS Instantiable Section</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSVS_INSTANTIABLE_SECTION_FEATURE_COUNT = doctplPackage.DINSTANTIABLE_SECTION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>VSVS Instantiable Section</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSVS_INSTANTIABLE_SECTION_OPERATION_COUNT = doctplPackage.DINSTANTIABLE_SECTION_OPERATION_COUNT + 0;

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
	int VSVS_INTRODUCTION__SUBSECTIONS = doctplPackage.DFIXED_SECTION__SUBSECTIONS;

	/**
	 * The feature id for the '<em><b>Svs Instatiable Subsections</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSVS_INTRODUCTION__SVS_INSTATIABLE_SUBSECTIONS = doctplPackage.DFIXED_SECTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>VSVS Introduction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSVS_INTRODUCTION_FEATURE_COUNT = doctplPackage.DFIXED_SECTION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>VSVS Introduction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSVS_INTRODUCTION_OPERATION_COUNT = doctplPackage.DFIXED_SECTION_OPERATION_COUNT + 0;

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
	int VSVS_APPLICABLE_DOCUMENTS__SUBSECTIONS = doctplPackage.DFIXED_SECTION__SUBSECTIONS;

	/**
	 * The feature id for the '<em><b>Applicable Documents</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSVS_APPLICABLE_DOCUMENTS__APPLICABLE_DOCUMENTS = doctplPackage.DFIXED_SECTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>VSVS Applicable Documents</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSVS_APPLICABLE_DOCUMENTS_FEATURE_COUNT = doctplPackage.DFIXED_SECTION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>VSVS Applicable Documents</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSVS_APPLICABLE_DOCUMENTS_OPERATION_COUNT = doctplPackage.DFIXED_SECTION_OPERATION_COUNT + 0;

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
	int VSVS_REFERENCE_DOCUMENTS__SUBSECTIONS = doctplPackage.DFIXED_SECTION__SUBSECTIONS;

	/**
	 * The feature id for the '<em><b>Reference Documents</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSVS_REFERENCE_DOCUMENTS__REFERENCE_DOCUMENTS = doctplPackage.DFIXED_SECTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>VSVS Reference Documents</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSVS_REFERENCE_DOCUMENTS_FEATURE_COUNT = doctplPackage.DFIXED_SECTION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>VSVS Reference Documents</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSVS_REFERENCE_DOCUMENTS_OPERATION_COUNT = doctplPackage.DFIXED_SECTION_OPERATION_COUNT + 0;

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
	int VSVS_TERMS_DEFINITIONS_ABBREVIATIONS__SUBSECTIONS = doctplPackage.DFIXED_SECTION__SUBSECTIONS;

	/**
	 * The feature id for the '<em><b>Terms</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSVS_TERMS_DEFINITIONS_ABBREVIATIONS__TERMS = doctplPackage.DFIXED_SECTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Definitions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSVS_TERMS_DEFINITIONS_ABBREVIATIONS__DEFINITIONS = doctplPackage.DFIXED_SECTION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Abbreviations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSVS_TERMS_DEFINITIONS_ABBREVIATIONS__ABBREVIATIONS = doctplPackage.DFIXED_SECTION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>VSVS Terms Definitions Abbreviations</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSVS_TERMS_DEFINITIONS_ABBREVIATIONS_FEATURE_COUNT = doctplPackage.DFIXED_SECTION_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>VSVS Terms Definitions Abbreviations</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSVS_TERMS_DEFINITIONS_ABBREVIATIONS_OPERATION_COUNT = doctplPackage.DFIXED_SECTION_OPERATION_COUNT + 0;

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
	int VSVS_FIXED_SECTION__SUBSECTIONS = doctplPackage.DFIXED_SECTION__SUBSECTIONS;

	/**
	 * The feature id for the '<em><b>Body</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSVS_FIXED_SECTION__BODY = doctplPackage.DFIXED_SECTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Svs Instatiable Subsections</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSVS_FIXED_SECTION__SVS_INSTATIABLE_SUBSECTIONS = doctplPackage.DFIXED_SECTION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>VSVS Fixed Section</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSVS_FIXED_SECTION_FEATURE_COUNT = doctplPackage.DFIXED_SECTION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>VSVS Fixed Section</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSVS_FIXED_SECTION_OPERATION_COUNT = doctplPackage.DFIXED_SECTION_OPERATION_COUNT + 0;

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
	int VSVS_TASK_IDENTIFICATION__SUBSECTIONS = doctplPackage.DFIXED_SECTION__SUBSECTIONS;

	/**
	 * The feature id for the '<em><b>Task Criteria</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSVS_TASK_IDENTIFICATION__TASK_CRITERIA = doctplPackage.DFIXED_SECTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Features To Be Tested</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSVS_TASK_IDENTIFICATION__FEATURES_TO_BE_TESTED = doctplPackage.DFIXED_SECTION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Features Not To Be Tested</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSVS_TASK_IDENTIFICATION__FEATURES_NOT_TO_BE_TESTED = doctplPackage.DFIXED_SECTION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Test Pass Fail Criteria</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSVS_TASK_IDENTIFICATION__TEST_PASS_FAIL_CRITERIA = doctplPackage.DFIXED_SECTION_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Items Can Not Be Validated</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSVS_TASK_IDENTIFICATION__ITEMS_CAN_NOT_BE_VALIDATED = doctplPackage.DFIXED_SECTION_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Manually Auto Generated Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSVS_TASK_IDENTIFICATION__MANUALLY_AUTO_GENERATED_CODE = doctplPackage.DFIXED_SECTION_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>VSVS Task Identification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSVS_TASK_IDENTIFICATION_FEATURE_COUNT = doctplPackage.DFIXED_SECTION_FEATURE_COUNT + 6;

	/**
	 * The number of operations of the '<em>VSVS Task Identification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSVS_TASK_IDENTIFICATION_OPERATION_COUNT = doctplPackage.DFIXED_SECTION_OPERATION_COUNT + 0;

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
	int VSVS_TESTING_SPECIFICATION_DESIGN__SUBSECTIONS = doctplPackage.DFIXED_SECTION__SUBSECTIONS;

	/**
	 * The feature id for the '<em><b>General</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSVS_TESTING_SPECIFICATION_DESIGN__GENERAL = doctplPackage.DFIXED_SECTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Scenarios</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSVS_TESTING_SPECIFICATION_DESIGN__SCENARIOS = doctplPackage.DFIXED_SECTION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Test Designs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSVS_TESTING_SPECIFICATION_DESIGN__TEST_DESIGNS = doctplPackage.DFIXED_SECTION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>VSVS Testing Specification Design</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSVS_TESTING_SPECIFICATION_DESIGN_FEATURE_COUNT = doctplPackage.DFIXED_SECTION_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>VSVS Testing Specification Design</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSVS_TESTING_SPECIFICATION_DESIGN_OPERATION_COUNT = doctplPackage.DFIXED_SECTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.micobs.svm.svs.impl.VSVSScenariosSectionImpl <em>VSVS Scenarios Section</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uah.aut.srg.micobs.svm.svs.impl.VSVSScenariosSectionImpl
	 * @see es.uah.aut.srg.micobs.svm.svs.impl.svsPackageImpl#getVSVSScenariosSection()
	 * @generated
	 */
	int VSVS_SCENARIOS_SECTION = 14;

	/**
	 * The feature id for the '<em><b>Subsections</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSVS_SCENARIOS_SECTION__SUBSECTIONS = doctplPackage.DFIXED_SECTION__SUBSECTIONS;

	/**
	 * The feature id for the '<em><b>Scenarios</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSVS_SCENARIOS_SECTION__SCENARIOS = doctplPackage.DFIXED_SECTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>VSVS Scenarios Section</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSVS_SCENARIOS_SECTION_FEATURE_COUNT = doctplPackage.DFIXED_SECTION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>VSVS Scenarios Section</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSVS_SCENARIOS_SECTION_OPERATION_COUNT = doctplPackage.DFIXED_SECTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.micobs.svm.svs.impl.VSVSScenarioSectionImpl <em>VSVS Scenario Section</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uah.aut.srg.micobs.svm.svs.impl.VSVSScenarioSectionImpl
	 * @see es.uah.aut.srg.micobs.svm.svs.impl.svsPackageImpl#getVSVSScenarioSection()
	 * @generated
	 */
	int VSVS_SCENARIO_SECTION = 15;

	/**
	 * The feature id for the '<em><b>Subsections</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSVS_SCENARIO_SECTION__SUBSECTIONS = doctplPackage.DFIXED_SECTION__SUBSECTIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSVS_SCENARIO_SECTION__NAME = doctplPackage.DFIXED_SECTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSVS_SCENARIO_SECTION__ID = doctplPackage.DFIXED_SECTION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Body</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSVS_SCENARIO_SECTION__BODY = doctplPackage.DFIXED_SECTION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>VSVS Scenario Section</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSVS_SCENARIO_SECTION_FEATURE_COUNT = doctplPackage.DFIXED_SECTION_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>VSVS Scenario Section</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSVS_SCENARIO_SECTION_OPERATION_COUNT = doctplPackage.DFIXED_SECTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.micobs.svm.svs.impl.VSVSTestDesignImpl <em>VSVS Test Design</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uah.aut.srg.micobs.svm.svs.impl.VSVSTestDesignImpl
	 * @see es.uah.aut.srg.micobs.svm.svs.impl.svsPackageImpl#getVSVSTestDesign()
	 * @generated
	 */
	int VSVS_TEST_DESIGN = 16;

	/**
	 * The feature id for the '<em><b>Subsections</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSVS_TEST_DESIGN__SUBSECTIONS = doctplPackage.DFIXED_SECTION__SUBSECTIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSVS_TEST_DESIGN__NAME = doctplPackage.DFIXED_SECTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>General</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSVS_TEST_DESIGN__GENERAL = doctplPackage.DFIXED_SECTION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Features To Be Tested</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSVS_TEST_DESIGN__FEATURES_TO_BE_TESTED = doctplPackage.DFIXED_SECTION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Approach Refinements</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSVS_TEST_DESIGN__APPROACH_REFINEMENTS = doctplPackage.DFIXED_SECTION_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>VSVS Test Design</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSVS_TEST_DESIGN_FEATURE_COUNT = doctplPackage.DFIXED_SECTION_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>VSVS Test Design</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSVS_TEST_DESIGN_OPERATION_COUNT = doctplPackage.DFIXED_SECTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.micobs.svm.svs.impl.VSVSTestInfoImpl <em>VSVS Test Info</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uah.aut.srg.micobs.svm.svs.impl.VSVSTestInfoImpl
	 * @see es.uah.aut.srg.micobs.svm.svs.impl.svsPackageImpl#getVSVSTestInfo()
	 * @generated
	 */
	int VSVS_TEST_INFO = 17;

	/**
	 * The feature id for the '<em><b>Body</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSVS_TEST_INFO__BODY = 0;

	/**
	 * The number of structural features of the '<em>VSVS Test Info</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSVS_TEST_INFO_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>VSVS Test Info</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSVS_TEST_INFO_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.micobs.svm.svs.impl.VSVSTestCasesImpl <em>VSVS Test Cases</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uah.aut.srg.micobs.svm.svs.impl.VSVSTestCasesImpl
	 * @see es.uah.aut.srg.micobs.svm.svs.impl.svsPackageImpl#getVSVSTestCases()
	 * @generated
	 */
	int VSVS_TEST_CASES = 18;

	/**
	 * The feature id for the '<em><b>Items</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSVS_TEST_CASES__ITEMS = vdmPackage.VVALIDATION_DOCUMENT_FIXED_GROUP__ITEMS;

	/**
	 * The feature id for the '<em><b>Doc</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSVS_TEST_CASES__DOC = vdmPackage.VVALIDATION_DOCUMENT_FIXED_GROUP__DOC;

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
	int VSVS_TEST_CASE = 19;

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
	 * The feature id for the '<em><b>Validating Item</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSVS_TEST_CASE__VALIDATING_ITEM = vdmPackage.VVALIDATION_DOCUMENT_ABSTRACT_ITEM__VALIDATING_ITEM;

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
	int VSVS_TEST_PROCEDURES = 20;

	/**
	 * The feature id for the '<em><b>Subsections</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSVS_TEST_PROCEDURES__SUBSECTIONS = doctplPackage.DFIXED_SECTION__SUBSECTIONS;

	/**
	 * The feature id for the '<em><b>General</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSVS_TEST_PROCEDURES__GENERAL = doctplPackage.DFIXED_SECTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Test Procedures</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSVS_TEST_PROCEDURES__TEST_PROCEDURES = doctplPackage.DFIXED_SECTION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>VSVS Test Procedures</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSVS_TEST_PROCEDURES_FEATURE_COUNT = doctplPackage.DFIXED_SECTION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>VSVS Test Procedures</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSVS_TEST_PROCEDURES_OPERATION_COUNT = doctplPackage.DFIXED_SECTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.micobs.svm.svs.impl.VSVSTestProcedureImpl <em>VSVS Test Procedure</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uah.aut.srg.micobs.svm.svs.impl.VSVSTestProcedureImpl
	 * @see es.uah.aut.srg.micobs.svm.svs.impl.svsPackageImpl#getVSVSTestProcedure()
	 * @generated
	 */
	int VSVS_TEST_PROCEDURE = 21;

	/**
	 * The feature id for the '<em><b>Subsections</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSVS_TEST_PROCEDURE__SUBSECTIONS = doctplPackage.DFIXED_SECTION__SUBSECTIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSVS_TEST_PROCEDURE__NAME = doctplPackage.DFIXED_SECTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSVS_TEST_PROCEDURE__IDENTIFIER = doctplPackage.DFIXED_SECTION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Purpose</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSVS_TEST_PROCEDURE__PURPOSE = doctplPackage.DFIXED_SECTION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Scenario</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSVS_TEST_PROCEDURE__SCENARIO = doctplPackage.DFIXED_SECTION_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Procedure Steps</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSVS_TEST_PROCEDURE__PROCEDURE_STEPS = doctplPackage.DFIXED_SECTION_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Test Script</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSVS_TEST_PROCEDURE__TEST_SCRIPT = doctplPackage.DFIXED_SECTION_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Test Case</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSVS_TEST_PROCEDURE__TEST_CASE = doctplPackage.DFIXED_SECTION_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>VSVS Test Procedure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSVS_TEST_PROCEDURE_FEATURE_COUNT = doctplPackage.DFIXED_SECTION_FEATURE_COUNT + 7;

	/**
	 * The number of operations of the '<em>VSVS Test Procedure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSVS_TEST_PROCEDURE_OPERATION_COUNT = doctplPackage.DFIXED_SECTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.micobs.svm.svs.impl.VSVSProcedureStepsImpl <em>VSVS Procedure Steps</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uah.aut.srg.micobs.svm.svs.impl.VSVSProcedureStepsImpl
	 * @see es.uah.aut.srg.micobs.svm.svs.impl.svsPackageImpl#getVSVSProcedureSteps()
	 * @generated
	 */
	int VSVS_PROCEDURE_STEPS = 22;

	/**
	 * The feature id for the '<em><b>Subsections</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSVS_PROCEDURE_STEPS__SUBSECTIONS = doctplPackage.DFIXED_SECTION__SUBSECTIONS;

	/**
	 * The feature id for the '<em><b>Step</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSVS_PROCEDURE_STEPS__STEP = doctplPackage.DFIXED_SECTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>VSVS Procedure Steps</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSVS_PROCEDURE_STEPS_FEATURE_COUNT = doctplPackage.DFIXED_SECTION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>VSVS Procedure Steps</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSVS_PROCEDURE_STEPS_OPERATION_COUNT = doctplPackage.DFIXED_SECTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.micobs.svm.svs.impl.VSVSProcedureStepImpl <em>VSVS Procedure Step</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uah.aut.srg.micobs.svm.svs.impl.VSVSProcedureStepImpl
	 * @see es.uah.aut.srg.micobs.svm.svs.impl.svsPackageImpl#getVSVSProcedureStep()
	 * @generated
	 */
	int VSVS_PROCEDURE_STEP = 23;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSVS_PROCEDURE_STEP__NAME = 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSVS_PROCEDURE_STEP__DESCRIPTION = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSVS_PROCEDURE_STEP__ID = 2;

	/**
	 * The feature id for the '<em><b>Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSVS_PROCEDURE_STEP__MODE = 3;

	/**
	 * The feature id for the '<em><b>Replays</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSVS_PROCEDURE_STEP__REPLAYS = 4;

	/**
	 * The feature id for the '<em><b>Prev step idref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSVS_PROCEDURE_STEP__PREV_STEP_IDREF = 5;

	/**
	 * The feature id for the '<em><b>Output idref from prev step</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSVS_PROCEDURE_STEP__OUTPUT_IDREF_FROM_PREV_STEP = 6;

	/**
	 * The feature id for the '<em><b>Inputs</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSVS_PROCEDURE_STEP__INPUTS = 7;

	/**
	 * The feature id for the '<em><b>Outputs</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSVS_PROCEDURE_STEP__OUTPUTS = 8;

	/**
	 * The feature id for the '<em><b>Special Packets</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSVS_PROCEDURE_STEP__SPECIAL_PACKETS = 9;

	/**
	 * The feature id for the '<em><b>Concurrent steps</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSVS_PROCEDURE_STEP__CONCURRENT_STEPS = 10;

	/**
	 * The number of structural features of the '<em>VSVS Procedure Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSVS_PROCEDURE_STEP_FEATURE_COUNT = 11;

	/**
	 * The number of operations of the '<em>VSVS Procedure Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSVS_PROCEDURE_STEP_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.micobs.svm.svs.impl.VSVSStepInputsImpl <em>VSVS Step Inputs</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uah.aut.srg.micobs.svm.svs.impl.VSVSStepInputsImpl
	 * @see es.uah.aut.srg.micobs.svm.svs.impl.svsPackageImpl#getVSVSStepInputs()
	 * @generated
	 */
	int VSVS_STEP_INPUTS = 24;

	/**
	 * The feature id for the '<em><b>Input</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSVS_STEP_INPUTS__INPUT = 0;

	/**
	 * The number of structural features of the '<em>VSVS Step Inputs</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSVS_STEP_INPUTS_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>VSVS Step Inputs</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSVS_STEP_INPUTS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.micobs.svm.svs.impl.VSVSStepOutputsImpl <em>VSVS Step Outputs</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uah.aut.srg.micobs.svm.svs.impl.VSVSStepOutputsImpl
	 * @see es.uah.aut.srg.micobs.svm.svs.impl.svsPackageImpl#getVSVSStepOutputs()
	 * @generated
	 */
	int VSVS_STEP_OUTPUTS = 25;

	/**
	 * The feature id for the '<em><b>Checkmode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSVS_STEP_OUTPUTS__CHECKMODE = 0;

	/**
	 * The feature id for the '<em><b>Valid time interval value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSVS_STEP_OUTPUTS__VALID_TIME_INTERVAL_VALUE = 1;

	/**
	 * The feature id for the '<em><b>Valid time interval unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSVS_STEP_OUTPUTS__VALID_TIME_INTERVAL_UNIT = 2;

	/**
	 * The feature id for the '<em><b>Output</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSVS_STEP_OUTPUTS__OUTPUT = 3;

	/**
	 * The number of structural features of the '<em>VSVS Step Outputs</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSVS_STEP_OUTPUTS_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>VSVS Step Outputs</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSVS_STEP_OUTPUTS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.micobs.svm.svs.impl.VSVSStepSpecialPacketsImpl <em>VSVS Step Special Packets</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uah.aut.srg.micobs.svm.svs.impl.VSVSStepSpecialPacketsImpl
	 * @see es.uah.aut.srg.micobs.svm.svs.impl.svsPackageImpl#getVSVSStepSpecialPackets()
	 * @generated
	 */
	int VSVS_STEP_SPECIAL_PACKETS = 26;

	/**
	 * The feature id for the '<em><b>Enable</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSVS_STEP_SPECIAL_PACKETS__ENABLE = 0;

	/**
	 * The feature id for the '<em><b>Disable</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSVS_STEP_SPECIAL_PACKETS__DISABLE = 1;

	/**
	 * The feature id for the '<em><b>Enable print</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSVS_STEP_SPECIAL_PACKETS__ENABLE_PRINT = 2;

	/**
	 * The feature id for the '<em><b>Disable print</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSVS_STEP_SPECIAL_PACKETS__DISABLE_PRINT = 3;

	/**
	 * The number of structural features of the '<em>VSVS Step Special Packets</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSVS_STEP_SPECIAL_PACKETS_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>VSVS Step Special Packets</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSVS_STEP_SPECIAL_PACKETS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.micobs.svm.svs.impl.VSVSStepEnableDisableImpl <em>VSVS Step Enable Disable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uah.aut.srg.micobs.svm.svs.impl.VSVSStepEnableDisableImpl
	 * @see es.uah.aut.srg.micobs.svm.svs.impl.svsPackageImpl#getVSVSStepEnableDisable()
	 * @generated
	 */
	int VSVS_STEP_ENABLE_DISABLE = 27;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSVS_STEP_ENABLE_DISABLE__ID = 0;

	/**
	 * The number of structural features of the '<em>VSVS Step Enable Disable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSVS_STEP_ENABLE_DISABLE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>VSVS Step Enable Disable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSVS_STEP_ENABLE_DISABLE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.micobs.svm.svs.impl.VSVSStepConcurrentStepsImpl <em>VSVS Step Concurrent Steps</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uah.aut.srg.micobs.svm.svs.impl.VSVSStepConcurrentStepsImpl
	 * @see es.uah.aut.srg.micobs.svm.svs.impl.svsPackageImpl#getVSVSStepConcurrentSteps()
	 * @generated
	 */
	int VSVS_STEP_CONCURRENT_STEPS = 28;

	/**
	 * The feature id for the '<em><b>Next Step</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSVS_STEP_CONCURRENT_STEPS__NEXT_STEP = 0;

	/**
	 * The feature id for the '<em><b>Concurrent step</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSVS_STEP_CONCURRENT_STEPS__CONCURRENT_STEP = 1;

	/**
	 * The number of structural features of the '<em>VSVS Step Concurrent Steps</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSVS_STEP_CONCURRENT_STEPS_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>VSVS Step Concurrent Steps</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSVS_STEP_CONCURRENT_STEPS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.micobs.svm.svs.impl.VSVSStepNextStepImpl <em>VSVS Step Next Step</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uah.aut.srg.micobs.svm.svs.impl.VSVSStepNextStepImpl
	 * @see es.uah.aut.srg.micobs.svm.svs.impl.svsPackageImpl#getVSVSStepNextStep()
	 * @generated
	 */
	int VSVS_STEP_NEXT_STEP = 29;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSVS_STEP_NEXT_STEP__ID = 0;

	/**
	 * The feature id for the '<em><b>Is Concurrent</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSVS_STEP_NEXT_STEP__IS_CONCURRENT = 1;

	/**
	 * The number of structural features of the '<em>VSVS Step Next Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSVS_STEP_NEXT_STEP_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>VSVS Step Next Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSVS_STEP_NEXT_STEP_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.micobs.svm.svs.impl.VSVSStepConcurrentStepImpl <em>VSVS Step Concurrent Step</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uah.aut.srg.micobs.svm.svs.impl.VSVSStepConcurrentStepImpl
	 * @see es.uah.aut.srg.micobs.svm.svs.impl.svsPackageImpl#getVSVSStepConcurrentStep()
	 * @generated
	 */
	int VSVS_STEP_CONCURRENT_STEP = 30;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSVS_STEP_CONCURRENT_STEP__ID = 0;

	/**
	 * The number of structural features of the '<em>VSVS Step Concurrent Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSVS_STEP_CONCURRENT_STEP_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>VSVS Step Concurrent Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSVS_STEP_CONCURRENT_STEP_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.micobs.svm.svs.impl.VSVSStepInputImpl <em>VSVS Step Input</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uah.aut.srg.micobs.svm.svs.impl.VSVSStepInputImpl
	 * @see es.uah.aut.srg.micobs.svm.svs.impl.svsPackageImpl#getVSVSStepInput()
	 * @generated
	 */
	int VSVS_STEP_INPUT = 31;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSVS_STEP_INPUT__NAME = 0;

	/**
	 * The feature id for the '<em><b>If Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSVS_STEP_INPUT__IF_REF = 1;

	/**
	 * The feature id for the '<em><b>Delay value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSVS_STEP_INPUT__DELAY_VALUE = 2;

	/**
	 * The feature id for the '<em><b>Delay unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSVS_STEP_INPUT__DELAY_UNIT = 3;

	/**
	 * The number of structural features of the '<em>VSVS Step Input</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSVS_STEP_INPUT_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>VSVS Step Input</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSVS_STEP_INPUT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.micobs.svm.svs.impl.VSVSStepInputLevel3Impl <em>VSVS Step Input Level3</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uah.aut.srg.micobs.svm.svs.impl.VSVSStepInputLevel3Impl
	 * @see es.uah.aut.srg.micobs.svm.svs.impl.svsPackageImpl#getVSVSStepInputLevel3()
	 * @generated
	 */
	int VSVS_STEP_INPUT_LEVEL3 = 32;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSVS_STEP_INPUT_LEVEL3__NAME = VSVS_STEP_INPUT__NAME;

	/**
	 * The feature id for the '<em><b>If Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSVS_STEP_INPUT_LEVEL3__IF_REF = VSVS_STEP_INPUT__IF_REF;

	/**
	 * The feature id for the '<em><b>Delay value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSVS_STEP_INPUT_LEVEL3__DELAY_VALUE = VSVS_STEP_INPUT__DELAY_VALUE;

	/**
	 * The feature id for the '<em><b>Delay unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSVS_STEP_INPUT_LEVEL3__DELAY_UNIT = VSVS_STEP_INPUT__DELAY_UNIT;

	/**
	 * The feature id for the '<em><b>Level3</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSVS_STEP_INPUT_LEVEL3__LEVEL3 = VSVS_STEP_INPUT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>App to level3</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSVS_STEP_INPUT_LEVEL3__APP_TO_LEVEL3 = VSVS_STEP_INPUT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Level2</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSVS_STEP_INPUT_LEVEL3__LEVEL2 = VSVS_STEP_INPUT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Level3 to level2</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSVS_STEP_INPUT_LEVEL3__LEVEL3_TO_LEVEL2 = VSVS_STEP_INPUT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Level1</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSVS_STEP_INPUT_LEVEL3__LEVEL1 = VSVS_STEP_INPUT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Level2 to level1</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSVS_STEP_INPUT_LEVEL3__LEVEL2_TO_LEVEL1 = VSVS_STEP_INPUT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Level0</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSVS_STEP_INPUT_LEVEL3__LEVEL0 = VSVS_STEP_INPUT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Level1 to level0</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSVS_STEP_INPUT_LEVEL3__LEVEL1_TO_LEVEL0 = VSVS_STEP_INPUT_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>VSVS Step Input Level3</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSVS_STEP_INPUT_LEVEL3_FEATURE_COUNT = VSVS_STEP_INPUT_FEATURE_COUNT + 8;

	/**
	 * The number of operations of the '<em>VSVS Step Input Level3</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSVS_STEP_INPUT_LEVEL3_OPERATION_COUNT = VSVS_STEP_INPUT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.micobs.svm.svs.impl.VSVSStepInputLevel2Impl <em>VSVS Step Input Level2</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uah.aut.srg.micobs.svm.svs.impl.VSVSStepInputLevel2Impl
	 * @see es.uah.aut.srg.micobs.svm.svs.impl.svsPackageImpl#getVSVSStepInputLevel2()
	 * @generated
	 */
	int VSVS_STEP_INPUT_LEVEL2 = 33;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSVS_STEP_INPUT_LEVEL2__NAME = VSVS_STEP_INPUT__NAME;

	/**
	 * The feature id for the '<em><b>If Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSVS_STEP_INPUT_LEVEL2__IF_REF = VSVS_STEP_INPUT__IF_REF;

	/**
	 * The feature id for the '<em><b>Delay value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSVS_STEP_INPUT_LEVEL2__DELAY_VALUE = VSVS_STEP_INPUT__DELAY_VALUE;

	/**
	 * The feature id for the '<em><b>Delay unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSVS_STEP_INPUT_LEVEL2__DELAY_UNIT = VSVS_STEP_INPUT__DELAY_UNIT;

	/**
	 * The feature id for the '<em><b>Level2</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSVS_STEP_INPUT_LEVEL2__LEVEL2 = VSVS_STEP_INPUT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>App to level2</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSVS_STEP_INPUT_LEVEL2__APP_TO_LEVEL2 = VSVS_STEP_INPUT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Level1</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSVS_STEP_INPUT_LEVEL2__LEVEL1 = VSVS_STEP_INPUT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Level2 to level1</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSVS_STEP_INPUT_LEVEL2__LEVEL2_TO_LEVEL1 = VSVS_STEP_INPUT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Level0</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSVS_STEP_INPUT_LEVEL2__LEVEL0 = VSVS_STEP_INPUT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Level1 to level0</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSVS_STEP_INPUT_LEVEL2__LEVEL1_TO_LEVEL0 = VSVS_STEP_INPUT_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>VSVS Step Input Level2</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSVS_STEP_INPUT_LEVEL2_FEATURE_COUNT = VSVS_STEP_INPUT_FEATURE_COUNT + 6;

	/**
	 * The number of operations of the '<em>VSVS Step Input Level2</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSVS_STEP_INPUT_LEVEL2_OPERATION_COUNT = VSVS_STEP_INPUT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.micobs.svm.svs.impl.VSVSStepInputLevel1Impl <em>VSVS Step Input Level1</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uah.aut.srg.micobs.svm.svs.impl.VSVSStepInputLevel1Impl
	 * @see es.uah.aut.srg.micobs.svm.svs.impl.svsPackageImpl#getVSVSStepInputLevel1()
	 * @generated
	 */
	int VSVS_STEP_INPUT_LEVEL1 = 34;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSVS_STEP_INPUT_LEVEL1__NAME = VSVS_STEP_INPUT__NAME;

	/**
	 * The feature id for the '<em><b>If Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSVS_STEP_INPUT_LEVEL1__IF_REF = VSVS_STEP_INPUT__IF_REF;

	/**
	 * The feature id for the '<em><b>Delay value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSVS_STEP_INPUT_LEVEL1__DELAY_VALUE = VSVS_STEP_INPUT__DELAY_VALUE;

	/**
	 * The feature id for the '<em><b>Delay unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSVS_STEP_INPUT_LEVEL1__DELAY_UNIT = VSVS_STEP_INPUT__DELAY_UNIT;

	/**
	 * The feature id for the '<em><b>Level1</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSVS_STEP_INPUT_LEVEL1__LEVEL1 = VSVS_STEP_INPUT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>App to level1</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSVS_STEP_INPUT_LEVEL1__APP_TO_LEVEL1 = VSVS_STEP_INPUT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Level0</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSVS_STEP_INPUT_LEVEL1__LEVEL0 = VSVS_STEP_INPUT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Level1 to level0</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSVS_STEP_INPUT_LEVEL1__LEVEL1_TO_LEVEL0 = VSVS_STEP_INPUT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>VSVS Step Input Level1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSVS_STEP_INPUT_LEVEL1_FEATURE_COUNT = VSVS_STEP_INPUT_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>VSVS Step Input Level1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSVS_STEP_INPUT_LEVEL1_OPERATION_COUNT = VSVS_STEP_INPUT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.micobs.svm.svs.impl.VSVSStepInputLevel0Impl <em>VSVS Step Input Level0</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uah.aut.srg.micobs.svm.svs.impl.VSVSStepInputLevel0Impl
	 * @see es.uah.aut.srg.micobs.svm.svs.impl.svsPackageImpl#getVSVSStepInputLevel0()
	 * @generated
	 */
	int VSVS_STEP_INPUT_LEVEL0 = 35;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSVS_STEP_INPUT_LEVEL0__NAME = VSVS_STEP_INPUT__NAME;

	/**
	 * The feature id for the '<em><b>If Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSVS_STEP_INPUT_LEVEL0__IF_REF = VSVS_STEP_INPUT__IF_REF;

	/**
	 * The feature id for the '<em><b>Delay value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSVS_STEP_INPUT_LEVEL0__DELAY_VALUE = VSVS_STEP_INPUT__DELAY_VALUE;

	/**
	 * The feature id for the '<em><b>Delay unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSVS_STEP_INPUT_LEVEL0__DELAY_UNIT = VSVS_STEP_INPUT__DELAY_UNIT;

	/**
	 * The feature id for the '<em><b>Level0</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSVS_STEP_INPUT_LEVEL0__LEVEL0 = VSVS_STEP_INPUT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>App to level0</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSVS_STEP_INPUT_LEVEL0__APP_TO_LEVEL0 = VSVS_STEP_INPUT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>VSVS Step Input Level0</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSVS_STEP_INPUT_LEVEL0_FEATURE_COUNT = VSVS_STEP_INPUT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>VSVS Step Input Level0</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSVS_STEP_INPUT_LEVEL0_OPERATION_COUNT = VSVS_STEP_INPUT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.micobs.svm.svs.impl.VSVSStepOutputImpl <em>VSVS Step Output</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uah.aut.srg.micobs.svm.svs.impl.VSVSStepOutputImpl
	 * @see es.uah.aut.srg.micobs.svm.svs.impl.svsPackageImpl#getVSVSStepOutput()
	 * @generated
	 */
	int VSVS_STEP_OUTPUT = 36;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSVS_STEP_OUTPUT__NAME = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSVS_STEP_OUTPUT__ID = 1;

	/**
	 * The feature id for the '<em><b>If Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSVS_STEP_OUTPUT__IF_REF = 2;

	/**
	 * The feature id for the '<em><b>Optional</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSVS_STEP_OUTPUT__OPTIONAL = 3;

	/**
	 * The number of structural features of the '<em>VSVS Step Output</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSVS_STEP_OUTPUT_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>VSVS Step Output</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSVS_STEP_OUTPUT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.micobs.svm.svs.impl.VSVSStepOutputLevel3Impl <em>VSVS Step Output Level3</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uah.aut.srg.micobs.svm.svs.impl.VSVSStepOutputLevel3Impl
	 * @see es.uah.aut.srg.micobs.svm.svs.impl.svsPackageImpl#getVSVSStepOutputLevel3()
	 * @generated
	 */
	int VSVS_STEP_OUTPUT_LEVEL3 = 37;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSVS_STEP_OUTPUT_LEVEL3__NAME = VSVS_STEP_OUTPUT__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSVS_STEP_OUTPUT_LEVEL3__ID = VSVS_STEP_OUTPUT__ID;

	/**
	 * The feature id for the '<em><b>If Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSVS_STEP_OUTPUT_LEVEL3__IF_REF = VSVS_STEP_OUTPUT__IF_REF;

	/**
	 * The feature id for the '<em><b>Optional</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSVS_STEP_OUTPUT_LEVEL3__OPTIONAL = VSVS_STEP_OUTPUT__OPTIONAL;

	/**
	 * The feature id for the '<em><b>Level3</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSVS_STEP_OUTPUT_LEVEL3__LEVEL3 = VSVS_STEP_OUTPUT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Level3 filter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSVS_STEP_OUTPUT_LEVEL3__LEVEL3_FILTER = VSVS_STEP_OUTPUT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Level2</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSVS_STEP_OUTPUT_LEVEL3__LEVEL2 = VSVS_STEP_OUTPUT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Level3 from level2</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSVS_STEP_OUTPUT_LEVEL3__LEVEL3_FROM_LEVEL2 = VSVS_STEP_OUTPUT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Level2 filter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSVS_STEP_OUTPUT_LEVEL3__LEVEL2_FILTER = VSVS_STEP_OUTPUT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Level1</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSVS_STEP_OUTPUT_LEVEL3__LEVEL1 = VSVS_STEP_OUTPUT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Level2 from level1</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSVS_STEP_OUTPUT_LEVEL3__LEVEL2_FROM_LEVEL1 = VSVS_STEP_OUTPUT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Level1 filter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSVS_STEP_OUTPUT_LEVEL3__LEVEL1_FILTER = VSVS_STEP_OUTPUT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Level0</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSVS_STEP_OUTPUT_LEVEL3__LEVEL0 = VSVS_STEP_OUTPUT_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Level1 from level0</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSVS_STEP_OUTPUT_LEVEL3__LEVEL1_FROM_LEVEL0 = VSVS_STEP_OUTPUT_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Level0 filter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSVS_STEP_OUTPUT_LEVEL3__LEVEL0_FILTER = VSVS_STEP_OUTPUT_FEATURE_COUNT + 10;

	/**
	 * The number of structural features of the '<em>VSVS Step Output Level3</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSVS_STEP_OUTPUT_LEVEL3_FEATURE_COUNT = VSVS_STEP_OUTPUT_FEATURE_COUNT + 11;

	/**
	 * The number of operations of the '<em>VSVS Step Output Level3</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSVS_STEP_OUTPUT_LEVEL3_OPERATION_COUNT = VSVS_STEP_OUTPUT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.micobs.svm.svs.impl.VSVSStepOutputLevel2Impl <em>VSVS Step Output Level2</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uah.aut.srg.micobs.svm.svs.impl.VSVSStepOutputLevel2Impl
	 * @see es.uah.aut.srg.micobs.svm.svs.impl.svsPackageImpl#getVSVSStepOutputLevel2()
	 * @generated
	 */
	int VSVS_STEP_OUTPUT_LEVEL2 = 38;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSVS_STEP_OUTPUT_LEVEL2__NAME = VSVS_STEP_OUTPUT__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSVS_STEP_OUTPUT_LEVEL2__ID = VSVS_STEP_OUTPUT__ID;

	/**
	 * The feature id for the '<em><b>If Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSVS_STEP_OUTPUT_LEVEL2__IF_REF = VSVS_STEP_OUTPUT__IF_REF;

	/**
	 * The feature id for the '<em><b>Optional</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSVS_STEP_OUTPUT_LEVEL2__OPTIONAL = VSVS_STEP_OUTPUT__OPTIONAL;

	/**
	 * The feature id for the '<em><b>Level2</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSVS_STEP_OUTPUT_LEVEL2__LEVEL2 = VSVS_STEP_OUTPUT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Level2 filter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSVS_STEP_OUTPUT_LEVEL2__LEVEL2_FILTER = VSVS_STEP_OUTPUT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Level1</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSVS_STEP_OUTPUT_LEVEL2__LEVEL1 = VSVS_STEP_OUTPUT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Level2 from level1</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSVS_STEP_OUTPUT_LEVEL2__LEVEL2_FROM_LEVEL1 = VSVS_STEP_OUTPUT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Level1 filter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSVS_STEP_OUTPUT_LEVEL2__LEVEL1_FILTER = VSVS_STEP_OUTPUT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Level0</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSVS_STEP_OUTPUT_LEVEL2__LEVEL0 = VSVS_STEP_OUTPUT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Level1 from level0</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSVS_STEP_OUTPUT_LEVEL2__LEVEL1_FROM_LEVEL0 = VSVS_STEP_OUTPUT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Level0 filter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSVS_STEP_OUTPUT_LEVEL2__LEVEL0_FILTER = VSVS_STEP_OUTPUT_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>VSVS Step Output Level2</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSVS_STEP_OUTPUT_LEVEL2_FEATURE_COUNT = VSVS_STEP_OUTPUT_FEATURE_COUNT + 8;

	/**
	 * The number of operations of the '<em>VSVS Step Output Level2</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSVS_STEP_OUTPUT_LEVEL2_OPERATION_COUNT = VSVS_STEP_OUTPUT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.micobs.svm.svs.impl.VSVSStepOutputLevel1Impl <em>VSVS Step Output Level1</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uah.aut.srg.micobs.svm.svs.impl.VSVSStepOutputLevel1Impl
	 * @see es.uah.aut.srg.micobs.svm.svs.impl.svsPackageImpl#getVSVSStepOutputLevel1()
	 * @generated
	 */
	int VSVS_STEP_OUTPUT_LEVEL1 = 39;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSVS_STEP_OUTPUT_LEVEL1__NAME = VSVS_STEP_OUTPUT__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSVS_STEP_OUTPUT_LEVEL1__ID = VSVS_STEP_OUTPUT__ID;

	/**
	 * The feature id for the '<em><b>If Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSVS_STEP_OUTPUT_LEVEL1__IF_REF = VSVS_STEP_OUTPUT__IF_REF;

	/**
	 * The feature id for the '<em><b>Optional</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSVS_STEP_OUTPUT_LEVEL1__OPTIONAL = VSVS_STEP_OUTPUT__OPTIONAL;

	/**
	 * The feature id for the '<em><b>Level1</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSVS_STEP_OUTPUT_LEVEL1__LEVEL1 = VSVS_STEP_OUTPUT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Level1 filter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSVS_STEP_OUTPUT_LEVEL1__LEVEL1_FILTER = VSVS_STEP_OUTPUT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Level0</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSVS_STEP_OUTPUT_LEVEL1__LEVEL0 = VSVS_STEP_OUTPUT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Level1 from level0</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSVS_STEP_OUTPUT_LEVEL1__LEVEL1_FROM_LEVEL0 = VSVS_STEP_OUTPUT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Level0 filter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSVS_STEP_OUTPUT_LEVEL1__LEVEL0_FILTER = VSVS_STEP_OUTPUT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>VSVS Step Output Level1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSVS_STEP_OUTPUT_LEVEL1_FEATURE_COUNT = VSVS_STEP_OUTPUT_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>VSVS Step Output Level1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSVS_STEP_OUTPUT_LEVEL1_OPERATION_COUNT = VSVS_STEP_OUTPUT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.micobs.svm.svs.impl.VSVSStepOutputLevel0Impl <em>VSVS Step Output Level0</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uah.aut.srg.micobs.svm.svs.impl.VSVSStepOutputLevel0Impl
	 * @see es.uah.aut.srg.micobs.svm.svs.impl.svsPackageImpl#getVSVSStepOutputLevel0()
	 * @generated
	 */
	int VSVS_STEP_OUTPUT_LEVEL0 = 40;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSVS_STEP_OUTPUT_LEVEL0__NAME = VSVS_STEP_OUTPUT__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSVS_STEP_OUTPUT_LEVEL0__ID = VSVS_STEP_OUTPUT__ID;

	/**
	 * The feature id for the '<em><b>If Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSVS_STEP_OUTPUT_LEVEL0__IF_REF = VSVS_STEP_OUTPUT__IF_REF;

	/**
	 * The feature id for the '<em><b>Optional</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSVS_STEP_OUTPUT_LEVEL0__OPTIONAL = VSVS_STEP_OUTPUT__OPTIONAL;

	/**
	 * The feature id for the '<em><b>Level0</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSVS_STEP_OUTPUT_LEVEL0__LEVEL0 = VSVS_STEP_OUTPUT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Level0 filter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSVS_STEP_OUTPUT_LEVEL0__LEVEL0_FILTER = VSVS_STEP_OUTPUT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>VSVS Step Output Level0</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSVS_STEP_OUTPUT_LEVEL0_FEATURE_COUNT = VSVS_STEP_OUTPUT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>VSVS Step Output Level0</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSVS_STEP_OUTPUT_LEVEL0_OPERATION_COUNT = VSVS_STEP_OUTPUT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.micobs.svm.svs.impl.VSVSStepFilterImpl <em>VSVS Step Filter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uah.aut.srg.micobs.svm.svs.impl.VSVSStepFilterImpl
	 * @see es.uah.aut.srg.micobs.svm.svs.impl.svsPackageImpl#getVSVSStepFilter()
	 * @generated
	 */
	int VSVS_STEP_FILTER = 41;

	/**
	 * The feature id for the '<em><b>Apply def filter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSVS_STEP_FILTER__APPLY_DEF_FILTER = 0;

	/**
	 * The feature id for the '<em><b>Extra filter</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSVS_STEP_FILTER__EXTRA_FILTER = 1;

	/**
	 * The number of structural features of the '<em>VSVS Step Filter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSVS_STEP_FILTER_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>VSVS Step Filter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSVS_STEP_FILTER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.micobs.svm.svs.impl.VSVSAnalysisInspectionReviewImpl <em>VSVS Analysis Inspection Review</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uah.aut.srg.micobs.svm.svs.impl.VSVSAnalysisInspectionReviewImpl
	 * @see es.uah.aut.srg.micobs.svm.svs.impl.svsPackageImpl#getVSVSAnalysisInspectionReview()
	 * @generated
	 */
	int VSVS_ANALYSIS_INSPECTION_REVIEW = 42;

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
	int VSVS_TEST_PLATFORM_REQUIREMENTS = 43;

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
	int VSVS_ADDITIONAL_INFORMATION = 44;

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
	 * The meta object id for the '{@link es.uah.aut.srg.micobs.svm.svs.VSVSStepMode <em>VSVS Step Mode</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uah.aut.srg.micobs.svm.svs.VSVSStepMode
	 * @see es.uah.aut.srg.micobs.svm.svs.impl.svsPackageImpl#getVSVSStepMode()
	 * @generated
	 */
	int VSVS_STEP_MODE = 45;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.micobs.svm.svs.VSVSStepUnit <em>VSVS Step Unit</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uah.aut.srg.micobs.svm.svs.VSVSStepUnit
	 * @see es.uah.aut.srg.micobs.svm.svs.impl.svsPackageImpl#getVSVSStepUnit()
	 * @generated
	 */
	int VSVS_STEP_UNIT = 46;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.micobs.svm.svs.VSVSStepCheckmode <em>VSVS Step Checkmode</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uah.aut.srg.micobs.svm.svs.VSVSStepCheckmode
	 * @see es.uah.aut.srg.micobs.svm.svs.impl.svsPackageImpl#getVSVSStepCheckmode()
	 * @generated
	 */
	int VSVS_STEP_CHECKMODE = 47;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.micobs.svm.svs.VSVSStepYesNo <em>VSVS Step Yes No</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uah.aut.srg.micobs.svm.svs.VSVSStepYesNo
	 * @see es.uah.aut.srg.micobs.svm.svs.impl.svsPackageImpl#getVSVSStepYesNo()
	 * @generated
	 */
	int VSVS_STEP_YES_NO = 48;


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
	 * Returns the meta object for the containment reference '{@link es.uah.aut.srg.micobs.svm.svs.VSVSTestingSpecificationDesign#getScenarios <em>Scenarios</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Scenarios</em>'.
	 * @see es.uah.aut.srg.micobs.svm.svs.VSVSTestingSpecificationDesign#getScenarios()
	 * @see #getVSVSTestingSpecificationDesign()
	 * @generated
	 */
	EReference getVSVSTestingSpecificationDesign_Scenarios();

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
	 * Returns the meta object for class '{@link es.uah.aut.srg.micobs.svm.svs.VSVSScenariosSection <em>VSVS Scenarios Section</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>VSVS Scenarios Section</em>'.
	 * @see es.uah.aut.srg.micobs.svm.svs.VSVSScenariosSection
	 * @generated
	 */
	EClass getVSVSScenariosSection();

	/**
	 * Returns the meta object for the containment reference list '{@link es.uah.aut.srg.micobs.svm.svs.VSVSScenariosSection#getScenarios <em>Scenarios</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Scenarios</em>'.
	 * @see es.uah.aut.srg.micobs.svm.svs.VSVSScenariosSection#getScenarios()
	 * @see #getVSVSScenariosSection()
	 * @generated
	 */
	EReference getVSVSScenariosSection_Scenarios();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.micobs.svm.svs.VSVSScenarioSection <em>VSVS Scenario Section</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>VSVS Scenario Section</em>'.
	 * @see es.uah.aut.srg.micobs.svm.svs.VSVSScenarioSection
	 * @generated
	 */
	EClass getVSVSScenarioSection();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.micobs.svm.svs.VSVSScenarioSection#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see es.uah.aut.srg.micobs.svm.svs.VSVSScenarioSection#getName()
	 * @see #getVSVSScenarioSection()
	 * @generated
	 */
	EAttribute getVSVSScenarioSection_Name();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.micobs.svm.svs.VSVSScenarioSection#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see es.uah.aut.srg.micobs.svm.svs.VSVSScenarioSection#getId()
	 * @see #getVSVSScenarioSection()
	 * @generated
	 */
	EAttribute getVSVSScenarioSection_Id();

	/**
	 * Returns the meta object for the containment reference '{@link es.uah.aut.srg.micobs.svm.svs.VSVSScenarioSection#getBody <em>Body</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Body</em>'.
	 * @see es.uah.aut.srg.micobs.svm.svs.VSVSScenarioSection#getBody()
	 * @see #getVSVSScenarioSection()
	 * @generated
	 */
	EReference getVSVSScenarioSection_Body();

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
	 * Returns the meta object for class '{@link es.uah.aut.srg.micobs.svm.svs.VSVSTestInfo <em>VSVS Test Info</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>VSVS Test Info</em>'.
	 * @see es.uah.aut.srg.micobs.svm.svs.VSVSTestInfo
	 * @generated
	 */
	EClass getVSVSTestInfo();

	/**
	 * Returns the meta object for the containment reference '{@link es.uah.aut.srg.micobs.svm.svs.VSVSTestInfo#getBody <em>Body</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Body</em>'.
	 * @see es.uah.aut.srg.micobs.svm.svs.VSVSTestInfo#getBody()
	 * @see #getVSVSTestInfo()
	 * @generated
	 */
	EReference getVSVSTestInfo_Body();

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
	 * Returns the meta object for the reference '{@link es.uah.aut.srg.micobs.svm.svs.VSVSTestProcedure#getScenario <em>Scenario</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Scenario</em>'.
	 * @see es.uah.aut.srg.micobs.svm.svs.VSVSTestProcedure#getScenario()
	 * @see #getVSVSTestProcedure()
	 * @generated
	 */
	EReference getVSVSTestProcedure_Scenario();

	/**
	 * Returns the meta object for the containment reference '{@link es.uah.aut.srg.micobs.svm.svs.VSVSTestProcedure#getProcedureSteps <em>Procedure Steps</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Procedure Steps</em>'.
	 * @see es.uah.aut.srg.micobs.svm.svs.VSVSTestProcedure#getProcedureSteps()
	 * @see #getVSVSTestProcedure()
	 * @generated
	 */
	EReference getVSVSTestProcedure_ProcedureSteps();

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
	 * Returns the meta object for class '{@link es.uah.aut.srg.micobs.svm.svs.VSVSProcedureSteps <em>VSVS Procedure Steps</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>VSVS Procedure Steps</em>'.
	 * @see es.uah.aut.srg.micobs.svm.svs.VSVSProcedureSteps
	 * @generated
	 */
	EClass getVSVSProcedureSteps();

	/**
	 * Returns the meta object for the containment reference list '{@link es.uah.aut.srg.micobs.svm.svs.VSVSProcedureSteps#getStep <em>Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Step</em>'.
	 * @see es.uah.aut.srg.micobs.svm.svs.VSVSProcedureSteps#getStep()
	 * @see #getVSVSProcedureSteps()
	 * @generated
	 */
	EReference getVSVSProcedureSteps_Step();

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
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.micobs.svm.svs.VSVSProcedureStep#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see es.uah.aut.srg.micobs.svm.svs.VSVSProcedureStep#getName()
	 * @see #getVSVSProcedureStep()
	 * @generated
	 */
	EAttribute getVSVSProcedureStep_Name();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.micobs.svm.svs.VSVSProcedureStep#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see es.uah.aut.srg.micobs.svm.svs.VSVSProcedureStep#getDescription()
	 * @see #getVSVSProcedureStep()
	 * @generated
	 */
	EAttribute getVSVSProcedureStep_Description();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.micobs.svm.svs.VSVSProcedureStep#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see es.uah.aut.srg.micobs.svm.svs.VSVSProcedureStep#getId()
	 * @see #getVSVSProcedureStep()
	 * @generated
	 */
	EAttribute getVSVSProcedureStep_Id();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.micobs.svm.svs.VSVSProcedureStep#getMode <em>Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mode</em>'.
	 * @see es.uah.aut.srg.micobs.svm.svs.VSVSProcedureStep#getMode()
	 * @see #getVSVSProcedureStep()
	 * @generated
	 */
	EAttribute getVSVSProcedureStep_Mode();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.micobs.svm.svs.VSVSProcedureStep#getReplays <em>Replays</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Replays</em>'.
	 * @see es.uah.aut.srg.micobs.svm.svs.VSVSProcedureStep#getReplays()
	 * @see #getVSVSProcedureStep()
	 * @generated
	 */
	EAttribute getVSVSProcedureStep_Replays();

	/**
	 * Returns the meta object for the reference '{@link es.uah.aut.srg.micobs.svm.svs.VSVSProcedureStep#getPrev_step_idref <em>Prev step idref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Prev step idref</em>'.
	 * @see es.uah.aut.srg.micobs.svm.svs.VSVSProcedureStep#getPrev_step_idref()
	 * @see #getVSVSProcedureStep()
	 * @generated
	 */
	EReference getVSVSProcedureStep_Prev_step_idref();

	/**
	 * Returns the meta object for the reference '{@link es.uah.aut.srg.micobs.svm.svs.VSVSProcedureStep#getOutput_idref_from_prev_step <em>Output idref from prev step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Output idref from prev step</em>'.
	 * @see es.uah.aut.srg.micobs.svm.svs.VSVSProcedureStep#getOutput_idref_from_prev_step()
	 * @see #getVSVSProcedureStep()
	 * @generated
	 */
	EReference getVSVSProcedureStep_Output_idref_from_prev_step();

	/**
	 * Returns the meta object for the containment reference '{@link es.uah.aut.srg.micobs.svm.svs.VSVSProcedureStep#getInputs <em>Inputs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Inputs</em>'.
	 * @see es.uah.aut.srg.micobs.svm.svs.VSVSProcedureStep#getInputs()
	 * @see #getVSVSProcedureStep()
	 * @generated
	 */
	EReference getVSVSProcedureStep_Inputs();

	/**
	 * Returns the meta object for the containment reference '{@link es.uah.aut.srg.micobs.svm.svs.VSVSProcedureStep#getOutputs <em>Outputs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Outputs</em>'.
	 * @see es.uah.aut.srg.micobs.svm.svs.VSVSProcedureStep#getOutputs()
	 * @see #getVSVSProcedureStep()
	 * @generated
	 */
	EReference getVSVSProcedureStep_Outputs();

	/**
	 * Returns the meta object for the containment reference '{@link es.uah.aut.srg.micobs.svm.svs.VSVSProcedureStep#getSpecialPackets <em>Special Packets</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Special Packets</em>'.
	 * @see es.uah.aut.srg.micobs.svm.svs.VSVSProcedureStep#getSpecialPackets()
	 * @see #getVSVSProcedureStep()
	 * @generated
	 */
	EReference getVSVSProcedureStep_SpecialPackets();

	/**
	 * Returns the meta object for the containment reference '{@link es.uah.aut.srg.micobs.svm.svs.VSVSProcedureStep#getConcurrent_steps <em>Concurrent steps</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Concurrent steps</em>'.
	 * @see es.uah.aut.srg.micobs.svm.svs.VSVSProcedureStep#getConcurrent_steps()
	 * @see #getVSVSProcedureStep()
	 * @generated
	 */
	EReference getVSVSProcedureStep_Concurrent_steps();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.micobs.svm.svs.VSVSStepInputs <em>VSVS Step Inputs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>VSVS Step Inputs</em>'.
	 * @see es.uah.aut.srg.micobs.svm.svs.VSVSStepInputs
	 * @generated
	 */
	EClass getVSVSStepInputs();

	/**
	 * Returns the meta object for the containment reference list '{@link es.uah.aut.srg.micobs.svm.svs.VSVSStepInputs#getInput <em>Input</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Input</em>'.
	 * @see es.uah.aut.srg.micobs.svm.svs.VSVSStepInputs#getInput()
	 * @see #getVSVSStepInputs()
	 * @generated
	 */
	EReference getVSVSStepInputs_Input();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.micobs.svm.svs.VSVSStepOutputs <em>VSVS Step Outputs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>VSVS Step Outputs</em>'.
	 * @see es.uah.aut.srg.micobs.svm.svs.VSVSStepOutputs
	 * @generated
	 */
	EClass getVSVSStepOutputs();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.micobs.svm.svs.VSVSStepOutputs#getCheckmode <em>Checkmode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Checkmode</em>'.
	 * @see es.uah.aut.srg.micobs.svm.svs.VSVSStepOutputs#getCheckmode()
	 * @see #getVSVSStepOutputs()
	 * @generated
	 */
	EAttribute getVSVSStepOutputs_Checkmode();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.micobs.svm.svs.VSVSStepOutputs#getValid_time_interval_value <em>Valid time interval value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Valid time interval value</em>'.
	 * @see es.uah.aut.srg.micobs.svm.svs.VSVSStepOutputs#getValid_time_interval_value()
	 * @see #getVSVSStepOutputs()
	 * @generated
	 */
	EAttribute getVSVSStepOutputs_Valid_time_interval_value();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.micobs.svm.svs.VSVSStepOutputs#getValid_time_interval_unit <em>Valid time interval unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Valid time interval unit</em>'.
	 * @see es.uah.aut.srg.micobs.svm.svs.VSVSStepOutputs#getValid_time_interval_unit()
	 * @see #getVSVSStepOutputs()
	 * @generated
	 */
	EAttribute getVSVSStepOutputs_Valid_time_interval_unit();

	/**
	 * Returns the meta object for the containment reference list '{@link es.uah.aut.srg.micobs.svm.svs.VSVSStepOutputs#getOutput <em>Output</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Output</em>'.
	 * @see es.uah.aut.srg.micobs.svm.svs.VSVSStepOutputs#getOutput()
	 * @see #getVSVSStepOutputs()
	 * @generated
	 */
	EReference getVSVSStepOutputs_Output();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.micobs.svm.svs.VSVSStepSpecialPackets <em>VSVS Step Special Packets</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>VSVS Step Special Packets</em>'.
	 * @see es.uah.aut.srg.micobs.svm.svs.VSVSStepSpecialPackets
	 * @generated
	 */
	EClass getVSVSStepSpecialPackets();

	/**
	 * Returns the meta object for the containment reference list '{@link es.uah.aut.srg.micobs.svm.svs.VSVSStepSpecialPackets#getEnable <em>Enable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Enable</em>'.
	 * @see es.uah.aut.srg.micobs.svm.svs.VSVSStepSpecialPackets#getEnable()
	 * @see #getVSVSStepSpecialPackets()
	 * @generated
	 */
	EReference getVSVSStepSpecialPackets_Enable();

	/**
	 * Returns the meta object for the containment reference list '{@link es.uah.aut.srg.micobs.svm.svs.VSVSStepSpecialPackets#getDisable <em>Disable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Disable</em>'.
	 * @see es.uah.aut.srg.micobs.svm.svs.VSVSStepSpecialPackets#getDisable()
	 * @see #getVSVSStepSpecialPackets()
	 * @generated
	 */
	EReference getVSVSStepSpecialPackets_Disable();

	/**
	 * Returns the meta object for the containment reference list '{@link es.uah.aut.srg.micobs.svm.svs.VSVSStepSpecialPackets#getEnable_print <em>Enable print</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Enable print</em>'.
	 * @see es.uah.aut.srg.micobs.svm.svs.VSVSStepSpecialPackets#getEnable_print()
	 * @see #getVSVSStepSpecialPackets()
	 * @generated
	 */
	EReference getVSVSStepSpecialPackets_Enable_print();

	/**
	 * Returns the meta object for the containment reference list '{@link es.uah.aut.srg.micobs.svm.svs.VSVSStepSpecialPackets#getDisable_print <em>Disable print</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Disable print</em>'.
	 * @see es.uah.aut.srg.micobs.svm.svs.VSVSStepSpecialPackets#getDisable_print()
	 * @see #getVSVSStepSpecialPackets()
	 * @generated
	 */
	EReference getVSVSStepSpecialPackets_Disable_print();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.micobs.svm.svs.VSVSStepEnableDisable <em>VSVS Step Enable Disable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>VSVS Step Enable Disable</em>'.
	 * @see es.uah.aut.srg.micobs.svm.svs.VSVSStepEnableDisable
	 * @generated
	 */
	EClass getVSVSStepEnableDisable();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.micobs.svm.svs.VSVSStepEnableDisable#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see es.uah.aut.srg.micobs.svm.svs.VSVSStepEnableDisable#getId()
	 * @see #getVSVSStepEnableDisable()
	 * @generated
	 */
	EAttribute getVSVSStepEnableDisable_Id();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.micobs.svm.svs.VSVSStepConcurrentSteps <em>VSVS Step Concurrent Steps</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>VSVS Step Concurrent Steps</em>'.
	 * @see es.uah.aut.srg.micobs.svm.svs.VSVSStepConcurrentSteps
	 * @generated
	 */
	EClass getVSVSStepConcurrentSteps();

	/**
	 * Returns the meta object for the containment reference '{@link es.uah.aut.srg.micobs.svm.svs.VSVSStepConcurrentSteps#getNextStep <em>Next Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Next Step</em>'.
	 * @see es.uah.aut.srg.micobs.svm.svs.VSVSStepConcurrentSteps#getNextStep()
	 * @see #getVSVSStepConcurrentSteps()
	 * @generated
	 */
	EReference getVSVSStepConcurrentSteps_NextStep();

	/**
	 * Returns the meta object for the containment reference list '{@link es.uah.aut.srg.micobs.svm.svs.VSVSStepConcurrentSteps#getConcurrent_step <em>Concurrent step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Concurrent step</em>'.
	 * @see es.uah.aut.srg.micobs.svm.svs.VSVSStepConcurrentSteps#getConcurrent_step()
	 * @see #getVSVSStepConcurrentSteps()
	 * @generated
	 */
	EReference getVSVSStepConcurrentSteps_Concurrent_step();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.micobs.svm.svs.VSVSStepNextStep <em>VSVS Step Next Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>VSVS Step Next Step</em>'.
	 * @see es.uah.aut.srg.micobs.svm.svs.VSVSStepNextStep
	 * @generated
	 */
	EClass getVSVSStepNextStep();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.micobs.svm.svs.VSVSStepNextStep#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see es.uah.aut.srg.micobs.svm.svs.VSVSStepNextStep#getId()
	 * @see #getVSVSStepNextStep()
	 * @generated
	 */
	EAttribute getVSVSStepNextStep_Id();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.micobs.svm.svs.VSVSStepNextStep#getIsConcurrent <em>Is Concurrent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Concurrent</em>'.
	 * @see es.uah.aut.srg.micobs.svm.svs.VSVSStepNextStep#getIsConcurrent()
	 * @see #getVSVSStepNextStep()
	 * @generated
	 */
	EAttribute getVSVSStepNextStep_IsConcurrent();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.micobs.svm.svs.VSVSStepConcurrentStep <em>VSVS Step Concurrent Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>VSVS Step Concurrent Step</em>'.
	 * @see es.uah.aut.srg.micobs.svm.svs.VSVSStepConcurrentStep
	 * @generated
	 */
	EClass getVSVSStepConcurrentStep();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.micobs.svm.svs.VSVSStepConcurrentStep#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see es.uah.aut.srg.micobs.svm.svs.VSVSStepConcurrentStep#getId()
	 * @see #getVSVSStepConcurrentStep()
	 * @generated
	 */
	EAttribute getVSVSStepConcurrentStep_Id();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.micobs.svm.svs.VSVSStepInput <em>VSVS Step Input</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>VSVS Step Input</em>'.
	 * @see es.uah.aut.srg.micobs.svm.svs.VSVSStepInput
	 * @generated
	 */
	EClass getVSVSStepInput();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.micobs.svm.svs.VSVSStepInput#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see es.uah.aut.srg.micobs.svm.svs.VSVSStepInput#getName()
	 * @see #getVSVSStepInput()
	 * @generated
	 */
	EAttribute getVSVSStepInput_Name();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.micobs.svm.svs.VSVSStepInput#getIfRef <em>If Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>If Ref</em>'.
	 * @see es.uah.aut.srg.micobs.svm.svs.VSVSStepInput#getIfRef()
	 * @see #getVSVSStepInput()
	 * @generated
	 */
	EAttribute getVSVSStepInput_IfRef();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.micobs.svm.svs.VSVSStepInput#getDelay_value <em>Delay value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Delay value</em>'.
	 * @see es.uah.aut.srg.micobs.svm.svs.VSVSStepInput#getDelay_value()
	 * @see #getVSVSStepInput()
	 * @generated
	 */
	EAttribute getVSVSStepInput_Delay_value();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.micobs.svm.svs.VSVSStepInput#getDelay_unit <em>Delay unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Delay unit</em>'.
	 * @see es.uah.aut.srg.micobs.svm.svs.VSVSStepInput#getDelay_unit()
	 * @see #getVSVSStepInput()
	 * @generated
	 */
	EAttribute getVSVSStepInput_Delay_unit();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.micobs.svm.svs.VSVSStepInputLevel3 <em>VSVS Step Input Level3</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>VSVS Step Input Level3</em>'.
	 * @see es.uah.aut.srg.micobs.svm.svs.VSVSStepInputLevel3
	 * @generated
	 */
	EClass getVSVSStepInputLevel3();

	/**
	 * Returns the meta object for the reference '{@link es.uah.aut.srg.micobs.svm.svs.VSVSStepInputLevel3#getLevel3 <em>Level3</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Level3</em>'.
	 * @see es.uah.aut.srg.micobs.svm.svs.VSVSStepInputLevel3#getLevel3()
	 * @see #getVSVSStepInputLevel3()
	 * @generated
	 */
	EReference getVSVSStepInputLevel3_Level3();

	/**
	 * Returns the meta object for the reference '{@link es.uah.aut.srg.micobs.svm.svs.VSVSStepInputLevel3#getApp_to_level3 <em>App to level3</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>App to level3</em>'.
	 * @see es.uah.aut.srg.micobs.svm.svs.VSVSStepInputLevel3#getApp_to_level3()
	 * @see #getVSVSStepInputLevel3()
	 * @generated
	 */
	EReference getVSVSStepInputLevel3_App_to_level3();

	/**
	 * Returns the meta object for the reference '{@link es.uah.aut.srg.micobs.svm.svs.VSVSStepInputLevel3#getLevel2 <em>Level2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Level2</em>'.
	 * @see es.uah.aut.srg.micobs.svm.svs.VSVSStepInputLevel3#getLevel2()
	 * @see #getVSVSStepInputLevel3()
	 * @generated
	 */
	EReference getVSVSStepInputLevel3_Level2();

	/**
	 * Returns the meta object for the reference '{@link es.uah.aut.srg.micobs.svm.svs.VSVSStepInputLevel3#getLevel3_to_level2 <em>Level3 to level2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Level3 to level2</em>'.
	 * @see es.uah.aut.srg.micobs.svm.svs.VSVSStepInputLevel3#getLevel3_to_level2()
	 * @see #getVSVSStepInputLevel3()
	 * @generated
	 */
	EReference getVSVSStepInputLevel3_Level3_to_level2();

	/**
	 * Returns the meta object for the reference '{@link es.uah.aut.srg.micobs.svm.svs.VSVSStepInputLevel3#getLevel1 <em>Level1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Level1</em>'.
	 * @see es.uah.aut.srg.micobs.svm.svs.VSVSStepInputLevel3#getLevel1()
	 * @see #getVSVSStepInputLevel3()
	 * @generated
	 */
	EReference getVSVSStepInputLevel3_Level1();

	/**
	 * Returns the meta object for the reference '{@link es.uah.aut.srg.micobs.svm.svs.VSVSStepInputLevel3#getLevel2_to_level1 <em>Level2 to level1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Level2 to level1</em>'.
	 * @see es.uah.aut.srg.micobs.svm.svs.VSVSStepInputLevel3#getLevel2_to_level1()
	 * @see #getVSVSStepInputLevel3()
	 * @generated
	 */
	EReference getVSVSStepInputLevel3_Level2_to_level1();

	/**
	 * Returns the meta object for the reference '{@link es.uah.aut.srg.micobs.svm.svs.VSVSStepInputLevel3#getLevel0 <em>Level0</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Level0</em>'.
	 * @see es.uah.aut.srg.micobs.svm.svs.VSVSStepInputLevel3#getLevel0()
	 * @see #getVSVSStepInputLevel3()
	 * @generated
	 */
	EReference getVSVSStepInputLevel3_Level0();

	/**
	 * Returns the meta object for the reference '{@link es.uah.aut.srg.micobs.svm.svs.VSVSStepInputLevel3#getLevel1_to_level0 <em>Level1 to level0</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Level1 to level0</em>'.
	 * @see es.uah.aut.srg.micobs.svm.svs.VSVSStepInputLevel3#getLevel1_to_level0()
	 * @see #getVSVSStepInputLevel3()
	 * @generated
	 */
	EReference getVSVSStepInputLevel3_Level1_to_level0();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.micobs.svm.svs.VSVSStepInputLevel2 <em>VSVS Step Input Level2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>VSVS Step Input Level2</em>'.
	 * @see es.uah.aut.srg.micobs.svm.svs.VSVSStepInputLevel2
	 * @generated
	 */
	EClass getVSVSStepInputLevel2();

	/**
	 * Returns the meta object for the reference '{@link es.uah.aut.srg.micobs.svm.svs.VSVSStepInputLevel2#getLevel2 <em>Level2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Level2</em>'.
	 * @see es.uah.aut.srg.micobs.svm.svs.VSVSStepInputLevel2#getLevel2()
	 * @see #getVSVSStepInputLevel2()
	 * @generated
	 */
	EReference getVSVSStepInputLevel2_Level2();

	/**
	 * Returns the meta object for the reference '{@link es.uah.aut.srg.micobs.svm.svs.VSVSStepInputLevel2#getApp_to_level2 <em>App to level2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>App to level2</em>'.
	 * @see es.uah.aut.srg.micobs.svm.svs.VSVSStepInputLevel2#getApp_to_level2()
	 * @see #getVSVSStepInputLevel2()
	 * @generated
	 */
	EReference getVSVSStepInputLevel2_App_to_level2();

	/**
	 * Returns the meta object for the reference '{@link es.uah.aut.srg.micobs.svm.svs.VSVSStepInputLevel2#getLevel1 <em>Level1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Level1</em>'.
	 * @see es.uah.aut.srg.micobs.svm.svs.VSVSStepInputLevel2#getLevel1()
	 * @see #getVSVSStepInputLevel2()
	 * @generated
	 */
	EReference getVSVSStepInputLevel2_Level1();

	/**
	 * Returns the meta object for the reference '{@link es.uah.aut.srg.micobs.svm.svs.VSVSStepInputLevel2#getLevel2_to_level1 <em>Level2 to level1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Level2 to level1</em>'.
	 * @see es.uah.aut.srg.micobs.svm.svs.VSVSStepInputLevel2#getLevel2_to_level1()
	 * @see #getVSVSStepInputLevel2()
	 * @generated
	 */
	EReference getVSVSStepInputLevel2_Level2_to_level1();

	/**
	 * Returns the meta object for the reference '{@link es.uah.aut.srg.micobs.svm.svs.VSVSStepInputLevel2#getLevel0 <em>Level0</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Level0</em>'.
	 * @see es.uah.aut.srg.micobs.svm.svs.VSVSStepInputLevel2#getLevel0()
	 * @see #getVSVSStepInputLevel2()
	 * @generated
	 */
	EReference getVSVSStepInputLevel2_Level0();

	/**
	 * Returns the meta object for the reference '{@link es.uah.aut.srg.micobs.svm.svs.VSVSStepInputLevel2#getLevel1_to_level0 <em>Level1 to level0</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Level1 to level0</em>'.
	 * @see es.uah.aut.srg.micobs.svm.svs.VSVSStepInputLevel2#getLevel1_to_level0()
	 * @see #getVSVSStepInputLevel2()
	 * @generated
	 */
	EReference getVSVSStepInputLevel2_Level1_to_level0();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.micobs.svm.svs.VSVSStepInputLevel1 <em>VSVS Step Input Level1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>VSVS Step Input Level1</em>'.
	 * @see es.uah.aut.srg.micobs.svm.svs.VSVSStepInputLevel1
	 * @generated
	 */
	EClass getVSVSStepInputLevel1();

	/**
	 * Returns the meta object for the reference '{@link es.uah.aut.srg.micobs.svm.svs.VSVSStepInputLevel1#getLevel1 <em>Level1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Level1</em>'.
	 * @see es.uah.aut.srg.micobs.svm.svs.VSVSStepInputLevel1#getLevel1()
	 * @see #getVSVSStepInputLevel1()
	 * @generated
	 */
	EReference getVSVSStepInputLevel1_Level1();

	/**
	 * Returns the meta object for the reference '{@link es.uah.aut.srg.micobs.svm.svs.VSVSStepInputLevel1#getApp_to_level1 <em>App to level1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>App to level1</em>'.
	 * @see es.uah.aut.srg.micobs.svm.svs.VSVSStepInputLevel1#getApp_to_level1()
	 * @see #getVSVSStepInputLevel1()
	 * @generated
	 */
	EReference getVSVSStepInputLevel1_App_to_level1();

	/**
	 * Returns the meta object for the reference '{@link es.uah.aut.srg.micobs.svm.svs.VSVSStepInputLevel1#getLevel0 <em>Level0</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Level0</em>'.
	 * @see es.uah.aut.srg.micobs.svm.svs.VSVSStepInputLevel1#getLevel0()
	 * @see #getVSVSStepInputLevel1()
	 * @generated
	 */
	EReference getVSVSStepInputLevel1_Level0();

	/**
	 * Returns the meta object for the reference '{@link es.uah.aut.srg.micobs.svm.svs.VSVSStepInputLevel1#getLevel1_to_level0 <em>Level1 to level0</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Level1 to level0</em>'.
	 * @see es.uah.aut.srg.micobs.svm.svs.VSVSStepInputLevel1#getLevel1_to_level0()
	 * @see #getVSVSStepInputLevel1()
	 * @generated
	 */
	EReference getVSVSStepInputLevel1_Level1_to_level0();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.micobs.svm.svs.VSVSStepInputLevel0 <em>VSVS Step Input Level0</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>VSVS Step Input Level0</em>'.
	 * @see es.uah.aut.srg.micobs.svm.svs.VSVSStepInputLevel0
	 * @generated
	 */
	EClass getVSVSStepInputLevel0();

	/**
	 * Returns the meta object for the reference '{@link es.uah.aut.srg.micobs.svm.svs.VSVSStepInputLevel0#getLevel0 <em>Level0</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Level0</em>'.
	 * @see es.uah.aut.srg.micobs.svm.svs.VSVSStepInputLevel0#getLevel0()
	 * @see #getVSVSStepInputLevel0()
	 * @generated
	 */
	EReference getVSVSStepInputLevel0_Level0();

	/**
	 * Returns the meta object for the reference '{@link es.uah.aut.srg.micobs.svm.svs.VSVSStepInputLevel0#getApp_to_level0 <em>App to level0</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>App to level0</em>'.
	 * @see es.uah.aut.srg.micobs.svm.svs.VSVSStepInputLevel0#getApp_to_level0()
	 * @see #getVSVSStepInputLevel0()
	 * @generated
	 */
	EReference getVSVSStepInputLevel0_App_to_level0();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.micobs.svm.svs.VSVSStepOutput <em>VSVS Step Output</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>VSVS Step Output</em>'.
	 * @see es.uah.aut.srg.micobs.svm.svs.VSVSStepOutput
	 * @generated
	 */
	EClass getVSVSStepOutput();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.micobs.svm.svs.VSVSStepOutput#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see es.uah.aut.srg.micobs.svm.svs.VSVSStepOutput#getName()
	 * @see #getVSVSStepOutput()
	 * @generated
	 */
	EAttribute getVSVSStepOutput_Name();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.micobs.svm.svs.VSVSStepOutput#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see es.uah.aut.srg.micobs.svm.svs.VSVSStepOutput#getId()
	 * @see #getVSVSStepOutput()
	 * @generated
	 */
	EAttribute getVSVSStepOutput_Id();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.micobs.svm.svs.VSVSStepOutput#getIfRef <em>If Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>If Ref</em>'.
	 * @see es.uah.aut.srg.micobs.svm.svs.VSVSStepOutput#getIfRef()
	 * @see #getVSVSStepOutput()
	 * @generated
	 */
	EAttribute getVSVSStepOutput_IfRef();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.micobs.svm.svs.VSVSStepOutput#getOptional <em>Optional</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Optional</em>'.
	 * @see es.uah.aut.srg.micobs.svm.svs.VSVSStepOutput#getOptional()
	 * @see #getVSVSStepOutput()
	 * @generated
	 */
	EAttribute getVSVSStepOutput_Optional();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.micobs.svm.svs.VSVSStepOutputLevel3 <em>VSVS Step Output Level3</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>VSVS Step Output Level3</em>'.
	 * @see es.uah.aut.srg.micobs.svm.svs.VSVSStepOutputLevel3
	 * @generated
	 */
	EClass getVSVSStepOutputLevel3();

	/**
	 * Returns the meta object for the reference '{@link es.uah.aut.srg.micobs.svm.svs.VSVSStepOutputLevel3#getLevel3 <em>Level3</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Level3</em>'.
	 * @see es.uah.aut.srg.micobs.svm.svs.VSVSStepOutputLevel3#getLevel3()
	 * @see #getVSVSStepOutputLevel3()
	 * @generated
	 */
	EReference getVSVSStepOutputLevel3_Level3();

	/**
	 * Returns the meta object for the containment reference '{@link es.uah.aut.srg.micobs.svm.svs.VSVSStepOutputLevel3#getLevel3_filter <em>Level3 filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Level3 filter</em>'.
	 * @see es.uah.aut.srg.micobs.svm.svs.VSVSStepOutputLevel3#getLevel3_filter()
	 * @see #getVSVSStepOutputLevel3()
	 * @generated
	 */
	EReference getVSVSStepOutputLevel3_Level3_filter();

	/**
	 * Returns the meta object for the reference '{@link es.uah.aut.srg.micobs.svm.svs.VSVSStepOutputLevel3#getLevel2 <em>Level2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Level2</em>'.
	 * @see es.uah.aut.srg.micobs.svm.svs.VSVSStepOutputLevel3#getLevel2()
	 * @see #getVSVSStepOutputLevel3()
	 * @generated
	 */
	EReference getVSVSStepOutputLevel3_Level2();

	/**
	 * Returns the meta object for the reference '{@link es.uah.aut.srg.micobs.svm.svs.VSVSStepOutputLevel3#getLevel3_from_level2 <em>Level3 from level2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Level3 from level2</em>'.
	 * @see es.uah.aut.srg.micobs.svm.svs.VSVSStepOutputLevel3#getLevel3_from_level2()
	 * @see #getVSVSStepOutputLevel3()
	 * @generated
	 */
	EReference getVSVSStepOutputLevel3_Level3_from_level2();

	/**
	 * Returns the meta object for the containment reference '{@link es.uah.aut.srg.micobs.svm.svs.VSVSStepOutputLevel3#getLevel2_filter <em>Level2 filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Level2 filter</em>'.
	 * @see es.uah.aut.srg.micobs.svm.svs.VSVSStepOutputLevel3#getLevel2_filter()
	 * @see #getVSVSStepOutputLevel3()
	 * @generated
	 */
	EReference getVSVSStepOutputLevel3_Level2_filter();

	/**
	 * Returns the meta object for the reference '{@link es.uah.aut.srg.micobs.svm.svs.VSVSStepOutputLevel3#getLevel1 <em>Level1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Level1</em>'.
	 * @see es.uah.aut.srg.micobs.svm.svs.VSVSStepOutputLevel3#getLevel1()
	 * @see #getVSVSStepOutputLevel3()
	 * @generated
	 */
	EReference getVSVSStepOutputLevel3_Level1();

	/**
	 * Returns the meta object for the reference '{@link es.uah.aut.srg.micobs.svm.svs.VSVSStepOutputLevel3#getLevel2_from_level1 <em>Level2 from level1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Level2 from level1</em>'.
	 * @see es.uah.aut.srg.micobs.svm.svs.VSVSStepOutputLevel3#getLevel2_from_level1()
	 * @see #getVSVSStepOutputLevel3()
	 * @generated
	 */
	EReference getVSVSStepOutputLevel3_Level2_from_level1();

	/**
	 * Returns the meta object for the containment reference '{@link es.uah.aut.srg.micobs.svm.svs.VSVSStepOutputLevel3#getLevel1_filter <em>Level1 filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Level1 filter</em>'.
	 * @see es.uah.aut.srg.micobs.svm.svs.VSVSStepOutputLevel3#getLevel1_filter()
	 * @see #getVSVSStepOutputLevel3()
	 * @generated
	 */
	EReference getVSVSStepOutputLevel3_Level1_filter();

	/**
	 * Returns the meta object for the reference '{@link es.uah.aut.srg.micobs.svm.svs.VSVSStepOutputLevel3#getLevel0 <em>Level0</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Level0</em>'.
	 * @see es.uah.aut.srg.micobs.svm.svs.VSVSStepOutputLevel3#getLevel0()
	 * @see #getVSVSStepOutputLevel3()
	 * @generated
	 */
	EReference getVSVSStepOutputLevel3_Level0();

	/**
	 * Returns the meta object for the reference '{@link es.uah.aut.srg.micobs.svm.svs.VSVSStepOutputLevel3#getLevel1_from_level0 <em>Level1 from level0</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Level1 from level0</em>'.
	 * @see es.uah.aut.srg.micobs.svm.svs.VSVSStepOutputLevel3#getLevel1_from_level0()
	 * @see #getVSVSStepOutputLevel3()
	 * @generated
	 */
	EReference getVSVSStepOutputLevel3_Level1_from_level0();

	/**
	 * Returns the meta object for the containment reference '{@link es.uah.aut.srg.micobs.svm.svs.VSVSStepOutputLevel3#getLevel0_filter <em>Level0 filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Level0 filter</em>'.
	 * @see es.uah.aut.srg.micobs.svm.svs.VSVSStepOutputLevel3#getLevel0_filter()
	 * @see #getVSVSStepOutputLevel3()
	 * @generated
	 */
	EReference getVSVSStepOutputLevel3_Level0_filter();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.micobs.svm.svs.VSVSStepOutputLevel2 <em>VSVS Step Output Level2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>VSVS Step Output Level2</em>'.
	 * @see es.uah.aut.srg.micobs.svm.svs.VSVSStepOutputLevel2
	 * @generated
	 */
	EClass getVSVSStepOutputLevel2();

	/**
	 * Returns the meta object for the reference '{@link es.uah.aut.srg.micobs.svm.svs.VSVSStepOutputLevel2#getLevel2 <em>Level2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Level2</em>'.
	 * @see es.uah.aut.srg.micobs.svm.svs.VSVSStepOutputLevel2#getLevel2()
	 * @see #getVSVSStepOutputLevel2()
	 * @generated
	 */
	EReference getVSVSStepOutputLevel2_Level2();

	/**
	 * Returns the meta object for the containment reference '{@link es.uah.aut.srg.micobs.svm.svs.VSVSStepOutputLevel2#getLevel2_filter <em>Level2 filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Level2 filter</em>'.
	 * @see es.uah.aut.srg.micobs.svm.svs.VSVSStepOutputLevel2#getLevel2_filter()
	 * @see #getVSVSStepOutputLevel2()
	 * @generated
	 */
	EReference getVSVSStepOutputLevel2_Level2_filter();

	/**
	 * Returns the meta object for the reference '{@link es.uah.aut.srg.micobs.svm.svs.VSVSStepOutputLevel2#getLevel1 <em>Level1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Level1</em>'.
	 * @see es.uah.aut.srg.micobs.svm.svs.VSVSStepOutputLevel2#getLevel1()
	 * @see #getVSVSStepOutputLevel2()
	 * @generated
	 */
	EReference getVSVSStepOutputLevel2_Level1();

	/**
	 * Returns the meta object for the reference '{@link es.uah.aut.srg.micobs.svm.svs.VSVSStepOutputLevel2#getLevel2_from_level1 <em>Level2 from level1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Level2 from level1</em>'.
	 * @see es.uah.aut.srg.micobs.svm.svs.VSVSStepOutputLevel2#getLevel2_from_level1()
	 * @see #getVSVSStepOutputLevel2()
	 * @generated
	 */
	EReference getVSVSStepOutputLevel2_Level2_from_level1();

	/**
	 * Returns the meta object for the containment reference '{@link es.uah.aut.srg.micobs.svm.svs.VSVSStepOutputLevel2#getLevel1_filter <em>Level1 filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Level1 filter</em>'.
	 * @see es.uah.aut.srg.micobs.svm.svs.VSVSStepOutputLevel2#getLevel1_filter()
	 * @see #getVSVSStepOutputLevel2()
	 * @generated
	 */
	EReference getVSVSStepOutputLevel2_Level1_filter();

	/**
	 * Returns the meta object for the reference '{@link es.uah.aut.srg.micobs.svm.svs.VSVSStepOutputLevel2#getLevel0 <em>Level0</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Level0</em>'.
	 * @see es.uah.aut.srg.micobs.svm.svs.VSVSStepOutputLevel2#getLevel0()
	 * @see #getVSVSStepOutputLevel2()
	 * @generated
	 */
	EReference getVSVSStepOutputLevel2_Level0();

	/**
	 * Returns the meta object for the reference '{@link es.uah.aut.srg.micobs.svm.svs.VSVSStepOutputLevel2#getLevel1_from_level0 <em>Level1 from level0</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Level1 from level0</em>'.
	 * @see es.uah.aut.srg.micobs.svm.svs.VSVSStepOutputLevel2#getLevel1_from_level0()
	 * @see #getVSVSStepOutputLevel2()
	 * @generated
	 */
	EReference getVSVSStepOutputLevel2_Level1_from_level0();

	/**
	 * Returns the meta object for the containment reference '{@link es.uah.aut.srg.micobs.svm.svs.VSVSStepOutputLevel2#getLevel0_filter <em>Level0 filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Level0 filter</em>'.
	 * @see es.uah.aut.srg.micobs.svm.svs.VSVSStepOutputLevel2#getLevel0_filter()
	 * @see #getVSVSStepOutputLevel2()
	 * @generated
	 */
	EReference getVSVSStepOutputLevel2_Level0_filter();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.micobs.svm.svs.VSVSStepOutputLevel1 <em>VSVS Step Output Level1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>VSVS Step Output Level1</em>'.
	 * @see es.uah.aut.srg.micobs.svm.svs.VSVSStepOutputLevel1
	 * @generated
	 */
	EClass getVSVSStepOutputLevel1();

	/**
	 * Returns the meta object for the reference '{@link es.uah.aut.srg.micobs.svm.svs.VSVSStepOutputLevel1#getLevel1 <em>Level1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Level1</em>'.
	 * @see es.uah.aut.srg.micobs.svm.svs.VSVSStepOutputLevel1#getLevel1()
	 * @see #getVSVSStepOutputLevel1()
	 * @generated
	 */
	EReference getVSVSStepOutputLevel1_Level1();

	/**
	 * Returns the meta object for the containment reference '{@link es.uah.aut.srg.micobs.svm.svs.VSVSStepOutputLevel1#getLevel1_filter <em>Level1 filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Level1 filter</em>'.
	 * @see es.uah.aut.srg.micobs.svm.svs.VSVSStepOutputLevel1#getLevel1_filter()
	 * @see #getVSVSStepOutputLevel1()
	 * @generated
	 */
	EReference getVSVSStepOutputLevel1_Level1_filter();

	/**
	 * Returns the meta object for the reference '{@link es.uah.aut.srg.micobs.svm.svs.VSVSStepOutputLevel1#getLevel0 <em>Level0</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Level0</em>'.
	 * @see es.uah.aut.srg.micobs.svm.svs.VSVSStepOutputLevel1#getLevel0()
	 * @see #getVSVSStepOutputLevel1()
	 * @generated
	 */
	EReference getVSVSStepOutputLevel1_Level0();

	/**
	 * Returns the meta object for the reference '{@link es.uah.aut.srg.micobs.svm.svs.VSVSStepOutputLevel1#getLevel1_from_level0 <em>Level1 from level0</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Level1 from level0</em>'.
	 * @see es.uah.aut.srg.micobs.svm.svs.VSVSStepOutputLevel1#getLevel1_from_level0()
	 * @see #getVSVSStepOutputLevel1()
	 * @generated
	 */
	EReference getVSVSStepOutputLevel1_Level1_from_level0();

	/**
	 * Returns the meta object for the containment reference '{@link es.uah.aut.srg.micobs.svm.svs.VSVSStepOutputLevel1#getLevel0_filter <em>Level0 filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Level0 filter</em>'.
	 * @see es.uah.aut.srg.micobs.svm.svs.VSVSStepOutputLevel1#getLevel0_filter()
	 * @see #getVSVSStepOutputLevel1()
	 * @generated
	 */
	EReference getVSVSStepOutputLevel1_Level0_filter();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.micobs.svm.svs.VSVSStepOutputLevel0 <em>VSVS Step Output Level0</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>VSVS Step Output Level0</em>'.
	 * @see es.uah.aut.srg.micobs.svm.svs.VSVSStepOutputLevel0
	 * @generated
	 */
	EClass getVSVSStepOutputLevel0();

	/**
	 * Returns the meta object for the reference '{@link es.uah.aut.srg.micobs.svm.svs.VSVSStepOutputLevel0#getLevel0 <em>Level0</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Level0</em>'.
	 * @see es.uah.aut.srg.micobs.svm.svs.VSVSStepOutputLevel0#getLevel0()
	 * @see #getVSVSStepOutputLevel0()
	 * @generated
	 */
	EReference getVSVSStepOutputLevel0_Level0();

	/**
	 * Returns the meta object for the containment reference '{@link es.uah.aut.srg.micobs.svm.svs.VSVSStepOutputLevel0#getLevel0_filter <em>Level0 filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Level0 filter</em>'.
	 * @see es.uah.aut.srg.micobs.svm.svs.VSVSStepOutputLevel0#getLevel0_filter()
	 * @see #getVSVSStepOutputLevel0()
	 * @generated
	 */
	EReference getVSVSStepOutputLevel0_Level0_filter();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.micobs.svm.svs.VSVSStepFilter <em>VSVS Step Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>VSVS Step Filter</em>'.
	 * @see es.uah.aut.srg.micobs.svm.svs.VSVSStepFilter
	 * @generated
	 */
	EClass getVSVSStepFilter();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.micobs.svm.svs.VSVSStepFilter#getApply_def_filter <em>Apply def filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Apply def filter</em>'.
	 * @see es.uah.aut.srg.micobs.svm.svs.VSVSStepFilter#getApply_def_filter()
	 * @see #getVSVSStepFilter()
	 * @generated
	 */
	EAttribute getVSVSStepFilter_Apply_def_filter();

	/**
	 * Returns the meta object for the reference '{@link es.uah.aut.srg.micobs.svm.svs.VSVSStepFilter#getExtra_filter <em>Extra filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Extra filter</em>'.
	 * @see es.uah.aut.srg.micobs.svm.svs.VSVSStepFilter#getExtra_filter()
	 * @see #getVSVSStepFilter()
	 * @generated
	 */
	EReference getVSVSStepFilter_Extra_filter();

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
	 * Returns the meta object for enum '{@link es.uah.aut.srg.micobs.svm.svs.VSVSStepMode <em>VSVS Step Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>VSVS Step Mode</em>'.
	 * @see es.uah.aut.srg.micobs.svm.svs.VSVSStepMode
	 * @generated
	 */
	EEnum getVSVSStepMode();

	/**
	 * Returns the meta object for enum '{@link es.uah.aut.srg.micobs.svm.svs.VSVSStepUnit <em>VSVS Step Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>VSVS Step Unit</em>'.
	 * @see es.uah.aut.srg.micobs.svm.svs.VSVSStepUnit
	 * @generated
	 */
	EEnum getVSVSStepUnit();

	/**
	 * Returns the meta object for enum '{@link es.uah.aut.srg.micobs.svm.svs.VSVSStepCheckmode <em>VSVS Step Checkmode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>VSVS Step Checkmode</em>'.
	 * @see es.uah.aut.srg.micobs.svm.svs.VSVSStepCheckmode
	 * @generated
	 */
	EEnum getVSVSStepCheckmode();

	/**
	 * Returns the meta object for enum '{@link es.uah.aut.srg.micobs.svm.svs.VSVSStepYesNo <em>VSVS Step Yes No</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>VSVS Step Yes No</em>'.
	 * @see es.uah.aut.srg.micobs.svm.svs.VSVSStepYesNo
	 * @generated
	 */
	EEnum getVSVSStepYesNo();

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
		 * The meta object literal for the '<em><b>Scenarios</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VSVS_TESTING_SPECIFICATION_DESIGN__SCENARIOS = eINSTANCE.getVSVSTestingSpecificationDesign_Scenarios();

		/**
		 * The meta object literal for the '<em><b>Test Designs</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VSVS_TESTING_SPECIFICATION_DESIGN__TEST_DESIGNS = eINSTANCE.getVSVSTestingSpecificationDesign_TestDesigns();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.micobs.svm.svs.impl.VSVSScenariosSectionImpl <em>VSVS Scenarios Section</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uah.aut.srg.micobs.svm.svs.impl.VSVSScenariosSectionImpl
		 * @see es.uah.aut.srg.micobs.svm.svs.impl.svsPackageImpl#getVSVSScenariosSection()
		 * @generated
		 */
		EClass VSVS_SCENARIOS_SECTION = eINSTANCE.getVSVSScenariosSection();

		/**
		 * The meta object literal for the '<em><b>Scenarios</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VSVS_SCENARIOS_SECTION__SCENARIOS = eINSTANCE.getVSVSScenariosSection_Scenarios();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.micobs.svm.svs.impl.VSVSScenarioSectionImpl <em>VSVS Scenario Section</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uah.aut.srg.micobs.svm.svs.impl.VSVSScenarioSectionImpl
		 * @see es.uah.aut.srg.micobs.svm.svs.impl.svsPackageImpl#getVSVSScenarioSection()
		 * @generated
		 */
		EClass VSVS_SCENARIO_SECTION = eINSTANCE.getVSVSScenarioSection();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VSVS_SCENARIO_SECTION__NAME = eINSTANCE.getVSVSScenarioSection_Name();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VSVS_SCENARIO_SECTION__ID = eINSTANCE.getVSVSScenarioSection_Id();

		/**
		 * The meta object literal for the '<em><b>Body</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VSVS_SCENARIO_SECTION__BODY = eINSTANCE.getVSVSScenarioSection_Body();

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
		 * The meta object literal for the '{@link es.uah.aut.srg.micobs.svm.svs.impl.VSVSTestInfoImpl <em>VSVS Test Info</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uah.aut.srg.micobs.svm.svs.impl.VSVSTestInfoImpl
		 * @see es.uah.aut.srg.micobs.svm.svs.impl.svsPackageImpl#getVSVSTestInfo()
		 * @generated
		 */
		EClass VSVS_TEST_INFO = eINSTANCE.getVSVSTestInfo();

		/**
		 * The meta object literal for the '<em><b>Body</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VSVS_TEST_INFO__BODY = eINSTANCE.getVSVSTestInfo_Body();

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
		 * The meta object literal for the '<em><b>Scenario</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VSVS_TEST_PROCEDURE__SCENARIO = eINSTANCE.getVSVSTestProcedure_Scenario();

		/**
		 * The meta object literal for the '<em><b>Procedure Steps</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VSVS_TEST_PROCEDURE__PROCEDURE_STEPS = eINSTANCE.getVSVSTestProcedure_ProcedureSteps();

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
		 * The meta object literal for the '{@link es.uah.aut.srg.micobs.svm.svs.impl.VSVSProcedureStepsImpl <em>VSVS Procedure Steps</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uah.aut.srg.micobs.svm.svs.impl.VSVSProcedureStepsImpl
		 * @see es.uah.aut.srg.micobs.svm.svs.impl.svsPackageImpl#getVSVSProcedureSteps()
		 * @generated
		 */
		EClass VSVS_PROCEDURE_STEPS = eINSTANCE.getVSVSProcedureSteps();

		/**
		 * The meta object literal for the '<em><b>Step</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VSVS_PROCEDURE_STEPS__STEP = eINSTANCE.getVSVSProcedureSteps_Step();

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
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VSVS_PROCEDURE_STEP__NAME = eINSTANCE.getVSVSProcedureStep_Name();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VSVS_PROCEDURE_STEP__DESCRIPTION = eINSTANCE.getVSVSProcedureStep_Description();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VSVS_PROCEDURE_STEP__ID = eINSTANCE.getVSVSProcedureStep_Id();

		/**
		 * The meta object literal for the '<em><b>Mode</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VSVS_PROCEDURE_STEP__MODE = eINSTANCE.getVSVSProcedureStep_Mode();

		/**
		 * The meta object literal for the '<em><b>Replays</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VSVS_PROCEDURE_STEP__REPLAYS = eINSTANCE.getVSVSProcedureStep_Replays();

		/**
		 * The meta object literal for the '<em><b>Prev step idref</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VSVS_PROCEDURE_STEP__PREV_STEP_IDREF = eINSTANCE.getVSVSProcedureStep_Prev_step_idref();

		/**
		 * The meta object literal for the '<em><b>Output idref from prev step</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VSVS_PROCEDURE_STEP__OUTPUT_IDREF_FROM_PREV_STEP = eINSTANCE.getVSVSProcedureStep_Output_idref_from_prev_step();

		/**
		 * The meta object literal for the '<em><b>Inputs</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VSVS_PROCEDURE_STEP__INPUTS = eINSTANCE.getVSVSProcedureStep_Inputs();

		/**
		 * The meta object literal for the '<em><b>Outputs</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VSVS_PROCEDURE_STEP__OUTPUTS = eINSTANCE.getVSVSProcedureStep_Outputs();

		/**
		 * The meta object literal for the '<em><b>Special Packets</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VSVS_PROCEDURE_STEP__SPECIAL_PACKETS = eINSTANCE.getVSVSProcedureStep_SpecialPackets();

		/**
		 * The meta object literal for the '<em><b>Concurrent steps</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VSVS_PROCEDURE_STEP__CONCURRENT_STEPS = eINSTANCE.getVSVSProcedureStep_Concurrent_steps();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.micobs.svm.svs.impl.VSVSStepInputsImpl <em>VSVS Step Inputs</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uah.aut.srg.micobs.svm.svs.impl.VSVSStepInputsImpl
		 * @see es.uah.aut.srg.micobs.svm.svs.impl.svsPackageImpl#getVSVSStepInputs()
		 * @generated
		 */
		EClass VSVS_STEP_INPUTS = eINSTANCE.getVSVSStepInputs();

		/**
		 * The meta object literal for the '<em><b>Input</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VSVS_STEP_INPUTS__INPUT = eINSTANCE.getVSVSStepInputs_Input();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.micobs.svm.svs.impl.VSVSStepOutputsImpl <em>VSVS Step Outputs</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uah.aut.srg.micobs.svm.svs.impl.VSVSStepOutputsImpl
		 * @see es.uah.aut.srg.micobs.svm.svs.impl.svsPackageImpl#getVSVSStepOutputs()
		 * @generated
		 */
		EClass VSVS_STEP_OUTPUTS = eINSTANCE.getVSVSStepOutputs();

		/**
		 * The meta object literal for the '<em><b>Checkmode</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VSVS_STEP_OUTPUTS__CHECKMODE = eINSTANCE.getVSVSStepOutputs_Checkmode();

		/**
		 * The meta object literal for the '<em><b>Valid time interval value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VSVS_STEP_OUTPUTS__VALID_TIME_INTERVAL_VALUE = eINSTANCE.getVSVSStepOutputs_Valid_time_interval_value();

		/**
		 * The meta object literal for the '<em><b>Valid time interval unit</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VSVS_STEP_OUTPUTS__VALID_TIME_INTERVAL_UNIT = eINSTANCE.getVSVSStepOutputs_Valid_time_interval_unit();

		/**
		 * The meta object literal for the '<em><b>Output</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VSVS_STEP_OUTPUTS__OUTPUT = eINSTANCE.getVSVSStepOutputs_Output();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.micobs.svm.svs.impl.VSVSStepSpecialPacketsImpl <em>VSVS Step Special Packets</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uah.aut.srg.micobs.svm.svs.impl.VSVSStepSpecialPacketsImpl
		 * @see es.uah.aut.srg.micobs.svm.svs.impl.svsPackageImpl#getVSVSStepSpecialPackets()
		 * @generated
		 */
		EClass VSVS_STEP_SPECIAL_PACKETS = eINSTANCE.getVSVSStepSpecialPackets();

		/**
		 * The meta object literal for the '<em><b>Enable</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VSVS_STEP_SPECIAL_PACKETS__ENABLE = eINSTANCE.getVSVSStepSpecialPackets_Enable();

		/**
		 * The meta object literal for the '<em><b>Disable</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VSVS_STEP_SPECIAL_PACKETS__DISABLE = eINSTANCE.getVSVSStepSpecialPackets_Disable();

		/**
		 * The meta object literal for the '<em><b>Enable print</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VSVS_STEP_SPECIAL_PACKETS__ENABLE_PRINT = eINSTANCE.getVSVSStepSpecialPackets_Enable_print();

		/**
		 * The meta object literal for the '<em><b>Disable print</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VSVS_STEP_SPECIAL_PACKETS__DISABLE_PRINT = eINSTANCE.getVSVSStepSpecialPackets_Disable_print();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.micobs.svm.svs.impl.VSVSStepEnableDisableImpl <em>VSVS Step Enable Disable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uah.aut.srg.micobs.svm.svs.impl.VSVSStepEnableDisableImpl
		 * @see es.uah.aut.srg.micobs.svm.svs.impl.svsPackageImpl#getVSVSStepEnableDisable()
		 * @generated
		 */
		EClass VSVS_STEP_ENABLE_DISABLE = eINSTANCE.getVSVSStepEnableDisable();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VSVS_STEP_ENABLE_DISABLE__ID = eINSTANCE.getVSVSStepEnableDisable_Id();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.micobs.svm.svs.impl.VSVSStepConcurrentStepsImpl <em>VSVS Step Concurrent Steps</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uah.aut.srg.micobs.svm.svs.impl.VSVSStepConcurrentStepsImpl
		 * @see es.uah.aut.srg.micobs.svm.svs.impl.svsPackageImpl#getVSVSStepConcurrentSteps()
		 * @generated
		 */
		EClass VSVS_STEP_CONCURRENT_STEPS = eINSTANCE.getVSVSStepConcurrentSteps();

		/**
		 * The meta object literal for the '<em><b>Next Step</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VSVS_STEP_CONCURRENT_STEPS__NEXT_STEP = eINSTANCE.getVSVSStepConcurrentSteps_NextStep();

		/**
		 * The meta object literal for the '<em><b>Concurrent step</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VSVS_STEP_CONCURRENT_STEPS__CONCURRENT_STEP = eINSTANCE.getVSVSStepConcurrentSteps_Concurrent_step();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.micobs.svm.svs.impl.VSVSStepNextStepImpl <em>VSVS Step Next Step</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uah.aut.srg.micobs.svm.svs.impl.VSVSStepNextStepImpl
		 * @see es.uah.aut.srg.micobs.svm.svs.impl.svsPackageImpl#getVSVSStepNextStep()
		 * @generated
		 */
		EClass VSVS_STEP_NEXT_STEP = eINSTANCE.getVSVSStepNextStep();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VSVS_STEP_NEXT_STEP__ID = eINSTANCE.getVSVSStepNextStep_Id();

		/**
		 * The meta object literal for the '<em><b>Is Concurrent</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VSVS_STEP_NEXT_STEP__IS_CONCURRENT = eINSTANCE.getVSVSStepNextStep_IsConcurrent();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.micobs.svm.svs.impl.VSVSStepConcurrentStepImpl <em>VSVS Step Concurrent Step</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uah.aut.srg.micobs.svm.svs.impl.VSVSStepConcurrentStepImpl
		 * @see es.uah.aut.srg.micobs.svm.svs.impl.svsPackageImpl#getVSVSStepConcurrentStep()
		 * @generated
		 */
		EClass VSVS_STEP_CONCURRENT_STEP = eINSTANCE.getVSVSStepConcurrentStep();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VSVS_STEP_CONCURRENT_STEP__ID = eINSTANCE.getVSVSStepConcurrentStep_Id();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.micobs.svm.svs.impl.VSVSStepInputImpl <em>VSVS Step Input</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uah.aut.srg.micobs.svm.svs.impl.VSVSStepInputImpl
		 * @see es.uah.aut.srg.micobs.svm.svs.impl.svsPackageImpl#getVSVSStepInput()
		 * @generated
		 */
		EClass VSVS_STEP_INPUT = eINSTANCE.getVSVSStepInput();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VSVS_STEP_INPUT__NAME = eINSTANCE.getVSVSStepInput_Name();

		/**
		 * The meta object literal for the '<em><b>If Ref</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VSVS_STEP_INPUT__IF_REF = eINSTANCE.getVSVSStepInput_IfRef();

		/**
		 * The meta object literal for the '<em><b>Delay value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VSVS_STEP_INPUT__DELAY_VALUE = eINSTANCE.getVSVSStepInput_Delay_value();

		/**
		 * The meta object literal for the '<em><b>Delay unit</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VSVS_STEP_INPUT__DELAY_UNIT = eINSTANCE.getVSVSStepInput_Delay_unit();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.micobs.svm.svs.impl.VSVSStepInputLevel3Impl <em>VSVS Step Input Level3</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uah.aut.srg.micobs.svm.svs.impl.VSVSStepInputLevel3Impl
		 * @see es.uah.aut.srg.micobs.svm.svs.impl.svsPackageImpl#getVSVSStepInputLevel3()
		 * @generated
		 */
		EClass VSVS_STEP_INPUT_LEVEL3 = eINSTANCE.getVSVSStepInputLevel3();

		/**
		 * The meta object literal for the '<em><b>Level3</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VSVS_STEP_INPUT_LEVEL3__LEVEL3 = eINSTANCE.getVSVSStepInputLevel3_Level3();

		/**
		 * The meta object literal for the '<em><b>App to level3</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VSVS_STEP_INPUT_LEVEL3__APP_TO_LEVEL3 = eINSTANCE.getVSVSStepInputLevel3_App_to_level3();

		/**
		 * The meta object literal for the '<em><b>Level2</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VSVS_STEP_INPUT_LEVEL3__LEVEL2 = eINSTANCE.getVSVSStepInputLevel3_Level2();

		/**
		 * The meta object literal for the '<em><b>Level3 to level2</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VSVS_STEP_INPUT_LEVEL3__LEVEL3_TO_LEVEL2 = eINSTANCE.getVSVSStepInputLevel3_Level3_to_level2();

		/**
		 * The meta object literal for the '<em><b>Level1</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VSVS_STEP_INPUT_LEVEL3__LEVEL1 = eINSTANCE.getVSVSStepInputLevel3_Level1();

		/**
		 * The meta object literal for the '<em><b>Level2 to level1</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VSVS_STEP_INPUT_LEVEL3__LEVEL2_TO_LEVEL1 = eINSTANCE.getVSVSStepInputLevel3_Level2_to_level1();

		/**
		 * The meta object literal for the '<em><b>Level0</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VSVS_STEP_INPUT_LEVEL3__LEVEL0 = eINSTANCE.getVSVSStepInputLevel3_Level0();

		/**
		 * The meta object literal for the '<em><b>Level1 to level0</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VSVS_STEP_INPUT_LEVEL3__LEVEL1_TO_LEVEL0 = eINSTANCE.getVSVSStepInputLevel3_Level1_to_level0();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.micobs.svm.svs.impl.VSVSStepInputLevel2Impl <em>VSVS Step Input Level2</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uah.aut.srg.micobs.svm.svs.impl.VSVSStepInputLevel2Impl
		 * @see es.uah.aut.srg.micobs.svm.svs.impl.svsPackageImpl#getVSVSStepInputLevel2()
		 * @generated
		 */
		EClass VSVS_STEP_INPUT_LEVEL2 = eINSTANCE.getVSVSStepInputLevel2();

		/**
		 * The meta object literal for the '<em><b>Level2</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VSVS_STEP_INPUT_LEVEL2__LEVEL2 = eINSTANCE.getVSVSStepInputLevel2_Level2();

		/**
		 * The meta object literal for the '<em><b>App to level2</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VSVS_STEP_INPUT_LEVEL2__APP_TO_LEVEL2 = eINSTANCE.getVSVSStepInputLevel2_App_to_level2();

		/**
		 * The meta object literal for the '<em><b>Level1</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VSVS_STEP_INPUT_LEVEL2__LEVEL1 = eINSTANCE.getVSVSStepInputLevel2_Level1();

		/**
		 * The meta object literal for the '<em><b>Level2 to level1</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VSVS_STEP_INPUT_LEVEL2__LEVEL2_TO_LEVEL1 = eINSTANCE.getVSVSStepInputLevel2_Level2_to_level1();

		/**
		 * The meta object literal for the '<em><b>Level0</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VSVS_STEP_INPUT_LEVEL2__LEVEL0 = eINSTANCE.getVSVSStepInputLevel2_Level0();

		/**
		 * The meta object literal for the '<em><b>Level1 to level0</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VSVS_STEP_INPUT_LEVEL2__LEVEL1_TO_LEVEL0 = eINSTANCE.getVSVSStepInputLevel2_Level1_to_level0();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.micobs.svm.svs.impl.VSVSStepInputLevel1Impl <em>VSVS Step Input Level1</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uah.aut.srg.micobs.svm.svs.impl.VSVSStepInputLevel1Impl
		 * @see es.uah.aut.srg.micobs.svm.svs.impl.svsPackageImpl#getVSVSStepInputLevel1()
		 * @generated
		 */
		EClass VSVS_STEP_INPUT_LEVEL1 = eINSTANCE.getVSVSStepInputLevel1();

		/**
		 * The meta object literal for the '<em><b>Level1</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VSVS_STEP_INPUT_LEVEL1__LEVEL1 = eINSTANCE.getVSVSStepInputLevel1_Level1();

		/**
		 * The meta object literal for the '<em><b>App to level1</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VSVS_STEP_INPUT_LEVEL1__APP_TO_LEVEL1 = eINSTANCE.getVSVSStepInputLevel1_App_to_level1();

		/**
		 * The meta object literal for the '<em><b>Level0</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VSVS_STEP_INPUT_LEVEL1__LEVEL0 = eINSTANCE.getVSVSStepInputLevel1_Level0();

		/**
		 * The meta object literal for the '<em><b>Level1 to level0</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VSVS_STEP_INPUT_LEVEL1__LEVEL1_TO_LEVEL0 = eINSTANCE.getVSVSStepInputLevel1_Level1_to_level0();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.micobs.svm.svs.impl.VSVSStepInputLevel0Impl <em>VSVS Step Input Level0</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uah.aut.srg.micobs.svm.svs.impl.VSVSStepInputLevel0Impl
		 * @see es.uah.aut.srg.micobs.svm.svs.impl.svsPackageImpl#getVSVSStepInputLevel0()
		 * @generated
		 */
		EClass VSVS_STEP_INPUT_LEVEL0 = eINSTANCE.getVSVSStepInputLevel0();

		/**
		 * The meta object literal for the '<em><b>Level0</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VSVS_STEP_INPUT_LEVEL0__LEVEL0 = eINSTANCE.getVSVSStepInputLevel0_Level0();

		/**
		 * The meta object literal for the '<em><b>App to level0</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VSVS_STEP_INPUT_LEVEL0__APP_TO_LEVEL0 = eINSTANCE.getVSVSStepInputLevel0_App_to_level0();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.micobs.svm.svs.impl.VSVSStepOutputImpl <em>VSVS Step Output</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uah.aut.srg.micobs.svm.svs.impl.VSVSStepOutputImpl
		 * @see es.uah.aut.srg.micobs.svm.svs.impl.svsPackageImpl#getVSVSStepOutput()
		 * @generated
		 */
		EClass VSVS_STEP_OUTPUT = eINSTANCE.getVSVSStepOutput();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VSVS_STEP_OUTPUT__NAME = eINSTANCE.getVSVSStepOutput_Name();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VSVS_STEP_OUTPUT__ID = eINSTANCE.getVSVSStepOutput_Id();

		/**
		 * The meta object literal for the '<em><b>If Ref</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VSVS_STEP_OUTPUT__IF_REF = eINSTANCE.getVSVSStepOutput_IfRef();

		/**
		 * The meta object literal for the '<em><b>Optional</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VSVS_STEP_OUTPUT__OPTIONAL = eINSTANCE.getVSVSStepOutput_Optional();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.micobs.svm.svs.impl.VSVSStepOutputLevel3Impl <em>VSVS Step Output Level3</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uah.aut.srg.micobs.svm.svs.impl.VSVSStepOutputLevel3Impl
		 * @see es.uah.aut.srg.micobs.svm.svs.impl.svsPackageImpl#getVSVSStepOutputLevel3()
		 * @generated
		 */
		EClass VSVS_STEP_OUTPUT_LEVEL3 = eINSTANCE.getVSVSStepOutputLevel3();

		/**
		 * The meta object literal for the '<em><b>Level3</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VSVS_STEP_OUTPUT_LEVEL3__LEVEL3 = eINSTANCE.getVSVSStepOutputLevel3_Level3();

		/**
		 * The meta object literal for the '<em><b>Level3 filter</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VSVS_STEP_OUTPUT_LEVEL3__LEVEL3_FILTER = eINSTANCE.getVSVSStepOutputLevel3_Level3_filter();

		/**
		 * The meta object literal for the '<em><b>Level2</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VSVS_STEP_OUTPUT_LEVEL3__LEVEL2 = eINSTANCE.getVSVSStepOutputLevel3_Level2();

		/**
		 * The meta object literal for the '<em><b>Level3 from level2</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VSVS_STEP_OUTPUT_LEVEL3__LEVEL3_FROM_LEVEL2 = eINSTANCE.getVSVSStepOutputLevel3_Level3_from_level2();

		/**
		 * The meta object literal for the '<em><b>Level2 filter</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VSVS_STEP_OUTPUT_LEVEL3__LEVEL2_FILTER = eINSTANCE.getVSVSStepOutputLevel3_Level2_filter();

		/**
		 * The meta object literal for the '<em><b>Level1</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VSVS_STEP_OUTPUT_LEVEL3__LEVEL1 = eINSTANCE.getVSVSStepOutputLevel3_Level1();

		/**
		 * The meta object literal for the '<em><b>Level2 from level1</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VSVS_STEP_OUTPUT_LEVEL3__LEVEL2_FROM_LEVEL1 = eINSTANCE.getVSVSStepOutputLevel3_Level2_from_level1();

		/**
		 * The meta object literal for the '<em><b>Level1 filter</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VSVS_STEP_OUTPUT_LEVEL3__LEVEL1_FILTER = eINSTANCE.getVSVSStepOutputLevel3_Level1_filter();

		/**
		 * The meta object literal for the '<em><b>Level0</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VSVS_STEP_OUTPUT_LEVEL3__LEVEL0 = eINSTANCE.getVSVSStepOutputLevel3_Level0();

		/**
		 * The meta object literal for the '<em><b>Level1 from level0</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VSVS_STEP_OUTPUT_LEVEL3__LEVEL1_FROM_LEVEL0 = eINSTANCE.getVSVSStepOutputLevel3_Level1_from_level0();

		/**
		 * The meta object literal for the '<em><b>Level0 filter</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VSVS_STEP_OUTPUT_LEVEL3__LEVEL0_FILTER = eINSTANCE.getVSVSStepOutputLevel3_Level0_filter();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.micobs.svm.svs.impl.VSVSStepOutputLevel2Impl <em>VSVS Step Output Level2</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uah.aut.srg.micobs.svm.svs.impl.VSVSStepOutputLevel2Impl
		 * @see es.uah.aut.srg.micobs.svm.svs.impl.svsPackageImpl#getVSVSStepOutputLevel2()
		 * @generated
		 */
		EClass VSVS_STEP_OUTPUT_LEVEL2 = eINSTANCE.getVSVSStepOutputLevel2();

		/**
		 * The meta object literal for the '<em><b>Level2</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VSVS_STEP_OUTPUT_LEVEL2__LEVEL2 = eINSTANCE.getVSVSStepOutputLevel2_Level2();

		/**
		 * The meta object literal for the '<em><b>Level2 filter</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VSVS_STEP_OUTPUT_LEVEL2__LEVEL2_FILTER = eINSTANCE.getVSVSStepOutputLevel2_Level2_filter();

		/**
		 * The meta object literal for the '<em><b>Level1</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VSVS_STEP_OUTPUT_LEVEL2__LEVEL1 = eINSTANCE.getVSVSStepOutputLevel2_Level1();

		/**
		 * The meta object literal for the '<em><b>Level2 from level1</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VSVS_STEP_OUTPUT_LEVEL2__LEVEL2_FROM_LEVEL1 = eINSTANCE.getVSVSStepOutputLevel2_Level2_from_level1();

		/**
		 * The meta object literal for the '<em><b>Level1 filter</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VSVS_STEP_OUTPUT_LEVEL2__LEVEL1_FILTER = eINSTANCE.getVSVSStepOutputLevel2_Level1_filter();

		/**
		 * The meta object literal for the '<em><b>Level0</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VSVS_STEP_OUTPUT_LEVEL2__LEVEL0 = eINSTANCE.getVSVSStepOutputLevel2_Level0();

		/**
		 * The meta object literal for the '<em><b>Level1 from level0</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VSVS_STEP_OUTPUT_LEVEL2__LEVEL1_FROM_LEVEL0 = eINSTANCE.getVSVSStepOutputLevel2_Level1_from_level0();

		/**
		 * The meta object literal for the '<em><b>Level0 filter</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VSVS_STEP_OUTPUT_LEVEL2__LEVEL0_FILTER = eINSTANCE.getVSVSStepOutputLevel2_Level0_filter();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.micobs.svm.svs.impl.VSVSStepOutputLevel1Impl <em>VSVS Step Output Level1</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uah.aut.srg.micobs.svm.svs.impl.VSVSStepOutputLevel1Impl
		 * @see es.uah.aut.srg.micobs.svm.svs.impl.svsPackageImpl#getVSVSStepOutputLevel1()
		 * @generated
		 */
		EClass VSVS_STEP_OUTPUT_LEVEL1 = eINSTANCE.getVSVSStepOutputLevel1();

		/**
		 * The meta object literal for the '<em><b>Level1</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VSVS_STEP_OUTPUT_LEVEL1__LEVEL1 = eINSTANCE.getVSVSStepOutputLevel1_Level1();

		/**
		 * The meta object literal for the '<em><b>Level1 filter</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VSVS_STEP_OUTPUT_LEVEL1__LEVEL1_FILTER = eINSTANCE.getVSVSStepOutputLevel1_Level1_filter();

		/**
		 * The meta object literal for the '<em><b>Level0</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VSVS_STEP_OUTPUT_LEVEL1__LEVEL0 = eINSTANCE.getVSVSStepOutputLevel1_Level0();

		/**
		 * The meta object literal for the '<em><b>Level1 from level0</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VSVS_STEP_OUTPUT_LEVEL1__LEVEL1_FROM_LEVEL0 = eINSTANCE.getVSVSStepOutputLevel1_Level1_from_level0();

		/**
		 * The meta object literal for the '<em><b>Level0 filter</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VSVS_STEP_OUTPUT_LEVEL1__LEVEL0_FILTER = eINSTANCE.getVSVSStepOutputLevel1_Level0_filter();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.micobs.svm.svs.impl.VSVSStepOutputLevel0Impl <em>VSVS Step Output Level0</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uah.aut.srg.micobs.svm.svs.impl.VSVSStepOutputLevel0Impl
		 * @see es.uah.aut.srg.micobs.svm.svs.impl.svsPackageImpl#getVSVSStepOutputLevel0()
		 * @generated
		 */
		EClass VSVS_STEP_OUTPUT_LEVEL0 = eINSTANCE.getVSVSStepOutputLevel0();

		/**
		 * The meta object literal for the '<em><b>Level0</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VSVS_STEP_OUTPUT_LEVEL0__LEVEL0 = eINSTANCE.getVSVSStepOutputLevel0_Level0();

		/**
		 * The meta object literal for the '<em><b>Level0 filter</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VSVS_STEP_OUTPUT_LEVEL0__LEVEL0_FILTER = eINSTANCE.getVSVSStepOutputLevel0_Level0_filter();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.micobs.svm.svs.impl.VSVSStepFilterImpl <em>VSVS Step Filter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uah.aut.srg.micobs.svm.svs.impl.VSVSStepFilterImpl
		 * @see es.uah.aut.srg.micobs.svm.svs.impl.svsPackageImpl#getVSVSStepFilter()
		 * @generated
		 */
		EClass VSVS_STEP_FILTER = eINSTANCE.getVSVSStepFilter();

		/**
		 * The meta object literal for the '<em><b>Apply def filter</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VSVS_STEP_FILTER__APPLY_DEF_FILTER = eINSTANCE.getVSVSStepFilter_Apply_def_filter();

		/**
		 * The meta object literal for the '<em><b>Extra filter</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VSVS_STEP_FILTER__EXTRA_FILTER = eINSTANCE.getVSVSStepFilter_Extra_filter();

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

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.micobs.svm.svs.VSVSStepMode <em>VSVS Step Mode</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uah.aut.srg.micobs.svm.svs.VSVSStepMode
		 * @see es.uah.aut.srg.micobs.svm.svs.impl.svsPackageImpl#getVSVSStepMode()
		 * @generated
		 */
		EEnum VSVS_STEP_MODE = eINSTANCE.getVSVSStepMode();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.micobs.svm.svs.VSVSStepUnit <em>VSVS Step Unit</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uah.aut.srg.micobs.svm.svs.VSVSStepUnit
		 * @see es.uah.aut.srg.micobs.svm.svs.impl.svsPackageImpl#getVSVSStepUnit()
		 * @generated
		 */
		EEnum VSVS_STEP_UNIT = eINSTANCE.getVSVSStepUnit();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.micobs.svm.svs.VSVSStepCheckmode <em>VSVS Step Checkmode</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uah.aut.srg.micobs.svm.svs.VSVSStepCheckmode
		 * @see es.uah.aut.srg.micobs.svm.svs.impl.svsPackageImpl#getVSVSStepCheckmode()
		 * @generated
		 */
		EEnum VSVS_STEP_CHECKMODE = eINSTANCE.getVSVSStepCheckmode();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.micobs.svm.svs.VSVSStepYesNo <em>VSVS Step Yes No</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uah.aut.srg.micobs.svm.svs.VSVSStepYesNo
		 * @see es.uah.aut.srg.micobs.svm.svs.impl.svsPackageImpl#getVSVSStepYesNo()
		 * @generated
		 */
		EEnum VSVS_STEP_YES_NO = eINSTANCE.getVSVSStepYesNo();

	}

} //svsPackage
