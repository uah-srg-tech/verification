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
package es.uah.aut.srg.micobs.svm.tmtemplate;

import es.uah.aut.srg.tmtcif.tm.TMTCIFTM;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>VTM Template</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link es.uah.aut.srg.micobs.svm.tmtemplate.VTMTemplate#getName <em>Name</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.svm.tmtemplate.VTMTemplate#getTm <em>Tm</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.svm.tmtemplate.VTMTemplate#getFields <em>Fields</em>}</li>
 * </ul>
 *
 * @see es.uah.aut.srg.micobs.svm.tmtemplate.tmtemplatePackage#getVTMTemplate()
 * @model
 * @generated
 */
public interface VTMTemplate extends EObject {
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
	 * @see es.uah.aut.srg.micobs.svm.tmtemplate.tmtemplatePackage#getVTMTemplate_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.micobs.svm.tmtemplate.VTMTemplate#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Tm</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tm</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tm</em>' reference.
	 * @see #setTm(TMTCIFTM)
	 * @see es.uah.aut.srg.micobs.svm.tmtemplate.tmtemplatePackage#getVTMTemplate_Tm()
	 * @model required="true"
	 * @generated
	 */
	TMTCIFTM getTm();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.micobs.svm.tmtemplate.VTMTemplate#getTm <em>Tm</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tm</em>' reference.
	 * @see #getTm()
	 * @generated
	 */
	void setTm(TMTCIFTM value);

	/**
	 * Returns the value of the '<em><b>Fields</b></em>' containment reference list.
	 * The list contents are of type {@link es.uah.aut.srg.micobs.svm.tmtemplate.VTMTemplateField}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fields</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fields</em>' containment reference list.
	 * @see es.uah.aut.srg.micobs.svm.tmtemplate.tmtemplatePackage#getVTMTemplate_Fields()
	 * @model containment="true"
	 * @generated
	 */
	EList<VTMTemplateField> getFields();

} // VTMTemplate
