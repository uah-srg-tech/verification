package es.uah.aut.srg.micobs.svm.lang.tmtemplate.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import es.uah.aut.srg.micobs.svm.lang.tmtemplate.services.TMTEMPLATEGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalTMTEMPLATEParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_UINT_STRING", "RULE_HEX_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'<TMTemplate'", "'name='", "'tm='", "'>'", "'<Fields>'", "'</Fields>'", "'</TMTemplate>'", "'/>'", "'<Field'", "'fieldRef='", "'</Field>'", "'<FieldValueRaw'", "'value='", "'<FieldValueFile'", "'filename='", "'<FieldValueEnum'", "'enumRef='", "'valueRef='"
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


        public InternalTMTEMPLATEParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalTMTEMPLATEParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalTMTEMPLATEParser.tokenNames; }
    public String getGrammarFileName() { return "InternalTMTEMPLATE.g"; }



    /*
      This grammar contains a lot of empty actions to work around a bug in ANTLR.
      Otherwise the ANTLR tool will create synpreds that cannot be compiled in some rare cases.
    */

     	private TMTEMPLATEGrammarAccess grammarAccess;

        public InternalTMTEMPLATEParser(TokenStream input, TMTEMPLATEGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "VTMTemplate";
       	}

       	@Override
       	protected TMTEMPLATEGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleVTMTemplate"
    // InternalTMTEMPLATE.g:70:1: entryRuleVTMTemplate returns [EObject current=null] : iv_ruleVTMTemplate= ruleVTMTemplate EOF ;
    public final EObject entryRuleVTMTemplate() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVTMTemplate = null;


        try {
            // InternalTMTEMPLATE.g:70:52: (iv_ruleVTMTemplate= ruleVTMTemplate EOF )
            // InternalTMTEMPLATE.g:71:2: iv_ruleVTMTemplate= ruleVTMTemplate EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getVTMTemplateRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleVTMTemplate=ruleVTMTemplate();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleVTMTemplate; 
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
    // $ANTLR end "entryRuleVTMTemplate"


    // $ANTLR start "ruleVTMTemplate"
    // InternalTMTEMPLATE.g:77:1: ruleVTMTemplate returns [EObject current=null] : (otherlv_0= '<TMTemplate' otherlv_1= 'name=' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= 'tm=' ( (otherlv_4= RULE_STRING ) ) ( (otherlv_5= '>' (otherlv_6= '<Fields>' ( (lv_fields_7_0= ruleVTMTemplateField ) )+ otherlv_8= '</Fields>' )? otherlv_9= '</TMTemplate>' ) | otherlv_10= '/>' ) ) ;
    public final EObject ruleVTMTemplate() throws RecognitionException {
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
            // InternalTMTEMPLATE.g:83:2: ( (otherlv_0= '<TMTemplate' otherlv_1= 'name=' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= 'tm=' ( (otherlv_4= RULE_STRING ) ) ( (otherlv_5= '>' (otherlv_6= '<Fields>' ( (lv_fields_7_0= ruleVTMTemplateField ) )+ otherlv_8= '</Fields>' )? otherlv_9= '</TMTemplate>' ) | otherlv_10= '/>' ) ) )
            // InternalTMTEMPLATE.g:84:2: (otherlv_0= '<TMTemplate' otherlv_1= 'name=' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= 'tm=' ( (otherlv_4= RULE_STRING ) ) ( (otherlv_5= '>' (otherlv_6= '<Fields>' ( (lv_fields_7_0= ruleVTMTemplateField ) )+ otherlv_8= '</Fields>' )? otherlv_9= '</TMTemplate>' ) | otherlv_10= '/>' ) )
            {
            // InternalTMTEMPLATE.g:84:2: (otherlv_0= '<TMTemplate' otherlv_1= 'name=' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= 'tm=' ( (otherlv_4= RULE_STRING ) ) ( (otherlv_5= '>' (otherlv_6= '<Fields>' ( (lv_fields_7_0= ruleVTMTemplateField ) )+ otherlv_8= '</Fields>' )? otherlv_9= '</TMTemplate>' ) | otherlv_10= '/>' ) )
            // InternalTMTEMPLATE.g:85:3: otherlv_0= '<TMTemplate' otherlv_1= 'name=' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= 'tm=' ( (otherlv_4= RULE_STRING ) ) ( (otherlv_5= '>' (otherlv_6= '<Fields>' ( (lv_fields_7_0= ruleVTMTemplateField ) )+ otherlv_8= '</Fields>' )? otherlv_9= '</TMTemplate>' ) | otherlv_10= '/>' )
            {
            otherlv_0=(Token)match(input,13,FollowSets000.FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getVTMTemplateAccess().getTMTemplateKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,14,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getVTMTemplateAccess().getNameKeyword_1());
              		
            }
            // InternalTMTEMPLATE.g:93:3: ( (lv_name_2_0= RULE_STRING ) )
            // InternalTMTEMPLATE.g:94:4: (lv_name_2_0= RULE_STRING )
            {
            // InternalTMTEMPLATE.g:94:4: (lv_name_2_0= RULE_STRING )
            // InternalTMTEMPLATE.g:95:5: lv_name_2_0= RULE_STRING
            {
            lv_name_2_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_2_0, grammarAccess.getVTMTemplateAccess().getNameSTRINGTerminalRuleCall_2_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getVTMTemplateRule());
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

              			newLeafNode(otherlv_3, grammarAccess.getVTMTemplateAccess().getTmKeyword_3());
              		
            }
            // InternalTMTEMPLATE.g:115:3: ( (otherlv_4= RULE_STRING ) )
            // InternalTMTEMPLATE.g:116:4: (otherlv_4= RULE_STRING )
            {
            // InternalTMTEMPLATE.g:116:4: (otherlv_4= RULE_STRING )
            // InternalTMTEMPLATE.g:117:5: otherlv_4= RULE_STRING
            {
            if ( state.backtracking==0 ) {

              					/* */
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getVTMTemplateRule());
              					}
              				
            }
            otherlv_4=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(otherlv_4, grammarAccess.getVTMTemplateAccess().getTmTMTCIFTMCrossReference_4_0());
              				
            }

            }


            }

            // InternalTMTEMPLATE.g:131:3: ( (otherlv_5= '>' (otherlv_6= '<Fields>' ( (lv_fields_7_0= ruleVTMTemplateField ) )+ otherlv_8= '</Fields>' )? otherlv_9= '</TMTemplate>' ) | otherlv_10= '/>' )
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
                    // InternalTMTEMPLATE.g:132:4: (otherlv_5= '>' (otherlv_6= '<Fields>' ( (lv_fields_7_0= ruleVTMTemplateField ) )+ otherlv_8= '</Fields>' )? otherlv_9= '</TMTemplate>' )
                    {
                    // InternalTMTEMPLATE.g:132:4: (otherlv_5= '>' (otherlv_6= '<Fields>' ( (lv_fields_7_0= ruleVTMTemplateField ) )+ otherlv_8= '</Fields>' )? otherlv_9= '</TMTemplate>' )
                    // InternalTMTEMPLATE.g:133:5: otherlv_5= '>' (otherlv_6= '<Fields>' ( (lv_fields_7_0= ruleVTMTemplateField ) )+ otherlv_8= '</Fields>' )? otherlv_9= '</TMTemplate>'
                    {
                    otherlv_5=(Token)match(input,16,FollowSets000.FOLLOW_7); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_5, grammarAccess.getVTMTemplateAccess().getGreaterThanSignKeyword_5_0_0());
                      				
                    }
                    // InternalTMTEMPLATE.g:137:5: (otherlv_6= '<Fields>' ( (lv_fields_7_0= ruleVTMTemplateField ) )+ otherlv_8= '</Fields>' )?
                    int alt2=2;
                    int LA2_0 = input.LA(1);

                    if ( (LA2_0==17) ) {
                        alt2=1;
                    }
                    switch (alt2) {
                        case 1 :
                            // InternalTMTEMPLATE.g:138:6: otherlv_6= '<Fields>' ( (lv_fields_7_0= ruleVTMTemplateField ) )+ otherlv_8= '</Fields>'
                            {
                            otherlv_6=(Token)match(input,17,FollowSets000.FOLLOW_8); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              						newLeafNode(otherlv_6, grammarAccess.getVTMTemplateAccess().getFieldsKeyword_5_0_1_0());
                              					
                            }
                            // InternalTMTEMPLATE.g:142:6: ( (lv_fields_7_0= ruleVTMTemplateField ) )+
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
                            	    // InternalTMTEMPLATE.g:143:7: (lv_fields_7_0= ruleVTMTemplateField )
                            	    {
                            	    // InternalTMTEMPLATE.g:143:7: (lv_fields_7_0= ruleVTMTemplateField )
                            	    // InternalTMTEMPLATE.g:144:8: lv_fields_7_0= ruleVTMTemplateField
                            	    {
                            	    if ( state.backtracking==0 ) {

                            	      								newCompositeNode(grammarAccess.getVTMTemplateAccess().getFieldsVTMTemplateFieldParserRuleCall_5_0_1_1_0());
                            	      							
                            	    }
                            	    pushFollow(FollowSets000.FOLLOW_9);
                            	    lv_fields_7_0=ruleVTMTemplateField();

                            	    state._fsp--;
                            	    if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	      								if (current==null) {
                            	      									current = createModelElementForParent(grammarAccess.getVTMTemplateRule());
                            	      								}
                            	      								add(
                            	      									current,
                            	      									"fields",
                            	      									lv_fields_7_0,
                            	      									"es.uah.aut.srg.micobs.svm.lang.tmtemplate.TMTEMPLATE.VTMTemplateField");
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

                              						newLeafNode(otherlv_8, grammarAccess.getVTMTemplateAccess().getFieldsKeyword_5_0_1_2());
                              					
                            }

                            }
                            break;

                    }

                    otherlv_9=(Token)match(input,19,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_9, grammarAccess.getVTMTemplateAccess().getTMTemplateKeyword_5_0_2());
                      				
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalTMTEMPLATE.g:172:4: otherlv_10= '/>'
                    {
                    otherlv_10=(Token)match(input,20,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_10, grammarAccess.getVTMTemplateAccess().getSolidusGreaterThanSignKeyword_5_1());
                      			
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
    // $ANTLR end "ruleVTMTemplate"


    // $ANTLR start "entryRuleVTMTemplateField"
    // InternalTMTEMPLATE.g:181:1: entryRuleVTMTemplateField returns [EObject current=null] : iv_ruleVTMTemplateField= ruleVTMTemplateField EOF ;
    public final EObject entryRuleVTMTemplateField() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVTMTemplateField = null;


        try {
            // InternalTMTEMPLATE.g:181:57: (iv_ruleVTMTemplateField= ruleVTMTemplateField EOF )
            // InternalTMTEMPLATE.g:182:2: iv_ruleVTMTemplateField= ruleVTMTemplateField EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getVTMTemplateFieldRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleVTMTemplateField=ruleVTMTemplateField();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleVTMTemplateField; 
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
    // $ANTLR end "entryRuleVTMTemplateField"


    // $ANTLR start "ruleVTMTemplateField"
    // InternalTMTEMPLATE.g:188:1: ruleVTMTemplateField returns [EObject current=null] : (otherlv_0= '<Field' otherlv_1= 'fieldRef=' ( (otherlv_2= RULE_STRING ) ) otherlv_3= '>' ( (lv_value_4_0= ruleTMTCIFFieldValue ) ) otherlv_5= '</Field>' ) ;
    public final EObject ruleVTMTemplateField() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_value_4_0 = null;



        	enterRule();

        try {
            // InternalTMTEMPLATE.g:194:2: ( (otherlv_0= '<Field' otherlv_1= 'fieldRef=' ( (otherlv_2= RULE_STRING ) ) otherlv_3= '>' ( (lv_value_4_0= ruleTMTCIFFieldValue ) ) otherlv_5= '</Field>' ) )
            // InternalTMTEMPLATE.g:195:2: (otherlv_0= '<Field' otherlv_1= 'fieldRef=' ( (otherlv_2= RULE_STRING ) ) otherlv_3= '>' ( (lv_value_4_0= ruleTMTCIFFieldValue ) ) otherlv_5= '</Field>' )
            {
            // InternalTMTEMPLATE.g:195:2: (otherlv_0= '<Field' otherlv_1= 'fieldRef=' ( (otherlv_2= RULE_STRING ) ) otherlv_3= '>' ( (lv_value_4_0= ruleTMTCIFFieldValue ) ) otherlv_5= '</Field>' )
            // InternalTMTEMPLATE.g:196:3: otherlv_0= '<Field' otherlv_1= 'fieldRef=' ( (otherlv_2= RULE_STRING ) ) otherlv_3= '>' ( (lv_value_4_0= ruleTMTCIFFieldValue ) ) otherlv_5= '</Field>'
            {
            otherlv_0=(Token)match(input,21,FollowSets000.FOLLOW_11); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getVTMTemplateFieldAccess().getFieldKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,22,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getVTMTemplateFieldAccess().getFieldRefKeyword_1());
              		
            }
            // InternalTMTEMPLATE.g:204:3: ( (otherlv_2= RULE_STRING ) )
            // InternalTMTEMPLATE.g:205:4: (otherlv_2= RULE_STRING )
            {
            // InternalTMTEMPLATE.g:205:4: (otherlv_2= RULE_STRING )
            // InternalTMTEMPLATE.g:206:5: otherlv_2= RULE_STRING
            {
            if ( state.backtracking==0 ) {

              					/* */
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getVTMTemplateFieldRule());
              					}
              				
            }
            otherlv_2=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_12); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(otherlv_2, grammarAccess.getVTMTemplateFieldAccess().getFieldRefTMTCIFTMFieldCrossReference_2_0());
              				
            }

            }


            }

            otherlv_3=(Token)match(input,16,FollowSets000.FOLLOW_13); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getVTMTemplateFieldAccess().getGreaterThanSignKeyword_3());
              		
            }
            // InternalTMTEMPLATE.g:224:3: ( (lv_value_4_0= ruleTMTCIFFieldValue ) )
            // InternalTMTEMPLATE.g:225:4: (lv_value_4_0= ruleTMTCIFFieldValue )
            {
            // InternalTMTEMPLATE.g:225:4: (lv_value_4_0= ruleTMTCIFFieldValue )
            // InternalTMTEMPLATE.g:226:5: lv_value_4_0= ruleTMTCIFFieldValue
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getVTMTemplateFieldAccess().getValueTMTCIFFieldValueParserRuleCall_4_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_14);
            lv_value_4_0=ruleTMTCIFFieldValue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getVTMTemplateFieldRule());
              					}
              					set(
              						current,
              						"value",
              						lv_value_4_0,
              						"es.uah.aut.srg.micobs.svm.lang.tmtemplate.TMTEMPLATE.TMTCIFFieldValue");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_5=(Token)match(input,23,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getVTMTemplateFieldAccess().getFieldKeyword_5());
              		
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
    // $ANTLR end "ruleVTMTemplateField"


    // $ANTLR start "entryRuleTMTCIFFieldValue"
    // InternalTMTEMPLATE.g:251:1: entryRuleTMTCIFFieldValue returns [EObject current=null] : iv_ruleTMTCIFFieldValue= ruleTMTCIFFieldValue EOF ;
    public final EObject entryRuleTMTCIFFieldValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTMTCIFFieldValue = null;


        try {
            // InternalTMTEMPLATE.g:251:57: (iv_ruleTMTCIFFieldValue= ruleTMTCIFFieldValue EOF )
            // InternalTMTEMPLATE.g:252:2: iv_ruleTMTCIFFieldValue= ruleTMTCIFFieldValue EOF
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
    // InternalTMTEMPLATE.g:258:1: ruleTMTCIFFieldValue returns [EObject current=null] : (this_TMTCIFFieldValueRaw_0= ruleTMTCIFFieldValueRaw | this_TMTCIFFieldValueFile_1= ruleTMTCIFFieldValueFile | this_TMTCIFFieldValueEnum_2= ruleTMTCIFFieldValueEnum ) ;
    public final EObject ruleTMTCIFFieldValue() throws RecognitionException {
        EObject current = null;

        EObject this_TMTCIFFieldValueRaw_0 = null;

        EObject this_TMTCIFFieldValueFile_1 = null;

        EObject this_TMTCIFFieldValueEnum_2 = null;



        	enterRule();

        try {
            // InternalTMTEMPLATE.g:264:2: ( (this_TMTCIFFieldValueRaw_0= ruleTMTCIFFieldValueRaw | this_TMTCIFFieldValueFile_1= ruleTMTCIFFieldValueFile | this_TMTCIFFieldValueEnum_2= ruleTMTCIFFieldValueEnum ) )
            // InternalTMTEMPLATE.g:265:2: (this_TMTCIFFieldValueRaw_0= ruleTMTCIFFieldValueRaw | this_TMTCIFFieldValueFile_1= ruleTMTCIFFieldValueFile | this_TMTCIFFieldValueEnum_2= ruleTMTCIFFieldValueEnum )
            {
            // InternalTMTEMPLATE.g:265:2: (this_TMTCIFFieldValueRaw_0= ruleTMTCIFFieldValueRaw | this_TMTCIFFieldValueFile_1= ruleTMTCIFFieldValueFile | this_TMTCIFFieldValueEnum_2= ruleTMTCIFFieldValueEnum )
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
                    // InternalTMTEMPLATE.g:266:3: this_TMTCIFFieldValueRaw_0= ruleTMTCIFFieldValueRaw
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
                    // InternalTMTEMPLATE.g:278:3: this_TMTCIFFieldValueFile_1= ruleTMTCIFFieldValueFile
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
                    // InternalTMTEMPLATE.g:290:3: this_TMTCIFFieldValueEnum_2= ruleTMTCIFFieldValueEnum
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
    // InternalTMTEMPLATE.g:305:1: entryRuleTMTCIFFieldValueRaw returns [EObject current=null] : iv_ruleTMTCIFFieldValueRaw= ruleTMTCIFFieldValueRaw EOF ;
    public final EObject entryRuleTMTCIFFieldValueRaw() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTMTCIFFieldValueRaw = null;


        try {
            // InternalTMTEMPLATE.g:305:60: (iv_ruleTMTCIFFieldValueRaw= ruleTMTCIFFieldValueRaw EOF )
            // InternalTMTEMPLATE.g:306:2: iv_ruleTMTCIFFieldValueRaw= ruleTMTCIFFieldValueRaw EOF
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
    // InternalTMTEMPLATE.g:312:1: ruleTMTCIFFieldValueRaw returns [EObject current=null] : (otherlv_0= '<FieldValueRaw' otherlv_1= 'value=' ( ( (lv_value_2_1= RULE_UINT_STRING | lv_value_2_2= RULE_HEX_STRING ) ) ) otherlv_3= '/>' ) ;
    public final EObject ruleTMTCIFFieldValueRaw() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_value_2_1=null;
        Token lv_value_2_2=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalTMTEMPLATE.g:318:2: ( (otherlv_0= '<FieldValueRaw' otherlv_1= 'value=' ( ( (lv_value_2_1= RULE_UINT_STRING | lv_value_2_2= RULE_HEX_STRING ) ) ) otherlv_3= '/>' ) )
            // InternalTMTEMPLATE.g:319:2: (otherlv_0= '<FieldValueRaw' otherlv_1= 'value=' ( ( (lv_value_2_1= RULE_UINT_STRING | lv_value_2_2= RULE_HEX_STRING ) ) ) otherlv_3= '/>' )
            {
            // InternalTMTEMPLATE.g:319:2: (otherlv_0= '<FieldValueRaw' otherlv_1= 'value=' ( ( (lv_value_2_1= RULE_UINT_STRING | lv_value_2_2= RULE_HEX_STRING ) ) ) otherlv_3= '/>' )
            // InternalTMTEMPLATE.g:320:3: otherlv_0= '<FieldValueRaw' otherlv_1= 'value=' ( ( (lv_value_2_1= RULE_UINT_STRING | lv_value_2_2= RULE_HEX_STRING ) ) ) otherlv_3= '/>'
            {
            otherlv_0=(Token)match(input,24,FollowSets000.FOLLOW_15); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getTMTCIFFieldValueRawAccess().getFieldValueRawKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,25,FollowSets000.FOLLOW_16); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getTMTCIFFieldValueRawAccess().getValueKeyword_1());
              		
            }
            // InternalTMTEMPLATE.g:328:3: ( ( (lv_value_2_1= RULE_UINT_STRING | lv_value_2_2= RULE_HEX_STRING ) ) )
            // InternalTMTEMPLATE.g:329:4: ( (lv_value_2_1= RULE_UINT_STRING | lv_value_2_2= RULE_HEX_STRING ) )
            {
            // InternalTMTEMPLATE.g:329:4: ( (lv_value_2_1= RULE_UINT_STRING | lv_value_2_2= RULE_HEX_STRING ) )
            // InternalTMTEMPLATE.g:330:5: (lv_value_2_1= RULE_UINT_STRING | lv_value_2_2= RULE_HEX_STRING )
            {
            // InternalTMTEMPLATE.g:330:5: (lv_value_2_1= RULE_UINT_STRING | lv_value_2_2= RULE_HEX_STRING )
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
                    // InternalTMTEMPLATE.g:331:6: lv_value_2_1= RULE_UINT_STRING
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
                      							"es.uah.aut.srg.micobs.svm.lang.tmtemplate.TMTEMPLATE.UINT_STRING");
                      					
                    }

                    }
                    break;
                case 2 :
                    // InternalTMTEMPLATE.g:346:6: lv_value_2_2= RULE_HEX_STRING
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
                      							"es.uah.aut.srg.micobs.svm.lang.tmtemplate.TMTEMPLATE.HEX_STRING");
                      					
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
    // InternalTMTEMPLATE.g:371:1: entryRuleTMTCIFFieldValueFile returns [EObject current=null] : iv_ruleTMTCIFFieldValueFile= ruleTMTCIFFieldValueFile EOF ;
    public final EObject entryRuleTMTCIFFieldValueFile() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTMTCIFFieldValueFile = null;


        try {
            // InternalTMTEMPLATE.g:371:61: (iv_ruleTMTCIFFieldValueFile= ruleTMTCIFFieldValueFile EOF )
            // InternalTMTEMPLATE.g:372:2: iv_ruleTMTCIFFieldValueFile= ruleTMTCIFFieldValueFile EOF
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
    // InternalTMTEMPLATE.g:378:1: ruleTMTCIFFieldValueFile returns [EObject current=null] : (otherlv_0= '<FieldValueFile' otherlv_1= 'filename=' ( (lv_filename_2_0= RULE_STRING ) ) otherlv_3= '/>' ) ;
    public final EObject ruleTMTCIFFieldValueFile() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_filename_2_0=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalTMTEMPLATE.g:384:2: ( (otherlv_0= '<FieldValueFile' otherlv_1= 'filename=' ( (lv_filename_2_0= RULE_STRING ) ) otherlv_3= '/>' ) )
            // InternalTMTEMPLATE.g:385:2: (otherlv_0= '<FieldValueFile' otherlv_1= 'filename=' ( (lv_filename_2_0= RULE_STRING ) ) otherlv_3= '/>' )
            {
            // InternalTMTEMPLATE.g:385:2: (otherlv_0= '<FieldValueFile' otherlv_1= 'filename=' ( (lv_filename_2_0= RULE_STRING ) ) otherlv_3= '/>' )
            // InternalTMTEMPLATE.g:386:3: otherlv_0= '<FieldValueFile' otherlv_1= 'filename=' ( (lv_filename_2_0= RULE_STRING ) ) otherlv_3= '/>'
            {
            otherlv_0=(Token)match(input,26,FollowSets000.FOLLOW_18); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getTMTCIFFieldValueFileAccess().getFieldValueFileKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,27,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getTMTCIFFieldValueFileAccess().getFilenameKeyword_1());
              		
            }
            // InternalTMTEMPLATE.g:394:3: ( (lv_filename_2_0= RULE_STRING ) )
            // InternalTMTEMPLATE.g:395:4: (lv_filename_2_0= RULE_STRING )
            {
            // InternalTMTEMPLATE.g:395:4: (lv_filename_2_0= RULE_STRING )
            // InternalTMTEMPLATE.g:396:5: lv_filename_2_0= RULE_STRING
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
    // InternalTMTEMPLATE.g:420:1: entryRuleTMTCIFFieldValueEnum returns [EObject current=null] : iv_ruleTMTCIFFieldValueEnum= ruleTMTCIFFieldValueEnum EOF ;
    public final EObject entryRuleTMTCIFFieldValueEnum() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTMTCIFFieldValueEnum = null;


        try {
            // InternalTMTEMPLATE.g:420:61: (iv_ruleTMTCIFFieldValueEnum= ruleTMTCIFFieldValueEnum EOF )
            // InternalTMTEMPLATE.g:421:2: iv_ruleTMTCIFFieldValueEnum= ruleTMTCIFFieldValueEnum EOF
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
    // InternalTMTEMPLATE.g:427:1: ruleTMTCIFFieldValueEnum returns [EObject current=null] : (otherlv_0= '<FieldValueEnum' otherlv_1= 'enumRef=' ( (otherlv_2= RULE_STRING ) ) otherlv_3= 'valueRef=' ( (otherlv_4= RULE_STRING ) ) otherlv_5= '/>' ) ;
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
            // InternalTMTEMPLATE.g:433:2: ( (otherlv_0= '<FieldValueEnum' otherlv_1= 'enumRef=' ( (otherlv_2= RULE_STRING ) ) otherlv_3= 'valueRef=' ( (otherlv_4= RULE_STRING ) ) otherlv_5= '/>' ) )
            // InternalTMTEMPLATE.g:434:2: (otherlv_0= '<FieldValueEnum' otherlv_1= 'enumRef=' ( (otherlv_2= RULE_STRING ) ) otherlv_3= 'valueRef=' ( (otherlv_4= RULE_STRING ) ) otherlv_5= '/>' )
            {
            // InternalTMTEMPLATE.g:434:2: (otherlv_0= '<FieldValueEnum' otherlv_1= 'enumRef=' ( (otherlv_2= RULE_STRING ) ) otherlv_3= 'valueRef=' ( (otherlv_4= RULE_STRING ) ) otherlv_5= '/>' )
            // InternalTMTEMPLATE.g:435:3: otherlv_0= '<FieldValueEnum' otherlv_1= 'enumRef=' ( (otherlv_2= RULE_STRING ) ) otherlv_3= 'valueRef=' ( (otherlv_4= RULE_STRING ) ) otherlv_5= '/>'
            {
            otherlv_0=(Token)match(input,28,FollowSets000.FOLLOW_19); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getTMTCIFFieldValueEnumAccess().getFieldValueEnumKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,29,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getTMTCIFFieldValueEnumAccess().getEnumRefKeyword_1());
              		
            }
            // InternalTMTEMPLATE.g:443:3: ( (otherlv_2= RULE_STRING ) )
            // InternalTMTEMPLATE.g:444:4: (otherlv_2= RULE_STRING )
            {
            // InternalTMTEMPLATE.g:444:4: (otherlv_2= RULE_STRING )
            // InternalTMTEMPLATE.g:445:5: otherlv_2= RULE_STRING
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
            // InternalTMTEMPLATE.g:463:3: ( (otherlv_4= RULE_STRING ) )
            // InternalTMTEMPLATE.g:464:4: (otherlv_4= RULE_STRING )
            {
            // InternalTMTEMPLATE.g:464:4: (otherlv_4= RULE_STRING )
            // InternalTMTEMPLATE.g:465:5: otherlv_4= RULE_STRING
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