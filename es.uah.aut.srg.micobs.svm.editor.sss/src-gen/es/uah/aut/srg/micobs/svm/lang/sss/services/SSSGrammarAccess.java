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
		private final RuleCall cIssueUINT_STRINGTerminalRuleCall_6_0 = (RuleCall)cIssueAssignment_6.eContents().get(0);
		private final Keyword cRevisionKeyword_7 = (Keyword)cGroup.eContents().get(7);
		private final Assignment cRevisionAssignment_8 = (Assignment)cGroup.eContents().get(8);
		private final RuleCall cRevisionUINT_STRINGTerminalRuleCall_8_0 = (RuleCall)cRevisionAssignment_8.eContents().get(0);
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
		//	'issue=' issue=UINT_STRING
		//	'revision=' revision=UINT_STRING
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
		
		//'<SSS' 'name=' name=STRING 'id=' id=STRING 'issue=' issue=UINT_STRING 'revision=' revision=UINT_STRING 'date='
		//date=STRING '>' introductionSection=VSSSIntroduction applicableDocumentsSection=VSSSApplicableDocuments
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
		
		//issue=UINT_STRING
		public Assignment getIssueAssignment_6() { return cIssueAssignment_6; }
		
		//UINT_STRING
		public RuleCall getIssueUINT_STRINGTerminalRuleCall_6_0() { return cIssueUINT_STRINGTerminalRuleCall_6_0; }
		
		//'revision='
		public Keyword getRevisionKeyword_7() { return cRevisionKeyword_7; }
		
		//revision=UINT_STRING
		public Assignment getRevisionAssignment_8() { return cRevisionAssignment_8; }
		
		//UINT_STRING
		public RuleCall getRevisionUINT_STRINGTerminalRuleCall_8_0() { return cRevisionUINT_STRINGTerminalRuleCall_8_0; }
		
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
		
		//DBody doctpl::DBody:
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
		private final RuleCall cDFigureFromFileParserRuleCall_3 = (RuleCall)cAlternatives.eContents().get(3);
		private final RuleCall cDTableFromFileParserRuleCall_4 = (RuleCall)cAlternatives.eContents().get(4);
		private final RuleCall cDBasicTableParserRuleCall_5 = (RuleCall)cAlternatives.eContents().get(5);
		
		//DBodyContent doctpl::DBodyContent:
		//	DParagraph | DItemize | DEnumerate | DFigureFromFile | DTableFromFile | DBasicTable
		@Override public ParserRule getRule() { return rule; }
		
		//DParagraph | DItemize | DEnumerate | DFigureFromFile | DTableFromFile | DBasicTable
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//DParagraph
		public RuleCall getDParagraphParserRuleCall_0() { return cDParagraphParserRuleCall_0; }
		
		//DItemize
		public RuleCall getDItemizeParserRuleCall_1() { return cDItemizeParserRuleCall_1; }
		
		//DEnumerate
		public RuleCall getDEnumerateParserRuleCall_2() { return cDEnumerateParserRuleCall_2; }
		
		//DFigureFromFile
		public RuleCall getDFigureFromFileParserRuleCall_3() { return cDFigureFromFileParserRuleCall_3; }
		
		//DTableFromFile
		public RuleCall getDTableFromFileParserRuleCall_4() { return cDTableFromFileParserRuleCall_4; }
		
		//DBasicTable
		public RuleCall getDBasicTableParserRuleCall_5() { return cDBasicTableParserRuleCall_5; }
	}
	public class DParagraphElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.micobs.svm.lang.sss.SSS.DParagraph");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cParagraphKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Group cGroup_1 = (Group)cGroup.eContents().get(1);
		private final Keyword cStyleKeyword_1_0 = (Keyword)cGroup_1.eContents().get(0);
		private final Assignment cStyleAssignment_1_1 = (Assignment)cGroup_1.eContents().get(1);
		private final RuleCall cStyleSTRINGTerminalRuleCall_1_1_0 = (RuleCall)cStyleAssignment_1_1.eContents().get(0);
		private final Group cGroup_2 = (Group)cGroup.eContents().get(2);
		private final Keyword cAlignmentKeyword_2_0 = (Keyword)cGroup_2.eContents().get(0);
		private final Assignment cAlignmentAssignment_2_1 = (Assignment)cGroup_2.eContents().get(1);
		private final RuleCall cAlignmentDAlignmentEnumRuleCall_2_1_0 = (RuleCall)cAlignmentAssignment_2_1.eContents().get(0);
		private final Keyword cGreaterThanSignKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Assignment cParagraphContentAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cParagraphContentDParagraphContentParserRuleCall_4_0 = (RuleCall)cParagraphContentAssignment_4.eContents().get(0);
		private final Keyword cParagraphKeyword_5 = (Keyword)cGroup.eContents().get(5);
		
		//DParagraph doctpl::DParagraph:
		//	'<paragraph' ('style=' style=STRING)? ('alignment=' alignment=DAlignment)?
		//	'>'
		//	paragraphContent+=DParagraphContent+
		//	'</paragraph>'
		@Override public ParserRule getRule() { return rule; }
		
		//'<paragraph' ('style=' style=STRING)? ('alignment=' alignment=DAlignment)? '>' paragraphContent+=DParagraphContent+
		//'</paragraph>'
		public Group getGroup() { return cGroup; }
		
		//'<paragraph'
		public Keyword getParagraphKeyword_0() { return cParagraphKeyword_0; }
		
		//('style=' style=STRING)?
		public Group getGroup_1() { return cGroup_1; }
		
		//'style='
		public Keyword getStyleKeyword_1_0() { return cStyleKeyword_1_0; }
		
		//style=STRING
		public Assignment getStyleAssignment_1_1() { return cStyleAssignment_1_1; }
		
		//STRING
		public RuleCall getStyleSTRINGTerminalRuleCall_1_1_0() { return cStyleSTRINGTerminalRuleCall_1_1_0; }
		
		//('alignment=' alignment=DAlignment)?
		public Group getGroup_2() { return cGroup_2; }
		
		//'alignment='
		public Keyword getAlignmentKeyword_2_0() { return cAlignmentKeyword_2_0; }
		
		//alignment=DAlignment
		public Assignment getAlignmentAssignment_2_1() { return cAlignmentAssignment_2_1; }
		
		//DAlignment
		public RuleCall getAlignmentDAlignmentEnumRuleCall_2_1_0() { return cAlignmentDAlignmentEnumRuleCall_2_1_0; }
		
		//'>'
		public Keyword getGreaterThanSignKeyword_3() { return cGreaterThanSignKeyword_3; }
		
		//paragraphContent+=DParagraphContent+
		public Assignment getParagraphContentAssignment_4() { return cParagraphContentAssignment_4; }
		
		//DParagraphContent
		public RuleCall getParagraphContentDParagraphContentParserRuleCall_4_0() { return cParagraphContentDParagraphContentParserRuleCall_4_0; }
		
		//'</paragraph>'
		public Keyword getParagraphKeyword_5() { return cParagraphKeyword_5; }
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
		
		//DListItem doctpl::DListItem:
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
		
		//DListContent doctpl::DListContent:
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
		private final Group cGroup_1 = (Group)cGroup.eContents().get(1);
		private final Keyword cAlignmentKeyword_1_0 = (Keyword)cGroup_1.eContents().get(0);
		private final Assignment cAlignmentAssignment_1_1 = (Assignment)cGroup_1.eContents().get(1);
		private final RuleCall cAlignmentDAlignmentEnumRuleCall_1_1_0 = (RuleCall)cAlignmentAssignment_1_1.eContents().get(0);
		private final Group cGroup_2 = (Group)cGroup.eContents().get(2);
		private final Keyword cStyleKeyword_2_0 = (Keyword)cGroup_2.eContents().get(0);
		private final Assignment cStyleAssignment_2_1 = (Assignment)cGroup_2.eContents().get(1);
		private final RuleCall cStyleSTRINGTerminalRuleCall_2_1_0 = (RuleCall)cStyleAssignment_2_1.eContents().get(0);
		private final Keyword cGreaterThanSignKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Assignment cItemsAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cItemsDListItemParserRuleCall_4_0 = (RuleCall)cItemsAssignment_4.eContents().get(0);
		private final Keyword cItemizeKeyword_5 = (Keyword)cGroup.eContents().get(5);
		
		//DItemize doctpl::DItemize:
		//	'<itemize' ('alignment=' alignment=DAlignment)? ('style=' style=STRING)?
		//	'>'
		//	items+=DListItem+
		//	'</itemize>'
		@Override public ParserRule getRule() { return rule; }
		
		//'<itemize' ('alignment=' alignment=DAlignment)? ('style=' style=STRING)? '>' items+=DListItem+ '</itemize>'
		public Group getGroup() { return cGroup; }
		
		//'<itemize'
		public Keyword getItemizeKeyword_0() { return cItemizeKeyword_0; }
		
		//('alignment=' alignment=DAlignment)?
		public Group getGroup_1() { return cGroup_1; }
		
		//'alignment='
		public Keyword getAlignmentKeyword_1_0() { return cAlignmentKeyword_1_0; }
		
		//alignment=DAlignment
		public Assignment getAlignmentAssignment_1_1() { return cAlignmentAssignment_1_1; }
		
		//DAlignment
		public RuleCall getAlignmentDAlignmentEnumRuleCall_1_1_0() { return cAlignmentDAlignmentEnumRuleCall_1_1_0; }
		
		//('style=' style=STRING)?
		public Group getGroup_2() { return cGroup_2; }
		
		//'style='
		public Keyword getStyleKeyword_2_0() { return cStyleKeyword_2_0; }
		
		//style=STRING
		public Assignment getStyleAssignment_2_1() { return cStyleAssignment_2_1; }
		
		//STRING
		public RuleCall getStyleSTRINGTerminalRuleCall_2_1_0() { return cStyleSTRINGTerminalRuleCall_2_1_0; }
		
		//'>'
		public Keyword getGreaterThanSignKeyword_3() { return cGreaterThanSignKeyword_3; }
		
		//items+=DListItem+
		public Assignment getItemsAssignment_4() { return cItemsAssignment_4; }
		
		//DListItem
		public RuleCall getItemsDListItemParserRuleCall_4_0() { return cItemsDListItemParserRuleCall_4_0; }
		
		//'</itemize>'
		public Keyword getItemizeKeyword_5() { return cItemizeKeyword_5; }
	}
	public class DEnumerateElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.micobs.svm.lang.sss.SSS.DEnumerate");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cEnumerateKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Group cGroup_1 = (Group)cGroup.eContents().get(1);
		private final Keyword cAlignmentKeyword_1_0 = (Keyword)cGroup_1.eContents().get(0);
		private final Assignment cAlignmentAssignment_1_1 = (Assignment)cGroup_1.eContents().get(1);
		private final RuleCall cAlignmentDAlignmentEnumRuleCall_1_1_0 = (RuleCall)cAlignmentAssignment_1_1.eContents().get(0);
		private final Group cGroup_2 = (Group)cGroup.eContents().get(2);
		private final Keyword cStyleKeyword_2_0 = (Keyword)cGroup_2.eContents().get(0);
		private final Assignment cStyleAssignment_2_1 = (Assignment)cGroup_2.eContents().get(1);
		private final RuleCall cStyleSTRINGTerminalRuleCall_2_1_0 = (RuleCall)cStyleAssignment_2_1.eContents().get(0);
		private final Keyword cGreaterThanSignKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Assignment cItemsAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cItemsDListItemParserRuleCall_4_0 = (RuleCall)cItemsAssignment_4.eContents().get(0);
		private final Keyword cEnumerateKeyword_5 = (Keyword)cGroup.eContents().get(5);
		
		//DEnumerate doctpl::DEnumerate:
		//	'<enumerate' ('alignment=' alignment=DAlignment)? ('style=' style=STRING)?
		//	'>'
		//	items+=DListItem+
		//	'</enumerate>'
		@Override public ParserRule getRule() { return rule; }
		
		//'<enumerate' ('alignment=' alignment=DAlignment)? ('style=' style=STRING)? '>' items+=DListItem+ '</enumerate>'
		public Group getGroup() { return cGroup; }
		
		//'<enumerate'
		public Keyword getEnumerateKeyword_0() { return cEnumerateKeyword_0; }
		
		//('alignment=' alignment=DAlignment)?
		public Group getGroup_1() { return cGroup_1; }
		
		//'alignment='
		public Keyword getAlignmentKeyword_1_0() { return cAlignmentKeyword_1_0; }
		
		//alignment=DAlignment
		public Assignment getAlignmentAssignment_1_1() { return cAlignmentAssignment_1_1; }
		
		//DAlignment
		public RuleCall getAlignmentDAlignmentEnumRuleCall_1_1_0() { return cAlignmentDAlignmentEnumRuleCall_1_1_0; }
		
		//('style=' style=STRING)?
		public Group getGroup_2() { return cGroup_2; }
		
		//'style='
		public Keyword getStyleKeyword_2_0() { return cStyleKeyword_2_0; }
		
		//style=STRING
		public Assignment getStyleAssignment_2_1() { return cStyleAssignment_2_1; }
		
		//STRING
		public RuleCall getStyleSTRINGTerminalRuleCall_2_1_0() { return cStyleSTRINGTerminalRuleCall_2_1_0; }
		
		//'>'
		public Keyword getGreaterThanSignKeyword_3() { return cGreaterThanSignKeyword_3; }
		
		//items+=DListItem+
		public Assignment getItemsAssignment_4() { return cItemsAssignment_4; }
		
		//DListItem
		public RuleCall getItemsDListItemParserRuleCall_4_0() { return cItemsDListItemParserRuleCall_4_0; }
		
		//'</enumerate>'
		public Keyword getEnumerateKeyword_5() { return cEnumerateKeyword_5; }
	}
	public class DParagraphContentElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.micobs.svm.lang.sss.SSS.DParagraphContent");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cDRunParserRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cDHyperlinkParserRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		
		//DParagraphContent doctpl::DParagraphContent:
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
		private final Keyword cBoldTrueKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Keyword cItalicsTrueKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Keyword cUnderlineTrueKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Keyword cGreaterThanSignKeyword_4 = (Keyword)cGroup.eContents().get(4);
		private final Assignment cTabAssignment_5 = (Assignment)cGroup.eContents().get(5);
		private final RuleCall cTabDTabParserRuleCall_5_0 = (RuleCall)cTabAssignment_5.eContents().get(0);
		private final Assignment cTextAssignment_6 = (Assignment)cGroup.eContents().get(6);
		private final RuleCall cTextDTextParserRuleCall_6_0 = (RuleCall)cTextAssignment_6.eContents().get(0);
		private final Keyword cRunKeyword_7 = (Keyword)cGroup.eContents().get(7);
		
		//DRun doctpl::DRun:
		//	'<run'
		//	'bold="true"'?
		//	'italics="true"'?
		//	'underline="true"'?
		//	'>'
		//	tab=DTab?
		//	text=DText
		//	'</run>'
		@Override public ParserRule getRule() { return rule; }
		
		//'<run' 'bold="true"'? 'italics="true"'? 'underline="true"'? '>' tab=DTab? text=DText '</run>'
		public Group getGroup() { return cGroup; }
		
		//'<run'
		public Keyword getRunKeyword_0() { return cRunKeyword_0; }
		
		//'bold="true"'?
		public Keyword getBoldTrueKeyword_1() { return cBoldTrueKeyword_1; }
		
		//'italics="true"'?
		public Keyword getItalicsTrueKeyword_2() { return cItalicsTrueKeyword_2; }
		
		//'underline="true"'?
		public Keyword getUnderlineTrueKeyword_3() { return cUnderlineTrueKeyword_3; }
		
		//'>'
		public Keyword getGreaterThanSignKeyword_4() { return cGreaterThanSignKeyword_4; }
		
		//tab=DTab?
		public Assignment getTabAssignment_5() { return cTabAssignment_5; }
		
		//DTab
		public RuleCall getTabDTabParserRuleCall_5_0() { return cTabDTabParserRuleCall_5_0; }
		
		//text=DText
		public Assignment getTextAssignment_6() { return cTextAssignment_6; }
		
		//DText
		public RuleCall getTextDTextParserRuleCall_6_0() { return cTextDTextParserRuleCall_6_0; }
		
		//'</run>'
		public Keyword getRunKeyword_7() { return cRunKeyword_7; }
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
		
		//DHyperlink doctpl::DHyperlink:
		//	'<hyperlink'
		//	'reference=' reference=[doctpl::DReferenceableObject|STRING]
		//	'>'
		//	run=DRun?
		//	'</hyperlink>'
		@Override public ParserRule getRule() { return rule; }
		
		//'<hyperlink' 'reference=' reference=[doctpl::DReferenceableObject|STRING] '>' run=DRun? '</hyperlink>'
		public Group getGroup() { return cGroup; }
		
		//'<hyperlink'
		public Keyword getHyperlinkKeyword_0() { return cHyperlinkKeyword_0; }
		
		//'reference='
		public Keyword getReferenceKeyword_1() { return cReferenceKeyword_1; }
		
		//reference=[doctpl::DReferenceableObject|STRING]
		public Assignment getReferenceAssignment_2() { return cReferenceAssignment_2; }
		
		//[doctpl::DReferenceableObject|STRING]
		public CrossReference getReferenceDReferenceableObjectCrossReference_2_0() { return cReferenceDReferenceableObjectCrossReference_2_0; }
		
		//STRING
		public RuleCall getReferenceDReferenceableObjectSTRINGTerminalRuleCall_2_0_1() { return cReferenceDReferenceableObjectSTRINGTerminalRuleCall_2_0_1; }
		
		//'>'
		public Keyword getGreaterThanSignKeyword_3() { return cGreaterThanSignKeyword_3; }
		
		//run=DRun?
		public Assignment getRunAssignment_4() { return cRunAssignment_4; }
		
		//DRun
		public RuleCall getRunDRunParserRuleCall_4_0() { return cRunDRunParserRuleCall_4_0; }
		
		//'</hyperlink>'
		public Keyword getHyperlinkKeyword_5() { return cHyperlinkKeyword_5; }
	}
	public class DTabElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.micobs.svm.lang.sss.SSS.DTab");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cDTabAction_0 = (Action)cGroup.eContents().get(0);
		private final Keyword cTabKeyword_1 = (Keyword)cGroup.eContents().get(1);
		
		//DTab doctpl::DTab:
		//	{doctpl::DTab}
		//	'<tab/>'
		@Override public ParserRule getRule() { return rule; }
		
		//{doctpl::DTab} '<tab/>'
		public Group getGroup() { return cGroup; }
		
		//{doctpl::DTab}
		public Action getDTabAction_0() { return cDTabAction_0; }
		
		//'<tab/>'
		public Keyword getTabKeyword_1() { return cTabKeyword_1; }
	}
	public class DTextElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.micobs.svm.lang.sss.SSS.DText");
		private final Assignment cContentAssignment = (Assignment)rule.eContents().get(1);
		private final RuleCall cContentRUNTEXTTerminalRuleCall_0 = (RuleCall)cContentAssignment.eContents().get(0);
		
		//DText doctpl::DText:
		//	content=RUNTEXT
		@Override public ParserRule getRule() { return rule; }
		
		//content=RUNTEXT
		public Assignment getContentAssignment() { return cContentAssignment; }
		
		//RUNTEXT
		public RuleCall getContentRUNTEXTTerminalRuleCall_0() { return cContentRUNTEXTTerminalRuleCall_0; }
	}
	public class DFigureFromFileElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.micobs.svm.lang.sss.SSS.DFigureFromFile");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cFigureFromFileKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cNameKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cNameAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cNameSTRINGTerminalRuleCall_2_0 = (RuleCall)cNameAssignment_2.eContents().get(0);
		private final Keyword cReferenceFileKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Assignment cReferenceFileAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cReferenceFileSTRINGTerminalRuleCall_4_0 = (RuleCall)cReferenceFileAssignment_4.eContents().get(0);
		private final Keyword cWidthKeyword_5 = (Keyword)cGroup.eContents().get(5);
		private final Assignment cWidthAssignment_6 = (Assignment)cGroup.eContents().get(6);
		private final RuleCall cWidthUINT_STRINGTerminalRuleCall_6_0 = (RuleCall)cWidthAssignment_6.eContents().get(0);
		private final Keyword cHeightKeyword_7 = (Keyword)cGroup.eContents().get(7);
		private final Assignment cHeightAssignment_8 = (Assignment)cGroup.eContents().get(8);
		private final RuleCall cHeightUINT_STRINGTerminalRuleCall_8_0 = (RuleCall)cHeightAssignment_8.eContents().get(0);
		private final Group cGroup_9 = (Group)cGroup.eContents().get(9);
		private final Keyword cAlignmentKeyword_9_0 = (Keyword)cGroup_9.eContents().get(0);
		private final Assignment cAlignmentAssignment_9_1 = (Assignment)cGroup_9.eContents().get(1);
		private final RuleCall cAlignmentDAlignmentEnumRuleCall_9_1_0 = (RuleCall)cAlignmentAssignment_9_1.eContents().get(0);
		private final Group cGroup_10 = (Group)cGroup.eContents().get(10);
		private final Keyword cStyleKeyword_10_0 = (Keyword)cGroup_10.eContents().get(0);
		private final Assignment cStyleAssignment_10_1 = (Assignment)cGroup_10.eContents().get(1);
		private final RuleCall cStyleSTRINGTerminalRuleCall_10_1_0 = (RuleCall)cStyleAssignment_10_1.eContents().get(0);
		private final Group cGroup_11 = (Group)cGroup.eContents().get(11);
		private final Keyword cCaptionKeyword_11_0 = (Keyword)cGroup_11.eContents().get(0);
		private final Assignment cCaptionAssignment_11_1 = (Assignment)cGroup_11.eContents().get(1);
		private final RuleCall cCaptionSTRINGTerminalRuleCall_11_1_0 = (RuleCall)cCaptionAssignment_11_1.eContents().get(0);
		private final Keyword cSolidusGreaterThanSignKeyword_12 = (Keyword)cGroup.eContents().get(12);
		
		//DFigureFromFile doctpl::DFigureFromFile:
		//	'<figureFromFile'
		//	'name=' name=STRING
		//	'referenceFile=' referenceFile=STRING
		//	'width=' width=UINT_STRING
		//	'height=' height=UINT_STRING ('alignment=' alignment=DAlignment)? ('style=' style=STRING)? ('caption='
		//	caption=STRING)?
		//	'/>'
		@Override public ParserRule getRule() { return rule; }
		
		//'<figureFromFile' 'name=' name=STRING 'referenceFile=' referenceFile=STRING 'width=' width=UINT_STRING 'height='
		//height=UINT_STRING ('alignment=' alignment=DAlignment)? ('style=' style=STRING)? ('caption=' caption=STRING)? '/>'
		public Group getGroup() { return cGroup; }
		
		//'<figureFromFile'
		public Keyword getFigureFromFileKeyword_0() { return cFigureFromFileKeyword_0; }
		
		//'name='
		public Keyword getNameKeyword_1() { return cNameKeyword_1; }
		
		//name=STRING
		public Assignment getNameAssignment_2() { return cNameAssignment_2; }
		
		//STRING
		public RuleCall getNameSTRINGTerminalRuleCall_2_0() { return cNameSTRINGTerminalRuleCall_2_0; }
		
		//'referenceFile='
		public Keyword getReferenceFileKeyword_3() { return cReferenceFileKeyword_3; }
		
		//referenceFile=STRING
		public Assignment getReferenceFileAssignment_4() { return cReferenceFileAssignment_4; }
		
		//STRING
		public RuleCall getReferenceFileSTRINGTerminalRuleCall_4_0() { return cReferenceFileSTRINGTerminalRuleCall_4_0; }
		
		//'width='
		public Keyword getWidthKeyword_5() { return cWidthKeyword_5; }
		
		//width=UINT_STRING
		public Assignment getWidthAssignment_6() { return cWidthAssignment_6; }
		
		//UINT_STRING
		public RuleCall getWidthUINT_STRINGTerminalRuleCall_6_0() { return cWidthUINT_STRINGTerminalRuleCall_6_0; }
		
		//'height='
		public Keyword getHeightKeyword_7() { return cHeightKeyword_7; }
		
		//height=UINT_STRING
		public Assignment getHeightAssignment_8() { return cHeightAssignment_8; }
		
		//UINT_STRING
		public RuleCall getHeightUINT_STRINGTerminalRuleCall_8_0() { return cHeightUINT_STRINGTerminalRuleCall_8_0; }
		
		//('alignment=' alignment=DAlignment)?
		public Group getGroup_9() { return cGroup_9; }
		
		//'alignment='
		public Keyword getAlignmentKeyword_9_0() { return cAlignmentKeyword_9_0; }
		
		//alignment=DAlignment
		public Assignment getAlignmentAssignment_9_1() { return cAlignmentAssignment_9_1; }
		
		//DAlignment
		public RuleCall getAlignmentDAlignmentEnumRuleCall_9_1_0() { return cAlignmentDAlignmentEnumRuleCall_9_1_0; }
		
		//('style=' style=STRING)?
		public Group getGroup_10() { return cGroup_10; }
		
		//'style='
		public Keyword getStyleKeyword_10_0() { return cStyleKeyword_10_0; }
		
		//style=STRING
		public Assignment getStyleAssignment_10_1() { return cStyleAssignment_10_1; }
		
		//STRING
		public RuleCall getStyleSTRINGTerminalRuleCall_10_1_0() { return cStyleSTRINGTerminalRuleCall_10_1_0; }
		
		//('caption=' caption=STRING)?
		public Group getGroup_11() { return cGroup_11; }
		
		//'caption='
		public Keyword getCaptionKeyword_11_0() { return cCaptionKeyword_11_0; }
		
		//caption=STRING
		public Assignment getCaptionAssignment_11_1() { return cCaptionAssignment_11_1; }
		
		//STRING
		public RuleCall getCaptionSTRINGTerminalRuleCall_11_1_0() { return cCaptionSTRINGTerminalRuleCall_11_1_0; }
		
		//'/>'
		public Keyword getSolidusGreaterThanSignKeyword_12() { return cSolidusGreaterThanSignKeyword_12; }
	}
	public class DTableFromFileElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.micobs.svm.lang.sss.SSS.DTableFromFile");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cTableFromFileKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cNameKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cNameAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cNameSTRINGTerminalRuleCall_2_0 = (RuleCall)cNameAssignment_2.eContents().get(0);
		private final Keyword cReferenceFileKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Assignment cReferenceFileAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cReferenceFileSTRINGTerminalRuleCall_4_0 = (RuleCall)cReferenceFileAssignment_4.eContents().get(0);
		private final Keyword cWidthKeyword_5 = (Keyword)cGroup.eContents().get(5);
		private final Assignment cWidthAssignment_6 = (Assignment)cGroup.eContents().get(6);
		private final RuleCall cWidthUINT_STRINGTerminalRuleCall_6_0 = (RuleCall)cWidthAssignment_6.eContents().get(0);
		private final Keyword cHeightKeyword_7 = (Keyword)cGroup.eContents().get(7);
		private final Assignment cHeightAssignment_8 = (Assignment)cGroup.eContents().get(8);
		private final RuleCall cHeightUINT_STRINGTerminalRuleCall_8_0 = (RuleCall)cHeightAssignment_8.eContents().get(0);
		private final Group cGroup_9 = (Group)cGroup.eContents().get(9);
		private final Keyword cAlignmentKeyword_9_0 = (Keyword)cGroup_9.eContents().get(0);
		private final Assignment cAlignmentAssignment_9_1 = (Assignment)cGroup_9.eContents().get(1);
		private final RuleCall cAlignmentDAlignmentEnumRuleCall_9_1_0 = (RuleCall)cAlignmentAssignment_9_1.eContents().get(0);
		private final Group cGroup_10 = (Group)cGroup.eContents().get(10);
		private final Keyword cStyleKeyword_10_0 = (Keyword)cGroup_10.eContents().get(0);
		private final Assignment cStyleAssignment_10_1 = (Assignment)cGroup_10.eContents().get(1);
		private final RuleCall cStyleSTRINGTerminalRuleCall_10_1_0 = (RuleCall)cStyleAssignment_10_1.eContents().get(0);
		private final Group cGroup_11 = (Group)cGroup.eContents().get(11);
		private final Keyword cCaptionKeyword_11_0 = (Keyword)cGroup_11.eContents().get(0);
		private final Assignment cCaptionAssignment_11_1 = (Assignment)cGroup_11.eContents().get(1);
		private final RuleCall cCaptionSTRINGTerminalRuleCall_11_1_0 = (RuleCall)cCaptionAssignment_11_1.eContents().get(0);
		private final Keyword cSolidusGreaterThanSignKeyword_12 = (Keyword)cGroup.eContents().get(12);
		
		//DTableFromFile doctpl::DTableFromFile:
		//	'<tableFromFile'
		//	'name=' name=STRING
		//	'referenceFile=' referenceFile=STRING
		//	'width=' width=UINT_STRING
		//	'height=' height=UINT_STRING ('alignment=' alignment=DAlignment)? ('style=' style=STRING)? ('caption='
		//	caption=STRING)?
		//	'/>'
		@Override public ParserRule getRule() { return rule; }
		
		//'<tableFromFile' 'name=' name=STRING 'referenceFile=' referenceFile=STRING 'width=' width=UINT_STRING 'height='
		//height=UINT_STRING ('alignment=' alignment=DAlignment)? ('style=' style=STRING)? ('caption=' caption=STRING)? '/>'
		public Group getGroup() { return cGroup; }
		
		//'<tableFromFile'
		public Keyword getTableFromFileKeyword_0() { return cTableFromFileKeyword_0; }
		
		//'name='
		public Keyword getNameKeyword_1() { return cNameKeyword_1; }
		
		//name=STRING
		public Assignment getNameAssignment_2() { return cNameAssignment_2; }
		
		//STRING
		public RuleCall getNameSTRINGTerminalRuleCall_2_0() { return cNameSTRINGTerminalRuleCall_2_0; }
		
		//'referenceFile='
		public Keyword getReferenceFileKeyword_3() { return cReferenceFileKeyword_3; }
		
		//referenceFile=STRING
		public Assignment getReferenceFileAssignment_4() { return cReferenceFileAssignment_4; }
		
		//STRING
		public RuleCall getReferenceFileSTRINGTerminalRuleCall_4_0() { return cReferenceFileSTRINGTerminalRuleCall_4_0; }
		
		//'width='
		public Keyword getWidthKeyword_5() { return cWidthKeyword_5; }
		
		//width=UINT_STRING
		public Assignment getWidthAssignment_6() { return cWidthAssignment_6; }
		
		//UINT_STRING
		public RuleCall getWidthUINT_STRINGTerminalRuleCall_6_0() { return cWidthUINT_STRINGTerminalRuleCall_6_0; }
		
		//'height='
		public Keyword getHeightKeyword_7() { return cHeightKeyword_7; }
		
		//height=UINT_STRING
		public Assignment getHeightAssignment_8() { return cHeightAssignment_8; }
		
		//UINT_STRING
		public RuleCall getHeightUINT_STRINGTerminalRuleCall_8_0() { return cHeightUINT_STRINGTerminalRuleCall_8_0; }
		
		//('alignment=' alignment=DAlignment)?
		public Group getGroup_9() { return cGroup_9; }
		
		//'alignment='
		public Keyword getAlignmentKeyword_9_0() { return cAlignmentKeyword_9_0; }
		
		//alignment=DAlignment
		public Assignment getAlignmentAssignment_9_1() { return cAlignmentAssignment_9_1; }
		
		//DAlignment
		public RuleCall getAlignmentDAlignmentEnumRuleCall_9_1_0() { return cAlignmentDAlignmentEnumRuleCall_9_1_0; }
		
		//('style=' style=STRING)?
		public Group getGroup_10() { return cGroup_10; }
		
		//'style='
		public Keyword getStyleKeyword_10_0() { return cStyleKeyword_10_0; }
		
		//style=STRING
		public Assignment getStyleAssignment_10_1() { return cStyleAssignment_10_1; }
		
		//STRING
		public RuleCall getStyleSTRINGTerminalRuleCall_10_1_0() { return cStyleSTRINGTerminalRuleCall_10_1_0; }
		
		//('caption=' caption=STRING)?
		public Group getGroup_11() { return cGroup_11; }
		
		//'caption='
		public Keyword getCaptionKeyword_11_0() { return cCaptionKeyword_11_0; }
		
		//caption=STRING
		public Assignment getCaptionAssignment_11_1() { return cCaptionAssignment_11_1; }
		
		//STRING
		public RuleCall getCaptionSTRINGTerminalRuleCall_11_1_0() { return cCaptionSTRINGTerminalRuleCall_11_1_0; }
		
		//'/>'
		public Keyword getSolidusGreaterThanSignKeyword_12() { return cSolidusGreaterThanSignKeyword_12; }
	}
	public class DBasicTableElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.micobs.svm.lang.sss.SSS.DBasicTable");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cBasicTableKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cNameKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cNameAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cNameSTRINGTerminalRuleCall_2_0 = (RuleCall)cNameAssignment_2.eContents().get(0);
		private final Group cGroup_3 = (Group)cGroup.eContents().get(3);
		private final Keyword cWidthKeyword_3_0 = (Keyword)cGroup_3.eContents().get(0);
		private final Assignment cWidthAssignment_3_1 = (Assignment)cGroup_3.eContents().get(1);
		private final RuleCall cWidthUINT_STRINGTerminalRuleCall_3_1_0 = (RuleCall)cWidthAssignment_3_1.eContents().get(0);
		private final Group cGroup_4 = (Group)cGroup.eContents().get(4);
		private final Keyword cAlignmentKeyword_4_0 = (Keyword)cGroup_4.eContents().get(0);
		private final Assignment cAlignmentAssignment_4_1 = (Assignment)cGroup_4.eContents().get(1);
		private final RuleCall cAlignmentDAlignmentEnumRuleCall_4_1_0 = (RuleCall)cAlignmentAssignment_4_1.eContents().get(0);
		private final Group cGroup_5 = (Group)cGroup.eContents().get(5);
		private final Keyword cStyleKeyword_5_0 = (Keyword)cGroup_5.eContents().get(0);
		private final Assignment cStyleAssignment_5_1 = (Assignment)cGroup_5.eContents().get(1);
		private final RuleCall cStyleSTRINGTerminalRuleCall_5_1_0 = (RuleCall)cStyleAssignment_5_1.eContents().get(0);
		private final Group cGroup_6 = (Group)cGroup.eContents().get(6);
		private final Keyword cCaptionKeyword_6_0 = (Keyword)cGroup_6.eContents().get(0);
		private final Assignment cCaptionAssignment_6_1 = (Assignment)cGroup_6.eContents().get(1);
		private final RuleCall cCaptionSTRINGTerminalRuleCall_6_1_0 = (RuleCall)cCaptionAssignment_6_1.eContents().get(0);
		private final Keyword cGreaterThanSignKeyword_7 = (Keyword)cGroup.eContents().get(7);
		private final Assignment cRowsAssignment_8 = (Assignment)cGroup.eContents().get(8);
		private final RuleCall cRowsDRowParserRuleCall_8_0 = (RuleCall)cRowsAssignment_8.eContents().get(0);
		private final Keyword cBasicTableKeyword_9 = (Keyword)cGroup.eContents().get(9);
		
		//DBasicTable doctpl::DBasicTable:
		//	'<basicTable'
		//	'name=' name=STRING ('width=' width=UINT_STRING)? ('alignment=' alignment=DAlignment)? ('style=' style=STRING)?
		//	('caption=' caption=STRING)?
		//	'>'
		//	rows+=DRow+
		//	'</basicTable>'
		@Override public ParserRule getRule() { return rule; }
		
		//'<basicTable' 'name=' name=STRING ('width=' width=UINT_STRING)? ('alignment=' alignment=DAlignment)? ('style='
		//style=STRING)? ('caption=' caption=STRING)? '>' rows+=DRow+ '</basicTable>'
		public Group getGroup() { return cGroup; }
		
		//'<basicTable'
		public Keyword getBasicTableKeyword_0() { return cBasicTableKeyword_0; }
		
		//'name='
		public Keyword getNameKeyword_1() { return cNameKeyword_1; }
		
		//name=STRING
		public Assignment getNameAssignment_2() { return cNameAssignment_2; }
		
		//STRING
		public RuleCall getNameSTRINGTerminalRuleCall_2_0() { return cNameSTRINGTerminalRuleCall_2_0; }
		
		//('width=' width=UINT_STRING)?
		public Group getGroup_3() { return cGroup_3; }
		
		//'width='
		public Keyword getWidthKeyword_3_0() { return cWidthKeyword_3_0; }
		
		//width=UINT_STRING
		public Assignment getWidthAssignment_3_1() { return cWidthAssignment_3_1; }
		
		//UINT_STRING
		public RuleCall getWidthUINT_STRINGTerminalRuleCall_3_1_0() { return cWidthUINT_STRINGTerminalRuleCall_3_1_0; }
		
		//('alignment=' alignment=DAlignment)?
		public Group getGroup_4() { return cGroup_4; }
		
		//'alignment='
		public Keyword getAlignmentKeyword_4_0() { return cAlignmentKeyword_4_0; }
		
		//alignment=DAlignment
		public Assignment getAlignmentAssignment_4_1() { return cAlignmentAssignment_4_1; }
		
		//DAlignment
		public RuleCall getAlignmentDAlignmentEnumRuleCall_4_1_0() { return cAlignmentDAlignmentEnumRuleCall_4_1_0; }
		
		//('style=' style=STRING)?
		public Group getGroup_5() { return cGroup_5; }
		
		//'style='
		public Keyword getStyleKeyword_5_0() { return cStyleKeyword_5_0; }
		
		//style=STRING
		public Assignment getStyleAssignment_5_1() { return cStyleAssignment_5_1; }
		
		//STRING
		public RuleCall getStyleSTRINGTerminalRuleCall_5_1_0() { return cStyleSTRINGTerminalRuleCall_5_1_0; }
		
		//('caption=' caption=STRING)?
		public Group getGroup_6() { return cGroup_6; }
		
		//'caption='
		public Keyword getCaptionKeyword_6_0() { return cCaptionKeyword_6_0; }
		
		//caption=STRING
		public Assignment getCaptionAssignment_6_1() { return cCaptionAssignment_6_1; }
		
		//STRING
		public RuleCall getCaptionSTRINGTerminalRuleCall_6_1_0() { return cCaptionSTRINGTerminalRuleCall_6_1_0; }
		
		//'>'
		public Keyword getGreaterThanSignKeyword_7() { return cGreaterThanSignKeyword_7; }
		
		//rows+=DRow+
		public Assignment getRowsAssignment_8() { return cRowsAssignment_8; }
		
		//DRow
		public RuleCall getRowsDRowParserRuleCall_8_0() { return cRowsDRowParserRuleCall_8_0; }
		
		//'</basicTable>'
		public Keyword getBasicTableKeyword_9() { return cBasicTableKeyword_9; }
	}
	public class DRowElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.micobs.svm.lang.sss.SSS.DRow");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cRowKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cCellsAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cCellsDCellParserRuleCall_1_0 = (RuleCall)cCellsAssignment_1.eContents().get(0);
		private final Keyword cRowKeyword_2 = (Keyword)cGroup.eContents().get(2);
		
		//DRow doctpl::DRow:
		//	'<row>'
		//	cells+=DCell+
		//	'</row>'
		@Override public ParserRule getRule() { return rule; }
		
		//'<row>' cells+=DCell+ '</row>'
		public Group getGroup() { return cGroup; }
		
		//'<row>'
		public Keyword getRowKeyword_0() { return cRowKeyword_0; }
		
		//cells+=DCell+
		public Assignment getCellsAssignment_1() { return cCellsAssignment_1; }
		
		//DCell
		public RuleCall getCellsDCellParserRuleCall_1_0() { return cCellsDCellParserRuleCall_1_0; }
		
		//'</row>'
		public Keyword getRowKeyword_2() { return cRowKeyword_2; }
	}
	public class DCellElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.micobs.svm.lang.sss.SSS.DCell");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cCellKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Group cGroup_1 = (Group)cGroup.eContents().get(1);
		private final Keyword cColSpanKeyword_1_0 = (Keyword)cGroup_1.eContents().get(0);
		private final Assignment cColSpanAssignment_1_1 = (Assignment)cGroup_1.eContents().get(1);
		private final RuleCall cColSpanUINT_STRINGTerminalRuleCall_1_1_0 = (RuleCall)cColSpanAssignment_1_1.eContents().get(0);
		private final Group cGroup_2 = (Group)cGroup.eContents().get(2);
		private final Keyword cRowSpanKeyword_2_0 = (Keyword)cGroup_2.eContents().get(0);
		private final Assignment cRowSpanAssignment_2_1 = (Assignment)cGroup_2.eContents().get(1);
		private final RuleCall cRowSpanUINT_STRINGTerminalRuleCall_2_1_0 = (RuleCall)cRowSpanAssignment_2_1.eContents().get(0);
		private final Group cGroup_3 = (Group)cGroup.eContents().get(3);
		private final Keyword cWidthKeyword_3_0 = (Keyword)cGroup_3.eContents().get(0);
		private final Assignment cWidthAssignment_3_1 = (Assignment)cGroup_3.eContents().get(1);
		private final RuleCall cWidthUINT_STRINGTerminalRuleCall_3_1_0 = (RuleCall)cWidthAssignment_3_1.eContents().get(0);
		private final Group cGroup_4 = (Group)cGroup.eContents().get(4);
		private final Keyword cShadowKeyword_4_0 = (Keyword)cGroup_4.eContents().get(0);
		private final Assignment cShadowAssignment_4_1 = (Assignment)cGroup_4.eContents().get(1);
		private final RuleCall cShadowSTRINGTerminalRuleCall_4_1_0 = (RuleCall)cShadowAssignment_4_1.eContents().get(0);
		private final Keyword cGreaterThanSignKeyword_5 = (Keyword)cGroup.eContents().get(5);
		private final Assignment cBodyContentAssignment_6 = (Assignment)cGroup.eContents().get(6);
		private final RuleCall cBodyContentDBodyContentParserRuleCall_6_0 = (RuleCall)cBodyContentAssignment_6.eContents().get(0);
		private final Keyword cCellKeyword_7 = (Keyword)cGroup.eContents().get(7);
		
		//DCell doctpl::DCell:
		//	'<cell' ('colSpan=' colSpan=UINT_STRING)? ('rowSpan=' rowSpan=UINT_STRING)? ('width=' width=UINT_STRING)? ('shadow='
		//	shadow=STRING)?
		//	'>'
		//	bodyContent+=DBodyContent+
		//	'</cell>'
		@Override public ParserRule getRule() { return rule; }
		
		//'<cell' ('colSpan=' colSpan=UINT_STRING)? ('rowSpan=' rowSpan=UINT_STRING)? ('width=' width=UINT_STRING)? ('shadow='
		//shadow=STRING)? '>' bodyContent+=DBodyContent+ '</cell>'
		public Group getGroup() { return cGroup; }
		
		//'<cell'
		public Keyword getCellKeyword_0() { return cCellKeyword_0; }
		
		//('colSpan=' colSpan=UINT_STRING)?
		public Group getGroup_1() { return cGroup_1; }
		
		//'colSpan='
		public Keyword getColSpanKeyword_1_0() { return cColSpanKeyword_1_0; }
		
		//colSpan=UINT_STRING
		public Assignment getColSpanAssignment_1_1() { return cColSpanAssignment_1_1; }
		
		//UINT_STRING
		public RuleCall getColSpanUINT_STRINGTerminalRuleCall_1_1_0() { return cColSpanUINT_STRINGTerminalRuleCall_1_1_0; }
		
		//('rowSpan=' rowSpan=UINT_STRING)?
		public Group getGroup_2() { return cGroup_2; }
		
		//'rowSpan='
		public Keyword getRowSpanKeyword_2_0() { return cRowSpanKeyword_2_0; }
		
		//rowSpan=UINT_STRING
		public Assignment getRowSpanAssignment_2_1() { return cRowSpanAssignment_2_1; }
		
		//UINT_STRING
		public RuleCall getRowSpanUINT_STRINGTerminalRuleCall_2_1_0() { return cRowSpanUINT_STRINGTerminalRuleCall_2_1_0; }
		
		//('width=' width=UINT_STRING)?
		public Group getGroup_3() { return cGroup_3; }
		
		//'width='
		public Keyword getWidthKeyword_3_0() { return cWidthKeyword_3_0; }
		
		//width=UINT_STRING
		public Assignment getWidthAssignment_3_1() { return cWidthAssignment_3_1; }
		
		//UINT_STRING
		public RuleCall getWidthUINT_STRINGTerminalRuleCall_3_1_0() { return cWidthUINT_STRINGTerminalRuleCall_3_1_0; }
		
		//('shadow=' shadow=STRING)?
		public Group getGroup_4() { return cGroup_4; }
		
		//'shadow='
		public Keyword getShadowKeyword_4_0() { return cShadowKeyword_4_0; }
		
		//shadow=STRING
		public Assignment getShadowAssignment_4_1() { return cShadowAssignment_4_1; }
		
		//STRING
		public RuleCall getShadowSTRINGTerminalRuleCall_4_1_0() { return cShadowSTRINGTerminalRuleCall_4_1_0; }
		
		//'>'
		public Keyword getGreaterThanSignKeyword_5() { return cGreaterThanSignKeyword_5; }
		
		//bodyContent+=DBodyContent+
		public Assignment getBodyContentAssignment_6() { return cBodyContentAssignment_6; }
		
		//DBodyContent
		public RuleCall getBodyContentDBodyContentParserRuleCall_6_0() { return cBodyContentDBodyContentParserRuleCall_6_0; }
		
		//'</cell>'
		public Keyword getCellKeyword_7() { return cCellKeyword_7; }
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
		private final Keyword cIdKeyword_5 = (Keyword)cGroup.eContents().get(5);
		private final Assignment cIdAssignment_6 = (Assignment)cGroup.eContents().get(6);
		private final RuleCall cIdSTRINGTerminalRuleCall_6_0 = (RuleCall)cIdAssignment_6.eContents().get(0);
		private final Group cGroup_7 = (Group)cGroup.eContents().get(7);
		private final Keyword cIssueKeyword_7_0 = (Keyword)cGroup_7.eContents().get(0);
		private final Assignment cIssueAssignment_7_1 = (Assignment)cGroup_7.eContents().get(1);
		private final RuleCall cIssueUINT_STRINGTerminalRuleCall_7_1_0 = (RuleCall)cIssueAssignment_7_1.eContents().get(0);
		private final Group cGroup_7_2 = (Group)cGroup_7.eContents().get(2);
		private final Keyword cRevisionKeyword_7_2_0 = (Keyword)cGroup_7_2.eContents().get(0);
		private final Assignment cRevisionAssignment_7_2_1 = (Assignment)cGroup_7_2.eContents().get(1);
		private final RuleCall cRevisionUINT_STRINGTerminalRuleCall_7_2_1_0 = (RuleCall)cRevisionAssignment_7_2_1.eContents().get(0);
		private final Group cGroup_8 = (Group)cGroup.eContents().get(8);
		private final Keyword cDateKeyword_8_0 = (Keyword)cGroup_8.eContents().get(0);
		private final Assignment cDateAssignment_8_1 = (Assignment)cGroup_8.eContents().get(1);
		private final RuleCall cDateSTRINGTerminalRuleCall_8_1_0 = (RuleCall)cDateAssignment_8_1.eContents().get(0);
		private final Keyword cSolidusGreaterThanSignKeyword_9 = (Keyword)cGroup.eContents().get(9);
		
		//DApplicableDocument doctpl::DApplicableDocument:
		//	'<ApplicableDocument'
		//	'name=' name=STRING
		//	'title=' title=STRING
		//	'id=' id=STRING ('issue=' issue=UINT_STRING ('revision=' revision=UINT_STRING)?)? ('date=' date=STRING)?
		//	'/>'
		@Override public ParserRule getRule() { return rule; }
		
		//'<ApplicableDocument' 'name=' name=STRING 'title=' title=STRING 'id=' id=STRING ('issue=' issue=UINT_STRING ('revision='
		//revision=UINT_STRING)?)? ('date=' date=STRING)? '/>'
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
		
		//'id='
		public Keyword getIdKeyword_5() { return cIdKeyword_5; }
		
		//id=STRING
		public Assignment getIdAssignment_6() { return cIdAssignment_6; }
		
		//STRING
		public RuleCall getIdSTRINGTerminalRuleCall_6_0() { return cIdSTRINGTerminalRuleCall_6_0; }
		
		//('issue=' issue=UINT_STRING ('revision=' revision=UINT_STRING)?)?
		public Group getGroup_7() { return cGroup_7; }
		
		//'issue='
		public Keyword getIssueKeyword_7_0() { return cIssueKeyword_7_0; }
		
		//issue=UINT_STRING
		public Assignment getIssueAssignment_7_1() { return cIssueAssignment_7_1; }
		
		//UINT_STRING
		public RuleCall getIssueUINT_STRINGTerminalRuleCall_7_1_0() { return cIssueUINT_STRINGTerminalRuleCall_7_1_0; }
		
		//('revision=' revision=UINT_STRING)?
		public Group getGroup_7_2() { return cGroup_7_2; }
		
		//'revision='
		public Keyword getRevisionKeyword_7_2_0() { return cRevisionKeyword_7_2_0; }
		
		//revision=UINT_STRING
		public Assignment getRevisionAssignment_7_2_1() { return cRevisionAssignment_7_2_1; }
		
		//UINT_STRING
		public RuleCall getRevisionUINT_STRINGTerminalRuleCall_7_2_1_0() { return cRevisionUINT_STRINGTerminalRuleCall_7_2_1_0; }
		
		//('date=' date=STRING)?
		public Group getGroup_8() { return cGroup_8; }
		
		//'date='
		public Keyword getDateKeyword_8_0() { return cDateKeyword_8_0; }
		
		//date=STRING
		public Assignment getDateAssignment_8_1() { return cDateAssignment_8_1; }
		
		//STRING
		public RuleCall getDateSTRINGTerminalRuleCall_8_1_0() { return cDateSTRINGTerminalRuleCall_8_1_0; }
		
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
		private final Keyword cIdKeyword_5 = (Keyword)cGroup.eContents().get(5);
		private final Assignment cIdAssignment_6 = (Assignment)cGroup.eContents().get(6);
		private final RuleCall cIdSTRINGTerminalRuleCall_6_0 = (RuleCall)cIdAssignment_6.eContents().get(0);
		private final Group cGroup_7 = (Group)cGroup.eContents().get(7);
		private final Keyword cIssueKeyword_7_0 = (Keyword)cGroup_7.eContents().get(0);
		private final Assignment cIssueAssignment_7_1 = (Assignment)cGroup_7.eContents().get(1);
		private final RuleCall cIssueUINT_STRINGTerminalRuleCall_7_1_0 = (RuleCall)cIssueAssignment_7_1.eContents().get(0);
		private final Group cGroup_7_2 = (Group)cGroup_7.eContents().get(2);
		private final Keyword cRevisionKeyword_7_2_0 = (Keyword)cGroup_7_2.eContents().get(0);
		private final Assignment cRevisionAssignment_7_2_1 = (Assignment)cGroup_7_2.eContents().get(1);
		private final RuleCall cRevisionUINT_STRINGTerminalRuleCall_7_2_1_0 = (RuleCall)cRevisionAssignment_7_2_1.eContents().get(0);
		private final Group cGroup_8 = (Group)cGroup.eContents().get(8);
		private final Keyword cDateKeyword_8_0 = (Keyword)cGroup_8.eContents().get(0);
		private final Assignment cDateAssignment_8_1 = (Assignment)cGroup_8.eContents().get(1);
		private final RuleCall cDateSTRINGTerminalRuleCall_8_1_0 = (RuleCall)cDateAssignment_8_1.eContents().get(0);
		private final Keyword cSolidusGreaterThanSignKeyword_9 = (Keyword)cGroup.eContents().get(9);
		
		//DReferenceDocument doctpl::DReferenceDocument:
		//	'<ReferenceDocument'
		//	'name=' name=STRING
		//	'title=' title=STRING
		//	'id=' id=STRING ('issue=' issue=UINT_STRING ('revision=' revision=UINT_STRING)?)? ('date=' date=STRING)?
		//	'/>'
		@Override public ParserRule getRule() { return rule; }
		
		//'<ReferenceDocument' 'name=' name=STRING 'title=' title=STRING 'id=' id=STRING ('issue=' issue=UINT_STRING ('revision='
		//revision=UINT_STRING)?)? ('date=' date=STRING)? '/>'
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
		
		//'id='
		public Keyword getIdKeyword_5() { return cIdKeyword_5; }
		
		//id=STRING
		public Assignment getIdAssignment_6() { return cIdAssignment_6; }
		
		//STRING
		public RuleCall getIdSTRINGTerminalRuleCall_6_0() { return cIdSTRINGTerminalRuleCall_6_0; }
		
		//('issue=' issue=UINT_STRING ('revision=' revision=UINT_STRING)?)?
		public Group getGroup_7() { return cGroup_7; }
		
		//'issue='
		public Keyword getIssueKeyword_7_0() { return cIssueKeyword_7_0; }
		
		//issue=UINT_STRING
		public Assignment getIssueAssignment_7_1() { return cIssueAssignment_7_1; }
		
		//UINT_STRING
		public RuleCall getIssueUINT_STRINGTerminalRuleCall_7_1_0() { return cIssueUINT_STRINGTerminalRuleCall_7_1_0; }
		
		//('revision=' revision=UINT_STRING)?
		public Group getGroup_7_2() { return cGroup_7_2; }
		
		//'revision='
		public Keyword getRevisionKeyword_7_2_0() { return cRevisionKeyword_7_2_0; }
		
		//revision=UINT_STRING
		public Assignment getRevisionAssignment_7_2_1() { return cRevisionAssignment_7_2_1; }
		
		//UINT_STRING
		public RuleCall getRevisionUINT_STRINGTerminalRuleCall_7_2_1_0() { return cRevisionUINT_STRINGTerminalRuleCall_7_2_1_0; }
		
		//('date=' date=STRING)?
		public Group getGroup_8() { return cGroup_8; }
		
		//'date='
		public Keyword getDateKeyword_8_0() { return cDateKeyword_8_0; }
		
		//date=STRING
		public Assignment getDateAssignment_8_1() { return cDateAssignment_8_1; }
		
		//STRING
		public RuleCall getDateSTRINGTerminalRuleCall_8_1_0() { return cDateSTRINGTerminalRuleCall_8_1_0; }
		
		//'/>'
		public Keyword getSolidusGreaterThanSignKeyword_9() { return cSolidusGreaterThanSignKeyword_9; }
	}
	public class VSSSFixedSectionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.micobs.svm.lang.sss.SSS.VSSSFixedSection");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cVSSSFixedSectionAction_0 = (Action)cGroup.eContents().get(0);
		private final Assignment cBodyAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cBodyDBodyParserRuleCall_1_0 = (RuleCall)cBodyAssignment_1.eContents().get(0);
		private final Assignment cSssInstatiableSubsectionsAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cSssInstatiableSubsectionsVSSSInstatiableSectionParserRuleCall_2_0 = (RuleCall)cSssInstatiableSubsectionsAssignment_2.eContents().get(0);
		
		//VSSSFixedSection:
		//	{VSSSFixedSection} body=DBody?
		//	sssInstatiableSubsections+=VSSSInstatiableSection*;
		@Override public ParserRule getRule() { return rule; }
		
		//{VSSSFixedSection} body=DBody? sssInstatiableSubsections+=VSSSInstatiableSection*
		public Group getGroup() { return cGroup; }
		
		//{VSSSFixedSection}
		public Action getVSSSFixedSectionAction_0() { return cVSSSFixedSectionAction_0; }
		
		//body=DBody?
		public Assignment getBodyAssignment_1() { return cBodyAssignment_1; }
		
		//DBody
		public RuleCall getBodyDBodyParserRuleCall_1_0() { return cBodyDBodyParserRuleCall_1_0; }
		
		//sssInstatiableSubsections+=VSSSInstatiableSection*
		public Assignment getSssInstatiableSubsectionsAssignment_2() { return cSssInstatiableSubsectionsAssignment_2; }
		
		//VSSSInstatiableSection
		public RuleCall getSssInstatiableSubsectionsVSSSInstatiableSectionParserRuleCall_2_0() { return cSssInstatiableSubsectionsVSSSInstatiableSectionParserRuleCall_2_0; }
	}
	public class VSSSInstatiableSectionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.micobs.svm.lang.sss.SSS.VSSSInstatiableSection");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cSubsectionKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cNameKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cNameAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cNameSTRINGTerminalRuleCall_2_0 = (RuleCall)cNameAssignment_2.eContents().get(0);
		private final Keyword cGreaterThanSignKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Assignment cBodyAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cBodyDBodyParserRuleCall_4_0 = (RuleCall)cBodyAssignment_4.eContents().get(0);
		private final Assignment cSssInstatiableSubsectionsAssignment_5 = (Assignment)cGroup.eContents().get(5);
		private final RuleCall cSssInstatiableSubsectionsVSSSInstatiableSectionParserRuleCall_5_0 = (RuleCall)cSssInstatiableSubsectionsAssignment_5.eContents().get(0);
		private final Keyword cSubsectionKeyword_6 = (Keyword)cGroup.eContents().get(6);
		
		//VSSSInstatiableSection VSSSInstantiableSection:
		//	'<subsection'
		//	'name=' name=STRING
		//	'>'
		//	body=DBody?
		//	sssInstatiableSubsections+=VSSSInstatiableSection*
		//	'</subsection>'
		@Override public ParserRule getRule() { return rule; }
		
		//'<subsection' 'name=' name=STRING '>' body=DBody? sssInstatiableSubsections+=VSSSInstatiableSection* '</subsection>'
		public Group getGroup() { return cGroup; }
		
		//'<subsection'
		public Keyword getSubsectionKeyword_0() { return cSubsectionKeyword_0; }
		
		//'name='
		public Keyword getNameKeyword_1() { return cNameKeyword_1; }
		
		//name=STRING
		public Assignment getNameAssignment_2() { return cNameAssignment_2; }
		
		//STRING
		public RuleCall getNameSTRINGTerminalRuleCall_2_0() { return cNameSTRINGTerminalRuleCall_2_0; }
		
		//'>'
		public Keyword getGreaterThanSignKeyword_3() { return cGreaterThanSignKeyword_3; }
		
		//body=DBody?
		public Assignment getBodyAssignment_4() { return cBodyAssignment_4; }
		
		//DBody
		public RuleCall getBodyDBodyParserRuleCall_4_0() { return cBodyDBodyParserRuleCall_4_0; }
		
		//sssInstatiableSubsections+=VSSSInstatiableSection*
		public Assignment getSssInstatiableSubsectionsAssignment_5() { return cSssInstatiableSubsectionsAssignment_5; }
		
		//VSSSInstatiableSection
		public RuleCall getSssInstatiableSubsectionsVSSSInstatiableSectionParserRuleCall_5_0() { return cSssInstatiableSubsectionsVSSSInstatiableSectionParserRuleCall_5_0; }
		
		//'</subsection>'
		public Keyword getSubsectionKeyword_6() { return cSubsectionKeyword_6; }
	}
	public class VSSSIntroductionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.micobs.svm.lang.sss.SSS.VSSSIntroduction");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cIntroductionKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cSssInstatiableSubsectionsAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cSssInstatiableSubsectionsVSSSInstatiableSectionParserRuleCall_1_0 = (RuleCall)cSssInstatiableSubsectionsAssignment_1.eContents().get(0);
		private final Keyword cIntroductionKeyword_2 = (Keyword)cGroup.eContents().get(2);
		
		//VSSSIntroduction:
		//	'<Introduction>'
		//	sssInstatiableSubsections+=VSSSInstatiableSection+
		//	'</Introduction>';
		@Override public ParserRule getRule() { return rule; }
		
		//'<Introduction>' sssInstatiableSubsections+=VSSSInstatiableSection+ '</Introduction>'
		public Group getGroup() { return cGroup; }
		
		//'<Introduction>'
		public Keyword getIntroductionKeyword_0() { return cIntroductionKeyword_0; }
		
		//sssInstatiableSubsections+=VSSSInstatiableSection+
		public Assignment getSssInstatiableSubsectionsAssignment_1() { return cSssInstatiableSubsectionsAssignment_1; }
		
		//VSSSInstatiableSection
		public RuleCall getSssInstatiableSubsectionsVSSSInstatiableSectionParserRuleCall_1_0() { return cSssInstatiableSubsectionsVSSSInstatiableSectionParserRuleCall_1_0; }
		
		//'</Introduction>'
		public Keyword getIntroductionKeyword_2() { return cIntroductionKeyword_2; }
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
		private final RuleCall cProductPerspectiveVSSSFixedSectionParserRuleCall_2_0 = (RuleCall)cProductPerspectiveAssignment_2.eContents().get(0);
		private final Keyword cProductPerspectiveKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Keyword cGeneralCapabilitiesKeyword_4 = (Keyword)cGroup.eContents().get(4);
		private final Assignment cGeneralCapabilitiesAssignment_5 = (Assignment)cGroup.eContents().get(5);
		private final RuleCall cGeneralCapabilitiesVSSSFixedSectionParserRuleCall_5_0 = (RuleCall)cGeneralCapabilitiesAssignment_5.eContents().get(0);
		private final Keyword cGeneralCapabilitiesKeyword_6 = (Keyword)cGroup.eContents().get(6);
		private final Keyword cGeneralConstraintsKeyword_7 = (Keyword)cGroup.eContents().get(7);
		private final Assignment cGeneralConstraintsAssignment_8 = (Assignment)cGroup.eContents().get(8);
		private final RuleCall cGeneralConstraintsVSSSFixedSectionParserRuleCall_8_0 = (RuleCall)cGeneralConstraintsAssignment_8.eContents().get(0);
		private final Keyword cGeneralConstraintsKeyword_9 = (Keyword)cGroup.eContents().get(9);
		private final Keyword cOperationalEnvironmentKeyword_10 = (Keyword)cGroup.eContents().get(10);
		private final Assignment cOperationalEnvironmentAssignment_11 = (Assignment)cGroup.eContents().get(11);
		private final RuleCall cOperationalEnvironmentVSSSFixedSectionParserRuleCall_11_0 = (RuleCall)cOperationalEnvironmentAssignment_11.eContents().get(0);
		private final Keyword cOperationalEnvironmentKeyword_12 = (Keyword)cGroup.eContents().get(12);
		private final Keyword cAssumptionsDependenciesKeyword_13 = (Keyword)cGroup.eContents().get(13);
		private final Assignment cAssumptionsDependenciesAssignment_14 = (Assignment)cGroup.eContents().get(14);
		private final RuleCall cAssumptionsDependenciesVSSSFixedSectionParserRuleCall_14_0 = (RuleCall)cAssumptionsDependenciesAssignment_14.eContents().get(0);
		private final Keyword cAssumptionsDependenciesKeyword_15 = (Keyword)cGroup.eContents().get(15);
		private final Keyword cGeneralDescriptionKeyword_16 = (Keyword)cGroup.eContents().get(16);
		
		//VSSSGeneralDescription:
		//	'<GeneralDescription>'
		//	'<ProductPerspective>' productPerspective=VSSSFixedSection '</ProductPerspective>'
		//	'<GeneralCapabilities>' generalCapabilities=VSSSFixedSection '</GeneralCapabilities>'
		//	'<GeneralConstraints>' generalConstraints=VSSSFixedSection '</GeneralConstraints>'
		//	'<OperationalEnvironment>' operationalEnvironment=VSSSFixedSection '</OperationalEnvironment>'
		//	'<AssumptionsDependencies>' assumptionsDependencies=VSSSFixedSection '</AssumptionsDependencies>'
		//	'</GeneralDescription>';
		@Override public ParserRule getRule() { return rule; }
		
		//'<GeneralDescription>' '<ProductPerspective>' productPerspective=VSSSFixedSection '</ProductPerspective>'
		//'<GeneralCapabilities>' generalCapabilities=VSSSFixedSection '</GeneralCapabilities>' '<GeneralConstraints>'
		//generalConstraints=VSSSFixedSection '</GeneralConstraints>' '<OperationalEnvironment>'
		//operationalEnvironment=VSSSFixedSection '</OperationalEnvironment>' '<AssumptionsDependencies>'
		//assumptionsDependencies=VSSSFixedSection '</AssumptionsDependencies>' '</GeneralDescription>'
		public Group getGroup() { return cGroup; }
		
		//'<GeneralDescription>'
		public Keyword getGeneralDescriptionKeyword_0() { return cGeneralDescriptionKeyword_0; }
		
		//'<ProductPerspective>'
		public Keyword getProductPerspectiveKeyword_1() { return cProductPerspectiveKeyword_1; }
		
		//productPerspective=VSSSFixedSection
		public Assignment getProductPerspectiveAssignment_2() { return cProductPerspectiveAssignment_2; }
		
		//VSSSFixedSection
		public RuleCall getProductPerspectiveVSSSFixedSectionParserRuleCall_2_0() { return cProductPerspectiveVSSSFixedSectionParserRuleCall_2_0; }
		
		//'</ProductPerspective>'
		public Keyword getProductPerspectiveKeyword_3() { return cProductPerspectiveKeyword_3; }
		
		//'<GeneralCapabilities>'
		public Keyword getGeneralCapabilitiesKeyword_4() { return cGeneralCapabilitiesKeyword_4; }
		
		//generalCapabilities=VSSSFixedSection
		public Assignment getGeneralCapabilitiesAssignment_5() { return cGeneralCapabilitiesAssignment_5; }
		
		//VSSSFixedSection
		public RuleCall getGeneralCapabilitiesVSSSFixedSectionParserRuleCall_5_0() { return cGeneralCapabilitiesVSSSFixedSectionParserRuleCall_5_0; }
		
		//'</GeneralCapabilities>'
		public Keyword getGeneralCapabilitiesKeyword_6() { return cGeneralCapabilitiesKeyword_6; }
		
		//'<GeneralConstraints>'
		public Keyword getGeneralConstraintsKeyword_7() { return cGeneralConstraintsKeyword_7; }
		
		//generalConstraints=VSSSFixedSection
		public Assignment getGeneralConstraintsAssignment_8() { return cGeneralConstraintsAssignment_8; }
		
		//VSSSFixedSection
		public RuleCall getGeneralConstraintsVSSSFixedSectionParserRuleCall_8_0() { return cGeneralConstraintsVSSSFixedSectionParserRuleCall_8_0; }
		
		//'</GeneralConstraints>'
		public Keyword getGeneralConstraintsKeyword_9() { return cGeneralConstraintsKeyword_9; }
		
		//'<OperationalEnvironment>'
		public Keyword getOperationalEnvironmentKeyword_10() { return cOperationalEnvironmentKeyword_10; }
		
		//operationalEnvironment=VSSSFixedSection
		public Assignment getOperationalEnvironmentAssignment_11() { return cOperationalEnvironmentAssignment_11; }
		
		//VSSSFixedSection
		public RuleCall getOperationalEnvironmentVSSSFixedSectionParserRuleCall_11_0() { return cOperationalEnvironmentVSSSFixedSectionParserRuleCall_11_0; }
		
		//'</OperationalEnvironment>'
		public Keyword getOperationalEnvironmentKeyword_12() { return cOperationalEnvironmentKeyword_12; }
		
		//'<AssumptionsDependencies>'
		public Keyword getAssumptionsDependenciesKeyword_13() { return cAssumptionsDependenciesKeyword_13; }
		
		//assumptionsDependencies=VSSSFixedSection
		public Assignment getAssumptionsDependenciesAssignment_14() { return cAssumptionsDependenciesAssignment_14; }
		
		//VSSSFixedSection
		public RuleCall getAssumptionsDependenciesVSSSFixedSectionParserRuleCall_14_0() { return cAssumptionsDependenciesVSSSFixedSectionParserRuleCall_14_0; }
		
		//'</AssumptionsDependencies>'
		public Keyword getAssumptionsDependenciesKeyword_15() { return cAssumptionsDependenciesKeyword_15; }
		
		//'</GeneralDescription>'
		public Keyword getGeneralDescriptionKeyword_16() { return cGeneralDescriptionKeyword_16; }
	}
	public class VSSSSpecificRequirementsElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.micobs.svm.lang.sss.SSS.VSSSSpecificRequirements");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cSpecificRequirementsKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cSectionDescriptionAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cSectionDescriptionDBodyParserRuleCall_1_0 = (RuleCall)cSectionDescriptionAssignment_1.eContents().get(0);
		private final Assignment cGeneralAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cGeneralVSSSGeneralRequirementsParserRuleCall_2_0 = (RuleCall)cGeneralAssignment_2.eContents().get(0);
		private final Assignment cCapabilitiesAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cCapabilitiesVSSSCapabilitiesRequirementsParserRuleCall_3_0 = (RuleCall)cCapabilitiesAssignment_3.eContents().get(0);
		private final Assignment cSystemInterfaceAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cSystemInterfaceVSSSSystemInterfaceRequirementsParserRuleCall_4_0 = (RuleCall)cSystemInterfaceAssignment_4.eContents().get(0);
		private final Assignment cAdaptationMissionizationAssignment_5 = (Assignment)cGroup.eContents().get(5);
		private final RuleCall cAdaptationMissionizationVSSSAdaptationMissionizationRequirementsParserRuleCall_5_0 = (RuleCall)cAdaptationMissionizationAssignment_5.eContents().get(0);
		private final Assignment cComputerResourceAssignment_6 = (Assignment)cGroup.eContents().get(6);
		private final RuleCall cComputerResourceVSSSComputerResourceRequirementsParserRuleCall_6_0 = (RuleCall)cComputerResourceAssignment_6.eContents().get(0);
		private final Assignment cSecurityAssignment_7 = (Assignment)cGroup.eContents().get(7);
		private final RuleCall cSecurityVSSSSecurityRequirementsParserRuleCall_7_0 = (RuleCall)cSecurityAssignment_7.eContents().get(0);
		private final Assignment cSafetyAssignment_8 = (Assignment)cGroup.eContents().get(8);
		private final RuleCall cSafetyVSSSSafetyRequirementsParserRuleCall_8_0 = (RuleCall)cSafetyAssignment_8.eContents().get(0);
		private final Assignment cReliabilityAvailabilityAssignment_9 = (Assignment)cGroup.eContents().get(9);
		private final RuleCall cReliabilityAvailabilityVSSSReliabilityAvailabilityRequirementsParserRuleCall_9_0 = (RuleCall)cReliabilityAvailabilityAssignment_9.eContents().get(0);
		private final Assignment cQualityAssignment_10 = (Assignment)cGroup.eContents().get(10);
		private final RuleCall cQualityVSSSQualityRequirementsParserRuleCall_10_0 = (RuleCall)cQualityAssignment_10.eContents().get(0);
		private final Assignment cDesignAssignment_11 = (Assignment)cGroup.eContents().get(11);
		private final RuleCall cDesignVSSSDesignRequirementsParserRuleCall_11_0 = (RuleCall)cDesignAssignment_11.eContents().get(0);
		private final Assignment cSoftwareOperationsAssignment_12 = (Assignment)cGroup.eContents().get(12);
		private final RuleCall cSoftwareOperationsVSSSSoftwareOperationsRequirementsParserRuleCall_12_0 = (RuleCall)cSoftwareOperationsAssignment_12.eContents().get(0);
		private final Assignment cSoftwareMaintenanceAssignment_13 = (Assignment)cGroup.eContents().get(13);
		private final RuleCall cSoftwareMaintenanceVSSSSoftwareMaintenanceRequirementsParserRuleCall_13_0 = (RuleCall)cSoftwareMaintenanceAssignment_13.eContents().get(0);
		private final Assignment cSystemSoftwareObservabilityAssignment_14 = (Assignment)cGroup.eContents().get(14);
		private final RuleCall cSystemSoftwareObservabilityVSSSSystemSoftwareObservabilityRequirementsParserRuleCall_14_0 = (RuleCall)cSystemSoftwareObservabilityAssignment_14.eContents().get(0);
		private final Keyword cSpecificRequirementsKeyword_15 = (Keyword)cGroup.eContents().get(15);
		
		//VSSSSpecificRequirements:
		//	'<SpecificRequirements>'
		//	sectionDescription=DBody?
		//	general=VSSSGeneralRequirements
		//	capabilities=VSSSCapabilitiesRequirements
		//	systemInterface=VSSSSystemInterfaceRequirements
		//	adaptationMissionization=VSSSAdaptationMissionizationRequirements
		//	computerResource=VSSSComputerResourceRequirements
		//	security=VSSSSecurityRequirements
		//	safety=VSSSSafetyRequirements
		//	reliabilityAvailability=VSSSReliabilityAvailabilityRequirements
		//	quality=VSSSQualityRequirements
		//	design=VSSSDesignRequirements
		//	softwareOperations=VSSSSoftwareOperationsRequirements
		//	softwareMaintenance=VSSSSoftwareMaintenanceRequirements
		//	systemSoftwareObservability=VSSSSystemSoftwareObservabilityRequirements
		//	'</SpecificRequirements>';
		@Override public ParserRule getRule() { return rule; }
		
		//'<SpecificRequirements>' sectionDescription=DBody? general=VSSSGeneralRequirements
		//capabilities=VSSSCapabilitiesRequirements systemInterface=VSSSSystemInterfaceRequirements
		//adaptationMissionization=VSSSAdaptationMissionizationRequirements computerResource=VSSSComputerResourceRequirements
		//security=VSSSSecurityRequirements safety=VSSSSafetyRequirements
		//reliabilityAvailability=VSSSReliabilityAvailabilityRequirements quality=VSSSQualityRequirements
		//design=VSSSDesignRequirements softwareOperations=VSSSSoftwareOperationsRequirements
		//softwareMaintenance=VSSSSoftwareMaintenanceRequirements
		//systemSoftwareObservability=VSSSSystemSoftwareObservabilityRequirements '</SpecificRequirements>'
		public Group getGroup() { return cGroup; }
		
		//'<SpecificRequirements>'
		public Keyword getSpecificRequirementsKeyword_0() { return cSpecificRequirementsKeyword_0; }
		
		//sectionDescription=DBody?
		public Assignment getSectionDescriptionAssignment_1() { return cSectionDescriptionAssignment_1; }
		
		//DBody
		public RuleCall getSectionDescriptionDBodyParserRuleCall_1_0() { return cSectionDescriptionDBodyParserRuleCall_1_0; }
		
		//general=VSSSGeneralRequirements
		public Assignment getGeneralAssignment_2() { return cGeneralAssignment_2; }
		
		//VSSSGeneralRequirements
		public RuleCall getGeneralVSSSGeneralRequirementsParserRuleCall_2_0() { return cGeneralVSSSGeneralRequirementsParserRuleCall_2_0; }
		
		//capabilities=VSSSCapabilitiesRequirements
		public Assignment getCapabilitiesAssignment_3() { return cCapabilitiesAssignment_3; }
		
		//VSSSCapabilitiesRequirements
		public RuleCall getCapabilitiesVSSSCapabilitiesRequirementsParserRuleCall_3_0() { return cCapabilitiesVSSSCapabilitiesRequirementsParserRuleCall_3_0; }
		
		//systemInterface=VSSSSystemInterfaceRequirements
		public Assignment getSystemInterfaceAssignment_4() { return cSystemInterfaceAssignment_4; }
		
		//VSSSSystemInterfaceRequirements
		public RuleCall getSystemInterfaceVSSSSystemInterfaceRequirementsParserRuleCall_4_0() { return cSystemInterfaceVSSSSystemInterfaceRequirementsParserRuleCall_4_0; }
		
		//adaptationMissionization=VSSSAdaptationMissionizationRequirements
		public Assignment getAdaptationMissionizationAssignment_5() { return cAdaptationMissionizationAssignment_5; }
		
		//VSSSAdaptationMissionizationRequirements
		public RuleCall getAdaptationMissionizationVSSSAdaptationMissionizationRequirementsParserRuleCall_5_0() { return cAdaptationMissionizationVSSSAdaptationMissionizationRequirementsParserRuleCall_5_0; }
		
		//computerResource=VSSSComputerResourceRequirements
		public Assignment getComputerResourceAssignment_6() { return cComputerResourceAssignment_6; }
		
		//VSSSComputerResourceRequirements
		public RuleCall getComputerResourceVSSSComputerResourceRequirementsParserRuleCall_6_0() { return cComputerResourceVSSSComputerResourceRequirementsParserRuleCall_6_0; }
		
		//security=VSSSSecurityRequirements
		public Assignment getSecurityAssignment_7() { return cSecurityAssignment_7; }
		
		//VSSSSecurityRequirements
		public RuleCall getSecurityVSSSSecurityRequirementsParserRuleCall_7_0() { return cSecurityVSSSSecurityRequirementsParserRuleCall_7_0; }
		
		//safety=VSSSSafetyRequirements
		public Assignment getSafetyAssignment_8() { return cSafetyAssignment_8; }
		
		//VSSSSafetyRequirements
		public RuleCall getSafetyVSSSSafetyRequirementsParserRuleCall_8_0() { return cSafetyVSSSSafetyRequirementsParserRuleCall_8_0; }
		
		//reliabilityAvailability=VSSSReliabilityAvailabilityRequirements
		public Assignment getReliabilityAvailabilityAssignment_9() { return cReliabilityAvailabilityAssignment_9; }
		
		//VSSSReliabilityAvailabilityRequirements
		public RuleCall getReliabilityAvailabilityVSSSReliabilityAvailabilityRequirementsParserRuleCall_9_0() { return cReliabilityAvailabilityVSSSReliabilityAvailabilityRequirementsParserRuleCall_9_0; }
		
		//quality=VSSSQualityRequirements
		public Assignment getQualityAssignment_10() { return cQualityAssignment_10; }
		
		//VSSSQualityRequirements
		public RuleCall getQualityVSSSQualityRequirementsParserRuleCall_10_0() { return cQualityVSSSQualityRequirementsParserRuleCall_10_0; }
		
		//design=VSSSDesignRequirements
		public Assignment getDesignAssignment_11() { return cDesignAssignment_11; }
		
		//VSSSDesignRequirements
		public RuleCall getDesignVSSSDesignRequirementsParserRuleCall_11_0() { return cDesignVSSSDesignRequirementsParserRuleCall_11_0; }
		
		//softwareOperations=VSSSSoftwareOperationsRequirements
		public Assignment getSoftwareOperationsAssignment_12() { return cSoftwareOperationsAssignment_12; }
		
		//VSSSSoftwareOperationsRequirements
		public RuleCall getSoftwareOperationsVSSSSoftwareOperationsRequirementsParserRuleCall_12_0() { return cSoftwareOperationsVSSSSoftwareOperationsRequirementsParserRuleCall_12_0; }
		
		//softwareMaintenance=VSSSSoftwareMaintenanceRequirements
		public Assignment getSoftwareMaintenanceAssignment_13() { return cSoftwareMaintenanceAssignment_13; }
		
		//VSSSSoftwareMaintenanceRequirements
		public RuleCall getSoftwareMaintenanceVSSSSoftwareMaintenanceRequirementsParserRuleCall_13_0() { return cSoftwareMaintenanceVSSSSoftwareMaintenanceRequirementsParserRuleCall_13_0; }
		
		//systemSoftwareObservability=VSSSSystemSoftwareObservabilityRequirements
		public Assignment getSystemSoftwareObservabilityAssignment_14() { return cSystemSoftwareObservabilityAssignment_14; }
		
		//VSSSSystemSoftwareObservabilityRequirements
		public RuleCall getSystemSoftwareObservabilityVSSSSystemSoftwareObservabilityRequirementsParserRuleCall_14_0() { return cSystemSoftwareObservabilityVSSSSystemSoftwareObservabilityRequirementsParserRuleCall_14_0; }
		
		//'</SpecificRequirements>'
		public Keyword getSpecificRequirementsKeyword_15() { return cSpecificRequirementsKeyword_15; }
	}
	public class VSSSVerificationValidationIntegrationRequirementsElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.micobs.svm.lang.sss.SSS.VSSSVerificationValidationIntegrationRequirements");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cVerificationValidationIntegrationRequirementsKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cSectionDescriptionAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cSectionDescriptionDBodyParserRuleCall_1_0 = (RuleCall)cSectionDescriptionAssignment_1.eContents().get(0);
		private final Assignment cVerificationValidationProcessAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cVerificationValidationProcessVSSSVerificationValidationProcessRequirementsParserRuleCall_2_0 = (RuleCall)cVerificationValidationProcessAssignment_2.eContents().get(0);
		private final Assignment cValidationApproachAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cValidationApproachVSSSValidationApproachParserRuleCall_3_0 = (RuleCall)cValidationApproachAssignment_3.eContents().get(0);
		private final Assignment cValidationAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cValidationVSSSValidationRequirementsParserRuleCall_4_0 = (RuleCall)cValidationAssignment_4.eContents().get(0);
		private final Assignment cVerificationAssignment_5 = (Assignment)cGroup.eContents().get(5);
		private final RuleCall cVerificationVSSSVerificationRequirementsParserRuleCall_5_0 = (RuleCall)cVerificationAssignment_5.eContents().get(0);
		private final Keyword cVerificationValidationIntegrationRequirementsKeyword_6 = (Keyword)cGroup.eContents().get(6);
		
		//VSSSVerificationValidationIntegrationRequirements:
		//	'<VerificationValidationIntegrationRequirements>'
		//	sectionDescription=DBody?
		//	verificationValidationProcess=VSSSVerificationValidationProcessRequirements
		//	validationApproach=VSSSValidationApproach
		//	validation=VSSSValidationRequirements
		//	verification=VSSSVerificationRequirements
		//	'</VerificationValidationIntegrationRequirements>';
		@Override public ParserRule getRule() { return rule; }
		
		//'<VerificationValidationIntegrationRequirements>' sectionDescription=DBody?
		//verificationValidationProcess=VSSSVerificationValidationProcessRequirements validationApproach=VSSSValidationApproach
		//validation=VSSSValidationRequirements verification=VSSSVerificationRequirements
		//'</VerificationValidationIntegrationRequirements>'
		public Group getGroup() { return cGroup; }
		
		//'<VerificationValidationIntegrationRequirements>'
		public Keyword getVerificationValidationIntegrationRequirementsKeyword_0() { return cVerificationValidationIntegrationRequirementsKeyword_0; }
		
		//sectionDescription=DBody?
		public Assignment getSectionDescriptionAssignment_1() { return cSectionDescriptionAssignment_1; }
		
		//DBody
		public RuleCall getSectionDescriptionDBodyParserRuleCall_1_0() { return cSectionDescriptionDBodyParserRuleCall_1_0; }
		
		//verificationValidationProcess=VSSSVerificationValidationProcessRequirements
		public Assignment getVerificationValidationProcessAssignment_2() { return cVerificationValidationProcessAssignment_2; }
		
		//VSSSVerificationValidationProcessRequirements
		public RuleCall getVerificationValidationProcessVSSSVerificationValidationProcessRequirementsParserRuleCall_2_0() { return cVerificationValidationProcessVSSSVerificationValidationProcessRequirementsParserRuleCall_2_0; }
		
		//validationApproach=VSSSValidationApproach
		public Assignment getValidationApproachAssignment_3() { return cValidationApproachAssignment_3; }
		
		//VSSSValidationApproach
		public RuleCall getValidationApproachVSSSValidationApproachParserRuleCall_3_0() { return cValidationApproachVSSSValidationApproachParserRuleCall_3_0; }
		
		//validation=VSSSValidationRequirements
		public Assignment getValidationAssignment_4() { return cValidationAssignment_4; }
		
		//VSSSValidationRequirements
		public RuleCall getValidationVSSSValidationRequirementsParserRuleCall_4_0() { return cValidationVSSSValidationRequirementsParserRuleCall_4_0; }
		
		//verification=VSSSVerificationRequirements
		public Assignment getVerificationAssignment_5() { return cVerificationAssignment_5; }
		
		//VSSSVerificationRequirements
		public RuleCall getVerificationVSSSVerificationRequirementsParserRuleCall_5_0() { return cVerificationVSSSVerificationRequirementsParserRuleCall_5_0; }
		
		//'</VerificationValidationIntegrationRequirements>'
		public Keyword getVerificationValidationIntegrationRequirementsKeyword_6() { return cVerificationValidationIntegrationRequirementsKeyword_6; }
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
	public class VSSSInstantiableRequirementSectionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.micobs.svm.lang.sss.SSS.VSSSInstantiableRequirementSection");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cSubsectionKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cNameKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cNameAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cNameSTRINGTerminalRuleCall_2_0 = (RuleCall)cNameAssignment_2.eContents().get(0);
		private final Keyword cGreaterThanSignKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Assignment cSectionDescriptionAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cSectionDescriptionDBodyParserRuleCall_4_0 = (RuleCall)cSectionDescriptionAssignment_4.eContents().get(0);
		private final Assignment cSssItemsAssignment_5 = (Assignment)cGroup.eContents().get(5);
		private final RuleCall cSssItemsVSSSDocumentItemParserRuleCall_5_0 = (RuleCall)cSssItemsAssignment_5.eContents().get(0);
		private final Keyword cSubsectionKeyword_6 = (Keyword)cGroup.eContents().get(6);
		
		//VSSSInstantiableRequirementSection:
		//	'<subsection'
		//	'name=' name=STRING
		//	'>'
		//	sectionDescription=DBody?
		//	sssItems+=VSSSDocumentItem*
		//	'</subsection>';
		@Override public ParserRule getRule() { return rule; }
		
		//'<subsection' 'name=' name=STRING '>' sectionDescription=DBody? sssItems+=VSSSDocumentItem* '</subsection>'
		public Group getGroup() { return cGroup; }
		
		//'<subsection'
		public Keyword getSubsectionKeyword_0() { return cSubsectionKeyword_0; }
		
		//'name='
		public Keyword getNameKeyword_1() { return cNameKeyword_1; }
		
		//name=STRING
		public Assignment getNameAssignment_2() { return cNameAssignment_2; }
		
		//STRING
		public RuleCall getNameSTRINGTerminalRuleCall_2_0() { return cNameSTRINGTerminalRuleCall_2_0; }
		
		//'>'
		public Keyword getGreaterThanSignKeyword_3() { return cGreaterThanSignKeyword_3; }
		
		//sectionDescription=DBody?
		public Assignment getSectionDescriptionAssignment_4() { return cSectionDescriptionAssignment_4; }
		
		//DBody
		public RuleCall getSectionDescriptionDBodyParserRuleCall_4_0() { return cSectionDescriptionDBodyParserRuleCall_4_0; }
		
		//sssItems+=VSSSDocumentItem*
		public Assignment getSssItemsAssignment_5() { return cSssItemsAssignment_5; }
		
		//VSSSDocumentItem
		public RuleCall getSssItemsVSSSDocumentItemParserRuleCall_5_0() { return cSssItemsVSSSDocumentItemParserRuleCall_5_0; }
		
		//'</subsection>'
		public Keyword getSubsectionKeyword_6() { return cSubsectionKeyword_6; }
	}
	public class VSSSGeneralRequirementsElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.micobs.svm.lang.sss.SSS.VSSSGeneralRequirements");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cVSSSGeneralRequirementsAction_0 = (Action)cGroup.eContents().get(0);
		private final Keyword cGeneralRequirementsKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cSectionDescriptionAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cSectionDescriptionDBodyParserRuleCall_2_0 = (RuleCall)cSectionDescriptionAssignment_2.eContents().get(0);
		private final Assignment cSssItemsAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cSssItemsVSSSDocumentItemParserRuleCall_3_0 = (RuleCall)cSssItemsAssignment_3.eContents().get(0);
		private final Assignment cSssRequirementSubsectionsAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cSssRequirementSubsectionsVSSSInstantiableRequirementSectionParserRuleCall_4_0 = (RuleCall)cSssRequirementSubsectionsAssignment_4.eContents().get(0);
		private final Keyword cGeneralRequirementsKeyword_5 = (Keyword)cGroup.eContents().get(5);
		
		//VSSSGeneralRequirements:
		//	{VSSSGeneralRequirements}
		//	'<GeneralRequirements>'
		//	sectionDescription=DBody?
		//	sssItems+=VSSSDocumentItem*
		//	sssRequirementSubsections+=VSSSInstantiableRequirementSection*
		//	'</GeneralRequirements>';
		@Override public ParserRule getRule() { return rule; }
		
		//{VSSSGeneralRequirements} '<GeneralRequirements>' sectionDescription=DBody? sssItems+=VSSSDocumentItem*
		//sssRequirementSubsections+=VSSSInstantiableRequirementSection* '</GeneralRequirements>'
		public Group getGroup() { return cGroup; }
		
		//{VSSSGeneralRequirements}
		public Action getVSSSGeneralRequirementsAction_0() { return cVSSSGeneralRequirementsAction_0; }
		
		//'<GeneralRequirements>'
		public Keyword getGeneralRequirementsKeyword_1() { return cGeneralRequirementsKeyword_1; }
		
		//sectionDescription=DBody?
		public Assignment getSectionDescriptionAssignment_2() { return cSectionDescriptionAssignment_2; }
		
		//DBody
		public RuleCall getSectionDescriptionDBodyParserRuleCall_2_0() { return cSectionDescriptionDBodyParserRuleCall_2_0; }
		
		//sssItems+=VSSSDocumentItem*
		public Assignment getSssItemsAssignment_3() { return cSssItemsAssignment_3; }
		
		//VSSSDocumentItem
		public RuleCall getSssItemsVSSSDocumentItemParserRuleCall_3_0() { return cSssItemsVSSSDocumentItemParserRuleCall_3_0; }
		
		//sssRequirementSubsections+=VSSSInstantiableRequirementSection*
		public Assignment getSssRequirementSubsectionsAssignment_4() { return cSssRequirementSubsectionsAssignment_4; }
		
		//VSSSInstantiableRequirementSection
		public RuleCall getSssRequirementSubsectionsVSSSInstantiableRequirementSectionParserRuleCall_4_0() { return cSssRequirementSubsectionsVSSSInstantiableRequirementSectionParserRuleCall_4_0; }
		
		//'</GeneralRequirements>'
		public Keyword getGeneralRequirementsKeyword_5() { return cGeneralRequirementsKeyword_5; }
	}
	public class VSSSCapabilitiesRequirementsElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.micobs.svm.lang.sss.SSS.VSSSCapabilitiesRequirements");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cVSSSCapabilitiesRequirementsAction_0 = (Action)cGroup.eContents().get(0);
		private final Keyword cCapabilitiesRequirementsKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cSectionDescriptionAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cSectionDescriptionDBodyParserRuleCall_2_0 = (RuleCall)cSectionDescriptionAssignment_2.eContents().get(0);
		private final Assignment cSssItemsAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cSssItemsVSSSDocumentItemParserRuleCall_3_0 = (RuleCall)cSssItemsAssignment_3.eContents().get(0);
		private final Assignment cSssRequirementSubsectionsAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cSssRequirementSubsectionsVSSSInstantiableRequirementSectionParserRuleCall_4_0 = (RuleCall)cSssRequirementSubsectionsAssignment_4.eContents().get(0);
		private final Keyword cCapabilitiesRequirementsKeyword_5 = (Keyword)cGroup.eContents().get(5);
		
		//VSSSCapabilitiesRequirements:
		//	{VSSSCapabilitiesRequirements}
		//	'<CapabilitiesRequirements>'
		//	sectionDescription=DBody?
		//	sssItems+=VSSSDocumentItem*
		//	sssRequirementSubsections+=VSSSInstantiableRequirementSection*
		//	'</CapabilitiesRequirements>';
		@Override public ParserRule getRule() { return rule; }
		
		//{VSSSCapabilitiesRequirements} '<CapabilitiesRequirements>' sectionDescription=DBody? sssItems+=VSSSDocumentItem*
		//sssRequirementSubsections+=VSSSInstantiableRequirementSection* '</CapabilitiesRequirements>'
		public Group getGroup() { return cGroup; }
		
		//{VSSSCapabilitiesRequirements}
		public Action getVSSSCapabilitiesRequirementsAction_0() { return cVSSSCapabilitiesRequirementsAction_0; }
		
		//'<CapabilitiesRequirements>'
		public Keyword getCapabilitiesRequirementsKeyword_1() { return cCapabilitiesRequirementsKeyword_1; }
		
		//sectionDescription=DBody?
		public Assignment getSectionDescriptionAssignment_2() { return cSectionDescriptionAssignment_2; }
		
		//DBody
		public RuleCall getSectionDescriptionDBodyParserRuleCall_2_0() { return cSectionDescriptionDBodyParserRuleCall_2_0; }
		
		//sssItems+=VSSSDocumentItem*
		public Assignment getSssItemsAssignment_3() { return cSssItemsAssignment_3; }
		
		//VSSSDocumentItem
		public RuleCall getSssItemsVSSSDocumentItemParserRuleCall_3_0() { return cSssItemsVSSSDocumentItemParserRuleCall_3_0; }
		
		//sssRequirementSubsections+=VSSSInstantiableRequirementSection*
		public Assignment getSssRequirementSubsectionsAssignment_4() { return cSssRequirementSubsectionsAssignment_4; }
		
		//VSSSInstantiableRequirementSection
		public RuleCall getSssRequirementSubsectionsVSSSInstantiableRequirementSectionParserRuleCall_4_0() { return cSssRequirementSubsectionsVSSSInstantiableRequirementSectionParserRuleCall_4_0; }
		
		//'</CapabilitiesRequirements>'
		public Keyword getCapabilitiesRequirementsKeyword_5() { return cCapabilitiesRequirementsKeyword_5; }
	}
	public class VSSSSystemInterfaceRequirementsElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.micobs.svm.lang.sss.SSS.VSSSSystemInterfaceRequirements");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cVSSSSystemInterfaceRequirementsAction_0 = (Action)cGroup.eContents().get(0);
		private final Keyword cSystemInterfaceRequirementsKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cSectionDescriptionAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cSectionDescriptionDBodyParserRuleCall_2_0 = (RuleCall)cSectionDescriptionAssignment_2.eContents().get(0);
		private final Assignment cSssItemsAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cSssItemsVSSSDocumentItemParserRuleCall_3_0 = (RuleCall)cSssItemsAssignment_3.eContents().get(0);
		private final Assignment cSssRequirementSubsectionsAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cSssRequirementSubsectionsVSSSInstantiableRequirementSectionParserRuleCall_4_0 = (RuleCall)cSssRequirementSubsectionsAssignment_4.eContents().get(0);
		private final Keyword cSystemInterfaceRequirementsKeyword_5 = (Keyword)cGroup.eContents().get(5);
		
		//VSSSSystemInterfaceRequirements:
		//	{VSSSSystemInterfaceRequirements}
		//	'<SystemInterfaceRequirements>'
		//	sectionDescription=DBody?
		//	sssItems+=VSSSDocumentItem*
		//	sssRequirementSubsections+=VSSSInstantiableRequirementSection*
		//	'</SystemInterfaceRequirements>';
		@Override public ParserRule getRule() { return rule; }
		
		//{VSSSSystemInterfaceRequirements} '<SystemInterfaceRequirements>' sectionDescription=DBody? sssItems+=VSSSDocumentItem*
		//sssRequirementSubsections+=VSSSInstantiableRequirementSection* '</SystemInterfaceRequirements>'
		public Group getGroup() { return cGroup; }
		
		//{VSSSSystemInterfaceRequirements}
		public Action getVSSSSystemInterfaceRequirementsAction_0() { return cVSSSSystemInterfaceRequirementsAction_0; }
		
		//'<SystemInterfaceRequirements>'
		public Keyword getSystemInterfaceRequirementsKeyword_1() { return cSystemInterfaceRequirementsKeyword_1; }
		
		//sectionDescription=DBody?
		public Assignment getSectionDescriptionAssignment_2() { return cSectionDescriptionAssignment_2; }
		
		//DBody
		public RuleCall getSectionDescriptionDBodyParserRuleCall_2_0() { return cSectionDescriptionDBodyParserRuleCall_2_0; }
		
		//sssItems+=VSSSDocumentItem*
		public Assignment getSssItemsAssignment_3() { return cSssItemsAssignment_3; }
		
		//VSSSDocumentItem
		public RuleCall getSssItemsVSSSDocumentItemParserRuleCall_3_0() { return cSssItemsVSSSDocumentItemParserRuleCall_3_0; }
		
		//sssRequirementSubsections+=VSSSInstantiableRequirementSection*
		public Assignment getSssRequirementSubsectionsAssignment_4() { return cSssRequirementSubsectionsAssignment_4; }
		
		//VSSSInstantiableRequirementSection
		public RuleCall getSssRequirementSubsectionsVSSSInstantiableRequirementSectionParserRuleCall_4_0() { return cSssRequirementSubsectionsVSSSInstantiableRequirementSectionParserRuleCall_4_0; }
		
		//'</SystemInterfaceRequirements>'
		public Keyword getSystemInterfaceRequirementsKeyword_5() { return cSystemInterfaceRequirementsKeyword_5; }
	}
	public class VSSSAdaptationMissionizationRequirementsElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.micobs.svm.lang.sss.SSS.VSSSAdaptationMissionizationRequirements");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cVSSSAdaptationMissionizationRequirementsAction_0 = (Action)cGroup.eContents().get(0);
		private final Keyword cAdaptationMissionizationRequirementsKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cSectionDescriptionAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cSectionDescriptionDBodyParserRuleCall_2_0 = (RuleCall)cSectionDescriptionAssignment_2.eContents().get(0);
		private final Assignment cSssItemsAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cSssItemsVSSSDocumentItemParserRuleCall_3_0 = (RuleCall)cSssItemsAssignment_3.eContents().get(0);
		private final Assignment cSssRequirementSubsectionsAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cSssRequirementSubsectionsVSSSInstantiableRequirementSectionParserRuleCall_4_0 = (RuleCall)cSssRequirementSubsectionsAssignment_4.eContents().get(0);
		private final Keyword cAdaptationMissionizationRequirementsKeyword_5 = (Keyword)cGroup.eContents().get(5);
		
		//VSSSAdaptationMissionizationRequirements:
		//	{VSSSAdaptationMissionizationRequirements}
		//	'<AdaptationMissionizationRequirements>'
		//	sectionDescription=DBody?
		//	sssItems+=VSSSDocumentItem*
		//	sssRequirementSubsections+=VSSSInstantiableRequirementSection*
		//	'</AdaptationMissionizationRequirements>';
		@Override public ParserRule getRule() { return rule; }
		
		//{VSSSAdaptationMissionizationRequirements} '<AdaptationMissionizationRequirements>' sectionDescription=DBody?
		//sssItems+=VSSSDocumentItem* sssRequirementSubsections+=VSSSInstantiableRequirementSection*
		//'</AdaptationMissionizationRequirements>'
		public Group getGroup() { return cGroup; }
		
		//{VSSSAdaptationMissionizationRequirements}
		public Action getVSSSAdaptationMissionizationRequirementsAction_0() { return cVSSSAdaptationMissionizationRequirementsAction_0; }
		
		//'<AdaptationMissionizationRequirements>'
		public Keyword getAdaptationMissionizationRequirementsKeyword_1() { return cAdaptationMissionizationRequirementsKeyword_1; }
		
		//sectionDescription=DBody?
		public Assignment getSectionDescriptionAssignment_2() { return cSectionDescriptionAssignment_2; }
		
		//DBody
		public RuleCall getSectionDescriptionDBodyParserRuleCall_2_0() { return cSectionDescriptionDBodyParserRuleCall_2_0; }
		
		//sssItems+=VSSSDocumentItem*
		public Assignment getSssItemsAssignment_3() { return cSssItemsAssignment_3; }
		
		//VSSSDocumentItem
		public RuleCall getSssItemsVSSSDocumentItemParserRuleCall_3_0() { return cSssItemsVSSSDocumentItemParserRuleCall_3_0; }
		
		//sssRequirementSubsections+=VSSSInstantiableRequirementSection*
		public Assignment getSssRequirementSubsectionsAssignment_4() { return cSssRequirementSubsectionsAssignment_4; }
		
		//VSSSInstantiableRequirementSection
		public RuleCall getSssRequirementSubsectionsVSSSInstantiableRequirementSectionParserRuleCall_4_0() { return cSssRequirementSubsectionsVSSSInstantiableRequirementSectionParserRuleCall_4_0; }
		
		//'</AdaptationMissionizationRequirements>'
		public Keyword getAdaptationMissionizationRequirementsKeyword_5() { return cAdaptationMissionizationRequirementsKeyword_5; }
	}
	public class VSSSComputerResourceRequirementsElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.micobs.svm.lang.sss.SSS.VSSSComputerResourceRequirements");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cVSSSComputerResourceRequirementsAction_0 = (Action)cGroup.eContents().get(0);
		private final Keyword cComputerResourceRequirementsKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cSectionDescriptionAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cSectionDescriptionDBodyParserRuleCall_2_0 = (RuleCall)cSectionDescriptionAssignment_2.eContents().get(0);
		private final Assignment cSssItemsAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cSssItemsVSSSDocumentItemParserRuleCall_3_0 = (RuleCall)cSssItemsAssignment_3.eContents().get(0);
		private final Assignment cSssRequirementSubsectionsAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cSssRequirementSubsectionsVSSSInstantiableRequirementSectionParserRuleCall_4_0 = (RuleCall)cSssRequirementSubsectionsAssignment_4.eContents().get(0);
		private final Keyword cComputerResourceRequirementsKeyword_5 = (Keyword)cGroup.eContents().get(5);
		
		//VSSSComputerResourceRequirements:
		//	{VSSSComputerResourceRequirements}
		//	'<ComputerResourceRequirements>'
		//	sectionDescription=DBody?
		//	sssItems+=VSSSDocumentItem*
		//	sssRequirementSubsections+=VSSSInstantiableRequirementSection*
		//	'</ComputerResourceRequirements>';
		@Override public ParserRule getRule() { return rule; }
		
		//{VSSSComputerResourceRequirements} '<ComputerResourceRequirements>' sectionDescription=DBody?
		//sssItems+=VSSSDocumentItem* sssRequirementSubsections+=VSSSInstantiableRequirementSection*
		//'</ComputerResourceRequirements>'
		public Group getGroup() { return cGroup; }
		
		//{VSSSComputerResourceRequirements}
		public Action getVSSSComputerResourceRequirementsAction_0() { return cVSSSComputerResourceRequirementsAction_0; }
		
		//'<ComputerResourceRequirements>'
		public Keyword getComputerResourceRequirementsKeyword_1() { return cComputerResourceRequirementsKeyword_1; }
		
		//sectionDescription=DBody?
		public Assignment getSectionDescriptionAssignment_2() { return cSectionDescriptionAssignment_2; }
		
		//DBody
		public RuleCall getSectionDescriptionDBodyParserRuleCall_2_0() { return cSectionDescriptionDBodyParserRuleCall_2_0; }
		
		//sssItems+=VSSSDocumentItem*
		public Assignment getSssItemsAssignment_3() { return cSssItemsAssignment_3; }
		
		//VSSSDocumentItem
		public RuleCall getSssItemsVSSSDocumentItemParserRuleCall_3_0() { return cSssItemsVSSSDocumentItemParserRuleCall_3_0; }
		
		//sssRequirementSubsections+=VSSSInstantiableRequirementSection*
		public Assignment getSssRequirementSubsectionsAssignment_4() { return cSssRequirementSubsectionsAssignment_4; }
		
		//VSSSInstantiableRequirementSection
		public RuleCall getSssRequirementSubsectionsVSSSInstantiableRequirementSectionParserRuleCall_4_0() { return cSssRequirementSubsectionsVSSSInstantiableRequirementSectionParserRuleCall_4_0; }
		
		//'</ComputerResourceRequirements>'
		public Keyword getComputerResourceRequirementsKeyword_5() { return cComputerResourceRequirementsKeyword_5; }
	}
	public class VSSSSecurityRequirementsElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.micobs.svm.lang.sss.SSS.VSSSSecurityRequirements");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cVSSSSecurityRequirementsAction_0 = (Action)cGroup.eContents().get(0);
		private final Keyword cSecurityRequirementsKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cSectionDescriptionAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cSectionDescriptionDBodyParserRuleCall_2_0 = (RuleCall)cSectionDescriptionAssignment_2.eContents().get(0);
		private final Assignment cSssItemsAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cSssItemsVSSSDocumentItemParserRuleCall_3_0 = (RuleCall)cSssItemsAssignment_3.eContents().get(0);
		private final Assignment cSssRequirementSubsectionsAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cSssRequirementSubsectionsVSSSInstantiableRequirementSectionParserRuleCall_4_0 = (RuleCall)cSssRequirementSubsectionsAssignment_4.eContents().get(0);
		private final Keyword cSecurityRequirementsKeyword_5 = (Keyword)cGroup.eContents().get(5);
		
		//VSSSSecurityRequirements:
		//	{VSSSSecurityRequirements}
		//	'<SecurityRequirements>'
		//	sectionDescription=DBody?
		//	sssItems+=VSSSDocumentItem*
		//	sssRequirementSubsections+=VSSSInstantiableRequirementSection*
		//	'</SecurityRequirements>';
		@Override public ParserRule getRule() { return rule; }
		
		//{VSSSSecurityRequirements} '<SecurityRequirements>' sectionDescription=DBody? sssItems+=VSSSDocumentItem*
		//sssRequirementSubsections+=VSSSInstantiableRequirementSection* '</SecurityRequirements>'
		public Group getGroup() { return cGroup; }
		
		//{VSSSSecurityRequirements}
		public Action getVSSSSecurityRequirementsAction_0() { return cVSSSSecurityRequirementsAction_0; }
		
		//'<SecurityRequirements>'
		public Keyword getSecurityRequirementsKeyword_1() { return cSecurityRequirementsKeyword_1; }
		
		//sectionDescription=DBody?
		public Assignment getSectionDescriptionAssignment_2() { return cSectionDescriptionAssignment_2; }
		
		//DBody
		public RuleCall getSectionDescriptionDBodyParserRuleCall_2_0() { return cSectionDescriptionDBodyParserRuleCall_2_0; }
		
		//sssItems+=VSSSDocumentItem*
		public Assignment getSssItemsAssignment_3() { return cSssItemsAssignment_3; }
		
		//VSSSDocumentItem
		public RuleCall getSssItemsVSSSDocumentItemParserRuleCall_3_0() { return cSssItemsVSSSDocumentItemParserRuleCall_3_0; }
		
		//sssRequirementSubsections+=VSSSInstantiableRequirementSection*
		public Assignment getSssRequirementSubsectionsAssignment_4() { return cSssRequirementSubsectionsAssignment_4; }
		
		//VSSSInstantiableRequirementSection
		public RuleCall getSssRequirementSubsectionsVSSSInstantiableRequirementSectionParserRuleCall_4_0() { return cSssRequirementSubsectionsVSSSInstantiableRequirementSectionParserRuleCall_4_0; }
		
		//'</SecurityRequirements>'
		public Keyword getSecurityRequirementsKeyword_5() { return cSecurityRequirementsKeyword_5; }
	}
	public class VSSSSafetyRequirementsElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.micobs.svm.lang.sss.SSS.VSSSSafetyRequirements");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cVSSSSafetyRequirementsAction_0 = (Action)cGroup.eContents().get(0);
		private final Keyword cSafetyRequirementsKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cSectionDescriptionAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cSectionDescriptionDBodyParserRuleCall_2_0 = (RuleCall)cSectionDescriptionAssignment_2.eContents().get(0);
		private final Assignment cSssItemsAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cSssItemsVSSSDocumentItemParserRuleCall_3_0 = (RuleCall)cSssItemsAssignment_3.eContents().get(0);
		private final Assignment cSssRequirementSubsectionsAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cSssRequirementSubsectionsVSSSInstantiableRequirementSectionParserRuleCall_4_0 = (RuleCall)cSssRequirementSubsectionsAssignment_4.eContents().get(0);
		private final Keyword cSafetyRequirementsKeyword_5 = (Keyword)cGroup.eContents().get(5);
		
		//VSSSSafetyRequirements:
		//	{VSSSSafetyRequirements}
		//	'<SafetyRequirements>'
		//	sectionDescription=DBody?
		//	sssItems+=VSSSDocumentItem*
		//	sssRequirementSubsections+=VSSSInstantiableRequirementSection*
		//	'</SafetyRequirements>';
		@Override public ParserRule getRule() { return rule; }
		
		//{VSSSSafetyRequirements} '<SafetyRequirements>' sectionDescription=DBody? sssItems+=VSSSDocumentItem*
		//sssRequirementSubsections+=VSSSInstantiableRequirementSection* '</SafetyRequirements>'
		public Group getGroup() { return cGroup; }
		
		//{VSSSSafetyRequirements}
		public Action getVSSSSafetyRequirementsAction_0() { return cVSSSSafetyRequirementsAction_0; }
		
		//'<SafetyRequirements>'
		public Keyword getSafetyRequirementsKeyword_1() { return cSafetyRequirementsKeyword_1; }
		
		//sectionDescription=DBody?
		public Assignment getSectionDescriptionAssignment_2() { return cSectionDescriptionAssignment_2; }
		
		//DBody
		public RuleCall getSectionDescriptionDBodyParserRuleCall_2_0() { return cSectionDescriptionDBodyParserRuleCall_2_0; }
		
		//sssItems+=VSSSDocumentItem*
		public Assignment getSssItemsAssignment_3() { return cSssItemsAssignment_3; }
		
		//VSSSDocumentItem
		public RuleCall getSssItemsVSSSDocumentItemParserRuleCall_3_0() { return cSssItemsVSSSDocumentItemParserRuleCall_3_0; }
		
		//sssRequirementSubsections+=VSSSInstantiableRequirementSection*
		public Assignment getSssRequirementSubsectionsAssignment_4() { return cSssRequirementSubsectionsAssignment_4; }
		
		//VSSSInstantiableRequirementSection
		public RuleCall getSssRequirementSubsectionsVSSSInstantiableRequirementSectionParserRuleCall_4_0() { return cSssRequirementSubsectionsVSSSInstantiableRequirementSectionParserRuleCall_4_0; }
		
		//'</SafetyRequirements>'
		public Keyword getSafetyRequirementsKeyword_5() { return cSafetyRequirementsKeyword_5; }
	}
	public class VSSSReliabilityAvailabilityRequirementsElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.micobs.svm.lang.sss.SSS.VSSSReliabilityAvailabilityRequirements");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cVSSSReliabilityAvailabilityRequirementsAction_0 = (Action)cGroup.eContents().get(0);
		private final Keyword cReliabilityAvailabilityRequirementsKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cSssItemsAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cSssItemsVSSSDocumentItemParserRuleCall_2_0 = (RuleCall)cSssItemsAssignment_2.eContents().get(0);
		private final Assignment cSectionDescriptionAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cSectionDescriptionDBodyParserRuleCall_3_0 = (RuleCall)cSectionDescriptionAssignment_3.eContents().get(0);
		private final Assignment cSssRequirementSubsectionsAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cSssRequirementSubsectionsVSSSInstantiableRequirementSectionParserRuleCall_4_0 = (RuleCall)cSssRequirementSubsectionsAssignment_4.eContents().get(0);
		private final Keyword cReliabilityAvailabilityRequirementsKeyword_5 = (Keyword)cGroup.eContents().get(5);
		
		//VSSSReliabilityAvailabilityRequirements:
		//	{VSSSReliabilityAvailabilityRequirements}
		//	'<ReliabilityAvailabilityRequirements>'
		//	sssItems+=VSSSDocumentItem*
		//	sectionDescription=DBody?
		//	sssRequirementSubsections+=VSSSInstantiableRequirementSection*
		//	'</ReliabilityAvailabilityRequirements>';
		@Override public ParserRule getRule() { return rule; }
		
		//{VSSSReliabilityAvailabilityRequirements} '<ReliabilityAvailabilityRequirements>' sssItems+=VSSSDocumentItem*
		//sectionDescription=DBody? sssRequirementSubsections+=VSSSInstantiableRequirementSection*
		//'</ReliabilityAvailabilityRequirements>'
		public Group getGroup() { return cGroup; }
		
		//{VSSSReliabilityAvailabilityRequirements}
		public Action getVSSSReliabilityAvailabilityRequirementsAction_0() { return cVSSSReliabilityAvailabilityRequirementsAction_0; }
		
		//'<ReliabilityAvailabilityRequirements>'
		public Keyword getReliabilityAvailabilityRequirementsKeyword_1() { return cReliabilityAvailabilityRequirementsKeyword_1; }
		
		//sssItems+=VSSSDocumentItem*
		public Assignment getSssItemsAssignment_2() { return cSssItemsAssignment_2; }
		
		//VSSSDocumentItem
		public RuleCall getSssItemsVSSSDocumentItemParserRuleCall_2_0() { return cSssItemsVSSSDocumentItemParserRuleCall_2_0; }
		
		//sectionDescription=DBody?
		public Assignment getSectionDescriptionAssignment_3() { return cSectionDescriptionAssignment_3; }
		
		//DBody
		public RuleCall getSectionDescriptionDBodyParserRuleCall_3_0() { return cSectionDescriptionDBodyParserRuleCall_3_0; }
		
		//sssRequirementSubsections+=VSSSInstantiableRequirementSection*
		public Assignment getSssRequirementSubsectionsAssignment_4() { return cSssRequirementSubsectionsAssignment_4; }
		
		//VSSSInstantiableRequirementSection
		public RuleCall getSssRequirementSubsectionsVSSSInstantiableRequirementSectionParserRuleCall_4_0() { return cSssRequirementSubsectionsVSSSInstantiableRequirementSectionParserRuleCall_4_0; }
		
		//'</ReliabilityAvailabilityRequirements>'
		public Keyword getReliabilityAvailabilityRequirementsKeyword_5() { return cReliabilityAvailabilityRequirementsKeyword_5; }
	}
	public class VSSSQualityRequirementsElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.micobs.svm.lang.sss.SSS.VSSSQualityRequirements");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cVSSSQualityRequirementsAction_0 = (Action)cGroup.eContents().get(0);
		private final Keyword cQualityRequirementsKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cSectionDescriptionAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cSectionDescriptionDBodyParserRuleCall_2_0 = (RuleCall)cSectionDescriptionAssignment_2.eContents().get(0);
		private final Assignment cSssItemsAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cSssItemsVSSSDocumentItemParserRuleCall_3_0 = (RuleCall)cSssItemsAssignment_3.eContents().get(0);
		private final Assignment cSssRequirementSubsectionsAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cSssRequirementSubsectionsVSSSInstantiableRequirementSectionParserRuleCall_4_0 = (RuleCall)cSssRequirementSubsectionsAssignment_4.eContents().get(0);
		private final Keyword cQualityRequirementsKeyword_5 = (Keyword)cGroup.eContents().get(5);
		
		//VSSSQualityRequirements:
		//	{VSSSQualityRequirements}
		//	'<QualityRequirements>'
		//	sectionDescription=DBody?
		//	sssItems+=VSSSDocumentItem*
		//	sssRequirementSubsections+=VSSSInstantiableRequirementSection*
		//	'</QualityRequirements>';
		@Override public ParserRule getRule() { return rule; }
		
		//{VSSSQualityRequirements} '<QualityRequirements>' sectionDescription=DBody? sssItems+=VSSSDocumentItem*
		//sssRequirementSubsections+=VSSSInstantiableRequirementSection* '</QualityRequirements>'
		public Group getGroup() { return cGroup; }
		
		//{VSSSQualityRequirements}
		public Action getVSSSQualityRequirementsAction_0() { return cVSSSQualityRequirementsAction_0; }
		
		//'<QualityRequirements>'
		public Keyword getQualityRequirementsKeyword_1() { return cQualityRequirementsKeyword_1; }
		
		//sectionDescription=DBody?
		public Assignment getSectionDescriptionAssignment_2() { return cSectionDescriptionAssignment_2; }
		
		//DBody
		public RuleCall getSectionDescriptionDBodyParserRuleCall_2_0() { return cSectionDescriptionDBodyParserRuleCall_2_0; }
		
		//sssItems+=VSSSDocumentItem*
		public Assignment getSssItemsAssignment_3() { return cSssItemsAssignment_3; }
		
		//VSSSDocumentItem
		public RuleCall getSssItemsVSSSDocumentItemParserRuleCall_3_0() { return cSssItemsVSSSDocumentItemParserRuleCall_3_0; }
		
		//sssRequirementSubsections+=VSSSInstantiableRequirementSection*
		public Assignment getSssRequirementSubsectionsAssignment_4() { return cSssRequirementSubsectionsAssignment_4; }
		
		//VSSSInstantiableRequirementSection
		public RuleCall getSssRequirementSubsectionsVSSSInstantiableRequirementSectionParserRuleCall_4_0() { return cSssRequirementSubsectionsVSSSInstantiableRequirementSectionParserRuleCall_4_0; }
		
		//'</QualityRequirements>'
		public Keyword getQualityRequirementsKeyword_5() { return cQualityRequirementsKeyword_5; }
	}
	public class VSSSDesignRequirementsElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.micobs.svm.lang.sss.SSS.VSSSDesignRequirements");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cVSSSDesignRequirementsAction_0 = (Action)cGroup.eContents().get(0);
		private final Keyword cDesignRequirementsKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cSectionDescriptionAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cSectionDescriptionDBodyParserRuleCall_2_0 = (RuleCall)cSectionDescriptionAssignment_2.eContents().get(0);
		private final Assignment cSssItemsAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cSssItemsVSSSDocumentItemParserRuleCall_3_0 = (RuleCall)cSssItemsAssignment_3.eContents().get(0);
		private final Assignment cSssRequirementSubsectionsAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cSssRequirementSubsectionsVSSSInstantiableRequirementSectionParserRuleCall_4_0 = (RuleCall)cSssRequirementSubsectionsAssignment_4.eContents().get(0);
		private final Keyword cDesignRequirementsKeyword_5 = (Keyword)cGroup.eContents().get(5);
		
		//VSSSDesignRequirements:
		//	{VSSSDesignRequirements}
		//	'<DesignRequirements>'
		//	sectionDescription=DBody?
		//	sssItems+=VSSSDocumentItem*
		//	sssRequirementSubsections+=VSSSInstantiableRequirementSection*
		//	'</DesignRequirements>';
		@Override public ParserRule getRule() { return rule; }
		
		//{VSSSDesignRequirements} '<DesignRequirements>' sectionDescription=DBody? sssItems+=VSSSDocumentItem*
		//sssRequirementSubsections+=VSSSInstantiableRequirementSection* '</DesignRequirements>'
		public Group getGroup() { return cGroup; }
		
		//{VSSSDesignRequirements}
		public Action getVSSSDesignRequirementsAction_0() { return cVSSSDesignRequirementsAction_0; }
		
		//'<DesignRequirements>'
		public Keyword getDesignRequirementsKeyword_1() { return cDesignRequirementsKeyword_1; }
		
		//sectionDescription=DBody?
		public Assignment getSectionDescriptionAssignment_2() { return cSectionDescriptionAssignment_2; }
		
		//DBody
		public RuleCall getSectionDescriptionDBodyParserRuleCall_2_0() { return cSectionDescriptionDBodyParserRuleCall_2_0; }
		
		//sssItems+=VSSSDocumentItem*
		public Assignment getSssItemsAssignment_3() { return cSssItemsAssignment_3; }
		
		//VSSSDocumentItem
		public RuleCall getSssItemsVSSSDocumentItemParserRuleCall_3_0() { return cSssItemsVSSSDocumentItemParserRuleCall_3_0; }
		
		//sssRequirementSubsections+=VSSSInstantiableRequirementSection*
		public Assignment getSssRequirementSubsectionsAssignment_4() { return cSssRequirementSubsectionsAssignment_4; }
		
		//VSSSInstantiableRequirementSection
		public RuleCall getSssRequirementSubsectionsVSSSInstantiableRequirementSectionParserRuleCall_4_0() { return cSssRequirementSubsectionsVSSSInstantiableRequirementSectionParserRuleCall_4_0; }
		
		//'</DesignRequirements>'
		public Keyword getDesignRequirementsKeyword_5() { return cDesignRequirementsKeyword_5; }
	}
	public class VSSSSoftwareOperationsRequirementsElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.micobs.svm.lang.sss.SSS.VSSSSoftwareOperationsRequirements");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cVSSSSoftwareOperationsRequirementsAction_0 = (Action)cGroup.eContents().get(0);
		private final Keyword cSoftwareOperationsRequirementsKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cSectionDescriptionAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cSectionDescriptionDBodyParserRuleCall_2_0 = (RuleCall)cSectionDescriptionAssignment_2.eContents().get(0);
		private final Assignment cSssItemsAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cSssItemsVSSSDocumentItemParserRuleCall_3_0 = (RuleCall)cSssItemsAssignment_3.eContents().get(0);
		private final Assignment cSssRequirementSubsectionsAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cSssRequirementSubsectionsVSSSInstantiableRequirementSectionParserRuleCall_4_0 = (RuleCall)cSssRequirementSubsectionsAssignment_4.eContents().get(0);
		private final Keyword cSoftwareOperationsRequirementsKeyword_5 = (Keyword)cGroup.eContents().get(5);
		
		//VSSSSoftwareOperationsRequirements:
		//	{VSSSSoftwareOperationsRequirements}
		//	'<SoftwareOperationsRequirements>'
		//	sectionDescription=DBody?
		//	sssItems+=VSSSDocumentItem*
		//	sssRequirementSubsections+=VSSSInstantiableRequirementSection*
		//	'</SoftwareOperationsRequirements>';
		@Override public ParserRule getRule() { return rule; }
		
		//{VSSSSoftwareOperationsRequirements} '<SoftwareOperationsRequirements>' sectionDescription=DBody?
		//sssItems+=VSSSDocumentItem* sssRequirementSubsections+=VSSSInstantiableRequirementSection*
		//'</SoftwareOperationsRequirements>'
		public Group getGroup() { return cGroup; }
		
		//{VSSSSoftwareOperationsRequirements}
		public Action getVSSSSoftwareOperationsRequirementsAction_0() { return cVSSSSoftwareOperationsRequirementsAction_0; }
		
		//'<SoftwareOperationsRequirements>'
		public Keyword getSoftwareOperationsRequirementsKeyword_1() { return cSoftwareOperationsRequirementsKeyword_1; }
		
		//sectionDescription=DBody?
		public Assignment getSectionDescriptionAssignment_2() { return cSectionDescriptionAssignment_2; }
		
		//DBody
		public RuleCall getSectionDescriptionDBodyParserRuleCall_2_0() { return cSectionDescriptionDBodyParserRuleCall_2_0; }
		
		//sssItems+=VSSSDocumentItem*
		public Assignment getSssItemsAssignment_3() { return cSssItemsAssignment_3; }
		
		//VSSSDocumentItem
		public RuleCall getSssItemsVSSSDocumentItemParserRuleCall_3_0() { return cSssItemsVSSSDocumentItemParserRuleCall_3_0; }
		
		//sssRequirementSubsections+=VSSSInstantiableRequirementSection*
		public Assignment getSssRequirementSubsectionsAssignment_4() { return cSssRequirementSubsectionsAssignment_4; }
		
		//VSSSInstantiableRequirementSection
		public RuleCall getSssRequirementSubsectionsVSSSInstantiableRequirementSectionParserRuleCall_4_0() { return cSssRequirementSubsectionsVSSSInstantiableRequirementSectionParserRuleCall_4_0; }
		
		//'</SoftwareOperationsRequirements>'
		public Keyword getSoftwareOperationsRequirementsKeyword_5() { return cSoftwareOperationsRequirementsKeyword_5; }
	}
	public class VSSSSoftwareMaintenanceRequirementsElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.micobs.svm.lang.sss.SSS.VSSSSoftwareMaintenanceRequirements");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cVSSSSoftwareMaintenanceRequirementsAction_0 = (Action)cGroup.eContents().get(0);
		private final Keyword cSoftwareMaintenanceRequirementsKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cSectionDescriptionAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cSectionDescriptionDBodyParserRuleCall_2_0 = (RuleCall)cSectionDescriptionAssignment_2.eContents().get(0);
		private final Assignment cSssItemsAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cSssItemsVSSSDocumentItemParserRuleCall_3_0 = (RuleCall)cSssItemsAssignment_3.eContents().get(0);
		private final Assignment cSssRequirementSubsectionsAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cSssRequirementSubsectionsVSSSInstantiableRequirementSectionParserRuleCall_4_0 = (RuleCall)cSssRequirementSubsectionsAssignment_4.eContents().get(0);
		private final Keyword cSoftwareMaintenanceRequirementsKeyword_5 = (Keyword)cGroup.eContents().get(5);
		
		//VSSSSoftwareMaintenanceRequirements:
		//	{VSSSSoftwareMaintenanceRequirements}
		//	'<SoftwareMaintenanceRequirements>'
		//	sectionDescription=DBody?
		//	sssItems+=VSSSDocumentItem*
		//	sssRequirementSubsections+=VSSSInstantiableRequirementSection*
		//	'</SoftwareMaintenanceRequirements>';
		@Override public ParserRule getRule() { return rule; }
		
		//{VSSSSoftwareMaintenanceRequirements} '<SoftwareMaintenanceRequirements>' sectionDescription=DBody?
		//sssItems+=VSSSDocumentItem* sssRequirementSubsections+=VSSSInstantiableRequirementSection*
		//'</SoftwareMaintenanceRequirements>'
		public Group getGroup() { return cGroup; }
		
		//{VSSSSoftwareMaintenanceRequirements}
		public Action getVSSSSoftwareMaintenanceRequirementsAction_0() { return cVSSSSoftwareMaintenanceRequirementsAction_0; }
		
		//'<SoftwareMaintenanceRequirements>'
		public Keyword getSoftwareMaintenanceRequirementsKeyword_1() { return cSoftwareMaintenanceRequirementsKeyword_1; }
		
		//sectionDescription=DBody?
		public Assignment getSectionDescriptionAssignment_2() { return cSectionDescriptionAssignment_2; }
		
		//DBody
		public RuleCall getSectionDescriptionDBodyParserRuleCall_2_0() { return cSectionDescriptionDBodyParserRuleCall_2_0; }
		
		//sssItems+=VSSSDocumentItem*
		public Assignment getSssItemsAssignment_3() { return cSssItemsAssignment_3; }
		
		//VSSSDocumentItem
		public RuleCall getSssItemsVSSSDocumentItemParserRuleCall_3_0() { return cSssItemsVSSSDocumentItemParserRuleCall_3_0; }
		
		//sssRequirementSubsections+=VSSSInstantiableRequirementSection*
		public Assignment getSssRequirementSubsectionsAssignment_4() { return cSssRequirementSubsectionsAssignment_4; }
		
		//VSSSInstantiableRequirementSection
		public RuleCall getSssRequirementSubsectionsVSSSInstantiableRequirementSectionParserRuleCall_4_0() { return cSssRequirementSubsectionsVSSSInstantiableRequirementSectionParserRuleCall_4_0; }
		
		//'</SoftwareMaintenanceRequirements>'
		public Keyword getSoftwareMaintenanceRequirementsKeyword_5() { return cSoftwareMaintenanceRequirementsKeyword_5; }
	}
	public class VSSSSystemSoftwareObservabilityRequirementsElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.micobs.svm.lang.sss.SSS.VSSSSystemSoftwareObservabilityRequirements");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cVSSSSystemSoftwareObservabilityRequirementsAction_0 = (Action)cGroup.eContents().get(0);
		private final Keyword cSystemSoftwareObservabilityRequirementsKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cSectionDescriptionAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cSectionDescriptionDBodyParserRuleCall_2_0 = (RuleCall)cSectionDescriptionAssignment_2.eContents().get(0);
		private final Assignment cSssItemsAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cSssItemsVSSSDocumentItemParserRuleCall_3_0 = (RuleCall)cSssItemsAssignment_3.eContents().get(0);
		private final Assignment cSssRequirementSubsectionsAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cSssRequirementSubsectionsVSSSInstantiableRequirementSectionParserRuleCall_4_0 = (RuleCall)cSssRequirementSubsectionsAssignment_4.eContents().get(0);
		private final Keyword cSystemSoftwareObservabilityRequirementsKeyword_5 = (Keyword)cGroup.eContents().get(5);
		
		//VSSSSystemSoftwareObservabilityRequirements:
		//	{VSSSSystemSoftwareObservabilityRequirements}
		//	'<SystemSoftwareObservabilityRequirements>'
		//	sectionDescription=DBody?
		//	sssItems+=VSSSDocumentItem*
		//	sssRequirementSubsections+=VSSSInstantiableRequirementSection*
		//	'</SystemSoftwareObservabilityRequirements>';
		@Override public ParserRule getRule() { return rule; }
		
		//{VSSSSystemSoftwareObservabilityRequirements} '<SystemSoftwareObservabilityRequirements>' sectionDescription=DBody?
		//sssItems+=VSSSDocumentItem* sssRequirementSubsections+=VSSSInstantiableRequirementSection*
		//'</SystemSoftwareObservabilityRequirements>'
		public Group getGroup() { return cGroup; }
		
		//{VSSSSystemSoftwareObservabilityRequirements}
		public Action getVSSSSystemSoftwareObservabilityRequirementsAction_0() { return cVSSSSystemSoftwareObservabilityRequirementsAction_0; }
		
		//'<SystemSoftwareObservabilityRequirements>'
		public Keyword getSystemSoftwareObservabilityRequirementsKeyword_1() { return cSystemSoftwareObservabilityRequirementsKeyword_1; }
		
		//sectionDescription=DBody?
		public Assignment getSectionDescriptionAssignment_2() { return cSectionDescriptionAssignment_2; }
		
		//DBody
		public RuleCall getSectionDescriptionDBodyParserRuleCall_2_0() { return cSectionDescriptionDBodyParserRuleCall_2_0; }
		
		//sssItems+=VSSSDocumentItem*
		public Assignment getSssItemsAssignment_3() { return cSssItemsAssignment_3; }
		
		//VSSSDocumentItem
		public RuleCall getSssItemsVSSSDocumentItemParserRuleCall_3_0() { return cSssItemsVSSSDocumentItemParserRuleCall_3_0; }
		
		//sssRequirementSubsections+=VSSSInstantiableRequirementSection*
		public Assignment getSssRequirementSubsectionsAssignment_4() { return cSssRequirementSubsectionsAssignment_4; }
		
		//VSSSInstantiableRequirementSection
		public RuleCall getSssRequirementSubsectionsVSSSInstantiableRequirementSectionParserRuleCall_4_0() { return cSssRequirementSubsectionsVSSSInstantiableRequirementSectionParserRuleCall_4_0; }
		
		//'</SystemSoftwareObservabilityRequirements>'
		public Keyword getSystemSoftwareObservabilityRequirementsKeyword_5() { return cSystemSoftwareObservabilityRequirementsKeyword_5; }
	}
	public class VSSSDocumentItemElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.micobs.svm.lang.sss.SSS.VSSSDocumentItem");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cItemKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cNameKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cNameAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cNameSTRINGTerminalRuleCall_2_0 = (RuleCall)cNameAssignment_2.eContents().get(0);
		private final Keyword cValidationMethodKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Assignment cValidationMethodAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cValidationMethodVValidationMethodEnumRuleCall_4_0 = (RuleCall)cValidationMethodAssignment_4.eContents().get(0);
		private final Keyword cGreaterThanSignKeyword_5 = (Keyword)cGroup.eContents().get(5);
		private final Keyword cDescriptionKeyword_6 = (Keyword)cGroup.eContents().get(6);
		private final Assignment cDescriptionAssignment_7 = (Assignment)cGroup.eContents().get(7);
		private final RuleCall cDescriptionDBodyParserRuleCall_7_0 = (RuleCall)cDescriptionAssignment_7.eContents().get(0);
		private final Keyword cDescriptionKeyword_8 = (Keyword)cGroup.eContents().get(8);
		private final Group cGroup_9 = (Group)cGroup.eContents().get(9);
		private final Keyword cExtendedDescriptionKeyword_9_0 = (Keyword)cGroup_9.eContents().get(0);
		private final Assignment cExtendedDescriptionAssignment_9_1 = (Assignment)cGroup_9.eContents().get(1);
		private final RuleCall cExtendedDescriptionDBodyParserRuleCall_9_1_0 = (RuleCall)cExtendedDescriptionAssignment_9_1.eContents().get(0);
		private final Keyword cExtendedDescriptionKeyword_9_2 = (Keyword)cGroup_9.eContents().get(2);
		private final Keyword cItemKeyword_10 = (Keyword)cGroup.eContents().get(10);
		
		//VSSSDocumentItem:
		//	'<Item'
		//	'name=' name=STRING
		//	'validationMethod=' validationMethod=VValidationMethod
		//	'>'
		//	'<description>'
		//	description=DBody
		//	'</description>' ('<extendedDescription>'
		//	extendedDescription=DBody
		//	'</extendedDescription>')?
		//	'</Item>';
		@Override public ParserRule getRule() { return rule; }
		
		//'<Item' 'name=' name=STRING 'validationMethod=' validationMethod=VValidationMethod '>' '<description>' description=DBody
		//'</description>' ('<extendedDescription>' extendedDescription=DBody '</extendedDescription>')? '</Item>'
		public Group getGroup() { return cGroup; }
		
		//'<Item'
		public Keyword getItemKeyword_0() { return cItemKeyword_0; }
		
		//'name='
		public Keyword getNameKeyword_1() { return cNameKeyword_1; }
		
		//name=STRING
		public Assignment getNameAssignment_2() { return cNameAssignment_2; }
		
		//STRING
		public RuleCall getNameSTRINGTerminalRuleCall_2_0() { return cNameSTRINGTerminalRuleCall_2_0; }
		
		//'validationMethod='
		public Keyword getValidationMethodKeyword_3() { return cValidationMethodKeyword_3; }
		
		//validationMethod=VValidationMethod
		public Assignment getValidationMethodAssignment_4() { return cValidationMethodAssignment_4; }
		
		//VValidationMethod
		public RuleCall getValidationMethodVValidationMethodEnumRuleCall_4_0() { return cValidationMethodVValidationMethodEnumRuleCall_4_0; }
		
		//'>'
		public Keyword getGreaterThanSignKeyword_5() { return cGreaterThanSignKeyword_5; }
		
		//'<description>'
		public Keyword getDescriptionKeyword_6() { return cDescriptionKeyword_6; }
		
		//description=DBody
		public Assignment getDescriptionAssignment_7() { return cDescriptionAssignment_7; }
		
		//DBody
		public RuleCall getDescriptionDBodyParserRuleCall_7_0() { return cDescriptionDBodyParserRuleCall_7_0; }
		
		//'</description>'
		public Keyword getDescriptionKeyword_8() { return cDescriptionKeyword_8; }
		
		//('<extendedDescription>' extendedDescription=DBody '</extendedDescription>')?
		public Group getGroup_9() { return cGroup_9; }
		
		//'<extendedDescription>'
		public Keyword getExtendedDescriptionKeyword_9_0() { return cExtendedDescriptionKeyword_9_0; }
		
		//extendedDescription=DBody
		public Assignment getExtendedDescriptionAssignment_9_1() { return cExtendedDescriptionAssignment_9_1; }
		
		//DBody
		public RuleCall getExtendedDescriptionDBodyParserRuleCall_9_1_0() { return cExtendedDescriptionDBodyParserRuleCall_9_1_0; }
		
		//'</extendedDescription>'
		public Keyword getExtendedDescriptionKeyword_9_2() { return cExtendedDescriptionKeyword_9_2; }
		
		//'</Item>'
		public Keyword getItemKeyword_10() { return cItemKeyword_10; }
	}
	public class VSSSVerificationValidationProcessRequirementsElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.micobs.svm.lang.sss.SSS.VSSSVerificationValidationProcessRequirements");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cVSSSVerificationValidationProcessRequirementsAction_0 = (Action)cGroup.eContents().get(0);
		private final Keyword cVerificationValidationProcessRequirementsKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cSssItemsAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cSssItemsVSSSDocumentItemParserRuleCall_2_0 = (RuleCall)cSssItemsAssignment_2.eContents().get(0);
		private final Assignment cSssRequirementSubsectionsAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cSssRequirementSubsectionsVSSSInstantiableRequirementSectionParserRuleCall_3_0 = (RuleCall)cSssRequirementSubsectionsAssignment_3.eContents().get(0);
		private final Keyword cVerificationValidationProcessRequirementsKeyword_4 = (Keyword)cGroup.eContents().get(4);
		
		//VSSSVerificationValidationProcessRequirements:
		//	{VSSSVerificationValidationProcessRequirements}
		//	'<VerificationValidationProcessRequirements>'
		//	sssItems+=VSSSDocumentItem*
		//	sssRequirementSubsections+=VSSSInstantiableRequirementSection*
		//	'</VerificationValidationProcessRequirements>';
		@Override public ParserRule getRule() { return rule; }
		
		//{VSSSVerificationValidationProcessRequirements} '<VerificationValidationProcessRequirements>'
		//sssItems+=VSSSDocumentItem* sssRequirementSubsections+=VSSSInstantiableRequirementSection*
		//'</VerificationValidationProcessRequirements>'
		public Group getGroup() { return cGroup; }
		
		//{VSSSVerificationValidationProcessRequirements}
		public Action getVSSSVerificationValidationProcessRequirementsAction_0() { return cVSSSVerificationValidationProcessRequirementsAction_0; }
		
		//'<VerificationValidationProcessRequirements>'
		public Keyword getVerificationValidationProcessRequirementsKeyword_1() { return cVerificationValidationProcessRequirementsKeyword_1; }
		
		//sssItems+=VSSSDocumentItem*
		public Assignment getSssItemsAssignment_2() { return cSssItemsAssignment_2; }
		
		//VSSSDocumentItem
		public RuleCall getSssItemsVSSSDocumentItemParserRuleCall_2_0() { return cSssItemsVSSSDocumentItemParserRuleCall_2_0; }
		
		//sssRequirementSubsections+=VSSSInstantiableRequirementSection*
		public Assignment getSssRequirementSubsectionsAssignment_3() { return cSssRequirementSubsectionsAssignment_3; }
		
		//VSSSInstantiableRequirementSection
		public RuleCall getSssRequirementSubsectionsVSSSInstantiableRequirementSectionParserRuleCall_3_0() { return cSssRequirementSubsectionsVSSSInstantiableRequirementSectionParserRuleCall_3_0; }
		
		//'</VerificationValidationProcessRequirements>'
		public Keyword getVerificationValidationProcessRequirementsKeyword_4() { return cVerificationValidationProcessRequirementsKeyword_4; }
	}
	public class VSSSValidationApproachElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.micobs.svm.lang.sss.SSS.VSSSValidationApproach");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cVSSSValidationApproachAction_0 = (Action)cGroup.eContents().get(0);
		private final Keyword cValidationApproachKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cSssItemsAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cSssItemsVSSSDocumentItemParserRuleCall_2_0 = (RuleCall)cSssItemsAssignment_2.eContents().get(0);
		private final Assignment cSssRequirementSubsectionsAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cSssRequirementSubsectionsVSSSInstantiableRequirementSectionParserRuleCall_3_0 = (RuleCall)cSssRequirementSubsectionsAssignment_3.eContents().get(0);
		private final Keyword cValidationApproachKeyword_4 = (Keyword)cGroup.eContents().get(4);
		
		//VSSSValidationApproach:
		//	{VSSSValidationApproach}
		//	'<ValidationApproach>'
		//	sssItems+=VSSSDocumentItem*
		//	sssRequirementSubsections+=VSSSInstantiableRequirementSection*
		//	'</ValidationApproach>';
		@Override public ParserRule getRule() { return rule; }
		
		//{VSSSValidationApproach} '<ValidationApproach>' sssItems+=VSSSDocumentItem*
		//sssRequirementSubsections+=VSSSInstantiableRequirementSection* '</ValidationApproach>'
		public Group getGroup() { return cGroup; }
		
		//{VSSSValidationApproach}
		public Action getVSSSValidationApproachAction_0() { return cVSSSValidationApproachAction_0; }
		
		//'<ValidationApproach>'
		public Keyword getValidationApproachKeyword_1() { return cValidationApproachKeyword_1; }
		
		//sssItems+=VSSSDocumentItem*
		public Assignment getSssItemsAssignment_2() { return cSssItemsAssignment_2; }
		
		//VSSSDocumentItem
		public RuleCall getSssItemsVSSSDocumentItemParserRuleCall_2_0() { return cSssItemsVSSSDocumentItemParserRuleCall_2_0; }
		
		//sssRequirementSubsections+=VSSSInstantiableRequirementSection*
		public Assignment getSssRequirementSubsectionsAssignment_3() { return cSssRequirementSubsectionsAssignment_3; }
		
		//VSSSInstantiableRequirementSection
		public RuleCall getSssRequirementSubsectionsVSSSInstantiableRequirementSectionParserRuleCall_3_0() { return cSssRequirementSubsectionsVSSSInstantiableRequirementSectionParserRuleCall_3_0; }
		
		//'</ValidationApproach>'
		public Keyword getValidationApproachKeyword_4() { return cValidationApproachKeyword_4; }
	}
	public class VSSSValidationRequirementsElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.micobs.svm.lang.sss.SSS.VSSSValidationRequirements");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cVSSSValidationRequirementsAction_0 = (Action)cGroup.eContents().get(0);
		private final Keyword cValidationRequirementsKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cSssItemsAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cSssItemsVSSSDocumentItemParserRuleCall_2_0 = (RuleCall)cSssItemsAssignment_2.eContents().get(0);
		private final Assignment cSssRequirementSubsectionsAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cSssRequirementSubsectionsVSSSInstantiableRequirementSectionParserRuleCall_3_0 = (RuleCall)cSssRequirementSubsectionsAssignment_3.eContents().get(0);
		private final Keyword cValidationRequirementsKeyword_4 = (Keyword)cGroup.eContents().get(4);
		
		//VSSSValidationRequirements:
		//	{VSSSValidationRequirements}
		//	'<ValidationRequirements>'
		//	sssItems+=VSSSDocumentItem*
		//	sssRequirementSubsections+=VSSSInstantiableRequirementSection*
		//	'</ValidationRequirements>';
		@Override public ParserRule getRule() { return rule; }
		
		//{VSSSValidationRequirements} '<ValidationRequirements>' sssItems+=VSSSDocumentItem*
		//sssRequirementSubsections+=VSSSInstantiableRequirementSection* '</ValidationRequirements>'
		public Group getGroup() { return cGroup; }
		
		//{VSSSValidationRequirements}
		public Action getVSSSValidationRequirementsAction_0() { return cVSSSValidationRequirementsAction_0; }
		
		//'<ValidationRequirements>'
		public Keyword getValidationRequirementsKeyword_1() { return cValidationRequirementsKeyword_1; }
		
		//sssItems+=VSSSDocumentItem*
		public Assignment getSssItemsAssignment_2() { return cSssItemsAssignment_2; }
		
		//VSSSDocumentItem
		public RuleCall getSssItemsVSSSDocumentItemParserRuleCall_2_0() { return cSssItemsVSSSDocumentItemParserRuleCall_2_0; }
		
		//sssRequirementSubsections+=VSSSInstantiableRequirementSection*
		public Assignment getSssRequirementSubsectionsAssignment_3() { return cSssRequirementSubsectionsAssignment_3; }
		
		//VSSSInstantiableRequirementSection
		public RuleCall getSssRequirementSubsectionsVSSSInstantiableRequirementSectionParserRuleCall_3_0() { return cSssRequirementSubsectionsVSSSInstantiableRequirementSectionParserRuleCall_3_0; }
		
		//'</ValidationRequirements>'
		public Keyword getValidationRequirementsKeyword_4() { return cValidationRequirementsKeyword_4; }
	}
	public class VSSSVerificationRequirementsElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.micobs.svm.lang.sss.SSS.VSSSVerificationRequirements");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cVSSSVerificationRequirementsAction_0 = (Action)cGroup.eContents().get(0);
		private final Keyword cVerificationRequirementsKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cSssItemsAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cSssItemsVSSSDocumentItemParserRuleCall_2_0 = (RuleCall)cSssItemsAssignment_2.eContents().get(0);
		private final Assignment cSssRequirementSubsectionsAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cSssRequirementSubsectionsVSSSInstantiableRequirementSectionParserRuleCall_3_0 = (RuleCall)cSssRequirementSubsectionsAssignment_3.eContents().get(0);
		private final Keyword cVerificationRequirementsKeyword_4 = (Keyword)cGroup.eContents().get(4);
		
		//VSSSVerificationRequirements:
		//	{VSSSVerificationRequirements}
		//	'<VerificationRequirements>'
		//	sssItems+=VSSSDocumentItem*
		//	sssRequirementSubsections+=VSSSInstantiableRequirementSection*
		//	'</VerificationRequirements>';
		@Override public ParserRule getRule() { return rule; }
		
		//{VSSSVerificationRequirements} '<VerificationRequirements>' sssItems+=VSSSDocumentItem*
		//sssRequirementSubsections+=VSSSInstantiableRequirementSection* '</VerificationRequirements>'
		public Group getGroup() { return cGroup; }
		
		//{VSSSVerificationRequirements}
		public Action getVSSSVerificationRequirementsAction_0() { return cVSSSVerificationRequirementsAction_0; }
		
		//'<VerificationRequirements>'
		public Keyword getVerificationRequirementsKeyword_1() { return cVerificationRequirementsKeyword_1; }
		
		//sssItems+=VSSSDocumentItem*
		public Assignment getSssItemsAssignment_2() { return cSssItemsAssignment_2; }
		
		//VSSSDocumentItem
		public RuleCall getSssItemsVSSSDocumentItemParserRuleCall_2_0() { return cSssItemsVSSSDocumentItemParserRuleCall_2_0; }
		
		//sssRequirementSubsections+=VSSSInstantiableRequirementSection*
		public Assignment getSssRequirementSubsectionsAssignment_3() { return cSssRequirementSubsectionsAssignment_3; }
		
		//VSSSInstantiableRequirementSection
		public RuleCall getSssRequirementSubsectionsVSSSInstantiableRequirementSectionParserRuleCall_3_0() { return cSssRequirementSubsectionsVSSSInstantiableRequirementSectionParserRuleCall_3_0; }
		
		//'</VerificationRequirements>'
		public Keyword getVerificationRequirementsKeyword_4() { return cVerificationRequirementsKeyword_4; }
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
	
	public class DAlignmentElements extends AbstractEnumRuleElementFinder {
		private final EnumRule rule = (EnumRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.micobs.svm.lang.sss.SSS.DAlignment");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final EnumLiteralDeclaration cLeftEnumLiteralDeclaration_0 = (EnumLiteralDeclaration)cAlternatives.eContents().get(0);
		private final Keyword cLeftLeftKeyword_0_0 = (Keyword)cLeftEnumLiteralDeclaration_0.eContents().get(0);
		private final EnumLiteralDeclaration cCenterEnumLiteralDeclaration_1 = (EnumLiteralDeclaration)cAlternatives.eContents().get(1);
		private final Keyword cCenterCenterKeyword_1_0 = (Keyword)cCenterEnumLiteralDeclaration_1.eContents().get(0);
		private final EnumLiteralDeclaration cRightEnumLiteralDeclaration_2 = (EnumLiteralDeclaration)cAlternatives.eContents().get(2);
		private final Keyword cRightRightKeyword_2_0 = (Keyword)cRightEnumLiteralDeclaration_2.eContents().get(0);
		private final EnumLiteralDeclaration cJustifiedEnumLiteralDeclaration_3 = (EnumLiteralDeclaration)cAlternatives.eContents().get(3);
		private final Keyword cJustifiedJustifiedKeyword_3_0 = (Keyword)cJustifiedEnumLiteralDeclaration_3.eContents().get(0);
		
		//enum DAlignment returns doctpl::DAlignment:
		//	left='"left"' | center='"center"' | right='"right"' | justified='"justified"';
		public EnumRule getRule() { return rule; }
		
		//left='"left"' | center='"center"' | right='"right"' | justified='"justified"'
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//left='"left"'
		public EnumLiteralDeclaration getLeftEnumLiteralDeclaration_0() { return cLeftEnumLiteralDeclaration_0; }
		
		//'"left"'
		public Keyword getLeftLeftKeyword_0_0() { return cLeftLeftKeyword_0_0; }
		
		//center='"center"'
		public EnumLiteralDeclaration getCenterEnumLiteralDeclaration_1() { return cCenterEnumLiteralDeclaration_1; }
		
		//'"center"'
		public Keyword getCenterCenterKeyword_1_0() { return cCenterCenterKeyword_1_0; }
		
		//right='"right"'
		public EnumLiteralDeclaration getRightEnumLiteralDeclaration_2() { return cRightEnumLiteralDeclaration_2; }
		
		//'"right"'
		public Keyword getRightRightKeyword_2_0() { return cRightRightKeyword_2_0; }
		
		//justified='"justified"'
		public EnumLiteralDeclaration getJustifiedEnumLiteralDeclaration_3() { return cJustifiedEnumLiteralDeclaration_3; }
		
		//'"justified"'
		public Keyword getJustifiedJustifiedKeyword_3_0() { return cJustifiedJustifiedKeyword_3_0; }
	}
	public class VValidationMethodElements extends AbstractEnumRuleElementFinder {
		private final EnumRule rule = (EnumRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.micobs.svm.lang.sss.SSS.VValidationMethod");
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
		
		//enum VValidationMethod returns tdm::VValidationMethod:
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
	private final DAlignmentElements eDAlignment;
	private final DParagraphElements pDParagraph;
	private final DListItemElements pDListItem;
	private final DListContentElements pDListContent;
	private final DItemizeElements pDItemize;
	private final DEnumerateElements pDEnumerate;
	private final DParagraphContentElements pDParagraphContent;
	private final DRunElements pDRun;
	private final DHyperlinkElements pDHyperlink;
	private final DTabElements pDTab;
	private final DTextElements pDText;
	private final TerminalRule tRUNTEXT;
	private final DFigureFromFileElements pDFigureFromFile;
	private final DTableFromFileElements pDTableFromFile;
	private final DBasicTableElements pDBasicTable;
	private final DRowElements pDRow;
	private final DCellElements pDCell;
	private final DApplicableDocumentElements pDApplicableDocument;
	private final DReferenceDocumentElements pDReferenceDocument;
	private final VSSSFixedSectionElements pVSSSFixedSection;
	private final VSSSInstatiableSectionElements pVSSSInstatiableSection;
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
	private final VSSSInstantiableRequirementSectionElements pVSSSInstantiableRequirementSection;
	private final VSSSGeneralRequirementsElements pVSSSGeneralRequirements;
	private final VSSSCapabilitiesRequirementsElements pVSSSCapabilitiesRequirements;
	private final VSSSSystemInterfaceRequirementsElements pVSSSSystemInterfaceRequirements;
	private final VSSSAdaptationMissionizationRequirementsElements pVSSSAdaptationMissionizationRequirements;
	private final VSSSComputerResourceRequirementsElements pVSSSComputerResourceRequirements;
	private final VSSSSecurityRequirementsElements pVSSSSecurityRequirements;
	private final VSSSSafetyRequirementsElements pVSSSSafetyRequirements;
	private final VSSSReliabilityAvailabilityRequirementsElements pVSSSReliabilityAvailabilityRequirements;
	private final VSSSQualityRequirementsElements pVSSSQualityRequirements;
	private final VSSSDesignRequirementsElements pVSSSDesignRequirements;
	private final VSSSSoftwareOperationsRequirementsElements pVSSSSoftwareOperationsRequirements;
	private final VSSSSoftwareMaintenanceRequirementsElements pVSSSSoftwareMaintenanceRequirements;
	private final VSSSSystemSoftwareObservabilityRequirementsElements pVSSSSystemSoftwareObservabilityRequirements;
	private final VSSSDocumentItemElements pVSSSDocumentItem;
	private final VValidationMethodElements eVValidationMethod;
	private final VSSSVerificationValidationProcessRequirementsElements pVSSSVerificationValidationProcessRequirements;
	private final VSSSValidationApproachElements pVSSSValidationApproach;
	private final VSSSValidationRequirementsElements pVSSSValidationRequirements;
	private final VSSSVerificationRequirementsElements pVSSSVerificationRequirements;
	private final VSSSSystemModelElements pVSSSSystemModel;
	private final TerminalRule tUINT_STRING;
	
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
		this.eDAlignment = new DAlignmentElements();
		this.pDParagraph = new DParagraphElements();
		this.pDListItem = new DListItemElements();
		this.pDListContent = new DListContentElements();
		this.pDItemize = new DItemizeElements();
		this.pDEnumerate = new DEnumerateElements();
		this.pDParagraphContent = new DParagraphContentElements();
		this.pDRun = new DRunElements();
		this.pDHyperlink = new DHyperlinkElements();
		this.pDTab = new DTabElements();
		this.pDText = new DTextElements();
		this.tRUNTEXT = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.micobs.svm.lang.sss.SSS.RUNTEXT");
		this.pDFigureFromFile = new DFigureFromFileElements();
		this.pDTableFromFile = new DTableFromFileElements();
		this.pDBasicTable = new DBasicTableElements();
		this.pDRow = new DRowElements();
		this.pDCell = new DCellElements();
		this.pDApplicableDocument = new DApplicableDocumentElements();
		this.pDReferenceDocument = new DReferenceDocumentElements();
		this.pVSSSFixedSection = new VSSSFixedSectionElements();
		this.pVSSSInstatiableSection = new VSSSInstatiableSectionElements();
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
		this.pVSSSInstantiableRequirementSection = new VSSSInstantiableRequirementSectionElements();
		this.pVSSSGeneralRequirements = new VSSSGeneralRequirementsElements();
		this.pVSSSCapabilitiesRequirements = new VSSSCapabilitiesRequirementsElements();
		this.pVSSSSystemInterfaceRequirements = new VSSSSystemInterfaceRequirementsElements();
		this.pVSSSAdaptationMissionizationRequirements = new VSSSAdaptationMissionizationRequirementsElements();
		this.pVSSSComputerResourceRequirements = new VSSSComputerResourceRequirementsElements();
		this.pVSSSSecurityRequirements = new VSSSSecurityRequirementsElements();
		this.pVSSSSafetyRequirements = new VSSSSafetyRequirementsElements();
		this.pVSSSReliabilityAvailabilityRequirements = new VSSSReliabilityAvailabilityRequirementsElements();
		this.pVSSSQualityRequirements = new VSSSQualityRequirementsElements();
		this.pVSSSDesignRequirements = new VSSSDesignRequirementsElements();
		this.pVSSSSoftwareOperationsRequirements = new VSSSSoftwareOperationsRequirementsElements();
		this.pVSSSSoftwareMaintenanceRequirements = new VSSSSoftwareMaintenanceRequirementsElements();
		this.pVSSSSystemSoftwareObservabilityRequirements = new VSSSSystemSoftwareObservabilityRequirementsElements();
		this.pVSSSDocumentItem = new VSSSDocumentItemElements();
		this.eVValidationMethod = new VValidationMethodElements();
		this.pVSSSVerificationValidationProcessRequirements = new VSSSVerificationValidationProcessRequirementsElements();
		this.pVSSSValidationApproach = new VSSSValidationApproachElements();
		this.pVSSSValidationRequirements = new VSSSValidationRequirementsElements();
		this.pVSSSVerificationRequirements = new VSSSVerificationRequirementsElements();
		this.pVSSSSystemModel = new VSSSSystemModelElements();
		this.tUINT_STRING = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.micobs.svm.lang.sss.SSS.UINT_STRING");
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
	//	'issue=' issue=UINT_STRING
	//	'revision=' revision=UINT_STRING
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
	
	//DBody doctpl::DBody:
	//	'<body>'
	//	bodyContent+=DBodyContent+
	//	'</body>'
	public DBodyElements getDBodyAccess() {
		return pDBody;
	}
	
	public ParserRule getDBodyRule() {
		return getDBodyAccess().getRule();
	}
	
	//DBodyContent doctpl::DBodyContent:
	//	DParagraph | DItemize | DEnumerate | DFigureFromFile | DTableFromFile | DBasicTable
	public DBodyContentElements getDBodyContentAccess() {
		return pDBodyContent;
	}
	
	public ParserRule getDBodyContentRule() {
		return getDBodyContentAccess().getRule();
	}
	
	//enum DAlignment returns doctpl::DAlignment:
	//	left='"left"' | center='"center"' | right='"right"' | justified='"justified"';
	public DAlignmentElements getDAlignmentAccess() {
		return eDAlignment;
	}
	
	public EnumRule getDAlignmentRule() {
		return getDAlignmentAccess().getRule();
	}
	
	//DParagraph doctpl::DParagraph:
	//	'<paragraph' ('style=' style=STRING)? ('alignment=' alignment=DAlignment)?
	//	'>'
	//	paragraphContent+=DParagraphContent+
	//	'</paragraph>'
	public DParagraphElements getDParagraphAccess() {
		return pDParagraph;
	}
	
	public ParserRule getDParagraphRule() {
		return getDParagraphAccess().getRule();
	}
	
	//DListItem doctpl::DListItem:
	//	'<listItem>'
	//	paragraph+=DParagraph+ ('<sublist>' sublist=DListContent '</sublist>')?
	//	'</listItem>'
	public DListItemElements getDListItemAccess() {
		return pDListItem;
	}
	
	public ParserRule getDListItemRule() {
		return getDListItemAccess().getRule();
	}
	
	//DListContent doctpl::DListContent:
	//	DItemize | DEnumerate
	public DListContentElements getDListContentAccess() {
		return pDListContent;
	}
	
	public ParserRule getDListContentRule() {
		return getDListContentAccess().getRule();
	}
	
	//DItemize doctpl::DItemize:
	//	'<itemize' ('alignment=' alignment=DAlignment)? ('style=' style=STRING)?
	//	'>'
	//	items+=DListItem+
	//	'</itemize>'
	public DItemizeElements getDItemizeAccess() {
		return pDItemize;
	}
	
	public ParserRule getDItemizeRule() {
		return getDItemizeAccess().getRule();
	}
	
	//DEnumerate doctpl::DEnumerate:
	//	'<enumerate' ('alignment=' alignment=DAlignment)? ('style=' style=STRING)?
	//	'>'
	//	items+=DListItem+
	//	'</enumerate>'
	public DEnumerateElements getDEnumerateAccess() {
		return pDEnumerate;
	}
	
	public ParserRule getDEnumerateRule() {
		return getDEnumerateAccess().getRule();
	}
	
	//DParagraphContent doctpl::DParagraphContent:
	//	DRun | DHyperlink
	public DParagraphContentElements getDParagraphContentAccess() {
		return pDParagraphContent;
	}
	
	public ParserRule getDParagraphContentRule() {
		return getDParagraphContentAccess().getRule();
	}
	
	//DRun doctpl::DRun:
	//	'<run'
	//	'bold="true"'?
	//	'italics="true"'?
	//	'underline="true"'?
	//	'>'
	//	tab=DTab?
	//	text=DText
	//	'</run>'
	public DRunElements getDRunAccess() {
		return pDRun;
	}
	
	public ParserRule getDRunRule() {
		return getDRunAccess().getRule();
	}
	
	//DHyperlink doctpl::DHyperlink:
	//	'<hyperlink'
	//	'reference=' reference=[doctpl::DReferenceableObject|STRING]
	//	'>'
	//	run=DRun?
	//	'</hyperlink>'
	public DHyperlinkElements getDHyperlinkAccess() {
		return pDHyperlink;
	}
	
	public ParserRule getDHyperlinkRule() {
		return getDHyperlinkAccess().getRule();
	}
	
	//DTab doctpl::DTab:
	//	{doctpl::DTab}
	//	'<tab/>'
	public DTabElements getDTabAccess() {
		return pDTab;
	}
	
	public ParserRule getDTabRule() {
		return getDTabAccess().getRule();
	}
	
	//DText doctpl::DText:
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
	
	//DFigureFromFile doctpl::DFigureFromFile:
	//	'<figureFromFile'
	//	'name=' name=STRING
	//	'referenceFile=' referenceFile=STRING
	//	'width=' width=UINT_STRING
	//	'height=' height=UINT_STRING ('alignment=' alignment=DAlignment)? ('style=' style=STRING)? ('caption='
	//	caption=STRING)?
	//	'/>'
	public DFigureFromFileElements getDFigureFromFileAccess() {
		return pDFigureFromFile;
	}
	
	public ParserRule getDFigureFromFileRule() {
		return getDFigureFromFileAccess().getRule();
	}
	
	//DTableFromFile doctpl::DTableFromFile:
	//	'<tableFromFile'
	//	'name=' name=STRING
	//	'referenceFile=' referenceFile=STRING
	//	'width=' width=UINT_STRING
	//	'height=' height=UINT_STRING ('alignment=' alignment=DAlignment)? ('style=' style=STRING)? ('caption='
	//	caption=STRING)?
	//	'/>'
	public DTableFromFileElements getDTableFromFileAccess() {
		return pDTableFromFile;
	}
	
	public ParserRule getDTableFromFileRule() {
		return getDTableFromFileAccess().getRule();
	}
	
	//DBasicTable doctpl::DBasicTable:
	//	'<basicTable'
	//	'name=' name=STRING ('width=' width=UINT_STRING)? ('alignment=' alignment=DAlignment)? ('style=' style=STRING)?
	//	('caption=' caption=STRING)?
	//	'>'
	//	rows+=DRow+
	//	'</basicTable>'
	public DBasicTableElements getDBasicTableAccess() {
		return pDBasicTable;
	}
	
	public ParserRule getDBasicTableRule() {
		return getDBasicTableAccess().getRule();
	}
	
	//DRow doctpl::DRow:
	//	'<row>'
	//	cells+=DCell+
	//	'</row>'
	public DRowElements getDRowAccess() {
		return pDRow;
	}
	
	public ParserRule getDRowRule() {
		return getDRowAccess().getRule();
	}
	
	//DCell doctpl::DCell:
	//	'<cell' ('colSpan=' colSpan=UINT_STRING)? ('rowSpan=' rowSpan=UINT_STRING)? ('width=' width=UINT_STRING)? ('shadow='
	//	shadow=STRING)?
	//	'>'
	//	bodyContent+=DBodyContent+
	//	'</cell>'
	public DCellElements getDCellAccess() {
		return pDCell;
	}
	
	public ParserRule getDCellRule() {
		return getDCellAccess().getRule();
	}
	
	//DApplicableDocument doctpl::DApplicableDocument:
	//	'<ApplicableDocument'
	//	'name=' name=STRING
	//	'title=' title=STRING
	//	'id=' id=STRING ('issue=' issue=UINT_STRING ('revision=' revision=UINT_STRING)?)? ('date=' date=STRING)?
	//	'/>'
	public DApplicableDocumentElements getDApplicableDocumentAccess() {
		return pDApplicableDocument;
	}
	
	public ParserRule getDApplicableDocumentRule() {
		return getDApplicableDocumentAccess().getRule();
	}
	
	//DReferenceDocument doctpl::DReferenceDocument:
	//	'<ReferenceDocument'
	//	'name=' name=STRING
	//	'title=' title=STRING
	//	'id=' id=STRING ('issue=' issue=UINT_STRING ('revision=' revision=UINT_STRING)?)? ('date=' date=STRING)?
	//	'/>'
	public DReferenceDocumentElements getDReferenceDocumentAccess() {
		return pDReferenceDocument;
	}
	
	public ParserRule getDReferenceDocumentRule() {
		return getDReferenceDocumentAccess().getRule();
	}
	
	//VSSSFixedSection:
	//	{VSSSFixedSection} body=DBody?
	//	sssInstatiableSubsections+=VSSSInstatiableSection*;
	public VSSSFixedSectionElements getVSSSFixedSectionAccess() {
		return pVSSSFixedSection;
	}
	
	public ParserRule getVSSSFixedSectionRule() {
		return getVSSSFixedSectionAccess().getRule();
	}
	
	//VSSSInstatiableSection VSSSInstantiableSection:
	//	'<subsection'
	//	'name=' name=STRING
	//	'>'
	//	body=DBody?
	//	sssInstatiableSubsections+=VSSSInstatiableSection*
	//	'</subsection>'
	public VSSSInstatiableSectionElements getVSSSInstatiableSectionAccess() {
		return pVSSSInstatiableSection;
	}
	
	public ParserRule getVSSSInstatiableSectionRule() {
		return getVSSSInstatiableSectionAccess().getRule();
	}
	
	//VSSSIntroduction:
	//	'<Introduction>'
	//	sssInstatiableSubsections+=VSSSInstatiableSection+
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
	//	'<ProductPerspective>' productPerspective=VSSSFixedSection '</ProductPerspective>'
	//	'<GeneralCapabilities>' generalCapabilities=VSSSFixedSection '</GeneralCapabilities>'
	//	'<GeneralConstraints>' generalConstraints=VSSSFixedSection '</GeneralConstraints>'
	//	'<OperationalEnvironment>' operationalEnvironment=VSSSFixedSection '</OperationalEnvironment>'
	//	'<AssumptionsDependencies>' assumptionsDependencies=VSSSFixedSection '</AssumptionsDependencies>'
	//	'</GeneralDescription>';
	public VSSSGeneralDescriptionElements getVSSSGeneralDescriptionAccess() {
		return pVSSSGeneralDescription;
	}
	
	public ParserRule getVSSSGeneralDescriptionRule() {
		return getVSSSGeneralDescriptionAccess().getRule();
	}
	
	//VSSSSpecificRequirements:
	//	'<SpecificRequirements>'
	//	sectionDescription=DBody?
	//	general=VSSSGeneralRequirements
	//	capabilities=VSSSCapabilitiesRequirements
	//	systemInterface=VSSSSystemInterfaceRequirements
	//	adaptationMissionization=VSSSAdaptationMissionizationRequirements
	//	computerResource=VSSSComputerResourceRequirements
	//	security=VSSSSecurityRequirements
	//	safety=VSSSSafetyRequirements
	//	reliabilityAvailability=VSSSReliabilityAvailabilityRequirements
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
	//	sectionDescription=DBody?
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
	
	//VSSSInstantiableRequirementSection:
	//	'<subsection'
	//	'name=' name=STRING
	//	'>'
	//	sectionDescription=DBody?
	//	sssItems+=VSSSDocumentItem*
	//	'</subsection>';
	public VSSSInstantiableRequirementSectionElements getVSSSInstantiableRequirementSectionAccess() {
		return pVSSSInstantiableRequirementSection;
	}
	
	public ParserRule getVSSSInstantiableRequirementSectionRule() {
		return getVSSSInstantiableRequirementSectionAccess().getRule();
	}
	
	//VSSSGeneralRequirements:
	//	{VSSSGeneralRequirements}
	//	'<GeneralRequirements>'
	//	sectionDescription=DBody?
	//	sssItems+=VSSSDocumentItem*
	//	sssRequirementSubsections+=VSSSInstantiableRequirementSection*
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
	//	sectionDescription=DBody?
	//	sssItems+=VSSSDocumentItem*
	//	sssRequirementSubsections+=VSSSInstantiableRequirementSection*
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
	//	sectionDescription=DBody?
	//	sssItems+=VSSSDocumentItem*
	//	sssRequirementSubsections+=VSSSInstantiableRequirementSection*
	//	'</SystemInterfaceRequirements>';
	public VSSSSystemInterfaceRequirementsElements getVSSSSystemInterfaceRequirementsAccess() {
		return pVSSSSystemInterfaceRequirements;
	}
	
	public ParserRule getVSSSSystemInterfaceRequirementsRule() {
		return getVSSSSystemInterfaceRequirementsAccess().getRule();
	}
	
	//VSSSAdaptationMissionizationRequirements:
	//	{VSSSAdaptationMissionizationRequirements}
	//	'<AdaptationMissionizationRequirements>'
	//	sectionDescription=DBody?
	//	sssItems+=VSSSDocumentItem*
	//	sssRequirementSubsections+=VSSSInstantiableRequirementSection*
	//	'</AdaptationMissionizationRequirements>';
	public VSSSAdaptationMissionizationRequirementsElements getVSSSAdaptationMissionizationRequirementsAccess() {
		return pVSSSAdaptationMissionizationRequirements;
	}
	
	public ParserRule getVSSSAdaptationMissionizationRequirementsRule() {
		return getVSSSAdaptationMissionizationRequirementsAccess().getRule();
	}
	
	//VSSSComputerResourceRequirements:
	//	{VSSSComputerResourceRequirements}
	//	'<ComputerResourceRequirements>'
	//	sectionDescription=DBody?
	//	sssItems+=VSSSDocumentItem*
	//	sssRequirementSubsections+=VSSSInstantiableRequirementSection*
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
	//	sectionDescription=DBody?
	//	sssItems+=VSSSDocumentItem*
	//	sssRequirementSubsections+=VSSSInstantiableRequirementSection*
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
	//	sectionDescription=DBody?
	//	sssItems+=VSSSDocumentItem*
	//	sssRequirementSubsections+=VSSSInstantiableRequirementSection*
	//	'</SafetyRequirements>';
	public VSSSSafetyRequirementsElements getVSSSSafetyRequirementsAccess() {
		return pVSSSSafetyRequirements;
	}
	
	public ParserRule getVSSSSafetyRequirementsRule() {
		return getVSSSSafetyRequirementsAccess().getRule();
	}
	
	//VSSSReliabilityAvailabilityRequirements:
	//	{VSSSReliabilityAvailabilityRequirements}
	//	'<ReliabilityAvailabilityRequirements>'
	//	sssItems+=VSSSDocumentItem*
	//	sectionDescription=DBody?
	//	sssRequirementSubsections+=VSSSInstantiableRequirementSection*
	//	'</ReliabilityAvailabilityRequirements>';
	public VSSSReliabilityAvailabilityRequirementsElements getVSSSReliabilityAvailabilityRequirementsAccess() {
		return pVSSSReliabilityAvailabilityRequirements;
	}
	
	public ParserRule getVSSSReliabilityAvailabilityRequirementsRule() {
		return getVSSSReliabilityAvailabilityRequirementsAccess().getRule();
	}
	
	//VSSSQualityRequirements:
	//	{VSSSQualityRequirements}
	//	'<QualityRequirements>'
	//	sectionDescription=DBody?
	//	sssItems+=VSSSDocumentItem*
	//	sssRequirementSubsections+=VSSSInstantiableRequirementSection*
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
	//	sectionDescription=DBody?
	//	sssItems+=VSSSDocumentItem*
	//	sssRequirementSubsections+=VSSSInstantiableRequirementSection*
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
	//	sectionDescription=DBody?
	//	sssItems+=VSSSDocumentItem*
	//	sssRequirementSubsections+=VSSSInstantiableRequirementSection*
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
	//	sectionDescription=DBody?
	//	sssItems+=VSSSDocumentItem*
	//	sssRequirementSubsections+=VSSSInstantiableRequirementSection*
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
	//	sectionDescription=DBody?
	//	sssItems+=VSSSDocumentItem*
	//	sssRequirementSubsections+=VSSSInstantiableRequirementSection*
	//	'</SystemSoftwareObservabilityRequirements>';
	public VSSSSystemSoftwareObservabilityRequirementsElements getVSSSSystemSoftwareObservabilityRequirementsAccess() {
		return pVSSSSystemSoftwareObservabilityRequirements;
	}
	
	public ParserRule getVSSSSystemSoftwareObservabilityRequirementsRule() {
		return getVSSSSystemSoftwareObservabilityRequirementsAccess().getRule();
	}
	
	//VSSSDocumentItem:
	//	'<Item'
	//	'name=' name=STRING
	//	'validationMethod=' validationMethod=VValidationMethod
	//	'>'
	//	'<description>'
	//	description=DBody
	//	'</description>' ('<extendedDescription>'
	//	extendedDescription=DBody
	//	'</extendedDescription>')?
	//	'</Item>';
	public VSSSDocumentItemElements getVSSSDocumentItemAccess() {
		return pVSSSDocumentItem;
	}
	
	public ParserRule getVSSSDocumentItemRule() {
		return getVSSSDocumentItemAccess().getRule();
	}
	
	//enum VValidationMethod returns tdm::VValidationMethod:
	//	Analysis='"Analysis"' | Inspection='"Inspection"' | Testing='"Testing"' |
	//	Review='"Review"' | ModelSimulation='"ModelSimulation"' | WalkThrough='"WalkThrough"' |
	//	CrossReading='"CrossReading"' | DeskChecking='"DeskChecking"';
	public VValidationMethodElements getVValidationMethodAccess() {
		return eVValidationMethod;
	}
	
	public EnumRule getVValidationMethodRule() {
		return getVValidationMethodAccess().getRule();
	}
	
	//VSSSVerificationValidationProcessRequirements:
	//	{VSSSVerificationValidationProcessRequirements}
	//	'<VerificationValidationProcessRequirements>'
	//	sssItems+=VSSSDocumentItem*
	//	sssRequirementSubsections+=VSSSInstantiableRequirementSection*
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
	//	sssRequirementSubsections+=VSSSInstantiableRequirementSection*
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
	//	sssRequirementSubsections+=VSSSInstantiableRequirementSection*
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
	//	sssRequirementSubsections+=VSSSInstantiableRequirementSection*
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
	
	//terminal UINT_STRING:
	//	'"' '0'..'9'+ '"';
	public TerminalRule getUINT_STRINGRule() {
		return tUINT_STRING;
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
