package org.onx.antlr.pojo.service;

import org.onx.antlr.pojo.User;

public interface IService {
	//public Service getInstance();
	public void execute(String option, User user, String argument);
}
 