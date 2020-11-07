package com.belu.code.Section_5_Control_Flow_Statements.Lesson_70_Largest_Prime;

public class LargestPrime {

	public static int getLargestPrime(int number) {
		int i;
		long copyOfInput = number;

		for (i = 2; i <= copyOfInput; i++) {
			if (copyOfInput % i == 0) {
				copyOfInput /= i;
				i--;
			}
		}

		if (number <= 1) {
			return -1;
		}
		return i;
	}
}
