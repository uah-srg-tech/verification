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
package es.uah.aut.srg.micobs.svm.testsetup;

import es.uah.aut.srg.micobs.doctpl.doctpl.DRun;

import es.uah.aut.srg.tmtcif.tcheader.TMTCIFTCHeader;

import es.uah.aut.srg.tmtcif.tmheader.TMTCIFTMHeader;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>VTest Setup Interface</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link es.uah.aut.srg.micobs.svm.testsetup.VTestSetupInterface#getName <em>Name</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.svm.testsetup.VTestSetupInterface#getDescription <em>Description</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.svm.testsetup.VTestSetupInterface#getTcHeader <em>Tc Header</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.svm.testsetup.VTestSetupInterface#getTmHeader <em>Tm Header</em>}</li>
 * </ul>
 *
 * @see es.uah.aut.srg.micobs.svm.testsetup.testsetupPackage#getVTestSetupInterface()
 * @model
 * @generated
 */
public interface VTestSetupInterface extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see es.uah.aut.srg.micobs.svm.testsetup.testsetupPackage#getVTestSetupInterface_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.micobs.svm.testsetup.VTestSetupInterface#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' containment reference.
	 * @see #setDescription(DRun)
	 * @see es.uah.aut.srg.micobs.svm.testsetup.testsetupPackage#getVTestSetupInterface_Description()
	 * @model containment="true" required="true"
	 * @generated
	 */
	DRun getDescription();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.micobs.svm.testsetup.VTestSetupInterface#getDescription <em>Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' containment reference.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(DRun value);

	/**
	 * Returns the value of the '<em><b>Tc Header</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tc Header</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tc Header</em>' reference.
	 * @see #setTcHeader(TMTCIFTCHeader)
	 * @see es.uah.aut.srg.micobs.svm.testsetup.testsetupPackage#getVTestSetupInterface_TcHeader()
	 * @model required="true"
	 * @generated
	 */
	TMTCIFTCHeader getTcHeader();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.micobs.svm.testsetup.VTestSetupInterface#getTcHeader <em>Tc Header</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tc Header</em>' reference.
	 * @see #getTcHeader()
	 * @generated
	 */
	void setTcHeader(TMTCIFTCHeader value);

	/**
	 * Returns the value of the '<em><b>Tm Header</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tm Header</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tm Header</em>' reference.
	 * @see #setTmHeader(TMTCIFTMHeader)
	 * @see es.uah.aut.srg.micobs.svm.testsetup.testsetupPackage#getVTestSetupInterface_TmHeader()
	 * @model required="true"
	 * @generated
	 */
	TMTCIFTMHeader getTmHeader();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.micobs.svm.testsetup.VTestSetupInterface#getTmHeader <em>Tm Header</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tm Header</em>' reference.
	 * @see #getTmHeader()
	 * @generated
	 */
	void setTmHeader(TMTCIFTMHeader value);

} // VTestSetupInterface
