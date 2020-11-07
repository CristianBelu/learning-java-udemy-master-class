package com.belu.code.Section_8_Arrays_Lists_Autoboxing_Unboxing.Lesson_99_Arrays_Challenge;

import java.util.Scanner;

public class Run {
	private static Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) {
		Array myArray = new Array("First",3);
		
		
		System.out.printf("Name of my object is %s and length is %s",myArray.getName(),myArray.getLength());
	
	}
}
