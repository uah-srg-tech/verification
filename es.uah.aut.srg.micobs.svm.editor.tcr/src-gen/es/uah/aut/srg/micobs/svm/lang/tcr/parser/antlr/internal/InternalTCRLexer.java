package es.uah.aut.srg.micobs.svm.lang.tcr.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;


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
            // InternalTCR.g:11:7: ( '<TestCampaignReport' )
            // InternalTCR.g:11:9: '<TestCampaignReport'
            {
            match("<TestCampaignReport"); 


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
            // InternalTCR.g:12:7: ( 'name=' )
            // InternalTCR.g:12:9: 'name='
            {
            match("name="); 


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
            // InternalTCR.g:13:7: ( 'id=' )
            // InternalTCR.g:13:9: 'id='
            {
            match("id="); 


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
            // InternalTCR.g:14:7: ( 'issue=' )
            // InternalTCR.g:14:9: 'issue='
            {
            match("issue="); 


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
            // InternalTCR.g:15:7: ( 'revision=' )
            // InternalTCR.g:15:9: 'revision='
            {
            match("revision="); 


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
            // InternalTCR.g:16:7: ( 'date=' )
            // InternalTCR.g:16:9: 'date='
            {
            match("date="); 


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
            // InternalTCR.g:17:7: ( '>' )
            // InternalTCR.g:17:9: '>'
            {
            match('>'); 

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
            // InternalTCR.g:18:7: ( '</TestCampaignReport>' )
            // InternalTCR.g:18:9: '</TestCampaignReport>'
            {
            match("</TestCampaignReport>"); 


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
            // InternalTCR.g:19:7: ( '<VTCRTestReport' )
            // InternalTCR.g:19:9: '<VTCRTestReport'
            {
            match("<VTCRTestReport"); 


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
            // InternalTCR.g:20:7: ( 'test_procedure=' )
            // InternalTCR.g:20:9: 'test_procedure='
            {
            match("test_procedure="); 


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
            // InternalTCR.g:21:7: ( '<status>' )
            // InternalTCR.g:21:9: '<status>'
            {
            match("<status>"); 


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
            // InternalTCR.g:22:7: ( '</status>' )
            // InternalTCR.g:22:9: '</status>'
            {
            match("</status>"); 


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
            // InternalTCR.g:23:7: ( '</VTCRTestReport>' )
            // InternalTCR.g:23:9: '</VTCRTestReport>'
            {
            match("</VTCRTestReport>"); 


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
            // InternalTCR.g:24:7: ( '<evidence>' )
            // InternalTCR.g:24:9: '<evidence>'
            {
            match("<evidence>"); 


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
            // InternalTCR.g:25:7: ( '</evidence>' )
            // InternalTCR.g:25:9: '</evidence>'
            {
            match("</evidence>"); 


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
            // InternalTCR.g:26:7: ( '<run' )
            // InternalTCR.g:26:9: '<run'
            {
            match("<run"); 


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
            // InternalTCR.g:27:7: ( 'bold=' )
            // InternalTCR.g:27:9: 'bold='
            {
            match("bold="); 


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
            // InternalTCR.g:28:7: ( 'italics=' )
            // InternalTCR.g:28:9: 'italics='
            {
            match("italics="); 


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
            // InternalTCR.g:29:7: ( 'underline=' )
            // InternalTCR.g:29:9: 'underline='
            {
            match("underline="); 


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
            // InternalTCR.g:30:7: ( 'color=' )
            // InternalTCR.g:30:9: 'color='
            {
            match("color="); 


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
            // InternalTCR.g:31:7: ( '</run>' )
            // InternalTCR.g:31:9: '</run>'
            {
            match("</run>"); 


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
            // InternalTCR.g:32:7: ( 'Fail' )
            // InternalTCR.g:32:9: 'Fail'
            {
            match("Fail"); 


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
            // InternalTCR.g:33:7: ( 'Pass' )
            // InternalTCR.g:33:9: 'Pass'
            {
            match("Pass"); 


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
            // InternalTCR.g:34:7: ( 'NotTested' )
            // InternalTCR.g:34:9: 'NotTested'
            {
            match("NotTested"); 


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
            // InternalTCR.g:35:7: ( '\"true\"' )
            // InternalTCR.g:35:9: '\"true\"'
            {
            match("\"true\""); 


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
            // InternalTCR.g:36:7: ( '\"false\"' )
            // InternalTCR.g:36:9: '\"false\"'
            {
            match("\"false\""); 


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
            // InternalTCR.g:656:14: ( '<text>' ( options {greedy=false; } : . )* '</text>' )
            // InternalTCR.g:656:16: '<text>' ( options {greedy=false; } : . )* '</text>'
            {
            match("<text>"); 

            // InternalTCR.g:656:25: ( options {greedy=false; } : . )*
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
            	    // InternalTCR.g:656:53: .
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
            // InternalTCR.g:658:18: ( '\"' ( '0' .. '9' )+ '\"' )
            // InternalTCR.g:658:20: '\"' ( '0' .. '9' )+ '\"'
            {
            match('\"'); 
            // InternalTCR.g:658:24: ( '0' .. '9' )+
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
            	    // InternalTCR.g:658:25: '0' .. '9'
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
            // InternalTCR.g:660:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // InternalTCR.g:660:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // InternalTCR.g:660:11: ( '^' )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0=='^') ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalTCR.g:660:11: '^'
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

            // InternalTCR.g:660:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
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
            // InternalTCR.g:662:10: ( ( '0' .. '9' )+ )
            // InternalTCR.g:662:12: ( '0' .. '9' )+
            {
            // InternalTCR.g:662:12: ( '0' .. '9' )+
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
            	    // InternalTCR.g:662:13: '0' .. '9'
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
            // InternalTCR.g:664:13: ( ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // InternalTCR.g:664:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // InternalTCR.g:664:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
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
                    // InternalTCR.g:664:16: '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // InternalTCR.g:664:20: ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )*
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
                    	    // InternalTCR.g:664:21: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalTCR.g:664:28: ~ ( ( '\\\\' | '\"' ) )
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
                    // InternalTCR.g:664:48: '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // InternalTCR.g:664:53: ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )*
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
                    	    // InternalTCR.g:664:54: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalTCR.g:664:61: ~ ( ( '\\\\' | '\\'' ) )
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
            // InternalTCR.g:666:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // InternalTCR.g:666:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // InternalTCR.g:666:24: ( options {greedy=false; } : . )*
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
            	    // InternalTCR.g:666:52: .
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
            // InternalTCR.g:668:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // InternalTCR.g:668:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // InternalTCR.g:668:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( ((LA10_0>='\u0000' && LA10_0<='\t')||(LA10_0>='\u000B' && LA10_0<='\f')||(LA10_0>='\u000E' && LA10_0<='\uFFFF')) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalTCR.g:668:24: ~ ( ( '\\n' | '\\r' ) )
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

            // InternalTCR.g:668:40: ( ( '\\r' )? '\\n' )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0=='\n'||LA12_0=='\r') ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalTCR.g:668:41: ( '\\r' )? '\\n'
                    {
                    // InternalTCR.g:668:41: ( '\\r' )?
                    int alt11=2;
                    int LA11_0 = input.LA(1);

                    if ( (LA11_0=='\r') ) {
                        alt11=1;
                    }
                    switch (alt11) {
                        case 1 :
                            // InternalTCR.g:668:41: '\\r'
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
            // InternalTCR.g:670:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // InternalTCR.g:670:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // InternalTCR.g:670:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
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
            // InternalTCR.g:672:16: ( . )
            // InternalTCR.g:672:18: .
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
        "\1\uffff\1\25\4\36\1\uffff\7\36\2\25\2\uffff\2\25\11\uffff\1\36\1\uffff\5\36\1\uffff\7\36\15\uffff\1\36\1\uffff\13\36\3\uffff\11\36\1\141\1\142\1\36\4\uffff\3\36\1\uffff\1\36\1\uffff\2\36\2\uffff\1\36\3\uffff\4\36\1\uffff\1\36\2\uffff\5\36\3\uffff\4\36\2\uffff\2\36\1\u0082\1\36\2\uffff\4\36\1\uffff";
    static final String DFA14_eofS =
        "\u0088\uffff";
    static final String DFA14_minS =
        "\1\0\1\57\1\141\1\144\1\145\1\141\1\uffff\1\145\1\157\1\156\1\157\2\141\1\157\1\0\1\101\2\uffff\1\0\1\52\3\uffff\1\124\5\uffff\1\155\1\uffff\1\75\1\163\1\141\1\166\1\164\1\uffff\1\163\1\154\1\144\1\154\1\151\1\163\1\164\2\0\1\uffff\1\0\11\uffff\1\145\1\uffff\1\165\1\154\1\151\1\145\1\164\1\144\1\145\1\157\1\154\1\163\1\124\2\0\1\uffff\1\75\1\145\1\151\1\163\1\75\1\137\1\75\2\162\2\60\1\145\2\0\2\uffff\1\75\1\143\1\151\1\uffff\1\160\1\uffff\1\154\1\75\2\uffff\1\163\2\0\1\uffff\1\163\1\157\1\162\1\151\1\uffff\1\164\1\uffff\1\0\1\75\1\156\1\157\1\156\1\145\3\uffff\1\75\1\143\1\145\1\144\2\uffff\1\145\1\75\1\60\1\144\2\uffff\1\165\1\162\1\145\1\75\1\uffff";
    static final String DFA14_maxS =
        "\1\uffff\1\164\1\141\1\164\1\145\1\141\1\uffff\1\145\1\157\1\156\1\157\2\141\1\157\1\uffff\1\172\2\uffff\1\uffff\1\57\3\uffff\1\163\5\uffff\1\155\1\uffff\1\75\1\163\1\141\1\166\1\164\1\uffff\1\163\1\154\1\144\1\154\1\151\1\163\1\164\2\uffff\1\uffff\1\uffff\11\uffff\1\145\1\uffff\1\165\1\154\1\151\1\145\1\164\1\144\1\145\1\157\1\154\1\163\1\124\2\uffff\1\uffff\1\75\1\145\1\151\1\163\1\75\1\137\1\75\2\162\2\172\1\145\2\uffff\2\uffff\1\75\1\143\1\151\1\uffff\1\160\1\uffff\1\154\1\75\2\uffff\1\163\2\uffff\1\uffff\1\163\1\157\1\162\1\151\1\uffff\1\164\1\uffff\1\uffff\1\75\1\156\1\157\1\156\1\145\3\uffff\1\75\1\143\1\145\1\144\2\uffff\1\145\1\75\1\172\1\144\2\uffff\1\165\1\162\1\145\1\75\1\uffff";
    static final String DFA14_acceptS =
        "\6\uffff\1\7\11\uffff\1\35\1\36\2\uffff\1\42\1\43\1\1\1\uffff\1\11\1\13\1\16\1\20\1\33\1\uffff\1\35\5\uffff\1\7\11\uffff\1\37\1\uffff\1\36\1\40\1\41\1\42\1\10\1\14\1\15\1\17\1\25\1\uffff\1\3\15\uffff\1\34\16\uffff\1\34\1\2\3\uffff\1\6\1\uffff\1\21\2\uffff\1\26\1\27\3\uffff\1\4\4\uffff\1\24\1\uffff\1\31\6\uffff\1\31\1\32\1\22\4\uffff\1\32\1\5\4\uffff\1\23\1\30\4\uffff\1\12";
    static final String DFA14_specialS =
        "\1\12\15\uffff\1\13\3\uffff\1\14\31\uffff\1\1\1\5\1\uffff\1\0\26\uffff\1\2\1\6\15\uffff\1\3\1\7\15\uffff\1\4\1\10\10\uffff\1\11\31\uffff}>";
    static final String[] DFA14_transitionS = {
            "\11\25\2\24\2\25\1\24\22\25\1\24\1\25\1\16\4\25\1\22\7\25\1\23\12\21\2\25\1\1\1\25\1\6\2\25\5\20\1\13\7\20\1\15\1\20\1\14\12\20\3\25\1\17\1\20\1\25\1\20\1\10\1\12\1\5\4\20\1\3\4\20\1\2\3\20\1\4\1\20\1\7\1\11\5\20\uff85\25",
            "\1\27\44\uffff\1\26\1\uffff\1\30\16\uffff\1\32\14\uffff\1\33\1\31\1\34",
            "\1\35",
            "\1\37\16\uffff\1\40\1\41",
            "\1\42",
            "\1\43",
            "",
            "\1\45",
            "\1\46",
            "\1\47",
            "\1\50",
            "\1\51",
            "\1\52",
            "\1\53",
            "\60\56\12\57\54\56\1\55\15\56\1\54\uff8b\56",
            "\32\36\4\uffff\1\36\1\uffff\32\36",
            "",
            "",
            "\0\56",
            "\1\61\4\uffff\1\62",
            "",
            "",
            "",
            "\1\64\1\uffff\1\66\16\uffff\1\67\14\uffff\1\70\1\65",
            "",
            "",
            "",
            "",
            "",
            "\1\71",
            "",
            "\1\72",
            "\1\73",
            "\1\74",
            "\1\75",
            "\1\76",
            "",
            "\1\77",
            "\1\100",
            "\1\101",
            "\1\102",
            "\1\103",
            "\1\104",
            "\1\105",
            "\162\56\1\106\uff8d\56",
            "\141\56\1\107\uff9e\56",
            "",
            "\42\56\1\110\15\56\12\57\uffc6\56",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\111",
            "",
            "\1\112",
            "\1\113",
            "\1\114",
            "\1\115",
            "\1\116",
            "\1\117",
            "\1\120",
            "\1\121",
            "\1\122",
            "\1\123",
            "\1\124",
            "\165\56\1\125\uff8a\56",
            "\154\56\1\126\uff93\56",
            "",
            "\1\130",
            "\1\131",
            "\1\132",
            "\1\133",
            "\1\134",
            "\1\135",
            "\1\136",
            "\1\137",
            "\1\140",
            "\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32\36",
            "\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32\36",
            "\1\143",
            "\145\56\1\144\uff9a\56",
            "\163\56\1\145\uff8c\56",
            "",
            "",
            "\1\146",
            "\1\147",
            "\1\150",
            "",
            "\1\151",
            "",
            "\1\152",
            "\1\153",
            "",
            "",
            "\1\154",
            "\42\56\1\155\uffdd\56",
            "\145\56\1\156\uff9a\56",
            "",
            "\1\157",
            "\1\160",
            "\1\161",
            "\1\162",
            "",
            "\1\163",
            "",
            "\42\56\1\165\uffdd\56",
            "\1\166",
            "\1\167",
            "\1\170",
            "\1\171",
            "\1\172",
            "",
            "",
            "",
            "\1\174",
            "\1\175",
            "\1\176",
            "\1\177",
            "",
            "",
            "\1\u0080",
            "\1\u0081",
            "\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32\36",
            "\1\u0083",
            "",
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
                        int LA14_47 = input.LA(1);

                        s = -1;
                        if ( (LA14_47=='\"') ) {s = 72;}

                        else if ( ((LA14_47>='\u0000' && LA14_47<='!')||(LA14_47>='#' && LA14_47<='/')||(LA14_47>=':' && LA14_47<='\uFFFF')) ) {s = 46;}

                        else if ( ((LA14_47>='0' && LA14_47<='9')) ) {s = 47;}

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA14_44 = input.LA(1);

                        s = -1;
                        if ( (LA14_44=='r') ) {s = 70;}

                        else if ( ((LA14_44>='\u0000' && LA14_44<='q')||(LA14_44>='s' && LA14_44<='\uFFFF')) ) {s = 46;}

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA14_70 = input.LA(1);

                        s = -1;
                        if ( (LA14_70=='u') ) {s = 85;}

                        else if ( ((LA14_70>='\u0000' && LA14_70<='t')||(LA14_70>='v' && LA14_70<='\uFFFF')) ) {s = 46;}

                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA14_85 = input.LA(1);

                        s = -1;
                        if ( (LA14_85=='e') ) {s = 100;}

                        else if ( ((LA14_85>='\u0000' && LA14_85<='d')||(LA14_85>='f' && LA14_85<='\uFFFF')) ) {s = 46;}

                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA14_100 = input.LA(1);

                        s = -1;
                        if ( (LA14_100=='\"') ) {s = 109;}

                        else if ( ((LA14_100>='\u0000' && LA14_100<='!')||(LA14_100>='#' && LA14_100<='\uFFFF')) ) {s = 46;}

                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA14_45 = input.LA(1);

                        s = -1;
                        if ( (LA14_45=='a') ) {s = 71;}

                        else if ( ((LA14_45>='\u0000' && LA14_45<='`')||(LA14_45>='b' && LA14_45<='\uFFFF')) ) {s = 46;}

                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA14_71 = input.LA(1);

                        s = -1;
                        if ( (LA14_71=='l') ) {s = 86;}

                        else if ( ((LA14_71>='\u0000' && LA14_71<='k')||(LA14_71>='m' && LA14_71<='\uFFFF')) ) {s = 46;}

                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA14_86 = input.LA(1);

                        s = -1;
                        if ( (LA14_86=='s') ) {s = 101;}

                        else if ( ((LA14_86>='\u0000' && LA14_86<='r')||(LA14_86>='t' && LA14_86<='\uFFFF')) ) {s = 46;}

                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA14_101 = input.LA(1);

                        s = -1;
                        if ( (LA14_101=='e') ) {s = 110;}

                        else if ( ((LA14_101>='\u0000' && LA14_101<='d')||(LA14_101>='f' && LA14_101<='\uFFFF')) ) {s = 46;}

                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA14_110 = input.LA(1);

                        s = -1;
                        if ( (LA14_110=='\"') ) {s = 117;}

                        else if ( ((LA14_110>='\u0000' && LA14_110<='!')||(LA14_110>='#' && LA14_110<='\uFFFF')) ) {s = 46;}

                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA14_0 = input.LA(1);

                        s = -1;
                        if ( (LA14_0=='<') ) {s = 1;}

                        else if ( (LA14_0=='n') ) {s = 2;}

                        else if ( (LA14_0=='i') ) {s = 3;}

                        else if ( (LA14_0=='r') ) {s = 4;}

                        else if ( (LA14_0=='d') ) {s = 5;}

                        else if ( (LA14_0=='>') ) {s = 6;}

                        else if ( (LA14_0=='t') ) {s = 7;}

                        else if ( (LA14_0=='b') ) {s = 8;}

                        else if ( (LA14_0=='u') ) {s = 9;}

                        else if ( (LA14_0=='c') ) {s = 10;}

                        else if ( (LA14_0=='F') ) {s = 11;}

                        else if ( (LA14_0=='P') ) {s = 12;}

                        else if ( (LA14_0=='N') ) {s = 13;}

                        else if ( (LA14_0=='\"') ) {s = 14;}

                        else if ( (LA14_0=='^') ) {s = 15;}

                        else if ( ((LA14_0>='A' && LA14_0<='E')||(LA14_0>='G' && LA14_0<='M')||LA14_0=='O'||(LA14_0>='Q' && LA14_0<='Z')||LA14_0=='_'||LA14_0=='a'||(LA14_0>='e' && LA14_0<='h')||(LA14_0>='j' && LA14_0<='m')||(LA14_0>='o' && LA14_0<='q')||LA14_0=='s'||(LA14_0>='v' && LA14_0<='z')) ) {s = 16;}

                        else if ( ((LA14_0>='0' && LA14_0<='9')) ) {s = 17;}

                        else if ( (LA14_0=='\'') ) {s = 18;}

                        else if ( (LA14_0=='/') ) {s = 19;}

                        else if ( ((LA14_0>='\t' && LA14_0<='\n')||LA14_0=='\r'||LA14_0==' ') ) {s = 20;}

                        else if ( ((LA14_0>='\u0000' && LA14_0<='\b')||(LA14_0>='\u000B' && LA14_0<='\f')||(LA14_0>='\u000E' && LA14_0<='\u001F')||LA14_0=='!'||(LA14_0>='#' && LA14_0<='&')||(LA14_0>='(' && LA14_0<='.')||(LA14_0>=':' && LA14_0<=';')||LA14_0=='='||(LA14_0>='?' && LA14_0<='@')||(LA14_0>='[' && LA14_0<=']')||LA14_0=='`'||(LA14_0>='{' && LA14_0<='\uFFFF')) ) {s = 21;}

                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA14_14 = input.LA(1);

                        s = -1;
                        if ( (LA14_14=='t') ) {s = 44;}

                        else if ( (LA14_14=='f') ) {s = 45;}

                        else if ( ((LA14_14>='\u0000' && LA14_14<='/')||(LA14_14>=':' && LA14_14<='e')||(LA14_14>='g' && LA14_14<='s')||(LA14_14>='u' && LA14_14<='\uFFFF')) ) {s = 46;}

                        else if ( ((LA14_14>='0' && LA14_14<='9')) ) {s = 47;}

                        else s = 21;

                        if ( s>=0 ) return s;
                        break;
                    case 12 : 
                        int LA14_18 = input.LA(1);

                        s = -1;
                        if ( ((LA14_18>='\u0000' && LA14_18<='\uFFFF')) ) {s = 46;}

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