package com.belu.code.Section_9_Inner_Abstract_Classes_Interfaces.Lesson_122_Interfaces;

public interface ITelephone {
	public void powerOn();
	public void dial(int phoneNumber);
	public void answer();
	public boolean callPhone(int phoneNumber);
	public boolean isRinging();
}
