package com.belu.code.Section_6_OOP_Classes_Constructors_Inheritance.Lesson_80_Pool_Area;

public class Rectangle {
    private double width;
    private double length;

    public Rectangle(double width, double length) {
        if (width < 0) {
            width = 0;
        }
        else {
            this.width = width;
        }
        if (length < 0) {
            length = 0;
        }
        else {
            this.length = length;
        }
    }

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

    public double getArea() {
        return length * width;
    }
}
