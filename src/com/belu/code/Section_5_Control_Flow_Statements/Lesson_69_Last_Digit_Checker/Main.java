package com.belu.code.Section_5_Control_Flow_Statements.Lesson_69_Last_Digit_Checker;
public class Main {
    public static void main(String[] args) {
        System.out.println("Check equality = " + LastDigitChecker.hasSameLastDigit(12,22,23));
        System.out.println("Check equality = " + LastDigitChecker.hasSameLastDigit(12,44,52));
        System.out.println("Check equality = " + LastDigitChecker.hasSameLastDigit(12,44,54));
        System.out.println("Check equality = " + LastDigitChecker.hasSameLastDigit(9,44,54));
        System.out.println("Check equality = " + LastDigitChecker.hasSameLastDigit(90,4,54));
        System.out.println("Check equality = " + LastDigitChecker.hasSameLastDigit(90,40,9));
        System.out.println("Check equality = " + LastDigitChecker.hasSameLastDigit(10000,40,123));
        System.out.println("Check equality = " + LastDigitChecker.hasSameLastDigit(232,10000,123));
        System.out.println("Check equality = " + LastDigitChecker.hasSameLastDigit(232,14,10000));
    }
}
