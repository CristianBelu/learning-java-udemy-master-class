package com.belu.code.Section_7_OOP_Composition_Encapsulation_Polymorphism.Lesson_90_Composition;

public class Ildiko {
	private String hairColor;
	private int height;
	private int weight;
	
	public Ildiko(String hairColor, int height, int weight) {
		this.hairColor = hairColor;
		this.height = height;
		this.weight = weight;
	}
	
	public String getHairColor() {
		return hairColor;
	}
	
	public int getHeight() {
		return height;
	}
	
	public int getWeight() {
		return weight;
	}
	
	public void vorbeste(int numberOfTimes) {
		for (int i = 2; i < numberOfTimes; i++) {
			System.out.printf("Ti-am spus de %s ori sa fi atent%n",i);
		}
	}
}
