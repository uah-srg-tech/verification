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

import es.uah.aut.srg.micobs.doctpl.doc.DBody;
import es.uah.aut.srg.micobs.doctpl.doc.DBodyContent;
import es.uah.aut.srg.micobs.doctpl.doc.DDocumentTemplate;
import es.uah.aut.srg.micobs.doctpl.doc.DParagraph;
import es.uah.aut.srg.micobs.doctpl.doc.DSection;

import es.uah.aut.srg.micobs.svm.sss.*;

import es.uah.aut.srg.micobs.svm.tdm.VTraceableDocument;
import es.uah.aut.srg.micobs.svm.tdm.VTraceableDocumentAbstractGroup;
import es.uah.aut.srg.micobs.svm.tdm.VTraceableDocumentAbstractItem;
import es.uah.aut.srg.micobs.svm.tdm.VTraceableDocumentFixedGroup;

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
			public Adapter caseVSSSBriefDescription(VSSSBriefDescription object) {
				return createVSSSBriefDescriptionAdapter();
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
			public Adapter caseVSSSGeneralDescription(VSSSGeneralDescription object) {
				return createVSSSGeneralDescriptionAdapter();
			}
			@Override
			public Adapter caseVSSSSpecificRequirements(VSSSSpecificRequirements object) {
				return createVSSSSpecificRequirementsAdapter();
			}
			@Override
			public Adapter caseVSSSGeneralRequirement(VSSSGeneralRequirement object) {
				return createVSSSGeneralRequirementAdapter();
			}
			@Override
			public Adapter caseVSSSCapabilitiesRequirement(VSSSCapabilitiesRequirement object) {
				return createVSSSCapabilitiesRequirementAdapter();
			}
			@Override
			public Adapter caseVSSSSystemInterfaceRequirement(VSSSSystemInterfaceRequirement object) {
				return createVSSSSystemInterfaceRequirementAdapter();
			}
			@Override
			public Adapter caseVSSSAdaptationMissionizationRequirement(VSSSAdaptationMissionizationRequirement object) {
				return createVSSSAdaptationMissionizationRequirementAdapter();
			}
			@Override
			public Adapter caseVSSSComputerResourceRequirement(VSSSComputerResourceRequirement object) {
				return createVSSSComputerResourceRequirementAdapter();
			}
			@Override
			public Adapter caseVSSSSecurityRequirement(VSSSSecurityRequirement object) {
				return createVSSSSecurityRequirementAdapter();
			}
			@Override
			public Adapter caseVSSSSafetyRequirement(VSSSSafetyRequirement object) {
				return createVSSSSafetyRequirementAdapter();
			}
			@Override
			public Adapter caseVSSSReliabiltyAvailabilityRequirement(VSSSReliabiltyAvailabilityRequirement object) {
				return createVSSSReliabiltyAvailabilityRequirementAdapter();
			}
			@Override
			public Adapter caseVSSSQualityRequirement(VSSSQualityRequirement object) {
				return createVSSSQualityRequirementAdapter();
			}
			@Override
			public Adapter caseVSSSDesignRequirement(VSSSDesignRequirement object) {
				return createVSSSDesignRequirementAdapter();
			}
			@Override
			public Adapter caseVSSSSoftwareOperationsRequirement(VSSSSoftwareOperationsRequirement object) {
				return createVSSSSoftwareOperationsRequirementAdapter();
			}
			@Override
			public Adapter caseVSSSSoftwareMaintenanceRequirement(VSSSSoftwareMaintenanceRequirement object) {
				return createVSSSSoftwareMaintenanceRequirementAdapter();
			}
			@Override
			public Adapter caseVSSSSystemSoftwareObservabilityRequirement(VSSSSystemSoftwareObservabilityRequirement object) {
				return createVSSSSystemSoftwareObservabilityRequirementAdapter();
			}
			@Override
			public Adapter caseVSSSVerificationValidationIntegrationRequirements(VSSSVerificationValidationIntegrationRequirements object) {
				return createVSSSVerificationValidationIntegrationRequirementsAdapter();
			}
			@Override
			public Adapter caseVSSSVerificationValidationProcessRequirement(VSSSVerificationValidationProcessRequirement object) {
				return createVSSSVerificationValidationProcessRequirementAdapter();
			}
			@Override
			public Adapter caseVSSSValidationApproach(VSSSValidationApproach object) {
				return createVSSSValidationApproachAdapter();
			}
			@Override
			public Adapter caseVSSSVerificationRequirement(VSSSVerificationRequirement object) {
				return createVSSSVerificationRequirementAdapter();
			}
			@Override
			public Adapter caseVSSSValidationRequirement(VSSSValidationRequirement object) {
				return createVSSSValidationRequirementAdapter();
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
			public Adapter caseDDocumentTemplate(DDocumentTemplate object) {
				return createDDocumentTemplateAdapter();
			}
			@Override
			public Adapter caseVTraceableDocument(VTraceableDocument object) {
				return createVTraceableDocumentAdapter();
			}
			@Override
			public Adapter caseDBodyContent(DBodyContent object) {
				return createDBodyContentAdapter();
			}
			@Override
			public Adapter caseDParagraph(DParagraph object) {
				return createDParagraphAdapter();
			}
			@Override
			public Adapter caseDSection(DSection object) {
				return createDSectionAdapter();
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
			public Adapter caseVTraceableDocumentAbstractItem(VTraceableDocumentAbstractItem object) {
				return createVTraceableDocumentAbstractItemAdapter();
			}
			@Override
			public Adapter caseDBody(DBody object) {
				return createDBodyAdapter();
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
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.micobs.svm.sss.VSSSBriefDescription <em>VSSS Brief Description</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.uah.aut.srg.micobs.svm.sss.VSSSBriefDescription
	 * @generated
	 */
	public Adapter createVSSSBriefDescriptionAdapter() {
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
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.micobs.svm.sss.VSSSGeneralRequirement <em>VSSS General Requirement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.uah.aut.srg.micobs.svm.sss.VSSSGeneralRequirement
	 * @generated
	 */
	public Adapter createVSSSGeneralRequirementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.micobs.svm.sss.VSSSCapabilitiesRequirement <em>VSSS Capabilities Requirement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.uah.aut.srg.micobs.svm.sss.VSSSCapabilitiesRequirement
	 * @generated
	 */
	public Adapter createVSSSCapabilitiesRequirementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.micobs.svm.sss.VSSSSystemInterfaceRequirement <em>VSSS System Interface Requirement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.uah.aut.srg.micobs.svm.sss.VSSSSystemInterfaceRequirement
	 * @generated
	 */
	public Adapter createVSSSSystemInterfaceRequirementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.micobs.svm.sss.VSSSAdaptationMissionizationRequirement <em>VSSS Adaptation Missionization Requirement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.uah.aut.srg.micobs.svm.sss.VSSSAdaptationMissionizationRequirement
	 * @generated
	 */
	public Adapter createVSSSAdaptationMissionizationRequirementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.micobs.svm.sss.VSSSComputerResourceRequirement <em>VSSS Computer Resource Requirement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.uah.aut.srg.micobs.svm.sss.VSSSComputerResourceRequirement
	 * @generated
	 */
	public Adapter createVSSSComputerResourceRequirementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.micobs.svm.sss.VSSSSecurityRequirement <em>VSSS Security Requirement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.uah.aut.srg.micobs.svm.sss.VSSSSecurityRequirement
	 * @generated
	 */
	public Adapter createVSSSSecurityRequirementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.micobs.svm.sss.VSSSSafetyRequirement <em>VSSS Safety Requirement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.uah.aut.srg.micobs.svm.sss.VSSSSafetyRequirement
	 * @generated
	 */
	public Adapter createVSSSSafetyRequirementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.micobs.svm.sss.VSSSReliabiltyAvailabilityRequirement <em>VSSS Reliabilty Availability Requirement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.uah.aut.srg.micobs.svm.sss.VSSSReliabiltyAvailabilityRequirement
	 * @generated
	 */
	public Adapter createVSSSReliabiltyAvailabilityRequirementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.micobs.svm.sss.VSSSQualityRequirement <em>VSSS Quality Requirement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.uah.aut.srg.micobs.svm.sss.VSSSQualityRequirement
	 * @generated
	 */
	public Adapter createVSSSQualityRequirementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.micobs.svm.sss.VSSSDesignRequirement <em>VSSS Design Requirement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.uah.aut.srg.micobs.svm.sss.VSSSDesignRequirement
	 * @generated
	 */
	public Adapter createVSSSDesignRequirementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.micobs.svm.sss.VSSSSoftwareOperationsRequirement <em>VSSS Software Operations Requirement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.uah.aut.srg.micobs.svm.sss.VSSSSoftwareOperationsRequirement
	 * @generated
	 */
	public Adapter createVSSSSoftwareOperationsRequirementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.micobs.svm.sss.VSSSSoftwareMaintenanceRequirement <em>VSSS Software Maintenance Requirement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.uah.aut.srg.micobs.svm.sss.VSSSSoftwareMaintenanceRequirement
	 * @generated
	 */
	public Adapter createVSSSSoftwareMaintenanceRequirementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.micobs.svm.sss.VSSSSystemSoftwareObservabilityRequirement <em>VSSS System Software Observability Requirement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.uah.aut.srg.micobs.svm.sss.VSSSSystemSoftwareObservabilityRequirement
	 * @generated
	 */
	public Adapter createVSSSSystemSoftwareObservabilityRequirementAdapter() {
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
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.micobs.svm.sss.VSSSVerificationValidationProcessRequirement <em>VSSS Verification Validation Process Requirement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.uah.aut.srg.micobs.svm.sss.VSSSVerificationValidationProcessRequirement
	 * @generated
	 */
	public Adapter createVSSSVerificationValidationProcessRequirementAdapter() {
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
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.micobs.svm.sss.VSSSVerificationRequirement <em>VSSS Verification Requirement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.uah.aut.srg.micobs.svm.sss.VSSSVerificationRequirement
	 * @generated
	 */
	public Adapter createVSSSVerificationRequirementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.micobs.svm.sss.VSSSValidationRequirement <em>VSSS Validation Requirement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.uah.aut.srg.micobs.svm.sss.VSSSValidationRequirement
	 * @generated
	 */
	public Adapter createVSSSValidationRequirementAdapter() {
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
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.micobs.doctpl.doc.DBodyContent <em>DBody Content</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.uah.aut.srg.micobs.doctpl.doc.DBodyContent
	 * @generated
	 */
	public Adapter createDBodyContentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.micobs.doctpl.doc.DParagraph <em>DParagraph</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.uah.aut.srg.micobs.doctpl.doc.DParagraph
	 * @generated
	 */
	public Adapter createDParagraphAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.micobs.doctpl.doc.DSection <em>DSection</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.uah.aut.srg.micobs.doctpl.doc.DSection
	 * @generated
	 */
	public Adapter createDSectionAdapter() {
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
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.micobs.doctpl.doc.DBody <em>DBody</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.uah.aut.srg.micobs.doctpl.doc.DBody
	 * @generated
	 */
	public Adapter createDBodyAdapter() {
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
