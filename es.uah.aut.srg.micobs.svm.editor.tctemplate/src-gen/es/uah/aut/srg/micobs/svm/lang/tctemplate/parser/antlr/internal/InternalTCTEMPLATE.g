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
grammar InternalTCTEMPLATE;

options {
	superClass=AbstractInternalAntlrParser;
	backtrack=true;
}

@lexer::header {
package es.uah.aut.srg.micobs.svm.lang.tctemplate.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

@parser::header {
package es.uah.aut.srg.micobs.svm.lang.tctemplate.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import es.uah.aut.srg.micobs.svm.lang.tctemplate.services.TCTEMPLATEGrammarAccess;

}

@parser::members {

/*
  This grammar contains a lot of empty actions to work around a bug in ANTLR.
  Otherwise the ANTLR tool will create synpreds that cannot be compiled in some rare cases.
*/

 	private TCTEMPLATEGrammarAccess grammarAccess;

    public InternalTCTEMPLATEParser(TokenStream input, TCTEMPLATEGrammarAccess grammarAccess) {
        this(input);
        this.grammarAccess = grammarAccess;
        registerRules(grammarAccess.getGrammar());
    }

    @Override
    protected String getFirstRuleName() {
    	return "VTCTemplate";
   	}

   	@Override
   	protected TCTEMPLATEGrammarAccess getGrammarAccess() {
   		return grammarAccess;
   	}

}

@rulecatch {
    catch (RecognitionException re) {
        recover(input,re);
        appendSkippedTokens();
    }
}

// Entry rule entryRuleVTCTemplate
entryRuleVTCTemplate returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getVTCTemplateRule()); }
	iv_ruleVTCTemplate=ruleVTCTemplate
	{ $current=$iv_ruleVTCTemplate.current; }
	EOF;

// Rule VTCTemplate
ruleVTCTemplate returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='<TCTemplate'
		{
			newLeafNode(otherlv_0, grammarAccess.getVTCTemplateAccess().getTCTemplateKeyword_0());
		}
		otherlv_1='name='
		{
			newLeafNode(otherlv_1, grammarAccess.getVTCTemplateAccess().getNameKeyword_1());
		}
		(
			(
				lv_name_2_0=RULE_STRING
				{
					newLeafNode(lv_name_2_0, grammarAccess.getVTCTemplateAccess().getNameSTRINGTerminalRuleCall_2_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getVTCTemplateRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_2_0,
						"org.eclipse.xtext.common.Terminals.STRING");
				}
			)
		)
		otherlv_3='tc='
		{
			newLeafNode(otherlv_3, grammarAccess.getVTCTemplateAccess().getTcKeyword_3());
		}
		(
			(
				{
					/* */
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getVTCTemplateRule());
					}
				}
				otherlv_4=RULE_STRING
				{
					newLeafNode(otherlv_4, grammarAccess.getVTCTemplateAccess().getTcTMTCIFTCCrossReference_4_0());
				}
			)
		)
		(
			(
				otherlv_5='>'
				{
					newLeafNode(otherlv_5, grammarAccess.getVTCTemplateAccess().getGreaterThanSignKeyword_5_0_0());
				}
				(
					otherlv_6='<Fields>'
					{
						newLeafNode(otherlv_6, grammarAccess.getVTCTemplateAccess().getFieldsKeyword_5_0_1_0());
					}
					(
						(
							{
								newCompositeNode(grammarAccess.getVTCTemplateAccess().getFieldsVTCTemplateFieldParserRuleCall_5_0_1_1_0());
							}
							lv_fields_7_0=ruleVTCTemplateField
							{
								if ($current==null) {
									$current = createModelElementForParent(grammarAccess.getVTCTemplateRule());
								}
								add(
									$current,
									"fields",
									lv_fields_7_0,
									"es.uah.aut.srg.micobs.svm.lang.tctemplate.TCTEMPLATE.VTCTemplateField");
								afterParserOrEnumRuleCall();
							}
						)
					)+
					otherlv_8='</Fields>'
					{
						newLeafNode(otherlv_8, grammarAccess.getVTCTemplateAccess().getFieldsKeyword_5_0_1_2());
					}
				)?
				otherlv_9='</TCTemplate>'
				{
					newLeafNode(otherlv_9, grammarAccess.getVTCTemplateAccess().getTCTemplateKeyword_5_0_2());
				}
			)
			    |
			otherlv_10='/>'
			{
				newLeafNode(otherlv_10, grammarAccess.getVTCTemplateAccess().getSolidusGreaterThanSignKeyword_5_1());
			}
		)
	)
;

// Entry rule entryRuleVTCTemplateField
entryRuleVTCTemplateField returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getVTCTemplateFieldRule()); }
	iv_ruleVTCTemplateField=ruleVTCTemplateField
	{ $current=$iv_ruleVTCTemplateField.current; }
	EOF;

// Rule VTCTemplateField
ruleVTCTemplateField returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='<Field'
		{
			newLeafNode(otherlv_0, grammarAccess.getVTCTemplateFieldAccess().getFieldKeyword_0());
		}
		otherlv_1='fieldRef='
		{
			newLeafNode(otherlv_1, grammarAccess.getVTCTemplateFieldAccess().getFieldRefKeyword_1());
		}
		(
			(
				{
					/* */
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getVTCTemplateFieldRule());
					}
				}
				otherlv_2=RULE_STRING
				{
					newLeafNode(otherlv_2, grammarAccess.getVTCTemplateFieldAccess().getFieldRefTMTCIFTCFieldCrossReference_2_0());
				}
			)
		)
		otherlv_3='>'
		{
			newLeafNode(otherlv_3, grammarAccess.getVTCTemplateFieldAccess().getGreaterThanSignKeyword_3());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getVTCTemplateFieldAccess().getValueTMTCIFFieldValueParserRuleCall_4_0());
				}
				lv_value_4_0=ruleTMTCIFFieldValue
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getVTCTemplateFieldRule());
					}
					set(
						$current,
						"value",
						lv_value_4_0,
						"es.uah.aut.srg.micobs.svm.lang.tctemplate.TCTEMPLATE.TMTCIFFieldValue");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_5='</Field>'
		{
			newLeafNode(otherlv_5, grammarAccess.getVTCTemplateFieldAccess().getFieldKeyword_5());
		}
	)
;

// Entry rule entryRuleTMTCIFFieldValue
entryRuleTMTCIFFieldValue returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getTMTCIFFieldValueRule()); }
	iv_ruleTMTCIFFieldValue=ruleTMTCIFFieldValue
	{ $current=$iv_ruleTMTCIFFieldValue.current; }
	EOF;

// Rule TMTCIFFieldValue
ruleTMTCIFFieldValue returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			/* */
		}
		{
			newCompositeNode(grammarAccess.getTMTCIFFieldValueAccess().getTMTCIFFieldValueRawParserRuleCall_0());
		}
		this_TMTCIFFieldValueRaw_0=ruleTMTCIFFieldValueRaw
		{
			$current = $this_TMTCIFFieldValueRaw_0.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			/* */
		}
		{
			newCompositeNode(grammarAccess.getTMTCIFFieldValueAccess().getTMTCIFFieldValueFileParserRuleCall_1());
		}
		this_TMTCIFFieldValueFile_1=ruleTMTCIFFieldValueFile
		{
			$current = $this_TMTCIFFieldValueFile_1.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			/* */
		}
		{
			newCompositeNode(grammarAccess.getTMTCIFFieldValueAccess().getTMTCIFFieldValueEnumParserRuleCall_2());
		}
		this_TMTCIFFieldValueEnum_2=ruleTMTCIFFieldValueEnum
		{
			$current = $this_TMTCIFFieldValueEnum_2.current;
			afterParserOrEnumRuleCall();
		}
	)
;

// Entry rule entryRuleTMTCIFFieldValueRaw
entryRuleTMTCIFFieldValueRaw returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getTMTCIFFieldValueRawRule()); }
	iv_ruleTMTCIFFieldValueRaw=ruleTMTCIFFieldValueRaw
	{ $current=$iv_ruleTMTCIFFieldValueRaw.current; }
	EOF;

// Rule TMTCIFFieldValueRaw
ruleTMTCIFFieldValueRaw returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='<FieldValueRaw'
		{
			newLeafNode(otherlv_0, grammarAccess.getTMTCIFFieldValueRawAccess().getFieldValueRawKeyword_0());
		}
		otherlv_1='value='
		{
			newLeafNode(otherlv_1, grammarAccess.getTMTCIFFieldValueRawAccess().getValueKeyword_1());
		}
		(
			(
				(
					lv_value_2_1=RULE_UINT_STRING
					{
						newLeafNode(lv_value_2_1, grammarAccess.getTMTCIFFieldValueRawAccess().getValueUINT_STRINGTerminalRuleCall_2_0_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getTMTCIFFieldValueRawRule());
						}
						setWithLastConsumed(
							$current,
							"value",
							lv_value_2_1,
							"es.uah.aut.srg.micobs.svm.lang.tctemplate.TCTEMPLATE.UINT_STRING");
					}
					    |
					lv_value_2_2=RULE_HEX_STRING
					{
						newLeafNode(lv_value_2_2, grammarAccess.getTMTCIFFieldValueRawAccess().getValueHEX_STRINGTerminalRuleCall_2_0_1());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getTMTCIFFieldValueRawRule());
						}
						setWithLastConsumed(
							$current,
							"value",
							lv_value_2_2,
							"es.uah.aut.srg.micobs.svm.lang.tctemplate.TCTEMPLATE.HEX_STRING");
					}
				)
			)
		)
		otherlv_3='/>'
		{
			newLeafNode(otherlv_3, grammarAccess.getTMTCIFFieldValueRawAccess().getSolidusGreaterThanSignKeyword_3());
		}
	)
;

// Entry rule entryRuleTMTCIFFieldValueFile
entryRuleTMTCIFFieldValueFile returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getTMTCIFFieldValueFileRule()); }
	iv_ruleTMTCIFFieldValueFile=ruleTMTCIFFieldValueFile
	{ $current=$iv_ruleTMTCIFFieldValueFile.current; }
	EOF;

// Rule TMTCIFFieldValueFile
ruleTMTCIFFieldValueFile returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='<FieldValueFile'
		{
			newLeafNode(otherlv_0, grammarAccess.getTMTCIFFieldValueFileAccess().getFieldValueFileKeyword_0());
		}
		otherlv_1='filename='
		{
			newLeafNode(otherlv_1, grammarAccess.getTMTCIFFieldValueFileAccess().getFilenameKeyword_1());
		}
		(
			(
				lv_filename_2_0=RULE_STRING
				{
					newLeafNode(lv_filename_2_0, grammarAccess.getTMTCIFFieldValueFileAccess().getFilenameSTRINGTerminalRuleCall_2_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getTMTCIFFieldValueFileRule());
					}
					setWithLastConsumed(
						$current,
						"filename",
						lv_filename_2_0,
						"org.eclipse.xtext.common.Terminals.STRING");
				}
			)
		)
		otherlv_3='/>'
		{
			newLeafNode(otherlv_3, grammarAccess.getTMTCIFFieldValueFileAccess().getSolidusGreaterThanSignKeyword_3());
		}
	)
;

// Entry rule entryRuleTMTCIFFieldValueEnum
entryRuleTMTCIFFieldValueEnum returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getTMTCIFFieldValueEnumRule()); }
	iv_ruleTMTCIFFieldValueEnum=ruleTMTCIFFieldValueEnum
	{ $current=$iv_ruleTMTCIFFieldValueEnum.current; }
	EOF;

// Rule TMTCIFFieldValueEnum
ruleTMTCIFFieldValueEnum returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='<FieldValueEnum'
		{
			newLeafNode(otherlv_0, grammarAccess.getTMTCIFFieldValueEnumAccess().getFieldValueEnumKeyword_0());
		}
		otherlv_1='enumRef='
		{
			newLeafNode(otherlv_1, grammarAccess.getTMTCIFFieldValueEnumAccess().getEnumRefKeyword_1());
		}
		(
			(
				{
					/* */
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getTMTCIFFieldValueEnumRule());
					}
				}
				otherlv_2=RULE_STRING
				{
					newLeafNode(otherlv_2, grammarAccess.getTMTCIFFieldValueEnumAccess().getEnumRefTMTCIFEnumCrossReference_2_0());
				}
			)
		)
		otherlv_3='valueRef='
		{
			newLeafNode(otherlv_3, grammarAccess.getTMTCIFFieldValueEnumAccess().getValueRefKeyword_3());
		}
		(
			(
				{
					/* */
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getTMTCIFFieldValueEnumRule());
					}
				}
				otherlv_4=RULE_STRING
				{
					newLeafNode(otherlv_4, grammarAccess.getTMTCIFFieldValueEnumAccess().getValueRefTMTCIFEnumValueCrossReference_4_0());
				}
			)
		)
		otherlv_5='/>'
		{
			newLeafNode(otherlv_5, grammarAccess.getTMTCIFFieldValueEnumAccess().getSolidusGreaterThanSignKeyword_5());
		}
	)
;

RULE_UINT_STRING : '"' ('0'..'9')+ '"';

RULE_HEX_STRING : '"0x' ('0'..'9'|'a'..'f'|'A'..'F')+ '"';

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;
