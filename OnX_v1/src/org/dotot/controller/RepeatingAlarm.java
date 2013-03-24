package org.dotot.controller;

import org.dotot.R;

import android.content.Context;
import android.content.Intent;
import android.content.BroadcastReceiver;
import android.widget.Toast;

/**
 * This is an example of implement an {@link BroadcastReceiver} for an alarm that
 * should occur once.
 */
public class RepeatingAlarm extends BroadcastReceiver
{
    @Override
    public void onReceive(Context context, Intent intent)
    {
    	String name = intent.getStringExtra("action_name");
    	String body = intent.getStringExtra("action_body");
        Toast.makeText(context, R.string.repeating_received + ": " + name, Toast.LENGTH_SHORT).show();
    }
}
