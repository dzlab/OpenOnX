package org.onx.antlr;

import org.antlr.runtime.*;
import org.onx.antlr.pojo.Command;
import org.onx.antlr.pojo.Events;
import org.onx.antlr.pojo.User;
import org.onx.antlr.pojo.Vars;
import org.onx.controller.LocationController;
import org.onx.controller.Scheduler;

import java.io.InputStream;
import java.io.IOException;
import java.util.*;

public class Interpreter {
	
    public InterpreterListener listener = // default response to messages
        new InterpreterListener() {
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
        OnXLexer lex = new OnXLexer(new ANTLRInputStream(input));
        CommonTokenStream tokens = new CommonTokenStream(lex);
        OnXParser parser = new OnXParser(tokens, this);
        parser.rule();
    }

    /** @return {@link User} instance identified by the provided identifier */
	public User getUser(String identifier) {		
		return Vars.getUserById(identifier);
	}

	/** Check-in a location, or any context events from the user environment. 
	 * It allows mapping the user provided label (e.g. home, work) with an contextual physical value (e.g. GPS coordinates) */
	public void checkIn(String identifier, String context) {
		if(Events.isLocation(context)) {
			Vars.addPoiForLocation(context, LocationController.getCurrent());
			Vars.addPoiForUser(context, Vars.getUserById(identifier));
		}//what else a user can check-in for
	}

	/** Schedule the execution of an event */
	public void schedule(String event, String option, String service, User destination, String argument) {
		Command command = new Command();
		command.setArgument(argument);
		command.setOption(option);
		command.setService(service);
		command.setUser(destination);
		Scheduler.on(event, command);
	}    
}
