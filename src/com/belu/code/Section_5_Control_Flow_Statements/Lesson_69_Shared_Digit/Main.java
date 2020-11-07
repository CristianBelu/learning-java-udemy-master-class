package com.belu.code.Section_5_Control_Flow_Statements.Lesson_69_Shared_Digit;
public class Main {
    public static void main(String[] args) {
        System.out.println("There is a shared digit, digit = " + SharedDigit.hasSharedDigit(35,21));
        System.out.println("There is a shared digit, digit = " + SharedDigit.hasSharedDigit(32,21));
        System.out.println("There is a shared digit, digit = " + SharedDigit.hasSharedDigit(32,-21));
        System.out.println("There is a shared digit, digit = " + SharedDigit.hasSharedDigit(12,21));
        System.out.println("There is a shared digit, digit = " + SharedDigit.hasSharedDigit(9,99));
        System.out.println("There is a shared digit, digit = " + SharedDigit.hasSharedDigit(99,99));
        System.out.println("There is a shared digit, digit = " + SharedDigit.hasSharedDigit(100,10));


    }
}
