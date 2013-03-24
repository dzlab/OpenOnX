package org.dotot.helper;

public interface Action {

	public void execute();
	
	public String serialize(); 
	public void unserialize(String serialized);
}
