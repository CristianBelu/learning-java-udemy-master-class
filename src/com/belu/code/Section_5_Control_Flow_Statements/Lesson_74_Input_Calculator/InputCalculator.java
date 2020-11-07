package com.belu.code.Section_5_Control_Flow_Statements.Lesson_74_Input_Calculator;

import java.util.Scanner;

public class InputCalculator {
	public static void inputThenPrintSumAndAverage() {
		Scanner scanner = new Scanner(System.in);
		int sum = 0;
		int average = 0;
		int counter = 0;
		while (true) {

			boolean isInt = scanner.hasNextInt();

			if (isInt) {
				int number = scanner.nextInt();
				counter++;
				sum += number;
				average = (int) Math.round((double) sum / counter);
			} else {
				break;
			}
		}
		System.out.println("SUM = " + sum + " AVG = " + average);

		scanner.close();
	}
}
