/*******************************************************************************
 * Copyright (c) 2019 UAH Space Research Group.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     SRG Team - Initial API and implementation
 ******************************************************************************/
package es.uah.aut.srg.micobs.svm.lang.tctemplate.services;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.List;
import org.eclipse.xtext.Alternatives;
import org.eclipse.xtext.Assignment;
import org.eclipse.xtext.CrossReference;
import org.eclipse.xtext.Grammar;
import org.eclipse.xtext.GrammarUtil;
import org.eclipse.xtext.Group;
import org.eclipse.xtext.Keyword;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.TerminalRule;
import org.eclipse.xtext.common.services.TerminalsGrammarAccess;
import org.eclipse.xtext.service.AbstractElementFinder.AbstractGrammarElementFinder;
import org.eclipse.xtext.service.GrammarProvider;

@Singleton
public class TCTEMPLATEGrammarAccess extends AbstractGrammarElementFinder {
	
	public class VTCTemplateElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.micobs.svm.lang.tctemplate.TCTEMPLATE.VTCTemplate");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cTCTemplateKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cNameKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cNameAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cNameSTRINGTerminalRuleCall_2_0 = (RuleCall)cNameAssignment_2.eContents().get(0);
		private final Keyword cTcKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Assignment cTcAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final CrossReference cTcTMTCIFTCCrossReference_4_0 = (CrossReference)cTcAssignment_4.eContents().get(0);
		private final RuleCall cTcTMTCIFTCSTRINGTerminalRuleCall_4_0_1 = (RuleCall)cTcTMTCIFTCCrossReference_4_0.eContents().get(1);
		private final Alternatives cAlternatives_5 = (Alternatives)cGroup.eContents().get(5);
		private final Group cGroup_5_0 = (Group)cAlternatives_5.eContents().get(0);
		private final Keyword cGreaterThanSignKeyword_5_0_0 = (Keyword)cGroup_5_0.eContents().get(0);
		private final Group cGroup_5_0_1 = (Group)cGroup_5_0.eContents().get(1);
		private final Keyword cFieldsKeyword_5_0_1_0 = (Keyword)cGroup_5_0_1.eContents().get(0);
		private final Assignment cFieldsAssignment_5_0_1_1 = (Assignment)cGroup_5_0_1.eContents().get(1);
		private final RuleCall cFieldsVTCTemplateFieldParserRuleCall_5_0_1_1_0 = (RuleCall)cFieldsAssignment_5_0_1_1.eContents().get(0);
		private final Keyword cFieldsKeyword_5_0_1_2 = (Keyword)cGroup_5_0_1.eContents().get(2);
		private final Keyword cTCTemplateKeyword_5_0_2 = (Keyword)cGroup_5_0.eContents().get(2);
		private final Keyword cSolidusGreaterThanSignKeyword_5_1 = (Keyword)cAlternatives_5.eContents().get(1);
		
		//VTCTemplate:
		//	'<TCTemplate'
		//	'name=' name=STRING
		//	'tc=' tc=[tc::TMTCIFTC|STRING] ('>' ('<Fields>' fields+=VTCTemplateField+ '</Fields>')? '</TCTemplate>' | '/>');
		@Override public ParserRule getRule() { return rule; }
		
		//'<TCTemplate' 'name=' name=STRING 'tc=' tc=[tc::TMTCIFTC|STRING] ('>' ('<Fields>' fields+=VTCTemplateField+
		//'</Fields>')? '</TCTemplate>' | '/>')
		public Group getGroup() { return cGroup; }
		
		//'<TCTemplate'
		public Keyword getTCTemplateKeyword_0() { return cTCTemplateKeyword_0; }
		
		//'name='
		public Keyword getNameKeyword_1() { return cNameKeyword_1; }
		
		//name=STRING
		public Assignment getNameAssignment_2() { return cNameAssignment_2; }
		
		//STRING
		public RuleCall getNameSTRINGTerminalRuleCall_2_0() { return cNameSTRINGTerminalRuleCall_2_0; }
		
		//'tc='
		public Keyword getTcKeyword_3() { return cTcKeyword_3; }
		
		//tc=[tc::TMTCIFTC|STRING]
		public Assignment getTcAssignment_4() { return cTcAssignment_4; }
		
		//[tc::TMTCIFTC|STRING]
		public CrossReference getTcTMTCIFTCCrossReference_4_0() { return cTcTMTCIFTCCrossReference_4_0; }
		
		//STRING
		public RuleCall getTcTMTCIFTCSTRINGTerminalRuleCall_4_0_1() { return cTcTMTCIFTCSTRINGTerminalRuleCall_4_0_1; }
		
		//('>' ('<Fields>' fields+=VTCTemplateField+ '</Fields>')? '</TCTemplate>' | '/>')
		public Alternatives getAlternatives_5() { return cAlternatives_5; }
		
		//'>' ('<Fields>' fields+=VTCTemplateField+ '</Fields>')? '</TCTemplate>'
		public Group getGroup_5_0() { return cGroup_5_0; }
		
		//'>'
		public Keyword getGreaterThanSignKeyword_5_0_0() { return cGreaterThanSignKeyword_5_0_0; }
		
		//('<Fields>' fields+=VTCTemplateField+ '</Fields>')?
		public Group getGroup_5_0_1() { return cGroup_5_0_1; }
		
		//'<Fields>'
		public Keyword getFieldsKeyword_5_0_1_0() { return cFieldsKeyword_5_0_1_0; }
		
		//fields+=VTCTemplateField+
		public Assignment getFieldsAssignment_5_0_1_1() { return cFieldsAssignment_5_0_1_1; }
		
		//VTCTemplateField
		public RuleCall getFieldsVTCTemplateFieldParserRuleCall_5_0_1_1_0() { return cFieldsVTCTemplateFieldParserRuleCall_5_0_1_1_0; }
		
		//'</Fields>'
		public Keyword getFieldsKeyword_5_0_1_2() { return cFieldsKeyword_5_0_1_2; }
		
		//'</TCTemplate>'
		public Keyword getTCTemplateKeyword_5_0_2() { return cTCTemplateKeyword_5_0_2; }
		
		//'/>'
		public Keyword getSolidusGreaterThanSignKeyword_5_1() { return cSolidusGreaterThanSignKeyword_5_1; }
	}
	public class VTCTemplateFieldElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.micobs.svm.lang.tctemplate.TCTEMPLATE.VTCTemplateField");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cFieldKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cFieldRefKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cFieldRefAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final CrossReference cFieldRefTMTCIFTCFieldCrossReference_2_0 = (CrossReference)cFieldRefAssignment_2.eContents().get(0);
		private final RuleCall cFieldRefTMTCIFTCFieldSTRINGTerminalRuleCall_2_0_1 = (RuleCall)cFieldRefTMTCIFTCFieldCrossReference_2_0.eContents().get(1);
		private final Keyword cGreaterThanSignKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Assignment cValueAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cValueTMTCIFFieldValueParserRuleCall_4_0 = (RuleCall)cValueAssignment_4.eContents().get(0);
		private final Keyword cFieldKeyword_5 = (Keyword)cGroup.eContents().get(5);
		
		//VTCTemplateField:
		//	'<Field'
		//	'fieldRef=' fieldRef=[tc::TMTCIFTCField|STRING] '>'
		//	value=TMTCIFFieldValue
		//	'</Field>';
		@Override public ParserRule getRule() { return rule; }
		
		//'<Field' 'fieldRef=' fieldRef=[tc::TMTCIFTCField|STRING] '>' value=TMTCIFFieldValue '</Field>'
		public Group getGroup() { return cGroup; }
		
		//'<Field'
		public Keyword getFieldKeyword_0() { return cFieldKeyword_0; }
		
		//'fieldRef='
		public Keyword getFieldRefKeyword_1() { return cFieldRefKeyword_1; }
		
		//fieldRef=[tc::TMTCIFTCField|STRING]
		public Assignment getFieldRefAssignment_2() { return cFieldRefAssignment_2; }
		
		//[tc::TMTCIFTCField|STRING]
		public CrossReference getFieldRefTMTCIFTCFieldCrossReference_2_0() { return cFieldRefTMTCIFTCFieldCrossReference_2_0; }
		
		//STRING
		public RuleCall getFieldRefTMTCIFTCFieldSTRINGTerminalRuleCall_2_0_1() { return cFieldRefTMTCIFTCFieldSTRINGTerminalRuleCall_2_0_1; }
		
		//'>'
		public Keyword getGreaterThanSignKeyword_3() { return cGreaterThanSignKeyword_3; }
		
		//value=TMTCIFFieldValue
		public Assignment getValueAssignment_4() { return cValueAssignment_4; }
		
		//TMTCIFFieldValue
		public RuleCall getValueTMTCIFFieldValueParserRuleCall_4_0() { return cValueTMTCIFFieldValueParserRuleCall_4_0; }
		
		//'</Field>'
		public Keyword getFieldKeyword_5() { return cFieldKeyword_5; }
	}
	public class TMTCIFFieldValueElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.micobs.svm.lang.tctemplate.TCTEMPLATE.TMTCIFFieldValue");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cTMTCIFFieldValueRawParserRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cTMTCIFFieldValueFileParserRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		private final RuleCall cTMTCIFFieldValueEnumParserRuleCall_2 = (RuleCall)cAlternatives.eContents().get(2);
		
		//TMTCIFFieldValue fieldvalue::TMTCIFFieldValue:
		//	TMTCIFFieldValueRaw | TMTCIFFieldValueFile | TMTCIFFieldValueEnum
		@Override public ParserRule getRule() { return rule; }
		
		//TMTCIFFieldValueRaw | TMTCIFFieldValueFile | TMTCIFFieldValueEnum
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//TMTCIFFieldValueRaw
		public RuleCall getTMTCIFFieldValueRawParserRuleCall_0() { return cTMTCIFFieldValueRawParserRuleCall_0; }
		
		//TMTCIFFieldValueFile
		public RuleCall getTMTCIFFieldValueFileParserRuleCall_1() { return cTMTCIFFieldValueFileParserRuleCall_1; }
		
		//TMTCIFFieldValueEnum
		public RuleCall getTMTCIFFieldValueEnumParserRuleCall_2() { return cTMTCIFFieldValueEnumParserRuleCall_2; }
	}
	public class TMTCIFFieldValueRawElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.micobs.svm.lang.tctemplate.TCTEMPLATE.TMTCIFFieldValueRaw");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cFieldValueRawKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cValueKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cValueAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final Alternatives cValueAlternatives_2_0 = (Alternatives)cValueAssignment_2.eContents().get(0);
		private final RuleCall cValueUINT_STRINGTerminalRuleCall_2_0_0 = (RuleCall)cValueAlternatives_2_0.eContents().get(0);
		private final RuleCall cValueHEX_STRINGTerminalRuleCall_2_0_1 = (RuleCall)cValueAlternatives_2_0.eContents().get(1);
		private final Keyword cSolidusGreaterThanSignKeyword_3 = (Keyword)cGroup.eContents().get(3);
		
		//TMTCIFFieldValueRaw fieldvalue::TMTCIFFieldValueRaw:
		//	'<FieldValueRaw' 'value=' value=(UINT_STRING | HEX_STRING) '/>'
		@Override public ParserRule getRule() { return rule; }
		
		//'<FieldValueRaw' 'value=' value=(UINT_STRING | HEX_STRING) '/>'
		public Group getGroup() { return cGroup; }
		
		//'<FieldValueRaw'
		public Keyword getFieldValueRawKeyword_0() { return cFieldValueRawKeyword_0; }
		
		//'value='
		public Keyword getValueKeyword_1() { return cValueKeyword_1; }
		
		//value=(UINT_STRING | HEX_STRING)
		public Assignment getValueAssignment_2() { return cValueAssignment_2; }
		
		//(UINT_STRING | HEX_STRING)
		public Alternatives getValueAlternatives_2_0() { return cValueAlternatives_2_0; }
		
		//UINT_STRING
		public RuleCall getValueUINT_STRINGTerminalRuleCall_2_0_0() { return cValueUINT_STRINGTerminalRuleCall_2_0_0; }
		
		//HEX_STRING
		public RuleCall getValueHEX_STRINGTerminalRuleCall_2_0_1() { return cValueHEX_STRINGTerminalRuleCall_2_0_1; }
		
		//'/>'
		public Keyword getSolidusGreaterThanSignKeyword_3() { return cSolidusGreaterThanSignKeyword_3; }
	}
	public class TMTCIFFieldValueFileElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.micobs.svm.lang.tctemplate.TCTEMPLATE.TMTCIFFieldValueFile");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cFieldValueFileKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cFilenameKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cFilenameAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cFilenameSTRINGTerminalRuleCall_2_0 = (RuleCall)cFilenameAssignment_2.eContents().get(0);
		private final Keyword cSolidusGreaterThanSignKeyword_3 = (Keyword)cGroup.eContents().get(3);
		
		//TMTCIFFieldValueFile fieldvalue::TMTCIFFieldValueFile:
		//	'<FieldValueFile' 'filename=' filename=STRING '/>'
		@Override public ParserRule getRule() { return rule; }
		
		//'<FieldValueFile' 'filename=' filename=STRING '/>'
		public Group getGroup() { return cGroup; }
		
		//'<FieldValueFile'
		public Keyword getFieldValueFileKeyword_0() { return cFieldValueFileKeyword_0; }
		
		//'filename='
		public Keyword getFilenameKeyword_1() { return cFilenameKeyword_1; }
		
		//filename=STRING
		public Assignment getFilenameAssignment_2() { return cFilenameAssignment_2; }
		
		//STRING
		public RuleCall getFilenameSTRINGTerminalRuleCall_2_0() { return cFilenameSTRINGTerminalRuleCall_2_0; }
		
		//'/>'
		public Keyword getSolidusGreaterThanSignKeyword_3() { return cSolidusGreaterThanSignKeyword_3; }
	}
	public class TMTCIFFieldValueEnumElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.micobs.svm.lang.tctemplate.TCTEMPLATE.TMTCIFFieldValueEnum");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cFieldValueEnumKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cEnumRefKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cEnumRefAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final CrossReference cEnumRefTMTCIFEnumCrossReference_2_0 = (CrossReference)cEnumRefAssignment_2.eContents().get(0);
		private final RuleCall cEnumRefTMTCIFEnumSTRINGTerminalRuleCall_2_0_1 = (RuleCall)cEnumRefTMTCIFEnumCrossReference_2_0.eContents().get(1);
		private final Keyword cValueRefKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Assignment cValueRefAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final CrossReference cValueRefTMTCIFEnumValueCrossReference_4_0 = (CrossReference)cValueRefAssignment_4.eContents().get(0);
		private final RuleCall cValueRefTMTCIFEnumValueSTRINGTerminalRuleCall_4_0_1 = (RuleCall)cValueRefTMTCIFEnumValueCrossReference_4_0.eContents().get(1);
		private final Keyword cSolidusGreaterThanSignKeyword_5 = (Keyword)cGroup.eContents().get(5);
		
		//TMTCIFFieldValueEnum fieldvalue::TMTCIFFieldValueEnum:
		//	'<FieldValueEnum' 'enumRef=' enumRef=[enum_::TMTCIFEnum|STRING] 'valueRef=' valueRef=[enum_::TMTCIFEnumValue|STRING]
		//	'/>'
		@Override public ParserRule getRule() { return rule; }
		
		//'<FieldValueEnum' 'enumRef=' enumRef=[enum_::TMTCIFEnum|STRING] 'valueRef=' valueRef=[enum_::TMTCIFEnumValue|STRING]
		//'/>'
		public Group getGroup() { return cGroup; }
		
		//'<FieldValueEnum'
		public Keyword getFieldValueEnumKeyword_0() { return cFieldValueEnumKeyword_0; }
		
		//'enumRef='
		public Keyword getEnumRefKeyword_1() { return cEnumRefKeyword_1; }
		
		//enumRef=[enum_::TMTCIFEnum|STRING]
		public Assignment getEnumRefAssignment_2() { return cEnumRefAssignment_2; }
		
		//[enum_::TMTCIFEnum|STRING]
		public CrossReference getEnumRefTMTCIFEnumCrossReference_2_0() { return cEnumRefTMTCIFEnumCrossReference_2_0; }
		
		//STRING
		public RuleCall getEnumRefTMTCIFEnumSTRINGTerminalRuleCall_2_0_1() { return cEnumRefTMTCIFEnumSTRINGTerminalRuleCall_2_0_1; }
		
		//'valueRef='
		public Keyword getValueRefKeyword_3() { return cValueRefKeyword_3; }
		
		//valueRef=[enum_::TMTCIFEnumValue|STRING]
		public Assignment getValueRefAssignment_4() { return cValueRefAssignment_4; }
		
		//[enum_::TMTCIFEnumValue|STRING]
		public CrossReference getValueRefTMTCIFEnumValueCrossReference_4_0() { return cValueRefTMTCIFEnumValueCrossReference_4_0; }
		
		//STRING
		public RuleCall getValueRefTMTCIFEnumValueSTRINGTerminalRuleCall_4_0_1() { return cValueRefTMTCIFEnumValueSTRINGTerminalRuleCall_4_0_1; }
		
		//'/>'
		public Keyword getSolidusGreaterThanSignKeyword_5() { return cSolidusGreaterThanSignKeyword_5; }
	}
	
	
	private final VTCTemplateElements pVTCTemplate;
	private final VTCTemplateFieldElements pVTCTemplateField;
	private final TMTCIFFieldValueElements pTMTCIFFieldValue;
	private final TMTCIFFieldValueRawElements pTMTCIFFieldValueRaw;
	private final TMTCIFFieldValueFileElements pTMTCIFFieldValueFile;
	private final TMTCIFFieldValueEnumElements pTMTCIFFieldValueEnum;
	private final TerminalRule tUINT_STRING;
	private final TerminalRule tHEX_STRING;
	
	private final Grammar grammar;
	
	private final TerminalsGrammarAccess gaTerminals;

	@Inject
	public TCTEMPLATEGrammarAccess(GrammarProvider grammarProvider,
			TerminalsGrammarAccess gaTerminals) {
		this.grammar = internalFindGrammar(grammarProvider);
		this.gaTerminals = gaTerminals;
		this.pVTCTemplate = new VTCTemplateElements();
		this.pVTCTemplateField = new VTCTemplateFieldElements();
		this.pTMTCIFFieldValue = new TMTCIFFieldValueElements();
		this.pTMTCIFFieldValueRaw = new TMTCIFFieldValueRawElements();
		this.pTMTCIFFieldValueFile = new TMTCIFFieldValueFileElements();
		this.pTMTCIFFieldValueEnum = new TMTCIFFieldValueEnumElements();
		this.tUINT_STRING = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.micobs.svm.lang.tctemplate.TCTEMPLATE.UINT_STRING");
		this.tHEX_STRING = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.micobs.svm.lang.tctemplate.TCTEMPLATE.HEX_STRING");
	}
	
	protected Grammar internalFindGrammar(GrammarProvider grammarProvider) {
		Grammar grammar = grammarProvider.getGrammar(this);
		while (grammar != null) {
			if ("es.uah.aut.srg.micobs.svm.lang.tctemplate.TCTEMPLATE".equals(grammar.getName())) {
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

	
	//VTCTemplate:
	//	'<TCTemplate'
	//	'name=' name=STRING
	//	'tc=' tc=[tc::TMTCIFTC|STRING] ('>' ('<Fields>' fields+=VTCTemplateField+ '</Fields>')? '</TCTemplate>' | '/>');
	public VTCTemplateElements getVTCTemplateAccess() {
		return pVTCTemplate;
	}
	
	public ParserRule getVTCTemplateRule() {
		return getVTCTemplateAccess().getRule();
	}
	
	//VTCTemplateField:
	//	'<Field'
	//	'fieldRef=' fieldRef=[tc::TMTCIFTCField|STRING] '>'
	//	value=TMTCIFFieldValue
	//	'</Field>';
	public VTCTemplateFieldElements getVTCTemplateFieldAccess() {
		return pVTCTemplateField;
	}
	
	public ParserRule getVTCTemplateFieldRule() {
		return getVTCTemplateFieldAccess().getRule();
	}
	
	//TMTCIFFieldValue fieldvalue::TMTCIFFieldValue:
	//	TMTCIFFieldValueRaw | TMTCIFFieldValueFile | TMTCIFFieldValueEnum
	public TMTCIFFieldValueElements getTMTCIFFieldValueAccess() {
		return pTMTCIFFieldValue;
	}
	
	public ParserRule getTMTCIFFieldValueRule() {
		return getTMTCIFFieldValueAccess().getRule();
	}
	
	//TMTCIFFieldValueRaw fieldvalue::TMTCIFFieldValueRaw:
	//	'<FieldValueRaw' 'value=' value=(UINT_STRING | HEX_STRING) '/>'
	public TMTCIFFieldValueRawElements getTMTCIFFieldValueRawAccess() {
		return pTMTCIFFieldValueRaw;
	}
	
	public ParserRule getTMTCIFFieldValueRawRule() {
		return getTMTCIFFieldValueRawAccess().getRule();
	}
	
	//TMTCIFFieldValueFile fieldvalue::TMTCIFFieldValueFile:
	//	'<FieldValueFile' 'filename=' filename=STRING '/>'
	public TMTCIFFieldValueFileElements getTMTCIFFieldValueFileAccess() {
		return pTMTCIFFieldValueFile;
	}
	
	public ParserRule getTMTCIFFieldValueFileRule() {
		return getTMTCIFFieldValueFileAccess().getRule();
	}
	
	//TMTCIFFieldValueEnum fieldvalue::TMTCIFFieldValueEnum:
	//	'<FieldValueEnum' 'enumRef=' enumRef=[enum_::TMTCIFEnum|STRING] 'valueRef=' valueRef=[enum_::TMTCIFEnumValue|STRING]
	//	'/>'
	public TMTCIFFieldValueEnumElements getTMTCIFFieldValueEnumAccess() {
		return pTMTCIFFieldValueEnum;
	}
	
	public ParserRule getTMTCIFFieldValueEnumRule() {
		return getTMTCIFFieldValueEnumAccess().getRule();
	}
	
	//terminal UINT_STRING:
	//	'"' '0'..'9'+ '"';
	public TerminalRule getUINT_STRINGRule() {
		return tUINT_STRING;
	}
	
	//terminal HEX_STRING:
	//	'"0x' ('0'..'9' | 'a'..'f' | 'A'..'F')+ '"';
	public TerminalRule getHEX_STRINGRule() {
		return tHEX_STRING;
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
