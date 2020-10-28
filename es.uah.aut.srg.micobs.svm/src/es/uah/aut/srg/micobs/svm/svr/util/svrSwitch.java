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

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see es.uah.aut.srg.micobs.svm.svr.svrPackage
 * @generated
 */
public class svrSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static svrPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public svrSwitch() {
		if (modelPackage == null) {
			modelPackage = svrPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case svrPackage.VSVR_DOCUMENT: {
				VSVRDocument vsvrDocument = (VSVRDocument)theEObject;
				T result = caseVSVRDocument(vsvrDocument);
				if (result == null) result = caseDDocumentTemplate(vsvrDocument);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case svrPackage.VSVRTB_CS_TB_DS: {
				VSVRTBCsTBDs vsvrtbCsTBDs = (VSVRTBCsTBDs)theEObject;
				T result = caseVSVRTBCsTBDs(vsvrtbCsTBDs);
				if (result == null) result = caseDFixedSection(vsvrtbCsTBDs);
				if (result == null) result = caseDAbstractSection(vsvrtbCsTBDs);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case svrPackage.VSVR_INTRODUCTION: {
				VSVRIntroduction vsvrIntroduction = (VSVRIntroduction)theEObject;
				T result = caseVSVRIntroduction(vsvrIntroduction);
				if (result == null) result = caseDFixedSection(vsvrIntroduction);
				if (result == null) result = caseDAbstractSection(vsvrIntroduction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case svrPackage.VSVR_APPLICABLE_DOCUMENTS: {
				VSVRApplicableDocuments vsvrApplicableDocuments = (VSVRApplicableDocuments)theEObject;
				T result = caseVSVRApplicableDocuments(vsvrApplicableDocuments);
				if (result == null) result = caseDFixedSection(vsvrApplicableDocuments);
				if (result == null) result = caseDAbstractSection(vsvrApplicableDocuments);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case svrPackage.VSVR_REFERENCE_DOCUMENTS: {
				VSVRReferenceDocuments vsvrReferenceDocuments = (VSVRReferenceDocuments)theEObject;
				T result = caseVSVRReferenceDocuments(vsvrReferenceDocuments);
				if (result == null) result = caseDFixedSection(vsvrReferenceDocuments);
				if (result == null) result = caseDAbstractSection(vsvrReferenceDocuments);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case svrPackage.VSVR_TERMS_DEFINITIONS_ABBREVIATIONS: {
				VSVRTermsDefinitionsAbbreviations vsvrTermsDefinitionsAbbreviations = (VSVRTermsDefinitionsAbbreviations)theEObject;
				T result = caseVSVRTermsDefinitionsAbbreviations(vsvrTermsDefinitionsAbbreviations);
				if (result == null) result = caseDFixedSection(vsvrTermsDefinitionsAbbreviations);
				if (result == null) result = caseDAbstractSection(vsvrTermsDefinitionsAbbreviations);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case svrPackage.VSVR_ABSTRACT_BRIEF_DESCRIPTION: {
				VSVRAbstractBriefDescription vsvrAbstractBriefDescription = (VSVRAbstractBriefDescription)theEObject;
				T result = caseVSVRAbstractBriefDescription(vsvrAbstractBriefDescription);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case svrPackage.VSVR_TERM: {
				VSVRTerm vsvrTerm = (VSVRTerm)theEObject;
				T result = caseVSVRTerm(vsvrTerm);
				if (result == null) result = caseVSVRAbstractBriefDescription(vsvrTerm);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case svrPackage.VSVR_DEFINITION: {
				VSVRDefinition vsvrDefinition = (VSVRDefinition)theEObject;
				T result = caseVSVRDefinition(vsvrDefinition);
				if (result == null) result = caseVSVRAbstractBriefDescription(vsvrDefinition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case svrPackage.VSVR_ABBREVIATION: {
				VSVRAbbreviation vsvrAbbreviation = (VSVRAbbreviation)theEObject;
				T result = caseVSVRAbbreviation(vsvrAbbreviation);
				if (result == null) result = caseVSVRAbstractBriefDescription(vsvrAbbreviation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case svrPackage.VSVR_FIXED_SECTION: {
				VSVRFixedSection vsvrFixedSection = (VSVRFixedSection)theEObject;
				T result = caseVSVRFixedSection(vsvrFixedSection);
				if (result == null) result = caseDFixedSection(vsvrFixedSection);
				if (result == null) result = caseDAbstractSection(vsvrFixedSection);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case svrPackage.VSVR_INSTANTIABLE_SECTION: {
				VSVRInstantiableSection vsvrInstantiableSection = (VSVRInstantiableSection)theEObject;
				T result = caseVSVRInstantiableSection(vsvrInstantiableSection);
				if (result == null) result = caseDInstantiableSection(vsvrInstantiableSection);
				if (result == null) result = caseDAbstractSection(vsvrInstantiableSection);
				if (result == null) result = caseMCommonReferenceableObj(vsvrInstantiableSection);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>VSVR Document</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>VSVR Document</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVSVRDocument(VSVRDocument object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>VSVRTB Cs TB Ds</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>VSVRTB Cs TB Ds</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVSVRTBCsTBDs(VSVRTBCsTBDs object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>VSVR Introduction</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>VSVR Introduction</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVSVRIntroduction(VSVRIntroduction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>VSVR Applicable Documents</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>VSVR Applicable Documents</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVSVRApplicableDocuments(VSVRApplicableDocuments object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>VSVR Reference Documents</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>VSVR Reference Documents</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVSVRReferenceDocuments(VSVRReferenceDocuments object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>VSVR Terms Definitions Abbreviations</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>VSVR Terms Definitions Abbreviations</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVSVRTermsDefinitionsAbbreviations(VSVRTermsDefinitionsAbbreviations object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>VSVR Abstract Brief Description</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>VSVR Abstract Brief Description</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVSVRAbstractBriefDescription(VSVRAbstractBriefDescription object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>VSVR Term</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>VSVR Term</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVSVRTerm(VSVRTerm object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>VSVR Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>VSVR Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVSVRDefinition(VSVRDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>VSVR Abbreviation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>VSVR Abbreviation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVSVRAbbreviation(VSVRAbbreviation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>VSVR Fixed Section</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>VSVR Fixed Section</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVSVRFixedSection(VSVRFixedSection object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>VSVR Instantiable Section</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>VSVR Instantiable Section</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVSVRInstantiableSection(VSVRInstantiableSection object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>DDocument Template</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>DDocument Template</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDDocumentTemplate(DDocumentTemplate object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>DAbstract Section</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>DAbstract Section</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDAbstractSection(DAbstractSection object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>DFixed Section</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>DFixed Section</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDFixedSection(DFixedSection object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MCommon Referenceable Obj</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MCommon Referenceable Obj</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMCommonReferenceableObj(MCommonReferenceableObj object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>DInstantiable Section</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>DInstantiable Section</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDInstantiableSection(DInstantiableSection object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //svrSwitch
