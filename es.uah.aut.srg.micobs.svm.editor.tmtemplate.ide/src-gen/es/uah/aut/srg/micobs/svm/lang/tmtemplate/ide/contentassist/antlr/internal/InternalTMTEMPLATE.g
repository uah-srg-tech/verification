/*
 * generated by Xtext 2.10.0
 */
grammar InternalTMTEMPLATE;

options {
	superClass=AbstractInternalContentAssistParser;
	backtrack=true;
}

@lexer::header {
package es.uah.aut.srg.micobs.svm.lang.tmtemplate.ide.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.Lexer;
}

@parser::header {
package es.uah.aut.srg.micobs.svm.lang.tmtemplate.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import es.uah.aut.srg.micobs.svm.lang.tmtemplate.services.TMTEMPLATEGrammarAccess;

}
@parser::members {
	private TMTEMPLATEGrammarAccess grammarAccess;

	public void setGrammarAccess(TMTEMPLATEGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}

	@Override
	protected Grammar getGrammar() {
		return grammarAccess.getGrammar();
	}

	@Override
	protected String getValueForTokenName(String tokenName) {
		return tokenName;
	}
}

// Entry rule entryRuleVTMTemplate
entryRuleVTMTemplate
:
{ before(grammarAccess.getVTMTemplateRule()); }
	 ruleVTMTemplate
{ after(grammarAccess.getVTMTemplateRule()); } 
	 EOF 
;

// Rule VTMTemplate
ruleVTMTemplate 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getVTMTemplateAccess().getGroup()); }
		(rule__VTMTemplate__Group__0)
		{ after(grammarAccess.getVTMTemplateAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleVTMTemplateField
entryRuleVTMTemplateField
:
{ before(grammarAccess.getVTMTemplateFieldRule()); }
	 ruleVTMTemplateField
{ after(grammarAccess.getVTMTemplateFieldRule()); } 
	 EOF 
;

// Rule VTMTemplateField
ruleVTMTemplateField 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getVTMTemplateFieldAccess().getGroup()); }
		(rule__VTMTemplateField__Group__0)
		{ after(grammarAccess.getVTMTemplateFieldAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleTMTCIFFieldValue
entryRuleTMTCIFFieldValue
:
{ before(grammarAccess.getTMTCIFFieldValueRule()); }
	 ruleTMTCIFFieldValue
{ after(grammarAccess.getTMTCIFFieldValueRule()); } 
	 EOF 
;

// Rule TMTCIFFieldValue
ruleTMTCIFFieldValue 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getTMTCIFFieldValueAccess().getAlternatives()); }
		(rule__TMTCIFFieldValue__Alternatives)
		{ after(grammarAccess.getTMTCIFFieldValueAccess().getAlternatives()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleTMTCIFFieldValueRaw
entryRuleTMTCIFFieldValueRaw
:
{ before(grammarAccess.getTMTCIFFieldValueRawRule()); }
	 ruleTMTCIFFieldValueRaw
{ after(grammarAccess.getTMTCIFFieldValueRawRule()); } 
	 EOF 
;

// Rule TMTCIFFieldValueRaw
ruleTMTCIFFieldValueRaw 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getTMTCIFFieldValueRawAccess().getGroup()); }
		(rule__TMTCIFFieldValueRaw__Group__0)
		{ after(grammarAccess.getTMTCIFFieldValueRawAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleTMTCIFFieldValueFile
entryRuleTMTCIFFieldValueFile
:
{ before(grammarAccess.getTMTCIFFieldValueFileRule()); }
	 ruleTMTCIFFieldValueFile
{ after(grammarAccess.getTMTCIFFieldValueFileRule()); } 
	 EOF 
;

// Rule TMTCIFFieldValueFile
ruleTMTCIFFieldValueFile 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getTMTCIFFieldValueFileAccess().getGroup()); }
		(rule__TMTCIFFieldValueFile__Group__0)
		{ after(grammarAccess.getTMTCIFFieldValueFileAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleTMTCIFFieldValueEnum
entryRuleTMTCIFFieldValueEnum
:
{ before(grammarAccess.getTMTCIFFieldValueEnumRule()); }
	 ruleTMTCIFFieldValueEnum
{ after(grammarAccess.getTMTCIFFieldValueEnumRule()); } 
	 EOF 
;

// Rule TMTCIFFieldValueEnum
ruleTMTCIFFieldValueEnum 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getTMTCIFFieldValueEnumAccess().getGroup()); }
		(rule__TMTCIFFieldValueEnum__Group__0)
		{ after(grammarAccess.getTMTCIFFieldValueEnumAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__VTMTemplate__Alternatives_5
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getVTMTemplateAccess().getGroup_5_0()); }
		(rule__VTMTemplate__Group_5_0__0)
		{ after(grammarAccess.getVTMTemplateAccess().getGroup_5_0()); }
	)
	|
	(
		{ before(grammarAccess.getVTMTemplateAccess().getSolidusGreaterThanSignKeyword_5_1()); }
		'/>'
		{ after(grammarAccess.getVTMTemplateAccess().getSolidusGreaterThanSignKeyword_5_1()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFieldValue__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTMTCIFFieldValueAccess().getTMTCIFFieldValueRawParserRuleCall_0()); }
		ruleTMTCIFFieldValueRaw
		{ after(grammarAccess.getTMTCIFFieldValueAccess().getTMTCIFFieldValueRawParserRuleCall_0()); }
	)
	|
	(
		{ before(grammarAccess.getTMTCIFFieldValueAccess().getTMTCIFFieldValueFileParserRuleCall_1()); }
		ruleTMTCIFFieldValueFile
		{ after(grammarAccess.getTMTCIFFieldValueAccess().getTMTCIFFieldValueFileParserRuleCall_1()); }
	)
	|
	(
		{ before(grammarAccess.getTMTCIFFieldValueAccess().getTMTCIFFieldValueEnumParserRuleCall_2()); }
		ruleTMTCIFFieldValueEnum
		{ after(grammarAccess.getTMTCIFFieldValueAccess().getTMTCIFFieldValueEnumParserRuleCall_2()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFieldValueRaw__ValueAlternatives_2_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTMTCIFFieldValueRawAccess().getValueUINT_STRINGTerminalRuleCall_2_0_0()); }
		RULE_UINT_STRING
		{ after(grammarAccess.getTMTCIFFieldValueRawAccess().getValueUINT_STRINGTerminalRuleCall_2_0_0()); }
	)
	|
	(
		{ before(grammarAccess.getTMTCIFFieldValueRawAccess().getValueHEX_STRINGTerminalRuleCall_2_0_1()); }
		RULE_HEX_STRING
		{ after(grammarAccess.getTMTCIFFieldValueRawAccess().getValueHEX_STRINGTerminalRuleCall_2_0_1()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__VTMTemplate__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VTMTemplate__Group__0__Impl
	rule__VTMTemplate__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__VTMTemplate__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVTMTemplateAccess().getTMTemplateKeyword_0()); }
	'<TMTemplate'
	{ after(grammarAccess.getVTMTemplateAccess().getTMTemplateKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VTMTemplate__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VTMTemplate__Group__1__Impl
	rule__VTMTemplate__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__VTMTemplate__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVTMTemplateAccess().getNameKeyword_1()); }
	'name='
	{ after(grammarAccess.getVTMTemplateAccess().getNameKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VTMTemplate__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VTMTemplate__Group__2__Impl
	rule__VTMTemplate__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__VTMTemplate__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVTMTemplateAccess().getNameAssignment_2()); }
	(rule__VTMTemplate__NameAssignment_2)
	{ after(grammarAccess.getVTMTemplateAccess().getNameAssignment_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VTMTemplate__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VTMTemplate__Group__3__Impl
	rule__VTMTemplate__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__VTMTemplate__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVTMTemplateAccess().getTmKeyword_3()); }
	'tm='
	{ after(grammarAccess.getVTMTemplateAccess().getTmKeyword_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VTMTemplate__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VTMTemplate__Group__4__Impl
	rule__VTMTemplate__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__VTMTemplate__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVTMTemplateAccess().getTmAssignment_4()); }
	(rule__VTMTemplate__TmAssignment_4)
	{ after(grammarAccess.getVTMTemplateAccess().getTmAssignment_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VTMTemplate__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VTMTemplate__Group__5__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__VTMTemplate__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVTMTemplateAccess().getAlternatives_5()); }
	(rule__VTMTemplate__Alternatives_5)
	{ after(grammarAccess.getVTMTemplateAccess().getAlternatives_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__VTMTemplate__Group_5_0__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VTMTemplate__Group_5_0__0__Impl
	rule__VTMTemplate__Group_5_0__1
;
finally {
	restoreStackSize(stackSize);
}

rule__VTMTemplate__Group_5_0__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVTMTemplateAccess().getGreaterThanSignKeyword_5_0_0()); }
	'>'
	{ after(grammarAccess.getVTMTemplateAccess().getGreaterThanSignKeyword_5_0_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VTMTemplate__Group_5_0__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VTMTemplate__Group_5_0__1__Impl
	rule__VTMTemplate__Group_5_0__2
;
finally {
	restoreStackSize(stackSize);
}

rule__VTMTemplate__Group_5_0__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVTMTemplateAccess().getGroup_5_0_1()); }
	(rule__VTMTemplate__Group_5_0_1__0)?
	{ after(grammarAccess.getVTMTemplateAccess().getGroup_5_0_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VTMTemplate__Group_5_0__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VTMTemplate__Group_5_0__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__VTMTemplate__Group_5_0__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVTMTemplateAccess().getTMTemplateKeyword_5_0_2()); }
	'</TMTemplate>'
	{ after(grammarAccess.getVTMTemplateAccess().getTMTemplateKeyword_5_0_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__VTMTemplate__Group_5_0_1__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VTMTemplate__Group_5_0_1__0__Impl
	rule__VTMTemplate__Group_5_0_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__VTMTemplate__Group_5_0_1__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVTMTemplateAccess().getFieldsKeyword_5_0_1_0()); }
	'<Fields>'
	{ after(grammarAccess.getVTMTemplateAccess().getFieldsKeyword_5_0_1_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VTMTemplate__Group_5_0_1__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VTMTemplate__Group_5_0_1__1__Impl
	rule__VTMTemplate__Group_5_0_1__2
;
finally {
	restoreStackSize(stackSize);
}

rule__VTMTemplate__Group_5_0_1__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	(
		{ before(grammarAccess.getVTMTemplateAccess().getFieldsAssignment_5_0_1_1()); }
		(rule__VTMTemplate__FieldsAssignment_5_0_1_1)
		{ after(grammarAccess.getVTMTemplateAccess().getFieldsAssignment_5_0_1_1()); }
	)
	(
		{ before(grammarAccess.getVTMTemplateAccess().getFieldsAssignment_5_0_1_1()); }
		(rule__VTMTemplate__FieldsAssignment_5_0_1_1)*
		{ after(grammarAccess.getVTMTemplateAccess().getFieldsAssignment_5_0_1_1()); }
	)
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VTMTemplate__Group_5_0_1__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VTMTemplate__Group_5_0_1__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__VTMTemplate__Group_5_0_1__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVTMTemplateAccess().getFieldsKeyword_5_0_1_2()); }
	'</Fields>'
	{ after(grammarAccess.getVTMTemplateAccess().getFieldsKeyword_5_0_1_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__VTMTemplateField__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VTMTemplateField__Group__0__Impl
	rule__VTMTemplateField__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__VTMTemplateField__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVTMTemplateFieldAccess().getFieldKeyword_0()); }
	'<Field'
	{ after(grammarAccess.getVTMTemplateFieldAccess().getFieldKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VTMTemplateField__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VTMTemplateField__Group__1__Impl
	rule__VTMTemplateField__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__VTMTemplateField__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVTMTemplateFieldAccess().getFieldRefKeyword_1()); }
	'fieldRef='
	{ after(grammarAccess.getVTMTemplateFieldAccess().getFieldRefKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VTMTemplateField__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VTMTemplateField__Group__2__Impl
	rule__VTMTemplateField__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__VTMTemplateField__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVTMTemplateFieldAccess().getFieldRefAssignment_2()); }
	(rule__VTMTemplateField__FieldRefAssignment_2)
	{ after(grammarAccess.getVTMTemplateFieldAccess().getFieldRefAssignment_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VTMTemplateField__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VTMTemplateField__Group__3__Impl
	rule__VTMTemplateField__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__VTMTemplateField__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVTMTemplateFieldAccess().getGreaterThanSignKeyword_3()); }
	'>'
	{ after(grammarAccess.getVTMTemplateFieldAccess().getGreaterThanSignKeyword_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VTMTemplateField__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VTMTemplateField__Group__4__Impl
	rule__VTMTemplateField__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__VTMTemplateField__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVTMTemplateFieldAccess().getValueAssignment_4()); }
	(rule__VTMTemplateField__ValueAssignment_4)
	{ after(grammarAccess.getVTMTemplateFieldAccess().getValueAssignment_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VTMTemplateField__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VTMTemplateField__Group__5__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__VTMTemplateField__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVTMTemplateFieldAccess().getFieldKeyword_5()); }
	'</Field>'
	{ after(grammarAccess.getVTMTemplateFieldAccess().getFieldKeyword_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__TMTCIFFieldValueRaw__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFFieldValueRaw__Group__0__Impl
	rule__TMTCIFFieldValueRaw__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFieldValueRaw__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFFieldValueRawAccess().getFieldValueRawKeyword_0()); }
	'<FieldValueRaw'
	{ after(grammarAccess.getTMTCIFFieldValueRawAccess().getFieldValueRawKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFieldValueRaw__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFFieldValueRaw__Group__1__Impl
	rule__TMTCIFFieldValueRaw__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFieldValueRaw__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFFieldValueRawAccess().getValueKeyword_1()); }
	'value='
	{ after(grammarAccess.getTMTCIFFieldValueRawAccess().getValueKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFieldValueRaw__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFFieldValueRaw__Group__2__Impl
	rule__TMTCIFFieldValueRaw__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFieldValueRaw__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFFieldValueRawAccess().getValueAssignment_2()); }
	(rule__TMTCIFFieldValueRaw__ValueAssignment_2)
	{ after(grammarAccess.getTMTCIFFieldValueRawAccess().getValueAssignment_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFieldValueRaw__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFFieldValueRaw__Group__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFieldValueRaw__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFFieldValueRawAccess().getSolidusGreaterThanSignKeyword_3()); }
	'/>'
	{ after(grammarAccess.getTMTCIFFieldValueRawAccess().getSolidusGreaterThanSignKeyword_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__TMTCIFFieldValueFile__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFFieldValueFile__Group__0__Impl
	rule__TMTCIFFieldValueFile__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFieldValueFile__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFFieldValueFileAccess().getFieldValueFileKeyword_0()); }
	'<FieldValueFile'
	{ after(grammarAccess.getTMTCIFFieldValueFileAccess().getFieldValueFileKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFieldValueFile__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFFieldValueFile__Group__1__Impl
	rule__TMTCIFFieldValueFile__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFieldValueFile__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFFieldValueFileAccess().getFilenameKeyword_1()); }
	'filename='
	{ after(grammarAccess.getTMTCIFFieldValueFileAccess().getFilenameKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFieldValueFile__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFFieldValueFile__Group__2__Impl
	rule__TMTCIFFieldValueFile__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFieldValueFile__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFFieldValueFileAccess().getFilenameAssignment_2()); }
	(rule__TMTCIFFieldValueFile__FilenameAssignment_2)
	{ after(grammarAccess.getTMTCIFFieldValueFileAccess().getFilenameAssignment_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFieldValueFile__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFFieldValueFile__Group__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFieldValueFile__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFFieldValueFileAccess().getSolidusGreaterThanSignKeyword_3()); }
	'/>'
	{ after(grammarAccess.getTMTCIFFieldValueFileAccess().getSolidusGreaterThanSignKeyword_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__TMTCIFFieldValueEnum__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFFieldValueEnum__Group__0__Impl
	rule__TMTCIFFieldValueEnum__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFieldValueEnum__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFFieldValueEnumAccess().getFieldValueEnumKeyword_0()); }
	'<FieldValueEnum'
	{ after(grammarAccess.getTMTCIFFieldValueEnumAccess().getFieldValueEnumKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFieldValueEnum__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFFieldValueEnum__Group__1__Impl
	rule__TMTCIFFieldValueEnum__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFieldValueEnum__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFFieldValueEnumAccess().getEnumRefKeyword_1()); }
	'enumRef='
	{ after(grammarAccess.getTMTCIFFieldValueEnumAccess().getEnumRefKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFieldValueEnum__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFFieldValueEnum__Group__2__Impl
	rule__TMTCIFFieldValueEnum__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFieldValueEnum__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFFieldValueEnumAccess().getEnumRefAssignment_2()); }
	(rule__TMTCIFFieldValueEnum__EnumRefAssignment_2)
	{ after(grammarAccess.getTMTCIFFieldValueEnumAccess().getEnumRefAssignment_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFieldValueEnum__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFFieldValueEnum__Group__3__Impl
	rule__TMTCIFFieldValueEnum__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFieldValueEnum__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFFieldValueEnumAccess().getValueRefKeyword_3()); }
	'valueRef='
	{ after(grammarAccess.getTMTCIFFieldValueEnumAccess().getValueRefKeyword_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFieldValueEnum__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFFieldValueEnum__Group__4__Impl
	rule__TMTCIFFieldValueEnum__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFieldValueEnum__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFFieldValueEnumAccess().getValueRefAssignment_4()); }
	(rule__TMTCIFFieldValueEnum__ValueRefAssignment_4)
	{ after(grammarAccess.getTMTCIFFieldValueEnumAccess().getValueRefAssignment_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFieldValueEnum__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFFieldValueEnum__Group__5__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFieldValueEnum__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFFieldValueEnumAccess().getSolidusGreaterThanSignKeyword_5()); }
	'/>'
	{ after(grammarAccess.getTMTCIFFieldValueEnumAccess().getSolidusGreaterThanSignKeyword_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__VTMTemplate__NameAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getVTMTemplateAccess().getNameSTRINGTerminalRuleCall_2_0()); }
		RULE_STRING
		{ after(grammarAccess.getVTMTemplateAccess().getNameSTRINGTerminalRuleCall_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__VTMTemplate__TmAssignment_4
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getVTMTemplateAccess().getTmTMTCIFTMCrossReference_4_0()); }
		(
			{ before(grammarAccess.getVTMTemplateAccess().getTmTMTCIFTMSTRINGTerminalRuleCall_4_0_1()); }
			RULE_STRING
			{ after(grammarAccess.getVTMTemplateAccess().getTmTMTCIFTMSTRINGTerminalRuleCall_4_0_1()); }
		)
		{ after(grammarAccess.getVTMTemplateAccess().getTmTMTCIFTMCrossReference_4_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__VTMTemplate__FieldsAssignment_5_0_1_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getVTMTemplateAccess().getFieldsVTMTemplateFieldParserRuleCall_5_0_1_1_0()); }
		ruleVTMTemplateField
		{ after(grammarAccess.getVTMTemplateAccess().getFieldsVTMTemplateFieldParserRuleCall_5_0_1_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__VTMTemplateField__FieldRefAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getVTMTemplateFieldAccess().getFieldRefTMTCIFTMFieldCrossReference_2_0()); }
		(
			{ before(grammarAccess.getVTMTemplateFieldAccess().getFieldRefTMTCIFTMFieldSTRINGTerminalRuleCall_2_0_1()); }
			RULE_STRING
			{ after(grammarAccess.getVTMTemplateFieldAccess().getFieldRefTMTCIFTMFieldSTRINGTerminalRuleCall_2_0_1()); }
		)
		{ after(grammarAccess.getVTMTemplateFieldAccess().getFieldRefTMTCIFTMFieldCrossReference_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__VTMTemplateField__ValueAssignment_4
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getVTMTemplateFieldAccess().getValueTMTCIFFieldValueParserRuleCall_4_0()); }
		ruleTMTCIFFieldValue
		{ after(grammarAccess.getVTMTemplateFieldAccess().getValueTMTCIFFieldValueParserRuleCall_4_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFieldValueRaw__ValueAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTMTCIFFieldValueRawAccess().getValueAlternatives_2_0()); }
		(rule__TMTCIFFieldValueRaw__ValueAlternatives_2_0)
		{ after(grammarAccess.getTMTCIFFieldValueRawAccess().getValueAlternatives_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFieldValueFile__FilenameAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTMTCIFFieldValueFileAccess().getFilenameSTRINGTerminalRuleCall_2_0()); }
		RULE_STRING
		{ after(grammarAccess.getTMTCIFFieldValueFileAccess().getFilenameSTRINGTerminalRuleCall_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFieldValueEnum__EnumRefAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTMTCIFFieldValueEnumAccess().getEnumRefTMTCIFEnumCrossReference_2_0()); }
		(
			{ before(grammarAccess.getTMTCIFFieldValueEnumAccess().getEnumRefTMTCIFEnumSTRINGTerminalRuleCall_2_0_1()); }
			RULE_STRING
			{ after(grammarAccess.getTMTCIFFieldValueEnumAccess().getEnumRefTMTCIFEnumSTRINGTerminalRuleCall_2_0_1()); }
		)
		{ after(grammarAccess.getTMTCIFFieldValueEnumAccess().getEnumRefTMTCIFEnumCrossReference_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFieldValueEnum__ValueRefAssignment_4
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTMTCIFFieldValueEnumAccess().getValueRefTMTCIFEnumValueCrossReference_4_0()); }
		(
			{ before(grammarAccess.getTMTCIFFieldValueEnumAccess().getValueRefTMTCIFEnumValueSTRINGTerminalRuleCall_4_0_1()); }
			RULE_STRING
			{ after(grammarAccess.getTMTCIFFieldValueEnumAccess().getValueRefTMTCIFEnumValueSTRINGTerminalRuleCall_4_0_1()); }
		)
		{ after(grammarAccess.getTMTCIFFieldValueEnumAccess().getValueRefTMTCIFEnumValueCrossReference_4_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

RULE_UINT_STRING : '"' ('0'..'9')+ '"';

RULE_HEX_STRING : '"0x' ('0'..'9'|'a'..'f'|'A'..'F')+ '"';

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;
