package com.belu.code.Section_3_First_Steps.Lesson_29_Float_And_Double_Challenge;

public class Main {

	public static void main(String[] args) {
		double numberOfPounds = 124d;
		double conversionFactorToKilograms = 0.45359237d;

		double kilograms = numberOfPounds * conversionFactorToKilograms;

		System.out.println("Converting " + numberOfPounds + " pounds to kilograms = " + kilograms + " Kilograms");

		double pi = 3.1415927d;
		double anotherNumber = 3_000_000.4_567_890d;

		System.out.println(pi);
		System.out.println(anotherNumber);
	}
}
