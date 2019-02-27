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
package es.uah.aut.srg.micobs.svm.sss.impl;

import es.uah.aut.srg.micobs.svm.sss.VSSSSecurityRequirement;
import es.uah.aut.srg.micobs.svm.sss.sssPackage;
import es.uah.aut.srg.micobs.svm.tdm.VTraceableDocumentAbstractSection;
import es.uah.aut.srg.micobs.svm.tdm.impl.VTraceableDocumentFixedGroupImpl;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>VSSS Security Requirement</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class VSSSSecurityRequirementImpl extends VTraceableDocumentFixedGroupImpl implements VSSSSecurityRequirement {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VSSSSecurityRequirementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return sssPackage.Literals.VSSS_SECURITY_REQUIREMENT;
	}
	
	@Override
	public VTraceableDocumentAbstractSection getSection() {
		return (VTraceableDocumentAbstractSection)eContainer();
	}

} //VSSSSecurityRequirementImpl
