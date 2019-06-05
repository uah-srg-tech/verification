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
package es.uah.aut.srg.micobs.svm.vdm;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see es.uah.aut.srg.micobs.svm.vdm.vdmPackage
 * @generated
 */
public interface vdmFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	vdmFactory eINSTANCE = es.uah.aut.srg.micobs.svm.vdm.impl.vdmFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>VValidation Document</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>VValidation Document</em>'.
	 * @generated
	 */
	VValidationDocument createVValidationDocument();

	/**
	 * Returns a new object of class '<em>VValidation Document Abstract Group</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>VValidation Document Abstract Group</em>'.
	 * @generated
	 */
	VValidationDocumentAbstractGroup createVValidationDocumentAbstractGroup();

	/**
	 * Returns a new object of class '<em>VValidation Document Fixed Group</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>VValidation Document Fixed Group</em>'.
	 * @generated
	 */
	VValidationDocumentFixedGroup createVValidationDocumentFixedGroup();

	/**
	 * Returns a new object of class '<em>VValidation Document Instantiable Group</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>VValidation Document Instantiable Group</em>'.
	 * @generated
	 */
	VValidationDocumentInstantiableGroup createVValidationDocumentInstantiableGroup();

	/**
	 * Returns a new object of class '<em>VValidation Document Abstract Item</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>VValidation Document Abstract Item</em>'.
	 * @generated
	 */
	VValidationDocumentAbstractItem createVValidationDocumentAbstractItem();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	vdmPackage getvdmPackage();

} //vdmFactory
