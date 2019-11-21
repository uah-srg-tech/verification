/*******************************************************************************
 * Copyright (c) 2018 UAH Space Research Group.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     SRG Team - Initial API and implementation
 ******************************************************************************/
package es.uah.aut.srg.micobs.svm.lang.svs.scoping;

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

import es.uah.aut.srg.micobs.doctpl.doctpl.DReferenceableObject;
import es.uah.aut.srg.micobs.svm.svs.VSVSDocument;
import es.uah.aut.srg.micobs.svm.svs.VSVSInterface;
import es.uah.aut.srg.micobs.svm.svs.VSVSProcedureStep;
import es.uah.aut.srg.micobs.svm.svs.VSVSProcedureSteps;
import es.uah.aut.srg.micobs.svm.svs.VSVSStepOutput;
import es.uah.aut.srg.micobs.svm.svs.VSVSTestCase;
import es.uah.aut.srg.micobs.svm.svs.VSVSTestProcedure;
import es.uah.aut.srg.micobs.svm.tdm.VTraceableDocument;
import es.uah.aut.srg.micobs.svm.tdm.VTraceableDocumentAbstractGroup;
import es.uah.aut.srg.micobs.svm.tdm.VTraceableDocumentAbstractItem;
import es.uah.aut.srg.micobs.svm.vdm.VValidationDocument;

/**
 * This class contains custom scoping description.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#scoping
 * on how and when to use it.
 */
public class SVSScopeProvider extends AbstractDeclarativeScopeProvider {

	public IScope scope_VTraceableDocumentAbstractItem(VValidationDocument svsDoc, EReference reference) {
		
		Collection<VTraceableDocumentAbstractItem> items = new HashSet<VTraceableDocumentAbstractItem>();
		
		for(VTraceableDocument doc : svsDoc.getParents()) {
			for(VTraceableDocumentAbstractGroup group : doc.getGroups()) {
				items.addAll(group.getItems());
			}
		}
	
		Iterable<IEObjectDescription> fullQN = Iterables.transform(items, new Function<VTraceableDocumentAbstractItem, IEObjectDescription>(){
	
			@Override
			public IEObjectDescription apply(VTraceableDocumentAbstractItem from) {
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

	public IScope scope_VSVSTestCase(VSVSDocument svsDoc, EReference reference) {
		
		Collection<VSVSTestCase> items = new HashSet<VSVSTestCase>();
		items.addAll(svsDoc.getTestCasesSection().getTestCases());
	
		Iterable<IEObjectDescription> fullQN = Iterables.transform(items, new Function<VSVSTestCase, IEObjectDescription>(){
	
			@Override
			public IEObjectDescription apply(VSVSTestCase from) {
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

	public IScope scope_VSVSProcedureStep_prev_step_idref(VSVSProcedureStep currStep, EReference reference) {
		
		Collection<VSVSProcedureStep> items = new HashSet<VSVSProcedureStep>();
		VSVSProcedureSteps currentProcedureSteps = (VSVSProcedureSteps)(currStep.eContainer());

		if(currentProcedureSteps != null) {
			items.addAll(currentProcedureSteps.getStep());
			
			Iterable<IEObjectDescription> fullQN = Iterables.transform(items, new Function<VSVSProcedureStep, IEObjectDescription>(){
		
				@Override
				public IEObjectDescription apply(VSVSProcedureStep from) {
					if (from.getName() == null || from == currStep) {
						return null;
					}
					else {
						return EObjectDescription.create(from.getName(), from);
					}
				}
			});
			return new SimpleScope(Iterables.filter(fullQN, Predicates.notNull()));
		} else {
			return null;
		}
	}

	public IScope scope_VSVSProcedureStep_output_idref_from_prev_step(VSVSProcedureStep currStep, EReference reference) {
		
		Collection<VSVSStepOutput> items = new HashSet<VSVSStepOutput>();

		if(currStep.getPrev_step_idref() != null && 
				currStep.getPrev_step_idref().getOutputs() != null) {

			items.addAll(currStep.getPrev_step_idref().getOutputs().getOutput());
			
			Iterable<IEObjectDescription> fullQN = Iterables.transform(items, new Function<VSVSStepOutput, IEObjectDescription>(){
		
				@Override
				public IEObjectDescription apply(VSVSStepOutput from) {
					if (from.getName() != null) {
						return EObjectDescription.create(from.getName(), from);
					}
					else {
						return null;
					}
				}
			});
			return new SimpleScope(Iterables.filter(fullQN, Predicates.notNull()));
		} else {
			return null;
		}
	}

	public IScope scope_VSVSStepInput_interface(VSVSTestProcedure currTP, EReference reference) {
		
		Collection<VSVSInterface> items = new HashSet<VSVSInterface>();
		items.addAll(currTP.getScenario().getInterface());
		
		Iterable<IEObjectDescription> fullQN = Iterables.transform(items, new Function<VSVSInterface, IEObjectDescription>(){
	
			@Override
			public IEObjectDescription apply(VSVSInterface from) {
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

	public IScope scope_VSVSStepOutput_interface(VSVSTestProcedure currTP, EReference reference) {
		
		Collection<VSVSInterface> items = new HashSet<VSVSInterface>();
		items.addAll(currTP.getScenario().getInterface());
		
		Iterable<IEObjectDescription> fullQN = Iterables.transform(items, new Function<VSVSInterface, IEObjectDescription>(){
	
			@Override
			public IEObjectDescription apply(VSVSInterface from) {
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


	public IScope scope_DReferenceableObject(VSVSDocument svsDoc, EReference reference) {

		Collection<DReferenceableObject> objects = new HashSet<DReferenceableObject>();
		
		objects.addAll(svsDoc.getApplicableDocuments());
		objects.addAll(svsDoc.getReferenceDocuments());
		objects.addAll(svsDoc.getFigures());
		objects.addAll(svsDoc.getTables());
		objects.addAll(svsDoc.getParagraphs());
		
		Iterable<IEObjectDescription> fullQN = Iterables.transform(objects, new Function<DReferenceableObject, IEObjectDescription>(){
	
			@Override
			public IEObjectDescription apply(DReferenceableObject from) {
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