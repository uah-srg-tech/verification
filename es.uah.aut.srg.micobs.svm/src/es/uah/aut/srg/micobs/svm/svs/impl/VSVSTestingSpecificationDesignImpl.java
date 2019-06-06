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

import es.uah.aut.srg.micobs.doctpl.doc.DAbstractSection;
import es.uah.aut.srg.micobs.doctpl.doc.impl.DFixedSectionImpl;

import es.uah.aut.srg.micobs.svm.svs.VSVSFixedSection;
import es.uah.aut.srg.micobs.svm.svs.VSVSTestDesign;
import es.uah.aut.srg.micobs.svm.svs.VSVSTestingSpecificationDesign;
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
 * An implementation of the model object '<em><b>VSVS Testing Specification Design</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link es.uah.aut.srg.micobs.svm.svs.impl.VSVSTestingSpecificationDesignImpl#getGeneral <em>General</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.svm.svs.impl.VSVSTestingSpecificationDesignImpl#getTestDesigns <em>Test Designs</em>}</li>
 * </ul>
 *
 * @generated
 */
public class VSVSTestingSpecificationDesignImpl extends DFixedSectionImpl implements VSVSTestingSpecificationDesign {
	/**
	 * The cached value of the '{@link #getGeneral() <em>General</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGeneral()
	 * @generated
	 * @ordered
	 */
	protected VSVSFixedSection general;

	/**
	 * The cached value of the '{@link #getTestDesigns() <em>Test Designs</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTestDesigns()
	 * @generated
	 * @ordered
	 */
	protected EList<VSVSTestDesign> testDesigns;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VSVSTestingSpecificationDesignImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return svsPackage.Literals.VSVS_TESTING_SPECIFICATION_DESIGN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VSVSFixedSection getGeneral() {
		return general;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGeneral(VSVSFixedSection newGeneral, NotificationChain msgs) {
		VSVSFixedSection oldGeneral = general;
		general = newGeneral;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, svsPackage.VSVS_TESTING_SPECIFICATION_DESIGN__GENERAL, oldGeneral, newGeneral);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGeneral(VSVSFixedSection newGeneral) {
		if (newGeneral != general) {
			NotificationChain msgs = null;
			if (general != null)
				msgs = ((InternalEObject)general).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - svsPackage.VSVS_TESTING_SPECIFICATION_DESIGN__GENERAL, null, msgs);
			if (newGeneral != null)
				msgs = ((InternalEObject)newGeneral).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - svsPackage.VSVS_TESTING_SPECIFICATION_DESIGN__GENERAL, null, msgs);
			msgs = basicSetGeneral(newGeneral, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, svsPackage.VSVS_TESTING_SPECIFICATION_DESIGN__GENERAL, newGeneral, newGeneral));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<VSVSTestDesign> getTestDesigns() {
		if (testDesigns == null) {
			testDesigns = new EObjectContainmentEList<VSVSTestDesign>(VSVSTestDesign.class, this, svsPackage.VSVS_TESTING_SPECIFICATION_DESIGN__TEST_DESIGNS);
		}
		return testDesigns;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case svsPackage.VSVS_TESTING_SPECIFICATION_DESIGN__GENERAL:
				return basicSetGeneral(null, msgs);
			case svsPackage.VSVS_TESTING_SPECIFICATION_DESIGN__TEST_DESIGNS:
				return ((InternalEList<?>)getTestDesigns()).basicRemove(otherEnd, msgs);
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
			case svsPackage.VSVS_TESTING_SPECIFICATION_DESIGN__GENERAL:
				return getGeneral();
			case svsPackage.VSVS_TESTING_SPECIFICATION_DESIGN__TEST_DESIGNS:
				return getTestDesigns();
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
			case svsPackage.VSVS_TESTING_SPECIFICATION_DESIGN__GENERAL:
				setGeneral((VSVSFixedSection)newValue);
				return;
			case svsPackage.VSVS_TESTING_SPECIFICATION_DESIGN__TEST_DESIGNS:
				getTestDesigns().clear();
				getTestDesigns().addAll((Collection<? extends VSVSTestDesign>)newValue);
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
			case svsPackage.VSVS_TESTING_SPECIFICATION_DESIGN__GENERAL:
				setGeneral((VSVSFixedSection)null);
				return;
			case svsPackage.VSVS_TESTING_SPECIFICATION_DESIGN__TEST_DESIGNS:
				getTestDesigns().clear();
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
			case svsPackage.VSVS_TESTING_SPECIFICATION_DESIGN__GENERAL:
				return general != null;
			case svsPackage.VSVS_TESTING_SPECIFICATION_DESIGN__TEST_DESIGNS:
				return testDesigns != null && !testDesigns.isEmpty();
		}
		return super.eIsSet(featureID);
	}
	
	@Override
	public EList<DAbstractSection> getSubsections() {
		EList<DAbstractSection> subsections = new BasicEList<DAbstractSection>();
		subsections.add((DAbstractSection) getGeneral());
		
		for(DAbstractSection procedure : getTestDesigns()) {
			subsections.add(procedure);
		}
		return subsections;
	}

} //VSVSTestingSpecificationDesignImpl
