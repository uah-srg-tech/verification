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
		private final Keyword cSSSKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cNameKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cNameAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cNameSTRINGTerminalRuleCall_2_0 = (RuleCall)cNameAssignment_2.eContents().get(0);
		private final Keyword cIdKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Assignment cIdAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cIdSTRINGTerminalRuleCall_4_0 = (RuleCall)cIdAssignment_4.eContents().get(0);
		private final Keyword cIssueKeyword_5 = (Keyword)cGroup.eContents().get(5);
		private final Assignment cIssueAssignment_6 = (Assignment)cGroup.eContents().get(6);
		private final RuleCall cIssueSTRINGTerminalRuleCall_6_0 = (RuleCall)cIssueAssignment_6.eContents().get(0);
		private final Keyword cRevisionKeyword_7 = (Keyword)cGroup.eContents().get(7);
		private final Assignment cRevisionAssignment_8 = (Assignment)cGroup.eContents().get(8);
		private final RuleCall cRevisionSTRINGTerminalRuleCall_8_0 = (RuleCall)cRevisionAssignment_8.eContents().get(0);
		private final Keyword cDateKeyword_9 = (Keyword)cGroup.eContents().get(9);
		private final Assignment cDateAssignment_10 = (Assignment)cGroup.eContents().get(10);
		private final RuleCall cDateSTRINGTerminalRuleCall_10_0 = (RuleCall)cDateAssignment_10.eContents().get(0);
		private final Keyword cGreaterThanSignKeyword_11 = (Keyword)cGroup.eContents().get(11);
		private final Assignment cIntroductionSectionAssignment_12 = (Assignment)cGroup.eContents().get(12);
		private final RuleCall cIntroductionSectionVSSSIntroductionParserRuleCall_12_0 = (RuleCall)cIntroductionSectionAssignment_12.eContents().get(0);
		private final Assignment cApplicableDocumentsSectionAssignment_13 = (Assignment)cGroup.eContents().get(13);
		private final RuleCall cApplicableDocumentsSectionVSSSApplicableDocumentsParserRuleCall_13_0 = (RuleCall)cApplicableDocumentsSectionAssignment_13.eContents().get(0);
		private final Assignment cReferenceDocumentsSectionAssignment_14 = (Assignment)cGroup.eContents().get(14);
		private final RuleCall cReferenceDocumentsSectionVSSSReferenceDocumentsParserRuleCall_14_0 = (RuleCall)cReferenceDocumentsSectionAssignment_14.eContents().get(0);
		private final Assignment cTermsDefinitionsAbbreviationsSectionAssignment_15 = (Assignment)cGroup.eContents().get(15);
		private final RuleCall cTermsDefinitionsAbbreviationsSectionVSSSTermsDefinitionsAbbreviationsParserRuleCall_15_0 = (RuleCall)cTermsDefinitionsAbbreviationsSectionAssignment_15.eContents().get(0);
		private final Assignment cGeneralDescriptionSectionAssignment_16 = (Assignment)cGroup.eContents().get(16);
		private final RuleCall cGeneralDescriptionSectionVSSSGeneralDescriptionParserRuleCall_16_0 = (RuleCall)cGeneralDescriptionSectionAssignment_16.eContents().get(0);
		private final Assignment cSpecificRequirementsSectionAssignment_17 = (Assignment)cGroup.eContents().get(17);
		private final RuleCall cSpecificRequirementsSectionVSSSSpecificRequirementsParserRuleCall_17_0 = (RuleCall)cSpecificRequirementsSectionAssignment_17.eContents().get(0);
		private final Assignment cVerificationValidationIntegrationSectionAssignment_18 = (Assignment)cGroup.eContents().get(18);
		private final RuleCall cVerificationValidationIntegrationSectionVSSSVerificationValidationIntegrationRequirementsParserRuleCall_18_0 = (RuleCall)cVerificationValidationIntegrationSectionAssignment_18.eContents().get(0);
		private final Assignment cSystemModelsSectionAssignment_19 = (Assignment)cGroup.eContents().get(19);
		private final RuleCall cSystemModelsSectionVSSSSystemModelsParserRuleCall_19_0 = (RuleCall)cSystemModelsSectionAssignment_19.eContents().get(0);
		private final Keyword cSSSKeyword_20 = (Keyword)cGroup.eContents().get(20);
		
		//VSSSDocument:
		//	'<SSS'
		//	'name=' name=STRING
		//	'id=' id=STRING
		//	'issue=' issue=STRING
		//	'revision=' revision=STRING
		//	'date=' date=STRING
		//	'>'
		//	introductionSection=VSSSIntroduction
		//	applicableDocumentsSection=VSSSApplicableDocuments
		//	referenceDocumentsSection=VSSSReferenceDocuments
		//	termsDefinitionsAbbreviationsSection=VSSSTermsDefinitionsAbbreviations
		//	generalDescriptionSection=VSSSGeneralDescription
		//	specificRequirementsSection=VSSSSpecificRequirements
		//	verificationValidationIntegrationSection=VSSSVerificationValidationIntegrationRequirements
		//	systemModelsSection=VSSSSystemModels
		//	'</SSS>';
		@Override public ParserRule getRule() { return rule; }
		
		//'<SSS' 'name=' name=STRING 'id=' id=STRING 'issue=' issue=STRING 'revision=' revision=STRING 'date=' date=STRING '>'
		//introductionSection=VSSSIntroduction applicableDocumentsSection=VSSSApplicableDocuments
		//referenceDocumentsSection=VSSSReferenceDocuments
		//termsDefinitionsAbbreviationsSection=VSSSTermsDefinitionsAbbreviations
		//generalDescriptionSection=VSSSGeneralDescription specificRequirementsSection=VSSSSpecificRequirements
		//verificationValidationIntegrationSection=VSSSVerificationValidationIntegrationRequirements
		//systemModelsSection=VSSSSystemModels '</SSS>'
		public Group getGroup() { return cGroup; }
		
		//'<SSS'
		public Keyword getSSSKeyword_0() { return cSSSKeyword_0; }
		
		//'name='
		public Keyword getNameKeyword_1() { return cNameKeyword_1; }
		
		//name=STRING
		public Assignment getNameAssignment_2() { return cNameAssignment_2; }
		
		//STRING
		public RuleCall getNameSTRINGTerminalRuleCall_2_0() { return cNameSTRINGTerminalRuleCall_2_0; }
		
		//'id='
		public Keyword getIdKeyword_3() { return cIdKeyword_3; }
		
		//id=STRING
		public Assignment getIdAssignment_4() { return cIdAssignment_4; }
		
		//STRING
		public RuleCall getIdSTRINGTerminalRuleCall_4_0() { return cIdSTRINGTerminalRuleCall_4_0; }
		
		//'issue='
		public Keyword getIssueKeyword_5() { return cIssueKeyword_5; }
		
		//issue=STRING
		public Assignment getIssueAssignment_6() { return cIssueAssignment_6; }
		
		//STRING
		public RuleCall getIssueSTRINGTerminalRuleCall_6_0() { return cIssueSTRINGTerminalRuleCall_6_0; }
		
		//'revision='
		public Keyword getRevisionKeyword_7() { return cRevisionKeyword_7; }
		
		//revision=STRING
		public Assignment getRevisionAssignment_8() { return cRevisionAssignment_8; }
		
		//STRING
		public RuleCall getRevisionSTRINGTerminalRuleCall_8_0() { return cRevisionSTRINGTerminalRuleCall_8_0; }
		
		//'date='
		public Keyword getDateKeyword_9() { return cDateKeyword_9; }
		
		//date=STRING
		public Assignment getDateAssignment_10() { return cDateAssignment_10; }
		
		//STRING
		public RuleCall getDateSTRINGTerminalRuleCall_10_0() { return cDateSTRINGTerminalRuleCall_10_0; }
		
		//'>'
		public Keyword getGreaterThanSignKeyword_11() { return cGreaterThanSignKeyword_11; }
		
		//introductionSection=VSSSIntroduction
		public Assignment getIntroductionSectionAssignment_12() { return cIntroductionSectionAssignment_12; }
		
		//VSSSIntroduction
		public RuleCall getIntroductionSectionVSSSIntroductionParserRuleCall_12_0() { return cIntroductionSectionVSSSIntroductionParserRuleCall_12_0; }
		
		//applicableDocumentsSection=VSSSApplicableDocuments
		public Assignment getApplicableDocumentsSectionAssignment_13() { return cApplicableDocumentsSectionAssignment_13; }
		
		//VSSSApplicableDocuments
		public RuleCall getApplicableDocumentsSectionVSSSApplicableDocumentsParserRuleCall_13_0() { return cApplicableDocumentsSectionVSSSApplicableDocumentsParserRuleCall_13_0; }
		
		//referenceDocumentsSection=VSSSReferenceDocuments
		public Assignment getReferenceDocumentsSectionAssignment_14() { return cReferenceDocumentsSectionAssignment_14; }
		
		//VSSSReferenceDocuments
		public RuleCall getReferenceDocumentsSectionVSSSReferenceDocumentsParserRuleCall_14_0() { return cReferenceDocumentsSectionVSSSReferenceDocumentsParserRuleCall_14_0; }
		
		//termsDefinitionsAbbreviationsSection=VSSSTermsDefinitionsAbbreviations
		public Assignment getTermsDefinitionsAbbreviationsSectionAssignment_15() { return cTermsDefinitionsAbbreviationsSectionAssignment_15; }
		
		//VSSSTermsDefinitionsAbbreviations
		public RuleCall getTermsDefinitionsAbbreviationsSectionVSSSTermsDefinitionsAbbreviationsParserRuleCall_15_0() { return cTermsDefinitionsAbbreviationsSectionVSSSTermsDefinitionsAbbreviationsParserRuleCall_15_0; }
		
		//generalDescriptionSection=VSSSGeneralDescription
		public Assignment getGeneralDescriptionSectionAssignment_16() { return cGeneralDescriptionSectionAssignment_16; }
		
		//VSSSGeneralDescription
		public RuleCall getGeneralDescriptionSectionVSSSGeneralDescriptionParserRuleCall_16_0() { return cGeneralDescriptionSectionVSSSGeneralDescriptionParserRuleCall_16_0; }
		
		//specificRequirementsSection=VSSSSpecificRequirements
		public Assignment getSpecificRequirementsSectionAssignment_17() { return cSpecificRequirementsSectionAssignment_17; }
		
		//VSSSSpecificRequirements
		public RuleCall getSpecificRequirementsSectionVSSSSpecificRequirementsParserRuleCall_17_0() { return cSpecificRequirementsSectionVSSSSpecificRequirementsParserRuleCall_17_0; }
		
		//verificationValidationIntegrationSection=VSSSVerificationValidationIntegrationRequirements
		public Assignment getVerificationValidationIntegrationSectionAssignment_18() { return cVerificationValidationIntegrationSectionAssignment_18; }
		
		//VSSSVerificationValidationIntegrationRequirements
		public RuleCall getVerificationValidationIntegrationSectionVSSSVerificationValidationIntegrationRequirementsParserRuleCall_18_0() { return cVerificationValidationIntegrationSectionVSSSVerificationValidationIntegrationRequirementsParserRuleCall_18_0; }
		
		//systemModelsSection=VSSSSystemModels
		public Assignment getSystemModelsSectionAssignment_19() { return cSystemModelsSectionAssignment_19; }
		
		//VSSSSystemModels
		public RuleCall getSystemModelsSectionVSSSSystemModelsParserRuleCall_19_0() { return cSystemModelsSectionVSSSSystemModelsParserRuleCall_19_0; }
		
		//'</SSS>'
		public Keyword getSSSKeyword_20() { return cSSSKeyword_20; }
	}
	public class DBodyElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.micobs.svm.lang.sss.SSS.DBody");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cBodyKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cBodyContentAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cBodyContentDBodyContentParserRuleCall_1_0 = (RuleCall)cBodyContentAssignment_1.eContents().get(0);
		private final Keyword cBodyKeyword_2 = (Keyword)cGroup.eContents().get(2);
		
		//DBody doc::DBody:
		//	'<body>'
		//	bodyContent+=DBodyContent+
		//	'</body>'
		@Override public ParserRule getRule() { return rule; }
		
		//'<body>' bodyContent+=DBodyContent+ '</body>'
		public Group getGroup() { return cGroup; }
		
		//'<body>'
		public Keyword getBodyKeyword_0() { return cBodyKeyword_0; }
		
		//bodyContent+=DBodyContent+
		public Assignment getBodyContentAssignment_1() { return cBodyContentAssignment_1; }
		
		//DBodyContent
		public RuleCall getBodyContentDBodyContentParserRuleCall_1_0() { return cBodyContentDBodyContentParserRuleCall_1_0; }
		
		//'</body>'
		public Keyword getBodyKeyword_2() { return cBodyKeyword_2; }
	}
	public class DBodyContentElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.micobs.svm.lang.sss.SSS.DBodyContent");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cDParagraphParserRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cDItemizeParserRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		private final RuleCall cDEnumerateParserRuleCall_2 = (RuleCall)cAlternatives.eContents().get(2);
		private final RuleCall cDFigureParserRuleCall_3 = (RuleCall)cAlternatives.eContents().get(3);
		private final RuleCall cDPictureAsTableParserRuleCall_4 = (RuleCall)cAlternatives.eContents().get(4);
		private final RuleCall cDBasicTableParserRuleCall_5 = (RuleCall)cAlternatives.eContents().get(5);
		
		//DBodyContent doc::DBodyContent:
		//	DParagraph | DItemize | DEnumerate | DFigure | DPictureAsTable | DBasicTable
		@Override public ParserRule getRule() { return rule; }
		
		//DParagraph | DItemize | DEnumerate | DFigure | DPictureAsTable | DBasicTable
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//DParagraph
		public RuleCall getDParagraphParserRuleCall_0() { return cDParagraphParserRuleCall_0; }
		
		//DItemize
		public RuleCall getDItemizeParserRuleCall_1() { return cDItemizeParserRuleCall_1; }
		
		//DEnumerate
		public RuleCall getDEnumerateParserRuleCall_2() { return cDEnumerateParserRuleCall_2; }
		
		//DFigure
		public RuleCall getDFigureParserRuleCall_3() { return cDFigureParserRuleCall_3; }
		
		//DPictureAsTable
		public RuleCall getDPictureAsTableParserRuleCall_4() { return cDPictureAsTableParserRuleCall_4; }
		
		//DBasicTable
		public RuleCall getDBasicTableParserRuleCall_5() { return cDBasicTableParserRuleCall_5; }
	}
	public class DParagraphElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.micobs.svm.lang.sss.SSS.DParagraph");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cParagraphKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cParagraphContentAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cParagraphContentDParagraphContentParserRuleCall_1_0 = (RuleCall)cParagraphContentAssignment_1.eContents().get(0);
		private final Keyword cParagraphKeyword_2 = (Keyword)cGroup.eContents().get(2);
		
		//DParagraph doc::DParagraph:
		//	'<paragraph>'
		//	paragraphContent+=DParagraphContent+
		//	'</paragraph>'
		@Override public ParserRule getRule() { return rule; }
		
		//'<paragraph>' paragraphContent+=DParagraphContent+ '</paragraph>'
		public Group getGroup() { return cGroup; }
		
		//'<paragraph>'
		public Keyword getParagraphKeyword_0() { return cParagraphKeyword_0; }
		
		//paragraphContent+=DParagraphContent+
		public Assignment getParagraphContentAssignment_1() { return cParagraphContentAssignment_1; }
		
		//DParagraphContent
		public RuleCall getParagraphContentDParagraphContentParserRuleCall_1_0() { return cParagraphContentDParagraphContentParserRuleCall_1_0; }
		
		//'</paragraph>'
		public Keyword getParagraphKeyword_2() { return cParagraphKeyword_2; }
	}
	public class DListItemElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.micobs.svm.lang.sss.SSS.DListItem");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cListItemKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cParagraphAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cParagraphDParagraphParserRuleCall_1_0 = (RuleCall)cParagraphAssignment_1.eContents().get(0);
		private final Group cGroup_2 = (Group)cGroup.eContents().get(2);
		private final Keyword cSublistKeyword_2_0 = (Keyword)cGroup_2.eContents().get(0);
		private final Assignment cSublistAssignment_2_1 = (Assignment)cGroup_2.eContents().get(1);
		private final RuleCall cSublistDListContentParserRuleCall_2_1_0 = (RuleCall)cSublistAssignment_2_1.eContents().get(0);
		private final Keyword cSublistKeyword_2_2 = (Keyword)cGroup_2.eContents().get(2);
		private final Keyword cListItemKeyword_3 = (Keyword)cGroup.eContents().get(3);
		
		//DListItem doc::DListItem:
		//	'<listItem>'
		//	paragraph+=DParagraph+ ('<sublist>' sublist=DListContent '</sublist>')?
		//	'</listItem>'
		@Override public ParserRule getRule() { return rule; }
		
		//'<listItem>' paragraph+=DParagraph+ ('<sublist>' sublist=DListContent '</sublist>')? '</listItem>'
		public Group getGroup() { return cGroup; }
		
		//'<listItem>'
		public Keyword getListItemKeyword_0() { return cListItemKeyword_0; }
		
		//paragraph+=DParagraph+
		public Assignment getParagraphAssignment_1() { return cParagraphAssignment_1; }
		
		//DParagraph
		public RuleCall getParagraphDParagraphParserRuleCall_1_0() { return cParagraphDParagraphParserRuleCall_1_0; }
		
		//('<sublist>' sublist=DListContent '</sublist>')?
		public Group getGroup_2() { return cGroup_2; }
		
		//'<sublist>'
		public Keyword getSublistKeyword_2_0() { return cSublistKeyword_2_0; }
		
		//sublist=DListContent
		public Assignment getSublistAssignment_2_1() { return cSublistAssignment_2_1; }
		
		//DListContent
		public RuleCall getSublistDListContentParserRuleCall_2_1_0() { return cSublistDListContentParserRuleCall_2_1_0; }
		
		//'</sublist>'
		public Keyword getSublistKeyword_2_2() { return cSublistKeyword_2_2; }
		
		//'</listItem>'
		public Keyword getListItemKeyword_3() { return cListItemKeyword_3; }
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
	public class DItemizeElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.micobs.svm.lang.sss.SSS.DItemize");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cItemizeKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cItemsAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cItemsDListItemParserRuleCall_1_0 = (RuleCall)cItemsAssignment_1.eContents().get(0);
		private final Keyword cItemizeKeyword_2 = (Keyword)cGroup.eContents().get(2);
		
		//DItemize doc::DItemize:
		//	'<itemize>'
		//	items+=DListItem+
		//	'</itemize>'
		@Override public ParserRule getRule() { return rule; }
		
		//'<itemize>' items+=DListItem+ '</itemize>'
		public Group getGroup() { return cGroup; }
		
		//'<itemize>'
		public Keyword getItemizeKeyword_0() { return cItemizeKeyword_0; }
		
		//items+=DListItem+
		public Assignment getItemsAssignment_1() { return cItemsAssignment_1; }
		
		//DListItem
		public RuleCall getItemsDListItemParserRuleCall_1_0() { return cItemsDListItemParserRuleCall_1_0; }
		
		//'</itemize>'
		public Keyword getItemizeKeyword_2() { return cItemizeKeyword_2; }
	}
	public class DEnumerateElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.micobs.svm.lang.sss.SSS.DEnumerate");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cEnumerateKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cItemsAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cItemsDListItemParserRuleCall_1_0 = (RuleCall)cItemsAssignment_1.eContents().get(0);
		private final Keyword cEnumerateKeyword_2 = (Keyword)cGroup.eContents().get(2);
		
		//DEnumerate doc::DEnumerate:
		//	'<enumerate>'
		//	items+=DListItem+
		//	'</enumerate>'
		@Override public ParserRule getRule() { return rule; }
		
		//'<enumerate>' items+=DListItem+ '</enumerate>'
		public Group getGroup() { return cGroup; }
		
		//'<enumerate>'
		public Keyword getEnumerateKeyword_0() { return cEnumerateKeyword_0; }
		
		//items+=DListItem+
		public Assignment getItemsAssignment_1() { return cItemsAssignment_1; }
		
		//DListItem
		public RuleCall getItemsDListItemParserRuleCall_1_0() { return cItemsDListItemParserRuleCall_1_0; }
		
		//'</enumerate>'
		public Keyword getEnumerateKeyword_2() { return cEnumerateKeyword_2; }
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
	public class DRunElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.micobs.svm.lang.sss.SSS.DRun");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cRunKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cBoldKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Keyword cItalicKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Keyword cUnderscoreKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Keyword cGreaterThanSignKeyword_4 = (Keyword)cGroup.eContents().get(4);
		private final Assignment cTextAssignment_5 = (Assignment)cGroup.eContents().get(5);
		private final RuleCall cTextDTextParserRuleCall_5_0 = (RuleCall)cTextAssignment_5.eContents().get(0);
		private final Keyword cRunKeyword_6 = (Keyword)cGroup.eContents().get(6);
		
		//DRun doc::DRun:
		//	'<run'
		//	'bold'?
		//	'italic'?
		//	'underscore'?
		//	'>'
		//	text=DText
		//	'</run>'
		@Override public ParserRule getRule() { return rule; }
		
		//'<run' 'bold'? 'italic'? 'underscore'? '>' text=DText '</run>'
		public Group getGroup() { return cGroup; }
		
		//'<run'
		public Keyword getRunKeyword_0() { return cRunKeyword_0; }
		
		//'bold'?
		public Keyword getBoldKeyword_1() { return cBoldKeyword_1; }
		
		//'italic'?
		public Keyword getItalicKeyword_2() { return cItalicKeyword_2; }
		
		//'underscore'?
		public Keyword getUnderscoreKeyword_3() { return cUnderscoreKeyword_3; }
		
		//'>'
		public Keyword getGreaterThanSignKeyword_4() { return cGreaterThanSignKeyword_4; }
		
		//text=DText
		public Assignment getTextAssignment_5() { return cTextAssignment_5; }
		
		//DText
		public RuleCall getTextDTextParserRuleCall_5_0() { return cTextDTextParserRuleCall_5_0; }
		
		//'</run>'
		public Keyword getRunKeyword_6() { return cRunKeyword_6; }
	}
	public class DHyperlinkElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.micobs.svm.lang.sss.SSS.DHyperlink");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cHyperlinkKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cReferenceKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cReferenceAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final CrossReference cReferenceDReferenceableObjectCrossReference_2_0 = (CrossReference)cReferenceAssignment_2.eContents().get(0);
		private final RuleCall cReferenceDReferenceableObjectSTRINGTerminalRuleCall_2_0_1 = (RuleCall)cReferenceDReferenceableObjectCrossReference_2_0.eContents().get(1);
		private final Keyword cGreaterThanSignKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Assignment cRunAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cRunDRunParserRuleCall_4_0 = (RuleCall)cRunAssignment_4.eContents().get(0);
		private final Keyword cHyperlinkKeyword_5 = (Keyword)cGroup.eContents().get(5);
		
		//DHyperlink doc::DHyperlink:
		//	'<hyperlink'
		//	'reference=' reference=[doc::DReferenceableObject|STRING]
		//	'>'
		//	run=DRun
		//	'</hyperlink>'
		@Override public ParserRule getRule() { return rule; }
		
		//'<hyperlink' 'reference=' reference=[doc::DReferenceableObject|STRING] '>' run=DRun '</hyperlink>'
		public Group getGroup() { return cGroup; }
		
		//'<hyperlink'
		public Keyword getHyperlinkKeyword_0() { return cHyperlinkKeyword_0; }
		
		//'reference='
		public Keyword getReferenceKeyword_1() { return cReferenceKeyword_1; }
		
		//reference=[doc::DReferenceableObject|STRING]
		public Assignment getReferenceAssignment_2() { return cReferenceAssignment_2; }
		
		//[doc::DReferenceableObject|STRING]
		public CrossReference getReferenceDReferenceableObjectCrossReference_2_0() { return cReferenceDReferenceableObjectCrossReference_2_0; }
		
		//STRING
		public RuleCall getReferenceDReferenceableObjectSTRINGTerminalRuleCall_2_0_1() { return cReferenceDReferenceableObjectSTRINGTerminalRuleCall_2_0_1; }
		
		//'>'
		public Keyword getGreaterThanSignKeyword_3() { return cGreaterThanSignKeyword_3; }
		
		//run=DRun
		public Assignment getRunAssignment_4() { return cRunAssignment_4; }
		
		//DRun
		public RuleCall getRunDRunParserRuleCall_4_0() { return cRunDRunParserRuleCall_4_0; }
		
		//'</hyperlink>'
		public Keyword getHyperlinkKeyword_5() { return cHyperlinkKeyword_5; }
	}
	public class DTextElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.micobs.svm.lang.sss.SSS.DText");
		private final Assignment cContentAssignment = (Assignment)rule.eContents().get(1);
		private final RuleCall cContentRUNTEXTTerminalRuleCall_0 = (RuleCall)cContentAssignment.eContents().get(0);
		
		//DText doc::DText:
		//	content=RUNTEXT
		@Override public ParserRule getRule() { return rule; }
		
		//content=RUNTEXT
		public Assignment getContentAssignment() { return cContentAssignment; }
		
		//RUNTEXT
		public RuleCall getContentRUNTEXTTerminalRuleCall_0() { return cContentRUNTEXTTerminalRuleCall_0; }
	}
	public class DFigureElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.micobs.svm.lang.sss.SSS.DFigure");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cFigureKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cNameKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cNameAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cNameSTRINGTerminalRuleCall_2_0 = (RuleCall)cNameAssignment_2.eContents().get(0);
		private final Keyword cReferenceKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Assignment cReferenceAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cReferenceSTRINGTerminalRuleCall_4_0 = (RuleCall)cReferenceAssignment_4.eContents().get(0);
		private final Keyword cCaptionKeyword_5 = (Keyword)cGroup.eContents().get(5);
		private final Assignment cCaptionAssignment_6 = (Assignment)cGroup.eContents().get(6);
		private final RuleCall cCaptionSTRINGTerminalRuleCall_6_0 = (RuleCall)cCaptionAssignment_6.eContents().get(0);
		private final Keyword cSolidusGreaterThanSignKeyword_7 = (Keyword)cGroup.eContents().get(7);
		
		//DFigure doc::DFigure:
		//	'<figure'
		//	'name=' name=STRING
		//	'reference=' reference=STRING
		//	'caption=' caption=STRING
		//	'/>'
		@Override public ParserRule getRule() { return rule; }
		
		//'<figure' 'name=' name=STRING 'reference=' reference=STRING 'caption=' caption=STRING '/>'
		public Group getGroup() { return cGroup; }
		
		//'<figure'
		public Keyword getFigureKeyword_0() { return cFigureKeyword_0; }
		
		//'name='
		public Keyword getNameKeyword_1() { return cNameKeyword_1; }
		
		//name=STRING
		public Assignment getNameAssignment_2() { return cNameAssignment_2; }
		
		//STRING
		public RuleCall getNameSTRINGTerminalRuleCall_2_0() { return cNameSTRINGTerminalRuleCall_2_0; }
		
		//'reference='
		public Keyword getReferenceKeyword_3() { return cReferenceKeyword_3; }
		
		//reference=STRING
		public Assignment getReferenceAssignment_4() { return cReferenceAssignment_4; }
		
		//STRING
		public RuleCall getReferenceSTRINGTerminalRuleCall_4_0() { return cReferenceSTRINGTerminalRuleCall_4_0; }
		
		//'caption='
		public Keyword getCaptionKeyword_5() { return cCaptionKeyword_5; }
		
		//caption=STRING
		public Assignment getCaptionAssignment_6() { return cCaptionAssignment_6; }
		
		//STRING
		public RuleCall getCaptionSTRINGTerminalRuleCall_6_0() { return cCaptionSTRINGTerminalRuleCall_6_0; }
		
		//'/>'
		public Keyword getSolidusGreaterThanSignKeyword_7() { return cSolidusGreaterThanSignKeyword_7; }
	}
	public class DPictureAsTableElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.micobs.svm.lang.sss.SSS.DPictureAsTable");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cPictureAsTableKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cNameKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cNameAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cNameSTRINGTerminalRuleCall_2_0 = (RuleCall)cNameAssignment_2.eContents().get(0);
		private final Keyword cReferenceKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Assignment cReferenceAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cReferenceSTRINGTerminalRuleCall_4_0 = (RuleCall)cReferenceAssignment_4.eContents().get(0);
		private final Keyword cCaptionKeyword_5 = (Keyword)cGroup.eContents().get(5);
		private final Assignment cCaptionAssignment_6 = (Assignment)cGroup.eContents().get(6);
		private final RuleCall cCaptionSTRINGTerminalRuleCall_6_0 = (RuleCall)cCaptionAssignment_6.eContents().get(0);
		private final Keyword cSolidusGreaterThanSignKeyword_7 = (Keyword)cGroup.eContents().get(7);
		
		//DPictureAsTable doc::DPictureAsTable:
		//	'<pictureAsTable'
		//	'name=' name=STRING
		//	'reference=' reference=STRING
		//	'caption=' caption=STRING
		//	'/>'
		@Override public ParserRule getRule() { return rule; }
		
		//'<pictureAsTable' 'name=' name=STRING 'reference=' reference=STRING 'caption=' caption=STRING '/>'
		public Group getGroup() { return cGroup; }
		
		//'<pictureAsTable'
		public Keyword getPictureAsTableKeyword_0() { return cPictureAsTableKeyword_0; }
		
		//'name='
		public Keyword getNameKeyword_1() { return cNameKeyword_1; }
		
		//name=STRING
		public Assignment getNameAssignment_2() { return cNameAssignment_2; }
		
		//STRING
		public RuleCall getNameSTRINGTerminalRuleCall_2_0() { return cNameSTRINGTerminalRuleCall_2_0; }
		
		//'reference='
		public Keyword getReferenceKeyword_3() { return cReferenceKeyword_3; }
		
		//reference=STRING
		public Assignment getReferenceAssignment_4() { return cReferenceAssignment_4; }
		
		//STRING
		public RuleCall getReferenceSTRINGTerminalRuleCall_4_0() { return cReferenceSTRINGTerminalRuleCall_4_0; }
		
		//'caption='
		public Keyword getCaptionKeyword_5() { return cCaptionKeyword_5; }
		
		//caption=STRING
		public Assignment getCaptionAssignment_6() { return cCaptionAssignment_6; }
		
		//STRING
		public RuleCall getCaptionSTRINGTerminalRuleCall_6_0() { return cCaptionSTRINGTerminalRuleCall_6_0; }
		
		//'/>'
		public Keyword getSolidusGreaterThanSignKeyword_7() { return cSolidusGreaterThanSignKeyword_7; }
	}
	public class DBasicTableElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.micobs.svm.lang.sss.SSS.DBasicTable");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cBasicTableKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cNameKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cNameAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cNameSTRINGTerminalRuleCall_2_0 = (RuleCall)cNameAssignment_2.eContents().get(0);
		private final Keyword cCaptionKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Assignment cCaptionAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cCaptionSTRINGTerminalRuleCall_4_0 = (RuleCall)cCaptionAssignment_4.eContents().get(0);
		private final Keyword cGreaterThanSignKeyword_5 = (Keyword)cGroup.eContents().get(5);
		private final Assignment cRowsAssignment_6 = (Assignment)cGroup.eContents().get(6);
		private final RuleCall cRowsDRowParserRuleCall_6_0 = (RuleCall)cRowsAssignment_6.eContents().get(0);
		private final Keyword cBasicTableKeyword_7 = (Keyword)cGroup.eContents().get(7);
		
		//DBasicTable doc::DBasicTable:
		//	'<basicTable'
		//	'name=' name=STRING
		//	'caption=' caption=STRING
		//	'>'
		//	rows+=DRow+
		//	'</basicTable>'
		@Override public ParserRule getRule() { return rule; }
		
		//'<basicTable' 'name=' name=STRING 'caption=' caption=STRING '>' rows+=DRow+ '</basicTable>'
		public Group getGroup() { return cGroup; }
		
		//'<basicTable'
		public Keyword getBasicTableKeyword_0() { return cBasicTableKeyword_0; }
		
		//'name='
		public Keyword getNameKeyword_1() { return cNameKeyword_1; }
		
		//name=STRING
		public Assignment getNameAssignment_2() { return cNameAssignment_2; }
		
		//STRING
		public RuleCall getNameSTRINGTerminalRuleCall_2_0() { return cNameSTRINGTerminalRuleCall_2_0; }
		
		//'caption='
		public Keyword getCaptionKeyword_3() { return cCaptionKeyword_3; }
		
		//caption=STRING
		public Assignment getCaptionAssignment_4() { return cCaptionAssignment_4; }
		
		//STRING
		public RuleCall getCaptionSTRINGTerminalRuleCall_4_0() { return cCaptionSTRINGTerminalRuleCall_4_0; }
		
		//'>'
		public Keyword getGreaterThanSignKeyword_5() { return cGreaterThanSignKeyword_5; }
		
		//rows+=DRow+
		public Assignment getRowsAssignment_6() { return cRowsAssignment_6; }
		
		//DRow
		public RuleCall getRowsDRowParserRuleCall_6_0() { return cRowsDRowParserRuleCall_6_0; }
		
		//'</basicTable>'
		public Keyword getBasicTableKeyword_7() { return cBasicTableKeyword_7; }
	}
	public class DRowElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.micobs.svm.lang.sss.SSS.DRow");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cRowKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cSpanKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cSpanAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cSpanSTRINGTerminalRuleCall_2_0 = (RuleCall)cSpanAssignment_2.eContents().get(0);
		private final Keyword cGreaterThanSignKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Assignment cColumnsAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cColumnsDColumnParserRuleCall_4_0 = (RuleCall)cColumnsAssignment_4.eContents().get(0);
		private final Keyword cRowKeyword_5 = (Keyword)cGroup.eContents().get(5);
		
		//DRow doc::DRow:
		//	'<row'
		//	'span=' span=STRING
		//	'>'
		//	columns+=DColumn+
		//	'</row>'
		@Override public ParserRule getRule() { return rule; }
		
		//'<row' 'span=' span=STRING '>' columns+=DColumn+ '</row>'
		public Group getGroup() { return cGroup; }
		
		//'<row'
		public Keyword getRowKeyword_0() { return cRowKeyword_0; }
		
		//'span='
		public Keyword getSpanKeyword_1() { return cSpanKeyword_1; }
		
		//span=STRING
		public Assignment getSpanAssignment_2() { return cSpanAssignment_2; }
		
		//STRING
		public RuleCall getSpanSTRINGTerminalRuleCall_2_0() { return cSpanSTRINGTerminalRuleCall_2_0; }
		
		//'>'
		public Keyword getGreaterThanSignKeyword_3() { return cGreaterThanSignKeyword_3; }
		
		//columns+=DColumn+
		public Assignment getColumnsAssignment_4() { return cColumnsAssignment_4; }
		
		//DColumn
		public RuleCall getColumnsDColumnParserRuleCall_4_0() { return cColumnsDColumnParserRuleCall_4_0; }
		
		//'</row>'
		public Keyword getRowKeyword_5() { return cRowKeyword_5; }
	}
	public class DColumnElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.micobs.svm.lang.sss.SSS.DColumn");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cColumnKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cSpanKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cSpanAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cSpanSTRINGTerminalRuleCall_2_0 = (RuleCall)cSpanAssignment_2.eContents().get(0);
		private final Keyword cGreaterThanSignKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Assignment cCellsAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cCellsDCellParserRuleCall_4_0 = (RuleCall)cCellsAssignment_4.eContents().get(0);
		private final Keyword cColumnKeyword_5 = (Keyword)cGroup.eContents().get(5);
		
		//DColumn doc::DColumn:
		//	'<column'
		//	'span=' span=STRING
		//	'>'
		//	cells+=DCell+
		//	'</column>'
		@Override public ParserRule getRule() { return rule; }
		
		//'<column' 'span=' span=STRING '>' cells+=DCell+ '</column>'
		public Group getGroup() { return cGroup; }
		
		//'<column'
		public Keyword getColumnKeyword_0() { return cColumnKeyword_0; }
		
		//'span='
		public Keyword getSpanKeyword_1() { return cSpanKeyword_1; }
		
		//span=STRING
		public Assignment getSpanAssignment_2() { return cSpanAssignment_2; }
		
		//STRING
		public RuleCall getSpanSTRINGTerminalRuleCall_2_0() { return cSpanSTRINGTerminalRuleCall_2_0; }
		
		//'>'
		public Keyword getGreaterThanSignKeyword_3() { return cGreaterThanSignKeyword_3; }
		
		//cells+=DCell+
		public Assignment getCellsAssignment_4() { return cCellsAssignment_4; }
		
		//DCell
		public RuleCall getCellsDCellParserRuleCall_4_0() { return cCellsDCellParserRuleCall_4_0; }
		
		//'</column>'
		public Keyword getColumnKeyword_5() { return cColumnKeyword_5; }
	}
	public class DCellElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.micobs.svm.lang.sss.SSS.DCell");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cCellKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cBodyContentAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cBodyContentDBodyContentParserRuleCall_1_0 = (RuleCall)cBodyContentAssignment_1.eContents().get(0);
		private final Keyword cCellKeyword_2 = (Keyword)cGroup.eContents().get(2);
		
		//DCell doc::DCell:
		//	'<cell>'
		//	bodyContent+=DBodyContent+
		//	'</cell>'
		@Override public ParserRule getRule() { return rule; }
		
		//'<cell>' bodyContent+=DBodyContent+ '</cell>'
		public Group getGroup() { return cGroup; }
		
		//'<cell>'
		public Keyword getCellKeyword_0() { return cCellKeyword_0; }
		
		//bodyContent+=DBodyContent+
		public Assignment getBodyContentAssignment_1() { return cBodyContentAssignment_1; }
		
		//DBodyContent
		public RuleCall getBodyContentDBodyContentParserRuleCall_1_0() { return cBodyContentDBodyContentParserRuleCall_1_0; }
		
		//'</cell>'
		public Keyword getCellKeyword_2() { return cCellKeyword_2; }
	}
	public class DApplicableDocumentElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.micobs.svm.lang.sss.SSS.DApplicableDocument");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cApplicableDocumentKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cNameKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cNameAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cNameSTRINGTerminalRuleCall_2_0 = (RuleCall)cNameAssignment_2.eContents().get(0);
		private final Keyword cTitleKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Assignment cTitleAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cTitleSTRINGTerminalRuleCall_4_0 = (RuleCall)cTitleAssignment_4.eContents().get(0);
		private final Keyword cIssueKeyword_5 = (Keyword)cGroup.eContents().get(5);
		private final Assignment cIssueAssignment_6 = (Assignment)cGroup.eContents().get(6);
		private final RuleCall cIssueSTRINGTerminalRuleCall_6_0 = (RuleCall)cIssueAssignment_6.eContents().get(0);
		private final Keyword cRevisionKeyword_7 = (Keyword)cGroup.eContents().get(7);
		private final Assignment cRevisionAssignment_8 = (Assignment)cGroup.eContents().get(8);
		private final RuleCall cRevisionSTRINGTerminalRuleCall_8_0 = (RuleCall)cRevisionAssignment_8.eContents().get(0);
		private final Keyword cSolidusGreaterThanSignKeyword_9 = (Keyword)cGroup.eContents().get(9);
		
		//DApplicableDocument doc::DApplicableDocument:
		//	'<ApplicableDocument'
		//	'name=' name=STRING
		//	'title=' title=STRING
		//	'issue=' issue=STRING
		//	'revision=' revision=STRING
		//	'/>'
		@Override public ParserRule getRule() { return rule; }
		
		//'<ApplicableDocument' 'name=' name=STRING 'title=' title=STRING 'issue=' issue=STRING 'revision=' revision=STRING '/>'
		public Group getGroup() { return cGroup; }
		
		//'<ApplicableDocument'
		public Keyword getApplicableDocumentKeyword_0() { return cApplicableDocumentKeyword_0; }
		
		//'name='
		public Keyword getNameKeyword_1() { return cNameKeyword_1; }
		
		//name=STRING
		public Assignment getNameAssignment_2() { return cNameAssignment_2; }
		
		//STRING
		public RuleCall getNameSTRINGTerminalRuleCall_2_0() { return cNameSTRINGTerminalRuleCall_2_0; }
		
		//'title='
		public Keyword getTitleKeyword_3() { return cTitleKeyword_3; }
		
		//title=STRING
		public Assignment getTitleAssignment_4() { return cTitleAssignment_4; }
		
		//STRING
		public RuleCall getTitleSTRINGTerminalRuleCall_4_0() { return cTitleSTRINGTerminalRuleCall_4_0; }
		
		//'issue='
		public Keyword getIssueKeyword_5() { return cIssueKeyword_5; }
		
		//issue=STRING
		public Assignment getIssueAssignment_6() { return cIssueAssignment_6; }
		
		//STRING
		public RuleCall getIssueSTRINGTerminalRuleCall_6_0() { return cIssueSTRINGTerminalRuleCall_6_0; }
		
		//'revision='
		public Keyword getRevisionKeyword_7() { return cRevisionKeyword_7; }
		
		//revision=STRING
		public Assignment getRevisionAssignment_8() { return cRevisionAssignment_8; }
		
		//STRING
		public RuleCall getRevisionSTRINGTerminalRuleCall_8_0() { return cRevisionSTRINGTerminalRuleCall_8_0; }
		
		//'/>'
		public Keyword getSolidusGreaterThanSignKeyword_9() { return cSolidusGreaterThanSignKeyword_9; }
	}
	public class DReferenceDocumentElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.micobs.svm.lang.sss.SSS.DReferenceDocument");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cReferenceDocumentKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cNameKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cNameAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cNameSTRINGTerminalRuleCall_2_0 = (RuleCall)cNameAssignment_2.eContents().get(0);
		private final Keyword cTitleKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Assignment cTitleAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cTitleSTRINGTerminalRuleCall_4_0 = (RuleCall)cTitleAssignment_4.eContents().get(0);
		private final Keyword cIssueKeyword_5 = (Keyword)cGroup.eContents().get(5);
		private final Assignment cIssueAssignment_6 = (Assignment)cGroup.eContents().get(6);
		private final RuleCall cIssueSTRINGTerminalRuleCall_6_0 = (RuleCall)cIssueAssignment_6.eContents().get(0);
		private final Keyword cRevisionKeyword_7 = (Keyword)cGroup.eContents().get(7);
		private final Assignment cRevisionAssignment_8 = (Assignment)cGroup.eContents().get(8);
		private final RuleCall cRevisionSTRINGTerminalRuleCall_8_0 = (RuleCall)cRevisionAssignment_8.eContents().get(0);
		private final Keyword cSolidusGreaterThanSignKeyword_9 = (Keyword)cGroup.eContents().get(9);
		
		//DReferenceDocument doc::DReferenceDocument:
		//	'<ReferenceDocument'
		//	'name=' name=STRING
		//	'title=' title=STRING
		//	'issue=' issue=STRING
		//	'revision=' revision=STRING
		//	'/>'
		@Override public ParserRule getRule() { return rule; }
		
		//'<ReferenceDocument' 'name=' name=STRING 'title=' title=STRING 'issue=' issue=STRING 'revision=' revision=STRING '/>'
		public Group getGroup() { return cGroup; }
		
		//'<ReferenceDocument'
		public Keyword getReferenceDocumentKeyword_0() { return cReferenceDocumentKeyword_0; }
		
		//'name='
		public Keyword getNameKeyword_1() { return cNameKeyword_1; }
		
		//name=STRING
		public Assignment getNameAssignment_2() { return cNameAssignment_2; }
		
		//STRING
		public RuleCall getNameSTRINGTerminalRuleCall_2_0() { return cNameSTRINGTerminalRuleCall_2_0; }
		
		//'title='
		public Keyword getTitleKeyword_3() { return cTitleKeyword_3; }
		
		//title=STRING
		public Assignment getTitleAssignment_4() { return cTitleAssignment_4; }
		
		//STRING
		public RuleCall getTitleSTRINGTerminalRuleCall_4_0() { return cTitleSTRINGTerminalRuleCall_4_0; }
		
		//'issue='
		public Keyword getIssueKeyword_5() { return cIssueKeyword_5; }
		
		//issue=STRING
		public Assignment getIssueAssignment_6() { return cIssueAssignment_6; }
		
		//STRING
		public RuleCall getIssueSTRINGTerminalRuleCall_6_0() { return cIssueSTRINGTerminalRuleCall_6_0; }
		
		//'revision='
		public Keyword getRevisionKeyword_7() { return cRevisionKeyword_7; }
		
		//revision=STRING
		public Assignment getRevisionAssignment_8() { return cRevisionAssignment_8; }
		
		//STRING
		public RuleCall getRevisionSTRINGTerminalRuleCall_8_0() { return cRevisionSTRINGTerminalRuleCall_8_0; }
		
		//'/>'
		public Keyword getSolidusGreaterThanSignKeyword_9() { return cSolidusGreaterThanSignKeyword_9; }
	}
	public class VSSSIntroductionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.micobs.svm.lang.sss.SSS.VSSSIntroduction");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cIntroductionKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cPurposeKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cPurposeAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cPurposeDBodyParserRuleCall_2_0 = (RuleCall)cPurposeAssignment_2.eContents().get(0);
		private final Keyword cPurposeKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Keyword cObjectiveKeyword_4 = (Keyword)cGroup.eContents().get(4);
		private final Assignment cObjectiveAssignment_5 = (Assignment)cGroup.eContents().get(5);
		private final RuleCall cObjectiveDBodyParserRuleCall_5_0 = (RuleCall)cObjectiveAssignment_5.eContents().get(0);
		private final Keyword cObjectiveKeyword_6 = (Keyword)cGroup.eContents().get(6);
		private final Keyword cContentKeyword_7 = (Keyword)cGroup.eContents().get(7);
		private final Assignment cContentAssignment_8 = (Assignment)cGroup.eContents().get(8);
		private final RuleCall cContentDBodyParserRuleCall_8_0 = (RuleCall)cContentAssignment_8.eContents().get(0);
		private final Keyword cContentKeyword_9 = (Keyword)cGroup.eContents().get(9);
		private final Keyword cReasonKeyword_10 = (Keyword)cGroup.eContents().get(10);
		private final Assignment cReasonAssignment_11 = (Assignment)cGroup.eContents().get(11);
		private final RuleCall cReasonDBodyParserRuleCall_11_0 = (RuleCall)cReasonAssignment_11.eContents().get(0);
		private final Keyword cReasonKeyword_12 = (Keyword)cGroup.eContents().get(12);
		private final Keyword cIntroductionKeyword_13 = (Keyword)cGroup.eContents().get(13);
		
		//VSSSIntroduction:
		//	'<Introduction>'
		//	'<purpose>' purpose=DBody '</purpose>'
		//	'<objective>' objective=DBody '</objective>'
		//	'<content>' content=DBody '</content>'
		//	'<reason>' reason=DBody '</reason>'
		//	'</Introduction>';
		@Override public ParserRule getRule() { return rule; }
		
		//'<Introduction>' '<purpose>' purpose=DBody '</purpose>' '<objective>' objective=DBody '</objective>' '<content>'
		//content=DBody '</content>' '<reason>' reason=DBody '</reason>' '</Introduction>'
		public Group getGroup() { return cGroup; }
		
		//'<Introduction>'
		public Keyword getIntroductionKeyword_0() { return cIntroductionKeyword_0; }
		
		//'<purpose>'
		public Keyword getPurposeKeyword_1() { return cPurposeKeyword_1; }
		
		//purpose=DBody
		public Assignment getPurposeAssignment_2() { return cPurposeAssignment_2; }
		
		//DBody
		public RuleCall getPurposeDBodyParserRuleCall_2_0() { return cPurposeDBodyParserRuleCall_2_0; }
		
		//'</purpose>'
		public Keyword getPurposeKeyword_3() { return cPurposeKeyword_3; }
		
		//'<objective>'
		public Keyword getObjectiveKeyword_4() { return cObjectiveKeyword_4; }
		
		//objective=DBody
		public Assignment getObjectiveAssignment_5() { return cObjectiveAssignment_5; }
		
		//DBody
		public RuleCall getObjectiveDBodyParserRuleCall_5_0() { return cObjectiveDBodyParserRuleCall_5_0; }
		
		//'</objective>'
		public Keyword getObjectiveKeyword_6() { return cObjectiveKeyword_6; }
		
		//'<content>'
		public Keyword getContentKeyword_7() { return cContentKeyword_7; }
		
		//content=DBody
		public Assignment getContentAssignment_8() { return cContentAssignment_8; }
		
		//DBody
		public RuleCall getContentDBodyParserRuleCall_8_0() { return cContentDBodyParserRuleCall_8_0; }
		
		//'</content>'
		public Keyword getContentKeyword_9() { return cContentKeyword_9; }
		
		//'<reason>'
		public Keyword getReasonKeyword_10() { return cReasonKeyword_10; }
		
		//reason=DBody
		public Assignment getReasonAssignment_11() { return cReasonAssignment_11; }
		
		//DBody
		public RuleCall getReasonDBodyParserRuleCall_11_0() { return cReasonDBodyParserRuleCall_11_0; }
		
		//'</reason>'
		public Keyword getReasonKeyword_12() { return cReasonKeyword_12; }
		
		//'</Introduction>'
		public Keyword getIntroductionKeyword_13() { return cIntroductionKeyword_13; }
	}
	public class VSSSApplicableDocumentsElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.micobs.svm.lang.sss.SSS.VSSSApplicableDocuments");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cVSSSApplicableDocumentsAction_0 = (Action)cGroup.eContents().get(0);
		private final Keyword cApplicableDocumentsKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cApplicableDocumentsAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cApplicableDocumentsDApplicableDocumentParserRuleCall_2_0 = (RuleCall)cApplicableDocumentsAssignment_2.eContents().get(0);
		private final Keyword cApplicableDocumentsKeyword_3 = (Keyword)cGroup.eContents().get(3);
		
		//VSSSApplicableDocuments:
		//	{VSSSApplicableDocuments}
		//	'<ApplicableDocuments>'
		//	applicableDocuments+=DApplicableDocument*
		//	'</ApplicableDocuments>';
		@Override public ParserRule getRule() { return rule; }
		
		//{VSSSApplicableDocuments} '<ApplicableDocuments>' applicableDocuments+=DApplicableDocument* '</ApplicableDocuments>'
		public Group getGroup() { return cGroup; }
		
		//{VSSSApplicableDocuments}
		public Action getVSSSApplicableDocumentsAction_0() { return cVSSSApplicableDocumentsAction_0; }
		
		//'<ApplicableDocuments>'
		public Keyword getApplicableDocumentsKeyword_1() { return cApplicableDocumentsKeyword_1; }
		
		//applicableDocuments+=DApplicableDocument*
		public Assignment getApplicableDocumentsAssignment_2() { return cApplicableDocumentsAssignment_2; }
		
		//DApplicableDocument
		public RuleCall getApplicableDocumentsDApplicableDocumentParserRuleCall_2_0() { return cApplicableDocumentsDApplicableDocumentParserRuleCall_2_0; }
		
		//'</ApplicableDocuments>'
		public Keyword getApplicableDocumentsKeyword_3() { return cApplicableDocumentsKeyword_3; }
	}
	public class VSSSReferenceDocumentsElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.micobs.svm.lang.sss.SSS.VSSSReferenceDocuments");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cVSSSReferenceDocumentsAction_0 = (Action)cGroup.eContents().get(0);
		private final Keyword cReferenceDocumentsKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cReferenceDocumentsAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cReferenceDocumentsDReferenceDocumentParserRuleCall_2_0 = (RuleCall)cReferenceDocumentsAssignment_2.eContents().get(0);
		private final Keyword cReferenceDocumentsKeyword_3 = (Keyword)cGroup.eContents().get(3);
		
		//VSSSReferenceDocuments:
		//	{VSSSReferenceDocuments}
		//	'<ReferenceDocuments>'
		//	referenceDocuments+=DReferenceDocument*
		//	'</ReferenceDocuments>';
		@Override public ParserRule getRule() { return rule; }
		
		//{VSSSReferenceDocuments} '<ReferenceDocuments>' referenceDocuments+=DReferenceDocument* '</ReferenceDocuments>'
		public Group getGroup() { return cGroup; }
		
		//{VSSSReferenceDocuments}
		public Action getVSSSReferenceDocumentsAction_0() { return cVSSSReferenceDocumentsAction_0; }
		
		//'<ReferenceDocuments>'
		public Keyword getReferenceDocumentsKeyword_1() { return cReferenceDocumentsKeyword_1; }
		
		//referenceDocuments+=DReferenceDocument*
		public Assignment getReferenceDocumentsAssignment_2() { return cReferenceDocumentsAssignment_2; }
		
		//DReferenceDocument
		public RuleCall getReferenceDocumentsDReferenceDocumentParserRuleCall_2_0() { return cReferenceDocumentsDReferenceDocumentParserRuleCall_2_0; }
		
		//'</ReferenceDocuments>'
		public Keyword getReferenceDocumentsKeyword_3() { return cReferenceDocumentsKeyword_3; }
	}
	public class VSSSTermsDefinitionsAbbreviationsElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.micobs.svm.lang.sss.SSS.VSSSTermsDefinitionsAbbreviations");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cVSSSTermsDefinitionsAbbreviationsAction_0 = (Action)cGroup.eContents().get(0);
		private final Keyword cTermsDefinitionsAbbreviationsKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cTermsAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cTermsVSSSTermParserRuleCall_2_0 = (RuleCall)cTermsAssignment_2.eContents().get(0);
		private final Assignment cDefinitionsAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cDefinitionsVSSSDefinitionParserRuleCall_3_0 = (RuleCall)cDefinitionsAssignment_3.eContents().get(0);
		private final Assignment cAbbreviationsAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cAbbreviationsVSSSAbbreviationParserRuleCall_4_0 = (RuleCall)cAbbreviationsAssignment_4.eContents().get(0);
		private final Keyword cTermsDefinitionsAbbreviationsKeyword_5 = (Keyword)cGroup.eContents().get(5);
		
		//VSSSTermsDefinitionsAbbreviations:
		//	{VSSSTermsDefinitionsAbbreviations}
		//	'<TermsDefinitionsAbbreviations>'
		//	terms+=VSSSTerm*
		//	definitions+=VSSSDefinition*
		//	abbreviations+=VSSSAbbreviation*
		//	'</TermsDefinitionsAbbreviations>';
		@Override public ParserRule getRule() { return rule; }
		
		//{VSSSTermsDefinitionsAbbreviations} '<TermsDefinitionsAbbreviations>' terms+=VSSSTerm* definitions+=VSSSDefinition*
		//abbreviations+=VSSSAbbreviation* '</TermsDefinitionsAbbreviations>'
		public Group getGroup() { return cGroup; }
		
		//{VSSSTermsDefinitionsAbbreviations}
		public Action getVSSSTermsDefinitionsAbbreviationsAction_0() { return cVSSSTermsDefinitionsAbbreviationsAction_0; }
		
		//'<TermsDefinitionsAbbreviations>'
		public Keyword getTermsDefinitionsAbbreviationsKeyword_1() { return cTermsDefinitionsAbbreviationsKeyword_1; }
		
		//terms+=VSSSTerm*
		public Assignment getTermsAssignment_2() { return cTermsAssignment_2; }
		
		//VSSSTerm
		public RuleCall getTermsVSSSTermParserRuleCall_2_0() { return cTermsVSSSTermParserRuleCall_2_0; }
		
		//definitions+=VSSSDefinition*
		public Assignment getDefinitionsAssignment_3() { return cDefinitionsAssignment_3; }
		
		//VSSSDefinition
		public RuleCall getDefinitionsVSSSDefinitionParserRuleCall_3_0() { return cDefinitionsVSSSDefinitionParserRuleCall_3_0; }
		
		//abbreviations+=VSSSAbbreviation*
		public Assignment getAbbreviationsAssignment_4() { return cAbbreviationsAssignment_4; }
		
		//VSSSAbbreviation
		public RuleCall getAbbreviationsVSSSAbbreviationParserRuleCall_4_0() { return cAbbreviationsVSSSAbbreviationParserRuleCall_4_0; }
		
		//'</TermsDefinitionsAbbreviations>'
		public Keyword getTermsDefinitionsAbbreviationsKeyword_5() { return cTermsDefinitionsAbbreviationsKeyword_5; }
	}
	public class VSSSGeneralDescriptionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.micobs.svm.lang.sss.SSS.VSSSGeneralDescription");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cGeneralDescriptionKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cProductPerspectiveKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cProductPerspectiveAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cProductPerspectiveVSSSGeneralDescriptionSubsectionParserRuleCall_2_0 = (RuleCall)cProductPerspectiveAssignment_2.eContents().get(0);
		private final Keyword cProductPerspectiveKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Keyword cGeneralCapabilitiesKeyword_4 = (Keyword)cGroup.eContents().get(4);
		private final Assignment cGeneralCapabilitiesAssignment_5 = (Assignment)cGroup.eContents().get(5);
		private final RuleCall cGeneralCapabilitiesVSSSGeneralDescriptionSubsectionParserRuleCall_5_0 = (RuleCall)cGeneralCapabilitiesAssignment_5.eContents().get(0);
		private final Keyword cGeneralCapabilitiesKeyword_6 = (Keyword)cGroup.eContents().get(6);
		private final Keyword cGeneralConstraintsKeyword_7 = (Keyword)cGroup.eContents().get(7);
		private final Assignment cGeneralConstraintsAssignment_8 = (Assignment)cGroup.eContents().get(8);
		private final RuleCall cGeneralConstraintsVSSSGeneralDescriptionSubsectionParserRuleCall_8_0 = (RuleCall)cGeneralConstraintsAssignment_8.eContents().get(0);
		private final Keyword cGeneralConstraintsKeyword_9 = (Keyword)cGroup.eContents().get(9);
		private final Keyword cOperationalEnvironmentKeyword_10 = (Keyword)cGroup.eContents().get(10);
		private final Assignment cOperationalEnvironmentAssignment_11 = (Assignment)cGroup.eContents().get(11);
		private final RuleCall cOperationalEnvironmentVSSSGeneralDescriptionSubsectionParserRuleCall_11_0 = (RuleCall)cOperationalEnvironmentAssignment_11.eContents().get(0);
		private final Keyword cOperationalEnvironmentKeyword_12 = (Keyword)cGroup.eContents().get(12);
		private final Keyword cAssumptionsDependenciesKeyword_13 = (Keyword)cGroup.eContents().get(13);
		private final Assignment cAssumptionsDependenciesAssignment_14 = (Assignment)cGroup.eContents().get(14);
		private final RuleCall cAssumptionsDependenciesVSSSGeneralDescriptionSubsectionParserRuleCall_14_0 = (RuleCall)cAssumptionsDependenciesAssignment_14.eContents().get(0);
		private final Keyword cAssumptionsDependenciesKeyword_15 = (Keyword)cGroup.eContents().get(15);
		private final Keyword cGeneralDescriptionKeyword_16 = (Keyword)cGroup.eContents().get(16);
		
		//VSSSGeneralDescription:
		//	'<GeneralDescription>'
		//	'<productPerspective>' productPerspective=VSSSGeneralDescriptionSubsection '</productPerspective>'
		//	'<generalCapabilities>' generalCapabilities=VSSSGeneralDescriptionSubsection '</generalCapabilities>'
		//	'<generalConstraints>' generalConstraints=VSSSGeneralDescriptionSubsection '</generalConstraints>'
		//	'<operationalEnvironment>' operationalEnvironment=VSSSGeneralDescriptionSubsection '</operationalEnvironment>'
		//	'<assumptionsDependencies>' assumptionsDependencies=VSSSGeneralDescriptionSubsection '</assumptionsDependencies>'
		//	'</GeneralDescription>';
		@Override public ParserRule getRule() { return rule; }
		
		//'<GeneralDescription>' '<productPerspective>' productPerspective=VSSSGeneralDescriptionSubsection
		//'</productPerspective>' '<generalCapabilities>' generalCapabilities=VSSSGeneralDescriptionSubsection
		//'</generalCapabilities>' '<generalConstraints>' generalConstraints=VSSSGeneralDescriptionSubsection
		//'</generalConstraints>' '<operationalEnvironment>' operationalEnvironment=VSSSGeneralDescriptionSubsection
		//'</operationalEnvironment>' '<assumptionsDependencies>' assumptionsDependencies=VSSSGeneralDescriptionSubsection
		//'</assumptionsDependencies>' '</GeneralDescription>'
		public Group getGroup() { return cGroup; }
		
		//'<GeneralDescription>'
		public Keyword getGeneralDescriptionKeyword_0() { return cGeneralDescriptionKeyword_0; }
		
		//'<productPerspective>'
		public Keyword getProductPerspectiveKeyword_1() { return cProductPerspectiveKeyword_1; }
		
		//productPerspective=VSSSGeneralDescriptionSubsection
		public Assignment getProductPerspectiveAssignment_2() { return cProductPerspectiveAssignment_2; }
		
		//VSSSGeneralDescriptionSubsection
		public RuleCall getProductPerspectiveVSSSGeneralDescriptionSubsectionParserRuleCall_2_0() { return cProductPerspectiveVSSSGeneralDescriptionSubsectionParserRuleCall_2_0; }
		
		//'</productPerspective>'
		public Keyword getProductPerspectiveKeyword_3() { return cProductPerspectiveKeyword_3; }
		
		//'<generalCapabilities>'
		public Keyword getGeneralCapabilitiesKeyword_4() { return cGeneralCapabilitiesKeyword_4; }
		
		//generalCapabilities=VSSSGeneralDescriptionSubsection
		public Assignment getGeneralCapabilitiesAssignment_5() { return cGeneralCapabilitiesAssignment_5; }
		
		//VSSSGeneralDescriptionSubsection
		public RuleCall getGeneralCapabilitiesVSSSGeneralDescriptionSubsectionParserRuleCall_5_0() { return cGeneralCapabilitiesVSSSGeneralDescriptionSubsectionParserRuleCall_5_0; }
		
		//'</generalCapabilities>'
		public Keyword getGeneralCapabilitiesKeyword_6() { return cGeneralCapabilitiesKeyword_6; }
		
		//'<generalConstraints>'
		public Keyword getGeneralConstraintsKeyword_7() { return cGeneralConstraintsKeyword_7; }
		
		//generalConstraints=VSSSGeneralDescriptionSubsection
		public Assignment getGeneralConstraintsAssignment_8() { return cGeneralConstraintsAssignment_8; }
		
		//VSSSGeneralDescriptionSubsection
		public RuleCall getGeneralConstraintsVSSSGeneralDescriptionSubsectionParserRuleCall_8_0() { return cGeneralConstraintsVSSSGeneralDescriptionSubsectionParserRuleCall_8_0; }
		
		//'</generalConstraints>'
		public Keyword getGeneralConstraintsKeyword_9() { return cGeneralConstraintsKeyword_9; }
		
		//'<operationalEnvironment>'
		public Keyword getOperationalEnvironmentKeyword_10() { return cOperationalEnvironmentKeyword_10; }
		
		//operationalEnvironment=VSSSGeneralDescriptionSubsection
		public Assignment getOperationalEnvironmentAssignment_11() { return cOperationalEnvironmentAssignment_11; }
		
		//VSSSGeneralDescriptionSubsection
		public RuleCall getOperationalEnvironmentVSSSGeneralDescriptionSubsectionParserRuleCall_11_0() { return cOperationalEnvironmentVSSSGeneralDescriptionSubsectionParserRuleCall_11_0; }
		
		//'</operationalEnvironment>'
		public Keyword getOperationalEnvironmentKeyword_12() { return cOperationalEnvironmentKeyword_12; }
		
		//'<assumptionsDependencies>'
		public Keyword getAssumptionsDependenciesKeyword_13() { return cAssumptionsDependenciesKeyword_13; }
		
		//assumptionsDependencies=VSSSGeneralDescriptionSubsection
		public Assignment getAssumptionsDependenciesAssignment_14() { return cAssumptionsDependenciesAssignment_14; }
		
		//VSSSGeneralDescriptionSubsection
		public RuleCall getAssumptionsDependenciesVSSSGeneralDescriptionSubsectionParserRuleCall_14_0() { return cAssumptionsDependenciesVSSSGeneralDescriptionSubsectionParserRuleCall_14_0; }
		
		//'</assumptionsDependencies>'
		public Keyword getAssumptionsDependenciesKeyword_15() { return cAssumptionsDependenciesKeyword_15; }
		
		//'</GeneralDescription>'
		public Keyword getGeneralDescriptionKeyword_16() { return cGeneralDescriptionKeyword_16; }
	}
	public class VSSSSpecificRequirementsElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.micobs.svm.lang.sss.SSS.VSSSSpecificRequirements");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cSpecificRequirementsKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cGeneralAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cGeneralVSSSGeneralRequirementsParserRuleCall_1_0 = (RuleCall)cGeneralAssignment_1.eContents().get(0);
		private final Assignment cCapabilitiesAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cCapabilitiesVSSSCapabilitiesRequirementsParserRuleCall_2_0 = (RuleCall)cCapabilitiesAssignment_2.eContents().get(0);
		private final Assignment cSystemInterfaceAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cSystemInterfaceVSSSSystemInterfaceRequirementsParserRuleCall_3_0 = (RuleCall)cSystemInterfaceAssignment_3.eContents().get(0);
		private final Assignment cAdaptationMissionizationAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cAdaptationMissionizationVSSSAdaptationMissionizationRequirementsParserRuleCall_4_0 = (RuleCall)cAdaptationMissionizationAssignment_4.eContents().get(0);
		private final Assignment cComputerResourceAssignment_5 = (Assignment)cGroup.eContents().get(5);
		private final RuleCall cComputerResourceVSSSComputerResourceRequirementsParserRuleCall_5_0 = (RuleCall)cComputerResourceAssignment_5.eContents().get(0);
		private final Assignment cSecurityAssignment_6 = (Assignment)cGroup.eContents().get(6);
		private final RuleCall cSecurityVSSSSecurityRequirementsParserRuleCall_6_0 = (RuleCall)cSecurityAssignment_6.eContents().get(0);
		private final Assignment cSafetyAssignment_7 = (Assignment)cGroup.eContents().get(7);
		private final RuleCall cSafetyVSSSSafetyRequirementsParserRuleCall_7_0 = (RuleCall)cSafetyAssignment_7.eContents().get(0);
		private final Assignment cReliabiltyAvailabilityAssignment_8 = (Assignment)cGroup.eContents().get(8);
		private final RuleCall cReliabiltyAvailabilityVSSSReliabiltyAvailabilityRequirementsParserRuleCall_8_0 = (RuleCall)cReliabiltyAvailabilityAssignment_8.eContents().get(0);
		private final Assignment cQualityAssignment_9 = (Assignment)cGroup.eContents().get(9);
		private final RuleCall cQualityVSSSQualityRequirementsParserRuleCall_9_0 = (RuleCall)cQualityAssignment_9.eContents().get(0);
		private final Assignment cDesignAssignment_10 = (Assignment)cGroup.eContents().get(10);
		private final RuleCall cDesignVSSSDesignRequirementsParserRuleCall_10_0 = (RuleCall)cDesignAssignment_10.eContents().get(0);
		private final Assignment cSoftwareOperationsAssignment_11 = (Assignment)cGroup.eContents().get(11);
		private final RuleCall cSoftwareOperationsVSSSSoftwareOperationsRequirementsParserRuleCall_11_0 = (RuleCall)cSoftwareOperationsAssignment_11.eContents().get(0);
		private final Assignment cSoftwareMaintenanceAssignment_12 = (Assignment)cGroup.eContents().get(12);
		private final RuleCall cSoftwareMaintenanceVSSSSoftwareMaintenanceRequirementsParserRuleCall_12_0 = (RuleCall)cSoftwareMaintenanceAssignment_12.eContents().get(0);
		private final Assignment cSystemSoftwareObservabilityAssignment_13 = (Assignment)cGroup.eContents().get(13);
		private final RuleCall cSystemSoftwareObservabilityVSSSSystemSoftwareObservabilityRequirementsParserRuleCall_13_0 = (RuleCall)cSystemSoftwareObservabilityAssignment_13.eContents().get(0);
		private final Keyword cSpecificRequirementsKeyword_14 = (Keyword)cGroup.eContents().get(14);
		
		//VSSSSpecificRequirements:
		//	'<SpecificRequirements>'
		//	general=VSSSGeneralRequirements
		//	capabilities=VSSSCapabilitiesRequirements
		//	systemInterface=VSSSSystemInterfaceRequirements
		//	adaptationMissionization=VSSSAdaptationMissionizationRequirements
		//	computerResource=VSSSComputerResourceRequirements
		//	security=VSSSSecurityRequirements
		//	safety=VSSSSafetyRequirements
		//	reliabiltyAvailability=VSSSReliabiltyAvailabilityRequirements
		//	quality=VSSSQualityRequirements
		//	design=VSSSDesignRequirements
		//	softwareOperations=VSSSSoftwareOperationsRequirements
		//	softwareMaintenance=VSSSSoftwareMaintenanceRequirements
		//	systemSoftwareObservability=VSSSSystemSoftwareObservabilityRequirements
		//	'</SpecificRequirements>';
		@Override public ParserRule getRule() { return rule; }
		
		//'<SpecificRequirements>' general=VSSSGeneralRequirements capabilities=VSSSCapabilitiesRequirements
		//systemInterface=VSSSSystemInterfaceRequirements adaptationMissionization=VSSSAdaptationMissionizationRequirements
		//computerResource=VSSSComputerResourceRequirements security=VSSSSecurityRequirements safety=VSSSSafetyRequirements
		//reliabiltyAvailability=VSSSReliabiltyAvailabilityRequirements quality=VSSSQualityRequirements
		//design=VSSSDesignRequirements softwareOperations=VSSSSoftwareOperationsRequirements
		//softwareMaintenance=VSSSSoftwareMaintenanceRequirements
		//systemSoftwareObservability=VSSSSystemSoftwareObservabilityRequirements '</SpecificRequirements>'
		public Group getGroup() { return cGroup; }
		
		//'<SpecificRequirements>'
		public Keyword getSpecificRequirementsKeyword_0() { return cSpecificRequirementsKeyword_0; }
		
		//general=VSSSGeneralRequirements
		public Assignment getGeneralAssignment_1() { return cGeneralAssignment_1; }
		
		//VSSSGeneralRequirements
		public RuleCall getGeneralVSSSGeneralRequirementsParserRuleCall_1_0() { return cGeneralVSSSGeneralRequirementsParserRuleCall_1_0; }
		
		//capabilities=VSSSCapabilitiesRequirements
		public Assignment getCapabilitiesAssignment_2() { return cCapabilitiesAssignment_2; }
		
		//VSSSCapabilitiesRequirements
		public RuleCall getCapabilitiesVSSSCapabilitiesRequirementsParserRuleCall_2_0() { return cCapabilitiesVSSSCapabilitiesRequirementsParserRuleCall_2_0; }
		
		//systemInterface=VSSSSystemInterfaceRequirements
		public Assignment getSystemInterfaceAssignment_3() { return cSystemInterfaceAssignment_3; }
		
		//VSSSSystemInterfaceRequirements
		public RuleCall getSystemInterfaceVSSSSystemInterfaceRequirementsParserRuleCall_3_0() { return cSystemInterfaceVSSSSystemInterfaceRequirementsParserRuleCall_3_0; }
		
		//adaptationMissionization=VSSSAdaptationMissionizationRequirements
		public Assignment getAdaptationMissionizationAssignment_4() { return cAdaptationMissionizationAssignment_4; }
		
		//VSSSAdaptationMissionizationRequirements
		public RuleCall getAdaptationMissionizationVSSSAdaptationMissionizationRequirementsParserRuleCall_4_0() { return cAdaptationMissionizationVSSSAdaptationMissionizationRequirementsParserRuleCall_4_0; }
		
		//computerResource=VSSSComputerResourceRequirements
		public Assignment getComputerResourceAssignment_5() { return cComputerResourceAssignment_5; }
		
		//VSSSComputerResourceRequirements
		public RuleCall getComputerResourceVSSSComputerResourceRequirementsParserRuleCall_5_0() { return cComputerResourceVSSSComputerResourceRequirementsParserRuleCall_5_0; }
		
		//security=VSSSSecurityRequirements
		public Assignment getSecurityAssignment_6() { return cSecurityAssignment_6; }
		
		//VSSSSecurityRequirements
		public RuleCall getSecurityVSSSSecurityRequirementsParserRuleCall_6_0() { return cSecurityVSSSSecurityRequirementsParserRuleCall_6_0; }
		
		//safety=VSSSSafetyRequirements
		public Assignment getSafetyAssignment_7() { return cSafetyAssignment_7; }
		
		//VSSSSafetyRequirements
		public RuleCall getSafetyVSSSSafetyRequirementsParserRuleCall_7_0() { return cSafetyVSSSSafetyRequirementsParserRuleCall_7_0; }
		
		//reliabiltyAvailability=VSSSReliabiltyAvailabilityRequirements
		public Assignment getReliabiltyAvailabilityAssignment_8() { return cReliabiltyAvailabilityAssignment_8; }
		
		//VSSSReliabiltyAvailabilityRequirements
		public RuleCall getReliabiltyAvailabilityVSSSReliabiltyAvailabilityRequirementsParserRuleCall_8_0() { return cReliabiltyAvailabilityVSSSReliabiltyAvailabilityRequirementsParserRuleCall_8_0; }
		
		//quality=VSSSQualityRequirements
		public Assignment getQualityAssignment_9() { return cQualityAssignment_9; }
		
		//VSSSQualityRequirements
		public RuleCall getQualityVSSSQualityRequirementsParserRuleCall_9_0() { return cQualityVSSSQualityRequirementsParserRuleCall_9_0; }
		
		//design=VSSSDesignRequirements
		public Assignment getDesignAssignment_10() { return cDesignAssignment_10; }
		
		//VSSSDesignRequirements
		public RuleCall getDesignVSSSDesignRequirementsParserRuleCall_10_0() { return cDesignVSSSDesignRequirementsParserRuleCall_10_0; }
		
		//softwareOperations=VSSSSoftwareOperationsRequirements
		public Assignment getSoftwareOperationsAssignment_11() { return cSoftwareOperationsAssignment_11; }
		
		//VSSSSoftwareOperationsRequirements
		public RuleCall getSoftwareOperationsVSSSSoftwareOperationsRequirementsParserRuleCall_11_0() { return cSoftwareOperationsVSSSSoftwareOperationsRequirementsParserRuleCall_11_0; }
		
		//softwareMaintenance=VSSSSoftwareMaintenanceRequirements
		public Assignment getSoftwareMaintenanceAssignment_12() { return cSoftwareMaintenanceAssignment_12; }
		
		//VSSSSoftwareMaintenanceRequirements
		public RuleCall getSoftwareMaintenanceVSSSSoftwareMaintenanceRequirementsParserRuleCall_12_0() { return cSoftwareMaintenanceVSSSSoftwareMaintenanceRequirementsParserRuleCall_12_0; }
		
		//systemSoftwareObservability=VSSSSystemSoftwareObservabilityRequirements
		public Assignment getSystemSoftwareObservabilityAssignment_13() { return cSystemSoftwareObservabilityAssignment_13; }
		
		//VSSSSystemSoftwareObservabilityRequirements
		public RuleCall getSystemSoftwareObservabilityVSSSSystemSoftwareObservabilityRequirementsParserRuleCall_13_0() { return cSystemSoftwareObservabilityVSSSSystemSoftwareObservabilityRequirementsParserRuleCall_13_0; }
		
		//'</SpecificRequirements>'
		public Keyword getSpecificRequirementsKeyword_14() { return cSpecificRequirementsKeyword_14; }
	}
	public class VSSSVerificationValidationIntegrationRequirementsElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.micobs.svm.lang.sss.SSS.VSSSVerificationValidationIntegrationRequirements");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cVerificationValidationIntegrationRequirementsKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cVerificationValidationProcessAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cVerificationValidationProcessVSSSVerificationValidationProcessRequirementsParserRuleCall_1_0 = (RuleCall)cVerificationValidationProcessAssignment_1.eContents().get(0);
		private final Assignment cValidationApproachAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cValidationApproachVSSSValidationApproachParserRuleCall_2_0 = (RuleCall)cValidationApproachAssignment_2.eContents().get(0);
		private final Assignment cValidationAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cValidationVSSSValidationRequirementsParserRuleCall_3_0 = (RuleCall)cValidationAssignment_3.eContents().get(0);
		private final Assignment cVerificationAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cVerificationVSSSVerificationRequirementsParserRuleCall_4_0 = (RuleCall)cVerificationAssignment_4.eContents().get(0);
		private final Keyword cVerificationValidationIntegrationRequirementsKeyword_5 = (Keyword)cGroup.eContents().get(5);
		
		//VSSSVerificationValidationIntegrationRequirements:
		//	'<VerificationValidationIntegrationRequirements>'
		//	verificationValidationProcess=VSSSVerificationValidationProcessRequirements
		//	validationApproach=VSSSValidationApproach
		//	validation=VSSSValidationRequirements
		//	verification=VSSSVerificationRequirements
		//	'</VerificationValidationIntegrationRequirements>';
		@Override public ParserRule getRule() { return rule; }
		
		//'<VerificationValidationIntegrationRequirements>'
		//verificationValidationProcess=VSSSVerificationValidationProcessRequirements validationApproach=VSSSValidationApproach
		//validation=VSSSValidationRequirements verification=VSSSVerificationRequirements
		//'</VerificationValidationIntegrationRequirements>'
		public Group getGroup() { return cGroup; }
		
		//'<VerificationValidationIntegrationRequirements>'
		public Keyword getVerificationValidationIntegrationRequirementsKeyword_0() { return cVerificationValidationIntegrationRequirementsKeyword_0; }
		
		//verificationValidationProcess=VSSSVerificationValidationProcessRequirements
		public Assignment getVerificationValidationProcessAssignment_1() { return cVerificationValidationProcessAssignment_1; }
		
		//VSSSVerificationValidationProcessRequirements
		public RuleCall getVerificationValidationProcessVSSSVerificationValidationProcessRequirementsParserRuleCall_1_0() { return cVerificationValidationProcessVSSSVerificationValidationProcessRequirementsParserRuleCall_1_0; }
		
		//validationApproach=VSSSValidationApproach
		public Assignment getValidationApproachAssignment_2() { return cValidationApproachAssignment_2; }
		
		//VSSSValidationApproach
		public RuleCall getValidationApproachVSSSValidationApproachParserRuleCall_2_0() { return cValidationApproachVSSSValidationApproachParserRuleCall_2_0; }
		
		//validation=VSSSValidationRequirements
		public Assignment getValidationAssignment_3() { return cValidationAssignment_3; }
		
		//VSSSValidationRequirements
		public RuleCall getValidationVSSSValidationRequirementsParserRuleCall_3_0() { return cValidationVSSSValidationRequirementsParserRuleCall_3_0; }
		
		//verification=VSSSVerificationRequirements
		public Assignment getVerificationAssignment_4() { return cVerificationAssignment_4; }
		
		//VSSSVerificationRequirements
		public RuleCall getVerificationVSSSVerificationRequirementsParserRuleCall_4_0() { return cVerificationVSSSVerificationRequirementsParserRuleCall_4_0; }
		
		//'</VerificationValidationIntegrationRequirements>'
		public Keyword getVerificationValidationIntegrationRequirementsKeyword_5() { return cVerificationValidationIntegrationRequirementsKeyword_5; }
	}
	public class VSSSSystemModelsElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.micobs.svm.lang.sss.SSS.VSSSSystemModels");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cVSSSSystemModelsAction_0 = (Action)cGroup.eContents().get(0);
		private final Keyword cSystemModelsKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cSystemModelsAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cSystemModelsVSSSSystemModelParserRuleCall_2_0 = (RuleCall)cSystemModelsAssignment_2.eContents().get(0);
		private final Keyword cSystemModelsKeyword_3 = (Keyword)cGroup.eContents().get(3);
		
		//VSSSSystemModels:
		//	{VSSSSystemModels}
		//	'<SystemModels>'
		//	systemModels+=VSSSSystemModel*
		//	'</SystemModels>';
		@Override public ParserRule getRule() { return rule; }
		
		//{VSSSSystemModels} '<SystemModels>' systemModels+=VSSSSystemModel* '</SystemModels>'
		public Group getGroup() { return cGroup; }
		
		//{VSSSSystemModels}
		public Action getVSSSSystemModelsAction_0() { return cVSSSSystemModelsAction_0; }
		
		//'<SystemModels>'
		public Keyword getSystemModelsKeyword_1() { return cSystemModelsKeyword_1; }
		
		//systemModels+=VSSSSystemModel*
		public Assignment getSystemModelsAssignment_2() { return cSystemModelsAssignment_2; }
		
		//VSSSSystemModel
		public RuleCall getSystemModelsVSSSSystemModelParserRuleCall_2_0() { return cSystemModelsVSSSSystemModelParserRuleCall_2_0; }
		
		//'</SystemModels>'
		public Keyword getSystemModelsKeyword_3() { return cSystemModelsKeyword_3; }
	}
	public class VSSSTermElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.micobs.svm.lang.sss.SSS.VSSSTerm");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cTermKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cNameKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cNameAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cNameSTRINGTerminalRuleCall_2_0 = (RuleCall)cNameAssignment_2.eContents().get(0);
		private final Keyword cGreaterThanSignKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Assignment cDescriptionAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cDescriptionDRunParserRuleCall_4_0 = (RuleCall)cDescriptionAssignment_4.eContents().get(0);
		private final Keyword cTermKeyword_5 = (Keyword)cGroup.eContents().get(5);
		
		//VSSSTerm:
		//	'<Term'
		//	'name=' name=STRING '>'
		//	description=DRun
		//	'</Term>';
		@Override public ParserRule getRule() { return rule; }
		
		//'<Term' 'name=' name=STRING '>' description=DRun '</Term>'
		public Group getGroup() { return cGroup; }
		
		//'<Term'
		public Keyword getTermKeyword_0() { return cTermKeyword_0; }
		
		//'name='
		public Keyword getNameKeyword_1() { return cNameKeyword_1; }
		
		//name=STRING
		public Assignment getNameAssignment_2() { return cNameAssignment_2; }
		
		//STRING
		public RuleCall getNameSTRINGTerminalRuleCall_2_0() { return cNameSTRINGTerminalRuleCall_2_0; }
		
		//'>'
		public Keyword getGreaterThanSignKeyword_3() { return cGreaterThanSignKeyword_3; }
		
		//description=DRun
		public Assignment getDescriptionAssignment_4() { return cDescriptionAssignment_4; }
		
		//DRun
		public RuleCall getDescriptionDRunParserRuleCall_4_0() { return cDescriptionDRunParserRuleCall_4_0; }
		
		//'</Term>'
		public Keyword getTermKeyword_5() { return cTermKeyword_5; }
	}
	public class VSSSDefinitionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.micobs.svm.lang.sss.SSS.VSSSDefinition");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cDefinitionKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cNameKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cNameAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cNameSTRINGTerminalRuleCall_2_0 = (RuleCall)cNameAssignment_2.eContents().get(0);
		private final Keyword cGreaterThanSignKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Assignment cDescriptionAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cDescriptionDRunParserRuleCall_4_0 = (RuleCall)cDescriptionAssignment_4.eContents().get(0);
		private final Keyword cDefinitionKeyword_5 = (Keyword)cGroup.eContents().get(5);
		
		//VSSSDefinition:
		//	'<Definition'
		//	'name=' name=STRING '>'
		//	description=DRun
		//	'</Definition>';
		@Override public ParserRule getRule() { return rule; }
		
		//'<Definition' 'name=' name=STRING '>' description=DRun '</Definition>'
		public Group getGroup() { return cGroup; }
		
		//'<Definition'
		public Keyword getDefinitionKeyword_0() { return cDefinitionKeyword_0; }
		
		//'name='
		public Keyword getNameKeyword_1() { return cNameKeyword_1; }
		
		//name=STRING
		public Assignment getNameAssignment_2() { return cNameAssignment_2; }
		
		//STRING
		public RuleCall getNameSTRINGTerminalRuleCall_2_0() { return cNameSTRINGTerminalRuleCall_2_0; }
		
		//'>'
		public Keyword getGreaterThanSignKeyword_3() { return cGreaterThanSignKeyword_3; }
		
		//description=DRun
		public Assignment getDescriptionAssignment_4() { return cDescriptionAssignment_4; }
		
		//DRun
		public RuleCall getDescriptionDRunParserRuleCall_4_0() { return cDescriptionDRunParserRuleCall_4_0; }
		
		//'</Definition>'
		public Keyword getDefinitionKeyword_5() { return cDefinitionKeyword_5; }
	}
	public class VSSSAbbreviationElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.micobs.svm.lang.sss.SSS.VSSSAbbreviation");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cAbbreviationKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cNameKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cNameAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cNameSTRINGTerminalRuleCall_2_0 = (RuleCall)cNameAssignment_2.eContents().get(0);
		private final Keyword cGreaterThanSignKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Assignment cDescriptionAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cDescriptionDRunParserRuleCall_4_0 = (RuleCall)cDescriptionAssignment_4.eContents().get(0);
		private final Keyword cAbbreviationKeyword_5 = (Keyword)cGroup.eContents().get(5);
		
		//VSSSAbbreviation:
		//	'<Abbreviation'
		//	'name=' name=STRING '>'
		//	description=DRun
		//	'</Abbreviation>';
		@Override public ParserRule getRule() { return rule; }
		
		//'<Abbreviation' 'name=' name=STRING '>' description=DRun '</Abbreviation>'
		public Group getGroup() { return cGroup; }
		
		//'<Abbreviation'
		public Keyword getAbbreviationKeyword_0() { return cAbbreviationKeyword_0; }
		
		//'name='
		public Keyword getNameKeyword_1() { return cNameKeyword_1; }
		
		//name=STRING
		public Assignment getNameAssignment_2() { return cNameAssignment_2; }
		
		//STRING
		public RuleCall getNameSTRINGTerminalRuleCall_2_0() { return cNameSTRINGTerminalRuleCall_2_0; }
		
		//'>'
		public Keyword getGreaterThanSignKeyword_3() { return cGreaterThanSignKeyword_3; }
		
		//description=DRun
		public Assignment getDescriptionAssignment_4() { return cDescriptionAssignment_4; }
		
		//DRun
		public RuleCall getDescriptionDRunParserRuleCall_4_0() { return cDescriptionDRunParserRuleCall_4_0; }
		
		//'</Abbreviation>'
		public Keyword getAbbreviationKeyword_5() { return cAbbreviationKeyword_5; }
	}
	public class VSSSGeneralDescriptionSubsectionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.micobs.svm.lang.sss.SSS.VSSSGeneralDescriptionSubsection");
		private final Assignment cBodyAssignment = (Assignment)rule.eContents().get(1);
		private final RuleCall cBodyDBodyParserRuleCall_0 = (RuleCall)cBodyAssignment.eContents().get(0);
		
		//VSSSGeneralDescriptionSubsection:
		//	body=DBody;
		@Override public ParserRule getRule() { return rule; }
		
		//body=DBody
		public Assignment getBodyAssignment() { return cBodyAssignment; }
		
		//DBody
		public RuleCall getBodyDBodyParserRuleCall_0() { return cBodyDBodyParserRuleCall_0; }
	}
	public class VSSSGeneralRequirementsElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.micobs.svm.lang.sss.SSS.VSSSGeneralRequirements");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cVSSSGeneralRequirementsAction_0 = (Action)cGroup.eContents().get(0);
		private final Keyword cGeneralRequirementsKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cSssItemsAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cSssItemsVSSSDocumentItemParserRuleCall_2_0 = (RuleCall)cSssItemsAssignment_2.eContents().get(0);
		private final Keyword cGeneralRequirementsKeyword_3 = (Keyword)cGroup.eContents().get(3);
		
		//VSSSGeneralRequirements:
		//	{VSSSGeneralRequirements}
		//	'<GeneralRequirements>'
		//	sssItems+=VSSSDocumentItem*
		//	'</GeneralRequirements>';
		@Override public ParserRule getRule() { return rule; }
		
		//{VSSSGeneralRequirements} '<GeneralRequirements>' sssItems+=VSSSDocumentItem* '</GeneralRequirements>'
		public Group getGroup() { return cGroup; }
		
		//{VSSSGeneralRequirements}
		public Action getVSSSGeneralRequirementsAction_0() { return cVSSSGeneralRequirementsAction_0; }
		
		//'<GeneralRequirements>'
		public Keyword getGeneralRequirementsKeyword_1() { return cGeneralRequirementsKeyword_1; }
		
		//sssItems+=VSSSDocumentItem*
		public Assignment getSssItemsAssignment_2() { return cSssItemsAssignment_2; }
		
		//VSSSDocumentItem
		public RuleCall getSssItemsVSSSDocumentItemParserRuleCall_2_0() { return cSssItemsVSSSDocumentItemParserRuleCall_2_0; }
		
		//'</GeneralRequirements>'
		public Keyword getGeneralRequirementsKeyword_3() { return cGeneralRequirementsKeyword_3; }
	}
	public class VSSSCapabilitiesRequirementsElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.micobs.svm.lang.sss.SSS.VSSSCapabilitiesRequirements");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cVSSSCapabilitiesRequirementsAction_0 = (Action)cGroup.eContents().get(0);
		private final Keyword cCapabilitiesRequirementsKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cSssItemsAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cSssItemsVSSSDocumentItemParserRuleCall_2_0 = (RuleCall)cSssItemsAssignment_2.eContents().get(0);
		private final Keyword cCapabilitiesRequirementsKeyword_3 = (Keyword)cGroup.eContents().get(3);
		
		//VSSSCapabilitiesRequirements:
		//	{VSSSCapabilitiesRequirements}
		//	'<CapabilitiesRequirements>'
		//	sssItems+=VSSSDocumentItem*
		//	'</CapabilitiesRequirements>';
		@Override public ParserRule getRule() { return rule; }
		
		//{VSSSCapabilitiesRequirements} '<CapabilitiesRequirements>' sssItems+=VSSSDocumentItem* '</CapabilitiesRequirements>'
		public Group getGroup() { return cGroup; }
		
		//{VSSSCapabilitiesRequirements}
		public Action getVSSSCapabilitiesRequirementsAction_0() { return cVSSSCapabilitiesRequirementsAction_0; }
		
		//'<CapabilitiesRequirements>'
		public Keyword getCapabilitiesRequirementsKeyword_1() { return cCapabilitiesRequirementsKeyword_1; }
		
		//sssItems+=VSSSDocumentItem*
		public Assignment getSssItemsAssignment_2() { return cSssItemsAssignment_2; }
		
		//VSSSDocumentItem
		public RuleCall getSssItemsVSSSDocumentItemParserRuleCall_2_0() { return cSssItemsVSSSDocumentItemParserRuleCall_2_0; }
		
		//'</CapabilitiesRequirements>'
		public Keyword getCapabilitiesRequirementsKeyword_3() { return cCapabilitiesRequirementsKeyword_3; }
	}
	public class VSSSSystemInterfaceRequirementsElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.micobs.svm.lang.sss.SSS.VSSSSystemInterfaceRequirements");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cVSSSSystemInterfaceRequirementsAction_0 = (Action)cGroup.eContents().get(0);
		private final Keyword cSystemInterfaceRequirementsKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cSssItemsAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cSssItemsVSSSDocumentItemParserRuleCall_2_0 = (RuleCall)cSssItemsAssignment_2.eContents().get(0);
		private final Keyword cSystemInterfaceRequirementsKeyword_3 = (Keyword)cGroup.eContents().get(3);
		
		//VSSSSystemInterfaceRequirements:
		//	{VSSSSystemInterfaceRequirements}
		//	'<SystemInterfaceRequirements>'
		//	sssItems+=VSSSDocumentItem*
		//	'</SystemInterfaceRequirements>';
		@Override public ParserRule getRule() { return rule; }
		
		//{VSSSSystemInterfaceRequirements} '<SystemInterfaceRequirements>' sssItems+=VSSSDocumentItem*
		//'</SystemInterfaceRequirements>'
		public Group getGroup() { return cGroup; }
		
		//{VSSSSystemInterfaceRequirements}
		public Action getVSSSSystemInterfaceRequirementsAction_0() { return cVSSSSystemInterfaceRequirementsAction_0; }
		
		//'<SystemInterfaceRequirements>'
		public Keyword getSystemInterfaceRequirementsKeyword_1() { return cSystemInterfaceRequirementsKeyword_1; }
		
		//sssItems+=VSSSDocumentItem*
		public Assignment getSssItemsAssignment_2() { return cSssItemsAssignment_2; }
		
		//VSSSDocumentItem
		public RuleCall getSssItemsVSSSDocumentItemParserRuleCall_2_0() { return cSssItemsVSSSDocumentItemParserRuleCall_2_0; }
		
		//'</SystemInterfaceRequirements>'
		public Keyword getSystemInterfaceRequirementsKeyword_3() { return cSystemInterfaceRequirementsKeyword_3; }
	}
	public class VSSSAdaptationMissionizationRequirementsElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.micobs.svm.lang.sss.SSS.VSSSAdaptationMissionizationRequirements");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cVSSSAdaptationMissionizationRequirementsAction_0 = (Action)cGroup.eContents().get(0);
		private final Keyword cVSSSAdaptationMissionizationRequirementsKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cSssItemsAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cSssItemsVSSSDocumentItemParserRuleCall_2_0 = (RuleCall)cSssItemsAssignment_2.eContents().get(0);
		private final Keyword cVSSSAdaptationMissionizationRequirementsKeyword_3 = (Keyword)cGroup.eContents().get(3);
		
		//VSSSAdaptationMissionizationRequirements:
		//	{VSSSAdaptationMissionizationRequirements}
		//	'<VSSSAdaptationMissionizationRequirements>'
		//	sssItems+=VSSSDocumentItem*
		//	'</VSSSAdaptationMissionizationRequirements>';
		@Override public ParserRule getRule() { return rule; }
		
		//{VSSSAdaptationMissionizationRequirements} '<VSSSAdaptationMissionizationRequirements>' sssItems+=VSSSDocumentItem*
		//'</VSSSAdaptationMissionizationRequirements>'
		public Group getGroup() { return cGroup; }
		
		//{VSSSAdaptationMissionizationRequirements}
		public Action getVSSSAdaptationMissionizationRequirementsAction_0() { return cVSSSAdaptationMissionizationRequirementsAction_0; }
		
		//'<VSSSAdaptationMissionizationRequirements>'
		public Keyword getVSSSAdaptationMissionizationRequirementsKeyword_1() { return cVSSSAdaptationMissionizationRequirementsKeyword_1; }
		
		//sssItems+=VSSSDocumentItem*
		public Assignment getSssItemsAssignment_2() { return cSssItemsAssignment_2; }
		
		//VSSSDocumentItem
		public RuleCall getSssItemsVSSSDocumentItemParserRuleCall_2_0() { return cSssItemsVSSSDocumentItemParserRuleCall_2_0; }
		
		//'</VSSSAdaptationMissionizationRequirements>'
		public Keyword getVSSSAdaptationMissionizationRequirementsKeyword_3() { return cVSSSAdaptationMissionizationRequirementsKeyword_3; }
	}
	public class VSSSComputerResourceRequirementsElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.micobs.svm.lang.sss.SSS.VSSSComputerResourceRequirements");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cVSSSComputerResourceRequirementsAction_0 = (Action)cGroup.eContents().get(0);
		private final Keyword cComputerResourceRequirementsKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cSssItemsAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cSssItemsVSSSDocumentItemParserRuleCall_2_0 = (RuleCall)cSssItemsAssignment_2.eContents().get(0);
		private final Keyword cComputerResourceRequirementsKeyword_3 = (Keyword)cGroup.eContents().get(3);
		
		//VSSSComputerResourceRequirements:
		//	{VSSSComputerResourceRequirements}
		//	'<ComputerResourceRequirements>'
		//	sssItems+=VSSSDocumentItem*
		//	'</ComputerResourceRequirements>';
		@Override public ParserRule getRule() { return rule; }
		
		//{VSSSComputerResourceRequirements} '<ComputerResourceRequirements>' sssItems+=VSSSDocumentItem*
		//'</ComputerResourceRequirements>'
		public Group getGroup() { return cGroup; }
		
		//{VSSSComputerResourceRequirements}
		public Action getVSSSComputerResourceRequirementsAction_0() { return cVSSSComputerResourceRequirementsAction_0; }
		
		//'<ComputerResourceRequirements>'
		public Keyword getComputerResourceRequirementsKeyword_1() { return cComputerResourceRequirementsKeyword_1; }
		
		//sssItems+=VSSSDocumentItem*
		public Assignment getSssItemsAssignment_2() { return cSssItemsAssignment_2; }
		
		//VSSSDocumentItem
		public RuleCall getSssItemsVSSSDocumentItemParserRuleCall_2_0() { return cSssItemsVSSSDocumentItemParserRuleCall_2_0; }
		
		//'</ComputerResourceRequirements>'
		public Keyword getComputerResourceRequirementsKeyword_3() { return cComputerResourceRequirementsKeyword_3; }
	}
	public class VSSSSecurityRequirementsElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.micobs.svm.lang.sss.SSS.VSSSSecurityRequirements");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cVSSSSecurityRequirementsAction_0 = (Action)cGroup.eContents().get(0);
		private final Keyword cSecurityRequirementsKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cSssItemsAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cSssItemsVSSSDocumentItemParserRuleCall_2_0 = (RuleCall)cSssItemsAssignment_2.eContents().get(0);
		private final Keyword cSecurityRequirementsKeyword_3 = (Keyword)cGroup.eContents().get(3);
		
		//VSSSSecurityRequirements:
		//	{VSSSSecurityRequirements}
		//	'<SecurityRequirements>'
		//	sssItems+=VSSSDocumentItem*
		//	'</SecurityRequirements>';
		@Override public ParserRule getRule() { return rule; }
		
		//{VSSSSecurityRequirements} '<SecurityRequirements>' sssItems+=VSSSDocumentItem* '</SecurityRequirements>'
		public Group getGroup() { return cGroup; }
		
		//{VSSSSecurityRequirements}
		public Action getVSSSSecurityRequirementsAction_0() { return cVSSSSecurityRequirementsAction_0; }
		
		//'<SecurityRequirements>'
		public Keyword getSecurityRequirementsKeyword_1() { return cSecurityRequirementsKeyword_1; }
		
		//sssItems+=VSSSDocumentItem*
		public Assignment getSssItemsAssignment_2() { return cSssItemsAssignment_2; }
		
		//VSSSDocumentItem
		public RuleCall getSssItemsVSSSDocumentItemParserRuleCall_2_0() { return cSssItemsVSSSDocumentItemParserRuleCall_2_0; }
		
		//'</SecurityRequirements>'
		public Keyword getSecurityRequirementsKeyword_3() { return cSecurityRequirementsKeyword_3; }
	}
	public class VSSSSafetyRequirementsElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.micobs.svm.lang.sss.SSS.VSSSSafetyRequirements");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cVSSSSafetyRequirementsAction_0 = (Action)cGroup.eContents().get(0);
		private final Keyword cSafetyRequirementsKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cSssItemsAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cSssItemsVSSSDocumentItemParserRuleCall_2_0 = (RuleCall)cSssItemsAssignment_2.eContents().get(0);
		private final Keyword cSafetyRequirementsKeyword_3 = (Keyword)cGroup.eContents().get(3);
		
		//VSSSSafetyRequirements:
		//	{VSSSSafetyRequirements}
		//	'<SafetyRequirements>'
		//	sssItems+=VSSSDocumentItem*
		//	'</SafetyRequirements>';
		@Override public ParserRule getRule() { return rule; }
		
		//{VSSSSafetyRequirements} '<SafetyRequirements>' sssItems+=VSSSDocumentItem* '</SafetyRequirements>'
		public Group getGroup() { return cGroup; }
		
		//{VSSSSafetyRequirements}
		public Action getVSSSSafetyRequirementsAction_0() { return cVSSSSafetyRequirementsAction_0; }
		
		//'<SafetyRequirements>'
		public Keyword getSafetyRequirementsKeyword_1() { return cSafetyRequirementsKeyword_1; }
		
		//sssItems+=VSSSDocumentItem*
		public Assignment getSssItemsAssignment_2() { return cSssItemsAssignment_2; }
		
		//VSSSDocumentItem
		public RuleCall getSssItemsVSSSDocumentItemParserRuleCall_2_0() { return cSssItemsVSSSDocumentItemParserRuleCall_2_0; }
		
		//'</SafetyRequirements>'
		public Keyword getSafetyRequirementsKeyword_3() { return cSafetyRequirementsKeyword_3; }
	}
	public class VSSSReliabiltyAvailabilityRequirementsElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.micobs.svm.lang.sss.SSS.VSSSReliabiltyAvailabilityRequirements");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cVSSSReliabiltyAvailabilityRequirementsAction_0 = (Action)cGroup.eContents().get(0);
		private final Keyword cReliabiltyAvailabilityRequirementsKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cSssItemsAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cSssItemsVSSSDocumentItemParserRuleCall_2_0 = (RuleCall)cSssItemsAssignment_2.eContents().get(0);
		private final Keyword cReliabiltyAvailabilityRequirementsKeyword_3 = (Keyword)cGroup.eContents().get(3);
		
		//VSSSReliabiltyAvailabilityRequirements:
		//	{VSSSReliabiltyAvailabilityRequirements}
		//	'<ReliabiltyAvailabilityRequirements>'
		//	sssItems+=VSSSDocumentItem*
		//	'</ReliabiltyAvailabilityRequirements>';
		@Override public ParserRule getRule() { return rule; }
		
		//{VSSSReliabiltyAvailabilityRequirements} '<ReliabiltyAvailabilityRequirements>' sssItems+=VSSSDocumentItem*
		//'</ReliabiltyAvailabilityRequirements>'
		public Group getGroup() { return cGroup; }
		
		//{VSSSReliabiltyAvailabilityRequirements}
		public Action getVSSSReliabiltyAvailabilityRequirementsAction_0() { return cVSSSReliabiltyAvailabilityRequirementsAction_0; }
		
		//'<ReliabiltyAvailabilityRequirements>'
		public Keyword getReliabiltyAvailabilityRequirementsKeyword_1() { return cReliabiltyAvailabilityRequirementsKeyword_1; }
		
		//sssItems+=VSSSDocumentItem*
		public Assignment getSssItemsAssignment_2() { return cSssItemsAssignment_2; }
		
		//VSSSDocumentItem
		public RuleCall getSssItemsVSSSDocumentItemParserRuleCall_2_0() { return cSssItemsVSSSDocumentItemParserRuleCall_2_0; }
		
		//'</ReliabiltyAvailabilityRequirements>'
		public Keyword getReliabiltyAvailabilityRequirementsKeyword_3() { return cReliabiltyAvailabilityRequirementsKeyword_3; }
	}
	public class VSSSQualityRequirementsElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.micobs.svm.lang.sss.SSS.VSSSQualityRequirements");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cVSSSQualityRequirementsAction_0 = (Action)cGroup.eContents().get(0);
		private final Keyword cQualityRequirementsKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cSssItemsAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cSssItemsVSSSDocumentItemParserRuleCall_2_0 = (RuleCall)cSssItemsAssignment_2.eContents().get(0);
		private final Keyword cQualityRequirementsKeyword_3 = (Keyword)cGroup.eContents().get(3);
		
		//VSSSQualityRequirements:
		//	{VSSSQualityRequirements}
		//	'<QualityRequirements>'
		//	sssItems+=VSSSDocumentItem*
		//	'</QualityRequirements>';
		@Override public ParserRule getRule() { return rule; }
		
		//{VSSSQualityRequirements} '<QualityRequirements>' sssItems+=VSSSDocumentItem* '</QualityRequirements>'
		public Group getGroup() { return cGroup; }
		
		//{VSSSQualityRequirements}
		public Action getVSSSQualityRequirementsAction_0() { return cVSSSQualityRequirementsAction_0; }
		
		//'<QualityRequirements>'
		public Keyword getQualityRequirementsKeyword_1() { return cQualityRequirementsKeyword_1; }
		
		//sssItems+=VSSSDocumentItem*
		public Assignment getSssItemsAssignment_2() { return cSssItemsAssignment_2; }
		
		//VSSSDocumentItem
		public RuleCall getSssItemsVSSSDocumentItemParserRuleCall_2_0() { return cSssItemsVSSSDocumentItemParserRuleCall_2_0; }
		
		//'</QualityRequirements>'
		public Keyword getQualityRequirementsKeyword_3() { return cQualityRequirementsKeyword_3; }
	}
	public class VSSSDesignRequirementsElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.micobs.svm.lang.sss.SSS.VSSSDesignRequirements");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cVSSSDesignRequirementsAction_0 = (Action)cGroup.eContents().get(0);
		private final Keyword cDesignRequirementsKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cSssItemsAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cSssItemsVSSSDocumentItemParserRuleCall_2_0 = (RuleCall)cSssItemsAssignment_2.eContents().get(0);
		private final Keyword cDesignRequirementsKeyword_3 = (Keyword)cGroup.eContents().get(3);
		
		//VSSSDesignRequirements:
		//	{VSSSDesignRequirements}
		//	'<DesignRequirements>'
		//	sssItems+=VSSSDocumentItem*
		//	'</DesignRequirements>';
		@Override public ParserRule getRule() { return rule; }
		
		//{VSSSDesignRequirements} '<DesignRequirements>' sssItems+=VSSSDocumentItem* '</DesignRequirements>'
		public Group getGroup() { return cGroup; }
		
		//{VSSSDesignRequirements}
		public Action getVSSSDesignRequirementsAction_0() { return cVSSSDesignRequirementsAction_0; }
		
		//'<DesignRequirements>'
		public Keyword getDesignRequirementsKeyword_1() { return cDesignRequirementsKeyword_1; }
		
		//sssItems+=VSSSDocumentItem*
		public Assignment getSssItemsAssignment_2() { return cSssItemsAssignment_2; }
		
		//VSSSDocumentItem
		public RuleCall getSssItemsVSSSDocumentItemParserRuleCall_2_0() { return cSssItemsVSSSDocumentItemParserRuleCall_2_0; }
		
		//'</DesignRequirements>'
		public Keyword getDesignRequirementsKeyword_3() { return cDesignRequirementsKeyword_3; }
	}
	public class VSSSSoftwareOperationsRequirementsElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.micobs.svm.lang.sss.SSS.VSSSSoftwareOperationsRequirements");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cVSSSSoftwareOperationsRequirementsAction_0 = (Action)cGroup.eContents().get(0);
		private final Keyword cSoftwareOperationsRequirementsKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cSssItemsAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cSssItemsVSSSDocumentItemParserRuleCall_2_0 = (RuleCall)cSssItemsAssignment_2.eContents().get(0);
		private final Keyword cSoftwareOperationsRequirementsKeyword_3 = (Keyword)cGroup.eContents().get(3);
		
		//VSSSSoftwareOperationsRequirements:
		//	{VSSSSoftwareOperationsRequirements}
		//	'<SoftwareOperationsRequirements>'
		//	sssItems+=VSSSDocumentItem*
		//	'</SoftwareOperationsRequirements>';
		@Override public ParserRule getRule() { return rule; }
		
		//{VSSSSoftwareOperationsRequirements} '<SoftwareOperationsRequirements>' sssItems+=VSSSDocumentItem*
		//'</SoftwareOperationsRequirements>'
		public Group getGroup() { return cGroup; }
		
		//{VSSSSoftwareOperationsRequirements}
		public Action getVSSSSoftwareOperationsRequirementsAction_0() { return cVSSSSoftwareOperationsRequirementsAction_0; }
		
		//'<SoftwareOperationsRequirements>'
		public Keyword getSoftwareOperationsRequirementsKeyword_1() { return cSoftwareOperationsRequirementsKeyword_1; }
		
		//sssItems+=VSSSDocumentItem*
		public Assignment getSssItemsAssignment_2() { return cSssItemsAssignment_2; }
		
		//VSSSDocumentItem
		public RuleCall getSssItemsVSSSDocumentItemParserRuleCall_2_0() { return cSssItemsVSSSDocumentItemParserRuleCall_2_0; }
		
		//'</SoftwareOperationsRequirements>'
		public Keyword getSoftwareOperationsRequirementsKeyword_3() { return cSoftwareOperationsRequirementsKeyword_3; }
	}
	public class VSSSSoftwareMaintenanceRequirementsElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.micobs.svm.lang.sss.SSS.VSSSSoftwareMaintenanceRequirements");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cVSSSSoftwareMaintenanceRequirementsAction_0 = (Action)cGroup.eContents().get(0);
		private final Keyword cSoftwareMaintenanceRequirementsKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cSssItemsAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cSssItemsVSSSDocumentItemParserRuleCall_2_0 = (RuleCall)cSssItemsAssignment_2.eContents().get(0);
		private final Keyword cSoftwareMaintenanceRequirementsKeyword_3 = (Keyword)cGroup.eContents().get(3);
		
		//VSSSSoftwareMaintenanceRequirements:
		//	{VSSSSoftwareMaintenanceRequirements}
		//	'<SoftwareMaintenanceRequirements>'
		//	sssItems+=VSSSDocumentItem*
		//	'</SoftwareMaintenanceRequirements>';
		@Override public ParserRule getRule() { return rule; }
		
		//{VSSSSoftwareMaintenanceRequirements} '<SoftwareMaintenanceRequirements>' sssItems+=VSSSDocumentItem*
		//'</SoftwareMaintenanceRequirements>'
		public Group getGroup() { return cGroup; }
		
		//{VSSSSoftwareMaintenanceRequirements}
		public Action getVSSSSoftwareMaintenanceRequirementsAction_0() { return cVSSSSoftwareMaintenanceRequirementsAction_0; }
		
		//'<SoftwareMaintenanceRequirements>'
		public Keyword getSoftwareMaintenanceRequirementsKeyword_1() { return cSoftwareMaintenanceRequirementsKeyword_1; }
		
		//sssItems+=VSSSDocumentItem*
		public Assignment getSssItemsAssignment_2() { return cSssItemsAssignment_2; }
		
		//VSSSDocumentItem
		public RuleCall getSssItemsVSSSDocumentItemParserRuleCall_2_0() { return cSssItemsVSSSDocumentItemParserRuleCall_2_0; }
		
		//'</SoftwareMaintenanceRequirements>'
		public Keyword getSoftwareMaintenanceRequirementsKeyword_3() { return cSoftwareMaintenanceRequirementsKeyword_3; }
	}
	public class VSSSSystemSoftwareObservabilityRequirementsElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.micobs.svm.lang.sss.SSS.VSSSSystemSoftwareObservabilityRequirements");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cVSSSSystemSoftwareObservabilityRequirementsAction_0 = (Action)cGroup.eContents().get(0);
		private final Keyword cSystemSoftwareObservabilityRequirementsKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cSssItemsAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cSssItemsVSSSDocumentItemParserRuleCall_2_0 = (RuleCall)cSssItemsAssignment_2.eContents().get(0);
		private final Keyword cSystemSoftwareObservabilityRequirementsKeyword_3 = (Keyword)cGroup.eContents().get(3);
		
		//VSSSSystemSoftwareObservabilityRequirements:
		//	{VSSSSystemSoftwareObservabilityRequirements}
		//	'<SystemSoftwareObservabilityRequirements>'
		//	sssItems+=VSSSDocumentItem*
		//	'</SystemSoftwareObservabilityRequirements>';
		@Override public ParserRule getRule() { return rule; }
		
		//{VSSSSystemSoftwareObservabilityRequirements} '<SystemSoftwareObservabilityRequirements>' sssItems+=VSSSDocumentItem*
		//'</SystemSoftwareObservabilityRequirements>'
		public Group getGroup() { return cGroup; }
		
		//{VSSSSystemSoftwareObservabilityRequirements}
		public Action getVSSSSystemSoftwareObservabilityRequirementsAction_0() { return cVSSSSystemSoftwareObservabilityRequirementsAction_0; }
		
		//'<SystemSoftwareObservabilityRequirements>'
		public Keyword getSystemSoftwareObservabilityRequirementsKeyword_1() { return cSystemSoftwareObservabilityRequirementsKeyword_1; }
		
		//sssItems+=VSSSDocumentItem*
		public Assignment getSssItemsAssignment_2() { return cSssItemsAssignment_2; }
		
		//VSSSDocumentItem
		public RuleCall getSssItemsVSSSDocumentItemParserRuleCall_2_0() { return cSssItemsVSSSDocumentItemParserRuleCall_2_0; }
		
		//'</SystemSoftwareObservabilityRequirements>'
		public Keyword getSystemSoftwareObservabilityRequirementsKeyword_3() { return cSystemSoftwareObservabilityRequirementsKeyword_3; }
	}
	public class VSSSDocumentItemElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.micobs.svm.lang.sss.SSS.VSSSDocumentItem");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cItemKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cIdKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cIdAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cIdSTRINGTerminalRuleCall_2_0 = (RuleCall)cIdAssignment_2.eContents().get(0);
		private final Keyword cVerificationMethodKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Assignment cVerificationMethodAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cVerificationMethodVVerificationMethodEnumRuleCall_4_0 = (RuleCall)cVerificationMethodAssignment_4.eContents().get(0);
		private final Keyword cGreaterThanSignKeyword_5 = (Keyword)cGroup.eContents().get(5);
		private final Assignment cBodyAssignment_6 = (Assignment)cGroup.eContents().get(6);
		private final RuleCall cBodyDBodyParserRuleCall_6_0 = (RuleCall)cBodyAssignment_6.eContents().get(0);
		private final Keyword cItemKeyword_7 = (Keyword)cGroup.eContents().get(7);
		
		//VSSSDocumentItem:
		//	'<Item'
		//	'id=' id=STRING
		//	'verificationMethod=' verificationMethod=VVerificationMethod
		//	'>'
		//	body=DBody
		//	'</Item>';
		@Override public ParserRule getRule() { return rule; }
		
		//'<Item' 'id=' id=STRING 'verificationMethod=' verificationMethod=VVerificationMethod '>' body=DBody '</Item>'
		public Group getGroup() { return cGroup; }
		
		//'<Item'
		public Keyword getItemKeyword_0() { return cItemKeyword_0; }
		
		//'id='
		public Keyword getIdKeyword_1() { return cIdKeyword_1; }
		
		//id=STRING
		public Assignment getIdAssignment_2() { return cIdAssignment_2; }
		
		//STRING
		public RuleCall getIdSTRINGTerminalRuleCall_2_0() { return cIdSTRINGTerminalRuleCall_2_0; }
		
		//'verificationMethod='
		public Keyword getVerificationMethodKeyword_3() { return cVerificationMethodKeyword_3; }
		
		//verificationMethod=VVerificationMethod
		public Assignment getVerificationMethodAssignment_4() { return cVerificationMethodAssignment_4; }
		
		//VVerificationMethod
		public RuleCall getVerificationMethodVVerificationMethodEnumRuleCall_4_0() { return cVerificationMethodVVerificationMethodEnumRuleCall_4_0; }
		
		//'>'
		public Keyword getGreaterThanSignKeyword_5() { return cGreaterThanSignKeyword_5; }
		
		//body=DBody
		public Assignment getBodyAssignment_6() { return cBodyAssignment_6; }
		
		//DBody
		public RuleCall getBodyDBodyParserRuleCall_6_0() { return cBodyDBodyParserRuleCall_6_0; }
		
		//'</Item>'
		public Keyword getItemKeyword_7() { return cItemKeyword_7; }
	}
	public class VSSSVerificationValidationProcessRequirementsElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.micobs.svm.lang.sss.SSS.VSSSVerificationValidationProcessRequirements");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cVSSSVerificationValidationProcessRequirementsAction_0 = (Action)cGroup.eContents().get(0);
		private final Keyword cVerificationValidationProcessRequirementsKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cSssItemsAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cSssItemsVSSSDocumentItemParserRuleCall_2_0 = (RuleCall)cSssItemsAssignment_2.eContents().get(0);
		private final Keyword cVerificationValidationProcessRequirementsKeyword_3 = (Keyword)cGroup.eContents().get(3);
		
		//VSSSVerificationValidationProcessRequirements:
		//	{VSSSVerificationValidationProcessRequirements}
		//	'<VerificationValidationProcessRequirements>'
		//	sssItems+=VSSSDocumentItem*
		//	'</VerificationValidationProcessRequirements>';
		@Override public ParserRule getRule() { return rule; }
		
		//{VSSSVerificationValidationProcessRequirements} '<VerificationValidationProcessRequirements>'
		//sssItems+=VSSSDocumentItem* '</VerificationValidationProcessRequirements>'
		public Group getGroup() { return cGroup; }
		
		//{VSSSVerificationValidationProcessRequirements}
		public Action getVSSSVerificationValidationProcessRequirementsAction_0() { return cVSSSVerificationValidationProcessRequirementsAction_0; }
		
		//'<VerificationValidationProcessRequirements>'
		public Keyword getVerificationValidationProcessRequirementsKeyword_1() { return cVerificationValidationProcessRequirementsKeyword_1; }
		
		//sssItems+=VSSSDocumentItem*
		public Assignment getSssItemsAssignment_2() { return cSssItemsAssignment_2; }
		
		//VSSSDocumentItem
		public RuleCall getSssItemsVSSSDocumentItemParserRuleCall_2_0() { return cSssItemsVSSSDocumentItemParserRuleCall_2_0; }
		
		//'</VerificationValidationProcessRequirements>'
		public Keyword getVerificationValidationProcessRequirementsKeyword_3() { return cVerificationValidationProcessRequirementsKeyword_3; }
	}
	public class VSSSValidationApproachElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.micobs.svm.lang.sss.SSS.VSSSValidationApproach");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cVSSSValidationApproachAction_0 = (Action)cGroup.eContents().get(0);
		private final Keyword cValidationApproachKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cSssItemsAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cSssItemsVSSSDocumentItemParserRuleCall_2_0 = (RuleCall)cSssItemsAssignment_2.eContents().get(0);
		private final Keyword cValidationApproachKeyword_3 = (Keyword)cGroup.eContents().get(3);
		
		//VSSSValidationApproach:
		//	{VSSSValidationApproach}
		//	'<ValidationApproach>'
		//	sssItems+=VSSSDocumentItem*
		//	'</ValidationApproach>';
		@Override public ParserRule getRule() { return rule; }
		
		//{VSSSValidationApproach} '<ValidationApproach>' sssItems+=VSSSDocumentItem* '</ValidationApproach>'
		public Group getGroup() { return cGroup; }
		
		//{VSSSValidationApproach}
		public Action getVSSSValidationApproachAction_0() { return cVSSSValidationApproachAction_0; }
		
		//'<ValidationApproach>'
		public Keyword getValidationApproachKeyword_1() { return cValidationApproachKeyword_1; }
		
		//sssItems+=VSSSDocumentItem*
		public Assignment getSssItemsAssignment_2() { return cSssItemsAssignment_2; }
		
		//VSSSDocumentItem
		public RuleCall getSssItemsVSSSDocumentItemParserRuleCall_2_0() { return cSssItemsVSSSDocumentItemParserRuleCall_2_0; }
		
		//'</ValidationApproach>'
		public Keyword getValidationApproachKeyword_3() { return cValidationApproachKeyword_3; }
	}
	public class VSSSValidationRequirementsElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.micobs.svm.lang.sss.SSS.VSSSValidationRequirements");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cVSSSValidationRequirementsAction_0 = (Action)cGroup.eContents().get(0);
		private final Keyword cValidationRequirementsKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cSssItemsAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cSssItemsVSSSDocumentItemParserRuleCall_2_0 = (RuleCall)cSssItemsAssignment_2.eContents().get(0);
		private final Keyword cValidationRequirementsKeyword_3 = (Keyword)cGroup.eContents().get(3);
		
		//VSSSValidationRequirements:
		//	{VSSSValidationRequirements}
		//	'<ValidationRequirements>'
		//	sssItems+=VSSSDocumentItem*
		//	'</ValidationRequirements>';
		@Override public ParserRule getRule() { return rule; }
		
		//{VSSSValidationRequirements} '<ValidationRequirements>' sssItems+=VSSSDocumentItem* '</ValidationRequirements>'
		public Group getGroup() { return cGroup; }
		
		//{VSSSValidationRequirements}
		public Action getVSSSValidationRequirementsAction_0() { return cVSSSValidationRequirementsAction_0; }
		
		//'<ValidationRequirements>'
		public Keyword getValidationRequirementsKeyword_1() { return cValidationRequirementsKeyword_1; }
		
		//sssItems+=VSSSDocumentItem*
		public Assignment getSssItemsAssignment_2() { return cSssItemsAssignment_2; }
		
		//VSSSDocumentItem
		public RuleCall getSssItemsVSSSDocumentItemParserRuleCall_2_0() { return cSssItemsVSSSDocumentItemParserRuleCall_2_0; }
		
		//'</ValidationRequirements>'
		public Keyword getValidationRequirementsKeyword_3() { return cValidationRequirementsKeyword_3; }
	}
	public class VSSSVerificationRequirementsElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.micobs.svm.lang.sss.SSS.VSSSVerificationRequirements");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cVSSSVerificationRequirementsAction_0 = (Action)cGroup.eContents().get(0);
		private final Keyword cVerificationRequirementsKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cSssItemsAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cSssItemsVSSSDocumentItemParserRuleCall_2_0 = (RuleCall)cSssItemsAssignment_2.eContents().get(0);
		private final Keyword cVerificationRequirementsKeyword_3 = (Keyword)cGroup.eContents().get(3);
		
		//VSSSVerificationRequirements:
		//	{VSSSVerificationRequirements}
		//	'<VerificationRequirements>'
		//	sssItems+=VSSSDocumentItem*
		//	'</VerificationRequirements>';
		@Override public ParserRule getRule() { return rule; }
		
		//{VSSSVerificationRequirements} '<VerificationRequirements>' sssItems+=VSSSDocumentItem* '</VerificationRequirements>'
		public Group getGroup() { return cGroup; }
		
		//{VSSSVerificationRequirements}
		public Action getVSSSVerificationRequirementsAction_0() { return cVSSSVerificationRequirementsAction_0; }
		
		//'<VerificationRequirements>'
		public Keyword getVerificationRequirementsKeyword_1() { return cVerificationRequirementsKeyword_1; }
		
		//sssItems+=VSSSDocumentItem*
		public Assignment getSssItemsAssignment_2() { return cSssItemsAssignment_2; }
		
		//VSSSDocumentItem
		public RuleCall getSssItemsVSSSDocumentItemParserRuleCall_2_0() { return cSssItemsVSSSDocumentItemParserRuleCall_2_0; }
		
		//'</VerificationRequirements>'
		public Keyword getVerificationRequirementsKeyword_3() { return cVerificationRequirementsKeyword_3; }
	}
	public class VSSSSystemModelElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.micobs.svm.lang.sss.SSS.VSSSSystemModel");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cVSSSSystemModelAction_0 = (Action)cGroup.eContents().get(0);
		private final Keyword cSystemModelKeyword_1 = (Keyword)cGroup.eContents().get(1);
		
		//VSSSSystemModel:
		//	{VSSSSystemModel}
		//	'<SystemModel/>';
		@Override public ParserRule getRule() { return rule; }
		
		//{VSSSSystemModel} '<SystemModel/>'
		public Group getGroup() { return cGroup; }
		
		//{VSSSSystemModel}
		public Action getVSSSSystemModelAction_0() { return cVSSSSystemModelAction_0; }
		
		//'<SystemModel/>'
		public Keyword getSystemModelKeyword_1() { return cSystemModelKeyword_1; }
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
		//	Analysis='"Analysis"' | Inspection='"Inspection"' | Testing='"Testing"' |
		//	Review='"Review"' | ModelSimulation='"ModelSimulation"' | WalkThrough='"WalkThrough"' |
		//	CrossReading='"CrossReading"' | DeskChecking='"DeskChecking"';
		public EnumRule getRule() { return rule; }
		
		//Analysis='"Analysis"' | Inspection='"Inspection"' | Testing='"Testing"' | Review='"Review"' |
		//ModelSimulation='"ModelSimulation"' | WalkThrough='"WalkThrough"' | CrossReading='"CrossReading"' |
		//DeskChecking='"DeskChecking"'
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//Analysis='"Analysis"'
		public EnumLiteralDeclaration getAnalysisEnumLiteralDeclaration_0() { return cAnalysisEnumLiteralDeclaration_0; }
		
		//'"Analysis"'
		public Keyword getAnalysisAnalysisKeyword_0_0() { return cAnalysisAnalysisKeyword_0_0; }
		
		//Inspection='"Inspection"'
		public EnumLiteralDeclaration getInspectionEnumLiteralDeclaration_1() { return cInspectionEnumLiteralDeclaration_1; }
		
		//'"Inspection"'
		public Keyword getInspectionInspectionKeyword_1_0() { return cInspectionInspectionKeyword_1_0; }
		
		//Testing='"Testing"'
		public EnumLiteralDeclaration getTestingEnumLiteralDeclaration_2() { return cTestingEnumLiteralDeclaration_2; }
		
		//'"Testing"'
		public Keyword getTestingTestingKeyword_2_0() { return cTestingTestingKeyword_2_0; }
		
		//Review='"Review"'
		public EnumLiteralDeclaration getReviewEnumLiteralDeclaration_3() { return cReviewEnumLiteralDeclaration_3; }
		
		//'"Review"'
		public Keyword getReviewReviewKeyword_3_0() { return cReviewReviewKeyword_3_0; }
		
		//ModelSimulation='"ModelSimulation"'
		public EnumLiteralDeclaration getModelSimulationEnumLiteralDeclaration_4() { return cModelSimulationEnumLiteralDeclaration_4; }
		
		//'"ModelSimulation"'
		public Keyword getModelSimulationModelSimulationKeyword_4_0() { return cModelSimulationModelSimulationKeyword_4_0; }
		
		//WalkThrough='"WalkThrough"'
		public EnumLiteralDeclaration getWalkThroughEnumLiteralDeclaration_5() { return cWalkThroughEnumLiteralDeclaration_5; }
		
		//'"WalkThrough"'
		public Keyword getWalkThroughWalkThroughKeyword_5_0() { return cWalkThroughWalkThroughKeyword_5_0; }
		
		//CrossReading='"CrossReading"'
		public EnumLiteralDeclaration getCrossReadingEnumLiteralDeclaration_6() { return cCrossReadingEnumLiteralDeclaration_6; }
		
		//'"CrossReading"'
		public Keyword getCrossReadingCrossReadingKeyword_6_0() { return cCrossReadingCrossReadingKeyword_6_0; }
		
		//DeskChecking='"DeskChecking"'
		public EnumLiteralDeclaration getDeskCheckingEnumLiteralDeclaration_7() { return cDeskCheckingEnumLiteralDeclaration_7; }
		
		//'"DeskChecking"'
		public Keyword getDeskCheckingDeskCheckingKeyword_7_0() { return cDeskCheckingDeskCheckingKeyword_7_0; }
	}
	
	private final VSSSDocumentElements pVSSSDocument;
	private final DBodyElements pDBody;
	private final DBodyContentElements pDBodyContent;
	private final DParagraphElements pDParagraph;
	private final DListItemElements pDListItem;
	private final DListContentElements pDListContent;
	private final DItemizeElements pDItemize;
	private final DEnumerateElements pDEnumerate;
	private final DParagraphContentElements pDParagraphContent;
	private final DRunElements pDRun;
	private final DHyperlinkElements pDHyperlink;
	private final DTextElements pDText;
	private final TerminalRule tRUNTEXT;
	private final DFigureElements pDFigure;
	private final DPictureAsTableElements pDPictureAsTable;
	private final DBasicTableElements pDBasicTable;
	private final DRowElements pDRow;
	private final DColumnElements pDColumn;
	private final DCellElements pDCell;
	private final DApplicableDocumentElements pDApplicableDocument;
	private final DReferenceDocumentElements pDReferenceDocument;
	private final VSSSIntroductionElements pVSSSIntroduction;
	private final VSSSApplicableDocumentsElements pVSSSApplicableDocuments;
	private final VSSSReferenceDocumentsElements pVSSSReferenceDocuments;
	private final VSSSTermsDefinitionsAbbreviationsElements pVSSSTermsDefinitionsAbbreviations;
	private final VSSSGeneralDescriptionElements pVSSSGeneralDescription;
	private final VSSSSpecificRequirementsElements pVSSSSpecificRequirements;
	private final VSSSVerificationValidationIntegrationRequirementsElements pVSSSVerificationValidationIntegrationRequirements;
	private final VSSSSystemModelsElements pVSSSSystemModels;
	private final VSSSTermElements pVSSSTerm;
	private final VSSSDefinitionElements pVSSSDefinition;
	private final VSSSAbbreviationElements pVSSSAbbreviation;
	private final VSSSGeneralDescriptionSubsectionElements pVSSSGeneralDescriptionSubsection;
	private final VSSSGeneralRequirementsElements pVSSSGeneralRequirements;
	private final VSSSCapabilitiesRequirementsElements pVSSSCapabilitiesRequirements;
	private final VSSSSystemInterfaceRequirementsElements pVSSSSystemInterfaceRequirements;
	private final VSSSAdaptationMissionizationRequirementsElements pVSSSAdaptationMissionizationRequirements;
	private final VSSSComputerResourceRequirementsElements pVSSSComputerResourceRequirements;
	private final VSSSSecurityRequirementsElements pVSSSSecurityRequirements;
	private final VSSSSafetyRequirementsElements pVSSSSafetyRequirements;
	private final VSSSReliabiltyAvailabilityRequirementsElements pVSSSReliabiltyAvailabilityRequirements;
	private final VSSSQualityRequirementsElements pVSSSQualityRequirements;
	private final VSSSDesignRequirementsElements pVSSSDesignRequirements;
	private final VSSSSoftwareOperationsRequirementsElements pVSSSSoftwareOperationsRequirements;
	private final VSSSSoftwareMaintenanceRequirementsElements pVSSSSoftwareMaintenanceRequirements;
	private final VSSSSystemSoftwareObservabilityRequirementsElements pVSSSSystemSoftwareObservabilityRequirements;
	private final VSSSDocumentItemElements pVSSSDocumentItem;
	private final VVerificationMethodElements eVVerificationMethod;
	private final VSSSVerificationValidationProcessRequirementsElements pVSSSVerificationValidationProcessRequirements;
	private final VSSSValidationApproachElements pVSSSValidationApproach;
	private final VSSSValidationRequirementsElements pVSSSValidationRequirements;
	private final VSSSVerificationRequirementsElements pVSSSVerificationRequirements;
	private final VSSSSystemModelElements pVSSSSystemModel;
	
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
		this.pDParagraph = new DParagraphElements();
		this.pDListItem = new DListItemElements();
		this.pDListContent = new DListContentElements();
		this.pDItemize = new DItemizeElements();
		this.pDEnumerate = new DEnumerateElements();
		this.pDParagraphContent = new DParagraphContentElements();
		this.pDRun = new DRunElements();
		this.pDHyperlink = new DHyperlinkElements();
		this.pDText = new DTextElements();
		this.tRUNTEXT = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.micobs.svm.lang.sss.SSS.RUNTEXT");
		this.pDFigure = new DFigureElements();
		this.pDPictureAsTable = new DPictureAsTableElements();
		this.pDBasicTable = new DBasicTableElements();
		this.pDRow = new DRowElements();
		this.pDColumn = new DColumnElements();
		this.pDCell = new DCellElements();
		this.pDApplicableDocument = new DApplicableDocumentElements();
		this.pDReferenceDocument = new DReferenceDocumentElements();
		this.pVSSSIntroduction = new VSSSIntroductionElements();
		this.pVSSSApplicableDocuments = new VSSSApplicableDocumentsElements();
		this.pVSSSReferenceDocuments = new VSSSReferenceDocumentsElements();
		this.pVSSSTermsDefinitionsAbbreviations = new VSSSTermsDefinitionsAbbreviationsElements();
		this.pVSSSGeneralDescription = new VSSSGeneralDescriptionElements();
		this.pVSSSSpecificRequirements = new VSSSSpecificRequirementsElements();
		this.pVSSSVerificationValidationIntegrationRequirements = new VSSSVerificationValidationIntegrationRequirementsElements();
		this.pVSSSSystemModels = new VSSSSystemModelsElements();
		this.pVSSSTerm = new VSSSTermElements();
		this.pVSSSDefinition = new VSSSDefinitionElements();
		this.pVSSSAbbreviation = new VSSSAbbreviationElements();
		this.pVSSSGeneralDescriptionSubsection = new VSSSGeneralDescriptionSubsectionElements();
		this.pVSSSGeneralRequirements = new VSSSGeneralRequirementsElements();
		this.pVSSSCapabilitiesRequirements = new VSSSCapabilitiesRequirementsElements();
		this.pVSSSSystemInterfaceRequirements = new VSSSSystemInterfaceRequirementsElements();
		this.pVSSSAdaptationMissionizationRequirements = new VSSSAdaptationMissionizationRequirementsElements();
		this.pVSSSComputerResourceRequirements = new VSSSComputerResourceRequirementsElements();
		this.pVSSSSecurityRequirements = new VSSSSecurityRequirementsElements();
		this.pVSSSSafetyRequirements = new VSSSSafetyRequirementsElements();
		this.pVSSSReliabiltyAvailabilityRequirements = new VSSSReliabiltyAvailabilityRequirementsElements();
		this.pVSSSQualityRequirements = new VSSSQualityRequirementsElements();
		this.pVSSSDesignRequirements = new VSSSDesignRequirementsElements();
		this.pVSSSSoftwareOperationsRequirements = new VSSSSoftwareOperationsRequirementsElements();
		this.pVSSSSoftwareMaintenanceRequirements = new VSSSSoftwareMaintenanceRequirementsElements();
		this.pVSSSSystemSoftwareObservabilityRequirements = new VSSSSystemSoftwareObservabilityRequirementsElements();
		this.pVSSSDocumentItem = new VSSSDocumentItemElements();
		this.eVVerificationMethod = new VVerificationMethodElements();
		this.pVSSSVerificationValidationProcessRequirements = new VSSSVerificationValidationProcessRequirementsElements();
		this.pVSSSValidationApproach = new VSSSValidationApproachElements();
		this.pVSSSValidationRequirements = new VSSSValidationRequirementsElements();
		this.pVSSSVerificationRequirements = new VSSSVerificationRequirementsElements();
		this.pVSSSSystemModel = new VSSSSystemModelElements();
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
	//	'<SSS'
	//	'name=' name=STRING
	//	'id=' id=STRING
	//	'issue=' issue=STRING
	//	'revision=' revision=STRING
	//	'date=' date=STRING
	//	'>'
	//	introductionSection=VSSSIntroduction
	//	applicableDocumentsSection=VSSSApplicableDocuments
	//	referenceDocumentsSection=VSSSReferenceDocuments
	//	termsDefinitionsAbbreviationsSection=VSSSTermsDefinitionsAbbreviations
	//	generalDescriptionSection=VSSSGeneralDescription
	//	specificRequirementsSection=VSSSSpecificRequirements
	//	verificationValidationIntegrationSection=VSSSVerificationValidationIntegrationRequirements
	//	systemModelsSection=VSSSSystemModels
	//	'</SSS>';
	public VSSSDocumentElements getVSSSDocumentAccess() {
		return pVSSSDocument;
	}
	
	public ParserRule getVSSSDocumentRule() {
		return getVSSSDocumentAccess().getRule();
	}
	
	//DBody doc::DBody:
	//	'<body>'
	//	bodyContent+=DBodyContent+
	//	'</body>'
	public DBodyElements getDBodyAccess() {
		return pDBody;
	}
	
	public ParserRule getDBodyRule() {
		return getDBodyAccess().getRule();
	}
	
	//DBodyContent doc::DBodyContent:
	//	DParagraph | DItemize | DEnumerate | DFigure | DPictureAsTable | DBasicTable
	public DBodyContentElements getDBodyContentAccess() {
		return pDBodyContent;
	}
	
	public ParserRule getDBodyContentRule() {
		return getDBodyContentAccess().getRule();
	}
	
	//DParagraph doc::DParagraph:
	//	'<paragraph>'
	//	paragraphContent+=DParagraphContent+
	//	'</paragraph>'
	public DParagraphElements getDParagraphAccess() {
		return pDParagraph;
	}
	
	public ParserRule getDParagraphRule() {
		return getDParagraphAccess().getRule();
	}
	
	//DListItem doc::DListItem:
	//	'<listItem>'
	//	paragraph+=DParagraph+ ('<sublist>' sublist=DListContent '</sublist>')?
	//	'</listItem>'
	public DListItemElements getDListItemAccess() {
		return pDListItem;
	}
	
	public ParserRule getDListItemRule() {
		return getDListItemAccess().getRule();
	}
	
	//DListContent doc::DListContent:
	//	DItemize | DEnumerate
	public DListContentElements getDListContentAccess() {
		return pDListContent;
	}
	
	public ParserRule getDListContentRule() {
		return getDListContentAccess().getRule();
	}
	
	//DItemize doc::DItemize:
	//	'<itemize>'
	//	items+=DListItem+
	//	'</itemize>'
	public DItemizeElements getDItemizeAccess() {
		return pDItemize;
	}
	
	public ParserRule getDItemizeRule() {
		return getDItemizeAccess().getRule();
	}
	
	//DEnumerate doc::DEnumerate:
	//	'<enumerate>'
	//	items+=DListItem+
	//	'</enumerate>'
	public DEnumerateElements getDEnumerateAccess() {
		return pDEnumerate;
	}
	
	public ParserRule getDEnumerateRule() {
		return getDEnumerateAccess().getRule();
	}
	
	//DParagraphContent doc::DParagraphContent:
	//	DRun | DHyperlink
	public DParagraphContentElements getDParagraphContentAccess() {
		return pDParagraphContent;
	}
	
	public ParserRule getDParagraphContentRule() {
		return getDParagraphContentAccess().getRule();
	}
	
	//DRun doc::DRun:
	//	'<run'
	//	'bold'?
	//	'italic'?
	//	'underscore'?
	//	'>'
	//	text=DText
	//	'</run>'
	public DRunElements getDRunAccess() {
		return pDRun;
	}
	
	public ParserRule getDRunRule() {
		return getDRunAccess().getRule();
	}
	
	//DHyperlink doc::DHyperlink:
	//	'<hyperlink'
	//	'reference=' reference=[doc::DReferenceableObject|STRING]
	//	'>'
	//	run=DRun
	//	'</hyperlink>'
	public DHyperlinkElements getDHyperlinkAccess() {
		return pDHyperlink;
	}
	
	public ParserRule getDHyperlinkRule() {
		return getDHyperlinkAccess().getRule();
	}
	
	//DText doc::DText:
	//	content=RUNTEXT
	public DTextElements getDTextAccess() {
		return pDText;
	}
	
	public ParserRule getDTextRule() {
		return getDTextAccess().getRule();
	}
	
	//terminal RUNTEXT:
	//	'<text>'->'</text>';
	public TerminalRule getRUNTEXTRule() {
		return tRUNTEXT;
	}
	
	//DFigure doc::DFigure:
	//	'<figure'
	//	'name=' name=STRING
	//	'reference=' reference=STRING
	//	'caption=' caption=STRING
	//	'/>'
	public DFigureElements getDFigureAccess() {
		return pDFigure;
	}
	
	public ParserRule getDFigureRule() {
		return getDFigureAccess().getRule();
	}
	
	//DPictureAsTable doc::DPictureAsTable:
	//	'<pictureAsTable'
	//	'name=' name=STRING
	//	'reference=' reference=STRING
	//	'caption=' caption=STRING
	//	'/>'
	public DPictureAsTableElements getDPictureAsTableAccess() {
		return pDPictureAsTable;
	}
	
	public ParserRule getDPictureAsTableRule() {
		return getDPictureAsTableAccess().getRule();
	}
	
	//DBasicTable doc::DBasicTable:
	//	'<basicTable'
	//	'name=' name=STRING
	//	'caption=' caption=STRING
	//	'>'
	//	rows+=DRow+
	//	'</basicTable>'
	public DBasicTableElements getDBasicTableAccess() {
		return pDBasicTable;
	}
	
	public ParserRule getDBasicTableRule() {
		return getDBasicTableAccess().getRule();
	}
	
	//DRow doc::DRow:
	//	'<row'
	//	'span=' span=STRING
	//	'>'
	//	columns+=DColumn+
	//	'</row>'
	public DRowElements getDRowAccess() {
		return pDRow;
	}
	
	public ParserRule getDRowRule() {
		return getDRowAccess().getRule();
	}
	
	//DColumn doc::DColumn:
	//	'<column'
	//	'span=' span=STRING
	//	'>'
	//	cells+=DCell+
	//	'</column>'
	public DColumnElements getDColumnAccess() {
		return pDColumn;
	}
	
	public ParserRule getDColumnRule() {
		return getDColumnAccess().getRule();
	}
	
	//DCell doc::DCell:
	//	'<cell>'
	//	bodyContent+=DBodyContent+
	//	'</cell>'
	public DCellElements getDCellAccess() {
		return pDCell;
	}
	
	public ParserRule getDCellRule() {
		return getDCellAccess().getRule();
	}
	
	//DApplicableDocument doc::DApplicableDocument:
	//	'<ApplicableDocument'
	//	'name=' name=STRING
	//	'title=' title=STRING
	//	'issue=' issue=STRING
	//	'revision=' revision=STRING
	//	'/>'
	public DApplicableDocumentElements getDApplicableDocumentAccess() {
		return pDApplicableDocument;
	}
	
	public ParserRule getDApplicableDocumentRule() {
		return getDApplicableDocumentAccess().getRule();
	}
	
	//DReferenceDocument doc::DReferenceDocument:
	//	'<ReferenceDocument'
	//	'name=' name=STRING
	//	'title=' title=STRING
	//	'issue=' issue=STRING
	//	'revision=' revision=STRING
	//	'/>'
	public DReferenceDocumentElements getDReferenceDocumentAccess() {
		return pDReferenceDocument;
	}
	
	public ParserRule getDReferenceDocumentRule() {
		return getDReferenceDocumentAccess().getRule();
	}
	
	//VSSSIntroduction:
	//	'<Introduction>'
	//	'<purpose>' purpose=DBody '</purpose>'
	//	'<objective>' objective=DBody '</objective>'
	//	'<content>' content=DBody '</content>'
	//	'<reason>' reason=DBody '</reason>'
	//	'</Introduction>';
	public VSSSIntroductionElements getVSSSIntroductionAccess() {
		return pVSSSIntroduction;
	}
	
	public ParserRule getVSSSIntroductionRule() {
		return getVSSSIntroductionAccess().getRule();
	}
	
	//VSSSApplicableDocuments:
	//	{VSSSApplicableDocuments}
	//	'<ApplicableDocuments>'
	//	applicableDocuments+=DApplicableDocument*
	//	'</ApplicableDocuments>';
	public VSSSApplicableDocumentsElements getVSSSApplicableDocumentsAccess() {
		return pVSSSApplicableDocuments;
	}
	
	public ParserRule getVSSSApplicableDocumentsRule() {
		return getVSSSApplicableDocumentsAccess().getRule();
	}
	
	//VSSSReferenceDocuments:
	//	{VSSSReferenceDocuments}
	//	'<ReferenceDocuments>'
	//	referenceDocuments+=DReferenceDocument*
	//	'</ReferenceDocuments>';
	public VSSSReferenceDocumentsElements getVSSSReferenceDocumentsAccess() {
		return pVSSSReferenceDocuments;
	}
	
	public ParserRule getVSSSReferenceDocumentsRule() {
		return getVSSSReferenceDocumentsAccess().getRule();
	}
	
	//VSSSTermsDefinitionsAbbreviations:
	//	{VSSSTermsDefinitionsAbbreviations}
	//	'<TermsDefinitionsAbbreviations>'
	//	terms+=VSSSTerm*
	//	definitions+=VSSSDefinition*
	//	abbreviations+=VSSSAbbreviation*
	//	'</TermsDefinitionsAbbreviations>';
	public VSSSTermsDefinitionsAbbreviationsElements getVSSSTermsDefinitionsAbbreviationsAccess() {
		return pVSSSTermsDefinitionsAbbreviations;
	}
	
	public ParserRule getVSSSTermsDefinitionsAbbreviationsRule() {
		return getVSSSTermsDefinitionsAbbreviationsAccess().getRule();
	}
	
	//VSSSGeneralDescription:
	//	'<GeneralDescription>'
	//	'<productPerspective>' productPerspective=VSSSGeneralDescriptionSubsection '</productPerspective>'
	//	'<generalCapabilities>' generalCapabilities=VSSSGeneralDescriptionSubsection '</generalCapabilities>'
	//	'<generalConstraints>' generalConstraints=VSSSGeneralDescriptionSubsection '</generalConstraints>'
	//	'<operationalEnvironment>' operationalEnvironment=VSSSGeneralDescriptionSubsection '</operationalEnvironment>'
	//	'<assumptionsDependencies>' assumptionsDependencies=VSSSGeneralDescriptionSubsection '</assumptionsDependencies>'
	//	'</GeneralDescription>';
	public VSSSGeneralDescriptionElements getVSSSGeneralDescriptionAccess() {
		return pVSSSGeneralDescription;
	}
	
	public ParserRule getVSSSGeneralDescriptionRule() {
		return getVSSSGeneralDescriptionAccess().getRule();
	}
	
	//VSSSSpecificRequirements:
	//	'<SpecificRequirements>'
	//	general=VSSSGeneralRequirements
	//	capabilities=VSSSCapabilitiesRequirements
	//	systemInterface=VSSSSystemInterfaceRequirements
	//	adaptationMissionization=VSSSAdaptationMissionizationRequirements
	//	computerResource=VSSSComputerResourceRequirements
	//	security=VSSSSecurityRequirements
	//	safety=VSSSSafetyRequirements
	//	reliabiltyAvailability=VSSSReliabiltyAvailabilityRequirements
	//	quality=VSSSQualityRequirements
	//	design=VSSSDesignRequirements
	//	softwareOperations=VSSSSoftwareOperationsRequirements
	//	softwareMaintenance=VSSSSoftwareMaintenanceRequirements
	//	systemSoftwareObservability=VSSSSystemSoftwareObservabilityRequirements
	//	'</SpecificRequirements>';
	public VSSSSpecificRequirementsElements getVSSSSpecificRequirementsAccess() {
		return pVSSSSpecificRequirements;
	}
	
	public ParserRule getVSSSSpecificRequirementsRule() {
		return getVSSSSpecificRequirementsAccess().getRule();
	}
	
	//VSSSVerificationValidationIntegrationRequirements:
	//	'<VerificationValidationIntegrationRequirements>'
	//	verificationValidationProcess=VSSSVerificationValidationProcessRequirements
	//	validationApproach=VSSSValidationApproach
	//	validation=VSSSValidationRequirements
	//	verification=VSSSVerificationRequirements
	//	'</VerificationValidationIntegrationRequirements>';
	public VSSSVerificationValidationIntegrationRequirementsElements getVSSSVerificationValidationIntegrationRequirementsAccess() {
		return pVSSSVerificationValidationIntegrationRequirements;
	}
	
	public ParserRule getVSSSVerificationValidationIntegrationRequirementsRule() {
		return getVSSSVerificationValidationIntegrationRequirementsAccess().getRule();
	}
	
	//VSSSSystemModels:
	//	{VSSSSystemModels}
	//	'<SystemModels>'
	//	systemModels+=VSSSSystemModel*
	//	'</SystemModels>';
	public VSSSSystemModelsElements getVSSSSystemModelsAccess() {
		return pVSSSSystemModels;
	}
	
	public ParserRule getVSSSSystemModelsRule() {
		return getVSSSSystemModelsAccess().getRule();
	}
	
	//VSSSTerm:
	//	'<Term'
	//	'name=' name=STRING '>'
	//	description=DRun
	//	'</Term>';
	public VSSSTermElements getVSSSTermAccess() {
		return pVSSSTerm;
	}
	
	public ParserRule getVSSSTermRule() {
		return getVSSSTermAccess().getRule();
	}
	
	//VSSSDefinition:
	//	'<Definition'
	//	'name=' name=STRING '>'
	//	description=DRun
	//	'</Definition>';
	public VSSSDefinitionElements getVSSSDefinitionAccess() {
		return pVSSSDefinition;
	}
	
	public ParserRule getVSSSDefinitionRule() {
		return getVSSSDefinitionAccess().getRule();
	}
	
	//VSSSAbbreviation:
	//	'<Abbreviation'
	//	'name=' name=STRING '>'
	//	description=DRun
	//	'</Abbreviation>';
	public VSSSAbbreviationElements getVSSSAbbreviationAccess() {
		return pVSSSAbbreviation;
	}
	
	public ParserRule getVSSSAbbreviationRule() {
		return getVSSSAbbreviationAccess().getRule();
	}
	
	//VSSSGeneralDescriptionSubsection:
	//	body=DBody;
	public VSSSGeneralDescriptionSubsectionElements getVSSSGeneralDescriptionSubsectionAccess() {
		return pVSSSGeneralDescriptionSubsection;
	}
	
	public ParserRule getVSSSGeneralDescriptionSubsectionRule() {
		return getVSSSGeneralDescriptionSubsectionAccess().getRule();
	}
	
	//VSSSGeneralRequirements:
	//	{VSSSGeneralRequirements}
	//	'<GeneralRequirements>'
	//	sssItems+=VSSSDocumentItem*
	//	'</GeneralRequirements>';
	public VSSSGeneralRequirementsElements getVSSSGeneralRequirementsAccess() {
		return pVSSSGeneralRequirements;
	}
	
	public ParserRule getVSSSGeneralRequirementsRule() {
		return getVSSSGeneralRequirementsAccess().getRule();
	}
	
	//VSSSCapabilitiesRequirements:
	//	{VSSSCapabilitiesRequirements}
	//	'<CapabilitiesRequirements>'
	//	sssItems+=VSSSDocumentItem*
	//	'</CapabilitiesRequirements>';
	public VSSSCapabilitiesRequirementsElements getVSSSCapabilitiesRequirementsAccess() {
		return pVSSSCapabilitiesRequirements;
	}
	
	public ParserRule getVSSSCapabilitiesRequirementsRule() {
		return getVSSSCapabilitiesRequirementsAccess().getRule();
	}
	
	//VSSSSystemInterfaceRequirements:
	//	{VSSSSystemInterfaceRequirements}
	//	'<SystemInterfaceRequirements>'
	//	sssItems+=VSSSDocumentItem*
	//	'</SystemInterfaceRequirements>';
	public VSSSSystemInterfaceRequirementsElements getVSSSSystemInterfaceRequirementsAccess() {
		return pVSSSSystemInterfaceRequirements;
	}
	
	public ParserRule getVSSSSystemInterfaceRequirementsRule() {
		return getVSSSSystemInterfaceRequirementsAccess().getRule();
	}
	
	//VSSSAdaptationMissionizationRequirements:
	//	{VSSSAdaptationMissionizationRequirements}
	//	'<VSSSAdaptationMissionizationRequirements>'
	//	sssItems+=VSSSDocumentItem*
	//	'</VSSSAdaptationMissionizationRequirements>';
	public VSSSAdaptationMissionizationRequirementsElements getVSSSAdaptationMissionizationRequirementsAccess() {
		return pVSSSAdaptationMissionizationRequirements;
	}
	
	public ParserRule getVSSSAdaptationMissionizationRequirementsRule() {
		return getVSSSAdaptationMissionizationRequirementsAccess().getRule();
	}
	
	//VSSSComputerResourceRequirements:
	//	{VSSSComputerResourceRequirements}
	//	'<ComputerResourceRequirements>'
	//	sssItems+=VSSSDocumentItem*
	//	'</ComputerResourceRequirements>';
	public VSSSComputerResourceRequirementsElements getVSSSComputerResourceRequirementsAccess() {
		return pVSSSComputerResourceRequirements;
	}
	
	public ParserRule getVSSSComputerResourceRequirementsRule() {
		return getVSSSComputerResourceRequirementsAccess().getRule();
	}
	
	//VSSSSecurityRequirements:
	//	{VSSSSecurityRequirements}
	//	'<SecurityRequirements>'
	//	sssItems+=VSSSDocumentItem*
	//	'</SecurityRequirements>';
	public VSSSSecurityRequirementsElements getVSSSSecurityRequirementsAccess() {
		return pVSSSSecurityRequirements;
	}
	
	public ParserRule getVSSSSecurityRequirementsRule() {
		return getVSSSSecurityRequirementsAccess().getRule();
	}
	
	//VSSSSafetyRequirements:
	//	{VSSSSafetyRequirements}
	//	'<SafetyRequirements>'
	//	sssItems+=VSSSDocumentItem*
	//	'</SafetyRequirements>';
	public VSSSSafetyRequirementsElements getVSSSSafetyRequirementsAccess() {
		return pVSSSSafetyRequirements;
	}
	
	public ParserRule getVSSSSafetyRequirementsRule() {
		return getVSSSSafetyRequirementsAccess().getRule();
	}
	
	//VSSSReliabiltyAvailabilityRequirements:
	//	{VSSSReliabiltyAvailabilityRequirements}
	//	'<ReliabiltyAvailabilityRequirements>'
	//	sssItems+=VSSSDocumentItem*
	//	'</ReliabiltyAvailabilityRequirements>';
	public VSSSReliabiltyAvailabilityRequirementsElements getVSSSReliabiltyAvailabilityRequirementsAccess() {
		return pVSSSReliabiltyAvailabilityRequirements;
	}
	
	public ParserRule getVSSSReliabiltyAvailabilityRequirementsRule() {
		return getVSSSReliabiltyAvailabilityRequirementsAccess().getRule();
	}
	
	//VSSSQualityRequirements:
	//	{VSSSQualityRequirements}
	//	'<QualityRequirements>'
	//	sssItems+=VSSSDocumentItem*
	//	'</QualityRequirements>';
	public VSSSQualityRequirementsElements getVSSSQualityRequirementsAccess() {
		return pVSSSQualityRequirements;
	}
	
	public ParserRule getVSSSQualityRequirementsRule() {
		return getVSSSQualityRequirementsAccess().getRule();
	}
	
	//VSSSDesignRequirements:
	//	{VSSSDesignRequirements}
	//	'<DesignRequirements>'
	//	sssItems+=VSSSDocumentItem*
	//	'</DesignRequirements>';
	public VSSSDesignRequirementsElements getVSSSDesignRequirementsAccess() {
		return pVSSSDesignRequirements;
	}
	
	public ParserRule getVSSSDesignRequirementsRule() {
		return getVSSSDesignRequirementsAccess().getRule();
	}
	
	//VSSSSoftwareOperationsRequirements:
	//	{VSSSSoftwareOperationsRequirements}
	//	'<SoftwareOperationsRequirements>'
	//	sssItems+=VSSSDocumentItem*
	//	'</SoftwareOperationsRequirements>';
	public VSSSSoftwareOperationsRequirementsElements getVSSSSoftwareOperationsRequirementsAccess() {
		return pVSSSSoftwareOperationsRequirements;
	}
	
	public ParserRule getVSSSSoftwareOperationsRequirementsRule() {
		return getVSSSSoftwareOperationsRequirementsAccess().getRule();
	}
	
	//VSSSSoftwareMaintenanceRequirements:
	//	{VSSSSoftwareMaintenanceRequirements}
	//	'<SoftwareMaintenanceRequirements>'
	//	sssItems+=VSSSDocumentItem*
	//	'</SoftwareMaintenanceRequirements>';
	public VSSSSoftwareMaintenanceRequirementsElements getVSSSSoftwareMaintenanceRequirementsAccess() {
		return pVSSSSoftwareMaintenanceRequirements;
	}
	
	public ParserRule getVSSSSoftwareMaintenanceRequirementsRule() {
		return getVSSSSoftwareMaintenanceRequirementsAccess().getRule();
	}
	
	//VSSSSystemSoftwareObservabilityRequirements:
	//	{VSSSSystemSoftwareObservabilityRequirements}
	//	'<SystemSoftwareObservabilityRequirements>'
	//	sssItems+=VSSSDocumentItem*
	//	'</SystemSoftwareObservabilityRequirements>';
	public VSSSSystemSoftwareObservabilityRequirementsElements getVSSSSystemSoftwareObservabilityRequirementsAccess() {
		return pVSSSSystemSoftwareObservabilityRequirements;
	}
	
	public ParserRule getVSSSSystemSoftwareObservabilityRequirementsRule() {
		return getVSSSSystemSoftwareObservabilityRequirementsAccess().getRule();
	}
	
	//VSSSDocumentItem:
	//	'<Item'
	//	'id=' id=STRING
	//	'verificationMethod=' verificationMethod=VVerificationMethod
	//	'>'
	//	body=DBody
	//	'</Item>';
	public VSSSDocumentItemElements getVSSSDocumentItemAccess() {
		return pVSSSDocumentItem;
	}
	
	public ParserRule getVSSSDocumentItemRule() {
		return getVSSSDocumentItemAccess().getRule();
	}
	
	//enum VVerificationMethod returns tdm::VVerificationMethod:
	//	Analysis='"Analysis"' | Inspection='"Inspection"' | Testing='"Testing"' |
	//	Review='"Review"' | ModelSimulation='"ModelSimulation"' | WalkThrough='"WalkThrough"' |
	//	CrossReading='"CrossReading"' | DeskChecking='"DeskChecking"';
	public VVerificationMethodElements getVVerificationMethodAccess() {
		return eVVerificationMethod;
	}
	
	public EnumRule getVVerificationMethodRule() {
		return getVVerificationMethodAccess().getRule();
	}
	
	//VSSSVerificationValidationProcessRequirements:
	//	{VSSSVerificationValidationProcessRequirements}
	//	'<VerificationValidationProcessRequirements>'
	//	sssItems+=VSSSDocumentItem*
	//	'</VerificationValidationProcessRequirements>';
	public VSSSVerificationValidationProcessRequirementsElements getVSSSVerificationValidationProcessRequirementsAccess() {
		return pVSSSVerificationValidationProcessRequirements;
	}
	
	public ParserRule getVSSSVerificationValidationProcessRequirementsRule() {
		return getVSSSVerificationValidationProcessRequirementsAccess().getRule();
	}
	
	//VSSSValidationApproach:
	//	{VSSSValidationApproach}
	//	'<ValidationApproach>'
	//	sssItems+=VSSSDocumentItem*
	//	'</ValidationApproach>';
	public VSSSValidationApproachElements getVSSSValidationApproachAccess() {
		return pVSSSValidationApproach;
	}
	
	public ParserRule getVSSSValidationApproachRule() {
		return getVSSSValidationApproachAccess().getRule();
	}
	
	//VSSSValidationRequirements:
	//	{VSSSValidationRequirements}
	//	'<ValidationRequirements>'
	//	sssItems+=VSSSDocumentItem*
	//	'</ValidationRequirements>';
	public VSSSValidationRequirementsElements getVSSSValidationRequirementsAccess() {
		return pVSSSValidationRequirements;
	}
	
	public ParserRule getVSSSValidationRequirementsRule() {
		return getVSSSValidationRequirementsAccess().getRule();
	}
	
	//VSSSVerificationRequirements:
	//	{VSSSVerificationRequirements}
	//	'<VerificationRequirements>'
	//	sssItems+=VSSSDocumentItem*
	//	'</VerificationRequirements>';
	public VSSSVerificationRequirementsElements getVSSSVerificationRequirementsAccess() {
		return pVSSSVerificationRequirements;
	}
	
	public ParserRule getVSSSVerificationRequirementsRule() {
		return getVSSSVerificationRequirementsAccess().getRule();
	}
	
	//VSSSSystemModel:
	//	{VSSSSystemModel}
	//	'<SystemModel/>';
	public VSSSSystemModelElements getVSSSSystemModelAccess() {
		return pVSSSSystemModel;
	}
	
	public ParserRule getVSSSSystemModelRule() {
		return getVSSSSystemModelAccess().getRule();
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
