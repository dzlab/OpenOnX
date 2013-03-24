package org.onx.helper;

import java.util.Calendar;

import org.onx.MainActivity;
import org.onx.receiver.OneShotAlarm;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;

public class TimeRule {

	public enum Interval {
		YEAR, MONTH, WEEK, DAY, HOUR, MINUTE, SECOND;  
	}
	
	
	public static void schedule() {
		Context mContext = MainActivity.mContext;
		// get a Calendar object with current time
		Calendar cal = Calendar.getInstance();
		cal.setTimeInMillis(System.currentTimeMillis());
		// add 10 seconds to the calendar object
		cal.add(Calendar.SECOND, 10);
		Intent intent = new Intent(mContext, OneShotAlarm.class);
		intent.putExtra("action_name", "dailyHoroscopeTimer");
		intent.putExtra("action_body", "user action");
		// In reality, you would want to have a static variable for the request code instead of 192837
		//PendingIntent sender = PendingIntent.getBroadcast(mContext, 192837, intent, PendingIntent.FLAG_UPDATE_CURRENT);
		PendingIntent sender = PendingIntent.getBroadcast(mContext, 0, intent, 0); 
		// Get the AlarmManager service
		AlarmManager alarmManager = (AlarmManager) mContext.getSystemService(Context.ALARM_SERVICE);
		alarmManager.set(AlarmManager.RTC_WAKEUP, cal.getTimeInMillis(), sender);
	}
	
	/** subscribe the scheduled task to a daily timer */
	public static void schedule(String event_type, long startTime, Interval interval, boolean repeat, boolean exact) {
		//TODO how to delegate the action to the executor?
		Calendar cal = Calendar.getInstance();
		cal.setTimeInMillis(startTime);//System.currentTimeMillis());		
		int interval_time = 1000;
		switch(interval) {
			case YEAR:
				cal.add(Calendar.YEAR, 1);
				interval_time *= 365 * 24 * 60 * 60;
				break;
			case MONTH:
				cal.add(Calendar.MONTH, 1);
				interval_time *= 30 * 24 * 60 * 60;
				break;
			case WEEK:
				cal.add(Calendar.WEEK_OF_YEAR, 1);
				interval_time *= 7 * 24 * 60 * 60;
			case DAY:
				cal.add(Calendar.DAY_OF_MONTH, 1);
				interval_time *= 24 * 60 * 60;
				break;
			case HOUR:
				cal.add(Calendar.HOUR, 1);
				interval_time *= 1 * 60 * 60;
				break;
			case MINUTE:
				cal.add(Calendar.MINUTE, 1);
				interval_time *= 1 * 60;
				break;
			case SECOND:
				cal.add(Calendar.SECOND, 1);
				interval_time *= 1;
				break;
		}				
		if(repeat) {
			MainActivity.mAlarmCtlr.startRepeatedAlarm(event_type, cal.getTimeInMillis(), interval_time);
		}else {
			MainActivity.mAlarmCtlr.oneShotAlarm(event_type, cal.getTimeInMillis());
		}
	}
}
