package com.belu.code.Section_7_OOP_Composition_Encapsulation_Polymorphism.Lesson_97_OOP_Challenge;

public class HealthyBurger extends Burger {
	
	private String healthyExtra1Name;
	private double healthyExtra1Price;
	
	private String healthyExtra2Name;
	private double healthyExtra2Price;
	
	public HealthyBurger(String meat, double price) {
		super("Healthy", meat, price, "Brown rye");
	}
	
	public void addHealthyAddition1(String name, double price) {
		this.healthyExtra1Name = name;
		this.healthyExtra1Price = price;
	}
	
	public void addHealthyAddition2(String name, double price) {
		this.healthyExtra2Name = name;
		this.healthyExtra2Price = price;
	}
	
	@Override
	public double itemizedBurger() {
		double burgerPrice = super.itemizedBurger();
		if (this.healthyExtra1Name != null) {
			burgerPrice += this.healthyExtra1Price;
			System.out.printf("Added %s for and extra %.2f$%n", this.healthyExtra1Name, this.healthyExtra1Price);
		}
		if (this.healthyExtra2Name != null) {
			burgerPrice += this.healthyExtra2Price;
			System.out.printf("Added %s for and extra %.2f$%n", this.healthyExtra2Name, this.healthyExtra2Price);
		}
		return burgerPrice;
	}
}
