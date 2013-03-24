// $ANTLR 3.4 C:\\env\\Compilers\\ANTLR\\examples\\OnX\\OnX.g 2012-07-17 17:24:03

	package org.onx.antlr;
	import org.onx.antlr.pojo.User;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked"})
public class OnXParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "IDENTIFIER", "ME", "ON", "TO", "WORD", "'\\''", "'\\'s'", "'is'", "'this'", "'was'"
    };

    public static final int EOF=-1;
    public static final int T__9=9;
    public static final int T__10=10;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int IDENTIFIER=4;
    public static final int ME=5;
    public static final int ON=6;
    public static final int TO=7;
    public static final int WORD=8;

    // delegates
    public Parser[] getDelegates() {
        return new Parser[] {};
    }

    // delegators


    public OnXParser(TokenStream input) {
        this(input, new RecognizerSharedState());
    }
    public OnXParser(TokenStream input, RecognizerSharedState state) {
        super(input, state);
    }

    public String[] getTokenNames() { return OnXParser.tokenNames; }
    public String getGrammarFileName() { return "C:\\env\\Compilers\\ANTLR\\examples\\OnX\\OnX.g"; }


        	Interpreter interp;
       	public OnXParser(TokenStream input, Interpreter interp) {
            	this(input);
            	this.interp = interp;
        	}



    // $ANTLR start "rule"
    // C:\\env\\Compilers\\ANTLR\\examples\\OnX\\OnX.g:20:1: rule : ( 'this' ( 'is' | 'was' ) (id= IDENTIFIER |id= WORD )? context= WORD | option service destination argument ON event );
    public final void rule() throws RecognitionException {
        Token id=null;
        Token context=null;
        String event1 =null;

        String option2 =null;

        String service3 =null;

        User destination4 =null;

        String argument5 =null;


        try {
            // C:\\env\\Compilers\\ANTLR\\examples\\OnX\\OnX.g:20:6: ( 'this' ( 'is' | 'was' ) (id= IDENTIFIER |id= WORD )? context= WORD | option service destination argument ON event )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==12) ) {
                alt2=1;
            }
            else if ( (LA2_0==WORD) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;

            }
            switch (alt2) {
                case 1 :
                    // C:\\env\\Compilers\\ANTLR\\examples\\OnX\\OnX.g:20:8: 'this' ( 'is' | 'was' ) (id= IDENTIFIER |id= WORD )? context= WORD
                    {
                    match(input,12,FOLLOW_12_in_rule30); 

                    if ( input.LA(1)==11||input.LA(1)==13 ) {
                        input.consume();
                        state.errorRecovery=false;
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }


                    // C:\\env\\Compilers\\ANTLR\\examples\\OnX\\OnX.g:20:28: (id= IDENTIFIER |id= WORD )?
                    int alt1=3;
                    int LA1_0 = input.LA(1);

                    if ( (LA1_0==IDENTIFIER) ) {
                        alt1=1;
                    }
                    else if ( (LA1_0==WORD) ) {
                        int LA1_2 = input.LA(2);

                        if ( (LA1_2==WORD) ) {
                            alt1=2;
                        }
                    }
                    switch (alt1) {
                        case 1 :
                            // C:\\env\\Compilers\\ANTLR\\examples\\OnX\\OnX.g:20:29: id= IDENTIFIER
                            {
                            id=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_rule41); 

                            }
                            break;
                        case 2 :
                            // C:\\env\\Compilers\\ANTLR\\examples\\OnX\\OnX.g:20:43: id= WORD
                            {
                            id=(Token)match(input,WORD,FOLLOW_WORD_in_rule45); 

                            }
                            break;

                    }


                    context=(Token)match(input,WORD,FOLLOW_WORD_in_rule51); 

                    interp.checkIn((id!=null?id.getText():null), (context!=null?context.getText():null));

                    }
                    break;
                case 2 :
                    // C:\\env\\Compilers\\ANTLR\\examples\\OnX\\OnX.g:23:4: option service destination argument ON event
                    {
                    pushFollow(FOLLOW_option_in_rule63);
                    option2=option();

                    state._fsp--;


                    pushFollow(FOLLOW_service_in_rule65);
                    service3=service();

                    state._fsp--;


                    pushFollow(FOLLOW_destination_in_rule67);
                    destination4=destination();

                    state._fsp--;


                    pushFollow(FOLLOW_argument_in_rule69);
                    argument5=argument();

                    state._fsp--;


                    match(input,ON,FOLLOW_ON_in_rule71); 

                    pushFollow(FOLLOW_event_in_rule73);
                    event1=event();

                    state._fsp--;


                    interp.schedule(event1, option2, service3, destination4, argument5);

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
    // C:\\env\\Compilers\\ANTLR\\examples\\OnX\\OnX.g:27:1: option returns [String value] : WORD ;
    public final String option() throws RecognitionException {
        String value = null;


        Token WORD6=null;

        try {
            // C:\\env\\Compilers\\ANTLR\\examples\\OnX\\OnX.g:28:2: ( WORD )
            // C:\\env\\Compilers\\ANTLR\\examples\\OnX\\OnX.g:28:4: WORD
            {
            WORD6=(Token)match(input,WORD,FOLLOW_WORD_in_option94); 

            value = (WORD6!=null?WORD6.getText():null);

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
    // C:\\env\\Compilers\\ANTLR\\examples\\OnX\\OnX.g:32:1: service returns [String value] : ( WORD )? ;
    public final String service() throws RecognitionException {
        String value = null;


        Token WORD7=null;

        try {
            // C:\\env\\Compilers\\ANTLR\\examples\\OnX\\OnX.g:33:2: ( ( WORD )? )
            // C:\\env\\Compilers\\ANTLR\\examples\\OnX\\OnX.g:33:4: ( WORD )?
            {
            // C:\\env\\Compilers\\ANTLR\\examples\\OnX\\OnX.g:33:4: ( WORD )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==WORD) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // C:\\env\\Compilers\\ANTLR\\examples\\OnX\\OnX.g:33:4: WORD
                    {
                    WORD7=(Token)match(input,WORD,FOLLOW_WORD_in_service115); 

                    }
                    break;

            }


            value = (WORD7!=null?WORD7.getText():null);

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
    // $ANTLR end "service"



    // $ANTLR start "destination"
    // C:\\env\\Compilers\\ANTLR\\examples\\OnX\\OnX.g:37:1: destination returns [User ref] : ( ME | TO ME | TO WORD | ( TO )? IDENTIFIER WORD );
    public final User destination() throws RecognitionException {
        User ref = null;


        Token ME8=null;
        Token ME9=null;
        Token WORD10=null;
        Token WORD11=null;

        try {
            // C:\\env\\Compilers\\ANTLR\\examples\\OnX\\OnX.g:38:2: ( ME | TO ME | TO WORD | ( TO )? IDENTIFIER WORD )
            int alt5=4;
            switch ( input.LA(1) ) {
            case ME:
                {
                alt5=1;
                }
                break;
            case TO:
                {
                switch ( input.LA(2) ) {
                case ME:
                    {
                    alt5=2;
                    }
                    break;
                case WORD:
                    {
                    alt5=3;
                    }
                    break;
                case IDENTIFIER:
                    {
                    alt5=4;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 5, 2, input);

                    throw nvae;

                }

                }
                break;
            case IDENTIFIER:
                {
                alt5=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;

            }

            switch (alt5) {
                case 1 :
                    // C:\\env\\Compilers\\ANTLR\\examples\\OnX\\OnX.g:38:4: ME
                    {
                    ME8=(Token)match(input,ME,FOLLOW_ME_in_destination136); 

                    ref = interp.getUser((ME8!=null?ME8.getText():null));

                    }
                    break;
                case 2 :
                    // C:\\env\\Compilers\\ANTLR\\examples\\OnX\\OnX.g:40:5: TO ME
                    {
                    match(input,TO,FOLLOW_TO_in_destination147); 

                    ME9=(Token)match(input,ME,FOLLOW_ME_in_destination149); 

                    ref = interp.getUser((ME9!=null?ME9.getText():null));

                    }
                    break;
                case 3 :
                    // C:\\env\\Compilers\\ANTLR\\examples\\OnX\\OnX.g:42:4: TO WORD
                    {
                    match(input,TO,FOLLOW_TO_in_destination159); 

                    WORD10=(Token)match(input,WORD,FOLLOW_WORD_in_destination161); 

                    ref = interp.getUser((WORD10!=null?WORD10.getText():null));

                    }
                    break;
                case 4 :
                    // C:\\env\\Compilers\\ANTLR\\examples\\OnX\\OnX.g:44:5: ( TO )? IDENTIFIER WORD
                    {
                    // C:\\env\\Compilers\\ANTLR\\examples\\OnX\\OnX.g:44:5: ( TO )?
                    int alt4=2;
                    int LA4_0 = input.LA(1);

                    if ( (LA4_0==TO) ) {
                        alt4=1;
                    }
                    switch (alt4) {
                        case 1 :
                            // C:\\env\\Compilers\\ANTLR\\examples\\OnX\\OnX.g:44:5: TO
                            {
                            match(input,TO,FOLLOW_TO_in_destination171); 

                            }
                            break;

                    }


                    match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_destination174); 

                    WORD11=(Token)match(input,WORD,FOLLOW_WORD_in_destination176); 

                    ref = interp.getUser((WORD11!=null?WORD11.getText():null));

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



    // $ANTLR start "argument"
    // C:\\env\\Compilers\\ANTLR\\examples\\OnX\\OnX.g:48:1: argument returns [String value] : ( WORD )* ;
    public final String argument() throws RecognitionException {
        String value = null;


        Token WORD12=null;

        try {
            // C:\\env\\Compilers\\ANTLR\\examples\\OnX\\OnX.g:49:2: ( ( WORD )* )
            // C:\\env\\Compilers\\ANTLR\\examples\\OnX\\OnX.g:49:4: ( WORD )*
            {
            // C:\\env\\Compilers\\ANTLR\\examples\\OnX\\OnX.g:49:4: ( WORD )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==WORD) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // C:\\env\\Compilers\\ANTLR\\examples\\OnX\\OnX.g:49:4: WORD
            	    {
            	    WORD12=(Token)match(input,WORD,FOLLOW_WORD_in_argument199); 

            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);


            value = (WORD12!=null?WORD12.getText():null);

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
    // $ANTLR end "argument"



    // $ANTLR start "event"
    // C:\\env\\Compilers\\ANTLR\\examples\\OnX\\OnX.g:53:1: event returns [String type] : direction= WORD ( '\\'s' | '\\'' )? state= WORD ;
    public final String event() throws RecognitionException {
        String type = null;


        Token direction=null;
        Token state=null;

        try {
            // C:\\env\\Compilers\\ANTLR\\examples\\OnX\\OnX.g:54:2: (direction= WORD ( '\\'s' | '\\'' )? state= WORD )
            // C:\\env\\Compilers\\ANTLR\\examples\\OnX\\OnX.g:54:4: direction= WORD ( '\\'s' | '\\'' )? state= WORD
            {
            direction=(Token)match(input,WORD,FOLLOW_WORD_in_event223); 

            // C:\\env\\Compilers\\ANTLR\\examples\\OnX\\OnX.g:54:19: ( '\\'s' | '\\'' )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( ((LA7_0 >= 9 && LA7_0 <= 10)) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // C:\\env\\Compilers\\ANTLR\\examples\\OnX\\OnX.g:
                    {
                    if ( (input.LA(1) >= 9 && input.LA(1) <= 10) ) {
                        input.consume();
                        //TODO OnXParser: un-comment state.errorRecovery=false; 
                        //state.errorRecovery=false;
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }


                    }
                    break;

            }


            state=(Token)match(input,WORD,FOLLOW_WORD_in_event234); 

            type = (direction!=null?direction.getText():null)+"_"+(state!=null?state.getText():null);

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return type;
    }
    // $ANTLR end "event"

    // Delegated rules


 

    public static final BitSet FOLLOW_12_in_rule30 = new BitSet(new long[]{0x0000000000002800L});
    public static final BitSet FOLLOW_set_in_rule32 = new BitSet(new long[]{0x0000000000000110L});
    public static final BitSet FOLLOW_IDENTIFIER_in_rule41 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_WORD_in_rule45 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_WORD_in_rule51 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_option_in_rule63 = new BitSet(new long[]{0x00000000000001B0L});
    public static final BitSet FOLLOW_service_in_rule65 = new BitSet(new long[]{0x00000000000000B0L});
    public static final BitSet FOLLOW_destination_in_rule67 = new BitSet(new long[]{0x0000000000000140L});
    public static final BitSet FOLLOW_argument_in_rule69 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_ON_in_rule71 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_event_in_rule73 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WORD_in_option94 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WORD_in_service115 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ME_in_destination136 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TO_in_destination147 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ME_in_destination149 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TO_in_destination159 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_WORD_in_destination161 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TO_in_destination171 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_IDENTIFIER_in_destination174 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_WORD_in_destination176 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WORD_in_argument199 = new BitSet(new long[]{0x0000000000000102L});
    public static final BitSet FOLLOW_WORD_in_event223 = new BitSet(new long[]{0x0000000000000700L});
    public static final BitSet FOLLOW_WORD_in_event234 = new BitSet(new long[]{0x0000000000000002L});

}