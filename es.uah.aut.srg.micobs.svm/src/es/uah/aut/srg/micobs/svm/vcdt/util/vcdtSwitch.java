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
package es.uah.aut.srg.micobs.svm.vcdt.util;

import es.uah.aut.srg.micobs.svm.vcdt.*;

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
 * @see es.uah.aut.srg.micobs.svm.vcdt.vcdtPackage
 * @generated
 */
public class vcdtSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static vcdtPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public vcdtSwitch() {
		if (modelPackage == null) {
			modelPackage = vcdtPackage.eINSTANCE;
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
			case vcdtPackage.VCDT_LIST: {
				VCDTList vcdtList = (VCDTList)theEObject;
				T result = caseVCDTList(vcdtList);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case vcdtPackage.VCDT_ITEMS: {
				VCDTItems vcdtItems = (VCDTItems)theEObject;
				T result = caseVCDTItems(vcdtItems);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case vcdtPackage.VCDT_ITEM: {
				VCDTItem vcdtItem = (VCDTItem)theEObject;
				T result = caseVCDTItem(vcdtItem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case vcdtPackage.VCDT_PARENT_REF_ITEM: {
				VCDTParentRefItem vcdtParentRefItem = (VCDTParentRefItem)theEObject;
				T result = caseVCDTParentRefItem(vcdtParentRefItem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case vcdtPackage.VCDT_PARENT_ITEMS: {
				VCDTParentItems vcdtParentItems = (VCDTParentItems)theEObject;
				T result = caseVCDTParentItems(vcdtParentItems);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case vcdtPackage.VCDT_PARENT_ITEM: {
				VCDTParentItem vcdtParentItem = (VCDTParentItem)theEObject;
				T result = caseVCDTParentItem(vcdtParentItem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case vcdtPackage.VCDT_REF_ITEM: {
				VCDTRefItem vcdtRefItem = (VCDTRefItem)theEObject;
				T result = caseVCDTRefItem(vcdtRefItem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>VCDT List</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>VCDT List</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVCDTList(VCDTList object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>VCDT Items</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>VCDT Items</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVCDTItems(VCDTItems object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>VCDT Item</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>VCDT Item</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVCDTItem(VCDTItem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>VCDT Parent Ref Item</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>VCDT Parent Ref Item</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVCDTParentRefItem(VCDTParentRefItem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>VCDT Parent Items</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>VCDT Parent Items</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVCDTParentItems(VCDTParentItems object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>VCDT Parent Item</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>VCDT Parent Item</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVCDTParentItem(VCDTParentItem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>VCDT Ref Item</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>VCDT Ref Item</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVCDTRefItem(VCDTRefItem object) {
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

} //vcdtSwitch
