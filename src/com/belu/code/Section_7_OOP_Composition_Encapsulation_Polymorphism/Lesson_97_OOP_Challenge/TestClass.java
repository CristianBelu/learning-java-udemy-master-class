package com.belu.code.Section_7_OOP_Composition_Encapsulation_Polymorphism.Lesson_97_OOP_Challenge;

public class TestClass {
	private String name;
	private int number;
	
	public TestClass(String name, int number) {
		this.name = name;
		this.number = number;
	}
	
	public String getName() {
		return name;
	}
	
	public int getNumber() {
		return number;
	}
	
	public void saySomething(int number) {
		for (int i = 0; i < number; i++) {
			System.out.printf("Something to say %s, attempt number# %s %n",this.name,i);
		}
	}
}
