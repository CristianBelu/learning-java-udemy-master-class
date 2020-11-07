package com.belu.code.Section_7_OOP_Composition_Encapsulation_Polymorphism.Lesson_90_Composition;

public class TryAll {
	public static void main(String[] args) {
		sayHello();
		sayGoodNight();
	}
	
	public static void sayHello() {
		for (int i = 0; i < 5; i++) {
			if (i == 3) {
				System.out.printf("Hello, ");
			} else {
				System.out.printf("Cristi!%n%n");
			}
		}
	}
	
	public static void sayGoodNight() {
		int numberOfTimes = 9;
		while (numberOfTimes >= 0){
			if (numberOfTimes > 0) {
				System.out.printf("Hello Cristian, it's time to go to bed!%n");
			}
			else {
				System.out.printf("Time is up, please go now!%n");
			}
			numberOfTimes = numberOfTimes - 1;
		}
		
	}
	
}
