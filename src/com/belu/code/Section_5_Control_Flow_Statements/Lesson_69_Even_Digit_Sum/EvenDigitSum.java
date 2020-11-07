package com.belu.code.Section_5_Control_Flow_Statements.Lesson_69_Even_Digit_Sum;
public class EvenDigitSum {

    public static int getEvenDigitSum(int number) {
        if (number < 0) {
            return -1;
        }

        int sum = 0;
        int temp = 0;
        while (number > 0) {
            temp = number % 10;
            if (temp % 2 == 0) {
                sum += temp;
            }
            number /= 10;
        }
        return sum;
    }
}
