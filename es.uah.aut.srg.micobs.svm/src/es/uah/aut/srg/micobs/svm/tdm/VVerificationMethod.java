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
package es.uah.aut.srg.micobs.svm.tdm;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>VVerification Method</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see es.uah.aut.srg.micobs.svm.tdm.tdmPackage#getVVerificationMethod()
 * @model
 * @generated
 */
public enum VVerificationMethod implements Enumerator {
	/**
	 * The '<em><b>Analysis</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ANALYSIS_VALUE
	 * @generated
	 * @ordered
	 */
	ANALYSIS(0, "Analysis", "Analysis"), /**
	 * The '<em><b>Inspection</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INSPECTION_VALUE
	 * @generated
	 * @ordered
	 */
	INSPECTION(1, "Inspection", "Inspection"), /**
	 * The '<em><b>Testing</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TESTING_VALUE
	 * @generated
	 * @ordered
	 */
	TESTING(2, "Testing", "Testing"), /**
	 * The '<em><b>Review</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #REVIEW_VALUE
	 * @generated
	 * @ordered
	 */
	REVIEW(3, "Review", "Review"), /**
	 * The '<em><b>Model Simulation</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MODEL_SIMULATION_VALUE
	 * @generated
	 * @ordered
	 */
	MODEL_SIMULATION(4, "ModelSimulation", "ModelSimulation"), /**
	 * The '<em><b>Walk Through</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WALK_THROUGH_VALUE
	 * @generated
	 * @ordered
	 */
	WALK_THROUGH(5, "WalkThrough", "WalkThrough"), /**
	 * The '<em><b>Cross Reading</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CROSS_READING_VALUE
	 * @generated
	 * @ordered
	 */
	CROSS_READING(6, "CrossReading", "CrossReading"), /**
	 * The '<em><b>Desk Checking</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DESK_CHECKING_VALUE
	 * @generated
	 * @ordered
	 */
	DESK_CHECKING(7, "DeskChecking", "DeskChecking")
	;

	/**
	 * The '<em><b>Analysis</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Analysis</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ANALYSIS
	 * @model name="Analysis"
	 * @generated
	 * @ordered
	 */
	public static final int ANALYSIS_VALUE = 0;

/**
	 * The '<em><b>Inspection</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Inspection</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #INSPECTION
	 * @model name="Inspection"
	 * @generated
	 * @ordered
	 */
	public static final int INSPECTION_VALUE = 1;

/**
	 * The '<em><b>Testing</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Testing</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #TESTING
	 * @model name="Testing"
	 * @generated
	 * @ordered
	 */
	public static final int TESTING_VALUE = 2;

/**
	 * The '<em><b>Review</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Review</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #REVIEW
	 * @model name="Review"
	 * @generated
	 * @ordered
	 */
	public static final int REVIEW_VALUE = 3;

/**
	 * The '<em><b>Model Simulation</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Model Simulation</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MODEL_SIMULATION
	 * @model name="ModelSimulation"
	 * @generated
	 * @ordered
	 */
	public static final int MODEL_SIMULATION_VALUE = 4;

/**
	 * The '<em><b>Walk Through</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Walk Through</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #WALK_THROUGH
	 * @model name="WalkThrough"
	 * @generated
	 * @ordered
	 */
	public static final int WALK_THROUGH_VALUE = 5;

/**
	 * The '<em><b>Cross Reading</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Cross Reading</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CROSS_READING
	 * @model name="CrossReading"
	 * @generated
	 * @ordered
	 */
	public static final int CROSS_READING_VALUE = 6;

/**
	 * The '<em><b>Desk Checking</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Desk Checking</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DESK_CHECKING
	 * @model name="DeskChecking"
	 * @generated
	 * @ordered
	 */
	public static final int DESK_CHECKING_VALUE = 7;

	/**
	 * An array of all the '<em><b>VVerification Method</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final VVerificationMethod[] VALUES_ARRAY =
		new VVerificationMethod[] {
			ANALYSIS,
			INSPECTION,
			TESTING,
			REVIEW,
			MODEL_SIMULATION,
			WALK_THROUGH,
			CROSS_READING,
			DESK_CHECKING,
		};

	/**
	 * A public read-only list of all the '<em><b>VVerification Method</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<VVerificationMethod> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>VVerification Method</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static VVerificationMethod get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			VVerificationMethod result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>VVerification Method</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static VVerificationMethod getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			VVerificationMethod result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>VVerification Method</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static VVerificationMethod get(int value) {
		switch (value) {
			case ANALYSIS_VALUE: return ANALYSIS;
			case INSPECTION_VALUE: return INSPECTION;
			case TESTING_VALUE: return TESTING;
			case REVIEW_VALUE: return REVIEW;
			case MODEL_SIMULATION_VALUE: return MODEL_SIMULATION;
			case WALK_THROUGH_VALUE: return WALK_THROUGH;
			case CROSS_READING_VALUE: return CROSS_READING;
			case DESK_CHECKING_VALUE: return DESK_CHECKING;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private VVerificationMethod(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
	
} //VVerificationMethod
