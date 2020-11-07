package com.belu.code.Section_4_Expressions_Statements_CodeBlocks_Methods.Lesson_47_Methods_In_Java;

public class Main {

	public static void main(String[] args) {

		boolean gameOver = true;
		int score = 800;
		int lvlCompleted = 5;
		int bonus = 100;

		int highScore = calculateScore(gameOver, score, lvlCompleted, bonus);
		System.out.println("Your final score was " + highScore);

		System.out.println(calculateScore(false, score, lvlCompleted, bonus));

		score = 10000;
		lvlCompleted = 8;
		bonus = 200;

		highScore = calculateScore(gameOver, score, lvlCompleted, bonus);
		System.out.println("Your final score was " + highScore);

		displayHighScorePosition("Cristi", calculateHighScorePosition(1500));
		displayHighScorePosition("Ildy", calculateHighScorePosition(900));
		displayHighScorePosition("Maria", calculateHighScorePosition(400));
		displayHighScorePosition("Daniel", calculateHighScorePosition(50));
		displayHighScorePosition("Zamfi", calculateHighScorePosition(1000));
		displayHighScorePosition("John", calculateHighScorePosition(500));
		displayHighScorePosition("Mary", calculateHighScorePosition(100));

	}

	public static int calculateScore(boolean gameOver, int score, int lvlCompleted, int bonus) {

		if (gameOver) {
			int finalScore = score + (lvlCompleted * bonus);
			finalScore += 2000;
			return finalScore;
		} else {
			return -1;
		}
	}

	public static void displayHighScorePosition(String name, int playerPosition) {
		System.out.println(name + " managed to get in to position " + playerPosition + " on the high score table");
	}

	public static int calculateHighScorePosition(int playerScore) {
		/*
		 * if (playerScore >= 1000) { return 1; } else if (playerScore >= 500) { return
		 * 2; } else if (playerScore >= 100) { return 3; } return 4;
		 */

		int position = 4;

		if (playerScore >= 1000) {
			position = 1;
		} else if (playerScore >= 500) {
			position = 2;
		} else if (playerScore >= 100) {
			position = 3;
		}
		return position;
	}
}
