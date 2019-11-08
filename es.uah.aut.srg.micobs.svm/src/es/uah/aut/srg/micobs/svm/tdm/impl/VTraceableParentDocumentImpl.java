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
package es.uah.aut.srg.micobs.svm.tdm.impl;

import es.uah.aut.srg.micobs.svm.tdm.VTraceableDocument;
import es.uah.aut.srg.micobs.svm.tdm.VTraceableDocumentAbstractItem;
import es.uah.aut.srg.micobs.svm.tdm.VTraceableParentDocument;
import es.uah.aut.srg.micobs.svm.tdm.tdmPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>VTraceable Parent Document</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link es.uah.aut.srg.micobs.svm.tdm.impl.VTraceableParentDocumentImpl#getDocument <em>Document</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.svm.tdm.impl.VTraceableParentDocumentImpl#getNotApplicableItem <em>Not Applicable Item</em>}</li>
 * </ul>
 *
 * @generated
 */
public class VTraceableParentDocumentImpl extends MinimalEObjectImpl.Container implements VTraceableParentDocument {
	/**
	 * The cached value of the '{@link #getDocument() <em>Document</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDocument()
	 * @generated
	 * @ordered
	 */
	protected VTraceableDocument document;

	/**
	 * The cached value of the '{@link #getNotApplicableItem() <em>Not Applicable Item</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNotApplicableItem()
	 * @generated
	 * @ordered
	 */
	protected EList<VTraceableDocumentAbstractItem> notApplicableItem;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VTraceableParentDocumentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return tdmPackage.Literals.VTRACEABLE_PARENT_DOCUMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VTraceableDocument getDocument() {
		if (document != null && document.eIsProxy()) {
			InternalEObject oldDocument = (InternalEObject)document;
			document = (VTraceableDocument)eResolveProxy(oldDocument);
			if (document != oldDocument) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, tdmPackage.VTRACEABLE_PARENT_DOCUMENT__DOCUMENT, oldDocument, document));
			}
		}
		return document;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VTraceableDocument basicGetDocument() {
		return document;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDocument(VTraceableDocument newDocument) {
		VTraceableDocument oldDocument = document;
		document = newDocument;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, tdmPackage.VTRACEABLE_PARENT_DOCUMENT__DOCUMENT, oldDocument, document));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<VTraceableDocumentAbstractItem> getNotApplicableItem() {
		if (notApplicableItem == null) {
			notApplicableItem = new EObjectResolvingEList<VTraceableDocumentAbstractItem>(VTraceableDocumentAbstractItem.class, this, tdmPackage.VTRACEABLE_PARENT_DOCUMENT__NOT_APPLICABLE_ITEM);
		}
		return notApplicableItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case tdmPackage.VTRACEABLE_PARENT_DOCUMENT__DOCUMENT:
				if (resolve) return getDocument();
				return basicGetDocument();
			case tdmPackage.VTRACEABLE_PARENT_DOCUMENT__NOT_APPLICABLE_ITEM:
				return getNotApplicableItem();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case tdmPackage.VTRACEABLE_PARENT_DOCUMENT__DOCUMENT:
				setDocument((VTraceableDocument)newValue);
				return;
			case tdmPackage.VTRACEABLE_PARENT_DOCUMENT__NOT_APPLICABLE_ITEM:
				getNotApplicableItem().clear();
				getNotApplicableItem().addAll((Collection<? extends VTraceableDocumentAbstractItem>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case tdmPackage.VTRACEABLE_PARENT_DOCUMENT__DOCUMENT:
				setDocument((VTraceableDocument)null);
				return;
			case tdmPackage.VTRACEABLE_PARENT_DOCUMENT__NOT_APPLICABLE_ITEM:
				getNotApplicableItem().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case tdmPackage.VTRACEABLE_PARENT_DOCUMENT__DOCUMENT:
				return document != null;
			case tdmPackage.VTRACEABLE_PARENT_DOCUMENT__NOT_APPLICABLE_ITEM:
				return notApplicableItem != null && !notApplicableItem.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //VTraceableParentDocumentImpl
