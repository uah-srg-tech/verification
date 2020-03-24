/*******************************************************************************
 * Copyright (c) 2020 UAH Space Research Group.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     SRG Team - Initial API and implementation
 ******************************************************************************/
package es.uah.aut.srg.micobs.svm.lang.tcr.serializer;

import com.google.inject.Inject;
import es.uah.aut.srg.micobs.doctpl.doctpl.DParagraph;
import es.uah.aut.srg.micobs.doctpl.doctpl.DRun;
import es.uah.aut.srg.micobs.doctpl.doctpl.DText;
import es.uah.aut.srg.micobs.doctpl.doctpl.doctplPackage;
import es.uah.aut.srg.micobs.svm.lang.tcr.services.TCRGrammarAccess;
import es.uah.aut.srg.micobs.svm.tcr.VTCRTestCampaignReport;
import es.uah.aut.srg.micobs.svm.tcr.VTCRTestReport;
import es.uah.aut.srg.micobs.svm.tcr.tcrPackage;
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
public class TCRSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private TCRGrammarAccess grammarAccess;
	
	@Override
	public void sequence(ISerializationContext context, EObject semanticObject) {
		EPackage epackage = semanticObject.eClass().getEPackage();
		ParserRule rule = context.getParserRule();
		Action action = context.getAssignedAction();
		Set<Parameter> parameters = context.getEnabledBooleanParameters();
		if (epackage == doctplPackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case doctplPackage.DPARAGRAPH:
				sequence_DParagraphEvidence(context, (DParagraph) semanticObject); 
				return; 
			case doctplPackage.DRUN:
				sequence_DRun(context, (DRun) semanticObject); 
				return; 
			case doctplPackage.DTEXT:
				sequence_DText(context, (DText) semanticObject); 
				return; 
			}
		else if (epackage == tcrPackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case tcrPackage.VTCR_TEST_CAMPAIGN_REPORT:
				sequence_VTCRTestCampaignReport(context, (VTCRTestCampaignReport) semanticObject); 
				return; 
			case tcrPackage.VTCR_TEST_REPORT:
				sequence_VTCRTestReport(context, (VTCRTestReport) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Contexts:
	 *     DParagraphEvidence returns DParagraph
	 *
	 * Constraint:
	 *     paragraphContent+=DParagraphContent+
	 */
	protected void sequence_DParagraphEvidence(ISerializationContext context, DParagraph semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     DParagraphContent returns DRun
	 *     DRun returns DRun
	 *
	 * Constraint:
	 *     (bold=DRunAttributes? italics=DRunAttributes? underline=DRunAttributes? color=STRING? text=DText)
	 */
	protected void sequence_DRun(ISerializationContext context, DRun semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     DText returns DText
	 *
	 * Constraint:
	 *     content=RUNTEXT
	 */
	protected void sequence_DText(ISerializationContext context, DText semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, doctplPackage.Literals.DTEXT__CONTENT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, doctplPackage.Literals.DTEXT__CONTENT));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getDTextAccess().getContentRUNTEXTTerminalRuleCall_0(), semanticObject.getContent());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     VTCRTestCampaignReport returns VTCRTestCampaignReport
	 *
	 * Constraint:
	 *     (
	 *         name=STRING 
	 *         id=STRING 
	 *         issue=UINT_STRING 
	 *         revision=UINT_STRING 
	 *         date=STRING 
	 *         testReports+=VTCRTestReport+
	 *     )
	 */
	protected void sequence_VTCRTestCampaignReport(ISerializationContext context, VTCRTestCampaignReport semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     VTCRTestReport returns VTCRTestReport
	 *
	 * Constraint:
	 *     (test_procedure=STRING evidence=DParagraphEvidence status=VTCRTestStatus)
	 */
	protected void sequence_VTCRTestReport(ISerializationContext context, VTCRTestReport semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, tcrPackage.Literals.VTCR_TEST_REPORT__TEST_PROCEDURE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, tcrPackage.Literals.VTCR_TEST_REPORT__TEST_PROCEDURE));
			if (transientValues.isValueTransient(semanticObject, tcrPackage.Literals.VTCR_TEST_REPORT__EVIDENCE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, tcrPackage.Literals.VTCR_TEST_REPORT__EVIDENCE));
			if (transientValues.isValueTransient(semanticObject, tcrPackage.Literals.VTCR_TEST_REPORT__STATUS) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, tcrPackage.Literals.VTCR_TEST_REPORT__STATUS));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getVTCRTestReportAccess().getTest_procedureSTRINGTerminalRuleCall_2_0(), semanticObject.getTest_procedure());
		feeder.accept(grammarAccess.getVTCRTestReportAccess().getEvidenceDParagraphEvidenceParserRuleCall_4_0(), semanticObject.getEvidence());
		feeder.accept(grammarAccess.getVTCRTestReportAccess().getStatusVTCRTestStatusEnumRuleCall_6_0(), semanticObject.getStatus());
		feeder.finish();
	}
	
	
}
