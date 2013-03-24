// $ANTLR 3.4 C:\\env\\Compilers\\ANTLR\\examples\\OnX\\OnX.g 2012-07-17 17:24:03

	package org.onx.antlr;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked"})
public class OnXLexer extends Lexer {
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
    // delegators
    public Lexer[] getDelegates() {
        return new Lexer[] {};
    }

    public OnXLexer() {} 
    public OnXLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public OnXLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);
    }
    public String getGrammarFileName() { return "C:\\env\\Compilers\\ANTLR\\examples\\OnX\\OnX.g"; }

    // $ANTLR start "T__9"
    public final void mT__9() throws RecognitionException {
        try {
            int _type = T__9;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\env\\Compilers\\ANTLR\\examples\\OnX\\OnX.g:6:6: ( '\\'' )
            // C:\\env\\Compilers\\ANTLR\\examples\\OnX\\OnX.g:6:8: '\\''
            {
            match('\''); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__9"

    // $ANTLR start "T__10"
    public final void mT__10() throws RecognitionException {
        try {
            int _type = T__10;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\env\\Compilers\\ANTLR\\examples\\OnX\\OnX.g:7:7: ( '\\'s' )
            // C:\\env\\Compilers\\ANTLR\\examples\\OnX\\OnX.g:7:9: '\\'s'
            {
            match("'s"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__10"

    // $ANTLR start "T__11"
    public final void mT__11() throws RecognitionException {
        try {
            int _type = T__11;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\env\\Compilers\\ANTLR\\examples\\OnX\\OnX.g:8:7: ( 'is' )
            // C:\\env\\Compilers\\ANTLR\\examples\\OnX\\OnX.g:8:9: 'is'
            {
            match("is"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__11"

    // $ANTLR start "T__12"
    public final void mT__12() throws RecognitionException {
        try {
            int _type = T__12;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\env\\Compilers\\ANTLR\\examples\\OnX\\OnX.g:9:7: ( 'this' )
            // C:\\env\\Compilers\\ANTLR\\examples\\OnX\\OnX.g:9:9: 'this'
            {
            match("this"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__12"

    // $ANTLR start "T__13"
    public final void mT__13() throws RecognitionException {
        try {
            int _type = T__13;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\env\\Compilers\\ANTLR\\examples\\OnX\\OnX.g:10:7: ( 'was' )
            // C:\\env\\Compilers\\ANTLR\\examples\\OnX\\OnX.g:10:9: 'was'
            {
            match("was"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__13"

    // $ANTLR start "ME"
    public final void mME() throws RecognitionException {
        try {
            int _type = ME;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\env\\Compilers\\ANTLR\\examples\\OnX\\OnX.g:66:4: ( 'me' )
            // C:\\env\\Compilers\\ANTLR\\examples\\OnX\\OnX.g:66:6: 'me'
            {
            match("me"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "ME"

    // $ANTLR start "TO"
    public final void mTO() throws RecognitionException {
        try {
            int _type = TO;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\env\\Compilers\\ANTLR\\examples\\OnX\\OnX.g:69:4: ( 'to' )
            // C:\\env\\Compilers\\ANTLR\\examples\\OnX\\OnX.g:69:6: 'to'
            {
            match("to"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "TO"

    // $ANTLR start "IDENTIFIER"
    public final void mIDENTIFIER() throws RecognitionException {
        try {
            int _type = IDENTIFIER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\env\\Compilers\\ANTLR\\examples\\OnX\\OnX.g:73:2: ( 'my' | 'his' | 'her' | 'our' | 'their' )
            int alt1=5;
            switch ( input.LA(1) ) {
            case 'm':
                {
                alt1=1;
                }
                break;
            case 'h':
                {
                int LA1_2 = input.LA(2);

                if ( (LA1_2=='i') ) {
                    alt1=2;
                }
                else if ( (LA1_2=='e') ) {
                    alt1=3;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 1, 2, input);

                    throw nvae;

                }
                }
                break;
            case 'o':
                {
                alt1=4;
                }
                break;
            case 't':
                {
                alt1=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;

            }

            switch (alt1) {
                case 1 :
                    // C:\\env\\Compilers\\ANTLR\\examples\\OnX\\OnX.g:73:4: 'my'
                    {
                    match("my"); 



                    }
                    break;
                case 2 :
                    // C:\\env\\Compilers\\ANTLR\\examples\\OnX\\OnX.g:73:9: 'his'
                    {
                    match("his"); 



                    }
                    break;
                case 3 :
                    // C:\\env\\Compilers\\ANTLR\\examples\\OnX\\OnX.g:73:15: 'her'
                    {
                    match("her"); 



                    }
                    break;
                case 4 :
                    // C:\\env\\Compilers\\ANTLR\\examples\\OnX\\OnX.g:73:21: 'our'
                    {
                    match("our"); 



                    }
                    break;
                case 5 :
                    // C:\\env\\Compilers\\ANTLR\\examples\\OnX\\OnX.g:73:27: 'their'
                    {
                    match("their"); 



                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "IDENTIFIER"

    // $ANTLR start "ON"
    public final void mON() throws RecognitionException {
        try {
            int _type = ON;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\env\\Compilers\\ANTLR\\examples\\OnX\\OnX.g:76:4: ( 'on' | 'when' | 'if' )
            int alt2=3;
            switch ( input.LA(1) ) {
            case 'o':
                {
                alt2=1;
                }
                break;
            case 'w':
                {
                alt2=2;
                }
                break;
            case 'i':
                {
                alt2=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;

            }

            switch (alt2) {
                case 1 :
                    // C:\\env\\Compilers\\ANTLR\\examples\\OnX\\OnX.g:76:6: 'on'
                    {
                    match("on"); 



                    }
                    break;
                case 2 :
                    // C:\\env\\Compilers\\ANTLR\\examples\\OnX\\OnX.g:76:13: 'when'
                    {
                    match("when"); 



                    }
                    break;
                case 3 :
                    // C:\\env\\Compilers\\ANTLR\\examples\\OnX\\OnX.g:76:22: 'if'
                    {
                    match("if"); 



                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "ON"

    // $ANTLR start "WORD"
    public final void mWORD() throws RecognitionException {
        try {
            int _type = WORD;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\env\\Compilers\\ANTLR\\examples\\OnX\\OnX.g:81:6: ( ( 'a' .. 'z' | 'A' .. 'Z' )+ )
            // C:\\env\\Compilers\\ANTLR\\examples\\OnX\\OnX.g:81:11: ( 'a' .. 'z' | 'A' .. 'Z' )+
            {
            // C:\\env\\Compilers\\ANTLR\\examples\\OnX\\OnX.g:81:11: ( 'a' .. 'z' | 'A' .. 'Z' )+
            int cnt3=0;
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0 >= 'A' && LA3_0 <= 'Z')||(LA3_0 >= 'a' && LA3_0 <= 'z')) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // C:\\env\\Compilers\\ANTLR\\examples\\OnX\\OnX.g:
            	    {
            	    if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


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


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "WORD"

    public void mTokens() throws RecognitionException {
        // C:\\env\\Compilers\\ANTLR\\examples\\OnX\\OnX.g:1:8: ( T__9 | T__10 | T__11 | T__12 | T__13 | ME | TO | IDENTIFIER | ON | WORD )
        int alt4=10;
        switch ( input.LA(1) ) {
        case '\'':
            {
            int LA4_1 = input.LA(2);

            if ( (LA4_1=='s') ) {
                alt4=2;
            }
            else {
                alt4=1;
            }
            }
            break;
        case 'i':
            {
            switch ( input.LA(2) ) {
            case 's':
                {
                int LA4_11 = input.LA(3);

                if ( ((LA4_11 >= 'A' && LA4_11 <= 'Z')||(LA4_11 >= 'a' && LA4_11 <= 'z')) ) {
                    alt4=10;
                }
                else {
                    alt4=3;
                }
                }
                break;
            case 'f':
                {
                int LA4_12 = input.LA(3);

                if ( ((LA4_12 >= 'A' && LA4_12 <= 'Z')||(LA4_12 >= 'a' && LA4_12 <= 'z')) ) {
                    alt4=10;
                }
                else {
                    alt4=9;
                }
                }
                break;
            default:
                alt4=10;
            }

            }
            break;
        case 't':
            {
            switch ( input.LA(2) ) {
            case 'h':
                {
                switch ( input.LA(3) ) {
                case 'i':
                    {
                    int LA4_25 = input.LA(4);

                    if ( (LA4_25=='s') ) {
                        int LA4_35 = input.LA(5);

                        if ( ((LA4_35 >= 'A' && LA4_35 <= 'Z')||(LA4_35 >= 'a' && LA4_35 <= 'z')) ) {
                            alt4=10;
                        }
                        else {
                            alt4=4;
                        }
                    }
                    else {
                        alt4=10;
                    }
                    }
                    break;
                case 'e':
                    {
                    int LA4_26 = input.LA(4);

                    if ( (LA4_26=='i') ) {
                        int LA4_36 = input.LA(5);

                        if ( (LA4_36=='r') ) {
                            int LA4_40 = input.LA(6);

                            if ( ((LA4_40 >= 'A' && LA4_40 <= 'Z')||(LA4_40 >= 'a' && LA4_40 <= 'z')) ) {
                                alt4=10;
                            }
                            else {
                                alt4=8;
                            }
                        }
                        else {
                            alt4=10;
                        }
                    }
                    else {
                        alt4=10;
                    }
                    }
                    break;
                default:
                    alt4=10;
                }

                }
                break;
            case 'o':
                {
                int LA4_14 = input.LA(3);

                if ( ((LA4_14 >= 'A' && LA4_14 <= 'Z')||(LA4_14 >= 'a' && LA4_14 <= 'z')) ) {
                    alt4=10;
                }
                else {
                    alt4=7;
                }
                }
                break;
            default:
                alt4=10;
            }

            }
            break;
        case 'w':
            {
            switch ( input.LA(2) ) {
            case 'a':
                {
                int LA4_15 = input.LA(3);

                if ( (LA4_15=='s') ) {
                    int LA4_28 = input.LA(4);

                    if ( ((LA4_28 >= 'A' && LA4_28 <= 'Z')||(LA4_28 >= 'a' && LA4_28 <= 'z')) ) {
                        alt4=10;
                    }
                    else {
                        alt4=5;
                    }
                }
                else {
                    alt4=10;
                }
                }
                break;
            case 'h':
                {
                int LA4_16 = input.LA(3);

                if ( (LA4_16=='e') ) {
                    int LA4_29 = input.LA(4);

                    if ( (LA4_29=='n') ) {
                        int LA4_38 = input.LA(5);

                        if ( ((LA4_38 >= 'A' && LA4_38 <= 'Z')||(LA4_38 >= 'a' && LA4_38 <= 'z')) ) {
                            alt4=10;
                        }
                        else {
                            alt4=9;
                        }
                    }
                    else {
                        alt4=10;
                    }
                }
                else {
                    alt4=10;
                }
                }
                break;
            default:
                alt4=10;
            }

            }
            break;
        case 'm':
            {
            switch ( input.LA(2) ) {
            case 'e':
                {
                int LA4_17 = input.LA(3);

                if ( ((LA4_17 >= 'A' && LA4_17 <= 'Z')||(LA4_17 >= 'a' && LA4_17 <= 'z')) ) {
                    alt4=10;
                }
                else {
                    alt4=6;
                }
                }
                break;
            case 'y':
                {
                int LA4_18 = input.LA(3);

                if ( ((LA4_18 >= 'A' && LA4_18 <= 'Z')||(LA4_18 >= 'a' && LA4_18 <= 'z')) ) {
                    alt4=10;
                }
                else {
                    alt4=8;
                }
                }
                break;
            default:
                alt4=10;
            }

            }
            break;
        case 'h':
            {
            switch ( input.LA(2) ) {
            case 'i':
                {
                int LA4_19 = input.LA(3);

                if ( (LA4_19=='s') ) {
                    int LA4_32 = input.LA(4);

                    if ( ((LA4_32 >= 'A' && LA4_32 <= 'Z')||(LA4_32 >= 'a' && LA4_32 <= 'z')) ) {
                        alt4=10;
                    }
                    else {
                        alt4=8;
                    }
                }
                else {
                    alt4=10;
                }
                }
                break;
            case 'e':
                {
                int LA4_20 = input.LA(3);

                if ( (LA4_20=='r') ) {
                    int LA4_33 = input.LA(4);

                    if ( ((LA4_33 >= 'A' && LA4_33 <= 'Z')||(LA4_33 >= 'a' && LA4_33 <= 'z')) ) {
                        alt4=10;
                    }
                    else {
                        alt4=8;
                    }
                }
                else {
                    alt4=10;
                }
                }
                break;
            default:
                alt4=10;
            }

            }
            break;
        case 'o':
            {
            switch ( input.LA(2) ) {
            case 'u':
                {
                int LA4_21 = input.LA(3);

                if ( (LA4_21=='r') ) {
                    int LA4_34 = input.LA(4);

                    if ( ((LA4_34 >= 'A' && LA4_34 <= 'Z')||(LA4_34 >= 'a' && LA4_34 <= 'z')) ) {
                        alt4=10;
                    }
                    else {
                        alt4=8;
                    }
                }
                else {
                    alt4=10;
                }
                }
                break;
            case 'n':
                {
                int LA4_22 = input.LA(3);

                if ( ((LA4_22 >= 'A' && LA4_22 <= 'Z')||(LA4_22 >= 'a' && LA4_22 <= 'z')) ) {
                    alt4=10;
                }
                else {
                    alt4=9;
                }
                }
                break;
            default:
                alt4=10;
            }

            }
            break;
        case 'A':
        case 'B':
        case 'C':
        case 'D':
        case 'E':
        case 'F':
        case 'G':
        case 'H':
        case 'I':
        case 'J':
        case 'K':
        case 'L':
        case 'M':
        case 'N':
        case 'O':
        case 'P':
        case 'Q':
        case 'R':
        case 'S':
        case 'T':
        case 'U':
        case 'V':
        case 'W':
        case 'X':
        case 'Y':
        case 'Z':
        case 'a':
        case 'b':
        case 'c':
        case 'd':
        case 'e':
        case 'f':
        case 'g':
        case 'j':
        case 'k':
        case 'l':
        case 'n':
        case 'p':
        case 'q':
        case 'r':
        case 's':
        case 'u':
        case 'v':
        case 'x':
        case 'y':
        case 'z':
            {
            alt4=10;
            }
            break;
        default:
            NoViableAltException nvae =
                new NoViableAltException("", 4, 0, input);

            throw nvae;

        }

        switch (alt4) {
            case 1 :
                // C:\\env\\Compilers\\ANTLR\\examples\\OnX\\OnX.g:1:10: T__9
                {
                mT__9(); 


                }
                break;
            case 2 :
                // C:\\env\\Compilers\\ANTLR\\examples\\OnX\\OnX.g:1:15: T__10
                {
                mT__10(); 


                }
                break;
            case 3 :
                // C:\\env\\Compilers\\ANTLR\\examples\\OnX\\OnX.g:1:21: T__11
                {
                mT__11(); 


                }
                break;
            case 4 :
                // C:\\env\\Compilers\\ANTLR\\examples\\OnX\\OnX.g:1:27: T__12
                {
                mT__12(); 


                }
                break;
            case 5 :
                // C:\\env\\Compilers\\ANTLR\\examples\\OnX\\OnX.g:1:33: T__13
                {
                mT__13(); 


                }
                break;
            case 6 :
                // C:\\env\\Compilers\\ANTLR\\examples\\OnX\\OnX.g:1:39: ME
                {
                mME(); 


                }
                break;
            case 7 :
                // C:\\env\\Compilers\\ANTLR\\examples\\OnX\\OnX.g:1:42: TO
                {
                mTO(); 


                }
                break;
            case 8 :
                // C:\\env\\Compilers\\ANTLR\\examples\\OnX\\OnX.g:1:45: IDENTIFIER
                {
                mIDENTIFIER(); 


                }
                break;
            case 9 :
                // C:\\env\\Compilers\\ANTLR\\examples\\OnX\\OnX.g:1:56: ON
                {
                mON(); 


                }
                break;
            case 10 :
                // C:\\env\\Compilers\\ANTLR\\examples\\OnX\\OnX.g:1:59: WORD
                {
                mWORD(); 


                }
                break;

        }

    }


 

}