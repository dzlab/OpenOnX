package org.onx.antlr.pojo;

public class Events {

	// communication related events
	public static final String INOMING_CALL  = "incoming_call";
	public static final String OUTGOING_CALL = "outgoing_call";
	public static final String INOMING_SMS   = "incoming_sms";
	public static final String OUTGOING_SMS  = "outgoing_sms";
	
	// device related events
	public static final String BATTERY_LOW   = "battery_low";
	public static final String BATTERY_HIGH  = "battery_high";
	public static final String WIFI_AVAILABLE= "wifi_available";
	
	// location related events
	public static final String ENTERING_HOME = "entering_home";
	public static final String LEAVING_HOME  = "leaving_home";
	public static final String ENTERING_WORK = "entering_work";
	public static final String LEAVING_WORK  = "leaving_work";
	
	/** Check if a given word is a location, or a known landscape, or if an event correspond to a location */
	public static boolean isLocation(String word) {
    	boolean is = false;
    	//TODO build a location-related terms dictionary
    	if(word.endsWith("home")||word.endsWith("work")||word.endsWith("university")||word.endsWith("school"))
    		is = true;
    	return is;
    }
	
	/** Check for a given event type if it's about entering or leaving */
	public static boolean isEntering(String eventType) {
		boolean entering = true;
		if(eventType.startsWith("leave")||eventType.startsWith("depart")) {
			entering = false;
		}
		return entering;
	}
	
	/** Check for a given event type if it's about a birthday of one of user contacts, or of the device owner */
	public static boolean isBirthday(String event) {
		boolean is = false;
		if(event.endsWith("birthday"))
    		is = true;
		return is;
	}
}
