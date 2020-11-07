package com.belu.code.Section_7_OOP_Composition_Encapsulation_Polymorphism.Lesson_97_OOP_Challenge;

public class DeluxeBurger extends Burger {
	public DeluxeBurger() {
		super("Deluxe", "Ham & Bacon", 13.99, "white");
		super.addBurgerAddition1("Chips", 2.22);
		super.addBurgerAddition2("Drink", 1.95);
	}
	
	@Override
	public void addBurgerAddition1(String name, double price) {
		System.out.printf("Cannot add additional items to a Deluxe burger %n");
	}
	
	@Override
	public void addBurgerAddition2(String name, double price) {
		System.out.printf("Cannot add additional items to a Deluxe burger %n");
	}
	
	@Override
	public void addBurgerAddition3(String name, double price) {
		System.out.printf("Cannot add additional items to a Deluxe burger %n");
	}
	
	@Override
	public void addBurgerAddition4(String name, double price) {
		System.out.printf("Cannot add additional items to a Deluxe burger %n");
	}
}
