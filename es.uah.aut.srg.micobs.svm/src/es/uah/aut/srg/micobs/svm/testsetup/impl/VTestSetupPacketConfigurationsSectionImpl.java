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
package es.uah.aut.srg.micobs.svm.testsetup.impl;

import es.uah.aut.srg.micobs.doctpl.doctpl.DAbstractSection;
import es.uah.aut.srg.micobs.doctpl.doctpl.impl.DFixedSectionImpl;

import es.uah.aut.srg.micobs.svm.testsetup.VTestSetupPacketConfiguration;
import es.uah.aut.srg.micobs.svm.testsetup.VTestSetupPacketConfigurationsSection;
import es.uah.aut.srg.micobs.svm.testsetup.testsetupPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.ECollections;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>VTest Setup Packet Configurations Section</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link es.uah.aut.srg.micobs.svm.testsetup.impl.VTestSetupPacketConfigurationsSectionImpl#getPacketConfigurations <em>Packet Configurations</em>}</li>
 * </ul>
 *
 * @generated
 */
public class VTestSetupPacketConfigurationsSectionImpl extends DFixedSectionImpl implements VTestSetupPacketConfigurationsSection {
	/**
	 * The cached value of the '{@link #getPacketConfigurations() <em>Packet Configurations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPacketConfigurations()
	 * @generated
	 * @ordered
	 */
	protected EList<VTestSetupPacketConfiguration> packetConfigurations;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VTestSetupPacketConfigurationsSectionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return testsetupPackage.Literals.VTEST_SETUP_PACKET_CONFIGURATIONS_SECTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<VTestSetupPacketConfiguration> getPacketConfigurations() {
		if (packetConfigurations == null) {
			packetConfigurations = new EObjectContainmentEList<VTestSetupPacketConfiguration>(VTestSetupPacketConfiguration.class, this, testsetupPackage.VTEST_SETUP_PACKET_CONFIGURATIONS_SECTION__PACKET_CONFIGURATIONS);
		}
		return packetConfigurations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case testsetupPackage.VTEST_SETUP_PACKET_CONFIGURATIONS_SECTION__PACKET_CONFIGURATIONS:
				return ((InternalEList<?>)getPacketConfigurations()).basicRemove(otherEnd, msgs);
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
			case testsetupPackage.VTEST_SETUP_PACKET_CONFIGURATIONS_SECTION__PACKET_CONFIGURATIONS:
				return getPacketConfigurations();
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
			case testsetupPackage.VTEST_SETUP_PACKET_CONFIGURATIONS_SECTION__PACKET_CONFIGURATIONS:
				getPacketConfigurations().clear();
				getPacketConfigurations().addAll((Collection<? extends VTestSetupPacketConfiguration>)newValue);
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
			case testsetupPackage.VTEST_SETUP_PACKET_CONFIGURATIONS_SECTION__PACKET_CONFIGURATIONS:
				getPacketConfigurations().clear();
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
			case testsetupPackage.VTEST_SETUP_PACKET_CONFIGURATIONS_SECTION__PACKET_CONFIGURATIONS:
				return packetConfigurations != null && !packetConfigurations.isEmpty();
		}
		return super.eIsSet(featureID);
	}
	
	@Override
	public EList<DAbstractSection> getSubsections() {
		return ECollections.emptyEList();
	}


} //VTestSetupPacketConfigurationsSectionImpl
