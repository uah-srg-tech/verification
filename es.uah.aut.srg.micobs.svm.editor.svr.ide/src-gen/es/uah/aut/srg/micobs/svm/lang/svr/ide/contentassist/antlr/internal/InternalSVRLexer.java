package es.uah.aut.srg.micobs.svm.lang.svr.ide.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.Lexer;


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
            // InternalSVR.g:11:7: ( '/>' )
            // InternalSVR.g:11:9: '/>'
            {
            match("/>"); 


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
            // InternalSVR.g:12:7: ( '\"left\"' )
            // InternalSVR.g:12:9: '\"left\"'
            {
            match("\"left\""); 


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
            // InternalSVR.g:13:7: ( '\"center\"' )
            // InternalSVR.g:13:9: '\"center\"'
            {
            match("\"center\""); 


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
            // InternalSVR.g:14:7: ( '\"right\"' )
            // InternalSVR.g:14:9: '\"right\"'
            {
            match("\"right\""); 


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
            // InternalSVR.g:15:7: ( '\"justified\"' )
            // InternalSVR.g:15:9: '\"justified\"'
            {
            match("\"justified\""); 


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
            // InternalSVR.g:16:7: ( '\"true\"' )
            // InternalSVR.g:16:9: '\"true\"'
            {
            match("\"true\""); 


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
            // InternalSVR.g:17:7: ( '\"false\"' )
            // InternalSVR.g:17:9: '\"false\"'
            {
            match("\"false\""); 


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
            // InternalSVR.g:18:7: ( '<SVR' )
            // InternalSVR.g:18:9: '<SVR'
            {
            match("<SVR"); 


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
            // InternalSVR.g:19:7: ( 'name=' )
            // InternalSVR.g:19:9: 'name='
            {
            match("name="); 


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
            // InternalSVR.g:20:7: ( 'id=' )
            // InternalSVR.g:20:9: 'id='
            {
            match("id="); 


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
            // InternalSVR.g:21:7: ( 'issue=' )
            // InternalSVR.g:21:9: 'issue='
            {
            match("issue="); 


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
            // InternalSVR.g:22:7: ( 'revision=' )
            // InternalSVR.g:22:9: 'revision='
            {
            match("revision="); 


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
            // InternalSVR.g:23:7: ( 'date=' )
            // InternalSVR.g:23:9: 'date='
            {
            match("date="); 


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
            // InternalSVR.g:24:7: ( '>' )
            // InternalSVR.g:24:9: '>'
            {
            match('>'); 

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
            // InternalSVR.g:25:7: ( '<svsParent' )
            // InternalSVR.g:25:9: '<svsParent'
            {
            match("<svsParent"); 


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
            // InternalSVR.g:26:7: ( '</SVR>' )
            // InternalSVR.g:26:9: '</SVR>'
            {
            match("</SVR>"); 


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
            // InternalSVR.g:27:7: ( '<tcrParent' )
            // InternalSVR.g:27:9: '<tcrParent'
            {
            match("<tcrParent"); 


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
            // InternalSVR.g:28:7: ( '<TBCsTBDs>' )
            // InternalSVR.g:28:9: '<TBCsTBDs>'
            {
            match("<TBCsTBDs>"); 


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
            // InternalSVR.g:29:7: ( '</TBCsTBDs>' )
            // InternalSVR.g:29:9: '</TBCsTBDs>'
            {
            match("</TBCsTBDs>"); 


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
            // InternalSVR.g:30:7: ( '<TBC' )
            // InternalSVR.g:30:9: '<TBC'
            {
            match("<TBC"); 


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
            // InternalSVR.g:31:7: ( 'description=' )
            // InternalSVR.g:31:9: 'description='
            {
            match("description="); 


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
            // InternalSVR.g:32:7: ( 'parentTBC=' )
            // InternalSVR.g:32:9: 'parentTBC='
            {
            match("parentTBC="); 


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
            // InternalSVR.g:33:7: ( '<TBD' )
            // InternalSVR.g:33:9: '<TBD'
            {
            match("<TBD"); 


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
            // InternalSVR.g:34:7: ( 'parentTBD=' )
            // InternalSVR.g:34:9: 'parentTBD='
            {
            match("parentTBD="); 


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
            // InternalSVR.g:35:7: ( '<body>' )
            // InternalSVR.g:35:9: '<body>'
            {
            match("<body>"); 


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
            // InternalSVR.g:36:7: ( '</body>' )
            // InternalSVR.g:36:9: '</body>'
            {
            match("</body>"); 


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
            // InternalSVR.g:37:7: ( '<paragraph' )
            // InternalSVR.g:37:9: '<paragraph'
            {
            match("<paragraph"); 


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
            // InternalSVR.g:38:7: ( '</paragraph>' )
            // InternalSVR.g:38:9: '</paragraph>'
            {
            match("</paragraph>"); 


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
            // InternalSVR.g:39:7: ( 'alignment=' )
            // InternalSVR.g:39:9: 'alignment='
            {
            match("alignment="); 


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
            // InternalSVR.g:40:7: ( 'style=' )
            // InternalSVR.g:40:9: 'style='
            {
            match("style="); 


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
            // InternalSVR.g:41:7: ( 'indent=' )
            // InternalSVR.g:41:9: 'indent='
            {
            match("indent="); 


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
            // InternalSVR.g:42:7: ( '<listItem>' )
            // InternalSVR.g:42:9: '<listItem>'
            {
            match("<listItem>"); 


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
            // InternalSVR.g:43:7: ( '</listItem>' )
            // InternalSVR.g:43:9: '</listItem>'
            {
            match("</listItem>"); 


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
            // InternalSVR.g:44:7: ( '<sublist>' )
            // InternalSVR.g:44:9: '<sublist>'
            {
            match("<sublist>"); 


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
            // InternalSVR.g:45:7: ( '</sublist>' )
            // InternalSVR.g:45:9: '</sublist>'
            {
            match("</sublist>"); 


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
            // InternalSVR.g:46:7: ( '<itemize' )
            // InternalSVR.g:46:9: '<itemize'
            {
            match("<itemize"); 


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
            // InternalSVR.g:47:7: ( '</itemize>' )
            // InternalSVR.g:47:9: '</itemize>'
            {
            match("</itemize>"); 


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
            // InternalSVR.g:48:7: ( '<enumerate' )
            // InternalSVR.g:48:9: '<enumerate'
            {
            match("<enumerate"); 


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
            // InternalSVR.g:49:7: ( '</enumerate>' )
            // InternalSVR.g:49:9: '</enumerate>'
            {
            match("</enumerate>"); 


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
            // InternalSVR.g:50:7: ( '<run' )
            // InternalSVR.g:50:9: '<run'
            {
            match("<run"); 


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
            // InternalSVR.g:51:7: ( '</run>' )
            // InternalSVR.g:51:9: '</run>'
            {
            match("</run>"); 


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
            // InternalSVR.g:52:7: ( 'bold=' )
            // InternalSVR.g:52:9: 'bold='
            {
            match("bold="); 


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
            // InternalSVR.g:53:7: ( 'italics=' )
            // InternalSVR.g:53:9: 'italics='
            {
            match("italics="); 


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
            // InternalSVR.g:54:7: ( 'underline=' )
            // InternalSVR.g:54:9: 'underline='
            {
            match("underline="); 


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
            // InternalSVR.g:55:7: ( 'color=' )
            // InternalSVR.g:55:9: 'color='
            {
            match("color="); 


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
            // InternalSVR.g:56:7: ( '<hyperlink' )
            // InternalSVR.g:56:9: '<hyperlink'
            {
            match("<hyperlink"); 


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
            // InternalSVR.g:57:7: ( 'reference=' )
            // InternalSVR.g:57:9: 'reference='
            {
            match("reference="); 


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
            // InternalSVR.g:58:7: ( '</hyperlink>' )
            // InternalSVR.g:58:9: '</hyperlink>'
            {
            match("</hyperlink>"); 


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
            // InternalSVR.g:59:7: ( '<tab/>' )
            // InternalSVR.g:59:9: '<tab/>'
            {
            match("<tab/>"); 


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
            // InternalSVR.g:60:7: ( '<figureFromFile' )
            // InternalSVR.g:60:9: '<figureFromFile'
            {
            match("<figureFromFile"); 


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
            // InternalSVR.g:61:7: ( 'referenceFile=' )
            // InternalSVR.g:61:9: 'referenceFile='
            {
            match("referenceFile="); 


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
            // InternalSVR.g:62:7: ( 'width=' )
            // InternalSVR.g:62:9: 'width='
            {
            match("width="); 


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
            // InternalSVR.g:63:7: ( 'height=' )
            // InternalSVR.g:63:9: 'height='
            {
            match("height="); 


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
            // InternalSVR.g:64:7: ( 'caption=' )
            // InternalSVR.g:64:9: 'caption='
            {
            match("caption="); 


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
            // InternalSVR.g:65:7: ( '<tableFromFile' )
            // InternalSVR.g:65:9: '<tableFromFile'
            {
            match("<tableFromFile"); 


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
            // InternalSVR.g:66:7: ( '<basicTable' )
            // InternalSVR.g:66:9: '<basicTable'
            {
            match("<basicTable"); 


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
            // InternalSVR.g:67:7: ( '</basicTable>' )
            // InternalSVR.g:67:9: '</basicTable>'
            {
            match("</basicTable>"); 


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
            // InternalSVR.g:68:7: ( '<row>' )
            // InternalSVR.g:68:9: '<row>'
            {
            match("<row>"); 


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
            // InternalSVR.g:69:7: ( '</row>' )
            // InternalSVR.g:69:9: '</row>'
            {
            match("</row>"); 


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
            // InternalSVR.g:70:7: ( '<cell' )
            // InternalSVR.g:70:9: '<cell'
            {
            match("<cell"); 


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
            // InternalSVR.g:71:7: ( '</cell>' )
            // InternalSVR.g:71:9: '</cell>'
            {
            match("</cell>"); 


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
            // InternalSVR.g:72:7: ( 'colSpan=' )
            // InternalSVR.g:72:9: 'colSpan='
            {
            match("colSpan="); 


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
            // InternalSVR.g:73:7: ( 'rowSpan=' )
            // InternalSVR.g:73:9: 'rowSpan='
            {
            match("rowSpan="); 


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
            // InternalSVR.g:74:7: ( 'shadow=' )
            // InternalSVR.g:74:9: 'shadow='
            {
            match("shadow="); 


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
            // InternalSVR.g:75:7: ( '<ApplicableDocument' )
            // InternalSVR.g:75:9: '<ApplicableDocument'
            {
            match("<ApplicableDocument"); 


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
            // InternalSVR.g:76:7: ( 'title=' )
            // InternalSVR.g:76:9: 'title='
            {
            match("title="); 


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
            // InternalSVR.g:77:7: ( 'url=' )
            // InternalSVR.g:77:9: 'url='
            {
            match("url="); 


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
            // InternalSVR.g:78:7: ( '<ReferenceDocument' )
            // InternalSVR.g:78:9: '<ReferenceDocument'
            {
            match("<ReferenceDocument"); 


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
            // InternalSVR.g:79:7: ( '<subsection' )
            // InternalSVR.g:79:9: '<subsection'
            {
            match("<subsection"); 


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
            // InternalSVR.g:80:7: ( '</subsection>' )
            // InternalSVR.g:80:9: '</subsection>'
            {
            match("</subsection>"); 


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
            // InternalSVR.g:81:7: ( '<Introduction>' )
            // InternalSVR.g:81:9: '<Introduction>'
            {
            match("<Introduction>"); 


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
            // InternalSVR.g:82:7: ( '</Introduction>' )
            // InternalSVR.g:82:9: '</Introduction>'
            {
            match("</Introduction>"); 


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
            // InternalSVR.g:83:7: ( '<ApplicableDocuments>' )
            // InternalSVR.g:83:9: '<ApplicableDocuments>'
            {
            match("<ApplicableDocuments>"); 


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
            // InternalSVR.g:84:7: ( '</ApplicableDocuments>' )
            // InternalSVR.g:84:9: '</ApplicableDocuments>'
            {
            match("</ApplicableDocuments>"); 


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
            // InternalSVR.g:85:7: ( '<ReferenceDocuments>' )
            // InternalSVR.g:85:9: '<ReferenceDocuments>'
            {
            match("<ReferenceDocuments>"); 


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
            // InternalSVR.g:86:7: ( '</ReferenceDocuments>' )
            // InternalSVR.g:86:9: '</ReferenceDocuments>'
            {
            match("</ReferenceDocuments>"); 


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
            // InternalSVR.g:87:7: ( '<TermsDefinitionsAbbreviations>' )
            // InternalSVR.g:87:9: '<TermsDefinitionsAbbreviations>'
            {
            match("<TermsDefinitionsAbbreviations>"); 


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
            // InternalSVR.g:88:7: ( '</TermsDefinitionsAbbreviations>' )
            // InternalSVR.g:88:9: '</TermsDefinitionsAbbreviations>'
            {
            match("</TermsDefinitionsAbbreviations>"); 


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
            // InternalSVR.g:89:7: ( '<Term' )
            // InternalSVR.g:89:9: '<Term'
            {
            match("<Term"); 


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
            // InternalSVR.g:90:7: ( '</Term>' )
            // InternalSVR.g:90:9: '</Term>'
            {
            match("</Term>"); 


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
            // InternalSVR.g:91:7: ( '<Definition' )
            // InternalSVR.g:91:9: '<Definition'
            {
            match("<Definition"); 


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
            // InternalSVR.g:92:7: ( '</Definition>' )
            // InternalSVR.g:92:9: '</Definition>'
            {
            match("</Definition>"); 


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
            // InternalSVR.g:93:7: ( '<Abbreviation' )
            // InternalSVR.g:93:9: '<Abbreviation'
            {
            match("<Abbreviation"); 


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
            // InternalSVR.g:94:7: ( '</Abbreviation>' )
            // InternalSVR.g:94:9: '</Abbreviation>'
            {
            match("</Abbreviation>"); 


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
            // InternalSVR.g:10849:14: ( '<text>' ( options {greedy=false; } : . )* '</text>' )
            // InternalSVR.g:10849:16: '<text>' ( options {greedy=false; } : . )* '</text>'
            {
            match("<text>"); 

            // InternalSVR.g:10849:25: ( options {greedy=false; } : . )*
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
            	    // InternalSVR.g:10849:53: .
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
            // InternalSVR.g:10851:18: ( '0x' ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' )+ )
            // InternalSVR.g:10851:20: '0x' ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' )+
            {
            match("0x"); 

            // InternalSVR.g:10851:25: ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' )+
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
            // InternalSVR.g:10853:18: ( '\"' ( '0' .. '9' )+ '\"' )
            // InternalSVR.g:10853:20: '\"' ( '0' .. '9' )+ '\"'
            {
            match('\"'); 
            // InternalSVR.g:10853:24: ( '0' .. '9' )+
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
            	    // InternalSVR.g:10853:25: '0' .. '9'
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
            // InternalSVR.g:10855:18: ( '\"' ( '0' .. '9' )+ ( '.' ( '0' .. '9' )+ )? '\"' )
            // InternalSVR.g:10855:20: '\"' ( '0' .. '9' )+ ( '.' ( '0' .. '9' )+ )? '\"'
            {
            match('\"'); 
            // InternalSVR.g:10855:24: ( '0' .. '9' )+
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
            	    // InternalSVR.g:10855:25: '0' .. '9'
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

            // InternalSVR.g:10855:36: ( '.' ( '0' .. '9' )+ )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0=='.') ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalSVR.g:10855:37: '.' ( '0' .. '9' )+
                    {
                    match('.'); 
                    // InternalSVR.g:10855:41: ( '0' .. '9' )+
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
                    	    // InternalSVR.g:10855:42: '0' .. '9'
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
            // InternalSVR.g:10857:17: ( '\"0x' ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' )+ '\"' )
            // InternalSVR.g:10857:19: '\"0x' ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' )+ '\"'
            {
            match("\"0x"); 

            // InternalSVR.g:10857:25: ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' )+
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
            // InternalSVR.g:10859:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // InternalSVR.g:10859:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // InternalSVR.g:10859:11: ( '^' )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0=='^') ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalSVR.g:10859:11: '^'
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

            // InternalSVR.g:10859:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
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
            // InternalSVR.g:10861:10: ( ( '0' .. '9' )+ )
            // InternalSVR.g:10861:12: ( '0' .. '9' )+
            {
            // InternalSVR.g:10861:12: ( '0' .. '9' )+
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
            	    // InternalSVR.g:10861:13: '0' .. '9'
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
            // InternalSVR.g:10863:13: ( ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // InternalSVR.g:10863:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // InternalSVR.g:10863:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
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
                    // InternalSVR.g:10863:16: '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // InternalSVR.g:10863:20: ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )*
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
                    	    // InternalSVR.g:10863:21: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalSVR.g:10863:28: ~ ( ( '\\\\' | '\"' ) )
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
                    // InternalSVR.g:10863:48: '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // InternalSVR.g:10863:53: ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )*
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
                    	    // InternalSVR.g:10863:54: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalSVR.g:10863:61: ~ ( ( '\\\\' | '\\'' ) )
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
            // InternalSVR.g:10865:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // InternalSVR.g:10865:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // InternalSVR.g:10865:24: ( options {greedy=false; } : . )*
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
            	    // InternalSVR.g:10865:52: .
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
            // InternalSVR.g:10867:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // InternalSVR.g:10867:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // InternalSVR.g:10867:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( ((LA15_0>='\u0000' && LA15_0<='\t')||(LA15_0>='\u000B' && LA15_0<='\f')||(LA15_0>='\u000E' && LA15_0<='\uFFFF')) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalSVR.g:10867:24: ~ ( ( '\\n' | '\\r' ) )
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

            // InternalSVR.g:10867:40: ( ( '\\r' )? '\\n' )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0=='\n'||LA17_0=='\r') ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalSVR.g:10867:41: ( '\\r' )? '\\n'
                    {
                    // InternalSVR.g:10867:41: ( '\\r' )?
                    int alt16=2;
                    int LA16_0 = input.LA(1);

                    if ( (LA16_0=='\r') ) {
                        alt16=1;
                    }
                    switch (alt16) {
                        case 1 :
                            // InternalSVR.g:10867:41: '\\r'
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
            // InternalSVR.g:10869:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // InternalSVR.g:10869:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // InternalSVR.g:10869:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
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
            // InternalSVR.g:10871:16: ( . )
            // InternalSVR.g:10871:18: .
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
        "\1\uffff\3\30\4\70\1\uffff\11\70\1\117\1\30\2\uffff\1\30\40\uffff\1\70\1\uffff\10\70\1\uffff\14\70\51\uffff\1\70\1\uffff\24\70\24\uffff\1\u00cb\4\uffff\17\70\1\uffff\6\70\20\uffff\1\u00f0\3\uffff\6\70\1\uffff\5\70\1\uffff\7\70\20\uffff\10\70\1\uffff\2\70\1\uffff\2\70\1\uffff\1\70\14\uffff\7\70\1\uffff\3\70\10\uffff\2\70\1\uffff\4\70\7\uffff\6\70\4\uffff\2\70\7\uffff\2\70\3\uffff\1\70\3\uffff\1\70\12\uffff\1\u015b\1\u015d\4\uffff";
    static final String DFA19_eofS =
        "\u015e\uffff";
    static final String DFA19_minS =
        "\1\0\1\52\1\0\1\57\1\141\1\144\1\145\1\141\1\uffff\1\141\1\154\1\150\1\157\1\156\1\141\1\151\1\145\1\151\1\170\1\101\2\uffff\1\0\5\uffff\10\0\2\uffff\1\165\1\101\1\141\1\102\1\141\4\uffff\1\157\3\uffff\1\142\1\145\2\uffff\1\155\1\uffff\1\75\1\163\1\144\1\141\1\146\1\167\1\164\1\163\1\uffff\1\162\1\151\1\171\1\141\1\154\1\144\2\154\1\160\1\144\1\151\1\164\3\uffff\10\0\2\uffff\1\142\1\uffff\1\102\1\141\2\uffff\1\165\2\uffff\1\157\3\uffff\1\142\3\uffff\1\142\1\uffff\1\103\1\162\4\uffff\1\160\1\uffff\1\146\1\145\1\uffff\1\165\1\145\1\154\1\151\1\145\1\123\1\145\1\143\1\145\1\147\1\154\2\144\1\145\1\75\1\123\2\164\1\147\1\154\10\0\1\uffff\1\154\1\uffff\1\162\2\uffff\1\142\4\uffff\1\57\1\163\1\uffff\1\155\1\154\1\145\1\75\1\145\1\156\1\151\1\163\1\162\1\160\1\75\1\162\2\156\1\145\1\157\1\75\1\162\1\uffff\1\162\1\160\1\151\2\150\1\145\6\0\4\uffff\1\155\1\154\4\uffff\1\163\1\151\1\162\1\uffff\1\75\1\164\1\143\1\151\1\145\1\141\1\uffff\1\151\1\164\1\155\1\75\1\167\1\uffff\1\154\1\75\1\141\1\157\1\75\1\164\1\75\1\uffff\3\0\1\uffff\1\0\2\uffff\1\76\4\uffff\1\143\1\145\1\uffff\1\75\1\163\1\157\2\156\1\160\1\124\1\145\1\uffff\1\75\1\151\1\uffff\2\156\1\uffff\1\75\2\uffff\1\0\1\uffff\1\0\4\uffff\1\141\1\156\1\uffff\1\75\1\156\1\143\1\75\1\164\1\102\1\156\1\uffff\1\156\2\75\3\uffff\1\0\1\uffff\1\142\1\143\1\uffff\1\75\1\145\1\uffff\1\151\1\103\1\164\1\145\3\uffff\1\0\1\154\1\145\1\uffff\1\75\1\157\4\75\1\0\1\145\1\104\1\uffff\1\151\1\156\5\uffff\1\104\1\157\1\154\1\75\1\uffff\1\157\1\143\1\145\1\uffff\1\143\1\165\1\75\1\165\1\155\1\uffff\1\155\2\145\2\156\2\164\2\163\4\uffff";
    static final String DFA19_maxS =
        "\1\uffff\1\76\1\uffff\1\164\1\141\1\164\1\157\1\145\1\uffff\1\141\1\154\1\164\1\157\1\162\1\157\1\151\1\145\1\151\1\170\1\172\2\uffff\1\uffff\5\uffff\10\uffff\2\uffff\1\166\1\163\2\145\1\157\4\uffff\1\165\3\uffff\1\160\1\145\2\uffff\1\155\1\uffff\1\75\1\163\1\144\1\141\1\166\1\167\1\164\1\163\1\uffff\1\162\1\151\1\171\1\141\1\154\1\144\2\154\1\160\1\144\1\151\1\164\3\uffff\10\uffff\2\uffff\1\142\1\uffff\1\145\1\157\2\uffff\1\165\2\uffff\1\165\3\uffff\1\160\3\uffff\1\142\1\uffff\1\104\1\162\4\uffff\1\160\1\uffff\1\146\1\145\1\uffff\1\165\1\145\1\154\1\151\1\145\1\123\1\145\1\143\1\145\1\147\1\154\2\144\1\145\1\75\1\157\2\164\1\147\1\154\10\uffff\1\uffff\1\163\1\uffff\1\162\2\uffff\1\142\4\uffff\1\154\1\163\1\uffff\1\155\1\154\1\145\1\75\1\145\1\156\1\151\1\163\1\162\1\160\1\75\1\162\2\156\1\145\1\157\1\75\1\162\1\uffff\1\162\1\160\1\151\2\150\1\145\6\uffff\4\uffff\1\155\1\163\4\uffff\1\163\1\151\1\162\1\uffff\1\75\1\164\1\143\1\151\1\145\1\141\1\uffff\1\151\1\164\1\155\1\75\1\167\1\uffff\1\154\1\75\1\141\1\157\1\75\1\164\1\75\1\uffff\3\uffff\1\uffff\1\uffff\2\uffff\1\163\4\uffff\1\143\1\145\1\uffff\1\75\1\163\1\157\2\156\1\160\1\124\1\145\1\uffff\1\75\1\151\1\uffff\2\156\1\uffff\1\75\2\uffff\1\uffff\1\uffff\1\uffff\4\uffff\1\141\1\156\1\uffff\1\75\1\156\1\143\1\75\1\164\1\102\1\156\1\uffff\1\156\2\75\3\uffff\1\uffff\1\uffff\1\142\1\143\1\uffff\1\75\1\145\1\uffff\1\151\1\104\1\164\1\145\3\uffff\1\uffff\1\154\1\145\1\uffff\1\106\1\157\4\75\1\uffff\1\145\1\104\1\uffff\1\151\1\156\5\uffff\1\104\1\157\1\154\1\75\1\uffff\1\157\1\143\1\145\1\uffff\1\143\1\165\1\75\1\165\1\155\1\uffff\1\155\2\145\2\156\2\164\2\163\4\uffff";
    static final String DFA19_acceptS =
        "\10\uffff\1\16\13\uffff\1\132\1\133\1\uffff\1\137\1\140\1\1\1\135\1\136\10\uffff\1\134\1\10\5\uffff\1\33\1\40\1\44\1\46\1\uffff\1\56\1\62\1\74\2\uffff\1\107\1\121\1\uffff\1\132\10\uffff\1\16\14\uffff\1\126\1\133\1\137\10\uffff\1\127\1\17\1\uffff\1\20\2\uffff\1\34\1\41\1\uffff\1\45\1\47\1\uffff\1\60\1\75\1\110\1\uffff\1\114\1\122\1\21\1\uffff\1\125\2\uffff\1\31\1\70\1\50\1\72\1\uffff\1\123\2\uffff\1\12\34\uffff\1\127\1\uffff\1\23\1\uffff\1\32\1\71\1\uffff\1\51\1\73\1\112\1\124\2\uffff\1\27\22\uffff\1\103\14\uffff\1\131\1\130\1\42\1\105\2\uffff\1\61\1\67\1\22\1\24\3\uffff\1\11\6\uffff\1\15\5\uffff\1\52\7\uffff\1\2\3\uffff\1\6\1\uffff\1\131\1\130\1\uffff\1\43\1\106\1\115\1\117\2\uffff\1\13\10\uffff\1\36\2\uffff\1\55\2\uffff\1\64\1\uffff\1\102\1\2\1\uffff\1\4\1\uffff\1\6\1\7\1\116\1\120\2\uffff\1\37\7\uffff\1\100\3\uffff\1\65\1\3\1\4\1\uffff\1\7\2\uffff\1\53\2\uffff\1\77\4\uffff\1\76\1\66\1\3\3\uffff\1\14\11\uffff\1\57\2\uffff\1\26\1\30\1\35\1\54\1\5\4\uffff\1\5\3\uffff\1\25\5\uffff\1\63\11\uffff\1\113\1\104\1\111\1\101";
    static final String DFA19_specialS =
        "\1\44\1\uffff\1\46\23\uffff\1\32\5\uffff\1\0\1\4\1\12\1\17\1\30\1\35\1\43\1\50\55\uffff\1\1\1\5\1\13\1\20\1\31\1\36\1\47\1\45\64\uffff\1\2\1\6\1\14\1\21\1\33\1\37\1\41\1\51\47\uffff\1\3\1\7\1\15\1\22\1\34\1\40\43\uffff\1\10\1\16\1\23\1\uffff\1\42\34\uffff\1\11\1\uffff\1\24\25\uffff\1\25\16\uffff\1\26\11\uffff\1\27\46\uffff}>";
    static final String[] DFA19_transitionS = {
            "\11\30\2\27\2\30\1\27\22\30\1\27\1\30\1\2\4\30\1\26\7\30\1\1\1\22\11\25\2\30\1\3\1\30\1\10\2\30\32\24\3\30\1\23\1\24\1\30\1\12\1\14\1\16\1\7\3\24\1\20\1\5\4\24\1\4\1\24\1\11\1\24\1\6\1\13\1\21\1\15\1\24\1\17\3\24\uff85\30",
            "\1\32\4\uffff\1\33\16\uffff\1\31",
            "\60\44\1\42\11\43\51\44\1\35\2\44\1\41\3\44\1\37\1\44\1\34\5\44\1\36\1\44\1\40\uff8b\44",
            "\1\47\21\uffff\1\63\2\uffff\1\66\4\uffff\1\65\10\uffff\1\64\1\45\1\51\15\uffff\1\52\1\62\1\uffff\1\56\1\61\1\uffff\1\60\1\55\2\uffff\1\54\3\uffff\1\53\1\uffff\1\57\1\46\1\50",
            "\1\67",
            "\1\71\11\uffff\1\73\4\uffff\1\72\1\74",
            "\1\75\11\uffff\1\76",
            "\1\77\3\uffff\1\100",
            "",
            "\1\102",
            "\1\103",
            "\1\105\13\uffff\1\104",
            "\1\106",
            "\1\107\3\uffff\1\110",
            "\1\112\15\uffff\1\111",
            "\1\113",
            "\1\114",
            "\1\115",
            "\1\116",
            "\32\70\4\uffff\1\70\1\uffff\32\70",
            "",
            "",
            "\0\44",
            "",
            "",
            "",
            "",
            "",
            "\145\44\1\121\uff9a\44",
            "\145\44\1\122\uff9a\44",
            "\151\44\1\123\uff96\44",
            "\165\44\1\124\uff8a\44",
            "\162\44\1\125\uff8d\44",
            "\141\44\1\126\uff9e\44",
            "\42\44\1\131\13\44\1\130\1\44\12\43\76\44\1\127\uff87\44",
            "\42\44\1\131\13\44\1\130\1\44\12\43\uffc6\44",
            "",
            "",
            "\1\133\1\132",
            "\1\150\2\uffff\1\152\4\uffff\1\147\10\uffff\1\151\1\134\1\135\15\uffff\1\136\1\146\1\uffff\1\143\2\uffff\1\145\1\142\2\uffff\1\140\3\uffff\1\137\1\uffff\1\144\1\141",
            "\1\154\1\uffff\1\153\1\uffff\1\155",
            "\1\156\42\uffff\1\157",
            "\1\161\15\uffff\1\160",
            "",
            "",
            "",
            "",
            "\1\163\5\uffff\1\162",
            "",
            "",
            "",
            "\1\165\15\uffff\1\164",
            "\1\166",
            "",
            "",
            "\1\167",
            "",
            "\1\170",
            "\1\171",
            "\1\172",
            "\1\173",
            "\1\175\17\uffff\1\174",
            "\1\176",
            "\1\177",
            "\1\u0080",
            "",
            "\1\u0081",
            "\1\u0082",
            "\1\u0083",
            "\1\u0084",
            "\1\u0085",
            "\1\u0086",
            "\1\u0087",
            "\1\u0088",
            "\1\u0089",
            "\1\u008a",
            "\1\u008b",
            "\1\u008c",
            "",
            "",
            "",
            "\146\44\1\u008d\uff99\44",
            "\156\44\1\u008e\uff91\44",
            "\147\44\1\u008f\uff98\44",
            "\163\44\1\u0090\uff8c\44",
            "\165\44\1\u0091\uff8a\44",
            "\154\44\1\u0092\uff93\44",
            "\60\44\12\u0093\7\44\6\u0093\32\44\6\u0093\uff99\44",
            "\60\44\12\u0094\uffc6\44",
            "",
            "",
            "\1\u0096",
            "",
            "\1\u0097\42\uffff\1\u0098",
            "\1\u009a\15\uffff\1\u0099",
            "",
            "",
            "\1\u009b",
            "",
            "",
            "\1\u009d\5\uffff\1\u009c",
            "",
            "",
            "",
            "\1\u009f\15\uffff\1\u009e",
            "",
            "",
            "",
            "\1\u00a0",
            "",
            "\1\u00a1\1\u00a2",
            "\1\u00a3",
            "",
            "",
            "",
            "",
            "\1\u00a4",
            "",
            "\1\u00a5",
            "\1\u00a6",
            "",
            "\1\u00a7",
            "\1\u00a8",
            "\1\u00a9",
            "\1\u00aa",
            "\1\u00ab",
            "\1\u00ac",
            "\1\u00ad",
            "\1\u00ae",
            "\1\u00af",
            "\1\u00b0",
            "\1\u00b1",
            "\1\u00b2",
            "\1\u00b3",
            "\1\u00b4",
            "\1\u00b5",
            "\1\u00b7\33\uffff\1\u00b6",
            "\1\u00b8",
            "\1\u00b9",
            "\1\u00ba",
            "\1\u00bb",
            "\164\44\1\u00bc\uff8b\44",
            "\164\44\1\u00bd\uff8b\44",
            "\150\44\1\u00be\uff97\44",
            "\164\44\1\u00bf\uff8b\44",
            "\145\44\1\u00c0\uff9a\44",
            "\163\44\1\u00c1\uff8c\44",
            "\42\44\1\u00c2\15\44\12\u0093\7\44\6\u0093\32\44\6\u0093\uff99\44",
            "\42\44\1\u00c3\15\44\12\u0094\uffc6\44",
            "",
            "\1\u00c4\6\uffff\1\u00c5",
            "",
            "\1\u00c6",
            "",
            "",
            "\1\u00c7",
            "",
            "",
            "",
            "",
            "\1\u00c8\74\uffff\1\u00c9",
            "\1\u00ca",
            "",
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
            "\1\u00d6",
            "\1\u00d7",
            "\1\u00d8",
            "\1\u00d9",
            "\1\u00da",
            "\1\u00db",
            "\1\u00dc",
            "\1\u00dd",
            "",
            "\1\u00de",
            "\1\u00df",
            "\1\u00e0",
            "\1\u00e1",
            "\1\u00e2",
            "\1\u00e3",
            "\42\44\1\u00e4\uffdd\44",
            "\145\44\1\u00e5\uff9a\44",
            "\164\44\1\u00e6\uff8b\44",
            "\151\44\1\u00e7\uff96\44",
            "\42\44\1\u00e8\uffdd\44",
            "\145\44\1\u00e9\uff9a\44",
            "",
            "",
            "",
            "",
            "\1\u00ec",
            "\1\u00ed\6\uffff\1\u00ee",
            "",
            "",
            "",
            "",
            "\1\u00ef",
            "\1\u00f1",
            "\1\u00f2",
            "",
            "\1\u00f3",
            "\1\u00f4",
            "\1\u00f5",
            "\1\u00f6",
            "\1\u00f7",
            "\1\u00f8",
            "",
            "\1\u00f9",
            "\1\u00fa",
            "\1\u00fb",
            "\1\u00fc",
            "\1\u00fd",
            "",
            "\1\u00fe",
            "\1\u00ff",
            "\1\u0100",
            "\1\u0101",
            "\1\u0102",
            "\1\u0103",
            "\1\u0104",
            "",
            "\162\44\1\u0106\uff8d\44",
            "\42\44\1\u0107\uffdd\44",
            "\146\44\1\u0108\uff99\44",
            "",
            "\42\44\1\u010a\uffdd\44",
            "",
            "",
            "\1\u010c\64\uffff\1\u010b",
            "",
            "",
            "",
            "",
            "\1\u010d",
            "\1\u010e",
            "",
            "\1\u010f",
            "\1\u0110",
            "\1\u0111",
            "\1\u0112",
            "\1\u0113",
            "\1\u0114",
            "\1\u0115",
            "\1\u0116",
            "",
            "\1\u0117",
            "\1\u0118",
            "",
            "\1\u0119",
            "\1\u011a",
            "",
            "\1\u011b",
            "",
            "",
            "\42\44\1\u011c\uffdd\44",
            "",
            "\151\44\1\u011e\uff96\44",
            "",
            "",
            "",
            "",
            "\1\u0120",
            "\1\u0121",
            "",
            "\1\u0122",
            "\1\u0123",
            "\1\u0124",
            "\1\u0125",
            "\1\u0126",
            "\1\u0127",
            "\1\u0128",
            "",
            "\1\u0129",
            "\1\u012a",
            "\1\u012b",
            "",
            "",
            "",
            "\145\44\1\u012d\uff9a\44",
            "",
            "\1\u012e",
            "\1\u012f",
            "",
            "\1\u0130",
            "\1\u0131",
            "",
            "\1\u0132",
            "\1\u0133\1\u0134",
            "\1\u0135",
            "\1\u0136",
            "",
            "",
            "",
            "\144\44\1\u0137\uff9b\44",
            "\1\u0138",
            "\1\u0139",
            "",
            "\1\u013a\10\uffff\1\u013b",
            "\1\u013c",
            "\1\u013d",
            "\1\u013e",
            "\1\u013f",
            "\1\u0140",
            "\42\44\1\u0141\uffdd\44",
            "\1\u0142",
            "\1\u0143",
            "",
            "\1\u0144",
            "\1\u0145",
            "",
            "",
            "",
            "",
            "",
            "\1\u0147",
            "\1\u0148",
            "\1\u0149",
            "\1\u014a",
            "",
            "\1\u014b",
            "\1\u014c",
            "\1\u014d",
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
                        int LA19_28 = input.LA(1);

                        s = -1;
                        if ( (LA19_28=='e') ) {s = 81;}

                        else if ( ((LA19_28>='\u0000' && LA19_28<='d')||(LA19_28>='f' && LA19_28<='\uFFFF')) ) {s = 36;}

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA19_81 = input.LA(1);

                        s = -1;
                        if ( (LA19_81=='f') ) {s = 141;}

                        else if ( ((LA19_81>='\u0000' && LA19_81<='e')||(LA19_81>='g' && LA19_81<='\uFFFF')) ) {s = 36;}

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA19_141 = input.LA(1);

                        s = -1;
                        if ( (LA19_141=='t') ) {s = 188;}

                        else if ( ((LA19_141>='\u0000' && LA19_141<='s')||(LA19_141>='u' && LA19_141<='\uFFFF')) ) {s = 36;}

                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA19_188 = input.LA(1);

                        s = -1;
                        if ( (LA19_188=='\"') ) {s = 228;}

                        else if ( ((LA19_188>='\u0000' && LA19_188<='!')||(LA19_188>='#' && LA19_188<='\uFFFF')) ) {s = 36;}

                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA19_29 = input.LA(1);

                        s = -1;
                        if ( (LA19_29=='e') ) {s = 82;}

                        else if ( ((LA19_29>='\u0000' && LA19_29<='d')||(LA19_29>='f' && LA19_29<='\uFFFF')) ) {s = 36;}

                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA19_82 = input.LA(1);

                        s = -1;
                        if ( (LA19_82=='n') ) {s = 142;}

                        else if ( ((LA19_82>='\u0000' && LA19_82<='m')||(LA19_82>='o' && LA19_82<='\uFFFF')) ) {s = 36;}

                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA19_142 = input.LA(1);

                        s = -1;
                        if ( (LA19_142=='t') ) {s = 189;}

                        else if ( ((LA19_142>='\u0000' && LA19_142<='s')||(LA19_142>='u' && LA19_142<='\uFFFF')) ) {s = 36;}

                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA19_189 = input.LA(1);

                        s = -1;
                        if ( (LA19_189=='e') ) {s = 229;}

                        else if ( ((LA19_189>='\u0000' && LA19_189<='d')||(LA19_189>='f' && LA19_189<='\uFFFF')) ) {s = 36;}

                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA19_229 = input.LA(1);

                        s = -1;
                        if ( (LA19_229=='r') ) {s = 262;}

                        else if ( ((LA19_229>='\u0000' && LA19_229<='q')||(LA19_229>='s' && LA19_229<='\uFFFF')) ) {s = 36;}

                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA19_262 = input.LA(1);

                        s = -1;
                        if ( (LA19_262=='\"') ) {s = 284;}

                        else if ( ((LA19_262>='\u0000' && LA19_262<='!')||(LA19_262>='#' && LA19_262<='\uFFFF')) ) {s = 36;}

                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA19_30 = input.LA(1);

                        s = -1;
                        if ( (LA19_30=='i') ) {s = 83;}

                        else if ( ((LA19_30>='\u0000' && LA19_30<='h')||(LA19_30>='j' && LA19_30<='\uFFFF')) ) {s = 36;}

                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA19_83 = input.LA(1);

                        s = -1;
                        if ( (LA19_83=='g') ) {s = 143;}

                        else if ( ((LA19_83>='\u0000' && LA19_83<='f')||(LA19_83>='h' && LA19_83<='\uFFFF')) ) {s = 36;}

                        if ( s>=0 ) return s;
                        break;
                    case 12 : 
                        int LA19_143 = input.LA(1);

                        s = -1;
                        if ( (LA19_143=='h') ) {s = 190;}

                        else if ( ((LA19_143>='\u0000' && LA19_143<='g')||(LA19_143>='i' && LA19_143<='\uFFFF')) ) {s = 36;}

                        if ( s>=0 ) return s;
                        break;
                    case 13 : 
                        int LA19_190 = input.LA(1);

                        s = -1;
                        if ( (LA19_190=='t') ) {s = 230;}

                        else if ( ((LA19_190>='\u0000' && LA19_190<='s')||(LA19_190>='u' && LA19_190<='\uFFFF')) ) {s = 36;}

                        if ( s>=0 ) return s;
                        break;
                    case 14 : 
                        int LA19_230 = input.LA(1);

                        s = -1;
                        if ( (LA19_230=='\"') ) {s = 263;}

                        else if ( ((LA19_230>='\u0000' && LA19_230<='!')||(LA19_230>='#' && LA19_230<='\uFFFF')) ) {s = 36;}

                        if ( s>=0 ) return s;
                        break;
                    case 15 : 
                        int LA19_31 = input.LA(1);

                        s = -1;
                        if ( (LA19_31=='u') ) {s = 84;}

                        else if ( ((LA19_31>='\u0000' && LA19_31<='t')||(LA19_31>='v' && LA19_31<='\uFFFF')) ) {s = 36;}

                        if ( s>=0 ) return s;
                        break;
                    case 16 : 
                        int LA19_84 = input.LA(1);

                        s = -1;
                        if ( (LA19_84=='s') ) {s = 144;}

                        else if ( ((LA19_84>='\u0000' && LA19_84<='r')||(LA19_84>='t' && LA19_84<='\uFFFF')) ) {s = 36;}

                        if ( s>=0 ) return s;
                        break;
                    case 17 : 
                        int LA19_144 = input.LA(1);

                        s = -1;
                        if ( (LA19_144=='t') ) {s = 191;}

                        else if ( ((LA19_144>='\u0000' && LA19_144<='s')||(LA19_144>='u' && LA19_144<='\uFFFF')) ) {s = 36;}

                        if ( s>=0 ) return s;
                        break;
                    case 18 : 
                        int LA19_191 = input.LA(1);

                        s = -1;
                        if ( (LA19_191=='i') ) {s = 231;}

                        else if ( ((LA19_191>='\u0000' && LA19_191<='h')||(LA19_191>='j' && LA19_191<='\uFFFF')) ) {s = 36;}

                        if ( s>=0 ) return s;
                        break;
                    case 19 : 
                        int LA19_231 = input.LA(1);

                        s = -1;
                        if ( (LA19_231=='f') ) {s = 264;}

                        else if ( ((LA19_231>='\u0000' && LA19_231<='e')||(LA19_231>='g' && LA19_231<='\uFFFF')) ) {s = 36;}

                        if ( s>=0 ) return s;
                        break;
                    case 20 : 
                        int LA19_264 = input.LA(1);

                        s = -1;
                        if ( (LA19_264=='i') ) {s = 286;}

                        else if ( ((LA19_264>='\u0000' && LA19_264<='h')||(LA19_264>='j' && LA19_264<='\uFFFF')) ) {s = 36;}

                        if ( s>=0 ) return s;
                        break;
                    case 21 : 
                        int LA19_286 = input.LA(1);

                        s = -1;
                        if ( (LA19_286=='e') ) {s = 301;}

                        else if ( ((LA19_286>='\u0000' && LA19_286<='d')||(LA19_286>='f' && LA19_286<='\uFFFF')) ) {s = 36;}

                        if ( s>=0 ) return s;
                        break;
                    case 22 : 
                        int LA19_301 = input.LA(1);

                        s = -1;
                        if ( (LA19_301=='d') ) {s = 311;}

                        else if ( ((LA19_301>='\u0000' && LA19_301<='c')||(LA19_301>='e' && LA19_301<='\uFFFF')) ) {s = 36;}

                        if ( s>=0 ) return s;
                        break;
                    case 23 : 
                        int LA19_311 = input.LA(1);

                        s = -1;
                        if ( (LA19_311=='\"') ) {s = 321;}

                        else if ( ((LA19_311>='\u0000' && LA19_311<='!')||(LA19_311>='#' && LA19_311<='\uFFFF')) ) {s = 36;}

                        if ( s>=0 ) return s;
                        break;
                    case 24 : 
                        int LA19_32 = input.LA(1);

                        s = -1;
                        if ( (LA19_32=='r') ) {s = 85;}

                        else if ( ((LA19_32>='\u0000' && LA19_32<='q')||(LA19_32>='s' && LA19_32<='\uFFFF')) ) {s = 36;}

                        if ( s>=0 ) return s;
                        break;
                    case 25 : 
                        int LA19_85 = input.LA(1);

                        s = -1;
                        if ( (LA19_85=='u') ) {s = 145;}

                        else if ( ((LA19_85>='\u0000' && LA19_85<='t')||(LA19_85>='v' && LA19_85<='\uFFFF')) ) {s = 36;}

                        if ( s>=0 ) return s;
                        break;
                    case 26 : 
                        int LA19_22 = input.LA(1);

                        s = -1;
                        if ( ((LA19_22>='\u0000' && LA19_22<='\uFFFF')) ) {s = 36;}

                        else s = 24;

                        if ( s>=0 ) return s;
                        break;
                    case 27 : 
                        int LA19_145 = input.LA(1);

                        s = -1;
                        if ( (LA19_145=='e') ) {s = 192;}

                        else if ( ((LA19_145>='\u0000' && LA19_145<='d')||(LA19_145>='f' && LA19_145<='\uFFFF')) ) {s = 36;}

                        if ( s>=0 ) return s;
                        break;
                    case 28 : 
                        int LA19_192 = input.LA(1);

                        s = -1;
                        if ( (LA19_192=='\"') ) {s = 232;}

                        else if ( ((LA19_192>='\u0000' && LA19_192<='!')||(LA19_192>='#' && LA19_192<='\uFFFF')) ) {s = 36;}

                        if ( s>=0 ) return s;
                        break;
                    case 29 : 
                        int LA19_33 = input.LA(1);

                        s = -1;
                        if ( (LA19_33=='a') ) {s = 86;}

                        else if ( ((LA19_33>='\u0000' && LA19_33<='`')||(LA19_33>='b' && LA19_33<='\uFFFF')) ) {s = 36;}

                        if ( s>=0 ) return s;
                        break;
                    case 30 : 
                        int LA19_86 = input.LA(1);

                        s = -1;
                        if ( (LA19_86=='l') ) {s = 146;}

                        else if ( ((LA19_86>='\u0000' && LA19_86<='k')||(LA19_86>='m' && LA19_86<='\uFFFF')) ) {s = 36;}

                        if ( s>=0 ) return s;
                        break;
                    case 31 : 
                        int LA19_146 = input.LA(1);

                        s = -1;
                        if ( (LA19_146=='s') ) {s = 193;}

                        else if ( ((LA19_146>='\u0000' && LA19_146<='r')||(LA19_146>='t' && LA19_146<='\uFFFF')) ) {s = 36;}

                        if ( s>=0 ) return s;
                        break;
                    case 32 : 
                        int LA19_193 = input.LA(1);

                        s = -1;
                        if ( (LA19_193=='e') ) {s = 233;}

                        else if ( ((LA19_193>='\u0000' && LA19_193<='d')||(LA19_193>='f' && LA19_193<='\uFFFF')) ) {s = 36;}

                        if ( s>=0 ) return s;
                        break;
                    case 33 : 
                        int LA19_147 = input.LA(1);

                        s = -1;
                        if ( (LA19_147=='\"') ) {s = 194;}

                        else if ( ((LA19_147>='\u0000' && LA19_147<='!')||(LA19_147>='#' && LA19_147<='/')||(LA19_147>=':' && LA19_147<='@')||(LA19_147>='G' && LA19_147<='`')||(LA19_147>='g' && LA19_147<='\uFFFF')) ) {s = 36;}

                        else if ( ((LA19_147>='0' && LA19_147<='9')||(LA19_147>='A' && LA19_147<='F')||(LA19_147>='a' && LA19_147<='f')) ) {s = 147;}

                        if ( s>=0 ) return s;
                        break;
                    case 34 : 
                        int LA19_233 = input.LA(1);

                        s = -1;
                        if ( (LA19_233=='\"') ) {s = 266;}

                        else if ( ((LA19_233>='\u0000' && LA19_233<='!')||(LA19_233>='#' && LA19_233<='\uFFFF')) ) {s = 36;}

                        if ( s>=0 ) return s;
                        break;
                    case 35 : 
                        int LA19_34 = input.LA(1);

                        s = -1;
                        if ( (LA19_34=='x') ) {s = 87;}

                        else if ( (LA19_34=='.') ) {s = 88;}

                        else if ( (LA19_34=='\"') ) {s = 89;}

                        else if ( ((LA19_34>='0' && LA19_34<='9')) ) {s = 35;}

                        else if ( ((LA19_34>='\u0000' && LA19_34<='!')||(LA19_34>='#' && LA19_34<='-')||LA19_34=='/'||(LA19_34>=':' && LA19_34<='w')||(LA19_34>='y' && LA19_34<='\uFFFF')) ) {s = 36;}

                        if ( s>=0 ) return s;
                        break;
                    case 36 : 
                        int LA19_0 = input.LA(1);

                        s = -1;
                        if ( (LA19_0=='/') ) {s = 1;}

                        else if ( (LA19_0=='\"') ) {s = 2;}

                        else if ( (LA19_0=='<') ) {s = 3;}

                        else if ( (LA19_0=='n') ) {s = 4;}

                        else if ( (LA19_0=='i') ) {s = 5;}

                        else if ( (LA19_0=='r') ) {s = 6;}

                        else if ( (LA19_0=='d') ) {s = 7;}

                        else if ( (LA19_0=='>') ) {s = 8;}

                        else if ( (LA19_0=='p') ) {s = 9;}

                        else if ( (LA19_0=='a') ) {s = 10;}

                        else if ( (LA19_0=='s') ) {s = 11;}

                        else if ( (LA19_0=='b') ) {s = 12;}

                        else if ( (LA19_0=='u') ) {s = 13;}

                        else if ( (LA19_0=='c') ) {s = 14;}

                        else if ( (LA19_0=='w') ) {s = 15;}

                        else if ( (LA19_0=='h') ) {s = 16;}

                        else if ( (LA19_0=='t') ) {s = 17;}

                        else if ( (LA19_0=='0') ) {s = 18;}

                        else if ( (LA19_0=='^') ) {s = 19;}

                        else if ( ((LA19_0>='A' && LA19_0<='Z')||LA19_0=='_'||(LA19_0>='e' && LA19_0<='g')||(LA19_0>='j' && LA19_0<='m')||LA19_0=='o'||LA19_0=='q'||LA19_0=='v'||(LA19_0>='x' && LA19_0<='z')) ) {s = 20;}

                        else if ( ((LA19_0>='1' && LA19_0<='9')) ) {s = 21;}

                        else if ( (LA19_0=='\'') ) {s = 22;}

                        else if ( ((LA19_0>='\t' && LA19_0<='\n')||LA19_0=='\r'||LA19_0==' ') ) {s = 23;}

                        else if ( ((LA19_0>='\u0000' && LA19_0<='\b')||(LA19_0>='\u000B' && LA19_0<='\f')||(LA19_0>='\u000E' && LA19_0<='\u001F')||LA19_0=='!'||(LA19_0>='#' && LA19_0<='&')||(LA19_0>='(' && LA19_0<='.')||(LA19_0>=':' && LA19_0<=';')||LA19_0=='='||(LA19_0>='?' && LA19_0<='@')||(LA19_0>='[' && LA19_0<=']')||LA19_0=='`'||(LA19_0>='{' && LA19_0<='\uFFFF')) ) {s = 24;}

                        if ( s>=0 ) return s;
                        break;
                    case 37 : 
                        int LA19_88 = input.LA(1);

                        s = -1;
                        if ( ((LA19_88>='0' && LA19_88<='9')) ) {s = 148;}

                        else if ( ((LA19_88>='\u0000' && LA19_88<='/')||(LA19_88>=':' && LA19_88<='\uFFFF')) ) {s = 36;}

                        if ( s>=0 ) return s;
                        break;
                    case 38 : 
                        int LA19_2 = input.LA(1);

                        s = -1;
                        if ( (LA19_2=='l') ) {s = 28;}

                        else if ( (LA19_2=='c') ) {s = 29;}

                        else if ( (LA19_2=='r') ) {s = 30;}

                        else if ( (LA19_2=='j') ) {s = 31;}

                        else if ( (LA19_2=='t') ) {s = 32;}

                        else if ( (LA19_2=='f') ) {s = 33;}

                        else if ( (LA19_2=='0') ) {s = 34;}

                        else if ( ((LA19_2>='1' && LA19_2<='9')) ) {s = 35;}

                        else if ( ((LA19_2>='\u0000' && LA19_2<='/')||(LA19_2>=':' && LA19_2<='b')||(LA19_2>='d' && LA19_2<='e')||(LA19_2>='g' && LA19_2<='i')||LA19_2=='k'||(LA19_2>='m' && LA19_2<='q')||LA19_2=='s'||(LA19_2>='u' && LA19_2<='\uFFFF')) ) {s = 36;}

                        else s = 24;

                        if ( s>=0 ) return s;
                        break;
                    case 39 : 
                        int LA19_87 = input.LA(1);

                        s = -1;
                        if ( ((LA19_87>='0' && LA19_87<='9')||(LA19_87>='A' && LA19_87<='F')||(LA19_87>='a' && LA19_87<='f')) ) {s = 147;}

                        else if ( ((LA19_87>='\u0000' && LA19_87<='/')||(LA19_87>=':' && LA19_87<='@')||(LA19_87>='G' && LA19_87<='`')||(LA19_87>='g' && LA19_87<='\uFFFF')) ) {s = 36;}

                        if ( s>=0 ) return s;
                        break;
                    case 40 : 
                        int LA19_35 = input.LA(1);

                        s = -1;
                        if ( (LA19_35=='.') ) {s = 88;}

                        else if ( (LA19_35=='\"') ) {s = 89;}

                        else if ( ((LA19_35>='0' && LA19_35<='9')) ) {s = 35;}

                        else if ( ((LA19_35>='\u0000' && LA19_35<='!')||(LA19_35>='#' && LA19_35<='-')||LA19_35=='/'||(LA19_35>=':' && LA19_35<='\uFFFF')) ) {s = 36;}

                        if ( s>=0 ) return s;
                        break;
                    case 41 : 
                        int LA19_148 = input.LA(1);

                        s = -1;
                        if ( (LA19_148=='\"') ) {s = 195;}

                        else if ( ((LA19_148>='0' && LA19_148<='9')) ) {s = 148;}

                        else if ( ((LA19_148>='\u0000' && LA19_148<='!')||(LA19_148>='#' && LA19_148<='/')||(LA19_148>=':' && LA19_148<='\uFFFF')) ) {s = 36;}

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