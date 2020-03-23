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
package es.uah.aut.srg.micobs.svm.tmtemplate.impl;

import es.uah.aut.srg.micobs.svm.tmtemplate.VTMTemplate;
import es.uah.aut.srg.micobs.svm.tmtemplate.VTMTemplateField;
import es.uah.aut.srg.micobs.svm.tmtemplate.tmtemplatePackage;

import es.uah.aut.srg.tmtcif.tm.TMTCIFTM;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>VTM Template</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link es.uah.aut.srg.micobs.svm.tmtemplate.impl.VTMTemplateImpl#getName <em>Name</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.svm.tmtemplate.impl.VTMTemplateImpl#getTm <em>Tm</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.svm.tmtemplate.impl.VTMTemplateImpl#getFields <em>Fields</em>}</li>
 * </ul>
 *
 * @generated
 */
public class VTMTemplateImpl extends MinimalEObjectImpl.Container implements VTMTemplate {
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
	 * The cached value of the '{@link #getTm() <em>Tm</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTm()
	 * @generated
	 * @ordered
	 */
	protected TMTCIFTM tm;

	/**
	 * The cached value of the '{@link #getFields() <em>Fields</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFields()
	 * @generated
	 * @ordered
	 */
	protected EList<VTMTemplateField> fields;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VTMTemplateImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return tmtemplatePackage.Literals.VTM_TEMPLATE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, tmtemplatePackage.VTM_TEMPLATE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TMTCIFTM getTm() {
		if (tm != null && tm.eIsProxy()) {
			InternalEObject oldTm = (InternalEObject)tm;
			tm = (TMTCIFTM)eResolveProxy(oldTm);
			if (tm != oldTm) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, tmtemplatePackage.VTM_TEMPLATE__TM, oldTm, tm));
			}
		}
		return tm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TMTCIFTM basicGetTm() {
		return tm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTm(TMTCIFTM newTm) {
		TMTCIFTM oldTm = tm;
		tm = newTm;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, tmtemplatePackage.VTM_TEMPLATE__TM, oldTm, tm));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<VTMTemplateField> getFields() {
		if (fields == null) {
			fields = new EObjectContainmentEList<VTMTemplateField>(VTMTemplateField.class, this, tmtemplatePackage.VTM_TEMPLATE__FIELDS);
		}
		return fields;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case tmtemplatePackage.VTM_TEMPLATE__FIELDS:
				return ((InternalEList<?>)getFields()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case tmtemplatePackage.VTM_TEMPLATE__NAME:
				return getName();
			case tmtemplatePackage.VTM_TEMPLATE__TM:
				if (resolve) return getTm();
				return basicGetTm();
			case tmtemplatePackage.VTM_TEMPLATE__FIELDS:
				return getFields();
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
			case tmtemplatePackage.VTM_TEMPLATE__NAME:
				setName((String)newValue);
				return;
			case tmtemplatePackage.VTM_TEMPLATE__TM:
				setTm((TMTCIFTM)newValue);
				return;
			case tmtemplatePackage.VTM_TEMPLATE__FIELDS:
				getFields().clear();
				getFields().addAll((Collection<? extends VTMTemplateField>)newValue);
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
			case tmtemplatePackage.VTM_TEMPLATE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case tmtemplatePackage.VTM_TEMPLATE__TM:
				setTm((TMTCIFTM)null);
				return;
			case tmtemplatePackage.VTM_TEMPLATE__FIELDS:
				getFields().clear();
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
			case tmtemplatePackage.VTM_TEMPLATE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case tmtemplatePackage.VTM_TEMPLATE__TM:
				return tm != null;
			case tmtemplatePackage.VTM_TEMPLATE__FIELDS:
				return fields != null && !fields.isEmpty();
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
		result.append(')');
		return result.toString();
	}

} //VTMTemplateImpl
