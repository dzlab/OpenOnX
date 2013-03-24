package org.dotot.controller;

import org.dotot.R;

import android.content.Context;
import android.content.Intent;
import android.content.BroadcastReceiver;
import android.widget.Toast;

// Need the following import to get access to the app resources, since this
// class is in a sub-package.

/**
 * This is an example of implement an {@link BroadcastReceiver} for an alarm that
 * should occur once.
 * <p>
 * When the alarm goes off, we show a <i>Toast</i>, a quick message.
 */
public class OneShotAlarm extends BroadcastReceiver
{
    @Override
    public void onReceive(Context context, Intent intent)
    {
    	String name = intent.getStringExtra("action_name");
    	String body = intent.getStringExtra("action_body");
        Toast.makeText(context, R.string.one_shot_received + ": " + name, Toast.LENGTH_SHORT).show();
    }
}