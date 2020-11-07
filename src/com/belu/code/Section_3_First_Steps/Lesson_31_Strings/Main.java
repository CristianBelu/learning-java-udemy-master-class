package com.belu.code.Section_3_First_Steps.Lesson_31_Strings;

public class Main {

	public static void main(String[] args) {
		// byte -127 +128
		// short
		// int
		// long
		// float
		// double
		// char
		// boolean
		String myCopyrightUnicode = "\u00A9 2019";
		System.out.println(myCopyrightUnicode);
		String myString = "This is a String" + myCopyrightUnicode;
		System.out.println("my string is equal to " + myString);
		myString = myString + ", and this is more.";
		System.out.println("my string is equal to " + myString);
		String numberString = "250.55";
		numberString = numberString + "49.95";
		System.out.println(numberString);
		String lastStriing = "10";
		int myInt = 50;
		lastStriing = lastStriing + myInt;
		System.out.println("Last string is equal to " + lastStriing); // java appends the int to the string
		double doubleNumber = 120.47d;
		lastStriing = lastStriing + doubleNumber;
		System.out.println("Last string is equal to " + lastStriing);
	}
}
