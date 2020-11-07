package com.belu.code.Section_5_Control_Flow_Statements.Lesson_69_First_And_Last_Digit_Sum;
public class FirstLastDigitSum {
    public static int sumFirstAndLastDigit(int number) {
        if (number < 0) {
            return -1;
        }
        int sum = 0;
        int lastDigit = number % 10;
        int firstDigit = 0;
        if (number < 10) {
            sum = number + number;
        }
        else {
            while (number > 9) {
                number = number / 10;
                firstDigit = number;
            }
            sum = firstDigit + lastDigit;
            return sum;
        }
        return sum;
    }
}
