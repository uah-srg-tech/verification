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
package es.uah.aut.srg.micobs.svm.svr.util;

import es.uah.aut.srg.micobs.common.MCommonReferenceableObj;

import es.uah.aut.srg.micobs.doctpl.doctpl.DAbstractSection;
import es.uah.aut.srg.micobs.doctpl.doctpl.DDocumentTemplate;
import es.uah.aut.srg.micobs.doctpl.doctpl.DFixedSection;
import es.uah.aut.srg.micobs.doctpl.doctpl.DInstantiableSection;

import es.uah.aut.srg.micobs.svm.svr.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see es.uah.aut.srg.micobs.svm.svr.svrPackage
 * @generated
 */
public class svrAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static svrPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public svrAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = svrPackage.eINSTANCE;
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
	protected svrSwitch<Adapter> modelSwitch =
		new svrSwitch<Adapter>() {
			@Override
			public Adapter caseVSVRDocument(VSVRDocument object) {
				return createVSVRDocumentAdapter();
			}
			@Override
			public Adapter caseVSVRTBCsTBDs(VSVRTBCsTBDs object) {
				return createVSVRTBCsTBDsAdapter();
			}
			@Override
			public Adapter caseVSVRIntroduction(VSVRIntroduction object) {
				return createVSVRIntroductionAdapter();
			}
			@Override
			public Adapter caseVSVRApplicableDocuments(VSVRApplicableDocuments object) {
				return createVSVRApplicableDocumentsAdapter();
			}
			@Override
			public Adapter caseVSVRReferenceDocuments(VSVRReferenceDocuments object) {
				return createVSVRReferenceDocumentsAdapter();
			}
			@Override
			public Adapter caseVSVRTermsDefinitionsAbbreviations(VSVRTermsDefinitionsAbbreviations object) {
				return createVSVRTermsDefinitionsAbbreviationsAdapter();
			}
			@Override
			public Adapter caseVSVRAbstractBriefDescription(VSVRAbstractBriefDescription object) {
				return createVSVRAbstractBriefDescriptionAdapter();
			}
			@Override
			public Adapter caseVSVRTerm(VSVRTerm object) {
				return createVSVRTermAdapter();
			}
			@Override
			public Adapter caseVSVRDefinition(VSVRDefinition object) {
				return createVSVRDefinitionAdapter();
			}
			@Override
			public Adapter caseVSVRAbbreviation(VSVRAbbreviation object) {
				return createVSVRAbbreviationAdapter();
			}
			@Override
			public Adapter caseVSVRFixedSection(VSVRFixedSection object) {
				return createVSVRFixedSectionAdapter();
			}
			@Override
			public Adapter caseVSVRInstantiableSection(VSVRInstantiableSection object) {
				return createVSVRInstantiableSectionAdapter();
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
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.micobs.svm.svr.VSVRDocument <em>VSVR Document</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.uah.aut.srg.micobs.svm.svr.VSVRDocument
	 * @generated
	 */
	public Adapter createVSVRDocumentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.micobs.svm.svr.VSVRTBCsTBDs <em>VSVRTB Cs TB Ds</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.uah.aut.srg.micobs.svm.svr.VSVRTBCsTBDs
	 * @generated
	 */
	public Adapter createVSVRTBCsTBDsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.micobs.svm.svr.VSVRIntroduction <em>VSVR Introduction</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.uah.aut.srg.micobs.svm.svr.VSVRIntroduction
	 * @generated
	 */
	public Adapter createVSVRIntroductionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.micobs.svm.svr.VSVRApplicableDocuments <em>VSVR Applicable Documents</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.uah.aut.srg.micobs.svm.svr.VSVRApplicableDocuments
	 * @generated
	 */
	public Adapter createVSVRApplicableDocumentsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.micobs.svm.svr.VSVRReferenceDocuments <em>VSVR Reference Documents</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.uah.aut.srg.micobs.svm.svr.VSVRReferenceDocuments
	 * @generated
	 */
	public Adapter createVSVRReferenceDocumentsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.micobs.svm.svr.VSVRTermsDefinitionsAbbreviations <em>VSVR Terms Definitions Abbreviations</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.uah.aut.srg.micobs.svm.svr.VSVRTermsDefinitionsAbbreviations
	 * @generated
	 */
	public Adapter createVSVRTermsDefinitionsAbbreviationsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.micobs.svm.svr.VSVRAbstractBriefDescription <em>VSVR Abstract Brief Description</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.uah.aut.srg.micobs.svm.svr.VSVRAbstractBriefDescription
	 * @generated
	 */
	public Adapter createVSVRAbstractBriefDescriptionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.micobs.svm.svr.VSVRTerm <em>VSVR Term</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.uah.aut.srg.micobs.svm.svr.VSVRTerm
	 * @generated
	 */
	public Adapter createVSVRTermAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.micobs.svm.svr.VSVRDefinition <em>VSVR Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.uah.aut.srg.micobs.svm.svr.VSVRDefinition
	 * @generated
	 */
	public Adapter createVSVRDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.micobs.svm.svr.VSVRAbbreviation <em>VSVR Abbreviation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.uah.aut.srg.micobs.svm.svr.VSVRAbbreviation
	 * @generated
	 */
	public Adapter createVSVRAbbreviationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.micobs.svm.svr.VSVRFixedSection <em>VSVR Fixed Section</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.uah.aut.srg.micobs.svm.svr.VSVRFixedSection
	 * @generated
	 */
	public Adapter createVSVRFixedSectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.micobs.svm.svr.VSVRInstantiableSection <em>VSVR Instantiable Section</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.uah.aut.srg.micobs.svm.svr.VSVRInstantiableSection
	 * @generated
	 */
	public Adapter createVSVRInstantiableSectionAdapter() {
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

} //svrAdapterFactory
