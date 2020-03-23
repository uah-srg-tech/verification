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
package es.uah.aut.srg.micobs.svm.vdm.impl;

import es.uah.aut.srg.micobs.svm.tdm.VTraceableDocument;
import es.uah.aut.srg.micobs.svm.vdm.VValidationDocument;
import es.uah.aut.srg.micobs.svm.vdm.VValidationDocumentAbstractGroup;
import es.uah.aut.srg.micobs.svm.vdm.vdmPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>VValidation Document</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link es.uah.aut.srg.micobs.svm.vdm.impl.VValidationDocumentImpl#getName <em>Name</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.svm.vdm.impl.VValidationDocumentImpl#getId <em>Id</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.svm.vdm.impl.VValidationDocumentImpl#getIssue <em>Issue</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.svm.vdm.impl.VValidationDocumentImpl#getRevision <em>Revision</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.svm.vdm.impl.VValidationDocumentImpl#getDate <em>Date</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.svm.vdm.impl.VValidationDocumentImpl#getParents <em>Parents</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.svm.vdm.impl.VValidationDocumentImpl#getGroups <em>Groups</em>}</li>
 * </ul>
 *
 * @generated
 */
public class VValidationDocumentImpl extends MinimalEObjectImpl.Container implements VValidationDocument {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected String id = ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getIssue() <em>Issue</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIssue()
	 * @generated
	 * @ordered
	 */
	protected static final String ISSUE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIssue() <em>Issue</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIssue()
	 * @generated
	 * @ordered
	 */
	protected String issue = ISSUE_EDEFAULT;

	/**
	 * The default value of the '{@link #getRevision() <em>Revision</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRevision()
	 * @generated
	 * @ordered
	 */
	protected static final String REVISION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRevision() <em>Revision</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRevision()
	 * @generated
	 * @ordered
	 */
	protected String revision = REVISION_EDEFAULT;

	/**
	 * The default value of the '{@link #getDate() <em>Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDate()
	 * @generated
	 * @ordered
	 */
	protected static final String DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDate() <em>Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDate()
	 * @generated
	 * @ordered
	 */
	protected String date = DATE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getParents() <em>Parents</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParents()
	 * @generated
	 * @ordered
	 */
	protected EList<VTraceableDocument> parents;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VValidationDocumentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return vdmPackage.Literals.VVALIDATION_DOCUMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, vdmPackage.VVALIDATION_DOCUMENT__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setId(String newId) {
		String oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, vdmPackage.VVALIDATION_DOCUMENT__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getIssue() {
		return issue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIssue(String newIssue) {
		String oldIssue = issue;
		issue = newIssue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, vdmPackage.VVALIDATION_DOCUMENT__ISSUE, oldIssue, issue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRevision() {
		return revision;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRevision(String newRevision) {
		String oldRevision = revision;
		revision = newRevision;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, vdmPackage.VVALIDATION_DOCUMENT__REVISION, oldRevision, revision));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDate() {
		return date;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDate(String newDate) {
		String oldDate = date;
		date = newDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, vdmPackage.VVALIDATION_DOCUMENT__DATE, oldDate, date));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<VTraceableDocument> getParents() {
		if (parents == null) {
			parents = new EObjectResolvingEList<VTraceableDocument>(VTraceableDocument.class, this, vdmPackage.VVALIDATION_DOCUMENT__PARENTS);
		}
		return parents;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<VValidationDocumentAbstractGroup> getGroups() {
		// TODO: implement this method to return the 'Groups' reference list
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
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case vdmPackage.VVALIDATION_DOCUMENT__NAME:
				return getName();
			case vdmPackage.VVALIDATION_DOCUMENT__ID:
				return getId();
			case vdmPackage.VVALIDATION_DOCUMENT__ISSUE:
				return getIssue();
			case vdmPackage.VVALIDATION_DOCUMENT__REVISION:
				return getRevision();
			case vdmPackage.VVALIDATION_DOCUMENT__DATE:
				return getDate();
			case vdmPackage.VVALIDATION_DOCUMENT__PARENTS:
				return getParents();
			case vdmPackage.VVALIDATION_DOCUMENT__GROUPS:
				return getGroups();
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
			case vdmPackage.VVALIDATION_DOCUMENT__NAME:
				setName((String)newValue);
				return;
			case vdmPackage.VVALIDATION_DOCUMENT__ID:
				setId((String)newValue);
				return;
			case vdmPackage.VVALIDATION_DOCUMENT__ISSUE:
				setIssue((String)newValue);
				return;
			case vdmPackage.VVALIDATION_DOCUMENT__REVISION:
				setRevision((String)newValue);
				return;
			case vdmPackage.VVALIDATION_DOCUMENT__DATE:
				setDate((String)newValue);
				return;
			case vdmPackage.VVALIDATION_DOCUMENT__PARENTS:
				getParents().clear();
				getParents().addAll((Collection<? extends VTraceableDocument>)newValue);
				return;
			case vdmPackage.VVALIDATION_DOCUMENT__GROUPS:
				getGroups().clear();
				getGroups().addAll((Collection<? extends VValidationDocumentAbstractGroup>)newValue);
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
			case vdmPackage.VVALIDATION_DOCUMENT__NAME:
				setName(NAME_EDEFAULT);
				return;
			case vdmPackage.VVALIDATION_DOCUMENT__ID:
				setId(ID_EDEFAULT);
				return;
			case vdmPackage.VVALIDATION_DOCUMENT__ISSUE:
				setIssue(ISSUE_EDEFAULT);
				return;
			case vdmPackage.VVALIDATION_DOCUMENT__REVISION:
				setRevision(REVISION_EDEFAULT);
				return;
			case vdmPackage.VVALIDATION_DOCUMENT__DATE:
				setDate(DATE_EDEFAULT);
				return;
			case vdmPackage.VVALIDATION_DOCUMENT__PARENTS:
				getParents().clear();
				return;
			case vdmPackage.VVALIDATION_DOCUMENT__GROUPS:
				getGroups().clear();
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
			case vdmPackage.VVALIDATION_DOCUMENT__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case vdmPackage.VVALIDATION_DOCUMENT__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case vdmPackage.VVALIDATION_DOCUMENT__ISSUE:
				return ISSUE_EDEFAULT == null ? issue != null : !ISSUE_EDEFAULT.equals(issue);
			case vdmPackage.VVALIDATION_DOCUMENT__REVISION:
				return REVISION_EDEFAULT == null ? revision != null : !REVISION_EDEFAULT.equals(revision);
			case vdmPackage.VVALIDATION_DOCUMENT__DATE:
				return DATE_EDEFAULT == null ? date != null : !DATE_EDEFAULT.equals(date);
			case vdmPackage.VVALIDATION_DOCUMENT__PARENTS:
				return parents != null && !parents.isEmpty();
			case vdmPackage.VVALIDATION_DOCUMENT__GROUPS:
				return !getGroups().isEmpty();
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
		result.append(" (name: ");
		result.append(name);
		result.append(", id: ");
		result.append(id);
		result.append(", issue: ");
		result.append(issue);
		result.append(", revision: ");
		result.append(revision);
		result.append(", date: ");
		result.append(date);
		result.append(')');
		return result.toString();
	}

} //VValidationDocumentImpl
