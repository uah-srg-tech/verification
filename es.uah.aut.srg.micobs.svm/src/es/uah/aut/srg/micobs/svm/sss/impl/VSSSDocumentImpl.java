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

import es.uah.aut.srg.micobs.svm.sss.VSSSApplicableDocument;
import es.uah.aut.srg.micobs.svm.sss.VSSSDocument;
import es.uah.aut.srg.micobs.svm.sss.VSSSGeneralDescription;
import es.uah.aut.srg.micobs.svm.sss.VSSSIntroduction;
import es.uah.aut.srg.micobs.svm.sss.VSSSReferenceDocument;
import es.uah.aut.srg.micobs.svm.sss.VSSSSpecificRequirements;
import es.uah.aut.srg.micobs.svm.sss.VSSSSystemModels;
import es.uah.aut.srg.micobs.svm.sss.VSSSTermsDefinitionsAbbreviations;
import es.uah.aut.srg.micobs.svm.sss.VSSSVerificationValidationIntegration;
import es.uah.aut.srg.micobs.svm.sss.sssPackage;

import es.uah.aut.srg.micobs.svm.tdm.impl.VTraceableDocumentImpl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>VSSS Document</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link es.uah.aut.srg.micobs.svm.sss.impl.VSSSDocumentImpl#getIntroduction <em>Introduction</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.svm.sss.impl.VSSSDocumentImpl#getApplicableDocuments <em>Applicable Documents</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.svm.sss.impl.VSSSDocumentImpl#getReferenceDocuments <em>Reference Documents</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.svm.sss.impl.VSSSDocumentImpl#getTermsDefinitionsAbbreviations <em>Terms Definitions Abbreviations</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.svm.sss.impl.VSSSDocumentImpl#getGeneralDescription <em>General Description</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.svm.sss.impl.VSSSDocumentImpl#getSpecificRequirements <em>Specific Requirements</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.svm.sss.impl.VSSSDocumentImpl#getVerificationValidationIntegration <em>Verification Validation Integration</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.svm.sss.impl.VSSSDocumentImpl#getSystemModels <em>System Models</em>}</li>
 * </ul>
 *
 * @generated
 */
public class VSSSDocumentImpl extends VTraceableDocumentImpl implements VSSSDocument {
	/**
	 * The cached value of the '{@link #getIntroduction() <em>Introduction</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIntroduction()
	 * @generated
	 * @ordered
	 */
	protected VSSSIntroduction introduction;

	/**
	 * The cached value of the '{@link #getApplicableDocuments() <em>Applicable Documents</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getApplicableDocuments()
	 * @generated
	 * @ordered
	 */
	protected EList<VSSSApplicableDocument> applicableDocuments;

	/**
	 * The cached value of the '{@link #getReferenceDocuments() <em>Reference Documents</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReferenceDocuments()
	 * @generated
	 * @ordered
	 */
	protected EList<VSSSReferenceDocument> referenceDocuments;

	/**
	 * The cached value of the '{@link #getTermsDefinitionsAbbreviations() <em>Terms Definitions Abbreviations</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTermsDefinitionsAbbreviations()
	 * @generated
	 * @ordered
	 */
	protected VSSSTermsDefinitionsAbbreviations termsDefinitionsAbbreviations;

	/**
	 * The cached value of the '{@link #getGeneralDescription() <em>General Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGeneralDescription()
	 * @generated
	 * @ordered
	 */
	protected VSSSGeneralDescription generalDescription;

	/**
	 * The cached value of the '{@link #getSpecificRequirements() <em>Specific Requirements</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpecificRequirements()
	 * @generated
	 * @ordered
	 */
	protected VSSSSpecificRequirements specificRequirements;

	/**
	 * The cached value of the '{@link #getVerificationValidationIntegration() <em>Verification Validation Integration</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVerificationValidationIntegration()
	 * @generated
	 * @ordered
	 */
	protected VSSSVerificationValidationIntegration verificationValidationIntegration;

	/**
	 * The cached value of the '{@link #getSystemModels() <em>System Models</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSystemModels()
	 * @generated
	 * @ordered
	 */
	protected VSSSSystemModels systemModels;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VSSSDocumentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return sssPackage.Literals.VSSS_DOCUMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VSSSIntroduction getIntroduction() {
		return introduction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIntroduction(VSSSIntroduction newIntroduction, NotificationChain msgs) {
		VSSSIntroduction oldIntroduction = introduction;
		introduction = newIntroduction;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, sssPackage.VSSS_DOCUMENT__INTRODUCTION, oldIntroduction, newIntroduction);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIntroduction(VSSSIntroduction newIntroduction) {
		if (newIntroduction != introduction) {
			NotificationChain msgs = null;
			if (introduction != null)
				msgs = ((InternalEObject)introduction).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - sssPackage.VSSS_DOCUMENT__INTRODUCTION, null, msgs);
			if (newIntroduction != null)
				msgs = ((InternalEObject)newIntroduction).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - sssPackage.VSSS_DOCUMENT__INTRODUCTION, null, msgs);
			msgs = basicSetIntroduction(newIntroduction, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, sssPackage.VSSS_DOCUMENT__INTRODUCTION, newIntroduction, newIntroduction));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<VSSSApplicableDocument> getApplicableDocuments() {
		if (applicableDocuments == null) {
			applicableDocuments = new EObjectContainmentEList<VSSSApplicableDocument>(VSSSApplicableDocument.class, this, sssPackage.VSSS_DOCUMENT__APPLICABLE_DOCUMENTS);
		}
		return applicableDocuments;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<VSSSReferenceDocument> getReferenceDocuments() {
		if (referenceDocuments == null) {
			referenceDocuments = new EObjectContainmentEList<VSSSReferenceDocument>(VSSSReferenceDocument.class, this, sssPackage.VSSS_DOCUMENT__REFERENCE_DOCUMENTS);
		}
		return referenceDocuments;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VSSSTermsDefinitionsAbbreviations getTermsDefinitionsAbbreviations() {
		return termsDefinitionsAbbreviations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTermsDefinitionsAbbreviations(VSSSTermsDefinitionsAbbreviations newTermsDefinitionsAbbreviations, NotificationChain msgs) {
		VSSSTermsDefinitionsAbbreviations oldTermsDefinitionsAbbreviations = termsDefinitionsAbbreviations;
		termsDefinitionsAbbreviations = newTermsDefinitionsAbbreviations;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, sssPackage.VSSS_DOCUMENT__TERMS_DEFINITIONS_ABBREVIATIONS, oldTermsDefinitionsAbbreviations, newTermsDefinitionsAbbreviations);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTermsDefinitionsAbbreviations(VSSSTermsDefinitionsAbbreviations newTermsDefinitionsAbbreviations) {
		if (newTermsDefinitionsAbbreviations != termsDefinitionsAbbreviations) {
			NotificationChain msgs = null;
			if (termsDefinitionsAbbreviations != null)
				msgs = ((InternalEObject)termsDefinitionsAbbreviations).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - sssPackage.VSSS_DOCUMENT__TERMS_DEFINITIONS_ABBREVIATIONS, null, msgs);
			if (newTermsDefinitionsAbbreviations != null)
				msgs = ((InternalEObject)newTermsDefinitionsAbbreviations).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - sssPackage.VSSS_DOCUMENT__TERMS_DEFINITIONS_ABBREVIATIONS, null, msgs);
			msgs = basicSetTermsDefinitionsAbbreviations(newTermsDefinitionsAbbreviations, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, sssPackage.VSSS_DOCUMENT__TERMS_DEFINITIONS_ABBREVIATIONS, newTermsDefinitionsAbbreviations, newTermsDefinitionsAbbreviations));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VSSSGeneralDescription getGeneralDescription() {
		return generalDescription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGeneralDescription(VSSSGeneralDescription newGeneralDescription, NotificationChain msgs) {
		VSSSGeneralDescription oldGeneralDescription = generalDescription;
		generalDescription = newGeneralDescription;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, sssPackage.VSSS_DOCUMENT__GENERAL_DESCRIPTION, oldGeneralDescription, newGeneralDescription);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGeneralDescription(VSSSGeneralDescription newGeneralDescription) {
		if (newGeneralDescription != generalDescription) {
			NotificationChain msgs = null;
			if (generalDescription != null)
				msgs = ((InternalEObject)generalDescription).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - sssPackage.VSSS_DOCUMENT__GENERAL_DESCRIPTION, null, msgs);
			if (newGeneralDescription != null)
				msgs = ((InternalEObject)newGeneralDescription).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - sssPackage.VSSS_DOCUMENT__GENERAL_DESCRIPTION, null, msgs);
			msgs = basicSetGeneralDescription(newGeneralDescription, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, sssPackage.VSSS_DOCUMENT__GENERAL_DESCRIPTION, newGeneralDescription, newGeneralDescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VSSSSpecificRequirements getSpecificRequirements() {
		return specificRequirements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSpecificRequirements(VSSSSpecificRequirements newSpecificRequirements, NotificationChain msgs) {
		VSSSSpecificRequirements oldSpecificRequirements = specificRequirements;
		specificRequirements = newSpecificRequirements;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, sssPackage.VSSS_DOCUMENT__SPECIFIC_REQUIREMENTS, oldSpecificRequirements, newSpecificRequirements);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSpecificRequirements(VSSSSpecificRequirements newSpecificRequirements) {
		if (newSpecificRequirements != specificRequirements) {
			NotificationChain msgs = null;
			if (specificRequirements != null)
				msgs = ((InternalEObject)specificRequirements).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - sssPackage.VSSS_DOCUMENT__SPECIFIC_REQUIREMENTS, null, msgs);
			if (newSpecificRequirements != null)
				msgs = ((InternalEObject)newSpecificRequirements).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - sssPackage.VSSS_DOCUMENT__SPECIFIC_REQUIREMENTS, null, msgs);
			msgs = basicSetSpecificRequirements(newSpecificRequirements, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, sssPackage.VSSS_DOCUMENT__SPECIFIC_REQUIREMENTS, newSpecificRequirements, newSpecificRequirements));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VSSSVerificationValidationIntegration getVerificationValidationIntegration() {
		if (verificationValidationIntegration != null && verificationValidationIntegration.eIsProxy()) {
			InternalEObject oldVerificationValidationIntegration = (InternalEObject)verificationValidationIntegration;
			verificationValidationIntegration = (VSSSVerificationValidationIntegration)eResolveProxy(oldVerificationValidationIntegration);
			if (verificationValidationIntegration != oldVerificationValidationIntegration) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, sssPackage.VSSS_DOCUMENT__VERIFICATION_VALIDATION_INTEGRATION, oldVerificationValidationIntegration, verificationValidationIntegration));
			}
		}
		return verificationValidationIntegration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VSSSVerificationValidationIntegration basicGetVerificationValidationIntegration() {
		return verificationValidationIntegration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVerificationValidationIntegration(VSSSVerificationValidationIntegration newVerificationValidationIntegration) {
		VSSSVerificationValidationIntegration oldVerificationValidationIntegration = verificationValidationIntegration;
		verificationValidationIntegration = newVerificationValidationIntegration;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, sssPackage.VSSS_DOCUMENT__VERIFICATION_VALIDATION_INTEGRATION, oldVerificationValidationIntegration, verificationValidationIntegration));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VSSSSystemModels getSystemModels() {
		return systemModels;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSystemModels(VSSSSystemModels newSystemModels, NotificationChain msgs) {
		VSSSSystemModels oldSystemModels = systemModels;
		systemModels = newSystemModels;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, sssPackage.VSSS_DOCUMENT__SYSTEM_MODELS, oldSystemModels, newSystemModels);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSystemModels(VSSSSystemModels newSystemModels) {
		if (newSystemModels != systemModels) {
			NotificationChain msgs = null;
			if (systemModels != null)
				msgs = ((InternalEObject)systemModels).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - sssPackage.VSSS_DOCUMENT__SYSTEM_MODELS, null, msgs);
			if (newSystemModels != null)
				msgs = ((InternalEObject)newSystemModels).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - sssPackage.VSSS_DOCUMENT__SYSTEM_MODELS, null, msgs);
			msgs = basicSetSystemModels(newSystemModels, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, sssPackage.VSSS_DOCUMENT__SYSTEM_MODELS, newSystemModels, newSystemModels));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case sssPackage.VSSS_DOCUMENT__INTRODUCTION:
				return basicSetIntroduction(null, msgs);
			case sssPackage.VSSS_DOCUMENT__APPLICABLE_DOCUMENTS:
				return ((InternalEList<?>)getApplicableDocuments()).basicRemove(otherEnd, msgs);
			case sssPackage.VSSS_DOCUMENT__REFERENCE_DOCUMENTS:
				return ((InternalEList<?>)getReferenceDocuments()).basicRemove(otherEnd, msgs);
			case sssPackage.VSSS_DOCUMENT__TERMS_DEFINITIONS_ABBREVIATIONS:
				return basicSetTermsDefinitionsAbbreviations(null, msgs);
			case sssPackage.VSSS_DOCUMENT__GENERAL_DESCRIPTION:
				return basicSetGeneralDescription(null, msgs);
			case sssPackage.VSSS_DOCUMENT__SPECIFIC_REQUIREMENTS:
				return basicSetSpecificRequirements(null, msgs);
			case sssPackage.VSSS_DOCUMENT__SYSTEM_MODELS:
				return basicSetSystemModels(null, msgs);
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
			case sssPackage.VSSS_DOCUMENT__INTRODUCTION:
				return getIntroduction();
			case sssPackage.VSSS_DOCUMENT__APPLICABLE_DOCUMENTS:
				return getApplicableDocuments();
			case sssPackage.VSSS_DOCUMENT__REFERENCE_DOCUMENTS:
				return getReferenceDocuments();
			case sssPackage.VSSS_DOCUMENT__TERMS_DEFINITIONS_ABBREVIATIONS:
				return getTermsDefinitionsAbbreviations();
			case sssPackage.VSSS_DOCUMENT__GENERAL_DESCRIPTION:
				return getGeneralDescription();
			case sssPackage.VSSS_DOCUMENT__SPECIFIC_REQUIREMENTS:
				return getSpecificRequirements();
			case sssPackage.VSSS_DOCUMENT__VERIFICATION_VALIDATION_INTEGRATION:
				if (resolve) return getVerificationValidationIntegration();
				return basicGetVerificationValidationIntegration();
			case sssPackage.VSSS_DOCUMENT__SYSTEM_MODELS:
				return getSystemModels();
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
			case sssPackage.VSSS_DOCUMENT__INTRODUCTION:
				setIntroduction((VSSSIntroduction)newValue);
				return;
			case sssPackage.VSSS_DOCUMENT__APPLICABLE_DOCUMENTS:
				getApplicableDocuments().clear();
				getApplicableDocuments().addAll((Collection<? extends VSSSApplicableDocument>)newValue);
				return;
			case sssPackage.VSSS_DOCUMENT__REFERENCE_DOCUMENTS:
				getReferenceDocuments().clear();
				getReferenceDocuments().addAll((Collection<? extends VSSSReferenceDocument>)newValue);
				return;
			case sssPackage.VSSS_DOCUMENT__TERMS_DEFINITIONS_ABBREVIATIONS:
				setTermsDefinitionsAbbreviations((VSSSTermsDefinitionsAbbreviations)newValue);
				return;
			case sssPackage.VSSS_DOCUMENT__GENERAL_DESCRIPTION:
				setGeneralDescription((VSSSGeneralDescription)newValue);
				return;
			case sssPackage.VSSS_DOCUMENT__SPECIFIC_REQUIREMENTS:
				setSpecificRequirements((VSSSSpecificRequirements)newValue);
				return;
			case sssPackage.VSSS_DOCUMENT__VERIFICATION_VALIDATION_INTEGRATION:
				setVerificationValidationIntegration((VSSSVerificationValidationIntegration)newValue);
				return;
			case sssPackage.VSSS_DOCUMENT__SYSTEM_MODELS:
				setSystemModels((VSSSSystemModels)newValue);
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
			case sssPackage.VSSS_DOCUMENT__INTRODUCTION:
				setIntroduction((VSSSIntroduction)null);
				return;
			case sssPackage.VSSS_DOCUMENT__APPLICABLE_DOCUMENTS:
				getApplicableDocuments().clear();
				return;
			case sssPackage.VSSS_DOCUMENT__REFERENCE_DOCUMENTS:
				getReferenceDocuments().clear();
				return;
			case sssPackage.VSSS_DOCUMENT__TERMS_DEFINITIONS_ABBREVIATIONS:
				setTermsDefinitionsAbbreviations((VSSSTermsDefinitionsAbbreviations)null);
				return;
			case sssPackage.VSSS_DOCUMENT__GENERAL_DESCRIPTION:
				setGeneralDescription((VSSSGeneralDescription)null);
				return;
			case sssPackage.VSSS_DOCUMENT__SPECIFIC_REQUIREMENTS:
				setSpecificRequirements((VSSSSpecificRequirements)null);
				return;
			case sssPackage.VSSS_DOCUMENT__VERIFICATION_VALIDATION_INTEGRATION:
				setVerificationValidationIntegration((VSSSVerificationValidationIntegration)null);
				return;
			case sssPackage.VSSS_DOCUMENT__SYSTEM_MODELS:
				setSystemModels((VSSSSystemModels)null);
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
			case sssPackage.VSSS_DOCUMENT__INTRODUCTION:
				return introduction != null;
			case sssPackage.VSSS_DOCUMENT__APPLICABLE_DOCUMENTS:
				return applicableDocuments != null && !applicableDocuments.isEmpty();
			case sssPackage.VSSS_DOCUMENT__REFERENCE_DOCUMENTS:
				return referenceDocuments != null && !referenceDocuments.isEmpty();
			case sssPackage.VSSS_DOCUMENT__TERMS_DEFINITIONS_ABBREVIATIONS:
				return termsDefinitionsAbbreviations != null;
			case sssPackage.VSSS_DOCUMENT__GENERAL_DESCRIPTION:
				return generalDescription != null;
			case sssPackage.VSSS_DOCUMENT__SPECIFIC_REQUIREMENTS:
				return specificRequirements != null;
			case sssPackage.VSSS_DOCUMENT__VERIFICATION_VALIDATION_INTEGRATION:
				return verificationValidationIntegration != null;
			case sssPackage.VSSS_DOCUMENT__SYSTEM_MODELS:
				return systemModels != null;
		}
		return super.eIsSet(featureID);
	}

} //VSSSDocumentImpl
