package es.uah.aut.srg.micobs.svm.lang.tcr.ide.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalTCRLexer extends Lexer {
    public static final int RULE_STRING=4;
    public static final int RULE_UINT_STRING=5;
    public static final int RULE_SL_COMMENT=10;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__37=37;
    public static final int T__16=16;
    public static final int T__38=38;
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

    public InternalTCRLexer() {;} 
    public InternalTCRLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalTCRLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "InternalTCR.g"; }

    // $ANTLR start "T__13"
    public final void mT__13() throws RecognitionException {
        try {
            int _type = T__13;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTCR.g:11:7: ( 'Fail' )
            // InternalTCR.g:11:9: 'Fail'
            {
            match("Fail"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__13"

    // $ANTLR start "T__14"
    public final void mT__14() throws RecognitionException {
        try {
            int _type = T__14;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTCR.g:12:7: ( 'Pass' )
            // InternalTCR.g:12:9: 'Pass'
            {
            match("Pass"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__14"

    // $ANTLR start "T__15"
    public final void mT__15() throws RecognitionException {
        try {
            int _type = T__15;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTCR.g:13:7: ( 'NotTested' )
            // InternalTCR.g:13:9: 'NotTested'
            {
            match("NotTested"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__15"

    // $ANTLR start "T__16"
    public final void mT__16() throws RecognitionException {
        try {
            int _type = T__16;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTCR.g:14:7: ( '\"true\"' )
            // InternalTCR.g:14:9: '\"true\"'
            {
            match("\"true\""); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__16"

    // $ANTLR start "T__17"
    public final void mT__17() throws RecognitionException {
        try {
            int _type = T__17;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTCR.g:15:7: ( '\"false\"' )
            // InternalTCR.g:15:9: '\"false\"'
            {
            match("\"false\""); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__17"

    // $ANTLR start "T__18"
    public final void mT__18() throws RecognitionException {
        try {
            int _type = T__18;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTCR.g:16:7: ( '<TestCampaignReport' )
            // InternalTCR.g:16:9: '<TestCampaignReport'
            {
            match("<TestCampaignReport"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__18"

    // $ANTLR start "T__19"
    public final void mT__19() throws RecognitionException {
        try {
            int _type = T__19;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTCR.g:17:7: ( 'name=' )
            // InternalTCR.g:17:9: 'name='
            {
            match("name="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__19"

    // $ANTLR start "T__20"
    public final void mT__20() throws RecognitionException {
        try {
            int _type = T__20;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTCR.g:18:7: ( 'id=' )
            // InternalTCR.g:18:9: 'id='
            {
            match("id="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__20"

    // $ANTLR start "T__21"
    public final void mT__21() throws RecognitionException {
        try {
            int _type = T__21;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTCR.g:19:7: ( 'issue=' )
            // InternalTCR.g:19:9: 'issue='
            {
            match("issue="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__21"

    // $ANTLR start "T__22"
    public final void mT__22() throws RecognitionException {
        try {
            int _type = T__22;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTCR.g:20:7: ( 'revision=' )
            // InternalTCR.g:20:9: 'revision='
            {
            match("revision="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__22"

    // $ANTLR start "T__23"
    public final void mT__23() throws RecognitionException {
        try {
            int _type = T__23;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTCR.g:21:7: ( 'date=' )
            // InternalTCR.g:21:9: 'date='
            {
            match("date="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__23"

    // $ANTLR start "T__24"
    public final void mT__24() throws RecognitionException {
        try {
            int _type = T__24;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTCR.g:22:7: ( '>' )
            // InternalTCR.g:22:9: '>'
            {
            match('>'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__24"

    // $ANTLR start "T__25"
    public final void mT__25() throws RecognitionException {
        try {
            int _type = T__25;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTCR.g:23:7: ( '</TestCampaignReport>' )
            // InternalTCR.g:23:9: '</TestCampaignReport>'
            {
            match("</TestCampaignReport>"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__25"

    // $ANTLR start "T__26"
    public final void mT__26() throws RecognitionException {
        try {
            int _type = T__26;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTCR.g:24:7: ( '<VTCRTestReport' )
            // InternalTCR.g:24:9: '<VTCRTestReport'
            {
            match("<VTCRTestReport"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__26"

    // $ANTLR start "T__27"
    public final void mT__27() throws RecognitionException {
        try {
            int _type = T__27;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTCR.g:25:7: ( 'test_procedure=' )
            // InternalTCR.g:25:9: 'test_procedure='
            {
            match("test_procedure="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__27"

    // $ANTLR start "T__28"
    public final void mT__28() throws RecognitionException {
        try {
            int _type = T__28;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTCR.g:26:7: ( '<status>' )
            // InternalTCR.g:26:9: '<status>'
            {
            match("<status>"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__28"

    // $ANTLR start "T__29"
    public final void mT__29() throws RecognitionException {
        try {
            int _type = T__29;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTCR.g:27:7: ( '</status>' )
            // InternalTCR.g:27:9: '</status>'
            {
            match("</status>"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__29"

    // $ANTLR start "T__30"
    public final void mT__30() throws RecognitionException {
        try {
            int _type = T__30;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTCR.g:28:7: ( '</VTCRTestReport>' )
            // InternalTCR.g:28:9: '</VTCRTestReport>'
            {
            match("</VTCRTestReport>"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__30"

    // $ANTLR start "T__31"
    public final void mT__31() throws RecognitionException {
        try {
            int _type = T__31;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTCR.g:29:7: ( '<evidence>' )
            // InternalTCR.g:29:9: '<evidence>'
            {
            match("<evidence>"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__31"

    // $ANTLR start "T__32"
    public final void mT__32() throws RecognitionException {
        try {
            int _type = T__32;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTCR.g:30:7: ( '</evidence>' )
            // InternalTCR.g:30:9: '</evidence>'
            {
            match("</evidence>"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__32"

    // $ANTLR start "T__33"
    public final void mT__33() throws RecognitionException {
        try {
            int _type = T__33;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTCR.g:31:7: ( '<run' )
            // InternalTCR.g:31:9: '<run'
            {
            match("<run"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__33"

    // $ANTLR start "T__34"
    public final void mT__34() throws RecognitionException {
        try {
            int _type = T__34;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTCR.g:32:7: ( '</run>' )
            // InternalTCR.g:32:9: '</run>'
            {
            match("</run>"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__34"

    // $ANTLR start "T__35"
    public final void mT__35() throws RecognitionException {
        try {
            int _type = T__35;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTCR.g:33:7: ( 'bold=' )
            // InternalTCR.g:33:9: 'bold='
            {
            match("bold="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__35"

    // $ANTLR start "T__36"
    public final void mT__36() throws RecognitionException {
        try {
            int _type = T__36;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTCR.g:34:7: ( 'italics=' )
            // InternalTCR.g:34:9: 'italics='
            {
            match("italics="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__36"

    // $ANTLR start "T__37"
    public final void mT__37() throws RecognitionException {
        try {
            int _type = T__37;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTCR.g:35:7: ( 'underline=' )
            // InternalTCR.g:35:9: 'underline='
            {
            match("underline="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__37"

    // $ANTLR start "T__38"
    public final void mT__38() throws RecognitionException {
        try {
            int _type = T__38;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTCR.g:36:7: ( 'color=' )
            // InternalTCR.g:36:9: 'color='
            {
            match("color="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__38"

    // $ANTLR start "RULE_RUNTEXT"
    public final void mRULE_RUNTEXT() throws RecognitionException {
        try {
            int _type = RULE_RUNTEXT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTCR.g:1678:14: ( '<text>' ( options {greedy=false; } : . )* '</text>' )
            // InternalTCR.g:1678:16: '<text>' ( options {greedy=false; } : . )* '</text>'
            {
            match("<text>"); 

            // InternalTCR.g:1678:25: ( options {greedy=false; } : . )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0=='<') ) {
                    int LA1_1 = input.LA(2);

                    if ( (LA1_1=='/') ) {
                        int LA1_3 = input.LA(3);

                        if ( (LA1_3=='t') ) {
                            int LA1_4 = input.LA(4);

                            if ( (LA1_4=='e') ) {
                                int LA1_5 = input.LA(5);

                                if ( (LA1_5=='x') ) {
                                    int LA1_6 = input.LA(6);

                                    if ( (LA1_6=='t') ) {
                                        int LA1_7 = input.LA(7);

                                        if ( (LA1_7=='>') ) {
                                            alt1=2;
                                        }
                                        else if ( ((LA1_7>='\u0000' && LA1_7<='=')||(LA1_7>='?' && LA1_7<='\uFFFF')) ) {
                                            alt1=1;
                                        }


                                    }
                                    else if ( ((LA1_6>='\u0000' && LA1_6<='s')||(LA1_6>='u' && LA1_6<='\uFFFF')) ) {
                                        alt1=1;
                                    }


                                }
                                else if ( ((LA1_5>='\u0000' && LA1_5<='w')||(LA1_5>='y' && LA1_5<='\uFFFF')) ) {
                                    alt1=1;
                                }


                            }
                            else if ( ((LA1_4>='\u0000' && LA1_4<='d')||(LA1_4>='f' && LA1_4<='\uFFFF')) ) {
                                alt1=1;
                            }


                        }
                        else if ( ((LA1_3>='\u0000' && LA1_3<='s')||(LA1_3>='u' && LA1_3<='\uFFFF')) ) {
                            alt1=1;
                        }


                    }
                    else if ( ((LA1_1>='\u0000' && LA1_1<='.')||(LA1_1>='0' && LA1_1<='\uFFFF')) ) {
                        alt1=1;
                    }


                }
                else if ( ((LA1_0>='\u0000' && LA1_0<=';')||(LA1_0>='=' && LA1_0<='\uFFFF')) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalTCR.g:1678:53: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            match("</text>"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_RUNTEXT"

    // $ANTLR start "RULE_UINT_STRING"
    public final void mRULE_UINT_STRING() throws RecognitionException {
        try {
            int _type = RULE_UINT_STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTCR.g:1680:18: ( '\"' ( '0' .. '9' )+ '\"' )
            // InternalTCR.g:1680:20: '\"' ( '0' .. '9' )+ '\"'
            {
            match('\"'); 
            // InternalTCR.g:1680:24: ( '0' .. '9' )+
            int cnt2=0;
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>='0' && LA2_0<='9')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalTCR.g:1680:25: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt2 >= 1 ) break loop2;
                        EarlyExitException eee =
                            new EarlyExitException(2, input);
                        throw eee;
                }
                cnt2++;
            } while (true);

            match('\"'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_UINT_STRING"

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTCR.g:1682:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // InternalTCR.g:1682:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // InternalTCR.g:1682:11: ( '^' )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0=='^') ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalTCR.g:1682:11: '^'
                    {
                    match('^'); 

                    }
                    break;

            }

            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // InternalTCR.g:1682:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>='0' && LA4_0<='9')||(LA4_0>='A' && LA4_0<='Z')||LA4_0=='_'||(LA4_0>='a' && LA4_0<='z')) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalTCR.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ID"

    // $ANTLR start "RULE_INT"
    public final void mRULE_INT() throws RecognitionException {
        try {
            int _type = RULE_INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTCR.g:1684:10: ( ( '0' .. '9' )+ )
            // InternalTCR.g:1684:12: ( '0' .. '9' )+
            {
            // InternalTCR.g:1684:12: ( '0' .. '9' )+
            int cnt5=0;
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( ((LA5_0>='0' && LA5_0<='9')) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalTCR.g:1684:13: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt5 >= 1 ) break loop5;
                        EarlyExitException eee =
                            new EarlyExitException(5, input);
                        throw eee;
                }
                cnt5++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_INT"

    // $ANTLR start "RULE_STRING"
    public final void mRULE_STRING() throws RecognitionException {
        try {
            int _type = RULE_STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTCR.g:1686:13: ( ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // InternalTCR.g:1686:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // InternalTCR.g:1686:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0=='\"') ) {
                alt8=1;
            }
            else if ( (LA8_0=='\'') ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalTCR.g:1686:16: '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // InternalTCR.g:1686:20: ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop6:
                    do {
                        int alt6=3;
                        int LA6_0 = input.LA(1);

                        if ( (LA6_0=='\\') ) {
                            alt6=1;
                        }
                        else if ( ((LA6_0>='\u0000' && LA6_0<='!')||(LA6_0>='#' && LA6_0<='[')||(LA6_0>=']' && LA6_0<='\uFFFF')) ) {
                            alt6=2;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // InternalTCR.g:1686:21: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalTCR.g:1686:28: ~ ( ( '\\\\' | '\"' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='!')||(input.LA(1)>='#' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop6;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // InternalTCR.g:1686:48: '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // InternalTCR.g:1686:53: ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop7:
                    do {
                        int alt7=3;
                        int LA7_0 = input.LA(1);

                        if ( (LA7_0=='\\') ) {
                            alt7=1;
                        }
                        else if ( ((LA7_0>='\u0000' && LA7_0<='&')||(LA7_0>='(' && LA7_0<='[')||(LA7_0>=']' && LA7_0<='\uFFFF')) ) {
                            alt7=2;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // InternalTCR.g:1686:54: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalTCR.g:1686:61: ~ ( ( '\\\\' | '\\'' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='&')||(input.LA(1)>='(' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop7;
                        }
                    } while (true);

                    match('\''); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_STRING"

    // $ANTLR start "RULE_ML_COMMENT"
    public final void mRULE_ML_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_ML_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTCR.g:1688:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // InternalTCR.g:1688:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // InternalTCR.g:1688:24: ( options {greedy=false; } : . )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0=='*') ) {
                    int LA9_1 = input.LA(2);

                    if ( (LA9_1=='/') ) {
                        alt9=2;
                    }
                    else if ( ((LA9_1>='\u0000' && LA9_1<='.')||(LA9_1>='0' && LA9_1<='\uFFFF')) ) {
                        alt9=1;
                    }


                }
                else if ( ((LA9_0>='\u0000' && LA9_0<=')')||(LA9_0>='+' && LA9_0<='\uFFFF')) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalTCR.g:1688:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

            match("*/"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ML_COMMENT"

    // $ANTLR start "RULE_SL_COMMENT"
    public final void mRULE_SL_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_SL_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTCR.g:1690:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // InternalTCR.g:1690:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // InternalTCR.g:1690:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( ((LA10_0>='\u0000' && LA10_0<='\t')||(LA10_0>='\u000B' && LA10_0<='\f')||(LA10_0>='\u000E' && LA10_0<='\uFFFF')) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalTCR.g:1690:24: ~ ( ( '\\n' | '\\r' ) )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

            // InternalTCR.g:1690:40: ( ( '\\r' )? '\\n' )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0=='\n'||LA12_0=='\r') ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalTCR.g:1690:41: ( '\\r' )? '\\n'
                    {
                    // InternalTCR.g:1690:41: ( '\\r' )?
                    int alt11=2;
                    int LA11_0 = input.LA(1);

                    if ( (LA11_0=='\r') ) {
                        alt11=1;
                    }
                    switch (alt11) {
                        case 1 :
                            // InternalTCR.g:1690:41: '\\r'
                            {
                            match('\r'); 

                            }
                            break;

                    }

                    match('\n'); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SL_COMMENT"

    // $ANTLR start "RULE_WS"
    public final void mRULE_WS() throws RecognitionException {
        try {
            int _type = RULE_WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTCR.g:1692:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // InternalTCR.g:1692:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // InternalTCR.g:1692:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt13=0;
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( ((LA13_0>='\t' && LA13_0<='\n')||LA13_0=='\r'||LA13_0==' ') ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalTCR.g:
            	    {
            	    if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt13 >= 1 ) break loop13;
                        EarlyExitException eee =
                            new EarlyExitException(13, input);
                        throw eee;
                }
                cnt13++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_WS"

    // $ANTLR start "RULE_ANY_OTHER"
    public final void mRULE_ANY_OTHER() throws RecognitionException {
        try {
            int _type = RULE_ANY_OTHER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTCR.g:1694:16: ( . )
            // InternalTCR.g:1694:18: .
            {
            matchAny(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ANY_OTHER"

    public void mTokens() throws RecognitionException {
        // InternalTCR.g:1:8: ( T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | RULE_RUNTEXT | RULE_UINT_STRING | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt14=35;
        alt14 = dfa14.predict(input);
        switch (alt14) {
            case 1 :
                // InternalTCR.g:1:10: T__13
                {
                mT__13(); 

                }
                break;
            case 2 :
                // InternalTCR.g:1:16: T__14
                {
                mT__14(); 

                }
                break;
            case 3 :
                // InternalTCR.g:1:22: T__15
                {
                mT__15(); 

                }
                break;
            case 4 :
                // InternalTCR.g:1:28: T__16
                {
                mT__16(); 

                }
                break;
            case 5 :
                // InternalTCR.g:1:34: T__17
                {
                mT__17(); 

                }
                break;
            case 6 :
                // InternalTCR.g:1:40: T__18
                {
                mT__18(); 

                }
                break;
            case 7 :
                // InternalTCR.g:1:46: T__19
                {
                mT__19(); 

                }
                break;
            case 8 :
                // InternalTCR.g:1:52: T__20
                {
                mT__20(); 

                }
                break;
            case 9 :
                // InternalTCR.g:1:58: T__21
                {
                mT__21(); 

                }
                break;
            case 10 :
                // InternalTCR.g:1:64: T__22
                {
                mT__22(); 

                }
                break;
            case 11 :
                // InternalTCR.g:1:70: T__23
                {
                mT__23(); 

                }
                break;
            case 12 :
                // InternalTCR.g:1:76: T__24
                {
                mT__24(); 

                }
                break;
            case 13 :
                // InternalTCR.g:1:82: T__25
                {
                mT__25(); 

                }
                break;
            case 14 :
                // InternalTCR.g:1:88: T__26
                {
                mT__26(); 

                }
                break;
            case 15 :
                // InternalTCR.g:1:94: T__27
                {
                mT__27(); 

                }
                break;
            case 16 :
                // InternalTCR.g:1:100: T__28
                {
                mT__28(); 

                }
                break;
            case 17 :
                // InternalTCR.g:1:106: T__29
                {
                mT__29(); 

                }
                break;
            case 18 :
                // InternalTCR.g:1:112: T__30
                {
                mT__30(); 

                }
                break;
            case 19 :
                // InternalTCR.g:1:118: T__31
                {
                mT__31(); 

                }
                break;
            case 20 :
                // InternalTCR.g:1:124: T__32
                {
                mT__32(); 

                }
                break;
            case 21 :
                // InternalTCR.g:1:130: T__33
                {
                mT__33(); 

                }
                break;
            case 22 :
                // InternalTCR.g:1:136: T__34
                {
                mT__34(); 

                }
                break;
            case 23 :
                // InternalTCR.g:1:142: T__35
                {
                mT__35(); 

                }
                break;
            case 24 :
                // InternalTCR.g:1:148: T__36
                {
                mT__36(); 

                }
                break;
            case 25 :
                // InternalTCR.g:1:154: T__37
                {
                mT__37(); 

                }
                break;
            case 26 :
                // InternalTCR.g:1:160: T__38
                {
                mT__38(); 

                }
                break;
            case 27 :
                // InternalTCR.g:1:166: RULE_RUNTEXT
                {
                mRULE_RUNTEXT(); 

                }
                break;
            case 28 :
                // InternalTCR.g:1:179: RULE_UINT_STRING
                {
                mRULE_UINT_STRING(); 

                }
                break;
            case 29 :
                // InternalTCR.g:1:196: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 30 :
                // InternalTCR.g:1:204: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 31 :
                // InternalTCR.g:1:213: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 32 :
                // InternalTCR.g:1:225: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 33 :
                // InternalTCR.g:1:241: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 34 :
                // InternalTCR.g:1:257: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 35 :
                // InternalTCR.g:1:265: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA14 dfa14 = new DFA14(this);
    static final String DFA14_eotS =
        "\1\uffff\3\27\2\25\4\27\1\uffff\4\27\1\25\2\uffff\2\25\2\uffff\1\27\1\uffff\2\27\13\uffff\6\27\1\uffff\4\27\4\uffff\3\27\10\uffff\1\27\1\uffff\10\27\1\130\1\131\1\27\3\uffff\11\27\2\uffff\1\27\3\uffff\3\27\1\uffff\1\27\1\uffff\3\27\3\uffff\4\27\1\uffff\1\27\2\uffff\5\27\2\uffff\3\27\1\u0080\1\uffff\2\27\1\uffff\1\27\1\uffff\4\27\1\uffff";
    static final String DFA14_eofS =
        "\u0088\uffff";
    static final String DFA14_minS =
        "\1\0\2\141\1\157\1\0\1\57\1\141\1\144\1\145\1\141\1\uffff\1\145\1\157\1\156\1\157\1\101\2\uffff\1\0\1\52\2\uffff\1\151\1\uffff\1\163\1\164\2\0\1\uffff\1\0\1\uffff\1\124\5\uffff\1\155\1\75\1\163\1\141\1\166\1\164\1\uffff\1\163\1\154\1\144\1\154\4\uffff\1\154\1\163\1\124\2\0\6\uffff\1\145\1\uffff\1\165\1\154\1\151\1\145\1\164\1\144\1\145\1\157\2\60\1\145\2\0\1\uffff\1\75\1\145\1\151\1\163\1\75\1\137\1\75\2\162\2\uffff\1\163\2\0\1\uffff\1\75\1\143\1\151\1\uffff\1\160\1\uffff\1\154\1\75\1\164\1\uffff\1\0\1\uffff\1\163\1\157\1\162\1\151\1\uffff\1\145\2\uffff\1\75\1\156\1\157\1\156\1\144\2\uffff\1\75\1\143\1\145\1\60\1\uffff\1\145\1\75\1\uffff\1\144\1\uffff\1\165\1\162\1\145\1\75\1\uffff";
    static final String DFA14_maxS =
        "\1\uffff\2\141\1\157\1\uffff\1\164\1\141\1\164\1\145\1\141\1\uffff\1\145\1\157\1\156\1\157\1\172\2\uffff\1\uffff\1\57\2\uffff\1\151\1\uffff\1\163\1\164\2\uffff\1\uffff\1\uffff\1\uffff\1\163\5\uffff\1\155\1\75\1\163\1\141\1\166\1\164\1\uffff\1\163\1\154\1\144\1\154\4\uffff\1\154\1\163\1\124\2\uffff\6\uffff\1\145\1\uffff\1\165\1\154\1\151\1\145\1\164\1\144\1\145\1\157\2\172\1\145\2\uffff\1\uffff\1\75\1\145\1\151\1\163\1\75\1\137\1\75\2\162\2\uffff\1\163\2\uffff\1\uffff\1\75\1\143\1\151\1\uffff\1\160\1\uffff\1\154\1\75\1\164\1\uffff\1\uffff\1\uffff\1\163\1\157\1\162\1\151\1\uffff\1\145\2\uffff\1\75\1\156\1\157\1\156\1\144\2\uffff\1\75\1\143\1\145\1\172\1\uffff\1\145\1\75\1\uffff\1\144\1\uffff\1\165\1\162\1\145\1\75\1\uffff";
    static final String DFA14_acceptS =
        "\12\uffff\1\14\5\uffff\1\35\1\36\2\uffff\1\42\1\43\1\uffff\1\35\4\uffff\1\37\1\uffff\1\6\1\uffff\1\16\1\20\1\23\1\25\1\33\6\uffff\1\14\4\uffff\1\36\1\40\1\41\1\42\5\uffff\1\34\1\15\1\21\1\22\1\24\1\26\1\uffff\1\10\15\uffff\1\34\11\uffff\1\1\1\2\3\uffff\1\7\3\uffff\1\13\1\uffff\1\27\3\uffff\1\4\1\uffff\1\11\4\uffff\1\32\1\uffff\1\4\1\5\5\uffff\1\5\1\30\4\uffff\1\12\2\uffff\1\3\1\uffff\1\31\4\uffff\1\17";
    static final String DFA14_specialS =
        "\1\0\3\uffff\1\13\15\uffff\1\14\7\uffff\1\2\1\6\1\uffff\1\1\31\uffff\1\3\1\7\23\uffff\1\4\1\10\15\uffff\1\5\1\11\13\uffff\1\12\37\uffff}>";
    static final String[] DFA14_transitionS = {
            "\11\25\2\24\2\25\1\24\22\25\1\24\1\25\1\4\4\25\1\22\7\25\1\23\12\21\2\25\1\5\1\25\1\12\2\25\5\20\1\1\7\20\1\3\1\20\1\2\12\20\3\25\1\17\1\20\1\25\1\20\1\14\1\16\1\11\4\20\1\7\4\20\1\6\3\20\1\10\1\20\1\13\1\15\5\20\uff85\25",
            "\1\26",
            "\1\30",
            "\1\31",
            "\60\34\12\35\54\34\1\33\15\34\1\32\uff8b\34",
            "\1\37\44\uffff\1\36\1\uffff\1\40\16\uffff\1\42\14\uffff\1\43\1\41\1\44",
            "\1\45",
            "\1\46\16\uffff\1\47\1\50",
            "\1\51",
            "\1\52",
            "",
            "\1\54",
            "\1\55",
            "\1\56",
            "\1\57",
            "\32\27\4\uffff\1\27\1\uffff\32\27",
            "",
            "",
            "\0\34",
            "\1\61\4\uffff\1\62",
            "",
            "",
            "\1\64",
            "",
            "\1\65",
            "\1\66",
            "\162\34\1\67\uff8d\34",
            "\141\34\1\70\uff9e\34",
            "",
            "\42\34\1\71\15\34\12\35\uffc6\34",
            "",
            "\1\72\1\uffff\1\74\16\uffff\1\75\14\uffff\1\76\1\73",
            "",
            "",
            "",
            "",
            "",
            "\1\77",
            "\1\100",
            "\1\101",
            "\1\102",
            "\1\103",
            "\1\104",
            "",
            "\1\105",
            "\1\106",
            "\1\107",
            "\1\110",
            "",
            "",
            "",
            "",
            "\1\111",
            "\1\112",
            "\1\113",
            "\165\34\1\114\uff8a\34",
            "\154\34\1\115\uff93\34",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\117",
            "",
            "\1\120",
            "\1\121",
            "\1\122",
            "\1\123",
            "\1\124",
            "\1\125",
            "\1\126",
            "\1\127",
            "\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\32\27",
            "\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\32\27",
            "\1\132",
            "\145\34\1\133\uff9a\34",
            "\163\34\1\134\uff8c\34",
            "",
            "\1\135",
            "\1\136",
            "\1\137",
            "\1\140",
            "\1\141",
            "\1\142",
            "\1\143",
            "\1\144",
            "\1\145",
            "",
            "",
            "\1\146",
            "\42\34\1\147\uffdd\34",
            "\145\34\1\150\uff9a\34",
            "",
            "\1\151",
            "\1\152",
            "\1\153",
            "",
            "\1\154",
            "",
            "\1\155",
            "\1\156",
            "\1\157",
            "",
            "\42\34\1\161\uffdd\34",
            "",
            "\1\162",
            "\1\163",
            "\1\164",
            "\1\165",
            "",
            "\1\166",
            "",
            "",
            "\1\170",
            "\1\171",
            "\1\172",
            "\1\173",
            "\1\174",
            "",
            "",
            "\1\175",
            "\1\176",
            "\1\177",
            "\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\32\27",
            "",
            "\1\u0081",
            "\1\u0082",
            "",
            "\1\u0083",
            "",
            "\1\u0084",
            "\1\u0085",
            "\1\u0086",
            "\1\u0087",
            ""
    };

    static final short[] DFA14_eot = DFA.unpackEncodedString(DFA14_eotS);
    static final short[] DFA14_eof = DFA.unpackEncodedString(DFA14_eofS);
    static final char[] DFA14_min = DFA.unpackEncodedStringToUnsignedChars(DFA14_minS);
    static final char[] DFA14_max = DFA.unpackEncodedStringToUnsignedChars(DFA14_maxS);
    static final short[] DFA14_accept = DFA.unpackEncodedString(DFA14_acceptS);
    static final short[] DFA14_special = DFA.unpackEncodedString(DFA14_specialS);
    static final short[][] DFA14_transition;

    static {
        int numStates = DFA14_transitionS.length;
        DFA14_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA14_transition[i] = DFA.unpackEncodedString(DFA14_transitionS[i]);
        }
    }

    static class DFA14 extends DFA {

        public DFA14(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 14;
            this.eot = DFA14_eot;
            this.eof = DFA14_eof;
            this.min = DFA14_min;
            this.max = DFA14_max;
            this.accept = DFA14_accept;
            this.special = DFA14_special;
            this.transition = DFA14_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | RULE_RUNTEXT | RULE_UINT_STRING | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA14_0 = input.LA(1);

                        s = -1;
                        if ( (LA14_0=='F') ) {s = 1;}

                        else if ( (LA14_0=='P') ) {s = 2;}

                        else if ( (LA14_0=='N') ) {s = 3;}

                        else if ( (LA14_0=='\"') ) {s = 4;}

                        else if ( (LA14_0=='<') ) {s = 5;}

                        else if ( (LA14_0=='n') ) {s = 6;}

                        else if ( (LA14_0=='i') ) {s = 7;}

                        else if ( (LA14_0=='r') ) {s = 8;}

                        else if ( (LA14_0=='d') ) {s = 9;}

                        else if ( (LA14_0=='>') ) {s = 10;}

                        else if ( (LA14_0=='t') ) {s = 11;}

                        else if ( (LA14_0=='b') ) {s = 12;}

                        else if ( (LA14_0=='u') ) {s = 13;}

                        else if ( (LA14_0=='c') ) {s = 14;}

                        else if ( (LA14_0=='^') ) {s = 15;}

                        else if ( ((LA14_0>='A' && LA14_0<='E')||(LA14_0>='G' && LA14_0<='M')||LA14_0=='O'||(LA14_0>='Q' && LA14_0<='Z')||LA14_0=='_'||LA14_0=='a'||(LA14_0>='e' && LA14_0<='h')||(LA14_0>='j' && LA14_0<='m')||(LA14_0>='o' && LA14_0<='q')||LA14_0=='s'||(LA14_0>='v' && LA14_0<='z')) ) {s = 16;}

                        else if ( ((LA14_0>='0' && LA14_0<='9')) ) {s = 17;}

                        else if ( (LA14_0=='\'') ) {s = 18;}

                        else if ( (LA14_0=='/') ) {s = 19;}

                        else if ( ((LA14_0>='\t' && LA14_0<='\n')||LA14_0=='\r'||LA14_0==' ') ) {s = 20;}

                        else if ( ((LA14_0>='\u0000' && LA14_0<='\b')||(LA14_0>='\u000B' && LA14_0<='\f')||(LA14_0>='\u000E' && LA14_0<='\u001F')||LA14_0=='!'||(LA14_0>='#' && LA14_0<='&')||(LA14_0>='(' && LA14_0<='.')||(LA14_0>=':' && LA14_0<=';')||LA14_0=='='||(LA14_0>='?' && LA14_0<='@')||(LA14_0>='[' && LA14_0<=']')||LA14_0=='`'||(LA14_0>='{' && LA14_0<='\uFFFF')) ) {s = 21;}

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA14_29 = input.LA(1);

                        s = -1;
                        if ( (LA14_29=='\"') ) {s = 57;}

                        else if ( ((LA14_29>='\u0000' && LA14_29<='!')||(LA14_29>='#' && LA14_29<='/')||(LA14_29>=':' && LA14_29<='\uFFFF')) ) {s = 28;}

                        else if ( ((LA14_29>='0' && LA14_29<='9')) ) {s = 29;}

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA14_26 = input.LA(1);

                        s = -1;
                        if ( (LA14_26=='r') ) {s = 55;}

                        else if ( ((LA14_26>='\u0000' && LA14_26<='q')||(LA14_26>='s' && LA14_26<='\uFFFF')) ) {s = 28;}

                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA14_55 = input.LA(1);

                        s = -1;
                        if ( (LA14_55=='u') ) {s = 76;}

                        else if ( ((LA14_55>='\u0000' && LA14_55<='t')||(LA14_55>='v' && LA14_55<='\uFFFF')) ) {s = 28;}

                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA14_76 = input.LA(1);

                        s = -1;
                        if ( (LA14_76=='e') ) {s = 91;}

                        else if ( ((LA14_76>='\u0000' && LA14_76<='d')||(LA14_76>='f' && LA14_76<='\uFFFF')) ) {s = 28;}

                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA14_91 = input.LA(1);

                        s = -1;
                        if ( (LA14_91=='\"') ) {s = 103;}

                        else if ( ((LA14_91>='\u0000' && LA14_91<='!')||(LA14_91>='#' && LA14_91<='\uFFFF')) ) {s = 28;}

                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA14_27 = input.LA(1);

                        s = -1;
                        if ( (LA14_27=='a') ) {s = 56;}

                        else if ( ((LA14_27>='\u0000' && LA14_27<='`')||(LA14_27>='b' && LA14_27<='\uFFFF')) ) {s = 28;}

                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA14_56 = input.LA(1);

                        s = -1;
                        if ( (LA14_56=='l') ) {s = 77;}

                        else if ( ((LA14_56>='\u0000' && LA14_56<='k')||(LA14_56>='m' && LA14_56<='\uFFFF')) ) {s = 28;}

                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA14_77 = input.LA(1);

                        s = -1;
                        if ( (LA14_77=='s') ) {s = 92;}

                        else if ( ((LA14_77>='\u0000' && LA14_77<='r')||(LA14_77>='t' && LA14_77<='\uFFFF')) ) {s = 28;}

                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA14_92 = input.LA(1);

                        s = -1;
                        if ( (LA14_92=='e') ) {s = 104;}

                        else if ( ((LA14_92>='\u0000' && LA14_92<='d')||(LA14_92>='f' && LA14_92<='\uFFFF')) ) {s = 28;}

                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA14_104 = input.LA(1);

                        s = -1;
                        if ( (LA14_104=='\"') ) {s = 113;}

                        else if ( ((LA14_104>='\u0000' && LA14_104<='!')||(LA14_104>='#' && LA14_104<='\uFFFF')) ) {s = 28;}

                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA14_4 = input.LA(1);

                        s = -1;
                        if ( (LA14_4=='t') ) {s = 26;}

                        else if ( (LA14_4=='f') ) {s = 27;}

                        else if ( ((LA14_4>='\u0000' && LA14_4<='/')||(LA14_4>=':' && LA14_4<='e')||(LA14_4>='g' && LA14_4<='s')||(LA14_4>='u' && LA14_4<='\uFFFF')) ) {s = 28;}

                        else if ( ((LA14_4>='0' && LA14_4<='9')) ) {s = 29;}

                        else s = 21;

                        if ( s>=0 ) return s;
                        break;
                    case 12 : 
                        int LA14_18 = input.LA(1);

                        s = -1;
                        if ( ((LA14_18>='\u0000' && LA14_18<='\uFFFF')) ) {s = 28;}

                        else s = 21;

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 14, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}