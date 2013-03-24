package c;
// $ANTLR 3.4 C:\\env\\Compilers\\ANTLR\\examples\\C.g 2012-07-05 22:41:18

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked"})
public class CLexer extends Lexer {
    public static final int EOF=-1;
    public static final int T__9=9;
    public static final int T__10=10;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int ID=4;
    public static final int MAIN=5;
    public static final int NUMBER=6;
    public static final int TYPE=7;
    public static final int WS=8;

    // delegates
    // delegators
    public Lexer[] getDelegates() {
        return new Lexer[] {};
    }

    public CLexer() {} 
    public CLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public CLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);
    }
    public String getGrammarFileName() { return "C:\\env\\Compilers\\ANTLR\\examples\\C.g"; }

    // $ANTLR start "T__9"
    public final void mT__9() throws RecognitionException {
        try {
            int _type = T__9;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\env\\Compilers\\ANTLR\\examples\\C.g:2:6: ( '(' )
            // C:\\env\\Compilers\\ANTLR\\examples\\C.g:2:8: '('
            {
            match('('); 

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
            // C:\\env\\Compilers\\ANTLR\\examples\\C.g:3:7: ( ')' )
            // C:\\env\\Compilers\\ANTLR\\examples\\C.g:3:9: ')'
            {
            match(')'); 

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
            // C:\\env\\Compilers\\ANTLR\\examples\\C.g:4:7: ( '*' )
            // C:\\env\\Compilers\\ANTLR\\examples\\C.g:4:9: '*'
            {
            match('*'); 

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
            // C:\\env\\Compilers\\ANTLR\\examples\\C.g:5:7: ( '+' )
            // C:\\env\\Compilers\\ANTLR\\examples\\C.g:5:9: '+'
            {
            match('+'); 

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
            // C:\\env\\Compilers\\ANTLR\\examples\\C.g:6:7: ( ',' )
            // C:\\env\\Compilers\\ANTLR\\examples\\C.g:6:9: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__13"

    // $ANTLR start "T__14"
    public final void mT__14() throws RecognitionException {
        try {
            int _type = T__14;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\env\\Compilers\\ANTLR\\examples\\C.g:7:7: ( ';' )
            // C:\\env\\Compilers\\ANTLR\\examples\\C.g:7:9: ';'
            {
            match(';'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__14"

    // $ANTLR start "T__15"
    public final void mT__15() throws RecognitionException {
        try {
            int _type = T__15;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\env\\Compilers\\ANTLR\\examples\\C.g:8:7: ( '=' )
            // C:\\env\\Compilers\\ANTLR\\examples\\C.g:8:9: '='
            {
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__15"

    // $ANTLR start "T__16"
    public final void mT__16() throws RecognitionException {
        try {
            int _type = T__16;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\env\\Compilers\\ANTLR\\examples\\C.g:9:7: ( '{' )
            // C:\\env\\Compilers\\ANTLR\\examples\\C.g:9:9: '{'
            {
            match('{'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__16"

    // $ANTLR start "T__17"
    public final void mT__17() throws RecognitionException {
        try {
            int _type = T__17;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\env\\Compilers\\ANTLR\\examples\\C.g:10:7: ( '}' )
            // C:\\env\\Compilers\\ANTLR\\examples\\C.g:10:9: '}'
            {
            match('}'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__17"

    // $ANTLR start "MAIN"
    public final void mMAIN() throws RecognitionException {
        try {
            int _type = MAIN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\env\\Compilers\\ANTLR\\examples\\C.g:13:6: ( 'main' )
            // C:\\env\\Compilers\\ANTLR\\examples\\C.g:13:8: 'main'
            {
            match("main"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "MAIN"

    // $ANTLR start "TYPE"
    public final void mTYPE() throws RecognitionException {
        try {
            int _type = TYPE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\env\\Compilers\\ANTLR\\examples\\C.g:17:7: ( 'int' | 'bool' | 'char' )
            int alt1=3;
            switch ( input.LA(1) ) {
            case 'i':
                {
                alt1=1;
                }
                break;
            case 'b':
                {
                alt1=2;
                }
                break;
            case 'c':
                {
                alt1=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;

            }

            switch (alt1) {
                case 1 :
                    // C:\\env\\Compilers\\ANTLR\\examples\\C.g:17:9: 'int'
                    {
                    match("int"); 



                    }
                    break;
                case 2 :
                    // C:\\env\\Compilers\\ANTLR\\examples\\C.g:17:17: 'bool'
                    {
                    match("bool"); 



                    }
                    break;
                case 3 :
                    // C:\\env\\Compilers\\ANTLR\\examples\\C.g:17:26: 'char'
                    {
                    match("char"); 



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
    // $ANTLR end "TYPE"

    // $ANTLR start "ID"
    public final void mID() throws RecognitionException {
        try {
            int _type = ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\env\\Compilers\\ANTLR\\examples\\C.g:19:4: ( ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )* )
            // C:\\env\\Compilers\\ANTLR\\examples\\C.g:19:6: ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )*
            {
            if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            // C:\\env\\Compilers\\ANTLR\\examples\\C.g:19:34: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0 >= '0' && LA2_0 <= '9')||(LA2_0 >= 'A' && LA2_0 <= 'Z')||LA2_0=='_'||(LA2_0 >= 'a' && LA2_0 <= 'z')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // C:\\env\\Compilers\\ANTLR\\examples\\C.g:
            	    {
            	    if ( (input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
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
            	    break loop2;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "ID"

    // $ANTLR start "NUMBER"
    public final void mNUMBER() throws RecognitionException {
        try {
            int _type = NUMBER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\env\\Compilers\\ANTLR\\examples\\C.g:31:8: ( ( '0' .. '9' )+ )
            // C:\\env\\Compilers\\ANTLR\\examples\\C.g:31:10: ( '0' .. '9' )+
            {
            // C:\\env\\Compilers\\ANTLR\\examples\\C.g:31:10: ( '0' .. '9' )+
            int cnt3=0;
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0 >= '0' && LA3_0 <= '9')) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // C:\\env\\Compilers\\ANTLR\\examples\\C.g:
            	    {
            	    if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
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
    // $ANTLR end "NUMBER"

    // $ANTLR start "WS"
    public final void mWS() throws RecognitionException {
        try {
            int _type = WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\env\\Compilers\\ANTLR\\examples\\C.g:32:4: ( ( ' ' | '\\t' | '\\n' | '\\r' ) )
            // C:\\env\\Compilers\\ANTLR\\examples\\C.g:32:6: ( ' ' | '\\t' | '\\n' | '\\r' )
            {
            if ( (input.LA(1) >= '\t' && input.LA(1) <= '\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            _channel=HIDDEN;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "WS"

    public void mTokens() throws RecognitionException {
        // C:\\env\\Compilers\\ANTLR\\examples\\C.g:1:8: ( T__9 | T__10 | T__11 | T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | MAIN | TYPE | ID | NUMBER | WS )
        int alt4=14;
        switch ( input.LA(1) ) {
        case '(':
            {
            alt4=1;
            }
            break;
        case ')':
            {
            alt4=2;
            }
            break;
        case '*':
            {
            alt4=3;
            }
            break;
        case '+':
            {
            alt4=4;
            }
            break;
        case ',':
            {
            alt4=5;
            }
            break;
        case ';':
            {
            alt4=6;
            }
            break;
        case '=':
            {
            alt4=7;
            }
            break;
        case '{':
            {
            alt4=8;
            }
            break;
        case '}':
            {
            alt4=9;
            }
            break;
        case 'm':
            {
            int LA4_10 = input.LA(2);

            if ( (LA4_10=='a') ) {
                int LA4_17 = input.LA(3);

                if ( (LA4_17=='i') ) {
                    int LA4_21 = input.LA(4);

                    if ( (LA4_21=='n') ) {
                        int LA4_25 = input.LA(5);

                        if ( ((LA4_25 >= '0' && LA4_25 <= '9')||(LA4_25 >= 'A' && LA4_25 <= 'Z')||LA4_25=='_'||(LA4_25 >= 'a' && LA4_25 <= 'z')) ) {
                            alt4=12;
                        }
                        else {
                            alt4=10;
                        }
                    }
                    else {
                        alt4=12;
                    }
                }
                else {
                    alt4=12;
                }
            }
            else {
                alt4=12;
            }
            }
            break;
        case 'i':
            {
            int LA4_11 = input.LA(2);

            if ( (LA4_11=='n') ) {
                int LA4_18 = input.LA(3);

                if ( (LA4_18=='t') ) {
                    int LA4_22 = input.LA(4);

                    if ( ((LA4_22 >= '0' && LA4_22 <= '9')||(LA4_22 >= 'A' && LA4_22 <= 'Z')||LA4_22=='_'||(LA4_22 >= 'a' && LA4_22 <= 'z')) ) {
                        alt4=12;
                    }
                    else {
                        alt4=11;
                    }
                }
                else {
                    alt4=12;
                }
            }
            else {
                alt4=12;
            }
            }
            break;
        case 'b':
            {
            int LA4_12 = input.LA(2);

            if ( (LA4_12=='o') ) {
                int LA4_19 = input.LA(3);

                if ( (LA4_19=='o') ) {
                    int LA4_23 = input.LA(4);

                    if ( (LA4_23=='l') ) {
                        int LA4_27 = input.LA(5);

                        if ( ((LA4_27 >= '0' && LA4_27 <= '9')||(LA4_27 >= 'A' && LA4_27 <= 'Z')||LA4_27=='_'||(LA4_27 >= 'a' && LA4_27 <= 'z')) ) {
                            alt4=12;
                        }
                        else {
                            alt4=11;
                        }
                    }
                    else {
                        alt4=12;
                    }
                }
                else {
                    alt4=12;
                }
            }
            else {
                alt4=12;
            }
            }
            break;
        case 'c':
            {
            int LA4_13 = input.LA(2);

            if ( (LA4_13=='h') ) {
                int LA4_20 = input.LA(3);

                if ( (LA4_20=='a') ) {
                    int LA4_24 = input.LA(4);

                    if ( (LA4_24=='r') ) {
                        int LA4_28 = input.LA(5);

                        if ( ((LA4_28 >= '0' && LA4_28 <= '9')||(LA4_28 >= 'A' && LA4_28 <= 'Z')||LA4_28=='_'||(LA4_28 >= 'a' && LA4_28 <= 'z')) ) {
                            alt4=12;
                        }
                        else {
                            alt4=11;
                        }
                    }
                    else {
                        alt4=12;
                    }
                }
                else {
                    alt4=12;
                }
            }
            else {
                alt4=12;
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
        case '_':
        case 'a':
        case 'd':
        case 'e':
        case 'f':
        case 'g':
        case 'h':
        case 'j':
        case 'k':
        case 'l':
        case 'n':
        case 'o':
        case 'p':
        case 'q':
        case 'r':
        case 's':
        case 't':
        case 'u':
        case 'v':
        case 'w':
        case 'x':
        case 'y':
        case 'z':
            {
            alt4=12;
            }
            break;
        case '0':
        case '1':
        case '2':
        case '3':
        case '4':
        case '5':
        case '6':
        case '7':
        case '8':
        case '9':
            {
            alt4=13;
            }
            break;
        case '\t':
        case '\n':
        case '\r':
        case ' ':
            {
            alt4=14;
            }
            break;
        default:
            NoViableAltException nvae =
                new NoViableAltException("", 4, 0, input);

            throw nvae;

        }

        switch (alt4) {
            case 1 :
                // C:\\env\\Compilers\\ANTLR\\examples\\C.g:1:10: T__9
                {
                mT__9(); 


                }
                break;
            case 2 :
                // C:\\env\\Compilers\\ANTLR\\examples\\C.g:1:15: T__10
                {
                mT__10(); 


                }
                break;
            case 3 :
                // C:\\env\\Compilers\\ANTLR\\examples\\C.g:1:21: T__11
                {
                mT__11(); 


                }
                break;
            case 4 :
                // C:\\env\\Compilers\\ANTLR\\examples\\C.g:1:27: T__12
                {
                mT__12(); 


                }
                break;
            case 5 :
                // C:\\env\\Compilers\\ANTLR\\examples\\C.g:1:33: T__13
                {
                mT__13(); 


                }
                break;
            case 6 :
                // C:\\env\\Compilers\\ANTLR\\examples\\C.g:1:39: T__14
                {
                mT__14(); 


                }
                break;
            case 7 :
                // C:\\env\\Compilers\\ANTLR\\examples\\C.g:1:45: T__15
                {
                mT__15(); 


                }
                break;
            case 8 :
                // C:\\env\\Compilers\\ANTLR\\examples\\C.g:1:51: T__16
                {
                mT__16(); 


                }
                break;
            case 9 :
                // C:\\env\\Compilers\\ANTLR\\examples\\C.g:1:57: T__17
                {
                mT__17(); 


                }
                break;
            case 10 :
                // C:\\env\\Compilers\\ANTLR\\examples\\C.g:1:63: MAIN
                {
                mMAIN(); 


                }
                break;
            case 11 :
                // C:\\env\\Compilers\\ANTLR\\examples\\C.g:1:68: TYPE
                {
                mTYPE(); 


                }
                break;
            case 12 :
                // C:\\env\\Compilers\\ANTLR\\examples\\C.g:1:73: ID
                {
                mID(); 


                }
                break;
            case 13 :
                // C:\\env\\Compilers\\ANTLR\\examples\\C.g:1:76: NUMBER
                {
                mNUMBER(); 


                }
                break;
            case 14 :
                // C:\\env\\Compilers\\ANTLR\\examples\\C.g:1:83: WS
                {
                mWS(); 


                }
                break;

        }

    }


 

}