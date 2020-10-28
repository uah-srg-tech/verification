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
package es.uah.aut.srg.micobs.svm.svr;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see es.uah.aut.srg.micobs.svm.svr.svrPackage
 * @generated
 */
public interface svrFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	svrFactory eINSTANCE = es.uah.aut.srg.micobs.svm.svr.impl.svrFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>VSVR Document</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>VSVR Document</em>'.
	 * @generated
	 */
	VSVRDocument createVSVRDocument();

	/**
	 * Returns a new object of class '<em>VSVRTB Cs TB Ds</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>VSVRTB Cs TB Ds</em>'.
	 * @generated
	 */
	VSVRTBCsTBDs createVSVRTBCsTBDs();

	/**
	 * Returns a new object of class '<em>VSVR Introduction</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>VSVR Introduction</em>'.
	 * @generated
	 */
	VSVRIntroduction createVSVRIntroduction();

	/**
	 * Returns a new object of class '<em>VSVR Applicable Documents</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>VSVR Applicable Documents</em>'.
	 * @generated
	 */
	VSVRApplicableDocuments createVSVRApplicableDocuments();

	/**
	 * Returns a new object of class '<em>VSVR Reference Documents</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>VSVR Reference Documents</em>'.
	 * @generated
	 */
	VSVRReferenceDocuments createVSVRReferenceDocuments();

	/**
	 * Returns a new object of class '<em>VSVR Terms Definitions Abbreviations</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>VSVR Terms Definitions Abbreviations</em>'.
	 * @generated
	 */
	VSVRTermsDefinitionsAbbreviations createVSVRTermsDefinitionsAbbreviations();

	/**
	 * Returns a new object of class '<em>VSVR Term</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>VSVR Term</em>'.
	 * @generated
	 */
	VSVRTerm createVSVRTerm();

	/**
	 * Returns a new object of class '<em>VSVR Definition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>VSVR Definition</em>'.
	 * @generated
	 */
	VSVRDefinition createVSVRDefinition();

	/**
	 * Returns a new object of class '<em>VSVR Abbreviation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>VSVR Abbreviation</em>'.
	 * @generated
	 */
	VSVRAbbreviation createVSVRAbbreviation();

	/**
	 * Returns a new object of class '<em>VSVR Fixed Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>VSVR Fixed Section</em>'.
	 * @generated
	 */
	VSVRFixedSection createVSVRFixedSection();

	/**
	 * Returns a new object of class '<em>VSVR Instantiable Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>VSVR Instantiable Section</em>'.
	 * @generated
	 */
	VSVRInstantiableSection createVSVRInstantiableSection();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	svrPackage getsvrPackage();

} //svrFactory
