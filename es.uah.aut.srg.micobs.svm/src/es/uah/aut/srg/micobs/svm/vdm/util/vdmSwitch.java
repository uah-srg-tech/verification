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
package es.uah.aut.srg.micobs.svm.vdm.util;

import es.uah.aut.srg.micobs.common.MCommonReferenceableObj;

import es.uah.aut.srg.micobs.svm.vdm.*;

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
 * @see es.uah.aut.srg.micobs.svm.vdm.vdmPackage
 * @generated
 */
public class vdmSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static vdmPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public vdmSwitch() {
		if (modelPackage == null) {
			modelPackage = vdmPackage.eINSTANCE;
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
			case vdmPackage.VVALIDATION_DOCUMENT: {
				VValidationDocument vValidationDocument = (VValidationDocument)theEObject;
				T result = caseVValidationDocument(vValidationDocument);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case vdmPackage.VVALIDATION_DOCUMENT_ABSTRACT_GROUP: {
				VValidationDocumentAbstractGroup vValidationDocumentAbstractGroup = (VValidationDocumentAbstractGroup)theEObject;
				T result = caseVValidationDocumentAbstractGroup(vValidationDocumentAbstractGroup);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case vdmPackage.VVALIDATION_DOCUMENT_FIXED_GROUP: {
				VValidationDocumentFixedGroup vValidationDocumentFixedGroup = (VValidationDocumentFixedGroup)theEObject;
				T result = caseVValidationDocumentFixedGroup(vValidationDocumentFixedGroup);
				if (result == null) result = caseVValidationDocumentAbstractGroup(vValidationDocumentFixedGroup);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case vdmPackage.VVALIDATION_DOCUMENT_INSTANTIABLE_GROUP: {
				VValidationDocumentInstantiableGroup vValidationDocumentInstantiableGroup = (VValidationDocumentInstantiableGroup)theEObject;
				T result = caseVValidationDocumentInstantiableGroup(vValidationDocumentInstantiableGroup);
				if (result == null) result = caseVValidationDocumentAbstractGroup(vValidationDocumentInstantiableGroup);
				if (result == null) result = caseMCommonReferenceableObj(vValidationDocumentInstantiableGroup);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case vdmPackage.VVALIDATION_DOCUMENT_ABSTRACT_ITEM: {
				VValidationDocumentAbstractItem vValidationDocumentAbstractItem = (VValidationDocumentAbstractItem)theEObject;
				T result = caseVValidationDocumentAbstractItem(vValidationDocumentAbstractItem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>VValidation Document</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>VValidation Document</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVValidationDocument(VValidationDocument object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>VValidation Document Abstract Group</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>VValidation Document Abstract Group</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVValidationDocumentAbstractGroup(VValidationDocumentAbstractGroup object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>VValidation Document Fixed Group</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>VValidation Document Fixed Group</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVValidationDocumentFixedGroup(VValidationDocumentFixedGroup object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>VValidation Document Instantiable Group</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>VValidation Document Instantiable Group</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVValidationDocumentInstantiableGroup(VValidationDocumentInstantiableGroup object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>VValidation Document Abstract Item</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>VValidation Document Abstract Item</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVValidationDocumentAbstractItem(VValidationDocumentAbstractItem object) {
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

} //vdmSwitch
