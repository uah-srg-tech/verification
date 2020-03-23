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
package es.uah.aut.srg.micobs.svm.tcr.impl;

import es.uah.aut.srg.micobs.doctpl.doctpl.DAbstractFigure;
import es.uah.aut.srg.micobs.doctpl.doctpl.DAbstractSection;
import es.uah.aut.srg.micobs.doctpl.doctpl.DAbstractTable;
import es.uah.aut.srg.micobs.doctpl.doctpl.DApplicableDocument;
import es.uah.aut.srg.micobs.doctpl.doctpl.DParagraph;
import es.uah.aut.srg.micobs.doctpl.doctpl.DReferenceDocument;
import es.uah.aut.srg.micobs.doctpl.doctpl.DTBC;
import es.uah.aut.srg.micobs.doctpl.doctpl.DTBD;
import es.uah.aut.srg.micobs.doctpl.doctpl.impl.DDocumentTemplateImpl;
import es.uah.aut.srg.micobs.svm.tcr.VTCRTestCampaignReport;
import es.uah.aut.srg.micobs.svm.tcr.VTCRTestReport;
import es.uah.aut.srg.micobs.svm.tcr.tcrPackage;

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
 * An implementation of the model object '<em><b>VTCR Test Campaign Report</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link es.uah.aut.srg.micobs.svm.tcr.impl.VTCRTestCampaignReportImpl#getTestReports <em>Test Reports</em>}</li>
 * </ul>
 *
 * @generated
 */
public class VTCRTestCampaignReportImpl extends DDocumentTemplateImpl implements VTCRTestCampaignReport {
	/**
	 * The cached value of the '{@link #getTestReports() <em>Test Reports</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTestReports()
	 * @generated
	 * @ordered
	 */
	protected EList<VTCRTestReport> testReports;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VTCRTestCampaignReportImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return tcrPackage.Literals.VTCR_TEST_CAMPAIGN_REPORT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<VTCRTestReport> getTestReports() {
		if (testReports == null) {
			testReports = new EObjectContainmentEList<VTCRTestReport>(VTCRTestReport.class, this, tcrPackage.VTCR_TEST_CAMPAIGN_REPORT__TEST_REPORTS);
		}
		return testReports;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case tcrPackage.VTCR_TEST_CAMPAIGN_REPORT__TEST_REPORTS:
				return ((InternalEList<?>)getTestReports()).basicRemove(otherEnd, msgs);
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
			case tcrPackage.VTCR_TEST_CAMPAIGN_REPORT__TEST_REPORTS:
				return getTestReports();
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
			case tcrPackage.VTCR_TEST_CAMPAIGN_REPORT__TEST_REPORTS:
				getTestReports().clear();
				getTestReports().addAll((Collection<? extends VTCRTestReport>)newValue);
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
			case tcrPackage.VTCR_TEST_CAMPAIGN_REPORT__TEST_REPORTS:
				getTestReports().clear();
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
			case tcrPackage.VTCR_TEST_CAMPAIGN_REPORT__TEST_REPORTS:
				return testReports != null && !testReports.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	@Override
	public EList<DTBC> getTbcs() {
		return ECollections.emptyEList();
	}

	@Override
	public EList<DTBD> getTbds() {
		return ECollections.emptyEList();
	}

	@Override
	public EList<DApplicableDocument> getApplicableDocuments() {
		return ECollections.emptyEList();
	}

	@Override
	public EList<DReferenceDocument> getReferenceDocuments() {
		return ECollections.emptyEList();
	}

	@Override
	public EList<DAbstractFigure> getFigures() {
		return ECollections.emptyEList();
	}

	@Override
	public EList<DAbstractTable> getTables() {
		return ECollections.emptyEList();
	}

	@Override
	public EList<DParagraph> getParagraphs() {
		return ECollections.emptyEList();
	}

	@Override
	public EList<DAbstractSection> getSections() {
		return ECollections.emptyEList();
	}

} //VTCRTestCampaignReportImpl
