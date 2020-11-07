package com.belu.code.Section_3_First_Steps.Lesson_27_Primitives_Types_Challenge;

public class Main {

	public static void main(String[] args) {
		byte byteValue = 10;
		short shortValue = 20;
		int inValue = 50;
		long longTotal = 50000L + 10 * (byteValue + shortValue + inValue);
		System.out.println(longTotal);

		short shortTotal = (short) (1000 + 10 * (byteValue + shortValue + inValue));

	}
}
