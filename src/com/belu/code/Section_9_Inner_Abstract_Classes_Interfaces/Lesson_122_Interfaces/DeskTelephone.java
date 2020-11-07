package com.belu.code.Section_9_Inner_Abstract_Classes_Interfaces.Lesson_122_Interfaces;

public class DeskTelephone implements ITelephone {

	private int myNumber;
	private boolean isRinging;
	
	

	public DeskTelephone(int myNumber) {
		super();
		this.myNumber = myNumber;
	}

	@Override
	public void powerOn() {
		System.out.println("No action taken, desk phone has no power button");
	}

	@Override
	public void dial(int phoneNumber) {
		System.out.println("Now ringing " + phoneNumber + " on desk phone");
	}

	@Override
	public void answer() {
		if (isRinging) {
			System.out.println("Answering the desk phone");
			isRinging = false;
		}
	}

	@Override
	public boolean callPhone(int phoneNumber) {
		if (phoneNumber == myNumber) {
			isRinging = true;
			System.out.println("Ring ring...");
		} else {
			isRinging = false;
		}

		return isRinging;
	}

	@Override
	public boolean isRinging() {
		return isRinging;
	}

}
