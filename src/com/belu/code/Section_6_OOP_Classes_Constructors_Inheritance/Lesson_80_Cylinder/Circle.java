package com.belu.code.Section_6_OOP_Classes_Constructors_Inheritance.Lesson_80_Cylinder;

public class Circle {
    private double radius;

    public Circle(double radius) {
        if (radius < 0) {
            this.radius = 0;
        }
        else {
            this.radius = radius;
        }
    }

    public double getRadius() {
        return radius;
    }

    public double getArea() {
        return radius * radius * Math.PI;
    }
}
