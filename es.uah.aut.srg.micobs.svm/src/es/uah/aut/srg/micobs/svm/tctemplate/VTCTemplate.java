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
package es.uah.aut.srg.micobs.svm.tctemplate;

import es.uah.aut.srg.tmtcif.tc.TMTCIFTC;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>VTC Template</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link es.uah.aut.srg.micobs.svm.tctemplate.VTCTemplate#getName <em>Name</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.svm.tctemplate.VTCTemplate#getTc <em>Tc</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.svm.tctemplate.VTCTemplate#getFields <em>Fields</em>}</li>
 * </ul>
 *
 * @see es.uah.aut.srg.micobs.svm.tctemplate.tctemplatePackage#getVTCTemplate()
 * @model
 * @generated
 */
public interface VTCTemplate extends EObject {
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
	 * @see es.uah.aut.srg.micobs.svm.tctemplate.tctemplatePackage#getVTCTemplate_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.micobs.svm.tctemplate.VTCTemplate#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Tc</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tc</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tc</em>' reference.
	 * @see #setTc(TMTCIFTC)
	 * @see es.uah.aut.srg.micobs.svm.tctemplate.tctemplatePackage#getVTCTemplate_Tc()
	 * @model required="true"
	 * @generated
	 */
	TMTCIFTC getTc();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.micobs.svm.tctemplate.VTCTemplate#getTc <em>Tc</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tc</em>' reference.
	 * @see #getTc()
	 * @generated
	 */
	void setTc(TMTCIFTC value);

	/**
	 * Returns the value of the '<em><b>Fields</b></em>' containment reference list.
	 * The list contents are of type {@link es.uah.aut.srg.micobs.svm.tctemplate.VTCTemplateField}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fields</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fields</em>' containment reference list.
	 * @see es.uah.aut.srg.micobs.svm.tctemplate.tctemplatePackage#getVTCTemplate_Fields()
	 * @model containment="true"
	 * @generated
	 */
	EList<VTCTemplateField> getFields();

} // VTCTemplate
