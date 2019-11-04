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
package es.uah.aut.srg.micobs.svm.srs.util;

import es.uah.aut.srg.micobs.common.MCommonReferenceableObj;
import es.uah.aut.srg.micobs.svm.srs.*;

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
 * @see es.uah.aut.srg.micobs.svm.srs.srsPackage
 * @generated
 */
public class srsAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static srsPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public srsAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = srsPackage.eINSTANCE;
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
	protected srsSwitch<Adapter> modelSwitch =
		new srsSwitch<Adapter>() {
			@Override
			public Adapter caseVSRSDocument(VSRSDocument object) {
				return createVSRSDocumentAdapter();
			}
			@Override
			public Adapter caseVSRSIntroduction(VSRSIntroduction object) {
				return createVSRSIntroductionAdapter();
			}
			@Override
			public Adapter caseVSRSApplicableDocuments(VSRSApplicableDocuments object) {
				return createVSRSApplicableDocumentsAdapter();
			}
			@Override
			public Adapter caseVSRSReferenceDocuments(VSRSReferenceDocuments object) {
				return createVSRSReferenceDocumentsAdapter();
			}
			@Override
			public Adapter caseVSRSTermsDefinitionsAbbreviations(VSRSTermsDefinitionsAbbreviations object) {
				return createVSRSTermsDefinitionsAbbreviationsAdapter();
			}
			@Override
			public Adapter caseVSRSAbstractBriefDescription(VSRSAbstractBriefDescription object) {
				return createVSRSAbstractBriefDescriptionAdapter();
			}
			@Override
			public Adapter caseVSRSTerm(VSRSTerm object) {
				return createVSRSTermAdapter();
			}
			@Override
			public Adapter caseVSRSDefinition(VSRSDefinition object) {
				return createVSRSDefinitionAdapter();
			}
			@Override
			public Adapter caseVSRSAbbreviation(VSRSAbbreviation object) {
				return createVSRSAbbreviationAdapter();
			}
			@Override
			public Adapter caseVSRSFixedSection(VSRSFixedSection object) {
				return createVSRSFixedSectionAdapter();
			}
			@Override
			public Adapter caseVSRSInstantiableSection(VSRSInstantiableSection object) {
				return createVSRSInstantiableSectionAdapter();
			}
			@Override
			public Adapter caseVSRSSoftwareOverview(VSRSSoftwareOverview object) {
				return createVSRSSoftwareOverviewAdapter();
			}
			@Override
			public Adapter caseVSRSAbstractRequirementSection(VSRSAbstractRequirementSection object) {
				return createVSRSAbstractRequirementSectionAdapter();
			}
			@Override
			public Adapter caseVSRSInstantiableRequirementSection(VSRSInstantiableRequirementSection object) {
				return createVSRSInstantiableRequirementSectionAdapter();
			}
			@Override
			public Adapter caseVSRSRequirements(VSRSRequirements object) {
				return createVSRSRequirementsAdapter();
			}
			@Override
			public Adapter caseVSRSGeneralRequirements(VSRSGeneralRequirements object) {
				return createVSRSGeneralRequirementsAdapter();
			}
			@Override
			public Adapter caseVSRSFunctionalRequirements(VSRSFunctionalRequirements object) {
				return createVSRSFunctionalRequirementsAdapter();
			}
			@Override
			public Adapter caseVSRSPerformanceRequirements(VSRSPerformanceRequirements object) {
				return createVSRSPerformanceRequirementsAdapter();
			}
			@Override
			public Adapter caseVSRSInterfaceRequirements(VSRSInterfaceRequirements object) {
				return createVSRSInterfaceRequirementsAdapter();
			}
			@Override
			public Adapter caseVSRSOperationalRequirements(VSRSOperationalRequirements object) {
				return createVSRSOperationalRequirementsAdapter();
			}
			@Override
			public Adapter caseVSRSResourcesRequirements(VSRSResourcesRequirements object) {
				return createVSRSResourcesRequirementsAdapter();
			}
			@Override
			public Adapter caseVSRSDesignRequirements(VSRSDesignRequirements object) {
				return createVSRSDesignRequirementsAdapter();
			}
			@Override
			public Adapter caseVSRSSecurityPrivacyRequirements(VSRSSecurityPrivacyRequirements object) {
				return createVSRSSecurityPrivacyRequirementsAdapter();
			}
			@Override
			public Adapter caseVSRSPortabilityRequirements(VSRSPortabilityRequirements object) {
				return createVSRSPortabilityRequirementsAdapter();
			}
			@Override
			public Adapter caseVSRSSWQualityRequirements(VSRSSWQualityRequirements object) {
				return createVSRSSWQualityRequirementsAdapter();
			}
			@Override
			public Adapter caseVSRSSWReliabilityRequirements(VSRSSWReliabilityRequirements object) {
				return createVSRSSWReliabilityRequirementsAdapter();
			}
			@Override
			public Adapter caseVSRSSWMaintainabilityRequirements(VSRSSWMaintainabilityRequirements object) {
				return createVSRSSWMaintainabilityRequirementsAdapter();
			}
			@Override
			public Adapter caseVSRSSWSafetyRequirements(VSRSSWSafetyRequirements object) {
				return createVSRSSWSafetyRequirementsAdapter();
			}
			@Override
			public Adapter caseVSRSSWConfigurationDeliveryRequirements(VSRSSWConfigurationDeliveryRequirements object) {
				return createVSRSSWConfigurationDeliveryRequirementsAdapter();
			}
			@Override
			public Adapter caseVSRSDataDefinitionDBRequirements(VSRSDataDefinitionDBRequirements object) {
				return createVSRSDataDefinitionDBRequirementsAdapter();
			}
			@Override
			public Adapter caseVSRSHumanFactorsRequirements(VSRSHumanFactorsRequirements object) {
				return createVSRSHumanFactorsRequirementsAdapter();
			}
			@Override
			public Adapter caseVSRSAdaptationInstallationRequirements(VSRSAdaptationInstallationRequirements object) {
				return createVSRSAdaptationInstallationRequirementsAdapter();
			}
			@Override
			public Adapter caseVSRSDocumentItem(VSRSDocumentItem object) {
				return createVSRSDocumentItemAdapter();
			}
			@Override
			public Adapter caseVSRSLogicalModels(VSRSLogicalModels object) {
				return createVSRSLogicalModelsAdapter();
			}
			@Override
			public Adapter caseVSRSLogicalModel(VSRSLogicalModel object) {
				return createVSRSLogicalModelAdapter();
			}
			@Override
			public Adapter caseVTraceableDocument(VTraceableDocument object) {
				return createVTraceableDocumentAdapter();
			}
			@Override
			public Adapter caseDDocumentTemplate(es.uah.aut.srg.micobs.doctpl.doctpl.DDocumentTemplate object) {
				return createDDocumentTemplateAdapter();
			}
			@Override
			public Adapter caseDAbstractSection(es.uah.aut.srg.micobs.doctpl.doctpl.DAbstractSection object) {
				return createDAbstractSectionAdapter();
			}
			@Override
			public Adapter caseDFixedSection(es.uah.aut.srg.micobs.doctpl.doctpl.DFixedSection object) {
				return createDFixedSectionAdapter();
			}
			@Override
			public Adapter caseMCommonReferenceableObj(MCommonReferenceableObj object) {
				return createMCommonReferenceableObjAdapter();
			}
			@Override
			public Adapter caseDInstantiableSection(es.uah.aut.srg.micobs.doctpl.doctpl.DInstantiableSection object) {
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
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.micobs.svm.srs.VSRSDocument <em>VSRS Document</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.uah.aut.srg.micobs.svm.srs.VSRSDocument
	 * @generated
	 */
	public Adapter createVSRSDocumentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.micobs.svm.srs.VSRSIntroduction <em>VSRS Introduction</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.uah.aut.srg.micobs.svm.srs.VSRSIntroduction
	 * @generated
	 */
	public Adapter createVSRSIntroductionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.micobs.svm.srs.VSRSApplicableDocuments <em>VSRS Applicable Documents</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.uah.aut.srg.micobs.svm.srs.VSRSApplicableDocuments
	 * @generated
	 */
	public Adapter createVSRSApplicableDocumentsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.micobs.svm.srs.VSRSReferenceDocuments <em>VSRS Reference Documents</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.uah.aut.srg.micobs.svm.srs.VSRSReferenceDocuments
	 * @generated
	 */
	public Adapter createVSRSReferenceDocumentsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.micobs.svm.srs.VSRSTermsDefinitionsAbbreviations <em>VSRS Terms Definitions Abbreviations</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.uah.aut.srg.micobs.svm.srs.VSRSTermsDefinitionsAbbreviations
	 * @generated
	 */
	public Adapter createVSRSTermsDefinitionsAbbreviationsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.micobs.svm.srs.VSRSAbstractBriefDescription <em>VSRS Abstract Brief Description</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.uah.aut.srg.micobs.svm.srs.VSRSAbstractBriefDescription
	 * @generated
	 */
	public Adapter createVSRSAbstractBriefDescriptionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.micobs.svm.srs.VSRSTerm <em>VSRS Term</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.uah.aut.srg.micobs.svm.srs.VSRSTerm
	 * @generated
	 */
	public Adapter createVSRSTermAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.micobs.svm.srs.VSRSDefinition <em>VSRS Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.uah.aut.srg.micobs.svm.srs.VSRSDefinition
	 * @generated
	 */
	public Adapter createVSRSDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.micobs.svm.srs.VSRSAbbreviation <em>VSRS Abbreviation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.uah.aut.srg.micobs.svm.srs.VSRSAbbreviation
	 * @generated
	 */
	public Adapter createVSRSAbbreviationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.micobs.svm.srs.VSRSFixedSection <em>VSRS Fixed Section</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.uah.aut.srg.micobs.svm.srs.VSRSFixedSection
	 * @generated
	 */
	public Adapter createVSRSFixedSectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.micobs.svm.srs.VSRSInstantiableSection <em>VSRS Instantiable Section</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.uah.aut.srg.micobs.svm.srs.VSRSInstantiableSection
	 * @generated
	 */
	public Adapter createVSRSInstantiableSectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.micobs.svm.srs.VSRSSoftwareOverview <em>VSRS Software Overview</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.uah.aut.srg.micobs.svm.srs.VSRSSoftwareOverview
	 * @generated
	 */
	public Adapter createVSRSSoftwareOverviewAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.micobs.svm.srs.VSRSAbstractRequirementSection <em>VSRS Abstract Requirement Section</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.uah.aut.srg.micobs.svm.srs.VSRSAbstractRequirementSection
	 * @generated
	 */
	public Adapter createVSRSAbstractRequirementSectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.micobs.svm.srs.VSRSInstantiableRequirementSection <em>VSRS Instantiable Requirement Section</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.uah.aut.srg.micobs.svm.srs.VSRSInstantiableRequirementSection
	 * @generated
	 */
	public Adapter createVSRSInstantiableRequirementSectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.micobs.svm.srs.VSRSRequirements <em>VSRS Requirements</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.uah.aut.srg.micobs.svm.srs.VSRSRequirements
	 * @generated
	 */
	public Adapter createVSRSRequirementsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.micobs.svm.srs.VSRSGeneralRequirements <em>VSRS General Requirements</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.uah.aut.srg.micobs.svm.srs.VSRSGeneralRequirements
	 * @generated
	 */
	public Adapter createVSRSGeneralRequirementsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.micobs.svm.srs.VSRSFunctionalRequirements <em>VSRS Functional Requirements</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.uah.aut.srg.micobs.svm.srs.VSRSFunctionalRequirements
	 * @generated
	 */
	public Adapter createVSRSFunctionalRequirementsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.micobs.svm.srs.VSRSPerformanceRequirements <em>VSRS Performance Requirements</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.uah.aut.srg.micobs.svm.srs.VSRSPerformanceRequirements
	 * @generated
	 */
	public Adapter createVSRSPerformanceRequirementsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.micobs.svm.srs.VSRSInterfaceRequirements <em>VSRS Interface Requirements</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.uah.aut.srg.micobs.svm.srs.VSRSInterfaceRequirements
	 * @generated
	 */
	public Adapter createVSRSInterfaceRequirementsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.micobs.svm.srs.VSRSOperationalRequirements <em>VSRS Operational Requirements</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.uah.aut.srg.micobs.svm.srs.VSRSOperationalRequirements
	 * @generated
	 */
	public Adapter createVSRSOperationalRequirementsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.micobs.svm.srs.VSRSResourcesRequirements <em>VSRS Resources Requirements</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.uah.aut.srg.micobs.svm.srs.VSRSResourcesRequirements
	 * @generated
	 */
	public Adapter createVSRSResourcesRequirementsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.micobs.svm.srs.VSRSDesignRequirements <em>VSRS Design Requirements</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.uah.aut.srg.micobs.svm.srs.VSRSDesignRequirements
	 * @generated
	 */
	public Adapter createVSRSDesignRequirementsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.micobs.svm.srs.VSRSSecurityPrivacyRequirements <em>VSRS Security Privacy Requirements</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.uah.aut.srg.micobs.svm.srs.VSRSSecurityPrivacyRequirements
	 * @generated
	 */
	public Adapter createVSRSSecurityPrivacyRequirementsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.micobs.svm.srs.VSRSPortabilityRequirements <em>VSRS Portability Requirements</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.uah.aut.srg.micobs.svm.srs.VSRSPortabilityRequirements
	 * @generated
	 */
	public Adapter createVSRSPortabilityRequirementsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.micobs.svm.srs.VSRSSWQualityRequirements <em>VSRSSW Quality Requirements</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.uah.aut.srg.micobs.svm.srs.VSRSSWQualityRequirements
	 * @generated
	 */
	public Adapter createVSRSSWQualityRequirementsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.micobs.svm.srs.VSRSSWReliabilityRequirements <em>VSRSSW Reliability Requirements</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.uah.aut.srg.micobs.svm.srs.VSRSSWReliabilityRequirements
	 * @generated
	 */
	public Adapter createVSRSSWReliabilityRequirementsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.micobs.svm.srs.VSRSSWMaintainabilityRequirements <em>VSRSSW Maintainability Requirements</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.uah.aut.srg.micobs.svm.srs.VSRSSWMaintainabilityRequirements
	 * @generated
	 */
	public Adapter createVSRSSWMaintainabilityRequirementsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.micobs.svm.srs.VSRSSWSafetyRequirements <em>VSRSSW Safety Requirements</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.uah.aut.srg.micobs.svm.srs.VSRSSWSafetyRequirements
	 * @generated
	 */
	public Adapter createVSRSSWSafetyRequirementsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.micobs.svm.srs.VSRSSWConfigurationDeliveryRequirements <em>VSRSSW Configuration Delivery Requirements</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.uah.aut.srg.micobs.svm.srs.VSRSSWConfigurationDeliveryRequirements
	 * @generated
	 */
	public Adapter createVSRSSWConfigurationDeliveryRequirementsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.micobs.svm.srs.VSRSDataDefinitionDBRequirements <em>VSRS Data Definition DB Requirements</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.uah.aut.srg.micobs.svm.srs.VSRSDataDefinitionDBRequirements
	 * @generated
	 */
	public Adapter createVSRSDataDefinitionDBRequirementsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.micobs.svm.srs.VSRSHumanFactorsRequirements <em>VSRS Human Factors Requirements</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.uah.aut.srg.micobs.svm.srs.VSRSHumanFactorsRequirements
	 * @generated
	 */
	public Adapter createVSRSHumanFactorsRequirementsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.micobs.svm.srs.VSRSAdaptationInstallationRequirements <em>VSRS Adaptation Installation Requirements</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.uah.aut.srg.micobs.svm.srs.VSRSAdaptationInstallationRequirements
	 * @generated
	 */
	public Adapter createVSRSAdaptationInstallationRequirementsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.micobs.svm.srs.VSRSDocumentItem <em>VSRS Document Item</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.uah.aut.srg.micobs.svm.srs.VSRSDocumentItem
	 * @generated
	 */
	public Adapter createVSRSDocumentItemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.micobs.svm.srs.VSRSLogicalModels <em>VSRS Logical Models</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.uah.aut.srg.micobs.svm.srs.VSRSLogicalModels
	 * @generated
	 */
	public Adapter createVSRSLogicalModelsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.micobs.svm.srs.VSRSLogicalModel <em>VSRS Logical Model</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.uah.aut.srg.micobs.svm.srs.VSRSLogicalModel
	 * @generated
	 */
	public Adapter createVSRSLogicalModelAdapter() {
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

} //srsAdapterFactory
