package com.belu.code.Section_9_Inner_Abstract_Classes_Interfaces.Lesson_122_Interfaces;

public class Main {
	public static void main(String[] args) {
		ITelephone timsphone;
		timsphone = new DeskTelephone(123456);
		
		timsphone.powerOn();
		timsphone.callPhone(123456);
		timsphone.answer();
		
		timsphone = new MobilePhone(24565);
		timsphone.powerOn();
		timsphone.callPhone(24565);
		timsphone.answer();
		
	}
}
