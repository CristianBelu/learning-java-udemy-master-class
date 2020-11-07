package com.belu.code.Section_5_Control_Flow_Statements.Lesson_64_For_Loops;

public class ForLoops {
    public static double calculateInterest(double amount, double interestRate) {
        return (amount * interestRate / 100);
    }

    // Create a for statement using any range of numbers
    // Determine if the number is a prime using the isPrime method
    // If it is a prime number, print it out and increment a count of the
    // prime number of prime numbers found
    // if that count number is a 3 exit the for loop
    // hint: Use break; statement to exit the loop
    public static boolean isPrime(int n) {
        if (n == 1) {
            return false;
        }

        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }

    public static boolean isPrimeOptimized(int n) {
        if (n == 1) {
            return false;
        }

        for (int i = 2; i <= (long) Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }

    public static int sum3And5() {
        int sum = 0;
        int count = 0;
        for (int i = 1; i <= 1000; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("Number " + i + " can be divided by both 3 and 5");
                count++;
                sum += i;
                if (count == 5) {
                    break;
                }
            }
        }
        return sum;
    }

    public static boolean isOdd(int number) {
        if (number % 2 == 0 || number < 0) {
            return false;
        }
        else {
            return true;
        }
    }

    public static int sumOdd(int start, int end) {
        if (start > end || start < 0) {
            return -1;
        }
        int sum = 0;
        for (int i = start; i <= end; i++) {
            if (isOdd(i)){
                System.out.println(i + " is odd");
                sum += i;
            }
        }
        return sum;
    }
}
