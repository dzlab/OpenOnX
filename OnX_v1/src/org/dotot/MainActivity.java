package org.dotot;


import org.dotot.controller.AlarmController;
import org.dotot.helper.LocationRule;
import org.dotot.helper.TimeRule;
import org.dotot.service.AlarmService;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

public class MainActivity extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        //new TimeRule(this).schedule();
        //new LocationRule(this).schedule();
        //Intent intent = new Intent(this, AlarmController.class);
        //Intent intent = new Intent(this, AlarmService.class); 
        //startActivity(intent);
    }
}