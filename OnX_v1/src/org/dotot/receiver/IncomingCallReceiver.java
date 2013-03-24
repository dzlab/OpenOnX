package org.dotot.receiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.telephony.TelephonyManager;
import android.util.Log;
import android.widget.Toast;

public class IncomingCallReceiver extends BroadcastReceiver {
	
	public static final String TAG = IncomingCallReceiver.class.getSimpleName();

	@Override
	public void onReceive(Context context, Intent intent) {
        Bundle bundle = intent.getExtras();
        
        if(null == bundle)
                return;
        
        Log.i(TAG, bundle.toString());
        
        String state = bundle.getString(TelephonyManager.EXTRA_STATE);
                        
        Log.i(TAG, "State: "+ state);
        
        if(state.equalsIgnoreCase(TelephonyManager.EXTRA_STATE_RINGING)) {
        	String phonenumber = bundle.getString(TelephonyManager.EXTRA_INCOMING_NUMBER);
            Log.i(TAG, "Incomng Number: " + phonenumber);
            String info = "Detect Calls sample application\nIncoming number: " + phonenumber;
            Toast.makeText(context, info, Toast.LENGTH_LONG).show();
        }
		
	}

}
