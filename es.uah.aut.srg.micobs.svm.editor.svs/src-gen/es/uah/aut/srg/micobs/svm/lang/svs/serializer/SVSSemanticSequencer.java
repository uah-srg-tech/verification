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
import es.uah.aut.srg.micobs.doctpl.doc.DApplicableDocument;
import es.uah.aut.srg.micobs.doctpl.doc.DBasicTable;
import es.uah.aut.srg.micobs.doctpl.doc.DBody;
import es.uah.aut.srg.micobs.doctpl.doc.DCell;
import es.uah.aut.srg.micobs.doctpl.doc.DColumn;
import es.uah.aut.srg.micobs.doctpl.doc.DEnumerate;
import es.uah.aut.srg.micobs.doctpl.doc.DFigureFromFile;
import es.uah.aut.srg.micobs.doctpl.doc.DHyperlink;
import es.uah.aut.srg.micobs.doctpl.doc.DItemize;
import es.uah.aut.srg.micobs.doctpl.doc.DListItem;
import es.uah.aut.srg.micobs.doctpl.doc.DParagraph;
import es.uah.aut.srg.micobs.doctpl.doc.DReferenceDocument;
import es.uah.aut.srg.micobs.doctpl.doc.DRow;
import es.uah.aut.srg.micobs.doctpl.doc.DRun;
import es.uah.aut.srg.micobs.doctpl.doc.DTableFromFile;
import es.uah.aut.srg.micobs.doctpl.doc.DText;
import es.uah.aut.srg.micobs.doctpl.doc.docPackage;
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
import es.uah.aut.srg.micobs.svm.svs.VSVSReferenceDocuments;
import es.uah.aut.srg.micobs.svm.svs.VSVSSoftwareOverview;
import es.uah.aut.srg.micobs.svm.svs.VSVSTaskIdentification;
import es.uah.aut.srg.micobs.svm.svs.VSVSTerm;
import es.uah.aut.srg.micobs.svm.svs.VSVSTermsDefinitionsAbbreviations;
import es.uah.aut.srg.micobs.svm.svs.VSVSTestCase;
import es.uah.aut.srg.micobs.svm.svs.VSVSTestCases;
import es.uah.aut.srg.micobs.svm.svs.VSVSTestDesign;
import es.uah.aut.srg.micobs.svm.svs.VSVSTestPlatformRequirements;
import es.uah.aut.srg.micobs.svm.svs.VSVSTestProcedure;
import es.uah.aut.srg.micobs.svm.svs.VSVSTestProcedures;
import es.uah.aut.srg.micobs.svm.svs.VSVSTestingSpecificationDesign;
import es.uah.aut.srg.micobs.svm.svs.svsPackage;
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
		if (epackage == docPackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case docPackage.DAPPLICABLE_DOCUMENT:
				sequence_DApplicableDocument(context, (DApplicableDocument) semanticObject); 
				return; 
			case docPackage.DBASIC_TABLE:
				sequence_DBasicTable(context, (DBasicTable) semanticObject); 
				return; 
			case docPackage.DBODY:
				sequence_DBody(context, (DBody) semanticObject); 
				return; 
			case docPackage.DCELL:
				sequence_DCell(context, (DCell) semanticObject); 
				return; 
			case docPackage.DCOLUMN:
				sequence_DColumn(context, (DColumn) semanticObject); 
				return; 
			case docPackage.DENUMERATE:
				sequence_DEnumerate(context, (DEnumerate) semanticObject); 
				return; 
			case docPackage.DFIGURE_FROM_FILE:
				sequence_DFigureFromFile(context, (DFigureFromFile) semanticObject); 
				return; 
			case docPackage.DHYPERLINK:
				sequence_DHyperlink(context, (DHyperlink) semanticObject); 
				return; 
			case docPackage.DITEMIZE:
				sequence_DItemize(context, (DItemize) semanticObject); 
				return; 
			case docPackage.DLIST_ITEM:
				sequence_DListItem(context, (DListItem) semanticObject); 
				return; 
			case docPackage.DPARAGRAPH:
				sequence_DParagraph(context, (DParagraph) semanticObject); 
				return; 
			case docPackage.DREFERENCE_DOCUMENT:
				sequence_DReferenceDocument(context, (DReferenceDocument) semanticObject); 
				return; 
			case docPackage.DROW:
				sequence_DRow(context, (DRow) semanticObject); 
				return; 
			case docPackage.DRUN:
				sequence_DRun(context, (DRun) semanticObject); 
				return; 
			case docPackage.DTABLE_FROM_FILE:
				sequence_DTableFromFile(context, (DTableFromFile) semanticObject); 
				return; 
			case docPackage.DTEXT:
				sequence_DText(context, (DText) semanticObject); 
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
			case svsPackage.VSVS_REFERENCE_DOCUMENTS:
				sequence_VSVSReferenceDocuments(context, (VSVSReferenceDocuments) semanticObject); 
				return; 
			case svsPackage.VSVS_SOFTWARE_OVERVIEW:
				sequence_VSVSSoftwareOverview(context, (VSVSSoftwareOverview) semanticObject); 
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
	 *     (name=STRING title=STRING id=STRING (issue=STRING revision=STRING)? date=STRING?)
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
	 *     (name=STRING caption=STRING? rows+=DRow+)
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
	 *     bodyContent+=DBodyContent+
	 */
	protected void sequence_DCell(ISerializationContext context, DCell semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     DColumn returns DColumn
	 *
	 * Constraint:
	 *     (span=STRING cells+=DCell+)
	 */
	protected void sequence_DColumn(ISerializationContext context, DColumn semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     DBodyContent returns DEnumerate
	 *     DListContent returns DEnumerate
	 *     DEnumerate returns DEnumerate
	 *
	 * Constraint:
	 *     items+=DListItem+
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
	 *     (name=STRING referenceFile=STRING caption=STRING?)
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
	 *     items+=DListItem+
	 */
	protected void sequence_DItemize(ISerializationContext context, DItemize semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     DListItem returns DListItem
	 *
	 * Constraint:
	 *     (paragraph+=DParagraph+ sublist=DListContent?)
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
	 *     paragraphContent+=DParagraphContent+
	 */
	protected void sequence_DParagraph(ISerializationContext context, DParagraph semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     DReferenceDocument returns DReferenceDocument
	 *
	 * Constraint:
	 *     (name=STRING title=STRING id=STRING (issue=STRING revision=STRING)? date=STRING?)
	 */
	protected void sequence_DReferenceDocument(ISerializationContext context, DReferenceDocument semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     DRow returns DRow
	 *
	 * Constraint:
	 *     (span=STRING columns+=DColumn+)
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
	 *     text=DText
	 */
	protected void sequence_DRun(ISerializationContext context, DRun semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, docPackage.Literals.DRUN__TEXT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, docPackage.Literals.DRUN__TEXT));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getDRunAccess().getTextDTextParserRuleCall_5_0(), semanticObject.getText());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     DBodyContent returns DTableFromFile
	 *     DTableFromFile returns DTableFromFile
	 *
	 * Constraint:
	 *     (name=STRING referenceFile=STRING caption=STRING?)
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
			if (transientValues.isValueTransient(semanticObject, docPackage.Literals.DTEXT__CONTENT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, docPackage.Literals.DTEXT__CONTENT));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getDTextAccess().getContentRUNTEXTTerminalRuleCall_0(), semanticObject.getContent());
		feeder.finish();
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
	 *         issue=STRING 
	 *         revision=STRING 
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
	 *     {VSVSProcedureStep}
	 */
	protected void sequence_VSVSProcedureStep(ISerializationContext context, VSVSProcedureStep semanticObject) {
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
	 *         identifier=VSVSFixedSection 
	 *         inputs=VSVSFixedSection 
	 *         outputs=VSVSFixedSection 
	 *         passFailCriteria=VSVSFixedSection 
	 *         environmentalNeeds=VSVSFixedSection 
	 *         specialConstraints=VSVSFixedSection 
	 *         interfaceDependencies=VSVSFixedSection 
	 *         validatingItems+=[VTraceableDocumentAbstractItem|STRING]+
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
	 *     (name=STRING identifier=VSVSFixedSection purpose=VSVSFixedSection steps+=VSVSProcedureStep testScript=VSVSFixedSection)
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
	 *     (general=VSVSFixedSection testDesigns+=VSVSTestDesign+)
	 */
	protected void sequence_VSVSTestingSpecificationDesign(ISerializationContext context, VSVSTestingSpecificationDesign semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
}
