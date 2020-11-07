package com.belu.code.Section_4_Expressions_Statements_CodeBlocks_Methods.Lesson_54_Teen_Number_Checker;

public class TeenNumberChecker {

	public static boolean hasTeen(int first, int second, int third) {
		if (isTeen(first) || isTeen(second) || isTeen(third)) {
			return true;
		} else {
			return false;
		}
	}

	public static boolean isTeen(int age) {
		if (age >= 13 && age <= 19) {
			return true;
		} else {
			return false;
		}
	}
}
