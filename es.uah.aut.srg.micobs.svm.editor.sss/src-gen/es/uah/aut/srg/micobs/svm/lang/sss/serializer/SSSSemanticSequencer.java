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
import es.uah.aut.srg.micobs.doctpl.doc.DBody;
import es.uah.aut.srg.micobs.doctpl.doc.DCell;
import es.uah.aut.srg.micobs.doctpl.doc.DColumn;
import es.uah.aut.srg.micobs.doctpl.doc.DEnumerate;
import es.uah.aut.srg.micobs.doctpl.doc.DHyperlink;
import es.uah.aut.srg.micobs.doctpl.doc.DItemize;
import es.uah.aut.srg.micobs.doctpl.doc.DListItem;
import es.uah.aut.srg.micobs.doctpl.doc.DParagraph;
import es.uah.aut.srg.micobs.doctpl.doc.DReferenceDocument;
import es.uah.aut.srg.micobs.doctpl.doc.DReferenceableObject;
import es.uah.aut.srg.micobs.doctpl.doc.DRow;
import es.uah.aut.srg.micobs.doctpl.doc.DRun;
import es.uah.aut.srg.micobs.doctpl.doc.DText;
import es.uah.aut.srg.micobs.doctpl.doc.docPackage;
import es.uah.aut.srg.micobs.svm.lang.sss.services.SSSGrammarAccess;
import es.uah.aut.srg.micobs.svm.sss.VSSSAbbreviation;
import es.uah.aut.srg.micobs.svm.sss.VSSSAdaptationMissionizationRequirement;
import es.uah.aut.srg.micobs.svm.sss.VSSSApplicableDocuments;
import es.uah.aut.srg.micobs.svm.sss.VSSSCapabilitiesRequirement;
import es.uah.aut.srg.micobs.svm.sss.VSSSComputerResourceRequirement;
import es.uah.aut.srg.micobs.svm.sss.VSSSDefinition;
import es.uah.aut.srg.micobs.svm.sss.VSSSDesignRequirement;
import es.uah.aut.srg.micobs.svm.sss.VSSSDocument;
import es.uah.aut.srg.micobs.svm.sss.VSSSDocumentItem;
import es.uah.aut.srg.micobs.svm.sss.VSSSGeneralDescription;
import es.uah.aut.srg.micobs.svm.sss.VSSSGeneralDescriptionSubsection;
import es.uah.aut.srg.micobs.svm.sss.VSSSGeneralRequirement;
import es.uah.aut.srg.micobs.svm.sss.VSSSIntroduction;
import es.uah.aut.srg.micobs.svm.sss.VSSSQualityRequirement;
import es.uah.aut.srg.micobs.svm.sss.VSSSReferenceDocuments;
import es.uah.aut.srg.micobs.svm.sss.VSSSReliabiltyAvailabilityRequirement;
import es.uah.aut.srg.micobs.svm.sss.VSSSSafetyRequirement;
import es.uah.aut.srg.micobs.svm.sss.VSSSSecurityRequirement;
import es.uah.aut.srg.micobs.svm.sss.VSSSSoftwareMaintenanceRequirement;
import es.uah.aut.srg.micobs.svm.sss.VSSSSoftwareOperationsRequirement;
import es.uah.aut.srg.micobs.svm.sss.VSSSSpecificRequirements;
import es.uah.aut.srg.micobs.svm.sss.VSSSSystemInterfaceRequirement;
import es.uah.aut.srg.micobs.svm.sss.VSSSSystemModel;
import es.uah.aut.srg.micobs.svm.sss.VSSSSystemModels;
import es.uah.aut.srg.micobs.svm.sss.VSSSSystemSoftwareObservabilityRequirement;
import es.uah.aut.srg.micobs.svm.sss.VSSSTerm;
import es.uah.aut.srg.micobs.svm.sss.VSSSTermsDefinitionsAbbreviations;
import es.uah.aut.srg.micobs.svm.sss.VSSSValidationApproach;
import es.uah.aut.srg.micobs.svm.sss.VSSSValidationRequirement;
import es.uah.aut.srg.micobs.svm.sss.VSSSVerificationRequirement;
import es.uah.aut.srg.micobs.svm.sss.VSSSVerificationValidationIntegrationRequirements;
import es.uah.aut.srg.micobs.svm.sss.VSSSVerificationValidationProcessRequirement;
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
			case docPackage.DBODY:
				sequence_DBody_Impl(context, (DBody) semanticObject); 
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
			case docPackage.DREFERENCEABLE_OBJECT:
				sequence_DReferenceableObject_Impl(context, (DReferenceableObject) semanticObject); 
				return; 
			case docPackage.DROW:
				sequence_DRow(context, (DRow) semanticObject); 
				return; 
			case docPackage.DRUN:
				sequence_DRun(context, (DRun) semanticObject); 
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
			case sssPackage.VSSS_ADAPTATION_MISSIONIZATION_REQUIREMENT:
				sequence_VSSSAdaptationMissionizationRequirement(context, (VSSSAdaptationMissionizationRequirement) semanticObject); 
				return; 
			case sssPackage.VSSS_APPLICABLE_DOCUMENTS:
				sequence_VSSSApplicableDocuments(context, (VSSSApplicableDocuments) semanticObject); 
				return; 
			case sssPackage.VSSS_CAPABILITIES_REQUIREMENT:
				sequence_VSSSCapabilitiesRequirement(context, (VSSSCapabilitiesRequirement) semanticObject); 
				return; 
			case sssPackage.VSSS_COMPUTER_RESOURCE_REQUIREMENT:
				sequence_VSSSComputerResourceRequirement(context, (VSSSComputerResourceRequirement) semanticObject); 
				return; 
			case sssPackage.VSSS_DEFINITION:
				sequence_VSSSDefinition(context, (VSSSDefinition) semanticObject); 
				return; 
			case sssPackage.VSSS_DESIGN_REQUIREMENT:
				sequence_VSSSDesignRequirement(context, (VSSSDesignRequirement) semanticObject); 
				return; 
			case sssPackage.VSSS_DOCUMENT:
				sequence_VSSSDocument(context, (VSSSDocument) semanticObject); 
				return; 
			case sssPackage.VSSS_DOCUMENT_ITEM:
				sequence_VSSSDocumentItem(context, (VSSSDocumentItem) semanticObject); 
				return; 
			case sssPackage.VSSS_GENERAL_DESCRIPTION:
				sequence_VSSSGeneralDescription(context, (VSSSGeneralDescription) semanticObject); 
				return; 
			case sssPackage.VSSS_GENERAL_DESCRIPTION_SUBSECTION:
				sequence_VSSSGeneralDescriptionSubsection(context, (VSSSGeneralDescriptionSubsection) semanticObject); 
				return; 
			case sssPackage.VSSS_GENERAL_REQUIREMENT:
				sequence_VSSSGeneralRequirement(context, (VSSSGeneralRequirement) semanticObject); 
				return; 
			case sssPackage.VSSS_INTRODUCTION:
				sequence_VSSSIntroduction(context, (VSSSIntroduction) semanticObject); 
				return; 
			case sssPackage.VSSS_QUALITY_REQUIREMENT:
				sequence_VSSSQualityRequirement(context, (VSSSQualityRequirement) semanticObject); 
				return; 
			case sssPackage.VSSS_REFERENCE_DOCUMENTS:
				sequence_VSSSReferenceDocuments(context, (VSSSReferenceDocuments) semanticObject); 
				return; 
			case sssPackage.VSSS_RELIABILTY_AVAILABILITY_REQUIREMENT:
				sequence_VSSSReliabiltyAvailabilityRequirement(context, (VSSSReliabiltyAvailabilityRequirement) semanticObject); 
				return; 
			case sssPackage.VSSS_SAFETY_REQUIREMENT:
				sequence_VSSSSafetyRequirement(context, (VSSSSafetyRequirement) semanticObject); 
				return; 
			case sssPackage.VSSS_SECURITY_REQUIREMENT:
				sequence_VSSSSecurityRequirement(context, (VSSSSecurityRequirement) semanticObject); 
				return; 
			case sssPackage.VSSS_SOFTWARE_MAINTENANCE_REQUIREMENT:
				sequence_VSSSSoftwareMaintenanceRequirement(context, (VSSSSoftwareMaintenanceRequirement) semanticObject); 
				return; 
			case sssPackage.VSSS_SOFTWARE_OPERATIONS_REQUIREMENT:
				sequence_VSSSSoftwareOperationsRequirement(context, (VSSSSoftwareOperationsRequirement) semanticObject); 
				return; 
			case sssPackage.VSSS_SPECIFIC_REQUIREMENTS:
				sequence_VSSSSpecificRequirements(context, (VSSSSpecificRequirements) semanticObject); 
				return; 
			case sssPackage.VSSS_SYSTEM_INTERFACE_REQUIREMENT:
				sequence_VSSSSystemInterfaceRequirement(context, (VSSSSystemInterfaceRequirement) semanticObject); 
				return; 
			case sssPackage.VSSS_SYSTEM_MODEL:
				sequence_VSSSSystemModel(context, (VSSSSystemModel) semanticObject); 
				return; 
			case sssPackage.VSSS_SYSTEM_MODELS:
				sequence_VSSSSystemModels(context, (VSSSSystemModels) semanticObject); 
				return; 
			case sssPackage.VSSS_SYSTEM_SOFTWARE_OBSERVABILITY_REQUIREMENT:
				sequence_VSSSSystemSoftwareObservabilityRequirement(context, (VSSSSystemSoftwareObservabilityRequirement) semanticObject); 
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
			case sssPackage.VSSS_VALIDATION_REQUIREMENT:
				sequence_VSSSValidationRequirement(context, (VSSSValidationRequirement) semanticObject); 
				return; 
			case sssPackage.VSSS_VERIFICATION_REQUIREMENT:
				sequence_VSSSVerificationRequirement(context, (VSSSVerificationRequirement) semanticObject); 
				return; 
			case sssPackage.VSSS_VERIFICATION_VALIDATION_INTEGRATION_REQUIREMENTS:
				sequence_VSSSVerificationValidationIntegrationRequirements(context, (VSSSVerificationValidationIntegrationRequirements) semanticObject); 
				return; 
			case sssPackage.VSSS_VERIFICATION_VALIDATION_PROCESS_REQUIREMENT:
				sequence_VSSSVerificationValidationProcessRequirement(context, (VSSSVerificationValidationProcessRequirement) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Contexts:
	 *     DReferenceableObject returns DApplicableDocument
	 *     DApplicableDocument returns DApplicableDocument
	 *
	 * Constraint:
	 *     (title=EString issue=EString revision=EString)
	 */
	protected void sequence_DApplicableDocument(ISerializationContext context, DApplicableDocument semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, docPackage.Literals.DABSTRACT_RELATED_DOCUMENT__TITLE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, docPackage.Literals.DABSTRACT_RELATED_DOCUMENT__TITLE));
			if (transientValues.isValueTransient(semanticObject, docPackage.Literals.DABSTRACT_RELATED_DOCUMENT__ISSUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, docPackage.Literals.DABSTRACT_RELATED_DOCUMENT__ISSUE));
			if (transientValues.isValueTransient(semanticObject, docPackage.Literals.DABSTRACT_RELATED_DOCUMENT__REVISION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, docPackage.Literals.DABSTRACT_RELATED_DOCUMENT__REVISION));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getDApplicableDocumentAccess().getTitleEStringParserRuleCall_3_0(), semanticObject.getTitle());
		feeder.accept(grammarAccess.getDApplicableDocumentAccess().getIssueEStringParserRuleCall_5_0(), semanticObject.getIssue());
		feeder.accept(grammarAccess.getDApplicableDocumentAccess().getRevisionEStringParserRuleCall_7_0(), semanticObject.getRevision());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     DBody returns DBody
	 *     DBody_Impl returns DBody
	 *
	 * Constraint:
	 *     (bodyContent+=DBodyContent bodyContent+=DBodyContent*)
	 */
	protected void sequence_DBody_Impl(ISerializationContext context, DBody semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     DBody returns DCell
	 *     DCell returns DCell
	 *
	 * Constraint:
	 *     (bodyContent+=DBodyContent bodyContent+=DBodyContent*)
	 */
	protected void sequence_DCell(ISerializationContext context, DCell semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     DColumn returns DColumn
	 *
	 * Constraint:
	 *     (span=EString cells+=DCell cells+=DCell*)
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
	 *     (items+=DListItem items+=DListItem*)
	 */
	protected void sequence_DEnumerate(ISerializationContext context, DEnumerate semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     DParagraphContent returns DHyperlink
	 *     DHyperlink returns DHyperlink
	 *
	 * Constraint:
	 *     (reference=[DReferenceableObject|EString] run=DRun)
	 */
	protected void sequence_DHyperlink(ISerializationContext context, DHyperlink semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, docPackage.Literals.DHYPERLINK__REFERENCE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, docPackage.Literals.DHYPERLINK__REFERENCE));
			if (transientValues.isValueTransient(semanticObject, docPackage.Literals.DHYPERLINK__RUN) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, docPackage.Literals.DHYPERLINK__RUN));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getDHyperlinkAccess().getReferenceDReferenceableObjectEStringParserRuleCall_3_0_1(), semanticObject.getReference());
		feeder.accept(grammarAccess.getDHyperlinkAccess().getRunDRunParserRuleCall_5_0(), semanticObject.getRun());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     DBodyContent returns DItemize
	 *     DListContent returns DItemize
	 *     DItemize returns DItemize
	 *
	 * Constraint:
	 *     (items+=DListItem items+=DListItem*)
	 */
	protected void sequence_DItemize(ISerializationContext context, DItemize semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     DListItem returns DListItem
	 *
	 * Constraint:
	 *     (paragraph+=DParagraph paragraph+=DParagraph* sublist=DListContent?)
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
	 *     (paragraphContent+=DParagraphContent paragraphContent+=DParagraphContent*)
	 */
	protected void sequence_DParagraph(ISerializationContext context, DParagraph semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     DReferenceableObject returns DReferenceDocument
	 *     DReferenceDocument returns DReferenceDocument
	 *
	 * Constraint:
	 *     (title=EString issue=EString revision=EString)
	 */
	protected void sequence_DReferenceDocument(ISerializationContext context, DReferenceDocument semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, docPackage.Literals.DABSTRACT_RELATED_DOCUMENT__TITLE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, docPackage.Literals.DABSTRACT_RELATED_DOCUMENT__TITLE));
			if (transientValues.isValueTransient(semanticObject, docPackage.Literals.DABSTRACT_RELATED_DOCUMENT__ISSUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, docPackage.Literals.DABSTRACT_RELATED_DOCUMENT__ISSUE));
			if (transientValues.isValueTransient(semanticObject, docPackage.Literals.DABSTRACT_RELATED_DOCUMENT__REVISION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, docPackage.Literals.DABSTRACT_RELATED_DOCUMENT__REVISION));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getDReferenceDocumentAccess().getTitleEStringParserRuleCall_3_0(), semanticObject.getTitle());
		feeder.accept(grammarAccess.getDReferenceDocumentAccess().getIssueEStringParserRuleCall_5_0(), semanticObject.getIssue());
		feeder.accept(grammarAccess.getDReferenceDocumentAccess().getRevisionEStringParserRuleCall_7_0(), semanticObject.getRevision());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     DReferenceableObject returns DReferenceableObject
	 *     DReferenceableObject_Impl returns DReferenceableObject
	 *
	 * Constraint:
	 *     {DReferenceableObject}
	 */
	protected void sequence_DReferenceableObject_Impl(ISerializationContext context, DReferenceableObject semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     DRow returns DRow
	 *
	 * Constraint:
	 *     (span=EString columns+=DColumn columns+=DColumn*)
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
	 *     (bold=DRunFormatEnableDisable italic=DRunFormatEnableDisable underscore=DRunFormatEnableDisable text=DText)
	 */
	protected void sequence_DRun(ISerializationContext context, DRun semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, docPackage.Literals.DRUN__BOLD) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, docPackage.Literals.DRUN__BOLD));
			if (transientValues.isValueTransient(semanticObject, docPackage.Literals.DRUN__ITALIC) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, docPackage.Literals.DRUN__ITALIC));
			if (transientValues.isValueTransient(semanticObject, docPackage.Literals.DRUN__UNDERSCORE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, docPackage.Literals.DRUN__UNDERSCORE));
			if (transientValues.isValueTransient(semanticObject, docPackage.Literals.DRUN__TEXT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, docPackage.Literals.DRUN__TEXT));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getDRunAccess().getBoldDRunFormatEnableDisableEnumRuleCall_3_0(), semanticObject.getBold());
		feeder.accept(grammarAccess.getDRunAccess().getItalicDRunFormatEnableDisableEnumRuleCall_5_0(), semanticObject.getItalic());
		feeder.accept(grammarAccess.getDRunAccess().getUnderscoreDRunFormatEnableDisableEnumRuleCall_7_0(), semanticObject.getUnderscore());
		feeder.accept(grammarAccess.getDRunAccess().getTextDTextParserRuleCall_9_0(), semanticObject.getText());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     DText returns DText
	 *
	 * Constraint:
	 *     content=EString
	 */
	protected void sequence_DText(ISerializationContext context, DText semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, docPackage.Literals.DTEXT__CONTENT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, docPackage.Literals.DTEXT__CONTENT));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getDTextAccess().getContentEStringParserRuleCall_3_0(), semanticObject.getContent());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     VSSSAbbreviation returns VSSSAbbreviation
	 *
	 * Constraint:
	 *     (name=EString description=[DParagraph|EString])
	 */
	protected void sequence_VSSSAbbreviation(ISerializationContext context, VSSSAbbreviation semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, sssPackage.Literals.VSSS_BRIEF_DESCRIPTION__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, sssPackage.Literals.VSSS_BRIEF_DESCRIPTION__NAME));
			if (transientValues.isValueTransient(semanticObject, sssPackage.Literals.VSSS_BRIEF_DESCRIPTION__DESCRIPTION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, sssPackage.Literals.VSSS_BRIEF_DESCRIPTION__DESCRIPTION));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getVSSSAbbreviationAccess().getNameEStringParserRuleCall_1_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getVSSSAbbreviationAccess().getDescriptionDParagraphEStringParserRuleCall_4_0_1(), semanticObject.getDescription());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     VSSSAdaptationMissionizationRequirement returns VSSSAdaptationMissionizationRequirement
	 *
	 * Constraint:
	 *     (sssItems+=VSSSDocumentItem sssItems+=VSSSDocumentItem*)
	 */
	protected void sequence_VSSSAdaptationMissionizationRequirement(ISerializationContext context, VSSSAdaptationMissionizationRequirement semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     VSSSApplicableDocuments returns VSSSApplicableDocuments
	 *
	 * Constraint:
	 *     (applicableDocuments+=DApplicableDocument applicableDocuments+=DApplicableDocument*)?
	 */
	protected void sequence_VSSSApplicableDocuments(ISerializationContext context, VSSSApplicableDocuments semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     VSSSCapabilitiesRequirement returns VSSSCapabilitiesRequirement
	 *
	 * Constraint:
	 *     (sssItems+=VSSSDocumentItem sssItems+=VSSSDocumentItem*)
	 */
	protected void sequence_VSSSCapabilitiesRequirement(ISerializationContext context, VSSSCapabilitiesRequirement semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     VSSSComputerResourceRequirement returns VSSSComputerResourceRequirement
	 *
	 * Constraint:
	 *     (sssItems+=VSSSDocumentItem sssItems+=VSSSDocumentItem*)
	 */
	protected void sequence_VSSSComputerResourceRequirement(ISerializationContext context, VSSSComputerResourceRequirement semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     VSSSDefinition returns VSSSDefinition
	 *
	 * Constraint:
	 *     (name=EString description=[DParagraph|EString])
	 */
	protected void sequence_VSSSDefinition(ISerializationContext context, VSSSDefinition semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, sssPackage.Literals.VSSS_BRIEF_DESCRIPTION__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, sssPackage.Literals.VSSS_BRIEF_DESCRIPTION__NAME));
			if (transientValues.isValueTransient(semanticObject, sssPackage.Literals.VSSS_BRIEF_DESCRIPTION__DESCRIPTION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, sssPackage.Literals.VSSS_BRIEF_DESCRIPTION__DESCRIPTION));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getVSSSDefinitionAccess().getNameEStringParserRuleCall_1_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getVSSSDefinitionAccess().getDescriptionDParagraphEStringParserRuleCall_4_0_1(), semanticObject.getDescription());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     VSSSDesignRequirement returns VSSSDesignRequirement
	 *
	 * Constraint:
	 *     (sssItems+=VSSSDocumentItem sssItems+=VSSSDocumentItem*)
	 */
	protected void sequence_VSSSDesignRequirement(ISerializationContext context, VSSSDesignRequirement semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     VSSSDocumentItem returns VSSSDocumentItem
	 *
	 * Constraint:
	 *     (id=EString verificationMethod=VVerificationMethod body=[DBody|EString])
	 */
	protected void sequence_VSSSDocumentItem(ISerializationContext context, VSSSDocumentItem semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, tdmPackage.Literals.VTRACEABLE_DOCUMENT_ABSTRACT_ITEM__ID) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, tdmPackage.Literals.VTRACEABLE_DOCUMENT_ABSTRACT_ITEM__ID));
			if (transientValues.isValueTransient(semanticObject, tdmPackage.Literals.VTRACEABLE_DOCUMENT_ABSTRACT_ITEM__VERIFICATION_METHOD) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, tdmPackage.Literals.VTRACEABLE_DOCUMENT_ABSTRACT_ITEM__VERIFICATION_METHOD));
			if (transientValues.isValueTransient(semanticObject, sssPackage.Literals.VSSS_DOCUMENT_ITEM__BODY) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, sssPackage.Literals.VSSS_DOCUMENT_ITEM__BODY));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getVSSSDocumentItemAccess().getIdEStringParserRuleCall_3_0(), semanticObject.getId());
		feeder.accept(grammarAccess.getVSSSDocumentItemAccess().getVerificationMethodVVerificationMethodEnumRuleCall_5_0(), semanticObject.getVerificationMethod());
		feeder.accept(grammarAccess.getVSSSDocumentItemAccess().getBodyDBodyEStringParserRuleCall_7_0_1(), semanticObject.getBody());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     VSSSDocument returns VSSSDocument
	 *
	 * Constraint:
	 *     (
	 *         name=EString 
	 *         id=EString 
	 *         issue=EString 
	 *         revision=EString 
	 *         date=EString 
	 *         (parents+=[VTraceableDocument|EString] parents+=[VTraceableDocument|EString]*)? 
	 *         introductionSection=VSSSIntroduction 
	 *         applicableDocumentsSection=VSSSApplicableDocuments 
	 *         referenceDocumentsSection=VSSSReferenceDocuments 
	 *         termsDefinitionsAbbreviationsSection=VSSSTermsDefinitionsAbbreviations 
	 *         generalDescriptionSection=VSSSGeneralDescription 
	 *         specificRequirementsSection=VSSSSpecificRequirements 
	 *         verificationValidationIntegrationSection=VSSSVerificationValidationIntegrationRequirements 
	 *         systemModelsSection=VSSSSystemModels?
	 *     )
	 */
	protected void sequence_VSSSDocument(ISerializationContext context, VSSSDocument semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     VSSSGeneralDescriptionSubsection returns VSSSGeneralDescriptionSubsection
	 *
	 * Constraint:
	 *     body=[DBody|EString]
	 */
	protected void sequence_VSSSGeneralDescriptionSubsection(ISerializationContext context, VSSSGeneralDescriptionSubsection semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, sssPackage.Literals.VSSS_GENERAL_DESCRIPTION_SUBSECTION__BODY) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, sssPackage.Literals.VSSS_GENERAL_DESCRIPTION_SUBSECTION__BODY));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getVSSSGeneralDescriptionSubsectionAccess().getBodyDBodyEStringParserRuleCall_3_0_1(), semanticObject.getBody());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     VSSSGeneralDescription returns VSSSGeneralDescription
	 *
	 * Constraint:
	 *     (
	 *         productPerspective=VSSSGeneralDescriptionSubsection 
	 *         generalCapabilites=VSSSGeneralDescriptionSubsection 
	 *         generalConstraints=VSSSGeneralDescriptionSubsection 
	 *         operationalEnvironment=VSSSGeneralDescriptionSubsection 
	 *         assumptionsDependencies=VSSSGeneralDescriptionSubsection
	 *     )
	 */
	protected void sequence_VSSSGeneralDescription(ISerializationContext context, VSSSGeneralDescription semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, sssPackage.Literals.VSSS_GENERAL_DESCRIPTION__PRODUCT_PERSPECTIVE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, sssPackage.Literals.VSSS_GENERAL_DESCRIPTION__PRODUCT_PERSPECTIVE));
			if (transientValues.isValueTransient(semanticObject, sssPackage.Literals.VSSS_GENERAL_DESCRIPTION__GENERAL_CAPABILITES) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, sssPackage.Literals.VSSS_GENERAL_DESCRIPTION__GENERAL_CAPABILITES));
			if (transientValues.isValueTransient(semanticObject, sssPackage.Literals.VSSS_GENERAL_DESCRIPTION__GENERAL_CONSTRAINTS) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, sssPackage.Literals.VSSS_GENERAL_DESCRIPTION__GENERAL_CONSTRAINTS));
			if (transientValues.isValueTransient(semanticObject, sssPackage.Literals.VSSS_GENERAL_DESCRIPTION__OPERATIONAL_ENVIRONMENT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, sssPackage.Literals.VSSS_GENERAL_DESCRIPTION__OPERATIONAL_ENVIRONMENT));
			if (transientValues.isValueTransient(semanticObject, sssPackage.Literals.VSSS_GENERAL_DESCRIPTION__ASSUMPTIONS_DEPENDENCIES) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, sssPackage.Literals.VSSS_GENERAL_DESCRIPTION__ASSUMPTIONS_DEPENDENCIES));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getVSSSGeneralDescriptionAccess().getProductPerspectiveVSSSGeneralDescriptionSubsectionParserRuleCall_3_0(), semanticObject.getProductPerspective());
		feeder.accept(grammarAccess.getVSSSGeneralDescriptionAccess().getGeneralCapabilitesVSSSGeneralDescriptionSubsectionParserRuleCall_5_0(), semanticObject.getGeneralCapabilites());
		feeder.accept(grammarAccess.getVSSSGeneralDescriptionAccess().getGeneralConstraintsVSSSGeneralDescriptionSubsectionParserRuleCall_7_0(), semanticObject.getGeneralConstraints());
		feeder.accept(grammarAccess.getVSSSGeneralDescriptionAccess().getOperationalEnvironmentVSSSGeneralDescriptionSubsectionParserRuleCall_9_0(), semanticObject.getOperationalEnvironment());
		feeder.accept(grammarAccess.getVSSSGeneralDescriptionAccess().getAssumptionsDependenciesVSSSGeneralDescriptionSubsectionParserRuleCall_11_0(), semanticObject.getAssumptionsDependencies());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     VSSSGeneralRequirement returns VSSSGeneralRequirement
	 *
	 * Constraint:
	 *     (sssItems+=VSSSDocumentItem sssItems+=VSSSDocumentItem*)
	 */
	protected void sequence_VSSSGeneralRequirement(ISerializationContext context, VSSSGeneralRequirement semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     VSSSIntroduction returns VSSSIntroduction
	 *
	 * Constraint:
	 *     (purpose=DBody objetive=DBody content=DBody reason=DBody)
	 */
	protected void sequence_VSSSIntroduction(ISerializationContext context, VSSSIntroduction semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, sssPackage.Literals.VSSS_INTRODUCTION__PURPOSE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, sssPackage.Literals.VSSS_INTRODUCTION__PURPOSE));
			if (transientValues.isValueTransient(semanticObject, sssPackage.Literals.VSSS_INTRODUCTION__OBJETIVE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, sssPackage.Literals.VSSS_INTRODUCTION__OBJETIVE));
			if (transientValues.isValueTransient(semanticObject, sssPackage.Literals.VSSS_INTRODUCTION__CONTENT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, sssPackage.Literals.VSSS_INTRODUCTION__CONTENT));
			if (transientValues.isValueTransient(semanticObject, sssPackage.Literals.VSSS_INTRODUCTION__REASON) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, sssPackage.Literals.VSSS_INTRODUCTION__REASON));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getVSSSIntroductionAccess().getPurposeDBodyParserRuleCall_3_0(), semanticObject.getPurpose());
		feeder.accept(grammarAccess.getVSSSIntroductionAccess().getObjetiveDBodyParserRuleCall_5_0(), semanticObject.getObjetive());
		feeder.accept(grammarAccess.getVSSSIntroductionAccess().getContentDBodyParserRuleCall_7_0(), semanticObject.getContent());
		feeder.accept(grammarAccess.getVSSSIntroductionAccess().getReasonDBodyParserRuleCall_9_0(), semanticObject.getReason());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     VSSSQualityRequirement returns VSSSQualityRequirement
	 *
	 * Constraint:
	 *     (sssItems+=VSSSDocumentItem sssItems+=VSSSDocumentItem*)
	 */
	protected void sequence_VSSSQualityRequirement(ISerializationContext context, VSSSQualityRequirement semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     VSSSReferenceDocuments returns VSSSReferenceDocuments
	 *
	 * Constraint:
	 *     (referenceDocuments+=DReferenceDocument referenceDocuments+=DReferenceDocument*)?
	 */
	protected void sequence_VSSSReferenceDocuments(ISerializationContext context, VSSSReferenceDocuments semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     VSSSReliabiltyAvailabilityRequirement returns VSSSReliabiltyAvailabilityRequirement
	 *
	 * Constraint:
	 *     (sssItems+=VSSSDocumentItem sssItems+=VSSSDocumentItem*)
	 */
	protected void sequence_VSSSReliabiltyAvailabilityRequirement(ISerializationContext context, VSSSReliabiltyAvailabilityRequirement semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     VSSSSafetyRequirement returns VSSSSafetyRequirement
	 *
	 * Constraint:
	 *     (sssItems+=VSSSDocumentItem sssItems+=VSSSDocumentItem*)
	 */
	protected void sequence_VSSSSafetyRequirement(ISerializationContext context, VSSSSafetyRequirement semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     VSSSSecurityRequirement returns VSSSSecurityRequirement
	 *
	 * Constraint:
	 *     (sssItems+=VSSSDocumentItem sssItems+=VSSSDocumentItem*)
	 */
	protected void sequence_VSSSSecurityRequirement(ISerializationContext context, VSSSSecurityRequirement semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     VSSSSoftwareMaintenanceRequirement returns VSSSSoftwareMaintenanceRequirement
	 *
	 * Constraint:
	 *     (sssItems+=VSSSDocumentItem sssItems+=VSSSDocumentItem*)
	 */
	protected void sequence_VSSSSoftwareMaintenanceRequirement(ISerializationContext context, VSSSSoftwareMaintenanceRequirement semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     VSSSSoftwareOperationsRequirement returns VSSSSoftwareOperationsRequirement
	 *
	 * Constraint:
	 *     (sssItems+=VSSSDocumentItem sssItems+=VSSSDocumentItem*)
	 */
	protected void sequence_VSSSSoftwareOperationsRequirement(ISerializationContext context, VSSSSoftwareOperationsRequirement semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     VSSSSpecificRequirements returns VSSSSpecificRequirements
	 *
	 * Constraint:
	 *     (
	 *         (general+=VSSSGeneralRequirement general+=VSSSGeneralRequirement*)? 
	 *         (capabilities+=VSSSCapabilitiesRequirement capabilities+=VSSSCapabilitiesRequirement*)? 
	 *         (systemInterface+=VSSSSystemInterfaceRequirement systemInterface+=VSSSSystemInterfaceRequirement*)? 
	 *         (adaptationMissionization+=VSSSAdaptationMissionizationRequirement adaptationMissionization+=VSSSAdaptationMissionizationRequirement*)? 
	 *         (computerResource+=VSSSComputerResourceRequirement computerResource+=VSSSComputerResourceRequirement*)? 
	 *         (security+=VSSSSecurityRequirement security+=VSSSSecurityRequirement*)? 
	 *         (safety+=VSSSSafetyRequirement safety+=VSSSSafetyRequirement*)? 
	 *         (reliabiltyAvailability+=VSSSReliabiltyAvailabilityRequirement reliabiltyAvailability+=VSSSReliabiltyAvailabilityRequirement*)? 
	 *         (quality+=VSSSQualityRequirement quality+=VSSSQualityRequirement*)? 
	 *         (design+=VSSSDesignRequirement design+=VSSSDesignRequirement*)? 
	 *         (softwareOperations+=VSSSSoftwareOperationsRequirement softwareOperations+=VSSSSoftwareOperationsRequirement*)? 
	 *         (softwareMaintenance+=VSSSSoftwareMaintenanceRequirement softwareMaintenance+=VSSSSoftwareMaintenanceRequirement*)? 
	 *         (
	 *             systemSoftwareObservability+=VSSSSystemSoftwareObservabilityRequirement 
	 *             systemSoftwareObservability+=VSSSSystemSoftwareObservabilityRequirement*
	 *         )?
	 *     )
	 */
	protected void sequence_VSSSSpecificRequirements(ISerializationContext context, VSSSSpecificRequirements semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     VSSSSystemInterfaceRequirement returns VSSSSystemInterfaceRequirement
	 *
	 * Constraint:
	 *     (sssItems+=VSSSDocumentItem sssItems+=VSSSDocumentItem*)
	 */
	protected void sequence_VSSSSystemInterfaceRequirement(ISerializationContext context, VSSSSystemInterfaceRequirement semanticObject) {
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
	 *     (systemModels+=VSSSSystemModel systemModels+=VSSSSystemModel*)
	 */
	protected void sequence_VSSSSystemModels(ISerializationContext context, VSSSSystemModels semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     VSSSSystemSoftwareObservabilityRequirement returns VSSSSystemSoftwareObservabilityRequirement
	 *
	 * Constraint:
	 *     (sssItems+=VSSSDocumentItem sssItems+=VSSSDocumentItem*)
	 */
	protected void sequence_VSSSSystemSoftwareObservabilityRequirement(ISerializationContext context, VSSSSystemSoftwareObservabilityRequirement semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     VSSSTerm returns VSSSTerm
	 *
	 * Constraint:
	 *     (name=EString description=[DParagraph|EString])
	 */
	protected void sequence_VSSSTerm(ISerializationContext context, VSSSTerm semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, sssPackage.Literals.VSSS_BRIEF_DESCRIPTION__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, sssPackage.Literals.VSSS_BRIEF_DESCRIPTION__NAME));
			if (transientValues.isValueTransient(semanticObject, sssPackage.Literals.VSSS_BRIEF_DESCRIPTION__DESCRIPTION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, sssPackage.Literals.VSSS_BRIEF_DESCRIPTION__DESCRIPTION));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getVSSSTermAccess().getNameEStringParserRuleCall_1_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getVSSSTermAccess().getDescriptionDParagraphEStringParserRuleCall_4_0_1(), semanticObject.getDescription());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     VSSSTermsDefinitionsAbbreviations returns VSSSTermsDefinitionsAbbreviations
	 *
	 * Constraint:
	 *     (
	 *         (terms+=VSSSTerm terms+=VSSSTerm*)? 
	 *         (definitions+=VSSSDefinition definitions+=VSSSDefinition*)? 
	 *         (abbreviations+=VSSSAbbreviation abbreviations+=VSSSAbbreviation*)?
	 *     )
	 */
	protected void sequence_VSSSTermsDefinitionsAbbreviations(ISerializationContext context, VSSSTermsDefinitionsAbbreviations semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     VSSSValidationApproach returns VSSSValidationApproach
	 *
	 * Constraint:
	 *     (sssItems+=VSSSDocumentItem sssItems+=VSSSDocumentItem*)
	 */
	protected void sequence_VSSSValidationApproach(ISerializationContext context, VSSSValidationApproach semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     VSSSValidationRequirement returns VSSSValidationRequirement
	 *
	 * Constraint:
	 *     (sssItems+=VSSSDocumentItem sssItems+=VSSSDocumentItem*)
	 */
	protected void sequence_VSSSValidationRequirement(ISerializationContext context, VSSSValidationRequirement semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     VSSSVerificationRequirement returns VSSSVerificationRequirement
	 *
	 * Constraint:
	 *     (sssItems+=VSSSDocumentItem sssItems+=VSSSDocumentItem*)
	 */
	protected void sequence_VSSSVerificationRequirement(ISerializationContext context, VSSSVerificationRequirement semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     VSSSVerificationValidationIntegrationRequirements returns VSSSVerificationValidationIntegrationRequirements
	 *
	 * Constraint:
	 *     (
	 *         (
	 *             verificationValidationProcess+=VSSSVerificationValidationProcessRequirement 
	 *             verificationValidationProcess+=VSSSVerificationValidationProcessRequirement*
	 *         )? 
	 *         (validationApproach+=VSSSValidationApproach validationApproach+=VSSSValidationApproach*)? 
	 *         (validation+=VSSSValidationRequirement validation+=VSSSValidationRequirement*)? 
	 *         (verification+=VSSSVerificationRequirement verification+=VSSSVerificationRequirement*)?
	 *     )
	 */
	protected void sequence_VSSSVerificationValidationIntegrationRequirements(ISerializationContext context, VSSSVerificationValidationIntegrationRequirements semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     VSSSVerificationValidationProcessRequirement returns VSSSVerificationValidationProcessRequirement
	 *
	 * Constraint:
	 *     (sssItems+=VSSSDocumentItem sssItems+=VSSSDocumentItem*)
	 */
	protected void sequence_VSSSVerificationValidationProcessRequirement(ISerializationContext context, VSSSVerificationValidationProcessRequirement semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
}
