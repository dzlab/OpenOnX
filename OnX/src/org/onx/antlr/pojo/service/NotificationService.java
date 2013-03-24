package org.onx.antlr.pojo.service;

import org.onx.MainActivity;
import org.onx.antlr.pojo.User;

import android.widget.Toast;

public class NotificationService implements IService {

	private static NotificationService instance;
	private NotificationService() {}
	public static NotificationService getInstance() {
		if(instance==null)
			instance = new NotificationService();
		return instance;
	}
	@Override
	public void execute(String option, User user, String argument) {
		Toast.makeText(MainActivity.mContext, argument, Toast.LENGTH_LONG).show();
	}

}
