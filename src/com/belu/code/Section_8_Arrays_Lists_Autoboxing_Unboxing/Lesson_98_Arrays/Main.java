package com.belu.code.Section_8_Arrays_Lists_Autoboxing_Unboxing.Lesson_98_Arrays;

import java.util.Scanner;

public class Main {
	
	private static Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) {
		int[] myIntegers = getIntegers(5);
		for (int i = 0; i < myIntegers.length; i++) {
			System.out.println("Element " + i + ", typed value was " + myIntegers[i]);
		}
		System.out.printf("The average is %s",getAverage(myIntegers));
	}
	
	public static int[] getIntegers(int number) {
		System.out.printf("Enter %x integer values%n",number);
		int[] values = new int[number];
		
		for (int i = 0; i < values.length; i++) {
			values[i] = scanner.nextInt();
		}
		
		return values;
	}
	
	public static double getAverage(int[] array) {
		int sum = 0;
		for (int i = 0; i < array.length; i++) {
			sum += array[i];
		}
		
		return (double) sum / (double) array.length;
	}
}