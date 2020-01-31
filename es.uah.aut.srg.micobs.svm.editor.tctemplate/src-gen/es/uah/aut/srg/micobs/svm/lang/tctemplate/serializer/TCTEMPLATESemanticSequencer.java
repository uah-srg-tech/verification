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
package es.uah.aut.srg.micobs.svm.lang.tctemplate.serializer;

import com.google.inject.Inject;
import es.uah.aut.srg.micobs.svm.lang.tctemplate.services.TCTEMPLATEGrammarAccess;
import es.uah.aut.srg.micobs.svm.tctemplate.VTCTemplate;
import es.uah.aut.srg.micobs.svm.tctemplate.VTCTemplateField;
import es.uah.aut.srg.micobs.svm.tctemplate.tctemplatePackage;
import es.uah.aut.srg.tmtcif.fieldvalue.TMTCIFFieldValueEnum;
import es.uah.aut.srg.tmtcif.fieldvalue.TMTCIFFieldValueFile;
import es.uah.aut.srg.tmtcif.fieldvalue.TMTCIFFieldValueRaw;
import es.uah.aut.srg.tmtcif.fieldvalue.fieldvaluePackage;
import java.util.Set;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Parameter;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.serializer.ISerializationContext;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;

@SuppressWarnings("all")
public class TCTEMPLATESemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private TCTEMPLATEGrammarAccess grammarAccess;
	
	@Override
	public void sequence(ISerializationContext context, EObject semanticObject) {
		EPackage epackage = semanticObject.eClass().getEPackage();
		ParserRule rule = context.getParserRule();
		Action action = context.getAssignedAction();
		Set<Parameter> parameters = context.getEnabledBooleanParameters();
		if (epackage == fieldvaluePackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case fieldvaluePackage.TMTCIF_FIELD_VALUE_ENUM:
				sequence_TMTCIFFieldValueEnum(context, (TMTCIFFieldValueEnum) semanticObject); 
				return; 
			case fieldvaluePackage.TMTCIF_FIELD_VALUE_FILE:
				sequence_TMTCIFFieldValueFile(context, (TMTCIFFieldValueFile) semanticObject); 
				return; 
			case fieldvaluePackage.TMTCIF_FIELD_VALUE_RAW:
				sequence_TMTCIFFieldValueRaw(context, (TMTCIFFieldValueRaw) semanticObject); 
				return; 
			}
		else if (epackage == tctemplatePackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case tctemplatePackage.VTC_TEMPLATE:
				sequence_VTCTemplate(context, (VTCTemplate) semanticObject); 
				return; 
			case tctemplatePackage.VTC_TEMPLATE_FIELD:
				sequence_VTCTemplateField(context, (VTCTemplateField) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Contexts:
	 *     TMTCIFFieldValue returns TMTCIFFieldValueEnum
	 *     TMTCIFFieldValueEnum returns TMTCIFFieldValueEnum
	 *
	 * Constraint:
	 *     (enumRef=[TMTCIFEnum|STRING] valueRef=[TMTCIFEnumValue|STRING])
	 */
	protected void sequence_TMTCIFFieldValueEnum(ISerializationContext context, TMTCIFFieldValueEnum semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, fieldvaluePackage.Literals.TMTCIF_FIELD_VALUE_ENUM__ENUM_REF) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, fieldvaluePackage.Literals.TMTCIF_FIELD_VALUE_ENUM__ENUM_REF));
			if (transientValues.isValueTransient(semanticObject, fieldvaluePackage.Literals.TMTCIF_FIELD_VALUE_ENUM__VALUE_REF) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, fieldvaluePackage.Literals.TMTCIF_FIELD_VALUE_ENUM__VALUE_REF));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getTMTCIFFieldValueEnumAccess().getEnumRefTMTCIFEnumSTRINGTerminalRuleCall_2_0_1(), semanticObject.getEnumRef());
		feeder.accept(grammarAccess.getTMTCIFFieldValueEnumAccess().getValueRefTMTCIFEnumValueSTRINGTerminalRuleCall_4_0_1(), semanticObject.getValueRef());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     TMTCIFFieldValue returns TMTCIFFieldValueFile
	 *     TMTCIFFieldValueFile returns TMTCIFFieldValueFile
	 *
	 * Constraint:
	 *     filename=STRING
	 */
	protected void sequence_TMTCIFFieldValueFile(ISerializationContext context, TMTCIFFieldValueFile semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, fieldvaluePackage.Literals.TMTCIF_FIELD_VALUE_FILE__FILENAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, fieldvaluePackage.Literals.TMTCIF_FIELD_VALUE_FILE__FILENAME));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getTMTCIFFieldValueFileAccess().getFilenameSTRINGTerminalRuleCall_2_0(), semanticObject.getFilename());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     TMTCIFFieldValue returns TMTCIFFieldValueRaw
	 *     TMTCIFFieldValueRaw returns TMTCIFFieldValueRaw
	 *
	 * Constraint:
	 *     (value=UINT_STRING | value=HEX_STRING)
	 */
	protected void sequence_TMTCIFFieldValueRaw(ISerializationContext context, TMTCIFFieldValueRaw semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     VTCTemplateField returns VTCTemplateField
	 *
	 * Constraint:
	 *     (fieldRef=[TMTCIFTCField|STRING] value=TMTCIFFieldValue)
	 */
	protected void sequence_VTCTemplateField(ISerializationContext context, VTCTemplateField semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, tctemplatePackage.Literals.VTC_TEMPLATE_FIELD__FIELD_REF) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, tctemplatePackage.Literals.VTC_TEMPLATE_FIELD__FIELD_REF));
			if (transientValues.isValueTransient(semanticObject, tctemplatePackage.Literals.VTC_TEMPLATE_FIELD__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, tctemplatePackage.Literals.VTC_TEMPLATE_FIELD__VALUE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getVTCTemplateFieldAccess().getFieldRefTMTCIFTCFieldSTRINGTerminalRuleCall_2_0_1(), semanticObject.getFieldRef());
		feeder.accept(grammarAccess.getVTCTemplateFieldAccess().getValueTMTCIFFieldValueParserRuleCall_4_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     VTCTemplate returns VTCTemplate
	 *
	 * Constraint:
	 *     (name=STRING tc=[TMTCIFTC|STRING] fields+=VTCTemplateField*)
	 */
	protected void sequence_VTCTemplate(ISerializationContext context, VTCTemplate semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
}
