package com.belu.code.Section_5_Control_Flow_Statements.Lesson_64_Get_Largest_Prime;
public class LargestPrime {
    public static int getLargestPrime(int number) {
        int largest = 0;
        int largestPrimeFactor = 0;

        // this method works perfectly, but i have to many methods for the given requirements
        for (int i = 3; i <= number; i++) {
            //System.out.println("Looped through " + i);
            if (isPrimeOptimized(i)) {
                largest = i;
                if (number % largest == 0) {
                    largestPrimeFactor = largest;
                }
                //System.out.println(i + " is Prime!");
            }
        }
        return largestPrimeFactor;
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
}
