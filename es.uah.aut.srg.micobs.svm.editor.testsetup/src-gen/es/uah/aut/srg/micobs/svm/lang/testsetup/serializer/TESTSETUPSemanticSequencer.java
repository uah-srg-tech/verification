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
package es.uah.aut.srg.micobs.svm.lang.testsetup.serializer;

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
import es.uah.aut.srg.micobs.svm.lang.testsetup.services.TESTSETUPGrammarAccess;
import es.uah.aut.srg.micobs.svm.testsetup.VTestSetupAction;
import es.uah.aut.srg.micobs.svm.testsetup.VTestSetupActionOverVariable;
import es.uah.aut.srg.micobs.svm.testsetup.VTestSetupActionsOverVariablesSection;
import es.uah.aut.srg.micobs.svm.testsetup.VTestSetupActionsSection;
import es.uah.aut.srg.micobs.svm.testsetup.VTestSetupApplicableDocuments;
import es.uah.aut.srg.micobs.svm.testsetup.VTestSetupDocument;
import es.uah.aut.srg.micobs.svm.testsetup.VTestSetupInterface;
import es.uah.aut.srg.micobs.svm.testsetup.VTestSetupInterfacesSection;
import es.uah.aut.srg.micobs.svm.testsetup.VTestSetupPacketConfiguration;
import es.uah.aut.srg.micobs.svm.testsetup.VTestSetupPacketConfigurationsSection;
import es.uah.aut.srg.micobs.svm.testsetup.VTestSetupReferenceDocuments;
import es.uah.aut.srg.micobs.svm.testsetup.VTestSetupScenarioSection;
import es.uah.aut.srg.micobs.svm.testsetup.VTestSetupScenariosSection;
import es.uah.aut.srg.micobs.svm.testsetup.VTestSetupSelectedConfiguration;
import es.uah.aut.srg.micobs.svm.testsetup.VTestSetupSupportedActionOverVariable;
import es.uah.aut.srg.micobs.svm.testsetup.VTestSetupSupportedInterface;
import es.uah.aut.srg.micobs.svm.testsetup.VTestSetupTBCsTBDs;
import es.uah.aut.srg.micobs.svm.testsetup.testsetupPackage;
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
public class TESTSETUPSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private TESTSETUPGrammarAccess grammarAccess;
	
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
		else if (epackage == testsetupPackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case testsetupPackage.VTEST_SETUP_ACTION:
				sequence_VTestSetupAction(context, (VTestSetupAction) semanticObject); 
				return; 
			case testsetupPackage.VTEST_SETUP_ACTION_OVER_VARIABLE:
				sequence_VTestSetupActionOverVariable(context, (VTestSetupActionOverVariable) semanticObject); 
				return; 
			case testsetupPackage.VTEST_SETUP_ACTIONS_OVER_VARIABLES_SECTION:
				sequence_VTestSetupActionsOverVariablesSection(context, (VTestSetupActionsOverVariablesSection) semanticObject); 
				return; 
			case testsetupPackage.VTEST_SETUP_ACTIONS_SECTION:
				sequence_VTestSetupActionsSection(context, (VTestSetupActionsSection) semanticObject); 
				return; 
			case testsetupPackage.VTEST_SETUP_APPLICABLE_DOCUMENTS:
				sequence_VTestSetupApplicableDocuments(context, (VTestSetupApplicableDocuments) semanticObject); 
				return; 
			case testsetupPackage.VTEST_SETUP_DOCUMENT:
				sequence_VTestSetupDocument(context, (VTestSetupDocument) semanticObject); 
				return; 
			case testsetupPackage.VTEST_SETUP_INTERFACE:
				sequence_VTestSetupInterface(context, (VTestSetupInterface) semanticObject); 
				return; 
			case testsetupPackage.VTEST_SETUP_INTERFACES_SECTION:
				sequence_VTestSetupInterfacesSection(context, (VTestSetupInterfacesSection) semanticObject); 
				return; 
			case testsetupPackage.VTEST_SETUP_PACKET_CONFIGURATION:
				sequence_VTestSetupPacketConfiguration(context, (VTestSetupPacketConfiguration) semanticObject); 
				return; 
			case testsetupPackage.VTEST_SETUP_PACKET_CONFIGURATIONS_SECTION:
				sequence_VTestSetupPacketConfigurationsSection(context, (VTestSetupPacketConfigurationsSection) semanticObject); 
				return; 
			case testsetupPackage.VTEST_SETUP_REFERENCE_DOCUMENTS:
				sequence_VTestSetupReferenceDocuments(context, (VTestSetupReferenceDocuments) semanticObject); 
				return; 
			case testsetupPackage.VTEST_SETUP_SCENARIO_SECTION:
				sequence_VTestSetupScenarioSection(context, (VTestSetupScenarioSection) semanticObject); 
				return; 
			case testsetupPackage.VTEST_SETUP_SCENARIOS_SECTION:
				sequence_VTestSetupScenariosSection(context, (VTestSetupScenariosSection) semanticObject); 
				return; 
			case testsetupPackage.VTEST_SETUP_SELECTED_CONFIGURATION:
				sequence_VTestSetupSelectedConfiguration(context, (VTestSetupSelectedConfiguration) semanticObject); 
				return; 
			case testsetupPackage.VTEST_SETUP_SUPPORTED_ACTION_OVER_VARIABLE:
				sequence_VTestSetupSupportedActionOverVariable(context, (VTestSetupSupportedActionOverVariable) semanticObject); 
				return; 
			case testsetupPackage.VTEST_SETUP_SUPPORTED_INTERFACE:
				sequence_VTestSetupSupportedInterface(context, (VTestSetupSupportedInterface) semanticObject); 
				return; 
			case testsetupPackage.VTEST_SETUP_TB_CS_TB_DS:
				sequence_VTestSetupTBCsTBDs(context, (VTestSetupTBCsTBDs) semanticObject); 
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
	 *     (name=STRING description=STRING)
	 */
	protected void sequence_DTBC(ISerializationContext context, DTBC semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, doctplPackage.Literals.DREFERENCEABLE_OBJECT__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, doctplPackage.Literals.DREFERENCEABLE_OBJECT__NAME));
			if (transientValues.isValueTransient(semanticObject, doctplPackage.Literals.DABSTRACT_PLACEHOLDER__DESCRIPTION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, doctplPackage.Literals.DABSTRACT_PLACEHOLDER__DESCRIPTION));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getDTBCAccess().getNameSTRINGTerminalRuleCall_2_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getDTBCAccess().getDescriptionSTRINGTerminalRuleCall_4_0(), semanticObject.getDescription());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     DTBD returns DTBD
	 *
	 * Constraint:
	 *     (name=STRING description=STRING)
	 */
	protected void sequence_DTBD(ISerializationContext context, DTBD semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, doctplPackage.Literals.DREFERENCEABLE_OBJECT__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, doctplPackage.Literals.DREFERENCEABLE_OBJECT__NAME));
			if (transientValues.isValueTransient(semanticObject, doctplPackage.Literals.DABSTRACT_PLACEHOLDER__DESCRIPTION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, doctplPackage.Literals.DABSTRACT_PLACEHOLDER__DESCRIPTION));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getDTBDAccess().getNameSTRINGTerminalRuleCall_2_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getDTBDAccess().getDescriptionSTRINGTerminalRuleCall_4_0(), semanticObject.getDescription());
		feeder.finish();
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
	 *     VTestSetupActionOverVariable returns VTestSetupActionOverVariable
	 *
	 * Constraint:
	 *     (name=STRING type=VTestSetupActionOverVariableType description=DBody)
	 */
	protected void sequence_VTestSetupActionOverVariable(ISerializationContext context, VTestSetupActionOverVariable semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, testsetupPackage.Literals.VTEST_SETUP_ACTION_OVER_VARIABLE__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, testsetupPackage.Literals.VTEST_SETUP_ACTION_OVER_VARIABLE__NAME));
			if (transientValues.isValueTransient(semanticObject, testsetupPackage.Literals.VTEST_SETUP_ACTION_OVER_VARIABLE__TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, testsetupPackage.Literals.VTEST_SETUP_ACTION_OVER_VARIABLE__TYPE));
			if (transientValues.isValueTransient(semanticObject, testsetupPackage.Literals.VTEST_SETUP_ACTION_OVER_VARIABLE__DESCRIPTION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, testsetupPackage.Literals.VTEST_SETUP_ACTION_OVER_VARIABLE__DESCRIPTION));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getVTestSetupActionOverVariableAccess().getNameSTRINGTerminalRuleCall_2_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getVTestSetupActionOverVariableAccess().getTypeVTestSetupActionOverVariableTypeEnumRuleCall_4_0(), semanticObject.getType());
		feeder.accept(grammarAccess.getVTestSetupActionOverVariableAccess().getDescriptionDBodyParserRuleCall_6_0(), semanticObject.getDescription());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     VTestSetupAction returns VTestSetupAction
	 *
	 * Constraint:
	 *     (name=STRING type=VTestSetupActionType description=DBody)
	 */
	protected void sequence_VTestSetupAction(ISerializationContext context, VTestSetupAction semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, testsetupPackage.Literals.VTEST_SETUP_ACTION__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, testsetupPackage.Literals.VTEST_SETUP_ACTION__NAME));
			if (transientValues.isValueTransient(semanticObject, testsetupPackage.Literals.VTEST_SETUP_ACTION__TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, testsetupPackage.Literals.VTEST_SETUP_ACTION__TYPE));
			if (transientValues.isValueTransient(semanticObject, testsetupPackage.Literals.VTEST_SETUP_ACTION__DESCRIPTION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, testsetupPackage.Literals.VTEST_SETUP_ACTION__DESCRIPTION));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getVTestSetupActionAccess().getNameSTRINGTerminalRuleCall_2_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getVTestSetupActionAccess().getTypeVTestSetupActionTypeEnumRuleCall_4_0(), semanticObject.getType());
		feeder.accept(grammarAccess.getVTestSetupActionAccess().getDescriptionDBodyParserRuleCall_6_0(), semanticObject.getDescription());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     VTestSetupActionsOverVariablesSection returns VTestSetupActionsOverVariablesSection
	 *
	 * Constraint:
	 *     actionsOverVariable+=VTestSetupActionOverVariable+
	 */
	protected void sequence_VTestSetupActionsOverVariablesSection(ISerializationContext context, VTestSetupActionsOverVariablesSection semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     VTestSetupActionsSection returns VTestSetupActionsSection
	 *
	 * Constraint:
	 *     actions+=VTestSetupAction+
	 */
	protected void sequence_VTestSetupActionsSection(ISerializationContext context, VTestSetupActionsSection semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     VTestSetupApplicableDocuments returns VTestSetupApplicableDocuments
	 *
	 * Constraint:
	 *     applicableDocuments+=DApplicableDocument*
	 */
	protected void sequence_VTestSetupApplicableDocuments(ISerializationContext context, VTestSetupApplicableDocuments semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     VTestSetupDocument returns VTestSetupDocument
	 *
	 * Constraint:
	 *     (
	 *         name=STRING 
	 *         id=STRING 
	 *         issue=UINT_STRING 
	 *         revision=UINT_STRING 
	 *         date=STRING 
	 *         tbcsTbdsSection=VTestSetupTBCsTBDs? 
	 *         applicableDocumentsSection=VTestSetupApplicableDocuments 
	 *         referenceDocumentsSection=VTestSetupReferenceDocuments 
	 *         interfaces=VTestSetupInterfacesSection 
	 *         configurations=VTestSetupPacketConfigurationsSection? 
	 *         actions=VTestSetupActionsSection? 
	 *         actionsOverVariables=VTestSetupActionsOverVariablesSection? 
	 *         scenarios=VTestSetupScenariosSection
	 *     )
	 */
	protected void sequence_VTestSetupDocument(ISerializationContext context, VTestSetupDocument semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     VTestSetupInterface returns VTestSetupInterface
	 *
	 * Constraint:
	 *     (name=STRING tcHeader=[TMTCIFTCHeader|STRING] tmHeader=[TMTCIFTMHeader|STRING] description=DRun)
	 */
	protected void sequence_VTestSetupInterface(ISerializationContext context, VTestSetupInterface semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, testsetupPackage.Literals.VTEST_SETUP_INTERFACE__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, testsetupPackage.Literals.VTEST_SETUP_INTERFACE__NAME));
			if (transientValues.isValueTransient(semanticObject, testsetupPackage.Literals.VTEST_SETUP_INTERFACE__TC_HEADER) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, testsetupPackage.Literals.VTEST_SETUP_INTERFACE__TC_HEADER));
			if (transientValues.isValueTransient(semanticObject, testsetupPackage.Literals.VTEST_SETUP_INTERFACE__TM_HEADER) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, testsetupPackage.Literals.VTEST_SETUP_INTERFACE__TM_HEADER));
			if (transientValues.isValueTransient(semanticObject, testsetupPackage.Literals.VTEST_SETUP_INTERFACE__DESCRIPTION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, testsetupPackage.Literals.VTEST_SETUP_INTERFACE__DESCRIPTION));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getVTestSetupInterfaceAccess().getNameSTRINGTerminalRuleCall_2_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getVTestSetupInterfaceAccess().getTcHeaderTMTCIFTCHeaderSTRINGTerminalRuleCall_4_0_1(), semanticObject.getTcHeader());
		feeder.accept(grammarAccess.getVTestSetupInterfaceAccess().getTmHeaderTMTCIFTMHeaderSTRINGTerminalRuleCall_6_0_1(), semanticObject.getTmHeader());
		feeder.accept(grammarAccess.getVTestSetupInterfaceAccess().getDescriptionDRunParserRuleCall_8_0(), semanticObject.getDescription());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     VTestSetupInterfacesSection returns VTestSetupInterfacesSection
	 *
	 * Constraint:
	 *     interfaces+=VTestSetupInterface+
	 */
	protected void sequence_VTestSetupInterfacesSection(ISerializationContext context, VTestSetupInterfacesSection semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     VTestSetupPacketConfiguration returns VTestSetupPacketConfiguration
	 *
	 * Constraint:
	 *     (name=STRING description=DRun)
	 */
	protected void sequence_VTestSetupPacketConfiguration(ISerializationContext context, VTestSetupPacketConfiguration semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, testsetupPackage.Literals.VTEST_SETUP_PACKET_CONFIGURATION__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, testsetupPackage.Literals.VTEST_SETUP_PACKET_CONFIGURATION__NAME));
			if (transientValues.isValueTransient(semanticObject, testsetupPackage.Literals.VTEST_SETUP_PACKET_CONFIGURATION__DESCRIPTION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, testsetupPackage.Literals.VTEST_SETUP_PACKET_CONFIGURATION__DESCRIPTION));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getVTestSetupPacketConfigurationAccess().getNameSTRINGTerminalRuleCall_2_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getVTestSetupPacketConfigurationAccess().getDescriptionDRunParserRuleCall_4_0(), semanticObject.getDescription());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     VTestSetupPacketConfigurationsSection returns VTestSetupPacketConfigurationsSection
	 *
	 * Constraint:
	 *     packetConfigurations+=VTestSetupPacketConfiguration+
	 */
	protected void sequence_VTestSetupPacketConfigurationsSection(ISerializationContext context, VTestSetupPacketConfigurationsSection semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     VTestSetupReferenceDocuments returns VTestSetupReferenceDocuments
	 *
	 * Constraint:
	 *     referenceDocuments+=DReferenceDocument*
	 */
	protected void sequence_VTestSetupReferenceDocuments(ISerializationContext context, VTestSetupReferenceDocuments semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     VTestSetupScenarioSection returns VTestSetupScenarioSection
	 *
	 * Constraint:
	 *     (
	 *         name=STRING 
	 *         scenario=[TMTCIFScenario|STRING] 
	 *         supportedInterface+=VTestSetupSupportedInterface* 
	 *         selectedConfiguration+=VTestSetupSelectedConfiguration* 
	 *         supportedAction+=[VTestSetupAction|STRING]* 
	 *         supportedActionOverVariable+=VTestSetupSupportedActionOverVariable* 
	 *         body=DBody
	 *     )
	 */
	protected void sequence_VTestSetupScenarioSection(ISerializationContext context, VTestSetupScenarioSection semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     VTestSetupScenariosSection returns VTestSetupScenariosSection
	 *
	 * Constraint:
	 *     scenarios+=VTestSetupScenarioSection+
	 */
	protected void sequence_VTestSetupScenariosSection(ISerializationContext context, VTestSetupScenariosSection semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     VTestSetupSelectedConfiguration returns VTestSetupSelectedConfiguration
	 *
	 * Constraint:
	 *     (
	 *         name=STRING 
	 *         configuration=[VTestSetupPacketConfiguration|STRING] 
	 *         scenarioPacketConfig=[TMTCIFScenarioPacketConfig|STRING] 
	 *         defaultFilterStatus=VTestSetupConfigurationStatus 
	 *         defaultPrintStatus=VTestSetupConfigurationStatus
	 *     )
	 */
	protected void sequence_VTestSetupSelectedConfiguration(ISerializationContext context, VTestSetupSelectedConfiguration semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, testsetupPackage.Literals.VTEST_SETUP_SELECTED_CONFIGURATION__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, testsetupPackage.Literals.VTEST_SETUP_SELECTED_CONFIGURATION__NAME));
			if (transientValues.isValueTransient(semanticObject, testsetupPackage.Literals.VTEST_SETUP_SELECTED_CONFIGURATION__CONFIGURATION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, testsetupPackage.Literals.VTEST_SETUP_SELECTED_CONFIGURATION__CONFIGURATION));
			if (transientValues.isValueTransient(semanticObject, testsetupPackage.Literals.VTEST_SETUP_SELECTED_CONFIGURATION__SCENARIO_PACKET_CONFIG) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, testsetupPackage.Literals.VTEST_SETUP_SELECTED_CONFIGURATION__SCENARIO_PACKET_CONFIG));
			if (transientValues.isValueTransient(semanticObject, testsetupPackage.Literals.VTEST_SETUP_SELECTED_CONFIGURATION__DEFAULT_FILTER_STATUS) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, testsetupPackage.Literals.VTEST_SETUP_SELECTED_CONFIGURATION__DEFAULT_FILTER_STATUS));
			if (transientValues.isValueTransient(semanticObject, testsetupPackage.Literals.VTEST_SETUP_SELECTED_CONFIGURATION__DEFAULT_PRINT_STATUS) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, testsetupPackage.Literals.VTEST_SETUP_SELECTED_CONFIGURATION__DEFAULT_PRINT_STATUS));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getVTestSetupSelectedConfigurationAccess().getNameSTRINGTerminalRuleCall_2_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getVTestSetupSelectedConfigurationAccess().getConfigurationVTestSetupPacketConfigurationSTRINGTerminalRuleCall_4_0_1(), semanticObject.getConfiguration());
		feeder.accept(grammarAccess.getVTestSetupSelectedConfigurationAccess().getScenarioPacketConfigTMTCIFScenarioPacketConfigSTRINGTerminalRuleCall_6_0_1(), semanticObject.getScenarioPacketConfig());
		feeder.accept(grammarAccess.getVTestSetupSelectedConfigurationAccess().getDefaultFilterStatusVTestSetupConfigurationStatusEnumRuleCall_8_0(), semanticObject.getDefaultFilterStatus());
		feeder.accept(grammarAccess.getVTestSetupSelectedConfigurationAccess().getDefaultPrintStatusVTestSetupConfigurationStatusEnumRuleCall_10_0(), semanticObject.getDefaultPrintStatus());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     VTestSetupSupportedActionOverVariable returns VTestSetupSupportedActionOverVariable
	 *
	 * Constraint:
	 *     (name=STRING actionOverVariable=[VTestSetupActionOverVariable|STRING] scenarioVariable=[TMTCIFScenarioVariable|STRING])
	 */
	protected void sequence_VTestSetupSupportedActionOverVariable(ISerializationContext context, VTestSetupSupportedActionOverVariable semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, testsetupPackage.Literals.VTEST_SETUP_SUPPORTED_ACTION_OVER_VARIABLE__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, testsetupPackage.Literals.VTEST_SETUP_SUPPORTED_ACTION_OVER_VARIABLE__NAME));
			if (transientValues.isValueTransient(semanticObject, testsetupPackage.Literals.VTEST_SETUP_SUPPORTED_ACTION_OVER_VARIABLE__ACTION_OVER_VARIABLE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, testsetupPackage.Literals.VTEST_SETUP_SUPPORTED_ACTION_OVER_VARIABLE__ACTION_OVER_VARIABLE));
			if (transientValues.isValueTransient(semanticObject, testsetupPackage.Literals.VTEST_SETUP_SUPPORTED_ACTION_OVER_VARIABLE__SCENARIO_VARIABLE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, testsetupPackage.Literals.VTEST_SETUP_SUPPORTED_ACTION_OVER_VARIABLE__SCENARIO_VARIABLE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getVTestSetupSupportedActionOverVariableAccess().getNameSTRINGTerminalRuleCall_2_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getVTestSetupSupportedActionOverVariableAccess().getActionOverVariableVTestSetupActionOverVariableSTRINGTerminalRuleCall_4_0_1(), semanticObject.getActionOverVariable());
		feeder.accept(grammarAccess.getVTestSetupSupportedActionOverVariableAccess().getScenarioVariableTMTCIFScenarioVariableSTRINGTerminalRuleCall_6_0_1(), semanticObject.getScenarioVariable());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     VTestSetupSupportedInterface returns VTestSetupSupportedInterface
	 *
	 * Constraint:
	 *     (name=STRING interface=[VTestSetupInterface|STRING] scenarioInterface=[TMTCIFScenarioInterface|STRING])
	 */
	protected void sequence_VTestSetupSupportedInterface(ISerializationContext context, VTestSetupSupportedInterface semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, testsetupPackage.Literals.VTEST_SETUP_SUPPORTED_INTERFACE__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, testsetupPackage.Literals.VTEST_SETUP_SUPPORTED_INTERFACE__NAME));
			if (transientValues.isValueTransient(semanticObject, testsetupPackage.Literals.VTEST_SETUP_SUPPORTED_INTERFACE__INTERFACE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, testsetupPackage.Literals.VTEST_SETUP_SUPPORTED_INTERFACE__INTERFACE));
			if (transientValues.isValueTransient(semanticObject, testsetupPackage.Literals.VTEST_SETUP_SUPPORTED_INTERFACE__SCENARIO_INTERFACE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, testsetupPackage.Literals.VTEST_SETUP_SUPPORTED_INTERFACE__SCENARIO_INTERFACE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getVTestSetupSupportedInterfaceAccess().getNameSTRINGTerminalRuleCall_2_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getVTestSetupSupportedInterfaceAccess().getInterfaceVTestSetupInterfaceSTRINGTerminalRuleCall_4_0_1(), semanticObject.getInterface());
		feeder.accept(grammarAccess.getVTestSetupSupportedInterfaceAccess().getScenarioInterfaceTMTCIFScenarioInterfaceSTRINGTerminalRuleCall_6_0_1(), semanticObject.getScenarioInterface());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     VTestSetupTBCsTBDs returns VTestSetupTBCsTBDs
	 *
	 * Constraint:
	 *     (tbcs+=DTBC* tbds+=DTBD*)
	 */
	protected void sequence_VTestSetupTBCsTBDs(ISerializationContext context, VTestSetupTBCsTBDs semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
}
