package org.onx.receiver;

import org.onx.R;
import org.onx.controller.Scheduler;

import android.content.Context;
import android.content.Intent;
import android.content.BroadcastReceiver;
import android.util.Log;

// Need the following import to get access to the app resources, since this
// class is in a sub-package.

/**
 * This is an example of implement an {@link BroadcastReceiver} for an alarm that should occur once.
 * <p>
 * When the alarm goes off, we show a <i>Toast</i>, a quick message.
 */
public class OneShotAlarm extends BroadcastReceiver {
		
	/** Called when a broadcast intent for a scheduled alarm is received */
    @Override
    public void onReceive(Context context, Intent intent) {
    	String event_type = intent.getStringExtra("event_type");
    	Scheduler.execute(event_type);
        Log.v("OneShotAlarm", "Executing scheduled action for received one shot alarm " + event_type);
    }
}