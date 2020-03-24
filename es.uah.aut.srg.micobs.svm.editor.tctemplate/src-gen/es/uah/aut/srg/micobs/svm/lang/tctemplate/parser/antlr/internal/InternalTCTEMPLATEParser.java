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



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
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
@SuppressWarnings("all")
public class InternalTCTEMPLATEParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_UINT_STRING", "RULE_HEX_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'<TCTemplate'", "'name='", "'tc='", "'>'", "'<Fields>'", "'</Fields>'", "'</TCTemplate>'", "'/>'", "'<Field'", "'fieldRef='", "'</Field>'", "'<FieldValueRaw'", "'value='", "'<FieldValueFile'", "'filename='", "'<FieldValueEnum'", "'enumRef='", "'valueRef='"
    };
    public static final int RULE_STRING=4;
    public static final int RULE_UINT_STRING=5;
    public static final int RULE_SL_COMMENT=10;
    public static final int T__19=19;
    public static final int RULE_HEX_STRING=6;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int RULE_ID=7;
    public static final int RULE_WS=11;
    public static final int RULE_ANY_OTHER=12;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=8;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=9;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalTCTEMPLATEParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalTCTEMPLATEParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalTCTEMPLATEParser.tokenNames; }
    public String getGrammarFileName() { return "InternalTCTEMPLATE.g"; }



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




    // $ANTLR start "entryRuleVTCTemplate"
    // InternalTCTEMPLATE.g:77:1: entryRuleVTCTemplate returns [EObject current=null] : iv_ruleVTCTemplate= ruleVTCTemplate EOF ;
    public final EObject entryRuleVTCTemplate() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVTCTemplate = null;


        try {
            // InternalTCTEMPLATE.g:77:52: (iv_ruleVTCTemplate= ruleVTCTemplate EOF )
            // InternalTCTEMPLATE.g:78:2: iv_ruleVTCTemplate= ruleVTCTemplate EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getVTCTemplateRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleVTCTemplate=ruleVTCTemplate();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleVTCTemplate; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleVTCTemplate"


    // $ANTLR start "ruleVTCTemplate"
    // InternalTCTEMPLATE.g:84:1: ruleVTCTemplate returns [EObject current=null] : (otherlv_0= '<TCTemplate' otherlv_1= 'name=' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= 'tc=' ( (otherlv_4= RULE_STRING ) ) ( (otherlv_5= '>' (otherlv_6= '<Fields>' ( (lv_fields_7_0= ruleVTCTemplateField ) )+ otherlv_8= '</Fields>' )? otherlv_9= '</TCTemplate>' ) | otherlv_10= '/>' ) ) ;
    public final EObject ruleVTCTemplate() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        EObject lv_fields_7_0 = null;



        	enterRule();

        try {
            // InternalTCTEMPLATE.g:90:2: ( (otherlv_0= '<TCTemplate' otherlv_1= 'name=' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= 'tc=' ( (otherlv_4= RULE_STRING ) ) ( (otherlv_5= '>' (otherlv_6= '<Fields>' ( (lv_fields_7_0= ruleVTCTemplateField ) )+ otherlv_8= '</Fields>' )? otherlv_9= '</TCTemplate>' ) | otherlv_10= '/>' ) ) )
            // InternalTCTEMPLATE.g:91:2: (otherlv_0= '<TCTemplate' otherlv_1= 'name=' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= 'tc=' ( (otherlv_4= RULE_STRING ) ) ( (otherlv_5= '>' (otherlv_6= '<Fields>' ( (lv_fields_7_0= ruleVTCTemplateField ) )+ otherlv_8= '</Fields>' )? otherlv_9= '</TCTemplate>' ) | otherlv_10= '/>' ) )
            {
            // InternalTCTEMPLATE.g:91:2: (otherlv_0= '<TCTemplate' otherlv_1= 'name=' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= 'tc=' ( (otherlv_4= RULE_STRING ) ) ( (otherlv_5= '>' (otherlv_6= '<Fields>' ( (lv_fields_7_0= ruleVTCTemplateField ) )+ otherlv_8= '</Fields>' )? otherlv_9= '</TCTemplate>' ) | otherlv_10= '/>' ) )
            // InternalTCTEMPLATE.g:92:3: otherlv_0= '<TCTemplate' otherlv_1= 'name=' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= 'tc=' ( (otherlv_4= RULE_STRING ) ) ( (otherlv_5= '>' (otherlv_6= '<Fields>' ( (lv_fields_7_0= ruleVTCTemplateField ) )+ otherlv_8= '</Fields>' )? otherlv_9= '</TCTemplate>' ) | otherlv_10= '/>' )
            {
            otherlv_0=(Token)match(input,13,FollowSets000.FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getVTCTemplateAccess().getTCTemplateKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,14,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getVTCTemplateAccess().getNameKeyword_1());
              		
            }
            // InternalTCTEMPLATE.g:100:3: ( (lv_name_2_0= RULE_STRING ) )
            // InternalTCTEMPLATE.g:101:4: (lv_name_2_0= RULE_STRING )
            {
            // InternalTCTEMPLATE.g:101:4: (lv_name_2_0= RULE_STRING )
            // InternalTCTEMPLATE.g:102:5: lv_name_2_0= RULE_STRING
            {
            lv_name_2_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_2_0, grammarAccess.getVTCTemplateAccess().getNameSTRINGTerminalRuleCall_2_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getVTCTemplateRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_2_0,
              						"org.eclipse.xtext.common.Terminals.STRING");
              				
            }

            }


            }

            otherlv_3=(Token)match(input,15,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getVTCTemplateAccess().getTcKeyword_3());
              		
            }
            // InternalTCTEMPLATE.g:122:3: ( (otherlv_4= RULE_STRING ) )
            // InternalTCTEMPLATE.g:123:4: (otherlv_4= RULE_STRING )
            {
            // InternalTCTEMPLATE.g:123:4: (otherlv_4= RULE_STRING )
            // InternalTCTEMPLATE.g:124:5: otherlv_4= RULE_STRING
            {
            if ( state.backtracking==0 ) {

              					/* */
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getVTCTemplateRule());
              					}
              				
            }
            otherlv_4=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(otherlv_4, grammarAccess.getVTCTemplateAccess().getTcTMTCIFTCCrossReference_4_0());
              				
            }

            }


            }

            // InternalTCTEMPLATE.g:138:3: ( (otherlv_5= '>' (otherlv_6= '<Fields>' ( (lv_fields_7_0= ruleVTCTemplateField ) )+ otherlv_8= '</Fields>' )? otherlv_9= '</TCTemplate>' ) | otherlv_10= '/>' )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==16) ) {
                alt3=1;
            }
            else if ( (LA3_0==20) ) {
                alt3=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalTCTEMPLATE.g:139:4: (otherlv_5= '>' (otherlv_6= '<Fields>' ( (lv_fields_7_0= ruleVTCTemplateField ) )+ otherlv_8= '</Fields>' )? otherlv_9= '</TCTemplate>' )
                    {
                    // InternalTCTEMPLATE.g:139:4: (otherlv_5= '>' (otherlv_6= '<Fields>' ( (lv_fields_7_0= ruleVTCTemplateField ) )+ otherlv_8= '</Fields>' )? otherlv_9= '</TCTemplate>' )
                    // InternalTCTEMPLATE.g:140:5: otherlv_5= '>' (otherlv_6= '<Fields>' ( (lv_fields_7_0= ruleVTCTemplateField ) )+ otherlv_8= '</Fields>' )? otherlv_9= '</TCTemplate>'
                    {
                    otherlv_5=(Token)match(input,16,FollowSets000.FOLLOW_7); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_5, grammarAccess.getVTCTemplateAccess().getGreaterThanSignKeyword_5_0_0());
                      				
                    }
                    // InternalTCTEMPLATE.g:144:5: (otherlv_6= '<Fields>' ( (lv_fields_7_0= ruleVTCTemplateField ) )+ otherlv_8= '</Fields>' )?
                    int alt2=2;
                    int LA2_0 = input.LA(1);

                    if ( (LA2_0==17) ) {
                        alt2=1;
                    }
                    switch (alt2) {
                        case 1 :
                            // InternalTCTEMPLATE.g:145:6: otherlv_6= '<Fields>' ( (lv_fields_7_0= ruleVTCTemplateField ) )+ otherlv_8= '</Fields>'
                            {
                            otherlv_6=(Token)match(input,17,FollowSets000.FOLLOW_8); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              						newLeafNode(otherlv_6, grammarAccess.getVTCTemplateAccess().getFieldsKeyword_5_0_1_0());
                              					
                            }
                            // InternalTCTEMPLATE.g:149:6: ( (lv_fields_7_0= ruleVTCTemplateField ) )+
                            int cnt1=0;
                            loop1:
                            do {
                                int alt1=2;
                                int LA1_0 = input.LA(1);

                                if ( (LA1_0==21) ) {
                                    alt1=1;
                                }


                                switch (alt1) {
                            	case 1 :
                            	    // InternalTCTEMPLATE.g:150:7: (lv_fields_7_0= ruleVTCTemplateField )
                            	    {
                            	    // InternalTCTEMPLATE.g:150:7: (lv_fields_7_0= ruleVTCTemplateField )
                            	    // InternalTCTEMPLATE.g:151:8: lv_fields_7_0= ruleVTCTemplateField
                            	    {
                            	    if ( state.backtracking==0 ) {

                            	      								newCompositeNode(grammarAccess.getVTCTemplateAccess().getFieldsVTCTemplateFieldParserRuleCall_5_0_1_1_0());
                            	      							
                            	    }
                            	    pushFollow(FollowSets000.FOLLOW_9);
                            	    lv_fields_7_0=ruleVTCTemplateField();

                            	    state._fsp--;
                            	    if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	      								if (current==null) {
                            	      									current = createModelElementForParent(grammarAccess.getVTCTemplateRule());
                            	      								}
                            	      								add(
                            	      									current,
                            	      									"fields",
                            	      									lv_fields_7_0,
                            	      									"es.uah.aut.srg.micobs.svm.lang.tctemplate.TCTEMPLATE.VTCTemplateField");
                            	      								afterParserOrEnumRuleCall();
                            	      							
                            	    }

                            	    }


                            	    }
                            	    break;

                            	default :
                            	    if ( cnt1 >= 1 ) break loop1;
                            	    if (state.backtracking>0) {state.failed=true; return current;}
                                        EarlyExitException eee =
                                            new EarlyExitException(1, input);
                                        throw eee;
                                }
                                cnt1++;
                            } while (true);

                            otherlv_8=(Token)match(input,18,FollowSets000.FOLLOW_10); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              						newLeafNode(otherlv_8, grammarAccess.getVTCTemplateAccess().getFieldsKeyword_5_0_1_2());
                              					
                            }

                            }
                            break;

                    }

                    otherlv_9=(Token)match(input,19,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_9, grammarAccess.getVTCTemplateAccess().getTCTemplateKeyword_5_0_2());
                      				
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalTCTEMPLATE.g:179:4: otherlv_10= '/>'
                    {
                    otherlv_10=(Token)match(input,20,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_10, grammarAccess.getVTCTemplateAccess().getSolidusGreaterThanSignKeyword_5_1());
                      			
                    }

                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleVTCTemplate"


    // $ANTLR start "entryRuleVTCTemplateField"
    // InternalTCTEMPLATE.g:188:1: entryRuleVTCTemplateField returns [EObject current=null] : iv_ruleVTCTemplateField= ruleVTCTemplateField EOF ;
    public final EObject entryRuleVTCTemplateField() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVTCTemplateField = null;


        try {
            // InternalTCTEMPLATE.g:188:57: (iv_ruleVTCTemplateField= ruleVTCTemplateField EOF )
            // InternalTCTEMPLATE.g:189:2: iv_ruleVTCTemplateField= ruleVTCTemplateField EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getVTCTemplateFieldRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleVTCTemplateField=ruleVTCTemplateField();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleVTCTemplateField; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleVTCTemplateField"


    // $ANTLR start "ruleVTCTemplateField"
    // InternalTCTEMPLATE.g:195:1: ruleVTCTemplateField returns [EObject current=null] : (otherlv_0= '<Field' otherlv_1= 'fieldRef=' ( (otherlv_2= RULE_STRING ) ) otherlv_3= '>' ( (lv_value_4_0= ruleTMTCIFFieldValue ) ) otherlv_5= '</Field>' ) ;
    public final EObject ruleVTCTemplateField() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_value_4_0 = null;



        	enterRule();

        try {
            // InternalTCTEMPLATE.g:201:2: ( (otherlv_0= '<Field' otherlv_1= 'fieldRef=' ( (otherlv_2= RULE_STRING ) ) otherlv_3= '>' ( (lv_value_4_0= ruleTMTCIFFieldValue ) ) otherlv_5= '</Field>' ) )
            // InternalTCTEMPLATE.g:202:2: (otherlv_0= '<Field' otherlv_1= 'fieldRef=' ( (otherlv_2= RULE_STRING ) ) otherlv_3= '>' ( (lv_value_4_0= ruleTMTCIFFieldValue ) ) otherlv_5= '</Field>' )
            {
            // InternalTCTEMPLATE.g:202:2: (otherlv_0= '<Field' otherlv_1= 'fieldRef=' ( (otherlv_2= RULE_STRING ) ) otherlv_3= '>' ( (lv_value_4_0= ruleTMTCIFFieldValue ) ) otherlv_5= '</Field>' )
            // InternalTCTEMPLATE.g:203:3: otherlv_0= '<Field' otherlv_1= 'fieldRef=' ( (otherlv_2= RULE_STRING ) ) otherlv_3= '>' ( (lv_value_4_0= ruleTMTCIFFieldValue ) ) otherlv_5= '</Field>'
            {
            otherlv_0=(Token)match(input,21,FollowSets000.FOLLOW_11); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getVTCTemplateFieldAccess().getFieldKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,22,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getVTCTemplateFieldAccess().getFieldRefKeyword_1());
              		
            }
            // InternalTCTEMPLATE.g:211:3: ( (otherlv_2= RULE_STRING ) )
            // InternalTCTEMPLATE.g:212:4: (otherlv_2= RULE_STRING )
            {
            // InternalTCTEMPLATE.g:212:4: (otherlv_2= RULE_STRING )
            // InternalTCTEMPLATE.g:213:5: otherlv_2= RULE_STRING
            {
            if ( state.backtracking==0 ) {

              					/* */
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getVTCTemplateFieldRule());
              					}
              				
            }
            otherlv_2=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_12); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(otherlv_2, grammarAccess.getVTCTemplateFieldAccess().getFieldRefTMTCIFTCFieldCrossReference_2_0());
              				
            }

            }


            }

            otherlv_3=(Token)match(input,16,FollowSets000.FOLLOW_13); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getVTCTemplateFieldAccess().getGreaterThanSignKeyword_3());
              		
            }
            // InternalTCTEMPLATE.g:231:3: ( (lv_value_4_0= ruleTMTCIFFieldValue ) )
            // InternalTCTEMPLATE.g:232:4: (lv_value_4_0= ruleTMTCIFFieldValue )
            {
            // InternalTCTEMPLATE.g:232:4: (lv_value_4_0= ruleTMTCIFFieldValue )
            // InternalTCTEMPLATE.g:233:5: lv_value_4_0= ruleTMTCIFFieldValue
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getVTCTemplateFieldAccess().getValueTMTCIFFieldValueParserRuleCall_4_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_14);
            lv_value_4_0=ruleTMTCIFFieldValue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getVTCTemplateFieldRule());
              					}
              					set(
              						current,
              						"value",
              						lv_value_4_0,
              						"es.uah.aut.srg.micobs.svm.lang.tctemplate.TCTEMPLATE.TMTCIFFieldValue");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_5=(Token)match(input,23,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getVTCTemplateFieldAccess().getFieldKeyword_5());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleVTCTemplateField"


    // $ANTLR start "entryRuleTMTCIFFieldValue"
    // InternalTCTEMPLATE.g:258:1: entryRuleTMTCIFFieldValue returns [EObject current=null] : iv_ruleTMTCIFFieldValue= ruleTMTCIFFieldValue EOF ;
    public final EObject entryRuleTMTCIFFieldValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTMTCIFFieldValue = null;


        try {
            // InternalTCTEMPLATE.g:258:57: (iv_ruleTMTCIFFieldValue= ruleTMTCIFFieldValue EOF )
            // InternalTCTEMPLATE.g:259:2: iv_ruleTMTCIFFieldValue= ruleTMTCIFFieldValue EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTMTCIFFieldValueRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleTMTCIFFieldValue=ruleTMTCIFFieldValue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTMTCIFFieldValue; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTMTCIFFieldValue"


    // $ANTLR start "ruleTMTCIFFieldValue"
    // InternalTCTEMPLATE.g:265:1: ruleTMTCIFFieldValue returns [EObject current=null] : (this_TMTCIFFieldValueRaw_0= ruleTMTCIFFieldValueRaw | this_TMTCIFFieldValueFile_1= ruleTMTCIFFieldValueFile | this_TMTCIFFieldValueEnum_2= ruleTMTCIFFieldValueEnum ) ;
    public final EObject ruleTMTCIFFieldValue() throws RecognitionException {
        EObject current = null;

        EObject this_TMTCIFFieldValueRaw_0 = null;

        EObject this_TMTCIFFieldValueFile_1 = null;

        EObject this_TMTCIFFieldValueEnum_2 = null;



        	enterRule();

        try {
            // InternalTCTEMPLATE.g:271:2: ( (this_TMTCIFFieldValueRaw_0= ruleTMTCIFFieldValueRaw | this_TMTCIFFieldValueFile_1= ruleTMTCIFFieldValueFile | this_TMTCIFFieldValueEnum_2= ruleTMTCIFFieldValueEnum ) )
            // InternalTCTEMPLATE.g:272:2: (this_TMTCIFFieldValueRaw_0= ruleTMTCIFFieldValueRaw | this_TMTCIFFieldValueFile_1= ruleTMTCIFFieldValueFile | this_TMTCIFFieldValueEnum_2= ruleTMTCIFFieldValueEnum )
            {
            // InternalTCTEMPLATE.g:272:2: (this_TMTCIFFieldValueRaw_0= ruleTMTCIFFieldValueRaw | this_TMTCIFFieldValueFile_1= ruleTMTCIFFieldValueFile | this_TMTCIFFieldValueEnum_2= ruleTMTCIFFieldValueEnum )
            int alt4=3;
            switch ( input.LA(1) ) {
            case 24:
                {
                alt4=1;
                }
                break;
            case 26:
                {
                alt4=2;
                }
                break;
            case 28:
                {
                alt4=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // InternalTCTEMPLATE.g:273:3: this_TMTCIFFieldValueRaw_0= ruleTMTCIFFieldValueRaw
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getTMTCIFFieldValueAccess().getTMTCIFFieldValueRawParserRuleCall_0());
                      		
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_TMTCIFFieldValueRaw_0=ruleTMTCIFFieldValueRaw();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_TMTCIFFieldValueRaw_0;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalTCTEMPLATE.g:285:3: this_TMTCIFFieldValueFile_1= ruleTMTCIFFieldValueFile
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getTMTCIFFieldValueAccess().getTMTCIFFieldValueFileParserRuleCall_1());
                      		
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_TMTCIFFieldValueFile_1=ruleTMTCIFFieldValueFile();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_TMTCIFFieldValueFile_1;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalTCTEMPLATE.g:297:3: this_TMTCIFFieldValueEnum_2= ruleTMTCIFFieldValueEnum
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getTMTCIFFieldValueAccess().getTMTCIFFieldValueEnumParserRuleCall_2());
                      		
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_TMTCIFFieldValueEnum_2=ruleTMTCIFFieldValueEnum();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_TMTCIFFieldValueEnum_2;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTMTCIFFieldValue"


    // $ANTLR start "entryRuleTMTCIFFieldValueRaw"
    // InternalTCTEMPLATE.g:312:1: entryRuleTMTCIFFieldValueRaw returns [EObject current=null] : iv_ruleTMTCIFFieldValueRaw= ruleTMTCIFFieldValueRaw EOF ;
    public final EObject entryRuleTMTCIFFieldValueRaw() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTMTCIFFieldValueRaw = null;


        try {
            // InternalTCTEMPLATE.g:312:60: (iv_ruleTMTCIFFieldValueRaw= ruleTMTCIFFieldValueRaw EOF )
            // InternalTCTEMPLATE.g:313:2: iv_ruleTMTCIFFieldValueRaw= ruleTMTCIFFieldValueRaw EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTMTCIFFieldValueRawRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleTMTCIFFieldValueRaw=ruleTMTCIFFieldValueRaw();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTMTCIFFieldValueRaw; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTMTCIFFieldValueRaw"


    // $ANTLR start "ruleTMTCIFFieldValueRaw"
    // InternalTCTEMPLATE.g:319:1: ruleTMTCIFFieldValueRaw returns [EObject current=null] : (otherlv_0= '<FieldValueRaw' otherlv_1= 'value=' ( ( (lv_value_2_1= RULE_UINT_STRING | lv_value_2_2= RULE_HEX_STRING ) ) ) otherlv_3= '/>' ) ;
    public final EObject ruleTMTCIFFieldValueRaw() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_value_2_1=null;
        Token lv_value_2_2=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalTCTEMPLATE.g:325:2: ( (otherlv_0= '<FieldValueRaw' otherlv_1= 'value=' ( ( (lv_value_2_1= RULE_UINT_STRING | lv_value_2_2= RULE_HEX_STRING ) ) ) otherlv_3= '/>' ) )
            // InternalTCTEMPLATE.g:326:2: (otherlv_0= '<FieldValueRaw' otherlv_1= 'value=' ( ( (lv_value_2_1= RULE_UINT_STRING | lv_value_2_2= RULE_HEX_STRING ) ) ) otherlv_3= '/>' )
            {
            // InternalTCTEMPLATE.g:326:2: (otherlv_0= '<FieldValueRaw' otherlv_1= 'value=' ( ( (lv_value_2_1= RULE_UINT_STRING | lv_value_2_2= RULE_HEX_STRING ) ) ) otherlv_3= '/>' )
            // InternalTCTEMPLATE.g:327:3: otherlv_0= '<FieldValueRaw' otherlv_1= 'value=' ( ( (lv_value_2_1= RULE_UINT_STRING | lv_value_2_2= RULE_HEX_STRING ) ) ) otherlv_3= '/>'
            {
            otherlv_0=(Token)match(input,24,FollowSets000.FOLLOW_15); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getTMTCIFFieldValueRawAccess().getFieldValueRawKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,25,FollowSets000.FOLLOW_16); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getTMTCIFFieldValueRawAccess().getValueKeyword_1());
              		
            }
            // InternalTCTEMPLATE.g:335:3: ( ( (lv_value_2_1= RULE_UINT_STRING | lv_value_2_2= RULE_HEX_STRING ) ) )
            // InternalTCTEMPLATE.g:336:4: ( (lv_value_2_1= RULE_UINT_STRING | lv_value_2_2= RULE_HEX_STRING ) )
            {
            // InternalTCTEMPLATE.g:336:4: ( (lv_value_2_1= RULE_UINT_STRING | lv_value_2_2= RULE_HEX_STRING ) )
            // InternalTCTEMPLATE.g:337:5: (lv_value_2_1= RULE_UINT_STRING | lv_value_2_2= RULE_HEX_STRING )
            {
            // InternalTCTEMPLATE.g:337:5: (lv_value_2_1= RULE_UINT_STRING | lv_value_2_2= RULE_HEX_STRING )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==RULE_UINT_STRING) ) {
                alt5=1;
            }
            else if ( (LA5_0==RULE_HEX_STRING) ) {
                alt5=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalTCTEMPLATE.g:338:6: lv_value_2_1= RULE_UINT_STRING
                    {
                    lv_value_2_1=(Token)match(input,RULE_UINT_STRING,FollowSets000.FOLLOW_17); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_value_2_1, grammarAccess.getTMTCIFFieldValueRawAccess().getValueUINT_STRINGTerminalRuleCall_2_0_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getTMTCIFFieldValueRawRule());
                      						}
                      						setWithLastConsumed(
                      							current,
                      							"value",
                      							lv_value_2_1,
                      							"es.uah.aut.srg.micobs.svm.lang.tctemplate.TCTEMPLATE.UINT_STRING");
                      					
                    }

                    }
                    break;
                case 2 :
                    // InternalTCTEMPLATE.g:353:6: lv_value_2_2= RULE_HEX_STRING
                    {
                    lv_value_2_2=(Token)match(input,RULE_HEX_STRING,FollowSets000.FOLLOW_17); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_value_2_2, grammarAccess.getTMTCIFFieldValueRawAccess().getValueHEX_STRINGTerminalRuleCall_2_0_1());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getTMTCIFFieldValueRawRule());
                      						}
                      						setWithLastConsumed(
                      							current,
                      							"value",
                      							lv_value_2_2,
                      							"es.uah.aut.srg.micobs.svm.lang.tctemplate.TCTEMPLATE.HEX_STRING");
                      					
                    }

                    }
                    break;

            }


            }


            }

            otherlv_3=(Token)match(input,20,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getTMTCIFFieldValueRawAccess().getSolidusGreaterThanSignKeyword_3());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTMTCIFFieldValueRaw"


    // $ANTLR start "entryRuleTMTCIFFieldValueFile"
    // InternalTCTEMPLATE.g:378:1: entryRuleTMTCIFFieldValueFile returns [EObject current=null] : iv_ruleTMTCIFFieldValueFile= ruleTMTCIFFieldValueFile EOF ;
    public final EObject entryRuleTMTCIFFieldValueFile() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTMTCIFFieldValueFile = null;


        try {
            // InternalTCTEMPLATE.g:378:61: (iv_ruleTMTCIFFieldValueFile= ruleTMTCIFFieldValueFile EOF )
            // InternalTCTEMPLATE.g:379:2: iv_ruleTMTCIFFieldValueFile= ruleTMTCIFFieldValueFile EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTMTCIFFieldValueFileRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleTMTCIFFieldValueFile=ruleTMTCIFFieldValueFile();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTMTCIFFieldValueFile; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTMTCIFFieldValueFile"


    // $ANTLR start "ruleTMTCIFFieldValueFile"
    // InternalTCTEMPLATE.g:385:1: ruleTMTCIFFieldValueFile returns [EObject current=null] : (otherlv_0= '<FieldValueFile' otherlv_1= 'filename=' ( (lv_filename_2_0= RULE_STRING ) ) otherlv_3= '/>' ) ;
    public final EObject ruleTMTCIFFieldValueFile() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_filename_2_0=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalTCTEMPLATE.g:391:2: ( (otherlv_0= '<FieldValueFile' otherlv_1= 'filename=' ( (lv_filename_2_0= RULE_STRING ) ) otherlv_3= '/>' ) )
            // InternalTCTEMPLATE.g:392:2: (otherlv_0= '<FieldValueFile' otherlv_1= 'filename=' ( (lv_filename_2_0= RULE_STRING ) ) otherlv_3= '/>' )
            {
            // InternalTCTEMPLATE.g:392:2: (otherlv_0= '<FieldValueFile' otherlv_1= 'filename=' ( (lv_filename_2_0= RULE_STRING ) ) otherlv_3= '/>' )
            // InternalTCTEMPLATE.g:393:3: otherlv_0= '<FieldValueFile' otherlv_1= 'filename=' ( (lv_filename_2_0= RULE_STRING ) ) otherlv_3= '/>'
            {
            otherlv_0=(Token)match(input,26,FollowSets000.FOLLOW_18); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getTMTCIFFieldValueFileAccess().getFieldValueFileKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,27,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getTMTCIFFieldValueFileAccess().getFilenameKeyword_1());
              		
            }
            // InternalTCTEMPLATE.g:401:3: ( (lv_filename_2_0= RULE_STRING ) )
            // InternalTCTEMPLATE.g:402:4: (lv_filename_2_0= RULE_STRING )
            {
            // InternalTCTEMPLATE.g:402:4: (lv_filename_2_0= RULE_STRING )
            // InternalTCTEMPLATE.g:403:5: lv_filename_2_0= RULE_STRING
            {
            lv_filename_2_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_17); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_filename_2_0, grammarAccess.getTMTCIFFieldValueFileAccess().getFilenameSTRINGTerminalRuleCall_2_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getTMTCIFFieldValueFileRule());
              					}
              					setWithLastConsumed(
              						current,
              						"filename",
              						lv_filename_2_0,
              						"org.eclipse.xtext.common.Terminals.STRING");
              				
            }

            }


            }

            otherlv_3=(Token)match(input,20,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getTMTCIFFieldValueFileAccess().getSolidusGreaterThanSignKeyword_3());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTMTCIFFieldValueFile"


    // $ANTLR start "entryRuleTMTCIFFieldValueEnum"
    // InternalTCTEMPLATE.g:427:1: entryRuleTMTCIFFieldValueEnum returns [EObject current=null] : iv_ruleTMTCIFFieldValueEnum= ruleTMTCIFFieldValueEnum EOF ;
    public final EObject entryRuleTMTCIFFieldValueEnum() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTMTCIFFieldValueEnum = null;


        try {
            // InternalTCTEMPLATE.g:427:61: (iv_ruleTMTCIFFieldValueEnum= ruleTMTCIFFieldValueEnum EOF )
            // InternalTCTEMPLATE.g:428:2: iv_ruleTMTCIFFieldValueEnum= ruleTMTCIFFieldValueEnum EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTMTCIFFieldValueEnumRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleTMTCIFFieldValueEnum=ruleTMTCIFFieldValueEnum();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTMTCIFFieldValueEnum; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTMTCIFFieldValueEnum"


    // $ANTLR start "ruleTMTCIFFieldValueEnum"
    // InternalTCTEMPLATE.g:434:1: ruleTMTCIFFieldValueEnum returns [EObject current=null] : (otherlv_0= '<FieldValueEnum' otherlv_1= 'enumRef=' ( (otherlv_2= RULE_STRING ) ) otherlv_3= 'valueRef=' ( (otherlv_4= RULE_STRING ) ) otherlv_5= '/>' ) ;
    public final EObject ruleTMTCIFFieldValueEnum() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;


        	enterRule();

        try {
            // InternalTCTEMPLATE.g:440:2: ( (otherlv_0= '<FieldValueEnum' otherlv_1= 'enumRef=' ( (otherlv_2= RULE_STRING ) ) otherlv_3= 'valueRef=' ( (otherlv_4= RULE_STRING ) ) otherlv_5= '/>' ) )
            // InternalTCTEMPLATE.g:441:2: (otherlv_0= '<FieldValueEnum' otherlv_1= 'enumRef=' ( (otherlv_2= RULE_STRING ) ) otherlv_3= 'valueRef=' ( (otherlv_4= RULE_STRING ) ) otherlv_5= '/>' )
            {
            // InternalTCTEMPLATE.g:441:2: (otherlv_0= '<FieldValueEnum' otherlv_1= 'enumRef=' ( (otherlv_2= RULE_STRING ) ) otherlv_3= 'valueRef=' ( (otherlv_4= RULE_STRING ) ) otherlv_5= '/>' )
            // InternalTCTEMPLATE.g:442:3: otherlv_0= '<FieldValueEnum' otherlv_1= 'enumRef=' ( (otherlv_2= RULE_STRING ) ) otherlv_3= 'valueRef=' ( (otherlv_4= RULE_STRING ) ) otherlv_5= '/>'
            {
            otherlv_0=(Token)match(input,28,FollowSets000.FOLLOW_19); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getTMTCIFFieldValueEnumAccess().getFieldValueEnumKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,29,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getTMTCIFFieldValueEnumAccess().getEnumRefKeyword_1());
              		
            }
            // InternalTCTEMPLATE.g:450:3: ( (otherlv_2= RULE_STRING ) )
            // InternalTCTEMPLATE.g:451:4: (otherlv_2= RULE_STRING )
            {
            // InternalTCTEMPLATE.g:451:4: (otherlv_2= RULE_STRING )
            // InternalTCTEMPLATE.g:452:5: otherlv_2= RULE_STRING
            {
            if ( state.backtracking==0 ) {

              					/* */
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getTMTCIFFieldValueEnumRule());
              					}
              				
            }
            otherlv_2=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_20); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(otherlv_2, grammarAccess.getTMTCIFFieldValueEnumAccess().getEnumRefTMTCIFEnumCrossReference_2_0());
              				
            }

            }


            }

            otherlv_3=(Token)match(input,30,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getTMTCIFFieldValueEnumAccess().getValueRefKeyword_3());
              		
            }
            // InternalTCTEMPLATE.g:470:3: ( (otherlv_4= RULE_STRING ) )
            // InternalTCTEMPLATE.g:471:4: (otherlv_4= RULE_STRING )
            {
            // InternalTCTEMPLATE.g:471:4: (otherlv_4= RULE_STRING )
            // InternalTCTEMPLATE.g:472:5: otherlv_4= RULE_STRING
            {
            if ( state.backtracking==0 ) {

              					/* */
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getTMTCIFFieldValueEnumRule());
              					}
              				
            }
            otherlv_4=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_17); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(otherlv_4, grammarAccess.getTMTCIFFieldValueEnumAccess().getValueRefTMTCIFEnumValueCrossReference_4_0());
              				
            }

            }


            }

            otherlv_5=(Token)match(input,20,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getTMTCIFFieldValueEnumAccess().getSolidusGreaterThanSignKeyword_5());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTMTCIFFieldValueEnum"

    // Delegated rules


 

    
    private static class FollowSets000 {
        public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000110000L});
        public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x00000000000A0000L});
        public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000200000L});
        public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000240000L});
        public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000080000L});
        public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000400000L});
        public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000015000000L});
        public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000800000L});
        public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000002000000L});
        public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000000060L});
        public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000100000L});
        public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000008000000L});
        public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000020000000L});
        public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000040000000L});
    }


}