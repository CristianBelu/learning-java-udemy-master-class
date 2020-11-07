package com.belu.code.Section_7_OOP_Composition_Encapsulation_Polymorphism.Lesson_97_OOP_Challenge;

public class Main {
	
	public static void main(String[] args) {
		Burger burger = new Burger("Classic", "Beef", 5.23, "white");
		double price = burger.itemizedBurger();
		burger.addBurgerAddition1("tomato", 0.55);
		burger.addBurgerAddition2("cucumber", 0.45);
		burger.addBurgerAddition3("cheese", 1.45);
		price = burger.itemizedBurger();
		
		System.out.printf("Burger price is now %.2f$%n", burger.itemizedBurger());
		
		HealthyBurger healthyBurger = new HealthyBurger("Bacon", 5.55);
		healthyBurger.addBurgerAddition1("Egg", 2.55);
		healthyBurger.addHealthyAddition1("Spinach", 3.45);
		//healthyBurger.itemizedBurger();
		
		System.out.printf("Healthy Burger price is now %.2f$%n", healthyBurger.itemizedBurger());
		
		
		DeluxeBurger deluxeBurger = new DeluxeBurger();
		deluxeBurger.itemizedBurger();
		
		deluxeBurger.itemizedBurger();
		deluxeBurger.addBurgerAddition1("Should not be able to do this", 0.00);
		
		TestClass testClass = new TestClass("Cristian",33);
		testClass.saySomething(33);
		System.out.printf("%s%n",testClass.getName());
		System.out.printf("%s",testClass.getNumber());
		
	}
}
