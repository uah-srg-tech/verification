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
package es.uah.aut.srg.micobs.svm.lang.testsetup.ide.contentassist.antlr;

import com.google.inject.Inject;
import es.uah.aut.srg.micobs.svm.lang.testsetup.ide.contentassist.antlr.internal.InternalTESTSETUPParser;
import es.uah.aut.srg.micobs.svm.lang.testsetup.services.TESTSETUPGrammarAccess;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import org.antlr.runtime.RecognitionException;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.AbstractContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.FollowElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;

public class TESTSETUPParser extends AbstractContentAssistParser {

	@Inject
	private TESTSETUPGrammarAccess grammarAccess;

	private Map<AbstractElement, String> nameMappings;

	@Override
	protected InternalTESTSETUPParser createParser() {
		InternalTESTSETUPParser result = new InternalTESTSETUPParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}

	@Override
	protected String getRuleName(AbstractElement element) {
		if (nameMappings == null) {
			nameMappings = new HashMap<AbstractElement, String>() {
				private static final long serialVersionUID = 1L;
				{
					put(grammarAccess.getDBodyContentAccess().getAlternatives(), "rule__DBodyContent__Alternatives");
					put(grammarAccess.getDListContentAccess().getAlternatives(), "rule__DListContent__Alternatives");
					put(grammarAccess.getDParagraphContentAccess().getAlternatives(), "rule__DParagraphContent__Alternatives");
					put(grammarAccess.getDHyperlinkAccess().getAlternatives_3(), "rule__DHyperlink__Alternatives_3");
					put(grammarAccess.getVTestSetupActionTypeAccess().getAlternatives(), "rule__VTestSetupActionType__Alternatives");
					put(grammarAccess.getVTestSetupConfigurationStatusAccess().getAlternatives(), "rule__VTestSetupConfigurationStatus__Alternatives");
					put(grammarAccess.getDAlignmentAccess().getAlternatives(), "rule__DAlignment__Alternatives");
					put(grammarAccess.getDRunAttributesAccess().getAlternatives(), "rule__DRunAttributes__Alternatives");
					put(grammarAccess.getVTestSetupDocumentAccess().getGroup(), "rule__VTestSetupDocument__Group__0");
					put(grammarAccess.getVTestSetupDocumentAccess().getGroup_18(), "rule__VTestSetupDocument__Group_18__0");
					put(grammarAccess.getVTestSetupDocumentAccess().getGroup_19(), "rule__VTestSetupDocument__Group_19__0");
					put(grammarAccess.getVTestSetupTBCsTBDsAccess().getGroup(), "rule__VTestSetupTBCsTBDs__Group__0");
					put(grammarAccess.getDTBCAccess().getGroup(), "rule__DTBC__Group__0");
					put(grammarAccess.getDTBDAccess().getGroup(), "rule__DTBD__Group__0");
					put(grammarAccess.getVTestSetupApplicableDocumentsAccess().getGroup(), "rule__VTestSetupApplicableDocuments__Group__0");
					put(grammarAccess.getVTestSetupReferenceDocumentsAccess().getGroup(), "rule__VTestSetupReferenceDocuments__Group__0");
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
					put(grammarAccess.getVTestSetupInterfacesSectionAccess().getGroup(), "rule__VTestSetupInterfacesSection__Group__0");
					put(grammarAccess.getVTestSetupInterfaceAccess().getGroup(), "rule__VTestSetupInterface__Group__0");
					put(grammarAccess.getVTestSetupPacketConfigurationsSectionAccess().getGroup(), "rule__VTestSetupPacketConfigurationsSection__Group__0");
					put(grammarAccess.getVTestSetupPacketConfigurationAccess().getGroup(), "rule__VTestSetupPacketConfiguration__Group__0");
					put(grammarAccess.getVTestSetupActionsSectionAccess().getGroup(), "rule__VTestSetupActionsSection__Group__0");
					put(grammarAccess.getVTestSetupActionAccess().getGroup(), "rule__VTestSetupAction__Group__0");
					put(grammarAccess.getVTestSetupScenariosSectionAccess().getGroup(), "rule__VTestSetupScenariosSection__Group__0");
					put(grammarAccess.getVTestSetupScenarioSectionAccess().getGroup(), "rule__VTestSetupScenarioSection__Group__0");
					put(grammarAccess.getVTestSetupScenarioSectionAccess().getGroup_8(), "rule__VTestSetupScenarioSection__Group_8__0");
					put(grammarAccess.getVTestSetupSupportedInterfaceAccess().getGroup(), "rule__VTestSetupSupportedInterface__Group__0");
					put(grammarAccess.getVTestSetupSelectedConfigurationAccess().getGroup(), "rule__VTestSetupSelectedConfiguration__Group__0");
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
					put(grammarAccess.getVTestSetupDocumentAccess().getNameAssignment_2(), "rule__VTestSetupDocument__NameAssignment_2");
					put(grammarAccess.getVTestSetupDocumentAccess().getIdAssignment_4(), "rule__VTestSetupDocument__IdAssignment_4");
					put(grammarAccess.getVTestSetupDocumentAccess().getIssueAssignment_6(), "rule__VTestSetupDocument__IssueAssignment_6");
					put(grammarAccess.getVTestSetupDocumentAccess().getRevisionAssignment_8(), "rule__VTestSetupDocument__RevisionAssignment_8");
					put(grammarAccess.getVTestSetupDocumentAccess().getDateAssignment_10(), "rule__VTestSetupDocument__DateAssignment_10");
					put(grammarAccess.getVTestSetupDocumentAccess().getTbcsTbdsSectionAssignment_12(), "rule__VTestSetupDocument__TbcsTbdsSectionAssignment_12");
					put(grammarAccess.getVTestSetupDocumentAccess().getApplicableDocumentsSectionAssignment_13(), "rule__VTestSetupDocument__ApplicableDocumentsSectionAssignment_13");
					put(grammarAccess.getVTestSetupDocumentAccess().getReferenceDocumentsSectionAssignment_14(), "rule__VTestSetupDocument__ReferenceDocumentsSectionAssignment_14");
					put(grammarAccess.getVTestSetupDocumentAccess().getInterfacesAssignment_16(), "rule__VTestSetupDocument__InterfacesAssignment_16");
					put(grammarAccess.getVTestSetupDocumentAccess().getConfigurationsAssignment_18_1(), "rule__VTestSetupDocument__ConfigurationsAssignment_18_1");
					put(grammarAccess.getVTestSetupDocumentAccess().getActionsAssignment_19_1(), "rule__VTestSetupDocument__ActionsAssignment_19_1");
					put(grammarAccess.getVTestSetupDocumentAccess().getScenariosAssignment_21(), "rule__VTestSetupDocument__ScenariosAssignment_21");
					put(grammarAccess.getVTestSetupTBCsTBDsAccess().getTbcsAssignment_2(), "rule__VTestSetupTBCsTBDs__TbcsAssignment_2");
					put(grammarAccess.getVTestSetupTBCsTBDsAccess().getTbdsAssignment_3(), "rule__VTestSetupTBCsTBDs__TbdsAssignment_3");
					put(grammarAccess.getDTBCAccess().getNameAssignment_2(), "rule__DTBC__NameAssignment_2");
					put(grammarAccess.getDTBCAccess().getDescriptionAssignment_4(), "rule__DTBC__DescriptionAssignment_4");
					put(grammarAccess.getDTBDAccess().getNameAssignment_2(), "rule__DTBD__NameAssignment_2");
					put(grammarAccess.getDTBDAccess().getDescriptionAssignment_4(), "rule__DTBD__DescriptionAssignment_4");
					put(grammarAccess.getVTestSetupApplicableDocumentsAccess().getApplicableDocumentsAssignment_2(), "rule__VTestSetupApplicableDocuments__ApplicableDocumentsAssignment_2");
					put(grammarAccess.getVTestSetupReferenceDocumentsAccess().getReferenceDocumentsAssignment_2(), "rule__VTestSetupReferenceDocuments__ReferenceDocumentsAssignment_2");
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
					put(grammarAccess.getVTestSetupInterfacesSectionAccess().getInterfacesAssignment_1(), "rule__VTestSetupInterfacesSection__InterfacesAssignment_1");
					put(grammarAccess.getVTestSetupInterfaceAccess().getNameAssignment_2(), "rule__VTestSetupInterface__NameAssignment_2");
					put(grammarAccess.getVTestSetupInterfaceAccess().getTcHeaderAssignment_4(), "rule__VTestSetupInterface__TcHeaderAssignment_4");
					put(grammarAccess.getVTestSetupInterfaceAccess().getTmHeaderAssignment_6(), "rule__VTestSetupInterface__TmHeaderAssignment_6");
					put(grammarAccess.getVTestSetupInterfaceAccess().getDescriptionAssignment_8(), "rule__VTestSetupInterface__DescriptionAssignment_8");
					put(grammarAccess.getVTestSetupPacketConfigurationsSectionAccess().getPacketConfigurationsAssignment_1(), "rule__VTestSetupPacketConfigurationsSection__PacketConfigurationsAssignment_1");
					put(grammarAccess.getVTestSetupPacketConfigurationAccess().getNameAssignment_2(), "rule__VTestSetupPacketConfiguration__NameAssignment_2");
					put(grammarAccess.getVTestSetupPacketConfigurationAccess().getIdAssignment_4(), "rule__VTestSetupPacketConfiguration__IdAssignment_4");
					put(grammarAccess.getVTestSetupPacketConfigurationAccess().getDescriptionAssignment_6(), "rule__VTestSetupPacketConfiguration__DescriptionAssignment_6");
					put(grammarAccess.getVTestSetupActionsSectionAccess().getActionAssignment_1(), "rule__VTestSetupActionsSection__ActionAssignment_1");
					put(grammarAccess.getVTestSetupActionAccess().getNameAssignment_2(), "rule__VTestSetupAction__NameAssignment_2");
					put(grammarAccess.getVTestSetupActionAccess().getTypeAssignment_4(), "rule__VTestSetupAction__TypeAssignment_4");
					put(grammarAccess.getVTestSetupActionAccess().getDescriptionAssignment_6(), "rule__VTestSetupAction__DescriptionAssignment_6");
					put(grammarAccess.getVTestSetupScenariosSectionAccess().getScenariosAssignment_1(), "rule__VTestSetupScenariosSection__ScenariosAssignment_1");
					put(grammarAccess.getVTestSetupScenarioSectionAccess().getNameAssignment_2(), "rule__VTestSetupScenarioSection__NameAssignment_2");
					put(grammarAccess.getVTestSetupScenarioSectionAccess().getScenarioAssignment_4(), "rule__VTestSetupScenarioSection__ScenarioAssignment_4");
					put(grammarAccess.getVTestSetupScenarioSectionAccess().getSupportedInterfaceAssignment_6(), "rule__VTestSetupScenarioSection__SupportedInterfaceAssignment_6");
					put(grammarAccess.getVTestSetupScenarioSectionAccess().getSelectedConfigurationAssignment_7(), "rule__VTestSetupScenarioSection__SelectedConfigurationAssignment_7");
					put(grammarAccess.getVTestSetupScenarioSectionAccess().getSupportedActionAssignment_8_2(), "rule__VTestSetupScenarioSection__SupportedActionAssignment_8_2");
					put(grammarAccess.getVTestSetupScenarioSectionAccess().getBodyAssignment_9(), "rule__VTestSetupScenarioSection__BodyAssignment_9");
					put(grammarAccess.getVTestSetupSupportedInterfaceAccess().getNameAssignment_2(), "rule__VTestSetupSupportedInterface__NameAssignment_2");
					put(grammarAccess.getVTestSetupSupportedInterfaceAccess().getInterfaceAssignment_4(), "rule__VTestSetupSupportedInterface__InterfaceAssignment_4");
					put(grammarAccess.getVTestSetupSupportedInterfaceAccess().getScenarioInterfaceAssignment_6(), "rule__VTestSetupSupportedInterface__ScenarioInterfaceAssignment_6");
					put(grammarAccess.getVTestSetupSelectedConfigurationAccess().getConfigurationAssignment_2(), "rule__VTestSetupSelectedConfiguration__ConfigurationAssignment_2");
					put(grammarAccess.getVTestSetupSelectedConfigurationAccess().getDefaultFilterStatusAssignment_4(), "rule__VTestSetupSelectedConfiguration__DefaultFilterStatusAssignment_4");
					put(grammarAccess.getVTestSetupSelectedConfigurationAccess().getDefaultPrintStatusAssignment_6(), "rule__VTestSetupSelectedConfiguration__DefaultPrintStatusAssignment_6");
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
				}
			};
		}
		return nameMappings.get(element);
	}

	@Override
	protected Collection<FollowElement> getFollowElements(AbstractInternalContentAssistParser parser) {
		try {
			InternalTESTSETUPParser typedParser = (InternalTESTSETUPParser) parser;
			typedParser.entryRuleVTestSetupDocument();
			return typedParser.getFollowElements();
		} catch(RecognitionException ex) {
			throw new RuntimeException(ex);
		}
	}

	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}

	public TESTSETUPGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(TESTSETUPGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
