package org.onx.receiver;

import org.onx.controller.Scheduler;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;

public class ProximityAlertReceiver extends BroadcastReceiver {

	public static final String TAG = ProximityAlertReceiver.class.getSimpleName();
	public static final String EVENT_ID_INTENT_EXTRA = "EventIDIntentExtraKey";
	
	@Override
	public void onReceive(Context context, Intent intent) {
		String event = intent.getStringExtra("event");
		Log.v(TAG,"Proximity Alert Intent Received for event = "+event);
		Bundle bundle = intent.getExtras();
		Boolean entering = (Boolean) bundle.get(android.location.LocationManager.KEY_PROXIMITY_ENTERING);
		
		Scheduler.execute(event, entering);
		
	}

}
