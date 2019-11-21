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

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>VSVS Step Outputsmode</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see es.uah.aut.srg.micobs.svm.svs.svsPackage#getVSVSStepOutputsmode()
 * @model
 * @generated
 */
public enum VSVSStepOutputsmode implements Enumerator {
	/**
	 * The '<em><b>All</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ALL_VALUE
	 * @generated
	 * @ordered
	 */
	ALL(0, "all", "all"),

	/**
	 * The '<em><b>Allunsorted</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ALLUNSORTED_VALUE
	 * @generated
	 * @ordered
	 */
	ALLUNSORTED(1, "allunsorted", "allunsorted"),

	/**
	 * The '<em><b>Any</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ANY_VALUE
	 * @generated
	 * @ordered
	 */
	ANY(2, "any", "any");

	/**
	 * The '<em><b>All</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>All</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ALL
	 * @model name="all"
	 * @generated
	 * @ordered
	 */
	public static final int ALL_VALUE = 0;

	/**
	 * The '<em><b>Allunsorted</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Allunsorted</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ALLUNSORTED
	 * @model name="allunsorted"
	 * @generated
	 * @ordered
	 */
	public static final int ALLUNSORTED_VALUE = 1;

	/**
	 * The '<em><b>Any</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Any</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ANY
	 * @model name="any"
	 * @generated
	 * @ordered
	 */
	public static final int ANY_VALUE = 2;

	/**
	 * An array of all the '<em><b>VSVS Step Outputsmode</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final VSVSStepOutputsmode[] VALUES_ARRAY =
		new VSVSStepOutputsmode[] {
			ALL,
			ALLUNSORTED,
			ANY,
		};

	/**
	 * A public read-only list of all the '<em><b>VSVS Step Outputsmode</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<VSVSStepOutputsmode> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>VSVS Step Outputsmode</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static VSVSStepOutputsmode get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			VSVSStepOutputsmode result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>VSVS Step Outputsmode</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static VSVSStepOutputsmode getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			VSVSStepOutputsmode result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>VSVS Step Outputsmode</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static VSVSStepOutputsmode get(int value) {
		switch (value) {
			case ALL_VALUE: return ALL;
			case ALLUNSORTED_VALUE: return ALLUNSORTED;
			case ANY_VALUE: return ANY;
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
	private VSVSStepOutputsmode(int value, String name, String literal) {
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
	
} //VSVSStepOutputsmode
