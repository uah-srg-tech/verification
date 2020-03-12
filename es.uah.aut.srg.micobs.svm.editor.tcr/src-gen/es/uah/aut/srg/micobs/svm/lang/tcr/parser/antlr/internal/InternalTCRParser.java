package es.uah.aut.srg.micobs.svm.lang.tcr.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import es.uah.aut.srg.micobs.svm.lang.tcr.services.TCRGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
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
@SuppressWarnings("all")
public class InternalTCRParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_UINT_STRING", "RULE_RUNTEXT", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'<TestCampaignReport'", "'name='", "'id='", "'issue='", "'revision='", "'date='", "'>'", "'</TestCampaignReport>'", "'<VTCRTestReport'", "'test_procedure='", "'status='", "'</VTCRTestReport>'", "'<evidence>'", "'</evidence>'", "'<run'", "'bold='", "'italics='", "'underline='", "'color='", "'</run>'", "'\"Fail\"'", "'\"Pass\"'", "'\"NotTested\"'", "'\"true\"'", "'\"false\"'"
    };
    public static final int RULE_STRING=4;
    public static final int RULE_UINT_STRING=5;
    public static final int RULE_SL_COMMENT=10;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__37=37;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__13=13;
    public static final int T__35=35;
    public static final int T__14=14;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_ID=7;
    public static final int RULE_WS=11;
    public static final int RULE_ANY_OTHER=12;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=8;
    public static final int T__29=29;
    public static final int RULE_RUNTEXT=6;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=9;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalTCRParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalTCRParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalTCRParser.tokenNames; }
    public String getGrammarFileName() { return "InternalTCR.g"; }



    /*
      This grammar contains a lot of empty actions to work around a bug in ANTLR.
      Otherwise the ANTLR tool will create synpreds that cannot be compiled in some rare cases.
    */

     	private TCRGrammarAccess grammarAccess;

        public InternalTCRParser(TokenStream input, TCRGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "VTCRTestCampaignReport";
       	}

       	@Override
       	protected TCRGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleVTCRTestCampaignReport"
    // InternalTCR.g:78:1: entryRuleVTCRTestCampaignReport returns [EObject current=null] : iv_ruleVTCRTestCampaignReport= ruleVTCRTestCampaignReport EOF ;
    public final EObject entryRuleVTCRTestCampaignReport() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVTCRTestCampaignReport = null;


        try {
            // InternalTCR.g:78:63: (iv_ruleVTCRTestCampaignReport= ruleVTCRTestCampaignReport EOF )
            // InternalTCR.g:79:2: iv_ruleVTCRTestCampaignReport= ruleVTCRTestCampaignReport EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getVTCRTestCampaignReportRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleVTCRTestCampaignReport=ruleVTCRTestCampaignReport();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleVTCRTestCampaignReport; 
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
    // $ANTLR end "entryRuleVTCRTestCampaignReport"


    // $ANTLR start "ruleVTCRTestCampaignReport"
    // InternalTCR.g:85:1: ruleVTCRTestCampaignReport returns [EObject current=null] : (otherlv_0= '<TestCampaignReport' otherlv_1= 'name=' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= 'id=' ( (lv_id_4_0= RULE_STRING ) ) otherlv_5= 'issue=' ( (lv_issue_6_0= RULE_UINT_STRING ) ) otherlv_7= 'revision=' ( (lv_revision_8_0= RULE_UINT_STRING ) ) otherlv_9= 'date=' ( (lv_date_10_0= RULE_STRING ) ) otherlv_11= '>' ( (lv_testReports_12_0= ruleVTCRTestReport ) )+ otherlv_13= '</TestCampaignReport>' ) ;
    public final EObject ruleVTCRTestCampaignReport() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token lv_id_4_0=null;
        Token otherlv_5=null;
        Token lv_issue_6_0=null;
        Token otherlv_7=null;
        Token lv_revision_8_0=null;
        Token otherlv_9=null;
        Token lv_date_10_0=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        EObject lv_testReports_12_0 = null;



        	enterRule();

        try {
            // InternalTCR.g:91:2: ( (otherlv_0= '<TestCampaignReport' otherlv_1= 'name=' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= 'id=' ( (lv_id_4_0= RULE_STRING ) ) otherlv_5= 'issue=' ( (lv_issue_6_0= RULE_UINT_STRING ) ) otherlv_7= 'revision=' ( (lv_revision_8_0= RULE_UINT_STRING ) ) otherlv_9= 'date=' ( (lv_date_10_0= RULE_STRING ) ) otherlv_11= '>' ( (lv_testReports_12_0= ruleVTCRTestReport ) )+ otherlv_13= '</TestCampaignReport>' ) )
            // InternalTCR.g:92:2: (otherlv_0= '<TestCampaignReport' otherlv_1= 'name=' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= 'id=' ( (lv_id_4_0= RULE_STRING ) ) otherlv_5= 'issue=' ( (lv_issue_6_0= RULE_UINT_STRING ) ) otherlv_7= 'revision=' ( (lv_revision_8_0= RULE_UINT_STRING ) ) otherlv_9= 'date=' ( (lv_date_10_0= RULE_STRING ) ) otherlv_11= '>' ( (lv_testReports_12_0= ruleVTCRTestReport ) )+ otherlv_13= '</TestCampaignReport>' )
            {
            // InternalTCR.g:92:2: (otherlv_0= '<TestCampaignReport' otherlv_1= 'name=' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= 'id=' ( (lv_id_4_0= RULE_STRING ) ) otherlv_5= 'issue=' ( (lv_issue_6_0= RULE_UINT_STRING ) ) otherlv_7= 'revision=' ( (lv_revision_8_0= RULE_UINT_STRING ) ) otherlv_9= 'date=' ( (lv_date_10_0= RULE_STRING ) ) otherlv_11= '>' ( (lv_testReports_12_0= ruleVTCRTestReport ) )+ otherlv_13= '</TestCampaignReport>' )
            // InternalTCR.g:93:3: otherlv_0= '<TestCampaignReport' otherlv_1= 'name=' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= 'id=' ( (lv_id_4_0= RULE_STRING ) ) otherlv_5= 'issue=' ( (lv_issue_6_0= RULE_UINT_STRING ) ) otherlv_7= 'revision=' ( (lv_revision_8_0= RULE_UINT_STRING ) ) otherlv_9= 'date=' ( (lv_date_10_0= RULE_STRING ) ) otherlv_11= '>' ( (lv_testReports_12_0= ruleVTCRTestReport ) )+ otherlv_13= '</TestCampaignReport>'
            {
            otherlv_0=(Token)match(input,13,FollowSets000.FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getVTCRTestCampaignReportAccess().getTestCampaignReportKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,14,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getVTCRTestCampaignReportAccess().getNameKeyword_1());
              		
            }
            // InternalTCR.g:101:3: ( (lv_name_2_0= RULE_STRING ) )
            // InternalTCR.g:102:4: (lv_name_2_0= RULE_STRING )
            {
            // InternalTCR.g:102:4: (lv_name_2_0= RULE_STRING )
            // InternalTCR.g:103:5: lv_name_2_0= RULE_STRING
            {
            lv_name_2_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_2_0, grammarAccess.getVTCRTestCampaignReportAccess().getNameSTRINGTerminalRuleCall_2_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getVTCRTestCampaignReportRule());
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

              			newLeafNode(otherlv_3, grammarAccess.getVTCRTestCampaignReportAccess().getIdKeyword_3());
              		
            }
            // InternalTCR.g:123:3: ( (lv_id_4_0= RULE_STRING ) )
            // InternalTCR.g:124:4: (lv_id_4_0= RULE_STRING )
            {
            // InternalTCR.g:124:4: (lv_id_4_0= RULE_STRING )
            // InternalTCR.g:125:5: lv_id_4_0= RULE_STRING
            {
            lv_id_4_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_id_4_0, grammarAccess.getVTCRTestCampaignReportAccess().getIdSTRINGTerminalRuleCall_4_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getVTCRTestCampaignReportRule());
              					}
              					setWithLastConsumed(
              						current,
              						"id",
              						lv_id_4_0,
              						"org.eclipse.xtext.common.Terminals.STRING");
              				
            }

            }


            }

            otherlv_5=(Token)match(input,16,FollowSets000.FOLLOW_7); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getVTCRTestCampaignReportAccess().getIssueKeyword_5());
              		
            }
            // InternalTCR.g:145:3: ( (lv_issue_6_0= RULE_UINT_STRING ) )
            // InternalTCR.g:146:4: (lv_issue_6_0= RULE_UINT_STRING )
            {
            // InternalTCR.g:146:4: (lv_issue_6_0= RULE_UINT_STRING )
            // InternalTCR.g:147:5: lv_issue_6_0= RULE_UINT_STRING
            {
            lv_issue_6_0=(Token)match(input,RULE_UINT_STRING,FollowSets000.FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_issue_6_0, grammarAccess.getVTCRTestCampaignReportAccess().getIssueUINT_STRINGTerminalRuleCall_6_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getVTCRTestCampaignReportRule());
              					}
              					setWithLastConsumed(
              						current,
              						"issue",
              						lv_issue_6_0,
              						"es.uah.aut.srg.micobs.svm.lang.tcr.TCR.UINT_STRING");
              				
            }

            }


            }

            otherlv_7=(Token)match(input,17,FollowSets000.FOLLOW_7); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_7, grammarAccess.getVTCRTestCampaignReportAccess().getRevisionKeyword_7());
              		
            }
            // InternalTCR.g:167:3: ( (lv_revision_8_0= RULE_UINT_STRING ) )
            // InternalTCR.g:168:4: (lv_revision_8_0= RULE_UINT_STRING )
            {
            // InternalTCR.g:168:4: (lv_revision_8_0= RULE_UINT_STRING )
            // InternalTCR.g:169:5: lv_revision_8_0= RULE_UINT_STRING
            {
            lv_revision_8_0=(Token)match(input,RULE_UINT_STRING,FollowSets000.FOLLOW_9); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_revision_8_0, grammarAccess.getVTCRTestCampaignReportAccess().getRevisionUINT_STRINGTerminalRuleCall_8_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getVTCRTestCampaignReportRule());
              					}
              					setWithLastConsumed(
              						current,
              						"revision",
              						lv_revision_8_0,
              						"es.uah.aut.srg.micobs.svm.lang.tcr.TCR.UINT_STRING");
              				
            }

            }


            }

            otherlv_9=(Token)match(input,18,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_9, grammarAccess.getVTCRTestCampaignReportAccess().getDateKeyword_9());
              		
            }
            // InternalTCR.g:189:3: ( (lv_date_10_0= RULE_STRING ) )
            // InternalTCR.g:190:4: (lv_date_10_0= RULE_STRING )
            {
            // InternalTCR.g:190:4: (lv_date_10_0= RULE_STRING )
            // InternalTCR.g:191:5: lv_date_10_0= RULE_STRING
            {
            lv_date_10_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_10); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_date_10_0, grammarAccess.getVTCRTestCampaignReportAccess().getDateSTRINGTerminalRuleCall_10_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getVTCRTestCampaignReportRule());
              					}
              					setWithLastConsumed(
              						current,
              						"date",
              						lv_date_10_0,
              						"org.eclipse.xtext.common.Terminals.STRING");
              				
            }

            }


            }

            otherlv_11=(Token)match(input,19,FollowSets000.FOLLOW_11); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_11, grammarAccess.getVTCRTestCampaignReportAccess().getGreaterThanSignKeyword_11());
              		
            }
            // InternalTCR.g:211:3: ( (lv_testReports_12_0= ruleVTCRTestReport ) )+
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
            	    // InternalTCR.g:212:4: (lv_testReports_12_0= ruleVTCRTestReport )
            	    {
            	    // InternalTCR.g:212:4: (lv_testReports_12_0= ruleVTCRTestReport )
            	    // InternalTCR.g:213:5: lv_testReports_12_0= ruleVTCRTestReport
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getVTCRTestCampaignReportAccess().getTestReportsVTCRTestReportParserRuleCall_12_0());
            	      				
            	    }
            	    pushFollow(FollowSets000.FOLLOW_12);
            	    lv_testReports_12_0=ruleVTCRTestReport();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getVTCRTestCampaignReportRule());
            	      					}
            	      					add(
            	      						current,
            	      						"testReports",
            	      						lv_testReports_12_0,
            	      						"es.uah.aut.srg.micobs.svm.lang.tcr.TCR.VTCRTestReport");
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

            otherlv_13=(Token)match(input,20,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_13, grammarAccess.getVTCRTestCampaignReportAccess().getTestCampaignReportKeyword_13());
              		
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
    // $ANTLR end "ruleVTCRTestCampaignReport"


    // $ANTLR start "entryRuleVTCRTestReport"
    // InternalTCR.g:238:1: entryRuleVTCRTestReport returns [EObject current=null] : iv_ruleVTCRTestReport= ruleVTCRTestReport EOF ;
    public final EObject entryRuleVTCRTestReport() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVTCRTestReport = null;


        try {
            // InternalTCR.g:238:55: (iv_ruleVTCRTestReport= ruleVTCRTestReport EOF )
            // InternalTCR.g:239:2: iv_ruleVTCRTestReport= ruleVTCRTestReport EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getVTCRTestReportRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleVTCRTestReport=ruleVTCRTestReport();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleVTCRTestReport; 
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
    // $ANTLR end "entryRuleVTCRTestReport"


    // $ANTLR start "ruleVTCRTestReport"
    // InternalTCR.g:245:1: ruleVTCRTestReport returns [EObject current=null] : (otherlv_0= '<VTCRTestReport' otherlv_1= 'test_procedure=' ( (lv_test_procedure_2_0= RULE_STRING ) ) otherlv_3= 'status=' ( (lv_status_4_0= ruleVTCRTestStatus ) ) otherlv_5= '>' ( (lv_evidence_6_0= ruleDParagraphEvidence ) ) otherlv_7= '</VTCRTestReport>' ) ;
    public final EObject ruleVTCRTestReport() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_test_procedure_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Enumerator lv_status_4_0 = null;

        EObject lv_evidence_6_0 = null;



        	enterRule();

        try {
            // InternalTCR.g:251:2: ( (otherlv_0= '<VTCRTestReport' otherlv_1= 'test_procedure=' ( (lv_test_procedure_2_0= RULE_STRING ) ) otherlv_3= 'status=' ( (lv_status_4_0= ruleVTCRTestStatus ) ) otherlv_5= '>' ( (lv_evidence_6_0= ruleDParagraphEvidence ) ) otherlv_7= '</VTCRTestReport>' ) )
            // InternalTCR.g:252:2: (otherlv_0= '<VTCRTestReport' otherlv_1= 'test_procedure=' ( (lv_test_procedure_2_0= RULE_STRING ) ) otherlv_3= 'status=' ( (lv_status_4_0= ruleVTCRTestStatus ) ) otherlv_5= '>' ( (lv_evidence_6_0= ruleDParagraphEvidence ) ) otherlv_7= '</VTCRTestReport>' )
            {
            // InternalTCR.g:252:2: (otherlv_0= '<VTCRTestReport' otherlv_1= 'test_procedure=' ( (lv_test_procedure_2_0= RULE_STRING ) ) otherlv_3= 'status=' ( (lv_status_4_0= ruleVTCRTestStatus ) ) otherlv_5= '>' ( (lv_evidence_6_0= ruleDParagraphEvidence ) ) otherlv_7= '</VTCRTestReport>' )
            // InternalTCR.g:253:3: otherlv_0= '<VTCRTestReport' otherlv_1= 'test_procedure=' ( (lv_test_procedure_2_0= RULE_STRING ) ) otherlv_3= 'status=' ( (lv_status_4_0= ruleVTCRTestStatus ) ) otherlv_5= '>' ( (lv_evidence_6_0= ruleDParagraphEvidence ) ) otherlv_7= '</VTCRTestReport>'
            {
            otherlv_0=(Token)match(input,21,FollowSets000.FOLLOW_13); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getVTCRTestReportAccess().getVTCRTestReportKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,22,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getVTCRTestReportAccess().getTest_procedureKeyword_1());
              		
            }
            // InternalTCR.g:261:3: ( (lv_test_procedure_2_0= RULE_STRING ) )
            // InternalTCR.g:262:4: (lv_test_procedure_2_0= RULE_STRING )
            {
            // InternalTCR.g:262:4: (lv_test_procedure_2_0= RULE_STRING )
            // InternalTCR.g:263:5: lv_test_procedure_2_0= RULE_STRING
            {
            lv_test_procedure_2_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_14); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_test_procedure_2_0, grammarAccess.getVTCRTestReportAccess().getTest_procedureSTRINGTerminalRuleCall_2_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getVTCRTestReportRule());
              					}
              					setWithLastConsumed(
              						current,
              						"test_procedure",
              						lv_test_procedure_2_0,
              						"org.eclipse.xtext.common.Terminals.STRING");
              				
            }

            }


            }

            otherlv_3=(Token)match(input,23,FollowSets000.FOLLOW_15); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getVTCRTestReportAccess().getStatusKeyword_3());
              		
            }
            // InternalTCR.g:283:3: ( (lv_status_4_0= ruleVTCRTestStatus ) )
            // InternalTCR.g:284:4: (lv_status_4_0= ruleVTCRTestStatus )
            {
            // InternalTCR.g:284:4: (lv_status_4_0= ruleVTCRTestStatus )
            // InternalTCR.g:285:5: lv_status_4_0= ruleVTCRTestStatus
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getVTCRTestReportAccess().getStatusVTCRTestStatusEnumRuleCall_4_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_10);
            lv_status_4_0=ruleVTCRTestStatus();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getVTCRTestReportRule());
              					}
              					set(
              						current,
              						"status",
              						lv_status_4_0,
              						"es.uah.aut.srg.micobs.svm.lang.tcr.TCR.VTCRTestStatus");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_5=(Token)match(input,19,FollowSets000.FOLLOW_16); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getVTCRTestReportAccess().getGreaterThanSignKeyword_5());
              		
            }
            // InternalTCR.g:306:3: ( (lv_evidence_6_0= ruleDParagraphEvidence ) )
            // InternalTCR.g:307:4: (lv_evidence_6_0= ruleDParagraphEvidence )
            {
            // InternalTCR.g:307:4: (lv_evidence_6_0= ruleDParagraphEvidence )
            // InternalTCR.g:308:5: lv_evidence_6_0= ruleDParagraphEvidence
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getVTCRTestReportAccess().getEvidenceDParagraphEvidenceParserRuleCall_6_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_17);
            lv_evidence_6_0=ruleDParagraphEvidence();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getVTCRTestReportRule());
              					}
              					set(
              						current,
              						"evidence",
              						lv_evidence_6_0,
              						"es.uah.aut.srg.micobs.svm.lang.tcr.TCR.DParagraphEvidence");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_7=(Token)match(input,24,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_7, grammarAccess.getVTCRTestReportAccess().getVTCRTestReportKeyword_7());
              		
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
    // $ANTLR end "ruleVTCRTestReport"


    // $ANTLR start "entryRuleDParagraphEvidence"
    // InternalTCR.g:333:1: entryRuleDParagraphEvidence returns [EObject current=null] : iv_ruleDParagraphEvidence= ruleDParagraphEvidence EOF ;
    public final EObject entryRuleDParagraphEvidence() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDParagraphEvidence = null;


        try {
            // InternalTCR.g:333:59: (iv_ruleDParagraphEvidence= ruleDParagraphEvidence EOF )
            // InternalTCR.g:334:2: iv_ruleDParagraphEvidence= ruleDParagraphEvidence EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDParagraphEvidenceRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleDParagraphEvidence=ruleDParagraphEvidence();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDParagraphEvidence; 
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
    // $ANTLR end "entryRuleDParagraphEvidence"


    // $ANTLR start "ruleDParagraphEvidence"
    // InternalTCR.g:340:1: ruleDParagraphEvidence returns [EObject current=null] : (otherlv_0= '<evidence>' ( (lv_paragraphContent_1_0= ruleDParagraphContent ) )+ otherlv_2= '</evidence>' ) ;
    public final EObject ruleDParagraphEvidence() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_paragraphContent_1_0 = null;



        	enterRule();

        try {
            // InternalTCR.g:346:2: ( (otherlv_0= '<evidence>' ( (lv_paragraphContent_1_0= ruleDParagraphContent ) )+ otherlv_2= '</evidence>' ) )
            // InternalTCR.g:347:2: (otherlv_0= '<evidence>' ( (lv_paragraphContent_1_0= ruleDParagraphContent ) )+ otherlv_2= '</evidence>' )
            {
            // InternalTCR.g:347:2: (otherlv_0= '<evidence>' ( (lv_paragraphContent_1_0= ruleDParagraphContent ) )+ otherlv_2= '</evidence>' )
            // InternalTCR.g:348:3: otherlv_0= '<evidence>' ( (lv_paragraphContent_1_0= ruleDParagraphContent ) )+ otherlv_2= '</evidence>'
            {
            otherlv_0=(Token)match(input,25,FollowSets000.FOLLOW_18); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getDParagraphEvidenceAccess().getEvidenceKeyword_0());
              		
            }
            // InternalTCR.g:352:3: ( (lv_paragraphContent_1_0= ruleDParagraphContent ) )+
            int cnt2=0;
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==27) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalTCR.g:353:4: (lv_paragraphContent_1_0= ruleDParagraphContent )
            	    {
            	    // InternalTCR.g:353:4: (lv_paragraphContent_1_0= ruleDParagraphContent )
            	    // InternalTCR.g:354:5: lv_paragraphContent_1_0= ruleDParagraphContent
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getDParagraphEvidenceAccess().getParagraphContentDParagraphContentParserRuleCall_1_0());
            	      				
            	    }
            	    pushFollow(FollowSets000.FOLLOW_19);
            	    lv_paragraphContent_1_0=ruleDParagraphContent();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getDParagraphEvidenceRule());
            	      					}
            	      					add(
            	      						current,
            	      						"paragraphContent",
            	      						lv_paragraphContent_1_0,
            	      						"es.uah.aut.srg.micobs.svm.lang.tcr.TCR.DParagraphContent");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt2 >= 1 ) break loop2;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(2, input);
                        throw eee;
                }
                cnt2++;
            } while (true);

            otherlv_2=(Token)match(input,26,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getDParagraphEvidenceAccess().getEvidenceKeyword_2());
              		
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
    // $ANTLR end "ruleDParagraphEvidence"


    // $ANTLR start "entryRuleDParagraphContent"
    // InternalTCR.g:379:1: entryRuleDParagraphContent returns [EObject current=null] : iv_ruleDParagraphContent= ruleDParagraphContent EOF ;
    public final EObject entryRuleDParagraphContent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDParagraphContent = null;


        try {
            // InternalTCR.g:379:58: (iv_ruleDParagraphContent= ruleDParagraphContent EOF )
            // InternalTCR.g:380:2: iv_ruleDParagraphContent= ruleDParagraphContent EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDParagraphContentRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleDParagraphContent=ruleDParagraphContent();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDParagraphContent; 
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
    // $ANTLR end "entryRuleDParagraphContent"


    // $ANTLR start "ruleDParagraphContent"
    // InternalTCR.g:386:1: ruleDParagraphContent returns [EObject current=null] : this_DRun_0= ruleDRun ;
    public final EObject ruleDParagraphContent() throws RecognitionException {
        EObject current = null;

        EObject this_DRun_0 = null;



        	enterRule();

        try {
            // InternalTCR.g:392:2: (this_DRun_0= ruleDRun )
            // InternalTCR.g:393:2: this_DRun_0= ruleDRun
            {
            if ( state.backtracking==0 ) {

              		/* */
              	
            }
            if ( state.backtracking==0 ) {

              		newCompositeNode(grammarAccess.getDParagraphContentAccess().getDRunParserRuleCall());
              	
            }
            pushFollow(FollowSets000.FOLLOW_2);
            this_DRun_0=ruleDRun();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current = this_DRun_0;
              		afterParserOrEnumRuleCall();
              	
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
    // $ANTLR end "ruleDParagraphContent"


    // $ANTLR start "entryRuleDRun"
    // InternalTCR.g:407:1: entryRuleDRun returns [EObject current=null] : iv_ruleDRun= ruleDRun EOF ;
    public final EObject entryRuleDRun() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDRun = null;


        try {
            // InternalTCR.g:407:45: (iv_ruleDRun= ruleDRun EOF )
            // InternalTCR.g:408:2: iv_ruleDRun= ruleDRun EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDRunRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleDRun=ruleDRun();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDRun; 
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
    // $ANTLR end "entryRuleDRun"


    // $ANTLR start "ruleDRun"
    // InternalTCR.g:414:1: ruleDRun returns [EObject current=null] : (otherlv_0= '<run' (otherlv_1= 'bold=' ( (lv_bold_2_0= ruleDRunAttributes ) ) )? (otherlv_3= 'italics=' ( (lv_italics_4_0= ruleDRunAttributes ) ) )? (otherlv_5= 'underline=' ( (lv_underline_6_0= ruleDRunAttributes ) ) )? (otherlv_7= 'color=' ( (lv_color_8_0= RULE_STRING ) ) )? otherlv_9= '>' ( (lv_text_10_0= ruleDText ) ) otherlv_11= '</run>' ) ;
    public final EObject ruleDRun() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token lv_color_8_0=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Enumerator lv_bold_2_0 = null;

        Enumerator lv_italics_4_0 = null;

        Enumerator lv_underline_6_0 = null;

        EObject lv_text_10_0 = null;



        	enterRule();

        try {
            // InternalTCR.g:420:2: ( (otherlv_0= '<run' (otherlv_1= 'bold=' ( (lv_bold_2_0= ruleDRunAttributes ) ) )? (otherlv_3= 'italics=' ( (lv_italics_4_0= ruleDRunAttributes ) ) )? (otherlv_5= 'underline=' ( (lv_underline_6_0= ruleDRunAttributes ) ) )? (otherlv_7= 'color=' ( (lv_color_8_0= RULE_STRING ) ) )? otherlv_9= '>' ( (lv_text_10_0= ruleDText ) ) otherlv_11= '</run>' ) )
            // InternalTCR.g:421:2: (otherlv_0= '<run' (otherlv_1= 'bold=' ( (lv_bold_2_0= ruleDRunAttributes ) ) )? (otherlv_3= 'italics=' ( (lv_italics_4_0= ruleDRunAttributes ) ) )? (otherlv_5= 'underline=' ( (lv_underline_6_0= ruleDRunAttributes ) ) )? (otherlv_7= 'color=' ( (lv_color_8_0= RULE_STRING ) ) )? otherlv_9= '>' ( (lv_text_10_0= ruleDText ) ) otherlv_11= '</run>' )
            {
            // InternalTCR.g:421:2: (otherlv_0= '<run' (otherlv_1= 'bold=' ( (lv_bold_2_0= ruleDRunAttributes ) ) )? (otherlv_3= 'italics=' ( (lv_italics_4_0= ruleDRunAttributes ) ) )? (otherlv_5= 'underline=' ( (lv_underline_6_0= ruleDRunAttributes ) ) )? (otherlv_7= 'color=' ( (lv_color_8_0= RULE_STRING ) ) )? otherlv_9= '>' ( (lv_text_10_0= ruleDText ) ) otherlv_11= '</run>' )
            // InternalTCR.g:422:3: otherlv_0= '<run' (otherlv_1= 'bold=' ( (lv_bold_2_0= ruleDRunAttributes ) ) )? (otherlv_3= 'italics=' ( (lv_italics_4_0= ruleDRunAttributes ) ) )? (otherlv_5= 'underline=' ( (lv_underline_6_0= ruleDRunAttributes ) ) )? (otherlv_7= 'color=' ( (lv_color_8_0= RULE_STRING ) ) )? otherlv_9= '>' ( (lv_text_10_0= ruleDText ) ) otherlv_11= '</run>'
            {
            otherlv_0=(Token)match(input,27,FollowSets000.FOLLOW_20); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getDRunAccess().getRunKeyword_0());
              		
            }
            // InternalTCR.g:426:3: (otherlv_1= 'bold=' ( (lv_bold_2_0= ruleDRunAttributes ) ) )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==28) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalTCR.g:427:4: otherlv_1= 'bold=' ( (lv_bold_2_0= ruleDRunAttributes ) )
                    {
                    otherlv_1=(Token)match(input,28,FollowSets000.FOLLOW_21); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_1, grammarAccess.getDRunAccess().getBoldKeyword_1_0());
                      			
                    }
                    // InternalTCR.g:431:4: ( (lv_bold_2_0= ruleDRunAttributes ) )
                    // InternalTCR.g:432:5: (lv_bold_2_0= ruleDRunAttributes )
                    {
                    // InternalTCR.g:432:5: (lv_bold_2_0= ruleDRunAttributes )
                    // InternalTCR.g:433:6: lv_bold_2_0= ruleDRunAttributes
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getDRunAccess().getBoldDRunAttributesEnumRuleCall_1_1_0());
                      					
                    }
                    pushFollow(FollowSets000.FOLLOW_22);
                    lv_bold_2_0=ruleDRunAttributes();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getDRunRule());
                      						}
                      						set(
                      							current,
                      							"bold",
                      							lv_bold_2_0,
                      							"es.uah.aut.srg.micobs.svm.lang.tcr.TCR.DRunAttributes");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }
                    break;

            }

            // InternalTCR.g:451:3: (otherlv_3= 'italics=' ( (lv_italics_4_0= ruleDRunAttributes ) ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==29) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalTCR.g:452:4: otherlv_3= 'italics=' ( (lv_italics_4_0= ruleDRunAttributes ) )
                    {
                    otherlv_3=(Token)match(input,29,FollowSets000.FOLLOW_21); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_3, grammarAccess.getDRunAccess().getItalicsKeyword_2_0());
                      			
                    }
                    // InternalTCR.g:456:4: ( (lv_italics_4_0= ruleDRunAttributes ) )
                    // InternalTCR.g:457:5: (lv_italics_4_0= ruleDRunAttributes )
                    {
                    // InternalTCR.g:457:5: (lv_italics_4_0= ruleDRunAttributes )
                    // InternalTCR.g:458:6: lv_italics_4_0= ruleDRunAttributes
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getDRunAccess().getItalicsDRunAttributesEnumRuleCall_2_1_0());
                      					
                    }
                    pushFollow(FollowSets000.FOLLOW_23);
                    lv_italics_4_0=ruleDRunAttributes();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getDRunRule());
                      						}
                      						set(
                      							current,
                      							"italics",
                      							lv_italics_4_0,
                      							"es.uah.aut.srg.micobs.svm.lang.tcr.TCR.DRunAttributes");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }
                    break;

            }

            // InternalTCR.g:476:3: (otherlv_5= 'underline=' ( (lv_underline_6_0= ruleDRunAttributes ) ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==30) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalTCR.g:477:4: otherlv_5= 'underline=' ( (lv_underline_6_0= ruleDRunAttributes ) )
                    {
                    otherlv_5=(Token)match(input,30,FollowSets000.FOLLOW_21); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_5, grammarAccess.getDRunAccess().getUnderlineKeyword_3_0());
                      			
                    }
                    // InternalTCR.g:481:4: ( (lv_underline_6_0= ruleDRunAttributes ) )
                    // InternalTCR.g:482:5: (lv_underline_6_0= ruleDRunAttributes )
                    {
                    // InternalTCR.g:482:5: (lv_underline_6_0= ruleDRunAttributes )
                    // InternalTCR.g:483:6: lv_underline_6_0= ruleDRunAttributes
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getDRunAccess().getUnderlineDRunAttributesEnumRuleCall_3_1_0());
                      					
                    }
                    pushFollow(FollowSets000.FOLLOW_24);
                    lv_underline_6_0=ruleDRunAttributes();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getDRunRule());
                      						}
                      						set(
                      							current,
                      							"underline",
                      							lv_underline_6_0,
                      							"es.uah.aut.srg.micobs.svm.lang.tcr.TCR.DRunAttributes");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }
                    break;

            }

            // InternalTCR.g:501:3: (otherlv_7= 'color=' ( (lv_color_8_0= RULE_STRING ) ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==31) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalTCR.g:502:4: otherlv_7= 'color=' ( (lv_color_8_0= RULE_STRING ) )
                    {
                    otherlv_7=(Token)match(input,31,FollowSets000.FOLLOW_4); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_7, grammarAccess.getDRunAccess().getColorKeyword_4_0());
                      			
                    }
                    // InternalTCR.g:506:4: ( (lv_color_8_0= RULE_STRING ) )
                    // InternalTCR.g:507:5: (lv_color_8_0= RULE_STRING )
                    {
                    // InternalTCR.g:507:5: (lv_color_8_0= RULE_STRING )
                    // InternalTCR.g:508:6: lv_color_8_0= RULE_STRING
                    {
                    lv_color_8_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_10); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_color_8_0, grammarAccess.getDRunAccess().getColorSTRINGTerminalRuleCall_4_1_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getDRunRule());
                      						}
                      						setWithLastConsumed(
                      							current,
                      							"color",
                      							lv_color_8_0,
                      							"org.eclipse.xtext.common.Terminals.STRING");
                      					
                    }

                    }


                    }


                    }
                    break;

            }

            otherlv_9=(Token)match(input,19,FollowSets000.FOLLOW_25); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_9, grammarAccess.getDRunAccess().getGreaterThanSignKeyword_5());
              		
            }
            // InternalTCR.g:529:3: ( (lv_text_10_0= ruleDText ) )
            // InternalTCR.g:530:4: (lv_text_10_0= ruleDText )
            {
            // InternalTCR.g:530:4: (lv_text_10_0= ruleDText )
            // InternalTCR.g:531:5: lv_text_10_0= ruleDText
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getDRunAccess().getTextDTextParserRuleCall_6_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_26);
            lv_text_10_0=ruleDText();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getDRunRule());
              					}
              					set(
              						current,
              						"text",
              						lv_text_10_0,
              						"es.uah.aut.srg.micobs.svm.lang.tcr.TCR.DText");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_11=(Token)match(input,32,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_11, grammarAccess.getDRunAccess().getRunKeyword_7());
              		
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
    // $ANTLR end "ruleDRun"


    // $ANTLR start "entryRuleDText"
    // InternalTCR.g:556:1: entryRuleDText returns [EObject current=null] : iv_ruleDText= ruleDText EOF ;
    public final EObject entryRuleDText() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDText = null;


        try {
            // InternalTCR.g:556:46: (iv_ruleDText= ruleDText EOF )
            // InternalTCR.g:557:2: iv_ruleDText= ruleDText EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDTextRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleDText=ruleDText();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDText; 
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
    // $ANTLR end "entryRuleDText"


    // $ANTLR start "ruleDText"
    // InternalTCR.g:563:1: ruleDText returns [EObject current=null] : ( (lv_content_0_0= RULE_RUNTEXT ) ) ;
    public final EObject ruleDText() throws RecognitionException {
        EObject current = null;

        Token lv_content_0_0=null;


        	enterRule();

        try {
            // InternalTCR.g:569:2: ( ( (lv_content_0_0= RULE_RUNTEXT ) ) )
            // InternalTCR.g:570:2: ( (lv_content_0_0= RULE_RUNTEXT ) )
            {
            // InternalTCR.g:570:2: ( (lv_content_0_0= RULE_RUNTEXT ) )
            // InternalTCR.g:571:3: (lv_content_0_0= RULE_RUNTEXT )
            {
            // InternalTCR.g:571:3: (lv_content_0_0= RULE_RUNTEXT )
            // InternalTCR.g:572:4: lv_content_0_0= RULE_RUNTEXT
            {
            lv_content_0_0=(Token)match(input,RULE_RUNTEXT,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				newLeafNode(lv_content_0_0, grammarAccess.getDTextAccess().getContentRUNTEXTTerminalRuleCall_0());
              			
            }
            if ( state.backtracking==0 ) {

              				if (current==null) {
              					current = createModelElement(grammarAccess.getDTextRule());
              				}
              				setWithLastConsumed(
              					current,
              					"content",
              					lv_content_0_0,
              					"es.uah.aut.srg.micobs.svm.lang.tcr.TCR.RUNTEXT");
              			
            }

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
    // $ANTLR end "ruleDText"


    // $ANTLR start "ruleVTCRTestStatus"
    // InternalTCR.g:591:1: ruleVTCRTestStatus returns [Enumerator current=null] : ( (enumLiteral_0= '\"Fail\"' ) | (enumLiteral_1= '\"Pass\"' ) | (enumLiteral_2= '\"NotTested\"' ) ) ;
    public final Enumerator ruleVTCRTestStatus() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalTCR.g:597:2: ( ( (enumLiteral_0= '\"Fail\"' ) | (enumLiteral_1= '\"Pass\"' ) | (enumLiteral_2= '\"NotTested\"' ) ) )
            // InternalTCR.g:598:2: ( (enumLiteral_0= '\"Fail\"' ) | (enumLiteral_1= '\"Pass\"' ) | (enumLiteral_2= '\"NotTested\"' ) )
            {
            // InternalTCR.g:598:2: ( (enumLiteral_0= '\"Fail\"' ) | (enumLiteral_1= '\"Pass\"' ) | (enumLiteral_2= '\"NotTested\"' ) )
            int alt7=3;
            switch ( input.LA(1) ) {
            case 33:
                {
                alt7=1;
                }
                break;
            case 34:
                {
                alt7=2;
                }
                break;
            case 35:
                {
                alt7=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // InternalTCR.g:599:3: (enumLiteral_0= '\"Fail\"' )
                    {
                    // InternalTCR.g:599:3: (enumLiteral_0= '\"Fail\"' )
                    // InternalTCR.g:600:4: enumLiteral_0= '\"Fail\"'
                    {
                    enumLiteral_0=(Token)match(input,33,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getVTCRTestStatusAccess().getFailEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_0, grammarAccess.getVTCRTestStatusAccess().getFailEnumLiteralDeclaration_0());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalTCR.g:607:3: (enumLiteral_1= '\"Pass\"' )
                    {
                    // InternalTCR.g:607:3: (enumLiteral_1= '\"Pass\"' )
                    // InternalTCR.g:608:4: enumLiteral_1= '\"Pass\"'
                    {
                    enumLiteral_1=(Token)match(input,34,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getVTCRTestStatusAccess().getPassEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_1, grammarAccess.getVTCRTestStatusAccess().getPassEnumLiteralDeclaration_1());
                      			
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalTCR.g:615:3: (enumLiteral_2= '\"NotTested\"' )
                    {
                    // InternalTCR.g:615:3: (enumLiteral_2= '\"NotTested\"' )
                    // InternalTCR.g:616:4: enumLiteral_2= '\"NotTested\"'
                    {
                    enumLiteral_2=(Token)match(input,35,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getVTCRTestStatusAccess().getNotTestedEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_2, grammarAccess.getVTCRTestStatusAccess().getNotTestedEnumLiteralDeclaration_2());
                      			
                    }

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
    // $ANTLR end "ruleVTCRTestStatus"


    // $ANTLR start "ruleDRunAttributes"
    // InternalTCR.g:626:1: ruleDRunAttributes returns [Enumerator current=null] : ( (enumLiteral_0= '\"true\"' ) | (enumLiteral_1= '\"false\"' ) ) ;
    public final Enumerator ruleDRunAttributes() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalTCR.g:632:2: ( ( (enumLiteral_0= '\"true\"' ) | (enumLiteral_1= '\"false\"' ) ) )
            // InternalTCR.g:633:2: ( (enumLiteral_0= '\"true\"' ) | (enumLiteral_1= '\"false\"' ) )
            {
            // InternalTCR.g:633:2: ( (enumLiteral_0= '\"true\"' ) | (enumLiteral_1= '\"false\"' ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==36) ) {
                alt8=1;
            }
            else if ( (LA8_0==37) ) {
                alt8=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalTCR.g:634:3: (enumLiteral_0= '\"true\"' )
                    {
                    // InternalTCR.g:634:3: (enumLiteral_0= '\"true\"' )
                    // InternalTCR.g:635:4: enumLiteral_0= '\"true\"'
                    {
                    enumLiteral_0=(Token)match(input,36,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getDRunAttributesAccess().getTRUEEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_0, grammarAccess.getDRunAttributesAccess().getTRUEEnumLiteralDeclaration_0());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalTCR.g:642:3: (enumLiteral_1= '\"false\"' )
                    {
                    // InternalTCR.g:642:3: (enumLiteral_1= '\"false\"' )
                    // InternalTCR.g:643:4: enumLiteral_1= '\"false\"'
                    {
                    enumLiteral_1=(Token)match(input,37,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getDRunAttributesAccess().getFALSEEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_1, grammarAccess.getDRunAttributesAccess().getFALSEEnumLiteralDeclaration_1());
                      			
                    }

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
    // $ANTLR end "ruleDRunAttributes"

    // Delegated rules


 

    
    private static class FollowSets000 {
        public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000040000L});
        public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000080000L});
        public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000200000L});
        public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000300000L});
        public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000400000L});
        public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000800000L});
        public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000E00000000L});
        public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000002000000L});
        public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000001000000L});
        public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000008000000L});
        public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x000000000C000000L});
        public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x00000000F0080000L});
        public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000003000000000L});
        public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x00000000E0080000L});
        public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x00000000C0080000L});
        public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000080080000L});
        public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000000000040L});
        public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000100000000L});
    }


}