package org.onx.antlr.pojo;

import org.onx.antlr.pojo.service.NotificationService;
import org.onx.antlr.pojo.service.IService;
import org.onx.antlr.pojo.service.SmsService;

public class ServiceFactory {

	/** Called to create an instance of an executable service based on the service designation provided by user */
	public static IService create(String name, String option) {
		String service = name;
		if(service==null || service.equals(""))
			service = option;
		// check if it is a messaging service
		if(service.equalsIgnoreCase("sms") || service.equalsIgnoreCase("message"))
			return SmsService.getInstance();
		// check if it is a notification service
		if(service.equalsIgnoreCase("notify"))
			return NotificationService.getInstance();
		
		return null;
	}
}
