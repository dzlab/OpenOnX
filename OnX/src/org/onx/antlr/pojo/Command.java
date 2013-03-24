package org.onx.antlr.pojo;


public class Command implements java.io.Serializable {
	
	/**	 */
	private static final long serialVersionUID = -8518551108575648535L;

	protected String mService; 
	protected String mOption;
	protected User mUser;
	protected String mArgument;	

	/** Execute the action that correspond to the current {@link Command} */
	public void execute() {
		ServiceFactory.create(mService, mOption).execute(mOption, mUser, mArgument);
	}
	
	public void setService(String service) {
		mService = service;
	}
	public String getService() {
		return mService;
	}
	public void setOption(String option) {
		mOption = option;
	}
	public String getOption() {
		return mOption;
	}
	public void setUser(User user) {
		mUser = user;
	}
	public User getUser() {
		return mUser;
	}
	public void setArgument(String arg) {
		mArgument = arg;
	}
	public String getArgument() {
		return mArgument;
	}
	
}
