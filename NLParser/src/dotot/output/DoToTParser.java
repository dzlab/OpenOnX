// $ANTLR 3.4 H:\\PhD\\Articles\\DoToT\\language\\DoToT.g 2012-06-26 17:13:10

	package dotot.output;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked"})
public class DoToTParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "IDENTIFIER", "ME", "ON", "TO", "WORD", "WS", "'are'", "'i'", "'is'", "'this'", "'was'"
    };

    public static final int EOF=-1;
    public static final int T__10=10;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int IDENTIFIER=4;
    public static final int ME=5;
    public static final int ON=6;
    public static final int TO=7;
    public static final int WORD=8;
    public static final int WS=9;

    // delegates
    public Parser[] getDelegates() {
        return new Parser[] {};
    }

    // delegators


    public DoToTParser(TokenStream input) {
        this(input, new RecognizerSharedState());
    }
    public DoToTParser(TokenStream input, RecognizerSharedState state) {
        super(input, state);
    }

    public String[] getTokenNames() { return DoToTParser.tokenNames; }
    public String getGrammarFileName() { return "H:\\PhD\\Articles\\DoToT\\language\\DoToT.g"; }


        	Interpreter interp;
       	public DoToTParser(TokenStream input, Interpreter interp) {
            	this(input);
            	this.interp = interp;
        	}



    // $ANTLR start "rule"
    // H:\\PhD\\Articles\\DoToT\\language\\DoToT.g:18:1: rule : ( 'this' ( 'is' | 'was' ) IDENTIFIER WORD | option service argument ON event );
    public final void rule() throws RecognitionException {
        Service service1 =null;

        String option2 =null;

        Argument argument3 =null;


        try {
            // H:\\PhD\\Articles\\DoToT\\language\\DoToT.g:18:7: ( 'this' ( 'is' | 'was' ) IDENTIFIER WORD | option service argument ON event )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==13) ) {
                alt1=1;
            }
            else if ( (LA1_0==WORD) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;

            }
            switch (alt1) {
                case 1 :
                    // H:\\PhD\\Articles\\DoToT\\language\\DoToT.g:18:9: 'this' ( 'is' | 'was' ) IDENTIFIER WORD
                    {
                    match(input,13,FOLLOW_13_in_rule30); 

                    if ( input.LA(1)==12||input.LA(1)==14 ) {
                        input.consume();
                        state.errorRecovery=false;
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }


                    match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_rule38); 

                    match(input,WORD,FOLLOW_WORD_in_rule40); 

                    }
                    break;
                case 2 :
                    // H:\\PhD\\Articles\\DoToT\\language\\DoToT.g:19:5: option service argument ON event
                    {
                    pushFollow(FOLLOW_option_in_rule46);
                    option2=option();

                    state._fsp--;


                    pushFollow(FOLLOW_service_in_rule48);
                    service1=service();

                    state._fsp--;


                    pushFollow(FOLLOW_argument_in_rule50);
                    argument3=argument();

                    state._fsp--;


                    match(input,ON,FOLLOW_ON_in_rule52); 

                    pushFollow(FOLLOW_event_in_rule54);
                    event();

                    state._fsp--;



                    		Service service = service1;
                    		service.setOption(option2); service.setArgument(argument3); 
                    		service.execute();
                    	   

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "rule"



    // $ANTLR start "option"
    // H:\\PhD\\Articles\\DoToT\\language\\DoToT.g:27:1: option returns [String value] : ( WORD )? ;
    public final String option() throws RecognitionException {
        String value = null;


        Token WORD4=null;

        try {
            // H:\\PhD\\Articles\\DoToT\\language\\DoToT.g:28:2: ( ( WORD )? )
            // H:\\PhD\\Articles\\DoToT\\language\\DoToT.g:28:7: ( WORD )?
            {
            // H:\\PhD\\Articles\\DoToT\\language\\DoToT.g:28:7: ( WORD )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==WORD) ) {
                int LA2_1 = input.LA(2);

                if ( (LA2_1==WORD) ) {
                    alt2=1;
                }
            }
            switch (alt2) {
                case 1 :
                    // H:\\PhD\\Articles\\DoToT\\language\\DoToT.g:28:7: WORD
                    {
                    WORD4=(Token)match(input,WORD,FOLLOW_WORD_in_option85); 

                    }
                    break;

            }


            value = (WORD4!=null?WORD4.getText():null);

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return value;
    }
    // $ANTLR end "option"



    // $ANTLR start "service"
    // H:\\PhD\\Articles\\DoToT\\language\\DoToT.g:32:1: service returns [Service ref] : WORD ;
    public final Service service() throws RecognitionException {
        Service ref = null;


        Token WORD5=null;

        try {
            // H:\\PhD\\Articles\\DoToT\\language\\DoToT.g:33:2: ( WORD )
            // H:\\PhD\\Articles\\DoToT\\language\\DoToT.g:33:4: WORD
            {
            WORD5=(Token)match(input,WORD,FOLLOW_WORD_in_service106); 

            ref = interp.getServicebyName((WORD5!=null?WORD5.getText():null));

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ref;
    }
    // $ANTLR end "service"



    // $ANTLR start "destination"
    // H:\\PhD\\Articles\\DoToT\\language\\DoToT.g:37:1: destination returns [Destination ref] : ( ME | ( TO )? IDENTIFIER ( WORD )? );
    public final Destination destination() throws RecognitionException {
        Destination ref = null;


        Token ME6=null;
        Token IDENTIFIER7=null;
        Token WORD8=null;

         ref = new Destination(); 
        try {
            // H:\\PhD\\Articles\\DoToT\\language\\DoToT.g:39:2: ( ME | ( TO )? IDENTIFIER ( WORD )? )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==ME) ) {
                alt5=1;
            }
            else if ( (LA5_0==IDENTIFIER||LA5_0==TO) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;

            }
            switch (alt5) {
                case 1 :
                    // H:\\PhD\\Articles\\DoToT\\language\\DoToT.g:39:4: ME
                    {
                    ME6=(Token)match(input,ME,FOLLOW_ME_in_destination133); 

                    ref.setIdentifier((ME6!=null?ME6.getText():null));

                    }
                    break;
                case 2 :
                    // H:\\PhD\\Articles\\DoToT\\language\\DoToT.g:41:5: ( TO )? IDENTIFIER ( WORD )?
                    {
                    // H:\\PhD\\Articles\\DoToT\\language\\DoToT.g:41:5: ( TO )?
                    int alt3=2;
                    int LA3_0 = input.LA(1);

                    if ( (LA3_0==TO) ) {
                        alt3=1;
                    }
                    switch (alt3) {
                        case 1 :
                            // H:\\PhD\\Articles\\DoToT\\language\\DoToT.g:41:5: TO
                            {
                            match(input,TO,FOLLOW_TO_in_destination168); 

                            }
                            break;

                    }


                    IDENTIFIER7=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_destination171); 

                    // H:\\PhD\\Articles\\DoToT\\language\\DoToT.g:41:20: ( WORD )?
                    int alt4=2;
                    int LA4_0 = input.LA(1);

                    if ( (LA4_0==WORD) ) {
                        alt4=1;
                    }
                    switch (alt4) {
                        case 1 :
                            // H:\\PhD\\Articles\\DoToT\\language\\DoToT.g:41:21: WORD
                            {
                            WORD8=(Token)match(input,WORD,FOLLOW_WORD_in_destination174); 

                            }
                            break;

                    }


                    ref.setIdentifier((IDENTIFIER7!=null?IDENTIFIER7.getText():null)); ref.setComplement((WORD8!=null?WORD8.getText():null));

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ref;
    }
    // $ANTLR end "destination"



    // $ANTLR start "event"
    // H:\\PhD\\Articles\\DoToT\\language\\DoToT.g:45:1: event : ( condition | action );
    public final void event() throws RecognitionException {
        try {
            // H:\\PhD\\Articles\\DoToT\\language\\DoToT.g:45:7: ( condition | action )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==IDENTIFIER) ) {
                alt6=1;
            }
            else if ( (LA6_0==WORD||LA6_0==11) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;

            }
            switch (alt6) {
                case 1 :
                    // H:\\PhD\\Articles\\DoToT\\language\\DoToT.g:45:9: condition
                    {
                    pushFollow(FOLLOW_condition_in_event192);
                    condition();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // H:\\PhD\\Articles\\DoToT\\language\\DoToT.g:45:21: action
                    {
                    pushFollow(FOLLOW_action_in_event196);
                    action();

                    state._fsp--;


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "event"



    // $ANTLR start "condition"
    // H:\\PhD\\Articles\\DoToT\\language\\DoToT.g:47:1: condition : IDENTIFIER attribute ;
    public final void condition() throws RecognitionException {
        try {
            // H:\\PhD\\Articles\\DoToT\\language\\DoToT.g:48:2: ( IDENTIFIER attribute )
            // H:\\PhD\\Articles\\DoToT\\language\\DoToT.g:48:4: IDENTIFIER attribute
            {
            match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_condition205); 

            pushFollow(FOLLOW_attribute_in_condition207);
            attribute();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "condition"



    // $ANTLR start "action"
    // H:\\PhD\\Articles\\DoToT\\language\\DoToT.g:50:1: action : ( subject verb object | subject isin state );
    public final void action() throws RecognitionException {
        try {
            // H:\\PhD\\Articles\\DoToT\\language\\DoToT.g:50:8: ( subject verb object | subject isin state )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==WORD||LA7_0==11) ) {
                int LA7_1 = input.LA(2);

                if ( (LA7_1==WORD) ) {
                    alt7=1;
                }
                else if ( (LA7_1==10||LA7_1==12) ) {
                    alt7=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 7, 1, input);

                    throw nvae;

                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;

            }
            switch (alt7) {
                case 1 :
                    // H:\\PhD\\Articles\\DoToT\\language\\DoToT.g:50:10: subject verb object
                    {
                    pushFollow(FOLLOW_subject_in_action215);
                    subject();

                    state._fsp--;


                    pushFollow(FOLLOW_verb_in_action217);
                    verb();

                    state._fsp--;


                    pushFollow(FOLLOW_object_in_action219);
                    object();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // H:\\PhD\\Articles\\DoToT\\language\\DoToT.g:50:32: subject isin state
                    {
                    pushFollow(FOLLOW_subject_in_action223);
                    subject();

                    state._fsp--;


                    pushFollow(FOLLOW_isin_in_action225);
                    isin();

                    state._fsp--;


                    pushFollow(FOLLOW_state_in_action227);
                    state();

                    state._fsp--;


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "action"



    // $ANTLR start "subject"
    // H:\\PhD\\Articles\\DoToT\\language\\DoToT.g:52:1: subject : ( 'i' | WORD );
    public final void subject() throws RecognitionException {
        try {
            // H:\\PhD\\Articles\\DoToT\\language\\DoToT.g:52:9: ( 'i' | WORD )
            // H:\\PhD\\Articles\\DoToT\\language\\DoToT.g:
            {
            if ( input.LA(1)==WORD||input.LA(1)==11 ) {
                input.consume();
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "subject"



    // $ANTLR start "verb"
    // H:\\PhD\\Articles\\DoToT\\language\\DoToT.g:54:1: verb : WORD ;
    public final void verb() throws RecognitionException {
        try {
            // H:\\PhD\\Articles\\DoToT\\language\\DoToT.g:54:6: ( WORD )
            // H:\\PhD\\Articles\\DoToT\\language\\DoToT.g:54:8: WORD
            {
            match(input,WORD,FOLLOW_WORD_in_verb247); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "verb"



    // $ANTLR start "object"
    // H:\\PhD\\Articles\\DoToT\\language\\DoToT.g:56:1: object returns [Context ref] : WORD ;
    public final ActionObject object() throws RecognitionException {
    	ActionObject ref = null;


        Token WORD9=null;

        try {
            // H:\\PhD\\Articles\\DoToT\\language\\DoToT.g:57:2: ( WORD )
            // H:\\PhD\\Articles\\DoToT\\language\\DoToT.g:57:4: WORD
            {
            WORD9=(Token)match(input,WORD,FOLLOW_WORD_in_object260); 

            ref = interp.getObjectbyName((WORD9!=null?WORD9.getText():null));

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ref;
    }
    // $ANTLR end "object"



    // $ANTLR start "isin"
    // H:\\PhD\\Articles\\DoToT\\language\\DoToT.g:61:1: isin : ( 'is' | 'are' );
    public final void isin() throws RecognitionException {
        try {
            // H:\\PhD\\Articles\\DoToT\\language\\DoToT.g:61:6: ( 'is' | 'are' )
            // H:\\PhD\\Articles\\DoToT\\language\\DoToT.g:
            {
            if ( input.LA(1)==10||input.LA(1)==12 ) {
                input.consume();
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "isin"



    // $ANTLR start "state"
    // H:\\PhD\\Articles\\DoToT\\language\\DoToT.g:63:1: state returns [Context ref] : WORD ;
    public final ActionObject state() throws RecognitionException {
    	ActionObject ref = null;


        Token WORD10=null;

        try {
            // H:\\PhD\\Articles\\DoToT\\language\\DoToT.g:64:2: ( WORD )
            // H:\\PhD\\Articles\\DoToT\\language\\DoToT.g:64:4: WORD
            {
            WORD10=(Token)match(input,WORD,FOLLOW_WORD_in_state293); 

            ref = interp.getObjectbyName((WORD10!=null?WORD10.getText():null));

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ref;
    }
    // $ANTLR end "state"



    // $ANTLR start "attribute"
    // H:\\PhD\\Articles\\DoToT\\language\\DoToT.g:68:1: attribute : WORD ;
    public final void attribute() throws RecognitionException {
        try {
            // H:\\PhD\\Articles\\DoToT\\language\\DoToT.g:69:2: ( WORD )
            // H:\\PhD\\Articles\\DoToT\\language\\DoToT.g:69:4: WORD
            {
            match(input,WORD,FOLLOW_WORD_in_attribute309); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "attribute"



    // $ANTLR start "argument"
    // H:\\PhD\\Articles\\DoToT\\language\\DoToT.g:71:1: argument returns [Argument ref] : ( destination text | text ( destination )? );
    public final Argument argument() throws RecognitionException {
        Argument ref = null;


        Destination destination11 =null;

        String text12 =null;

        Destination destination13 =null;

        String text14 =null;


         ref = new Argument(); 
        try {
            // H:\\PhD\\Articles\\DoToT\\language\\DoToT.g:73:2: ( destination text | text ( destination )? )
            int alt9=2;
            switch ( input.LA(1) ) {
            case ME:
                {
                alt9=1;
                }
                break;
            case TO:
                {
                int LA9_2 = input.LA(2);

                if ( (LA9_2==IDENTIFIER) ) {
                    alt9=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 9, 2, input);

                    throw nvae;

                }
                }
                break;
            case IDENTIFIER:
                {
                alt9=1;
                }
                break;
            case ON:
            case WORD:
                {
                alt9=2;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;

            }

            switch (alt9) {
                case 1 :
                    // H:\\PhD\\Articles\\DoToT\\language\\DoToT.g:73:4: destination text
                    {
                    pushFollow(FOLLOW_destination_in_argument328);
                    destination11=destination();

                    state._fsp--;


                    pushFollow(FOLLOW_text_in_argument330);
                    text12=text();

                    state._fsp--;


                    ref.setDestination(destination11); ref.setText(text12);

                    }
                    break;
                case 2 :
                    // H:\\PhD\\Articles\\DoToT\\language\\DoToT.g:75:10: text ( destination )?
                    {
                    pushFollow(FOLLOW_text_in_argument348);
                    text14=text();

                    state._fsp--;


                    // H:\\PhD\\Articles\\DoToT\\language\\DoToT.g:75:15: ( destination )?
                    int alt8=2;
                    int LA8_0 = input.LA(1);

                    if ( ((LA8_0 >= IDENTIFIER && LA8_0 <= ME)||LA8_0==TO) ) {
                        alt8=1;
                    }
                    switch (alt8) {
                        case 1 :
                            // H:\\PhD\\Articles\\DoToT\\language\\DoToT.g:75:15: destination
                            {
                            pushFollow(FOLLOW_destination_in_argument350);
                            destination13=destination();

                            state._fsp--;


                            }
                            break;

                    }


                    ref.setDestination(destination13); ref.setText(text14);

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ref;
    }
    // $ANTLR end "argument"



    // $ANTLR start "text"
    // H:\\PhD\\Articles\\DoToT\\language\\DoToT.g:79:1: text returns [String value] : ( WORD txt= text |);
    public final String text() throws RecognitionException {
        String value = null;


        Token WORD15=null;
        String txt =null;


        try {
            // H:\\PhD\\Articles\\DoToT\\language\\DoToT.g:80:2: ( WORD txt= text |)
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==WORD) ) {
                alt10=1;
            }
            else if ( ((LA10_0 >= IDENTIFIER && LA10_0 <= TO)) ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;

            }
            switch (alt10) {
                case 1 :
                    // H:\\PhD\\Articles\\DoToT\\language\\DoToT.g:80:4: WORD txt= text
                    {
                    WORD15=(Token)match(input,WORD,FOLLOW_WORD_in_text372); 

                    pushFollow(FOLLOW_text_in_text376);
                    txt=text();

                    state._fsp--;


                    value = (WORD15!=null?WORD15.getText():null) + " " + txt; 

                    }
                    break;
                case 2 :
                    // H:\\PhD\\Articles\\DoToT\\language\\DoToT.g:82:5: 
                    {
                    value = "";

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return value;
    }
    // $ANTLR end "text"

    // Delegated rules


 

    public static final BitSet FOLLOW_13_in_rule30 = new BitSet(new long[]{0x0000000000005000L});
    public static final BitSet FOLLOW_set_in_rule32 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_IDENTIFIER_in_rule38 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_WORD_in_rule40 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_option_in_rule46 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_service_in_rule48 = new BitSet(new long[]{0x00000000000001B0L});
    public static final BitSet FOLLOW_argument_in_rule50 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_ON_in_rule52 = new BitSet(new long[]{0x0000000000000910L});
    public static final BitSet FOLLOW_event_in_rule54 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WORD_in_option85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WORD_in_service106 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ME_in_destination133 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TO_in_destination168 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_IDENTIFIER_in_destination171 = new BitSet(new long[]{0x0000000000000102L});
    public static final BitSet FOLLOW_WORD_in_destination174 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_condition_in_event192 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_action_in_event196 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_condition205 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_attribute_in_condition207 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_subject_in_action215 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_verb_in_action217 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_object_in_action219 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_subject_in_action223 = new BitSet(new long[]{0x0000000000001400L});
    public static final BitSet FOLLOW_isin_in_action225 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_state_in_action227 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WORD_in_verb247 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WORD_in_object260 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WORD_in_state293 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WORD_in_attribute309 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_destination_in_argument328 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_text_in_argument330 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_text_in_argument348 = new BitSet(new long[]{0x00000000000000B2L});
    public static final BitSet FOLLOW_destination_in_argument350 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WORD_in_text372 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_text_in_text376 = new BitSet(new long[]{0x0000000000000002L});

}