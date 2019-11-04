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
package es.uah.aut.srg.micobs.svm.svs.impl;

import es.uah.aut.srg.micobs.doctpl.doctpl.DAbstractSection;
import es.uah.aut.srg.micobs.doctpl.doctpl.DBody;
import es.uah.aut.srg.micobs.doctpl.doctpl.impl.DFixedSectionImpl;
import es.uah.aut.srg.micobs.svm.svs.VSVSFixedSection;
import es.uah.aut.srg.micobs.svm.svs.VSVSInstantiableSection;
import es.uah.aut.srg.micobs.svm.svs.svsPackage;

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
 * An implementation of the model object '<em><b>VSVS Fixed Section</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link es.uah.aut.srg.micobs.svm.svs.impl.VSVSFixedSectionImpl#getBody <em>Body</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.svm.svs.impl.VSVSFixedSectionImpl#getSvsInstatiableSubsections <em>Svs Instatiable Subsections</em>}</li>
 * </ul>
 *
 * @generated
 */
public class VSVSFixedSectionImpl extends DFixedSectionImpl implements VSVSFixedSection {
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
	 * The cached value of the '{@link #getSvsInstatiableSubsections() <em>Svs Instatiable Subsections</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSvsInstatiableSubsections()
	 * @generated
	 * @ordered
	 */
	protected EList<VSVSInstantiableSection> svsInstatiableSubsections;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VSVSFixedSectionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return svsPackage.Literals.VSVS_FIXED_SECTION;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, svsPackage.VSVS_FIXED_SECTION__BODY, oldBody, newBody);
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
				msgs = ((InternalEObject)body).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - svsPackage.VSVS_FIXED_SECTION__BODY, null, msgs);
			if (newBody != null)
				msgs = ((InternalEObject)newBody).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - svsPackage.VSVS_FIXED_SECTION__BODY, null, msgs);
			msgs = basicSetBody(newBody, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, svsPackage.VSVS_FIXED_SECTION__BODY, newBody, newBody));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<VSVSInstantiableSection> getSvsInstatiableSubsections() {
		if (svsInstatiableSubsections == null) {
			svsInstatiableSubsections = new EObjectContainmentEList<VSVSInstantiableSection>(VSVSInstantiableSection.class, this, svsPackage.VSVS_FIXED_SECTION__SVS_INSTATIABLE_SUBSECTIONS);
		}
		return svsInstatiableSubsections;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case svsPackage.VSVS_FIXED_SECTION__BODY:
				return basicSetBody(null, msgs);
			case svsPackage.VSVS_FIXED_SECTION__SVS_INSTATIABLE_SUBSECTIONS:
				return ((InternalEList<?>)getSvsInstatiableSubsections()).basicRemove(otherEnd, msgs);
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
			case svsPackage.VSVS_FIXED_SECTION__BODY:
				return getBody();
			case svsPackage.VSVS_FIXED_SECTION__SVS_INSTATIABLE_SUBSECTIONS:
				return getSvsInstatiableSubsections();
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
			case svsPackage.VSVS_FIXED_SECTION__BODY:
				setBody((DBody)newValue);
				return;
			case svsPackage.VSVS_FIXED_SECTION__SVS_INSTATIABLE_SUBSECTIONS:
				getSvsInstatiableSubsections().clear();
				getSvsInstatiableSubsections().addAll((Collection<? extends VSVSInstantiableSection>)newValue);
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
			case svsPackage.VSVS_FIXED_SECTION__BODY:
				setBody((DBody)null);
				return;
			case svsPackage.VSVS_FIXED_SECTION__SVS_INSTATIABLE_SUBSECTIONS:
				getSvsInstatiableSubsections().clear();
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
			case svsPackage.VSVS_FIXED_SECTION__BODY:
				return body != null;
			case svsPackage.VSVS_FIXED_SECTION__SVS_INSTATIABLE_SUBSECTIONS:
				return svsInstatiableSubsections != null && !svsInstatiableSubsections.isEmpty();
		}
		return super.eIsSet(featureID);
	}
	
	public EList<DAbstractSection> getSubsections() {
		EList<DAbstractSection> subsections = new BasicEList<DAbstractSection>();
		
		for(DAbstractSection subsection : getSvsInstatiableSubsections()) {
			subsections.add(subsection);
		}
		return subsections;
	}

} //VSVSFixedSectionImpl
