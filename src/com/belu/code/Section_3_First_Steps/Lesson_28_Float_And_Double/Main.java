package com.belu.code.Section_3_First_Steps.Lesson_28_Float_And_Double;

public class Main {

	public static void main(String[] args) {
		float myMinFloatValue = Float.MIN_VALUE;
		float myMaxFloatValue = Float.MAX_VALUE;

		System.out.println("Float Minimum Value " + myMinFloatValue);
		System.out.println("Float Maximum Value " + myMaxFloatValue);

		double myMinDoubleValue = Double.MIN_VALUE;
		double myMaxDoubleValue = Double.MAX_VALUE;

		System.out.println("Float Minimum Value " + myMinDoubleValue);
		System.out.println("Float Maximum Value " + myMaxDoubleValue);

		int myIntValue = 5 / 3;
		float myFloatValue = 5f / 3f;
		double myDoubleValue = 5.00 / 3.00;

		System.out.println("MyIntValue = " + myIntValue);
		System.out.println("MyFloatValue = " + myFloatValue);
		System.out.println("MyDoubleValue = " + myDoubleValue);

	}
}
