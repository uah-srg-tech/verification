/**
 * Copyright (c) 2020 UAH Space Research Group.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 * 
 * Contributors:
 *     SRG Team - Initial API and implementation
 */
package es.uah.aut.srg.micobs.svm.testsetup.impl;

import es.uah.aut.srg.micobs.doctpl.doctpl.DBody;
import es.uah.aut.srg.micobs.doctpl.doctpl.DReferenceableObject;
import es.uah.aut.srg.micobs.svm.testsetup.VTestSetupActionOverVariable;
import es.uah.aut.srg.micobs.svm.testsetup.VTestSetupActionOverVariableType;
import es.uah.aut.srg.micobs.svm.testsetup.testsetupPackage;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>VTest Setup Action Over Variable</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link es.uah.aut.srg.micobs.svm.testsetup.impl.VTestSetupActionOverVariableImpl#getName <em>Name</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.svm.testsetup.impl.VTestSetupActionOverVariableImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.svm.testsetup.impl.VTestSetupActionOverVariableImpl#getType <em>Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class VTestSetupActionOverVariableImpl extends MinimalEObjectImpl.Container implements VTestSetupActionOverVariable {
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
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected DBody description;

	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final VTestSetupActionOverVariableType TYPE_EDEFAULT = VTestSetupActionOverVariableType.RESET;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected VTestSetupActionOverVariableType type = TYPE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VTestSetupActionOverVariableImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return testsetupPackage.Literals.VTEST_SETUP_ACTION_OVER_VARIABLE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, testsetupPackage.VTEST_SETUP_ACTION_OVER_VARIABLE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DBody getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDescription(DBody newDescription, NotificationChain msgs) {
		DBody oldDescription = description;
		description = newDescription;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, testsetupPackage.VTEST_SETUP_ACTION_OVER_VARIABLE__DESCRIPTION, oldDescription, newDescription);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription(DBody newDescription) {
		if (newDescription != description) {
			NotificationChain msgs = null;
			if (description != null)
				msgs = ((InternalEObject)description).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - testsetupPackage.VTEST_SETUP_ACTION_OVER_VARIABLE__DESCRIPTION, null, msgs);
			if (newDescription != null)
				msgs = ((InternalEObject)newDescription).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - testsetupPackage.VTEST_SETUP_ACTION_OVER_VARIABLE__DESCRIPTION, null, msgs);
			msgs = basicSetDescription(newDescription, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, testsetupPackage.VTEST_SETUP_ACTION_OVER_VARIABLE__DESCRIPTION, newDescription, newDescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VTestSetupActionOverVariableType getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(VTestSetupActionOverVariableType newType) {
		VTestSetupActionOverVariableType oldType = type;
		type = newType == null ? TYPE_EDEFAULT : newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, testsetupPackage.VTEST_SETUP_ACTION_OVER_VARIABLE__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case testsetupPackage.VTEST_SETUP_ACTION_OVER_VARIABLE__DESCRIPTION:
				return basicSetDescription(null, msgs);
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
			case testsetupPackage.VTEST_SETUP_ACTION_OVER_VARIABLE__NAME:
				return getName();
			case testsetupPackage.VTEST_SETUP_ACTION_OVER_VARIABLE__DESCRIPTION:
				return getDescription();
			case testsetupPackage.VTEST_SETUP_ACTION_OVER_VARIABLE__TYPE:
				return getType();
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
			case testsetupPackage.VTEST_SETUP_ACTION_OVER_VARIABLE__NAME:
				setName((String)newValue);
				return;
			case testsetupPackage.VTEST_SETUP_ACTION_OVER_VARIABLE__DESCRIPTION:
				setDescription((DBody)newValue);
				return;
			case testsetupPackage.VTEST_SETUP_ACTION_OVER_VARIABLE__TYPE:
				setType((VTestSetupActionOverVariableType)newValue);
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
			case testsetupPackage.VTEST_SETUP_ACTION_OVER_VARIABLE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case testsetupPackage.VTEST_SETUP_ACTION_OVER_VARIABLE__DESCRIPTION:
				setDescription((DBody)null);
				return;
			case testsetupPackage.VTEST_SETUP_ACTION_OVER_VARIABLE__TYPE:
				setType(TYPE_EDEFAULT);
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
			case testsetupPackage.VTEST_SETUP_ACTION_OVER_VARIABLE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case testsetupPackage.VTEST_SETUP_ACTION_OVER_VARIABLE__DESCRIPTION:
				return description != null;
			case testsetupPackage.VTEST_SETUP_ACTION_OVER_VARIABLE__TYPE:
				return type != TYPE_EDEFAULT;
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
		result.append(", type: ");
		result.append(type);
		result.append(')');
		return result.toString();
	}

	@Override
	public EList<DReferenceableObject> getReferenceableObjects(String ReferenceableObjectType) {

		return getDescription().getReferenceableObjects(ReferenceableObjectType);
	}

} //VTestSetupActionOverVariableImpl
