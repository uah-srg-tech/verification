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
package es.uah.aut.srg.micobs.svm.tdm;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see es.uah.aut.srg.micobs.svm.tdm.tdmPackage
 * @generated
 */
public interface tdmFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	tdmFactory eINSTANCE = es.uah.aut.srg.micobs.svm.tdm.impl.tdmFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>VTraceable Document</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>VTraceable Document</em>'.
	 * @generated
	 */
	VTraceableDocument createVTraceableDocument();

	/**
	 * Returns a new object of class '<em>VTraceable Document Abstract Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>VTraceable Document Abstract Section</em>'.
	 * @generated
	 */
	VTraceableDocumentAbstractSection createVTraceableDocumentAbstractSection();

	/**
	 * Returns a new object of class '<em>VTraceable Document Fixed Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>VTraceable Document Fixed Section</em>'.
	 * @generated
	 */
	VTraceableDocumentFixedSection createVTraceableDocumentFixedSection();

	/**
	 * Returns a new object of class '<em>VTraceable Document Instantiable Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>VTraceable Document Instantiable Section</em>'.
	 * @generated
	 */
	VTraceableDocumentInstantiableSection createVTraceableDocumentInstantiableSection();

	/**
	 * Returns a new object of class '<em>VTraceable Document Abstract Group</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>VTraceable Document Abstract Group</em>'.
	 * @generated
	 */
	VTraceableDocumentAbstractGroup createVTraceableDocumentAbstractGroup();

	/**
	 * Returns a new object of class '<em>VTraceable Document Fixed Group</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>VTraceable Document Fixed Group</em>'.
	 * @generated
	 */
	VTraceableDocumentFixedGroup createVTraceableDocumentFixedGroup();

	/**
	 * Returns a new object of class '<em>VTraceable Document Instantiable Group</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>VTraceable Document Instantiable Group</em>'.
	 * @generated
	 */
	VTraceableDocumentInstantiableGroup createVTraceableDocumentInstantiableGroup();

	/**
	 * Returns a new object of class '<em>VTraceable Document Item</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>VTraceable Document Item</em>'.
	 * @generated
	 */
	VTraceableDocumentItem createVTraceableDocumentItem();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	tdmPackage gettdmPackage();

} //tdmFactory
