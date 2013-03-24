package org.onx.receiver;

import org.onx.controller.Scheduler;

import android.content.Context;
import android.content.Intent;
import android.content.BroadcastReceiver;
import android.util.Log;

/**
 * This is an example of implement an {@link BroadcastReceiver} for an alarm that
 * should occur once.
 */
public class RepeatingAlarm extends BroadcastReceiver {
    
	/** Called when an broadcast intent for a repeating alarm is received */
	@Override
    public void onReceive(Context context, Intent intent) {
    	String event_type = intent.getStringExtra("event_type");
    	Scheduler.execute(event_type);
        Log.v("RepeatingAlarm", "Executing scheduled action for received repeated alarm " + event_type);
    }
}
