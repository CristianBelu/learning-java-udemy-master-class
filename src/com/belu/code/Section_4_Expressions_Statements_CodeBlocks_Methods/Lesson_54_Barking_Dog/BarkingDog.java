package com.belu.code.Section_4_Expressions_Statements_CodeBlocks_Methods.Lesson_54_Barking_Dog;

public class BarkingDog {

	public static boolean shouldWakeUp(boolean barking, int hourOfDay) {
		if (hourOfDay < 0 || hourOfDay > 23) {
			return false;
		} else if (hourOfDay >= 8 && hourOfDay <= 22) {
			return false;
		} else if ((hourOfDay > 0 && hourOfDay < 8) || (hourOfDay > 22)) {
			return barking;
		}
		return barking;
	}
}
