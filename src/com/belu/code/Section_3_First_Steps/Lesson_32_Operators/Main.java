package com.belu.code.Section_3_First_Steps.Lesson_32_Operators;

public class Main {

	public static void main(String[] args) {
		int result = 1 + 2; // 1 + 2 = 3;
		// = - assignment operator
		// + - addition operator
		// 1 and 2 - operands

		System.out.println("1 + 2 = " + result);
		int previousResult = result;
		System.out.println("previousResult = " + previousResult);
		result = result - 1;
		System.out.println(" 3 - 1 = " + result);
		System.out.println("previousResult = " + previousResult);

		result = result * 10; // 2 * 10 = 20
		System.out.println("2 * 10 = " + result);

		result = result / 5; // 20 / 5 = 4
		System.out.println("20 / 5 = " + result);

		result = result % 3; // the reminder of (4 % 3) = 1
		System.out.println("4 % 3 = " + result);

		// result = result + 1;

		result++; // 1 + 1 = 2
		System.out.println("1 + 1 = " + result);

		result--;
		System.out.println("2 - 1 = " + result);

		// result = result + 2;
		result += 2; // 1 + 2 = 3
		System.out.println("1 + 2 = " + result);

		// result = result * 10;
		result *= 10; // 3 * 10 = 30
		System.out.println("3 * 10 = " + result);

		// result = result / 3
		result /= 3; // 30 / 3 = 10
		System.out.println("30 / 3 = " + result);

		// result = result - 2;
		result -= 2; // 10 - 2 = 8;
		System.out.println("10 - 2 = " + result);

		boolean isAlien = false;

		if (isAlien == false) {
			System.out.println("It is not a alien!");
			System.out.println("And I am scared of aliens");
		}

		int topScore = 80;
		if (topScore < 100) {
			System.out.println("You got the high score!");
		}

		int secondTopScoare = 95;

		if ((topScore > secondTopScoare) && (topScore < 100)) {
			System.out.println("Greater than second top score and less than 100");
		}

		if ((topScore > 90) || (secondTopScoare <= 90)) {
			System.out.println("Either or both of the conditions are true");
		}

		int newValue = 50;

		if (newValue == 50) {
			System.out.println("This is true");
		}

		boolean isCar = false;
		if (isCar) {
			System.out.println("This is not suposed to happen");
		}

		isCar = true;
		boolean wasCar = isCar ? true : false;
		if (wasCar) {
			System.out.println("wasCar is true");
		}

		int ageOfClient = 20;
		boolean isEighteenOrOver = ageOfClient > 18 ? true : false;

		if (isEighteenOrOver == false) {
			System.out.println("The client is underage!");
		}

		// Challenge

		double firstDouble = 20.00d;
		double secondDouble = 80.00d;

		double doubleAddition = (firstDouble + secondDouble) * 100.00d;
		double remainderDouble = doubleAddition % 40.00d;

		boolean isTheReminderZero = remainderDouble == 0 ? true : false;

		System.out.println(isTheReminderZero);

		if (!isTheReminderZero) {
			System.out.println("Got some reminder");
		}

	}
}
