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
package es.uah.aut.srg.micobs.svm.vcd;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see es.uah.aut.srg.micobs.svm.vcd.vcdPackage
 * @generated
 */
public interface vcdFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	vcdFactory eINSTANCE = es.uah.aut.srg.micobs.svm.vcd.impl.vcdFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>VVCD List</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>VVCD List</em>'.
	 * @generated
	 */
	VVCDList createVVCDList();

	/**
	 * Returns a new object of class '<em>VVCD Items</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>VVCD Items</em>'.
	 * @generated
	 */
	VVCDItems createVVCDItems();

	/**
	 * Returns a new object of class '<em>VVCD Item</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>VVCD Item</em>'.
	 * @generated
	 */
	VVCDItem createVVCDItem();

	/**
	 * Returns a new object of class '<em>VVCD Parent Ref Item</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>VVCD Parent Ref Item</em>'.
	 * @generated
	 */
	VVCDParentRefItem createVVCDParentRefItem();

	/**
	 * Returns a new object of class '<em>VVCD Parent Items</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>VVCD Parent Items</em>'.
	 * @generated
	 */
	VVCDParentItems createVVCDParentItems();

	/**
	 * Returns a new object of class '<em>VVCD Parent Item</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>VVCD Parent Item</em>'.
	 * @generated
	 */
	VVCDParentItem createVVCDParentItem();

	/**
	 * Returns a new object of class '<em>VVCD Ref Item</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>VVCD Ref Item</em>'.
	 * @generated
	 */
	VVCDRefItem createVVCDRefItem();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	vcdPackage getvcdPackage();

} //vcdFactory
