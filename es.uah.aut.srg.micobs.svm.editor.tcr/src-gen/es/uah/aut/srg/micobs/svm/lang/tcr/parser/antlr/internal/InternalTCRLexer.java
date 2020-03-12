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
            // InternalTCR.g:21:7: ( 'status=' )
            // InternalTCR.g:21:9: 'status='
            {
            match("status="); 


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
            // InternalTCR.g:22:7: ( '</VTCRTestReport>' )
            // InternalTCR.g:22:9: '</VTCRTestReport>'
            {
            match("</VTCRTestReport>"); 


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
            // InternalTCR.g:23:7: ( '<evidence>' )
            // InternalTCR.g:23:9: '<evidence>'
            {
            match("<evidence>"); 


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
            // InternalTCR.g:24:7: ( '</evidence>' )
            // InternalTCR.g:24:9: '</evidence>'
            {
            match("</evidence>"); 


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
            // InternalTCR.g:25:7: ( '<run' )
            // InternalTCR.g:25:9: '<run'
            {
            match("<run"); 


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
            // InternalTCR.g:26:7: ( 'bold=' )
            // InternalTCR.g:26:9: 'bold='
            {
            match("bold="); 


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
            // InternalTCR.g:27:7: ( 'italics=' )
            // InternalTCR.g:27:9: 'italics='
            {
            match("italics="); 


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
            // InternalTCR.g:28:7: ( 'underline=' )
            // InternalTCR.g:28:9: 'underline='
            {
            match("underline="); 


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
            // InternalTCR.g:29:7: ( 'color=' )
            // InternalTCR.g:29:9: 'color='
            {
            match("color="); 


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
            // InternalTCR.g:30:7: ( '</run>' )
            // InternalTCR.g:30:9: '</run>'
            {
            match("</run>"); 


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
            // InternalTCR.g:31:7: ( '\"Fail\"' )
            // InternalTCR.g:31:9: '\"Fail\"'
            {
            match("\"Fail\""); 


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
            // InternalTCR.g:32:7: ( '\"Pass\"' )
            // InternalTCR.g:32:9: '\"Pass\"'
            {
            match("\"Pass\""); 


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
            // InternalTCR.g:33:7: ( '\"NotTested\"' )
            // InternalTCR.g:33:9: '\"NotTested\"'
            {
            match("\"NotTested\""); 


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
            // InternalTCR.g:34:7: ( '\"true\"' )
            // InternalTCR.g:34:9: '\"true\"'
            {
            match("\"true\""); 


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
            // InternalTCR.g:35:7: ( '\"false\"' )
            // InternalTCR.g:35:9: '\"false\"'
            {
            match("\"false\""); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__37"

    // $ANTLR start "RULE_RUNTEXT"
    public final void mRULE_RUNTEXT() throws RecognitionException {
        try {
            int _type = RULE_RUNTEXT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTCR.g:652:14: ( '<text>' ( options {greedy=false; } : . )* '</text>' )
            // InternalTCR.g:652:16: '<text>' ( options {greedy=false; } : . )* '</text>'
            {
            match("<text>"); 

            // InternalTCR.g:652:25: ( options {greedy=false; } : . )*
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
            	    // InternalTCR.g:652:53: .
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
            // InternalTCR.g:654:18: ( '\"' ( '0' .. '9' )+ '\"' )
            // InternalTCR.g:654:20: '\"' ( '0' .. '9' )+ '\"'
            {
            match('\"'); 
            // InternalTCR.g:654:24: ( '0' .. '9' )+
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
            	    // InternalTCR.g:654:25: '0' .. '9'
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
            // InternalTCR.g:656:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // InternalTCR.g:656:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // InternalTCR.g:656:11: ( '^' )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0=='^') ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalTCR.g:656:11: '^'
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

            // InternalTCR.g:656:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
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
            // InternalTCR.g:658:10: ( ( '0' .. '9' )+ )
            // InternalTCR.g:658:12: ( '0' .. '9' )+
            {
            // InternalTCR.g:658:12: ( '0' .. '9' )+
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
            	    // InternalTCR.g:658:13: '0' .. '9'
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
            // InternalTCR.g:660:13: ( ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // InternalTCR.g:660:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // InternalTCR.g:660:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
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
                    // InternalTCR.g:660:16: '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // InternalTCR.g:660:20: ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )*
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
                    	    // InternalTCR.g:660:21: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalTCR.g:660:28: ~ ( ( '\\\\' | '\"' ) )
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
                    // InternalTCR.g:660:48: '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // InternalTCR.g:660:53: ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )*
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
                    	    // InternalTCR.g:660:54: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalTCR.g:660:61: ~ ( ( '\\\\' | '\\'' ) )
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
            // InternalTCR.g:662:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // InternalTCR.g:662:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // InternalTCR.g:662:24: ( options {greedy=false; } : . )*
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
            	    // InternalTCR.g:662:52: .
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
            // InternalTCR.g:664:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // InternalTCR.g:664:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // InternalTCR.g:664:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( ((LA10_0>='\u0000' && LA10_0<='\t')||(LA10_0>='\u000B' && LA10_0<='\f')||(LA10_0>='\u000E' && LA10_0<='\uFFFF')) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalTCR.g:664:24: ~ ( ( '\\n' | '\\r' ) )
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

            // InternalTCR.g:664:40: ( ( '\\r' )? '\\n' )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0=='\n'||LA12_0=='\r') ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalTCR.g:664:41: ( '\\r' )? '\\n'
                    {
                    // InternalTCR.g:664:41: ( '\\r' )?
                    int alt11=2;
                    int LA11_0 = input.LA(1);

                    if ( (LA11_0=='\r') ) {
                        alt11=1;
                    }
                    switch (alt11) {
                        case 1 :
                            // InternalTCR.g:664:41: '\\r'
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
            // InternalTCR.g:666:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // InternalTCR.g:666:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // InternalTCR.g:666:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
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
            // InternalTCR.g:668:16: ( . )
            // InternalTCR.g:668:18: .
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
        // InternalTCR.g:1:8: ( T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | RULE_RUNTEXT | RULE_UINT_STRING | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt14=34;
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
                // InternalTCR.g:1:160: RULE_RUNTEXT
                {
                mRULE_RUNTEXT(); 

                }
                break;
            case 27 :
                // InternalTCR.g:1:173: RULE_UINT_STRING
                {
                mRULE_UINT_STRING(); 

                }
                break;
            case 28 :
                // InternalTCR.g:1:190: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 29 :
                // InternalTCR.g:1:198: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 30 :
                // InternalTCR.g:1:207: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 31 :
                // InternalTCR.g:1:219: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 32 :
                // InternalTCR.g:1:235: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 33 :
                // InternalTCR.g:1:251: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 34 :
                // InternalTCR.g:1:259: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA14 dfa14 = new DFA14(this);
    static final String DFA14_eotS =
        "\1\uffff\1\23\4\33\1\uffff\5\33\2\23\2\uffff\2\23\10\uffff\1\33\1\uffff\5\33\1\uffff\5\33\17\uffff\1\33\1\uffff\11\33\6\uffff\12\33\7\uffff\3\33\1\uffff\2\33\1\uffff\2\33\6\uffff\5\33\6\uffff\3\33\1\uffff\1\33\6\uffff\3\33\3\uffff\2\33\1\uffff\1\33\2\uffff\1\33\1\uffff\1\33\1\uffff\2\33\1\uffff";
    static final String DFA14_eofS =
        "\u0090\uffff";
    static final String DFA14_minS =
        "\1\0\1\57\1\141\1\144\1\145\1\141\1\uffff\1\145\1\164\1\157\1\156\1\157\1\0\1\101\2\uffff\1\0\1\52\3\uffff\1\124\4\uffff\1\155\1\uffff\1\75\1\163\1\141\1\166\1\164\1\uffff\1\163\1\141\1\154\1\144\1\154\5\0\1\uffff\1\0\10\uffff\1\145\1\uffff\1\165\1\154\1\151\1\145\2\164\1\144\1\145\1\157\5\0\1\uffff\1\75\1\145\1\151\1\163\1\75\1\137\1\165\1\75\2\162\5\0\2\uffff\1\75\1\143\1\151\1\uffff\1\160\1\163\1\uffff\1\154\1\75\5\0\1\uffff\1\163\1\157\1\162\1\75\1\151\3\uffff\1\0\1\uffff\1\0\1\75\1\156\1\157\1\uffff\1\156\2\uffff\1\0\3\uffff\1\75\1\143\1\145\1\0\2\uffff\1\145\1\75\1\0\1\144\1\uffff\1\0\1\165\1\uffff\1\162\1\uffff\1\145\1\75\1\uffff";
    static final String DFA14_maxS =
        "\1\uffff\1\164\1\141\1\164\1\145\1\141\1\uffff\1\145\1\164\1\157\1\156\1\157\1\uffff\1\172\2\uffff\1\uffff\1\57\3\uffff\1\162\4\uffff\1\155\1\uffff\1\75\1\163\1\141\1\166\1\164\1\uffff\1\163\1\141\1\154\1\144\1\154\5\uffff\1\uffff\1\uffff\10\uffff\1\145\1\uffff\1\165\1\154\1\151\1\145\2\164\1\144\1\145\1\157\5\uffff\1\uffff\1\75\1\145\1\151\1\163\1\75\1\137\1\165\1\75\2\162\5\uffff\2\uffff\1\75\1\143\1\151\1\uffff\1\160\1\163\1\uffff\1\154\1\75\5\uffff\1\uffff\1\163\1\157\1\162\1\75\1\151\3\uffff\1\uffff\1\uffff\1\uffff\1\75\1\156\1\157\1\uffff\1\156\2\uffff\1\uffff\3\uffff\1\75\1\143\1\145\1\uffff\2\uffff\1\145\1\75\1\uffff\1\144\1\uffff\1\uffff\1\165\1\uffff\1\162\1\uffff\1\145\1\75\1\uffff";
    static final String DFA14_acceptS =
        "\6\uffff\1\7\7\uffff\1\34\1\35\2\uffff\1\41\1\42\1\1\1\uffff\1\11\1\15\1\17\1\32\1\uffff\1\34\5\uffff\1\7\12\uffff\1\36\1\uffff\1\35\1\37\1\40\1\41\1\10\1\14\1\16\1\24\1\uffff\1\3\16\uffff\1\33\17\uffff\1\33\1\2\3\uffff\1\6\2\uffff\1\20\7\uffff\1\4\5\uffff\1\23\1\25\1\26\1\uffff\1\30\4\uffff\1\13\1\uffff\1\25\1\26\1\uffff\1\30\1\31\1\21\4\uffff\1\31\1\5\4\uffff\1\22\2\uffff\1\27\1\uffff\1\27\2\uffff\1\12";
    static final String DFA14_specialS =
        "\1\33\13\uffff\1\35\3\uffff\1\32\26\uffff\1\0\1\4\1\10\1\21\1\25\1\uffff\1\34\23\uffff\1\1\1\5\1\11\1\22\1\26\13\uffff\1\2\1\6\1\12\1\23\1\27\13\uffff\1\3\1\7\1\13\1\24\1\30\11\uffff\1\14\1\uffff\1\31\7\uffff\1\15\6\uffff\1\16\4\uffff\1\17\2\uffff\1\20\7\uffff}>";
    static final String[] DFA14_transitionS = {
            "\11\23\2\22\2\23\1\22\22\23\1\22\1\23\1\14\4\23\1\20\7\23\1\21\12\17\2\23\1\1\1\23\1\6\2\23\32\16\3\23\1\15\1\16\1\23\1\16\1\11\1\13\1\5\4\16\1\3\4\16\1\2\3\16\1\4\1\10\1\7\1\12\5\16\uff85\23",
            "\1\25\44\uffff\1\24\1\uffff\1\26\16\uffff\1\27\14\uffff\1\30\1\uffff\1\31",
            "\1\32",
            "\1\34\16\uffff\1\35\1\36",
            "\1\37",
            "\1\40",
            "",
            "\1\42",
            "\1\43",
            "\1\44",
            "\1\45",
            "\1\46",
            "\60\54\12\55\14\54\1\47\7\54\1\51\1\54\1\50\25\54\1\53\15\54\1\52\uff8b\54",
            "\32\33\4\uffff\1\33\1\uffff\32\33",
            "",
            "",
            "\0\54",
            "\1\57\4\uffff\1\60",
            "",
            "",
            "",
            "\1\62\1\uffff\1\63\16\uffff\1\64\14\uffff\1\65",
            "",
            "",
            "",
            "",
            "\1\66",
            "",
            "\1\67",
            "\1\70",
            "\1\71",
            "\1\72",
            "\1\73",
            "",
            "\1\74",
            "\1\75",
            "\1\76",
            "\1\77",
            "\1\100",
            "\141\54\1\101\uff9e\54",
            "\141\54\1\102\uff9e\54",
            "\157\54\1\103\uff90\54",
            "\162\54\1\104\uff8d\54",
            "\141\54\1\105\uff9e\54",
            "",
            "\42\54\1\106\15\54\12\55\uffc6\54",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\107",
            "",
            "\1\110",
            "\1\111",
            "\1\112",
            "\1\113",
            "\1\114",
            "\1\115",
            "\1\116",
            "\1\117",
            "\1\120",
            "\151\54\1\121\uff96\54",
            "\163\54\1\122\uff8c\54",
            "\164\54\1\123\uff8b\54",
            "\165\54\1\124\uff8a\54",
            "\154\54\1\125\uff93\54",
            "",
            "\1\127",
            "\1\130",
            "\1\131",
            "\1\132",
            "\1\133",
            "\1\134",
            "\1\135",
            "\1\136",
            "\1\137",
            "\1\140",
            "\154\54\1\141\uff93\54",
            "\163\54\1\142\uff8c\54",
            "\124\54\1\143\uffab\54",
            "\145\54\1\144\uff9a\54",
            "\163\54\1\145\uff8c\54",
            "",
            "",
            "\1\146",
            "\1\147",
            "\1\150",
            "",
            "\1\151",
            "\1\152",
            "",
            "\1\153",
            "\1\154",
            "\42\54\1\155\uffdd\54",
            "\42\54\1\156\uffdd\54",
            "\145\54\1\157\uff9a\54",
            "\42\54\1\160\uffdd\54",
            "\145\54\1\161\uff9a\54",
            "",
            "\1\162",
            "\1\163",
            "\1\164",
            "\1\165",
            "\1\166",
            "",
            "",
            "",
            "\163\54\1\171\uff8c\54",
            "",
            "\42\54\1\173\uffdd\54",
            "\1\174",
            "\1\175",
            "\1\176",
            "",
            "\1\177",
            "",
            "",
            "\164\54\1\u0080\uff8b\54",
            "",
            "",
            "",
            "\1\u0082",
            "\1\u0083",
            "\1\u0084",
            "\145\54\1\u0085\uff9a\54",
            "",
            "",
            "\1\u0086",
            "\1\u0087",
            "\144\54\1\u0088\uff9b\54",
            "\1\u0089",
            "",
            "\42\54\1\u008a\uffdd\54",
            "\1\u008b",
            "",
            "\1\u008d",
            "",
            "\1\u008e",
            "\1\u008f",
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
            return "1:1: Tokens : ( T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | RULE_RUNTEXT | RULE_UINT_STRING | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA14_39 = input.LA(1);

                        s = -1;
                        if ( (LA14_39=='a') ) {s = 65;}

                        else if ( ((LA14_39>='\u0000' && LA14_39<='`')||(LA14_39>='b' && LA14_39<='\uFFFF')) ) {s = 44;}

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA14_65 = input.LA(1);

                        s = -1;
                        if ( (LA14_65=='i') ) {s = 81;}

                        else if ( ((LA14_65>='\u0000' && LA14_65<='h')||(LA14_65>='j' && LA14_65<='\uFFFF')) ) {s = 44;}

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA14_81 = input.LA(1);

                        s = -1;
                        if ( (LA14_81=='l') ) {s = 97;}

                        else if ( ((LA14_81>='\u0000' && LA14_81<='k')||(LA14_81>='m' && LA14_81<='\uFFFF')) ) {s = 44;}

                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA14_97 = input.LA(1);

                        s = -1;
                        if ( (LA14_97=='\"') ) {s = 109;}

                        else if ( ((LA14_97>='\u0000' && LA14_97<='!')||(LA14_97>='#' && LA14_97<='\uFFFF')) ) {s = 44;}

                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA14_40 = input.LA(1);

                        s = -1;
                        if ( (LA14_40=='a') ) {s = 66;}

                        else if ( ((LA14_40>='\u0000' && LA14_40<='`')||(LA14_40>='b' && LA14_40<='\uFFFF')) ) {s = 44;}

                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA14_66 = input.LA(1);

                        s = -1;
                        if ( (LA14_66=='s') ) {s = 82;}

                        else if ( ((LA14_66>='\u0000' && LA14_66<='r')||(LA14_66>='t' && LA14_66<='\uFFFF')) ) {s = 44;}

                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA14_82 = input.LA(1);

                        s = -1;
                        if ( (LA14_82=='s') ) {s = 98;}

                        else if ( ((LA14_82>='\u0000' && LA14_82<='r')||(LA14_82>='t' && LA14_82<='\uFFFF')) ) {s = 44;}

                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA14_98 = input.LA(1);

                        s = -1;
                        if ( (LA14_98=='\"') ) {s = 110;}

                        else if ( ((LA14_98>='\u0000' && LA14_98<='!')||(LA14_98>='#' && LA14_98<='\uFFFF')) ) {s = 44;}

                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA14_41 = input.LA(1);

                        s = -1;
                        if ( (LA14_41=='o') ) {s = 67;}

                        else if ( ((LA14_41>='\u0000' && LA14_41<='n')||(LA14_41>='p' && LA14_41<='\uFFFF')) ) {s = 44;}

                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA14_67 = input.LA(1);

                        s = -1;
                        if ( (LA14_67=='t') ) {s = 83;}

                        else if ( ((LA14_67>='\u0000' && LA14_67<='s')||(LA14_67>='u' && LA14_67<='\uFFFF')) ) {s = 44;}

                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA14_83 = input.LA(1);

                        s = -1;
                        if ( (LA14_83=='T') ) {s = 99;}

                        else if ( ((LA14_83>='\u0000' && LA14_83<='S')||(LA14_83>='U' && LA14_83<='\uFFFF')) ) {s = 44;}

                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA14_99 = input.LA(1);

                        s = -1;
                        if ( (LA14_99=='e') ) {s = 111;}

                        else if ( ((LA14_99>='\u0000' && LA14_99<='d')||(LA14_99>='f' && LA14_99<='\uFFFF')) ) {s = 44;}

                        if ( s>=0 ) return s;
                        break;
                    case 12 : 
                        int LA14_111 = input.LA(1);

                        s = -1;
                        if ( (LA14_111=='s') ) {s = 121;}

                        else if ( ((LA14_111>='\u0000' && LA14_111<='r')||(LA14_111>='t' && LA14_111<='\uFFFF')) ) {s = 44;}

                        if ( s>=0 ) return s;
                        break;
                    case 13 : 
                        int LA14_121 = input.LA(1);

                        s = -1;
                        if ( (LA14_121=='t') ) {s = 128;}

                        else if ( ((LA14_121>='\u0000' && LA14_121<='s')||(LA14_121>='u' && LA14_121<='\uFFFF')) ) {s = 44;}

                        if ( s>=0 ) return s;
                        break;
                    case 14 : 
                        int LA14_128 = input.LA(1);

                        s = -1;
                        if ( (LA14_128=='e') ) {s = 133;}

                        else if ( ((LA14_128>='\u0000' && LA14_128<='d')||(LA14_128>='f' && LA14_128<='\uFFFF')) ) {s = 44;}

                        if ( s>=0 ) return s;
                        break;
                    case 15 : 
                        int LA14_133 = input.LA(1);

                        s = -1;
                        if ( (LA14_133=='d') ) {s = 136;}

                        else if ( ((LA14_133>='\u0000' && LA14_133<='c')||(LA14_133>='e' && LA14_133<='\uFFFF')) ) {s = 44;}

                        if ( s>=0 ) return s;
                        break;
                    case 16 : 
                        int LA14_136 = input.LA(1);

                        s = -1;
                        if ( (LA14_136=='\"') ) {s = 138;}

                        else if ( ((LA14_136>='\u0000' && LA14_136<='!')||(LA14_136>='#' && LA14_136<='\uFFFF')) ) {s = 44;}

                        if ( s>=0 ) return s;
                        break;
                    case 17 : 
                        int LA14_42 = input.LA(1);

                        s = -1;
                        if ( (LA14_42=='r') ) {s = 68;}

                        else if ( ((LA14_42>='\u0000' && LA14_42<='q')||(LA14_42>='s' && LA14_42<='\uFFFF')) ) {s = 44;}

                        if ( s>=0 ) return s;
                        break;
                    case 18 : 
                        int LA14_68 = input.LA(1);

                        s = -1;
                        if ( (LA14_68=='u') ) {s = 84;}

                        else if ( ((LA14_68>='\u0000' && LA14_68<='t')||(LA14_68>='v' && LA14_68<='\uFFFF')) ) {s = 44;}

                        if ( s>=0 ) return s;
                        break;
                    case 19 : 
                        int LA14_84 = input.LA(1);

                        s = -1;
                        if ( (LA14_84=='e') ) {s = 100;}

                        else if ( ((LA14_84>='\u0000' && LA14_84<='d')||(LA14_84>='f' && LA14_84<='\uFFFF')) ) {s = 44;}

                        if ( s>=0 ) return s;
                        break;
                    case 20 : 
                        int LA14_100 = input.LA(1);

                        s = -1;
                        if ( (LA14_100=='\"') ) {s = 112;}

                        else if ( ((LA14_100>='\u0000' && LA14_100<='!')||(LA14_100>='#' && LA14_100<='\uFFFF')) ) {s = 44;}

                        if ( s>=0 ) return s;
                        break;
                    case 21 : 
                        int LA14_43 = input.LA(1);

                        s = -1;
                        if ( (LA14_43=='a') ) {s = 69;}

                        else if ( ((LA14_43>='\u0000' && LA14_43<='`')||(LA14_43>='b' && LA14_43<='\uFFFF')) ) {s = 44;}

                        if ( s>=0 ) return s;
                        break;
                    case 22 : 
                        int LA14_69 = input.LA(1);

                        s = -1;
                        if ( (LA14_69=='l') ) {s = 85;}

                        else if ( ((LA14_69>='\u0000' && LA14_69<='k')||(LA14_69>='m' && LA14_69<='\uFFFF')) ) {s = 44;}

                        if ( s>=0 ) return s;
                        break;
                    case 23 : 
                        int LA14_85 = input.LA(1);

                        s = -1;
                        if ( (LA14_85=='s') ) {s = 101;}

                        else if ( ((LA14_85>='\u0000' && LA14_85<='r')||(LA14_85>='t' && LA14_85<='\uFFFF')) ) {s = 44;}

                        if ( s>=0 ) return s;
                        break;
                    case 24 : 
                        int LA14_101 = input.LA(1);

                        s = -1;
                        if ( (LA14_101=='e') ) {s = 113;}

                        else if ( ((LA14_101>='\u0000' && LA14_101<='d')||(LA14_101>='f' && LA14_101<='\uFFFF')) ) {s = 44;}

                        if ( s>=0 ) return s;
                        break;
                    case 25 : 
                        int LA14_113 = input.LA(1);

                        s = -1;
                        if ( (LA14_113=='\"') ) {s = 123;}

                        else if ( ((LA14_113>='\u0000' && LA14_113<='!')||(LA14_113>='#' && LA14_113<='\uFFFF')) ) {s = 44;}

                        if ( s>=0 ) return s;
                        break;
                    case 26 : 
                        int LA14_16 = input.LA(1);

                        s = -1;
                        if ( ((LA14_16>='\u0000' && LA14_16<='\uFFFF')) ) {s = 44;}

                        else s = 19;

                        if ( s>=0 ) return s;
                        break;
                    case 27 : 
                        int LA14_0 = input.LA(1);

                        s = -1;
                        if ( (LA14_0=='<') ) {s = 1;}

                        else if ( (LA14_0=='n') ) {s = 2;}

                        else if ( (LA14_0=='i') ) {s = 3;}

                        else if ( (LA14_0=='r') ) {s = 4;}

                        else if ( (LA14_0=='d') ) {s = 5;}

                        else if ( (LA14_0=='>') ) {s = 6;}

                        else if ( (LA14_0=='t') ) {s = 7;}

                        else if ( (LA14_0=='s') ) {s = 8;}

                        else if ( (LA14_0=='b') ) {s = 9;}

                        else if ( (LA14_0=='u') ) {s = 10;}

                        else if ( (LA14_0=='c') ) {s = 11;}

                        else if ( (LA14_0=='\"') ) {s = 12;}

                        else if ( (LA14_0=='^') ) {s = 13;}

                        else if ( ((LA14_0>='A' && LA14_0<='Z')||LA14_0=='_'||LA14_0=='a'||(LA14_0>='e' && LA14_0<='h')||(LA14_0>='j' && LA14_0<='m')||(LA14_0>='o' && LA14_0<='q')||(LA14_0>='v' && LA14_0<='z')) ) {s = 14;}

                        else if ( ((LA14_0>='0' && LA14_0<='9')) ) {s = 15;}

                        else if ( (LA14_0=='\'') ) {s = 16;}

                        else if ( (LA14_0=='/') ) {s = 17;}

                        else if ( ((LA14_0>='\t' && LA14_0<='\n')||LA14_0=='\r'||LA14_0==' ') ) {s = 18;}

                        else if ( ((LA14_0>='\u0000' && LA14_0<='\b')||(LA14_0>='\u000B' && LA14_0<='\f')||(LA14_0>='\u000E' && LA14_0<='\u001F')||LA14_0=='!'||(LA14_0>='#' && LA14_0<='&')||(LA14_0>='(' && LA14_0<='.')||(LA14_0>=':' && LA14_0<=';')||LA14_0=='='||(LA14_0>='?' && LA14_0<='@')||(LA14_0>='[' && LA14_0<=']')||LA14_0=='`'||(LA14_0>='{' && LA14_0<='\uFFFF')) ) {s = 19;}

                        if ( s>=0 ) return s;
                        break;
                    case 28 : 
                        int LA14_45 = input.LA(1);

                        s = -1;
                        if ( (LA14_45=='\"') ) {s = 70;}

                        else if ( ((LA14_45>='\u0000' && LA14_45<='!')||(LA14_45>='#' && LA14_45<='/')||(LA14_45>=':' && LA14_45<='\uFFFF')) ) {s = 44;}

                        else if ( ((LA14_45>='0' && LA14_45<='9')) ) {s = 45;}

                        if ( s>=0 ) return s;
                        break;
                    case 29 : 
                        int LA14_12 = input.LA(1);

                        s = -1;
                        if ( (LA14_12=='F') ) {s = 39;}

                        else if ( (LA14_12=='P') ) {s = 40;}

                        else if ( (LA14_12=='N') ) {s = 41;}

                        else if ( (LA14_12=='t') ) {s = 42;}

                        else if ( (LA14_12=='f') ) {s = 43;}

                        else if ( ((LA14_12>='\u0000' && LA14_12<='/')||(LA14_12>=':' && LA14_12<='E')||(LA14_12>='G' && LA14_12<='M')||LA14_12=='O'||(LA14_12>='Q' && LA14_12<='e')||(LA14_12>='g' && LA14_12<='s')||(LA14_12>='u' && LA14_12<='\uFFFF')) ) {s = 44;}

                        else if ( ((LA14_12>='0' && LA14_12<='9')) ) {s = 45;}

                        else s = 19;

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