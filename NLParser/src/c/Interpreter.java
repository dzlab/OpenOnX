package c;

import java.io.*;
import org.antlr.runtime.*;
import org.antlr.runtime.debug.DebugEventSocketProxy;
import java.util.HashMap;

public class Interpreter {
	HashMap<String, Integer> vars;
    public Interpreter() {
		vars = new HashMap<String, Integer>();
	}
	public void interp(InputStream input) throws RecognitionException, IOException {
        CLexer lex = new CLexer(new ANTLRInputStream(input));
        CommonTokenStream tokens = new CommonTokenStream(lex);
        CParser parser = new CParser(tokens, this);
        parser.program();
        // System.out.println(tables);
    }
	public Integer get(String id) {
		return vars.get(id);
	}
	public void set(String id, Integer val) {
		vars.put(id, val);
	}
}