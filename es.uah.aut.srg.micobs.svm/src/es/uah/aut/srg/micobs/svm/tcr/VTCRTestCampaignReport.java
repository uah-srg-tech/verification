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

import es.uah.aut.srg.micobs.doctpl.doctpl.DDocumentTemplate;
import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>VTCR Test Campaign Report</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link es.uah.aut.srg.micobs.svm.tcr.VTCRTestCampaignReport#getTestReports <em>Test Reports</em>}</li>
 * </ul>
 *
 * @see es.uah.aut.srg.micobs.svm.tcr.tcrPackage#getVTCRTestCampaignReport()
 * @model
 * @generated
 */
public interface VTCRTestCampaignReport extends DDocumentTemplate {
	/**
	 * Returns the value of the '<em><b>Test Reports</b></em>' containment reference list.
	 * The list contents are of type {@link es.uah.aut.srg.micobs.svm.tcr.VTCRTestReport}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Test Reports</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Test Reports</em>' containment reference list.
	 * @see es.uah.aut.srg.micobs.svm.tcr.tcrPackage#getVTCRTestCampaignReport_TestReports()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<VTCRTestReport> getTestReports();

} // VTCRTestCampaignReport
