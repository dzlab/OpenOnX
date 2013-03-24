package org.onx.controller;

import java.util.Calendar;

import org.onx.MainActivity;
import org.onx.receiver.OneShotAlarm;
import org.onx.receiver.RepeatingAlarm;

import android.app.Activity;
import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.SystemClock;

public class AlarmController {
	
	protected Context mContext;
	public AlarmController(Context context) {
		mContext = context;
	}
	
	/** When the alarm goes off, we want to broadcast an Intent to our BroadcastReceiver.  
	 * Here we make an Intent with an explicit class name to have our own receiver (which has been published in AndroidManifest.xml) instantiated and called, and then create an IntentSender to have the intent executed as a broadcast. 
	 * @param triggerAtTime when to trigger this alarm */
	public void oneShotAlarm(String event_type, long triggerAtTime) {
		
		if(mContext==null)
			mContext = MainActivity.mContext;
		Intent intent = new Intent(mContext, OneShotAlarm.class);
        intent.putExtra("event_type", event_type);
        PendingIntent sender = PendingIntent.getBroadcast(mContext, 0, intent, 0);
        
        // We want the alarm to go off 30 seconds from now.
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(System.currentTimeMillis());
        calendar.add(Calendar.SECOND, 30);calendar.getTimeInMillis();

        // Schedule the alarm!
        AlarmManager am = (AlarmManager)mContext.getSystemService(Activity.ALARM_SERVICE);
        am.set(AlarmManager.RTC_WAKEUP, triggerAtTime, sender);
	}
	
	/** When the alarm goes off, we want to broadcast an Intent to our BroadcastReceiver. 
	 * Here we make an Intent with an explicit class name to have our own receiver (which has been published in AndroidManifest.xml) instantiated and called, and then create an IntentSender to have the intent executed as a broadcast.
	 * Note that unlike with oneShotAlarm(), this IntentSender is configured to allow itself to be sent multiple times.
	 * @param firstTime when the alarm has to go off. 
	 * @param interval between two alarms */
	public void startRepeatedAlarm(String event_type, long first_time, long interval) {
		
		if(mContext==null)
			mContext = MainActivity.mContext;
        Intent intent = new Intent(mContext, RepeatingAlarm.class);
        intent.putExtra("event_type", event_type);
        PendingIntent sender = PendingIntent.getBroadcast(mContext, 0, intent, 0);

        //long firstTime = SystemClock.elapsedRealtime();
        //firstTime += 15*1000;

        // Schedule the alarm!
        AlarmManager am = (AlarmManager)mContext.getSystemService(Activity.ALARM_SERVICE);
        am.setRepeating(AlarmManager.ELAPSED_REALTIME_WAKEUP, first_time, interval, sender);
	}
	
	/** Called to remove a scheduled alarm */
	public void stopRepeatedAlram() {
		// Create the same intent, and thus a matching IntentSender, for the one that was scheduled.
		if(mContext==null)
			return;
        Intent intent = new Intent(mContext, RepeatingAlarm.class);
        PendingIntent sender = PendingIntent.getBroadcast(mContext, 0, intent, 0);

        // And cancel the alarm.
        AlarmManager am = (AlarmManager)mContext.getSystemService(Activity.ALARM_SERVICE);
        am.cancel(sender);
	}
}
