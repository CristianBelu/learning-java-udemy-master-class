package com.belu.code.Section_8_Arrays_Lists_Autoboxing_Unboxing.Lesson_99_Arrays_Challenge;

public class Array {
	private String name;
	private int length;
	
	public Array(String name, int length) {
		this.name = name;
		this.length = length;
	}
	
	public String getName() {
		return name;
	}
	
	public int getLength() {
		return length;
	}
	
	public int[] addElementsToArray(int length) {
		int[] array = new int[length];
		for (int i = 0; i < array.length; i++) {
			array[i] = (i + 1) * 10;
		}
		return array;
	}
	
	public void printArray(int[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.printf("Element at position# %s is %s%n",i,array[i]);
		}
	}
	
}
