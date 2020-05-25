package es.uah.aut.srg.micobs.svm.lang.svr.parser.antlr.internal;

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
import es.uah.aut.srg.micobs.svm.lang.svr.services.SVRGrammarAccess;



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
public class InternalSVRParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_UINT_STRING", "RULE_REAL_STRING", "RULE_RUNTEXT", "RULE_HEXADECIMAL", "RULE_HEX_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'<SVR'", "'name='", "'id='", "'issue='", "'revision='", "'date='", "'>'", "'<svsParent'", "'/>'", "'<tcrParent'", "'</SVR>'", "'<TBCsTBDs>'", "'</TBCsTBDs>'", "'<TBC'", "'description='", "'parentTBC='", "'<TBD'", "'parentTBD='", "'<body>'", "'</body>'", "'<paragraph'", "'alignment='", "'style='", "'indent='", "'</paragraph>'", "'<listItem>'", "'<sublist>'", "'</sublist>'", "'</listItem>'", "'<itemize'", "'</itemize>'", "'<enumerate'", "'</enumerate>'", "'<run'", "'bold='", "'italics='", "'underline='", "'color='", "'</run>'", "'<hyperlink'", "'reference='", "'</hyperlink>'", "'<tab/>'", "'<figureFromFile'", "'referenceFile='", "'width='", "'height='", "'caption='", "'<tableFromFile'", "'<basicTable'", "'</basicTable>'", "'<row>'", "'</row>'", "'<cell'", "'colSpan='", "'rowSpan='", "'shadow='", "'</cell>'", "'<ApplicableDocument'", "'title='", "'url='", "'<ReferenceDocument'", "'<subsection'", "'</subsection>'", "'<Introduction>'", "'</Introduction>'", "'<ApplicableDocuments>'", "'</ApplicableDocuments>'", "'<ReferenceDocuments>'", "'</ReferenceDocuments>'", "'<TermsDefinitionsAbbreviations>'", "'</TermsDefinitionsAbbreviations>'", "'<Term'", "'</Term>'", "'<Definition'", "'</Definition>'", "'<Abbreviation'", "'</Abbreviation>'", "'<SWValProcessVerification>'", "'<Traceability>'", "'</Traceability>'", "'<Feasibility>'", "'</Feasibility>'", "'</SWValProcessVerification>'", "'\"left\"'", "'\"center\"'", "'\"right\"'", "'\"justified\"'", "'\"true\"'", "'\"false\"'"
    };
    public static final int T__50=50;
    public static final int RULE_HEX_STRING=9;
    public static final int T__59=59;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int T__57=57;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int T__60=60;
    public static final int T__61=61;
    public static final int RULE_ID=10;
    public static final int RULE_INT=11;
    public static final int RULE_RUNTEXT=7;
    public static final int T__66=66;
    public static final int RULE_ML_COMMENT=12;
    public static final int T__67=67;
    public static final int RULE_HEXADECIMAL=8;
    public static final int T__68=68;
    public static final int T__69=69;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int T__64=64;
    public static final int T__65=65;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;
    public static final int T__91=91;
    public static final int T__100=100;
    public static final int T__92=92;
    public static final int T__93=93;
    public static final int T__102=102;
    public static final int T__94=94;
    public static final int T__101=101;
    public static final int T__90=90;
    public static final int T__19=19;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__99=99;
    public static final int T__95=95;
    public static final int T__96=96;
    public static final int T__97=97;
    public static final int T__98=98;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int T__70=70;
    public static final int T__71=71;
    public static final int T__72=72;
    public static final int RULE_REAL_STRING=6;
    public static final int RULE_STRING=4;
    public static final int RULE_UINT_STRING=5;
    public static final int RULE_SL_COMMENT=13;
    public static final int T__77=77;
    public static final int T__78=78;
    public static final int T__79=79;
    public static final int T__73=73;
    public static final int EOF=-1;
    public static final int T__74=74;
    public static final int T__75=75;
    public static final int T__76=76;
    public static final int T__80=80;
    public static final int T__81=81;
    public static final int T__82=82;
    public static final int T__83=83;
    public static final int RULE_WS=14;
    public static final int RULE_ANY_OTHER=15;
    public static final int T__88=88;
    public static final int T__89=89;
    public static final int T__84=84;
    public static final int T__104=104;
    public static final int T__85=85;
    public static final int T__103=103;
    public static final int T__86=86;
    public static final int T__87=87;
    public static final int T__105=105;

    // delegates
    // delegators


        public InternalSVRParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalSVRParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalSVRParser.tokenNames; }
    public String getGrammarFileName() { return "InternalSVR.g"; }



    /*
      This grammar contains a lot of empty actions to work around a bug in ANTLR.
      Otherwise the ANTLR tool will create synpreds that cannot be compiled in some rare cases.
    */

     	private SVRGrammarAccess grammarAccess;

        public InternalSVRParser(TokenStream input, SVRGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "VSVRDocument";
       	}

       	@Override
       	protected SVRGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleVSVRDocument"
    // InternalSVR.g:78:1: entryRuleVSVRDocument returns [EObject current=null] : iv_ruleVSVRDocument= ruleVSVRDocument EOF ;
    public final EObject entryRuleVSVRDocument() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVSVRDocument = null;


        try {
            // InternalSVR.g:78:53: (iv_ruleVSVRDocument= ruleVSVRDocument EOF )
            // InternalSVR.g:79:2: iv_ruleVSVRDocument= ruleVSVRDocument EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getVSVRDocumentRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleVSVRDocument=ruleVSVRDocument();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleVSVRDocument; 
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
    // $ANTLR end "entryRuleVSVRDocument"


    // $ANTLR start "ruleVSVRDocument"
    // InternalSVR.g:85:1: ruleVSVRDocument returns [EObject current=null] : (otherlv_0= '<SVR' otherlv_1= 'name=' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= 'id=' ( (lv_id_4_0= RULE_STRING ) ) otherlv_5= 'issue=' ( (lv_issue_6_0= RULE_UINT_STRING ) ) otherlv_7= 'revision=' ( (lv_revision_8_0= RULE_UINT_STRING ) ) otherlv_9= 'date=' ( (lv_date_10_0= RULE_STRING ) ) otherlv_11= '>' otherlv_12= '<svsParent' otherlv_13= 'name=' ( (otherlv_14= RULE_STRING ) ) otherlv_15= '/>' (otherlv_16= '<tcrParent' otherlv_17= 'name=' ( (otherlv_18= RULE_STRING ) ) otherlv_19= '/>' )* ( (lv_tbcsTbdsSection_20_0= ruleVSVRTBCsTBDs ) )? ( (lv_introductionSection_21_0= ruleVSVRIntroduction ) ) ( (lv_applicableDocumentsSection_22_0= ruleVSVRApplicableDocuments ) ) ( (lv_referenceDocumentsSection_23_0= ruleVSVRReferenceDocuments ) ) ( (lv_termsDefinitionsAbbreviationsSection_24_0= ruleVSVRTermsDefinitionsAbbreviations ) ) ( (lv_swValProcessVerificationSection_25_0= ruleVSVRSWValProcessVerification ) ) otherlv_26= '</SVR>' ) ;
    public final EObject ruleVSVRDocument() throws RecognitionException {
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
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        Token otherlv_18=null;
        Token otherlv_19=null;
        Token otherlv_26=null;
        EObject lv_tbcsTbdsSection_20_0 = null;

        EObject lv_introductionSection_21_0 = null;

        EObject lv_applicableDocumentsSection_22_0 = null;

        EObject lv_referenceDocumentsSection_23_0 = null;

        EObject lv_termsDefinitionsAbbreviationsSection_24_0 = null;

        EObject lv_swValProcessVerificationSection_25_0 = null;



        	enterRule();

        try {
            // InternalSVR.g:91:2: ( (otherlv_0= '<SVR' otherlv_1= 'name=' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= 'id=' ( (lv_id_4_0= RULE_STRING ) ) otherlv_5= 'issue=' ( (lv_issue_6_0= RULE_UINT_STRING ) ) otherlv_7= 'revision=' ( (lv_revision_8_0= RULE_UINT_STRING ) ) otherlv_9= 'date=' ( (lv_date_10_0= RULE_STRING ) ) otherlv_11= '>' otherlv_12= '<svsParent' otherlv_13= 'name=' ( (otherlv_14= RULE_STRING ) ) otherlv_15= '/>' (otherlv_16= '<tcrParent' otherlv_17= 'name=' ( (otherlv_18= RULE_STRING ) ) otherlv_19= '/>' )* ( (lv_tbcsTbdsSection_20_0= ruleVSVRTBCsTBDs ) )? ( (lv_introductionSection_21_0= ruleVSVRIntroduction ) ) ( (lv_applicableDocumentsSection_22_0= ruleVSVRApplicableDocuments ) ) ( (lv_referenceDocumentsSection_23_0= ruleVSVRReferenceDocuments ) ) ( (lv_termsDefinitionsAbbreviationsSection_24_0= ruleVSVRTermsDefinitionsAbbreviations ) ) ( (lv_swValProcessVerificationSection_25_0= ruleVSVRSWValProcessVerification ) ) otherlv_26= '</SVR>' ) )
            // InternalSVR.g:92:2: (otherlv_0= '<SVR' otherlv_1= 'name=' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= 'id=' ( (lv_id_4_0= RULE_STRING ) ) otherlv_5= 'issue=' ( (lv_issue_6_0= RULE_UINT_STRING ) ) otherlv_7= 'revision=' ( (lv_revision_8_0= RULE_UINT_STRING ) ) otherlv_9= 'date=' ( (lv_date_10_0= RULE_STRING ) ) otherlv_11= '>' otherlv_12= '<svsParent' otherlv_13= 'name=' ( (otherlv_14= RULE_STRING ) ) otherlv_15= '/>' (otherlv_16= '<tcrParent' otherlv_17= 'name=' ( (otherlv_18= RULE_STRING ) ) otherlv_19= '/>' )* ( (lv_tbcsTbdsSection_20_0= ruleVSVRTBCsTBDs ) )? ( (lv_introductionSection_21_0= ruleVSVRIntroduction ) ) ( (lv_applicableDocumentsSection_22_0= ruleVSVRApplicableDocuments ) ) ( (lv_referenceDocumentsSection_23_0= ruleVSVRReferenceDocuments ) ) ( (lv_termsDefinitionsAbbreviationsSection_24_0= ruleVSVRTermsDefinitionsAbbreviations ) ) ( (lv_swValProcessVerificationSection_25_0= ruleVSVRSWValProcessVerification ) ) otherlv_26= '</SVR>' )
            {
            // InternalSVR.g:92:2: (otherlv_0= '<SVR' otherlv_1= 'name=' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= 'id=' ( (lv_id_4_0= RULE_STRING ) ) otherlv_5= 'issue=' ( (lv_issue_6_0= RULE_UINT_STRING ) ) otherlv_7= 'revision=' ( (lv_revision_8_0= RULE_UINT_STRING ) ) otherlv_9= 'date=' ( (lv_date_10_0= RULE_STRING ) ) otherlv_11= '>' otherlv_12= '<svsParent' otherlv_13= 'name=' ( (otherlv_14= RULE_STRING ) ) otherlv_15= '/>' (otherlv_16= '<tcrParent' otherlv_17= 'name=' ( (otherlv_18= RULE_STRING ) ) otherlv_19= '/>' )* ( (lv_tbcsTbdsSection_20_0= ruleVSVRTBCsTBDs ) )? ( (lv_introductionSection_21_0= ruleVSVRIntroduction ) ) ( (lv_applicableDocumentsSection_22_0= ruleVSVRApplicableDocuments ) ) ( (lv_referenceDocumentsSection_23_0= ruleVSVRReferenceDocuments ) ) ( (lv_termsDefinitionsAbbreviationsSection_24_0= ruleVSVRTermsDefinitionsAbbreviations ) ) ( (lv_swValProcessVerificationSection_25_0= ruleVSVRSWValProcessVerification ) ) otherlv_26= '</SVR>' )
            // InternalSVR.g:93:3: otherlv_0= '<SVR' otherlv_1= 'name=' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= 'id=' ( (lv_id_4_0= RULE_STRING ) ) otherlv_5= 'issue=' ( (lv_issue_6_0= RULE_UINT_STRING ) ) otherlv_7= 'revision=' ( (lv_revision_8_0= RULE_UINT_STRING ) ) otherlv_9= 'date=' ( (lv_date_10_0= RULE_STRING ) ) otherlv_11= '>' otherlv_12= '<svsParent' otherlv_13= 'name=' ( (otherlv_14= RULE_STRING ) ) otherlv_15= '/>' (otherlv_16= '<tcrParent' otherlv_17= 'name=' ( (otherlv_18= RULE_STRING ) ) otherlv_19= '/>' )* ( (lv_tbcsTbdsSection_20_0= ruleVSVRTBCsTBDs ) )? ( (lv_introductionSection_21_0= ruleVSVRIntroduction ) ) ( (lv_applicableDocumentsSection_22_0= ruleVSVRApplicableDocuments ) ) ( (lv_referenceDocumentsSection_23_0= ruleVSVRReferenceDocuments ) ) ( (lv_termsDefinitionsAbbreviationsSection_24_0= ruleVSVRTermsDefinitionsAbbreviations ) ) ( (lv_swValProcessVerificationSection_25_0= ruleVSVRSWValProcessVerification ) ) otherlv_26= '</SVR>'
            {
            otherlv_0=(Token)match(input,16,FollowSets000.FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getVSVRDocumentAccess().getSVRKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,17,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getVSVRDocumentAccess().getNameKeyword_1());
              		
            }
            // InternalSVR.g:101:3: ( (lv_name_2_0= RULE_STRING ) )
            // InternalSVR.g:102:4: (lv_name_2_0= RULE_STRING )
            {
            // InternalSVR.g:102:4: (lv_name_2_0= RULE_STRING )
            // InternalSVR.g:103:5: lv_name_2_0= RULE_STRING
            {
            lv_name_2_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_2_0, grammarAccess.getVSVRDocumentAccess().getNameSTRINGTerminalRuleCall_2_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getVSVRDocumentRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_2_0,
              						"org.eclipse.xtext.common.Terminals.STRING");
              				
            }

            }


            }

            otherlv_3=(Token)match(input,18,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getVSVRDocumentAccess().getIdKeyword_3());
              		
            }
            // InternalSVR.g:123:3: ( (lv_id_4_0= RULE_STRING ) )
            // InternalSVR.g:124:4: (lv_id_4_0= RULE_STRING )
            {
            // InternalSVR.g:124:4: (lv_id_4_0= RULE_STRING )
            // InternalSVR.g:125:5: lv_id_4_0= RULE_STRING
            {
            lv_id_4_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_id_4_0, grammarAccess.getVSVRDocumentAccess().getIdSTRINGTerminalRuleCall_4_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getVSVRDocumentRule());
              					}
              					setWithLastConsumed(
              						current,
              						"id",
              						lv_id_4_0,
              						"org.eclipse.xtext.common.Terminals.STRING");
              				
            }

            }


            }

            otherlv_5=(Token)match(input,19,FollowSets000.FOLLOW_7); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getVSVRDocumentAccess().getIssueKeyword_5());
              		
            }
            // InternalSVR.g:145:3: ( (lv_issue_6_0= RULE_UINT_STRING ) )
            // InternalSVR.g:146:4: (lv_issue_6_0= RULE_UINT_STRING )
            {
            // InternalSVR.g:146:4: (lv_issue_6_0= RULE_UINT_STRING )
            // InternalSVR.g:147:5: lv_issue_6_0= RULE_UINT_STRING
            {
            lv_issue_6_0=(Token)match(input,RULE_UINT_STRING,FollowSets000.FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_issue_6_0, grammarAccess.getVSVRDocumentAccess().getIssueUINT_STRINGTerminalRuleCall_6_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getVSVRDocumentRule());
              					}
              					setWithLastConsumed(
              						current,
              						"issue",
              						lv_issue_6_0,
              						"es.uah.aut.srg.micobs.svm.lang.svr.SVR.UINT_STRING");
              				
            }

            }


            }

            otherlv_7=(Token)match(input,20,FollowSets000.FOLLOW_7); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_7, grammarAccess.getVSVRDocumentAccess().getRevisionKeyword_7());
              		
            }
            // InternalSVR.g:167:3: ( (lv_revision_8_0= RULE_UINT_STRING ) )
            // InternalSVR.g:168:4: (lv_revision_8_0= RULE_UINT_STRING )
            {
            // InternalSVR.g:168:4: (lv_revision_8_0= RULE_UINT_STRING )
            // InternalSVR.g:169:5: lv_revision_8_0= RULE_UINT_STRING
            {
            lv_revision_8_0=(Token)match(input,RULE_UINT_STRING,FollowSets000.FOLLOW_9); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_revision_8_0, grammarAccess.getVSVRDocumentAccess().getRevisionUINT_STRINGTerminalRuleCall_8_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getVSVRDocumentRule());
              					}
              					setWithLastConsumed(
              						current,
              						"revision",
              						lv_revision_8_0,
              						"es.uah.aut.srg.micobs.svm.lang.svr.SVR.UINT_STRING");
              				
            }

            }


            }

            otherlv_9=(Token)match(input,21,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_9, grammarAccess.getVSVRDocumentAccess().getDateKeyword_9());
              		
            }
            // InternalSVR.g:189:3: ( (lv_date_10_0= RULE_STRING ) )
            // InternalSVR.g:190:4: (lv_date_10_0= RULE_STRING )
            {
            // InternalSVR.g:190:4: (lv_date_10_0= RULE_STRING )
            // InternalSVR.g:191:5: lv_date_10_0= RULE_STRING
            {
            lv_date_10_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_10); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_date_10_0, grammarAccess.getVSVRDocumentAccess().getDateSTRINGTerminalRuleCall_10_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getVSVRDocumentRule());
              					}
              					setWithLastConsumed(
              						current,
              						"date",
              						lv_date_10_0,
              						"org.eclipse.xtext.common.Terminals.STRING");
              				
            }

            }


            }

            otherlv_11=(Token)match(input,22,FollowSets000.FOLLOW_11); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_11, grammarAccess.getVSVRDocumentAccess().getGreaterThanSignKeyword_11());
              		
            }
            otherlv_12=(Token)match(input,23,FollowSets000.FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_12, grammarAccess.getVSVRDocumentAccess().getSvsParentKeyword_12());
              		
            }
            otherlv_13=(Token)match(input,17,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_13, grammarAccess.getVSVRDocumentAccess().getNameKeyword_13());
              		
            }
            // InternalSVR.g:219:3: ( (otherlv_14= RULE_STRING ) )
            // InternalSVR.g:220:4: (otherlv_14= RULE_STRING )
            {
            // InternalSVR.g:220:4: (otherlv_14= RULE_STRING )
            // InternalSVR.g:221:5: otherlv_14= RULE_STRING
            {
            if ( state.backtracking==0 ) {

              					/* */
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getVSVRDocumentRule());
              					}
              				
            }
            otherlv_14=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_12); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(otherlv_14, grammarAccess.getVSVRDocumentAccess().getSvsParentVSVSDocumentCrossReference_14_0());
              				
            }

            }


            }

            otherlv_15=(Token)match(input,24,FollowSets000.FOLLOW_13); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_15, grammarAccess.getVSVRDocumentAccess().getSolidusGreaterThanSignKeyword_15());
              		
            }
            // InternalSVR.g:239:3: (otherlv_16= '<tcrParent' otherlv_17= 'name=' ( (otherlv_18= RULE_STRING ) ) otherlv_19= '/>' )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==25) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalSVR.g:240:4: otherlv_16= '<tcrParent' otherlv_17= 'name=' ( (otherlv_18= RULE_STRING ) ) otherlv_19= '/>'
            	    {
            	    otherlv_16=(Token)match(input,25,FollowSets000.FOLLOW_3); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_16, grammarAccess.getVSVRDocumentAccess().getTcrParentKeyword_16_0());
            	      			
            	    }
            	    otherlv_17=(Token)match(input,17,FollowSets000.FOLLOW_4); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_17, grammarAccess.getVSVRDocumentAccess().getNameKeyword_16_1());
            	      			
            	    }
            	    // InternalSVR.g:248:4: ( (otherlv_18= RULE_STRING ) )
            	    // InternalSVR.g:249:5: (otherlv_18= RULE_STRING )
            	    {
            	    // InternalSVR.g:249:5: (otherlv_18= RULE_STRING )
            	    // InternalSVR.g:250:6: otherlv_18= RULE_STRING
            	    {
            	    if ( state.backtracking==0 ) {

            	      						/* */
            	      					
            	    }
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElement(grammarAccess.getVSVRDocumentRule());
            	      						}
            	      					
            	    }
            	    otherlv_18=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_12); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						newLeafNode(otherlv_18, grammarAccess.getVSVRDocumentAccess().getTcrParentVTCRTestCampaignReportCrossReference_16_2_0());
            	      					
            	    }

            	    }


            	    }

            	    otherlv_19=(Token)match(input,24,FollowSets000.FOLLOW_13); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_19, grammarAccess.getVSVRDocumentAccess().getSolidusGreaterThanSignKeyword_16_3());
            	      			
            	    }

            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            // InternalSVR.g:269:3: ( (lv_tbcsTbdsSection_20_0= ruleVSVRTBCsTBDs ) )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==27) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalSVR.g:270:4: (lv_tbcsTbdsSection_20_0= ruleVSVRTBCsTBDs )
                    {
                    // InternalSVR.g:270:4: (lv_tbcsTbdsSection_20_0= ruleVSVRTBCsTBDs )
                    // InternalSVR.g:271:5: lv_tbcsTbdsSection_20_0= ruleVSVRTBCsTBDs
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getVSVRDocumentAccess().getTbcsTbdsSectionVSVRTBCsTBDsParserRuleCall_17_0());
                      				
                    }
                    pushFollow(FollowSets000.FOLLOW_13);
                    lv_tbcsTbdsSection_20_0=ruleVSVRTBCsTBDs();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getVSVRDocumentRule());
                      					}
                      					set(
                      						current,
                      						"tbcsTbdsSection",
                      						lv_tbcsTbdsSection_20_0,
                      						"es.uah.aut.srg.micobs.svm.lang.svr.SVR.VSVRTBCsTBDs");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }
                    break;

            }

            // InternalSVR.g:288:3: ( (lv_introductionSection_21_0= ruleVSVRIntroduction ) )
            // InternalSVR.g:289:4: (lv_introductionSection_21_0= ruleVSVRIntroduction )
            {
            // InternalSVR.g:289:4: (lv_introductionSection_21_0= ruleVSVRIntroduction )
            // InternalSVR.g:290:5: lv_introductionSection_21_0= ruleVSVRIntroduction
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getVSVRDocumentAccess().getIntroductionSectionVSVRIntroductionParserRuleCall_18_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_14);
            lv_introductionSection_21_0=ruleVSVRIntroduction();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getVSVRDocumentRule());
              					}
              					set(
              						current,
              						"introductionSection",
              						lv_introductionSection_21_0,
              						"es.uah.aut.srg.micobs.svm.lang.svr.SVR.VSVRIntroduction");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalSVR.g:307:3: ( (lv_applicableDocumentsSection_22_0= ruleVSVRApplicableDocuments ) )
            // InternalSVR.g:308:4: (lv_applicableDocumentsSection_22_0= ruleVSVRApplicableDocuments )
            {
            // InternalSVR.g:308:4: (lv_applicableDocumentsSection_22_0= ruleVSVRApplicableDocuments )
            // InternalSVR.g:309:5: lv_applicableDocumentsSection_22_0= ruleVSVRApplicableDocuments
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getVSVRDocumentAccess().getApplicableDocumentsSectionVSVRApplicableDocumentsParserRuleCall_19_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_15);
            lv_applicableDocumentsSection_22_0=ruleVSVRApplicableDocuments();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getVSVRDocumentRule());
              					}
              					set(
              						current,
              						"applicableDocumentsSection",
              						lv_applicableDocumentsSection_22_0,
              						"es.uah.aut.srg.micobs.svm.lang.svr.SVR.VSVRApplicableDocuments");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalSVR.g:326:3: ( (lv_referenceDocumentsSection_23_0= ruleVSVRReferenceDocuments ) )
            // InternalSVR.g:327:4: (lv_referenceDocumentsSection_23_0= ruleVSVRReferenceDocuments )
            {
            // InternalSVR.g:327:4: (lv_referenceDocumentsSection_23_0= ruleVSVRReferenceDocuments )
            // InternalSVR.g:328:5: lv_referenceDocumentsSection_23_0= ruleVSVRReferenceDocuments
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getVSVRDocumentAccess().getReferenceDocumentsSectionVSVRReferenceDocumentsParserRuleCall_20_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_16);
            lv_referenceDocumentsSection_23_0=ruleVSVRReferenceDocuments();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getVSVRDocumentRule());
              					}
              					set(
              						current,
              						"referenceDocumentsSection",
              						lv_referenceDocumentsSection_23_0,
              						"es.uah.aut.srg.micobs.svm.lang.svr.SVR.VSVRReferenceDocuments");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalSVR.g:345:3: ( (lv_termsDefinitionsAbbreviationsSection_24_0= ruleVSVRTermsDefinitionsAbbreviations ) )
            // InternalSVR.g:346:4: (lv_termsDefinitionsAbbreviationsSection_24_0= ruleVSVRTermsDefinitionsAbbreviations )
            {
            // InternalSVR.g:346:4: (lv_termsDefinitionsAbbreviationsSection_24_0= ruleVSVRTermsDefinitionsAbbreviations )
            // InternalSVR.g:347:5: lv_termsDefinitionsAbbreviationsSection_24_0= ruleVSVRTermsDefinitionsAbbreviations
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getVSVRDocumentAccess().getTermsDefinitionsAbbreviationsSectionVSVRTermsDefinitionsAbbreviationsParserRuleCall_21_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_17);
            lv_termsDefinitionsAbbreviationsSection_24_0=ruleVSVRTermsDefinitionsAbbreviations();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getVSVRDocumentRule());
              					}
              					set(
              						current,
              						"termsDefinitionsAbbreviationsSection",
              						lv_termsDefinitionsAbbreviationsSection_24_0,
              						"es.uah.aut.srg.micobs.svm.lang.svr.SVR.VSVRTermsDefinitionsAbbreviations");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalSVR.g:364:3: ( (lv_swValProcessVerificationSection_25_0= ruleVSVRSWValProcessVerification ) )
            // InternalSVR.g:365:4: (lv_swValProcessVerificationSection_25_0= ruleVSVRSWValProcessVerification )
            {
            // InternalSVR.g:365:4: (lv_swValProcessVerificationSection_25_0= ruleVSVRSWValProcessVerification )
            // InternalSVR.g:366:5: lv_swValProcessVerificationSection_25_0= ruleVSVRSWValProcessVerification
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getVSVRDocumentAccess().getSwValProcessVerificationSectionVSVRSWValProcessVerificationParserRuleCall_22_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_18);
            lv_swValProcessVerificationSection_25_0=ruleVSVRSWValProcessVerification();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getVSVRDocumentRule());
              					}
              					set(
              						current,
              						"swValProcessVerificationSection",
              						lv_swValProcessVerificationSection_25_0,
              						"es.uah.aut.srg.micobs.svm.lang.svr.SVR.VSVRSWValProcessVerification");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_26=(Token)match(input,26,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_26, grammarAccess.getVSVRDocumentAccess().getSVRKeyword_23());
              		
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
    // $ANTLR end "ruleVSVRDocument"


    // $ANTLR start "entryRuleVSVRTBCsTBDs"
    // InternalSVR.g:391:1: entryRuleVSVRTBCsTBDs returns [EObject current=null] : iv_ruleVSVRTBCsTBDs= ruleVSVRTBCsTBDs EOF ;
    public final EObject entryRuleVSVRTBCsTBDs() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVSVRTBCsTBDs = null;


        try {
            // InternalSVR.g:391:53: (iv_ruleVSVRTBCsTBDs= ruleVSVRTBCsTBDs EOF )
            // InternalSVR.g:392:2: iv_ruleVSVRTBCsTBDs= ruleVSVRTBCsTBDs EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getVSVRTBCsTBDsRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleVSVRTBCsTBDs=ruleVSVRTBCsTBDs();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleVSVRTBCsTBDs; 
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
    // $ANTLR end "entryRuleVSVRTBCsTBDs"


    // $ANTLR start "ruleVSVRTBCsTBDs"
    // InternalSVR.g:398:1: ruleVSVRTBCsTBDs returns [EObject current=null] : ( () otherlv_1= '<TBCsTBDs>' ( (lv_tbcs_2_0= ruleDTBC ) )* ( (lv_tbds_3_0= ruleDTBD ) )* otherlv_4= '</TBCsTBDs>' ) ;
    public final EObject ruleVSVRTBCsTBDs() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_4=null;
        EObject lv_tbcs_2_0 = null;

        EObject lv_tbds_3_0 = null;



        	enterRule();

        try {
            // InternalSVR.g:404:2: ( ( () otherlv_1= '<TBCsTBDs>' ( (lv_tbcs_2_0= ruleDTBC ) )* ( (lv_tbds_3_0= ruleDTBD ) )* otherlv_4= '</TBCsTBDs>' ) )
            // InternalSVR.g:405:2: ( () otherlv_1= '<TBCsTBDs>' ( (lv_tbcs_2_0= ruleDTBC ) )* ( (lv_tbds_3_0= ruleDTBD ) )* otherlv_4= '</TBCsTBDs>' )
            {
            // InternalSVR.g:405:2: ( () otherlv_1= '<TBCsTBDs>' ( (lv_tbcs_2_0= ruleDTBC ) )* ( (lv_tbds_3_0= ruleDTBD ) )* otherlv_4= '</TBCsTBDs>' )
            // InternalSVR.g:406:3: () otherlv_1= '<TBCsTBDs>' ( (lv_tbcs_2_0= ruleDTBC ) )* ( (lv_tbds_3_0= ruleDTBD ) )* otherlv_4= '</TBCsTBDs>'
            {
            // InternalSVR.g:406:3: ()
            // InternalSVR.g:407:4: 
            {
            if ( state.backtracking==0 ) {

              				/* */
              			
            }
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getVSVRTBCsTBDsAccess().getVSVRTBCsTBDsAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,27,FollowSets000.FOLLOW_19); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getVSVRTBCsTBDsAccess().getTBCsTBDsKeyword_1());
              		
            }
            // InternalSVR.g:420:3: ( (lv_tbcs_2_0= ruleDTBC ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==29) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalSVR.g:421:4: (lv_tbcs_2_0= ruleDTBC )
            	    {
            	    // InternalSVR.g:421:4: (lv_tbcs_2_0= ruleDTBC )
            	    // InternalSVR.g:422:5: lv_tbcs_2_0= ruleDTBC
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getVSVRTBCsTBDsAccess().getTbcsDTBCParserRuleCall_2_0());
            	      				
            	    }
            	    pushFollow(FollowSets000.FOLLOW_19);
            	    lv_tbcs_2_0=ruleDTBC();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getVSVRTBCsTBDsRule());
            	      					}
            	      					add(
            	      						current,
            	      						"tbcs",
            	      						lv_tbcs_2_0,
            	      						"es.uah.aut.srg.micobs.svm.lang.svr.SVR.DTBC");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            // InternalSVR.g:439:3: ( (lv_tbds_3_0= ruleDTBD ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==32) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalSVR.g:440:4: (lv_tbds_3_0= ruleDTBD )
            	    {
            	    // InternalSVR.g:440:4: (lv_tbds_3_0= ruleDTBD )
            	    // InternalSVR.g:441:5: lv_tbds_3_0= ruleDTBD
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getVSVRTBCsTBDsAccess().getTbdsDTBDParserRuleCall_3_0());
            	      				
            	    }
            	    pushFollow(FollowSets000.FOLLOW_20);
            	    lv_tbds_3_0=ruleDTBD();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getVSVRTBCsTBDsRule());
            	      					}
            	      					add(
            	      						current,
            	      						"tbds",
            	      						lv_tbds_3_0,
            	      						"es.uah.aut.srg.micobs.svm.lang.svr.SVR.DTBD");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            otherlv_4=(Token)match(input,28,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getVSVRTBCsTBDsAccess().getTBCsTBDsKeyword_4());
              		
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
    // $ANTLR end "ruleVSVRTBCsTBDs"


    // $ANTLR start "entryRuleDTBC"
    // InternalSVR.g:466:1: entryRuleDTBC returns [EObject current=null] : iv_ruleDTBC= ruleDTBC EOF ;
    public final EObject entryRuleDTBC() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDTBC = null;


        try {
            // InternalSVR.g:466:45: (iv_ruleDTBC= ruleDTBC EOF )
            // InternalSVR.g:467:2: iv_ruleDTBC= ruleDTBC EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDTBCRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleDTBC=ruleDTBC();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDTBC; 
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
    // $ANTLR end "entryRuleDTBC"


    // $ANTLR start "ruleDTBC"
    // InternalSVR.g:473:1: ruleDTBC returns [EObject current=null] : (otherlv_0= '<TBC' otherlv_1= 'name=' ( (lv_name_2_0= RULE_STRING ) ) ( (otherlv_3= 'description=' ( (lv_description_4_0= RULE_STRING ) ) ) | (otherlv_5= 'parentTBC=' ( (otherlv_6= RULE_STRING ) ) ) ) otherlv_7= '/>' ) ;
    public final EObject ruleDTBC() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token lv_description_4_0=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;


        	enterRule();

        try {
            // InternalSVR.g:479:2: ( (otherlv_0= '<TBC' otherlv_1= 'name=' ( (lv_name_2_0= RULE_STRING ) ) ( (otherlv_3= 'description=' ( (lv_description_4_0= RULE_STRING ) ) ) | (otherlv_5= 'parentTBC=' ( (otherlv_6= RULE_STRING ) ) ) ) otherlv_7= '/>' ) )
            // InternalSVR.g:480:2: (otherlv_0= '<TBC' otherlv_1= 'name=' ( (lv_name_2_0= RULE_STRING ) ) ( (otherlv_3= 'description=' ( (lv_description_4_0= RULE_STRING ) ) ) | (otherlv_5= 'parentTBC=' ( (otherlv_6= RULE_STRING ) ) ) ) otherlv_7= '/>' )
            {
            // InternalSVR.g:480:2: (otherlv_0= '<TBC' otherlv_1= 'name=' ( (lv_name_2_0= RULE_STRING ) ) ( (otherlv_3= 'description=' ( (lv_description_4_0= RULE_STRING ) ) ) | (otherlv_5= 'parentTBC=' ( (otherlv_6= RULE_STRING ) ) ) ) otherlv_7= '/>' )
            // InternalSVR.g:481:3: otherlv_0= '<TBC' otherlv_1= 'name=' ( (lv_name_2_0= RULE_STRING ) ) ( (otherlv_3= 'description=' ( (lv_description_4_0= RULE_STRING ) ) ) | (otherlv_5= 'parentTBC=' ( (otherlv_6= RULE_STRING ) ) ) ) otherlv_7= '/>'
            {
            otherlv_0=(Token)match(input,29,FollowSets000.FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getDTBCAccess().getTBCKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,17,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getDTBCAccess().getNameKeyword_1());
              		
            }
            // InternalSVR.g:489:3: ( (lv_name_2_0= RULE_STRING ) )
            // InternalSVR.g:490:4: (lv_name_2_0= RULE_STRING )
            {
            // InternalSVR.g:490:4: (lv_name_2_0= RULE_STRING )
            // InternalSVR.g:491:5: lv_name_2_0= RULE_STRING
            {
            lv_name_2_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_21); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_2_0, grammarAccess.getDTBCAccess().getNameSTRINGTerminalRuleCall_2_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getDTBCRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_2_0,
              						"org.eclipse.xtext.common.Terminals.STRING");
              				
            }

            }


            }

            // InternalSVR.g:507:3: ( (otherlv_3= 'description=' ( (lv_description_4_0= RULE_STRING ) ) ) | (otherlv_5= 'parentTBC=' ( (otherlv_6= RULE_STRING ) ) ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==30) ) {
                alt5=1;
            }
            else if ( (LA5_0==31) ) {
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
                    // InternalSVR.g:508:4: (otherlv_3= 'description=' ( (lv_description_4_0= RULE_STRING ) ) )
                    {
                    // InternalSVR.g:508:4: (otherlv_3= 'description=' ( (lv_description_4_0= RULE_STRING ) ) )
                    // InternalSVR.g:509:5: otherlv_3= 'description=' ( (lv_description_4_0= RULE_STRING ) )
                    {
                    otherlv_3=(Token)match(input,30,FollowSets000.FOLLOW_4); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_3, grammarAccess.getDTBCAccess().getDescriptionKeyword_3_0_0());
                      				
                    }
                    // InternalSVR.g:513:5: ( (lv_description_4_0= RULE_STRING ) )
                    // InternalSVR.g:514:6: (lv_description_4_0= RULE_STRING )
                    {
                    // InternalSVR.g:514:6: (lv_description_4_0= RULE_STRING )
                    // InternalSVR.g:515:7: lv_description_4_0= RULE_STRING
                    {
                    lv_description_4_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_12); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      							newLeafNode(lv_description_4_0, grammarAccess.getDTBCAccess().getDescriptionSTRINGTerminalRuleCall_3_0_1_0());
                      						
                    }
                    if ( state.backtracking==0 ) {

                      							if (current==null) {
                      								current = createModelElement(grammarAccess.getDTBCRule());
                      							}
                      							setWithLastConsumed(
                      								current,
                      								"description",
                      								lv_description_4_0,
                      								"org.eclipse.xtext.common.Terminals.STRING");
                      						
                    }

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalSVR.g:533:4: (otherlv_5= 'parentTBC=' ( (otherlv_6= RULE_STRING ) ) )
                    {
                    // InternalSVR.g:533:4: (otherlv_5= 'parentTBC=' ( (otherlv_6= RULE_STRING ) ) )
                    // InternalSVR.g:534:5: otherlv_5= 'parentTBC=' ( (otherlv_6= RULE_STRING ) )
                    {
                    otherlv_5=(Token)match(input,31,FollowSets000.FOLLOW_4); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_5, grammarAccess.getDTBCAccess().getParentTBCKeyword_3_1_0());
                      				
                    }
                    // InternalSVR.g:538:5: ( (otherlv_6= RULE_STRING ) )
                    // InternalSVR.g:539:6: (otherlv_6= RULE_STRING )
                    {
                    // InternalSVR.g:539:6: (otherlv_6= RULE_STRING )
                    // InternalSVR.g:540:7: otherlv_6= RULE_STRING
                    {
                    if ( state.backtracking==0 ) {

                      							/* */
                      						
                    }
                    if ( state.backtracking==0 ) {

                      							if (current==null) {
                      								current = createModelElement(grammarAccess.getDTBCRule());
                      							}
                      						
                    }
                    otherlv_6=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_12); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      							newLeafNode(otherlv_6, grammarAccess.getDTBCAccess().getParentTBCDTBCCrossReference_3_1_1_0());
                      						
                    }

                    }


                    }


                    }


                    }
                    break;

            }

            otherlv_7=(Token)match(input,24,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_7, grammarAccess.getDTBCAccess().getSolidusGreaterThanSignKeyword_4());
              		
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
    // $ANTLR end "ruleDTBC"


    // $ANTLR start "entryRuleDTBD"
    // InternalSVR.g:564:1: entryRuleDTBD returns [EObject current=null] : iv_ruleDTBD= ruleDTBD EOF ;
    public final EObject entryRuleDTBD() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDTBD = null;


        try {
            // InternalSVR.g:564:45: (iv_ruleDTBD= ruleDTBD EOF )
            // InternalSVR.g:565:2: iv_ruleDTBD= ruleDTBD EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDTBDRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleDTBD=ruleDTBD();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDTBD; 
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
    // $ANTLR end "entryRuleDTBD"


    // $ANTLR start "ruleDTBD"
    // InternalSVR.g:571:1: ruleDTBD returns [EObject current=null] : (otherlv_0= '<TBD' otherlv_1= 'name=' ( (lv_name_2_0= RULE_STRING ) ) ( (otherlv_3= 'description=' ( (lv_description_4_0= RULE_STRING ) ) ) | (otherlv_5= 'parentTBD=' ( (otherlv_6= RULE_STRING ) ) ) ) otherlv_7= '/>' ) ;
    public final EObject ruleDTBD() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token lv_description_4_0=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;


        	enterRule();

        try {
            // InternalSVR.g:577:2: ( (otherlv_0= '<TBD' otherlv_1= 'name=' ( (lv_name_2_0= RULE_STRING ) ) ( (otherlv_3= 'description=' ( (lv_description_4_0= RULE_STRING ) ) ) | (otherlv_5= 'parentTBD=' ( (otherlv_6= RULE_STRING ) ) ) ) otherlv_7= '/>' ) )
            // InternalSVR.g:578:2: (otherlv_0= '<TBD' otherlv_1= 'name=' ( (lv_name_2_0= RULE_STRING ) ) ( (otherlv_3= 'description=' ( (lv_description_4_0= RULE_STRING ) ) ) | (otherlv_5= 'parentTBD=' ( (otherlv_6= RULE_STRING ) ) ) ) otherlv_7= '/>' )
            {
            // InternalSVR.g:578:2: (otherlv_0= '<TBD' otherlv_1= 'name=' ( (lv_name_2_0= RULE_STRING ) ) ( (otherlv_3= 'description=' ( (lv_description_4_0= RULE_STRING ) ) ) | (otherlv_5= 'parentTBD=' ( (otherlv_6= RULE_STRING ) ) ) ) otherlv_7= '/>' )
            // InternalSVR.g:579:3: otherlv_0= '<TBD' otherlv_1= 'name=' ( (lv_name_2_0= RULE_STRING ) ) ( (otherlv_3= 'description=' ( (lv_description_4_0= RULE_STRING ) ) ) | (otherlv_5= 'parentTBD=' ( (otherlv_6= RULE_STRING ) ) ) ) otherlv_7= '/>'
            {
            otherlv_0=(Token)match(input,32,FollowSets000.FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getDTBDAccess().getTBDKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,17,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getDTBDAccess().getNameKeyword_1());
              		
            }
            // InternalSVR.g:587:3: ( (lv_name_2_0= RULE_STRING ) )
            // InternalSVR.g:588:4: (lv_name_2_0= RULE_STRING )
            {
            // InternalSVR.g:588:4: (lv_name_2_0= RULE_STRING )
            // InternalSVR.g:589:5: lv_name_2_0= RULE_STRING
            {
            lv_name_2_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_22); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_2_0, grammarAccess.getDTBDAccess().getNameSTRINGTerminalRuleCall_2_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getDTBDRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_2_0,
              						"org.eclipse.xtext.common.Terminals.STRING");
              				
            }

            }


            }

            // InternalSVR.g:605:3: ( (otherlv_3= 'description=' ( (lv_description_4_0= RULE_STRING ) ) ) | (otherlv_5= 'parentTBD=' ( (otherlv_6= RULE_STRING ) ) ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==30) ) {
                alt6=1;
            }
            else if ( (LA6_0==33) ) {
                alt6=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalSVR.g:606:4: (otherlv_3= 'description=' ( (lv_description_4_0= RULE_STRING ) ) )
                    {
                    // InternalSVR.g:606:4: (otherlv_3= 'description=' ( (lv_description_4_0= RULE_STRING ) ) )
                    // InternalSVR.g:607:5: otherlv_3= 'description=' ( (lv_description_4_0= RULE_STRING ) )
                    {
                    otherlv_3=(Token)match(input,30,FollowSets000.FOLLOW_4); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_3, grammarAccess.getDTBDAccess().getDescriptionKeyword_3_0_0());
                      				
                    }
                    // InternalSVR.g:611:5: ( (lv_description_4_0= RULE_STRING ) )
                    // InternalSVR.g:612:6: (lv_description_4_0= RULE_STRING )
                    {
                    // InternalSVR.g:612:6: (lv_description_4_0= RULE_STRING )
                    // InternalSVR.g:613:7: lv_description_4_0= RULE_STRING
                    {
                    lv_description_4_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_12); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      							newLeafNode(lv_description_4_0, grammarAccess.getDTBDAccess().getDescriptionSTRINGTerminalRuleCall_3_0_1_0());
                      						
                    }
                    if ( state.backtracking==0 ) {

                      							if (current==null) {
                      								current = createModelElement(grammarAccess.getDTBDRule());
                      							}
                      							setWithLastConsumed(
                      								current,
                      								"description",
                      								lv_description_4_0,
                      								"org.eclipse.xtext.common.Terminals.STRING");
                      						
                    }

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalSVR.g:631:4: (otherlv_5= 'parentTBD=' ( (otherlv_6= RULE_STRING ) ) )
                    {
                    // InternalSVR.g:631:4: (otherlv_5= 'parentTBD=' ( (otherlv_6= RULE_STRING ) ) )
                    // InternalSVR.g:632:5: otherlv_5= 'parentTBD=' ( (otherlv_6= RULE_STRING ) )
                    {
                    otherlv_5=(Token)match(input,33,FollowSets000.FOLLOW_4); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_5, grammarAccess.getDTBDAccess().getParentTBDKeyword_3_1_0());
                      				
                    }
                    // InternalSVR.g:636:5: ( (otherlv_6= RULE_STRING ) )
                    // InternalSVR.g:637:6: (otherlv_6= RULE_STRING )
                    {
                    // InternalSVR.g:637:6: (otherlv_6= RULE_STRING )
                    // InternalSVR.g:638:7: otherlv_6= RULE_STRING
                    {
                    if ( state.backtracking==0 ) {

                      							/* */
                      						
                    }
                    if ( state.backtracking==0 ) {

                      							if (current==null) {
                      								current = createModelElement(grammarAccess.getDTBDRule());
                      							}
                      						
                    }
                    otherlv_6=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_12); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      							newLeafNode(otherlv_6, grammarAccess.getDTBDAccess().getParentTBDDTBDCrossReference_3_1_1_0());
                      						
                    }

                    }


                    }


                    }


                    }
                    break;

            }

            otherlv_7=(Token)match(input,24,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_7, grammarAccess.getDTBDAccess().getSolidusGreaterThanSignKeyword_4());
              		
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
    // $ANTLR end "ruleDTBD"


    // $ANTLR start "entryRuleDBody"
    // InternalSVR.g:662:1: entryRuleDBody returns [EObject current=null] : iv_ruleDBody= ruleDBody EOF ;
    public final EObject entryRuleDBody() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDBody = null;


        try {
            // InternalSVR.g:662:46: (iv_ruleDBody= ruleDBody EOF )
            // InternalSVR.g:663:2: iv_ruleDBody= ruleDBody EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDBodyRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleDBody=ruleDBody();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDBody; 
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
    // $ANTLR end "entryRuleDBody"


    // $ANTLR start "ruleDBody"
    // InternalSVR.g:669:1: ruleDBody returns [EObject current=null] : (otherlv_0= '<body>' ( (lv_bodyContent_1_0= ruleDBodyContent ) )+ otherlv_2= '</body>' ) ;
    public final EObject ruleDBody() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_bodyContent_1_0 = null;



        	enterRule();

        try {
            // InternalSVR.g:675:2: ( (otherlv_0= '<body>' ( (lv_bodyContent_1_0= ruleDBodyContent ) )+ otherlv_2= '</body>' ) )
            // InternalSVR.g:676:2: (otherlv_0= '<body>' ( (lv_bodyContent_1_0= ruleDBodyContent ) )+ otherlv_2= '</body>' )
            {
            // InternalSVR.g:676:2: (otherlv_0= '<body>' ( (lv_bodyContent_1_0= ruleDBodyContent ) )+ otherlv_2= '</body>' )
            // InternalSVR.g:677:3: otherlv_0= '<body>' ( (lv_bodyContent_1_0= ruleDBodyContent ) )+ otherlv_2= '</body>'
            {
            otherlv_0=(Token)match(input,34,FollowSets000.FOLLOW_23); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getDBodyAccess().getBodyKeyword_0());
              		
            }
            // InternalSVR.g:681:3: ( (lv_bodyContent_1_0= ruleDBodyContent ) )+
            int cnt7=0;
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==36||LA7_0==45||LA7_0==47||LA7_0==59||(LA7_0>=64 && LA7_0<=65)) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalSVR.g:682:4: (lv_bodyContent_1_0= ruleDBodyContent )
            	    {
            	    // InternalSVR.g:682:4: (lv_bodyContent_1_0= ruleDBodyContent )
            	    // InternalSVR.g:683:5: lv_bodyContent_1_0= ruleDBodyContent
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getDBodyAccess().getBodyContentDBodyContentParserRuleCall_1_0());
            	      				
            	    }
            	    pushFollow(FollowSets000.FOLLOW_24);
            	    lv_bodyContent_1_0=ruleDBodyContent();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getDBodyRule());
            	      					}
            	      					add(
            	      						current,
            	      						"bodyContent",
            	      						lv_bodyContent_1_0,
            	      						"es.uah.aut.srg.micobs.svm.lang.svr.SVR.DBodyContent");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt7 >= 1 ) break loop7;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(7, input);
                        throw eee;
                }
                cnt7++;
            } while (true);

            otherlv_2=(Token)match(input,35,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getDBodyAccess().getBodyKeyword_2());
              		
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
    // $ANTLR end "ruleDBody"


    // $ANTLR start "entryRuleDBodyContent"
    // InternalSVR.g:708:1: entryRuleDBodyContent returns [EObject current=null] : iv_ruleDBodyContent= ruleDBodyContent EOF ;
    public final EObject entryRuleDBodyContent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDBodyContent = null;


        try {
            // InternalSVR.g:708:53: (iv_ruleDBodyContent= ruleDBodyContent EOF )
            // InternalSVR.g:709:2: iv_ruleDBodyContent= ruleDBodyContent EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDBodyContentRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleDBodyContent=ruleDBodyContent();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDBodyContent; 
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
    // $ANTLR end "entryRuleDBodyContent"


    // $ANTLR start "ruleDBodyContent"
    // InternalSVR.g:715:1: ruleDBodyContent returns [EObject current=null] : (this_DParagraph_0= ruleDParagraph | this_DItemize_1= ruleDItemize | this_DEnumerate_2= ruleDEnumerate | this_DFigureFromFile_3= ruleDFigureFromFile | this_DTableFromFile_4= ruleDTableFromFile | this_DBasicTable_5= ruleDBasicTable ) ;
    public final EObject ruleDBodyContent() throws RecognitionException {
        EObject current = null;

        EObject this_DParagraph_0 = null;

        EObject this_DItemize_1 = null;

        EObject this_DEnumerate_2 = null;

        EObject this_DFigureFromFile_3 = null;

        EObject this_DTableFromFile_4 = null;

        EObject this_DBasicTable_5 = null;



        	enterRule();

        try {
            // InternalSVR.g:721:2: ( (this_DParagraph_0= ruleDParagraph | this_DItemize_1= ruleDItemize | this_DEnumerate_2= ruleDEnumerate | this_DFigureFromFile_3= ruleDFigureFromFile | this_DTableFromFile_4= ruleDTableFromFile | this_DBasicTable_5= ruleDBasicTable ) )
            // InternalSVR.g:722:2: (this_DParagraph_0= ruleDParagraph | this_DItemize_1= ruleDItemize | this_DEnumerate_2= ruleDEnumerate | this_DFigureFromFile_3= ruleDFigureFromFile | this_DTableFromFile_4= ruleDTableFromFile | this_DBasicTable_5= ruleDBasicTable )
            {
            // InternalSVR.g:722:2: (this_DParagraph_0= ruleDParagraph | this_DItemize_1= ruleDItemize | this_DEnumerate_2= ruleDEnumerate | this_DFigureFromFile_3= ruleDFigureFromFile | this_DTableFromFile_4= ruleDTableFromFile | this_DBasicTable_5= ruleDBasicTable )
            int alt8=6;
            switch ( input.LA(1) ) {
            case 36:
                {
                alt8=1;
                }
                break;
            case 45:
                {
                alt8=2;
                }
                break;
            case 47:
                {
                alt8=3;
                }
                break;
            case 59:
                {
                alt8=4;
                }
                break;
            case 64:
                {
                alt8=5;
                }
                break;
            case 65:
                {
                alt8=6;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // InternalSVR.g:723:3: this_DParagraph_0= ruleDParagraph
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getDBodyContentAccess().getDParagraphParserRuleCall_0());
                      		
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_DParagraph_0=ruleDParagraph();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_DParagraph_0;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalSVR.g:735:3: this_DItemize_1= ruleDItemize
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getDBodyContentAccess().getDItemizeParserRuleCall_1());
                      		
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_DItemize_1=ruleDItemize();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_DItemize_1;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalSVR.g:747:3: this_DEnumerate_2= ruleDEnumerate
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getDBodyContentAccess().getDEnumerateParserRuleCall_2());
                      		
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_DEnumerate_2=ruleDEnumerate();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_DEnumerate_2;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 4 :
                    // InternalSVR.g:759:3: this_DFigureFromFile_3= ruleDFigureFromFile
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getDBodyContentAccess().getDFigureFromFileParserRuleCall_3());
                      		
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_DFigureFromFile_3=ruleDFigureFromFile();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_DFigureFromFile_3;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 5 :
                    // InternalSVR.g:771:3: this_DTableFromFile_4= ruleDTableFromFile
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getDBodyContentAccess().getDTableFromFileParserRuleCall_4());
                      		
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_DTableFromFile_4=ruleDTableFromFile();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_DTableFromFile_4;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 6 :
                    // InternalSVR.g:783:3: this_DBasicTable_5= ruleDBasicTable
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getDBodyContentAccess().getDBasicTableParserRuleCall_5());
                      		
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_DBasicTable_5=ruleDBasicTable();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_DBasicTable_5;
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
    // $ANTLR end "ruleDBodyContent"


    // $ANTLR start "entryRuleDParagraph"
    // InternalSVR.g:798:1: entryRuleDParagraph returns [EObject current=null] : iv_ruleDParagraph= ruleDParagraph EOF ;
    public final EObject entryRuleDParagraph() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDParagraph = null;


        try {
            // InternalSVR.g:798:51: (iv_ruleDParagraph= ruleDParagraph EOF )
            // InternalSVR.g:799:2: iv_ruleDParagraph= ruleDParagraph EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDParagraphRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleDParagraph=ruleDParagraph();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDParagraph; 
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
    // $ANTLR end "entryRuleDParagraph"


    // $ANTLR start "ruleDParagraph"
    // InternalSVR.g:805:1: ruleDParagraph returns [EObject current=null] : (otherlv_0= '<paragraph' (otherlv_1= 'name=' ( (lv_name_2_0= RULE_STRING ) ) )? (otherlv_3= 'alignment=' ( (lv_alignment_4_0= ruleDAlignment ) ) )? (otherlv_5= 'style=' ( (lv_style_6_0= RULE_STRING ) ) )? (otherlv_7= 'indent=' ( (lv_indent_8_0= RULE_REAL_STRING ) ) )? otherlv_9= '>' ( (lv_paragraphContent_10_0= ruleDParagraphContent ) )+ otherlv_11= '</paragraph>' ) ;
    public final EObject ruleDParagraph() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token lv_style_6_0=null;
        Token otherlv_7=null;
        Token lv_indent_8_0=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Enumerator lv_alignment_4_0 = null;

        EObject lv_paragraphContent_10_0 = null;



        	enterRule();

        try {
            // InternalSVR.g:811:2: ( (otherlv_0= '<paragraph' (otherlv_1= 'name=' ( (lv_name_2_0= RULE_STRING ) ) )? (otherlv_3= 'alignment=' ( (lv_alignment_4_0= ruleDAlignment ) ) )? (otherlv_5= 'style=' ( (lv_style_6_0= RULE_STRING ) ) )? (otherlv_7= 'indent=' ( (lv_indent_8_0= RULE_REAL_STRING ) ) )? otherlv_9= '>' ( (lv_paragraphContent_10_0= ruleDParagraphContent ) )+ otherlv_11= '</paragraph>' ) )
            // InternalSVR.g:812:2: (otherlv_0= '<paragraph' (otherlv_1= 'name=' ( (lv_name_2_0= RULE_STRING ) ) )? (otherlv_3= 'alignment=' ( (lv_alignment_4_0= ruleDAlignment ) ) )? (otherlv_5= 'style=' ( (lv_style_6_0= RULE_STRING ) ) )? (otherlv_7= 'indent=' ( (lv_indent_8_0= RULE_REAL_STRING ) ) )? otherlv_9= '>' ( (lv_paragraphContent_10_0= ruleDParagraphContent ) )+ otherlv_11= '</paragraph>' )
            {
            // InternalSVR.g:812:2: (otherlv_0= '<paragraph' (otherlv_1= 'name=' ( (lv_name_2_0= RULE_STRING ) ) )? (otherlv_3= 'alignment=' ( (lv_alignment_4_0= ruleDAlignment ) ) )? (otherlv_5= 'style=' ( (lv_style_6_0= RULE_STRING ) ) )? (otherlv_7= 'indent=' ( (lv_indent_8_0= RULE_REAL_STRING ) ) )? otherlv_9= '>' ( (lv_paragraphContent_10_0= ruleDParagraphContent ) )+ otherlv_11= '</paragraph>' )
            // InternalSVR.g:813:3: otherlv_0= '<paragraph' (otherlv_1= 'name=' ( (lv_name_2_0= RULE_STRING ) ) )? (otherlv_3= 'alignment=' ( (lv_alignment_4_0= ruleDAlignment ) ) )? (otherlv_5= 'style=' ( (lv_style_6_0= RULE_STRING ) ) )? (otherlv_7= 'indent=' ( (lv_indent_8_0= RULE_REAL_STRING ) ) )? otherlv_9= '>' ( (lv_paragraphContent_10_0= ruleDParagraphContent ) )+ otherlv_11= '</paragraph>'
            {
            otherlv_0=(Token)match(input,36,FollowSets000.FOLLOW_25); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getDParagraphAccess().getParagraphKeyword_0());
              		
            }
            // InternalSVR.g:817:3: (otherlv_1= 'name=' ( (lv_name_2_0= RULE_STRING ) ) )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==17) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalSVR.g:818:4: otherlv_1= 'name=' ( (lv_name_2_0= RULE_STRING ) )
                    {
                    otherlv_1=(Token)match(input,17,FollowSets000.FOLLOW_4); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_1, grammarAccess.getDParagraphAccess().getNameKeyword_1_0());
                      			
                    }
                    // InternalSVR.g:822:4: ( (lv_name_2_0= RULE_STRING ) )
                    // InternalSVR.g:823:5: (lv_name_2_0= RULE_STRING )
                    {
                    // InternalSVR.g:823:5: (lv_name_2_0= RULE_STRING )
                    // InternalSVR.g:824:6: lv_name_2_0= RULE_STRING
                    {
                    lv_name_2_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_26); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_name_2_0, grammarAccess.getDParagraphAccess().getNameSTRINGTerminalRuleCall_1_1_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getDParagraphRule());
                      						}
                      						setWithLastConsumed(
                      							current,
                      							"name",
                      							lv_name_2_0,
                      							"org.eclipse.xtext.common.Terminals.STRING");
                      					
                    }

                    }


                    }


                    }
                    break;

            }

            // InternalSVR.g:841:3: (otherlv_3= 'alignment=' ( (lv_alignment_4_0= ruleDAlignment ) ) )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==37) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalSVR.g:842:4: otherlv_3= 'alignment=' ( (lv_alignment_4_0= ruleDAlignment ) )
                    {
                    otherlv_3=(Token)match(input,37,FollowSets000.FOLLOW_27); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_3, grammarAccess.getDParagraphAccess().getAlignmentKeyword_2_0());
                      			
                    }
                    // InternalSVR.g:846:4: ( (lv_alignment_4_0= ruleDAlignment ) )
                    // InternalSVR.g:847:5: (lv_alignment_4_0= ruleDAlignment )
                    {
                    // InternalSVR.g:847:5: (lv_alignment_4_0= ruleDAlignment )
                    // InternalSVR.g:848:6: lv_alignment_4_0= ruleDAlignment
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getDParagraphAccess().getAlignmentDAlignmentEnumRuleCall_2_1_0());
                      					
                    }
                    pushFollow(FollowSets000.FOLLOW_28);
                    lv_alignment_4_0=ruleDAlignment();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getDParagraphRule());
                      						}
                      						set(
                      							current,
                      							"alignment",
                      							lv_alignment_4_0,
                      							"es.uah.aut.srg.micobs.svm.lang.svr.SVR.DAlignment");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }
                    break;

            }

            // InternalSVR.g:866:3: (otherlv_5= 'style=' ( (lv_style_6_0= RULE_STRING ) ) )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==38) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalSVR.g:867:4: otherlv_5= 'style=' ( (lv_style_6_0= RULE_STRING ) )
                    {
                    otherlv_5=(Token)match(input,38,FollowSets000.FOLLOW_4); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_5, grammarAccess.getDParagraphAccess().getStyleKeyword_3_0());
                      			
                    }
                    // InternalSVR.g:871:4: ( (lv_style_6_0= RULE_STRING ) )
                    // InternalSVR.g:872:5: (lv_style_6_0= RULE_STRING )
                    {
                    // InternalSVR.g:872:5: (lv_style_6_0= RULE_STRING )
                    // InternalSVR.g:873:6: lv_style_6_0= RULE_STRING
                    {
                    lv_style_6_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_29); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_style_6_0, grammarAccess.getDParagraphAccess().getStyleSTRINGTerminalRuleCall_3_1_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getDParagraphRule());
                      						}
                      						setWithLastConsumed(
                      							current,
                      							"style",
                      							lv_style_6_0,
                      							"org.eclipse.xtext.common.Terminals.STRING");
                      					
                    }

                    }


                    }


                    }
                    break;

            }

            // InternalSVR.g:890:3: (otherlv_7= 'indent=' ( (lv_indent_8_0= RULE_REAL_STRING ) ) )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==39) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalSVR.g:891:4: otherlv_7= 'indent=' ( (lv_indent_8_0= RULE_REAL_STRING ) )
                    {
                    otherlv_7=(Token)match(input,39,FollowSets000.FOLLOW_30); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_7, grammarAccess.getDParagraphAccess().getIndentKeyword_4_0());
                      			
                    }
                    // InternalSVR.g:895:4: ( (lv_indent_8_0= RULE_REAL_STRING ) )
                    // InternalSVR.g:896:5: (lv_indent_8_0= RULE_REAL_STRING )
                    {
                    // InternalSVR.g:896:5: (lv_indent_8_0= RULE_REAL_STRING )
                    // InternalSVR.g:897:6: lv_indent_8_0= RULE_REAL_STRING
                    {
                    lv_indent_8_0=(Token)match(input,RULE_REAL_STRING,FollowSets000.FOLLOW_10); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_indent_8_0, grammarAccess.getDParagraphAccess().getIndentREAL_STRINGTerminalRuleCall_4_1_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getDParagraphRule());
                      						}
                      						setWithLastConsumed(
                      							current,
                      							"indent",
                      							lv_indent_8_0,
                      							"es.uah.aut.srg.micobs.svm.lang.svr.SVR.REAL_STRING");
                      					
                    }

                    }


                    }


                    }
                    break;

            }

            otherlv_9=(Token)match(input,22,FollowSets000.FOLLOW_31); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_9, grammarAccess.getDParagraphAccess().getGreaterThanSignKeyword_5());
              		
            }
            // InternalSVR.g:918:3: ( (lv_paragraphContent_10_0= ruleDParagraphContent ) )+
            int cnt13=0;
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==49||LA13_0==55) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalSVR.g:919:4: (lv_paragraphContent_10_0= ruleDParagraphContent )
            	    {
            	    // InternalSVR.g:919:4: (lv_paragraphContent_10_0= ruleDParagraphContent )
            	    // InternalSVR.g:920:5: lv_paragraphContent_10_0= ruleDParagraphContent
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getDParagraphAccess().getParagraphContentDParagraphContentParserRuleCall_6_0());
            	      				
            	    }
            	    pushFollow(FollowSets000.FOLLOW_32);
            	    lv_paragraphContent_10_0=ruleDParagraphContent();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getDParagraphRule());
            	      					}
            	      					add(
            	      						current,
            	      						"paragraphContent",
            	      						lv_paragraphContent_10_0,
            	      						"es.uah.aut.srg.micobs.svm.lang.svr.SVR.DParagraphContent");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt13 >= 1 ) break loop13;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(13, input);
                        throw eee;
                }
                cnt13++;
            } while (true);

            otherlv_11=(Token)match(input,40,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_11, grammarAccess.getDParagraphAccess().getParagraphKeyword_7());
              		
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
    // $ANTLR end "ruleDParagraph"


    // $ANTLR start "entryRuleDListItem"
    // InternalSVR.g:945:1: entryRuleDListItem returns [EObject current=null] : iv_ruleDListItem= ruleDListItem EOF ;
    public final EObject entryRuleDListItem() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDListItem = null;


        try {
            // InternalSVR.g:945:50: (iv_ruleDListItem= ruleDListItem EOF )
            // InternalSVR.g:946:2: iv_ruleDListItem= ruleDListItem EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDListItemRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleDListItem=ruleDListItem();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDListItem; 
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
    // $ANTLR end "entryRuleDListItem"


    // $ANTLR start "ruleDListItem"
    // InternalSVR.g:952:1: ruleDListItem returns [EObject current=null] : ( () otherlv_1= '<listItem>' ( (lv_paragraph_2_0= ruleDParagraph ) )? (otherlv_3= '<sublist>' ( (lv_sublist_4_0= ruleDListContent ) ) otherlv_5= '</sublist>' )? otherlv_6= '</listItem>' ) ;
    public final EObject ruleDListItem() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        EObject lv_paragraph_2_0 = null;

        EObject lv_sublist_4_0 = null;



        	enterRule();

        try {
            // InternalSVR.g:958:2: ( ( () otherlv_1= '<listItem>' ( (lv_paragraph_2_0= ruleDParagraph ) )? (otherlv_3= '<sublist>' ( (lv_sublist_4_0= ruleDListContent ) ) otherlv_5= '</sublist>' )? otherlv_6= '</listItem>' ) )
            // InternalSVR.g:959:2: ( () otherlv_1= '<listItem>' ( (lv_paragraph_2_0= ruleDParagraph ) )? (otherlv_3= '<sublist>' ( (lv_sublist_4_0= ruleDListContent ) ) otherlv_5= '</sublist>' )? otherlv_6= '</listItem>' )
            {
            // InternalSVR.g:959:2: ( () otherlv_1= '<listItem>' ( (lv_paragraph_2_0= ruleDParagraph ) )? (otherlv_3= '<sublist>' ( (lv_sublist_4_0= ruleDListContent ) ) otherlv_5= '</sublist>' )? otherlv_6= '</listItem>' )
            // InternalSVR.g:960:3: () otherlv_1= '<listItem>' ( (lv_paragraph_2_0= ruleDParagraph ) )? (otherlv_3= '<sublist>' ( (lv_sublist_4_0= ruleDListContent ) ) otherlv_5= '</sublist>' )? otherlv_6= '</listItem>'
            {
            // InternalSVR.g:960:3: ()
            // InternalSVR.g:961:4: 
            {
            if ( state.backtracking==0 ) {

              				/* */
              			
            }
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getDListItemAccess().getDListItemAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,41,FollowSets000.FOLLOW_33); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getDListItemAccess().getListItemKeyword_1());
              		
            }
            // InternalSVR.g:974:3: ( (lv_paragraph_2_0= ruleDParagraph ) )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==36) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalSVR.g:975:4: (lv_paragraph_2_0= ruleDParagraph )
                    {
                    // InternalSVR.g:975:4: (lv_paragraph_2_0= ruleDParagraph )
                    // InternalSVR.g:976:5: lv_paragraph_2_0= ruleDParagraph
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getDListItemAccess().getParagraphDParagraphParserRuleCall_2_0());
                      				
                    }
                    pushFollow(FollowSets000.FOLLOW_34);
                    lv_paragraph_2_0=ruleDParagraph();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getDListItemRule());
                      					}
                      					set(
                      						current,
                      						"paragraph",
                      						lv_paragraph_2_0,
                      						"es.uah.aut.srg.micobs.svm.lang.svr.SVR.DParagraph");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }
                    break;

            }

            // InternalSVR.g:993:3: (otherlv_3= '<sublist>' ( (lv_sublist_4_0= ruleDListContent ) ) otherlv_5= '</sublist>' )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==42) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalSVR.g:994:4: otherlv_3= '<sublist>' ( (lv_sublist_4_0= ruleDListContent ) ) otherlv_5= '</sublist>'
                    {
                    otherlv_3=(Token)match(input,42,FollowSets000.FOLLOW_35); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_3, grammarAccess.getDListItemAccess().getSublistKeyword_3_0());
                      			
                    }
                    // InternalSVR.g:998:4: ( (lv_sublist_4_0= ruleDListContent ) )
                    // InternalSVR.g:999:5: (lv_sublist_4_0= ruleDListContent )
                    {
                    // InternalSVR.g:999:5: (lv_sublist_4_0= ruleDListContent )
                    // InternalSVR.g:1000:6: lv_sublist_4_0= ruleDListContent
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getDListItemAccess().getSublistDListContentParserRuleCall_3_1_0());
                      					
                    }
                    pushFollow(FollowSets000.FOLLOW_36);
                    lv_sublist_4_0=ruleDListContent();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getDListItemRule());
                      						}
                      						set(
                      							current,
                      							"sublist",
                      							lv_sublist_4_0,
                      							"es.uah.aut.srg.micobs.svm.lang.svr.SVR.DListContent");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    otherlv_5=(Token)match(input,43,FollowSets000.FOLLOW_37); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_5, grammarAccess.getDListItemAccess().getSublistKeyword_3_2());
                      			
                    }

                    }
                    break;

            }

            otherlv_6=(Token)match(input,44,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_6, grammarAccess.getDListItemAccess().getListItemKeyword_4());
              		
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
    // $ANTLR end "ruleDListItem"


    // $ANTLR start "entryRuleDListContent"
    // InternalSVR.g:1030:1: entryRuleDListContent returns [EObject current=null] : iv_ruleDListContent= ruleDListContent EOF ;
    public final EObject entryRuleDListContent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDListContent = null;


        try {
            // InternalSVR.g:1030:53: (iv_ruleDListContent= ruleDListContent EOF )
            // InternalSVR.g:1031:2: iv_ruleDListContent= ruleDListContent EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDListContentRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleDListContent=ruleDListContent();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDListContent; 
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
    // $ANTLR end "entryRuleDListContent"


    // $ANTLR start "ruleDListContent"
    // InternalSVR.g:1037:1: ruleDListContent returns [EObject current=null] : (this_DItemize_0= ruleDItemize | this_DEnumerate_1= ruleDEnumerate ) ;
    public final EObject ruleDListContent() throws RecognitionException {
        EObject current = null;

        EObject this_DItemize_0 = null;

        EObject this_DEnumerate_1 = null;



        	enterRule();

        try {
            // InternalSVR.g:1043:2: ( (this_DItemize_0= ruleDItemize | this_DEnumerate_1= ruleDEnumerate ) )
            // InternalSVR.g:1044:2: (this_DItemize_0= ruleDItemize | this_DEnumerate_1= ruleDEnumerate )
            {
            // InternalSVR.g:1044:2: (this_DItemize_0= ruleDItemize | this_DEnumerate_1= ruleDEnumerate )
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==45) ) {
                alt16=1;
            }
            else if ( (LA16_0==47) ) {
                alt16=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }
            switch (alt16) {
                case 1 :
                    // InternalSVR.g:1045:3: this_DItemize_0= ruleDItemize
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getDListContentAccess().getDItemizeParserRuleCall_0());
                      		
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_DItemize_0=ruleDItemize();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_DItemize_0;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalSVR.g:1057:3: this_DEnumerate_1= ruleDEnumerate
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getDListContentAccess().getDEnumerateParserRuleCall_1());
                      		
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_DEnumerate_1=ruleDEnumerate();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_DEnumerate_1;
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
    // $ANTLR end "ruleDListContent"


    // $ANTLR start "entryRuleDItemize"
    // InternalSVR.g:1072:1: entryRuleDItemize returns [EObject current=null] : iv_ruleDItemize= ruleDItemize EOF ;
    public final EObject entryRuleDItemize() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDItemize = null;


        try {
            // InternalSVR.g:1072:49: (iv_ruleDItemize= ruleDItemize EOF )
            // InternalSVR.g:1073:2: iv_ruleDItemize= ruleDItemize EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDItemizeRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleDItemize=ruleDItemize();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDItemize; 
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
    // $ANTLR end "entryRuleDItemize"


    // $ANTLR start "ruleDItemize"
    // InternalSVR.g:1079:1: ruleDItemize returns [EObject current=null] : (otherlv_0= '<itemize' (otherlv_1= 'name=' ( (lv_name_2_0= RULE_STRING ) ) )? (otherlv_3= 'alignment=' ( (lv_alignment_4_0= ruleDAlignment ) ) )? (otherlv_5= 'style=' ( (lv_style_6_0= RULE_STRING ) ) )? (otherlv_7= 'indent=' ( (lv_indent_8_0= RULE_REAL_STRING ) ) )? otherlv_9= '>' ( (lv_items_10_0= ruleDListItem ) )+ otherlv_11= '</itemize>' ) ;
    public final EObject ruleDItemize() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token lv_style_6_0=null;
        Token otherlv_7=null;
        Token lv_indent_8_0=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Enumerator lv_alignment_4_0 = null;

        EObject lv_items_10_0 = null;



        	enterRule();

        try {
            // InternalSVR.g:1085:2: ( (otherlv_0= '<itemize' (otherlv_1= 'name=' ( (lv_name_2_0= RULE_STRING ) ) )? (otherlv_3= 'alignment=' ( (lv_alignment_4_0= ruleDAlignment ) ) )? (otherlv_5= 'style=' ( (lv_style_6_0= RULE_STRING ) ) )? (otherlv_7= 'indent=' ( (lv_indent_8_0= RULE_REAL_STRING ) ) )? otherlv_9= '>' ( (lv_items_10_0= ruleDListItem ) )+ otherlv_11= '</itemize>' ) )
            // InternalSVR.g:1086:2: (otherlv_0= '<itemize' (otherlv_1= 'name=' ( (lv_name_2_0= RULE_STRING ) ) )? (otherlv_3= 'alignment=' ( (lv_alignment_4_0= ruleDAlignment ) ) )? (otherlv_5= 'style=' ( (lv_style_6_0= RULE_STRING ) ) )? (otherlv_7= 'indent=' ( (lv_indent_8_0= RULE_REAL_STRING ) ) )? otherlv_9= '>' ( (lv_items_10_0= ruleDListItem ) )+ otherlv_11= '</itemize>' )
            {
            // InternalSVR.g:1086:2: (otherlv_0= '<itemize' (otherlv_1= 'name=' ( (lv_name_2_0= RULE_STRING ) ) )? (otherlv_3= 'alignment=' ( (lv_alignment_4_0= ruleDAlignment ) ) )? (otherlv_5= 'style=' ( (lv_style_6_0= RULE_STRING ) ) )? (otherlv_7= 'indent=' ( (lv_indent_8_0= RULE_REAL_STRING ) ) )? otherlv_9= '>' ( (lv_items_10_0= ruleDListItem ) )+ otherlv_11= '</itemize>' )
            // InternalSVR.g:1087:3: otherlv_0= '<itemize' (otherlv_1= 'name=' ( (lv_name_2_0= RULE_STRING ) ) )? (otherlv_3= 'alignment=' ( (lv_alignment_4_0= ruleDAlignment ) ) )? (otherlv_5= 'style=' ( (lv_style_6_0= RULE_STRING ) ) )? (otherlv_7= 'indent=' ( (lv_indent_8_0= RULE_REAL_STRING ) ) )? otherlv_9= '>' ( (lv_items_10_0= ruleDListItem ) )+ otherlv_11= '</itemize>'
            {
            otherlv_0=(Token)match(input,45,FollowSets000.FOLLOW_25); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getDItemizeAccess().getItemizeKeyword_0());
              		
            }
            // InternalSVR.g:1091:3: (otherlv_1= 'name=' ( (lv_name_2_0= RULE_STRING ) ) )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==17) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalSVR.g:1092:4: otherlv_1= 'name=' ( (lv_name_2_0= RULE_STRING ) )
                    {
                    otherlv_1=(Token)match(input,17,FollowSets000.FOLLOW_4); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_1, grammarAccess.getDItemizeAccess().getNameKeyword_1_0());
                      			
                    }
                    // InternalSVR.g:1096:4: ( (lv_name_2_0= RULE_STRING ) )
                    // InternalSVR.g:1097:5: (lv_name_2_0= RULE_STRING )
                    {
                    // InternalSVR.g:1097:5: (lv_name_2_0= RULE_STRING )
                    // InternalSVR.g:1098:6: lv_name_2_0= RULE_STRING
                    {
                    lv_name_2_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_26); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_name_2_0, grammarAccess.getDItemizeAccess().getNameSTRINGTerminalRuleCall_1_1_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getDItemizeRule());
                      						}
                      						setWithLastConsumed(
                      							current,
                      							"name",
                      							lv_name_2_0,
                      							"org.eclipse.xtext.common.Terminals.STRING");
                      					
                    }

                    }


                    }


                    }
                    break;

            }

            // InternalSVR.g:1115:3: (otherlv_3= 'alignment=' ( (lv_alignment_4_0= ruleDAlignment ) ) )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==37) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalSVR.g:1116:4: otherlv_3= 'alignment=' ( (lv_alignment_4_0= ruleDAlignment ) )
                    {
                    otherlv_3=(Token)match(input,37,FollowSets000.FOLLOW_27); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_3, grammarAccess.getDItemizeAccess().getAlignmentKeyword_2_0());
                      			
                    }
                    // InternalSVR.g:1120:4: ( (lv_alignment_4_0= ruleDAlignment ) )
                    // InternalSVR.g:1121:5: (lv_alignment_4_0= ruleDAlignment )
                    {
                    // InternalSVR.g:1121:5: (lv_alignment_4_0= ruleDAlignment )
                    // InternalSVR.g:1122:6: lv_alignment_4_0= ruleDAlignment
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getDItemizeAccess().getAlignmentDAlignmentEnumRuleCall_2_1_0());
                      					
                    }
                    pushFollow(FollowSets000.FOLLOW_28);
                    lv_alignment_4_0=ruleDAlignment();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getDItemizeRule());
                      						}
                      						set(
                      							current,
                      							"alignment",
                      							lv_alignment_4_0,
                      							"es.uah.aut.srg.micobs.svm.lang.svr.SVR.DAlignment");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }
                    break;

            }

            // InternalSVR.g:1140:3: (otherlv_5= 'style=' ( (lv_style_6_0= RULE_STRING ) ) )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==38) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalSVR.g:1141:4: otherlv_5= 'style=' ( (lv_style_6_0= RULE_STRING ) )
                    {
                    otherlv_5=(Token)match(input,38,FollowSets000.FOLLOW_4); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_5, grammarAccess.getDItemizeAccess().getStyleKeyword_3_0());
                      			
                    }
                    // InternalSVR.g:1145:4: ( (lv_style_6_0= RULE_STRING ) )
                    // InternalSVR.g:1146:5: (lv_style_6_0= RULE_STRING )
                    {
                    // InternalSVR.g:1146:5: (lv_style_6_0= RULE_STRING )
                    // InternalSVR.g:1147:6: lv_style_6_0= RULE_STRING
                    {
                    lv_style_6_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_29); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_style_6_0, grammarAccess.getDItemizeAccess().getStyleSTRINGTerminalRuleCall_3_1_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getDItemizeRule());
                      						}
                      						setWithLastConsumed(
                      							current,
                      							"style",
                      							lv_style_6_0,
                      							"org.eclipse.xtext.common.Terminals.STRING");
                      					
                    }

                    }


                    }


                    }
                    break;

            }

            // InternalSVR.g:1164:3: (otherlv_7= 'indent=' ( (lv_indent_8_0= RULE_REAL_STRING ) ) )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==39) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalSVR.g:1165:4: otherlv_7= 'indent=' ( (lv_indent_8_0= RULE_REAL_STRING ) )
                    {
                    otherlv_7=(Token)match(input,39,FollowSets000.FOLLOW_30); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_7, grammarAccess.getDItemizeAccess().getIndentKeyword_4_0());
                      			
                    }
                    // InternalSVR.g:1169:4: ( (lv_indent_8_0= RULE_REAL_STRING ) )
                    // InternalSVR.g:1170:5: (lv_indent_8_0= RULE_REAL_STRING )
                    {
                    // InternalSVR.g:1170:5: (lv_indent_8_0= RULE_REAL_STRING )
                    // InternalSVR.g:1171:6: lv_indent_8_0= RULE_REAL_STRING
                    {
                    lv_indent_8_0=(Token)match(input,RULE_REAL_STRING,FollowSets000.FOLLOW_10); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_indent_8_0, grammarAccess.getDItemizeAccess().getIndentREAL_STRINGTerminalRuleCall_4_1_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getDItemizeRule());
                      						}
                      						setWithLastConsumed(
                      							current,
                      							"indent",
                      							lv_indent_8_0,
                      							"es.uah.aut.srg.micobs.svm.lang.svr.SVR.REAL_STRING");
                      					
                    }

                    }


                    }


                    }
                    break;

            }

            otherlv_9=(Token)match(input,22,FollowSets000.FOLLOW_38); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_9, grammarAccess.getDItemizeAccess().getGreaterThanSignKeyword_5());
              		
            }
            // InternalSVR.g:1192:3: ( (lv_items_10_0= ruleDListItem ) )+
            int cnt21=0;
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==41) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // InternalSVR.g:1193:4: (lv_items_10_0= ruleDListItem )
            	    {
            	    // InternalSVR.g:1193:4: (lv_items_10_0= ruleDListItem )
            	    // InternalSVR.g:1194:5: lv_items_10_0= ruleDListItem
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getDItemizeAccess().getItemsDListItemParserRuleCall_6_0());
            	      				
            	    }
            	    pushFollow(FollowSets000.FOLLOW_39);
            	    lv_items_10_0=ruleDListItem();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getDItemizeRule());
            	      					}
            	      					add(
            	      						current,
            	      						"items",
            	      						lv_items_10_0,
            	      						"es.uah.aut.srg.micobs.svm.lang.svr.SVR.DListItem");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt21 >= 1 ) break loop21;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(21, input);
                        throw eee;
                }
                cnt21++;
            } while (true);

            otherlv_11=(Token)match(input,46,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_11, grammarAccess.getDItemizeAccess().getItemizeKeyword_7());
              		
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
    // $ANTLR end "ruleDItemize"


    // $ANTLR start "entryRuleDEnumerate"
    // InternalSVR.g:1219:1: entryRuleDEnumerate returns [EObject current=null] : iv_ruleDEnumerate= ruleDEnumerate EOF ;
    public final EObject entryRuleDEnumerate() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDEnumerate = null;


        try {
            // InternalSVR.g:1219:51: (iv_ruleDEnumerate= ruleDEnumerate EOF )
            // InternalSVR.g:1220:2: iv_ruleDEnumerate= ruleDEnumerate EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDEnumerateRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleDEnumerate=ruleDEnumerate();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDEnumerate; 
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
    // $ANTLR end "entryRuleDEnumerate"


    // $ANTLR start "ruleDEnumerate"
    // InternalSVR.g:1226:1: ruleDEnumerate returns [EObject current=null] : (otherlv_0= '<enumerate' (otherlv_1= 'name=' ( (lv_name_2_0= RULE_STRING ) ) )? (otherlv_3= 'alignment=' ( (lv_alignment_4_0= ruleDAlignment ) ) )? (otherlv_5= 'style=' ( (lv_style_6_0= RULE_STRING ) ) )? (otherlv_7= 'indent=' ( (lv_indent_8_0= RULE_REAL_STRING ) ) )? otherlv_9= '>' ( (lv_items_10_0= ruleDListItem ) )+ otherlv_11= '</enumerate>' ) ;
    public final EObject ruleDEnumerate() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token lv_style_6_0=null;
        Token otherlv_7=null;
        Token lv_indent_8_0=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Enumerator lv_alignment_4_0 = null;

        EObject lv_items_10_0 = null;



        	enterRule();

        try {
            // InternalSVR.g:1232:2: ( (otherlv_0= '<enumerate' (otherlv_1= 'name=' ( (lv_name_2_0= RULE_STRING ) ) )? (otherlv_3= 'alignment=' ( (lv_alignment_4_0= ruleDAlignment ) ) )? (otherlv_5= 'style=' ( (lv_style_6_0= RULE_STRING ) ) )? (otherlv_7= 'indent=' ( (lv_indent_8_0= RULE_REAL_STRING ) ) )? otherlv_9= '>' ( (lv_items_10_0= ruleDListItem ) )+ otherlv_11= '</enumerate>' ) )
            // InternalSVR.g:1233:2: (otherlv_0= '<enumerate' (otherlv_1= 'name=' ( (lv_name_2_0= RULE_STRING ) ) )? (otherlv_3= 'alignment=' ( (lv_alignment_4_0= ruleDAlignment ) ) )? (otherlv_5= 'style=' ( (lv_style_6_0= RULE_STRING ) ) )? (otherlv_7= 'indent=' ( (lv_indent_8_0= RULE_REAL_STRING ) ) )? otherlv_9= '>' ( (lv_items_10_0= ruleDListItem ) )+ otherlv_11= '</enumerate>' )
            {
            // InternalSVR.g:1233:2: (otherlv_0= '<enumerate' (otherlv_1= 'name=' ( (lv_name_2_0= RULE_STRING ) ) )? (otherlv_3= 'alignment=' ( (lv_alignment_4_0= ruleDAlignment ) ) )? (otherlv_5= 'style=' ( (lv_style_6_0= RULE_STRING ) ) )? (otherlv_7= 'indent=' ( (lv_indent_8_0= RULE_REAL_STRING ) ) )? otherlv_9= '>' ( (lv_items_10_0= ruleDListItem ) )+ otherlv_11= '</enumerate>' )
            // InternalSVR.g:1234:3: otherlv_0= '<enumerate' (otherlv_1= 'name=' ( (lv_name_2_0= RULE_STRING ) ) )? (otherlv_3= 'alignment=' ( (lv_alignment_4_0= ruleDAlignment ) ) )? (otherlv_5= 'style=' ( (lv_style_6_0= RULE_STRING ) ) )? (otherlv_7= 'indent=' ( (lv_indent_8_0= RULE_REAL_STRING ) ) )? otherlv_9= '>' ( (lv_items_10_0= ruleDListItem ) )+ otherlv_11= '</enumerate>'
            {
            otherlv_0=(Token)match(input,47,FollowSets000.FOLLOW_25); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getDEnumerateAccess().getEnumerateKeyword_0());
              		
            }
            // InternalSVR.g:1238:3: (otherlv_1= 'name=' ( (lv_name_2_0= RULE_STRING ) ) )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==17) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalSVR.g:1239:4: otherlv_1= 'name=' ( (lv_name_2_0= RULE_STRING ) )
                    {
                    otherlv_1=(Token)match(input,17,FollowSets000.FOLLOW_4); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_1, grammarAccess.getDEnumerateAccess().getNameKeyword_1_0());
                      			
                    }
                    // InternalSVR.g:1243:4: ( (lv_name_2_0= RULE_STRING ) )
                    // InternalSVR.g:1244:5: (lv_name_2_0= RULE_STRING )
                    {
                    // InternalSVR.g:1244:5: (lv_name_2_0= RULE_STRING )
                    // InternalSVR.g:1245:6: lv_name_2_0= RULE_STRING
                    {
                    lv_name_2_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_26); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_name_2_0, grammarAccess.getDEnumerateAccess().getNameSTRINGTerminalRuleCall_1_1_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getDEnumerateRule());
                      						}
                      						setWithLastConsumed(
                      							current,
                      							"name",
                      							lv_name_2_0,
                      							"org.eclipse.xtext.common.Terminals.STRING");
                      					
                    }

                    }


                    }


                    }
                    break;

            }

            // InternalSVR.g:1262:3: (otherlv_3= 'alignment=' ( (lv_alignment_4_0= ruleDAlignment ) ) )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==37) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalSVR.g:1263:4: otherlv_3= 'alignment=' ( (lv_alignment_4_0= ruleDAlignment ) )
                    {
                    otherlv_3=(Token)match(input,37,FollowSets000.FOLLOW_27); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_3, grammarAccess.getDEnumerateAccess().getAlignmentKeyword_2_0());
                      			
                    }
                    // InternalSVR.g:1267:4: ( (lv_alignment_4_0= ruleDAlignment ) )
                    // InternalSVR.g:1268:5: (lv_alignment_4_0= ruleDAlignment )
                    {
                    // InternalSVR.g:1268:5: (lv_alignment_4_0= ruleDAlignment )
                    // InternalSVR.g:1269:6: lv_alignment_4_0= ruleDAlignment
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getDEnumerateAccess().getAlignmentDAlignmentEnumRuleCall_2_1_0());
                      					
                    }
                    pushFollow(FollowSets000.FOLLOW_28);
                    lv_alignment_4_0=ruleDAlignment();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getDEnumerateRule());
                      						}
                      						set(
                      							current,
                      							"alignment",
                      							lv_alignment_4_0,
                      							"es.uah.aut.srg.micobs.svm.lang.svr.SVR.DAlignment");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }
                    break;

            }

            // InternalSVR.g:1287:3: (otherlv_5= 'style=' ( (lv_style_6_0= RULE_STRING ) ) )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==38) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalSVR.g:1288:4: otherlv_5= 'style=' ( (lv_style_6_0= RULE_STRING ) )
                    {
                    otherlv_5=(Token)match(input,38,FollowSets000.FOLLOW_4); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_5, grammarAccess.getDEnumerateAccess().getStyleKeyword_3_0());
                      			
                    }
                    // InternalSVR.g:1292:4: ( (lv_style_6_0= RULE_STRING ) )
                    // InternalSVR.g:1293:5: (lv_style_6_0= RULE_STRING )
                    {
                    // InternalSVR.g:1293:5: (lv_style_6_0= RULE_STRING )
                    // InternalSVR.g:1294:6: lv_style_6_0= RULE_STRING
                    {
                    lv_style_6_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_29); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_style_6_0, grammarAccess.getDEnumerateAccess().getStyleSTRINGTerminalRuleCall_3_1_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getDEnumerateRule());
                      						}
                      						setWithLastConsumed(
                      							current,
                      							"style",
                      							lv_style_6_0,
                      							"org.eclipse.xtext.common.Terminals.STRING");
                      					
                    }

                    }


                    }


                    }
                    break;

            }

            // InternalSVR.g:1311:3: (otherlv_7= 'indent=' ( (lv_indent_8_0= RULE_REAL_STRING ) ) )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==39) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalSVR.g:1312:4: otherlv_7= 'indent=' ( (lv_indent_8_0= RULE_REAL_STRING ) )
                    {
                    otherlv_7=(Token)match(input,39,FollowSets000.FOLLOW_30); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_7, grammarAccess.getDEnumerateAccess().getIndentKeyword_4_0());
                      			
                    }
                    // InternalSVR.g:1316:4: ( (lv_indent_8_0= RULE_REAL_STRING ) )
                    // InternalSVR.g:1317:5: (lv_indent_8_0= RULE_REAL_STRING )
                    {
                    // InternalSVR.g:1317:5: (lv_indent_8_0= RULE_REAL_STRING )
                    // InternalSVR.g:1318:6: lv_indent_8_0= RULE_REAL_STRING
                    {
                    lv_indent_8_0=(Token)match(input,RULE_REAL_STRING,FollowSets000.FOLLOW_10); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_indent_8_0, grammarAccess.getDEnumerateAccess().getIndentREAL_STRINGTerminalRuleCall_4_1_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getDEnumerateRule());
                      						}
                      						setWithLastConsumed(
                      							current,
                      							"indent",
                      							lv_indent_8_0,
                      							"es.uah.aut.srg.micobs.svm.lang.svr.SVR.REAL_STRING");
                      					
                    }

                    }


                    }


                    }
                    break;

            }

            otherlv_9=(Token)match(input,22,FollowSets000.FOLLOW_38); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_9, grammarAccess.getDEnumerateAccess().getGreaterThanSignKeyword_5());
              		
            }
            // InternalSVR.g:1339:3: ( (lv_items_10_0= ruleDListItem ) )+
            int cnt26=0;
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==41) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // InternalSVR.g:1340:4: (lv_items_10_0= ruleDListItem )
            	    {
            	    // InternalSVR.g:1340:4: (lv_items_10_0= ruleDListItem )
            	    // InternalSVR.g:1341:5: lv_items_10_0= ruleDListItem
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getDEnumerateAccess().getItemsDListItemParserRuleCall_6_0());
            	      				
            	    }
            	    pushFollow(FollowSets000.FOLLOW_40);
            	    lv_items_10_0=ruleDListItem();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getDEnumerateRule());
            	      					}
            	      					add(
            	      						current,
            	      						"items",
            	      						lv_items_10_0,
            	      						"es.uah.aut.srg.micobs.svm.lang.svr.SVR.DListItem");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt26 >= 1 ) break loop26;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(26, input);
                        throw eee;
                }
                cnt26++;
            } while (true);

            otherlv_11=(Token)match(input,48,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_11, grammarAccess.getDEnumerateAccess().getEnumerateKeyword_7());
              		
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
    // $ANTLR end "ruleDEnumerate"


    // $ANTLR start "entryRuleDParagraphContent"
    // InternalSVR.g:1366:1: entryRuleDParagraphContent returns [EObject current=null] : iv_ruleDParagraphContent= ruleDParagraphContent EOF ;
    public final EObject entryRuleDParagraphContent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDParagraphContent = null;


        try {
            // InternalSVR.g:1366:58: (iv_ruleDParagraphContent= ruleDParagraphContent EOF )
            // InternalSVR.g:1367:2: iv_ruleDParagraphContent= ruleDParagraphContent EOF
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
    // InternalSVR.g:1373:1: ruleDParagraphContent returns [EObject current=null] : (this_DRun_0= ruleDRun | this_DHyperlink_1= ruleDHyperlink ) ;
    public final EObject ruleDParagraphContent() throws RecognitionException {
        EObject current = null;

        EObject this_DRun_0 = null;

        EObject this_DHyperlink_1 = null;



        	enterRule();

        try {
            // InternalSVR.g:1379:2: ( (this_DRun_0= ruleDRun | this_DHyperlink_1= ruleDHyperlink ) )
            // InternalSVR.g:1380:2: (this_DRun_0= ruleDRun | this_DHyperlink_1= ruleDHyperlink )
            {
            // InternalSVR.g:1380:2: (this_DRun_0= ruleDRun | this_DHyperlink_1= ruleDHyperlink )
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==49) ) {
                alt27=1;
            }
            else if ( (LA27_0==55) ) {
                alt27=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 27, 0, input);

                throw nvae;
            }
            switch (alt27) {
                case 1 :
                    // InternalSVR.g:1381:3: this_DRun_0= ruleDRun
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getDParagraphContentAccess().getDRunParserRuleCall_0());
                      		
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
                    break;
                case 2 :
                    // InternalSVR.g:1393:3: this_DHyperlink_1= ruleDHyperlink
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getDParagraphContentAccess().getDHyperlinkParserRuleCall_1());
                      		
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_DHyperlink_1=ruleDHyperlink();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_DHyperlink_1;
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
    // $ANTLR end "ruleDParagraphContent"


    // $ANTLR start "entryRuleDRun"
    // InternalSVR.g:1408:1: entryRuleDRun returns [EObject current=null] : iv_ruleDRun= ruleDRun EOF ;
    public final EObject entryRuleDRun() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDRun = null;


        try {
            // InternalSVR.g:1408:45: (iv_ruleDRun= ruleDRun EOF )
            // InternalSVR.g:1409:2: iv_ruleDRun= ruleDRun EOF
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
    // InternalSVR.g:1415:1: ruleDRun returns [EObject current=null] : (otherlv_0= '<run' (otherlv_1= 'bold=' ( (lv_bold_2_0= ruleDRunAttributes ) ) )? (otherlv_3= 'italics=' ( (lv_italics_4_0= ruleDRunAttributes ) ) )? (otherlv_5= 'underline=' ( (lv_underline_6_0= ruleDRunAttributes ) ) )? (otherlv_7= 'color=' ( (lv_color_8_0= RULE_STRING ) ) )? otherlv_9= '>' ( (lv_tab_10_0= ruleDTab ) )? ( (lv_text_11_0= ruleDText ) ) otherlv_12= '</run>' ) ;
    public final EObject ruleDRun() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token lv_color_8_0=null;
        Token otherlv_9=null;
        Token otherlv_12=null;
        Enumerator lv_bold_2_0 = null;

        Enumerator lv_italics_4_0 = null;

        Enumerator lv_underline_6_0 = null;

        EObject lv_tab_10_0 = null;

        EObject lv_text_11_0 = null;



        	enterRule();

        try {
            // InternalSVR.g:1421:2: ( (otherlv_0= '<run' (otherlv_1= 'bold=' ( (lv_bold_2_0= ruleDRunAttributes ) ) )? (otherlv_3= 'italics=' ( (lv_italics_4_0= ruleDRunAttributes ) ) )? (otherlv_5= 'underline=' ( (lv_underline_6_0= ruleDRunAttributes ) ) )? (otherlv_7= 'color=' ( (lv_color_8_0= RULE_STRING ) ) )? otherlv_9= '>' ( (lv_tab_10_0= ruleDTab ) )? ( (lv_text_11_0= ruleDText ) ) otherlv_12= '</run>' ) )
            // InternalSVR.g:1422:2: (otherlv_0= '<run' (otherlv_1= 'bold=' ( (lv_bold_2_0= ruleDRunAttributes ) ) )? (otherlv_3= 'italics=' ( (lv_italics_4_0= ruleDRunAttributes ) ) )? (otherlv_5= 'underline=' ( (lv_underline_6_0= ruleDRunAttributes ) ) )? (otherlv_7= 'color=' ( (lv_color_8_0= RULE_STRING ) ) )? otherlv_9= '>' ( (lv_tab_10_0= ruleDTab ) )? ( (lv_text_11_0= ruleDText ) ) otherlv_12= '</run>' )
            {
            // InternalSVR.g:1422:2: (otherlv_0= '<run' (otherlv_1= 'bold=' ( (lv_bold_2_0= ruleDRunAttributes ) ) )? (otherlv_3= 'italics=' ( (lv_italics_4_0= ruleDRunAttributes ) ) )? (otherlv_5= 'underline=' ( (lv_underline_6_0= ruleDRunAttributes ) ) )? (otherlv_7= 'color=' ( (lv_color_8_0= RULE_STRING ) ) )? otherlv_9= '>' ( (lv_tab_10_0= ruleDTab ) )? ( (lv_text_11_0= ruleDText ) ) otherlv_12= '</run>' )
            // InternalSVR.g:1423:3: otherlv_0= '<run' (otherlv_1= 'bold=' ( (lv_bold_2_0= ruleDRunAttributes ) ) )? (otherlv_3= 'italics=' ( (lv_italics_4_0= ruleDRunAttributes ) ) )? (otherlv_5= 'underline=' ( (lv_underline_6_0= ruleDRunAttributes ) ) )? (otherlv_7= 'color=' ( (lv_color_8_0= RULE_STRING ) ) )? otherlv_9= '>' ( (lv_tab_10_0= ruleDTab ) )? ( (lv_text_11_0= ruleDText ) ) otherlv_12= '</run>'
            {
            otherlv_0=(Token)match(input,49,FollowSets000.FOLLOW_41); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getDRunAccess().getRunKeyword_0());
              		
            }
            // InternalSVR.g:1427:3: (otherlv_1= 'bold=' ( (lv_bold_2_0= ruleDRunAttributes ) ) )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==50) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalSVR.g:1428:4: otherlv_1= 'bold=' ( (lv_bold_2_0= ruleDRunAttributes ) )
                    {
                    otherlv_1=(Token)match(input,50,FollowSets000.FOLLOW_42); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_1, grammarAccess.getDRunAccess().getBoldKeyword_1_0());
                      			
                    }
                    // InternalSVR.g:1432:4: ( (lv_bold_2_0= ruleDRunAttributes ) )
                    // InternalSVR.g:1433:5: (lv_bold_2_0= ruleDRunAttributes )
                    {
                    // InternalSVR.g:1433:5: (lv_bold_2_0= ruleDRunAttributes )
                    // InternalSVR.g:1434:6: lv_bold_2_0= ruleDRunAttributes
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getDRunAccess().getBoldDRunAttributesEnumRuleCall_1_1_0());
                      					
                    }
                    pushFollow(FollowSets000.FOLLOW_43);
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
                      							"es.uah.aut.srg.micobs.svm.lang.svr.SVR.DRunAttributes");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }
                    break;

            }

            // InternalSVR.g:1452:3: (otherlv_3= 'italics=' ( (lv_italics_4_0= ruleDRunAttributes ) ) )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==51) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalSVR.g:1453:4: otherlv_3= 'italics=' ( (lv_italics_4_0= ruleDRunAttributes ) )
                    {
                    otherlv_3=(Token)match(input,51,FollowSets000.FOLLOW_42); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_3, grammarAccess.getDRunAccess().getItalicsKeyword_2_0());
                      			
                    }
                    // InternalSVR.g:1457:4: ( (lv_italics_4_0= ruleDRunAttributes ) )
                    // InternalSVR.g:1458:5: (lv_italics_4_0= ruleDRunAttributes )
                    {
                    // InternalSVR.g:1458:5: (lv_italics_4_0= ruleDRunAttributes )
                    // InternalSVR.g:1459:6: lv_italics_4_0= ruleDRunAttributes
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getDRunAccess().getItalicsDRunAttributesEnumRuleCall_2_1_0());
                      					
                    }
                    pushFollow(FollowSets000.FOLLOW_44);
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
                      							"es.uah.aut.srg.micobs.svm.lang.svr.SVR.DRunAttributes");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }
                    break;

            }

            // InternalSVR.g:1477:3: (otherlv_5= 'underline=' ( (lv_underline_6_0= ruleDRunAttributes ) ) )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==52) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalSVR.g:1478:4: otherlv_5= 'underline=' ( (lv_underline_6_0= ruleDRunAttributes ) )
                    {
                    otherlv_5=(Token)match(input,52,FollowSets000.FOLLOW_42); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_5, grammarAccess.getDRunAccess().getUnderlineKeyword_3_0());
                      			
                    }
                    // InternalSVR.g:1482:4: ( (lv_underline_6_0= ruleDRunAttributes ) )
                    // InternalSVR.g:1483:5: (lv_underline_6_0= ruleDRunAttributes )
                    {
                    // InternalSVR.g:1483:5: (lv_underline_6_0= ruleDRunAttributes )
                    // InternalSVR.g:1484:6: lv_underline_6_0= ruleDRunAttributes
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getDRunAccess().getUnderlineDRunAttributesEnumRuleCall_3_1_0());
                      					
                    }
                    pushFollow(FollowSets000.FOLLOW_45);
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
                      							"es.uah.aut.srg.micobs.svm.lang.svr.SVR.DRunAttributes");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }
                    break;

            }

            // InternalSVR.g:1502:3: (otherlv_7= 'color=' ( (lv_color_8_0= RULE_STRING ) ) )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==53) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // InternalSVR.g:1503:4: otherlv_7= 'color=' ( (lv_color_8_0= RULE_STRING ) )
                    {
                    otherlv_7=(Token)match(input,53,FollowSets000.FOLLOW_4); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_7, grammarAccess.getDRunAccess().getColorKeyword_4_0());
                      			
                    }
                    // InternalSVR.g:1507:4: ( (lv_color_8_0= RULE_STRING ) )
                    // InternalSVR.g:1508:5: (lv_color_8_0= RULE_STRING )
                    {
                    // InternalSVR.g:1508:5: (lv_color_8_0= RULE_STRING )
                    // InternalSVR.g:1509:6: lv_color_8_0= RULE_STRING
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

            otherlv_9=(Token)match(input,22,FollowSets000.FOLLOW_46); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_9, grammarAccess.getDRunAccess().getGreaterThanSignKeyword_5());
              		
            }
            // InternalSVR.g:1530:3: ( (lv_tab_10_0= ruleDTab ) )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==58) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // InternalSVR.g:1531:4: (lv_tab_10_0= ruleDTab )
                    {
                    // InternalSVR.g:1531:4: (lv_tab_10_0= ruleDTab )
                    // InternalSVR.g:1532:5: lv_tab_10_0= ruleDTab
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getDRunAccess().getTabDTabParserRuleCall_6_0());
                      				
                    }
                    pushFollow(FollowSets000.FOLLOW_46);
                    lv_tab_10_0=ruleDTab();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getDRunRule());
                      					}
                      					set(
                      						current,
                      						"tab",
                      						lv_tab_10_0,
                      						"es.uah.aut.srg.micobs.svm.lang.svr.SVR.DTab");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }
                    break;

            }

            // InternalSVR.g:1549:3: ( (lv_text_11_0= ruleDText ) )
            // InternalSVR.g:1550:4: (lv_text_11_0= ruleDText )
            {
            // InternalSVR.g:1550:4: (lv_text_11_0= ruleDText )
            // InternalSVR.g:1551:5: lv_text_11_0= ruleDText
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getDRunAccess().getTextDTextParserRuleCall_7_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_47);
            lv_text_11_0=ruleDText();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getDRunRule());
              					}
              					set(
              						current,
              						"text",
              						lv_text_11_0,
              						"es.uah.aut.srg.micobs.svm.lang.svr.SVR.DText");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_12=(Token)match(input,54,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_12, grammarAccess.getDRunAccess().getRunKeyword_8());
              		
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


    // $ANTLR start "entryRuleDHyperlink"
    // InternalSVR.g:1576:1: entryRuleDHyperlink returns [EObject current=null] : iv_ruleDHyperlink= ruleDHyperlink EOF ;
    public final EObject entryRuleDHyperlink() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDHyperlink = null;


        try {
            // InternalSVR.g:1576:51: (iv_ruleDHyperlink= ruleDHyperlink EOF )
            // InternalSVR.g:1577:2: iv_ruleDHyperlink= ruleDHyperlink EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDHyperlinkRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleDHyperlink=ruleDHyperlink();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDHyperlink; 
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
    // $ANTLR end "entryRuleDHyperlink"


    // $ANTLR start "ruleDHyperlink"
    // InternalSVR.g:1583:1: ruleDHyperlink returns [EObject current=null] : (otherlv_0= '<hyperlink' otherlv_1= 'reference=' ( (otherlv_2= RULE_STRING ) ) ( (otherlv_3= '>' ( (lv_run_4_0= ruleDRun ) ) otherlv_5= '</hyperlink>' ) | otherlv_6= '/>' ) ) ;
    public final EObject ruleDHyperlink() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        EObject lv_run_4_0 = null;



        	enterRule();

        try {
            // InternalSVR.g:1589:2: ( (otherlv_0= '<hyperlink' otherlv_1= 'reference=' ( (otherlv_2= RULE_STRING ) ) ( (otherlv_3= '>' ( (lv_run_4_0= ruleDRun ) ) otherlv_5= '</hyperlink>' ) | otherlv_6= '/>' ) ) )
            // InternalSVR.g:1590:2: (otherlv_0= '<hyperlink' otherlv_1= 'reference=' ( (otherlv_2= RULE_STRING ) ) ( (otherlv_3= '>' ( (lv_run_4_0= ruleDRun ) ) otherlv_5= '</hyperlink>' ) | otherlv_6= '/>' ) )
            {
            // InternalSVR.g:1590:2: (otherlv_0= '<hyperlink' otherlv_1= 'reference=' ( (otherlv_2= RULE_STRING ) ) ( (otherlv_3= '>' ( (lv_run_4_0= ruleDRun ) ) otherlv_5= '</hyperlink>' ) | otherlv_6= '/>' ) )
            // InternalSVR.g:1591:3: otherlv_0= '<hyperlink' otherlv_1= 'reference=' ( (otherlv_2= RULE_STRING ) ) ( (otherlv_3= '>' ( (lv_run_4_0= ruleDRun ) ) otherlv_5= '</hyperlink>' ) | otherlv_6= '/>' )
            {
            otherlv_0=(Token)match(input,55,FollowSets000.FOLLOW_48); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getDHyperlinkAccess().getHyperlinkKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,56,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getDHyperlinkAccess().getReferenceKeyword_1());
              		
            }
            // InternalSVR.g:1599:3: ( (otherlv_2= RULE_STRING ) )
            // InternalSVR.g:1600:4: (otherlv_2= RULE_STRING )
            {
            // InternalSVR.g:1600:4: (otherlv_2= RULE_STRING )
            // InternalSVR.g:1601:5: otherlv_2= RULE_STRING
            {
            if ( state.backtracking==0 ) {

              					/* */
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getDHyperlinkRule());
              					}
              				
            }
            otherlv_2=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_49); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(otherlv_2, grammarAccess.getDHyperlinkAccess().getReferenceDReferenceableObjectCrossReference_2_0());
              				
            }

            }


            }

            // InternalSVR.g:1615:3: ( (otherlv_3= '>' ( (lv_run_4_0= ruleDRun ) ) otherlv_5= '</hyperlink>' ) | otherlv_6= '/>' )
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==22) ) {
                alt33=1;
            }
            else if ( (LA33_0==24) ) {
                alt33=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 33, 0, input);

                throw nvae;
            }
            switch (alt33) {
                case 1 :
                    // InternalSVR.g:1616:4: (otherlv_3= '>' ( (lv_run_4_0= ruleDRun ) ) otherlv_5= '</hyperlink>' )
                    {
                    // InternalSVR.g:1616:4: (otherlv_3= '>' ( (lv_run_4_0= ruleDRun ) ) otherlv_5= '</hyperlink>' )
                    // InternalSVR.g:1617:5: otherlv_3= '>' ( (lv_run_4_0= ruleDRun ) ) otherlv_5= '</hyperlink>'
                    {
                    otherlv_3=(Token)match(input,22,FollowSets000.FOLLOW_50); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_3, grammarAccess.getDHyperlinkAccess().getGreaterThanSignKeyword_3_0_0());
                      				
                    }
                    // InternalSVR.g:1621:5: ( (lv_run_4_0= ruleDRun ) )
                    // InternalSVR.g:1622:6: (lv_run_4_0= ruleDRun )
                    {
                    // InternalSVR.g:1622:6: (lv_run_4_0= ruleDRun )
                    // InternalSVR.g:1623:7: lv_run_4_0= ruleDRun
                    {
                    if ( state.backtracking==0 ) {

                      							newCompositeNode(grammarAccess.getDHyperlinkAccess().getRunDRunParserRuleCall_3_0_1_0());
                      						
                    }
                    pushFollow(FollowSets000.FOLLOW_51);
                    lv_run_4_0=ruleDRun();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      							if (current==null) {
                      								current = createModelElementForParent(grammarAccess.getDHyperlinkRule());
                      							}
                      							set(
                      								current,
                      								"run",
                      								lv_run_4_0,
                      								"es.uah.aut.srg.micobs.svm.lang.svr.SVR.DRun");
                      							afterParserOrEnumRuleCall();
                      						
                    }

                    }


                    }

                    otherlv_5=(Token)match(input,57,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_5, grammarAccess.getDHyperlinkAccess().getHyperlinkKeyword_3_0_2());
                      				
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalSVR.g:1646:4: otherlv_6= '/>'
                    {
                    otherlv_6=(Token)match(input,24,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_6, grammarAccess.getDHyperlinkAccess().getSolidusGreaterThanSignKeyword_3_1());
                      			
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
    // $ANTLR end "ruleDHyperlink"


    // $ANTLR start "entryRuleDTab"
    // InternalSVR.g:1655:1: entryRuleDTab returns [EObject current=null] : iv_ruleDTab= ruleDTab EOF ;
    public final EObject entryRuleDTab() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDTab = null;


        try {
            // InternalSVR.g:1655:45: (iv_ruleDTab= ruleDTab EOF )
            // InternalSVR.g:1656:2: iv_ruleDTab= ruleDTab EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDTabRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleDTab=ruleDTab();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDTab; 
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
    // $ANTLR end "entryRuleDTab"


    // $ANTLR start "ruleDTab"
    // InternalSVR.g:1662:1: ruleDTab returns [EObject current=null] : ( () otherlv_1= '<tab/>' ) ;
    public final EObject ruleDTab() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalSVR.g:1668:2: ( ( () otherlv_1= '<tab/>' ) )
            // InternalSVR.g:1669:2: ( () otherlv_1= '<tab/>' )
            {
            // InternalSVR.g:1669:2: ( () otherlv_1= '<tab/>' )
            // InternalSVR.g:1670:3: () otherlv_1= '<tab/>'
            {
            // InternalSVR.g:1670:3: ()
            // InternalSVR.g:1671:4: 
            {
            if ( state.backtracking==0 ) {

              				/* */
              			
            }
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getDTabAccess().getDTabAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,58,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getDTabAccess().getTabKeyword_1());
              		
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
    // $ANTLR end "ruleDTab"


    // $ANTLR start "entryRuleDText"
    // InternalSVR.g:1688:1: entryRuleDText returns [EObject current=null] : iv_ruleDText= ruleDText EOF ;
    public final EObject entryRuleDText() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDText = null;


        try {
            // InternalSVR.g:1688:46: (iv_ruleDText= ruleDText EOF )
            // InternalSVR.g:1689:2: iv_ruleDText= ruleDText EOF
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
    // InternalSVR.g:1695:1: ruleDText returns [EObject current=null] : ( (lv_content_0_0= RULE_RUNTEXT ) ) ;
    public final EObject ruleDText() throws RecognitionException {
        EObject current = null;

        Token lv_content_0_0=null;


        	enterRule();

        try {
            // InternalSVR.g:1701:2: ( ( (lv_content_0_0= RULE_RUNTEXT ) ) )
            // InternalSVR.g:1702:2: ( (lv_content_0_0= RULE_RUNTEXT ) )
            {
            // InternalSVR.g:1702:2: ( (lv_content_0_0= RULE_RUNTEXT ) )
            // InternalSVR.g:1703:3: (lv_content_0_0= RULE_RUNTEXT )
            {
            // InternalSVR.g:1703:3: (lv_content_0_0= RULE_RUNTEXT )
            // InternalSVR.g:1704:4: lv_content_0_0= RULE_RUNTEXT
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
              					"es.uah.aut.srg.micobs.svm.lang.svr.SVR.RUNTEXT");
              			
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


    // $ANTLR start "entryRuleDFigureFromFile"
    // InternalSVR.g:1723:1: entryRuleDFigureFromFile returns [EObject current=null] : iv_ruleDFigureFromFile= ruleDFigureFromFile EOF ;
    public final EObject entryRuleDFigureFromFile() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDFigureFromFile = null;


        try {
            // InternalSVR.g:1723:56: (iv_ruleDFigureFromFile= ruleDFigureFromFile EOF )
            // InternalSVR.g:1724:2: iv_ruleDFigureFromFile= ruleDFigureFromFile EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDFigureFromFileRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleDFigureFromFile=ruleDFigureFromFile();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDFigureFromFile; 
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
    // $ANTLR end "entryRuleDFigureFromFile"


    // $ANTLR start "ruleDFigureFromFile"
    // InternalSVR.g:1730:1: ruleDFigureFromFile returns [EObject current=null] : (otherlv_0= '<figureFromFile' otherlv_1= 'name=' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= 'referenceFile=' ( (lv_referenceFile_4_0= RULE_STRING ) ) otherlv_5= 'width=' ( (lv_width_6_0= RULE_UINT_STRING ) ) otherlv_7= 'height=' ( (lv_height_8_0= RULE_UINT_STRING ) ) (otherlv_9= 'alignment=' ( (lv_alignment_10_0= ruleDAlignment ) ) )? (otherlv_11= 'style=' ( (lv_style_12_0= RULE_STRING ) ) )? (otherlv_13= 'indent=' ( (lv_indent_14_0= RULE_REAL_STRING ) ) )? (otherlv_15= 'caption=' ( (lv_caption_16_0= RULE_STRING ) ) )? otherlv_17= '/>' ) ;
    public final EObject ruleDFigureFromFile() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token lv_referenceFile_4_0=null;
        Token otherlv_5=null;
        Token lv_width_6_0=null;
        Token otherlv_7=null;
        Token lv_height_8_0=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token lv_style_12_0=null;
        Token otherlv_13=null;
        Token lv_indent_14_0=null;
        Token otherlv_15=null;
        Token lv_caption_16_0=null;
        Token otherlv_17=null;
        Enumerator lv_alignment_10_0 = null;



        	enterRule();

        try {
            // InternalSVR.g:1736:2: ( (otherlv_0= '<figureFromFile' otherlv_1= 'name=' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= 'referenceFile=' ( (lv_referenceFile_4_0= RULE_STRING ) ) otherlv_5= 'width=' ( (lv_width_6_0= RULE_UINT_STRING ) ) otherlv_7= 'height=' ( (lv_height_8_0= RULE_UINT_STRING ) ) (otherlv_9= 'alignment=' ( (lv_alignment_10_0= ruleDAlignment ) ) )? (otherlv_11= 'style=' ( (lv_style_12_0= RULE_STRING ) ) )? (otherlv_13= 'indent=' ( (lv_indent_14_0= RULE_REAL_STRING ) ) )? (otherlv_15= 'caption=' ( (lv_caption_16_0= RULE_STRING ) ) )? otherlv_17= '/>' ) )
            // InternalSVR.g:1737:2: (otherlv_0= '<figureFromFile' otherlv_1= 'name=' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= 'referenceFile=' ( (lv_referenceFile_4_0= RULE_STRING ) ) otherlv_5= 'width=' ( (lv_width_6_0= RULE_UINT_STRING ) ) otherlv_7= 'height=' ( (lv_height_8_0= RULE_UINT_STRING ) ) (otherlv_9= 'alignment=' ( (lv_alignment_10_0= ruleDAlignment ) ) )? (otherlv_11= 'style=' ( (lv_style_12_0= RULE_STRING ) ) )? (otherlv_13= 'indent=' ( (lv_indent_14_0= RULE_REAL_STRING ) ) )? (otherlv_15= 'caption=' ( (lv_caption_16_0= RULE_STRING ) ) )? otherlv_17= '/>' )
            {
            // InternalSVR.g:1737:2: (otherlv_0= '<figureFromFile' otherlv_1= 'name=' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= 'referenceFile=' ( (lv_referenceFile_4_0= RULE_STRING ) ) otherlv_5= 'width=' ( (lv_width_6_0= RULE_UINT_STRING ) ) otherlv_7= 'height=' ( (lv_height_8_0= RULE_UINT_STRING ) ) (otherlv_9= 'alignment=' ( (lv_alignment_10_0= ruleDAlignment ) ) )? (otherlv_11= 'style=' ( (lv_style_12_0= RULE_STRING ) ) )? (otherlv_13= 'indent=' ( (lv_indent_14_0= RULE_REAL_STRING ) ) )? (otherlv_15= 'caption=' ( (lv_caption_16_0= RULE_STRING ) ) )? otherlv_17= '/>' )
            // InternalSVR.g:1738:3: otherlv_0= '<figureFromFile' otherlv_1= 'name=' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= 'referenceFile=' ( (lv_referenceFile_4_0= RULE_STRING ) ) otherlv_5= 'width=' ( (lv_width_6_0= RULE_UINT_STRING ) ) otherlv_7= 'height=' ( (lv_height_8_0= RULE_UINT_STRING ) ) (otherlv_9= 'alignment=' ( (lv_alignment_10_0= ruleDAlignment ) ) )? (otherlv_11= 'style=' ( (lv_style_12_0= RULE_STRING ) ) )? (otherlv_13= 'indent=' ( (lv_indent_14_0= RULE_REAL_STRING ) ) )? (otherlv_15= 'caption=' ( (lv_caption_16_0= RULE_STRING ) ) )? otherlv_17= '/>'
            {
            otherlv_0=(Token)match(input,59,FollowSets000.FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getDFigureFromFileAccess().getFigureFromFileKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,17,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getDFigureFromFileAccess().getNameKeyword_1());
              		
            }
            // InternalSVR.g:1746:3: ( (lv_name_2_0= RULE_STRING ) )
            // InternalSVR.g:1747:4: (lv_name_2_0= RULE_STRING )
            {
            // InternalSVR.g:1747:4: (lv_name_2_0= RULE_STRING )
            // InternalSVR.g:1748:5: lv_name_2_0= RULE_STRING
            {
            lv_name_2_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_52); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_2_0, grammarAccess.getDFigureFromFileAccess().getNameSTRINGTerminalRuleCall_2_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getDFigureFromFileRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_2_0,
              						"org.eclipse.xtext.common.Terminals.STRING");
              				
            }

            }


            }

            otherlv_3=(Token)match(input,60,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getDFigureFromFileAccess().getReferenceFileKeyword_3());
              		
            }
            // InternalSVR.g:1768:3: ( (lv_referenceFile_4_0= RULE_STRING ) )
            // InternalSVR.g:1769:4: (lv_referenceFile_4_0= RULE_STRING )
            {
            // InternalSVR.g:1769:4: (lv_referenceFile_4_0= RULE_STRING )
            // InternalSVR.g:1770:5: lv_referenceFile_4_0= RULE_STRING
            {
            lv_referenceFile_4_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_53); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_referenceFile_4_0, grammarAccess.getDFigureFromFileAccess().getReferenceFileSTRINGTerminalRuleCall_4_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getDFigureFromFileRule());
              					}
              					setWithLastConsumed(
              						current,
              						"referenceFile",
              						lv_referenceFile_4_0,
              						"org.eclipse.xtext.common.Terminals.STRING");
              				
            }

            }


            }

            otherlv_5=(Token)match(input,61,FollowSets000.FOLLOW_7); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getDFigureFromFileAccess().getWidthKeyword_5());
              		
            }
            // InternalSVR.g:1790:3: ( (lv_width_6_0= RULE_UINT_STRING ) )
            // InternalSVR.g:1791:4: (lv_width_6_0= RULE_UINT_STRING )
            {
            // InternalSVR.g:1791:4: (lv_width_6_0= RULE_UINT_STRING )
            // InternalSVR.g:1792:5: lv_width_6_0= RULE_UINT_STRING
            {
            lv_width_6_0=(Token)match(input,RULE_UINT_STRING,FollowSets000.FOLLOW_54); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_width_6_0, grammarAccess.getDFigureFromFileAccess().getWidthUINT_STRINGTerminalRuleCall_6_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getDFigureFromFileRule());
              					}
              					setWithLastConsumed(
              						current,
              						"width",
              						lv_width_6_0,
              						"es.uah.aut.srg.micobs.svm.lang.svr.SVR.UINT_STRING");
              				
            }

            }


            }

            otherlv_7=(Token)match(input,62,FollowSets000.FOLLOW_7); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_7, grammarAccess.getDFigureFromFileAccess().getHeightKeyword_7());
              		
            }
            // InternalSVR.g:1812:3: ( (lv_height_8_0= RULE_UINT_STRING ) )
            // InternalSVR.g:1813:4: (lv_height_8_0= RULE_UINT_STRING )
            {
            // InternalSVR.g:1813:4: (lv_height_8_0= RULE_UINT_STRING )
            // InternalSVR.g:1814:5: lv_height_8_0= RULE_UINT_STRING
            {
            lv_height_8_0=(Token)match(input,RULE_UINT_STRING,FollowSets000.FOLLOW_55); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_height_8_0, grammarAccess.getDFigureFromFileAccess().getHeightUINT_STRINGTerminalRuleCall_8_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getDFigureFromFileRule());
              					}
              					setWithLastConsumed(
              						current,
              						"height",
              						lv_height_8_0,
              						"es.uah.aut.srg.micobs.svm.lang.svr.SVR.UINT_STRING");
              				
            }

            }


            }

            // InternalSVR.g:1830:3: (otherlv_9= 'alignment=' ( (lv_alignment_10_0= ruleDAlignment ) ) )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==37) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // InternalSVR.g:1831:4: otherlv_9= 'alignment=' ( (lv_alignment_10_0= ruleDAlignment ) )
                    {
                    otherlv_9=(Token)match(input,37,FollowSets000.FOLLOW_27); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_9, grammarAccess.getDFigureFromFileAccess().getAlignmentKeyword_9_0());
                      			
                    }
                    // InternalSVR.g:1835:4: ( (lv_alignment_10_0= ruleDAlignment ) )
                    // InternalSVR.g:1836:5: (lv_alignment_10_0= ruleDAlignment )
                    {
                    // InternalSVR.g:1836:5: (lv_alignment_10_0= ruleDAlignment )
                    // InternalSVR.g:1837:6: lv_alignment_10_0= ruleDAlignment
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getDFigureFromFileAccess().getAlignmentDAlignmentEnumRuleCall_9_1_0());
                      					
                    }
                    pushFollow(FollowSets000.FOLLOW_56);
                    lv_alignment_10_0=ruleDAlignment();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getDFigureFromFileRule());
                      						}
                      						set(
                      							current,
                      							"alignment",
                      							lv_alignment_10_0,
                      							"es.uah.aut.srg.micobs.svm.lang.svr.SVR.DAlignment");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }
                    break;

            }

            // InternalSVR.g:1855:3: (otherlv_11= 'style=' ( (lv_style_12_0= RULE_STRING ) ) )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==38) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // InternalSVR.g:1856:4: otherlv_11= 'style=' ( (lv_style_12_0= RULE_STRING ) )
                    {
                    otherlv_11=(Token)match(input,38,FollowSets000.FOLLOW_4); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_11, grammarAccess.getDFigureFromFileAccess().getStyleKeyword_10_0());
                      			
                    }
                    // InternalSVR.g:1860:4: ( (lv_style_12_0= RULE_STRING ) )
                    // InternalSVR.g:1861:5: (lv_style_12_0= RULE_STRING )
                    {
                    // InternalSVR.g:1861:5: (lv_style_12_0= RULE_STRING )
                    // InternalSVR.g:1862:6: lv_style_12_0= RULE_STRING
                    {
                    lv_style_12_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_57); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_style_12_0, grammarAccess.getDFigureFromFileAccess().getStyleSTRINGTerminalRuleCall_10_1_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getDFigureFromFileRule());
                      						}
                      						setWithLastConsumed(
                      							current,
                      							"style",
                      							lv_style_12_0,
                      							"org.eclipse.xtext.common.Terminals.STRING");
                      					
                    }

                    }


                    }


                    }
                    break;

            }

            // InternalSVR.g:1879:3: (otherlv_13= 'indent=' ( (lv_indent_14_0= RULE_REAL_STRING ) ) )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==39) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // InternalSVR.g:1880:4: otherlv_13= 'indent=' ( (lv_indent_14_0= RULE_REAL_STRING ) )
                    {
                    otherlv_13=(Token)match(input,39,FollowSets000.FOLLOW_30); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_13, grammarAccess.getDFigureFromFileAccess().getIndentKeyword_11_0());
                      			
                    }
                    // InternalSVR.g:1884:4: ( (lv_indent_14_0= RULE_REAL_STRING ) )
                    // InternalSVR.g:1885:5: (lv_indent_14_0= RULE_REAL_STRING )
                    {
                    // InternalSVR.g:1885:5: (lv_indent_14_0= RULE_REAL_STRING )
                    // InternalSVR.g:1886:6: lv_indent_14_0= RULE_REAL_STRING
                    {
                    lv_indent_14_0=(Token)match(input,RULE_REAL_STRING,FollowSets000.FOLLOW_58); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_indent_14_0, grammarAccess.getDFigureFromFileAccess().getIndentREAL_STRINGTerminalRuleCall_11_1_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getDFigureFromFileRule());
                      						}
                      						setWithLastConsumed(
                      							current,
                      							"indent",
                      							lv_indent_14_0,
                      							"es.uah.aut.srg.micobs.svm.lang.svr.SVR.REAL_STRING");
                      					
                    }

                    }


                    }


                    }
                    break;

            }

            // InternalSVR.g:1903:3: (otherlv_15= 'caption=' ( (lv_caption_16_0= RULE_STRING ) ) )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==63) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // InternalSVR.g:1904:4: otherlv_15= 'caption=' ( (lv_caption_16_0= RULE_STRING ) )
                    {
                    otherlv_15=(Token)match(input,63,FollowSets000.FOLLOW_4); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_15, grammarAccess.getDFigureFromFileAccess().getCaptionKeyword_12_0());
                      			
                    }
                    // InternalSVR.g:1908:4: ( (lv_caption_16_0= RULE_STRING ) )
                    // InternalSVR.g:1909:5: (lv_caption_16_0= RULE_STRING )
                    {
                    // InternalSVR.g:1909:5: (lv_caption_16_0= RULE_STRING )
                    // InternalSVR.g:1910:6: lv_caption_16_0= RULE_STRING
                    {
                    lv_caption_16_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_12); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_caption_16_0, grammarAccess.getDFigureFromFileAccess().getCaptionSTRINGTerminalRuleCall_12_1_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getDFigureFromFileRule());
                      						}
                      						setWithLastConsumed(
                      							current,
                      							"caption",
                      							lv_caption_16_0,
                      							"org.eclipse.xtext.common.Terminals.STRING");
                      					
                    }

                    }


                    }


                    }
                    break;

            }

            otherlv_17=(Token)match(input,24,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_17, grammarAccess.getDFigureFromFileAccess().getSolidusGreaterThanSignKeyword_13());
              		
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
    // $ANTLR end "ruleDFigureFromFile"


    // $ANTLR start "entryRuleDTableFromFile"
    // InternalSVR.g:1935:1: entryRuleDTableFromFile returns [EObject current=null] : iv_ruleDTableFromFile= ruleDTableFromFile EOF ;
    public final EObject entryRuleDTableFromFile() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDTableFromFile = null;


        try {
            // InternalSVR.g:1935:55: (iv_ruleDTableFromFile= ruleDTableFromFile EOF )
            // InternalSVR.g:1936:2: iv_ruleDTableFromFile= ruleDTableFromFile EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDTableFromFileRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleDTableFromFile=ruleDTableFromFile();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDTableFromFile; 
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
    // $ANTLR end "entryRuleDTableFromFile"


    // $ANTLR start "ruleDTableFromFile"
    // InternalSVR.g:1942:1: ruleDTableFromFile returns [EObject current=null] : (otherlv_0= '<tableFromFile' otherlv_1= 'name=' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= 'referenceFile=' ( (lv_referenceFile_4_0= RULE_STRING ) ) otherlv_5= 'width=' ( (lv_width_6_0= RULE_UINT_STRING ) ) otherlv_7= 'height=' ( (lv_height_8_0= RULE_UINT_STRING ) ) (otherlv_9= 'alignment=' ( (lv_alignment_10_0= ruleDAlignment ) ) )? (otherlv_11= 'style=' ( (lv_style_12_0= RULE_STRING ) ) )? (otherlv_13= 'indent=' ( (lv_indent_14_0= RULE_REAL_STRING ) ) )? (otherlv_15= 'caption=' ( (lv_caption_16_0= RULE_STRING ) ) )? otherlv_17= '/>' ) ;
    public final EObject ruleDTableFromFile() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token lv_referenceFile_4_0=null;
        Token otherlv_5=null;
        Token lv_width_6_0=null;
        Token otherlv_7=null;
        Token lv_height_8_0=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token lv_style_12_0=null;
        Token otherlv_13=null;
        Token lv_indent_14_0=null;
        Token otherlv_15=null;
        Token lv_caption_16_0=null;
        Token otherlv_17=null;
        Enumerator lv_alignment_10_0 = null;



        	enterRule();

        try {
            // InternalSVR.g:1948:2: ( (otherlv_0= '<tableFromFile' otherlv_1= 'name=' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= 'referenceFile=' ( (lv_referenceFile_4_0= RULE_STRING ) ) otherlv_5= 'width=' ( (lv_width_6_0= RULE_UINT_STRING ) ) otherlv_7= 'height=' ( (lv_height_8_0= RULE_UINT_STRING ) ) (otherlv_9= 'alignment=' ( (lv_alignment_10_0= ruleDAlignment ) ) )? (otherlv_11= 'style=' ( (lv_style_12_0= RULE_STRING ) ) )? (otherlv_13= 'indent=' ( (lv_indent_14_0= RULE_REAL_STRING ) ) )? (otherlv_15= 'caption=' ( (lv_caption_16_0= RULE_STRING ) ) )? otherlv_17= '/>' ) )
            // InternalSVR.g:1949:2: (otherlv_0= '<tableFromFile' otherlv_1= 'name=' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= 'referenceFile=' ( (lv_referenceFile_4_0= RULE_STRING ) ) otherlv_5= 'width=' ( (lv_width_6_0= RULE_UINT_STRING ) ) otherlv_7= 'height=' ( (lv_height_8_0= RULE_UINT_STRING ) ) (otherlv_9= 'alignment=' ( (lv_alignment_10_0= ruleDAlignment ) ) )? (otherlv_11= 'style=' ( (lv_style_12_0= RULE_STRING ) ) )? (otherlv_13= 'indent=' ( (lv_indent_14_0= RULE_REAL_STRING ) ) )? (otherlv_15= 'caption=' ( (lv_caption_16_0= RULE_STRING ) ) )? otherlv_17= '/>' )
            {
            // InternalSVR.g:1949:2: (otherlv_0= '<tableFromFile' otherlv_1= 'name=' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= 'referenceFile=' ( (lv_referenceFile_4_0= RULE_STRING ) ) otherlv_5= 'width=' ( (lv_width_6_0= RULE_UINT_STRING ) ) otherlv_7= 'height=' ( (lv_height_8_0= RULE_UINT_STRING ) ) (otherlv_9= 'alignment=' ( (lv_alignment_10_0= ruleDAlignment ) ) )? (otherlv_11= 'style=' ( (lv_style_12_0= RULE_STRING ) ) )? (otherlv_13= 'indent=' ( (lv_indent_14_0= RULE_REAL_STRING ) ) )? (otherlv_15= 'caption=' ( (lv_caption_16_0= RULE_STRING ) ) )? otherlv_17= '/>' )
            // InternalSVR.g:1950:3: otherlv_0= '<tableFromFile' otherlv_1= 'name=' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= 'referenceFile=' ( (lv_referenceFile_4_0= RULE_STRING ) ) otherlv_5= 'width=' ( (lv_width_6_0= RULE_UINT_STRING ) ) otherlv_7= 'height=' ( (lv_height_8_0= RULE_UINT_STRING ) ) (otherlv_9= 'alignment=' ( (lv_alignment_10_0= ruleDAlignment ) ) )? (otherlv_11= 'style=' ( (lv_style_12_0= RULE_STRING ) ) )? (otherlv_13= 'indent=' ( (lv_indent_14_0= RULE_REAL_STRING ) ) )? (otherlv_15= 'caption=' ( (lv_caption_16_0= RULE_STRING ) ) )? otherlv_17= '/>'
            {
            otherlv_0=(Token)match(input,64,FollowSets000.FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getDTableFromFileAccess().getTableFromFileKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,17,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getDTableFromFileAccess().getNameKeyword_1());
              		
            }
            // InternalSVR.g:1958:3: ( (lv_name_2_0= RULE_STRING ) )
            // InternalSVR.g:1959:4: (lv_name_2_0= RULE_STRING )
            {
            // InternalSVR.g:1959:4: (lv_name_2_0= RULE_STRING )
            // InternalSVR.g:1960:5: lv_name_2_0= RULE_STRING
            {
            lv_name_2_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_52); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_2_0, grammarAccess.getDTableFromFileAccess().getNameSTRINGTerminalRuleCall_2_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getDTableFromFileRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_2_0,
              						"org.eclipse.xtext.common.Terminals.STRING");
              				
            }

            }


            }

            otherlv_3=(Token)match(input,60,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getDTableFromFileAccess().getReferenceFileKeyword_3());
              		
            }
            // InternalSVR.g:1980:3: ( (lv_referenceFile_4_0= RULE_STRING ) )
            // InternalSVR.g:1981:4: (lv_referenceFile_4_0= RULE_STRING )
            {
            // InternalSVR.g:1981:4: (lv_referenceFile_4_0= RULE_STRING )
            // InternalSVR.g:1982:5: lv_referenceFile_4_0= RULE_STRING
            {
            lv_referenceFile_4_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_53); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_referenceFile_4_0, grammarAccess.getDTableFromFileAccess().getReferenceFileSTRINGTerminalRuleCall_4_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getDTableFromFileRule());
              					}
              					setWithLastConsumed(
              						current,
              						"referenceFile",
              						lv_referenceFile_4_0,
              						"org.eclipse.xtext.common.Terminals.STRING");
              				
            }

            }


            }

            otherlv_5=(Token)match(input,61,FollowSets000.FOLLOW_7); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getDTableFromFileAccess().getWidthKeyword_5());
              		
            }
            // InternalSVR.g:2002:3: ( (lv_width_6_0= RULE_UINT_STRING ) )
            // InternalSVR.g:2003:4: (lv_width_6_0= RULE_UINT_STRING )
            {
            // InternalSVR.g:2003:4: (lv_width_6_0= RULE_UINT_STRING )
            // InternalSVR.g:2004:5: lv_width_6_0= RULE_UINT_STRING
            {
            lv_width_6_0=(Token)match(input,RULE_UINT_STRING,FollowSets000.FOLLOW_54); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_width_6_0, grammarAccess.getDTableFromFileAccess().getWidthUINT_STRINGTerminalRuleCall_6_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getDTableFromFileRule());
              					}
              					setWithLastConsumed(
              						current,
              						"width",
              						lv_width_6_0,
              						"es.uah.aut.srg.micobs.svm.lang.svr.SVR.UINT_STRING");
              				
            }

            }


            }

            otherlv_7=(Token)match(input,62,FollowSets000.FOLLOW_7); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_7, grammarAccess.getDTableFromFileAccess().getHeightKeyword_7());
              		
            }
            // InternalSVR.g:2024:3: ( (lv_height_8_0= RULE_UINT_STRING ) )
            // InternalSVR.g:2025:4: (lv_height_8_0= RULE_UINT_STRING )
            {
            // InternalSVR.g:2025:4: (lv_height_8_0= RULE_UINT_STRING )
            // InternalSVR.g:2026:5: lv_height_8_0= RULE_UINT_STRING
            {
            lv_height_8_0=(Token)match(input,RULE_UINT_STRING,FollowSets000.FOLLOW_55); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_height_8_0, grammarAccess.getDTableFromFileAccess().getHeightUINT_STRINGTerminalRuleCall_8_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getDTableFromFileRule());
              					}
              					setWithLastConsumed(
              						current,
              						"height",
              						lv_height_8_0,
              						"es.uah.aut.srg.micobs.svm.lang.svr.SVR.UINT_STRING");
              				
            }

            }


            }

            // InternalSVR.g:2042:3: (otherlv_9= 'alignment=' ( (lv_alignment_10_0= ruleDAlignment ) ) )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==37) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // InternalSVR.g:2043:4: otherlv_9= 'alignment=' ( (lv_alignment_10_0= ruleDAlignment ) )
                    {
                    otherlv_9=(Token)match(input,37,FollowSets000.FOLLOW_27); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_9, grammarAccess.getDTableFromFileAccess().getAlignmentKeyword_9_0());
                      			
                    }
                    // InternalSVR.g:2047:4: ( (lv_alignment_10_0= ruleDAlignment ) )
                    // InternalSVR.g:2048:5: (lv_alignment_10_0= ruleDAlignment )
                    {
                    // InternalSVR.g:2048:5: (lv_alignment_10_0= ruleDAlignment )
                    // InternalSVR.g:2049:6: lv_alignment_10_0= ruleDAlignment
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getDTableFromFileAccess().getAlignmentDAlignmentEnumRuleCall_9_1_0());
                      					
                    }
                    pushFollow(FollowSets000.FOLLOW_56);
                    lv_alignment_10_0=ruleDAlignment();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getDTableFromFileRule());
                      						}
                      						set(
                      							current,
                      							"alignment",
                      							lv_alignment_10_0,
                      							"es.uah.aut.srg.micobs.svm.lang.svr.SVR.DAlignment");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }
                    break;

            }

            // InternalSVR.g:2067:3: (otherlv_11= 'style=' ( (lv_style_12_0= RULE_STRING ) ) )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==38) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // InternalSVR.g:2068:4: otherlv_11= 'style=' ( (lv_style_12_0= RULE_STRING ) )
                    {
                    otherlv_11=(Token)match(input,38,FollowSets000.FOLLOW_4); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_11, grammarAccess.getDTableFromFileAccess().getStyleKeyword_10_0());
                      			
                    }
                    // InternalSVR.g:2072:4: ( (lv_style_12_0= RULE_STRING ) )
                    // InternalSVR.g:2073:5: (lv_style_12_0= RULE_STRING )
                    {
                    // InternalSVR.g:2073:5: (lv_style_12_0= RULE_STRING )
                    // InternalSVR.g:2074:6: lv_style_12_0= RULE_STRING
                    {
                    lv_style_12_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_57); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_style_12_0, grammarAccess.getDTableFromFileAccess().getStyleSTRINGTerminalRuleCall_10_1_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getDTableFromFileRule());
                      						}
                      						setWithLastConsumed(
                      							current,
                      							"style",
                      							lv_style_12_0,
                      							"org.eclipse.xtext.common.Terminals.STRING");
                      					
                    }

                    }


                    }


                    }
                    break;

            }

            // InternalSVR.g:2091:3: (otherlv_13= 'indent=' ( (lv_indent_14_0= RULE_REAL_STRING ) ) )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==39) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // InternalSVR.g:2092:4: otherlv_13= 'indent=' ( (lv_indent_14_0= RULE_REAL_STRING ) )
                    {
                    otherlv_13=(Token)match(input,39,FollowSets000.FOLLOW_30); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_13, grammarAccess.getDTableFromFileAccess().getIndentKeyword_11_0());
                      			
                    }
                    // InternalSVR.g:2096:4: ( (lv_indent_14_0= RULE_REAL_STRING ) )
                    // InternalSVR.g:2097:5: (lv_indent_14_0= RULE_REAL_STRING )
                    {
                    // InternalSVR.g:2097:5: (lv_indent_14_0= RULE_REAL_STRING )
                    // InternalSVR.g:2098:6: lv_indent_14_0= RULE_REAL_STRING
                    {
                    lv_indent_14_0=(Token)match(input,RULE_REAL_STRING,FollowSets000.FOLLOW_58); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_indent_14_0, grammarAccess.getDTableFromFileAccess().getIndentREAL_STRINGTerminalRuleCall_11_1_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getDTableFromFileRule());
                      						}
                      						setWithLastConsumed(
                      							current,
                      							"indent",
                      							lv_indent_14_0,
                      							"es.uah.aut.srg.micobs.svm.lang.svr.SVR.REAL_STRING");
                      					
                    }

                    }


                    }


                    }
                    break;

            }

            // InternalSVR.g:2115:3: (otherlv_15= 'caption=' ( (lv_caption_16_0= RULE_STRING ) ) )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==63) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // InternalSVR.g:2116:4: otherlv_15= 'caption=' ( (lv_caption_16_0= RULE_STRING ) )
                    {
                    otherlv_15=(Token)match(input,63,FollowSets000.FOLLOW_4); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_15, grammarAccess.getDTableFromFileAccess().getCaptionKeyword_12_0());
                      			
                    }
                    // InternalSVR.g:2120:4: ( (lv_caption_16_0= RULE_STRING ) )
                    // InternalSVR.g:2121:5: (lv_caption_16_0= RULE_STRING )
                    {
                    // InternalSVR.g:2121:5: (lv_caption_16_0= RULE_STRING )
                    // InternalSVR.g:2122:6: lv_caption_16_0= RULE_STRING
                    {
                    lv_caption_16_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_12); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_caption_16_0, grammarAccess.getDTableFromFileAccess().getCaptionSTRINGTerminalRuleCall_12_1_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getDTableFromFileRule());
                      						}
                      						setWithLastConsumed(
                      							current,
                      							"caption",
                      							lv_caption_16_0,
                      							"org.eclipse.xtext.common.Terminals.STRING");
                      					
                    }

                    }


                    }


                    }
                    break;

            }

            otherlv_17=(Token)match(input,24,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_17, grammarAccess.getDTableFromFileAccess().getSolidusGreaterThanSignKeyword_13());
              		
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
    // $ANTLR end "ruleDTableFromFile"


    // $ANTLR start "entryRuleDBasicTable"
    // InternalSVR.g:2147:1: entryRuleDBasicTable returns [EObject current=null] : iv_ruleDBasicTable= ruleDBasicTable EOF ;
    public final EObject entryRuleDBasicTable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDBasicTable = null;


        try {
            // InternalSVR.g:2147:52: (iv_ruleDBasicTable= ruleDBasicTable EOF )
            // InternalSVR.g:2148:2: iv_ruleDBasicTable= ruleDBasicTable EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDBasicTableRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleDBasicTable=ruleDBasicTable();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDBasicTable; 
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
    // $ANTLR end "entryRuleDBasicTable"


    // $ANTLR start "ruleDBasicTable"
    // InternalSVR.g:2154:1: ruleDBasicTable returns [EObject current=null] : (otherlv_0= '<basicTable' otherlv_1= 'name=' ( (lv_name_2_0= RULE_STRING ) ) (otherlv_3= 'width=' ( (lv_width_4_0= RULE_UINT_STRING ) ) )? (otherlv_5= 'alignment=' ( (lv_alignment_6_0= ruleDAlignment ) ) )? (otherlv_7= 'style=' ( (lv_style_8_0= RULE_STRING ) ) )? (otherlv_9= 'indent=' ( (lv_indent_10_0= RULE_REAL_STRING ) ) )? (otherlv_11= 'caption=' ( (lv_caption_12_0= RULE_STRING ) ) )? otherlv_13= '>' ( (lv_rows_14_0= ruleDRow ) )+ otherlv_15= '</basicTable>' ) ;
    public final EObject ruleDBasicTable() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token lv_width_4_0=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token lv_style_8_0=null;
        Token otherlv_9=null;
        Token lv_indent_10_0=null;
        Token otherlv_11=null;
        Token lv_caption_12_0=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Enumerator lv_alignment_6_0 = null;

        EObject lv_rows_14_0 = null;



        	enterRule();

        try {
            // InternalSVR.g:2160:2: ( (otherlv_0= '<basicTable' otherlv_1= 'name=' ( (lv_name_2_0= RULE_STRING ) ) (otherlv_3= 'width=' ( (lv_width_4_0= RULE_UINT_STRING ) ) )? (otherlv_5= 'alignment=' ( (lv_alignment_6_0= ruleDAlignment ) ) )? (otherlv_7= 'style=' ( (lv_style_8_0= RULE_STRING ) ) )? (otherlv_9= 'indent=' ( (lv_indent_10_0= RULE_REAL_STRING ) ) )? (otherlv_11= 'caption=' ( (lv_caption_12_0= RULE_STRING ) ) )? otherlv_13= '>' ( (lv_rows_14_0= ruleDRow ) )+ otherlv_15= '</basicTable>' ) )
            // InternalSVR.g:2161:2: (otherlv_0= '<basicTable' otherlv_1= 'name=' ( (lv_name_2_0= RULE_STRING ) ) (otherlv_3= 'width=' ( (lv_width_4_0= RULE_UINT_STRING ) ) )? (otherlv_5= 'alignment=' ( (lv_alignment_6_0= ruleDAlignment ) ) )? (otherlv_7= 'style=' ( (lv_style_8_0= RULE_STRING ) ) )? (otherlv_9= 'indent=' ( (lv_indent_10_0= RULE_REAL_STRING ) ) )? (otherlv_11= 'caption=' ( (lv_caption_12_0= RULE_STRING ) ) )? otherlv_13= '>' ( (lv_rows_14_0= ruleDRow ) )+ otherlv_15= '</basicTable>' )
            {
            // InternalSVR.g:2161:2: (otherlv_0= '<basicTable' otherlv_1= 'name=' ( (lv_name_2_0= RULE_STRING ) ) (otherlv_3= 'width=' ( (lv_width_4_0= RULE_UINT_STRING ) ) )? (otherlv_5= 'alignment=' ( (lv_alignment_6_0= ruleDAlignment ) ) )? (otherlv_7= 'style=' ( (lv_style_8_0= RULE_STRING ) ) )? (otherlv_9= 'indent=' ( (lv_indent_10_0= RULE_REAL_STRING ) ) )? (otherlv_11= 'caption=' ( (lv_caption_12_0= RULE_STRING ) ) )? otherlv_13= '>' ( (lv_rows_14_0= ruleDRow ) )+ otherlv_15= '</basicTable>' )
            // InternalSVR.g:2162:3: otherlv_0= '<basicTable' otherlv_1= 'name=' ( (lv_name_2_0= RULE_STRING ) ) (otherlv_3= 'width=' ( (lv_width_4_0= RULE_UINT_STRING ) ) )? (otherlv_5= 'alignment=' ( (lv_alignment_6_0= ruleDAlignment ) ) )? (otherlv_7= 'style=' ( (lv_style_8_0= RULE_STRING ) ) )? (otherlv_9= 'indent=' ( (lv_indent_10_0= RULE_REAL_STRING ) ) )? (otherlv_11= 'caption=' ( (lv_caption_12_0= RULE_STRING ) ) )? otherlv_13= '>' ( (lv_rows_14_0= ruleDRow ) )+ otherlv_15= '</basicTable>'
            {
            otherlv_0=(Token)match(input,65,FollowSets000.FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getDBasicTableAccess().getBasicTableKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,17,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getDBasicTableAccess().getNameKeyword_1());
              		
            }
            // InternalSVR.g:2170:3: ( (lv_name_2_0= RULE_STRING ) )
            // InternalSVR.g:2171:4: (lv_name_2_0= RULE_STRING )
            {
            // InternalSVR.g:2171:4: (lv_name_2_0= RULE_STRING )
            // InternalSVR.g:2172:5: lv_name_2_0= RULE_STRING
            {
            lv_name_2_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_59); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_2_0, grammarAccess.getDBasicTableAccess().getNameSTRINGTerminalRuleCall_2_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getDBasicTableRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_2_0,
              						"org.eclipse.xtext.common.Terminals.STRING");
              				
            }

            }


            }

            // InternalSVR.g:2188:3: (otherlv_3= 'width=' ( (lv_width_4_0= RULE_UINT_STRING ) ) )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==61) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // InternalSVR.g:2189:4: otherlv_3= 'width=' ( (lv_width_4_0= RULE_UINT_STRING ) )
                    {
                    otherlv_3=(Token)match(input,61,FollowSets000.FOLLOW_7); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_3, grammarAccess.getDBasicTableAccess().getWidthKeyword_3_0());
                      			
                    }
                    // InternalSVR.g:2193:4: ( (lv_width_4_0= RULE_UINT_STRING ) )
                    // InternalSVR.g:2194:5: (lv_width_4_0= RULE_UINT_STRING )
                    {
                    // InternalSVR.g:2194:5: (lv_width_4_0= RULE_UINT_STRING )
                    // InternalSVR.g:2195:6: lv_width_4_0= RULE_UINT_STRING
                    {
                    lv_width_4_0=(Token)match(input,RULE_UINT_STRING,FollowSets000.FOLLOW_60); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_width_4_0, grammarAccess.getDBasicTableAccess().getWidthUINT_STRINGTerminalRuleCall_3_1_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getDBasicTableRule());
                      						}
                      						setWithLastConsumed(
                      							current,
                      							"width",
                      							lv_width_4_0,
                      							"es.uah.aut.srg.micobs.svm.lang.svr.SVR.UINT_STRING");
                      					
                    }

                    }


                    }


                    }
                    break;

            }

            // InternalSVR.g:2212:3: (otherlv_5= 'alignment=' ( (lv_alignment_6_0= ruleDAlignment ) ) )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==37) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // InternalSVR.g:2213:4: otherlv_5= 'alignment=' ( (lv_alignment_6_0= ruleDAlignment ) )
                    {
                    otherlv_5=(Token)match(input,37,FollowSets000.FOLLOW_27); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_5, grammarAccess.getDBasicTableAccess().getAlignmentKeyword_4_0());
                      			
                    }
                    // InternalSVR.g:2217:4: ( (lv_alignment_6_0= ruleDAlignment ) )
                    // InternalSVR.g:2218:5: (lv_alignment_6_0= ruleDAlignment )
                    {
                    // InternalSVR.g:2218:5: (lv_alignment_6_0= ruleDAlignment )
                    // InternalSVR.g:2219:6: lv_alignment_6_0= ruleDAlignment
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getDBasicTableAccess().getAlignmentDAlignmentEnumRuleCall_4_1_0());
                      					
                    }
                    pushFollow(FollowSets000.FOLLOW_61);
                    lv_alignment_6_0=ruleDAlignment();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getDBasicTableRule());
                      						}
                      						set(
                      							current,
                      							"alignment",
                      							lv_alignment_6_0,
                      							"es.uah.aut.srg.micobs.svm.lang.svr.SVR.DAlignment");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }
                    break;

            }

            // InternalSVR.g:2237:3: (otherlv_7= 'style=' ( (lv_style_8_0= RULE_STRING ) ) )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==38) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // InternalSVR.g:2238:4: otherlv_7= 'style=' ( (lv_style_8_0= RULE_STRING ) )
                    {
                    otherlv_7=(Token)match(input,38,FollowSets000.FOLLOW_4); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_7, grammarAccess.getDBasicTableAccess().getStyleKeyword_5_0());
                      			
                    }
                    // InternalSVR.g:2242:4: ( (lv_style_8_0= RULE_STRING ) )
                    // InternalSVR.g:2243:5: (lv_style_8_0= RULE_STRING )
                    {
                    // InternalSVR.g:2243:5: (lv_style_8_0= RULE_STRING )
                    // InternalSVR.g:2244:6: lv_style_8_0= RULE_STRING
                    {
                    lv_style_8_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_62); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_style_8_0, grammarAccess.getDBasicTableAccess().getStyleSTRINGTerminalRuleCall_5_1_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getDBasicTableRule());
                      						}
                      						setWithLastConsumed(
                      							current,
                      							"style",
                      							lv_style_8_0,
                      							"org.eclipse.xtext.common.Terminals.STRING");
                      					
                    }

                    }


                    }


                    }
                    break;

            }

            // InternalSVR.g:2261:3: (otherlv_9= 'indent=' ( (lv_indent_10_0= RULE_REAL_STRING ) ) )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==39) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // InternalSVR.g:2262:4: otherlv_9= 'indent=' ( (lv_indent_10_0= RULE_REAL_STRING ) )
                    {
                    otherlv_9=(Token)match(input,39,FollowSets000.FOLLOW_30); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_9, grammarAccess.getDBasicTableAccess().getIndentKeyword_6_0());
                      			
                    }
                    // InternalSVR.g:2266:4: ( (lv_indent_10_0= RULE_REAL_STRING ) )
                    // InternalSVR.g:2267:5: (lv_indent_10_0= RULE_REAL_STRING )
                    {
                    // InternalSVR.g:2267:5: (lv_indent_10_0= RULE_REAL_STRING )
                    // InternalSVR.g:2268:6: lv_indent_10_0= RULE_REAL_STRING
                    {
                    lv_indent_10_0=(Token)match(input,RULE_REAL_STRING,FollowSets000.FOLLOW_63); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_indent_10_0, grammarAccess.getDBasicTableAccess().getIndentREAL_STRINGTerminalRuleCall_6_1_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getDBasicTableRule());
                      						}
                      						setWithLastConsumed(
                      							current,
                      							"indent",
                      							lv_indent_10_0,
                      							"es.uah.aut.srg.micobs.svm.lang.svr.SVR.REAL_STRING");
                      					
                    }

                    }


                    }


                    }
                    break;

            }

            // InternalSVR.g:2285:3: (otherlv_11= 'caption=' ( (lv_caption_12_0= RULE_STRING ) ) )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==63) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // InternalSVR.g:2286:4: otherlv_11= 'caption=' ( (lv_caption_12_0= RULE_STRING ) )
                    {
                    otherlv_11=(Token)match(input,63,FollowSets000.FOLLOW_4); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_11, grammarAccess.getDBasicTableAccess().getCaptionKeyword_7_0());
                      			
                    }
                    // InternalSVR.g:2290:4: ( (lv_caption_12_0= RULE_STRING ) )
                    // InternalSVR.g:2291:5: (lv_caption_12_0= RULE_STRING )
                    {
                    // InternalSVR.g:2291:5: (lv_caption_12_0= RULE_STRING )
                    // InternalSVR.g:2292:6: lv_caption_12_0= RULE_STRING
                    {
                    lv_caption_12_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_10); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_caption_12_0, grammarAccess.getDBasicTableAccess().getCaptionSTRINGTerminalRuleCall_7_1_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getDBasicTableRule());
                      						}
                      						setWithLastConsumed(
                      							current,
                      							"caption",
                      							lv_caption_12_0,
                      							"org.eclipse.xtext.common.Terminals.STRING");
                      					
                    }

                    }


                    }


                    }
                    break;

            }

            otherlv_13=(Token)match(input,22,FollowSets000.FOLLOW_64); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_13, grammarAccess.getDBasicTableAccess().getGreaterThanSignKeyword_8());
              		
            }
            // InternalSVR.g:2313:3: ( (lv_rows_14_0= ruleDRow ) )+
            int cnt47=0;
            loop47:
            do {
                int alt47=2;
                int LA47_0 = input.LA(1);

                if ( (LA47_0==67) ) {
                    alt47=1;
                }


                switch (alt47) {
            	case 1 :
            	    // InternalSVR.g:2314:4: (lv_rows_14_0= ruleDRow )
            	    {
            	    // InternalSVR.g:2314:4: (lv_rows_14_0= ruleDRow )
            	    // InternalSVR.g:2315:5: lv_rows_14_0= ruleDRow
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getDBasicTableAccess().getRowsDRowParserRuleCall_9_0());
            	      				
            	    }
            	    pushFollow(FollowSets000.FOLLOW_65);
            	    lv_rows_14_0=ruleDRow();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getDBasicTableRule());
            	      					}
            	      					add(
            	      						current,
            	      						"rows",
            	      						lv_rows_14_0,
            	      						"es.uah.aut.srg.micobs.svm.lang.svr.SVR.DRow");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt47 >= 1 ) break loop47;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(47, input);
                        throw eee;
                }
                cnt47++;
            } while (true);

            otherlv_15=(Token)match(input,66,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_15, grammarAccess.getDBasicTableAccess().getBasicTableKeyword_10());
              		
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
    // $ANTLR end "ruleDBasicTable"


    // $ANTLR start "entryRuleDRow"
    // InternalSVR.g:2340:1: entryRuleDRow returns [EObject current=null] : iv_ruleDRow= ruleDRow EOF ;
    public final EObject entryRuleDRow() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDRow = null;


        try {
            // InternalSVR.g:2340:45: (iv_ruleDRow= ruleDRow EOF )
            // InternalSVR.g:2341:2: iv_ruleDRow= ruleDRow EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDRowRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleDRow=ruleDRow();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDRow; 
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
    // $ANTLR end "entryRuleDRow"


    // $ANTLR start "ruleDRow"
    // InternalSVR.g:2347:1: ruleDRow returns [EObject current=null] : (otherlv_0= '<row>' ( (lv_cells_1_0= ruleDCell ) )+ otherlv_2= '</row>' ) ;
    public final EObject ruleDRow() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_cells_1_0 = null;



        	enterRule();

        try {
            // InternalSVR.g:2353:2: ( (otherlv_0= '<row>' ( (lv_cells_1_0= ruleDCell ) )+ otherlv_2= '</row>' ) )
            // InternalSVR.g:2354:2: (otherlv_0= '<row>' ( (lv_cells_1_0= ruleDCell ) )+ otherlv_2= '</row>' )
            {
            // InternalSVR.g:2354:2: (otherlv_0= '<row>' ( (lv_cells_1_0= ruleDCell ) )+ otherlv_2= '</row>' )
            // InternalSVR.g:2355:3: otherlv_0= '<row>' ( (lv_cells_1_0= ruleDCell ) )+ otherlv_2= '</row>'
            {
            otherlv_0=(Token)match(input,67,FollowSets000.FOLLOW_66); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getDRowAccess().getRowKeyword_0());
              		
            }
            // InternalSVR.g:2359:3: ( (lv_cells_1_0= ruleDCell ) )+
            int cnt48=0;
            loop48:
            do {
                int alt48=2;
                int LA48_0 = input.LA(1);

                if ( (LA48_0==69) ) {
                    alt48=1;
                }


                switch (alt48) {
            	case 1 :
            	    // InternalSVR.g:2360:4: (lv_cells_1_0= ruleDCell )
            	    {
            	    // InternalSVR.g:2360:4: (lv_cells_1_0= ruleDCell )
            	    // InternalSVR.g:2361:5: lv_cells_1_0= ruleDCell
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getDRowAccess().getCellsDCellParserRuleCall_1_0());
            	      				
            	    }
            	    pushFollow(FollowSets000.FOLLOW_67);
            	    lv_cells_1_0=ruleDCell();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getDRowRule());
            	      					}
            	      					add(
            	      						current,
            	      						"cells",
            	      						lv_cells_1_0,
            	      						"es.uah.aut.srg.micobs.svm.lang.svr.SVR.DCell");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt48 >= 1 ) break loop48;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(48, input);
                        throw eee;
                }
                cnt48++;
            } while (true);

            otherlv_2=(Token)match(input,68,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getDRowAccess().getRowKeyword_2());
              		
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
    // $ANTLR end "ruleDRow"


    // $ANTLR start "entryRuleDCell"
    // InternalSVR.g:2386:1: entryRuleDCell returns [EObject current=null] : iv_ruleDCell= ruleDCell EOF ;
    public final EObject entryRuleDCell() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDCell = null;


        try {
            // InternalSVR.g:2386:46: (iv_ruleDCell= ruleDCell EOF )
            // InternalSVR.g:2387:2: iv_ruleDCell= ruleDCell EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDCellRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleDCell=ruleDCell();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDCell; 
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
    // $ANTLR end "entryRuleDCell"


    // $ANTLR start "ruleDCell"
    // InternalSVR.g:2393:1: ruleDCell returns [EObject current=null] : (otherlv_0= '<cell' (otherlv_1= 'colSpan=' ( (lv_colSpan_2_0= RULE_UINT_STRING ) ) )? (otherlv_3= 'rowSpan=' ( (lv_rowSpan_4_0= RULE_UINT_STRING ) ) )? (otherlv_5= 'width=' ( (lv_width_6_0= RULE_UINT_STRING ) ) )? (otherlv_7= 'shadow=' ( (lv_shadow_8_0= RULE_STRING ) ) )? otherlv_9= '>' ( (lv_bodyContent_10_0= ruleDBodyContent ) )+ otherlv_11= '</cell>' ) ;
    public final EObject ruleDCell() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_colSpan_2_0=null;
        Token otherlv_3=null;
        Token lv_rowSpan_4_0=null;
        Token otherlv_5=null;
        Token lv_width_6_0=null;
        Token otherlv_7=null;
        Token lv_shadow_8_0=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        EObject lv_bodyContent_10_0 = null;



        	enterRule();

        try {
            // InternalSVR.g:2399:2: ( (otherlv_0= '<cell' (otherlv_1= 'colSpan=' ( (lv_colSpan_2_0= RULE_UINT_STRING ) ) )? (otherlv_3= 'rowSpan=' ( (lv_rowSpan_4_0= RULE_UINT_STRING ) ) )? (otherlv_5= 'width=' ( (lv_width_6_0= RULE_UINT_STRING ) ) )? (otherlv_7= 'shadow=' ( (lv_shadow_8_0= RULE_STRING ) ) )? otherlv_9= '>' ( (lv_bodyContent_10_0= ruleDBodyContent ) )+ otherlv_11= '</cell>' ) )
            // InternalSVR.g:2400:2: (otherlv_0= '<cell' (otherlv_1= 'colSpan=' ( (lv_colSpan_2_0= RULE_UINT_STRING ) ) )? (otherlv_3= 'rowSpan=' ( (lv_rowSpan_4_0= RULE_UINT_STRING ) ) )? (otherlv_5= 'width=' ( (lv_width_6_0= RULE_UINT_STRING ) ) )? (otherlv_7= 'shadow=' ( (lv_shadow_8_0= RULE_STRING ) ) )? otherlv_9= '>' ( (lv_bodyContent_10_0= ruleDBodyContent ) )+ otherlv_11= '</cell>' )
            {
            // InternalSVR.g:2400:2: (otherlv_0= '<cell' (otherlv_1= 'colSpan=' ( (lv_colSpan_2_0= RULE_UINT_STRING ) ) )? (otherlv_3= 'rowSpan=' ( (lv_rowSpan_4_0= RULE_UINT_STRING ) ) )? (otherlv_5= 'width=' ( (lv_width_6_0= RULE_UINT_STRING ) ) )? (otherlv_7= 'shadow=' ( (lv_shadow_8_0= RULE_STRING ) ) )? otherlv_9= '>' ( (lv_bodyContent_10_0= ruleDBodyContent ) )+ otherlv_11= '</cell>' )
            // InternalSVR.g:2401:3: otherlv_0= '<cell' (otherlv_1= 'colSpan=' ( (lv_colSpan_2_0= RULE_UINT_STRING ) ) )? (otherlv_3= 'rowSpan=' ( (lv_rowSpan_4_0= RULE_UINT_STRING ) ) )? (otherlv_5= 'width=' ( (lv_width_6_0= RULE_UINT_STRING ) ) )? (otherlv_7= 'shadow=' ( (lv_shadow_8_0= RULE_STRING ) ) )? otherlv_9= '>' ( (lv_bodyContent_10_0= ruleDBodyContent ) )+ otherlv_11= '</cell>'
            {
            otherlv_0=(Token)match(input,69,FollowSets000.FOLLOW_68); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getDCellAccess().getCellKeyword_0());
              		
            }
            // InternalSVR.g:2405:3: (otherlv_1= 'colSpan=' ( (lv_colSpan_2_0= RULE_UINT_STRING ) ) )?
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==70) ) {
                alt49=1;
            }
            switch (alt49) {
                case 1 :
                    // InternalSVR.g:2406:4: otherlv_1= 'colSpan=' ( (lv_colSpan_2_0= RULE_UINT_STRING ) )
                    {
                    otherlv_1=(Token)match(input,70,FollowSets000.FOLLOW_7); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_1, grammarAccess.getDCellAccess().getColSpanKeyword_1_0());
                      			
                    }
                    // InternalSVR.g:2410:4: ( (lv_colSpan_2_0= RULE_UINT_STRING ) )
                    // InternalSVR.g:2411:5: (lv_colSpan_2_0= RULE_UINT_STRING )
                    {
                    // InternalSVR.g:2411:5: (lv_colSpan_2_0= RULE_UINT_STRING )
                    // InternalSVR.g:2412:6: lv_colSpan_2_0= RULE_UINT_STRING
                    {
                    lv_colSpan_2_0=(Token)match(input,RULE_UINT_STRING,FollowSets000.FOLLOW_69); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_colSpan_2_0, grammarAccess.getDCellAccess().getColSpanUINT_STRINGTerminalRuleCall_1_1_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getDCellRule());
                      						}
                      						setWithLastConsumed(
                      							current,
                      							"colSpan",
                      							lv_colSpan_2_0,
                      							"es.uah.aut.srg.micobs.svm.lang.svr.SVR.UINT_STRING");
                      					
                    }

                    }


                    }


                    }
                    break;

            }

            // InternalSVR.g:2429:3: (otherlv_3= 'rowSpan=' ( (lv_rowSpan_4_0= RULE_UINT_STRING ) ) )?
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==71) ) {
                alt50=1;
            }
            switch (alt50) {
                case 1 :
                    // InternalSVR.g:2430:4: otherlv_3= 'rowSpan=' ( (lv_rowSpan_4_0= RULE_UINT_STRING ) )
                    {
                    otherlv_3=(Token)match(input,71,FollowSets000.FOLLOW_7); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_3, grammarAccess.getDCellAccess().getRowSpanKeyword_2_0());
                      			
                    }
                    // InternalSVR.g:2434:4: ( (lv_rowSpan_4_0= RULE_UINT_STRING ) )
                    // InternalSVR.g:2435:5: (lv_rowSpan_4_0= RULE_UINT_STRING )
                    {
                    // InternalSVR.g:2435:5: (lv_rowSpan_4_0= RULE_UINT_STRING )
                    // InternalSVR.g:2436:6: lv_rowSpan_4_0= RULE_UINT_STRING
                    {
                    lv_rowSpan_4_0=(Token)match(input,RULE_UINT_STRING,FollowSets000.FOLLOW_70); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_rowSpan_4_0, grammarAccess.getDCellAccess().getRowSpanUINT_STRINGTerminalRuleCall_2_1_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getDCellRule());
                      						}
                      						setWithLastConsumed(
                      							current,
                      							"rowSpan",
                      							lv_rowSpan_4_0,
                      							"es.uah.aut.srg.micobs.svm.lang.svr.SVR.UINT_STRING");
                      					
                    }

                    }


                    }


                    }
                    break;

            }

            // InternalSVR.g:2453:3: (otherlv_5= 'width=' ( (lv_width_6_0= RULE_UINT_STRING ) ) )?
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==61) ) {
                alt51=1;
            }
            switch (alt51) {
                case 1 :
                    // InternalSVR.g:2454:4: otherlv_5= 'width=' ( (lv_width_6_0= RULE_UINT_STRING ) )
                    {
                    otherlv_5=(Token)match(input,61,FollowSets000.FOLLOW_7); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_5, grammarAccess.getDCellAccess().getWidthKeyword_3_0());
                      			
                    }
                    // InternalSVR.g:2458:4: ( (lv_width_6_0= RULE_UINT_STRING ) )
                    // InternalSVR.g:2459:5: (lv_width_6_0= RULE_UINT_STRING )
                    {
                    // InternalSVR.g:2459:5: (lv_width_6_0= RULE_UINT_STRING )
                    // InternalSVR.g:2460:6: lv_width_6_0= RULE_UINT_STRING
                    {
                    lv_width_6_0=(Token)match(input,RULE_UINT_STRING,FollowSets000.FOLLOW_71); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_width_6_0, grammarAccess.getDCellAccess().getWidthUINT_STRINGTerminalRuleCall_3_1_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getDCellRule());
                      						}
                      						setWithLastConsumed(
                      							current,
                      							"width",
                      							lv_width_6_0,
                      							"es.uah.aut.srg.micobs.svm.lang.svr.SVR.UINT_STRING");
                      					
                    }

                    }


                    }


                    }
                    break;

            }

            // InternalSVR.g:2477:3: (otherlv_7= 'shadow=' ( (lv_shadow_8_0= RULE_STRING ) ) )?
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==72) ) {
                alt52=1;
            }
            switch (alt52) {
                case 1 :
                    // InternalSVR.g:2478:4: otherlv_7= 'shadow=' ( (lv_shadow_8_0= RULE_STRING ) )
                    {
                    otherlv_7=(Token)match(input,72,FollowSets000.FOLLOW_4); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_7, grammarAccess.getDCellAccess().getShadowKeyword_4_0());
                      			
                    }
                    // InternalSVR.g:2482:4: ( (lv_shadow_8_0= RULE_STRING ) )
                    // InternalSVR.g:2483:5: (lv_shadow_8_0= RULE_STRING )
                    {
                    // InternalSVR.g:2483:5: (lv_shadow_8_0= RULE_STRING )
                    // InternalSVR.g:2484:6: lv_shadow_8_0= RULE_STRING
                    {
                    lv_shadow_8_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_10); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_shadow_8_0, grammarAccess.getDCellAccess().getShadowSTRINGTerminalRuleCall_4_1_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getDCellRule());
                      						}
                      						setWithLastConsumed(
                      							current,
                      							"shadow",
                      							lv_shadow_8_0,
                      							"org.eclipse.xtext.common.Terminals.STRING");
                      					
                    }

                    }


                    }


                    }
                    break;

            }

            otherlv_9=(Token)match(input,22,FollowSets000.FOLLOW_23); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_9, grammarAccess.getDCellAccess().getGreaterThanSignKeyword_5());
              		
            }
            // InternalSVR.g:2505:3: ( (lv_bodyContent_10_0= ruleDBodyContent ) )+
            int cnt53=0;
            loop53:
            do {
                int alt53=2;
                int LA53_0 = input.LA(1);

                if ( (LA53_0==36||LA53_0==45||LA53_0==47||LA53_0==59||(LA53_0>=64 && LA53_0<=65)) ) {
                    alt53=1;
                }


                switch (alt53) {
            	case 1 :
            	    // InternalSVR.g:2506:4: (lv_bodyContent_10_0= ruleDBodyContent )
            	    {
            	    // InternalSVR.g:2506:4: (lv_bodyContent_10_0= ruleDBodyContent )
            	    // InternalSVR.g:2507:5: lv_bodyContent_10_0= ruleDBodyContent
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getDCellAccess().getBodyContentDBodyContentParserRuleCall_6_0());
            	      				
            	    }
            	    pushFollow(FollowSets000.FOLLOW_72);
            	    lv_bodyContent_10_0=ruleDBodyContent();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getDCellRule());
            	      					}
            	      					add(
            	      						current,
            	      						"bodyContent",
            	      						lv_bodyContent_10_0,
            	      						"es.uah.aut.srg.micobs.svm.lang.svr.SVR.DBodyContent");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt53 >= 1 ) break loop53;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(53, input);
                        throw eee;
                }
                cnt53++;
            } while (true);

            otherlv_11=(Token)match(input,73,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_11, grammarAccess.getDCellAccess().getCellKeyword_7());
              		
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
    // $ANTLR end "ruleDCell"


    // $ANTLR start "entryRuleDApplicableDocument"
    // InternalSVR.g:2532:1: entryRuleDApplicableDocument returns [EObject current=null] : iv_ruleDApplicableDocument= ruleDApplicableDocument EOF ;
    public final EObject entryRuleDApplicableDocument() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDApplicableDocument = null;


        try {
            // InternalSVR.g:2532:60: (iv_ruleDApplicableDocument= ruleDApplicableDocument EOF )
            // InternalSVR.g:2533:2: iv_ruleDApplicableDocument= ruleDApplicableDocument EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDApplicableDocumentRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleDApplicableDocument=ruleDApplicableDocument();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDApplicableDocument; 
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
    // $ANTLR end "entryRuleDApplicableDocument"


    // $ANTLR start "ruleDApplicableDocument"
    // InternalSVR.g:2539:1: ruleDApplicableDocument returns [EObject current=null] : (otherlv_0= '<ApplicableDocument' otherlv_1= 'name=' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= 'title=' ( (lv_title_4_0= RULE_STRING ) ) otherlv_5= 'id=' ( (lv_id_6_0= RULE_STRING ) ) (otherlv_7= 'issue=' ( (lv_issue_8_0= RULE_UINT_STRING ) ) (otherlv_9= 'revision=' ( (lv_revision_10_0= RULE_UINT_STRING ) ) )? )? (otherlv_11= 'date=' ( (lv_date_12_0= RULE_STRING ) ) )? (otherlv_13= 'url=' ( (lv_url_14_0= RULE_STRING ) ) )? otherlv_15= '/>' ) ;
    public final EObject ruleDApplicableDocument() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token lv_title_4_0=null;
        Token otherlv_5=null;
        Token lv_id_6_0=null;
        Token otherlv_7=null;
        Token lv_issue_8_0=null;
        Token otherlv_9=null;
        Token lv_revision_10_0=null;
        Token otherlv_11=null;
        Token lv_date_12_0=null;
        Token otherlv_13=null;
        Token lv_url_14_0=null;
        Token otherlv_15=null;


        	enterRule();

        try {
            // InternalSVR.g:2545:2: ( (otherlv_0= '<ApplicableDocument' otherlv_1= 'name=' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= 'title=' ( (lv_title_4_0= RULE_STRING ) ) otherlv_5= 'id=' ( (lv_id_6_0= RULE_STRING ) ) (otherlv_7= 'issue=' ( (lv_issue_8_0= RULE_UINT_STRING ) ) (otherlv_9= 'revision=' ( (lv_revision_10_0= RULE_UINT_STRING ) ) )? )? (otherlv_11= 'date=' ( (lv_date_12_0= RULE_STRING ) ) )? (otherlv_13= 'url=' ( (lv_url_14_0= RULE_STRING ) ) )? otherlv_15= '/>' ) )
            // InternalSVR.g:2546:2: (otherlv_0= '<ApplicableDocument' otherlv_1= 'name=' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= 'title=' ( (lv_title_4_0= RULE_STRING ) ) otherlv_5= 'id=' ( (lv_id_6_0= RULE_STRING ) ) (otherlv_7= 'issue=' ( (lv_issue_8_0= RULE_UINT_STRING ) ) (otherlv_9= 'revision=' ( (lv_revision_10_0= RULE_UINT_STRING ) ) )? )? (otherlv_11= 'date=' ( (lv_date_12_0= RULE_STRING ) ) )? (otherlv_13= 'url=' ( (lv_url_14_0= RULE_STRING ) ) )? otherlv_15= '/>' )
            {
            // InternalSVR.g:2546:2: (otherlv_0= '<ApplicableDocument' otherlv_1= 'name=' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= 'title=' ( (lv_title_4_0= RULE_STRING ) ) otherlv_5= 'id=' ( (lv_id_6_0= RULE_STRING ) ) (otherlv_7= 'issue=' ( (lv_issue_8_0= RULE_UINT_STRING ) ) (otherlv_9= 'revision=' ( (lv_revision_10_0= RULE_UINT_STRING ) ) )? )? (otherlv_11= 'date=' ( (lv_date_12_0= RULE_STRING ) ) )? (otherlv_13= 'url=' ( (lv_url_14_0= RULE_STRING ) ) )? otherlv_15= '/>' )
            // InternalSVR.g:2547:3: otherlv_0= '<ApplicableDocument' otherlv_1= 'name=' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= 'title=' ( (lv_title_4_0= RULE_STRING ) ) otherlv_5= 'id=' ( (lv_id_6_0= RULE_STRING ) ) (otherlv_7= 'issue=' ( (lv_issue_8_0= RULE_UINT_STRING ) ) (otherlv_9= 'revision=' ( (lv_revision_10_0= RULE_UINT_STRING ) ) )? )? (otherlv_11= 'date=' ( (lv_date_12_0= RULE_STRING ) ) )? (otherlv_13= 'url=' ( (lv_url_14_0= RULE_STRING ) ) )? otherlv_15= '/>'
            {
            otherlv_0=(Token)match(input,74,FollowSets000.FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getDApplicableDocumentAccess().getApplicableDocumentKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,17,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getDApplicableDocumentAccess().getNameKeyword_1());
              		
            }
            // InternalSVR.g:2555:3: ( (lv_name_2_0= RULE_STRING ) )
            // InternalSVR.g:2556:4: (lv_name_2_0= RULE_STRING )
            {
            // InternalSVR.g:2556:4: (lv_name_2_0= RULE_STRING )
            // InternalSVR.g:2557:5: lv_name_2_0= RULE_STRING
            {
            lv_name_2_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_73); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_2_0, grammarAccess.getDApplicableDocumentAccess().getNameSTRINGTerminalRuleCall_2_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getDApplicableDocumentRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_2_0,
              						"org.eclipse.xtext.common.Terminals.STRING");
              				
            }

            }


            }

            otherlv_3=(Token)match(input,75,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getDApplicableDocumentAccess().getTitleKeyword_3());
              		
            }
            // InternalSVR.g:2577:3: ( (lv_title_4_0= RULE_STRING ) )
            // InternalSVR.g:2578:4: (lv_title_4_0= RULE_STRING )
            {
            // InternalSVR.g:2578:4: (lv_title_4_0= RULE_STRING )
            // InternalSVR.g:2579:5: lv_title_4_0= RULE_STRING
            {
            lv_title_4_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_title_4_0, grammarAccess.getDApplicableDocumentAccess().getTitleSTRINGTerminalRuleCall_4_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getDApplicableDocumentRule());
              					}
              					setWithLastConsumed(
              						current,
              						"title",
              						lv_title_4_0,
              						"org.eclipse.xtext.common.Terminals.STRING");
              				
            }

            }


            }

            otherlv_5=(Token)match(input,18,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getDApplicableDocumentAccess().getIdKeyword_5());
              		
            }
            // InternalSVR.g:2599:3: ( (lv_id_6_0= RULE_STRING ) )
            // InternalSVR.g:2600:4: (lv_id_6_0= RULE_STRING )
            {
            // InternalSVR.g:2600:4: (lv_id_6_0= RULE_STRING )
            // InternalSVR.g:2601:5: lv_id_6_0= RULE_STRING
            {
            lv_id_6_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_74); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_id_6_0, grammarAccess.getDApplicableDocumentAccess().getIdSTRINGTerminalRuleCall_6_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getDApplicableDocumentRule());
              					}
              					setWithLastConsumed(
              						current,
              						"id",
              						lv_id_6_0,
              						"org.eclipse.xtext.common.Terminals.STRING");
              				
            }

            }


            }

            // InternalSVR.g:2617:3: (otherlv_7= 'issue=' ( (lv_issue_8_0= RULE_UINT_STRING ) ) (otherlv_9= 'revision=' ( (lv_revision_10_0= RULE_UINT_STRING ) ) )? )?
            int alt55=2;
            int LA55_0 = input.LA(1);

            if ( (LA55_0==19) ) {
                alt55=1;
            }
            switch (alt55) {
                case 1 :
                    // InternalSVR.g:2618:4: otherlv_7= 'issue=' ( (lv_issue_8_0= RULE_UINT_STRING ) ) (otherlv_9= 'revision=' ( (lv_revision_10_0= RULE_UINT_STRING ) ) )?
                    {
                    otherlv_7=(Token)match(input,19,FollowSets000.FOLLOW_7); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_7, grammarAccess.getDApplicableDocumentAccess().getIssueKeyword_7_0());
                      			
                    }
                    // InternalSVR.g:2622:4: ( (lv_issue_8_0= RULE_UINT_STRING ) )
                    // InternalSVR.g:2623:5: (lv_issue_8_0= RULE_UINT_STRING )
                    {
                    // InternalSVR.g:2623:5: (lv_issue_8_0= RULE_UINT_STRING )
                    // InternalSVR.g:2624:6: lv_issue_8_0= RULE_UINT_STRING
                    {
                    lv_issue_8_0=(Token)match(input,RULE_UINT_STRING,FollowSets000.FOLLOW_75); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_issue_8_0, grammarAccess.getDApplicableDocumentAccess().getIssueUINT_STRINGTerminalRuleCall_7_1_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getDApplicableDocumentRule());
                      						}
                      						setWithLastConsumed(
                      							current,
                      							"issue",
                      							lv_issue_8_0,
                      							"es.uah.aut.srg.micobs.svm.lang.svr.SVR.UINT_STRING");
                      					
                    }

                    }


                    }

                    // InternalSVR.g:2640:4: (otherlv_9= 'revision=' ( (lv_revision_10_0= RULE_UINT_STRING ) ) )?
                    int alt54=2;
                    int LA54_0 = input.LA(1);

                    if ( (LA54_0==20) ) {
                        alt54=1;
                    }
                    switch (alt54) {
                        case 1 :
                            // InternalSVR.g:2641:5: otherlv_9= 'revision=' ( (lv_revision_10_0= RULE_UINT_STRING ) )
                            {
                            otherlv_9=(Token)match(input,20,FollowSets000.FOLLOW_7); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					newLeafNode(otherlv_9, grammarAccess.getDApplicableDocumentAccess().getRevisionKeyword_7_2_0());
                              				
                            }
                            // InternalSVR.g:2645:5: ( (lv_revision_10_0= RULE_UINT_STRING ) )
                            // InternalSVR.g:2646:6: (lv_revision_10_0= RULE_UINT_STRING )
                            {
                            // InternalSVR.g:2646:6: (lv_revision_10_0= RULE_UINT_STRING )
                            // InternalSVR.g:2647:7: lv_revision_10_0= RULE_UINT_STRING
                            {
                            lv_revision_10_0=(Token)match(input,RULE_UINT_STRING,FollowSets000.FOLLOW_76); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							newLeafNode(lv_revision_10_0, grammarAccess.getDApplicableDocumentAccess().getRevisionUINT_STRINGTerminalRuleCall_7_2_1_0());
                              						
                            }
                            if ( state.backtracking==0 ) {

                              							if (current==null) {
                              								current = createModelElement(grammarAccess.getDApplicableDocumentRule());
                              							}
                              							setWithLastConsumed(
                              								current,
                              								"revision",
                              								lv_revision_10_0,
                              								"es.uah.aut.srg.micobs.svm.lang.svr.SVR.UINT_STRING");
                              						
                            }

                            }


                            }


                            }
                            break;

                    }


                    }
                    break;

            }

            // InternalSVR.g:2665:3: (otherlv_11= 'date=' ( (lv_date_12_0= RULE_STRING ) ) )?
            int alt56=2;
            int LA56_0 = input.LA(1);

            if ( (LA56_0==21) ) {
                alt56=1;
            }
            switch (alt56) {
                case 1 :
                    // InternalSVR.g:2666:4: otherlv_11= 'date=' ( (lv_date_12_0= RULE_STRING ) )
                    {
                    otherlv_11=(Token)match(input,21,FollowSets000.FOLLOW_4); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_11, grammarAccess.getDApplicableDocumentAccess().getDateKeyword_8_0());
                      			
                    }
                    // InternalSVR.g:2670:4: ( (lv_date_12_0= RULE_STRING ) )
                    // InternalSVR.g:2671:5: (lv_date_12_0= RULE_STRING )
                    {
                    // InternalSVR.g:2671:5: (lv_date_12_0= RULE_STRING )
                    // InternalSVR.g:2672:6: lv_date_12_0= RULE_STRING
                    {
                    lv_date_12_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_77); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_date_12_0, grammarAccess.getDApplicableDocumentAccess().getDateSTRINGTerminalRuleCall_8_1_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getDApplicableDocumentRule());
                      						}
                      						setWithLastConsumed(
                      							current,
                      							"date",
                      							lv_date_12_0,
                      							"org.eclipse.xtext.common.Terminals.STRING");
                      					
                    }

                    }


                    }


                    }
                    break;

            }

            // InternalSVR.g:2689:3: (otherlv_13= 'url=' ( (lv_url_14_0= RULE_STRING ) ) )?
            int alt57=2;
            int LA57_0 = input.LA(1);

            if ( (LA57_0==76) ) {
                alt57=1;
            }
            switch (alt57) {
                case 1 :
                    // InternalSVR.g:2690:4: otherlv_13= 'url=' ( (lv_url_14_0= RULE_STRING ) )
                    {
                    otherlv_13=(Token)match(input,76,FollowSets000.FOLLOW_4); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_13, grammarAccess.getDApplicableDocumentAccess().getUrlKeyword_9_0());
                      			
                    }
                    // InternalSVR.g:2694:4: ( (lv_url_14_0= RULE_STRING ) )
                    // InternalSVR.g:2695:5: (lv_url_14_0= RULE_STRING )
                    {
                    // InternalSVR.g:2695:5: (lv_url_14_0= RULE_STRING )
                    // InternalSVR.g:2696:6: lv_url_14_0= RULE_STRING
                    {
                    lv_url_14_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_12); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_url_14_0, grammarAccess.getDApplicableDocumentAccess().getUrlSTRINGTerminalRuleCall_9_1_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getDApplicableDocumentRule());
                      						}
                      						setWithLastConsumed(
                      							current,
                      							"url",
                      							lv_url_14_0,
                      							"org.eclipse.xtext.common.Terminals.STRING");
                      					
                    }

                    }


                    }


                    }
                    break;

            }

            otherlv_15=(Token)match(input,24,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_15, grammarAccess.getDApplicableDocumentAccess().getSolidusGreaterThanSignKeyword_10());
              		
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
    // $ANTLR end "ruleDApplicableDocument"


    // $ANTLR start "entryRuleDReferenceDocument"
    // InternalSVR.g:2721:1: entryRuleDReferenceDocument returns [EObject current=null] : iv_ruleDReferenceDocument= ruleDReferenceDocument EOF ;
    public final EObject entryRuleDReferenceDocument() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDReferenceDocument = null;


        try {
            // InternalSVR.g:2721:59: (iv_ruleDReferenceDocument= ruleDReferenceDocument EOF )
            // InternalSVR.g:2722:2: iv_ruleDReferenceDocument= ruleDReferenceDocument EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDReferenceDocumentRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleDReferenceDocument=ruleDReferenceDocument();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDReferenceDocument; 
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
    // $ANTLR end "entryRuleDReferenceDocument"


    // $ANTLR start "ruleDReferenceDocument"
    // InternalSVR.g:2728:1: ruleDReferenceDocument returns [EObject current=null] : (otherlv_0= '<ReferenceDocument' otherlv_1= 'name=' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= 'title=' ( (lv_title_4_0= RULE_STRING ) ) otherlv_5= 'id=' ( (lv_id_6_0= RULE_STRING ) ) (otherlv_7= 'issue=' ( (lv_issue_8_0= RULE_UINT_STRING ) ) (otherlv_9= 'revision=' ( (lv_revision_10_0= RULE_UINT_STRING ) ) )? )? (otherlv_11= 'date=' ( (lv_date_12_0= RULE_STRING ) ) )? (otherlv_13= 'url=' ( (lv_url_14_0= RULE_STRING ) ) )? otherlv_15= '/>' ) ;
    public final EObject ruleDReferenceDocument() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token lv_title_4_0=null;
        Token otherlv_5=null;
        Token lv_id_6_0=null;
        Token otherlv_7=null;
        Token lv_issue_8_0=null;
        Token otherlv_9=null;
        Token lv_revision_10_0=null;
        Token otherlv_11=null;
        Token lv_date_12_0=null;
        Token otherlv_13=null;
        Token lv_url_14_0=null;
        Token otherlv_15=null;


        	enterRule();

        try {
            // InternalSVR.g:2734:2: ( (otherlv_0= '<ReferenceDocument' otherlv_1= 'name=' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= 'title=' ( (lv_title_4_0= RULE_STRING ) ) otherlv_5= 'id=' ( (lv_id_6_0= RULE_STRING ) ) (otherlv_7= 'issue=' ( (lv_issue_8_0= RULE_UINT_STRING ) ) (otherlv_9= 'revision=' ( (lv_revision_10_0= RULE_UINT_STRING ) ) )? )? (otherlv_11= 'date=' ( (lv_date_12_0= RULE_STRING ) ) )? (otherlv_13= 'url=' ( (lv_url_14_0= RULE_STRING ) ) )? otherlv_15= '/>' ) )
            // InternalSVR.g:2735:2: (otherlv_0= '<ReferenceDocument' otherlv_1= 'name=' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= 'title=' ( (lv_title_4_0= RULE_STRING ) ) otherlv_5= 'id=' ( (lv_id_6_0= RULE_STRING ) ) (otherlv_7= 'issue=' ( (lv_issue_8_0= RULE_UINT_STRING ) ) (otherlv_9= 'revision=' ( (lv_revision_10_0= RULE_UINT_STRING ) ) )? )? (otherlv_11= 'date=' ( (lv_date_12_0= RULE_STRING ) ) )? (otherlv_13= 'url=' ( (lv_url_14_0= RULE_STRING ) ) )? otherlv_15= '/>' )
            {
            // InternalSVR.g:2735:2: (otherlv_0= '<ReferenceDocument' otherlv_1= 'name=' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= 'title=' ( (lv_title_4_0= RULE_STRING ) ) otherlv_5= 'id=' ( (lv_id_6_0= RULE_STRING ) ) (otherlv_7= 'issue=' ( (lv_issue_8_0= RULE_UINT_STRING ) ) (otherlv_9= 'revision=' ( (lv_revision_10_0= RULE_UINT_STRING ) ) )? )? (otherlv_11= 'date=' ( (lv_date_12_0= RULE_STRING ) ) )? (otherlv_13= 'url=' ( (lv_url_14_0= RULE_STRING ) ) )? otherlv_15= '/>' )
            // InternalSVR.g:2736:3: otherlv_0= '<ReferenceDocument' otherlv_1= 'name=' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= 'title=' ( (lv_title_4_0= RULE_STRING ) ) otherlv_5= 'id=' ( (lv_id_6_0= RULE_STRING ) ) (otherlv_7= 'issue=' ( (lv_issue_8_0= RULE_UINT_STRING ) ) (otherlv_9= 'revision=' ( (lv_revision_10_0= RULE_UINT_STRING ) ) )? )? (otherlv_11= 'date=' ( (lv_date_12_0= RULE_STRING ) ) )? (otherlv_13= 'url=' ( (lv_url_14_0= RULE_STRING ) ) )? otherlv_15= '/>'
            {
            otherlv_0=(Token)match(input,77,FollowSets000.FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getDReferenceDocumentAccess().getReferenceDocumentKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,17,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getDReferenceDocumentAccess().getNameKeyword_1());
              		
            }
            // InternalSVR.g:2744:3: ( (lv_name_2_0= RULE_STRING ) )
            // InternalSVR.g:2745:4: (lv_name_2_0= RULE_STRING )
            {
            // InternalSVR.g:2745:4: (lv_name_2_0= RULE_STRING )
            // InternalSVR.g:2746:5: lv_name_2_0= RULE_STRING
            {
            lv_name_2_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_73); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_2_0, grammarAccess.getDReferenceDocumentAccess().getNameSTRINGTerminalRuleCall_2_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getDReferenceDocumentRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_2_0,
              						"org.eclipse.xtext.common.Terminals.STRING");
              				
            }

            }


            }

            otherlv_3=(Token)match(input,75,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getDReferenceDocumentAccess().getTitleKeyword_3());
              		
            }
            // InternalSVR.g:2766:3: ( (lv_title_4_0= RULE_STRING ) )
            // InternalSVR.g:2767:4: (lv_title_4_0= RULE_STRING )
            {
            // InternalSVR.g:2767:4: (lv_title_4_0= RULE_STRING )
            // InternalSVR.g:2768:5: lv_title_4_0= RULE_STRING
            {
            lv_title_4_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_title_4_0, grammarAccess.getDReferenceDocumentAccess().getTitleSTRINGTerminalRuleCall_4_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getDReferenceDocumentRule());
              					}
              					setWithLastConsumed(
              						current,
              						"title",
              						lv_title_4_0,
              						"org.eclipse.xtext.common.Terminals.STRING");
              				
            }

            }


            }

            otherlv_5=(Token)match(input,18,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getDReferenceDocumentAccess().getIdKeyword_5());
              		
            }
            // InternalSVR.g:2788:3: ( (lv_id_6_0= RULE_STRING ) )
            // InternalSVR.g:2789:4: (lv_id_6_0= RULE_STRING )
            {
            // InternalSVR.g:2789:4: (lv_id_6_0= RULE_STRING )
            // InternalSVR.g:2790:5: lv_id_6_0= RULE_STRING
            {
            lv_id_6_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_74); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_id_6_0, grammarAccess.getDReferenceDocumentAccess().getIdSTRINGTerminalRuleCall_6_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getDReferenceDocumentRule());
              					}
              					setWithLastConsumed(
              						current,
              						"id",
              						lv_id_6_0,
              						"org.eclipse.xtext.common.Terminals.STRING");
              				
            }

            }


            }

            // InternalSVR.g:2806:3: (otherlv_7= 'issue=' ( (lv_issue_8_0= RULE_UINT_STRING ) ) (otherlv_9= 'revision=' ( (lv_revision_10_0= RULE_UINT_STRING ) ) )? )?
            int alt59=2;
            int LA59_0 = input.LA(1);

            if ( (LA59_0==19) ) {
                alt59=1;
            }
            switch (alt59) {
                case 1 :
                    // InternalSVR.g:2807:4: otherlv_7= 'issue=' ( (lv_issue_8_0= RULE_UINT_STRING ) ) (otherlv_9= 'revision=' ( (lv_revision_10_0= RULE_UINT_STRING ) ) )?
                    {
                    otherlv_7=(Token)match(input,19,FollowSets000.FOLLOW_7); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_7, grammarAccess.getDReferenceDocumentAccess().getIssueKeyword_7_0());
                      			
                    }
                    // InternalSVR.g:2811:4: ( (lv_issue_8_0= RULE_UINT_STRING ) )
                    // InternalSVR.g:2812:5: (lv_issue_8_0= RULE_UINT_STRING )
                    {
                    // InternalSVR.g:2812:5: (lv_issue_8_0= RULE_UINT_STRING )
                    // InternalSVR.g:2813:6: lv_issue_8_0= RULE_UINT_STRING
                    {
                    lv_issue_8_0=(Token)match(input,RULE_UINT_STRING,FollowSets000.FOLLOW_75); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_issue_8_0, grammarAccess.getDReferenceDocumentAccess().getIssueUINT_STRINGTerminalRuleCall_7_1_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getDReferenceDocumentRule());
                      						}
                      						setWithLastConsumed(
                      							current,
                      							"issue",
                      							lv_issue_8_0,
                      							"es.uah.aut.srg.micobs.svm.lang.svr.SVR.UINT_STRING");
                      					
                    }

                    }


                    }

                    // InternalSVR.g:2829:4: (otherlv_9= 'revision=' ( (lv_revision_10_0= RULE_UINT_STRING ) ) )?
                    int alt58=2;
                    int LA58_0 = input.LA(1);

                    if ( (LA58_0==20) ) {
                        alt58=1;
                    }
                    switch (alt58) {
                        case 1 :
                            // InternalSVR.g:2830:5: otherlv_9= 'revision=' ( (lv_revision_10_0= RULE_UINT_STRING ) )
                            {
                            otherlv_9=(Token)match(input,20,FollowSets000.FOLLOW_7); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					newLeafNode(otherlv_9, grammarAccess.getDReferenceDocumentAccess().getRevisionKeyword_7_2_0());
                              				
                            }
                            // InternalSVR.g:2834:5: ( (lv_revision_10_0= RULE_UINT_STRING ) )
                            // InternalSVR.g:2835:6: (lv_revision_10_0= RULE_UINT_STRING )
                            {
                            // InternalSVR.g:2835:6: (lv_revision_10_0= RULE_UINT_STRING )
                            // InternalSVR.g:2836:7: lv_revision_10_0= RULE_UINT_STRING
                            {
                            lv_revision_10_0=(Token)match(input,RULE_UINT_STRING,FollowSets000.FOLLOW_76); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							newLeafNode(lv_revision_10_0, grammarAccess.getDReferenceDocumentAccess().getRevisionUINT_STRINGTerminalRuleCall_7_2_1_0());
                              						
                            }
                            if ( state.backtracking==0 ) {

                              							if (current==null) {
                              								current = createModelElement(grammarAccess.getDReferenceDocumentRule());
                              							}
                              							setWithLastConsumed(
                              								current,
                              								"revision",
                              								lv_revision_10_0,
                              								"es.uah.aut.srg.micobs.svm.lang.svr.SVR.UINT_STRING");
                              						
                            }

                            }


                            }


                            }
                            break;

                    }


                    }
                    break;

            }

            // InternalSVR.g:2854:3: (otherlv_11= 'date=' ( (lv_date_12_0= RULE_STRING ) ) )?
            int alt60=2;
            int LA60_0 = input.LA(1);

            if ( (LA60_0==21) ) {
                alt60=1;
            }
            switch (alt60) {
                case 1 :
                    // InternalSVR.g:2855:4: otherlv_11= 'date=' ( (lv_date_12_0= RULE_STRING ) )
                    {
                    otherlv_11=(Token)match(input,21,FollowSets000.FOLLOW_4); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_11, grammarAccess.getDReferenceDocumentAccess().getDateKeyword_8_0());
                      			
                    }
                    // InternalSVR.g:2859:4: ( (lv_date_12_0= RULE_STRING ) )
                    // InternalSVR.g:2860:5: (lv_date_12_0= RULE_STRING )
                    {
                    // InternalSVR.g:2860:5: (lv_date_12_0= RULE_STRING )
                    // InternalSVR.g:2861:6: lv_date_12_0= RULE_STRING
                    {
                    lv_date_12_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_77); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_date_12_0, grammarAccess.getDReferenceDocumentAccess().getDateSTRINGTerminalRuleCall_8_1_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getDReferenceDocumentRule());
                      						}
                      						setWithLastConsumed(
                      							current,
                      							"date",
                      							lv_date_12_0,
                      							"org.eclipse.xtext.common.Terminals.STRING");
                      					
                    }

                    }


                    }


                    }
                    break;

            }

            // InternalSVR.g:2878:3: (otherlv_13= 'url=' ( (lv_url_14_0= RULE_STRING ) ) )?
            int alt61=2;
            int LA61_0 = input.LA(1);

            if ( (LA61_0==76) ) {
                alt61=1;
            }
            switch (alt61) {
                case 1 :
                    // InternalSVR.g:2879:4: otherlv_13= 'url=' ( (lv_url_14_0= RULE_STRING ) )
                    {
                    otherlv_13=(Token)match(input,76,FollowSets000.FOLLOW_4); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_13, grammarAccess.getDReferenceDocumentAccess().getUrlKeyword_9_0());
                      			
                    }
                    // InternalSVR.g:2883:4: ( (lv_url_14_0= RULE_STRING ) )
                    // InternalSVR.g:2884:5: (lv_url_14_0= RULE_STRING )
                    {
                    // InternalSVR.g:2884:5: (lv_url_14_0= RULE_STRING )
                    // InternalSVR.g:2885:6: lv_url_14_0= RULE_STRING
                    {
                    lv_url_14_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_12); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_url_14_0, grammarAccess.getDReferenceDocumentAccess().getUrlSTRINGTerminalRuleCall_9_1_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getDReferenceDocumentRule());
                      						}
                      						setWithLastConsumed(
                      							current,
                      							"url",
                      							lv_url_14_0,
                      							"org.eclipse.xtext.common.Terminals.STRING");
                      					
                    }

                    }


                    }


                    }
                    break;

            }

            otherlv_15=(Token)match(input,24,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_15, grammarAccess.getDReferenceDocumentAccess().getSolidusGreaterThanSignKeyword_10());
              		
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
    // $ANTLR end "ruleDReferenceDocument"


    // $ANTLR start "entryRuleVSVRFixedSection"
    // InternalSVR.g:2910:1: entryRuleVSVRFixedSection returns [EObject current=null] : iv_ruleVSVRFixedSection= ruleVSVRFixedSection EOF ;
    public final EObject entryRuleVSVRFixedSection() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVSVRFixedSection = null;


        try {
            // InternalSVR.g:2910:57: (iv_ruleVSVRFixedSection= ruleVSVRFixedSection EOF )
            // InternalSVR.g:2911:2: iv_ruleVSVRFixedSection= ruleVSVRFixedSection EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getVSVRFixedSectionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleVSVRFixedSection=ruleVSVRFixedSection();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleVSVRFixedSection; 
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
    // $ANTLR end "entryRuleVSVRFixedSection"


    // $ANTLR start "ruleVSVRFixedSection"
    // InternalSVR.g:2917:1: ruleVSVRFixedSection returns [EObject current=null] : ( () ( (lv_body_1_0= ruleDBody ) )? ( (lv_svrInstatiableSubsections_2_0= ruleVSVRInstantiableSection ) )* ) ;
    public final EObject ruleVSVRFixedSection() throws RecognitionException {
        EObject current = null;

        EObject lv_body_1_0 = null;

        EObject lv_svrInstatiableSubsections_2_0 = null;



        	enterRule();

        try {
            // InternalSVR.g:2923:2: ( ( () ( (lv_body_1_0= ruleDBody ) )? ( (lv_svrInstatiableSubsections_2_0= ruleVSVRInstantiableSection ) )* ) )
            // InternalSVR.g:2924:2: ( () ( (lv_body_1_0= ruleDBody ) )? ( (lv_svrInstatiableSubsections_2_0= ruleVSVRInstantiableSection ) )* )
            {
            // InternalSVR.g:2924:2: ( () ( (lv_body_1_0= ruleDBody ) )? ( (lv_svrInstatiableSubsections_2_0= ruleVSVRInstantiableSection ) )* )
            // InternalSVR.g:2925:3: () ( (lv_body_1_0= ruleDBody ) )? ( (lv_svrInstatiableSubsections_2_0= ruleVSVRInstantiableSection ) )*
            {
            // InternalSVR.g:2925:3: ()
            // InternalSVR.g:2926:4: 
            {
            if ( state.backtracking==0 ) {

              				/* */
              			
            }
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getVSVRFixedSectionAccess().getVSVRFixedSectionAction_0(),
              					current);
              			
            }

            }

            // InternalSVR.g:2935:3: ( (lv_body_1_0= ruleDBody ) )?
            int alt62=2;
            int LA62_0 = input.LA(1);

            if ( (LA62_0==34) ) {
                alt62=1;
            }
            switch (alt62) {
                case 1 :
                    // InternalSVR.g:2936:4: (lv_body_1_0= ruleDBody )
                    {
                    // InternalSVR.g:2936:4: (lv_body_1_0= ruleDBody )
                    // InternalSVR.g:2937:5: lv_body_1_0= ruleDBody
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getVSVRFixedSectionAccess().getBodyDBodyParserRuleCall_1_0());
                      				
                    }
                    pushFollow(FollowSets000.FOLLOW_78);
                    lv_body_1_0=ruleDBody();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getVSVRFixedSectionRule());
                      					}
                      					set(
                      						current,
                      						"body",
                      						lv_body_1_0,
                      						"es.uah.aut.srg.micobs.svm.lang.svr.SVR.DBody");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }
                    break;

            }

            // InternalSVR.g:2954:3: ( (lv_svrInstatiableSubsections_2_0= ruleVSVRInstantiableSection ) )*
            loop63:
            do {
                int alt63=2;
                int LA63_0 = input.LA(1);

                if ( (LA63_0==78) ) {
                    alt63=1;
                }


                switch (alt63) {
            	case 1 :
            	    // InternalSVR.g:2955:4: (lv_svrInstatiableSubsections_2_0= ruleVSVRInstantiableSection )
            	    {
            	    // InternalSVR.g:2955:4: (lv_svrInstatiableSubsections_2_0= ruleVSVRInstantiableSection )
            	    // InternalSVR.g:2956:5: lv_svrInstatiableSubsections_2_0= ruleVSVRInstantiableSection
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getVSVRFixedSectionAccess().getSvrInstatiableSubsectionsVSVRInstantiableSectionParserRuleCall_2_0());
            	      				
            	    }
            	    pushFollow(FollowSets000.FOLLOW_78);
            	    lv_svrInstatiableSubsections_2_0=ruleVSVRInstantiableSection();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getVSVRFixedSectionRule());
            	      					}
            	      					add(
            	      						current,
            	      						"svrInstatiableSubsections",
            	      						lv_svrInstatiableSubsections_2_0,
            	      						"es.uah.aut.srg.micobs.svm.lang.svr.SVR.VSVRInstantiableSection");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop63;
                }
            } while (true);


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
    // $ANTLR end "ruleVSVRFixedSection"


    // $ANTLR start "entryRuleVSVRInstantiableSection"
    // InternalSVR.g:2977:1: entryRuleVSVRInstantiableSection returns [EObject current=null] : iv_ruleVSVRInstantiableSection= ruleVSVRInstantiableSection EOF ;
    public final EObject entryRuleVSVRInstantiableSection() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVSVRInstantiableSection = null;


        try {
            // InternalSVR.g:2977:64: (iv_ruleVSVRInstantiableSection= ruleVSVRInstantiableSection EOF )
            // InternalSVR.g:2978:2: iv_ruleVSVRInstantiableSection= ruleVSVRInstantiableSection EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getVSVRInstantiableSectionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleVSVRInstantiableSection=ruleVSVRInstantiableSection();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleVSVRInstantiableSection; 
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
    // $ANTLR end "entryRuleVSVRInstantiableSection"


    // $ANTLR start "ruleVSVRInstantiableSection"
    // InternalSVR.g:2984:1: ruleVSVRInstantiableSection returns [EObject current=null] : (otherlv_0= '<subsection' otherlv_1= 'name=' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= '>' ( (lv_body_4_0= ruleDBody ) )? ( (lv_svrInstatiableSubsections_5_0= ruleVSVRInstantiableSection ) )* otherlv_6= '</subsection>' ) ;
    public final EObject ruleVSVRInstantiableSection() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_6=null;
        EObject lv_body_4_0 = null;

        EObject lv_svrInstatiableSubsections_5_0 = null;



        	enterRule();

        try {
            // InternalSVR.g:2990:2: ( (otherlv_0= '<subsection' otherlv_1= 'name=' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= '>' ( (lv_body_4_0= ruleDBody ) )? ( (lv_svrInstatiableSubsections_5_0= ruleVSVRInstantiableSection ) )* otherlv_6= '</subsection>' ) )
            // InternalSVR.g:2991:2: (otherlv_0= '<subsection' otherlv_1= 'name=' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= '>' ( (lv_body_4_0= ruleDBody ) )? ( (lv_svrInstatiableSubsections_5_0= ruleVSVRInstantiableSection ) )* otherlv_6= '</subsection>' )
            {
            // InternalSVR.g:2991:2: (otherlv_0= '<subsection' otherlv_1= 'name=' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= '>' ( (lv_body_4_0= ruleDBody ) )? ( (lv_svrInstatiableSubsections_5_0= ruleVSVRInstantiableSection ) )* otherlv_6= '</subsection>' )
            // InternalSVR.g:2992:3: otherlv_0= '<subsection' otherlv_1= 'name=' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= '>' ( (lv_body_4_0= ruleDBody ) )? ( (lv_svrInstatiableSubsections_5_0= ruleVSVRInstantiableSection ) )* otherlv_6= '</subsection>'
            {
            otherlv_0=(Token)match(input,78,FollowSets000.FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getVSVRInstantiableSectionAccess().getSubsectionKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,17,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getVSVRInstantiableSectionAccess().getNameKeyword_1());
              		
            }
            // InternalSVR.g:3000:3: ( (lv_name_2_0= RULE_STRING ) )
            // InternalSVR.g:3001:4: (lv_name_2_0= RULE_STRING )
            {
            // InternalSVR.g:3001:4: (lv_name_2_0= RULE_STRING )
            // InternalSVR.g:3002:5: lv_name_2_0= RULE_STRING
            {
            lv_name_2_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_10); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_2_0, grammarAccess.getVSVRInstantiableSectionAccess().getNameSTRINGTerminalRuleCall_2_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getVSVRInstantiableSectionRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_2_0,
              						"org.eclipse.xtext.common.Terminals.STRING");
              				
            }

            }


            }

            otherlv_3=(Token)match(input,22,FollowSets000.FOLLOW_79); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getVSVRInstantiableSectionAccess().getGreaterThanSignKeyword_3());
              		
            }
            // InternalSVR.g:3022:3: ( (lv_body_4_0= ruleDBody ) )?
            int alt64=2;
            int LA64_0 = input.LA(1);

            if ( (LA64_0==34) ) {
                alt64=1;
            }
            switch (alt64) {
                case 1 :
                    // InternalSVR.g:3023:4: (lv_body_4_0= ruleDBody )
                    {
                    // InternalSVR.g:3023:4: (lv_body_4_0= ruleDBody )
                    // InternalSVR.g:3024:5: lv_body_4_0= ruleDBody
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getVSVRInstantiableSectionAccess().getBodyDBodyParserRuleCall_4_0());
                      				
                    }
                    pushFollow(FollowSets000.FOLLOW_80);
                    lv_body_4_0=ruleDBody();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getVSVRInstantiableSectionRule());
                      					}
                      					set(
                      						current,
                      						"body",
                      						lv_body_4_0,
                      						"es.uah.aut.srg.micobs.svm.lang.svr.SVR.DBody");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }
                    break;

            }

            // InternalSVR.g:3041:3: ( (lv_svrInstatiableSubsections_5_0= ruleVSVRInstantiableSection ) )*
            loop65:
            do {
                int alt65=2;
                int LA65_0 = input.LA(1);

                if ( (LA65_0==78) ) {
                    alt65=1;
                }


                switch (alt65) {
            	case 1 :
            	    // InternalSVR.g:3042:4: (lv_svrInstatiableSubsections_5_0= ruleVSVRInstantiableSection )
            	    {
            	    // InternalSVR.g:3042:4: (lv_svrInstatiableSubsections_5_0= ruleVSVRInstantiableSection )
            	    // InternalSVR.g:3043:5: lv_svrInstatiableSubsections_5_0= ruleVSVRInstantiableSection
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getVSVRInstantiableSectionAccess().getSvrInstatiableSubsectionsVSVRInstantiableSectionParserRuleCall_5_0());
            	      				
            	    }
            	    pushFollow(FollowSets000.FOLLOW_80);
            	    lv_svrInstatiableSubsections_5_0=ruleVSVRInstantiableSection();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getVSVRInstantiableSectionRule());
            	      					}
            	      					add(
            	      						current,
            	      						"svrInstatiableSubsections",
            	      						lv_svrInstatiableSubsections_5_0,
            	      						"es.uah.aut.srg.micobs.svm.lang.svr.SVR.VSVRInstantiableSection");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop65;
                }
            } while (true);

            otherlv_6=(Token)match(input,79,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_6, grammarAccess.getVSVRInstantiableSectionAccess().getSubsectionKeyword_6());
              		
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
    // $ANTLR end "ruleVSVRInstantiableSection"


    // $ANTLR start "entryRuleVSVRIntroduction"
    // InternalSVR.g:3068:1: entryRuleVSVRIntroduction returns [EObject current=null] : iv_ruleVSVRIntroduction= ruleVSVRIntroduction EOF ;
    public final EObject entryRuleVSVRIntroduction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVSVRIntroduction = null;


        try {
            // InternalSVR.g:3068:57: (iv_ruleVSVRIntroduction= ruleVSVRIntroduction EOF )
            // InternalSVR.g:3069:2: iv_ruleVSVRIntroduction= ruleVSVRIntroduction EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getVSVRIntroductionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleVSVRIntroduction=ruleVSVRIntroduction();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleVSVRIntroduction; 
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
    // $ANTLR end "entryRuleVSVRIntroduction"


    // $ANTLR start "ruleVSVRIntroduction"
    // InternalSVR.g:3075:1: ruleVSVRIntroduction returns [EObject current=null] : (otherlv_0= '<Introduction>' ( (lv_svrInstatiableSubsections_1_0= ruleVSVRInstantiableSection ) )+ otherlv_2= '</Introduction>' ) ;
    public final EObject ruleVSVRIntroduction() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_svrInstatiableSubsections_1_0 = null;



        	enterRule();

        try {
            // InternalSVR.g:3081:2: ( (otherlv_0= '<Introduction>' ( (lv_svrInstatiableSubsections_1_0= ruleVSVRInstantiableSection ) )+ otherlv_2= '</Introduction>' ) )
            // InternalSVR.g:3082:2: (otherlv_0= '<Introduction>' ( (lv_svrInstatiableSubsections_1_0= ruleVSVRInstantiableSection ) )+ otherlv_2= '</Introduction>' )
            {
            // InternalSVR.g:3082:2: (otherlv_0= '<Introduction>' ( (lv_svrInstatiableSubsections_1_0= ruleVSVRInstantiableSection ) )+ otherlv_2= '</Introduction>' )
            // InternalSVR.g:3083:3: otherlv_0= '<Introduction>' ( (lv_svrInstatiableSubsections_1_0= ruleVSVRInstantiableSection ) )+ otherlv_2= '</Introduction>'
            {
            otherlv_0=(Token)match(input,80,FollowSets000.FOLLOW_81); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getVSVRIntroductionAccess().getIntroductionKeyword_0());
              		
            }
            // InternalSVR.g:3087:3: ( (lv_svrInstatiableSubsections_1_0= ruleVSVRInstantiableSection ) )+
            int cnt66=0;
            loop66:
            do {
                int alt66=2;
                int LA66_0 = input.LA(1);

                if ( (LA66_0==78) ) {
                    alt66=1;
                }


                switch (alt66) {
            	case 1 :
            	    // InternalSVR.g:3088:4: (lv_svrInstatiableSubsections_1_0= ruleVSVRInstantiableSection )
            	    {
            	    // InternalSVR.g:3088:4: (lv_svrInstatiableSubsections_1_0= ruleVSVRInstantiableSection )
            	    // InternalSVR.g:3089:5: lv_svrInstatiableSubsections_1_0= ruleVSVRInstantiableSection
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getVSVRIntroductionAccess().getSvrInstatiableSubsectionsVSVRInstantiableSectionParserRuleCall_1_0());
            	      				
            	    }
            	    pushFollow(FollowSets000.FOLLOW_82);
            	    lv_svrInstatiableSubsections_1_0=ruleVSVRInstantiableSection();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getVSVRIntroductionRule());
            	      					}
            	      					add(
            	      						current,
            	      						"svrInstatiableSubsections",
            	      						lv_svrInstatiableSubsections_1_0,
            	      						"es.uah.aut.srg.micobs.svm.lang.svr.SVR.VSVRInstantiableSection");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt66 >= 1 ) break loop66;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(66, input);
                        throw eee;
                }
                cnt66++;
            } while (true);

            otherlv_2=(Token)match(input,81,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getVSVRIntroductionAccess().getIntroductionKeyword_2());
              		
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
    // $ANTLR end "ruleVSVRIntroduction"


    // $ANTLR start "entryRuleVSVRApplicableDocuments"
    // InternalSVR.g:3114:1: entryRuleVSVRApplicableDocuments returns [EObject current=null] : iv_ruleVSVRApplicableDocuments= ruleVSVRApplicableDocuments EOF ;
    public final EObject entryRuleVSVRApplicableDocuments() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVSVRApplicableDocuments = null;


        try {
            // InternalSVR.g:3114:64: (iv_ruleVSVRApplicableDocuments= ruleVSVRApplicableDocuments EOF )
            // InternalSVR.g:3115:2: iv_ruleVSVRApplicableDocuments= ruleVSVRApplicableDocuments EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getVSVRApplicableDocumentsRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleVSVRApplicableDocuments=ruleVSVRApplicableDocuments();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleVSVRApplicableDocuments; 
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
    // $ANTLR end "entryRuleVSVRApplicableDocuments"


    // $ANTLR start "ruleVSVRApplicableDocuments"
    // InternalSVR.g:3121:1: ruleVSVRApplicableDocuments returns [EObject current=null] : ( () otherlv_1= '<ApplicableDocuments>' ( (lv_applicableDocuments_2_0= ruleDApplicableDocument ) )* otherlv_3= '</ApplicableDocuments>' ) ;
    public final EObject ruleVSVRApplicableDocuments() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_applicableDocuments_2_0 = null;



        	enterRule();

        try {
            // InternalSVR.g:3127:2: ( ( () otherlv_1= '<ApplicableDocuments>' ( (lv_applicableDocuments_2_0= ruleDApplicableDocument ) )* otherlv_3= '</ApplicableDocuments>' ) )
            // InternalSVR.g:3128:2: ( () otherlv_1= '<ApplicableDocuments>' ( (lv_applicableDocuments_2_0= ruleDApplicableDocument ) )* otherlv_3= '</ApplicableDocuments>' )
            {
            // InternalSVR.g:3128:2: ( () otherlv_1= '<ApplicableDocuments>' ( (lv_applicableDocuments_2_0= ruleDApplicableDocument ) )* otherlv_3= '</ApplicableDocuments>' )
            // InternalSVR.g:3129:3: () otherlv_1= '<ApplicableDocuments>' ( (lv_applicableDocuments_2_0= ruleDApplicableDocument ) )* otherlv_3= '</ApplicableDocuments>'
            {
            // InternalSVR.g:3129:3: ()
            // InternalSVR.g:3130:4: 
            {
            if ( state.backtracking==0 ) {

              				/* */
              			
            }
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getVSVRApplicableDocumentsAccess().getVSVRApplicableDocumentsAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,82,FollowSets000.FOLLOW_83); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getVSVRApplicableDocumentsAccess().getApplicableDocumentsKeyword_1());
              		
            }
            // InternalSVR.g:3143:3: ( (lv_applicableDocuments_2_0= ruleDApplicableDocument ) )*
            loop67:
            do {
                int alt67=2;
                int LA67_0 = input.LA(1);

                if ( (LA67_0==74) ) {
                    alt67=1;
                }


                switch (alt67) {
            	case 1 :
            	    // InternalSVR.g:3144:4: (lv_applicableDocuments_2_0= ruleDApplicableDocument )
            	    {
            	    // InternalSVR.g:3144:4: (lv_applicableDocuments_2_0= ruleDApplicableDocument )
            	    // InternalSVR.g:3145:5: lv_applicableDocuments_2_0= ruleDApplicableDocument
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getVSVRApplicableDocumentsAccess().getApplicableDocumentsDApplicableDocumentParserRuleCall_2_0());
            	      				
            	    }
            	    pushFollow(FollowSets000.FOLLOW_83);
            	    lv_applicableDocuments_2_0=ruleDApplicableDocument();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getVSVRApplicableDocumentsRule());
            	      					}
            	      					add(
            	      						current,
            	      						"applicableDocuments",
            	      						lv_applicableDocuments_2_0,
            	      						"es.uah.aut.srg.micobs.svm.lang.svr.SVR.DApplicableDocument");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop67;
                }
            } while (true);

            otherlv_3=(Token)match(input,83,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getVSVRApplicableDocumentsAccess().getApplicableDocumentsKeyword_3());
              		
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
    // $ANTLR end "ruleVSVRApplicableDocuments"


    // $ANTLR start "entryRuleVSVRReferenceDocuments"
    // InternalSVR.g:3170:1: entryRuleVSVRReferenceDocuments returns [EObject current=null] : iv_ruleVSVRReferenceDocuments= ruleVSVRReferenceDocuments EOF ;
    public final EObject entryRuleVSVRReferenceDocuments() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVSVRReferenceDocuments = null;


        try {
            // InternalSVR.g:3170:63: (iv_ruleVSVRReferenceDocuments= ruleVSVRReferenceDocuments EOF )
            // InternalSVR.g:3171:2: iv_ruleVSVRReferenceDocuments= ruleVSVRReferenceDocuments EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getVSVRReferenceDocumentsRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleVSVRReferenceDocuments=ruleVSVRReferenceDocuments();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleVSVRReferenceDocuments; 
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
    // $ANTLR end "entryRuleVSVRReferenceDocuments"


    // $ANTLR start "ruleVSVRReferenceDocuments"
    // InternalSVR.g:3177:1: ruleVSVRReferenceDocuments returns [EObject current=null] : ( () otherlv_1= '<ReferenceDocuments>' ( (lv_referenceDocuments_2_0= ruleDReferenceDocument ) )* otherlv_3= '</ReferenceDocuments>' ) ;
    public final EObject ruleVSVRReferenceDocuments() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_referenceDocuments_2_0 = null;



        	enterRule();

        try {
            // InternalSVR.g:3183:2: ( ( () otherlv_1= '<ReferenceDocuments>' ( (lv_referenceDocuments_2_0= ruleDReferenceDocument ) )* otherlv_3= '</ReferenceDocuments>' ) )
            // InternalSVR.g:3184:2: ( () otherlv_1= '<ReferenceDocuments>' ( (lv_referenceDocuments_2_0= ruleDReferenceDocument ) )* otherlv_3= '</ReferenceDocuments>' )
            {
            // InternalSVR.g:3184:2: ( () otherlv_1= '<ReferenceDocuments>' ( (lv_referenceDocuments_2_0= ruleDReferenceDocument ) )* otherlv_3= '</ReferenceDocuments>' )
            // InternalSVR.g:3185:3: () otherlv_1= '<ReferenceDocuments>' ( (lv_referenceDocuments_2_0= ruleDReferenceDocument ) )* otherlv_3= '</ReferenceDocuments>'
            {
            // InternalSVR.g:3185:3: ()
            // InternalSVR.g:3186:4: 
            {
            if ( state.backtracking==0 ) {

              				/* */
              			
            }
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getVSVRReferenceDocumentsAccess().getVSVRReferenceDocumentsAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,84,FollowSets000.FOLLOW_84); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getVSVRReferenceDocumentsAccess().getReferenceDocumentsKeyword_1());
              		
            }
            // InternalSVR.g:3199:3: ( (lv_referenceDocuments_2_0= ruleDReferenceDocument ) )*
            loop68:
            do {
                int alt68=2;
                int LA68_0 = input.LA(1);

                if ( (LA68_0==77) ) {
                    alt68=1;
                }


                switch (alt68) {
            	case 1 :
            	    // InternalSVR.g:3200:4: (lv_referenceDocuments_2_0= ruleDReferenceDocument )
            	    {
            	    // InternalSVR.g:3200:4: (lv_referenceDocuments_2_0= ruleDReferenceDocument )
            	    // InternalSVR.g:3201:5: lv_referenceDocuments_2_0= ruleDReferenceDocument
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getVSVRReferenceDocumentsAccess().getReferenceDocumentsDReferenceDocumentParserRuleCall_2_0());
            	      				
            	    }
            	    pushFollow(FollowSets000.FOLLOW_84);
            	    lv_referenceDocuments_2_0=ruleDReferenceDocument();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getVSVRReferenceDocumentsRule());
            	      					}
            	      					add(
            	      						current,
            	      						"referenceDocuments",
            	      						lv_referenceDocuments_2_0,
            	      						"es.uah.aut.srg.micobs.svm.lang.svr.SVR.DReferenceDocument");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop68;
                }
            } while (true);

            otherlv_3=(Token)match(input,85,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getVSVRReferenceDocumentsAccess().getReferenceDocumentsKeyword_3());
              		
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
    // $ANTLR end "ruleVSVRReferenceDocuments"


    // $ANTLR start "entryRuleVSVRTermsDefinitionsAbbreviations"
    // InternalSVR.g:3226:1: entryRuleVSVRTermsDefinitionsAbbreviations returns [EObject current=null] : iv_ruleVSVRTermsDefinitionsAbbreviations= ruleVSVRTermsDefinitionsAbbreviations EOF ;
    public final EObject entryRuleVSVRTermsDefinitionsAbbreviations() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVSVRTermsDefinitionsAbbreviations = null;


        try {
            // InternalSVR.g:3226:74: (iv_ruleVSVRTermsDefinitionsAbbreviations= ruleVSVRTermsDefinitionsAbbreviations EOF )
            // InternalSVR.g:3227:2: iv_ruleVSVRTermsDefinitionsAbbreviations= ruleVSVRTermsDefinitionsAbbreviations EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getVSVRTermsDefinitionsAbbreviationsRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleVSVRTermsDefinitionsAbbreviations=ruleVSVRTermsDefinitionsAbbreviations();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleVSVRTermsDefinitionsAbbreviations; 
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
    // $ANTLR end "entryRuleVSVRTermsDefinitionsAbbreviations"


    // $ANTLR start "ruleVSVRTermsDefinitionsAbbreviations"
    // InternalSVR.g:3233:1: ruleVSVRTermsDefinitionsAbbreviations returns [EObject current=null] : ( () otherlv_1= '<TermsDefinitionsAbbreviations>' ( (lv_terms_2_0= ruleVSVRTerm ) )* ( (lv_definitions_3_0= ruleVSVRDefinition ) )* ( (lv_abbreviations_4_0= ruleVSVRAbbreviation ) )* otherlv_5= '</TermsDefinitionsAbbreviations>' ) ;
    public final EObject ruleVSVRTermsDefinitionsAbbreviations() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_5=null;
        EObject lv_terms_2_0 = null;

        EObject lv_definitions_3_0 = null;

        EObject lv_abbreviations_4_0 = null;



        	enterRule();

        try {
            // InternalSVR.g:3239:2: ( ( () otherlv_1= '<TermsDefinitionsAbbreviations>' ( (lv_terms_2_0= ruleVSVRTerm ) )* ( (lv_definitions_3_0= ruleVSVRDefinition ) )* ( (lv_abbreviations_4_0= ruleVSVRAbbreviation ) )* otherlv_5= '</TermsDefinitionsAbbreviations>' ) )
            // InternalSVR.g:3240:2: ( () otherlv_1= '<TermsDefinitionsAbbreviations>' ( (lv_terms_2_0= ruleVSVRTerm ) )* ( (lv_definitions_3_0= ruleVSVRDefinition ) )* ( (lv_abbreviations_4_0= ruleVSVRAbbreviation ) )* otherlv_5= '</TermsDefinitionsAbbreviations>' )
            {
            // InternalSVR.g:3240:2: ( () otherlv_1= '<TermsDefinitionsAbbreviations>' ( (lv_terms_2_0= ruleVSVRTerm ) )* ( (lv_definitions_3_0= ruleVSVRDefinition ) )* ( (lv_abbreviations_4_0= ruleVSVRAbbreviation ) )* otherlv_5= '</TermsDefinitionsAbbreviations>' )
            // InternalSVR.g:3241:3: () otherlv_1= '<TermsDefinitionsAbbreviations>' ( (lv_terms_2_0= ruleVSVRTerm ) )* ( (lv_definitions_3_0= ruleVSVRDefinition ) )* ( (lv_abbreviations_4_0= ruleVSVRAbbreviation ) )* otherlv_5= '</TermsDefinitionsAbbreviations>'
            {
            // InternalSVR.g:3241:3: ()
            // InternalSVR.g:3242:4: 
            {
            if ( state.backtracking==0 ) {

              				/* */
              			
            }
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getVSVRTermsDefinitionsAbbreviationsAccess().getVSVRTermsDefinitionsAbbreviationsAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,86,FollowSets000.FOLLOW_85); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getVSVRTermsDefinitionsAbbreviationsAccess().getTermsDefinitionsAbbreviationsKeyword_1());
              		
            }
            // InternalSVR.g:3255:3: ( (lv_terms_2_0= ruleVSVRTerm ) )*
            loop69:
            do {
                int alt69=2;
                int LA69_0 = input.LA(1);

                if ( (LA69_0==88) ) {
                    alt69=1;
                }


                switch (alt69) {
            	case 1 :
            	    // InternalSVR.g:3256:4: (lv_terms_2_0= ruleVSVRTerm )
            	    {
            	    // InternalSVR.g:3256:4: (lv_terms_2_0= ruleVSVRTerm )
            	    // InternalSVR.g:3257:5: lv_terms_2_0= ruleVSVRTerm
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getVSVRTermsDefinitionsAbbreviationsAccess().getTermsVSVRTermParserRuleCall_2_0());
            	      				
            	    }
            	    pushFollow(FollowSets000.FOLLOW_85);
            	    lv_terms_2_0=ruleVSVRTerm();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getVSVRTermsDefinitionsAbbreviationsRule());
            	      					}
            	      					add(
            	      						current,
            	      						"terms",
            	      						lv_terms_2_0,
            	      						"es.uah.aut.srg.micobs.svm.lang.svr.SVR.VSVRTerm");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop69;
                }
            } while (true);

            // InternalSVR.g:3274:3: ( (lv_definitions_3_0= ruleVSVRDefinition ) )*
            loop70:
            do {
                int alt70=2;
                int LA70_0 = input.LA(1);

                if ( (LA70_0==90) ) {
                    alt70=1;
                }


                switch (alt70) {
            	case 1 :
            	    // InternalSVR.g:3275:4: (lv_definitions_3_0= ruleVSVRDefinition )
            	    {
            	    // InternalSVR.g:3275:4: (lv_definitions_3_0= ruleVSVRDefinition )
            	    // InternalSVR.g:3276:5: lv_definitions_3_0= ruleVSVRDefinition
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getVSVRTermsDefinitionsAbbreviationsAccess().getDefinitionsVSVRDefinitionParserRuleCall_3_0());
            	      				
            	    }
            	    pushFollow(FollowSets000.FOLLOW_86);
            	    lv_definitions_3_0=ruleVSVRDefinition();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getVSVRTermsDefinitionsAbbreviationsRule());
            	      					}
            	      					add(
            	      						current,
            	      						"definitions",
            	      						lv_definitions_3_0,
            	      						"es.uah.aut.srg.micobs.svm.lang.svr.SVR.VSVRDefinition");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop70;
                }
            } while (true);

            // InternalSVR.g:3293:3: ( (lv_abbreviations_4_0= ruleVSVRAbbreviation ) )*
            loop71:
            do {
                int alt71=2;
                int LA71_0 = input.LA(1);

                if ( (LA71_0==92) ) {
                    alt71=1;
                }


                switch (alt71) {
            	case 1 :
            	    // InternalSVR.g:3294:4: (lv_abbreviations_4_0= ruleVSVRAbbreviation )
            	    {
            	    // InternalSVR.g:3294:4: (lv_abbreviations_4_0= ruleVSVRAbbreviation )
            	    // InternalSVR.g:3295:5: lv_abbreviations_4_0= ruleVSVRAbbreviation
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getVSVRTermsDefinitionsAbbreviationsAccess().getAbbreviationsVSVRAbbreviationParserRuleCall_4_0());
            	      				
            	    }
            	    pushFollow(FollowSets000.FOLLOW_87);
            	    lv_abbreviations_4_0=ruleVSVRAbbreviation();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getVSVRTermsDefinitionsAbbreviationsRule());
            	      					}
            	      					add(
            	      						current,
            	      						"abbreviations",
            	      						lv_abbreviations_4_0,
            	      						"es.uah.aut.srg.micobs.svm.lang.svr.SVR.VSVRAbbreviation");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop71;
                }
            } while (true);

            otherlv_5=(Token)match(input,87,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getVSVRTermsDefinitionsAbbreviationsAccess().getTermsDefinitionsAbbreviationsKeyword_5());
              		
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
    // $ANTLR end "ruleVSVRTermsDefinitionsAbbreviations"


    // $ANTLR start "entryRuleVSVRTerm"
    // InternalSVR.g:3320:1: entryRuleVSVRTerm returns [EObject current=null] : iv_ruleVSVRTerm= ruleVSVRTerm EOF ;
    public final EObject entryRuleVSVRTerm() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVSVRTerm = null;


        try {
            // InternalSVR.g:3320:49: (iv_ruleVSVRTerm= ruleVSVRTerm EOF )
            // InternalSVR.g:3321:2: iv_ruleVSVRTerm= ruleVSVRTerm EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getVSVRTermRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleVSVRTerm=ruleVSVRTerm();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleVSVRTerm; 
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
    // $ANTLR end "entryRuleVSVRTerm"


    // $ANTLR start "ruleVSVRTerm"
    // InternalSVR.g:3327:1: ruleVSVRTerm returns [EObject current=null] : (otherlv_0= '<Term' otherlv_1= 'name=' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= '>' ( (lv_description_4_0= ruleDRun ) ) otherlv_5= '</Term>' ) ;
    public final EObject ruleVSVRTerm() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_description_4_0 = null;



        	enterRule();

        try {
            // InternalSVR.g:3333:2: ( (otherlv_0= '<Term' otherlv_1= 'name=' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= '>' ( (lv_description_4_0= ruleDRun ) ) otherlv_5= '</Term>' ) )
            // InternalSVR.g:3334:2: (otherlv_0= '<Term' otherlv_1= 'name=' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= '>' ( (lv_description_4_0= ruleDRun ) ) otherlv_5= '</Term>' )
            {
            // InternalSVR.g:3334:2: (otherlv_0= '<Term' otherlv_1= 'name=' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= '>' ( (lv_description_4_0= ruleDRun ) ) otherlv_5= '</Term>' )
            // InternalSVR.g:3335:3: otherlv_0= '<Term' otherlv_1= 'name=' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= '>' ( (lv_description_4_0= ruleDRun ) ) otherlv_5= '</Term>'
            {
            otherlv_0=(Token)match(input,88,FollowSets000.FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getVSVRTermAccess().getTermKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,17,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getVSVRTermAccess().getNameKeyword_1());
              		
            }
            // InternalSVR.g:3343:3: ( (lv_name_2_0= RULE_STRING ) )
            // InternalSVR.g:3344:4: (lv_name_2_0= RULE_STRING )
            {
            // InternalSVR.g:3344:4: (lv_name_2_0= RULE_STRING )
            // InternalSVR.g:3345:5: lv_name_2_0= RULE_STRING
            {
            lv_name_2_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_10); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_2_0, grammarAccess.getVSVRTermAccess().getNameSTRINGTerminalRuleCall_2_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getVSVRTermRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_2_0,
              						"org.eclipse.xtext.common.Terminals.STRING");
              				
            }

            }


            }

            otherlv_3=(Token)match(input,22,FollowSets000.FOLLOW_50); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getVSVRTermAccess().getGreaterThanSignKeyword_3());
              		
            }
            // InternalSVR.g:3365:3: ( (lv_description_4_0= ruleDRun ) )
            // InternalSVR.g:3366:4: (lv_description_4_0= ruleDRun )
            {
            // InternalSVR.g:3366:4: (lv_description_4_0= ruleDRun )
            // InternalSVR.g:3367:5: lv_description_4_0= ruleDRun
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getVSVRTermAccess().getDescriptionDRunParserRuleCall_4_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_88);
            lv_description_4_0=ruleDRun();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getVSVRTermRule());
              					}
              					set(
              						current,
              						"description",
              						lv_description_4_0,
              						"es.uah.aut.srg.micobs.svm.lang.svr.SVR.DRun");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_5=(Token)match(input,89,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getVSVRTermAccess().getTermKeyword_5());
              		
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
    // $ANTLR end "ruleVSVRTerm"


    // $ANTLR start "entryRuleVSVRDefinition"
    // InternalSVR.g:3392:1: entryRuleVSVRDefinition returns [EObject current=null] : iv_ruleVSVRDefinition= ruleVSVRDefinition EOF ;
    public final EObject entryRuleVSVRDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVSVRDefinition = null;


        try {
            // InternalSVR.g:3392:55: (iv_ruleVSVRDefinition= ruleVSVRDefinition EOF )
            // InternalSVR.g:3393:2: iv_ruleVSVRDefinition= ruleVSVRDefinition EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getVSVRDefinitionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleVSVRDefinition=ruleVSVRDefinition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleVSVRDefinition; 
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
    // $ANTLR end "entryRuleVSVRDefinition"


    // $ANTLR start "ruleVSVRDefinition"
    // InternalSVR.g:3399:1: ruleVSVRDefinition returns [EObject current=null] : (otherlv_0= '<Definition' otherlv_1= 'name=' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= '>' ( (lv_description_4_0= ruleDRun ) ) otherlv_5= '</Definition>' ) ;
    public final EObject ruleVSVRDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_description_4_0 = null;



        	enterRule();

        try {
            // InternalSVR.g:3405:2: ( (otherlv_0= '<Definition' otherlv_1= 'name=' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= '>' ( (lv_description_4_0= ruleDRun ) ) otherlv_5= '</Definition>' ) )
            // InternalSVR.g:3406:2: (otherlv_0= '<Definition' otherlv_1= 'name=' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= '>' ( (lv_description_4_0= ruleDRun ) ) otherlv_5= '</Definition>' )
            {
            // InternalSVR.g:3406:2: (otherlv_0= '<Definition' otherlv_1= 'name=' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= '>' ( (lv_description_4_0= ruleDRun ) ) otherlv_5= '</Definition>' )
            // InternalSVR.g:3407:3: otherlv_0= '<Definition' otherlv_1= 'name=' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= '>' ( (lv_description_4_0= ruleDRun ) ) otherlv_5= '</Definition>'
            {
            otherlv_0=(Token)match(input,90,FollowSets000.FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getVSVRDefinitionAccess().getDefinitionKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,17,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getVSVRDefinitionAccess().getNameKeyword_1());
              		
            }
            // InternalSVR.g:3415:3: ( (lv_name_2_0= RULE_STRING ) )
            // InternalSVR.g:3416:4: (lv_name_2_0= RULE_STRING )
            {
            // InternalSVR.g:3416:4: (lv_name_2_0= RULE_STRING )
            // InternalSVR.g:3417:5: lv_name_2_0= RULE_STRING
            {
            lv_name_2_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_10); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_2_0, grammarAccess.getVSVRDefinitionAccess().getNameSTRINGTerminalRuleCall_2_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getVSVRDefinitionRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_2_0,
              						"org.eclipse.xtext.common.Terminals.STRING");
              				
            }

            }


            }

            otherlv_3=(Token)match(input,22,FollowSets000.FOLLOW_50); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getVSVRDefinitionAccess().getGreaterThanSignKeyword_3());
              		
            }
            // InternalSVR.g:3437:3: ( (lv_description_4_0= ruleDRun ) )
            // InternalSVR.g:3438:4: (lv_description_4_0= ruleDRun )
            {
            // InternalSVR.g:3438:4: (lv_description_4_0= ruleDRun )
            // InternalSVR.g:3439:5: lv_description_4_0= ruleDRun
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getVSVRDefinitionAccess().getDescriptionDRunParserRuleCall_4_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_89);
            lv_description_4_0=ruleDRun();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getVSVRDefinitionRule());
              					}
              					set(
              						current,
              						"description",
              						lv_description_4_0,
              						"es.uah.aut.srg.micobs.svm.lang.svr.SVR.DRun");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_5=(Token)match(input,91,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getVSVRDefinitionAccess().getDefinitionKeyword_5());
              		
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
    // $ANTLR end "ruleVSVRDefinition"


    // $ANTLR start "entryRuleVSVRAbbreviation"
    // InternalSVR.g:3464:1: entryRuleVSVRAbbreviation returns [EObject current=null] : iv_ruleVSVRAbbreviation= ruleVSVRAbbreviation EOF ;
    public final EObject entryRuleVSVRAbbreviation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVSVRAbbreviation = null;


        try {
            // InternalSVR.g:3464:57: (iv_ruleVSVRAbbreviation= ruleVSVRAbbreviation EOF )
            // InternalSVR.g:3465:2: iv_ruleVSVRAbbreviation= ruleVSVRAbbreviation EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getVSVRAbbreviationRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleVSVRAbbreviation=ruleVSVRAbbreviation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleVSVRAbbreviation; 
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
    // $ANTLR end "entryRuleVSVRAbbreviation"


    // $ANTLR start "ruleVSVRAbbreviation"
    // InternalSVR.g:3471:1: ruleVSVRAbbreviation returns [EObject current=null] : (otherlv_0= '<Abbreviation' otherlv_1= 'name=' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= '>' ( (lv_description_4_0= ruleDRun ) ) otherlv_5= '</Abbreviation>' ) ;
    public final EObject ruleVSVRAbbreviation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_description_4_0 = null;



        	enterRule();

        try {
            // InternalSVR.g:3477:2: ( (otherlv_0= '<Abbreviation' otherlv_1= 'name=' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= '>' ( (lv_description_4_0= ruleDRun ) ) otherlv_5= '</Abbreviation>' ) )
            // InternalSVR.g:3478:2: (otherlv_0= '<Abbreviation' otherlv_1= 'name=' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= '>' ( (lv_description_4_0= ruleDRun ) ) otherlv_5= '</Abbreviation>' )
            {
            // InternalSVR.g:3478:2: (otherlv_0= '<Abbreviation' otherlv_1= 'name=' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= '>' ( (lv_description_4_0= ruleDRun ) ) otherlv_5= '</Abbreviation>' )
            // InternalSVR.g:3479:3: otherlv_0= '<Abbreviation' otherlv_1= 'name=' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= '>' ( (lv_description_4_0= ruleDRun ) ) otherlv_5= '</Abbreviation>'
            {
            otherlv_0=(Token)match(input,92,FollowSets000.FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getVSVRAbbreviationAccess().getAbbreviationKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,17,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getVSVRAbbreviationAccess().getNameKeyword_1());
              		
            }
            // InternalSVR.g:3487:3: ( (lv_name_2_0= RULE_STRING ) )
            // InternalSVR.g:3488:4: (lv_name_2_0= RULE_STRING )
            {
            // InternalSVR.g:3488:4: (lv_name_2_0= RULE_STRING )
            // InternalSVR.g:3489:5: lv_name_2_0= RULE_STRING
            {
            lv_name_2_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_10); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_2_0, grammarAccess.getVSVRAbbreviationAccess().getNameSTRINGTerminalRuleCall_2_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getVSVRAbbreviationRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_2_0,
              						"org.eclipse.xtext.common.Terminals.STRING");
              				
            }

            }


            }

            otherlv_3=(Token)match(input,22,FollowSets000.FOLLOW_50); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getVSVRAbbreviationAccess().getGreaterThanSignKeyword_3());
              		
            }
            // InternalSVR.g:3509:3: ( (lv_description_4_0= ruleDRun ) )
            // InternalSVR.g:3510:4: (lv_description_4_0= ruleDRun )
            {
            // InternalSVR.g:3510:4: (lv_description_4_0= ruleDRun )
            // InternalSVR.g:3511:5: lv_description_4_0= ruleDRun
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getVSVRAbbreviationAccess().getDescriptionDRunParserRuleCall_4_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_90);
            lv_description_4_0=ruleDRun();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getVSVRAbbreviationRule());
              					}
              					set(
              						current,
              						"description",
              						lv_description_4_0,
              						"es.uah.aut.srg.micobs.svm.lang.svr.SVR.DRun");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_5=(Token)match(input,93,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getVSVRAbbreviationAccess().getAbbreviationKeyword_5());
              		
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
    // $ANTLR end "ruleVSVRAbbreviation"


    // $ANTLR start "entryRuleVSVRSWValProcessVerification"
    // InternalSVR.g:3536:1: entryRuleVSVRSWValProcessVerification returns [EObject current=null] : iv_ruleVSVRSWValProcessVerification= ruleVSVRSWValProcessVerification EOF ;
    public final EObject entryRuleVSVRSWValProcessVerification() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVSVRSWValProcessVerification = null;


        try {
            // InternalSVR.g:3536:69: (iv_ruleVSVRSWValProcessVerification= ruleVSVRSWValProcessVerification EOF )
            // InternalSVR.g:3537:2: iv_ruleVSVRSWValProcessVerification= ruleVSVRSWValProcessVerification EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getVSVRSWValProcessVerificationRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleVSVRSWValProcessVerification=ruleVSVRSWValProcessVerification();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleVSVRSWValProcessVerification; 
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
    // $ANTLR end "entryRuleVSVRSWValProcessVerification"


    // $ANTLR start "ruleVSVRSWValProcessVerification"
    // InternalSVR.g:3543:1: ruleVSVRSWValProcessVerification returns [EObject current=null] : ( () otherlv_1= '<SWValProcessVerification>' ( (lv_body_2_0= ruleDBody ) )? otherlv_3= '<Traceability>' ( (lv_traceability_4_0= ruleVSVRFixedSection ) ) otherlv_5= '</Traceability>' otherlv_6= '<Feasibility>' ( (lv_feasibility_7_0= ruleVSVRFixedSection ) ) otherlv_8= '</Feasibility>' otherlv_9= '</SWValProcessVerification>' ) ;
    public final EObject ruleVSVRSWValProcessVerification() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        EObject lv_body_2_0 = null;

        EObject lv_traceability_4_0 = null;

        EObject lv_feasibility_7_0 = null;



        	enterRule();

        try {
            // InternalSVR.g:3549:2: ( ( () otherlv_1= '<SWValProcessVerification>' ( (lv_body_2_0= ruleDBody ) )? otherlv_3= '<Traceability>' ( (lv_traceability_4_0= ruleVSVRFixedSection ) ) otherlv_5= '</Traceability>' otherlv_6= '<Feasibility>' ( (lv_feasibility_7_0= ruleVSVRFixedSection ) ) otherlv_8= '</Feasibility>' otherlv_9= '</SWValProcessVerification>' ) )
            // InternalSVR.g:3550:2: ( () otherlv_1= '<SWValProcessVerification>' ( (lv_body_2_0= ruleDBody ) )? otherlv_3= '<Traceability>' ( (lv_traceability_4_0= ruleVSVRFixedSection ) ) otherlv_5= '</Traceability>' otherlv_6= '<Feasibility>' ( (lv_feasibility_7_0= ruleVSVRFixedSection ) ) otherlv_8= '</Feasibility>' otherlv_9= '</SWValProcessVerification>' )
            {
            // InternalSVR.g:3550:2: ( () otherlv_1= '<SWValProcessVerification>' ( (lv_body_2_0= ruleDBody ) )? otherlv_3= '<Traceability>' ( (lv_traceability_4_0= ruleVSVRFixedSection ) ) otherlv_5= '</Traceability>' otherlv_6= '<Feasibility>' ( (lv_feasibility_7_0= ruleVSVRFixedSection ) ) otherlv_8= '</Feasibility>' otherlv_9= '</SWValProcessVerification>' )
            // InternalSVR.g:3551:3: () otherlv_1= '<SWValProcessVerification>' ( (lv_body_2_0= ruleDBody ) )? otherlv_3= '<Traceability>' ( (lv_traceability_4_0= ruleVSVRFixedSection ) ) otherlv_5= '</Traceability>' otherlv_6= '<Feasibility>' ( (lv_feasibility_7_0= ruleVSVRFixedSection ) ) otherlv_8= '</Feasibility>' otherlv_9= '</SWValProcessVerification>'
            {
            // InternalSVR.g:3551:3: ()
            // InternalSVR.g:3552:4: 
            {
            if ( state.backtracking==0 ) {

              				/* */
              			
            }
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getVSVRSWValProcessVerificationAccess().getVSVRSWValProcessVerificationAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,94,FollowSets000.FOLLOW_91); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getVSVRSWValProcessVerificationAccess().getSWValProcessVerificationKeyword_1());
              		
            }
            // InternalSVR.g:3565:3: ( (lv_body_2_0= ruleDBody ) )?
            int alt72=2;
            int LA72_0 = input.LA(1);

            if ( (LA72_0==34) ) {
                alt72=1;
            }
            switch (alt72) {
                case 1 :
                    // InternalSVR.g:3566:4: (lv_body_2_0= ruleDBody )
                    {
                    // InternalSVR.g:3566:4: (lv_body_2_0= ruleDBody )
                    // InternalSVR.g:3567:5: lv_body_2_0= ruleDBody
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getVSVRSWValProcessVerificationAccess().getBodyDBodyParserRuleCall_2_0());
                      				
                    }
                    pushFollow(FollowSets000.FOLLOW_92);
                    lv_body_2_0=ruleDBody();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getVSVRSWValProcessVerificationRule());
                      					}
                      					set(
                      						current,
                      						"body",
                      						lv_body_2_0,
                      						"es.uah.aut.srg.micobs.svm.lang.svr.SVR.DBody");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,95,FollowSets000.FOLLOW_93); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getVSVRSWValProcessVerificationAccess().getTraceabilityKeyword_3());
              		
            }
            // InternalSVR.g:3588:3: ( (lv_traceability_4_0= ruleVSVRFixedSection ) )
            // InternalSVR.g:3589:4: (lv_traceability_4_0= ruleVSVRFixedSection )
            {
            // InternalSVR.g:3589:4: (lv_traceability_4_0= ruleVSVRFixedSection )
            // InternalSVR.g:3590:5: lv_traceability_4_0= ruleVSVRFixedSection
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getVSVRSWValProcessVerificationAccess().getTraceabilityVSVRFixedSectionParserRuleCall_4_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_94);
            lv_traceability_4_0=ruleVSVRFixedSection();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getVSVRSWValProcessVerificationRule());
              					}
              					set(
              						current,
              						"traceability",
              						lv_traceability_4_0,
              						"es.uah.aut.srg.micobs.svm.lang.svr.SVR.VSVRFixedSection");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_5=(Token)match(input,96,FollowSets000.FOLLOW_95); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getVSVRSWValProcessVerificationAccess().getTraceabilityKeyword_5());
              		
            }
            otherlv_6=(Token)match(input,97,FollowSets000.FOLLOW_96); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_6, grammarAccess.getVSVRSWValProcessVerificationAccess().getFeasibilityKeyword_6());
              		
            }
            // InternalSVR.g:3615:3: ( (lv_feasibility_7_0= ruleVSVRFixedSection ) )
            // InternalSVR.g:3616:4: (lv_feasibility_7_0= ruleVSVRFixedSection )
            {
            // InternalSVR.g:3616:4: (lv_feasibility_7_0= ruleVSVRFixedSection )
            // InternalSVR.g:3617:5: lv_feasibility_7_0= ruleVSVRFixedSection
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getVSVRSWValProcessVerificationAccess().getFeasibilityVSVRFixedSectionParserRuleCall_7_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_97);
            lv_feasibility_7_0=ruleVSVRFixedSection();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getVSVRSWValProcessVerificationRule());
              					}
              					set(
              						current,
              						"feasibility",
              						lv_feasibility_7_0,
              						"es.uah.aut.srg.micobs.svm.lang.svr.SVR.VSVRFixedSection");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_8=(Token)match(input,98,FollowSets000.FOLLOW_98); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_8, grammarAccess.getVSVRSWValProcessVerificationAccess().getFeasibilityKeyword_8());
              		
            }
            otherlv_9=(Token)match(input,99,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_9, grammarAccess.getVSVRSWValProcessVerificationAccess().getSWValProcessVerificationKeyword_9());
              		
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
    // $ANTLR end "ruleVSVRSWValProcessVerification"


    // $ANTLR start "ruleDAlignment"
    // InternalSVR.g:3646:1: ruleDAlignment returns [Enumerator current=null] : ( (enumLiteral_0= '\"left\"' ) | (enumLiteral_1= '\"center\"' ) | (enumLiteral_2= '\"right\"' ) | (enumLiteral_3= '\"justified\"' ) ) ;
    public final Enumerator ruleDAlignment() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;


        	enterRule();

        try {
            // InternalSVR.g:3652:2: ( ( (enumLiteral_0= '\"left\"' ) | (enumLiteral_1= '\"center\"' ) | (enumLiteral_2= '\"right\"' ) | (enumLiteral_3= '\"justified\"' ) ) )
            // InternalSVR.g:3653:2: ( (enumLiteral_0= '\"left\"' ) | (enumLiteral_1= '\"center\"' ) | (enumLiteral_2= '\"right\"' ) | (enumLiteral_3= '\"justified\"' ) )
            {
            // InternalSVR.g:3653:2: ( (enumLiteral_0= '\"left\"' ) | (enumLiteral_1= '\"center\"' ) | (enumLiteral_2= '\"right\"' ) | (enumLiteral_3= '\"justified\"' ) )
            int alt73=4;
            switch ( input.LA(1) ) {
            case 100:
                {
                alt73=1;
                }
                break;
            case 101:
                {
                alt73=2;
                }
                break;
            case 102:
                {
                alt73=3;
                }
                break;
            case 103:
                {
                alt73=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 73, 0, input);

                throw nvae;
            }

            switch (alt73) {
                case 1 :
                    // InternalSVR.g:3654:3: (enumLiteral_0= '\"left\"' )
                    {
                    // InternalSVR.g:3654:3: (enumLiteral_0= '\"left\"' )
                    // InternalSVR.g:3655:4: enumLiteral_0= '\"left\"'
                    {
                    enumLiteral_0=(Token)match(input,100,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getDAlignmentAccess().getLeftEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_0, grammarAccess.getDAlignmentAccess().getLeftEnumLiteralDeclaration_0());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalSVR.g:3662:3: (enumLiteral_1= '\"center\"' )
                    {
                    // InternalSVR.g:3662:3: (enumLiteral_1= '\"center\"' )
                    // InternalSVR.g:3663:4: enumLiteral_1= '\"center\"'
                    {
                    enumLiteral_1=(Token)match(input,101,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getDAlignmentAccess().getCenterEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_1, grammarAccess.getDAlignmentAccess().getCenterEnumLiteralDeclaration_1());
                      			
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalSVR.g:3670:3: (enumLiteral_2= '\"right\"' )
                    {
                    // InternalSVR.g:3670:3: (enumLiteral_2= '\"right\"' )
                    // InternalSVR.g:3671:4: enumLiteral_2= '\"right\"'
                    {
                    enumLiteral_2=(Token)match(input,102,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getDAlignmentAccess().getRightEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_2, grammarAccess.getDAlignmentAccess().getRightEnumLiteralDeclaration_2());
                      			
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalSVR.g:3678:3: (enumLiteral_3= '\"justified\"' )
                    {
                    // InternalSVR.g:3678:3: (enumLiteral_3= '\"justified\"' )
                    // InternalSVR.g:3679:4: enumLiteral_3= '\"justified\"'
                    {
                    enumLiteral_3=(Token)match(input,103,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getDAlignmentAccess().getJustifiedEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_3, grammarAccess.getDAlignmentAccess().getJustifiedEnumLiteralDeclaration_3());
                      			
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
    // $ANTLR end "ruleDAlignment"


    // $ANTLR start "ruleDRunAttributes"
    // InternalSVR.g:3689:1: ruleDRunAttributes returns [Enumerator current=null] : ( (enumLiteral_0= '\"true\"' ) | (enumLiteral_1= '\"false\"' ) ) ;
    public final Enumerator ruleDRunAttributes() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalSVR.g:3695:2: ( ( (enumLiteral_0= '\"true\"' ) | (enumLiteral_1= '\"false\"' ) ) )
            // InternalSVR.g:3696:2: ( (enumLiteral_0= '\"true\"' ) | (enumLiteral_1= '\"false\"' ) )
            {
            // InternalSVR.g:3696:2: ( (enumLiteral_0= '\"true\"' ) | (enumLiteral_1= '\"false\"' ) )
            int alt74=2;
            int LA74_0 = input.LA(1);

            if ( (LA74_0==104) ) {
                alt74=1;
            }
            else if ( (LA74_0==105) ) {
                alt74=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 74, 0, input);

                throw nvae;
            }
            switch (alt74) {
                case 1 :
                    // InternalSVR.g:3697:3: (enumLiteral_0= '\"true\"' )
                    {
                    // InternalSVR.g:3697:3: (enumLiteral_0= '\"true\"' )
                    // InternalSVR.g:3698:4: enumLiteral_0= '\"true\"'
                    {
                    enumLiteral_0=(Token)match(input,104,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getDRunAttributesAccess().getTRUEEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_0, grammarAccess.getDRunAttributesAccess().getTRUEEnumLiteralDeclaration_0());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalSVR.g:3705:3: (enumLiteral_1= '\"false\"' )
                    {
                    // InternalSVR.g:3705:3: (enumLiteral_1= '\"false\"' )
                    // InternalSVR.g:3706:4: enumLiteral_1= '\"false\"'
                    {
                    enumLiteral_1=(Token)match(input,105,FollowSets000.FOLLOW_2); if (state.failed) return current;
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
        public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000040000L});
        public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000080000L});
        public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000100000L});
        public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000200000L});
        public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000400000L});
        public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000800000L});
        public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000001000000L});
        public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x000000000A000000L,0x0000000000010000L});
        public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
        public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
        public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000000000L,0x0000000000400000L});
        public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000000000L,0x0000000040000000L});
        public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000004000000L});
        public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000130000000L});
        public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000110000000L});
        public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x00000000C0000000L});
        public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000240000000L});
        public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0800A01000000000L,0x0000000000000003L});
        public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0800A01800000000L,0x0000000000000003L});
        public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x000000E000420000L});
        public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x000000E000400000L});
        public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000000000000L,0x000000F000000000L});
        public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x000000C000400000L});
        public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000008000400000L});
        public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000000000040L});
        public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0082000000000000L});
        public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0082010000000000L});
        public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000141000000000L});
        public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000140000000000L});
        public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000A00000000000L});
        public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000080000000000L});
        public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000100000000000L});
        public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000020000000000L});
        public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000420000000000L});
        public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0001020000000000L});
        public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x003C000000400000L});
        public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000000000000000L,0x0000030000000000L});
        public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0038000000400000L});
        public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0030000000400000L});
        public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0020000000400000L});
        public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0400000000000080L});
        public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0040000000000000L});
        public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0100000000000000L});
        public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x0000000001400000L});
        public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x0002000000000000L});
        public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x0200000000000000L});
        public static final BitSet FOLLOW_52 = new BitSet(new long[]{0x1000000000000000L});
        public static final BitSet FOLLOW_53 = new BitSet(new long[]{0x2000000000000000L});
        public static final BitSet FOLLOW_54 = new BitSet(new long[]{0x4000000000000000L});
        public static final BitSet FOLLOW_55 = new BitSet(new long[]{0x800000E001000000L});
        public static final BitSet FOLLOW_56 = new BitSet(new long[]{0x800000C001000000L});
        public static final BitSet FOLLOW_57 = new BitSet(new long[]{0x8000008001000000L});
        public static final BitSet FOLLOW_58 = new BitSet(new long[]{0x8000000001000000L});
        public static final BitSet FOLLOW_59 = new BitSet(new long[]{0xA00000E000400000L});
        public static final BitSet FOLLOW_60 = new BitSet(new long[]{0x800000E000400000L});
        public static final BitSet FOLLOW_61 = new BitSet(new long[]{0x800000C000400000L});
        public static final BitSet FOLLOW_62 = new BitSet(new long[]{0x8000008000400000L});
        public static final BitSet FOLLOW_63 = new BitSet(new long[]{0x8000000000400000L});
        public static final BitSet FOLLOW_64 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
        public static final BitSet FOLLOW_65 = new BitSet(new long[]{0x0000000000000000L,0x000000000000000CL});
        public static final BitSet FOLLOW_66 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
        public static final BitSet FOLLOW_67 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000030L});
        public static final BitSet FOLLOW_68 = new BitSet(new long[]{0x2000000000400000L,0x00000000000001C0L});
        public static final BitSet FOLLOW_69 = new BitSet(new long[]{0x2000000000400000L,0x0000000000000180L});
        public static final BitSet FOLLOW_70 = new BitSet(new long[]{0x2000000000400000L,0x0000000000000100L});
        public static final BitSet FOLLOW_71 = new BitSet(new long[]{0x0000000000400000L,0x0000000000000100L});
        public static final BitSet FOLLOW_72 = new BitSet(new long[]{0x0800A01000000000L,0x0000000000000203L});
        public static final BitSet FOLLOW_73 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
        public static final BitSet FOLLOW_74 = new BitSet(new long[]{0x0000000001280000L,0x0000000000001000L});
        public static final BitSet FOLLOW_75 = new BitSet(new long[]{0x0000000001300000L,0x0000000000001000L});
        public static final BitSet FOLLOW_76 = new BitSet(new long[]{0x0000000001200000L,0x0000000000001000L});
        public static final BitSet FOLLOW_77 = new BitSet(new long[]{0x0000000001000000L,0x0000000000001000L});
        public static final BitSet FOLLOW_78 = new BitSet(new long[]{0x0000000000000002L,0x0000000000004000L});
        public static final BitSet FOLLOW_79 = new BitSet(new long[]{0x0000000400000000L,0x000000000000C000L});
        public static final BitSet FOLLOW_80 = new BitSet(new long[]{0x0000000000000000L,0x000000000000C000L});
        public static final BitSet FOLLOW_81 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
        public static final BitSet FOLLOW_82 = new BitSet(new long[]{0x0000000000000000L,0x0000000000024000L});
        public static final BitSet FOLLOW_83 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080400L});
        public static final BitSet FOLLOW_84 = new BitSet(new long[]{0x0000000000000000L,0x0000000000202000L});
        public static final BitSet FOLLOW_85 = new BitSet(new long[]{0x0000000000000000L,0x0000000015800000L});
        public static final BitSet FOLLOW_86 = new BitSet(new long[]{0x0000000000000000L,0x0000000014800000L});
        public static final BitSet FOLLOW_87 = new BitSet(new long[]{0x0000000000000000L,0x0000000010800000L});
        public static final BitSet FOLLOW_88 = new BitSet(new long[]{0x0000000000000000L,0x0000000002000000L});
        public static final BitSet FOLLOW_89 = new BitSet(new long[]{0x0000000000000000L,0x0000000008000000L});
        public static final BitSet FOLLOW_90 = new BitSet(new long[]{0x0000000000000000L,0x0000000020000000L});
        public static final BitSet FOLLOW_91 = new BitSet(new long[]{0x0000000400000000L,0x0000000080000000L});
        public static final BitSet FOLLOW_92 = new BitSet(new long[]{0x0000000000000000L,0x0000000080000000L});
        public static final BitSet FOLLOW_93 = new BitSet(new long[]{0x0000000400000000L,0x0000000100004000L});
        public static final BitSet FOLLOW_94 = new BitSet(new long[]{0x0000000000000000L,0x0000000100000000L});
        public static final BitSet FOLLOW_95 = new BitSet(new long[]{0x0000000000000000L,0x0000000200000000L});
        public static final BitSet FOLLOW_96 = new BitSet(new long[]{0x0000000400000000L,0x0000000400004000L});
        public static final BitSet FOLLOW_97 = new BitSet(new long[]{0x0000000000000000L,0x0000000400000000L});
        public static final BitSet FOLLOW_98 = new BitSet(new long[]{0x0000000000000000L,0x0000000800000000L});
    }


}