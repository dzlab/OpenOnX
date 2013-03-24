package c;
// $ANTLR 3.4 C:\\env\\Compilers\\ANTLR\\examples\\C.g 2012-07-05 22:41:18

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

import org.antlr.runtime.debug.*;
import java.io.IOException;
@SuppressWarnings({"all", "warnings", "unchecked"})
public class CParser extends DebugParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "ID", "MAIN", "NUMBER", "TYPE", "WS", "'('", "')'", "'*'", "'+'", "','", "';'", "'='", "'{'", "'}'"
    };

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
    public Parser[] getDelegates() {
        return new Parser[] {};
    }

    // delegators


public static final String[] ruleNames = new String[] {
    "invalidRule", "exp", "command", "arg", "program"
};

public static final boolean[] decisionCanBacktrack = new boolean[] {
    false, // invalid decision
    false, false, false, false, false
};

 
    public int ruleLevel = 0;
    public int getRuleLevel() { return ruleLevel; }
    public void incRuleLevel() { ruleLevel++; }
    public void decRuleLevel() { ruleLevel--; }
    public CParser(TokenStream input) {
        this(input, DebugEventSocketProxy.DEFAULT_DEBUGGER_PORT, new RecognizerSharedState());
    }
    public CParser(TokenStream input, int port, RecognizerSharedState state) {
        super(input, state);
        DebugEventSocketProxy proxy =
            new DebugEventSocketProxy(this, port, null);

        setDebugListener(proxy);
        try {
            proxy.handshake();
        }
        catch (IOException ioe) {
            reportError(ioe);
        }
    }

public CParser(TokenStream input, DebugEventListener dbg) {
    super(input, dbg, new RecognizerSharedState());
}

protected boolean evalPredicate(boolean result, String predicate) {
    dbg.semanticPredicate(result, predicate);
    return result;
}

    public String[] getTokenNames() { return CParser.tokenNames; }
    public String getGrammarFileName() { return "C:\\env\\Compilers\\ANTLR\\examples\\C.g"; }


    	Interpreter interp;
    	public CParser(TokenStream input, Interpreter interp) {
    		this(input);
    		this.interp = interp;
    	}



    // $ANTLR start "program"
    // C:\\env\\Compilers\\ANTLR\\examples\\C.g:11:1: program : MAIN '(' ( arg )? ( ',' arg )* ')' '{' ( command )* '}' ;
    public final void program() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "program");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(11, 0);

        try {
            // C:\\env\\Compilers\\ANTLR\\examples\\C.g:11:9: ( MAIN '(' ( arg )? ( ',' arg )* ')' '{' ( command )* '}' )
            dbg.enterAlt(1);

            // C:\\env\\Compilers\\ANTLR\\examples\\C.g:11:11: MAIN '(' ( arg )? ( ',' arg )* ')' '{' ( command )* '}'
            {
            dbg.location(11,11);
            match(input,MAIN,FOLLOW_MAIN_in_program16); 
            dbg.location(11,16);
            match(input,9,FOLLOW_9_in_program18); 
            dbg.location(11,20);
            // C:\\env\\Compilers\\ANTLR\\examples\\C.g:11:20: ( arg )?
            int alt1=2;
            try { dbg.enterSubRule(1);
            try { dbg.enterDecision(1, decisionCanBacktrack[1]);

            int LA1_0 = input.LA(1);

            if ( (LA1_0==TYPE) ) {
                alt1=1;
            }
            } finally {dbg.exitDecision(1);}

            switch (alt1) {
                case 1 :
                    dbg.enterAlt(1);

                    // C:\\env\\Compilers\\ANTLR\\examples\\C.g:11:20: arg
                    {
                    dbg.location(11,20);
                    pushFollow(FOLLOW_arg_in_program20);
                    arg();

                    state._fsp--;


                    }
                    break;

            }
            } finally {dbg.exitSubRule(1);}

            dbg.location(11,25);
            // C:\\env\\Compilers\\ANTLR\\examples\\C.g:11:25: ( ',' arg )*
            try { dbg.enterSubRule(2);

            loop2:
            do {
                int alt2=2;
                try { dbg.enterDecision(2, decisionCanBacktrack[2]);

                int LA2_0 = input.LA(1);

                if ( (LA2_0==13) ) {
                    alt2=1;
                }


                } finally {dbg.exitDecision(2);}

                switch (alt2) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // C:\\env\\Compilers\\ANTLR\\examples\\C.g:11:26: ',' arg
            	    {
            	    dbg.location(11,26);
            	    match(input,13,FOLLOW_13_in_program24); 
            	    dbg.location(11,30);
            	    pushFollow(FOLLOW_arg_in_program26);
            	    arg();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);
            } finally {dbg.exitSubRule(2);}

            dbg.location(11,36);
            match(input,10,FOLLOW_10_in_program30); 
            dbg.location(11,40);
            match(input,16,FOLLOW_16_in_program32); 
            dbg.location(11,44);
            // C:\\env\\Compilers\\ANTLR\\examples\\C.g:11:44: ( command )*
            try { dbg.enterSubRule(3);

            loop3:
            do {
                int alt3=2;
                try { dbg.enterDecision(3, decisionCanBacktrack[3]);

                int LA3_0 = input.LA(1);

                if ( (LA3_0==ID||LA3_0==TYPE) ) {
                    alt3=1;
                }


                } finally {dbg.exitDecision(3);}

                switch (alt3) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // C:\\env\\Compilers\\ANTLR\\examples\\C.g:11:44: command
            	    {
            	    dbg.location(11,44);
            	    pushFollow(FOLLOW_command_in_program34);
            	    command();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);
            } finally {dbg.exitSubRule(3);}

            dbg.location(11,53);
            match(input,17,FOLLOW_17_in_program37); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        dbg.location(12, 1);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "program");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "program"



    // $ANTLR start "arg"
    // C:\\env\\Compilers\\ANTLR\\examples\\C.g:15:1: arg : TYPE ID ;
    public final void arg() throws RecognitionException {
        Token ID1=null;

        try { dbg.enterRule(getGrammarFileName(), "arg");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(15, 0);

        try {
            // C:\\env\\Compilers\\ANTLR\\examples\\C.g:15:5: ( TYPE ID )
            dbg.enterAlt(1);

            // C:\\env\\Compilers\\ANTLR\\examples\\C.g:15:7: TYPE ID
            {
            dbg.location(15,7);
            match(input,TYPE,FOLLOW_TYPE_in_arg56); 
            dbg.location(15,12);
            ID1=(Token)match(input,ID,FOLLOW_ID_in_arg58); 
            dbg.location(15,15);
            interp.set((ID1!=null?ID1.getText():null), null);

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        dbg.location(16, 1);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "arg");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "arg"



    // $ANTLR start "command"
    // C:\\env\\Compilers\\ANTLR\\examples\\C.g:21:1: command : ( arg ';' | ID '=' exp ';' );
    public final void command() throws RecognitionException {
        Token ID2=null;
        Integer exp3 =null;


        try { dbg.enterRule(getGrammarFileName(), "command");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(21, 0);

        try {
            // C:\\env\\Compilers\\ANTLR\\examples\\C.g:21:9: ( arg ';' | ID '=' exp ';' )
            int alt4=2;
            try { dbg.enterDecision(4, decisionCanBacktrack[4]);

            int LA4_0 = input.LA(1);

            if ( (LA4_0==TYPE) ) {
                alt4=1;
            }
            else if ( (LA4_0==ID) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;

            }
            } finally {dbg.exitDecision(4);}

            switch (alt4) {
                case 1 :
                    dbg.enterAlt(1);

                    // C:\\env\\Compilers\\ANTLR\\examples\\C.g:21:11: arg ';'
                    {
                    dbg.location(21,11);
                    pushFollow(FOLLOW_arg_in_command134);
                    arg();

                    state._fsp--;

                    dbg.location(21,15);
                    match(input,14,FOLLOW_14_in_command136); 

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // C:\\env\\Compilers\\ANTLR\\examples\\C.g:22:5: ID '=' exp ';'
                    {
                    dbg.location(22,5);
                    ID2=(Token)match(input,ID,FOLLOW_ID_in_command143); 
                    dbg.location(22,8);
                    match(input,15,FOLLOW_15_in_command145); 
                    dbg.location(22,12);
                    pushFollow(FOLLOW_exp_in_command147);
                    exp3=exp();

                    state._fsp--;

                    dbg.location(22,16);
                    match(input,14,FOLLOW_14_in_command149); 
                    dbg.location(22,20);
                    interp.set((ID2!=null?ID2.getText():null), exp3);

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
        dbg.location(23, 1);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "command");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "command"



    // $ANTLR start "exp"
    // C:\\env\\Compilers\\ANTLR\\examples\\C.g:24:1: exp returns [Integer value] : ( NUMBER | ID '*' e= exp | ID '+' exp | ID | '(' e= exp ')' );
    public final Integer exp() throws RecognitionException {
        Integer value = null;


        Token NUMBER4=null;
        Token ID5=null;
        Token ID6=null;
        Token ID7=null;
        Integer e =null;


        try { dbg.enterRule(getGrammarFileName(), "exp");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(24, 0);

        try {
            // C:\\env\\Compilers\\ANTLR\\examples\\C.g:25:2: ( NUMBER | ID '*' e= exp | ID '+' exp | ID | '(' e= exp ')' )
            int alt5=5;
            try { dbg.enterDecision(5, decisionCanBacktrack[5]);

            switch ( input.LA(1) ) {
            case NUMBER:
                {
                alt5=1;
                }
                break;
            case ID:
                {
                switch ( input.LA(2) ) {
                case 11:
                    {
                    alt5=2;
                    }
                    break;
                case 12:
                    {
                    alt5=3;
                    }
                    break;
                case 10:
                case 14:
                    {
                    alt5=4;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 5, 2, input);

                    dbg.recognitionException(nvae);
                    throw nvae;

                }

                }
                break;
            case 9:
                {
                alt5=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;

            }

            } finally {dbg.exitDecision(5);}

            switch (alt5) {
                case 1 :
                    dbg.enterAlt(1);

                    // C:\\env\\Compilers\\ANTLR\\examples\\C.g:25:4: NUMBER
                    {
                    dbg.location(25,4);
                    NUMBER4=(Token)match(input,NUMBER,FOLLOW_NUMBER_in_exp165); 
                    dbg.location(25,11);
                    value = Integer.parseInt((NUMBER4!=null?NUMBER4.getText():null));

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // C:\\env\\Compilers\\ANTLR\\examples\\C.g:26:5: ID '*' e= exp
                    {
                    dbg.location(26,5);
                    ID5=(Token)match(input,ID,FOLLOW_ID_in_exp173); 
                    dbg.location(26,8);
                    match(input,11,FOLLOW_11_in_exp175); 
                    dbg.location(26,13);
                    pushFollow(FOLLOW_exp_in_exp179);
                    e=exp();

                    state._fsp--;

                    dbg.location(26,18);
                    value = interp.get((ID5!=null?ID5.getText():null)) * e;

                    }
                    break;
                case 3 :
                    dbg.enterAlt(3);

                    // C:\\env\\Compilers\\ANTLR\\examples\\C.g:27:5: ID '+' exp
                    {
                    dbg.location(27,5);
                    ID6=(Token)match(input,ID,FOLLOW_ID_in_exp187); 
                    dbg.location(27,8);
                    match(input,12,FOLLOW_12_in_exp189); 
                    dbg.location(27,12);
                    pushFollow(FOLLOW_exp_in_exp191);
                    exp();

                    state._fsp--;

                    dbg.location(27,16);
                    value = interp.get((ID6!=null?ID6.getText():null)) + e;

                    }
                    break;
                case 4 :
                    dbg.enterAlt(4);

                    // C:\\env\\Compilers\\ANTLR\\examples\\C.g:28:5: ID
                    {
                    dbg.location(28,5);
                    ID7=(Token)match(input,ID,FOLLOW_ID_in_exp199); 
                    dbg.location(28,8);
                    value = interp.get((ID7!=null?ID7.getText():null));

                    }
                    break;
                case 5 :
                    dbg.enterAlt(5);

                    // C:\\env\\Compilers\\ANTLR\\examples\\C.g:29:5: '(' e= exp ')'
                    {
                    dbg.location(29,5);
                    match(input,9,FOLLOW_9_in_exp207); 
                    dbg.location(29,10);
                    pushFollow(FOLLOW_exp_in_exp211);
                    e=exp();

                    state._fsp--;

                    dbg.location(29,15);
                    match(input,10,FOLLOW_10_in_exp213); 
                    dbg.location(29,19);
                    value = e;

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
        dbg.location(30, 1);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "exp");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return value;
    }
    // $ANTLR end "exp"

    // Delegated rules


 

    public static final BitSet FOLLOW_MAIN_in_program16 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_9_in_program18 = new BitSet(new long[]{0x0000000000002480L});
    public static final BitSet FOLLOW_arg_in_program20 = new BitSet(new long[]{0x0000000000002400L});
    public static final BitSet FOLLOW_13_in_program24 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_arg_in_program26 = new BitSet(new long[]{0x0000000000002400L});
    public static final BitSet FOLLOW_10_in_program30 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_program32 = new BitSet(new long[]{0x0000000000020090L});
    public static final BitSet FOLLOW_command_in_program34 = new BitSet(new long[]{0x0000000000020090L});
    public static final BitSet FOLLOW_17_in_program37 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TYPE_in_arg56 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ID_in_arg58 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_arg_in_command134 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_command136 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_command143 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_command145 = new BitSet(new long[]{0x0000000000000250L});
    public static final BitSet FOLLOW_exp_in_command147 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_command149 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NUMBER_in_exp165 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_exp173 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_exp175 = new BitSet(new long[]{0x0000000000000250L});
    public static final BitSet FOLLOW_exp_in_exp179 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_exp187 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_exp189 = new BitSet(new long[]{0x0000000000000250L});
    public static final BitSet FOLLOW_exp_in_exp191 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_exp199 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_9_in_exp207 = new BitSet(new long[]{0x0000000000000250L});
    public static final BitSet FOLLOW_exp_in_exp211 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_10_in_exp213 = new BitSet(new long[]{0x0000000000000002L});

}