package com.belu.code.Section_8_Arrays_Lists_Autoboxing_Unboxing.Lesson_102_Minimum_Element_Challenge;

public class NewHouse {
	public static void main(String[] args) {
		House ground = new House();
		House level = new House(2,3,1,10);
		
		
		System.out.printf("This house has %s roof%n",ground.getRoof());
		System.out.printf("This house has %s doors%n",ground.getDoor());
		System.out.println(level.getRoof());
	}
}
