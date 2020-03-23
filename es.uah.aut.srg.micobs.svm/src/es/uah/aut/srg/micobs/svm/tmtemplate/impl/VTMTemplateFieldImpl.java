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

import es.uah.aut.srg.micobs.svm.tmtemplate.VTMTemplateField;
import es.uah.aut.srg.micobs.svm.tmtemplate.tmtemplatePackage;

import es.uah.aut.srg.tmtcif.fieldvalue.TMTCIFFieldValue;

import es.uah.aut.srg.tmtcif.tm.TMTCIFTMField;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>VTM Template Field</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link es.uah.aut.srg.micobs.svm.tmtemplate.impl.VTMTemplateFieldImpl#getFieldRef <em>Field Ref</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.svm.tmtemplate.impl.VTMTemplateFieldImpl#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @generated
 */
public class VTMTemplateFieldImpl extends MinimalEObjectImpl.Container implements VTMTemplateField {
	/**
	 * The cached value of the '{@link #getFieldRef() <em>Field Ref</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFieldRef()
	 * @generated
	 * @ordered
	 */
	protected TMTCIFTMField fieldRef;

	/**
	 * The cached value of the '{@link #getValue() <em>Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected TMTCIFFieldValue value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VTMTemplateFieldImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return tmtemplatePackage.Literals.VTM_TEMPLATE_FIELD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TMTCIFTMField getFieldRef() {
		if (fieldRef != null && fieldRef.eIsProxy()) {
			InternalEObject oldFieldRef = (InternalEObject)fieldRef;
			fieldRef = (TMTCIFTMField)eResolveProxy(oldFieldRef);
			if (fieldRef != oldFieldRef) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, tmtemplatePackage.VTM_TEMPLATE_FIELD__FIELD_REF, oldFieldRef, fieldRef));
			}
		}
		return fieldRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TMTCIFTMField basicGetFieldRef() {
		return fieldRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFieldRef(TMTCIFTMField newFieldRef) {
		TMTCIFTMField oldFieldRef = fieldRef;
		fieldRef = newFieldRef;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, tmtemplatePackage.VTM_TEMPLATE_FIELD__FIELD_REF, oldFieldRef, fieldRef));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TMTCIFFieldValue getValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetValue(TMTCIFFieldValue newValue, NotificationChain msgs) {
		TMTCIFFieldValue oldValue = value;
		value = newValue;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, tmtemplatePackage.VTM_TEMPLATE_FIELD__VALUE, oldValue, newValue);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValue(TMTCIFFieldValue newValue) {
		if (newValue != value) {
			NotificationChain msgs = null;
			if (value != null)
				msgs = ((InternalEObject)value).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - tmtemplatePackage.VTM_TEMPLATE_FIELD__VALUE, null, msgs);
			if (newValue != null)
				msgs = ((InternalEObject)newValue).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - tmtemplatePackage.VTM_TEMPLATE_FIELD__VALUE, null, msgs);
			msgs = basicSetValue(newValue, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, tmtemplatePackage.VTM_TEMPLATE_FIELD__VALUE, newValue, newValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case tmtemplatePackage.VTM_TEMPLATE_FIELD__VALUE:
				return basicSetValue(null, msgs);
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
			case tmtemplatePackage.VTM_TEMPLATE_FIELD__FIELD_REF:
				if (resolve) return getFieldRef();
				return basicGetFieldRef();
			case tmtemplatePackage.VTM_TEMPLATE_FIELD__VALUE:
				return getValue();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case tmtemplatePackage.VTM_TEMPLATE_FIELD__FIELD_REF:
				setFieldRef((TMTCIFTMField)newValue);
				return;
			case tmtemplatePackage.VTM_TEMPLATE_FIELD__VALUE:
				setValue((TMTCIFFieldValue)newValue);
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
			case tmtemplatePackage.VTM_TEMPLATE_FIELD__FIELD_REF:
				setFieldRef((TMTCIFTMField)null);
				return;
			case tmtemplatePackage.VTM_TEMPLATE_FIELD__VALUE:
				setValue((TMTCIFFieldValue)null);
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
			case tmtemplatePackage.VTM_TEMPLATE_FIELD__FIELD_REF:
				return fieldRef != null;
			case tmtemplatePackage.VTM_TEMPLATE_FIELD__VALUE:
				return value != null;
		}
		return super.eIsSet(featureID);
	}

} //VTMTemplateFieldImpl
