package com.belu.code.Section_5_Control_Flow_Statements.Lesson_69_Gratest_Common_Divisor;
public class GreatestCommonDivisor {
    public static int getGreatestCommonDivisor(int firstNumber, int secondNumber) {
        int common = 0;
        if (firstNumber > 9 && secondNumber > 9) {
            for (int i = 2; i < firstNumber ; i++) {
                if (firstNumber % i == 0 && secondNumber % i == 0) {
                    common = i;
                }
            }
            return common;
        }
        else {
            return -1;
        }
    }
}
