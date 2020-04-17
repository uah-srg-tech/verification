package es.uah.aut.srg.micobs.svm.lang.tctemplate.ide.contentassist.antlr.internal;

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
public class InternalTCTEMPLATEParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_UINT_STRING", "RULE_HEX_STRING", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'/>'", "'<TCTemplate'", "'name='", "'tc='", "'>'", "'</TCTemplate>'", "'<Fields>'", "'</Fields>'", "'<Field'", "'fieldRef='", "'</Field>'", "'<FieldValueRaw'", "'value='", "'<FieldValueFile'", "'filename='", "'<FieldValueEnum'", "'enumRef='", "'valueRef='"
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


        public InternalTCTEMPLATEParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalTCTEMPLATEParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalTCTEMPLATEParser.tokenNames; }
    public String getGrammarFileName() { return "InternalTCTEMPLATE.g"; }


    	private TCTEMPLATEGrammarAccess grammarAccess;

    	public void setGrammarAccess(TCTEMPLATEGrammarAccess grammarAccess) {
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



    // $ANTLR start "entryRuleVTCTemplate"
    // InternalTCTEMPLATE.g:61:1: entryRuleVTCTemplate : ruleVTCTemplate EOF ;
    public final void entryRuleVTCTemplate() throws RecognitionException {
        try {
            // InternalTCTEMPLATE.g:62:1: ( ruleVTCTemplate EOF )
            // InternalTCTEMPLATE.g:63:1: ruleVTCTemplate EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVTCTemplateRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            ruleVTCTemplate();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getVTCTemplateRule()); 
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
    // $ANTLR end "entryRuleVTCTemplate"


    // $ANTLR start "ruleVTCTemplate"
    // InternalTCTEMPLATE.g:70:1: ruleVTCTemplate : ( ( rule__VTCTemplate__Group__0 ) ) ;
    public final void ruleVTCTemplate() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTCTEMPLATE.g:74:2: ( ( ( rule__VTCTemplate__Group__0 ) ) )
            // InternalTCTEMPLATE.g:75:2: ( ( rule__VTCTemplate__Group__0 ) )
            {
            // InternalTCTEMPLATE.g:75:2: ( ( rule__VTCTemplate__Group__0 ) )
            // InternalTCTEMPLATE.g:76:3: ( rule__VTCTemplate__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVTCTemplateAccess().getGroup()); 
            }
            // InternalTCTEMPLATE.g:77:3: ( rule__VTCTemplate__Group__0 )
            // InternalTCTEMPLATE.g:77:4: rule__VTCTemplate__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__VTCTemplate__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getVTCTemplateAccess().getGroup()); 
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
    // $ANTLR end "ruleVTCTemplate"


    // $ANTLR start "entryRuleVTCTemplateField"
    // InternalTCTEMPLATE.g:86:1: entryRuleVTCTemplateField : ruleVTCTemplateField EOF ;
    public final void entryRuleVTCTemplateField() throws RecognitionException {
        try {
            // InternalTCTEMPLATE.g:87:1: ( ruleVTCTemplateField EOF )
            // InternalTCTEMPLATE.g:88:1: ruleVTCTemplateField EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVTCTemplateFieldRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            ruleVTCTemplateField();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getVTCTemplateFieldRule()); 
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
    // $ANTLR end "entryRuleVTCTemplateField"


    // $ANTLR start "ruleVTCTemplateField"
    // InternalTCTEMPLATE.g:95:1: ruleVTCTemplateField : ( ( rule__VTCTemplateField__Group__0 ) ) ;
    public final void ruleVTCTemplateField() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTCTEMPLATE.g:99:2: ( ( ( rule__VTCTemplateField__Group__0 ) ) )
            // InternalTCTEMPLATE.g:100:2: ( ( rule__VTCTemplateField__Group__0 ) )
            {
            // InternalTCTEMPLATE.g:100:2: ( ( rule__VTCTemplateField__Group__0 ) )
            // InternalTCTEMPLATE.g:101:3: ( rule__VTCTemplateField__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVTCTemplateFieldAccess().getGroup()); 
            }
            // InternalTCTEMPLATE.g:102:3: ( rule__VTCTemplateField__Group__0 )
            // InternalTCTEMPLATE.g:102:4: rule__VTCTemplateField__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__VTCTemplateField__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getVTCTemplateFieldAccess().getGroup()); 
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
    // $ANTLR end "ruleVTCTemplateField"


    // $ANTLR start "entryRuleTMTCIFFieldValue"
    // InternalTCTEMPLATE.g:111:1: entryRuleTMTCIFFieldValue : ruleTMTCIFFieldValue EOF ;
    public final void entryRuleTMTCIFFieldValue() throws RecognitionException {
        try {
            // InternalTCTEMPLATE.g:112:1: ( ruleTMTCIFFieldValue EOF )
            // InternalTCTEMPLATE.g:113:1: ruleTMTCIFFieldValue EOF
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
    // InternalTCTEMPLATE.g:120:1: ruleTMTCIFFieldValue : ( ( rule__TMTCIFFieldValue__Alternatives ) ) ;
    public final void ruleTMTCIFFieldValue() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTCTEMPLATE.g:124:2: ( ( ( rule__TMTCIFFieldValue__Alternatives ) ) )
            // InternalTCTEMPLATE.g:125:2: ( ( rule__TMTCIFFieldValue__Alternatives ) )
            {
            // InternalTCTEMPLATE.g:125:2: ( ( rule__TMTCIFFieldValue__Alternatives ) )
            // InternalTCTEMPLATE.g:126:3: ( rule__TMTCIFFieldValue__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFFieldValueAccess().getAlternatives()); 
            }
            // InternalTCTEMPLATE.g:127:3: ( rule__TMTCIFFieldValue__Alternatives )
            // InternalTCTEMPLATE.g:127:4: rule__TMTCIFFieldValue__Alternatives
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
    // InternalTCTEMPLATE.g:136:1: entryRuleTMTCIFFieldValueRaw : ruleTMTCIFFieldValueRaw EOF ;
    public final void entryRuleTMTCIFFieldValueRaw() throws RecognitionException {
        try {
            // InternalTCTEMPLATE.g:137:1: ( ruleTMTCIFFieldValueRaw EOF )
            // InternalTCTEMPLATE.g:138:1: ruleTMTCIFFieldValueRaw EOF
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
    // InternalTCTEMPLATE.g:145:1: ruleTMTCIFFieldValueRaw : ( ( rule__TMTCIFFieldValueRaw__Group__0 ) ) ;
    public final void ruleTMTCIFFieldValueRaw() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTCTEMPLATE.g:149:2: ( ( ( rule__TMTCIFFieldValueRaw__Group__0 ) ) )
            // InternalTCTEMPLATE.g:150:2: ( ( rule__TMTCIFFieldValueRaw__Group__0 ) )
            {
            // InternalTCTEMPLATE.g:150:2: ( ( rule__TMTCIFFieldValueRaw__Group__0 ) )
            // InternalTCTEMPLATE.g:151:3: ( rule__TMTCIFFieldValueRaw__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFFieldValueRawAccess().getGroup()); 
            }
            // InternalTCTEMPLATE.g:152:3: ( rule__TMTCIFFieldValueRaw__Group__0 )
            // InternalTCTEMPLATE.g:152:4: rule__TMTCIFFieldValueRaw__Group__0
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
    // InternalTCTEMPLATE.g:161:1: entryRuleTMTCIFFieldValueFile : ruleTMTCIFFieldValueFile EOF ;
    public final void entryRuleTMTCIFFieldValueFile() throws RecognitionException {
        try {
            // InternalTCTEMPLATE.g:162:1: ( ruleTMTCIFFieldValueFile EOF )
            // InternalTCTEMPLATE.g:163:1: ruleTMTCIFFieldValueFile EOF
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
    // InternalTCTEMPLATE.g:170:1: ruleTMTCIFFieldValueFile : ( ( rule__TMTCIFFieldValueFile__Group__0 ) ) ;
    public final void ruleTMTCIFFieldValueFile() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTCTEMPLATE.g:174:2: ( ( ( rule__TMTCIFFieldValueFile__Group__0 ) ) )
            // InternalTCTEMPLATE.g:175:2: ( ( rule__TMTCIFFieldValueFile__Group__0 ) )
            {
            // InternalTCTEMPLATE.g:175:2: ( ( rule__TMTCIFFieldValueFile__Group__0 ) )
            // InternalTCTEMPLATE.g:176:3: ( rule__TMTCIFFieldValueFile__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFFieldValueFileAccess().getGroup()); 
            }
            // InternalTCTEMPLATE.g:177:3: ( rule__TMTCIFFieldValueFile__Group__0 )
            // InternalTCTEMPLATE.g:177:4: rule__TMTCIFFieldValueFile__Group__0
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
    // InternalTCTEMPLATE.g:186:1: entryRuleTMTCIFFieldValueEnum : ruleTMTCIFFieldValueEnum EOF ;
    public final void entryRuleTMTCIFFieldValueEnum() throws RecognitionException {
        try {
            // InternalTCTEMPLATE.g:187:1: ( ruleTMTCIFFieldValueEnum EOF )
            // InternalTCTEMPLATE.g:188:1: ruleTMTCIFFieldValueEnum EOF
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
    // InternalTCTEMPLATE.g:195:1: ruleTMTCIFFieldValueEnum : ( ( rule__TMTCIFFieldValueEnum__Group__0 ) ) ;
    public final void ruleTMTCIFFieldValueEnum() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTCTEMPLATE.g:199:2: ( ( ( rule__TMTCIFFieldValueEnum__Group__0 ) ) )
            // InternalTCTEMPLATE.g:200:2: ( ( rule__TMTCIFFieldValueEnum__Group__0 ) )
            {
            // InternalTCTEMPLATE.g:200:2: ( ( rule__TMTCIFFieldValueEnum__Group__0 ) )
            // InternalTCTEMPLATE.g:201:3: ( rule__TMTCIFFieldValueEnum__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFFieldValueEnumAccess().getGroup()); 
            }
            // InternalTCTEMPLATE.g:202:3: ( rule__TMTCIFFieldValueEnum__Group__0 )
            // InternalTCTEMPLATE.g:202:4: rule__TMTCIFFieldValueEnum__Group__0
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


    // $ANTLR start "rule__VTCTemplate__Alternatives_5"
    // InternalTCTEMPLATE.g:210:1: rule__VTCTemplate__Alternatives_5 : ( ( ( rule__VTCTemplate__Group_5_0__0 ) ) | ( '/>' ) );
    public final void rule__VTCTemplate__Alternatives_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTCTEMPLATE.g:214:1: ( ( ( rule__VTCTemplate__Group_5_0__0 ) ) | ( '/>' ) )
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
                    // InternalTCTEMPLATE.g:215:2: ( ( rule__VTCTemplate__Group_5_0__0 ) )
                    {
                    // InternalTCTEMPLATE.g:215:2: ( ( rule__VTCTemplate__Group_5_0__0 ) )
                    // InternalTCTEMPLATE.g:216:3: ( rule__VTCTemplate__Group_5_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getVTCTemplateAccess().getGroup_5_0()); 
                    }
                    // InternalTCTEMPLATE.g:217:3: ( rule__VTCTemplate__Group_5_0__0 )
                    // InternalTCTEMPLATE.g:217:4: rule__VTCTemplate__Group_5_0__0
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__VTCTemplate__Group_5_0__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getVTCTemplateAccess().getGroup_5_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalTCTEMPLATE.g:221:2: ( '/>' )
                    {
                    // InternalTCTEMPLATE.g:221:2: ( '/>' )
                    // InternalTCTEMPLATE.g:222:3: '/>'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getVTCTemplateAccess().getSolidusGreaterThanSignKeyword_5_1()); 
                    }
                    match(input,13,FollowSets000.FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getVTCTemplateAccess().getSolidusGreaterThanSignKeyword_5_1()); 
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
    // $ANTLR end "rule__VTCTemplate__Alternatives_5"


    // $ANTLR start "rule__TMTCIFFieldValue__Alternatives"
    // InternalTCTEMPLATE.g:231:1: rule__TMTCIFFieldValue__Alternatives : ( ( ruleTMTCIFFieldValueRaw ) | ( ruleTMTCIFFieldValueFile ) | ( ruleTMTCIFFieldValueEnum ) );
    public final void rule__TMTCIFFieldValue__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTCTEMPLATE.g:235:1: ( ( ruleTMTCIFFieldValueRaw ) | ( ruleTMTCIFFieldValueFile ) | ( ruleTMTCIFFieldValueEnum ) )
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
                    // InternalTCTEMPLATE.g:236:2: ( ruleTMTCIFFieldValueRaw )
                    {
                    // InternalTCTEMPLATE.g:236:2: ( ruleTMTCIFFieldValueRaw )
                    // InternalTCTEMPLATE.g:237:3: ruleTMTCIFFieldValueRaw
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
                    // InternalTCTEMPLATE.g:242:2: ( ruleTMTCIFFieldValueFile )
                    {
                    // InternalTCTEMPLATE.g:242:2: ( ruleTMTCIFFieldValueFile )
                    // InternalTCTEMPLATE.g:243:3: ruleTMTCIFFieldValueFile
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
                    // InternalTCTEMPLATE.g:248:2: ( ruleTMTCIFFieldValueEnum )
                    {
                    // InternalTCTEMPLATE.g:248:2: ( ruleTMTCIFFieldValueEnum )
                    // InternalTCTEMPLATE.g:249:3: ruleTMTCIFFieldValueEnum
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
    // InternalTCTEMPLATE.g:258:1: rule__TMTCIFFieldValueRaw__ValueAlternatives_2_0 : ( ( RULE_UINT_STRING ) | ( RULE_HEX_STRING ) );
    public final void rule__TMTCIFFieldValueRaw__ValueAlternatives_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTCTEMPLATE.g:262:1: ( ( RULE_UINT_STRING ) | ( RULE_HEX_STRING ) )
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
                    // InternalTCTEMPLATE.g:263:2: ( RULE_UINT_STRING )
                    {
                    // InternalTCTEMPLATE.g:263:2: ( RULE_UINT_STRING )
                    // InternalTCTEMPLATE.g:264:3: RULE_UINT_STRING
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
                    // InternalTCTEMPLATE.g:269:2: ( RULE_HEX_STRING )
                    {
                    // InternalTCTEMPLATE.g:269:2: ( RULE_HEX_STRING )
                    // InternalTCTEMPLATE.g:270:3: RULE_HEX_STRING
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


    // $ANTLR start "rule__VTCTemplate__Group__0"
    // InternalTCTEMPLATE.g:279:1: rule__VTCTemplate__Group__0 : rule__VTCTemplate__Group__0__Impl rule__VTCTemplate__Group__1 ;
    public final void rule__VTCTemplate__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTCTEMPLATE.g:283:1: ( rule__VTCTemplate__Group__0__Impl rule__VTCTemplate__Group__1 )
            // InternalTCTEMPLATE.g:284:2: rule__VTCTemplate__Group__0__Impl rule__VTCTemplate__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_3);
            rule__VTCTemplate__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__VTCTemplate__Group__1();

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
    // $ANTLR end "rule__VTCTemplate__Group__0"


    // $ANTLR start "rule__VTCTemplate__Group__0__Impl"
    // InternalTCTEMPLATE.g:291:1: rule__VTCTemplate__Group__0__Impl : ( '<TCTemplate' ) ;
    public final void rule__VTCTemplate__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTCTEMPLATE.g:295:1: ( ( '<TCTemplate' ) )
            // InternalTCTEMPLATE.g:296:1: ( '<TCTemplate' )
            {
            // InternalTCTEMPLATE.g:296:1: ( '<TCTemplate' )
            // InternalTCTEMPLATE.g:297:2: '<TCTemplate'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVTCTemplateAccess().getTCTemplateKeyword_0()); 
            }
            match(input,14,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getVTCTemplateAccess().getTCTemplateKeyword_0()); 
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
    // $ANTLR end "rule__VTCTemplate__Group__0__Impl"


    // $ANTLR start "rule__VTCTemplate__Group__1"
    // InternalTCTEMPLATE.g:306:1: rule__VTCTemplate__Group__1 : rule__VTCTemplate__Group__1__Impl rule__VTCTemplate__Group__2 ;
    public final void rule__VTCTemplate__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTCTEMPLATE.g:310:1: ( rule__VTCTemplate__Group__1__Impl rule__VTCTemplate__Group__2 )
            // InternalTCTEMPLATE.g:311:2: rule__VTCTemplate__Group__1__Impl rule__VTCTemplate__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_4);
            rule__VTCTemplate__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__VTCTemplate__Group__2();

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
    // $ANTLR end "rule__VTCTemplate__Group__1"


    // $ANTLR start "rule__VTCTemplate__Group__1__Impl"
    // InternalTCTEMPLATE.g:318:1: rule__VTCTemplate__Group__1__Impl : ( 'name=' ) ;
    public final void rule__VTCTemplate__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTCTEMPLATE.g:322:1: ( ( 'name=' ) )
            // InternalTCTEMPLATE.g:323:1: ( 'name=' )
            {
            // InternalTCTEMPLATE.g:323:1: ( 'name=' )
            // InternalTCTEMPLATE.g:324:2: 'name='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVTCTemplateAccess().getNameKeyword_1()); 
            }
            match(input,15,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getVTCTemplateAccess().getNameKeyword_1()); 
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
    // $ANTLR end "rule__VTCTemplate__Group__1__Impl"


    // $ANTLR start "rule__VTCTemplate__Group__2"
    // InternalTCTEMPLATE.g:333:1: rule__VTCTemplate__Group__2 : rule__VTCTemplate__Group__2__Impl rule__VTCTemplate__Group__3 ;
    public final void rule__VTCTemplate__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTCTEMPLATE.g:337:1: ( rule__VTCTemplate__Group__2__Impl rule__VTCTemplate__Group__3 )
            // InternalTCTEMPLATE.g:338:2: rule__VTCTemplate__Group__2__Impl rule__VTCTemplate__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_5);
            rule__VTCTemplate__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__VTCTemplate__Group__3();

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
    // $ANTLR end "rule__VTCTemplate__Group__2"


    // $ANTLR start "rule__VTCTemplate__Group__2__Impl"
    // InternalTCTEMPLATE.g:345:1: rule__VTCTemplate__Group__2__Impl : ( ( rule__VTCTemplate__NameAssignment_2 ) ) ;
    public final void rule__VTCTemplate__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTCTEMPLATE.g:349:1: ( ( ( rule__VTCTemplate__NameAssignment_2 ) ) )
            // InternalTCTEMPLATE.g:350:1: ( ( rule__VTCTemplate__NameAssignment_2 ) )
            {
            // InternalTCTEMPLATE.g:350:1: ( ( rule__VTCTemplate__NameAssignment_2 ) )
            // InternalTCTEMPLATE.g:351:2: ( rule__VTCTemplate__NameAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVTCTemplateAccess().getNameAssignment_2()); 
            }
            // InternalTCTEMPLATE.g:352:2: ( rule__VTCTemplate__NameAssignment_2 )
            // InternalTCTEMPLATE.g:352:3: rule__VTCTemplate__NameAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__VTCTemplate__NameAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getVTCTemplateAccess().getNameAssignment_2()); 
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
    // $ANTLR end "rule__VTCTemplate__Group__2__Impl"


    // $ANTLR start "rule__VTCTemplate__Group__3"
    // InternalTCTEMPLATE.g:360:1: rule__VTCTemplate__Group__3 : rule__VTCTemplate__Group__3__Impl rule__VTCTemplate__Group__4 ;
    public final void rule__VTCTemplate__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTCTEMPLATE.g:364:1: ( rule__VTCTemplate__Group__3__Impl rule__VTCTemplate__Group__4 )
            // InternalTCTEMPLATE.g:365:2: rule__VTCTemplate__Group__3__Impl rule__VTCTemplate__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_4);
            rule__VTCTemplate__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__VTCTemplate__Group__4();

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
    // $ANTLR end "rule__VTCTemplate__Group__3"


    // $ANTLR start "rule__VTCTemplate__Group__3__Impl"
    // InternalTCTEMPLATE.g:372:1: rule__VTCTemplate__Group__3__Impl : ( 'tc=' ) ;
    public final void rule__VTCTemplate__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTCTEMPLATE.g:376:1: ( ( 'tc=' ) )
            // InternalTCTEMPLATE.g:377:1: ( 'tc=' )
            {
            // InternalTCTEMPLATE.g:377:1: ( 'tc=' )
            // InternalTCTEMPLATE.g:378:2: 'tc='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVTCTemplateAccess().getTcKeyword_3()); 
            }
            match(input,16,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getVTCTemplateAccess().getTcKeyword_3()); 
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
    // $ANTLR end "rule__VTCTemplate__Group__3__Impl"


    // $ANTLR start "rule__VTCTemplate__Group__4"
    // InternalTCTEMPLATE.g:387:1: rule__VTCTemplate__Group__4 : rule__VTCTemplate__Group__4__Impl rule__VTCTemplate__Group__5 ;
    public final void rule__VTCTemplate__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTCTEMPLATE.g:391:1: ( rule__VTCTemplate__Group__4__Impl rule__VTCTemplate__Group__5 )
            // InternalTCTEMPLATE.g:392:2: rule__VTCTemplate__Group__4__Impl rule__VTCTemplate__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_6);
            rule__VTCTemplate__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__VTCTemplate__Group__5();

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
    // $ANTLR end "rule__VTCTemplate__Group__4"


    // $ANTLR start "rule__VTCTemplate__Group__4__Impl"
    // InternalTCTEMPLATE.g:399:1: rule__VTCTemplate__Group__4__Impl : ( ( rule__VTCTemplate__TcAssignment_4 ) ) ;
    public final void rule__VTCTemplate__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTCTEMPLATE.g:403:1: ( ( ( rule__VTCTemplate__TcAssignment_4 ) ) )
            // InternalTCTEMPLATE.g:404:1: ( ( rule__VTCTemplate__TcAssignment_4 ) )
            {
            // InternalTCTEMPLATE.g:404:1: ( ( rule__VTCTemplate__TcAssignment_4 ) )
            // InternalTCTEMPLATE.g:405:2: ( rule__VTCTemplate__TcAssignment_4 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVTCTemplateAccess().getTcAssignment_4()); 
            }
            // InternalTCTEMPLATE.g:406:2: ( rule__VTCTemplate__TcAssignment_4 )
            // InternalTCTEMPLATE.g:406:3: rule__VTCTemplate__TcAssignment_4
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__VTCTemplate__TcAssignment_4();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getVTCTemplateAccess().getTcAssignment_4()); 
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
    // $ANTLR end "rule__VTCTemplate__Group__4__Impl"


    // $ANTLR start "rule__VTCTemplate__Group__5"
    // InternalTCTEMPLATE.g:414:1: rule__VTCTemplate__Group__5 : rule__VTCTemplate__Group__5__Impl ;
    public final void rule__VTCTemplate__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTCTEMPLATE.g:418:1: ( rule__VTCTemplate__Group__5__Impl )
            // InternalTCTEMPLATE.g:419:2: rule__VTCTemplate__Group__5__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__VTCTemplate__Group__5__Impl();

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
    // $ANTLR end "rule__VTCTemplate__Group__5"


    // $ANTLR start "rule__VTCTemplate__Group__5__Impl"
    // InternalTCTEMPLATE.g:425:1: rule__VTCTemplate__Group__5__Impl : ( ( rule__VTCTemplate__Alternatives_5 ) ) ;
    public final void rule__VTCTemplate__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTCTEMPLATE.g:429:1: ( ( ( rule__VTCTemplate__Alternatives_5 ) ) )
            // InternalTCTEMPLATE.g:430:1: ( ( rule__VTCTemplate__Alternatives_5 ) )
            {
            // InternalTCTEMPLATE.g:430:1: ( ( rule__VTCTemplate__Alternatives_5 ) )
            // InternalTCTEMPLATE.g:431:2: ( rule__VTCTemplate__Alternatives_5 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVTCTemplateAccess().getAlternatives_5()); 
            }
            // InternalTCTEMPLATE.g:432:2: ( rule__VTCTemplate__Alternatives_5 )
            // InternalTCTEMPLATE.g:432:3: rule__VTCTemplate__Alternatives_5
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__VTCTemplate__Alternatives_5();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getVTCTemplateAccess().getAlternatives_5()); 
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
    // $ANTLR end "rule__VTCTemplate__Group__5__Impl"


    // $ANTLR start "rule__VTCTemplate__Group_5_0__0"
    // InternalTCTEMPLATE.g:441:1: rule__VTCTemplate__Group_5_0__0 : rule__VTCTemplate__Group_5_0__0__Impl rule__VTCTemplate__Group_5_0__1 ;
    public final void rule__VTCTemplate__Group_5_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTCTEMPLATE.g:445:1: ( rule__VTCTemplate__Group_5_0__0__Impl rule__VTCTemplate__Group_5_0__1 )
            // InternalTCTEMPLATE.g:446:2: rule__VTCTemplate__Group_5_0__0__Impl rule__VTCTemplate__Group_5_0__1
            {
            pushFollow(FollowSets000.FOLLOW_7);
            rule__VTCTemplate__Group_5_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__VTCTemplate__Group_5_0__1();

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
    // $ANTLR end "rule__VTCTemplate__Group_5_0__0"


    // $ANTLR start "rule__VTCTemplate__Group_5_0__0__Impl"
    // InternalTCTEMPLATE.g:453:1: rule__VTCTemplate__Group_5_0__0__Impl : ( '>' ) ;
    public final void rule__VTCTemplate__Group_5_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTCTEMPLATE.g:457:1: ( ( '>' ) )
            // InternalTCTEMPLATE.g:458:1: ( '>' )
            {
            // InternalTCTEMPLATE.g:458:1: ( '>' )
            // InternalTCTEMPLATE.g:459:2: '>'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVTCTemplateAccess().getGreaterThanSignKeyword_5_0_0()); 
            }
            match(input,17,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getVTCTemplateAccess().getGreaterThanSignKeyword_5_0_0()); 
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
    // $ANTLR end "rule__VTCTemplate__Group_5_0__0__Impl"


    // $ANTLR start "rule__VTCTemplate__Group_5_0__1"
    // InternalTCTEMPLATE.g:468:1: rule__VTCTemplate__Group_5_0__1 : rule__VTCTemplate__Group_5_0__1__Impl rule__VTCTemplate__Group_5_0__2 ;
    public final void rule__VTCTemplate__Group_5_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTCTEMPLATE.g:472:1: ( rule__VTCTemplate__Group_5_0__1__Impl rule__VTCTemplate__Group_5_0__2 )
            // InternalTCTEMPLATE.g:473:2: rule__VTCTemplate__Group_5_0__1__Impl rule__VTCTemplate__Group_5_0__2
            {
            pushFollow(FollowSets000.FOLLOW_7);
            rule__VTCTemplate__Group_5_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__VTCTemplate__Group_5_0__2();

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
    // $ANTLR end "rule__VTCTemplate__Group_5_0__1"


    // $ANTLR start "rule__VTCTemplate__Group_5_0__1__Impl"
    // InternalTCTEMPLATE.g:480:1: rule__VTCTemplate__Group_5_0__1__Impl : ( ( rule__VTCTemplate__Group_5_0_1__0 )? ) ;
    public final void rule__VTCTemplate__Group_5_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTCTEMPLATE.g:484:1: ( ( ( rule__VTCTemplate__Group_5_0_1__0 )? ) )
            // InternalTCTEMPLATE.g:485:1: ( ( rule__VTCTemplate__Group_5_0_1__0 )? )
            {
            // InternalTCTEMPLATE.g:485:1: ( ( rule__VTCTemplate__Group_5_0_1__0 )? )
            // InternalTCTEMPLATE.g:486:2: ( rule__VTCTemplate__Group_5_0_1__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVTCTemplateAccess().getGroup_5_0_1()); 
            }
            // InternalTCTEMPLATE.g:487:2: ( rule__VTCTemplate__Group_5_0_1__0 )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==19) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalTCTEMPLATE.g:487:3: rule__VTCTemplate__Group_5_0_1__0
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__VTCTemplate__Group_5_0_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getVTCTemplateAccess().getGroup_5_0_1()); 
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
    // $ANTLR end "rule__VTCTemplate__Group_5_0__1__Impl"


    // $ANTLR start "rule__VTCTemplate__Group_5_0__2"
    // InternalTCTEMPLATE.g:495:1: rule__VTCTemplate__Group_5_0__2 : rule__VTCTemplate__Group_5_0__2__Impl ;
    public final void rule__VTCTemplate__Group_5_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTCTEMPLATE.g:499:1: ( rule__VTCTemplate__Group_5_0__2__Impl )
            // InternalTCTEMPLATE.g:500:2: rule__VTCTemplate__Group_5_0__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__VTCTemplate__Group_5_0__2__Impl();

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
    // $ANTLR end "rule__VTCTemplate__Group_5_0__2"


    // $ANTLR start "rule__VTCTemplate__Group_5_0__2__Impl"
    // InternalTCTEMPLATE.g:506:1: rule__VTCTemplate__Group_5_0__2__Impl : ( '</TCTemplate>' ) ;
    public final void rule__VTCTemplate__Group_5_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTCTEMPLATE.g:510:1: ( ( '</TCTemplate>' ) )
            // InternalTCTEMPLATE.g:511:1: ( '</TCTemplate>' )
            {
            // InternalTCTEMPLATE.g:511:1: ( '</TCTemplate>' )
            // InternalTCTEMPLATE.g:512:2: '</TCTemplate>'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVTCTemplateAccess().getTCTemplateKeyword_5_0_2()); 
            }
            match(input,18,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getVTCTemplateAccess().getTCTemplateKeyword_5_0_2()); 
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
    // $ANTLR end "rule__VTCTemplate__Group_5_0__2__Impl"


    // $ANTLR start "rule__VTCTemplate__Group_5_0_1__0"
    // InternalTCTEMPLATE.g:522:1: rule__VTCTemplate__Group_5_0_1__0 : rule__VTCTemplate__Group_5_0_1__0__Impl rule__VTCTemplate__Group_5_0_1__1 ;
    public final void rule__VTCTemplate__Group_5_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTCTEMPLATE.g:526:1: ( rule__VTCTemplate__Group_5_0_1__0__Impl rule__VTCTemplate__Group_5_0_1__1 )
            // InternalTCTEMPLATE.g:527:2: rule__VTCTemplate__Group_5_0_1__0__Impl rule__VTCTemplate__Group_5_0_1__1
            {
            pushFollow(FollowSets000.FOLLOW_8);
            rule__VTCTemplate__Group_5_0_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__VTCTemplate__Group_5_0_1__1();

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
    // $ANTLR end "rule__VTCTemplate__Group_5_0_1__0"


    // $ANTLR start "rule__VTCTemplate__Group_5_0_1__0__Impl"
    // InternalTCTEMPLATE.g:534:1: rule__VTCTemplate__Group_5_0_1__0__Impl : ( '<Fields>' ) ;
    public final void rule__VTCTemplate__Group_5_0_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTCTEMPLATE.g:538:1: ( ( '<Fields>' ) )
            // InternalTCTEMPLATE.g:539:1: ( '<Fields>' )
            {
            // InternalTCTEMPLATE.g:539:1: ( '<Fields>' )
            // InternalTCTEMPLATE.g:540:2: '<Fields>'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVTCTemplateAccess().getFieldsKeyword_5_0_1_0()); 
            }
            match(input,19,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getVTCTemplateAccess().getFieldsKeyword_5_0_1_0()); 
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
    // $ANTLR end "rule__VTCTemplate__Group_5_0_1__0__Impl"


    // $ANTLR start "rule__VTCTemplate__Group_5_0_1__1"
    // InternalTCTEMPLATE.g:549:1: rule__VTCTemplate__Group_5_0_1__1 : rule__VTCTemplate__Group_5_0_1__1__Impl rule__VTCTemplate__Group_5_0_1__2 ;
    public final void rule__VTCTemplate__Group_5_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTCTEMPLATE.g:553:1: ( rule__VTCTemplate__Group_5_0_1__1__Impl rule__VTCTemplate__Group_5_0_1__2 )
            // InternalTCTEMPLATE.g:554:2: rule__VTCTemplate__Group_5_0_1__1__Impl rule__VTCTemplate__Group_5_0_1__2
            {
            pushFollow(FollowSets000.FOLLOW_9);
            rule__VTCTemplate__Group_5_0_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__VTCTemplate__Group_5_0_1__2();

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
    // $ANTLR end "rule__VTCTemplate__Group_5_0_1__1"


    // $ANTLR start "rule__VTCTemplate__Group_5_0_1__1__Impl"
    // InternalTCTEMPLATE.g:561:1: rule__VTCTemplate__Group_5_0_1__1__Impl : ( ( ( rule__VTCTemplate__FieldsAssignment_5_0_1_1 ) ) ( ( rule__VTCTemplate__FieldsAssignment_5_0_1_1 )* ) ) ;
    public final void rule__VTCTemplate__Group_5_0_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTCTEMPLATE.g:565:1: ( ( ( ( rule__VTCTemplate__FieldsAssignment_5_0_1_1 ) ) ( ( rule__VTCTemplate__FieldsAssignment_5_0_1_1 )* ) ) )
            // InternalTCTEMPLATE.g:566:1: ( ( ( rule__VTCTemplate__FieldsAssignment_5_0_1_1 ) ) ( ( rule__VTCTemplate__FieldsAssignment_5_0_1_1 )* ) )
            {
            // InternalTCTEMPLATE.g:566:1: ( ( ( rule__VTCTemplate__FieldsAssignment_5_0_1_1 ) ) ( ( rule__VTCTemplate__FieldsAssignment_5_0_1_1 )* ) )
            // InternalTCTEMPLATE.g:567:2: ( ( rule__VTCTemplate__FieldsAssignment_5_0_1_1 ) ) ( ( rule__VTCTemplate__FieldsAssignment_5_0_1_1 )* )
            {
            // InternalTCTEMPLATE.g:567:2: ( ( rule__VTCTemplate__FieldsAssignment_5_0_1_1 ) )
            // InternalTCTEMPLATE.g:568:3: ( rule__VTCTemplate__FieldsAssignment_5_0_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVTCTemplateAccess().getFieldsAssignment_5_0_1_1()); 
            }
            // InternalTCTEMPLATE.g:569:3: ( rule__VTCTemplate__FieldsAssignment_5_0_1_1 )
            // InternalTCTEMPLATE.g:569:4: rule__VTCTemplate__FieldsAssignment_5_0_1_1
            {
            pushFollow(FollowSets000.FOLLOW_10);
            rule__VTCTemplate__FieldsAssignment_5_0_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getVTCTemplateAccess().getFieldsAssignment_5_0_1_1()); 
            }

            }

            // InternalTCTEMPLATE.g:572:2: ( ( rule__VTCTemplate__FieldsAssignment_5_0_1_1 )* )
            // InternalTCTEMPLATE.g:573:3: ( rule__VTCTemplate__FieldsAssignment_5_0_1_1 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVTCTemplateAccess().getFieldsAssignment_5_0_1_1()); 
            }
            // InternalTCTEMPLATE.g:574:3: ( rule__VTCTemplate__FieldsAssignment_5_0_1_1 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==21) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalTCTEMPLATE.g:574:4: rule__VTCTemplate__FieldsAssignment_5_0_1_1
            	    {
            	    pushFollow(FollowSets000.FOLLOW_10);
            	    rule__VTCTemplate__FieldsAssignment_5_0_1_1();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getVTCTemplateAccess().getFieldsAssignment_5_0_1_1()); 
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
    // $ANTLR end "rule__VTCTemplate__Group_5_0_1__1__Impl"


    // $ANTLR start "rule__VTCTemplate__Group_5_0_1__2"
    // InternalTCTEMPLATE.g:583:1: rule__VTCTemplate__Group_5_0_1__2 : rule__VTCTemplate__Group_5_0_1__2__Impl ;
    public final void rule__VTCTemplate__Group_5_0_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTCTEMPLATE.g:587:1: ( rule__VTCTemplate__Group_5_0_1__2__Impl )
            // InternalTCTEMPLATE.g:588:2: rule__VTCTemplate__Group_5_0_1__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__VTCTemplate__Group_5_0_1__2__Impl();

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
    // $ANTLR end "rule__VTCTemplate__Group_5_0_1__2"


    // $ANTLR start "rule__VTCTemplate__Group_5_0_1__2__Impl"
    // InternalTCTEMPLATE.g:594:1: rule__VTCTemplate__Group_5_0_1__2__Impl : ( '</Fields>' ) ;
    public final void rule__VTCTemplate__Group_5_0_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTCTEMPLATE.g:598:1: ( ( '</Fields>' ) )
            // InternalTCTEMPLATE.g:599:1: ( '</Fields>' )
            {
            // InternalTCTEMPLATE.g:599:1: ( '</Fields>' )
            // InternalTCTEMPLATE.g:600:2: '</Fields>'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVTCTemplateAccess().getFieldsKeyword_5_0_1_2()); 
            }
            match(input,20,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getVTCTemplateAccess().getFieldsKeyword_5_0_1_2()); 
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
    // $ANTLR end "rule__VTCTemplate__Group_5_0_1__2__Impl"


    // $ANTLR start "rule__VTCTemplateField__Group__0"
    // InternalTCTEMPLATE.g:610:1: rule__VTCTemplateField__Group__0 : rule__VTCTemplateField__Group__0__Impl rule__VTCTemplateField__Group__1 ;
    public final void rule__VTCTemplateField__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTCTEMPLATE.g:614:1: ( rule__VTCTemplateField__Group__0__Impl rule__VTCTemplateField__Group__1 )
            // InternalTCTEMPLATE.g:615:2: rule__VTCTemplateField__Group__0__Impl rule__VTCTemplateField__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_11);
            rule__VTCTemplateField__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__VTCTemplateField__Group__1();

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
    // $ANTLR end "rule__VTCTemplateField__Group__0"


    // $ANTLR start "rule__VTCTemplateField__Group__0__Impl"
    // InternalTCTEMPLATE.g:622:1: rule__VTCTemplateField__Group__0__Impl : ( '<Field' ) ;
    public final void rule__VTCTemplateField__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTCTEMPLATE.g:626:1: ( ( '<Field' ) )
            // InternalTCTEMPLATE.g:627:1: ( '<Field' )
            {
            // InternalTCTEMPLATE.g:627:1: ( '<Field' )
            // InternalTCTEMPLATE.g:628:2: '<Field'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVTCTemplateFieldAccess().getFieldKeyword_0()); 
            }
            match(input,21,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getVTCTemplateFieldAccess().getFieldKeyword_0()); 
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
    // $ANTLR end "rule__VTCTemplateField__Group__0__Impl"


    // $ANTLR start "rule__VTCTemplateField__Group__1"
    // InternalTCTEMPLATE.g:637:1: rule__VTCTemplateField__Group__1 : rule__VTCTemplateField__Group__1__Impl rule__VTCTemplateField__Group__2 ;
    public final void rule__VTCTemplateField__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTCTEMPLATE.g:641:1: ( rule__VTCTemplateField__Group__1__Impl rule__VTCTemplateField__Group__2 )
            // InternalTCTEMPLATE.g:642:2: rule__VTCTemplateField__Group__1__Impl rule__VTCTemplateField__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_4);
            rule__VTCTemplateField__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__VTCTemplateField__Group__2();

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
    // $ANTLR end "rule__VTCTemplateField__Group__1"


    // $ANTLR start "rule__VTCTemplateField__Group__1__Impl"
    // InternalTCTEMPLATE.g:649:1: rule__VTCTemplateField__Group__1__Impl : ( 'fieldRef=' ) ;
    public final void rule__VTCTemplateField__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTCTEMPLATE.g:653:1: ( ( 'fieldRef=' ) )
            // InternalTCTEMPLATE.g:654:1: ( 'fieldRef=' )
            {
            // InternalTCTEMPLATE.g:654:1: ( 'fieldRef=' )
            // InternalTCTEMPLATE.g:655:2: 'fieldRef='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVTCTemplateFieldAccess().getFieldRefKeyword_1()); 
            }
            match(input,22,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getVTCTemplateFieldAccess().getFieldRefKeyword_1()); 
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
    // $ANTLR end "rule__VTCTemplateField__Group__1__Impl"


    // $ANTLR start "rule__VTCTemplateField__Group__2"
    // InternalTCTEMPLATE.g:664:1: rule__VTCTemplateField__Group__2 : rule__VTCTemplateField__Group__2__Impl rule__VTCTemplateField__Group__3 ;
    public final void rule__VTCTemplateField__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTCTEMPLATE.g:668:1: ( rule__VTCTemplateField__Group__2__Impl rule__VTCTemplateField__Group__3 )
            // InternalTCTEMPLATE.g:669:2: rule__VTCTemplateField__Group__2__Impl rule__VTCTemplateField__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_12);
            rule__VTCTemplateField__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__VTCTemplateField__Group__3();

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
    // $ANTLR end "rule__VTCTemplateField__Group__2"


    // $ANTLR start "rule__VTCTemplateField__Group__2__Impl"
    // InternalTCTEMPLATE.g:676:1: rule__VTCTemplateField__Group__2__Impl : ( ( rule__VTCTemplateField__FieldRefAssignment_2 ) ) ;
    public final void rule__VTCTemplateField__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTCTEMPLATE.g:680:1: ( ( ( rule__VTCTemplateField__FieldRefAssignment_2 ) ) )
            // InternalTCTEMPLATE.g:681:1: ( ( rule__VTCTemplateField__FieldRefAssignment_2 ) )
            {
            // InternalTCTEMPLATE.g:681:1: ( ( rule__VTCTemplateField__FieldRefAssignment_2 ) )
            // InternalTCTEMPLATE.g:682:2: ( rule__VTCTemplateField__FieldRefAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVTCTemplateFieldAccess().getFieldRefAssignment_2()); 
            }
            // InternalTCTEMPLATE.g:683:2: ( rule__VTCTemplateField__FieldRefAssignment_2 )
            // InternalTCTEMPLATE.g:683:3: rule__VTCTemplateField__FieldRefAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__VTCTemplateField__FieldRefAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getVTCTemplateFieldAccess().getFieldRefAssignment_2()); 
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
    // $ANTLR end "rule__VTCTemplateField__Group__2__Impl"


    // $ANTLR start "rule__VTCTemplateField__Group__3"
    // InternalTCTEMPLATE.g:691:1: rule__VTCTemplateField__Group__3 : rule__VTCTemplateField__Group__3__Impl rule__VTCTemplateField__Group__4 ;
    public final void rule__VTCTemplateField__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTCTEMPLATE.g:695:1: ( rule__VTCTemplateField__Group__3__Impl rule__VTCTemplateField__Group__4 )
            // InternalTCTEMPLATE.g:696:2: rule__VTCTemplateField__Group__3__Impl rule__VTCTemplateField__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_13);
            rule__VTCTemplateField__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__VTCTemplateField__Group__4();

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
    // $ANTLR end "rule__VTCTemplateField__Group__3"


    // $ANTLR start "rule__VTCTemplateField__Group__3__Impl"
    // InternalTCTEMPLATE.g:703:1: rule__VTCTemplateField__Group__3__Impl : ( '>' ) ;
    public final void rule__VTCTemplateField__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTCTEMPLATE.g:707:1: ( ( '>' ) )
            // InternalTCTEMPLATE.g:708:1: ( '>' )
            {
            // InternalTCTEMPLATE.g:708:1: ( '>' )
            // InternalTCTEMPLATE.g:709:2: '>'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVTCTemplateFieldAccess().getGreaterThanSignKeyword_3()); 
            }
            match(input,17,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getVTCTemplateFieldAccess().getGreaterThanSignKeyword_3()); 
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
    // $ANTLR end "rule__VTCTemplateField__Group__3__Impl"


    // $ANTLR start "rule__VTCTemplateField__Group__4"
    // InternalTCTEMPLATE.g:718:1: rule__VTCTemplateField__Group__4 : rule__VTCTemplateField__Group__4__Impl rule__VTCTemplateField__Group__5 ;
    public final void rule__VTCTemplateField__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTCTEMPLATE.g:722:1: ( rule__VTCTemplateField__Group__4__Impl rule__VTCTemplateField__Group__5 )
            // InternalTCTEMPLATE.g:723:2: rule__VTCTemplateField__Group__4__Impl rule__VTCTemplateField__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_14);
            rule__VTCTemplateField__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__VTCTemplateField__Group__5();

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
    // $ANTLR end "rule__VTCTemplateField__Group__4"


    // $ANTLR start "rule__VTCTemplateField__Group__4__Impl"
    // InternalTCTEMPLATE.g:730:1: rule__VTCTemplateField__Group__4__Impl : ( ( rule__VTCTemplateField__ValueAssignment_4 ) ) ;
    public final void rule__VTCTemplateField__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTCTEMPLATE.g:734:1: ( ( ( rule__VTCTemplateField__ValueAssignment_4 ) ) )
            // InternalTCTEMPLATE.g:735:1: ( ( rule__VTCTemplateField__ValueAssignment_4 ) )
            {
            // InternalTCTEMPLATE.g:735:1: ( ( rule__VTCTemplateField__ValueAssignment_4 ) )
            // InternalTCTEMPLATE.g:736:2: ( rule__VTCTemplateField__ValueAssignment_4 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVTCTemplateFieldAccess().getValueAssignment_4()); 
            }
            // InternalTCTEMPLATE.g:737:2: ( rule__VTCTemplateField__ValueAssignment_4 )
            // InternalTCTEMPLATE.g:737:3: rule__VTCTemplateField__ValueAssignment_4
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__VTCTemplateField__ValueAssignment_4();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getVTCTemplateFieldAccess().getValueAssignment_4()); 
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
    // $ANTLR end "rule__VTCTemplateField__Group__4__Impl"


    // $ANTLR start "rule__VTCTemplateField__Group__5"
    // InternalTCTEMPLATE.g:745:1: rule__VTCTemplateField__Group__5 : rule__VTCTemplateField__Group__5__Impl ;
    public final void rule__VTCTemplateField__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTCTEMPLATE.g:749:1: ( rule__VTCTemplateField__Group__5__Impl )
            // InternalTCTEMPLATE.g:750:2: rule__VTCTemplateField__Group__5__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__VTCTemplateField__Group__5__Impl();

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
    // $ANTLR end "rule__VTCTemplateField__Group__5"


    // $ANTLR start "rule__VTCTemplateField__Group__5__Impl"
    // InternalTCTEMPLATE.g:756:1: rule__VTCTemplateField__Group__5__Impl : ( '</Field>' ) ;
    public final void rule__VTCTemplateField__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTCTEMPLATE.g:760:1: ( ( '</Field>' ) )
            // InternalTCTEMPLATE.g:761:1: ( '</Field>' )
            {
            // InternalTCTEMPLATE.g:761:1: ( '</Field>' )
            // InternalTCTEMPLATE.g:762:2: '</Field>'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVTCTemplateFieldAccess().getFieldKeyword_5()); 
            }
            match(input,23,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getVTCTemplateFieldAccess().getFieldKeyword_5()); 
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
    // $ANTLR end "rule__VTCTemplateField__Group__5__Impl"


    // $ANTLR start "rule__TMTCIFFieldValueRaw__Group__0"
    // InternalTCTEMPLATE.g:772:1: rule__TMTCIFFieldValueRaw__Group__0 : rule__TMTCIFFieldValueRaw__Group__0__Impl rule__TMTCIFFieldValueRaw__Group__1 ;
    public final void rule__TMTCIFFieldValueRaw__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTCTEMPLATE.g:776:1: ( rule__TMTCIFFieldValueRaw__Group__0__Impl rule__TMTCIFFieldValueRaw__Group__1 )
            // InternalTCTEMPLATE.g:777:2: rule__TMTCIFFieldValueRaw__Group__0__Impl rule__TMTCIFFieldValueRaw__Group__1
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
    // InternalTCTEMPLATE.g:784:1: rule__TMTCIFFieldValueRaw__Group__0__Impl : ( '<FieldValueRaw' ) ;
    public final void rule__TMTCIFFieldValueRaw__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTCTEMPLATE.g:788:1: ( ( '<FieldValueRaw' ) )
            // InternalTCTEMPLATE.g:789:1: ( '<FieldValueRaw' )
            {
            // InternalTCTEMPLATE.g:789:1: ( '<FieldValueRaw' )
            // InternalTCTEMPLATE.g:790:2: '<FieldValueRaw'
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
    // InternalTCTEMPLATE.g:799:1: rule__TMTCIFFieldValueRaw__Group__1 : rule__TMTCIFFieldValueRaw__Group__1__Impl rule__TMTCIFFieldValueRaw__Group__2 ;
    public final void rule__TMTCIFFieldValueRaw__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTCTEMPLATE.g:803:1: ( rule__TMTCIFFieldValueRaw__Group__1__Impl rule__TMTCIFFieldValueRaw__Group__2 )
            // InternalTCTEMPLATE.g:804:2: rule__TMTCIFFieldValueRaw__Group__1__Impl rule__TMTCIFFieldValueRaw__Group__2
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
    // InternalTCTEMPLATE.g:811:1: rule__TMTCIFFieldValueRaw__Group__1__Impl : ( 'value=' ) ;
    public final void rule__TMTCIFFieldValueRaw__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTCTEMPLATE.g:815:1: ( ( 'value=' ) )
            // InternalTCTEMPLATE.g:816:1: ( 'value=' )
            {
            // InternalTCTEMPLATE.g:816:1: ( 'value=' )
            // InternalTCTEMPLATE.g:817:2: 'value='
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
    // InternalTCTEMPLATE.g:826:1: rule__TMTCIFFieldValueRaw__Group__2 : rule__TMTCIFFieldValueRaw__Group__2__Impl rule__TMTCIFFieldValueRaw__Group__3 ;
    public final void rule__TMTCIFFieldValueRaw__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTCTEMPLATE.g:830:1: ( rule__TMTCIFFieldValueRaw__Group__2__Impl rule__TMTCIFFieldValueRaw__Group__3 )
            // InternalTCTEMPLATE.g:831:2: rule__TMTCIFFieldValueRaw__Group__2__Impl rule__TMTCIFFieldValueRaw__Group__3
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
    // InternalTCTEMPLATE.g:838:1: rule__TMTCIFFieldValueRaw__Group__2__Impl : ( ( rule__TMTCIFFieldValueRaw__ValueAssignment_2 ) ) ;
    public final void rule__TMTCIFFieldValueRaw__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTCTEMPLATE.g:842:1: ( ( ( rule__TMTCIFFieldValueRaw__ValueAssignment_2 ) ) )
            // InternalTCTEMPLATE.g:843:1: ( ( rule__TMTCIFFieldValueRaw__ValueAssignment_2 ) )
            {
            // InternalTCTEMPLATE.g:843:1: ( ( rule__TMTCIFFieldValueRaw__ValueAssignment_2 ) )
            // InternalTCTEMPLATE.g:844:2: ( rule__TMTCIFFieldValueRaw__ValueAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFFieldValueRawAccess().getValueAssignment_2()); 
            }
            // InternalTCTEMPLATE.g:845:2: ( rule__TMTCIFFieldValueRaw__ValueAssignment_2 )
            // InternalTCTEMPLATE.g:845:3: rule__TMTCIFFieldValueRaw__ValueAssignment_2
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
    // InternalTCTEMPLATE.g:853:1: rule__TMTCIFFieldValueRaw__Group__3 : rule__TMTCIFFieldValueRaw__Group__3__Impl ;
    public final void rule__TMTCIFFieldValueRaw__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTCTEMPLATE.g:857:1: ( rule__TMTCIFFieldValueRaw__Group__3__Impl )
            // InternalTCTEMPLATE.g:858:2: rule__TMTCIFFieldValueRaw__Group__3__Impl
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
    // InternalTCTEMPLATE.g:864:1: rule__TMTCIFFieldValueRaw__Group__3__Impl : ( '/>' ) ;
    public final void rule__TMTCIFFieldValueRaw__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTCTEMPLATE.g:868:1: ( ( '/>' ) )
            // InternalTCTEMPLATE.g:869:1: ( '/>' )
            {
            // InternalTCTEMPLATE.g:869:1: ( '/>' )
            // InternalTCTEMPLATE.g:870:2: '/>'
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
    // InternalTCTEMPLATE.g:880:1: rule__TMTCIFFieldValueFile__Group__0 : rule__TMTCIFFieldValueFile__Group__0__Impl rule__TMTCIFFieldValueFile__Group__1 ;
    public final void rule__TMTCIFFieldValueFile__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTCTEMPLATE.g:884:1: ( rule__TMTCIFFieldValueFile__Group__0__Impl rule__TMTCIFFieldValueFile__Group__1 )
            // InternalTCTEMPLATE.g:885:2: rule__TMTCIFFieldValueFile__Group__0__Impl rule__TMTCIFFieldValueFile__Group__1
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
    // InternalTCTEMPLATE.g:892:1: rule__TMTCIFFieldValueFile__Group__0__Impl : ( '<FieldValueFile' ) ;
    public final void rule__TMTCIFFieldValueFile__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTCTEMPLATE.g:896:1: ( ( '<FieldValueFile' ) )
            // InternalTCTEMPLATE.g:897:1: ( '<FieldValueFile' )
            {
            // InternalTCTEMPLATE.g:897:1: ( '<FieldValueFile' )
            // InternalTCTEMPLATE.g:898:2: '<FieldValueFile'
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
    // InternalTCTEMPLATE.g:907:1: rule__TMTCIFFieldValueFile__Group__1 : rule__TMTCIFFieldValueFile__Group__1__Impl rule__TMTCIFFieldValueFile__Group__2 ;
    public final void rule__TMTCIFFieldValueFile__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTCTEMPLATE.g:911:1: ( rule__TMTCIFFieldValueFile__Group__1__Impl rule__TMTCIFFieldValueFile__Group__2 )
            // InternalTCTEMPLATE.g:912:2: rule__TMTCIFFieldValueFile__Group__1__Impl rule__TMTCIFFieldValueFile__Group__2
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
    // InternalTCTEMPLATE.g:919:1: rule__TMTCIFFieldValueFile__Group__1__Impl : ( 'filename=' ) ;
    public final void rule__TMTCIFFieldValueFile__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTCTEMPLATE.g:923:1: ( ( 'filename=' ) )
            // InternalTCTEMPLATE.g:924:1: ( 'filename=' )
            {
            // InternalTCTEMPLATE.g:924:1: ( 'filename=' )
            // InternalTCTEMPLATE.g:925:2: 'filename='
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
    // InternalTCTEMPLATE.g:934:1: rule__TMTCIFFieldValueFile__Group__2 : rule__TMTCIFFieldValueFile__Group__2__Impl rule__TMTCIFFieldValueFile__Group__3 ;
    public final void rule__TMTCIFFieldValueFile__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTCTEMPLATE.g:938:1: ( rule__TMTCIFFieldValueFile__Group__2__Impl rule__TMTCIFFieldValueFile__Group__3 )
            // InternalTCTEMPLATE.g:939:2: rule__TMTCIFFieldValueFile__Group__2__Impl rule__TMTCIFFieldValueFile__Group__3
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
    // InternalTCTEMPLATE.g:946:1: rule__TMTCIFFieldValueFile__Group__2__Impl : ( ( rule__TMTCIFFieldValueFile__FilenameAssignment_2 ) ) ;
    public final void rule__TMTCIFFieldValueFile__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTCTEMPLATE.g:950:1: ( ( ( rule__TMTCIFFieldValueFile__FilenameAssignment_2 ) ) )
            // InternalTCTEMPLATE.g:951:1: ( ( rule__TMTCIFFieldValueFile__FilenameAssignment_2 ) )
            {
            // InternalTCTEMPLATE.g:951:1: ( ( rule__TMTCIFFieldValueFile__FilenameAssignment_2 ) )
            // InternalTCTEMPLATE.g:952:2: ( rule__TMTCIFFieldValueFile__FilenameAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFFieldValueFileAccess().getFilenameAssignment_2()); 
            }
            // InternalTCTEMPLATE.g:953:2: ( rule__TMTCIFFieldValueFile__FilenameAssignment_2 )
            // InternalTCTEMPLATE.g:953:3: rule__TMTCIFFieldValueFile__FilenameAssignment_2
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
    // InternalTCTEMPLATE.g:961:1: rule__TMTCIFFieldValueFile__Group__3 : rule__TMTCIFFieldValueFile__Group__3__Impl ;
    public final void rule__TMTCIFFieldValueFile__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTCTEMPLATE.g:965:1: ( rule__TMTCIFFieldValueFile__Group__3__Impl )
            // InternalTCTEMPLATE.g:966:2: rule__TMTCIFFieldValueFile__Group__3__Impl
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
    // InternalTCTEMPLATE.g:972:1: rule__TMTCIFFieldValueFile__Group__3__Impl : ( '/>' ) ;
    public final void rule__TMTCIFFieldValueFile__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTCTEMPLATE.g:976:1: ( ( '/>' ) )
            // InternalTCTEMPLATE.g:977:1: ( '/>' )
            {
            // InternalTCTEMPLATE.g:977:1: ( '/>' )
            // InternalTCTEMPLATE.g:978:2: '/>'
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
    // InternalTCTEMPLATE.g:988:1: rule__TMTCIFFieldValueEnum__Group__0 : rule__TMTCIFFieldValueEnum__Group__0__Impl rule__TMTCIFFieldValueEnum__Group__1 ;
    public final void rule__TMTCIFFieldValueEnum__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTCTEMPLATE.g:992:1: ( rule__TMTCIFFieldValueEnum__Group__0__Impl rule__TMTCIFFieldValueEnum__Group__1 )
            // InternalTCTEMPLATE.g:993:2: rule__TMTCIFFieldValueEnum__Group__0__Impl rule__TMTCIFFieldValueEnum__Group__1
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
    // InternalTCTEMPLATE.g:1000:1: rule__TMTCIFFieldValueEnum__Group__0__Impl : ( '<FieldValueEnum' ) ;
    public final void rule__TMTCIFFieldValueEnum__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTCTEMPLATE.g:1004:1: ( ( '<FieldValueEnum' ) )
            // InternalTCTEMPLATE.g:1005:1: ( '<FieldValueEnum' )
            {
            // InternalTCTEMPLATE.g:1005:1: ( '<FieldValueEnum' )
            // InternalTCTEMPLATE.g:1006:2: '<FieldValueEnum'
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
    // InternalTCTEMPLATE.g:1015:1: rule__TMTCIFFieldValueEnum__Group__1 : rule__TMTCIFFieldValueEnum__Group__1__Impl rule__TMTCIFFieldValueEnum__Group__2 ;
    public final void rule__TMTCIFFieldValueEnum__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTCTEMPLATE.g:1019:1: ( rule__TMTCIFFieldValueEnum__Group__1__Impl rule__TMTCIFFieldValueEnum__Group__2 )
            // InternalTCTEMPLATE.g:1020:2: rule__TMTCIFFieldValueEnum__Group__1__Impl rule__TMTCIFFieldValueEnum__Group__2
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
    // InternalTCTEMPLATE.g:1027:1: rule__TMTCIFFieldValueEnum__Group__1__Impl : ( 'enumRef=' ) ;
    public final void rule__TMTCIFFieldValueEnum__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTCTEMPLATE.g:1031:1: ( ( 'enumRef=' ) )
            // InternalTCTEMPLATE.g:1032:1: ( 'enumRef=' )
            {
            // InternalTCTEMPLATE.g:1032:1: ( 'enumRef=' )
            // InternalTCTEMPLATE.g:1033:2: 'enumRef='
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
    // InternalTCTEMPLATE.g:1042:1: rule__TMTCIFFieldValueEnum__Group__2 : rule__TMTCIFFieldValueEnum__Group__2__Impl rule__TMTCIFFieldValueEnum__Group__3 ;
    public final void rule__TMTCIFFieldValueEnum__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTCTEMPLATE.g:1046:1: ( rule__TMTCIFFieldValueEnum__Group__2__Impl rule__TMTCIFFieldValueEnum__Group__3 )
            // InternalTCTEMPLATE.g:1047:2: rule__TMTCIFFieldValueEnum__Group__2__Impl rule__TMTCIFFieldValueEnum__Group__3
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
    // InternalTCTEMPLATE.g:1054:1: rule__TMTCIFFieldValueEnum__Group__2__Impl : ( ( rule__TMTCIFFieldValueEnum__EnumRefAssignment_2 ) ) ;
    public final void rule__TMTCIFFieldValueEnum__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTCTEMPLATE.g:1058:1: ( ( ( rule__TMTCIFFieldValueEnum__EnumRefAssignment_2 ) ) )
            // InternalTCTEMPLATE.g:1059:1: ( ( rule__TMTCIFFieldValueEnum__EnumRefAssignment_2 ) )
            {
            // InternalTCTEMPLATE.g:1059:1: ( ( rule__TMTCIFFieldValueEnum__EnumRefAssignment_2 ) )
            // InternalTCTEMPLATE.g:1060:2: ( rule__TMTCIFFieldValueEnum__EnumRefAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFFieldValueEnumAccess().getEnumRefAssignment_2()); 
            }
            // InternalTCTEMPLATE.g:1061:2: ( rule__TMTCIFFieldValueEnum__EnumRefAssignment_2 )
            // InternalTCTEMPLATE.g:1061:3: rule__TMTCIFFieldValueEnum__EnumRefAssignment_2
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
    // InternalTCTEMPLATE.g:1069:1: rule__TMTCIFFieldValueEnum__Group__3 : rule__TMTCIFFieldValueEnum__Group__3__Impl rule__TMTCIFFieldValueEnum__Group__4 ;
    public final void rule__TMTCIFFieldValueEnum__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTCTEMPLATE.g:1073:1: ( rule__TMTCIFFieldValueEnum__Group__3__Impl rule__TMTCIFFieldValueEnum__Group__4 )
            // InternalTCTEMPLATE.g:1074:2: rule__TMTCIFFieldValueEnum__Group__3__Impl rule__TMTCIFFieldValueEnum__Group__4
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
    // InternalTCTEMPLATE.g:1081:1: rule__TMTCIFFieldValueEnum__Group__3__Impl : ( 'valueRef=' ) ;
    public final void rule__TMTCIFFieldValueEnum__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTCTEMPLATE.g:1085:1: ( ( 'valueRef=' ) )
            // InternalTCTEMPLATE.g:1086:1: ( 'valueRef=' )
            {
            // InternalTCTEMPLATE.g:1086:1: ( 'valueRef=' )
            // InternalTCTEMPLATE.g:1087:2: 'valueRef='
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
    // InternalTCTEMPLATE.g:1096:1: rule__TMTCIFFieldValueEnum__Group__4 : rule__TMTCIFFieldValueEnum__Group__4__Impl rule__TMTCIFFieldValueEnum__Group__5 ;
    public final void rule__TMTCIFFieldValueEnum__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTCTEMPLATE.g:1100:1: ( rule__TMTCIFFieldValueEnum__Group__4__Impl rule__TMTCIFFieldValueEnum__Group__5 )
            // InternalTCTEMPLATE.g:1101:2: rule__TMTCIFFieldValueEnum__Group__4__Impl rule__TMTCIFFieldValueEnum__Group__5
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
    // InternalTCTEMPLATE.g:1108:1: rule__TMTCIFFieldValueEnum__Group__4__Impl : ( ( rule__TMTCIFFieldValueEnum__ValueRefAssignment_4 ) ) ;
    public final void rule__TMTCIFFieldValueEnum__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTCTEMPLATE.g:1112:1: ( ( ( rule__TMTCIFFieldValueEnum__ValueRefAssignment_4 ) ) )
            // InternalTCTEMPLATE.g:1113:1: ( ( rule__TMTCIFFieldValueEnum__ValueRefAssignment_4 ) )
            {
            // InternalTCTEMPLATE.g:1113:1: ( ( rule__TMTCIFFieldValueEnum__ValueRefAssignment_4 ) )
            // InternalTCTEMPLATE.g:1114:2: ( rule__TMTCIFFieldValueEnum__ValueRefAssignment_4 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFFieldValueEnumAccess().getValueRefAssignment_4()); 
            }
            // InternalTCTEMPLATE.g:1115:2: ( rule__TMTCIFFieldValueEnum__ValueRefAssignment_4 )
            // InternalTCTEMPLATE.g:1115:3: rule__TMTCIFFieldValueEnum__ValueRefAssignment_4
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
    // InternalTCTEMPLATE.g:1123:1: rule__TMTCIFFieldValueEnum__Group__5 : rule__TMTCIFFieldValueEnum__Group__5__Impl ;
    public final void rule__TMTCIFFieldValueEnum__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTCTEMPLATE.g:1127:1: ( rule__TMTCIFFieldValueEnum__Group__5__Impl )
            // InternalTCTEMPLATE.g:1128:2: rule__TMTCIFFieldValueEnum__Group__5__Impl
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
    // InternalTCTEMPLATE.g:1134:1: rule__TMTCIFFieldValueEnum__Group__5__Impl : ( '/>' ) ;
    public final void rule__TMTCIFFieldValueEnum__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTCTEMPLATE.g:1138:1: ( ( '/>' ) )
            // InternalTCTEMPLATE.g:1139:1: ( '/>' )
            {
            // InternalTCTEMPLATE.g:1139:1: ( '/>' )
            // InternalTCTEMPLATE.g:1140:2: '/>'
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


    // $ANTLR start "rule__VTCTemplate__NameAssignment_2"
    // InternalTCTEMPLATE.g:1150:1: rule__VTCTemplate__NameAssignment_2 : ( RULE_STRING ) ;
    public final void rule__VTCTemplate__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTCTEMPLATE.g:1154:1: ( ( RULE_STRING ) )
            // InternalTCTEMPLATE.g:1155:2: ( RULE_STRING )
            {
            // InternalTCTEMPLATE.g:1155:2: ( RULE_STRING )
            // InternalTCTEMPLATE.g:1156:3: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVTCTemplateAccess().getNameSTRINGTerminalRuleCall_2_0()); 
            }
            match(input,RULE_STRING,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getVTCTemplateAccess().getNameSTRINGTerminalRuleCall_2_0()); 
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
    // $ANTLR end "rule__VTCTemplate__NameAssignment_2"


    // $ANTLR start "rule__VTCTemplate__TcAssignment_4"
    // InternalTCTEMPLATE.g:1165:1: rule__VTCTemplate__TcAssignment_4 : ( ( RULE_STRING ) ) ;
    public final void rule__VTCTemplate__TcAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTCTEMPLATE.g:1169:1: ( ( ( RULE_STRING ) ) )
            // InternalTCTEMPLATE.g:1170:2: ( ( RULE_STRING ) )
            {
            // InternalTCTEMPLATE.g:1170:2: ( ( RULE_STRING ) )
            // InternalTCTEMPLATE.g:1171:3: ( RULE_STRING )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVTCTemplateAccess().getTcTMTCIFTCCrossReference_4_0()); 
            }
            // InternalTCTEMPLATE.g:1172:3: ( RULE_STRING )
            // InternalTCTEMPLATE.g:1173:4: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVTCTemplateAccess().getTcTMTCIFTCSTRINGTerminalRuleCall_4_0_1()); 
            }
            match(input,RULE_STRING,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getVTCTemplateAccess().getTcTMTCIFTCSTRINGTerminalRuleCall_4_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getVTCTemplateAccess().getTcTMTCIFTCCrossReference_4_0()); 
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
    // $ANTLR end "rule__VTCTemplate__TcAssignment_4"


    // $ANTLR start "rule__VTCTemplate__FieldsAssignment_5_0_1_1"
    // InternalTCTEMPLATE.g:1184:1: rule__VTCTemplate__FieldsAssignment_5_0_1_1 : ( ruleVTCTemplateField ) ;
    public final void rule__VTCTemplate__FieldsAssignment_5_0_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTCTEMPLATE.g:1188:1: ( ( ruleVTCTemplateField ) )
            // InternalTCTEMPLATE.g:1189:2: ( ruleVTCTemplateField )
            {
            // InternalTCTEMPLATE.g:1189:2: ( ruleVTCTemplateField )
            // InternalTCTEMPLATE.g:1190:3: ruleVTCTemplateField
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVTCTemplateAccess().getFieldsVTCTemplateFieldParserRuleCall_5_0_1_1_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleVTCTemplateField();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getVTCTemplateAccess().getFieldsVTCTemplateFieldParserRuleCall_5_0_1_1_0()); 
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
    // $ANTLR end "rule__VTCTemplate__FieldsAssignment_5_0_1_1"


    // $ANTLR start "rule__VTCTemplateField__FieldRefAssignment_2"
    // InternalTCTEMPLATE.g:1199:1: rule__VTCTemplateField__FieldRefAssignment_2 : ( ( RULE_STRING ) ) ;
    public final void rule__VTCTemplateField__FieldRefAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTCTEMPLATE.g:1203:1: ( ( ( RULE_STRING ) ) )
            // InternalTCTEMPLATE.g:1204:2: ( ( RULE_STRING ) )
            {
            // InternalTCTEMPLATE.g:1204:2: ( ( RULE_STRING ) )
            // InternalTCTEMPLATE.g:1205:3: ( RULE_STRING )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVTCTemplateFieldAccess().getFieldRefTMTCIFTCFieldCrossReference_2_0()); 
            }
            // InternalTCTEMPLATE.g:1206:3: ( RULE_STRING )
            // InternalTCTEMPLATE.g:1207:4: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVTCTemplateFieldAccess().getFieldRefTMTCIFTCFieldSTRINGTerminalRuleCall_2_0_1()); 
            }
            match(input,RULE_STRING,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getVTCTemplateFieldAccess().getFieldRefTMTCIFTCFieldSTRINGTerminalRuleCall_2_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getVTCTemplateFieldAccess().getFieldRefTMTCIFTCFieldCrossReference_2_0()); 
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
    // $ANTLR end "rule__VTCTemplateField__FieldRefAssignment_2"


    // $ANTLR start "rule__VTCTemplateField__ValueAssignment_4"
    // InternalTCTEMPLATE.g:1218:1: rule__VTCTemplateField__ValueAssignment_4 : ( ruleTMTCIFFieldValue ) ;
    public final void rule__VTCTemplateField__ValueAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTCTEMPLATE.g:1222:1: ( ( ruleTMTCIFFieldValue ) )
            // InternalTCTEMPLATE.g:1223:2: ( ruleTMTCIFFieldValue )
            {
            // InternalTCTEMPLATE.g:1223:2: ( ruleTMTCIFFieldValue )
            // InternalTCTEMPLATE.g:1224:3: ruleTMTCIFFieldValue
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVTCTemplateFieldAccess().getValueTMTCIFFieldValueParserRuleCall_4_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleTMTCIFFieldValue();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getVTCTemplateFieldAccess().getValueTMTCIFFieldValueParserRuleCall_4_0()); 
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
    // $ANTLR end "rule__VTCTemplateField__ValueAssignment_4"


    // $ANTLR start "rule__TMTCIFFieldValueRaw__ValueAssignment_2"
    // InternalTCTEMPLATE.g:1233:1: rule__TMTCIFFieldValueRaw__ValueAssignment_2 : ( ( rule__TMTCIFFieldValueRaw__ValueAlternatives_2_0 ) ) ;
    public final void rule__TMTCIFFieldValueRaw__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTCTEMPLATE.g:1237:1: ( ( ( rule__TMTCIFFieldValueRaw__ValueAlternatives_2_0 ) ) )
            // InternalTCTEMPLATE.g:1238:2: ( ( rule__TMTCIFFieldValueRaw__ValueAlternatives_2_0 ) )
            {
            // InternalTCTEMPLATE.g:1238:2: ( ( rule__TMTCIFFieldValueRaw__ValueAlternatives_2_0 ) )
            // InternalTCTEMPLATE.g:1239:3: ( rule__TMTCIFFieldValueRaw__ValueAlternatives_2_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFFieldValueRawAccess().getValueAlternatives_2_0()); 
            }
            // InternalTCTEMPLATE.g:1240:3: ( rule__TMTCIFFieldValueRaw__ValueAlternatives_2_0 )
            // InternalTCTEMPLATE.g:1240:4: rule__TMTCIFFieldValueRaw__ValueAlternatives_2_0
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
    // InternalTCTEMPLATE.g:1248:1: rule__TMTCIFFieldValueFile__FilenameAssignment_2 : ( RULE_STRING ) ;
    public final void rule__TMTCIFFieldValueFile__FilenameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTCTEMPLATE.g:1252:1: ( ( RULE_STRING ) )
            // InternalTCTEMPLATE.g:1253:2: ( RULE_STRING )
            {
            // InternalTCTEMPLATE.g:1253:2: ( RULE_STRING )
            // InternalTCTEMPLATE.g:1254:3: RULE_STRING
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
    // InternalTCTEMPLATE.g:1263:1: rule__TMTCIFFieldValueEnum__EnumRefAssignment_2 : ( ( RULE_STRING ) ) ;
    public final void rule__TMTCIFFieldValueEnum__EnumRefAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTCTEMPLATE.g:1267:1: ( ( ( RULE_STRING ) ) )
            // InternalTCTEMPLATE.g:1268:2: ( ( RULE_STRING ) )
            {
            // InternalTCTEMPLATE.g:1268:2: ( ( RULE_STRING ) )
            // InternalTCTEMPLATE.g:1269:3: ( RULE_STRING )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFFieldValueEnumAccess().getEnumRefTMTCIFEnumCrossReference_2_0()); 
            }
            // InternalTCTEMPLATE.g:1270:3: ( RULE_STRING )
            // InternalTCTEMPLATE.g:1271:4: RULE_STRING
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
    // InternalTCTEMPLATE.g:1282:1: rule__TMTCIFFieldValueEnum__ValueRefAssignment_4 : ( ( RULE_STRING ) ) ;
    public final void rule__TMTCIFFieldValueEnum__ValueRefAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTCTEMPLATE.g:1286:1: ( ( ( RULE_STRING ) ) )
            // InternalTCTEMPLATE.g:1287:2: ( ( RULE_STRING ) )
            {
            // InternalTCTEMPLATE.g:1287:2: ( ( RULE_STRING ) )
            // InternalTCTEMPLATE.g:1288:3: ( RULE_STRING )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFFieldValueEnumAccess().getValueRefTMTCIFEnumValueCrossReference_4_0()); 
            }
            // InternalTCTEMPLATE.g:1289:3: ( RULE_STRING )
            // InternalTCTEMPLATE.g:1290:4: RULE_STRING
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