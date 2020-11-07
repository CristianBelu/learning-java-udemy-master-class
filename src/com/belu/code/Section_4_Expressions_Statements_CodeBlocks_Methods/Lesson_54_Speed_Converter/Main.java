package com.belu.code.Section_4_Expressions_Statements_CodeBlocks_Methods.Lesson_54_Speed_Converter;
public class Main {
    public static void main(String[] args) {
        long miles = SpeedConverter.toMilesPerHour(10.5);

        System.out.println("Miles = " + miles);
        SpeedConverter.printConversion(10.5);
    }
}
