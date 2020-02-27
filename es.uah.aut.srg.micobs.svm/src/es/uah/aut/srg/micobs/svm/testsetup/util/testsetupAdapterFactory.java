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
package es.uah.aut.srg.micobs.svm.testsetup.util;

import es.uah.aut.srg.micobs.common.MCommonReferenceableObj;
import es.uah.aut.srg.micobs.doctpl.doctpl.DAbstractSection;
import es.uah.aut.srg.micobs.doctpl.doctpl.DDocumentTemplate;
import es.uah.aut.srg.micobs.doctpl.doctpl.DFixedSection;

import es.uah.aut.srg.micobs.doctpl.doctpl.DInstantiableSection;
import es.uah.aut.srg.micobs.svm.testsetup.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see es.uah.aut.srg.micobs.svm.testsetup.testsetupPackage
 * @generated
 */
public class testsetupAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static testsetupPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public testsetupAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = testsetupPackage.eINSTANCE;
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
	protected testsetupSwitch<Adapter> modelSwitch =
		new testsetupSwitch<Adapter>() {
			@Override
			public Adapter caseVTestSetupDocument(VTestSetupDocument object) {
				return createVTestSetupDocumentAdapter();
			}
			@Override
			public Adapter caseVTestSetupTBCsTBDs(VTestSetupTBCsTBDs object) {
				return createVTestSetupTBCsTBDsAdapter();
			}
			@Override
			public Adapter caseVTestSetupApplicableDocuments(VTestSetupApplicableDocuments object) {
				return createVTestSetupApplicableDocumentsAdapter();
			}
			@Override
			public Adapter caseVTestSetupReferenceDocuments(VTestSetupReferenceDocuments object) {
				return createVTestSetupReferenceDocumentsAdapter();
			}
			@Override
			public Adapter caseVTestSetupInterfacesSection(VTestSetupInterfacesSection object) {
				return createVTestSetupInterfacesSectionAdapter();
			}
			@Override
			public Adapter caseVTestSetupInterface(VTestSetupInterface object) {
				return createVTestSetupInterfaceAdapter();
			}
			@Override
			public Adapter caseVTestSetupPacketConfigurationsSection(VTestSetupPacketConfigurationsSection object) {
				return createVTestSetupPacketConfigurationsSectionAdapter();
			}
			@Override
			public Adapter caseVTestSetupPacketConfiguration(VTestSetupPacketConfiguration object) {
				return createVTestSetupPacketConfigurationAdapter();
			}
			@Override
			public Adapter caseVTestSetupActionsSection(VTestSetupActionsSection object) {
				return createVTestSetupActionsSectionAdapter();
			}
			@Override
			public Adapter caseVTestSetupAction(VTestSetupAction object) {
				return createVTestSetupActionAdapter();
			}
			@Override
			public Adapter caseVTestSetupScenariosSection(VTestSetupScenariosSection object) {
				return createVTestSetupScenariosSectionAdapter();
			}
			@Override
			public Adapter caseVTestSetupScenarioSection(VTestSetupScenarioSection object) {
				return createVTestSetupScenarioSectionAdapter();
			}
			@Override
			public Adapter caseVTestSetupSupportedInterface(VTestSetupSupportedInterface object) {
				return createVTestSetupSupportedInterfaceAdapter();
			}
			@Override
			public Adapter caseVTestSetupSelectedConfiguration(VTestSetupSelectedConfiguration object) {
				return createVTestSetupSelectedConfigurationAdapter();
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
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.micobs.svm.testsetup.VTestSetupDocument <em>VTest Setup Document</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.uah.aut.srg.micobs.svm.testsetup.VTestSetupDocument
	 * @generated
	 */
	public Adapter createVTestSetupDocumentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.micobs.svm.testsetup.VTestSetupTBCsTBDs <em>VTest Setup TB Cs TB Ds</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.uah.aut.srg.micobs.svm.testsetup.VTestSetupTBCsTBDs
	 * @generated
	 */
	public Adapter createVTestSetupTBCsTBDsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.micobs.svm.testsetup.VTestSetupApplicableDocuments <em>VTest Setup Applicable Documents</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.uah.aut.srg.micobs.svm.testsetup.VTestSetupApplicableDocuments
	 * @generated
	 */
	public Adapter createVTestSetupApplicableDocumentsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.micobs.svm.testsetup.VTestSetupReferenceDocuments <em>VTest Setup Reference Documents</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.uah.aut.srg.micobs.svm.testsetup.VTestSetupReferenceDocuments
	 * @generated
	 */
	public Adapter createVTestSetupReferenceDocumentsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.micobs.svm.testsetup.VTestSetupInterfacesSection <em>VTest Setup Interfaces Section</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.uah.aut.srg.micobs.svm.testsetup.VTestSetupInterfacesSection
	 * @generated
	 */
	public Adapter createVTestSetupInterfacesSectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.micobs.svm.testsetup.VTestSetupInterface <em>VTest Setup Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.uah.aut.srg.micobs.svm.testsetup.VTestSetupInterface
	 * @generated
	 */
	public Adapter createVTestSetupInterfaceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.micobs.svm.testsetup.VTestSetupPacketConfigurationsSection <em>VTest Setup Packet Configurations Section</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.uah.aut.srg.micobs.svm.testsetup.VTestSetupPacketConfigurationsSection
	 * @generated
	 */
	public Adapter createVTestSetupPacketConfigurationsSectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.micobs.svm.testsetup.VTestSetupPacketConfiguration <em>VTest Setup Packet Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.uah.aut.srg.micobs.svm.testsetup.VTestSetupPacketConfiguration
	 * @generated
	 */
	public Adapter createVTestSetupPacketConfigurationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.micobs.svm.testsetup.VTestSetupActionsSection <em>VTest Setup Actions Section</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.uah.aut.srg.micobs.svm.testsetup.VTestSetupActionsSection
	 * @generated
	 */
	public Adapter createVTestSetupActionsSectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.micobs.svm.testsetup.VTestSetupAction <em>VTest Setup Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.uah.aut.srg.micobs.svm.testsetup.VTestSetupAction
	 * @generated
	 */
	public Adapter createVTestSetupActionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.micobs.svm.testsetup.VTestSetupScenariosSection <em>VTest Setup Scenarios Section</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.uah.aut.srg.micobs.svm.testsetup.VTestSetupScenariosSection
	 * @generated
	 */
	public Adapter createVTestSetupScenariosSectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.micobs.svm.testsetup.VTestSetupScenarioSection <em>VTest Setup Scenario Section</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.uah.aut.srg.micobs.svm.testsetup.VTestSetupScenarioSection
	 * @generated
	 */
	public Adapter createVTestSetupScenarioSectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.micobs.svm.testsetup.VTestSetupSupportedInterface <em>VTest Setup Supported Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.uah.aut.srg.micobs.svm.testsetup.VTestSetupSupportedInterface
	 * @generated
	 */
	public Adapter createVTestSetupSupportedInterfaceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.micobs.svm.testsetup.VTestSetupSelectedConfiguration <em>VTest Setup Selected Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.uah.aut.srg.micobs.svm.testsetup.VTestSetupSelectedConfiguration
	 * @generated
	 */
	public Adapter createVTestSetupSelectedConfigurationAdapter() {
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

} //testsetupAdapterFactory
