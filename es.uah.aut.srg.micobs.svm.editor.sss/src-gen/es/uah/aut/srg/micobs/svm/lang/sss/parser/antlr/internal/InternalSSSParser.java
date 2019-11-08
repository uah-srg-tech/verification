package es.uah.aut.srg.micobs.svm.lang.sss.parser.antlr.internal;

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
import es.uah.aut.srg.micobs.svm.lang.sss.services.SSSGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
/*******************************************************************************
 * Copyright (c) 2018 UAH Space Research Group.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     SRG Team - Initial API and implementation
 ******************************************************************************/
@SuppressWarnings("all")
public class InternalSSSParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_UINT_STRING", "RULE_RUNTEXT", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'<SSS'", "'name='", "'id='", "'issue='", "'revision='", "'date='", "'>'", "'</SSS>'", "'<body>'", "'</body>'", "'<paragraph'", "'style='", "'alignment='", "'</paragraph>'", "'<listItem>'", "'<sublist>'", "'</sublist>'", "'</listItem>'", "'<itemize'", "'</itemize>'", "'<enumerate'", "'</enumerate>'", "'<run'", "'bold=\"true\"'", "'italics=\"true\"'", "'underline=\"true\"'", "'</run>'", "'<hyperlink'", "'reference='", "'</hyperlink>'", "'<tab/>'", "'<figureFromFile'", "'referenceFile='", "'width='", "'height='", "'caption='", "'/>'", "'<tableFromFile'", "'<basicTable'", "'</basicTable>'", "'<row>'", "'</row>'", "'<cell'", "'colSpan='", "'rowSpan='", "'shadow='", "'</cell>'", "'<ApplicableDocument'", "'title='", "'<ReferenceDocument'", "'<subsection'", "'</subsection>'", "'<Introduction>'", "'</Introduction>'", "'<ApplicableDocuments>'", "'</ApplicableDocuments>'", "'<ReferenceDocuments>'", "'</ReferenceDocuments>'", "'<TermsDefinitionsAbbreviations>'", "'</TermsDefinitionsAbbreviations>'", "'<GeneralDescription>'", "'<ProductPerspective>'", "'</ProductPerspective>'", "'<GeneralCapabilities>'", "'</GeneralCapabilities>'", "'<GeneralConstraints>'", "'</GeneralConstraints>'", "'<OperationalEnvironment>'", "'</OperationalEnvironment>'", "'<AssumptionsDependencies>'", "'</AssumptionsDependencies>'", "'</GeneralDescription>'", "'<SpecificRequirements>'", "'</SpecificRequirements>'", "'<VerificationValidationIntegrationRequirements>'", "'</VerificationValidationIntegrationRequirements>'", "'<SystemModels>'", "'</SystemModels>'", "'<Term'", "'</Term>'", "'<Definition'", "'</Definition>'", "'<Abbreviation'", "'</Abbreviation>'", "'<GeneralRequirements>'", "'</GeneralRequirements>'", "'<CapabilitiesRequirements>'", "'</CapabilitiesRequirements>'", "'<SystemInterfaceRequirements>'", "'</SystemInterfaceRequirements>'", "'<AdaptationMissionizationRequirements>'", "'</AdaptationMissionizationRequirements>'", "'<ComputerResourceRequirements>'", "'</ComputerResourceRequirements>'", "'<SecurityRequirements>'", "'</SecurityRequirements>'", "'<SafetyRequirements>'", "'</SafetyRequirements>'", "'<ReliabilityAvailabilityRequirements>'", "'</ReliabilityAvailabilityRequirements>'", "'<QualityRequirements>'", "'</QualityRequirements>'", "'<DesignRequirements>'", "'</DesignRequirements>'", "'<SoftwareOperationsRequirements>'", "'</SoftwareOperationsRequirements>'", "'<SoftwareMaintenanceRequirements>'", "'</SoftwareMaintenanceRequirements>'", "'<SystemSoftwareObservabilityRequirements>'", "'</SystemSoftwareObservabilityRequirements>'", "'<Item'", "'validationMethod='", "'<description>'", "'</description>'", "'<extendedDescription>'", "'</extendedDescription>'", "'</Item>'", "'<VerificationValidationProcessRequirements>'", "'</VerificationValidationProcessRequirements>'", "'<ValidationApproach>'", "'</ValidationApproach>'", "'<ValidationRequirements>'", "'</ValidationRequirements>'", "'<VerificationRequirements>'", "'</VerificationRequirements>'", "'<SystemModel/>'", "'\"left\"'", "'\"center\"'", "'\"right\"'", "'\"justified\"'", "'\"Analysis\"'", "'\"Inspection\"'", "'\"Testing\"'", "'\"Review\"'", "'\"ModelSimulation\"'", "'\"WalkThrough\"'", "'\"CrossReading\"'", "'\"DeskChecking\"'"
    };
    public static final int T__144=144;
    public static final int T__143=143;
    public static final int T__146=146;
    public static final int T__50=50;
    public static final int T__145=145;
    public static final int T__140=140;
    public static final int T__142=142;
    public static final int T__141=141;
    public static final int T__59=59;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int T__57=57;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__137=137;
    public static final int T__52=52;
    public static final int T__136=136;
    public static final int T__53=53;
    public static final int T__139=139;
    public static final int T__54=54;
    public static final int T__138=138;
    public static final int T__133=133;
    public static final int T__132=132;
    public static final int T__60=60;
    public static final int T__135=135;
    public static final int T__61=61;
    public static final int T__134=134;
    public static final int RULE_ID=7;
    public static final int T__131=131;
    public static final int T__130=130;
    public static final int RULE_INT=8;
    public static final int RULE_RUNTEXT=6;
    public static final int T__66=66;
    public static final int RULE_ML_COMMENT=9;
    public static final int T__67=67;
    public static final int T__129=129;
    public static final int T__68=68;
    public static final int T__69=69;
    public static final int T__62=62;
    public static final int T__126=126;
    public static final int T__63=63;
    public static final int T__125=125;
    public static final int T__64=64;
    public static final int T__128=128;
    public static final int T__65=65;
    public static final int T__127=127;
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
    public static final int T__150=150;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__40=40;
    public static final int T__148=148;
    public static final int T__41=41;
    public static final int T__147=147;
    public static final int T__42=42;
    public static final int T__43=43;
    public static final int T__149=149;
    public static final int T__91=91;
    public static final int T__100=100;
    public static final int T__92=92;
    public static final int T__93=93;
    public static final int T__102=102;
    public static final int T__94=94;
    public static final int T__101=101;
    public static final int T__90=90;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__99=99;
    public static final int T__13=13;
    public static final int T__14=14;
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
    public static final int T__122=122;
    public static final int T__70=70;
    public static final int T__121=121;
    public static final int T__71=71;
    public static final int T__124=124;
    public static final int T__72=72;
    public static final int T__123=123;
    public static final int T__120=120;
    public static final int RULE_STRING=4;
    public static final int RULE_UINT_STRING=5;
    public static final int RULE_SL_COMMENT=10;
    public static final int T__77=77;
    public static final int T__119=119;
    public static final int T__78=78;
    public static final int T__118=118;
    public static final int T__79=79;
    public static final int T__73=73;
    public static final int T__115=115;
    public static final int EOF=-1;
    public static final int T__74=74;
    public static final int T__114=114;
    public static final int T__75=75;
    public static final int T__117=117;
    public static final int T__76=76;
    public static final int T__116=116;
    public static final int T__80=80;
    public static final int T__111=111;
    public static final int T__81=81;
    public static final int T__110=110;
    public static final int T__82=82;
    public static final int T__113=113;
    public static final int T__83=83;
    public static final int T__112=112;
    public static final int RULE_WS=11;
    public static final int RULE_ANY_OTHER=12;
    public static final int T__88=88;
    public static final int T__108=108;
    public static final int T__89=89;
    public static final int T__107=107;
    public static final int T__109=109;
    public static final int T__84=84;
    public static final int T__104=104;
    public static final int T__85=85;
    public static final int T__103=103;
    public static final int T__86=86;
    public static final int T__106=106;
    public static final int T__87=87;
    public static final int T__105=105;

    // delegates
    // delegators


        public InternalSSSParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalSSSParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalSSSParser.tokenNames; }
    public String getGrammarFileName() { return "InternalSSS.g"; }



    /*
      This grammar contains a lot of empty actions to work around a bug in ANTLR.
      Otherwise the ANTLR tool will create synpreds that cannot be compiled in some rare cases.
    */

     	private SSSGrammarAccess grammarAccess;

        public InternalSSSParser(TokenStream input, SSSGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "VSSSDocument";
       	}

       	@Override
       	protected SSSGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleVSSSDocument"
    // InternalSSS.g:78:1: entryRuleVSSSDocument returns [EObject current=null] : iv_ruleVSSSDocument= ruleVSSSDocument EOF ;
    public final EObject entryRuleVSSSDocument() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVSSSDocument = null;


        try {
            // InternalSSS.g:78:53: (iv_ruleVSSSDocument= ruleVSSSDocument EOF )
            // InternalSSS.g:79:2: iv_ruleVSSSDocument= ruleVSSSDocument EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getVSSSDocumentRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleVSSSDocument=ruleVSSSDocument();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleVSSSDocument; 
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
    // $ANTLR end "entryRuleVSSSDocument"


    // $ANTLR start "ruleVSSSDocument"
    // InternalSSS.g:85:1: ruleVSSSDocument returns [EObject current=null] : (otherlv_0= '<SSS' otherlv_1= 'name=' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= 'id=' ( (lv_id_4_0= RULE_STRING ) ) otherlv_5= 'issue=' ( (lv_issue_6_0= RULE_UINT_STRING ) ) otherlv_7= 'revision=' ( (lv_revision_8_0= RULE_UINT_STRING ) ) otherlv_9= 'date=' ( (lv_date_10_0= RULE_STRING ) ) otherlv_11= '>' ( (lv_introductionSection_12_0= ruleVSSSIntroduction ) ) ( (lv_applicableDocumentsSection_13_0= ruleVSSSApplicableDocuments ) ) ( (lv_referenceDocumentsSection_14_0= ruleVSSSReferenceDocuments ) ) ( (lv_termsDefinitionsAbbreviationsSection_15_0= ruleVSSSTermsDefinitionsAbbreviations ) ) ( (lv_generalDescriptionSection_16_0= ruleVSSSGeneralDescription ) ) ( (lv_specificRequirementsSection_17_0= ruleVSSSSpecificRequirements ) ) ( (lv_verificationValidationIntegrationSection_18_0= ruleVSSSVerificationValidationIntegrationRequirements ) ) ( (lv_systemModelsSection_19_0= ruleVSSSSystemModels ) ) otherlv_20= '</SSS>' ) ;
    public final EObject ruleVSSSDocument() throws RecognitionException {
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
        Token otherlv_20=null;
        EObject lv_introductionSection_12_0 = null;

        EObject lv_applicableDocumentsSection_13_0 = null;

        EObject lv_referenceDocumentsSection_14_0 = null;

        EObject lv_termsDefinitionsAbbreviationsSection_15_0 = null;

        EObject lv_generalDescriptionSection_16_0 = null;

        EObject lv_specificRequirementsSection_17_0 = null;

        EObject lv_verificationValidationIntegrationSection_18_0 = null;

        EObject lv_systemModelsSection_19_0 = null;



        	enterRule();

        try {
            // InternalSSS.g:91:2: ( (otherlv_0= '<SSS' otherlv_1= 'name=' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= 'id=' ( (lv_id_4_0= RULE_STRING ) ) otherlv_5= 'issue=' ( (lv_issue_6_0= RULE_UINT_STRING ) ) otherlv_7= 'revision=' ( (lv_revision_8_0= RULE_UINT_STRING ) ) otherlv_9= 'date=' ( (lv_date_10_0= RULE_STRING ) ) otherlv_11= '>' ( (lv_introductionSection_12_0= ruleVSSSIntroduction ) ) ( (lv_applicableDocumentsSection_13_0= ruleVSSSApplicableDocuments ) ) ( (lv_referenceDocumentsSection_14_0= ruleVSSSReferenceDocuments ) ) ( (lv_termsDefinitionsAbbreviationsSection_15_0= ruleVSSSTermsDefinitionsAbbreviations ) ) ( (lv_generalDescriptionSection_16_0= ruleVSSSGeneralDescription ) ) ( (lv_specificRequirementsSection_17_0= ruleVSSSSpecificRequirements ) ) ( (lv_verificationValidationIntegrationSection_18_0= ruleVSSSVerificationValidationIntegrationRequirements ) ) ( (lv_systemModelsSection_19_0= ruleVSSSSystemModels ) ) otherlv_20= '</SSS>' ) )
            // InternalSSS.g:92:2: (otherlv_0= '<SSS' otherlv_1= 'name=' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= 'id=' ( (lv_id_4_0= RULE_STRING ) ) otherlv_5= 'issue=' ( (lv_issue_6_0= RULE_UINT_STRING ) ) otherlv_7= 'revision=' ( (lv_revision_8_0= RULE_UINT_STRING ) ) otherlv_9= 'date=' ( (lv_date_10_0= RULE_STRING ) ) otherlv_11= '>' ( (lv_introductionSection_12_0= ruleVSSSIntroduction ) ) ( (lv_applicableDocumentsSection_13_0= ruleVSSSApplicableDocuments ) ) ( (lv_referenceDocumentsSection_14_0= ruleVSSSReferenceDocuments ) ) ( (lv_termsDefinitionsAbbreviationsSection_15_0= ruleVSSSTermsDefinitionsAbbreviations ) ) ( (lv_generalDescriptionSection_16_0= ruleVSSSGeneralDescription ) ) ( (lv_specificRequirementsSection_17_0= ruleVSSSSpecificRequirements ) ) ( (lv_verificationValidationIntegrationSection_18_0= ruleVSSSVerificationValidationIntegrationRequirements ) ) ( (lv_systemModelsSection_19_0= ruleVSSSSystemModels ) ) otherlv_20= '</SSS>' )
            {
            // InternalSSS.g:92:2: (otherlv_0= '<SSS' otherlv_1= 'name=' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= 'id=' ( (lv_id_4_0= RULE_STRING ) ) otherlv_5= 'issue=' ( (lv_issue_6_0= RULE_UINT_STRING ) ) otherlv_7= 'revision=' ( (lv_revision_8_0= RULE_UINT_STRING ) ) otherlv_9= 'date=' ( (lv_date_10_0= RULE_STRING ) ) otherlv_11= '>' ( (lv_introductionSection_12_0= ruleVSSSIntroduction ) ) ( (lv_applicableDocumentsSection_13_0= ruleVSSSApplicableDocuments ) ) ( (lv_referenceDocumentsSection_14_0= ruleVSSSReferenceDocuments ) ) ( (lv_termsDefinitionsAbbreviationsSection_15_0= ruleVSSSTermsDefinitionsAbbreviations ) ) ( (lv_generalDescriptionSection_16_0= ruleVSSSGeneralDescription ) ) ( (lv_specificRequirementsSection_17_0= ruleVSSSSpecificRequirements ) ) ( (lv_verificationValidationIntegrationSection_18_0= ruleVSSSVerificationValidationIntegrationRequirements ) ) ( (lv_systemModelsSection_19_0= ruleVSSSSystemModels ) ) otherlv_20= '</SSS>' )
            // InternalSSS.g:93:3: otherlv_0= '<SSS' otherlv_1= 'name=' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= 'id=' ( (lv_id_4_0= RULE_STRING ) ) otherlv_5= 'issue=' ( (lv_issue_6_0= RULE_UINT_STRING ) ) otherlv_7= 'revision=' ( (lv_revision_8_0= RULE_UINT_STRING ) ) otherlv_9= 'date=' ( (lv_date_10_0= RULE_STRING ) ) otherlv_11= '>' ( (lv_introductionSection_12_0= ruleVSSSIntroduction ) ) ( (lv_applicableDocumentsSection_13_0= ruleVSSSApplicableDocuments ) ) ( (lv_referenceDocumentsSection_14_0= ruleVSSSReferenceDocuments ) ) ( (lv_termsDefinitionsAbbreviationsSection_15_0= ruleVSSSTermsDefinitionsAbbreviations ) ) ( (lv_generalDescriptionSection_16_0= ruleVSSSGeneralDescription ) ) ( (lv_specificRequirementsSection_17_0= ruleVSSSSpecificRequirements ) ) ( (lv_verificationValidationIntegrationSection_18_0= ruleVSSSVerificationValidationIntegrationRequirements ) ) ( (lv_systemModelsSection_19_0= ruleVSSSSystemModels ) ) otherlv_20= '</SSS>'
            {
            otherlv_0=(Token)match(input,13,FollowSets000.FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getVSSSDocumentAccess().getSSSKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,14,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getVSSSDocumentAccess().getNameKeyword_1());
              		
            }
            // InternalSSS.g:101:3: ( (lv_name_2_0= RULE_STRING ) )
            // InternalSSS.g:102:4: (lv_name_2_0= RULE_STRING )
            {
            // InternalSSS.g:102:4: (lv_name_2_0= RULE_STRING )
            // InternalSSS.g:103:5: lv_name_2_0= RULE_STRING
            {
            lv_name_2_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_2_0, grammarAccess.getVSSSDocumentAccess().getNameSTRINGTerminalRuleCall_2_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getVSSSDocumentRule());
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

              			newLeafNode(otherlv_3, grammarAccess.getVSSSDocumentAccess().getIdKeyword_3());
              		
            }
            // InternalSSS.g:123:3: ( (lv_id_4_0= RULE_STRING ) )
            // InternalSSS.g:124:4: (lv_id_4_0= RULE_STRING )
            {
            // InternalSSS.g:124:4: (lv_id_4_0= RULE_STRING )
            // InternalSSS.g:125:5: lv_id_4_0= RULE_STRING
            {
            lv_id_4_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_id_4_0, grammarAccess.getVSSSDocumentAccess().getIdSTRINGTerminalRuleCall_4_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getVSSSDocumentRule());
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

              			newLeafNode(otherlv_5, grammarAccess.getVSSSDocumentAccess().getIssueKeyword_5());
              		
            }
            // InternalSSS.g:145:3: ( (lv_issue_6_0= RULE_UINT_STRING ) )
            // InternalSSS.g:146:4: (lv_issue_6_0= RULE_UINT_STRING )
            {
            // InternalSSS.g:146:4: (lv_issue_6_0= RULE_UINT_STRING )
            // InternalSSS.g:147:5: lv_issue_6_0= RULE_UINT_STRING
            {
            lv_issue_6_0=(Token)match(input,RULE_UINT_STRING,FollowSets000.FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_issue_6_0, grammarAccess.getVSSSDocumentAccess().getIssueUINT_STRINGTerminalRuleCall_6_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getVSSSDocumentRule());
              					}
              					setWithLastConsumed(
              						current,
              						"issue",
              						lv_issue_6_0,
              						"es.uah.aut.srg.micobs.svm.lang.sss.SSS.UINT_STRING");
              				
            }

            }


            }

            otherlv_7=(Token)match(input,17,FollowSets000.FOLLOW_7); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_7, grammarAccess.getVSSSDocumentAccess().getRevisionKeyword_7());
              		
            }
            // InternalSSS.g:167:3: ( (lv_revision_8_0= RULE_UINT_STRING ) )
            // InternalSSS.g:168:4: (lv_revision_8_0= RULE_UINT_STRING )
            {
            // InternalSSS.g:168:4: (lv_revision_8_0= RULE_UINT_STRING )
            // InternalSSS.g:169:5: lv_revision_8_0= RULE_UINT_STRING
            {
            lv_revision_8_0=(Token)match(input,RULE_UINT_STRING,FollowSets000.FOLLOW_9); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_revision_8_0, grammarAccess.getVSSSDocumentAccess().getRevisionUINT_STRINGTerminalRuleCall_8_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getVSSSDocumentRule());
              					}
              					setWithLastConsumed(
              						current,
              						"revision",
              						lv_revision_8_0,
              						"es.uah.aut.srg.micobs.svm.lang.sss.SSS.UINT_STRING");
              				
            }

            }


            }

            otherlv_9=(Token)match(input,18,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_9, grammarAccess.getVSSSDocumentAccess().getDateKeyword_9());
              		
            }
            // InternalSSS.g:189:3: ( (lv_date_10_0= RULE_STRING ) )
            // InternalSSS.g:190:4: (lv_date_10_0= RULE_STRING )
            {
            // InternalSSS.g:190:4: (lv_date_10_0= RULE_STRING )
            // InternalSSS.g:191:5: lv_date_10_0= RULE_STRING
            {
            lv_date_10_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_10); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_date_10_0, grammarAccess.getVSSSDocumentAccess().getDateSTRINGTerminalRuleCall_10_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getVSSSDocumentRule());
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

              			newLeafNode(otherlv_11, grammarAccess.getVSSSDocumentAccess().getGreaterThanSignKeyword_11());
              		
            }
            // InternalSSS.g:211:3: ( (lv_introductionSection_12_0= ruleVSSSIntroduction ) )
            // InternalSSS.g:212:4: (lv_introductionSection_12_0= ruleVSSSIntroduction )
            {
            // InternalSSS.g:212:4: (lv_introductionSection_12_0= ruleVSSSIntroduction )
            // InternalSSS.g:213:5: lv_introductionSection_12_0= ruleVSSSIntroduction
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getVSSSDocumentAccess().getIntroductionSectionVSSSIntroductionParserRuleCall_12_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_12);
            lv_introductionSection_12_0=ruleVSSSIntroduction();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getVSSSDocumentRule());
              					}
              					set(
              						current,
              						"introductionSection",
              						lv_introductionSection_12_0,
              						"es.uah.aut.srg.micobs.svm.lang.sss.SSS.VSSSIntroduction");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalSSS.g:230:3: ( (lv_applicableDocumentsSection_13_0= ruleVSSSApplicableDocuments ) )
            // InternalSSS.g:231:4: (lv_applicableDocumentsSection_13_0= ruleVSSSApplicableDocuments )
            {
            // InternalSSS.g:231:4: (lv_applicableDocumentsSection_13_0= ruleVSSSApplicableDocuments )
            // InternalSSS.g:232:5: lv_applicableDocumentsSection_13_0= ruleVSSSApplicableDocuments
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getVSSSDocumentAccess().getApplicableDocumentsSectionVSSSApplicableDocumentsParserRuleCall_13_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_13);
            lv_applicableDocumentsSection_13_0=ruleVSSSApplicableDocuments();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getVSSSDocumentRule());
              					}
              					set(
              						current,
              						"applicableDocumentsSection",
              						lv_applicableDocumentsSection_13_0,
              						"es.uah.aut.srg.micobs.svm.lang.sss.SSS.VSSSApplicableDocuments");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalSSS.g:249:3: ( (lv_referenceDocumentsSection_14_0= ruleVSSSReferenceDocuments ) )
            // InternalSSS.g:250:4: (lv_referenceDocumentsSection_14_0= ruleVSSSReferenceDocuments )
            {
            // InternalSSS.g:250:4: (lv_referenceDocumentsSection_14_0= ruleVSSSReferenceDocuments )
            // InternalSSS.g:251:5: lv_referenceDocumentsSection_14_0= ruleVSSSReferenceDocuments
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getVSSSDocumentAccess().getReferenceDocumentsSectionVSSSReferenceDocumentsParserRuleCall_14_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_14);
            lv_referenceDocumentsSection_14_0=ruleVSSSReferenceDocuments();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getVSSSDocumentRule());
              					}
              					set(
              						current,
              						"referenceDocumentsSection",
              						lv_referenceDocumentsSection_14_0,
              						"es.uah.aut.srg.micobs.svm.lang.sss.SSS.VSSSReferenceDocuments");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalSSS.g:268:3: ( (lv_termsDefinitionsAbbreviationsSection_15_0= ruleVSSSTermsDefinitionsAbbreviations ) )
            // InternalSSS.g:269:4: (lv_termsDefinitionsAbbreviationsSection_15_0= ruleVSSSTermsDefinitionsAbbreviations )
            {
            // InternalSSS.g:269:4: (lv_termsDefinitionsAbbreviationsSection_15_0= ruleVSSSTermsDefinitionsAbbreviations )
            // InternalSSS.g:270:5: lv_termsDefinitionsAbbreviationsSection_15_0= ruleVSSSTermsDefinitionsAbbreviations
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getVSSSDocumentAccess().getTermsDefinitionsAbbreviationsSectionVSSSTermsDefinitionsAbbreviationsParserRuleCall_15_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_15);
            lv_termsDefinitionsAbbreviationsSection_15_0=ruleVSSSTermsDefinitionsAbbreviations();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getVSSSDocumentRule());
              					}
              					set(
              						current,
              						"termsDefinitionsAbbreviationsSection",
              						lv_termsDefinitionsAbbreviationsSection_15_0,
              						"es.uah.aut.srg.micobs.svm.lang.sss.SSS.VSSSTermsDefinitionsAbbreviations");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalSSS.g:287:3: ( (lv_generalDescriptionSection_16_0= ruleVSSSGeneralDescription ) )
            // InternalSSS.g:288:4: (lv_generalDescriptionSection_16_0= ruleVSSSGeneralDescription )
            {
            // InternalSSS.g:288:4: (lv_generalDescriptionSection_16_0= ruleVSSSGeneralDescription )
            // InternalSSS.g:289:5: lv_generalDescriptionSection_16_0= ruleVSSSGeneralDescription
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getVSSSDocumentAccess().getGeneralDescriptionSectionVSSSGeneralDescriptionParserRuleCall_16_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_16);
            lv_generalDescriptionSection_16_0=ruleVSSSGeneralDescription();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getVSSSDocumentRule());
              					}
              					set(
              						current,
              						"generalDescriptionSection",
              						lv_generalDescriptionSection_16_0,
              						"es.uah.aut.srg.micobs.svm.lang.sss.SSS.VSSSGeneralDescription");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalSSS.g:306:3: ( (lv_specificRequirementsSection_17_0= ruleVSSSSpecificRequirements ) )
            // InternalSSS.g:307:4: (lv_specificRequirementsSection_17_0= ruleVSSSSpecificRequirements )
            {
            // InternalSSS.g:307:4: (lv_specificRequirementsSection_17_0= ruleVSSSSpecificRequirements )
            // InternalSSS.g:308:5: lv_specificRequirementsSection_17_0= ruleVSSSSpecificRequirements
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getVSSSDocumentAccess().getSpecificRequirementsSectionVSSSSpecificRequirementsParserRuleCall_17_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_17);
            lv_specificRequirementsSection_17_0=ruleVSSSSpecificRequirements();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getVSSSDocumentRule());
              					}
              					set(
              						current,
              						"specificRequirementsSection",
              						lv_specificRequirementsSection_17_0,
              						"es.uah.aut.srg.micobs.svm.lang.sss.SSS.VSSSSpecificRequirements");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalSSS.g:325:3: ( (lv_verificationValidationIntegrationSection_18_0= ruleVSSSVerificationValidationIntegrationRequirements ) )
            // InternalSSS.g:326:4: (lv_verificationValidationIntegrationSection_18_0= ruleVSSSVerificationValidationIntegrationRequirements )
            {
            // InternalSSS.g:326:4: (lv_verificationValidationIntegrationSection_18_0= ruleVSSSVerificationValidationIntegrationRequirements )
            // InternalSSS.g:327:5: lv_verificationValidationIntegrationSection_18_0= ruleVSSSVerificationValidationIntegrationRequirements
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getVSSSDocumentAccess().getVerificationValidationIntegrationSectionVSSSVerificationValidationIntegrationRequirementsParserRuleCall_18_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_18);
            lv_verificationValidationIntegrationSection_18_0=ruleVSSSVerificationValidationIntegrationRequirements();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getVSSSDocumentRule());
              					}
              					set(
              						current,
              						"verificationValidationIntegrationSection",
              						lv_verificationValidationIntegrationSection_18_0,
              						"es.uah.aut.srg.micobs.svm.lang.sss.SSS.VSSSVerificationValidationIntegrationRequirements");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalSSS.g:344:3: ( (lv_systemModelsSection_19_0= ruleVSSSSystemModels ) )
            // InternalSSS.g:345:4: (lv_systemModelsSection_19_0= ruleVSSSSystemModels )
            {
            // InternalSSS.g:345:4: (lv_systemModelsSection_19_0= ruleVSSSSystemModels )
            // InternalSSS.g:346:5: lv_systemModelsSection_19_0= ruleVSSSSystemModels
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getVSSSDocumentAccess().getSystemModelsSectionVSSSSystemModelsParserRuleCall_19_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_19);
            lv_systemModelsSection_19_0=ruleVSSSSystemModels();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getVSSSDocumentRule());
              					}
              					set(
              						current,
              						"systemModelsSection",
              						lv_systemModelsSection_19_0,
              						"es.uah.aut.srg.micobs.svm.lang.sss.SSS.VSSSSystemModels");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_20=(Token)match(input,20,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_20, grammarAccess.getVSSSDocumentAccess().getSSSKeyword_20());
              		
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
    // $ANTLR end "ruleVSSSDocument"


    // $ANTLR start "entryRuleDBody"
    // InternalSSS.g:371:1: entryRuleDBody returns [EObject current=null] : iv_ruleDBody= ruleDBody EOF ;
    public final EObject entryRuleDBody() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDBody = null;


        try {
            // InternalSSS.g:371:46: (iv_ruleDBody= ruleDBody EOF )
            // InternalSSS.g:372:2: iv_ruleDBody= ruleDBody EOF
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
    // InternalSSS.g:378:1: ruleDBody returns [EObject current=null] : (otherlv_0= '<body>' ( (lv_bodyContent_1_0= ruleDBodyContent ) )+ otherlv_2= '</body>' ) ;
    public final EObject ruleDBody() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_bodyContent_1_0 = null;



        	enterRule();

        try {
            // InternalSSS.g:384:2: ( (otherlv_0= '<body>' ( (lv_bodyContent_1_0= ruleDBodyContent ) )+ otherlv_2= '</body>' ) )
            // InternalSSS.g:385:2: (otherlv_0= '<body>' ( (lv_bodyContent_1_0= ruleDBodyContent ) )+ otherlv_2= '</body>' )
            {
            // InternalSSS.g:385:2: (otherlv_0= '<body>' ( (lv_bodyContent_1_0= ruleDBodyContent ) )+ otherlv_2= '</body>' )
            // InternalSSS.g:386:3: otherlv_0= '<body>' ( (lv_bodyContent_1_0= ruleDBodyContent ) )+ otherlv_2= '</body>'
            {
            otherlv_0=(Token)match(input,21,FollowSets000.FOLLOW_20); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getDBodyAccess().getBodyKeyword_0());
              		
            }
            // InternalSSS.g:390:3: ( (lv_bodyContent_1_0= ruleDBodyContent ) )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==23||LA1_0==31||LA1_0==33||LA1_0==44||(LA1_0>=50 && LA1_0<=51)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalSSS.g:391:4: (lv_bodyContent_1_0= ruleDBodyContent )
            	    {
            	    // InternalSSS.g:391:4: (lv_bodyContent_1_0= ruleDBodyContent )
            	    // InternalSSS.g:392:5: lv_bodyContent_1_0= ruleDBodyContent
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getDBodyAccess().getBodyContentDBodyContentParserRuleCall_1_0());
            	      				
            	    }
            	    pushFollow(FollowSets000.FOLLOW_21);
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
            	      						"es.uah.aut.srg.micobs.svm.lang.sss.SSS.DBodyContent");
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

            otherlv_2=(Token)match(input,22,FollowSets000.FOLLOW_2); if (state.failed) return current;
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
    // InternalSSS.g:417:1: entryRuleDBodyContent returns [EObject current=null] : iv_ruleDBodyContent= ruleDBodyContent EOF ;
    public final EObject entryRuleDBodyContent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDBodyContent = null;


        try {
            // InternalSSS.g:417:53: (iv_ruleDBodyContent= ruleDBodyContent EOF )
            // InternalSSS.g:418:2: iv_ruleDBodyContent= ruleDBodyContent EOF
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
    // InternalSSS.g:424:1: ruleDBodyContent returns [EObject current=null] : (this_DParagraph_0= ruleDParagraph | this_DItemize_1= ruleDItemize | this_DEnumerate_2= ruleDEnumerate | this_DFigureFromFile_3= ruleDFigureFromFile | this_DTableFromFile_4= ruleDTableFromFile | this_DBasicTable_5= ruleDBasicTable ) ;
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
            // InternalSSS.g:430:2: ( (this_DParagraph_0= ruleDParagraph | this_DItemize_1= ruleDItemize | this_DEnumerate_2= ruleDEnumerate | this_DFigureFromFile_3= ruleDFigureFromFile | this_DTableFromFile_4= ruleDTableFromFile | this_DBasicTable_5= ruleDBasicTable ) )
            // InternalSSS.g:431:2: (this_DParagraph_0= ruleDParagraph | this_DItemize_1= ruleDItemize | this_DEnumerate_2= ruleDEnumerate | this_DFigureFromFile_3= ruleDFigureFromFile | this_DTableFromFile_4= ruleDTableFromFile | this_DBasicTable_5= ruleDBasicTable )
            {
            // InternalSSS.g:431:2: (this_DParagraph_0= ruleDParagraph | this_DItemize_1= ruleDItemize | this_DEnumerate_2= ruleDEnumerate | this_DFigureFromFile_3= ruleDFigureFromFile | this_DTableFromFile_4= ruleDTableFromFile | this_DBasicTable_5= ruleDBasicTable )
            int alt2=6;
            switch ( input.LA(1) ) {
            case 23:
                {
                alt2=1;
                }
                break;
            case 31:
                {
                alt2=2;
                }
                break;
            case 33:
                {
                alt2=3;
                }
                break;
            case 44:
                {
                alt2=4;
                }
                break;
            case 50:
                {
                alt2=5;
                }
                break;
            case 51:
                {
                alt2=6;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalSSS.g:432:3: this_DParagraph_0= ruleDParagraph
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
                    // InternalSSS.g:444:3: this_DItemize_1= ruleDItemize
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
                    // InternalSSS.g:456:3: this_DEnumerate_2= ruleDEnumerate
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
                    // InternalSSS.g:468:3: this_DFigureFromFile_3= ruleDFigureFromFile
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
                    // InternalSSS.g:480:3: this_DTableFromFile_4= ruleDTableFromFile
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
                    // InternalSSS.g:492:3: this_DBasicTable_5= ruleDBasicTable
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
    // InternalSSS.g:507:1: entryRuleDParagraph returns [EObject current=null] : iv_ruleDParagraph= ruleDParagraph EOF ;
    public final EObject entryRuleDParagraph() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDParagraph = null;


        try {
            // InternalSSS.g:507:51: (iv_ruleDParagraph= ruleDParagraph EOF )
            // InternalSSS.g:508:2: iv_ruleDParagraph= ruleDParagraph EOF
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
    // InternalSSS.g:514:1: ruleDParagraph returns [EObject current=null] : (otherlv_0= '<paragraph' (otherlv_1= 'style=' ( (lv_style_2_0= RULE_STRING ) ) )? (otherlv_3= 'alignment=' ( (lv_alignment_4_0= ruleDAlignment ) ) )? otherlv_5= '>' ( (lv_paragraphContent_6_0= ruleDParagraphContent ) )+ otherlv_7= '</paragraph>' ) ;
    public final EObject ruleDParagraph() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_style_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Enumerator lv_alignment_4_0 = null;

        EObject lv_paragraphContent_6_0 = null;



        	enterRule();

        try {
            // InternalSSS.g:520:2: ( (otherlv_0= '<paragraph' (otherlv_1= 'style=' ( (lv_style_2_0= RULE_STRING ) ) )? (otherlv_3= 'alignment=' ( (lv_alignment_4_0= ruleDAlignment ) ) )? otherlv_5= '>' ( (lv_paragraphContent_6_0= ruleDParagraphContent ) )+ otherlv_7= '</paragraph>' ) )
            // InternalSSS.g:521:2: (otherlv_0= '<paragraph' (otherlv_1= 'style=' ( (lv_style_2_0= RULE_STRING ) ) )? (otherlv_3= 'alignment=' ( (lv_alignment_4_0= ruleDAlignment ) ) )? otherlv_5= '>' ( (lv_paragraphContent_6_0= ruleDParagraphContent ) )+ otherlv_7= '</paragraph>' )
            {
            // InternalSSS.g:521:2: (otherlv_0= '<paragraph' (otherlv_1= 'style=' ( (lv_style_2_0= RULE_STRING ) ) )? (otherlv_3= 'alignment=' ( (lv_alignment_4_0= ruleDAlignment ) ) )? otherlv_5= '>' ( (lv_paragraphContent_6_0= ruleDParagraphContent ) )+ otherlv_7= '</paragraph>' )
            // InternalSSS.g:522:3: otherlv_0= '<paragraph' (otherlv_1= 'style=' ( (lv_style_2_0= RULE_STRING ) ) )? (otherlv_3= 'alignment=' ( (lv_alignment_4_0= ruleDAlignment ) ) )? otherlv_5= '>' ( (lv_paragraphContent_6_0= ruleDParagraphContent ) )+ otherlv_7= '</paragraph>'
            {
            otherlv_0=(Token)match(input,23,FollowSets000.FOLLOW_22); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getDParagraphAccess().getParagraphKeyword_0());
              		
            }
            // InternalSSS.g:526:3: (otherlv_1= 'style=' ( (lv_style_2_0= RULE_STRING ) ) )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==24) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalSSS.g:527:4: otherlv_1= 'style=' ( (lv_style_2_0= RULE_STRING ) )
                    {
                    otherlv_1=(Token)match(input,24,FollowSets000.FOLLOW_4); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_1, grammarAccess.getDParagraphAccess().getStyleKeyword_1_0());
                      			
                    }
                    // InternalSSS.g:531:4: ( (lv_style_2_0= RULE_STRING ) )
                    // InternalSSS.g:532:5: (lv_style_2_0= RULE_STRING )
                    {
                    // InternalSSS.g:532:5: (lv_style_2_0= RULE_STRING )
                    // InternalSSS.g:533:6: lv_style_2_0= RULE_STRING
                    {
                    lv_style_2_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_23); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_style_2_0, grammarAccess.getDParagraphAccess().getStyleSTRINGTerminalRuleCall_1_1_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getDParagraphRule());
                      						}
                      						setWithLastConsumed(
                      							current,
                      							"style",
                      							lv_style_2_0,
                      							"org.eclipse.xtext.common.Terminals.STRING");
                      					
                    }

                    }


                    }


                    }
                    break;

            }

            // InternalSSS.g:550:3: (otherlv_3= 'alignment=' ( (lv_alignment_4_0= ruleDAlignment ) ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==25) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalSSS.g:551:4: otherlv_3= 'alignment=' ( (lv_alignment_4_0= ruleDAlignment ) )
                    {
                    otherlv_3=(Token)match(input,25,FollowSets000.FOLLOW_24); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_3, grammarAccess.getDParagraphAccess().getAlignmentKeyword_2_0());
                      			
                    }
                    // InternalSSS.g:555:4: ( (lv_alignment_4_0= ruleDAlignment ) )
                    // InternalSSS.g:556:5: (lv_alignment_4_0= ruleDAlignment )
                    {
                    // InternalSSS.g:556:5: (lv_alignment_4_0= ruleDAlignment )
                    // InternalSSS.g:557:6: lv_alignment_4_0= ruleDAlignment
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getDParagraphAccess().getAlignmentDAlignmentEnumRuleCall_2_1_0());
                      					
                    }
                    pushFollow(FollowSets000.FOLLOW_10);
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
                      							"es.uah.aut.srg.micobs.svm.lang.sss.SSS.DAlignment");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,19,FollowSets000.FOLLOW_25); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getDParagraphAccess().getGreaterThanSignKeyword_3());
              		
            }
            // InternalSSS.g:579:3: ( (lv_paragraphContent_6_0= ruleDParagraphContent ) )+
            int cnt5=0;
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==35||LA5_0==40) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalSSS.g:580:4: (lv_paragraphContent_6_0= ruleDParagraphContent )
            	    {
            	    // InternalSSS.g:580:4: (lv_paragraphContent_6_0= ruleDParagraphContent )
            	    // InternalSSS.g:581:5: lv_paragraphContent_6_0= ruleDParagraphContent
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getDParagraphAccess().getParagraphContentDParagraphContentParserRuleCall_4_0());
            	      				
            	    }
            	    pushFollow(FollowSets000.FOLLOW_26);
            	    lv_paragraphContent_6_0=ruleDParagraphContent();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getDParagraphRule());
            	      					}
            	      					add(
            	      						current,
            	      						"paragraphContent",
            	      						lv_paragraphContent_6_0,
            	      						"es.uah.aut.srg.micobs.svm.lang.sss.SSS.DParagraphContent");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt5 >= 1 ) break loop5;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(5, input);
                        throw eee;
                }
                cnt5++;
            } while (true);

            otherlv_7=(Token)match(input,26,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_7, grammarAccess.getDParagraphAccess().getParagraphKeyword_5());
              		
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
    // InternalSSS.g:606:1: entryRuleDListItem returns [EObject current=null] : iv_ruleDListItem= ruleDListItem EOF ;
    public final EObject entryRuleDListItem() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDListItem = null;


        try {
            // InternalSSS.g:606:50: (iv_ruleDListItem= ruleDListItem EOF )
            // InternalSSS.g:607:2: iv_ruleDListItem= ruleDListItem EOF
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
    // InternalSSS.g:613:1: ruleDListItem returns [EObject current=null] : (otherlv_0= '<listItem>' ( (lv_paragraph_1_0= ruleDParagraph ) )+ (otherlv_2= '<sublist>' ( (lv_sublist_3_0= ruleDListContent ) ) otherlv_4= '</sublist>' )? otherlv_5= '</listItem>' ) ;
    public final EObject ruleDListItem() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        EObject lv_paragraph_1_0 = null;

        EObject lv_sublist_3_0 = null;



        	enterRule();

        try {
            // InternalSSS.g:619:2: ( (otherlv_0= '<listItem>' ( (lv_paragraph_1_0= ruleDParagraph ) )+ (otherlv_2= '<sublist>' ( (lv_sublist_3_0= ruleDListContent ) ) otherlv_4= '</sublist>' )? otherlv_5= '</listItem>' ) )
            // InternalSSS.g:620:2: (otherlv_0= '<listItem>' ( (lv_paragraph_1_0= ruleDParagraph ) )+ (otherlv_2= '<sublist>' ( (lv_sublist_3_0= ruleDListContent ) ) otherlv_4= '</sublist>' )? otherlv_5= '</listItem>' )
            {
            // InternalSSS.g:620:2: (otherlv_0= '<listItem>' ( (lv_paragraph_1_0= ruleDParagraph ) )+ (otherlv_2= '<sublist>' ( (lv_sublist_3_0= ruleDListContent ) ) otherlv_4= '</sublist>' )? otherlv_5= '</listItem>' )
            // InternalSSS.g:621:3: otherlv_0= '<listItem>' ( (lv_paragraph_1_0= ruleDParagraph ) )+ (otherlv_2= '<sublist>' ( (lv_sublist_3_0= ruleDListContent ) ) otherlv_4= '</sublist>' )? otherlv_5= '</listItem>'
            {
            otherlv_0=(Token)match(input,27,FollowSets000.FOLLOW_27); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getDListItemAccess().getListItemKeyword_0());
              		
            }
            // InternalSSS.g:625:3: ( (lv_paragraph_1_0= ruleDParagraph ) )+
            int cnt6=0;
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==23) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalSSS.g:626:4: (lv_paragraph_1_0= ruleDParagraph )
            	    {
            	    // InternalSSS.g:626:4: (lv_paragraph_1_0= ruleDParagraph )
            	    // InternalSSS.g:627:5: lv_paragraph_1_0= ruleDParagraph
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getDListItemAccess().getParagraphDParagraphParserRuleCall_1_0());
            	      				
            	    }
            	    pushFollow(FollowSets000.FOLLOW_28);
            	    lv_paragraph_1_0=ruleDParagraph();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getDListItemRule());
            	      					}
            	      					add(
            	      						current,
            	      						"paragraph",
            	      						lv_paragraph_1_0,
            	      						"es.uah.aut.srg.micobs.svm.lang.sss.SSS.DParagraph");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt6 >= 1 ) break loop6;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(6, input);
                        throw eee;
                }
                cnt6++;
            } while (true);

            // InternalSSS.g:644:3: (otherlv_2= '<sublist>' ( (lv_sublist_3_0= ruleDListContent ) ) otherlv_4= '</sublist>' )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==28) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalSSS.g:645:4: otherlv_2= '<sublist>' ( (lv_sublist_3_0= ruleDListContent ) ) otherlv_4= '</sublist>'
                    {
                    otherlv_2=(Token)match(input,28,FollowSets000.FOLLOW_29); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_2, grammarAccess.getDListItemAccess().getSublistKeyword_2_0());
                      			
                    }
                    // InternalSSS.g:649:4: ( (lv_sublist_3_0= ruleDListContent ) )
                    // InternalSSS.g:650:5: (lv_sublist_3_0= ruleDListContent )
                    {
                    // InternalSSS.g:650:5: (lv_sublist_3_0= ruleDListContent )
                    // InternalSSS.g:651:6: lv_sublist_3_0= ruleDListContent
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getDListItemAccess().getSublistDListContentParserRuleCall_2_1_0());
                      					
                    }
                    pushFollow(FollowSets000.FOLLOW_30);
                    lv_sublist_3_0=ruleDListContent();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getDListItemRule());
                      						}
                      						set(
                      							current,
                      							"sublist",
                      							lv_sublist_3_0,
                      							"es.uah.aut.srg.micobs.svm.lang.sss.SSS.DListContent");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    otherlv_4=(Token)match(input,29,FollowSets000.FOLLOW_31); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_4, grammarAccess.getDListItemAccess().getSublistKeyword_2_2());
                      			
                    }

                    }
                    break;

            }

            otherlv_5=(Token)match(input,30,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getDListItemAccess().getListItemKeyword_3());
              		
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
    // InternalSSS.g:681:1: entryRuleDListContent returns [EObject current=null] : iv_ruleDListContent= ruleDListContent EOF ;
    public final EObject entryRuleDListContent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDListContent = null;


        try {
            // InternalSSS.g:681:53: (iv_ruleDListContent= ruleDListContent EOF )
            // InternalSSS.g:682:2: iv_ruleDListContent= ruleDListContent EOF
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
    // InternalSSS.g:688:1: ruleDListContent returns [EObject current=null] : (this_DItemize_0= ruleDItemize | this_DEnumerate_1= ruleDEnumerate ) ;
    public final EObject ruleDListContent() throws RecognitionException {
        EObject current = null;

        EObject this_DItemize_0 = null;

        EObject this_DEnumerate_1 = null;



        	enterRule();

        try {
            // InternalSSS.g:694:2: ( (this_DItemize_0= ruleDItemize | this_DEnumerate_1= ruleDEnumerate ) )
            // InternalSSS.g:695:2: (this_DItemize_0= ruleDItemize | this_DEnumerate_1= ruleDEnumerate )
            {
            // InternalSSS.g:695:2: (this_DItemize_0= ruleDItemize | this_DEnumerate_1= ruleDEnumerate )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==31) ) {
                alt8=1;
            }
            else if ( (LA8_0==33) ) {
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
                    // InternalSSS.g:696:3: this_DItemize_0= ruleDItemize
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
                    // InternalSSS.g:708:3: this_DEnumerate_1= ruleDEnumerate
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
    // InternalSSS.g:723:1: entryRuleDItemize returns [EObject current=null] : iv_ruleDItemize= ruleDItemize EOF ;
    public final EObject entryRuleDItemize() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDItemize = null;


        try {
            // InternalSSS.g:723:49: (iv_ruleDItemize= ruleDItemize EOF )
            // InternalSSS.g:724:2: iv_ruleDItemize= ruleDItemize EOF
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
    // InternalSSS.g:730:1: ruleDItemize returns [EObject current=null] : (otherlv_0= '<itemize' (otherlv_1= 'alignment=' ( (lv_alignment_2_0= ruleDAlignment ) ) )? (otherlv_3= 'style=' ( (lv_style_4_0= RULE_STRING ) ) )? otherlv_5= '>' ( (lv_items_6_0= ruleDListItem ) )+ otherlv_7= '</itemize>' ) ;
    public final EObject ruleDItemize() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token lv_style_4_0=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Enumerator lv_alignment_2_0 = null;

        EObject lv_items_6_0 = null;



        	enterRule();

        try {
            // InternalSSS.g:736:2: ( (otherlv_0= '<itemize' (otherlv_1= 'alignment=' ( (lv_alignment_2_0= ruleDAlignment ) ) )? (otherlv_3= 'style=' ( (lv_style_4_0= RULE_STRING ) ) )? otherlv_5= '>' ( (lv_items_6_0= ruleDListItem ) )+ otherlv_7= '</itemize>' ) )
            // InternalSSS.g:737:2: (otherlv_0= '<itemize' (otherlv_1= 'alignment=' ( (lv_alignment_2_0= ruleDAlignment ) ) )? (otherlv_3= 'style=' ( (lv_style_4_0= RULE_STRING ) ) )? otherlv_5= '>' ( (lv_items_6_0= ruleDListItem ) )+ otherlv_7= '</itemize>' )
            {
            // InternalSSS.g:737:2: (otherlv_0= '<itemize' (otherlv_1= 'alignment=' ( (lv_alignment_2_0= ruleDAlignment ) ) )? (otherlv_3= 'style=' ( (lv_style_4_0= RULE_STRING ) ) )? otherlv_5= '>' ( (lv_items_6_0= ruleDListItem ) )+ otherlv_7= '</itemize>' )
            // InternalSSS.g:738:3: otherlv_0= '<itemize' (otherlv_1= 'alignment=' ( (lv_alignment_2_0= ruleDAlignment ) ) )? (otherlv_3= 'style=' ( (lv_style_4_0= RULE_STRING ) ) )? otherlv_5= '>' ( (lv_items_6_0= ruleDListItem ) )+ otherlv_7= '</itemize>'
            {
            otherlv_0=(Token)match(input,31,FollowSets000.FOLLOW_22); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getDItemizeAccess().getItemizeKeyword_0());
              		
            }
            // InternalSSS.g:742:3: (otherlv_1= 'alignment=' ( (lv_alignment_2_0= ruleDAlignment ) ) )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==25) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalSSS.g:743:4: otherlv_1= 'alignment=' ( (lv_alignment_2_0= ruleDAlignment ) )
                    {
                    otherlv_1=(Token)match(input,25,FollowSets000.FOLLOW_24); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_1, grammarAccess.getDItemizeAccess().getAlignmentKeyword_1_0());
                      			
                    }
                    // InternalSSS.g:747:4: ( (lv_alignment_2_0= ruleDAlignment ) )
                    // InternalSSS.g:748:5: (lv_alignment_2_0= ruleDAlignment )
                    {
                    // InternalSSS.g:748:5: (lv_alignment_2_0= ruleDAlignment )
                    // InternalSSS.g:749:6: lv_alignment_2_0= ruleDAlignment
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getDItemizeAccess().getAlignmentDAlignmentEnumRuleCall_1_1_0());
                      					
                    }
                    pushFollow(FollowSets000.FOLLOW_32);
                    lv_alignment_2_0=ruleDAlignment();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getDItemizeRule());
                      						}
                      						set(
                      							current,
                      							"alignment",
                      							lv_alignment_2_0,
                      							"es.uah.aut.srg.micobs.svm.lang.sss.SSS.DAlignment");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }
                    break;

            }

            // InternalSSS.g:767:3: (otherlv_3= 'style=' ( (lv_style_4_0= RULE_STRING ) ) )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==24) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalSSS.g:768:4: otherlv_3= 'style=' ( (lv_style_4_0= RULE_STRING ) )
                    {
                    otherlv_3=(Token)match(input,24,FollowSets000.FOLLOW_4); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_3, grammarAccess.getDItemizeAccess().getStyleKeyword_2_0());
                      			
                    }
                    // InternalSSS.g:772:4: ( (lv_style_4_0= RULE_STRING ) )
                    // InternalSSS.g:773:5: (lv_style_4_0= RULE_STRING )
                    {
                    // InternalSSS.g:773:5: (lv_style_4_0= RULE_STRING )
                    // InternalSSS.g:774:6: lv_style_4_0= RULE_STRING
                    {
                    lv_style_4_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_10); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_style_4_0, grammarAccess.getDItemizeAccess().getStyleSTRINGTerminalRuleCall_2_1_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getDItemizeRule());
                      						}
                      						setWithLastConsumed(
                      							current,
                      							"style",
                      							lv_style_4_0,
                      							"org.eclipse.xtext.common.Terminals.STRING");
                      					
                    }

                    }


                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,19,FollowSets000.FOLLOW_33); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getDItemizeAccess().getGreaterThanSignKeyword_3());
              		
            }
            // InternalSSS.g:795:3: ( (lv_items_6_0= ruleDListItem ) )+
            int cnt11=0;
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==27) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalSSS.g:796:4: (lv_items_6_0= ruleDListItem )
            	    {
            	    // InternalSSS.g:796:4: (lv_items_6_0= ruleDListItem )
            	    // InternalSSS.g:797:5: lv_items_6_0= ruleDListItem
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getDItemizeAccess().getItemsDListItemParserRuleCall_4_0());
            	      				
            	    }
            	    pushFollow(FollowSets000.FOLLOW_34);
            	    lv_items_6_0=ruleDListItem();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getDItemizeRule());
            	      					}
            	      					add(
            	      						current,
            	      						"items",
            	      						lv_items_6_0,
            	      						"es.uah.aut.srg.micobs.svm.lang.sss.SSS.DListItem");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt11 >= 1 ) break loop11;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(11, input);
                        throw eee;
                }
                cnt11++;
            } while (true);

            otherlv_7=(Token)match(input,32,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_7, grammarAccess.getDItemizeAccess().getItemizeKeyword_5());
              		
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
    // InternalSSS.g:822:1: entryRuleDEnumerate returns [EObject current=null] : iv_ruleDEnumerate= ruleDEnumerate EOF ;
    public final EObject entryRuleDEnumerate() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDEnumerate = null;


        try {
            // InternalSSS.g:822:51: (iv_ruleDEnumerate= ruleDEnumerate EOF )
            // InternalSSS.g:823:2: iv_ruleDEnumerate= ruleDEnumerate EOF
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
    // InternalSSS.g:829:1: ruleDEnumerate returns [EObject current=null] : (otherlv_0= '<enumerate' (otherlv_1= 'alignment=' ( (lv_alignment_2_0= ruleDAlignment ) ) )? (otherlv_3= 'style=' ( (lv_style_4_0= RULE_STRING ) ) )? otherlv_5= '>' ( (lv_items_6_0= ruleDListItem ) )+ otherlv_7= '</enumerate>' ) ;
    public final EObject ruleDEnumerate() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token lv_style_4_0=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Enumerator lv_alignment_2_0 = null;

        EObject lv_items_6_0 = null;



        	enterRule();

        try {
            // InternalSSS.g:835:2: ( (otherlv_0= '<enumerate' (otherlv_1= 'alignment=' ( (lv_alignment_2_0= ruleDAlignment ) ) )? (otherlv_3= 'style=' ( (lv_style_4_0= RULE_STRING ) ) )? otherlv_5= '>' ( (lv_items_6_0= ruleDListItem ) )+ otherlv_7= '</enumerate>' ) )
            // InternalSSS.g:836:2: (otherlv_0= '<enumerate' (otherlv_1= 'alignment=' ( (lv_alignment_2_0= ruleDAlignment ) ) )? (otherlv_3= 'style=' ( (lv_style_4_0= RULE_STRING ) ) )? otherlv_5= '>' ( (lv_items_6_0= ruleDListItem ) )+ otherlv_7= '</enumerate>' )
            {
            // InternalSSS.g:836:2: (otherlv_0= '<enumerate' (otherlv_1= 'alignment=' ( (lv_alignment_2_0= ruleDAlignment ) ) )? (otherlv_3= 'style=' ( (lv_style_4_0= RULE_STRING ) ) )? otherlv_5= '>' ( (lv_items_6_0= ruleDListItem ) )+ otherlv_7= '</enumerate>' )
            // InternalSSS.g:837:3: otherlv_0= '<enumerate' (otherlv_1= 'alignment=' ( (lv_alignment_2_0= ruleDAlignment ) ) )? (otherlv_3= 'style=' ( (lv_style_4_0= RULE_STRING ) ) )? otherlv_5= '>' ( (lv_items_6_0= ruleDListItem ) )+ otherlv_7= '</enumerate>'
            {
            otherlv_0=(Token)match(input,33,FollowSets000.FOLLOW_22); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getDEnumerateAccess().getEnumerateKeyword_0());
              		
            }
            // InternalSSS.g:841:3: (otherlv_1= 'alignment=' ( (lv_alignment_2_0= ruleDAlignment ) ) )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==25) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalSSS.g:842:4: otherlv_1= 'alignment=' ( (lv_alignment_2_0= ruleDAlignment ) )
                    {
                    otherlv_1=(Token)match(input,25,FollowSets000.FOLLOW_24); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_1, grammarAccess.getDEnumerateAccess().getAlignmentKeyword_1_0());
                      			
                    }
                    // InternalSSS.g:846:4: ( (lv_alignment_2_0= ruleDAlignment ) )
                    // InternalSSS.g:847:5: (lv_alignment_2_0= ruleDAlignment )
                    {
                    // InternalSSS.g:847:5: (lv_alignment_2_0= ruleDAlignment )
                    // InternalSSS.g:848:6: lv_alignment_2_0= ruleDAlignment
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getDEnumerateAccess().getAlignmentDAlignmentEnumRuleCall_1_1_0());
                      					
                    }
                    pushFollow(FollowSets000.FOLLOW_32);
                    lv_alignment_2_0=ruleDAlignment();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getDEnumerateRule());
                      						}
                      						set(
                      							current,
                      							"alignment",
                      							lv_alignment_2_0,
                      							"es.uah.aut.srg.micobs.svm.lang.sss.SSS.DAlignment");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }
                    break;

            }

            // InternalSSS.g:866:3: (otherlv_3= 'style=' ( (lv_style_4_0= RULE_STRING ) ) )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==24) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalSSS.g:867:4: otherlv_3= 'style=' ( (lv_style_4_0= RULE_STRING ) )
                    {
                    otherlv_3=(Token)match(input,24,FollowSets000.FOLLOW_4); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_3, grammarAccess.getDEnumerateAccess().getStyleKeyword_2_0());
                      			
                    }
                    // InternalSSS.g:871:4: ( (lv_style_4_0= RULE_STRING ) )
                    // InternalSSS.g:872:5: (lv_style_4_0= RULE_STRING )
                    {
                    // InternalSSS.g:872:5: (lv_style_4_0= RULE_STRING )
                    // InternalSSS.g:873:6: lv_style_4_0= RULE_STRING
                    {
                    lv_style_4_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_10); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_style_4_0, grammarAccess.getDEnumerateAccess().getStyleSTRINGTerminalRuleCall_2_1_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getDEnumerateRule());
                      						}
                      						setWithLastConsumed(
                      							current,
                      							"style",
                      							lv_style_4_0,
                      							"org.eclipse.xtext.common.Terminals.STRING");
                      					
                    }

                    }


                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,19,FollowSets000.FOLLOW_33); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getDEnumerateAccess().getGreaterThanSignKeyword_3());
              		
            }
            // InternalSSS.g:894:3: ( (lv_items_6_0= ruleDListItem ) )+
            int cnt14=0;
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==27) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalSSS.g:895:4: (lv_items_6_0= ruleDListItem )
            	    {
            	    // InternalSSS.g:895:4: (lv_items_6_0= ruleDListItem )
            	    // InternalSSS.g:896:5: lv_items_6_0= ruleDListItem
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getDEnumerateAccess().getItemsDListItemParserRuleCall_4_0());
            	      				
            	    }
            	    pushFollow(FollowSets000.FOLLOW_35);
            	    lv_items_6_0=ruleDListItem();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getDEnumerateRule());
            	      					}
            	      					add(
            	      						current,
            	      						"items",
            	      						lv_items_6_0,
            	      						"es.uah.aut.srg.micobs.svm.lang.sss.SSS.DListItem");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt14 >= 1 ) break loop14;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(14, input);
                        throw eee;
                }
                cnt14++;
            } while (true);

            otherlv_7=(Token)match(input,34,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_7, grammarAccess.getDEnumerateAccess().getEnumerateKeyword_5());
              		
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
    // InternalSSS.g:921:1: entryRuleDParagraphContent returns [EObject current=null] : iv_ruleDParagraphContent= ruleDParagraphContent EOF ;
    public final EObject entryRuleDParagraphContent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDParagraphContent = null;


        try {
            // InternalSSS.g:921:58: (iv_ruleDParagraphContent= ruleDParagraphContent EOF )
            // InternalSSS.g:922:2: iv_ruleDParagraphContent= ruleDParagraphContent EOF
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
    // InternalSSS.g:928:1: ruleDParagraphContent returns [EObject current=null] : (this_DRun_0= ruleDRun | this_DHyperlink_1= ruleDHyperlink ) ;
    public final EObject ruleDParagraphContent() throws RecognitionException {
        EObject current = null;

        EObject this_DRun_0 = null;

        EObject this_DHyperlink_1 = null;



        	enterRule();

        try {
            // InternalSSS.g:934:2: ( (this_DRun_0= ruleDRun | this_DHyperlink_1= ruleDHyperlink ) )
            // InternalSSS.g:935:2: (this_DRun_0= ruleDRun | this_DHyperlink_1= ruleDHyperlink )
            {
            // InternalSSS.g:935:2: (this_DRun_0= ruleDRun | this_DHyperlink_1= ruleDHyperlink )
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==35) ) {
                alt15=1;
            }
            else if ( (LA15_0==40) ) {
                alt15=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }
            switch (alt15) {
                case 1 :
                    // InternalSSS.g:936:3: this_DRun_0= ruleDRun
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
                    // InternalSSS.g:948:3: this_DHyperlink_1= ruleDHyperlink
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
    // InternalSSS.g:963:1: entryRuleDRun returns [EObject current=null] : iv_ruleDRun= ruleDRun EOF ;
    public final EObject entryRuleDRun() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDRun = null;


        try {
            // InternalSSS.g:963:45: (iv_ruleDRun= ruleDRun EOF )
            // InternalSSS.g:964:2: iv_ruleDRun= ruleDRun EOF
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
    // InternalSSS.g:970:1: ruleDRun returns [EObject current=null] : (otherlv_0= '<run' (otherlv_1= 'bold=\"true\"' )? (otherlv_2= 'italics=\"true\"' )? (otherlv_3= 'underline=\"true\"' )? otherlv_4= '>' ( (lv_tab_5_0= ruleDTab ) )? ( (lv_text_6_0= ruleDText ) ) otherlv_7= '</run>' ) ;
    public final EObject ruleDRun() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_7=null;
        EObject lv_tab_5_0 = null;

        EObject lv_text_6_0 = null;



        	enterRule();

        try {
            // InternalSSS.g:976:2: ( (otherlv_0= '<run' (otherlv_1= 'bold=\"true\"' )? (otherlv_2= 'italics=\"true\"' )? (otherlv_3= 'underline=\"true\"' )? otherlv_4= '>' ( (lv_tab_5_0= ruleDTab ) )? ( (lv_text_6_0= ruleDText ) ) otherlv_7= '</run>' ) )
            // InternalSSS.g:977:2: (otherlv_0= '<run' (otherlv_1= 'bold=\"true\"' )? (otherlv_2= 'italics=\"true\"' )? (otherlv_3= 'underline=\"true\"' )? otherlv_4= '>' ( (lv_tab_5_0= ruleDTab ) )? ( (lv_text_6_0= ruleDText ) ) otherlv_7= '</run>' )
            {
            // InternalSSS.g:977:2: (otherlv_0= '<run' (otherlv_1= 'bold=\"true\"' )? (otherlv_2= 'italics=\"true\"' )? (otherlv_3= 'underline=\"true\"' )? otherlv_4= '>' ( (lv_tab_5_0= ruleDTab ) )? ( (lv_text_6_0= ruleDText ) ) otherlv_7= '</run>' )
            // InternalSSS.g:978:3: otherlv_0= '<run' (otherlv_1= 'bold=\"true\"' )? (otherlv_2= 'italics=\"true\"' )? (otherlv_3= 'underline=\"true\"' )? otherlv_4= '>' ( (lv_tab_5_0= ruleDTab ) )? ( (lv_text_6_0= ruleDText ) ) otherlv_7= '</run>'
            {
            otherlv_0=(Token)match(input,35,FollowSets000.FOLLOW_36); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getDRunAccess().getRunKeyword_0());
              		
            }
            // InternalSSS.g:982:3: (otherlv_1= 'bold=\"true\"' )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==36) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalSSS.g:983:4: otherlv_1= 'bold=\"true\"'
                    {
                    otherlv_1=(Token)match(input,36,FollowSets000.FOLLOW_37); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_1, grammarAccess.getDRunAccess().getBoldTrueKeyword_1());
                      			
                    }

                    }
                    break;

            }

            // InternalSSS.g:988:3: (otherlv_2= 'italics=\"true\"' )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==37) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalSSS.g:989:4: otherlv_2= 'italics=\"true\"'
                    {
                    otherlv_2=(Token)match(input,37,FollowSets000.FOLLOW_38); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_2, grammarAccess.getDRunAccess().getItalicsTrueKeyword_2());
                      			
                    }

                    }
                    break;

            }

            // InternalSSS.g:994:3: (otherlv_3= 'underline=\"true\"' )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==38) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalSSS.g:995:4: otherlv_3= 'underline=\"true\"'
                    {
                    otherlv_3=(Token)match(input,38,FollowSets000.FOLLOW_10); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_3, grammarAccess.getDRunAccess().getUnderlineTrueKeyword_3());
                      			
                    }

                    }
                    break;

            }

            otherlv_4=(Token)match(input,19,FollowSets000.FOLLOW_39); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getDRunAccess().getGreaterThanSignKeyword_4());
              		
            }
            // InternalSSS.g:1004:3: ( (lv_tab_5_0= ruleDTab ) )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==43) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalSSS.g:1005:4: (lv_tab_5_0= ruleDTab )
                    {
                    // InternalSSS.g:1005:4: (lv_tab_5_0= ruleDTab )
                    // InternalSSS.g:1006:5: lv_tab_5_0= ruleDTab
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getDRunAccess().getTabDTabParserRuleCall_5_0());
                      				
                    }
                    pushFollow(FollowSets000.FOLLOW_39);
                    lv_tab_5_0=ruleDTab();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getDRunRule());
                      					}
                      					set(
                      						current,
                      						"tab",
                      						lv_tab_5_0,
                      						"es.uah.aut.srg.micobs.svm.lang.sss.SSS.DTab");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }
                    break;

            }

            // InternalSSS.g:1023:3: ( (lv_text_6_0= ruleDText ) )
            // InternalSSS.g:1024:4: (lv_text_6_0= ruleDText )
            {
            // InternalSSS.g:1024:4: (lv_text_6_0= ruleDText )
            // InternalSSS.g:1025:5: lv_text_6_0= ruleDText
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getDRunAccess().getTextDTextParserRuleCall_6_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_40);
            lv_text_6_0=ruleDText();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getDRunRule());
              					}
              					set(
              						current,
              						"text",
              						lv_text_6_0,
              						"es.uah.aut.srg.micobs.svm.lang.sss.SSS.DText");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_7=(Token)match(input,39,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_7, grammarAccess.getDRunAccess().getRunKeyword_7());
              		
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
    // InternalSSS.g:1050:1: entryRuleDHyperlink returns [EObject current=null] : iv_ruleDHyperlink= ruleDHyperlink EOF ;
    public final EObject entryRuleDHyperlink() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDHyperlink = null;


        try {
            // InternalSSS.g:1050:51: (iv_ruleDHyperlink= ruleDHyperlink EOF )
            // InternalSSS.g:1051:2: iv_ruleDHyperlink= ruleDHyperlink EOF
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
    // InternalSSS.g:1057:1: ruleDHyperlink returns [EObject current=null] : (otherlv_0= '<hyperlink' otherlv_1= 'reference=' ( (otherlv_2= RULE_STRING ) ) otherlv_3= '>' ( (lv_run_4_0= ruleDRun ) )? otherlv_5= '</hyperlink>' ) ;
    public final EObject ruleDHyperlink() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_run_4_0 = null;



        	enterRule();

        try {
            // InternalSSS.g:1063:2: ( (otherlv_0= '<hyperlink' otherlv_1= 'reference=' ( (otherlv_2= RULE_STRING ) ) otherlv_3= '>' ( (lv_run_4_0= ruleDRun ) )? otherlv_5= '</hyperlink>' ) )
            // InternalSSS.g:1064:2: (otherlv_0= '<hyperlink' otherlv_1= 'reference=' ( (otherlv_2= RULE_STRING ) ) otherlv_3= '>' ( (lv_run_4_0= ruleDRun ) )? otherlv_5= '</hyperlink>' )
            {
            // InternalSSS.g:1064:2: (otherlv_0= '<hyperlink' otherlv_1= 'reference=' ( (otherlv_2= RULE_STRING ) ) otherlv_3= '>' ( (lv_run_4_0= ruleDRun ) )? otherlv_5= '</hyperlink>' )
            // InternalSSS.g:1065:3: otherlv_0= '<hyperlink' otherlv_1= 'reference=' ( (otherlv_2= RULE_STRING ) ) otherlv_3= '>' ( (lv_run_4_0= ruleDRun ) )? otherlv_5= '</hyperlink>'
            {
            otherlv_0=(Token)match(input,40,FollowSets000.FOLLOW_41); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getDHyperlinkAccess().getHyperlinkKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,41,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getDHyperlinkAccess().getReferenceKeyword_1());
              		
            }
            // InternalSSS.g:1073:3: ( (otherlv_2= RULE_STRING ) )
            // InternalSSS.g:1074:4: (otherlv_2= RULE_STRING )
            {
            // InternalSSS.g:1074:4: (otherlv_2= RULE_STRING )
            // InternalSSS.g:1075:5: otherlv_2= RULE_STRING
            {
            if ( state.backtracking==0 ) {

              					/* */
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getDHyperlinkRule());
              					}
              				
            }
            otherlv_2=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_10); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(otherlv_2, grammarAccess.getDHyperlinkAccess().getReferenceDReferenceableObjectCrossReference_2_0());
              				
            }

            }


            }

            otherlv_3=(Token)match(input,19,FollowSets000.FOLLOW_42); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getDHyperlinkAccess().getGreaterThanSignKeyword_3());
              		
            }
            // InternalSSS.g:1093:3: ( (lv_run_4_0= ruleDRun ) )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==35) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalSSS.g:1094:4: (lv_run_4_0= ruleDRun )
                    {
                    // InternalSSS.g:1094:4: (lv_run_4_0= ruleDRun )
                    // InternalSSS.g:1095:5: lv_run_4_0= ruleDRun
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getDHyperlinkAccess().getRunDRunParserRuleCall_4_0());
                      				
                    }
                    pushFollow(FollowSets000.FOLLOW_43);
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
                      						"es.uah.aut.srg.micobs.svm.lang.sss.SSS.DRun");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,42,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getDHyperlinkAccess().getHyperlinkKeyword_5());
              		
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
    // InternalSSS.g:1120:1: entryRuleDTab returns [EObject current=null] : iv_ruleDTab= ruleDTab EOF ;
    public final EObject entryRuleDTab() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDTab = null;


        try {
            // InternalSSS.g:1120:45: (iv_ruleDTab= ruleDTab EOF )
            // InternalSSS.g:1121:2: iv_ruleDTab= ruleDTab EOF
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
    // InternalSSS.g:1127:1: ruleDTab returns [EObject current=null] : ( () otherlv_1= '<tab/>' ) ;
    public final EObject ruleDTab() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalSSS.g:1133:2: ( ( () otherlv_1= '<tab/>' ) )
            // InternalSSS.g:1134:2: ( () otherlv_1= '<tab/>' )
            {
            // InternalSSS.g:1134:2: ( () otherlv_1= '<tab/>' )
            // InternalSSS.g:1135:3: () otherlv_1= '<tab/>'
            {
            // InternalSSS.g:1135:3: ()
            // InternalSSS.g:1136:4: 
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

            otherlv_1=(Token)match(input,43,FollowSets000.FOLLOW_2); if (state.failed) return current;
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
    // InternalSSS.g:1153:1: entryRuleDText returns [EObject current=null] : iv_ruleDText= ruleDText EOF ;
    public final EObject entryRuleDText() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDText = null;


        try {
            // InternalSSS.g:1153:46: (iv_ruleDText= ruleDText EOF )
            // InternalSSS.g:1154:2: iv_ruleDText= ruleDText EOF
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
    // InternalSSS.g:1160:1: ruleDText returns [EObject current=null] : ( (lv_content_0_0= RULE_RUNTEXT ) ) ;
    public final EObject ruleDText() throws RecognitionException {
        EObject current = null;

        Token lv_content_0_0=null;


        	enterRule();

        try {
            // InternalSSS.g:1166:2: ( ( (lv_content_0_0= RULE_RUNTEXT ) ) )
            // InternalSSS.g:1167:2: ( (lv_content_0_0= RULE_RUNTEXT ) )
            {
            // InternalSSS.g:1167:2: ( (lv_content_0_0= RULE_RUNTEXT ) )
            // InternalSSS.g:1168:3: (lv_content_0_0= RULE_RUNTEXT )
            {
            // InternalSSS.g:1168:3: (lv_content_0_0= RULE_RUNTEXT )
            // InternalSSS.g:1169:4: lv_content_0_0= RULE_RUNTEXT
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
              					"es.uah.aut.srg.micobs.svm.lang.sss.SSS.RUNTEXT");
              			
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
    // InternalSSS.g:1188:1: entryRuleDFigureFromFile returns [EObject current=null] : iv_ruleDFigureFromFile= ruleDFigureFromFile EOF ;
    public final EObject entryRuleDFigureFromFile() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDFigureFromFile = null;


        try {
            // InternalSSS.g:1188:56: (iv_ruleDFigureFromFile= ruleDFigureFromFile EOF )
            // InternalSSS.g:1189:2: iv_ruleDFigureFromFile= ruleDFigureFromFile EOF
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
    // InternalSSS.g:1195:1: ruleDFigureFromFile returns [EObject current=null] : (otherlv_0= '<figureFromFile' otherlv_1= 'name=' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= 'referenceFile=' ( (lv_referenceFile_4_0= RULE_STRING ) ) otherlv_5= 'width=' ( (lv_width_6_0= RULE_UINT_STRING ) ) otherlv_7= 'height=' ( (lv_height_8_0= RULE_UINT_STRING ) ) (otherlv_9= 'alignment=' ( (lv_alignment_10_0= ruleDAlignment ) ) )? (otherlv_11= 'style=' ( (lv_style_12_0= RULE_STRING ) ) )? (otherlv_13= 'caption=' ( (lv_caption_14_0= RULE_STRING ) ) )? otherlv_15= '/>' ) ;
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
        Token lv_caption_14_0=null;
        Token otherlv_15=null;
        Enumerator lv_alignment_10_0 = null;



        	enterRule();

        try {
            // InternalSSS.g:1201:2: ( (otherlv_0= '<figureFromFile' otherlv_1= 'name=' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= 'referenceFile=' ( (lv_referenceFile_4_0= RULE_STRING ) ) otherlv_5= 'width=' ( (lv_width_6_0= RULE_UINT_STRING ) ) otherlv_7= 'height=' ( (lv_height_8_0= RULE_UINT_STRING ) ) (otherlv_9= 'alignment=' ( (lv_alignment_10_0= ruleDAlignment ) ) )? (otherlv_11= 'style=' ( (lv_style_12_0= RULE_STRING ) ) )? (otherlv_13= 'caption=' ( (lv_caption_14_0= RULE_STRING ) ) )? otherlv_15= '/>' ) )
            // InternalSSS.g:1202:2: (otherlv_0= '<figureFromFile' otherlv_1= 'name=' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= 'referenceFile=' ( (lv_referenceFile_4_0= RULE_STRING ) ) otherlv_5= 'width=' ( (lv_width_6_0= RULE_UINT_STRING ) ) otherlv_7= 'height=' ( (lv_height_8_0= RULE_UINT_STRING ) ) (otherlv_9= 'alignment=' ( (lv_alignment_10_0= ruleDAlignment ) ) )? (otherlv_11= 'style=' ( (lv_style_12_0= RULE_STRING ) ) )? (otherlv_13= 'caption=' ( (lv_caption_14_0= RULE_STRING ) ) )? otherlv_15= '/>' )
            {
            // InternalSSS.g:1202:2: (otherlv_0= '<figureFromFile' otherlv_1= 'name=' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= 'referenceFile=' ( (lv_referenceFile_4_0= RULE_STRING ) ) otherlv_5= 'width=' ( (lv_width_6_0= RULE_UINT_STRING ) ) otherlv_7= 'height=' ( (lv_height_8_0= RULE_UINT_STRING ) ) (otherlv_9= 'alignment=' ( (lv_alignment_10_0= ruleDAlignment ) ) )? (otherlv_11= 'style=' ( (lv_style_12_0= RULE_STRING ) ) )? (otherlv_13= 'caption=' ( (lv_caption_14_0= RULE_STRING ) ) )? otherlv_15= '/>' )
            // InternalSSS.g:1203:3: otherlv_0= '<figureFromFile' otherlv_1= 'name=' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= 'referenceFile=' ( (lv_referenceFile_4_0= RULE_STRING ) ) otherlv_5= 'width=' ( (lv_width_6_0= RULE_UINT_STRING ) ) otherlv_7= 'height=' ( (lv_height_8_0= RULE_UINT_STRING ) ) (otherlv_9= 'alignment=' ( (lv_alignment_10_0= ruleDAlignment ) ) )? (otherlv_11= 'style=' ( (lv_style_12_0= RULE_STRING ) ) )? (otherlv_13= 'caption=' ( (lv_caption_14_0= RULE_STRING ) ) )? otherlv_15= '/>'
            {
            otherlv_0=(Token)match(input,44,FollowSets000.FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getDFigureFromFileAccess().getFigureFromFileKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,14,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getDFigureFromFileAccess().getNameKeyword_1());
              		
            }
            // InternalSSS.g:1211:3: ( (lv_name_2_0= RULE_STRING ) )
            // InternalSSS.g:1212:4: (lv_name_2_0= RULE_STRING )
            {
            // InternalSSS.g:1212:4: (lv_name_2_0= RULE_STRING )
            // InternalSSS.g:1213:5: lv_name_2_0= RULE_STRING
            {
            lv_name_2_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_44); if (state.failed) return current;
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

            otherlv_3=(Token)match(input,45,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getDFigureFromFileAccess().getReferenceFileKeyword_3());
              		
            }
            // InternalSSS.g:1233:3: ( (lv_referenceFile_4_0= RULE_STRING ) )
            // InternalSSS.g:1234:4: (lv_referenceFile_4_0= RULE_STRING )
            {
            // InternalSSS.g:1234:4: (lv_referenceFile_4_0= RULE_STRING )
            // InternalSSS.g:1235:5: lv_referenceFile_4_0= RULE_STRING
            {
            lv_referenceFile_4_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_45); if (state.failed) return current;
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

            otherlv_5=(Token)match(input,46,FollowSets000.FOLLOW_7); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getDFigureFromFileAccess().getWidthKeyword_5());
              		
            }
            // InternalSSS.g:1255:3: ( (lv_width_6_0= RULE_UINT_STRING ) )
            // InternalSSS.g:1256:4: (lv_width_6_0= RULE_UINT_STRING )
            {
            // InternalSSS.g:1256:4: (lv_width_6_0= RULE_UINT_STRING )
            // InternalSSS.g:1257:5: lv_width_6_0= RULE_UINT_STRING
            {
            lv_width_6_0=(Token)match(input,RULE_UINT_STRING,FollowSets000.FOLLOW_46); if (state.failed) return current;
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
              						"es.uah.aut.srg.micobs.svm.lang.sss.SSS.UINT_STRING");
              				
            }

            }


            }

            otherlv_7=(Token)match(input,47,FollowSets000.FOLLOW_7); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_7, grammarAccess.getDFigureFromFileAccess().getHeightKeyword_7());
              		
            }
            // InternalSSS.g:1277:3: ( (lv_height_8_0= RULE_UINT_STRING ) )
            // InternalSSS.g:1278:4: (lv_height_8_0= RULE_UINT_STRING )
            {
            // InternalSSS.g:1278:4: (lv_height_8_0= RULE_UINT_STRING )
            // InternalSSS.g:1279:5: lv_height_8_0= RULE_UINT_STRING
            {
            lv_height_8_0=(Token)match(input,RULE_UINT_STRING,FollowSets000.FOLLOW_47); if (state.failed) return current;
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
              						"es.uah.aut.srg.micobs.svm.lang.sss.SSS.UINT_STRING");
              				
            }

            }


            }

            // InternalSSS.g:1295:3: (otherlv_9= 'alignment=' ( (lv_alignment_10_0= ruleDAlignment ) ) )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==25) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalSSS.g:1296:4: otherlv_9= 'alignment=' ( (lv_alignment_10_0= ruleDAlignment ) )
                    {
                    otherlv_9=(Token)match(input,25,FollowSets000.FOLLOW_24); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_9, grammarAccess.getDFigureFromFileAccess().getAlignmentKeyword_9_0());
                      			
                    }
                    // InternalSSS.g:1300:4: ( (lv_alignment_10_0= ruleDAlignment ) )
                    // InternalSSS.g:1301:5: (lv_alignment_10_0= ruleDAlignment )
                    {
                    // InternalSSS.g:1301:5: (lv_alignment_10_0= ruleDAlignment )
                    // InternalSSS.g:1302:6: lv_alignment_10_0= ruleDAlignment
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getDFigureFromFileAccess().getAlignmentDAlignmentEnumRuleCall_9_1_0());
                      					
                    }
                    pushFollow(FollowSets000.FOLLOW_48);
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
                      							"es.uah.aut.srg.micobs.svm.lang.sss.SSS.DAlignment");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }
                    break;

            }

            // InternalSSS.g:1320:3: (otherlv_11= 'style=' ( (lv_style_12_0= RULE_STRING ) ) )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==24) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalSSS.g:1321:4: otherlv_11= 'style=' ( (lv_style_12_0= RULE_STRING ) )
                    {
                    otherlv_11=(Token)match(input,24,FollowSets000.FOLLOW_4); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_11, grammarAccess.getDFigureFromFileAccess().getStyleKeyword_10_0());
                      			
                    }
                    // InternalSSS.g:1325:4: ( (lv_style_12_0= RULE_STRING ) )
                    // InternalSSS.g:1326:5: (lv_style_12_0= RULE_STRING )
                    {
                    // InternalSSS.g:1326:5: (lv_style_12_0= RULE_STRING )
                    // InternalSSS.g:1327:6: lv_style_12_0= RULE_STRING
                    {
                    lv_style_12_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_49); if (state.failed) return current;
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

            // InternalSSS.g:1344:3: (otherlv_13= 'caption=' ( (lv_caption_14_0= RULE_STRING ) ) )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==48) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalSSS.g:1345:4: otherlv_13= 'caption=' ( (lv_caption_14_0= RULE_STRING ) )
                    {
                    otherlv_13=(Token)match(input,48,FollowSets000.FOLLOW_4); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_13, grammarAccess.getDFigureFromFileAccess().getCaptionKeyword_11_0());
                      			
                    }
                    // InternalSSS.g:1349:4: ( (lv_caption_14_0= RULE_STRING ) )
                    // InternalSSS.g:1350:5: (lv_caption_14_0= RULE_STRING )
                    {
                    // InternalSSS.g:1350:5: (lv_caption_14_0= RULE_STRING )
                    // InternalSSS.g:1351:6: lv_caption_14_0= RULE_STRING
                    {
                    lv_caption_14_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_50); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_caption_14_0, grammarAccess.getDFigureFromFileAccess().getCaptionSTRINGTerminalRuleCall_11_1_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getDFigureFromFileRule());
                      						}
                      						setWithLastConsumed(
                      							current,
                      							"caption",
                      							lv_caption_14_0,
                      							"org.eclipse.xtext.common.Terminals.STRING");
                      					
                    }

                    }


                    }


                    }
                    break;

            }

            otherlv_15=(Token)match(input,49,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_15, grammarAccess.getDFigureFromFileAccess().getSolidusGreaterThanSignKeyword_12());
              		
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
    // InternalSSS.g:1376:1: entryRuleDTableFromFile returns [EObject current=null] : iv_ruleDTableFromFile= ruleDTableFromFile EOF ;
    public final EObject entryRuleDTableFromFile() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDTableFromFile = null;


        try {
            // InternalSSS.g:1376:55: (iv_ruleDTableFromFile= ruleDTableFromFile EOF )
            // InternalSSS.g:1377:2: iv_ruleDTableFromFile= ruleDTableFromFile EOF
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
    // InternalSSS.g:1383:1: ruleDTableFromFile returns [EObject current=null] : (otherlv_0= '<tableFromFile' otherlv_1= 'name=' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= 'referenceFile=' ( (lv_referenceFile_4_0= RULE_STRING ) ) otherlv_5= 'width=' ( (lv_width_6_0= RULE_UINT_STRING ) ) otherlv_7= 'height=' ( (lv_height_8_0= RULE_UINT_STRING ) ) (otherlv_9= 'alignment=' ( (lv_alignment_10_0= ruleDAlignment ) ) )? (otherlv_11= 'style=' ( (lv_style_12_0= RULE_STRING ) ) )? (otherlv_13= 'caption=' ( (lv_caption_14_0= RULE_STRING ) ) )? otherlv_15= '/>' ) ;
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
        Token lv_caption_14_0=null;
        Token otherlv_15=null;
        Enumerator lv_alignment_10_0 = null;



        	enterRule();

        try {
            // InternalSSS.g:1389:2: ( (otherlv_0= '<tableFromFile' otherlv_1= 'name=' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= 'referenceFile=' ( (lv_referenceFile_4_0= RULE_STRING ) ) otherlv_5= 'width=' ( (lv_width_6_0= RULE_UINT_STRING ) ) otherlv_7= 'height=' ( (lv_height_8_0= RULE_UINT_STRING ) ) (otherlv_9= 'alignment=' ( (lv_alignment_10_0= ruleDAlignment ) ) )? (otherlv_11= 'style=' ( (lv_style_12_0= RULE_STRING ) ) )? (otherlv_13= 'caption=' ( (lv_caption_14_0= RULE_STRING ) ) )? otherlv_15= '/>' ) )
            // InternalSSS.g:1390:2: (otherlv_0= '<tableFromFile' otherlv_1= 'name=' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= 'referenceFile=' ( (lv_referenceFile_4_0= RULE_STRING ) ) otherlv_5= 'width=' ( (lv_width_6_0= RULE_UINT_STRING ) ) otherlv_7= 'height=' ( (lv_height_8_0= RULE_UINT_STRING ) ) (otherlv_9= 'alignment=' ( (lv_alignment_10_0= ruleDAlignment ) ) )? (otherlv_11= 'style=' ( (lv_style_12_0= RULE_STRING ) ) )? (otherlv_13= 'caption=' ( (lv_caption_14_0= RULE_STRING ) ) )? otherlv_15= '/>' )
            {
            // InternalSSS.g:1390:2: (otherlv_0= '<tableFromFile' otherlv_1= 'name=' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= 'referenceFile=' ( (lv_referenceFile_4_0= RULE_STRING ) ) otherlv_5= 'width=' ( (lv_width_6_0= RULE_UINT_STRING ) ) otherlv_7= 'height=' ( (lv_height_8_0= RULE_UINT_STRING ) ) (otherlv_9= 'alignment=' ( (lv_alignment_10_0= ruleDAlignment ) ) )? (otherlv_11= 'style=' ( (lv_style_12_0= RULE_STRING ) ) )? (otherlv_13= 'caption=' ( (lv_caption_14_0= RULE_STRING ) ) )? otherlv_15= '/>' )
            // InternalSSS.g:1391:3: otherlv_0= '<tableFromFile' otherlv_1= 'name=' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= 'referenceFile=' ( (lv_referenceFile_4_0= RULE_STRING ) ) otherlv_5= 'width=' ( (lv_width_6_0= RULE_UINT_STRING ) ) otherlv_7= 'height=' ( (lv_height_8_0= RULE_UINT_STRING ) ) (otherlv_9= 'alignment=' ( (lv_alignment_10_0= ruleDAlignment ) ) )? (otherlv_11= 'style=' ( (lv_style_12_0= RULE_STRING ) ) )? (otherlv_13= 'caption=' ( (lv_caption_14_0= RULE_STRING ) ) )? otherlv_15= '/>'
            {
            otherlv_0=(Token)match(input,50,FollowSets000.FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getDTableFromFileAccess().getTableFromFileKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,14,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getDTableFromFileAccess().getNameKeyword_1());
              		
            }
            // InternalSSS.g:1399:3: ( (lv_name_2_0= RULE_STRING ) )
            // InternalSSS.g:1400:4: (lv_name_2_0= RULE_STRING )
            {
            // InternalSSS.g:1400:4: (lv_name_2_0= RULE_STRING )
            // InternalSSS.g:1401:5: lv_name_2_0= RULE_STRING
            {
            lv_name_2_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_44); if (state.failed) return current;
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

            otherlv_3=(Token)match(input,45,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getDTableFromFileAccess().getReferenceFileKeyword_3());
              		
            }
            // InternalSSS.g:1421:3: ( (lv_referenceFile_4_0= RULE_STRING ) )
            // InternalSSS.g:1422:4: (lv_referenceFile_4_0= RULE_STRING )
            {
            // InternalSSS.g:1422:4: (lv_referenceFile_4_0= RULE_STRING )
            // InternalSSS.g:1423:5: lv_referenceFile_4_0= RULE_STRING
            {
            lv_referenceFile_4_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_45); if (state.failed) return current;
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

            otherlv_5=(Token)match(input,46,FollowSets000.FOLLOW_7); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getDTableFromFileAccess().getWidthKeyword_5());
              		
            }
            // InternalSSS.g:1443:3: ( (lv_width_6_0= RULE_UINT_STRING ) )
            // InternalSSS.g:1444:4: (lv_width_6_0= RULE_UINT_STRING )
            {
            // InternalSSS.g:1444:4: (lv_width_6_0= RULE_UINT_STRING )
            // InternalSSS.g:1445:5: lv_width_6_0= RULE_UINT_STRING
            {
            lv_width_6_0=(Token)match(input,RULE_UINT_STRING,FollowSets000.FOLLOW_46); if (state.failed) return current;
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
              						"es.uah.aut.srg.micobs.svm.lang.sss.SSS.UINT_STRING");
              				
            }

            }


            }

            otherlv_7=(Token)match(input,47,FollowSets000.FOLLOW_7); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_7, grammarAccess.getDTableFromFileAccess().getHeightKeyword_7());
              		
            }
            // InternalSSS.g:1465:3: ( (lv_height_8_0= RULE_UINT_STRING ) )
            // InternalSSS.g:1466:4: (lv_height_8_0= RULE_UINT_STRING )
            {
            // InternalSSS.g:1466:4: (lv_height_8_0= RULE_UINT_STRING )
            // InternalSSS.g:1467:5: lv_height_8_0= RULE_UINT_STRING
            {
            lv_height_8_0=(Token)match(input,RULE_UINT_STRING,FollowSets000.FOLLOW_47); if (state.failed) return current;
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
              						"es.uah.aut.srg.micobs.svm.lang.sss.SSS.UINT_STRING");
              				
            }

            }


            }

            // InternalSSS.g:1483:3: (otherlv_9= 'alignment=' ( (lv_alignment_10_0= ruleDAlignment ) ) )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==25) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalSSS.g:1484:4: otherlv_9= 'alignment=' ( (lv_alignment_10_0= ruleDAlignment ) )
                    {
                    otherlv_9=(Token)match(input,25,FollowSets000.FOLLOW_24); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_9, grammarAccess.getDTableFromFileAccess().getAlignmentKeyword_9_0());
                      			
                    }
                    // InternalSSS.g:1488:4: ( (lv_alignment_10_0= ruleDAlignment ) )
                    // InternalSSS.g:1489:5: (lv_alignment_10_0= ruleDAlignment )
                    {
                    // InternalSSS.g:1489:5: (lv_alignment_10_0= ruleDAlignment )
                    // InternalSSS.g:1490:6: lv_alignment_10_0= ruleDAlignment
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getDTableFromFileAccess().getAlignmentDAlignmentEnumRuleCall_9_1_0());
                      					
                    }
                    pushFollow(FollowSets000.FOLLOW_48);
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
                      							"es.uah.aut.srg.micobs.svm.lang.sss.SSS.DAlignment");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }
                    break;

            }

            // InternalSSS.g:1508:3: (otherlv_11= 'style=' ( (lv_style_12_0= RULE_STRING ) ) )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==24) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalSSS.g:1509:4: otherlv_11= 'style=' ( (lv_style_12_0= RULE_STRING ) )
                    {
                    otherlv_11=(Token)match(input,24,FollowSets000.FOLLOW_4); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_11, grammarAccess.getDTableFromFileAccess().getStyleKeyword_10_0());
                      			
                    }
                    // InternalSSS.g:1513:4: ( (lv_style_12_0= RULE_STRING ) )
                    // InternalSSS.g:1514:5: (lv_style_12_0= RULE_STRING )
                    {
                    // InternalSSS.g:1514:5: (lv_style_12_0= RULE_STRING )
                    // InternalSSS.g:1515:6: lv_style_12_0= RULE_STRING
                    {
                    lv_style_12_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_49); if (state.failed) return current;
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

            // InternalSSS.g:1532:3: (otherlv_13= 'caption=' ( (lv_caption_14_0= RULE_STRING ) ) )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==48) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalSSS.g:1533:4: otherlv_13= 'caption=' ( (lv_caption_14_0= RULE_STRING ) )
                    {
                    otherlv_13=(Token)match(input,48,FollowSets000.FOLLOW_4); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_13, grammarAccess.getDTableFromFileAccess().getCaptionKeyword_11_0());
                      			
                    }
                    // InternalSSS.g:1537:4: ( (lv_caption_14_0= RULE_STRING ) )
                    // InternalSSS.g:1538:5: (lv_caption_14_0= RULE_STRING )
                    {
                    // InternalSSS.g:1538:5: (lv_caption_14_0= RULE_STRING )
                    // InternalSSS.g:1539:6: lv_caption_14_0= RULE_STRING
                    {
                    lv_caption_14_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_50); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_caption_14_0, grammarAccess.getDTableFromFileAccess().getCaptionSTRINGTerminalRuleCall_11_1_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getDTableFromFileRule());
                      						}
                      						setWithLastConsumed(
                      							current,
                      							"caption",
                      							lv_caption_14_0,
                      							"org.eclipse.xtext.common.Terminals.STRING");
                      					
                    }

                    }


                    }


                    }
                    break;

            }

            otherlv_15=(Token)match(input,49,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_15, grammarAccess.getDTableFromFileAccess().getSolidusGreaterThanSignKeyword_12());
              		
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
    // InternalSSS.g:1564:1: entryRuleDBasicTable returns [EObject current=null] : iv_ruleDBasicTable= ruleDBasicTable EOF ;
    public final EObject entryRuleDBasicTable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDBasicTable = null;


        try {
            // InternalSSS.g:1564:52: (iv_ruleDBasicTable= ruleDBasicTable EOF )
            // InternalSSS.g:1565:2: iv_ruleDBasicTable= ruleDBasicTable EOF
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
    // InternalSSS.g:1571:1: ruleDBasicTable returns [EObject current=null] : (otherlv_0= '<basicTable' otherlv_1= 'name=' ( (lv_name_2_0= RULE_STRING ) ) (otherlv_3= 'width=' ( (lv_width_4_0= RULE_UINT_STRING ) ) )? (otherlv_5= 'alignment=' ( (lv_alignment_6_0= ruleDAlignment ) ) )? (otherlv_7= 'style=' ( (lv_style_8_0= RULE_STRING ) ) )? (otherlv_9= 'caption=' ( (lv_caption_10_0= RULE_STRING ) ) )? otherlv_11= '>' ( (lv_rows_12_0= ruleDRow ) )+ otherlv_13= '</basicTable>' ) ;
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
        Token lv_caption_10_0=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Enumerator lv_alignment_6_0 = null;

        EObject lv_rows_12_0 = null;



        	enterRule();

        try {
            // InternalSSS.g:1577:2: ( (otherlv_0= '<basicTable' otherlv_1= 'name=' ( (lv_name_2_0= RULE_STRING ) ) (otherlv_3= 'width=' ( (lv_width_4_0= RULE_UINT_STRING ) ) )? (otherlv_5= 'alignment=' ( (lv_alignment_6_0= ruleDAlignment ) ) )? (otherlv_7= 'style=' ( (lv_style_8_0= RULE_STRING ) ) )? (otherlv_9= 'caption=' ( (lv_caption_10_0= RULE_STRING ) ) )? otherlv_11= '>' ( (lv_rows_12_0= ruleDRow ) )+ otherlv_13= '</basicTable>' ) )
            // InternalSSS.g:1578:2: (otherlv_0= '<basicTable' otherlv_1= 'name=' ( (lv_name_2_0= RULE_STRING ) ) (otherlv_3= 'width=' ( (lv_width_4_0= RULE_UINT_STRING ) ) )? (otherlv_5= 'alignment=' ( (lv_alignment_6_0= ruleDAlignment ) ) )? (otherlv_7= 'style=' ( (lv_style_8_0= RULE_STRING ) ) )? (otherlv_9= 'caption=' ( (lv_caption_10_0= RULE_STRING ) ) )? otherlv_11= '>' ( (lv_rows_12_0= ruleDRow ) )+ otherlv_13= '</basicTable>' )
            {
            // InternalSSS.g:1578:2: (otherlv_0= '<basicTable' otherlv_1= 'name=' ( (lv_name_2_0= RULE_STRING ) ) (otherlv_3= 'width=' ( (lv_width_4_0= RULE_UINT_STRING ) ) )? (otherlv_5= 'alignment=' ( (lv_alignment_6_0= ruleDAlignment ) ) )? (otherlv_7= 'style=' ( (lv_style_8_0= RULE_STRING ) ) )? (otherlv_9= 'caption=' ( (lv_caption_10_0= RULE_STRING ) ) )? otherlv_11= '>' ( (lv_rows_12_0= ruleDRow ) )+ otherlv_13= '</basicTable>' )
            // InternalSSS.g:1579:3: otherlv_0= '<basicTable' otherlv_1= 'name=' ( (lv_name_2_0= RULE_STRING ) ) (otherlv_3= 'width=' ( (lv_width_4_0= RULE_UINT_STRING ) ) )? (otherlv_5= 'alignment=' ( (lv_alignment_6_0= ruleDAlignment ) ) )? (otherlv_7= 'style=' ( (lv_style_8_0= RULE_STRING ) ) )? (otherlv_9= 'caption=' ( (lv_caption_10_0= RULE_STRING ) ) )? otherlv_11= '>' ( (lv_rows_12_0= ruleDRow ) )+ otherlv_13= '</basicTable>'
            {
            otherlv_0=(Token)match(input,51,FollowSets000.FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getDBasicTableAccess().getBasicTableKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,14,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getDBasicTableAccess().getNameKeyword_1());
              		
            }
            // InternalSSS.g:1587:3: ( (lv_name_2_0= RULE_STRING ) )
            // InternalSSS.g:1588:4: (lv_name_2_0= RULE_STRING )
            {
            // InternalSSS.g:1588:4: (lv_name_2_0= RULE_STRING )
            // InternalSSS.g:1589:5: lv_name_2_0= RULE_STRING
            {
            lv_name_2_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_51); if (state.failed) return current;
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

            // InternalSSS.g:1605:3: (otherlv_3= 'width=' ( (lv_width_4_0= RULE_UINT_STRING ) ) )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==46) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalSSS.g:1606:4: otherlv_3= 'width=' ( (lv_width_4_0= RULE_UINT_STRING ) )
                    {
                    otherlv_3=(Token)match(input,46,FollowSets000.FOLLOW_7); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_3, grammarAccess.getDBasicTableAccess().getWidthKeyword_3_0());
                      			
                    }
                    // InternalSSS.g:1610:4: ( (lv_width_4_0= RULE_UINT_STRING ) )
                    // InternalSSS.g:1611:5: (lv_width_4_0= RULE_UINT_STRING )
                    {
                    // InternalSSS.g:1611:5: (lv_width_4_0= RULE_UINT_STRING )
                    // InternalSSS.g:1612:6: lv_width_4_0= RULE_UINT_STRING
                    {
                    lv_width_4_0=(Token)match(input,RULE_UINT_STRING,FollowSets000.FOLLOW_52); if (state.failed) return current;
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
                      							"es.uah.aut.srg.micobs.svm.lang.sss.SSS.UINT_STRING");
                      					
                    }

                    }


                    }


                    }
                    break;

            }

            // InternalSSS.g:1629:3: (otherlv_5= 'alignment=' ( (lv_alignment_6_0= ruleDAlignment ) ) )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==25) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalSSS.g:1630:4: otherlv_5= 'alignment=' ( (lv_alignment_6_0= ruleDAlignment ) )
                    {
                    otherlv_5=(Token)match(input,25,FollowSets000.FOLLOW_24); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_5, grammarAccess.getDBasicTableAccess().getAlignmentKeyword_4_0());
                      			
                    }
                    // InternalSSS.g:1634:4: ( (lv_alignment_6_0= ruleDAlignment ) )
                    // InternalSSS.g:1635:5: (lv_alignment_6_0= ruleDAlignment )
                    {
                    // InternalSSS.g:1635:5: (lv_alignment_6_0= ruleDAlignment )
                    // InternalSSS.g:1636:6: lv_alignment_6_0= ruleDAlignment
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getDBasicTableAccess().getAlignmentDAlignmentEnumRuleCall_4_1_0());
                      					
                    }
                    pushFollow(FollowSets000.FOLLOW_53);
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
                      							"es.uah.aut.srg.micobs.svm.lang.sss.SSS.DAlignment");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }
                    break;

            }

            // InternalSSS.g:1654:3: (otherlv_7= 'style=' ( (lv_style_8_0= RULE_STRING ) ) )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==24) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalSSS.g:1655:4: otherlv_7= 'style=' ( (lv_style_8_0= RULE_STRING ) )
                    {
                    otherlv_7=(Token)match(input,24,FollowSets000.FOLLOW_4); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_7, grammarAccess.getDBasicTableAccess().getStyleKeyword_5_0());
                      			
                    }
                    // InternalSSS.g:1659:4: ( (lv_style_8_0= RULE_STRING ) )
                    // InternalSSS.g:1660:5: (lv_style_8_0= RULE_STRING )
                    {
                    // InternalSSS.g:1660:5: (lv_style_8_0= RULE_STRING )
                    // InternalSSS.g:1661:6: lv_style_8_0= RULE_STRING
                    {
                    lv_style_8_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_54); if (state.failed) return current;
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

            // InternalSSS.g:1678:3: (otherlv_9= 'caption=' ( (lv_caption_10_0= RULE_STRING ) ) )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==48) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalSSS.g:1679:4: otherlv_9= 'caption=' ( (lv_caption_10_0= RULE_STRING ) )
                    {
                    otherlv_9=(Token)match(input,48,FollowSets000.FOLLOW_4); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_9, grammarAccess.getDBasicTableAccess().getCaptionKeyword_6_0());
                      			
                    }
                    // InternalSSS.g:1683:4: ( (lv_caption_10_0= RULE_STRING ) )
                    // InternalSSS.g:1684:5: (lv_caption_10_0= RULE_STRING )
                    {
                    // InternalSSS.g:1684:5: (lv_caption_10_0= RULE_STRING )
                    // InternalSSS.g:1685:6: lv_caption_10_0= RULE_STRING
                    {
                    lv_caption_10_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_10); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_caption_10_0, grammarAccess.getDBasicTableAccess().getCaptionSTRINGTerminalRuleCall_6_1_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getDBasicTableRule());
                      						}
                      						setWithLastConsumed(
                      							current,
                      							"caption",
                      							lv_caption_10_0,
                      							"org.eclipse.xtext.common.Terminals.STRING");
                      					
                    }

                    }


                    }


                    }
                    break;

            }

            otherlv_11=(Token)match(input,19,FollowSets000.FOLLOW_55); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_11, grammarAccess.getDBasicTableAccess().getGreaterThanSignKeyword_7());
              		
            }
            // InternalSSS.g:1706:3: ( (lv_rows_12_0= ruleDRow ) )+
            int cnt31=0;
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( (LA31_0==53) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // InternalSSS.g:1707:4: (lv_rows_12_0= ruleDRow )
            	    {
            	    // InternalSSS.g:1707:4: (lv_rows_12_0= ruleDRow )
            	    // InternalSSS.g:1708:5: lv_rows_12_0= ruleDRow
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getDBasicTableAccess().getRowsDRowParserRuleCall_8_0());
            	      				
            	    }
            	    pushFollow(FollowSets000.FOLLOW_56);
            	    lv_rows_12_0=ruleDRow();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getDBasicTableRule());
            	      					}
            	      					add(
            	      						current,
            	      						"rows",
            	      						lv_rows_12_0,
            	      						"es.uah.aut.srg.micobs.svm.lang.sss.SSS.DRow");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt31 >= 1 ) break loop31;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(31, input);
                        throw eee;
                }
                cnt31++;
            } while (true);

            otherlv_13=(Token)match(input,52,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_13, grammarAccess.getDBasicTableAccess().getBasicTableKeyword_9());
              		
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
    // InternalSSS.g:1733:1: entryRuleDRow returns [EObject current=null] : iv_ruleDRow= ruleDRow EOF ;
    public final EObject entryRuleDRow() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDRow = null;


        try {
            // InternalSSS.g:1733:45: (iv_ruleDRow= ruleDRow EOF )
            // InternalSSS.g:1734:2: iv_ruleDRow= ruleDRow EOF
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
    // InternalSSS.g:1740:1: ruleDRow returns [EObject current=null] : (otherlv_0= '<row>' ( (lv_cells_1_0= ruleDCell ) )+ otherlv_2= '</row>' ) ;
    public final EObject ruleDRow() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_cells_1_0 = null;



        	enterRule();

        try {
            // InternalSSS.g:1746:2: ( (otherlv_0= '<row>' ( (lv_cells_1_0= ruleDCell ) )+ otherlv_2= '</row>' ) )
            // InternalSSS.g:1747:2: (otherlv_0= '<row>' ( (lv_cells_1_0= ruleDCell ) )+ otherlv_2= '</row>' )
            {
            // InternalSSS.g:1747:2: (otherlv_0= '<row>' ( (lv_cells_1_0= ruleDCell ) )+ otherlv_2= '</row>' )
            // InternalSSS.g:1748:3: otherlv_0= '<row>' ( (lv_cells_1_0= ruleDCell ) )+ otherlv_2= '</row>'
            {
            otherlv_0=(Token)match(input,53,FollowSets000.FOLLOW_57); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getDRowAccess().getRowKeyword_0());
              		
            }
            // InternalSSS.g:1752:3: ( (lv_cells_1_0= ruleDCell ) )+
            int cnt32=0;
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( (LA32_0==55) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // InternalSSS.g:1753:4: (lv_cells_1_0= ruleDCell )
            	    {
            	    // InternalSSS.g:1753:4: (lv_cells_1_0= ruleDCell )
            	    // InternalSSS.g:1754:5: lv_cells_1_0= ruleDCell
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getDRowAccess().getCellsDCellParserRuleCall_1_0());
            	      				
            	    }
            	    pushFollow(FollowSets000.FOLLOW_58);
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
            	      						"es.uah.aut.srg.micobs.svm.lang.sss.SSS.DCell");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt32 >= 1 ) break loop32;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(32, input);
                        throw eee;
                }
                cnt32++;
            } while (true);

            otherlv_2=(Token)match(input,54,FollowSets000.FOLLOW_2); if (state.failed) return current;
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
    // InternalSSS.g:1779:1: entryRuleDCell returns [EObject current=null] : iv_ruleDCell= ruleDCell EOF ;
    public final EObject entryRuleDCell() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDCell = null;


        try {
            // InternalSSS.g:1779:46: (iv_ruleDCell= ruleDCell EOF )
            // InternalSSS.g:1780:2: iv_ruleDCell= ruleDCell EOF
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
    // InternalSSS.g:1786:1: ruleDCell returns [EObject current=null] : (otherlv_0= '<cell' (otherlv_1= 'colSpan=' ( (lv_colSpan_2_0= RULE_UINT_STRING ) ) )? (otherlv_3= 'rowSpan=' ( (lv_rowSpan_4_0= RULE_UINT_STRING ) ) )? (otherlv_5= 'width=' ( (lv_width_6_0= RULE_UINT_STRING ) ) )? (otherlv_7= 'shadow=' ( (lv_shadow_8_0= RULE_STRING ) ) )? otherlv_9= '>' ( (lv_bodyContent_10_0= ruleDBodyContent ) )+ otherlv_11= '</cell>' ) ;
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
            // InternalSSS.g:1792:2: ( (otherlv_0= '<cell' (otherlv_1= 'colSpan=' ( (lv_colSpan_2_0= RULE_UINT_STRING ) ) )? (otherlv_3= 'rowSpan=' ( (lv_rowSpan_4_0= RULE_UINT_STRING ) ) )? (otherlv_5= 'width=' ( (lv_width_6_0= RULE_UINT_STRING ) ) )? (otherlv_7= 'shadow=' ( (lv_shadow_8_0= RULE_STRING ) ) )? otherlv_9= '>' ( (lv_bodyContent_10_0= ruleDBodyContent ) )+ otherlv_11= '</cell>' ) )
            // InternalSSS.g:1793:2: (otherlv_0= '<cell' (otherlv_1= 'colSpan=' ( (lv_colSpan_2_0= RULE_UINT_STRING ) ) )? (otherlv_3= 'rowSpan=' ( (lv_rowSpan_4_0= RULE_UINT_STRING ) ) )? (otherlv_5= 'width=' ( (lv_width_6_0= RULE_UINT_STRING ) ) )? (otherlv_7= 'shadow=' ( (lv_shadow_8_0= RULE_STRING ) ) )? otherlv_9= '>' ( (lv_bodyContent_10_0= ruleDBodyContent ) )+ otherlv_11= '</cell>' )
            {
            // InternalSSS.g:1793:2: (otherlv_0= '<cell' (otherlv_1= 'colSpan=' ( (lv_colSpan_2_0= RULE_UINT_STRING ) ) )? (otherlv_3= 'rowSpan=' ( (lv_rowSpan_4_0= RULE_UINT_STRING ) ) )? (otherlv_5= 'width=' ( (lv_width_6_0= RULE_UINT_STRING ) ) )? (otherlv_7= 'shadow=' ( (lv_shadow_8_0= RULE_STRING ) ) )? otherlv_9= '>' ( (lv_bodyContent_10_0= ruleDBodyContent ) )+ otherlv_11= '</cell>' )
            // InternalSSS.g:1794:3: otherlv_0= '<cell' (otherlv_1= 'colSpan=' ( (lv_colSpan_2_0= RULE_UINT_STRING ) ) )? (otherlv_3= 'rowSpan=' ( (lv_rowSpan_4_0= RULE_UINT_STRING ) ) )? (otherlv_5= 'width=' ( (lv_width_6_0= RULE_UINT_STRING ) ) )? (otherlv_7= 'shadow=' ( (lv_shadow_8_0= RULE_STRING ) ) )? otherlv_9= '>' ( (lv_bodyContent_10_0= ruleDBodyContent ) )+ otherlv_11= '</cell>'
            {
            otherlv_0=(Token)match(input,55,FollowSets000.FOLLOW_59); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getDCellAccess().getCellKeyword_0());
              		
            }
            // InternalSSS.g:1798:3: (otherlv_1= 'colSpan=' ( (lv_colSpan_2_0= RULE_UINT_STRING ) ) )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==56) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // InternalSSS.g:1799:4: otherlv_1= 'colSpan=' ( (lv_colSpan_2_0= RULE_UINT_STRING ) )
                    {
                    otherlv_1=(Token)match(input,56,FollowSets000.FOLLOW_7); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_1, grammarAccess.getDCellAccess().getColSpanKeyword_1_0());
                      			
                    }
                    // InternalSSS.g:1803:4: ( (lv_colSpan_2_0= RULE_UINT_STRING ) )
                    // InternalSSS.g:1804:5: (lv_colSpan_2_0= RULE_UINT_STRING )
                    {
                    // InternalSSS.g:1804:5: (lv_colSpan_2_0= RULE_UINT_STRING )
                    // InternalSSS.g:1805:6: lv_colSpan_2_0= RULE_UINT_STRING
                    {
                    lv_colSpan_2_0=(Token)match(input,RULE_UINT_STRING,FollowSets000.FOLLOW_60); if (state.failed) return current;
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
                      							"es.uah.aut.srg.micobs.svm.lang.sss.SSS.UINT_STRING");
                      					
                    }

                    }


                    }


                    }
                    break;

            }

            // InternalSSS.g:1822:3: (otherlv_3= 'rowSpan=' ( (lv_rowSpan_4_0= RULE_UINT_STRING ) ) )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==57) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // InternalSSS.g:1823:4: otherlv_3= 'rowSpan=' ( (lv_rowSpan_4_0= RULE_UINT_STRING ) )
                    {
                    otherlv_3=(Token)match(input,57,FollowSets000.FOLLOW_7); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_3, grammarAccess.getDCellAccess().getRowSpanKeyword_2_0());
                      			
                    }
                    // InternalSSS.g:1827:4: ( (lv_rowSpan_4_0= RULE_UINT_STRING ) )
                    // InternalSSS.g:1828:5: (lv_rowSpan_4_0= RULE_UINT_STRING )
                    {
                    // InternalSSS.g:1828:5: (lv_rowSpan_4_0= RULE_UINT_STRING )
                    // InternalSSS.g:1829:6: lv_rowSpan_4_0= RULE_UINT_STRING
                    {
                    lv_rowSpan_4_0=(Token)match(input,RULE_UINT_STRING,FollowSets000.FOLLOW_61); if (state.failed) return current;
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
                      							"es.uah.aut.srg.micobs.svm.lang.sss.SSS.UINT_STRING");
                      					
                    }

                    }


                    }


                    }
                    break;

            }

            // InternalSSS.g:1846:3: (otherlv_5= 'width=' ( (lv_width_6_0= RULE_UINT_STRING ) ) )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==46) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // InternalSSS.g:1847:4: otherlv_5= 'width=' ( (lv_width_6_0= RULE_UINT_STRING ) )
                    {
                    otherlv_5=(Token)match(input,46,FollowSets000.FOLLOW_7); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_5, grammarAccess.getDCellAccess().getWidthKeyword_3_0());
                      			
                    }
                    // InternalSSS.g:1851:4: ( (lv_width_6_0= RULE_UINT_STRING ) )
                    // InternalSSS.g:1852:5: (lv_width_6_0= RULE_UINT_STRING )
                    {
                    // InternalSSS.g:1852:5: (lv_width_6_0= RULE_UINT_STRING )
                    // InternalSSS.g:1853:6: lv_width_6_0= RULE_UINT_STRING
                    {
                    lv_width_6_0=(Token)match(input,RULE_UINT_STRING,FollowSets000.FOLLOW_62); if (state.failed) return current;
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
                      							"es.uah.aut.srg.micobs.svm.lang.sss.SSS.UINT_STRING");
                      					
                    }

                    }


                    }


                    }
                    break;

            }

            // InternalSSS.g:1870:3: (otherlv_7= 'shadow=' ( (lv_shadow_8_0= RULE_STRING ) ) )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==58) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // InternalSSS.g:1871:4: otherlv_7= 'shadow=' ( (lv_shadow_8_0= RULE_STRING ) )
                    {
                    otherlv_7=(Token)match(input,58,FollowSets000.FOLLOW_4); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_7, grammarAccess.getDCellAccess().getShadowKeyword_4_0());
                      			
                    }
                    // InternalSSS.g:1875:4: ( (lv_shadow_8_0= RULE_STRING ) )
                    // InternalSSS.g:1876:5: (lv_shadow_8_0= RULE_STRING )
                    {
                    // InternalSSS.g:1876:5: (lv_shadow_8_0= RULE_STRING )
                    // InternalSSS.g:1877:6: lv_shadow_8_0= RULE_STRING
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

            otherlv_9=(Token)match(input,19,FollowSets000.FOLLOW_20); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_9, grammarAccess.getDCellAccess().getGreaterThanSignKeyword_5());
              		
            }
            // InternalSSS.g:1898:3: ( (lv_bodyContent_10_0= ruleDBodyContent ) )+
            int cnt37=0;
            loop37:
            do {
                int alt37=2;
                int LA37_0 = input.LA(1);

                if ( (LA37_0==23||LA37_0==31||LA37_0==33||LA37_0==44||(LA37_0>=50 && LA37_0<=51)) ) {
                    alt37=1;
                }


                switch (alt37) {
            	case 1 :
            	    // InternalSSS.g:1899:4: (lv_bodyContent_10_0= ruleDBodyContent )
            	    {
            	    // InternalSSS.g:1899:4: (lv_bodyContent_10_0= ruleDBodyContent )
            	    // InternalSSS.g:1900:5: lv_bodyContent_10_0= ruleDBodyContent
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getDCellAccess().getBodyContentDBodyContentParserRuleCall_6_0());
            	      				
            	    }
            	    pushFollow(FollowSets000.FOLLOW_63);
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
            	      						"es.uah.aut.srg.micobs.svm.lang.sss.SSS.DBodyContent");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt37 >= 1 ) break loop37;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(37, input);
                        throw eee;
                }
                cnt37++;
            } while (true);

            otherlv_11=(Token)match(input,59,FollowSets000.FOLLOW_2); if (state.failed) return current;
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
    // InternalSSS.g:1925:1: entryRuleDApplicableDocument returns [EObject current=null] : iv_ruleDApplicableDocument= ruleDApplicableDocument EOF ;
    public final EObject entryRuleDApplicableDocument() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDApplicableDocument = null;


        try {
            // InternalSSS.g:1925:60: (iv_ruleDApplicableDocument= ruleDApplicableDocument EOF )
            // InternalSSS.g:1926:2: iv_ruleDApplicableDocument= ruleDApplicableDocument EOF
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
    // InternalSSS.g:1932:1: ruleDApplicableDocument returns [EObject current=null] : (otherlv_0= '<ApplicableDocument' otherlv_1= 'name=' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= 'title=' ( (lv_title_4_0= RULE_STRING ) ) otherlv_5= 'id=' ( (lv_id_6_0= RULE_STRING ) ) (otherlv_7= 'issue=' ( (lv_issue_8_0= RULE_UINT_STRING ) ) (otherlv_9= 'revision=' ( (lv_revision_10_0= RULE_UINT_STRING ) ) )? )? (otherlv_11= 'date=' ( (lv_date_12_0= RULE_STRING ) ) )? otherlv_13= '/>' ) ;
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


        	enterRule();

        try {
            // InternalSSS.g:1938:2: ( (otherlv_0= '<ApplicableDocument' otherlv_1= 'name=' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= 'title=' ( (lv_title_4_0= RULE_STRING ) ) otherlv_5= 'id=' ( (lv_id_6_0= RULE_STRING ) ) (otherlv_7= 'issue=' ( (lv_issue_8_0= RULE_UINT_STRING ) ) (otherlv_9= 'revision=' ( (lv_revision_10_0= RULE_UINT_STRING ) ) )? )? (otherlv_11= 'date=' ( (lv_date_12_0= RULE_STRING ) ) )? otherlv_13= '/>' ) )
            // InternalSSS.g:1939:2: (otherlv_0= '<ApplicableDocument' otherlv_1= 'name=' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= 'title=' ( (lv_title_4_0= RULE_STRING ) ) otherlv_5= 'id=' ( (lv_id_6_0= RULE_STRING ) ) (otherlv_7= 'issue=' ( (lv_issue_8_0= RULE_UINT_STRING ) ) (otherlv_9= 'revision=' ( (lv_revision_10_0= RULE_UINT_STRING ) ) )? )? (otherlv_11= 'date=' ( (lv_date_12_0= RULE_STRING ) ) )? otherlv_13= '/>' )
            {
            // InternalSSS.g:1939:2: (otherlv_0= '<ApplicableDocument' otherlv_1= 'name=' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= 'title=' ( (lv_title_4_0= RULE_STRING ) ) otherlv_5= 'id=' ( (lv_id_6_0= RULE_STRING ) ) (otherlv_7= 'issue=' ( (lv_issue_8_0= RULE_UINT_STRING ) ) (otherlv_9= 'revision=' ( (lv_revision_10_0= RULE_UINT_STRING ) ) )? )? (otherlv_11= 'date=' ( (lv_date_12_0= RULE_STRING ) ) )? otherlv_13= '/>' )
            // InternalSSS.g:1940:3: otherlv_0= '<ApplicableDocument' otherlv_1= 'name=' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= 'title=' ( (lv_title_4_0= RULE_STRING ) ) otherlv_5= 'id=' ( (lv_id_6_0= RULE_STRING ) ) (otherlv_7= 'issue=' ( (lv_issue_8_0= RULE_UINT_STRING ) ) (otherlv_9= 'revision=' ( (lv_revision_10_0= RULE_UINT_STRING ) ) )? )? (otherlv_11= 'date=' ( (lv_date_12_0= RULE_STRING ) ) )? otherlv_13= '/>'
            {
            otherlv_0=(Token)match(input,60,FollowSets000.FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getDApplicableDocumentAccess().getApplicableDocumentKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,14,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getDApplicableDocumentAccess().getNameKeyword_1());
              		
            }
            // InternalSSS.g:1948:3: ( (lv_name_2_0= RULE_STRING ) )
            // InternalSSS.g:1949:4: (lv_name_2_0= RULE_STRING )
            {
            // InternalSSS.g:1949:4: (lv_name_2_0= RULE_STRING )
            // InternalSSS.g:1950:5: lv_name_2_0= RULE_STRING
            {
            lv_name_2_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_64); if (state.failed) return current;
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

            otherlv_3=(Token)match(input,61,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getDApplicableDocumentAccess().getTitleKeyword_3());
              		
            }
            // InternalSSS.g:1970:3: ( (lv_title_4_0= RULE_STRING ) )
            // InternalSSS.g:1971:4: (lv_title_4_0= RULE_STRING )
            {
            // InternalSSS.g:1971:4: (lv_title_4_0= RULE_STRING )
            // InternalSSS.g:1972:5: lv_title_4_0= RULE_STRING
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

            otherlv_5=(Token)match(input,15,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getDApplicableDocumentAccess().getIdKeyword_5());
              		
            }
            // InternalSSS.g:1992:3: ( (lv_id_6_0= RULE_STRING ) )
            // InternalSSS.g:1993:4: (lv_id_6_0= RULE_STRING )
            {
            // InternalSSS.g:1993:4: (lv_id_6_0= RULE_STRING )
            // InternalSSS.g:1994:5: lv_id_6_0= RULE_STRING
            {
            lv_id_6_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_65); if (state.failed) return current;
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

            // InternalSSS.g:2010:3: (otherlv_7= 'issue=' ( (lv_issue_8_0= RULE_UINT_STRING ) ) (otherlv_9= 'revision=' ( (lv_revision_10_0= RULE_UINT_STRING ) ) )? )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==16) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // InternalSSS.g:2011:4: otherlv_7= 'issue=' ( (lv_issue_8_0= RULE_UINT_STRING ) ) (otherlv_9= 'revision=' ( (lv_revision_10_0= RULE_UINT_STRING ) ) )?
                    {
                    otherlv_7=(Token)match(input,16,FollowSets000.FOLLOW_7); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_7, grammarAccess.getDApplicableDocumentAccess().getIssueKeyword_7_0());
                      			
                    }
                    // InternalSSS.g:2015:4: ( (lv_issue_8_0= RULE_UINT_STRING ) )
                    // InternalSSS.g:2016:5: (lv_issue_8_0= RULE_UINT_STRING )
                    {
                    // InternalSSS.g:2016:5: (lv_issue_8_0= RULE_UINT_STRING )
                    // InternalSSS.g:2017:6: lv_issue_8_0= RULE_UINT_STRING
                    {
                    lv_issue_8_0=(Token)match(input,RULE_UINT_STRING,FollowSets000.FOLLOW_66); if (state.failed) return current;
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
                      							"es.uah.aut.srg.micobs.svm.lang.sss.SSS.UINT_STRING");
                      					
                    }

                    }


                    }

                    // InternalSSS.g:2033:4: (otherlv_9= 'revision=' ( (lv_revision_10_0= RULE_UINT_STRING ) ) )?
                    int alt38=2;
                    int LA38_0 = input.LA(1);

                    if ( (LA38_0==17) ) {
                        alt38=1;
                    }
                    switch (alt38) {
                        case 1 :
                            // InternalSSS.g:2034:5: otherlv_9= 'revision=' ( (lv_revision_10_0= RULE_UINT_STRING ) )
                            {
                            otherlv_9=(Token)match(input,17,FollowSets000.FOLLOW_7); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					newLeafNode(otherlv_9, grammarAccess.getDApplicableDocumentAccess().getRevisionKeyword_7_2_0());
                              				
                            }
                            // InternalSSS.g:2038:5: ( (lv_revision_10_0= RULE_UINT_STRING ) )
                            // InternalSSS.g:2039:6: (lv_revision_10_0= RULE_UINT_STRING )
                            {
                            // InternalSSS.g:2039:6: (lv_revision_10_0= RULE_UINT_STRING )
                            // InternalSSS.g:2040:7: lv_revision_10_0= RULE_UINT_STRING
                            {
                            lv_revision_10_0=(Token)match(input,RULE_UINT_STRING,FollowSets000.FOLLOW_67); if (state.failed) return current;
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
                              								"es.uah.aut.srg.micobs.svm.lang.sss.SSS.UINT_STRING");
                              						
                            }

                            }


                            }


                            }
                            break;

                    }


                    }
                    break;

            }

            // InternalSSS.g:2058:3: (otherlv_11= 'date=' ( (lv_date_12_0= RULE_STRING ) ) )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==18) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // InternalSSS.g:2059:4: otherlv_11= 'date=' ( (lv_date_12_0= RULE_STRING ) )
                    {
                    otherlv_11=(Token)match(input,18,FollowSets000.FOLLOW_4); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_11, grammarAccess.getDApplicableDocumentAccess().getDateKeyword_8_0());
                      			
                    }
                    // InternalSSS.g:2063:4: ( (lv_date_12_0= RULE_STRING ) )
                    // InternalSSS.g:2064:5: (lv_date_12_0= RULE_STRING )
                    {
                    // InternalSSS.g:2064:5: (lv_date_12_0= RULE_STRING )
                    // InternalSSS.g:2065:6: lv_date_12_0= RULE_STRING
                    {
                    lv_date_12_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_50); if (state.failed) return current;
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

            otherlv_13=(Token)match(input,49,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_13, grammarAccess.getDApplicableDocumentAccess().getSolidusGreaterThanSignKeyword_9());
              		
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
    // InternalSSS.g:2090:1: entryRuleDReferenceDocument returns [EObject current=null] : iv_ruleDReferenceDocument= ruleDReferenceDocument EOF ;
    public final EObject entryRuleDReferenceDocument() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDReferenceDocument = null;


        try {
            // InternalSSS.g:2090:59: (iv_ruleDReferenceDocument= ruleDReferenceDocument EOF )
            // InternalSSS.g:2091:2: iv_ruleDReferenceDocument= ruleDReferenceDocument EOF
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
    // InternalSSS.g:2097:1: ruleDReferenceDocument returns [EObject current=null] : (otherlv_0= '<ReferenceDocument' otherlv_1= 'name=' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= 'title=' ( (lv_title_4_0= RULE_STRING ) ) otherlv_5= 'id=' ( (lv_id_6_0= RULE_STRING ) ) (otherlv_7= 'issue=' ( (lv_issue_8_0= RULE_UINT_STRING ) ) (otherlv_9= 'revision=' ( (lv_revision_10_0= RULE_UINT_STRING ) ) )? )? (otherlv_11= 'date=' ( (lv_date_12_0= RULE_STRING ) ) )? otherlv_13= '/>' ) ;
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


        	enterRule();

        try {
            // InternalSSS.g:2103:2: ( (otherlv_0= '<ReferenceDocument' otherlv_1= 'name=' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= 'title=' ( (lv_title_4_0= RULE_STRING ) ) otherlv_5= 'id=' ( (lv_id_6_0= RULE_STRING ) ) (otherlv_7= 'issue=' ( (lv_issue_8_0= RULE_UINT_STRING ) ) (otherlv_9= 'revision=' ( (lv_revision_10_0= RULE_UINT_STRING ) ) )? )? (otherlv_11= 'date=' ( (lv_date_12_0= RULE_STRING ) ) )? otherlv_13= '/>' ) )
            // InternalSSS.g:2104:2: (otherlv_0= '<ReferenceDocument' otherlv_1= 'name=' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= 'title=' ( (lv_title_4_0= RULE_STRING ) ) otherlv_5= 'id=' ( (lv_id_6_0= RULE_STRING ) ) (otherlv_7= 'issue=' ( (lv_issue_8_0= RULE_UINT_STRING ) ) (otherlv_9= 'revision=' ( (lv_revision_10_0= RULE_UINT_STRING ) ) )? )? (otherlv_11= 'date=' ( (lv_date_12_0= RULE_STRING ) ) )? otherlv_13= '/>' )
            {
            // InternalSSS.g:2104:2: (otherlv_0= '<ReferenceDocument' otherlv_1= 'name=' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= 'title=' ( (lv_title_4_0= RULE_STRING ) ) otherlv_5= 'id=' ( (lv_id_6_0= RULE_STRING ) ) (otherlv_7= 'issue=' ( (lv_issue_8_0= RULE_UINT_STRING ) ) (otherlv_9= 'revision=' ( (lv_revision_10_0= RULE_UINT_STRING ) ) )? )? (otherlv_11= 'date=' ( (lv_date_12_0= RULE_STRING ) ) )? otherlv_13= '/>' )
            // InternalSSS.g:2105:3: otherlv_0= '<ReferenceDocument' otherlv_1= 'name=' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= 'title=' ( (lv_title_4_0= RULE_STRING ) ) otherlv_5= 'id=' ( (lv_id_6_0= RULE_STRING ) ) (otherlv_7= 'issue=' ( (lv_issue_8_0= RULE_UINT_STRING ) ) (otherlv_9= 'revision=' ( (lv_revision_10_0= RULE_UINT_STRING ) ) )? )? (otherlv_11= 'date=' ( (lv_date_12_0= RULE_STRING ) ) )? otherlv_13= '/>'
            {
            otherlv_0=(Token)match(input,62,FollowSets000.FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getDReferenceDocumentAccess().getReferenceDocumentKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,14,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getDReferenceDocumentAccess().getNameKeyword_1());
              		
            }
            // InternalSSS.g:2113:3: ( (lv_name_2_0= RULE_STRING ) )
            // InternalSSS.g:2114:4: (lv_name_2_0= RULE_STRING )
            {
            // InternalSSS.g:2114:4: (lv_name_2_0= RULE_STRING )
            // InternalSSS.g:2115:5: lv_name_2_0= RULE_STRING
            {
            lv_name_2_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_64); if (state.failed) return current;
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

            otherlv_3=(Token)match(input,61,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getDReferenceDocumentAccess().getTitleKeyword_3());
              		
            }
            // InternalSSS.g:2135:3: ( (lv_title_4_0= RULE_STRING ) )
            // InternalSSS.g:2136:4: (lv_title_4_0= RULE_STRING )
            {
            // InternalSSS.g:2136:4: (lv_title_4_0= RULE_STRING )
            // InternalSSS.g:2137:5: lv_title_4_0= RULE_STRING
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

            otherlv_5=(Token)match(input,15,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getDReferenceDocumentAccess().getIdKeyword_5());
              		
            }
            // InternalSSS.g:2157:3: ( (lv_id_6_0= RULE_STRING ) )
            // InternalSSS.g:2158:4: (lv_id_6_0= RULE_STRING )
            {
            // InternalSSS.g:2158:4: (lv_id_6_0= RULE_STRING )
            // InternalSSS.g:2159:5: lv_id_6_0= RULE_STRING
            {
            lv_id_6_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_65); if (state.failed) return current;
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

            // InternalSSS.g:2175:3: (otherlv_7= 'issue=' ( (lv_issue_8_0= RULE_UINT_STRING ) ) (otherlv_9= 'revision=' ( (lv_revision_10_0= RULE_UINT_STRING ) ) )? )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==16) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // InternalSSS.g:2176:4: otherlv_7= 'issue=' ( (lv_issue_8_0= RULE_UINT_STRING ) ) (otherlv_9= 'revision=' ( (lv_revision_10_0= RULE_UINT_STRING ) ) )?
                    {
                    otherlv_7=(Token)match(input,16,FollowSets000.FOLLOW_7); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_7, grammarAccess.getDReferenceDocumentAccess().getIssueKeyword_7_0());
                      			
                    }
                    // InternalSSS.g:2180:4: ( (lv_issue_8_0= RULE_UINT_STRING ) )
                    // InternalSSS.g:2181:5: (lv_issue_8_0= RULE_UINT_STRING )
                    {
                    // InternalSSS.g:2181:5: (lv_issue_8_0= RULE_UINT_STRING )
                    // InternalSSS.g:2182:6: lv_issue_8_0= RULE_UINT_STRING
                    {
                    lv_issue_8_0=(Token)match(input,RULE_UINT_STRING,FollowSets000.FOLLOW_66); if (state.failed) return current;
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
                      							"es.uah.aut.srg.micobs.svm.lang.sss.SSS.UINT_STRING");
                      					
                    }

                    }


                    }

                    // InternalSSS.g:2198:4: (otherlv_9= 'revision=' ( (lv_revision_10_0= RULE_UINT_STRING ) ) )?
                    int alt41=2;
                    int LA41_0 = input.LA(1);

                    if ( (LA41_0==17) ) {
                        alt41=1;
                    }
                    switch (alt41) {
                        case 1 :
                            // InternalSSS.g:2199:5: otherlv_9= 'revision=' ( (lv_revision_10_0= RULE_UINT_STRING ) )
                            {
                            otherlv_9=(Token)match(input,17,FollowSets000.FOLLOW_7); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					newLeafNode(otherlv_9, grammarAccess.getDReferenceDocumentAccess().getRevisionKeyword_7_2_0());
                              				
                            }
                            // InternalSSS.g:2203:5: ( (lv_revision_10_0= RULE_UINT_STRING ) )
                            // InternalSSS.g:2204:6: (lv_revision_10_0= RULE_UINT_STRING )
                            {
                            // InternalSSS.g:2204:6: (lv_revision_10_0= RULE_UINT_STRING )
                            // InternalSSS.g:2205:7: lv_revision_10_0= RULE_UINT_STRING
                            {
                            lv_revision_10_0=(Token)match(input,RULE_UINT_STRING,FollowSets000.FOLLOW_67); if (state.failed) return current;
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
                              								"es.uah.aut.srg.micobs.svm.lang.sss.SSS.UINT_STRING");
                              						
                            }

                            }


                            }


                            }
                            break;

                    }


                    }
                    break;

            }

            // InternalSSS.g:2223:3: (otherlv_11= 'date=' ( (lv_date_12_0= RULE_STRING ) ) )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==18) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // InternalSSS.g:2224:4: otherlv_11= 'date=' ( (lv_date_12_0= RULE_STRING ) )
                    {
                    otherlv_11=(Token)match(input,18,FollowSets000.FOLLOW_4); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_11, grammarAccess.getDReferenceDocumentAccess().getDateKeyword_8_0());
                      			
                    }
                    // InternalSSS.g:2228:4: ( (lv_date_12_0= RULE_STRING ) )
                    // InternalSSS.g:2229:5: (lv_date_12_0= RULE_STRING )
                    {
                    // InternalSSS.g:2229:5: (lv_date_12_0= RULE_STRING )
                    // InternalSSS.g:2230:6: lv_date_12_0= RULE_STRING
                    {
                    lv_date_12_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_50); if (state.failed) return current;
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

            otherlv_13=(Token)match(input,49,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_13, grammarAccess.getDReferenceDocumentAccess().getSolidusGreaterThanSignKeyword_9());
              		
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


    // $ANTLR start "entryRuleVSSSFixedSection"
    // InternalSSS.g:2255:1: entryRuleVSSSFixedSection returns [EObject current=null] : iv_ruleVSSSFixedSection= ruleVSSSFixedSection EOF ;
    public final EObject entryRuleVSSSFixedSection() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVSSSFixedSection = null;


        try {
            // InternalSSS.g:2255:57: (iv_ruleVSSSFixedSection= ruleVSSSFixedSection EOF )
            // InternalSSS.g:2256:2: iv_ruleVSSSFixedSection= ruleVSSSFixedSection EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getVSSSFixedSectionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleVSSSFixedSection=ruleVSSSFixedSection();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleVSSSFixedSection; 
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
    // $ANTLR end "entryRuleVSSSFixedSection"


    // $ANTLR start "ruleVSSSFixedSection"
    // InternalSSS.g:2262:1: ruleVSSSFixedSection returns [EObject current=null] : ( () ( (lv_body_1_0= ruleDBody ) )? ( (lv_sssInstatiableSubsections_2_0= ruleVSSSInstatiableSection ) )* ) ;
    public final EObject ruleVSSSFixedSection() throws RecognitionException {
        EObject current = null;

        EObject lv_body_1_0 = null;

        EObject lv_sssInstatiableSubsections_2_0 = null;



        	enterRule();

        try {
            // InternalSSS.g:2268:2: ( ( () ( (lv_body_1_0= ruleDBody ) )? ( (lv_sssInstatiableSubsections_2_0= ruleVSSSInstatiableSection ) )* ) )
            // InternalSSS.g:2269:2: ( () ( (lv_body_1_0= ruleDBody ) )? ( (lv_sssInstatiableSubsections_2_0= ruleVSSSInstatiableSection ) )* )
            {
            // InternalSSS.g:2269:2: ( () ( (lv_body_1_0= ruleDBody ) )? ( (lv_sssInstatiableSubsections_2_0= ruleVSSSInstatiableSection ) )* )
            // InternalSSS.g:2270:3: () ( (lv_body_1_0= ruleDBody ) )? ( (lv_sssInstatiableSubsections_2_0= ruleVSSSInstatiableSection ) )*
            {
            // InternalSSS.g:2270:3: ()
            // InternalSSS.g:2271:4: 
            {
            if ( state.backtracking==0 ) {

              				/* */
              			
            }
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getVSSSFixedSectionAccess().getVSSSFixedSectionAction_0(),
              					current);
              			
            }

            }

            // InternalSSS.g:2280:3: ( (lv_body_1_0= ruleDBody ) )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==21) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // InternalSSS.g:2281:4: (lv_body_1_0= ruleDBody )
                    {
                    // InternalSSS.g:2281:4: (lv_body_1_0= ruleDBody )
                    // InternalSSS.g:2282:5: lv_body_1_0= ruleDBody
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getVSSSFixedSectionAccess().getBodyDBodyParserRuleCall_1_0());
                      				
                    }
                    pushFollow(FollowSets000.FOLLOW_68);
                    lv_body_1_0=ruleDBody();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getVSSSFixedSectionRule());
                      					}
                      					set(
                      						current,
                      						"body",
                      						lv_body_1_0,
                      						"es.uah.aut.srg.micobs.svm.lang.sss.SSS.DBody");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }
                    break;

            }

            // InternalSSS.g:2299:3: ( (lv_sssInstatiableSubsections_2_0= ruleVSSSInstatiableSection ) )*
            loop45:
            do {
                int alt45=2;
                int LA45_0 = input.LA(1);

                if ( (LA45_0==63) ) {
                    alt45=1;
                }


                switch (alt45) {
            	case 1 :
            	    // InternalSSS.g:2300:4: (lv_sssInstatiableSubsections_2_0= ruleVSSSInstatiableSection )
            	    {
            	    // InternalSSS.g:2300:4: (lv_sssInstatiableSubsections_2_0= ruleVSSSInstatiableSection )
            	    // InternalSSS.g:2301:5: lv_sssInstatiableSubsections_2_0= ruleVSSSInstatiableSection
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getVSSSFixedSectionAccess().getSssInstatiableSubsectionsVSSSInstatiableSectionParserRuleCall_2_0());
            	      				
            	    }
            	    pushFollow(FollowSets000.FOLLOW_68);
            	    lv_sssInstatiableSubsections_2_0=ruleVSSSInstatiableSection();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getVSSSFixedSectionRule());
            	      					}
            	      					add(
            	      						current,
            	      						"sssInstatiableSubsections",
            	      						lv_sssInstatiableSubsections_2_0,
            	      						"es.uah.aut.srg.micobs.svm.lang.sss.SSS.VSSSInstatiableSection");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop45;
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
    // $ANTLR end "ruleVSSSFixedSection"


    // $ANTLR start "entryRuleVSSSInstatiableSection"
    // InternalSSS.g:2322:1: entryRuleVSSSInstatiableSection returns [EObject current=null] : iv_ruleVSSSInstatiableSection= ruleVSSSInstatiableSection EOF ;
    public final EObject entryRuleVSSSInstatiableSection() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVSSSInstatiableSection = null;


        try {
            // InternalSSS.g:2322:63: (iv_ruleVSSSInstatiableSection= ruleVSSSInstatiableSection EOF )
            // InternalSSS.g:2323:2: iv_ruleVSSSInstatiableSection= ruleVSSSInstatiableSection EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getVSSSInstatiableSectionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleVSSSInstatiableSection=ruleVSSSInstatiableSection();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleVSSSInstatiableSection; 
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
    // $ANTLR end "entryRuleVSSSInstatiableSection"


    // $ANTLR start "ruleVSSSInstatiableSection"
    // InternalSSS.g:2329:1: ruleVSSSInstatiableSection returns [EObject current=null] : (otherlv_0= '<subsection' otherlv_1= 'name=' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= '>' ( (lv_body_4_0= ruleDBody ) )? ( (lv_sssInstatiableSubsections_5_0= ruleVSSSInstatiableSection ) )* otherlv_6= '</subsection>' ) ;
    public final EObject ruleVSSSInstatiableSection() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_6=null;
        EObject lv_body_4_0 = null;

        EObject lv_sssInstatiableSubsections_5_0 = null;



        	enterRule();

        try {
            // InternalSSS.g:2335:2: ( (otherlv_0= '<subsection' otherlv_1= 'name=' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= '>' ( (lv_body_4_0= ruleDBody ) )? ( (lv_sssInstatiableSubsections_5_0= ruleVSSSInstatiableSection ) )* otherlv_6= '</subsection>' ) )
            // InternalSSS.g:2336:2: (otherlv_0= '<subsection' otherlv_1= 'name=' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= '>' ( (lv_body_4_0= ruleDBody ) )? ( (lv_sssInstatiableSubsections_5_0= ruleVSSSInstatiableSection ) )* otherlv_6= '</subsection>' )
            {
            // InternalSSS.g:2336:2: (otherlv_0= '<subsection' otherlv_1= 'name=' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= '>' ( (lv_body_4_0= ruleDBody ) )? ( (lv_sssInstatiableSubsections_5_0= ruleVSSSInstatiableSection ) )* otherlv_6= '</subsection>' )
            // InternalSSS.g:2337:3: otherlv_0= '<subsection' otherlv_1= 'name=' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= '>' ( (lv_body_4_0= ruleDBody ) )? ( (lv_sssInstatiableSubsections_5_0= ruleVSSSInstatiableSection ) )* otherlv_6= '</subsection>'
            {
            otherlv_0=(Token)match(input,63,FollowSets000.FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getVSSSInstatiableSectionAccess().getSubsectionKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,14,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getVSSSInstatiableSectionAccess().getNameKeyword_1());
              		
            }
            // InternalSSS.g:2345:3: ( (lv_name_2_0= RULE_STRING ) )
            // InternalSSS.g:2346:4: (lv_name_2_0= RULE_STRING )
            {
            // InternalSSS.g:2346:4: (lv_name_2_0= RULE_STRING )
            // InternalSSS.g:2347:5: lv_name_2_0= RULE_STRING
            {
            lv_name_2_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_10); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_2_0, grammarAccess.getVSSSInstatiableSectionAccess().getNameSTRINGTerminalRuleCall_2_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getVSSSInstatiableSectionRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_2_0,
              						"org.eclipse.xtext.common.Terminals.STRING");
              				
            }

            }


            }

            otherlv_3=(Token)match(input,19,FollowSets000.FOLLOW_69); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getVSSSInstatiableSectionAccess().getGreaterThanSignKeyword_3());
              		
            }
            // InternalSSS.g:2367:3: ( (lv_body_4_0= ruleDBody ) )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==21) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // InternalSSS.g:2368:4: (lv_body_4_0= ruleDBody )
                    {
                    // InternalSSS.g:2368:4: (lv_body_4_0= ruleDBody )
                    // InternalSSS.g:2369:5: lv_body_4_0= ruleDBody
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getVSSSInstatiableSectionAccess().getBodyDBodyParserRuleCall_4_0());
                      				
                    }
                    pushFollow(FollowSets000.FOLLOW_70);
                    lv_body_4_0=ruleDBody();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getVSSSInstatiableSectionRule());
                      					}
                      					set(
                      						current,
                      						"body",
                      						lv_body_4_0,
                      						"es.uah.aut.srg.micobs.svm.lang.sss.SSS.DBody");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }
                    break;

            }

            // InternalSSS.g:2386:3: ( (lv_sssInstatiableSubsections_5_0= ruleVSSSInstatiableSection ) )*
            loop47:
            do {
                int alt47=2;
                int LA47_0 = input.LA(1);

                if ( (LA47_0==63) ) {
                    alt47=1;
                }


                switch (alt47) {
            	case 1 :
            	    // InternalSSS.g:2387:4: (lv_sssInstatiableSubsections_5_0= ruleVSSSInstatiableSection )
            	    {
            	    // InternalSSS.g:2387:4: (lv_sssInstatiableSubsections_5_0= ruleVSSSInstatiableSection )
            	    // InternalSSS.g:2388:5: lv_sssInstatiableSubsections_5_0= ruleVSSSInstatiableSection
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getVSSSInstatiableSectionAccess().getSssInstatiableSubsectionsVSSSInstatiableSectionParserRuleCall_5_0());
            	      				
            	    }
            	    pushFollow(FollowSets000.FOLLOW_70);
            	    lv_sssInstatiableSubsections_5_0=ruleVSSSInstatiableSection();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getVSSSInstatiableSectionRule());
            	      					}
            	      					add(
            	      						current,
            	      						"sssInstatiableSubsections",
            	      						lv_sssInstatiableSubsections_5_0,
            	      						"es.uah.aut.srg.micobs.svm.lang.sss.SSS.VSSSInstatiableSection");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop47;
                }
            } while (true);

            otherlv_6=(Token)match(input,64,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_6, grammarAccess.getVSSSInstatiableSectionAccess().getSubsectionKeyword_6());
              		
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
    // $ANTLR end "ruleVSSSInstatiableSection"


    // $ANTLR start "entryRuleVSSSIntroduction"
    // InternalSSS.g:2413:1: entryRuleVSSSIntroduction returns [EObject current=null] : iv_ruleVSSSIntroduction= ruleVSSSIntroduction EOF ;
    public final EObject entryRuleVSSSIntroduction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVSSSIntroduction = null;


        try {
            // InternalSSS.g:2413:57: (iv_ruleVSSSIntroduction= ruleVSSSIntroduction EOF )
            // InternalSSS.g:2414:2: iv_ruleVSSSIntroduction= ruleVSSSIntroduction EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getVSSSIntroductionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleVSSSIntroduction=ruleVSSSIntroduction();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleVSSSIntroduction; 
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
    // $ANTLR end "entryRuleVSSSIntroduction"


    // $ANTLR start "ruleVSSSIntroduction"
    // InternalSSS.g:2420:1: ruleVSSSIntroduction returns [EObject current=null] : (otherlv_0= '<Introduction>' ( (lv_sssInstatiableSubsections_1_0= ruleVSSSInstatiableSection ) )+ otherlv_2= '</Introduction>' ) ;
    public final EObject ruleVSSSIntroduction() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_sssInstatiableSubsections_1_0 = null;



        	enterRule();

        try {
            // InternalSSS.g:2426:2: ( (otherlv_0= '<Introduction>' ( (lv_sssInstatiableSubsections_1_0= ruleVSSSInstatiableSection ) )+ otherlv_2= '</Introduction>' ) )
            // InternalSSS.g:2427:2: (otherlv_0= '<Introduction>' ( (lv_sssInstatiableSubsections_1_0= ruleVSSSInstatiableSection ) )+ otherlv_2= '</Introduction>' )
            {
            // InternalSSS.g:2427:2: (otherlv_0= '<Introduction>' ( (lv_sssInstatiableSubsections_1_0= ruleVSSSInstatiableSection ) )+ otherlv_2= '</Introduction>' )
            // InternalSSS.g:2428:3: otherlv_0= '<Introduction>' ( (lv_sssInstatiableSubsections_1_0= ruleVSSSInstatiableSection ) )+ otherlv_2= '</Introduction>'
            {
            otherlv_0=(Token)match(input,65,FollowSets000.FOLLOW_71); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getVSSSIntroductionAccess().getIntroductionKeyword_0());
              		
            }
            // InternalSSS.g:2432:3: ( (lv_sssInstatiableSubsections_1_0= ruleVSSSInstatiableSection ) )+
            int cnt48=0;
            loop48:
            do {
                int alt48=2;
                int LA48_0 = input.LA(1);

                if ( (LA48_0==63) ) {
                    alt48=1;
                }


                switch (alt48) {
            	case 1 :
            	    // InternalSSS.g:2433:4: (lv_sssInstatiableSubsections_1_0= ruleVSSSInstatiableSection )
            	    {
            	    // InternalSSS.g:2433:4: (lv_sssInstatiableSubsections_1_0= ruleVSSSInstatiableSection )
            	    // InternalSSS.g:2434:5: lv_sssInstatiableSubsections_1_0= ruleVSSSInstatiableSection
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getVSSSIntroductionAccess().getSssInstatiableSubsectionsVSSSInstatiableSectionParserRuleCall_1_0());
            	      				
            	    }
            	    pushFollow(FollowSets000.FOLLOW_72);
            	    lv_sssInstatiableSubsections_1_0=ruleVSSSInstatiableSection();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getVSSSIntroductionRule());
            	      					}
            	      					add(
            	      						current,
            	      						"sssInstatiableSubsections",
            	      						lv_sssInstatiableSubsections_1_0,
            	      						"es.uah.aut.srg.micobs.svm.lang.sss.SSS.VSSSInstatiableSection");
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

            otherlv_2=(Token)match(input,66,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getVSSSIntroductionAccess().getIntroductionKeyword_2());
              		
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
    // $ANTLR end "ruleVSSSIntroduction"


    // $ANTLR start "entryRuleVSSSApplicableDocuments"
    // InternalSSS.g:2459:1: entryRuleVSSSApplicableDocuments returns [EObject current=null] : iv_ruleVSSSApplicableDocuments= ruleVSSSApplicableDocuments EOF ;
    public final EObject entryRuleVSSSApplicableDocuments() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVSSSApplicableDocuments = null;


        try {
            // InternalSSS.g:2459:64: (iv_ruleVSSSApplicableDocuments= ruleVSSSApplicableDocuments EOF )
            // InternalSSS.g:2460:2: iv_ruleVSSSApplicableDocuments= ruleVSSSApplicableDocuments EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getVSSSApplicableDocumentsRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleVSSSApplicableDocuments=ruleVSSSApplicableDocuments();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleVSSSApplicableDocuments; 
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
    // $ANTLR end "entryRuleVSSSApplicableDocuments"


    // $ANTLR start "ruleVSSSApplicableDocuments"
    // InternalSSS.g:2466:1: ruleVSSSApplicableDocuments returns [EObject current=null] : ( () otherlv_1= '<ApplicableDocuments>' ( (lv_applicableDocuments_2_0= ruleDApplicableDocument ) )* otherlv_3= '</ApplicableDocuments>' ) ;
    public final EObject ruleVSSSApplicableDocuments() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_applicableDocuments_2_0 = null;



        	enterRule();

        try {
            // InternalSSS.g:2472:2: ( ( () otherlv_1= '<ApplicableDocuments>' ( (lv_applicableDocuments_2_0= ruleDApplicableDocument ) )* otherlv_3= '</ApplicableDocuments>' ) )
            // InternalSSS.g:2473:2: ( () otherlv_1= '<ApplicableDocuments>' ( (lv_applicableDocuments_2_0= ruleDApplicableDocument ) )* otherlv_3= '</ApplicableDocuments>' )
            {
            // InternalSSS.g:2473:2: ( () otherlv_1= '<ApplicableDocuments>' ( (lv_applicableDocuments_2_0= ruleDApplicableDocument ) )* otherlv_3= '</ApplicableDocuments>' )
            // InternalSSS.g:2474:3: () otherlv_1= '<ApplicableDocuments>' ( (lv_applicableDocuments_2_0= ruleDApplicableDocument ) )* otherlv_3= '</ApplicableDocuments>'
            {
            // InternalSSS.g:2474:3: ()
            // InternalSSS.g:2475:4: 
            {
            if ( state.backtracking==0 ) {

              				/* */
              			
            }
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getVSSSApplicableDocumentsAccess().getVSSSApplicableDocumentsAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,67,FollowSets000.FOLLOW_73); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getVSSSApplicableDocumentsAccess().getApplicableDocumentsKeyword_1());
              		
            }
            // InternalSSS.g:2488:3: ( (lv_applicableDocuments_2_0= ruleDApplicableDocument ) )*
            loop49:
            do {
                int alt49=2;
                int LA49_0 = input.LA(1);

                if ( (LA49_0==60) ) {
                    alt49=1;
                }


                switch (alt49) {
            	case 1 :
            	    // InternalSSS.g:2489:4: (lv_applicableDocuments_2_0= ruleDApplicableDocument )
            	    {
            	    // InternalSSS.g:2489:4: (lv_applicableDocuments_2_0= ruleDApplicableDocument )
            	    // InternalSSS.g:2490:5: lv_applicableDocuments_2_0= ruleDApplicableDocument
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getVSSSApplicableDocumentsAccess().getApplicableDocumentsDApplicableDocumentParserRuleCall_2_0());
            	      				
            	    }
            	    pushFollow(FollowSets000.FOLLOW_73);
            	    lv_applicableDocuments_2_0=ruleDApplicableDocument();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getVSSSApplicableDocumentsRule());
            	      					}
            	      					add(
            	      						current,
            	      						"applicableDocuments",
            	      						lv_applicableDocuments_2_0,
            	      						"es.uah.aut.srg.micobs.svm.lang.sss.SSS.DApplicableDocument");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop49;
                }
            } while (true);

            otherlv_3=(Token)match(input,68,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getVSSSApplicableDocumentsAccess().getApplicableDocumentsKeyword_3());
              		
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
    // $ANTLR end "ruleVSSSApplicableDocuments"


    // $ANTLR start "entryRuleVSSSReferenceDocuments"
    // InternalSSS.g:2515:1: entryRuleVSSSReferenceDocuments returns [EObject current=null] : iv_ruleVSSSReferenceDocuments= ruleVSSSReferenceDocuments EOF ;
    public final EObject entryRuleVSSSReferenceDocuments() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVSSSReferenceDocuments = null;


        try {
            // InternalSSS.g:2515:63: (iv_ruleVSSSReferenceDocuments= ruleVSSSReferenceDocuments EOF )
            // InternalSSS.g:2516:2: iv_ruleVSSSReferenceDocuments= ruleVSSSReferenceDocuments EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getVSSSReferenceDocumentsRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleVSSSReferenceDocuments=ruleVSSSReferenceDocuments();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleVSSSReferenceDocuments; 
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
    // $ANTLR end "entryRuleVSSSReferenceDocuments"


    // $ANTLR start "ruleVSSSReferenceDocuments"
    // InternalSSS.g:2522:1: ruleVSSSReferenceDocuments returns [EObject current=null] : ( () otherlv_1= '<ReferenceDocuments>' ( (lv_referenceDocuments_2_0= ruleDReferenceDocument ) )* otherlv_3= '</ReferenceDocuments>' ) ;
    public final EObject ruleVSSSReferenceDocuments() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_referenceDocuments_2_0 = null;



        	enterRule();

        try {
            // InternalSSS.g:2528:2: ( ( () otherlv_1= '<ReferenceDocuments>' ( (lv_referenceDocuments_2_0= ruleDReferenceDocument ) )* otherlv_3= '</ReferenceDocuments>' ) )
            // InternalSSS.g:2529:2: ( () otherlv_1= '<ReferenceDocuments>' ( (lv_referenceDocuments_2_0= ruleDReferenceDocument ) )* otherlv_3= '</ReferenceDocuments>' )
            {
            // InternalSSS.g:2529:2: ( () otherlv_1= '<ReferenceDocuments>' ( (lv_referenceDocuments_2_0= ruleDReferenceDocument ) )* otherlv_3= '</ReferenceDocuments>' )
            // InternalSSS.g:2530:3: () otherlv_1= '<ReferenceDocuments>' ( (lv_referenceDocuments_2_0= ruleDReferenceDocument ) )* otherlv_3= '</ReferenceDocuments>'
            {
            // InternalSSS.g:2530:3: ()
            // InternalSSS.g:2531:4: 
            {
            if ( state.backtracking==0 ) {

              				/* */
              			
            }
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getVSSSReferenceDocumentsAccess().getVSSSReferenceDocumentsAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,69,FollowSets000.FOLLOW_74); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getVSSSReferenceDocumentsAccess().getReferenceDocumentsKeyword_1());
              		
            }
            // InternalSSS.g:2544:3: ( (lv_referenceDocuments_2_0= ruleDReferenceDocument ) )*
            loop50:
            do {
                int alt50=2;
                int LA50_0 = input.LA(1);

                if ( (LA50_0==62) ) {
                    alt50=1;
                }


                switch (alt50) {
            	case 1 :
            	    // InternalSSS.g:2545:4: (lv_referenceDocuments_2_0= ruleDReferenceDocument )
            	    {
            	    // InternalSSS.g:2545:4: (lv_referenceDocuments_2_0= ruleDReferenceDocument )
            	    // InternalSSS.g:2546:5: lv_referenceDocuments_2_0= ruleDReferenceDocument
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getVSSSReferenceDocumentsAccess().getReferenceDocumentsDReferenceDocumentParserRuleCall_2_0());
            	      				
            	    }
            	    pushFollow(FollowSets000.FOLLOW_74);
            	    lv_referenceDocuments_2_0=ruleDReferenceDocument();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getVSSSReferenceDocumentsRule());
            	      					}
            	      					add(
            	      						current,
            	      						"referenceDocuments",
            	      						lv_referenceDocuments_2_0,
            	      						"es.uah.aut.srg.micobs.svm.lang.sss.SSS.DReferenceDocument");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop50;
                }
            } while (true);

            otherlv_3=(Token)match(input,70,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getVSSSReferenceDocumentsAccess().getReferenceDocumentsKeyword_3());
              		
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
    // $ANTLR end "ruleVSSSReferenceDocuments"


    // $ANTLR start "entryRuleVSSSTermsDefinitionsAbbreviations"
    // InternalSSS.g:2571:1: entryRuleVSSSTermsDefinitionsAbbreviations returns [EObject current=null] : iv_ruleVSSSTermsDefinitionsAbbreviations= ruleVSSSTermsDefinitionsAbbreviations EOF ;
    public final EObject entryRuleVSSSTermsDefinitionsAbbreviations() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVSSSTermsDefinitionsAbbreviations = null;


        try {
            // InternalSSS.g:2571:74: (iv_ruleVSSSTermsDefinitionsAbbreviations= ruleVSSSTermsDefinitionsAbbreviations EOF )
            // InternalSSS.g:2572:2: iv_ruleVSSSTermsDefinitionsAbbreviations= ruleVSSSTermsDefinitionsAbbreviations EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getVSSSTermsDefinitionsAbbreviationsRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleVSSSTermsDefinitionsAbbreviations=ruleVSSSTermsDefinitionsAbbreviations();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleVSSSTermsDefinitionsAbbreviations; 
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
    // $ANTLR end "entryRuleVSSSTermsDefinitionsAbbreviations"


    // $ANTLR start "ruleVSSSTermsDefinitionsAbbreviations"
    // InternalSSS.g:2578:1: ruleVSSSTermsDefinitionsAbbreviations returns [EObject current=null] : ( () otherlv_1= '<TermsDefinitionsAbbreviations>' ( (lv_terms_2_0= ruleVSSSTerm ) )* ( (lv_definitions_3_0= ruleVSSSDefinition ) )* ( (lv_abbreviations_4_0= ruleVSSSAbbreviation ) )* otherlv_5= '</TermsDefinitionsAbbreviations>' ) ;
    public final EObject ruleVSSSTermsDefinitionsAbbreviations() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_5=null;
        EObject lv_terms_2_0 = null;

        EObject lv_definitions_3_0 = null;

        EObject lv_abbreviations_4_0 = null;



        	enterRule();

        try {
            // InternalSSS.g:2584:2: ( ( () otherlv_1= '<TermsDefinitionsAbbreviations>' ( (lv_terms_2_0= ruleVSSSTerm ) )* ( (lv_definitions_3_0= ruleVSSSDefinition ) )* ( (lv_abbreviations_4_0= ruleVSSSAbbreviation ) )* otherlv_5= '</TermsDefinitionsAbbreviations>' ) )
            // InternalSSS.g:2585:2: ( () otherlv_1= '<TermsDefinitionsAbbreviations>' ( (lv_terms_2_0= ruleVSSSTerm ) )* ( (lv_definitions_3_0= ruleVSSSDefinition ) )* ( (lv_abbreviations_4_0= ruleVSSSAbbreviation ) )* otherlv_5= '</TermsDefinitionsAbbreviations>' )
            {
            // InternalSSS.g:2585:2: ( () otherlv_1= '<TermsDefinitionsAbbreviations>' ( (lv_terms_2_0= ruleVSSSTerm ) )* ( (lv_definitions_3_0= ruleVSSSDefinition ) )* ( (lv_abbreviations_4_0= ruleVSSSAbbreviation ) )* otherlv_5= '</TermsDefinitionsAbbreviations>' )
            // InternalSSS.g:2586:3: () otherlv_1= '<TermsDefinitionsAbbreviations>' ( (lv_terms_2_0= ruleVSSSTerm ) )* ( (lv_definitions_3_0= ruleVSSSDefinition ) )* ( (lv_abbreviations_4_0= ruleVSSSAbbreviation ) )* otherlv_5= '</TermsDefinitionsAbbreviations>'
            {
            // InternalSSS.g:2586:3: ()
            // InternalSSS.g:2587:4: 
            {
            if ( state.backtracking==0 ) {

              				/* */
              			
            }
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getVSSSTermsDefinitionsAbbreviationsAccess().getVSSSTermsDefinitionsAbbreviationsAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,71,FollowSets000.FOLLOW_75); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getVSSSTermsDefinitionsAbbreviationsAccess().getTermsDefinitionsAbbreviationsKeyword_1());
              		
            }
            // InternalSSS.g:2600:3: ( (lv_terms_2_0= ruleVSSSTerm ) )*
            loop51:
            do {
                int alt51=2;
                int LA51_0 = input.LA(1);

                if ( (LA51_0==91) ) {
                    alt51=1;
                }


                switch (alt51) {
            	case 1 :
            	    // InternalSSS.g:2601:4: (lv_terms_2_0= ruleVSSSTerm )
            	    {
            	    // InternalSSS.g:2601:4: (lv_terms_2_0= ruleVSSSTerm )
            	    // InternalSSS.g:2602:5: lv_terms_2_0= ruleVSSSTerm
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getVSSSTermsDefinitionsAbbreviationsAccess().getTermsVSSSTermParserRuleCall_2_0());
            	      				
            	    }
            	    pushFollow(FollowSets000.FOLLOW_75);
            	    lv_terms_2_0=ruleVSSSTerm();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getVSSSTermsDefinitionsAbbreviationsRule());
            	      					}
            	      					add(
            	      						current,
            	      						"terms",
            	      						lv_terms_2_0,
            	      						"es.uah.aut.srg.micobs.svm.lang.sss.SSS.VSSSTerm");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop51;
                }
            } while (true);

            // InternalSSS.g:2619:3: ( (lv_definitions_3_0= ruleVSSSDefinition ) )*
            loop52:
            do {
                int alt52=2;
                int LA52_0 = input.LA(1);

                if ( (LA52_0==93) ) {
                    alt52=1;
                }


                switch (alt52) {
            	case 1 :
            	    // InternalSSS.g:2620:4: (lv_definitions_3_0= ruleVSSSDefinition )
            	    {
            	    // InternalSSS.g:2620:4: (lv_definitions_3_0= ruleVSSSDefinition )
            	    // InternalSSS.g:2621:5: lv_definitions_3_0= ruleVSSSDefinition
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getVSSSTermsDefinitionsAbbreviationsAccess().getDefinitionsVSSSDefinitionParserRuleCall_3_0());
            	      				
            	    }
            	    pushFollow(FollowSets000.FOLLOW_76);
            	    lv_definitions_3_0=ruleVSSSDefinition();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getVSSSTermsDefinitionsAbbreviationsRule());
            	      					}
            	      					add(
            	      						current,
            	      						"definitions",
            	      						lv_definitions_3_0,
            	      						"es.uah.aut.srg.micobs.svm.lang.sss.SSS.VSSSDefinition");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop52;
                }
            } while (true);

            // InternalSSS.g:2638:3: ( (lv_abbreviations_4_0= ruleVSSSAbbreviation ) )*
            loop53:
            do {
                int alt53=2;
                int LA53_0 = input.LA(1);

                if ( (LA53_0==95) ) {
                    alt53=1;
                }


                switch (alt53) {
            	case 1 :
            	    // InternalSSS.g:2639:4: (lv_abbreviations_4_0= ruleVSSSAbbreviation )
            	    {
            	    // InternalSSS.g:2639:4: (lv_abbreviations_4_0= ruleVSSSAbbreviation )
            	    // InternalSSS.g:2640:5: lv_abbreviations_4_0= ruleVSSSAbbreviation
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getVSSSTermsDefinitionsAbbreviationsAccess().getAbbreviationsVSSSAbbreviationParserRuleCall_4_0());
            	      				
            	    }
            	    pushFollow(FollowSets000.FOLLOW_77);
            	    lv_abbreviations_4_0=ruleVSSSAbbreviation();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getVSSSTermsDefinitionsAbbreviationsRule());
            	      					}
            	      					add(
            	      						current,
            	      						"abbreviations",
            	      						lv_abbreviations_4_0,
            	      						"es.uah.aut.srg.micobs.svm.lang.sss.SSS.VSSSAbbreviation");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop53;
                }
            } while (true);

            otherlv_5=(Token)match(input,72,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getVSSSTermsDefinitionsAbbreviationsAccess().getTermsDefinitionsAbbreviationsKeyword_5());
              		
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
    // $ANTLR end "ruleVSSSTermsDefinitionsAbbreviations"


    // $ANTLR start "entryRuleVSSSGeneralDescription"
    // InternalSSS.g:2665:1: entryRuleVSSSGeneralDescription returns [EObject current=null] : iv_ruleVSSSGeneralDescription= ruleVSSSGeneralDescription EOF ;
    public final EObject entryRuleVSSSGeneralDescription() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVSSSGeneralDescription = null;


        try {
            // InternalSSS.g:2665:63: (iv_ruleVSSSGeneralDescription= ruleVSSSGeneralDescription EOF )
            // InternalSSS.g:2666:2: iv_ruleVSSSGeneralDescription= ruleVSSSGeneralDescription EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getVSSSGeneralDescriptionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleVSSSGeneralDescription=ruleVSSSGeneralDescription();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleVSSSGeneralDescription; 
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
    // $ANTLR end "entryRuleVSSSGeneralDescription"


    // $ANTLR start "ruleVSSSGeneralDescription"
    // InternalSSS.g:2672:1: ruleVSSSGeneralDescription returns [EObject current=null] : (otherlv_0= '<GeneralDescription>' otherlv_1= '<ProductPerspective>' ( (lv_productPerspective_2_0= ruleVSSSFixedSection ) ) otherlv_3= '</ProductPerspective>' otherlv_4= '<GeneralCapabilities>' ( (lv_generalCapabilities_5_0= ruleVSSSFixedSection ) ) otherlv_6= '</GeneralCapabilities>' otherlv_7= '<GeneralConstraints>' ( (lv_generalConstraints_8_0= ruleVSSSFixedSection ) ) otherlv_9= '</GeneralConstraints>' otherlv_10= '<OperationalEnvironment>' ( (lv_operationalEnvironment_11_0= ruleVSSSFixedSection ) ) otherlv_12= '</OperationalEnvironment>' otherlv_13= '<AssumptionsDependencies>' ( (lv_assumptionsDependencies_14_0= ruleVSSSFixedSection ) ) otherlv_15= '</AssumptionsDependencies>' otherlv_16= '</GeneralDescription>' ) ;
    public final EObject ruleVSSSGeneralDescription() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        EObject lv_productPerspective_2_0 = null;

        EObject lv_generalCapabilities_5_0 = null;

        EObject lv_generalConstraints_8_0 = null;

        EObject lv_operationalEnvironment_11_0 = null;

        EObject lv_assumptionsDependencies_14_0 = null;



        	enterRule();

        try {
            // InternalSSS.g:2678:2: ( (otherlv_0= '<GeneralDescription>' otherlv_1= '<ProductPerspective>' ( (lv_productPerspective_2_0= ruleVSSSFixedSection ) ) otherlv_3= '</ProductPerspective>' otherlv_4= '<GeneralCapabilities>' ( (lv_generalCapabilities_5_0= ruleVSSSFixedSection ) ) otherlv_6= '</GeneralCapabilities>' otherlv_7= '<GeneralConstraints>' ( (lv_generalConstraints_8_0= ruleVSSSFixedSection ) ) otherlv_9= '</GeneralConstraints>' otherlv_10= '<OperationalEnvironment>' ( (lv_operationalEnvironment_11_0= ruleVSSSFixedSection ) ) otherlv_12= '</OperationalEnvironment>' otherlv_13= '<AssumptionsDependencies>' ( (lv_assumptionsDependencies_14_0= ruleVSSSFixedSection ) ) otherlv_15= '</AssumptionsDependencies>' otherlv_16= '</GeneralDescription>' ) )
            // InternalSSS.g:2679:2: (otherlv_0= '<GeneralDescription>' otherlv_1= '<ProductPerspective>' ( (lv_productPerspective_2_0= ruleVSSSFixedSection ) ) otherlv_3= '</ProductPerspective>' otherlv_4= '<GeneralCapabilities>' ( (lv_generalCapabilities_5_0= ruleVSSSFixedSection ) ) otherlv_6= '</GeneralCapabilities>' otherlv_7= '<GeneralConstraints>' ( (lv_generalConstraints_8_0= ruleVSSSFixedSection ) ) otherlv_9= '</GeneralConstraints>' otherlv_10= '<OperationalEnvironment>' ( (lv_operationalEnvironment_11_0= ruleVSSSFixedSection ) ) otherlv_12= '</OperationalEnvironment>' otherlv_13= '<AssumptionsDependencies>' ( (lv_assumptionsDependencies_14_0= ruleVSSSFixedSection ) ) otherlv_15= '</AssumptionsDependencies>' otherlv_16= '</GeneralDescription>' )
            {
            // InternalSSS.g:2679:2: (otherlv_0= '<GeneralDescription>' otherlv_1= '<ProductPerspective>' ( (lv_productPerspective_2_0= ruleVSSSFixedSection ) ) otherlv_3= '</ProductPerspective>' otherlv_4= '<GeneralCapabilities>' ( (lv_generalCapabilities_5_0= ruleVSSSFixedSection ) ) otherlv_6= '</GeneralCapabilities>' otherlv_7= '<GeneralConstraints>' ( (lv_generalConstraints_8_0= ruleVSSSFixedSection ) ) otherlv_9= '</GeneralConstraints>' otherlv_10= '<OperationalEnvironment>' ( (lv_operationalEnvironment_11_0= ruleVSSSFixedSection ) ) otherlv_12= '</OperationalEnvironment>' otherlv_13= '<AssumptionsDependencies>' ( (lv_assumptionsDependencies_14_0= ruleVSSSFixedSection ) ) otherlv_15= '</AssumptionsDependencies>' otherlv_16= '</GeneralDescription>' )
            // InternalSSS.g:2680:3: otherlv_0= '<GeneralDescription>' otherlv_1= '<ProductPerspective>' ( (lv_productPerspective_2_0= ruleVSSSFixedSection ) ) otherlv_3= '</ProductPerspective>' otherlv_4= '<GeneralCapabilities>' ( (lv_generalCapabilities_5_0= ruleVSSSFixedSection ) ) otherlv_6= '</GeneralCapabilities>' otherlv_7= '<GeneralConstraints>' ( (lv_generalConstraints_8_0= ruleVSSSFixedSection ) ) otherlv_9= '</GeneralConstraints>' otherlv_10= '<OperationalEnvironment>' ( (lv_operationalEnvironment_11_0= ruleVSSSFixedSection ) ) otherlv_12= '</OperationalEnvironment>' otherlv_13= '<AssumptionsDependencies>' ( (lv_assumptionsDependencies_14_0= ruleVSSSFixedSection ) ) otherlv_15= '</AssumptionsDependencies>' otherlv_16= '</GeneralDescription>'
            {
            otherlv_0=(Token)match(input,73,FollowSets000.FOLLOW_78); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getVSSSGeneralDescriptionAccess().getGeneralDescriptionKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,74,FollowSets000.FOLLOW_79); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getVSSSGeneralDescriptionAccess().getProductPerspectiveKeyword_1());
              		
            }
            // InternalSSS.g:2688:3: ( (lv_productPerspective_2_0= ruleVSSSFixedSection ) )
            // InternalSSS.g:2689:4: (lv_productPerspective_2_0= ruleVSSSFixedSection )
            {
            // InternalSSS.g:2689:4: (lv_productPerspective_2_0= ruleVSSSFixedSection )
            // InternalSSS.g:2690:5: lv_productPerspective_2_0= ruleVSSSFixedSection
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getVSSSGeneralDescriptionAccess().getProductPerspectiveVSSSFixedSectionParserRuleCall_2_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_80);
            lv_productPerspective_2_0=ruleVSSSFixedSection();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getVSSSGeneralDescriptionRule());
              					}
              					set(
              						current,
              						"productPerspective",
              						lv_productPerspective_2_0,
              						"es.uah.aut.srg.micobs.svm.lang.sss.SSS.VSSSFixedSection");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_3=(Token)match(input,75,FollowSets000.FOLLOW_81); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getVSSSGeneralDescriptionAccess().getProductPerspectiveKeyword_3());
              		
            }
            otherlv_4=(Token)match(input,76,FollowSets000.FOLLOW_82); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getVSSSGeneralDescriptionAccess().getGeneralCapabilitiesKeyword_4());
              		
            }
            // InternalSSS.g:2715:3: ( (lv_generalCapabilities_5_0= ruleVSSSFixedSection ) )
            // InternalSSS.g:2716:4: (lv_generalCapabilities_5_0= ruleVSSSFixedSection )
            {
            // InternalSSS.g:2716:4: (lv_generalCapabilities_5_0= ruleVSSSFixedSection )
            // InternalSSS.g:2717:5: lv_generalCapabilities_5_0= ruleVSSSFixedSection
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getVSSSGeneralDescriptionAccess().getGeneralCapabilitiesVSSSFixedSectionParserRuleCall_5_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_83);
            lv_generalCapabilities_5_0=ruleVSSSFixedSection();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getVSSSGeneralDescriptionRule());
              					}
              					set(
              						current,
              						"generalCapabilities",
              						lv_generalCapabilities_5_0,
              						"es.uah.aut.srg.micobs.svm.lang.sss.SSS.VSSSFixedSection");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_6=(Token)match(input,77,FollowSets000.FOLLOW_84); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_6, grammarAccess.getVSSSGeneralDescriptionAccess().getGeneralCapabilitiesKeyword_6());
              		
            }
            otherlv_7=(Token)match(input,78,FollowSets000.FOLLOW_85); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_7, grammarAccess.getVSSSGeneralDescriptionAccess().getGeneralConstraintsKeyword_7());
              		
            }
            // InternalSSS.g:2742:3: ( (lv_generalConstraints_8_0= ruleVSSSFixedSection ) )
            // InternalSSS.g:2743:4: (lv_generalConstraints_8_0= ruleVSSSFixedSection )
            {
            // InternalSSS.g:2743:4: (lv_generalConstraints_8_0= ruleVSSSFixedSection )
            // InternalSSS.g:2744:5: lv_generalConstraints_8_0= ruleVSSSFixedSection
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getVSSSGeneralDescriptionAccess().getGeneralConstraintsVSSSFixedSectionParserRuleCall_8_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_86);
            lv_generalConstraints_8_0=ruleVSSSFixedSection();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getVSSSGeneralDescriptionRule());
              					}
              					set(
              						current,
              						"generalConstraints",
              						lv_generalConstraints_8_0,
              						"es.uah.aut.srg.micobs.svm.lang.sss.SSS.VSSSFixedSection");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_9=(Token)match(input,79,FollowSets000.FOLLOW_87); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_9, grammarAccess.getVSSSGeneralDescriptionAccess().getGeneralConstraintsKeyword_9());
              		
            }
            otherlv_10=(Token)match(input,80,FollowSets000.FOLLOW_88); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_10, grammarAccess.getVSSSGeneralDescriptionAccess().getOperationalEnvironmentKeyword_10());
              		
            }
            // InternalSSS.g:2769:3: ( (lv_operationalEnvironment_11_0= ruleVSSSFixedSection ) )
            // InternalSSS.g:2770:4: (lv_operationalEnvironment_11_0= ruleVSSSFixedSection )
            {
            // InternalSSS.g:2770:4: (lv_operationalEnvironment_11_0= ruleVSSSFixedSection )
            // InternalSSS.g:2771:5: lv_operationalEnvironment_11_0= ruleVSSSFixedSection
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getVSSSGeneralDescriptionAccess().getOperationalEnvironmentVSSSFixedSectionParserRuleCall_11_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_89);
            lv_operationalEnvironment_11_0=ruleVSSSFixedSection();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getVSSSGeneralDescriptionRule());
              					}
              					set(
              						current,
              						"operationalEnvironment",
              						lv_operationalEnvironment_11_0,
              						"es.uah.aut.srg.micobs.svm.lang.sss.SSS.VSSSFixedSection");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_12=(Token)match(input,81,FollowSets000.FOLLOW_90); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_12, grammarAccess.getVSSSGeneralDescriptionAccess().getOperationalEnvironmentKeyword_12());
              		
            }
            otherlv_13=(Token)match(input,82,FollowSets000.FOLLOW_91); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_13, grammarAccess.getVSSSGeneralDescriptionAccess().getAssumptionsDependenciesKeyword_13());
              		
            }
            // InternalSSS.g:2796:3: ( (lv_assumptionsDependencies_14_0= ruleVSSSFixedSection ) )
            // InternalSSS.g:2797:4: (lv_assumptionsDependencies_14_0= ruleVSSSFixedSection )
            {
            // InternalSSS.g:2797:4: (lv_assumptionsDependencies_14_0= ruleVSSSFixedSection )
            // InternalSSS.g:2798:5: lv_assumptionsDependencies_14_0= ruleVSSSFixedSection
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getVSSSGeneralDescriptionAccess().getAssumptionsDependenciesVSSSFixedSectionParserRuleCall_14_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_92);
            lv_assumptionsDependencies_14_0=ruleVSSSFixedSection();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getVSSSGeneralDescriptionRule());
              					}
              					set(
              						current,
              						"assumptionsDependencies",
              						lv_assumptionsDependencies_14_0,
              						"es.uah.aut.srg.micobs.svm.lang.sss.SSS.VSSSFixedSection");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_15=(Token)match(input,83,FollowSets000.FOLLOW_93); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_15, grammarAccess.getVSSSGeneralDescriptionAccess().getAssumptionsDependenciesKeyword_15());
              		
            }
            otherlv_16=(Token)match(input,84,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_16, grammarAccess.getVSSSGeneralDescriptionAccess().getGeneralDescriptionKeyword_16());
              		
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
    // $ANTLR end "ruleVSSSGeneralDescription"


    // $ANTLR start "entryRuleVSSSSpecificRequirements"
    // InternalSSS.g:2827:1: entryRuleVSSSSpecificRequirements returns [EObject current=null] : iv_ruleVSSSSpecificRequirements= ruleVSSSSpecificRequirements EOF ;
    public final EObject entryRuleVSSSSpecificRequirements() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVSSSSpecificRequirements = null;


        try {
            // InternalSSS.g:2827:65: (iv_ruleVSSSSpecificRequirements= ruleVSSSSpecificRequirements EOF )
            // InternalSSS.g:2828:2: iv_ruleVSSSSpecificRequirements= ruleVSSSSpecificRequirements EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getVSSSSpecificRequirementsRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleVSSSSpecificRequirements=ruleVSSSSpecificRequirements();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleVSSSSpecificRequirements; 
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
    // $ANTLR end "entryRuleVSSSSpecificRequirements"


    // $ANTLR start "ruleVSSSSpecificRequirements"
    // InternalSSS.g:2834:1: ruleVSSSSpecificRequirements returns [EObject current=null] : (otherlv_0= '<SpecificRequirements>' ( (lv_sectionDescription_1_0= ruleDBody ) )? ( (lv_general_2_0= ruleVSSSGeneralRequirements ) ) ( (lv_capabilities_3_0= ruleVSSSCapabilitiesRequirements ) ) ( (lv_systemInterface_4_0= ruleVSSSSystemInterfaceRequirements ) ) ( (lv_adaptationMissionization_5_0= ruleVSSSAdaptationMissionizationRequirements ) ) ( (lv_computerResource_6_0= ruleVSSSComputerResourceRequirements ) ) ( (lv_security_7_0= ruleVSSSSecurityRequirements ) ) ( (lv_safety_8_0= ruleVSSSSafetyRequirements ) ) ( (lv_reliabilityAvailability_9_0= ruleVSSSReliabilityAvailabilityRequirements ) ) ( (lv_quality_10_0= ruleVSSSQualityRequirements ) ) ( (lv_design_11_0= ruleVSSSDesignRequirements ) ) ( (lv_softwareOperations_12_0= ruleVSSSSoftwareOperationsRequirements ) ) ( (lv_softwareMaintenance_13_0= ruleVSSSSoftwareMaintenanceRequirements ) ) ( (lv_systemSoftwareObservability_14_0= ruleVSSSSystemSoftwareObservabilityRequirements ) ) otherlv_15= '</SpecificRequirements>' ) ;
    public final EObject ruleVSSSSpecificRequirements() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_15=null;
        EObject lv_sectionDescription_1_0 = null;

        EObject lv_general_2_0 = null;

        EObject lv_capabilities_3_0 = null;

        EObject lv_systemInterface_4_0 = null;

        EObject lv_adaptationMissionization_5_0 = null;

        EObject lv_computerResource_6_0 = null;

        EObject lv_security_7_0 = null;

        EObject lv_safety_8_0 = null;

        EObject lv_reliabilityAvailability_9_0 = null;

        EObject lv_quality_10_0 = null;

        EObject lv_design_11_0 = null;

        EObject lv_softwareOperations_12_0 = null;

        EObject lv_softwareMaintenance_13_0 = null;

        EObject lv_systemSoftwareObservability_14_0 = null;



        	enterRule();

        try {
            // InternalSSS.g:2840:2: ( (otherlv_0= '<SpecificRequirements>' ( (lv_sectionDescription_1_0= ruleDBody ) )? ( (lv_general_2_0= ruleVSSSGeneralRequirements ) ) ( (lv_capabilities_3_0= ruleVSSSCapabilitiesRequirements ) ) ( (lv_systemInterface_4_0= ruleVSSSSystemInterfaceRequirements ) ) ( (lv_adaptationMissionization_5_0= ruleVSSSAdaptationMissionizationRequirements ) ) ( (lv_computerResource_6_0= ruleVSSSComputerResourceRequirements ) ) ( (lv_security_7_0= ruleVSSSSecurityRequirements ) ) ( (lv_safety_8_0= ruleVSSSSafetyRequirements ) ) ( (lv_reliabilityAvailability_9_0= ruleVSSSReliabilityAvailabilityRequirements ) ) ( (lv_quality_10_0= ruleVSSSQualityRequirements ) ) ( (lv_design_11_0= ruleVSSSDesignRequirements ) ) ( (lv_softwareOperations_12_0= ruleVSSSSoftwareOperationsRequirements ) ) ( (lv_softwareMaintenance_13_0= ruleVSSSSoftwareMaintenanceRequirements ) ) ( (lv_systemSoftwareObservability_14_0= ruleVSSSSystemSoftwareObservabilityRequirements ) ) otherlv_15= '</SpecificRequirements>' ) )
            // InternalSSS.g:2841:2: (otherlv_0= '<SpecificRequirements>' ( (lv_sectionDescription_1_0= ruleDBody ) )? ( (lv_general_2_0= ruleVSSSGeneralRequirements ) ) ( (lv_capabilities_3_0= ruleVSSSCapabilitiesRequirements ) ) ( (lv_systemInterface_4_0= ruleVSSSSystemInterfaceRequirements ) ) ( (lv_adaptationMissionization_5_0= ruleVSSSAdaptationMissionizationRequirements ) ) ( (lv_computerResource_6_0= ruleVSSSComputerResourceRequirements ) ) ( (lv_security_7_0= ruleVSSSSecurityRequirements ) ) ( (lv_safety_8_0= ruleVSSSSafetyRequirements ) ) ( (lv_reliabilityAvailability_9_0= ruleVSSSReliabilityAvailabilityRequirements ) ) ( (lv_quality_10_0= ruleVSSSQualityRequirements ) ) ( (lv_design_11_0= ruleVSSSDesignRequirements ) ) ( (lv_softwareOperations_12_0= ruleVSSSSoftwareOperationsRequirements ) ) ( (lv_softwareMaintenance_13_0= ruleVSSSSoftwareMaintenanceRequirements ) ) ( (lv_systemSoftwareObservability_14_0= ruleVSSSSystemSoftwareObservabilityRequirements ) ) otherlv_15= '</SpecificRequirements>' )
            {
            // InternalSSS.g:2841:2: (otherlv_0= '<SpecificRequirements>' ( (lv_sectionDescription_1_0= ruleDBody ) )? ( (lv_general_2_0= ruleVSSSGeneralRequirements ) ) ( (lv_capabilities_3_0= ruleVSSSCapabilitiesRequirements ) ) ( (lv_systemInterface_4_0= ruleVSSSSystemInterfaceRequirements ) ) ( (lv_adaptationMissionization_5_0= ruleVSSSAdaptationMissionizationRequirements ) ) ( (lv_computerResource_6_0= ruleVSSSComputerResourceRequirements ) ) ( (lv_security_7_0= ruleVSSSSecurityRequirements ) ) ( (lv_safety_8_0= ruleVSSSSafetyRequirements ) ) ( (lv_reliabilityAvailability_9_0= ruleVSSSReliabilityAvailabilityRequirements ) ) ( (lv_quality_10_0= ruleVSSSQualityRequirements ) ) ( (lv_design_11_0= ruleVSSSDesignRequirements ) ) ( (lv_softwareOperations_12_0= ruleVSSSSoftwareOperationsRequirements ) ) ( (lv_softwareMaintenance_13_0= ruleVSSSSoftwareMaintenanceRequirements ) ) ( (lv_systemSoftwareObservability_14_0= ruleVSSSSystemSoftwareObservabilityRequirements ) ) otherlv_15= '</SpecificRequirements>' )
            // InternalSSS.g:2842:3: otherlv_0= '<SpecificRequirements>' ( (lv_sectionDescription_1_0= ruleDBody ) )? ( (lv_general_2_0= ruleVSSSGeneralRequirements ) ) ( (lv_capabilities_3_0= ruleVSSSCapabilitiesRequirements ) ) ( (lv_systemInterface_4_0= ruleVSSSSystemInterfaceRequirements ) ) ( (lv_adaptationMissionization_5_0= ruleVSSSAdaptationMissionizationRequirements ) ) ( (lv_computerResource_6_0= ruleVSSSComputerResourceRequirements ) ) ( (lv_security_7_0= ruleVSSSSecurityRequirements ) ) ( (lv_safety_8_0= ruleVSSSSafetyRequirements ) ) ( (lv_reliabilityAvailability_9_0= ruleVSSSReliabilityAvailabilityRequirements ) ) ( (lv_quality_10_0= ruleVSSSQualityRequirements ) ) ( (lv_design_11_0= ruleVSSSDesignRequirements ) ) ( (lv_softwareOperations_12_0= ruleVSSSSoftwareOperationsRequirements ) ) ( (lv_softwareMaintenance_13_0= ruleVSSSSoftwareMaintenanceRequirements ) ) ( (lv_systemSoftwareObservability_14_0= ruleVSSSSystemSoftwareObservabilityRequirements ) ) otherlv_15= '</SpecificRequirements>'
            {
            otherlv_0=(Token)match(input,85,FollowSets000.FOLLOW_94); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getVSSSSpecificRequirementsAccess().getSpecificRequirementsKeyword_0());
              		
            }
            // InternalSSS.g:2846:3: ( (lv_sectionDescription_1_0= ruleDBody ) )?
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( (LA54_0==21) ) {
                alt54=1;
            }
            switch (alt54) {
                case 1 :
                    // InternalSSS.g:2847:4: (lv_sectionDescription_1_0= ruleDBody )
                    {
                    // InternalSSS.g:2847:4: (lv_sectionDescription_1_0= ruleDBody )
                    // InternalSSS.g:2848:5: lv_sectionDescription_1_0= ruleDBody
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getVSSSSpecificRequirementsAccess().getSectionDescriptionDBodyParserRuleCall_1_0());
                      				
                    }
                    pushFollow(FollowSets000.FOLLOW_94);
                    lv_sectionDescription_1_0=ruleDBody();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getVSSSSpecificRequirementsRule());
                      					}
                      					set(
                      						current,
                      						"sectionDescription",
                      						lv_sectionDescription_1_0,
                      						"es.uah.aut.srg.micobs.svm.lang.sss.SSS.DBody");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }
                    break;

            }

            // InternalSSS.g:2865:3: ( (lv_general_2_0= ruleVSSSGeneralRequirements ) )
            // InternalSSS.g:2866:4: (lv_general_2_0= ruleVSSSGeneralRequirements )
            {
            // InternalSSS.g:2866:4: (lv_general_2_0= ruleVSSSGeneralRequirements )
            // InternalSSS.g:2867:5: lv_general_2_0= ruleVSSSGeneralRequirements
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getVSSSSpecificRequirementsAccess().getGeneralVSSSGeneralRequirementsParserRuleCall_2_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_95);
            lv_general_2_0=ruleVSSSGeneralRequirements();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getVSSSSpecificRequirementsRule());
              					}
              					set(
              						current,
              						"general",
              						lv_general_2_0,
              						"es.uah.aut.srg.micobs.svm.lang.sss.SSS.VSSSGeneralRequirements");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalSSS.g:2884:3: ( (lv_capabilities_3_0= ruleVSSSCapabilitiesRequirements ) )
            // InternalSSS.g:2885:4: (lv_capabilities_3_0= ruleVSSSCapabilitiesRequirements )
            {
            // InternalSSS.g:2885:4: (lv_capabilities_3_0= ruleVSSSCapabilitiesRequirements )
            // InternalSSS.g:2886:5: lv_capabilities_3_0= ruleVSSSCapabilitiesRequirements
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getVSSSSpecificRequirementsAccess().getCapabilitiesVSSSCapabilitiesRequirementsParserRuleCall_3_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_96);
            lv_capabilities_3_0=ruleVSSSCapabilitiesRequirements();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getVSSSSpecificRequirementsRule());
              					}
              					set(
              						current,
              						"capabilities",
              						lv_capabilities_3_0,
              						"es.uah.aut.srg.micobs.svm.lang.sss.SSS.VSSSCapabilitiesRequirements");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalSSS.g:2903:3: ( (lv_systemInterface_4_0= ruleVSSSSystemInterfaceRequirements ) )
            // InternalSSS.g:2904:4: (lv_systemInterface_4_0= ruleVSSSSystemInterfaceRequirements )
            {
            // InternalSSS.g:2904:4: (lv_systemInterface_4_0= ruleVSSSSystemInterfaceRequirements )
            // InternalSSS.g:2905:5: lv_systemInterface_4_0= ruleVSSSSystemInterfaceRequirements
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getVSSSSpecificRequirementsAccess().getSystemInterfaceVSSSSystemInterfaceRequirementsParserRuleCall_4_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_97);
            lv_systemInterface_4_0=ruleVSSSSystemInterfaceRequirements();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getVSSSSpecificRequirementsRule());
              					}
              					set(
              						current,
              						"systemInterface",
              						lv_systemInterface_4_0,
              						"es.uah.aut.srg.micobs.svm.lang.sss.SSS.VSSSSystemInterfaceRequirements");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalSSS.g:2922:3: ( (lv_adaptationMissionization_5_0= ruleVSSSAdaptationMissionizationRequirements ) )
            // InternalSSS.g:2923:4: (lv_adaptationMissionization_5_0= ruleVSSSAdaptationMissionizationRequirements )
            {
            // InternalSSS.g:2923:4: (lv_adaptationMissionization_5_0= ruleVSSSAdaptationMissionizationRequirements )
            // InternalSSS.g:2924:5: lv_adaptationMissionization_5_0= ruleVSSSAdaptationMissionizationRequirements
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getVSSSSpecificRequirementsAccess().getAdaptationMissionizationVSSSAdaptationMissionizationRequirementsParserRuleCall_5_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_98);
            lv_adaptationMissionization_5_0=ruleVSSSAdaptationMissionizationRequirements();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getVSSSSpecificRequirementsRule());
              					}
              					set(
              						current,
              						"adaptationMissionization",
              						lv_adaptationMissionization_5_0,
              						"es.uah.aut.srg.micobs.svm.lang.sss.SSS.VSSSAdaptationMissionizationRequirements");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalSSS.g:2941:3: ( (lv_computerResource_6_0= ruleVSSSComputerResourceRequirements ) )
            // InternalSSS.g:2942:4: (lv_computerResource_6_0= ruleVSSSComputerResourceRequirements )
            {
            // InternalSSS.g:2942:4: (lv_computerResource_6_0= ruleVSSSComputerResourceRequirements )
            // InternalSSS.g:2943:5: lv_computerResource_6_0= ruleVSSSComputerResourceRequirements
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getVSSSSpecificRequirementsAccess().getComputerResourceVSSSComputerResourceRequirementsParserRuleCall_6_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_99);
            lv_computerResource_6_0=ruleVSSSComputerResourceRequirements();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getVSSSSpecificRequirementsRule());
              					}
              					set(
              						current,
              						"computerResource",
              						lv_computerResource_6_0,
              						"es.uah.aut.srg.micobs.svm.lang.sss.SSS.VSSSComputerResourceRequirements");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalSSS.g:2960:3: ( (lv_security_7_0= ruleVSSSSecurityRequirements ) )
            // InternalSSS.g:2961:4: (lv_security_7_0= ruleVSSSSecurityRequirements )
            {
            // InternalSSS.g:2961:4: (lv_security_7_0= ruleVSSSSecurityRequirements )
            // InternalSSS.g:2962:5: lv_security_7_0= ruleVSSSSecurityRequirements
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getVSSSSpecificRequirementsAccess().getSecurityVSSSSecurityRequirementsParserRuleCall_7_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_100);
            lv_security_7_0=ruleVSSSSecurityRequirements();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getVSSSSpecificRequirementsRule());
              					}
              					set(
              						current,
              						"security",
              						lv_security_7_0,
              						"es.uah.aut.srg.micobs.svm.lang.sss.SSS.VSSSSecurityRequirements");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalSSS.g:2979:3: ( (lv_safety_8_0= ruleVSSSSafetyRequirements ) )
            // InternalSSS.g:2980:4: (lv_safety_8_0= ruleVSSSSafetyRequirements )
            {
            // InternalSSS.g:2980:4: (lv_safety_8_0= ruleVSSSSafetyRequirements )
            // InternalSSS.g:2981:5: lv_safety_8_0= ruleVSSSSafetyRequirements
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getVSSSSpecificRequirementsAccess().getSafetyVSSSSafetyRequirementsParserRuleCall_8_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_101);
            lv_safety_8_0=ruleVSSSSafetyRequirements();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getVSSSSpecificRequirementsRule());
              					}
              					set(
              						current,
              						"safety",
              						lv_safety_8_0,
              						"es.uah.aut.srg.micobs.svm.lang.sss.SSS.VSSSSafetyRequirements");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalSSS.g:2998:3: ( (lv_reliabilityAvailability_9_0= ruleVSSSReliabilityAvailabilityRequirements ) )
            // InternalSSS.g:2999:4: (lv_reliabilityAvailability_9_0= ruleVSSSReliabilityAvailabilityRequirements )
            {
            // InternalSSS.g:2999:4: (lv_reliabilityAvailability_9_0= ruleVSSSReliabilityAvailabilityRequirements )
            // InternalSSS.g:3000:5: lv_reliabilityAvailability_9_0= ruleVSSSReliabilityAvailabilityRequirements
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getVSSSSpecificRequirementsAccess().getReliabilityAvailabilityVSSSReliabilityAvailabilityRequirementsParserRuleCall_9_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_102);
            lv_reliabilityAvailability_9_0=ruleVSSSReliabilityAvailabilityRequirements();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getVSSSSpecificRequirementsRule());
              					}
              					set(
              						current,
              						"reliabilityAvailability",
              						lv_reliabilityAvailability_9_0,
              						"es.uah.aut.srg.micobs.svm.lang.sss.SSS.VSSSReliabilityAvailabilityRequirements");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalSSS.g:3017:3: ( (lv_quality_10_0= ruleVSSSQualityRequirements ) )
            // InternalSSS.g:3018:4: (lv_quality_10_0= ruleVSSSQualityRequirements )
            {
            // InternalSSS.g:3018:4: (lv_quality_10_0= ruleVSSSQualityRequirements )
            // InternalSSS.g:3019:5: lv_quality_10_0= ruleVSSSQualityRequirements
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getVSSSSpecificRequirementsAccess().getQualityVSSSQualityRequirementsParserRuleCall_10_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_103);
            lv_quality_10_0=ruleVSSSQualityRequirements();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getVSSSSpecificRequirementsRule());
              					}
              					set(
              						current,
              						"quality",
              						lv_quality_10_0,
              						"es.uah.aut.srg.micobs.svm.lang.sss.SSS.VSSSQualityRequirements");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalSSS.g:3036:3: ( (lv_design_11_0= ruleVSSSDesignRequirements ) )
            // InternalSSS.g:3037:4: (lv_design_11_0= ruleVSSSDesignRequirements )
            {
            // InternalSSS.g:3037:4: (lv_design_11_0= ruleVSSSDesignRequirements )
            // InternalSSS.g:3038:5: lv_design_11_0= ruleVSSSDesignRequirements
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getVSSSSpecificRequirementsAccess().getDesignVSSSDesignRequirementsParserRuleCall_11_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_104);
            lv_design_11_0=ruleVSSSDesignRequirements();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getVSSSSpecificRequirementsRule());
              					}
              					set(
              						current,
              						"design",
              						lv_design_11_0,
              						"es.uah.aut.srg.micobs.svm.lang.sss.SSS.VSSSDesignRequirements");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalSSS.g:3055:3: ( (lv_softwareOperations_12_0= ruleVSSSSoftwareOperationsRequirements ) )
            // InternalSSS.g:3056:4: (lv_softwareOperations_12_0= ruleVSSSSoftwareOperationsRequirements )
            {
            // InternalSSS.g:3056:4: (lv_softwareOperations_12_0= ruleVSSSSoftwareOperationsRequirements )
            // InternalSSS.g:3057:5: lv_softwareOperations_12_0= ruleVSSSSoftwareOperationsRequirements
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getVSSSSpecificRequirementsAccess().getSoftwareOperationsVSSSSoftwareOperationsRequirementsParserRuleCall_12_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_105);
            lv_softwareOperations_12_0=ruleVSSSSoftwareOperationsRequirements();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getVSSSSpecificRequirementsRule());
              					}
              					set(
              						current,
              						"softwareOperations",
              						lv_softwareOperations_12_0,
              						"es.uah.aut.srg.micobs.svm.lang.sss.SSS.VSSSSoftwareOperationsRequirements");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalSSS.g:3074:3: ( (lv_softwareMaintenance_13_0= ruleVSSSSoftwareMaintenanceRequirements ) )
            // InternalSSS.g:3075:4: (lv_softwareMaintenance_13_0= ruleVSSSSoftwareMaintenanceRequirements )
            {
            // InternalSSS.g:3075:4: (lv_softwareMaintenance_13_0= ruleVSSSSoftwareMaintenanceRequirements )
            // InternalSSS.g:3076:5: lv_softwareMaintenance_13_0= ruleVSSSSoftwareMaintenanceRequirements
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getVSSSSpecificRequirementsAccess().getSoftwareMaintenanceVSSSSoftwareMaintenanceRequirementsParserRuleCall_13_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_106);
            lv_softwareMaintenance_13_0=ruleVSSSSoftwareMaintenanceRequirements();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getVSSSSpecificRequirementsRule());
              					}
              					set(
              						current,
              						"softwareMaintenance",
              						lv_softwareMaintenance_13_0,
              						"es.uah.aut.srg.micobs.svm.lang.sss.SSS.VSSSSoftwareMaintenanceRequirements");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalSSS.g:3093:3: ( (lv_systemSoftwareObservability_14_0= ruleVSSSSystemSoftwareObservabilityRequirements ) )
            // InternalSSS.g:3094:4: (lv_systemSoftwareObservability_14_0= ruleVSSSSystemSoftwareObservabilityRequirements )
            {
            // InternalSSS.g:3094:4: (lv_systemSoftwareObservability_14_0= ruleVSSSSystemSoftwareObservabilityRequirements )
            // InternalSSS.g:3095:5: lv_systemSoftwareObservability_14_0= ruleVSSSSystemSoftwareObservabilityRequirements
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getVSSSSpecificRequirementsAccess().getSystemSoftwareObservabilityVSSSSystemSoftwareObservabilityRequirementsParserRuleCall_14_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_107);
            lv_systemSoftwareObservability_14_0=ruleVSSSSystemSoftwareObservabilityRequirements();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getVSSSSpecificRequirementsRule());
              					}
              					set(
              						current,
              						"systemSoftwareObservability",
              						lv_systemSoftwareObservability_14_0,
              						"es.uah.aut.srg.micobs.svm.lang.sss.SSS.VSSSSystemSoftwareObservabilityRequirements");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_15=(Token)match(input,86,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_15, grammarAccess.getVSSSSpecificRequirementsAccess().getSpecificRequirementsKeyword_15());
              		
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
    // $ANTLR end "ruleVSSSSpecificRequirements"


    // $ANTLR start "entryRuleVSSSVerificationValidationIntegrationRequirements"
    // InternalSSS.g:3120:1: entryRuleVSSSVerificationValidationIntegrationRequirements returns [EObject current=null] : iv_ruleVSSSVerificationValidationIntegrationRequirements= ruleVSSSVerificationValidationIntegrationRequirements EOF ;
    public final EObject entryRuleVSSSVerificationValidationIntegrationRequirements() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVSSSVerificationValidationIntegrationRequirements = null;


        try {
            // InternalSSS.g:3120:90: (iv_ruleVSSSVerificationValidationIntegrationRequirements= ruleVSSSVerificationValidationIntegrationRequirements EOF )
            // InternalSSS.g:3121:2: iv_ruleVSSSVerificationValidationIntegrationRequirements= ruleVSSSVerificationValidationIntegrationRequirements EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getVSSSVerificationValidationIntegrationRequirementsRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleVSSSVerificationValidationIntegrationRequirements=ruleVSSSVerificationValidationIntegrationRequirements();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleVSSSVerificationValidationIntegrationRequirements; 
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
    // $ANTLR end "entryRuleVSSSVerificationValidationIntegrationRequirements"


    // $ANTLR start "ruleVSSSVerificationValidationIntegrationRequirements"
    // InternalSSS.g:3127:1: ruleVSSSVerificationValidationIntegrationRequirements returns [EObject current=null] : (otherlv_0= '<VerificationValidationIntegrationRequirements>' ( (lv_sectionDescription_1_0= ruleDBody ) )? ( (lv_verificationValidationProcess_2_0= ruleVSSSVerificationValidationProcessRequirements ) ) ( (lv_validationApproach_3_0= ruleVSSSValidationApproach ) ) ( (lv_validation_4_0= ruleVSSSValidationRequirements ) ) ( (lv_verification_5_0= ruleVSSSVerificationRequirements ) ) otherlv_6= '</VerificationValidationIntegrationRequirements>' ) ;
    public final EObject ruleVSSSVerificationValidationIntegrationRequirements() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_6=null;
        EObject lv_sectionDescription_1_0 = null;

        EObject lv_verificationValidationProcess_2_0 = null;

        EObject lv_validationApproach_3_0 = null;

        EObject lv_validation_4_0 = null;

        EObject lv_verification_5_0 = null;



        	enterRule();

        try {
            // InternalSSS.g:3133:2: ( (otherlv_0= '<VerificationValidationIntegrationRequirements>' ( (lv_sectionDescription_1_0= ruleDBody ) )? ( (lv_verificationValidationProcess_2_0= ruleVSSSVerificationValidationProcessRequirements ) ) ( (lv_validationApproach_3_0= ruleVSSSValidationApproach ) ) ( (lv_validation_4_0= ruleVSSSValidationRequirements ) ) ( (lv_verification_5_0= ruleVSSSVerificationRequirements ) ) otherlv_6= '</VerificationValidationIntegrationRequirements>' ) )
            // InternalSSS.g:3134:2: (otherlv_0= '<VerificationValidationIntegrationRequirements>' ( (lv_sectionDescription_1_0= ruleDBody ) )? ( (lv_verificationValidationProcess_2_0= ruleVSSSVerificationValidationProcessRequirements ) ) ( (lv_validationApproach_3_0= ruleVSSSValidationApproach ) ) ( (lv_validation_4_0= ruleVSSSValidationRequirements ) ) ( (lv_verification_5_0= ruleVSSSVerificationRequirements ) ) otherlv_6= '</VerificationValidationIntegrationRequirements>' )
            {
            // InternalSSS.g:3134:2: (otherlv_0= '<VerificationValidationIntegrationRequirements>' ( (lv_sectionDescription_1_0= ruleDBody ) )? ( (lv_verificationValidationProcess_2_0= ruleVSSSVerificationValidationProcessRequirements ) ) ( (lv_validationApproach_3_0= ruleVSSSValidationApproach ) ) ( (lv_validation_4_0= ruleVSSSValidationRequirements ) ) ( (lv_verification_5_0= ruleVSSSVerificationRequirements ) ) otherlv_6= '</VerificationValidationIntegrationRequirements>' )
            // InternalSSS.g:3135:3: otherlv_0= '<VerificationValidationIntegrationRequirements>' ( (lv_sectionDescription_1_0= ruleDBody ) )? ( (lv_verificationValidationProcess_2_0= ruleVSSSVerificationValidationProcessRequirements ) ) ( (lv_validationApproach_3_0= ruleVSSSValidationApproach ) ) ( (lv_validation_4_0= ruleVSSSValidationRequirements ) ) ( (lv_verification_5_0= ruleVSSSVerificationRequirements ) ) otherlv_6= '</VerificationValidationIntegrationRequirements>'
            {
            otherlv_0=(Token)match(input,87,FollowSets000.FOLLOW_108); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getVSSSVerificationValidationIntegrationRequirementsAccess().getVerificationValidationIntegrationRequirementsKeyword_0());
              		
            }
            // InternalSSS.g:3139:3: ( (lv_sectionDescription_1_0= ruleDBody ) )?
            int alt55=2;
            int LA55_0 = input.LA(1);

            if ( (LA55_0==21) ) {
                alt55=1;
            }
            switch (alt55) {
                case 1 :
                    // InternalSSS.g:3140:4: (lv_sectionDescription_1_0= ruleDBody )
                    {
                    // InternalSSS.g:3140:4: (lv_sectionDescription_1_0= ruleDBody )
                    // InternalSSS.g:3141:5: lv_sectionDescription_1_0= ruleDBody
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getVSSSVerificationValidationIntegrationRequirementsAccess().getSectionDescriptionDBodyParserRuleCall_1_0());
                      				
                    }
                    pushFollow(FollowSets000.FOLLOW_108);
                    lv_sectionDescription_1_0=ruleDBody();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getVSSSVerificationValidationIntegrationRequirementsRule());
                      					}
                      					set(
                      						current,
                      						"sectionDescription",
                      						lv_sectionDescription_1_0,
                      						"es.uah.aut.srg.micobs.svm.lang.sss.SSS.DBody");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }
                    break;

            }

            // InternalSSS.g:3158:3: ( (lv_verificationValidationProcess_2_0= ruleVSSSVerificationValidationProcessRequirements ) )
            // InternalSSS.g:3159:4: (lv_verificationValidationProcess_2_0= ruleVSSSVerificationValidationProcessRequirements )
            {
            // InternalSSS.g:3159:4: (lv_verificationValidationProcess_2_0= ruleVSSSVerificationValidationProcessRequirements )
            // InternalSSS.g:3160:5: lv_verificationValidationProcess_2_0= ruleVSSSVerificationValidationProcessRequirements
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getVSSSVerificationValidationIntegrationRequirementsAccess().getVerificationValidationProcessVSSSVerificationValidationProcessRequirementsParserRuleCall_2_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_109);
            lv_verificationValidationProcess_2_0=ruleVSSSVerificationValidationProcessRequirements();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getVSSSVerificationValidationIntegrationRequirementsRule());
              					}
              					set(
              						current,
              						"verificationValidationProcess",
              						lv_verificationValidationProcess_2_0,
              						"es.uah.aut.srg.micobs.svm.lang.sss.SSS.VSSSVerificationValidationProcessRequirements");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalSSS.g:3177:3: ( (lv_validationApproach_3_0= ruleVSSSValidationApproach ) )
            // InternalSSS.g:3178:4: (lv_validationApproach_3_0= ruleVSSSValidationApproach )
            {
            // InternalSSS.g:3178:4: (lv_validationApproach_3_0= ruleVSSSValidationApproach )
            // InternalSSS.g:3179:5: lv_validationApproach_3_0= ruleVSSSValidationApproach
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getVSSSVerificationValidationIntegrationRequirementsAccess().getValidationApproachVSSSValidationApproachParserRuleCall_3_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_110);
            lv_validationApproach_3_0=ruleVSSSValidationApproach();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getVSSSVerificationValidationIntegrationRequirementsRule());
              					}
              					set(
              						current,
              						"validationApproach",
              						lv_validationApproach_3_0,
              						"es.uah.aut.srg.micobs.svm.lang.sss.SSS.VSSSValidationApproach");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalSSS.g:3196:3: ( (lv_validation_4_0= ruleVSSSValidationRequirements ) )
            // InternalSSS.g:3197:4: (lv_validation_4_0= ruleVSSSValidationRequirements )
            {
            // InternalSSS.g:3197:4: (lv_validation_4_0= ruleVSSSValidationRequirements )
            // InternalSSS.g:3198:5: lv_validation_4_0= ruleVSSSValidationRequirements
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getVSSSVerificationValidationIntegrationRequirementsAccess().getValidationVSSSValidationRequirementsParserRuleCall_4_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_111);
            lv_validation_4_0=ruleVSSSValidationRequirements();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getVSSSVerificationValidationIntegrationRequirementsRule());
              					}
              					set(
              						current,
              						"validation",
              						lv_validation_4_0,
              						"es.uah.aut.srg.micobs.svm.lang.sss.SSS.VSSSValidationRequirements");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalSSS.g:3215:3: ( (lv_verification_5_0= ruleVSSSVerificationRequirements ) )
            // InternalSSS.g:3216:4: (lv_verification_5_0= ruleVSSSVerificationRequirements )
            {
            // InternalSSS.g:3216:4: (lv_verification_5_0= ruleVSSSVerificationRequirements )
            // InternalSSS.g:3217:5: lv_verification_5_0= ruleVSSSVerificationRequirements
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getVSSSVerificationValidationIntegrationRequirementsAccess().getVerificationVSSSVerificationRequirementsParserRuleCall_5_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_112);
            lv_verification_5_0=ruleVSSSVerificationRequirements();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getVSSSVerificationValidationIntegrationRequirementsRule());
              					}
              					set(
              						current,
              						"verification",
              						lv_verification_5_0,
              						"es.uah.aut.srg.micobs.svm.lang.sss.SSS.VSSSVerificationRequirements");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_6=(Token)match(input,88,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_6, grammarAccess.getVSSSVerificationValidationIntegrationRequirementsAccess().getVerificationValidationIntegrationRequirementsKeyword_6());
              		
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
    // $ANTLR end "ruleVSSSVerificationValidationIntegrationRequirements"


    // $ANTLR start "entryRuleVSSSSystemModels"
    // InternalSSS.g:3242:1: entryRuleVSSSSystemModels returns [EObject current=null] : iv_ruleVSSSSystemModels= ruleVSSSSystemModels EOF ;
    public final EObject entryRuleVSSSSystemModels() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVSSSSystemModels = null;


        try {
            // InternalSSS.g:3242:57: (iv_ruleVSSSSystemModels= ruleVSSSSystemModels EOF )
            // InternalSSS.g:3243:2: iv_ruleVSSSSystemModels= ruleVSSSSystemModels EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getVSSSSystemModelsRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleVSSSSystemModels=ruleVSSSSystemModels();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleVSSSSystemModels; 
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
    // $ANTLR end "entryRuleVSSSSystemModels"


    // $ANTLR start "ruleVSSSSystemModels"
    // InternalSSS.g:3249:1: ruleVSSSSystemModels returns [EObject current=null] : ( () otherlv_1= '<SystemModels>' ( (lv_systemModels_2_0= ruleVSSSSystemModel ) )* otherlv_3= '</SystemModels>' ) ;
    public final EObject ruleVSSSSystemModels() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_systemModels_2_0 = null;



        	enterRule();

        try {
            // InternalSSS.g:3255:2: ( ( () otherlv_1= '<SystemModels>' ( (lv_systemModels_2_0= ruleVSSSSystemModel ) )* otherlv_3= '</SystemModels>' ) )
            // InternalSSS.g:3256:2: ( () otherlv_1= '<SystemModels>' ( (lv_systemModels_2_0= ruleVSSSSystemModel ) )* otherlv_3= '</SystemModels>' )
            {
            // InternalSSS.g:3256:2: ( () otherlv_1= '<SystemModels>' ( (lv_systemModels_2_0= ruleVSSSSystemModel ) )* otherlv_3= '</SystemModels>' )
            // InternalSSS.g:3257:3: () otherlv_1= '<SystemModels>' ( (lv_systemModels_2_0= ruleVSSSSystemModel ) )* otherlv_3= '</SystemModels>'
            {
            // InternalSSS.g:3257:3: ()
            // InternalSSS.g:3258:4: 
            {
            if ( state.backtracking==0 ) {

              				/* */
              			
            }
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getVSSSSystemModelsAccess().getVSSSSystemModelsAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,89,FollowSets000.FOLLOW_113); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getVSSSSystemModelsAccess().getSystemModelsKeyword_1());
              		
            }
            // InternalSSS.g:3271:3: ( (lv_systemModels_2_0= ruleVSSSSystemModel ) )*
            loop56:
            do {
                int alt56=2;
                int LA56_0 = input.LA(1);

                if ( (LA56_0==138) ) {
                    alt56=1;
                }


                switch (alt56) {
            	case 1 :
            	    // InternalSSS.g:3272:4: (lv_systemModels_2_0= ruleVSSSSystemModel )
            	    {
            	    // InternalSSS.g:3272:4: (lv_systemModels_2_0= ruleVSSSSystemModel )
            	    // InternalSSS.g:3273:5: lv_systemModels_2_0= ruleVSSSSystemModel
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getVSSSSystemModelsAccess().getSystemModelsVSSSSystemModelParserRuleCall_2_0());
            	      				
            	    }
            	    pushFollow(FollowSets000.FOLLOW_113);
            	    lv_systemModels_2_0=ruleVSSSSystemModel();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getVSSSSystemModelsRule());
            	      					}
            	      					add(
            	      						current,
            	      						"systemModels",
            	      						lv_systemModels_2_0,
            	      						"es.uah.aut.srg.micobs.svm.lang.sss.SSS.VSSSSystemModel");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop56;
                }
            } while (true);

            otherlv_3=(Token)match(input,90,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getVSSSSystemModelsAccess().getSystemModelsKeyword_3());
              		
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
    // $ANTLR end "ruleVSSSSystemModels"


    // $ANTLR start "entryRuleVSSSTerm"
    // InternalSSS.g:3298:1: entryRuleVSSSTerm returns [EObject current=null] : iv_ruleVSSSTerm= ruleVSSSTerm EOF ;
    public final EObject entryRuleVSSSTerm() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVSSSTerm = null;


        try {
            // InternalSSS.g:3298:49: (iv_ruleVSSSTerm= ruleVSSSTerm EOF )
            // InternalSSS.g:3299:2: iv_ruleVSSSTerm= ruleVSSSTerm EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getVSSSTermRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleVSSSTerm=ruleVSSSTerm();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleVSSSTerm; 
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
    // $ANTLR end "entryRuleVSSSTerm"


    // $ANTLR start "ruleVSSSTerm"
    // InternalSSS.g:3305:1: ruleVSSSTerm returns [EObject current=null] : (otherlv_0= '<Term' otherlv_1= 'name=' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= '>' ( (lv_description_4_0= ruleDRun ) ) otherlv_5= '</Term>' ) ;
    public final EObject ruleVSSSTerm() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_description_4_0 = null;



        	enterRule();

        try {
            // InternalSSS.g:3311:2: ( (otherlv_0= '<Term' otherlv_1= 'name=' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= '>' ( (lv_description_4_0= ruleDRun ) ) otherlv_5= '</Term>' ) )
            // InternalSSS.g:3312:2: (otherlv_0= '<Term' otherlv_1= 'name=' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= '>' ( (lv_description_4_0= ruleDRun ) ) otherlv_5= '</Term>' )
            {
            // InternalSSS.g:3312:2: (otherlv_0= '<Term' otherlv_1= 'name=' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= '>' ( (lv_description_4_0= ruleDRun ) ) otherlv_5= '</Term>' )
            // InternalSSS.g:3313:3: otherlv_0= '<Term' otherlv_1= 'name=' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= '>' ( (lv_description_4_0= ruleDRun ) ) otherlv_5= '</Term>'
            {
            otherlv_0=(Token)match(input,91,FollowSets000.FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getVSSSTermAccess().getTermKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,14,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getVSSSTermAccess().getNameKeyword_1());
              		
            }
            // InternalSSS.g:3321:3: ( (lv_name_2_0= RULE_STRING ) )
            // InternalSSS.g:3322:4: (lv_name_2_0= RULE_STRING )
            {
            // InternalSSS.g:3322:4: (lv_name_2_0= RULE_STRING )
            // InternalSSS.g:3323:5: lv_name_2_0= RULE_STRING
            {
            lv_name_2_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_10); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_2_0, grammarAccess.getVSSSTermAccess().getNameSTRINGTerminalRuleCall_2_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getVSSSTermRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_2_0,
              						"org.eclipse.xtext.common.Terminals.STRING");
              				
            }

            }


            }

            otherlv_3=(Token)match(input,19,FollowSets000.FOLLOW_114); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getVSSSTermAccess().getGreaterThanSignKeyword_3());
              		
            }
            // InternalSSS.g:3343:3: ( (lv_description_4_0= ruleDRun ) )
            // InternalSSS.g:3344:4: (lv_description_4_0= ruleDRun )
            {
            // InternalSSS.g:3344:4: (lv_description_4_0= ruleDRun )
            // InternalSSS.g:3345:5: lv_description_4_0= ruleDRun
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getVSSSTermAccess().getDescriptionDRunParserRuleCall_4_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_115);
            lv_description_4_0=ruleDRun();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getVSSSTermRule());
              					}
              					set(
              						current,
              						"description",
              						lv_description_4_0,
              						"es.uah.aut.srg.micobs.svm.lang.sss.SSS.DRun");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_5=(Token)match(input,92,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getVSSSTermAccess().getTermKeyword_5());
              		
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
    // $ANTLR end "ruleVSSSTerm"


    // $ANTLR start "entryRuleVSSSDefinition"
    // InternalSSS.g:3370:1: entryRuleVSSSDefinition returns [EObject current=null] : iv_ruleVSSSDefinition= ruleVSSSDefinition EOF ;
    public final EObject entryRuleVSSSDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVSSSDefinition = null;


        try {
            // InternalSSS.g:3370:55: (iv_ruleVSSSDefinition= ruleVSSSDefinition EOF )
            // InternalSSS.g:3371:2: iv_ruleVSSSDefinition= ruleVSSSDefinition EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getVSSSDefinitionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleVSSSDefinition=ruleVSSSDefinition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleVSSSDefinition; 
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
    // $ANTLR end "entryRuleVSSSDefinition"


    // $ANTLR start "ruleVSSSDefinition"
    // InternalSSS.g:3377:1: ruleVSSSDefinition returns [EObject current=null] : (otherlv_0= '<Definition' otherlv_1= 'name=' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= '>' ( (lv_description_4_0= ruleDRun ) ) otherlv_5= '</Definition>' ) ;
    public final EObject ruleVSSSDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_description_4_0 = null;



        	enterRule();

        try {
            // InternalSSS.g:3383:2: ( (otherlv_0= '<Definition' otherlv_1= 'name=' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= '>' ( (lv_description_4_0= ruleDRun ) ) otherlv_5= '</Definition>' ) )
            // InternalSSS.g:3384:2: (otherlv_0= '<Definition' otherlv_1= 'name=' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= '>' ( (lv_description_4_0= ruleDRun ) ) otherlv_5= '</Definition>' )
            {
            // InternalSSS.g:3384:2: (otherlv_0= '<Definition' otherlv_1= 'name=' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= '>' ( (lv_description_4_0= ruleDRun ) ) otherlv_5= '</Definition>' )
            // InternalSSS.g:3385:3: otherlv_0= '<Definition' otherlv_1= 'name=' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= '>' ( (lv_description_4_0= ruleDRun ) ) otherlv_5= '</Definition>'
            {
            otherlv_0=(Token)match(input,93,FollowSets000.FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getVSSSDefinitionAccess().getDefinitionKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,14,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getVSSSDefinitionAccess().getNameKeyword_1());
              		
            }
            // InternalSSS.g:3393:3: ( (lv_name_2_0= RULE_STRING ) )
            // InternalSSS.g:3394:4: (lv_name_2_0= RULE_STRING )
            {
            // InternalSSS.g:3394:4: (lv_name_2_0= RULE_STRING )
            // InternalSSS.g:3395:5: lv_name_2_0= RULE_STRING
            {
            lv_name_2_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_10); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_2_0, grammarAccess.getVSSSDefinitionAccess().getNameSTRINGTerminalRuleCall_2_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getVSSSDefinitionRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_2_0,
              						"org.eclipse.xtext.common.Terminals.STRING");
              				
            }

            }


            }

            otherlv_3=(Token)match(input,19,FollowSets000.FOLLOW_114); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getVSSSDefinitionAccess().getGreaterThanSignKeyword_3());
              		
            }
            // InternalSSS.g:3415:3: ( (lv_description_4_0= ruleDRun ) )
            // InternalSSS.g:3416:4: (lv_description_4_0= ruleDRun )
            {
            // InternalSSS.g:3416:4: (lv_description_4_0= ruleDRun )
            // InternalSSS.g:3417:5: lv_description_4_0= ruleDRun
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getVSSSDefinitionAccess().getDescriptionDRunParserRuleCall_4_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_116);
            lv_description_4_0=ruleDRun();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getVSSSDefinitionRule());
              					}
              					set(
              						current,
              						"description",
              						lv_description_4_0,
              						"es.uah.aut.srg.micobs.svm.lang.sss.SSS.DRun");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_5=(Token)match(input,94,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getVSSSDefinitionAccess().getDefinitionKeyword_5());
              		
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
    // $ANTLR end "ruleVSSSDefinition"


    // $ANTLR start "entryRuleVSSSAbbreviation"
    // InternalSSS.g:3442:1: entryRuleVSSSAbbreviation returns [EObject current=null] : iv_ruleVSSSAbbreviation= ruleVSSSAbbreviation EOF ;
    public final EObject entryRuleVSSSAbbreviation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVSSSAbbreviation = null;


        try {
            // InternalSSS.g:3442:57: (iv_ruleVSSSAbbreviation= ruleVSSSAbbreviation EOF )
            // InternalSSS.g:3443:2: iv_ruleVSSSAbbreviation= ruleVSSSAbbreviation EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getVSSSAbbreviationRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleVSSSAbbreviation=ruleVSSSAbbreviation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleVSSSAbbreviation; 
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
    // $ANTLR end "entryRuleVSSSAbbreviation"


    // $ANTLR start "ruleVSSSAbbreviation"
    // InternalSSS.g:3449:1: ruleVSSSAbbreviation returns [EObject current=null] : (otherlv_0= '<Abbreviation' otherlv_1= 'name=' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= '>' ( (lv_description_4_0= ruleDRun ) ) otherlv_5= '</Abbreviation>' ) ;
    public final EObject ruleVSSSAbbreviation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_description_4_0 = null;



        	enterRule();

        try {
            // InternalSSS.g:3455:2: ( (otherlv_0= '<Abbreviation' otherlv_1= 'name=' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= '>' ( (lv_description_4_0= ruleDRun ) ) otherlv_5= '</Abbreviation>' ) )
            // InternalSSS.g:3456:2: (otherlv_0= '<Abbreviation' otherlv_1= 'name=' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= '>' ( (lv_description_4_0= ruleDRun ) ) otherlv_5= '</Abbreviation>' )
            {
            // InternalSSS.g:3456:2: (otherlv_0= '<Abbreviation' otherlv_1= 'name=' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= '>' ( (lv_description_4_0= ruleDRun ) ) otherlv_5= '</Abbreviation>' )
            // InternalSSS.g:3457:3: otherlv_0= '<Abbreviation' otherlv_1= 'name=' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= '>' ( (lv_description_4_0= ruleDRun ) ) otherlv_5= '</Abbreviation>'
            {
            otherlv_0=(Token)match(input,95,FollowSets000.FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getVSSSAbbreviationAccess().getAbbreviationKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,14,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getVSSSAbbreviationAccess().getNameKeyword_1());
              		
            }
            // InternalSSS.g:3465:3: ( (lv_name_2_0= RULE_STRING ) )
            // InternalSSS.g:3466:4: (lv_name_2_0= RULE_STRING )
            {
            // InternalSSS.g:3466:4: (lv_name_2_0= RULE_STRING )
            // InternalSSS.g:3467:5: lv_name_2_0= RULE_STRING
            {
            lv_name_2_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_10); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_2_0, grammarAccess.getVSSSAbbreviationAccess().getNameSTRINGTerminalRuleCall_2_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getVSSSAbbreviationRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_2_0,
              						"org.eclipse.xtext.common.Terminals.STRING");
              				
            }

            }


            }

            otherlv_3=(Token)match(input,19,FollowSets000.FOLLOW_114); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getVSSSAbbreviationAccess().getGreaterThanSignKeyword_3());
              		
            }
            // InternalSSS.g:3487:3: ( (lv_description_4_0= ruleDRun ) )
            // InternalSSS.g:3488:4: (lv_description_4_0= ruleDRun )
            {
            // InternalSSS.g:3488:4: (lv_description_4_0= ruleDRun )
            // InternalSSS.g:3489:5: lv_description_4_0= ruleDRun
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getVSSSAbbreviationAccess().getDescriptionDRunParserRuleCall_4_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_117);
            lv_description_4_0=ruleDRun();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getVSSSAbbreviationRule());
              					}
              					set(
              						current,
              						"description",
              						lv_description_4_0,
              						"es.uah.aut.srg.micobs.svm.lang.sss.SSS.DRun");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_5=(Token)match(input,96,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getVSSSAbbreviationAccess().getAbbreviationKeyword_5());
              		
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
    // $ANTLR end "ruleVSSSAbbreviation"


    // $ANTLR start "entryRuleVSSSInstantiableRequirementSection"
    // InternalSSS.g:3514:1: entryRuleVSSSInstantiableRequirementSection returns [EObject current=null] : iv_ruleVSSSInstantiableRequirementSection= ruleVSSSInstantiableRequirementSection EOF ;
    public final EObject entryRuleVSSSInstantiableRequirementSection() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVSSSInstantiableRequirementSection = null;


        try {
            // InternalSSS.g:3514:75: (iv_ruleVSSSInstantiableRequirementSection= ruleVSSSInstantiableRequirementSection EOF )
            // InternalSSS.g:3515:2: iv_ruleVSSSInstantiableRequirementSection= ruleVSSSInstantiableRequirementSection EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getVSSSInstantiableRequirementSectionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleVSSSInstantiableRequirementSection=ruleVSSSInstantiableRequirementSection();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleVSSSInstantiableRequirementSection; 
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
    // $ANTLR end "entryRuleVSSSInstantiableRequirementSection"


    // $ANTLR start "ruleVSSSInstantiableRequirementSection"
    // InternalSSS.g:3521:1: ruleVSSSInstantiableRequirementSection returns [EObject current=null] : (otherlv_0= '<subsection' otherlv_1= 'name=' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= '>' ( (lv_sectionDescription_4_0= ruleDBody ) )? ( (lv_sssItems_5_0= ruleVSSSDocumentItem ) )* otherlv_6= '</subsection>' ) ;
    public final EObject ruleVSSSInstantiableRequirementSection() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_6=null;
        EObject lv_sectionDescription_4_0 = null;

        EObject lv_sssItems_5_0 = null;



        	enterRule();

        try {
            // InternalSSS.g:3527:2: ( (otherlv_0= '<subsection' otherlv_1= 'name=' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= '>' ( (lv_sectionDescription_4_0= ruleDBody ) )? ( (lv_sssItems_5_0= ruleVSSSDocumentItem ) )* otherlv_6= '</subsection>' ) )
            // InternalSSS.g:3528:2: (otherlv_0= '<subsection' otherlv_1= 'name=' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= '>' ( (lv_sectionDescription_4_0= ruleDBody ) )? ( (lv_sssItems_5_0= ruleVSSSDocumentItem ) )* otherlv_6= '</subsection>' )
            {
            // InternalSSS.g:3528:2: (otherlv_0= '<subsection' otherlv_1= 'name=' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= '>' ( (lv_sectionDescription_4_0= ruleDBody ) )? ( (lv_sssItems_5_0= ruleVSSSDocumentItem ) )* otherlv_6= '</subsection>' )
            // InternalSSS.g:3529:3: otherlv_0= '<subsection' otherlv_1= 'name=' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= '>' ( (lv_sectionDescription_4_0= ruleDBody ) )? ( (lv_sssItems_5_0= ruleVSSSDocumentItem ) )* otherlv_6= '</subsection>'
            {
            otherlv_0=(Token)match(input,63,FollowSets000.FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getVSSSInstantiableRequirementSectionAccess().getSubsectionKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,14,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getVSSSInstantiableRequirementSectionAccess().getNameKeyword_1());
              		
            }
            // InternalSSS.g:3537:3: ( (lv_name_2_0= RULE_STRING ) )
            // InternalSSS.g:3538:4: (lv_name_2_0= RULE_STRING )
            {
            // InternalSSS.g:3538:4: (lv_name_2_0= RULE_STRING )
            // InternalSSS.g:3539:5: lv_name_2_0= RULE_STRING
            {
            lv_name_2_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_10); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_2_0, grammarAccess.getVSSSInstantiableRequirementSectionAccess().getNameSTRINGTerminalRuleCall_2_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getVSSSInstantiableRequirementSectionRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_2_0,
              						"org.eclipse.xtext.common.Terminals.STRING");
              				
            }

            }


            }

            otherlv_3=(Token)match(input,19,FollowSets000.FOLLOW_118); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getVSSSInstantiableRequirementSectionAccess().getGreaterThanSignKeyword_3());
              		
            }
            // InternalSSS.g:3559:3: ( (lv_sectionDescription_4_0= ruleDBody ) )?
            int alt57=2;
            int LA57_0 = input.LA(1);

            if ( (LA57_0==21) ) {
                alt57=1;
            }
            switch (alt57) {
                case 1 :
                    // InternalSSS.g:3560:4: (lv_sectionDescription_4_0= ruleDBody )
                    {
                    // InternalSSS.g:3560:4: (lv_sectionDescription_4_0= ruleDBody )
                    // InternalSSS.g:3561:5: lv_sectionDescription_4_0= ruleDBody
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getVSSSInstantiableRequirementSectionAccess().getSectionDescriptionDBodyParserRuleCall_4_0());
                      				
                    }
                    pushFollow(FollowSets000.FOLLOW_119);
                    lv_sectionDescription_4_0=ruleDBody();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getVSSSInstantiableRequirementSectionRule());
                      					}
                      					set(
                      						current,
                      						"sectionDescription",
                      						lv_sectionDescription_4_0,
                      						"es.uah.aut.srg.micobs.svm.lang.sss.SSS.DBody");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }
                    break;

            }

            // InternalSSS.g:3578:3: ( (lv_sssItems_5_0= ruleVSSSDocumentItem ) )*
            loop58:
            do {
                int alt58=2;
                int LA58_0 = input.LA(1);

                if ( (LA58_0==123) ) {
                    alt58=1;
                }


                switch (alt58) {
            	case 1 :
            	    // InternalSSS.g:3579:4: (lv_sssItems_5_0= ruleVSSSDocumentItem )
            	    {
            	    // InternalSSS.g:3579:4: (lv_sssItems_5_0= ruleVSSSDocumentItem )
            	    // InternalSSS.g:3580:5: lv_sssItems_5_0= ruleVSSSDocumentItem
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getVSSSInstantiableRequirementSectionAccess().getSssItemsVSSSDocumentItemParserRuleCall_5_0());
            	      				
            	    }
            	    pushFollow(FollowSets000.FOLLOW_119);
            	    lv_sssItems_5_0=ruleVSSSDocumentItem();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getVSSSInstantiableRequirementSectionRule());
            	      					}
            	      					add(
            	      						current,
            	      						"sssItems",
            	      						lv_sssItems_5_0,
            	      						"es.uah.aut.srg.micobs.svm.lang.sss.SSS.VSSSDocumentItem");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop58;
                }
            } while (true);

            otherlv_6=(Token)match(input,64,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_6, grammarAccess.getVSSSInstantiableRequirementSectionAccess().getSubsectionKeyword_6());
              		
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
    // $ANTLR end "ruleVSSSInstantiableRequirementSection"


    // $ANTLR start "entryRuleVSSSGeneralRequirements"
    // InternalSSS.g:3605:1: entryRuleVSSSGeneralRequirements returns [EObject current=null] : iv_ruleVSSSGeneralRequirements= ruleVSSSGeneralRequirements EOF ;
    public final EObject entryRuleVSSSGeneralRequirements() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVSSSGeneralRequirements = null;


        try {
            // InternalSSS.g:3605:64: (iv_ruleVSSSGeneralRequirements= ruleVSSSGeneralRequirements EOF )
            // InternalSSS.g:3606:2: iv_ruleVSSSGeneralRequirements= ruleVSSSGeneralRequirements EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getVSSSGeneralRequirementsRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleVSSSGeneralRequirements=ruleVSSSGeneralRequirements();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleVSSSGeneralRequirements; 
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
    // $ANTLR end "entryRuleVSSSGeneralRequirements"


    // $ANTLR start "ruleVSSSGeneralRequirements"
    // InternalSSS.g:3612:1: ruleVSSSGeneralRequirements returns [EObject current=null] : ( () otherlv_1= '<GeneralRequirements>' ( (lv_sectionDescription_2_0= ruleDBody ) )? ( (lv_sssItems_3_0= ruleVSSSDocumentItem ) )* ( (lv_sssRequirementSubsections_4_0= ruleVSSSInstantiableRequirementSection ) )* otherlv_5= '</GeneralRequirements>' ) ;
    public final EObject ruleVSSSGeneralRequirements() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_5=null;
        EObject lv_sectionDescription_2_0 = null;

        EObject lv_sssItems_3_0 = null;

        EObject lv_sssRequirementSubsections_4_0 = null;



        	enterRule();

        try {
            // InternalSSS.g:3618:2: ( ( () otherlv_1= '<GeneralRequirements>' ( (lv_sectionDescription_2_0= ruleDBody ) )? ( (lv_sssItems_3_0= ruleVSSSDocumentItem ) )* ( (lv_sssRequirementSubsections_4_0= ruleVSSSInstantiableRequirementSection ) )* otherlv_5= '</GeneralRequirements>' ) )
            // InternalSSS.g:3619:2: ( () otherlv_1= '<GeneralRequirements>' ( (lv_sectionDescription_2_0= ruleDBody ) )? ( (lv_sssItems_3_0= ruleVSSSDocumentItem ) )* ( (lv_sssRequirementSubsections_4_0= ruleVSSSInstantiableRequirementSection ) )* otherlv_5= '</GeneralRequirements>' )
            {
            // InternalSSS.g:3619:2: ( () otherlv_1= '<GeneralRequirements>' ( (lv_sectionDescription_2_0= ruleDBody ) )? ( (lv_sssItems_3_0= ruleVSSSDocumentItem ) )* ( (lv_sssRequirementSubsections_4_0= ruleVSSSInstantiableRequirementSection ) )* otherlv_5= '</GeneralRequirements>' )
            // InternalSSS.g:3620:3: () otherlv_1= '<GeneralRequirements>' ( (lv_sectionDescription_2_0= ruleDBody ) )? ( (lv_sssItems_3_0= ruleVSSSDocumentItem ) )* ( (lv_sssRequirementSubsections_4_0= ruleVSSSInstantiableRequirementSection ) )* otherlv_5= '</GeneralRequirements>'
            {
            // InternalSSS.g:3620:3: ()
            // InternalSSS.g:3621:4: 
            {
            if ( state.backtracking==0 ) {

              				/* */
              			
            }
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getVSSSGeneralRequirementsAccess().getVSSSGeneralRequirementsAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,97,FollowSets000.FOLLOW_120); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getVSSSGeneralRequirementsAccess().getGeneralRequirementsKeyword_1());
              		
            }
            // InternalSSS.g:3634:3: ( (lv_sectionDescription_2_0= ruleDBody ) )?
            int alt59=2;
            int LA59_0 = input.LA(1);

            if ( (LA59_0==21) ) {
                alt59=1;
            }
            switch (alt59) {
                case 1 :
                    // InternalSSS.g:3635:4: (lv_sectionDescription_2_0= ruleDBody )
                    {
                    // InternalSSS.g:3635:4: (lv_sectionDescription_2_0= ruleDBody )
                    // InternalSSS.g:3636:5: lv_sectionDescription_2_0= ruleDBody
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getVSSSGeneralRequirementsAccess().getSectionDescriptionDBodyParserRuleCall_2_0());
                      				
                    }
                    pushFollow(FollowSets000.FOLLOW_121);
                    lv_sectionDescription_2_0=ruleDBody();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getVSSSGeneralRequirementsRule());
                      					}
                      					set(
                      						current,
                      						"sectionDescription",
                      						lv_sectionDescription_2_0,
                      						"es.uah.aut.srg.micobs.svm.lang.sss.SSS.DBody");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }
                    break;

            }

            // InternalSSS.g:3653:3: ( (lv_sssItems_3_0= ruleVSSSDocumentItem ) )*
            loop60:
            do {
                int alt60=2;
                int LA60_0 = input.LA(1);

                if ( (LA60_0==123) ) {
                    alt60=1;
                }


                switch (alt60) {
            	case 1 :
            	    // InternalSSS.g:3654:4: (lv_sssItems_3_0= ruleVSSSDocumentItem )
            	    {
            	    // InternalSSS.g:3654:4: (lv_sssItems_3_0= ruleVSSSDocumentItem )
            	    // InternalSSS.g:3655:5: lv_sssItems_3_0= ruleVSSSDocumentItem
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getVSSSGeneralRequirementsAccess().getSssItemsVSSSDocumentItemParserRuleCall_3_0());
            	      				
            	    }
            	    pushFollow(FollowSets000.FOLLOW_121);
            	    lv_sssItems_3_0=ruleVSSSDocumentItem();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getVSSSGeneralRequirementsRule());
            	      					}
            	      					add(
            	      						current,
            	      						"sssItems",
            	      						lv_sssItems_3_0,
            	      						"es.uah.aut.srg.micobs.svm.lang.sss.SSS.VSSSDocumentItem");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop60;
                }
            } while (true);

            // InternalSSS.g:3672:3: ( (lv_sssRequirementSubsections_4_0= ruleVSSSInstantiableRequirementSection ) )*
            loop61:
            do {
                int alt61=2;
                int LA61_0 = input.LA(1);

                if ( (LA61_0==63) ) {
                    alt61=1;
                }


                switch (alt61) {
            	case 1 :
            	    // InternalSSS.g:3673:4: (lv_sssRequirementSubsections_4_0= ruleVSSSInstantiableRequirementSection )
            	    {
            	    // InternalSSS.g:3673:4: (lv_sssRequirementSubsections_4_0= ruleVSSSInstantiableRequirementSection )
            	    // InternalSSS.g:3674:5: lv_sssRequirementSubsections_4_0= ruleVSSSInstantiableRequirementSection
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getVSSSGeneralRequirementsAccess().getSssRequirementSubsectionsVSSSInstantiableRequirementSectionParserRuleCall_4_0());
            	      				
            	    }
            	    pushFollow(FollowSets000.FOLLOW_122);
            	    lv_sssRequirementSubsections_4_0=ruleVSSSInstantiableRequirementSection();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getVSSSGeneralRequirementsRule());
            	      					}
            	      					add(
            	      						current,
            	      						"sssRequirementSubsections",
            	      						lv_sssRequirementSubsections_4_0,
            	      						"es.uah.aut.srg.micobs.svm.lang.sss.SSS.VSSSInstantiableRequirementSection");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop61;
                }
            } while (true);

            otherlv_5=(Token)match(input,98,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getVSSSGeneralRequirementsAccess().getGeneralRequirementsKeyword_5());
              		
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
    // $ANTLR end "ruleVSSSGeneralRequirements"


    // $ANTLR start "entryRuleVSSSCapabilitiesRequirements"
    // InternalSSS.g:3699:1: entryRuleVSSSCapabilitiesRequirements returns [EObject current=null] : iv_ruleVSSSCapabilitiesRequirements= ruleVSSSCapabilitiesRequirements EOF ;
    public final EObject entryRuleVSSSCapabilitiesRequirements() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVSSSCapabilitiesRequirements = null;


        try {
            // InternalSSS.g:3699:69: (iv_ruleVSSSCapabilitiesRequirements= ruleVSSSCapabilitiesRequirements EOF )
            // InternalSSS.g:3700:2: iv_ruleVSSSCapabilitiesRequirements= ruleVSSSCapabilitiesRequirements EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getVSSSCapabilitiesRequirementsRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleVSSSCapabilitiesRequirements=ruleVSSSCapabilitiesRequirements();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleVSSSCapabilitiesRequirements; 
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
    // $ANTLR end "entryRuleVSSSCapabilitiesRequirements"


    // $ANTLR start "ruleVSSSCapabilitiesRequirements"
    // InternalSSS.g:3706:1: ruleVSSSCapabilitiesRequirements returns [EObject current=null] : ( () otherlv_1= '<CapabilitiesRequirements>' ( (lv_sectionDescription_2_0= ruleDBody ) )? ( (lv_sssItems_3_0= ruleVSSSDocumentItem ) )* ( (lv_sssRequirementSubsections_4_0= ruleVSSSInstantiableRequirementSection ) )* otherlv_5= '</CapabilitiesRequirements>' ) ;
    public final EObject ruleVSSSCapabilitiesRequirements() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_5=null;
        EObject lv_sectionDescription_2_0 = null;

        EObject lv_sssItems_3_0 = null;

        EObject lv_sssRequirementSubsections_4_0 = null;



        	enterRule();

        try {
            // InternalSSS.g:3712:2: ( ( () otherlv_1= '<CapabilitiesRequirements>' ( (lv_sectionDescription_2_0= ruleDBody ) )? ( (lv_sssItems_3_0= ruleVSSSDocumentItem ) )* ( (lv_sssRequirementSubsections_4_0= ruleVSSSInstantiableRequirementSection ) )* otherlv_5= '</CapabilitiesRequirements>' ) )
            // InternalSSS.g:3713:2: ( () otherlv_1= '<CapabilitiesRequirements>' ( (lv_sectionDescription_2_0= ruleDBody ) )? ( (lv_sssItems_3_0= ruleVSSSDocumentItem ) )* ( (lv_sssRequirementSubsections_4_0= ruleVSSSInstantiableRequirementSection ) )* otherlv_5= '</CapabilitiesRequirements>' )
            {
            // InternalSSS.g:3713:2: ( () otherlv_1= '<CapabilitiesRequirements>' ( (lv_sectionDescription_2_0= ruleDBody ) )? ( (lv_sssItems_3_0= ruleVSSSDocumentItem ) )* ( (lv_sssRequirementSubsections_4_0= ruleVSSSInstantiableRequirementSection ) )* otherlv_5= '</CapabilitiesRequirements>' )
            // InternalSSS.g:3714:3: () otherlv_1= '<CapabilitiesRequirements>' ( (lv_sectionDescription_2_0= ruleDBody ) )? ( (lv_sssItems_3_0= ruleVSSSDocumentItem ) )* ( (lv_sssRequirementSubsections_4_0= ruleVSSSInstantiableRequirementSection ) )* otherlv_5= '</CapabilitiesRequirements>'
            {
            // InternalSSS.g:3714:3: ()
            // InternalSSS.g:3715:4: 
            {
            if ( state.backtracking==0 ) {

              				/* */
              			
            }
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getVSSSCapabilitiesRequirementsAccess().getVSSSCapabilitiesRequirementsAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,99,FollowSets000.FOLLOW_123); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getVSSSCapabilitiesRequirementsAccess().getCapabilitiesRequirementsKeyword_1());
              		
            }
            // InternalSSS.g:3728:3: ( (lv_sectionDescription_2_0= ruleDBody ) )?
            int alt62=2;
            int LA62_0 = input.LA(1);

            if ( (LA62_0==21) ) {
                alt62=1;
            }
            switch (alt62) {
                case 1 :
                    // InternalSSS.g:3729:4: (lv_sectionDescription_2_0= ruleDBody )
                    {
                    // InternalSSS.g:3729:4: (lv_sectionDescription_2_0= ruleDBody )
                    // InternalSSS.g:3730:5: lv_sectionDescription_2_0= ruleDBody
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getVSSSCapabilitiesRequirementsAccess().getSectionDescriptionDBodyParserRuleCall_2_0());
                      				
                    }
                    pushFollow(FollowSets000.FOLLOW_124);
                    lv_sectionDescription_2_0=ruleDBody();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getVSSSCapabilitiesRequirementsRule());
                      					}
                      					set(
                      						current,
                      						"sectionDescription",
                      						lv_sectionDescription_2_0,
                      						"es.uah.aut.srg.micobs.svm.lang.sss.SSS.DBody");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }
                    break;

            }

            // InternalSSS.g:3747:3: ( (lv_sssItems_3_0= ruleVSSSDocumentItem ) )*
            loop63:
            do {
                int alt63=2;
                int LA63_0 = input.LA(1);

                if ( (LA63_0==123) ) {
                    alt63=1;
                }


                switch (alt63) {
            	case 1 :
            	    // InternalSSS.g:3748:4: (lv_sssItems_3_0= ruleVSSSDocumentItem )
            	    {
            	    // InternalSSS.g:3748:4: (lv_sssItems_3_0= ruleVSSSDocumentItem )
            	    // InternalSSS.g:3749:5: lv_sssItems_3_0= ruleVSSSDocumentItem
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getVSSSCapabilitiesRequirementsAccess().getSssItemsVSSSDocumentItemParserRuleCall_3_0());
            	      				
            	    }
            	    pushFollow(FollowSets000.FOLLOW_124);
            	    lv_sssItems_3_0=ruleVSSSDocumentItem();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getVSSSCapabilitiesRequirementsRule());
            	      					}
            	      					add(
            	      						current,
            	      						"sssItems",
            	      						lv_sssItems_3_0,
            	      						"es.uah.aut.srg.micobs.svm.lang.sss.SSS.VSSSDocumentItem");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop63;
                }
            } while (true);

            // InternalSSS.g:3766:3: ( (lv_sssRequirementSubsections_4_0= ruleVSSSInstantiableRequirementSection ) )*
            loop64:
            do {
                int alt64=2;
                int LA64_0 = input.LA(1);

                if ( (LA64_0==63) ) {
                    alt64=1;
                }


                switch (alt64) {
            	case 1 :
            	    // InternalSSS.g:3767:4: (lv_sssRequirementSubsections_4_0= ruleVSSSInstantiableRequirementSection )
            	    {
            	    // InternalSSS.g:3767:4: (lv_sssRequirementSubsections_4_0= ruleVSSSInstantiableRequirementSection )
            	    // InternalSSS.g:3768:5: lv_sssRequirementSubsections_4_0= ruleVSSSInstantiableRequirementSection
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getVSSSCapabilitiesRequirementsAccess().getSssRequirementSubsectionsVSSSInstantiableRequirementSectionParserRuleCall_4_0());
            	      				
            	    }
            	    pushFollow(FollowSets000.FOLLOW_125);
            	    lv_sssRequirementSubsections_4_0=ruleVSSSInstantiableRequirementSection();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getVSSSCapabilitiesRequirementsRule());
            	      					}
            	      					add(
            	      						current,
            	      						"sssRequirementSubsections",
            	      						lv_sssRequirementSubsections_4_0,
            	      						"es.uah.aut.srg.micobs.svm.lang.sss.SSS.VSSSInstantiableRequirementSection");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop64;
                }
            } while (true);

            otherlv_5=(Token)match(input,100,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getVSSSCapabilitiesRequirementsAccess().getCapabilitiesRequirementsKeyword_5());
              		
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
    // $ANTLR end "ruleVSSSCapabilitiesRequirements"


    // $ANTLR start "entryRuleVSSSSystemInterfaceRequirements"
    // InternalSSS.g:3793:1: entryRuleVSSSSystemInterfaceRequirements returns [EObject current=null] : iv_ruleVSSSSystemInterfaceRequirements= ruleVSSSSystemInterfaceRequirements EOF ;
    public final EObject entryRuleVSSSSystemInterfaceRequirements() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVSSSSystemInterfaceRequirements = null;


        try {
            // InternalSSS.g:3793:72: (iv_ruleVSSSSystemInterfaceRequirements= ruleVSSSSystemInterfaceRequirements EOF )
            // InternalSSS.g:3794:2: iv_ruleVSSSSystemInterfaceRequirements= ruleVSSSSystemInterfaceRequirements EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getVSSSSystemInterfaceRequirementsRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleVSSSSystemInterfaceRequirements=ruleVSSSSystemInterfaceRequirements();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleVSSSSystemInterfaceRequirements; 
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
    // $ANTLR end "entryRuleVSSSSystemInterfaceRequirements"


    // $ANTLR start "ruleVSSSSystemInterfaceRequirements"
    // InternalSSS.g:3800:1: ruleVSSSSystemInterfaceRequirements returns [EObject current=null] : ( () otherlv_1= '<SystemInterfaceRequirements>' ( (lv_sectionDescription_2_0= ruleDBody ) )? ( (lv_sssItems_3_0= ruleVSSSDocumentItem ) )* ( (lv_sssRequirementSubsections_4_0= ruleVSSSInstantiableRequirementSection ) )* otherlv_5= '</SystemInterfaceRequirements>' ) ;
    public final EObject ruleVSSSSystemInterfaceRequirements() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_5=null;
        EObject lv_sectionDescription_2_0 = null;

        EObject lv_sssItems_3_0 = null;

        EObject lv_sssRequirementSubsections_4_0 = null;



        	enterRule();

        try {
            // InternalSSS.g:3806:2: ( ( () otherlv_1= '<SystemInterfaceRequirements>' ( (lv_sectionDescription_2_0= ruleDBody ) )? ( (lv_sssItems_3_0= ruleVSSSDocumentItem ) )* ( (lv_sssRequirementSubsections_4_0= ruleVSSSInstantiableRequirementSection ) )* otherlv_5= '</SystemInterfaceRequirements>' ) )
            // InternalSSS.g:3807:2: ( () otherlv_1= '<SystemInterfaceRequirements>' ( (lv_sectionDescription_2_0= ruleDBody ) )? ( (lv_sssItems_3_0= ruleVSSSDocumentItem ) )* ( (lv_sssRequirementSubsections_4_0= ruleVSSSInstantiableRequirementSection ) )* otherlv_5= '</SystemInterfaceRequirements>' )
            {
            // InternalSSS.g:3807:2: ( () otherlv_1= '<SystemInterfaceRequirements>' ( (lv_sectionDescription_2_0= ruleDBody ) )? ( (lv_sssItems_3_0= ruleVSSSDocumentItem ) )* ( (lv_sssRequirementSubsections_4_0= ruleVSSSInstantiableRequirementSection ) )* otherlv_5= '</SystemInterfaceRequirements>' )
            // InternalSSS.g:3808:3: () otherlv_1= '<SystemInterfaceRequirements>' ( (lv_sectionDescription_2_0= ruleDBody ) )? ( (lv_sssItems_3_0= ruleVSSSDocumentItem ) )* ( (lv_sssRequirementSubsections_4_0= ruleVSSSInstantiableRequirementSection ) )* otherlv_5= '</SystemInterfaceRequirements>'
            {
            // InternalSSS.g:3808:3: ()
            // InternalSSS.g:3809:4: 
            {
            if ( state.backtracking==0 ) {

              				/* */
              			
            }
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getVSSSSystemInterfaceRequirementsAccess().getVSSSSystemInterfaceRequirementsAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,101,FollowSets000.FOLLOW_126); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getVSSSSystemInterfaceRequirementsAccess().getSystemInterfaceRequirementsKeyword_1());
              		
            }
            // InternalSSS.g:3822:3: ( (lv_sectionDescription_2_0= ruleDBody ) )?
            int alt65=2;
            int LA65_0 = input.LA(1);

            if ( (LA65_0==21) ) {
                alt65=1;
            }
            switch (alt65) {
                case 1 :
                    // InternalSSS.g:3823:4: (lv_sectionDescription_2_0= ruleDBody )
                    {
                    // InternalSSS.g:3823:4: (lv_sectionDescription_2_0= ruleDBody )
                    // InternalSSS.g:3824:5: lv_sectionDescription_2_0= ruleDBody
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getVSSSSystemInterfaceRequirementsAccess().getSectionDescriptionDBodyParserRuleCall_2_0());
                      				
                    }
                    pushFollow(FollowSets000.FOLLOW_127);
                    lv_sectionDescription_2_0=ruleDBody();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getVSSSSystemInterfaceRequirementsRule());
                      					}
                      					set(
                      						current,
                      						"sectionDescription",
                      						lv_sectionDescription_2_0,
                      						"es.uah.aut.srg.micobs.svm.lang.sss.SSS.DBody");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }
                    break;

            }

            // InternalSSS.g:3841:3: ( (lv_sssItems_3_0= ruleVSSSDocumentItem ) )*
            loop66:
            do {
                int alt66=2;
                int LA66_0 = input.LA(1);

                if ( (LA66_0==123) ) {
                    alt66=1;
                }


                switch (alt66) {
            	case 1 :
            	    // InternalSSS.g:3842:4: (lv_sssItems_3_0= ruleVSSSDocumentItem )
            	    {
            	    // InternalSSS.g:3842:4: (lv_sssItems_3_0= ruleVSSSDocumentItem )
            	    // InternalSSS.g:3843:5: lv_sssItems_3_0= ruleVSSSDocumentItem
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getVSSSSystemInterfaceRequirementsAccess().getSssItemsVSSSDocumentItemParserRuleCall_3_0());
            	      				
            	    }
            	    pushFollow(FollowSets000.FOLLOW_127);
            	    lv_sssItems_3_0=ruleVSSSDocumentItem();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getVSSSSystemInterfaceRequirementsRule());
            	      					}
            	      					add(
            	      						current,
            	      						"sssItems",
            	      						lv_sssItems_3_0,
            	      						"es.uah.aut.srg.micobs.svm.lang.sss.SSS.VSSSDocumentItem");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop66;
                }
            } while (true);

            // InternalSSS.g:3860:3: ( (lv_sssRequirementSubsections_4_0= ruleVSSSInstantiableRequirementSection ) )*
            loop67:
            do {
                int alt67=2;
                int LA67_0 = input.LA(1);

                if ( (LA67_0==63) ) {
                    alt67=1;
                }


                switch (alt67) {
            	case 1 :
            	    // InternalSSS.g:3861:4: (lv_sssRequirementSubsections_4_0= ruleVSSSInstantiableRequirementSection )
            	    {
            	    // InternalSSS.g:3861:4: (lv_sssRequirementSubsections_4_0= ruleVSSSInstantiableRequirementSection )
            	    // InternalSSS.g:3862:5: lv_sssRequirementSubsections_4_0= ruleVSSSInstantiableRequirementSection
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getVSSSSystemInterfaceRequirementsAccess().getSssRequirementSubsectionsVSSSInstantiableRequirementSectionParserRuleCall_4_0());
            	      				
            	    }
            	    pushFollow(FollowSets000.FOLLOW_128);
            	    lv_sssRequirementSubsections_4_0=ruleVSSSInstantiableRequirementSection();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getVSSSSystemInterfaceRequirementsRule());
            	      					}
            	      					add(
            	      						current,
            	      						"sssRequirementSubsections",
            	      						lv_sssRequirementSubsections_4_0,
            	      						"es.uah.aut.srg.micobs.svm.lang.sss.SSS.VSSSInstantiableRequirementSection");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop67;
                }
            } while (true);

            otherlv_5=(Token)match(input,102,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getVSSSSystemInterfaceRequirementsAccess().getSystemInterfaceRequirementsKeyword_5());
              		
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
    // $ANTLR end "ruleVSSSSystemInterfaceRequirements"


    // $ANTLR start "entryRuleVSSSAdaptationMissionizationRequirements"
    // InternalSSS.g:3887:1: entryRuleVSSSAdaptationMissionizationRequirements returns [EObject current=null] : iv_ruleVSSSAdaptationMissionizationRequirements= ruleVSSSAdaptationMissionizationRequirements EOF ;
    public final EObject entryRuleVSSSAdaptationMissionizationRequirements() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVSSSAdaptationMissionizationRequirements = null;


        try {
            // InternalSSS.g:3887:81: (iv_ruleVSSSAdaptationMissionizationRequirements= ruleVSSSAdaptationMissionizationRequirements EOF )
            // InternalSSS.g:3888:2: iv_ruleVSSSAdaptationMissionizationRequirements= ruleVSSSAdaptationMissionizationRequirements EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getVSSSAdaptationMissionizationRequirementsRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleVSSSAdaptationMissionizationRequirements=ruleVSSSAdaptationMissionizationRequirements();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleVSSSAdaptationMissionizationRequirements; 
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
    // $ANTLR end "entryRuleVSSSAdaptationMissionizationRequirements"


    // $ANTLR start "ruleVSSSAdaptationMissionizationRequirements"
    // InternalSSS.g:3894:1: ruleVSSSAdaptationMissionizationRequirements returns [EObject current=null] : ( () otherlv_1= '<AdaptationMissionizationRequirements>' ( (lv_sectionDescription_2_0= ruleDBody ) )? ( (lv_sssItems_3_0= ruleVSSSDocumentItem ) )* ( (lv_sssRequirementSubsections_4_0= ruleVSSSInstantiableRequirementSection ) )* otherlv_5= '</AdaptationMissionizationRequirements>' ) ;
    public final EObject ruleVSSSAdaptationMissionizationRequirements() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_5=null;
        EObject lv_sectionDescription_2_0 = null;

        EObject lv_sssItems_3_0 = null;

        EObject lv_sssRequirementSubsections_4_0 = null;



        	enterRule();

        try {
            // InternalSSS.g:3900:2: ( ( () otherlv_1= '<AdaptationMissionizationRequirements>' ( (lv_sectionDescription_2_0= ruleDBody ) )? ( (lv_sssItems_3_0= ruleVSSSDocumentItem ) )* ( (lv_sssRequirementSubsections_4_0= ruleVSSSInstantiableRequirementSection ) )* otherlv_5= '</AdaptationMissionizationRequirements>' ) )
            // InternalSSS.g:3901:2: ( () otherlv_1= '<AdaptationMissionizationRequirements>' ( (lv_sectionDescription_2_0= ruleDBody ) )? ( (lv_sssItems_3_0= ruleVSSSDocumentItem ) )* ( (lv_sssRequirementSubsections_4_0= ruleVSSSInstantiableRequirementSection ) )* otherlv_5= '</AdaptationMissionizationRequirements>' )
            {
            // InternalSSS.g:3901:2: ( () otherlv_1= '<AdaptationMissionizationRequirements>' ( (lv_sectionDescription_2_0= ruleDBody ) )? ( (lv_sssItems_3_0= ruleVSSSDocumentItem ) )* ( (lv_sssRequirementSubsections_4_0= ruleVSSSInstantiableRequirementSection ) )* otherlv_5= '</AdaptationMissionizationRequirements>' )
            // InternalSSS.g:3902:3: () otherlv_1= '<AdaptationMissionizationRequirements>' ( (lv_sectionDescription_2_0= ruleDBody ) )? ( (lv_sssItems_3_0= ruleVSSSDocumentItem ) )* ( (lv_sssRequirementSubsections_4_0= ruleVSSSInstantiableRequirementSection ) )* otherlv_5= '</AdaptationMissionizationRequirements>'
            {
            // InternalSSS.g:3902:3: ()
            // InternalSSS.g:3903:4: 
            {
            if ( state.backtracking==0 ) {

              				/* */
              			
            }
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getVSSSAdaptationMissionizationRequirementsAccess().getVSSSAdaptationMissionizationRequirementsAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,103,FollowSets000.FOLLOW_129); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getVSSSAdaptationMissionizationRequirementsAccess().getAdaptationMissionizationRequirementsKeyword_1());
              		
            }
            // InternalSSS.g:3916:3: ( (lv_sectionDescription_2_0= ruleDBody ) )?
            int alt68=2;
            int LA68_0 = input.LA(1);

            if ( (LA68_0==21) ) {
                alt68=1;
            }
            switch (alt68) {
                case 1 :
                    // InternalSSS.g:3917:4: (lv_sectionDescription_2_0= ruleDBody )
                    {
                    // InternalSSS.g:3917:4: (lv_sectionDescription_2_0= ruleDBody )
                    // InternalSSS.g:3918:5: lv_sectionDescription_2_0= ruleDBody
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getVSSSAdaptationMissionizationRequirementsAccess().getSectionDescriptionDBodyParserRuleCall_2_0());
                      				
                    }
                    pushFollow(FollowSets000.FOLLOW_130);
                    lv_sectionDescription_2_0=ruleDBody();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getVSSSAdaptationMissionizationRequirementsRule());
                      					}
                      					set(
                      						current,
                      						"sectionDescription",
                      						lv_sectionDescription_2_0,
                      						"es.uah.aut.srg.micobs.svm.lang.sss.SSS.DBody");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }
                    break;

            }

            // InternalSSS.g:3935:3: ( (lv_sssItems_3_0= ruleVSSSDocumentItem ) )*
            loop69:
            do {
                int alt69=2;
                int LA69_0 = input.LA(1);

                if ( (LA69_0==123) ) {
                    alt69=1;
                }


                switch (alt69) {
            	case 1 :
            	    // InternalSSS.g:3936:4: (lv_sssItems_3_0= ruleVSSSDocumentItem )
            	    {
            	    // InternalSSS.g:3936:4: (lv_sssItems_3_0= ruleVSSSDocumentItem )
            	    // InternalSSS.g:3937:5: lv_sssItems_3_0= ruleVSSSDocumentItem
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getVSSSAdaptationMissionizationRequirementsAccess().getSssItemsVSSSDocumentItemParserRuleCall_3_0());
            	      				
            	    }
            	    pushFollow(FollowSets000.FOLLOW_130);
            	    lv_sssItems_3_0=ruleVSSSDocumentItem();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getVSSSAdaptationMissionizationRequirementsRule());
            	      					}
            	      					add(
            	      						current,
            	      						"sssItems",
            	      						lv_sssItems_3_0,
            	      						"es.uah.aut.srg.micobs.svm.lang.sss.SSS.VSSSDocumentItem");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop69;
                }
            } while (true);

            // InternalSSS.g:3954:3: ( (lv_sssRequirementSubsections_4_0= ruleVSSSInstantiableRequirementSection ) )*
            loop70:
            do {
                int alt70=2;
                int LA70_0 = input.LA(1);

                if ( (LA70_0==63) ) {
                    alt70=1;
                }


                switch (alt70) {
            	case 1 :
            	    // InternalSSS.g:3955:4: (lv_sssRequirementSubsections_4_0= ruleVSSSInstantiableRequirementSection )
            	    {
            	    // InternalSSS.g:3955:4: (lv_sssRequirementSubsections_4_0= ruleVSSSInstantiableRequirementSection )
            	    // InternalSSS.g:3956:5: lv_sssRequirementSubsections_4_0= ruleVSSSInstantiableRequirementSection
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getVSSSAdaptationMissionizationRequirementsAccess().getSssRequirementSubsectionsVSSSInstantiableRequirementSectionParserRuleCall_4_0());
            	      				
            	    }
            	    pushFollow(FollowSets000.FOLLOW_131);
            	    lv_sssRequirementSubsections_4_0=ruleVSSSInstantiableRequirementSection();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getVSSSAdaptationMissionizationRequirementsRule());
            	      					}
            	      					add(
            	      						current,
            	      						"sssRequirementSubsections",
            	      						lv_sssRequirementSubsections_4_0,
            	      						"es.uah.aut.srg.micobs.svm.lang.sss.SSS.VSSSInstantiableRequirementSection");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop70;
                }
            } while (true);

            otherlv_5=(Token)match(input,104,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getVSSSAdaptationMissionizationRequirementsAccess().getAdaptationMissionizationRequirementsKeyword_5());
              		
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
    // $ANTLR end "ruleVSSSAdaptationMissionizationRequirements"


    // $ANTLR start "entryRuleVSSSComputerResourceRequirements"
    // InternalSSS.g:3981:1: entryRuleVSSSComputerResourceRequirements returns [EObject current=null] : iv_ruleVSSSComputerResourceRequirements= ruleVSSSComputerResourceRequirements EOF ;
    public final EObject entryRuleVSSSComputerResourceRequirements() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVSSSComputerResourceRequirements = null;


        try {
            // InternalSSS.g:3981:73: (iv_ruleVSSSComputerResourceRequirements= ruleVSSSComputerResourceRequirements EOF )
            // InternalSSS.g:3982:2: iv_ruleVSSSComputerResourceRequirements= ruleVSSSComputerResourceRequirements EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getVSSSComputerResourceRequirementsRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleVSSSComputerResourceRequirements=ruleVSSSComputerResourceRequirements();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleVSSSComputerResourceRequirements; 
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
    // $ANTLR end "entryRuleVSSSComputerResourceRequirements"


    // $ANTLR start "ruleVSSSComputerResourceRequirements"
    // InternalSSS.g:3988:1: ruleVSSSComputerResourceRequirements returns [EObject current=null] : ( () otherlv_1= '<ComputerResourceRequirements>' ( (lv_sectionDescription_2_0= ruleDBody ) )? ( (lv_sssItems_3_0= ruleVSSSDocumentItem ) )* ( (lv_sssRequirementSubsections_4_0= ruleVSSSInstantiableRequirementSection ) )* otherlv_5= '</ComputerResourceRequirements>' ) ;
    public final EObject ruleVSSSComputerResourceRequirements() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_5=null;
        EObject lv_sectionDescription_2_0 = null;

        EObject lv_sssItems_3_0 = null;

        EObject lv_sssRequirementSubsections_4_0 = null;



        	enterRule();

        try {
            // InternalSSS.g:3994:2: ( ( () otherlv_1= '<ComputerResourceRequirements>' ( (lv_sectionDescription_2_0= ruleDBody ) )? ( (lv_sssItems_3_0= ruleVSSSDocumentItem ) )* ( (lv_sssRequirementSubsections_4_0= ruleVSSSInstantiableRequirementSection ) )* otherlv_5= '</ComputerResourceRequirements>' ) )
            // InternalSSS.g:3995:2: ( () otherlv_1= '<ComputerResourceRequirements>' ( (lv_sectionDescription_2_0= ruleDBody ) )? ( (lv_sssItems_3_0= ruleVSSSDocumentItem ) )* ( (lv_sssRequirementSubsections_4_0= ruleVSSSInstantiableRequirementSection ) )* otherlv_5= '</ComputerResourceRequirements>' )
            {
            // InternalSSS.g:3995:2: ( () otherlv_1= '<ComputerResourceRequirements>' ( (lv_sectionDescription_2_0= ruleDBody ) )? ( (lv_sssItems_3_0= ruleVSSSDocumentItem ) )* ( (lv_sssRequirementSubsections_4_0= ruleVSSSInstantiableRequirementSection ) )* otherlv_5= '</ComputerResourceRequirements>' )
            // InternalSSS.g:3996:3: () otherlv_1= '<ComputerResourceRequirements>' ( (lv_sectionDescription_2_0= ruleDBody ) )? ( (lv_sssItems_3_0= ruleVSSSDocumentItem ) )* ( (lv_sssRequirementSubsections_4_0= ruleVSSSInstantiableRequirementSection ) )* otherlv_5= '</ComputerResourceRequirements>'
            {
            // InternalSSS.g:3996:3: ()
            // InternalSSS.g:3997:4: 
            {
            if ( state.backtracking==0 ) {

              				/* */
              			
            }
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getVSSSComputerResourceRequirementsAccess().getVSSSComputerResourceRequirementsAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,105,FollowSets000.FOLLOW_132); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getVSSSComputerResourceRequirementsAccess().getComputerResourceRequirementsKeyword_1());
              		
            }
            // InternalSSS.g:4010:3: ( (lv_sectionDescription_2_0= ruleDBody ) )?
            int alt71=2;
            int LA71_0 = input.LA(1);

            if ( (LA71_0==21) ) {
                alt71=1;
            }
            switch (alt71) {
                case 1 :
                    // InternalSSS.g:4011:4: (lv_sectionDescription_2_0= ruleDBody )
                    {
                    // InternalSSS.g:4011:4: (lv_sectionDescription_2_0= ruleDBody )
                    // InternalSSS.g:4012:5: lv_sectionDescription_2_0= ruleDBody
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getVSSSComputerResourceRequirementsAccess().getSectionDescriptionDBodyParserRuleCall_2_0());
                      				
                    }
                    pushFollow(FollowSets000.FOLLOW_133);
                    lv_sectionDescription_2_0=ruleDBody();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getVSSSComputerResourceRequirementsRule());
                      					}
                      					set(
                      						current,
                      						"sectionDescription",
                      						lv_sectionDescription_2_0,
                      						"es.uah.aut.srg.micobs.svm.lang.sss.SSS.DBody");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }
                    break;

            }

            // InternalSSS.g:4029:3: ( (lv_sssItems_3_0= ruleVSSSDocumentItem ) )*
            loop72:
            do {
                int alt72=2;
                int LA72_0 = input.LA(1);

                if ( (LA72_0==123) ) {
                    alt72=1;
                }


                switch (alt72) {
            	case 1 :
            	    // InternalSSS.g:4030:4: (lv_sssItems_3_0= ruleVSSSDocumentItem )
            	    {
            	    // InternalSSS.g:4030:4: (lv_sssItems_3_0= ruleVSSSDocumentItem )
            	    // InternalSSS.g:4031:5: lv_sssItems_3_0= ruleVSSSDocumentItem
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getVSSSComputerResourceRequirementsAccess().getSssItemsVSSSDocumentItemParserRuleCall_3_0());
            	      				
            	    }
            	    pushFollow(FollowSets000.FOLLOW_133);
            	    lv_sssItems_3_0=ruleVSSSDocumentItem();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getVSSSComputerResourceRequirementsRule());
            	      					}
            	      					add(
            	      						current,
            	      						"sssItems",
            	      						lv_sssItems_3_0,
            	      						"es.uah.aut.srg.micobs.svm.lang.sss.SSS.VSSSDocumentItem");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop72;
                }
            } while (true);

            // InternalSSS.g:4048:3: ( (lv_sssRequirementSubsections_4_0= ruleVSSSInstantiableRequirementSection ) )*
            loop73:
            do {
                int alt73=2;
                int LA73_0 = input.LA(1);

                if ( (LA73_0==63) ) {
                    alt73=1;
                }


                switch (alt73) {
            	case 1 :
            	    // InternalSSS.g:4049:4: (lv_sssRequirementSubsections_4_0= ruleVSSSInstantiableRequirementSection )
            	    {
            	    // InternalSSS.g:4049:4: (lv_sssRequirementSubsections_4_0= ruleVSSSInstantiableRequirementSection )
            	    // InternalSSS.g:4050:5: lv_sssRequirementSubsections_4_0= ruleVSSSInstantiableRequirementSection
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getVSSSComputerResourceRequirementsAccess().getSssRequirementSubsectionsVSSSInstantiableRequirementSectionParserRuleCall_4_0());
            	      				
            	    }
            	    pushFollow(FollowSets000.FOLLOW_134);
            	    lv_sssRequirementSubsections_4_0=ruleVSSSInstantiableRequirementSection();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getVSSSComputerResourceRequirementsRule());
            	      					}
            	      					add(
            	      						current,
            	      						"sssRequirementSubsections",
            	      						lv_sssRequirementSubsections_4_0,
            	      						"es.uah.aut.srg.micobs.svm.lang.sss.SSS.VSSSInstantiableRequirementSection");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop73;
                }
            } while (true);

            otherlv_5=(Token)match(input,106,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getVSSSComputerResourceRequirementsAccess().getComputerResourceRequirementsKeyword_5());
              		
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
    // $ANTLR end "ruleVSSSComputerResourceRequirements"


    // $ANTLR start "entryRuleVSSSSecurityRequirements"
    // InternalSSS.g:4075:1: entryRuleVSSSSecurityRequirements returns [EObject current=null] : iv_ruleVSSSSecurityRequirements= ruleVSSSSecurityRequirements EOF ;
    public final EObject entryRuleVSSSSecurityRequirements() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVSSSSecurityRequirements = null;


        try {
            // InternalSSS.g:4075:65: (iv_ruleVSSSSecurityRequirements= ruleVSSSSecurityRequirements EOF )
            // InternalSSS.g:4076:2: iv_ruleVSSSSecurityRequirements= ruleVSSSSecurityRequirements EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getVSSSSecurityRequirementsRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleVSSSSecurityRequirements=ruleVSSSSecurityRequirements();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleVSSSSecurityRequirements; 
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
    // $ANTLR end "entryRuleVSSSSecurityRequirements"


    // $ANTLR start "ruleVSSSSecurityRequirements"
    // InternalSSS.g:4082:1: ruleVSSSSecurityRequirements returns [EObject current=null] : ( () otherlv_1= '<SecurityRequirements>' ( (lv_sectionDescription_2_0= ruleDBody ) )? ( (lv_sssItems_3_0= ruleVSSSDocumentItem ) )* ( (lv_sssRequirementSubsections_4_0= ruleVSSSInstantiableRequirementSection ) )* otherlv_5= '</SecurityRequirements>' ) ;
    public final EObject ruleVSSSSecurityRequirements() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_5=null;
        EObject lv_sectionDescription_2_0 = null;

        EObject lv_sssItems_3_0 = null;

        EObject lv_sssRequirementSubsections_4_0 = null;



        	enterRule();

        try {
            // InternalSSS.g:4088:2: ( ( () otherlv_1= '<SecurityRequirements>' ( (lv_sectionDescription_2_0= ruleDBody ) )? ( (lv_sssItems_3_0= ruleVSSSDocumentItem ) )* ( (lv_sssRequirementSubsections_4_0= ruleVSSSInstantiableRequirementSection ) )* otherlv_5= '</SecurityRequirements>' ) )
            // InternalSSS.g:4089:2: ( () otherlv_1= '<SecurityRequirements>' ( (lv_sectionDescription_2_0= ruleDBody ) )? ( (lv_sssItems_3_0= ruleVSSSDocumentItem ) )* ( (lv_sssRequirementSubsections_4_0= ruleVSSSInstantiableRequirementSection ) )* otherlv_5= '</SecurityRequirements>' )
            {
            // InternalSSS.g:4089:2: ( () otherlv_1= '<SecurityRequirements>' ( (lv_sectionDescription_2_0= ruleDBody ) )? ( (lv_sssItems_3_0= ruleVSSSDocumentItem ) )* ( (lv_sssRequirementSubsections_4_0= ruleVSSSInstantiableRequirementSection ) )* otherlv_5= '</SecurityRequirements>' )
            // InternalSSS.g:4090:3: () otherlv_1= '<SecurityRequirements>' ( (lv_sectionDescription_2_0= ruleDBody ) )? ( (lv_sssItems_3_0= ruleVSSSDocumentItem ) )* ( (lv_sssRequirementSubsections_4_0= ruleVSSSInstantiableRequirementSection ) )* otherlv_5= '</SecurityRequirements>'
            {
            // InternalSSS.g:4090:3: ()
            // InternalSSS.g:4091:4: 
            {
            if ( state.backtracking==0 ) {

              				/* */
              			
            }
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getVSSSSecurityRequirementsAccess().getVSSSSecurityRequirementsAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,107,FollowSets000.FOLLOW_135); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getVSSSSecurityRequirementsAccess().getSecurityRequirementsKeyword_1());
              		
            }
            // InternalSSS.g:4104:3: ( (lv_sectionDescription_2_0= ruleDBody ) )?
            int alt74=2;
            int LA74_0 = input.LA(1);

            if ( (LA74_0==21) ) {
                alt74=1;
            }
            switch (alt74) {
                case 1 :
                    // InternalSSS.g:4105:4: (lv_sectionDescription_2_0= ruleDBody )
                    {
                    // InternalSSS.g:4105:4: (lv_sectionDescription_2_0= ruleDBody )
                    // InternalSSS.g:4106:5: lv_sectionDescription_2_0= ruleDBody
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getVSSSSecurityRequirementsAccess().getSectionDescriptionDBodyParserRuleCall_2_0());
                      				
                    }
                    pushFollow(FollowSets000.FOLLOW_136);
                    lv_sectionDescription_2_0=ruleDBody();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getVSSSSecurityRequirementsRule());
                      					}
                      					set(
                      						current,
                      						"sectionDescription",
                      						lv_sectionDescription_2_0,
                      						"es.uah.aut.srg.micobs.svm.lang.sss.SSS.DBody");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }
                    break;

            }

            // InternalSSS.g:4123:3: ( (lv_sssItems_3_0= ruleVSSSDocumentItem ) )*
            loop75:
            do {
                int alt75=2;
                int LA75_0 = input.LA(1);

                if ( (LA75_0==123) ) {
                    alt75=1;
                }


                switch (alt75) {
            	case 1 :
            	    // InternalSSS.g:4124:4: (lv_sssItems_3_0= ruleVSSSDocumentItem )
            	    {
            	    // InternalSSS.g:4124:4: (lv_sssItems_3_0= ruleVSSSDocumentItem )
            	    // InternalSSS.g:4125:5: lv_sssItems_3_0= ruleVSSSDocumentItem
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getVSSSSecurityRequirementsAccess().getSssItemsVSSSDocumentItemParserRuleCall_3_0());
            	      				
            	    }
            	    pushFollow(FollowSets000.FOLLOW_136);
            	    lv_sssItems_3_0=ruleVSSSDocumentItem();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getVSSSSecurityRequirementsRule());
            	      					}
            	      					add(
            	      						current,
            	      						"sssItems",
            	      						lv_sssItems_3_0,
            	      						"es.uah.aut.srg.micobs.svm.lang.sss.SSS.VSSSDocumentItem");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop75;
                }
            } while (true);

            // InternalSSS.g:4142:3: ( (lv_sssRequirementSubsections_4_0= ruleVSSSInstantiableRequirementSection ) )*
            loop76:
            do {
                int alt76=2;
                int LA76_0 = input.LA(1);

                if ( (LA76_0==63) ) {
                    alt76=1;
                }


                switch (alt76) {
            	case 1 :
            	    // InternalSSS.g:4143:4: (lv_sssRequirementSubsections_4_0= ruleVSSSInstantiableRequirementSection )
            	    {
            	    // InternalSSS.g:4143:4: (lv_sssRequirementSubsections_4_0= ruleVSSSInstantiableRequirementSection )
            	    // InternalSSS.g:4144:5: lv_sssRequirementSubsections_4_0= ruleVSSSInstantiableRequirementSection
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getVSSSSecurityRequirementsAccess().getSssRequirementSubsectionsVSSSInstantiableRequirementSectionParserRuleCall_4_0());
            	      				
            	    }
            	    pushFollow(FollowSets000.FOLLOW_137);
            	    lv_sssRequirementSubsections_4_0=ruleVSSSInstantiableRequirementSection();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getVSSSSecurityRequirementsRule());
            	      					}
            	      					add(
            	      						current,
            	      						"sssRequirementSubsections",
            	      						lv_sssRequirementSubsections_4_0,
            	      						"es.uah.aut.srg.micobs.svm.lang.sss.SSS.VSSSInstantiableRequirementSection");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop76;
                }
            } while (true);

            otherlv_5=(Token)match(input,108,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getVSSSSecurityRequirementsAccess().getSecurityRequirementsKeyword_5());
              		
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
    // $ANTLR end "ruleVSSSSecurityRequirements"


    // $ANTLR start "entryRuleVSSSSafetyRequirements"
    // InternalSSS.g:4169:1: entryRuleVSSSSafetyRequirements returns [EObject current=null] : iv_ruleVSSSSafetyRequirements= ruleVSSSSafetyRequirements EOF ;
    public final EObject entryRuleVSSSSafetyRequirements() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVSSSSafetyRequirements = null;


        try {
            // InternalSSS.g:4169:63: (iv_ruleVSSSSafetyRequirements= ruleVSSSSafetyRequirements EOF )
            // InternalSSS.g:4170:2: iv_ruleVSSSSafetyRequirements= ruleVSSSSafetyRequirements EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getVSSSSafetyRequirementsRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleVSSSSafetyRequirements=ruleVSSSSafetyRequirements();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleVSSSSafetyRequirements; 
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
    // $ANTLR end "entryRuleVSSSSafetyRequirements"


    // $ANTLR start "ruleVSSSSafetyRequirements"
    // InternalSSS.g:4176:1: ruleVSSSSafetyRequirements returns [EObject current=null] : ( () otherlv_1= '<SafetyRequirements>' ( (lv_sectionDescription_2_0= ruleDBody ) )? ( (lv_sssItems_3_0= ruleVSSSDocumentItem ) )* ( (lv_sssRequirementSubsections_4_0= ruleVSSSInstantiableRequirementSection ) )* otherlv_5= '</SafetyRequirements>' ) ;
    public final EObject ruleVSSSSafetyRequirements() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_5=null;
        EObject lv_sectionDescription_2_0 = null;

        EObject lv_sssItems_3_0 = null;

        EObject lv_sssRequirementSubsections_4_0 = null;



        	enterRule();

        try {
            // InternalSSS.g:4182:2: ( ( () otherlv_1= '<SafetyRequirements>' ( (lv_sectionDescription_2_0= ruleDBody ) )? ( (lv_sssItems_3_0= ruleVSSSDocumentItem ) )* ( (lv_sssRequirementSubsections_4_0= ruleVSSSInstantiableRequirementSection ) )* otherlv_5= '</SafetyRequirements>' ) )
            // InternalSSS.g:4183:2: ( () otherlv_1= '<SafetyRequirements>' ( (lv_sectionDescription_2_0= ruleDBody ) )? ( (lv_sssItems_3_0= ruleVSSSDocumentItem ) )* ( (lv_sssRequirementSubsections_4_0= ruleVSSSInstantiableRequirementSection ) )* otherlv_5= '</SafetyRequirements>' )
            {
            // InternalSSS.g:4183:2: ( () otherlv_1= '<SafetyRequirements>' ( (lv_sectionDescription_2_0= ruleDBody ) )? ( (lv_sssItems_3_0= ruleVSSSDocumentItem ) )* ( (lv_sssRequirementSubsections_4_0= ruleVSSSInstantiableRequirementSection ) )* otherlv_5= '</SafetyRequirements>' )
            // InternalSSS.g:4184:3: () otherlv_1= '<SafetyRequirements>' ( (lv_sectionDescription_2_0= ruleDBody ) )? ( (lv_sssItems_3_0= ruleVSSSDocumentItem ) )* ( (lv_sssRequirementSubsections_4_0= ruleVSSSInstantiableRequirementSection ) )* otherlv_5= '</SafetyRequirements>'
            {
            // InternalSSS.g:4184:3: ()
            // InternalSSS.g:4185:4: 
            {
            if ( state.backtracking==0 ) {

              				/* */
              			
            }
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getVSSSSafetyRequirementsAccess().getVSSSSafetyRequirementsAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,109,FollowSets000.FOLLOW_138); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getVSSSSafetyRequirementsAccess().getSafetyRequirementsKeyword_1());
              		
            }
            // InternalSSS.g:4198:3: ( (lv_sectionDescription_2_0= ruleDBody ) )?
            int alt77=2;
            int LA77_0 = input.LA(1);

            if ( (LA77_0==21) ) {
                alt77=1;
            }
            switch (alt77) {
                case 1 :
                    // InternalSSS.g:4199:4: (lv_sectionDescription_2_0= ruleDBody )
                    {
                    // InternalSSS.g:4199:4: (lv_sectionDescription_2_0= ruleDBody )
                    // InternalSSS.g:4200:5: lv_sectionDescription_2_0= ruleDBody
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getVSSSSafetyRequirementsAccess().getSectionDescriptionDBodyParserRuleCall_2_0());
                      				
                    }
                    pushFollow(FollowSets000.FOLLOW_139);
                    lv_sectionDescription_2_0=ruleDBody();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getVSSSSafetyRequirementsRule());
                      					}
                      					set(
                      						current,
                      						"sectionDescription",
                      						lv_sectionDescription_2_0,
                      						"es.uah.aut.srg.micobs.svm.lang.sss.SSS.DBody");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }
                    break;

            }

            // InternalSSS.g:4217:3: ( (lv_sssItems_3_0= ruleVSSSDocumentItem ) )*
            loop78:
            do {
                int alt78=2;
                int LA78_0 = input.LA(1);

                if ( (LA78_0==123) ) {
                    alt78=1;
                }


                switch (alt78) {
            	case 1 :
            	    // InternalSSS.g:4218:4: (lv_sssItems_3_0= ruleVSSSDocumentItem )
            	    {
            	    // InternalSSS.g:4218:4: (lv_sssItems_3_0= ruleVSSSDocumentItem )
            	    // InternalSSS.g:4219:5: lv_sssItems_3_0= ruleVSSSDocumentItem
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getVSSSSafetyRequirementsAccess().getSssItemsVSSSDocumentItemParserRuleCall_3_0());
            	      				
            	    }
            	    pushFollow(FollowSets000.FOLLOW_139);
            	    lv_sssItems_3_0=ruleVSSSDocumentItem();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getVSSSSafetyRequirementsRule());
            	      					}
            	      					add(
            	      						current,
            	      						"sssItems",
            	      						lv_sssItems_3_0,
            	      						"es.uah.aut.srg.micobs.svm.lang.sss.SSS.VSSSDocumentItem");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop78;
                }
            } while (true);

            // InternalSSS.g:4236:3: ( (lv_sssRequirementSubsections_4_0= ruleVSSSInstantiableRequirementSection ) )*
            loop79:
            do {
                int alt79=2;
                int LA79_0 = input.LA(1);

                if ( (LA79_0==63) ) {
                    alt79=1;
                }


                switch (alt79) {
            	case 1 :
            	    // InternalSSS.g:4237:4: (lv_sssRequirementSubsections_4_0= ruleVSSSInstantiableRequirementSection )
            	    {
            	    // InternalSSS.g:4237:4: (lv_sssRequirementSubsections_4_0= ruleVSSSInstantiableRequirementSection )
            	    // InternalSSS.g:4238:5: lv_sssRequirementSubsections_4_0= ruleVSSSInstantiableRequirementSection
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getVSSSSafetyRequirementsAccess().getSssRequirementSubsectionsVSSSInstantiableRequirementSectionParserRuleCall_4_0());
            	      				
            	    }
            	    pushFollow(FollowSets000.FOLLOW_140);
            	    lv_sssRequirementSubsections_4_0=ruleVSSSInstantiableRequirementSection();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getVSSSSafetyRequirementsRule());
            	      					}
            	      					add(
            	      						current,
            	      						"sssRequirementSubsections",
            	      						lv_sssRequirementSubsections_4_0,
            	      						"es.uah.aut.srg.micobs.svm.lang.sss.SSS.VSSSInstantiableRequirementSection");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop79;
                }
            } while (true);

            otherlv_5=(Token)match(input,110,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getVSSSSafetyRequirementsAccess().getSafetyRequirementsKeyword_5());
              		
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
    // $ANTLR end "ruleVSSSSafetyRequirements"


    // $ANTLR start "entryRuleVSSSReliabilityAvailabilityRequirements"
    // InternalSSS.g:4263:1: entryRuleVSSSReliabilityAvailabilityRequirements returns [EObject current=null] : iv_ruleVSSSReliabilityAvailabilityRequirements= ruleVSSSReliabilityAvailabilityRequirements EOF ;
    public final EObject entryRuleVSSSReliabilityAvailabilityRequirements() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVSSSReliabilityAvailabilityRequirements = null;


        try {
            // InternalSSS.g:4263:80: (iv_ruleVSSSReliabilityAvailabilityRequirements= ruleVSSSReliabilityAvailabilityRequirements EOF )
            // InternalSSS.g:4264:2: iv_ruleVSSSReliabilityAvailabilityRequirements= ruleVSSSReliabilityAvailabilityRequirements EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getVSSSReliabilityAvailabilityRequirementsRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleVSSSReliabilityAvailabilityRequirements=ruleVSSSReliabilityAvailabilityRequirements();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleVSSSReliabilityAvailabilityRequirements; 
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
    // $ANTLR end "entryRuleVSSSReliabilityAvailabilityRequirements"


    // $ANTLR start "ruleVSSSReliabilityAvailabilityRequirements"
    // InternalSSS.g:4270:1: ruleVSSSReliabilityAvailabilityRequirements returns [EObject current=null] : ( () otherlv_1= '<ReliabilityAvailabilityRequirements>' ( (lv_sssItems_2_0= ruleVSSSDocumentItem ) )* ( (lv_sectionDescription_3_0= ruleDBody ) )? ( (lv_sssRequirementSubsections_4_0= ruleVSSSInstantiableRequirementSection ) )* otherlv_5= '</ReliabilityAvailabilityRequirements>' ) ;
    public final EObject ruleVSSSReliabilityAvailabilityRequirements() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_5=null;
        EObject lv_sssItems_2_0 = null;

        EObject lv_sectionDescription_3_0 = null;

        EObject lv_sssRequirementSubsections_4_0 = null;



        	enterRule();

        try {
            // InternalSSS.g:4276:2: ( ( () otherlv_1= '<ReliabilityAvailabilityRequirements>' ( (lv_sssItems_2_0= ruleVSSSDocumentItem ) )* ( (lv_sectionDescription_3_0= ruleDBody ) )? ( (lv_sssRequirementSubsections_4_0= ruleVSSSInstantiableRequirementSection ) )* otherlv_5= '</ReliabilityAvailabilityRequirements>' ) )
            // InternalSSS.g:4277:2: ( () otherlv_1= '<ReliabilityAvailabilityRequirements>' ( (lv_sssItems_2_0= ruleVSSSDocumentItem ) )* ( (lv_sectionDescription_3_0= ruleDBody ) )? ( (lv_sssRequirementSubsections_4_0= ruleVSSSInstantiableRequirementSection ) )* otherlv_5= '</ReliabilityAvailabilityRequirements>' )
            {
            // InternalSSS.g:4277:2: ( () otherlv_1= '<ReliabilityAvailabilityRequirements>' ( (lv_sssItems_2_0= ruleVSSSDocumentItem ) )* ( (lv_sectionDescription_3_0= ruleDBody ) )? ( (lv_sssRequirementSubsections_4_0= ruleVSSSInstantiableRequirementSection ) )* otherlv_5= '</ReliabilityAvailabilityRequirements>' )
            // InternalSSS.g:4278:3: () otherlv_1= '<ReliabilityAvailabilityRequirements>' ( (lv_sssItems_2_0= ruleVSSSDocumentItem ) )* ( (lv_sectionDescription_3_0= ruleDBody ) )? ( (lv_sssRequirementSubsections_4_0= ruleVSSSInstantiableRequirementSection ) )* otherlv_5= '</ReliabilityAvailabilityRequirements>'
            {
            // InternalSSS.g:4278:3: ()
            // InternalSSS.g:4279:4: 
            {
            if ( state.backtracking==0 ) {

              				/* */
              			
            }
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getVSSSReliabilityAvailabilityRequirementsAccess().getVSSSReliabilityAvailabilityRequirementsAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,111,FollowSets000.FOLLOW_141); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getVSSSReliabilityAvailabilityRequirementsAccess().getReliabilityAvailabilityRequirementsKeyword_1());
              		
            }
            // InternalSSS.g:4292:3: ( (lv_sssItems_2_0= ruleVSSSDocumentItem ) )*
            loop80:
            do {
                int alt80=2;
                int LA80_0 = input.LA(1);

                if ( (LA80_0==123) ) {
                    alt80=1;
                }


                switch (alt80) {
            	case 1 :
            	    // InternalSSS.g:4293:4: (lv_sssItems_2_0= ruleVSSSDocumentItem )
            	    {
            	    // InternalSSS.g:4293:4: (lv_sssItems_2_0= ruleVSSSDocumentItem )
            	    // InternalSSS.g:4294:5: lv_sssItems_2_0= ruleVSSSDocumentItem
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getVSSSReliabilityAvailabilityRequirementsAccess().getSssItemsVSSSDocumentItemParserRuleCall_2_0());
            	      				
            	    }
            	    pushFollow(FollowSets000.FOLLOW_141);
            	    lv_sssItems_2_0=ruleVSSSDocumentItem();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getVSSSReliabilityAvailabilityRequirementsRule());
            	      					}
            	      					add(
            	      						current,
            	      						"sssItems",
            	      						lv_sssItems_2_0,
            	      						"es.uah.aut.srg.micobs.svm.lang.sss.SSS.VSSSDocumentItem");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop80;
                }
            } while (true);

            // InternalSSS.g:4311:3: ( (lv_sectionDescription_3_0= ruleDBody ) )?
            int alt81=2;
            int LA81_0 = input.LA(1);

            if ( (LA81_0==21) ) {
                alt81=1;
            }
            switch (alt81) {
                case 1 :
                    // InternalSSS.g:4312:4: (lv_sectionDescription_3_0= ruleDBody )
                    {
                    // InternalSSS.g:4312:4: (lv_sectionDescription_3_0= ruleDBody )
                    // InternalSSS.g:4313:5: lv_sectionDescription_3_0= ruleDBody
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getVSSSReliabilityAvailabilityRequirementsAccess().getSectionDescriptionDBodyParserRuleCall_3_0());
                      				
                    }
                    pushFollow(FollowSets000.FOLLOW_142);
                    lv_sectionDescription_3_0=ruleDBody();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getVSSSReliabilityAvailabilityRequirementsRule());
                      					}
                      					set(
                      						current,
                      						"sectionDescription",
                      						lv_sectionDescription_3_0,
                      						"es.uah.aut.srg.micobs.svm.lang.sss.SSS.DBody");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }
                    break;

            }

            // InternalSSS.g:4330:3: ( (lv_sssRequirementSubsections_4_0= ruleVSSSInstantiableRequirementSection ) )*
            loop82:
            do {
                int alt82=2;
                int LA82_0 = input.LA(1);

                if ( (LA82_0==63) ) {
                    alt82=1;
                }


                switch (alt82) {
            	case 1 :
            	    // InternalSSS.g:4331:4: (lv_sssRequirementSubsections_4_0= ruleVSSSInstantiableRequirementSection )
            	    {
            	    // InternalSSS.g:4331:4: (lv_sssRequirementSubsections_4_0= ruleVSSSInstantiableRequirementSection )
            	    // InternalSSS.g:4332:5: lv_sssRequirementSubsections_4_0= ruleVSSSInstantiableRequirementSection
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getVSSSReliabilityAvailabilityRequirementsAccess().getSssRequirementSubsectionsVSSSInstantiableRequirementSectionParserRuleCall_4_0());
            	      				
            	    }
            	    pushFollow(FollowSets000.FOLLOW_142);
            	    lv_sssRequirementSubsections_4_0=ruleVSSSInstantiableRequirementSection();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getVSSSReliabilityAvailabilityRequirementsRule());
            	      					}
            	      					add(
            	      						current,
            	      						"sssRequirementSubsections",
            	      						lv_sssRequirementSubsections_4_0,
            	      						"es.uah.aut.srg.micobs.svm.lang.sss.SSS.VSSSInstantiableRequirementSection");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop82;
                }
            } while (true);

            otherlv_5=(Token)match(input,112,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getVSSSReliabilityAvailabilityRequirementsAccess().getReliabilityAvailabilityRequirementsKeyword_5());
              		
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
    // $ANTLR end "ruleVSSSReliabilityAvailabilityRequirements"


    // $ANTLR start "entryRuleVSSSQualityRequirements"
    // InternalSSS.g:4357:1: entryRuleVSSSQualityRequirements returns [EObject current=null] : iv_ruleVSSSQualityRequirements= ruleVSSSQualityRequirements EOF ;
    public final EObject entryRuleVSSSQualityRequirements() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVSSSQualityRequirements = null;


        try {
            // InternalSSS.g:4357:64: (iv_ruleVSSSQualityRequirements= ruleVSSSQualityRequirements EOF )
            // InternalSSS.g:4358:2: iv_ruleVSSSQualityRequirements= ruleVSSSQualityRequirements EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getVSSSQualityRequirementsRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleVSSSQualityRequirements=ruleVSSSQualityRequirements();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleVSSSQualityRequirements; 
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
    // $ANTLR end "entryRuleVSSSQualityRequirements"


    // $ANTLR start "ruleVSSSQualityRequirements"
    // InternalSSS.g:4364:1: ruleVSSSQualityRequirements returns [EObject current=null] : ( () otherlv_1= '<QualityRequirements>' ( (lv_sectionDescription_2_0= ruleDBody ) )? ( (lv_sssItems_3_0= ruleVSSSDocumentItem ) )* ( (lv_sssRequirementSubsections_4_0= ruleVSSSInstantiableRequirementSection ) )* otherlv_5= '</QualityRequirements>' ) ;
    public final EObject ruleVSSSQualityRequirements() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_5=null;
        EObject lv_sectionDescription_2_0 = null;

        EObject lv_sssItems_3_0 = null;

        EObject lv_sssRequirementSubsections_4_0 = null;



        	enterRule();

        try {
            // InternalSSS.g:4370:2: ( ( () otherlv_1= '<QualityRequirements>' ( (lv_sectionDescription_2_0= ruleDBody ) )? ( (lv_sssItems_3_0= ruleVSSSDocumentItem ) )* ( (lv_sssRequirementSubsections_4_0= ruleVSSSInstantiableRequirementSection ) )* otherlv_5= '</QualityRequirements>' ) )
            // InternalSSS.g:4371:2: ( () otherlv_1= '<QualityRequirements>' ( (lv_sectionDescription_2_0= ruleDBody ) )? ( (lv_sssItems_3_0= ruleVSSSDocumentItem ) )* ( (lv_sssRequirementSubsections_4_0= ruleVSSSInstantiableRequirementSection ) )* otherlv_5= '</QualityRequirements>' )
            {
            // InternalSSS.g:4371:2: ( () otherlv_1= '<QualityRequirements>' ( (lv_sectionDescription_2_0= ruleDBody ) )? ( (lv_sssItems_3_0= ruleVSSSDocumentItem ) )* ( (lv_sssRequirementSubsections_4_0= ruleVSSSInstantiableRequirementSection ) )* otherlv_5= '</QualityRequirements>' )
            // InternalSSS.g:4372:3: () otherlv_1= '<QualityRequirements>' ( (lv_sectionDescription_2_0= ruleDBody ) )? ( (lv_sssItems_3_0= ruleVSSSDocumentItem ) )* ( (lv_sssRequirementSubsections_4_0= ruleVSSSInstantiableRequirementSection ) )* otherlv_5= '</QualityRequirements>'
            {
            // InternalSSS.g:4372:3: ()
            // InternalSSS.g:4373:4: 
            {
            if ( state.backtracking==0 ) {

              				/* */
              			
            }
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getVSSSQualityRequirementsAccess().getVSSSQualityRequirementsAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,113,FollowSets000.FOLLOW_143); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getVSSSQualityRequirementsAccess().getQualityRequirementsKeyword_1());
              		
            }
            // InternalSSS.g:4386:3: ( (lv_sectionDescription_2_0= ruleDBody ) )?
            int alt83=2;
            int LA83_0 = input.LA(1);

            if ( (LA83_0==21) ) {
                alt83=1;
            }
            switch (alt83) {
                case 1 :
                    // InternalSSS.g:4387:4: (lv_sectionDescription_2_0= ruleDBody )
                    {
                    // InternalSSS.g:4387:4: (lv_sectionDescription_2_0= ruleDBody )
                    // InternalSSS.g:4388:5: lv_sectionDescription_2_0= ruleDBody
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getVSSSQualityRequirementsAccess().getSectionDescriptionDBodyParserRuleCall_2_0());
                      				
                    }
                    pushFollow(FollowSets000.FOLLOW_144);
                    lv_sectionDescription_2_0=ruleDBody();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getVSSSQualityRequirementsRule());
                      					}
                      					set(
                      						current,
                      						"sectionDescription",
                      						lv_sectionDescription_2_0,
                      						"es.uah.aut.srg.micobs.svm.lang.sss.SSS.DBody");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }
                    break;

            }

            // InternalSSS.g:4405:3: ( (lv_sssItems_3_0= ruleVSSSDocumentItem ) )*
            loop84:
            do {
                int alt84=2;
                int LA84_0 = input.LA(1);

                if ( (LA84_0==123) ) {
                    alt84=1;
                }


                switch (alt84) {
            	case 1 :
            	    // InternalSSS.g:4406:4: (lv_sssItems_3_0= ruleVSSSDocumentItem )
            	    {
            	    // InternalSSS.g:4406:4: (lv_sssItems_3_0= ruleVSSSDocumentItem )
            	    // InternalSSS.g:4407:5: lv_sssItems_3_0= ruleVSSSDocumentItem
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getVSSSQualityRequirementsAccess().getSssItemsVSSSDocumentItemParserRuleCall_3_0());
            	      				
            	    }
            	    pushFollow(FollowSets000.FOLLOW_144);
            	    lv_sssItems_3_0=ruleVSSSDocumentItem();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getVSSSQualityRequirementsRule());
            	      					}
            	      					add(
            	      						current,
            	      						"sssItems",
            	      						lv_sssItems_3_0,
            	      						"es.uah.aut.srg.micobs.svm.lang.sss.SSS.VSSSDocumentItem");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop84;
                }
            } while (true);

            // InternalSSS.g:4424:3: ( (lv_sssRequirementSubsections_4_0= ruleVSSSInstantiableRequirementSection ) )*
            loop85:
            do {
                int alt85=2;
                int LA85_0 = input.LA(1);

                if ( (LA85_0==63) ) {
                    alt85=1;
                }


                switch (alt85) {
            	case 1 :
            	    // InternalSSS.g:4425:4: (lv_sssRequirementSubsections_4_0= ruleVSSSInstantiableRequirementSection )
            	    {
            	    // InternalSSS.g:4425:4: (lv_sssRequirementSubsections_4_0= ruleVSSSInstantiableRequirementSection )
            	    // InternalSSS.g:4426:5: lv_sssRequirementSubsections_4_0= ruleVSSSInstantiableRequirementSection
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getVSSSQualityRequirementsAccess().getSssRequirementSubsectionsVSSSInstantiableRequirementSectionParserRuleCall_4_0());
            	      				
            	    }
            	    pushFollow(FollowSets000.FOLLOW_145);
            	    lv_sssRequirementSubsections_4_0=ruleVSSSInstantiableRequirementSection();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getVSSSQualityRequirementsRule());
            	      					}
            	      					add(
            	      						current,
            	      						"sssRequirementSubsections",
            	      						lv_sssRequirementSubsections_4_0,
            	      						"es.uah.aut.srg.micobs.svm.lang.sss.SSS.VSSSInstantiableRequirementSection");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop85;
                }
            } while (true);

            otherlv_5=(Token)match(input,114,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getVSSSQualityRequirementsAccess().getQualityRequirementsKeyword_5());
              		
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
    // $ANTLR end "ruleVSSSQualityRequirements"


    // $ANTLR start "entryRuleVSSSDesignRequirements"
    // InternalSSS.g:4451:1: entryRuleVSSSDesignRequirements returns [EObject current=null] : iv_ruleVSSSDesignRequirements= ruleVSSSDesignRequirements EOF ;
    public final EObject entryRuleVSSSDesignRequirements() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVSSSDesignRequirements = null;


        try {
            // InternalSSS.g:4451:63: (iv_ruleVSSSDesignRequirements= ruleVSSSDesignRequirements EOF )
            // InternalSSS.g:4452:2: iv_ruleVSSSDesignRequirements= ruleVSSSDesignRequirements EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getVSSSDesignRequirementsRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleVSSSDesignRequirements=ruleVSSSDesignRequirements();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleVSSSDesignRequirements; 
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
    // $ANTLR end "entryRuleVSSSDesignRequirements"


    // $ANTLR start "ruleVSSSDesignRequirements"
    // InternalSSS.g:4458:1: ruleVSSSDesignRequirements returns [EObject current=null] : ( () otherlv_1= '<DesignRequirements>' ( (lv_sectionDescription_2_0= ruleDBody ) )? ( (lv_sssItems_3_0= ruleVSSSDocumentItem ) )* ( (lv_sssRequirementSubsections_4_0= ruleVSSSInstantiableRequirementSection ) )* otherlv_5= '</DesignRequirements>' ) ;
    public final EObject ruleVSSSDesignRequirements() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_5=null;
        EObject lv_sectionDescription_2_0 = null;

        EObject lv_sssItems_3_0 = null;

        EObject lv_sssRequirementSubsections_4_0 = null;



        	enterRule();

        try {
            // InternalSSS.g:4464:2: ( ( () otherlv_1= '<DesignRequirements>' ( (lv_sectionDescription_2_0= ruleDBody ) )? ( (lv_sssItems_3_0= ruleVSSSDocumentItem ) )* ( (lv_sssRequirementSubsections_4_0= ruleVSSSInstantiableRequirementSection ) )* otherlv_5= '</DesignRequirements>' ) )
            // InternalSSS.g:4465:2: ( () otherlv_1= '<DesignRequirements>' ( (lv_sectionDescription_2_0= ruleDBody ) )? ( (lv_sssItems_3_0= ruleVSSSDocumentItem ) )* ( (lv_sssRequirementSubsections_4_0= ruleVSSSInstantiableRequirementSection ) )* otherlv_5= '</DesignRequirements>' )
            {
            // InternalSSS.g:4465:2: ( () otherlv_1= '<DesignRequirements>' ( (lv_sectionDescription_2_0= ruleDBody ) )? ( (lv_sssItems_3_0= ruleVSSSDocumentItem ) )* ( (lv_sssRequirementSubsections_4_0= ruleVSSSInstantiableRequirementSection ) )* otherlv_5= '</DesignRequirements>' )
            // InternalSSS.g:4466:3: () otherlv_1= '<DesignRequirements>' ( (lv_sectionDescription_2_0= ruleDBody ) )? ( (lv_sssItems_3_0= ruleVSSSDocumentItem ) )* ( (lv_sssRequirementSubsections_4_0= ruleVSSSInstantiableRequirementSection ) )* otherlv_5= '</DesignRequirements>'
            {
            // InternalSSS.g:4466:3: ()
            // InternalSSS.g:4467:4: 
            {
            if ( state.backtracking==0 ) {

              				/* */
              			
            }
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getVSSSDesignRequirementsAccess().getVSSSDesignRequirementsAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,115,FollowSets000.FOLLOW_146); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getVSSSDesignRequirementsAccess().getDesignRequirementsKeyword_1());
              		
            }
            // InternalSSS.g:4480:3: ( (lv_sectionDescription_2_0= ruleDBody ) )?
            int alt86=2;
            int LA86_0 = input.LA(1);

            if ( (LA86_0==21) ) {
                alt86=1;
            }
            switch (alt86) {
                case 1 :
                    // InternalSSS.g:4481:4: (lv_sectionDescription_2_0= ruleDBody )
                    {
                    // InternalSSS.g:4481:4: (lv_sectionDescription_2_0= ruleDBody )
                    // InternalSSS.g:4482:5: lv_sectionDescription_2_0= ruleDBody
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getVSSSDesignRequirementsAccess().getSectionDescriptionDBodyParserRuleCall_2_0());
                      				
                    }
                    pushFollow(FollowSets000.FOLLOW_147);
                    lv_sectionDescription_2_0=ruleDBody();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getVSSSDesignRequirementsRule());
                      					}
                      					set(
                      						current,
                      						"sectionDescription",
                      						lv_sectionDescription_2_0,
                      						"es.uah.aut.srg.micobs.svm.lang.sss.SSS.DBody");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }
                    break;

            }

            // InternalSSS.g:4499:3: ( (lv_sssItems_3_0= ruleVSSSDocumentItem ) )*
            loop87:
            do {
                int alt87=2;
                int LA87_0 = input.LA(1);

                if ( (LA87_0==123) ) {
                    alt87=1;
                }


                switch (alt87) {
            	case 1 :
            	    // InternalSSS.g:4500:4: (lv_sssItems_3_0= ruleVSSSDocumentItem )
            	    {
            	    // InternalSSS.g:4500:4: (lv_sssItems_3_0= ruleVSSSDocumentItem )
            	    // InternalSSS.g:4501:5: lv_sssItems_3_0= ruleVSSSDocumentItem
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getVSSSDesignRequirementsAccess().getSssItemsVSSSDocumentItemParserRuleCall_3_0());
            	      				
            	    }
            	    pushFollow(FollowSets000.FOLLOW_147);
            	    lv_sssItems_3_0=ruleVSSSDocumentItem();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getVSSSDesignRequirementsRule());
            	      					}
            	      					add(
            	      						current,
            	      						"sssItems",
            	      						lv_sssItems_3_0,
            	      						"es.uah.aut.srg.micobs.svm.lang.sss.SSS.VSSSDocumentItem");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop87;
                }
            } while (true);

            // InternalSSS.g:4518:3: ( (lv_sssRequirementSubsections_4_0= ruleVSSSInstantiableRequirementSection ) )*
            loop88:
            do {
                int alt88=2;
                int LA88_0 = input.LA(1);

                if ( (LA88_0==63) ) {
                    alt88=1;
                }


                switch (alt88) {
            	case 1 :
            	    // InternalSSS.g:4519:4: (lv_sssRequirementSubsections_4_0= ruleVSSSInstantiableRequirementSection )
            	    {
            	    // InternalSSS.g:4519:4: (lv_sssRequirementSubsections_4_0= ruleVSSSInstantiableRequirementSection )
            	    // InternalSSS.g:4520:5: lv_sssRequirementSubsections_4_0= ruleVSSSInstantiableRequirementSection
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getVSSSDesignRequirementsAccess().getSssRequirementSubsectionsVSSSInstantiableRequirementSectionParserRuleCall_4_0());
            	      				
            	    }
            	    pushFollow(FollowSets000.FOLLOW_148);
            	    lv_sssRequirementSubsections_4_0=ruleVSSSInstantiableRequirementSection();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getVSSSDesignRequirementsRule());
            	      					}
            	      					add(
            	      						current,
            	      						"sssRequirementSubsections",
            	      						lv_sssRequirementSubsections_4_0,
            	      						"es.uah.aut.srg.micobs.svm.lang.sss.SSS.VSSSInstantiableRequirementSection");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop88;
                }
            } while (true);

            otherlv_5=(Token)match(input,116,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getVSSSDesignRequirementsAccess().getDesignRequirementsKeyword_5());
              		
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
    // $ANTLR end "ruleVSSSDesignRequirements"


    // $ANTLR start "entryRuleVSSSSoftwareOperationsRequirements"
    // InternalSSS.g:4545:1: entryRuleVSSSSoftwareOperationsRequirements returns [EObject current=null] : iv_ruleVSSSSoftwareOperationsRequirements= ruleVSSSSoftwareOperationsRequirements EOF ;
    public final EObject entryRuleVSSSSoftwareOperationsRequirements() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVSSSSoftwareOperationsRequirements = null;


        try {
            // InternalSSS.g:4545:75: (iv_ruleVSSSSoftwareOperationsRequirements= ruleVSSSSoftwareOperationsRequirements EOF )
            // InternalSSS.g:4546:2: iv_ruleVSSSSoftwareOperationsRequirements= ruleVSSSSoftwareOperationsRequirements EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getVSSSSoftwareOperationsRequirementsRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleVSSSSoftwareOperationsRequirements=ruleVSSSSoftwareOperationsRequirements();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleVSSSSoftwareOperationsRequirements; 
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
    // $ANTLR end "entryRuleVSSSSoftwareOperationsRequirements"


    // $ANTLR start "ruleVSSSSoftwareOperationsRequirements"
    // InternalSSS.g:4552:1: ruleVSSSSoftwareOperationsRequirements returns [EObject current=null] : ( () otherlv_1= '<SoftwareOperationsRequirements>' ( (lv_sectionDescription_2_0= ruleDBody ) )? ( (lv_sssItems_3_0= ruleVSSSDocumentItem ) )* ( (lv_sssRequirementSubsections_4_0= ruleVSSSInstantiableRequirementSection ) )* otherlv_5= '</SoftwareOperationsRequirements>' ) ;
    public final EObject ruleVSSSSoftwareOperationsRequirements() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_5=null;
        EObject lv_sectionDescription_2_0 = null;

        EObject lv_sssItems_3_0 = null;

        EObject lv_sssRequirementSubsections_4_0 = null;



        	enterRule();

        try {
            // InternalSSS.g:4558:2: ( ( () otherlv_1= '<SoftwareOperationsRequirements>' ( (lv_sectionDescription_2_0= ruleDBody ) )? ( (lv_sssItems_3_0= ruleVSSSDocumentItem ) )* ( (lv_sssRequirementSubsections_4_0= ruleVSSSInstantiableRequirementSection ) )* otherlv_5= '</SoftwareOperationsRequirements>' ) )
            // InternalSSS.g:4559:2: ( () otherlv_1= '<SoftwareOperationsRequirements>' ( (lv_sectionDescription_2_0= ruleDBody ) )? ( (lv_sssItems_3_0= ruleVSSSDocumentItem ) )* ( (lv_sssRequirementSubsections_4_0= ruleVSSSInstantiableRequirementSection ) )* otherlv_5= '</SoftwareOperationsRequirements>' )
            {
            // InternalSSS.g:4559:2: ( () otherlv_1= '<SoftwareOperationsRequirements>' ( (lv_sectionDescription_2_0= ruleDBody ) )? ( (lv_sssItems_3_0= ruleVSSSDocumentItem ) )* ( (lv_sssRequirementSubsections_4_0= ruleVSSSInstantiableRequirementSection ) )* otherlv_5= '</SoftwareOperationsRequirements>' )
            // InternalSSS.g:4560:3: () otherlv_1= '<SoftwareOperationsRequirements>' ( (lv_sectionDescription_2_0= ruleDBody ) )? ( (lv_sssItems_3_0= ruleVSSSDocumentItem ) )* ( (lv_sssRequirementSubsections_4_0= ruleVSSSInstantiableRequirementSection ) )* otherlv_5= '</SoftwareOperationsRequirements>'
            {
            // InternalSSS.g:4560:3: ()
            // InternalSSS.g:4561:4: 
            {
            if ( state.backtracking==0 ) {

              				/* */
              			
            }
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getVSSSSoftwareOperationsRequirementsAccess().getVSSSSoftwareOperationsRequirementsAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,117,FollowSets000.FOLLOW_149); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getVSSSSoftwareOperationsRequirementsAccess().getSoftwareOperationsRequirementsKeyword_1());
              		
            }
            // InternalSSS.g:4574:3: ( (lv_sectionDescription_2_0= ruleDBody ) )?
            int alt89=2;
            int LA89_0 = input.LA(1);

            if ( (LA89_0==21) ) {
                alt89=1;
            }
            switch (alt89) {
                case 1 :
                    // InternalSSS.g:4575:4: (lv_sectionDescription_2_0= ruleDBody )
                    {
                    // InternalSSS.g:4575:4: (lv_sectionDescription_2_0= ruleDBody )
                    // InternalSSS.g:4576:5: lv_sectionDescription_2_0= ruleDBody
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getVSSSSoftwareOperationsRequirementsAccess().getSectionDescriptionDBodyParserRuleCall_2_0());
                      				
                    }
                    pushFollow(FollowSets000.FOLLOW_150);
                    lv_sectionDescription_2_0=ruleDBody();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getVSSSSoftwareOperationsRequirementsRule());
                      					}
                      					set(
                      						current,
                      						"sectionDescription",
                      						lv_sectionDescription_2_0,
                      						"es.uah.aut.srg.micobs.svm.lang.sss.SSS.DBody");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }
                    break;

            }

            // InternalSSS.g:4593:3: ( (lv_sssItems_3_0= ruleVSSSDocumentItem ) )*
            loop90:
            do {
                int alt90=2;
                int LA90_0 = input.LA(1);

                if ( (LA90_0==123) ) {
                    alt90=1;
                }


                switch (alt90) {
            	case 1 :
            	    // InternalSSS.g:4594:4: (lv_sssItems_3_0= ruleVSSSDocumentItem )
            	    {
            	    // InternalSSS.g:4594:4: (lv_sssItems_3_0= ruleVSSSDocumentItem )
            	    // InternalSSS.g:4595:5: lv_sssItems_3_0= ruleVSSSDocumentItem
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getVSSSSoftwareOperationsRequirementsAccess().getSssItemsVSSSDocumentItemParserRuleCall_3_0());
            	      				
            	    }
            	    pushFollow(FollowSets000.FOLLOW_150);
            	    lv_sssItems_3_0=ruleVSSSDocumentItem();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getVSSSSoftwareOperationsRequirementsRule());
            	      					}
            	      					add(
            	      						current,
            	      						"sssItems",
            	      						lv_sssItems_3_0,
            	      						"es.uah.aut.srg.micobs.svm.lang.sss.SSS.VSSSDocumentItem");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop90;
                }
            } while (true);

            // InternalSSS.g:4612:3: ( (lv_sssRequirementSubsections_4_0= ruleVSSSInstantiableRequirementSection ) )*
            loop91:
            do {
                int alt91=2;
                int LA91_0 = input.LA(1);

                if ( (LA91_0==63) ) {
                    alt91=1;
                }


                switch (alt91) {
            	case 1 :
            	    // InternalSSS.g:4613:4: (lv_sssRequirementSubsections_4_0= ruleVSSSInstantiableRequirementSection )
            	    {
            	    // InternalSSS.g:4613:4: (lv_sssRequirementSubsections_4_0= ruleVSSSInstantiableRequirementSection )
            	    // InternalSSS.g:4614:5: lv_sssRequirementSubsections_4_0= ruleVSSSInstantiableRequirementSection
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getVSSSSoftwareOperationsRequirementsAccess().getSssRequirementSubsectionsVSSSInstantiableRequirementSectionParserRuleCall_4_0());
            	      				
            	    }
            	    pushFollow(FollowSets000.FOLLOW_151);
            	    lv_sssRequirementSubsections_4_0=ruleVSSSInstantiableRequirementSection();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getVSSSSoftwareOperationsRequirementsRule());
            	      					}
            	      					add(
            	      						current,
            	      						"sssRequirementSubsections",
            	      						lv_sssRequirementSubsections_4_0,
            	      						"es.uah.aut.srg.micobs.svm.lang.sss.SSS.VSSSInstantiableRequirementSection");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop91;
                }
            } while (true);

            otherlv_5=(Token)match(input,118,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getVSSSSoftwareOperationsRequirementsAccess().getSoftwareOperationsRequirementsKeyword_5());
              		
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
    // $ANTLR end "ruleVSSSSoftwareOperationsRequirements"


    // $ANTLR start "entryRuleVSSSSoftwareMaintenanceRequirements"
    // InternalSSS.g:4639:1: entryRuleVSSSSoftwareMaintenanceRequirements returns [EObject current=null] : iv_ruleVSSSSoftwareMaintenanceRequirements= ruleVSSSSoftwareMaintenanceRequirements EOF ;
    public final EObject entryRuleVSSSSoftwareMaintenanceRequirements() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVSSSSoftwareMaintenanceRequirements = null;


        try {
            // InternalSSS.g:4639:76: (iv_ruleVSSSSoftwareMaintenanceRequirements= ruleVSSSSoftwareMaintenanceRequirements EOF )
            // InternalSSS.g:4640:2: iv_ruleVSSSSoftwareMaintenanceRequirements= ruleVSSSSoftwareMaintenanceRequirements EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getVSSSSoftwareMaintenanceRequirementsRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleVSSSSoftwareMaintenanceRequirements=ruleVSSSSoftwareMaintenanceRequirements();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleVSSSSoftwareMaintenanceRequirements; 
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
    // $ANTLR end "entryRuleVSSSSoftwareMaintenanceRequirements"


    // $ANTLR start "ruleVSSSSoftwareMaintenanceRequirements"
    // InternalSSS.g:4646:1: ruleVSSSSoftwareMaintenanceRequirements returns [EObject current=null] : ( () otherlv_1= '<SoftwareMaintenanceRequirements>' ( (lv_sectionDescription_2_0= ruleDBody ) )? ( (lv_sssItems_3_0= ruleVSSSDocumentItem ) )* ( (lv_sssRequirementSubsections_4_0= ruleVSSSInstantiableRequirementSection ) )* otherlv_5= '</SoftwareMaintenanceRequirements>' ) ;
    public final EObject ruleVSSSSoftwareMaintenanceRequirements() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_5=null;
        EObject lv_sectionDescription_2_0 = null;

        EObject lv_sssItems_3_0 = null;

        EObject lv_sssRequirementSubsections_4_0 = null;



        	enterRule();

        try {
            // InternalSSS.g:4652:2: ( ( () otherlv_1= '<SoftwareMaintenanceRequirements>' ( (lv_sectionDescription_2_0= ruleDBody ) )? ( (lv_sssItems_3_0= ruleVSSSDocumentItem ) )* ( (lv_sssRequirementSubsections_4_0= ruleVSSSInstantiableRequirementSection ) )* otherlv_5= '</SoftwareMaintenanceRequirements>' ) )
            // InternalSSS.g:4653:2: ( () otherlv_1= '<SoftwareMaintenanceRequirements>' ( (lv_sectionDescription_2_0= ruleDBody ) )? ( (lv_sssItems_3_0= ruleVSSSDocumentItem ) )* ( (lv_sssRequirementSubsections_4_0= ruleVSSSInstantiableRequirementSection ) )* otherlv_5= '</SoftwareMaintenanceRequirements>' )
            {
            // InternalSSS.g:4653:2: ( () otherlv_1= '<SoftwareMaintenanceRequirements>' ( (lv_sectionDescription_2_0= ruleDBody ) )? ( (lv_sssItems_3_0= ruleVSSSDocumentItem ) )* ( (lv_sssRequirementSubsections_4_0= ruleVSSSInstantiableRequirementSection ) )* otherlv_5= '</SoftwareMaintenanceRequirements>' )
            // InternalSSS.g:4654:3: () otherlv_1= '<SoftwareMaintenanceRequirements>' ( (lv_sectionDescription_2_0= ruleDBody ) )? ( (lv_sssItems_3_0= ruleVSSSDocumentItem ) )* ( (lv_sssRequirementSubsections_4_0= ruleVSSSInstantiableRequirementSection ) )* otherlv_5= '</SoftwareMaintenanceRequirements>'
            {
            // InternalSSS.g:4654:3: ()
            // InternalSSS.g:4655:4: 
            {
            if ( state.backtracking==0 ) {

              				/* */
              			
            }
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getVSSSSoftwareMaintenanceRequirementsAccess().getVSSSSoftwareMaintenanceRequirementsAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,119,FollowSets000.FOLLOW_152); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getVSSSSoftwareMaintenanceRequirementsAccess().getSoftwareMaintenanceRequirementsKeyword_1());
              		
            }
            // InternalSSS.g:4668:3: ( (lv_sectionDescription_2_0= ruleDBody ) )?
            int alt92=2;
            int LA92_0 = input.LA(1);

            if ( (LA92_0==21) ) {
                alt92=1;
            }
            switch (alt92) {
                case 1 :
                    // InternalSSS.g:4669:4: (lv_sectionDescription_2_0= ruleDBody )
                    {
                    // InternalSSS.g:4669:4: (lv_sectionDescription_2_0= ruleDBody )
                    // InternalSSS.g:4670:5: lv_sectionDescription_2_0= ruleDBody
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getVSSSSoftwareMaintenanceRequirementsAccess().getSectionDescriptionDBodyParserRuleCall_2_0());
                      				
                    }
                    pushFollow(FollowSets000.FOLLOW_153);
                    lv_sectionDescription_2_0=ruleDBody();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getVSSSSoftwareMaintenanceRequirementsRule());
                      					}
                      					set(
                      						current,
                      						"sectionDescription",
                      						lv_sectionDescription_2_0,
                      						"es.uah.aut.srg.micobs.svm.lang.sss.SSS.DBody");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }
                    break;

            }

            // InternalSSS.g:4687:3: ( (lv_sssItems_3_0= ruleVSSSDocumentItem ) )*
            loop93:
            do {
                int alt93=2;
                int LA93_0 = input.LA(1);

                if ( (LA93_0==123) ) {
                    alt93=1;
                }


                switch (alt93) {
            	case 1 :
            	    // InternalSSS.g:4688:4: (lv_sssItems_3_0= ruleVSSSDocumentItem )
            	    {
            	    // InternalSSS.g:4688:4: (lv_sssItems_3_0= ruleVSSSDocumentItem )
            	    // InternalSSS.g:4689:5: lv_sssItems_3_0= ruleVSSSDocumentItem
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getVSSSSoftwareMaintenanceRequirementsAccess().getSssItemsVSSSDocumentItemParserRuleCall_3_0());
            	      				
            	    }
            	    pushFollow(FollowSets000.FOLLOW_153);
            	    lv_sssItems_3_0=ruleVSSSDocumentItem();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getVSSSSoftwareMaintenanceRequirementsRule());
            	      					}
            	      					add(
            	      						current,
            	      						"sssItems",
            	      						lv_sssItems_3_0,
            	      						"es.uah.aut.srg.micobs.svm.lang.sss.SSS.VSSSDocumentItem");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop93;
                }
            } while (true);

            // InternalSSS.g:4706:3: ( (lv_sssRequirementSubsections_4_0= ruleVSSSInstantiableRequirementSection ) )*
            loop94:
            do {
                int alt94=2;
                int LA94_0 = input.LA(1);

                if ( (LA94_0==63) ) {
                    alt94=1;
                }


                switch (alt94) {
            	case 1 :
            	    // InternalSSS.g:4707:4: (lv_sssRequirementSubsections_4_0= ruleVSSSInstantiableRequirementSection )
            	    {
            	    // InternalSSS.g:4707:4: (lv_sssRequirementSubsections_4_0= ruleVSSSInstantiableRequirementSection )
            	    // InternalSSS.g:4708:5: lv_sssRequirementSubsections_4_0= ruleVSSSInstantiableRequirementSection
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getVSSSSoftwareMaintenanceRequirementsAccess().getSssRequirementSubsectionsVSSSInstantiableRequirementSectionParserRuleCall_4_0());
            	      				
            	    }
            	    pushFollow(FollowSets000.FOLLOW_154);
            	    lv_sssRequirementSubsections_4_0=ruleVSSSInstantiableRequirementSection();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getVSSSSoftwareMaintenanceRequirementsRule());
            	      					}
            	      					add(
            	      						current,
            	      						"sssRequirementSubsections",
            	      						lv_sssRequirementSubsections_4_0,
            	      						"es.uah.aut.srg.micobs.svm.lang.sss.SSS.VSSSInstantiableRequirementSection");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop94;
                }
            } while (true);

            otherlv_5=(Token)match(input,120,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getVSSSSoftwareMaintenanceRequirementsAccess().getSoftwareMaintenanceRequirementsKeyword_5());
              		
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
    // $ANTLR end "ruleVSSSSoftwareMaintenanceRequirements"


    // $ANTLR start "entryRuleVSSSSystemSoftwareObservabilityRequirements"
    // InternalSSS.g:4733:1: entryRuleVSSSSystemSoftwareObservabilityRequirements returns [EObject current=null] : iv_ruleVSSSSystemSoftwareObservabilityRequirements= ruleVSSSSystemSoftwareObservabilityRequirements EOF ;
    public final EObject entryRuleVSSSSystemSoftwareObservabilityRequirements() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVSSSSystemSoftwareObservabilityRequirements = null;


        try {
            // InternalSSS.g:4733:84: (iv_ruleVSSSSystemSoftwareObservabilityRequirements= ruleVSSSSystemSoftwareObservabilityRequirements EOF )
            // InternalSSS.g:4734:2: iv_ruleVSSSSystemSoftwareObservabilityRequirements= ruleVSSSSystemSoftwareObservabilityRequirements EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getVSSSSystemSoftwareObservabilityRequirementsRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleVSSSSystemSoftwareObservabilityRequirements=ruleVSSSSystemSoftwareObservabilityRequirements();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleVSSSSystemSoftwareObservabilityRequirements; 
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
    // $ANTLR end "entryRuleVSSSSystemSoftwareObservabilityRequirements"


    // $ANTLR start "ruleVSSSSystemSoftwareObservabilityRequirements"
    // InternalSSS.g:4740:1: ruleVSSSSystemSoftwareObservabilityRequirements returns [EObject current=null] : ( () otherlv_1= '<SystemSoftwareObservabilityRequirements>' ( (lv_sectionDescription_2_0= ruleDBody ) )? ( (lv_sssItems_3_0= ruleVSSSDocumentItem ) )* ( (lv_sssRequirementSubsections_4_0= ruleVSSSInstantiableRequirementSection ) )* otherlv_5= '</SystemSoftwareObservabilityRequirements>' ) ;
    public final EObject ruleVSSSSystemSoftwareObservabilityRequirements() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_5=null;
        EObject lv_sectionDescription_2_0 = null;

        EObject lv_sssItems_3_0 = null;

        EObject lv_sssRequirementSubsections_4_0 = null;



        	enterRule();

        try {
            // InternalSSS.g:4746:2: ( ( () otherlv_1= '<SystemSoftwareObservabilityRequirements>' ( (lv_sectionDescription_2_0= ruleDBody ) )? ( (lv_sssItems_3_0= ruleVSSSDocumentItem ) )* ( (lv_sssRequirementSubsections_4_0= ruleVSSSInstantiableRequirementSection ) )* otherlv_5= '</SystemSoftwareObservabilityRequirements>' ) )
            // InternalSSS.g:4747:2: ( () otherlv_1= '<SystemSoftwareObservabilityRequirements>' ( (lv_sectionDescription_2_0= ruleDBody ) )? ( (lv_sssItems_3_0= ruleVSSSDocumentItem ) )* ( (lv_sssRequirementSubsections_4_0= ruleVSSSInstantiableRequirementSection ) )* otherlv_5= '</SystemSoftwareObservabilityRequirements>' )
            {
            // InternalSSS.g:4747:2: ( () otherlv_1= '<SystemSoftwareObservabilityRequirements>' ( (lv_sectionDescription_2_0= ruleDBody ) )? ( (lv_sssItems_3_0= ruleVSSSDocumentItem ) )* ( (lv_sssRequirementSubsections_4_0= ruleVSSSInstantiableRequirementSection ) )* otherlv_5= '</SystemSoftwareObservabilityRequirements>' )
            // InternalSSS.g:4748:3: () otherlv_1= '<SystemSoftwareObservabilityRequirements>' ( (lv_sectionDescription_2_0= ruleDBody ) )? ( (lv_sssItems_3_0= ruleVSSSDocumentItem ) )* ( (lv_sssRequirementSubsections_4_0= ruleVSSSInstantiableRequirementSection ) )* otherlv_5= '</SystemSoftwareObservabilityRequirements>'
            {
            // InternalSSS.g:4748:3: ()
            // InternalSSS.g:4749:4: 
            {
            if ( state.backtracking==0 ) {

              				/* */
              			
            }
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getVSSSSystemSoftwareObservabilityRequirementsAccess().getVSSSSystemSoftwareObservabilityRequirementsAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,121,FollowSets000.FOLLOW_155); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getVSSSSystemSoftwareObservabilityRequirementsAccess().getSystemSoftwareObservabilityRequirementsKeyword_1());
              		
            }
            // InternalSSS.g:4762:3: ( (lv_sectionDescription_2_0= ruleDBody ) )?
            int alt95=2;
            int LA95_0 = input.LA(1);

            if ( (LA95_0==21) ) {
                alt95=1;
            }
            switch (alt95) {
                case 1 :
                    // InternalSSS.g:4763:4: (lv_sectionDescription_2_0= ruleDBody )
                    {
                    // InternalSSS.g:4763:4: (lv_sectionDescription_2_0= ruleDBody )
                    // InternalSSS.g:4764:5: lv_sectionDescription_2_0= ruleDBody
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getVSSSSystemSoftwareObservabilityRequirementsAccess().getSectionDescriptionDBodyParserRuleCall_2_0());
                      				
                    }
                    pushFollow(FollowSets000.FOLLOW_156);
                    lv_sectionDescription_2_0=ruleDBody();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getVSSSSystemSoftwareObservabilityRequirementsRule());
                      					}
                      					set(
                      						current,
                      						"sectionDescription",
                      						lv_sectionDescription_2_0,
                      						"es.uah.aut.srg.micobs.svm.lang.sss.SSS.DBody");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }
                    break;

            }

            // InternalSSS.g:4781:3: ( (lv_sssItems_3_0= ruleVSSSDocumentItem ) )*
            loop96:
            do {
                int alt96=2;
                int LA96_0 = input.LA(1);

                if ( (LA96_0==123) ) {
                    alt96=1;
                }


                switch (alt96) {
            	case 1 :
            	    // InternalSSS.g:4782:4: (lv_sssItems_3_0= ruleVSSSDocumentItem )
            	    {
            	    // InternalSSS.g:4782:4: (lv_sssItems_3_0= ruleVSSSDocumentItem )
            	    // InternalSSS.g:4783:5: lv_sssItems_3_0= ruleVSSSDocumentItem
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getVSSSSystemSoftwareObservabilityRequirementsAccess().getSssItemsVSSSDocumentItemParserRuleCall_3_0());
            	      				
            	    }
            	    pushFollow(FollowSets000.FOLLOW_156);
            	    lv_sssItems_3_0=ruleVSSSDocumentItem();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getVSSSSystemSoftwareObservabilityRequirementsRule());
            	      					}
            	      					add(
            	      						current,
            	      						"sssItems",
            	      						lv_sssItems_3_0,
            	      						"es.uah.aut.srg.micobs.svm.lang.sss.SSS.VSSSDocumentItem");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop96;
                }
            } while (true);

            // InternalSSS.g:4800:3: ( (lv_sssRequirementSubsections_4_0= ruleVSSSInstantiableRequirementSection ) )*
            loop97:
            do {
                int alt97=2;
                int LA97_0 = input.LA(1);

                if ( (LA97_0==63) ) {
                    alt97=1;
                }


                switch (alt97) {
            	case 1 :
            	    // InternalSSS.g:4801:4: (lv_sssRequirementSubsections_4_0= ruleVSSSInstantiableRequirementSection )
            	    {
            	    // InternalSSS.g:4801:4: (lv_sssRequirementSubsections_4_0= ruleVSSSInstantiableRequirementSection )
            	    // InternalSSS.g:4802:5: lv_sssRequirementSubsections_4_0= ruleVSSSInstantiableRequirementSection
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getVSSSSystemSoftwareObservabilityRequirementsAccess().getSssRequirementSubsectionsVSSSInstantiableRequirementSectionParserRuleCall_4_0());
            	      				
            	    }
            	    pushFollow(FollowSets000.FOLLOW_157);
            	    lv_sssRequirementSubsections_4_0=ruleVSSSInstantiableRequirementSection();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getVSSSSystemSoftwareObservabilityRequirementsRule());
            	      					}
            	      					add(
            	      						current,
            	      						"sssRequirementSubsections",
            	      						lv_sssRequirementSubsections_4_0,
            	      						"es.uah.aut.srg.micobs.svm.lang.sss.SSS.VSSSInstantiableRequirementSection");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop97;
                }
            } while (true);

            otherlv_5=(Token)match(input,122,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getVSSSSystemSoftwareObservabilityRequirementsAccess().getSystemSoftwareObservabilityRequirementsKeyword_5());
              		
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
    // $ANTLR end "ruleVSSSSystemSoftwareObservabilityRequirements"


    // $ANTLR start "entryRuleVSSSDocumentItem"
    // InternalSSS.g:4827:1: entryRuleVSSSDocumentItem returns [EObject current=null] : iv_ruleVSSSDocumentItem= ruleVSSSDocumentItem EOF ;
    public final EObject entryRuleVSSSDocumentItem() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVSSSDocumentItem = null;


        try {
            // InternalSSS.g:4827:57: (iv_ruleVSSSDocumentItem= ruleVSSSDocumentItem EOF )
            // InternalSSS.g:4828:2: iv_ruleVSSSDocumentItem= ruleVSSSDocumentItem EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getVSSSDocumentItemRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleVSSSDocumentItem=ruleVSSSDocumentItem();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleVSSSDocumentItem; 
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
    // $ANTLR end "entryRuleVSSSDocumentItem"


    // $ANTLR start "ruleVSSSDocumentItem"
    // InternalSSS.g:4834:1: ruleVSSSDocumentItem returns [EObject current=null] : (otherlv_0= '<Item' otherlv_1= 'name=' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= 'validationMethod=' ( (lv_validationMethod_4_0= ruleVValidationMethod ) ) otherlv_5= '>' otherlv_6= '<description>' ( (lv_description_7_0= ruleDBody ) ) otherlv_8= '</description>' (otherlv_9= '<extendedDescription>' ( (lv_extendedDescription_10_0= ruleDBody ) ) otherlv_11= '</extendedDescription>' )? otherlv_12= '</Item>' ) ;
    public final EObject ruleVSSSDocumentItem() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Enumerator lv_validationMethod_4_0 = null;

        EObject lv_description_7_0 = null;

        EObject lv_extendedDescription_10_0 = null;



        	enterRule();

        try {
            // InternalSSS.g:4840:2: ( (otherlv_0= '<Item' otherlv_1= 'name=' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= 'validationMethod=' ( (lv_validationMethod_4_0= ruleVValidationMethod ) ) otherlv_5= '>' otherlv_6= '<description>' ( (lv_description_7_0= ruleDBody ) ) otherlv_8= '</description>' (otherlv_9= '<extendedDescription>' ( (lv_extendedDescription_10_0= ruleDBody ) ) otherlv_11= '</extendedDescription>' )? otherlv_12= '</Item>' ) )
            // InternalSSS.g:4841:2: (otherlv_0= '<Item' otherlv_1= 'name=' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= 'validationMethod=' ( (lv_validationMethod_4_0= ruleVValidationMethod ) ) otherlv_5= '>' otherlv_6= '<description>' ( (lv_description_7_0= ruleDBody ) ) otherlv_8= '</description>' (otherlv_9= '<extendedDescription>' ( (lv_extendedDescription_10_0= ruleDBody ) ) otherlv_11= '</extendedDescription>' )? otherlv_12= '</Item>' )
            {
            // InternalSSS.g:4841:2: (otherlv_0= '<Item' otherlv_1= 'name=' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= 'validationMethod=' ( (lv_validationMethod_4_0= ruleVValidationMethod ) ) otherlv_5= '>' otherlv_6= '<description>' ( (lv_description_7_0= ruleDBody ) ) otherlv_8= '</description>' (otherlv_9= '<extendedDescription>' ( (lv_extendedDescription_10_0= ruleDBody ) ) otherlv_11= '</extendedDescription>' )? otherlv_12= '</Item>' )
            // InternalSSS.g:4842:3: otherlv_0= '<Item' otherlv_1= 'name=' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= 'validationMethod=' ( (lv_validationMethod_4_0= ruleVValidationMethod ) ) otherlv_5= '>' otherlv_6= '<description>' ( (lv_description_7_0= ruleDBody ) ) otherlv_8= '</description>' (otherlv_9= '<extendedDescription>' ( (lv_extendedDescription_10_0= ruleDBody ) ) otherlv_11= '</extendedDescription>' )? otherlv_12= '</Item>'
            {
            otherlv_0=(Token)match(input,123,FollowSets000.FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getVSSSDocumentItemAccess().getItemKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,14,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getVSSSDocumentItemAccess().getNameKeyword_1());
              		
            }
            // InternalSSS.g:4850:3: ( (lv_name_2_0= RULE_STRING ) )
            // InternalSSS.g:4851:4: (lv_name_2_0= RULE_STRING )
            {
            // InternalSSS.g:4851:4: (lv_name_2_0= RULE_STRING )
            // InternalSSS.g:4852:5: lv_name_2_0= RULE_STRING
            {
            lv_name_2_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_158); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_2_0, grammarAccess.getVSSSDocumentItemAccess().getNameSTRINGTerminalRuleCall_2_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getVSSSDocumentItemRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_2_0,
              						"org.eclipse.xtext.common.Terminals.STRING");
              				
            }

            }


            }

            otherlv_3=(Token)match(input,124,FollowSets000.FOLLOW_159); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getVSSSDocumentItemAccess().getValidationMethodKeyword_3());
              		
            }
            // InternalSSS.g:4872:3: ( (lv_validationMethod_4_0= ruleVValidationMethod ) )
            // InternalSSS.g:4873:4: (lv_validationMethod_4_0= ruleVValidationMethod )
            {
            // InternalSSS.g:4873:4: (lv_validationMethod_4_0= ruleVValidationMethod )
            // InternalSSS.g:4874:5: lv_validationMethod_4_0= ruleVValidationMethod
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getVSSSDocumentItemAccess().getValidationMethodVValidationMethodEnumRuleCall_4_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_10);
            lv_validationMethod_4_0=ruleVValidationMethod();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getVSSSDocumentItemRule());
              					}
              					set(
              						current,
              						"validationMethod",
              						lv_validationMethod_4_0,
              						"es.uah.aut.srg.micobs.svm.lang.sss.SSS.VValidationMethod");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_5=(Token)match(input,19,FollowSets000.FOLLOW_160); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getVSSSDocumentItemAccess().getGreaterThanSignKeyword_5());
              		
            }
            otherlv_6=(Token)match(input,125,FollowSets000.FOLLOW_161); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_6, grammarAccess.getVSSSDocumentItemAccess().getDescriptionKeyword_6());
              		
            }
            // InternalSSS.g:4899:3: ( (lv_description_7_0= ruleDBody ) )
            // InternalSSS.g:4900:4: (lv_description_7_0= ruleDBody )
            {
            // InternalSSS.g:4900:4: (lv_description_7_0= ruleDBody )
            // InternalSSS.g:4901:5: lv_description_7_0= ruleDBody
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getVSSSDocumentItemAccess().getDescriptionDBodyParserRuleCall_7_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_162);
            lv_description_7_0=ruleDBody();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getVSSSDocumentItemRule());
              					}
              					set(
              						current,
              						"description",
              						lv_description_7_0,
              						"es.uah.aut.srg.micobs.svm.lang.sss.SSS.DBody");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_8=(Token)match(input,126,FollowSets000.FOLLOW_163); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_8, grammarAccess.getVSSSDocumentItemAccess().getDescriptionKeyword_8());
              		
            }
            // InternalSSS.g:4922:3: (otherlv_9= '<extendedDescription>' ( (lv_extendedDescription_10_0= ruleDBody ) ) otherlv_11= '</extendedDescription>' )?
            int alt98=2;
            int LA98_0 = input.LA(1);

            if ( (LA98_0==127) ) {
                alt98=1;
            }
            switch (alt98) {
                case 1 :
                    // InternalSSS.g:4923:4: otherlv_9= '<extendedDescription>' ( (lv_extendedDescription_10_0= ruleDBody ) ) otherlv_11= '</extendedDescription>'
                    {
                    otherlv_9=(Token)match(input,127,FollowSets000.FOLLOW_161); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_9, grammarAccess.getVSSSDocumentItemAccess().getExtendedDescriptionKeyword_9_0());
                      			
                    }
                    // InternalSSS.g:4927:4: ( (lv_extendedDescription_10_0= ruleDBody ) )
                    // InternalSSS.g:4928:5: (lv_extendedDescription_10_0= ruleDBody )
                    {
                    // InternalSSS.g:4928:5: (lv_extendedDescription_10_0= ruleDBody )
                    // InternalSSS.g:4929:6: lv_extendedDescription_10_0= ruleDBody
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getVSSSDocumentItemAccess().getExtendedDescriptionDBodyParserRuleCall_9_1_0());
                      					
                    }
                    pushFollow(FollowSets000.FOLLOW_164);
                    lv_extendedDescription_10_0=ruleDBody();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getVSSSDocumentItemRule());
                      						}
                      						set(
                      							current,
                      							"extendedDescription",
                      							lv_extendedDescription_10_0,
                      							"es.uah.aut.srg.micobs.svm.lang.sss.SSS.DBody");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    otherlv_11=(Token)match(input,128,FollowSets000.FOLLOW_165); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_11, grammarAccess.getVSSSDocumentItemAccess().getExtendedDescriptionKeyword_9_2());
                      			
                    }

                    }
                    break;

            }

            otherlv_12=(Token)match(input,129,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_12, grammarAccess.getVSSSDocumentItemAccess().getItemKeyword_10());
              		
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
    // $ANTLR end "ruleVSSSDocumentItem"


    // $ANTLR start "entryRuleVSSSVerificationValidationProcessRequirements"
    // InternalSSS.g:4959:1: entryRuleVSSSVerificationValidationProcessRequirements returns [EObject current=null] : iv_ruleVSSSVerificationValidationProcessRequirements= ruleVSSSVerificationValidationProcessRequirements EOF ;
    public final EObject entryRuleVSSSVerificationValidationProcessRequirements() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVSSSVerificationValidationProcessRequirements = null;


        try {
            // InternalSSS.g:4959:86: (iv_ruleVSSSVerificationValidationProcessRequirements= ruleVSSSVerificationValidationProcessRequirements EOF )
            // InternalSSS.g:4960:2: iv_ruleVSSSVerificationValidationProcessRequirements= ruleVSSSVerificationValidationProcessRequirements EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getVSSSVerificationValidationProcessRequirementsRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleVSSSVerificationValidationProcessRequirements=ruleVSSSVerificationValidationProcessRequirements();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleVSSSVerificationValidationProcessRequirements; 
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
    // $ANTLR end "entryRuleVSSSVerificationValidationProcessRequirements"


    // $ANTLR start "ruleVSSSVerificationValidationProcessRequirements"
    // InternalSSS.g:4966:1: ruleVSSSVerificationValidationProcessRequirements returns [EObject current=null] : ( () otherlv_1= '<VerificationValidationProcessRequirements>' ( (lv_sssItems_2_0= ruleVSSSDocumentItem ) )* ( (lv_sssRequirementSubsections_3_0= ruleVSSSInstantiableRequirementSection ) )* otherlv_4= '</VerificationValidationProcessRequirements>' ) ;
    public final EObject ruleVSSSVerificationValidationProcessRequirements() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_4=null;
        EObject lv_sssItems_2_0 = null;

        EObject lv_sssRequirementSubsections_3_0 = null;



        	enterRule();

        try {
            // InternalSSS.g:4972:2: ( ( () otherlv_1= '<VerificationValidationProcessRequirements>' ( (lv_sssItems_2_0= ruleVSSSDocumentItem ) )* ( (lv_sssRequirementSubsections_3_0= ruleVSSSInstantiableRequirementSection ) )* otherlv_4= '</VerificationValidationProcessRequirements>' ) )
            // InternalSSS.g:4973:2: ( () otherlv_1= '<VerificationValidationProcessRequirements>' ( (lv_sssItems_2_0= ruleVSSSDocumentItem ) )* ( (lv_sssRequirementSubsections_3_0= ruleVSSSInstantiableRequirementSection ) )* otherlv_4= '</VerificationValidationProcessRequirements>' )
            {
            // InternalSSS.g:4973:2: ( () otherlv_1= '<VerificationValidationProcessRequirements>' ( (lv_sssItems_2_0= ruleVSSSDocumentItem ) )* ( (lv_sssRequirementSubsections_3_0= ruleVSSSInstantiableRequirementSection ) )* otherlv_4= '</VerificationValidationProcessRequirements>' )
            // InternalSSS.g:4974:3: () otherlv_1= '<VerificationValidationProcessRequirements>' ( (lv_sssItems_2_0= ruleVSSSDocumentItem ) )* ( (lv_sssRequirementSubsections_3_0= ruleVSSSInstantiableRequirementSection ) )* otherlv_4= '</VerificationValidationProcessRequirements>'
            {
            // InternalSSS.g:4974:3: ()
            // InternalSSS.g:4975:4: 
            {
            if ( state.backtracking==0 ) {

              				/* */
              			
            }
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getVSSSVerificationValidationProcessRequirementsAccess().getVSSSVerificationValidationProcessRequirementsAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,130,FollowSets000.FOLLOW_166); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getVSSSVerificationValidationProcessRequirementsAccess().getVerificationValidationProcessRequirementsKeyword_1());
              		
            }
            // InternalSSS.g:4988:3: ( (lv_sssItems_2_0= ruleVSSSDocumentItem ) )*
            loop99:
            do {
                int alt99=2;
                int LA99_0 = input.LA(1);

                if ( (LA99_0==123) ) {
                    alt99=1;
                }


                switch (alt99) {
            	case 1 :
            	    // InternalSSS.g:4989:4: (lv_sssItems_2_0= ruleVSSSDocumentItem )
            	    {
            	    // InternalSSS.g:4989:4: (lv_sssItems_2_0= ruleVSSSDocumentItem )
            	    // InternalSSS.g:4990:5: lv_sssItems_2_0= ruleVSSSDocumentItem
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getVSSSVerificationValidationProcessRequirementsAccess().getSssItemsVSSSDocumentItemParserRuleCall_2_0());
            	      				
            	    }
            	    pushFollow(FollowSets000.FOLLOW_166);
            	    lv_sssItems_2_0=ruleVSSSDocumentItem();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getVSSSVerificationValidationProcessRequirementsRule());
            	      					}
            	      					add(
            	      						current,
            	      						"sssItems",
            	      						lv_sssItems_2_0,
            	      						"es.uah.aut.srg.micobs.svm.lang.sss.SSS.VSSSDocumentItem");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop99;
                }
            } while (true);

            // InternalSSS.g:5007:3: ( (lv_sssRequirementSubsections_3_0= ruleVSSSInstantiableRequirementSection ) )*
            loop100:
            do {
                int alt100=2;
                int LA100_0 = input.LA(1);

                if ( (LA100_0==63) ) {
                    alt100=1;
                }


                switch (alt100) {
            	case 1 :
            	    // InternalSSS.g:5008:4: (lv_sssRequirementSubsections_3_0= ruleVSSSInstantiableRequirementSection )
            	    {
            	    // InternalSSS.g:5008:4: (lv_sssRequirementSubsections_3_0= ruleVSSSInstantiableRequirementSection )
            	    // InternalSSS.g:5009:5: lv_sssRequirementSubsections_3_0= ruleVSSSInstantiableRequirementSection
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getVSSSVerificationValidationProcessRequirementsAccess().getSssRequirementSubsectionsVSSSInstantiableRequirementSectionParserRuleCall_3_0());
            	      				
            	    }
            	    pushFollow(FollowSets000.FOLLOW_167);
            	    lv_sssRequirementSubsections_3_0=ruleVSSSInstantiableRequirementSection();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getVSSSVerificationValidationProcessRequirementsRule());
            	      					}
            	      					add(
            	      						current,
            	      						"sssRequirementSubsections",
            	      						lv_sssRequirementSubsections_3_0,
            	      						"es.uah.aut.srg.micobs.svm.lang.sss.SSS.VSSSInstantiableRequirementSection");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop100;
                }
            } while (true);

            otherlv_4=(Token)match(input,131,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getVSSSVerificationValidationProcessRequirementsAccess().getVerificationValidationProcessRequirementsKeyword_4());
              		
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
    // $ANTLR end "ruleVSSSVerificationValidationProcessRequirements"


    // $ANTLR start "entryRuleVSSSValidationApproach"
    // InternalSSS.g:5034:1: entryRuleVSSSValidationApproach returns [EObject current=null] : iv_ruleVSSSValidationApproach= ruleVSSSValidationApproach EOF ;
    public final EObject entryRuleVSSSValidationApproach() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVSSSValidationApproach = null;


        try {
            // InternalSSS.g:5034:63: (iv_ruleVSSSValidationApproach= ruleVSSSValidationApproach EOF )
            // InternalSSS.g:5035:2: iv_ruleVSSSValidationApproach= ruleVSSSValidationApproach EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getVSSSValidationApproachRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleVSSSValidationApproach=ruleVSSSValidationApproach();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleVSSSValidationApproach; 
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
    // $ANTLR end "entryRuleVSSSValidationApproach"


    // $ANTLR start "ruleVSSSValidationApproach"
    // InternalSSS.g:5041:1: ruleVSSSValidationApproach returns [EObject current=null] : ( () otherlv_1= '<ValidationApproach>' ( (lv_sssItems_2_0= ruleVSSSDocumentItem ) )* ( (lv_sssRequirementSubsections_3_0= ruleVSSSInstantiableRequirementSection ) )* otherlv_4= '</ValidationApproach>' ) ;
    public final EObject ruleVSSSValidationApproach() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_4=null;
        EObject lv_sssItems_2_0 = null;

        EObject lv_sssRequirementSubsections_3_0 = null;



        	enterRule();

        try {
            // InternalSSS.g:5047:2: ( ( () otherlv_1= '<ValidationApproach>' ( (lv_sssItems_2_0= ruleVSSSDocumentItem ) )* ( (lv_sssRequirementSubsections_3_0= ruleVSSSInstantiableRequirementSection ) )* otherlv_4= '</ValidationApproach>' ) )
            // InternalSSS.g:5048:2: ( () otherlv_1= '<ValidationApproach>' ( (lv_sssItems_2_0= ruleVSSSDocumentItem ) )* ( (lv_sssRequirementSubsections_3_0= ruleVSSSInstantiableRequirementSection ) )* otherlv_4= '</ValidationApproach>' )
            {
            // InternalSSS.g:5048:2: ( () otherlv_1= '<ValidationApproach>' ( (lv_sssItems_2_0= ruleVSSSDocumentItem ) )* ( (lv_sssRequirementSubsections_3_0= ruleVSSSInstantiableRequirementSection ) )* otherlv_4= '</ValidationApproach>' )
            // InternalSSS.g:5049:3: () otherlv_1= '<ValidationApproach>' ( (lv_sssItems_2_0= ruleVSSSDocumentItem ) )* ( (lv_sssRequirementSubsections_3_0= ruleVSSSInstantiableRequirementSection ) )* otherlv_4= '</ValidationApproach>'
            {
            // InternalSSS.g:5049:3: ()
            // InternalSSS.g:5050:4: 
            {
            if ( state.backtracking==0 ) {

              				/* */
              			
            }
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getVSSSValidationApproachAccess().getVSSSValidationApproachAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,132,FollowSets000.FOLLOW_168); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getVSSSValidationApproachAccess().getValidationApproachKeyword_1());
              		
            }
            // InternalSSS.g:5063:3: ( (lv_sssItems_2_0= ruleVSSSDocumentItem ) )*
            loop101:
            do {
                int alt101=2;
                int LA101_0 = input.LA(1);

                if ( (LA101_0==123) ) {
                    alt101=1;
                }


                switch (alt101) {
            	case 1 :
            	    // InternalSSS.g:5064:4: (lv_sssItems_2_0= ruleVSSSDocumentItem )
            	    {
            	    // InternalSSS.g:5064:4: (lv_sssItems_2_0= ruleVSSSDocumentItem )
            	    // InternalSSS.g:5065:5: lv_sssItems_2_0= ruleVSSSDocumentItem
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getVSSSValidationApproachAccess().getSssItemsVSSSDocumentItemParserRuleCall_2_0());
            	      				
            	    }
            	    pushFollow(FollowSets000.FOLLOW_168);
            	    lv_sssItems_2_0=ruleVSSSDocumentItem();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getVSSSValidationApproachRule());
            	      					}
            	      					add(
            	      						current,
            	      						"sssItems",
            	      						lv_sssItems_2_0,
            	      						"es.uah.aut.srg.micobs.svm.lang.sss.SSS.VSSSDocumentItem");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop101;
                }
            } while (true);

            // InternalSSS.g:5082:3: ( (lv_sssRequirementSubsections_3_0= ruleVSSSInstantiableRequirementSection ) )*
            loop102:
            do {
                int alt102=2;
                int LA102_0 = input.LA(1);

                if ( (LA102_0==63) ) {
                    alt102=1;
                }


                switch (alt102) {
            	case 1 :
            	    // InternalSSS.g:5083:4: (lv_sssRequirementSubsections_3_0= ruleVSSSInstantiableRequirementSection )
            	    {
            	    // InternalSSS.g:5083:4: (lv_sssRequirementSubsections_3_0= ruleVSSSInstantiableRequirementSection )
            	    // InternalSSS.g:5084:5: lv_sssRequirementSubsections_3_0= ruleVSSSInstantiableRequirementSection
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getVSSSValidationApproachAccess().getSssRequirementSubsectionsVSSSInstantiableRequirementSectionParserRuleCall_3_0());
            	      				
            	    }
            	    pushFollow(FollowSets000.FOLLOW_169);
            	    lv_sssRequirementSubsections_3_0=ruleVSSSInstantiableRequirementSection();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getVSSSValidationApproachRule());
            	      					}
            	      					add(
            	      						current,
            	      						"sssRequirementSubsections",
            	      						lv_sssRequirementSubsections_3_0,
            	      						"es.uah.aut.srg.micobs.svm.lang.sss.SSS.VSSSInstantiableRequirementSection");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop102;
                }
            } while (true);

            otherlv_4=(Token)match(input,133,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getVSSSValidationApproachAccess().getValidationApproachKeyword_4());
              		
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
    // $ANTLR end "ruleVSSSValidationApproach"


    // $ANTLR start "entryRuleVSSSValidationRequirements"
    // InternalSSS.g:5109:1: entryRuleVSSSValidationRequirements returns [EObject current=null] : iv_ruleVSSSValidationRequirements= ruleVSSSValidationRequirements EOF ;
    public final EObject entryRuleVSSSValidationRequirements() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVSSSValidationRequirements = null;


        try {
            // InternalSSS.g:5109:67: (iv_ruleVSSSValidationRequirements= ruleVSSSValidationRequirements EOF )
            // InternalSSS.g:5110:2: iv_ruleVSSSValidationRequirements= ruleVSSSValidationRequirements EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getVSSSValidationRequirementsRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleVSSSValidationRequirements=ruleVSSSValidationRequirements();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleVSSSValidationRequirements; 
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
    // $ANTLR end "entryRuleVSSSValidationRequirements"


    // $ANTLR start "ruleVSSSValidationRequirements"
    // InternalSSS.g:5116:1: ruleVSSSValidationRequirements returns [EObject current=null] : ( () otherlv_1= '<ValidationRequirements>' ( (lv_sssItems_2_0= ruleVSSSDocumentItem ) )* ( (lv_sssRequirementSubsections_3_0= ruleVSSSInstantiableRequirementSection ) )* otherlv_4= '</ValidationRequirements>' ) ;
    public final EObject ruleVSSSValidationRequirements() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_4=null;
        EObject lv_sssItems_2_0 = null;

        EObject lv_sssRequirementSubsections_3_0 = null;



        	enterRule();

        try {
            // InternalSSS.g:5122:2: ( ( () otherlv_1= '<ValidationRequirements>' ( (lv_sssItems_2_0= ruleVSSSDocumentItem ) )* ( (lv_sssRequirementSubsections_3_0= ruleVSSSInstantiableRequirementSection ) )* otherlv_4= '</ValidationRequirements>' ) )
            // InternalSSS.g:5123:2: ( () otherlv_1= '<ValidationRequirements>' ( (lv_sssItems_2_0= ruleVSSSDocumentItem ) )* ( (lv_sssRequirementSubsections_3_0= ruleVSSSInstantiableRequirementSection ) )* otherlv_4= '</ValidationRequirements>' )
            {
            // InternalSSS.g:5123:2: ( () otherlv_1= '<ValidationRequirements>' ( (lv_sssItems_2_0= ruleVSSSDocumentItem ) )* ( (lv_sssRequirementSubsections_3_0= ruleVSSSInstantiableRequirementSection ) )* otherlv_4= '</ValidationRequirements>' )
            // InternalSSS.g:5124:3: () otherlv_1= '<ValidationRequirements>' ( (lv_sssItems_2_0= ruleVSSSDocumentItem ) )* ( (lv_sssRequirementSubsections_3_0= ruleVSSSInstantiableRequirementSection ) )* otherlv_4= '</ValidationRequirements>'
            {
            // InternalSSS.g:5124:3: ()
            // InternalSSS.g:5125:4: 
            {
            if ( state.backtracking==0 ) {

              				/* */
              			
            }
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getVSSSValidationRequirementsAccess().getVSSSValidationRequirementsAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,134,FollowSets000.FOLLOW_170); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getVSSSValidationRequirementsAccess().getValidationRequirementsKeyword_1());
              		
            }
            // InternalSSS.g:5138:3: ( (lv_sssItems_2_0= ruleVSSSDocumentItem ) )*
            loop103:
            do {
                int alt103=2;
                int LA103_0 = input.LA(1);

                if ( (LA103_0==123) ) {
                    alt103=1;
                }


                switch (alt103) {
            	case 1 :
            	    // InternalSSS.g:5139:4: (lv_sssItems_2_0= ruleVSSSDocumentItem )
            	    {
            	    // InternalSSS.g:5139:4: (lv_sssItems_2_0= ruleVSSSDocumentItem )
            	    // InternalSSS.g:5140:5: lv_sssItems_2_0= ruleVSSSDocumentItem
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getVSSSValidationRequirementsAccess().getSssItemsVSSSDocumentItemParserRuleCall_2_0());
            	      				
            	    }
            	    pushFollow(FollowSets000.FOLLOW_170);
            	    lv_sssItems_2_0=ruleVSSSDocumentItem();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getVSSSValidationRequirementsRule());
            	      					}
            	      					add(
            	      						current,
            	      						"sssItems",
            	      						lv_sssItems_2_0,
            	      						"es.uah.aut.srg.micobs.svm.lang.sss.SSS.VSSSDocumentItem");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop103;
                }
            } while (true);

            // InternalSSS.g:5157:3: ( (lv_sssRequirementSubsections_3_0= ruleVSSSInstantiableRequirementSection ) )*
            loop104:
            do {
                int alt104=2;
                int LA104_0 = input.LA(1);

                if ( (LA104_0==63) ) {
                    alt104=1;
                }


                switch (alt104) {
            	case 1 :
            	    // InternalSSS.g:5158:4: (lv_sssRequirementSubsections_3_0= ruleVSSSInstantiableRequirementSection )
            	    {
            	    // InternalSSS.g:5158:4: (lv_sssRequirementSubsections_3_0= ruleVSSSInstantiableRequirementSection )
            	    // InternalSSS.g:5159:5: lv_sssRequirementSubsections_3_0= ruleVSSSInstantiableRequirementSection
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getVSSSValidationRequirementsAccess().getSssRequirementSubsectionsVSSSInstantiableRequirementSectionParserRuleCall_3_0());
            	      				
            	    }
            	    pushFollow(FollowSets000.FOLLOW_171);
            	    lv_sssRequirementSubsections_3_0=ruleVSSSInstantiableRequirementSection();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getVSSSValidationRequirementsRule());
            	      					}
            	      					add(
            	      						current,
            	      						"sssRequirementSubsections",
            	      						lv_sssRequirementSubsections_3_0,
            	      						"es.uah.aut.srg.micobs.svm.lang.sss.SSS.VSSSInstantiableRequirementSection");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop104;
                }
            } while (true);

            otherlv_4=(Token)match(input,135,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getVSSSValidationRequirementsAccess().getValidationRequirementsKeyword_4());
              		
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
    // $ANTLR end "ruleVSSSValidationRequirements"


    // $ANTLR start "entryRuleVSSSVerificationRequirements"
    // InternalSSS.g:5184:1: entryRuleVSSSVerificationRequirements returns [EObject current=null] : iv_ruleVSSSVerificationRequirements= ruleVSSSVerificationRequirements EOF ;
    public final EObject entryRuleVSSSVerificationRequirements() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVSSSVerificationRequirements = null;


        try {
            // InternalSSS.g:5184:69: (iv_ruleVSSSVerificationRequirements= ruleVSSSVerificationRequirements EOF )
            // InternalSSS.g:5185:2: iv_ruleVSSSVerificationRequirements= ruleVSSSVerificationRequirements EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getVSSSVerificationRequirementsRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleVSSSVerificationRequirements=ruleVSSSVerificationRequirements();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleVSSSVerificationRequirements; 
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
    // $ANTLR end "entryRuleVSSSVerificationRequirements"


    // $ANTLR start "ruleVSSSVerificationRequirements"
    // InternalSSS.g:5191:1: ruleVSSSVerificationRequirements returns [EObject current=null] : ( () otherlv_1= '<VerificationRequirements>' ( (lv_sssItems_2_0= ruleVSSSDocumentItem ) )* ( (lv_sssRequirementSubsections_3_0= ruleVSSSInstantiableRequirementSection ) )* otherlv_4= '</VerificationRequirements>' ) ;
    public final EObject ruleVSSSVerificationRequirements() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_4=null;
        EObject lv_sssItems_2_0 = null;

        EObject lv_sssRequirementSubsections_3_0 = null;



        	enterRule();

        try {
            // InternalSSS.g:5197:2: ( ( () otherlv_1= '<VerificationRequirements>' ( (lv_sssItems_2_0= ruleVSSSDocumentItem ) )* ( (lv_sssRequirementSubsections_3_0= ruleVSSSInstantiableRequirementSection ) )* otherlv_4= '</VerificationRequirements>' ) )
            // InternalSSS.g:5198:2: ( () otherlv_1= '<VerificationRequirements>' ( (lv_sssItems_2_0= ruleVSSSDocumentItem ) )* ( (lv_sssRequirementSubsections_3_0= ruleVSSSInstantiableRequirementSection ) )* otherlv_4= '</VerificationRequirements>' )
            {
            // InternalSSS.g:5198:2: ( () otherlv_1= '<VerificationRequirements>' ( (lv_sssItems_2_0= ruleVSSSDocumentItem ) )* ( (lv_sssRequirementSubsections_3_0= ruleVSSSInstantiableRequirementSection ) )* otherlv_4= '</VerificationRequirements>' )
            // InternalSSS.g:5199:3: () otherlv_1= '<VerificationRequirements>' ( (lv_sssItems_2_0= ruleVSSSDocumentItem ) )* ( (lv_sssRequirementSubsections_3_0= ruleVSSSInstantiableRequirementSection ) )* otherlv_4= '</VerificationRequirements>'
            {
            // InternalSSS.g:5199:3: ()
            // InternalSSS.g:5200:4: 
            {
            if ( state.backtracking==0 ) {

              				/* */
              			
            }
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getVSSSVerificationRequirementsAccess().getVSSSVerificationRequirementsAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,136,FollowSets000.FOLLOW_172); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getVSSSVerificationRequirementsAccess().getVerificationRequirementsKeyword_1());
              		
            }
            // InternalSSS.g:5213:3: ( (lv_sssItems_2_0= ruleVSSSDocumentItem ) )*
            loop105:
            do {
                int alt105=2;
                int LA105_0 = input.LA(1);

                if ( (LA105_0==123) ) {
                    alt105=1;
                }


                switch (alt105) {
            	case 1 :
            	    // InternalSSS.g:5214:4: (lv_sssItems_2_0= ruleVSSSDocumentItem )
            	    {
            	    // InternalSSS.g:5214:4: (lv_sssItems_2_0= ruleVSSSDocumentItem )
            	    // InternalSSS.g:5215:5: lv_sssItems_2_0= ruleVSSSDocumentItem
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getVSSSVerificationRequirementsAccess().getSssItemsVSSSDocumentItemParserRuleCall_2_0());
            	      				
            	    }
            	    pushFollow(FollowSets000.FOLLOW_172);
            	    lv_sssItems_2_0=ruleVSSSDocumentItem();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getVSSSVerificationRequirementsRule());
            	      					}
            	      					add(
            	      						current,
            	      						"sssItems",
            	      						lv_sssItems_2_0,
            	      						"es.uah.aut.srg.micobs.svm.lang.sss.SSS.VSSSDocumentItem");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop105;
                }
            } while (true);

            // InternalSSS.g:5232:3: ( (lv_sssRequirementSubsections_3_0= ruleVSSSInstantiableRequirementSection ) )*
            loop106:
            do {
                int alt106=2;
                int LA106_0 = input.LA(1);

                if ( (LA106_0==63) ) {
                    alt106=1;
                }


                switch (alt106) {
            	case 1 :
            	    // InternalSSS.g:5233:4: (lv_sssRequirementSubsections_3_0= ruleVSSSInstantiableRequirementSection )
            	    {
            	    // InternalSSS.g:5233:4: (lv_sssRequirementSubsections_3_0= ruleVSSSInstantiableRequirementSection )
            	    // InternalSSS.g:5234:5: lv_sssRequirementSubsections_3_0= ruleVSSSInstantiableRequirementSection
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getVSSSVerificationRequirementsAccess().getSssRequirementSubsectionsVSSSInstantiableRequirementSectionParserRuleCall_3_0());
            	      				
            	    }
            	    pushFollow(FollowSets000.FOLLOW_173);
            	    lv_sssRequirementSubsections_3_0=ruleVSSSInstantiableRequirementSection();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getVSSSVerificationRequirementsRule());
            	      					}
            	      					add(
            	      						current,
            	      						"sssRequirementSubsections",
            	      						lv_sssRequirementSubsections_3_0,
            	      						"es.uah.aut.srg.micobs.svm.lang.sss.SSS.VSSSInstantiableRequirementSection");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop106;
                }
            } while (true);

            otherlv_4=(Token)match(input,137,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getVSSSVerificationRequirementsAccess().getVerificationRequirementsKeyword_4());
              		
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
    // $ANTLR end "ruleVSSSVerificationRequirements"


    // $ANTLR start "entryRuleVSSSSystemModel"
    // InternalSSS.g:5259:1: entryRuleVSSSSystemModel returns [EObject current=null] : iv_ruleVSSSSystemModel= ruleVSSSSystemModel EOF ;
    public final EObject entryRuleVSSSSystemModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVSSSSystemModel = null;


        try {
            // InternalSSS.g:5259:56: (iv_ruleVSSSSystemModel= ruleVSSSSystemModel EOF )
            // InternalSSS.g:5260:2: iv_ruleVSSSSystemModel= ruleVSSSSystemModel EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getVSSSSystemModelRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleVSSSSystemModel=ruleVSSSSystemModel();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleVSSSSystemModel; 
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
    // $ANTLR end "entryRuleVSSSSystemModel"


    // $ANTLR start "ruleVSSSSystemModel"
    // InternalSSS.g:5266:1: ruleVSSSSystemModel returns [EObject current=null] : ( () otherlv_1= '<SystemModel/>' ) ;
    public final EObject ruleVSSSSystemModel() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalSSS.g:5272:2: ( ( () otherlv_1= '<SystemModel/>' ) )
            // InternalSSS.g:5273:2: ( () otherlv_1= '<SystemModel/>' )
            {
            // InternalSSS.g:5273:2: ( () otherlv_1= '<SystemModel/>' )
            // InternalSSS.g:5274:3: () otherlv_1= '<SystemModel/>'
            {
            // InternalSSS.g:5274:3: ()
            // InternalSSS.g:5275:4: 
            {
            if ( state.backtracking==0 ) {

              				/* */
              			
            }
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getVSSSSystemModelAccess().getVSSSSystemModelAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,138,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getVSSSSystemModelAccess().getSystemModelKeyword_1());
              		
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
    // $ANTLR end "ruleVSSSSystemModel"


    // $ANTLR start "ruleDAlignment"
    // InternalSSS.g:5292:1: ruleDAlignment returns [Enumerator current=null] : ( (enumLiteral_0= '\"left\"' ) | (enumLiteral_1= '\"center\"' ) | (enumLiteral_2= '\"right\"' ) | (enumLiteral_3= '\"justified\"' ) ) ;
    public final Enumerator ruleDAlignment() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;


        	enterRule();

        try {
            // InternalSSS.g:5298:2: ( ( (enumLiteral_0= '\"left\"' ) | (enumLiteral_1= '\"center\"' ) | (enumLiteral_2= '\"right\"' ) | (enumLiteral_3= '\"justified\"' ) ) )
            // InternalSSS.g:5299:2: ( (enumLiteral_0= '\"left\"' ) | (enumLiteral_1= '\"center\"' ) | (enumLiteral_2= '\"right\"' ) | (enumLiteral_3= '\"justified\"' ) )
            {
            // InternalSSS.g:5299:2: ( (enumLiteral_0= '\"left\"' ) | (enumLiteral_1= '\"center\"' ) | (enumLiteral_2= '\"right\"' ) | (enumLiteral_3= '\"justified\"' ) )
            int alt107=4;
            switch ( input.LA(1) ) {
            case 139:
                {
                alt107=1;
                }
                break;
            case 140:
                {
                alt107=2;
                }
                break;
            case 141:
                {
                alt107=3;
                }
                break;
            case 142:
                {
                alt107=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 107, 0, input);

                throw nvae;
            }

            switch (alt107) {
                case 1 :
                    // InternalSSS.g:5300:3: (enumLiteral_0= '\"left\"' )
                    {
                    // InternalSSS.g:5300:3: (enumLiteral_0= '\"left\"' )
                    // InternalSSS.g:5301:4: enumLiteral_0= '\"left\"'
                    {
                    enumLiteral_0=(Token)match(input,139,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getDAlignmentAccess().getLeftEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_0, grammarAccess.getDAlignmentAccess().getLeftEnumLiteralDeclaration_0());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalSSS.g:5308:3: (enumLiteral_1= '\"center\"' )
                    {
                    // InternalSSS.g:5308:3: (enumLiteral_1= '\"center\"' )
                    // InternalSSS.g:5309:4: enumLiteral_1= '\"center\"'
                    {
                    enumLiteral_1=(Token)match(input,140,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getDAlignmentAccess().getCenterEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_1, grammarAccess.getDAlignmentAccess().getCenterEnumLiteralDeclaration_1());
                      			
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalSSS.g:5316:3: (enumLiteral_2= '\"right\"' )
                    {
                    // InternalSSS.g:5316:3: (enumLiteral_2= '\"right\"' )
                    // InternalSSS.g:5317:4: enumLiteral_2= '\"right\"'
                    {
                    enumLiteral_2=(Token)match(input,141,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getDAlignmentAccess().getRightEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_2, grammarAccess.getDAlignmentAccess().getRightEnumLiteralDeclaration_2());
                      			
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalSSS.g:5324:3: (enumLiteral_3= '\"justified\"' )
                    {
                    // InternalSSS.g:5324:3: (enumLiteral_3= '\"justified\"' )
                    // InternalSSS.g:5325:4: enumLiteral_3= '\"justified\"'
                    {
                    enumLiteral_3=(Token)match(input,142,FollowSets000.FOLLOW_2); if (state.failed) return current;
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


    // $ANTLR start "ruleVValidationMethod"
    // InternalSSS.g:5335:1: ruleVValidationMethod returns [Enumerator current=null] : ( (enumLiteral_0= '\"Analysis\"' ) | (enumLiteral_1= '\"Inspection\"' ) | (enumLiteral_2= '\"Testing\"' ) | (enumLiteral_3= '\"Review\"' ) | (enumLiteral_4= '\"ModelSimulation\"' ) | (enumLiteral_5= '\"WalkThrough\"' ) | (enumLiteral_6= '\"CrossReading\"' ) | (enumLiteral_7= '\"DeskChecking\"' ) ) ;
    public final Enumerator ruleVValidationMethod() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;
        Token enumLiteral_5=null;
        Token enumLiteral_6=null;
        Token enumLiteral_7=null;


        	enterRule();

        try {
            // InternalSSS.g:5341:2: ( ( (enumLiteral_0= '\"Analysis\"' ) | (enumLiteral_1= '\"Inspection\"' ) | (enumLiteral_2= '\"Testing\"' ) | (enumLiteral_3= '\"Review\"' ) | (enumLiteral_4= '\"ModelSimulation\"' ) | (enumLiteral_5= '\"WalkThrough\"' ) | (enumLiteral_6= '\"CrossReading\"' ) | (enumLiteral_7= '\"DeskChecking\"' ) ) )
            // InternalSSS.g:5342:2: ( (enumLiteral_0= '\"Analysis\"' ) | (enumLiteral_1= '\"Inspection\"' ) | (enumLiteral_2= '\"Testing\"' ) | (enumLiteral_3= '\"Review\"' ) | (enumLiteral_4= '\"ModelSimulation\"' ) | (enumLiteral_5= '\"WalkThrough\"' ) | (enumLiteral_6= '\"CrossReading\"' ) | (enumLiteral_7= '\"DeskChecking\"' ) )
            {
            // InternalSSS.g:5342:2: ( (enumLiteral_0= '\"Analysis\"' ) | (enumLiteral_1= '\"Inspection\"' ) | (enumLiteral_2= '\"Testing\"' ) | (enumLiteral_3= '\"Review\"' ) | (enumLiteral_4= '\"ModelSimulation\"' ) | (enumLiteral_5= '\"WalkThrough\"' ) | (enumLiteral_6= '\"CrossReading\"' ) | (enumLiteral_7= '\"DeskChecking\"' ) )
            int alt108=8;
            switch ( input.LA(1) ) {
            case 143:
                {
                alt108=1;
                }
                break;
            case 144:
                {
                alt108=2;
                }
                break;
            case 145:
                {
                alt108=3;
                }
                break;
            case 146:
                {
                alt108=4;
                }
                break;
            case 147:
                {
                alt108=5;
                }
                break;
            case 148:
                {
                alt108=6;
                }
                break;
            case 149:
                {
                alt108=7;
                }
                break;
            case 150:
                {
                alt108=8;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 108, 0, input);

                throw nvae;
            }

            switch (alt108) {
                case 1 :
                    // InternalSSS.g:5343:3: (enumLiteral_0= '\"Analysis\"' )
                    {
                    // InternalSSS.g:5343:3: (enumLiteral_0= '\"Analysis\"' )
                    // InternalSSS.g:5344:4: enumLiteral_0= '\"Analysis\"'
                    {
                    enumLiteral_0=(Token)match(input,143,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getVValidationMethodAccess().getAnalysisEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_0, grammarAccess.getVValidationMethodAccess().getAnalysisEnumLiteralDeclaration_0());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalSSS.g:5351:3: (enumLiteral_1= '\"Inspection\"' )
                    {
                    // InternalSSS.g:5351:3: (enumLiteral_1= '\"Inspection\"' )
                    // InternalSSS.g:5352:4: enumLiteral_1= '\"Inspection\"'
                    {
                    enumLiteral_1=(Token)match(input,144,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getVValidationMethodAccess().getInspectionEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_1, grammarAccess.getVValidationMethodAccess().getInspectionEnumLiteralDeclaration_1());
                      			
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalSSS.g:5359:3: (enumLiteral_2= '\"Testing\"' )
                    {
                    // InternalSSS.g:5359:3: (enumLiteral_2= '\"Testing\"' )
                    // InternalSSS.g:5360:4: enumLiteral_2= '\"Testing\"'
                    {
                    enumLiteral_2=(Token)match(input,145,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getVValidationMethodAccess().getTestingEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_2, grammarAccess.getVValidationMethodAccess().getTestingEnumLiteralDeclaration_2());
                      			
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalSSS.g:5367:3: (enumLiteral_3= '\"Review\"' )
                    {
                    // InternalSSS.g:5367:3: (enumLiteral_3= '\"Review\"' )
                    // InternalSSS.g:5368:4: enumLiteral_3= '\"Review\"'
                    {
                    enumLiteral_3=(Token)match(input,146,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getVValidationMethodAccess().getReviewEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_3, grammarAccess.getVValidationMethodAccess().getReviewEnumLiteralDeclaration_3());
                      			
                    }

                    }


                    }
                    break;
                case 5 :
                    // InternalSSS.g:5375:3: (enumLiteral_4= '\"ModelSimulation\"' )
                    {
                    // InternalSSS.g:5375:3: (enumLiteral_4= '\"ModelSimulation\"' )
                    // InternalSSS.g:5376:4: enumLiteral_4= '\"ModelSimulation\"'
                    {
                    enumLiteral_4=(Token)match(input,147,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getVValidationMethodAccess().getModelSimulationEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_4, grammarAccess.getVValidationMethodAccess().getModelSimulationEnumLiteralDeclaration_4());
                      			
                    }

                    }


                    }
                    break;
                case 6 :
                    // InternalSSS.g:5383:3: (enumLiteral_5= '\"WalkThrough\"' )
                    {
                    // InternalSSS.g:5383:3: (enumLiteral_5= '\"WalkThrough\"' )
                    // InternalSSS.g:5384:4: enumLiteral_5= '\"WalkThrough\"'
                    {
                    enumLiteral_5=(Token)match(input,148,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getVValidationMethodAccess().getWalkThroughEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_5, grammarAccess.getVValidationMethodAccess().getWalkThroughEnumLiteralDeclaration_5());
                      			
                    }

                    }


                    }
                    break;
                case 7 :
                    // InternalSSS.g:5391:3: (enumLiteral_6= '\"CrossReading\"' )
                    {
                    // InternalSSS.g:5391:3: (enumLiteral_6= '\"CrossReading\"' )
                    // InternalSSS.g:5392:4: enumLiteral_6= '\"CrossReading\"'
                    {
                    enumLiteral_6=(Token)match(input,149,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getVValidationMethodAccess().getCrossReadingEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_6, grammarAccess.getVValidationMethodAccess().getCrossReadingEnumLiteralDeclaration_6());
                      			
                    }

                    }


                    }
                    break;
                case 8 :
                    // InternalSSS.g:5399:3: (enumLiteral_7= '\"DeskChecking\"' )
                    {
                    // InternalSSS.g:5399:3: (enumLiteral_7= '\"DeskChecking\"' )
                    // InternalSSS.g:5400:4: enumLiteral_7= '\"DeskChecking\"'
                    {
                    enumLiteral_7=(Token)match(input,150,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getVValidationMethodAccess().getDeskCheckingEnumLiteralDeclaration_7().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_7, grammarAccess.getVValidationMethodAccess().getDeskCheckingEnumLiteralDeclaration_7());
                      			
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
    // $ANTLR end "ruleVValidationMethod"

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
        public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
        public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
        public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
        public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
        public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
        public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200000L});
        public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L});
        public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000000000L,0x0000000002000000L});
        public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000100000L});
        public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x000C100280800000L});
        public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x000C100280C00000L});
        public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000003080000L});
        public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000002080000L});
        public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000007800L});
        public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000010800000000L});
        public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000010804000000L});
        public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000000800000L});
        public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000050800000L});
        public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000280000000L});
        public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000020000000L});
        public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000040000000L});
        public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000001080000L});
        public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000008000000L});
        public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000000108000000L});
        public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000000408000000L});
        public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000007000080000L});
        public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000006000080000L});
        public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000004000080000L});
        public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000080000000040L});
        public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000008000000000L});
        public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000020000000000L});
        public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000040800000000L});
        public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0000040000000000L});
        public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0000200000000000L});
        public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0000400000000000L});
        public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0000800000000000L});
        public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0003000003000000L});
        public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0003000001000000L});
        public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x0003000000000000L});
        public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x0002000000000000L});
        public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x0001400003080000L});
        public static final BitSet FOLLOW_52 = new BitSet(new long[]{0x0001000003080000L});
        public static final BitSet FOLLOW_53 = new BitSet(new long[]{0x0001000001080000L});
        public static final BitSet FOLLOW_54 = new BitSet(new long[]{0x0001000000080000L});
        public static final BitSet FOLLOW_55 = new BitSet(new long[]{0x0020000000000000L});
        public static final BitSet FOLLOW_56 = new BitSet(new long[]{0x0030000000000000L});
        public static final BitSet FOLLOW_57 = new BitSet(new long[]{0x0080000000000000L});
        public static final BitSet FOLLOW_58 = new BitSet(new long[]{0x00C0000000000000L});
        public static final BitSet FOLLOW_59 = new BitSet(new long[]{0x0700400000080000L});
        public static final BitSet FOLLOW_60 = new BitSet(new long[]{0x0600400000080000L});
        public static final BitSet FOLLOW_61 = new BitSet(new long[]{0x0400400000080000L});
        public static final BitSet FOLLOW_62 = new BitSet(new long[]{0x0400000000080000L});
        public static final BitSet FOLLOW_63 = new BitSet(new long[]{0x080C100280800000L});
        public static final BitSet FOLLOW_64 = new BitSet(new long[]{0x2000000000000000L});
        public static final BitSet FOLLOW_65 = new BitSet(new long[]{0x0002000000050000L});
        public static final BitSet FOLLOW_66 = new BitSet(new long[]{0x0002000000060000L});
        public static final BitSet FOLLOW_67 = new BitSet(new long[]{0x0002000000040000L});
        public static final BitSet FOLLOW_68 = new BitSet(new long[]{0x8000000000000002L});
        public static final BitSet FOLLOW_69 = new BitSet(new long[]{0x8000000000200000L,0x0000000000000001L});
        public static final BitSet FOLLOW_70 = new BitSet(new long[]{0x8000000000000000L,0x0000000000000001L});
        public static final BitSet FOLLOW_71 = new BitSet(new long[]{0x8000000000000000L});
        public static final BitSet FOLLOW_72 = new BitSet(new long[]{0x8000000000000000L,0x0000000000000004L});
        public static final BitSet FOLLOW_73 = new BitSet(new long[]{0x1000000000000000L,0x0000000000000010L});
        public static final BitSet FOLLOW_74 = new BitSet(new long[]{0x4000000000000000L,0x0000000000000040L});
        public static final BitSet FOLLOW_75 = new BitSet(new long[]{0x0000000000000000L,0x00000000A8000100L});
        public static final BitSet FOLLOW_76 = new BitSet(new long[]{0x0000000000000000L,0x00000000A0000100L});
        public static final BitSet FOLLOW_77 = new BitSet(new long[]{0x0000000000000000L,0x0000000080000100L});
        public static final BitSet FOLLOW_78 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
        public static final BitSet FOLLOW_79 = new BitSet(new long[]{0x8000000000200000L,0x0000000000000800L});
        public static final BitSet FOLLOW_80 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
        public static final BitSet FOLLOW_81 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
        public static final BitSet FOLLOW_82 = new BitSet(new long[]{0x8000000000200000L,0x0000000000002000L});
        public static final BitSet FOLLOW_83 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
        public static final BitSet FOLLOW_84 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
        public static final BitSet FOLLOW_85 = new BitSet(new long[]{0x8000000000200000L,0x0000000000008000L});
        public static final BitSet FOLLOW_86 = new BitSet(new long[]{0x0000000000000000L,0x0000000000008000L});
        public static final BitSet FOLLOW_87 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
        public static final BitSet FOLLOW_88 = new BitSet(new long[]{0x8000000000200000L,0x0000000000020000L});
        public static final BitSet FOLLOW_89 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
        public static final BitSet FOLLOW_90 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
        public static final BitSet FOLLOW_91 = new BitSet(new long[]{0x8000000000200000L,0x0000000000080000L});
        public static final BitSet FOLLOW_92 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
        public static final BitSet FOLLOW_93 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
        public static final BitSet FOLLOW_94 = new BitSet(new long[]{0x0000000000200000L,0x0000000200000000L});
        public static final BitSet FOLLOW_95 = new BitSet(new long[]{0x0000000000000000L,0x0000000800000000L});
        public static final BitSet FOLLOW_96 = new BitSet(new long[]{0x0000000000000000L,0x0000002000000000L});
        public static final BitSet FOLLOW_97 = new BitSet(new long[]{0x0000000000000000L,0x0000008000000000L});
        public static final BitSet FOLLOW_98 = new BitSet(new long[]{0x0000000000000000L,0x0000020000000000L});
        public static final BitSet FOLLOW_99 = new BitSet(new long[]{0x0000000000000000L,0x0000080000000000L});
        public static final BitSet FOLLOW_100 = new BitSet(new long[]{0x0000000000000000L,0x0000200000000000L});
        public static final BitSet FOLLOW_101 = new BitSet(new long[]{0x0000000000000000L,0x0000800000000000L});
        public static final BitSet FOLLOW_102 = new BitSet(new long[]{0x0000000000000000L,0x0002000000000000L});
        public static final BitSet FOLLOW_103 = new BitSet(new long[]{0x0000000000000000L,0x0008000000000000L});
        public static final BitSet FOLLOW_104 = new BitSet(new long[]{0x0000000000000000L,0x0020000000000000L});
        public static final BitSet FOLLOW_105 = new BitSet(new long[]{0x0000000000000000L,0x0080000000000000L});
        public static final BitSet FOLLOW_106 = new BitSet(new long[]{0x0000000000000000L,0x0200000000000000L});
        public static final BitSet FOLLOW_107 = new BitSet(new long[]{0x0000000000000000L,0x0000000000400000L});
        public static final BitSet FOLLOW_108 = new BitSet(new long[]{0x0000000000200000L,0x0000000000000000L,0x0000000000000004L});
        public static final BitSet FOLLOW_109 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000010L});
        public static final BitSet FOLLOW_110 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000040L});
        public static final BitSet FOLLOW_111 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000100L});
        public static final BitSet FOLLOW_112 = new BitSet(new long[]{0x0000000000000000L,0x0000000001000000L});
        public static final BitSet FOLLOW_113 = new BitSet(new long[]{0x0000000000000000L,0x0000000004000000L,0x0000000000000400L});
        public static final BitSet FOLLOW_114 = new BitSet(new long[]{0x0000000800000000L});
        public static final BitSet FOLLOW_115 = new BitSet(new long[]{0x0000000000000000L,0x0000000010000000L});
        public static final BitSet FOLLOW_116 = new BitSet(new long[]{0x0000000000000000L,0x0000000040000000L});
        public static final BitSet FOLLOW_117 = new BitSet(new long[]{0x0000000000000000L,0x0000000100000000L});
        public static final BitSet FOLLOW_118 = new BitSet(new long[]{0x0000000000200000L,0x0800000000000001L});
        public static final BitSet FOLLOW_119 = new BitSet(new long[]{0x0000000000000000L,0x0800000000000001L});
        public static final BitSet FOLLOW_120 = new BitSet(new long[]{0x8000000000200000L,0x0800000400000000L});
        public static final BitSet FOLLOW_121 = new BitSet(new long[]{0x8000000000000000L,0x0800000400000000L});
        public static final BitSet FOLLOW_122 = new BitSet(new long[]{0x8000000000000000L,0x0000000400000000L});
        public static final BitSet FOLLOW_123 = new BitSet(new long[]{0x8000000000200000L,0x0800001000000000L});
        public static final BitSet FOLLOW_124 = new BitSet(new long[]{0x8000000000000000L,0x0800001000000000L});
        public static final BitSet FOLLOW_125 = new BitSet(new long[]{0x8000000000000000L,0x0000001000000000L});
        public static final BitSet FOLLOW_126 = new BitSet(new long[]{0x8000000000200000L,0x0800004000000000L});
        public static final BitSet FOLLOW_127 = new BitSet(new long[]{0x8000000000000000L,0x0800004000000000L});
        public static final BitSet FOLLOW_128 = new BitSet(new long[]{0x8000000000000000L,0x0000004000000000L});
        public static final BitSet FOLLOW_129 = new BitSet(new long[]{0x8000000000200000L,0x0800010000000000L});
        public static final BitSet FOLLOW_130 = new BitSet(new long[]{0x8000000000000000L,0x0800010000000000L});
        public static final BitSet FOLLOW_131 = new BitSet(new long[]{0x8000000000000000L,0x0000010000000000L});
        public static final BitSet FOLLOW_132 = new BitSet(new long[]{0x8000000000200000L,0x0800040000000000L});
        public static final BitSet FOLLOW_133 = new BitSet(new long[]{0x8000000000000000L,0x0800040000000000L});
        public static final BitSet FOLLOW_134 = new BitSet(new long[]{0x8000000000000000L,0x0000040000000000L});
        public static final BitSet FOLLOW_135 = new BitSet(new long[]{0x8000000000200000L,0x0800100000000000L});
        public static final BitSet FOLLOW_136 = new BitSet(new long[]{0x8000000000000000L,0x0800100000000000L});
        public static final BitSet FOLLOW_137 = new BitSet(new long[]{0x8000000000000000L,0x0000100000000000L});
        public static final BitSet FOLLOW_138 = new BitSet(new long[]{0x8000000000200000L,0x0800400000000000L});
        public static final BitSet FOLLOW_139 = new BitSet(new long[]{0x8000000000000000L,0x0800400000000000L});
        public static final BitSet FOLLOW_140 = new BitSet(new long[]{0x8000000000000000L,0x0000400000000000L});
        public static final BitSet FOLLOW_141 = new BitSet(new long[]{0x8000000000200000L,0x0801000000000000L});
        public static final BitSet FOLLOW_142 = new BitSet(new long[]{0x8000000000000000L,0x0001000000000000L});
        public static final BitSet FOLLOW_143 = new BitSet(new long[]{0x8000000000200000L,0x0804000000000000L});
        public static final BitSet FOLLOW_144 = new BitSet(new long[]{0x8000000000000000L,0x0804000000000000L});
        public static final BitSet FOLLOW_145 = new BitSet(new long[]{0x8000000000000000L,0x0004000000000000L});
        public static final BitSet FOLLOW_146 = new BitSet(new long[]{0x8000000000200000L,0x0810000000000000L});
        public static final BitSet FOLLOW_147 = new BitSet(new long[]{0x8000000000000000L,0x0810000000000000L});
        public static final BitSet FOLLOW_148 = new BitSet(new long[]{0x8000000000000000L,0x0010000000000000L});
        public static final BitSet FOLLOW_149 = new BitSet(new long[]{0x8000000000200000L,0x0840000000000000L});
        public static final BitSet FOLLOW_150 = new BitSet(new long[]{0x8000000000000000L,0x0840000000000000L});
        public static final BitSet FOLLOW_151 = new BitSet(new long[]{0x8000000000000000L,0x0040000000000000L});
        public static final BitSet FOLLOW_152 = new BitSet(new long[]{0x8000000000200000L,0x0900000000000000L});
        public static final BitSet FOLLOW_153 = new BitSet(new long[]{0x8000000000000000L,0x0900000000000000L});
        public static final BitSet FOLLOW_154 = new BitSet(new long[]{0x8000000000000000L,0x0100000000000000L});
        public static final BitSet FOLLOW_155 = new BitSet(new long[]{0x8000000000200000L,0x0C00000000000000L});
        public static final BitSet FOLLOW_156 = new BitSet(new long[]{0x8000000000000000L,0x0C00000000000000L});
        public static final BitSet FOLLOW_157 = new BitSet(new long[]{0x8000000000000000L,0x0400000000000000L});
        public static final BitSet FOLLOW_158 = new BitSet(new long[]{0x0000000000000000L,0x1000000000000000L});
        public static final BitSet FOLLOW_159 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x00000000007F8000L});
        public static final BitSet FOLLOW_160 = new BitSet(new long[]{0x0000000000000000L,0x2000000000000000L});
        public static final BitSet FOLLOW_161 = new BitSet(new long[]{0x0000000000200000L});
        public static final BitSet FOLLOW_162 = new BitSet(new long[]{0x0000000000000000L,0x4000000000000000L});
        public static final BitSet FOLLOW_163 = new BitSet(new long[]{0x0000000000000000L,0x8000000000000000L,0x0000000000000002L});
        public static final BitSet FOLLOW_164 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000001L});
        public static final BitSet FOLLOW_165 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000002L});
        public static final BitSet FOLLOW_166 = new BitSet(new long[]{0x8000000000000000L,0x0800000000000000L,0x0000000000000008L});
        public static final BitSet FOLLOW_167 = new BitSet(new long[]{0x8000000000000000L,0x0000000000000000L,0x0000000000000008L});
        public static final BitSet FOLLOW_168 = new BitSet(new long[]{0x8000000000000000L,0x0800000000000000L,0x0000000000000020L});
        public static final BitSet FOLLOW_169 = new BitSet(new long[]{0x8000000000000000L,0x0000000000000000L,0x0000000000000020L});
        public static final BitSet FOLLOW_170 = new BitSet(new long[]{0x8000000000000000L,0x0800000000000000L,0x0000000000000080L});
        public static final BitSet FOLLOW_171 = new BitSet(new long[]{0x8000000000000000L,0x0000000000000000L,0x0000000000000080L});
        public static final BitSet FOLLOW_172 = new BitSet(new long[]{0x8000000000000000L,0x0800000000000000L,0x0000000000000200L});
        public static final BitSet FOLLOW_173 = new BitSet(new long[]{0x8000000000000000L,0x0000000000000000L,0x0000000000000200L});
    }


}