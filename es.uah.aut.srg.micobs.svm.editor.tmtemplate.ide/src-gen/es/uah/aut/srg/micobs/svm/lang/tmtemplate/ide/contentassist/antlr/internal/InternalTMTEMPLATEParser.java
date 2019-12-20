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



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalTMTEMPLATEParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_UINT_STRING", "RULE_HEX_STRING", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'/>'", "'<TMTemplate'", "'name='", "'tmOutput='", "'>'", "'</TMTemplate>'", "'<Fields>'", "'</Fields>'", "'<Field>'", "'<fieldRef'", "'</Field>'", "'<FieldValueRaw'", "'value='", "'<FieldValueFile'", "'filename='"
    };
    public static final int RULE_STRING=6;
    public static final int RULE_UINT_STRING=4;
    public static final int RULE_SL_COMMENT=10;
    public static final int T__19=19;
    public static final int RULE_HEX_STRING=5;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int RULE_ID=7;
    public static final int RULE_WS=11;
    public static final int RULE_ANY_OTHER=12;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int RULE_INT=8;
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



    // $ANTLR start "entryRuleVTMTemplate"
    // InternalTMTEMPLATE.g:54:1: entryRuleVTMTemplate : ruleVTMTemplate EOF ;
    public final void entryRuleVTMTemplate() throws RecognitionException {
        try {
            // InternalTMTEMPLATE.g:55:1: ( ruleVTMTemplate EOF )
            // InternalTMTEMPLATE.g:56:1: ruleVTMTemplate EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVTMTemplateRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            ruleVTMTemplate();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getVTMTemplateRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleVTMTemplate"


    // $ANTLR start "ruleVTMTemplate"
    // InternalTMTEMPLATE.g:63:1: ruleVTMTemplate : ( ( rule__VTMTemplate__Group__0 ) ) ;
    public final void ruleVTMTemplate() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTMTEMPLATE.g:67:2: ( ( ( rule__VTMTemplate__Group__0 ) ) )
            // InternalTMTEMPLATE.g:68:2: ( ( rule__VTMTemplate__Group__0 ) )
            {
            // InternalTMTEMPLATE.g:68:2: ( ( rule__VTMTemplate__Group__0 ) )
            // InternalTMTEMPLATE.g:69:3: ( rule__VTMTemplate__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVTMTemplateAccess().getGroup()); 
            }
            // InternalTMTEMPLATE.g:70:3: ( rule__VTMTemplate__Group__0 )
            // InternalTMTEMPLATE.g:70:4: rule__VTMTemplate__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__VTMTemplate__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getVTMTemplateAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleVTMTemplate"


    // $ANTLR start "entryRuleVTMTemplateField"
    // InternalTMTEMPLATE.g:79:1: entryRuleVTMTemplateField : ruleVTMTemplateField EOF ;
    public final void entryRuleVTMTemplateField() throws RecognitionException {
        try {
            // InternalTMTEMPLATE.g:80:1: ( ruleVTMTemplateField EOF )
            // InternalTMTEMPLATE.g:81:1: ruleVTMTemplateField EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVTMTemplateFieldRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            ruleVTMTemplateField();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getVTMTemplateFieldRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleVTMTemplateField"


    // $ANTLR start "ruleVTMTemplateField"
    // InternalTMTEMPLATE.g:88:1: ruleVTMTemplateField : ( ( rule__VTMTemplateField__Group__0 ) ) ;
    public final void ruleVTMTemplateField() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTMTEMPLATE.g:92:2: ( ( ( rule__VTMTemplateField__Group__0 ) ) )
            // InternalTMTEMPLATE.g:93:2: ( ( rule__VTMTemplateField__Group__0 ) )
            {
            // InternalTMTEMPLATE.g:93:2: ( ( rule__VTMTemplateField__Group__0 ) )
            // InternalTMTEMPLATE.g:94:3: ( rule__VTMTemplateField__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVTMTemplateFieldAccess().getGroup()); 
            }
            // InternalTMTEMPLATE.g:95:3: ( rule__VTMTemplateField__Group__0 )
            // InternalTMTEMPLATE.g:95:4: rule__VTMTemplateField__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__VTMTemplateField__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getVTMTemplateFieldAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleVTMTemplateField"


    // $ANTLR start "entryRuleTMTCIFFieldValue"
    // InternalTMTEMPLATE.g:104:1: entryRuleTMTCIFFieldValue : ruleTMTCIFFieldValue EOF ;
    public final void entryRuleTMTCIFFieldValue() throws RecognitionException {
        try {
            // InternalTMTEMPLATE.g:105:1: ( ruleTMTCIFFieldValue EOF )
            // InternalTMTEMPLATE.g:106:1: ruleTMTCIFFieldValue EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFFieldValueRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            ruleTMTCIFFieldValue();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFFieldValueRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleTMTCIFFieldValue"


    // $ANTLR start "ruleTMTCIFFieldValue"
    // InternalTMTEMPLATE.g:113:1: ruleTMTCIFFieldValue : ( ( rule__TMTCIFFieldValue__Alternatives ) ) ;
    public final void ruleTMTCIFFieldValue() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTMTEMPLATE.g:117:2: ( ( ( rule__TMTCIFFieldValue__Alternatives ) ) )
            // InternalTMTEMPLATE.g:118:2: ( ( rule__TMTCIFFieldValue__Alternatives ) )
            {
            // InternalTMTEMPLATE.g:118:2: ( ( rule__TMTCIFFieldValue__Alternatives ) )
            // InternalTMTEMPLATE.g:119:3: ( rule__TMTCIFFieldValue__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFFieldValueAccess().getAlternatives()); 
            }
            // InternalTMTEMPLATE.g:120:3: ( rule__TMTCIFFieldValue__Alternatives )
            // InternalTMTEMPLATE.g:120:4: rule__TMTCIFFieldValue__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TMTCIFFieldValue__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFFieldValueAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTMTCIFFieldValue"


    // $ANTLR start "entryRuleTMTCIFFieldValueRaw"
    // InternalTMTEMPLATE.g:129:1: entryRuleTMTCIFFieldValueRaw : ruleTMTCIFFieldValueRaw EOF ;
    public final void entryRuleTMTCIFFieldValueRaw() throws RecognitionException {
        try {
            // InternalTMTEMPLATE.g:130:1: ( ruleTMTCIFFieldValueRaw EOF )
            // InternalTMTEMPLATE.g:131:1: ruleTMTCIFFieldValueRaw EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFFieldValueRawRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            ruleTMTCIFFieldValueRaw();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFFieldValueRawRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleTMTCIFFieldValueRaw"


    // $ANTLR start "ruleTMTCIFFieldValueRaw"
    // InternalTMTEMPLATE.g:138:1: ruleTMTCIFFieldValueRaw : ( ( rule__TMTCIFFieldValueRaw__Group__0 ) ) ;
    public final void ruleTMTCIFFieldValueRaw() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTMTEMPLATE.g:142:2: ( ( ( rule__TMTCIFFieldValueRaw__Group__0 ) ) )
            // InternalTMTEMPLATE.g:143:2: ( ( rule__TMTCIFFieldValueRaw__Group__0 ) )
            {
            // InternalTMTEMPLATE.g:143:2: ( ( rule__TMTCIFFieldValueRaw__Group__0 ) )
            // InternalTMTEMPLATE.g:144:3: ( rule__TMTCIFFieldValueRaw__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFFieldValueRawAccess().getGroup()); 
            }
            // InternalTMTEMPLATE.g:145:3: ( rule__TMTCIFFieldValueRaw__Group__0 )
            // InternalTMTEMPLATE.g:145:4: rule__TMTCIFFieldValueRaw__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TMTCIFFieldValueRaw__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFFieldValueRawAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTMTCIFFieldValueRaw"


    // $ANTLR start "entryRuleTMTCIFFieldValueFile"
    // InternalTMTEMPLATE.g:154:1: entryRuleTMTCIFFieldValueFile : ruleTMTCIFFieldValueFile EOF ;
    public final void entryRuleTMTCIFFieldValueFile() throws RecognitionException {
        try {
            // InternalTMTEMPLATE.g:155:1: ( ruleTMTCIFFieldValueFile EOF )
            // InternalTMTEMPLATE.g:156:1: ruleTMTCIFFieldValueFile EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFFieldValueFileRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            ruleTMTCIFFieldValueFile();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFFieldValueFileRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleTMTCIFFieldValueFile"


    // $ANTLR start "ruleTMTCIFFieldValueFile"
    // InternalTMTEMPLATE.g:163:1: ruleTMTCIFFieldValueFile : ( ( rule__TMTCIFFieldValueFile__Group__0 ) ) ;
    public final void ruleTMTCIFFieldValueFile() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTMTEMPLATE.g:167:2: ( ( ( rule__TMTCIFFieldValueFile__Group__0 ) ) )
            // InternalTMTEMPLATE.g:168:2: ( ( rule__TMTCIFFieldValueFile__Group__0 ) )
            {
            // InternalTMTEMPLATE.g:168:2: ( ( rule__TMTCIFFieldValueFile__Group__0 ) )
            // InternalTMTEMPLATE.g:169:3: ( rule__TMTCIFFieldValueFile__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFFieldValueFileAccess().getGroup()); 
            }
            // InternalTMTEMPLATE.g:170:3: ( rule__TMTCIFFieldValueFile__Group__0 )
            // InternalTMTEMPLATE.g:170:4: rule__TMTCIFFieldValueFile__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TMTCIFFieldValueFile__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFFieldValueFileAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTMTCIFFieldValueFile"


    // $ANTLR start "rule__VTMTemplate__Alternatives_5"
    // InternalTMTEMPLATE.g:178:1: rule__VTMTemplate__Alternatives_5 : ( ( ( rule__VTMTemplate__Group_5_0__0 ) ) | ( '/>' ) );
    public final void rule__VTMTemplate__Alternatives_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTMTEMPLATE.g:182:1: ( ( ( rule__VTMTemplate__Group_5_0__0 ) ) | ( '/>' ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==17) ) {
                alt1=1;
            }
            else if ( (LA1_0==13) ) {
                alt1=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalTMTEMPLATE.g:183:2: ( ( rule__VTMTemplate__Group_5_0__0 ) )
                    {
                    // InternalTMTEMPLATE.g:183:2: ( ( rule__VTMTemplate__Group_5_0__0 ) )
                    // InternalTMTEMPLATE.g:184:3: ( rule__VTMTemplate__Group_5_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getVTMTemplateAccess().getGroup_5_0()); 
                    }
                    // InternalTMTEMPLATE.g:185:3: ( rule__VTMTemplate__Group_5_0__0 )
                    // InternalTMTEMPLATE.g:185:4: rule__VTMTemplate__Group_5_0__0
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__VTMTemplate__Group_5_0__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getVTMTemplateAccess().getGroup_5_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalTMTEMPLATE.g:189:2: ( '/>' )
                    {
                    // InternalTMTEMPLATE.g:189:2: ( '/>' )
                    // InternalTMTEMPLATE.g:190:3: '/>'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getVTMTemplateAccess().getSolidusGreaterThanSignKeyword_5_1()); 
                    }
                    match(input,13,FollowSets000.FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getVTMTemplateAccess().getSolidusGreaterThanSignKeyword_5_1()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VTMTemplate__Alternatives_5"


    // $ANTLR start "rule__TMTCIFFieldValue__Alternatives"
    // InternalTMTEMPLATE.g:199:1: rule__TMTCIFFieldValue__Alternatives : ( ( ruleTMTCIFFieldValueRaw ) | ( ruleTMTCIFFieldValueFile ) );
    public final void rule__TMTCIFFieldValue__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTMTEMPLATE.g:203:1: ( ( ruleTMTCIFFieldValueRaw ) | ( ruleTMTCIFFieldValueFile ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==24) ) {
                alt2=1;
            }
            else if ( (LA2_0==26) ) {
                alt2=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalTMTEMPLATE.g:204:2: ( ruleTMTCIFFieldValueRaw )
                    {
                    // InternalTMTEMPLATE.g:204:2: ( ruleTMTCIFFieldValueRaw )
                    // InternalTMTEMPLATE.g:205:3: ruleTMTCIFFieldValueRaw
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getTMTCIFFieldValueAccess().getTMTCIFFieldValueRawParserRuleCall_0()); 
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    ruleTMTCIFFieldValueRaw();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getTMTCIFFieldValueAccess().getTMTCIFFieldValueRawParserRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalTMTEMPLATE.g:210:2: ( ruleTMTCIFFieldValueFile )
                    {
                    // InternalTMTEMPLATE.g:210:2: ( ruleTMTCIFFieldValueFile )
                    // InternalTMTEMPLATE.g:211:3: ruleTMTCIFFieldValueFile
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getTMTCIFFieldValueAccess().getTMTCIFFieldValueFileParserRuleCall_1()); 
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    ruleTMTCIFFieldValueFile();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getTMTCIFFieldValueAccess().getTMTCIFFieldValueFileParserRuleCall_1()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TMTCIFFieldValue__Alternatives"


    // $ANTLR start "rule__TMTCIFFieldValueRaw__ValueAlternatives_2_0"
    // InternalTMTEMPLATE.g:220:1: rule__TMTCIFFieldValueRaw__ValueAlternatives_2_0 : ( ( RULE_UINT_STRING ) | ( RULE_HEX_STRING ) );
    public final void rule__TMTCIFFieldValueRaw__ValueAlternatives_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTMTEMPLATE.g:224:1: ( ( RULE_UINT_STRING ) | ( RULE_HEX_STRING ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_UINT_STRING) ) {
                alt3=1;
            }
            else if ( (LA3_0==RULE_HEX_STRING) ) {
                alt3=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalTMTEMPLATE.g:225:2: ( RULE_UINT_STRING )
                    {
                    // InternalTMTEMPLATE.g:225:2: ( RULE_UINT_STRING )
                    // InternalTMTEMPLATE.g:226:3: RULE_UINT_STRING
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getTMTCIFFieldValueRawAccess().getValueUINT_STRINGTerminalRuleCall_2_0_0()); 
                    }
                    match(input,RULE_UINT_STRING,FollowSets000.FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getTMTCIFFieldValueRawAccess().getValueUINT_STRINGTerminalRuleCall_2_0_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalTMTEMPLATE.g:231:2: ( RULE_HEX_STRING )
                    {
                    // InternalTMTEMPLATE.g:231:2: ( RULE_HEX_STRING )
                    // InternalTMTEMPLATE.g:232:3: RULE_HEX_STRING
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getTMTCIFFieldValueRawAccess().getValueHEX_STRINGTerminalRuleCall_2_0_1()); 
                    }
                    match(input,RULE_HEX_STRING,FollowSets000.FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getTMTCIFFieldValueRawAccess().getValueHEX_STRINGTerminalRuleCall_2_0_1()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TMTCIFFieldValueRaw__ValueAlternatives_2_0"


    // $ANTLR start "rule__VTMTemplate__Group__0"
    // InternalTMTEMPLATE.g:241:1: rule__VTMTemplate__Group__0 : rule__VTMTemplate__Group__0__Impl rule__VTMTemplate__Group__1 ;
    public final void rule__VTMTemplate__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTMTEMPLATE.g:245:1: ( rule__VTMTemplate__Group__0__Impl rule__VTMTemplate__Group__1 )
            // InternalTMTEMPLATE.g:246:2: rule__VTMTemplate__Group__0__Impl rule__VTMTemplate__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_3);
            rule__VTMTemplate__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__VTMTemplate__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VTMTemplate__Group__0"


    // $ANTLR start "rule__VTMTemplate__Group__0__Impl"
    // InternalTMTEMPLATE.g:253:1: rule__VTMTemplate__Group__0__Impl : ( '<TMTemplate' ) ;
    public final void rule__VTMTemplate__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTMTEMPLATE.g:257:1: ( ( '<TMTemplate' ) )
            // InternalTMTEMPLATE.g:258:1: ( '<TMTemplate' )
            {
            // InternalTMTEMPLATE.g:258:1: ( '<TMTemplate' )
            // InternalTMTEMPLATE.g:259:2: '<TMTemplate'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVTMTemplateAccess().getTMTemplateKeyword_0()); 
            }
            match(input,14,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getVTMTemplateAccess().getTMTemplateKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VTMTemplate__Group__0__Impl"


    // $ANTLR start "rule__VTMTemplate__Group__1"
    // InternalTMTEMPLATE.g:268:1: rule__VTMTemplate__Group__1 : rule__VTMTemplate__Group__1__Impl rule__VTMTemplate__Group__2 ;
    public final void rule__VTMTemplate__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTMTEMPLATE.g:272:1: ( rule__VTMTemplate__Group__1__Impl rule__VTMTemplate__Group__2 )
            // InternalTMTEMPLATE.g:273:2: rule__VTMTemplate__Group__1__Impl rule__VTMTemplate__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_4);
            rule__VTMTemplate__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__VTMTemplate__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VTMTemplate__Group__1"


    // $ANTLR start "rule__VTMTemplate__Group__1__Impl"
    // InternalTMTEMPLATE.g:280:1: rule__VTMTemplate__Group__1__Impl : ( 'name=' ) ;
    public final void rule__VTMTemplate__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTMTEMPLATE.g:284:1: ( ( 'name=' ) )
            // InternalTMTEMPLATE.g:285:1: ( 'name=' )
            {
            // InternalTMTEMPLATE.g:285:1: ( 'name=' )
            // InternalTMTEMPLATE.g:286:2: 'name='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVTMTemplateAccess().getNameKeyword_1()); 
            }
            match(input,15,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getVTMTemplateAccess().getNameKeyword_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VTMTemplate__Group__1__Impl"


    // $ANTLR start "rule__VTMTemplate__Group__2"
    // InternalTMTEMPLATE.g:295:1: rule__VTMTemplate__Group__2 : rule__VTMTemplate__Group__2__Impl rule__VTMTemplate__Group__3 ;
    public final void rule__VTMTemplate__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTMTEMPLATE.g:299:1: ( rule__VTMTemplate__Group__2__Impl rule__VTMTemplate__Group__3 )
            // InternalTMTEMPLATE.g:300:2: rule__VTMTemplate__Group__2__Impl rule__VTMTemplate__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_5);
            rule__VTMTemplate__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__VTMTemplate__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VTMTemplate__Group__2"


    // $ANTLR start "rule__VTMTemplate__Group__2__Impl"
    // InternalTMTEMPLATE.g:307:1: rule__VTMTemplate__Group__2__Impl : ( ( rule__VTMTemplate__NameAssignment_2 ) ) ;
    public final void rule__VTMTemplate__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTMTEMPLATE.g:311:1: ( ( ( rule__VTMTemplate__NameAssignment_2 ) ) )
            // InternalTMTEMPLATE.g:312:1: ( ( rule__VTMTemplate__NameAssignment_2 ) )
            {
            // InternalTMTEMPLATE.g:312:1: ( ( rule__VTMTemplate__NameAssignment_2 ) )
            // InternalTMTEMPLATE.g:313:2: ( rule__VTMTemplate__NameAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVTMTemplateAccess().getNameAssignment_2()); 
            }
            // InternalTMTEMPLATE.g:314:2: ( rule__VTMTemplate__NameAssignment_2 )
            // InternalTMTEMPLATE.g:314:3: rule__VTMTemplate__NameAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__VTMTemplate__NameAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getVTMTemplateAccess().getNameAssignment_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VTMTemplate__Group__2__Impl"


    // $ANTLR start "rule__VTMTemplate__Group__3"
    // InternalTMTEMPLATE.g:322:1: rule__VTMTemplate__Group__3 : rule__VTMTemplate__Group__3__Impl rule__VTMTemplate__Group__4 ;
    public final void rule__VTMTemplate__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTMTEMPLATE.g:326:1: ( rule__VTMTemplate__Group__3__Impl rule__VTMTemplate__Group__4 )
            // InternalTMTEMPLATE.g:327:2: rule__VTMTemplate__Group__3__Impl rule__VTMTemplate__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_4);
            rule__VTMTemplate__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__VTMTemplate__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VTMTemplate__Group__3"


    // $ANTLR start "rule__VTMTemplate__Group__3__Impl"
    // InternalTMTEMPLATE.g:334:1: rule__VTMTemplate__Group__3__Impl : ( 'tmOutput=' ) ;
    public final void rule__VTMTemplate__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTMTEMPLATE.g:338:1: ( ( 'tmOutput=' ) )
            // InternalTMTEMPLATE.g:339:1: ( 'tmOutput=' )
            {
            // InternalTMTEMPLATE.g:339:1: ( 'tmOutput=' )
            // InternalTMTEMPLATE.g:340:2: 'tmOutput='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVTMTemplateAccess().getTmOutputKeyword_3()); 
            }
            match(input,16,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getVTMTemplateAccess().getTmOutputKeyword_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VTMTemplate__Group__3__Impl"


    // $ANTLR start "rule__VTMTemplate__Group__4"
    // InternalTMTEMPLATE.g:349:1: rule__VTMTemplate__Group__4 : rule__VTMTemplate__Group__4__Impl rule__VTMTemplate__Group__5 ;
    public final void rule__VTMTemplate__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTMTEMPLATE.g:353:1: ( rule__VTMTemplate__Group__4__Impl rule__VTMTemplate__Group__5 )
            // InternalTMTEMPLATE.g:354:2: rule__VTMTemplate__Group__4__Impl rule__VTMTemplate__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_6);
            rule__VTMTemplate__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__VTMTemplate__Group__5();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VTMTemplate__Group__4"


    // $ANTLR start "rule__VTMTemplate__Group__4__Impl"
    // InternalTMTEMPLATE.g:361:1: rule__VTMTemplate__Group__4__Impl : ( ( rule__VTMTemplate__TmOutputAssignment_4 ) ) ;
    public final void rule__VTMTemplate__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTMTEMPLATE.g:365:1: ( ( ( rule__VTMTemplate__TmOutputAssignment_4 ) ) )
            // InternalTMTEMPLATE.g:366:1: ( ( rule__VTMTemplate__TmOutputAssignment_4 ) )
            {
            // InternalTMTEMPLATE.g:366:1: ( ( rule__VTMTemplate__TmOutputAssignment_4 ) )
            // InternalTMTEMPLATE.g:367:2: ( rule__VTMTemplate__TmOutputAssignment_4 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVTMTemplateAccess().getTmOutputAssignment_4()); 
            }
            // InternalTMTEMPLATE.g:368:2: ( rule__VTMTemplate__TmOutputAssignment_4 )
            // InternalTMTEMPLATE.g:368:3: rule__VTMTemplate__TmOutputAssignment_4
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__VTMTemplate__TmOutputAssignment_4();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getVTMTemplateAccess().getTmOutputAssignment_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VTMTemplate__Group__4__Impl"


    // $ANTLR start "rule__VTMTemplate__Group__5"
    // InternalTMTEMPLATE.g:376:1: rule__VTMTemplate__Group__5 : rule__VTMTemplate__Group__5__Impl ;
    public final void rule__VTMTemplate__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTMTEMPLATE.g:380:1: ( rule__VTMTemplate__Group__5__Impl )
            // InternalTMTEMPLATE.g:381:2: rule__VTMTemplate__Group__5__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__VTMTemplate__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VTMTemplate__Group__5"


    // $ANTLR start "rule__VTMTemplate__Group__5__Impl"
    // InternalTMTEMPLATE.g:387:1: rule__VTMTemplate__Group__5__Impl : ( ( rule__VTMTemplate__Alternatives_5 ) ) ;
    public final void rule__VTMTemplate__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTMTEMPLATE.g:391:1: ( ( ( rule__VTMTemplate__Alternatives_5 ) ) )
            // InternalTMTEMPLATE.g:392:1: ( ( rule__VTMTemplate__Alternatives_5 ) )
            {
            // InternalTMTEMPLATE.g:392:1: ( ( rule__VTMTemplate__Alternatives_5 ) )
            // InternalTMTEMPLATE.g:393:2: ( rule__VTMTemplate__Alternatives_5 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVTMTemplateAccess().getAlternatives_5()); 
            }
            // InternalTMTEMPLATE.g:394:2: ( rule__VTMTemplate__Alternatives_5 )
            // InternalTMTEMPLATE.g:394:3: rule__VTMTemplate__Alternatives_5
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__VTMTemplate__Alternatives_5();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getVTMTemplateAccess().getAlternatives_5()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VTMTemplate__Group__5__Impl"


    // $ANTLR start "rule__VTMTemplate__Group_5_0__0"
    // InternalTMTEMPLATE.g:403:1: rule__VTMTemplate__Group_5_0__0 : rule__VTMTemplate__Group_5_0__0__Impl rule__VTMTemplate__Group_5_0__1 ;
    public final void rule__VTMTemplate__Group_5_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTMTEMPLATE.g:407:1: ( rule__VTMTemplate__Group_5_0__0__Impl rule__VTMTemplate__Group_5_0__1 )
            // InternalTMTEMPLATE.g:408:2: rule__VTMTemplate__Group_5_0__0__Impl rule__VTMTemplate__Group_5_0__1
            {
            pushFollow(FollowSets000.FOLLOW_7);
            rule__VTMTemplate__Group_5_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__VTMTemplate__Group_5_0__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VTMTemplate__Group_5_0__0"


    // $ANTLR start "rule__VTMTemplate__Group_5_0__0__Impl"
    // InternalTMTEMPLATE.g:415:1: rule__VTMTemplate__Group_5_0__0__Impl : ( '>' ) ;
    public final void rule__VTMTemplate__Group_5_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTMTEMPLATE.g:419:1: ( ( '>' ) )
            // InternalTMTEMPLATE.g:420:1: ( '>' )
            {
            // InternalTMTEMPLATE.g:420:1: ( '>' )
            // InternalTMTEMPLATE.g:421:2: '>'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVTMTemplateAccess().getGreaterThanSignKeyword_5_0_0()); 
            }
            match(input,17,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getVTMTemplateAccess().getGreaterThanSignKeyword_5_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VTMTemplate__Group_5_0__0__Impl"


    // $ANTLR start "rule__VTMTemplate__Group_5_0__1"
    // InternalTMTEMPLATE.g:430:1: rule__VTMTemplate__Group_5_0__1 : rule__VTMTemplate__Group_5_0__1__Impl rule__VTMTemplate__Group_5_0__2 ;
    public final void rule__VTMTemplate__Group_5_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTMTEMPLATE.g:434:1: ( rule__VTMTemplate__Group_5_0__1__Impl rule__VTMTemplate__Group_5_0__2 )
            // InternalTMTEMPLATE.g:435:2: rule__VTMTemplate__Group_5_0__1__Impl rule__VTMTemplate__Group_5_0__2
            {
            pushFollow(FollowSets000.FOLLOW_7);
            rule__VTMTemplate__Group_5_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__VTMTemplate__Group_5_0__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VTMTemplate__Group_5_0__1"


    // $ANTLR start "rule__VTMTemplate__Group_5_0__1__Impl"
    // InternalTMTEMPLATE.g:442:1: rule__VTMTemplate__Group_5_0__1__Impl : ( ( rule__VTMTemplate__Group_5_0_1__0 )? ) ;
    public final void rule__VTMTemplate__Group_5_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTMTEMPLATE.g:446:1: ( ( ( rule__VTMTemplate__Group_5_0_1__0 )? ) )
            // InternalTMTEMPLATE.g:447:1: ( ( rule__VTMTemplate__Group_5_0_1__0 )? )
            {
            // InternalTMTEMPLATE.g:447:1: ( ( rule__VTMTemplate__Group_5_0_1__0 )? )
            // InternalTMTEMPLATE.g:448:2: ( rule__VTMTemplate__Group_5_0_1__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVTMTemplateAccess().getGroup_5_0_1()); 
            }
            // InternalTMTEMPLATE.g:449:2: ( rule__VTMTemplate__Group_5_0_1__0 )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==19) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalTMTEMPLATE.g:449:3: rule__VTMTemplate__Group_5_0_1__0
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__VTMTemplate__Group_5_0_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getVTMTemplateAccess().getGroup_5_0_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VTMTemplate__Group_5_0__1__Impl"


    // $ANTLR start "rule__VTMTemplate__Group_5_0__2"
    // InternalTMTEMPLATE.g:457:1: rule__VTMTemplate__Group_5_0__2 : rule__VTMTemplate__Group_5_0__2__Impl ;
    public final void rule__VTMTemplate__Group_5_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTMTEMPLATE.g:461:1: ( rule__VTMTemplate__Group_5_0__2__Impl )
            // InternalTMTEMPLATE.g:462:2: rule__VTMTemplate__Group_5_0__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__VTMTemplate__Group_5_0__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VTMTemplate__Group_5_0__2"


    // $ANTLR start "rule__VTMTemplate__Group_5_0__2__Impl"
    // InternalTMTEMPLATE.g:468:1: rule__VTMTemplate__Group_5_0__2__Impl : ( '</TMTemplate>' ) ;
    public final void rule__VTMTemplate__Group_5_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTMTEMPLATE.g:472:1: ( ( '</TMTemplate>' ) )
            // InternalTMTEMPLATE.g:473:1: ( '</TMTemplate>' )
            {
            // InternalTMTEMPLATE.g:473:1: ( '</TMTemplate>' )
            // InternalTMTEMPLATE.g:474:2: '</TMTemplate>'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVTMTemplateAccess().getTMTemplateKeyword_5_0_2()); 
            }
            match(input,18,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getVTMTemplateAccess().getTMTemplateKeyword_5_0_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VTMTemplate__Group_5_0__2__Impl"


    // $ANTLR start "rule__VTMTemplate__Group_5_0_1__0"
    // InternalTMTEMPLATE.g:484:1: rule__VTMTemplate__Group_5_0_1__0 : rule__VTMTemplate__Group_5_0_1__0__Impl rule__VTMTemplate__Group_5_0_1__1 ;
    public final void rule__VTMTemplate__Group_5_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTMTEMPLATE.g:488:1: ( rule__VTMTemplate__Group_5_0_1__0__Impl rule__VTMTemplate__Group_5_0_1__1 )
            // InternalTMTEMPLATE.g:489:2: rule__VTMTemplate__Group_5_0_1__0__Impl rule__VTMTemplate__Group_5_0_1__1
            {
            pushFollow(FollowSets000.FOLLOW_8);
            rule__VTMTemplate__Group_5_0_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__VTMTemplate__Group_5_0_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VTMTemplate__Group_5_0_1__0"


    // $ANTLR start "rule__VTMTemplate__Group_5_0_1__0__Impl"
    // InternalTMTEMPLATE.g:496:1: rule__VTMTemplate__Group_5_0_1__0__Impl : ( '<Fields>' ) ;
    public final void rule__VTMTemplate__Group_5_0_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTMTEMPLATE.g:500:1: ( ( '<Fields>' ) )
            // InternalTMTEMPLATE.g:501:1: ( '<Fields>' )
            {
            // InternalTMTEMPLATE.g:501:1: ( '<Fields>' )
            // InternalTMTEMPLATE.g:502:2: '<Fields>'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVTMTemplateAccess().getFieldsKeyword_5_0_1_0()); 
            }
            match(input,19,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getVTMTemplateAccess().getFieldsKeyword_5_0_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VTMTemplate__Group_5_0_1__0__Impl"


    // $ANTLR start "rule__VTMTemplate__Group_5_0_1__1"
    // InternalTMTEMPLATE.g:511:1: rule__VTMTemplate__Group_5_0_1__1 : rule__VTMTemplate__Group_5_0_1__1__Impl rule__VTMTemplate__Group_5_0_1__2 ;
    public final void rule__VTMTemplate__Group_5_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTMTEMPLATE.g:515:1: ( rule__VTMTemplate__Group_5_0_1__1__Impl rule__VTMTemplate__Group_5_0_1__2 )
            // InternalTMTEMPLATE.g:516:2: rule__VTMTemplate__Group_5_0_1__1__Impl rule__VTMTemplate__Group_5_0_1__2
            {
            pushFollow(FollowSets000.FOLLOW_9);
            rule__VTMTemplate__Group_5_0_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__VTMTemplate__Group_5_0_1__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VTMTemplate__Group_5_0_1__1"


    // $ANTLR start "rule__VTMTemplate__Group_5_0_1__1__Impl"
    // InternalTMTEMPLATE.g:523:1: rule__VTMTemplate__Group_5_0_1__1__Impl : ( ( ( rule__VTMTemplate__FieldsAssignment_5_0_1_1 ) ) ( ( rule__VTMTemplate__FieldsAssignment_5_0_1_1 )* ) ) ;
    public final void rule__VTMTemplate__Group_5_0_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTMTEMPLATE.g:527:1: ( ( ( ( rule__VTMTemplate__FieldsAssignment_5_0_1_1 ) ) ( ( rule__VTMTemplate__FieldsAssignment_5_0_1_1 )* ) ) )
            // InternalTMTEMPLATE.g:528:1: ( ( ( rule__VTMTemplate__FieldsAssignment_5_0_1_1 ) ) ( ( rule__VTMTemplate__FieldsAssignment_5_0_1_1 )* ) )
            {
            // InternalTMTEMPLATE.g:528:1: ( ( ( rule__VTMTemplate__FieldsAssignment_5_0_1_1 ) ) ( ( rule__VTMTemplate__FieldsAssignment_5_0_1_1 )* ) )
            // InternalTMTEMPLATE.g:529:2: ( ( rule__VTMTemplate__FieldsAssignment_5_0_1_1 ) ) ( ( rule__VTMTemplate__FieldsAssignment_5_0_1_1 )* )
            {
            // InternalTMTEMPLATE.g:529:2: ( ( rule__VTMTemplate__FieldsAssignment_5_0_1_1 ) )
            // InternalTMTEMPLATE.g:530:3: ( rule__VTMTemplate__FieldsAssignment_5_0_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVTMTemplateAccess().getFieldsAssignment_5_0_1_1()); 
            }
            // InternalTMTEMPLATE.g:531:3: ( rule__VTMTemplate__FieldsAssignment_5_0_1_1 )
            // InternalTMTEMPLATE.g:531:4: rule__VTMTemplate__FieldsAssignment_5_0_1_1
            {
            pushFollow(FollowSets000.FOLLOW_10);
            rule__VTMTemplate__FieldsAssignment_5_0_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getVTMTemplateAccess().getFieldsAssignment_5_0_1_1()); 
            }

            }

            // InternalTMTEMPLATE.g:534:2: ( ( rule__VTMTemplate__FieldsAssignment_5_0_1_1 )* )
            // InternalTMTEMPLATE.g:535:3: ( rule__VTMTemplate__FieldsAssignment_5_0_1_1 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVTMTemplateAccess().getFieldsAssignment_5_0_1_1()); 
            }
            // InternalTMTEMPLATE.g:536:3: ( rule__VTMTemplate__FieldsAssignment_5_0_1_1 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==21) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalTMTEMPLATE.g:536:4: rule__VTMTemplate__FieldsAssignment_5_0_1_1
            	    {
            	    pushFollow(FollowSets000.FOLLOW_10);
            	    rule__VTMTemplate__FieldsAssignment_5_0_1_1();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getVTMTemplateAccess().getFieldsAssignment_5_0_1_1()); 
            }

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VTMTemplate__Group_5_0_1__1__Impl"


    // $ANTLR start "rule__VTMTemplate__Group_5_0_1__2"
    // InternalTMTEMPLATE.g:545:1: rule__VTMTemplate__Group_5_0_1__2 : rule__VTMTemplate__Group_5_0_1__2__Impl ;
    public final void rule__VTMTemplate__Group_5_0_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTMTEMPLATE.g:549:1: ( rule__VTMTemplate__Group_5_0_1__2__Impl )
            // InternalTMTEMPLATE.g:550:2: rule__VTMTemplate__Group_5_0_1__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__VTMTemplate__Group_5_0_1__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VTMTemplate__Group_5_0_1__2"


    // $ANTLR start "rule__VTMTemplate__Group_5_0_1__2__Impl"
    // InternalTMTEMPLATE.g:556:1: rule__VTMTemplate__Group_5_0_1__2__Impl : ( '</Fields>' ) ;
    public final void rule__VTMTemplate__Group_5_0_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTMTEMPLATE.g:560:1: ( ( '</Fields>' ) )
            // InternalTMTEMPLATE.g:561:1: ( '</Fields>' )
            {
            // InternalTMTEMPLATE.g:561:1: ( '</Fields>' )
            // InternalTMTEMPLATE.g:562:2: '</Fields>'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVTMTemplateAccess().getFieldsKeyword_5_0_1_2()); 
            }
            match(input,20,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getVTMTemplateAccess().getFieldsKeyword_5_0_1_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VTMTemplate__Group_5_0_1__2__Impl"


    // $ANTLR start "rule__VTMTemplateField__Group__0"
    // InternalTMTEMPLATE.g:572:1: rule__VTMTemplateField__Group__0 : rule__VTMTemplateField__Group__0__Impl rule__VTMTemplateField__Group__1 ;
    public final void rule__VTMTemplateField__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTMTEMPLATE.g:576:1: ( rule__VTMTemplateField__Group__0__Impl rule__VTMTemplateField__Group__1 )
            // InternalTMTEMPLATE.g:577:2: rule__VTMTemplateField__Group__0__Impl rule__VTMTemplateField__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_11);
            rule__VTMTemplateField__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__VTMTemplateField__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VTMTemplateField__Group__0"


    // $ANTLR start "rule__VTMTemplateField__Group__0__Impl"
    // InternalTMTEMPLATE.g:584:1: rule__VTMTemplateField__Group__0__Impl : ( '<Field>' ) ;
    public final void rule__VTMTemplateField__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTMTEMPLATE.g:588:1: ( ( '<Field>' ) )
            // InternalTMTEMPLATE.g:589:1: ( '<Field>' )
            {
            // InternalTMTEMPLATE.g:589:1: ( '<Field>' )
            // InternalTMTEMPLATE.g:590:2: '<Field>'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVTMTemplateFieldAccess().getFieldKeyword_0()); 
            }
            match(input,21,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getVTMTemplateFieldAccess().getFieldKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VTMTemplateField__Group__0__Impl"


    // $ANTLR start "rule__VTMTemplateField__Group__1"
    // InternalTMTEMPLATE.g:599:1: rule__VTMTemplateField__Group__1 : rule__VTMTemplateField__Group__1__Impl rule__VTMTemplateField__Group__2 ;
    public final void rule__VTMTemplateField__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTMTEMPLATE.g:603:1: ( rule__VTMTemplateField__Group__1__Impl rule__VTMTemplateField__Group__2 )
            // InternalTMTEMPLATE.g:604:2: rule__VTMTemplateField__Group__1__Impl rule__VTMTemplateField__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_3);
            rule__VTMTemplateField__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__VTMTemplateField__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VTMTemplateField__Group__1"


    // $ANTLR start "rule__VTMTemplateField__Group__1__Impl"
    // InternalTMTEMPLATE.g:611:1: rule__VTMTemplateField__Group__1__Impl : ( '<fieldRef' ) ;
    public final void rule__VTMTemplateField__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTMTEMPLATE.g:615:1: ( ( '<fieldRef' ) )
            // InternalTMTEMPLATE.g:616:1: ( '<fieldRef' )
            {
            // InternalTMTEMPLATE.g:616:1: ( '<fieldRef' )
            // InternalTMTEMPLATE.g:617:2: '<fieldRef'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVTMTemplateFieldAccess().getFieldRefKeyword_1()); 
            }
            match(input,22,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getVTMTemplateFieldAccess().getFieldRefKeyword_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VTMTemplateField__Group__1__Impl"


    // $ANTLR start "rule__VTMTemplateField__Group__2"
    // InternalTMTEMPLATE.g:626:1: rule__VTMTemplateField__Group__2 : rule__VTMTemplateField__Group__2__Impl rule__VTMTemplateField__Group__3 ;
    public final void rule__VTMTemplateField__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTMTEMPLATE.g:630:1: ( rule__VTMTemplateField__Group__2__Impl rule__VTMTemplateField__Group__3 )
            // InternalTMTEMPLATE.g:631:2: rule__VTMTemplateField__Group__2__Impl rule__VTMTemplateField__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_4);
            rule__VTMTemplateField__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__VTMTemplateField__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VTMTemplateField__Group__2"


    // $ANTLR start "rule__VTMTemplateField__Group__2__Impl"
    // InternalTMTEMPLATE.g:638:1: rule__VTMTemplateField__Group__2__Impl : ( 'name=' ) ;
    public final void rule__VTMTemplateField__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTMTEMPLATE.g:642:1: ( ( 'name=' ) )
            // InternalTMTEMPLATE.g:643:1: ( 'name=' )
            {
            // InternalTMTEMPLATE.g:643:1: ( 'name=' )
            // InternalTMTEMPLATE.g:644:2: 'name='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVTMTemplateFieldAccess().getNameKeyword_2()); 
            }
            match(input,15,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getVTMTemplateFieldAccess().getNameKeyword_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VTMTemplateField__Group__2__Impl"


    // $ANTLR start "rule__VTMTemplateField__Group__3"
    // InternalTMTEMPLATE.g:653:1: rule__VTMTemplateField__Group__3 : rule__VTMTemplateField__Group__3__Impl rule__VTMTemplateField__Group__4 ;
    public final void rule__VTMTemplateField__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTMTEMPLATE.g:657:1: ( rule__VTMTemplateField__Group__3__Impl rule__VTMTemplateField__Group__4 )
            // InternalTMTEMPLATE.g:658:2: rule__VTMTemplateField__Group__3__Impl rule__VTMTemplateField__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_12);
            rule__VTMTemplateField__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__VTMTemplateField__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VTMTemplateField__Group__3"


    // $ANTLR start "rule__VTMTemplateField__Group__3__Impl"
    // InternalTMTEMPLATE.g:665:1: rule__VTMTemplateField__Group__3__Impl : ( ( rule__VTMTemplateField__FieldRefAssignment_3 ) ) ;
    public final void rule__VTMTemplateField__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTMTEMPLATE.g:669:1: ( ( ( rule__VTMTemplateField__FieldRefAssignment_3 ) ) )
            // InternalTMTEMPLATE.g:670:1: ( ( rule__VTMTemplateField__FieldRefAssignment_3 ) )
            {
            // InternalTMTEMPLATE.g:670:1: ( ( rule__VTMTemplateField__FieldRefAssignment_3 ) )
            // InternalTMTEMPLATE.g:671:2: ( rule__VTMTemplateField__FieldRefAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVTMTemplateFieldAccess().getFieldRefAssignment_3()); 
            }
            // InternalTMTEMPLATE.g:672:2: ( rule__VTMTemplateField__FieldRefAssignment_3 )
            // InternalTMTEMPLATE.g:672:3: rule__VTMTemplateField__FieldRefAssignment_3
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__VTMTemplateField__FieldRefAssignment_3();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getVTMTemplateFieldAccess().getFieldRefAssignment_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VTMTemplateField__Group__3__Impl"


    // $ANTLR start "rule__VTMTemplateField__Group__4"
    // InternalTMTEMPLATE.g:680:1: rule__VTMTemplateField__Group__4 : rule__VTMTemplateField__Group__4__Impl rule__VTMTemplateField__Group__5 ;
    public final void rule__VTMTemplateField__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTMTEMPLATE.g:684:1: ( rule__VTMTemplateField__Group__4__Impl rule__VTMTemplateField__Group__5 )
            // InternalTMTEMPLATE.g:685:2: rule__VTMTemplateField__Group__4__Impl rule__VTMTemplateField__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_13);
            rule__VTMTemplateField__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__VTMTemplateField__Group__5();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VTMTemplateField__Group__4"


    // $ANTLR start "rule__VTMTemplateField__Group__4__Impl"
    // InternalTMTEMPLATE.g:692:1: rule__VTMTemplateField__Group__4__Impl : ( '/>' ) ;
    public final void rule__VTMTemplateField__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTMTEMPLATE.g:696:1: ( ( '/>' ) )
            // InternalTMTEMPLATE.g:697:1: ( '/>' )
            {
            // InternalTMTEMPLATE.g:697:1: ( '/>' )
            // InternalTMTEMPLATE.g:698:2: '/>'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVTMTemplateFieldAccess().getSolidusGreaterThanSignKeyword_4()); 
            }
            match(input,13,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getVTMTemplateFieldAccess().getSolidusGreaterThanSignKeyword_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VTMTemplateField__Group__4__Impl"


    // $ANTLR start "rule__VTMTemplateField__Group__5"
    // InternalTMTEMPLATE.g:707:1: rule__VTMTemplateField__Group__5 : rule__VTMTemplateField__Group__5__Impl rule__VTMTemplateField__Group__6 ;
    public final void rule__VTMTemplateField__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTMTEMPLATE.g:711:1: ( rule__VTMTemplateField__Group__5__Impl rule__VTMTemplateField__Group__6 )
            // InternalTMTEMPLATE.g:712:2: rule__VTMTemplateField__Group__5__Impl rule__VTMTemplateField__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_14);
            rule__VTMTemplateField__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__VTMTemplateField__Group__6();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VTMTemplateField__Group__5"


    // $ANTLR start "rule__VTMTemplateField__Group__5__Impl"
    // InternalTMTEMPLATE.g:719:1: rule__VTMTemplateField__Group__5__Impl : ( ( rule__VTMTemplateField__ValueAssignment_5 ) ) ;
    public final void rule__VTMTemplateField__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTMTEMPLATE.g:723:1: ( ( ( rule__VTMTemplateField__ValueAssignment_5 ) ) )
            // InternalTMTEMPLATE.g:724:1: ( ( rule__VTMTemplateField__ValueAssignment_5 ) )
            {
            // InternalTMTEMPLATE.g:724:1: ( ( rule__VTMTemplateField__ValueAssignment_5 ) )
            // InternalTMTEMPLATE.g:725:2: ( rule__VTMTemplateField__ValueAssignment_5 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVTMTemplateFieldAccess().getValueAssignment_5()); 
            }
            // InternalTMTEMPLATE.g:726:2: ( rule__VTMTemplateField__ValueAssignment_5 )
            // InternalTMTEMPLATE.g:726:3: rule__VTMTemplateField__ValueAssignment_5
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__VTMTemplateField__ValueAssignment_5();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getVTMTemplateFieldAccess().getValueAssignment_5()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VTMTemplateField__Group__5__Impl"


    // $ANTLR start "rule__VTMTemplateField__Group__6"
    // InternalTMTEMPLATE.g:734:1: rule__VTMTemplateField__Group__6 : rule__VTMTemplateField__Group__6__Impl ;
    public final void rule__VTMTemplateField__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTMTEMPLATE.g:738:1: ( rule__VTMTemplateField__Group__6__Impl )
            // InternalTMTEMPLATE.g:739:2: rule__VTMTemplateField__Group__6__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__VTMTemplateField__Group__6__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VTMTemplateField__Group__6"


    // $ANTLR start "rule__VTMTemplateField__Group__6__Impl"
    // InternalTMTEMPLATE.g:745:1: rule__VTMTemplateField__Group__6__Impl : ( '</Field>' ) ;
    public final void rule__VTMTemplateField__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTMTEMPLATE.g:749:1: ( ( '</Field>' ) )
            // InternalTMTEMPLATE.g:750:1: ( '</Field>' )
            {
            // InternalTMTEMPLATE.g:750:1: ( '</Field>' )
            // InternalTMTEMPLATE.g:751:2: '</Field>'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVTMTemplateFieldAccess().getFieldKeyword_6()); 
            }
            match(input,23,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getVTMTemplateFieldAccess().getFieldKeyword_6()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VTMTemplateField__Group__6__Impl"


    // $ANTLR start "rule__TMTCIFFieldValueRaw__Group__0"
    // InternalTMTEMPLATE.g:761:1: rule__TMTCIFFieldValueRaw__Group__0 : rule__TMTCIFFieldValueRaw__Group__0__Impl rule__TMTCIFFieldValueRaw__Group__1 ;
    public final void rule__TMTCIFFieldValueRaw__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTMTEMPLATE.g:765:1: ( rule__TMTCIFFieldValueRaw__Group__0__Impl rule__TMTCIFFieldValueRaw__Group__1 )
            // InternalTMTEMPLATE.g:766:2: rule__TMTCIFFieldValueRaw__Group__0__Impl rule__TMTCIFFieldValueRaw__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_15);
            rule__TMTCIFFieldValueRaw__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TMTCIFFieldValueRaw__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TMTCIFFieldValueRaw__Group__0"


    // $ANTLR start "rule__TMTCIFFieldValueRaw__Group__0__Impl"
    // InternalTMTEMPLATE.g:773:1: rule__TMTCIFFieldValueRaw__Group__0__Impl : ( '<FieldValueRaw' ) ;
    public final void rule__TMTCIFFieldValueRaw__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTMTEMPLATE.g:777:1: ( ( '<FieldValueRaw' ) )
            // InternalTMTEMPLATE.g:778:1: ( '<FieldValueRaw' )
            {
            // InternalTMTEMPLATE.g:778:1: ( '<FieldValueRaw' )
            // InternalTMTEMPLATE.g:779:2: '<FieldValueRaw'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFFieldValueRawAccess().getFieldValueRawKeyword_0()); 
            }
            match(input,24,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFFieldValueRawAccess().getFieldValueRawKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TMTCIFFieldValueRaw__Group__0__Impl"


    // $ANTLR start "rule__TMTCIFFieldValueRaw__Group__1"
    // InternalTMTEMPLATE.g:788:1: rule__TMTCIFFieldValueRaw__Group__1 : rule__TMTCIFFieldValueRaw__Group__1__Impl rule__TMTCIFFieldValueRaw__Group__2 ;
    public final void rule__TMTCIFFieldValueRaw__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTMTEMPLATE.g:792:1: ( rule__TMTCIFFieldValueRaw__Group__1__Impl rule__TMTCIFFieldValueRaw__Group__2 )
            // InternalTMTEMPLATE.g:793:2: rule__TMTCIFFieldValueRaw__Group__1__Impl rule__TMTCIFFieldValueRaw__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_16);
            rule__TMTCIFFieldValueRaw__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TMTCIFFieldValueRaw__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TMTCIFFieldValueRaw__Group__1"


    // $ANTLR start "rule__TMTCIFFieldValueRaw__Group__1__Impl"
    // InternalTMTEMPLATE.g:800:1: rule__TMTCIFFieldValueRaw__Group__1__Impl : ( 'value=' ) ;
    public final void rule__TMTCIFFieldValueRaw__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTMTEMPLATE.g:804:1: ( ( 'value=' ) )
            // InternalTMTEMPLATE.g:805:1: ( 'value=' )
            {
            // InternalTMTEMPLATE.g:805:1: ( 'value=' )
            // InternalTMTEMPLATE.g:806:2: 'value='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFFieldValueRawAccess().getValueKeyword_1()); 
            }
            match(input,25,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFFieldValueRawAccess().getValueKeyword_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TMTCIFFieldValueRaw__Group__1__Impl"


    // $ANTLR start "rule__TMTCIFFieldValueRaw__Group__2"
    // InternalTMTEMPLATE.g:815:1: rule__TMTCIFFieldValueRaw__Group__2 : rule__TMTCIFFieldValueRaw__Group__2__Impl rule__TMTCIFFieldValueRaw__Group__3 ;
    public final void rule__TMTCIFFieldValueRaw__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTMTEMPLATE.g:819:1: ( rule__TMTCIFFieldValueRaw__Group__2__Impl rule__TMTCIFFieldValueRaw__Group__3 )
            // InternalTMTEMPLATE.g:820:2: rule__TMTCIFFieldValueRaw__Group__2__Impl rule__TMTCIFFieldValueRaw__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_12);
            rule__TMTCIFFieldValueRaw__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TMTCIFFieldValueRaw__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TMTCIFFieldValueRaw__Group__2"


    // $ANTLR start "rule__TMTCIFFieldValueRaw__Group__2__Impl"
    // InternalTMTEMPLATE.g:827:1: rule__TMTCIFFieldValueRaw__Group__2__Impl : ( ( rule__TMTCIFFieldValueRaw__ValueAssignment_2 ) ) ;
    public final void rule__TMTCIFFieldValueRaw__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTMTEMPLATE.g:831:1: ( ( ( rule__TMTCIFFieldValueRaw__ValueAssignment_2 ) ) )
            // InternalTMTEMPLATE.g:832:1: ( ( rule__TMTCIFFieldValueRaw__ValueAssignment_2 ) )
            {
            // InternalTMTEMPLATE.g:832:1: ( ( rule__TMTCIFFieldValueRaw__ValueAssignment_2 ) )
            // InternalTMTEMPLATE.g:833:2: ( rule__TMTCIFFieldValueRaw__ValueAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFFieldValueRawAccess().getValueAssignment_2()); 
            }
            // InternalTMTEMPLATE.g:834:2: ( rule__TMTCIFFieldValueRaw__ValueAssignment_2 )
            // InternalTMTEMPLATE.g:834:3: rule__TMTCIFFieldValueRaw__ValueAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TMTCIFFieldValueRaw__ValueAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFFieldValueRawAccess().getValueAssignment_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TMTCIFFieldValueRaw__Group__2__Impl"


    // $ANTLR start "rule__TMTCIFFieldValueRaw__Group__3"
    // InternalTMTEMPLATE.g:842:1: rule__TMTCIFFieldValueRaw__Group__3 : rule__TMTCIFFieldValueRaw__Group__3__Impl ;
    public final void rule__TMTCIFFieldValueRaw__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTMTEMPLATE.g:846:1: ( rule__TMTCIFFieldValueRaw__Group__3__Impl )
            // InternalTMTEMPLATE.g:847:2: rule__TMTCIFFieldValueRaw__Group__3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TMTCIFFieldValueRaw__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TMTCIFFieldValueRaw__Group__3"


    // $ANTLR start "rule__TMTCIFFieldValueRaw__Group__3__Impl"
    // InternalTMTEMPLATE.g:853:1: rule__TMTCIFFieldValueRaw__Group__3__Impl : ( '/>' ) ;
    public final void rule__TMTCIFFieldValueRaw__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTMTEMPLATE.g:857:1: ( ( '/>' ) )
            // InternalTMTEMPLATE.g:858:1: ( '/>' )
            {
            // InternalTMTEMPLATE.g:858:1: ( '/>' )
            // InternalTMTEMPLATE.g:859:2: '/>'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFFieldValueRawAccess().getSolidusGreaterThanSignKeyword_3()); 
            }
            match(input,13,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFFieldValueRawAccess().getSolidusGreaterThanSignKeyword_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TMTCIFFieldValueRaw__Group__3__Impl"


    // $ANTLR start "rule__TMTCIFFieldValueFile__Group__0"
    // InternalTMTEMPLATE.g:869:1: rule__TMTCIFFieldValueFile__Group__0 : rule__TMTCIFFieldValueFile__Group__0__Impl rule__TMTCIFFieldValueFile__Group__1 ;
    public final void rule__TMTCIFFieldValueFile__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTMTEMPLATE.g:873:1: ( rule__TMTCIFFieldValueFile__Group__0__Impl rule__TMTCIFFieldValueFile__Group__1 )
            // InternalTMTEMPLATE.g:874:2: rule__TMTCIFFieldValueFile__Group__0__Impl rule__TMTCIFFieldValueFile__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_17);
            rule__TMTCIFFieldValueFile__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TMTCIFFieldValueFile__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TMTCIFFieldValueFile__Group__0"


    // $ANTLR start "rule__TMTCIFFieldValueFile__Group__0__Impl"
    // InternalTMTEMPLATE.g:881:1: rule__TMTCIFFieldValueFile__Group__0__Impl : ( '<FieldValueFile' ) ;
    public final void rule__TMTCIFFieldValueFile__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTMTEMPLATE.g:885:1: ( ( '<FieldValueFile' ) )
            // InternalTMTEMPLATE.g:886:1: ( '<FieldValueFile' )
            {
            // InternalTMTEMPLATE.g:886:1: ( '<FieldValueFile' )
            // InternalTMTEMPLATE.g:887:2: '<FieldValueFile'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFFieldValueFileAccess().getFieldValueFileKeyword_0()); 
            }
            match(input,26,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFFieldValueFileAccess().getFieldValueFileKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TMTCIFFieldValueFile__Group__0__Impl"


    // $ANTLR start "rule__TMTCIFFieldValueFile__Group__1"
    // InternalTMTEMPLATE.g:896:1: rule__TMTCIFFieldValueFile__Group__1 : rule__TMTCIFFieldValueFile__Group__1__Impl rule__TMTCIFFieldValueFile__Group__2 ;
    public final void rule__TMTCIFFieldValueFile__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTMTEMPLATE.g:900:1: ( rule__TMTCIFFieldValueFile__Group__1__Impl rule__TMTCIFFieldValueFile__Group__2 )
            // InternalTMTEMPLATE.g:901:2: rule__TMTCIFFieldValueFile__Group__1__Impl rule__TMTCIFFieldValueFile__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_4);
            rule__TMTCIFFieldValueFile__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TMTCIFFieldValueFile__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TMTCIFFieldValueFile__Group__1"


    // $ANTLR start "rule__TMTCIFFieldValueFile__Group__1__Impl"
    // InternalTMTEMPLATE.g:908:1: rule__TMTCIFFieldValueFile__Group__1__Impl : ( 'filename=' ) ;
    public final void rule__TMTCIFFieldValueFile__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTMTEMPLATE.g:912:1: ( ( 'filename=' ) )
            // InternalTMTEMPLATE.g:913:1: ( 'filename=' )
            {
            // InternalTMTEMPLATE.g:913:1: ( 'filename=' )
            // InternalTMTEMPLATE.g:914:2: 'filename='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFFieldValueFileAccess().getFilenameKeyword_1()); 
            }
            match(input,27,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFFieldValueFileAccess().getFilenameKeyword_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TMTCIFFieldValueFile__Group__1__Impl"


    // $ANTLR start "rule__TMTCIFFieldValueFile__Group__2"
    // InternalTMTEMPLATE.g:923:1: rule__TMTCIFFieldValueFile__Group__2 : rule__TMTCIFFieldValueFile__Group__2__Impl rule__TMTCIFFieldValueFile__Group__3 ;
    public final void rule__TMTCIFFieldValueFile__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTMTEMPLATE.g:927:1: ( rule__TMTCIFFieldValueFile__Group__2__Impl rule__TMTCIFFieldValueFile__Group__3 )
            // InternalTMTEMPLATE.g:928:2: rule__TMTCIFFieldValueFile__Group__2__Impl rule__TMTCIFFieldValueFile__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_12);
            rule__TMTCIFFieldValueFile__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TMTCIFFieldValueFile__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TMTCIFFieldValueFile__Group__2"


    // $ANTLR start "rule__TMTCIFFieldValueFile__Group__2__Impl"
    // InternalTMTEMPLATE.g:935:1: rule__TMTCIFFieldValueFile__Group__2__Impl : ( ( rule__TMTCIFFieldValueFile__FilenameAssignment_2 ) ) ;
    public final void rule__TMTCIFFieldValueFile__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTMTEMPLATE.g:939:1: ( ( ( rule__TMTCIFFieldValueFile__FilenameAssignment_2 ) ) )
            // InternalTMTEMPLATE.g:940:1: ( ( rule__TMTCIFFieldValueFile__FilenameAssignment_2 ) )
            {
            // InternalTMTEMPLATE.g:940:1: ( ( rule__TMTCIFFieldValueFile__FilenameAssignment_2 ) )
            // InternalTMTEMPLATE.g:941:2: ( rule__TMTCIFFieldValueFile__FilenameAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFFieldValueFileAccess().getFilenameAssignment_2()); 
            }
            // InternalTMTEMPLATE.g:942:2: ( rule__TMTCIFFieldValueFile__FilenameAssignment_2 )
            // InternalTMTEMPLATE.g:942:3: rule__TMTCIFFieldValueFile__FilenameAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TMTCIFFieldValueFile__FilenameAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFFieldValueFileAccess().getFilenameAssignment_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TMTCIFFieldValueFile__Group__2__Impl"


    // $ANTLR start "rule__TMTCIFFieldValueFile__Group__3"
    // InternalTMTEMPLATE.g:950:1: rule__TMTCIFFieldValueFile__Group__3 : rule__TMTCIFFieldValueFile__Group__3__Impl ;
    public final void rule__TMTCIFFieldValueFile__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTMTEMPLATE.g:954:1: ( rule__TMTCIFFieldValueFile__Group__3__Impl )
            // InternalTMTEMPLATE.g:955:2: rule__TMTCIFFieldValueFile__Group__3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TMTCIFFieldValueFile__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TMTCIFFieldValueFile__Group__3"


    // $ANTLR start "rule__TMTCIFFieldValueFile__Group__3__Impl"
    // InternalTMTEMPLATE.g:961:1: rule__TMTCIFFieldValueFile__Group__3__Impl : ( '/>' ) ;
    public final void rule__TMTCIFFieldValueFile__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTMTEMPLATE.g:965:1: ( ( '/>' ) )
            // InternalTMTEMPLATE.g:966:1: ( '/>' )
            {
            // InternalTMTEMPLATE.g:966:1: ( '/>' )
            // InternalTMTEMPLATE.g:967:2: '/>'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFFieldValueFileAccess().getSolidusGreaterThanSignKeyword_3()); 
            }
            match(input,13,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFFieldValueFileAccess().getSolidusGreaterThanSignKeyword_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TMTCIFFieldValueFile__Group__3__Impl"


    // $ANTLR start "rule__VTMTemplate__NameAssignment_2"
    // InternalTMTEMPLATE.g:977:1: rule__VTMTemplate__NameAssignment_2 : ( RULE_STRING ) ;
    public final void rule__VTMTemplate__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTMTEMPLATE.g:981:1: ( ( RULE_STRING ) )
            // InternalTMTEMPLATE.g:982:2: ( RULE_STRING )
            {
            // InternalTMTEMPLATE.g:982:2: ( RULE_STRING )
            // InternalTMTEMPLATE.g:983:3: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVTMTemplateAccess().getNameSTRINGTerminalRuleCall_2_0()); 
            }
            match(input,RULE_STRING,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getVTMTemplateAccess().getNameSTRINGTerminalRuleCall_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VTMTemplate__NameAssignment_2"


    // $ANTLR start "rule__VTMTemplate__TmOutputAssignment_4"
    // InternalTMTEMPLATE.g:992:1: rule__VTMTemplate__TmOutputAssignment_4 : ( ( RULE_STRING ) ) ;
    public final void rule__VTMTemplate__TmOutputAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTMTEMPLATE.g:996:1: ( ( ( RULE_STRING ) ) )
            // InternalTMTEMPLATE.g:997:2: ( ( RULE_STRING ) )
            {
            // InternalTMTEMPLATE.g:997:2: ( ( RULE_STRING ) )
            // InternalTMTEMPLATE.g:998:3: ( RULE_STRING )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVTMTemplateAccess().getTmOutputTMTCIFTMCrossReference_4_0()); 
            }
            // InternalTMTEMPLATE.g:999:3: ( RULE_STRING )
            // InternalTMTEMPLATE.g:1000:4: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVTMTemplateAccess().getTmOutputTMTCIFTMSTRINGTerminalRuleCall_4_0_1()); 
            }
            match(input,RULE_STRING,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getVTMTemplateAccess().getTmOutputTMTCIFTMSTRINGTerminalRuleCall_4_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getVTMTemplateAccess().getTmOutputTMTCIFTMCrossReference_4_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VTMTemplate__TmOutputAssignment_4"


    // $ANTLR start "rule__VTMTemplate__FieldsAssignment_5_0_1_1"
    // InternalTMTEMPLATE.g:1011:1: rule__VTMTemplate__FieldsAssignment_5_0_1_1 : ( ruleVTMTemplateField ) ;
    public final void rule__VTMTemplate__FieldsAssignment_5_0_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTMTEMPLATE.g:1015:1: ( ( ruleVTMTemplateField ) )
            // InternalTMTEMPLATE.g:1016:2: ( ruleVTMTemplateField )
            {
            // InternalTMTEMPLATE.g:1016:2: ( ruleVTMTemplateField )
            // InternalTMTEMPLATE.g:1017:3: ruleVTMTemplateField
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVTMTemplateAccess().getFieldsVTMTemplateFieldParserRuleCall_5_0_1_1_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleVTMTemplateField();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getVTMTemplateAccess().getFieldsVTMTemplateFieldParserRuleCall_5_0_1_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VTMTemplate__FieldsAssignment_5_0_1_1"


    // $ANTLR start "rule__VTMTemplateField__FieldRefAssignment_3"
    // InternalTMTEMPLATE.g:1026:1: rule__VTMTemplateField__FieldRefAssignment_3 : ( ( RULE_STRING ) ) ;
    public final void rule__VTMTemplateField__FieldRefAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTMTEMPLATE.g:1030:1: ( ( ( RULE_STRING ) ) )
            // InternalTMTEMPLATE.g:1031:2: ( ( RULE_STRING ) )
            {
            // InternalTMTEMPLATE.g:1031:2: ( ( RULE_STRING ) )
            // InternalTMTEMPLATE.g:1032:3: ( RULE_STRING )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVTMTemplateFieldAccess().getFieldRefTMTCIFTMFieldCrossReference_3_0()); 
            }
            // InternalTMTEMPLATE.g:1033:3: ( RULE_STRING )
            // InternalTMTEMPLATE.g:1034:4: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVTMTemplateFieldAccess().getFieldRefTMTCIFTMFieldSTRINGTerminalRuleCall_3_0_1()); 
            }
            match(input,RULE_STRING,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getVTMTemplateFieldAccess().getFieldRefTMTCIFTMFieldSTRINGTerminalRuleCall_3_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getVTMTemplateFieldAccess().getFieldRefTMTCIFTMFieldCrossReference_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VTMTemplateField__FieldRefAssignment_3"


    // $ANTLR start "rule__VTMTemplateField__ValueAssignment_5"
    // InternalTMTEMPLATE.g:1045:1: rule__VTMTemplateField__ValueAssignment_5 : ( ruleTMTCIFFieldValue ) ;
    public final void rule__VTMTemplateField__ValueAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTMTEMPLATE.g:1049:1: ( ( ruleTMTCIFFieldValue ) )
            // InternalTMTEMPLATE.g:1050:2: ( ruleTMTCIFFieldValue )
            {
            // InternalTMTEMPLATE.g:1050:2: ( ruleTMTCIFFieldValue )
            // InternalTMTEMPLATE.g:1051:3: ruleTMTCIFFieldValue
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVTMTemplateFieldAccess().getValueTMTCIFFieldValueParserRuleCall_5_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleTMTCIFFieldValue();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getVTMTemplateFieldAccess().getValueTMTCIFFieldValueParserRuleCall_5_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VTMTemplateField__ValueAssignment_5"


    // $ANTLR start "rule__TMTCIFFieldValueRaw__ValueAssignment_2"
    // InternalTMTEMPLATE.g:1060:1: rule__TMTCIFFieldValueRaw__ValueAssignment_2 : ( ( rule__TMTCIFFieldValueRaw__ValueAlternatives_2_0 ) ) ;
    public final void rule__TMTCIFFieldValueRaw__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTMTEMPLATE.g:1064:1: ( ( ( rule__TMTCIFFieldValueRaw__ValueAlternatives_2_0 ) ) )
            // InternalTMTEMPLATE.g:1065:2: ( ( rule__TMTCIFFieldValueRaw__ValueAlternatives_2_0 ) )
            {
            // InternalTMTEMPLATE.g:1065:2: ( ( rule__TMTCIFFieldValueRaw__ValueAlternatives_2_0 ) )
            // InternalTMTEMPLATE.g:1066:3: ( rule__TMTCIFFieldValueRaw__ValueAlternatives_2_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFFieldValueRawAccess().getValueAlternatives_2_0()); 
            }
            // InternalTMTEMPLATE.g:1067:3: ( rule__TMTCIFFieldValueRaw__ValueAlternatives_2_0 )
            // InternalTMTEMPLATE.g:1067:4: rule__TMTCIFFieldValueRaw__ValueAlternatives_2_0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TMTCIFFieldValueRaw__ValueAlternatives_2_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFFieldValueRawAccess().getValueAlternatives_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TMTCIFFieldValueRaw__ValueAssignment_2"


    // $ANTLR start "rule__TMTCIFFieldValueFile__FilenameAssignment_2"
    // InternalTMTEMPLATE.g:1075:1: rule__TMTCIFFieldValueFile__FilenameAssignment_2 : ( RULE_STRING ) ;
    public final void rule__TMTCIFFieldValueFile__FilenameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTMTEMPLATE.g:1079:1: ( ( RULE_STRING ) )
            // InternalTMTEMPLATE.g:1080:2: ( RULE_STRING )
            {
            // InternalTMTEMPLATE.g:1080:2: ( RULE_STRING )
            // InternalTMTEMPLATE.g:1081:3: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFFieldValueFileAccess().getFilenameSTRINGTerminalRuleCall_2_0()); 
            }
            match(input,RULE_STRING,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFFieldValueFileAccess().getFilenameSTRINGTerminalRuleCall_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TMTCIFFieldValueFile__FilenameAssignment_2"

    // Delegated rules


 

    
    private static class FollowSets000 {
        public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000040L});
        public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000022000L});
        public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x00000000000C0000L});
        public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000200000L});
        public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000100000L});
        public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000200002L});
        public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000400000L});
        public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000005000000L});
        public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000800000L});
        public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000002000000L});
        public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000008000000L});
    }


}