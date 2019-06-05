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
package es.uah.aut.srg.micobs.svm.svs.util;

import es.uah.aut.srg.micobs.common.MCommonReferenceableObj;

import es.uah.aut.srg.micobs.doctpl.doc.DAbstractSection;
import es.uah.aut.srg.micobs.doctpl.doc.DDocumentTemplate;
import es.uah.aut.srg.micobs.doctpl.doc.DFixedSection;
import es.uah.aut.srg.micobs.doctpl.doc.DInstantiableSection;

import es.uah.aut.srg.micobs.svm.svs.*;

import es.uah.aut.srg.micobs.svm.vdm.VValidationDocument;
import es.uah.aut.srg.micobs.svm.vdm.VValidationDocumentAbstractGroup;
import es.uah.aut.srg.micobs.svm.vdm.VValidationDocumentAbstractItem;
import es.uah.aut.srg.micobs.svm.vdm.VValidationDocumentFixedGroup;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see es.uah.aut.srg.micobs.svm.svs.svsPackage
 * @generated
 */
public class svsAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static svsPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public svsAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = svsPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected svsSwitch<Adapter> modelSwitch =
		new svsSwitch<Adapter>() {
			@Override
			public Adapter caseVSVSDocument(VSVSDocument object) {
				return createVSVSDocumentAdapter();
			}
			@Override
			public Adapter caseVSVSInstantiableSection(VSVSInstantiableSection object) {
				return createVSVSInstantiableSectionAdapter();
			}
			@Override
			public Adapter caseVSVSIntroduction(VSVSIntroduction object) {
				return createVSVSIntroductionAdapter();
			}
			@Override
			public Adapter caseVSVSApplicableDocuments(VSVSApplicableDocuments object) {
				return createVSVSApplicableDocumentsAdapter();
			}
			@Override
			public Adapter caseVSVSReferenceDocuments(VSVSReferenceDocuments object) {
				return createVSVSReferenceDocumentsAdapter();
			}
			@Override
			public Adapter caseVSVSTermsDefinitionsAbbreviations(VSVSTermsDefinitionsAbbreviations object) {
				return createVSVSTermsDefinitionsAbbreviationsAdapter();
			}
			@Override
			public Adapter caseVSVSAbstractBriefDescription(VSVSAbstractBriefDescription object) {
				return createVSVSAbstractBriefDescriptionAdapter();
			}
			@Override
			public Adapter caseVSVSTerm(VSVSTerm object) {
				return createVSVSTermAdapter();
			}
			@Override
			public Adapter caseVSVSDefinition(VSVSDefinition object) {
				return createVSVSDefinitionAdapter();
			}
			@Override
			public Adapter caseVSVSAbbreviation(VSVSAbbreviation object) {
				return createVSVSAbbreviationAdapter();
			}
			@Override
			public Adapter caseVSVSFixedSection(VSVSFixedSection object) {
				return createVSVSFixedSectionAdapter();
			}
			@Override
			public Adapter caseVSVSSoftwareOverview(VSVSSoftwareOverview object) {
				return createVSVSSoftwareOverviewAdapter();
			}
			@Override
			public Adapter caseVSVSTaskIdentification(VSVSTaskIdentification object) {
				return createVSVSTaskIdentificationAdapter();
			}
			@Override
			public Adapter caseVSVSTestingSpecificationDesign(VSVSTestingSpecificationDesign object) {
				return createVSVSTestingSpecificationDesignAdapter();
			}
			@Override
			public Adapter caseVSVSTestDesign(VSVSTestDesign object) {
				return createVSVSTestDesignAdapter();
			}
			@Override
			public Adapter caseVSVSTestCases(VSVSTestCases object) {
				return createVSVSTestCasesAdapter();
			}
			@Override
			public Adapter caseVSVSTestCase(VSVSTestCase object) {
				return createVSVSTestCaseAdapter();
			}
			@Override
			public Adapter caseVSVSTestProcedures(VSVSTestProcedures object) {
				return createVSVSTestProceduresAdapter();
			}
			@Override
			public Adapter caseVSVSTestProcedure(VSVSTestProcedure object) {
				return createVSVSTestProcedureAdapter();
			}
			@Override
			public Adapter caseVSVSProcedureStep(VSVSProcedureStep object) {
				return createVSVSProcedureStepAdapter();
			}
			@Override
			public Adapter caseVSVSAnalysisInspectionReview(VSVSAnalysisInspectionReview object) {
				return createVSVSAnalysisInspectionReviewAdapter();
			}
			@Override
			public Adapter caseVSVSTestPlatformRequirements(VSVSTestPlatformRequirements object) {
				return createVSVSTestPlatformRequirementsAdapter();
			}
			@Override
			public Adapter caseVSVSAdditionalInformation(VSVSAdditionalInformation object) {
				return createVSVSAdditionalInformationAdapter();
			}
			@Override
			public Adapter caseVValidationDocument(VValidationDocument object) {
				return createVValidationDocumentAdapter();
			}
			@Override
			public Adapter caseDDocumentTemplate(DDocumentTemplate object) {
				return createDDocumentTemplateAdapter();
			}
			@Override
			public Adapter caseDAbstractSection(DAbstractSection object) {
				return createDAbstractSectionAdapter();
			}
			@Override
			public Adapter caseMCommonReferenceableObj(MCommonReferenceableObj object) {
				return createMCommonReferenceableObjAdapter();
			}
			@Override
			public Adapter caseDInstantiableSection(DInstantiableSection object) {
				return createDInstantiableSectionAdapter();
			}
			@Override
			public Adapter caseDFixedSection(DFixedSection object) {
				return createDFixedSectionAdapter();
			}
			@Override
			public Adapter caseVValidationDocumentAbstractGroup(VValidationDocumentAbstractGroup object) {
				return createVValidationDocumentAbstractGroupAdapter();
			}
			@Override
			public Adapter caseVValidationDocumentFixedGroup(VValidationDocumentFixedGroup object) {
				return createVValidationDocumentFixedGroupAdapter();
			}
			@Override
			public Adapter caseVValidationDocumentAbstractItem(VValidationDocumentAbstractItem object) {
				return createVValidationDocumentAbstractItemAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.micobs.svm.svs.VSVSDocument <em>VSVS Document</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.uah.aut.srg.micobs.svm.svs.VSVSDocument
	 * @generated
	 */
	public Adapter createVSVSDocumentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.micobs.svm.svs.VSVSInstantiableSection <em>VSVS Instantiable Section</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.uah.aut.srg.micobs.svm.svs.VSVSInstantiableSection
	 * @generated
	 */
	public Adapter createVSVSInstantiableSectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.micobs.svm.svs.VSVSIntroduction <em>VSVS Introduction</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.uah.aut.srg.micobs.svm.svs.VSVSIntroduction
	 * @generated
	 */
	public Adapter createVSVSIntroductionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.micobs.svm.svs.VSVSApplicableDocuments <em>VSVS Applicable Documents</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.uah.aut.srg.micobs.svm.svs.VSVSApplicableDocuments
	 * @generated
	 */
	public Adapter createVSVSApplicableDocumentsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.micobs.svm.svs.VSVSReferenceDocuments <em>VSVS Reference Documents</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.uah.aut.srg.micobs.svm.svs.VSVSReferenceDocuments
	 * @generated
	 */
	public Adapter createVSVSReferenceDocumentsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.micobs.svm.svs.VSVSTermsDefinitionsAbbreviations <em>VSVS Terms Definitions Abbreviations</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.uah.aut.srg.micobs.svm.svs.VSVSTermsDefinitionsAbbreviations
	 * @generated
	 */
	public Adapter createVSVSTermsDefinitionsAbbreviationsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.micobs.svm.svs.VSVSAbstractBriefDescription <em>VSVS Abstract Brief Description</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.uah.aut.srg.micobs.svm.svs.VSVSAbstractBriefDescription
	 * @generated
	 */
	public Adapter createVSVSAbstractBriefDescriptionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.micobs.svm.svs.VSVSTerm <em>VSVS Term</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.uah.aut.srg.micobs.svm.svs.VSVSTerm
	 * @generated
	 */
	public Adapter createVSVSTermAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.micobs.svm.svs.VSVSDefinition <em>VSVS Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.uah.aut.srg.micobs.svm.svs.VSVSDefinition
	 * @generated
	 */
	public Adapter createVSVSDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.micobs.svm.svs.VSVSAbbreviation <em>VSVS Abbreviation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.uah.aut.srg.micobs.svm.svs.VSVSAbbreviation
	 * @generated
	 */
	public Adapter createVSVSAbbreviationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.micobs.svm.svs.VSVSFixedSection <em>VSVS Fixed Section</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.uah.aut.srg.micobs.svm.svs.VSVSFixedSection
	 * @generated
	 */
	public Adapter createVSVSFixedSectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.micobs.svm.svs.VSVSSoftwareOverview <em>VSVS Software Overview</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.uah.aut.srg.micobs.svm.svs.VSVSSoftwareOverview
	 * @generated
	 */
	public Adapter createVSVSSoftwareOverviewAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.micobs.svm.svs.VSVSTaskIdentification <em>VSVS Task Identification</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.uah.aut.srg.micobs.svm.svs.VSVSTaskIdentification
	 * @generated
	 */
	public Adapter createVSVSTaskIdentificationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.micobs.svm.svs.VSVSTestingSpecificationDesign <em>VSVS Testing Specification Design</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.uah.aut.srg.micobs.svm.svs.VSVSTestingSpecificationDesign
	 * @generated
	 */
	public Adapter createVSVSTestingSpecificationDesignAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.micobs.svm.svs.VSVSTestDesign <em>VSVS Test Design</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.uah.aut.srg.micobs.svm.svs.VSVSTestDesign
	 * @generated
	 */
	public Adapter createVSVSTestDesignAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.micobs.svm.svs.VSVSTestCases <em>VSVS Test Cases</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.uah.aut.srg.micobs.svm.svs.VSVSTestCases
	 * @generated
	 */
	public Adapter createVSVSTestCasesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.micobs.svm.svs.VSVSTestCase <em>VSVS Test Case</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.uah.aut.srg.micobs.svm.svs.VSVSTestCase
	 * @generated
	 */
	public Adapter createVSVSTestCaseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.micobs.svm.svs.VSVSTestProcedures <em>VSVS Test Procedures</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.uah.aut.srg.micobs.svm.svs.VSVSTestProcedures
	 * @generated
	 */
	public Adapter createVSVSTestProceduresAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.micobs.svm.svs.VSVSTestProcedure <em>VSVS Test Procedure</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.uah.aut.srg.micobs.svm.svs.VSVSTestProcedure
	 * @generated
	 */
	public Adapter createVSVSTestProcedureAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.micobs.svm.svs.VSVSProcedureStep <em>VSVS Procedure Step</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.uah.aut.srg.micobs.svm.svs.VSVSProcedureStep
	 * @generated
	 */
	public Adapter createVSVSProcedureStepAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.micobs.svm.svs.VSVSAnalysisInspectionReview <em>VSVS Analysis Inspection Review</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.uah.aut.srg.micobs.svm.svs.VSVSAnalysisInspectionReview
	 * @generated
	 */
	public Adapter createVSVSAnalysisInspectionReviewAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.micobs.svm.svs.VSVSTestPlatformRequirements <em>VSVS Test Platform Requirements</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.uah.aut.srg.micobs.svm.svs.VSVSTestPlatformRequirements
	 * @generated
	 */
	public Adapter createVSVSTestPlatformRequirementsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.micobs.svm.svs.VSVSAdditionalInformation <em>VSVS Additional Information</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.uah.aut.srg.micobs.svm.svs.VSVSAdditionalInformation
	 * @generated
	 */
	public Adapter createVSVSAdditionalInformationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.micobs.svm.vdm.VValidationDocument <em>VValidation Document</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.uah.aut.srg.micobs.svm.vdm.VValidationDocument
	 * @generated
	 */
	public Adapter createVValidationDocumentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.micobs.doctpl.doc.DDocumentTemplate <em>DDocument Template</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.uah.aut.srg.micobs.doctpl.doc.DDocumentTemplate
	 * @generated
	 */
	public Adapter createDDocumentTemplateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.micobs.doctpl.doc.DAbstractSection <em>DAbstract Section</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.uah.aut.srg.micobs.doctpl.doc.DAbstractSection
	 * @generated
	 */
	public Adapter createDAbstractSectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.micobs.common.MCommonReferenceableObj <em>MCommon Referenceable Obj</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.uah.aut.srg.micobs.common.MCommonReferenceableObj
	 * @generated
	 */
	public Adapter createMCommonReferenceableObjAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.micobs.doctpl.doc.DInstantiableSection <em>DInstantiable Section</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.uah.aut.srg.micobs.doctpl.doc.DInstantiableSection
	 * @generated
	 */
	public Adapter createDInstantiableSectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.micobs.doctpl.doc.DFixedSection <em>DFixed Section</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.uah.aut.srg.micobs.doctpl.doc.DFixedSection
	 * @generated
	 */
	public Adapter createDFixedSectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.micobs.svm.vdm.VValidationDocumentAbstractGroup <em>VValidation Document Abstract Group</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.uah.aut.srg.micobs.svm.vdm.VValidationDocumentAbstractGroup
	 * @generated
	 */
	public Adapter createVValidationDocumentAbstractGroupAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.micobs.svm.vdm.VValidationDocumentFixedGroup <em>VValidation Document Fixed Group</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.uah.aut.srg.micobs.svm.vdm.VValidationDocumentFixedGroup
	 * @generated
	 */
	public Adapter createVValidationDocumentFixedGroupAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.micobs.svm.vdm.VValidationDocumentAbstractItem <em>VValidation Document Abstract Item</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.uah.aut.srg.micobs.svm.vdm.VValidationDocumentAbstractItem
	 * @generated
	 */
	public Adapter createVValidationDocumentAbstractItemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //svsAdapterFactory
