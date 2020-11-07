package com.belu.code.Section_8_Arrays_Lists_Autoboxing_Unboxing.Lesson_105_ArrayList_Challenge;

public class Contact {
	private String name;
	private String phoneNumber;
	
	public Contact(String name, String phoneNumber) {
		this.name = name;
		this.phoneNumber = phoneNumber;
	}
	
	public String getName() {
		return name;
	}
	
	public String getPhoneNumber() {
		return phoneNumber;
	}
	
	public static Contact createContact(String name, String phoneNumber) {
		return new Contact(name,phoneNumber);
	}
}
