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
package es.uah.aut.srg.micobs.svm.tcr;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see es.uah.aut.srg.micobs.svm.tcr.tcrPackage
 * @generated
 */
public interface tcrFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	tcrFactory eINSTANCE = es.uah.aut.srg.micobs.svm.tcr.impl.tcrFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>VTCR Test Campaign Report</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>VTCR Test Campaign Report</em>'.
	 * @generated
	 */
	VTCRTestCampaignReport createVTCRTestCampaignReport();

	/**
	 * Returns a new object of class '<em>VTCR Test Report</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>VTCR Test Report</em>'.
	 * @generated
	 */
	VTCRTestReport createVTCRTestReport();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	tcrPackage gettcrPackage();

} //tcrFactory
