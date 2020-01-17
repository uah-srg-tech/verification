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
import es.uah.aut.srg.micobs.svm.svs.VSVSProcedureStep;
import es.uah.aut.srg.micobs.svm.svs.VSVSProcedureSteps;
import es.uah.aut.srg.micobs.svm.svs.VSVSStepTelecommand;
import es.uah.aut.srg.micobs.svm.svs.VSVSStepTelecommandData;
import es.uah.aut.srg.micobs.svm.svs.VSVSStepTelecommandHeader;
import es.uah.aut.srg.micobs.svm.svs.VSVSStepTelemetry;
import es.uah.aut.srg.micobs.svm.svs.VSVSStepTelemetryData;
import es.uah.aut.srg.micobs.svm.svs.VSVSStepTelemetryHeader;
import es.uah.aut.srg.micobs.svm.svs.VSVSStepTelemetrySet;
import es.uah.aut.srg.micobs.svm.svs.VSVSTestCase;
import es.uah.aut.srg.micobs.svm.svs.VSVSTestProcedure;
import es.uah.aut.srg.micobs.svm.svs.VSVSTestingSpecificationDesign;
import es.uah.aut.srg.micobs.svm.tdm.VTraceableDocument;
import es.uah.aut.srg.micobs.svm.tdm.VTraceableDocumentAbstractGroup;
import es.uah.aut.srg.micobs.svm.tdm.VTraceableDocumentAbstractItem;
import es.uah.aut.srg.micobs.svm.testsetup.VTestSetupAction;
import es.uah.aut.srg.micobs.svm.testsetup.VTestSetupInterface;
import es.uah.aut.srg.micobs.svm.testsetup.VTestSetupPacketConfiguration;
import es.uah.aut.srg.micobs.svm.testsetup.VTestSetupSelectedConfiguration;
import es.uah.aut.srg.micobs.svm.tmtemplate.VTMTemplateField;
import es.uah.aut.srg.micobs.svm.vdm.VValidationDocument;
import es.uah.aut.srg.micobs.svm.tctemplate.VTCTemplateField;
import es.uah.aut.srg.tmtcif.tc.TMTCIFTCField;
import es.uah.aut.srg.tmtcif.tcheader.TMTCIFTCHeaderField;
import es.uah.aut.srg.tmtcif.tm.TMTCIFTMField;
import es.uah.aut.srg.tmtcif.tmheader.TMTCIFTMHeaderField;

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

	public IScope scope_VSVSProcedureStep_prev_step(VSVSProcedureStep currStep, EReference reference) {
		
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

	public IScope scope_VSVSProcedureStep_prev_tm_from_prev_step(VSVSProcedureStep currStep, EReference reference) {
		
		Collection<VSVSStepTelemetry> items = new HashSet<VSVSStepTelemetry>();

		if((currStep.getPrev_step() != null) && 
				(currStep.getPrev_step().getOutputs() != null) &&
				(currStep.getPrev_step().getOutputs().getClass().getName().compareTo("es.uah.aut.srg.micobs.svm.svs.impl.VSVSStepTelemetrySetImpl") == 0)) {
			
			VSVSStepTelemetrySet tmSet = (VSVSStepTelemetrySet)currStep.getPrev_step().getOutputs();
			
			items.addAll(tmSet.getTelemetry());
			
			Iterable<IEObjectDescription> fullQN = Iterables.transform(items, new Function<VSVSStepTelemetry, IEObjectDescription>(){
		
				@Override
				public IEObjectDescription apply(VSVSStepTelemetry from) {
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

	public IScope scope_VSVSScenarioSection_supportedInterface(VSVSTestingSpecificationDesign design, EReference reference) {
		
		Collection<VTestSetupInterface> interfaces = new HashSet<VTestSetupInterface>();
		interfaces.addAll(design.getTestSetup().getInterfaces().getInterfaces());
		
		Iterable<IEObjectDescription> fullQN = Iterables.transform(interfaces, new Function<VTestSetupInterface, IEObjectDescription>(){
	
			@Override
			public IEObjectDescription apply(VTestSetupInterface from) {
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

	public IScope scope_VSVSScenarioSection_supportedAction(VSVSTestingSpecificationDesign design, EReference reference) {
		
		Collection<VTestSetupAction> actions = new HashSet<VTestSetupAction>();
		actions.addAll(design.getTestSetup().getActions().getAction());
		
		Iterable<IEObjectDescription> fullQN = Iterables.transform(actions, new Function<VTestSetupAction, IEObjectDescription>(){
	
			@Override
			public IEObjectDescription apply(VTestSetupAction from) {
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

	public IScope scope_VSVSSelectedConfiguration_selectedConfiguration(VSVSTestingSpecificationDesign design, EReference reference) {
		
		Collection<VTestSetupPacketConfiguration> configurations = new HashSet<VTestSetupPacketConfiguration>();
		configurations.addAll(design.getTestSetup().getConfigurations().getPacketConfigurations());
		
		Iterable<IEObjectDescription> fullQN = Iterables.transform(configurations, new Function<VTestSetupPacketConfiguration, IEObjectDescription>(){
	
			@Override
			public IEObjectDescription apply(VTestSetupPacketConfiguration from) {
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

	public IScope scope_VSVSStepTelecommand_interface(VSVSTestProcedure currTP, EReference reference) {
		
		Collection<VTestSetupInterface> interfaces = new HashSet<VTestSetupInterface>();
		interfaces.addAll(currTP.getScenario().getSupportedInterface());
		
		Iterable<IEObjectDescription> fullQN = Iterables.transform(interfaces, new Function<VTestSetupInterface, IEObjectDescription>(){
	
			@Override
			public IEObjectDescription apply(VTestSetupInterface from) {
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
		
		Collection<VTestSetupInterface> interfaces = new HashSet<VTestSetupInterface>();
		interfaces.addAll(currTP.getScenario().getSupportedInterface());
		
		Iterable<IEObjectDescription> fullQN = Iterables.transform(interfaces, new Function<VTestSetupInterface, IEObjectDescription>(){
	
			@Override
			public IEObjectDescription apply(VTestSetupInterface from) {
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

	public IScope scope_VSVSStepConfiguration_configuration(VSVSTestProcedure currTP, EReference reference) {
		
		Collection<VTestSetupPacketConfiguration> configurations = new HashSet<VTestSetupPacketConfiguration>();
		for(VTestSetupSelectedConfiguration selectedConfiguration : currTP.getScenario().getSelectedConfiguration()) {
			configurations.add(selectedConfiguration.getConfiguration());
		}
		
		Iterable<IEObjectDescription> fullQN = Iterables.transform(configurations, new Function<VTestSetupPacketConfiguration, IEObjectDescription>(){
	
			@Override
			public IEObjectDescription apply(VTestSetupPacketConfiguration from) {
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

	public IScope scope_VSVSStepTelecommandDataField_fieldRef(VSVSStepTelecommandData stepTcData, EReference reference) {

		Collection<TMTCIFTCField> fields = new HashSet<TMTCIFTCField>();

		for(TMTCIFTCField tcInputField : stepTcData.getTcTemplate().getTcInput().getFields()) {
			Integer idx = 0;
			for(VTCTemplateField tcTplField : stepTcData.getTcTemplate().getFields()) {
				if(tcTplField.getFieldRef() == tcInputField) {
					break;
				}
				idx++;
			}
			if(idx ==  stepTcData.getTcTemplate().getFields().size()) {
				fields.add(tcInputField);
			}
		}
	
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

	public IScope scope_VSVSStepTelecommandHeaderField_fieldRef(VSVSStepTelecommandHeader stepTcHeader, EReference reference) {

		Collection<TMTCIFTCHeaderField> fields = new HashSet<TMTCIFTCHeaderField>();
		
		VTestSetupInterface tcInterface = ((VSVSStepTelecommand)stepTcHeader.eContainer()).getInterface();
		fields.addAll(tcInterface.getTcHeader().getFields());
	
		Iterable<IEObjectDescription> fullQN = Iterables.transform(fields, new Function<TMTCIFTCHeaderField, IEObjectDescription>(){
	
			@Override
			public IEObjectDescription apply(TMTCIFTCHeaderField from) {
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

	public IScope scope_VSVSStepTelemetryDataField_fieldRef(VSVSStepTelemetryData stepTmData, EReference reference) {

		Collection<TMTCIFTMField> fields = new HashSet<TMTCIFTMField>();
		
		for(TMTCIFTMField tmOutputField : stepTmData.getTmTemplate().getTmOutput().getFields()) {
			Integer idx = 0;
			for(VTMTemplateField tmTplField : stepTmData.getTmTemplate().getFields()) {
				if(tmTplField.getFieldRef() == tmOutputField) {
					break;
				}
				idx++;
			}
			if(idx ==  stepTmData.getTmTemplate().getFields().size()) {
				fields.add(tmOutputField);
			}
		}
	
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

	public IScope scope_VSVSStepTelemetryHeaderField_fieldRef(VSVSStepTelemetryHeader stepTmHeader, EReference reference) {

		Collection<TMTCIFTMHeaderField> fields = new HashSet<TMTCIFTMHeaderField>();
		
		VTestSetupInterface tmInterface = ((VSVSStepTelemetry)stepTmHeader.eContainer()).getInterface();
		fields.addAll(tmInterface.getTmHeader().getFields());
	
		Iterable<IEObjectDescription> fullQN = Iterables.transform(fields, new Function<TMTCIFTMHeaderField, IEObjectDescription>(){
	
			@Override
			public IEObjectDescription apply(TMTCIFTMHeaderField from) {
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