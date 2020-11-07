package com.belu.code.Section_7_OOP_Composition_Encapsulation_Polymorphism.Lesson_97_OOP_Challenge;

public class Burger {
	
	private String name;
	private String meat;
	private double price;
	private String breadRoleType;
	
	private String additional1Name;
	private double additional1Price;
	
	private String additional2Name;
	private double additional2Price;
	
	private String additional3Name;
	private double additional3Price;
	
	private String additional4Name;
	private double additional4Price;
	
	
	public Burger(String name, String meat, double price, String breadRoleType) {
		this.name = name;
		this.meat = meat;
		this.price = price;
		this.breadRoleType = breadRoleType;
	}
	
	public void addBurgerAddition1(String name, double price) {
		this.additional1Name = name;
		this.additional1Price = price;
	}
	
	public void addBurgerAddition2(String name, double price) {
		this.additional2Name = name;
		this.additional2Price = price;
	}
	
	public void addBurgerAddition3(String name, double price) {
		this.additional3Name = name;
		this.additional3Price = price;
	}
	
	public void addBurgerAddition4(String name, double price) {
		this.additional4Name = name;
		this.additional4Price = price;
	}
	
	public double itemizedBurger() {
		double burgerPrice = this.price;
		System.out.printf("%s burger on a %s role with %s, price is %.2f$%n", this.name, this.breadRoleType, this.meat, this.price);
		
		if (this.additional1Name != null) {
			burgerPrice += this.additional1Price;
			System.out.printf("Added %s for an extra %.2f$%n", this.additional1Name, this.additional1Price);
		}
		if (this.additional2Name != null) {
			burgerPrice += this.additional2Price;
			System.out.printf("Added %s for an extra %.2f$%n", this.additional2Name, this.additional2Price);
		}
		if (this.additional3Name != null) {
			burgerPrice += this.additional3Price;
			System.out.printf("Added %s for an extra %.2f$%n", this.additional3Name, this.additional3Price);
		}
		if (this.additional4Name != null) {
			burgerPrice += this.additional4Price;
			System.out.printf("Added %s for an extra %.2f$%n", this.additional4Name, this.additional4Price);
		}
		
		return burgerPrice;
	}
}
