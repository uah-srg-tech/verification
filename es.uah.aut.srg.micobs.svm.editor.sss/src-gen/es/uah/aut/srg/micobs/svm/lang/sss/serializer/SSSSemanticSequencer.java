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
package es.uah.aut.srg.micobs.svm.lang.sss.serializer;

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
import es.uah.aut.srg.micobs.svm.lang.sss.services.SSSGrammarAccess;
import es.uah.aut.srg.micobs.svm.sss.VSSSAbbreviation;
import es.uah.aut.srg.micobs.svm.sss.VSSSAdaptationMissionizationRequirements;
import es.uah.aut.srg.micobs.svm.sss.VSSSApplicableDocuments;
import es.uah.aut.srg.micobs.svm.sss.VSSSCapabilitiesRequirements;
import es.uah.aut.srg.micobs.svm.sss.VSSSComputerResourceRequirements;
import es.uah.aut.srg.micobs.svm.sss.VSSSDefinition;
import es.uah.aut.srg.micobs.svm.sss.VSSSDesignRequirements;
import es.uah.aut.srg.micobs.svm.sss.VSSSDocument;
import es.uah.aut.srg.micobs.svm.sss.VSSSDocumentItem;
import es.uah.aut.srg.micobs.svm.sss.VSSSFixedSection;
import es.uah.aut.srg.micobs.svm.sss.VSSSGeneralDescription;
import es.uah.aut.srg.micobs.svm.sss.VSSSGeneralRequirements;
import es.uah.aut.srg.micobs.svm.sss.VSSSInstantiableRequirementSection;
import es.uah.aut.srg.micobs.svm.sss.VSSSInstantiableSection;
import es.uah.aut.srg.micobs.svm.sss.VSSSIntroduction;
import es.uah.aut.srg.micobs.svm.sss.VSSSQualityRequirements;
import es.uah.aut.srg.micobs.svm.sss.VSSSReferenceDocuments;
import es.uah.aut.srg.micobs.svm.sss.VSSSReliabiltyAvailabilityRequirements;
import es.uah.aut.srg.micobs.svm.sss.VSSSSafetyRequirements;
import es.uah.aut.srg.micobs.svm.sss.VSSSSecurityRequirements;
import es.uah.aut.srg.micobs.svm.sss.VSSSSoftwareMaintenanceRequirements;
import es.uah.aut.srg.micobs.svm.sss.VSSSSoftwareOperationsRequirements;
import es.uah.aut.srg.micobs.svm.sss.VSSSSpecificRequirements;
import es.uah.aut.srg.micobs.svm.sss.VSSSSystemInterfaceRequirements;
import es.uah.aut.srg.micobs.svm.sss.VSSSSystemModel;
import es.uah.aut.srg.micobs.svm.sss.VSSSSystemModels;
import es.uah.aut.srg.micobs.svm.sss.VSSSSystemSoftwareObservabilityRequirements;
import es.uah.aut.srg.micobs.svm.sss.VSSSTerm;
import es.uah.aut.srg.micobs.svm.sss.VSSSTermsDefinitionsAbbreviations;
import es.uah.aut.srg.micobs.svm.sss.VSSSValidationApproach;
import es.uah.aut.srg.micobs.svm.sss.VSSSValidationRequirements;
import es.uah.aut.srg.micobs.svm.sss.VSSSVerificationRequirements;
import es.uah.aut.srg.micobs.svm.sss.VSSSVerificationValidationIntegrationRequirements;
import es.uah.aut.srg.micobs.svm.sss.VSSSVerificationValidationProcessRequirements;
import es.uah.aut.srg.micobs.svm.sss.sssPackage;
import es.uah.aut.srg.micobs.svm.tdm.tdmPackage;
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
public class SSSSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private SSSGrammarAccess grammarAccess;
	
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
		else if (epackage == sssPackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case sssPackage.VSSS_ABBREVIATION:
				sequence_VSSSAbbreviation(context, (VSSSAbbreviation) semanticObject); 
				return; 
			case sssPackage.VSSS_ADAPTATION_MISSIONIZATION_REQUIREMENTS:
				sequence_VSSSAdaptationMissionizationRequirements(context, (VSSSAdaptationMissionizationRequirements) semanticObject); 
				return; 
			case sssPackage.VSSS_APPLICABLE_DOCUMENTS:
				sequence_VSSSApplicableDocuments(context, (VSSSApplicableDocuments) semanticObject); 
				return; 
			case sssPackage.VSSS_CAPABILITIES_REQUIREMENTS:
				sequence_VSSSCapabilitiesRequirements(context, (VSSSCapabilitiesRequirements) semanticObject); 
				return; 
			case sssPackage.VSSS_COMPUTER_RESOURCE_REQUIREMENTS:
				sequence_VSSSComputerResourceRequirements(context, (VSSSComputerResourceRequirements) semanticObject); 
				return; 
			case sssPackage.VSSS_DEFINITION:
				sequence_VSSSDefinition(context, (VSSSDefinition) semanticObject); 
				return; 
			case sssPackage.VSSS_DESIGN_REQUIREMENTS:
				sequence_VSSSDesignRequirements(context, (VSSSDesignRequirements) semanticObject); 
				return; 
			case sssPackage.VSSS_DOCUMENT:
				sequence_VSSSDocument(context, (VSSSDocument) semanticObject); 
				return; 
			case sssPackage.VSSS_DOCUMENT_ITEM:
				sequence_VSSSDocumentItem(context, (VSSSDocumentItem) semanticObject); 
				return; 
			case sssPackage.VSSS_FIXED_SECTION:
				sequence_VSSSFixedSection(context, (VSSSFixedSection) semanticObject); 
				return; 
			case sssPackage.VSSS_GENERAL_DESCRIPTION:
				sequence_VSSSGeneralDescription(context, (VSSSGeneralDescription) semanticObject); 
				return; 
			case sssPackage.VSSS_GENERAL_REQUIREMENTS:
				sequence_VSSSGeneralRequirements(context, (VSSSGeneralRequirements) semanticObject); 
				return; 
			case sssPackage.VSSS_INSTANTIABLE_REQUIREMENT_SECTION:
				sequence_VSSSInstantiableRequirementSection(context, (VSSSInstantiableRequirementSection) semanticObject); 
				return; 
			case sssPackage.VSSS_INSTANTIABLE_SECTION:
				sequence_VSSSInstatiableSection(context, (VSSSInstantiableSection) semanticObject); 
				return; 
			case sssPackage.VSSS_INTRODUCTION:
				sequence_VSSSIntroduction(context, (VSSSIntroduction) semanticObject); 
				return; 
			case sssPackage.VSSS_QUALITY_REQUIREMENTS:
				sequence_VSSSQualityRequirements(context, (VSSSQualityRequirements) semanticObject); 
				return; 
			case sssPackage.VSSS_REFERENCE_DOCUMENTS:
				sequence_VSSSReferenceDocuments(context, (VSSSReferenceDocuments) semanticObject); 
				return; 
			case sssPackage.VSSS_RELIABILTY_AVAILABILITY_REQUIREMENTS:
				sequence_VSSSReliabiltyAvailabilityRequirements(context, (VSSSReliabiltyAvailabilityRequirements) semanticObject); 
				return; 
			case sssPackage.VSSS_SAFETY_REQUIREMENTS:
				sequence_VSSSSafetyRequirements(context, (VSSSSafetyRequirements) semanticObject); 
				return; 
			case sssPackage.VSSS_SECURITY_REQUIREMENTS:
				sequence_VSSSSecurityRequirements(context, (VSSSSecurityRequirements) semanticObject); 
				return; 
			case sssPackage.VSSS_SOFTWARE_MAINTENANCE_REQUIREMENTS:
				sequence_VSSSSoftwareMaintenanceRequirements(context, (VSSSSoftwareMaintenanceRequirements) semanticObject); 
				return; 
			case sssPackage.VSSS_SOFTWARE_OPERATIONS_REQUIREMENTS:
				sequence_VSSSSoftwareOperationsRequirements(context, (VSSSSoftwareOperationsRequirements) semanticObject); 
				return; 
			case sssPackage.VSSS_SPECIFIC_REQUIREMENTS:
				sequence_VSSSSpecificRequirements(context, (VSSSSpecificRequirements) semanticObject); 
				return; 
			case sssPackage.VSSS_SYSTEM_INTERFACE_REQUIREMENTS:
				sequence_VSSSSystemInterfaceRequirements(context, (VSSSSystemInterfaceRequirements) semanticObject); 
				return; 
			case sssPackage.VSSS_SYSTEM_MODEL:
				sequence_VSSSSystemModel(context, (VSSSSystemModel) semanticObject); 
				return; 
			case sssPackage.VSSS_SYSTEM_MODELS:
				sequence_VSSSSystemModels(context, (VSSSSystemModels) semanticObject); 
				return; 
			case sssPackage.VSSS_SYSTEM_SOFTWARE_OBSERVABILITY_REQUIREMENTS:
				sequence_VSSSSystemSoftwareObservabilityRequirements(context, (VSSSSystemSoftwareObservabilityRequirements) semanticObject); 
				return; 
			case sssPackage.VSSS_TERM:
				sequence_VSSSTerm(context, (VSSSTerm) semanticObject); 
				return; 
			case sssPackage.VSSS_TERMS_DEFINITIONS_ABBREVIATIONS:
				sequence_VSSSTermsDefinitionsAbbreviations(context, (VSSSTermsDefinitionsAbbreviations) semanticObject); 
				return; 
			case sssPackage.VSSS_VALIDATION_APPROACH:
				sequence_VSSSValidationApproach(context, (VSSSValidationApproach) semanticObject); 
				return; 
			case sssPackage.VSSS_VALIDATION_REQUIREMENTS:
				sequence_VSSSValidationRequirements(context, (VSSSValidationRequirements) semanticObject); 
				return; 
			case sssPackage.VSSS_VERIFICATION_REQUIREMENTS:
				sequence_VSSSVerificationRequirements(context, (VSSSVerificationRequirements) semanticObject); 
				return; 
			case sssPackage.VSSS_VERIFICATION_VALIDATION_INTEGRATION_REQUIREMENTS:
				sequence_VSSSVerificationValidationIntegrationRequirements(context, (VSSSVerificationValidationIntegrationRequirements) semanticObject); 
				return; 
			case sssPackage.VSSS_VERIFICATION_VALIDATION_PROCESS_REQUIREMENTS:
				sequence_VSSSVerificationValidationProcessRequirements(context, (VSSSVerificationValidationProcessRequirements) semanticObject); 
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
	 *     (name=STRING title=STRING id=STRING (issue=STRING revision=STRING?)? date=STRING?)
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
	 *     (span=STRING bodyContent+=DBodyContent+)
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
	 *     (name=STRING title=STRING id=STRING (issue=STRING revision=STRING?)? date=STRING?)
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
	 *     VSSSAbbreviation returns VSSSAbbreviation
	 *
	 * Constraint:
	 *     (name=STRING description=DRun)
	 */
	protected void sequence_VSSSAbbreviation(ISerializationContext context, VSSSAbbreviation semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, sssPackage.Literals.VSSS_ABSTRACT_BRIEF_DESCRIPTION__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, sssPackage.Literals.VSSS_ABSTRACT_BRIEF_DESCRIPTION__NAME));
			if (transientValues.isValueTransient(semanticObject, sssPackage.Literals.VSSS_ABSTRACT_BRIEF_DESCRIPTION__DESCRIPTION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, sssPackage.Literals.VSSS_ABSTRACT_BRIEF_DESCRIPTION__DESCRIPTION));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getVSSSAbbreviationAccess().getNameSTRINGTerminalRuleCall_2_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getVSSSAbbreviationAccess().getDescriptionDRunParserRuleCall_4_0(), semanticObject.getDescription());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     VSSSAdaptationMissionizationRequirements returns VSSSAdaptationMissionizationRequirements
	 *
	 * Constraint:
	 *     (sectionDescription=DBody? sssItems+=VSSSDocumentItem* sssRequirementSubsections+=VSSSInstantiableRequirementSection*)
	 */
	protected void sequence_VSSSAdaptationMissionizationRequirements(ISerializationContext context, VSSSAdaptationMissionizationRequirements semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     VSSSApplicableDocuments returns VSSSApplicableDocuments
	 *
	 * Constraint:
	 *     applicableDocuments+=DApplicableDocument*
	 */
	protected void sequence_VSSSApplicableDocuments(ISerializationContext context, VSSSApplicableDocuments semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     VSSSCapabilitiesRequirements returns VSSSCapabilitiesRequirements
	 *
	 * Constraint:
	 *     (sectionDescription=DBody? sssItems+=VSSSDocumentItem* sssRequirementSubsections+=VSSSInstantiableRequirementSection*)
	 */
	protected void sequence_VSSSCapabilitiesRequirements(ISerializationContext context, VSSSCapabilitiesRequirements semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     VSSSComputerResourceRequirements returns VSSSComputerResourceRequirements
	 *
	 * Constraint:
	 *     (sectionDescription=DBody? sssItems+=VSSSDocumentItem* sssRequirementSubsections+=VSSSInstantiableRequirementSection*)
	 */
	protected void sequence_VSSSComputerResourceRequirements(ISerializationContext context, VSSSComputerResourceRequirements semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     VSSSDefinition returns VSSSDefinition
	 *
	 * Constraint:
	 *     (name=STRING description=DRun)
	 */
	protected void sequence_VSSSDefinition(ISerializationContext context, VSSSDefinition semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, sssPackage.Literals.VSSS_ABSTRACT_BRIEF_DESCRIPTION__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, sssPackage.Literals.VSSS_ABSTRACT_BRIEF_DESCRIPTION__NAME));
			if (transientValues.isValueTransient(semanticObject, sssPackage.Literals.VSSS_ABSTRACT_BRIEF_DESCRIPTION__DESCRIPTION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, sssPackage.Literals.VSSS_ABSTRACT_BRIEF_DESCRIPTION__DESCRIPTION));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getVSSSDefinitionAccess().getNameSTRINGTerminalRuleCall_2_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getVSSSDefinitionAccess().getDescriptionDRunParserRuleCall_4_0(), semanticObject.getDescription());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     VSSSDesignRequirements returns VSSSDesignRequirements
	 *
	 * Constraint:
	 *     (sectionDescription=DBody? sssItems+=VSSSDocumentItem* sssRequirementSubsections+=VSSSInstantiableRequirementSection*)
	 */
	protected void sequence_VSSSDesignRequirements(ISerializationContext context, VSSSDesignRequirements semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     VSSSDocumentItem returns VSSSDocumentItem
	 *
	 * Constraint:
	 *     (name=STRING validationMethod=VValidationMethod description=DBody extendedDescription=DBody?)
	 */
	protected void sequence_VSSSDocumentItem(ISerializationContext context, VSSSDocumentItem semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     VSSSDocument returns VSSSDocument
	 *
	 * Constraint:
	 *     (
	 *         name=STRING 
	 *         id=STRING 
	 *         issue=STRING 
	 *         revision=STRING 
	 *         date=STRING 
	 *         introductionSection=VSSSIntroduction 
	 *         applicableDocumentsSection=VSSSApplicableDocuments 
	 *         referenceDocumentsSection=VSSSReferenceDocuments 
	 *         termsDefinitionsAbbreviationsSection=VSSSTermsDefinitionsAbbreviations 
	 *         generalDescriptionSection=VSSSGeneralDescription 
	 *         specificRequirementsSection=VSSSSpecificRequirements 
	 *         verificationValidationIntegrationSection=VSSSVerificationValidationIntegrationRequirements 
	 *         systemModelsSection=VSSSSystemModels
	 *     )
	 */
	protected void sequence_VSSSDocument(ISerializationContext context, VSSSDocument semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, tdmPackage.Literals.VTRACEABLE_DOCUMENT__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, tdmPackage.Literals.VTRACEABLE_DOCUMENT__NAME));
			if (transientValues.isValueTransient(semanticObject, tdmPackage.Literals.VTRACEABLE_DOCUMENT__ID) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, tdmPackage.Literals.VTRACEABLE_DOCUMENT__ID));
			if (transientValues.isValueTransient(semanticObject, tdmPackage.Literals.VTRACEABLE_DOCUMENT__ISSUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, tdmPackage.Literals.VTRACEABLE_DOCUMENT__ISSUE));
			if (transientValues.isValueTransient(semanticObject, tdmPackage.Literals.VTRACEABLE_DOCUMENT__REVISION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, tdmPackage.Literals.VTRACEABLE_DOCUMENT__REVISION));
			if (transientValues.isValueTransient(semanticObject, tdmPackage.Literals.VTRACEABLE_DOCUMENT__DATE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, tdmPackage.Literals.VTRACEABLE_DOCUMENT__DATE));
			if (transientValues.isValueTransient(semanticObject, sssPackage.Literals.VSSS_DOCUMENT__INTRODUCTION_SECTION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, sssPackage.Literals.VSSS_DOCUMENT__INTRODUCTION_SECTION));
			if (transientValues.isValueTransient(semanticObject, sssPackage.Literals.VSSS_DOCUMENT__APPLICABLE_DOCUMENTS_SECTION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, sssPackage.Literals.VSSS_DOCUMENT__APPLICABLE_DOCUMENTS_SECTION));
			if (transientValues.isValueTransient(semanticObject, sssPackage.Literals.VSSS_DOCUMENT__REFERENCE_DOCUMENTS_SECTION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, sssPackage.Literals.VSSS_DOCUMENT__REFERENCE_DOCUMENTS_SECTION));
			if (transientValues.isValueTransient(semanticObject, sssPackage.Literals.VSSS_DOCUMENT__TERMS_DEFINITIONS_ABBREVIATIONS_SECTION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, sssPackage.Literals.VSSS_DOCUMENT__TERMS_DEFINITIONS_ABBREVIATIONS_SECTION));
			if (transientValues.isValueTransient(semanticObject, sssPackage.Literals.VSSS_DOCUMENT__GENERAL_DESCRIPTION_SECTION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, sssPackage.Literals.VSSS_DOCUMENT__GENERAL_DESCRIPTION_SECTION));
			if (transientValues.isValueTransient(semanticObject, sssPackage.Literals.VSSS_DOCUMENT__SPECIFIC_REQUIREMENTS_SECTION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, sssPackage.Literals.VSSS_DOCUMENT__SPECIFIC_REQUIREMENTS_SECTION));
			if (transientValues.isValueTransient(semanticObject, sssPackage.Literals.VSSS_DOCUMENT__VERIFICATION_VALIDATION_INTEGRATION_SECTION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, sssPackage.Literals.VSSS_DOCUMENT__VERIFICATION_VALIDATION_INTEGRATION_SECTION));
			if (transientValues.isValueTransient(semanticObject, sssPackage.Literals.VSSS_DOCUMENT__SYSTEM_MODELS_SECTION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, sssPackage.Literals.VSSS_DOCUMENT__SYSTEM_MODELS_SECTION));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getVSSSDocumentAccess().getNameSTRINGTerminalRuleCall_2_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getVSSSDocumentAccess().getIdSTRINGTerminalRuleCall_4_0(), semanticObject.getId());
		feeder.accept(grammarAccess.getVSSSDocumentAccess().getIssueSTRINGTerminalRuleCall_6_0(), semanticObject.getIssue());
		feeder.accept(grammarAccess.getVSSSDocumentAccess().getRevisionSTRINGTerminalRuleCall_8_0(), semanticObject.getRevision());
		feeder.accept(grammarAccess.getVSSSDocumentAccess().getDateSTRINGTerminalRuleCall_10_0(), semanticObject.getDate());
		feeder.accept(grammarAccess.getVSSSDocumentAccess().getIntroductionSectionVSSSIntroductionParserRuleCall_12_0(), semanticObject.getIntroductionSection());
		feeder.accept(grammarAccess.getVSSSDocumentAccess().getApplicableDocumentsSectionVSSSApplicableDocumentsParserRuleCall_13_0(), semanticObject.getApplicableDocumentsSection());
		feeder.accept(grammarAccess.getVSSSDocumentAccess().getReferenceDocumentsSectionVSSSReferenceDocumentsParserRuleCall_14_0(), semanticObject.getReferenceDocumentsSection());
		feeder.accept(grammarAccess.getVSSSDocumentAccess().getTermsDefinitionsAbbreviationsSectionVSSSTermsDefinitionsAbbreviationsParserRuleCall_15_0(), semanticObject.getTermsDefinitionsAbbreviationsSection());
		feeder.accept(grammarAccess.getVSSSDocumentAccess().getGeneralDescriptionSectionVSSSGeneralDescriptionParserRuleCall_16_0(), semanticObject.getGeneralDescriptionSection());
		feeder.accept(grammarAccess.getVSSSDocumentAccess().getSpecificRequirementsSectionVSSSSpecificRequirementsParserRuleCall_17_0(), semanticObject.getSpecificRequirementsSection());
		feeder.accept(grammarAccess.getVSSSDocumentAccess().getVerificationValidationIntegrationSectionVSSSVerificationValidationIntegrationRequirementsParserRuleCall_18_0(), semanticObject.getVerificationValidationIntegrationSection());
		feeder.accept(grammarAccess.getVSSSDocumentAccess().getSystemModelsSectionVSSSSystemModelsParserRuleCall_19_0(), semanticObject.getSystemModelsSection());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     VSSSFixedSection returns VSSSFixedSection
	 *
	 * Constraint:
	 *     (body=DBody? sssInstatiableSubsections+=VSSSInstatiableSection*)
	 */
	protected void sequence_VSSSFixedSection(ISerializationContext context, VSSSFixedSection semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     VSSSGeneralDescription returns VSSSGeneralDescription
	 *
	 * Constraint:
	 *     (
	 *         productPerspective=VSSSFixedSection 
	 *         generalCapabilities=VSSSFixedSection 
	 *         generalConstraints=VSSSFixedSection 
	 *         operationalEnvironment=VSSSFixedSection 
	 *         assumptionsDependencies=VSSSFixedSection
	 *     )
	 */
	protected void sequence_VSSSGeneralDescription(ISerializationContext context, VSSSGeneralDescription semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, sssPackage.Literals.VSSS_GENERAL_DESCRIPTION__PRODUCT_PERSPECTIVE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, sssPackage.Literals.VSSS_GENERAL_DESCRIPTION__PRODUCT_PERSPECTIVE));
			if (transientValues.isValueTransient(semanticObject, sssPackage.Literals.VSSS_GENERAL_DESCRIPTION__GENERAL_CAPABILITIES) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, sssPackage.Literals.VSSS_GENERAL_DESCRIPTION__GENERAL_CAPABILITIES));
			if (transientValues.isValueTransient(semanticObject, sssPackage.Literals.VSSS_GENERAL_DESCRIPTION__GENERAL_CONSTRAINTS) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, sssPackage.Literals.VSSS_GENERAL_DESCRIPTION__GENERAL_CONSTRAINTS));
			if (transientValues.isValueTransient(semanticObject, sssPackage.Literals.VSSS_GENERAL_DESCRIPTION__OPERATIONAL_ENVIRONMENT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, sssPackage.Literals.VSSS_GENERAL_DESCRIPTION__OPERATIONAL_ENVIRONMENT));
			if (transientValues.isValueTransient(semanticObject, sssPackage.Literals.VSSS_GENERAL_DESCRIPTION__ASSUMPTIONS_DEPENDENCIES) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, sssPackage.Literals.VSSS_GENERAL_DESCRIPTION__ASSUMPTIONS_DEPENDENCIES));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getVSSSGeneralDescriptionAccess().getProductPerspectiveVSSSFixedSectionParserRuleCall_2_0(), semanticObject.getProductPerspective());
		feeder.accept(grammarAccess.getVSSSGeneralDescriptionAccess().getGeneralCapabilitiesVSSSFixedSectionParserRuleCall_5_0(), semanticObject.getGeneralCapabilities());
		feeder.accept(grammarAccess.getVSSSGeneralDescriptionAccess().getGeneralConstraintsVSSSFixedSectionParserRuleCall_8_0(), semanticObject.getGeneralConstraints());
		feeder.accept(grammarAccess.getVSSSGeneralDescriptionAccess().getOperationalEnvironmentVSSSFixedSectionParserRuleCall_11_0(), semanticObject.getOperationalEnvironment());
		feeder.accept(grammarAccess.getVSSSGeneralDescriptionAccess().getAssumptionsDependenciesVSSSFixedSectionParserRuleCall_14_0(), semanticObject.getAssumptionsDependencies());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     VSSSGeneralRequirements returns VSSSGeneralRequirements
	 *
	 * Constraint:
	 *     (sectionDescription=DBody? sssItems+=VSSSDocumentItem* sssRequirementSubsections+=VSSSInstantiableRequirementSection*)
	 */
	protected void sequence_VSSSGeneralRequirements(ISerializationContext context, VSSSGeneralRequirements semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     VSSSInstantiableRequirementSection returns VSSSInstantiableRequirementSection
	 *
	 * Constraint:
	 *     (name=STRING sectionDescription=DBody? sssItems+=VSSSDocumentItem*)
	 */
	protected void sequence_VSSSInstantiableRequirementSection(ISerializationContext context, VSSSInstantiableRequirementSection semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     VSSSInstatiableSection returns VSSSInstantiableSection
	 *
	 * Constraint:
	 *     (name=STRING body=DBody? sssInstatiableSubsections+=VSSSInstatiableSection*)
	 */
	protected void sequence_VSSSInstatiableSection(ISerializationContext context, VSSSInstantiableSection semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     VSSSIntroduction returns VSSSIntroduction
	 *
	 * Constraint:
	 *     sssInstatiableSubsections+=VSSSInstatiableSection+
	 */
	protected void sequence_VSSSIntroduction(ISerializationContext context, VSSSIntroduction semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     VSSSQualityRequirements returns VSSSQualityRequirements
	 *
	 * Constraint:
	 *     (sectionDescription=DBody? sssItems+=VSSSDocumentItem* sssRequirementSubsections+=VSSSInstantiableRequirementSection*)
	 */
	protected void sequence_VSSSQualityRequirements(ISerializationContext context, VSSSQualityRequirements semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     VSSSReferenceDocuments returns VSSSReferenceDocuments
	 *
	 * Constraint:
	 *     referenceDocuments+=DReferenceDocument*
	 */
	protected void sequence_VSSSReferenceDocuments(ISerializationContext context, VSSSReferenceDocuments semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     VSSSReliabiltyAvailabilityRequirements returns VSSSReliabiltyAvailabilityRequirements
	 *
	 * Constraint:
	 *     (sssItems+=VSSSDocumentItem* sectionDescription=DBody? sssRequirementSubsections+=VSSSInstantiableRequirementSection*)
	 */
	protected void sequence_VSSSReliabiltyAvailabilityRequirements(ISerializationContext context, VSSSReliabiltyAvailabilityRequirements semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     VSSSSafetyRequirements returns VSSSSafetyRequirements
	 *
	 * Constraint:
	 *     (sectionDescription=DBody? sssItems+=VSSSDocumentItem* sssRequirementSubsections+=VSSSInstantiableRequirementSection*)
	 */
	protected void sequence_VSSSSafetyRequirements(ISerializationContext context, VSSSSafetyRequirements semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     VSSSSecurityRequirements returns VSSSSecurityRequirements
	 *
	 * Constraint:
	 *     (sectionDescription=DBody? sssItems+=VSSSDocumentItem* sssRequirementSubsections+=VSSSInstantiableRequirementSection*)
	 */
	protected void sequence_VSSSSecurityRequirements(ISerializationContext context, VSSSSecurityRequirements semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     VSSSSoftwareMaintenanceRequirements returns VSSSSoftwareMaintenanceRequirements
	 *
	 * Constraint:
	 *     (sectionDescription=DBody? sssItems+=VSSSDocumentItem* sssRequirementSubsections+=VSSSInstantiableRequirementSection*)
	 */
	protected void sequence_VSSSSoftwareMaintenanceRequirements(ISerializationContext context, VSSSSoftwareMaintenanceRequirements semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     VSSSSoftwareOperationsRequirements returns VSSSSoftwareOperationsRequirements
	 *
	 * Constraint:
	 *     (sectionDescription=DBody? sssItems+=VSSSDocumentItem* sssRequirementSubsections+=VSSSInstantiableRequirementSection*)
	 */
	protected void sequence_VSSSSoftwareOperationsRequirements(ISerializationContext context, VSSSSoftwareOperationsRequirements semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     VSSSSpecificRequirements returns VSSSSpecificRequirements
	 *
	 * Constraint:
	 *     (
	 *         sectionDescription=DBody? 
	 *         general=VSSSGeneralRequirements 
	 *         capabilities=VSSSCapabilitiesRequirements 
	 *         systemInterface=VSSSSystemInterfaceRequirements 
	 *         adaptationMissionization=VSSSAdaptationMissionizationRequirements 
	 *         computerResource=VSSSComputerResourceRequirements 
	 *         security=VSSSSecurityRequirements 
	 *         safety=VSSSSafetyRequirements 
	 *         reliabiltyAvailability=VSSSReliabiltyAvailabilityRequirements 
	 *         quality=VSSSQualityRequirements 
	 *         design=VSSSDesignRequirements 
	 *         softwareOperations=VSSSSoftwareOperationsRequirements 
	 *         softwareMaintenance=VSSSSoftwareMaintenanceRequirements 
	 *         systemSoftwareObservability=VSSSSystemSoftwareObservabilityRequirements
	 *     )
	 */
	protected void sequence_VSSSSpecificRequirements(ISerializationContext context, VSSSSpecificRequirements semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     VSSSSystemInterfaceRequirements returns VSSSSystemInterfaceRequirements
	 *
	 * Constraint:
	 *     (sectionDescription=DBody? sssItems+=VSSSDocumentItem* sssRequirementSubsections+=VSSSInstantiableRequirementSection*)
	 */
	protected void sequence_VSSSSystemInterfaceRequirements(ISerializationContext context, VSSSSystemInterfaceRequirements semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     VSSSSystemModel returns VSSSSystemModel
	 *
	 * Constraint:
	 *     {VSSSSystemModel}
	 */
	protected void sequence_VSSSSystemModel(ISerializationContext context, VSSSSystemModel semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     VSSSSystemModels returns VSSSSystemModels
	 *
	 * Constraint:
	 *     systemModels+=VSSSSystemModel*
	 */
	protected void sequence_VSSSSystemModels(ISerializationContext context, VSSSSystemModels semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     VSSSSystemSoftwareObservabilityRequirements returns VSSSSystemSoftwareObservabilityRequirements
	 *
	 * Constraint:
	 *     (sectionDescription=DBody? sssItems+=VSSSDocumentItem* sssRequirementSubsections+=VSSSInstantiableRequirementSection*)
	 */
	protected void sequence_VSSSSystemSoftwareObservabilityRequirements(ISerializationContext context, VSSSSystemSoftwareObservabilityRequirements semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     VSSSTerm returns VSSSTerm
	 *
	 * Constraint:
	 *     (name=STRING description=DRun)
	 */
	protected void sequence_VSSSTerm(ISerializationContext context, VSSSTerm semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, sssPackage.Literals.VSSS_ABSTRACT_BRIEF_DESCRIPTION__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, sssPackage.Literals.VSSS_ABSTRACT_BRIEF_DESCRIPTION__NAME));
			if (transientValues.isValueTransient(semanticObject, sssPackage.Literals.VSSS_ABSTRACT_BRIEF_DESCRIPTION__DESCRIPTION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, sssPackage.Literals.VSSS_ABSTRACT_BRIEF_DESCRIPTION__DESCRIPTION));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getVSSSTermAccess().getNameSTRINGTerminalRuleCall_2_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getVSSSTermAccess().getDescriptionDRunParserRuleCall_4_0(), semanticObject.getDescription());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     VSSSTermsDefinitionsAbbreviations returns VSSSTermsDefinitionsAbbreviations
	 *
	 * Constraint:
	 *     (terms+=VSSSTerm* definitions+=VSSSDefinition* abbreviations+=VSSSAbbreviation*)
	 */
	protected void sequence_VSSSTermsDefinitionsAbbreviations(ISerializationContext context, VSSSTermsDefinitionsAbbreviations semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     VSSSValidationApproach returns VSSSValidationApproach
	 *
	 * Constraint:
	 *     (sssItems+=VSSSDocumentItem* sssRequirementSubsections+=VSSSInstantiableRequirementSection*)
	 */
	protected void sequence_VSSSValidationApproach(ISerializationContext context, VSSSValidationApproach semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     VSSSValidationRequirements returns VSSSValidationRequirements
	 *
	 * Constraint:
	 *     (sssItems+=VSSSDocumentItem* sssRequirementSubsections+=VSSSInstantiableRequirementSection*)
	 */
	protected void sequence_VSSSValidationRequirements(ISerializationContext context, VSSSValidationRequirements semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     VSSSVerificationRequirements returns VSSSVerificationRequirements
	 *
	 * Constraint:
	 *     (sssItems+=VSSSDocumentItem* sssRequirementSubsections+=VSSSInstantiableRequirementSection*)
	 */
	protected void sequence_VSSSVerificationRequirements(ISerializationContext context, VSSSVerificationRequirements semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     VSSSVerificationValidationIntegrationRequirements returns VSSSVerificationValidationIntegrationRequirements
	 *
	 * Constraint:
	 *     (
	 *         sectionDescription=DBody? 
	 *         verificationValidationProcess=VSSSVerificationValidationProcessRequirements 
	 *         validationApproach=VSSSValidationApproach 
	 *         validation=VSSSValidationRequirements 
	 *         verification=VSSSVerificationRequirements
	 *     )
	 */
	protected void sequence_VSSSVerificationValidationIntegrationRequirements(ISerializationContext context, VSSSVerificationValidationIntegrationRequirements semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     VSSSVerificationValidationProcessRequirements returns VSSSVerificationValidationProcessRequirements
	 *
	 * Constraint:
	 *     (sssItems+=VSSSDocumentItem* sssRequirementSubsections+=VSSSInstantiableRequirementSection*)
	 */
	protected void sequence_VSSSVerificationValidationProcessRequirements(ISerializationContext context, VSSSVerificationValidationProcessRequirements semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
}
