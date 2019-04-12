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
package es.uah.aut.srg.micobs.svm.lang.srs.services;

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
public class SRSGrammarAccess extends AbstractGrammarElementFinder {
	
	public class VSRSDocumentElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.micobs.svm.lang.srs.SRS.VSRSDocument");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cSRSKeyword_0 = (Keyword)cGroup.eContents().get(0);
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
		private final RuleCall cIntroductionSectionVSRSIntroductionParserRuleCall_12_0 = (RuleCall)cIntroductionSectionAssignment_12.eContents().get(0);
		private final Assignment cApplicableDocumentsSectionAssignment_13 = (Assignment)cGroup.eContents().get(13);
		private final RuleCall cApplicableDocumentsSectionVSRSApplicableDocumentsParserRuleCall_13_0 = (RuleCall)cApplicableDocumentsSectionAssignment_13.eContents().get(0);
		private final Assignment cReferenceDocumentsSectionAssignment_14 = (Assignment)cGroup.eContents().get(14);
		private final RuleCall cReferenceDocumentsSectionVSRSReferenceDocumentsParserRuleCall_14_0 = (RuleCall)cReferenceDocumentsSectionAssignment_14.eContents().get(0);
		private final Assignment cTermsDefinitionsAbbreviationsSectionAssignment_15 = (Assignment)cGroup.eContents().get(15);
		private final RuleCall cTermsDefinitionsAbbreviationsSectionVSRSTermsDefinitionsAbbreviationsParserRuleCall_15_0 = (RuleCall)cTermsDefinitionsAbbreviationsSectionAssignment_15.eContents().get(0);
		private final Assignment cGeneralDescriptionSectionAssignment_16 = (Assignment)cGroup.eContents().get(16);
		private final RuleCall cGeneralDescriptionSectionVSRSSoftwareOverviewParserRuleCall_16_0 = (RuleCall)cGeneralDescriptionSectionAssignment_16.eContents().get(0);
		private final Assignment cRequirementsSectionAssignment_17 = (Assignment)cGroup.eContents().get(17);
		private final RuleCall cRequirementsSectionVSRSRequirementsParserRuleCall_17_0 = (RuleCall)cRequirementsSectionAssignment_17.eContents().get(0);
		private final Assignment cTraceabiltySectionAssignment_18 = (Assignment)cGroup.eContents().get(18);
		private final RuleCall cTraceabiltySectionVSRSTraceabiltyParserRuleCall_18_0 = (RuleCall)cTraceabiltySectionAssignment_18.eContents().get(0);
		private final Assignment cLogicalModelsSectionAssignment_19 = (Assignment)cGroup.eContents().get(19);
		private final RuleCall cLogicalModelsSectionVSRSLogicalModelsParserRuleCall_19_0 = (RuleCall)cLogicalModelsSectionAssignment_19.eContents().get(0);
		private final Group cGroup_20 = (Group)cGroup.eContents().get(20);
		private final Keyword cParentKeyword_20_0 = (Keyword)cGroup_20.eContents().get(0);
		private final Keyword cNameKeyword_20_1 = (Keyword)cGroup_20.eContents().get(1);
		private final Assignment cParentsAssignment_20_2 = (Assignment)cGroup_20.eContents().get(2);
		private final CrossReference cParentsVTraceableDocumentCrossReference_20_2_0 = (CrossReference)cParentsAssignment_20_2.eContents().get(0);
		private final RuleCall cParentsVTraceableDocumentSTRINGTerminalRuleCall_20_2_0_1 = (RuleCall)cParentsVTraceableDocumentCrossReference_20_2_0.eContents().get(1);
		private final Keyword cSolidusGreaterThanSignKeyword_20_3 = (Keyword)cGroup_20.eContents().get(3);
		private final Keyword cSRSKeyword_21 = (Keyword)cGroup.eContents().get(21);
		
		//VSRSDocument:
		//	'<SRS'
		//	'name=' name=STRING
		//	'id=' id=STRING
		//	'issue=' issue=STRING
		//	'revision=' revision=STRING
		//	'date=' date=STRING
		//	'>'
		//	introductionSection=VSRSIntroduction
		//	applicableDocumentsSection=VSRSApplicableDocuments
		//	referenceDocumentsSection=VSRSReferenceDocuments
		//	termsDefinitionsAbbreviationsSection=VSRSTermsDefinitionsAbbreviations
		//	generalDescriptionSection=VSRSSoftwareOverview
		//	requirementsSection=VSRSRequirements
		//	traceabiltySection=VSRSTraceabilty
		//	logicalModelsSection=VSRSLogicalModels ('<parent' 'name=' parents+=[tdm::VTraceableDocument|STRING] '/>')*
		//	'</SRS>';
		@Override public ParserRule getRule() { return rule; }
		
		//'<SRS' 'name=' name=STRING 'id=' id=STRING 'issue=' issue=STRING 'revision=' revision=STRING 'date=' date=STRING '>'
		//introductionSection=VSRSIntroduction applicableDocumentsSection=VSRSApplicableDocuments
		//referenceDocumentsSection=VSRSReferenceDocuments
		//termsDefinitionsAbbreviationsSection=VSRSTermsDefinitionsAbbreviations generalDescriptionSection=VSRSSoftwareOverview
		//requirementsSection=VSRSRequirements traceabiltySection=VSRSTraceabilty logicalModelsSection=VSRSLogicalModels
		//('<parent' 'name=' parents+=[tdm::VTraceableDocument|STRING] '/>')* '</SRS>'
		public Group getGroup() { return cGroup; }
		
		//'<SRS'
		public Keyword getSRSKeyword_0() { return cSRSKeyword_0; }
		
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
		
		//introductionSection=VSRSIntroduction
		public Assignment getIntroductionSectionAssignment_12() { return cIntroductionSectionAssignment_12; }
		
		//VSRSIntroduction
		public RuleCall getIntroductionSectionVSRSIntroductionParserRuleCall_12_0() { return cIntroductionSectionVSRSIntroductionParserRuleCall_12_0; }
		
		//applicableDocumentsSection=VSRSApplicableDocuments
		public Assignment getApplicableDocumentsSectionAssignment_13() { return cApplicableDocumentsSectionAssignment_13; }
		
		//VSRSApplicableDocuments
		public RuleCall getApplicableDocumentsSectionVSRSApplicableDocumentsParserRuleCall_13_0() { return cApplicableDocumentsSectionVSRSApplicableDocumentsParserRuleCall_13_0; }
		
		//referenceDocumentsSection=VSRSReferenceDocuments
		public Assignment getReferenceDocumentsSectionAssignment_14() { return cReferenceDocumentsSectionAssignment_14; }
		
		//VSRSReferenceDocuments
		public RuleCall getReferenceDocumentsSectionVSRSReferenceDocumentsParserRuleCall_14_0() { return cReferenceDocumentsSectionVSRSReferenceDocumentsParserRuleCall_14_0; }
		
		//termsDefinitionsAbbreviationsSection=VSRSTermsDefinitionsAbbreviations
		public Assignment getTermsDefinitionsAbbreviationsSectionAssignment_15() { return cTermsDefinitionsAbbreviationsSectionAssignment_15; }
		
		//VSRSTermsDefinitionsAbbreviations
		public RuleCall getTermsDefinitionsAbbreviationsSectionVSRSTermsDefinitionsAbbreviationsParserRuleCall_15_0() { return cTermsDefinitionsAbbreviationsSectionVSRSTermsDefinitionsAbbreviationsParserRuleCall_15_0; }
		
		//generalDescriptionSection=VSRSSoftwareOverview
		public Assignment getGeneralDescriptionSectionAssignment_16() { return cGeneralDescriptionSectionAssignment_16; }
		
		//VSRSSoftwareOverview
		public RuleCall getGeneralDescriptionSectionVSRSSoftwareOverviewParserRuleCall_16_0() { return cGeneralDescriptionSectionVSRSSoftwareOverviewParserRuleCall_16_0; }
		
		//requirementsSection=VSRSRequirements
		public Assignment getRequirementsSectionAssignment_17() { return cRequirementsSectionAssignment_17; }
		
		//VSRSRequirements
		public RuleCall getRequirementsSectionVSRSRequirementsParserRuleCall_17_0() { return cRequirementsSectionVSRSRequirementsParserRuleCall_17_0; }
		
		//traceabiltySection=VSRSTraceabilty
		public Assignment getTraceabiltySectionAssignment_18() { return cTraceabiltySectionAssignment_18; }
		
		//VSRSTraceabilty
		public RuleCall getTraceabiltySectionVSRSTraceabiltyParserRuleCall_18_0() { return cTraceabiltySectionVSRSTraceabiltyParserRuleCall_18_0; }
		
		//logicalModelsSection=VSRSLogicalModels
		public Assignment getLogicalModelsSectionAssignment_19() { return cLogicalModelsSectionAssignment_19; }
		
		//VSRSLogicalModels
		public RuleCall getLogicalModelsSectionVSRSLogicalModelsParserRuleCall_19_0() { return cLogicalModelsSectionVSRSLogicalModelsParserRuleCall_19_0; }
		
		//('<parent' 'name=' parents+=[tdm::VTraceableDocument|STRING] '/>')*
		public Group getGroup_20() { return cGroup_20; }
		
		//'<parent'
		public Keyword getParentKeyword_20_0() { return cParentKeyword_20_0; }
		
		//'name='
		public Keyword getNameKeyword_20_1() { return cNameKeyword_20_1; }
		
		//parents+=[tdm::VTraceableDocument|STRING]
		public Assignment getParentsAssignment_20_2() { return cParentsAssignment_20_2; }
		
		//[tdm::VTraceableDocument|STRING]
		public CrossReference getParentsVTraceableDocumentCrossReference_20_2_0() { return cParentsVTraceableDocumentCrossReference_20_2_0; }
		
		//STRING
		public RuleCall getParentsVTraceableDocumentSTRINGTerminalRuleCall_20_2_0_1() { return cParentsVTraceableDocumentSTRINGTerminalRuleCall_20_2_0_1; }
		
		//'/>'
		public Keyword getSolidusGreaterThanSignKeyword_20_3() { return cSolidusGreaterThanSignKeyword_20_3; }
		
		//'</SRS>'
		public Keyword getSRSKeyword_21() { return cSRSKeyword_21; }
	}
	public class DBodyElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.micobs.svm.lang.srs.SRS.DBody");
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
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.micobs.svm.lang.srs.SRS.DBodyContent");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cDParagraphParserRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cDItemizeParserRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		private final RuleCall cDEnumerateParserRuleCall_2 = (RuleCall)cAlternatives.eContents().get(2);
		private final RuleCall cDFigureFromFileParserRuleCall_3 = (RuleCall)cAlternatives.eContents().get(3);
		private final RuleCall cDTableFromFileParserRuleCall_4 = (RuleCall)cAlternatives.eContents().get(4);
		private final RuleCall cDBasicTableParserRuleCall_5 = (RuleCall)cAlternatives.eContents().get(5);
		
		//DBodyContent doc::DBodyContent:
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
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.micobs.svm.lang.srs.SRS.DParagraph");
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
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.micobs.svm.lang.srs.SRS.DListItem");
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
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.micobs.svm.lang.srs.SRS.DListContent");
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
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.micobs.svm.lang.srs.SRS.DItemize");
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
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.micobs.svm.lang.srs.SRS.DEnumerate");
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
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.micobs.svm.lang.srs.SRS.DParagraphContent");
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
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.micobs.svm.lang.srs.SRS.DRun");
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
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.micobs.svm.lang.srs.SRS.DHyperlink");
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
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.micobs.svm.lang.srs.SRS.DText");
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
	public class DFigureFromFileElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.micobs.svm.lang.srs.SRS.DFigureFromFile");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cFigureKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cNameKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cNameAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cNameSTRINGTerminalRuleCall_2_0 = (RuleCall)cNameAssignment_2.eContents().get(0);
		private final Keyword cReferenceFileKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Assignment cReferenceFileAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cReferenceFileSTRINGTerminalRuleCall_4_0 = (RuleCall)cReferenceFileAssignment_4.eContents().get(0);
		private final Group cGroup_5 = (Group)cGroup.eContents().get(5);
		private final Keyword cCaptionKeyword_5_0 = (Keyword)cGroup_5.eContents().get(0);
		private final Assignment cCaptionAssignment_5_1 = (Assignment)cGroup_5.eContents().get(1);
		private final RuleCall cCaptionSTRINGTerminalRuleCall_5_1_0 = (RuleCall)cCaptionAssignment_5_1.eContents().get(0);
		private final Keyword cSolidusGreaterThanSignKeyword_6 = (Keyword)cGroup.eContents().get(6);
		
		//DFigureFromFile doc::DFigureFromFile:
		//	'<figure'
		//	'name=' name=STRING
		//	'referenceFile=' referenceFile=STRING ('caption=' caption=STRING)?
		//	'/>'
		@Override public ParserRule getRule() { return rule; }
		
		//'<figure' 'name=' name=STRING 'referenceFile=' referenceFile=STRING ('caption=' caption=STRING)? '/>'
		public Group getGroup() { return cGroup; }
		
		//'<figure'
		public Keyword getFigureKeyword_0() { return cFigureKeyword_0; }
		
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
		
		//('caption=' caption=STRING)?
		public Group getGroup_5() { return cGroup_5; }
		
		//'caption='
		public Keyword getCaptionKeyword_5_0() { return cCaptionKeyword_5_0; }
		
		//caption=STRING
		public Assignment getCaptionAssignment_5_1() { return cCaptionAssignment_5_1; }
		
		//STRING
		public RuleCall getCaptionSTRINGTerminalRuleCall_5_1_0() { return cCaptionSTRINGTerminalRuleCall_5_1_0; }
		
		//'/>'
		public Keyword getSolidusGreaterThanSignKeyword_6() { return cSolidusGreaterThanSignKeyword_6; }
	}
	public class DTableFromFileElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.micobs.svm.lang.srs.SRS.DTableFromFile");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cPictureAsTableKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cNameKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cNameAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cNameSTRINGTerminalRuleCall_2_0 = (RuleCall)cNameAssignment_2.eContents().get(0);
		private final Keyword cReferenceFileKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Assignment cReferenceFileAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cReferenceFileSTRINGTerminalRuleCall_4_0 = (RuleCall)cReferenceFileAssignment_4.eContents().get(0);
		private final Group cGroup_5 = (Group)cGroup.eContents().get(5);
		private final Keyword cCaptionKeyword_5_0 = (Keyword)cGroup_5.eContents().get(0);
		private final Assignment cCaptionAssignment_5_1 = (Assignment)cGroup_5.eContents().get(1);
		private final RuleCall cCaptionSTRINGTerminalRuleCall_5_1_0 = (RuleCall)cCaptionAssignment_5_1.eContents().get(0);
		private final Keyword cSolidusGreaterThanSignKeyword_6 = (Keyword)cGroup.eContents().get(6);
		
		//DTableFromFile doc::DTableFromFile:
		//	'<pictureAsTable'
		//	'name=' name=STRING
		//	'referenceFile=' referenceFile=STRING ('caption=' caption=STRING)?
		//	'/>'
		@Override public ParserRule getRule() { return rule; }
		
		//'<pictureAsTable' 'name=' name=STRING 'referenceFile=' referenceFile=STRING ('caption=' caption=STRING)? '/>'
		public Group getGroup() { return cGroup; }
		
		//'<pictureAsTable'
		public Keyword getPictureAsTableKeyword_0() { return cPictureAsTableKeyword_0; }
		
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
		
		//('caption=' caption=STRING)?
		public Group getGroup_5() { return cGroup_5; }
		
		//'caption='
		public Keyword getCaptionKeyword_5_0() { return cCaptionKeyword_5_0; }
		
		//caption=STRING
		public Assignment getCaptionAssignment_5_1() { return cCaptionAssignment_5_1; }
		
		//STRING
		public RuleCall getCaptionSTRINGTerminalRuleCall_5_1_0() { return cCaptionSTRINGTerminalRuleCall_5_1_0; }
		
		//'/>'
		public Keyword getSolidusGreaterThanSignKeyword_6() { return cSolidusGreaterThanSignKeyword_6; }
	}
	public class DBasicTableElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.micobs.svm.lang.srs.SRS.DBasicTable");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cBasicTableKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cNameKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cNameAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cNameSTRINGTerminalRuleCall_2_0 = (RuleCall)cNameAssignment_2.eContents().get(0);
		private final Group cGroup_3 = (Group)cGroup.eContents().get(3);
		private final Keyword cCaptionKeyword_3_0 = (Keyword)cGroup_3.eContents().get(0);
		private final Assignment cCaptionAssignment_3_1 = (Assignment)cGroup_3.eContents().get(1);
		private final RuleCall cCaptionSTRINGTerminalRuleCall_3_1_0 = (RuleCall)cCaptionAssignment_3_1.eContents().get(0);
		private final Keyword cGreaterThanSignKeyword_4 = (Keyword)cGroup.eContents().get(4);
		private final Assignment cRowsAssignment_5 = (Assignment)cGroup.eContents().get(5);
		private final RuleCall cRowsDRowParserRuleCall_5_0 = (RuleCall)cRowsAssignment_5.eContents().get(0);
		private final Keyword cBasicTableKeyword_6 = (Keyword)cGroup.eContents().get(6);
		
		//DBasicTable doc::DBasicTable:
		//	'<basicTable'
		//	'name=' name=STRING ('caption=' caption=STRING)?
		//	'>'
		//	rows+=DRow+
		//	'</basicTable>'
		@Override public ParserRule getRule() { return rule; }
		
		//'<basicTable' 'name=' name=STRING ('caption=' caption=STRING)? '>' rows+=DRow+ '</basicTable>'
		public Group getGroup() { return cGroup; }
		
		//'<basicTable'
		public Keyword getBasicTableKeyword_0() { return cBasicTableKeyword_0; }
		
		//'name='
		public Keyword getNameKeyword_1() { return cNameKeyword_1; }
		
		//name=STRING
		public Assignment getNameAssignment_2() { return cNameAssignment_2; }
		
		//STRING
		public RuleCall getNameSTRINGTerminalRuleCall_2_0() { return cNameSTRINGTerminalRuleCall_2_0; }
		
		//('caption=' caption=STRING)?
		public Group getGroup_3() { return cGroup_3; }
		
		//'caption='
		public Keyword getCaptionKeyword_3_0() { return cCaptionKeyword_3_0; }
		
		//caption=STRING
		public Assignment getCaptionAssignment_3_1() { return cCaptionAssignment_3_1; }
		
		//STRING
		public RuleCall getCaptionSTRINGTerminalRuleCall_3_1_0() { return cCaptionSTRINGTerminalRuleCall_3_1_0; }
		
		//'>'
		public Keyword getGreaterThanSignKeyword_4() { return cGreaterThanSignKeyword_4; }
		
		//rows+=DRow+
		public Assignment getRowsAssignment_5() { return cRowsAssignment_5; }
		
		//DRow
		public RuleCall getRowsDRowParserRuleCall_5_0() { return cRowsDRowParserRuleCall_5_0; }
		
		//'</basicTable>'
		public Keyword getBasicTableKeyword_6() { return cBasicTableKeyword_6; }
	}
	public class DRowElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.micobs.svm.lang.srs.SRS.DRow");
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
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.micobs.svm.lang.srs.SRS.DColumn");
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
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.micobs.svm.lang.srs.SRS.DCell");
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
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.micobs.svm.lang.srs.SRS.DApplicableDocument");
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
		private final RuleCall cIssueSTRINGTerminalRuleCall_7_1_0 = (RuleCall)cIssueAssignment_7_1.eContents().get(0);
		private final Keyword cRevisionKeyword_7_2 = (Keyword)cGroup_7.eContents().get(2);
		private final Assignment cRevisionAssignment_7_3 = (Assignment)cGroup_7.eContents().get(3);
		private final RuleCall cRevisionSTRINGTerminalRuleCall_7_3_0 = (RuleCall)cRevisionAssignment_7_3.eContents().get(0);
		private final Group cGroup_8 = (Group)cGroup.eContents().get(8);
		private final Keyword cDateKeyword_8_0 = (Keyword)cGroup_8.eContents().get(0);
		private final Assignment cDateAssignment_8_1 = (Assignment)cGroup_8.eContents().get(1);
		private final RuleCall cDateSTRINGTerminalRuleCall_8_1_0 = (RuleCall)cDateAssignment_8_1.eContents().get(0);
		private final Keyword cSolidusGreaterThanSignKeyword_9 = (Keyword)cGroup.eContents().get(9);
		
		//DApplicableDocument doc::DApplicableDocument:
		//	'<ApplicableDocument'
		//	'name=' name=STRING
		//	'title=' title=STRING
		//	'id=' id=STRING ('issue=' issue=STRING
		//	'revision=' revision=STRING)? ('date=' date=STRING)?
		//	'/>'
		@Override public ParserRule getRule() { return rule; }
		
		//'<ApplicableDocument' 'name=' name=STRING 'title=' title=STRING 'id=' id=STRING ('issue=' issue=STRING 'revision='
		//revision=STRING)? ('date=' date=STRING)? '/>'
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
		
		//('issue=' issue=STRING 'revision=' revision=STRING)?
		public Group getGroup_7() { return cGroup_7; }
		
		//'issue='
		public Keyword getIssueKeyword_7_0() { return cIssueKeyword_7_0; }
		
		//issue=STRING
		public Assignment getIssueAssignment_7_1() { return cIssueAssignment_7_1; }
		
		//STRING
		public RuleCall getIssueSTRINGTerminalRuleCall_7_1_0() { return cIssueSTRINGTerminalRuleCall_7_1_0; }
		
		//'revision='
		public Keyword getRevisionKeyword_7_2() { return cRevisionKeyword_7_2; }
		
		//revision=STRING
		public Assignment getRevisionAssignment_7_3() { return cRevisionAssignment_7_3; }
		
		//STRING
		public RuleCall getRevisionSTRINGTerminalRuleCall_7_3_0() { return cRevisionSTRINGTerminalRuleCall_7_3_0; }
		
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
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.micobs.svm.lang.srs.SRS.DReferenceDocument");
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
		private final RuleCall cIssueSTRINGTerminalRuleCall_7_1_0 = (RuleCall)cIssueAssignment_7_1.eContents().get(0);
		private final Keyword cRevisionKeyword_7_2 = (Keyword)cGroup_7.eContents().get(2);
		private final Assignment cRevisionAssignment_7_3 = (Assignment)cGroup_7.eContents().get(3);
		private final RuleCall cRevisionSTRINGTerminalRuleCall_7_3_0 = (RuleCall)cRevisionAssignment_7_3.eContents().get(0);
		private final Group cGroup_8 = (Group)cGroup.eContents().get(8);
		private final Keyword cDateKeyword_8_0 = (Keyword)cGroup_8.eContents().get(0);
		private final Assignment cDateAssignment_8_1 = (Assignment)cGroup_8.eContents().get(1);
		private final RuleCall cDateSTRINGTerminalRuleCall_8_1_0 = (RuleCall)cDateAssignment_8_1.eContents().get(0);
		private final Keyword cSolidusGreaterThanSignKeyword_9 = (Keyword)cGroup.eContents().get(9);
		
		//DReferenceDocument doc::DReferenceDocument:
		//	'<ReferenceDocument'
		//	'name=' name=STRING
		//	'title=' title=STRING
		//	'id=' id=STRING ('issue=' issue=STRING
		//	'revision=' revision=STRING)? ('date=' date=STRING)?
		//	'/>'
		@Override public ParserRule getRule() { return rule; }
		
		//'<ReferenceDocument' 'name=' name=STRING 'title=' title=STRING 'id=' id=STRING ('issue=' issue=STRING 'revision='
		//revision=STRING)? ('date=' date=STRING)? '/>'
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
		
		//('issue=' issue=STRING 'revision=' revision=STRING)?
		public Group getGroup_7() { return cGroup_7; }
		
		//'issue='
		public Keyword getIssueKeyword_7_0() { return cIssueKeyword_7_0; }
		
		//issue=STRING
		public Assignment getIssueAssignment_7_1() { return cIssueAssignment_7_1; }
		
		//STRING
		public RuleCall getIssueSTRINGTerminalRuleCall_7_1_0() { return cIssueSTRINGTerminalRuleCall_7_1_0; }
		
		//'revision='
		public Keyword getRevisionKeyword_7_2() { return cRevisionKeyword_7_2; }
		
		//revision=STRING
		public Assignment getRevisionAssignment_7_3() { return cRevisionAssignment_7_3; }
		
		//STRING
		public RuleCall getRevisionSTRINGTerminalRuleCall_7_3_0() { return cRevisionSTRINGTerminalRuleCall_7_3_0; }
		
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
	public class VSRSFixedSectionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.micobs.svm.lang.srs.SRS.VSRSFixedSection");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cBodyAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cBodyDBodyParserRuleCall_0_0 = (RuleCall)cBodyAssignment_0.eContents().get(0);
		private final Assignment cSrsInstatiableSubsectionsAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cSrsInstatiableSubsectionsVSRSInstantiableSectionParserRuleCall_1_0 = (RuleCall)cSrsInstatiableSubsectionsAssignment_1.eContents().get(0);
		
		//VSRSFixedSection:
		//	body=DBody
		//	srsInstatiableSubsections+=VSRSInstantiableSection*;
		@Override public ParserRule getRule() { return rule; }
		
		//body=DBody srsInstatiableSubsections+=VSRSInstantiableSection*
		public Group getGroup() { return cGroup; }
		
		//body=DBody
		public Assignment getBodyAssignment_0() { return cBodyAssignment_0; }
		
		//DBody
		public RuleCall getBodyDBodyParserRuleCall_0_0() { return cBodyDBodyParserRuleCall_0_0; }
		
		//srsInstatiableSubsections+=VSRSInstantiableSection*
		public Assignment getSrsInstatiableSubsectionsAssignment_1() { return cSrsInstatiableSubsectionsAssignment_1; }
		
		//VSRSInstantiableSection
		public RuleCall getSrsInstatiableSubsectionsVSRSInstantiableSectionParserRuleCall_1_0() { return cSrsInstatiableSubsectionsVSRSInstantiableSectionParserRuleCall_1_0; }
	}
	public class VSRSInstantiableSectionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.micobs.svm.lang.srs.SRS.VSRSInstantiableSection");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cSubsectionKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cNameKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cNameAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cNameSTRINGTerminalRuleCall_2_0 = (RuleCall)cNameAssignment_2.eContents().get(0);
		private final Keyword cGreaterThanSignKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Assignment cBodyAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cBodyDBodyParserRuleCall_4_0 = (RuleCall)cBodyAssignment_4.eContents().get(0);
		private final Keyword cSubsectionKeyword_5 = (Keyword)cGroup.eContents().get(5);
		
		//VSRSInstantiableSection:
		//	'<subsection'
		//	'name=' name=STRING
		//	'>'
		//	body=DBody
		//	'</subsection>';
		@Override public ParserRule getRule() { return rule; }
		
		//'<subsection' 'name=' name=STRING '>' body=DBody '</subsection>'
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
		
		//body=DBody
		public Assignment getBodyAssignment_4() { return cBodyAssignment_4; }
		
		//DBody
		public RuleCall getBodyDBodyParserRuleCall_4_0() { return cBodyDBodyParserRuleCall_4_0; }
		
		//'</subsection>'
		public Keyword getSubsectionKeyword_5() { return cSubsectionKeyword_5; }
	}
	public class VSRSIntroductionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.micobs.svm.lang.srs.SRS.VSRSIntroduction");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cIntroductionKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cSrsInstatiableSubsectionsAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cSrsInstatiableSubsectionsVSRSInstantiableSectionParserRuleCall_1_0 = (RuleCall)cSrsInstatiableSubsectionsAssignment_1.eContents().get(0);
		private final Keyword cIntroductionKeyword_2 = (Keyword)cGroup.eContents().get(2);
		
		//VSRSIntroduction:
		//	'<Introduction>'
		//	srsInstatiableSubsections+=VSRSInstantiableSection+
		//	'</Introduction>';
		@Override public ParserRule getRule() { return rule; }
		
		//'<Introduction>' srsInstatiableSubsections+=VSRSInstantiableSection+ '</Introduction>'
		public Group getGroup() { return cGroup; }
		
		//'<Introduction>'
		public Keyword getIntroductionKeyword_0() { return cIntroductionKeyword_0; }
		
		//srsInstatiableSubsections+=VSRSInstantiableSection+
		public Assignment getSrsInstatiableSubsectionsAssignment_1() { return cSrsInstatiableSubsectionsAssignment_1; }
		
		//VSRSInstantiableSection
		public RuleCall getSrsInstatiableSubsectionsVSRSInstantiableSectionParserRuleCall_1_0() { return cSrsInstatiableSubsectionsVSRSInstantiableSectionParserRuleCall_1_0; }
		
		//'</Introduction>'
		public Keyword getIntroductionKeyword_2() { return cIntroductionKeyword_2; }
	}
	public class VSRSApplicableDocumentsElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.micobs.svm.lang.srs.SRS.VSRSApplicableDocuments");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cVSRSApplicableDocumentsAction_0 = (Action)cGroup.eContents().get(0);
		private final Keyword cApplicableDocumentsKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cApplicableDocumentsAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cApplicableDocumentsDApplicableDocumentParserRuleCall_2_0 = (RuleCall)cApplicableDocumentsAssignment_2.eContents().get(0);
		private final Keyword cApplicableDocumentsKeyword_3 = (Keyword)cGroup.eContents().get(3);
		
		//VSRSApplicableDocuments:
		//	{VSRSApplicableDocuments}
		//	'<ApplicableDocuments>'
		//	applicableDocuments+=DApplicableDocument*
		//	'</ApplicableDocuments>';
		@Override public ParserRule getRule() { return rule; }
		
		//{VSRSApplicableDocuments} '<ApplicableDocuments>' applicableDocuments+=DApplicableDocument* '</ApplicableDocuments>'
		public Group getGroup() { return cGroup; }
		
		//{VSRSApplicableDocuments}
		public Action getVSRSApplicableDocumentsAction_0() { return cVSRSApplicableDocumentsAction_0; }
		
		//'<ApplicableDocuments>'
		public Keyword getApplicableDocumentsKeyword_1() { return cApplicableDocumentsKeyword_1; }
		
		//applicableDocuments+=DApplicableDocument*
		public Assignment getApplicableDocumentsAssignment_2() { return cApplicableDocumentsAssignment_2; }
		
		//DApplicableDocument
		public RuleCall getApplicableDocumentsDApplicableDocumentParserRuleCall_2_0() { return cApplicableDocumentsDApplicableDocumentParserRuleCall_2_0; }
		
		//'</ApplicableDocuments>'
		public Keyword getApplicableDocumentsKeyword_3() { return cApplicableDocumentsKeyword_3; }
	}
	public class VSRSReferenceDocumentsElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.micobs.svm.lang.srs.SRS.VSRSReferenceDocuments");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cVSRSReferenceDocumentsAction_0 = (Action)cGroup.eContents().get(0);
		private final Keyword cReferenceDocumentsKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cReferenceDocumentsAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cReferenceDocumentsDReferenceDocumentParserRuleCall_2_0 = (RuleCall)cReferenceDocumentsAssignment_2.eContents().get(0);
		private final Keyword cReferenceDocumentsKeyword_3 = (Keyword)cGroup.eContents().get(3);
		
		//VSRSReferenceDocuments:
		//	{VSRSReferenceDocuments}
		//	'<ReferenceDocuments>'
		//	referenceDocuments+=DReferenceDocument*
		//	'</ReferenceDocuments>';
		@Override public ParserRule getRule() { return rule; }
		
		//{VSRSReferenceDocuments} '<ReferenceDocuments>' referenceDocuments+=DReferenceDocument* '</ReferenceDocuments>'
		public Group getGroup() { return cGroup; }
		
		//{VSRSReferenceDocuments}
		public Action getVSRSReferenceDocumentsAction_0() { return cVSRSReferenceDocumentsAction_0; }
		
		//'<ReferenceDocuments>'
		public Keyword getReferenceDocumentsKeyword_1() { return cReferenceDocumentsKeyword_1; }
		
		//referenceDocuments+=DReferenceDocument*
		public Assignment getReferenceDocumentsAssignment_2() { return cReferenceDocumentsAssignment_2; }
		
		//DReferenceDocument
		public RuleCall getReferenceDocumentsDReferenceDocumentParserRuleCall_2_0() { return cReferenceDocumentsDReferenceDocumentParserRuleCall_2_0; }
		
		//'</ReferenceDocuments>'
		public Keyword getReferenceDocumentsKeyword_3() { return cReferenceDocumentsKeyword_3; }
	}
	public class VSRSTermsDefinitionsAbbreviationsElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.micobs.svm.lang.srs.SRS.VSRSTermsDefinitionsAbbreviations");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cVSRSTermsDefinitionsAbbreviationsAction_0 = (Action)cGroup.eContents().get(0);
		private final Keyword cTermsDefinitionsAbbreviationsKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cTermsAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cTermsVSRSTermParserRuleCall_2_0 = (RuleCall)cTermsAssignment_2.eContents().get(0);
		private final Assignment cDefinitionsAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cDefinitionsVSRSDefinitionParserRuleCall_3_0 = (RuleCall)cDefinitionsAssignment_3.eContents().get(0);
		private final Assignment cAbbreviationsAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cAbbreviationsVSRSAbbreviationParserRuleCall_4_0 = (RuleCall)cAbbreviationsAssignment_4.eContents().get(0);
		private final Keyword cTermsDefinitionsAbbreviationsKeyword_5 = (Keyword)cGroup.eContents().get(5);
		
		//VSRSTermsDefinitionsAbbreviations:
		//	{VSRSTermsDefinitionsAbbreviations}
		//	'<TermsDefinitionsAbbreviations>'
		//	terms+=VSRSTerm*
		//	definitions+=VSRSDefinition*
		//	abbreviations+=VSRSAbbreviation*
		//	'</TermsDefinitionsAbbreviations>';
		@Override public ParserRule getRule() { return rule; }
		
		//{VSRSTermsDefinitionsAbbreviations} '<TermsDefinitionsAbbreviations>' terms+=VSRSTerm* definitions+=VSRSDefinition*
		//abbreviations+=VSRSAbbreviation* '</TermsDefinitionsAbbreviations>'
		public Group getGroup() { return cGroup; }
		
		//{VSRSTermsDefinitionsAbbreviations}
		public Action getVSRSTermsDefinitionsAbbreviationsAction_0() { return cVSRSTermsDefinitionsAbbreviationsAction_0; }
		
		//'<TermsDefinitionsAbbreviations>'
		public Keyword getTermsDefinitionsAbbreviationsKeyword_1() { return cTermsDefinitionsAbbreviationsKeyword_1; }
		
		//terms+=VSRSTerm*
		public Assignment getTermsAssignment_2() { return cTermsAssignment_2; }
		
		//VSRSTerm
		public RuleCall getTermsVSRSTermParserRuleCall_2_0() { return cTermsVSRSTermParserRuleCall_2_0; }
		
		//definitions+=VSRSDefinition*
		public Assignment getDefinitionsAssignment_3() { return cDefinitionsAssignment_3; }
		
		//VSRSDefinition
		public RuleCall getDefinitionsVSRSDefinitionParserRuleCall_3_0() { return cDefinitionsVSRSDefinitionParserRuleCall_3_0; }
		
		//abbreviations+=VSRSAbbreviation*
		public Assignment getAbbreviationsAssignment_4() { return cAbbreviationsAssignment_4; }
		
		//VSRSAbbreviation
		public RuleCall getAbbreviationsVSRSAbbreviationParserRuleCall_4_0() { return cAbbreviationsVSRSAbbreviationParserRuleCall_4_0; }
		
		//'</TermsDefinitionsAbbreviations>'
		public Keyword getTermsDefinitionsAbbreviationsKeyword_5() { return cTermsDefinitionsAbbreviationsKeyword_5; }
	}
	public class VSRSSoftwareOverviewElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.micobs.svm.lang.srs.SRS.VSRSSoftwareOverview");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cSoftwareOverviewKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cFunctionPurposeKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cFunctionPurposeAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cFunctionPurposeVSRSFixedSectionParserRuleCall_2_0 = (RuleCall)cFunctionPurposeAssignment_2.eContents().get(0);
		private final Keyword cFunctionPurposeKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Keyword cEnvironmentalConsiderationKeyword_4 = (Keyword)cGroup.eContents().get(4);
		private final Assignment cEnvironmentalConsiderationAssignment_5 = (Assignment)cGroup.eContents().get(5);
		private final RuleCall cEnvironmentalConsiderationVSRSFixedSectionParserRuleCall_5_0 = (RuleCall)cEnvironmentalConsiderationAssignment_5.eContents().get(0);
		private final Keyword cEnvironmentalConsiderationKeyword_6 = (Keyword)cGroup.eContents().get(6);
		private final Keyword cRelationOtherSystemsKeyword_7 = (Keyword)cGroup.eContents().get(7);
		private final Assignment cRelationOtherSystemsAssignment_8 = (Assignment)cGroup.eContents().get(8);
		private final RuleCall cRelationOtherSystemsVSRSFixedSectionParserRuleCall_8_0 = (RuleCall)cRelationOtherSystemsAssignment_8.eContents().get(0);
		private final Keyword cRelationOtherSystemsKeyword_9 = (Keyword)cGroup.eContents().get(9);
		private final Keyword cConstraintsKeyword_10 = (Keyword)cGroup.eContents().get(10);
		private final Assignment cConstraintsAssignment_11 = (Assignment)cGroup.eContents().get(11);
		private final RuleCall cConstraintsVSRSFixedSectionParserRuleCall_11_0 = (RuleCall)cConstraintsAssignment_11.eContents().get(0);
		private final Keyword cConstraintsKeyword_12 = (Keyword)cGroup.eContents().get(12);
		private final Keyword cSoftwareOverviewKeyword_13 = (Keyword)cGroup.eContents().get(13);
		
		//VSRSSoftwareOverview:
		//	'<SoftwareOverview>'
		//	'<functionPurpose>' functionPurpose=VSRSFixedSection '</functionPurpose>'
		//	'<environmentalConsideration>' environmentalConsideration=VSRSFixedSection '</environmentalConsideration>'
		//	'<relationOtherSystems>' relationOtherSystems=VSRSFixedSection '</relationOtherSystems>'
		//	'<constraints>' constraints=VSRSFixedSection '</constraints>'
		//	'</SoftwareOverview>';
		@Override public ParserRule getRule() { return rule; }
		
		//'<SoftwareOverview>' '<functionPurpose>' functionPurpose=VSRSFixedSection '</functionPurpose>'
		//'<environmentalConsideration>' environmentalConsideration=VSRSFixedSection '</environmentalConsideration>'
		//'<relationOtherSystems>' relationOtherSystems=VSRSFixedSection '</relationOtherSystems>' '<constraints>'
		//constraints=VSRSFixedSection '</constraints>' '</SoftwareOverview>'
		public Group getGroup() { return cGroup; }
		
		//'<SoftwareOverview>'
		public Keyword getSoftwareOverviewKeyword_0() { return cSoftwareOverviewKeyword_0; }
		
		//'<functionPurpose>'
		public Keyword getFunctionPurposeKeyword_1() { return cFunctionPurposeKeyword_1; }
		
		//functionPurpose=VSRSFixedSection
		public Assignment getFunctionPurposeAssignment_2() { return cFunctionPurposeAssignment_2; }
		
		//VSRSFixedSection
		public RuleCall getFunctionPurposeVSRSFixedSectionParserRuleCall_2_0() { return cFunctionPurposeVSRSFixedSectionParserRuleCall_2_0; }
		
		//'</functionPurpose>'
		public Keyword getFunctionPurposeKeyword_3() { return cFunctionPurposeKeyword_3; }
		
		//'<environmentalConsideration>'
		public Keyword getEnvironmentalConsiderationKeyword_4() { return cEnvironmentalConsiderationKeyword_4; }
		
		//environmentalConsideration=VSRSFixedSection
		public Assignment getEnvironmentalConsiderationAssignment_5() { return cEnvironmentalConsiderationAssignment_5; }
		
		//VSRSFixedSection
		public RuleCall getEnvironmentalConsiderationVSRSFixedSectionParserRuleCall_5_0() { return cEnvironmentalConsiderationVSRSFixedSectionParserRuleCall_5_0; }
		
		//'</environmentalConsideration>'
		public Keyword getEnvironmentalConsiderationKeyword_6() { return cEnvironmentalConsiderationKeyword_6; }
		
		//'<relationOtherSystems>'
		public Keyword getRelationOtherSystemsKeyword_7() { return cRelationOtherSystemsKeyword_7; }
		
		//relationOtherSystems=VSRSFixedSection
		public Assignment getRelationOtherSystemsAssignment_8() { return cRelationOtherSystemsAssignment_8; }
		
		//VSRSFixedSection
		public RuleCall getRelationOtherSystemsVSRSFixedSectionParserRuleCall_8_0() { return cRelationOtherSystemsVSRSFixedSectionParserRuleCall_8_0; }
		
		//'</relationOtherSystems>'
		public Keyword getRelationOtherSystemsKeyword_9() { return cRelationOtherSystemsKeyword_9; }
		
		//'<constraints>'
		public Keyword getConstraintsKeyword_10() { return cConstraintsKeyword_10; }
		
		//constraints=VSRSFixedSection
		public Assignment getConstraintsAssignment_11() { return cConstraintsAssignment_11; }
		
		//VSRSFixedSection
		public RuleCall getConstraintsVSRSFixedSectionParserRuleCall_11_0() { return cConstraintsVSRSFixedSectionParserRuleCall_11_0; }
		
		//'</constraints>'
		public Keyword getConstraintsKeyword_12() { return cConstraintsKeyword_12; }
		
		//'</SoftwareOverview>'
		public Keyword getSoftwareOverviewKeyword_13() { return cSoftwareOverviewKeyword_13; }
	}
	public class VSRSRequirementsElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.micobs.svm.lang.srs.SRS.VSRSRequirements");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cRequirementsKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cSectionDescriptionAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cSectionDescriptionDBodyParserRuleCall_1_0 = (RuleCall)cSectionDescriptionAssignment_1.eContents().get(0);
		private final Assignment cGeneralAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cGeneralVSRSGeneralRequirementsParserRuleCall_2_0 = (RuleCall)cGeneralAssignment_2.eContents().get(0);
		private final Assignment cFunctionalAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cFunctionalVSRSFunctionalRequirementsParserRuleCall_3_0 = (RuleCall)cFunctionalAssignment_3.eContents().get(0);
		private final Assignment cPerformanceAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cPerformanceVSRSPerformanceRequirementsParserRuleCall_4_0 = (RuleCall)cPerformanceAssignment_4.eContents().get(0);
		private final Assignment cInterfaceAssignment_5 = (Assignment)cGroup.eContents().get(5);
		private final RuleCall cInterfaceVSRSInterfaceRequirementsParserRuleCall_5_0 = (RuleCall)cInterfaceAssignment_5.eContents().get(0);
		private final Assignment cOperationalAssignment_6 = (Assignment)cGroup.eContents().get(6);
		private final RuleCall cOperationalVSRSOperationalRequirementsParserRuleCall_6_0 = (RuleCall)cOperationalAssignment_6.eContents().get(0);
		private final Assignment cResourcesAssignment_7 = (Assignment)cGroup.eContents().get(7);
		private final RuleCall cResourcesVSRSResourcesRequirementsParserRuleCall_7_0 = (RuleCall)cResourcesAssignment_7.eContents().get(0);
		private final Assignment cDesignAssignment_8 = (Assignment)cGroup.eContents().get(8);
		private final RuleCall cDesignVSRSDesignRequirementsParserRuleCall_8_0 = (RuleCall)cDesignAssignment_8.eContents().get(0);
		private final Assignment cSecurityPrivacyAssignment_9 = (Assignment)cGroup.eContents().get(9);
		private final RuleCall cSecurityPrivacyVSRSSecurityPrivacyRequirementsParserRuleCall_9_0 = (RuleCall)cSecurityPrivacyAssignment_9.eContents().get(0);
		private final Assignment cPortabilityAssignment_10 = (Assignment)cGroup.eContents().get(10);
		private final RuleCall cPortabilityVSRSPortabilityRequirementsParserRuleCall_10_0 = (RuleCall)cPortabilityAssignment_10.eContents().get(0);
		private final Assignment cSwQualityAssignment_11 = (Assignment)cGroup.eContents().get(11);
		private final RuleCall cSwQualityVSRSSWQualityRequirementsParserRuleCall_11_0 = (RuleCall)cSwQualityAssignment_11.eContents().get(0);
		private final Assignment cSwReliabiltyAssignment_12 = (Assignment)cGroup.eContents().get(12);
		private final RuleCall cSwReliabiltyVSRSSWReliabiltyRequirementsParserRuleCall_12_0 = (RuleCall)cSwReliabiltyAssignment_12.eContents().get(0);
		private final Assignment cSwMaintainabilityAssignment_13 = (Assignment)cGroup.eContents().get(13);
		private final RuleCall cSwMaintainabilityVSRSSWMaintainabilityRequirementsParserRuleCall_13_0 = (RuleCall)cSwMaintainabilityAssignment_13.eContents().get(0);
		private final Assignment cSwSafetyAssignment_14 = (Assignment)cGroup.eContents().get(14);
		private final RuleCall cSwSafetyVSRSSWSafetyRequirementsParserRuleCall_14_0 = (RuleCall)cSwSafetyAssignment_14.eContents().get(0);
		private final Assignment cSwConfigurationDeliveryAssignment_15 = (Assignment)cGroup.eContents().get(15);
		private final RuleCall cSwConfigurationDeliveryVSRSSWConfigurationDeliveryRequirementsParserRuleCall_15_0 = (RuleCall)cSwConfigurationDeliveryAssignment_15.eContents().get(0);
		private final Assignment cDataDefinitionDBAssignment_16 = (Assignment)cGroup.eContents().get(16);
		private final RuleCall cDataDefinitionDBVSRSDataDefinitionDBRequirementsParserRuleCall_16_0 = (RuleCall)cDataDefinitionDBAssignment_16.eContents().get(0);
		private final Assignment cHumanFactorsAssignment_17 = (Assignment)cGroup.eContents().get(17);
		private final RuleCall cHumanFactorsVSRSHumanFactorsRequirementsParserRuleCall_17_0 = (RuleCall)cHumanFactorsAssignment_17.eContents().get(0);
		private final Assignment cAdaptationInstallationAssignment_18 = (Assignment)cGroup.eContents().get(18);
		private final RuleCall cAdaptationInstallationVSRSAdaptationInstallationRequirementsParserRuleCall_18_0 = (RuleCall)cAdaptationInstallationAssignment_18.eContents().get(0);
		private final Keyword cRequirementsKeyword_19 = (Keyword)cGroup.eContents().get(19);
		
		//VSRSRequirements:
		//	'<Requirements>'
		//	sectionDescription=DBody?
		//	general=VSRSGeneralRequirements
		//	functional=VSRSFunctionalRequirements
		//	performance=VSRSPerformanceRequirements
		//	interface=VSRSInterfaceRequirements
		//	operational=VSRSOperationalRequirements
		//	resources=VSRSResourcesRequirements
		//	design=VSRSDesignRequirements
		//	securityPrivacy=VSRSSecurityPrivacyRequirements
		//	portability=VSRSPortabilityRequirements
		//	swQuality=VSRSSWQualityRequirements
		//	swReliabilty=VSRSSWReliabiltyRequirements
		//	swMaintainability=VSRSSWMaintainabilityRequirements
		//	swSafety=VSRSSWSafetyRequirements
		//	swConfigurationDelivery=VSRSSWConfigurationDeliveryRequirements
		//	dataDefinitionDB=VSRSDataDefinitionDBRequirements
		//	humanFactors=VSRSHumanFactorsRequirements
		//	adaptationInstallation=VSRSAdaptationInstallationRequirements
		//	'</Requirements>';
		@Override public ParserRule getRule() { return rule; }
		
		//'<Requirements>' sectionDescription=DBody? general=VSRSGeneralRequirements functional=VSRSFunctionalRequirements
		//performance=VSRSPerformanceRequirements interface=VSRSInterfaceRequirements operational=VSRSOperationalRequirements
		//resources=VSRSResourcesRequirements design=VSRSDesignRequirements securityPrivacy=VSRSSecurityPrivacyRequirements
		//portability=VSRSPortabilityRequirements swQuality=VSRSSWQualityRequirements swReliabilty=VSRSSWReliabiltyRequirements
		//swMaintainability=VSRSSWMaintainabilityRequirements swSafety=VSRSSWSafetyRequirements
		//swConfigurationDelivery=VSRSSWConfigurationDeliveryRequirements dataDefinitionDB=VSRSDataDefinitionDBRequirements
		//humanFactors=VSRSHumanFactorsRequirements adaptationInstallation=VSRSAdaptationInstallationRequirements
		//'</Requirements>'
		public Group getGroup() { return cGroup; }
		
		//'<Requirements>'
		public Keyword getRequirementsKeyword_0() { return cRequirementsKeyword_0; }
		
		//sectionDescription=DBody?
		public Assignment getSectionDescriptionAssignment_1() { return cSectionDescriptionAssignment_1; }
		
		//DBody
		public RuleCall getSectionDescriptionDBodyParserRuleCall_1_0() { return cSectionDescriptionDBodyParserRuleCall_1_0; }
		
		//general=VSRSGeneralRequirements
		public Assignment getGeneralAssignment_2() { return cGeneralAssignment_2; }
		
		//VSRSGeneralRequirements
		public RuleCall getGeneralVSRSGeneralRequirementsParserRuleCall_2_0() { return cGeneralVSRSGeneralRequirementsParserRuleCall_2_0; }
		
		//functional=VSRSFunctionalRequirements
		public Assignment getFunctionalAssignment_3() { return cFunctionalAssignment_3; }
		
		//VSRSFunctionalRequirements
		public RuleCall getFunctionalVSRSFunctionalRequirementsParserRuleCall_3_0() { return cFunctionalVSRSFunctionalRequirementsParserRuleCall_3_0; }
		
		//performance=VSRSPerformanceRequirements
		public Assignment getPerformanceAssignment_4() { return cPerformanceAssignment_4; }
		
		//VSRSPerformanceRequirements
		public RuleCall getPerformanceVSRSPerformanceRequirementsParserRuleCall_4_0() { return cPerformanceVSRSPerformanceRequirementsParserRuleCall_4_0; }
		
		//interface=VSRSInterfaceRequirements
		public Assignment getInterfaceAssignment_5() { return cInterfaceAssignment_5; }
		
		//VSRSInterfaceRequirements
		public RuleCall getInterfaceVSRSInterfaceRequirementsParserRuleCall_5_0() { return cInterfaceVSRSInterfaceRequirementsParserRuleCall_5_0; }
		
		//operational=VSRSOperationalRequirements
		public Assignment getOperationalAssignment_6() { return cOperationalAssignment_6; }
		
		//VSRSOperationalRequirements
		public RuleCall getOperationalVSRSOperationalRequirementsParserRuleCall_6_0() { return cOperationalVSRSOperationalRequirementsParserRuleCall_6_0; }
		
		//resources=VSRSResourcesRequirements
		public Assignment getResourcesAssignment_7() { return cResourcesAssignment_7; }
		
		//VSRSResourcesRequirements
		public RuleCall getResourcesVSRSResourcesRequirementsParserRuleCall_7_0() { return cResourcesVSRSResourcesRequirementsParserRuleCall_7_0; }
		
		//design=VSRSDesignRequirements
		public Assignment getDesignAssignment_8() { return cDesignAssignment_8; }
		
		//VSRSDesignRequirements
		public RuleCall getDesignVSRSDesignRequirementsParserRuleCall_8_0() { return cDesignVSRSDesignRequirementsParserRuleCall_8_0; }
		
		//securityPrivacy=VSRSSecurityPrivacyRequirements
		public Assignment getSecurityPrivacyAssignment_9() { return cSecurityPrivacyAssignment_9; }
		
		//VSRSSecurityPrivacyRequirements
		public RuleCall getSecurityPrivacyVSRSSecurityPrivacyRequirementsParserRuleCall_9_0() { return cSecurityPrivacyVSRSSecurityPrivacyRequirementsParserRuleCall_9_0; }
		
		//portability=VSRSPortabilityRequirements
		public Assignment getPortabilityAssignment_10() { return cPortabilityAssignment_10; }
		
		//VSRSPortabilityRequirements
		public RuleCall getPortabilityVSRSPortabilityRequirementsParserRuleCall_10_0() { return cPortabilityVSRSPortabilityRequirementsParserRuleCall_10_0; }
		
		//swQuality=VSRSSWQualityRequirements
		public Assignment getSwQualityAssignment_11() { return cSwQualityAssignment_11; }
		
		//VSRSSWQualityRequirements
		public RuleCall getSwQualityVSRSSWQualityRequirementsParserRuleCall_11_0() { return cSwQualityVSRSSWQualityRequirementsParserRuleCall_11_0; }
		
		//swReliabilty=VSRSSWReliabiltyRequirements
		public Assignment getSwReliabiltyAssignment_12() { return cSwReliabiltyAssignment_12; }
		
		//VSRSSWReliabiltyRequirements
		public RuleCall getSwReliabiltyVSRSSWReliabiltyRequirementsParserRuleCall_12_0() { return cSwReliabiltyVSRSSWReliabiltyRequirementsParserRuleCall_12_0; }
		
		//swMaintainability=VSRSSWMaintainabilityRequirements
		public Assignment getSwMaintainabilityAssignment_13() { return cSwMaintainabilityAssignment_13; }
		
		//VSRSSWMaintainabilityRequirements
		public RuleCall getSwMaintainabilityVSRSSWMaintainabilityRequirementsParserRuleCall_13_0() { return cSwMaintainabilityVSRSSWMaintainabilityRequirementsParserRuleCall_13_0; }
		
		//swSafety=VSRSSWSafetyRequirements
		public Assignment getSwSafetyAssignment_14() { return cSwSafetyAssignment_14; }
		
		//VSRSSWSafetyRequirements
		public RuleCall getSwSafetyVSRSSWSafetyRequirementsParserRuleCall_14_0() { return cSwSafetyVSRSSWSafetyRequirementsParserRuleCall_14_0; }
		
		//swConfigurationDelivery=VSRSSWConfigurationDeliveryRequirements
		public Assignment getSwConfigurationDeliveryAssignment_15() { return cSwConfigurationDeliveryAssignment_15; }
		
		//VSRSSWConfigurationDeliveryRequirements
		public RuleCall getSwConfigurationDeliveryVSRSSWConfigurationDeliveryRequirementsParserRuleCall_15_0() { return cSwConfigurationDeliveryVSRSSWConfigurationDeliveryRequirementsParserRuleCall_15_0; }
		
		//dataDefinitionDB=VSRSDataDefinitionDBRequirements
		public Assignment getDataDefinitionDBAssignment_16() { return cDataDefinitionDBAssignment_16; }
		
		//VSRSDataDefinitionDBRequirements
		public RuleCall getDataDefinitionDBVSRSDataDefinitionDBRequirementsParserRuleCall_16_0() { return cDataDefinitionDBVSRSDataDefinitionDBRequirementsParserRuleCall_16_0; }
		
		//humanFactors=VSRSHumanFactorsRequirements
		public Assignment getHumanFactorsAssignment_17() { return cHumanFactorsAssignment_17; }
		
		//VSRSHumanFactorsRequirements
		public RuleCall getHumanFactorsVSRSHumanFactorsRequirementsParserRuleCall_17_0() { return cHumanFactorsVSRSHumanFactorsRequirementsParserRuleCall_17_0; }
		
		//adaptationInstallation=VSRSAdaptationInstallationRequirements
		public Assignment getAdaptationInstallationAssignment_18() { return cAdaptationInstallationAssignment_18; }
		
		//VSRSAdaptationInstallationRequirements
		public RuleCall getAdaptationInstallationVSRSAdaptationInstallationRequirementsParserRuleCall_18_0() { return cAdaptationInstallationVSRSAdaptationInstallationRequirementsParserRuleCall_18_0; }
		
		//'</Requirements>'
		public Keyword getRequirementsKeyword_19() { return cRequirementsKeyword_19; }
	}
	public class VSRSTraceabiltyElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.micobs.svm.lang.srs.SRS.VSRSTraceabilty");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cTraceabiltyKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cSectionDescriptionAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cSectionDescriptionDBodyParserRuleCall_1_0 = (RuleCall)cSectionDescriptionAssignment_1.eContents().get(0);
		private final Keyword cTraceabiltyKeyword_2 = (Keyword)cGroup.eContents().get(2);
		
		//VSRSTraceabilty:
		//	'<Traceabilty>'
		//	sectionDescription=DBody
		//	'</Traceabilty>';
		@Override public ParserRule getRule() { return rule; }
		
		//'<Traceabilty>' sectionDescription=DBody '</Traceabilty>'
		public Group getGroup() { return cGroup; }
		
		//'<Traceabilty>'
		public Keyword getTraceabiltyKeyword_0() { return cTraceabiltyKeyword_0; }
		
		//sectionDescription=DBody
		public Assignment getSectionDescriptionAssignment_1() { return cSectionDescriptionAssignment_1; }
		
		//DBody
		public RuleCall getSectionDescriptionDBodyParserRuleCall_1_0() { return cSectionDescriptionDBodyParserRuleCall_1_0; }
		
		//'</Traceabilty>'
		public Keyword getTraceabiltyKeyword_2() { return cTraceabiltyKeyword_2; }
	}
	public class VSRSLogicalModelsElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.micobs.svm.lang.srs.SRS.VSRSLogicalModels");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cVSRSLogicalModelsAction_0 = (Action)cGroup.eContents().get(0);
		private final Keyword cLogicalModelsKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cLogicalModelsAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cLogicalModelsVSRSLogicalModelParserRuleCall_2_0 = (RuleCall)cLogicalModelsAssignment_2.eContents().get(0);
		private final Keyword cLogicalModelsKeyword_3 = (Keyword)cGroup.eContents().get(3);
		
		//VSRSLogicalModels:
		//	{VSRSLogicalModels}
		//	'<LogicalModels>'
		//	logicalModels+=VSRSLogicalModel*
		//	'</LogicalModels>';
		@Override public ParserRule getRule() { return rule; }
		
		//{VSRSLogicalModels} '<LogicalModels>' logicalModels+=VSRSLogicalModel* '</LogicalModels>'
		public Group getGroup() { return cGroup; }
		
		//{VSRSLogicalModels}
		public Action getVSRSLogicalModelsAction_0() { return cVSRSLogicalModelsAction_0; }
		
		//'<LogicalModels>'
		public Keyword getLogicalModelsKeyword_1() { return cLogicalModelsKeyword_1; }
		
		//logicalModels+=VSRSLogicalModel*
		public Assignment getLogicalModelsAssignment_2() { return cLogicalModelsAssignment_2; }
		
		//VSRSLogicalModel
		public RuleCall getLogicalModelsVSRSLogicalModelParserRuleCall_2_0() { return cLogicalModelsVSRSLogicalModelParserRuleCall_2_0; }
		
		//'</LogicalModels>'
		public Keyword getLogicalModelsKeyword_3() { return cLogicalModelsKeyword_3; }
	}
	public class VSRSTermElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.micobs.svm.lang.srs.SRS.VSRSTerm");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cTermKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cNameKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cNameAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cNameSTRINGTerminalRuleCall_2_0 = (RuleCall)cNameAssignment_2.eContents().get(0);
		private final Keyword cGreaterThanSignKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Assignment cDescriptionAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cDescriptionDRunParserRuleCall_4_0 = (RuleCall)cDescriptionAssignment_4.eContents().get(0);
		private final Keyword cTermKeyword_5 = (Keyword)cGroup.eContents().get(5);
		
		//VSRSTerm:
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
	public class VSRSDefinitionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.micobs.svm.lang.srs.SRS.VSRSDefinition");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cDefinitionKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cNameKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cNameAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cNameSTRINGTerminalRuleCall_2_0 = (RuleCall)cNameAssignment_2.eContents().get(0);
		private final Keyword cGreaterThanSignKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Assignment cDescriptionAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cDescriptionDRunParserRuleCall_4_0 = (RuleCall)cDescriptionAssignment_4.eContents().get(0);
		private final Keyword cDefinitionKeyword_5 = (Keyword)cGroup.eContents().get(5);
		
		//VSRSDefinition:
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
	public class VSRSAbbreviationElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.micobs.svm.lang.srs.SRS.VSRSAbbreviation");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cAbbreviationKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cNameKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cNameAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cNameSTRINGTerminalRuleCall_2_0 = (RuleCall)cNameAssignment_2.eContents().get(0);
		private final Keyword cGreaterThanSignKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Assignment cDescriptionAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cDescriptionDRunParserRuleCall_4_0 = (RuleCall)cDescriptionAssignment_4.eContents().get(0);
		private final Keyword cAbbreviationKeyword_5 = (Keyword)cGroup.eContents().get(5);
		
		//VSRSAbbreviation:
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
	public class VSRSInstantiableRequirementSectionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.micobs.svm.lang.srs.SRS.VSRSInstantiableRequirementSection");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cSubsectionKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cNameKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cNameAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cNameSTRINGTerminalRuleCall_2_0 = (RuleCall)cNameAssignment_2.eContents().get(0);
		private final Keyword cGreaterThanSignKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Assignment cSectionDescriptionAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cSectionDescriptionDBodyParserRuleCall_4_0 = (RuleCall)cSectionDescriptionAssignment_4.eContents().get(0);
		private final Assignment cSrsItemsAssignment_5 = (Assignment)cGroup.eContents().get(5);
		private final RuleCall cSrsItemsVSRSDocumentItemParserRuleCall_5_0 = (RuleCall)cSrsItemsAssignment_5.eContents().get(0);
		private final Keyword cSubsectionKeyword_6 = (Keyword)cGroup.eContents().get(6);
		
		//VSRSInstantiableRequirementSection:
		//	'<subsection'
		//	'name=' name=STRING
		//	'>'
		//	sectionDescription=DBody?
		//	srsItems+=VSRSDocumentItem*
		//	'</subsection>';
		@Override public ParserRule getRule() { return rule; }
		
		//'<subsection' 'name=' name=STRING '>' sectionDescription=DBody? srsItems+=VSRSDocumentItem* '</subsection>'
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
		
		//srsItems+=VSRSDocumentItem*
		public Assignment getSrsItemsAssignment_5() { return cSrsItemsAssignment_5; }
		
		//VSRSDocumentItem
		public RuleCall getSrsItemsVSRSDocumentItemParserRuleCall_5_0() { return cSrsItemsVSRSDocumentItemParserRuleCall_5_0; }
		
		//'</subsection>'
		public Keyword getSubsectionKeyword_6() { return cSubsectionKeyword_6; }
	}
	public class VSRSGeneralRequirementsElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.micobs.svm.lang.srs.SRS.VSRSGeneralRequirements");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cVSRSGeneralRequirementsAction_0 = (Action)cGroup.eContents().get(0);
		private final Keyword cGeneralRequirementsKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cSectionDescriptionAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cSectionDescriptionDBodyParserRuleCall_2_0 = (RuleCall)cSectionDescriptionAssignment_2.eContents().get(0);
		private final Assignment cSrsItemsAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cSrsItemsVSRSDocumentItemParserRuleCall_3_0 = (RuleCall)cSrsItemsAssignment_3.eContents().get(0);
		private final Assignment cSrsRequirementSubsectionsAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cSrsRequirementSubsectionsVSRSInstantiableRequirementSectionParserRuleCall_4_0 = (RuleCall)cSrsRequirementSubsectionsAssignment_4.eContents().get(0);
		private final Keyword cGeneralRequirementsKeyword_5 = (Keyword)cGroup.eContents().get(5);
		
		//VSRSGeneralRequirements:
		//	{VSRSGeneralRequirements}
		//	'<GeneralRequirements>'
		//	sectionDescription=DBody?
		//	srsItems+=VSRSDocumentItem*
		//	srsRequirementSubsections+=VSRSInstantiableRequirementSection*
		//	'</GeneralRequirements>';
		@Override public ParserRule getRule() { return rule; }
		
		//{VSRSGeneralRequirements} '<GeneralRequirements>' sectionDescription=DBody? srsItems+=VSRSDocumentItem*
		//srsRequirementSubsections+=VSRSInstantiableRequirementSection* '</GeneralRequirements>'
		public Group getGroup() { return cGroup; }
		
		//{VSRSGeneralRequirements}
		public Action getVSRSGeneralRequirementsAction_0() { return cVSRSGeneralRequirementsAction_0; }
		
		//'<GeneralRequirements>'
		public Keyword getGeneralRequirementsKeyword_1() { return cGeneralRequirementsKeyword_1; }
		
		//sectionDescription=DBody?
		public Assignment getSectionDescriptionAssignment_2() { return cSectionDescriptionAssignment_2; }
		
		//DBody
		public RuleCall getSectionDescriptionDBodyParserRuleCall_2_0() { return cSectionDescriptionDBodyParserRuleCall_2_0; }
		
		//srsItems+=VSRSDocumentItem*
		public Assignment getSrsItemsAssignment_3() { return cSrsItemsAssignment_3; }
		
		//VSRSDocumentItem
		public RuleCall getSrsItemsVSRSDocumentItemParserRuleCall_3_0() { return cSrsItemsVSRSDocumentItemParserRuleCall_3_0; }
		
		//srsRequirementSubsections+=VSRSInstantiableRequirementSection*
		public Assignment getSrsRequirementSubsectionsAssignment_4() { return cSrsRequirementSubsectionsAssignment_4; }
		
		//VSRSInstantiableRequirementSection
		public RuleCall getSrsRequirementSubsectionsVSRSInstantiableRequirementSectionParserRuleCall_4_0() { return cSrsRequirementSubsectionsVSRSInstantiableRequirementSectionParserRuleCall_4_0; }
		
		//'</GeneralRequirements>'
		public Keyword getGeneralRequirementsKeyword_5() { return cGeneralRequirementsKeyword_5; }
	}
	public class VSRSFunctionalRequirementsElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.micobs.svm.lang.srs.SRS.VSRSFunctionalRequirements");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cVSRSFunctionalRequirementsAction_0 = (Action)cGroup.eContents().get(0);
		private final Keyword cFunctionalRequirementsKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cSectionDescriptionAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cSectionDescriptionDBodyParserRuleCall_2_0 = (RuleCall)cSectionDescriptionAssignment_2.eContents().get(0);
		private final Assignment cSrsItemsAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cSrsItemsVSRSDocumentItemParserRuleCall_3_0 = (RuleCall)cSrsItemsAssignment_3.eContents().get(0);
		private final Assignment cSrsRequirementSubsectionsAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cSrsRequirementSubsectionsVSRSInstantiableRequirementSectionParserRuleCall_4_0 = (RuleCall)cSrsRequirementSubsectionsAssignment_4.eContents().get(0);
		private final Keyword cFunctionalRequirementsKeyword_5 = (Keyword)cGroup.eContents().get(5);
		
		//VSRSFunctionalRequirements:
		//	{VSRSFunctionalRequirements}
		//	'<FunctionalRequirements>'
		//	sectionDescription=DBody?
		//	srsItems+=VSRSDocumentItem*
		//	srsRequirementSubsections+=VSRSInstantiableRequirementSection*
		//	'</FunctionalRequirements>';
		@Override public ParserRule getRule() { return rule; }
		
		//{VSRSFunctionalRequirements} '<FunctionalRequirements>' sectionDescription=DBody? srsItems+=VSRSDocumentItem*
		//srsRequirementSubsections+=VSRSInstantiableRequirementSection* '</FunctionalRequirements>'
		public Group getGroup() { return cGroup; }
		
		//{VSRSFunctionalRequirements}
		public Action getVSRSFunctionalRequirementsAction_0() { return cVSRSFunctionalRequirementsAction_0; }
		
		//'<FunctionalRequirements>'
		public Keyword getFunctionalRequirementsKeyword_1() { return cFunctionalRequirementsKeyword_1; }
		
		//sectionDescription=DBody?
		public Assignment getSectionDescriptionAssignment_2() { return cSectionDescriptionAssignment_2; }
		
		//DBody
		public RuleCall getSectionDescriptionDBodyParserRuleCall_2_0() { return cSectionDescriptionDBodyParserRuleCall_2_0; }
		
		//srsItems+=VSRSDocumentItem*
		public Assignment getSrsItemsAssignment_3() { return cSrsItemsAssignment_3; }
		
		//VSRSDocumentItem
		public RuleCall getSrsItemsVSRSDocumentItemParserRuleCall_3_0() { return cSrsItemsVSRSDocumentItemParserRuleCall_3_0; }
		
		//srsRequirementSubsections+=VSRSInstantiableRequirementSection*
		public Assignment getSrsRequirementSubsectionsAssignment_4() { return cSrsRequirementSubsectionsAssignment_4; }
		
		//VSRSInstantiableRequirementSection
		public RuleCall getSrsRequirementSubsectionsVSRSInstantiableRequirementSectionParserRuleCall_4_0() { return cSrsRequirementSubsectionsVSRSInstantiableRequirementSectionParserRuleCall_4_0; }
		
		//'</FunctionalRequirements>'
		public Keyword getFunctionalRequirementsKeyword_5() { return cFunctionalRequirementsKeyword_5; }
	}
	public class VSRSPerformanceRequirementsElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.micobs.svm.lang.srs.SRS.VSRSPerformanceRequirements");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cVSRSPerformanceRequirementsAction_0 = (Action)cGroup.eContents().get(0);
		private final Keyword cPerformanceRequirementsKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cSectionDescriptionAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cSectionDescriptionDBodyParserRuleCall_2_0 = (RuleCall)cSectionDescriptionAssignment_2.eContents().get(0);
		private final Assignment cSrsItemsAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cSrsItemsVSRSDocumentItemParserRuleCall_3_0 = (RuleCall)cSrsItemsAssignment_3.eContents().get(0);
		private final Assignment cSrsRequirementSubsectionsAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cSrsRequirementSubsectionsVSRSInstantiableRequirementSectionParserRuleCall_4_0 = (RuleCall)cSrsRequirementSubsectionsAssignment_4.eContents().get(0);
		private final Keyword cPerformanceRequirementsKeyword_5 = (Keyword)cGroup.eContents().get(5);
		
		//VSRSPerformanceRequirements:
		//	{VSRSPerformanceRequirements}
		//	'<PerformanceRequirements>'
		//	sectionDescription=DBody?
		//	srsItems+=VSRSDocumentItem*
		//	srsRequirementSubsections+=VSRSInstantiableRequirementSection*
		//	'</PerformanceRequirements>';
		@Override public ParserRule getRule() { return rule; }
		
		//{VSRSPerformanceRequirements} '<PerformanceRequirements>' sectionDescription=DBody? srsItems+=VSRSDocumentItem*
		//srsRequirementSubsections+=VSRSInstantiableRequirementSection* '</PerformanceRequirements>'
		public Group getGroup() { return cGroup; }
		
		//{VSRSPerformanceRequirements}
		public Action getVSRSPerformanceRequirementsAction_0() { return cVSRSPerformanceRequirementsAction_0; }
		
		//'<PerformanceRequirements>'
		public Keyword getPerformanceRequirementsKeyword_1() { return cPerformanceRequirementsKeyword_1; }
		
		//sectionDescription=DBody?
		public Assignment getSectionDescriptionAssignment_2() { return cSectionDescriptionAssignment_2; }
		
		//DBody
		public RuleCall getSectionDescriptionDBodyParserRuleCall_2_0() { return cSectionDescriptionDBodyParserRuleCall_2_0; }
		
		//srsItems+=VSRSDocumentItem*
		public Assignment getSrsItemsAssignment_3() { return cSrsItemsAssignment_3; }
		
		//VSRSDocumentItem
		public RuleCall getSrsItemsVSRSDocumentItemParserRuleCall_3_0() { return cSrsItemsVSRSDocumentItemParserRuleCall_3_0; }
		
		//srsRequirementSubsections+=VSRSInstantiableRequirementSection*
		public Assignment getSrsRequirementSubsectionsAssignment_4() { return cSrsRequirementSubsectionsAssignment_4; }
		
		//VSRSInstantiableRequirementSection
		public RuleCall getSrsRequirementSubsectionsVSRSInstantiableRequirementSectionParserRuleCall_4_0() { return cSrsRequirementSubsectionsVSRSInstantiableRequirementSectionParserRuleCall_4_0; }
		
		//'</PerformanceRequirements>'
		public Keyword getPerformanceRequirementsKeyword_5() { return cPerformanceRequirementsKeyword_5; }
	}
	public class VSRSInterfaceRequirementsElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.micobs.svm.lang.srs.SRS.VSRSInterfaceRequirements");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cVSRSInterfaceRequirementsAction_0 = (Action)cGroup.eContents().get(0);
		private final Keyword cInterfaceRequirementsKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cSectionDescriptionAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cSectionDescriptionDBodyParserRuleCall_2_0 = (RuleCall)cSectionDescriptionAssignment_2.eContents().get(0);
		private final Assignment cSrsItemsAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cSrsItemsVSRSDocumentItemParserRuleCall_3_0 = (RuleCall)cSrsItemsAssignment_3.eContents().get(0);
		private final Assignment cSrsRequirementSubsectionsAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cSrsRequirementSubsectionsVSRSInstantiableRequirementSectionParserRuleCall_4_0 = (RuleCall)cSrsRequirementSubsectionsAssignment_4.eContents().get(0);
		private final Keyword cInterfaceRequirementsKeyword_5 = (Keyword)cGroup.eContents().get(5);
		
		//VSRSInterfaceRequirements:
		//	{VSRSInterfaceRequirements}
		//	'<InterfaceRequirements>'
		//	sectionDescription=DBody?
		//	srsItems+=VSRSDocumentItem*
		//	srsRequirementSubsections+=VSRSInstantiableRequirementSection*
		//	'</InterfaceRequirements>';
		@Override public ParserRule getRule() { return rule; }
		
		//{VSRSInterfaceRequirements} '<InterfaceRequirements>' sectionDescription=DBody? srsItems+=VSRSDocumentItem*
		//srsRequirementSubsections+=VSRSInstantiableRequirementSection* '</InterfaceRequirements>'
		public Group getGroup() { return cGroup; }
		
		//{VSRSInterfaceRequirements}
		public Action getVSRSInterfaceRequirementsAction_0() { return cVSRSInterfaceRequirementsAction_0; }
		
		//'<InterfaceRequirements>'
		public Keyword getInterfaceRequirementsKeyword_1() { return cInterfaceRequirementsKeyword_1; }
		
		//sectionDescription=DBody?
		public Assignment getSectionDescriptionAssignment_2() { return cSectionDescriptionAssignment_2; }
		
		//DBody
		public RuleCall getSectionDescriptionDBodyParserRuleCall_2_0() { return cSectionDescriptionDBodyParserRuleCall_2_0; }
		
		//srsItems+=VSRSDocumentItem*
		public Assignment getSrsItemsAssignment_3() { return cSrsItemsAssignment_3; }
		
		//VSRSDocumentItem
		public RuleCall getSrsItemsVSRSDocumentItemParserRuleCall_3_0() { return cSrsItemsVSRSDocumentItemParserRuleCall_3_0; }
		
		//srsRequirementSubsections+=VSRSInstantiableRequirementSection*
		public Assignment getSrsRequirementSubsectionsAssignment_4() { return cSrsRequirementSubsectionsAssignment_4; }
		
		//VSRSInstantiableRequirementSection
		public RuleCall getSrsRequirementSubsectionsVSRSInstantiableRequirementSectionParserRuleCall_4_0() { return cSrsRequirementSubsectionsVSRSInstantiableRequirementSectionParserRuleCall_4_0; }
		
		//'</InterfaceRequirements>'
		public Keyword getInterfaceRequirementsKeyword_5() { return cInterfaceRequirementsKeyword_5; }
	}
	public class VSRSOperationalRequirementsElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.micobs.svm.lang.srs.SRS.VSRSOperationalRequirements");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cVSRSOperationalRequirementsAction_0 = (Action)cGroup.eContents().get(0);
		private final Keyword cOperationalRequirementsKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cSectionDescriptionAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cSectionDescriptionDBodyParserRuleCall_2_0 = (RuleCall)cSectionDescriptionAssignment_2.eContents().get(0);
		private final Assignment cSrsItemsAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cSrsItemsVSRSDocumentItemParserRuleCall_3_0 = (RuleCall)cSrsItemsAssignment_3.eContents().get(0);
		private final Assignment cSrsRequirementSubsectionsAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cSrsRequirementSubsectionsVSRSInstantiableRequirementSectionParserRuleCall_4_0 = (RuleCall)cSrsRequirementSubsectionsAssignment_4.eContents().get(0);
		private final Keyword cOperationalRequirementsKeyword_5 = (Keyword)cGroup.eContents().get(5);
		
		//VSRSOperationalRequirements:
		//	{VSRSOperationalRequirements}
		//	'<OperationalRequirements>'
		//	sectionDescription=DBody?
		//	srsItems+=VSRSDocumentItem*
		//	srsRequirementSubsections+=VSRSInstantiableRequirementSection*
		//	'</OperationalRequirements>';
		@Override public ParserRule getRule() { return rule; }
		
		//{VSRSOperationalRequirements} '<OperationalRequirements>' sectionDescription=DBody? srsItems+=VSRSDocumentItem*
		//srsRequirementSubsections+=VSRSInstantiableRequirementSection* '</OperationalRequirements>'
		public Group getGroup() { return cGroup; }
		
		//{VSRSOperationalRequirements}
		public Action getVSRSOperationalRequirementsAction_0() { return cVSRSOperationalRequirementsAction_0; }
		
		//'<OperationalRequirements>'
		public Keyword getOperationalRequirementsKeyword_1() { return cOperationalRequirementsKeyword_1; }
		
		//sectionDescription=DBody?
		public Assignment getSectionDescriptionAssignment_2() { return cSectionDescriptionAssignment_2; }
		
		//DBody
		public RuleCall getSectionDescriptionDBodyParserRuleCall_2_0() { return cSectionDescriptionDBodyParserRuleCall_2_0; }
		
		//srsItems+=VSRSDocumentItem*
		public Assignment getSrsItemsAssignment_3() { return cSrsItemsAssignment_3; }
		
		//VSRSDocumentItem
		public RuleCall getSrsItemsVSRSDocumentItemParserRuleCall_3_0() { return cSrsItemsVSRSDocumentItemParserRuleCall_3_0; }
		
		//srsRequirementSubsections+=VSRSInstantiableRequirementSection*
		public Assignment getSrsRequirementSubsectionsAssignment_4() { return cSrsRequirementSubsectionsAssignment_4; }
		
		//VSRSInstantiableRequirementSection
		public RuleCall getSrsRequirementSubsectionsVSRSInstantiableRequirementSectionParserRuleCall_4_0() { return cSrsRequirementSubsectionsVSRSInstantiableRequirementSectionParserRuleCall_4_0; }
		
		//'</OperationalRequirements>'
		public Keyword getOperationalRequirementsKeyword_5() { return cOperationalRequirementsKeyword_5; }
	}
	public class VSRSResourcesRequirementsElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.micobs.svm.lang.srs.SRS.VSRSResourcesRequirements");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cVSRSResourcesRequirementsAction_0 = (Action)cGroup.eContents().get(0);
		private final Keyword cResourcesRequirementsKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cSectionDescriptionAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cSectionDescriptionDBodyParserRuleCall_2_0 = (RuleCall)cSectionDescriptionAssignment_2.eContents().get(0);
		private final Assignment cSrsItemsAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cSrsItemsVSRSDocumentItemParserRuleCall_3_0 = (RuleCall)cSrsItemsAssignment_3.eContents().get(0);
		private final Assignment cSrsRequirementSubsectionsAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cSrsRequirementSubsectionsVSRSInstantiableRequirementSectionParserRuleCall_4_0 = (RuleCall)cSrsRequirementSubsectionsAssignment_4.eContents().get(0);
		private final Keyword cResourcesRequirementsKeyword_5 = (Keyword)cGroup.eContents().get(5);
		
		//VSRSResourcesRequirements:
		//	{VSRSResourcesRequirements}
		//	'<ResourcesRequirements>'
		//	sectionDescription=DBody?
		//	srsItems+=VSRSDocumentItem*
		//	srsRequirementSubsections+=VSRSInstantiableRequirementSection*
		//	'</ResourcesRequirements>';
		@Override public ParserRule getRule() { return rule; }
		
		//{VSRSResourcesRequirements} '<ResourcesRequirements>' sectionDescription=DBody? srsItems+=VSRSDocumentItem*
		//srsRequirementSubsections+=VSRSInstantiableRequirementSection* '</ResourcesRequirements>'
		public Group getGroup() { return cGroup; }
		
		//{VSRSResourcesRequirements}
		public Action getVSRSResourcesRequirementsAction_0() { return cVSRSResourcesRequirementsAction_0; }
		
		//'<ResourcesRequirements>'
		public Keyword getResourcesRequirementsKeyword_1() { return cResourcesRequirementsKeyword_1; }
		
		//sectionDescription=DBody?
		public Assignment getSectionDescriptionAssignment_2() { return cSectionDescriptionAssignment_2; }
		
		//DBody
		public RuleCall getSectionDescriptionDBodyParserRuleCall_2_0() { return cSectionDescriptionDBodyParserRuleCall_2_0; }
		
		//srsItems+=VSRSDocumentItem*
		public Assignment getSrsItemsAssignment_3() { return cSrsItemsAssignment_3; }
		
		//VSRSDocumentItem
		public RuleCall getSrsItemsVSRSDocumentItemParserRuleCall_3_0() { return cSrsItemsVSRSDocumentItemParserRuleCall_3_0; }
		
		//srsRequirementSubsections+=VSRSInstantiableRequirementSection*
		public Assignment getSrsRequirementSubsectionsAssignment_4() { return cSrsRequirementSubsectionsAssignment_4; }
		
		//VSRSInstantiableRequirementSection
		public RuleCall getSrsRequirementSubsectionsVSRSInstantiableRequirementSectionParserRuleCall_4_0() { return cSrsRequirementSubsectionsVSRSInstantiableRequirementSectionParserRuleCall_4_0; }
		
		//'</ResourcesRequirements>'
		public Keyword getResourcesRequirementsKeyword_5() { return cResourcesRequirementsKeyword_5; }
	}
	public class VSRSDesignRequirementsElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.micobs.svm.lang.srs.SRS.VSRSDesignRequirements");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cVSRSDesignRequirementsAction_0 = (Action)cGroup.eContents().get(0);
		private final Keyword cDesignRequirementsKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cSectionDescriptionAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cSectionDescriptionDBodyParserRuleCall_2_0 = (RuleCall)cSectionDescriptionAssignment_2.eContents().get(0);
		private final Assignment cSrsItemsAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cSrsItemsVSRSDocumentItemParserRuleCall_3_0 = (RuleCall)cSrsItemsAssignment_3.eContents().get(0);
		private final Assignment cSrsRequirementSubsectionsAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cSrsRequirementSubsectionsVSRSInstantiableRequirementSectionParserRuleCall_4_0 = (RuleCall)cSrsRequirementSubsectionsAssignment_4.eContents().get(0);
		private final Keyword cDesignRequirementsKeyword_5 = (Keyword)cGroup.eContents().get(5);
		
		//VSRSDesignRequirements:
		//	{VSRSDesignRequirements}
		//	'<DesignRequirements>'
		//	sectionDescription=DBody?
		//	srsItems+=VSRSDocumentItem*
		//	srsRequirementSubsections+=VSRSInstantiableRequirementSection*
		//	'</DesignRequirements>';
		@Override public ParserRule getRule() { return rule; }
		
		//{VSRSDesignRequirements} '<DesignRequirements>' sectionDescription=DBody? srsItems+=VSRSDocumentItem*
		//srsRequirementSubsections+=VSRSInstantiableRequirementSection* '</DesignRequirements>'
		public Group getGroup() { return cGroup; }
		
		//{VSRSDesignRequirements}
		public Action getVSRSDesignRequirementsAction_0() { return cVSRSDesignRequirementsAction_0; }
		
		//'<DesignRequirements>'
		public Keyword getDesignRequirementsKeyword_1() { return cDesignRequirementsKeyword_1; }
		
		//sectionDescription=DBody?
		public Assignment getSectionDescriptionAssignment_2() { return cSectionDescriptionAssignment_2; }
		
		//DBody
		public RuleCall getSectionDescriptionDBodyParserRuleCall_2_0() { return cSectionDescriptionDBodyParserRuleCall_2_0; }
		
		//srsItems+=VSRSDocumentItem*
		public Assignment getSrsItemsAssignment_3() { return cSrsItemsAssignment_3; }
		
		//VSRSDocumentItem
		public RuleCall getSrsItemsVSRSDocumentItemParserRuleCall_3_0() { return cSrsItemsVSRSDocumentItemParserRuleCall_3_0; }
		
		//srsRequirementSubsections+=VSRSInstantiableRequirementSection*
		public Assignment getSrsRequirementSubsectionsAssignment_4() { return cSrsRequirementSubsectionsAssignment_4; }
		
		//VSRSInstantiableRequirementSection
		public RuleCall getSrsRequirementSubsectionsVSRSInstantiableRequirementSectionParserRuleCall_4_0() { return cSrsRequirementSubsectionsVSRSInstantiableRequirementSectionParserRuleCall_4_0; }
		
		//'</DesignRequirements>'
		public Keyword getDesignRequirementsKeyword_5() { return cDesignRequirementsKeyword_5; }
	}
	public class VSRSSecurityPrivacyRequirementsElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.micobs.svm.lang.srs.SRS.VSRSSecurityPrivacyRequirements");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cVSRSSecurityPrivacyRequirementsAction_0 = (Action)cGroup.eContents().get(0);
		private final Keyword cSecurityPrivacyRequirementsKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cSectionDescriptionAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cSectionDescriptionDBodyParserRuleCall_2_0 = (RuleCall)cSectionDescriptionAssignment_2.eContents().get(0);
		private final Assignment cSrsItemsAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cSrsItemsVSRSDocumentItemParserRuleCall_3_0 = (RuleCall)cSrsItemsAssignment_3.eContents().get(0);
		private final Assignment cSrsRequirementSubsectionsAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cSrsRequirementSubsectionsVSRSInstantiableRequirementSectionParserRuleCall_4_0 = (RuleCall)cSrsRequirementSubsectionsAssignment_4.eContents().get(0);
		private final Keyword cSecurityPrivacyRequirementsKeyword_5 = (Keyword)cGroup.eContents().get(5);
		
		//VSRSSecurityPrivacyRequirements:
		//	{VSRSSecurityPrivacyRequirements}
		//	'<SecurityPrivacyRequirements>'
		//	sectionDescription=DBody?
		//	srsItems+=VSRSDocumentItem*
		//	srsRequirementSubsections+=VSRSInstantiableRequirementSection*
		//	'</SecurityPrivacyRequirements>';
		@Override public ParserRule getRule() { return rule; }
		
		//{VSRSSecurityPrivacyRequirements} '<SecurityPrivacyRequirements>' sectionDescription=DBody? srsItems+=VSRSDocumentItem*
		//srsRequirementSubsections+=VSRSInstantiableRequirementSection* '</SecurityPrivacyRequirements>'
		public Group getGroup() { return cGroup; }
		
		//{VSRSSecurityPrivacyRequirements}
		public Action getVSRSSecurityPrivacyRequirementsAction_0() { return cVSRSSecurityPrivacyRequirementsAction_0; }
		
		//'<SecurityPrivacyRequirements>'
		public Keyword getSecurityPrivacyRequirementsKeyword_1() { return cSecurityPrivacyRequirementsKeyword_1; }
		
		//sectionDescription=DBody?
		public Assignment getSectionDescriptionAssignment_2() { return cSectionDescriptionAssignment_2; }
		
		//DBody
		public RuleCall getSectionDescriptionDBodyParserRuleCall_2_0() { return cSectionDescriptionDBodyParserRuleCall_2_0; }
		
		//srsItems+=VSRSDocumentItem*
		public Assignment getSrsItemsAssignment_3() { return cSrsItemsAssignment_3; }
		
		//VSRSDocumentItem
		public RuleCall getSrsItemsVSRSDocumentItemParserRuleCall_3_0() { return cSrsItemsVSRSDocumentItemParserRuleCall_3_0; }
		
		//srsRequirementSubsections+=VSRSInstantiableRequirementSection*
		public Assignment getSrsRequirementSubsectionsAssignment_4() { return cSrsRequirementSubsectionsAssignment_4; }
		
		//VSRSInstantiableRequirementSection
		public RuleCall getSrsRequirementSubsectionsVSRSInstantiableRequirementSectionParserRuleCall_4_0() { return cSrsRequirementSubsectionsVSRSInstantiableRequirementSectionParserRuleCall_4_0; }
		
		//'</SecurityPrivacyRequirements>'
		public Keyword getSecurityPrivacyRequirementsKeyword_5() { return cSecurityPrivacyRequirementsKeyword_5; }
	}
	public class VSRSPortabilityRequirementsElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.micobs.svm.lang.srs.SRS.VSRSPortabilityRequirements");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cVSRSPortabilityRequirementsAction_0 = (Action)cGroup.eContents().get(0);
		private final Keyword cPortabilityRequirementsKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cSectionDescriptionAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cSectionDescriptionDBodyParserRuleCall_2_0 = (RuleCall)cSectionDescriptionAssignment_2.eContents().get(0);
		private final Assignment cSrsItemsAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cSrsItemsVSRSDocumentItemParserRuleCall_3_0 = (RuleCall)cSrsItemsAssignment_3.eContents().get(0);
		private final Assignment cSrsRequirementSubsectionsAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cSrsRequirementSubsectionsVSRSInstantiableRequirementSectionParserRuleCall_4_0 = (RuleCall)cSrsRequirementSubsectionsAssignment_4.eContents().get(0);
		private final Keyword cPortabilityRequirementsKeyword_5 = (Keyword)cGroup.eContents().get(5);
		
		//VSRSPortabilityRequirements:
		//	{VSRSPortabilityRequirements}
		//	'<PortabilityRequirements>'
		//	sectionDescription=DBody?
		//	srsItems+=VSRSDocumentItem*
		//	srsRequirementSubsections+=VSRSInstantiableRequirementSection*
		//	'</PortabilityRequirements>';
		@Override public ParserRule getRule() { return rule; }
		
		//{VSRSPortabilityRequirements} '<PortabilityRequirements>' sectionDescription=DBody? srsItems+=VSRSDocumentItem*
		//srsRequirementSubsections+=VSRSInstantiableRequirementSection* '</PortabilityRequirements>'
		public Group getGroup() { return cGroup; }
		
		//{VSRSPortabilityRequirements}
		public Action getVSRSPortabilityRequirementsAction_0() { return cVSRSPortabilityRequirementsAction_0; }
		
		//'<PortabilityRequirements>'
		public Keyword getPortabilityRequirementsKeyword_1() { return cPortabilityRequirementsKeyword_1; }
		
		//sectionDescription=DBody?
		public Assignment getSectionDescriptionAssignment_2() { return cSectionDescriptionAssignment_2; }
		
		//DBody
		public RuleCall getSectionDescriptionDBodyParserRuleCall_2_0() { return cSectionDescriptionDBodyParserRuleCall_2_0; }
		
		//srsItems+=VSRSDocumentItem*
		public Assignment getSrsItemsAssignment_3() { return cSrsItemsAssignment_3; }
		
		//VSRSDocumentItem
		public RuleCall getSrsItemsVSRSDocumentItemParserRuleCall_3_0() { return cSrsItemsVSRSDocumentItemParserRuleCall_3_0; }
		
		//srsRequirementSubsections+=VSRSInstantiableRequirementSection*
		public Assignment getSrsRequirementSubsectionsAssignment_4() { return cSrsRequirementSubsectionsAssignment_4; }
		
		//VSRSInstantiableRequirementSection
		public RuleCall getSrsRequirementSubsectionsVSRSInstantiableRequirementSectionParserRuleCall_4_0() { return cSrsRequirementSubsectionsVSRSInstantiableRequirementSectionParserRuleCall_4_0; }
		
		//'</PortabilityRequirements>'
		public Keyword getPortabilityRequirementsKeyword_5() { return cPortabilityRequirementsKeyword_5; }
	}
	public class VSRSSWQualityRequirementsElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.micobs.svm.lang.srs.SRS.VSRSSWQualityRequirements");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cVSRSSWQualityRequirementsAction_0 = (Action)cGroup.eContents().get(0);
		private final Keyword cSWQualityRequirementsKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cSectionDescriptionAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cSectionDescriptionDBodyParserRuleCall_2_0 = (RuleCall)cSectionDescriptionAssignment_2.eContents().get(0);
		private final Assignment cSrsItemsAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cSrsItemsVSRSDocumentItemParserRuleCall_3_0 = (RuleCall)cSrsItemsAssignment_3.eContents().get(0);
		private final Assignment cSrsRequirementSubsectionsAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cSrsRequirementSubsectionsVSRSInstantiableRequirementSectionParserRuleCall_4_0 = (RuleCall)cSrsRequirementSubsectionsAssignment_4.eContents().get(0);
		private final Keyword cSWQualityRequirementsKeyword_5 = (Keyword)cGroup.eContents().get(5);
		
		//VSRSSWQualityRequirements:
		//	{VSRSSWQualityRequirements}
		//	'<SWQualityRequirements>'
		//	sectionDescription=DBody?
		//	srsItems+=VSRSDocumentItem*
		//	srsRequirementSubsections+=VSRSInstantiableRequirementSection*
		//	'</SWQualityRequirements>';
		@Override public ParserRule getRule() { return rule; }
		
		//{VSRSSWQualityRequirements} '<SWQualityRequirements>' sectionDescription=DBody? srsItems+=VSRSDocumentItem*
		//srsRequirementSubsections+=VSRSInstantiableRequirementSection* '</SWQualityRequirements>'
		public Group getGroup() { return cGroup; }
		
		//{VSRSSWQualityRequirements}
		public Action getVSRSSWQualityRequirementsAction_0() { return cVSRSSWQualityRequirementsAction_0; }
		
		//'<SWQualityRequirements>'
		public Keyword getSWQualityRequirementsKeyword_1() { return cSWQualityRequirementsKeyword_1; }
		
		//sectionDescription=DBody?
		public Assignment getSectionDescriptionAssignment_2() { return cSectionDescriptionAssignment_2; }
		
		//DBody
		public RuleCall getSectionDescriptionDBodyParserRuleCall_2_0() { return cSectionDescriptionDBodyParserRuleCall_2_0; }
		
		//srsItems+=VSRSDocumentItem*
		public Assignment getSrsItemsAssignment_3() { return cSrsItemsAssignment_3; }
		
		//VSRSDocumentItem
		public RuleCall getSrsItemsVSRSDocumentItemParserRuleCall_3_0() { return cSrsItemsVSRSDocumentItemParserRuleCall_3_0; }
		
		//srsRequirementSubsections+=VSRSInstantiableRequirementSection*
		public Assignment getSrsRequirementSubsectionsAssignment_4() { return cSrsRequirementSubsectionsAssignment_4; }
		
		//VSRSInstantiableRequirementSection
		public RuleCall getSrsRequirementSubsectionsVSRSInstantiableRequirementSectionParserRuleCall_4_0() { return cSrsRequirementSubsectionsVSRSInstantiableRequirementSectionParserRuleCall_4_0; }
		
		//'</SWQualityRequirements>'
		public Keyword getSWQualityRequirementsKeyword_5() { return cSWQualityRequirementsKeyword_5; }
	}
	public class VSRSSWReliabiltyRequirementsElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.micobs.svm.lang.srs.SRS.VSRSSWReliabiltyRequirements");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cVSRSSWReliabiltyRequirementsAction_0 = (Action)cGroup.eContents().get(0);
		private final Keyword cSWReliabiltyRequirementsKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cSectionDescriptionAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cSectionDescriptionDBodyParserRuleCall_2_0 = (RuleCall)cSectionDescriptionAssignment_2.eContents().get(0);
		private final Assignment cSrsItemsAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cSrsItemsVSRSDocumentItemParserRuleCall_3_0 = (RuleCall)cSrsItemsAssignment_3.eContents().get(0);
		private final Assignment cSrsRequirementSubsectionsAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cSrsRequirementSubsectionsVSRSInstantiableRequirementSectionParserRuleCall_4_0 = (RuleCall)cSrsRequirementSubsectionsAssignment_4.eContents().get(0);
		private final Keyword cSWReliabiltyRequirementsKeyword_5 = (Keyword)cGroup.eContents().get(5);
		
		//VSRSSWReliabiltyRequirements:
		//	{VSRSSWReliabiltyRequirements}
		//	'<SWReliabiltyRequirements>'
		//	sectionDescription=DBody?
		//	srsItems+=VSRSDocumentItem*
		//	srsRequirementSubsections+=VSRSInstantiableRequirementSection*
		//	'</SWReliabiltyRequirements>';
		@Override public ParserRule getRule() { return rule; }
		
		//{VSRSSWReliabiltyRequirements} '<SWReliabiltyRequirements>' sectionDescription=DBody? srsItems+=VSRSDocumentItem*
		//srsRequirementSubsections+=VSRSInstantiableRequirementSection* '</SWReliabiltyRequirements>'
		public Group getGroup() { return cGroup; }
		
		//{VSRSSWReliabiltyRequirements}
		public Action getVSRSSWReliabiltyRequirementsAction_0() { return cVSRSSWReliabiltyRequirementsAction_0; }
		
		//'<SWReliabiltyRequirements>'
		public Keyword getSWReliabiltyRequirementsKeyword_1() { return cSWReliabiltyRequirementsKeyword_1; }
		
		//sectionDescription=DBody?
		public Assignment getSectionDescriptionAssignment_2() { return cSectionDescriptionAssignment_2; }
		
		//DBody
		public RuleCall getSectionDescriptionDBodyParserRuleCall_2_0() { return cSectionDescriptionDBodyParserRuleCall_2_0; }
		
		//srsItems+=VSRSDocumentItem*
		public Assignment getSrsItemsAssignment_3() { return cSrsItemsAssignment_3; }
		
		//VSRSDocumentItem
		public RuleCall getSrsItemsVSRSDocumentItemParserRuleCall_3_0() { return cSrsItemsVSRSDocumentItemParserRuleCall_3_0; }
		
		//srsRequirementSubsections+=VSRSInstantiableRequirementSection*
		public Assignment getSrsRequirementSubsectionsAssignment_4() { return cSrsRequirementSubsectionsAssignment_4; }
		
		//VSRSInstantiableRequirementSection
		public RuleCall getSrsRequirementSubsectionsVSRSInstantiableRequirementSectionParserRuleCall_4_0() { return cSrsRequirementSubsectionsVSRSInstantiableRequirementSectionParserRuleCall_4_0; }
		
		//'</SWReliabiltyRequirements>'
		public Keyword getSWReliabiltyRequirementsKeyword_5() { return cSWReliabiltyRequirementsKeyword_5; }
	}
	public class VSRSSWMaintainabilityRequirementsElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.micobs.svm.lang.srs.SRS.VSRSSWMaintainabilityRequirements");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cVSRSSWMaintainabilityRequirementsAction_0 = (Action)cGroup.eContents().get(0);
		private final Keyword cSWMaintainabilityRequirementsKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cSectionDescriptionAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cSectionDescriptionDBodyParserRuleCall_2_0 = (RuleCall)cSectionDescriptionAssignment_2.eContents().get(0);
		private final Assignment cSrsItemsAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cSrsItemsVSRSDocumentItemParserRuleCall_3_0 = (RuleCall)cSrsItemsAssignment_3.eContents().get(0);
		private final Assignment cSrsRequirementSubsectionsAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cSrsRequirementSubsectionsVSRSInstantiableRequirementSectionParserRuleCall_4_0 = (RuleCall)cSrsRequirementSubsectionsAssignment_4.eContents().get(0);
		private final Keyword cSWMaintainabilityRequirementsKeyword_5 = (Keyword)cGroup.eContents().get(5);
		
		//VSRSSWMaintainabilityRequirements:
		//	{VSRSSWMaintainabilityRequirements}
		//	'<SWMaintainabilityRequirements>'
		//	sectionDescription=DBody?
		//	srsItems+=VSRSDocumentItem*
		//	srsRequirementSubsections+=VSRSInstantiableRequirementSection*
		//	'</SWMaintainabilityRequirements>';
		@Override public ParserRule getRule() { return rule; }
		
		//{VSRSSWMaintainabilityRequirements} '<SWMaintainabilityRequirements>' sectionDescription=DBody?
		//srsItems+=VSRSDocumentItem* srsRequirementSubsections+=VSRSInstantiableRequirementSection*
		//'</SWMaintainabilityRequirements>'
		public Group getGroup() { return cGroup; }
		
		//{VSRSSWMaintainabilityRequirements}
		public Action getVSRSSWMaintainabilityRequirementsAction_0() { return cVSRSSWMaintainabilityRequirementsAction_0; }
		
		//'<SWMaintainabilityRequirements>'
		public Keyword getSWMaintainabilityRequirementsKeyword_1() { return cSWMaintainabilityRequirementsKeyword_1; }
		
		//sectionDescription=DBody?
		public Assignment getSectionDescriptionAssignment_2() { return cSectionDescriptionAssignment_2; }
		
		//DBody
		public RuleCall getSectionDescriptionDBodyParserRuleCall_2_0() { return cSectionDescriptionDBodyParserRuleCall_2_0; }
		
		//srsItems+=VSRSDocumentItem*
		public Assignment getSrsItemsAssignment_3() { return cSrsItemsAssignment_3; }
		
		//VSRSDocumentItem
		public RuleCall getSrsItemsVSRSDocumentItemParserRuleCall_3_0() { return cSrsItemsVSRSDocumentItemParserRuleCall_3_0; }
		
		//srsRequirementSubsections+=VSRSInstantiableRequirementSection*
		public Assignment getSrsRequirementSubsectionsAssignment_4() { return cSrsRequirementSubsectionsAssignment_4; }
		
		//VSRSInstantiableRequirementSection
		public RuleCall getSrsRequirementSubsectionsVSRSInstantiableRequirementSectionParserRuleCall_4_0() { return cSrsRequirementSubsectionsVSRSInstantiableRequirementSectionParserRuleCall_4_0; }
		
		//'</SWMaintainabilityRequirements>'
		public Keyword getSWMaintainabilityRequirementsKeyword_5() { return cSWMaintainabilityRequirementsKeyword_5; }
	}
	public class VSRSSWSafetyRequirementsElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.micobs.svm.lang.srs.SRS.VSRSSWSafetyRequirements");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cVSRSSWSafetyRequirementsAction_0 = (Action)cGroup.eContents().get(0);
		private final Keyword cSWSafetyRequirementsKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cSectionDescriptionAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cSectionDescriptionDBodyParserRuleCall_2_0 = (RuleCall)cSectionDescriptionAssignment_2.eContents().get(0);
		private final Assignment cSrsItemsAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cSrsItemsVSRSDocumentItemParserRuleCall_3_0 = (RuleCall)cSrsItemsAssignment_3.eContents().get(0);
		private final Assignment cSrsRequirementSubsectionsAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cSrsRequirementSubsectionsVSRSInstantiableRequirementSectionParserRuleCall_4_0 = (RuleCall)cSrsRequirementSubsectionsAssignment_4.eContents().get(0);
		private final Keyword cSWSafetyRequirementsKeyword_5 = (Keyword)cGroup.eContents().get(5);
		
		//VSRSSWSafetyRequirements:
		//	{VSRSSWSafetyRequirements}
		//	'<SWSafetyRequirements>'
		//	sectionDescription=DBody?
		//	srsItems+=VSRSDocumentItem*
		//	srsRequirementSubsections+=VSRSInstantiableRequirementSection*
		//	'</SWSafetyRequirements>';
		@Override public ParserRule getRule() { return rule; }
		
		//{VSRSSWSafetyRequirements} '<SWSafetyRequirements>' sectionDescription=DBody? srsItems+=VSRSDocumentItem*
		//srsRequirementSubsections+=VSRSInstantiableRequirementSection* '</SWSafetyRequirements>'
		public Group getGroup() { return cGroup; }
		
		//{VSRSSWSafetyRequirements}
		public Action getVSRSSWSafetyRequirementsAction_0() { return cVSRSSWSafetyRequirementsAction_0; }
		
		//'<SWSafetyRequirements>'
		public Keyword getSWSafetyRequirementsKeyword_1() { return cSWSafetyRequirementsKeyword_1; }
		
		//sectionDescription=DBody?
		public Assignment getSectionDescriptionAssignment_2() { return cSectionDescriptionAssignment_2; }
		
		//DBody
		public RuleCall getSectionDescriptionDBodyParserRuleCall_2_0() { return cSectionDescriptionDBodyParserRuleCall_2_0; }
		
		//srsItems+=VSRSDocumentItem*
		public Assignment getSrsItemsAssignment_3() { return cSrsItemsAssignment_3; }
		
		//VSRSDocumentItem
		public RuleCall getSrsItemsVSRSDocumentItemParserRuleCall_3_0() { return cSrsItemsVSRSDocumentItemParserRuleCall_3_0; }
		
		//srsRequirementSubsections+=VSRSInstantiableRequirementSection*
		public Assignment getSrsRequirementSubsectionsAssignment_4() { return cSrsRequirementSubsectionsAssignment_4; }
		
		//VSRSInstantiableRequirementSection
		public RuleCall getSrsRequirementSubsectionsVSRSInstantiableRequirementSectionParserRuleCall_4_0() { return cSrsRequirementSubsectionsVSRSInstantiableRequirementSectionParserRuleCall_4_0; }
		
		//'</SWSafetyRequirements>'
		public Keyword getSWSafetyRequirementsKeyword_5() { return cSWSafetyRequirementsKeyword_5; }
	}
	public class VSRSSWConfigurationDeliveryRequirementsElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.micobs.svm.lang.srs.SRS.VSRSSWConfigurationDeliveryRequirements");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cVSRSSWConfigurationDeliveryRequirementsAction_0 = (Action)cGroup.eContents().get(0);
		private final Keyword cSWConfigurationDeliveryRequirementsKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cSectionDescriptionAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cSectionDescriptionDBodyParserRuleCall_2_0 = (RuleCall)cSectionDescriptionAssignment_2.eContents().get(0);
		private final Assignment cSrsItemsAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cSrsItemsVSRSDocumentItemParserRuleCall_3_0 = (RuleCall)cSrsItemsAssignment_3.eContents().get(0);
		private final Assignment cSrsRequirementSubsectionsAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cSrsRequirementSubsectionsVSRSInstantiableRequirementSectionParserRuleCall_4_0 = (RuleCall)cSrsRequirementSubsectionsAssignment_4.eContents().get(0);
		private final Keyword cSWConfigurationDeliveryRequirementsKeyword_5 = (Keyword)cGroup.eContents().get(5);
		
		//VSRSSWConfigurationDeliveryRequirements:
		//	{VSRSSWConfigurationDeliveryRequirements}
		//	'<SWConfigurationDeliveryRequirements>'
		//	sectionDescription=DBody?
		//	srsItems+=VSRSDocumentItem*
		//	srsRequirementSubsections+=VSRSInstantiableRequirementSection*
		//	'</SWConfigurationDeliveryRequirements>';
		@Override public ParserRule getRule() { return rule; }
		
		//{VSRSSWConfigurationDeliveryRequirements} '<SWConfigurationDeliveryRequirements>' sectionDescription=DBody?
		//srsItems+=VSRSDocumentItem* srsRequirementSubsections+=VSRSInstantiableRequirementSection*
		//'</SWConfigurationDeliveryRequirements>'
		public Group getGroup() { return cGroup; }
		
		//{VSRSSWConfigurationDeliveryRequirements}
		public Action getVSRSSWConfigurationDeliveryRequirementsAction_0() { return cVSRSSWConfigurationDeliveryRequirementsAction_0; }
		
		//'<SWConfigurationDeliveryRequirements>'
		public Keyword getSWConfigurationDeliveryRequirementsKeyword_1() { return cSWConfigurationDeliveryRequirementsKeyword_1; }
		
		//sectionDescription=DBody?
		public Assignment getSectionDescriptionAssignment_2() { return cSectionDescriptionAssignment_2; }
		
		//DBody
		public RuleCall getSectionDescriptionDBodyParserRuleCall_2_0() { return cSectionDescriptionDBodyParserRuleCall_2_0; }
		
		//srsItems+=VSRSDocumentItem*
		public Assignment getSrsItemsAssignment_3() { return cSrsItemsAssignment_3; }
		
		//VSRSDocumentItem
		public RuleCall getSrsItemsVSRSDocumentItemParserRuleCall_3_0() { return cSrsItemsVSRSDocumentItemParserRuleCall_3_0; }
		
		//srsRequirementSubsections+=VSRSInstantiableRequirementSection*
		public Assignment getSrsRequirementSubsectionsAssignment_4() { return cSrsRequirementSubsectionsAssignment_4; }
		
		//VSRSInstantiableRequirementSection
		public RuleCall getSrsRequirementSubsectionsVSRSInstantiableRequirementSectionParserRuleCall_4_0() { return cSrsRequirementSubsectionsVSRSInstantiableRequirementSectionParserRuleCall_4_0; }
		
		//'</SWConfigurationDeliveryRequirements>'
		public Keyword getSWConfigurationDeliveryRequirementsKeyword_5() { return cSWConfigurationDeliveryRequirementsKeyword_5; }
	}
	public class VSRSDataDefinitionDBRequirementsElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.micobs.svm.lang.srs.SRS.VSRSDataDefinitionDBRequirements");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cVSRSDataDefinitionDBRequirementsAction_0 = (Action)cGroup.eContents().get(0);
		private final Keyword cDataDefinitionDBRequirementsKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cSectionDescriptionAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cSectionDescriptionDBodyParserRuleCall_2_0 = (RuleCall)cSectionDescriptionAssignment_2.eContents().get(0);
		private final Assignment cSrsItemsAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cSrsItemsVSRSDocumentItemParserRuleCall_3_0 = (RuleCall)cSrsItemsAssignment_3.eContents().get(0);
		private final Assignment cSrsRequirementSubsectionsAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cSrsRequirementSubsectionsVSRSInstantiableRequirementSectionParserRuleCall_4_0 = (RuleCall)cSrsRequirementSubsectionsAssignment_4.eContents().get(0);
		private final Keyword cDataDefinitionDBRequirementsKeyword_5 = (Keyword)cGroup.eContents().get(5);
		
		//VSRSDataDefinitionDBRequirements:
		//	{VSRSDataDefinitionDBRequirements}
		//	'<DataDefinitionDBRequirements>'
		//	sectionDescription=DBody?
		//	srsItems+=VSRSDocumentItem*
		//	srsRequirementSubsections+=VSRSInstantiableRequirementSection*
		//	'</DataDefinitionDBRequirements>';
		@Override public ParserRule getRule() { return rule; }
		
		//{VSRSDataDefinitionDBRequirements} '<DataDefinitionDBRequirements>' sectionDescription=DBody?
		//srsItems+=VSRSDocumentItem* srsRequirementSubsections+=VSRSInstantiableRequirementSection*
		//'</DataDefinitionDBRequirements>'
		public Group getGroup() { return cGroup; }
		
		//{VSRSDataDefinitionDBRequirements}
		public Action getVSRSDataDefinitionDBRequirementsAction_0() { return cVSRSDataDefinitionDBRequirementsAction_0; }
		
		//'<DataDefinitionDBRequirements>'
		public Keyword getDataDefinitionDBRequirementsKeyword_1() { return cDataDefinitionDBRequirementsKeyword_1; }
		
		//sectionDescription=DBody?
		public Assignment getSectionDescriptionAssignment_2() { return cSectionDescriptionAssignment_2; }
		
		//DBody
		public RuleCall getSectionDescriptionDBodyParserRuleCall_2_0() { return cSectionDescriptionDBodyParserRuleCall_2_0; }
		
		//srsItems+=VSRSDocumentItem*
		public Assignment getSrsItemsAssignment_3() { return cSrsItemsAssignment_3; }
		
		//VSRSDocumentItem
		public RuleCall getSrsItemsVSRSDocumentItemParserRuleCall_3_0() { return cSrsItemsVSRSDocumentItemParserRuleCall_3_0; }
		
		//srsRequirementSubsections+=VSRSInstantiableRequirementSection*
		public Assignment getSrsRequirementSubsectionsAssignment_4() { return cSrsRequirementSubsectionsAssignment_4; }
		
		//VSRSInstantiableRequirementSection
		public RuleCall getSrsRequirementSubsectionsVSRSInstantiableRequirementSectionParserRuleCall_4_0() { return cSrsRequirementSubsectionsVSRSInstantiableRequirementSectionParserRuleCall_4_0; }
		
		//'</DataDefinitionDBRequirements>'
		public Keyword getDataDefinitionDBRequirementsKeyword_5() { return cDataDefinitionDBRequirementsKeyword_5; }
	}
	public class VSRSHumanFactorsRequirementsElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.micobs.svm.lang.srs.SRS.VSRSHumanFactorsRequirements");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cVSRSHumanFactorsRequirementsAction_0 = (Action)cGroup.eContents().get(0);
		private final Keyword cHumanFactorsRequirementsKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cSectionDescriptionAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cSectionDescriptionDBodyParserRuleCall_2_0 = (RuleCall)cSectionDescriptionAssignment_2.eContents().get(0);
		private final Assignment cSrsItemsAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cSrsItemsVSRSDocumentItemParserRuleCall_3_0 = (RuleCall)cSrsItemsAssignment_3.eContents().get(0);
		private final Assignment cSrsRequirementSubsectionsAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cSrsRequirementSubsectionsVSRSInstantiableRequirementSectionParserRuleCall_4_0 = (RuleCall)cSrsRequirementSubsectionsAssignment_4.eContents().get(0);
		private final Keyword cHumanFactorsRequirementsKeyword_5 = (Keyword)cGroup.eContents().get(5);
		
		//VSRSHumanFactorsRequirements:
		//	{VSRSHumanFactorsRequirements}
		//	'<HumanFactorsRequirements>'
		//	sectionDescription=DBody?
		//	srsItems+=VSRSDocumentItem*
		//	srsRequirementSubsections+=VSRSInstantiableRequirementSection*
		//	'</HumanFactorsRequirements>';
		@Override public ParserRule getRule() { return rule; }
		
		//{VSRSHumanFactorsRequirements} '<HumanFactorsRequirements>' sectionDescription=DBody? srsItems+=VSRSDocumentItem*
		//srsRequirementSubsections+=VSRSInstantiableRequirementSection* '</HumanFactorsRequirements>'
		public Group getGroup() { return cGroup; }
		
		//{VSRSHumanFactorsRequirements}
		public Action getVSRSHumanFactorsRequirementsAction_0() { return cVSRSHumanFactorsRequirementsAction_0; }
		
		//'<HumanFactorsRequirements>'
		public Keyword getHumanFactorsRequirementsKeyword_1() { return cHumanFactorsRequirementsKeyword_1; }
		
		//sectionDescription=DBody?
		public Assignment getSectionDescriptionAssignment_2() { return cSectionDescriptionAssignment_2; }
		
		//DBody
		public RuleCall getSectionDescriptionDBodyParserRuleCall_2_0() { return cSectionDescriptionDBodyParserRuleCall_2_0; }
		
		//srsItems+=VSRSDocumentItem*
		public Assignment getSrsItemsAssignment_3() { return cSrsItemsAssignment_3; }
		
		//VSRSDocumentItem
		public RuleCall getSrsItemsVSRSDocumentItemParserRuleCall_3_0() { return cSrsItemsVSRSDocumentItemParserRuleCall_3_0; }
		
		//srsRequirementSubsections+=VSRSInstantiableRequirementSection*
		public Assignment getSrsRequirementSubsectionsAssignment_4() { return cSrsRequirementSubsectionsAssignment_4; }
		
		//VSRSInstantiableRequirementSection
		public RuleCall getSrsRequirementSubsectionsVSRSInstantiableRequirementSectionParserRuleCall_4_0() { return cSrsRequirementSubsectionsVSRSInstantiableRequirementSectionParserRuleCall_4_0; }
		
		//'</HumanFactorsRequirements>'
		public Keyword getHumanFactorsRequirementsKeyword_5() { return cHumanFactorsRequirementsKeyword_5; }
	}
	public class VSRSAdaptationInstallationRequirementsElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.micobs.svm.lang.srs.SRS.VSRSAdaptationInstallationRequirements");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cVSRSAdaptationInstallationRequirementsAction_0 = (Action)cGroup.eContents().get(0);
		private final Keyword cAdaptationInstallationRequirementsKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cSectionDescriptionAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cSectionDescriptionDBodyParserRuleCall_2_0 = (RuleCall)cSectionDescriptionAssignment_2.eContents().get(0);
		private final Assignment cSrsItemsAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cSrsItemsVSRSDocumentItemParserRuleCall_3_0 = (RuleCall)cSrsItemsAssignment_3.eContents().get(0);
		private final Assignment cSrsRequirementSubsectionsAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cSrsRequirementSubsectionsVSRSInstantiableRequirementSectionParserRuleCall_4_0 = (RuleCall)cSrsRequirementSubsectionsAssignment_4.eContents().get(0);
		private final Keyword cAdaptationInstallationRequirementsKeyword_5 = (Keyword)cGroup.eContents().get(5);
		
		//VSRSAdaptationInstallationRequirements:
		//	{VSRSAdaptationInstallationRequirements}
		//	'<AdaptationInstallationRequirements>'
		//	sectionDescription=DBody?
		//	srsItems+=VSRSDocumentItem*
		//	srsRequirementSubsections+=VSRSInstantiableRequirementSection*
		//	'<AdaptationInstallationRequirements>';
		@Override public ParserRule getRule() { return rule; }
		
		//{VSRSAdaptationInstallationRequirements} '<AdaptationInstallationRequirements>' sectionDescription=DBody?
		//srsItems+=VSRSDocumentItem* srsRequirementSubsections+=VSRSInstantiableRequirementSection*
		//'<AdaptationInstallationRequirements>'
		public Group getGroup() { return cGroup; }
		
		//{VSRSAdaptationInstallationRequirements}
		public Action getVSRSAdaptationInstallationRequirementsAction_0() { return cVSRSAdaptationInstallationRequirementsAction_0; }
		
		//'<AdaptationInstallationRequirements>'
		public Keyword getAdaptationInstallationRequirementsKeyword_1() { return cAdaptationInstallationRequirementsKeyword_1; }
		
		//sectionDescription=DBody?
		public Assignment getSectionDescriptionAssignment_2() { return cSectionDescriptionAssignment_2; }
		
		//DBody
		public RuleCall getSectionDescriptionDBodyParserRuleCall_2_0() { return cSectionDescriptionDBodyParserRuleCall_2_0; }
		
		//srsItems+=VSRSDocumentItem*
		public Assignment getSrsItemsAssignment_3() { return cSrsItemsAssignment_3; }
		
		//VSRSDocumentItem
		public RuleCall getSrsItemsVSRSDocumentItemParserRuleCall_3_0() { return cSrsItemsVSRSDocumentItemParserRuleCall_3_0; }
		
		//srsRequirementSubsections+=VSRSInstantiableRequirementSection*
		public Assignment getSrsRequirementSubsectionsAssignment_4() { return cSrsRequirementSubsectionsAssignment_4; }
		
		//VSRSInstantiableRequirementSection
		public RuleCall getSrsRequirementSubsectionsVSRSInstantiableRequirementSectionParserRuleCall_4_0() { return cSrsRequirementSubsectionsVSRSInstantiableRequirementSectionParserRuleCall_4_0; }
		
		//'<AdaptationInstallationRequirements>'
		public Keyword getAdaptationInstallationRequirementsKeyword_5() { return cAdaptationInstallationRequirementsKeyword_5; }
	}
	public class VSRSDocumentItemElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.micobs.svm.lang.srs.SRS.VSRSDocumentItem");
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
		private final Keyword cParentItemKeyword_9_0 = (Keyword)cGroup_9.eContents().get(0);
		private final Keyword cNameKeyword_9_1 = (Keyword)cGroup_9.eContents().get(1);
		private final Assignment cParentItemAssignment_9_2 = (Assignment)cGroup_9.eContents().get(2);
		private final CrossReference cParentItemVTraceableDocumentAbstractItemCrossReference_9_2_0 = (CrossReference)cParentItemAssignment_9_2.eContents().get(0);
		private final RuleCall cParentItemVTraceableDocumentAbstractItemSTRINGTerminalRuleCall_9_2_0_1 = (RuleCall)cParentItemVTraceableDocumentAbstractItemCrossReference_9_2_0.eContents().get(1);
		private final Keyword cSolidusGreaterThanSignKeyword_9_3 = (Keyword)cGroup_9.eContents().get(3);
		private final Assignment cExtendedDescriptionAssignment_10 = (Assignment)cGroup.eContents().get(10);
		private final RuleCall cExtendedDescriptionDBodyParserRuleCall_10_0 = (RuleCall)cExtendedDescriptionAssignment_10.eContents().get(0);
		private final Keyword cItemKeyword_11 = (Keyword)cGroup.eContents().get(11);
		
		//VSRSDocumentItem:
		//	'<Item'
		//	'name=' name=STRING
		//	'validationMethod=' validationMethod=VValidationMethod
		//	'>'
		//	'<description>'
		//	description=DBody
		//	'</description>' ('<parentItem' 'name=' parentItem+=[tdm::VTraceableDocumentAbstractItem|STRING] '/>')*
		//	extendedDescription=DBody?
		//	'</Item>';
		@Override public ParserRule getRule() { return rule; }
		
		//'<Item' 'name=' name=STRING 'validationMethod=' validationMethod=VValidationMethod '>' '<description>' description=DBody
		//'</description>' ('<parentItem' 'name=' parentItem+=[tdm::VTraceableDocumentAbstractItem|STRING] '/>')*
		//extendedDescription=DBody? '</Item>'
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
		
		//('<parentItem' 'name=' parentItem+=[tdm::VTraceableDocumentAbstractItem|STRING] '/>')*
		public Group getGroup_9() { return cGroup_9; }
		
		//'<parentItem'
		public Keyword getParentItemKeyword_9_0() { return cParentItemKeyword_9_0; }
		
		//'name='
		public Keyword getNameKeyword_9_1() { return cNameKeyword_9_1; }
		
		//parentItem+=[tdm::VTraceableDocumentAbstractItem|STRING]
		public Assignment getParentItemAssignment_9_2() { return cParentItemAssignment_9_2; }
		
		//[tdm::VTraceableDocumentAbstractItem|STRING]
		public CrossReference getParentItemVTraceableDocumentAbstractItemCrossReference_9_2_0() { return cParentItemVTraceableDocumentAbstractItemCrossReference_9_2_0; }
		
		//STRING
		public RuleCall getParentItemVTraceableDocumentAbstractItemSTRINGTerminalRuleCall_9_2_0_1() { return cParentItemVTraceableDocumentAbstractItemSTRINGTerminalRuleCall_9_2_0_1; }
		
		//'/>'
		public Keyword getSolidusGreaterThanSignKeyword_9_3() { return cSolidusGreaterThanSignKeyword_9_3; }
		
		//extendedDescription=DBody?
		public Assignment getExtendedDescriptionAssignment_10() { return cExtendedDescriptionAssignment_10; }
		
		//DBody
		public RuleCall getExtendedDescriptionDBodyParserRuleCall_10_0() { return cExtendedDescriptionDBodyParserRuleCall_10_0; }
		
		//'</Item>'
		public Keyword getItemKeyword_11() { return cItemKeyword_11; }
	}
	public class VSRSLogicalModelElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.micobs.svm.lang.srs.SRS.VSRSLogicalModel");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cVSRSLogicalModelAction_0 = (Action)cGroup.eContents().get(0);
		private final Keyword cLogicalModelKeyword_1 = (Keyword)cGroup.eContents().get(1);
		
		//VSRSLogicalModel:
		//	{VSRSLogicalModel}
		//	'<LogicalModel/>';
		@Override public ParserRule getRule() { return rule; }
		
		//{VSRSLogicalModel} '<LogicalModel/>'
		public Group getGroup() { return cGroup; }
		
		//{VSRSLogicalModel}
		public Action getVSRSLogicalModelAction_0() { return cVSRSLogicalModelAction_0; }
		
		//'<LogicalModel/>'
		public Keyword getLogicalModelKeyword_1() { return cLogicalModelKeyword_1; }
	}
	
	public class VValidationMethodElements extends AbstractEnumRuleElementFinder {
		private final EnumRule rule = (EnumRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.micobs.svm.lang.srs.SRS.VValidationMethod");
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
	
	private final VSRSDocumentElements pVSRSDocument;
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
	private final DFigureFromFileElements pDFigureFromFile;
	private final DTableFromFileElements pDTableFromFile;
	private final DBasicTableElements pDBasicTable;
	private final DRowElements pDRow;
	private final DColumnElements pDColumn;
	private final DCellElements pDCell;
	private final DApplicableDocumentElements pDApplicableDocument;
	private final DReferenceDocumentElements pDReferenceDocument;
	private final VSRSFixedSectionElements pVSRSFixedSection;
	private final VSRSInstantiableSectionElements pVSRSInstantiableSection;
	private final VSRSIntroductionElements pVSRSIntroduction;
	private final VSRSApplicableDocumentsElements pVSRSApplicableDocuments;
	private final VSRSReferenceDocumentsElements pVSRSReferenceDocuments;
	private final VSRSTermsDefinitionsAbbreviationsElements pVSRSTermsDefinitionsAbbreviations;
	private final VSRSSoftwareOverviewElements pVSRSSoftwareOverview;
	private final VSRSRequirementsElements pVSRSRequirements;
	private final VSRSTraceabiltyElements pVSRSTraceabilty;
	private final VSRSLogicalModelsElements pVSRSLogicalModels;
	private final VSRSTermElements pVSRSTerm;
	private final VSRSDefinitionElements pVSRSDefinition;
	private final VSRSAbbreviationElements pVSRSAbbreviation;
	private final VSRSInstantiableRequirementSectionElements pVSRSInstantiableRequirementSection;
	private final VSRSGeneralRequirementsElements pVSRSGeneralRequirements;
	private final VSRSFunctionalRequirementsElements pVSRSFunctionalRequirements;
	private final VSRSPerformanceRequirementsElements pVSRSPerformanceRequirements;
	private final VSRSInterfaceRequirementsElements pVSRSInterfaceRequirements;
	private final VSRSOperationalRequirementsElements pVSRSOperationalRequirements;
	private final VSRSResourcesRequirementsElements pVSRSResourcesRequirements;
	private final VSRSDesignRequirementsElements pVSRSDesignRequirements;
	private final VSRSSecurityPrivacyRequirementsElements pVSRSSecurityPrivacyRequirements;
	private final VSRSPortabilityRequirementsElements pVSRSPortabilityRequirements;
	private final VSRSSWQualityRequirementsElements pVSRSSWQualityRequirements;
	private final VSRSSWReliabiltyRequirementsElements pVSRSSWReliabiltyRequirements;
	private final VSRSSWMaintainabilityRequirementsElements pVSRSSWMaintainabilityRequirements;
	private final VSRSSWSafetyRequirementsElements pVSRSSWSafetyRequirements;
	private final VSRSSWConfigurationDeliveryRequirementsElements pVSRSSWConfigurationDeliveryRequirements;
	private final VSRSDataDefinitionDBRequirementsElements pVSRSDataDefinitionDBRequirements;
	private final VSRSHumanFactorsRequirementsElements pVSRSHumanFactorsRequirements;
	private final VSRSAdaptationInstallationRequirementsElements pVSRSAdaptationInstallationRequirements;
	private final VSRSDocumentItemElements pVSRSDocumentItem;
	private final VValidationMethodElements eVValidationMethod;
	private final VSRSLogicalModelElements pVSRSLogicalModel;
	
	private final Grammar grammar;
	
	private final TerminalsGrammarAccess gaTerminals;

	@Inject
	public SRSGrammarAccess(GrammarProvider grammarProvider,
			TerminalsGrammarAccess gaTerminals) {
		this.grammar = internalFindGrammar(grammarProvider);
		this.gaTerminals = gaTerminals;
		this.pVSRSDocument = new VSRSDocumentElements();
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
		this.tRUNTEXT = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.micobs.svm.lang.srs.SRS.RUNTEXT");
		this.pDFigureFromFile = new DFigureFromFileElements();
		this.pDTableFromFile = new DTableFromFileElements();
		this.pDBasicTable = new DBasicTableElements();
		this.pDRow = new DRowElements();
		this.pDColumn = new DColumnElements();
		this.pDCell = new DCellElements();
		this.pDApplicableDocument = new DApplicableDocumentElements();
		this.pDReferenceDocument = new DReferenceDocumentElements();
		this.pVSRSFixedSection = new VSRSFixedSectionElements();
		this.pVSRSInstantiableSection = new VSRSInstantiableSectionElements();
		this.pVSRSIntroduction = new VSRSIntroductionElements();
		this.pVSRSApplicableDocuments = new VSRSApplicableDocumentsElements();
		this.pVSRSReferenceDocuments = new VSRSReferenceDocumentsElements();
		this.pVSRSTermsDefinitionsAbbreviations = new VSRSTermsDefinitionsAbbreviationsElements();
		this.pVSRSSoftwareOverview = new VSRSSoftwareOverviewElements();
		this.pVSRSRequirements = new VSRSRequirementsElements();
		this.pVSRSTraceabilty = new VSRSTraceabiltyElements();
		this.pVSRSLogicalModels = new VSRSLogicalModelsElements();
		this.pVSRSTerm = new VSRSTermElements();
		this.pVSRSDefinition = new VSRSDefinitionElements();
		this.pVSRSAbbreviation = new VSRSAbbreviationElements();
		this.pVSRSInstantiableRequirementSection = new VSRSInstantiableRequirementSectionElements();
		this.pVSRSGeneralRequirements = new VSRSGeneralRequirementsElements();
		this.pVSRSFunctionalRequirements = new VSRSFunctionalRequirementsElements();
		this.pVSRSPerformanceRequirements = new VSRSPerformanceRequirementsElements();
		this.pVSRSInterfaceRequirements = new VSRSInterfaceRequirementsElements();
		this.pVSRSOperationalRequirements = new VSRSOperationalRequirementsElements();
		this.pVSRSResourcesRequirements = new VSRSResourcesRequirementsElements();
		this.pVSRSDesignRequirements = new VSRSDesignRequirementsElements();
		this.pVSRSSecurityPrivacyRequirements = new VSRSSecurityPrivacyRequirementsElements();
		this.pVSRSPortabilityRequirements = new VSRSPortabilityRequirementsElements();
		this.pVSRSSWQualityRequirements = new VSRSSWQualityRequirementsElements();
		this.pVSRSSWReliabiltyRequirements = new VSRSSWReliabiltyRequirementsElements();
		this.pVSRSSWMaintainabilityRequirements = new VSRSSWMaintainabilityRequirementsElements();
		this.pVSRSSWSafetyRequirements = new VSRSSWSafetyRequirementsElements();
		this.pVSRSSWConfigurationDeliveryRequirements = new VSRSSWConfigurationDeliveryRequirementsElements();
		this.pVSRSDataDefinitionDBRequirements = new VSRSDataDefinitionDBRequirementsElements();
		this.pVSRSHumanFactorsRequirements = new VSRSHumanFactorsRequirementsElements();
		this.pVSRSAdaptationInstallationRequirements = new VSRSAdaptationInstallationRequirementsElements();
		this.pVSRSDocumentItem = new VSRSDocumentItemElements();
		this.eVValidationMethod = new VValidationMethodElements();
		this.pVSRSLogicalModel = new VSRSLogicalModelElements();
	}
	
	protected Grammar internalFindGrammar(GrammarProvider grammarProvider) {
		Grammar grammar = grammarProvider.getGrammar(this);
		while (grammar != null) {
			if ("es.uah.aut.srg.micobs.svm.lang.srs.SRS".equals(grammar.getName())) {
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

	
	//VSRSDocument:
	//	'<SRS'
	//	'name=' name=STRING
	//	'id=' id=STRING
	//	'issue=' issue=STRING
	//	'revision=' revision=STRING
	//	'date=' date=STRING
	//	'>'
	//	introductionSection=VSRSIntroduction
	//	applicableDocumentsSection=VSRSApplicableDocuments
	//	referenceDocumentsSection=VSRSReferenceDocuments
	//	termsDefinitionsAbbreviationsSection=VSRSTermsDefinitionsAbbreviations
	//	generalDescriptionSection=VSRSSoftwareOverview
	//	requirementsSection=VSRSRequirements
	//	traceabiltySection=VSRSTraceabilty
	//	logicalModelsSection=VSRSLogicalModels ('<parent' 'name=' parents+=[tdm::VTraceableDocument|STRING] '/>')*
	//	'</SRS>';
	public VSRSDocumentElements getVSRSDocumentAccess() {
		return pVSRSDocument;
	}
	
	public ParserRule getVSRSDocumentRule() {
		return getVSRSDocumentAccess().getRule();
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
	//	DParagraph | DItemize | DEnumerate | DFigureFromFile | DTableFromFile | DBasicTable
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
	
	//DFigureFromFile doc::DFigureFromFile:
	//	'<figure'
	//	'name=' name=STRING
	//	'referenceFile=' referenceFile=STRING ('caption=' caption=STRING)?
	//	'/>'
	public DFigureFromFileElements getDFigureFromFileAccess() {
		return pDFigureFromFile;
	}
	
	public ParserRule getDFigureFromFileRule() {
		return getDFigureFromFileAccess().getRule();
	}
	
	//DTableFromFile doc::DTableFromFile:
	//	'<pictureAsTable'
	//	'name=' name=STRING
	//	'referenceFile=' referenceFile=STRING ('caption=' caption=STRING)?
	//	'/>'
	public DTableFromFileElements getDTableFromFileAccess() {
		return pDTableFromFile;
	}
	
	public ParserRule getDTableFromFileRule() {
		return getDTableFromFileAccess().getRule();
	}
	
	//DBasicTable doc::DBasicTable:
	//	'<basicTable'
	//	'name=' name=STRING ('caption=' caption=STRING)?
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
	//	'id=' id=STRING ('issue=' issue=STRING
	//	'revision=' revision=STRING)? ('date=' date=STRING)?
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
	//	'id=' id=STRING ('issue=' issue=STRING
	//	'revision=' revision=STRING)? ('date=' date=STRING)?
	//	'/>'
	public DReferenceDocumentElements getDReferenceDocumentAccess() {
		return pDReferenceDocument;
	}
	
	public ParserRule getDReferenceDocumentRule() {
		return getDReferenceDocumentAccess().getRule();
	}
	
	//VSRSFixedSection:
	//	body=DBody
	//	srsInstatiableSubsections+=VSRSInstantiableSection*;
	public VSRSFixedSectionElements getVSRSFixedSectionAccess() {
		return pVSRSFixedSection;
	}
	
	public ParserRule getVSRSFixedSectionRule() {
		return getVSRSFixedSectionAccess().getRule();
	}
	
	//VSRSInstantiableSection:
	//	'<subsection'
	//	'name=' name=STRING
	//	'>'
	//	body=DBody
	//	'</subsection>';
	public VSRSInstantiableSectionElements getVSRSInstantiableSectionAccess() {
		return pVSRSInstantiableSection;
	}
	
	public ParserRule getVSRSInstantiableSectionRule() {
		return getVSRSInstantiableSectionAccess().getRule();
	}
	
	//VSRSIntroduction:
	//	'<Introduction>'
	//	srsInstatiableSubsections+=VSRSInstantiableSection+
	//	'</Introduction>';
	public VSRSIntroductionElements getVSRSIntroductionAccess() {
		return pVSRSIntroduction;
	}
	
	public ParserRule getVSRSIntroductionRule() {
		return getVSRSIntroductionAccess().getRule();
	}
	
	//VSRSApplicableDocuments:
	//	{VSRSApplicableDocuments}
	//	'<ApplicableDocuments>'
	//	applicableDocuments+=DApplicableDocument*
	//	'</ApplicableDocuments>';
	public VSRSApplicableDocumentsElements getVSRSApplicableDocumentsAccess() {
		return pVSRSApplicableDocuments;
	}
	
	public ParserRule getVSRSApplicableDocumentsRule() {
		return getVSRSApplicableDocumentsAccess().getRule();
	}
	
	//VSRSReferenceDocuments:
	//	{VSRSReferenceDocuments}
	//	'<ReferenceDocuments>'
	//	referenceDocuments+=DReferenceDocument*
	//	'</ReferenceDocuments>';
	public VSRSReferenceDocumentsElements getVSRSReferenceDocumentsAccess() {
		return pVSRSReferenceDocuments;
	}
	
	public ParserRule getVSRSReferenceDocumentsRule() {
		return getVSRSReferenceDocumentsAccess().getRule();
	}
	
	//VSRSTermsDefinitionsAbbreviations:
	//	{VSRSTermsDefinitionsAbbreviations}
	//	'<TermsDefinitionsAbbreviations>'
	//	terms+=VSRSTerm*
	//	definitions+=VSRSDefinition*
	//	abbreviations+=VSRSAbbreviation*
	//	'</TermsDefinitionsAbbreviations>';
	public VSRSTermsDefinitionsAbbreviationsElements getVSRSTermsDefinitionsAbbreviationsAccess() {
		return pVSRSTermsDefinitionsAbbreviations;
	}
	
	public ParserRule getVSRSTermsDefinitionsAbbreviationsRule() {
		return getVSRSTermsDefinitionsAbbreviationsAccess().getRule();
	}
	
	//VSRSSoftwareOverview:
	//	'<SoftwareOverview>'
	//	'<functionPurpose>' functionPurpose=VSRSFixedSection '</functionPurpose>'
	//	'<environmentalConsideration>' environmentalConsideration=VSRSFixedSection '</environmentalConsideration>'
	//	'<relationOtherSystems>' relationOtherSystems=VSRSFixedSection '</relationOtherSystems>'
	//	'<constraints>' constraints=VSRSFixedSection '</constraints>'
	//	'</SoftwareOverview>';
	public VSRSSoftwareOverviewElements getVSRSSoftwareOverviewAccess() {
		return pVSRSSoftwareOverview;
	}
	
	public ParserRule getVSRSSoftwareOverviewRule() {
		return getVSRSSoftwareOverviewAccess().getRule();
	}
	
	//VSRSRequirements:
	//	'<Requirements>'
	//	sectionDescription=DBody?
	//	general=VSRSGeneralRequirements
	//	functional=VSRSFunctionalRequirements
	//	performance=VSRSPerformanceRequirements
	//	interface=VSRSInterfaceRequirements
	//	operational=VSRSOperationalRequirements
	//	resources=VSRSResourcesRequirements
	//	design=VSRSDesignRequirements
	//	securityPrivacy=VSRSSecurityPrivacyRequirements
	//	portability=VSRSPortabilityRequirements
	//	swQuality=VSRSSWQualityRequirements
	//	swReliabilty=VSRSSWReliabiltyRequirements
	//	swMaintainability=VSRSSWMaintainabilityRequirements
	//	swSafety=VSRSSWSafetyRequirements
	//	swConfigurationDelivery=VSRSSWConfigurationDeliveryRequirements
	//	dataDefinitionDB=VSRSDataDefinitionDBRequirements
	//	humanFactors=VSRSHumanFactorsRequirements
	//	adaptationInstallation=VSRSAdaptationInstallationRequirements
	//	'</Requirements>';
	public VSRSRequirementsElements getVSRSRequirementsAccess() {
		return pVSRSRequirements;
	}
	
	public ParserRule getVSRSRequirementsRule() {
		return getVSRSRequirementsAccess().getRule();
	}
	
	//VSRSTraceabilty:
	//	'<Traceabilty>'
	//	sectionDescription=DBody
	//	'</Traceabilty>';
	public VSRSTraceabiltyElements getVSRSTraceabiltyAccess() {
		return pVSRSTraceabilty;
	}
	
	public ParserRule getVSRSTraceabiltyRule() {
		return getVSRSTraceabiltyAccess().getRule();
	}
	
	//VSRSLogicalModels:
	//	{VSRSLogicalModels}
	//	'<LogicalModels>'
	//	logicalModels+=VSRSLogicalModel*
	//	'</LogicalModels>';
	public VSRSLogicalModelsElements getVSRSLogicalModelsAccess() {
		return pVSRSLogicalModels;
	}
	
	public ParserRule getVSRSLogicalModelsRule() {
		return getVSRSLogicalModelsAccess().getRule();
	}
	
	//VSRSTerm:
	//	'<Term'
	//	'name=' name=STRING '>'
	//	description=DRun
	//	'</Term>';
	public VSRSTermElements getVSRSTermAccess() {
		return pVSRSTerm;
	}
	
	public ParserRule getVSRSTermRule() {
		return getVSRSTermAccess().getRule();
	}
	
	//VSRSDefinition:
	//	'<Definition'
	//	'name=' name=STRING '>'
	//	description=DRun
	//	'</Definition>';
	public VSRSDefinitionElements getVSRSDefinitionAccess() {
		return pVSRSDefinition;
	}
	
	public ParserRule getVSRSDefinitionRule() {
		return getVSRSDefinitionAccess().getRule();
	}
	
	//VSRSAbbreviation:
	//	'<Abbreviation'
	//	'name=' name=STRING '>'
	//	description=DRun
	//	'</Abbreviation>';
	public VSRSAbbreviationElements getVSRSAbbreviationAccess() {
		return pVSRSAbbreviation;
	}
	
	public ParserRule getVSRSAbbreviationRule() {
		return getVSRSAbbreviationAccess().getRule();
	}
	
	//VSRSInstantiableRequirementSection:
	//	'<subsection'
	//	'name=' name=STRING
	//	'>'
	//	sectionDescription=DBody?
	//	srsItems+=VSRSDocumentItem*
	//	'</subsection>';
	public VSRSInstantiableRequirementSectionElements getVSRSInstantiableRequirementSectionAccess() {
		return pVSRSInstantiableRequirementSection;
	}
	
	public ParserRule getVSRSInstantiableRequirementSectionRule() {
		return getVSRSInstantiableRequirementSectionAccess().getRule();
	}
	
	//VSRSGeneralRequirements:
	//	{VSRSGeneralRequirements}
	//	'<GeneralRequirements>'
	//	sectionDescription=DBody?
	//	srsItems+=VSRSDocumentItem*
	//	srsRequirementSubsections+=VSRSInstantiableRequirementSection*
	//	'</GeneralRequirements>';
	public VSRSGeneralRequirementsElements getVSRSGeneralRequirementsAccess() {
		return pVSRSGeneralRequirements;
	}
	
	public ParserRule getVSRSGeneralRequirementsRule() {
		return getVSRSGeneralRequirementsAccess().getRule();
	}
	
	//VSRSFunctionalRequirements:
	//	{VSRSFunctionalRequirements}
	//	'<FunctionalRequirements>'
	//	sectionDescription=DBody?
	//	srsItems+=VSRSDocumentItem*
	//	srsRequirementSubsections+=VSRSInstantiableRequirementSection*
	//	'</FunctionalRequirements>';
	public VSRSFunctionalRequirementsElements getVSRSFunctionalRequirementsAccess() {
		return pVSRSFunctionalRequirements;
	}
	
	public ParserRule getVSRSFunctionalRequirementsRule() {
		return getVSRSFunctionalRequirementsAccess().getRule();
	}
	
	//VSRSPerformanceRequirements:
	//	{VSRSPerformanceRequirements}
	//	'<PerformanceRequirements>'
	//	sectionDescription=DBody?
	//	srsItems+=VSRSDocumentItem*
	//	srsRequirementSubsections+=VSRSInstantiableRequirementSection*
	//	'</PerformanceRequirements>';
	public VSRSPerformanceRequirementsElements getVSRSPerformanceRequirementsAccess() {
		return pVSRSPerformanceRequirements;
	}
	
	public ParserRule getVSRSPerformanceRequirementsRule() {
		return getVSRSPerformanceRequirementsAccess().getRule();
	}
	
	//VSRSInterfaceRequirements:
	//	{VSRSInterfaceRequirements}
	//	'<InterfaceRequirements>'
	//	sectionDescription=DBody?
	//	srsItems+=VSRSDocumentItem*
	//	srsRequirementSubsections+=VSRSInstantiableRequirementSection*
	//	'</InterfaceRequirements>';
	public VSRSInterfaceRequirementsElements getVSRSInterfaceRequirementsAccess() {
		return pVSRSInterfaceRequirements;
	}
	
	public ParserRule getVSRSInterfaceRequirementsRule() {
		return getVSRSInterfaceRequirementsAccess().getRule();
	}
	
	//VSRSOperationalRequirements:
	//	{VSRSOperationalRequirements}
	//	'<OperationalRequirements>'
	//	sectionDescription=DBody?
	//	srsItems+=VSRSDocumentItem*
	//	srsRequirementSubsections+=VSRSInstantiableRequirementSection*
	//	'</OperationalRequirements>';
	public VSRSOperationalRequirementsElements getVSRSOperationalRequirementsAccess() {
		return pVSRSOperationalRequirements;
	}
	
	public ParserRule getVSRSOperationalRequirementsRule() {
		return getVSRSOperationalRequirementsAccess().getRule();
	}
	
	//VSRSResourcesRequirements:
	//	{VSRSResourcesRequirements}
	//	'<ResourcesRequirements>'
	//	sectionDescription=DBody?
	//	srsItems+=VSRSDocumentItem*
	//	srsRequirementSubsections+=VSRSInstantiableRequirementSection*
	//	'</ResourcesRequirements>';
	public VSRSResourcesRequirementsElements getVSRSResourcesRequirementsAccess() {
		return pVSRSResourcesRequirements;
	}
	
	public ParserRule getVSRSResourcesRequirementsRule() {
		return getVSRSResourcesRequirementsAccess().getRule();
	}
	
	//VSRSDesignRequirements:
	//	{VSRSDesignRequirements}
	//	'<DesignRequirements>'
	//	sectionDescription=DBody?
	//	srsItems+=VSRSDocumentItem*
	//	srsRequirementSubsections+=VSRSInstantiableRequirementSection*
	//	'</DesignRequirements>';
	public VSRSDesignRequirementsElements getVSRSDesignRequirementsAccess() {
		return pVSRSDesignRequirements;
	}
	
	public ParserRule getVSRSDesignRequirementsRule() {
		return getVSRSDesignRequirementsAccess().getRule();
	}
	
	//VSRSSecurityPrivacyRequirements:
	//	{VSRSSecurityPrivacyRequirements}
	//	'<SecurityPrivacyRequirements>'
	//	sectionDescription=DBody?
	//	srsItems+=VSRSDocumentItem*
	//	srsRequirementSubsections+=VSRSInstantiableRequirementSection*
	//	'</SecurityPrivacyRequirements>';
	public VSRSSecurityPrivacyRequirementsElements getVSRSSecurityPrivacyRequirementsAccess() {
		return pVSRSSecurityPrivacyRequirements;
	}
	
	public ParserRule getVSRSSecurityPrivacyRequirementsRule() {
		return getVSRSSecurityPrivacyRequirementsAccess().getRule();
	}
	
	//VSRSPortabilityRequirements:
	//	{VSRSPortabilityRequirements}
	//	'<PortabilityRequirements>'
	//	sectionDescription=DBody?
	//	srsItems+=VSRSDocumentItem*
	//	srsRequirementSubsections+=VSRSInstantiableRequirementSection*
	//	'</PortabilityRequirements>';
	public VSRSPortabilityRequirementsElements getVSRSPortabilityRequirementsAccess() {
		return pVSRSPortabilityRequirements;
	}
	
	public ParserRule getVSRSPortabilityRequirementsRule() {
		return getVSRSPortabilityRequirementsAccess().getRule();
	}
	
	//VSRSSWQualityRequirements:
	//	{VSRSSWQualityRequirements}
	//	'<SWQualityRequirements>'
	//	sectionDescription=DBody?
	//	srsItems+=VSRSDocumentItem*
	//	srsRequirementSubsections+=VSRSInstantiableRequirementSection*
	//	'</SWQualityRequirements>';
	public VSRSSWQualityRequirementsElements getVSRSSWQualityRequirementsAccess() {
		return pVSRSSWQualityRequirements;
	}
	
	public ParserRule getVSRSSWQualityRequirementsRule() {
		return getVSRSSWQualityRequirementsAccess().getRule();
	}
	
	//VSRSSWReliabiltyRequirements:
	//	{VSRSSWReliabiltyRequirements}
	//	'<SWReliabiltyRequirements>'
	//	sectionDescription=DBody?
	//	srsItems+=VSRSDocumentItem*
	//	srsRequirementSubsections+=VSRSInstantiableRequirementSection*
	//	'</SWReliabiltyRequirements>';
	public VSRSSWReliabiltyRequirementsElements getVSRSSWReliabiltyRequirementsAccess() {
		return pVSRSSWReliabiltyRequirements;
	}
	
	public ParserRule getVSRSSWReliabiltyRequirementsRule() {
		return getVSRSSWReliabiltyRequirementsAccess().getRule();
	}
	
	//VSRSSWMaintainabilityRequirements:
	//	{VSRSSWMaintainabilityRequirements}
	//	'<SWMaintainabilityRequirements>'
	//	sectionDescription=DBody?
	//	srsItems+=VSRSDocumentItem*
	//	srsRequirementSubsections+=VSRSInstantiableRequirementSection*
	//	'</SWMaintainabilityRequirements>';
	public VSRSSWMaintainabilityRequirementsElements getVSRSSWMaintainabilityRequirementsAccess() {
		return pVSRSSWMaintainabilityRequirements;
	}
	
	public ParserRule getVSRSSWMaintainabilityRequirementsRule() {
		return getVSRSSWMaintainabilityRequirementsAccess().getRule();
	}
	
	//VSRSSWSafetyRequirements:
	//	{VSRSSWSafetyRequirements}
	//	'<SWSafetyRequirements>'
	//	sectionDescription=DBody?
	//	srsItems+=VSRSDocumentItem*
	//	srsRequirementSubsections+=VSRSInstantiableRequirementSection*
	//	'</SWSafetyRequirements>';
	public VSRSSWSafetyRequirementsElements getVSRSSWSafetyRequirementsAccess() {
		return pVSRSSWSafetyRequirements;
	}
	
	public ParserRule getVSRSSWSafetyRequirementsRule() {
		return getVSRSSWSafetyRequirementsAccess().getRule();
	}
	
	//VSRSSWConfigurationDeliveryRequirements:
	//	{VSRSSWConfigurationDeliveryRequirements}
	//	'<SWConfigurationDeliveryRequirements>'
	//	sectionDescription=DBody?
	//	srsItems+=VSRSDocumentItem*
	//	srsRequirementSubsections+=VSRSInstantiableRequirementSection*
	//	'</SWConfigurationDeliveryRequirements>';
	public VSRSSWConfigurationDeliveryRequirementsElements getVSRSSWConfigurationDeliveryRequirementsAccess() {
		return pVSRSSWConfigurationDeliveryRequirements;
	}
	
	public ParserRule getVSRSSWConfigurationDeliveryRequirementsRule() {
		return getVSRSSWConfigurationDeliveryRequirementsAccess().getRule();
	}
	
	//VSRSDataDefinitionDBRequirements:
	//	{VSRSDataDefinitionDBRequirements}
	//	'<DataDefinitionDBRequirements>'
	//	sectionDescription=DBody?
	//	srsItems+=VSRSDocumentItem*
	//	srsRequirementSubsections+=VSRSInstantiableRequirementSection*
	//	'</DataDefinitionDBRequirements>';
	public VSRSDataDefinitionDBRequirementsElements getVSRSDataDefinitionDBRequirementsAccess() {
		return pVSRSDataDefinitionDBRequirements;
	}
	
	public ParserRule getVSRSDataDefinitionDBRequirementsRule() {
		return getVSRSDataDefinitionDBRequirementsAccess().getRule();
	}
	
	//VSRSHumanFactorsRequirements:
	//	{VSRSHumanFactorsRequirements}
	//	'<HumanFactorsRequirements>'
	//	sectionDescription=DBody?
	//	srsItems+=VSRSDocumentItem*
	//	srsRequirementSubsections+=VSRSInstantiableRequirementSection*
	//	'</HumanFactorsRequirements>';
	public VSRSHumanFactorsRequirementsElements getVSRSHumanFactorsRequirementsAccess() {
		return pVSRSHumanFactorsRequirements;
	}
	
	public ParserRule getVSRSHumanFactorsRequirementsRule() {
		return getVSRSHumanFactorsRequirementsAccess().getRule();
	}
	
	//VSRSAdaptationInstallationRequirements:
	//	{VSRSAdaptationInstallationRequirements}
	//	'<AdaptationInstallationRequirements>'
	//	sectionDescription=DBody?
	//	srsItems+=VSRSDocumentItem*
	//	srsRequirementSubsections+=VSRSInstantiableRequirementSection*
	//	'<AdaptationInstallationRequirements>';
	public VSRSAdaptationInstallationRequirementsElements getVSRSAdaptationInstallationRequirementsAccess() {
		return pVSRSAdaptationInstallationRequirements;
	}
	
	public ParserRule getVSRSAdaptationInstallationRequirementsRule() {
		return getVSRSAdaptationInstallationRequirementsAccess().getRule();
	}
	
	//VSRSDocumentItem:
	//	'<Item'
	//	'name=' name=STRING
	//	'validationMethod=' validationMethod=VValidationMethod
	//	'>'
	//	'<description>'
	//	description=DBody
	//	'</description>' ('<parentItem' 'name=' parentItem+=[tdm::VTraceableDocumentAbstractItem|STRING] '/>')*
	//	extendedDescription=DBody?
	//	'</Item>';
	public VSRSDocumentItemElements getVSRSDocumentItemAccess() {
		return pVSRSDocumentItem;
	}
	
	public ParserRule getVSRSDocumentItemRule() {
		return getVSRSDocumentItemAccess().getRule();
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
	
	//VSRSLogicalModel:
	//	{VSRSLogicalModel}
	//	'<LogicalModel/>';
	public VSRSLogicalModelElements getVSRSLogicalModelAccess() {
		return pVSRSLogicalModel;
	}
	
	public ParserRule getVSRSLogicalModelRule() {
		return getVSRSLogicalModelAccess().getRule();
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