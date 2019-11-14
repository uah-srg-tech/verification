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
package es.uah.aut.srg.micobs.svm.sss.util;

import es.uah.aut.srg.micobs.common.MCommonReferenceableObj;
import es.uah.aut.srg.micobs.doctpl.doctpl.DAbstractSection;
import es.uah.aut.srg.micobs.doctpl.doctpl.DDocumentTemplate;
import es.uah.aut.srg.micobs.doctpl.doctpl.DFixedSection;
import es.uah.aut.srg.micobs.doctpl.doctpl.DInstantiableSection;
import es.uah.aut.srg.micobs.svm.sss.*;

import es.uah.aut.srg.micobs.svm.tdm.VTraceableDocument;
import es.uah.aut.srg.micobs.svm.tdm.VTraceableDocumentAbstractGroup;
import es.uah.aut.srg.micobs.svm.tdm.VTraceableDocumentAbstractItem;
import es.uah.aut.srg.micobs.svm.tdm.VTraceableDocumentFixedGroup;
import es.uah.aut.srg.micobs.svm.tdm.VTraceableDocumentInstantiableGroup;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see es.uah.aut.srg.micobs.svm.sss.sssPackage
 * @generated
 */
public class sssAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static sssPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public sssAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = sssPackage.eINSTANCE;
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
	protected sssSwitch<Adapter> modelSwitch =
		new sssSwitch<Adapter>() {
			@Override
			public Adapter caseVSSSDocument(VSSSDocument object) {
				return createVSSSDocumentAdapter();
			}
			@Override
			public Adapter caseVSSSIntroduction(VSSSIntroduction object) {
				return createVSSSIntroductionAdapter();
			}
			@Override
			public Adapter caseVSSSApplicableDocuments(VSSSApplicableDocuments object) {
				return createVSSSApplicableDocumentsAdapter();
			}
			@Override
			public Adapter caseVSSSReferenceDocuments(VSSSReferenceDocuments object) {
				return createVSSSReferenceDocumentsAdapter();
			}
			@Override
			public Adapter caseVSSSTermsDefinitionsAbbreviations(VSSSTermsDefinitionsAbbreviations object) {
				return createVSSSTermsDefinitionsAbbreviationsAdapter();
			}
			@Override
			public Adapter caseVSSSAbstractBriefDescription(VSSSAbstractBriefDescription object) {
				return createVSSSAbstractBriefDescriptionAdapter();
			}
			@Override
			public Adapter caseVSSSTerm(VSSSTerm object) {
				return createVSSSTermAdapter();
			}
			@Override
			public Adapter caseVSSSDefinition(VSSSDefinition object) {
				return createVSSSDefinitionAdapter();
			}
			@Override
			public Adapter caseVSSSAbbreviation(VSSSAbbreviation object) {
				return createVSSSAbbreviationAdapter();
			}
			@Override
			public Adapter caseVSSSFixedSection(VSSSFixedSection object) {
				return createVSSSFixedSectionAdapter();
			}
			@Override
			public Adapter caseVSSSInstantiableSection(VSSSInstantiableSection object) {
				return createVSSSInstantiableSectionAdapter();
			}
			@Override
			public Adapter caseVSSSGeneralDescription(VSSSGeneralDescription object) {
				return createVSSSGeneralDescriptionAdapter();
			}
			@Override
			public Adapter caseVSSSAbstractRequirementSection(VSSSAbstractRequirementSection object) {
				return createVSSSAbstractRequirementSectionAdapter();
			}
			@Override
			public Adapter caseVSSSInstantiableRequirementSection(VSSSInstantiableRequirementSection object) {
				return createVSSSInstantiableRequirementSectionAdapter();
			}
			@Override
			public Adapter caseVSSSSpecificRequirements(VSSSSpecificRequirements object) {
				return createVSSSSpecificRequirementsAdapter();
			}
			@Override
			public Adapter caseVSSSGeneralRequirements(VSSSGeneralRequirements object) {
				return createVSSSGeneralRequirementsAdapter();
			}
			@Override
			public Adapter caseVSSSCapabilitiesRequirements(VSSSCapabilitiesRequirements object) {
				return createVSSSCapabilitiesRequirementsAdapter();
			}
			@Override
			public Adapter caseVSSSSystemInterfaceRequirements(VSSSSystemInterfaceRequirements object) {
				return createVSSSSystemInterfaceRequirementsAdapter();
			}
			@Override
			public Adapter caseVSSSAdaptationMissionizationRequirements(VSSSAdaptationMissionizationRequirements object) {
				return createVSSSAdaptationMissionizationRequirementsAdapter();
			}
			@Override
			public Adapter caseVSSSComputerResourceRequirements(VSSSComputerResourceRequirements object) {
				return createVSSSComputerResourceRequirementsAdapter();
			}
			@Override
			public Adapter caseVSSSSecurityRequirements(VSSSSecurityRequirements object) {
				return createVSSSSecurityRequirementsAdapter();
			}
			@Override
			public Adapter caseVSSSSafetyRequirements(VSSSSafetyRequirements object) {
				return createVSSSSafetyRequirementsAdapter();
			}
			@Override
			public Adapter caseVSSSReliabilityAvailabilityRequirements(VSSSReliabilityAvailabilityRequirements object) {
				return createVSSSReliabilityAvailabilityRequirementsAdapter();
			}
			@Override
			public Adapter caseVSSSQualityRequirements(VSSSQualityRequirements object) {
				return createVSSSQualityRequirementsAdapter();
			}
			@Override
			public Adapter caseVSSSDesignRequirements(VSSSDesignRequirements object) {
				return createVSSSDesignRequirementsAdapter();
			}
			@Override
			public Adapter caseVSSSSoftwareOperationsRequirements(VSSSSoftwareOperationsRequirements object) {
				return createVSSSSoftwareOperationsRequirementsAdapter();
			}
			@Override
			public Adapter caseVSSSSoftwareMaintenanceRequirements(VSSSSoftwareMaintenanceRequirements object) {
				return createVSSSSoftwareMaintenanceRequirementsAdapter();
			}
			@Override
			public Adapter caseVSSSSystemSoftwareObservabilityRequirements(VSSSSystemSoftwareObservabilityRequirements object) {
				return createVSSSSystemSoftwareObservabilityRequirementsAdapter();
			}
			@Override
			public Adapter caseVSSSVerificationValidationIntegrationRequirements(VSSSVerificationValidationIntegrationRequirements object) {
				return createVSSSVerificationValidationIntegrationRequirementsAdapter();
			}
			@Override
			public Adapter caseVSSSVerificationValidationProcessRequirements(VSSSVerificationValidationProcessRequirements object) {
				return createVSSSVerificationValidationProcessRequirementsAdapter();
			}
			@Override
			public Adapter caseVSSSValidationApproach(VSSSValidationApproach object) {
				return createVSSSValidationApproachAdapter();
			}
			@Override
			public Adapter caseVSSSVerificationRequirements(VSSSVerificationRequirements object) {
				return createVSSSVerificationRequirementsAdapter();
			}
			@Override
			public Adapter caseVSSSValidationRequirements(VSSSValidationRequirements object) {
				return createVSSSValidationRequirementsAdapter();
			}
			@Override
			public Adapter caseVSSSDocumentItem(VSSSDocumentItem object) {
				return createVSSSDocumentItemAdapter();
			}
			@Override
			public Adapter caseVSSSSystemModels(VSSSSystemModels object) {
				return createVSSSSystemModelsAdapter();
			}
			@Override
			public Adapter caseVSSSSystemModel(VSSSSystemModel object) {
				return createVSSSSystemModelAdapter();
			}
			@Override
			public Adapter caseVTraceableDocument(VTraceableDocument object) {
				return createVTraceableDocumentAdapter();
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
			public Adapter caseDFixedSection(DFixedSection object) {
				return createDFixedSectionAdapter();
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
			public Adapter caseVTraceableDocumentAbstractGroup(VTraceableDocumentAbstractGroup object) {
				return createVTraceableDocumentAbstractGroupAdapter();
			}
			@Override
			public Adapter caseVTraceableDocumentFixedGroup(VTraceableDocumentFixedGroup object) {
				return createVTraceableDocumentFixedGroupAdapter();
			}
			@Override
			public Adapter caseVTraceableDocumentInstantiableGroup(VTraceableDocumentInstantiableGroup object) {
				return createVTraceableDocumentInstantiableGroupAdapter();
			}
			@Override
			public Adapter caseVTraceableDocumentAbstractItem(VTraceableDocumentAbstractItem object) {
				return createVTraceableDocumentAbstractItemAdapter();
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
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.micobs.svm.sss.VSSSDocument <em>VSSS Document</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.uah.aut.srg.micobs.svm.sss.VSSSDocument
	 * @generated
	 */
	public Adapter createVSSSDocumentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.micobs.svm.sss.VSSSIntroduction <em>VSSS Introduction</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.uah.aut.srg.micobs.svm.sss.VSSSIntroduction
	 * @generated
	 */
	public Adapter createVSSSIntroductionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.micobs.svm.sss.VSSSApplicableDocuments <em>VSSS Applicable Documents</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.uah.aut.srg.micobs.svm.sss.VSSSApplicableDocuments
	 * @generated
	 */
	public Adapter createVSSSApplicableDocumentsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.micobs.svm.sss.VSSSReferenceDocuments <em>VSSS Reference Documents</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.uah.aut.srg.micobs.svm.sss.VSSSReferenceDocuments
	 * @generated
	 */
	public Adapter createVSSSReferenceDocumentsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.micobs.svm.sss.VSSSTermsDefinitionsAbbreviations <em>VSSS Terms Definitions Abbreviations</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.uah.aut.srg.micobs.svm.sss.VSSSTermsDefinitionsAbbreviations
	 * @generated
	 */
	public Adapter createVSSSTermsDefinitionsAbbreviationsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.micobs.svm.sss.VSSSAbstractBriefDescription <em>VSSS Abstract Brief Description</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.uah.aut.srg.micobs.svm.sss.VSSSAbstractBriefDescription
	 * @generated
	 */
	public Adapter createVSSSAbstractBriefDescriptionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.micobs.svm.sss.VSSSTerm <em>VSSS Term</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.uah.aut.srg.micobs.svm.sss.VSSSTerm
	 * @generated
	 */
	public Adapter createVSSSTermAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.micobs.svm.sss.VSSSDefinition <em>VSSS Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.uah.aut.srg.micobs.svm.sss.VSSSDefinition
	 * @generated
	 */
	public Adapter createVSSSDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.micobs.svm.sss.VSSSAbbreviation <em>VSSS Abbreviation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.uah.aut.srg.micobs.svm.sss.VSSSAbbreviation
	 * @generated
	 */
	public Adapter createVSSSAbbreviationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.micobs.svm.sss.VSSSFixedSection <em>VSSS Fixed Section</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.uah.aut.srg.micobs.svm.sss.VSSSFixedSection
	 * @generated
	 */
	public Adapter createVSSSFixedSectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.micobs.svm.sss.VSSSInstantiableSection <em>VSSS Instantiable Section</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.uah.aut.srg.micobs.svm.sss.VSSSInstantiableSection
	 * @generated
	 */
	public Adapter createVSSSInstantiableSectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.micobs.svm.sss.VSSSGeneralDescription <em>VSSS General Description</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.uah.aut.srg.micobs.svm.sss.VSSSGeneralDescription
	 * @generated
	 */
	public Adapter createVSSSGeneralDescriptionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.micobs.svm.sss.VSSSAbstractRequirementSection <em>VSSS Abstract Requirement Section</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.uah.aut.srg.micobs.svm.sss.VSSSAbstractRequirementSection
	 * @generated
	 */
	public Adapter createVSSSAbstractRequirementSectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.micobs.svm.sss.VSSSInstantiableRequirementSection <em>VSSS Instantiable Requirement Section</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.uah.aut.srg.micobs.svm.sss.VSSSInstantiableRequirementSection
	 * @generated
	 */
	public Adapter createVSSSInstantiableRequirementSectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.micobs.svm.sss.VSSSSpecificRequirements <em>VSSS Specific Requirements</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.uah.aut.srg.micobs.svm.sss.VSSSSpecificRequirements
	 * @generated
	 */
	public Adapter createVSSSSpecificRequirementsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.micobs.svm.sss.VSSSGeneralRequirements <em>VSSS General Requirements</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.uah.aut.srg.micobs.svm.sss.VSSSGeneralRequirements
	 * @generated
	 */
	public Adapter createVSSSGeneralRequirementsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.micobs.svm.sss.VSSSCapabilitiesRequirements <em>VSSS Capabilities Requirements</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.uah.aut.srg.micobs.svm.sss.VSSSCapabilitiesRequirements
	 * @generated
	 */
	public Adapter createVSSSCapabilitiesRequirementsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.micobs.svm.sss.VSSSSystemInterfaceRequirements <em>VSSS System Interface Requirements</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.uah.aut.srg.micobs.svm.sss.VSSSSystemInterfaceRequirements
	 * @generated
	 */
	public Adapter createVSSSSystemInterfaceRequirementsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.micobs.svm.sss.VSSSAdaptationMissionizationRequirements <em>VSSS Adaptation Missionization Requirements</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.uah.aut.srg.micobs.svm.sss.VSSSAdaptationMissionizationRequirements
	 * @generated
	 */
	public Adapter createVSSSAdaptationMissionizationRequirementsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.micobs.svm.sss.VSSSComputerResourceRequirements <em>VSSS Computer Resource Requirements</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.uah.aut.srg.micobs.svm.sss.VSSSComputerResourceRequirements
	 * @generated
	 */
	public Adapter createVSSSComputerResourceRequirementsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.micobs.svm.sss.VSSSSecurityRequirements <em>VSSS Security Requirements</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.uah.aut.srg.micobs.svm.sss.VSSSSecurityRequirements
	 * @generated
	 */
	public Adapter createVSSSSecurityRequirementsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.micobs.svm.sss.VSSSSafetyRequirements <em>VSSS Safety Requirements</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.uah.aut.srg.micobs.svm.sss.VSSSSafetyRequirements
	 * @generated
	 */
	public Adapter createVSSSSafetyRequirementsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.micobs.svm.sss.VSSSReliabilityAvailabilityRequirements <em>VSSS Reliability Availability Requirements</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.uah.aut.srg.micobs.svm.sss.VSSSReliabilityAvailabilityRequirements
	 * @generated
	 */
	public Adapter createVSSSReliabilityAvailabilityRequirementsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.micobs.svm.sss.VSSSQualityRequirements <em>VSSS Quality Requirements</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.uah.aut.srg.micobs.svm.sss.VSSSQualityRequirements
	 * @generated
	 */
	public Adapter createVSSSQualityRequirementsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.micobs.svm.sss.VSSSDesignRequirements <em>VSSS Design Requirements</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.uah.aut.srg.micobs.svm.sss.VSSSDesignRequirements
	 * @generated
	 */
	public Adapter createVSSSDesignRequirementsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.micobs.svm.sss.VSSSSoftwareOperationsRequirements <em>VSSS Software Operations Requirements</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.uah.aut.srg.micobs.svm.sss.VSSSSoftwareOperationsRequirements
	 * @generated
	 */
	public Adapter createVSSSSoftwareOperationsRequirementsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.micobs.svm.sss.VSSSSoftwareMaintenanceRequirements <em>VSSS Software Maintenance Requirements</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.uah.aut.srg.micobs.svm.sss.VSSSSoftwareMaintenanceRequirements
	 * @generated
	 */
	public Adapter createVSSSSoftwareMaintenanceRequirementsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.micobs.svm.sss.VSSSSystemSoftwareObservabilityRequirements <em>VSSS System Software Observability Requirements</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.uah.aut.srg.micobs.svm.sss.VSSSSystemSoftwareObservabilityRequirements
	 * @generated
	 */
	public Adapter createVSSSSystemSoftwareObservabilityRequirementsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.micobs.svm.sss.VSSSVerificationValidationIntegrationRequirements <em>VSSS Verification Validation Integration Requirements</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.uah.aut.srg.micobs.svm.sss.VSSSVerificationValidationIntegrationRequirements
	 * @generated
	 */
	public Adapter createVSSSVerificationValidationIntegrationRequirementsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.micobs.svm.sss.VSSSVerificationValidationProcessRequirements <em>VSSS Verification Validation Process Requirements</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.uah.aut.srg.micobs.svm.sss.VSSSVerificationValidationProcessRequirements
	 * @generated
	 */
	public Adapter createVSSSVerificationValidationProcessRequirementsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.micobs.svm.sss.VSSSValidationApproach <em>VSSS Validation Approach</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.uah.aut.srg.micobs.svm.sss.VSSSValidationApproach
	 * @generated
	 */
	public Adapter createVSSSValidationApproachAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.micobs.svm.sss.VSSSVerificationRequirements <em>VSSS Verification Requirements</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.uah.aut.srg.micobs.svm.sss.VSSSVerificationRequirements
	 * @generated
	 */
	public Adapter createVSSSVerificationRequirementsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.micobs.svm.sss.VSSSValidationRequirements <em>VSSS Validation Requirements</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.uah.aut.srg.micobs.svm.sss.VSSSValidationRequirements
	 * @generated
	 */
	public Adapter createVSSSValidationRequirementsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.micobs.svm.sss.VSSSDocumentItem <em>VSSS Document Item</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.uah.aut.srg.micobs.svm.sss.VSSSDocumentItem
	 * @generated
	 */
	public Adapter createVSSSDocumentItemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.micobs.svm.sss.VSSSSystemModels <em>VSSS System Models</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.uah.aut.srg.micobs.svm.sss.VSSSSystemModels
	 * @generated
	 */
	public Adapter createVSSSSystemModelsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.micobs.svm.sss.VSSSSystemModel <em>VSSS System Model</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.uah.aut.srg.micobs.svm.sss.VSSSSystemModel
	 * @generated
	 */
	public Adapter createVSSSSystemModelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.micobs.svm.tdm.VTraceableDocument <em>VTraceable Document</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.uah.aut.srg.micobs.svm.tdm.VTraceableDocument
	 * @generated
	 */
	public Adapter createVTraceableDocumentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.micobs.doctpl.doctpl.DDocumentTemplate <em>DDocument Template</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.uah.aut.srg.micobs.doctpl.doctpl.DDocumentTemplate
	 * @generated
	 */
	public Adapter createDDocumentTemplateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.micobs.doctpl.doctpl.DAbstractSection <em>DAbstract Section</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.uah.aut.srg.micobs.doctpl.doctpl.DAbstractSection
	 * @generated
	 */
	public Adapter createDAbstractSectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.micobs.doctpl.doctpl.DFixedSection <em>DFixed Section</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.uah.aut.srg.micobs.doctpl.doctpl.DFixedSection
	 * @generated
	 */
	public Adapter createDFixedSectionAdapter() {
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
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.micobs.doctpl.doctpl.DInstantiableSection <em>DInstantiable Section</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.uah.aut.srg.micobs.doctpl.doctpl.DInstantiableSection
	 * @generated
	 */
	public Adapter createDInstantiableSectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.micobs.svm.tdm.VTraceableDocumentAbstractGroup <em>VTraceable Document Abstract Group</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.uah.aut.srg.micobs.svm.tdm.VTraceableDocumentAbstractGroup
	 * @generated
	 */
	public Adapter createVTraceableDocumentAbstractGroupAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.micobs.svm.tdm.VTraceableDocumentFixedGroup <em>VTraceable Document Fixed Group</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.uah.aut.srg.micobs.svm.tdm.VTraceableDocumentFixedGroup
	 * @generated
	 */
	public Adapter createVTraceableDocumentFixedGroupAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.micobs.svm.tdm.VTraceableDocumentInstantiableGroup <em>VTraceable Document Instantiable Group</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.uah.aut.srg.micobs.svm.tdm.VTraceableDocumentInstantiableGroup
	 * @generated
	 */
	public Adapter createVTraceableDocumentInstantiableGroupAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.micobs.svm.tdm.VTraceableDocumentAbstractItem <em>VTraceable Document Abstract Item</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.uah.aut.srg.micobs.svm.tdm.VTraceableDocumentAbstractItem
	 * @generated
	 */
	public Adapter createVTraceableDocumentAbstractItemAdapter() {
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

} //sssAdapterFactory
