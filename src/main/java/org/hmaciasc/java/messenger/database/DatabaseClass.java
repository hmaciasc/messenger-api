package org.hmaciasc.java.messenger.database;

import java.util.HashMap;
import java.util.Map;

import org.hmaciasc.java.messenger.model.Message;
import org.hmaciasc.java.messenger.model.Profile;

public class DatabaseClass {

	private static Map<Long, Message> messages = new HashMap<>();
	private static Map<String, Profile> profiles = new HashMap<>();
	
	
	public static Map<Long, Message> getMessages() {
		return messages;
	}
	
	public static Map<String, Profile> getProfiles() {
		return profiles;
	}
	
}