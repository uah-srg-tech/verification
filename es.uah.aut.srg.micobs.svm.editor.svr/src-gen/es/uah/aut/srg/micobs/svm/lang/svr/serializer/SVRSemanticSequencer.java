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
package es.uah.aut.srg.micobs.svm.lang.svr.serializer;

import com.google.inject.Inject;
import es.uah.aut.srg.micobs.doctpl.doctpl.DApplicableDocument;
import es.uah.aut.srg.micobs.doctpl.doctpl.DBasicTable;
import es.uah.aut.srg.micobs.doctpl.doctpl.DBody;
import es.uah.aut.srg.micobs.doctpl.doctpl.DCell;
import es.uah.aut.srg.micobs.doctpl.doctpl.DEnumerate;
import es.uah.aut.srg.micobs.doctpl.doctpl.DFigureFromFile;
import es.uah.aut.srg.micobs.doctpl.doctpl.DHyperlink;
import es.uah.aut.srg.micobs.doctpl.doctpl.DItemize;
import es.uah.aut.srg.micobs.doctpl.doctpl.DListItem;
import es.uah.aut.srg.micobs.doctpl.doctpl.DParagraph;
import es.uah.aut.srg.micobs.doctpl.doctpl.DReferenceDocument;
import es.uah.aut.srg.micobs.doctpl.doctpl.DRow;
import es.uah.aut.srg.micobs.doctpl.doctpl.DRun;
import es.uah.aut.srg.micobs.doctpl.doctpl.DTBC;
import es.uah.aut.srg.micobs.doctpl.doctpl.DTBD;
import es.uah.aut.srg.micobs.doctpl.doctpl.DTab;
import es.uah.aut.srg.micobs.doctpl.doctpl.DTableFromFile;
import es.uah.aut.srg.micobs.doctpl.doctpl.DText;
import es.uah.aut.srg.micobs.doctpl.doctpl.doctplPackage;
import es.uah.aut.srg.micobs.svm.lang.svr.services.SVRGrammarAccess;
import es.uah.aut.srg.micobs.svm.svr.VSVRAbbreviation;
import es.uah.aut.srg.micobs.svm.svr.VSVRApplicableDocuments;
import es.uah.aut.srg.micobs.svm.svr.VSVRDefinition;
import es.uah.aut.srg.micobs.svm.svr.VSVRDocument;
import es.uah.aut.srg.micobs.svm.svr.VSVRFixedSection;
import es.uah.aut.srg.micobs.svm.svr.VSVRInstantiableSection;
import es.uah.aut.srg.micobs.svm.svr.VSVRIntroduction;
import es.uah.aut.srg.micobs.svm.svr.VSVRReferenceDocuments;
import es.uah.aut.srg.micobs.svm.svr.VSVRSWValProcessVerification;
import es.uah.aut.srg.micobs.svm.svr.VSVRTBCsTBDs;
import es.uah.aut.srg.micobs.svm.svr.VSVRTerm;
import es.uah.aut.srg.micobs.svm.svr.VSVRTermsDefinitionsAbbreviations;
import es.uah.aut.srg.micobs.svm.svr.svrPackage;
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
public class SVRSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private SVRGrammarAccess grammarAccess;
	
	@Override
	public void sequence(ISerializationContext context, EObject semanticObject) {
		EPackage epackage = semanticObject.eClass().getEPackage();
		ParserRule rule = context.getParserRule();
		Action action = context.getAssignedAction();
		Set<Parameter> parameters = context.getEnabledBooleanParameters();
		if (epackage == doctplPackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case doctplPackage.DAPPLICABLE_DOCUMENT:
				sequence_DApplicableDocument(context, (DApplicableDocument) semanticObject); 
				return; 
			case doctplPackage.DBASIC_TABLE:
				sequence_DBasicTable(context, (DBasicTable) semanticObject); 
				return; 
			case doctplPackage.DBODY:
				sequence_DBody(context, (DBody) semanticObject); 
				return; 
			case doctplPackage.DCELL:
				sequence_DCell(context, (DCell) semanticObject); 
				return; 
			case doctplPackage.DENUMERATE:
				sequence_DEnumerate(context, (DEnumerate) semanticObject); 
				return; 
			case doctplPackage.DFIGURE_FROM_FILE:
				sequence_DFigureFromFile(context, (DFigureFromFile) semanticObject); 
				return; 
			case doctplPackage.DHYPERLINK:
				sequence_DHyperlink(context, (DHyperlink) semanticObject); 
				return; 
			case doctplPackage.DITEMIZE:
				sequence_DItemize(context, (DItemize) semanticObject); 
				return; 
			case doctplPackage.DLIST_ITEM:
				sequence_DListItem(context, (DListItem) semanticObject); 
				return; 
			case doctplPackage.DPARAGRAPH:
				sequence_DParagraph(context, (DParagraph) semanticObject); 
				return; 
			case doctplPackage.DREFERENCE_DOCUMENT:
				sequence_DReferenceDocument(context, (DReferenceDocument) semanticObject); 
				return; 
			case doctplPackage.DROW:
				sequence_DRow(context, (DRow) semanticObject); 
				return; 
			case doctplPackage.DRUN:
				sequence_DRun(context, (DRun) semanticObject); 
				return; 
			case doctplPackage.DTBC:
				sequence_DTBC(context, (DTBC) semanticObject); 
				return; 
			case doctplPackage.DTBD:
				sequence_DTBD(context, (DTBD) semanticObject); 
				return; 
			case doctplPackage.DTAB:
				sequence_DTab(context, (DTab) semanticObject); 
				return; 
			case doctplPackage.DTABLE_FROM_FILE:
				sequence_DTableFromFile(context, (DTableFromFile) semanticObject); 
				return; 
			case doctplPackage.DTEXT:
				sequence_DText(context, (DText) semanticObject); 
				return; 
			}
		else if (epackage == svrPackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case svrPackage.VSVR_ABBREVIATION:
				sequence_VSVRAbbreviation(context, (VSVRAbbreviation) semanticObject); 
				return; 
			case svrPackage.VSVR_APPLICABLE_DOCUMENTS:
				sequence_VSVRApplicableDocuments(context, (VSVRApplicableDocuments) semanticObject); 
				return; 
			case svrPackage.VSVR_DEFINITION:
				sequence_VSVRDefinition(context, (VSVRDefinition) semanticObject); 
				return; 
			case svrPackage.VSVR_DOCUMENT:
				sequence_VSVRDocument(context, (VSVRDocument) semanticObject); 
				return; 
			case svrPackage.VSVR_FIXED_SECTION:
				sequence_VSVRFixedSection(context, (VSVRFixedSection) semanticObject); 
				return; 
			case svrPackage.VSVR_INSTANTIABLE_SECTION:
				sequence_VSVRInstantiableSection(context, (VSVRInstantiableSection) semanticObject); 
				return; 
			case svrPackage.VSVR_INTRODUCTION:
				sequence_VSVRIntroduction(context, (VSVRIntroduction) semanticObject); 
				return; 
			case svrPackage.VSVR_REFERENCE_DOCUMENTS:
				sequence_VSVRReferenceDocuments(context, (VSVRReferenceDocuments) semanticObject); 
				return; 
			case svrPackage.VSVRSW_VAL_PROCESS_VERIFICATION:
				sequence_VSVRSWValProcessVerification(context, (VSVRSWValProcessVerification) semanticObject); 
				return; 
			case svrPackage.VSVRTB_CS_TB_DS:
				sequence_VSVRTBCsTBDs(context, (VSVRTBCsTBDs) semanticObject); 
				return; 
			case svrPackage.VSVR_TERM:
				sequence_VSVRTerm(context, (VSVRTerm) semanticObject); 
				return; 
			case svrPackage.VSVR_TERMS_DEFINITIONS_ABBREVIATIONS:
				sequence_VSVRTermsDefinitionsAbbreviations(context, (VSVRTermsDefinitionsAbbreviations) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Contexts:
	 *     DApplicableDocument returns DApplicableDocument
	 *
	 * Constraint:
	 *     (
	 *         name=STRING 
	 *         title=STRING 
	 *         id=STRING 
	 *         (issue=UINT_STRING revision=UINT_STRING?)? 
	 *         date=STRING? 
	 *         url=STRING?
	 *     )
	 */
	protected void sequence_DApplicableDocument(ISerializationContext context, DApplicableDocument semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     DBodyContent returns DBasicTable
	 *     DBasicTable returns DBasicTable
	 *
	 * Constraint:
	 *     (
	 *         name=STRING 
	 *         width=UINT_STRING? 
	 *         alignment=DAlignment? 
	 *         style=STRING? 
	 *         indent=REAL_STRING? 
	 *         caption=STRING? 
	 *         rows+=DRow+
	 *     )
	 */
	protected void sequence_DBasicTable(ISerializationContext context, DBasicTable semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     DBody returns DBody
	 *
	 * Constraint:
	 *     bodyContent+=DBodyContent+
	 */
	protected void sequence_DBody(ISerializationContext context, DBody semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     DCell returns DCell
	 *
	 * Constraint:
	 *     (colSpan=UINT_STRING? rowSpan=UINT_STRING? width=UINT_STRING? shadow=STRING? bodyContent+=DBodyContent+)
	 */
	protected void sequence_DCell(ISerializationContext context, DCell semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     DBodyContent returns DEnumerate
	 *     DListContent returns DEnumerate
	 *     DEnumerate returns DEnumerate
	 *
	 * Constraint:
	 *     (name=STRING? alignment=DAlignment? style=STRING? indent=REAL_STRING? items+=DListItem+)
	 */
	protected void sequence_DEnumerate(ISerializationContext context, DEnumerate semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     DBodyContent returns DFigureFromFile
	 *     DFigureFromFile returns DFigureFromFile
	 *
	 * Constraint:
	 *     (
	 *         name=STRING 
	 *         referenceFile=STRING 
	 *         width=UINT_STRING 
	 *         height=UINT_STRING 
	 *         alignment=DAlignment? 
	 *         style=STRING? 
	 *         indent=REAL_STRING? 
	 *         caption=STRING?
	 *     )
	 */
	protected void sequence_DFigureFromFile(ISerializationContext context, DFigureFromFile semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     DParagraphContent returns DHyperlink
	 *     DHyperlink returns DHyperlink
	 *
	 * Constraint:
	 *     (reference=[DReferenceableObject|STRING] run=DRun?)
	 */
	protected void sequence_DHyperlink(ISerializationContext context, DHyperlink semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     DBodyContent returns DItemize
	 *     DListContent returns DItemize
	 *     DItemize returns DItemize
	 *
	 * Constraint:
	 *     (name=STRING? alignment=DAlignment? style=STRING? indent=REAL_STRING? items+=DListItem+)
	 */
	protected void sequence_DItemize(ISerializationContext context, DItemize semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     DListItem returns DListItem
	 *
	 * Constraint:
	 *     (paragraph=DParagraph? sublist=DListContent?)
	 */
	protected void sequence_DListItem(ISerializationContext context, DListItem semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     DBodyContent returns DParagraph
	 *     DParagraph returns DParagraph
	 *
	 * Constraint:
	 *     (name=STRING? alignment=DAlignment? style=STRING? indent=REAL_STRING? paragraphContent+=DParagraphContent+)
	 */
	protected void sequence_DParagraph(ISerializationContext context, DParagraph semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     DReferenceDocument returns DReferenceDocument
	 *
	 * Constraint:
	 *     (
	 *         name=STRING 
	 *         title=STRING 
	 *         id=STRING 
	 *         (issue=UINT_STRING revision=UINT_STRING?)? 
	 *         date=STRING? 
	 *         url=STRING?
	 *     )
	 */
	protected void sequence_DReferenceDocument(ISerializationContext context, DReferenceDocument semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     DRow returns DRow
	 *
	 * Constraint:
	 *     cells+=DCell+
	 */
	protected void sequence_DRow(ISerializationContext context, DRow semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     DParagraphContent returns DRun
	 *     DRun returns DRun
	 *
	 * Constraint:
	 *     (
	 *         bold=DRunAttributes? 
	 *         italics=DRunAttributes? 
	 *         underline=DRunAttributes? 
	 *         color=STRING? 
	 *         tab=DTab? 
	 *         text=DText
	 *     )
	 */
	protected void sequence_DRun(ISerializationContext context, DRun semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     DTBC returns DTBC
	 *
	 * Constraint:
	 *     (name=STRING (description=STRING | parentTBC=[DTBC|STRING]))
	 */
	protected void sequence_DTBC(ISerializationContext context, DTBC semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     DTBD returns DTBD
	 *
	 * Constraint:
	 *     (name=STRING (description=STRING | parentTBD=[DTBD|STRING]))
	 */
	protected void sequence_DTBD(ISerializationContext context, DTBD semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     DTab returns DTab
	 *
	 * Constraint:
	 *     {DTab}
	 */
	protected void sequence_DTab(ISerializationContext context, DTab semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     DBodyContent returns DTableFromFile
	 *     DTableFromFile returns DTableFromFile
	 *
	 * Constraint:
	 *     (
	 *         name=STRING 
	 *         referenceFile=STRING 
	 *         width=UINT_STRING 
	 *         height=UINT_STRING 
	 *         alignment=DAlignment? 
	 *         style=STRING? 
	 *         indent=REAL_STRING? 
	 *         caption=STRING?
	 *     )
	 */
	protected void sequence_DTableFromFile(ISerializationContext context, DTableFromFile semanticObject) {
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
	 *     VSVRAbbreviation returns VSVRAbbreviation
	 *
	 * Constraint:
	 *     (name=STRING description=DRun)
	 */
	protected void sequence_VSVRAbbreviation(ISerializationContext context, VSVRAbbreviation semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, svrPackage.Literals.VSVR_ABSTRACT_BRIEF_DESCRIPTION__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, svrPackage.Literals.VSVR_ABSTRACT_BRIEF_DESCRIPTION__NAME));
			if (transientValues.isValueTransient(semanticObject, svrPackage.Literals.VSVR_ABSTRACT_BRIEF_DESCRIPTION__DESCRIPTION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, svrPackage.Literals.VSVR_ABSTRACT_BRIEF_DESCRIPTION__DESCRIPTION));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getVSVRAbbreviationAccess().getNameSTRINGTerminalRuleCall_2_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getVSVRAbbreviationAccess().getDescriptionDRunParserRuleCall_4_0(), semanticObject.getDescription());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     VSVRApplicableDocuments returns VSVRApplicableDocuments
	 *
	 * Constraint:
	 *     applicableDocuments+=DApplicableDocument*
	 */
	protected void sequence_VSVRApplicableDocuments(ISerializationContext context, VSVRApplicableDocuments semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     VSVRDefinition returns VSVRDefinition
	 *
	 * Constraint:
	 *     (name=STRING description=DRun)
	 */
	protected void sequence_VSVRDefinition(ISerializationContext context, VSVRDefinition semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, svrPackage.Literals.VSVR_ABSTRACT_BRIEF_DESCRIPTION__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, svrPackage.Literals.VSVR_ABSTRACT_BRIEF_DESCRIPTION__NAME));
			if (transientValues.isValueTransient(semanticObject, svrPackage.Literals.VSVR_ABSTRACT_BRIEF_DESCRIPTION__DESCRIPTION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, svrPackage.Literals.VSVR_ABSTRACT_BRIEF_DESCRIPTION__DESCRIPTION));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getVSVRDefinitionAccess().getNameSTRINGTerminalRuleCall_2_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getVSVRDefinitionAccess().getDescriptionDRunParserRuleCall_4_0(), semanticObject.getDescription());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     VSVRDocument returns VSVRDocument
	 *
	 * Constraint:
	 *     (
	 *         name=STRING 
	 *         id=STRING 
	 *         issue=UINT_STRING 
	 *         revision=UINT_STRING 
	 *         date=STRING 
	 *         svsParent=[VSVSDocument|STRING] 
	 *         tcrParent+=[VTCRTestCampaignReport|STRING]* 
	 *         tbcsTbdsSection=VSVRTBCsTBDs? 
	 *         introductionSection=VSVRIntroduction 
	 *         applicableDocumentsSection=VSVRApplicableDocuments 
	 *         referenceDocumentsSection=VSVRReferenceDocuments 
	 *         termsDefinitionsAbbreviationsSection=VSVRTermsDefinitionsAbbreviations 
	 *         swValProcessVerificationSection=VSVRSWValProcessVerification
	 *     )
	 */
	protected void sequence_VSVRDocument(ISerializationContext context, VSVRDocument semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     VSVRFixedSection returns VSVRFixedSection
	 *
	 * Constraint:
	 *     (body=DBody? svrInstatiableSubsections+=VSVRInstantiableSection*)
	 */
	protected void sequence_VSVRFixedSection(ISerializationContext context, VSVRFixedSection semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     VSVRInstantiableSection returns VSVRInstantiableSection
	 *
	 * Constraint:
	 *     (name=STRING body=DBody? svrInstatiableSubsections+=VSVRInstantiableSection*)
	 */
	protected void sequence_VSVRInstantiableSection(ISerializationContext context, VSVRInstantiableSection semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     VSVRIntroduction returns VSVRIntroduction
	 *
	 * Constraint:
	 *     svrInstatiableSubsections+=VSVRInstantiableSection+
	 */
	protected void sequence_VSVRIntroduction(ISerializationContext context, VSVRIntroduction semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     VSVRReferenceDocuments returns VSVRReferenceDocuments
	 *
	 * Constraint:
	 *     referenceDocuments+=DReferenceDocument*
	 */
	protected void sequence_VSVRReferenceDocuments(ISerializationContext context, VSVRReferenceDocuments semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     VSVRSWValProcessVerification returns VSVRSWValProcessVerification
	 *
	 * Constraint:
	 *     (body=DBody? traceability=VSVRFixedSection feasibility=VSVRFixedSection)
	 */
	protected void sequence_VSVRSWValProcessVerification(ISerializationContext context, VSVRSWValProcessVerification semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     VSVRTBCsTBDs returns VSVRTBCsTBDs
	 *
	 * Constraint:
	 *     (tbcs+=DTBC* tbds+=DTBD*)
	 */
	protected void sequence_VSVRTBCsTBDs(ISerializationContext context, VSVRTBCsTBDs semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     VSVRTerm returns VSVRTerm
	 *
	 * Constraint:
	 *     (name=STRING description=DRun)
	 */
	protected void sequence_VSVRTerm(ISerializationContext context, VSVRTerm semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, svrPackage.Literals.VSVR_ABSTRACT_BRIEF_DESCRIPTION__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, svrPackage.Literals.VSVR_ABSTRACT_BRIEF_DESCRIPTION__NAME));
			if (transientValues.isValueTransient(semanticObject, svrPackage.Literals.VSVR_ABSTRACT_BRIEF_DESCRIPTION__DESCRIPTION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, svrPackage.Literals.VSVR_ABSTRACT_BRIEF_DESCRIPTION__DESCRIPTION));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getVSVRTermAccess().getNameSTRINGTerminalRuleCall_2_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getVSVRTermAccess().getDescriptionDRunParserRuleCall_4_0(), semanticObject.getDescription());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     VSVRTermsDefinitionsAbbreviations returns VSVRTermsDefinitionsAbbreviations
	 *
	 * Constraint:
	 *     (terms+=VSVRTerm* definitions+=VSVRDefinition* abbreviations+=VSVRAbbreviation*)
	 */
	protected void sequence_VSVRTermsDefinitionsAbbreviations(ISerializationContext context, VSVRTermsDefinitionsAbbreviations semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
}
