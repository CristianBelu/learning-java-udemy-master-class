package com.belu.code.Section_4_Expressions_Statements_CodeBlocks_Methods.Lesson_59_Minutes_To_Years_And_Days_Calculator;
public class MinutesToYearsDaysCalculator {
    
    public static void printYearsAndDays(long minutes) {
        if (minutes < 0) {
            System.out.println("Invalid Value");
        } else {
            
            long hours = minutes / 60;
            long days = hours / 24;
            long years = days / 365;
            long daysRemaining = days % 365;
            
            System.out.println(minutes + " min = " + years + " y and " + daysRemaining + " d");
        }
    }
}



