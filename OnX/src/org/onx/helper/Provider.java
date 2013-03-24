package org.onx.helper;

import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.Date;

import org.onx.MainActivity;
import org.onx.antlr.pojo.User;

import android.database.Cursor;
import android.net.Uri;
import android.provider.ContactsContract;
import android.provider.ContactsContract.PhoneLookup;
import android.util.Log;

public class Provider {

	public static HashMap<String, User> getContacts() {
		HashMap<String, User> contacts = new HashMap<String, User>();			
		Cursor cursor = MainActivity.mContext.getContentResolver().query(ContactsContract.Contacts.CONTENT_URI, null, null, null, null); 
		while (cursor.moveToNext()) { 
			User user = new User();
			int idxColumnID = cursor.getColumnIndex(ContactsContract.CommonDataKinds.StructuredName._ID);
			String ID = cursor.getString(idxColumnID);
			user.setID(ID);
			int idxColumnName = cursor.getColumnIndex(ContactsContract.Contacts.DISPLAY_NAME);
			user.setName(cursor.getString(idxColumnName));
			int idxColumnHasPhone = cursor.getColumnIndex(ContactsContract.CommonDataKinds.StructuredName.HAS_PHONE_NUMBER);
			user.setBirthday(getBirthday(ID));
			boolean hasPhone = Boolean.parseBoolean(cursor.getString(idxColumnHasPhone));			
			if (hasPhone) { 
				user.setNumber(getPhone(ID));
			}
			if(user.getID() != null)
				contacts.put(user.getID(), user);
		}		
		cursor.close();	
		Log.v("ContactProvider", "Number of contacts: " + contacts.size());
		return contacts;
	}
	
	public static String getPhone(String ID) {
		String phone = null;
		Uri uri = ContactsContract.CommonDataKinds.Phone.CONTENT_URI;
		String where = ContactsContract.CommonDataKinds.Phone.CONTACT_ID +" = "+ ID;
		Cursor cursor = MainActivity.mContext.getContentResolver().query(uri, null, where, null, null);				
		if (cursor.moveToNext()) {
			String column = PhoneLookup.NUMBER;
			//String column = ContactsContract.CommonDataKinds.Phone.NUMBER;
			int idxColumnNumber = cursor.getColumnIndex(column);
			String phoneNumber = cursor.getString(idxColumnNumber);
			phone = phoneNumber;
		} 
		cursor.close();
		return phone;
	}
	
	public static Date getBirthday(String ID) {
		Date birthday = null;
		Cursor cursor = null;
		try {
			Uri uri = ContactsContract.Data.CONTENT_URI;
	        String[] projection = new String[] {
	                ContactsContract.CommonDataKinds.Event.CONTACT_ID,
	                ContactsContract.CommonDataKinds.Event.START_DATE
	        };
	        
	        String where =
	        		ContactsContract.CommonDataKinds.Event.CONTACT_ID + "=" + ID + " AND " +
	                ContactsContract.Data.MIMETYPE + "= ? AND " +
	                ContactsContract.CommonDataKinds.Event.TYPE + "=" + ContactsContract.CommonDataKinds.Event.TYPE_BIRTHDAY;
	        String[] selectionArgs = new String[] {ContactsContract.CommonDataKinds.Event.CONTENT_ITEM_TYPE};
	        String sortOrder = null;		
			cursor = MainActivity.mContext.getContentResolver().query(uri, projection, where, selectionArgs, sortOrder);
					
			if (cursor.moveToNext()) {
				int idxColumnBirthday = cursor.getColumnIndex(ContactsContract.CommonDataKinds.Event.START_DATE);			
				if(idxColumnBirthday!=-1) {
					String dateStr = cursor.getString(idxColumnBirthday);		
					SimpleDateFormat curFormater = new SimpleDateFormat("dd/MM/yyyy"); 
					birthday = curFormater.parse(dateStr);
				}
			} 					
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			cursor.close();
		}
    	
    	
    	return birthday;
    }

}
