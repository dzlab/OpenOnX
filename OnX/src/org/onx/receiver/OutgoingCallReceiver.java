package org.onx.receiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

public class OutgoingCallReceiver extends BroadcastReceiver{

	public static final String TAG = OutgoingCallReceiver.class.getSimpleName();
	
	/** Called when an broadcast intent for an outgoing call is received */
	@Override
	public void onReceive(Context context, Intent intent) {
        Bundle bundle = intent.getExtras();
        
        if(null == bundle)
        	return;

        String phonenumber = intent.getStringExtra(Intent.EXTRA_PHONE_NUMBER);

        Log.i(TAG, phonenumber);
        Log.i(TAG, bundle.toString());
        
        String info = "Detect Calls sample application\nOutgoing number: " + phonenumber;        
        Toast.makeText(context, info, Toast.LENGTH_LONG).show();
		
	}

}
