package com.belu.code.Section_6_OOP_Classes_Constructors_Inheritance.Lesson_80_Inheritance;

public class Fish extends Animal{
    private int gills;
    private int eyes;
    private int fins;

    public Fish(String name, int size, int weight, int gills, int eyes, int fins) {
        super(name, 1, 1, size, weight);
        this.gills = gills;
        this.eyes = eyes;
        this.fins = fins;
    }

    private void rest() {

    }

    private void moveMuscles() {

    }

    private void moveFin() {

    }

    private void swim(int speed) {
        moveMuscles();
        moveFin();
        super.move(speed);
    }
}
