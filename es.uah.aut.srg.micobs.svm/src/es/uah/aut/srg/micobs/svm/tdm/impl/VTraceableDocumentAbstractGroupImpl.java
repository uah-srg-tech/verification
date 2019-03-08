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

import es.uah.aut.srg.micobs.svm.tdm.VTraceableDocumentAbstractGroup;
import es.uah.aut.srg.micobs.svm.tdm.VTraceableDocumentAbstractSection;
import es.uah.aut.srg.micobs.svm.tdm.VTraceableDocumentItem;
import es.uah.aut.srg.micobs.svm.tdm.tdmPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>VTraceable Document Abstract Group</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link es.uah.aut.srg.micobs.svm.tdm.impl.VTraceableDocumentAbstractGroupImpl#getPrefix <em>Prefix</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.svm.tdm.impl.VTraceableDocumentAbstractGroupImpl#getItems <em>Items</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.svm.tdm.impl.VTraceableDocumentAbstractGroupImpl#getSection <em>Section</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class VTraceableDocumentAbstractGroupImpl extends MinimalEObjectImpl.Container implements VTraceableDocumentAbstractGroup {
	/**
	 * The default value of the '{@link #getPrefix() <em>Prefix</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrefix()
	 * @generated
	 * @ordered
	 */
	protected static final String PREFIX_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getPrefix() <em>Prefix</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrefix()
	 * @generated
	 * @ordered
	 */
	protected String prefix = PREFIX_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VTraceableDocumentAbstractGroupImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return tdmPackage.Literals.VTRACEABLE_DOCUMENT_ABSTRACT_GROUP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPrefix() {
		return prefix;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPrefix(String newPrefix) {
		String oldPrefix = prefix;
		prefix = newPrefix;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, tdmPackage.VTRACEABLE_DOCUMENT_ABSTRACT_GROUP__PREFIX, oldPrefix, prefix));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<VTraceableDocumentItem> getItems() {
		// TODO: implement this method to return the 'Items' reference list
		// Ensure that you remove @generated or mark it @generated NOT
		// The list is expected to implement org.eclipse.emf.ecore.util.InternalEList and org.eclipse.emf.ecore.EStructuralFeature.Setting
		// so it's likely that an appropriate subclass of org.eclipse.emf.ecore.util.EcoreEList should be used.
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VTraceableDocumentAbstractSection getSection() {
		VTraceableDocumentAbstractSection section = basicGetSection();
		return section != null && section.eIsProxy() ? (VTraceableDocumentAbstractSection)eResolveProxy((InternalEObject)section) : section;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VTraceableDocumentAbstractSection basicGetSection() {
		// TODO: implement this method to return the 'Section' reference
		// -> do not perform proxy resolution
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSection(VTraceableDocumentAbstractSection newSection) {
		// TODO: implement this method to set the 'Section' reference
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case tdmPackage.VTRACEABLE_DOCUMENT_ABSTRACT_GROUP__PREFIX:
				return getPrefix();
			case tdmPackage.VTRACEABLE_DOCUMENT_ABSTRACT_GROUP__ITEMS:
				return getItems();
			case tdmPackage.VTRACEABLE_DOCUMENT_ABSTRACT_GROUP__SECTION:
				if (resolve) return getSection();
				return basicGetSection();
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
			case tdmPackage.VTRACEABLE_DOCUMENT_ABSTRACT_GROUP__PREFIX:
				setPrefix((String)newValue);
				return;
			case tdmPackage.VTRACEABLE_DOCUMENT_ABSTRACT_GROUP__ITEMS:
				getItems().clear();
				getItems().addAll((Collection<? extends VTraceableDocumentItem>)newValue);
				return;
			case tdmPackage.VTRACEABLE_DOCUMENT_ABSTRACT_GROUP__SECTION:
				setSection((VTraceableDocumentAbstractSection)newValue);
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
			case tdmPackage.VTRACEABLE_DOCUMENT_ABSTRACT_GROUP__PREFIX:
				setPrefix(PREFIX_EDEFAULT);
				return;
			case tdmPackage.VTRACEABLE_DOCUMENT_ABSTRACT_GROUP__ITEMS:
				getItems().clear();
				return;
			case tdmPackage.VTRACEABLE_DOCUMENT_ABSTRACT_GROUP__SECTION:
				setSection((VTraceableDocumentAbstractSection)null);
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
			case tdmPackage.VTRACEABLE_DOCUMENT_ABSTRACT_GROUP__PREFIX:
				return PREFIX_EDEFAULT == null ? prefix != null : !PREFIX_EDEFAULT.equals(prefix);
			case tdmPackage.VTRACEABLE_DOCUMENT_ABSTRACT_GROUP__ITEMS:
				return !getItems().isEmpty();
			case tdmPackage.VTRACEABLE_DOCUMENT_ABSTRACT_GROUP__SECTION:
				return basicGetSection() != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (prefix: ");
		result.append(prefix);
		result.append(')');
		return result.toString();
	}

} //VTraceableDocumentAbstractGroupImpl
