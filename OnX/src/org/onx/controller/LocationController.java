package org.onx.controller;

import org.onx.MainActivity;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.Bundle;

public class LocationController implements LocationListener {
	
	public static final String PROXIMITY_ALERT_INTENT = "org.onx.action.PROXIMITY_ALERT";
	public static final float POINT_RADIUS = 50f;
	public static final long ALERT_EXPIRATION = -1;
	
	private static final long MINIMUM_DISTANCE_FOR_UPDATE = 10;      // in Meters
	private static final long MINIMUM_TIME_BETWEEN_UPDATE = 60*1000; // in Milliseconds
		
	protected static Location currentLocation;
	protected LocationManager locationManager;
	
	/** Initiate location tracking */
	public void startListening() {
		Context context = MainActivity.mContext;
		locationManager = (LocationManager) context.getSystemService(Context.LOCATION_SERVICE);
		locationManager.requestLocationUpdates(LocationManager.GPS_PROVIDER, 
				MINIMUM_TIME_BETWEEN_UPDATE,
				MINIMUM_DISTANCE_FOR_UPDATE, 
				this
		);		
		/** get last known location and stored into current location variable */
		currentLocation = locationManager.getLastKnownLocation(LocationManager.GPS_PROVIDER);		
	}

	/** Stop location tracking */
	public void stopListening() {
		locationManager.removeUpdates(this);		
	}
	
	/** Check-in or tag current location to use it later in user inputed commands */
	public static Location getCurrent() {
		if(currentLocation == null) {
			Context context = MainActivity.mContext;
			LocationManager manager = (LocationManager) context.getSystemService(Context.LOCATION_SERVICE);
			currentLocation = manager.getLastKnownLocation(LocationManager.GPS_PROVIDER);
		}
		return currentLocation;
	}
	
	/** Add a new proximity alert for the provided event */
	public void addProximityAlert(String event, Location location, boolean entering) {
		Intent intent = new Intent(PROXIMITY_ALERT_INTENT);		
		intent.putExtra("event", event);
		PendingIntent proximityIntent = PendingIntent.getBroadcast(MainActivity.mContext, 0, intent, 0);			         
		locationManager.addProximityAlert(				
				location.getLatitude(),  // the latitude of the central point of the alert region		
				location.getLongitude(), // the longitude of the central point of the alert region		
				POINT_RADIUS, // the radius of the central point of the alert region, in meters		
				ALERT_EXPIRATION, // time for this proximity alert, in milliseconds, or -1 to indicate no expiration		
				proximityIntent // will be used to generate an Intent to fire when entry to or exit from the alert region is detected
		);	         		
	}
	
	/** Called when a new GPS location update is available */
	@Override
	public void onLocationChanged(Location location) {
		currentLocation = location;
/*		
		Location pointLocation = retrievelocationFromPreferences();
		// distance should be calculated to declared POI
		float distance = location.distanceTo(lastLocation);
		// check if any command is registered for this distance
		Toast.makeText(ProxAlertActivity.this, "Distance from Point:"+distance, Toast.LENGTH_LONG).show();
*/		
	}

	@Override
	public void onProviderDisabled(String provider) {}

	@Override
	public void onProviderEnabled(String provider) {}

	@Override
	public void onStatusChanged(String provider, int status, Bundle extras) {}

}
