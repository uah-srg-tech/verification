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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_UINT_STRING", "RULE_REAL_STRING", "RULE_RUNTEXT", "RULE_HEXADECIMAL", "RULE_HEX_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'<SVR'", "'name='", "'id='", "'issue='", "'revision='", "'date='", "'>'", "'<svsParent'", "'/>'", "'<tcrParent'", "'</SVR>'", "'<TBCsTBDs>'", "'</TBCsTBDs>'", "'<TBC'", "'description='", "'parentTBC='", "'<TBD'", "'parentTBD='", "'<body>'", "'</body>'", "'<paragraph'", "'alignment='", "'style='", "'indent='", "'</paragraph>'", "'<listItem>'", "'<sublist>'", "'</sublist>'", "'</listItem>'", "'<itemize'", "'</itemize>'", "'<enumerate'", "'</enumerate>'", "'<run'", "'bold='", "'italics='", "'underline='", "'color='", "'</run>'", "'<hyperlink'", "'reference='", "'</hyperlink>'", "'<tab/>'", "'<figureFromFile'", "'referenceFile='", "'width='", "'height='", "'caption='", "'<tableFromFile'", "'<basicTable'", "'</basicTable>'", "'<row>'", "'</row>'", "'<cell'", "'colSpan='", "'rowSpan='", "'shadow='", "'</cell>'", "'<ApplicableDocument'", "'title='", "'url='", "'<ReferenceDocument'", "'<subsection'", "'</subsection>'", "'<Introduction>'", "'</Introduction>'", "'<ApplicableDocuments>'", "'</ApplicableDocuments>'", "'<ReferenceDocuments>'", "'</ReferenceDocuments>'", "'<TermsDefinitionsAbbreviations>'", "'</TermsDefinitionsAbbreviations>'", "'<Term'", "'</Term>'", "'<Definition'", "'</Definition>'", "'<Abbreviation'", "'</Abbreviation>'", "'\"left\"'", "'\"center\"'", "'\"right\"'", "'\"justified\"'", "'\"true\"'", "'\"false\"'"
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
    public static final int T__92=92;
    public static final int T__93=93;
    public static final int T__94=94;
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
    public static final int T__85=85;
    public static final int T__86=86;
    public static final int T__87=87;

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
    // InternalSVR.g:85:1: ruleVSVRDocument returns [EObject current=null] : (otherlv_0= '<SVR' otherlv_1= 'name=' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= 'id=' ( (lv_id_4_0= RULE_STRING ) ) otherlv_5= 'issue=' ( (lv_issue_6_0= RULE_UINT_STRING ) ) otherlv_7= 'revision=' ( (lv_revision_8_0= RULE_UINT_STRING ) ) otherlv_9= 'date=' ( (lv_date_10_0= RULE_STRING ) ) otherlv_11= '>' otherlv_12= '<svsParent' otherlv_13= 'name=' ( (otherlv_14= RULE_STRING ) ) otherlv_15= '/>' (otherlv_16= '<tcrParent' otherlv_17= 'name=' ( (otherlv_18= RULE_STRING ) ) otherlv_19= '/>' )* ( (lv_tbcsTbdsSection_20_0= ruleVSVRTBCsTBDs ) )? ( (lv_introductionSection_21_0= ruleVSVRIntroduction ) ) ( (lv_applicableDocumentsSection_22_0= ruleVSVRApplicableDocuments ) ) ( (lv_referenceDocumentsSection_23_0= ruleVSVRReferenceDocuments ) ) ( (lv_termsDefinitionsAbbreviationsSection_24_0= ruleVSVRTermsDefinitionsAbbreviations ) ) otherlv_25= '</SVR>' ) ;
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
        Token otherlv_25=null;
        EObject lv_tbcsTbdsSection_20_0 = null;

        EObject lv_introductionSection_21_0 = null;

        EObject lv_applicableDocumentsSection_22_0 = null;

        EObject lv_referenceDocumentsSection_23_0 = null;

        EObject lv_termsDefinitionsAbbreviationsSection_24_0 = null;



        	enterRule();

        try {
            // InternalSVR.g:91:2: ( (otherlv_0= '<SVR' otherlv_1= 'name=' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= 'id=' ( (lv_id_4_0= RULE_STRING ) ) otherlv_5= 'issue=' ( (lv_issue_6_0= RULE_UINT_STRING ) ) otherlv_7= 'revision=' ( (lv_revision_8_0= RULE_UINT_STRING ) ) otherlv_9= 'date=' ( (lv_date_10_0= RULE_STRING ) ) otherlv_11= '>' otherlv_12= '<svsParent' otherlv_13= 'name=' ( (otherlv_14= RULE_STRING ) ) otherlv_15= '/>' (otherlv_16= '<tcrParent' otherlv_17= 'name=' ( (otherlv_18= RULE_STRING ) ) otherlv_19= '/>' )* ( (lv_tbcsTbdsSection_20_0= ruleVSVRTBCsTBDs ) )? ( (lv_introductionSection_21_0= ruleVSVRIntroduction ) ) ( (lv_applicableDocumentsSection_22_0= ruleVSVRApplicableDocuments ) ) ( (lv_referenceDocumentsSection_23_0= ruleVSVRReferenceDocuments ) ) ( (lv_termsDefinitionsAbbreviationsSection_24_0= ruleVSVRTermsDefinitionsAbbreviations ) ) otherlv_25= '</SVR>' ) )
            // InternalSVR.g:92:2: (otherlv_0= '<SVR' otherlv_1= 'name=' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= 'id=' ( (lv_id_4_0= RULE_STRING ) ) otherlv_5= 'issue=' ( (lv_issue_6_0= RULE_UINT_STRING ) ) otherlv_7= 'revision=' ( (lv_revision_8_0= RULE_UINT_STRING ) ) otherlv_9= 'date=' ( (lv_date_10_0= RULE_STRING ) ) otherlv_11= '>' otherlv_12= '<svsParent' otherlv_13= 'name=' ( (otherlv_14= RULE_STRING ) ) otherlv_15= '/>' (otherlv_16= '<tcrParent' otherlv_17= 'name=' ( (otherlv_18= RULE_STRING ) ) otherlv_19= '/>' )* ( (lv_tbcsTbdsSection_20_0= ruleVSVRTBCsTBDs ) )? ( (lv_introductionSection_21_0= ruleVSVRIntroduction ) ) ( (lv_applicableDocumentsSection_22_0= ruleVSVRApplicableDocuments ) ) ( (lv_referenceDocumentsSection_23_0= ruleVSVRReferenceDocuments ) ) ( (lv_termsDefinitionsAbbreviationsSection_24_0= ruleVSVRTermsDefinitionsAbbreviations ) ) otherlv_25= '</SVR>' )
            {
            // InternalSVR.g:92:2: (otherlv_0= '<SVR' otherlv_1= 'name=' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= 'id=' ( (lv_id_4_0= RULE_STRING ) ) otherlv_5= 'issue=' ( (lv_issue_6_0= RULE_UINT_STRING ) ) otherlv_7= 'revision=' ( (lv_revision_8_0= RULE_UINT_STRING ) ) otherlv_9= 'date=' ( (lv_date_10_0= RULE_STRING ) ) otherlv_11= '>' otherlv_12= '<svsParent' otherlv_13= 'name=' ( (otherlv_14= RULE_STRING ) ) otherlv_15= '/>' (otherlv_16= '<tcrParent' otherlv_17= 'name=' ( (otherlv_18= RULE_STRING ) ) otherlv_19= '/>' )* ( (lv_tbcsTbdsSection_20_0= ruleVSVRTBCsTBDs ) )? ( (lv_introductionSection_21_0= ruleVSVRIntroduction ) ) ( (lv_applicableDocumentsSection_22_0= ruleVSVRApplicableDocuments ) ) ( (lv_referenceDocumentsSection_23_0= ruleVSVRReferenceDocuments ) ) ( (lv_termsDefinitionsAbbreviationsSection_24_0= ruleVSVRTermsDefinitionsAbbreviations ) ) otherlv_25= '</SVR>' )
            // InternalSVR.g:93:3: otherlv_0= '<SVR' otherlv_1= 'name=' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= 'id=' ( (lv_id_4_0= RULE_STRING ) ) otherlv_5= 'issue=' ( (lv_issue_6_0= RULE_UINT_STRING ) ) otherlv_7= 'revision=' ( (lv_revision_8_0= RULE_UINT_STRING ) ) otherlv_9= 'date=' ( (lv_date_10_0= RULE_STRING ) ) otherlv_11= '>' otherlv_12= '<svsParent' otherlv_13= 'name=' ( (otherlv_14= RULE_STRING ) ) otherlv_15= '/>' (otherlv_16= '<tcrParent' otherlv_17= 'name=' ( (otherlv_18= RULE_STRING ) ) otherlv_19= '/>' )* ( (lv_tbcsTbdsSection_20_0= ruleVSVRTBCsTBDs ) )? ( (lv_introductionSection_21_0= ruleVSVRIntroduction ) ) ( (lv_applicableDocumentsSection_22_0= ruleVSVRApplicableDocuments ) ) ( (lv_referenceDocumentsSection_23_0= ruleVSVRReferenceDocuments ) ) ( (lv_termsDefinitionsAbbreviationsSection_24_0= ruleVSVRTermsDefinitionsAbbreviations ) ) otherlv_25= '</SVR>'
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

            otherlv_25=(Token)match(input,26,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_25, grammarAccess.getVSVRDocumentAccess().getSVRKeyword_22());
              		
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
    // InternalSVR.g:372:1: entryRuleVSVRTBCsTBDs returns [EObject current=null] : iv_ruleVSVRTBCsTBDs= ruleVSVRTBCsTBDs EOF ;
    public final EObject entryRuleVSVRTBCsTBDs() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVSVRTBCsTBDs = null;


        try {
            // InternalSVR.g:372:53: (iv_ruleVSVRTBCsTBDs= ruleVSVRTBCsTBDs EOF )
            // InternalSVR.g:373:2: iv_ruleVSVRTBCsTBDs= ruleVSVRTBCsTBDs EOF
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
    // InternalSVR.g:379:1: ruleVSVRTBCsTBDs returns [EObject current=null] : ( () otherlv_1= '<TBCsTBDs>' ( (lv_tbcs_2_0= ruleDTBC ) )* ( (lv_tbds_3_0= ruleDTBD ) )* otherlv_4= '</TBCsTBDs>' ) ;
    public final EObject ruleVSVRTBCsTBDs() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_4=null;
        EObject lv_tbcs_2_0 = null;

        EObject lv_tbds_3_0 = null;



        	enterRule();

        try {
            // InternalSVR.g:385:2: ( ( () otherlv_1= '<TBCsTBDs>' ( (lv_tbcs_2_0= ruleDTBC ) )* ( (lv_tbds_3_0= ruleDTBD ) )* otherlv_4= '</TBCsTBDs>' ) )
            // InternalSVR.g:386:2: ( () otherlv_1= '<TBCsTBDs>' ( (lv_tbcs_2_0= ruleDTBC ) )* ( (lv_tbds_3_0= ruleDTBD ) )* otherlv_4= '</TBCsTBDs>' )
            {
            // InternalSVR.g:386:2: ( () otherlv_1= '<TBCsTBDs>' ( (lv_tbcs_2_0= ruleDTBC ) )* ( (lv_tbds_3_0= ruleDTBD ) )* otherlv_4= '</TBCsTBDs>' )
            // InternalSVR.g:387:3: () otherlv_1= '<TBCsTBDs>' ( (lv_tbcs_2_0= ruleDTBC ) )* ( (lv_tbds_3_0= ruleDTBD ) )* otherlv_4= '</TBCsTBDs>'
            {
            // InternalSVR.g:387:3: ()
            // InternalSVR.g:388:4: 
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

            otherlv_1=(Token)match(input,27,FollowSets000.FOLLOW_18); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getVSVRTBCsTBDsAccess().getTBCsTBDsKeyword_1());
              		
            }
            // InternalSVR.g:401:3: ( (lv_tbcs_2_0= ruleDTBC ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==29) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalSVR.g:402:4: (lv_tbcs_2_0= ruleDTBC )
            	    {
            	    // InternalSVR.g:402:4: (lv_tbcs_2_0= ruleDTBC )
            	    // InternalSVR.g:403:5: lv_tbcs_2_0= ruleDTBC
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getVSVRTBCsTBDsAccess().getTbcsDTBCParserRuleCall_2_0());
            	      				
            	    }
            	    pushFollow(FollowSets000.FOLLOW_18);
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

            // InternalSVR.g:420:3: ( (lv_tbds_3_0= ruleDTBD ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==32) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalSVR.g:421:4: (lv_tbds_3_0= ruleDTBD )
            	    {
            	    // InternalSVR.g:421:4: (lv_tbds_3_0= ruleDTBD )
            	    // InternalSVR.g:422:5: lv_tbds_3_0= ruleDTBD
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getVSVRTBCsTBDsAccess().getTbdsDTBDParserRuleCall_3_0());
            	      				
            	    }
            	    pushFollow(FollowSets000.FOLLOW_19);
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
    // InternalSVR.g:447:1: entryRuleDTBC returns [EObject current=null] : iv_ruleDTBC= ruleDTBC EOF ;
    public final EObject entryRuleDTBC() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDTBC = null;


        try {
            // InternalSVR.g:447:45: (iv_ruleDTBC= ruleDTBC EOF )
            // InternalSVR.g:448:2: iv_ruleDTBC= ruleDTBC EOF
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
    // InternalSVR.g:454:1: ruleDTBC returns [EObject current=null] : (otherlv_0= '<TBC' otherlv_1= 'name=' ( (lv_name_2_0= RULE_STRING ) ) ( (otherlv_3= 'description=' ( (lv_description_4_0= RULE_STRING ) ) ) | (otherlv_5= 'parentTBC=' ( (otherlv_6= RULE_STRING ) ) ) ) otherlv_7= '/>' ) ;
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
            // InternalSVR.g:460:2: ( (otherlv_0= '<TBC' otherlv_1= 'name=' ( (lv_name_2_0= RULE_STRING ) ) ( (otherlv_3= 'description=' ( (lv_description_4_0= RULE_STRING ) ) ) | (otherlv_5= 'parentTBC=' ( (otherlv_6= RULE_STRING ) ) ) ) otherlv_7= '/>' ) )
            // InternalSVR.g:461:2: (otherlv_0= '<TBC' otherlv_1= 'name=' ( (lv_name_2_0= RULE_STRING ) ) ( (otherlv_3= 'description=' ( (lv_description_4_0= RULE_STRING ) ) ) | (otherlv_5= 'parentTBC=' ( (otherlv_6= RULE_STRING ) ) ) ) otherlv_7= '/>' )
            {
            // InternalSVR.g:461:2: (otherlv_0= '<TBC' otherlv_1= 'name=' ( (lv_name_2_0= RULE_STRING ) ) ( (otherlv_3= 'description=' ( (lv_description_4_0= RULE_STRING ) ) ) | (otherlv_5= 'parentTBC=' ( (otherlv_6= RULE_STRING ) ) ) ) otherlv_7= '/>' )
            // InternalSVR.g:462:3: otherlv_0= '<TBC' otherlv_1= 'name=' ( (lv_name_2_0= RULE_STRING ) ) ( (otherlv_3= 'description=' ( (lv_description_4_0= RULE_STRING ) ) ) | (otherlv_5= 'parentTBC=' ( (otherlv_6= RULE_STRING ) ) ) ) otherlv_7= '/>'
            {
            otherlv_0=(Token)match(input,29,FollowSets000.FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getDTBCAccess().getTBCKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,17,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getDTBCAccess().getNameKeyword_1());
              		
            }
            // InternalSVR.g:470:3: ( (lv_name_2_0= RULE_STRING ) )
            // InternalSVR.g:471:4: (lv_name_2_0= RULE_STRING )
            {
            // InternalSVR.g:471:4: (lv_name_2_0= RULE_STRING )
            // InternalSVR.g:472:5: lv_name_2_0= RULE_STRING
            {
            lv_name_2_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_20); if (state.failed) return current;
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

            // InternalSVR.g:488:3: ( (otherlv_3= 'description=' ( (lv_description_4_0= RULE_STRING ) ) ) | (otherlv_5= 'parentTBC=' ( (otherlv_6= RULE_STRING ) ) ) )
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
                    // InternalSVR.g:489:4: (otherlv_3= 'description=' ( (lv_description_4_0= RULE_STRING ) ) )
                    {
                    // InternalSVR.g:489:4: (otherlv_3= 'description=' ( (lv_description_4_0= RULE_STRING ) ) )
                    // InternalSVR.g:490:5: otherlv_3= 'description=' ( (lv_description_4_0= RULE_STRING ) )
                    {
                    otherlv_3=(Token)match(input,30,FollowSets000.FOLLOW_4); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_3, grammarAccess.getDTBCAccess().getDescriptionKeyword_3_0_0());
                      				
                    }
                    // InternalSVR.g:494:5: ( (lv_description_4_0= RULE_STRING ) )
                    // InternalSVR.g:495:6: (lv_description_4_0= RULE_STRING )
                    {
                    // InternalSVR.g:495:6: (lv_description_4_0= RULE_STRING )
                    // InternalSVR.g:496:7: lv_description_4_0= RULE_STRING
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
                    // InternalSVR.g:514:4: (otherlv_5= 'parentTBC=' ( (otherlv_6= RULE_STRING ) ) )
                    {
                    // InternalSVR.g:514:4: (otherlv_5= 'parentTBC=' ( (otherlv_6= RULE_STRING ) ) )
                    // InternalSVR.g:515:5: otherlv_5= 'parentTBC=' ( (otherlv_6= RULE_STRING ) )
                    {
                    otherlv_5=(Token)match(input,31,FollowSets000.FOLLOW_4); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_5, grammarAccess.getDTBCAccess().getParentTBCKeyword_3_1_0());
                      				
                    }
                    // InternalSVR.g:519:5: ( (otherlv_6= RULE_STRING ) )
                    // InternalSVR.g:520:6: (otherlv_6= RULE_STRING )
                    {
                    // InternalSVR.g:520:6: (otherlv_6= RULE_STRING )
                    // InternalSVR.g:521:7: otherlv_6= RULE_STRING
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
    // InternalSVR.g:545:1: entryRuleDTBD returns [EObject current=null] : iv_ruleDTBD= ruleDTBD EOF ;
    public final EObject entryRuleDTBD() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDTBD = null;


        try {
            // InternalSVR.g:545:45: (iv_ruleDTBD= ruleDTBD EOF )
            // InternalSVR.g:546:2: iv_ruleDTBD= ruleDTBD EOF
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
    // InternalSVR.g:552:1: ruleDTBD returns [EObject current=null] : (otherlv_0= '<TBD' otherlv_1= 'name=' ( (lv_name_2_0= RULE_STRING ) ) ( (otherlv_3= 'description=' ( (lv_description_4_0= RULE_STRING ) ) ) | (otherlv_5= 'parentTBD=' ( (otherlv_6= RULE_STRING ) ) ) ) otherlv_7= '/>' ) ;
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
            // InternalSVR.g:558:2: ( (otherlv_0= '<TBD' otherlv_1= 'name=' ( (lv_name_2_0= RULE_STRING ) ) ( (otherlv_3= 'description=' ( (lv_description_4_0= RULE_STRING ) ) ) | (otherlv_5= 'parentTBD=' ( (otherlv_6= RULE_STRING ) ) ) ) otherlv_7= '/>' ) )
            // InternalSVR.g:559:2: (otherlv_0= '<TBD' otherlv_1= 'name=' ( (lv_name_2_0= RULE_STRING ) ) ( (otherlv_3= 'description=' ( (lv_description_4_0= RULE_STRING ) ) ) | (otherlv_5= 'parentTBD=' ( (otherlv_6= RULE_STRING ) ) ) ) otherlv_7= '/>' )
            {
            // InternalSVR.g:559:2: (otherlv_0= '<TBD' otherlv_1= 'name=' ( (lv_name_2_0= RULE_STRING ) ) ( (otherlv_3= 'description=' ( (lv_description_4_0= RULE_STRING ) ) ) | (otherlv_5= 'parentTBD=' ( (otherlv_6= RULE_STRING ) ) ) ) otherlv_7= '/>' )
            // InternalSVR.g:560:3: otherlv_0= '<TBD' otherlv_1= 'name=' ( (lv_name_2_0= RULE_STRING ) ) ( (otherlv_3= 'description=' ( (lv_description_4_0= RULE_STRING ) ) ) | (otherlv_5= 'parentTBD=' ( (otherlv_6= RULE_STRING ) ) ) ) otherlv_7= '/>'
            {
            otherlv_0=(Token)match(input,32,FollowSets000.FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getDTBDAccess().getTBDKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,17,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getDTBDAccess().getNameKeyword_1());
              		
            }
            // InternalSVR.g:568:3: ( (lv_name_2_0= RULE_STRING ) )
            // InternalSVR.g:569:4: (lv_name_2_0= RULE_STRING )
            {
            // InternalSVR.g:569:4: (lv_name_2_0= RULE_STRING )
            // InternalSVR.g:570:5: lv_name_2_0= RULE_STRING
            {
            lv_name_2_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_21); if (state.failed) return current;
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

            // InternalSVR.g:586:3: ( (otherlv_3= 'description=' ( (lv_description_4_0= RULE_STRING ) ) ) | (otherlv_5= 'parentTBD=' ( (otherlv_6= RULE_STRING ) ) ) )
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
                    // InternalSVR.g:587:4: (otherlv_3= 'description=' ( (lv_description_4_0= RULE_STRING ) ) )
                    {
                    // InternalSVR.g:587:4: (otherlv_3= 'description=' ( (lv_description_4_0= RULE_STRING ) ) )
                    // InternalSVR.g:588:5: otherlv_3= 'description=' ( (lv_description_4_0= RULE_STRING ) )
                    {
                    otherlv_3=(Token)match(input,30,FollowSets000.FOLLOW_4); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_3, grammarAccess.getDTBDAccess().getDescriptionKeyword_3_0_0());
                      				
                    }
                    // InternalSVR.g:592:5: ( (lv_description_4_0= RULE_STRING ) )
                    // InternalSVR.g:593:6: (lv_description_4_0= RULE_STRING )
                    {
                    // InternalSVR.g:593:6: (lv_description_4_0= RULE_STRING )
                    // InternalSVR.g:594:7: lv_description_4_0= RULE_STRING
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
                    // InternalSVR.g:612:4: (otherlv_5= 'parentTBD=' ( (otherlv_6= RULE_STRING ) ) )
                    {
                    // InternalSVR.g:612:4: (otherlv_5= 'parentTBD=' ( (otherlv_6= RULE_STRING ) ) )
                    // InternalSVR.g:613:5: otherlv_5= 'parentTBD=' ( (otherlv_6= RULE_STRING ) )
                    {
                    otherlv_5=(Token)match(input,33,FollowSets000.FOLLOW_4); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_5, grammarAccess.getDTBDAccess().getParentTBDKeyword_3_1_0());
                      				
                    }
                    // InternalSVR.g:617:5: ( (otherlv_6= RULE_STRING ) )
                    // InternalSVR.g:618:6: (otherlv_6= RULE_STRING )
                    {
                    // InternalSVR.g:618:6: (otherlv_6= RULE_STRING )
                    // InternalSVR.g:619:7: otherlv_6= RULE_STRING
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
    // InternalSVR.g:643:1: entryRuleDBody returns [EObject current=null] : iv_ruleDBody= ruleDBody EOF ;
    public final EObject entryRuleDBody() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDBody = null;


        try {
            // InternalSVR.g:643:46: (iv_ruleDBody= ruleDBody EOF )
            // InternalSVR.g:644:2: iv_ruleDBody= ruleDBody EOF
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
    // InternalSVR.g:650:1: ruleDBody returns [EObject current=null] : (otherlv_0= '<body>' ( (lv_bodyContent_1_0= ruleDBodyContent ) )+ otherlv_2= '</body>' ) ;
    public final EObject ruleDBody() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_bodyContent_1_0 = null;



        	enterRule();

        try {
            // InternalSVR.g:656:2: ( (otherlv_0= '<body>' ( (lv_bodyContent_1_0= ruleDBodyContent ) )+ otherlv_2= '</body>' ) )
            // InternalSVR.g:657:2: (otherlv_0= '<body>' ( (lv_bodyContent_1_0= ruleDBodyContent ) )+ otherlv_2= '</body>' )
            {
            // InternalSVR.g:657:2: (otherlv_0= '<body>' ( (lv_bodyContent_1_0= ruleDBodyContent ) )+ otherlv_2= '</body>' )
            // InternalSVR.g:658:3: otherlv_0= '<body>' ( (lv_bodyContent_1_0= ruleDBodyContent ) )+ otherlv_2= '</body>'
            {
            otherlv_0=(Token)match(input,34,FollowSets000.FOLLOW_22); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getDBodyAccess().getBodyKeyword_0());
              		
            }
            // InternalSVR.g:662:3: ( (lv_bodyContent_1_0= ruleDBodyContent ) )+
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
            	    // InternalSVR.g:663:4: (lv_bodyContent_1_0= ruleDBodyContent )
            	    {
            	    // InternalSVR.g:663:4: (lv_bodyContent_1_0= ruleDBodyContent )
            	    // InternalSVR.g:664:5: lv_bodyContent_1_0= ruleDBodyContent
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getDBodyAccess().getBodyContentDBodyContentParserRuleCall_1_0());
            	      				
            	    }
            	    pushFollow(FollowSets000.FOLLOW_23);
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
    // InternalSVR.g:689:1: entryRuleDBodyContent returns [EObject current=null] : iv_ruleDBodyContent= ruleDBodyContent EOF ;
    public final EObject entryRuleDBodyContent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDBodyContent = null;


        try {
            // InternalSVR.g:689:53: (iv_ruleDBodyContent= ruleDBodyContent EOF )
            // InternalSVR.g:690:2: iv_ruleDBodyContent= ruleDBodyContent EOF
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
    // InternalSVR.g:696:1: ruleDBodyContent returns [EObject current=null] : (this_DParagraph_0= ruleDParagraph | this_DItemize_1= ruleDItemize | this_DEnumerate_2= ruleDEnumerate | this_DFigureFromFile_3= ruleDFigureFromFile | this_DTableFromFile_4= ruleDTableFromFile | this_DBasicTable_5= ruleDBasicTable ) ;
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
            // InternalSVR.g:702:2: ( (this_DParagraph_0= ruleDParagraph | this_DItemize_1= ruleDItemize | this_DEnumerate_2= ruleDEnumerate | this_DFigureFromFile_3= ruleDFigureFromFile | this_DTableFromFile_4= ruleDTableFromFile | this_DBasicTable_5= ruleDBasicTable ) )
            // InternalSVR.g:703:2: (this_DParagraph_0= ruleDParagraph | this_DItemize_1= ruleDItemize | this_DEnumerate_2= ruleDEnumerate | this_DFigureFromFile_3= ruleDFigureFromFile | this_DTableFromFile_4= ruleDTableFromFile | this_DBasicTable_5= ruleDBasicTable )
            {
            // InternalSVR.g:703:2: (this_DParagraph_0= ruleDParagraph | this_DItemize_1= ruleDItemize | this_DEnumerate_2= ruleDEnumerate | this_DFigureFromFile_3= ruleDFigureFromFile | this_DTableFromFile_4= ruleDTableFromFile | this_DBasicTable_5= ruleDBasicTable )
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
                    // InternalSVR.g:704:3: this_DParagraph_0= ruleDParagraph
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
                    // InternalSVR.g:716:3: this_DItemize_1= ruleDItemize
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
                    // InternalSVR.g:728:3: this_DEnumerate_2= ruleDEnumerate
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
                    // InternalSVR.g:740:3: this_DFigureFromFile_3= ruleDFigureFromFile
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
                    // InternalSVR.g:752:3: this_DTableFromFile_4= ruleDTableFromFile
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
                    // InternalSVR.g:764:3: this_DBasicTable_5= ruleDBasicTable
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
    // InternalSVR.g:779:1: entryRuleDParagraph returns [EObject current=null] : iv_ruleDParagraph= ruleDParagraph EOF ;
    public final EObject entryRuleDParagraph() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDParagraph = null;


        try {
            // InternalSVR.g:779:51: (iv_ruleDParagraph= ruleDParagraph EOF )
            // InternalSVR.g:780:2: iv_ruleDParagraph= ruleDParagraph EOF
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
    // InternalSVR.g:786:1: ruleDParagraph returns [EObject current=null] : (otherlv_0= '<paragraph' (otherlv_1= 'name=' ( (lv_name_2_0= RULE_STRING ) ) )? (otherlv_3= 'alignment=' ( (lv_alignment_4_0= ruleDAlignment ) ) )? (otherlv_5= 'style=' ( (lv_style_6_0= RULE_STRING ) ) )? (otherlv_7= 'indent=' ( (lv_indent_8_0= RULE_REAL_STRING ) ) )? otherlv_9= '>' ( (lv_paragraphContent_10_0= ruleDParagraphContent ) )+ otherlv_11= '</paragraph>' ) ;
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
            // InternalSVR.g:792:2: ( (otherlv_0= '<paragraph' (otherlv_1= 'name=' ( (lv_name_2_0= RULE_STRING ) ) )? (otherlv_3= 'alignment=' ( (lv_alignment_4_0= ruleDAlignment ) ) )? (otherlv_5= 'style=' ( (lv_style_6_0= RULE_STRING ) ) )? (otherlv_7= 'indent=' ( (lv_indent_8_0= RULE_REAL_STRING ) ) )? otherlv_9= '>' ( (lv_paragraphContent_10_0= ruleDParagraphContent ) )+ otherlv_11= '</paragraph>' ) )
            // InternalSVR.g:793:2: (otherlv_0= '<paragraph' (otherlv_1= 'name=' ( (lv_name_2_0= RULE_STRING ) ) )? (otherlv_3= 'alignment=' ( (lv_alignment_4_0= ruleDAlignment ) ) )? (otherlv_5= 'style=' ( (lv_style_6_0= RULE_STRING ) ) )? (otherlv_7= 'indent=' ( (lv_indent_8_0= RULE_REAL_STRING ) ) )? otherlv_9= '>' ( (lv_paragraphContent_10_0= ruleDParagraphContent ) )+ otherlv_11= '</paragraph>' )
            {
            // InternalSVR.g:793:2: (otherlv_0= '<paragraph' (otherlv_1= 'name=' ( (lv_name_2_0= RULE_STRING ) ) )? (otherlv_3= 'alignment=' ( (lv_alignment_4_0= ruleDAlignment ) ) )? (otherlv_5= 'style=' ( (lv_style_6_0= RULE_STRING ) ) )? (otherlv_7= 'indent=' ( (lv_indent_8_0= RULE_REAL_STRING ) ) )? otherlv_9= '>' ( (lv_paragraphContent_10_0= ruleDParagraphContent ) )+ otherlv_11= '</paragraph>' )
            // InternalSVR.g:794:3: otherlv_0= '<paragraph' (otherlv_1= 'name=' ( (lv_name_2_0= RULE_STRING ) ) )? (otherlv_3= 'alignment=' ( (lv_alignment_4_0= ruleDAlignment ) ) )? (otherlv_5= 'style=' ( (lv_style_6_0= RULE_STRING ) ) )? (otherlv_7= 'indent=' ( (lv_indent_8_0= RULE_REAL_STRING ) ) )? otherlv_9= '>' ( (lv_paragraphContent_10_0= ruleDParagraphContent ) )+ otherlv_11= '</paragraph>'
            {
            otherlv_0=(Token)match(input,36,FollowSets000.FOLLOW_24); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getDParagraphAccess().getParagraphKeyword_0());
              		
            }
            // InternalSVR.g:798:3: (otherlv_1= 'name=' ( (lv_name_2_0= RULE_STRING ) ) )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==17) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalSVR.g:799:4: otherlv_1= 'name=' ( (lv_name_2_0= RULE_STRING ) )
                    {
                    otherlv_1=(Token)match(input,17,FollowSets000.FOLLOW_4); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_1, grammarAccess.getDParagraphAccess().getNameKeyword_1_0());
                      			
                    }
                    // InternalSVR.g:803:4: ( (lv_name_2_0= RULE_STRING ) )
                    // InternalSVR.g:804:5: (lv_name_2_0= RULE_STRING )
                    {
                    // InternalSVR.g:804:5: (lv_name_2_0= RULE_STRING )
                    // InternalSVR.g:805:6: lv_name_2_0= RULE_STRING
                    {
                    lv_name_2_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_25); if (state.failed) return current;
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

            // InternalSVR.g:822:3: (otherlv_3= 'alignment=' ( (lv_alignment_4_0= ruleDAlignment ) ) )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==37) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalSVR.g:823:4: otherlv_3= 'alignment=' ( (lv_alignment_4_0= ruleDAlignment ) )
                    {
                    otherlv_3=(Token)match(input,37,FollowSets000.FOLLOW_26); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_3, grammarAccess.getDParagraphAccess().getAlignmentKeyword_2_0());
                      			
                    }
                    // InternalSVR.g:827:4: ( (lv_alignment_4_0= ruleDAlignment ) )
                    // InternalSVR.g:828:5: (lv_alignment_4_0= ruleDAlignment )
                    {
                    // InternalSVR.g:828:5: (lv_alignment_4_0= ruleDAlignment )
                    // InternalSVR.g:829:6: lv_alignment_4_0= ruleDAlignment
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getDParagraphAccess().getAlignmentDAlignmentEnumRuleCall_2_1_0());
                      					
                    }
                    pushFollow(FollowSets000.FOLLOW_27);
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

            // InternalSVR.g:847:3: (otherlv_5= 'style=' ( (lv_style_6_0= RULE_STRING ) ) )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==38) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalSVR.g:848:4: otherlv_5= 'style=' ( (lv_style_6_0= RULE_STRING ) )
                    {
                    otherlv_5=(Token)match(input,38,FollowSets000.FOLLOW_4); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_5, grammarAccess.getDParagraphAccess().getStyleKeyword_3_0());
                      			
                    }
                    // InternalSVR.g:852:4: ( (lv_style_6_0= RULE_STRING ) )
                    // InternalSVR.g:853:5: (lv_style_6_0= RULE_STRING )
                    {
                    // InternalSVR.g:853:5: (lv_style_6_0= RULE_STRING )
                    // InternalSVR.g:854:6: lv_style_6_0= RULE_STRING
                    {
                    lv_style_6_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_28); if (state.failed) return current;
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

            // InternalSVR.g:871:3: (otherlv_7= 'indent=' ( (lv_indent_8_0= RULE_REAL_STRING ) ) )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==39) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalSVR.g:872:4: otherlv_7= 'indent=' ( (lv_indent_8_0= RULE_REAL_STRING ) )
                    {
                    otherlv_7=(Token)match(input,39,FollowSets000.FOLLOW_29); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_7, grammarAccess.getDParagraphAccess().getIndentKeyword_4_0());
                      			
                    }
                    // InternalSVR.g:876:4: ( (lv_indent_8_0= RULE_REAL_STRING ) )
                    // InternalSVR.g:877:5: (lv_indent_8_0= RULE_REAL_STRING )
                    {
                    // InternalSVR.g:877:5: (lv_indent_8_0= RULE_REAL_STRING )
                    // InternalSVR.g:878:6: lv_indent_8_0= RULE_REAL_STRING
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

            otherlv_9=(Token)match(input,22,FollowSets000.FOLLOW_30); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_9, grammarAccess.getDParagraphAccess().getGreaterThanSignKeyword_5());
              		
            }
            // InternalSVR.g:899:3: ( (lv_paragraphContent_10_0= ruleDParagraphContent ) )+
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
            	    // InternalSVR.g:900:4: (lv_paragraphContent_10_0= ruleDParagraphContent )
            	    {
            	    // InternalSVR.g:900:4: (lv_paragraphContent_10_0= ruleDParagraphContent )
            	    // InternalSVR.g:901:5: lv_paragraphContent_10_0= ruleDParagraphContent
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getDParagraphAccess().getParagraphContentDParagraphContentParserRuleCall_6_0());
            	      				
            	    }
            	    pushFollow(FollowSets000.FOLLOW_31);
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
    // InternalSVR.g:926:1: entryRuleDListItem returns [EObject current=null] : iv_ruleDListItem= ruleDListItem EOF ;
    public final EObject entryRuleDListItem() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDListItem = null;


        try {
            // InternalSVR.g:926:50: (iv_ruleDListItem= ruleDListItem EOF )
            // InternalSVR.g:927:2: iv_ruleDListItem= ruleDListItem EOF
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
    // InternalSVR.g:933:1: ruleDListItem returns [EObject current=null] : ( () otherlv_1= '<listItem>' ( (lv_paragraph_2_0= ruleDParagraph ) )? (otherlv_3= '<sublist>' ( (lv_sublist_4_0= ruleDListContent ) ) otherlv_5= '</sublist>' )? otherlv_6= '</listItem>' ) ;
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
            // InternalSVR.g:939:2: ( ( () otherlv_1= '<listItem>' ( (lv_paragraph_2_0= ruleDParagraph ) )? (otherlv_3= '<sublist>' ( (lv_sublist_4_0= ruleDListContent ) ) otherlv_5= '</sublist>' )? otherlv_6= '</listItem>' ) )
            // InternalSVR.g:940:2: ( () otherlv_1= '<listItem>' ( (lv_paragraph_2_0= ruleDParagraph ) )? (otherlv_3= '<sublist>' ( (lv_sublist_4_0= ruleDListContent ) ) otherlv_5= '</sublist>' )? otherlv_6= '</listItem>' )
            {
            // InternalSVR.g:940:2: ( () otherlv_1= '<listItem>' ( (lv_paragraph_2_0= ruleDParagraph ) )? (otherlv_3= '<sublist>' ( (lv_sublist_4_0= ruleDListContent ) ) otherlv_5= '</sublist>' )? otherlv_6= '</listItem>' )
            // InternalSVR.g:941:3: () otherlv_1= '<listItem>' ( (lv_paragraph_2_0= ruleDParagraph ) )? (otherlv_3= '<sublist>' ( (lv_sublist_4_0= ruleDListContent ) ) otherlv_5= '</sublist>' )? otherlv_6= '</listItem>'
            {
            // InternalSVR.g:941:3: ()
            // InternalSVR.g:942:4: 
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

            otherlv_1=(Token)match(input,41,FollowSets000.FOLLOW_32); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getDListItemAccess().getListItemKeyword_1());
              		
            }
            // InternalSVR.g:955:3: ( (lv_paragraph_2_0= ruleDParagraph ) )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==36) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalSVR.g:956:4: (lv_paragraph_2_0= ruleDParagraph )
                    {
                    // InternalSVR.g:956:4: (lv_paragraph_2_0= ruleDParagraph )
                    // InternalSVR.g:957:5: lv_paragraph_2_0= ruleDParagraph
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getDListItemAccess().getParagraphDParagraphParserRuleCall_2_0());
                      				
                    }
                    pushFollow(FollowSets000.FOLLOW_33);
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

            // InternalSVR.g:974:3: (otherlv_3= '<sublist>' ( (lv_sublist_4_0= ruleDListContent ) ) otherlv_5= '</sublist>' )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==42) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalSVR.g:975:4: otherlv_3= '<sublist>' ( (lv_sublist_4_0= ruleDListContent ) ) otherlv_5= '</sublist>'
                    {
                    otherlv_3=(Token)match(input,42,FollowSets000.FOLLOW_34); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_3, grammarAccess.getDListItemAccess().getSublistKeyword_3_0());
                      			
                    }
                    // InternalSVR.g:979:4: ( (lv_sublist_4_0= ruleDListContent ) )
                    // InternalSVR.g:980:5: (lv_sublist_4_0= ruleDListContent )
                    {
                    // InternalSVR.g:980:5: (lv_sublist_4_0= ruleDListContent )
                    // InternalSVR.g:981:6: lv_sublist_4_0= ruleDListContent
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getDListItemAccess().getSublistDListContentParserRuleCall_3_1_0());
                      					
                    }
                    pushFollow(FollowSets000.FOLLOW_35);
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

                    otherlv_5=(Token)match(input,43,FollowSets000.FOLLOW_36); if (state.failed) return current;
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
    // InternalSVR.g:1011:1: entryRuleDListContent returns [EObject current=null] : iv_ruleDListContent= ruleDListContent EOF ;
    public final EObject entryRuleDListContent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDListContent = null;


        try {
            // InternalSVR.g:1011:53: (iv_ruleDListContent= ruleDListContent EOF )
            // InternalSVR.g:1012:2: iv_ruleDListContent= ruleDListContent EOF
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
    // InternalSVR.g:1018:1: ruleDListContent returns [EObject current=null] : (this_DItemize_0= ruleDItemize | this_DEnumerate_1= ruleDEnumerate ) ;
    public final EObject ruleDListContent() throws RecognitionException {
        EObject current = null;

        EObject this_DItemize_0 = null;

        EObject this_DEnumerate_1 = null;



        	enterRule();

        try {
            // InternalSVR.g:1024:2: ( (this_DItemize_0= ruleDItemize | this_DEnumerate_1= ruleDEnumerate ) )
            // InternalSVR.g:1025:2: (this_DItemize_0= ruleDItemize | this_DEnumerate_1= ruleDEnumerate )
            {
            // InternalSVR.g:1025:2: (this_DItemize_0= ruleDItemize | this_DEnumerate_1= ruleDEnumerate )
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
                    // InternalSVR.g:1026:3: this_DItemize_0= ruleDItemize
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
                    // InternalSVR.g:1038:3: this_DEnumerate_1= ruleDEnumerate
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
    // InternalSVR.g:1053:1: entryRuleDItemize returns [EObject current=null] : iv_ruleDItemize= ruleDItemize EOF ;
    public final EObject entryRuleDItemize() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDItemize = null;


        try {
            // InternalSVR.g:1053:49: (iv_ruleDItemize= ruleDItemize EOF )
            // InternalSVR.g:1054:2: iv_ruleDItemize= ruleDItemize EOF
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
    // InternalSVR.g:1060:1: ruleDItemize returns [EObject current=null] : (otherlv_0= '<itemize' (otherlv_1= 'name=' ( (lv_name_2_0= RULE_STRING ) ) )? (otherlv_3= 'alignment=' ( (lv_alignment_4_0= ruleDAlignment ) ) )? (otherlv_5= 'style=' ( (lv_style_6_0= RULE_STRING ) ) )? (otherlv_7= 'indent=' ( (lv_indent_8_0= RULE_REAL_STRING ) ) )? otherlv_9= '>' ( (lv_items_10_0= ruleDListItem ) )+ otherlv_11= '</itemize>' ) ;
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
            // InternalSVR.g:1066:2: ( (otherlv_0= '<itemize' (otherlv_1= 'name=' ( (lv_name_2_0= RULE_STRING ) ) )? (otherlv_3= 'alignment=' ( (lv_alignment_4_0= ruleDAlignment ) ) )? (otherlv_5= 'style=' ( (lv_style_6_0= RULE_STRING ) ) )? (otherlv_7= 'indent=' ( (lv_indent_8_0= RULE_REAL_STRING ) ) )? otherlv_9= '>' ( (lv_items_10_0= ruleDListItem ) )+ otherlv_11= '</itemize>' ) )
            // InternalSVR.g:1067:2: (otherlv_0= '<itemize' (otherlv_1= 'name=' ( (lv_name_2_0= RULE_STRING ) ) )? (otherlv_3= 'alignment=' ( (lv_alignment_4_0= ruleDAlignment ) ) )? (otherlv_5= 'style=' ( (lv_style_6_0= RULE_STRING ) ) )? (otherlv_7= 'indent=' ( (lv_indent_8_0= RULE_REAL_STRING ) ) )? otherlv_9= '>' ( (lv_items_10_0= ruleDListItem ) )+ otherlv_11= '</itemize>' )
            {
            // InternalSVR.g:1067:2: (otherlv_0= '<itemize' (otherlv_1= 'name=' ( (lv_name_2_0= RULE_STRING ) ) )? (otherlv_3= 'alignment=' ( (lv_alignment_4_0= ruleDAlignment ) ) )? (otherlv_5= 'style=' ( (lv_style_6_0= RULE_STRING ) ) )? (otherlv_7= 'indent=' ( (lv_indent_8_0= RULE_REAL_STRING ) ) )? otherlv_9= '>' ( (lv_items_10_0= ruleDListItem ) )+ otherlv_11= '</itemize>' )
            // InternalSVR.g:1068:3: otherlv_0= '<itemize' (otherlv_1= 'name=' ( (lv_name_2_0= RULE_STRING ) ) )? (otherlv_3= 'alignment=' ( (lv_alignment_4_0= ruleDAlignment ) ) )? (otherlv_5= 'style=' ( (lv_style_6_0= RULE_STRING ) ) )? (otherlv_7= 'indent=' ( (lv_indent_8_0= RULE_REAL_STRING ) ) )? otherlv_9= '>' ( (lv_items_10_0= ruleDListItem ) )+ otherlv_11= '</itemize>'
            {
            otherlv_0=(Token)match(input,45,FollowSets000.FOLLOW_24); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getDItemizeAccess().getItemizeKeyword_0());
              		
            }
            // InternalSVR.g:1072:3: (otherlv_1= 'name=' ( (lv_name_2_0= RULE_STRING ) ) )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==17) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalSVR.g:1073:4: otherlv_1= 'name=' ( (lv_name_2_0= RULE_STRING ) )
                    {
                    otherlv_1=(Token)match(input,17,FollowSets000.FOLLOW_4); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_1, grammarAccess.getDItemizeAccess().getNameKeyword_1_0());
                      			
                    }
                    // InternalSVR.g:1077:4: ( (lv_name_2_0= RULE_STRING ) )
                    // InternalSVR.g:1078:5: (lv_name_2_0= RULE_STRING )
                    {
                    // InternalSVR.g:1078:5: (lv_name_2_0= RULE_STRING )
                    // InternalSVR.g:1079:6: lv_name_2_0= RULE_STRING
                    {
                    lv_name_2_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_25); if (state.failed) return current;
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

            // InternalSVR.g:1096:3: (otherlv_3= 'alignment=' ( (lv_alignment_4_0= ruleDAlignment ) ) )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==37) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalSVR.g:1097:4: otherlv_3= 'alignment=' ( (lv_alignment_4_0= ruleDAlignment ) )
                    {
                    otherlv_3=(Token)match(input,37,FollowSets000.FOLLOW_26); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_3, grammarAccess.getDItemizeAccess().getAlignmentKeyword_2_0());
                      			
                    }
                    // InternalSVR.g:1101:4: ( (lv_alignment_4_0= ruleDAlignment ) )
                    // InternalSVR.g:1102:5: (lv_alignment_4_0= ruleDAlignment )
                    {
                    // InternalSVR.g:1102:5: (lv_alignment_4_0= ruleDAlignment )
                    // InternalSVR.g:1103:6: lv_alignment_4_0= ruleDAlignment
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getDItemizeAccess().getAlignmentDAlignmentEnumRuleCall_2_1_0());
                      					
                    }
                    pushFollow(FollowSets000.FOLLOW_27);
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

            // InternalSVR.g:1121:3: (otherlv_5= 'style=' ( (lv_style_6_0= RULE_STRING ) ) )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==38) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalSVR.g:1122:4: otherlv_5= 'style=' ( (lv_style_6_0= RULE_STRING ) )
                    {
                    otherlv_5=(Token)match(input,38,FollowSets000.FOLLOW_4); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_5, grammarAccess.getDItemizeAccess().getStyleKeyword_3_0());
                      			
                    }
                    // InternalSVR.g:1126:4: ( (lv_style_6_0= RULE_STRING ) )
                    // InternalSVR.g:1127:5: (lv_style_6_0= RULE_STRING )
                    {
                    // InternalSVR.g:1127:5: (lv_style_6_0= RULE_STRING )
                    // InternalSVR.g:1128:6: lv_style_6_0= RULE_STRING
                    {
                    lv_style_6_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_28); if (state.failed) return current;
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

            // InternalSVR.g:1145:3: (otherlv_7= 'indent=' ( (lv_indent_8_0= RULE_REAL_STRING ) ) )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==39) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalSVR.g:1146:4: otherlv_7= 'indent=' ( (lv_indent_8_0= RULE_REAL_STRING ) )
                    {
                    otherlv_7=(Token)match(input,39,FollowSets000.FOLLOW_29); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_7, grammarAccess.getDItemizeAccess().getIndentKeyword_4_0());
                      			
                    }
                    // InternalSVR.g:1150:4: ( (lv_indent_8_0= RULE_REAL_STRING ) )
                    // InternalSVR.g:1151:5: (lv_indent_8_0= RULE_REAL_STRING )
                    {
                    // InternalSVR.g:1151:5: (lv_indent_8_0= RULE_REAL_STRING )
                    // InternalSVR.g:1152:6: lv_indent_8_0= RULE_REAL_STRING
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

            otherlv_9=(Token)match(input,22,FollowSets000.FOLLOW_37); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_9, grammarAccess.getDItemizeAccess().getGreaterThanSignKeyword_5());
              		
            }
            // InternalSVR.g:1173:3: ( (lv_items_10_0= ruleDListItem ) )+
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
            	    // InternalSVR.g:1174:4: (lv_items_10_0= ruleDListItem )
            	    {
            	    // InternalSVR.g:1174:4: (lv_items_10_0= ruleDListItem )
            	    // InternalSVR.g:1175:5: lv_items_10_0= ruleDListItem
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getDItemizeAccess().getItemsDListItemParserRuleCall_6_0());
            	      				
            	    }
            	    pushFollow(FollowSets000.FOLLOW_38);
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
    // InternalSVR.g:1200:1: entryRuleDEnumerate returns [EObject current=null] : iv_ruleDEnumerate= ruleDEnumerate EOF ;
    public final EObject entryRuleDEnumerate() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDEnumerate = null;


        try {
            // InternalSVR.g:1200:51: (iv_ruleDEnumerate= ruleDEnumerate EOF )
            // InternalSVR.g:1201:2: iv_ruleDEnumerate= ruleDEnumerate EOF
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
    // InternalSVR.g:1207:1: ruleDEnumerate returns [EObject current=null] : (otherlv_0= '<enumerate' (otherlv_1= 'name=' ( (lv_name_2_0= RULE_STRING ) ) )? (otherlv_3= 'alignment=' ( (lv_alignment_4_0= ruleDAlignment ) ) )? (otherlv_5= 'style=' ( (lv_style_6_0= RULE_STRING ) ) )? (otherlv_7= 'indent=' ( (lv_indent_8_0= RULE_REAL_STRING ) ) )? otherlv_9= '>' ( (lv_items_10_0= ruleDListItem ) )+ otherlv_11= '</enumerate>' ) ;
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
            // InternalSVR.g:1213:2: ( (otherlv_0= '<enumerate' (otherlv_1= 'name=' ( (lv_name_2_0= RULE_STRING ) ) )? (otherlv_3= 'alignment=' ( (lv_alignment_4_0= ruleDAlignment ) ) )? (otherlv_5= 'style=' ( (lv_style_6_0= RULE_STRING ) ) )? (otherlv_7= 'indent=' ( (lv_indent_8_0= RULE_REAL_STRING ) ) )? otherlv_9= '>' ( (lv_items_10_0= ruleDListItem ) )+ otherlv_11= '</enumerate>' ) )
            // InternalSVR.g:1214:2: (otherlv_0= '<enumerate' (otherlv_1= 'name=' ( (lv_name_2_0= RULE_STRING ) ) )? (otherlv_3= 'alignment=' ( (lv_alignment_4_0= ruleDAlignment ) ) )? (otherlv_5= 'style=' ( (lv_style_6_0= RULE_STRING ) ) )? (otherlv_7= 'indent=' ( (lv_indent_8_0= RULE_REAL_STRING ) ) )? otherlv_9= '>' ( (lv_items_10_0= ruleDListItem ) )+ otherlv_11= '</enumerate>' )
            {
            // InternalSVR.g:1214:2: (otherlv_0= '<enumerate' (otherlv_1= 'name=' ( (lv_name_2_0= RULE_STRING ) ) )? (otherlv_3= 'alignment=' ( (lv_alignment_4_0= ruleDAlignment ) ) )? (otherlv_5= 'style=' ( (lv_style_6_0= RULE_STRING ) ) )? (otherlv_7= 'indent=' ( (lv_indent_8_0= RULE_REAL_STRING ) ) )? otherlv_9= '>' ( (lv_items_10_0= ruleDListItem ) )+ otherlv_11= '</enumerate>' )
            // InternalSVR.g:1215:3: otherlv_0= '<enumerate' (otherlv_1= 'name=' ( (lv_name_2_0= RULE_STRING ) ) )? (otherlv_3= 'alignment=' ( (lv_alignment_4_0= ruleDAlignment ) ) )? (otherlv_5= 'style=' ( (lv_style_6_0= RULE_STRING ) ) )? (otherlv_7= 'indent=' ( (lv_indent_8_0= RULE_REAL_STRING ) ) )? otherlv_9= '>' ( (lv_items_10_0= ruleDListItem ) )+ otherlv_11= '</enumerate>'
            {
            otherlv_0=(Token)match(input,47,FollowSets000.FOLLOW_24); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getDEnumerateAccess().getEnumerateKeyword_0());
              		
            }
            // InternalSVR.g:1219:3: (otherlv_1= 'name=' ( (lv_name_2_0= RULE_STRING ) ) )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==17) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalSVR.g:1220:4: otherlv_1= 'name=' ( (lv_name_2_0= RULE_STRING ) )
                    {
                    otherlv_1=(Token)match(input,17,FollowSets000.FOLLOW_4); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_1, grammarAccess.getDEnumerateAccess().getNameKeyword_1_0());
                      			
                    }
                    // InternalSVR.g:1224:4: ( (lv_name_2_0= RULE_STRING ) )
                    // InternalSVR.g:1225:5: (lv_name_2_0= RULE_STRING )
                    {
                    // InternalSVR.g:1225:5: (lv_name_2_0= RULE_STRING )
                    // InternalSVR.g:1226:6: lv_name_2_0= RULE_STRING
                    {
                    lv_name_2_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_25); if (state.failed) return current;
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

            // InternalSVR.g:1243:3: (otherlv_3= 'alignment=' ( (lv_alignment_4_0= ruleDAlignment ) ) )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==37) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalSVR.g:1244:4: otherlv_3= 'alignment=' ( (lv_alignment_4_0= ruleDAlignment ) )
                    {
                    otherlv_3=(Token)match(input,37,FollowSets000.FOLLOW_26); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_3, grammarAccess.getDEnumerateAccess().getAlignmentKeyword_2_0());
                      			
                    }
                    // InternalSVR.g:1248:4: ( (lv_alignment_4_0= ruleDAlignment ) )
                    // InternalSVR.g:1249:5: (lv_alignment_4_0= ruleDAlignment )
                    {
                    // InternalSVR.g:1249:5: (lv_alignment_4_0= ruleDAlignment )
                    // InternalSVR.g:1250:6: lv_alignment_4_0= ruleDAlignment
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getDEnumerateAccess().getAlignmentDAlignmentEnumRuleCall_2_1_0());
                      					
                    }
                    pushFollow(FollowSets000.FOLLOW_27);
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

            // InternalSVR.g:1268:3: (otherlv_5= 'style=' ( (lv_style_6_0= RULE_STRING ) ) )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==38) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalSVR.g:1269:4: otherlv_5= 'style=' ( (lv_style_6_0= RULE_STRING ) )
                    {
                    otherlv_5=(Token)match(input,38,FollowSets000.FOLLOW_4); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_5, grammarAccess.getDEnumerateAccess().getStyleKeyword_3_0());
                      			
                    }
                    // InternalSVR.g:1273:4: ( (lv_style_6_0= RULE_STRING ) )
                    // InternalSVR.g:1274:5: (lv_style_6_0= RULE_STRING )
                    {
                    // InternalSVR.g:1274:5: (lv_style_6_0= RULE_STRING )
                    // InternalSVR.g:1275:6: lv_style_6_0= RULE_STRING
                    {
                    lv_style_6_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_28); if (state.failed) return current;
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

            // InternalSVR.g:1292:3: (otherlv_7= 'indent=' ( (lv_indent_8_0= RULE_REAL_STRING ) ) )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==39) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalSVR.g:1293:4: otherlv_7= 'indent=' ( (lv_indent_8_0= RULE_REAL_STRING ) )
                    {
                    otherlv_7=(Token)match(input,39,FollowSets000.FOLLOW_29); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_7, grammarAccess.getDEnumerateAccess().getIndentKeyword_4_0());
                      			
                    }
                    // InternalSVR.g:1297:4: ( (lv_indent_8_0= RULE_REAL_STRING ) )
                    // InternalSVR.g:1298:5: (lv_indent_8_0= RULE_REAL_STRING )
                    {
                    // InternalSVR.g:1298:5: (lv_indent_8_0= RULE_REAL_STRING )
                    // InternalSVR.g:1299:6: lv_indent_8_0= RULE_REAL_STRING
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

            otherlv_9=(Token)match(input,22,FollowSets000.FOLLOW_37); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_9, grammarAccess.getDEnumerateAccess().getGreaterThanSignKeyword_5());
              		
            }
            // InternalSVR.g:1320:3: ( (lv_items_10_0= ruleDListItem ) )+
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
            	    // InternalSVR.g:1321:4: (lv_items_10_0= ruleDListItem )
            	    {
            	    // InternalSVR.g:1321:4: (lv_items_10_0= ruleDListItem )
            	    // InternalSVR.g:1322:5: lv_items_10_0= ruleDListItem
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getDEnumerateAccess().getItemsDListItemParserRuleCall_6_0());
            	      				
            	    }
            	    pushFollow(FollowSets000.FOLLOW_39);
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
    // InternalSVR.g:1347:1: entryRuleDParagraphContent returns [EObject current=null] : iv_ruleDParagraphContent= ruleDParagraphContent EOF ;
    public final EObject entryRuleDParagraphContent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDParagraphContent = null;


        try {
            // InternalSVR.g:1347:58: (iv_ruleDParagraphContent= ruleDParagraphContent EOF )
            // InternalSVR.g:1348:2: iv_ruleDParagraphContent= ruleDParagraphContent EOF
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
    // InternalSVR.g:1354:1: ruleDParagraphContent returns [EObject current=null] : (this_DRun_0= ruleDRun | this_DHyperlink_1= ruleDHyperlink ) ;
    public final EObject ruleDParagraphContent() throws RecognitionException {
        EObject current = null;

        EObject this_DRun_0 = null;

        EObject this_DHyperlink_1 = null;



        	enterRule();

        try {
            // InternalSVR.g:1360:2: ( (this_DRun_0= ruleDRun | this_DHyperlink_1= ruleDHyperlink ) )
            // InternalSVR.g:1361:2: (this_DRun_0= ruleDRun | this_DHyperlink_1= ruleDHyperlink )
            {
            // InternalSVR.g:1361:2: (this_DRun_0= ruleDRun | this_DHyperlink_1= ruleDHyperlink )
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
                    // InternalSVR.g:1362:3: this_DRun_0= ruleDRun
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
                    // InternalSVR.g:1374:3: this_DHyperlink_1= ruleDHyperlink
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
    // InternalSVR.g:1389:1: entryRuleDRun returns [EObject current=null] : iv_ruleDRun= ruleDRun EOF ;
    public final EObject entryRuleDRun() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDRun = null;


        try {
            // InternalSVR.g:1389:45: (iv_ruleDRun= ruleDRun EOF )
            // InternalSVR.g:1390:2: iv_ruleDRun= ruleDRun EOF
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
    // InternalSVR.g:1396:1: ruleDRun returns [EObject current=null] : (otherlv_0= '<run' (otherlv_1= 'bold=' ( (lv_bold_2_0= ruleDRunAttributes ) ) )? (otherlv_3= 'italics=' ( (lv_italics_4_0= ruleDRunAttributes ) ) )? (otherlv_5= 'underline=' ( (lv_underline_6_0= ruleDRunAttributes ) ) )? (otherlv_7= 'color=' ( (lv_color_8_0= RULE_STRING ) ) )? otherlv_9= '>' ( (lv_tab_10_0= ruleDTab ) )? ( (lv_text_11_0= ruleDText ) ) otherlv_12= '</run>' ) ;
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
            // InternalSVR.g:1402:2: ( (otherlv_0= '<run' (otherlv_1= 'bold=' ( (lv_bold_2_0= ruleDRunAttributes ) ) )? (otherlv_3= 'italics=' ( (lv_italics_4_0= ruleDRunAttributes ) ) )? (otherlv_5= 'underline=' ( (lv_underline_6_0= ruleDRunAttributes ) ) )? (otherlv_7= 'color=' ( (lv_color_8_0= RULE_STRING ) ) )? otherlv_9= '>' ( (lv_tab_10_0= ruleDTab ) )? ( (lv_text_11_0= ruleDText ) ) otherlv_12= '</run>' ) )
            // InternalSVR.g:1403:2: (otherlv_0= '<run' (otherlv_1= 'bold=' ( (lv_bold_2_0= ruleDRunAttributes ) ) )? (otherlv_3= 'italics=' ( (lv_italics_4_0= ruleDRunAttributes ) ) )? (otherlv_5= 'underline=' ( (lv_underline_6_0= ruleDRunAttributes ) ) )? (otherlv_7= 'color=' ( (lv_color_8_0= RULE_STRING ) ) )? otherlv_9= '>' ( (lv_tab_10_0= ruleDTab ) )? ( (lv_text_11_0= ruleDText ) ) otherlv_12= '</run>' )
            {
            // InternalSVR.g:1403:2: (otherlv_0= '<run' (otherlv_1= 'bold=' ( (lv_bold_2_0= ruleDRunAttributes ) ) )? (otherlv_3= 'italics=' ( (lv_italics_4_0= ruleDRunAttributes ) ) )? (otherlv_5= 'underline=' ( (lv_underline_6_0= ruleDRunAttributes ) ) )? (otherlv_7= 'color=' ( (lv_color_8_0= RULE_STRING ) ) )? otherlv_9= '>' ( (lv_tab_10_0= ruleDTab ) )? ( (lv_text_11_0= ruleDText ) ) otherlv_12= '</run>' )
            // InternalSVR.g:1404:3: otherlv_0= '<run' (otherlv_1= 'bold=' ( (lv_bold_2_0= ruleDRunAttributes ) ) )? (otherlv_3= 'italics=' ( (lv_italics_4_0= ruleDRunAttributes ) ) )? (otherlv_5= 'underline=' ( (lv_underline_6_0= ruleDRunAttributes ) ) )? (otherlv_7= 'color=' ( (lv_color_8_0= RULE_STRING ) ) )? otherlv_9= '>' ( (lv_tab_10_0= ruleDTab ) )? ( (lv_text_11_0= ruleDText ) ) otherlv_12= '</run>'
            {
            otherlv_0=(Token)match(input,49,FollowSets000.FOLLOW_40); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getDRunAccess().getRunKeyword_0());
              		
            }
            // InternalSVR.g:1408:3: (otherlv_1= 'bold=' ( (lv_bold_2_0= ruleDRunAttributes ) ) )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==50) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalSVR.g:1409:4: otherlv_1= 'bold=' ( (lv_bold_2_0= ruleDRunAttributes ) )
                    {
                    otherlv_1=(Token)match(input,50,FollowSets000.FOLLOW_41); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_1, grammarAccess.getDRunAccess().getBoldKeyword_1_0());
                      			
                    }
                    // InternalSVR.g:1413:4: ( (lv_bold_2_0= ruleDRunAttributes ) )
                    // InternalSVR.g:1414:5: (lv_bold_2_0= ruleDRunAttributes )
                    {
                    // InternalSVR.g:1414:5: (lv_bold_2_0= ruleDRunAttributes )
                    // InternalSVR.g:1415:6: lv_bold_2_0= ruleDRunAttributes
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getDRunAccess().getBoldDRunAttributesEnumRuleCall_1_1_0());
                      					
                    }
                    pushFollow(FollowSets000.FOLLOW_42);
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

            // InternalSVR.g:1433:3: (otherlv_3= 'italics=' ( (lv_italics_4_0= ruleDRunAttributes ) ) )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==51) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalSVR.g:1434:4: otherlv_3= 'italics=' ( (lv_italics_4_0= ruleDRunAttributes ) )
                    {
                    otherlv_3=(Token)match(input,51,FollowSets000.FOLLOW_41); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_3, grammarAccess.getDRunAccess().getItalicsKeyword_2_0());
                      			
                    }
                    // InternalSVR.g:1438:4: ( (lv_italics_4_0= ruleDRunAttributes ) )
                    // InternalSVR.g:1439:5: (lv_italics_4_0= ruleDRunAttributes )
                    {
                    // InternalSVR.g:1439:5: (lv_italics_4_0= ruleDRunAttributes )
                    // InternalSVR.g:1440:6: lv_italics_4_0= ruleDRunAttributes
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getDRunAccess().getItalicsDRunAttributesEnumRuleCall_2_1_0());
                      					
                    }
                    pushFollow(FollowSets000.FOLLOW_43);
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

            // InternalSVR.g:1458:3: (otherlv_5= 'underline=' ( (lv_underline_6_0= ruleDRunAttributes ) ) )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==52) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalSVR.g:1459:4: otherlv_5= 'underline=' ( (lv_underline_6_0= ruleDRunAttributes ) )
                    {
                    otherlv_5=(Token)match(input,52,FollowSets000.FOLLOW_41); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_5, grammarAccess.getDRunAccess().getUnderlineKeyword_3_0());
                      			
                    }
                    // InternalSVR.g:1463:4: ( (lv_underline_6_0= ruleDRunAttributes ) )
                    // InternalSVR.g:1464:5: (lv_underline_6_0= ruleDRunAttributes )
                    {
                    // InternalSVR.g:1464:5: (lv_underline_6_0= ruleDRunAttributes )
                    // InternalSVR.g:1465:6: lv_underline_6_0= ruleDRunAttributes
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getDRunAccess().getUnderlineDRunAttributesEnumRuleCall_3_1_0());
                      					
                    }
                    pushFollow(FollowSets000.FOLLOW_44);
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

            // InternalSVR.g:1483:3: (otherlv_7= 'color=' ( (lv_color_8_0= RULE_STRING ) ) )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==53) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // InternalSVR.g:1484:4: otherlv_7= 'color=' ( (lv_color_8_0= RULE_STRING ) )
                    {
                    otherlv_7=(Token)match(input,53,FollowSets000.FOLLOW_4); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_7, grammarAccess.getDRunAccess().getColorKeyword_4_0());
                      			
                    }
                    // InternalSVR.g:1488:4: ( (lv_color_8_0= RULE_STRING ) )
                    // InternalSVR.g:1489:5: (lv_color_8_0= RULE_STRING )
                    {
                    // InternalSVR.g:1489:5: (lv_color_8_0= RULE_STRING )
                    // InternalSVR.g:1490:6: lv_color_8_0= RULE_STRING
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

            otherlv_9=(Token)match(input,22,FollowSets000.FOLLOW_45); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_9, grammarAccess.getDRunAccess().getGreaterThanSignKeyword_5());
              		
            }
            // InternalSVR.g:1511:3: ( (lv_tab_10_0= ruleDTab ) )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==58) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // InternalSVR.g:1512:4: (lv_tab_10_0= ruleDTab )
                    {
                    // InternalSVR.g:1512:4: (lv_tab_10_0= ruleDTab )
                    // InternalSVR.g:1513:5: lv_tab_10_0= ruleDTab
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getDRunAccess().getTabDTabParserRuleCall_6_0());
                      				
                    }
                    pushFollow(FollowSets000.FOLLOW_45);
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

            // InternalSVR.g:1530:3: ( (lv_text_11_0= ruleDText ) )
            // InternalSVR.g:1531:4: (lv_text_11_0= ruleDText )
            {
            // InternalSVR.g:1531:4: (lv_text_11_0= ruleDText )
            // InternalSVR.g:1532:5: lv_text_11_0= ruleDText
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getDRunAccess().getTextDTextParserRuleCall_7_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_46);
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
    // InternalSVR.g:1557:1: entryRuleDHyperlink returns [EObject current=null] : iv_ruleDHyperlink= ruleDHyperlink EOF ;
    public final EObject entryRuleDHyperlink() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDHyperlink = null;


        try {
            // InternalSVR.g:1557:51: (iv_ruleDHyperlink= ruleDHyperlink EOF )
            // InternalSVR.g:1558:2: iv_ruleDHyperlink= ruleDHyperlink EOF
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
    // InternalSVR.g:1564:1: ruleDHyperlink returns [EObject current=null] : (otherlv_0= '<hyperlink' otherlv_1= 'reference=' ( (otherlv_2= RULE_STRING ) ) ( (otherlv_3= '>' ( (lv_run_4_0= ruleDRun ) ) otherlv_5= '</hyperlink>' ) | otherlv_6= '/>' ) ) ;
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
            // InternalSVR.g:1570:2: ( (otherlv_0= '<hyperlink' otherlv_1= 'reference=' ( (otherlv_2= RULE_STRING ) ) ( (otherlv_3= '>' ( (lv_run_4_0= ruleDRun ) ) otherlv_5= '</hyperlink>' ) | otherlv_6= '/>' ) ) )
            // InternalSVR.g:1571:2: (otherlv_0= '<hyperlink' otherlv_1= 'reference=' ( (otherlv_2= RULE_STRING ) ) ( (otherlv_3= '>' ( (lv_run_4_0= ruleDRun ) ) otherlv_5= '</hyperlink>' ) | otherlv_6= '/>' ) )
            {
            // InternalSVR.g:1571:2: (otherlv_0= '<hyperlink' otherlv_1= 'reference=' ( (otherlv_2= RULE_STRING ) ) ( (otherlv_3= '>' ( (lv_run_4_0= ruleDRun ) ) otherlv_5= '</hyperlink>' ) | otherlv_6= '/>' ) )
            // InternalSVR.g:1572:3: otherlv_0= '<hyperlink' otherlv_1= 'reference=' ( (otherlv_2= RULE_STRING ) ) ( (otherlv_3= '>' ( (lv_run_4_0= ruleDRun ) ) otherlv_5= '</hyperlink>' ) | otherlv_6= '/>' )
            {
            otherlv_0=(Token)match(input,55,FollowSets000.FOLLOW_47); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getDHyperlinkAccess().getHyperlinkKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,56,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getDHyperlinkAccess().getReferenceKeyword_1());
              		
            }
            // InternalSVR.g:1580:3: ( (otherlv_2= RULE_STRING ) )
            // InternalSVR.g:1581:4: (otherlv_2= RULE_STRING )
            {
            // InternalSVR.g:1581:4: (otherlv_2= RULE_STRING )
            // InternalSVR.g:1582:5: otherlv_2= RULE_STRING
            {
            if ( state.backtracking==0 ) {

              					/* */
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getDHyperlinkRule());
              					}
              				
            }
            otherlv_2=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_48); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(otherlv_2, grammarAccess.getDHyperlinkAccess().getReferenceDReferenceableObjectCrossReference_2_0());
              				
            }

            }


            }

            // InternalSVR.g:1596:3: ( (otherlv_3= '>' ( (lv_run_4_0= ruleDRun ) ) otherlv_5= '</hyperlink>' ) | otherlv_6= '/>' )
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
                    // InternalSVR.g:1597:4: (otherlv_3= '>' ( (lv_run_4_0= ruleDRun ) ) otherlv_5= '</hyperlink>' )
                    {
                    // InternalSVR.g:1597:4: (otherlv_3= '>' ( (lv_run_4_0= ruleDRun ) ) otherlv_5= '</hyperlink>' )
                    // InternalSVR.g:1598:5: otherlv_3= '>' ( (lv_run_4_0= ruleDRun ) ) otherlv_5= '</hyperlink>'
                    {
                    otherlv_3=(Token)match(input,22,FollowSets000.FOLLOW_49); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_3, grammarAccess.getDHyperlinkAccess().getGreaterThanSignKeyword_3_0_0());
                      				
                    }
                    // InternalSVR.g:1602:5: ( (lv_run_4_0= ruleDRun ) )
                    // InternalSVR.g:1603:6: (lv_run_4_0= ruleDRun )
                    {
                    // InternalSVR.g:1603:6: (lv_run_4_0= ruleDRun )
                    // InternalSVR.g:1604:7: lv_run_4_0= ruleDRun
                    {
                    if ( state.backtracking==0 ) {

                      							newCompositeNode(grammarAccess.getDHyperlinkAccess().getRunDRunParserRuleCall_3_0_1_0());
                      						
                    }
                    pushFollow(FollowSets000.FOLLOW_50);
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
                    // InternalSVR.g:1627:4: otherlv_6= '/>'
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
    // InternalSVR.g:1636:1: entryRuleDTab returns [EObject current=null] : iv_ruleDTab= ruleDTab EOF ;
    public final EObject entryRuleDTab() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDTab = null;


        try {
            // InternalSVR.g:1636:45: (iv_ruleDTab= ruleDTab EOF )
            // InternalSVR.g:1637:2: iv_ruleDTab= ruleDTab EOF
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
    // InternalSVR.g:1643:1: ruleDTab returns [EObject current=null] : ( () otherlv_1= '<tab/>' ) ;
    public final EObject ruleDTab() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalSVR.g:1649:2: ( ( () otherlv_1= '<tab/>' ) )
            // InternalSVR.g:1650:2: ( () otherlv_1= '<tab/>' )
            {
            // InternalSVR.g:1650:2: ( () otherlv_1= '<tab/>' )
            // InternalSVR.g:1651:3: () otherlv_1= '<tab/>'
            {
            // InternalSVR.g:1651:3: ()
            // InternalSVR.g:1652:4: 
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
    // InternalSVR.g:1669:1: entryRuleDText returns [EObject current=null] : iv_ruleDText= ruleDText EOF ;
    public final EObject entryRuleDText() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDText = null;


        try {
            // InternalSVR.g:1669:46: (iv_ruleDText= ruleDText EOF )
            // InternalSVR.g:1670:2: iv_ruleDText= ruleDText EOF
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
    // InternalSVR.g:1676:1: ruleDText returns [EObject current=null] : ( (lv_content_0_0= RULE_RUNTEXT ) ) ;
    public final EObject ruleDText() throws RecognitionException {
        EObject current = null;

        Token lv_content_0_0=null;


        	enterRule();

        try {
            // InternalSVR.g:1682:2: ( ( (lv_content_0_0= RULE_RUNTEXT ) ) )
            // InternalSVR.g:1683:2: ( (lv_content_0_0= RULE_RUNTEXT ) )
            {
            // InternalSVR.g:1683:2: ( (lv_content_0_0= RULE_RUNTEXT ) )
            // InternalSVR.g:1684:3: (lv_content_0_0= RULE_RUNTEXT )
            {
            // InternalSVR.g:1684:3: (lv_content_0_0= RULE_RUNTEXT )
            // InternalSVR.g:1685:4: lv_content_0_0= RULE_RUNTEXT
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
    // InternalSVR.g:1704:1: entryRuleDFigureFromFile returns [EObject current=null] : iv_ruleDFigureFromFile= ruleDFigureFromFile EOF ;
    public final EObject entryRuleDFigureFromFile() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDFigureFromFile = null;


        try {
            // InternalSVR.g:1704:56: (iv_ruleDFigureFromFile= ruleDFigureFromFile EOF )
            // InternalSVR.g:1705:2: iv_ruleDFigureFromFile= ruleDFigureFromFile EOF
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
    // InternalSVR.g:1711:1: ruleDFigureFromFile returns [EObject current=null] : (otherlv_0= '<figureFromFile' otherlv_1= 'name=' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= 'referenceFile=' ( (lv_referenceFile_4_0= RULE_STRING ) ) otherlv_5= 'width=' ( (lv_width_6_0= RULE_UINT_STRING ) ) otherlv_7= 'height=' ( (lv_height_8_0= RULE_UINT_STRING ) ) (otherlv_9= 'alignment=' ( (lv_alignment_10_0= ruleDAlignment ) ) )? (otherlv_11= 'style=' ( (lv_style_12_0= RULE_STRING ) ) )? (otherlv_13= 'indent=' ( (lv_indent_14_0= RULE_REAL_STRING ) ) )? (otherlv_15= 'caption=' ( (lv_caption_16_0= RULE_STRING ) ) )? otherlv_17= '/>' ) ;
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
            // InternalSVR.g:1717:2: ( (otherlv_0= '<figureFromFile' otherlv_1= 'name=' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= 'referenceFile=' ( (lv_referenceFile_4_0= RULE_STRING ) ) otherlv_5= 'width=' ( (lv_width_6_0= RULE_UINT_STRING ) ) otherlv_7= 'height=' ( (lv_height_8_0= RULE_UINT_STRING ) ) (otherlv_9= 'alignment=' ( (lv_alignment_10_0= ruleDAlignment ) ) )? (otherlv_11= 'style=' ( (lv_style_12_0= RULE_STRING ) ) )? (otherlv_13= 'indent=' ( (lv_indent_14_0= RULE_REAL_STRING ) ) )? (otherlv_15= 'caption=' ( (lv_caption_16_0= RULE_STRING ) ) )? otherlv_17= '/>' ) )
            // InternalSVR.g:1718:2: (otherlv_0= '<figureFromFile' otherlv_1= 'name=' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= 'referenceFile=' ( (lv_referenceFile_4_0= RULE_STRING ) ) otherlv_5= 'width=' ( (lv_width_6_0= RULE_UINT_STRING ) ) otherlv_7= 'height=' ( (lv_height_8_0= RULE_UINT_STRING ) ) (otherlv_9= 'alignment=' ( (lv_alignment_10_0= ruleDAlignment ) ) )? (otherlv_11= 'style=' ( (lv_style_12_0= RULE_STRING ) ) )? (otherlv_13= 'indent=' ( (lv_indent_14_0= RULE_REAL_STRING ) ) )? (otherlv_15= 'caption=' ( (lv_caption_16_0= RULE_STRING ) ) )? otherlv_17= '/>' )
            {
            // InternalSVR.g:1718:2: (otherlv_0= '<figureFromFile' otherlv_1= 'name=' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= 'referenceFile=' ( (lv_referenceFile_4_0= RULE_STRING ) ) otherlv_5= 'width=' ( (lv_width_6_0= RULE_UINT_STRING ) ) otherlv_7= 'height=' ( (lv_height_8_0= RULE_UINT_STRING ) ) (otherlv_9= 'alignment=' ( (lv_alignment_10_0= ruleDAlignment ) ) )? (otherlv_11= 'style=' ( (lv_style_12_0= RULE_STRING ) ) )? (otherlv_13= 'indent=' ( (lv_indent_14_0= RULE_REAL_STRING ) ) )? (otherlv_15= 'caption=' ( (lv_caption_16_0= RULE_STRING ) ) )? otherlv_17= '/>' )
            // InternalSVR.g:1719:3: otherlv_0= '<figureFromFile' otherlv_1= 'name=' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= 'referenceFile=' ( (lv_referenceFile_4_0= RULE_STRING ) ) otherlv_5= 'width=' ( (lv_width_6_0= RULE_UINT_STRING ) ) otherlv_7= 'height=' ( (lv_height_8_0= RULE_UINT_STRING ) ) (otherlv_9= 'alignment=' ( (lv_alignment_10_0= ruleDAlignment ) ) )? (otherlv_11= 'style=' ( (lv_style_12_0= RULE_STRING ) ) )? (otherlv_13= 'indent=' ( (lv_indent_14_0= RULE_REAL_STRING ) ) )? (otherlv_15= 'caption=' ( (lv_caption_16_0= RULE_STRING ) ) )? otherlv_17= '/>'
            {
            otherlv_0=(Token)match(input,59,FollowSets000.FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getDFigureFromFileAccess().getFigureFromFileKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,17,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getDFigureFromFileAccess().getNameKeyword_1());
              		
            }
            // InternalSVR.g:1727:3: ( (lv_name_2_0= RULE_STRING ) )
            // InternalSVR.g:1728:4: (lv_name_2_0= RULE_STRING )
            {
            // InternalSVR.g:1728:4: (lv_name_2_0= RULE_STRING )
            // InternalSVR.g:1729:5: lv_name_2_0= RULE_STRING
            {
            lv_name_2_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_51); if (state.failed) return current;
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
            // InternalSVR.g:1749:3: ( (lv_referenceFile_4_0= RULE_STRING ) )
            // InternalSVR.g:1750:4: (lv_referenceFile_4_0= RULE_STRING )
            {
            // InternalSVR.g:1750:4: (lv_referenceFile_4_0= RULE_STRING )
            // InternalSVR.g:1751:5: lv_referenceFile_4_0= RULE_STRING
            {
            lv_referenceFile_4_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_52); if (state.failed) return current;
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
            // InternalSVR.g:1771:3: ( (lv_width_6_0= RULE_UINT_STRING ) )
            // InternalSVR.g:1772:4: (lv_width_6_0= RULE_UINT_STRING )
            {
            // InternalSVR.g:1772:4: (lv_width_6_0= RULE_UINT_STRING )
            // InternalSVR.g:1773:5: lv_width_6_0= RULE_UINT_STRING
            {
            lv_width_6_0=(Token)match(input,RULE_UINT_STRING,FollowSets000.FOLLOW_53); if (state.failed) return current;
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
            // InternalSVR.g:1793:3: ( (lv_height_8_0= RULE_UINT_STRING ) )
            // InternalSVR.g:1794:4: (lv_height_8_0= RULE_UINT_STRING )
            {
            // InternalSVR.g:1794:4: (lv_height_8_0= RULE_UINT_STRING )
            // InternalSVR.g:1795:5: lv_height_8_0= RULE_UINT_STRING
            {
            lv_height_8_0=(Token)match(input,RULE_UINT_STRING,FollowSets000.FOLLOW_54); if (state.failed) return current;
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

            // InternalSVR.g:1811:3: (otherlv_9= 'alignment=' ( (lv_alignment_10_0= ruleDAlignment ) ) )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==37) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // InternalSVR.g:1812:4: otherlv_9= 'alignment=' ( (lv_alignment_10_0= ruleDAlignment ) )
                    {
                    otherlv_9=(Token)match(input,37,FollowSets000.FOLLOW_26); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_9, grammarAccess.getDFigureFromFileAccess().getAlignmentKeyword_9_0());
                      			
                    }
                    // InternalSVR.g:1816:4: ( (lv_alignment_10_0= ruleDAlignment ) )
                    // InternalSVR.g:1817:5: (lv_alignment_10_0= ruleDAlignment )
                    {
                    // InternalSVR.g:1817:5: (lv_alignment_10_0= ruleDAlignment )
                    // InternalSVR.g:1818:6: lv_alignment_10_0= ruleDAlignment
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getDFigureFromFileAccess().getAlignmentDAlignmentEnumRuleCall_9_1_0());
                      					
                    }
                    pushFollow(FollowSets000.FOLLOW_55);
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

            // InternalSVR.g:1836:3: (otherlv_11= 'style=' ( (lv_style_12_0= RULE_STRING ) ) )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==38) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // InternalSVR.g:1837:4: otherlv_11= 'style=' ( (lv_style_12_0= RULE_STRING ) )
                    {
                    otherlv_11=(Token)match(input,38,FollowSets000.FOLLOW_4); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_11, grammarAccess.getDFigureFromFileAccess().getStyleKeyword_10_0());
                      			
                    }
                    // InternalSVR.g:1841:4: ( (lv_style_12_0= RULE_STRING ) )
                    // InternalSVR.g:1842:5: (lv_style_12_0= RULE_STRING )
                    {
                    // InternalSVR.g:1842:5: (lv_style_12_0= RULE_STRING )
                    // InternalSVR.g:1843:6: lv_style_12_0= RULE_STRING
                    {
                    lv_style_12_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_56); if (state.failed) return current;
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

            // InternalSVR.g:1860:3: (otherlv_13= 'indent=' ( (lv_indent_14_0= RULE_REAL_STRING ) ) )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==39) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // InternalSVR.g:1861:4: otherlv_13= 'indent=' ( (lv_indent_14_0= RULE_REAL_STRING ) )
                    {
                    otherlv_13=(Token)match(input,39,FollowSets000.FOLLOW_29); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_13, grammarAccess.getDFigureFromFileAccess().getIndentKeyword_11_0());
                      			
                    }
                    // InternalSVR.g:1865:4: ( (lv_indent_14_0= RULE_REAL_STRING ) )
                    // InternalSVR.g:1866:5: (lv_indent_14_0= RULE_REAL_STRING )
                    {
                    // InternalSVR.g:1866:5: (lv_indent_14_0= RULE_REAL_STRING )
                    // InternalSVR.g:1867:6: lv_indent_14_0= RULE_REAL_STRING
                    {
                    lv_indent_14_0=(Token)match(input,RULE_REAL_STRING,FollowSets000.FOLLOW_57); if (state.failed) return current;
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

            // InternalSVR.g:1884:3: (otherlv_15= 'caption=' ( (lv_caption_16_0= RULE_STRING ) ) )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==63) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // InternalSVR.g:1885:4: otherlv_15= 'caption=' ( (lv_caption_16_0= RULE_STRING ) )
                    {
                    otherlv_15=(Token)match(input,63,FollowSets000.FOLLOW_4); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_15, grammarAccess.getDFigureFromFileAccess().getCaptionKeyword_12_0());
                      			
                    }
                    // InternalSVR.g:1889:4: ( (lv_caption_16_0= RULE_STRING ) )
                    // InternalSVR.g:1890:5: (lv_caption_16_0= RULE_STRING )
                    {
                    // InternalSVR.g:1890:5: (lv_caption_16_0= RULE_STRING )
                    // InternalSVR.g:1891:6: lv_caption_16_0= RULE_STRING
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
    // InternalSVR.g:1916:1: entryRuleDTableFromFile returns [EObject current=null] : iv_ruleDTableFromFile= ruleDTableFromFile EOF ;
    public final EObject entryRuleDTableFromFile() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDTableFromFile = null;


        try {
            // InternalSVR.g:1916:55: (iv_ruleDTableFromFile= ruleDTableFromFile EOF )
            // InternalSVR.g:1917:2: iv_ruleDTableFromFile= ruleDTableFromFile EOF
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
    // InternalSVR.g:1923:1: ruleDTableFromFile returns [EObject current=null] : (otherlv_0= '<tableFromFile' otherlv_1= 'name=' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= 'referenceFile=' ( (lv_referenceFile_4_0= RULE_STRING ) ) otherlv_5= 'width=' ( (lv_width_6_0= RULE_UINT_STRING ) ) otherlv_7= 'height=' ( (lv_height_8_0= RULE_UINT_STRING ) ) (otherlv_9= 'alignment=' ( (lv_alignment_10_0= ruleDAlignment ) ) )? (otherlv_11= 'style=' ( (lv_style_12_0= RULE_STRING ) ) )? (otherlv_13= 'indent=' ( (lv_indent_14_0= RULE_REAL_STRING ) ) )? (otherlv_15= 'caption=' ( (lv_caption_16_0= RULE_STRING ) ) )? otherlv_17= '/>' ) ;
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
            // InternalSVR.g:1929:2: ( (otherlv_0= '<tableFromFile' otherlv_1= 'name=' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= 'referenceFile=' ( (lv_referenceFile_4_0= RULE_STRING ) ) otherlv_5= 'width=' ( (lv_width_6_0= RULE_UINT_STRING ) ) otherlv_7= 'height=' ( (lv_height_8_0= RULE_UINT_STRING ) ) (otherlv_9= 'alignment=' ( (lv_alignment_10_0= ruleDAlignment ) ) )? (otherlv_11= 'style=' ( (lv_style_12_0= RULE_STRING ) ) )? (otherlv_13= 'indent=' ( (lv_indent_14_0= RULE_REAL_STRING ) ) )? (otherlv_15= 'caption=' ( (lv_caption_16_0= RULE_STRING ) ) )? otherlv_17= '/>' ) )
            // InternalSVR.g:1930:2: (otherlv_0= '<tableFromFile' otherlv_1= 'name=' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= 'referenceFile=' ( (lv_referenceFile_4_0= RULE_STRING ) ) otherlv_5= 'width=' ( (lv_width_6_0= RULE_UINT_STRING ) ) otherlv_7= 'height=' ( (lv_height_8_0= RULE_UINT_STRING ) ) (otherlv_9= 'alignment=' ( (lv_alignment_10_0= ruleDAlignment ) ) )? (otherlv_11= 'style=' ( (lv_style_12_0= RULE_STRING ) ) )? (otherlv_13= 'indent=' ( (lv_indent_14_0= RULE_REAL_STRING ) ) )? (otherlv_15= 'caption=' ( (lv_caption_16_0= RULE_STRING ) ) )? otherlv_17= '/>' )
            {
            // InternalSVR.g:1930:2: (otherlv_0= '<tableFromFile' otherlv_1= 'name=' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= 'referenceFile=' ( (lv_referenceFile_4_0= RULE_STRING ) ) otherlv_5= 'width=' ( (lv_width_6_0= RULE_UINT_STRING ) ) otherlv_7= 'height=' ( (lv_height_8_0= RULE_UINT_STRING ) ) (otherlv_9= 'alignment=' ( (lv_alignment_10_0= ruleDAlignment ) ) )? (otherlv_11= 'style=' ( (lv_style_12_0= RULE_STRING ) ) )? (otherlv_13= 'indent=' ( (lv_indent_14_0= RULE_REAL_STRING ) ) )? (otherlv_15= 'caption=' ( (lv_caption_16_0= RULE_STRING ) ) )? otherlv_17= '/>' )
            // InternalSVR.g:1931:3: otherlv_0= '<tableFromFile' otherlv_1= 'name=' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= 'referenceFile=' ( (lv_referenceFile_4_0= RULE_STRING ) ) otherlv_5= 'width=' ( (lv_width_6_0= RULE_UINT_STRING ) ) otherlv_7= 'height=' ( (lv_height_8_0= RULE_UINT_STRING ) ) (otherlv_9= 'alignment=' ( (lv_alignment_10_0= ruleDAlignment ) ) )? (otherlv_11= 'style=' ( (lv_style_12_0= RULE_STRING ) ) )? (otherlv_13= 'indent=' ( (lv_indent_14_0= RULE_REAL_STRING ) ) )? (otherlv_15= 'caption=' ( (lv_caption_16_0= RULE_STRING ) ) )? otherlv_17= '/>'
            {
            otherlv_0=(Token)match(input,64,FollowSets000.FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getDTableFromFileAccess().getTableFromFileKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,17,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getDTableFromFileAccess().getNameKeyword_1());
              		
            }
            // InternalSVR.g:1939:3: ( (lv_name_2_0= RULE_STRING ) )
            // InternalSVR.g:1940:4: (lv_name_2_0= RULE_STRING )
            {
            // InternalSVR.g:1940:4: (lv_name_2_0= RULE_STRING )
            // InternalSVR.g:1941:5: lv_name_2_0= RULE_STRING
            {
            lv_name_2_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_51); if (state.failed) return current;
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
            // InternalSVR.g:1961:3: ( (lv_referenceFile_4_0= RULE_STRING ) )
            // InternalSVR.g:1962:4: (lv_referenceFile_4_0= RULE_STRING )
            {
            // InternalSVR.g:1962:4: (lv_referenceFile_4_0= RULE_STRING )
            // InternalSVR.g:1963:5: lv_referenceFile_4_0= RULE_STRING
            {
            lv_referenceFile_4_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_52); if (state.failed) return current;
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
            // InternalSVR.g:1983:3: ( (lv_width_6_0= RULE_UINT_STRING ) )
            // InternalSVR.g:1984:4: (lv_width_6_0= RULE_UINT_STRING )
            {
            // InternalSVR.g:1984:4: (lv_width_6_0= RULE_UINT_STRING )
            // InternalSVR.g:1985:5: lv_width_6_0= RULE_UINT_STRING
            {
            lv_width_6_0=(Token)match(input,RULE_UINT_STRING,FollowSets000.FOLLOW_53); if (state.failed) return current;
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
            // InternalSVR.g:2005:3: ( (lv_height_8_0= RULE_UINT_STRING ) )
            // InternalSVR.g:2006:4: (lv_height_8_0= RULE_UINT_STRING )
            {
            // InternalSVR.g:2006:4: (lv_height_8_0= RULE_UINT_STRING )
            // InternalSVR.g:2007:5: lv_height_8_0= RULE_UINT_STRING
            {
            lv_height_8_0=(Token)match(input,RULE_UINT_STRING,FollowSets000.FOLLOW_54); if (state.failed) return current;
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

            // InternalSVR.g:2023:3: (otherlv_9= 'alignment=' ( (lv_alignment_10_0= ruleDAlignment ) ) )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==37) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // InternalSVR.g:2024:4: otherlv_9= 'alignment=' ( (lv_alignment_10_0= ruleDAlignment ) )
                    {
                    otherlv_9=(Token)match(input,37,FollowSets000.FOLLOW_26); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_9, grammarAccess.getDTableFromFileAccess().getAlignmentKeyword_9_0());
                      			
                    }
                    // InternalSVR.g:2028:4: ( (lv_alignment_10_0= ruleDAlignment ) )
                    // InternalSVR.g:2029:5: (lv_alignment_10_0= ruleDAlignment )
                    {
                    // InternalSVR.g:2029:5: (lv_alignment_10_0= ruleDAlignment )
                    // InternalSVR.g:2030:6: lv_alignment_10_0= ruleDAlignment
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getDTableFromFileAccess().getAlignmentDAlignmentEnumRuleCall_9_1_0());
                      					
                    }
                    pushFollow(FollowSets000.FOLLOW_55);
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

            // InternalSVR.g:2048:3: (otherlv_11= 'style=' ( (lv_style_12_0= RULE_STRING ) ) )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==38) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // InternalSVR.g:2049:4: otherlv_11= 'style=' ( (lv_style_12_0= RULE_STRING ) )
                    {
                    otherlv_11=(Token)match(input,38,FollowSets000.FOLLOW_4); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_11, grammarAccess.getDTableFromFileAccess().getStyleKeyword_10_0());
                      			
                    }
                    // InternalSVR.g:2053:4: ( (lv_style_12_0= RULE_STRING ) )
                    // InternalSVR.g:2054:5: (lv_style_12_0= RULE_STRING )
                    {
                    // InternalSVR.g:2054:5: (lv_style_12_0= RULE_STRING )
                    // InternalSVR.g:2055:6: lv_style_12_0= RULE_STRING
                    {
                    lv_style_12_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_56); if (state.failed) return current;
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

            // InternalSVR.g:2072:3: (otherlv_13= 'indent=' ( (lv_indent_14_0= RULE_REAL_STRING ) ) )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==39) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // InternalSVR.g:2073:4: otherlv_13= 'indent=' ( (lv_indent_14_0= RULE_REAL_STRING ) )
                    {
                    otherlv_13=(Token)match(input,39,FollowSets000.FOLLOW_29); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_13, grammarAccess.getDTableFromFileAccess().getIndentKeyword_11_0());
                      			
                    }
                    // InternalSVR.g:2077:4: ( (lv_indent_14_0= RULE_REAL_STRING ) )
                    // InternalSVR.g:2078:5: (lv_indent_14_0= RULE_REAL_STRING )
                    {
                    // InternalSVR.g:2078:5: (lv_indent_14_0= RULE_REAL_STRING )
                    // InternalSVR.g:2079:6: lv_indent_14_0= RULE_REAL_STRING
                    {
                    lv_indent_14_0=(Token)match(input,RULE_REAL_STRING,FollowSets000.FOLLOW_57); if (state.failed) return current;
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

            // InternalSVR.g:2096:3: (otherlv_15= 'caption=' ( (lv_caption_16_0= RULE_STRING ) ) )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==63) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // InternalSVR.g:2097:4: otherlv_15= 'caption=' ( (lv_caption_16_0= RULE_STRING ) )
                    {
                    otherlv_15=(Token)match(input,63,FollowSets000.FOLLOW_4); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_15, grammarAccess.getDTableFromFileAccess().getCaptionKeyword_12_0());
                      			
                    }
                    // InternalSVR.g:2101:4: ( (lv_caption_16_0= RULE_STRING ) )
                    // InternalSVR.g:2102:5: (lv_caption_16_0= RULE_STRING )
                    {
                    // InternalSVR.g:2102:5: (lv_caption_16_0= RULE_STRING )
                    // InternalSVR.g:2103:6: lv_caption_16_0= RULE_STRING
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
    // InternalSVR.g:2128:1: entryRuleDBasicTable returns [EObject current=null] : iv_ruleDBasicTable= ruleDBasicTable EOF ;
    public final EObject entryRuleDBasicTable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDBasicTable = null;


        try {
            // InternalSVR.g:2128:52: (iv_ruleDBasicTable= ruleDBasicTable EOF )
            // InternalSVR.g:2129:2: iv_ruleDBasicTable= ruleDBasicTable EOF
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
    // InternalSVR.g:2135:1: ruleDBasicTable returns [EObject current=null] : (otherlv_0= '<basicTable' otherlv_1= 'name=' ( (lv_name_2_0= RULE_STRING ) ) (otherlv_3= 'width=' ( (lv_width_4_0= RULE_UINT_STRING ) ) )? (otherlv_5= 'alignment=' ( (lv_alignment_6_0= ruleDAlignment ) ) )? (otherlv_7= 'style=' ( (lv_style_8_0= RULE_STRING ) ) )? (otherlv_9= 'indent=' ( (lv_indent_10_0= RULE_REAL_STRING ) ) )? (otherlv_11= 'caption=' ( (lv_caption_12_0= RULE_STRING ) ) )? otherlv_13= '>' ( (lv_rows_14_0= ruleDRow ) )+ otherlv_15= '</basicTable>' ) ;
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
            // InternalSVR.g:2141:2: ( (otherlv_0= '<basicTable' otherlv_1= 'name=' ( (lv_name_2_0= RULE_STRING ) ) (otherlv_3= 'width=' ( (lv_width_4_0= RULE_UINT_STRING ) ) )? (otherlv_5= 'alignment=' ( (lv_alignment_6_0= ruleDAlignment ) ) )? (otherlv_7= 'style=' ( (lv_style_8_0= RULE_STRING ) ) )? (otherlv_9= 'indent=' ( (lv_indent_10_0= RULE_REAL_STRING ) ) )? (otherlv_11= 'caption=' ( (lv_caption_12_0= RULE_STRING ) ) )? otherlv_13= '>' ( (lv_rows_14_0= ruleDRow ) )+ otherlv_15= '</basicTable>' ) )
            // InternalSVR.g:2142:2: (otherlv_0= '<basicTable' otherlv_1= 'name=' ( (lv_name_2_0= RULE_STRING ) ) (otherlv_3= 'width=' ( (lv_width_4_0= RULE_UINT_STRING ) ) )? (otherlv_5= 'alignment=' ( (lv_alignment_6_0= ruleDAlignment ) ) )? (otherlv_7= 'style=' ( (lv_style_8_0= RULE_STRING ) ) )? (otherlv_9= 'indent=' ( (lv_indent_10_0= RULE_REAL_STRING ) ) )? (otherlv_11= 'caption=' ( (lv_caption_12_0= RULE_STRING ) ) )? otherlv_13= '>' ( (lv_rows_14_0= ruleDRow ) )+ otherlv_15= '</basicTable>' )
            {
            // InternalSVR.g:2142:2: (otherlv_0= '<basicTable' otherlv_1= 'name=' ( (lv_name_2_0= RULE_STRING ) ) (otherlv_3= 'width=' ( (lv_width_4_0= RULE_UINT_STRING ) ) )? (otherlv_5= 'alignment=' ( (lv_alignment_6_0= ruleDAlignment ) ) )? (otherlv_7= 'style=' ( (lv_style_8_0= RULE_STRING ) ) )? (otherlv_9= 'indent=' ( (lv_indent_10_0= RULE_REAL_STRING ) ) )? (otherlv_11= 'caption=' ( (lv_caption_12_0= RULE_STRING ) ) )? otherlv_13= '>' ( (lv_rows_14_0= ruleDRow ) )+ otherlv_15= '</basicTable>' )
            // InternalSVR.g:2143:3: otherlv_0= '<basicTable' otherlv_1= 'name=' ( (lv_name_2_0= RULE_STRING ) ) (otherlv_3= 'width=' ( (lv_width_4_0= RULE_UINT_STRING ) ) )? (otherlv_5= 'alignment=' ( (lv_alignment_6_0= ruleDAlignment ) ) )? (otherlv_7= 'style=' ( (lv_style_8_0= RULE_STRING ) ) )? (otherlv_9= 'indent=' ( (lv_indent_10_0= RULE_REAL_STRING ) ) )? (otherlv_11= 'caption=' ( (lv_caption_12_0= RULE_STRING ) ) )? otherlv_13= '>' ( (lv_rows_14_0= ruleDRow ) )+ otherlv_15= '</basicTable>'
            {
            otherlv_0=(Token)match(input,65,FollowSets000.FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getDBasicTableAccess().getBasicTableKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,17,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getDBasicTableAccess().getNameKeyword_1());
              		
            }
            // InternalSVR.g:2151:3: ( (lv_name_2_0= RULE_STRING ) )
            // InternalSVR.g:2152:4: (lv_name_2_0= RULE_STRING )
            {
            // InternalSVR.g:2152:4: (lv_name_2_0= RULE_STRING )
            // InternalSVR.g:2153:5: lv_name_2_0= RULE_STRING
            {
            lv_name_2_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_58); if (state.failed) return current;
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

            // InternalSVR.g:2169:3: (otherlv_3= 'width=' ( (lv_width_4_0= RULE_UINT_STRING ) ) )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==61) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // InternalSVR.g:2170:4: otherlv_3= 'width=' ( (lv_width_4_0= RULE_UINT_STRING ) )
                    {
                    otherlv_3=(Token)match(input,61,FollowSets000.FOLLOW_7); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_3, grammarAccess.getDBasicTableAccess().getWidthKeyword_3_0());
                      			
                    }
                    // InternalSVR.g:2174:4: ( (lv_width_4_0= RULE_UINT_STRING ) )
                    // InternalSVR.g:2175:5: (lv_width_4_0= RULE_UINT_STRING )
                    {
                    // InternalSVR.g:2175:5: (lv_width_4_0= RULE_UINT_STRING )
                    // InternalSVR.g:2176:6: lv_width_4_0= RULE_UINT_STRING
                    {
                    lv_width_4_0=(Token)match(input,RULE_UINT_STRING,FollowSets000.FOLLOW_59); if (state.failed) return current;
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

            // InternalSVR.g:2193:3: (otherlv_5= 'alignment=' ( (lv_alignment_6_0= ruleDAlignment ) ) )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==37) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // InternalSVR.g:2194:4: otherlv_5= 'alignment=' ( (lv_alignment_6_0= ruleDAlignment ) )
                    {
                    otherlv_5=(Token)match(input,37,FollowSets000.FOLLOW_26); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_5, grammarAccess.getDBasicTableAccess().getAlignmentKeyword_4_0());
                      			
                    }
                    // InternalSVR.g:2198:4: ( (lv_alignment_6_0= ruleDAlignment ) )
                    // InternalSVR.g:2199:5: (lv_alignment_6_0= ruleDAlignment )
                    {
                    // InternalSVR.g:2199:5: (lv_alignment_6_0= ruleDAlignment )
                    // InternalSVR.g:2200:6: lv_alignment_6_0= ruleDAlignment
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getDBasicTableAccess().getAlignmentDAlignmentEnumRuleCall_4_1_0());
                      					
                    }
                    pushFollow(FollowSets000.FOLLOW_60);
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

            // InternalSVR.g:2218:3: (otherlv_7= 'style=' ( (lv_style_8_0= RULE_STRING ) ) )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==38) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // InternalSVR.g:2219:4: otherlv_7= 'style=' ( (lv_style_8_0= RULE_STRING ) )
                    {
                    otherlv_7=(Token)match(input,38,FollowSets000.FOLLOW_4); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_7, grammarAccess.getDBasicTableAccess().getStyleKeyword_5_0());
                      			
                    }
                    // InternalSVR.g:2223:4: ( (lv_style_8_0= RULE_STRING ) )
                    // InternalSVR.g:2224:5: (lv_style_8_0= RULE_STRING )
                    {
                    // InternalSVR.g:2224:5: (lv_style_8_0= RULE_STRING )
                    // InternalSVR.g:2225:6: lv_style_8_0= RULE_STRING
                    {
                    lv_style_8_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_61); if (state.failed) return current;
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

            // InternalSVR.g:2242:3: (otherlv_9= 'indent=' ( (lv_indent_10_0= RULE_REAL_STRING ) ) )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==39) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // InternalSVR.g:2243:4: otherlv_9= 'indent=' ( (lv_indent_10_0= RULE_REAL_STRING ) )
                    {
                    otherlv_9=(Token)match(input,39,FollowSets000.FOLLOW_29); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_9, grammarAccess.getDBasicTableAccess().getIndentKeyword_6_0());
                      			
                    }
                    // InternalSVR.g:2247:4: ( (lv_indent_10_0= RULE_REAL_STRING ) )
                    // InternalSVR.g:2248:5: (lv_indent_10_0= RULE_REAL_STRING )
                    {
                    // InternalSVR.g:2248:5: (lv_indent_10_0= RULE_REAL_STRING )
                    // InternalSVR.g:2249:6: lv_indent_10_0= RULE_REAL_STRING
                    {
                    lv_indent_10_0=(Token)match(input,RULE_REAL_STRING,FollowSets000.FOLLOW_62); if (state.failed) return current;
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

            // InternalSVR.g:2266:3: (otherlv_11= 'caption=' ( (lv_caption_12_0= RULE_STRING ) ) )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==63) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // InternalSVR.g:2267:4: otherlv_11= 'caption=' ( (lv_caption_12_0= RULE_STRING ) )
                    {
                    otherlv_11=(Token)match(input,63,FollowSets000.FOLLOW_4); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_11, grammarAccess.getDBasicTableAccess().getCaptionKeyword_7_0());
                      			
                    }
                    // InternalSVR.g:2271:4: ( (lv_caption_12_0= RULE_STRING ) )
                    // InternalSVR.g:2272:5: (lv_caption_12_0= RULE_STRING )
                    {
                    // InternalSVR.g:2272:5: (lv_caption_12_0= RULE_STRING )
                    // InternalSVR.g:2273:6: lv_caption_12_0= RULE_STRING
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

            otherlv_13=(Token)match(input,22,FollowSets000.FOLLOW_63); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_13, grammarAccess.getDBasicTableAccess().getGreaterThanSignKeyword_8());
              		
            }
            // InternalSVR.g:2294:3: ( (lv_rows_14_0= ruleDRow ) )+
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
            	    // InternalSVR.g:2295:4: (lv_rows_14_0= ruleDRow )
            	    {
            	    // InternalSVR.g:2295:4: (lv_rows_14_0= ruleDRow )
            	    // InternalSVR.g:2296:5: lv_rows_14_0= ruleDRow
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getDBasicTableAccess().getRowsDRowParserRuleCall_9_0());
            	      				
            	    }
            	    pushFollow(FollowSets000.FOLLOW_64);
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
    // InternalSVR.g:2321:1: entryRuleDRow returns [EObject current=null] : iv_ruleDRow= ruleDRow EOF ;
    public final EObject entryRuleDRow() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDRow = null;


        try {
            // InternalSVR.g:2321:45: (iv_ruleDRow= ruleDRow EOF )
            // InternalSVR.g:2322:2: iv_ruleDRow= ruleDRow EOF
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
    // InternalSVR.g:2328:1: ruleDRow returns [EObject current=null] : (otherlv_0= '<row>' ( (lv_cells_1_0= ruleDCell ) )+ otherlv_2= '</row>' ) ;
    public final EObject ruleDRow() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_cells_1_0 = null;



        	enterRule();

        try {
            // InternalSVR.g:2334:2: ( (otherlv_0= '<row>' ( (lv_cells_1_0= ruleDCell ) )+ otherlv_2= '</row>' ) )
            // InternalSVR.g:2335:2: (otherlv_0= '<row>' ( (lv_cells_1_0= ruleDCell ) )+ otherlv_2= '</row>' )
            {
            // InternalSVR.g:2335:2: (otherlv_0= '<row>' ( (lv_cells_1_0= ruleDCell ) )+ otherlv_2= '</row>' )
            // InternalSVR.g:2336:3: otherlv_0= '<row>' ( (lv_cells_1_0= ruleDCell ) )+ otherlv_2= '</row>'
            {
            otherlv_0=(Token)match(input,67,FollowSets000.FOLLOW_65); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getDRowAccess().getRowKeyword_0());
              		
            }
            // InternalSVR.g:2340:3: ( (lv_cells_1_0= ruleDCell ) )+
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
            	    // InternalSVR.g:2341:4: (lv_cells_1_0= ruleDCell )
            	    {
            	    // InternalSVR.g:2341:4: (lv_cells_1_0= ruleDCell )
            	    // InternalSVR.g:2342:5: lv_cells_1_0= ruleDCell
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getDRowAccess().getCellsDCellParserRuleCall_1_0());
            	      				
            	    }
            	    pushFollow(FollowSets000.FOLLOW_66);
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
    // InternalSVR.g:2367:1: entryRuleDCell returns [EObject current=null] : iv_ruleDCell= ruleDCell EOF ;
    public final EObject entryRuleDCell() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDCell = null;


        try {
            // InternalSVR.g:2367:46: (iv_ruleDCell= ruleDCell EOF )
            // InternalSVR.g:2368:2: iv_ruleDCell= ruleDCell EOF
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
    // InternalSVR.g:2374:1: ruleDCell returns [EObject current=null] : (otherlv_0= '<cell' (otherlv_1= 'colSpan=' ( (lv_colSpan_2_0= RULE_UINT_STRING ) ) )? (otherlv_3= 'rowSpan=' ( (lv_rowSpan_4_0= RULE_UINT_STRING ) ) )? (otherlv_5= 'width=' ( (lv_width_6_0= RULE_UINT_STRING ) ) )? (otherlv_7= 'shadow=' ( (lv_shadow_8_0= RULE_STRING ) ) )? otherlv_9= '>' ( (lv_bodyContent_10_0= ruleDBodyContent ) )+ otherlv_11= '</cell>' ) ;
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
            // InternalSVR.g:2380:2: ( (otherlv_0= '<cell' (otherlv_1= 'colSpan=' ( (lv_colSpan_2_0= RULE_UINT_STRING ) ) )? (otherlv_3= 'rowSpan=' ( (lv_rowSpan_4_0= RULE_UINT_STRING ) ) )? (otherlv_5= 'width=' ( (lv_width_6_0= RULE_UINT_STRING ) ) )? (otherlv_7= 'shadow=' ( (lv_shadow_8_0= RULE_STRING ) ) )? otherlv_9= '>' ( (lv_bodyContent_10_0= ruleDBodyContent ) )+ otherlv_11= '</cell>' ) )
            // InternalSVR.g:2381:2: (otherlv_0= '<cell' (otherlv_1= 'colSpan=' ( (lv_colSpan_2_0= RULE_UINT_STRING ) ) )? (otherlv_3= 'rowSpan=' ( (lv_rowSpan_4_0= RULE_UINT_STRING ) ) )? (otherlv_5= 'width=' ( (lv_width_6_0= RULE_UINT_STRING ) ) )? (otherlv_7= 'shadow=' ( (lv_shadow_8_0= RULE_STRING ) ) )? otherlv_9= '>' ( (lv_bodyContent_10_0= ruleDBodyContent ) )+ otherlv_11= '</cell>' )
            {
            // InternalSVR.g:2381:2: (otherlv_0= '<cell' (otherlv_1= 'colSpan=' ( (lv_colSpan_2_0= RULE_UINT_STRING ) ) )? (otherlv_3= 'rowSpan=' ( (lv_rowSpan_4_0= RULE_UINT_STRING ) ) )? (otherlv_5= 'width=' ( (lv_width_6_0= RULE_UINT_STRING ) ) )? (otherlv_7= 'shadow=' ( (lv_shadow_8_0= RULE_STRING ) ) )? otherlv_9= '>' ( (lv_bodyContent_10_0= ruleDBodyContent ) )+ otherlv_11= '</cell>' )
            // InternalSVR.g:2382:3: otherlv_0= '<cell' (otherlv_1= 'colSpan=' ( (lv_colSpan_2_0= RULE_UINT_STRING ) ) )? (otherlv_3= 'rowSpan=' ( (lv_rowSpan_4_0= RULE_UINT_STRING ) ) )? (otherlv_5= 'width=' ( (lv_width_6_0= RULE_UINT_STRING ) ) )? (otherlv_7= 'shadow=' ( (lv_shadow_8_0= RULE_STRING ) ) )? otherlv_9= '>' ( (lv_bodyContent_10_0= ruleDBodyContent ) )+ otherlv_11= '</cell>'
            {
            otherlv_0=(Token)match(input,69,FollowSets000.FOLLOW_67); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getDCellAccess().getCellKeyword_0());
              		
            }
            // InternalSVR.g:2386:3: (otherlv_1= 'colSpan=' ( (lv_colSpan_2_0= RULE_UINT_STRING ) ) )?
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==70) ) {
                alt49=1;
            }
            switch (alt49) {
                case 1 :
                    // InternalSVR.g:2387:4: otherlv_1= 'colSpan=' ( (lv_colSpan_2_0= RULE_UINT_STRING ) )
                    {
                    otherlv_1=(Token)match(input,70,FollowSets000.FOLLOW_7); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_1, grammarAccess.getDCellAccess().getColSpanKeyword_1_0());
                      			
                    }
                    // InternalSVR.g:2391:4: ( (lv_colSpan_2_0= RULE_UINT_STRING ) )
                    // InternalSVR.g:2392:5: (lv_colSpan_2_0= RULE_UINT_STRING )
                    {
                    // InternalSVR.g:2392:5: (lv_colSpan_2_0= RULE_UINT_STRING )
                    // InternalSVR.g:2393:6: lv_colSpan_2_0= RULE_UINT_STRING
                    {
                    lv_colSpan_2_0=(Token)match(input,RULE_UINT_STRING,FollowSets000.FOLLOW_68); if (state.failed) return current;
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

            // InternalSVR.g:2410:3: (otherlv_3= 'rowSpan=' ( (lv_rowSpan_4_0= RULE_UINT_STRING ) ) )?
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==71) ) {
                alt50=1;
            }
            switch (alt50) {
                case 1 :
                    // InternalSVR.g:2411:4: otherlv_3= 'rowSpan=' ( (lv_rowSpan_4_0= RULE_UINT_STRING ) )
                    {
                    otherlv_3=(Token)match(input,71,FollowSets000.FOLLOW_7); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_3, grammarAccess.getDCellAccess().getRowSpanKeyword_2_0());
                      			
                    }
                    // InternalSVR.g:2415:4: ( (lv_rowSpan_4_0= RULE_UINT_STRING ) )
                    // InternalSVR.g:2416:5: (lv_rowSpan_4_0= RULE_UINT_STRING )
                    {
                    // InternalSVR.g:2416:5: (lv_rowSpan_4_0= RULE_UINT_STRING )
                    // InternalSVR.g:2417:6: lv_rowSpan_4_0= RULE_UINT_STRING
                    {
                    lv_rowSpan_4_0=(Token)match(input,RULE_UINT_STRING,FollowSets000.FOLLOW_69); if (state.failed) return current;
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

            // InternalSVR.g:2434:3: (otherlv_5= 'width=' ( (lv_width_6_0= RULE_UINT_STRING ) ) )?
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==61) ) {
                alt51=1;
            }
            switch (alt51) {
                case 1 :
                    // InternalSVR.g:2435:4: otherlv_5= 'width=' ( (lv_width_6_0= RULE_UINT_STRING ) )
                    {
                    otherlv_5=(Token)match(input,61,FollowSets000.FOLLOW_7); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_5, grammarAccess.getDCellAccess().getWidthKeyword_3_0());
                      			
                    }
                    // InternalSVR.g:2439:4: ( (lv_width_6_0= RULE_UINT_STRING ) )
                    // InternalSVR.g:2440:5: (lv_width_6_0= RULE_UINT_STRING )
                    {
                    // InternalSVR.g:2440:5: (lv_width_6_0= RULE_UINT_STRING )
                    // InternalSVR.g:2441:6: lv_width_6_0= RULE_UINT_STRING
                    {
                    lv_width_6_0=(Token)match(input,RULE_UINT_STRING,FollowSets000.FOLLOW_70); if (state.failed) return current;
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

            // InternalSVR.g:2458:3: (otherlv_7= 'shadow=' ( (lv_shadow_8_0= RULE_STRING ) ) )?
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==72) ) {
                alt52=1;
            }
            switch (alt52) {
                case 1 :
                    // InternalSVR.g:2459:4: otherlv_7= 'shadow=' ( (lv_shadow_8_0= RULE_STRING ) )
                    {
                    otherlv_7=(Token)match(input,72,FollowSets000.FOLLOW_4); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_7, grammarAccess.getDCellAccess().getShadowKeyword_4_0());
                      			
                    }
                    // InternalSVR.g:2463:4: ( (lv_shadow_8_0= RULE_STRING ) )
                    // InternalSVR.g:2464:5: (lv_shadow_8_0= RULE_STRING )
                    {
                    // InternalSVR.g:2464:5: (lv_shadow_8_0= RULE_STRING )
                    // InternalSVR.g:2465:6: lv_shadow_8_0= RULE_STRING
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

            otherlv_9=(Token)match(input,22,FollowSets000.FOLLOW_22); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_9, grammarAccess.getDCellAccess().getGreaterThanSignKeyword_5());
              		
            }
            // InternalSVR.g:2486:3: ( (lv_bodyContent_10_0= ruleDBodyContent ) )+
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
            	    // InternalSVR.g:2487:4: (lv_bodyContent_10_0= ruleDBodyContent )
            	    {
            	    // InternalSVR.g:2487:4: (lv_bodyContent_10_0= ruleDBodyContent )
            	    // InternalSVR.g:2488:5: lv_bodyContent_10_0= ruleDBodyContent
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getDCellAccess().getBodyContentDBodyContentParserRuleCall_6_0());
            	      				
            	    }
            	    pushFollow(FollowSets000.FOLLOW_71);
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
    // InternalSVR.g:2513:1: entryRuleDApplicableDocument returns [EObject current=null] : iv_ruleDApplicableDocument= ruleDApplicableDocument EOF ;
    public final EObject entryRuleDApplicableDocument() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDApplicableDocument = null;


        try {
            // InternalSVR.g:2513:60: (iv_ruleDApplicableDocument= ruleDApplicableDocument EOF )
            // InternalSVR.g:2514:2: iv_ruleDApplicableDocument= ruleDApplicableDocument EOF
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
    // InternalSVR.g:2520:1: ruleDApplicableDocument returns [EObject current=null] : (otherlv_0= '<ApplicableDocument' otherlv_1= 'name=' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= 'title=' ( (lv_title_4_0= RULE_STRING ) ) otherlv_5= 'id=' ( (lv_id_6_0= RULE_STRING ) ) (otherlv_7= 'issue=' ( (lv_issue_8_0= RULE_UINT_STRING ) ) (otherlv_9= 'revision=' ( (lv_revision_10_0= RULE_UINT_STRING ) ) )? )? (otherlv_11= 'date=' ( (lv_date_12_0= RULE_STRING ) ) )? (otherlv_13= 'url=' ( (lv_url_14_0= RULE_STRING ) ) )? otherlv_15= '/>' ) ;
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
            // InternalSVR.g:2526:2: ( (otherlv_0= '<ApplicableDocument' otherlv_1= 'name=' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= 'title=' ( (lv_title_4_0= RULE_STRING ) ) otherlv_5= 'id=' ( (lv_id_6_0= RULE_STRING ) ) (otherlv_7= 'issue=' ( (lv_issue_8_0= RULE_UINT_STRING ) ) (otherlv_9= 'revision=' ( (lv_revision_10_0= RULE_UINT_STRING ) ) )? )? (otherlv_11= 'date=' ( (lv_date_12_0= RULE_STRING ) ) )? (otherlv_13= 'url=' ( (lv_url_14_0= RULE_STRING ) ) )? otherlv_15= '/>' ) )
            // InternalSVR.g:2527:2: (otherlv_0= '<ApplicableDocument' otherlv_1= 'name=' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= 'title=' ( (lv_title_4_0= RULE_STRING ) ) otherlv_5= 'id=' ( (lv_id_6_0= RULE_STRING ) ) (otherlv_7= 'issue=' ( (lv_issue_8_0= RULE_UINT_STRING ) ) (otherlv_9= 'revision=' ( (lv_revision_10_0= RULE_UINT_STRING ) ) )? )? (otherlv_11= 'date=' ( (lv_date_12_0= RULE_STRING ) ) )? (otherlv_13= 'url=' ( (lv_url_14_0= RULE_STRING ) ) )? otherlv_15= '/>' )
            {
            // InternalSVR.g:2527:2: (otherlv_0= '<ApplicableDocument' otherlv_1= 'name=' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= 'title=' ( (lv_title_4_0= RULE_STRING ) ) otherlv_5= 'id=' ( (lv_id_6_0= RULE_STRING ) ) (otherlv_7= 'issue=' ( (lv_issue_8_0= RULE_UINT_STRING ) ) (otherlv_9= 'revision=' ( (lv_revision_10_0= RULE_UINT_STRING ) ) )? )? (otherlv_11= 'date=' ( (lv_date_12_0= RULE_STRING ) ) )? (otherlv_13= 'url=' ( (lv_url_14_0= RULE_STRING ) ) )? otherlv_15= '/>' )
            // InternalSVR.g:2528:3: otherlv_0= '<ApplicableDocument' otherlv_1= 'name=' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= 'title=' ( (lv_title_4_0= RULE_STRING ) ) otherlv_5= 'id=' ( (lv_id_6_0= RULE_STRING ) ) (otherlv_7= 'issue=' ( (lv_issue_8_0= RULE_UINT_STRING ) ) (otherlv_9= 'revision=' ( (lv_revision_10_0= RULE_UINT_STRING ) ) )? )? (otherlv_11= 'date=' ( (lv_date_12_0= RULE_STRING ) ) )? (otherlv_13= 'url=' ( (lv_url_14_0= RULE_STRING ) ) )? otherlv_15= '/>'
            {
            otherlv_0=(Token)match(input,74,FollowSets000.FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getDApplicableDocumentAccess().getApplicableDocumentKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,17,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getDApplicableDocumentAccess().getNameKeyword_1());
              		
            }
            // InternalSVR.g:2536:3: ( (lv_name_2_0= RULE_STRING ) )
            // InternalSVR.g:2537:4: (lv_name_2_0= RULE_STRING )
            {
            // InternalSVR.g:2537:4: (lv_name_2_0= RULE_STRING )
            // InternalSVR.g:2538:5: lv_name_2_0= RULE_STRING
            {
            lv_name_2_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_72); if (state.failed) return current;
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
            // InternalSVR.g:2558:3: ( (lv_title_4_0= RULE_STRING ) )
            // InternalSVR.g:2559:4: (lv_title_4_0= RULE_STRING )
            {
            // InternalSVR.g:2559:4: (lv_title_4_0= RULE_STRING )
            // InternalSVR.g:2560:5: lv_title_4_0= RULE_STRING
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
            // InternalSVR.g:2580:3: ( (lv_id_6_0= RULE_STRING ) )
            // InternalSVR.g:2581:4: (lv_id_6_0= RULE_STRING )
            {
            // InternalSVR.g:2581:4: (lv_id_6_0= RULE_STRING )
            // InternalSVR.g:2582:5: lv_id_6_0= RULE_STRING
            {
            lv_id_6_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_73); if (state.failed) return current;
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

            // InternalSVR.g:2598:3: (otherlv_7= 'issue=' ( (lv_issue_8_0= RULE_UINT_STRING ) ) (otherlv_9= 'revision=' ( (lv_revision_10_0= RULE_UINT_STRING ) ) )? )?
            int alt55=2;
            int LA55_0 = input.LA(1);

            if ( (LA55_0==19) ) {
                alt55=1;
            }
            switch (alt55) {
                case 1 :
                    // InternalSVR.g:2599:4: otherlv_7= 'issue=' ( (lv_issue_8_0= RULE_UINT_STRING ) ) (otherlv_9= 'revision=' ( (lv_revision_10_0= RULE_UINT_STRING ) ) )?
                    {
                    otherlv_7=(Token)match(input,19,FollowSets000.FOLLOW_7); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_7, grammarAccess.getDApplicableDocumentAccess().getIssueKeyword_7_0());
                      			
                    }
                    // InternalSVR.g:2603:4: ( (lv_issue_8_0= RULE_UINT_STRING ) )
                    // InternalSVR.g:2604:5: (lv_issue_8_0= RULE_UINT_STRING )
                    {
                    // InternalSVR.g:2604:5: (lv_issue_8_0= RULE_UINT_STRING )
                    // InternalSVR.g:2605:6: lv_issue_8_0= RULE_UINT_STRING
                    {
                    lv_issue_8_0=(Token)match(input,RULE_UINT_STRING,FollowSets000.FOLLOW_74); if (state.failed) return current;
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

                    // InternalSVR.g:2621:4: (otherlv_9= 'revision=' ( (lv_revision_10_0= RULE_UINT_STRING ) ) )?
                    int alt54=2;
                    int LA54_0 = input.LA(1);

                    if ( (LA54_0==20) ) {
                        alt54=1;
                    }
                    switch (alt54) {
                        case 1 :
                            // InternalSVR.g:2622:5: otherlv_9= 'revision=' ( (lv_revision_10_0= RULE_UINT_STRING ) )
                            {
                            otherlv_9=(Token)match(input,20,FollowSets000.FOLLOW_7); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					newLeafNode(otherlv_9, grammarAccess.getDApplicableDocumentAccess().getRevisionKeyword_7_2_0());
                              				
                            }
                            // InternalSVR.g:2626:5: ( (lv_revision_10_0= RULE_UINT_STRING ) )
                            // InternalSVR.g:2627:6: (lv_revision_10_0= RULE_UINT_STRING )
                            {
                            // InternalSVR.g:2627:6: (lv_revision_10_0= RULE_UINT_STRING )
                            // InternalSVR.g:2628:7: lv_revision_10_0= RULE_UINT_STRING
                            {
                            lv_revision_10_0=(Token)match(input,RULE_UINT_STRING,FollowSets000.FOLLOW_75); if (state.failed) return current;
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

            // InternalSVR.g:2646:3: (otherlv_11= 'date=' ( (lv_date_12_0= RULE_STRING ) ) )?
            int alt56=2;
            int LA56_0 = input.LA(1);

            if ( (LA56_0==21) ) {
                alt56=1;
            }
            switch (alt56) {
                case 1 :
                    // InternalSVR.g:2647:4: otherlv_11= 'date=' ( (lv_date_12_0= RULE_STRING ) )
                    {
                    otherlv_11=(Token)match(input,21,FollowSets000.FOLLOW_4); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_11, grammarAccess.getDApplicableDocumentAccess().getDateKeyword_8_0());
                      			
                    }
                    // InternalSVR.g:2651:4: ( (lv_date_12_0= RULE_STRING ) )
                    // InternalSVR.g:2652:5: (lv_date_12_0= RULE_STRING )
                    {
                    // InternalSVR.g:2652:5: (lv_date_12_0= RULE_STRING )
                    // InternalSVR.g:2653:6: lv_date_12_0= RULE_STRING
                    {
                    lv_date_12_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_76); if (state.failed) return current;
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

            // InternalSVR.g:2670:3: (otherlv_13= 'url=' ( (lv_url_14_0= RULE_STRING ) ) )?
            int alt57=2;
            int LA57_0 = input.LA(1);

            if ( (LA57_0==76) ) {
                alt57=1;
            }
            switch (alt57) {
                case 1 :
                    // InternalSVR.g:2671:4: otherlv_13= 'url=' ( (lv_url_14_0= RULE_STRING ) )
                    {
                    otherlv_13=(Token)match(input,76,FollowSets000.FOLLOW_4); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_13, grammarAccess.getDApplicableDocumentAccess().getUrlKeyword_9_0());
                      			
                    }
                    // InternalSVR.g:2675:4: ( (lv_url_14_0= RULE_STRING ) )
                    // InternalSVR.g:2676:5: (lv_url_14_0= RULE_STRING )
                    {
                    // InternalSVR.g:2676:5: (lv_url_14_0= RULE_STRING )
                    // InternalSVR.g:2677:6: lv_url_14_0= RULE_STRING
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
    // InternalSVR.g:2702:1: entryRuleDReferenceDocument returns [EObject current=null] : iv_ruleDReferenceDocument= ruleDReferenceDocument EOF ;
    public final EObject entryRuleDReferenceDocument() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDReferenceDocument = null;


        try {
            // InternalSVR.g:2702:59: (iv_ruleDReferenceDocument= ruleDReferenceDocument EOF )
            // InternalSVR.g:2703:2: iv_ruleDReferenceDocument= ruleDReferenceDocument EOF
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
    // InternalSVR.g:2709:1: ruleDReferenceDocument returns [EObject current=null] : (otherlv_0= '<ReferenceDocument' otherlv_1= 'name=' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= 'title=' ( (lv_title_4_0= RULE_STRING ) ) otherlv_5= 'id=' ( (lv_id_6_0= RULE_STRING ) ) (otherlv_7= 'issue=' ( (lv_issue_8_0= RULE_UINT_STRING ) ) (otherlv_9= 'revision=' ( (lv_revision_10_0= RULE_UINT_STRING ) ) )? )? (otherlv_11= 'date=' ( (lv_date_12_0= RULE_STRING ) ) )? (otherlv_13= 'url=' ( (lv_url_14_0= RULE_STRING ) ) )? otherlv_15= '/>' ) ;
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
            // InternalSVR.g:2715:2: ( (otherlv_0= '<ReferenceDocument' otherlv_1= 'name=' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= 'title=' ( (lv_title_4_0= RULE_STRING ) ) otherlv_5= 'id=' ( (lv_id_6_0= RULE_STRING ) ) (otherlv_7= 'issue=' ( (lv_issue_8_0= RULE_UINT_STRING ) ) (otherlv_9= 'revision=' ( (lv_revision_10_0= RULE_UINT_STRING ) ) )? )? (otherlv_11= 'date=' ( (lv_date_12_0= RULE_STRING ) ) )? (otherlv_13= 'url=' ( (lv_url_14_0= RULE_STRING ) ) )? otherlv_15= '/>' ) )
            // InternalSVR.g:2716:2: (otherlv_0= '<ReferenceDocument' otherlv_1= 'name=' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= 'title=' ( (lv_title_4_0= RULE_STRING ) ) otherlv_5= 'id=' ( (lv_id_6_0= RULE_STRING ) ) (otherlv_7= 'issue=' ( (lv_issue_8_0= RULE_UINT_STRING ) ) (otherlv_9= 'revision=' ( (lv_revision_10_0= RULE_UINT_STRING ) ) )? )? (otherlv_11= 'date=' ( (lv_date_12_0= RULE_STRING ) ) )? (otherlv_13= 'url=' ( (lv_url_14_0= RULE_STRING ) ) )? otherlv_15= '/>' )
            {
            // InternalSVR.g:2716:2: (otherlv_0= '<ReferenceDocument' otherlv_1= 'name=' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= 'title=' ( (lv_title_4_0= RULE_STRING ) ) otherlv_5= 'id=' ( (lv_id_6_0= RULE_STRING ) ) (otherlv_7= 'issue=' ( (lv_issue_8_0= RULE_UINT_STRING ) ) (otherlv_9= 'revision=' ( (lv_revision_10_0= RULE_UINT_STRING ) ) )? )? (otherlv_11= 'date=' ( (lv_date_12_0= RULE_STRING ) ) )? (otherlv_13= 'url=' ( (lv_url_14_0= RULE_STRING ) ) )? otherlv_15= '/>' )
            // InternalSVR.g:2717:3: otherlv_0= '<ReferenceDocument' otherlv_1= 'name=' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= 'title=' ( (lv_title_4_0= RULE_STRING ) ) otherlv_5= 'id=' ( (lv_id_6_0= RULE_STRING ) ) (otherlv_7= 'issue=' ( (lv_issue_8_0= RULE_UINT_STRING ) ) (otherlv_9= 'revision=' ( (lv_revision_10_0= RULE_UINT_STRING ) ) )? )? (otherlv_11= 'date=' ( (lv_date_12_0= RULE_STRING ) ) )? (otherlv_13= 'url=' ( (lv_url_14_0= RULE_STRING ) ) )? otherlv_15= '/>'
            {
            otherlv_0=(Token)match(input,77,FollowSets000.FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getDReferenceDocumentAccess().getReferenceDocumentKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,17,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getDReferenceDocumentAccess().getNameKeyword_1());
              		
            }
            // InternalSVR.g:2725:3: ( (lv_name_2_0= RULE_STRING ) )
            // InternalSVR.g:2726:4: (lv_name_2_0= RULE_STRING )
            {
            // InternalSVR.g:2726:4: (lv_name_2_0= RULE_STRING )
            // InternalSVR.g:2727:5: lv_name_2_0= RULE_STRING
            {
            lv_name_2_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_72); if (state.failed) return current;
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
            // InternalSVR.g:2747:3: ( (lv_title_4_0= RULE_STRING ) )
            // InternalSVR.g:2748:4: (lv_title_4_0= RULE_STRING )
            {
            // InternalSVR.g:2748:4: (lv_title_4_0= RULE_STRING )
            // InternalSVR.g:2749:5: lv_title_4_0= RULE_STRING
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
            // InternalSVR.g:2769:3: ( (lv_id_6_0= RULE_STRING ) )
            // InternalSVR.g:2770:4: (lv_id_6_0= RULE_STRING )
            {
            // InternalSVR.g:2770:4: (lv_id_6_0= RULE_STRING )
            // InternalSVR.g:2771:5: lv_id_6_0= RULE_STRING
            {
            lv_id_6_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_73); if (state.failed) return current;
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

            // InternalSVR.g:2787:3: (otherlv_7= 'issue=' ( (lv_issue_8_0= RULE_UINT_STRING ) ) (otherlv_9= 'revision=' ( (lv_revision_10_0= RULE_UINT_STRING ) ) )? )?
            int alt59=2;
            int LA59_0 = input.LA(1);

            if ( (LA59_0==19) ) {
                alt59=1;
            }
            switch (alt59) {
                case 1 :
                    // InternalSVR.g:2788:4: otherlv_7= 'issue=' ( (lv_issue_8_0= RULE_UINT_STRING ) ) (otherlv_9= 'revision=' ( (lv_revision_10_0= RULE_UINT_STRING ) ) )?
                    {
                    otherlv_7=(Token)match(input,19,FollowSets000.FOLLOW_7); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_7, grammarAccess.getDReferenceDocumentAccess().getIssueKeyword_7_0());
                      			
                    }
                    // InternalSVR.g:2792:4: ( (lv_issue_8_0= RULE_UINT_STRING ) )
                    // InternalSVR.g:2793:5: (lv_issue_8_0= RULE_UINT_STRING )
                    {
                    // InternalSVR.g:2793:5: (lv_issue_8_0= RULE_UINT_STRING )
                    // InternalSVR.g:2794:6: lv_issue_8_0= RULE_UINT_STRING
                    {
                    lv_issue_8_0=(Token)match(input,RULE_UINT_STRING,FollowSets000.FOLLOW_74); if (state.failed) return current;
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

                    // InternalSVR.g:2810:4: (otherlv_9= 'revision=' ( (lv_revision_10_0= RULE_UINT_STRING ) ) )?
                    int alt58=2;
                    int LA58_0 = input.LA(1);

                    if ( (LA58_0==20) ) {
                        alt58=1;
                    }
                    switch (alt58) {
                        case 1 :
                            // InternalSVR.g:2811:5: otherlv_9= 'revision=' ( (lv_revision_10_0= RULE_UINT_STRING ) )
                            {
                            otherlv_9=(Token)match(input,20,FollowSets000.FOLLOW_7); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					newLeafNode(otherlv_9, grammarAccess.getDReferenceDocumentAccess().getRevisionKeyword_7_2_0());
                              				
                            }
                            // InternalSVR.g:2815:5: ( (lv_revision_10_0= RULE_UINT_STRING ) )
                            // InternalSVR.g:2816:6: (lv_revision_10_0= RULE_UINT_STRING )
                            {
                            // InternalSVR.g:2816:6: (lv_revision_10_0= RULE_UINT_STRING )
                            // InternalSVR.g:2817:7: lv_revision_10_0= RULE_UINT_STRING
                            {
                            lv_revision_10_0=(Token)match(input,RULE_UINT_STRING,FollowSets000.FOLLOW_75); if (state.failed) return current;
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

            // InternalSVR.g:2835:3: (otherlv_11= 'date=' ( (lv_date_12_0= RULE_STRING ) ) )?
            int alt60=2;
            int LA60_0 = input.LA(1);

            if ( (LA60_0==21) ) {
                alt60=1;
            }
            switch (alt60) {
                case 1 :
                    // InternalSVR.g:2836:4: otherlv_11= 'date=' ( (lv_date_12_0= RULE_STRING ) )
                    {
                    otherlv_11=(Token)match(input,21,FollowSets000.FOLLOW_4); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_11, grammarAccess.getDReferenceDocumentAccess().getDateKeyword_8_0());
                      			
                    }
                    // InternalSVR.g:2840:4: ( (lv_date_12_0= RULE_STRING ) )
                    // InternalSVR.g:2841:5: (lv_date_12_0= RULE_STRING )
                    {
                    // InternalSVR.g:2841:5: (lv_date_12_0= RULE_STRING )
                    // InternalSVR.g:2842:6: lv_date_12_0= RULE_STRING
                    {
                    lv_date_12_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_76); if (state.failed) return current;
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

            // InternalSVR.g:2859:3: (otherlv_13= 'url=' ( (lv_url_14_0= RULE_STRING ) ) )?
            int alt61=2;
            int LA61_0 = input.LA(1);

            if ( (LA61_0==76) ) {
                alt61=1;
            }
            switch (alt61) {
                case 1 :
                    // InternalSVR.g:2860:4: otherlv_13= 'url=' ( (lv_url_14_0= RULE_STRING ) )
                    {
                    otherlv_13=(Token)match(input,76,FollowSets000.FOLLOW_4); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_13, grammarAccess.getDReferenceDocumentAccess().getUrlKeyword_9_0());
                      			
                    }
                    // InternalSVR.g:2864:4: ( (lv_url_14_0= RULE_STRING ) )
                    // InternalSVR.g:2865:5: (lv_url_14_0= RULE_STRING )
                    {
                    // InternalSVR.g:2865:5: (lv_url_14_0= RULE_STRING )
                    // InternalSVR.g:2866:6: lv_url_14_0= RULE_STRING
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


    // $ANTLR start "entryRuleVSVRInstantiableSection"
    // InternalSVR.g:2891:1: entryRuleVSVRInstantiableSection returns [EObject current=null] : iv_ruleVSVRInstantiableSection= ruleVSVRInstantiableSection EOF ;
    public final EObject entryRuleVSVRInstantiableSection() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVSVRInstantiableSection = null;


        try {
            // InternalSVR.g:2891:64: (iv_ruleVSVRInstantiableSection= ruleVSVRInstantiableSection EOF )
            // InternalSVR.g:2892:2: iv_ruleVSVRInstantiableSection= ruleVSVRInstantiableSection EOF
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
    // InternalSVR.g:2898:1: ruleVSVRInstantiableSection returns [EObject current=null] : (otherlv_0= '<subsection' otherlv_1= 'name=' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= '>' ( (lv_body_4_0= ruleDBody ) )? ( (lv_svrInstatiableSubsections_5_0= ruleVSVRInstantiableSection ) )* otherlv_6= '</subsection>' ) ;
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
            // InternalSVR.g:2904:2: ( (otherlv_0= '<subsection' otherlv_1= 'name=' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= '>' ( (lv_body_4_0= ruleDBody ) )? ( (lv_svrInstatiableSubsections_5_0= ruleVSVRInstantiableSection ) )* otherlv_6= '</subsection>' ) )
            // InternalSVR.g:2905:2: (otherlv_0= '<subsection' otherlv_1= 'name=' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= '>' ( (lv_body_4_0= ruleDBody ) )? ( (lv_svrInstatiableSubsections_5_0= ruleVSVRInstantiableSection ) )* otherlv_6= '</subsection>' )
            {
            // InternalSVR.g:2905:2: (otherlv_0= '<subsection' otherlv_1= 'name=' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= '>' ( (lv_body_4_0= ruleDBody ) )? ( (lv_svrInstatiableSubsections_5_0= ruleVSVRInstantiableSection ) )* otherlv_6= '</subsection>' )
            // InternalSVR.g:2906:3: otherlv_0= '<subsection' otherlv_1= 'name=' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= '>' ( (lv_body_4_0= ruleDBody ) )? ( (lv_svrInstatiableSubsections_5_0= ruleVSVRInstantiableSection ) )* otherlv_6= '</subsection>'
            {
            otherlv_0=(Token)match(input,78,FollowSets000.FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getVSVRInstantiableSectionAccess().getSubsectionKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,17,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getVSVRInstantiableSectionAccess().getNameKeyword_1());
              		
            }
            // InternalSVR.g:2914:3: ( (lv_name_2_0= RULE_STRING ) )
            // InternalSVR.g:2915:4: (lv_name_2_0= RULE_STRING )
            {
            // InternalSVR.g:2915:4: (lv_name_2_0= RULE_STRING )
            // InternalSVR.g:2916:5: lv_name_2_0= RULE_STRING
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

            otherlv_3=(Token)match(input,22,FollowSets000.FOLLOW_77); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getVSVRInstantiableSectionAccess().getGreaterThanSignKeyword_3());
              		
            }
            // InternalSVR.g:2936:3: ( (lv_body_4_0= ruleDBody ) )?
            int alt62=2;
            int LA62_0 = input.LA(1);

            if ( (LA62_0==34) ) {
                alt62=1;
            }
            switch (alt62) {
                case 1 :
                    // InternalSVR.g:2937:4: (lv_body_4_0= ruleDBody )
                    {
                    // InternalSVR.g:2937:4: (lv_body_4_0= ruleDBody )
                    // InternalSVR.g:2938:5: lv_body_4_0= ruleDBody
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getVSVRInstantiableSectionAccess().getBodyDBodyParserRuleCall_4_0());
                      				
                    }
                    pushFollow(FollowSets000.FOLLOW_78);
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

            // InternalSVR.g:2955:3: ( (lv_svrInstatiableSubsections_5_0= ruleVSVRInstantiableSection ) )*
            loop63:
            do {
                int alt63=2;
                int LA63_0 = input.LA(1);

                if ( (LA63_0==78) ) {
                    alt63=1;
                }


                switch (alt63) {
            	case 1 :
            	    // InternalSVR.g:2956:4: (lv_svrInstatiableSubsections_5_0= ruleVSVRInstantiableSection )
            	    {
            	    // InternalSVR.g:2956:4: (lv_svrInstatiableSubsections_5_0= ruleVSVRInstantiableSection )
            	    // InternalSVR.g:2957:5: lv_svrInstatiableSubsections_5_0= ruleVSVRInstantiableSection
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getVSVRInstantiableSectionAccess().getSvrInstatiableSubsectionsVSVRInstantiableSectionParserRuleCall_5_0());
            	      				
            	    }
            	    pushFollow(FollowSets000.FOLLOW_78);
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
            	    break loop63;
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
    // InternalSVR.g:2982:1: entryRuleVSVRIntroduction returns [EObject current=null] : iv_ruleVSVRIntroduction= ruleVSVRIntroduction EOF ;
    public final EObject entryRuleVSVRIntroduction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVSVRIntroduction = null;


        try {
            // InternalSVR.g:2982:57: (iv_ruleVSVRIntroduction= ruleVSVRIntroduction EOF )
            // InternalSVR.g:2983:2: iv_ruleVSVRIntroduction= ruleVSVRIntroduction EOF
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
    // InternalSVR.g:2989:1: ruleVSVRIntroduction returns [EObject current=null] : (otherlv_0= '<Introduction>' ( (lv_svrInstatiableSubsections_1_0= ruleVSVRInstantiableSection ) )+ otherlv_2= '</Introduction>' ) ;
    public final EObject ruleVSVRIntroduction() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_svrInstatiableSubsections_1_0 = null;



        	enterRule();

        try {
            // InternalSVR.g:2995:2: ( (otherlv_0= '<Introduction>' ( (lv_svrInstatiableSubsections_1_0= ruleVSVRInstantiableSection ) )+ otherlv_2= '</Introduction>' ) )
            // InternalSVR.g:2996:2: (otherlv_0= '<Introduction>' ( (lv_svrInstatiableSubsections_1_0= ruleVSVRInstantiableSection ) )+ otherlv_2= '</Introduction>' )
            {
            // InternalSVR.g:2996:2: (otherlv_0= '<Introduction>' ( (lv_svrInstatiableSubsections_1_0= ruleVSVRInstantiableSection ) )+ otherlv_2= '</Introduction>' )
            // InternalSVR.g:2997:3: otherlv_0= '<Introduction>' ( (lv_svrInstatiableSubsections_1_0= ruleVSVRInstantiableSection ) )+ otherlv_2= '</Introduction>'
            {
            otherlv_0=(Token)match(input,80,FollowSets000.FOLLOW_79); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getVSVRIntroductionAccess().getIntroductionKeyword_0());
              		
            }
            // InternalSVR.g:3001:3: ( (lv_svrInstatiableSubsections_1_0= ruleVSVRInstantiableSection ) )+
            int cnt64=0;
            loop64:
            do {
                int alt64=2;
                int LA64_0 = input.LA(1);

                if ( (LA64_0==78) ) {
                    alt64=1;
                }


                switch (alt64) {
            	case 1 :
            	    // InternalSVR.g:3002:4: (lv_svrInstatiableSubsections_1_0= ruleVSVRInstantiableSection )
            	    {
            	    // InternalSVR.g:3002:4: (lv_svrInstatiableSubsections_1_0= ruleVSVRInstantiableSection )
            	    // InternalSVR.g:3003:5: lv_svrInstatiableSubsections_1_0= ruleVSVRInstantiableSection
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getVSVRIntroductionAccess().getSvrInstatiableSubsectionsVSVRInstantiableSectionParserRuleCall_1_0());
            	      				
            	    }
            	    pushFollow(FollowSets000.FOLLOW_80);
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
            	    if ( cnt64 >= 1 ) break loop64;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(64, input);
                        throw eee;
                }
                cnt64++;
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
    // InternalSVR.g:3028:1: entryRuleVSVRApplicableDocuments returns [EObject current=null] : iv_ruleVSVRApplicableDocuments= ruleVSVRApplicableDocuments EOF ;
    public final EObject entryRuleVSVRApplicableDocuments() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVSVRApplicableDocuments = null;


        try {
            // InternalSVR.g:3028:64: (iv_ruleVSVRApplicableDocuments= ruleVSVRApplicableDocuments EOF )
            // InternalSVR.g:3029:2: iv_ruleVSVRApplicableDocuments= ruleVSVRApplicableDocuments EOF
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
    // InternalSVR.g:3035:1: ruleVSVRApplicableDocuments returns [EObject current=null] : ( () otherlv_1= '<ApplicableDocuments>' ( (lv_applicableDocuments_2_0= ruleDApplicableDocument ) )* otherlv_3= '</ApplicableDocuments>' ) ;
    public final EObject ruleVSVRApplicableDocuments() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_applicableDocuments_2_0 = null;



        	enterRule();

        try {
            // InternalSVR.g:3041:2: ( ( () otherlv_1= '<ApplicableDocuments>' ( (lv_applicableDocuments_2_0= ruleDApplicableDocument ) )* otherlv_3= '</ApplicableDocuments>' ) )
            // InternalSVR.g:3042:2: ( () otherlv_1= '<ApplicableDocuments>' ( (lv_applicableDocuments_2_0= ruleDApplicableDocument ) )* otherlv_3= '</ApplicableDocuments>' )
            {
            // InternalSVR.g:3042:2: ( () otherlv_1= '<ApplicableDocuments>' ( (lv_applicableDocuments_2_0= ruleDApplicableDocument ) )* otherlv_3= '</ApplicableDocuments>' )
            // InternalSVR.g:3043:3: () otherlv_1= '<ApplicableDocuments>' ( (lv_applicableDocuments_2_0= ruleDApplicableDocument ) )* otherlv_3= '</ApplicableDocuments>'
            {
            // InternalSVR.g:3043:3: ()
            // InternalSVR.g:3044:4: 
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

            otherlv_1=(Token)match(input,82,FollowSets000.FOLLOW_81); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getVSVRApplicableDocumentsAccess().getApplicableDocumentsKeyword_1());
              		
            }
            // InternalSVR.g:3057:3: ( (lv_applicableDocuments_2_0= ruleDApplicableDocument ) )*
            loop65:
            do {
                int alt65=2;
                int LA65_0 = input.LA(1);

                if ( (LA65_0==74) ) {
                    alt65=1;
                }


                switch (alt65) {
            	case 1 :
            	    // InternalSVR.g:3058:4: (lv_applicableDocuments_2_0= ruleDApplicableDocument )
            	    {
            	    // InternalSVR.g:3058:4: (lv_applicableDocuments_2_0= ruleDApplicableDocument )
            	    // InternalSVR.g:3059:5: lv_applicableDocuments_2_0= ruleDApplicableDocument
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getVSVRApplicableDocumentsAccess().getApplicableDocumentsDApplicableDocumentParserRuleCall_2_0());
            	      				
            	    }
            	    pushFollow(FollowSets000.FOLLOW_81);
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
            	    break loop65;
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
    // InternalSVR.g:3084:1: entryRuleVSVRReferenceDocuments returns [EObject current=null] : iv_ruleVSVRReferenceDocuments= ruleVSVRReferenceDocuments EOF ;
    public final EObject entryRuleVSVRReferenceDocuments() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVSVRReferenceDocuments = null;


        try {
            // InternalSVR.g:3084:63: (iv_ruleVSVRReferenceDocuments= ruleVSVRReferenceDocuments EOF )
            // InternalSVR.g:3085:2: iv_ruleVSVRReferenceDocuments= ruleVSVRReferenceDocuments EOF
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
    // InternalSVR.g:3091:1: ruleVSVRReferenceDocuments returns [EObject current=null] : ( () otherlv_1= '<ReferenceDocuments>' ( (lv_referenceDocuments_2_0= ruleDReferenceDocument ) )* otherlv_3= '</ReferenceDocuments>' ) ;
    public final EObject ruleVSVRReferenceDocuments() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_referenceDocuments_2_0 = null;



        	enterRule();

        try {
            // InternalSVR.g:3097:2: ( ( () otherlv_1= '<ReferenceDocuments>' ( (lv_referenceDocuments_2_0= ruleDReferenceDocument ) )* otherlv_3= '</ReferenceDocuments>' ) )
            // InternalSVR.g:3098:2: ( () otherlv_1= '<ReferenceDocuments>' ( (lv_referenceDocuments_2_0= ruleDReferenceDocument ) )* otherlv_3= '</ReferenceDocuments>' )
            {
            // InternalSVR.g:3098:2: ( () otherlv_1= '<ReferenceDocuments>' ( (lv_referenceDocuments_2_0= ruleDReferenceDocument ) )* otherlv_3= '</ReferenceDocuments>' )
            // InternalSVR.g:3099:3: () otherlv_1= '<ReferenceDocuments>' ( (lv_referenceDocuments_2_0= ruleDReferenceDocument ) )* otherlv_3= '</ReferenceDocuments>'
            {
            // InternalSVR.g:3099:3: ()
            // InternalSVR.g:3100:4: 
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

            otherlv_1=(Token)match(input,84,FollowSets000.FOLLOW_82); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getVSVRReferenceDocumentsAccess().getReferenceDocumentsKeyword_1());
              		
            }
            // InternalSVR.g:3113:3: ( (lv_referenceDocuments_2_0= ruleDReferenceDocument ) )*
            loop66:
            do {
                int alt66=2;
                int LA66_0 = input.LA(1);

                if ( (LA66_0==77) ) {
                    alt66=1;
                }


                switch (alt66) {
            	case 1 :
            	    // InternalSVR.g:3114:4: (lv_referenceDocuments_2_0= ruleDReferenceDocument )
            	    {
            	    // InternalSVR.g:3114:4: (lv_referenceDocuments_2_0= ruleDReferenceDocument )
            	    // InternalSVR.g:3115:5: lv_referenceDocuments_2_0= ruleDReferenceDocument
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getVSVRReferenceDocumentsAccess().getReferenceDocumentsDReferenceDocumentParserRuleCall_2_0());
            	      				
            	    }
            	    pushFollow(FollowSets000.FOLLOW_82);
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
            	    break loop66;
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
    // InternalSVR.g:3140:1: entryRuleVSVRTermsDefinitionsAbbreviations returns [EObject current=null] : iv_ruleVSVRTermsDefinitionsAbbreviations= ruleVSVRTermsDefinitionsAbbreviations EOF ;
    public final EObject entryRuleVSVRTermsDefinitionsAbbreviations() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVSVRTermsDefinitionsAbbreviations = null;


        try {
            // InternalSVR.g:3140:74: (iv_ruleVSVRTermsDefinitionsAbbreviations= ruleVSVRTermsDefinitionsAbbreviations EOF )
            // InternalSVR.g:3141:2: iv_ruleVSVRTermsDefinitionsAbbreviations= ruleVSVRTermsDefinitionsAbbreviations EOF
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
    // InternalSVR.g:3147:1: ruleVSVRTermsDefinitionsAbbreviations returns [EObject current=null] : ( () otherlv_1= '<TermsDefinitionsAbbreviations>' ( (lv_terms_2_0= ruleVSVRTerm ) )* ( (lv_definitions_3_0= ruleVSVRDefinition ) )* ( (lv_abbreviations_4_0= ruleVSVRAbbreviation ) )* otherlv_5= '</TermsDefinitionsAbbreviations>' ) ;
    public final EObject ruleVSVRTermsDefinitionsAbbreviations() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_5=null;
        EObject lv_terms_2_0 = null;

        EObject lv_definitions_3_0 = null;

        EObject lv_abbreviations_4_0 = null;



        	enterRule();

        try {
            // InternalSVR.g:3153:2: ( ( () otherlv_1= '<TermsDefinitionsAbbreviations>' ( (lv_terms_2_0= ruleVSVRTerm ) )* ( (lv_definitions_3_0= ruleVSVRDefinition ) )* ( (lv_abbreviations_4_0= ruleVSVRAbbreviation ) )* otherlv_5= '</TermsDefinitionsAbbreviations>' ) )
            // InternalSVR.g:3154:2: ( () otherlv_1= '<TermsDefinitionsAbbreviations>' ( (lv_terms_2_0= ruleVSVRTerm ) )* ( (lv_definitions_3_0= ruleVSVRDefinition ) )* ( (lv_abbreviations_4_0= ruleVSVRAbbreviation ) )* otherlv_5= '</TermsDefinitionsAbbreviations>' )
            {
            // InternalSVR.g:3154:2: ( () otherlv_1= '<TermsDefinitionsAbbreviations>' ( (lv_terms_2_0= ruleVSVRTerm ) )* ( (lv_definitions_3_0= ruleVSVRDefinition ) )* ( (lv_abbreviations_4_0= ruleVSVRAbbreviation ) )* otherlv_5= '</TermsDefinitionsAbbreviations>' )
            // InternalSVR.g:3155:3: () otherlv_1= '<TermsDefinitionsAbbreviations>' ( (lv_terms_2_0= ruleVSVRTerm ) )* ( (lv_definitions_3_0= ruleVSVRDefinition ) )* ( (lv_abbreviations_4_0= ruleVSVRAbbreviation ) )* otherlv_5= '</TermsDefinitionsAbbreviations>'
            {
            // InternalSVR.g:3155:3: ()
            // InternalSVR.g:3156:4: 
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

            otherlv_1=(Token)match(input,86,FollowSets000.FOLLOW_83); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getVSVRTermsDefinitionsAbbreviationsAccess().getTermsDefinitionsAbbreviationsKeyword_1());
              		
            }
            // InternalSVR.g:3169:3: ( (lv_terms_2_0= ruleVSVRTerm ) )*
            loop67:
            do {
                int alt67=2;
                int LA67_0 = input.LA(1);

                if ( (LA67_0==88) ) {
                    alt67=1;
                }


                switch (alt67) {
            	case 1 :
            	    // InternalSVR.g:3170:4: (lv_terms_2_0= ruleVSVRTerm )
            	    {
            	    // InternalSVR.g:3170:4: (lv_terms_2_0= ruleVSVRTerm )
            	    // InternalSVR.g:3171:5: lv_terms_2_0= ruleVSVRTerm
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getVSVRTermsDefinitionsAbbreviationsAccess().getTermsVSVRTermParserRuleCall_2_0());
            	      				
            	    }
            	    pushFollow(FollowSets000.FOLLOW_83);
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
            	    break loop67;
                }
            } while (true);

            // InternalSVR.g:3188:3: ( (lv_definitions_3_0= ruleVSVRDefinition ) )*
            loop68:
            do {
                int alt68=2;
                int LA68_0 = input.LA(1);

                if ( (LA68_0==90) ) {
                    alt68=1;
                }


                switch (alt68) {
            	case 1 :
            	    // InternalSVR.g:3189:4: (lv_definitions_3_0= ruleVSVRDefinition )
            	    {
            	    // InternalSVR.g:3189:4: (lv_definitions_3_0= ruleVSVRDefinition )
            	    // InternalSVR.g:3190:5: lv_definitions_3_0= ruleVSVRDefinition
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getVSVRTermsDefinitionsAbbreviationsAccess().getDefinitionsVSVRDefinitionParserRuleCall_3_0());
            	      				
            	    }
            	    pushFollow(FollowSets000.FOLLOW_84);
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
            	    break loop68;
                }
            } while (true);

            // InternalSVR.g:3207:3: ( (lv_abbreviations_4_0= ruleVSVRAbbreviation ) )*
            loop69:
            do {
                int alt69=2;
                int LA69_0 = input.LA(1);

                if ( (LA69_0==92) ) {
                    alt69=1;
                }


                switch (alt69) {
            	case 1 :
            	    // InternalSVR.g:3208:4: (lv_abbreviations_4_0= ruleVSVRAbbreviation )
            	    {
            	    // InternalSVR.g:3208:4: (lv_abbreviations_4_0= ruleVSVRAbbreviation )
            	    // InternalSVR.g:3209:5: lv_abbreviations_4_0= ruleVSVRAbbreviation
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getVSVRTermsDefinitionsAbbreviationsAccess().getAbbreviationsVSVRAbbreviationParserRuleCall_4_0());
            	      				
            	    }
            	    pushFollow(FollowSets000.FOLLOW_85);
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
            	    break loop69;
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
    // InternalSVR.g:3234:1: entryRuleVSVRTerm returns [EObject current=null] : iv_ruleVSVRTerm= ruleVSVRTerm EOF ;
    public final EObject entryRuleVSVRTerm() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVSVRTerm = null;


        try {
            // InternalSVR.g:3234:49: (iv_ruleVSVRTerm= ruleVSVRTerm EOF )
            // InternalSVR.g:3235:2: iv_ruleVSVRTerm= ruleVSVRTerm EOF
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
    // InternalSVR.g:3241:1: ruleVSVRTerm returns [EObject current=null] : (otherlv_0= '<Term' otherlv_1= 'name=' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= '>' ( (lv_description_4_0= ruleDRun ) ) otherlv_5= '</Term>' ) ;
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
            // InternalSVR.g:3247:2: ( (otherlv_0= '<Term' otherlv_1= 'name=' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= '>' ( (lv_description_4_0= ruleDRun ) ) otherlv_5= '</Term>' ) )
            // InternalSVR.g:3248:2: (otherlv_0= '<Term' otherlv_1= 'name=' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= '>' ( (lv_description_4_0= ruleDRun ) ) otherlv_5= '</Term>' )
            {
            // InternalSVR.g:3248:2: (otherlv_0= '<Term' otherlv_1= 'name=' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= '>' ( (lv_description_4_0= ruleDRun ) ) otherlv_5= '</Term>' )
            // InternalSVR.g:3249:3: otherlv_0= '<Term' otherlv_1= 'name=' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= '>' ( (lv_description_4_0= ruleDRun ) ) otherlv_5= '</Term>'
            {
            otherlv_0=(Token)match(input,88,FollowSets000.FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getVSVRTermAccess().getTermKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,17,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getVSVRTermAccess().getNameKeyword_1());
              		
            }
            // InternalSVR.g:3257:3: ( (lv_name_2_0= RULE_STRING ) )
            // InternalSVR.g:3258:4: (lv_name_2_0= RULE_STRING )
            {
            // InternalSVR.g:3258:4: (lv_name_2_0= RULE_STRING )
            // InternalSVR.g:3259:5: lv_name_2_0= RULE_STRING
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

            otherlv_3=(Token)match(input,22,FollowSets000.FOLLOW_49); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getVSVRTermAccess().getGreaterThanSignKeyword_3());
              		
            }
            // InternalSVR.g:3279:3: ( (lv_description_4_0= ruleDRun ) )
            // InternalSVR.g:3280:4: (lv_description_4_0= ruleDRun )
            {
            // InternalSVR.g:3280:4: (lv_description_4_0= ruleDRun )
            // InternalSVR.g:3281:5: lv_description_4_0= ruleDRun
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getVSVRTermAccess().getDescriptionDRunParserRuleCall_4_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_86);
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
    // InternalSVR.g:3306:1: entryRuleVSVRDefinition returns [EObject current=null] : iv_ruleVSVRDefinition= ruleVSVRDefinition EOF ;
    public final EObject entryRuleVSVRDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVSVRDefinition = null;


        try {
            // InternalSVR.g:3306:55: (iv_ruleVSVRDefinition= ruleVSVRDefinition EOF )
            // InternalSVR.g:3307:2: iv_ruleVSVRDefinition= ruleVSVRDefinition EOF
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
    // InternalSVR.g:3313:1: ruleVSVRDefinition returns [EObject current=null] : (otherlv_0= '<Definition' otherlv_1= 'name=' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= '>' ( (lv_description_4_0= ruleDRun ) ) otherlv_5= '</Definition>' ) ;
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
            // InternalSVR.g:3319:2: ( (otherlv_0= '<Definition' otherlv_1= 'name=' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= '>' ( (lv_description_4_0= ruleDRun ) ) otherlv_5= '</Definition>' ) )
            // InternalSVR.g:3320:2: (otherlv_0= '<Definition' otherlv_1= 'name=' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= '>' ( (lv_description_4_0= ruleDRun ) ) otherlv_5= '</Definition>' )
            {
            // InternalSVR.g:3320:2: (otherlv_0= '<Definition' otherlv_1= 'name=' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= '>' ( (lv_description_4_0= ruleDRun ) ) otherlv_5= '</Definition>' )
            // InternalSVR.g:3321:3: otherlv_0= '<Definition' otherlv_1= 'name=' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= '>' ( (lv_description_4_0= ruleDRun ) ) otherlv_5= '</Definition>'
            {
            otherlv_0=(Token)match(input,90,FollowSets000.FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getVSVRDefinitionAccess().getDefinitionKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,17,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getVSVRDefinitionAccess().getNameKeyword_1());
              		
            }
            // InternalSVR.g:3329:3: ( (lv_name_2_0= RULE_STRING ) )
            // InternalSVR.g:3330:4: (lv_name_2_0= RULE_STRING )
            {
            // InternalSVR.g:3330:4: (lv_name_2_0= RULE_STRING )
            // InternalSVR.g:3331:5: lv_name_2_0= RULE_STRING
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

            otherlv_3=(Token)match(input,22,FollowSets000.FOLLOW_49); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getVSVRDefinitionAccess().getGreaterThanSignKeyword_3());
              		
            }
            // InternalSVR.g:3351:3: ( (lv_description_4_0= ruleDRun ) )
            // InternalSVR.g:3352:4: (lv_description_4_0= ruleDRun )
            {
            // InternalSVR.g:3352:4: (lv_description_4_0= ruleDRun )
            // InternalSVR.g:3353:5: lv_description_4_0= ruleDRun
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getVSVRDefinitionAccess().getDescriptionDRunParserRuleCall_4_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_87);
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
    // InternalSVR.g:3378:1: entryRuleVSVRAbbreviation returns [EObject current=null] : iv_ruleVSVRAbbreviation= ruleVSVRAbbreviation EOF ;
    public final EObject entryRuleVSVRAbbreviation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVSVRAbbreviation = null;


        try {
            // InternalSVR.g:3378:57: (iv_ruleVSVRAbbreviation= ruleVSVRAbbreviation EOF )
            // InternalSVR.g:3379:2: iv_ruleVSVRAbbreviation= ruleVSVRAbbreviation EOF
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
    // InternalSVR.g:3385:1: ruleVSVRAbbreviation returns [EObject current=null] : (otherlv_0= '<Abbreviation' otherlv_1= 'name=' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= '>' ( (lv_description_4_0= ruleDRun ) ) otherlv_5= '</Abbreviation>' ) ;
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
            // InternalSVR.g:3391:2: ( (otherlv_0= '<Abbreviation' otherlv_1= 'name=' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= '>' ( (lv_description_4_0= ruleDRun ) ) otherlv_5= '</Abbreviation>' ) )
            // InternalSVR.g:3392:2: (otherlv_0= '<Abbreviation' otherlv_1= 'name=' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= '>' ( (lv_description_4_0= ruleDRun ) ) otherlv_5= '</Abbreviation>' )
            {
            // InternalSVR.g:3392:2: (otherlv_0= '<Abbreviation' otherlv_1= 'name=' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= '>' ( (lv_description_4_0= ruleDRun ) ) otherlv_5= '</Abbreviation>' )
            // InternalSVR.g:3393:3: otherlv_0= '<Abbreviation' otherlv_1= 'name=' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= '>' ( (lv_description_4_0= ruleDRun ) ) otherlv_5= '</Abbreviation>'
            {
            otherlv_0=(Token)match(input,92,FollowSets000.FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getVSVRAbbreviationAccess().getAbbreviationKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,17,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getVSVRAbbreviationAccess().getNameKeyword_1());
              		
            }
            // InternalSVR.g:3401:3: ( (lv_name_2_0= RULE_STRING ) )
            // InternalSVR.g:3402:4: (lv_name_2_0= RULE_STRING )
            {
            // InternalSVR.g:3402:4: (lv_name_2_0= RULE_STRING )
            // InternalSVR.g:3403:5: lv_name_2_0= RULE_STRING
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

            otherlv_3=(Token)match(input,22,FollowSets000.FOLLOW_49); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getVSVRAbbreviationAccess().getGreaterThanSignKeyword_3());
              		
            }
            // InternalSVR.g:3423:3: ( (lv_description_4_0= ruleDRun ) )
            // InternalSVR.g:3424:4: (lv_description_4_0= ruleDRun )
            {
            // InternalSVR.g:3424:4: (lv_description_4_0= ruleDRun )
            // InternalSVR.g:3425:5: lv_description_4_0= ruleDRun
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getVSVRAbbreviationAccess().getDescriptionDRunParserRuleCall_4_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_88);
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


    // $ANTLR start "ruleDAlignment"
    // InternalSVR.g:3450:1: ruleDAlignment returns [Enumerator current=null] : ( (enumLiteral_0= '\"left\"' ) | (enumLiteral_1= '\"center\"' ) | (enumLiteral_2= '\"right\"' ) | (enumLiteral_3= '\"justified\"' ) ) ;
    public final Enumerator ruleDAlignment() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;


        	enterRule();

        try {
            // InternalSVR.g:3456:2: ( ( (enumLiteral_0= '\"left\"' ) | (enumLiteral_1= '\"center\"' ) | (enumLiteral_2= '\"right\"' ) | (enumLiteral_3= '\"justified\"' ) ) )
            // InternalSVR.g:3457:2: ( (enumLiteral_0= '\"left\"' ) | (enumLiteral_1= '\"center\"' ) | (enumLiteral_2= '\"right\"' ) | (enumLiteral_3= '\"justified\"' ) )
            {
            // InternalSVR.g:3457:2: ( (enumLiteral_0= '\"left\"' ) | (enumLiteral_1= '\"center\"' ) | (enumLiteral_2= '\"right\"' ) | (enumLiteral_3= '\"justified\"' ) )
            int alt70=4;
            switch ( input.LA(1) ) {
            case 94:
                {
                alt70=1;
                }
                break;
            case 95:
                {
                alt70=2;
                }
                break;
            case 96:
                {
                alt70=3;
                }
                break;
            case 97:
                {
                alt70=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 70, 0, input);

                throw nvae;
            }

            switch (alt70) {
                case 1 :
                    // InternalSVR.g:3458:3: (enumLiteral_0= '\"left\"' )
                    {
                    // InternalSVR.g:3458:3: (enumLiteral_0= '\"left\"' )
                    // InternalSVR.g:3459:4: enumLiteral_0= '\"left\"'
                    {
                    enumLiteral_0=(Token)match(input,94,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getDAlignmentAccess().getLeftEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_0, grammarAccess.getDAlignmentAccess().getLeftEnumLiteralDeclaration_0());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalSVR.g:3466:3: (enumLiteral_1= '\"center\"' )
                    {
                    // InternalSVR.g:3466:3: (enumLiteral_1= '\"center\"' )
                    // InternalSVR.g:3467:4: enumLiteral_1= '\"center\"'
                    {
                    enumLiteral_1=(Token)match(input,95,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getDAlignmentAccess().getCenterEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_1, grammarAccess.getDAlignmentAccess().getCenterEnumLiteralDeclaration_1());
                      			
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalSVR.g:3474:3: (enumLiteral_2= '\"right\"' )
                    {
                    // InternalSVR.g:3474:3: (enumLiteral_2= '\"right\"' )
                    // InternalSVR.g:3475:4: enumLiteral_2= '\"right\"'
                    {
                    enumLiteral_2=(Token)match(input,96,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getDAlignmentAccess().getRightEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_2, grammarAccess.getDAlignmentAccess().getRightEnumLiteralDeclaration_2());
                      			
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalSVR.g:3482:3: (enumLiteral_3= '\"justified\"' )
                    {
                    // InternalSVR.g:3482:3: (enumLiteral_3= '\"justified\"' )
                    // InternalSVR.g:3483:4: enumLiteral_3= '\"justified\"'
                    {
                    enumLiteral_3=(Token)match(input,97,FollowSets000.FOLLOW_2); if (state.failed) return current;
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
    // InternalSVR.g:3493:1: ruleDRunAttributes returns [Enumerator current=null] : ( (enumLiteral_0= '\"true\"' ) | (enumLiteral_1= '\"false\"' ) ) ;
    public final Enumerator ruleDRunAttributes() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalSVR.g:3499:2: ( ( (enumLiteral_0= '\"true\"' ) | (enumLiteral_1= '\"false\"' ) ) )
            // InternalSVR.g:3500:2: ( (enumLiteral_0= '\"true\"' ) | (enumLiteral_1= '\"false\"' ) )
            {
            // InternalSVR.g:3500:2: ( (enumLiteral_0= '\"true\"' ) | (enumLiteral_1= '\"false\"' ) )
            int alt71=2;
            int LA71_0 = input.LA(1);

            if ( (LA71_0==98) ) {
                alt71=1;
            }
            else if ( (LA71_0==99) ) {
                alt71=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 71, 0, input);

                throw nvae;
            }
            switch (alt71) {
                case 1 :
                    // InternalSVR.g:3501:3: (enumLiteral_0= '\"true\"' )
                    {
                    // InternalSVR.g:3501:3: (enumLiteral_0= '\"true\"' )
                    // InternalSVR.g:3502:4: enumLiteral_0= '\"true\"'
                    {
                    enumLiteral_0=(Token)match(input,98,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getDRunAttributesAccess().getTRUEEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_0, grammarAccess.getDRunAttributesAccess().getTRUEEnumLiteralDeclaration_0());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalSVR.g:3509:3: (enumLiteral_1= '\"false\"' )
                    {
                    // InternalSVR.g:3509:3: (enumLiteral_1= '\"false\"' )
                    // InternalSVR.g:3510:4: enumLiteral_1= '\"false\"'
                    {
                    enumLiteral_1=(Token)match(input,99,FollowSets000.FOLLOW_2); if (state.failed) return current;
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
        public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000004000000L});
        public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000130000000L});
        public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000110000000L});
        public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x00000000C0000000L});
        public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000240000000L});
        public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0800A01000000000L,0x0000000000000003L});
        public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0800A01800000000L,0x0000000000000003L});
        public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x000000E000420000L});
        public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x000000E000400000L});
        public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000000000000L,0x00000003C0000000L});
        public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x000000C000400000L});
        public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000008000400000L});
        public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000000000040L});
        public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0082000000000000L});
        public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0082010000000000L});
        public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000141000000000L});
        public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000140000000000L});
        public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000A00000000000L});
        public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000080000000000L});
        public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000100000000000L});
        public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000020000000000L});
        public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000420000000000L});
        public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0001020000000000L});
        public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x003C000000400000L});
        public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000000000000000L,0x0000000C00000000L});
        public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0038000000400000L});
        public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0030000000400000L});
        public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0020000000400000L});
        public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0400000000000080L});
        public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0040000000000000L});
        public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0100000000000000L});
        public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0000000001400000L});
        public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x0002000000000000L});
        public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x0200000000000000L});
        public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x1000000000000000L});
        public static final BitSet FOLLOW_52 = new BitSet(new long[]{0x2000000000000000L});
        public static final BitSet FOLLOW_53 = new BitSet(new long[]{0x4000000000000000L});
        public static final BitSet FOLLOW_54 = new BitSet(new long[]{0x800000E001000000L});
        public static final BitSet FOLLOW_55 = new BitSet(new long[]{0x800000C001000000L});
        public static final BitSet FOLLOW_56 = new BitSet(new long[]{0x8000008001000000L});
        public static final BitSet FOLLOW_57 = new BitSet(new long[]{0x8000000001000000L});
        public static final BitSet FOLLOW_58 = new BitSet(new long[]{0xA00000E000400000L});
        public static final BitSet FOLLOW_59 = new BitSet(new long[]{0x800000E000400000L});
        public static final BitSet FOLLOW_60 = new BitSet(new long[]{0x800000C000400000L});
        public static final BitSet FOLLOW_61 = new BitSet(new long[]{0x8000008000400000L});
        public static final BitSet FOLLOW_62 = new BitSet(new long[]{0x8000000000400000L});
        public static final BitSet FOLLOW_63 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
        public static final BitSet FOLLOW_64 = new BitSet(new long[]{0x0000000000000000L,0x000000000000000CL});
        public static final BitSet FOLLOW_65 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
        public static final BitSet FOLLOW_66 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000030L});
        public static final BitSet FOLLOW_67 = new BitSet(new long[]{0x2000000000400000L,0x00000000000001C0L});
        public static final BitSet FOLLOW_68 = new BitSet(new long[]{0x2000000000400000L,0x0000000000000180L});
        public static final BitSet FOLLOW_69 = new BitSet(new long[]{0x2000000000400000L,0x0000000000000100L});
        public static final BitSet FOLLOW_70 = new BitSet(new long[]{0x0000000000400000L,0x0000000000000100L});
        public static final BitSet FOLLOW_71 = new BitSet(new long[]{0x0800A01000000000L,0x0000000000000203L});
        public static final BitSet FOLLOW_72 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
        public static final BitSet FOLLOW_73 = new BitSet(new long[]{0x0000000001280000L,0x0000000000001000L});
        public static final BitSet FOLLOW_74 = new BitSet(new long[]{0x0000000001300000L,0x0000000000001000L});
        public static final BitSet FOLLOW_75 = new BitSet(new long[]{0x0000000001200000L,0x0000000000001000L});
        public static final BitSet FOLLOW_76 = new BitSet(new long[]{0x0000000001000000L,0x0000000000001000L});
        public static final BitSet FOLLOW_77 = new BitSet(new long[]{0x0000000400000000L,0x000000000000C000L});
        public static final BitSet FOLLOW_78 = new BitSet(new long[]{0x0000000000000000L,0x000000000000C000L});
        public static final BitSet FOLLOW_79 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
        public static final BitSet FOLLOW_80 = new BitSet(new long[]{0x0000000000000000L,0x0000000000024000L});
        public static final BitSet FOLLOW_81 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080400L});
        public static final BitSet FOLLOW_82 = new BitSet(new long[]{0x0000000000000000L,0x0000000000202000L});
        public static final BitSet FOLLOW_83 = new BitSet(new long[]{0x0000000000000000L,0x0000000015800000L});
        public static final BitSet FOLLOW_84 = new BitSet(new long[]{0x0000000000000000L,0x0000000014800000L});
        public static final BitSet FOLLOW_85 = new BitSet(new long[]{0x0000000000000000L,0x0000000010800000L});
        public static final BitSet FOLLOW_86 = new BitSet(new long[]{0x0000000000000000L,0x0000000002000000L});
        public static final BitSet FOLLOW_87 = new BitSet(new long[]{0x0000000000000000L,0x0000000008000000L});
        public static final BitSet FOLLOW_88 = new BitSet(new long[]{0x0000000000000000L,0x0000000020000000L});
    }


}