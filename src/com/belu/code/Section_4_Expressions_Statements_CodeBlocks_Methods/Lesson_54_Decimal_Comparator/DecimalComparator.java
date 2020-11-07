package com.belu.code.Section_4_Expressions_Statements_CodeBlocks_Methods.Lesson_54_Decimal_Comparator;

public class DecimalComparator {

	public static boolean areEqualByThreeDecimalPlaces(double a, double b) {

		int number1 = (int) (a *= 1000);
		int number2 = (int) (b *= 1000);

		if (number1 == number2) {
			return true;
		}
		return false;
	}
}
