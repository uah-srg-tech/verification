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
package es.uah.aut.srg.micobs.svm.lang.svs.serializer;

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
import es.uah.aut.srg.micobs.doctpl.doctpl.DTab;
import es.uah.aut.srg.micobs.doctpl.doctpl.DTableFromFile;
import es.uah.aut.srg.micobs.doctpl.doctpl.DText;
import es.uah.aut.srg.micobs.doctpl.doctpl.doctplPackage;
import es.uah.aut.srg.micobs.svm.lang.svs.services.SVSGrammarAccess;
import es.uah.aut.srg.micobs.svm.svs.VSVSAbbreviation;
import es.uah.aut.srg.micobs.svm.svs.VSVSAdditionalInformation;
import es.uah.aut.srg.micobs.svm.svs.VSVSAnalysisInspectionReview;
import es.uah.aut.srg.micobs.svm.svs.VSVSApplicableDocuments;
import es.uah.aut.srg.micobs.svm.svs.VSVSDefinition;
import es.uah.aut.srg.micobs.svm.svs.VSVSDocument;
import es.uah.aut.srg.micobs.svm.svs.VSVSFixedSection;
import es.uah.aut.srg.micobs.svm.svs.VSVSInstantiableSection;
import es.uah.aut.srg.micobs.svm.svs.VSVSIntroduction;
import es.uah.aut.srg.micobs.svm.svs.VSVSProcedureStep;
import es.uah.aut.srg.micobs.svm.svs.VSVSProcedureSteps;
import es.uah.aut.srg.micobs.svm.svs.VSVSReferenceDocuments;
import es.uah.aut.srg.micobs.svm.svs.VSVSSoftwareOverview;
import es.uah.aut.srg.micobs.svm.svs.VSVSStepAction;
import es.uah.aut.srg.micobs.svm.svs.VSVSStepConfiguration;
import es.uah.aut.srg.micobs.svm.svs.VSVSStepConfigurations;
import es.uah.aut.srg.micobs.svm.svs.VSVSStepTelecommand;
import es.uah.aut.srg.micobs.svm.svs.VSVSStepTelecommandData;
import es.uah.aut.srg.micobs.svm.svs.VSVSStepTelecommandDataField;
import es.uah.aut.srg.micobs.svm.svs.VSVSStepTelecommandHeader;
import es.uah.aut.srg.micobs.svm.svs.VSVSStepTelecommandHeaderField;
import es.uah.aut.srg.micobs.svm.svs.VSVSStepTelecommandSequence;
import es.uah.aut.srg.micobs.svm.svs.VSVSStepTelemetry;
import es.uah.aut.srg.micobs.svm.svs.VSVSStepTelemetryData;
import es.uah.aut.srg.micobs.svm.svs.VSVSStepTelemetryDataField;
import es.uah.aut.srg.micobs.svm.svs.VSVSStepTelemetryHeader;
import es.uah.aut.srg.micobs.svm.svs.VSVSStepTelemetryHeaderField;
import es.uah.aut.srg.micobs.svm.svs.VSVSStepTelemetrySet;
import es.uah.aut.srg.micobs.svm.svs.VSVSTaskIdentification;
import es.uah.aut.srg.micobs.svm.svs.VSVSTerm;
import es.uah.aut.srg.micobs.svm.svs.VSVSTermsDefinitionsAbbreviations;
import es.uah.aut.srg.micobs.svm.svs.VSVSTestCase;
import es.uah.aut.srg.micobs.svm.svs.VSVSTestCases;
import es.uah.aut.srg.micobs.svm.svs.VSVSTestDesign;
import es.uah.aut.srg.micobs.svm.svs.VSVSTestInfo;
import es.uah.aut.srg.micobs.svm.svs.VSVSTestPlatformRequirements;
import es.uah.aut.srg.micobs.svm.svs.VSVSTestProcedure;
import es.uah.aut.srg.micobs.svm.svs.VSVSTestProcedures;
import es.uah.aut.srg.micobs.svm.svs.VSVSTestingSpecificationDesign;
import es.uah.aut.srg.micobs.svm.svs.svsPackage;
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
public class SVSSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private SVSGrammarAccess grammarAccess;
	
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
		else if (epackage == fieldvaluePackage.eINSTANCE)
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
		else if (epackage == svsPackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case svsPackage.VSVS_ABBREVIATION:
				sequence_VSVSAbbreviation(context, (VSVSAbbreviation) semanticObject); 
				return; 
			case svsPackage.VSVS_ADDITIONAL_INFORMATION:
				sequence_VSVSAdditionalInformation(context, (VSVSAdditionalInformation) semanticObject); 
				return; 
			case svsPackage.VSVS_ANALYSIS_INSPECTION_REVIEW:
				sequence_VSVSAnalysisInspectionReview(context, (VSVSAnalysisInspectionReview) semanticObject); 
				return; 
			case svsPackage.VSVS_APPLICABLE_DOCUMENTS:
				sequence_VSVSApplicableDocuments(context, (VSVSApplicableDocuments) semanticObject); 
				return; 
			case svsPackage.VSVS_DEFINITION:
				sequence_VSVSDefinition(context, (VSVSDefinition) semanticObject); 
				return; 
			case svsPackage.VSVS_DOCUMENT:
				sequence_VSVSDocument(context, (VSVSDocument) semanticObject); 
				return; 
			case svsPackage.VSVS_FIXED_SECTION:
				sequence_VSVSFixedSection(context, (VSVSFixedSection) semanticObject); 
				return; 
			case svsPackage.VSVS_INSTANTIABLE_SECTION:
				sequence_VSVSInstantiableSection(context, (VSVSInstantiableSection) semanticObject); 
				return; 
			case svsPackage.VSVS_INTRODUCTION:
				sequence_VSVSIntroduction(context, (VSVSIntroduction) semanticObject); 
				return; 
			case svsPackage.VSVS_PROCEDURE_STEP:
				sequence_VSVSProcedureStep(context, (VSVSProcedureStep) semanticObject); 
				return; 
			case svsPackage.VSVS_PROCEDURE_STEPS:
				sequence_VSVSProcedureSteps(context, (VSVSProcedureSteps) semanticObject); 
				return; 
			case svsPackage.VSVS_REFERENCE_DOCUMENTS:
				sequence_VSVSReferenceDocuments(context, (VSVSReferenceDocuments) semanticObject); 
				return; 
			case svsPackage.VSVS_SOFTWARE_OVERVIEW:
				sequence_VSVSSoftwareOverview(context, (VSVSSoftwareOverview) semanticObject); 
				return; 
			case svsPackage.VSVS_STEP_ACTION:
				sequence_VSVSStepAction(context, (VSVSStepAction) semanticObject); 
				return; 
			case svsPackage.VSVS_STEP_CONFIGURATION:
				sequence_VSVSStepConfiguration(context, (VSVSStepConfiguration) semanticObject); 
				return; 
			case svsPackage.VSVS_STEP_CONFIGURATIONS:
				sequence_VSVSStepConfigurations(context, (VSVSStepConfigurations) semanticObject); 
				return; 
			case svsPackage.VSVS_STEP_TELECOMMAND:
				sequence_VSVSStepTelecommand(context, (VSVSStepTelecommand) semanticObject); 
				return; 
			case svsPackage.VSVS_STEP_TELECOMMAND_DATA:
				sequence_VSVSStepTelecommandData(context, (VSVSStepTelecommandData) semanticObject); 
				return; 
			case svsPackage.VSVS_STEP_TELECOMMAND_DATA_FIELD:
				sequence_VSVSStepTelecommandDataField(context, (VSVSStepTelecommandDataField) semanticObject); 
				return; 
			case svsPackage.VSVS_STEP_TELECOMMAND_HEADER:
				sequence_VSVSStepTelecommandHeader(context, (VSVSStepTelecommandHeader) semanticObject); 
				return; 
			case svsPackage.VSVS_STEP_TELECOMMAND_HEADER_FIELD:
				sequence_VSVSStepTelecommandHeaderField(context, (VSVSStepTelecommandHeaderField) semanticObject); 
				return; 
			case svsPackage.VSVS_STEP_TELECOMMAND_SEQUENCE:
				sequence_VSVSStepTelecommandSequence(context, (VSVSStepTelecommandSequence) semanticObject); 
				return; 
			case svsPackage.VSVS_STEP_TELEMETRY:
				sequence_VSVSStepTelemetry(context, (VSVSStepTelemetry) semanticObject); 
				return; 
			case svsPackage.VSVS_STEP_TELEMETRY_DATA:
				sequence_VSVSStepTelemetryData(context, (VSVSStepTelemetryData) semanticObject); 
				return; 
			case svsPackage.VSVS_STEP_TELEMETRY_DATA_FIELD:
				sequence_VSVSStepTelemetryDataField(context, (VSVSStepTelemetryDataField) semanticObject); 
				return; 
			case svsPackage.VSVS_STEP_TELEMETRY_HEADER:
				sequence_VSVSStepTelemetryHeader(context, (VSVSStepTelemetryHeader) semanticObject); 
				return; 
			case svsPackage.VSVS_STEP_TELEMETRY_HEADER_FIELD:
				sequence_VSVSStepTelemetryHeaderField(context, (VSVSStepTelemetryHeaderField) semanticObject); 
				return; 
			case svsPackage.VSVS_STEP_TELEMETRY_SET:
				sequence_VSVSStepTelemetrySet(context, (VSVSStepTelemetrySet) semanticObject); 
				return; 
			case svsPackage.VSVS_TASK_IDENTIFICATION:
				sequence_VSVSTaskIdentification(context, (VSVSTaskIdentification) semanticObject); 
				return; 
			case svsPackage.VSVS_TERM:
				sequence_VSVSTerm(context, (VSVSTerm) semanticObject); 
				return; 
			case svsPackage.VSVS_TERMS_DEFINITIONS_ABBREVIATIONS:
				sequence_VSVSTermsDefinitionsAbbreviations(context, (VSVSTermsDefinitionsAbbreviations) semanticObject); 
				return; 
			case svsPackage.VSVS_TEST_CASE:
				sequence_VSVSTestCase(context, (VSVSTestCase) semanticObject); 
				return; 
			case svsPackage.VSVS_TEST_CASES:
				sequence_VSVSTestCases(context, (VSVSTestCases) semanticObject); 
				return; 
			case svsPackage.VSVS_TEST_DESIGN:
				sequence_VSVSTestDesign(context, (VSVSTestDesign) semanticObject); 
				return; 
			case svsPackage.VSVS_TEST_INFO:
				sequence_VSVSTestInfo(context, (VSVSTestInfo) semanticObject); 
				return; 
			case svsPackage.VSVS_TEST_PLATFORM_REQUIREMENTS:
				sequence_VSVSTestPlatformRequirements(context, (VSVSTestPlatformRequirements) semanticObject); 
				return; 
			case svsPackage.VSVS_TEST_PROCEDURE:
				sequence_VSVSTestProcedure(context, (VSVSTestProcedure) semanticObject); 
				return; 
			case svsPackage.VSVS_TEST_PROCEDURES:
				sequence_VSVSTestProcedures(context, (VSVSTestProcedures) semanticObject); 
				return; 
			case svsPackage.VSVS_TESTING_SPECIFICATION_DESIGN:
				sequence_VSVSTestingSpecificationDesign(context, (VSVSTestingSpecificationDesign) semanticObject); 
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
	 *     (name=STRING title=STRING id=STRING (issue=UINT_STRING revision=UINT_STRING?)? date=STRING?)
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
	 *     (name=STRING title=STRING id=STRING (issue=UINT_STRING revision=UINT_STRING?)? date=STRING?)
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
	 *     TMTCIFFieldValueTC returns TMTCIFFieldValueEnum
	 *     TMTCIFFieldValueEnum returns TMTCIFFieldValueEnum
	 *     TMTCIFFieldValueTM returns TMTCIFFieldValueEnum
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
	 *     TMTCIFFieldValueTC returns TMTCIFFieldValueFile
	 *     TMTCIFFieldValueHeader returns TMTCIFFieldValueFile
	 *     TMTCIFFieldValueFile returns TMTCIFFieldValueFile
	 *     TMTCIFFieldValueTM returns TMTCIFFieldValueFile
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
	 *     TMTCIFFieldValueTC returns TMTCIFFieldValueRaw
	 *     TMTCIFFieldValueHeader returns TMTCIFFieldValueRaw
	 *     TMTCIFFieldValueRaw returns TMTCIFFieldValueRaw
	 *     TMTCIFFieldValueTM returns TMTCIFFieldValueRaw
	 *
	 * Constraint:
	 *     (value=UINT_STRING | value=HEX_STRING)
	 */
	protected void sequence_TMTCIFFieldValueRaw(ISerializationContext context, TMTCIFFieldValueRaw semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     VSVSAbbreviation returns VSVSAbbreviation
	 *
	 * Constraint:
	 *     (name=STRING description=DRun)
	 */
	protected void sequence_VSVSAbbreviation(ISerializationContext context, VSVSAbbreviation semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, svsPackage.Literals.VSVS_ABSTRACT_BRIEF_DESCRIPTION__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, svsPackage.Literals.VSVS_ABSTRACT_BRIEF_DESCRIPTION__NAME));
			if (transientValues.isValueTransient(semanticObject, svsPackage.Literals.VSVS_ABSTRACT_BRIEF_DESCRIPTION__DESCRIPTION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, svsPackage.Literals.VSVS_ABSTRACT_BRIEF_DESCRIPTION__DESCRIPTION));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getVSVSAbbreviationAccess().getNameSTRINGTerminalRuleCall_2_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getVSVSAbbreviationAccess().getDescriptionDRunParserRuleCall_4_0(), semanticObject.getDescription());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     VSVSAdditionalInformation returns VSVSAdditionalInformation
	 *
	 * Constraint:
	 *     (body=DBody? svsInstatiableSubsections+=VSVSInstantiableSection*)
	 */
	protected void sequence_VSVSAdditionalInformation(ISerializationContext context, VSVSAdditionalInformation semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     VSVSAnalysisInspectionReview returns VSVSAnalysisInspectionReview
	 *
	 * Constraint:
	 *     (body=DBody? svsInstatiableSubsections+=VSVSInstantiableSection*)
	 */
	protected void sequence_VSVSAnalysisInspectionReview(ISerializationContext context, VSVSAnalysisInspectionReview semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     VSVSApplicableDocuments returns VSVSApplicableDocuments
	 *
	 * Constraint:
	 *     applicableDocuments+=DApplicableDocument*
	 */
	protected void sequence_VSVSApplicableDocuments(ISerializationContext context, VSVSApplicableDocuments semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     VSVSDefinition returns VSVSDefinition
	 *
	 * Constraint:
	 *     (name=STRING description=DRun)
	 */
	protected void sequence_VSVSDefinition(ISerializationContext context, VSVSDefinition semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, svsPackage.Literals.VSVS_ABSTRACT_BRIEF_DESCRIPTION__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, svsPackage.Literals.VSVS_ABSTRACT_BRIEF_DESCRIPTION__NAME));
			if (transientValues.isValueTransient(semanticObject, svsPackage.Literals.VSVS_ABSTRACT_BRIEF_DESCRIPTION__DESCRIPTION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, svsPackage.Literals.VSVS_ABSTRACT_BRIEF_DESCRIPTION__DESCRIPTION));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getVSVSDefinitionAccess().getNameSTRINGTerminalRuleCall_2_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getVSVSDefinitionAccess().getDescriptionDRunParserRuleCall_4_0(), semanticObject.getDescription());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     VSVSDocument returns VSVSDocument
	 *
	 * Constraint:
	 *     (
	 *         name=STRING 
	 *         id=STRING 
	 *         issue=UINT_STRING 
	 *         revision=UINT_STRING 
	 *         date=STRING 
	 *         parents+=[VTraceableDocument|STRING]* 
	 *         introductionSection=VSVSIntroduction 
	 *         applicableDocumentsSection=VSVSApplicableDocuments 
	 *         referenceDocumentsSection=VSVSReferenceDocuments 
	 *         termsDefinitionsAbbreviationsSection=VSVSTermsDefinitionsAbbreviations 
	 *         softwareOverviewSection=VSVSSoftwareOverview 
	 *         taskIdentificationSection=VSVSTaskIdentification 
	 *         testingSpecificationDesignSection=VSVSTestingSpecificationDesign 
	 *         testCasesSection=VSVSTestCases 
	 *         testProceduresSection=VSVSTestProcedures 
	 *         analysisInspectionReviewSection=VSVSAnalysisInspectionReview 
	 *         testPlatformRequirementsSection=VSVSTestPlatformRequirements 
	 *         additionalInformationSection=VSVSAdditionalInformation
	 *     )
	 */
	protected void sequence_VSVSDocument(ISerializationContext context, VSVSDocument semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     VSVSFixedSection returns VSVSFixedSection
	 *
	 * Constraint:
	 *     (body=DBody? svsInstatiableSubsections+=VSVSInstantiableSection*)
	 */
	protected void sequence_VSVSFixedSection(ISerializationContext context, VSVSFixedSection semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     VSVSInstantiableSection returns VSVSInstantiableSection
	 *
	 * Constraint:
	 *     (name=STRING body=DBody? svsInstatiableSubsections+=VSVSInstantiableSection*)
	 */
	protected void sequence_VSVSInstantiableSection(ISerializationContext context, VSVSInstantiableSection semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     VSVSIntroduction returns VSVSIntroduction
	 *
	 * Constraint:
	 *     svsInstatiableSubsections+=VSVSInstantiableSection+
	 */
	protected void sequence_VSVSIntroduction(ISerializationContext context, VSVSIntroduction semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     VSVSProcedureStep returns VSVSProcedureStep
	 *
	 * Constraint:
	 *     (
	 *         name=STRING 
	 *         (prev_step=[VSVSProcedureStep|STRING] prev_tm_from_prev_step=[VSVSStepTelemetry|STRING])? 
	 *         replays=UINT_STRING? 
	 *         configurations=VSVSStepConfigurations? 
	 *         inputs=VSVSStepInputs 
	 *         outputs=VSVSStepOutputs?
	 *     )
	 */
	protected void sequence_VSVSProcedureStep(ISerializationContext context, VSVSProcedureStep semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     VSVSProcedureSteps returns VSVSProcedureSteps
	 *
	 * Constraint:
	 *     step+=VSVSProcedureStep+
	 */
	protected void sequence_VSVSProcedureSteps(ISerializationContext context, VSVSProcedureSteps semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     VSVSReferenceDocuments returns VSVSReferenceDocuments
	 *
	 * Constraint:
	 *     referenceDocuments+=DReferenceDocument*
	 */
	protected void sequence_VSVSReferenceDocuments(ISerializationContext context, VSVSReferenceDocuments semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     VSVSSoftwareOverview returns VSVSSoftwareOverview
	 *
	 * Constraint:
	 *     (body=DBody? svsInstatiableSubsections+=VSVSInstantiableSection*)
	 */
	protected void sequence_VSVSSoftwareOverview(ISerializationContext context, VSVSSoftwareOverview semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     VSVSStepInputs returns VSVSStepAction
	 *     VSVSStepAction returns VSVSStepAction
	 *
	 * Constraint:
	 *     (selectedAction=[VTestSetupAction|STRING] (delay_value=UINT_STRING delay_unit=VSVSTimeUnit)? (span_value=UINT_STRING span_unit=VSVSTimeUnit)?)
	 */
	protected void sequence_VSVSStepAction(ISerializationContext context, VSVSStepAction semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     VSVSStepConfiguration returns VSVSStepConfiguration
	 *
	 * Constraint:
	 *     (configuration=[VTestSetupPacketConfiguration|STRING] filterStatus=VTestSetupConfigurationStatus? printStatus=VTestSetupConfigurationStatus?)
	 */
	protected void sequence_VSVSStepConfiguration(ISerializationContext context, VSVSStepConfiguration semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     VSVSStepConfigurations returns VSVSStepConfigurations
	 *
	 * Constraint:
	 *     configuration+=VSVSStepConfiguration+
	 */
	protected void sequence_VSVSStepConfigurations(ISerializationContext context, VSVSStepConfigurations semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     VSVSStepTelecommandDataField returns VSVSStepTelecommandDataField
	 *
	 * Constraint:
	 *     (fieldRef=[TMTCIFTCField|STRING] value=TMTCIFFieldValueTC)
	 */
	protected void sequence_VSVSStepTelecommandDataField(ISerializationContext context, VSVSStepTelecommandDataField semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, svsPackage.Literals.VSVS_STEP_TELECOMMAND_DATA_FIELD__FIELD_REF) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, svsPackage.Literals.VSVS_STEP_TELECOMMAND_DATA_FIELD__FIELD_REF));
			if (transientValues.isValueTransient(semanticObject, svsPackage.Literals.VSVS_STEP_TELECOMMAND_DATA_FIELD__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, svsPackage.Literals.VSVS_STEP_TELECOMMAND_DATA_FIELD__VALUE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getVSVSStepTelecommandDataFieldAccess().getFieldRefTMTCIFTCFieldSTRINGTerminalRuleCall_2_0_1(), semanticObject.getFieldRef());
		feeder.accept(grammarAccess.getVSVSStepTelecommandDataFieldAccess().getValueTMTCIFFieldValueTCParserRuleCall_4_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     VSVSStepTelecommandData returns VSVSStepTelecommandData
	 *
	 * Constraint:
	 *     (tcTemplate=[VTCTemplate|STRING] fields+=VSVSStepTelecommandDataField*)
	 */
	protected void sequence_VSVSStepTelecommandData(ISerializationContext context, VSVSStepTelecommandData semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     VSVSStepTelecommandHeaderField returns VSVSStepTelecommandHeaderField
	 *
	 * Constraint:
	 *     (fieldRef=[TMTCIFTCHeaderField|STRING] value=TMTCIFFieldValueHeader)
	 */
	protected void sequence_VSVSStepTelecommandHeaderField(ISerializationContext context, VSVSStepTelecommandHeaderField semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, svsPackage.Literals.VSVS_STEP_TELECOMMAND_HEADER_FIELD__FIELD_REF) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, svsPackage.Literals.VSVS_STEP_TELECOMMAND_HEADER_FIELD__FIELD_REF));
			if (transientValues.isValueTransient(semanticObject, svsPackage.Literals.VSVS_STEP_TELECOMMAND_HEADER_FIELD__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, svsPackage.Literals.VSVS_STEP_TELECOMMAND_HEADER_FIELD__VALUE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getVSVSStepTelecommandHeaderFieldAccess().getFieldRefTMTCIFTCHeaderFieldSTRINGTerminalRuleCall_2_0_1(), semanticObject.getFieldRef());
		feeder.accept(grammarAccess.getVSVSStepTelecommandHeaderFieldAccess().getValueTMTCIFFieldValueHeaderParserRuleCall_4_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     VSVSStepTelecommandHeader returns VSVSStepTelecommandHeader
	 *
	 * Constraint:
	 *     fields+=VSVSStepTelecommandHeaderField+
	 */
	protected void sequence_VSVSStepTelecommandHeader(ISerializationContext context, VSVSStepTelecommandHeader semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     VSVSStepInputs returns VSVSStepTelecommandSequence
	 *     VSVSStepTelecommandSequence returns VSVSStepTelecommandSequence
	 *
	 * Constraint:
	 *     telecommand+=VSVSStepTelecommand+
	 */
	protected void sequence_VSVSStepTelecommandSequence(ISerializationContext context, VSVSStepTelecommandSequence semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     VSVSStepTelecommand returns VSVSStepTelecommand
	 *
	 * Constraint:
	 *     (
	 *         name=STRING 
	 *         interface=[VTestSetupSupportedInterface|STRING] 
	 *         (delay_value=UINT_STRING delay_unit=VSVSTimeUnit)? 
	 *         tcData=VSVSStepTelecommandData 
	 *         tcHeader=VSVSStepTelecommandHeader?
	 *     )
	 */
	protected void sequence_VSVSStepTelecommand(ISerializationContext context, VSVSStepTelecommand semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     VSVSStepTelemetryDataField returns VSVSStepTelemetryDataField
	 *
	 * Constraint:
	 *     (fieldRef=[TMTCIFTMField|STRING] value=TMTCIFFieldValueTM)
	 */
	protected void sequence_VSVSStepTelemetryDataField(ISerializationContext context, VSVSStepTelemetryDataField semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, svsPackage.Literals.VSVS_STEP_TELEMETRY_DATA_FIELD__FIELD_REF) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, svsPackage.Literals.VSVS_STEP_TELEMETRY_DATA_FIELD__FIELD_REF));
			if (transientValues.isValueTransient(semanticObject, svsPackage.Literals.VSVS_STEP_TELEMETRY_DATA_FIELD__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, svsPackage.Literals.VSVS_STEP_TELEMETRY_DATA_FIELD__VALUE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getVSVSStepTelemetryDataFieldAccess().getFieldRefTMTCIFTMFieldSTRINGTerminalRuleCall_2_0_1(), semanticObject.getFieldRef());
		feeder.accept(grammarAccess.getVSVSStepTelemetryDataFieldAccess().getValueTMTCIFFieldValueTMParserRuleCall_4_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     VSVSStepTelemetryData returns VSVSStepTelemetryData
	 *
	 * Constraint:
	 *     (tmTemplate=[VTMTemplate|STRING] fields+=VSVSStepTelemetryDataField*)
	 */
	protected void sequence_VSVSStepTelemetryData(ISerializationContext context, VSVSStepTelemetryData semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     VSVSStepTelemetryHeaderField returns VSVSStepTelemetryHeaderField
	 *
	 * Constraint:
	 *     (fieldRef=[TMTCIFTMHeaderField|STRING] value=TMTCIFFieldValueRaw)
	 */
	protected void sequence_VSVSStepTelemetryHeaderField(ISerializationContext context, VSVSStepTelemetryHeaderField semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, svsPackage.Literals.VSVS_STEP_TELEMETRY_HEADER_FIELD__FIELD_REF) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, svsPackage.Literals.VSVS_STEP_TELEMETRY_HEADER_FIELD__FIELD_REF));
			if (transientValues.isValueTransient(semanticObject, svsPackage.Literals.VSVS_STEP_TELEMETRY_HEADER_FIELD__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, svsPackage.Literals.VSVS_STEP_TELEMETRY_HEADER_FIELD__VALUE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getVSVSStepTelemetryHeaderFieldAccess().getFieldRefTMTCIFTMHeaderFieldSTRINGTerminalRuleCall_2_0_1(), semanticObject.getFieldRef());
		feeder.accept(grammarAccess.getVSVSStepTelemetryHeaderFieldAccess().getValueTMTCIFFieldValueRawParserRuleCall_4_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     VSVSStepTelemetryHeader returns VSVSStepTelemetryHeader
	 *
	 * Constraint:
	 *     fields+=VSVSStepTelemetryHeaderField+
	 */
	protected void sequence_VSVSStepTelemetryHeader(ISerializationContext context, VSVSStepTelemetryHeader semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     VSVSStepOutputs returns VSVSStepTelemetrySet
	 *     VSVSStepTelemetrySet returns VSVSStepTelemetrySet
	 *
	 * Constraint:
	 *     (
	 *         checkmode=VSVSStepTelemetrySetCheckmode 
	 *         valid_time_interval_value=UINT_STRING 
	 *         valid_time_interval_unit=VSVSTimeUnit 
	 *         telemetry+=VSVSStepTelemetry+
	 *     )
	 */
	protected void sequence_VSVSStepTelemetrySet(ISerializationContext context, VSVSStepTelemetrySet semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     VSVSStepTelemetry returns VSVSStepTelemetry
	 *
	 * Constraint:
	 *     (name=STRING interface=[VTestSetupSupportedInterface|STRING] tmData=VSVSStepTelemetryData tmHeader=VSVSStepTelemetryHeader?)
	 */
	protected void sequence_VSVSStepTelemetry(ISerializationContext context, VSVSStepTelemetry semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     VSVSTaskIdentification returns VSVSTaskIdentification
	 *
	 * Constraint:
	 *     (
	 *         taskCriteria=VSVSFixedSection 
	 *         featuresToBeTested=VSVSFixedSection 
	 *         featuresNotToBeTested=VSVSFixedSection 
	 *         testPassFailCriteria=VSVSFixedSection 
	 *         itemsCanNotBeValidated=VSVSFixedSection 
	 *         manuallyAutoGeneratedCode=VSVSFixedSection
	 *     )
	 */
	protected void sequence_VSVSTaskIdentification(ISerializationContext context, VSVSTaskIdentification semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, svsPackage.Literals.VSVS_TASK_IDENTIFICATION__TASK_CRITERIA) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, svsPackage.Literals.VSVS_TASK_IDENTIFICATION__TASK_CRITERIA));
			if (transientValues.isValueTransient(semanticObject, svsPackage.Literals.VSVS_TASK_IDENTIFICATION__FEATURES_TO_BE_TESTED) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, svsPackage.Literals.VSVS_TASK_IDENTIFICATION__FEATURES_TO_BE_TESTED));
			if (transientValues.isValueTransient(semanticObject, svsPackage.Literals.VSVS_TASK_IDENTIFICATION__FEATURES_NOT_TO_BE_TESTED) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, svsPackage.Literals.VSVS_TASK_IDENTIFICATION__FEATURES_NOT_TO_BE_TESTED));
			if (transientValues.isValueTransient(semanticObject, svsPackage.Literals.VSVS_TASK_IDENTIFICATION__TEST_PASS_FAIL_CRITERIA) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, svsPackage.Literals.VSVS_TASK_IDENTIFICATION__TEST_PASS_FAIL_CRITERIA));
			if (transientValues.isValueTransient(semanticObject, svsPackage.Literals.VSVS_TASK_IDENTIFICATION__ITEMS_CAN_NOT_BE_VALIDATED) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, svsPackage.Literals.VSVS_TASK_IDENTIFICATION__ITEMS_CAN_NOT_BE_VALIDATED));
			if (transientValues.isValueTransient(semanticObject, svsPackage.Literals.VSVS_TASK_IDENTIFICATION__MANUALLY_AUTO_GENERATED_CODE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, svsPackage.Literals.VSVS_TASK_IDENTIFICATION__MANUALLY_AUTO_GENERATED_CODE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getVSVSTaskIdentificationAccess().getTaskCriteriaVSVSFixedSectionParserRuleCall_2_0(), semanticObject.getTaskCriteria());
		feeder.accept(grammarAccess.getVSVSTaskIdentificationAccess().getFeaturesToBeTestedVSVSFixedSectionParserRuleCall_5_0(), semanticObject.getFeaturesToBeTested());
		feeder.accept(grammarAccess.getVSVSTaskIdentificationAccess().getFeaturesNotToBeTestedVSVSFixedSectionParserRuleCall_8_0(), semanticObject.getFeaturesNotToBeTested());
		feeder.accept(grammarAccess.getVSVSTaskIdentificationAccess().getTestPassFailCriteriaVSVSFixedSectionParserRuleCall_11_0(), semanticObject.getTestPassFailCriteria());
		feeder.accept(grammarAccess.getVSVSTaskIdentificationAccess().getItemsCanNotBeValidatedVSVSFixedSectionParserRuleCall_14_0(), semanticObject.getItemsCanNotBeValidated());
		feeder.accept(grammarAccess.getVSVSTaskIdentificationAccess().getManuallyAutoGeneratedCodeVSVSFixedSectionParserRuleCall_17_0(), semanticObject.getManuallyAutoGeneratedCode());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     VSVSTerm returns VSVSTerm
	 *
	 * Constraint:
	 *     (name=STRING description=DRun)
	 */
	protected void sequence_VSVSTerm(ISerializationContext context, VSVSTerm semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, svsPackage.Literals.VSVS_ABSTRACT_BRIEF_DESCRIPTION__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, svsPackage.Literals.VSVS_ABSTRACT_BRIEF_DESCRIPTION__NAME));
			if (transientValues.isValueTransient(semanticObject, svsPackage.Literals.VSVS_ABSTRACT_BRIEF_DESCRIPTION__DESCRIPTION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, svsPackage.Literals.VSVS_ABSTRACT_BRIEF_DESCRIPTION__DESCRIPTION));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getVSVSTermAccess().getNameSTRINGTerminalRuleCall_2_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getVSVSTermAccess().getDescriptionDRunParserRuleCall_4_0(), semanticObject.getDescription());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     VSVSTermsDefinitionsAbbreviations returns VSVSTermsDefinitionsAbbreviations
	 *
	 * Constraint:
	 *     (terms+=VSVSTerm* definitions+=VSVSDefinition* abbreviations+=VSVSAbbreviation*)
	 */
	protected void sequence_VSVSTermsDefinitionsAbbreviations(ISerializationContext context, VSVSTermsDefinitionsAbbreviations semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     VSVSTestCase returns VSVSTestCase
	 *
	 * Constraint:
	 *     (
	 *         name=STRING 
	 *         identifier=VSVSTestInfo 
	 *         inputs=VSVSTestInfo 
	 *         outputs=VSVSTestInfo 
	 *         passFailCriteria=VSVSTestInfo 
	 *         environmentalNeeds=VSVSTestInfo 
	 *         specialConstraints=VSVSTestInfo 
	 *         interfaceDependencies=VSVSTestInfo 
	 *         validatingItem+=[VTraceableDocumentAbstractItem|STRING]+
	 *     )
	 */
	protected void sequence_VSVSTestCase(ISerializationContext context, VSVSTestCase semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     VSVSTestCases returns VSVSTestCases
	 *
	 * Constraint:
	 *     (general=VSVSFixedSection testCases+=VSVSTestCase+)
	 */
	protected void sequence_VSVSTestCases(ISerializationContext context, VSVSTestCases semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     VSVSTestDesign returns VSVSTestDesign
	 *
	 * Constraint:
	 *     (name=STRING general=VSVSFixedSection featuresToBeTested=VSVSFixedSection approachRefinements=VSVSFixedSection)
	 */
	protected void sequence_VSVSTestDesign(ISerializationContext context, VSVSTestDesign semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, svsPackage.Literals.VSVS_TEST_DESIGN__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, svsPackage.Literals.VSVS_TEST_DESIGN__NAME));
			if (transientValues.isValueTransient(semanticObject, svsPackage.Literals.VSVS_TEST_DESIGN__GENERAL) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, svsPackage.Literals.VSVS_TEST_DESIGN__GENERAL));
			if (transientValues.isValueTransient(semanticObject, svsPackage.Literals.VSVS_TEST_DESIGN__FEATURES_TO_BE_TESTED) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, svsPackage.Literals.VSVS_TEST_DESIGN__FEATURES_TO_BE_TESTED));
			if (transientValues.isValueTransient(semanticObject, svsPackage.Literals.VSVS_TEST_DESIGN__APPROACH_REFINEMENTS) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, svsPackage.Literals.VSVS_TEST_DESIGN__APPROACH_REFINEMENTS));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getVSVSTestDesignAccess().getNameSTRINGTerminalRuleCall_2_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getVSVSTestDesignAccess().getGeneralVSVSFixedSectionParserRuleCall_5_0(), semanticObject.getGeneral());
		feeder.accept(grammarAccess.getVSVSTestDesignAccess().getFeaturesToBeTestedVSVSFixedSectionParserRuleCall_8_0(), semanticObject.getFeaturesToBeTested());
		feeder.accept(grammarAccess.getVSVSTestDesignAccess().getApproachRefinementsVSVSFixedSectionParserRuleCall_11_0(), semanticObject.getApproachRefinements());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     VSVSTestInfo returns VSVSTestInfo
	 *
	 * Constraint:
	 *     body=DBody?
	 */
	protected void sequence_VSVSTestInfo(ISerializationContext context, VSVSTestInfo semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     VSVSTestPlatformRequirements returns VSVSTestPlatformRequirements
	 *
	 * Constraint:
	 *     (body=DBody? svsInstatiableSubsections+=VSVSInstantiableSection*)
	 */
	protected void sequence_VSVSTestPlatformRequirements(ISerializationContext context, VSVSTestPlatformRequirements semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     VSVSTestProcedure returns VSVSTestProcedure
	 *
	 * Constraint:
	 *     (
	 *         name=STRING 
	 *         identifier=VSVSTestInfo 
	 *         purpose=VSVSTestInfo 
	 *         scenario=[VTestSetupScenarioSection|STRING] 
	 *         testCase+=[VSVSTestCase|STRING]+ 
	 *         procedureSteps=VSVSProcedureSteps 
	 *         testScript=VSVSTestInfo
	 *     )
	 */
	protected void sequence_VSVSTestProcedure(ISerializationContext context, VSVSTestProcedure semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     VSVSTestProcedures returns VSVSTestProcedures
	 *
	 * Constraint:
	 *     (general=VSVSFixedSection testProcedures+=VSVSTestProcedure+)
	 */
	protected void sequence_VSVSTestProcedures(ISerializationContext context, VSVSTestProcedures semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     VSVSTestingSpecificationDesign returns VSVSTestingSpecificationDesign
	 *
	 * Constraint:
	 *     (testSetup=[VTestSetupDocument|STRING] general=VSVSFixedSection testDesigns+=VSVSTestDesign+)
	 */
	protected void sequence_VSVSTestingSpecificationDesign(ISerializationContext context, VSVSTestingSpecificationDesign semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
}
