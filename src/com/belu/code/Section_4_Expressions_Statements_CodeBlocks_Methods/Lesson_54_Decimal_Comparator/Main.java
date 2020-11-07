package com.belu.code.Section_4_Expressions_Statements_CodeBlocks_Methods.Lesson_54_Decimal_Comparator;

public class Main {
	public static void main(String[] args) {
		System.out.println(DecimalComparator.areEqualByThreeDecimalPlaces(3.234, 3.234));
		System.out.println(DecimalComparator.areEqualByThreeDecimalPlaces(3.234, -3.234));
		System.out.println(DecimalComparator.areEqualByThreeDecimalPlaces(3.234, 3.2345));
		System.out.println(DecimalComparator.areEqualByThreeDecimalPlaces(3.0, 3.0));
	}
}
