package com.belu.code.Section_4_Expressions_Statements_CodeBlocks_Methods.Lesson_43_Keywords_And_Expressions;

public class Main {

	public static void main(String[] args) {
		// a mile is equal to 1.609344
		double kilometres = (100 * 1.609344);
		int highScore = 50;

		if (highScore == 50) {
			System.out.println("This is an expression");
		}

		// Challenge - figure out what from the code below is an expression

		int score = 100; // score = 100 - expression
		if (score > 90) { // score > 90 - expression
			System.out.println("You got the high score!"); // "You got the high score" - expression
			score = 0; // score = 0 - expression
		}
	}
}
