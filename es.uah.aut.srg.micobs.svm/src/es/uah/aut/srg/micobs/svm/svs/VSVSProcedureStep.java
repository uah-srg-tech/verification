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
 *   <li>{@link es.uah.aut.srg.micobs.svm.svs.VSVSProcedureStep#getDescription <em>Description</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.svm.svs.VSVSProcedureStep#getId <em>Id</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.svm.svs.VSVSProcedureStep#getMode <em>Mode</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.svm.svs.VSVSProcedureStep#getReplays <em>Replays</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.svm.svs.VSVSProcedureStep#getPrev_step_idref <em>Prev step idref</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.svm.svs.VSVSProcedureStep#getOutput_idref_from_prev_step <em>Output idref from prev step</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.svm.svs.VSVSProcedureStep#getInputs <em>Inputs</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.svm.svs.VSVSProcedureStep#getOutputs <em>Outputs</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.svm.svs.VSVSProcedureStep#getSpecialPackets <em>Special Packets</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.svm.svs.VSVSProcedureStep#getConcurrent_steps <em>Concurrent steps</em>}</li>
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
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see es.uah.aut.srg.micobs.svm.svs.svsPackage#getVSVSProcedureStep_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.micobs.svm.svs.VSVSProcedureStep#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see es.uah.aut.srg.micobs.svm.svs.svsPackage#getVSVSProcedureStep_Id()
	 * @model required="true"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.micobs.svm.svs.VSVSProcedureStep#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>Mode</b></em>' attribute.
	 * The literals are from the enumeration {@link es.uah.aut.srg.micobs.svm.svs.VSVSStepMode}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mode</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mode</em>' attribute.
	 * @see es.uah.aut.srg.micobs.svm.svs.VSVSStepMode
	 * @see #isSetMode()
	 * @see #unsetMode()
	 * @see #setMode(VSVSStepMode)
	 * @see es.uah.aut.srg.micobs.svm.svs.svsPackage#getVSVSProcedureStep_Mode()
	 * @model unsettable="true" required="true"
	 * @generated
	 */
	VSVSStepMode getMode();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.micobs.svm.svs.VSVSProcedureStep#getMode <em>Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mode</em>' attribute.
	 * @see es.uah.aut.srg.micobs.svm.svs.VSVSStepMode
	 * @see #isSetMode()
	 * @see #unsetMode()
	 * @see #getMode()
	 * @generated
	 */
	void setMode(VSVSStepMode value);

	/**
	 * Unsets the value of the '{@link es.uah.aut.srg.micobs.svm.svs.VSVSProcedureStep#getMode <em>Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetMode()
	 * @see #getMode()
	 * @see #setMode(VSVSStepMode)
	 * @generated
	 */
	void unsetMode();

	/**
	 * Returns whether the value of the '{@link es.uah.aut.srg.micobs.svm.svs.VSVSProcedureStep#getMode <em>Mode</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Mode</em>' attribute is set.
	 * @see #unsetMode()
	 * @see #getMode()
	 * @see #setMode(VSVSStepMode)
	 * @generated
	 */
	boolean isSetMode();

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

	/**
	 * Returns the value of the '<em><b>Prev step idref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Prev step idref</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Prev step idref</em>' reference.
	 * @see #setPrev_step_idref(VSVSProcedureStep)
	 * @see es.uah.aut.srg.micobs.svm.svs.svsPackage#getVSVSProcedureStep_Prev_step_idref()
	 * @model
	 * @generated
	 */
	VSVSProcedureStep getPrev_step_idref();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.micobs.svm.svs.VSVSProcedureStep#getPrev_step_idref <em>Prev step idref</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Prev step idref</em>' reference.
	 * @see #getPrev_step_idref()
	 * @generated
	 */
	void setPrev_step_idref(VSVSProcedureStep value);

	/**
	 * Returns the value of the '<em><b>Output idref from prev step</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Output idref from prev step</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Output idref from prev step</em>' reference.
	 * @see #setOutput_idref_from_prev_step(VSVSStepOutput)
	 * @see es.uah.aut.srg.micobs.svm.svs.svsPackage#getVSVSProcedureStep_Output_idref_from_prev_step()
	 * @model
	 * @generated
	 */
	VSVSStepOutput getOutput_idref_from_prev_step();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.micobs.svm.svs.VSVSProcedureStep#getOutput_idref_from_prev_step <em>Output idref from prev step</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Output idref from prev step</em>' reference.
	 * @see #getOutput_idref_from_prev_step()
	 * @generated
	 */
	void setOutput_idref_from_prev_step(VSVSStepOutput value);

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
	 * Returns the value of the '<em><b>Special Packets</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Special Packets</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Special Packets</em>' containment reference.
	 * @see #setSpecialPackets(VSVSStepSpecialPackets)
	 * @see es.uah.aut.srg.micobs.svm.svs.svsPackage#getVSVSProcedureStep_SpecialPackets()
	 * @model containment="true"
	 * @generated
	 */
	VSVSStepSpecialPackets getSpecialPackets();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.micobs.svm.svs.VSVSProcedureStep#getSpecialPackets <em>Special Packets</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Special Packets</em>' containment reference.
	 * @see #getSpecialPackets()
	 * @generated
	 */
	void setSpecialPackets(VSVSStepSpecialPackets value);

	/**
	 * Returns the value of the '<em><b>Concurrent steps</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Concurrent steps</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Concurrent steps</em>' containment reference.
	 * @see #setConcurrent_steps(VSVSStepConcurrentSteps)
	 * @see es.uah.aut.srg.micobs.svm.svs.svsPackage#getVSVSProcedureStep_Concurrent_steps()
	 * @model containment="true"
	 * @generated
	 */
	VSVSStepConcurrentSteps getConcurrent_steps();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.micobs.svm.svs.VSVSProcedureStep#getConcurrent_steps <em>Concurrent steps</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Concurrent steps</em>' containment reference.
	 * @see #getConcurrent_steps()
	 * @generated
	 */
	void setConcurrent_steps(VSVSStepConcurrentSteps value);

} // VSVSProcedureStep
