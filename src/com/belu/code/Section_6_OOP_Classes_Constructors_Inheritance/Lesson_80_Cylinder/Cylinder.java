package com.belu.code.Section_6_OOP_Classes_Constructors_Inheritance.Lesson_80_Cylinder;

public class Cylinder extends Circle {
    private double height;

    public Cylinder(double radius, double height) {
        super(radius);
        if (height < 0){
            height = 0;
        }
        else {
            this.height = height;
        }
    }

    public double getHeight() {
        return height;
    }

    public double getVolume() {
        return getArea() * height;
    }
}
