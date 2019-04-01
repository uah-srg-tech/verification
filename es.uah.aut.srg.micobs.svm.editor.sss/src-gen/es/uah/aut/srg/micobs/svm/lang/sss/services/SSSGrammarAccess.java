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
package es.uah.aut.srg.micobs.svm.lang.sss.services;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.List;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Alternatives;
import org.eclipse.xtext.Assignment;
import org.eclipse.xtext.CrossReference;
import org.eclipse.xtext.EnumLiteralDeclaration;
import org.eclipse.xtext.EnumRule;
import org.eclipse.xtext.Grammar;
import org.eclipse.xtext.GrammarUtil;
import org.eclipse.xtext.Group;
import org.eclipse.xtext.Keyword;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.TerminalRule;
import org.eclipse.xtext.common.services.TerminalsGrammarAccess;
import org.eclipse.xtext.service.AbstractElementFinder.AbstractEnumRuleElementFinder;
import org.eclipse.xtext.service.AbstractElementFinder.AbstractGrammarElementFinder;
import org.eclipse.xtext.service.GrammarProvider;

@Singleton
public class SSSGrammarAccess extends AbstractGrammarElementFinder {
	
	public class VSSSDocumentElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.micobs.svm.lang.sss.SSS.VSSSDocument");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cVSSSDocumentKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameEStringParserRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Keyword cIdKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Assignment cIdAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cIdEStringParserRuleCall_4_0 = (RuleCall)cIdAssignment_4.eContents().get(0);
		private final Keyword cIssueKeyword_5 = (Keyword)cGroup.eContents().get(5);
		private final Assignment cIssueAssignment_6 = (Assignment)cGroup.eContents().get(6);
		private final RuleCall cIssueEStringParserRuleCall_6_0 = (RuleCall)cIssueAssignment_6.eContents().get(0);
		private final Keyword cRevisionKeyword_7 = (Keyword)cGroup.eContents().get(7);
		private final Assignment cRevisionAssignment_8 = (Assignment)cGroup.eContents().get(8);
		private final RuleCall cRevisionEStringParserRuleCall_8_0 = (RuleCall)cRevisionAssignment_8.eContents().get(0);
		private final Keyword cDateKeyword_9 = (Keyword)cGroup.eContents().get(9);
		private final Assignment cDateAssignment_10 = (Assignment)cGroup.eContents().get(10);
		private final RuleCall cDateEStringParserRuleCall_10_0 = (RuleCall)cDateAssignment_10.eContents().get(0);
		private final Group cGroup_11 = (Group)cGroup.eContents().get(11);
		private final Keyword cParentsKeyword_11_0 = (Keyword)cGroup_11.eContents().get(0);
		private final Keyword cLeftParenthesisKeyword_11_1 = (Keyword)cGroup_11.eContents().get(1);
		private final Assignment cParentsAssignment_11_2 = (Assignment)cGroup_11.eContents().get(2);
		private final CrossReference cParentsVTraceableDocumentCrossReference_11_2_0 = (CrossReference)cParentsAssignment_11_2.eContents().get(0);
		private final RuleCall cParentsVTraceableDocumentEStringParserRuleCall_11_2_0_1 = (RuleCall)cParentsVTraceableDocumentCrossReference_11_2_0.eContents().get(1);
		private final Group cGroup_11_3 = (Group)cGroup_11.eContents().get(3);
		private final Keyword cCommaKeyword_11_3_0 = (Keyword)cGroup_11_3.eContents().get(0);
		private final Assignment cParentsAssignment_11_3_1 = (Assignment)cGroup_11_3.eContents().get(1);
		private final CrossReference cParentsVTraceableDocumentCrossReference_11_3_1_0 = (CrossReference)cParentsAssignment_11_3_1.eContents().get(0);
		private final RuleCall cParentsVTraceableDocumentEStringParserRuleCall_11_3_1_0_1 = (RuleCall)cParentsVTraceableDocumentCrossReference_11_3_1_0.eContents().get(1);
		private final Keyword cRightParenthesisKeyword_11_4 = (Keyword)cGroup_11.eContents().get(4);
		private final Keyword cIntroductionSectionKeyword_12 = (Keyword)cGroup.eContents().get(12);
		private final Assignment cIntroductionSectionAssignment_13 = (Assignment)cGroup.eContents().get(13);
		private final RuleCall cIntroductionSectionVSSSIntroductionParserRuleCall_13_0 = (RuleCall)cIntroductionSectionAssignment_13.eContents().get(0);
		private final Keyword cApplicableDocumentsSectionKeyword_14 = (Keyword)cGroup.eContents().get(14);
		private final Assignment cApplicableDocumentsSectionAssignment_15 = (Assignment)cGroup.eContents().get(15);
		private final RuleCall cApplicableDocumentsSectionVSSSApplicableDocumentsParserRuleCall_15_0 = (RuleCall)cApplicableDocumentsSectionAssignment_15.eContents().get(0);
		private final Keyword cReferenceDocumentsSectionKeyword_16 = (Keyword)cGroup.eContents().get(16);
		private final Assignment cReferenceDocumentsSectionAssignment_17 = (Assignment)cGroup.eContents().get(17);
		private final RuleCall cReferenceDocumentsSectionVSSSReferenceDocumentsParserRuleCall_17_0 = (RuleCall)cReferenceDocumentsSectionAssignment_17.eContents().get(0);
		private final Keyword cTermsDefinitionsAbbreviationsSectionKeyword_18 = (Keyword)cGroup.eContents().get(18);
		private final Assignment cTermsDefinitionsAbbreviationsSectionAssignment_19 = (Assignment)cGroup.eContents().get(19);
		private final RuleCall cTermsDefinitionsAbbreviationsSectionVSSSTermsDefinitionsAbbreviationsParserRuleCall_19_0 = (RuleCall)cTermsDefinitionsAbbreviationsSectionAssignment_19.eContents().get(0);
		private final Keyword cGeneralDescriptionSectionKeyword_20 = (Keyword)cGroup.eContents().get(20);
		private final Assignment cGeneralDescriptionSectionAssignment_21 = (Assignment)cGroup.eContents().get(21);
		private final RuleCall cGeneralDescriptionSectionVSSSGeneralDescriptionParserRuleCall_21_0 = (RuleCall)cGeneralDescriptionSectionAssignment_21.eContents().get(0);
		private final Keyword cSpecificRequirementsSectionKeyword_22 = (Keyword)cGroup.eContents().get(22);
		private final Assignment cSpecificRequirementsSectionAssignment_23 = (Assignment)cGroup.eContents().get(23);
		private final RuleCall cSpecificRequirementsSectionVSSSSpecificRequirementsParserRuleCall_23_0 = (RuleCall)cSpecificRequirementsSectionAssignment_23.eContents().get(0);
		private final Keyword cVerificationValidationIntegrationSectionKeyword_24 = (Keyword)cGroup.eContents().get(24);
		private final Assignment cVerificationValidationIntegrationSectionAssignment_25 = (Assignment)cGroup.eContents().get(25);
		private final RuleCall cVerificationValidationIntegrationSectionVSSSVerificationValidationIntegrationRequirementsParserRuleCall_25_0 = (RuleCall)cVerificationValidationIntegrationSectionAssignment_25.eContents().get(0);
		private final Group cGroup_26 = (Group)cGroup.eContents().get(26);
		private final Keyword cSystemModelsSectionKeyword_26_0 = (Keyword)cGroup_26.eContents().get(0);
		private final Assignment cSystemModelsSectionAssignment_26_1 = (Assignment)cGroup_26.eContents().get(1);
		private final RuleCall cSystemModelsSectionVSSSSystemModelsParserRuleCall_26_1_0 = (RuleCall)cSystemModelsSectionAssignment_26_1.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_27 = (Keyword)cGroup.eContents().get(27);
		
		//VSSSDocument:
		//	'VSSSDocument'
		//	name=EString
		//	'{'
		//	'id' id=EString
		//	'issue' issue=EString
		//	'revision' revision=EString
		//	'date' date=EString ('parents' '(' parents+=[tdm::VTraceableDocument|EString] (","
		//	parents+=[tdm::VTraceableDocument|EString])* ')')?
		//	'introductionSection' introductionSection=VSSSIntroduction
		//	'applicableDocumentsSection' applicableDocumentsSection=VSSSApplicableDocuments
		//	'referenceDocumentsSection' referenceDocumentsSection=VSSSReferenceDocuments
		//	'termsDefinitionsAbbreviationsSection' termsDefinitionsAbbreviationsSection=VSSSTermsDefinitionsAbbreviations
		//	'generalDescriptionSection' generalDescriptionSection=VSSSGeneralDescription
		//	'specificRequirementsSection' specificRequirementsSection=VSSSSpecificRequirements
		//	'verificationValidationIntegrationSection'
		//	verificationValidationIntegrationSection=VSSSVerificationValidationIntegrationRequirements ('systemModelsSection'
		//	systemModelsSection=VSSSSystemModels)?
		//	'}';
		@Override public ParserRule getRule() { return rule; }
		
		//'VSSSDocument' name=EString '{' 'id' id=EString 'issue' issue=EString 'revision' revision=EString 'date' date=EString
		//('parents' '(' parents+=[tdm::VTraceableDocument|EString] ("," parents+=[tdm::VTraceableDocument|EString])* ')')?
		//'introductionSection' introductionSection=VSSSIntroduction 'applicableDocumentsSection'
		//applicableDocumentsSection=VSSSApplicableDocuments 'referenceDocumentsSection'
		//referenceDocumentsSection=VSSSReferenceDocuments 'termsDefinitionsAbbreviationsSection'
		//termsDefinitionsAbbreviationsSection=VSSSTermsDefinitionsAbbreviations 'generalDescriptionSection'
		//generalDescriptionSection=VSSSGeneralDescription 'specificRequirementsSection'
		//specificRequirementsSection=VSSSSpecificRequirements 'verificationValidationIntegrationSection'
		//verificationValidationIntegrationSection=VSSSVerificationValidationIntegrationRequirements ('systemModelsSection'
		//systemModelsSection=VSSSSystemModels)? '}'
		public Group getGroup() { return cGroup; }
		
		//'VSSSDocument'
		public Keyword getVSSSDocumentKeyword_0() { return cVSSSDocumentKeyword_0; }
		
		//name=EString
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }
		
		//EString
		public RuleCall getNameEStringParserRuleCall_1_0() { return cNameEStringParserRuleCall_1_0; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_2() { return cLeftCurlyBracketKeyword_2; }
		
		//'id'
		public Keyword getIdKeyword_3() { return cIdKeyword_3; }
		
		//id=EString
		public Assignment getIdAssignment_4() { return cIdAssignment_4; }
		
		//EString
		public RuleCall getIdEStringParserRuleCall_4_0() { return cIdEStringParserRuleCall_4_0; }
		
		//'issue'
		public Keyword getIssueKeyword_5() { return cIssueKeyword_5; }
		
		//issue=EString
		public Assignment getIssueAssignment_6() { return cIssueAssignment_6; }
		
		//EString
		public RuleCall getIssueEStringParserRuleCall_6_0() { return cIssueEStringParserRuleCall_6_0; }
		
		//'revision'
		public Keyword getRevisionKeyword_7() { return cRevisionKeyword_7; }
		
		//revision=EString
		public Assignment getRevisionAssignment_8() { return cRevisionAssignment_8; }
		
		//EString
		public RuleCall getRevisionEStringParserRuleCall_8_0() { return cRevisionEStringParserRuleCall_8_0; }
		
		//'date'
		public Keyword getDateKeyword_9() { return cDateKeyword_9; }
		
		//date=EString
		public Assignment getDateAssignment_10() { return cDateAssignment_10; }
		
		//EString
		public RuleCall getDateEStringParserRuleCall_10_0() { return cDateEStringParserRuleCall_10_0; }
		
		//('parents' '(' parents+=[tdm::VTraceableDocument|EString] ("," parents+=[tdm::VTraceableDocument|EString])* ')')?
		public Group getGroup_11() { return cGroup_11; }
		
		//'parents'
		public Keyword getParentsKeyword_11_0() { return cParentsKeyword_11_0; }
		
		//'('
		public Keyword getLeftParenthesisKeyword_11_1() { return cLeftParenthesisKeyword_11_1; }
		
		//parents+=[tdm::VTraceableDocument|EString]
		public Assignment getParentsAssignment_11_2() { return cParentsAssignment_11_2; }
		
		//[tdm::VTraceableDocument|EString]
		public CrossReference getParentsVTraceableDocumentCrossReference_11_2_0() { return cParentsVTraceableDocumentCrossReference_11_2_0; }
		
		//EString
		public RuleCall getParentsVTraceableDocumentEStringParserRuleCall_11_2_0_1() { return cParentsVTraceableDocumentEStringParserRuleCall_11_2_0_1; }
		
		//("," parents+=[tdm::VTraceableDocument|EString])*
		public Group getGroup_11_3() { return cGroup_11_3; }
		
		//","
		public Keyword getCommaKeyword_11_3_0() { return cCommaKeyword_11_3_0; }
		
		//parents+=[tdm::VTraceableDocument|EString]
		public Assignment getParentsAssignment_11_3_1() { return cParentsAssignment_11_3_1; }
		
		//[tdm::VTraceableDocument|EString]
		public CrossReference getParentsVTraceableDocumentCrossReference_11_3_1_0() { return cParentsVTraceableDocumentCrossReference_11_3_1_0; }
		
		//EString
		public RuleCall getParentsVTraceableDocumentEStringParserRuleCall_11_3_1_0_1() { return cParentsVTraceableDocumentEStringParserRuleCall_11_3_1_0_1; }
		
		//')'
		public Keyword getRightParenthesisKeyword_11_4() { return cRightParenthesisKeyword_11_4; }
		
		//'introductionSection'
		public Keyword getIntroductionSectionKeyword_12() { return cIntroductionSectionKeyword_12; }
		
		//introductionSection=VSSSIntroduction
		public Assignment getIntroductionSectionAssignment_13() { return cIntroductionSectionAssignment_13; }
		
		//VSSSIntroduction
		public RuleCall getIntroductionSectionVSSSIntroductionParserRuleCall_13_0() { return cIntroductionSectionVSSSIntroductionParserRuleCall_13_0; }
		
		//'applicableDocumentsSection'
		public Keyword getApplicableDocumentsSectionKeyword_14() { return cApplicableDocumentsSectionKeyword_14; }
		
		//applicableDocumentsSection=VSSSApplicableDocuments
		public Assignment getApplicableDocumentsSectionAssignment_15() { return cApplicableDocumentsSectionAssignment_15; }
		
		//VSSSApplicableDocuments
		public RuleCall getApplicableDocumentsSectionVSSSApplicableDocumentsParserRuleCall_15_0() { return cApplicableDocumentsSectionVSSSApplicableDocumentsParserRuleCall_15_0; }
		
		//'referenceDocumentsSection'
		public Keyword getReferenceDocumentsSectionKeyword_16() { return cReferenceDocumentsSectionKeyword_16; }
		
		//referenceDocumentsSection=VSSSReferenceDocuments
		public Assignment getReferenceDocumentsSectionAssignment_17() { return cReferenceDocumentsSectionAssignment_17; }
		
		//VSSSReferenceDocuments
		public RuleCall getReferenceDocumentsSectionVSSSReferenceDocumentsParserRuleCall_17_0() { return cReferenceDocumentsSectionVSSSReferenceDocumentsParserRuleCall_17_0; }
		
		//'termsDefinitionsAbbreviationsSection'
		public Keyword getTermsDefinitionsAbbreviationsSectionKeyword_18() { return cTermsDefinitionsAbbreviationsSectionKeyword_18; }
		
		//termsDefinitionsAbbreviationsSection=VSSSTermsDefinitionsAbbreviations
		public Assignment getTermsDefinitionsAbbreviationsSectionAssignment_19() { return cTermsDefinitionsAbbreviationsSectionAssignment_19; }
		
		//VSSSTermsDefinitionsAbbreviations
		public RuleCall getTermsDefinitionsAbbreviationsSectionVSSSTermsDefinitionsAbbreviationsParserRuleCall_19_0() { return cTermsDefinitionsAbbreviationsSectionVSSSTermsDefinitionsAbbreviationsParserRuleCall_19_0; }
		
		//'generalDescriptionSection'
		public Keyword getGeneralDescriptionSectionKeyword_20() { return cGeneralDescriptionSectionKeyword_20; }
		
		//generalDescriptionSection=VSSSGeneralDescription
		public Assignment getGeneralDescriptionSectionAssignment_21() { return cGeneralDescriptionSectionAssignment_21; }
		
		//VSSSGeneralDescription
		public RuleCall getGeneralDescriptionSectionVSSSGeneralDescriptionParserRuleCall_21_0() { return cGeneralDescriptionSectionVSSSGeneralDescriptionParserRuleCall_21_0; }
		
		//'specificRequirementsSection'
		public Keyword getSpecificRequirementsSectionKeyword_22() { return cSpecificRequirementsSectionKeyword_22; }
		
		//specificRequirementsSection=VSSSSpecificRequirements
		public Assignment getSpecificRequirementsSectionAssignment_23() { return cSpecificRequirementsSectionAssignment_23; }
		
		//VSSSSpecificRequirements
		public RuleCall getSpecificRequirementsSectionVSSSSpecificRequirementsParserRuleCall_23_0() { return cSpecificRequirementsSectionVSSSSpecificRequirementsParserRuleCall_23_0; }
		
		//'verificationValidationIntegrationSection'
		public Keyword getVerificationValidationIntegrationSectionKeyword_24() { return cVerificationValidationIntegrationSectionKeyword_24; }
		
		//verificationValidationIntegrationSection=VSSSVerificationValidationIntegrationRequirements
		public Assignment getVerificationValidationIntegrationSectionAssignment_25() { return cVerificationValidationIntegrationSectionAssignment_25; }
		
		//VSSSVerificationValidationIntegrationRequirements
		public RuleCall getVerificationValidationIntegrationSectionVSSSVerificationValidationIntegrationRequirementsParserRuleCall_25_0() { return cVerificationValidationIntegrationSectionVSSSVerificationValidationIntegrationRequirementsParserRuleCall_25_0; }
		
		//('systemModelsSection' systemModelsSection=VSSSSystemModels)?
		public Group getGroup_26() { return cGroup_26; }
		
		//'systemModelsSection'
		public Keyword getSystemModelsSectionKeyword_26_0() { return cSystemModelsSectionKeyword_26_0; }
		
		//systemModelsSection=VSSSSystemModels
		public Assignment getSystemModelsSectionAssignment_26_1() { return cSystemModelsSectionAssignment_26_1; }
		
		//VSSSSystemModels
		public RuleCall getSystemModelsSectionVSSSSystemModelsParserRuleCall_26_1_0() { return cSystemModelsSectionVSSSSystemModelsParserRuleCall_26_1_0; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_27() { return cRightCurlyBracketKeyword_27; }
	}
	public class DBodyElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.micobs.svm.lang.sss.SSS.DBody");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cDBody_ImplParserRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cDCellParserRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		
		//DBody doc::DBody:
		//	DBody_Impl | DCell
		@Override public ParserRule getRule() { return rule; }
		
		//DBody_Impl | DCell
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//DBody_Impl
		public RuleCall getDBody_ImplParserRuleCall_0() { return cDBody_ImplParserRuleCall_0; }
		
		//DCell
		public RuleCall getDCellParserRuleCall_1() { return cDCellParserRuleCall_1; }
	}
	public class DBodyContentElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.micobs.svm.lang.sss.SSS.DBodyContent");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cDParagraphParserRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cDItemizeParserRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		private final RuleCall cDEnumerateParserRuleCall_2 = (RuleCall)cAlternatives.eContents().get(2);
		
		//DBodyContent doc::DBodyContent:
		//	DParagraph | DItemize | DEnumerate
		@Override public ParserRule getRule() { return rule; }
		
		//DParagraph | DItemize | DEnumerate
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//DParagraph
		public RuleCall getDParagraphParserRuleCall_0() { return cDParagraphParserRuleCall_0; }
		
		//DItemize
		public RuleCall getDItemizeParserRuleCall_1() { return cDItemizeParserRuleCall_1; }
		
		//DEnumerate
		public RuleCall getDEnumerateParserRuleCall_2() { return cDEnumerateParserRuleCall_2; }
	}
	public class DParagraphContentElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.micobs.svm.lang.sss.SSS.DParagraphContent");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cDRunParserRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cDHyperlinkParserRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		
		//DParagraphContent doc::DParagraphContent:
		//	DRun | DHyperlink
		@Override public ParserRule getRule() { return rule; }
		
		//DRun | DHyperlink
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//DRun
		public RuleCall getDRunParserRuleCall_0() { return cDRunParserRuleCall_0; }
		
		//DHyperlink
		public RuleCall getDHyperlinkParserRuleCall_1() { return cDHyperlinkParserRuleCall_1; }
	}
	public class DReferenceableObjectElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.micobs.svm.lang.sss.SSS.DReferenceableObject");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cDReferenceableObject_ImplParserRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cDApplicableDocumentParserRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		private final RuleCall cDReferenceDocumentParserRuleCall_2 = (RuleCall)cAlternatives.eContents().get(2);
		
		//DReferenceableObject doc::DReferenceableObject:
		//	DReferenceableObject_Impl | DApplicableDocument | DReferenceDocument
		@Override public ParserRule getRule() { return rule; }
		
		//DReferenceableObject_Impl | DApplicableDocument | DReferenceDocument
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//DReferenceableObject_Impl
		public RuleCall getDReferenceableObject_ImplParserRuleCall_0() { return cDReferenceableObject_ImplParserRuleCall_0; }
		
		//DApplicableDocument
		public RuleCall getDApplicableDocumentParserRuleCall_1() { return cDApplicableDocumentParserRuleCall_1; }
		
		//DReferenceDocument
		public RuleCall getDReferenceDocumentParserRuleCall_2() { return cDReferenceDocumentParserRuleCall_2; }
	}
	public class DListContentElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.micobs.svm.lang.sss.SSS.DListContent");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cDItemizeParserRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cDEnumerateParserRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		
		//DListContent doc::DListContent:
		//	DItemize | DEnumerate
		@Override public ParserRule getRule() { return rule; }
		
		//DItemize | DEnumerate
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//DItemize
		public RuleCall getDItemizeParserRuleCall_0() { return cDItemizeParserRuleCall_0; }
		
		//DEnumerate
		public RuleCall getDEnumerateParserRuleCall_1() { return cDEnumerateParserRuleCall_1; }
	}
	public class EStringElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.micobs.svm.lang.sss.SSS.EString");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cSTRINGTerminalRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cIDTerminalRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		
		//EString:
		//	STRING | ID;
		@Override public ParserRule getRule() { return rule; }
		
		//STRING | ID
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//STRING
		public RuleCall getSTRINGTerminalRuleCall_0() { return cSTRINGTerminalRuleCall_0; }
		
		//ID
		public RuleCall getIDTerminalRuleCall_1() { return cIDTerminalRuleCall_1; }
	}
	public class VSSSIntroductionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.micobs.svm.lang.sss.SSS.VSSSIntroduction");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cVSSSIntroductionKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Keyword cPurposeKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cPurposeAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cPurposeDBodyParserRuleCall_3_0 = (RuleCall)cPurposeAssignment_3.eContents().get(0);
		private final Keyword cObjetiveKeyword_4 = (Keyword)cGroup.eContents().get(4);
		private final Assignment cObjetiveAssignment_5 = (Assignment)cGroup.eContents().get(5);
		private final RuleCall cObjetiveDBodyParserRuleCall_5_0 = (RuleCall)cObjetiveAssignment_5.eContents().get(0);
		private final Keyword cContentKeyword_6 = (Keyword)cGroup.eContents().get(6);
		private final Assignment cContentAssignment_7 = (Assignment)cGroup.eContents().get(7);
		private final RuleCall cContentDBodyParserRuleCall_7_0 = (RuleCall)cContentAssignment_7.eContents().get(0);
		private final Keyword cReasonKeyword_8 = (Keyword)cGroup.eContents().get(8);
		private final Assignment cReasonAssignment_9 = (Assignment)cGroup.eContents().get(9);
		private final RuleCall cReasonDBodyParserRuleCall_9_0 = (RuleCall)cReasonAssignment_9.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_10 = (Keyword)cGroup.eContents().get(10);
		
		//VSSSIntroduction:
		//	'VSSSIntroduction'
		//	'{'
		//	'purpose' purpose=DBody
		//	'objetive' objetive=DBody
		//	'content' content=DBody
		//	'reason' reason=DBody
		//	'}';
		@Override public ParserRule getRule() { return rule; }
		
		//'VSSSIntroduction' '{' 'purpose' purpose=DBody 'objetive' objetive=DBody 'content' content=DBody 'reason' reason=DBody
		//'}'
		public Group getGroup() { return cGroup; }
		
		//'VSSSIntroduction'
		public Keyword getVSSSIntroductionKeyword_0() { return cVSSSIntroductionKeyword_0; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_1() { return cLeftCurlyBracketKeyword_1; }
		
		//'purpose'
		public Keyword getPurposeKeyword_2() { return cPurposeKeyword_2; }
		
		//purpose=DBody
		public Assignment getPurposeAssignment_3() { return cPurposeAssignment_3; }
		
		//DBody
		public RuleCall getPurposeDBodyParserRuleCall_3_0() { return cPurposeDBodyParserRuleCall_3_0; }
		
		//'objetive'
		public Keyword getObjetiveKeyword_4() { return cObjetiveKeyword_4; }
		
		//objetive=DBody
		public Assignment getObjetiveAssignment_5() { return cObjetiveAssignment_5; }
		
		//DBody
		public RuleCall getObjetiveDBodyParserRuleCall_5_0() { return cObjetiveDBodyParserRuleCall_5_0; }
		
		//'content'
		public Keyword getContentKeyword_6() { return cContentKeyword_6; }
		
		//content=DBody
		public Assignment getContentAssignment_7() { return cContentAssignment_7; }
		
		//DBody
		public RuleCall getContentDBodyParserRuleCall_7_0() { return cContentDBodyParserRuleCall_7_0; }
		
		//'reason'
		public Keyword getReasonKeyword_8() { return cReasonKeyword_8; }
		
		//reason=DBody
		public Assignment getReasonAssignment_9() { return cReasonAssignment_9; }
		
		//DBody
		public RuleCall getReasonDBodyParserRuleCall_9_0() { return cReasonDBodyParserRuleCall_9_0; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_10() { return cRightCurlyBracketKeyword_10; }
	}
	public class VSSSApplicableDocumentsElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.micobs.svm.lang.sss.SSS.VSSSApplicableDocuments");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cVSSSApplicableDocumentsAction_0 = (Action)cGroup.eContents().get(0);
		private final Keyword cVSSSApplicableDocumentsKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Keyword cLeftCurlyBracketKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Group cGroup_3 = (Group)cGroup.eContents().get(3);
		private final Keyword cApplicableDocumentsKeyword_3_0 = (Keyword)cGroup_3.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_3_1 = (Keyword)cGroup_3.eContents().get(1);
		private final Assignment cApplicableDocumentsAssignment_3_2 = (Assignment)cGroup_3.eContents().get(2);
		private final RuleCall cApplicableDocumentsDApplicableDocumentParserRuleCall_3_2_0 = (RuleCall)cApplicableDocumentsAssignment_3_2.eContents().get(0);
		private final Group cGroup_3_3 = (Group)cGroup_3.eContents().get(3);
		private final Keyword cCommaKeyword_3_3_0 = (Keyword)cGroup_3_3.eContents().get(0);
		private final Assignment cApplicableDocumentsAssignment_3_3_1 = (Assignment)cGroup_3_3.eContents().get(1);
		private final RuleCall cApplicableDocumentsDApplicableDocumentParserRuleCall_3_3_1_0 = (RuleCall)cApplicableDocumentsAssignment_3_3_1.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_3_4 = (Keyword)cGroup_3.eContents().get(4);
		private final Keyword cRightCurlyBracketKeyword_4 = (Keyword)cGroup.eContents().get(4);
		
		//VSSSApplicableDocuments:
		//	{VSSSApplicableDocuments}
		//	'VSSSApplicableDocuments'
		//	'{' ('applicableDocuments' '{' applicableDocuments+=DApplicableDocument (","
		//	applicableDocuments+=DApplicableDocument)* '}')?
		//	'}';
		@Override public ParserRule getRule() { return rule; }
		
		//{VSSSApplicableDocuments} 'VSSSApplicableDocuments' '{' ('applicableDocuments' '{'
		//applicableDocuments+=DApplicableDocument ("," applicableDocuments+=DApplicableDocument)* '}')? '}'
		public Group getGroup() { return cGroup; }
		
		//{VSSSApplicableDocuments}
		public Action getVSSSApplicableDocumentsAction_0() { return cVSSSApplicableDocumentsAction_0; }
		
		//'VSSSApplicableDocuments'
		public Keyword getVSSSApplicableDocumentsKeyword_1() { return cVSSSApplicableDocumentsKeyword_1; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_2() { return cLeftCurlyBracketKeyword_2; }
		
		//('applicableDocuments' '{' applicableDocuments+=DApplicableDocument ("," applicableDocuments+=DApplicableDocument)*
		//'}')?
		public Group getGroup_3() { return cGroup_3; }
		
		//'applicableDocuments'
		public Keyword getApplicableDocumentsKeyword_3_0() { return cApplicableDocumentsKeyword_3_0; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_3_1() { return cLeftCurlyBracketKeyword_3_1; }
		
		//applicableDocuments+=DApplicableDocument
		public Assignment getApplicableDocumentsAssignment_3_2() { return cApplicableDocumentsAssignment_3_2; }
		
		//DApplicableDocument
		public RuleCall getApplicableDocumentsDApplicableDocumentParserRuleCall_3_2_0() { return cApplicableDocumentsDApplicableDocumentParserRuleCall_3_2_0; }
		
		//("," applicableDocuments+=DApplicableDocument)*
		public Group getGroup_3_3() { return cGroup_3_3; }
		
		//","
		public Keyword getCommaKeyword_3_3_0() { return cCommaKeyword_3_3_0; }
		
		//applicableDocuments+=DApplicableDocument
		public Assignment getApplicableDocumentsAssignment_3_3_1() { return cApplicableDocumentsAssignment_3_3_1; }
		
		//DApplicableDocument
		public RuleCall getApplicableDocumentsDApplicableDocumentParserRuleCall_3_3_1_0() { return cApplicableDocumentsDApplicableDocumentParserRuleCall_3_3_1_0; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_3_4() { return cRightCurlyBracketKeyword_3_4; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_4() { return cRightCurlyBracketKeyword_4; }
	}
	public class VSSSReferenceDocumentsElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.micobs.svm.lang.sss.SSS.VSSSReferenceDocuments");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cVSSSReferenceDocumentsAction_0 = (Action)cGroup.eContents().get(0);
		private final Keyword cVSSSReferenceDocumentsKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Keyword cLeftCurlyBracketKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Group cGroup_3 = (Group)cGroup.eContents().get(3);
		private final Keyword cReferenceDocumentsKeyword_3_0 = (Keyword)cGroup_3.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_3_1 = (Keyword)cGroup_3.eContents().get(1);
		private final Assignment cReferenceDocumentsAssignment_3_2 = (Assignment)cGroup_3.eContents().get(2);
		private final RuleCall cReferenceDocumentsDReferenceDocumentParserRuleCall_3_2_0 = (RuleCall)cReferenceDocumentsAssignment_3_2.eContents().get(0);
		private final Group cGroup_3_3 = (Group)cGroup_3.eContents().get(3);
		private final Keyword cCommaKeyword_3_3_0 = (Keyword)cGroup_3_3.eContents().get(0);
		private final Assignment cReferenceDocumentsAssignment_3_3_1 = (Assignment)cGroup_3_3.eContents().get(1);
		private final RuleCall cReferenceDocumentsDReferenceDocumentParserRuleCall_3_3_1_0 = (RuleCall)cReferenceDocumentsAssignment_3_3_1.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_3_4 = (Keyword)cGroup_3.eContents().get(4);
		private final Keyword cRightCurlyBracketKeyword_4 = (Keyword)cGroup.eContents().get(4);
		
		//VSSSReferenceDocuments:
		//	{VSSSReferenceDocuments}
		//	'VSSSReferenceDocuments'
		//	'{' ('referenceDocuments' '{' referenceDocuments+=DReferenceDocument ("," referenceDocuments+=DReferenceDocument)*
		//	'}')?
		//	'}';
		@Override public ParserRule getRule() { return rule; }
		
		//{VSSSReferenceDocuments} 'VSSSReferenceDocuments' '{' ('referenceDocuments' '{' referenceDocuments+=DReferenceDocument
		//("," referenceDocuments+=DReferenceDocument)* '}')? '}'
		public Group getGroup() { return cGroup; }
		
		//{VSSSReferenceDocuments}
		public Action getVSSSReferenceDocumentsAction_0() { return cVSSSReferenceDocumentsAction_0; }
		
		//'VSSSReferenceDocuments'
		public Keyword getVSSSReferenceDocumentsKeyword_1() { return cVSSSReferenceDocumentsKeyword_1; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_2() { return cLeftCurlyBracketKeyword_2; }
		
		//('referenceDocuments' '{' referenceDocuments+=DReferenceDocument ("," referenceDocuments+=DReferenceDocument)* '}')?
		public Group getGroup_3() { return cGroup_3; }
		
		//'referenceDocuments'
		public Keyword getReferenceDocumentsKeyword_3_0() { return cReferenceDocumentsKeyword_3_0; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_3_1() { return cLeftCurlyBracketKeyword_3_1; }
		
		//referenceDocuments+=DReferenceDocument
		public Assignment getReferenceDocumentsAssignment_3_2() { return cReferenceDocumentsAssignment_3_2; }
		
		//DReferenceDocument
		public RuleCall getReferenceDocumentsDReferenceDocumentParserRuleCall_3_2_0() { return cReferenceDocumentsDReferenceDocumentParserRuleCall_3_2_0; }
		
		//("," referenceDocuments+=DReferenceDocument)*
		public Group getGroup_3_3() { return cGroup_3_3; }
		
		//","
		public Keyword getCommaKeyword_3_3_0() { return cCommaKeyword_3_3_0; }
		
		//referenceDocuments+=DReferenceDocument
		public Assignment getReferenceDocumentsAssignment_3_3_1() { return cReferenceDocumentsAssignment_3_3_1; }
		
		//DReferenceDocument
		public RuleCall getReferenceDocumentsDReferenceDocumentParserRuleCall_3_3_1_0() { return cReferenceDocumentsDReferenceDocumentParserRuleCall_3_3_1_0; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_3_4() { return cRightCurlyBracketKeyword_3_4; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_4() { return cRightCurlyBracketKeyword_4; }
	}
	public class VSSSTermsDefinitionsAbbreviationsElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.micobs.svm.lang.sss.SSS.VSSSTermsDefinitionsAbbreviations");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cVSSSTermsDefinitionsAbbreviationsAction_0 = (Action)cGroup.eContents().get(0);
		private final Keyword cVSSSTermsDefinitionsAbbreviationsKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Keyword cLeftCurlyBracketKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Group cGroup_3 = (Group)cGroup.eContents().get(3);
		private final Keyword cTermsKeyword_3_0 = (Keyword)cGroup_3.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_3_1 = (Keyword)cGroup_3.eContents().get(1);
		private final Assignment cTermsAssignment_3_2 = (Assignment)cGroup_3.eContents().get(2);
		private final RuleCall cTermsVSSSTermParserRuleCall_3_2_0 = (RuleCall)cTermsAssignment_3_2.eContents().get(0);
		private final Group cGroup_3_3 = (Group)cGroup_3.eContents().get(3);
		private final Keyword cCommaKeyword_3_3_0 = (Keyword)cGroup_3_3.eContents().get(0);
		private final Assignment cTermsAssignment_3_3_1 = (Assignment)cGroup_3_3.eContents().get(1);
		private final RuleCall cTermsVSSSTermParserRuleCall_3_3_1_0 = (RuleCall)cTermsAssignment_3_3_1.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_3_4 = (Keyword)cGroup_3.eContents().get(4);
		private final Group cGroup_4 = (Group)cGroup.eContents().get(4);
		private final Keyword cDefinitionsKeyword_4_0 = (Keyword)cGroup_4.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_4_1 = (Keyword)cGroup_4.eContents().get(1);
		private final Assignment cDefinitionsAssignment_4_2 = (Assignment)cGroup_4.eContents().get(2);
		private final RuleCall cDefinitionsVSSSDefinitionParserRuleCall_4_2_0 = (RuleCall)cDefinitionsAssignment_4_2.eContents().get(0);
		private final Group cGroup_4_3 = (Group)cGroup_4.eContents().get(3);
		private final Keyword cCommaKeyword_4_3_0 = (Keyword)cGroup_4_3.eContents().get(0);
		private final Assignment cDefinitionsAssignment_4_3_1 = (Assignment)cGroup_4_3.eContents().get(1);
		private final RuleCall cDefinitionsVSSSDefinitionParserRuleCall_4_3_1_0 = (RuleCall)cDefinitionsAssignment_4_3_1.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_4_4 = (Keyword)cGroup_4.eContents().get(4);
		private final Group cGroup_5 = (Group)cGroup.eContents().get(5);
		private final Keyword cAbbreviationsKeyword_5_0 = (Keyword)cGroup_5.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_5_1 = (Keyword)cGroup_5.eContents().get(1);
		private final Assignment cAbbreviationsAssignment_5_2 = (Assignment)cGroup_5.eContents().get(2);
		private final RuleCall cAbbreviationsVSSSAbbreviationParserRuleCall_5_2_0 = (RuleCall)cAbbreviationsAssignment_5_2.eContents().get(0);
		private final Group cGroup_5_3 = (Group)cGroup_5.eContents().get(3);
		private final Keyword cCommaKeyword_5_3_0 = (Keyword)cGroup_5_3.eContents().get(0);
		private final Assignment cAbbreviationsAssignment_5_3_1 = (Assignment)cGroup_5_3.eContents().get(1);
		private final RuleCall cAbbreviationsVSSSAbbreviationParserRuleCall_5_3_1_0 = (RuleCall)cAbbreviationsAssignment_5_3_1.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_5_4 = (Keyword)cGroup_5.eContents().get(4);
		private final Keyword cRightCurlyBracketKeyword_6 = (Keyword)cGroup.eContents().get(6);
		
		//VSSSTermsDefinitionsAbbreviations:
		//	{VSSSTermsDefinitionsAbbreviations}
		//	'VSSSTermsDefinitionsAbbreviations'
		//	'{' ('terms' '{' terms+=VSSSTerm ("," terms+=VSSSTerm)* '}')? ('definitions' '{' definitions+=VSSSDefinition (","
		//	definitions+=VSSSDefinition)* '}')? ('abbreviations' '{' abbreviations+=VSSSAbbreviation (","
		//	abbreviations+=VSSSAbbreviation)* '}')?
		//	'}';
		@Override public ParserRule getRule() { return rule; }
		
		//{VSSSTermsDefinitionsAbbreviations} 'VSSSTermsDefinitionsAbbreviations' '{' ('terms' '{' terms+=VSSSTerm (","
		//terms+=VSSSTerm)* '}')? ('definitions' '{' definitions+=VSSSDefinition ("," definitions+=VSSSDefinition)* '}')?
		//('abbreviations' '{' abbreviations+=VSSSAbbreviation ("," abbreviations+=VSSSAbbreviation)* '}')? '}'
		public Group getGroup() { return cGroup; }
		
		//{VSSSTermsDefinitionsAbbreviations}
		public Action getVSSSTermsDefinitionsAbbreviationsAction_0() { return cVSSSTermsDefinitionsAbbreviationsAction_0; }
		
		//'VSSSTermsDefinitionsAbbreviations'
		public Keyword getVSSSTermsDefinitionsAbbreviationsKeyword_1() { return cVSSSTermsDefinitionsAbbreviationsKeyword_1; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_2() { return cLeftCurlyBracketKeyword_2; }
		
		//('terms' '{' terms+=VSSSTerm ("," terms+=VSSSTerm)* '}')?
		public Group getGroup_3() { return cGroup_3; }
		
		//'terms'
		public Keyword getTermsKeyword_3_0() { return cTermsKeyword_3_0; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_3_1() { return cLeftCurlyBracketKeyword_3_1; }
		
		//terms+=VSSSTerm
		public Assignment getTermsAssignment_3_2() { return cTermsAssignment_3_2; }
		
		//VSSSTerm
		public RuleCall getTermsVSSSTermParserRuleCall_3_2_0() { return cTermsVSSSTermParserRuleCall_3_2_0; }
		
		//("," terms+=VSSSTerm)*
		public Group getGroup_3_3() { return cGroup_3_3; }
		
		//","
		public Keyword getCommaKeyword_3_3_0() { return cCommaKeyword_3_3_0; }
		
		//terms+=VSSSTerm
		public Assignment getTermsAssignment_3_3_1() { return cTermsAssignment_3_3_1; }
		
		//VSSSTerm
		public RuleCall getTermsVSSSTermParserRuleCall_3_3_1_0() { return cTermsVSSSTermParserRuleCall_3_3_1_0; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_3_4() { return cRightCurlyBracketKeyword_3_4; }
		
		//('definitions' '{' definitions+=VSSSDefinition ("," definitions+=VSSSDefinition)* '}')?
		public Group getGroup_4() { return cGroup_4; }
		
		//'definitions'
		public Keyword getDefinitionsKeyword_4_0() { return cDefinitionsKeyword_4_0; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_4_1() { return cLeftCurlyBracketKeyword_4_1; }
		
		//definitions+=VSSSDefinition
		public Assignment getDefinitionsAssignment_4_2() { return cDefinitionsAssignment_4_2; }
		
		//VSSSDefinition
		public RuleCall getDefinitionsVSSSDefinitionParserRuleCall_4_2_0() { return cDefinitionsVSSSDefinitionParserRuleCall_4_2_0; }
		
		//("," definitions+=VSSSDefinition)*
		public Group getGroup_4_3() { return cGroup_4_3; }
		
		//","
		public Keyword getCommaKeyword_4_3_0() { return cCommaKeyword_4_3_0; }
		
		//definitions+=VSSSDefinition
		public Assignment getDefinitionsAssignment_4_3_1() { return cDefinitionsAssignment_4_3_1; }
		
		//VSSSDefinition
		public RuleCall getDefinitionsVSSSDefinitionParserRuleCall_4_3_1_0() { return cDefinitionsVSSSDefinitionParserRuleCall_4_3_1_0; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_4_4() { return cRightCurlyBracketKeyword_4_4; }
		
		//('abbreviations' '{' abbreviations+=VSSSAbbreviation ("," abbreviations+=VSSSAbbreviation)* '}')?
		public Group getGroup_5() { return cGroup_5; }
		
		//'abbreviations'
		public Keyword getAbbreviationsKeyword_5_0() { return cAbbreviationsKeyword_5_0; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_5_1() { return cLeftCurlyBracketKeyword_5_1; }
		
		//abbreviations+=VSSSAbbreviation
		public Assignment getAbbreviationsAssignment_5_2() { return cAbbreviationsAssignment_5_2; }
		
		//VSSSAbbreviation
		public RuleCall getAbbreviationsVSSSAbbreviationParserRuleCall_5_2_0() { return cAbbreviationsVSSSAbbreviationParserRuleCall_5_2_0; }
		
		//("," abbreviations+=VSSSAbbreviation)*
		public Group getGroup_5_3() { return cGroup_5_3; }
		
		//","
		public Keyword getCommaKeyword_5_3_0() { return cCommaKeyword_5_3_0; }
		
		//abbreviations+=VSSSAbbreviation
		public Assignment getAbbreviationsAssignment_5_3_1() { return cAbbreviationsAssignment_5_3_1; }
		
		//VSSSAbbreviation
		public RuleCall getAbbreviationsVSSSAbbreviationParserRuleCall_5_3_1_0() { return cAbbreviationsVSSSAbbreviationParserRuleCall_5_3_1_0; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_5_4() { return cRightCurlyBracketKeyword_5_4; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_6() { return cRightCurlyBracketKeyword_6; }
	}
	public class VSSSGeneralDescriptionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.micobs.svm.lang.sss.SSS.VSSSGeneralDescription");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cVSSSGeneralDescriptionKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Keyword cProductPerspectiveKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cProductPerspectiveAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cProductPerspectiveVSSSGeneralDescriptionSubsectionParserRuleCall_3_0 = (RuleCall)cProductPerspectiveAssignment_3.eContents().get(0);
		private final Keyword cGeneralCapabilitesKeyword_4 = (Keyword)cGroup.eContents().get(4);
		private final Assignment cGeneralCapabilitesAssignment_5 = (Assignment)cGroup.eContents().get(5);
		private final RuleCall cGeneralCapabilitesVSSSGeneralDescriptionSubsectionParserRuleCall_5_0 = (RuleCall)cGeneralCapabilitesAssignment_5.eContents().get(0);
		private final Keyword cGeneralConstraintsKeyword_6 = (Keyword)cGroup.eContents().get(6);
		private final Assignment cGeneralConstraintsAssignment_7 = (Assignment)cGroup.eContents().get(7);
		private final RuleCall cGeneralConstraintsVSSSGeneralDescriptionSubsectionParserRuleCall_7_0 = (RuleCall)cGeneralConstraintsAssignment_7.eContents().get(0);
		private final Keyword cOperationalEnvironmentKeyword_8 = (Keyword)cGroup.eContents().get(8);
		private final Assignment cOperationalEnvironmentAssignment_9 = (Assignment)cGroup.eContents().get(9);
		private final RuleCall cOperationalEnvironmentVSSSGeneralDescriptionSubsectionParserRuleCall_9_0 = (RuleCall)cOperationalEnvironmentAssignment_9.eContents().get(0);
		private final Keyword cAssumptionsDependenciesKeyword_10 = (Keyword)cGroup.eContents().get(10);
		private final Assignment cAssumptionsDependenciesAssignment_11 = (Assignment)cGroup.eContents().get(11);
		private final RuleCall cAssumptionsDependenciesVSSSGeneralDescriptionSubsectionParserRuleCall_11_0 = (RuleCall)cAssumptionsDependenciesAssignment_11.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_12 = (Keyword)cGroup.eContents().get(12);
		
		//VSSSGeneralDescription:
		//	'VSSSGeneralDescription'
		//	'{'
		//	'productPerspective' productPerspective=VSSSGeneralDescriptionSubsection
		//	'generalCapabilites' generalCapabilites=VSSSGeneralDescriptionSubsection
		//	'generalConstraints' generalConstraints=VSSSGeneralDescriptionSubsection
		//	'operationalEnvironment' operationalEnvironment=VSSSGeneralDescriptionSubsection
		//	'assumptionsDependencies' assumptionsDependencies=VSSSGeneralDescriptionSubsection
		//	'}';
		@Override public ParserRule getRule() { return rule; }
		
		//'VSSSGeneralDescription' '{' 'productPerspective' productPerspective=VSSSGeneralDescriptionSubsection
		//'generalCapabilites' generalCapabilites=VSSSGeneralDescriptionSubsection 'generalConstraints'
		//generalConstraints=VSSSGeneralDescriptionSubsection 'operationalEnvironment'
		//operationalEnvironment=VSSSGeneralDescriptionSubsection 'assumptionsDependencies'
		//assumptionsDependencies=VSSSGeneralDescriptionSubsection '}'
		public Group getGroup() { return cGroup; }
		
		//'VSSSGeneralDescription'
		public Keyword getVSSSGeneralDescriptionKeyword_0() { return cVSSSGeneralDescriptionKeyword_0; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_1() { return cLeftCurlyBracketKeyword_1; }
		
		//'productPerspective'
		public Keyword getProductPerspectiveKeyword_2() { return cProductPerspectiveKeyword_2; }
		
		//productPerspective=VSSSGeneralDescriptionSubsection
		public Assignment getProductPerspectiveAssignment_3() { return cProductPerspectiveAssignment_3; }
		
		//VSSSGeneralDescriptionSubsection
		public RuleCall getProductPerspectiveVSSSGeneralDescriptionSubsectionParserRuleCall_3_0() { return cProductPerspectiveVSSSGeneralDescriptionSubsectionParserRuleCall_3_0; }
		
		//'generalCapabilites'
		public Keyword getGeneralCapabilitesKeyword_4() { return cGeneralCapabilitesKeyword_4; }
		
		//generalCapabilites=VSSSGeneralDescriptionSubsection
		public Assignment getGeneralCapabilitesAssignment_5() { return cGeneralCapabilitesAssignment_5; }
		
		//VSSSGeneralDescriptionSubsection
		public RuleCall getGeneralCapabilitesVSSSGeneralDescriptionSubsectionParserRuleCall_5_0() { return cGeneralCapabilitesVSSSGeneralDescriptionSubsectionParserRuleCall_5_0; }
		
		//'generalConstraints'
		public Keyword getGeneralConstraintsKeyword_6() { return cGeneralConstraintsKeyword_6; }
		
		//generalConstraints=VSSSGeneralDescriptionSubsection
		public Assignment getGeneralConstraintsAssignment_7() { return cGeneralConstraintsAssignment_7; }
		
		//VSSSGeneralDescriptionSubsection
		public RuleCall getGeneralConstraintsVSSSGeneralDescriptionSubsectionParserRuleCall_7_0() { return cGeneralConstraintsVSSSGeneralDescriptionSubsectionParserRuleCall_7_0; }
		
		//'operationalEnvironment'
		public Keyword getOperationalEnvironmentKeyword_8() { return cOperationalEnvironmentKeyword_8; }
		
		//operationalEnvironment=VSSSGeneralDescriptionSubsection
		public Assignment getOperationalEnvironmentAssignment_9() { return cOperationalEnvironmentAssignment_9; }
		
		//VSSSGeneralDescriptionSubsection
		public RuleCall getOperationalEnvironmentVSSSGeneralDescriptionSubsectionParserRuleCall_9_0() { return cOperationalEnvironmentVSSSGeneralDescriptionSubsectionParserRuleCall_9_0; }
		
		//'assumptionsDependencies'
		public Keyword getAssumptionsDependenciesKeyword_10() { return cAssumptionsDependenciesKeyword_10; }
		
		//assumptionsDependencies=VSSSGeneralDescriptionSubsection
		public Assignment getAssumptionsDependenciesAssignment_11() { return cAssumptionsDependenciesAssignment_11; }
		
		//VSSSGeneralDescriptionSubsection
		public RuleCall getAssumptionsDependenciesVSSSGeneralDescriptionSubsectionParserRuleCall_11_0() { return cAssumptionsDependenciesVSSSGeneralDescriptionSubsectionParserRuleCall_11_0; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_12() { return cRightCurlyBracketKeyword_12; }
	}
	public class VSSSSpecificRequirementsElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.micobs.svm.lang.sss.SSS.VSSSSpecificRequirements");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cVSSSSpecificRequirementsAction_0 = (Action)cGroup.eContents().get(0);
		private final Keyword cVSSSSpecificRequirementsKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Keyword cLeftCurlyBracketKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Group cGroup_3 = (Group)cGroup.eContents().get(3);
		private final Keyword cGeneralKeyword_3_0 = (Keyword)cGroup_3.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_3_1 = (Keyword)cGroup_3.eContents().get(1);
		private final Assignment cGeneralAssignment_3_2 = (Assignment)cGroup_3.eContents().get(2);
		private final RuleCall cGeneralVSSSGeneralRequirementParserRuleCall_3_2_0 = (RuleCall)cGeneralAssignment_3_2.eContents().get(0);
		private final Group cGroup_3_3 = (Group)cGroup_3.eContents().get(3);
		private final Keyword cCommaKeyword_3_3_0 = (Keyword)cGroup_3_3.eContents().get(0);
		private final Assignment cGeneralAssignment_3_3_1 = (Assignment)cGroup_3_3.eContents().get(1);
		private final RuleCall cGeneralVSSSGeneralRequirementParserRuleCall_3_3_1_0 = (RuleCall)cGeneralAssignment_3_3_1.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_3_4 = (Keyword)cGroup_3.eContents().get(4);
		private final Group cGroup_4 = (Group)cGroup.eContents().get(4);
		private final Keyword cCapabilitiesKeyword_4_0 = (Keyword)cGroup_4.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_4_1 = (Keyword)cGroup_4.eContents().get(1);
		private final Assignment cCapabilitiesAssignment_4_2 = (Assignment)cGroup_4.eContents().get(2);
		private final RuleCall cCapabilitiesVSSSCapabilitiesRequirementParserRuleCall_4_2_0 = (RuleCall)cCapabilitiesAssignment_4_2.eContents().get(0);
		private final Group cGroup_4_3 = (Group)cGroup_4.eContents().get(3);
		private final Keyword cCommaKeyword_4_3_0 = (Keyword)cGroup_4_3.eContents().get(0);
		private final Assignment cCapabilitiesAssignment_4_3_1 = (Assignment)cGroup_4_3.eContents().get(1);
		private final RuleCall cCapabilitiesVSSSCapabilitiesRequirementParserRuleCall_4_3_1_0 = (RuleCall)cCapabilitiesAssignment_4_3_1.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_4_4 = (Keyword)cGroup_4.eContents().get(4);
		private final Group cGroup_5 = (Group)cGroup.eContents().get(5);
		private final Keyword cSystemInterfaceKeyword_5_0 = (Keyword)cGroup_5.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_5_1 = (Keyword)cGroup_5.eContents().get(1);
		private final Assignment cSystemInterfaceAssignment_5_2 = (Assignment)cGroup_5.eContents().get(2);
		private final RuleCall cSystemInterfaceVSSSSystemInterfaceRequirementParserRuleCall_5_2_0 = (RuleCall)cSystemInterfaceAssignment_5_2.eContents().get(0);
		private final Group cGroup_5_3 = (Group)cGroup_5.eContents().get(3);
		private final Keyword cCommaKeyword_5_3_0 = (Keyword)cGroup_5_3.eContents().get(0);
		private final Assignment cSystemInterfaceAssignment_5_3_1 = (Assignment)cGroup_5_3.eContents().get(1);
		private final RuleCall cSystemInterfaceVSSSSystemInterfaceRequirementParserRuleCall_5_3_1_0 = (RuleCall)cSystemInterfaceAssignment_5_3_1.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_5_4 = (Keyword)cGroup_5.eContents().get(4);
		private final Group cGroup_6 = (Group)cGroup.eContents().get(6);
		private final Keyword cAdaptationMissionizationKeyword_6_0 = (Keyword)cGroup_6.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_6_1 = (Keyword)cGroup_6.eContents().get(1);
		private final Assignment cAdaptationMissionizationAssignment_6_2 = (Assignment)cGroup_6.eContents().get(2);
		private final RuleCall cAdaptationMissionizationVSSSAdaptationMissionizationRequirementParserRuleCall_6_2_0 = (RuleCall)cAdaptationMissionizationAssignment_6_2.eContents().get(0);
		private final Group cGroup_6_3 = (Group)cGroup_6.eContents().get(3);
		private final Keyword cCommaKeyword_6_3_0 = (Keyword)cGroup_6_3.eContents().get(0);
		private final Assignment cAdaptationMissionizationAssignment_6_3_1 = (Assignment)cGroup_6_3.eContents().get(1);
		private final RuleCall cAdaptationMissionizationVSSSAdaptationMissionizationRequirementParserRuleCall_6_3_1_0 = (RuleCall)cAdaptationMissionizationAssignment_6_3_1.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_6_4 = (Keyword)cGroup_6.eContents().get(4);
		private final Group cGroup_7 = (Group)cGroup.eContents().get(7);
		private final Keyword cComputerResourceKeyword_7_0 = (Keyword)cGroup_7.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_7_1 = (Keyword)cGroup_7.eContents().get(1);
		private final Assignment cComputerResourceAssignment_7_2 = (Assignment)cGroup_7.eContents().get(2);
		private final RuleCall cComputerResourceVSSSComputerResourceRequirementParserRuleCall_7_2_0 = (RuleCall)cComputerResourceAssignment_7_2.eContents().get(0);
		private final Group cGroup_7_3 = (Group)cGroup_7.eContents().get(3);
		private final Keyword cCommaKeyword_7_3_0 = (Keyword)cGroup_7_3.eContents().get(0);
		private final Assignment cComputerResourceAssignment_7_3_1 = (Assignment)cGroup_7_3.eContents().get(1);
		private final RuleCall cComputerResourceVSSSComputerResourceRequirementParserRuleCall_7_3_1_0 = (RuleCall)cComputerResourceAssignment_7_3_1.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_7_4 = (Keyword)cGroup_7.eContents().get(4);
		private final Group cGroup_8 = (Group)cGroup.eContents().get(8);
		private final Keyword cSecurityKeyword_8_0 = (Keyword)cGroup_8.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_8_1 = (Keyword)cGroup_8.eContents().get(1);
		private final Assignment cSecurityAssignment_8_2 = (Assignment)cGroup_8.eContents().get(2);
		private final RuleCall cSecurityVSSSSecurityRequirementParserRuleCall_8_2_0 = (RuleCall)cSecurityAssignment_8_2.eContents().get(0);
		private final Group cGroup_8_3 = (Group)cGroup_8.eContents().get(3);
		private final Keyword cCommaKeyword_8_3_0 = (Keyword)cGroup_8_3.eContents().get(0);
		private final Assignment cSecurityAssignment_8_3_1 = (Assignment)cGroup_8_3.eContents().get(1);
		private final RuleCall cSecurityVSSSSecurityRequirementParserRuleCall_8_3_1_0 = (RuleCall)cSecurityAssignment_8_3_1.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_8_4 = (Keyword)cGroup_8.eContents().get(4);
		private final Group cGroup_9 = (Group)cGroup.eContents().get(9);
		private final Keyword cSafetyKeyword_9_0 = (Keyword)cGroup_9.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_9_1 = (Keyword)cGroup_9.eContents().get(1);
		private final Assignment cSafetyAssignment_9_2 = (Assignment)cGroup_9.eContents().get(2);
		private final RuleCall cSafetyVSSSSafetyRequirementParserRuleCall_9_2_0 = (RuleCall)cSafetyAssignment_9_2.eContents().get(0);
		private final Group cGroup_9_3 = (Group)cGroup_9.eContents().get(3);
		private final Keyword cCommaKeyword_9_3_0 = (Keyword)cGroup_9_3.eContents().get(0);
		private final Assignment cSafetyAssignment_9_3_1 = (Assignment)cGroup_9_3.eContents().get(1);
		private final RuleCall cSafetyVSSSSafetyRequirementParserRuleCall_9_3_1_0 = (RuleCall)cSafetyAssignment_9_3_1.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_9_4 = (Keyword)cGroup_9.eContents().get(4);
		private final Group cGroup_10 = (Group)cGroup.eContents().get(10);
		private final Keyword cReliabiltyAvailabilityKeyword_10_0 = (Keyword)cGroup_10.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_10_1 = (Keyword)cGroup_10.eContents().get(1);
		private final Assignment cReliabiltyAvailabilityAssignment_10_2 = (Assignment)cGroup_10.eContents().get(2);
		private final RuleCall cReliabiltyAvailabilityVSSSReliabiltyAvailabilityRequirementParserRuleCall_10_2_0 = (RuleCall)cReliabiltyAvailabilityAssignment_10_2.eContents().get(0);
		private final Group cGroup_10_3 = (Group)cGroup_10.eContents().get(3);
		private final Keyword cCommaKeyword_10_3_0 = (Keyword)cGroup_10_3.eContents().get(0);
		private final Assignment cReliabiltyAvailabilityAssignment_10_3_1 = (Assignment)cGroup_10_3.eContents().get(1);
		private final RuleCall cReliabiltyAvailabilityVSSSReliabiltyAvailabilityRequirementParserRuleCall_10_3_1_0 = (RuleCall)cReliabiltyAvailabilityAssignment_10_3_1.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_10_4 = (Keyword)cGroup_10.eContents().get(4);
		private final Group cGroup_11 = (Group)cGroup.eContents().get(11);
		private final Keyword cQualityKeyword_11_0 = (Keyword)cGroup_11.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_11_1 = (Keyword)cGroup_11.eContents().get(1);
		private final Assignment cQualityAssignment_11_2 = (Assignment)cGroup_11.eContents().get(2);
		private final RuleCall cQualityVSSSQualityRequirementParserRuleCall_11_2_0 = (RuleCall)cQualityAssignment_11_2.eContents().get(0);
		private final Group cGroup_11_3 = (Group)cGroup_11.eContents().get(3);
		private final Keyword cCommaKeyword_11_3_0 = (Keyword)cGroup_11_3.eContents().get(0);
		private final Assignment cQualityAssignment_11_3_1 = (Assignment)cGroup_11_3.eContents().get(1);
		private final RuleCall cQualityVSSSQualityRequirementParserRuleCall_11_3_1_0 = (RuleCall)cQualityAssignment_11_3_1.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_11_4 = (Keyword)cGroup_11.eContents().get(4);
		private final Group cGroup_12 = (Group)cGroup.eContents().get(12);
		private final Keyword cDesignKeyword_12_0 = (Keyword)cGroup_12.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_12_1 = (Keyword)cGroup_12.eContents().get(1);
		private final Assignment cDesignAssignment_12_2 = (Assignment)cGroup_12.eContents().get(2);
		private final RuleCall cDesignVSSSDesignRequirementParserRuleCall_12_2_0 = (RuleCall)cDesignAssignment_12_2.eContents().get(0);
		private final Group cGroup_12_3 = (Group)cGroup_12.eContents().get(3);
		private final Keyword cCommaKeyword_12_3_0 = (Keyword)cGroup_12_3.eContents().get(0);
		private final Assignment cDesignAssignment_12_3_1 = (Assignment)cGroup_12_3.eContents().get(1);
		private final RuleCall cDesignVSSSDesignRequirementParserRuleCall_12_3_1_0 = (RuleCall)cDesignAssignment_12_3_1.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_12_4 = (Keyword)cGroup_12.eContents().get(4);
		private final Group cGroup_13 = (Group)cGroup.eContents().get(13);
		private final Keyword cSoftwareOperationsKeyword_13_0 = (Keyword)cGroup_13.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_13_1 = (Keyword)cGroup_13.eContents().get(1);
		private final Assignment cSoftwareOperationsAssignment_13_2 = (Assignment)cGroup_13.eContents().get(2);
		private final RuleCall cSoftwareOperationsVSSSSoftwareOperationsRequirementParserRuleCall_13_2_0 = (RuleCall)cSoftwareOperationsAssignment_13_2.eContents().get(0);
		private final Group cGroup_13_3 = (Group)cGroup_13.eContents().get(3);
		private final Keyword cCommaKeyword_13_3_0 = (Keyword)cGroup_13_3.eContents().get(0);
		private final Assignment cSoftwareOperationsAssignment_13_3_1 = (Assignment)cGroup_13_3.eContents().get(1);
		private final RuleCall cSoftwareOperationsVSSSSoftwareOperationsRequirementParserRuleCall_13_3_1_0 = (RuleCall)cSoftwareOperationsAssignment_13_3_1.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_13_4 = (Keyword)cGroup_13.eContents().get(4);
		private final Group cGroup_14 = (Group)cGroup.eContents().get(14);
		private final Keyword cSoftwareMaintenanceKeyword_14_0 = (Keyword)cGroup_14.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_14_1 = (Keyword)cGroup_14.eContents().get(1);
		private final Assignment cSoftwareMaintenanceAssignment_14_2 = (Assignment)cGroup_14.eContents().get(2);
		private final RuleCall cSoftwareMaintenanceVSSSSoftwareMaintenanceRequirementParserRuleCall_14_2_0 = (RuleCall)cSoftwareMaintenanceAssignment_14_2.eContents().get(0);
		private final Group cGroup_14_3 = (Group)cGroup_14.eContents().get(3);
		private final Keyword cCommaKeyword_14_3_0 = (Keyword)cGroup_14_3.eContents().get(0);
		private final Assignment cSoftwareMaintenanceAssignment_14_3_1 = (Assignment)cGroup_14_3.eContents().get(1);
		private final RuleCall cSoftwareMaintenanceVSSSSoftwareMaintenanceRequirementParserRuleCall_14_3_1_0 = (RuleCall)cSoftwareMaintenanceAssignment_14_3_1.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_14_4 = (Keyword)cGroup_14.eContents().get(4);
		private final Group cGroup_15 = (Group)cGroup.eContents().get(15);
		private final Keyword cSystemSoftwareObservabilityKeyword_15_0 = (Keyword)cGroup_15.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_15_1 = (Keyword)cGroup_15.eContents().get(1);
		private final Assignment cSystemSoftwareObservabilityAssignment_15_2 = (Assignment)cGroup_15.eContents().get(2);
		private final RuleCall cSystemSoftwareObservabilityVSSSSystemSoftwareObservabilityRequirementParserRuleCall_15_2_0 = (RuleCall)cSystemSoftwareObservabilityAssignment_15_2.eContents().get(0);
		private final Group cGroup_15_3 = (Group)cGroup_15.eContents().get(3);
		private final Keyword cCommaKeyword_15_3_0 = (Keyword)cGroup_15_3.eContents().get(0);
		private final Assignment cSystemSoftwareObservabilityAssignment_15_3_1 = (Assignment)cGroup_15_3.eContents().get(1);
		private final RuleCall cSystemSoftwareObservabilityVSSSSystemSoftwareObservabilityRequirementParserRuleCall_15_3_1_0 = (RuleCall)cSystemSoftwareObservabilityAssignment_15_3_1.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_15_4 = (Keyword)cGroup_15.eContents().get(4);
		private final Keyword cRightCurlyBracketKeyword_16 = (Keyword)cGroup.eContents().get(16);
		
		//VSSSSpecificRequirements:
		//	{VSSSSpecificRequirements}
		//	'VSSSSpecificRequirements'
		//	'{' ('general' '{' general+=VSSSGeneralRequirement ("," general+=VSSSGeneralRequirement)* '}')? ('capabilities' '{'
		//	capabilities+=VSSSCapabilitiesRequirement ("," capabilities+=VSSSCapabilitiesRequirement)* '}')? ('systemInterface'
		//	'{' systemInterface+=VSSSSystemInterfaceRequirement ("," systemInterface+=VSSSSystemInterfaceRequirement)* '}')?
		//	('adaptationMissionization' '{' adaptationMissionization+=VSSSAdaptationMissionizationRequirement (","
		//	adaptationMissionization+=VSSSAdaptationMissionizationRequirement)* '}')? ('computerResource' '{'
		//	computerResource+=VSSSComputerResourceRequirement ("," computerResource+=VSSSComputerResourceRequirement)* '}')?
		//	('security' '{' security+=VSSSSecurityRequirement ("," security+=VSSSSecurityRequirement)* '}')? ('safety' '{'
		//	safety+=VSSSSafetyRequirement ("," safety+=VSSSSafetyRequirement)* '}')? ('reliabiltyAvailability' '{'
		//	reliabiltyAvailability+=VSSSReliabiltyAvailabilityRequirement (","
		//	reliabiltyAvailability+=VSSSReliabiltyAvailabilityRequirement)* '}')? ('quality' '{' quality+=VSSSQualityRequirement
		//	("," quality+=VSSSQualityRequirement)* '}')? ('design' '{' design+=VSSSDesignRequirement (","
		//	design+=VSSSDesignRequirement)* '}')? ('softwareOperations' '{' softwareOperations+=VSSSSoftwareOperationsRequirement
		//	("," softwareOperations+=VSSSSoftwareOperationsRequirement)* '}')? ('softwareMaintenance' '{'
		//	softwareMaintenance+=VSSSSoftwareMaintenanceRequirement (","
		//	softwareMaintenance+=VSSSSoftwareMaintenanceRequirement)* '}')? ('systemSoftwareObservability' '{'
		//	systemSoftwareObservability+=VSSSSystemSoftwareObservabilityRequirement (","
		//	systemSoftwareObservability+=VSSSSystemSoftwareObservabilityRequirement)* '}')?
		//	'}';
		@Override public ParserRule getRule() { return rule; }
		
		//{VSSSSpecificRequirements} 'VSSSSpecificRequirements' '{' ('general' '{' general+=VSSSGeneralRequirement (","
		//general+=VSSSGeneralRequirement)* '}')? ('capabilities' '{' capabilities+=VSSSCapabilitiesRequirement (","
		//capabilities+=VSSSCapabilitiesRequirement)* '}')? ('systemInterface' '{'
		//systemInterface+=VSSSSystemInterfaceRequirement ("," systemInterface+=VSSSSystemInterfaceRequirement)* '}')?
		//('adaptationMissionization' '{' adaptationMissionization+=VSSSAdaptationMissionizationRequirement (","
		//adaptationMissionization+=VSSSAdaptationMissionizationRequirement)* '}')? ('computerResource' '{'
		//computerResource+=VSSSComputerResourceRequirement ("," computerResource+=VSSSComputerResourceRequirement)* '}')?
		//('security' '{' security+=VSSSSecurityRequirement ("," security+=VSSSSecurityRequirement)* '}')? ('safety' '{'
		//safety+=VSSSSafetyRequirement ("," safety+=VSSSSafetyRequirement)* '}')? ('reliabiltyAvailability' '{'
		//reliabiltyAvailability+=VSSSReliabiltyAvailabilityRequirement (","
		//reliabiltyAvailability+=VSSSReliabiltyAvailabilityRequirement)* '}')? ('quality' '{' quality+=VSSSQualityRequirement
		//("," quality+=VSSSQualityRequirement)* '}')? ('design' '{' design+=VSSSDesignRequirement (","
		//design+=VSSSDesignRequirement)* '}')? ('softwareOperations' '{' softwareOperations+=VSSSSoftwareOperationsRequirement
		//("," softwareOperations+=VSSSSoftwareOperationsRequirement)* '}')? ('softwareMaintenance' '{'
		//softwareMaintenance+=VSSSSoftwareMaintenanceRequirement ("," softwareMaintenance+=VSSSSoftwareMaintenanceRequirement)*
		//'}')? ('systemSoftwareObservability' '{' systemSoftwareObservability+=VSSSSystemSoftwareObservabilityRequirement (","
		//systemSoftwareObservability+=VSSSSystemSoftwareObservabilityRequirement)* '}')? '}'
		public Group getGroup() { return cGroup; }
		
		//{VSSSSpecificRequirements}
		public Action getVSSSSpecificRequirementsAction_0() { return cVSSSSpecificRequirementsAction_0; }
		
		//'VSSSSpecificRequirements'
		public Keyword getVSSSSpecificRequirementsKeyword_1() { return cVSSSSpecificRequirementsKeyword_1; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_2() { return cLeftCurlyBracketKeyword_2; }
		
		//('general' '{' general+=VSSSGeneralRequirement ("," general+=VSSSGeneralRequirement)* '}')?
		public Group getGroup_3() { return cGroup_3; }
		
		//'general'
		public Keyword getGeneralKeyword_3_0() { return cGeneralKeyword_3_0; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_3_1() { return cLeftCurlyBracketKeyword_3_1; }
		
		//general+=VSSSGeneralRequirement
		public Assignment getGeneralAssignment_3_2() { return cGeneralAssignment_3_2; }
		
		//VSSSGeneralRequirement
		public RuleCall getGeneralVSSSGeneralRequirementParserRuleCall_3_2_0() { return cGeneralVSSSGeneralRequirementParserRuleCall_3_2_0; }
		
		//("," general+=VSSSGeneralRequirement)*
		public Group getGroup_3_3() { return cGroup_3_3; }
		
		//","
		public Keyword getCommaKeyword_3_3_0() { return cCommaKeyword_3_3_0; }
		
		//general+=VSSSGeneralRequirement
		public Assignment getGeneralAssignment_3_3_1() { return cGeneralAssignment_3_3_1; }
		
		//VSSSGeneralRequirement
		public RuleCall getGeneralVSSSGeneralRequirementParserRuleCall_3_3_1_0() { return cGeneralVSSSGeneralRequirementParserRuleCall_3_3_1_0; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_3_4() { return cRightCurlyBracketKeyword_3_4; }
		
		//('capabilities' '{' capabilities+=VSSSCapabilitiesRequirement ("," capabilities+=VSSSCapabilitiesRequirement)* '}')?
		public Group getGroup_4() { return cGroup_4; }
		
		//'capabilities'
		public Keyword getCapabilitiesKeyword_4_0() { return cCapabilitiesKeyword_4_0; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_4_1() { return cLeftCurlyBracketKeyword_4_1; }
		
		//capabilities+=VSSSCapabilitiesRequirement
		public Assignment getCapabilitiesAssignment_4_2() { return cCapabilitiesAssignment_4_2; }
		
		//VSSSCapabilitiesRequirement
		public RuleCall getCapabilitiesVSSSCapabilitiesRequirementParserRuleCall_4_2_0() { return cCapabilitiesVSSSCapabilitiesRequirementParserRuleCall_4_2_0; }
		
		//("," capabilities+=VSSSCapabilitiesRequirement)*
		public Group getGroup_4_3() { return cGroup_4_3; }
		
		//","
		public Keyword getCommaKeyword_4_3_0() { return cCommaKeyword_4_3_0; }
		
		//capabilities+=VSSSCapabilitiesRequirement
		public Assignment getCapabilitiesAssignment_4_3_1() { return cCapabilitiesAssignment_4_3_1; }
		
		//VSSSCapabilitiesRequirement
		public RuleCall getCapabilitiesVSSSCapabilitiesRequirementParserRuleCall_4_3_1_0() { return cCapabilitiesVSSSCapabilitiesRequirementParserRuleCall_4_3_1_0; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_4_4() { return cRightCurlyBracketKeyword_4_4; }
		
		//('systemInterface' '{' systemInterface+=VSSSSystemInterfaceRequirement (","
		//systemInterface+=VSSSSystemInterfaceRequirement)* '}')?
		public Group getGroup_5() { return cGroup_5; }
		
		//'systemInterface'
		public Keyword getSystemInterfaceKeyword_5_0() { return cSystemInterfaceKeyword_5_0; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_5_1() { return cLeftCurlyBracketKeyword_5_1; }
		
		//systemInterface+=VSSSSystemInterfaceRequirement
		public Assignment getSystemInterfaceAssignment_5_2() { return cSystemInterfaceAssignment_5_2; }
		
		//VSSSSystemInterfaceRequirement
		public RuleCall getSystemInterfaceVSSSSystemInterfaceRequirementParserRuleCall_5_2_0() { return cSystemInterfaceVSSSSystemInterfaceRequirementParserRuleCall_5_2_0; }
		
		//("," systemInterface+=VSSSSystemInterfaceRequirement)*
		public Group getGroup_5_3() { return cGroup_5_3; }
		
		//","
		public Keyword getCommaKeyword_5_3_0() { return cCommaKeyword_5_3_0; }
		
		//systemInterface+=VSSSSystemInterfaceRequirement
		public Assignment getSystemInterfaceAssignment_5_3_1() { return cSystemInterfaceAssignment_5_3_1; }
		
		//VSSSSystemInterfaceRequirement
		public RuleCall getSystemInterfaceVSSSSystemInterfaceRequirementParserRuleCall_5_3_1_0() { return cSystemInterfaceVSSSSystemInterfaceRequirementParserRuleCall_5_3_1_0; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_5_4() { return cRightCurlyBracketKeyword_5_4; }
		
		//('adaptationMissionization' '{' adaptationMissionization+=VSSSAdaptationMissionizationRequirement (","
		//adaptationMissionization+=VSSSAdaptationMissionizationRequirement)* '}')?
		public Group getGroup_6() { return cGroup_6; }
		
		//'adaptationMissionization'
		public Keyword getAdaptationMissionizationKeyword_6_0() { return cAdaptationMissionizationKeyword_6_0; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_6_1() { return cLeftCurlyBracketKeyword_6_1; }
		
		//adaptationMissionization+=VSSSAdaptationMissionizationRequirement
		public Assignment getAdaptationMissionizationAssignment_6_2() { return cAdaptationMissionizationAssignment_6_2; }
		
		//VSSSAdaptationMissionizationRequirement
		public RuleCall getAdaptationMissionizationVSSSAdaptationMissionizationRequirementParserRuleCall_6_2_0() { return cAdaptationMissionizationVSSSAdaptationMissionizationRequirementParserRuleCall_6_2_0; }
		
		//("," adaptationMissionization+=VSSSAdaptationMissionizationRequirement)*
		public Group getGroup_6_3() { return cGroup_6_3; }
		
		//","
		public Keyword getCommaKeyword_6_3_0() { return cCommaKeyword_6_3_0; }
		
		//adaptationMissionization+=VSSSAdaptationMissionizationRequirement
		public Assignment getAdaptationMissionizationAssignment_6_3_1() { return cAdaptationMissionizationAssignment_6_3_1; }
		
		//VSSSAdaptationMissionizationRequirement
		public RuleCall getAdaptationMissionizationVSSSAdaptationMissionizationRequirementParserRuleCall_6_3_1_0() { return cAdaptationMissionizationVSSSAdaptationMissionizationRequirementParserRuleCall_6_3_1_0; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_6_4() { return cRightCurlyBracketKeyword_6_4; }
		
		//('computerResource' '{' computerResource+=VSSSComputerResourceRequirement (","
		//computerResource+=VSSSComputerResourceRequirement)* '}')?
		public Group getGroup_7() { return cGroup_7; }
		
		//'computerResource'
		public Keyword getComputerResourceKeyword_7_0() { return cComputerResourceKeyword_7_0; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_7_1() { return cLeftCurlyBracketKeyword_7_1; }
		
		//computerResource+=VSSSComputerResourceRequirement
		public Assignment getComputerResourceAssignment_7_2() { return cComputerResourceAssignment_7_2; }
		
		//VSSSComputerResourceRequirement
		public RuleCall getComputerResourceVSSSComputerResourceRequirementParserRuleCall_7_2_0() { return cComputerResourceVSSSComputerResourceRequirementParserRuleCall_7_2_0; }
		
		//("," computerResource+=VSSSComputerResourceRequirement)*
		public Group getGroup_7_3() { return cGroup_7_3; }
		
		//","
		public Keyword getCommaKeyword_7_3_0() { return cCommaKeyword_7_3_0; }
		
		//computerResource+=VSSSComputerResourceRequirement
		public Assignment getComputerResourceAssignment_7_3_1() { return cComputerResourceAssignment_7_3_1; }
		
		//VSSSComputerResourceRequirement
		public RuleCall getComputerResourceVSSSComputerResourceRequirementParserRuleCall_7_3_1_0() { return cComputerResourceVSSSComputerResourceRequirementParserRuleCall_7_3_1_0; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_7_4() { return cRightCurlyBracketKeyword_7_4; }
		
		//('security' '{' security+=VSSSSecurityRequirement ("," security+=VSSSSecurityRequirement)* '}')?
		public Group getGroup_8() { return cGroup_8; }
		
		//'security'
		public Keyword getSecurityKeyword_8_0() { return cSecurityKeyword_8_0; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_8_1() { return cLeftCurlyBracketKeyword_8_1; }
		
		//security+=VSSSSecurityRequirement
		public Assignment getSecurityAssignment_8_2() { return cSecurityAssignment_8_2; }
		
		//VSSSSecurityRequirement
		public RuleCall getSecurityVSSSSecurityRequirementParserRuleCall_8_2_0() { return cSecurityVSSSSecurityRequirementParserRuleCall_8_2_0; }
		
		//("," security+=VSSSSecurityRequirement)*
		public Group getGroup_8_3() { return cGroup_8_3; }
		
		//","
		public Keyword getCommaKeyword_8_3_0() { return cCommaKeyword_8_3_0; }
		
		//security+=VSSSSecurityRequirement
		public Assignment getSecurityAssignment_8_3_1() { return cSecurityAssignment_8_3_1; }
		
		//VSSSSecurityRequirement
		public RuleCall getSecurityVSSSSecurityRequirementParserRuleCall_8_3_1_0() { return cSecurityVSSSSecurityRequirementParserRuleCall_8_3_1_0; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_8_4() { return cRightCurlyBracketKeyword_8_4; }
		
		//('safety' '{' safety+=VSSSSafetyRequirement ("," safety+=VSSSSafetyRequirement)* '}')?
		public Group getGroup_9() { return cGroup_9; }
		
		//'safety'
		public Keyword getSafetyKeyword_9_0() { return cSafetyKeyword_9_0; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_9_1() { return cLeftCurlyBracketKeyword_9_1; }
		
		//safety+=VSSSSafetyRequirement
		public Assignment getSafetyAssignment_9_2() { return cSafetyAssignment_9_2; }
		
		//VSSSSafetyRequirement
		public RuleCall getSafetyVSSSSafetyRequirementParserRuleCall_9_2_0() { return cSafetyVSSSSafetyRequirementParserRuleCall_9_2_0; }
		
		//("," safety+=VSSSSafetyRequirement)*
		public Group getGroup_9_3() { return cGroup_9_3; }
		
		//","
		public Keyword getCommaKeyword_9_3_0() { return cCommaKeyword_9_3_0; }
		
		//safety+=VSSSSafetyRequirement
		public Assignment getSafetyAssignment_9_3_1() { return cSafetyAssignment_9_3_1; }
		
		//VSSSSafetyRequirement
		public RuleCall getSafetyVSSSSafetyRequirementParserRuleCall_9_3_1_0() { return cSafetyVSSSSafetyRequirementParserRuleCall_9_3_1_0; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_9_4() { return cRightCurlyBracketKeyword_9_4; }
		
		//('reliabiltyAvailability' '{' reliabiltyAvailability+=VSSSReliabiltyAvailabilityRequirement (","
		//reliabiltyAvailability+=VSSSReliabiltyAvailabilityRequirement)* '}')?
		public Group getGroup_10() { return cGroup_10; }
		
		//'reliabiltyAvailability'
		public Keyword getReliabiltyAvailabilityKeyword_10_0() { return cReliabiltyAvailabilityKeyword_10_0; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_10_1() { return cLeftCurlyBracketKeyword_10_1; }
		
		//reliabiltyAvailability+=VSSSReliabiltyAvailabilityRequirement
		public Assignment getReliabiltyAvailabilityAssignment_10_2() { return cReliabiltyAvailabilityAssignment_10_2; }
		
		//VSSSReliabiltyAvailabilityRequirement
		public RuleCall getReliabiltyAvailabilityVSSSReliabiltyAvailabilityRequirementParserRuleCall_10_2_0() { return cReliabiltyAvailabilityVSSSReliabiltyAvailabilityRequirementParserRuleCall_10_2_0; }
		
		//("," reliabiltyAvailability+=VSSSReliabiltyAvailabilityRequirement)*
		public Group getGroup_10_3() { return cGroup_10_3; }
		
		//","
		public Keyword getCommaKeyword_10_3_0() { return cCommaKeyword_10_3_0; }
		
		//reliabiltyAvailability+=VSSSReliabiltyAvailabilityRequirement
		public Assignment getReliabiltyAvailabilityAssignment_10_3_1() { return cReliabiltyAvailabilityAssignment_10_3_1; }
		
		//VSSSReliabiltyAvailabilityRequirement
		public RuleCall getReliabiltyAvailabilityVSSSReliabiltyAvailabilityRequirementParserRuleCall_10_3_1_0() { return cReliabiltyAvailabilityVSSSReliabiltyAvailabilityRequirementParserRuleCall_10_3_1_0; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_10_4() { return cRightCurlyBracketKeyword_10_4; }
		
		//('quality' '{' quality+=VSSSQualityRequirement ("," quality+=VSSSQualityRequirement)* '}')?
		public Group getGroup_11() { return cGroup_11; }
		
		//'quality'
		public Keyword getQualityKeyword_11_0() { return cQualityKeyword_11_0; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_11_1() { return cLeftCurlyBracketKeyword_11_1; }
		
		//quality+=VSSSQualityRequirement
		public Assignment getQualityAssignment_11_2() { return cQualityAssignment_11_2; }
		
		//VSSSQualityRequirement
		public RuleCall getQualityVSSSQualityRequirementParserRuleCall_11_2_0() { return cQualityVSSSQualityRequirementParserRuleCall_11_2_0; }
		
		//("," quality+=VSSSQualityRequirement)*
		public Group getGroup_11_3() { return cGroup_11_3; }
		
		//","
		public Keyword getCommaKeyword_11_3_0() { return cCommaKeyword_11_3_0; }
		
		//quality+=VSSSQualityRequirement
		public Assignment getQualityAssignment_11_3_1() { return cQualityAssignment_11_3_1; }
		
		//VSSSQualityRequirement
		public RuleCall getQualityVSSSQualityRequirementParserRuleCall_11_3_1_0() { return cQualityVSSSQualityRequirementParserRuleCall_11_3_1_0; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_11_4() { return cRightCurlyBracketKeyword_11_4; }
		
		//('design' '{' design+=VSSSDesignRequirement ("," design+=VSSSDesignRequirement)* '}')?
		public Group getGroup_12() { return cGroup_12; }
		
		//'design'
		public Keyword getDesignKeyword_12_0() { return cDesignKeyword_12_0; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_12_1() { return cLeftCurlyBracketKeyword_12_1; }
		
		//design+=VSSSDesignRequirement
		public Assignment getDesignAssignment_12_2() { return cDesignAssignment_12_2; }
		
		//VSSSDesignRequirement
		public RuleCall getDesignVSSSDesignRequirementParserRuleCall_12_2_0() { return cDesignVSSSDesignRequirementParserRuleCall_12_2_0; }
		
		//("," design+=VSSSDesignRequirement)*
		public Group getGroup_12_3() { return cGroup_12_3; }
		
		//","
		public Keyword getCommaKeyword_12_3_0() { return cCommaKeyword_12_3_0; }
		
		//design+=VSSSDesignRequirement
		public Assignment getDesignAssignment_12_3_1() { return cDesignAssignment_12_3_1; }
		
		//VSSSDesignRequirement
		public RuleCall getDesignVSSSDesignRequirementParserRuleCall_12_3_1_0() { return cDesignVSSSDesignRequirementParserRuleCall_12_3_1_0; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_12_4() { return cRightCurlyBracketKeyword_12_4; }
		
		//('softwareOperations' '{' softwareOperations+=VSSSSoftwareOperationsRequirement (","
		//softwareOperations+=VSSSSoftwareOperationsRequirement)* '}')?
		public Group getGroup_13() { return cGroup_13; }
		
		//'softwareOperations'
		public Keyword getSoftwareOperationsKeyword_13_0() { return cSoftwareOperationsKeyword_13_0; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_13_1() { return cLeftCurlyBracketKeyword_13_1; }
		
		//softwareOperations+=VSSSSoftwareOperationsRequirement
		public Assignment getSoftwareOperationsAssignment_13_2() { return cSoftwareOperationsAssignment_13_2; }
		
		//VSSSSoftwareOperationsRequirement
		public RuleCall getSoftwareOperationsVSSSSoftwareOperationsRequirementParserRuleCall_13_2_0() { return cSoftwareOperationsVSSSSoftwareOperationsRequirementParserRuleCall_13_2_0; }
		
		//("," softwareOperations+=VSSSSoftwareOperationsRequirement)*
		public Group getGroup_13_3() { return cGroup_13_3; }
		
		//","
		public Keyword getCommaKeyword_13_3_0() { return cCommaKeyword_13_3_0; }
		
		//softwareOperations+=VSSSSoftwareOperationsRequirement
		public Assignment getSoftwareOperationsAssignment_13_3_1() { return cSoftwareOperationsAssignment_13_3_1; }
		
		//VSSSSoftwareOperationsRequirement
		public RuleCall getSoftwareOperationsVSSSSoftwareOperationsRequirementParserRuleCall_13_3_1_0() { return cSoftwareOperationsVSSSSoftwareOperationsRequirementParserRuleCall_13_3_1_0; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_13_4() { return cRightCurlyBracketKeyword_13_4; }
		
		//('softwareMaintenance' '{' softwareMaintenance+=VSSSSoftwareMaintenanceRequirement (","
		//softwareMaintenance+=VSSSSoftwareMaintenanceRequirement)* '}')?
		public Group getGroup_14() { return cGroup_14; }
		
		//'softwareMaintenance'
		public Keyword getSoftwareMaintenanceKeyword_14_0() { return cSoftwareMaintenanceKeyword_14_0; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_14_1() { return cLeftCurlyBracketKeyword_14_1; }
		
		//softwareMaintenance+=VSSSSoftwareMaintenanceRequirement
		public Assignment getSoftwareMaintenanceAssignment_14_2() { return cSoftwareMaintenanceAssignment_14_2; }
		
		//VSSSSoftwareMaintenanceRequirement
		public RuleCall getSoftwareMaintenanceVSSSSoftwareMaintenanceRequirementParserRuleCall_14_2_0() { return cSoftwareMaintenanceVSSSSoftwareMaintenanceRequirementParserRuleCall_14_2_0; }
		
		//("," softwareMaintenance+=VSSSSoftwareMaintenanceRequirement)*
		public Group getGroup_14_3() { return cGroup_14_3; }
		
		//","
		public Keyword getCommaKeyword_14_3_0() { return cCommaKeyword_14_3_0; }
		
		//softwareMaintenance+=VSSSSoftwareMaintenanceRequirement
		public Assignment getSoftwareMaintenanceAssignment_14_3_1() { return cSoftwareMaintenanceAssignment_14_3_1; }
		
		//VSSSSoftwareMaintenanceRequirement
		public RuleCall getSoftwareMaintenanceVSSSSoftwareMaintenanceRequirementParserRuleCall_14_3_1_0() { return cSoftwareMaintenanceVSSSSoftwareMaintenanceRequirementParserRuleCall_14_3_1_0; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_14_4() { return cRightCurlyBracketKeyword_14_4; }
		
		//('systemSoftwareObservability' '{' systemSoftwareObservability+=VSSSSystemSoftwareObservabilityRequirement (","
		//systemSoftwareObservability+=VSSSSystemSoftwareObservabilityRequirement)* '}')?
		public Group getGroup_15() { return cGroup_15; }
		
		//'systemSoftwareObservability'
		public Keyword getSystemSoftwareObservabilityKeyword_15_0() { return cSystemSoftwareObservabilityKeyword_15_0; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_15_1() { return cLeftCurlyBracketKeyword_15_1; }
		
		//systemSoftwareObservability+=VSSSSystemSoftwareObservabilityRequirement
		public Assignment getSystemSoftwareObservabilityAssignment_15_2() { return cSystemSoftwareObservabilityAssignment_15_2; }
		
		//VSSSSystemSoftwareObservabilityRequirement
		public RuleCall getSystemSoftwareObservabilityVSSSSystemSoftwareObservabilityRequirementParserRuleCall_15_2_0() { return cSystemSoftwareObservabilityVSSSSystemSoftwareObservabilityRequirementParserRuleCall_15_2_0; }
		
		//("," systemSoftwareObservability+=VSSSSystemSoftwareObservabilityRequirement)*
		public Group getGroup_15_3() { return cGroup_15_3; }
		
		//","
		public Keyword getCommaKeyword_15_3_0() { return cCommaKeyword_15_3_0; }
		
		//systemSoftwareObservability+=VSSSSystemSoftwareObservabilityRequirement
		public Assignment getSystemSoftwareObservabilityAssignment_15_3_1() { return cSystemSoftwareObservabilityAssignment_15_3_1; }
		
		//VSSSSystemSoftwareObservabilityRequirement
		public RuleCall getSystemSoftwareObservabilityVSSSSystemSoftwareObservabilityRequirementParserRuleCall_15_3_1_0() { return cSystemSoftwareObservabilityVSSSSystemSoftwareObservabilityRequirementParserRuleCall_15_3_1_0; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_15_4() { return cRightCurlyBracketKeyword_15_4; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_16() { return cRightCurlyBracketKeyword_16; }
	}
	public class VSSSVerificationValidationIntegrationRequirementsElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.micobs.svm.lang.sss.SSS.VSSSVerificationValidationIntegrationRequirements");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cVSSSVerificationValidationIntegrationRequirementsAction_0 = (Action)cGroup.eContents().get(0);
		private final Keyword cVSSSVerificationValidationIntegrationRequirementsKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Keyword cLeftCurlyBracketKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Group cGroup_3 = (Group)cGroup.eContents().get(3);
		private final Keyword cVerificationValidationProcessKeyword_3_0 = (Keyword)cGroup_3.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_3_1 = (Keyword)cGroup_3.eContents().get(1);
		private final Assignment cVerificationValidationProcessAssignment_3_2 = (Assignment)cGroup_3.eContents().get(2);
		private final RuleCall cVerificationValidationProcessVSSSVerificationValidationProcessRequirementParserRuleCall_3_2_0 = (RuleCall)cVerificationValidationProcessAssignment_3_2.eContents().get(0);
		private final Group cGroup_3_3 = (Group)cGroup_3.eContents().get(3);
		private final Keyword cCommaKeyword_3_3_0 = (Keyword)cGroup_3_3.eContents().get(0);
		private final Assignment cVerificationValidationProcessAssignment_3_3_1 = (Assignment)cGroup_3_3.eContents().get(1);
		private final RuleCall cVerificationValidationProcessVSSSVerificationValidationProcessRequirementParserRuleCall_3_3_1_0 = (RuleCall)cVerificationValidationProcessAssignment_3_3_1.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_3_4 = (Keyword)cGroup_3.eContents().get(4);
		private final Group cGroup_4 = (Group)cGroup.eContents().get(4);
		private final Keyword cValidationApproachKeyword_4_0 = (Keyword)cGroup_4.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_4_1 = (Keyword)cGroup_4.eContents().get(1);
		private final Assignment cValidationApproachAssignment_4_2 = (Assignment)cGroup_4.eContents().get(2);
		private final RuleCall cValidationApproachVSSSValidationApproachParserRuleCall_4_2_0 = (RuleCall)cValidationApproachAssignment_4_2.eContents().get(0);
		private final Group cGroup_4_3 = (Group)cGroup_4.eContents().get(3);
		private final Keyword cCommaKeyword_4_3_0 = (Keyword)cGroup_4_3.eContents().get(0);
		private final Assignment cValidationApproachAssignment_4_3_1 = (Assignment)cGroup_4_3.eContents().get(1);
		private final RuleCall cValidationApproachVSSSValidationApproachParserRuleCall_4_3_1_0 = (RuleCall)cValidationApproachAssignment_4_3_1.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_4_4 = (Keyword)cGroup_4.eContents().get(4);
		private final Group cGroup_5 = (Group)cGroup.eContents().get(5);
		private final Keyword cValidationKeyword_5_0 = (Keyword)cGroup_5.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_5_1 = (Keyword)cGroup_5.eContents().get(1);
		private final Assignment cValidationAssignment_5_2 = (Assignment)cGroup_5.eContents().get(2);
		private final RuleCall cValidationVSSSValidationRequirementParserRuleCall_5_2_0 = (RuleCall)cValidationAssignment_5_2.eContents().get(0);
		private final Group cGroup_5_3 = (Group)cGroup_5.eContents().get(3);
		private final Keyword cCommaKeyword_5_3_0 = (Keyword)cGroup_5_3.eContents().get(0);
		private final Assignment cValidationAssignment_5_3_1 = (Assignment)cGroup_5_3.eContents().get(1);
		private final RuleCall cValidationVSSSValidationRequirementParserRuleCall_5_3_1_0 = (RuleCall)cValidationAssignment_5_3_1.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_5_4 = (Keyword)cGroup_5.eContents().get(4);
		private final Group cGroup_6 = (Group)cGroup.eContents().get(6);
		private final Keyword cVerificationKeyword_6_0 = (Keyword)cGroup_6.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_6_1 = (Keyword)cGroup_6.eContents().get(1);
		private final Assignment cVerificationAssignment_6_2 = (Assignment)cGroup_6.eContents().get(2);
		private final RuleCall cVerificationVSSSVerificationRequirementParserRuleCall_6_2_0 = (RuleCall)cVerificationAssignment_6_2.eContents().get(0);
		private final Group cGroup_6_3 = (Group)cGroup_6.eContents().get(3);
		private final Keyword cCommaKeyword_6_3_0 = (Keyword)cGroup_6_3.eContents().get(0);
		private final Assignment cVerificationAssignment_6_3_1 = (Assignment)cGroup_6_3.eContents().get(1);
		private final RuleCall cVerificationVSSSVerificationRequirementParserRuleCall_6_3_1_0 = (RuleCall)cVerificationAssignment_6_3_1.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_6_4 = (Keyword)cGroup_6.eContents().get(4);
		private final Keyword cRightCurlyBracketKeyword_7 = (Keyword)cGroup.eContents().get(7);
		
		//VSSSVerificationValidationIntegrationRequirements:
		//	{VSSSVerificationValidationIntegrationRequirements}
		//	'VSSSVerificationValidationIntegrationRequirements'
		//	'{' ('verificationValidationProcess' '{' verificationValidationProcess+=VSSSVerificationValidationProcessRequirement
		//	("," verificationValidationProcess+=VSSSVerificationValidationProcessRequirement)* '}')? ('validationApproach' '{'
		//	validationApproach+=VSSSValidationApproach ("," validationApproach+=VSSSValidationApproach)* '}')? ('validation' '{'
		//	validation+=VSSSValidationRequirement ("," validation+=VSSSValidationRequirement)* '}')? ('verification' '{'
		//	verification+=VSSSVerificationRequirement ("," verification+=VSSSVerificationRequirement)* '}')?
		//	'}';
		@Override public ParserRule getRule() { return rule; }
		
		//{VSSSVerificationValidationIntegrationRequirements} 'VSSSVerificationValidationIntegrationRequirements' '{'
		//('verificationValidationProcess' '{' verificationValidationProcess+=VSSSVerificationValidationProcessRequirement (","
		//verificationValidationProcess+=VSSSVerificationValidationProcessRequirement)* '}')? ('validationApproach' '{'
		//validationApproach+=VSSSValidationApproach ("," validationApproach+=VSSSValidationApproach)* '}')? ('validation' '{'
		//validation+=VSSSValidationRequirement ("," validation+=VSSSValidationRequirement)* '}')? ('verification' '{'
		//verification+=VSSSVerificationRequirement ("," verification+=VSSSVerificationRequirement)* '}')? '}'
		public Group getGroup() { return cGroup; }
		
		//{VSSSVerificationValidationIntegrationRequirements}
		public Action getVSSSVerificationValidationIntegrationRequirementsAction_0() { return cVSSSVerificationValidationIntegrationRequirementsAction_0; }
		
		//'VSSSVerificationValidationIntegrationRequirements'
		public Keyword getVSSSVerificationValidationIntegrationRequirementsKeyword_1() { return cVSSSVerificationValidationIntegrationRequirementsKeyword_1; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_2() { return cLeftCurlyBracketKeyword_2; }
		
		//('verificationValidationProcess' '{' verificationValidationProcess+=VSSSVerificationValidationProcessRequirement (","
		//verificationValidationProcess+=VSSSVerificationValidationProcessRequirement)* '}')?
		public Group getGroup_3() { return cGroup_3; }
		
		//'verificationValidationProcess'
		public Keyword getVerificationValidationProcessKeyword_3_0() { return cVerificationValidationProcessKeyword_3_0; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_3_1() { return cLeftCurlyBracketKeyword_3_1; }
		
		//verificationValidationProcess+=VSSSVerificationValidationProcessRequirement
		public Assignment getVerificationValidationProcessAssignment_3_2() { return cVerificationValidationProcessAssignment_3_2; }
		
		//VSSSVerificationValidationProcessRequirement
		public RuleCall getVerificationValidationProcessVSSSVerificationValidationProcessRequirementParserRuleCall_3_2_0() { return cVerificationValidationProcessVSSSVerificationValidationProcessRequirementParserRuleCall_3_2_0; }
		
		//("," verificationValidationProcess+=VSSSVerificationValidationProcessRequirement)*
		public Group getGroup_3_3() { return cGroup_3_3; }
		
		//","
		public Keyword getCommaKeyword_3_3_0() { return cCommaKeyword_3_3_0; }
		
		//verificationValidationProcess+=VSSSVerificationValidationProcessRequirement
		public Assignment getVerificationValidationProcessAssignment_3_3_1() { return cVerificationValidationProcessAssignment_3_3_1; }
		
		//VSSSVerificationValidationProcessRequirement
		public RuleCall getVerificationValidationProcessVSSSVerificationValidationProcessRequirementParserRuleCall_3_3_1_0() { return cVerificationValidationProcessVSSSVerificationValidationProcessRequirementParserRuleCall_3_3_1_0; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_3_4() { return cRightCurlyBracketKeyword_3_4; }
		
		//('validationApproach' '{' validationApproach+=VSSSValidationApproach ("," validationApproach+=VSSSValidationApproach)*
		//'}')?
		public Group getGroup_4() { return cGroup_4; }
		
		//'validationApproach'
		public Keyword getValidationApproachKeyword_4_0() { return cValidationApproachKeyword_4_0; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_4_1() { return cLeftCurlyBracketKeyword_4_1; }
		
		//validationApproach+=VSSSValidationApproach
		public Assignment getValidationApproachAssignment_4_2() { return cValidationApproachAssignment_4_2; }
		
		//VSSSValidationApproach
		public RuleCall getValidationApproachVSSSValidationApproachParserRuleCall_4_2_0() { return cValidationApproachVSSSValidationApproachParserRuleCall_4_2_0; }
		
		//("," validationApproach+=VSSSValidationApproach)*
		public Group getGroup_4_3() { return cGroup_4_3; }
		
		//","
		public Keyword getCommaKeyword_4_3_0() { return cCommaKeyword_4_3_0; }
		
		//validationApproach+=VSSSValidationApproach
		public Assignment getValidationApproachAssignment_4_3_1() { return cValidationApproachAssignment_4_3_1; }
		
		//VSSSValidationApproach
		public RuleCall getValidationApproachVSSSValidationApproachParserRuleCall_4_3_1_0() { return cValidationApproachVSSSValidationApproachParserRuleCall_4_3_1_0; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_4_4() { return cRightCurlyBracketKeyword_4_4; }
		
		//('validation' '{' validation+=VSSSValidationRequirement ("," validation+=VSSSValidationRequirement)* '}')?
		public Group getGroup_5() { return cGroup_5; }
		
		//'validation'
		public Keyword getValidationKeyword_5_0() { return cValidationKeyword_5_0; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_5_1() { return cLeftCurlyBracketKeyword_5_1; }
		
		//validation+=VSSSValidationRequirement
		public Assignment getValidationAssignment_5_2() { return cValidationAssignment_5_2; }
		
		//VSSSValidationRequirement
		public RuleCall getValidationVSSSValidationRequirementParserRuleCall_5_2_0() { return cValidationVSSSValidationRequirementParserRuleCall_5_2_0; }
		
		//("," validation+=VSSSValidationRequirement)*
		public Group getGroup_5_3() { return cGroup_5_3; }
		
		//","
		public Keyword getCommaKeyword_5_3_0() { return cCommaKeyword_5_3_0; }
		
		//validation+=VSSSValidationRequirement
		public Assignment getValidationAssignment_5_3_1() { return cValidationAssignment_5_3_1; }
		
		//VSSSValidationRequirement
		public RuleCall getValidationVSSSValidationRequirementParserRuleCall_5_3_1_0() { return cValidationVSSSValidationRequirementParserRuleCall_5_3_1_0; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_5_4() { return cRightCurlyBracketKeyword_5_4; }
		
		//('verification' '{' verification+=VSSSVerificationRequirement ("," verification+=VSSSVerificationRequirement)* '}')?
		public Group getGroup_6() { return cGroup_6; }
		
		//'verification'
		public Keyword getVerificationKeyword_6_0() { return cVerificationKeyword_6_0; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_6_1() { return cLeftCurlyBracketKeyword_6_1; }
		
		//verification+=VSSSVerificationRequirement
		public Assignment getVerificationAssignment_6_2() { return cVerificationAssignment_6_2; }
		
		//VSSSVerificationRequirement
		public RuleCall getVerificationVSSSVerificationRequirementParserRuleCall_6_2_0() { return cVerificationVSSSVerificationRequirementParserRuleCall_6_2_0; }
		
		//("," verification+=VSSSVerificationRequirement)*
		public Group getGroup_6_3() { return cGroup_6_3; }
		
		//","
		public Keyword getCommaKeyword_6_3_0() { return cCommaKeyword_6_3_0; }
		
		//verification+=VSSSVerificationRequirement
		public Assignment getVerificationAssignment_6_3_1() { return cVerificationAssignment_6_3_1; }
		
		//VSSSVerificationRequirement
		public RuleCall getVerificationVSSSVerificationRequirementParserRuleCall_6_3_1_0() { return cVerificationVSSSVerificationRequirementParserRuleCall_6_3_1_0; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_6_4() { return cRightCurlyBracketKeyword_6_4; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_7() { return cRightCurlyBracketKeyword_7; }
	}
	public class VSSSSystemModelsElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.micobs.svm.lang.sss.SSS.VSSSSystemModels");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cVSSSSystemModelsKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Keyword cSystemModelsKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Keyword cLeftCurlyBracketKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Assignment cSystemModelsAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cSystemModelsVSSSSystemModelParserRuleCall_4_0 = (RuleCall)cSystemModelsAssignment_4.eContents().get(0);
		private final Group cGroup_5 = (Group)cGroup.eContents().get(5);
		private final Keyword cCommaKeyword_5_0 = (Keyword)cGroup_5.eContents().get(0);
		private final Assignment cSystemModelsAssignment_5_1 = (Assignment)cGroup_5.eContents().get(1);
		private final RuleCall cSystemModelsVSSSSystemModelParserRuleCall_5_1_0 = (RuleCall)cSystemModelsAssignment_5_1.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_6 = (Keyword)cGroup.eContents().get(6);
		private final Keyword cRightCurlyBracketKeyword_7 = (Keyword)cGroup.eContents().get(7);
		
		//VSSSSystemModels:
		//	'VSSSSystemModels'
		//	'{'
		//	'systemModels' '{' systemModels+=VSSSSystemModel ("," systemModels+=VSSSSystemModel)* '}'
		//	'}';
		@Override public ParserRule getRule() { return rule; }
		
		//'VSSSSystemModels' '{' 'systemModels' '{' systemModels+=VSSSSystemModel ("," systemModels+=VSSSSystemModel)* '}' '}'
		public Group getGroup() { return cGroup; }
		
		//'VSSSSystemModels'
		public Keyword getVSSSSystemModelsKeyword_0() { return cVSSSSystemModelsKeyword_0; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_1() { return cLeftCurlyBracketKeyword_1; }
		
		//'systemModels'
		public Keyword getSystemModelsKeyword_2() { return cSystemModelsKeyword_2; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_3() { return cLeftCurlyBracketKeyword_3; }
		
		//systemModels+=VSSSSystemModel
		public Assignment getSystemModelsAssignment_4() { return cSystemModelsAssignment_4; }
		
		//VSSSSystemModel
		public RuleCall getSystemModelsVSSSSystemModelParserRuleCall_4_0() { return cSystemModelsVSSSSystemModelParserRuleCall_4_0; }
		
		//("," systemModels+=VSSSSystemModel)*
		public Group getGroup_5() { return cGroup_5; }
		
		//","
		public Keyword getCommaKeyword_5_0() { return cCommaKeyword_5_0; }
		
		//systemModels+=VSSSSystemModel
		public Assignment getSystemModelsAssignment_5_1() { return cSystemModelsAssignment_5_1; }
		
		//VSSSSystemModel
		public RuleCall getSystemModelsVSSSSystemModelParserRuleCall_5_1_0() { return cSystemModelsVSSSSystemModelParserRuleCall_5_1_0; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_6() { return cRightCurlyBracketKeyword_6; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_7() { return cRightCurlyBracketKeyword_7; }
	}
	public class DBody_ImplElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.micobs.svm.lang.sss.SSS.DBody_Impl");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cDBodyKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Keyword cBodyContentKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Keyword cLeftCurlyBracketKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Assignment cBodyContentAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cBodyContentDBodyContentParserRuleCall_4_0 = (RuleCall)cBodyContentAssignment_4.eContents().get(0);
		private final Group cGroup_5 = (Group)cGroup.eContents().get(5);
		private final Keyword cCommaKeyword_5_0 = (Keyword)cGroup_5.eContents().get(0);
		private final Assignment cBodyContentAssignment_5_1 = (Assignment)cGroup_5.eContents().get(1);
		private final RuleCall cBodyContentDBodyContentParserRuleCall_5_1_0 = (RuleCall)cBodyContentAssignment_5_1.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_6 = (Keyword)cGroup.eContents().get(6);
		private final Keyword cRightCurlyBracketKeyword_7 = (Keyword)cGroup.eContents().get(7);
		
		//DBody_Impl doc::DBody:
		//	'DBody'
		//	'{'
		//	'bodyContent' '{' bodyContent+=DBodyContent ("," bodyContent+=DBodyContent)* '}'
		//	'}'
		@Override public ParserRule getRule() { return rule; }
		
		//'DBody' '{' 'bodyContent' '{' bodyContent+=DBodyContent ("," bodyContent+=DBodyContent)* '}' '}'
		public Group getGroup() { return cGroup; }
		
		//'DBody'
		public Keyword getDBodyKeyword_0() { return cDBodyKeyword_0; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_1() { return cLeftCurlyBracketKeyword_1; }
		
		//'bodyContent'
		public Keyword getBodyContentKeyword_2() { return cBodyContentKeyword_2; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_3() { return cLeftCurlyBracketKeyword_3; }
		
		//bodyContent+=DBodyContent
		public Assignment getBodyContentAssignment_4() { return cBodyContentAssignment_4; }
		
		//DBodyContent
		public RuleCall getBodyContentDBodyContentParserRuleCall_4_0() { return cBodyContentDBodyContentParserRuleCall_4_0; }
		
		//("," bodyContent+=DBodyContent)*
		public Group getGroup_5() { return cGroup_5; }
		
		//","
		public Keyword getCommaKeyword_5_0() { return cCommaKeyword_5_0; }
		
		//bodyContent+=DBodyContent
		public Assignment getBodyContentAssignment_5_1() { return cBodyContentAssignment_5_1; }
		
		//DBodyContent
		public RuleCall getBodyContentDBodyContentParserRuleCall_5_1_0() { return cBodyContentDBodyContentParserRuleCall_5_1_0; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_6() { return cRightCurlyBracketKeyword_6; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_7() { return cRightCurlyBracketKeyword_7; }
	}
	public class DCellElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.micobs.svm.lang.sss.SSS.DCell");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cDCellKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Keyword cBodyContentKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Keyword cLeftCurlyBracketKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Assignment cBodyContentAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cBodyContentDBodyContentParserRuleCall_4_0 = (RuleCall)cBodyContentAssignment_4.eContents().get(0);
		private final Group cGroup_5 = (Group)cGroup.eContents().get(5);
		private final Keyword cCommaKeyword_5_0 = (Keyword)cGroup_5.eContents().get(0);
		private final Assignment cBodyContentAssignment_5_1 = (Assignment)cGroup_5.eContents().get(1);
		private final RuleCall cBodyContentDBodyContentParserRuleCall_5_1_0 = (RuleCall)cBodyContentAssignment_5_1.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_6 = (Keyword)cGroup.eContents().get(6);
		private final Keyword cRightCurlyBracketKeyword_7 = (Keyword)cGroup.eContents().get(7);
		
		//DCell doc::DCell:
		//	'DCell'
		//	'{'
		//	'bodyContent' '{' bodyContent+=DBodyContent ("," bodyContent+=DBodyContent)* '}'
		//	'}'
		@Override public ParserRule getRule() { return rule; }
		
		//'DCell' '{' 'bodyContent' '{' bodyContent+=DBodyContent ("," bodyContent+=DBodyContent)* '}' '}'
		public Group getGroup() { return cGroup; }
		
		//'DCell'
		public Keyword getDCellKeyword_0() { return cDCellKeyword_0; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_1() { return cLeftCurlyBracketKeyword_1; }
		
		//'bodyContent'
		public Keyword getBodyContentKeyword_2() { return cBodyContentKeyword_2; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_3() { return cLeftCurlyBracketKeyword_3; }
		
		//bodyContent+=DBodyContent
		public Assignment getBodyContentAssignment_4() { return cBodyContentAssignment_4; }
		
		//DBodyContent
		public RuleCall getBodyContentDBodyContentParserRuleCall_4_0() { return cBodyContentDBodyContentParserRuleCall_4_0; }
		
		//("," bodyContent+=DBodyContent)*
		public Group getGroup_5() { return cGroup_5; }
		
		//","
		public Keyword getCommaKeyword_5_0() { return cCommaKeyword_5_0; }
		
		//bodyContent+=DBodyContent
		public Assignment getBodyContentAssignment_5_1() { return cBodyContentAssignment_5_1; }
		
		//DBodyContent
		public RuleCall getBodyContentDBodyContentParserRuleCall_5_1_0() { return cBodyContentDBodyContentParserRuleCall_5_1_0; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_6() { return cRightCurlyBracketKeyword_6; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_7() { return cRightCurlyBracketKeyword_7; }
	}
	public class DParagraphElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.micobs.svm.lang.sss.SSS.DParagraph");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cDParagraphKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Keyword cParagraphContentKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Keyword cLeftCurlyBracketKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Assignment cParagraphContentAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cParagraphContentDParagraphContentParserRuleCall_4_0 = (RuleCall)cParagraphContentAssignment_4.eContents().get(0);
		private final Group cGroup_5 = (Group)cGroup.eContents().get(5);
		private final Keyword cCommaKeyword_5_0 = (Keyword)cGroup_5.eContents().get(0);
		private final Assignment cParagraphContentAssignment_5_1 = (Assignment)cGroup_5.eContents().get(1);
		private final RuleCall cParagraphContentDParagraphContentParserRuleCall_5_1_0 = (RuleCall)cParagraphContentAssignment_5_1.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_6 = (Keyword)cGroup.eContents().get(6);
		private final Keyword cRightCurlyBracketKeyword_7 = (Keyword)cGroup.eContents().get(7);
		
		//DParagraph doc::DParagraph:
		//	'DParagraph'
		//	'{'
		//	'paragraphContent' '{' paragraphContent+=DParagraphContent ("," paragraphContent+=DParagraphContent)* '}'
		//	'}'
		@Override public ParserRule getRule() { return rule; }
		
		//'DParagraph' '{' 'paragraphContent' '{' paragraphContent+=DParagraphContent ("," paragraphContent+=DParagraphContent)*
		//'}' '}'
		public Group getGroup() { return cGroup; }
		
		//'DParagraph'
		public Keyword getDParagraphKeyword_0() { return cDParagraphKeyword_0; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_1() { return cLeftCurlyBracketKeyword_1; }
		
		//'paragraphContent'
		public Keyword getParagraphContentKeyword_2() { return cParagraphContentKeyword_2; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_3() { return cLeftCurlyBracketKeyword_3; }
		
		//paragraphContent+=DParagraphContent
		public Assignment getParagraphContentAssignment_4() { return cParagraphContentAssignment_4; }
		
		//DParagraphContent
		public RuleCall getParagraphContentDParagraphContentParserRuleCall_4_0() { return cParagraphContentDParagraphContentParserRuleCall_4_0; }
		
		//("," paragraphContent+=DParagraphContent)*
		public Group getGroup_5() { return cGroup_5; }
		
		//","
		public Keyword getCommaKeyword_5_0() { return cCommaKeyword_5_0; }
		
		//paragraphContent+=DParagraphContent
		public Assignment getParagraphContentAssignment_5_1() { return cParagraphContentAssignment_5_1; }
		
		//DParagraphContent
		public RuleCall getParagraphContentDParagraphContentParserRuleCall_5_1_0() { return cParagraphContentDParagraphContentParserRuleCall_5_1_0; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_6() { return cRightCurlyBracketKeyword_6; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_7() { return cRightCurlyBracketKeyword_7; }
	}
	public class DItemizeElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.micobs.svm.lang.sss.SSS.DItemize");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cDItemizeKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Keyword cItemsKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Keyword cLeftCurlyBracketKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Assignment cItemsAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cItemsDListItemParserRuleCall_4_0 = (RuleCall)cItemsAssignment_4.eContents().get(0);
		private final Group cGroup_5 = (Group)cGroup.eContents().get(5);
		private final Keyword cCommaKeyword_5_0 = (Keyword)cGroup_5.eContents().get(0);
		private final Assignment cItemsAssignment_5_1 = (Assignment)cGroup_5.eContents().get(1);
		private final RuleCall cItemsDListItemParserRuleCall_5_1_0 = (RuleCall)cItemsAssignment_5_1.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_6 = (Keyword)cGroup.eContents().get(6);
		private final Keyword cRightCurlyBracketKeyword_7 = (Keyword)cGroup.eContents().get(7);
		
		//DItemize doc::DItemize:
		//	'DItemize'
		//	'{'
		//	'items' '{' items+=DListItem ("," items+=DListItem)* '}'
		//	'}'
		@Override public ParserRule getRule() { return rule; }
		
		//'DItemize' '{' 'items' '{' items+=DListItem ("," items+=DListItem)* '}' '}'
		public Group getGroup() { return cGroup; }
		
		//'DItemize'
		public Keyword getDItemizeKeyword_0() { return cDItemizeKeyword_0; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_1() { return cLeftCurlyBracketKeyword_1; }
		
		//'items'
		public Keyword getItemsKeyword_2() { return cItemsKeyword_2; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_3() { return cLeftCurlyBracketKeyword_3; }
		
		//items+=DListItem
		public Assignment getItemsAssignment_4() { return cItemsAssignment_4; }
		
		//DListItem
		public RuleCall getItemsDListItemParserRuleCall_4_0() { return cItemsDListItemParserRuleCall_4_0; }
		
		//("," items+=DListItem)*
		public Group getGroup_5() { return cGroup_5; }
		
		//","
		public Keyword getCommaKeyword_5_0() { return cCommaKeyword_5_0; }
		
		//items+=DListItem
		public Assignment getItemsAssignment_5_1() { return cItemsAssignment_5_1; }
		
		//DListItem
		public RuleCall getItemsDListItemParserRuleCall_5_1_0() { return cItemsDListItemParserRuleCall_5_1_0; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_6() { return cRightCurlyBracketKeyword_6; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_7() { return cRightCurlyBracketKeyword_7; }
	}
	public class DEnumerateElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.micobs.svm.lang.sss.SSS.DEnumerate");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cDEnumerateKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Keyword cItemsKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Keyword cLeftCurlyBracketKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Assignment cItemsAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cItemsDListItemParserRuleCall_4_0 = (RuleCall)cItemsAssignment_4.eContents().get(0);
		private final Group cGroup_5 = (Group)cGroup.eContents().get(5);
		private final Keyword cCommaKeyword_5_0 = (Keyword)cGroup_5.eContents().get(0);
		private final Assignment cItemsAssignment_5_1 = (Assignment)cGroup_5.eContents().get(1);
		private final RuleCall cItemsDListItemParserRuleCall_5_1_0 = (RuleCall)cItemsAssignment_5_1.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_6 = (Keyword)cGroup.eContents().get(6);
		private final Keyword cRightCurlyBracketKeyword_7 = (Keyword)cGroup.eContents().get(7);
		
		//DEnumerate doc::DEnumerate:
		//	'DEnumerate'
		//	'{'
		//	'items' '{' items+=DListItem ("," items+=DListItem)* '}'
		//	'}'
		@Override public ParserRule getRule() { return rule; }
		
		//'DEnumerate' '{' 'items' '{' items+=DListItem ("," items+=DListItem)* '}' '}'
		public Group getGroup() { return cGroup; }
		
		//'DEnumerate'
		public Keyword getDEnumerateKeyword_0() { return cDEnumerateKeyword_0; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_1() { return cLeftCurlyBracketKeyword_1; }
		
		//'items'
		public Keyword getItemsKeyword_2() { return cItemsKeyword_2; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_3() { return cLeftCurlyBracketKeyword_3; }
		
		//items+=DListItem
		public Assignment getItemsAssignment_4() { return cItemsAssignment_4; }
		
		//DListItem
		public RuleCall getItemsDListItemParserRuleCall_4_0() { return cItemsDListItemParserRuleCall_4_0; }
		
		//("," items+=DListItem)*
		public Group getGroup_5() { return cGroup_5; }
		
		//","
		public Keyword getCommaKeyword_5_0() { return cCommaKeyword_5_0; }
		
		//items+=DListItem
		public Assignment getItemsAssignment_5_1() { return cItemsAssignment_5_1; }
		
		//DListItem
		public RuleCall getItemsDListItemParserRuleCall_5_1_0() { return cItemsDListItemParserRuleCall_5_1_0; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_6() { return cRightCurlyBracketKeyword_6; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_7() { return cRightCurlyBracketKeyword_7; }
	}
	public class DRowElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.micobs.svm.lang.sss.SSS.DRow");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cDRowKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Keyword cSpanKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cSpanAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cSpanEStringParserRuleCall_3_0 = (RuleCall)cSpanAssignment_3.eContents().get(0);
		private final Keyword cColumnsKeyword_4 = (Keyword)cGroup.eContents().get(4);
		private final Keyword cLeftCurlyBracketKeyword_5 = (Keyword)cGroup.eContents().get(5);
		private final Assignment cColumnsAssignment_6 = (Assignment)cGroup.eContents().get(6);
		private final RuleCall cColumnsDColumnParserRuleCall_6_0 = (RuleCall)cColumnsAssignment_6.eContents().get(0);
		private final Group cGroup_7 = (Group)cGroup.eContents().get(7);
		private final Keyword cCommaKeyword_7_0 = (Keyword)cGroup_7.eContents().get(0);
		private final Assignment cColumnsAssignment_7_1 = (Assignment)cGroup_7.eContents().get(1);
		private final RuleCall cColumnsDColumnParserRuleCall_7_1_0 = (RuleCall)cColumnsAssignment_7_1.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_8 = (Keyword)cGroup.eContents().get(8);
		private final Keyword cRightCurlyBracketKeyword_9 = (Keyword)cGroup.eContents().get(9);
		
		//DRow doc::DRow:
		//	'DRow'
		//	'{'
		//	'span' span=EString
		//	'columns' '{' columns+=DColumn ("," columns+=DColumn)* '}'
		//	'}'
		@Override public ParserRule getRule() { return rule; }
		
		//'DRow' '{' 'span' span=EString 'columns' '{' columns+=DColumn ("," columns+=DColumn)* '}' '}'
		public Group getGroup() { return cGroup; }
		
		//'DRow'
		public Keyword getDRowKeyword_0() { return cDRowKeyword_0; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_1() { return cLeftCurlyBracketKeyword_1; }
		
		//'span'
		public Keyword getSpanKeyword_2() { return cSpanKeyword_2; }
		
		//span=EString
		public Assignment getSpanAssignment_3() { return cSpanAssignment_3; }
		
		//EString
		public RuleCall getSpanEStringParserRuleCall_3_0() { return cSpanEStringParserRuleCall_3_0; }
		
		//'columns'
		public Keyword getColumnsKeyword_4() { return cColumnsKeyword_4; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_5() { return cLeftCurlyBracketKeyword_5; }
		
		//columns+=DColumn
		public Assignment getColumnsAssignment_6() { return cColumnsAssignment_6; }
		
		//DColumn
		public RuleCall getColumnsDColumnParserRuleCall_6_0() { return cColumnsDColumnParserRuleCall_6_0; }
		
		//("," columns+=DColumn)*
		public Group getGroup_7() { return cGroup_7; }
		
		//","
		public Keyword getCommaKeyword_7_0() { return cCommaKeyword_7_0; }
		
		//columns+=DColumn
		public Assignment getColumnsAssignment_7_1() { return cColumnsAssignment_7_1; }
		
		//DColumn
		public RuleCall getColumnsDColumnParserRuleCall_7_1_0() { return cColumnsDColumnParserRuleCall_7_1_0; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_8() { return cRightCurlyBracketKeyword_8; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_9() { return cRightCurlyBracketKeyword_9; }
	}
	public class DColumnElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.micobs.svm.lang.sss.SSS.DColumn");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cDColumnKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Keyword cSpanKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cSpanAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cSpanEStringParserRuleCall_3_0 = (RuleCall)cSpanAssignment_3.eContents().get(0);
		private final Keyword cCellsKeyword_4 = (Keyword)cGroup.eContents().get(4);
		private final Keyword cLeftCurlyBracketKeyword_5 = (Keyword)cGroup.eContents().get(5);
		private final Assignment cCellsAssignment_6 = (Assignment)cGroup.eContents().get(6);
		private final RuleCall cCellsDCellParserRuleCall_6_0 = (RuleCall)cCellsAssignment_6.eContents().get(0);
		private final Group cGroup_7 = (Group)cGroup.eContents().get(7);
		private final Keyword cCommaKeyword_7_0 = (Keyword)cGroup_7.eContents().get(0);
		private final Assignment cCellsAssignment_7_1 = (Assignment)cGroup_7.eContents().get(1);
		private final RuleCall cCellsDCellParserRuleCall_7_1_0 = (RuleCall)cCellsAssignment_7_1.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_8 = (Keyword)cGroup.eContents().get(8);
		private final Keyword cRightCurlyBracketKeyword_9 = (Keyword)cGroup.eContents().get(9);
		
		//DColumn doc::DColumn:
		//	'DColumn'
		//	'{'
		//	'span' span=EString
		//	'cells' '{' cells+=DCell ("," cells+=DCell)* '}'
		//	'}'
		@Override public ParserRule getRule() { return rule; }
		
		//'DColumn' '{' 'span' span=EString 'cells' '{' cells+=DCell ("," cells+=DCell)* '}' '}'
		public Group getGroup() { return cGroup; }
		
		//'DColumn'
		public Keyword getDColumnKeyword_0() { return cDColumnKeyword_0; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_1() { return cLeftCurlyBracketKeyword_1; }
		
		//'span'
		public Keyword getSpanKeyword_2() { return cSpanKeyword_2; }
		
		//span=EString
		public Assignment getSpanAssignment_3() { return cSpanAssignment_3; }
		
		//EString
		public RuleCall getSpanEStringParserRuleCall_3_0() { return cSpanEStringParserRuleCall_3_0; }
		
		//'cells'
		public Keyword getCellsKeyword_4() { return cCellsKeyword_4; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_5() { return cLeftCurlyBracketKeyword_5; }
		
		//cells+=DCell
		public Assignment getCellsAssignment_6() { return cCellsAssignment_6; }
		
		//DCell
		public RuleCall getCellsDCellParserRuleCall_6_0() { return cCellsDCellParserRuleCall_6_0; }
		
		//("," cells+=DCell)*
		public Group getGroup_7() { return cGroup_7; }
		
		//","
		public Keyword getCommaKeyword_7_0() { return cCommaKeyword_7_0; }
		
		//cells+=DCell
		public Assignment getCellsAssignment_7_1() { return cCellsAssignment_7_1; }
		
		//DCell
		public RuleCall getCellsDCellParserRuleCall_7_1_0() { return cCellsDCellParserRuleCall_7_1_0; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_8() { return cRightCurlyBracketKeyword_8; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_9() { return cRightCurlyBracketKeyword_9; }
	}
	public class DRunElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.micobs.svm.lang.sss.SSS.DRun");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cDRunKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Keyword cBoldKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cBoldAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cBoldDRunFormatEnableDisableEnumRuleCall_3_0 = (RuleCall)cBoldAssignment_3.eContents().get(0);
		private final Keyword cItalicKeyword_4 = (Keyword)cGroup.eContents().get(4);
		private final Assignment cItalicAssignment_5 = (Assignment)cGroup.eContents().get(5);
		private final RuleCall cItalicDRunFormatEnableDisableEnumRuleCall_5_0 = (RuleCall)cItalicAssignment_5.eContents().get(0);
		private final Keyword cUnderscoreKeyword_6 = (Keyword)cGroup.eContents().get(6);
		private final Assignment cUnderscoreAssignment_7 = (Assignment)cGroup.eContents().get(7);
		private final RuleCall cUnderscoreDRunFormatEnableDisableEnumRuleCall_7_0 = (RuleCall)cUnderscoreAssignment_7.eContents().get(0);
		private final Keyword cTextKeyword_8 = (Keyword)cGroup.eContents().get(8);
		private final Assignment cTextAssignment_9 = (Assignment)cGroup.eContents().get(9);
		private final RuleCall cTextDTextParserRuleCall_9_0 = (RuleCall)cTextAssignment_9.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_10 = (Keyword)cGroup.eContents().get(10);
		
		//DRun doc::DRun:
		//	'DRun'
		//	'{'
		//	'bold' bold=DRunFormatEnableDisable
		//	'italic' italic=DRunFormatEnableDisable
		//	'underscore' underscore=DRunFormatEnableDisable
		//	'text' text=DText
		//	'}'
		@Override public ParserRule getRule() { return rule; }
		
		//'DRun' '{' 'bold' bold=DRunFormatEnableDisable 'italic' italic=DRunFormatEnableDisable 'underscore'
		//underscore=DRunFormatEnableDisable 'text' text=DText '}'
		public Group getGroup() { return cGroup; }
		
		//'DRun'
		public Keyword getDRunKeyword_0() { return cDRunKeyword_0; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_1() { return cLeftCurlyBracketKeyword_1; }
		
		//'bold'
		public Keyword getBoldKeyword_2() { return cBoldKeyword_2; }
		
		//bold=DRunFormatEnableDisable
		public Assignment getBoldAssignment_3() { return cBoldAssignment_3; }
		
		//DRunFormatEnableDisable
		public RuleCall getBoldDRunFormatEnableDisableEnumRuleCall_3_0() { return cBoldDRunFormatEnableDisableEnumRuleCall_3_0; }
		
		//'italic'
		public Keyword getItalicKeyword_4() { return cItalicKeyword_4; }
		
		//italic=DRunFormatEnableDisable
		public Assignment getItalicAssignment_5() { return cItalicAssignment_5; }
		
		//DRunFormatEnableDisable
		public RuleCall getItalicDRunFormatEnableDisableEnumRuleCall_5_0() { return cItalicDRunFormatEnableDisableEnumRuleCall_5_0; }
		
		//'underscore'
		public Keyword getUnderscoreKeyword_6() { return cUnderscoreKeyword_6; }
		
		//underscore=DRunFormatEnableDisable
		public Assignment getUnderscoreAssignment_7() { return cUnderscoreAssignment_7; }
		
		//DRunFormatEnableDisable
		public RuleCall getUnderscoreDRunFormatEnableDisableEnumRuleCall_7_0() { return cUnderscoreDRunFormatEnableDisableEnumRuleCall_7_0; }
		
		//'text'
		public Keyword getTextKeyword_8() { return cTextKeyword_8; }
		
		//text=DText
		public Assignment getTextAssignment_9() { return cTextAssignment_9; }
		
		//DText
		public RuleCall getTextDTextParserRuleCall_9_0() { return cTextDTextParserRuleCall_9_0; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_10() { return cRightCurlyBracketKeyword_10; }
	}
	public class DHyperlinkElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.micobs.svm.lang.sss.SSS.DHyperlink");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cDHyperlinkKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Keyword cReferenceKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cReferenceAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final CrossReference cReferenceDReferenceableObjectCrossReference_3_0 = (CrossReference)cReferenceAssignment_3.eContents().get(0);
		private final RuleCall cReferenceDReferenceableObjectEStringParserRuleCall_3_0_1 = (RuleCall)cReferenceDReferenceableObjectCrossReference_3_0.eContents().get(1);
		private final Keyword cRunKeyword_4 = (Keyword)cGroup.eContents().get(4);
		private final Assignment cRunAssignment_5 = (Assignment)cGroup.eContents().get(5);
		private final RuleCall cRunDRunParserRuleCall_5_0 = (RuleCall)cRunAssignment_5.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_6 = (Keyword)cGroup.eContents().get(6);
		
		//DHyperlink doc::DHyperlink:
		//	'DHyperlink'
		//	'{'
		//	'reference' reference=[doc::DReferenceableObject|EString]
		//	'run' run=DRun
		//	'}'
		@Override public ParserRule getRule() { return rule; }
		
		//'DHyperlink' '{' 'reference' reference=[doc::DReferenceableObject|EString] 'run' run=DRun '}'
		public Group getGroup() { return cGroup; }
		
		//'DHyperlink'
		public Keyword getDHyperlinkKeyword_0() { return cDHyperlinkKeyword_0; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_1() { return cLeftCurlyBracketKeyword_1; }
		
		//'reference'
		public Keyword getReferenceKeyword_2() { return cReferenceKeyword_2; }
		
		//reference=[doc::DReferenceableObject|EString]
		public Assignment getReferenceAssignment_3() { return cReferenceAssignment_3; }
		
		//[doc::DReferenceableObject|EString]
		public CrossReference getReferenceDReferenceableObjectCrossReference_3_0() { return cReferenceDReferenceableObjectCrossReference_3_0; }
		
		//EString
		public RuleCall getReferenceDReferenceableObjectEStringParserRuleCall_3_0_1() { return cReferenceDReferenceableObjectEStringParserRuleCall_3_0_1; }
		
		//'run'
		public Keyword getRunKeyword_4() { return cRunKeyword_4; }
		
		//run=DRun
		public Assignment getRunAssignment_5() { return cRunAssignment_5; }
		
		//DRun
		public RuleCall getRunDRunParserRuleCall_5_0() { return cRunDRunParserRuleCall_5_0; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_6() { return cRightCurlyBracketKeyword_6; }
	}
	public class DTextElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.micobs.svm.lang.sss.SSS.DText");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cDTextKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Keyword cContentKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cContentAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cContentEStringParserRuleCall_3_0 = (RuleCall)cContentAssignment_3.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_4 = (Keyword)cGroup.eContents().get(4);
		
		//DText doc::DText:
		//	'DText'
		//	'{'
		//	'content' content=EString
		//	'}'
		@Override public ParserRule getRule() { return rule; }
		
		//'DText' '{' 'content' content=EString '}'
		public Group getGroup() { return cGroup; }
		
		//'DText'
		public Keyword getDTextKeyword_0() { return cDTextKeyword_0; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_1() { return cLeftCurlyBracketKeyword_1; }
		
		//'content'
		public Keyword getContentKeyword_2() { return cContentKeyword_2; }
		
		//content=EString
		public Assignment getContentAssignment_3() { return cContentAssignment_3; }
		
		//EString
		public RuleCall getContentEStringParserRuleCall_3_0() { return cContentEStringParserRuleCall_3_0; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_4() { return cRightCurlyBracketKeyword_4; }
	}
	public class DReferenceableObject_ImplElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.micobs.svm.lang.sss.SSS.DReferenceableObject_Impl");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cDReferenceableObjectAction_0 = (Action)cGroup.eContents().get(0);
		private final Keyword cDReferenceableObjectKeyword_1 = (Keyword)cGroup.eContents().get(1);
		
		//DReferenceableObject_Impl doc::DReferenceableObject:
		//	{doc::DReferenceableObject}
		//	'DReferenceableObject'
		@Override public ParserRule getRule() { return rule; }
		
		//{doc::DReferenceableObject} 'DReferenceableObject'
		public Group getGroup() { return cGroup; }
		
		//{doc::DReferenceableObject}
		public Action getDReferenceableObjectAction_0() { return cDReferenceableObjectAction_0; }
		
		//'DReferenceableObject'
		public Keyword getDReferenceableObjectKeyword_1() { return cDReferenceableObjectKeyword_1; }
	}
	public class DApplicableDocumentElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.micobs.svm.lang.sss.SSS.DApplicableDocument");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cDApplicableDocumentKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Keyword cTitleKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cTitleAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cTitleEStringParserRuleCall_3_0 = (RuleCall)cTitleAssignment_3.eContents().get(0);
		private final Keyword cIssueKeyword_4 = (Keyword)cGroup.eContents().get(4);
		private final Assignment cIssueAssignment_5 = (Assignment)cGroup.eContents().get(5);
		private final RuleCall cIssueEStringParserRuleCall_5_0 = (RuleCall)cIssueAssignment_5.eContents().get(0);
		private final Keyword cRevisionKeyword_6 = (Keyword)cGroup.eContents().get(6);
		private final Assignment cRevisionAssignment_7 = (Assignment)cGroup.eContents().get(7);
		private final RuleCall cRevisionEStringParserRuleCall_7_0 = (RuleCall)cRevisionAssignment_7.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_8 = (Keyword)cGroup.eContents().get(8);
		
		//DApplicableDocument doc::DApplicableDocument:
		//	'DApplicableDocument'
		//	'{'
		//	'title' title=EString
		//	'issue' issue=EString
		//	'revision' revision=EString
		//	'}'
		@Override public ParserRule getRule() { return rule; }
		
		//'DApplicableDocument' '{' 'title' title=EString 'issue' issue=EString 'revision' revision=EString '}'
		public Group getGroup() { return cGroup; }
		
		//'DApplicableDocument'
		public Keyword getDApplicableDocumentKeyword_0() { return cDApplicableDocumentKeyword_0; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_1() { return cLeftCurlyBracketKeyword_1; }
		
		//'title'
		public Keyword getTitleKeyword_2() { return cTitleKeyword_2; }
		
		//title=EString
		public Assignment getTitleAssignment_3() { return cTitleAssignment_3; }
		
		//EString
		public RuleCall getTitleEStringParserRuleCall_3_0() { return cTitleEStringParserRuleCall_3_0; }
		
		//'issue'
		public Keyword getIssueKeyword_4() { return cIssueKeyword_4; }
		
		//issue=EString
		public Assignment getIssueAssignment_5() { return cIssueAssignment_5; }
		
		//EString
		public RuleCall getIssueEStringParserRuleCall_5_0() { return cIssueEStringParserRuleCall_5_0; }
		
		//'revision'
		public Keyword getRevisionKeyword_6() { return cRevisionKeyword_6; }
		
		//revision=EString
		public Assignment getRevisionAssignment_7() { return cRevisionAssignment_7; }
		
		//EString
		public RuleCall getRevisionEStringParserRuleCall_7_0() { return cRevisionEStringParserRuleCall_7_0; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_8() { return cRightCurlyBracketKeyword_8; }
	}
	public class DReferenceDocumentElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.micobs.svm.lang.sss.SSS.DReferenceDocument");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cDReferenceDocumentKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Keyword cTitleKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cTitleAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cTitleEStringParserRuleCall_3_0 = (RuleCall)cTitleAssignment_3.eContents().get(0);
		private final Keyword cIssueKeyword_4 = (Keyword)cGroup.eContents().get(4);
		private final Assignment cIssueAssignment_5 = (Assignment)cGroup.eContents().get(5);
		private final RuleCall cIssueEStringParserRuleCall_5_0 = (RuleCall)cIssueAssignment_5.eContents().get(0);
		private final Keyword cRevisionKeyword_6 = (Keyword)cGroup.eContents().get(6);
		private final Assignment cRevisionAssignment_7 = (Assignment)cGroup.eContents().get(7);
		private final RuleCall cRevisionEStringParserRuleCall_7_0 = (RuleCall)cRevisionAssignment_7.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_8 = (Keyword)cGroup.eContents().get(8);
		
		//DReferenceDocument doc::DReferenceDocument:
		//	'DReferenceDocument'
		//	'{'
		//	'title' title=EString
		//	'issue' issue=EString
		//	'revision' revision=EString
		//	'}'
		@Override public ParserRule getRule() { return rule; }
		
		//'DReferenceDocument' '{' 'title' title=EString 'issue' issue=EString 'revision' revision=EString '}'
		public Group getGroup() { return cGroup; }
		
		//'DReferenceDocument'
		public Keyword getDReferenceDocumentKeyword_0() { return cDReferenceDocumentKeyword_0; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_1() { return cLeftCurlyBracketKeyword_1; }
		
		//'title'
		public Keyword getTitleKeyword_2() { return cTitleKeyword_2; }
		
		//title=EString
		public Assignment getTitleAssignment_3() { return cTitleAssignment_3; }
		
		//EString
		public RuleCall getTitleEStringParserRuleCall_3_0() { return cTitleEStringParserRuleCall_3_0; }
		
		//'issue'
		public Keyword getIssueKeyword_4() { return cIssueKeyword_4; }
		
		//issue=EString
		public Assignment getIssueAssignment_5() { return cIssueAssignment_5; }
		
		//EString
		public RuleCall getIssueEStringParserRuleCall_5_0() { return cIssueEStringParserRuleCall_5_0; }
		
		//'revision'
		public Keyword getRevisionKeyword_6() { return cRevisionKeyword_6; }
		
		//revision=EString
		public Assignment getRevisionAssignment_7() { return cRevisionAssignment_7; }
		
		//EString
		public RuleCall getRevisionEStringParserRuleCall_7_0() { return cRevisionEStringParserRuleCall_7_0; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_8() { return cRightCurlyBracketKeyword_8; }
	}
	public class DListItemElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.micobs.svm.lang.sss.SSS.DListItem");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cDListItemKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Keyword cParagraphKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Keyword cLeftCurlyBracketKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Assignment cParagraphAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cParagraphDParagraphParserRuleCall_4_0 = (RuleCall)cParagraphAssignment_4.eContents().get(0);
		private final Group cGroup_5 = (Group)cGroup.eContents().get(5);
		private final Keyword cCommaKeyword_5_0 = (Keyword)cGroup_5.eContents().get(0);
		private final Assignment cParagraphAssignment_5_1 = (Assignment)cGroup_5.eContents().get(1);
		private final RuleCall cParagraphDParagraphParserRuleCall_5_1_0 = (RuleCall)cParagraphAssignment_5_1.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_6 = (Keyword)cGroup.eContents().get(6);
		private final Group cGroup_7 = (Group)cGroup.eContents().get(7);
		private final Keyword cSublistKeyword_7_0 = (Keyword)cGroup_7.eContents().get(0);
		private final Assignment cSublistAssignment_7_1 = (Assignment)cGroup_7.eContents().get(1);
		private final RuleCall cSublistDListContentParserRuleCall_7_1_0 = (RuleCall)cSublistAssignment_7_1.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_8 = (Keyword)cGroup.eContents().get(8);
		
		//DListItem doc::DListItem:
		//	'DListItem'
		//	'{'
		//	'paragraph' '{' paragraph+=DParagraph ("," paragraph+=DParagraph)* '}' ('sublist' sublist=DListContent)?
		//	'}'
		@Override public ParserRule getRule() { return rule; }
		
		//'DListItem' '{' 'paragraph' '{' paragraph+=DParagraph ("," paragraph+=DParagraph)* '}' ('sublist' sublist=DListContent)?
		//'}'
		public Group getGroup() { return cGroup; }
		
		//'DListItem'
		public Keyword getDListItemKeyword_0() { return cDListItemKeyword_0; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_1() { return cLeftCurlyBracketKeyword_1; }
		
		//'paragraph'
		public Keyword getParagraphKeyword_2() { return cParagraphKeyword_2; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_3() { return cLeftCurlyBracketKeyword_3; }
		
		//paragraph+=DParagraph
		public Assignment getParagraphAssignment_4() { return cParagraphAssignment_4; }
		
		//DParagraph
		public RuleCall getParagraphDParagraphParserRuleCall_4_0() { return cParagraphDParagraphParserRuleCall_4_0; }
		
		//("," paragraph+=DParagraph)*
		public Group getGroup_5() { return cGroup_5; }
		
		//","
		public Keyword getCommaKeyword_5_0() { return cCommaKeyword_5_0; }
		
		//paragraph+=DParagraph
		public Assignment getParagraphAssignment_5_1() { return cParagraphAssignment_5_1; }
		
		//DParagraph
		public RuleCall getParagraphDParagraphParserRuleCall_5_1_0() { return cParagraphDParagraphParserRuleCall_5_1_0; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_6() { return cRightCurlyBracketKeyword_6; }
		
		//('sublist' sublist=DListContent)?
		public Group getGroup_7() { return cGroup_7; }
		
		//'sublist'
		public Keyword getSublistKeyword_7_0() { return cSublistKeyword_7_0; }
		
		//sublist=DListContent
		public Assignment getSublistAssignment_7_1() { return cSublistAssignment_7_1; }
		
		//DListContent
		public RuleCall getSublistDListContentParserRuleCall_7_1_0() { return cSublistDListContentParserRuleCall_7_1_0; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_8() { return cRightCurlyBracketKeyword_8; }
	}
	public class VSSSTermElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.micobs.svm.lang.sss.SSS.VSSSTerm");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cVSSSTermKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameEStringParserRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Keyword cDescriptionKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Assignment cDescriptionAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final CrossReference cDescriptionDParagraphCrossReference_4_0 = (CrossReference)cDescriptionAssignment_4.eContents().get(0);
		private final RuleCall cDescriptionDParagraphEStringParserRuleCall_4_0_1 = (RuleCall)cDescriptionDParagraphCrossReference_4_0.eContents().get(1);
		private final Keyword cRightCurlyBracketKeyword_5 = (Keyword)cGroup.eContents().get(5);
		
		//VSSSTerm:
		//	'VSSSTerm'
		//	name=EString
		//	'{'
		//	'description' description=[doc::DParagraph|EString]
		//	'}';
		@Override public ParserRule getRule() { return rule; }
		
		//'VSSSTerm' name=EString '{' 'description' description=[doc::DParagraph|EString] '}'
		public Group getGroup() { return cGroup; }
		
		//'VSSSTerm'
		public Keyword getVSSSTermKeyword_0() { return cVSSSTermKeyword_0; }
		
		//name=EString
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }
		
		//EString
		public RuleCall getNameEStringParserRuleCall_1_0() { return cNameEStringParserRuleCall_1_0; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_2() { return cLeftCurlyBracketKeyword_2; }
		
		//'description'
		public Keyword getDescriptionKeyword_3() { return cDescriptionKeyword_3; }
		
		//description=[doc::DParagraph|EString]
		public Assignment getDescriptionAssignment_4() { return cDescriptionAssignment_4; }
		
		//[doc::DParagraph|EString]
		public CrossReference getDescriptionDParagraphCrossReference_4_0() { return cDescriptionDParagraphCrossReference_4_0; }
		
		//EString
		public RuleCall getDescriptionDParagraphEStringParserRuleCall_4_0_1() { return cDescriptionDParagraphEStringParserRuleCall_4_0_1; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_5() { return cRightCurlyBracketKeyword_5; }
	}
	public class VSSSDefinitionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.micobs.svm.lang.sss.SSS.VSSSDefinition");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cVSSSDefinitionKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameEStringParserRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Keyword cDescriptionKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Assignment cDescriptionAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final CrossReference cDescriptionDParagraphCrossReference_4_0 = (CrossReference)cDescriptionAssignment_4.eContents().get(0);
		private final RuleCall cDescriptionDParagraphEStringParserRuleCall_4_0_1 = (RuleCall)cDescriptionDParagraphCrossReference_4_0.eContents().get(1);
		private final Keyword cRightCurlyBracketKeyword_5 = (Keyword)cGroup.eContents().get(5);
		
		//VSSSDefinition:
		//	'VSSSDefinition'
		//	name=EString
		//	'{'
		//	'description' description=[doc::DParagraph|EString]
		//	'}';
		@Override public ParserRule getRule() { return rule; }
		
		//'VSSSDefinition' name=EString '{' 'description' description=[doc::DParagraph|EString] '}'
		public Group getGroup() { return cGroup; }
		
		//'VSSSDefinition'
		public Keyword getVSSSDefinitionKeyword_0() { return cVSSSDefinitionKeyword_0; }
		
		//name=EString
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }
		
		//EString
		public RuleCall getNameEStringParserRuleCall_1_0() { return cNameEStringParserRuleCall_1_0; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_2() { return cLeftCurlyBracketKeyword_2; }
		
		//'description'
		public Keyword getDescriptionKeyword_3() { return cDescriptionKeyword_3; }
		
		//description=[doc::DParagraph|EString]
		public Assignment getDescriptionAssignment_4() { return cDescriptionAssignment_4; }
		
		//[doc::DParagraph|EString]
		public CrossReference getDescriptionDParagraphCrossReference_4_0() { return cDescriptionDParagraphCrossReference_4_0; }
		
		//EString
		public RuleCall getDescriptionDParagraphEStringParserRuleCall_4_0_1() { return cDescriptionDParagraphEStringParserRuleCall_4_0_1; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_5() { return cRightCurlyBracketKeyword_5; }
	}
	public class VSSSAbbreviationElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.micobs.svm.lang.sss.SSS.VSSSAbbreviation");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cVSSSAbbreviationKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameEStringParserRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Keyword cDescriptionKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Assignment cDescriptionAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final CrossReference cDescriptionDParagraphCrossReference_4_0 = (CrossReference)cDescriptionAssignment_4.eContents().get(0);
		private final RuleCall cDescriptionDParagraphEStringParserRuleCall_4_0_1 = (RuleCall)cDescriptionDParagraphCrossReference_4_0.eContents().get(1);
		private final Keyword cRightCurlyBracketKeyword_5 = (Keyword)cGroup.eContents().get(5);
		
		//VSSSAbbreviation:
		//	'VSSSAbbreviation'
		//	name=EString
		//	'{'
		//	'description' description=[doc::DParagraph|EString]
		//	'}';
		@Override public ParserRule getRule() { return rule; }
		
		//'VSSSAbbreviation' name=EString '{' 'description' description=[doc::DParagraph|EString] '}'
		public Group getGroup() { return cGroup; }
		
		//'VSSSAbbreviation'
		public Keyword getVSSSAbbreviationKeyword_0() { return cVSSSAbbreviationKeyword_0; }
		
		//name=EString
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }
		
		//EString
		public RuleCall getNameEStringParserRuleCall_1_0() { return cNameEStringParserRuleCall_1_0; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_2() { return cLeftCurlyBracketKeyword_2; }
		
		//'description'
		public Keyword getDescriptionKeyword_3() { return cDescriptionKeyword_3; }
		
		//description=[doc::DParagraph|EString]
		public Assignment getDescriptionAssignment_4() { return cDescriptionAssignment_4; }
		
		//[doc::DParagraph|EString]
		public CrossReference getDescriptionDParagraphCrossReference_4_0() { return cDescriptionDParagraphCrossReference_4_0; }
		
		//EString
		public RuleCall getDescriptionDParagraphEStringParserRuleCall_4_0_1() { return cDescriptionDParagraphEStringParserRuleCall_4_0_1; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_5() { return cRightCurlyBracketKeyword_5; }
	}
	public class VSSSGeneralDescriptionSubsectionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.micobs.svm.lang.sss.SSS.VSSSGeneralDescriptionSubsection");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cVSSSGeneralDescriptionSubsectionKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Keyword cBodyKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cBodyAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final CrossReference cBodyDBodyCrossReference_3_0 = (CrossReference)cBodyAssignment_3.eContents().get(0);
		private final RuleCall cBodyDBodyEStringParserRuleCall_3_0_1 = (RuleCall)cBodyDBodyCrossReference_3_0.eContents().get(1);
		private final Keyword cRightCurlyBracketKeyword_4 = (Keyword)cGroup.eContents().get(4);
		
		//VSSSGeneralDescriptionSubsection:
		//	'VSSSGeneralDescriptionSubsection'
		//	'{'
		//	'body' body=[doc::DBody|EString]
		//	'}';
		@Override public ParserRule getRule() { return rule; }
		
		//'VSSSGeneralDescriptionSubsection' '{' 'body' body=[doc::DBody|EString] '}'
		public Group getGroup() { return cGroup; }
		
		//'VSSSGeneralDescriptionSubsection'
		public Keyword getVSSSGeneralDescriptionSubsectionKeyword_0() { return cVSSSGeneralDescriptionSubsectionKeyword_0; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_1() { return cLeftCurlyBracketKeyword_1; }
		
		//'body'
		public Keyword getBodyKeyword_2() { return cBodyKeyword_2; }
		
		//body=[doc::DBody|EString]
		public Assignment getBodyAssignment_3() { return cBodyAssignment_3; }
		
		//[doc::DBody|EString]
		public CrossReference getBodyDBodyCrossReference_3_0() { return cBodyDBodyCrossReference_3_0; }
		
		//EString
		public RuleCall getBodyDBodyEStringParserRuleCall_3_0_1() { return cBodyDBodyEStringParserRuleCall_3_0_1; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_4() { return cRightCurlyBracketKeyword_4; }
	}
	public class VSSSGeneralRequirementElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.micobs.svm.lang.sss.SSS.VSSSGeneralRequirement");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cVSSSGeneralRequirementKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Keyword cSssItemsKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Keyword cLeftCurlyBracketKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Assignment cSssItemsAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cSssItemsVSSSDocumentItemParserRuleCall_4_0 = (RuleCall)cSssItemsAssignment_4.eContents().get(0);
		private final Group cGroup_5 = (Group)cGroup.eContents().get(5);
		private final Keyword cCommaKeyword_5_0 = (Keyword)cGroup_5.eContents().get(0);
		private final Assignment cSssItemsAssignment_5_1 = (Assignment)cGroup_5.eContents().get(1);
		private final RuleCall cSssItemsVSSSDocumentItemParserRuleCall_5_1_0 = (RuleCall)cSssItemsAssignment_5_1.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_6 = (Keyword)cGroup.eContents().get(6);
		private final Keyword cRightCurlyBracketKeyword_7 = (Keyword)cGroup.eContents().get(7);
		
		//VSSSGeneralRequirement:
		//	'VSSSGeneralRequirement'
		//	'{'
		//	'sssItems' '{' sssItems+=VSSSDocumentItem ("," sssItems+=VSSSDocumentItem)* '}'
		//	'}';
		@Override public ParserRule getRule() { return rule; }
		
		//'VSSSGeneralRequirement' '{' 'sssItems' '{' sssItems+=VSSSDocumentItem ("," sssItems+=VSSSDocumentItem)* '}' '}'
		public Group getGroup() { return cGroup; }
		
		//'VSSSGeneralRequirement'
		public Keyword getVSSSGeneralRequirementKeyword_0() { return cVSSSGeneralRequirementKeyword_0; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_1() { return cLeftCurlyBracketKeyword_1; }
		
		//'sssItems'
		public Keyword getSssItemsKeyword_2() { return cSssItemsKeyword_2; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_3() { return cLeftCurlyBracketKeyword_3; }
		
		//sssItems+=VSSSDocumentItem
		public Assignment getSssItemsAssignment_4() { return cSssItemsAssignment_4; }
		
		//VSSSDocumentItem
		public RuleCall getSssItemsVSSSDocumentItemParserRuleCall_4_0() { return cSssItemsVSSSDocumentItemParserRuleCall_4_0; }
		
		//("," sssItems+=VSSSDocumentItem)*
		public Group getGroup_5() { return cGroup_5; }
		
		//","
		public Keyword getCommaKeyword_5_0() { return cCommaKeyword_5_0; }
		
		//sssItems+=VSSSDocumentItem
		public Assignment getSssItemsAssignment_5_1() { return cSssItemsAssignment_5_1; }
		
		//VSSSDocumentItem
		public RuleCall getSssItemsVSSSDocumentItemParserRuleCall_5_1_0() { return cSssItemsVSSSDocumentItemParserRuleCall_5_1_0; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_6() { return cRightCurlyBracketKeyword_6; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_7() { return cRightCurlyBracketKeyword_7; }
	}
	public class VSSSCapabilitiesRequirementElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.micobs.svm.lang.sss.SSS.VSSSCapabilitiesRequirement");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cVSSSCapabilitiesRequirementKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Keyword cSssItemsKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Keyword cLeftCurlyBracketKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Assignment cSssItemsAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cSssItemsVSSSDocumentItemParserRuleCall_4_0 = (RuleCall)cSssItemsAssignment_4.eContents().get(0);
		private final Group cGroup_5 = (Group)cGroup.eContents().get(5);
		private final Keyword cCommaKeyword_5_0 = (Keyword)cGroup_5.eContents().get(0);
		private final Assignment cSssItemsAssignment_5_1 = (Assignment)cGroup_5.eContents().get(1);
		private final RuleCall cSssItemsVSSSDocumentItemParserRuleCall_5_1_0 = (RuleCall)cSssItemsAssignment_5_1.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_6 = (Keyword)cGroup.eContents().get(6);
		private final Keyword cRightCurlyBracketKeyword_7 = (Keyword)cGroup.eContents().get(7);
		
		//VSSSCapabilitiesRequirement:
		//	'VSSSCapabilitiesRequirement'
		//	'{'
		//	'sssItems' '{' sssItems+=VSSSDocumentItem ("," sssItems+=VSSSDocumentItem)* '}'
		//	'}';
		@Override public ParserRule getRule() { return rule; }
		
		//'VSSSCapabilitiesRequirement' '{' 'sssItems' '{' sssItems+=VSSSDocumentItem ("," sssItems+=VSSSDocumentItem)* '}' '}'
		public Group getGroup() { return cGroup; }
		
		//'VSSSCapabilitiesRequirement'
		public Keyword getVSSSCapabilitiesRequirementKeyword_0() { return cVSSSCapabilitiesRequirementKeyword_0; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_1() { return cLeftCurlyBracketKeyword_1; }
		
		//'sssItems'
		public Keyword getSssItemsKeyword_2() { return cSssItemsKeyword_2; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_3() { return cLeftCurlyBracketKeyword_3; }
		
		//sssItems+=VSSSDocumentItem
		public Assignment getSssItemsAssignment_4() { return cSssItemsAssignment_4; }
		
		//VSSSDocumentItem
		public RuleCall getSssItemsVSSSDocumentItemParserRuleCall_4_0() { return cSssItemsVSSSDocumentItemParserRuleCall_4_0; }
		
		//("," sssItems+=VSSSDocumentItem)*
		public Group getGroup_5() { return cGroup_5; }
		
		//","
		public Keyword getCommaKeyword_5_0() { return cCommaKeyword_5_0; }
		
		//sssItems+=VSSSDocumentItem
		public Assignment getSssItemsAssignment_5_1() { return cSssItemsAssignment_5_1; }
		
		//VSSSDocumentItem
		public RuleCall getSssItemsVSSSDocumentItemParserRuleCall_5_1_0() { return cSssItemsVSSSDocumentItemParserRuleCall_5_1_0; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_6() { return cRightCurlyBracketKeyword_6; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_7() { return cRightCurlyBracketKeyword_7; }
	}
	public class VSSSSystemInterfaceRequirementElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.micobs.svm.lang.sss.SSS.VSSSSystemInterfaceRequirement");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cVSSSSystemInterfaceRequirementKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Keyword cSssItemsKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Keyword cLeftCurlyBracketKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Assignment cSssItemsAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cSssItemsVSSSDocumentItemParserRuleCall_4_0 = (RuleCall)cSssItemsAssignment_4.eContents().get(0);
		private final Group cGroup_5 = (Group)cGroup.eContents().get(5);
		private final Keyword cCommaKeyword_5_0 = (Keyword)cGroup_5.eContents().get(0);
		private final Assignment cSssItemsAssignment_5_1 = (Assignment)cGroup_5.eContents().get(1);
		private final RuleCall cSssItemsVSSSDocumentItemParserRuleCall_5_1_0 = (RuleCall)cSssItemsAssignment_5_1.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_6 = (Keyword)cGroup.eContents().get(6);
		private final Keyword cRightCurlyBracketKeyword_7 = (Keyword)cGroup.eContents().get(7);
		
		//VSSSSystemInterfaceRequirement:
		//	'VSSSSystemInterfaceRequirement'
		//	'{'
		//	'sssItems' '{' sssItems+=VSSSDocumentItem ("," sssItems+=VSSSDocumentItem)* '}'
		//	'}';
		@Override public ParserRule getRule() { return rule; }
		
		//'VSSSSystemInterfaceRequirement' '{' 'sssItems' '{' sssItems+=VSSSDocumentItem ("," sssItems+=VSSSDocumentItem)* '}' '}'
		public Group getGroup() { return cGroup; }
		
		//'VSSSSystemInterfaceRequirement'
		public Keyword getVSSSSystemInterfaceRequirementKeyword_0() { return cVSSSSystemInterfaceRequirementKeyword_0; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_1() { return cLeftCurlyBracketKeyword_1; }
		
		//'sssItems'
		public Keyword getSssItemsKeyword_2() { return cSssItemsKeyword_2; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_3() { return cLeftCurlyBracketKeyword_3; }
		
		//sssItems+=VSSSDocumentItem
		public Assignment getSssItemsAssignment_4() { return cSssItemsAssignment_4; }
		
		//VSSSDocumentItem
		public RuleCall getSssItemsVSSSDocumentItemParserRuleCall_4_0() { return cSssItemsVSSSDocumentItemParserRuleCall_4_0; }
		
		//("," sssItems+=VSSSDocumentItem)*
		public Group getGroup_5() { return cGroup_5; }
		
		//","
		public Keyword getCommaKeyword_5_0() { return cCommaKeyword_5_0; }
		
		//sssItems+=VSSSDocumentItem
		public Assignment getSssItemsAssignment_5_1() { return cSssItemsAssignment_5_1; }
		
		//VSSSDocumentItem
		public RuleCall getSssItemsVSSSDocumentItemParserRuleCall_5_1_0() { return cSssItemsVSSSDocumentItemParserRuleCall_5_1_0; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_6() { return cRightCurlyBracketKeyword_6; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_7() { return cRightCurlyBracketKeyword_7; }
	}
	public class VSSSAdaptationMissionizationRequirementElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.micobs.svm.lang.sss.SSS.VSSSAdaptationMissionizationRequirement");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cVSSSAdaptationMissionizationRequirementKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Keyword cSssItemsKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Keyword cLeftCurlyBracketKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Assignment cSssItemsAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cSssItemsVSSSDocumentItemParserRuleCall_4_0 = (RuleCall)cSssItemsAssignment_4.eContents().get(0);
		private final Group cGroup_5 = (Group)cGroup.eContents().get(5);
		private final Keyword cCommaKeyword_5_0 = (Keyword)cGroup_5.eContents().get(0);
		private final Assignment cSssItemsAssignment_5_1 = (Assignment)cGroup_5.eContents().get(1);
		private final RuleCall cSssItemsVSSSDocumentItemParserRuleCall_5_1_0 = (RuleCall)cSssItemsAssignment_5_1.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_6 = (Keyword)cGroup.eContents().get(6);
		private final Keyword cRightCurlyBracketKeyword_7 = (Keyword)cGroup.eContents().get(7);
		
		//VSSSAdaptationMissionizationRequirement:
		//	'VSSSAdaptationMissionizationRequirement'
		//	'{'
		//	'sssItems' '{' sssItems+=VSSSDocumentItem ("," sssItems+=VSSSDocumentItem)* '}'
		//	'}';
		@Override public ParserRule getRule() { return rule; }
		
		//'VSSSAdaptationMissionizationRequirement' '{' 'sssItems' '{' sssItems+=VSSSDocumentItem (","
		//sssItems+=VSSSDocumentItem)* '}' '}'
		public Group getGroup() { return cGroup; }
		
		//'VSSSAdaptationMissionizationRequirement'
		public Keyword getVSSSAdaptationMissionizationRequirementKeyword_0() { return cVSSSAdaptationMissionizationRequirementKeyword_0; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_1() { return cLeftCurlyBracketKeyword_1; }
		
		//'sssItems'
		public Keyword getSssItemsKeyword_2() { return cSssItemsKeyword_2; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_3() { return cLeftCurlyBracketKeyword_3; }
		
		//sssItems+=VSSSDocumentItem
		public Assignment getSssItemsAssignment_4() { return cSssItemsAssignment_4; }
		
		//VSSSDocumentItem
		public RuleCall getSssItemsVSSSDocumentItemParserRuleCall_4_0() { return cSssItemsVSSSDocumentItemParserRuleCall_4_0; }
		
		//("," sssItems+=VSSSDocumentItem)*
		public Group getGroup_5() { return cGroup_5; }
		
		//","
		public Keyword getCommaKeyword_5_0() { return cCommaKeyword_5_0; }
		
		//sssItems+=VSSSDocumentItem
		public Assignment getSssItemsAssignment_5_1() { return cSssItemsAssignment_5_1; }
		
		//VSSSDocumentItem
		public RuleCall getSssItemsVSSSDocumentItemParserRuleCall_5_1_0() { return cSssItemsVSSSDocumentItemParserRuleCall_5_1_0; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_6() { return cRightCurlyBracketKeyword_6; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_7() { return cRightCurlyBracketKeyword_7; }
	}
	public class VSSSComputerResourceRequirementElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.micobs.svm.lang.sss.SSS.VSSSComputerResourceRequirement");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cVSSSComputerResourceRequirementKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Keyword cSssItemsKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Keyword cLeftCurlyBracketKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Assignment cSssItemsAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cSssItemsVSSSDocumentItemParserRuleCall_4_0 = (RuleCall)cSssItemsAssignment_4.eContents().get(0);
		private final Group cGroup_5 = (Group)cGroup.eContents().get(5);
		private final Keyword cCommaKeyword_5_0 = (Keyword)cGroup_5.eContents().get(0);
		private final Assignment cSssItemsAssignment_5_1 = (Assignment)cGroup_5.eContents().get(1);
		private final RuleCall cSssItemsVSSSDocumentItemParserRuleCall_5_1_0 = (RuleCall)cSssItemsAssignment_5_1.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_6 = (Keyword)cGroup.eContents().get(6);
		private final Keyword cRightCurlyBracketKeyword_7 = (Keyword)cGroup.eContents().get(7);
		
		//VSSSComputerResourceRequirement:
		//	'VSSSComputerResourceRequirement'
		//	'{'
		//	'sssItems' '{' sssItems+=VSSSDocumentItem ("," sssItems+=VSSSDocumentItem)* '}'
		//	'}';
		@Override public ParserRule getRule() { return rule; }
		
		//'VSSSComputerResourceRequirement' '{' 'sssItems' '{' sssItems+=VSSSDocumentItem ("," sssItems+=VSSSDocumentItem)* '}'
		//'}'
		public Group getGroup() { return cGroup; }
		
		//'VSSSComputerResourceRequirement'
		public Keyword getVSSSComputerResourceRequirementKeyword_0() { return cVSSSComputerResourceRequirementKeyword_0; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_1() { return cLeftCurlyBracketKeyword_1; }
		
		//'sssItems'
		public Keyword getSssItemsKeyword_2() { return cSssItemsKeyword_2; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_3() { return cLeftCurlyBracketKeyword_3; }
		
		//sssItems+=VSSSDocumentItem
		public Assignment getSssItemsAssignment_4() { return cSssItemsAssignment_4; }
		
		//VSSSDocumentItem
		public RuleCall getSssItemsVSSSDocumentItemParserRuleCall_4_0() { return cSssItemsVSSSDocumentItemParserRuleCall_4_0; }
		
		//("," sssItems+=VSSSDocumentItem)*
		public Group getGroup_5() { return cGroup_5; }
		
		//","
		public Keyword getCommaKeyword_5_0() { return cCommaKeyword_5_0; }
		
		//sssItems+=VSSSDocumentItem
		public Assignment getSssItemsAssignment_5_1() { return cSssItemsAssignment_5_1; }
		
		//VSSSDocumentItem
		public RuleCall getSssItemsVSSSDocumentItemParserRuleCall_5_1_0() { return cSssItemsVSSSDocumentItemParserRuleCall_5_1_0; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_6() { return cRightCurlyBracketKeyword_6; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_7() { return cRightCurlyBracketKeyword_7; }
	}
	public class VSSSSecurityRequirementElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.micobs.svm.lang.sss.SSS.VSSSSecurityRequirement");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cVSSSSecurityRequirementKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Keyword cSssItemsKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Keyword cLeftCurlyBracketKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Assignment cSssItemsAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cSssItemsVSSSDocumentItemParserRuleCall_4_0 = (RuleCall)cSssItemsAssignment_4.eContents().get(0);
		private final Group cGroup_5 = (Group)cGroup.eContents().get(5);
		private final Keyword cCommaKeyword_5_0 = (Keyword)cGroup_5.eContents().get(0);
		private final Assignment cSssItemsAssignment_5_1 = (Assignment)cGroup_5.eContents().get(1);
		private final RuleCall cSssItemsVSSSDocumentItemParserRuleCall_5_1_0 = (RuleCall)cSssItemsAssignment_5_1.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_6 = (Keyword)cGroup.eContents().get(6);
		private final Keyword cRightCurlyBracketKeyword_7 = (Keyword)cGroup.eContents().get(7);
		
		//VSSSSecurityRequirement:
		//	'VSSSSecurityRequirement'
		//	'{'
		//	'sssItems' '{' sssItems+=VSSSDocumentItem ("," sssItems+=VSSSDocumentItem)* '}'
		//	'}';
		@Override public ParserRule getRule() { return rule; }
		
		//'VSSSSecurityRequirement' '{' 'sssItems' '{' sssItems+=VSSSDocumentItem ("," sssItems+=VSSSDocumentItem)* '}' '}'
		public Group getGroup() { return cGroup; }
		
		//'VSSSSecurityRequirement'
		public Keyword getVSSSSecurityRequirementKeyword_0() { return cVSSSSecurityRequirementKeyword_0; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_1() { return cLeftCurlyBracketKeyword_1; }
		
		//'sssItems'
		public Keyword getSssItemsKeyword_2() { return cSssItemsKeyword_2; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_3() { return cLeftCurlyBracketKeyword_3; }
		
		//sssItems+=VSSSDocumentItem
		public Assignment getSssItemsAssignment_4() { return cSssItemsAssignment_4; }
		
		//VSSSDocumentItem
		public RuleCall getSssItemsVSSSDocumentItemParserRuleCall_4_0() { return cSssItemsVSSSDocumentItemParserRuleCall_4_0; }
		
		//("," sssItems+=VSSSDocumentItem)*
		public Group getGroup_5() { return cGroup_5; }
		
		//","
		public Keyword getCommaKeyword_5_0() { return cCommaKeyword_5_0; }
		
		//sssItems+=VSSSDocumentItem
		public Assignment getSssItemsAssignment_5_1() { return cSssItemsAssignment_5_1; }
		
		//VSSSDocumentItem
		public RuleCall getSssItemsVSSSDocumentItemParserRuleCall_5_1_0() { return cSssItemsVSSSDocumentItemParserRuleCall_5_1_0; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_6() { return cRightCurlyBracketKeyword_6; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_7() { return cRightCurlyBracketKeyword_7; }
	}
	public class VSSSSafetyRequirementElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.micobs.svm.lang.sss.SSS.VSSSSafetyRequirement");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cVSSSSafetyRequirementKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Keyword cSssItemsKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Keyword cLeftCurlyBracketKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Assignment cSssItemsAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cSssItemsVSSSDocumentItemParserRuleCall_4_0 = (RuleCall)cSssItemsAssignment_4.eContents().get(0);
		private final Group cGroup_5 = (Group)cGroup.eContents().get(5);
		private final Keyword cCommaKeyword_5_0 = (Keyword)cGroup_5.eContents().get(0);
		private final Assignment cSssItemsAssignment_5_1 = (Assignment)cGroup_5.eContents().get(1);
		private final RuleCall cSssItemsVSSSDocumentItemParserRuleCall_5_1_0 = (RuleCall)cSssItemsAssignment_5_1.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_6 = (Keyword)cGroup.eContents().get(6);
		private final Keyword cRightCurlyBracketKeyword_7 = (Keyword)cGroup.eContents().get(7);
		
		//VSSSSafetyRequirement:
		//	'VSSSSafetyRequirement'
		//	'{'
		//	'sssItems' '{' sssItems+=VSSSDocumentItem ("," sssItems+=VSSSDocumentItem)* '}'
		//	'}';
		@Override public ParserRule getRule() { return rule; }
		
		//'VSSSSafetyRequirement' '{' 'sssItems' '{' sssItems+=VSSSDocumentItem ("," sssItems+=VSSSDocumentItem)* '}' '}'
		public Group getGroup() { return cGroup; }
		
		//'VSSSSafetyRequirement'
		public Keyword getVSSSSafetyRequirementKeyword_0() { return cVSSSSafetyRequirementKeyword_0; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_1() { return cLeftCurlyBracketKeyword_1; }
		
		//'sssItems'
		public Keyword getSssItemsKeyword_2() { return cSssItemsKeyword_2; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_3() { return cLeftCurlyBracketKeyword_3; }
		
		//sssItems+=VSSSDocumentItem
		public Assignment getSssItemsAssignment_4() { return cSssItemsAssignment_4; }
		
		//VSSSDocumentItem
		public RuleCall getSssItemsVSSSDocumentItemParserRuleCall_4_0() { return cSssItemsVSSSDocumentItemParserRuleCall_4_0; }
		
		//("," sssItems+=VSSSDocumentItem)*
		public Group getGroup_5() { return cGroup_5; }
		
		//","
		public Keyword getCommaKeyword_5_0() { return cCommaKeyword_5_0; }
		
		//sssItems+=VSSSDocumentItem
		public Assignment getSssItemsAssignment_5_1() { return cSssItemsAssignment_5_1; }
		
		//VSSSDocumentItem
		public RuleCall getSssItemsVSSSDocumentItemParserRuleCall_5_1_0() { return cSssItemsVSSSDocumentItemParserRuleCall_5_1_0; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_6() { return cRightCurlyBracketKeyword_6; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_7() { return cRightCurlyBracketKeyword_7; }
	}
	public class VSSSReliabiltyAvailabilityRequirementElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.micobs.svm.lang.sss.SSS.VSSSReliabiltyAvailabilityRequirement");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cVSSSReliabiltyAvailabilityRequirementKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Keyword cSssItemsKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Keyword cLeftCurlyBracketKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Assignment cSssItemsAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cSssItemsVSSSDocumentItemParserRuleCall_4_0 = (RuleCall)cSssItemsAssignment_4.eContents().get(0);
		private final Group cGroup_5 = (Group)cGroup.eContents().get(5);
		private final Keyword cCommaKeyword_5_0 = (Keyword)cGroup_5.eContents().get(0);
		private final Assignment cSssItemsAssignment_5_1 = (Assignment)cGroup_5.eContents().get(1);
		private final RuleCall cSssItemsVSSSDocumentItemParserRuleCall_5_1_0 = (RuleCall)cSssItemsAssignment_5_1.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_6 = (Keyword)cGroup.eContents().get(6);
		private final Keyword cRightCurlyBracketKeyword_7 = (Keyword)cGroup.eContents().get(7);
		
		//VSSSReliabiltyAvailabilityRequirement:
		//	'VSSSReliabiltyAvailabilityRequirement'
		//	'{'
		//	'sssItems' '{' sssItems+=VSSSDocumentItem ("," sssItems+=VSSSDocumentItem)* '}'
		//	'}';
		@Override public ParserRule getRule() { return rule; }
		
		//'VSSSReliabiltyAvailabilityRequirement' '{' 'sssItems' '{' sssItems+=VSSSDocumentItem ("," sssItems+=VSSSDocumentItem)*
		//'}' '}'
		public Group getGroup() { return cGroup; }
		
		//'VSSSReliabiltyAvailabilityRequirement'
		public Keyword getVSSSReliabiltyAvailabilityRequirementKeyword_0() { return cVSSSReliabiltyAvailabilityRequirementKeyword_0; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_1() { return cLeftCurlyBracketKeyword_1; }
		
		//'sssItems'
		public Keyword getSssItemsKeyword_2() { return cSssItemsKeyword_2; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_3() { return cLeftCurlyBracketKeyword_3; }
		
		//sssItems+=VSSSDocumentItem
		public Assignment getSssItemsAssignment_4() { return cSssItemsAssignment_4; }
		
		//VSSSDocumentItem
		public RuleCall getSssItemsVSSSDocumentItemParserRuleCall_4_0() { return cSssItemsVSSSDocumentItemParserRuleCall_4_0; }
		
		//("," sssItems+=VSSSDocumentItem)*
		public Group getGroup_5() { return cGroup_5; }
		
		//","
		public Keyword getCommaKeyword_5_0() { return cCommaKeyword_5_0; }
		
		//sssItems+=VSSSDocumentItem
		public Assignment getSssItemsAssignment_5_1() { return cSssItemsAssignment_5_1; }
		
		//VSSSDocumentItem
		public RuleCall getSssItemsVSSSDocumentItemParserRuleCall_5_1_0() { return cSssItemsVSSSDocumentItemParserRuleCall_5_1_0; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_6() { return cRightCurlyBracketKeyword_6; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_7() { return cRightCurlyBracketKeyword_7; }
	}
	public class VSSSQualityRequirementElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.micobs.svm.lang.sss.SSS.VSSSQualityRequirement");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cVSSSQualityRequirementKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Keyword cSssItemsKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Keyword cLeftCurlyBracketKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Assignment cSssItemsAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cSssItemsVSSSDocumentItemParserRuleCall_4_0 = (RuleCall)cSssItemsAssignment_4.eContents().get(0);
		private final Group cGroup_5 = (Group)cGroup.eContents().get(5);
		private final Keyword cCommaKeyword_5_0 = (Keyword)cGroup_5.eContents().get(0);
		private final Assignment cSssItemsAssignment_5_1 = (Assignment)cGroup_5.eContents().get(1);
		private final RuleCall cSssItemsVSSSDocumentItemParserRuleCall_5_1_0 = (RuleCall)cSssItemsAssignment_5_1.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_6 = (Keyword)cGroup.eContents().get(6);
		private final Keyword cRightCurlyBracketKeyword_7 = (Keyword)cGroup.eContents().get(7);
		
		//VSSSQualityRequirement:
		//	'VSSSQualityRequirement'
		//	'{'
		//	'sssItems' '{' sssItems+=VSSSDocumentItem ("," sssItems+=VSSSDocumentItem)* '}'
		//	'}';
		@Override public ParserRule getRule() { return rule; }
		
		//'VSSSQualityRequirement' '{' 'sssItems' '{' sssItems+=VSSSDocumentItem ("," sssItems+=VSSSDocumentItem)* '}' '}'
		public Group getGroup() { return cGroup; }
		
		//'VSSSQualityRequirement'
		public Keyword getVSSSQualityRequirementKeyword_0() { return cVSSSQualityRequirementKeyword_0; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_1() { return cLeftCurlyBracketKeyword_1; }
		
		//'sssItems'
		public Keyword getSssItemsKeyword_2() { return cSssItemsKeyword_2; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_3() { return cLeftCurlyBracketKeyword_3; }
		
		//sssItems+=VSSSDocumentItem
		public Assignment getSssItemsAssignment_4() { return cSssItemsAssignment_4; }
		
		//VSSSDocumentItem
		public RuleCall getSssItemsVSSSDocumentItemParserRuleCall_4_0() { return cSssItemsVSSSDocumentItemParserRuleCall_4_0; }
		
		//("," sssItems+=VSSSDocumentItem)*
		public Group getGroup_5() { return cGroup_5; }
		
		//","
		public Keyword getCommaKeyword_5_0() { return cCommaKeyword_5_0; }
		
		//sssItems+=VSSSDocumentItem
		public Assignment getSssItemsAssignment_5_1() { return cSssItemsAssignment_5_1; }
		
		//VSSSDocumentItem
		public RuleCall getSssItemsVSSSDocumentItemParserRuleCall_5_1_0() { return cSssItemsVSSSDocumentItemParserRuleCall_5_1_0; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_6() { return cRightCurlyBracketKeyword_6; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_7() { return cRightCurlyBracketKeyword_7; }
	}
	public class VSSSDesignRequirementElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.micobs.svm.lang.sss.SSS.VSSSDesignRequirement");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cVSSSDesignRequirementKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Keyword cSssItemsKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Keyword cLeftCurlyBracketKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Assignment cSssItemsAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cSssItemsVSSSDocumentItemParserRuleCall_4_0 = (RuleCall)cSssItemsAssignment_4.eContents().get(0);
		private final Group cGroup_5 = (Group)cGroup.eContents().get(5);
		private final Keyword cCommaKeyword_5_0 = (Keyword)cGroup_5.eContents().get(0);
		private final Assignment cSssItemsAssignment_5_1 = (Assignment)cGroup_5.eContents().get(1);
		private final RuleCall cSssItemsVSSSDocumentItemParserRuleCall_5_1_0 = (RuleCall)cSssItemsAssignment_5_1.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_6 = (Keyword)cGroup.eContents().get(6);
		private final Keyword cRightCurlyBracketKeyword_7 = (Keyword)cGroup.eContents().get(7);
		
		//VSSSDesignRequirement:
		//	'VSSSDesignRequirement'
		//	'{'
		//	'sssItems' '{' sssItems+=VSSSDocumentItem ("," sssItems+=VSSSDocumentItem)* '}'
		//	'}';
		@Override public ParserRule getRule() { return rule; }
		
		//'VSSSDesignRequirement' '{' 'sssItems' '{' sssItems+=VSSSDocumentItem ("," sssItems+=VSSSDocumentItem)* '}' '}'
		public Group getGroup() { return cGroup; }
		
		//'VSSSDesignRequirement'
		public Keyword getVSSSDesignRequirementKeyword_0() { return cVSSSDesignRequirementKeyword_0; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_1() { return cLeftCurlyBracketKeyword_1; }
		
		//'sssItems'
		public Keyword getSssItemsKeyword_2() { return cSssItemsKeyword_2; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_3() { return cLeftCurlyBracketKeyword_3; }
		
		//sssItems+=VSSSDocumentItem
		public Assignment getSssItemsAssignment_4() { return cSssItemsAssignment_4; }
		
		//VSSSDocumentItem
		public RuleCall getSssItemsVSSSDocumentItemParserRuleCall_4_0() { return cSssItemsVSSSDocumentItemParserRuleCall_4_0; }
		
		//("," sssItems+=VSSSDocumentItem)*
		public Group getGroup_5() { return cGroup_5; }
		
		//","
		public Keyword getCommaKeyword_5_0() { return cCommaKeyword_5_0; }
		
		//sssItems+=VSSSDocumentItem
		public Assignment getSssItemsAssignment_5_1() { return cSssItemsAssignment_5_1; }
		
		//VSSSDocumentItem
		public RuleCall getSssItemsVSSSDocumentItemParserRuleCall_5_1_0() { return cSssItemsVSSSDocumentItemParserRuleCall_5_1_0; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_6() { return cRightCurlyBracketKeyword_6; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_7() { return cRightCurlyBracketKeyword_7; }
	}
	public class VSSSSoftwareOperationsRequirementElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.micobs.svm.lang.sss.SSS.VSSSSoftwareOperationsRequirement");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cVSSSSoftwareOperationsRequirementKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Keyword cSssItemsKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Keyword cLeftCurlyBracketKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Assignment cSssItemsAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cSssItemsVSSSDocumentItemParserRuleCall_4_0 = (RuleCall)cSssItemsAssignment_4.eContents().get(0);
		private final Group cGroup_5 = (Group)cGroup.eContents().get(5);
		private final Keyword cCommaKeyword_5_0 = (Keyword)cGroup_5.eContents().get(0);
		private final Assignment cSssItemsAssignment_5_1 = (Assignment)cGroup_5.eContents().get(1);
		private final RuleCall cSssItemsVSSSDocumentItemParserRuleCall_5_1_0 = (RuleCall)cSssItemsAssignment_5_1.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_6 = (Keyword)cGroup.eContents().get(6);
		private final Keyword cRightCurlyBracketKeyword_7 = (Keyword)cGroup.eContents().get(7);
		
		//VSSSSoftwareOperationsRequirement:
		//	'VSSSSoftwareOperationsRequirement'
		//	'{'
		//	'sssItems' '{' sssItems+=VSSSDocumentItem ("," sssItems+=VSSSDocumentItem)* '}'
		//	'}';
		@Override public ParserRule getRule() { return rule; }
		
		//'VSSSSoftwareOperationsRequirement' '{' 'sssItems' '{' sssItems+=VSSSDocumentItem ("," sssItems+=VSSSDocumentItem)* '}'
		//'}'
		public Group getGroup() { return cGroup; }
		
		//'VSSSSoftwareOperationsRequirement'
		public Keyword getVSSSSoftwareOperationsRequirementKeyword_0() { return cVSSSSoftwareOperationsRequirementKeyword_0; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_1() { return cLeftCurlyBracketKeyword_1; }
		
		//'sssItems'
		public Keyword getSssItemsKeyword_2() { return cSssItemsKeyword_2; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_3() { return cLeftCurlyBracketKeyword_3; }
		
		//sssItems+=VSSSDocumentItem
		public Assignment getSssItemsAssignment_4() { return cSssItemsAssignment_4; }
		
		//VSSSDocumentItem
		public RuleCall getSssItemsVSSSDocumentItemParserRuleCall_4_0() { return cSssItemsVSSSDocumentItemParserRuleCall_4_0; }
		
		//("," sssItems+=VSSSDocumentItem)*
		public Group getGroup_5() { return cGroup_5; }
		
		//","
		public Keyword getCommaKeyword_5_0() { return cCommaKeyword_5_0; }
		
		//sssItems+=VSSSDocumentItem
		public Assignment getSssItemsAssignment_5_1() { return cSssItemsAssignment_5_1; }
		
		//VSSSDocumentItem
		public RuleCall getSssItemsVSSSDocumentItemParserRuleCall_5_1_0() { return cSssItemsVSSSDocumentItemParserRuleCall_5_1_0; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_6() { return cRightCurlyBracketKeyword_6; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_7() { return cRightCurlyBracketKeyword_7; }
	}
	public class VSSSSoftwareMaintenanceRequirementElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.micobs.svm.lang.sss.SSS.VSSSSoftwareMaintenanceRequirement");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cVSSSSoftwareMaintenanceRequirementKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Keyword cSssItemsKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Keyword cLeftCurlyBracketKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Assignment cSssItemsAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cSssItemsVSSSDocumentItemParserRuleCall_4_0 = (RuleCall)cSssItemsAssignment_4.eContents().get(0);
		private final Group cGroup_5 = (Group)cGroup.eContents().get(5);
		private final Keyword cCommaKeyword_5_0 = (Keyword)cGroup_5.eContents().get(0);
		private final Assignment cSssItemsAssignment_5_1 = (Assignment)cGroup_5.eContents().get(1);
		private final RuleCall cSssItemsVSSSDocumentItemParserRuleCall_5_1_0 = (RuleCall)cSssItemsAssignment_5_1.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_6 = (Keyword)cGroup.eContents().get(6);
		private final Keyword cRightCurlyBracketKeyword_7 = (Keyword)cGroup.eContents().get(7);
		
		//VSSSSoftwareMaintenanceRequirement:
		//	'VSSSSoftwareMaintenanceRequirement'
		//	'{'
		//	'sssItems' '{' sssItems+=VSSSDocumentItem ("," sssItems+=VSSSDocumentItem)* '}'
		//	'}';
		@Override public ParserRule getRule() { return rule; }
		
		//'VSSSSoftwareMaintenanceRequirement' '{' 'sssItems' '{' sssItems+=VSSSDocumentItem ("," sssItems+=VSSSDocumentItem)* '}'
		//'}'
		public Group getGroup() { return cGroup; }
		
		//'VSSSSoftwareMaintenanceRequirement'
		public Keyword getVSSSSoftwareMaintenanceRequirementKeyword_0() { return cVSSSSoftwareMaintenanceRequirementKeyword_0; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_1() { return cLeftCurlyBracketKeyword_1; }
		
		//'sssItems'
		public Keyword getSssItemsKeyword_2() { return cSssItemsKeyword_2; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_3() { return cLeftCurlyBracketKeyword_3; }
		
		//sssItems+=VSSSDocumentItem
		public Assignment getSssItemsAssignment_4() { return cSssItemsAssignment_4; }
		
		//VSSSDocumentItem
		public RuleCall getSssItemsVSSSDocumentItemParserRuleCall_4_0() { return cSssItemsVSSSDocumentItemParserRuleCall_4_0; }
		
		//("," sssItems+=VSSSDocumentItem)*
		public Group getGroup_5() { return cGroup_5; }
		
		//","
		public Keyword getCommaKeyword_5_0() { return cCommaKeyword_5_0; }
		
		//sssItems+=VSSSDocumentItem
		public Assignment getSssItemsAssignment_5_1() { return cSssItemsAssignment_5_1; }
		
		//VSSSDocumentItem
		public RuleCall getSssItemsVSSSDocumentItemParserRuleCall_5_1_0() { return cSssItemsVSSSDocumentItemParserRuleCall_5_1_0; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_6() { return cRightCurlyBracketKeyword_6; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_7() { return cRightCurlyBracketKeyword_7; }
	}
	public class VSSSSystemSoftwareObservabilityRequirementElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.micobs.svm.lang.sss.SSS.VSSSSystemSoftwareObservabilityRequirement");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cVSSSSystemSoftwareObservabilityRequirementKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Keyword cSssItemsKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Keyword cLeftCurlyBracketKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Assignment cSssItemsAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cSssItemsVSSSDocumentItemParserRuleCall_4_0 = (RuleCall)cSssItemsAssignment_4.eContents().get(0);
		private final Group cGroup_5 = (Group)cGroup.eContents().get(5);
		private final Keyword cCommaKeyword_5_0 = (Keyword)cGroup_5.eContents().get(0);
		private final Assignment cSssItemsAssignment_5_1 = (Assignment)cGroup_5.eContents().get(1);
		private final RuleCall cSssItemsVSSSDocumentItemParserRuleCall_5_1_0 = (RuleCall)cSssItemsAssignment_5_1.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_6 = (Keyword)cGroup.eContents().get(6);
		private final Keyword cRightCurlyBracketKeyword_7 = (Keyword)cGroup.eContents().get(7);
		
		//VSSSSystemSoftwareObservabilityRequirement:
		//	'VSSSSystemSoftwareObservabilityRequirement'
		//	'{'
		//	'sssItems' '{' sssItems+=VSSSDocumentItem ("," sssItems+=VSSSDocumentItem)* '}'
		//	'}';
		@Override public ParserRule getRule() { return rule; }
		
		//'VSSSSystemSoftwareObservabilityRequirement' '{' 'sssItems' '{' sssItems+=VSSSDocumentItem (","
		//sssItems+=VSSSDocumentItem)* '}' '}'
		public Group getGroup() { return cGroup; }
		
		//'VSSSSystemSoftwareObservabilityRequirement'
		public Keyword getVSSSSystemSoftwareObservabilityRequirementKeyword_0() { return cVSSSSystemSoftwareObservabilityRequirementKeyword_0; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_1() { return cLeftCurlyBracketKeyword_1; }
		
		//'sssItems'
		public Keyword getSssItemsKeyword_2() { return cSssItemsKeyword_2; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_3() { return cLeftCurlyBracketKeyword_3; }
		
		//sssItems+=VSSSDocumentItem
		public Assignment getSssItemsAssignment_4() { return cSssItemsAssignment_4; }
		
		//VSSSDocumentItem
		public RuleCall getSssItemsVSSSDocumentItemParserRuleCall_4_0() { return cSssItemsVSSSDocumentItemParserRuleCall_4_0; }
		
		//("," sssItems+=VSSSDocumentItem)*
		public Group getGroup_5() { return cGroup_5; }
		
		//","
		public Keyword getCommaKeyword_5_0() { return cCommaKeyword_5_0; }
		
		//sssItems+=VSSSDocumentItem
		public Assignment getSssItemsAssignment_5_1() { return cSssItemsAssignment_5_1; }
		
		//VSSSDocumentItem
		public RuleCall getSssItemsVSSSDocumentItemParserRuleCall_5_1_0() { return cSssItemsVSSSDocumentItemParserRuleCall_5_1_0; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_6() { return cRightCurlyBracketKeyword_6; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_7() { return cRightCurlyBracketKeyword_7; }
	}
	public class VSSSDocumentItemElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.micobs.svm.lang.sss.SSS.VSSSDocumentItem");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cVSSSDocumentItemKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Keyword cIdKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cIdAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cIdEStringParserRuleCall_3_0 = (RuleCall)cIdAssignment_3.eContents().get(0);
		private final Keyword cVerificationMethodKeyword_4 = (Keyword)cGroup.eContents().get(4);
		private final Assignment cVerificationMethodAssignment_5 = (Assignment)cGroup.eContents().get(5);
		private final RuleCall cVerificationMethodVVerificationMethodEnumRuleCall_5_0 = (RuleCall)cVerificationMethodAssignment_5.eContents().get(0);
		private final Keyword cBodyKeyword_6 = (Keyword)cGroup.eContents().get(6);
		private final Assignment cBodyAssignment_7 = (Assignment)cGroup.eContents().get(7);
		private final CrossReference cBodyDBodyCrossReference_7_0 = (CrossReference)cBodyAssignment_7.eContents().get(0);
		private final RuleCall cBodyDBodyEStringParserRuleCall_7_0_1 = (RuleCall)cBodyDBodyCrossReference_7_0.eContents().get(1);
		private final Keyword cRightCurlyBracketKeyword_8 = (Keyword)cGroup.eContents().get(8);
		
		//VSSSDocumentItem:
		//	'VSSSDocumentItem'
		//	'{'
		//	'id' id=EString
		//	'verificationMethod' verificationMethod=VVerificationMethod
		//	'body' body=[doc::DBody|EString]
		//	'}';
		@Override public ParserRule getRule() { return rule; }
		
		//'VSSSDocumentItem' '{' 'id' id=EString 'verificationMethod' verificationMethod=VVerificationMethod 'body'
		//body=[doc::DBody|EString] '}'
		public Group getGroup() { return cGroup; }
		
		//'VSSSDocumentItem'
		public Keyword getVSSSDocumentItemKeyword_0() { return cVSSSDocumentItemKeyword_0; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_1() { return cLeftCurlyBracketKeyword_1; }
		
		//'id'
		public Keyword getIdKeyword_2() { return cIdKeyword_2; }
		
		//id=EString
		public Assignment getIdAssignment_3() { return cIdAssignment_3; }
		
		//EString
		public RuleCall getIdEStringParserRuleCall_3_0() { return cIdEStringParserRuleCall_3_0; }
		
		//'verificationMethod'
		public Keyword getVerificationMethodKeyword_4() { return cVerificationMethodKeyword_4; }
		
		//verificationMethod=VVerificationMethod
		public Assignment getVerificationMethodAssignment_5() { return cVerificationMethodAssignment_5; }
		
		//VVerificationMethod
		public RuleCall getVerificationMethodVVerificationMethodEnumRuleCall_5_0() { return cVerificationMethodVVerificationMethodEnumRuleCall_5_0; }
		
		//'body'
		public Keyword getBodyKeyword_6() { return cBodyKeyword_6; }
		
		//body=[doc::DBody|EString]
		public Assignment getBodyAssignment_7() { return cBodyAssignment_7; }
		
		//[doc::DBody|EString]
		public CrossReference getBodyDBodyCrossReference_7_0() { return cBodyDBodyCrossReference_7_0; }
		
		//EString
		public RuleCall getBodyDBodyEStringParserRuleCall_7_0_1() { return cBodyDBodyEStringParserRuleCall_7_0_1; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_8() { return cRightCurlyBracketKeyword_8; }
	}
	public class VSSSVerificationValidationProcessRequirementElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.micobs.svm.lang.sss.SSS.VSSSVerificationValidationProcessRequirement");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cVSSSVerificationValidationProcessRequirementKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Keyword cSssItemsKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Keyword cLeftCurlyBracketKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Assignment cSssItemsAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cSssItemsVSSSDocumentItemParserRuleCall_4_0 = (RuleCall)cSssItemsAssignment_4.eContents().get(0);
		private final Group cGroup_5 = (Group)cGroup.eContents().get(5);
		private final Keyword cCommaKeyword_5_0 = (Keyword)cGroup_5.eContents().get(0);
		private final Assignment cSssItemsAssignment_5_1 = (Assignment)cGroup_5.eContents().get(1);
		private final RuleCall cSssItemsVSSSDocumentItemParserRuleCall_5_1_0 = (RuleCall)cSssItemsAssignment_5_1.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_6 = (Keyword)cGroup.eContents().get(6);
		private final Keyword cRightCurlyBracketKeyword_7 = (Keyword)cGroup.eContents().get(7);
		
		//VSSSVerificationValidationProcessRequirement:
		//	'VSSSVerificationValidationProcessRequirement'
		//	'{'
		//	'sssItems' '{' sssItems+=VSSSDocumentItem ("," sssItems+=VSSSDocumentItem)* '}'
		//	'}';
		@Override public ParserRule getRule() { return rule; }
		
		//'VSSSVerificationValidationProcessRequirement' '{' 'sssItems' '{' sssItems+=VSSSDocumentItem (","
		//sssItems+=VSSSDocumentItem)* '}' '}'
		public Group getGroup() { return cGroup; }
		
		//'VSSSVerificationValidationProcessRequirement'
		public Keyword getVSSSVerificationValidationProcessRequirementKeyword_0() { return cVSSSVerificationValidationProcessRequirementKeyword_0; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_1() { return cLeftCurlyBracketKeyword_1; }
		
		//'sssItems'
		public Keyword getSssItemsKeyword_2() { return cSssItemsKeyword_2; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_3() { return cLeftCurlyBracketKeyword_3; }
		
		//sssItems+=VSSSDocumentItem
		public Assignment getSssItemsAssignment_4() { return cSssItemsAssignment_4; }
		
		//VSSSDocumentItem
		public RuleCall getSssItemsVSSSDocumentItemParserRuleCall_4_0() { return cSssItemsVSSSDocumentItemParserRuleCall_4_0; }
		
		//("," sssItems+=VSSSDocumentItem)*
		public Group getGroup_5() { return cGroup_5; }
		
		//","
		public Keyword getCommaKeyword_5_0() { return cCommaKeyword_5_0; }
		
		//sssItems+=VSSSDocumentItem
		public Assignment getSssItemsAssignment_5_1() { return cSssItemsAssignment_5_1; }
		
		//VSSSDocumentItem
		public RuleCall getSssItemsVSSSDocumentItemParserRuleCall_5_1_0() { return cSssItemsVSSSDocumentItemParserRuleCall_5_1_0; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_6() { return cRightCurlyBracketKeyword_6; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_7() { return cRightCurlyBracketKeyword_7; }
	}
	public class VSSSValidationApproachElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.micobs.svm.lang.sss.SSS.VSSSValidationApproach");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cVSSSValidationApproachKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Keyword cSssItemsKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Keyword cLeftCurlyBracketKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Assignment cSssItemsAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cSssItemsVSSSDocumentItemParserRuleCall_4_0 = (RuleCall)cSssItemsAssignment_4.eContents().get(0);
		private final Group cGroup_5 = (Group)cGroup.eContents().get(5);
		private final Keyword cCommaKeyword_5_0 = (Keyword)cGroup_5.eContents().get(0);
		private final Assignment cSssItemsAssignment_5_1 = (Assignment)cGroup_5.eContents().get(1);
		private final RuleCall cSssItemsVSSSDocumentItemParserRuleCall_5_1_0 = (RuleCall)cSssItemsAssignment_5_1.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_6 = (Keyword)cGroup.eContents().get(6);
		private final Keyword cRightCurlyBracketKeyword_7 = (Keyword)cGroup.eContents().get(7);
		
		//VSSSValidationApproach:
		//	'VSSSValidationApproach'
		//	'{'
		//	'sssItems' '{' sssItems+=VSSSDocumentItem ("," sssItems+=VSSSDocumentItem)* '}'
		//	'}';
		@Override public ParserRule getRule() { return rule; }
		
		//'VSSSValidationApproach' '{' 'sssItems' '{' sssItems+=VSSSDocumentItem ("," sssItems+=VSSSDocumentItem)* '}' '}'
		public Group getGroup() { return cGroup; }
		
		//'VSSSValidationApproach'
		public Keyword getVSSSValidationApproachKeyword_0() { return cVSSSValidationApproachKeyword_0; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_1() { return cLeftCurlyBracketKeyword_1; }
		
		//'sssItems'
		public Keyword getSssItemsKeyword_2() { return cSssItemsKeyword_2; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_3() { return cLeftCurlyBracketKeyword_3; }
		
		//sssItems+=VSSSDocumentItem
		public Assignment getSssItemsAssignment_4() { return cSssItemsAssignment_4; }
		
		//VSSSDocumentItem
		public RuleCall getSssItemsVSSSDocumentItemParserRuleCall_4_0() { return cSssItemsVSSSDocumentItemParserRuleCall_4_0; }
		
		//("," sssItems+=VSSSDocumentItem)*
		public Group getGroup_5() { return cGroup_5; }
		
		//","
		public Keyword getCommaKeyword_5_0() { return cCommaKeyword_5_0; }
		
		//sssItems+=VSSSDocumentItem
		public Assignment getSssItemsAssignment_5_1() { return cSssItemsAssignment_5_1; }
		
		//VSSSDocumentItem
		public RuleCall getSssItemsVSSSDocumentItemParserRuleCall_5_1_0() { return cSssItemsVSSSDocumentItemParserRuleCall_5_1_0; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_6() { return cRightCurlyBracketKeyword_6; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_7() { return cRightCurlyBracketKeyword_7; }
	}
	public class VSSSValidationRequirementElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.micobs.svm.lang.sss.SSS.VSSSValidationRequirement");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cVSSSValidationRequirementKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Keyword cSssItemsKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Keyword cLeftCurlyBracketKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Assignment cSssItemsAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cSssItemsVSSSDocumentItemParserRuleCall_4_0 = (RuleCall)cSssItemsAssignment_4.eContents().get(0);
		private final Group cGroup_5 = (Group)cGroup.eContents().get(5);
		private final Keyword cCommaKeyword_5_0 = (Keyword)cGroup_5.eContents().get(0);
		private final Assignment cSssItemsAssignment_5_1 = (Assignment)cGroup_5.eContents().get(1);
		private final RuleCall cSssItemsVSSSDocumentItemParserRuleCall_5_1_0 = (RuleCall)cSssItemsAssignment_5_1.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_6 = (Keyword)cGroup.eContents().get(6);
		private final Keyword cRightCurlyBracketKeyword_7 = (Keyword)cGroup.eContents().get(7);
		
		//VSSSValidationRequirement:
		//	'VSSSValidationRequirement'
		//	'{'
		//	'sssItems' '{' sssItems+=VSSSDocumentItem ("," sssItems+=VSSSDocumentItem)* '}'
		//	'}';
		@Override public ParserRule getRule() { return rule; }
		
		//'VSSSValidationRequirement' '{' 'sssItems' '{' sssItems+=VSSSDocumentItem ("," sssItems+=VSSSDocumentItem)* '}' '}'
		public Group getGroup() { return cGroup; }
		
		//'VSSSValidationRequirement'
		public Keyword getVSSSValidationRequirementKeyword_0() { return cVSSSValidationRequirementKeyword_0; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_1() { return cLeftCurlyBracketKeyword_1; }
		
		//'sssItems'
		public Keyword getSssItemsKeyword_2() { return cSssItemsKeyword_2; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_3() { return cLeftCurlyBracketKeyword_3; }
		
		//sssItems+=VSSSDocumentItem
		public Assignment getSssItemsAssignment_4() { return cSssItemsAssignment_4; }
		
		//VSSSDocumentItem
		public RuleCall getSssItemsVSSSDocumentItemParserRuleCall_4_0() { return cSssItemsVSSSDocumentItemParserRuleCall_4_0; }
		
		//("," sssItems+=VSSSDocumentItem)*
		public Group getGroup_5() { return cGroup_5; }
		
		//","
		public Keyword getCommaKeyword_5_0() { return cCommaKeyword_5_0; }
		
		//sssItems+=VSSSDocumentItem
		public Assignment getSssItemsAssignment_5_1() { return cSssItemsAssignment_5_1; }
		
		//VSSSDocumentItem
		public RuleCall getSssItemsVSSSDocumentItemParserRuleCall_5_1_0() { return cSssItemsVSSSDocumentItemParserRuleCall_5_1_0; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_6() { return cRightCurlyBracketKeyword_6; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_7() { return cRightCurlyBracketKeyword_7; }
	}
	public class VSSSVerificationRequirementElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.micobs.svm.lang.sss.SSS.VSSSVerificationRequirement");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cVSSSVerificationRequirementKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Keyword cSssItemsKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Keyword cLeftCurlyBracketKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Assignment cSssItemsAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cSssItemsVSSSDocumentItemParserRuleCall_4_0 = (RuleCall)cSssItemsAssignment_4.eContents().get(0);
		private final Group cGroup_5 = (Group)cGroup.eContents().get(5);
		private final Keyword cCommaKeyword_5_0 = (Keyword)cGroup_5.eContents().get(0);
		private final Assignment cSssItemsAssignment_5_1 = (Assignment)cGroup_5.eContents().get(1);
		private final RuleCall cSssItemsVSSSDocumentItemParserRuleCall_5_1_0 = (RuleCall)cSssItemsAssignment_5_1.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_6 = (Keyword)cGroup.eContents().get(6);
		private final Keyword cRightCurlyBracketKeyword_7 = (Keyword)cGroup.eContents().get(7);
		
		//VSSSVerificationRequirement:
		//	'VSSSVerificationRequirement'
		//	'{'
		//	'sssItems' '{' sssItems+=VSSSDocumentItem ("," sssItems+=VSSSDocumentItem)* '}'
		//	'}';
		@Override public ParserRule getRule() { return rule; }
		
		//'VSSSVerificationRequirement' '{' 'sssItems' '{' sssItems+=VSSSDocumentItem ("," sssItems+=VSSSDocumentItem)* '}' '}'
		public Group getGroup() { return cGroup; }
		
		//'VSSSVerificationRequirement'
		public Keyword getVSSSVerificationRequirementKeyword_0() { return cVSSSVerificationRequirementKeyword_0; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_1() { return cLeftCurlyBracketKeyword_1; }
		
		//'sssItems'
		public Keyword getSssItemsKeyword_2() { return cSssItemsKeyword_2; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_3() { return cLeftCurlyBracketKeyword_3; }
		
		//sssItems+=VSSSDocumentItem
		public Assignment getSssItemsAssignment_4() { return cSssItemsAssignment_4; }
		
		//VSSSDocumentItem
		public RuleCall getSssItemsVSSSDocumentItemParserRuleCall_4_0() { return cSssItemsVSSSDocumentItemParserRuleCall_4_0; }
		
		//("," sssItems+=VSSSDocumentItem)*
		public Group getGroup_5() { return cGroup_5; }
		
		//","
		public Keyword getCommaKeyword_5_0() { return cCommaKeyword_5_0; }
		
		//sssItems+=VSSSDocumentItem
		public Assignment getSssItemsAssignment_5_1() { return cSssItemsAssignment_5_1; }
		
		//VSSSDocumentItem
		public RuleCall getSssItemsVSSSDocumentItemParserRuleCall_5_1_0() { return cSssItemsVSSSDocumentItemParserRuleCall_5_1_0; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_6() { return cRightCurlyBracketKeyword_6; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_7() { return cRightCurlyBracketKeyword_7; }
	}
	public class VSSSSystemModelElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.micobs.svm.lang.sss.SSS.VSSSSystemModel");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cVSSSSystemModelAction_0 = (Action)cGroup.eContents().get(0);
		private final Keyword cVSSSSystemModelKeyword_1 = (Keyword)cGroup.eContents().get(1);
		
		//VSSSSystemModel:
		//	{VSSSSystemModel}
		//	'VSSSSystemModel';
		@Override public ParserRule getRule() { return rule; }
		
		//{VSSSSystemModel} 'VSSSSystemModel'
		public Group getGroup() { return cGroup; }
		
		//{VSSSSystemModel}
		public Action getVSSSSystemModelAction_0() { return cVSSSSystemModelAction_0; }
		
		//'VSSSSystemModel'
		public Keyword getVSSSSystemModelKeyword_1() { return cVSSSSystemModelKeyword_1; }
	}
	public class QualifiedNameElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.micobs.svm.lang.sss.SSS.QualifiedName");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final RuleCall cIDTerminalRuleCall_0 = (RuleCall)cGroup.eContents().get(0);
		private final Group cGroup_1 = (Group)cGroup.eContents().get(1);
		private final Keyword cFullStopKeyword_1_0 = (Keyword)cGroup_1.eContents().get(0);
		private final RuleCall cIDTerminalRuleCall_1_1 = (RuleCall)cGroup_1.eContents().get(1);
		
		//QualifiedName:
		//	ID ('.' ID)*;
		@Override public ParserRule getRule() { return rule; }
		
		//ID ('.' ID)*
		public Group getGroup() { return cGroup; }
		
		//ID
		public RuleCall getIDTerminalRuleCall_0() { return cIDTerminalRuleCall_0; }
		
		//('.' ID)*
		public Group getGroup_1() { return cGroup_1; }
		
		//'.'
		public Keyword getFullStopKeyword_1_0() { return cFullStopKeyword_1_0; }
		
		//ID
		public RuleCall getIDTerminalRuleCall_1_1() { return cIDTerminalRuleCall_1_1; }
	}
	public class VersionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.micobs.svm.lang.sss.SSS.Version");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Alternatives cAlternatives_0 = (Alternatives)cGroup.eContents().get(0);
		private final RuleCall cINTTerminalRuleCall_0_0 = (RuleCall)cAlternatives_0.eContents().get(0);
		private final Group cGroup_0_1 = (Group)cAlternatives_0.eContents().get(1);
		private final RuleCall cINTTerminalRuleCall_0_1_0 = (RuleCall)cGroup_0_1.eContents().get(0);
		private final RuleCall cIDTerminalRuleCall_0_1_1 = (RuleCall)cGroup_0_1.eContents().get(1);
		private final Group cGroup_1 = (Group)cGroup.eContents().get(1);
		private final Keyword cFullStopKeyword_1_0 = (Keyword)cGroup_1.eContents().get(0);
		private final Alternatives cAlternatives_1_1 = (Alternatives)cGroup_1.eContents().get(1);
		private final RuleCall cINTTerminalRuleCall_1_1_0 = (RuleCall)cAlternatives_1_1.eContents().get(0);
		private final Group cGroup_1_1_1 = (Group)cAlternatives_1_1.eContents().get(1);
		private final RuleCall cINTTerminalRuleCall_1_1_1_0 = (RuleCall)cGroup_1_1_1.eContents().get(0);
		private final RuleCall cIDTerminalRuleCall_1_1_1_1 = (RuleCall)cGroup_1_1_1.eContents().get(1);
		
		//Version:
		//	(INT | INT? ID) ('.' (INT | INT? ID))*;
		@Override public ParserRule getRule() { return rule; }
		
		//(INT | INT? ID) ('.' (INT | INT? ID))*
		public Group getGroup() { return cGroup; }
		
		//(INT | INT? ID)
		public Alternatives getAlternatives_0() { return cAlternatives_0; }
		
		//INT
		public RuleCall getINTTerminalRuleCall_0_0() { return cINTTerminalRuleCall_0_0; }
		
		//INT? ID
		public Group getGroup_0_1() { return cGroup_0_1; }
		
		//INT?
		public RuleCall getINTTerminalRuleCall_0_1_0() { return cINTTerminalRuleCall_0_1_0; }
		
		//ID
		public RuleCall getIDTerminalRuleCall_0_1_1() { return cIDTerminalRuleCall_0_1_1; }
		
		//('.' (INT | INT? ID))*
		public Group getGroup_1() { return cGroup_1; }
		
		//'.'
		public Keyword getFullStopKeyword_1_0() { return cFullStopKeyword_1_0; }
		
		//(INT | INT? ID)
		public Alternatives getAlternatives_1_1() { return cAlternatives_1_1; }
		
		//INT
		public RuleCall getINTTerminalRuleCall_1_1_0() { return cINTTerminalRuleCall_1_1_0; }
		
		//INT? ID
		public Group getGroup_1_1_1() { return cGroup_1_1_1; }
		
		//INT?
		public RuleCall getINTTerminalRuleCall_1_1_1_0() { return cINTTerminalRuleCall_1_1_1_0; }
		
		//ID
		public RuleCall getIDTerminalRuleCall_1_1_1_1() { return cIDTerminalRuleCall_1_1_1_1; }
	}
	public class VersionedQualifiedNameElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.micobs.svm.lang.sss.SSS.VersionedQualifiedName");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final RuleCall cQualifiedNameParserRuleCall_0 = (RuleCall)cGroup.eContents().get(0);
		private final Keyword cLeftParenthesisKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final RuleCall cVersionParserRuleCall_2 = (RuleCall)cGroup.eContents().get(2);
		private final Keyword cRightParenthesisKeyword_3 = (Keyword)cGroup.eContents().get(3);
		
		//VersionedQualifiedName:
		//	QualifiedName '(' Version ')';
		@Override public ParserRule getRule() { return rule; }
		
		//QualifiedName '(' Version ')'
		public Group getGroup() { return cGroup; }
		
		//QualifiedName
		public RuleCall getQualifiedNameParserRuleCall_0() { return cQualifiedNameParserRuleCall_0; }
		
		//'('
		public Keyword getLeftParenthesisKeyword_1() { return cLeftParenthesisKeyword_1; }
		
		//Version
		public RuleCall getVersionParserRuleCall_2() { return cVersionParserRuleCall_2; }
		
		//')'
		public Keyword getRightParenthesisKeyword_3() { return cRightParenthesisKeyword_3; }
	}
	public class VersionedQualifiedReferenceNameElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.micobs.svm.lang.sss.SSS.VersionedQualifiedReferenceName");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Group cGroup_0 = (Group)cGroup.eContents().get(0);
		private final RuleCall cVersionedQualifiedNameParserRuleCall_0_0 = (RuleCall)cGroup_0.eContents().get(0);
		private final Keyword cColonColonKeyword_0_1 = (Keyword)cGroup_0.eContents().get(1);
		private final RuleCall cIDTerminalRuleCall_1 = (RuleCall)cGroup.eContents().get(1);
		private final Group cGroup_2 = (Group)cGroup.eContents().get(2);
		private final Keyword cColonColonKeyword_2_0 = (Keyword)cGroup_2.eContents().get(0);
		private final RuleCall cIDTerminalRuleCall_2_1 = (RuleCall)cGroup_2.eContents().get(1);
		
		//VersionedQualifiedReferenceName:
		//	(VersionedQualifiedName '::')? ID ('::' ID)*;
		@Override public ParserRule getRule() { return rule; }
		
		//(VersionedQualifiedName '::')? ID ('::' ID)*
		public Group getGroup() { return cGroup; }
		
		//(VersionedQualifiedName '::')?
		public Group getGroup_0() { return cGroup_0; }
		
		//VersionedQualifiedName
		public RuleCall getVersionedQualifiedNameParserRuleCall_0_0() { return cVersionedQualifiedNameParserRuleCall_0_0; }
		
		//'::'
		public Keyword getColonColonKeyword_0_1() { return cColonColonKeyword_0_1; }
		
		//ID
		public RuleCall getIDTerminalRuleCall_1() { return cIDTerminalRuleCall_1; }
		
		//('::' ID)*
		public Group getGroup_2() { return cGroup_2; }
		
		//'::'
		public Keyword getColonColonKeyword_2_0() { return cColonColonKeyword_2_0; }
		
		//ID
		public RuleCall getIDTerminalRuleCall_2_1() { return cIDTerminalRuleCall_2_1; }
	}
	public class INTEGERElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.micobs.svm.lang.sss.SSS.INTEGER");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final Group cGroup_0 = (Group)cAlternatives.eContents().get(0);
		private final Keyword cHyphenMinusKeyword_0_0 = (Keyword)cGroup_0.eContents().get(0);
		private final RuleCall cINTTerminalRuleCall_0_1 = (RuleCall)cGroup_0.eContents().get(1);
		private final RuleCall cHEXADECIMALTerminalRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		
		//INTEGER:
		//	'-'? INT | HEXADECIMAL;
		@Override public ParserRule getRule() { return rule; }
		
		//'-'? INT | HEXADECIMAL
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//'-'? INT
		public Group getGroup_0() { return cGroup_0; }
		
		//'-'?
		public Keyword getHyphenMinusKeyword_0_0() { return cHyphenMinusKeyword_0_0; }
		
		//INT
		public RuleCall getINTTerminalRuleCall_0_1() { return cINTTerminalRuleCall_0_1; }
		
		//HEXADECIMAL
		public RuleCall getHEXADECIMALTerminalRuleCall_1() { return cHEXADECIMALTerminalRuleCall_1; }
	}
	public class EBooleanElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.micobs.svm.lang.sss.SSS.EBoolean");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final Keyword cTrueKeyword_0 = (Keyword)cAlternatives.eContents().get(0);
		private final Keyword cFalseKeyword_1 = (Keyword)cAlternatives.eContents().get(1);
		
		//EBoolean ecore::EBoolean:
		//	'true' | 'false'
		@Override public ParserRule getRule() { return rule; }
		
		//'true' | 'false'
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//'true'
		public Keyword getTrueKeyword_0() { return cTrueKeyword_0; }
		
		//'false'
		public Keyword getFalseKeyword_1() { return cFalseKeyword_1; }
	}
	public class REALElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.micobs.svm.lang.sss.SSS.REAL");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cHyphenMinusKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Group cGroup_1 = (Group)cGroup.eContents().get(1);
		private final RuleCall cINTTerminalRuleCall_1_0 = (RuleCall)cGroup_1.eContents().get(0);
		private final Keyword cFullStopKeyword_1_1 = (Keyword)cGroup_1.eContents().get(1);
		private final Keyword cColonEqualsSignKeyword_1_2 = (Keyword)cGroup_1.eContents().get(2);
		private final RuleCall cINTTerminalRuleCall_1_3 = (RuleCall)cGroup_1.eContents().get(3);
		private final Group cGroup_2 = (Group)cGroup.eContents().get(2);
		private final Keyword cEKeyword_2_0 = (Keyword)cGroup_2.eContents().get(0);
		private final Keyword cHyphenMinusKeyword_2_1 = (Keyword)cGroup_2.eContents().get(1);
		private final RuleCall cINTTerminalRuleCall_2_2 = (RuleCall)cGroup_2.eContents().get(2);
		
		//REAL:
		//	'-'? (INT '.' ':=' INT) ('e' '-'? INT)?;
		@Override public ParserRule getRule() { return rule; }
		
		//'-'? (INT '.' ':=' INT) ('e' '-'? INT)?
		public Group getGroup() { return cGroup; }
		
		//'-'?
		public Keyword getHyphenMinusKeyword_0() { return cHyphenMinusKeyword_0; }
		
		//(INT '.' ':=' INT)
		public Group getGroup_1() { return cGroup_1; }
		
		//INT
		public RuleCall getINTTerminalRuleCall_1_0() { return cINTTerminalRuleCall_1_0; }
		
		//'.'
		public Keyword getFullStopKeyword_1_1() { return cFullStopKeyword_1_1; }
		
		//':='
		public Keyword getColonEqualsSignKeyword_1_2() { return cColonEqualsSignKeyword_1_2; }
		
		//INT
		public RuleCall getINTTerminalRuleCall_1_3() { return cINTTerminalRuleCall_1_3; }
		
		//('e' '-'? INT)?
		public Group getGroup_2() { return cGroup_2; }
		
		//'e'
		public Keyword getEKeyword_2_0() { return cEKeyword_2_0; }
		
		//'-'?
		public Keyword getHyphenMinusKeyword_2_1() { return cHyphenMinusKeyword_2_1; }
		
		//INT
		public RuleCall getINTTerminalRuleCall_2_2() { return cINTTerminalRuleCall_2_2; }
	}
	
	public class DRunFormatEnableDisableElements extends AbstractEnumRuleElementFinder {
		private final EnumRule rule = (EnumRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.micobs.svm.lang.sss.SSS.DRunFormatEnableDisable");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final EnumLiteralDeclaration cDisabledEnumLiteralDeclaration_0 = (EnumLiteralDeclaration)cAlternatives.eContents().get(0);
		private final Keyword cDisabledDisabledKeyword_0_0 = (Keyword)cDisabledEnumLiteralDeclaration_0.eContents().get(0);
		private final EnumLiteralDeclaration cEnabledEnumLiteralDeclaration_1 = (EnumLiteralDeclaration)cAlternatives.eContents().get(1);
		private final Keyword cEnabledEnabledKeyword_1_0 = (Keyword)cEnabledEnumLiteralDeclaration_1.eContents().get(0);
		
		//enum DRunFormatEnableDisable returns doc::DRunFormatEnableDisable:
		//	disabled | enabled;
		public EnumRule getRule() { return rule; }
		
		//disabled | enabled
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//disabled
		public EnumLiteralDeclaration getDisabledEnumLiteralDeclaration_0() { return cDisabledEnumLiteralDeclaration_0; }
		
		//'disabled'
		public Keyword getDisabledDisabledKeyword_0_0() { return cDisabledDisabledKeyword_0_0; }
		
		//enabled
		public EnumLiteralDeclaration getEnabledEnumLiteralDeclaration_1() { return cEnabledEnumLiteralDeclaration_1; }
		
		//'enabled'
		public Keyword getEnabledEnabledKeyword_1_0() { return cEnabledEnabledKeyword_1_0; }
	}
	public class VVerificationMethodElements extends AbstractEnumRuleElementFinder {
		private final EnumRule rule = (EnumRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.micobs.svm.lang.sss.SSS.VVerificationMethod");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final EnumLiteralDeclaration cAnalysisEnumLiteralDeclaration_0 = (EnumLiteralDeclaration)cAlternatives.eContents().get(0);
		private final Keyword cAnalysisAnalysisKeyword_0_0 = (Keyword)cAnalysisEnumLiteralDeclaration_0.eContents().get(0);
		private final EnumLiteralDeclaration cInspectionEnumLiteralDeclaration_1 = (EnumLiteralDeclaration)cAlternatives.eContents().get(1);
		private final Keyword cInspectionInspectionKeyword_1_0 = (Keyword)cInspectionEnumLiteralDeclaration_1.eContents().get(0);
		private final EnumLiteralDeclaration cTestingEnumLiteralDeclaration_2 = (EnumLiteralDeclaration)cAlternatives.eContents().get(2);
		private final Keyword cTestingTestingKeyword_2_0 = (Keyword)cTestingEnumLiteralDeclaration_2.eContents().get(0);
		private final EnumLiteralDeclaration cReviewEnumLiteralDeclaration_3 = (EnumLiteralDeclaration)cAlternatives.eContents().get(3);
		private final Keyword cReviewReviewKeyword_3_0 = (Keyword)cReviewEnumLiteralDeclaration_3.eContents().get(0);
		private final EnumLiteralDeclaration cModelSimulationEnumLiteralDeclaration_4 = (EnumLiteralDeclaration)cAlternatives.eContents().get(4);
		private final Keyword cModelSimulationModelSimulationKeyword_4_0 = (Keyword)cModelSimulationEnumLiteralDeclaration_4.eContents().get(0);
		private final EnumLiteralDeclaration cWalkThroughEnumLiteralDeclaration_5 = (EnumLiteralDeclaration)cAlternatives.eContents().get(5);
		private final Keyword cWalkThroughWalkThroughKeyword_5_0 = (Keyword)cWalkThroughEnumLiteralDeclaration_5.eContents().get(0);
		private final EnumLiteralDeclaration cCrossReadingEnumLiteralDeclaration_6 = (EnumLiteralDeclaration)cAlternatives.eContents().get(6);
		private final Keyword cCrossReadingCrossReadingKeyword_6_0 = (Keyword)cCrossReadingEnumLiteralDeclaration_6.eContents().get(0);
		private final EnumLiteralDeclaration cDeskCheckingEnumLiteralDeclaration_7 = (EnumLiteralDeclaration)cAlternatives.eContents().get(7);
		private final Keyword cDeskCheckingDeskCheckingKeyword_7_0 = (Keyword)cDeskCheckingEnumLiteralDeclaration_7.eContents().get(0);
		
		//enum VVerificationMethod returns tdm::VVerificationMethod:
		//	Analysis | Inspection | Testing | Review | ModelSimulation | WalkThrough | CrossReading | DeskChecking;
		public EnumRule getRule() { return rule; }
		
		//Analysis | Inspection | Testing | Review | ModelSimulation | WalkThrough | CrossReading | DeskChecking
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//Analysis
		public EnumLiteralDeclaration getAnalysisEnumLiteralDeclaration_0() { return cAnalysisEnumLiteralDeclaration_0; }
		
		//'Analysis'
		public Keyword getAnalysisAnalysisKeyword_0_0() { return cAnalysisAnalysisKeyword_0_0; }
		
		//Inspection
		public EnumLiteralDeclaration getInspectionEnumLiteralDeclaration_1() { return cInspectionEnumLiteralDeclaration_1; }
		
		//'Inspection'
		public Keyword getInspectionInspectionKeyword_1_0() { return cInspectionInspectionKeyword_1_0; }
		
		//Testing
		public EnumLiteralDeclaration getTestingEnumLiteralDeclaration_2() { return cTestingEnumLiteralDeclaration_2; }
		
		//'Testing'
		public Keyword getTestingTestingKeyword_2_0() { return cTestingTestingKeyword_2_0; }
		
		//Review
		public EnumLiteralDeclaration getReviewEnumLiteralDeclaration_3() { return cReviewEnumLiteralDeclaration_3; }
		
		//'Review'
		public Keyword getReviewReviewKeyword_3_0() { return cReviewReviewKeyword_3_0; }
		
		//ModelSimulation
		public EnumLiteralDeclaration getModelSimulationEnumLiteralDeclaration_4() { return cModelSimulationEnumLiteralDeclaration_4; }
		
		//'ModelSimulation'
		public Keyword getModelSimulationModelSimulationKeyword_4_0() { return cModelSimulationModelSimulationKeyword_4_0; }
		
		//WalkThrough
		public EnumLiteralDeclaration getWalkThroughEnumLiteralDeclaration_5() { return cWalkThroughEnumLiteralDeclaration_5; }
		
		//'WalkThrough'
		public Keyword getWalkThroughWalkThroughKeyword_5_0() { return cWalkThroughWalkThroughKeyword_5_0; }
		
		//CrossReading
		public EnumLiteralDeclaration getCrossReadingEnumLiteralDeclaration_6() { return cCrossReadingEnumLiteralDeclaration_6; }
		
		//'CrossReading'
		public Keyword getCrossReadingCrossReadingKeyword_6_0() { return cCrossReadingCrossReadingKeyword_6_0; }
		
		//DeskChecking
		public EnumLiteralDeclaration getDeskCheckingEnumLiteralDeclaration_7() { return cDeskCheckingEnumLiteralDeclaration_7; }
		
		//'DeskChecking'
		public Keyword getDeskCheckingDeskCheckingKeyword_7_0() { return cDeskCheckingDeskCheckingKeyword_7_0; }
	}
	
	private final VSSSDocumentElements pVSSSDocument;
	private final DBodyElements pDBody;
	private final DBodyContentElements pDBodyContent;
	private final DParagraphContentElements pDParagraphContent;
	private final DReferenceableObjectElements pDReferenceableObject;
	private final DListContentElements pDListContent;
	private final EStringElements pEString;
	private final VSSSIntroductionElements pVSSSIntroduction;
	private final VSSSApplicableDocumentsElements pVSSSApplicableDocuments;
	private final VSSSReferenceDocumentsElements pVSSSReferenceDocuments;
	private final VSSSTermsDefinitionsAbbreviationsElements pVSSSTermsDefinitionsAbbreviations;
	private final VSSSGeneralDescriptionElements pVSSSGeneralDescription;
	private final VSSSSpecificRequirementsElements pVSSSSpecificRequirements;
	private final VSSSVerificationValidationIntegrationRequirementsElements pVSSSVerificationValidationIntegrationRequirements;
	private final VSSSSystemModelsElements pVSSSSystemModels;
	private final DBody_ImplElements pDBody_Impl;
	private final DCellElements pDCell;
	private final DParagraphElements pDParagraph;
	private final DItemizeElements pDItemize;
	private final DEnumerateElements pDEnumerate;
	private final DRowElements pDRow;
	private final DColumnElements pDColumn;
	private final DRunElements pDRun;
	private final DHyperlinkElements pDHyperlink;
	private final DTextElements pDText;
	private final DRunFormatEnableDisableElements eDRunFormatEnableDisable;
	private final DReferenceableObject_ImplElements pDReferenceableObject_Impl;
	private final DApplicableDocumentElements pDApplicableDocument;
	private final DReferenceDocumentElements pDReferenceDocument;
	private final DListItemElements pDListItem;
	private final VSSSTermElements pVSSSTerm;
	private final VSSSDefinitionElements pVSSSDefinition;
	private final VSSSAbbreviationElements pVSSSAbbreviation;
	private final VSSSGeneralDescriptionSubsectionElements pVSSSGeneralDescriptionSubsection;
	private final VSSSGeneralRequirementElements pVSSSGeneralRequirement;
	private final VSSSCapabilitiesRequirementElements pVSSSCapabilitiesRequirement;
	private final VSSSSystemInterfaceRequirementElements pVSSSSystemInterfaceRequirement;
	private final VSSSAdaptationMissionizationRequirementElements pVSSSAdaptationMissionizationRequirement;
	private final VSSSComputerResourceRequirementElements pVSSSComputerResourceRequirement;
	private final VSSSSecurityRequirementElements pVSSSSecurityRequirement;
	private final VSSSSafetyRequirementElements pVSSSSafetyRequirement;
	private final VSSSReliabiltyAvailabilityRequirementElements pVSSSReliabiltyAvailabilityRequirement;
	private final VSSSQualityRequirementElements pVSSSQualityRequirement;
	private final VSSSDesignRequirementElements pVSSSDesignRequirement;
	private final VSSSSoftwareOperationsRequirementElements pVSSSSoftwareOperationsRequirement;
	private final VSSSSoftwareMaintenanceRequirementElements pVSSSSoftwareMaintenanceRequirement;
	private final VSSSSystemSoftwareObservabilityRequirementElements pVSSSSystemSoftwareObservabilityRequirement;
	private final VSSSDocumentItemElements pVSSSDocumentItem;
	private final VVerificationMethodElements eVVerificationMethod;
	private final VSSSVerificationValidationProcessRequirementElements pVSSSVerificationValidationProcessRequirement;
	private final VSSSValidationApproachElements pVSSSValidationApproach;
	private final VSSSValidationRequirementElements pVSSSValidationRequirement;
	private final VSSSVerificationRequirementElements pVSSSVerificationRequirement;
	private final VSSSSystemModelElements pVSSSSystemModel;
	private final QualifiedNameElements pQualifiedName;
	private final VersionElements pVersion;
	private final VersionedQualifiedNameElements pVersionedQualifiedName;
	private final VersionedQualifiedReferenceNameElements pVersionedQualifiedReferenceName;
	private final TerminalRule tHEXADECIMAL;
	private final INTEGERElements pINTEGER;
	private final EBooleanElements pEBoolean;
	private final REALElements pREAL;
	
	private final Grammar grammar;
	
	private final TerminalsGrammarAccess gaTerminals;

	@Inject
	public SSSGrammarAccess(GrammarProvider grammarProvider,
			TerminalsGrammarAccess gaTerminals) {
		this.grammar = internalFindGrammar(grammarProvider);
		this.gaTerminals = gaTerminals;
		this.pVSSSDocument = new VSSSDocumentElements();
		this.pDBody = new DBodyElements();
		this.pDBodyContent = new DBodyContentElements();
		this.pDParagraphContent = new DParagraphContentElements();
		this.pDReferenceableObject = new DReferenceableObjectElements();
		this.pDListContent = new DListContentElements();
		this.pEString = new EStringElements();
		this.pVSSSIntroduction = new VSSSIntroductionElements();
		this.pVSSSApplicableDocuments = new VSSSApplicableDocumentsElements();
		this.pVSSSReferenceDocuments = new VSSSReferenceDocumentsElements();
		this.pVSSSTermsDefinitionsAbbreviations = new VSSSTermsDefinitionsAbbreviationsElements();
		this.pVSSSGeneralDescription = new VSSSGeneralDescriptionElements();
		this.pVSSSSpecificRequirements = new VSSSSpecificRequirementsElements();
		this.pVSSSVerificationValidationIntegrationRequirements = new VSSSVerificationValidationIntegrationRequirementsElements();
		this.pVSSSSystemModels = new VSSSSystemModelsElements();
		this.pDBody_Impl = new DBody_ImplElements();
		this.pDCell = new DCellElements();
		this.pDParagraph = new DParagraphElements();
		this.pDItemize = new DItemizeElements();
		this.pDEnumerate = new DEnumerateElements();
		this.pDRow = new DRowElements();
		this.pDColumn = new DColumnElements();
		this.pDRun = new DRunElements();
		this.pDHyperlink = new DHyperlinkElements();
		this.pDText = new DTextElements();
		this.eDRunFormatEnableDisable = new DRunFormatEnableDisableElements();
		this.pDReferenceableObject_Impl = new DReferenceableObject_ImplElements();
		this.pDApplicableDocument = new DApplicableDocumentElements();
		this.pDReferenceDocument = new DReferenceDocumentElements();
		this.pDListItem = new DListItemElements();
		this.pVSSSTerm = new VSSSTermElements();
		this.pVSSSDefinition = new VSSSDefinitionElements();
		this.pVSSSAbbreviation = new VSSSAbbreviationElements();
		this.pVSSSGeneralDescriptionSubsection = new VSSSGeneralDescriptionSubsectionElements();
		this.pVSSSGeneralRequirement = new VSSSGeneralRequirementElements();
		this.pVSSSCapabilitiesRequirement = new VSSSCapabilitiesRequirementElements();
		this.pVSSSSystemInterfaceRequirement = new VSSSSystemInterfaceRequirementElements();
		this.pVSSSAdaptationMissionizationRequirement = new VSSSAdaptationMissionizationRequirementElements();
		this.pVSSSComputerResourceRequirement = new VSSSComputerResourceRequirementElements();
		this.pVSSSSecurityRequirement = new VSSSSecurityRequirementElements();
		this.pVSSSSafetyRequirement = new VSSSSafetyRequirementElements();
		this.pVSSSReliabiltyAvailabilityRequirement = new VSSSReliabiltyAvailabilityRequirementElements();
		this.pVSSSQualityRequirement = new VSSSQualityRequirementElements();
		this.pVSSSDesignRequirement = new VSSSDesignRequirementElements();
		this.pVSSSSoftwareOperationsRequirement = new VSSSSoftwareOperationsRequirementElements();
		this.pVSSSSoftwareMaintenanceRequirement = new VSSSSoftwareMaintenanceRequirementElements();
		this.pVSSSSystemSoftwareObservabilityRequirement = new VSSSSystemSoftwareObservabilityRequirementElements();
		this.pVSSSDocumentItem = new VSSSDocumentItemElements();
		this.eVVerificationMethod = new VVerificationMethodElements();
		this.pVSSSVerificationValidationProcessRequirement = new VSSSVerificationValidationProcessRequirementElements();
		this.pVSSSValidationApproach = new VSSSValidationApproachElements();
		this.pVSSSValidationRequirement = new VSSSValidationRequirementElements();
		this.pVSSSVerificationRequirement = new VSSSVerificationRequirementElements();
		this.pVSSSSystemModel = new VSSSSystemModelElements();
		this.pQualifiedName = new QualifiedNameElements();
		this.pVersion = new VersionElements();
		this.pVersionedQualifiedName = new VersionedQualifiedNameElements();
		this.pVersionedQualifiedReferenceName = new VersionedQualifiedReferenceNameElements();
		this.tHEXADECIMAL = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.micobs.svm.lang.sss.SSS.HEXADECIMAL");
		this.pINTEGER = new INTEGERElements();
		this.pEBoolean = new EBooleanElements();
		this.pREAL = new REALElements();
	}
	
	protected Grammar internalFindGrammar(GrammarProvider grammarProvider) {
		Grammar grammar = grammarProvider.getGrammar(this);
		while (grammar != null) {
			if ("es.uah.aut.srg.micobs.svm.lang.sss.SSS".equals(grammar.getName())) {
				return grammar;
			}
			List<Grammar> grammars = grammar.getUsedGrammars();
			if (!grammars.isEmpty()) {
				grammar = grammars.iterator().next();
			} else {
				return null;
			}
		}
		return grammar;
	}
	
	@Override
	public Grammar getGrammar() {
		return grammar;
	}
	
	
	public TerminalsGrammarAccess getTerminalsGrammarAccess() {
		return gaTerminals;
	}

	
	//VSSSDocument:
	//	'VSSSDocument'
	//	name=EString
	//	'{'
	//	'id' id=EString
	//	'issue' issue=EString
	//	'revision' revision=EString
	//	'date' date=EString ('parents' '(' parents+=[tdm::VTraceableDocument|EString] (","
	//	parents+=[tdm::VTraceableDocument|EString])* ')')?
	//	'introductionSection' introductionSection=VSSSIntroduction
	//	'applicableDocumentsSection' applicableDocumentsSection=VSSSApplicableDocuments
	//	'referenceDocumentsSection' referenceDocumentsSection=VSSSReferenceDocuments
	//	'termsDefinitionsAbbreviationsSection' termsDefinitionsAbbreviationsSection=VSSSTermsDefinitionsAbbreviations
	//	'generalDescriptionSection' generalDescriptionSection=VSSSGeneralDescription
	//	'specificRequirementsSection' specificRequirementsSection=VSSSSpecificRequirements
	//	'verificationValidationIntegrationSection'
	//	verificationValidationIntegrationSection=VSSSVerificationValidationIntegrationRequirements ('systemModelsSection'
	//	systemModelsSection=VSSSSystemModels)?
	//	'}';
	public VSSSDocumentElements getVSSSDocumentAccess() {
		return pVSSSDocument;
	}
	
	public ParserRule getVSSSDocumentRule() {
		return getVSSSDocumentAccess().getRule();
	}
	
	//DBody doc::DBody:
	//	DBody_Impl | DCell
	public DBodyElements getDBodyAccess() {
		return pDBody;
	}
	
	public ParserRule getDBodyRule() {
		return getDBodyAccess().getRule();
	}
	
	//DBodyContent doc::DBodyContent:
	//	DParagraph | DItemize | DEnumerate
	public DBodyContentElements getDBodyContentAccess() {
		return pDBodyContent;
	}
	
	public ParserRule getDBodyContentRule() {
		return getDBodyContentAccess().getRule();
	}
	
	//DParagraphContent doc::DParagraphContent:
	//	DRun | DHyperlink
	public DParagraphContentElements getDParagraphContentAccess() {
		return pDParagraphContent;
	}
	
	public ParserRule getDParagraphContentRule() {
		return getDParagraphContentAccess().getRule();
	}
	
	//DReferenceableObject doc::DReferenceableObject:
	//	DReferenceableObject_Impl | DApplicableDocument | DReferenceDocument
	public DReferenceableObjectElements getDReferenceableObjectAccess() {
		return pDReferenceableObject;
	}
	
	public ParserRule getDReferenceableObjectRule() {
		return getDReferenceableObjectAccess().getRule();
	}
	
	//DListContent doc::DListContent:
	//	DItemize | DEnumerate
	public DListContentElements getDListContentAccess() {
		return pDListContent;
	}
	
	public ParserRule getDListContentRule() {
		return getDListContentAccess().getRule();
	}
	
	//EString:
	//	STRING | ID;
	public EStringElements getEStringAccess() {
		return pEString;
	}
	
	public ParserRule getEStringRule() {
		return getEStringAccess().getRule();
	}
	
	//VSSSIntroduction:
	//	'VSSSIntroduction'
	//	'{'
	//	'purpose' purpose=DBody
	//	'objetive' objetive=DBody
	//	'content' content=DBody
	//	'reason' reason=DBody
	//	'}';
	public VSSSIntroductionElements getVSSSIntroductionAccess() {
		return pVSSSIntroduction;
	}
	
	public ParserRule getVSSSIntroductionRule() {
		return getVSSSIntroductionAccess().getRule();
	}
	
	//VSSSApplicableDocuments:
	//	{VSSSApplicableDocuments}
	//	'VSSSApplicableDocuments'
	//	'{' ('applicableDocuments' '{' applicableDocuments+=DApplicableDocument (","
	//	applicableDocuments+=DApplicableDocument)* '}')?
	//	'}';
	public VSSSApplicableDocumentsElements getVSSSApplicableDocumentsAccess() {
		return pVSSSApplicableDocuments;
	}
	
	public ParserRule getVSSSApplicableDocumentsRule() {
		return getVSSSApplicableDocumentsAccess().getRule();
	}
	
	//VSSSReferenceDocuments:
	//	{VSSSReferenceDocuments}
	//	'VSSSReferenceDocuments'
	//	'{' ('referenceDocuments' '{' referenceDocuments+=DReferenceDocument ("," referenceDocuments+=DReferenceDocument)*
	//	'}')?
	//	'}';
	public VSSSReferenceDocumentsElements getVSSSReferenceDocumentsAccess() {
		return pVSSSReferenceDocuments;
	}
	
	public ParserRule getVSSSReferenceDocumentsRule() {
		return getVSSSReferenceDocumentsAccess().getRule();
	}
	
	//VSSSTermsDefinitionsAbbreviations:
	//	{VSSSTermsDefinitionsAbbreviations}
	//	'VSSSTermsDefinitionsAbbreviations'
	//	'{' ('terms' '{' terms+=VSSSTerm ("," terms+=VSSSTerm)* '}')? ('definitions' '{' definitions+=VSSSDefinition (","
	//	definitions+=VSSSDefinition)* '}')? ('abbreviations' '{' abbreviations+=VSSSAbbreviation (","
	//	abbreviations+=VSSSAbbreviation)* '}')?
	//	'}';
	public VSSSTermsDefinitionsAbbreviationsElements getVSSSTermsDefinitionsAbbreviationsAccess() {
		return pVSSSTermsDefinitionsAbbreviations;
	}
	
	public ParserRule getVSSSTermsDefinitionsAbbreviationsRule() {
		return getVSSSTermsDefinitionsAbbreviationsAccess().getRule();
	}
	
	//VSSSGeneralDescription:
	//	'VSSSGeneralDescription'
	//	'{'
	//	'productPerspective' productPerspective=VSSSGeneralDescriptionSubsection
	//	'generalCapabilites' generalCapabilites=VSSSGeneralDescriptionSubsection
	//	'generalConstraints' generalConstraints=VSSSGeneralDescriptionSubsection
	//	'operationalEnvironment' operationalEnvironment=VSSSGeneralDescriptionSubsection
	//	'assumptionsDependencies' assumptionsDependencies=VSSSGeneralDescriptionSubsection
	//	'}';
	public VSSSGeneralDescriptionElements getVSSSGeneralDescriptionAccess() {
		return pVSSSGeneralDescription;
	}
	
	public ParserRule getVSSSGeneralDescriptionRule() {
		return getVSSSGeneralDescriptionAccess().getRule();
	}
	
	//VSSSSpecificRequirements:
	//	{VSSSSpecificRequirements}
	//	'VSSSSpecificRequirements'
	//	'{' ('general' '{' general+=VSSSGeneralRequirement ("," general+=VSSSGeneralRequirement)* '}')? ('capabilities' '{'
	//	capabilities+=VSSSCapabilitiesRequirement ("," capabilities+=VSSSCapabilitiesRequirement)* '}')? ('systemInterface'
	//	'{' systemInterface+=VSSSSystemInterfaceRequirement ("," systemInterface+=VSSSSystemInterfaceRequirement)* '}')?
	//	('adaptationMissionization' '{' adaptationMissionization+=VSSSAdaptationMissionizationRequirement (","
	//	adaptationMissionization+=VSSSAdaptationMissionizationRequirement)* '}')? ('computerResource' '{'
	//	computerResource+=VSSSComputerResourceRequirement ("," computerResource+=VSSSComputerResourceRequirement)* '}')?
	//	('security' '{' security+=VSSSSecurityRequirement ("," security+=VSSSSecurityRequirement)* '}')? ('safety' '{'
	//	safety+=VSSSSafetyRequirement ("," safety+=VSSSSafetyRequirement)* '}')? ('reliabiltyAvailability' '{'
	//	reliabiltyAvailability+=VSSSReliabiltyAvailabilityRequirement (","
	//	reliabiltyAvailability+=VSSSReliabiltyAvailabilityRequirement)* '}')? ('quality' '{' quality+=VSSSQualityRequirement
	//	("," quality+=VSSSQualityRequirement)* '}')? ('design' '{' design+=VSSSDesignRequirement (","
	//	design+=VSSSDesignRequirement)* '}')? ('softwareOperations' '{' softwareOperations+=VSSSSoftwareOperationsRequirement
	//	("," softwareOperations+=VSSSSoftwareOperationsRequirement)* '}')? ('softwareMaintenance' '{'
	//	softwareMaintenance+=VSSSSoftwareMaintenanceRequirement (","
	//	softwareMaintenance+=VSSSSoftwareMaintenanceRequirement)* '}')? ('systemSoftwareObservability' '{'
	//	systemSoftwareObservability+=VSSSSystemSoftwareObservabilityRequirement (","
	//	systemSoftwareObservability+=VSSSSystemSoftwareObservabilityRequirement)* '}')?
	//	'}';
	public VSSSSpecificRequirementsElements getVSSSSpecificRequirementsAccess() {
		return pVSSSSpecificRequirements;
	}
	
	public ParserRule getVSSSSpecificRequirementsRule() {
		return getVSSSSpecificRequirementsAccess().getRule();
	}
	
	//VSSSVerificationValidationIntegrationRequirements:
	//	{VSSSVerificationValidationIntegrationRequirements}
	//	'VSSSVerificationValidationIntegrationRequirements'
	//	'{' ('verificationValidationProcess' '{' verificationValidationProcess+=VSSSVerificationValidationProcessRequirement
	//	("," verificationValidationProcess+=VSSSVerificationValidationProcessRequirement)* '}')? ('validationApproach' '{'
	//	validationApproach+=VSSSValidationApproach ("," validationApproach+=VSSSValidationApproach)* '}')? ('validation' '{'
	//	validation+=VSSSValidationRequirement ("," validation+=VSSSValidationRequirement)* '}')? ('verification' '{'
	//	verification+=VSSSVerificationRequirement ("," verification+=VSSSVerificationRequirement)* '}')?
	//	'}';
	public VSSSVerificationValidationIntegrationRequirementsElements getVSSSVerificationValidationIntegrationRequirementsAccess() {
		return pVSSSVerificationValidationIntegrationRequirements;
	}
	
	public ParserRule getVSSSVerificationValidationIntegrationRequirementsRule() {
		return getVSSSVerificationValidationIntegrationRequirementsAccess().getRule();
	}
	
	//VSSSSystemModels:
	//	'VSSSSystemModels'
	//	'{'
	//	'systemModels' '{' systemModels+=VSSSSystemModel ("," systemModels+=VSSSSystemModel)* '}'
	//	'}';
	public VSSSSystemModelsElements getVSSSSystemModelsAccess() {
		return pVSSSSystemModels;
	}
	
	public ParserRule getVSSSSystemModelsRule() {
		return getVSSSSystemModelsAccess().getRule();
	}
	
	//DBody_Impl doc::DBody:
	//	'DBody'
	//	'{'
	//	'bodyContent' '{' bodyContent+=DBodyContent ("," bodyContent+=DBodyContent)* '}'
	//	'}'
	public DBody_ImplElements getDBody_ImplAccess() {
		return pDBody_Impl;
	}
	
	public ParserRule getDBody_ImplRule() {
		return getDBody_ImplAccess().getRule();
	}
	
	//DCell doc::DCell:
	//	'DCell'
	//	'{'
	//	'bodyContent' '{' bodyContent+=DBodyContent ("," bodyContent+=DBodyContent)* '}'
	//	'}'
	public DCellElements getDCellAccess() {
		return pDCell;
	}
	
	public ParserRule getDCellRule() {
		return getDCellAccess().getRule();
	}
	
	//DParagraph doc::DParagraph:
	//	'DParagraph'
	//	'{'
	//	'paragraphContent' '{' paragraphContent+=DParagraphContent ("," paragraphContent+=DParagraphContent)* '}'
	//	'}'
	public DParagraphElements getDParagraphAccess() {
		return pDParagraph;
	}
	
	public ParserRule getDParagraphRule() {
		return getDParagraphAccess().getRule();
	}
	
	//DItemize doc::DItemize:
	//	'DItemize'
	//	'{'
	//	'items' '{' items+=DListItem ("," items+=DListItem)* '}'
	//	'}'
	public DItemizeElements getDItemizeAccess() {
		return pDItemize;
	}
	
	public ParserRule getDItemizeRule() {
		return getDItemizeAccess().getRule();
	}
	
	//DEnumerate doc::DEnumerate:
	//	'DEnumerate'
	//	'{'
	//	'items' '{' items+=DListItem ("," items+=DListItem)* '}'
	//	'}'
	public DEnumerateElements getDEnumerateAccess() {
		return pDEnumerate;
	}
	
	public ParserRule getDEnumerateRule() {
		return getDEnumerateAccess().getRule();
	}
	
	//DRow doc::DRow:
	//	'DRow'
	//	'{'
	//	'span' span=EString
	//	'columns' '{' columns+=DColumn ("," columns+=DColumn)* '}'
	//	'}'
	public DRowElements getDRowAccess() {
		return pDRow;
	}
	
	public ParserRule getDRowRule() {
		return getDRowAccess().getRule();
	}
	
	//DColumn doc::DColumn:
	//	'DColumn'
	//	'{'
	//	'span' span=EString
	//	'cells' '{' cells+=DCell ("," cells+=DCell)* '}'
	//	'}'
	public DColumnElements getDColumnAccess() {
		return pDColumn;
	}
	
	public ParserRule getDColumnRule() {
		return getDColumnAccess().getRule();
	}
	
	//DRun doc::DRun:
	//	'DRun'
	//	'{'
	//	'bold' bold=DRunFormatEnableDisable
	//	'italic' italic=DRunFormatEnableDisable
	//	'underscore' underscore=DRunFormatEnableDisable
	//	'text' text=DText
	//	'}'
	public DRunElements getDRunAccess() {
		return pDRun;
	}
	
	public ParserRule getDRunRule() {
		return getDRunAccess().getRule();
	}
	
	//DHyperlink doc::DHyperlink:
	//	'DHyperlink'
	//	'{'
	//	'reference' reference=[doc::DReferenceableObject|EString]
	//	'run' run=DRun
	//	'}'
	public DHyperlinkElements getDHyperlinkAccess() {
		return pDHyperlink;
	}
	
	public ParserRule getDHyperlinkRule() {
		return getDHyperlinkAccess().getRule();
	}
	
	//DText doc::DText:
	//	'DText'
	//	'{'
	//	'content' content=EString
	//	'}'
	public DTextElements getDTextAccess() {
		return pDText;
	}
	
	public ParserRule getDTextRule() {
		return getDTextAccess().getRule();
	}
	
	//enum DRunFormatEnableDisable returns doc::DRunFormatEnableDisable:
	//	disabled | enabled;
	public DRunFormatEnableDisableElements getDRunFormatEnableDisableAccess() {
		return eDRunFormatEnableDisable;
	}
	
	public EnumRule getDRunFormatEnableDisableRule() {
		return getDRunFormatEnableDisableAccess().getRule();
	}
	
	//DReferenceableObject_Impl doc::DReferenceableObject:
	//	{doc::DReferenceableObject}
	//	'DReferenceableObject'
	public DReferenceableObject_ImplElements getDReferenceableObject_ImplAccess() {
		return pDReferenceableObject_Impl;
	}
	
	public ParserRule getDReferenceableObject_ImplRule() {
		return getDReferenceableObject_ImplAccess().getRule();
	}
	
	//DApplicableDocument doc::DApplicableDocument:
	//	'DApplicableDocument'
	//	'{'
	//	'title' title=EString
	//	'issue' issue=EString
	//	'revision' revision=EString
	//	'}'
	public DApplicableDocumentElements getDApplicableDocumentAccess() {
		return pDApplicableDocument;
	}
	
	public ParserRule getDApplicableDocumentRule() {
		return getDApplicableDocumentAccess().getRule();
	}
	
	//DReferenceDocument doc::DReferenceDocument:
	//	'DReferenceDocument'
	//	'{'
	//	'title' title=EString
	//	'issue' issue=EString
	//	'revision' revision=EString
	//	'}'
	public DReferenceDocumentElements getDReferenceDocumentAccess() {
		return pDReferenceDocument;
	}
	
	public ParserRule getDReferenceDocumentRule() {
		return getDReferenceDocumentAccess().getRule();
	}
	
	//DListItem doc::DListItem:
	//	'DListItem'
	//	'{'
	//	'paragraph' '{' paragraph+=DParagraph ("," paragraph+=DParagraph)* '}' ('sublist' sublist=DListContent)?
	//	'}'
	public DListItemElements getDListItemAccess() {
		return pDListItem;
	}
	
	public ParserRule getDListItemRule() {
		return getDListItemAccess().getRule();
	}
	
	//VSSSTerm:
	//	'VSSSTerm'
	//	name=EString
	//	'{'
	//	'description' description=[doc::DParagraph|EString]
	//	'}';
	public VSSSTermElements getVSSSTermAccess() {
		return pVSSSTerm;
	}
	
	public ParserRule getVSSSTermRule() {
		return getVSSSTermAccess().getRule();
	}
	
	//VSSSDefinition:
	//	'VSSSDefinition'
	//	name=EString
	//	'{'
	//	'description' description=[doc::DParagraph|EString]
	//	'}';
	public VSSSDefinitionElements getVSSSDefinitionAccess() {
		return pVSSSDefinition;
	}
	
	public ParserRule getVSSSDefinitionRule() {
		return getVSSSDefinitionAccess().getRule();
	}
	
	//VSSSAbbreviation:
	//	'VSSSAbbreviation'
	//	name=EString
	//	'{'
	//	'description' description=[doc::DParagraph|EString]
	//	'}';
	public VSSSAbbreviationElements getVSSSAbbreviationAccess() {
		return pVSSSAbbreviation;
	}
	
	public ParserRule getVSSSAbbreviationRule() {
		return getVSSSAbbreviationAccess().getRule();
	}
	
	//VSSSGeneralDescriptionSubsection:
	//	'VSSSGeneralDescriptionSubsection'
	//	'{'
	//	'body' body=[doc::DBody|EString]
	//	'}';
	public VSSSGeneralDescriptionSubsectionElements getVSSSGeneralDescriptionSubsectionAccess() {
		return pVSSSGeneralDescriptionSubsection;
	}
	
	public ParserRule getVSSSGeneralDescriptionSubsectionRule() {
		return getVSSSGeneralDescriptionSubsectionAccess().getRule();
	}
	
	//VSSSGeneralRequirement:
	//	'VSSSGeneralRequirement'
	//	'{'
	//	'sssItems' '{' sssItems+=VSSSDocumentItem ("," sssItems+=VSSSDocumentItem)* '}'
	//	'}';
	public VSSSGeneralRequirementElements getVSSSGeneralRequirementAccess() {
		return pVSSSGeneralRequirement;
	}
	
	public ParserRule getVSSSGeneralRequirementRule() {
		return getVSSSGeneralRequirementAccess().getRule();
	}
	
	//VSSSCapabilitiesRequirement:
	//	'VSSSCapabilitiesRequirement'
	//	'{'
	//	'sssItems' '{' sssItems+=VSSSDocumentItem ("," sssItems+=VSSSDocumentItem)* '}'
	//	'}';
	public VSSSCapabilitiesRequirementElements getVSSSCapabilitiesRequirementAccess() {
		return pVSSSCapabilitiesRequirement;
	}
	
	public ParserRule getVSSSCapabilitiesRequirementRule() {
		return getVSSSCapabilitiesRequirementAccess().getRule();
	}
	
	//VSSSSystemInterfaceRequirement:
	//	'VSSSSystemInterfaceRequirement'
	//	'{'
	//	'sssItems' '{' sssItems+=VSSSDocumentItem ("," sssItems+=VSSSDocumentItem)* '}'
	//	'}';
	public VSSSSystemInterfaceRequirementElements getVSSSSystemInterfaceRequirementAccess() {
		return pVSSSSystemInterfaceRequirement;
	}
	
	public ParserRule getVSSSSystemInterfaceRequirementRule() {
		return getVSSSSystemInterfaceRequirementAccess().getRule();
	}
	
	//VSSSAdaptationMissionizationRequirement:
	//	'VSSSAdaptationMissionizationRequirement'
	//	'{'
	//	'sssItems' '{' sssItems+=VSSSDocumentItem ("," sssItems+=VSSSDocumentItem)* '}'
	//	'}';
	public VSSSAdaptationMissionizationRequirementElements getVSSSAdaptationMissionizationRequirementAccess() {
		return pVSSSAdaptationMissionizationRequirement;
	}
	
	public ParserRule getVSSSAdaptationMissionizationRequirementRule() {
		return getVSSSAdaptationMissionizationRequirementAccess().getRule();
	}
	
	//VSSSComputerResourceRequirement:
	//	'VSSSComputerResourceRequirement'
	//	'{'
	//	'sssItems' '{' sssItems+=VSSSDocumentItem ("," sssItems+=VSSSDocumentItem)* '}'
	//	'}';
	public VSSSComputerResourceRequirementElements getVSSSComputerResourceRequirementAccess() {
		return pVSSSComputerResourceRequirement;
	}
	
	public ParserRule getVSSSComputerResourceRequirementRule() {
		return getVSSSComputerResourceRequirementAccess().getRule();
	}
	
	//VSSSSecurityRequirement:
	//	'VSSSSecurityRequirement'
	//	'{'
	//	'sssItems' '{' sssItems+=VSSSDocumentItem ("," sssItems+=VSSSDocumentItem)* '}'
	//	'}';
	public VSSSSecurityRequirementElements getVSSSSecurityRequirementAccess() {
		return pVSSSSecurityRequirement;
	}
	
	public ParserRule getVSSSSecurityRequirementRule() {
		return getVSSSSecurityRequirementAccess().getRule();
	}
	
	//VSSSSafetyRequirement:
	//	'VSSSSafetyRequirement'
	//	'{'
	//	'sssItems' '{' sssItems+=VSSSDocumentItem ("," sssItems+=VSSSDocumentItem)* '}'
	//	'}';
	public VSSSSafetyRequirementElements getVSSSSafetyRequirementAccess() {
		return pVSSSSafetyRequirement;
	}
	
	public ParserRule getVSSSSafetyRequirementRule() {
		return getVSSSSafetyRequirementAccess().getRule();
	}
	
	//VSSSReliabiltyAvailabilityRequirement:
	//	'VSSSReliabiltyAvailabilityRequirement'
	//	'{'
	//	'sssItems' '{' sssItems+=VSSSDocumentItem ("," sssItems+=VSSSDocumentItem)* '}'
	//	'}';
	public VSSSReliabiltyAvailabilityRequirementElements getVSSSReliabiltyAvailabilityRequirementAccess() {
		return pVSSSReliabiltyAvailabilityRequirement;
	}
	
	public ParserRule getVSSSReliabiltyAvailabilityRequirementRule() {
		return getVSSSReliabiltyAvailabilityRequirementAccess().getRule();
	}
	
	//VSSSQualityRequirement:
	//	'VSSSQualityRequirement'
	//	'{'
	//	'sssItems' '{' sssItems+=VSSSDocumentItem ("," sssItems+=VSSSDocumentItem)* '}'
	//	'}';
	public VSSSQualityRequirementElements getVSSSQualityRequirementAccess() {
		return pVSSSQualityRequirement;
	}
	
	public ParserRule getVSSSQualityRequirementRule() {
		return getVSSSQualityRequirementAccess().getRule();
	}
	
	//VSSSDesignRequirement:
	//	'VSSSDesignRequirement'
	//	'{'
	//	'sssItems' '{' sssItems+=VSSSDocumentItem ("," sssItems+=VSSSDocumentItem)* '}'
	//	'}';
	public VSSSDesignRequirementElements getVSSSDesignRequirementAccess() {
		return pVSSSDesignRequirement;
	}
	
	public ParserRule getVSSSDesignRequirementRule() {
		return getVSSSDesignRequirementAccess().getRule();
	}
	
	//VSSSSoftwareOperationsRequirement:
	//	'VSSSSoftwareOperationsRequirement'
	//	'{'
	//	'sssItems' '{' sssItems+=VSSSDocumentItem ("," sssItems+=VSSSDocumentItem)* '}'
	//	'}';
	public VSSSSoftwareOperationsRequirementElements getVSSSSoftwareOperationsRequirementAccess() {
		return pVSSSSoftwareOperationsRequirement;
	}
	
	public ParserRule getVSSSSoftwareOperationsRequirementRule() {
		return getVSSSSoftwareOperationsRequirementAccess().getRule();
	}
	
	//VSSSSoftwareMaintenanceRequirement:
	//	'VSSSSoftwareMaintenanceRequirement'
	//	'{'
	//	'sssItems' '{' sssItems+=VSSSDocumentItem ("," sssItems+=VSSSDocumentItem)* '}'
	//	'}';
	public VSSSSoftwareMaintenanceRequirementElements getVSSSSoftwareMaintenanceRequirementAccess() {
		return pVSSSSoftwareMaintenanceRequirement;
	}
	
	public ParserRule getVSSSSoftwareMaintenanceRequirementRule() {
		return getVSSSSoftwareMaintenanceRequirementAccess().getRule();
	}
	
	//VSSSSystemSoftwareObservabilityRequirement:
	//	'VSSSSystemSoftwareObservabilityRequirement'
	//	'{'
	//	'sssItems' '{' sssItems+=VSSSDocumentItem ("," sssItems+=VSSSDocumentItem)* '}'
	//	'}';
	public VSSSSystemSoftwareObservabilityRequirementElements getVSSSSystemSoftwareObservabilityRequirementAccess() {
		return pVSSSSystemSoftwareObservabilityRequirement;
	}
	
	public ParserRule getVSSSSystemSoftwareObservabilityRequirementRule() {
		return getVSSSSystemSoftwareObservabilityRequirementAccess().getRule();
	}
	
	//VSSSDocumentItem:
	//	'VSSSDocumentItem'
	//	'{'
	//	'id' id=EString
	//	'verificationMethod' verificationMethod=VVerificationMethod
	//	'body' body=[doc::DBody|EString]
	//	'}';
	public VSSSDocumentItemElements getVSSSDocumentItemAccess() {
		return pVSSSDocumentItem;
	}
	
	public ParserRule getVSSSDocumentItemRule() {
		return getVSSSDocumentItemAccess().getRule();
	}
	
	//enum VVerificationMethod returns tdm::VVerificationMethod:
	//	Analysis | Inspection | Testing | Review | ModelSimulation | WalkThrough | CrossReading | DeskChecking;
	public VVerificationMethodElements getVVerificationMethodAccess() {
		return eVVerificationMethod;
	}
	
	public EnumRule getVVerificationMethodRule() {
		return getVVerificationMethodAccess().getRule();
	}
	
	//VSSSVerificationValidationProcessRequirement:
	//	'VSSSVerificationValidationProcessRequirement'
	//	'{'
	//	'sssItems' '{' sssItems+=VSSSDocumentItem ("," sssItems+=VSSSDocumentItem)* '}'
	//	'}';
	public VSSSVerificationValidationProcessRequirementElements getVSSSVerificationValidationProcessRequirementAccess() {
		return pVSSSVerificationValidationProcessRequirement;
	}
	
	public ParserRule getVSSSVerificationValidationProcessRequirementRule() {
		return getVSSSVerificationValidationProcessRequirementAccess().getRule();
	}
	
	//VSSSValidationApproach:
	//	'VSSSValidationApproach'
	//	'{'
	//	'sssItems' '{' sssItems+=VSSSDocumentItem ("," sssItems+=VSSSDocumentItem)* '}'
	//	'}';
	public VSSSValidationApproachElements getVSSSValidationApproachAccess() {
		return pVSSSValidationApproach;
	}
	
	public ParserRule getVSSSValidationApproachRule() {
		return getVSSSValidationApproachAccess().getRule();
	}
	
	//VSSSValidationRequirement:
	//	'VSSSValidationRequirement'
	//	'{'
	//	'sssItems' '{' sssItems+=VSSSDocumentItem ("," sssItems+=VSSSDocumentItem)* '}'
	//	'}';
	public VSSSValidationRequirementElements getVSSSValidationRequirementAccess() {
		return pVSSSValidationRequirement;
	}
	
	public ParserRule getVSSSValidationRequirementRule() {
		return getVSSSValidationRequirementAccess().getRule();
	}
	
	//VSSSVerificationRequirement:
	//	'VSSSVerificationRequirement'
	//	'{'
	//	'sssItems' '{' sssItems+=VSSSDocumentItem ("," sssItems+=VSSSDocumentItem)* '}'
	//	'}';
	public VSSSVerificationRequirementElements getVSSSVerificationRequirementAccess() {
		return pVSSSVerificationRequirement;
	}
	
	public ParserRule getVSSSVerificationRequirementRule() {
		return getVSSSVerificationRequirementAccess().getRule();
	}
	
	//VSSSSystemModel:
	//	{VSSSSystemModel}
	//	'VSSSSystemModel';
	public VSSSSystemModelElements getVSSSSystemModelAccess() {
		return pVSSSSystemModel;
	}
	
	public ParserRule getVSSSSystemModelRule() {
		return getVSSSSystemModelAccess().getRule();
	}
	
	//QualifiedName:
	//	ID ('.' ID)*;
	public QualifiedNameElements getQualifiedNameAccess() {
		return pQualifiedName;
	}
	
	public ParserRule getQualifiedNameRule() {
		return getQualifiedNameAccess().getRule();
	}
	
	//Version:
	//	(INT | INT? ID) ('.' (INT | INT? ID))*;
	public VersionElements getVersionAccess() {
		return pVersion;
	}
	
	public ParserRule getVersionRule() {
		return getVersionAccess().getRule();
	}
	
	//VersionedQualifiedName:
	//	QualifiedName '(' Version ')';
	public VersionedQualifiedNameElements getVersionedQualifiedNameAccess() {
		return pVersionedQualifiedName;
	}
	
	public ParserRule getVersionedQualifiedNameRule() {
		return getVersionedQualifiedNameAccess().getRule();
	}
	
	//VersionedQualifiedReferenceName:
	//	(VersionedQualifiedName '::')? ID ('::' ID)*;
	public VersionedQualifiedReferenceNameElements getVersionedQualifiedReferenceNameAccess() {
		return pVersionedQualifiedReferenceName;
	}
	
	public ParserRule getVersionedQualifiedReferenceNameRule() {
		return getVersionedQualifiedReferenceNameAccess().getRule();
	}
	
	//terminal HEXADECIMAL:
	//	'0x' ('0'..'9' | 'a'..'f' | 'A'..'F')+;
	public TerminalRule getHEXADECIMALRule() {
		return tHEXADECIMAL;
	}
	
	//INTEGER:
	//	'-'? INT | HEXADECIMAL;
	public INTEGERElements getINTEGERAccess() {
		return pINTEGER;
	}
	
	public ParserRule getINTEGERRule() {
		return getINTEGERAccess().getRule();
	}
	
	//EBoolean ecore::EBoolean:
	//	'true' | 'false'
	public EBooleanElements getEBooleanAccess() {
		return pEBoolean;
	}
	
	public ParserRule getEBooleanRule() {
		return getEBooleanAccess().getRule();
	}
	
	//REAL:
	//	'-'? (INT '.' ':=' INT) ('e' '-'? INT)?;
	public REALElements getREALAccess() {
		return pREAL;
	}
	
	public ParserRule getREALRule() {
		return getREALAccess().getRule();
	}
	
	//terminal ID:
	//	'^'? ('a'..'z' | 'A'..'Z' | '_') ('a'..'z' | 'A'..'Z' | '_' | '0'..'9')*;
	public TerminalRule getIDRule() {
		return gaTerminals.getIDRule();
	}
	
	//terminal INT returns ecore::EInt:
	//	'0'..'9'+;
	public TerminalRule getINTRule() {
		return gaTerminals.getINTRule();
	}
	
	//terminal STRING:
	//	'"' ('\\' . | !('\\' | '"'))* '"' | "'" ('\\' . | !('\\' | "'"))* "'";
	public TerminalRule getSTRINGRule() {
		return gaTerminals.getSTRINGRule();
	}
	
	//terminal ML_COMMENT:
	//	'/ *'->'* /';
	public TerminalRule getML_COMMENTRule() {
		return gaTerminals.getML_COMMENTRule();
	}
	
	//terminal SL_COMMENT:
	//	'//' !('\n' | '\r')* ('\r'? '\n')?;
	public TerminalRule getSL_COMMENTRule() {
		return gaTerminals.getSL_COMMENTRule();
	}
	
	//terminal WS:
	//	' ' | '\t' | '\r' | '\n'+;
	public TerminalRule getWSRule() {
		return gaTerminals.getWSRule();
	}
	
	//terminal ANY_OTHER:
	//	.;
	public TerminalRule getANY_OTHERRule() {
		return gaTerminals.getANY_OTHERRule();
	}
}
