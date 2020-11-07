package com.belu.code.Section_4_Expressions_Statements_CodeBlocks_Methods.Lesson_59_Area_Calculator;
public class AreaCalculator {
    public static double area(double radius) {
        if (radius < 0) {
            return -1.0;
        }

        return radius * radius * Math.PI;
    }

    public static double area(double x, double y) {
        if (x < 0 || y < 0) {
            return -1.0;
        }

        return x * y;
    }
}
