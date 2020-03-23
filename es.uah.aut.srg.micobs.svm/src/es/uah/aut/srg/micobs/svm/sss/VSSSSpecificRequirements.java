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
package es.uah.aut.srg.micobs.svm.sss;

import org.eclipse.emf.common.util.EList;

import es.uah.aut.srg.micobs.doctpl.doctpl.DBody;
import es.uah.aut.srg.micobs.doctpl.doctpl.DFixedSection;
import es.uah.aut.srg.micobs.doctpl.doctpl.DReferenceableObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>VSSS Specific Requirements</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link es.uah.aut.srg.micobs.svm.sss.VSSSSpecificRequirements#getSectionDescription <em>Section Description</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.svm.sss.VSSSSpecificRequirements#getGeneral <em>General</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.svm.sss.VSSSSpecificRequirements#getCapabilities <em>Capabilities</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.svm.sss.VSSSSpecificRequirements#getSystemInterface <em>System Interface</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.svm.sss.VSSSSpecificRequirements#getAdaptationMissionization <em>Adaptation Missionization</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.svm.sss.VSSSSpecificRequirements#getComputerResource <em>Computer Resource</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.svm.sss.VSSSSpecificRequirements#getSecurity <em>Security</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.svm.sss.VSSSSpecificRequirements#getSafety <em>Safety</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.svm.sss.VSSSSpecificRequirements#getReliabilityAvailability <em>Reliability Availability</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.svm.sss.VSSSSpecificRequirements#getQuality <em>Quality</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.svm.sss.VSSSSpecificRequirements#getDesign <em>Design</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.svm.sss.VSSSSpecificRequirements#getSoftwareOperations <em>Software Operations</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.svm.sss.VSSSSpecificRequirements#getSoftwareMaintenance <em>Software Maintenance</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.svm.sss.VSSSSpecificRequirements#getSystemSoftwareObservability <em>System Software Observability</em>}</li>
 * </ul>
 *
 * @see es.uah.aut.srg.micobs.svm.sss.sssPackage#getVSSSSpecificRequirements()
 * @model
 * @generated
 */
public interface VSSSSpecificRequirements extends DFixedSection {
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
	 * @see es.uah.aut.srg.micobs.svm.sss.sssPackage#getVSSSSpecificRequirements_SectionDescription()
	 * @model containment="true"
	 * @generated
	 */
	DBody getSectionDescription();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.micobs.svm.sss.VSSSSpecificRequirements#getSectionDescription <em>Section Description</em>}' containment reference.
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
	 * @see #setGeneral(VSSSGeneralRequirements)
	 * @see es.uah.aut.srg.micobs.svm.sss.sssPackage#getVSSSSpecificRequirements_General()
	 * @model containment="true" required="true"
	 * @generated
	 */
	VSSSGeneralRequirements getGeneral();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.micobs.svm.sss.VSSSSpecificRequirements#getGeneral <em>General</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>General</em>' containment reference.
	 * @see #getGeneral()
	 * @generated
	 */
	void setGeneral(VSSSGeneralRequirements value);

	/**
	 * Returns the value of the '<em><b>Capabilities</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Capabilities</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Capabilities</em>' containment reference.
	 * @see #setCapabilities(VSSSCapabilitiesRequirements)
	 * @see es.uah.aut.srg.micobs.svm.sss.sssPackage#getVSSSSpecificRequirements_Capabilities()
	 * @model containment="true" required="true"
	 * @generated
	 */
	VSSSCapabilitiesRequirements getCapabilities();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.micobs.svm.sss.VSSSSpecificRequirements#getCapabilities <em>Capabilities</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Capabilities</em>' containment reference.
	 * @see #getCapabilities()
	 * @generated
	 */
	void setCapabilities(VSSSCapabilitiesRequirements value);

	/**
	 * Returns the value of the '<em><b>System Interface</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>System Interface</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>System Interface</em>' containment reference.
	 * @see #setSystemInterface(VSSSSystemInterfaceRequirements)
	 * @see es.uah.aut.srg.micobs.svm.sss.sssPackage#getVSSSSpecificRequirements_SystemInterface()
	 * @model containment="true" required="true"
	 * @generated
	 */
	VSSSSystemInterfaceRequirements getSystemInterface();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.micobs.svm.sss.VSSSSpecificRequirements#getSystemInterface <em>System Interface</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>System Interface</em>' containment reference.
	 * @see #getSystemInterface()
	 * @generated
	 */
	void setSystemInterface(VSSSSystemInterfaceRequirements value);

	/**
	 * Returns the value of the '<em><b>Adaptation Missionization</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Adaptation Missionization</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Adaptation Missionization</em>' containment reference.
	 * @see #setAdaptationMissionization(VSSSAdaptationMissionizationRequirements)
	 * @see es.uah.aut.srg.micobs.svm.sss.sssPackage#getVSSSSpecificRequirements_AdaptationMissionization()
	 * @model containment="true" required="true"
	 * @generated
	 */
	VSSSAdaptationMissionizationRequirements getAdaptationMissionization();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.micobs.svm.sss.VSSSSpecificRequirements#getAdaptationMissionization <em>Adaptation Missionization</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Adaptation Missionization</em>' containment reference.
	 * @see #getAdaptationMissionization()
	 * @generated
	 */
	void setAdaptationMissionization(VSSSAdaptationMissionizationRequirements value);

	/**
	 * Returns the value of the '<em><b>Computer Resource</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Computer Resource</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Computer Resource</em>' containment reference.
	 * @see #setComputerResource(VSSSComputerResourceRequirements)
	 * @see es.uah.aut.srg.micobs.svm.sss.sssPackage#getVSSSSpecificRequirements_ComputerResource()
	 * @model containment="true" required="true"
	 * @generated
	 */
	VSSSComputerResourceRequirements getComputerResource();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.micobs.svm.sss.VSSSSpecificRequirements#getComputerResource <em>Computer Resource</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Computer Resource</em>' containment reference.
	 * @see #getComputerResource()
	 * @generated
	 */
	void setComputerResource(VSSSComputerResourceRequirements value);

	/**
	 * Returns the value of the '<em><b>Security</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Security</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Security</em>' containment reference.
	 * @see #setSecurity(VSSSSecurityRequirements)
	 * @see es.uah.aut.srg.micobs.svm.sss.sssPackage#getVSSSSpecificRequirements_Security()
	 * @model containment="true" required="true"
	 * @generated
	 */
	VSSSSecurityRequirements getSecurity();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.micobs.svm.sss.VSSSSpecificRequirements#getSecurity <em>Security</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Security</em>' containment reference.
	 * @see #getSecurity()
	 * @generated
	 */
	void setSecurity(VSSSSecurityRequirements value);

	/**
	 * Returns the value of the '<em><b>Safety</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Safety</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Safety</em>' containment reference.
	 * @see #setSafety(VSSSSafetyRequirements)
	 * @see es.uah.aut.srg.micobs.svm.sss.sssPackage#getVSSSSpecificRequirements_Safety()
	 * @model containment="true" required="true"
	 * @generated
	 */
	VSSSSafetyRequirements getSafety();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.micobs.svm.sss.VSSSSpecificRequirements#getSafety <em>Safety</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Safety</em>' containment reference.
	 * @see #getSafety()
	 * @generated
	 */
	void setSafety(VSSSSafetyRequirements value);

	/**
	 * Returns the value of the '<em><b>Reliability Availability</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reliability Availability</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reliability Availability</em>' containment reference.
	 * @see #setReliabilityAvailability(VSSSReliabilityAvailabilityRequirements)
	 * @see es.uah.aut.srg.micobs.svm.sss.sssPackage#getVSSSSpecificRequirements_ReliabilityAvailability()
	 * @model containment="true" required="true"
	 * @generated
	 */
	VSSSReliabilityAvailabilityRequirements getReliabilityAvailability();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.micobs.svm.sss.VSSSSpecificRequirements#getReliabilityAvailability <em>Reliability Availability</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reliability Availability</em>' containment reference.
	 * @see #getReliabilityAvailability()
	 * @generated
	 */
	void setReliabilityAvailability(VSSSReliabilityAvailabilityRequirements value);

	/**
	 * Returns the value of the '<em><b>Quality</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Quality</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Quality</em>' containment reference.
	 * @see #setQuality(VSSSQualityRequirements)
	 * @see es.uah.aut.srg.micobs.svm.sss.sssPackage#getVSSSSpecificRequirements_Quality()
	 * @model containment="true" required="true"
	 * @generated
	 */
	VSSSQualityRequirements getQuality();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.micobs.svm.sss.VSSSSpecificRequirements#getQuality <em>Quality</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Quality</em>' containment reference.
	 * @see #getQuality()
	 * @generated
	 */
	void setQuality(VSSSQualityRequirements value);

	/**
	 * Returns the value of the '<em><b>Design</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Design</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Design</em>' containment reference.
	 * @see #setDesign(VSSSDesignRequirements)
	 * @see es.uah.aut.srg.micobs.svm.sss.sssPackage#getVSSSSpecificRequirements_Design()
	 * @model containment="true" required="true"
	 * @generated
	 */
	VSSSDesignRequirements getDesign();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.micobs.svm.sss.VSSSSpecificRequirements#getDesign <em>Design</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Design</em>' containment reference.
	 * @see #getDesign()
	 * @generated
	 */
	void setDesign(VSSSDesignRequirements value);

	/**
	 * Returns the value of the '<em><b>Software Operations</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Software Operations</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Software Operations</em>' containment reference.
	 * @see #setSoftwareOperations(VSSSSoftwareOperationsRequirements)
	 * @see es.uah.aut.srg.micobs.svm.sss.sssPackage#getVSSSSpecificRequirements_SoftwareOperations()
	 * @model containment="true" required="true"
	 * @generated
	 */
	VSSSSoftwareOperationsRequirements getSoftwareOperations();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.micobs.svm.sss.VSSSSpecificRequirements#getSoftwareOperations <em>Software Operations</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Software Operations</em>' containment reference.
	 * @see #getSoftwareOperations()
	 * @generated
	 */
	void setSoftwareOperations(VSSSSoftwareOperationsRequirements value);

	/**
	 * Returns the value of the '<em><b>Software Maintenance</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Software Maintenance</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Software Maintenance</em>' containment reference.
	 * @see #setSoftwareMaintenance(VSSSSoftwareMaintenanceRequirements)
	 * @see es.uah.aut.srg.micobs.svm.sss.sssPackage#getVSSSSpecificRequirements_SoftwareMaintenance()
	 * @model containment="true" required="true"
	 * @generated
	 */
	VSSSSoftwareMaintenanceRequirements getSoftwareMaintenance();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.micobs.svm.sss.VSSSSpecificRequirements#getSoftwareMaintenance <em>Software Maintenance</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Software Maintenance</em>' containment reference.
	 * @see #getSoftwareMaintenance()
	 * @generated
	 */
	void setSoftwareMaintenance(VSSSSoftwareMaintenanceRequirements value);

	/**
	 * Returns the value of the '<em><b>System Software Observability</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>System Software Observability</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>System Software Observability</em>' containment reference.
	 * @see #setSystemSoftwareObservability(VSSSSystemSoftwareObservabilityRequirements)
	 * @see es.uah.aut.srg.micobs.svm.sss.sssPackage#getVSSSSpecificRequirements_SystemSoftwareObservability()
	 * @model containment="true" required="true"
	 * @generated
	 */
	VSSSSystemSoftwareObservabilityRequirements getSystemSoftwareObservability();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.micobs.svm.sss.VSSSSpecificRequirements#getSystemSoftwareObservability <em>System Software Observability</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>System Software Observability</em>' containment reference.
	 * @see #getSystemSoftwareObservability()
	 * @generated
	 */
	void setSystemSoftwareObservability(VSSSSystemSoftwareObservabilityRequirements value);

	EList<DReferenceableObject> getReferenceableObjects(String ReferenceableObjectType);

} // VSSSSpecificRequirements
