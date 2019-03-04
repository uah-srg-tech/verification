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

import es.uah.aut.srg.micobs.svm.sss.VSSSGeneralRequirement;
import es.uah.aut.srg.micobs.svm.sss.sssPackage;
import es.uah.aut.srg.micobs.svm.tdm.VTraceableDocumentAbstractSection;
import es.uah.aut.srg.micobs.svm.tdm.VTraceableDocumentItem;
import es.uah.aut.srg.micobs.svm.tdm.tdmPackage;
import es.uah.aut.srg.micobs.svm.tdm.impl.VTraceableDocumentFixedGroupImpl;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>VSSS General Requirement</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class VSSSGeneralRequirementImpl extends VTraceableDocumentFixedGroupImpl implements VSSSGeneralRequirement {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VSSSGeneralRequirementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return sssPackage.Literals.VSSS_GENERAL_REQUIREMENT;
	}
	
	@Override
	public EList<VTraceableDocumentItem> getItems() {
		EList<VTraceableDocumentItem> items = new EObjectResolvingEList<VTraceableDocumentItem>(VTraceableDocumentItem.class,
				this, tdmPackage.VTRACEABLE_DOCUMENT_ABSTRACT_GROUP__ITEMS);
		items.add();
		return items;
	}
	
	@Override
	public VTraceableDocumentAbstractSection getSection() {
		return (VTraceableDocumentAbstractSection)eContainer();
	}

} //VSSSGeneralRequirementImpl
