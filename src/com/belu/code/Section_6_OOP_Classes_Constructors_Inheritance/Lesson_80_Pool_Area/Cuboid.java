package com.belu.code.Section_6_OOP_Classes_Constructors_Inheritance.Lesson_80_Pool_Area;

public class Cuboid extends Rectangle {
    private double height;

    public Cuboid(double width, double length, double height) {
        super(width, length);
        if (height < 0) {
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
