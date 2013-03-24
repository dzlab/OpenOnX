package c;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.io.FileInputStream;

public class CInterp {
	public static void main(String[] args) throws Exception {
		String command = "main() {    int myVar;     i = 0; }";
		InputStream input = new ByteArrayInputStream(command.getBytes()); 
		Interpreter interp = new Interpreter();
        interp.interp(input);
	}
}