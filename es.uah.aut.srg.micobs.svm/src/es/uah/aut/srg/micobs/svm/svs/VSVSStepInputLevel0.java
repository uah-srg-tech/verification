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
package es.uah.aut.srg.micobs.svm.svs;

import es.uah.aut.srg.tmtcif.export.TMTCIFExportExport;

import es.uah.aut.srg.tmtcif.format.TMTCIFFormatFormat;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>VSVS Step Input Level0</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link es.uah.aut.srg.micobs.svm.svs.VSVSStepInputLevel0#getLevel0 <em>Level0</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.svm.svs.VSVSStepInputLevel0#getApp_to_level0 <em>App to level0</em>}</li>
 * </ul>
 *
 * @see es.uah.aut.srg.micobs.svm.svs.svsPackage#getVSVSStepInputLevel0()
 * @model
 * @generated
 */
public interface VSVSStepInputLevel0 extends VSVSStepInput {
	/**
	 * Returns the value of the '<em><b>Level0</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Level0</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Level0</em>' reference.
	 * @see #setLevel0(TMTCIFFormatFormat)
	 * @see es.uah.aut.srg.micobs.svm.svs.svsPackage#getVSVSStepInputLevel0_Level0()
	 * @model
	 * @generated
	 */
	TMTCIFFormatFormat getLevel0();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.micobs.svm.svs.VSVSStepInputLevel0#getLevel0 <em>Level0</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Level0</em>' reference.
	 * @see #getLevel0()
	 * @generated
	 */
	void setLevel0(TMTCIFFormatFormat value);

	/**
	 * Returns the value of the '<em><b>App to level0</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>App to level0</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>App to level0</em>' reference.
	 * @see #setApp_to_level0(TMTCIFExportExport)
	 * @see es.uah.aut.srg.micobs.svm.svs.svsPackage#getVSVSStepInputLevel0_App_to_level0()
	 * @model
	 * @generated
	 */
	TMTCIFExportExport getApp_to_level0();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.micobs.svm.svs.VSVSStepInputLevel0#getApp_to_level0 <em>App to level0</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>App to level0</em>' reference.
	 * @see #getApp_to_level0()
	 * @generated
	 */
	void setApp_to_level0(TMTCIFExportExport value);

} // VSVSStepInputLevel0
