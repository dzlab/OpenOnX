package gp.sample;

public class Test {

	public static void testLexer() {
		String input = "[a, b ]";
		ListLexer lexer = new ListLexer(input); // create lexer
		Token t = lexer.nextToken();
		while ( t.type != Lexer.EOF_TYPE ) {
			System.out.println(t);
			t = lexer.nextToken();
		}
		System.out.println(t); // EOF
	}
	
	public static void testParser() {
		String input = "[a, ]";
		ListLexer lexer = new ListLexer(input); // parse command-line arg
		ListParser parser = new ListParser(lexer);
		parser.list(); // begin parsing at rule list
	}
	
	public static void main(String[] args) {
		testLexer();
		testParser();
	}

}
