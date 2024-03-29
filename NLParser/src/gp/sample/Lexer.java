package gp.sample;

public abstract class Lexer {
	
	public static final char EOF = (char)-1; // represent end of file char
	public static final int EOF_TYPE = 1; // represent EOF token type
	String input; // input string
	int p = 0; // index into input of current character
	char c; // current character
	
	public Lexer(String input) {
		this.input = input;
		c = input.charAt(p); // prime lookahead	
	}
	
	/** Move one character; detect "end of file" */
	public void consume() {
		p++;
		if ( p >= input.length() ) 
			c = EOF;
		else 
			c = input.charAt(p);
	}
	/** Ensure x is next character on the input stream */
	public void match(char x) {
		if ( c == x) 
			consume();
		else 
			throw new Error("expecting " +x+"; found " +c);
	}
	
	public abstract Token nextToken();
	public abstract String getTokenName(int tokenType);
}
