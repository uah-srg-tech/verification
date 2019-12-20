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
package es.uah.aut.srg.micobs.svm.tctemplate.impl;

import es.uah.aut.srg.micobs.svm.tctemplate.VTCTemplate;
import es.uah.aut.srg.micobs.svm.tctemplate.VTCTemplateField;
import es.uah.aut.srg.micobs.svm.tctemplate.tctemplatePackage;
import es.uah.aut.srg.tmtcif.tc.TMTCIFTC;
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
 * An implementation of the model object '<em><b>VTC Template</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link es.uah.aut.srg.micobs.svm.tctemplate.impl.VTCTemplateImpl#getName <em>Name</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.svm.tctemplate.impl.VTCTemplateImpl#getTcInput <em>Tc Input</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.svm.tctemplate.impl.VTCTemplateImpl#getFields <em>Fields</em>}</li>
 * </ul>
 *
 * @generated
 */
public class VTCTemplateImpl extends MinimalEObjectImpl.Container implements VTCTemplate {
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
	 * The cached value of the '{@link #getTcInput() <em>Tc Input</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTcInput()
	 * @generated
	 * @ordered
	 */
	protected TMTCIFTC tcInput;

	/**
	 * The cached value of the '{@link #getFields() <em>Fields</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFields()
	 * @generated
	 * @ordered
	 */
	protected EList<VTCTemplateField> fields;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VTCTemplateImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return tctemplatePackage.Literals.VTC_TEMPLATE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, tctemplatePackage.VTC_TEMPLATE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TMTCIFTC getTcInput() {
		if (tcInput != null && tcInput.eIsProxy()) {
			InternalEObject oldTcInput = (InternalEObject)tcInput;
			tcInput = (TMTCIFTC)eResolveProxy(oldTcInput);
			if (tcInput != oldTcInput) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, tctemplatePackage.VTC_TEMPLATE__TC_INPUT, oldTcInput, tcInput));
			}
		}
		return tcInput;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TMTCIFTC basicGetTcInput() {
		return tcInput;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTcInput(TMTCIFTC newTcInput) {
		TMTCIFTC oldTcInput = tcInput;
		tcInput = newTcInput;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, tctemplatePackage.VTC_TEMPLATE__TC_INPUT, oldTcInput, tcInput));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<VTCTemplateField> getFields() {
		if (fields == null) {
			fields = new EObjectContainmentEList<VTCTemplateField>(VTCTemplateField.class, this, tctemplatePackage.VTC_TEMPLATE__FIELDS);
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
			case tctemplatePackage.VTC_TEMPLATE__FIELDS:
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
			case tctemplatePackage.VTC_TEMPLATE__NAME:
				return getName();
			case tctemplatePackage.VTC_TEMPLATE__TC_INPUT:
				if (resolve) return getTcInput();
				return basicGetTcInput();
			case tctemplatePackage.VTC_TEMPLATE__FIELDS:
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
			case tctemplatePackage.VTC_TEMPLATE__NAME:
				setName((String)newValue);
				return;
			case tctemplatePackage.VTC_TEMPLATE__TC_INPUT:
				setTcInput((TMTCIFTC)newValue);
				return;
			case tctemplatePackage.VTC_TEMPLATE__FIELDS:
				getFields().clear();
				getFields().addAll((Collection<? extends VTCTemplateField>)newValue);
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
			case tctemplatePackage.VTC_TEMPLATE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case tctemplatePackage.VTC_TEMPLATE__TC_INPUT:
				setTcInput((TMTCIFTC)null);
				return;
			case tctemplatePackage.VTC_TEMPLATE__FIELDS:
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
			case tctemplatePackage.VTC_TEMPLATE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case tctemplatePackage.VTC_TEMPLATE__TC_INPUT:
				return tcInput != null;
			case tctemplatePackage.VTC_TEMPLATE__FIELDS:
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

} //VTCTemplateImpl
