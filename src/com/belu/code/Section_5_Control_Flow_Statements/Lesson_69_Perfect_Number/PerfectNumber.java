package com.belu.code.Section_5_Control_Flow_Statements.Lesson_69_Perfect_Number;

public class PerfectNumber {

	public static boolean isPerfectNumber(int number) {
        int sum = 0;
        if (number < 1) {
            return false;
        }
        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                sum += i;
            }
        }
        if (sum == number){
            return true;
        }
        else {
            return false;
        }
    }
}
