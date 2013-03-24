package dotot.output;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

public class DoToTInterp {
	
    public static void main(String[] args) throws Exception {
    	//String file = "H:\\PhD\\Articles\\DoToT\\language\\output\\__Test___input.txt";    
        //InputStream input = new FileInputStream(file);
    	String command = "send sms I am back home to my wife when I leave work";
    	InputStream input = new ByteArrayInputStream(command.getBytes()); 
        
        Interpreter interp = new Interpreter();
        interp.interp(input);
    }
}
