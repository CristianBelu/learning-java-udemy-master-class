package com.belu.code.Section_5_Control_Flow_Statements.Lesson_69_Number_Palindrome;
public class NumberPalindrome {
    public static boolean isPalindrome(int number) {

        int initialNumber = number;
        int reverse = 0;
        while (number > 9) {
            int lastDigit = number % 10;
            number = number / 10;
            reverse = (reverse + lastDigit) * 10;
        }
        reverse += number;

        if (initialNumber == reverse) {
            return true;
        }
        else {
            return false;
        }
    }
}
