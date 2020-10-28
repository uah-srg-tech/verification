package es.uah.aut.srg.micobs.svm.lang.svr.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalSVRLexer extends Lexer {
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

    public InternalSVRLexer() {;} 
    public InternalSVRLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalSVRLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "InternalSVR.g"; }

    // $ANTLR start "T__16"
    public final void mT__16() throws RecognitionException {
        try {
            int _type = T__16;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSVR.g:11:7: ( '<SVR' )
            // InternalSVR.g:11:9: '<SVR'
            {
            match("<SVR"); 


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
            // InternalSVR.g:12:7: ( 'name=' )
            // InternalSVR.g:12:9: 'name='
            {
            match("name="); 


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
            // InternalSVR.g:13:7: ( 'id=' )
            // InternalSVR.g:13:9: 'id='
            {
            match("id="); 


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
            // InternalSVR.g:14:7: ( 'issue=' )
            // InternalSVR.g:14:9: 'issue='
            {
            match("issue="); 


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
            // InternalSVR.g:15:7: ( 'revision=' )
            // InternalSVR.g:15:9: 'revision='
            {
            match("revision="); 


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
            // InternalSVR.g:16:7: ( 'date=' )
            // InternalSVR.g:16:9: 'date='
            {
            match("date="); 


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
            // InternalSVR.g:17:7: ( '>' )
            // InternalSVR.g:17:9: '>'
            {
            match('>'); 

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
            // InternalSVR.g:18:7: ( '<svsParent' )
            // InternalSVR.g:18:9: '<svsParent'
            {
            match("<svsParent"); 


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
            // InternalSVR.g:19:7: ( '/>' )
            // InternalSVR.g:19:9: '/>'
            {
            match("/>"); 


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
            // InternalSVR.g:20:7: ( '<tcrParent' )
            // InternalSVR.g:20:9: '<tcrParent'
            {
            match("<tcrParent"); 


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
            // InternalSVR.g:21:7: ( '</SVR>' )
            // InternalSVR.g:21:9: '</SVR>'
            {
            match("</SVR>"); 


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
            // InternalSVR.g:22:7: ( '<TBCsTBDs>' )
            // InternalSVR.g:22:9: '<TBCsTBDs>'
            {
            match("<TBCsTBDs>"); 


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
            // InternalSVR.g:23:7: ( '</TBCsTBDs>' )
            // InternalSVR.g:23:9: '</TBCsTBDs>'
            {
            match("</TBCsTBDs>"); 


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
            // InternalSVR.g:24:7: ( '<TBC' )
            // InternalSVR.g:24:9: '<TBC'
            {
            match("<TBC"); 


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
            // InternalSVR.g:25:7: ( 'description=' )
            // InternalSVR.g:25:9: 'description='
            {
            match("description="); 


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
            // InternalSVR.g:26:7: ( 'parentTBC=' )
            // InternalSVR.g:26:9: 'parentTBC='
            {
            match("parentTBC="); 


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
            // InternalSVR.g:27:7: ( '<TBD' )
            // InternalSVR.g:27:9: '<TBD'
            {
            match("<TBD"); 


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
            // InternalSVR.g:28:7: ( 'parentTBD=' )
            // InternalSVR.g:28:9: 'parentTBD='
            {
            match("parentTBD="); 


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
            // InternalSVR.g:29:7: ( '<body>' )
            // InternalSVR.g:29:9: '<body>'
            {
            match("<body>"); 


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
            // InternalSVR.g:30:7: ( '</body>' )
            // InternalSVR.g:30:9: '</body>'
            {
            match("</body>"); 


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
            // InternalSVR.g:31:7: ( '<paragraph' )
            // InternalSVR.g:31:9: '<paragraph'
            {
            match("<paragraph"); 


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
            // InternalSVR.g:32:7: ( 'alignment=' )
            // InternalSVR.g:32:9: 'alignment='
            {
            match("alignment="); 


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
            // InternalSVR.g:33:7: ( 'style=' )
            // InternalSVR.g:33:9: 'style='
            {
            match("style="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__38"

    // $ANTLR start "T__39"
    public final void mT__39() throws RecognitionException {
        try {
            int _type = T__39;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSVR.g:34:7: ( 'indent=' )
            // InternalSVR.g:34:9: 'indent='
            {
            match("indent="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__39"

    // $ANTLR start "T__40"
    public final void mT__40() throws RecognitionException {
        try {
            int _type = T__40;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSVR.g:35:7: ( '</paragraph>' )
            // InternalSVR.g:35:9: '</paragraph>'
            {
            match("</paragraph>"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__40"

    // $ANTLR start "T__41"
    public final void mT__41() throws RecognitionException {
        try {
            int _type = T__41;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSVR.g:36:7: ( '<listItem>' )
            // InternalSVR.g:36:9: '<listItem>'
            {
            match("<listItem>"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__41"

    // $ANTLR start "T__42"
    public final void mT__42() throws RecognitionException {
        try {
            int _type = T__42;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSVR.g:37:7: ( '<sublist>' )
            // InternalSVR.g:37:9: '<sublist>'
            {
            match("<sublist>"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__42"

    // $ANTLR start "T__43"
    public final void mT__43() throws RecognitionException {
        try {
            int _type = T__43;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSVR.g:38:7: ( '</sublist>' )
            // InternalSVR.g:38:9: '</sublist>'
            {
            match("</sublist>"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__43"

    // $ANTLR start "T__44"
    public final void mT__44() throws RecognitionException {
        try {
            int _type = T__44;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSVR.g:39:7: ( '</listItem>' )
            // InternalSVR.g:39:9: '</listItem>'
            {
            match("</listItem>"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__44"

    // $ANTLR start "T__45"
    public final void mT__45() throws RecognitionException {
        try {
            int _type = T__45;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSVR.g:40:7: ( '<itemize' )
            // InternalSVR.g:40:9: '<itemize'
            {
            match("<itemize"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__45"

    // $ANTLR start "T__46"
    public final void mT__46() throws RecognitionException {
        try {
            int _type = T__46;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSVR.g:41:7: ( '</itemize>' )
            // InternalSVR.g:41:9: '</itemize>'
            {
            match("</itemize>"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__46"

    // $ANTLR start "T__47"
    public final void mT__47() throws RecognitionException {
        try {
            int _type = T__47;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSVR.g:42:7: ( '<enumerate' )
            // InternalSVR.g:42:9: '<enumerate'
            {
            match("<enumerate"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__47"

    // $ANTLR start "T__48"
    public final void mT__48() throws RecognitionException {
        try {
            int _type = T__48;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSVR.g:43:7: ( '</enumerate>' )
            // InternalSVR.g:43:9: '</enumerate>'
            {
            match("</enumerate>"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__48"

    // $ANTLR start "T__49"
    public final void mT__49() throws RecognitionException {
        try {
            int _type = T__49;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSVR.g:44:7: ( '<run' )
            // InternalSVR.g:44:9: '<run'
            {
            match("<run"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__49"

    // $ANTLR start "T__50"
    public final void mT__50() throws RecognitionException {
        try {
            int _type = T__50;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSVR.g:45:7: ( 'bold=' )
            // InternalSVR.g:45:9: 'bold='
            {
            match("bold="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__50"

    // $ANTLR start "T__51"
    public final void mT__51() throws RecognitionException {
        try {
            int _type = T__51;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSVR.g:46:7: ( 'italics=' )
            // InternalSVR.g:46:9: 'italics='
            {
            match("italics="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__51"

    // $ANTLR start "T__52"
    public final void mT__52() throws RecognitionException {
        try {
            int _type = T__52;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSVR.g:47:7: ( 'underline=' )
            // InternalSVR.g:47:9: 'underline='
            {
            match("underline="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__52"

    // $ANTLR start "T__53"
    public final void mT__53() throws RecognitionException {
        try {
            int _type = T__53;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSVR.g:48:7: ( 'color=' )
            // InternalSVR.g:48:9: 'color='
            {
            match("color="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__53"

    // $ANTLR start "T__54"
    public final void mT__54() throws RecognitionException {
        try {
            int _type = T__54;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSVR.g:49:7: ( '</run>' )
            // InternalSVR.g:49:9: '</run>'
            {
            match("</run>"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__54"

    // $ANTLR start "T__55"
    public final void mT__55() throws RecognitionException {
        try {
            int _type = T__55;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSVR.g:50:7: ( '<hyperlink' )
            // InternalSVR.g:50:9: '<hyperlink'
            {
            match("<hyperlink"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__55"

    // $ANTLR start "T__56"
    public final void mT__56() throws RecognitionException {
        try {
            int _type = T__56;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSVR.g:51:7: ( 'reference=' )
            // InternalSVR.g:51:9: 'reference='
            {
            match("reference="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__56"

    // $ANTLR start "T__57"
    public final void mT__57() throws RecognitionException {
        try {
            int _type = T__57;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSVR.g:52:7: ( '</hyperlink>' )
            // InternalSVR.g:52:9: '</hyperlink>'
            {
            match("</hyperlink>"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__57"

    // $ANTLR start "T__58"
    public final void mT__58() throws RecognitionException {
        try {
            int _type = T__58;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSVR.g:53:7: ( '<tab/>' )
            // InternalSVR.g:53:9: '<tab/>'
            {
            match("<tab/>"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__58"

    // $ANTLR start "T__59"
    public final void mT__59() throws RecognitionException {
        try {
            int _type = T__59;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSVR.g:54:7: ( '<figureFromFile' )
            // InternalSVR.g:54:9: '<figureFromFile'
            {
            match("<figureFromFile"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__59"

    // $ANTLR start "T__60"
    public final void mT__60() throws RecognitionException {
        try {
            int _type = T__60;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSVR.g:55:7: ( 'referenceFile=' )
            // InternalSVR.g:55:9: 'referenceFile='
            {
            match("referenceFile="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__60"

    // $ANTLR start "T__61"
    public final void mT__61() throws RecognitionException {
        try {
            int _type = T__61;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSVR.g:56:7: ( 'width=' )
            // InternalSVR.g:56:9: 'width='
            {
            match("width="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__61"

    // $ANTLR start "T__62"
    public final void mT__62() throws RecognitionException {
        try {
            int _type = T__62;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSVR.g:57:7: ( 'height=' )
            // InternalSVR.g:57:9: 'height='
            {
            match("height="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__62"

    // $ANTLR start "T__63"
    public final void mT__63() throws RecognitionException {
        try {
            int _type = T__63;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSVR.g:58:7: ( 'caption=' )
            // InternalSVR.g:58:9: 'caption='
            {
            match("caption="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__63"

    // $ANTLR start "T__64"
    public final void mT__64() throws RecognitionException {
        try {
            int _type = T__64;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSVR.g:59:7: ( '<tableFromFile' )
            // InternalSVR.g:59:9: '<tableFromFile'
            {
            match("<tableFromFile"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__64"

    // $ANTLR start "T__65"
    public final void mT__65() throws RecognitionException {
        try {
            int _type = T__65;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSVR.g:60:7: ( '<basicTable' )
            // InternalSVR.g:60:9: '<basicTable'
            {
            match("<basicTable"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__65"

    // $ANTLR start "T__66"
    public final void mT__66() throws RecognitionException {
        try {
            int _type = T__66;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSVR.g:61:7: ( '</basicTable>' )
            // InternalSVR.g:61:9: '</basicTable>'
            {
            match("</basicTable>"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__66"

    // $ANTLR start "T__67"
    public final void mT__67() throws RecognitionException {
        try {
            int _type = T__67;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSVR.g:62:7: ( '<row>' )
            // InternalSVR.g:62:9: '<row>'
            {
            match("<row>"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__67"

    // $ANTLR start "T__68"
    public final void mT__68() throws RecognitionException {
        try {
            int _type = T__68;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSVR.g:63:7: ( '</row>' )
            // InternalSVR.g:63:9: '</row>'
            {
            match("</row>"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__68"

    // $ANTLR start "T__69"
    public final void mT__69() throws RecognitionException {
        try {
            int _type = T__69;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSVR.g:64:7: ( '<cell' )
            // InternalSVR.g:64:9: '<cell'
            {
            match("<cell"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__69"

    // $ANTLR start "T__70"
    public final void mT__70() throws RecognitionException {
        try {
            int _type = T__70;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSVR.g:65:7: ( 'colSpan=' )
            // InternalSVR.g:65:9: 'colSpan='
            {
            match("colSpan="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__70"

    // $ANTLR start "T__71"
    public final void mT__71() throws RecognitionException {
        try {
            int _type = T__71;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSVR.g:66:7: ( 'rowSpan=' )
            // InternalSVR.g:66:9: 'rowSpan='
            {
            match("rowSpan="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__71"

    // $ANTLR start "T__72"
    public final void mT__72() throws RecognitionException {
        try {
            int _type = T__72;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSVR.g:67:7: ( 'shadow=' )
            // InternalSVR.g:67:9: 'shadow='
            {
            match("shadow="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__72"

    // $ANTLR start "T__73"
    public final void mT__73() throws RecognitionException {
        try {
            int _type = T__73;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSVR.g:68:7: ( '</cell>' )
            // InternalSVR.g:68:9: '</cell>'
            {
            match("</cell>"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__73"

    // $ANTLR start "T__74"
    public final void mT__74() throws RecognitionException {
        try {
            int _type = T__74;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSVR.g:69:7: ( '<ApplicableDocument' )
            // InternalSVR.g:69:9: '<ApplicableDocument'
            {
            match("<ApplicableDocument"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__74"

    // $ANTLR start "T__75"
    public final void mT__75() throws RecognitionException {
        try {
            int _type = T__75;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSVR.g:70:7: ( 'title=' )
            // InternalSVR.g:70:9: 'title='
            {
            match("title="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__75"

    // $ANTLR start "T__76"
    public final void mT__76() throws RecognitionException {
        try {
            int _type = T__76;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSVR.g:71:7: ( 'url=' )
            // InternalSVR.g:71:9: 'url='
            {
            match("url="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__76"

    // $ANTLR start "T__77"
    public final void mT__77() throws RecognitionException {
        try {
            int _type = T__77;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSVR.g:72:7: ( '<ReferenceDocument' )
            // InternalSVR.g:72:9: '<ReferenceDocument'
            {
            match("<ReferenceDocument"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__77"

    // $ANTLR start "T__78"
    public final void mT__78() throws RecognitionException {
        try {
            int _type = T__78;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSVR.g:73:7: ( '<subsection' )
            // InternalSVR.g:73:9: '<subsection'
            {
            match("<subsection"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__78"

    // $ANTLR start "T__79"
    public final void mT__79() throws RecognitionException {
        try {
            int _type = T__79;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSVR.g:74:7: ( '</subsection>' )
            // InternalSVR.g:74:9: '</subsection>'
            {
            match("</subsection>"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__79"

    // $ANTLR start "T__80"
    public final void mT__80() throws RecognitionException {
        try {
            int _type = T__80;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSVR.g:75:7: ( '<Introduction>' )
            // InternalSVR.g:75:9: '<Introduction>'
            {
            match("<Introduction>"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__80"

    // $ANTLR start "T__81"
    public final void mT__81() throws RecognitionException {
        try {
            int _type = T__81;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSVR.g:76:7: ( '</Introduction>' )
            // InternalSVR.g:76:9: '</Introduction>'
            {
            match("</Introduction>"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__81"

    // $ANTLR start "T__82"
    public final void mT__82() throws RecognitionException {
        try {
            int _type = T__82;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSVR.g:77:7: ( '<ApplicableDocuments>' )
            // InternalSVR.g:77:9: '<ApplicableDocuments>'
            {
            match("<ApplicableDocuments>"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__82"

    // $ANTLR start "T__83"
    public final void mT__83() throws RecognitionException {
        try {
            int _type = T__83;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSVR.g:78:7: ( '</ApplicableDocuments>' )
            // InternalSVR.g:78:9: '</ApplicableDocuments>'
            {
            match("</ApplicableDocuments>"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__83"

    // $ANTLR start "T__84"
    public final void mT__84() throws RecognitionException {
        try {
            int _type = T__84;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSVR.g:79:7: ( '<ReferenceDocuments>' )
            // InternalSVR.g:79:9: '<ReferenceDocuments>'
            {
            match("<ReferenceDocuments>"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__84"

    // $ANTLR start "T__85"
    public final void mT__85() throws RecognitionException {
        try {
            int _type = T__85;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSVR.g:80:7: ( '</ReferenceDocuments>' )
            // InternalSVR.g:80:9: '</ReferenceDocuments>'
            {
            match("</ReferenceDocuments>"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__85"

    // $ANTLR start "T__86"
    public final void mT__86() throws RecognitionException {
        try {
            int _type = T__86;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSVR.g:81:7: ( '<TermsDefinitionsAbbreviations>' )
            // InternalSVR.g:81:9: '<TermsDefinitionsAbbreviations>'
            {
            match("<TermsDefinitionsAbbreviations>"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__86"

    // $ANTLR start "T__87"
    public final void mT__87() throws RecognitionException {
        try {
            int _type = T__87;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSVR.g:82:7: ( '</TermsDefinitionsAbbreviations>' )
            // InternalSVR.g:82:9: '</TermsDefinitionsAbbreviations>'
            {
            match("</TermsDefinitionsAbbreviations>"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__87"

    // $ANTLR start "T__88"
    public final void mT__88() throws RecognitionException {
        try {
            int _type = T__88;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSVR.g:83:7: ( '<Term' )
            // InternalSVR.g:83:9: '<Term'
            {
            match("<Term"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__88"

    // $ANTLR start "T__89"
    public final void mT__89() throws RecognitionException {
        try {
            int _type = T__89;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSVR.g:84:7: ( '</Term>' )
            // InternalSVR.g:84:9: '</Term>'
            {
            match("</Term>"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__89"

    // $ANTLR start "T__90"
    public final void mT__90() throws RecognitionException {
        try {
            int _type = T__90;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSVR.g:85:7: ( '<Definition' )
            // InternalSVR.g:85:9: '<Definition'
            {
            match("<Definition"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__90"

    // $ANTLR start "T__91"
    public final void mT__91() throws RecognitionException {
        try {
            int _type = T__91;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSVR.g:86:7: ( '</Definition>' )
            // InternalSVR.g:86:9: '</Definition>'
            {
            match("</Definition>"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__91"

    // $ANTLR start "T__92"
    public final void mT__92() throws RecognitionException {
        try {
            int _type = T__92;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSVR.g:87:7: ( '<Abbreviation' )
            // InternalSVR.g:87:9: '<Abbreviation'
            {
            match("<Abbreviation"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__92"

    // $ANTLR start "T__93"
    public final void mT__93() throws RecognitionException {
        try {
            int _type = T__93;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSVR.g:88:7: ( '</Abbreviation>' )
            // InternalSVR.g:88:9: '</Abbreviation>'
            {
            match("</Abbreviation>"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__93"

    // $ANTLR start "T__94"
    public final void mT__94() throws RecognitionException {
        try {
            int _type = T__94;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSVR.g:89:7: ( '\"left\"' )
            // InternalSVR.g:89:9: '\"left\"'
            {
            match("\"left\""); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__94"

    // $ANTLR start "T__95"
    public final void mT__95() throws RecognitionException {
        try {
            int _type = T__95;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSVR.g:90:7: ( '\"center\"' )
            // InternalSVR.g:90:9: '\"center\"'
            {
            match("\"center\""); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__95"

    // $ANTLR start "T__96"
    public final void mT__96() throws RecognitionException {
        try {
            int _type = T__96;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSVR.g:91:7: ( '\"right\"' )
            // InternalSVR.g:91:9: '\"right\"'
            {
            match("\"right\""); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__96"

    // $ANTLR start "T__97"
    public final void mT__97() throws RecognitionException {
        try {
            int _type = T__97;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSVR.g:92:7: ( '\"justified\"' )
            // InternalSVR.g:92:9: '\"justified\"'
            {
            match("\"justified\""); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__97"

    // $ANTLR start "T__98"
    public final void mT__98() throws RecognitionException {
        try {
            int _type = T__98;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSVR.g:93:7: ( '\"true\"' )
            // InternalSVR.g:93:9: '\"true\"'
            {
            match("\"true\""); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__98"

    // $ANTLR start "T__99"
    public final void mT__99() throws RecognitionException {
        try {
            int _type = T__99;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSVR.g:94:7: ( '\"false\"' )
            // InternalSVR.g:94:9: '\"false\"'
            {
            match("\"false\""); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__99"

    // $ANTLR start "RULE_RUNTEXT"
    public final void mRULE_RUNTEXT() throws RecognitionException {
        try {
            int _type = RULE_RUNTEXT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSVR.g:3519:14: ( '<text>' ( options {greedy=false; } : . )* '</text>' )
            // InternalSVR.g:3519:16: '<text>' ( options {greedy=false; } : . )* '</text>'
            {
            match("<text>"); 

            // InternalSVR.g:3519:25: ( options {greedy=false; } : . )*
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
            	    // InternalSVR.g:3519:53: .
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

    // $ANTLR start "RULE_HEXADECIMAL"
    public final void mRULE_HEXADECIMAL() throws RecognitionException {
        try {
            int _type = RULE_HEXADECIMAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSVR.g:3521:18: ( '0x' ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' )+ )
            // InternalSVR.g:3521:20: '0x' ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' )+
            {
            match("0x"); 

            // InternalSVR.g:3521:25: ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' )+
            int cnt2=0;
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>='0' && LA2_0<='9')||(LA2_0>='A' && LA2_0<='F')||(LA2_0>='a' && LA2_0<='f')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalSVR.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='F')||(input.LA(1)>='a' && input.LA(1)<='f') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


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


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_HEXADECIMAL"

    // $ANTLR start "RULE_UINT_STRING"
    public final void mRULE_UINT_STRING() throws RecognitionException {
        try {
            int _type = RULE_UINT_STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSVR.g:3523:18: ( '\"' ( '0' .. '9' )+ '\"' )
            // InternalSVR.g:3523:20: '\"' ( '0' .. '9' )+ '\"'
            {
            match('\"'); 
            // InternalSVR.g:3523:24: ( '0' .. '9' )+
            int cnt3=0;
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>='0' && LA3_0<='9')) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalSVR.g:3523:25: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt3 >= 1 ) break loop3;
                        EarlyExitException eee =
                            new EarlyExitException(3, input);
                        throw eee;
                }
                cnt3++;
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

    // $ANTLR start "RULE_REAL_STRING"
    public final void mRULE_REAL_STRING() throws RecognitionException {
        try {
            int _type = RULE_REAL_STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSVR.g:3525:18: ( '\"' ( '0' .. '9' )+ ( '.' ( '0' .. '9' )+ )? '\"' )
            // InternalSVR.g:3525:20: '\"' ( '0' .. '9' )+ ( '.' ( '0' .. '9' )+ )? '\"'
            {
            match('\"'); 
            // InternalSVR.g:3525:24: ( '0' .. '9' )+
            int cnt4=0;
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>='0' && LA4_0<='9')) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalSVR.g:3525:25: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt4 >= 1 ) break loop4;
                        EarlyExitException eee =
                            new EarlyExitException(4, input);
                        throw eee;
                }
                cnt4++;
            } while (true);

            // InternalSVR.g:3525:36: ( '.' ( '0' .. '9' )+ )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0=='.') ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalSVR.g:3525:37: '.' ( '0' .. '9' )+
                    {
                    match('.'); 
                    // InternalSVR.g:3525:41: ( '0' .. '9' )+
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
                    	    // InternalSVR.g:3525:42: '0' .. '9'
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
                    break;

            }

            match('\"'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_REAL_STRING"

    // $ANTLR start "RULE_HEX_STRING"
    public final void mRULE_HEX_STRING() throws RecognitionException {
        try {
            int _type = RULE_HEX_STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSVR.g:3527:17: ( '\"0x' ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' )+ '\"' )
            // InternalSVR.g:3527:19: '\"0x' ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' )+ '\"'
            {
            match("\"0x"); 

            // InternalSVR.g:3527:25: ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' )+
            int cnt7=0;
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( ((LA7_0>='0' && LA7_0<='9')||(LA7_0>='A' && LA7_0<='F')||(LA7_0>='a' && LA7_0<='f')) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalSVR.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='F')||(input.LA(1)>='a' && input.LA(1)<='f') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt7 >= 1 ) break loop7;
                        EarlyExitException eee =
                            new EarlyExitException(7, input);
                        throw eee;
                }
                cnt7++;
            } while (true);

            match('\"'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_HEX_STRING"

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSVR.g:3529:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // InternalSVR.g:3529:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // InternalSVR.g:3529:11: ( '^' )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0=='^') ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalSVR.g:3529:11: '^'
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

            // InternalSVR.g:3529:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( ((LA9_0>='0' && LA9_0<='9')||(LA9_0>='A' && LA9_0<='Z')||LA9_0=='_'||(LA9_0>='a' && LA9_0<='z')) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalSVR.g:
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
            	    break loop9;
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
            // InternalSVR.g:3531:10: ( ( '0' .. '9' )+ )
            // InternalSVR.g:3531:12: ( '0' .. '9' )+
            {
            // InternalSVR.g:3531:12: ( '0' .. '9' )+
            int cnt10=0;
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( ((LA10_0>='0' && LA10_0<='9')) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalSVR.g:3531:13: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt10 >= 1 ) break loop10;
                        EarlyExitException eee =
                            new EarlyExitException(10, input);
                        throw eee;
                }
                cnt10++;
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
            // InternalSVR.g:3533:13: ( ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // InternalSVR.g:3533:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // InternalSVR.g:3533:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0=='\"') ) {
                alt13=1;
            }
            else if ( (LA13_0=='\'') ) {
                alt13=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // InternalSVR.g:3533:16: '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // InternalSVR.g:3533:20: ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop11:
                    do {
                        int alt11=3;
                        int LA11_0 = input.LA(1);

                        if ( (LA11_0=='\\') ) {
                            alt11=1;
                        }
                        else if ( ((LA11_0>='\u0000' && LA11_0<='!')||(LA11_0>='#' && LA11_0<='[')||(LA11_0>=']' && LA11_0<='\uFFFF')) ) {
                            alt11=2;
                        }


                        switch (alt11) {
                    	case 1 :
                    	    // InternalSVR.g:3533:21: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalSVR.g:3533:28: ~ ( ( '\\\\' | '\"' ) )
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
                    	    break loop11;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // InternalSVR.g:3533:48: '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // InternalSVR.g:3533:53: ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop12:
                    do {
                        int alt12=3;
                        int LA12_0 = input.LA(1);

                        if ( (LA12_0=='\\') ) {
                            alt12=1;
                        }
                        else if ( ((LA12_0>='\u0000' && LA12_0<='&')||(LA12_0>='(' && LA12_0<='[')||(LA12_0>=']' && LA12_0<='\uFFFF')) ) {
                            alt12=2;
                        }


                        switch (alt12) {
                    	case 1 :
                    	    // InternalSVR.g:3533:54: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalSVR.g:3533:61: ~ ( ( '\\\\' | '\\'' ) )
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
                    	    break loop12;
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
            // InternalSVR.g:3535:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // InternalSVR.g:3535:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // InternalSVR.g:3535:24: ( options {greedy=false; } : . )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0=='*') ) {
                    int LA14_1 = input.LA(2);

                    if ( (LA14_1=='/') ) {
                        alt14=2;
                    }
                    else if ( ((LA14_1>='\u0000' && LA14_1<='.')||(LA14_1>='0' && LA14_1<='\uFFFF')) ) {
                        alt14=1;
                    }


                }
                else if ( ((LA14_0>='\u0000' && LA14_0<=')')||(LA14_0>='+' && LA14_0<='\uFFFF')) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalSVR.g:3535:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop14;
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
            // InternalSVR.g:3537:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // InternalSVR.g:3537:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // InternalSVR.g:3537:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( ((LA15_0>='\u0000' && LA15_0<='\t')||(LA15_0>='\u000B' && LA15_0<='\f')||(LA15_0>='\u000E' && LA15_0<='\uFFFF')) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalSVR.g:3537:24: ~ ( ( '\\n' | '\\r' ) )
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
            	    break loop15;
                }
            } while (true);

            // InternalSVR.g:3537:40: ( ( '\\r' )? '\\n' )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0=='\n'||LA17_0=='\r') ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalSVR.g:3537:41: ( '\\r' )? '\\n'
                    {
                    // InternalSVR.g:3537:41: ( '\\r' )?
                    int alt16=2;
                    int LA16_0 = input.LA(1);

                    if ( (LA16_0=='\r') ) {
                        alt16=1;
                    }
                    switch (alt16) {
                        case 1 :
                            // InternalSVR.g:3537:41: '\\r'
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
            // InternalSVR.g:3539:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // InternalSVR.g:3539:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // InternalSVR.g:3539:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt18=0;
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( ((LA18_0>='\t' && LA18_0<='\n')||LA18_0=='\r'||LA18_0==' ') ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalSVR.g:
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
            	    if ( cnt18 >= 1 ) break loop18;
                        EarlyExitException eee =
                            new EarlyExitException(18, input);
                        throw eee;
                }
                cnt18++;
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
            // InternalSVR.g:3541:16: ( . )
            // InternalSVR.g:3541:18: .
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
        // InternalSVR.g:1:8: ( T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | T__63 | T__64 | T__65 | T__66 | T__67 | T__68 | T__69 | T__70 | T__71 | T__72 | T__73 | T__74 | T__75 | T__76 | T__77 | T__78 | T__79 | T__80 | T__81 | T__82 | T__83 | T__84 | T__85 | T__86 | T__87 | T__88 | T__89 | T__90 | T__91 | T__92 | T__93 | T__94 | T__95 | T__96 | T__97 | T__98 | T__99 | RULE_RUNTEXT | RULE_HEXADECIMAL | RULE_UINT_STRING | RULE_REAL_STRING | RULE_HEX_STRING | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt19=96;
        alt19 = dfa19.predict(input);
        switch (alt19) {
            case 1 :
                // InternalSVR.g:1:10: T__16
                {
                mT__16(); 

                }
                break;
            case 2 :
                // InternalSVR.g:1:16: T__17
                {
                mT__17(); 

                }
                break;
            case 3 :
                // InternalSVR.g:1:22: T__18
                {
                mT__18(); 

                }
                break;
            case 4 :
                // InternalSVR.g:1:28: T__19
                {
                mT__19(); 

                }
                break;
            case 5 :
                // InternalSVR.g:1:34: T__20
                {
                mT__20(); 

                }
                break;
            case 6 :
                // InternalSVR.g:1:40: T__21
                {
                mT__21(); 

                }
                break;
            case 7 :
                // InternalSVR.g:1:46: T__22
                {
                mT__22(); 

                }
                break;
            case 8 :
                // InternalSVR.g:1:52: T__23
                {
                mT__23(); 

                }
                break;
            case 9 :
                // InternalSVR.g:1:58: T__24
                {
                mT__24(); 

                }
                break;
            case 10 :
                // InternalSVR.g:1:64: T__25
                {
                mT__25(); 

                }
                break;
            case 11 :
                // InternalSVR.g:1:70: T__26
                {
                mT__26(); 

                }
                break;
            case 12 :
                // InternalSVR.g:1:76: T__27
                {
                mT__27(); 

                }
                break;
            case 13 :
                // InternalSVR.g:1:82: T__28
                {
                mT__28(); 

                }
                break;
            case 14 :
                // InternalSVR.g:1:88: T__29
                {
                mT__29(); 

                }
                break;
            case 15 :
                // InternalSVR.g:1:94: T__30
                {
                mT__30(); 

                }
                break;
            case 16 :
                // InternalSVR.g:1:100: T__31
                {
                mT__31(); 

                }
                break;
            case 17 :
                // InternalSVR.g:1:106: T__32
                {
                mT__32(); 

                }
                break;
            case 18 :
                // InternalSVR.g:1:112: T__33
                {
                mT__33(); 

                }
                break;
            case 19 :
                // InternalSVR.g:1:118: T__34
                {
                mT__34(); 

                }
                break;
            case 20 :
                // InternalSVR.g:1:124: T__35
                {
                mT__35(); 

                }
                break;
            case 21 :
                // InternalSVR.g:1:130: T__36
                {
                mT__36(); 

                }
                break;
            case 22 :
                // InternalSVR.g:1:136: T__37
                {
                mT__37(); 

                }
                break;
            case 23 :
                // InternalSVR.g:1:142: T__38
                {
                mT__38(); 

                }
                break;
            case 24 :
                // InternalSVR.g:1:148: T__39
                {
                mT__39(); 

                }
                break;
            case 25 :
                // InternalSVR.g:1:154: T__40
                {
                mT__40(); 

                }
                break;
            case 26 :
                // InternalSVR.g:1:160: T__41
                {
                mT__41(); 

                }
                break;
            case 27 :
                // InternalSVR.g:1:166: T__42
                {
                mT__42(); 

                }
                break;
            case 28 :
                // InternalSVR.g:1:172: T__43
                {
                mT__43(); 

                }
                break;
            case 29 :
                // InternalSVR.g:1:178: T__44
                {
                mT__44(); 

                }
                break;
            case 30 :
                // InternalSVR.g:1:184: T__45
                {
                mT__45(); 

                }
                break;
            case 31 :
                // InternalSVR.g:1:190: T__46
                {
                mT__46(); 

                }
                break;
            case 32 :
                // InternalSVR.g:1:196: T__47
                {
                mT__47(); 

                }
                break;
            case 33 :
                // InternalSVR.g:1:202: T__48
                {
                mT__48(); 

                }
                break;
            case 34 :
                // InternalSVR.g:1:208: T__49
                {
                mT__49(); 

                }
                break;
            case 35 :
                // InternalSVR.g:1:214: T__50
                {
                mT__50(); 

                }
                break;
            case 36 :
                // InternalSVR.g:1:220: T__51
                {
                mT__51(); 

                }
                break;
            case 37 :
                // InternalSVR.g:1:226: T__52
                {
                mT__52(); 

                }
                break;
            case 38 :
                // InternalSVR.g:1:232: T__53
                {
                mT__53(); 

                }
                break;
            case 39 :
                // InternalSVR.g:1:238: T__54
                {
                mT__54(); 

                }
                break;
            case 40 :
                // InternalSVR.g:1:244: T__55
                {
                mT__55(); 

                }
                break;
            case 41 :
                // InternalSVR.g:1:250: T__56
                {
                mT__56(); 

                }
                break;
            case 42 :
                // InternalSVR.g:1:256: T__57
                {
                mT__57(); 

                }
                break;
            case 43 :
                // InternalSVR.g:1:262: T__58
                {
                mT__58(); 

                }
                break;
            case 44 :
                // InternalSVR.g:1:268: T__59
                {
                mT__59(); 

                }
                break;
            case 45 :
                // InternalSVR.g:1:274: T__60
                {
                mT__60(); 

                }
                break;
            case 46 :
                // InternalSVR.g:1:280: T__61
                {
                mT__61(); 

                }
                break;
            case 47 :
                // InternalSVR.g:1:286: T__62
                {
                mT__62(); 

                }
                break;
            case 48 :
                // InternalSVR.g:1:292: T__63
                {
                mT__63(); 

                }
                break;
            case 49 :
                // InternalSVR.g:1:298: T__64
                {
                mT__64(); 

                }
                break;
            case 50 :
                // InternalSVR.g:1:304: T__65
                {
                mT__65(); 

                }
                break;
            case 51 :
                // InternalSVR.g:1:310: T__66
                {
                mT__66(); 

                }
                break;
            case 52 :
                // InternalSVR.g:1:316: T__67
                {
                mT__67(); 

                }
                break;
            case 53 :
                // InternalSVR.g:1:322: T__68
                {
                mT__68(); 

                }
                break;
            case 54 :
                // InternalSVR.g:1:328: T__69
                {
                mT__69(); 

                }
                break;
            case 55 :
                // InternalSVR.g:1:334: T__70
                {
                mT__70(); 

                }
                break;
            case 56 :
                // InternalSVR.g:1:340: T__71
                {
                mT__71(); 

                }
                break;
            case 57 :
                // InternalSVR.g:1:346: T__72
                {
                mT__72(); 

                }
                break;
            case 58 :
                // InternalSVR.g:1:352: T__73
                {
                mT__73(); 

                }
                break;
            case 59 :
                // InternalSVR.g:1:358: T__74
                {
                mT__74(); 

                }
                break;
            case 60 :
                // InternalSVR.g:1:364: T__75
                {
                mT__75(); 

                }
                break;
            case 61 :
                // InternalSVR.g:1:370: T__76
                {
                mT__76(); 

                }
                break;
            case 62 :
                // InternalSVR.g:1:376: T__77
                {
                mT__77(); 

                }
                break;
            case 63 :
                // InternalSVR.g:1:382: T__78
                {
                mT__78(); 

                }
                break;
            case 64 :
                // InternalSVR.g:1:388: T__79
                {
                mT__79(); 

                }
                break;
            case 65 :
                // InternalSVR.g:1:394: T__80
                {
                mT__80(); 

                }
                break;
            case 66 :
                // InternalSVR.g:1:400: T__81
                {
                mT__81(); 

                }
                break;
            case 67 :
                // InternalSVR.g:1:406: T__82
                {
                mT__82(); 

                }
                break;
            case 68 :
                // InternalSVR.g:1:412: T__83
                {
                mT__83(); 

                }
                break;
            case 69 :
                // InternalSVR.g:1:418: T__84
                {
                mT__84(); 

                }
                break;
            case 70 :
                // InternalSVR.g:1:424: T__85
                {
                mT__85(); 

                }
                break;
            case 71 :
                // InternalSVR.g:1:430: T__86
                {
                mT__86(); 

                }
                break;
            case 72 :
                // InternalSVR.g:1:436: T__87
                {
                mT__87(); 

                }
                break;
            case 73 :
                // InternalSVR.g:1:442: T__88
                {
                mT__88(); 

                }
                break;
            case 74 :
                // InternalSVR.g:1:448: T__89
                {
                mT__89(); 

                }
                break;
            case 75 :
                // InternalSVR.g:1:454: T__90
                {
                mT__90(); 

                }
                break;
            case 76 :
                // InternalSVR.g:1:460: T__91
                {
                mT__91(); 

                }
                break;
            case 77 :
                // InternalSVR.g:1:466: T__92
                {
                mT__92(); 

                }
                break;
            case 78 :
                // InternalSVR.g:1:472: T__93
                {
                mT__93(); 

                }
                break;
            case 79 :
                // InternalSVR.g:1:478: T__94
                {
                mT__94(); 

                }
                break;
            case 80 :
                // InternalSVR.g:1:484: T__95
                {
                mT__95(); 

                }
                break;
            case 81 :
                // InternalSVR.g:1:490: T__96
                {
                mT__96(); 

                }
                break;
            case 82 :
                // InternalSVR.g:1:496: T__97
                {
                mT__97(); 

                }
                break;
            case 83 :
                // InternalSVR.g:1:502: T__98
                {
                mT__98(); 

                }
                break;
            case 84 :
                // InternalSVR.g:1:508: T__99
                {
                mT__99(); 

                }
                break;
            case 85 :
                // InternalSVR.g:1:514: RULE_RUNTEXT
                {
                mRULE_RUNTEXT(); 

                }
                break;
            case 86 :
                // InternalSVR.g:1:527: RULE_HEXADECIMAL
                {
                mRULE_HEXADECIMAL(); 

                }
                break;
            case 87 :
                // InternalSVR.g:1:544: RULE_UINT_STRING
                {
                mRULE_UINT_STRING(); 

                }
                break;
            case 88 :
                // InternalSVR.g:1:561: RULE_REAL_STRING
                {
                mRULE_REAL_STRING(); 

                }
                break;
            case 89 :
                // InternalSVR.g:1:578: RULE_HEX_STRING
                {
                mRULE_HEX_STRING(); 

                }
                break;
            case 90 :
                // InternalSVR.g:1:594: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 91 :
                // InternalSVR.g:1:602: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 92 :
                // InternalSVR.g:1:611: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 93 :
                // InternalSVR.g:1:623: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 94 :
                // InternalSVR.g:1:639: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 95 :
                // InternalSVR.g:1:655: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 96 :
                // InternalSVR.g:1:663: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA19 dfa19 = new DFA19(this);
    static final String DFA19_eotS =
        "\1\uffff\1\30\4\54\1\uffff\1\30\11\54\1\30\1\117\1\30\2\uffff\1\30\24\uffff\1\54\1\uffff\10\54\4\uffff\14\54\51\uffff\1\54\1\uffff\24\54\24\uffff\1\u00c3\4\uffff\17\54\1\uffff\6\54\21\uffff\1\u00e8\3\uffff\6\54\1\uffff\5\54\1\uffff\7\54\20\uffff\10\54\1\uffff\2\54\1\uffff\2\54\1\uffff\1\54\16\uffff\7\54\1\uffff\3\54\12\uffff\2\54\1\uffff\4\54\11\uffff\6\54\5\uffff\2\54\7\uffff\2\54\3\uffff\1\54\4\uffff\1\54\12\uffff\1\u015b\1\u015d\4\uffff";
    static final String DFA19_eofS =
        "\u015e\uffff";
    static final String DFA19_minS =
        "\1\0\1\57\1\141\1\144\1\145\1\141\1\uffff\1\52\1\141\1\154\1\150\1\157\1\156\1\141\1\151\1\145\1\151\1\0\1\170\1\101\2\uffff\1\0\3\uffff\1\165\1\141\1\101\1\102\1\141\4\uffff\1\157\3\uffff\1\142\1\145\2\uffff\1\155\1\uffff\1\75\1\163\1\144\1\141\1\146\1\167\1\164\1\163\4\uffff\1\162\1\151\1\171\1\141\1\154\1\144\2\154\1\160\1\144\1\151\1\164\10\0\5\uffff\1\142\1\uffff\1\142\2\uffff\1\102\1\141\1\uffff\1\165\3\uffff\1\157\3\uffff\1\142\2\uffff\1\103\1\162\4\uffff\1\160\1\uffff\1\146\1\145\1\uffff\1\165\1\145\1\154\1\151\1\145\1\123\1\145\1\143\1\145\1\147\1\154\2\144\1\145\1\75\1\123\2\164\1\147\1\154\10\0\1\uffff\1\154\1\57\1\uffff\1\162\2\uffff\1\142\4\uffff\1\163\1\uffff\1\155\1\154\1\145\1\75\1\145\1\156\1\151\1\163\1\162\1\160\1\75\1\162\2\156\1\145\1\157\1\75\1\162\1\uffff\1\162\1\160\1\151\2\150\1\145\10\0\5\uffff\1\155\1\154\2\uffff\1\163\1\151\1\162\1\uffff\1\75\1\164\1\143\1\151\1\145\1\141\1\uffff\1\151\1\164\1\155\1\75\1\167\1\uffff\1\154\1\75\1\141\1\157\1\75\1\164\1\75\6\0\2\uffff\1\76\4\uffff\1\143\1\145\1\uffff\1\75\1\163\1\157\2\156\1\160\1\124\1\145\1\uffff\1\75\1\151\1\uffff\2\156\1\uffff\1\75\2\uffff\3\0\1\uffff\1\0\4\uffff\1\141\1\156\1\uffff\1\75\1\156\1\143\1\75\1\164\1\102\1\156\1\uffff\1\156\2\75\2\uffff\1\0\1\uffff\1\0\2\uffff\1\142\1\143\1\uffff\1\75\1\145\1\uffff\1\151\1\103\1\164\1\145\4\uffff\1\0\1\uffff\1\154\1\145\1\uffff\1\75\1\157\4\75\1\uffff\1\0\1\145\1\104\1\uffff\1\151\1\156\4\uffff\1\0\1\104\1\157\1\154\1\75\1\uffff\1\157\1\143\1\145\2\uffff\1\143\1\165\1\75\1\165\1\155\1\uffff\1\155\2\145\2\156\2\164\2\163\4\uffff";
    static final String DFA19_maxS =
        "\1\uffff\1\164\1\141\1\164\1\157\1\145\1\uffff\1\76\1\141\1\154\1\164\1\157\1\162\1\157\1\151\1\145\1\151\1\uffff\1\170\1\172\2\uffff\1\uffff\3\uffff\1\166\1\145\1\163\1\145\1\157\4\uffff\1\165\3\uffff\1\160\1\145\2\uffff\1\155\1\uffff\1\75\1\163\1\144\1\141\1\166\1\167\1\164\1\163\4\uffff\1\162\1\151\1\171\1\141\1\154\1\144\2\154\1\160\1\144\1\151\1\164\10\uffff\5\uffff\1\142\1\uffff\1\142\2\uffff\1\145\1\157\1\uffff\1\165\3\uffff\1\165\3\uffff\1\160\2\uffff\1\104\1\162\4\uffff\1\160\1\uffff\1\146\1\145\1\uffff\1\165\1\145\1\154\1\151\1\145\1\123\1\145\1\143\1\145\1\147\1\154\2\144\1\145\1\75\1\157\2\164\1\147\1\154\10\uffff\1\uffff\1\163\1\154\1\uffff\1\162\2\uffff\1\142\4\uffff\1\163\1\uffff\1\155\1\154\1\145\1\75\1\145\1\156\1\151\1\163\1\162\1\160\1\75\1\162\2\156\1\145\1\157\1\75\1\162\1\uffff\1\162\1\160\1\151\2\150\1\145\10\uffff\5\uffff\1\155\1\163\2\uffff\1\163\1\151\1\162\1\uffff\1\75\1\164\1\143\1\151\1\145\1\141\1\uffff\1\151\1\164\1\155\1\75\1\167\1\uffff\1\154\1\75\1\141\1\157\1\75\1\164\1\75\6\uffff\2\uffff\1\163\4\uffff\1\143\1\145\1\uffff\1\75\1\163\1\157\2\156\1\160\1\124\1\145\1\uffff\1\75\1\151\1\uffff\2\156\1\uffff\1\75\2\uffff\3\uffff\1\uffff\1\uffff\4\uffff\1\141\1\156\1\uffff\1\75\1\156\1\143\1\75\1\164\1\102\1\156\1\uffff\1\156\2\75\2\uffff\1\uffff\1\uffff\1\uffff\2\uffff\1\142\1\143\1\uffff\1\75\1\145\1\uffff\1\151\1\104\1\164\1\145\4\uffff\1\uffff\1\uffff\1\154\1\145\1\uffff\1\106\1\157\4\75\1\uffff\1\uffff\1\145\1\104\1\uffff\1\151\1\156\4\uffff\1\uffff\1\104\1\157\1\154\1\75\1\uffff\1\157\1\143\1\145\2\uffff\1\143\1\165\1\75\1\165\1\155\1\uffff\1\155\2\145\2\156\2\164\2\163\4\uffff";
    static final String DFA19_acceptS =
        "\6\uffff\1\7\15\uffff\1\132\1\133\1\uffff\1\137\1\140\1\1\5\uffff\1\25\1\32\1\36\1\40\1\uffff\1\50\1\54\1\66\2\uffff\1\101\1\113\1\uffff\1\132\10\uffff\1\7\1\11\1\135\1\136\24\uffff\1\134\1\126\1\133\1\137\1\10\1\uffff\1\12\1\uffff\1\125\1\13\2\uffff\1\31\1\uffff\1\35\1\37\1\41\1\uffff\1\52\1\72\1\102\1\uffff\1\106\1\114\2\uffff\1\23\1\62\1\42\1\64\1\uffff\1\115\2\uffff\1\3\34\uffff\1\127\2\uffff\1\15\1\uffff\1\24\1\63\1\uffff\1\47\1\65\1\104\1\116\1\uffff\1\21\22\uffff\1\75\16\uffff\1\127\1\33\1\77\1\53\1\61\2\uffff\1\14\1\16\3\uffff\1\2\6\uffff\1\6\5\uffff\1\43\15\uffff\1\131\1\130\1\uffff\1\34\1\100\1\107\1\111\2\uffff\1\4\10\uffff\1\27\2\uffff\1\46\2\uffff\1\56\1\uffff\1\74\1\117\3\uffff\1\123\1\uffff\1\131\1\130\1\110\1\112\2\uffff\1\30\7\uffff\1\71\3\uffff\1\57\1\117\1\uffff\1\121\1\uffff\1\123\1\124\2\uffff\1\44\2\uffff\1\70\4\uffff\1\67\1\60\1\120\1\121\1\uffff\1\124\2\uffff\1\5\6\uffff\1\120\3\uffff\1\51\2\uffff\1\20\1\22\1\26\1\45\5\uffff\1\122\3\uffff\1\17\1\122\5\uffff\1\55\11\uffff\1\105\1\76\1\103\1\73";
    static final String DFA19_specialS =
        "\1\43\20\uffff\1\45\4\uffff\1\41\56\uffff\1\0\1\4\1\12\1\17\1\30\1\34\1\44\1\50\67\uffff\1\1\1\5\1\13\1\20\1\31\1\35\1\47\1\46\47\uffff\1\2\1\6\1\14\1\21\1\32\1\36\1\42\1\51\41\uffff\1\3\1\7\1\15\1\22\1\33\1\37\34\uffff\1\10\1\16\1\23\1\uffff\1\40\24\uffff\1\11\1\uffff\1\24\20\uffff\1\25\13\uffff\1\26\11\uffff\1\27\35\uffff}>";
    static final String[] DFA19_transitionS = {
            "\11\30\2\27\2\30\1\27\22\30\1\27\1\30\1\21\4\30\1\26\7\30\1\7\1\22\11\25\2\30\1\1\1\30\1\6\2\30\32\24\3\30\1\23\1\24\1\30\1\11\1\13\1\15\1\5\3\24\1\17\1\3\4\24\1\2\1\24\1\10\1\24\1\4\1\12\1\20\1\14\1\24\1\16\3\24\uff85\30",
            "\1\34\21\uffff\1\47\2\uffff\1\52\4\uffff\1\51\10\uffff\1\50\1\31\1\35\15\uffff\1\36\1\46\1\uffff\1\42\1\45\1\uffff\1\44\1\41\2\uffff\1\40\3\uffff\1\37\1\uffff\1\43\1\32\1\33",
            "\1\53",
            "\1\55\11\uffff\1\57\4\uffff\1\56\1\60",
            "\1\61\11\uffff\1\62",
            "\1\63\3\uffff\1\64",
            "",
            "\1\67\4\uffff\1\70\16\uffff\1\66",
            "\1\71",
            "\1\72",
            "\1\74\13\uffff\1\73",
            "\1\75",
            "\1\76\3\uffff\1\77",
            "\1\101\15\uffff\1\100",
            "\1\102",
            "\1\103",
            "\1\104",
            "\60\115\1\113\11\114\51\115\1\106\2\115\1\112\3\115\1\110\1\115\1\105\5\115\1\107\1\115\1\111\uff8b\115",
            "\1\116",
            "\32\54\4\uffff\1\54\1\uffff\32\54",
            "",
            "",
            "\0\115",
            "",
            "",
            "",
            "\1\122\1\121",
            "\1\124\1\uffff\1\123\1\uffff\1\125",
            "\1\142\2\uffff\1\144\4\uffff\1\141\10\uffff\1\143\1\126\1\127\15\uffff\1\130\1\140\1\uffff\1\135\2\uffff\1\137\1\134\2\uffff\1\133\3\uffff\1\131\1\uffff\1\136\1\132",
            "\1\145\42\uffff\1\146",
            "\1\150\15\uffff\1\147",
            "",
            "",
            "",
            "",
            "\1\152\5\uffff\1\151",
            "",
            "",
            "",
            "\1\154\15\uffff\1\153",
            "\1\155",
            "",
            "",
            "\1\156",
            "",
            "\1\157",
            "\1\160",
            "\1\161",
            "\1\162",
            "\1\164\17\uffff\1\163",
            "\1\165",
            "\1\166",
            "\1\167",
            "",
            "",
            "",
            "",
            "\1\170",
            "\1\171",
            "\1\172",
            "\1\173",
            "\1\174",
            "\1\175",
            "\1\176",
            "\1\177",
            "\1\u0080",
            "\1\u0081",
            "\1\u0082",
            "\1\u0083",
            "\145\115\1\u0084\uff9a\115",
            "\145\115\1\u0085\uff9a\115",
            "\151\115\1\u0086\uff96\115",
            "\165\115\1\u0087\uff8a\115",
            "\162\115\1\u0088\uff8d\115",
            "\141\115\1\u0089\uff9e\115",
            "\42\115\1\u008c\13\115\1\u008b\1\115\12\114\76\115\1\u008a\uff87\115",
            "\42\115\1\u008c\13\115\1\u008b\1\115\12\114\uffc6\115",
            "",
            "",
            "",
            "",
            "",
            "\1\u008d",
            "",
            "\1\u008e",
            "",
            "",
            "\1\u008f\42\uffff\1\u0090",
            "\1\u0092\15\uffff\1\u0091",
            "",
            "\1\u0093",
            "",
            "",
            "",
            "\1\u0095\5\uffff\1\u0094",
            "",
            "",
            "",
            "\1\u0097\15\uffff\1\u0096",
            "",
            "",
            "\1\u0098\1\u0099",
            "\1\u009a",
            "",
            "",
            "",
            "",
            "\1\u009b",
            "",
            "\1\u009c",
            "\1\u009d",
            "",
            "\1\u009e",
            "\1\u009f",
            "\1\u00a0",
            "\1\u00a1",
            "\1\u00a2",
            "\1\u00a3",
            "\1\u00a4",
            "\1\u00a5",
            "\1\u00a6",
            "\1\u00a7",
            "\1\u00a8",
            "\1\u00a9",
            "\1\u00aa",
            "\1\u00ab",
            "\1\u00ac",
            "\1\u00ae\33\uffff\1\u00ad",
            "\1\u00af",
            "\1\u00b0",
            "\1\u00b1",
            "\1\u00b2",
            "\146\115\1\u00b3\uff99\115",
            "\156\115\1\u00b4\uff91\115",
            "\147\115\1\u00b5\uff98\115",
            "\163\115\1\u00b6\uff8c\115",
            "\165\115\1\u00b7\uff8a\115",
            "\154\115\1\u00b8\uff93\115",
            "\60\115\12\u00b9\7\115\6\u00b9\32\115\6\u00b9\uff99\115",
            "\60\115\12\u00ba\uffc6\115",
            "",
            "\1\u00bc\6\uffff\1\u00bd",
            "\1\u00be\74\uffff\1\u00bf",
            "",
            "\1\u00c0",
            "",
            "",
            "\1\u00c1",
            "",
            "",
            "",
            "",
            "\1\u00c2",
            "",
            "\1\u00c4",
            "\1\u00c5",
            "\1\u00c6",
            "\1\u00c7",
            "\1\u00c8",
            "\1\u00c9",
            "\1\u00ca",
            "\1\u00cb",
            "\1\u00cc",
            "\1\u00cd",
            "\1\u00ce",
            "\1\u00cf",
            "\1\u00d0",
            "\1\u00d1",
            "\1\u00d2",
            "\1\u00d3",
            "\1\u00d4",
            "\1\u00d5",
            "",
            "\1\u00d6",
            "\1\u00d7",
            "\1\u00d8",
            "\1\u00d9",
            "\1\u00da",
            "\1\u00db",
            "\164\115\1\u00dc\uff8b\115",
            "\164\115\1\u00dd\uff8b\115",
            "\150\115\1\u00de\uff97\115",
            "\164\115\1\u00df\uff8b\115",
            "\145\115\1\u00e0\uff9a\115",
            "\163\115\1\u00e1\uff8c\115",
            "\42\115\1\u00e2\15\115\12\u00b9\7\115\6\u00b9\32\115\6\u00b9\uff99\115",
            "\42\115\1\u00e3\15\115\12\u00ba\uffc6\115",
            "",
            "",
            "",
            "",
            "",
            "\1\u00e4",
            "\1\u00e5\6\uffff\1\u00e6",
            "",
            "",
            "\1\u00e7",
            "\1\u00e9",
            "\1\u00ea",
            "",
            "\1\u00eb",
            "\1\u00ec",
            "\1\u00ed",
            "\1\u00ee",
            "\1\u00ef",
            "\1\u00f0",
            "",
            "\1\u00f1",
            "\1\u00f2",
            "\1\u00f3",
            "\1\u00f4",
            "\1\u00f5",
            "",
            "\1\u00f6",
            "\1\u00f7",
            "\1\u00f8",
            "\1\u00f9",
            "\1\u00fa",
            "\1\u00fb",
            "\1\u00fc",
            "\42\115\1\u00fd\uffdd\115",
            "\145\115\1\u00fe\uff9a\115",
            "\164\115\1\u00ff\uff8b\115",
            "\151\115\1\u0100\uff96\115",
            "\42\115\1\u0101\uffdd\115",
            "\145\115\1\u0102\uff9a\115",
            "",
            "",
            "\1\u0106\64\uffff\1\u0105",
            "",
            "",
            "",
            "",
            "\1\u0107",
            "\1\u0108",
            "",
            "\1\u0109",
            "\1\u010a",
            "\1\u010b",
            "\1\u010c",
            "\1\u010d",
            "\1\u010e",
            "\1\u010f",
            "\1\u0110",
            "",
            "\1\u0111",
            "\1\u0112",
            "",
            "\1\u0113",
            "\1\u0114",
            "",
            "\1\u0115",
            "",
            "",
            "\162\115\1\u0117\uff8d\115",
            "\42\115\1\u0118\uffdd\115",
            "\146\115\1\u0119\uff99\115",
            "",
            "\42\115\1\u011b\uffdd\115",
            "",
            "",
            "",
            "",
            "\1\u011c",
            "\1\u011d",
            "",
            "\1\u011e",
            "\1\u011f",
            "\1\u0120",
            "\1\u0121",
            "\1\u0122",
            "\1\u0123",
            "\1\u0124",
            "",
            "\1\u0125",
            "\1\u0126",
            "\1\u0127",
            "",
            "",
            "\42\115\1\u0128\uffdd\115",
            "",
            "\151\115\1\u012a\uff96\115",
            "",
            "",
            "\1\u012c",
            "\1\u012d",
            "",
            "\1\u012e",
            "\1\u012f",
            "",
            "\1\u0130",
            "\1\u0131\1\u0132",
            "\1\u0133",
            "\1\u0134",
            "",
            "",
            "",
            "",
            "\145\115\1\u0136\uff9a\115",
            "",
            "\1\u0137",
            "\1\u0138",
            "",
            "\1\u0139\10\uffff\1\u013a",
            "\1\u013b",
            "\1\u013c",
            "\1\u013d",
            "\1\u013e",
            "\1\u013f",
            "",
            "\144\115\1\u0140\uff9b\115",
            "\1\u0141",
            "\1\u0142",
            "",
            "\1\u0143",
            "\1\u0144",
            "",
            "",
            "",
            "",
            "\42\115\1\u0145\uffdd\115",
            "\1\u0146",
            "\1\u0147",
            "\1\u0148",
            "\1\u0149",
            "",
            "\1\u014b",
            "\1\u014c",
            "\1\u014d",
            "",
            "",
            "\1\u014e",
            "\1\u014f",
            "\1\u0150",
            "\1\u0151",
            "\1\u0152",
            "",
            "\1\u0153",
            "\1\u0154",
            "\1\u0155",
            "\1\u0156",
            "\1\u0157",
            "\1\u0158",
            "\1\u0159",
            "\1\u015a",
            "\1\u015c",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA19_eot = DFA.unpackEncodedString(DFA19_eotS);
    static final short[] DFA19_eof = DFA.unpackEncodedString(DFA19_eofS);
    static final char[] DFA19_min = DFA.unpackEncodedStringToUnsignedChars(DFA19_minS);
    static final char[] DFA19_max = DFA.unpackEncodedStringToUnsignedChars(DFA19_maxS);
    static final short[] DFA19_accept = DFA.unpackEncodedString(DFA19_acceptS);
    static final short[] DFA19_special = DFA.unpackEncodedString(DFA19_specialS);
    static final short[][] DFA19_transition;

    static {
        int numStates = DFA19_transitionS.length;
        DFA19_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA19_transition[i] = DFA.unpackEncodedString(DFA19_transitionS[i]);
        }
    }

    static class DFA19 extends DFA {

        public DFA19(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 19;
            this.eot = DFA19_eot;
            this.eof = DFA19_eof;
            this.min = DFA19_min;
            this.max = DFA19_max;
            this.accept = DFA19_accept;
            this.special = DFA19_special;
            this.transition = DFA19_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | T__63 | T__64 | T__65 | T__66 | T__67 | T__68 | T__69 | T__70 | T__71 | T__72 | T__73 | T__74 | T__75 | T__76 | T__77 | T__78 | T__79 | T__80 | T__81 | T__82 | T__83 | T__84 | T__85 | T__86 | T__87 | T__88 | T__89 | T__90 | T__91 | T__92 | T__93 | T__94 | T__95 | T__96 | T__97 | T__98 | T__99 | RULE_RUNTEXT | RULE_HEXADECIMAL | RULE_UINT_STRING | RULE_REAL_STRING | RULE_HEX_STRING | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA19_69 = input.LA(1);

                        s = -1;
                        if ( (LA19_69=='e') ) {s = 132;}

                        else if ( ((LA19_69>='\u0000' && LA19_69<='d')||(LA19_69>='f' && LA19_69<='\uFFFF')) ) {s = 77;}

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA19_132 = input.LA(1);

                        s = -1;
                        if ( (LA19_132=='f') ) {s = 179;}

                        else if ( ((LA19_132>='\u0000' && LA19_132<='e')||(LA19_132>='g' && LA19_132<='\uFFFF')) ) {s = 77;}

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA19_179 = input.LA(1);

                        s = -1;
                        if ( (LA19_179=='t') ) {s = 220;}

                        else if ( ((LA19_179>='\u0000' && LA19_179<='s')||(LA19_179>='u' && LA19_179<='\uFFFF')) ) {s = 77;}

                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA19_220 = input.LA(1);

                        s = -1;
                        if ( (LA19_220=='\"') ) {s = 253;}

                        else if ( ((LA19_220>='\u0000' && LA19_220<='!')||(LA19_220>='#' && LA19_220<='\uFFFF')) ) {s = 77;}

                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA19_70 = input.LA(1);

                        s = -1;
                        if ( (LA19_70=='e') ) {s = 133;}

                        else if ( ((LA19_70>='\u0000' && LA19_70<='d')||(LA19_70>='f' && LA19_70<='\uFFFF')) ) {s = 77;}

                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA19_133 = input.LA(1);

                        s = -1;
                        if ( (LA19_133=='n') ) {s = 180;}

                        else if ( ((LA19_133>='\u0000' && LA19_133<='m')||(LA19_133>='o' && LA19_133<='\uFFFF')) ) {s = 77;}

                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA19_180 = input.LA(1);

                        s = -1;
                        if ( (LA19_180=='t') ) {s = 221;}

                        else if ( ((LA19_180>='\u0000' && LA19_180<='s')||(LA19_180>='u' && LA19_180<='\uFFFF')) ) {s = 77;}

                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA19_221 = input.LA(1);

                        s = -1;
                        if ( (LA19_221=='e') ) {s = 254;}

                        else if ( ((LA19_221>='\u0000' && LA19_221<='d')||(LA19_221>='f' && LA19_221<='\uFFFF')) ) {s = 77;}

                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA19_254 = input.LA(1);

                        s = -1;
                        if ( (LA19_254=='r') ) {s = 279;}

                        else if ( ((LA19_254>='\u0000' && LA19_254<='q')||(LA19_254>='s' && LA19_254<='\uFFFF')) ) {s = 77;}

                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA19_279 = input.LA(1);

                        s = -1;
                        if ( (LA19_279=='\"') ) {s = 296;}

                        else if ( ((LA19_279>='\u0000' && LA19_279<='!')||(LA19_279>='#' && LA19_279<='\uFFFF')) ) {s = 77;}

                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA19_71 = input.LA(1);

                        s = -1;
                        if ( (LA19_71=='i') ) {s = 134;}

                        else if ( ((LA19_71>='\u0000' && LA19_71<='h')||(LA19_71>='j' && LA19_71<='\uFFFF')) ) {s = 77;}

                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA19_134 = input.LA(1);

                        s = -1;
                        if ( (LA19_134=='g') ) {s = 181;}

                        else if ( ((LA19_134>='\u0000' && LA19_134<='f')||(LA19_134>='h' && LA19_134<='\uFFFF')) ) {s = 77;}

                        if ( s>=0 ) return s;
                        break;
                    case 12 : 
                        int LA19_181 = input.LA(1);

                        s = -1;
                        if ( (LA19_181=='h') ) {s = 222;}

                        else if ( ((LA19_181>='\u0000' && LA19_181<='g')||(LA19_181>='i' && LA19_181<='\uFFFF')) ) {s = 77;}

                        if ( s>=0 ) return s;
                        break;
                    case 13 : 
                        int LA19_222 = input.LA(1);

                        s = -1;
                        if ( (LA19_222=='t') ) {s = 255;}

                        else if ( ((LA19_222>='\u0000' && LA19_222<='s')||(LA19_222>='u' && LA19_222<='\uFFFF')) ) {s = 77;}

                        if ( s>=0 ) return s;
                        break;
                    case 14 : 
                        int LA19_255 = input.LA(1);

                        s = -1;
                        if ( (LA19_255=='\"') ) {s = 280;}

                        else if ( ((LA19_255>='\u0000' && LA19_255<='!')||(LA19_255>='#' && LA19_255<='\uFFFF')) ) {s = 77;}

                        if ( s>=0 ) return s;
                        break;
                    case 15 : 
                        int LA19_72 = input.LA(1);

                        s = -1;
                        if ( (LA19_72=='u') ) {s = 135;}

                        else if ( ((LA19_72>='\u0000' && LA19_72<='t')||(LA19_72>='v' && LA19_72<='\uFFFF')) ) {s = 77;}

                        if ( s>=0 ) return s;
                        break;
                    case 16 : 
                        int LA19_135 = input.LA(1);

                        s = -1;
                        if ( (LA19_135=='s') ) {s = 182;}

                        else if ( ((LA19_135>='\u0000' && LA19_135<='r')||(LA19_135>='t' && LA19_135<='\uFFFF')) ) {s = 77;}

                        if ( s>=0 ) return s;
                        break;
                    case 17 : 
                        int LA19_182 = input.LA(1);

                        s = -1;
                        if ( (LA19_182=='t') ) {s = 223;}

                        else if ( ((LA19_182>='\u0000' && LA19_182<='s')||(LA19_182>='u' && LA19_182<='\uFFFF')) ) {s = 77;}

                        if ( s>=0 ) return s;
                        break;
                    case 18 : 
                        int LA19_223 = input.LA(1);

                        s = -1;
                        if ( (LA19_223=='i') ) {s = 256;}

                        else if ( ((LA19_223>='\u0000' && LA19_223<='h')||(LA19_223>='j' && LA19_223<='\uFFFF')) ) {s = 77;}

                        if ( s>=0 ) return s;
                        break;
                    case 19 : 
                        int LA19_256 = input.LA(1);

                        s = -1;
                        if ( (LA19_256=='f') ) {s = 281;}

                        else if ( ((LA19_256>='\u0000' && LA19_256<='e')||(LA19_256>='g' && LA19_256<='\uFFFF')) ) {s = 77;}

                        if ( s>=0 ) return s;
                        break;
                    case 20 : 
                        int LA19_281 = input.LA(1);

                        s = -1;
                        if ( (LA19_281=='i') ) {s = 298;}

                        else if ( ((LA19_281>='\u0000' && LA19_281<='h')||(LA19_281>='j' && LA19_281<='\uFFFF')) ) {s = 77;}

                        if ( s>=0 ) return s;
                        break;
                    case 21 : 
                        int LA19_298 = input.LA(1);

                        s = -1;
                        if ( (LA19_298=='e') ) {s = 310;}

                        else if ( ((LA19_298>='\u0000' && LA19_298<='d')||(LA19_298>='f' && LA19_298<='\uFFFF')) ) {s = 77;}

                        if ( s>=0 ) return s;
                        break;
                    case 22 : 
                        int LA19_310 = input.LA(1);

                        s = -1;
                        if ( (LA19_310=='d') ) {s = 320;}

                        else if ( ((LA19_310>='\u0000' && LA19_310<='c')||(LA19_310>='e' && LA19_310<='\uFFFF')) ) {s = 77;}

                        if ( s>=0 ) return s;
                        break;
                    case 23 : 
                        int LA19_320 = input.LA(1);

                        s = -1;
                        if ( (LA19_320=='\"') ) {s = 325;}

                        else if ( ((LA19_320>='\u0000' && LA19_320<='!')||(LA19_320>='#' && LA19_320<='\uFFFF')) ) {s = 77;}

                        if ( s>=0 ) return s;
                        break;
                    case 24 : 
                        int LA19_73 = input.LA(1);

                        s = -1;
                        if ( (LA19_73=='r') ) {s = 136;}

                        else if ( ((LA19_73>='\u0000' && LA19_73<='q')||(LA19_73>='s' && LA19_73<='\uFFFF')) ) {s = 77;}

                        if ( s>=0 ) return s;
                        break;
                    case 25 : 
                        int LA19_136 = input.LA(1);

                        s = -1;
                        if ( (LA19_136=='u') ) {s = 183;}

                        else if ( ((LA19_136>='\u0000' && LA19_136<='t')||(LA19_136>='v' && LA19_136<='\uFFFF')) ) {s = 77;}

                        if ( s>=0 ) return s;
                        break;
                    case 26 : 
                        int LA19_183 = input.LA(1);

                        s = -1;
                        if ( (LA19_183=='e') ) {s = 224;}

                        else if ( ((LA19_183>='\u0000' && LA19_183<='d')||(LA19_183>='f' && LA19_183<='\uFFFF')) ) {s = 77;}

                        if ( s>=0 ) return s;
                        break;
                    case 27 : 
                        int LA19_224 = input.LA(1);

                        s = -1;
                        if ( (LA19_224=='\"') ) {s = 257;}

                        else if ( ((LA19_224>='\u0000' && LA19_224<='!')||(LA19_224>='#' && LA19_224<='\uFFFF')) ) {s = 77;}

                        if ( s>=0 ) return s;
                        break;
                    case 28 : 
                        int LA19_74 = input.LA(1);

                        s = -1;
                        if ( (LA19_74=='a') ) {s = 137;}

                        else if ( ((LA19_74>='\u0000' && LA19_74<='`')||(LA19_74>='b' && LA19_74<='\uFFFF')) ) {s = 77;}

                        if ( s>=0 ) return s;
                        break;
                    case 29 : 
                        int LA19_137 = input.LA(1);

                        s = -1;
                        if ( (LA19_137=='l') ) {s = 184;}

                        else if ( ((LA19_137>='\u0000' && LA19_137<='k')||(LA19_137>='m' && LA19_137<='\uFFFF')) ) {s = 77;}

                        if ( s>=0 ) return s;
                        break;
                    case 30 : 
                        int LA19_184 = input.LA(1);

                        s = -1;
                        if ( (LA19_184=='s') ) {s = 225;}

                        else if ( ((LA19_184>='\u0000' && LA19_184<='r')||(LA19_184>='t' && LA19_184<='\uFFFF')) ) {s = 77;}

                        if ( s>=0 ) return s;
                        break;
                    case 31 : 
                        int LA19_225 = input.LA(1);

                        s = -1;
                        if ( (LA19_225=='e') ) {s = 258;}

                        else if ( ((LA19_225>='\u0000' && LA19_225<='d')||(LA19_225>='f' && LA19_225<='\uFFFF')) ) {s = 77;}

                        if ( s>=0 ) return s;
                        break;
                    case 32 : 
                        int LA19_258 = input.LA(1);

                        s = -1;
                        if ( (LA19_258=='\"') ) {s = 283;}

                        else if ( ((LA19_258>='\u0000' && LA19_258<='!')||(LA19_258>='#' && LA19_258<='\uFFFF')) ) {s = 77;}

                        if ( s>=0 ) return s;
                        break;
                    case 33 : 
                        int LA19_22 = input.LA(1);

                        s = -1;
                        if ( ((LA19_22>='\u0000' && LA19_22<='\uFFFF')) ) {s = 77;}

                        else s = 24;

                        if ( s>=0 ) return s;
                        break;
                    case 34 : 
                        int LA19_185 = input.LA(1);

                        s = -1;
                        if ( (LA19_185=='\"') ) {s = 226;}

                        else if ( ((LA19_185>='\u0000' && LA19_185<='!')||(LA19_185>='#' && LA19_185<='/')||(LA19_185>=':' && LA19_185<='@')||(LA19_185>='G' && LA19_185<='`')||(LA19_185>='g' && LA19_185<='\uFFFF')) ) {s = 77;}

                        else if ( ((LA19_185>='0' && LA19_185<='9')||(LA19_185>='A' && LA19_185<='F')||(LA19_185>='a' && LA19_185<='f')) ) {s = 185;}

                        if ( s>=0 ) return s;
                        break;
                    case 35 : 
                        int LA19_0 = input.LA(1);

                        s = -1;
                        if ( (LA19_0=='<') ) {s = 1;}

                        else if ( (LA19_0=='n') ) {s = 2;}

                        else if ( (LA19_0=='i') ) {s = 3;}

                        else if ( (LA19_0=='r') ) {s = 4;}

                        else if ( (LA19_0=='d') ) {s = 5;}

                        else if ( (LA19_0=='>') ) {s = 6;}

                        else if ( (LA19_0=='/') ) {s = 7;}

                        else if ( (LA19_0=='p') ) {s = 8;}

                        else if ( (LA19_0=='a') ) {s = 9;}

                        else if ( (LA19_0=='s') ) {s = 10;}

                        else if ( (LA19_0=='b') ) {s = 11;}

                        else if ( (LA19_0=='u') ) {s = 12;}

                        else if ( (LA19_0=='c') ) {s = 13;}

                        else if ( (LA19_0=='w') ) {s = 14;}

                        else if ( (LA19_0=='h') ) {s = 15;}

                        else if ( (LA19_0=='t') ) {s = 16;}

                        else if ( (LA19_0=='\"') ) {s = 17;}

                        else if ( (LA19_0=='0') ) {s = 18;}

                        else if ( (LA19_0=='^') ) {s = 19;}

                        else if ( ((LA19_0>='A' && LA19_0<='Z')||LA19_0=='_'||(LA19_0>='e' && LA19_0<='g')||(LA19_0>='j' && LA19_0<='m')||LA19_0=='o'||LA19_0=='q'||LA19_0=='v'||(LA19_0>='x' && LA19_0<='z')) ) {s = 20;}

                        else if ( ((LA19_0>='1' && LA19_0<='9')) ) {s = 21;}

                        else if ( (LA19_0=='\'') ) {s = 22;}

                        else if ( ((LA19_0>='\t' && LA19_0<='\n')||LA19_0=='\r'||LA19_0==' ') ) {s = 23;}

                        else if ( ((LA19_0>='\u0000' && LA19_0<='\b')||(LA19_0>='\u000B' && LA19_0<='\f')||(LA19_0>='\u000E' && LA19_0<='\u001F')||LA19_0=='!'||(LA19_0>='#' && LA19_0<='&')||(LA19_0>='(' && LA19_0<='.')||(LA19_0>=':' && LA19_0<=';')||LA19_0=='='||(LA19_0>='?' && LA19_0<='@')||(LA19_0>='[' && LA19_0<=']')||LA19_0=='`'||(LA19_0>='{' && LA19_0<='\uFFFF')) ) {s = 24;}

                        if ( s>=0 ) return s;
                        break;
                    case 36 : 
                        int LA19_75 = input.LA(1);

                        s = -1;
                        if ( (LA19_75=='x') ) {s = 138;}

                        else if ( (LA19_75=='.') ) {s = 139;}

                        else if ( (LA19_75=='\"') ) {s = 140;}

                        else if ( ((LA19_75>='0' && LA19_75<='9')) ) {s = 76;}

                        else if ( ((LA19_75>='\u0000' && LA19_75<='!')||(LA19_75>='#' && LA19_75<='-')||LA19_75=='/'||(LA19_75>=':' && LA19_75<='w')||(LA19_75>='y' && LA19_75<='\uFFFF')) ) {s = 77;}

                        if ( s>=0 ) return s;
                        break;
                    case 37 : 
                        int LA19_17 = input.LA(1);

                        s = -1;
                        if ( (LA19_17=='l') ) {s = 69;}

                        else if ( (LA19_17=='c') ) {s = 70;}

                        else if ( (LA19_17=='r') ) {s = 71;}

                        else if ( (LA19_17=='j') ) {s = 72;}

                        else if ( (LA19_17=='t') ) {s = 73;}

                        else if ( (LA19_17=='f') ) {s = 74;}

                        else if ( (LA19_17=='0') ) {s = 75;}

                        else if ( ((LA19_17>='1' && LA19_17<='9')) ) {s = 76;}

                        else if ( ((LA19_17>='\u0000' && LA19_17<='/')||(LA19_17>=':' && LA19_17<='b')||(LA19_17>='d' && LA19_17<='e')||(LA19_17>='g' && LA19_17<='i')||LA19_17=='k'||(LA19_17>='m' && LA19_17<='q')||LA19_17=='s'||(LA19_17>='u' && LA19_17<='\uFFFF')) ) {s = 77;}

                        else s = 24;

                        if ( s>=0 ) return s;
                        break;
                    case 38 : 
                        int LA19_139 = input.LA(1);

                        s = -1;
                        if ( ((LA19_139>='0' && LA19_139<='9')) ) {s = 186;}

                        else if ( ((LA19_139>='\u0000' && LA19_139<='/')||(LA19_139>=':' && LA19_139<='\uFFFF')) ) {s = 77;}

                        if ( s>=0 ) return s;
                        break;
                    case 39 : 
                        int LA19_138 = input.LA(1);

                        s = -1;
                        if ( ((LA19_138>='0' && LA19_138<='9')||(LA19_138>='A' && LA19_138<='F')||(LA19_138>='a' && LA19_138<='f')) ) {s = 185;}

                        else if ( ((LA19_138>='\u0000' && LA19_138<='/')||(LA19_138>=':' && LA19_138<='@')||(LA19_138>='G' && LA19_138<='`')||(LA19_138>='g' && LA19_138<='\uFFFF')) ) {s = 77;}

                        if ( s>=0 ) return s;
                        break;
                    case 40 : 
                        int LA19_76 = input.LA(1);

                        s = -1;
                        if ( (LA19_76=='.') ) {s = 139;}

                        else if ( (LA19_76=='\"') ) {s = 140;}

                        else if ( ((LA19_76>='0' && LA19_76<='9')) ) {s = 76;}

                        else if ( ((LA19_76>='\u0000' && LA19_76<='!')||(LA19_76>='#' && LA19_76<='-')||LA19_76=='/'||(LA19_76>=':' && LA19_76<='\uFFFF')) ) {s = 77;}

                        if ( s>=0 ) return s;
                        break;
                    case 41 : 
                        int LA19_186 = input.LA(1);

                        s = -1;
                        if ( (LA19_186=='\"') ) {s = 227;}

                        else if ( ((LA19_186>='0' && LA19_186<='9')) ) {s = 186;}

                        else if ( ((LA19_186>='\u0000' && LA19_186<='!')||(LA19_186>='#' && LA19_186<='/')||(LA19_186>=':' && LA19_186<='\uFFFF')) ) {s = 77;}

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 19, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}