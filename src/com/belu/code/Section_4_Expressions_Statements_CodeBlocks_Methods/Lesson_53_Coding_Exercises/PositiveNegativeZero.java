package com.belu.code.Section_4_Expressions_Statements_CodeBlocks_Methods.Lesson_53_Coding_Exercises;

public class PositiveNegativeZero {
	public static void main(String[] args) {
		checkNumber(-1);
	}

	public static void checkNumber(int number) {
		if (number > 0) {
			System.out.println("positive");
		} else if (number < 0) {
			System.out.println("negative");
		} else
			System.out.println("zero");
	}
}
