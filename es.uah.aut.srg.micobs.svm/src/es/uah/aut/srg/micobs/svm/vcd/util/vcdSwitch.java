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
package es.uah.aut.srg.micobs.svm.vcd.util;

import es.uah.aut.srg.micobs.svm.vcd.*;

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
 * @see es.uah.aut.srg.micobs.svm.vcd.vcdPackage
 * @generated
 */
public class vcdSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static vcdPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public vcdSwitch() {
		if (modelPackage == null) {
			modelPackage = vcdPackage.eINSTANCE;
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
			case vcdPackage.VVCD_LIST: {
				VVCDList vvcdList = (VVCDList)theEObject;
				T result = caseVVCDList(vvcdList);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case vcdPackage.VVCD_ITEMS: {
				VVCDItems vvcdItems = (VVCDItems)theEObject;
				T result = caseVVCDItems(vvcdItems);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case vcdPackage.VVCD_ITEM: {
				VVCDItem vvcdItem = (VVCDItem)theEObject;
				T result = caseVVCDItem(vvcdItem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case vcdPackage.VVCD_PARENT_REF_ITEM: {
				VVCDParentRefItem vvcdParentRefItem = (VVCDParentRefItem)theEObject;
				T result = caseVVCDParentRefItem(vvcdParentRefItem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case vcdPackage.VVCD_PARENT_ITEMS: {
				VVCDParentItems vvcdParentItems = (VVCDParentItems)theEObject;
				T result = caseVVCDParentItems(vvcdParentItems);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case vcdPackage.VVCD_PARENT_ITEM: {
				VVCDParentItem vvcdParentItem = (VVCDParentItem)theEObject;
				T result = caseVVCDParentItem(vvcdParentItem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case vcdPackage.VVCD_REF_ITEM: {
				VVCDRefItem vvcdRefItem = (VVCDRefItem)theEObject;
				T result = caseVVCDRefItem(vvcdRefItem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>VVCD List</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>VVCD List</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVVCDList(VVCDList object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>VVCD Items</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>VVCD Items</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVVCDItems(VVCDItems object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>VVCD Item</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>VVCD Item</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVVCDItem(VVCDItem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>VVCD Parent Ref Item</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>VVCD Parent Ref Item</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVVCDParentRefItem(VVCDParentRefItem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>VVCD Parent Items</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>VVCD Parent Items</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVVCDParentItems(VVCDParentItems object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>VVCD Parent Item</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>VVCD Parent Item</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVVCDParentItem(VVCDParentItem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>VVCD Ref Item</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>VVCD Ref Item</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVVCDRefItem(VVCDRefItem object) {
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

} //vcdSwitch
