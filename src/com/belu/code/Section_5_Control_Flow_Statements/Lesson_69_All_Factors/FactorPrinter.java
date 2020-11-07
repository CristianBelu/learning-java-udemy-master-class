package com.belu.code.Section_5_Control_Flow_Statements.Lesson_69_All_Factors;

public class FactorPrinter {

	public static void printFactors(int number) {
		if (number < 1) {
			System.out.println("Invalid Value");
		}
		for (int i = 1; i <= number; i++) {
			if (number % i == 0) {
				System.out.print(i + " ");
			}
		}
	}
}
