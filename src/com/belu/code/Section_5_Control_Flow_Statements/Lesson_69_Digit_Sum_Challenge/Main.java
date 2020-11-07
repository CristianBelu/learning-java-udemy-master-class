package com.belu.code.Section_5_Control_Flow_Statements.Lesson_69_Digit_Sum_Challenge;

public class Main {

    public static void main(String[] args) {
        System.out.println("The sum of digits is = " + sumDigits(123));
        System.out.println("The sum of digits is = " + sumDigitsModified(123));
        System.out.println("The sum of digits is = " + sumDigitsWithDoWhile(123));
    }
    public static int sumDigits(int number) {
        int sum = 0;

        if (number < 10){
            return -1;
        }

        while (number > 0) {
            sum += number % 10;
            number = number / 10;
        }
        return sum;
    }


    // Method explained
    public static int sumDigitsModified(int number) {

        if (number < 10){
            return -1;
        }
        int sum = 0;

        // 125 -> 125 / 10 = 12 -> 12 * 10 = 120 -> 125 - 120 = 5
        while (number > 0) {
            // extract the least significant digit
            int digit = number % 10;
            sum += digit;

            // drop the least significant digit
            number /= 10;
        }
        return sum;
    }

    public static int sumDigitsWithDoWhile(int number) {
        int sum = 0;

        if (number < 10){
            return -1;
        }

        do {
            sum += number % 10;
            number /= 10;

        }while (number > 0);

        return sum;
    }
}
