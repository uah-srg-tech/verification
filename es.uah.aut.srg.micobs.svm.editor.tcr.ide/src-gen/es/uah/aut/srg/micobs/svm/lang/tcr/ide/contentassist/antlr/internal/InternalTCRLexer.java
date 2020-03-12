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
            // InternalTCR.g:11:7: ( '\"Fail\"' )
            // InternalTCR.g:11:9: '\"Fail\"'
            {
            match("\"Fail\""); 


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
            // InternalTCR.g:12:7: ( '\"Pass\"' )
            // InternalTCR.g:12:9: '\"Pass\"'
            {
            match("\"Pass\""); 


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
            // InternalTCR.g:13:7: ( '\"NotTested\"' )
            // InternalTCR.g:13:9: '\"NotTested\"'
            {
            match("\"NotTested\""); 


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
            // InternalTCR.g:26:7: ( 'status=' )
            // InternalTCR.g:26:9: 'status='
            {
            match("status="); 


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
            // InternalTCR.g:27:7: ( '</VTCRTestReport>' )
            // InternalTCR.g:27:9: '</VTCRTestReport>'
            {
            match("</VTCRTestReport>"); 


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
            // InternalTCR.g:28:7: ( '<evidence>' )
            // InternalTCR.g:28:9: '<evidence>'
            {
            match("<evidence>"); 


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
            // InternalTCR.g:29:7: ( '</evidence>' )
            // InternalTCR.g:29:9: '</evidence>'
            {
            match("</evidence>"); 


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
            // InternalTCR.g:30:7: ( '<run' )
            // InternalTCR.g:30:9: '<run'
            {
            match("<run"); 


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
            // InternalTCR.g:32:7: ( 'bold=' )
            // InternalTCR.g:32:9: 'bold='
            {
            match("bold="); 


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
            // InternalTCR.g:33:7: ( 'italics=' )
            // InternalTCR.g:33:9: 'italics='
            {
            match("italics="); 


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
            // InternalTCR.g:34:7: ( 'underline=' )
            // InternalTCR.g:34:9: 'underline='
            {
            match("underline="); 


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
            // InternalTCR.g:35:7: ( 'color=' )
            // InternalTCR.g:35:9: 'color='
            {
            match("color="); 


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
            // InternalTCR.g:1651:14: ( '<text>' ( options {greedy=false; } : . )* '</text>' )
            // InternalTCR.g:1651:16: '<text>' ( options {greedy=false; } : . )* '</text>'
            {
            match("<text>"); 

            // InternalTCR.g:1651:25: ( options {greedy=false; } : . )*
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
            	    // InternalTCR.g:1651:53: .
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
            // InternalTCR.g:1653:18: ( '\"' ( '0' .. '9' )+ '\"' )
            // InternalTCR.g:1653:20: '\"' ( '0' .. '9' )+ '\"'
            {
            match('\"'); 
            // InternalTCR.g:1653:24: ( '0' .. '9' )+
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
            	    // InternalTCR.g:1653:25: '0' .. '9'
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
            // InternalTCR.g:1655:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // InternalTCR.g:1655:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // InternalTCR.g:1655:11: ( '^' )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0=='^') ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalTCR.g:1655:11: '^'
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

            // InternalTCR.g:1655:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
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
            // InternalTCR.g:1657:10: ( ( '0' .. '9' )+ )
            // InternalTCR.g:1657:12: ( '0' .. '9' )+
            {
            // InternalTCR.g:1657:12: ( '0' .. '9' )+
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
            	    // InternalTCR.g:1657:13: '0' .. '9'
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
            // InternalTCR.g:1659:13: ( ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // InternalTCR.g:1659:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // InternalTCR.g:1659:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
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
                    // InternalTCR.g:1659:16: '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // InternalTCR.g:1659:20: ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )*
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
                    	    // InternalTCR.g:1659:21: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalTCR.g:1659:28: ~ ( ( '\\\\' | '\"' ) )
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
                    // InternalTCR.g:1659:48: '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // InternalTCR.g:1659:53: ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )*
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
                    	    // InternalTCR.g:1659:54: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalTCR.g:1659:61: ~ ( ( '\\\\' | '\\'' ) )
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
            // InternalTCR.g:1661:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // InternalTCR.g:1661:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // InternalTCR.g:1661:24: ( options {greedy=false; } : . )*
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
            	    // InternalTCR.g:1661:52: .
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
            // InternalTCR.g:1663:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // InternalTCR.g:1663:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // InternalTCR.g:1663:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( ((LA10_0>='\u0000' && LA10_0<='\t')||(LA10_0>='\u000B' && LA10_0<='\f')||(LA10_0>='\u000E' && LA10_0<='\uFFFF')) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalTCR.g:1663:24: ~ ( ( '\\n' | '\\r' ) )
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

            // InternalTCR.g:1663:40: ( ( '\\r' )? '\\n' )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0=='\n'||LA12_0=='\r') ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalTCR.g:1663:41: ( '\\r' )? '\\n'
                    {
                    // InternalTCR.g:1663:41: ( '\\r' )?
                    int alt11=2;
                    int LA11_0 = input.LA(1);

                    if ( (LA11_0=='\r') ) {
                        alt11=1;
                    }
                    switch (alt11) {
                        case 1 :
                            // InternalTCR.g:1663:41: '\\r'
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
            // InternalTCR.g:1665:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // InternalTCR.g:1665:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // InternalTCR.g:1665:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
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
            // InternalTCR.g:1667:16: ( . )
            // InternalTCR.g:1667:18: .
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
        "\1\uffff\2\23\4\42\1\uffff\5\42\1\23\2\uffff\2\23\17\uffff\1\42\1\uffff\5\42\1\uffff\5\42\16\uffff\1\42\1\uffff\11\42\6\uffff\12\42\6\uffff\3\42\1\uffff\2\42\1\uffff\2\42\6\uffff\5\42\6\uffff\3\42\1\uffff\1\42\3\uffff\3\42\2\uffff\2\42\1\uffff\1\42\2\uffff\1\42\1\uffff\3\42\1\uffff";
    static final String DFA14_eofS =
        "\u0090\uffff";
    static final String DFA14_minS =
        "\2\0\1\57\1\141\1\144\1\145\1\141\1\uffff\1\145\1\164\1\157\1\156\1\157\1\101\2\uffff\1\0\1\52\2\uffff\5\0\1\uffff\1\0\1\uffff\1\124\4\uffff\1\155\1\uffff\1\75\1\163\1\141\1\166\1\164\1\uffff\1\163\1\141\1\154\1\144\1\154\4\uffff\5\0\5\uffff\1\145\1\uffff\1\165\1\154\1\151\1\145\2\164\1\144\1\145\1\157\5\0\1\uffff\1\75\1\145\1\151\1\163\1\75\1\137\1\165\1\75\2\162\5\0\1\uffff\1\75\1\143\1\151\1\uffff\1\160\1\163\1\uffff\1\154\1\75\2\uffff\1\0\1\uffff\1\0\1\uffff\1\163\1\157\1\162\1\75\1\151\3\uffff\1\0\2\uffff\1\75\1\156\1\157\1\uffff\1\156\1\0\2\uffff\1\75\1\143\1\145\1\0\1\uffff\1\145\1\75\1\0\1\144\2\uffff\1\165\1\uffff\1\162\1\145\1\75\1\uffff";
    static final String DFA14_maxS =
        "\2\uffff\1\164\1\141\1\164\1\145\1\141\1\uffff\1\145\1\164\1\157\1\156\1\157\1\172\2\uffff\1\uffff\1\57\2\uffff\5\uffff\1\uffff\1\uffff\1\uffff\1\162\4\uffff\1\155\1\uffff\1\75\1\163\1\141\1\166\1\164\1\uffff\1\163\1\141\1\154\1\144\1\154\4\uffff\5\uffff\5\uffff\1\145\1\uffff\1\165\1\154\1\151\1\145\2\164\1\144\1\145\1\157\5\uffff\1\uffff\1\75\1\145\1\151\1\163\1\75\1\137\1\165\1\75\2\162\5\uffff\1\uffff\1\75\1\143\1\151\1\uffff\1\160\1\163\1\uffff\1\154\1\75\2\uffff\1\uffff\1\uffff\1\uffff\1\uffff\1\163\1\157\1\162\1\75\1\151\3\uffff\1\uffff\2\uffff\1\75\1\156\1\157\1\uffff\1\156\1\uffff\2\uffff\1\75\1\143\1\145\1\uffff\1\uffff\1\145\1\75\1\uffff\1\144\2\uffff\1\165\1\uffff\1\162\1\145\1\75\1\uffff";
    static final String DFA14_acceptS =
        "\7\uffff\1\14\6\uffff\1\34\1\35\2\uffff\1\41\1\42\5\uffff\1\36\1\uffff\1\6\1\uffff\1\16\1\22\1\24\1\32\1\uffff\1\34\5\uffff\1\14\5\uffff\1\35\1\37\1\40\1\41\5\uffff\1\33\1\15\1\21\1\23\1\25\1\uffff\1\10\16\uffff\1\33\17\uffff\1\7\3\uffff\1\13\2\uffff\1\26\2\uffff\1\1\1\2\1\uffff\1\4\1\uffff\1\11\5\uffff\1\31\1\1\1\2\1\uffff\1\4\1\5\3\uffff\1\20\2\uffff\1\5\1\27\4\uffff\1\12\4\uffff\1\30\1\3\1\uffff\1\3\3\uffff\1\17";
    static final String DFA14_specialS =
        "\1\0\1\22\16\uffff\1\34\3\uffff\1\1\1\5\1\11\1\23\1\27\1\uffff\1\35\27\uffff\1\2\1\6\1\12\1\24\1\30\20\uffff\1\3\1\7\1\13\1\25\1\31\13\uffff\1\4\1\10\1\14\1\26\1\32\14\uffff\1\15\1\uffff\1\33\11\uffff\1\16\7\uffff\1\17\5\uffff\1\20\3\uffff\1\21\11\uffff}>";
    static final String[] DFA14_transitionS = {
            "\11\23\2\22\2\23\1\22\22\23\1\22\1\23\1\1\4\23\1\20\7\23\1\21\12\17\2\23\1\2\1\23\1\7\2\23\32\16\3\23\1\15\1\16\1\23\1\16\1\12\1\14\1\6\4\16\1\4\4\16\1\3\3\16\1\5\1\11\1\10\1\13\5\16\uff85\23",
            "\60\31\12\32\14\31\1\24\7\31\1\26\1\31\1\25\25\31\1\30\15\31\1\27\uff8b\31",
            "\1\34\44\uffff\1\33\1\uffff\1\35\16\uffff\1\36\14\uffff\1\37\1\uffff\1\40",
            "\1\41",
            "\1\43\16\uffff\1\44\1\45",
            "\1\46",
            "\1\47",
            "",
            "\1\51",
            "\1\52",
            "\1\53",
            "\1\54",
            "\1\55",
            "\32\42\4\uffff\1\42\1\uffff\32\42",
            "",
            "",
            "\0\31",
            "\1\57\4\uffff\1\60",
            "",
            "",
            "\141\31\1\62\uff9e\31",
            "\141\31\1\63\uff9e\31",
            "\157\31\1\64\uff90\31",
            "\162\31\1\65\uff8d\31",
            "\141\31\1\66\uff9e\31",
            "",
            "\42\31\1\67\15\31\12\32\uffc6\31",
            "",
            "\1\70\1\uffff\1\71\16\uffff\1\72\14\uffff\1\73",
            "",
            "",
            "",
            "",
            "\1\74",
            "",
            "\1\75",
            "\1\76",
            "\1\77",
            "\1\100",
            "\1\101",
            "",
            "\1\102",
            "\1\103",
            "\1\104",
            "\1\105",
            "\1\106",
            "",
            "",
            "",
            "",
            "\151\31\1\107\uff96\31",
            "\163\31\1\110\uff8c\31",
            "\164\31\1\111\uff8b\31",
            "\165\31\1\112\uff8a\31",
            "\154\31\1\113\uff93\31",
            "",
            "",
            "",
            "",
            "",
            "\1\115",
            "",
            "\1\116",
            "\1\117",
            "\1\120",
            "\1\121",
            "\1\122",
            "\1\123",
            "\1\124",
            "\1\125",
            "\1\126",
            "\154\31\1\127\uff93\31",
            "\163\31\1\130\uff8c\31",
            "\124\31\1\131\uffab\31",
            "\145\31\1\132\uff9a\31",
            "\163\31\1\133\uff8c\31",
            "",
            "\1\134",
            "\1\135",
            "\1\136",
            "\1\137",
            "\1\140",
            "\1\141",
            "\1\142",
            "\1\143",
            "\1\144",
            "\1\145",
            "\42\31\1\146\uffdd\31",
            "\42\31\1\147\uffdd\31",
            "\145\31\1\150\uff9a\31",
            "\42\31\1\151\uffdd\31",
            "\145\31\1\152\uff9a\31",
            "",
            "\1\153",
            "\1\154",
            "\1\155",
            "",
            "\1\156",
            "\1\157",
            "",
            "\1\160",
            "\1\161",
            "",
            "",
            "\163\31\1\164\uff8c\31",
            "",
            "\42\31\1\166\uffdd\31",
            "",
            "\1\167",
            "\1\170",
            "\1\171",
            "\1\172",
            "\1\173",
            "",
            "",
            "",
            "\164\31\1\174\uff8b\31",
            "",
            "",
            "\1\176",
            "\1\177",
            "\1\u0080",
            "",
            "\1\u0081",
            "\145\31\1\u0082\uff9a\31",
            "",
            "",
            "\1\u0083",
            "\1\u0084",
            "\1\u0085",
            "\144\31\1\u0086\uff9b\31",
            "",
            "\1\u0087",
            "\1\u0088",
            "\42\31\1\u0089\uffdd\31",
            "\1\u008a",
            "",
            "",
            "\1\u008c",
            "",
            "\1\u008d",
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
                        int LA14_0 = input.LA(1);

                        s = -1;
                        if ( (LA14_0=='\"') ) {s = 1;}

                        else if ( (LA14_0=='<') ) {s = 2;}

                        else if ( (LA14_0=='n') ) {s = 3;}

                        else if ( (LA14_0=='i') ) {s = 4;}

                        else if ( (LA14_0=='r') ) {s = 5;}

                        else if ( (LA14_0=='d') ) {s = 6;}

                        else if ( (LA14_0=='>') ) {s = 7;}

                        else if ( (LA14_0=='t') ) {s = 8;}

                        else if ( (LA14_0=='s') ) {s = 9;}

                        else if ( (LA14_0=='b') ) {s = 10;}

                        else if ( (LA14_0=='u') ) {s = 11;}

                        else if ( (LA14_0=='c') ) {s = 12;}

                        else if ( (LA14_0=='^') ) {s = 13;}

                        else if ( ((LA14_0>='A' && LA14_0<='Z')||LA14_0=='_'||LA14_0=='a'||(LA14_0>='e' && LA14_0<='h')||(LA14_0>='j' && LA14_0<='m')||(LA14_0>='o' && LA14_0<='q')||(LA14_0>='v' && LA14_0<='z')) ) {s = 14;}

                        else if ( ((LA14_0>='0' && LA14_0<='9')) ) {s = 15;}

                        else if ( (LA14_0=='\'') ) {s = 16;}

                        else if ( (LA14_0=='/') ) {s = 17;}

                        else if ( ((LA14_0>='\t' && LA14_0<='\n')||LA14_0=='\r'||LA14_0==' ') ) {s = 18;}

                        else if ( ((LA14_0>='\u0000' && LA14_0<='\b')||(LA14_0>='\u000B' && LA14_0<='\f')||(LA14_0>='\u000E' && LA14_0<='\u001F')||LA14_0=='!'||(LA14_0>='#' && LA14_0<='&')||(LA14_0>='(' && LA14_0<='.')||(LA14_0>=':' && LA14_0<=';')||LA14_0=='='||(LA14_0>='?' && LA14_0<='@')||(LA14_0>='[' && LA14_0<=']')||LA14_0=='`'||(LA14_0>='{' && LA14_0<='\uFFFF')) ) {s = 19;}

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA14_20 = input.LA(1);

                        s = -1;
                        if ( (LA14_20=='a') ) {s = 50;}

                        else if ( ((LA14_20>='\u0000' && LA14_20<='`')||(LA14_20>='b' && LA14_20<='\uFFFF')) ) {s = 25;}

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA14_50 = input.LA(1);

                        s = -1;
                        if ( (LA14_50=='i') ) {s = 71;}

                        else if ( ((LA14_50>='\u0000' && LA14_50<='h')||(LA14_50>='j' && LA14_50<='\uFFFF')) ) {s = 25;}

                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA14_71 = input.LA(1);

                        s = -1;
                        if ( (LA14_71=='l') ) {s = 87;}

                        else if ( ((LA14_71>='\u0000' && LA14_71<='k')||(LA14_71>='m' && LA14_71<='\uFFFF')) ) {s = 25;}

                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA14_87 = input.LA(1);

                        s = -1;
                        if ( (LA14_87=='\"') ) {s = 102;}

                        else if ( ((LA14_87>='\u0000' && LA14_87<='!')||(LA14_87>='#' && LA14_87<='\uFFFF')) ) {s = 25;}

                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA14_21 = input.LA(1);

                        s = -1;
                        if ( (LA14_21=='a') ) {s = 51;}

                        else if ( ((LA14_21>='\u0000' && LA14_21<='`')||(LA14_21>='b' && LA14_21<='\uFFFF')) ) {s = 25;}

                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA14_51 = input.LA(1);

                        s = -1;
                        if ( (LA14_51=='s') ) {s = 72;}

                        else if ( ((LA14_51>='\u0000' && LA14_51<='r')||(LA14_51>='t' && LA14_51<='\uFFFF')) ) {s = 25;}

                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA14_72 = input.LA(1);

                        s = -1;
                        if ( (LA14_72=='s') ) {s = 88;}

                        else if ( ((LA14_72>='\u0000' && LA14_72<='r')||(LA14_72>='t' && LA14_72<='\uFFFF')) ) {s = 25;}

                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA14_88 = input.LA(1);

                        s = -1;
                        if ( (LA14_88=='\"') ) {s = 103;}

                        else if ( ((LA14_88>='\u0000' && LA14_88<='!')||(LA14_88>='#' && LA14_88<='\uFFFF')) ) {s = 25;}

                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA14_22 = input.LA(1);

                        s = -1;
                        if ( (LA14_22=='o') ) {s = 52;}

                        else if ( ((LA14_22>='\u0000' && LA14_22<='n')||(LA14_22>='p' && LA14_22<='\uFFFF')) ) {s = 25;}

                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA14_52 = input.LA(1);

                        s = -1;
                        if ( (LA14_52=='t') ) {s = 73;}

                        else if ( ((LA14_52>='\u0000' && LA14_52<='s')||(LA14_52>='u' && LA14_52<='\uFFFF')) ) {s = 25;}

                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA14_73 = input.LA(1);

                        s = -1;
                        if ( (LA14_73=='T') ) {s = 89;}

                        else if ( ((LA14_73>='\u0000' && LA14_73<='S')||(LA14_73>='U' && LA14_73<='\uFFFF')) ) {s = 25;}

                        if ( s>=0 ) return s;
                        break;
                    case 12 : 
                        int LA14_89 = input.LA(1);

                        s = -1;
                        if ( (LA14_89=='e') ) {s = 104;}

                        else if ( ((LA14_89>='\u0000' && LA14_89<='d')||(LA14_89>='f' && LA14_89<='\uFFFF')) ) {s = 25;}

                        if ( s>=0 ) return s;
                        break;
                    case 13 : 
                        int LA14_104 = input.LA(1);

                        s = -1;
                        if ( (LA14_104=='s') ) {s = 116;}

                        else if ( ((LA14_104>='\u0000' && LA14_104<='r')||(LA14_104>='t' && LA14_104<='\uFFFF')) ) {s = 25;}

                        if ( s>=0 ) return s;
                        break;
                    case 14 : 
                        int LA14_116 = input.LA(1);

                        s = -1;
                        if ( (LA14_116=='t') ) {s = 124;}

                        else if ( ((LA14_116>='\u0000' && LA14_116<='s')||(LA14_116>='u' && LA14_116<='\uFFFF')) ) {s = 25;}

                        if ( s>=0 ) return s;
                        break;
                    case 15 : 
                        int LA14_124 = input.LA(1);

                        s = -1;
                        if ( (LA14_124=='e') ) {s = 130;}

                        else if ( ((LA14_124>='\u0000' && LA14_124<='d')||(LA14_124>='f' && LA14_124<='\uFFFF')) ) {s = 25;}

                        if ( s>=0 ) return s;
                        break;
                    case 16 : 
                        int LA14_130 = input.LA(1);

                        s = -1;
                        if ( (LA14_130=='d') ) {s = 134;}

                        else if ( ((LA14_130>='\u0000' && LA14_130<='c')||(LA14_130>='e' && LA14_130<='\uFFFF')) ) {s = 25;}

                        if ( s>=0 ) return s;
                        break;
                    case 17 : 
                        int LA14_134 = input.LA(1);

                        s = -1;
                        if ( (LA14_134=='\"') ) {s = 137;}

                        else if ( ((LA14_134>='\u0000' && LA14_134<='!')||(LA14_134>='#' && LA14_134<='\uFFFF')) ) {s = 25;}

                        if ( s>=0 ) return s;
                        break;
                    case 18 : 
                        int LA14_1 = input.LA(1);

                        s = -1;
                        if ( (LA14_1=='F') ) {s = 20;}

                        else if ( (LA14_1=='P') ) {s = 21;}

                        else if ( (LA14_1=='N') ) {s = 22;}

                        else if ( (LA14_1=='t') ) {s = 23;}

                        else if ( (LA14_1=='f') ) {s = 24;}

                        else if ( ((LA14_1>='\u0000' && LA14_1<='/')||(LA14_1>=':' && LA14_1<='E')||(LA14_1>='G' && LA14_1<='M')||LA14_1=='O'||(LA14_1>='Q' && LA14_1<='e')||(LA14_1>='g' && LA14_1<='s')||(LA14_1>='u' && LA14_1<='\uFFFF')) ) {s = 25;}

                        else if ( ((LA14_1>='0' && LA14_1<='9')) ) {s = 26;}

                        else s = 19;

                        if ( s>=0 ) return s;
                        break;
                    case 19 : 
                        int LA14_23 = input.LA(1);

                        s = -1;
                        if ( (LA14_23=='r') ) {s = 53;}

                        else if ( ((LA14_23>='\u0000' && LA14_23<='q')||(LA14_23>='s' && LA14_23<='\uFFFF')) ) {s = 25;}

                        if ( s>=0 ) return s;
                        break;
                    case 20 : 
                        int LA14_53 = input.LA(1);

                        s = -1;
                        if ( (LA14_53=='u') ) {s = 74;}

                        else if ( ((LA14_53>='\u0000' && LA14_53<='t')||(LA14_53>='v' && LA14_53<='\uFFFF')) ) {s = 25;}

                        if ( s>=0 ) return s;
                        break;
                    case 21 : 
                        int LA14_74 = input.LA(1);

                        s = -1;
                        if ( (LA14_74=='e') ) {s = 90;}

                        else if ( ((LA14_74>='\u0000' && LA14_74<='d')||(LA14_74>='f' && LA14_74<='\uFFFF')) ) {s = 25;}

                        if ( s>=0 ) return s;
                        break;
                    case 22 : 
                        int LA14_90 = input.LA(1);

                        s = -1;
                        if ( (LA14_90=='\"') ) {s = 105;}

                        else if ( ((LA14_90>='\u0000' && LA14_90<='!')||(LA14_90>='#' && LA14_90<='\uFFFF')) ) {s = 25;}

                        if ( s>=0 ) return s;
                        break;
                    case 23 : 
                        int LA14_24 = input.LA(1);

                        s = -1;
                        if ( (LA14_24=='a') ) {s = 54;}

                        else if ( ((LA14_24>='\u0000' && LA14_24<='`')||(LA14_24>='b' && LA14_24<='\uFFFF')) ) {s = 25;}

                        if ( s>=0 ) return s;
                        break;
                    case 24 : 
                        int LA14_54 = input.LA(1);

                        s = -1;
                        if ( (LA14_54=='l') ) {s = 75;}

                        else if ( ((LA14_54>='\u0000' && LA14_54<='k')||(LA14_54>='m' && LA14_54<='\uFFFF')) ) {s = 25;}

                        if ( s>=0 ) return s;
                        break;
                    case 25 : 
                        int LA14_75 = input.LA(1);

                        s = -1;
                        if ( (LA14_75=='s') ) {s = 91;}

                        else if ( ((LA14_75>='\u0000' && LA14_75<='r')||(LA14_75>='t' && LA14_75<='\uFFFF')) ) {s = 25;}

                        if ( s>=0 ) return s;
                        break;
                    case 26 : 
                        int LA14_91 = input.LA(1);

                        s = -1;
                        if ( (LA14_91=='e') ) {s = 106;}

                        else if ( ((LA14_91>='\u0000' && LA14_91<='d')||(LA14_91>='f' && LA14_91<='\uFFFF')) ) {s = 25;}

                        if ( s>=0 ) return s;
                        break;
                    case 27 : 
                        int LA14_106 = input.LA(1);

                        s = -1;
                        if ( (LA14_106=='\"') ) {s = 118;}

                        else if ( ((LA14_106>='\u0000' && LA14_106<='!')||(LA14_106>='#' && LA14_106<='\uFFFF')) ) {s = 25;}

                        if ( s>=0 ) return s;
                        break;
                    case 28 : 
                        int LA14_16 = input.LA(1);

                        s = -1;
                        if ( ((LA14_16>='\u0000' && LA14_16<='\uFFFF')) ) {s = 25;}

                        else s = 19;

                        if ( s>=0 ) return s;
                        break;
                    case 29 : 
                        int LA14_26 = input.LA(1);

                        s = -1;
                        if ( (LA14_26=='\"') ) {s = 55;}

                        else if ( ((LA14_26>='\u0000' && LA14_26<='!')||(LA14_26>='#' && LA14_26<='/')||(LA14_26>=':' && LA14_26<='\uFFFF')) ) {s = 25;}

                        else if ( ((LA14_26>='0' && LA14_26<='9')) ) {s = 26;}

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