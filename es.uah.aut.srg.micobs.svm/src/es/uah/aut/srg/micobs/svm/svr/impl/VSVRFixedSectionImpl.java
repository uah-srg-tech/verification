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
package es.uah.aut.srg.micobs.svm.svr.impl;

import es.uah.aut.srg.micobs.doctpl.doctpl.DAbstractSection;
import es.uah.aut.srg.micobs.doctpl.doctpl.DBody;
import es.uah.aut.srg.micobs.doctpl.doctpl.DReferenceableObject;
import es.uah.aut.srg.micobs.doctpl.doctpl.impl.DFixedSectionImpl;

import es.uah.aut.srg.micobs.svm.svr.VSVRFixedSection;
import es.uah.aut.srg.micobs.svm.svr.VSVRInstantiableSection;
import es.uah.aut.srg.micobs.svm.svr.svrPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>VSVR Fixed Section</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link es.uah.aut.srg.micobs.svm.svr.impl.VSVRFixedSectionImpl#getBody <em>Body</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.svm.svr.impl.VSVRFixedSectionImpl#getSvrInstatiableSubsections <em>Svr Instatiable Subsections</em>}</li>
 * </ul>
 *
 * @generated
 */
public class VSVRFixedSectionImpl extends DFixedSectionImpl implements VSVRFixedSection {
	/**
	 * The cached value of the '{@link #getBody() <em>Body</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBody()
	 * @generated
	 * @ordered
	 */
	protected DBody body;

	/**
	 * The cached value of the '{@link #getSvrInstatiableSubsections() <em>Svr Instatiable Subsections</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSvrInstatiableSubsections()
	 * @generated
	 * @ordered
	 */
	protected EList<VSVRInstantiableSection> svrInstatiableSubsections;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VSVRFixedSectionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return svrPackage.Literals.VSVR_FIXED_SECTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DBody getBody() {
		return body;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBody(DBody newBody, NotificationChain msgs) {
		DBody oldBody = body;
		body = newBody;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, svrPackage.VSVR_FIXED_SECTION__BODY, oldBody, newBody);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBody(DBody newBody) {
		if (newBody != body) {
			NotificationChain msgs = null;
			if (body != null)
				msgs = ((InternalEObject)body).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - svrPackage.VSVR_FIXED_SECTION__BODY, null, msgs);
			if (newBody != null)
				msgs = ((InternalEObject)newBody).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - svrPackage.VSVR_FIXED_SECTION__BODY, null, msgs);
			msgs = basicSetBody(newBody, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, svrPackage.VSVR_FIXED_SECTION__BODY, newBody, newBody));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<VSVRInstantiableSection> getSvrInstatiableSubsections() {
		if (svrInstatiableSubsections == null) {
			svrInstatiableSubsections = new EObjectContainmentEList<VSVRInstantiableSection>(VSVRInstantiableSection.class, this, svrPackage.VSVR_FIXED_SECTION__SVR_INSTATIABLE_SUBSECTIONS);
		}
		return svrInstatiableSubsections;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case svrPackage.VSVR_FIXED_SECTION__BODY:
				return basicSetBody(null, msgs);
			case svrPackage.VSVR_FIXED_SECTION__SVR_INSTATIABLE_SUBSECTIONS:
				return ((InternalEList<?>)getSvrInstatiableSubsections()).basicRemove(otherEnd, msgs);
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
			case svrPackage.VSVR_FIXED_SECTION__BODY:
				return getBody();
			case svrPackage.VSVR_FIXED_SECTION__SVR_INSTATIABLE_SUBSECTIONS:
				return getSvrInstatiableSubsections();
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
			case svrPackage.VSVR_FIXED_SECTION__BODY:
				setBody((DBody)newValue);
				return;
			case svrPackage.VSVR_FIXED_SECTION__SVR_INSTATIABLE_SUBSECTIONS:
				getSvrInstatiableSubsections().clear();
				getSvrInstatiableSubsections().addAll((Collection<? extends VSVRInstantiableSection>)newValue);
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
			case svrPackage.VSVR_FIXED_SECTION__BODY:
				setBody((DBody)null);
				return;
			case svrPackage.VSVR_FIXED_SECTION__SVR_INSTATIABLE_SUBSECTIONS:
				getSvrInstatiableSubsections().clear();
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
			case svrPackage.VSVR_FIXED_SECTION__BODY:
				return body != null;
			case svrPackage.VSVR_FIXED_SECTION__SVR_INSTATIABLE_SUBSECTIONS:
				return svrInstatiableSubsections != null && !svrInstatiableSubsections.isEmpty();
		}
		return super.eIsSet(featureID);
	}
	
	@Override
	public EList<DAbstractSection> getSubsections() {
		EList<DAbstractSection> subsections = new BasicEList<DAbstractSection>();
		
		for(DAbstractSection subsection : getSvrInstatiableSubsections()) {
			subsections.add(subsection);
		}
		return subsections;
	}

	@Override
	public EList<DReferenceableObject> getReferenceableObjects(String ReferenceableObjectType) {

		EList<DReferenceableObject> objects = new BasicEList<DReferenceableObject>();
		
		if(getBody() != null) {
			objects.addAll(getBody().getReferenceableObjects(ReferenceableObjectType));
		}
		for(VSVRInstantiableSection subsection : getSvrInstatiableSubsections()) {
			objects.addAll(subsection.getReferenceableObjects(ReferenceableObjectType));
		}
		return objects;
	}

} //VSVRFixedSectionImpl
