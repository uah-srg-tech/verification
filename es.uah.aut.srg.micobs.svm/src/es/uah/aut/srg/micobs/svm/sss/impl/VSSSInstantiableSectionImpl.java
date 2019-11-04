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

import es.uah.aut.srg.micobs.doctpl.doctpl.DAbstractSection;
import es.uah.aut.srg.micobs.svm.sss.VSSSInstantiableSection;
import es.uah.aut.srg.micobs.svm.sss.sssPackage;

import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.ECollections;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>VSSS Instantiable Section</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link es.uah.aut.srg.micobs.svm.sss.impl.VSSSInstantiableSectionImpl#getBody <em>Body</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.svm.sss.impl.VSSSInstantiableSectionImpl#getSssInstatiableSubsections <em>Sss Instatiable Subsections</em>}</li>
 * </ul>
 *
 * @generated
 */
public class VSSSInstantiableSectionImpl extends es.uah.aut.srg.micobs.doctpl.doctpl.impl.DInstantiableSectionImpl implements VSSSInstantiableSection {
	/**
	 * The cached value of the '{@link #getBody() <em>Body</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBody()
	 * @generated
	 * @ordered
	 */
	protected es.uah.aut.srg.micobs.doctpl.doctpl.DBody body;

	/**
	 * The cached value of the '{@link #getSssInstatiableSubsections() <em>Sss Instatiable Subsections</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSssInstatiableSubsections()
	 * @generated
	 * @ordered
	 */
	protected EList<VSSSInstantiableSection> sssInstatiableSubsections;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VSSSInstantiableSectionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return sssPackage.Literals.VSSS_INSTANTIABLE_SECTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public es.uah.aut.srg.micobs.doctpl.doctpl.DBody getBody() {
		return body;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBody(es.uah.aut.srg.micobs.doctpl.doctpl.DBody newBody, NotificationChain msgs) {
		es.uah.aut.srg.micobs.doctpl.doctpl.DBody oldBody = body;
		body = newBody;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, sssPackage.VSSS_INSTANTIABLE_SECTION__BODY, oldBody, newBody);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBody(es.uah.aut.srg.micobs.doctpl.doctpl.DBody newBody) {
		if (newBody != body) {
			NotificationChain msgs = null;
			if (body != null)
				msgs = ((InternalEObject)body).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - sssPackage.VSSS_INSTANTIABLE_SECTION__BODY, null, msgs);
			if (newBody != null)
				msgs = ((InternalEObject)newBody).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - sssPackage.VSSS_INSTANTIABLE_SECTION__BODY, null, msgs);
			msgs = basicSetBody(newBody, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, sssPackage.VSSS_INSTANTIABLE_SECTION__BODY, newBody, newBody));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<VSSSInstantiableSection> getSssInstatiableSubsections() {
		if (sssInstatiableSubsections == null) {
			sssInstatiableSubsections = new EObjectContainmentEList<VSSSInstantiableSection>(VSSSInstantiableSection.class, this, sssPackage.VSSS_INSTANTIABLE_SECTION__SSS_INSTATIABLE_SUBSECTIONS);
		}
		return sssInstatiableSubsections;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case sssPackage.VSSS_INSTANTIABLE_SECTION__BODY:
				return basicSetBody(null, msgs);
			case sssPackage.VSSS_INSTANTIABLE_SECTION__SSS_INSTATIABLE_SUBSECTIONS:
				return ((InternalEList<?>)getSssInstatiableSubsections()).basicRemove(otherEnd, msgs);
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
			case sssPackage.VSSS_INSTANTIABLE_SECTION__BODY:
				return getBody();
			case sssPackage.VSSS_INSTANTIABLE_SECTION__SSS_INSTATIABLE_SUBSECTIONS:
				return getSssInstatiableSubsections();
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
			case sssPackage.VSSS_INSTANTIABLE_SECTION__BODY:
				setBody((es.uah.aut.srg.micobs.doctpl.doctpl.DBody)newValue);
				return;
			case sssPackage.VSSS_INSTANTIABLE_SECTION__SSS_INSTATIABLE_SUBSECTIONS:
				getSssInstatiableSubsections().clear();
				getSssInstatiableSubsections().addAll((Collection<? extends VSSSInstantiableSection>)newValue);
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
			case sssPackage.VSSS_INSTANTIABLE_SECTION__BODY:
				setBody((es.uah.aut.srg.micobs.doctpl.doctpl.DBody)null);
				return;
			case sssPackage.VSSS_INSTANTIABLE_SECTION__SSS_INSTATIABLE_SUBSECTIONS:
				getSssInstatiableSubsections().clear();
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
			case sssPackage.VSSS_INSTANTIABLE_SECTION__BODY:
				return body != null;
			case sssPackage.VSSS_INSTANTIABLE_SECTION__SSS_INSTATIABLE_SUBSECTIONS:
				return sssInstatiableSubsections != null && !sssInstatiableSubsections.isEmpty();
		}
		return super.eIsSet(featureID);
	}
	
	@Override
	public EList<DAbstractSection> getSubsections() {
		return ECollections.emptyEList();
	}

} //VSSSInstantiableSectionImpl
