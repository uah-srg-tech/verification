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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_UINT_STRING", "RULE_HEX_STRING", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'/>'", "'<TMTemplate'", "'name='", "'tm='", "'>'", "'</TMTemplate>'", "'<Fields>'", "'</Fields>'", "'<Field'", "'fieldRef='", "'</Field>'", "'<FieldValueRaw'", "'value='", "'<FieldValueFile'", "'filename='", "'<FieldValueEnum'", "'enumRef='", "'valueRef='"
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


    // $ANTLR start "entryRuleTMTCIFFieldValueEnum"
    // InternalTMTEMPLATE.g:179:1: entryRuleTMTCIFFieldValueEnum : ruleTMTCIFFieldValueEnum EOF ;
    public final void entryRuleTMTCIFFieldValueEnum() throws RecognitionException {
        try {
            // InternalTMTEMPLATE.g:180:1: ( ruleTMTCIFFieldValueEnum EOF )
            // InternalTMTEMPLATE.g:181:1: ruleTMTCIFFieldValueEnum EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFFieldValueEnumRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            ruleTMTCIFFieldValueEnum();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFFieldValueEnumRule()); 
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
    // $ANTLR end "entryRuleTMTCIFFieldValueEnum"


    // $ANTLR start "ruleTMTCIFFieldValueEnum"
    // InternalTMTEMPLATE.g:188:1: ruleTMTCIFFieldValueEnum : ( ( rule__TMTCIFFieldValueEnum__Group__0 ) ) ;
    public final void ruleTMTCIFFieldValueEnum() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTMTEMPLATE.g:192:2: ( ( ( rule__TMTCIFFieldValueEnum__Group__0 ) ) )
            // InternalTMTEMPLATE.g:193:2: ( ( rule__TMTCIFFieldValueEnum__Group__0 ) )
            {
            // InternalTMTEMPLATE.g:193:2: ( ( rule__TMTCIFFieldValueEnum__Group__0 ) )
            // InternalTMTEMPLATE.g:194:3: ( rule__TMTCIFFieldValueEnum__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFFieldValueEnumAccess().getGroup()); 
            }
            // InternalTMTEMPLATE.g:195:3: ( rule__TMTCIFFieldValueEnum__Group__0 )
            // InternalTMTEMPLATE.g:195:4: rule__TMTCIFFieldValueEnum__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TMTCIFFieldValueEnum__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFFieldValueEnumAccess().getGroup()); 
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
    // $ANTLR end "ruleTMTCIFFieldValueEnum"


    // $ANTLR start "rule__VTMTemplate__Alternatives_5"
    // InternalTMTEMPLATE.g:203:1: rule__VTMTemplate__Alternatives_5 : ( ( ( rule__VTMTemplate__Group_5_0__0 ) ) | ( '/>' ) );
    public final void rule__VTMTemplate__Alternatives_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTMTEMPLATE.g:207:1: ( ( ( rule__VTMTemplate__Group_5_0__0 ) ) | ( '/>' ) )
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
                    // InternalTMTEMPLATE.g:208:2: ( ( rule__VTMTemplate__Group_5_0__0 ) )
                    {
                    // InternalTMTEMPLATE.g:208:2: ( ( rule__VTMTemplate__Group_5_0__0 ) )
                    // InternalTMTEMPLATE.g:209:3: ( rule__VTMTemplate__Group_5_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getVTMTemplateAccess().getGroup_5_0()); 
                    }
                    // InternalTMTEMPLATE.g:210:3: ( rule__VTMTemplate__Group_5_0__0 )
                    // InternalTMTEMPLATE.g:210:4: rule__VTMTemplate__Group_5_0__0
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
                    // InternalTMTEMPLATE.g:214:2: ( '/>' )
                    {
                    // InternalTMTEMPLATE.g:214:2: ( '/>' )
                    // InternalTMTEMPLATE.g:215:3: '/>'
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
    // InternalTMTEMPLATE.g:224:1: rule__TMTCIFFieldValue__Alternatives : ( ( ruleTMTCIFFieldValueRaw ) | ( ruleTMTCIFFieldValueFile ) | ( ruleTMTCIFFieldValueEnum ) );
    public final void rule__TMTCIFFieldValue__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTMTEMPLATE.g:228:1: ( ( ruleTMTCIFFieldValueRaw ) | ( ruleTMTCIFFieldValueFile ) | ( ruleTMTCIFFieldValueEnum ) )
            int alt2=3;
            switch ( input.LA(1) ) {
            case 24:
                {
                alt2=1;
                }
                break;
            case 26:
                {
                alt2=2;
                }
                break;
            case 28:
                {
                alt2=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalTMTEMPLATE.g:229:2: ( ruleTMTCIFFieldValueRaw )
                    {
                    // InternalTMTEMPLATE.g:229:2: ( ruleTMTCIFFieldValueRaw )
                    // InternalTMTEMPLATE.g:230:3: ruleTMTCIFFieldValueRaw
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
                    // InternalTMTEMPLATE.g:235:2: ( ruleTMTCIFFieldValueFile )
                    {
                    // InternalTMTEMPLATE.g:235:2: ( ruleTMTCIFFieldValueFile )
                    // InternalTMTEMPLATE.g:236:3: ruleTMTCIFFieldValueFile
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
                case 3 :
                    // InternalTMTEMPLATE.g:241:2: ( ruleTMTCIFFieldValueEnum )
                    {
                    // InternalTMTEMPLATE.g:241:2: ( ruleTMTCIFFieldValueEnum )
                    // InternalTMTEMPLATE.g:242:3: ruleTMTCIFFieldValueEnum
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getTMTCIFFieldValueAccess().getTMTCIFFieldValueEnumParserRuleCall_2()); 
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    ruleTMTCIFFieldValueEnum();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getTMTCIFFieldValueAccess().getTMTCIFFieldValueEnumParserRuleCall_2()); 
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
    // InternalTMTEMPLATE.g:251:1: rule__TMTCIFFieldValueRaw__ValueAlternatives_2_0 : ( ( RULE_UINT_STRING ) | ( RULE_HEX_STRING ) );
    public final void rule__TMTCIFFieldValueRaw__ValueAlternatives_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTMTEMPLATE.g:255:1: ( ( RULE_UINT_STRING ) | ( RULE_HEX_STRING ) )
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
                    // InternalTMTEMPLATE.g:256:2: ( RULE_UINT_STRING )
                    {
                    // InternalTMTEMPLATE.g:256:2: ( RULE_UINT_STRING )
                    // InternalTMTEMPLATE.g:257:3: RULE_UINT_STRING
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
                    // InternalTMTEMPLATE.g:262:2: ( RULE_HEX_STRING )
                    {
                    // InternalTMTEMPLATE.g:262:2: ( RULE_HEX_STRING )
                    // InternalTMTEMPLATE.g:263:3: RULE_HEX_STRING
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
    // InternalTMTEMPLATE.g:272:1: rule__VTMTemplate__Group__0 : rule__VTMTemplate__Group__0__Impl rule__VTMTemplate__Group__1 ;
    public final void rule__VTMTemplate__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTMTEMPLATE.g:276:1: ( rule__VTMTemplate__Group__0__Impl rule__VTMTemplate__Group__1 )
            // InternalTMTEMPLATE.g:277:2: rule__VTMTemplate__Group__0__Impl rule__VTMTemplate__Group__1
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
    // InternalTMTEMPLATE.g:284:1: rule__VTMTemplate__Group__0__Impl : ( '<TMTemplate' ) ;
    public final void rule__VTMTemplate__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTMTEMPLATE.g:288:1: ( ( '<TMTemplate' ) )
            // InternalTMTEMPLATE.g:289:1: ( '<TMTemplate' )
            {
            // InternalTMTEMPLATE.g:289:1: ( '<TMTemplate' )
            // InternalTMTEMPLATE.g:290:2: '<TMTemplate'
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
    // InternalTMTEMPLATE.g:299:1: rule__VTMTemplate__Group__1 : rule__VTMTemplate__Group__1__Impl rule__VTMTemplate__Group__2 ;
    public final void rule__VTMTemplate__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTMTEMPLATE.g:303:1: ( rule__VTMTemplate__Group__1__Impl rule__VTMTemplate__Group__2 )
            // InternalTMTEMPLATE.g:304:2: rule__VTMTemplate__Group__1__Impl rule__VTMTemplate__Group__2
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
    // InternalTMTEMPLATE.g:311:1: rule__VTMTemplate__Group__1__Impl : ( 'name=' ) ;
    public final void rule__VTMTemplate__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTMTEMPLATE.g:315:1: ( ( 'name=' ) )
            // InternalTMTEMPLATE.g:316:1: ( 'name=' )
            {
            // InternalTMTEMPLATE.g:316:1: ( 'name=' )
            // InternalTMTEMPLATE.g:317:2: 'name='
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
    // InternalTMTEMPLATE.g:326:1: rule__VTMTemplate__Group__2 : rule__VTMTemplate__Group__2__Impl rule__VTMTemplate__Group__3 ;
    public final void rule__VTMTemplate__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTMTEMPLATE.g:330:1: ( rule__VTMTemplate__Group__2__Impl rule__VTMTemplate__Group__3 )
            // InternalTMTEMPLATE.g:331:2: rule__VTMTemplate__Group__2__Impl rule__VTMTemplate__Group__3
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
    // InternalTMTEMPLATE.g:338:1: rule__VTMTemplate__Group__2__Impl : ( ( rule__VTMTemplate__NameAssignment_2 ) ) ;
    public final void rule__VTMTemplate__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTMTEMPLATE.g:342:1: ( ( ( rule__VTMTemplate__NameAssignment_2 ) ) )
            // InternalTMTEMPLATE.g:343:1: ( ( rule__VTMTemplate__NameAssignment_2 ) )
            {
            // InternalTMTEMPLATE.g:343:1: ( ( rule__VTMTemplate__NameAssignment_2 ) )
            // InternalTMTEMPLATE.g:344:2: ( rule__VTMTemplate__NameAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVTMTemplateAccess().getNameAssignment_2()); 
            }
            // InternalTMTEMPLATE.g:345:2: ( rule__VTMTemplate__NameAssignment_2 )
            // InternalTMTEMPLATE.g:345:3: rule__VTMTemplate__NameAssignment_2
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
    // InternalTMTEMPLATE.g:353:1: rule__VTMTemplate__Group__3 : rule__VTMTemplate__Group__3__Impl rule__VTMTemplate__Group__4 ;
    public final void rule__VTMTemplate__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTMTEMPLATE.g:357:1: ( rule__VTMTemplate__Group__3__Impl rule__VTMTemplate__Group__4 )
            // InternalTMTEMPLATE.g:358:2: rule__VTMTemplate__Group__3__Impl rule__VTMTemplate__Group__4
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
    // InternalTMTEMPLATE.g:365:1: rule__VTMTemplate__Group__3__Impl : ( 'tm=' ) ;
    public final void rule__VTMTemplate__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTMTEMPLATE.g:369:1: ( ( 'tm=' ) )
            // InternalTMTEMPLATE.g:370:1: ( 'tm=' )
            {
            // InternalTMTEMPLATE.g:370:1: ( 'tm=' )
            // InternalTMTEMPLATE.g:371:2: 'tm='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVTMTemplateAccess().getTmKeyword_3()); 
            }
            match(input,16,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getVTMTemplateAccess().getTmKeyword_3()); 
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
    // InternalTMTEMPLATE.g:380:1: rule__VTMTemplate__Group__4 : rule__VTMTemplate__Group__4__Impl rule__VTMTemplate__Group__5 ;
    public final void rule__VTMTemplate__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTMTEMPLATE.g:384:1: ( rule__VTMTemplate__Group__4__Impl rule__VTMTemplate__Group__5 )
            // InternalTMTEMPLATE.g:385:2: rule__VTMTemplate__Group__4__Impl rule__VTMTemplate__Group__5
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
    // InternalTMTEMPLATE.g:392:1: rule__VTMTemplate__Group__4__Impl : ( ( rule__VTMTemplate__TmAssignment_4 ) ) ;
    public final void rule__VTMTemplate__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTMTEMPLATE.g:396:1: ( ( ( rule__VTMTemplate__TmAssignment_4 ) ) )
            // InternalTMTEMPLATE.g:397:1: ( ( rule__VTMTemplate__TmAssignment_4 ) )
            {
            // InternalTMTEMPLATE.g:397:1: ( ( rule__VTMTemplate__TmAssignment_4 ) )
            // InternalTMTEMPLATE.g:398:2: ( rule__VTMTemplate__TmAssignment_4 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVTMTemplateAccess().getTmAssignment_4()); 
            }
            // InternalTMTEMPLATE.g:399:2: ( rule__VTMTemplate__TmAssignment_4 )
            // InternalTMTEMPLATE.g:399:3: rule__VTMTemplate__TmAssignment_4
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__VTMTemplate__TmAssignment_4();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getVTMTemplateAccess().getTmAssignment_4()); 
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
    // InternalTMTEMPLATE.g:407:1: rule__VTMTemplate__Group__5 : rule__VTMTemplate__Group__5__Impl ;
    public final void rule__VTMTemplate__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTMTEMPLATE.g:411:1: ( rule__VTMTemplate__Group__5__Impl )
            // InternalTMTEMPLATE.g:412:2: rule__VTMTemplate__Group__5__Impl
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
    // InternalTMTEMPLATE.g:418:1: rule__VTMTemplate__Group__5__Impl : ( ( rule__VTMTemplate__Alternatives_5 ) ) ;
    public final void rule__VTMTemplate__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTMTEMPLATE.g:422:1: ( ( ( rule__VTMTemplate__Alternatives_5 ) ) )
            // InternalTMTEMPLATE.g:423:1: ( ( rule__VTMTemplate__Alternatives_5 ) )
            {
            // InternalTMTEMPLATE.g:423:1: ( ( rule__VTMTemplate__Alternatives_5 ) )
            // InternalTMTEMPLATE.g:424:2: ( rule__VTMTemplate__Alternatives_5 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVTMTemplateAccess().getAlternatives_5()); 
            }
            // InternalTMTEMPLATE.g:425:2: ( rule__VTMTemplate__Alternatives_5 )
            // InternalTMTEMPLATE.g:425:3: rule__VTMTemplate__Alternatives_5
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
    // InternalTMTEMPLATE.g:434:1: rule__VTMTemplate__Group_5_0__0 : rule__VTMTemplate__Group_5_0__0__Impl rule__VTMTemplate__Group_5_0__1 ;
    public final void rule__VTMTemplate__Group_5_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTMTEMPLATE.g:438:1: ( rule__VTMTemplate__Group_5_0__0__Impl rule__VTMTemplate__Group_5_0__1 )
            // InternalTMTEMPLATE.g:439:2: rule__VTMTemplate__Group_5_0__0__Impl rule__VTMTemplate__Group_5_0__1
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
    // InternalTMTEMPLATE.g:446:1: rule__VTMTemplate__Group_5_0__0__Impl : ( '>' ) ;
    public final void rule__VTMTemplate__Group_5_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTMTEMPLATE.g:450:1: ( ( '>' ) )
            // InternalTMTEMPLATE.g:451:1: ( '>' )
            {
            // InternalTMTEMPLATE.g:451:1: ( '>' )
            // InternalTMTEMPLATE.g:452:2: '>'
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
    // InternalTMTEMPLATE.g:461:1: rule__VTMTemplate__Group_5_0__1 : rule__VTMTemplate__Group_5_0__1__Impl rule__VTMTemplate__Group_5_0__2 ;
    public final void rule__VTMTemplate__Group_5_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTMTEMPLATE.g:465:1: ( rule__VTMTemplate__Group_5_0__1__Impl rule__VTMTemplate__Group_5_0__2 )
            // InternalTMTEMPLATE.g:466:2: rule__VTMTemplate__Group_5_0__1__Impl rule__VTMTemplate__Group_5_0__2
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
    // InternalTMTEMPLATE.g:473:1: rule__VTMTemplate__Group_5_0__1__Impl : ( ( rule__VTMTemplate__Group_5_0_1__0 )? ) ;
    public final void rule__VTMTemplate__Group_5_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTMTEMPLATE.g:477:1: ( ( ( rule__VTMTemplate__Group_5_0_1__0 )? ) )
            // InternalTMTEMPLATE.g:478:1: ( ( rule__VTMTemplate__Group_5_0_1__0 )? )
            {
            // InternalTMTEMPLATE.g:478:1: ( ( rule__VTMTemplate__Group_5_0_1__0 )? )
            // InternalTMTEMPLATE.g:479:2: ( rule__VTMTemplate__Group_5_0_1__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVTMTemplateAccess().getGroup_5_0_1()); 
            }
            // InternalTMTEMPLATE.g:480:2: ( rule__VTMTemplate__Group_5_0_1__0 )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==19) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalTMTEMPLATE.g:480:3: rule__VTMTemplate__Group_5_0_1__0
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
    // InternalTMTEMPLATE.g:488:1: rule__VTMTemplate__Group_5_0__2 : rule__VTMTemplate__Group_5_0__2__Impl ;
    public final void rule__VTMTemplate__Group_5_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTMTEMPLATE.g:492:1: ( rule__VTMTemplate__Group_5_0__2__Impl )
            // InternalTMTEMPLATE.g:493:2: rule__VTMTemplate__Group_5_0__2__Impl
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
    // InternalTMTEMPLATE.g:499:1: rule__VTMTemplate__Group_5_0__2__Impl : ( '</TMTemplate>' ) ;
    public final void rule__VTMTemplate__Group_5_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTMTEMPLATE.g:503:1: ( ( '</TMTemplate>' ) )
            // InternalTMTEMPLATE.g:504:1: ( '</TMTemplate>' )
            {
            // InternalTMTEMPLATE.g:504:1: ( '</TMTemplate>' )
            // InternalTMTEMPLATE.g:505:2: '</TMTemplate>'
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
    // InternalTMTEMPLATE.g:515:1: rule__VTMTemplate__Group_5_0_1__0 : rule__VTMTemplate__Group_5_0_1__0__Impl rule__VTMTemplate__Group_5_0_1__1 ;
    public final void rule__VTMTemplate__Group_5_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTMTEMPLATE.g:519:1: ( rule__VTMTemplate__Group_5_0_1__0__Impl rule__VTMTemplate__Group_5_0_1__1 )
            // InternalTMTEMPLATE.g:520:2: rule__VTMTemplate__Group_5_0_1__0__Impl rule__VTMTemplate__Group_5_0_1__1
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
    // InternalTMTEMPLATE.g:527:1: rule__VTMTemplate__Group_5_0_1__0__Impl : ( '<Fields>' ) ;
    public final void rule__VTMTemplate__Group_5_0_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTMTEMPLATE.g:531:1: ( ( '<Fields>' ) )
            // InternalTMTEMPLATE.g:532:1: ( '<Fields>' )
            {
            // InternalTMTEMPLATE.g:532:1: ( '<Fields>' )
            // InternalTMTEMPLATE.g:533:2: '<Fields>'
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
    // InternalTMTEMPLATE.g:542:1: rule__VTMTemplate__Group_5_0_1__1 : rule__VTMTemplate__Group_5_0_1__1__Impl rule__VTMTemplate__Group_5_0_1__2 ;
    public final void rule__VTMTemplate__Group_5_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTMTEMPLATE.g:546:1: ( rule__VTMTemplate__Group_5_0_1__1__Impl rule__VTMTemplate__Group_5_0_1__2 )
            // InternalTMTEMPLATE.g:547:2: rule__VTMTemplate__Group_5_0_1__1__Impl rule__VTMTemplate__Group_5_0_1__2
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
    // InternalTMTEMPLATE.g:554:1: rule__VTMTemplate__Group_5_0_1__1__Impl : ( ( ( rule__VTMTemplate__FieldsAssignment_5_0_1_1 ) ) ( ( rule__VTMTemplate__FieldsAssignment_5_0_1_1 )* ) ) ;
    public final void rule__VTMTemplate__Group_5_0_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTMTEMPLATE.g:558:1: ( ( ( ( rule__VTMTemplate__FieldsAssignment_5_0_1_1 ) ) ( ( rule__VTMTemplate__FieldsAssignment_5_0_1_1 )* ) ) )
            // InternalTMTEMPLATE.g:559:1: ( ( ( rule__VTMTemplate__FieldsAssignment_5_0_1_1 ) ) ( ( rule__VTMTemplate__FieldsAssignment_5_0_1_1 )* ) )
            {
            // InternalTMTEMPLATE.g:559:1: ( ( ( rule__VTMTemplate__FieldsAssignment_5_0_1_1 ) ) ( ( rule__VTMTemplate__FieldsAssignment_5_0_1_1 )* ) )
            // InternalTMTEMPLATE.g:560:2: ( ( rule__VTMTemplate__FieldsAssignment_5_0_1_1 ) ) ( ( rule__VTMTemplate__FieldsAssignment_5_0_1_1 )* )
            {
            // InternalTMTEMPLATE.g:560:2: ( ( rule__VTMTemplate__FieldsAssignment_5_0_1_1 ) )
            // InternalTMTEMPLATE.g:561:3: ( rule__VTMTemplate__FieldsAssignment_5_0_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVTMTemplateAccess().getFieldsAssignment_5_0_1_1()); 
            }
            // InternalTMTEMPLATE.g:562:3: ( rule__VTMTemplate__FieldsAssignment_5_0_1_1 )
            // InternalTMTEMPLATE.g:562:4: rule__VTMTemplate__FieldsAssignment_5_0_1_1
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

            // InternalTMTEMPLATE.g:565:2: ( ( rule__VTMTemplate__FieldsAssignment_5_0_1_1 )* )
            // InternalTMTEMPLATE.g:566:3: ( rule__VTMTemplate__FieldsAssignment_5_0_1_1 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVTMTemplateAccess().getFieldsAssignment_5_0_1_1()); 
            }
            // InternalTMTEMPLATE.g:567:3: ( rule__VTMTemplate__FieldsAssignment_5_0_1_1 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==21) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalTMTEMPLATE.g:567:4: rule__VTMTemplate__FieldsAssignment_5_0_1_1
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
    // InternalTMTEMPLATE.g:576:1: rule__VTMTemplate__Group_5_0_1__2 : rule__VTMTemplate__Group_5_0_1__2__Impl ;
    public final void rule__VTMTemplate__Group_5_0_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTMTEMPLATE.g:580:1: ( rule__VTMTemplate__Group_5_0_1__2__Impl )
            // InternalTMTEMPLATE.g:581:2: rule__VTMTemplate__Group_5_0_1__2__Impl
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
    // InternalTMTEMPLATE.g:587:1: rule__VTMTemplate__Group_5_0_1__2__Impl : ( '</Fields>' ) ;
    public final void rule__VTMTemplate__Group_5_0_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTMTEMPLATE.g:591:1: ( ( '</Fields>' ) )
            // InternalTMTEMPLATE.g:592:1: ( '</Fields>' )
            {
            // InternalTMTEMPLATE.g:592:1: ( '</Fields>' )
            // InternalTMTEMPLATE.g:593:2: '</Fields>'
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
    // InternalTMTEMPLATE.g:603:1: rule__VTMTemplateField__Group__0 : rule__VTMTemplateField__Group__0__Impl rule__VTMTemplateField__Group__1 ;
    public final void rule__VTMTemplateField__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTMTEMPLATE.g:607:1: ( rule__VTMTemplateField__Group__0__Impl rule__VTMTemplateField__Group__1 )
            // InternalTMTEMPLATE.g:608:2: rule__VTMTemplateField__Group__0__Impl rule__VTMTemplateField__Group__1
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
    // InternalTMTEMPLATE.g:615:1: rule__VTMTemplateField__Group__0__Impl : ( '<Field' ) ;
    public final void rule__VTMTemplateField__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTMTEMPLATE.g:619:1: ( ( '<Field' ) )
            // InternalTMTEMPLATE.g:620:1: ( '<Field' )
            {
            // InternalTMTEMPLATE.g:620:1: ( '<Field' )
            // InternalTMTEMPLATE.g:621:2: '<Field'
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
    // InternalTMTEMPLATE.g:630:1: rule__VTMTemplateField__Group__1 : rule__VTMTemplateField__Group__1__Impl rule__VTMTemplateField__Group__2 ;
    public final void rule__VTMTemplateField__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTMTEMPLATE.g:634:1: ( rule__VTMTemplateField__Group__1__Impl rule__VTMTemplateField__Group__2 )
            // InternalTMTEMPLATE.g:635:2: rule__VTMTemplateField__Group__1__Impl rule__VTMTemplateField__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_4);
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
    // InternalTMTEMPLATE.g:642:1: rule__VTMTemplateField__Group__1__Impl : ( 'fieldRef=' ) ;
    public final void rule__VTMTemplateField__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTMTEMPLATE.g:646:1: ( ( 'fieldRef=' ) )
            // InternalTMTEMPLATE.g:647:1: ( 'fieldRef=' )
            {
            // InternalTMTEMPLATE.g:647:1: ( 'fieldRef=' )
            // InternalTMTEMPLATE.g:648:2: 'fieldRef='
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
    // InternalTMTEMPLATE.g:657:1: rule__VTMTemplateField__Group__2 : rule__VTMTemplateField__Group__2__Impl rule__VTMTemplateField__Group__3 ;
    public final void rule__VTMTemplateField__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTMTEMPLATE.g:661:1: ( rule__VTMTemplateField__Group__2__Impl rule__VTMTemplateField__Group__3 )
            // InternalTMTEMPLATE.g:662:2: rule__VTMTemplateField__Group__2__Impl rule__VTMTemplateField__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_12);
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
    // InternalTMTEMPLATE.g:669:1: rule__VTMTemplateField__Group__2__Impl : ( ( rule__VTMTemplateField__FieldRefAssignment_2 ) ) ;
    public final void rule__VTMTemplateField__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTMTEMPLATE.g:673:1: ( ( ( rule__VTMTemplateField__FieldRefAssignment_2 ) ) )
            // InternalTMTEMPLATE.g:674:1: ( ( rule__VTMTemplateField__FieldRefAssignment_2 ) )
            {
            // InternalTMTEMPLATE.g:674:1: ( ( rule__VTMTemplateField__FieldRefAssignment_2 ) )
            // InternalTMTEMPLATE.g:675:2: ( rule__VTMTemplateField__FieldRefAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVTMTemplateFieldAccess().getFieldRefAssignment_2()); 
            }
            // InternalTMTEMPLATE.g:676:2: ( rule__VTMTemplateField__FieldRefAssignment_2 )
            // InternalTMTEMPLATE.g:676:3: rule__VTMTemplateField__FieldRefAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__VTMTemplateField__FieldRefAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getVTMTemplateFieldAccess().getFieldRefAssignment_2()); 
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
    // InternalTMTEMPLATE.g:684:1: rule__VTMTemplateField__Group__3 : rule__VTMTemplateField__Group__3__Impl rule__VTMTemplateField__Group__4 ;
    public final void rule__VTMTemplateField__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTMTEMPLATE.g:688:1: ( rule__VTMTemplateField__Group__3__Impl rule__VTMTemplateField__Group__4 )
            // InternalTMTEMPLATE.g:689:2: rule__VTMTemplateField__Group__3__Impl rule__VTMTemplateField__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_13);
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
    // InternalTMTEMPLATE.g:696:1: rule__VTMTemplateField__Group__3__Impl : ( '>' ) ;
    public final void rule__VTMTemplateField__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTMTEMPLATE.g:700:1: ( ( '>' ) )
            // InternalTMTEMPLATE.g:701:1: ( '>' )
            {
            // InternalTMTEMPLATE.g:701:1: ( '>' )
            // InternalTMTEMPLATE.g:702:2: '>'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVTMTemplateFieldAccess().getGreaterThanSignKeyword_3()); 
            }
            match(input,17,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getVTMTemplateFieldAccess().getGreaterThanSignKeyword_3()); 
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
    // InternalTMTEMPLATE.g:711:1: rule__VTMTemplateField__Group__4 : rule__VTMTemplateField__Group__4__Impl rule__VTMTemplateField__Group__5 ;
    public final void rule__VTMTemplateField__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTMTEMPLATE.g:715:1: ( rule__VTMTemplateField__Group__4__Impl rule__VTMTemplateField__Group__5 )
            // InternalTMTEMPLATE.g:716:2: rule__VTMTemplateField__Group__4__Impl rule__VTMTemplateField__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_14);
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
    // InternalTMTEMPLATE.g:723:1: rule__VTMTemplateField__Group__4__Impl : ( ( rule__VTMTemplateField__ValueAssignment_4 ) ) ;
    public final void rule__VTMTemplateField__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTMTEMPLATE.g:727:1: ( ( ( rule__VTMTemplateField__ValueAssignment_4 ) ) )
            // InternalTMTEMPLATE.g:728:1: ( ( rule__VTMTemplateField__ValueAssignment_4 ) )
            {
            // InternalTMTEMPLATE.g:728:1: ( ( rule__VTMTemplateField__ValueAssignment_4 ) )
            // InternalTMTEMPLATE.g:729:2: ( rule__VTMTemplateField__ValueAssignment_4 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVTMTemplateFieldAccess().getValueAssignment_4()); 
            }
            // InternalTMTEMPLATE.g:730:2: ( rule__VTMTemplateField__ValueAssignment_4 )
            // InternalTMTEMPLATE.g:730:3: rule__VTMTemplateField__ValueAssignment_4
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__VTMTemplateField__ValueAssignment_4();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getVTMTemplateFieldAccess().getValueAssignment_4()); 
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
    // InternalTMTEMPLATE.g:738:1: rule__VTMTemplateField__Group__5 : rule__VTMTemplateField__Group__5__Impl ;
    public final void rule__VTMTemplateField__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTMTEMPLATE.g:742:1: ( rule__VTMTemplateField__Group__5__Impl )
            // InternalTMTEMPLATE.g:743:2: rule__VTMTemplateField__Group__5__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__VTMTemplateField__Group__5__Impl();

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
    // InternalTMTEMPLATE.g:749:1: rule__VTMTemplateField__Group__5__Impl : ( '</Field>' ) ;
    public final void rule__VTMTemplateField__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTMTEMPLATE.g:753:1: ( ( '</Field>' ) )
            // InternalTMTEMPLATE.g:754:1: ( '</Field>' )
            {
            // InternalTMTEMPLATE.g:754:1: ( '</Field>' )
            // InternalTMTEMPLATE.g:755:2: '</Field>'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVTMTemplateFieldAccess().getFieldKeyword_5()); 
            }
            match(input,23,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getVTMTemplateFieldAccess().getFieldKeyword_5()); 
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


    // $ANTLR start "rule__TMTCIFFieldValueRaw__Group__0"
    // InternalTMTEMPLATE.g:765:1: rule__TMTCIFFieldValueRaw__Group__0 : rule__TMTCIFFieldValueRaw__Group__0__Impl rule__TMTCIFFieldValueRaw__Group__1 ;
    public final void rule__TMTCIFFieldValueRaw__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTMTEMPLATE.g:769:1: ( rule__TMTCIFFieldValueRaw__Group__0__Impl rule__TMTCIFFieldValueRaw__Group__1 )
            // InternalTMTEMPLATE.g:770:2: rule__TMTCIFFieldValueRaw__Group__0__Impl rule__TMTCIFFieldValueRaw__Group__1
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
    // InternalTMTEMPLATE.g:777:1: rule__TMTCIFFieldValueRaw__Group__0__Impl : ( '<FieldValueRaw' ) ;
    public final void rule__TMTCIFFieldValueRaw__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTMTEMPLATE.g:781:1: ( ( '<FieldValueRaw' ) )
            // InternalTMTEMPLATE.g:782:1: ( '<FieldValueRaw' )
            {
            // InternalTMTEMPLATE.g:782:1: ( '<FieldValueRaw' )
            // InternalTMTEMPLATE.g:783:2: '<FieldValueRaw'
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
    // InternalTMTEMPLATE.g:792:1: rule__TMTCIFFieldValueRaw__Group__1 : rule__TMTCIFFieldValueRaw__Group__1__Impl rule__TMTCIFFieldValueRaw__Group__2 ;
    public final void rule__TMTCIFFieldValueRaw__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTMTEMPLATE.g:796:1: ( rule__TMTCIFFieldValueRaw__Group__1__Impl rule__TMTCIFFieldValueRaw__Group__2 )
            // InternalTMTEMPLATE.g:797:2: rule__TMTCIFFieldValueRaw__Group__1__Impl rule__TMTCIFFieldValueRaw__Group__2
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
    // InternalTMTEMPLATE.g:804:1: rule__TMTCIFFieldValueRaw__Group__1__Impl : ( 'value=' ) ;
    public final void rule__TMTCIFFieldValueRaw__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTMTEMPLATE.g:808:1: ( ( 'value=' ) )
            // InternalTMTEMPLATE.g:809:1: ( 'value=' )
            {
            // InternalTMTEMPLATE.g:809:1: ( 'value=' )
            // InternalTMTEMPLATE.g:810:2: 'value='
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
    // InternalTMTEMPLATE.g:819:1: rule__TMTCIFFieldValueRaw__Group__2 : rule__TMTCIFFieldValueRaw__Group__2__Impl rule__TMTCIFFieldValueRaw__Group__3 ;
    public final void rule__TMTCIFFieldValueRaw__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTMTEMPLATE.g:823:1: ( rule__TMTCIFFieldValueRaw__Group__2__Impl rule__TMTCIFFieldValueRaw__Group__3 )
            // InternalTMTEMPLATE.g:824:2: rule__TMTCIFFieldValueRaw__Group__2__Impl rule__TMTCIFFieldValueRaw__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_17);
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
    // InternalTMTEMPLATE.g:831:1: rule__TMTCIFFieldValueRaw__Group__2__Impl : ( ( rule__TMTCIFFieldValueRaw__ValueAssignment_2 ) ) ;
    public final void rule__TMTCIFFieldValueRaw__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTMTEMPLATE.g:835:1: ( ( ( rule__TMTCIFFieldValueRaw__ValueAssignment_2 ) ) )
            // InternalTMTEMPLATE.g:836:1: ( ( rule__TMTCIFFieldValueRaw__ValueAssignment_2 ) )
            {
            // InternalTMTEMPLATE.g:836:1: ( ( rule__TMTCIFFieldValueRaw__ValueAssignment_2 ) )
            // InternalTMTEMPLATE.g:837:2: ( rule__TMTCIFFieldValueRaw__ValueAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFFieldValueRawAccess().getValueAssignment_2()); 
            }
            // InternalTMTEMPLATE.g:838:2: ( rule__TMTCIFFieldValueRaw__ValueAssignment_2 )
            // InternalTMTEMPLATE.g:838:3: rule__TMTCIFFieldValueRaw__ValueAssignment_2
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
    // InternalTMTEMPLATE.g:846:1: rule__TMTCIFFieldValueRaw__Group__3 : rule__TMTCIFFieldValueRaw__Group__3__Impl ;
    public final void rule__TMTCIFFieldValueRaw__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTMTEMPLATE.g:850:1: ( rule__TMTCIFFieldValueRaw__Group__3__Impl )
            // InternalTMTEMPLATE.g:851:2: rule__TMTCIFFieldValueRaw__Group__3__Impl
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
    // InternalTMTEMPLATE.g:857:1: rule__TMTCIFFieldValueRaw__Group__3__Impl : ( '/>' ) ;
    public final void rule__TMTCIFFieldValueRaw__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTMTEMPLATE.g:861:1: ( ( '/>' ) )
            // InternalTMTEMPLATE.g:862:1: ( '/>' )
            {
            // InternalTMTEMPLATE.g:862:1: ( '/>' )
            // InternalTMTEMPLATE.g:863:2: '/>'
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
    // InternalTMTEMPLATE.g:873:1: rule__TMTCIFFieldValueFile__Group__0 : rule__TMTCIFFieldValueFile__Group__0__Impl rule__TMTCIFFieldValueFile__Group__1 ;
    public final void rule__TMTCIFFieldValueFile__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTMTEMPLATE.g:877:1: ( rule__TMTCIFFieldValueFile__Group__0__Impl rule__TMTCIFFieldValueFile__Group__1 )
            // InternalTMTEMPLATE.g:878:2: rule__TMTCIFFieldValueFile__Group__0__Impl rule__TMTCIFFieldValueFile__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_18);
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
    // InternalTMTEMPLATE.g:885:1: rule__TMTCIFFieldValueFile__Group__0__Impl : ( '<FieldValueFile' ) ;
    public final void rule__TMTCIFFieldValueFile__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTMTEMPLATE.g:889:1: ( ( '<FieldValueFile' ) )
            // InternalTMTEMPLATE.g:890:1: ( '<FieldValueFile' )
            {
            // InternalTMTEMPLATE.g:890:1: ( '<FieldValueFile' )
            // InternalTMTEMPLATE.g:891:2: '<FieldValueFile'
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
    // InternalTMTEMPLATE.g:900:1: rule__TMTCIFFieldValueFile__Group__1 : rule__TMTCIFFieldValueFile__Group__1__Impl rule__TMTCIFFieldValueFile__Group__2 ;
    public final void rule__TMTCIFFieldValueFile__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTMTEMPLATE.g:904:1: ( rule__TMTCIFFieldValueFile__Group__1__Impl rule__TMTCIFFieldValueFile__Group__2 )
            // InternalTMTEMPLATE.g:905:2: rule__TMTCIFFieldValueFile__Group__1__Impl rule__TMTCIFFieldValueFile__Group__2
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
    // InternalTMTEMPLATE.g:912:1: rule__TMTCIFFieldValueFile__Group__1__Impl : ( 'filename=' ) ;
    public final void rule__TMTCIFFieldValueFile__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTMTEMPLATE.g:916:1: ( ( 'filename=' ) )
            // InternalTMTEMPLATE.g:917:1: ( 'filename=' )
            {
            // InternalTMTEMPLATE.g:917:1: ( 'filename=' )
            // InternalTMTEMPLATE.g:918:2: 'filename='
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
    // InternalTMTEMPLATE.g:927:1: rule__TMTCIFFieldValueFile__Group__2 : rule__TMTCIFFieldValueFile__Group__2__Impl rule__TMTCIFFieldValueFile__Group__3 ;
    public final void rule__TMTCIFFieldValueFile__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTMTEMPLATE.g:931:1: ( rule__TMTCIFFieldValueFile__Group__2__Impl rule__TMTCIFFieldValueFile__Group__3 )
            // InternalTMTEMPLATE.g:932:2: rule__TMTCIFFieldValueFile__Group__2__Impl rule__TMTCIFFieldValueFile__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_17);
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
    // InternalTMTEMPLATE.g:939:1: rule__TMTCIFFieldValueFile__Group__2__Impl : ( ( rule__TMTCIFFieldValueFile__FilenameAssignment_2 ) ) ;
    public final void rule__TMTCIFFieldValueFile__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTMTEMPLATE.g:943:1: ( ( ( rule__TMTCIFFieldValueFile__FilenameAssignment_2 ) ) )
            // InternalTMTEMPLATE.g:944:1: ( ( rule__TMTCIFFieldValueFile__FilenameAssignment_2 ) )
            {
            // InternalTMTEMPLATE.g:944:1: ( ( rule__TMTCIFFieldValueFile__FilenameAssignment_2 ) )
            // InternalTMTEMPLATE.g:945:2: ( rule__TMTCIFFieldValueFile__FilenameAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFFieldValueFileAccess().getFilenameAssignment_2()); 
            }
            // InternalTMTEMPLATE.g:946:2: ( rule__TMTCIFFieldValueFile__FilenameAssignment_2 )
            // InternalTMTEMPLATE.g:946:3: rule__TMTCIFFieldValueFile__FilenameAssignment_2
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
    // InternalTMTEMPLATE.g:954:1: rule__TMTCIFFieldValueFile__Group__3 : rule__TMTCIFFieldValueFile__Group__3__Impl ;
    public final void rule__TMTCIFFieldValueFile__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTMTEMPLATE.g:958:1: ( rule__TMTCIFFieldValueFile__Group__3__Impl )
            // InternalTMTEMPLATE.g:959:2: rule__TMTCIFFieldValueFile__Group__3__Impl
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
    // InternalTMTEMPLATE.g:965:1: rule__TMTCIFFieldValueFile__Group__3__Impl : ( '/>' ) ;
    public final void rule__TMTCIFFieldValueFile__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTMTEMPLATE.g:969:1: ( ( '/>' ) )
            // InternalTMTEMPLATE.g:970:1: ( '/>' )
            {
            // InternalTMTEMPLATE.g:970:1: ( '/>' )
            // InternalTMTEMPLATE.g:971:2: '/>'
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


    // $ANTLR start "rule__TMTCIFFieldValueEnum__Group__0"
    // InternalTMTEMPLATE.g:981:1: rule__TMTCIFFieldValueEnum__Group__0 : rule__TMTCIFFieldValueEnum__Group__0__Impl rule__TMTCIFFieldValueEnum__Group__1 ;
    public final void rule__TMTCIFFieldValueEnum__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTMTEMPLATE.g:985:1: ( rule__TMTCIFFieldValueEnum__Group__0__Impl rule__TMTCIFFieldValueEnum__Group__1 )
            // InternalTMTEMPLATE.g:986:2: rule__TMTCIFFieldValueEnum__Group__0__Impl rule__TMTCIFFieldValueEnum__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_19);
            rule__TMTCIFFieldValueEnum__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TMTCIFFieldValueEnum__Group__1();

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
    // $ANTLR end "rule__TMTCIFFieldValueEnum__Group__0"


    // $ANTLR start "rule__TMTCIFFieldValueEnum__Group__0__Impl"
    // InternalTMTEMPLATE.g:993:1: rule__TMTCIFFieldValueEnum__Group__0__Impl : ( '<FieldValueEnum' ) ;
    public final void rule__TMTCIFFieldValueEnum__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTMTEMPLATE.g:997:1: ( ( '<FieldValueEnum' ) )
            // InternalTMTEMPLATE.g:998:1: ( '<FieldValueEnum' )
            {
            // InternalTMTEMPLATE.g:998:1: ( '<FieldValueEnum' )
            // InternalTMTEMPLATE.g:999:2: '<FieldValueEnum'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFFieldValueEnumAccess().getFieldValueEnumKeyword_0()); 
            }
            match(input,28,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFFieldValueEnumAccess().getFieldValueEnumKeyword_0()); 
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
    // $ANTLR end "rule__TMTCIFFieldValueEnum__Group__0__Impl"


    // $ANTLR start "rule__TMTCIFFieldValueEnum__Group__1"
    // InternalTMTEMPLATE.g:1008:1: rule__TMTCIFFieldValueEnum__Group__1 : rule__TMTCIFFieldValueEnum__Group__1__Impl rule__TMTCIFFieldValueEnum__Group__2 ;
    public final void rule__TMTCIFFieldValueEnum__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTMTEMPLATE.g:1012:1: ( rule__TMTCIFFieldValueEnum__Group__1__Impl rule__TMTCIFFieldValueEnum__Group__2 )
            // InternalTMTEMPLATE.g:1013:2: rule__TMTCIFFieldValueEnum__Group__1__Impl rule__TMTCIFFieldValueEnum__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_4);
            rule__TMTCIFFieldValueEnum__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TMTCIFFieldValueEnum__Group__2();

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
    // $ANTLR end "rule__TMTCIFFieldValueEnum__Group__1"


    // $ANTLR start "rule__TMTCIFFieldValueEnum__Group__1__Impl"
    // InternalTMTEMPLATE.g:1020:1: rule__TMTCIFFieldValueEnum__Group__1__Impl : ( 'enumRef=' ) ;
    public final void rule__TMTCIFFieldValueEnum__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTMTEMPLATE.g:1024:1: ( ( 'enumRef=' ) )
            // InternalTMTEMPLATE.g:1025:1: ( 'enumRef=' )
            {
            // InternalTMTEMPLATE.g:1025:1: ( 'enumRef=' )
            // InternalTMTEMPLATE.g:1026:2: 'enumRef='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFFieldValueEnumAccess().getEnumRefKeyword_1()); 
            }
            match(input,29,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFFieldValueEnumAccess().getEnumRefKeyword_1()); 
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
    // $ANTLR end "rule__TMTCIFFieldValueEnum__Group__1__Impl"


    // $ANTLR start "rule__TMTCIFFieldValueEnum__Group__2"
    // InternalTMTEMPLATE.g:1035:1: rule__TMTCIFFieldValueEnum__Group__2 : rule__TMTCIFFieldValueEnum__Group__2__Impl rule__TMTCIFFieldValueEnum__Group__3 ;
    public final void rule__TMTCIFFieldValueEnum__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTMTEMPLATE.g:1039:1: ( rule__TMTCIFFieldValueEnum__Group__2__Impl rule__TMTCIFFieldValueEnum__Group__3 )
            // InternalTMTEMPLATE.g:1040:2: rule__TMTCIFFieldValueEnum__Group__2__Impl rule__TMTCIFFieldValueEnum__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_20);
            rule__TMTCIFFieldValueEnum__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TMTCIFFieldValueEnum__Group__3();

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
    // $ANTLR end "rule__TMTCIFFieldValueEnum__Group__2"


    // $ANTLR start "rule__TMTCIFFieldValueEnum__Group__2__Impl"
    // InternalTMTEMPLATE.g:1047:1: rule__TMTCIFFieldValueEnum__Group__2__Impl : ( ( rule__TMTCIFFieldValueEnum__EnumRefAssignment_2 ) ) ;
    public final void rule__TMTCIFFieldValueEnum__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTMTEMPLATE.g:1051:1: ( ( ( rule__TMTCIFFieldValueEnum__EnumRefAssignment_2 ) ) )
            // InternalTMTEMPLATE.g:1052:1: ( ( rule__TMTCIFFieldValueEnum__EnumRefAssignment_2 ) )
            {
            // InternalTMTEMPLATE.g:1052:1: ( ( rule__TMTCIFFieldValueEnum__EnumRefAssignment_2 ) )
            // InternalTMTEMPLATE.g:1053:2: ( rule__TMTCIFFieldValueEnum__EnumRefAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFFieldValueEnumAccess().getEnumRefAssignment_2()); 
            }
            // InternalTMTEMPLATE.g:1054:2: ( rule__TMTCIFFieldValueEnum__EnumRefAssignment_2 )
            // InternalTMTEMPLATE.g:1054:3: rule__TMTCIFFieldValueEnum__EnumRefAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TMTCIFFieldValueEnum__EnumRefAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFFieldValueEnumAccess().getEnumRefAssignment_2()); 
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
    // $ANTLR end "rule__TMTCIFFieldValueEnum__Group__2__Impl"


    // $ANTLR start "rule__TMTCIFFieldValueEnum__Group__3"
    // InternalTMTEMPLATE.g:1062:1: rule__TMTCIFFieldValueEnum__Group__3 : rule__TMTCIFFieldValueEnum__Group__3__Impl rule__TMTCIFFieldValueEnum__Group__4 ;
    public final void rule__TMTCIFFieldValueEnum__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTMTEMPLATE.g:1066:1: ( rule__TMTCIFFieldValueEnum__Group__3__Impl rule__TMTCIFFieldValueEnum__Group__4 )
            // InternalTMTEMPLATE.g:1067:2: rule__TMTCIFFieldValueEnum__Group__3__Impl rule__TMTCIFFieldValueEnum__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_4);
            rule__TMTCIFFieldValueEnum__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TMTCIFFieldValueEnum__Group__4();

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
    // $ANTLR end "rule__TMTCIFFieldValueEnum__Group__3"


    // $ANTLR start "rule__TMTCIFFieldValueEnum__Group__3__Impl"
    // InternalTMTEMPLATE.g:1074:1: rule__TMTCIFFieldValueEnum__Group__3__Impl : ( 'valueRef=' ) ;
    public final void rule__TMTCIFFieldValueEnum__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTMTEMPLATE.g:1078:1: ( ( 'valueRef=' ) )
            // InternalTMTEMPLATE.g:1079:1: ( 'valueRef=' )
            {
            // InternalTMTEMPLATE.g:1079:1: ( 'valueRef=' )
            // InternalTMTEMPLATE.g:1080:2: 'valueRef='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFFieldValueEnumAccess().getValueRefKeyword_3()); 
            }
            match(input,30,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFFieldValueEnumAccess().getValueRefKeyword_3()); 
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
    // $ANTLR end "rule__TMTCIFFieldValueEnum__Group__3__Impl"


    // $ANTLR start "rule__TMTCIFFieldValueEnum__Group__4"
    // InternalTMTEMPLATE.g:1089:1: rule__TMTCIFFieldValueEnum__Group__4 : rule__TMTCIFFieldValueEnum__Group__4__Impl rule__TMTCIFFieldValueEnum__Group__5 ;
    public final void rule__TMTCIFFieldValueEnum__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTMTEMPLATE.g:1093:1: ( rule__TMTCIFFieldValueEnum__Group__4__Impl rule__TMTCIFFieldValueEnum__Group__5 )
            // InternalTMTEMPLATE.g:1094:2: rule__TMTCIFFieldValueEnum__Group__4__Impl rule__TMTCIFFieldValueEnum__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_17);
            rule__TMTCIFFieldValueEnum__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TMTCIFFieldValueEnum__Group__5();

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
    // $ANTLR end "rule__TMTCIFFieldValueEnum__Group__4"


    // $ANTLR start "rule__TMTCIFFieldValueEnum__Group__4__Impl"
    // InternalTMTEMPLATE.g:1101:1: rule__TMTCIFFieldValueEnum__Group__4__Impl : ( ( rule__TMTCIFFieldValueEnum__ValueRefAssignment_4 ) ) ;
    public final void rule__TMTCIFFieldValueEnum__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTMTEMPLATE.g:1105:1: ( ( ( rule__TMTCIFFieldValueEnum__ValueRefAssignment_4 ) ) )
            // InternalTMTEMPLATE.g:1106:1: ( ( rule__TMTCIFFieldValueEnum__ValueRefAssignment_4 ) )
            {
            // InternalTMTEMPLATE.g:1106:1: ( ( rule__TMTCIFFieldValueEnum__ValueRefAssignment_4 ) )
            // InternalTMTEMPLATE.g:1107:2: ( rule__TMTCIFFieldValueEnum__ValueRefAssignment_4 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFFieldValueEnumAccess().getValueRefAssignment_4()); 
            }
            // InternalTMTEMPLATE.g:1108:2: ( rule__TMTCIFFieldValueEnum__ValueRefAssignment_4 )
            // InternalTMTEMPLATE.g:1108:3: rule__TMTCIFFieldValueEnum__ValueRefAssignment_4
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TMTCIFFieldValueEnum__ValueRefAssignment_4();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFFieldValueEnumAccess().getValueRefAssignment_4()); 
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
    // $ANTLR end "rule__TMTCIFFieldValueEnum__Group__4__Impl"


    // $ANTLR start "rule__TMTCIFFieldValueEnum__Group__5"
    // InternalTMTEMPLATE.g:1116:1: rule__TMTCIFFieldValueEnum__Group__5 : rule__TMTCIFFieldValueEnum__Group__5__Impl ;
    public final void rule__TMTCIFFieldValueEnum__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTMTEMPLATE.g:1120:1: ( rule__TMTCIFFieldValueEnum__Group__5__Impl )
            // InternalTMTEMPLATE.g:1121:2: rule__TMTCIFFieldValueEnum__Group__5__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TMTCIFFieldValueEnum__Group__5__Impl();

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
    // $ANTLR end "rule__TMTCIFFieldValueEnum__Group__5"


    // $ANTLR start "rule__TMTCIFFieldValueEnum__Group__5__Impl"
    // InternalTMTEMPLATE.g:1127:1: rule__TMTCIFFieldValueEnum__Group__5__Impl : ( '/>' ) ;
    public final void rule__TMTCIFFieldValueEnum__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTMTEMPLATE.g:1131:1: ( ( '/>' ) )
            // InternalTMTEMPLATE.g:1132:1: ( '/>' )
            {
            // InternalTMTEMPLATE.g:1132:1: ( '/>' )
            // InternalTMTEMPLATE.g:1133:2: '/>'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFFieldValueEnumAccess().getSolidusGreaterThanSignKeyword_5()); 
            }
            match(input,13,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFFieldValueEnumAccess().getSolidusGreaterThanSignKeyword_5()); 
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
    // $ANTLR end "rule__TMTCIFFieldValueEnum__Group__5__Impl"


    // $ANTLR start "rule__VTMTemplate__NameAssignment_2"
    // InternalTMTEMPLATE.g:1143:1: rule__VTMTemplate__NameAssignment_2 : ( RULE_STRING ) ;
    public final void rule__VTMTemplate__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTMTEMPLATE.g:1147:1: ( ( RULE_STRING ) )
            // InternalTMTEMPLATE.g:1148:2: ( RULE_STRING )
            {
            // InternalTMTEMPLATE.g:1148:2: ( RULE_STRING )
            // InternalTMTEMPLATE.g:1149:3: RULE_STRING
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


    // $ANTLR start "rule__VTMTemplate__TmAssignment_4"
    // InternalTMTEMPLATE.g:1158:1: rule__VTMTemplate__TmAssignment_4 : ( ( RULE_STRING ) ) ;
    public final void rule__VTMTemplate__TmAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTMTEMPLATE.g:1162:1: ( ( ( RULE_STRING ) ) )
            // InternalTMTEMPLATE.g:1163:2: ( ( RULE_STRING ) )
            {
            // InternalTMTEMPLATE.g:1163:2: ( ( RULE_STRING ) )
            // InternalTMTEMPLATE.g:1164:3: ( RULE_STRING )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVTMTemplateAccess().getTmTMTCIFTMCrossReference_4_0()); 
            }
            // InternalTMTEMPLATE.g:1165:3: ( RULE_STRING )
            // InternalTMTEMPLATE.g:1166:4: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVTMTemplateAccess().getTmTMTCIFTMSTRINGTerminalRuleCall_4_0_1()); 
            }
            match(input,RULE_STRING,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getVTMTemplateAccess().getTmTMTCIFTMSTRINGTerminalRuleCall_4_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getVTMTemplateAccess().getTmTMTCIFTMCrossReference_4_0()); 
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
    // $ANTLR end "rule__VTMTemplate__TmAssignment_4"


    // $ANTLR start "rule__VTMTemplate__FieldsAssignment_5_0_1_1"
    // InternalTMTEMPLATE.g:1177:1: rule__VTMTemplate__FieldsAssignment_5_0_1_1 : ( ruleVTMTemplateField ) ;
    public final void rule__VTMTemplate__FieldsAssignment_5_0_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTMTEMPLATE.g:1181:1: ( ( ruleVTMTemplateField ) )
            // InternalTMTEMPLATE.g:1182:2: ( ruleVTMTemplateField )
            {
            // InternalTMTEMPLATE.g:1182:2: ( ruleVTMTemplateField )
            // InternalTMTEMPLATE.g:1183:3: ruleVTMTemplateField
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


    // $ANTLR start "rule__VTMTemplateField__FieldRefAssignment_2"
    // InternalTMTEMPLATE.g:1192:1: rule__VTMTemplateField__FieldRefAssignment_2 : ( ( RULE_STRING ) ) ;
    public final void rule__VTMTemplateField__FieldRefAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTMTEMPLATE.g:1196:1: ( ( ( RULE_STRING ) ) )
            // InternalTMTEMPLATE.g:1197:2: ( ( RULE_STRING ) )
            {
            // InternalTMTEMPLATE.g:1197:2: ( ( RULE_STRING ) )
            // InternalTMTEMPLATE.g:1198:3: ( RULE_STRING )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVTMTemplateFieldAccess().getFieldRefTMTCIFTMFieldCrossReference_2_0()); 
            }
            // InternalTMTEMPLATE.g:1199:3: ( RULE_STRING )
            // InternalTMTEMPLATE.g:1200:4: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVTMTemplateFieldAccess().getFieldRefTMTCIFTMFieldSTRINGTerminalRuleCall_2_0_1()); 
            }
            match(input,RULE_STRING,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getVTMTemplateFieldAccess().getFieldRefTMTCIFTMFieldSTRINGTerminalRuleCall_2_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getVTMTemplateFieldAccess().getFieldRefTMTCIFTMFieldCrossReference_2_0()); 
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
    // $ANTLR end "rule__VTMTemplateField__FieldRefAssignment_2"


    // $ANTLR start "rule__VTMTemplateField__ValueAssignment_4"
    // InternalTMTEMPLATE.g:1211:1: rule__VTMTemplateField__ValueAssignment_4 : ( ruleTMTCIFFieldValue ) ;
    public final void rule__VTMTemplateField__ValueAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTMTEMPLATE.g:1215:1: ( ( ruleTMTCIFFieldValue ) )
            // InternalTMTEMPLATE.g:1216:2: ( ruleTMTCIFFieldValue )
            {
            // InternalTMTEMPLATE.g:1216:2: ( ruleTMTCIFFieldValue )
            // InternalTMTEMPLATE.g:1217:3: ruleTMTCIFFieldValue
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVTMTemplateFieldAccess().getValueTMTCIFFieldValueParserRuleCall_4_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleTMTCIFFieldValue();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getVTMTemplateFieldAccess().getValueTMTCIFFieldValueParserRuleCall_4_0()); 
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
    // $ANTLR end "rule__VTMTemplateField__ValueAssignment_4"


    // $ANTLR start "rule__TMTCIFFieldValueRaw__ValueAssignment_2"
    // InternalTMTEMPLATE.g:1226:1: rule__TMTCIFFieldValueRaw__ValueAssignment_2 : ( ( rule__TMTCIFFieldValueRaw__ValueAlternatives_2_0 ) ) ;
    public final void rule__TMTCIFFieldValueRaw__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTMTEMPLATE.g:1230:1: ( ( ( rule__TMTCIFFieldValueRaw__ValueAlternatives_2_0 ) ) )
            // InternalTMTEMPLATE.g:1231:2: ( ( rule__TMTCIFFieldValueRaw__ValueAlternatives_2_0 ) )
            {
            // InternalTMTEMPLATE.g:1231:2: ( ( rule__TMTCIFFieldValueRaw__ValueAlternatives_2_0 ) )
            // InternalTMTEMPLATE.g:1232:3: ( rule__TMTCIFFieldValueRaw__ValueAlternatives_2_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFFieldValueRawAccess().getValueAlternatives_2_0()); 
            }
            // InternalTMTEMPLATE.g:1233:3: ( rule__TMTCIFFieldValueRaw__ValueAlternatives_2_0 )
            // InternalTMTEMPLATE.g:1233:4: rule__TMTCIFFieldValueRaw__ValueAlternatives_2_0
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
    // InternalTMTEMPLATE.g:1241:1: rule__TMTCIFFieldValueFile__FilenameAssignment_2 : ( RULE_STRING ) ;
    public final void rule__TMTCIFFieldValueFile__FilenameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTMTEMPLATE.g:1245:1: ( ( RULE_STRING ) )
            // InternalTMTEMPLATE.g:1246:2: ( RULE_STRING )
            {
            // InternalTMTEMPLATE.g:1246:2: ( RULE_STRING )
            // InternalTMTEMPLATE.g:1247:3: RULE_STRING
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


    // $ANTLR start "rule__TMTCIFFieldValueEnum__EnumRefAssignment_2"
    // InternalTMTEMPLATE.g:1256:1: rule__TMTCIFFieldValueEnum__EnumRefAssignment_2 : ( ( RULE_STRING ) ) ;
    public final void rule__TMTCIFFieldValueEnum__EnumRefAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTMTEMPLATE.g:1260:1: ( ( ( RULE_STRING ) ) )
            // InternalTMTEMPLATE.g:1261:2: ( ( RULE_STRING ) )
            {
            // InternalTMTEMPLATE.g:1261:2: ( ( RULE_STRING ) )
            // InternalTMTEMPLATE.g:1262:3: ( RULE_STRING )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFFieldValueEnumAccess().getEnumRefTMTCIFEnumCrossReference_2_0()); 
            }
            // InternalTMTEMPLATE.g:1263:3: ( RULE_STRING )
            // InternalTMTEMPLATE.g:1264:4: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFFieldValueEnumAccess().getEnumRefTMTCIFEnumSTRINGTerminalRuleCall_2_0_1()); 
            }
            match(input,RULE_STRING,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFFieldValueEnumAccess().getEnumRefTMTCIFEnumSTRINGTerminalRuleCall_2_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFFieldValueEnumAccess().getEnumRefTMTCIFEnumCrossReference_2_0()); 
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
    // $ANTLR end "rule__TMTCIFFieldValueEnum__EnumRefAssignment_2"


    // $ANTLR start "rule__TMTCIFFieldValueEnum__ValueRefAssignment_4"
    // InternalTMTEMPLATE.g:1275:1: rule__TMTCIFFieldValueEnum__ValueRefAssignment_4 : ( ( RULE_STRING ) ) ;
    public final void rule__TMTCIFFieldValueEnum__ValueRefAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTMTEMPLATE.g:1279:1: ( ( ( RULE_STRING ) ) )
            // InternalTMTEMPLATE.g:1280:2: ( ( RULE_STRING ) )
            {
            // InternalTMTEMPLATE.g:1280:2: ( ( RULE_STRING ) )
            // InternalTMTEMPLATE.g:1281:3: ( RULE_STRING )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFFieldValueEnumAccess().getValueRefTMTCIFEnumValueCrossReference_4_0()); 
            }
            // InternalTMTEMPLATE.g:1282:3: ( RULE_STRING )
            // InternalTMTEMPLATE.g:1283:4: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFFieldValueEnumAccess().getValueRefTMTCIFEnumValueSTRINGTerminalRuleCall_4_0_1()); 
            }
            match(input,RULE_STRING,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFFieldValueEnumAccess().getValueRefTMTCIFEnumValueSTRINGTerminalRuleCall_4_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFFieldValueEnumAccess().getValueRefTMTCIFEnumValueCrossReference_4_0()); 
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
    // $ANTLR end "rule__TMTCIFFieldValueEnum__ValueRefAssignment_4"

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
        public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000015000000L});
        public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000800000L});
        public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000002000000L});
        public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000008000000L});
        public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000020000000L});
        public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000040000000L});
    }


}