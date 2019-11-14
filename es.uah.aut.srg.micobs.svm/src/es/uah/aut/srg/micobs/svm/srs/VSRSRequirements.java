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
package es.uah.aut.srg.micobs.svm.srs;

import es.uah.aut.srg.micobs.doctpl.doctpl.DBody;
import es.uah.aut.srg.micobs.doctpl.doctpl.DFixedSection;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>VSRS Requirements</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link es.uah.aut.srg.micobs.svm.srs.VSRSRequirements#getSectionDescription <em>Section Description</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.svm.srs.VSRSRequirements#getGeneral <em>General</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.svm.srs.VSRSRequirements#getFunctional <em>Functional</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.svm.srs.VSRSRequirements#getPerformance <em>Performance</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.svm.srs.VSRSRequirements#getInterface <em>Interface</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.svm.srs.VSRSRequirements#getOperational <em>Operational</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.svm.srs.VSRSRequirements#getResources <em>Resources</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.svm.srs.VSRSRequirements#getDesign <em>Design</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.svm.srs.VSRSRequirements#getSecurityPrivacy <em>Security Privacy</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.svm.srs.VSRSRequirements#getPortability <em>Portability</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.svm.srs.VSRSRequirements#getSwQuality <em>Sw Quality</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.svm.srs.VSRSRequirements#getSwReliability <em>Sw Reliability</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.svm.srs.VSRSRequirements#getSwMaintainability <em>Sw Maintainability</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.svm.srs.VSRSRequirements#getSwSafety <em>Sw Safety</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.svm.srs.VSRSRequirements#getSwConfigurationDelivery <em>Sw Configuration Delivery</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.svm.srs.VSRSRequirements#getDataDefinitionDB <em>Data Definition DB</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.svm.srs.VSRSRequirements#getHumanFactors <em>Human Factors</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.svm.srs.VSRSRequirements#getAdaptationInstallation <em>Adaptation Installation</em>}</li>
 * </ul>
 *
 * @see es.uah.aut.srg.micobs.svm.srs.srsPackage#getVSRSRequirements()
 * @model
 * @generated
 */
public interface VSRSRequirements extends DFixedSection {
	/**
	 * Returns the value of the '<em><b>Section Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Section Description</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Section Description</em>' containment reference.
	 * @see #setSectionDescription(DBody)
	 * @see es.uah.aut.srg.micobs.svm.srs.srsPackage#getVSRSRequirements_SectionDescription()
	 * @model containment="true"
	 * @generated
	 */
	DBody getSectionDescription();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.micobs.svm.srs.VSRSRequirements#getSectionDescription <em>Section Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Section Description</em>' containment reference.
	 * @see #getSectionDescription()
	 * @generated
	 */
	void setSectionDescription(DBody value);

	/**
	 * Returns the value of the '<em><b>General</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>General</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>General</em>' containment reference.
	 * @see #setGeneral(VSRSGeneralRequirements)
	 * @see es.uah.aut.srg.micobs.svm.srs.srsPackage#getVSRSRequirements_General()
	 * @model containment="true" required="true"
	 * @generated
	 */
	VSRSGeneralRequirements getGeneral();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.micobs.svm.srs.VSRSRequirements#getGeneral <em>General</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>General</em>' containment reference.
	 * @see #getGeneral()
	 * @generated
	 */
	void setGeneral(VSRSGeneralRequirements value);

	/**
	 * Returns the value of the '<em><b>Functional</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Functional</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Functional</em>' containment reference.
	 * @see #setFunctional(VSRSFunctionalRequirements)
	 * @see es.uah.aut.srg.micobs.svm.srs.srsPackage#getVSRSRequirements_Functional()
	 * @model containment="true" required="true"
	 * @generated
	 */
	VSRSFunctionalRequirements getFunctional();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.micobs.svm.srs.VSRSRequirements#getFunctional <em>Functional</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Functional</em>' containment reference.
	 * @see #getFunctional()
	 * @generated
	 */
	void setFunctional(VSRSFunctionalRequirements value);

	/**
	 * Returns the value of the '<em><b>Performance</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Performance</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Performance</em>' containment reference.
	 * @see #setPerformance(VSRSPerformanceRequirements)
	 * @see es.uah.aut.srg.micobs.svm.srs.srsPackage#getVSRSRequirements_Performance()
	 * @model containment="true" required="true"
	 * @generated
	 */
	VSRSPerformanceRequirements getPerformance();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.micobs.svm.srs.VSRSRequirements#getPerformance <em>Performance</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Performance</em>' containment reference.
	 * @see #getPerformance()
	 * @generated
	 */
	void setPerformance(VSRSPerformanceRequirements value);

	/**
	 * Returns the value of the '<em><b>Interface</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Interface</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Interface</em>' containment reference.
	 * @see #setInterface(VSRSInterfaceRequirements)
	 * @see es.uah.aut.srg.micobs.svm.srs.srsPackage#getVSRSRequirements_Interface()
	 * @model containment="true" required="true"
	 * @generated
	 */
	VSRSInterfaceRequirements getInterface();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.micobs.svm.srs.VSRSRequirements#getInterface <em>Interface</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Interface</em>' containment reference.
	 * @see #getInterface()
	 * @generated
	 */
	void setInterface(VSRSInterfaceRequirements value);

	/**
	 * Returns the value of the '<em><b>Operational</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operational</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operational</em>' containment reference.
	 * @see #setOperational(VSRSOperationalRequirements)
	 * @see es.uah.aut.srg.micobs.svm.srs.srsPackage#getVSRSRequirements_Operational()
	 * @model containment="true" required="true"
	 * @generated
	 */
	VSRSOperationalRequirements getOperational();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.micobs.svm.srs.VSRSRequirements#getOperational <em>Operational</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operational</em>' containment reference.
	 * @see #getOperational()
	 * @generated
	 */
	void setOperational(VSRSOperationalRequirements value);

	/**
	 * Returns the value of the '<em><b>Resources</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Resources</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resources</em>' containment reference.
	 * @see #setResources(VSRSResourcesRequirements)
	 * @see es.uah.aut.srg.micobs.svm.srs.srsPackage#getVSRSRequirements_Resources()
	 * @model containment="true" required="true"
	 * @generated
	 */
	VSRSResourcesRequirements getResources();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.micobs.svm.srs.VSRSRequirements#getResources <em>Resources</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Resources</em>' containment reference.
	 * @see #getResources()
	 * @generated
	 */
	void setResources(VSRSResourcesRequirements value);

	/**
	 * Returns the value of the '<em><b>Design</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Design</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Design</em>' containment reference.
	 * @see #setDesign(VSRSDesignRequirements)
	 * @see es.uah.aut.srg.micobs.svm.srs.srsPackage#getVSRSRequirements_Design()
	 * @model containment="true" required="true"
	 * @generated
	 */
	VSRSDesignRequirements getDesign();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.micobs.svm.srs.VSRSRequirements#getDesign <em>Design</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Design</em>' containment reference.
	 * @see #getDesign()
	 * @generated
	 */
	void setDesign(VSRSDesignRequirements value);

	/**
	 * Returns the value of the '<em><b>Security Privacy</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Security Privacy</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Security Privacy</em>' containment reference.
	 * @see #setSecurityPrivacy(VSRSSecurityPrivacyRequirements)
	 * @see es.uah.aut.srg.micobs.svm.srs.srsPackage#getVSRSRequirements_SecurityPrivacy()
	 * @model containment="true" required="true"
	 * @generated
	 */
	VSRSSecurityPrivacyRequirements getSecurityPrivacy();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.micobs.svm.srs.VSRSRequirements#getSecurityPrivacy <em>Security Privacy</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Security Privacy</em>' containment reference.
	 * @see #getSecurityPrivacy()
	 * @generated
	 */
	void setSecurityPrivacy(VSRSSecurityPrivacyRequirements value);

	/**
	 * Returns the value of the '<em><b>Portability</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Portability</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Portability</em>' containment reference.
	 * @see #setPortability(VSRSPortabilityRequirements)
	 * @see es.uah.aut.srg.micobs.svm.srs.srsPackage#getVSRSRequirements_Portability()
	 * @model containment="true" required="true"
	 * @generated
	 */
	VSRSPortabilityRequirements getPortability();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.micobs.svm.srs.VSRSRequirements#getPortability <em>Portability</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Portability</em>' containment reference.
	 * @see #getPortability()
	 * @generated
	 */
	void setPortability(VSRSPortabilityRequirements value);

	/**
	 * Returns the value of the '<em><b>Sw Quality</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sw Quality</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sw Quality</em>' containment reference.
	 * @see #setSwQuality(VSRSSWQualityRequirements)
	 * @see es.uah.aut.srg.micobs.svm.srs.srsPackage#getVSRSRequirements_SwQuality()
	 * @model containment="true" required="true"
	 * @generated
	 */
	VSRSSWQualityRequirements getSwQuality();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.micobs.svm.srs.VSRSRequirements#getSwQuality <em>Sw Quality</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sw Quality</em>' containment reference.
	 * @see #getSwQuality()
	 * @generated
	 */
	void setSwQuality(VSRSSWQualityRequirements value);

	/**
	 * Returns the value of the '<em><b>Sw Reliability</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sw Reliability</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sw Reliability</em>' containment reference.
	 * @see #setSwReliability(VSRSSWReliabilityRequirements)
	 * @see es.uah.aut.srg.micobs.svm.srs.srsPackage#getVSRSRequirements_SwReliability()
	 * @model containment="true" required="true"
	 * @generated
	 */
	VSRSSWReliabilityRequirements getSwReliability();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.micobs.svm.srs.VSRSRequirements#getSwReliability <em>Sw Reliability</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sw Reliability</em>' containment reference.
	 * @see #getSwReliability()
	 * @generated
	 */
	void setSwReliability(VSRSSWReliabilityRequirements value);

	/**
	 * Returns the value of the '<em><b>Sw Maintainability</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sw Maintainability</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sw Maintainability</em>' containment reference.
	 * @see #setSwMaintainability(VSRSSWMaintainabilityRequirements)
	 * @see es.uah.aut.srg.micobs.svm.srs.srsPackage#getVSRSRequirements_SwMaintainability()
	 * @model containment="true" required="true"
	 * @generated
	 */
	VSRSSWMaintainabilityRequirements getSwMaintainability();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.micobs.svm.srs.VSRSRequirements#getSwMaintainability <em>Sw Maintainability</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sw Maintainability</em>' containment reference.
	 * @see #getSwMaintainability()
	 * @generated
	 */
	void setSwMaintainability(VSRSSWMaintainabilityRequirements value);

	/**
	 * Returns the value of the '<em><b>Sw Safety</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sw Safety</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sw Safety</em>' containment reference.
	 * @see #setSwSafety(VSRSSWSafetyRequirements)
	 * @see es.uah.aut.srg.micobs.svm.srs.srsPackage#getVSRSRequirements_SwSafety()
	 * @model containment="true" required="true"
	 * @generated
	 */
	VSRSSWSafetyRequirements getSwSafety();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.micobs.svm.srs.VSRSRequirements#getSwSafety <em>Sw Safety</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sw Safety</em>' containment reference.
	 * @see #getSwSafety()
	 * @generated
	 */
	void setSwSafety(VSRSSWSafetyRequirements value);

	/**
	 * Returns the value of the '<em><b>Sw Configuration Delivery</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sw Configuration Delivery</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sw Configuration Delivery</em>' containment reference.
	 * @see #setSwConfigurationDelivery(VSRSSWConfigurationDeliveryRequirements)
	 * @see es.uah.aut.srg.micobs.svm.srs.srsPackage#getVSRSRequirements_SwConfigurationDelivery()
	 * @model containment="true" required="true"
	 * @generated
	 */
	VSRSSWConfigurationDeliveryRequirements getSwConfigurationDelivery();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.micobs.svm.srs.VSRSRequirements#getSwConfigurationDelivery <em>Sw Configuration Delivery</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sw Configuration Delivery</em>' containment reference.
	 * @see #getSwConfigurationDelivery()
	 * @generated
	 */
	void setSwConfigurationDelivery(VSRSSWConfigurationDeliveryRequirements value);

	/**
	 * Returns the value of the '<em><b>Data Definition DB</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Data Definition DB</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Definition DB</em>' containment reference.
	 * @see #setDataDefinitionDB(VSRSDataDefinitionDBRequirements)
	 * @see es.uah.aut.srg.micobs.svm.srs.srsPackage#getVSRSRequirements_DataDefinitionDB()
	 * @model containment="true" required="true"
	 * @generated
	 */
	VSRSDataDefinitionDBRequirements getDataDefinitionDB();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.micobs.svm.srs.VSRSRequirements#getDataDefinitionDB <em>Data Definition DB</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Definition DB</em>' containment reference.
	 * @see #getDataDefinitionDB()
	 * @generated
	 */
	void setDataDefinitionDB(VSRSDataDefinitionDBRequirements value);

	/**
	 * Returns the value of the '<em><b>Human Factors</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Human Factors</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Human Factors</em>' containment reference.
	 * @see #setHumanFactors(VSRSHumanFactorsRequirements)
	 * @see es.uah.aut.srg.micobs.svm.srs.srsPackage#getVSRSRequirements_HumanFactors()
	 * @model containment="true" required="true"
	 * @generated
	 */
	VSRSHumanFactorsRequirements getHumanFactors();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.micobs.svm.srs.VSRSRequirements#getHumanFactors <em>Human Factors</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Human Factors</em>' containment reference.
	 * @see #getHumanFactors()
	 * @generated
	 */
	void setHumanFactors(VSRSHumanFactorsRequirements value);

	/**
	 * Returns the value of the '<em><b>Adaptation Installation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Adaptation Installation</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Adaptation Installation</em>' containment reference.
	 * @see #setAdaptationInstallation(VSRSAdaptationInstallationRequirements)
	 * @see es.uah.aut.srg.micobs.svm.srs.srsPackage#getVSRSRequirements_AdaptationInstallation()
	 * @model containment="true" required="true"
	 * @generated
	 */
	VSRSAdaptationInstallationRequirements getAdaptationInstallation();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.micobs.svm.srs.VSRSRequirements#getAdaptationInstallation <em>Adaptation Installation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Adaptation Installation</em>' containment reference.
	 * @see #getAdaptationInstallation()
	 * @generated
	 */
	void setAdaptationInstallation(VSRSAdaptationInstallationRequirements value);

} // VSRSRequirements
