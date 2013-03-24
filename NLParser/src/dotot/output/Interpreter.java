package dotot.output;

import java.io.IOException;
import java.io.InputStream;

import org.antlr.runtime.ANTLRInputStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.Token;
import org.antlr.runtime.TokenStream;

public class Interpreter {
	
	// default response to messages
    public InterpreterListener listener = new InterpreterListener() {
    	public void info(String msg) {
    		System.out.println(msg);
    	}
        public void error(String msg) {
        	System.err.println(msg);
        }
        public void error(String msg, Exception e) {
        	error(msg); e.printStackTrace(System.err);
        }
        public void error(String msg, Token t) {
        	error("line "+t.getLine()+": "+msg);
        }
    };
    
    public void interp(InputStream input) throws RecognitionException, IOException {
    	DoToTLexer lex = new DoToTLexer(new ANTLRInputStream(input));
        CommonTokenStream tokens = new CommonTokenStream(lex);
        DoToTParser parser = new DoToTParser(tokens, this);
        parser.rule();
        System.out.println("End of parsing");
    }
    
    /** look which context has the state defined by this name */
    public ActionSubject getSubjectbyName(String name) {    	
    	System.out.println("Checking for subject (entity or value) with name " + name);
    	return new Context();
    }
    
    /** look which context has the state defined by this name */
    public ActionObject getObjectbyName(String name) {
    	System.out.println("Checking for object (context or value) with name " + name);
    	return new Context();
    }
    
    /** look into the directory to find the service corresponding to this name */
    public Service getServicebyName(String name) {    	
    	System.out.println("Creating service " + name);
    	return new Service(name);
    }
}
