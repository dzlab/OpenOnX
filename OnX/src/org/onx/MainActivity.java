package org.onx;


import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import org.antlr.runtime.RecognitionException;
import org.onx.R;
import org.onx.antlr.Interpreter;
import org.onx.antlr.pojo.Vars;
import org.onx.controller.AlarmController;
import org.onx.controller.LocationController;
import org.onx.helper.Provider;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.os.Bundle;
import android.speech.RecognizerIntent;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends Activity {
	
	protected static int REQUEST_CODE = 1234;
	public static AlarmController mAlarmCtlr;
	public static LocationController mLocationCtlr;
	public static Context mContext;
	
	protected TextView input;
	
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        input = (TextView) findViewById(R.id.input);
        Button interpret = (Button) findViewById(R.id.interpret);
        interpret.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				test(input.getText().toString());
			}
		});
        Button voice = (Button) findViewById(R.id.voice);
        PackageManager pm = getPackageManager();
        Intent intent = new Intent(RecognizerIntent.ACTION_RECOGNIZE_SPEECH);
        List<ResolveInfo> recognizers = pm.queryIntentActivities(intent, 0);
        if (recognizers.size() == 0) {
        	voice.setEnabled(false);
        	voice.setText("No voice recognizer available");
        } 
        init();
        
        //new TimeRule(this).schedule();
        //new LocationRule(this).schedule();
/*
        setContentView(R.layout.alarm_controller);        
        // Watch for button clicks.
        Button button = (Button)findViewById(R.id.one_shot);        
		button.setOnClickListener(mOneShotListener);
        button = (Button)findViewById(R.id.start_repeating);
        button.setOnClickListener(mStartRepeatingListener);
        button = (Button)findViewById(R.id.stop_repeating);
        button.setOnClickListener(mStopRepeatingListener);
*/        
        test("notify me when battery down");
    }
    
    /** Called to initialize global variables */
    protected void init() {
        mContext      = this;
        mAlarmCtlr    = new AlarmController(this);
        mLocationCtlr = new LocationController();
        mLocationCtlr.startListening();
        Vars.USERs = Provider.getContacts();
    }
    
	/** Handle the voice button onClick event to request a speech recognition service */
    public void voiceButtonClicked(View v) {
    	Intent intent = new Intent(RecognizerIntent.ACTION_RECOGNIZE_SPEECH);
        intent.putExtra(RecognizerIntent.EXTRA_LANGUAGE_MODEL,
        		RecognizerIntent.LANGUAGE_MODEL_FREE_FORM);
        intent.putExtra(RecognizerIntent.EXTRA_LANGUAGE, Locale.ENGLISH);
        intent.putExtra(RecognizerIntent.EXTRA_PROMPT, "Transalation Demo...");        
        startActivityForResult(intent, REQUEST_CODE);
    }
    
    /** Handle the results from the voice recognition activity. */
    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent intent) {
        if (requestCode == REQUEST_CODE && resultCode == RESULT_OK) {
            ArrayList<String> matches = intent.getStringArrayListExtra(RecognizerIntent.EXTRA_RESULTS);
            String STT = "";
            for(String text : matches) {
            	STT += text + " ";
            }
            input.setText(STT);            
        }
        super.onActivityResult(requestCode, resultCode, intent);
    }
/*    
    private OnClickListener mOneShotListener = new OnClickListener() {
        public void onClick(View v) {
        	mController.oneShotAlarm();
        }
    };
    private OnClickListener mStartRepeatingListener = new OnClickListener() {
        public void onClick(View v) {
        	mController.startRepeatedAlarm();
        }
    };
            
    private OnClickListener mStopRepeatingListener = new OnClickListener() {               
    	public void onClick(View v) {
    		mController.stopRepeatedAlram();
    	}
    };
*/    
    /** Called to test a user input */
    public boolean test(String command) {
    	boolean success = false;
    	try {
    		InputStream input = new ByteArrayInputStream(command.getBytes());        	
            Interpreter interpreter = new Interpreter();
			interpreter.interp(input);
		} catch (RecognitionException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return success;
    }
}