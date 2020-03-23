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
package es.uah.aut.srg.micobs.svm.testsetup;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>VTest Setup Action Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see es.uah.aut.srg.micobs.svm.testsetup.testsetupPackage#getVTestSetupActionType()
 * @model
 * @generated
 */
public enum VTestSetupActionType implements Enumerator {
	/**
	 * The '<em><b>Instruction</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INSTRUCTION_VALUE
	 * @generated
	 * @ordered
	 */
	INSTRUCTION(0, "instruction", "instruction"), /**
	 * The '<em><b>Tmtc checking</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TMTC_CHECKING_VALUE
	 * @generated
	 * @ordered
	 */
	TMTC_CHECKING(1, "tmtc_checking", "tmtc_checking"), /**
	 * The '<em><b>Checking</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CHECKING_VALUE
	 * @generated
	 * @ordered
	 */
	CHECKING(2, "checking", "checking");

	/**
	 * The '<em><b>Instruction</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Instruction</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #INSTRUCTION
	 * @model name="instruction"
	 * @generated
	 * @ordered
	 */
	public static final int INSTRUCTION_VALUE = 0;

	/**
	 * The '<em><b>Tmtc checking</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Tmtc checking</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #TMTC_CHECKING
	 * @model name="tmtc_checking"
	 * @generated
	 * @ordered
	 */
	public static final int TMTC_CHECKING_VALUE = 1;

	/**
	 * The '<em><b>Checking</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Checking</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CHECKING
	 * @model name="checking"
	 * @generated
	 * @ordered
	 */
	public static final int CHECKING_VALUE = 2;

	/**
	 * An array of all the '<em><b>VTest Setup Action Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final VTestSetupActionType[] VALUES_ARRAY =
		new VTestSetupActionType[] {
			INSTRUCTION,
			TMTC_CHECKING,
			CHECKING,
		};

	/**
	 * A public read-only list of all the '<em><b>VTest Setup Action Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<VTestSetupActionType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>VTest Setup Action Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static VTestSetupActionType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			VTestSetupActionType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>VTest Setup Action Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static VTestSetupActionType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			VTestSetupActionType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>VTest Setup Action Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static VTestSetupActionType get(int value) {
		switch (value) {
			case INSTRUCTION_VALUE: return INSTRUCTION;
			case TMTC_CHECKING_VALUE: return TMTC_CHECKING;
			case CHECKING_VALUE: return CHECKING;
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
	private VTestSetupActionType(int value, String name, String literal) {
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
	
} //VTestSetupActionType
