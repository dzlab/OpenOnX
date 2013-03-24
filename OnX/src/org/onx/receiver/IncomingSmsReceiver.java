package org.onx.receiver;

import org.onx.antlr.pojo.Events;
import org.onx.controller.Scheduler;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.telephony.SmsMessage;
import android.util.Log;
import android.widget.Toast;


public class IncomingSmsReceiver extends BroadcastReceiver {

	public static final String TAG    = IncomingSmsReceiver.class.getSimpleName();
	public static final String ACTION = "android.provider.Telephony.SMS_RECEIVED";
	
	/** Called when an broadcast intent for an incoming SMS is received */
	@Override
	public void onReceive(Context context, Intent intent) {
		/** get the message passed in */
		Bundle bundle = intent.getExtras();
		SmsMessage[] msgs = null;
		String str = "";
		if(bundle != null) {
			Object[] pdus = (Object[]) bundle.get("pdus");
			msgs = new SmsMessage[pdus.length];
			for (int i=0; i < msgs.length; i++) {
				msgs[i] = SmsMessage.createFromPdu((byte[])pdus[i]);
				str += "SMS from " + msgs[i].getOriginatingAddress()
					+ " :"
					+ msgs[i].getMessageBody().toString()
					+ "\n";
				Log.i(TAG, "Incoming sms from: " + msgs[i].getOriginatingAddress());
			}
			//Toast.makeText(context, str, Toast.LENGTH_SHORT).show();			
			Scheduler.execute(Events.INOMING_SMS);
		}
	}

}
