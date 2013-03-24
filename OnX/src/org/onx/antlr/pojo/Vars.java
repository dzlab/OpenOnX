package org.onx.antlr.pojo;

import java.util.HashMap;

import android.location.Location;

public class Vars {

	
	/** map a label (e.g. wife, friend) to one of the user's contacts */
	public static HashMap<String, User> USERs = new HashMap<String, User>();
	
	/** map a user defined location label to GPS location */
	public static HashMap<String, Location> poiGps = new HashMap<String, Location>();
	
	/** map a user defined location label to the corresponding user */
	public static HashMap<String, User> poiUser = new HashMap<String, User>();
	
	/** POI stands for Point of interest */
	public static void addPoiForLocation(String poi, Location location) {
		poiGps.put(poi, location);
	}
	
	/** Attach a given POI to a user */
	public static void addPoiForUser(String poi, User user) {
		poiUser.put(poi, user);
	}
	
	/** @return a {@link User} defined by corresponding label (e.g. wife, friend) or current user owner of the device */
	public static User getUserById(String identifier) {
		User user = null;
		if(identifier==null || identifier.equals("") || identifier.equals("me") || identifier.equals("my")) {
			user = USERs.get("current");
		}else {
			user = USERs.get(identifier);
		}
		return user;
	}
	
	public static Location getLocationByPoi(String poi) {
		return poiGps.get(poi);
	}
}
