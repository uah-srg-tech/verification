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

import es.uah.aut.srg.micobs.svm.tdm.VTraceableDocumentFixedSection;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>VSSS Specific Requirements</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link es.uah.aut.srg.micobs.svm.sss.VSSSSpecificRequirements#getGeneral <em>General</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.svm.sss.VSSSSpecificRequirements#getCapabilities <em>Capabilities</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.svm.sss.VSSSSpecificRequirements#getSystemInterface <em>System Interface</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.svm.sss.VSSSSpecificRequirements#getAdaptationMissionization <em>Adaptation Missionization</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.svm.sss.VSSSSpecificRequirements#getComputerResource <em>Computer Resource</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.svm.sss.VSSSSpecificRequirements#getSecurity <em>Security</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.svm.sss.VSSSSpecificRequirements#getSafety <em>Safety</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.svm.sss.VSSSSpecificRequirements#getReliabiltyAvailability <em>Reliabilty Availability</em>}</li>
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
public interface VSSSSpecificRequirements extends VTraceableDocumentFixedSection {
	/**
	 * Returns the value of the '<em><b>General</b></em>' reference list.
	 * The list contents are of type {@link es.uah.aut.srg.micobs.svm.sss.VSSSGeneralDescription}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>General</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>General</em>' reference list.
	 * @see es.uah.aut.srg.micobs.svm.sss.sssPackage#getVSSSSpecificRequirements_General()
	 * @model
	 * @generated
	 */
	EList<VSSSGeneralDescription> getGeneral();

	/**
	 * Returns the value of the '<em><b>Capabilities</b></em>' reference list.
	 * The list contents are of type {@link es.uah.aut.srg.micobs.svm.sss.VSSSCapabilitiesRequirement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Capabilities</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Capabilities</em>' reference list.
	 * @see es.uah.aut.srg.micobs.svm.sss.sssPackage#getVSSSSpecificRequirements_Capabilities()
	 * @model
	 * @generated
	 */
	EList<VSSSCapabilitiesRequirement> getCapabilities();

	/**
	 * Returns the value of the '<em><b>System Interface</b></em>' reference list.
	 * The list contents are of type {@link es.uah.aut.srg.micobs.svm.sss.VSSSSystemInterfaceRequirement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>System Interface</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>System Interface</em>' reference list.
	 * @see es.uah.aut.srg.micobs.svm.sss.sssPackage#getVSSSSpecificRequirements_SystemInterface()
	 * @model
	 * @generated
	 */
	EList<VSSSSystemInterfaceRequirement> getSystemInterface();

	/**
	 * Returns the value of the '<em><b>Adaptation Missionization</b></em>' reference list.
	 * The list contents are of type {@link es.uah.aut.srg.micobs.svm.sss.VSSSAdaptationMissionizationRequirement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Adaptation Missionization</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Adaptation Missionization</em>' reference list.
	 * @see es.uah.aut.srg.micobs.svm.sss.sssPackage#getVSSSSpecificRequirements_AdaptationMissionization()
	 * @model
	 * @generated
	 */
	EList<VSSSAdaptationMissionizationRequirement> getAdaptationMissionization();

	/**
	 * Returns the value of the '<em><b>Computer Resource</b></em>' reference list.
	 * The list contents are of type {@link es.uah.aut.srg.micobs.svm.sss.VSSSComputerResourceRequirement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Computer Resource</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Computer Resource</em>' reference list.
	 * @see es.uah.aut.srg.micobs.svm.sss.sssPackage#getVSSSSpecificRequirements_ComputerResource()
	 * @model
	 * @generated
	 */
	EList<VSSSComputerResourceRequirement> getComputerResource();

	/**
	 * Returns the value of the '<em><b>Security</b></em>' reference list.
	 * The list contents are of type {@link es.uah.aut.srg.micobs.svm.sss.VSSSSecurityRequirement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Security</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Security</em>' reference list.
	 * @see es.uah.aut.srg.micobs.svm.sss.sssPackage#getVSSSSpecificRequirements_Security()
	 * @model
	 * @generated
	 */
	EList<VSSSSecurityRequirement> getSecurity();

	/**
	 * Returns the value of the '<em><b>Safety</b></em>' reference list.
	 * The list contents are of type {@link es.uah.aut.srg.micobs.svm.sss.VSSSSafetyRequirement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Safety</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Safety</em>' reference list.
	 * @see es.uah.aut.srg.micobs.svm.sss.sssPackage#getVSSSSpecificRequirements_Safety()
	 * @model
	 * @generated
	 */
	EList<VSSSSafetyRequirement> getSafety();

	/**
	 * Returns the value of the '<em><b>Reliabilty Availability</b></em>' reference list.
	 * The list contents are of type {@link es.uah.aut.srg.micobs.svm.sss.VSSSReliabiltyAvailabilityRequirement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reliabilty Availability</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reliabilty Availability</em>' reference list.
	 * @see es.uah.aut.srg.micobs.svm.sss.sssPackage#getVSSSSpecificRequirements_ReliabiltyAvailability()
	 * @model
	 * @generated
	 */
	EList<VSSSReliabiltyAvailabilityRequirement> getReliabiltyAvailability();

	/**
	 * Returns the value of the '<em><b>Quality</b></em>' reference list.
	 * The list contents are of type {@link es.uah.aut.srg.micobs.svm.sss.VSSSQualityRequirement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Quality</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Quality</em>' reference list.
	 * @see es.uah.aut.srg.micobs.svm.sss.sssPackage#getVSSSSpecificRequirements_Quality()
	 * @model
	 * @generated
	 */
	EList<VSSSQualityRequirement> getQuality();

	/**
	 * Returns the value of the '<em><b>Design</b></em>' reference list.
	 * The list contents are of type {@link es.uah.aut.srg.micobs.svm.sss.VSSSDesignRequirement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Design</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Design</em>' reference list.
	 * @see es.uah.aut.srg.micobs.svm.sss.sssPackage#getVSSSSpecificRequirements_Design()
	 * @model
	 * @generated
	 */
	EList<VSSSDesignRequirement> getDesign();

	/**
	 * Returns the value of the '<em><b>Software Operations</b></em>' reference list.
	 * The list contents are of type {@link es.uah.aut.srg.micobs.svm.sss.VSSSSoftwareOperationsRequirement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Software Operations</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Software Operations</em>' reference list.
	 * @see es.uah.aut.srg.micobs.svm.sss.sssPackage#getVSSSSpecificRequirements_SoftwareOperations()
	 * @model
	 * @generated
	 */
	EList<VSSSSoftwareOperationsRequirement> getSoftwareOperations();

	/**
	 * Returns the value of the '<em><b>Software Maintenance</b></em>' reference list.
	 * The list contents are of type {@link es.uah.aut.srg.micobs.svm.sss.VSSSSoftwareMaintenanceRequirement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Software Maintenance</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Software Maintenance</em>' reference list.
	 * @see es.uah.aut.srg.micobs.svm.sss.sssPackage#getVSSSSpecificRequirements_SoftwareMaintenance()
	 * @model
	 * @generated
	 */
	EList<VSSSSoftwareMaintenanceRequirement> getSoftwareMaintenance();

	/**
	 * Returns the value of the '<em><b>System Software Observability</b></em>' reference list.
	 * The list contents are of type {@link es.uah.aut.srg.micobs.svm.sss.VSSSSystemSoftwareObservabilityRequirement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>System Software Observability</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>System Software Observability</em>' reference list.
	 * @see es.uah.aut.srg.micobs.svm.sss.sssPackage#getVSSSSpecificRequirements_SystemSoftwareObservability()
	 * @model
	 * @generated
	 */
	EList<VSSSSystemSoftwareObservabilityRequirement> getSystemSoftwareObservability();

} // VSSSSpecificRequirements
