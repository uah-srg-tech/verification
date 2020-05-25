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
package es.uah.aut.srg.micobs.svm.svr.impl;

import es.uah.aut.srg.micobs.svm.svr.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class svrFactoryImpl extends EFactoryImpl implements svrFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static svrFactory init() {
		try {
			svrFactory thesvrFactory = (svrFactory)EPackage.Registry.INSTANCE.getEFactory(svrPackage.eNS_URI);
			if (thesvrFactory != null) {
				return thesvrFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new svrFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public svrFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case svrPackage.VSVR_DOCUMENT: return createVSVRDocument();
			case svrPackage.VSVRTB_CS_TB_DS: return createVSVRTBCsTBDs();
			case svrPackage.VSVR_INTRODUCTION: return createVSVRIntroduction();
			case svrPackage.VSVR_APPLICABLE_DOCUMENTS: return createVSVRApplicableDocuments();
			case svrPackage.VSVR_REFERENCE_DOCUMENTS: return createVSVRReferenceDocuments();
			case svrPackage.VSVR_TERMS_DEFINITIONS_ABBREVIATIONS: return createVSVRTermsDefinitionsAbbreviations();
			case svrPackage.VSVR_TERM: return createVSVRTerm();
			case svrPackage.VSVR_DEFINITION: return createVSVRDefinition();
			case svrPackage.VSVR_ABBREVIATION: return createVSVRAbbreviation();
			case svrPackage.VSVR_FIXED_SECTION: return createVSVRFixedSection();
			case svrPackage.VSVR_INSTANTIABLE_SECTION: return createVSVRInstantiableSection();
			case svrPackage.VSVRSW_VAL_PROCESS_VERIFICATION: return createVSVRSWValProcessVerification();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VSVRDocument createVSVRDocument() {
		VSVRDocumentImpl vsvrDocument = new VSVRDocumentImpl();
		return vsvrDocument;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VSVRTBCsTBDs createVSVRTBCsTBDs() {
		VSVRTBCsTBDsImpl vsvrtbCsTBDs = new VSVRTBCsTBDsImpl();
		return vsvrtbCsTBDs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VSVRIntroduction createVSVRIntroduction() {
		VSVRIntroductionImpl vsvrIntroduction = new VSVRIntroductionImpl();
		return vsvrIntroduction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VSVRApplicableDocuments createVSVRApplicableDocuments() {
		VSVRApplicableDocumentsImpl vsvrApplicableDocuments = new VSVRApplicableDocumentsImpl();
		return vsvrApplicableDocuments;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VSVRReferenceDocuments createVSVRReferenceDocuments() {
		VSVRReferenceDocumentsImpl vsvrReferenceDocuments = new VSVRReferenceDocumentsImpl();
		return vsvrReferenceDocuments;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VSVRTermsDefinitionsAbbreviations createVSVRTermsDefinitionsAbbreviations() {
		VSVRTermsDefinitionsAbbreviationsImpl vsvrTermsDefinitionsAbbreviations = new VSVRTermsDefinitionsAbbreviationsImpl();
		return vsvrTermsDefinitionsAbbreviations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VSVRTerm createVSVRTerm() {
		VSVRTermImpl vsvrTerm = new VSVRTermImpl();
		return vsvrTerm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VSVRDefinition createVSVRDefinition() {
		VSVRDefinitionImpl vsvrDefinition = new VSVRDefinitionImpl();
		return vsvrDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VSVRAbbreviation createVSVRAbbreviation() {
		VSVRAbbreviationImpl vsvrAbbreviation = new VSVRAbbreviationImpl();
		return vsvrAbbreviation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VSVRFixedSection createVSVRFixedSection() {
		VSVRFixedSectionImpl vsvrFixedSection = new VSVRFixedSectionImpl();
		return vsvrFixedSection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VSVRInstantiableSection createVSVRInstantiableSection() {
		VSVRInstantiableSectionImpl vsvrInstantiableSection = new VSVRInstantiableSectionImpl();
		return vsvrInstantiableSection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VSVRSWValProcessVerification createVSVRSWValProcessVerification() {
		VSVRSWValProcessVerificationImpl vsvrswValProcessVerification = new VSVRSWValProcessVerificationImpl();
		return vsvrswValProcessVerification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public svrPackage getsvrPackage() {
		return (svrPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static svrPackage getPackage() {
		return svrPackage.eINSTANCE;
	}

} //svrFactoryImpl
