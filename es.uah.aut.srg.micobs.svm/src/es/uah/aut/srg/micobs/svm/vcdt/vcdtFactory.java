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
package es.uah.aut.srg.micobs.svm.vcdt;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see es.uah.aut.srg.micobs.svm.vcdt.vcdtPackage
 * @generated
 */
public interface vcdtFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	vcdtFactory eINSTANCE = es.uah.aut.srg.micobs.svm.vcdt.impl.vcdtFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>VCDT List</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>VCDT List</em>'.
	 * @generated
	 */
	VCDTList createVCDTList();

	/**
	 * Returns a new object of class '<em>VCDT Items</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>VCDT Items</em>'.
	 * @generated
	 */
	VCDTItems createVCDTItems();

	/**
	 * Returns a new object of class '<em>VCDT Item</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>VCDT Item</em>'.
	 * @generated
	 */
	VCDTItem createVCDTItem();

	/**
	 * Returns a new object of class '<em>VCDT Parent Ref Item</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>VCDT Parent Ref Item</em>'.
	 * @generated
	 */
	VCDTParentRefItem createVCDTParentRefItem();

	/**
	 * Returns a new object of class '<em>VCDT Parent Items</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>VCDT Parent Items</em>'.
	 * @generated
	 */
	VCDTParentItems createVCDTParentItems();

	/**
	 * Returns a new object of class '<em>VCDT Parent Item</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>VCDT Parent Item</em>'.
	 * @generated
	 */
	VCDTParentItem createVCDTParentItem();

	/**
	 * Returns a new object of class '<em>VCDT Ref Item</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>VCDT Ref Item</em>'.
	 * @generated
	 */
	VCDTRefItem createVCDTRefItem();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	vcdtPackage getvcdtPackage();

} //vcdtFactory
