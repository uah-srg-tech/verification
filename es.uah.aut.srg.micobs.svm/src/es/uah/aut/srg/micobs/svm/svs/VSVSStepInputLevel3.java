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
 * A representation of the model object '<em><b>VSVS Step Input Level3</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link es.uah.aut.srg.micobs.svm.svs.VSVSStepInputLevel3#getLevel3 <em>Level3</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.svm.svs.VSVSStepInputLevel3#getApp_to_level3 <em>App to level3</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.svm.svs.VSVSStepInputLevel3#getLevel2 <em>Level2</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.svm.svs.VSVSStepInputLevel3#getLevel3_to_level2 <em>Level3 to level2</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.svm.svs.VSVSStepInputLevel3#getLevel1 <em>Level1</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.svm.svs.VSVSStepInputLevel3#getLevel2_to_level1 <em>Level2 to level1</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.svm.svs.VSVSStepInputLevel3#getLevel0 <em>Level0</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.svm.svs.VSVSStepInputLevel3#getLevel1_to_level0 <em>Level1 to level0</em>}</li>
 * </ul>
 *
 * @see es.uah.aut.srg.micobs.svm.svs.svsPackage#getVSVSStepInputLevel3()
 * @model
 * @generated
 */
public interface VSVSStepInputLevel3 extends VSVSStepInput {
	/**
	 * Returns the value of the '<em><b>Level3</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Level3</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Level3</em>' reference.
	 * @see #setLevel3(TMTCIFFormatFormat)
	 * @see es.uah.aut.srg.micobs.svm.svs.svsPackage#getVSVSStepInputLevel3_Level3()
	 * @model
	 * @generated
	 */
	TMTCIFFormatFormat getLevel3();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.micobs.svm.svs.VSVSStepInputLevel3#getLevel3 <em>Level3</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Level3</em>' reference.
	 * @see #getLevel3()
	 * @generated
	 */
	void setLevel3(TMTCIFFormatFormat value);

	/**
	 * Returns the value of the '<em><b>App to level3</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>App to level3</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>App to level3</em>' reference.
	 * @see #setApp_to_level3(TMTCIFExportExport)
	 * @see es.uah.aut.srg.micobs.svm.svs.svsPackage#getVSVSStepInputLevel3_App_to_level3()
	 * @model
	 * @generated
	 */
	TMTCIFExportExport getApp_to_level3();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.micobs.svm.svs.VSVSStepInputLevel3#getApp_to_level3 <em>App to level3</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>App to level3</em>' reference.
	 * @see #getApp_to_level3()
	 * @generated
	 */
	void setApp_to_level3(TMTCIFExportExport value);

	/**
	 * Returns the value of the '<em><b>Level2</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Level2</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Level2</em>' reference.
	 * @see #setLevel2(TMTCIFFormatFormat)
	 * @see es.uah.aut.srg.micobs.svm.svs.svsPackage#getVSVSStepInputLevel3_Level2()
	 * @model
	 * @generated
	 */
	TMTCIFFormatFormat getLevel2();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.micobs.svm.svs.VSVSStepInputLevel3#getLevel2 <em>Level2</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Level2</em>' reference.
	 * @see #getLevel2()
	 * @generated
	 */
	void setLevel2(TMTCIFFormatFormat value);

	/**
	 * Returns the value of the '<em><b>Level3 to level2</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Level3 to level2</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Level3 to level2</em>' reference.
	 * @see #setLevel3_to_level2(TMTCIFExportExport)
	 * @see es.uah.aut.srg.micobs.svm.svs.svsPackage#getVSVSStepInputLevel3_Level3_to_level2()
	 * @model
	 * @generated
	 */
	TMTCIFExportExport getLevel3_to_level2();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.micobs.svm.svs.VSVSStepInputLevel3#getLevel3_to_level2 <em>Level3 to level2</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Level3 to level2</em>' reference.
	 * @see #getLevel3_to_level2()
	 * @generated
	 */
	void setLevel3_to_level2(TMTCIFExportExport value);

	/**
	 * Returns the value of the '<em><b>Level1</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Level1</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Level1</em>' reference.
	 * @see #setLevel1(TMTCIFFormatFormat)
	 * @see es.uah.aut.srg.micobs.svm.svs.svsPackage#getVSVSStepInputLevel3_Level1()
	 * @model
	 * @generated
	 */
	TMTCIFFormatFormat getLevel1();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.micobs.svm.svs.VSVSStepInputLevel3#getLevel1 <em>Level1</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Level1</em>' reference.
	 * @see #getLevel1()
	 * @generated
	 */
	void setLevel1(TMTCIFFormatFormat value);

	/**
	 * Returns the value of the '<em><b>Level2 to level1</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Level2 to level1</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Level2 to level1</em>' reference.
	 * @see #setLevel2_to_level1(TMTCIFExportExport)
	 * @see es.uah.aut.srg.micobs.svm.svs.svsPackage#getVSVSStepInputLevel3_Level2_to_level1()
	 * @model
	 * @generated
	 */
	TMTCIFExportExport getLevel2_to_level1();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.micobs.svm.svs.VSVSStepInputLevel3#getLevel2_to_level1 <em>Level2 to level1</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Level2 to level1</em>' reference.
	 * @see #getLevel2_to_level1()
	 * @generated
	 */
	void setLevel2_to_level1(TMTCIFExportExport value);

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
	 * @see es.uah.aut.srg.micobs.svm.svs.svsPackage#getVSVSStepInputLevel3_Level0()
	 * @model
	 * @generated
	 */
	TMTCIFFormatFormat getLevel0();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.micobs.svm.svs.VSVSStepInputLevel3#getLevel0 <em>Level0</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Level0</em>' reference.
	 * @see #getLevel0()
	 * @generated
	 */
	void setLevel0(TMTCIFFormatFormat value);

	/**
	 * Returns the value of the '<em><b>Level1 to level0</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Level1 to level0</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Level1 to level0</em>' reference.
	 * @see #setLevel1_to_level0(TMTCIFExportExport)
	 * @see es.uah.aut.srg.micobs.svm.svs.svsPackage#getVSVSStepInputLevel3_Level1_to_level0()
	 * @model
	 * @generated
	 */
	TMTCIFExportExport getLevel1_to_level0();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.micobs.svm.svs.VSVSStepInputLevel3#getLevel1_to_level0 <em>Level1 to level0</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Level1 to level0</em>' reference.
	 * @see #getLevel1_to_level0()
	 * @generated
	 */
	void setLevel1_to_level0(TMTCIFExportExport value);

} // VSVSStepInputLevel3
