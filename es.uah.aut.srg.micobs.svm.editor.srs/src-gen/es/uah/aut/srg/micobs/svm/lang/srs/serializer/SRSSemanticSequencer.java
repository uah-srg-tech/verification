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
package es.uah.aut.srg.micobs.svm.lang.srs.serializer;

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
import es.uah.aut.srg.micobs.svm.lang.srs.services.SRSGrammarAccess;
import es.uah.aut.srg.micobs.svm.srs.VSRSAbbreviation;
import es.uah.aut.srg.micobs.svm.srs.VSRSAdaptationInstallationRequirements;
import es.uah.aut.srg.micobs.svm.srs.VSRSApplicableDocuments;
import es.uah.aut.srg.micobs.svm.srs.VSRSDataDefinitionDBRequirements;
import es.uah.aut.srg.micobs.svm.srs.VSRSDefinition;
import es.uah.aut.srg.micobs.svm.srs.VSRSDesignRequirements;
import es.uah.aut.srg.micobs.svm.srs.VSRSDocument;
import es.uah.aut.srg.micobs.svm.srs.VSRSDocumentItem;
import es.uah.aut.srg.micobs.svm.srs.VSRSFixedSection;
import es.uah.aut.srg.micobs.svm.srs.VSRSFunctionalRequirements;
import es.uah.aut.srg.micobs.svm.srs.VSRSGeneralRequirements;
import es.uah.aut.srg.micobs.svm.srs.VSRSHumanFactorsRequirements;
import es.uah.aut.srg.micobs.svm.srs.VSRSInstantiableRequirementSection;
import es.uah.aut.srg.micobs.svm.srs.VSRSInstantiableSection;
import es.uah.aut.srg.micobs.svm.srs.VSRSInterfaceRequirements;
import es.uah.aut.srg.micobs.svm.srs.VSRSIntroduction;
import es.uah.aut.srg.micobs.svm.srs.VSRSLogicalModel;
import es.uah.aut.srg.micobs.svm.srs.VSRSLogicalModels;
import es.uah.aut.srg.micobs.svm.srs.VSRSOperationalRequirements;
import es.uah.aut.srg.micobs.svm.srs.VSRSPerformanceRequirements;
import es.uah.aut.srg.micobs.svm.srs.VSRSPortabilityRequirements;
import es.uah.aut.srg.micobs.svm.srs.VSRSReferenceDocuments;
import es.uah.aut.srg.micobs.svm.srs.VSRSRequirements;
import es.uah.aut.srg.micobs.svm.srs.VSRSResourcesRequirements;
import es.uah.aut.srg.micobs.svm.srs.VSRSSWConfigurationDeliveryRequirements;
import es.uah.aut.srg.micobs.svm.srs.VSRSSWMaintainabilityRequirements;
import es.uah.aut.srg.micobs.svm.srs.VSRSSWQualityRequirements;
import es.uah.aut.srg.micobs.svm.srs.VSRSSWReliabiltyRequirements;
import es.uah.aut.srg.micobs.svm.srs.VSRSSWSafetyRequirements;
import es.uah.aut.srg.micobs.svm.srs.VSRSSecurityPrivacyRequirements;
import es.uah.aut.srg.micobs.svm.srs.VSRSSoftwareOverview;
import es.uah.aut.srg.micobs.svm.srs.VSRSTerm;
import es.uah.aut.srg.micobs.svm.srs.VSRSTermsDefinitionsAbbreviations;
import es.uah.aut.srg.micobs.svm.srs.srsPackage;
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
public class SRSSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private SRSGrammarAccess grammarAccess;
	
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
		else if (epackage == srsPackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case srsPackage.VSRS_ABBREVIATION:
				sequence_VSRSAbbreviation(context, (VSRSAbbreviation) semanticObject); 
				return; 
			case srsPackage.VSRS_ADAPTATION_INSTALLATION_REQUIREMENTS:
				sequence_VSRSAdaptationInstallationRequirements(context, (VSRSAdaptationInstallationRequirements) semanticObject); 
				return; 
			case srsPackage.VSRS_APPLICABLE_DOCUMENTS:
				sequence_VSRSApplicableDocuments(context, (VSRSApplicableDocuments) semanticObject); 
				return; 
			case srsPackage.VSRS_DATA_DEFINITION_DB_REQUIREMENTS:
				sequence_VSRSDataDefinitionDBRequirements(context, (VSRSDataDefinitionDBRequirements) semanticObject); 
				return; 
			case srsPackage.VSRS_DEFINITION:
				sequence_VSRSDefinition(context, (VSRSDefinition) semanticObject); 
				return; 
			case srsPackage.VSRS_DESIGN_REQUIREMENTS:
				sequence_VSRSDesignRequirements(context, (VSRSDesignRequirements) semanticObject); 
				return; 
			case srsPackage.VSRS_DOCUMENT:
				sequence_VSRSDocument(context, (VSRSDocument) semanticObject); 
				return; 
			case srsPackage.VSRS_DOCUMENT_ITEM:
				sequence_VSRSDocumentItem(context, (VSRSDocumentItem) semanticObject); 
				return; 
			case srsPackage.VSRS_FIXED_SECTION:
				sequence_VSRSFixedSection(context, (VSRSFixedSection) semanticObject); 
				return; 
			case srsPackage.VSRS_FUNCTIONAL_REQUIREMENTS:
				sequence_VSRSFunctionalRequirements(context, (VSRSFunctionalRequirements) semanticObject); 
				return; 
			case srsPackage.VSRS_GENERAL_REQUIREMENTS:
				sequence_VSRSGeneralRequirements(context, (VSRSGeneralRequirements) semanticObject); 
				return; 
			case srsPackage.VSRS_HUMAN_FACTORS_REQUIREMENTS:
				sequence_VSRSHumanFactorsRequirements(context, (VSRSHumanFactorsRequirements) semanticObject); 
				return; 
			case srsPackage.VSRS_INSTANTIABLE_REQUIREMENT_SECTION:
				sequence_VSRSInstantiableRequirementSection(context, (VSRSInstantiableRequirementSection) semanticObject); 
				return; 
			case srsPackage.VSRS_INSTANTIABLE_SECTION:
				sequence_VSRSInstantiableSection(context, (VSRSInstantiableSection) semanticObject); 
				return; 
			case srsPackage.VSRS_INTERFACE_REQUIREMENTS:
				sequence_VSRSInterfaceRequirements(context, (VSRSInterfaceRequirements) semanticObject); 
				return; 
			case srsPackage.VSRS_INTRODUCTION:
				sequence_VSRSIntroduction(context, (VSRSIntroduction) semanticObject); 
				return; 
			case srsPackage.VSRS_LOGICAL_MODEL:
				sequence_VSRSLogicalModel(context, (VSRSLogicalModel) semanticObject); 
				return; 
			case srsPackage.VSRS_LOGICAL_MODELS:
				sequence_VSRSLogicalModels(context, (VSRSLogicalModels) semanticObject); 
				return; 
			case srsPackage.VSRS_OPERATIONAL_REQUIREMENTS:
				sequence_VSRSOperationalRequirements(context, (VSRSOperationalRequirements) semanticObject); 
				return; 
			case srsPackage.VSRS_PERFORMANCE_REQUIREMENTS:
				sequence_VSRSPerformanceRequirements(context, (VSRSPerformanceRequirements) semanticObject); 
				return; 
			case srsPackage.VSRS_PORTABILITY_REQUIREMENTS:
				sequence_VSRSPortabilityRequirements(context, (VSRSPortabilityRequirements) semanticObject); 
				return; 
			case srsPackage.VSRS_REFERENCE_DOCUMENTS:
				sequence_VSRSReferenceDocuments(context, (VSRSReferenceDocuments) semanticObject); 
				return; 
			case srsPackage.VSRS_REQUIREMENTS:
				sequence_VSRSRequirements(context, (VSRSRequirements) semanticObject); 
				return; 
			case srsPackage.VSRS_RESOURCES_REQUIREMENTS:
				sequence_VSRSResourcesRequirements(context, (VSRSResourcesRequirements) semanticObject); 
				return; 
			case srsPackage.VSRSSW_CONFIGURATION_DELIVERY_REQUIREMENTS:
				sequence_VSRSSWConfigurationDeliveryRequirements(context, (VSRSSWConfigurationDeliveryRequirements) semanticObject); 
				return; 
			case srsPackage.VSRSSW_MAINTAINABILITY_REQUIREMENTS:
				sequence_VSRSSWMaintainabilityRequirements(context, (VSRSSWMaintainabilityRequirements) semanticObject); 
				return; 
			case srsPackage.VSRSSW_QUALITY_REQUIREMENTS:
				sequence_VSRSSWQualityRequirements(context, (VSRSSWQualityRequirements) semanticObject); 
				return; 
			case srsPackage.VSRSSW_RELIABILTY_REQUIREMENTS:
				sequence_VSRSSWReliabiltyRequirements(context, (VSRSSWReliabiltyRequirements) semanticObject); 
				return; 
			case srsPackage.VSRSSW_SAFETY_REQUIREMENTS:
				sequence_VSRSSWSafetyRequirements(context, (VSRSSWSafetyRequirements) semanticObject); 
				return; 
			case srsPackage.VSRS_SECURITY_PRIVACY_REQUIREMENTS:
				sequence_VSRSSecurityPrivacyRequirements(context, (VSRSSecurityPrivacyRequirements) semanticObject); 
				return; 
			case srsPackage.VSRS_SOFTWARE_OVERVIEW:
				sequence_VSRSSoftwareOverview(context, (VSRSSoftwareOverview) semanticObject); 
				return; 
			case srsPackage.VSRS_TERM:
				sequence_VSRSTerm(context, (VSRSTerm) semanticObject); 
				return; 
			case srsPackage.VSRS_TERMS_DEFINITIONS_ABBREVIATIONS:
				sequence_VSRSTermsDefinitionsAbbreviations(context, (VSRSTermsDefinitionsAbbreviations) semanticObject); 
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
	 *     (span=UINT_STRING bodyContent+=DBodyContent+)
	 */
	protected void sequence_DCell(ISerializationContext context, DCell semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     DColumn returns DColumn
	 *
	 * Constraint:
	 *     (span=UINT_STRING cells+=DCell+)
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
	 *     (span=UINT_STRING columns+=DColumn+)
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
	 *     VSRSAbbreviation returns VSRSAbbreviation
	 *
	 * Constraint:
	 *     (name=STRING description=DRun)
	 */
	protected void sequence_VSRSAbbreviation(ISerializationContext context, VSRSAbbreviation semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, srsPackage.Literals.VSRS_ABSTRACT_BRIEF_DESCRIPTION__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, srsPackage.Literals.VSRS_ABSTRACT_BRIEF_DESCRIPTION__NAME));
			if (transientValues.isValueTransient(semanticObject, srsPackage.Literals.VSRS_ABSTRACT_BRIEF_DESCRIPTION__DESCRIPTION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, srsPackage.Literals.VSRS_ABSTRACT_BRIEF_DESCRIPTION__DESCRIPTION));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getVSRSAbbreviationAccess().getNameSTRINGTerminalRuleCall_2_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getVSRSAbbreviationAccess().getDescriptionDRunParserRuleCall_4_0(), semanticObject.getDescription());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     VSRSAdaptationInstallationRequirements returns VSRSAdaptationInstallationRequirements
	 *
	 * Constraint:
	 *     (sectionDescription=DBody? srsItems+=VSRSDocumentItem* srsRequirementSubsections+=VSRSInstantiableRequirementSection*)
	 */
	protected void sequence_VSRSAdaptationInstallationRequirements(ISerializationContext context, VSRSAdaptationInstallationRequirements semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     VSRSApplicableDocuments returns VSRSApplicableDocuments
	 *
	 * Constraint:
	 *     applicableDocuments+=DApplicableDocument*
	 */
	protected void sequence_VSRSApplicableDocuments(ISerializationContext context, VSRSApplicableDocuments semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     VSRSDataDefinitionDBRequirements returns VSRSDataDefinitionDBRequirements
	 *
	 * Constraint:
	 *     (sectionDescription=DBody? srsItems+=VSRSDocumentItem* srsRequirementSubsections+=VSRSInstantiableRequirementSection*)
	 */
	protected void sequence_VSRSDataDefinitionDBRequirements(ISerializationContext context, VSRSDataDefinitionDBRequirements semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     VSRSDefinition returns VSRSDefinition
	 *
	 * Constraint:
	 *     (name=STRING description=DRun)
	 */
	protected void sequence_VSRSDefinition(ISerializationContext context, VSRSDefinition semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, srsPackage.Literals.VSRS_ABSTRACT_BRIEF_DESCRIPTION__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, srsPackage.Literals.VSRS_ABSTRACT_BRIEF_DESCRIPTION__NAME));
			if (transientValues.isValueTransient(semanticObject, srsPackage.Literals.VSRS_ABSTRACT_BRIEF_DESCRIPTION__DESCRIPTION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, srsPackage.Literals.VSRS_ABSTRACT_BRIEF_DESCRIPTION__DESCRIPTION));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getVSRSDefinitionAccess().getNameSTRINGTerminalRuleCall_2_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getVSRSDefinitionAccess().getDescriptionDRunParserRuleCall_4_0(), semanticObject.getDescription());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     VSRSDesignRequirements returns VSRSDesignRequirements
	 *
	 * Constraint:
	 *     (sectionDescription=DBody? srsItems+=VSRSDocumentItem* srsRequirementSubsections+=VSRSInstantiableRequirementSection*)
	 */
	protected void sequence_VSRSDesignRequirements(ISerializationContext context, VSRSDesignRequirements semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     VSRSDocumentItem returns VSRSDocumentItem
	 *
	 * Constraint:
	 *     (
	 *         name=STRING 
	 *         validationMethod=VValidationMethod 
	 *         mode+=VSRSDocumentItemModes* 
	 *         description=DBody 
	 *         extendedDescription=DBody? 
	 *         parentItem+=[VTraceableDocumentAbstractItem|STRING]*
	 *     )
	 */
	protected void sequence_VSRSDocumentItem(ISerializationContext context, VSRSDocumentItem semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     VSRSDocument returns VSRSDocument
	 *
	 * Constraint:
	 *     (
	 *         name=STRING 
	 *         id=STRING 
	 *         issue=UINT_STRING 
	 *         revision=UINT_STRING 
	 *         date=STRING 
	 *         parents+=[VTraceableDocument|STRING]* 
	 *         introductionSection=VSRSIntroduction 
	 *         applicableDocumentsSection=VSRSApplicableDocuments 
	 *         referenceDocumentsSection=VSRSReferenceDocuments 
	 *         termsDefinitionsAbbreviationsSection=VSRSTermsDefinitionsAbbreviations 
	 *         softwareOverviewSection=VSRSSoftwareOverview 
	 *         requirementsSection=VSRSRequirements 
	 *         logicalModelsSection=VSRSLogicalModels
	 *     )
	 */
	protected void sequence_VSRSDocument(ISerializationContext context, VSRSDocument semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     VSRSFixedSection returns VSRSFixedSection
	 *
	 * Constraint:
	 *     (body=DBody? srsInstatiableSubsections+=VSRSInstantiableSection*)
	 */
	protected void sequence_VSRSFixedSection(ISerializationContext context, VSRSFixedSection semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     VSRSFunctionalRequirements returns VSRSFunctionalRequirements
	 *
	 * Constraint:
	 *     (sectionDescription=DBody? srsItems+=VSRSDocumentItem* srsRequirementSubsections+=VSRSInstantiableRequirementSection*)
	 */
	protected void sequence_VSRSFunctionalRequirements(ISerializationContext context, VSRSFunctionalRequirements semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     VSRSGeneralRequirements returns VSRSGeneralRequirements
	 *
	 * Constraint:
	 *     (sectionDescription=DBody? srsItems+=VSRSDocumentItem* srsRequirementSubsections+=VSRSInstantiableRequirementSection*)
	 */
	protected void sequence_VSRSGeneralRequirements(ISerializationContext context, VSRSGeneralRequirements semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     VSRSHumanFactorsRequirements returns VSRSHumanFactorsRequirements
	 *
	 * Constraint:
	 *     (sectionDescription=DBody? srsItems+=VSRSDocumentItem* srsRequirementSubsections+=VSRSInstantiableRequirementSection*)
	 */
	protected void sequence_VSRSHumanFactorsRequirements(ISerializationContext context, VSRSHumanFactorsRequirements semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     VSRSInstantiableRequirementSection returns VSRSInstantiableRequirementSection
	 *
	 * Constraint:
	 *     (name=STRING sectionDescription=DBody? srsItems+=VSRSDocumentItem*)
	 */
	protected void sequence_VSRSInstantiableRequirementSection(ISerializationContext context, VSRSInstantiableRequirementSection semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     VSRSInstantiableSection returns VSRSInstantiableSection
	 *
	 * Constraint:
	 *     (name=STRING body=DBody? srsInstatiableSubsections+=VSRSInstantiableSection*)
	 */
	protected void sequence_VSRSInstantiableSection(ISerializationContext context, VSRSInstantiableSection semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     VSRSInterfaceRequirements returns VSRSInterfaceRequirements
	 *
	 * Constraint:
	 *     (sectionDescription=DBody? srsItems+=VSRSDocumentItem* srsRequirementSubsections+=VSRSInstantiableRequirementSection*)
	 */
	protected void sequence_VSRSInterfaceRequirements(ISerializationContext context, VSRSInterfaceRequirements semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     VSRSIntroduction returns VSRSIntroduction
	 *
	 * Constraint:
	 *     srsInstatiableSubsections+=VSRSInstantiableSection+
	 */
	protected void sequence_VSRSIntroduction(ISerializationContext context, VSRSIntroduction semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     VSRSLogicalModel returns VSRSLogicalModel
	 *
	 * Constraint:
	 *     {VSRSLogicalModel}
	 */
	protected void sequence_VSRSLogicalModel(ISerializationContext context, VSRSLogicalModel semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     VSRSLogicalModels returns VSRSLogicalModels
	 *
	 * Constraint:
	 *     logicalModels+=VSRSLogicalModel*
	 */
	protected void sequence_VSRSLogicalModels(ISerializationContext context, VSRSLogicalModels semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     VSRSOperationalRequirements returns VSRSOperationalRequirements
	 *
	 * Constraint:
	 *     (sectionDescription=DBody? srsItems+=VSRSDocumentItem* srsRequirementSubsections+=VSRSInstantiableRequirementSection*)
	 */
	protected void sequence_VSRSOperationalRequirements(ISerializationContext context, VSRSOperationalRequirements semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     VSRSPerformanceRequirements returns VSRSPerformanceRequirements
	 *
	 * Constraint:
	 *     (sectionDescription=DBody? srsItems+=VSRSDocumentItem* srsRequirementSubsections+=VSRSInstantiableRequirementSection*)
	 */
	protected void sequence_VSRSPerformanceRequirements(ISerializationContext context, VSRSPerformanceRequirements semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     VSRSPortabilityRequirements returns VSRSPortabilityRequirements
	 *
	 * Constraint:
	 *     (sectionDescription=DBody? srsItems+=VSRSDocumentItem* srsRequirementSubsections+=VSRSInstantiableRequirementSection*)
	 */
	protected void sequence_VSRSPortabilityRequirements(ISerializationContext context, VSRSPortabilityRequirements semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     VSRSReferenceDocuments returns VSRSReferenceDocuments
	 *
	 * Constraint:
	 *     referenceDocuments+=DReferenceDocument*
	 */
	protected void sequence_VSRSReferenceDocuments(ISerializationContext context, VSRSReferenceDocuments semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     VSRSRequirements returns VSRSRequirements
	 *
	 * Constraint:
	 *     (
	 *         sectionDescription=DBody? 
	 *         general=VSRSGeneralRequirements 
	 *         functional=VSRSFunctionalRequirements 
	 *         performance=VSRSPerformanceRequirements 
	 *         interface=VSRSInterfaceRequirements 
	 *         operational=VSRSOperationalRequirements 
	 *         resources=VSRSResourcesRequirements 
	 *         design=VSRSDesignRequirements 
	 *         securityPrivacy=VSRSSecurityPrivacyRequirements 
	 *         portability=VSRSPortabilityRequirements 
	 *         swQuality=VSRSSWQualityRequirements 
	 *         swReliabilty=VSRSSWReliabiltyRequirements 
	 *         swMaintainability=VSRSSWMaintainabilityRequirements 
	 *         swSafety=VSRSSWSafetyRequirements 
	 *         swConfigurationDelivery=VSRSSWConfigurationDeliveryRequirements 
	 *         dataDefinitionDB=VSRSDataDefinitionDBRequirements 
	 *         humanFactors=VSRSHumanFactorsRequirements 
	 *         adaptationInstallation=VSRSAdaptationInstallationRequirements
	 *     )
	 */
	protected void sequence_VSRSRequirements(ISerializationContext context, VSRSRequirements semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     VSRSResourcesRequirements returns VSRSResourcesRequirements
	 *
	 * Constraint:
	 *     (sectionDescription=DBody? srsItems+=VSRSDocumentItem* srsRequirementSubsections+=VSRSInstantiableRequirementSection*)
	 */
	protected void sequence_VSRSResourcesRequirements(ISerializationContext context, VSRSResourcesRequirements semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     VSRSSWConfigurationDeliveryRequirements returns VSRSSWConfigurationDeliveryRequirements
	 *
	 * Constraint:
	 *     (sectionDescription=DBody? srsItems+=VSRSDocumentItem* srsRequirementSubsections+=VSRSInstantiableRequirementSection*)
	 */
	protected void sequence_VSRSSWConfigurationDeliveryRequirements(ISerializationContext context, VSRSSWConfigurationDeliveryRequirements semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     VSRSSWMaintainabilityRequirements returns VSRSSWMaintainabilityRequirements
	 *
	 * Constraint:
	 *     (sectionDescription=DBody? srsItems+=VSRSDocumentItem* srsRequirementSubsections+=VSRSInstantiableRequirementSection*)
	 */
	protected void sequence_VSRSSWMaintainabilityRequirements(ISerializationContext context, VSRSSWMaintainabilityRequirements semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     VSRSSWQualityRequirements returns VSRSSWQualityRequirements
	 *
	 * Constraint:
	 *     (sectionDescription=DBody? srsItems+=VSRSDocumentItem* srsRequirementSubsections+=VSRSInstantiableRequirementSection*)
	 */
	protected void sequence_VSRSSWQualityRequirements(ISerializationContext context, VSRSSWQualityRequirements semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     VSRSSWReliabiltyRequirements returns VSRSSWReliabiltyRequirements
	 *
	 * Constraint:
	 *     (sectionDescription=DBody? srsItems+=VSRSDocumentItem* srsRequirementSubsections+=VSRSInstantiableRequirementSection*)
	 */
	protected void sequence_VSRSSWReliabiltyRequirements(ISerializationContext context, VSRSSWReliabiltyRequirements semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     VSRSSWSafetyRequirements returns VSRSSWSafetyRequirements
	 *
	 * Constraint:
	 *     (sectionDescription=DBody? srsItems+=VSRSDocumentItem* srsRequirementSubsections+=VSRSInstantiableRequirementSection*)
	 */
	protected void sequence_VSRSSWSafetyRequirements(ISerializationContext context, VSRSSWSafetyRequirements semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     VSRSSecurityPrivacyRequirements returns VSRSSecurityPrivacyRequirements
	 *
	 * Constraint:
	 *     (sectionDescription=DBody? srsItems+=VSRSDocumentItem* srsRequirementSubsections+=VSRSInstantiableRequirementSection*)
	 */
	protected void sequence_VSRSSecurityPrivacyRequirements(ISerializationContext context, VSRSSecurityPrivacyRequirements semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     VSRSSoftwareOverview returns VSRSSoftwareOverview
	 *
	 * Constraint:
	 *     (
	 *         functionPurpose=VSRSFixedSection 
	 *         environmentalConsiderations=VSRSFixedSection 
	 *         relationOtherSystems=VSRSFixedSection 
	 *         constraints=VSRSFixedSection
	 *     )
	 */
	protected void sequence_VSRSSoftwareOverview(ISerializationContext context, VSRSSoftwareOverview semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, srsPackage.Literals.VSRS_SOFTWARE_OVERVIEW__FUNCTION_PURPOSE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, srsPackage.Literals.VSRS_SOFTWARE_OVERVIEW__FUNCTION_PURPOSE));
			if (transientValues.isValueTransient(semanticObject, srsPackage.Literals.VSRS_SOFTWARE_OVERVIEW__ENVIRONMENTAL_CONSIDERATIONS) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, srsPackage.Literals.VSRS_SOFTWARE_OVERVIEW__ENVIRONMENTAL_CONSIDERATIONS));
			if (transientValues.isValueTransient(semanticObject, srsPackage.Literals.VSRS_SOFTWARE_OVERVIEW__RELATION_OTHER_SYSTEMS) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, srsPackage.Literals.VSRS_SOFTWARE_OVERVIEW__RELATION_OTHER_SYSTEMS));
			if (transientValues.isValueTransient(semanticObject, srsPackage.Literals.VSRS_SOFTWARE_OVERVIEW__CONSTRAINTS) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, srsPackage.Literals.VSRS_SOFTWARE_OVERVIEW__CONSTRAINTS));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getVSRSSoftwareOverviewAccess().getFunctionPurposeVSRSFixedSectionParserRuleCall_2_0(), semanticObject.getFunctionPurpose());
		feeder.accept(grammarAccess.getVSRSSoftwareOverviewAccess().getEnvironmentalConsiderationsVSRSFixedSectionParserRuleCall_5_0(), semanticObject.getEnvironmentalConsiderations());
		feeder.accept(grammarAccess.getVSRSSoftwareOverviewAccess().getRelationOtherSystemsVSRSFixedSectionParserRuleCall_8_0(), semanticObject.getRelationOtherSystems());
		feeder.accept(grammarAccess.getVSRSSoftwareOverviewAccess().getConstraintsVSRSFixedSectionParserRuleCall_11_0(), semanticObject.getConstraints());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     VSRSTerm returns VSRSTerm
	 *
	 * Constraint:
	 *     (name=STRING description=DRun)
	 */
	protected void sequence_VSRSTerm(ISerializationContext context, VSRSTerm semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, srsPackage.Literals.VSRS_ABSTRACT_BRIEF_DESCRIPTION__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, srsPackage.Literals.VSRS_ABSTRACT_BRIEF_DESCRIPTION__NAME));
			if (transientValues.isValueTransient(semanticObject, srsPackage.Literals.VSRS_ABSTRACT_BRIEF_DESCRIPTION__DESCRIPTION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, srsPackage.Literals.VSRS_ABSTRACT_BRIEF_DESCRIPTION__DESCRIPTION));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getVSRSTermAccess().getNameSTRINGTerminalRuleCall_2_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getVSRSTermAccess().getDescriptionDRunParserRuleCall_4_0(), semanticObject.getDescription());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     VSRSTermsDefinitionsAbbreviations returns VSRSTermsDefinitionsAbbreviations
	 *
	 * Constraint:
	 *     (terms+=VSRSTerm* definitions+=VSRSDefinition* abbreviations+=VSRSAbbreviation*)
	 */
	protected void sequence_VSRSTermsDefinitionsAbbreviations(ISerializationContext context, VSRSTermsDefinitionsAbbreviations semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
}
