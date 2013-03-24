package org.onx.antlr.pojo;

import java.util.Calendar;
import java.util.Date;

public class User implements java.io.Serializable {

	/**	 */
	private static final long serialVersionUID = 7331404539386434383L;
	
	/** @return true if the word in parameter is a possessive pronoun, false otherwise */
	public static boolean isPronoun(String word) {
		boolean is = false;
		if(word.equals("his") || word.equals("her") || word.equals("my") 
				|| word.equals("their") || word.equals("us") || word.equals("its"))
			is = true;
		return is;
	}
	
	/** @return a {@link String} where the pronoun is replace by the name of this user */
	public String replaceProoun(String word) {
		String str = word;
		int uindex = word.indexOf("_");
		int pindex = word.indexOf("his");
		if(pindex < uindex)
			str = str.replaceFirst("his", name);
		pindex = word.indexOf("her");
		if(pindex < uindex)
			str = str.replaceFirst("her", name);
		pindex = word.indexOf("my");
		if(pindex < uindex)
			str = str.replaceFirst("my", name);
		pindex = word.indexOf("their");
		if(pindex < uindex)
			str = str.replaceFirst("their", name);
		pindex = word.indexOf("us");
		if(pindex < uindex)
			str = str.replaceFirst("us", name);
		pindex = word.indexOf("its");
		if(pindex < uindex)
			str = str.replaceFirst("its", name);
		
		return str;
	}
	
	protected String id;
	protected String name;
	protected String number;
	protected Date birthday;
	
	public String getID() {
		return id;
	}
	public void setID(String id) {
		this.id = id;
	}	
	public void setName(String name) {
		this.name = name;
	}
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}
	
	/** @return the exact birthday of this user */
	public Date getBirthday() {
		return birthday;
	}
	
	/** @return the next birthday event of this user in milliseconds. */
	public long getNextBirthdayEvent() {
		long time = 0;
		Calendar birth_cal = Calendar.getInstance();
		birth_cal.setTimeInMillis(birthday.getTime());
		int birth_month = birth_cal.get(Calendar.MONTH);
		int birth_day = birth_cal.get(Calendar.DAY_OF_MONTH);
		Calendar current_cal = Calendar.getInstance(); 
		int current_year = current_cal.get(Calendar.YEAR);
		int current_month = current_cal.get(Calendar.MONTH);
		int current_day = current_cal.get(Calendar.DAY_OF_MONTH);
		
		Calendar cal = Calendar.getInstance();
		cal.set(Calendar.DAY_OF_MONTH, birth_day);
		cal.set(Calendar.MONTH, birth_month);
		if((current_month>birth_month) || (current_month==birth_month && current_day>birth_day)){			
			cal.set(Calendar.YEAR, current_year + 1);
			time = cal.getTimeInMillis();
		}else {
			cal.set(Calendar.YEAR, current_year);
			time = cal.getTimeInMillis();
		}
		return time;
	}
}
