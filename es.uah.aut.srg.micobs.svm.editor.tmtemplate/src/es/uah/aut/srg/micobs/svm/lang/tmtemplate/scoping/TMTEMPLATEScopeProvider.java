/*
 * generated by Xtext 2.10.0
 */
package es.uah.aut.srg.micobs.svm.lang.tmtemplate.scoping;

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

import es.uah.aut.srg.micobs.svm.tmtemplate.VTMTemplate;
import es.uah.aut.srg.micobs.svm.tmtemplate.VTMTemplateField;
import es.uah.aut.srg.tmtcif.enum_.TMTCIFEnum;
import es.uah.aut.srg.tmtcif.enum_.TMTCIFEnumValue;
import es.uah.aut.srg.tmtcif.fieldvalue.TMTCIFFieldValueEnum;
import es.uah.aut.srg.tmtcif.tm.TMTCIFTMField;

/**
 * This class contains custom scoping description.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#scoping
 * on how and when to use it.
 */
public class TMTEMPLATEScopeProvider extends AbstractDeclarativeScopeProvider {

	public IScope scope_VTMTemplateField_fieldRef(VTMTemplate tmTpl, EReference reference) {
		
		Collection<TMTCIFTMField> fields = new HashSet<TMTCIFTMField>();
		fields.addAll(tmTpl.getTm().getFields());
	
		Iterable<IEObjectDescription> fullQN = Iterables.transform(fields, new Function<TMTCIFTMField, IEObjectDescription>(){
	
			@Override
			public IEObjectDescription apply(TMTCIFTMField from) {
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
	
	public IScope scope_TMTCIFFieldValueEnum_enumRef(VTMTemplateField tmTplField, EReference reference) {
		
		Collection<TMTCIFEnum> enumRef = new HashSet<TMTCIFEnum>();
		
		String fieldName = tmTplField.getFieldRef().getName();
		VTMTemplate tcTpl = (VTMTemplate)tmTplField.eContainer();
		for(TMTCIFTMField tcField : tcTpl.getTm().getFields()) {
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
	
	public IScope scope_TMTCIFFieldValueEnum_valueRef(TMTCIFFieldValueEnum tmEnum, EReference reference) {
		
		Collection<TMTCIFEnumValue> enumValue = new HashSet<TMTCIFEnumValue>();
		enumValue.addAll(tmEnum.getEnumRef().getValues());
	
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
