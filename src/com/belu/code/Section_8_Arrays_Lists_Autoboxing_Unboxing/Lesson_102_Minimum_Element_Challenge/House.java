package com.belu.code.Section_8_Arrays_Lists_Autoboxing_Unboxing.Lesson_102_Minimum_Element_Challenge;

public class House {
	private int roof;
	private int door;
	private int level;
	private int widow;
	
	public House() {
		this(2,13,3,100);
	}
	
	public House(int roof, int door, int level, int widow) {
		this.roof = roof;
		this.door = door;
		this.level = level;
		this.widow = widow;
	}
	
	public int getDoor() {
		return door;
	}
	
	public int getLevel() {
		return level;
	}
	
	public String getRoof() {
		String word = "Roof";
		
		if (roof > 1) {
			word = "Roofs";
			return roof + " " + word;
		}
		else {
			return roof + " " + word;
		}
	}
	
	public int getWidow() {
		return widow;
	}
	
	public void setRoof(int roof) {
		this.roof = roof;
	}
	
	public void setDoor(int door) {
		this.door = door;
	}
	
	public void setLevel(int level) {
		this.level = level;
	}
	
	public void setWidow(int widow) {
		this.widow = widow;
	}
}
