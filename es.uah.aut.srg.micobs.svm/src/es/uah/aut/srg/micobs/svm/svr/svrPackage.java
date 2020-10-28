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
package es.uah.aut.srg.micobs.svm.svr;

import es.uah.aut.srg.micobs.doctpl.doctpl.doctplPackage;

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
 * @see es.uah.aut.srg.micobs.svm.svr.svrFactory
 * @model kind="package"
 * @generated
 */
public interface svrPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "svr";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://srg.aut.uah.es/micobs/svm/svr";

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
	svrPackage eINSTANCE = es.uah.aut.srg.micobs.svm.svr.impl.svrPackageImpl.init();

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.micobs.svm.svr.impl.VSVRDocumentImpl <em>VSVR Document</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uah.aut.srg.micobs.svm.svr.impl.VSVRDocumentImpl
	 * @see es.uah.aut.srg.micobs.svm.svr.impl.svrPackageImpl#getVSVRDocument()
	 * @generated
	 */
	int VSVR_DOCUMENT = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSVR_DOCUMENT__NAME = doctplPackage.DDOCUMENT_TEMPLATE__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSVR_DOCUMENT__ID = doctplPackage.DDOCUMENT_TEMPLATE__ID;

	/**
	 * The feature id for the '<em><b>Issue</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSVR_DOCUMENT__ISSUE = doctplPackage.DDOCUMENT_TEMPLATE__ISSUE;

	/**
	 * The feature id for the '<em><b>Revision</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSVR_DOCUMENT__REVISION = doctplPackage.DDOCUMENT_TEMPLATE__REVISION;

	/**
	 * The feature id for the '<em><b>Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSVR_DOCUMENT__DATE = doctplPackage.DDOCUMENT_TEMPLATE__DATE;

	/**
	 * The feature id for the '<em><b>Tbcs</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSVR_DOCUMENT__TBCS = doctplPackage.DDOCUMENT_TEMPLATE__TBCS;

	/**
	 * The feature id for the '<em><b>Tbds</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSVR_DOCUMENT__TBDS = doctplPackage.DDOCUMENT_TEMPLATE__TBDS;

	/**
	 * The feature id for the '<em><b>Applicable Documents</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSVR_DOCUMENT__APPLICABLE_DOCUMENTS = doctplPackage.DDOCUMENT_TEMPLATE__APPLICABLE_DOCUMENTS;

	/**
	 * The feature id for the '<em><b>Reference Documents</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSVR_DOCUMENT__REFERENCE_DOCUMENTS = doctplPackage.DDOCUMENT_TEMPLATE__REFERENCE_DOCUMENTS;

	/**
	 * The feature id for the '<em><b>Figures</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSVR_DOCUMENT__FIGURES = doctplPackage.DDOCUMENT_TEMPLATE__FIGURES;

	/**
	 * The feature id for the '<em><b>Tables</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSVR_DOCUMENT__TABLES = doctplPackage.DDOCUMENT_TEMPLATE__TABLES;

	/**
	 * The feature id for the '<em><b>Sections</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSVR_DOCUMENT__SECTIONS = doctplPackage.DDOCUMENT_TEMPLATE__SECTIONS;

	/**
	 * The feature id for the '<em><b>Paragraphs</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSVR_DOCUMENT__PARAGRAPHS = doctplPackage.DDOCUMENT_TEMPLATE__PARAGRAPHS;

	/**
	 * The feature id for the '<em><b>Svs Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSVR_DOCUMENT__SVS_PARENT = doctplPackage.DDOCUMENT_TEMPLATE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Tcr Parent</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSVR_DOCUMENT__TCR_PARENT = doctplPackage.DDOCUMENT_TEMPLATE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Tbcs Tbds Section</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSVR_DOCUMENT__TBCS_TBDS_SECTION = doctplPackage.DDOCUMENT_TEMPLATE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Introduction Section</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSVR_DOCUMENT__INTRODUCTION_SECTION = doctplPackage.DDOCUMENT_TEMPLATE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Applicable Documents Section</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSVR_DOCUMENT__APPLICABLE_DOCUMENTS_SECTION = doctplPackage.DDOCUMENT_TEMPLATE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Reference Documents Section</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSVR_DOCUMENT__REFERENCE_DOCUMENTS_SECTION = doctplPackage.DDOCUMENT_TEMPLATE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Terms Definitions Abbreviations Section</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSVR_DOCUMENT__TERMS_DEFINITIONS_ABBREVIATIONS_SECTION = doctplPackage.DDOCUMENT_TEMPLATE_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>VSVR Document</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSVR_DOCUMENT_FEATURE_COUNT = doctplPackage.DDOCUMENT_TEMPLATE_FEATURE_COUNT + 7;

	/**
	 * The number of operations of the '<em>VSVR Document</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSVR_DOCUMENT_OPERATION_COUNT = doctplPackage.DDOCUMENT_TEMPLATE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.micobs.svm.svr.impl.VSVRTBCsTBDsImpl <em>VSVRTB Cs TB Ds</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uah.aut.srg.micobs.svm.svr.impl.VSVRTBCsTBDsImpl
	 * @see es.uah.aut.srg.micobs.svm.svr.impl.svrPackageImpl#getVSVRTBCsTBDs()
	 * @generated
	 */
	int VSVRTB_CS_TB_DS = 1;

	/**
	 * The feature id for the '<em><b>Subsections</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSVRTB_CS_TB_DS__SUBSECTIONS = doctplPackage.DFIXED_SECTION__SUBSECTIONS;

	/**
	 * The feature id for the '<em><b>Tbcs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSVRTB_CS_TB_DS__TBCS = doctplPackage.DFIXED_SECTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Tbds</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSVRTB_CS_TB_DS__TBDS = doctplPackage.DFIXED_SECTION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>VSVRTB Cs TB Ds</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSVRTB_CS_TB_DS_FEATURE_COUNT = doctplPackage.DFIXED_SECTION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>VSVRTB Cs TB Ds</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSVRTB_CS_TB_DS_OPERATION_COUNT = doctplPackage.DFIXED_SECTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.micobs.svm.svr.impl.VSVRIntroductionImpl <em>VSVR Introduction</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uah.aut.srg.micobs.svm.svr.impl.VSVRIntroductionImpl
	 * @see es.uah.aut.srg.micobs.svm.svr.impl.svrPackageImpl#getVSVRIntroduction()
	 * @generated
	 */
	int VSVR_INTRODUCTION = 2;

	/**
	 * The feature id for the '<em><b>Subsections</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSVR_INTRODUCTION__SUBSECTIONS = doctplPackage.DFIXED_SECTION__SUBSECTIONS;

	/**
	 * The feature id for the '<em><b>Svr Instatiable Subsections</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSVR_INTRODUCTION__SVR_INSTATIABLE_SUBSECTIONS = doctplPackage.DFIXED_SECTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>VSVR Introduction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSVR_INTRODUCTION_FEATURE_COUNT = doctplPackage.DFIXED_SECTION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>VSVR Introduction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSVR_INTRODUCTION_OPERATION_COUNT = doctplPackage.DFIXED_SECTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.micobs.svm.svr.impl.VSVRApplicableDocumentsImpl <em>VSVR Applicable Documents</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uah.aut.srg.micobs.svm.svr.impl.VSVRApplicableDocumentsImpl
	 * @see es.uah.aut.srg.micobs.svm.svr.impl.svrPackageImpl#getVSVRApplicableDocuments()
	 * @generated
	 */
	int VSVR_APPLICABLE_DOCUMENTS = 3;

	/**
	 * The feature id for the '<em><b>Subsections</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSVR_APPLICABLE_DOCUMENTS__SUBSECTIONS = doctplPackage.DFIXED_SECTION__SUBSECTIONS;

	/**
	 * The feature id for the '<em><b>Applicable Documents</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSVR_APPLICABLE_DOCUMENTS__APPLICABLE_DOCUMENTS = doctplPackage.DFIXED_SECTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>VSVR Applicable Documents</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSVR_APPLICABLE_DOCUMENTS_FEATURE_COUNT = doctplPackage.DFIXED_SECTION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>VSVR Applicable Documents</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSVR_APPLICABLE_DOCUMENTS_OPERATION_COUNT = doctplPackage.DFIXED_SECTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.micobs.svm.svr.impl.VSVRReferenceDocumentsImpl <em>VSVR Reference Documents</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uah.aut.srg.micobs.svm.svr.impl.VSVRReferenceDocumentsImpl
	 * @see es.uah.aut.srg.micobs.svm.svr.impl.svrPackageImpl#getVSVRReferenceDocuments()
	 * @generated
	 */
	int VSVR_REFERENCE_DOCUMENTS = 4;

	/**
	 * The feature id for the '<em><b>Subsections</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSVR_REFERENCE_DOCUMENTS__SUBSECTIONS = doctplPackage.DFIXED_SECTION__SUBSECTIONS;

	/**
	 * The feature id for the '<em><b>Reference Documents</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSVR_REFERENCE_DOCUMENTS__REFERENCE_DOCUMENTS = doctplPackage.DFIXED_SECTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>VSVR Reference Documents</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSVR_REFERENCE_DOCUMENTS_FEATURE_COUNT = doctplPackage.DFIXED_SECTION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>VSVR Reference Documents</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSVR_REFERENCE_DOCUMENTS_OPERATION_COUNT = doctplPackage.DFIXED_SECTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.micobs.svm.svr.impl.VSVRTermsDefinitionsAbbreviationsImpl <em>VSVR Terms Definitions Abbreviations</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uah.aut.srg.micobs.svm.svr.impl.VSVRTermsDefinitionsAbbreviationsImpl
	 * @see es.uah.aut.srg.micobs.svm.svr.impl.svrPackageImpl#getVSVRTermsDefinitionsAbbreviations()
	 * @generated
	 */
	int VSVR_TERMS_DEFINITIONS_ABBREVIATIONS = 5;

	/**
	 * The feature id for the '<em><b>Subsections</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSVR_TERMS_DEFINITIONS_ABBREVIATIONS__SUBSECTIONS = doctplPackage.DFIXED_SECTION__SUBSECTIONS;

	/**
	 * The feature id for the '<em><b>Terms</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSVR_TERMS_DEFINITIONS_ABBREVIATIONS__TERMS = doctplPackage.DFIXED_SECTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Definitions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSVR_TERMS_DEFINITIONS_ABBREVIATIONS__DEFINITIONS = doctplPackage.DFIXED_SECTION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Abbreviations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSVR_TERMS_DEFINITIONS_ABBREVIATIONS__ABBREVIATIONS = doctplPackage.DFIXED_SECTION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>VSVR Terms Definitions Abbreviations</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSVR_TERMS_DEFINITIONS_ABBREVIATIONS_FEATURE_COUNT = doctplPackage.DFIXED_SECTION_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>VSVR Terms Definitions Abbreviations</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSVR_TERMS_DEFINITIONS_ABBREVIATIONS_OPERATION_COUNT = doctplPackage.DFIXED_SECTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.micobs.svm.svr.impl.VSVRAbstractBriefDescriptionImpl <em>VSVR Abstract Brief Description</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uah.aut.srg.micobs.svm.svr.impl.VSVRAbstractBriefDescriptionImpl
	 * @see es.uah.aut.srg.micobs.svm.svr.impl.svrPackageImpl#getVSVRAbstractBriefDescription()
	 * @generated
	 */
	int VSVR_ABSTRACT_BRIEF_DESCRIPTION = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSVR_ABSTRACT_BRIEF_DESCRIPTION__NAME = 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSVR_ABSTRACT_BRIEF_DESCRIPTION__DESCRIPTION = 1;

	/**
	 * The number of structural features of the '<em>VSVR Abstract Brief Description</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSVR_ABSTRACT_BRIEF_DESCRIPTION_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>VSVR Abstract Brief Description</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSVR_ABSTRACT_BRIEF_DESCRIPTION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.micobs.svm.svr.impl.VSVRTermImpl <em>VSVR Term</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uah.aut.srg.micobs.svm.svr.impl.VSVRTermImpl
	 * @see es.uah.aut.srg.micobs.svm.svr.impl.svrPackageImpl#getVSVRTerm()
	 * @generated
	 */
	int VSVR_TERM = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSVR_TERM__NAME = VSVR_ABSTRACT_BRIEF_DESCRIPTION__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSVR_TERM__DESCRIPTION = VSVR_ABSTRACT_BRIEF_DESCRIPTION__DESCRIPTION;

	/**
	 * The number of structural features of the '<em>VSVR Term</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSVR_TERM_FEATURE_COUNT = VSVR_ABSTRACT_BRIEF_DESCRIPTION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>VSVR Term</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSVR_TERM_OPERATION_COUNT = VSVR_ABSTRACT_BRIEF_DESCRIPTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.micobs.svm.svr.impl.VSVRDefinitionImpl <em>VSVR Definition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uah.aut.srg.micobs.svm.svr.impl.VSVRDefinitionImpl
	 * @see es.uah.aut.srg.micobs.svm.svr.impl.svrPackageImpl#getVSVRDefinition()
	 * @generated
	 */
	int VSVR_DEFINITION = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSVR_DEFINITION__NAME = VSVR_ABSTRACT_BRIEF_DESCRIPTION__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSVR_DEFINITION__DESCRIPTION = VSVR_ABSTRACT_BRIEF_DESCRIPTION__DESCRIPTION;

	/**
	 * The number of structural features of the '<em>VSVR Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSVR_DEFINITION_FEATURE_COUNT = VSVR_ABSTRACT_BRIEF_DESCRIPTION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>VSVR Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSVR_DEFINITION_OPERATION_COUNT = VSVR_ABSTRACT_BRIEF_DESCRIPTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.micobs.svm.svr.impl.VSVRAbbreviationImpl <em>VSVR Abbreviation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uah.aut.srg.micobs.svm.svr.impl.VSVRAbbreviationImpl
	 * @see es.uah.aut.srg.micobs.svm.svr.impl.svrPackageImpl#getVSVRAbbreviation()
	 * @generated
	 */
	int VSVR_ABBREVIATION = 9;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSVR_ABBREVIATION__NAME = VSVR_ABSTRACT_BRIEF_DESCRIPTION__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSVR_ABBREVIATION__DESCRIPTION = VSVR_ABSTRACT_BRIEF_DESCRIPTION__DESCRIPTION;

	/**
	 * The number of structural features of the '<em>VSVR Abbreviation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSVR_ABBREVIATION_FEATURE_COUNT = VSVR_ABSTRACT_BRIEF_DESCRIPTION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>VSVR Abbreviation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSVR_ABBREVIATION_OPERATION_COUNT = VSVR_ABSTRACT_BRIEF_DESCRIPTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.micobs.svm.svr.impl.VSVRFixedSectionImpl <em>VSVR Fixed Section</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uah.aut.srg.micobs.svm.svr.impl.VSVRFixedSectionImpl
	 * @see es.uah.aut.srg.micobs.svm.svr.impl.svrPackageImpl#getVSVRFixedSection()
	 * @generated
	 */
	int VSVR_FIXED_SECTION = 10;

	/**
	 * The feature id for the '<em><b>Subsections</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSVR_FIXED_SECTION__SUBSECTIONS = doctplPackage.DFIXED_SECTION__SUBSECTIONS;

	/**
	 * The feature id for the '<em><b>Body</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSVR_FIXED_SECTION__BODY = doctplPackage.DFIXED_SECTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Svr Instatiable Subsections</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSVR_FIXED_SECTION__SVR_INSTATIABLE_SUBSECTIONS = doctplPackage.DFIXED_SECTION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>VSVR Fixed Section</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSVR_FIXED_SECTION_FEATURE_COUNT = doctplPackage.DFIXED_SECTION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>VSVR Fixed Section</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSVR_FIXED_SECTION_OPERATION_COUNT = doctplPackage.DFIXED_SECTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.micobs.svm.svr.impl.VSVRInstantiableSectionImpl <em>VSVR Instantiable Section</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uah.aut.srg.micobs.svm.svr.impl.VSVRInstantiableSectionImpl
	 * @see es.uah.aut.srg.micobs.svm.svr.impl.svrPackageImpl#getVSVRInstantiableSection()
	 * @generated
	 */
	int VSVR_INSTANTIABLE_SECTION = 11;

	/**
	 * The feature id for the '<em><b>Subsections</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSVR_INSTANTIABLE_SECTION__SUBSECTIONS = doctplPackage.DINSTANTIABLE_SECTION__SUBSECTIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSVR_INSTANTIABLE_SECTION__NAME = doctplPackage.DINSTANTIABLE_SECTION__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSVR_INSTANTIABLE_SECTION__DESCRIPTION = doctplPackage.DINSTANTIABLE_SECTION__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Body</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSVR_INSTANTIABLE_SECTION__BODY = doctplPackage.DINSTANTIABLE_SECTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Svr Instatiable Subsections</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSVR_INSTANTIABLE_SECTION__SVR_INSTATIABLE_SUBSECTIONS = doctplPackage.DINSTANTIABLE_SECTION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>VSVR Instantiable Section</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSVR_INSTANTIABLE_SECTION_FEATURE_COUNT = doctplPackage.DINSTANTIABLE_SECTION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>VSVR Instantiable Section</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSVR_INSTANTIABLE_SECTION_OPERATION_COUNT = doctplPackage.DINSTANTIABLE_SECTION_OPERATION_COUNT + 0;

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.micobs.svm.svr.VSVRDocument <em>VSVR Document</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>VSVR Document</em>'.
	 * @see es.uah.aut.srg.micobs.svm.svr.VSVRDocument
	 * @generated
	 */
	EClass getVSVRDocument();

	/**
	 * Returns the meta object for the reference '{@link es.uah.aut.srg.micobs.svm.svr.VSVRDocument#getSvsParent <em>Svs Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Svs Parent</em>'.
	 * @see es.uah.aut.srg.micobs.svm.svr.VSVRDocument#getSvsParent()
	 * @see #getVSVRDocument()
	 * @generated
	 */
	EReference getVSVRDocument_SvsParent();

	/**
	 * Returns the meta object for the reference list '{@link es.uah.aut.srg.micobs.svm.svr.VSVRDocument#getTcrParent <em>Tcr Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Tcr Parent</em>'.
	 * @see es.uah.aut.srg.micobs.svm.svr.VSVRDocument#getTcrParent()
	 * @see #getVSVRDocument()
	 * @generated
	 */
	EReference getVSVRDocument_TcrParent();

	/**
	 * Returns the meta object for the containment reference '{@link es.uah.aut.srg.micobs.svm.svr.VSVRDocument#getTbcsTbdsSection <em>Tbcs Tbds Section</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Tbcs Tbds Section</em>'.
	 * @see es.uah.aut.srg.micobs.svm.svr.VSVRDocument#getTbcsTbdsSection()
	 * @see #getVSVRDocument()
	 * @generated
	 */
	EReference getVSVRDocument_TbcsTbdsSection();

	/**
	 * Returns the meta object for the containment reference '{@link es.uah.aut.srg.micobs.svm.svr.VSVRDocument#getIntroductionSection <em>Introduction Section</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Introduction Section</em>'.
	 * @see es.uah.aut.srg.micobs.svm.svr.VSVRDocument#getIntroductionSection()
	 * @see #getVSVRDocument()
	 * @generated
	 */
	EReference getVSVRDocument_IntroductionSection();

	/**
	 * Returns the meta object for the containment reference '{@link es.uah.aut.srg.micobs.svm.svr.VSVRDocument#getApplicableDocumentsSection <em>Applicable Documents Section</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Applicable Documents Section</em>'.
	 * @see es.uah.aut.srg.micobs.svm.svr.VSVRDocument#getApplicableDocumentsSection()
	 * @see #getVSVRDocument()
	 * @generated
	 */
	EReference getVSVRDocument_ApplicableDocumentsSection();

	/**
	 * Returns the meta object for the containment reference '{@link es.uah.aut.srg.micobs.svm.svr.VSVRDocument#getReferenceDocumentsSection <em>Reference Documents Section</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Reference Documents Section</em>'.
	 * @see es.uah.aut.srg.micobs.svm.svr.VSVRDocument#getReferenceDocumentsSection()
	 * @see #getVSVRDocument()
	 * @generated
	 */
	EReference getVSVRDocument_ReferenceDocumentsSection();

	/**
	 * Returns the meta object for the containment reference '{@link es.uah.aut.srg.micobs.svm.svr.VSVRDocument#getTermsDefinitionsAbbreviationsSection <em>Terms Definitions Abbreviations Section</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Terms Definitions Abbreviations Section</em>'.
	 * @see es.uah.aut.srg.micobs.svm.svr.VSVRDocument#getTermsDefinitionsAbbreviationsSection()
	 * @see #getVSVRDocument()
	 * @generated
	 */
	EReference getVSVRDocument_TermsDefinitionsAbbreviationsSection();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.micobs.svm.svr.VSVRTBCsTBDs <em>VSVRTB Cs TB Ds</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>VSVRTB Cs TB Ds</em>'.
	 * @see es.uah.aut.srg.micobs.svm.svr.VSVRTBCsTBDs
	 * @generated
	 */
	EClass getVSVRTBCsTBDs();

	/**
	 * Returns the meta object for the containment reference list '{@link es.uah.aut.srg.micobs.svm.svr.VSVRTBCsTBDs#getTbcs <em>Tbcs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Tbcs</em>'.
	 * @see es.uah.aut.srg.micobs.svm.svr.VSVRTBCsTBDs#getTbcs()
	 * @see #getVSVRTBCsTBDs()
	 * @generated
	 */
	EReference getVSVRTBCsTBDs_Tbcs();

	/**
	 * Returns the meta object for the containment reference list '{@link es.uah.aut.srg.micobs.svm.svr.VSVRTBCsTBDs#getTbds <em>Tbds</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Tbds</em>'.
	 * @see es.uah.aut.srg.micobs.svm.svr.VSVRTBCsTBDs#getTbds()
	 * @see #getVSVRTBCsTBDs()
	 * @generated
	 */
	EReference getVSVRTBCsTBDs_Tbds();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.micobs.svm.svr.VSVRIntroduction <em>VSVR Introduction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>VSVR Introduction</em>'.
	 * @see es.uah.aut.srg.micobs.svm.svr.VSVRIntroduction
	 * @generated
	 */
	EClass getVSVRIntroduction();

	/**
	 * Returns the meta object for the containment reference list '{@link es.uah.aut.srg.micobs.svm.svr.VSVRIntroduction#getSvrInstatiableSubsections <em>Svr Instatiable Subsections</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Svr Instatiable Subsections</em>'.
	 * @see es.uah.aut.srg.micobs.svm.svr.VSVRIntroduction#getSvrInstatiableSubsections()
	 * @see #getVSVRIntroduction()
	 * @generated
	 */
	EReference getVSVRIntroduction_SvrInstatiableSubsections();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.micobs.svm.svr.VSVRApplicableDocuments <em>VSVR Applicable Documents</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>VSVR Applicable Documents</em>'.
	 * @see es.uah.aut.srg.micobs.svm.svr.VSVRApplicableDocuments
	 * @generated
	 */
	EClass getVSVRApplicableDocuments();

	/**
	 * Returns the meta object for the containment reference list '{@link es.uah.aut.srg.micobs.svm.svr.VSVRApplicableDocuments#getApplicableDocuments <em>Applicable Documents</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Applicable Documents</em>'.
	 * @see es.uah.aut.srg.micobs.svm.svr.VSVRApplicableDocuments#getApplicableDocuments()
	 * @see #getVSVRApplicableDocuments()
	 * @generated
	 */
	EReference getVSVRApplicableDocuments_ApplicableDocuments();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.micobs.svm.svr.VSVRReferenceDocuments <em>VSVR Reference Documents</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>VSVR Reference Documents</em>'.
	 * @see es.uah.aut.srg.micobs.svm.svr.VSVRReferenceDocuments
	 * @generated
	 */
	EClass getVSVRReferenceDocuments();

	/**
	 * Returns the meta object for the containment reference list '{@link es.uah.aut.srg.micobs.svm.svr.VSVRReferenceDocuments#getReferenceDocuments <em>Reference Documents</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Reference Documents</em>'.
	 * @see es.uah.aut.srg.micobs.svm.svr.VSVRReferenceDocuments#getReferenceDocuments()
	 * @see #getVSVRReferenceDocuments()
	 * @generated
	 */
	EReference getVSVRReferenceDocuments_ReferenceDocuments();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.micobs.svm.svr.VSVRTermsDefinitionsAbbreviations <em>VSVR Terms Definitions Abbreviations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>VSVR Terms Definitions Abbreviations</em>'.
	 * @see es.uah.aut.srg.micobs.svm.svr.VSVRTermsDefinitionsAbbreviations
	 * @generated
	 */
	EClass getVSVRTermsDefinitionsAbbreviations();

	/**
	 * Returns the meta object for the containment reference list '{@link es.uah.aut.srg.micobs.svm.svr.VSVRTermsDefinitionsAbbreviations#getTerms <em>Terms</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Terms</em>'.
	 * @see es.uah.aut.srg.micobs.svm.svr.VSVRTermsDefinitionsAbbreviations#getTerms()
	 * @see #getVSVRTermsDefinitionsAbbreviations()
	 * @generated
	 */
	EReference getVSVRTermsDefinitionsAbbreviations_Terms();

	/**
	 * Returns the meta object for the containment reference list '{@link es.uah.aut.srg.micobs.svm.svr.VSVRTermsDefinitionsAbbreviations#getDefinitions <em>Definitions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Definitions</em>'.
	 * @see es.uah.aut.srg.micobs.svm.svr.VSVRTermsDefinitionsAbbreviations#getDefinitions()
	 * @see #getVSVRTermsDefinitionsAbbreviations()
	 * @generated
	 */
	EReference getVSVRTermsDefinitionsAbbreviations_Definitions();

	/**
	 * Returns the meta object for the containment reference list '{@link es.uah.aut.srg.micobs.svm.svr.VSVRTermsDefinitionsAbbreviations#getAbbreviations <em>Abbreviations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Abbreviations</em>'.
	 * @see es.uah.aut.srg.micobs.svm.svr.VSVRTermsDefinitionsAbbreviations#getAbbreviations()
	 * @see #getVSVRTermsDefinitionsAbbreviations()
	 * @generated
	 */
	EReference getVSVRTermsDefinitionsAbbreviations_Abbreviations();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.micobs.svm.svr.VSVRAbstractBriefDescription <em>VSVR Abstract Brief Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>VSVR Abstract Brief Description</em>'.
	 * @see es.uah.aut.srg.micobs.svm.svr.VSVRAbstractBriefDescription
	 * @generated
	 */
	EClass getVSVRAbstractBriefDescription();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.micobs.svm.svr.VSVRAbstractBriefDescription#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see es.uah.aut.srg.micobs.svm.svr.VSVRAbstractBriefDescription#getName()
	 * @see #getVSVRAbstractBriefDescription()
	 * @generated
	 */
	EAttribute getVSVRAbstractBriefDescription_Name();

	/**
	 * Returns the meta object for the containment reference '{@link es.uah.aut.srg.micobs.svm.svr.VSVRAbstractBriefDescription#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Description</em>'.
	 * @see es.uah.aut.srg.micobs.svm.svr.VSVRAbstractBriefDescription#getDescription()
	 * @see #getVSVRAbstractBriefDescription()
	 * @generated
	 */
	EReference getVSVRAbstractBriefDescription_Description();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.micobs.svm.svr.VSVRTerm <em>VSVR Term</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>VSVR Term</em>'.
	 * @see es.uah.aut.srg.micobs.svm.svr.VSVRTerm
	 * @generated
	 */
	EClass getVSVRTerm();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.micobs.svm.svr.VSVRDefinition <em>VSVR Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>VSVR Definition</em>'.
	 * @see es.uah.aut.srg.micobs.svm.svr.VSVRDefinition
	 * @generated
	 */
	EClass getVSVRDefinition();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.micobs.svm.svr.VSVRAbbreviation <em>VSVR Abbreviation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>VSVR Abbreviation</em>'.
	 * @see es.uah.aut.srg.micobs.svm.svr.VSVRAbbreviation
	 * @generated
	 */
	EClass getVSVRAbbreviation();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.micobs.svm.svr.VSVRFixedSection <em>VSVR Fixed Section</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>VSVR Fixed Section</em>'.
	 * @see es.uah.aut.srg.micobs.svm.svr.VSVRFixedSection
	 * @generated
	 */
	EClass getVSVRFixedSection();

	/**
	 * Returns the meta object for the containment reference '{@link es.uah.aut.srg.micobs.svm.svr.VSVRFixedSection#getBody <em>Body</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Body</em>'.
	 * @see es.uah.aut.srg.micobs.svm.svr.VSVRFixedSection#getBody()
	 * @see #getVSVRFixedSection()
	 * @generated
	 */
	EReference getVSVRFixedSection_Body();

	/**
	 * Returns the meta object for the containment reference list '{@link es.uah.aut.srg.micobs.svm.svr.VSVRFixedSection#getSvrInstatiableSubsections <em>Svr Instatiable Subsections</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Svr Instatiable Subsections</em>'.
	 * @see es.uah.aut.srg.micobs.svm.svr.VSVRFixedSection#getSvrInstatiableSubsections()
	 * @see #getVSVRFixedSection()
	 * @generated
	 */
	EReference getVSVRFixedSection_SvrInstatiableSubsections();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.micobs.svm.svr.VSVRInstantiableSection <em>VSVR Instantiable Section</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>VSVR Instantiable Section</em>'.
	 * @see es.uah.aut.srg.micobs.svm.svr.VSVRInstantiableSection
	 * @generated
	 */
	EClass getVSVRInstantiableSection();

	/**
	 * Returns the meta object for the containment reference '{@link es.uah.aut.srg.micobs.svm.svr.VSVRInstantiableSection#getBody <em>Body</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Body</em>'.
	 * @see es.uah.aut.srg.micobs.svm.svr.VSVRInstantiableSection#getBody()
	 * @see #getVSVRInstantiableSection()
	 * @generated
	 */
	EReference getVSVRInstantiableSection_Body();

	/**
	 * Returns the meta object for the containment reference list '{@link es.uah.aut.srg.micobs.svm.svr.VSVRInstantiableSection#getSvrInstatiableSubsections <em>Svr Instatiable Subsections</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Svr Instatiable Subsections</em>'.
	 * @see es.uah.aut.srg.micobs.svm.svr.VSVRInstantiableSection#getSvrInstatiableSubsections()
	 * @see #getVSVRInstantiableSection()
	 * @generated
	 */
	EReference getVSVRInstantiableSection_SvrInstatiableSubsections();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	svrFactory getsvrFactory();

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
		 * The meta object literal for the '{@link es.uah.aut.srg.micobs.svm.svr.impl.VSVRDocumentImpl <em>VSVR Document</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uah.aut.srg.micobs.svm.svr.impl.VSVRDocumentImpl
		 * @see es.uah.aut.srg.micobs.svm.svr.impl.svrPackageImpl#getVSVRDocument()
		 * @generated
		 */
		EClass VSVR_DOCUMENT = eINSTANCE.getVSVRDocument();

		/**
		 * The meta object literal for the '<em><b>Svs Parent</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VSVR_DOCUMENT__SVS_PARENT = eINSTANCE.getVSVRDocument_SvsParent();

		/**
		 * The meta object literal for the '<em><b>Tcr Parent</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VSVR_DOCUMENT__TCR_PARENT = eINSTANCE.getVSVRDocument_TcrParent();

		/**
		 * The meta object literal for the '<em><b>Tbcs Tbds Section</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VSVR_DOCUMENT__TBCS_TBDS_SECTION = eINSTANCE.getVSVRDocument_TbcsTbdsSection();

		/**
		 * The meta object literal for the '<em><b>Introduction Section</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VSVR_DOCUMENT__INTRODUCTION_SECTION = eINSTANCE.getVSVRDocument_IntroductionSection();

		/**
		 * The meta object literal for the '<em><b>Applicable Documents Section</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VSVR_DOCUMENT__APPLICABLE_DOCUMENTS_SECTION = eINSTANCE.getVSVRDocument_ApplicableDocumentsSection();

		/**
		 * The meta object literal for the '<em><b>Reference Documents Section</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VSVR_DOCUMENT__REFERENCE_DOCUMENTS_SECTION = eINSTANCE.getVSVRDocument_ReferenceDocumentsSection();

		/**
		 * The meta object literal for the '<em><b>Terms Definitions Abbreviations Section</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VSVR_DOCUMENT__TERMS_DEFINITIONS_ABBREVIATIONS_SECTION = eINSTANCE.getVSVRDocument_TermsDefinitionsAbbreviationsSection();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.micobs.svm.svr.impl.VSVRTBCsTBDsImpl <em>VSVRTB Cs TB Ds</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uah.aut.srg.micobs.svm.svr.impl.VSVRTBCsTBDsImpl
		 * @see es.uah.aut.srg.micobs.svm.svr.impl.svrPackageImpl#getVSVRTBCsTBDs()
		 * @generated
		 */
		EClass VSVRTB_CS_TB_DS = eINSTANCE.getVSVRTBCsTBDs();

		/**
		 * The meta object literal for the '<em><b>Tbcs</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VSVRTB_CS_TB_DS__TBCS = eINSTANCE.getVSVRTBCsTBDs_Tbcs();

		/**
		 * The meta object literal for the '<em><b>Tbds</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VSVRTB_CS_TB_DS__TBDS = eINSTANCE.getVSVRTBCsTBDs_Tbds();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.micobs.svm.svr.impl.VSVRIntroductionImpl <em>VSVR Introduction</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uah.aut.srg.micobs.svm.svr.impl.VSVRIntroductionImpl
		 * @see es.uah.aut.srg.micobs.svm.svr.impl.svrPackageImpl#getVSVRIntroduction()
		 * @generated
		 */
		EClass VSVR_INTRODUCTION = eINSTANCE.getVSVRIntroduction();

		/**
		 * The meta object literal for the '<em><b>Svr Instatiable Subsections</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VSVR_INTRODUCTION__SVR_INSTATIABLE_SUBSECTIONS = eINSTANCE.getVSVRIntroduction_SvrInstatiableSubsections();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.micobs.svm.svr.impl.VSVRApplicableDocumentsImpl <em>VSVR Applicable Documents</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uah.aut.srg.micobs.svm.svr.impl.VSVRApplicableDocumentsImpl
		 * @see es.uah.aut.srg.micobs.svm.svr.impl.svrPackageImpl#getVSVRApplicableDocuments()
		 * @generated
		 */
		EClass VSVR_APPLICABLE_DOCUMENTS = eINSTANCE.getVSVRApplicableDocuments();

		/**
		 * The meta object literal for the '<em><b>Applicable Documents</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VSVR_APPLICABLE_DOCUMENTS__APPLICABLE_DOCUMENTS = eINSTANCE.getVSVRApplicableDocuments_ApplicableDocuments();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.micobs.svm.svr.impl.VSVRReferenceDocumentsImpl <em>VSVR Reference Documents</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uah.aut.srg.micobs.svm.svr.impl.VSVRReferenceDocumentsImpl
		 * @see es.uah.aut.srg.micobs.svm.svr.impl.svrPackageImpl#getVSVRReferenceDocuments()
		 * @generated
		 */
		EClass VSVR_REFERENCE_DOCUMENTS = eINSTANCE.getVSVRReferenceDocuments();

		/**
		 * The meta object literal for the '<em><b>Reference Documents</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VSVR_REFERENCE_DOCUMENTS__REFERENCE_DOCUMENTS = eINSTANCE.getVSVRReferenceDocuments_ReferenceDocuments();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.micobs.svm.svr.impl.VSVRTermsDefinitionsAbbreviationsImpl <em>VSVR Terms Definitions Abbreviations</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uah.aut.srg.micobs.svm.svr.impl.VSVRTermsDefinitionsAbbreviationsImpl
		 * @see es.uah.aut.srg.micobs.svm.svr.impl.svrPackageImpl#getVSVRTermsDefinitionsAbbreviations()
		 * @generated
		 */
		EClass VSVR_TERMS_DEFINITIONS_ABBREVIATIONS = eINSTANCE.getVSVRTermsDefinitionsAbbreviations();

		/**
		 * The meta object literal for the '<em><b>Terms</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VSVR_TERMS_DEFINITIONS_ABBREVIATIONS__TERMS = eINSTANCE.getVSVRTermsDefinitionsAbbreviations_Terms();

		/**
		 * The meta object literal for the '<em><b>Definitions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VSVR_TERMS_DEFINITIONS_ABBREVIATIONS__DEFINITIONS = eINSTANCE.getVSVRTermsDefinitionsAbbreviations_Definitions();

		/**
		 * The meta object literal for the '<em><b>Abbreviations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VSVR_TERMS_DEFINITIONS_ABBREVIATIONS__ABBREVIATIONS = eINSTANCE.getVSVRTermsDefinitionsAbbreviations_Abbreviations();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.micobs.svm.svr.impl.VSVRAbstractBriefDescriptionImpl <em>VSVR Abstract Brief Description</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uah.aut.srg.micobs.svm.svr.impl.VSVRAbstractBriefDescriptionImpl
		 * @see es.uah.aut.srg.micobs.svm.svr.impl.svrPackageImpl#getVSVRAbstractBriefDescription()
		 * @generated
		 */
		EClass VSVR_ABSTRACT_BRIEF_DESCRIPTION = eINSTANCE.getVSVRAbstractBriefDescription();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VSVR_ABSTRACT_BRIEF_DESCRIPTION__NAME = eINSTANCE.getVSVRAbstractBriefDescription_Name();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VSVR_ABSTRACT_BRIEF_DESCRIPTION__DESCRIPTION = eINSTANCE.getVSVRAbstractBriefDescription_Description();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.micobs.svm.svr.impl.VSVRTermImpl <em>VSVR Term</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uah.aut.srg.micobs.svm.svr.impl.VSVRTermImpl
		 * @see es.uah.aut.srg.micobs.svm.svr.impl.svrPackageImpl#getVSVRTerm()
		 * @generated
		 */
		EClass VSVR_TERM = eINSTANCE.getVSVRTerm();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.micobs.svm.svr.impl.VSVRDefinitionImpl <em>VSVR Definition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uah.aut.srg.micobs.svm.svr.impl.VSVRDefinitionImpl
		 * @see es.uah.aut.srg.micobs.svm.svr.impl.svrPackageImpl#getVSVRDefinition()
		 * @generated
		 */
		EClass VSVR_DEFINITION = eINSTANCE.getVSVRDefinition();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.micobs.svm.svr.impl.VSVRAbbreviationImpl <em>VSVR Abbreviation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uah.aut.srg.micobs.svm.svr.impl.VSVRAbbreviationImpl
		 * @see es.uah.aut.srg.micobs.svm.svr.impl.svrPackageImpl#getVSVRAbbreviation()
		 * @generated
		 */
		EClass VSVR_ABBREVIATION = eINSTANCE.getVSVRAbbreviation();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.micobs.svm.svr.impl.VSVRFixedSectionImpl <em>VSVR Fixed Section</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uah.aut.srg.micobs.svm.svr.impl.VSVRFixedSectionImpl
		 * @see es.uah.aut.srg.micobs.svm.svr.impl.svrPackageImpl#getVSVRFixedSection()
		 * @generated
		 */
		EClass VSVR_FIXED_SECTION = eINSTANCE.getVSVRFixedSection();

		/**
		 * The meta object literal for the '<em><b>Body</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VSVR_FIXED_SECTION__BODY = eINSTANCE.getVSVRFixedSection_Body();

		/**
		 * The meta object literal for the '<em><b>Svr Instatiable Subsections</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VSVR_FIXED_SECTION__SVR_INSTATIABLE_SUBSECTIONS = eINSTANCE.getVSVRFixedSection_SvrInstatiableSubsections();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.micobs.svm.svr.impl.VSVRInstantiableSectionImpl <em>VSVR Instantiable Section</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uah.aut.srg.micobs.svm.svr.impl.VSVRInstantiableSectionImpl
		 * @see es.uah.aut.srg.micobs.svm.svr.impl.svrPackageImpl#getVSVRInstantiableSection()
		 * @generated
		 */
		EClass VSVR_INSTANTIABLE_SECTION = eINSTANCE.getVSVRInstantiableSection();

		/**
		 * The meta object literal for the '<em><b>Body</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VSVR_INSTANTIABLE_SECTION__BODY = eINSTANCE.getVSVRInstantiableSection_Body();

		/**
		 * The meta object literal for the '<em><b>Svr Instatiable Subsections</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VSVR_INSTANTIABLE_SECTION__SVR_INSTATIABLE_SUBSECTIONS = eINSTANCE.getVSVRInstantiableSection_SvrInstatiableSubsections();

	}

} //svrPackage
