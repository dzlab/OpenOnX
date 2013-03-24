package c;

import java.io.*;
import org.antlr.runtime.*;
import org.antlr.runtime.debug.DebugEventSocketProxy;


public class __Test__ {

    public static void main(String args[]) throws Exception {
        CLexer lex = new CLexer(new ANTLRFileStream("C:\\env\\Compilers\\ANTLR\\examples\\output\\__Test___input.txt", "UTF8"));
        CommonTokenStream tokens = new CommonTokenStream(lex);

        CParser g = new CParser(tokens, 49100, null);
        try {
            g.program();
        } catch (RecognitionException e) {
            e.printStackTrace();
        }
    }
}