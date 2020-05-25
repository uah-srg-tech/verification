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
package es.uah.aut.srg.micobs.svm.lang.svr.ide.contentassist.antlr;

import com.google.inject.Inject;
import es.uah.aut.srg.micobs.svm.lang.svr.ide.contentassist.antlr.internal.InternalSVRParser;
import es.uah.aut.srg.micobs.svm.lang.svr.services.SVRGrammarAccess;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import org.antlr.runtime.RecognitionException;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.AbstractContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.FollowElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;

public class SVRParser extends AbstractContentAssistParser {

	@Inject
	private SVRGrammarAccess grammarAccess;

	private Map<AbstractElement, String> nameMappings;

	@Override
	protected InternalSVRParser createParser() {
		InternalSVRParser result = new InternalSVRParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}

	@Override
	protected String getRuleName(AbstractElement element) {
		if (nameMappings == null) {
			nameMappings = new HashMap<AbstractElement, String>() {
				private static final long serialVersionUID = 1L;
				{
					put(grammarAccess.getDTBCAccess().getAlternatives_3(), "rule__DTBC__Alternatives_3");
					put(grammarAccess.getDTBDAccess().getAlternatives_3(), "rule__DTBD__Alternatives_3");
					put(grammarAccess.getDBodyContentAccess().getAlternatives(), "rule__DBodyContent__Alternatives");
					put(grammarAccess.getDListContentAccess().getAlternatives(), "rule__DListContent__Alternatives");
					put(grammarAccess.getDParagraphContentAccess().getAlternatives(), "rule__DParagraphContent__Alternatives");
					put(grammarAccess.getDHyperlinkAccess().getAlternatives_3(), "rule__DHyperlink__Alternatives_3");
					put(grammarAccess.getINTEGERAccess().getAlternatives(), "rule__INTEGER__Alternatives");
					put(grammarAccess.getDAlignmentAccess().getAlternatives(), "rule__DAlignment__Alternatives");
					put(grammarAccess.getDRunAttributesAccess().getAlternatives(), "rule__DRunAttributes__Alternatives");
					put(grammarAccess.getVSVRDocumentAccess().getGroup(), "rule__VSVRDocument__Group__0");
					put(grammarAccess.getVSVRDocumentAccess().getGroup_16(), "rule__VSVRDocument__Group_16__0");
					put(grammarAccess.getVSVRTBCsTBDsAccess().getGroup(), "rule__VSVRTBCsTBDs__Group__0");
					put(grammarAccess.getDTBCAccess().getGroup(), "rule__DTBC__Group__0");
					put(grammarAccess.getDTBCAccess().getGroup_3_0(), "rule__DTBC__Group_3_0__0");
					put(grammarAccess.getDTBCAccess().getGroup_3_1(), "rule__DTBC__Group_3_1__0");
					put(grammarAccess.getDTBDAccess().getGroup(), "rule__DTBD__Group__0");
					put(grammarAccess.getDTBDAccess().getGroup_3_0(), "rule__DTBD__Group_3_0__0");
					put(grammarAccess.getDTBDAccess().getGroup_3_1(), "rule__DTBD__Group_3_1__0");
					put(grammarAccess.getDBodyAccess().getGroup(), "rule__DBody__Group__0");
					put(grammarAccess.getDParagraphAccess().getGroup(), "rule__DParagraph__Group__0");
					put(grammarAccess.getDParagraphAccess().getGroup_1(), "rule__DParagraph__Group_1__0");
					put(grammarAccess.getDParagraphAccess().getGroup_2(), "rule__DParagraph__Group_2__0");
					put(grammarAccess.getDParagraphAccess().getGroup_3(), "rule__DParagraph__Group_3__0");
					put(grammarAccess.getDParagraphAccess().getGroup_4(), "rule__DParagraph__Group_4__0");
					put(grammarAccess.getDListItemAccess().getGroup(), "rule__DListItem__Group__0");
					put(grammarAccess.getDListItemAccess().getGroup_3(), "rule__DListItem__Group_3__0");
					put(grammarAccess.getDItemizeAccess().getGroup(), "rule__DItemize__Group__0");
					put(grammarAccess.getDItemizeAccess().getGroup_1(), "rule__DItemize__Group_1__0");
					put(grammarAccess.getDItemizeAccess().getGroup_2(), "rule__DItemize__Group_2__0");
					put(grammarAccess.getDItemizeAccess().getGroup_3(), "rule__DItemize__Group_3__0");
					put(grammarAccess.getDItemizeAccess().getGroup_4(), "rule__DItemize__Group_4__0");
					put(grammarAccess.getDEnumerateAccess().getGroup(), "rule__DEnumerate__Group__0");
					put(grammarAccess.getDEnumerateAccess().getGroup_1(), "rule__DEnumerate__Group_1__0");
					put(grammarAccess.getDEnumerateAccess().getGroup_2(), "rule__DEnumerate__Group_2__0");
					put(grammarAccess.getDEnumerateAccess().getGroup_3(), "rule__DEnumerate__Group_3__0");
					put(grammarAccess.getDEnumerateAccess().getGroup_4(), "rule__DEnumerate__Group_4__0");
					put(grammarAccess.getDRunAccess().getGroup(), "rule__DRun__Group__0");
					put(grammarAccess.getDRunAccess().getGroup_1(), "rule__DRun__Group_1__0");
					put(grammarAccess.getDRunAccess().getGroup_2(), "rule__DRun__Group_2__0");
					put(grammarAccess.getDRunAccess().getGroup_3(), "rule__DRun__Group_3__0");
					put(grammarAccess.getDRunAccess().getGroup_4(), "rule__DRun__Group_4__0");
					put(grammarAccess.getDHyperlinkAccess().getGroup(), "rule__DHyperlink__Group__0");
					put(grammarAccess.getDHyperlinkAccess().getGroup_3_0(), "rule__DHyperlink__Group_3_0__0");
					put(grammarAccess.getDTabAccess().getGroup(), "rule__DTab__Group__0");
					put(grammarAccess.getDFigureFromFileAccess().getGroup(), "rule__DFigureFromFile__Group__0");
					put(grammarAccess.getDFigureFromFileAccess().getGroup_9(), "rule__DFigureFromFile__Group_9__0");
					put(grammarAccess.getDFigureFromFileAccess().getGroup_10(), "rule__DFigureFromFile__Group_10__0");
					put(grammarAccess.getDFigureFromFileAccess().getGroup_11(), "rule__DFigureFromFile__Group_11__0");
					put(grammarAccess.getDFigureFromFileAccess().getGroup_12(), "rule__DFigureFromFile__Group_12__0");
					put(grammarAccess.getDTableFromFileAccess().getGroup(), "rule__DTableFromFile__Group__0");
					put(grammarAccess.getDTableFromFileAccess().getGroup_9(), "rule__DTableFromFile__Group_9__0");
					put(grammarAccess.getDTableFromFileAccess().getGroup_10(), "rule__DTableFromFile__Group_10__0");
					put(grammarAccess.getDTableFromFileAccess().getGroup_11(), "rule__DTableFromFile__Group_11__0");
					put(grammarAccess.getDTableFromFileAccess().getGroup_12(), "rule__DTableFromFile__Group_12__0");
					put(grammarAccess.getDBasicTableAccess().getGroup(), "rule__DBasicTable__Group__0");
					put(grammarAccess.getDBasicTableAccess().getGroup_3(), "rule__DBasicTable__Group_3__0");
					put(grammarAccess.getDBasicTableAccess().getGroup_4(), "rule__DBasicTable__Group_4__0");
					put(grammarAccess.getDBasicTableAccess().getGroup_5(), "rule__DBasicTable__Group_5__0");
					put(grammarAccess.getDBasicTableAccess().getGroup_6(), "rule__DBasicTable__Group_6__0");
					put(grammarAccess.getDBasicTableAccess().getGroup_7(), "rule__DBasicTable__Group_7__0");
					put(grammarAccess.getDRowAccess().getGroup(), "rule__DRow__Group__0");
					put(grammarAccess.getDCellAccess().getGroup(), "rule__DCell__Group__0");
					put(grammarAccess.getDCellAccess().getGroup_1(), "rule__DCell__Group_1__0");
					put(grammarAccess.getDCellAccess().getGroup_2(), "rule__DCell__Group_2__0");
					put(grammarAccess.getDCellAccess().getGroup_3(), "rule__DCell__Group_3__0");
					put(grammarAccess.getDCellAccess().getGroup_4(), "rule__DCell__Group_4__0");
					put(grammarAccess.getDApplicableDocumentAccess().getGroup(), "rule__DApplicableDocument__Group__0");
					put(grammarAccess.getDApplicableDocumentAccess().getGroup_7(), "rule__DApplicableDocument__Group_7__0");
					put(grammarAccess.getDApplicableDocumentAccess().getGroup_7_2(), "rule__DApplicableDocument__Group_7_2__0");
					put(grammarAccess.getDApplicableDocumentAccess().getGroup_8(), "rule__DApplicableDocument__Group_8__0");
					put(grammarAccess.getDApplicableDocumentAccess().getGroup_9(), "rule__DApplicableDocument__Group_9__0");
					put(grammarAccess.getDReferenceDocumentAccess().getGroup(), "rule__DReferenceDocument__Group__0");
					put(grammarAccess.getDReferenceDocumentAccess().getGroup_7(), "rule__DReferenceDocument__Group_7__0");
					put(grammarAccess.getDReferenceDocumentAccess().getGroup_7_2(), "rule__DReferenceDocument__Group_7_2__0");
					put(grammarAccess.getDReferenceDocumentAccess().getGroup_8(), "rule__DReferenceDocument__Group_8__0");
					put(grammarAccess.getDReferenceDocumentAccess().getGroup_9(), "rule__DReferenceDocument__Group_9__0");
					put(grammarAccess.getVSVRFixedSectionAccess().getGroup(), "rule__VSVRFixedSection__Group__0");
					put(grammarAccess.getVSVRInstantiableSectionAccess().getGroup(), "rule__VSVRInstantiableSection__Group__0");
					put(grammarAccess.getVSVRIntroductionAccess().getGroup(), "rule__VSVRIntroduction__Group__0");
					put(grammarAccess.getVSVRApplicableDocumentsAccess().getGroup(), "rule__VSVRApplicableDocuments__Group__0");
					put(grammarAccess.getVSVRReferenceDocumentsAccess().getGroup(), "rule__VSVRReferenceDocuments__Group__0");
					put(grammarAccess.getVSVRTermsDefinitionsAbbreviationsAccess().getGroup(), "rule__VSVRTermsDefinitionsAbbreviations__Group__0");
					put(grammarAccess.getVSVRTermAccess().getGroup(), "rule__VSVRTerm__Group__0");
					put(grammarAccess.getVSVRDefinitionAccess().getGroup(), "rule__VSVRDefinition__Group__0");
					put(grammarAccess.getVSVRAbbreviationAccess().getGroup(), "rule__VSVRAbbreviation__Group__0");
					put(grammarAccess.getVSVRSWValProcessVerificationAccess().getGroup(), "rule__VSVRSWValProcessVerification__Group__0");
					put(grammarAccess.getINTEGERAccess().getGroup_0(), "rule__INTEGER__Group_0__0");
					put(grammarAccess.getVSVRDocumentAccess().getNameAssignment_2(), "rule__VSVRDocument__NameAssignment_2");
					put(grammarAccess.getVSVRDocumentAccess().getIdAssignment_4(), "rule__VSVRDocument__IdAssignment_4");
					put(grammarAccess.getVSVRDocumentAccess().getIssueAssignment_6(), "rule__VSVRDocument__IssueAssignment_6");
					put(grammarAccess.getVSVRDocumentAccess().getRevisionAssignment_8(), "rule__VSVRDocument__RevisionAssignment_8");
					put(grammarAccess.getVSVRDocumentAccess().getDateAssignment_10(), "rule__VSVRDocument__DateAssignment_10");
					put(grammarAccess.getVSVRDocumentAccess().getSvsParentAssignment_14(), "rule__VSVRDocument__SvsParentAssignment_14");
					put(grammarAccess.getVSVRDocumentAccess().getTcrParentAssignment_16_2(), "rule__VSVRDocument__TcrParentAssignment_16_2");
					put(grammarAccess.getVSVRDocumentAccess().getTbcsTbdsSectionAssignment_17(), "rule__VSVRDocument__TbcsTbdsSectionAssignment_17");
					put(grammarAccess.getVSVRDocumentAccess().getIntroductionSectionAssignment_18(), "rule__VSVRDocument__IntroductionSectionAssignment_18");
					put(grammarAccess.getVSVRDocumentAccess().getApplicableDocumentsSectionAssignment_19(), "rule__VSVRDocument__ApplicableDocumentsSectionAssignment_19");
					put(grammarAccess.getVSVRDocumentAccess().getReferenceDocumentsSectionAssignment_20(), "rule__VSVRDocument__ReferenceDocumentsSectionAssignment_20");
					put(grammarAccess.getVSVRDocumentAccess().getTermsDefinitionsAbbreviationsSectionAssignment_21(), "rule__VSVRDocument__TermsDefinitionsAbbreviationsSectionAssignment_21");
					put(grammarAccess.getVSVRDocumentAccess().getSwValProcessVerificationSectionAssignment_22(), "rule__VSVRDocument__SwValProcessVerificationSectionAssignment_22");
					put(grammarAccess.getVSVRTBCsTBDsAccess().getTbcsAssignment_2(), "rule__VSVRTBCsTBDs__TbcsAssignment_2");
					put(grammarAccess.getVSVRTBCsTBDsAccess().getTbdsAssignment_3(), "rule__VSVRTBCsTBDs__TbdsAssignment_3");
					put(grammarAccess.getDTBCAccess().getNameAssignment_2(), "rule__DTBC__NameAssignment_2");
					put(grammarAccess.getDTBCAccess().getDescriptionAssignment_3_0_1(), "rule__DTBC__DescriptionAssignment_3_0_1");
					put(grammarAccess.getDTBCAccess().getParentTBCAssignment_3_1_1(), "rule__DTBC__ParentTBCAssignment_3_1_1");
					put(grammarAccess.getDTBDAccess().getNameAssignment_2(), "rule__DTBD__NameAssignment_2");
					put(grammarAccess.getDTBDAccess().getDescriptionAssignment_3_0_1(), "rule__DTBD__DescriptionAssignment_3_0_1");
					put(grammarAccess.getDTBDAccess().getParentTBDAssignment_3_1_1(), "rule__DTBD__ParentTBDAssignment_3_1_1");
					put(grammarAccess.getDBodyAccess().getBodyContentAssignment_1(), "rule__DBody__BodyContentAssignment_1");
					put(grammarAccess.getDParagraphAccess().getNameAssignment_1_1(), "rule__DParagraph__NameAssignment_1_1");
					put(grammarAccess.getDParagraphAccess().getAlignmentAssignment_2_1(), "rule__DParagraph__AlignmentAssignment_2_1");
					put(grammarAccess.getDParagraphAccess().getStyleAssignment_3_1(), "rule__DParagraph__StyleAssignment_3_1");
					put(grammarAccess.getDParagraphAccess().getIndentAssignment_4_1(), "rule__DParagraph__IndentAssignment_4_1");
					put(grammarAccess.getDParagraphAccess().getParagraphContentAssignment_6(), "rule__DParagraph__ParagraphContentAssignment_6");
					put(grammarAccess.getDListItemAccess().getParagraphAssignment_2(), "rule__DListItem__ParagraphAssignment_2");
					put(grammarAccess.getDListItemAccess().getSublistAssignment_3_1(), "rule__DListItem__SublistAssignment_3_1");
					put(grammarAccess.getDItemizeAccess().getNameAssignment_1_1(), "rule__DItemize__NameAssignment_1_1");
					put(grammarAccess.getDItemizeAccess().getAlignmentAssignment_2_1(), "rule__DItemize__AlignmentAssignment_2_1");
					put(grammarAccess.getDItemizeAccess().getStyleAssignment_3_1(), "rule__DItemize__StyleAssignment_3_1");
					put(grammarAccess.getDItemizeAccess().getIndentAssignment_4_1(), "rule__DItemize__IndentAssignment_4_1");
					put(grammarAccess.getDItemizeAccess().getItemsAssignment_6(), "rule__DItemize__ItemsAssignment_6");
					put(grammarAccess.getDEnumerateAccess().getNameAssignment_1_1(), "rule__DEnumerate__NameAssignment_1_1");
					put(grammarAccess.getDEnumerateAccess().getAlignmentAssignment_2_1(), "rule__DEnumerate__AlignmentAssignment_2_1");
					put(grammarAccess.getDEnumerateAccess().getStyleAssignment_3_1(), "rule__DEnumerate__StyleAssignment_3_1");
					put(grammarAccess.getDEnumerateAccess().getIndentAssignment_4_1(), "rule__DEnumerate__IndentAssignment_4_1");
					put(grammarAccess.getDEnumerateAccess().getItemsAssignment_6(), "rule__DEnumerate__ItemsAssignment_6");
					put(grammarAccess.getDRunAccess().getBoldAssignment_1_1(), "rule__DRun__BoldAssignment_1_1");
					put(grammarAccess.getDRunAccess().getItalicsAssignment_2_1(), "rule__DRun__ItalicsAssignment_2_1");
					put(grammarAccess.getDRunAccess().getUnderlineAssignment_3_1(), "rule__DRun__UnderlineAssignment_3_1");
					put(grammarAccess.getDRunAccess().getColorAssignment_4_1(), "rule__DRun__ColorAssignment_4_1");
					put(grammarAccess.getDRunAccess().getTabAssignment_6(), "rule__DRun__TabAssignment_6");
					put(grammarAccess.getDRunAccess().getTextAssignment_7(), "rule__DRun__TextAssignment_7");
					put(grammarAccess.getDHyperlinkAccess().getReferenceAssignment_2(), "rule__DHyperlink__ReferenceAssignment_2");
					put(grammarAccess.getDHyperlinkAccess().getRunAssignment_3_0_1(), "rule__DHyperlink__RunAssignment_3_0_1");
					put(grammarAccess.getDTextAccess().getContentAssignment(), "rule__DText__ContentAssignment");
					put(grammarAccess.getDFigureFromFileAccess().getNameAssignment_2(), "rule__DFigureFromFile__NameAssignment_2");
					put(grammarAccess.getDFigureFromFileAccess().getReferenceFileAssignment_4(), "rule__DFigureFromFile__ReferenceFileAssignment_4");
					put(grammarAccess.getDFigureFromFileAccess().getWidthAssignment_6(), "rule__DFigureFromFile__WidthAssignment_6");
					put(grammarAccess.getDFigureFromFileAccess().getHeightAssignment_8(), "rule__DFigureFromFile__HeightAssignment_8");
					put(grammarAccess.getDFigureFromFileAccess().getAlignmentAssignment_9_1(), "rule__DFigureFromFile__AlignmentAssignment_9_1");
					put(grammarAccess.getDFigureFromFileAccess().getStyleAssignment_10_1(), "rule__DFigureFromFile__StyleAssignment_10_1");
					put(grammarAccess.getDFigureFromFileAccess().getIndentAssignment_11_1(), "rule__DFigureFromFile__IndentAssignment_11_1");
					put(grammarAccess.getDFigureFromFileAccess().getCaptionAssignment_12_1(), "rule__DFigureFromFile__CaptionAssignment_12_1");
					put(grammarAccess.getDTableFromFileAccess().getNameAssignment_2(), "rule__DTableFromFile__NameAssignment_2");
					put(grammarAccess.getDTableFromFileAccess().getReferenceFileAssignment_4(), "rule__DTableFromFile__ReferenceFileAssignment_4");
					put(grammarAccess.getDTableFromFileAccess().getWidthAssignment_6(), "rule__DTableFromFile__WidthAssignment_6");
					put(grammarAccess.getDTableFromFileAccess().getHeightAssignment_8(), "rule__DTableFromFile__HeightAssignment_8");
					put(grammarAccess.getDTableFromFileAccess().getAlignmentAssignment_9_1(), "rule__DTableFromFile__AlignmentAssignment_9_1");
					put(grammarAccess.getDTableFromFileAccess().getStyleAssignment_10_1(), "rule__DTableFromFile__StyleAssignment_10_1");
					put(grammarAccess.getDTableFromFileAccess().getIndentAssignment_11_1(), "rule__DTableFromFile__IndentAssignment_11_1");
					put(grammarAccess.getDTableFromFileAccess().getCaptionAssignment_12_1(), "rule__DTableFromFile__CaptionAssignment_12_1");
					put(grammarAccess.getDBasicTableAccess().getNameAssignment_2(), "rule__DBasicTable__NameAssignment_2");
					put(grammarAccess.getDBasicTableAccess().getWidthAssignment_3_1(), "rule__DBasicTable__WidthAssignment_3_1");
					put(grammarAccess.getDBasicTableAccess().getAlignmentAssignment_4_1(), "rule__DBasicTable__AlignmentAssignment_4_1");
					put(grammarAccess.getDBasicTableAccess().getStyleAssignment_5_1(), "rule__DBasicTable__StyleAssignment_5_1");
					put(grammarAccess.getDBasicTableAccess().getIndentAssignment_6_1(), "rule__DBasicTable__IndentAssignment_6_1");
					put(grammarAccess.getDBasicTableAccess().getCaptionAssignment_7_1(), "rule__DBasicTable__CaptionAssignment_7_1");
					put(grammarAccess.getDBasicTableAccess().getRowsAssignment_9(), "rule__DBasicTable__RowsAssignment_9");
					put(grammarAccess.getDRowAccess().getCellsAssignment_1(), "rule__DRow__CellsAssignment_1");
					put(grammarAccess.getDCellAccess().getColSpanAssignment_1_1(), "rule__DCell__ColSpanAssignment_1_1");
					put(grammarAccess.getDCellAccess().getRowSpanAssignment_2_1(), "rule__DCell__RowSpanAssignment_2_1");
					put(grammarAccess.getDCellAccess().getWidthAssignment_3_1(), "rule__DCell__WidthAssignment_3_1");
					put(grammarAccess.getDCellAccess().getShadowAssignment_4_1(), "rule__DCell__ShadowAssignment_4_1");
					put(grammarAccess.getDCellAccess().getBodyContentAssignment_6(), "rule__DCell__BodyContentAssignment_6");
					put(grammarAccess.getDApplicableDocumentAccess().getNameAssignment_2(), "rule__DApplicableDocument__NameAssignment_2");
					put(grammarAccess.getDApplicableDocumentAccess().getTitleAssignment_4(), "rule__DApplicableDocument__TitleAssignment_4");
					put(grammarAccess.getDApplicableDocumentAccess().getIdAssignment_6(), "rule__DApplicableDocument__IdAssignment_6");
					put(grammarAccess.getDApplicableDocumentAccess().getIssueAssignment_7_1(), "rule__DApplicableDocument__IssueAssignment_7_1");
					put(grammarAccess.getDApplicableDocumentAccess().getRevisionAssignment_7_2_1(), "rule__DApplicableDocument__RevisionAssignment_7_2_1");
					put(grammarAccess.getDApplicableDocumentAccess().getDateAssignment_8_1(), "rule__DApplicableDocument__DateAssignment_8_1");
					put(grammarAccess.getDApplicableDocumentAccess().getUrlAssignment_9_1(), "rule__DApplicableDocument__UrlAssignment_9_1");
					put(grammarAccess.getDReferenceDocumentAccess().getNameAssignment_2(), "rule__DReferenceDocument__NameAssignment_2");
					put(grammarAccess.getDReferenceDocumentAccess().getTitleAssignment_4(), "rule__DReferenceDocument__TitleAssignment_4");
					put(grammarAccess.getDReferenceDocumentAccess().getIdAssignment_6(), "rule__DReferenceDocument__IdAssignment_6");
					put(grammarAccess.getDReferenceDocumentAccess().getIssueAssignment_7_1(), "rule__DReferenceDocument__IssueAssignment_7_1");
					put(grammarAccess.getDReferenceDocumentAccess().getRevisionAssignment_7_2_1(), "rule__DReferenceDocument__RevisionAssignment_7_2_1");
					put(grammarAccess.getDReferenceDocumentAccess().getDateAssignment_8_1(), "rule__DReferenceDocument__DateAssignment_8_1");
					put(grammarAccess.getDReferenceDocumentAccess().getUrlAssignment_9_1(), "rule__DReferenceDocument__UrlAssignment_9_1");
					put(grammarAccess.getVSVRFixedSectionAccess().getBodyAssignment_1(), "rule__VSVRFixedSection__BodyAssignment_1");
					put(grammarAccess.getVSVRFixedSectionAccess().getSvrInstatiableSubsectionsAssignment_2(), "rule__VSVRFixedSection__SvrInstatiableSubsectionsAssignment_2");
					put(grammarAccess.getVSVRInstantiableSectionAccess().getNameAssignment_2(), "rule__VSVRInstantiableSection__NameAssignment_2");
					put(grammarAccess.getVSVRInstantiableSectionAccess().getBodyAssignment_4(), "rule__VSVRInstantiableSection__BodyAssignment_4");
					put(grammarAccess.getVSVRInstantiableSectionAccess().getSvrInstatiableSubsectionsAssignment_5(), "rule__VSVRInstantiableSection__SvrInstatiableSubsectionsAssignment_5");
					put(grammarAccess.getVSVRIntroductionAccess().getSvrInstatiableSubsectionsAssignment_1(), "rule__VSVRIntroduction__SvrInstatiableSubsectionsAssignment_1");
					put(grammarAccess.getVSVRApplicableDocumentsAccess().getApplicableDocumentsAssignment_2(), "rule__VSVRApplicableDocuments__ApplicableDocumentsAssignment_2");
					put(grammarAccess.getVSVRReferenceDocumentsAccess().getReferenceDocumentsAssignment_2(), "rule__VSVRReferenceDocuments__ReferenceDocumentsAssignment_2");
					put(grammarAccess.getVSVRTermsDefinitionsAbbreviationsAccess().getTermsAssignment_2(), "rule__VSVRTermsDefinitionsAbbreviations__TermsAssignment_2");
					put(grammarAccess.getVSVRTermsDefinitionsAbbreviationsAccess().getDefinitionsAssignment_3(), "rule__VSVRTermsDefinitionsAbbreviations__DefinitionsAssignment_3");
					put(grammarAccess.getVSVRTermsDefinitionsAbbreviationsAccess().getAbbreviationsAssignment_4(), "rule__VSVRTermsDefinitionsAbbreviations__AbbreviationsAssignment_4");
					put(grammarAccess.getVSVRTermAccess().getNameAssignment_2(), "rule__VSVRTerm__NameAssignment_2");
					put(grammarAccess.getVSVRTermAccess().getDescriptionAssignment_4(), "rule__VSVRTerm__DescriptionAssignment_4");
					put(grammarAccess.getVSVRDefinitionAccess().getNameAssignment_2(), "rule__VSVRDefinition__NameAssignment_2");
					put(grammarAccess.getVSVRDefinitionAccess().getDescriptionAssignment_4(), "rule__VSVRDefinition__DescriptionAssignment_4");
					put(grammarAccess.getVSVRAbbreviationAccess().getNameAssignment_2(), "rule__VSVRAbbreviation__NameAssignment_2");
					put(grammarAccess.getVSVRAbbreviationAccess().getDescriptionAssignment_4(), "rule__VSVRAbbreviation__DescriptionAssignment_4");
					put(grammarAccess.getVSVRSWValProcessVerificationAccess().getBodyAssignment_2(), "rule__VSVRSWValProcessVerification__BodyAssignment_2");
					put(grammarAccess.getVSVRSWValProcessVerificationAccess().getTraceabilityAssignment_4(), "rule__VSVRSWValProcessVerification__TraceabilityAssignment_4");
					put(grammarAccess.getVSVRSWValProcessVerificationAccess().getFeasibilityAssignment_7(), "rule__VSVRSWValProcessVerification__FeasibilityAssignment_7");
				}
			};
		}
		return nameMappings.get(element);
	}

	@Override
	protected Collection<FollowElement> getFollowElements(AbstractInternalContentAssistParser parser) {
		try {
			InternalSVRParser typedParser = (InternalSVRParser) parser;
			typedParser.entryRuleVSVRDocument();
			return typedParser.getFollowElements();
		} catch(RecognitionException ex) {
			throw new RuntimeException(ex);
		}
	}

	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}

	public SVRGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(SVRGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
