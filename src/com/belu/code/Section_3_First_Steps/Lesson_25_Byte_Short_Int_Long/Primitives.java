package com.belu.code.Section_3_First_Steps.Lesson_25_Byte_Short_Int_Long;

public class Primitives {

	public static void main(String[] args) {
		int myValue = 10000;

		int myMinIntValue = Integer.MIN_VALUE;
		int myMaxIntVAlue = Integer.MAX_VALUE;

		System.out.println("Integer Minimum Value = " + myMinIntValue);
		System.out.println("Integer Maximum Value = " + myMaxIntVAlue);
		System.out.println("Busted MAX value = " + (myMaxIntVAlue + 1)); // Overflow
		System.out.println("Busted MIN value = " + (myMinIntValue - 1)); // Underflow

		int myMaxIntTest = 2_147_483_647;

		byte myMinByteValue = Byte.MIN_VALUE;
		byte myMaxByteValue = Byte.MAX_VALUE;

		System.out.println("Byte Minimum Value = " + myMinByteValue);
		System.out.println("Byte Maximum Value = " + myMaxByteValue);

		short myMinShortValue = Short.MIN_VALUE;
		short myMaxShortValue = Short.MAX_VALUE;

		System.out.println("Short Minimum Value = " + myMinShortValue);
		System.out.println("Short Maximum Value = " + myMaxShortValue);

		long myLongValue = 100L;

		long myMinLongValue = Long.MIN_VALUE;
		long myMaxLongValue = Long.MAX_VALUE;

		System.out.println("Long Minimum Value = " + myMinLongValue);
		System.out.println("Long Maximum Value = " + myMaxLongValue);

		long bigLongLiteralValue = 2_147_483_647_234L;
		System.out.println(bigLongLiteralValue);

		int myTotal = (myMinIntValue / 2);
		byte myNewByteValue = (byte) (myMinByteValue / 2);

		short myNewShortValue = (short) (myMinShortValue / 2);

	}

}
