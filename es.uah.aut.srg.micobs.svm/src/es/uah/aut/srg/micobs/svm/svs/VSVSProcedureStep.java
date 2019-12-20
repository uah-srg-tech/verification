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
package es.uah.aut.srg.micobs.svm.svs;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>VSVS Procedure Step</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link es.uah.aut.srg.micobs.svm.svs.VSVSProcedureStep#getName <em>Name</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.svm.svs.VSVSProcedureStep#getPrev_step <em>Prev step</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.svm.svs.VSVSProcedureStep#getPrev_tm_from_prev_step <em>Prev tm from prev step</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.svm.svs.VSVSProcedureStep#getReplays <em>Replays</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.svm.svs.VSVSProcedureStep#getConfigurations <em>Configurations</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.svm.svs.VSVSProcedureStep#getInputs <em>Inputs</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.svm.svs.VSVSProcedureStep#getOutputs <em>Outputs</em>}</li>
 * </ul>
 *
 * @see es.uah.aut.srg.micobs.svm.svs.svsPackage#getVSVSProcedureStep()
 * @model
 * @generated
 */
public interface VSVSProcedureStep extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see es.uah.aut.srg.micobs.svm.svs.svsPackage#getVSVSProcedureStep_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.micobs.svm.svs.VSVSProcedureStep#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Prev step</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Prev step</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Prev step</em>' reference.
	 * @see #setPrev_step(VSVSProcedureStep)
	 * @see es.uah.aut.srg.micobs.svm.svs.svsPackage#getVSVSProcedureStep_Prev_step()
	 * @model
	 * @generated
	 */
	VSVSProcedureStep getPrev_step();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.micobs.svm.svs.VSVSProcedureStep#getPrev_step <em>Prev step</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Prev step</em>' reference.
	 * @see #getPrev_step()
	 * @generated
	 */
	void setPrev_step(VSVSProcedureStep value);

	/**
	 * Returns the value of the '<em><b>Prev tm from prev step</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Prev tm from prev step</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Prev tm from prev step</em>' reference.
	 * @see #setPrev_tm_from_prev_step(VSVSStepTelemetry)
	 * @see es.uah.aut.srg.micobs.svm.svs.svsPackage#getVSVSProcedureStep_Prev_tm_from_prev_step()
	 * @model
	 * @generated
	 */
	VSVSStepTelemetry getPrev_tm_from_prev_step();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.micobs.svm.svs.VSVSProcedureStep#getPrev_tm_from_prev_step <em>Prev tm from prev step</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Prev tm from prev step</em>' reference.
	 * @see #getPrev_tm_from_prev_step()
	 * @generated
	 */
	void setPrev_tm_from_prev_step(VSVSStepTelemetry value);

	/**
	 * Returns the value of the '<em><b>Outputs</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Outputs</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Outputs</em>' containment reference.
	 * @see #setOutputs(VSVSStepOutputs)
	 * @see es.uah.aut.srg.micobs.svm.svs.svsPackage#getVSVSProcedureStep_Outputs()
	 * @model containment="true"
	 * @generated
	 */
	VSVSStepOutputs getOutputs();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.micobs.svm.svs.VSVSProcedureStep#getOutputs <em>Outputs</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Outputs</em>' containment reference.
	 * @see #getOutputs()
	 * @generated
	 */
	void setOutputs(VSVSStepOutputs value);

	/**
	 * Returns the value of the '<em><b>Configurations</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Configurations</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Configurations</em>' containment reference.
	 * @see #setConfigurations(VSVSStepConfigurations)
	 * @see es.uah.aut.srg.micobs.svm.svs.svsPackage#getVSVSProcedureStep_Configurations()
	 * @model containment="true"
	 * @generated
	 */
	VSVSStepConfigurations getConfigurations();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.micobs.svm.svs.VSVSProcedureStep#getConfigurations <em>Configurations</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Configurations</em>' containment reference.
	 * @see #getConfigurations()
	 * @generated
	 */
	void setConfigurations(VSVSStepConfigurations value);

	/**
	 * Returns the value of the '<em><b>Inputs</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Inputs</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Inputs</em>' containment reference.
	 * @see #setInputs(VSVSStepInputs)
	 * @see es.uah.aut.srg.micobs.svm.svs.svsPackage#getVSVSProcedureStep_Inputs()
	 * @model containment="true" required="true"
	 * @generated
	 */
	VSVSStepInputs getInputs();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.micobs.svm.svs.VSVSProcedureStep#getInputs <em>Inputs</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Inputs</em>' containment reference.
	 * @see #getInputs()
	 * @generated
	 */
	void setInputs(VSVSStepInputs value);

	/**
	 * Returns the value of the '<em><b>Replays</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Replays</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Replays</em>' attribute.
	 * @see #setReplays(String)
	 * @see es.uah.aut.srg.micobs.svm.svs.svsPackage#getVSVSProcedureStep_Replays()
	 * @model
	 * @generated
	 */
	String getReplays();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.micobs.svm.svs.VSVSProcedureStep#getReplays <em>Replays</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Replays</em>' attribute.
	 * @see #getReplays()
	 * @generated
	 */
	void setReplays(String value);

} // VSVSProcedureStep
