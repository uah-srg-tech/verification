/*******************************************************************************
 * Copyright (c) 2019 UAH Space Research Group.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     SRG Team - Initial API and implementation
 ******************************************************************************/
package es.uah.aut.srg.micobs.svm.lang.tctemplate.scoping;

import java.util.Collection;
import java.util.HashSet;

import org.eclipse.emf.ecore.EReference;
import org.eclipse.xtext.resource.EObjectDescription;
import org.eclipse.xtext.resource.IEObjectDescription;
import org.eclipse.xtext.scoping.IScope;
import org.eclipse.xtext.scoping.impl.AbstractDeclarativeScopeProvider;
import org.eclipse.xtext.scoping.impl.SimpleScope;

import com.google.common.base.Function;
import com.google.common.base.Predicates;
import com.google.common.collect.Iterables;

import es.uah.aut.srg.micobs.svm.tctemplate.VTCTemplate;
import es.uah.aut.srg.micobs.svm.tctemplate.VTCTemplateField;
import es.uah.aut.srg.tmtcif.enum_.TMTCIFEnum;
import es.uah.aut.srg.tmtcif.enum_.TMTCIFEnumValue;
import es.uah.aut.srg.tmtcif.fieldvalue.TMTCIFFieldValueEnum;
import es.uah.aut.srg.tmtcif.tc.TMTCIFTCField;

/**
 * This class contains custom scoping description.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#scoping
 * on how and when to use it.
 */
public class TCTEMPLATEScopeProvider extends AbstractDeclarativeScopeProvider {

	public IScope scope_VTCTemplateField_fieldRef(VTCTemplate tcTpl, EReference reference) {
		
		Collection<TMTCIFTCField> fields = new HashSet<TMTCIFTCField>();
		fields.addAll(tcTpl.getTc().getFields());
	
		Iterable<IEObjectDescription> fullQN = Iterables.transform(fields, new Function<TMTCIFTCField, IEObjectDescription>(){
	
			@Override
			public IEObjectDescription apply(TMTCIFTCField from) {
				if (from.getName() != null) {
					return EObjectDescription.create(from.getName(), from);
				}
				else {
					return null;
				}
			}
		});
		return new SimpleScope(Iterables.filter(fullQN, Predicates.notNull()));
	}
	
	public IScope scope_TMTCIFFieldValueEnum_enumRef(VTCTemplateField tcTplField, EReference reference) {
		
		Collection<TMTCIFEnum> enumRef = new HashSet<TMTCIFEnum>();
		
		String fieldName = tcTplField.getFieldRef().getName();
		VTCTemplate tcTpl = (VTCTemplate)tcTplField.eContainer();
		for(TMTCIFTCField tcField : tcTpl.getTc().getFields()) {
			if(tcField.getName().compareTo(fieldName) == 0) {
				enumRef.add(tcField.getEnumRef());
				break;
			}
		}
	
		Iterable<IEObjectDescription> fullQN = Iterables.transform(enumRef, new Function<TMTCIFEnum, IEObjectDescription>(){
	
			@Override
			public IEObjectDescription apply(TMTCIFEnum from) {
				if (from.getName() != null) {
					return EObjectDescription.create(from.getName(), from);
				}
				else {
					return null;
				}
			}
		});
		return new SimpleScope(Iterables.filter(fullQN, Predicates.notNull()));
	}
	
	public IScope scope_TMTCIFFieldValueEnum_valueRef(TMTCIFFieldValueEnum tcEnum, EReference reference) {
		
		Collection<TMTCIFEnumValue> enumValue = new HashSet<TMTCIFEnumValue>();
		enumValue.addAll(tcEnum.getEnumRef().getValues());
	
		Iterable<IEObjectDescription> fullQN = Iterables.transform(enumValue, new Function<TMTCIFEnumValue, IEObjectDescription>(){
	
			@Override
			public IEObjectDescription apply(TMTCIFEnumValue from) {
				if (from.getName() != null) {
					return EObjectDescription.create(from.getName(), from);
				}
				else {
					return null;
				}
			}
		});
		return new SimpleScope(Iterables.filter(fullQN, Predicates.notNull()));
	}
}
