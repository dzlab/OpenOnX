package org.onx.controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.onx.MainActivity;
import org.onx.antlr.pojo.Command;
import org.onx.antlr.pojo.Events;
import org.onx.antlr.pojo.User;
import org.onx.antlr.pojo.Vars;
import org.onx.helper.TimeRule;
import org.onx.helper.TimeRule.Interval;

import android.graphics.Shader.TileMode;
import android.location.Location;
import android.util.Log;

public class Scheduler {
	
	public static final String TAG = Scheduler.class.getSimpleName();
	protected static Map<String, List<Command>> scheduled = new HashMap<String, List<Command>>();

	/** Called after interpreting the user input rule to schedule the execution of a command when a given event occurs */
	public static void on(String event, Command command) {		
		String[] params = event.split("_");
		//if the event is a location based than register a proximity alert
		if(Events.isLocation(params[1])) {
			Location location = Vars.getLocationByPoi(params[1]);
			boolean entering = Events.isEntering(event);
			MainActivity.mLocationCtlr.addProximityAlert(event, location, entering);
		
		}else if(Events.isBirthday(params[1])) {
			User user = null;
			// if the provided parameter is a pronoun than the user should be identified earlier while parsing the command
			if(User.isPronoun(params[0]))  
				user = command.getUser();
			else
				user = Vars.getUserById(params[0]);
			event = user.replaceProoun(event);
			TimeRule.schedule(event, user.getNextBirthdayEvent(), Interval.YEAR, true, true);
		}
		List<Command> cmds = scheduled.get(event);
		if(cmds == null)
			cmds = new ArrayList<Command>();
		cmds.add(command);
		scheduled.put(event, cmds);		
	}
	
	/** Called mostly by a {@link BroadcastReceiver}, i.e. after an event occurs to execute corresponding scheduled actions */
	public static void execute(String event) {
		List<Command> cmds = scheduled.get(event);
		if(cmds != null) {
			Log.i(TAG, "Executing actions ("+cmds.size()+") registered for: " + event);
			for(Command cmd: cmds) {
				cmd.execute();
			}
		}else {
			Log.i(TAG, "No action to execute for: " + event);
		}
	}
	
	/** Called mostly by a {@link BroadcastReceiver}, i.e. after an event occurs to execute corresponding scheduled actions */
	public static void execute(String event, boolean entering) {
		List<Command> cmds = scheduled.get(event);
		if(cmds != null && entering==Events.isEntering(event)) {
			Log.i(TAG, "Executing actions ("+cmds.size()+") registered for: " + event + " and transition entring? " + entering);
			for(Command cmd: cmds) {
				cmd.execute();
			}
		}else {
			Log.i(TAG, "No action to execute for: " + event);
		}
	}
}
