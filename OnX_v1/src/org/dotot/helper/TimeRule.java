package org.dotot.helper;

import java.util.Calendar;

import org.dotot.controller.OneShotAlarm;
import org.dotot.service.AlarmService_Service;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.SystemClock;

public class TimeRule {

	protected Context mContext;
	public enum Interval {
		YEAR, MONTH, WEEK, DAY, HOUR, MINUTE, SECOND;  
	}
	
	public TimeRule(Context context) {
		mContext = context;
	}
	
	public void schedule() {
		
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
	public void schedule(String name, long startTime, Interval interval, boolean repeat, boolean exact, Action action) {
		//TODO how to delegate the action to the executor?
		Calendar cal = Calendar.getInstance();
		cal.setTimeInMillis(startTime);//System.currentTimeMillis());		
		int time = 1000;
		switch(interval) {
			case YEAR:
				cal.add(Calendar.YEAR, 1);
				time *= 365 * 24 * 60 * 60;
				break;
			case MONTH:
				cal.add(Calendar.MONTH, 1);
				time *= 30 * 24 * 60 * 60;
				break;
			case WEEK:
				cal.add(Calendar.WEEK_OF_YEAR, 1);
				time *= 7 * 24 * 60 * 60;
			case DAY:
				cal.add(Calendar.DAY_OF_MONTH, 1);
				time *= 24 * 60 * 60;
				break;
			case HOUR:
				cal.add(Calendar.HOUR, 1);
				time *= 1 * 60 * 60;
				break;
			case MINUTE:
				cal.add(Calendar.MINUTE, 1);
				time *= 1 * 60;
				break;
			case SECOND:
				cal.add(Calendar.SECOND, 1);
				time *= 1;
				break;
		}
		Intent intent = new Intent(mContext, OneShotAlarm.class);
		intent.putExtra("action_name", name);
		intent.putExtra("action_body", action.serialize());
        PendingIntent sender = PendingIntent.getBroadcast(mContext, 0, intent, 0);
        AlarmManager am = (AlarmManager)mContext.getSystemService(Context.ALARM_SERVICE);
		if(repeat) {
			am.setRepeating(AlarmManager.ELAPSED_REALTIME_WAKEUP, cal.getTimeInMillis(), time, sender);
		}else {
			am.set(AlarmManager.RTC_WAKEUP, cal.getTimeInMillis(), sender);
		}
	}
}
