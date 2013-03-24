package org.onx.antlr.pojo.service;

import org.onx.antlr.pojo.User;

import android.telephony.SmsManager;

public class SmsService implements IService {

	private static SmsService instance;
	private SmsService() {}
	public static SmsService getInstance() {
		if(instance==null)
			instance = new SmsService();
		return instance;
	}
	
	@Override
	public void execute(String option, User user, String argument) {
		if(option.equals("send"))
			SmsManager.getDefault().sendTextMessage(user.getNumber(), null, argument, null, null);
	}

}
