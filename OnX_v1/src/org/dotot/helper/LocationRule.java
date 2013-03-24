package org.dotot.helper;

import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.Bundle;
import android.widget.Toast;

public class LocationRule {
	
	private static String TREASURE_PROXIMITY_ALERT = "com.paad.treasurealert";
	
	protected Context mContext;
	protected LocationManager locationManager;
	protected PendingIntent proximityIntent;
	
	public LocationRule(Context context) {
		mContext = context;
	}

	public Location checkIn() {
		String provider = LocationManager.GPS_PROVIDER;
		return locationManager.getLastKnownLocation(provider);
	}
	
	/** Start listening to location updates on the provided source*/
	public void startListening(String provider) {
		//String provider = LocationManager.GPS_PROVIDER;
		int t = 5000; // milliseconds
		int distance = 5; // meters
		locationManager.requestLocationUpdates(provider, t, distance, locationListener);
	}
	/** Stop listening to location updates*/
	public void stopListening() {
		locationManager.removeUpdates(locationListener);		
	}
	
	/** Schedule a proximity alerts to execute actions when notified */
	public void schedule(String name, Location location, float radius, Action action) {				
		locationManager = (LocationManager) mContext.getSystemService(Context.LOCATION_SERVICE);
		//String provider = LocationManager.GPS_PROVIDER;
		//Location location = locationManager.getLastKnownLocation(provider);
		
	    double lat = location.getLatitude();  //73.147536;
	    double lng = location.getLongitude(); //0.510638;
	    //float radius = 100f; // meters
	    long expiration = -1; // do not expire
	 
	    // Register a BroadcastReceiver to be notified when proximity events are sent
	    // should be declared in the manifest, no?
	    IntentFilter filter = new IntentFilter(TREASURE_PROXIMITY_ALERT);
	    mContext.registerReceiver(new ProximityIntentReceiver(), filter);
	    
	    // Subscribe to receive proximity alerts
	    Intent intent = new Intent(TREASURE_PROXIMITY_ALERT);
	    intent.putExtra("action_name", "dailyHoroscopeTimer");
		intent.putExtra("action_body", "user action"); //action.serialize();
	    proximityIntent = PendingIntent.getBroadcast(mContext, -1, intent, 0);	    
	    locationManager.addProximityAlert(lat, lng, radius, expiration, proximityIntent);	    
	}
	
	public void unschedule() {
		locationManager.removeUpdates(proximityIntent);
	}
	
    public class ProximityIntentReceiver extends BroadcastReceiver {
        @Override
        public void onReceive (Context context, Intent intent) {
            String key = LocationManager.KEY_PROXIMITY_ENTERING;
            Boolean entering = intent.getBooleanExtra(key, false);
            String name = intent.getStringExtra("action_name");
            String body = intent.getStringExtra("action_body");
            Toast.makeText(mContext, "Received proximity alert " + ": " + name, Toast.LENGTH_LONG).show();
        }
    }
    
    protected LocationListener locationListener = new LocationListener() {
        public void onLocationChanged(Location location) {
            // Update application based on new location.
        }
        public void onProviderDisabled(String provider){
            // Update application if provider disabled.
        }
        public void onProviderEnabled(String provider){
            // Update application if provider enabled.
        }
        public void onStatusChanged(String provider, int status, Bundle extras){
            // Update application if provider hardware status changed.
        }
    };
}
