package com.belu.code.Section_5_Control_Flow_Statements.Lesson_64_For_Loops;

public class Main {

    public static void main(String[] args) {
        System.out.println("10,000 at 2% interest = " + ForLoops.calculateInterest(10000d,2d));
        System.out.println("10,000 at 3% interest = " + ForLoops.calculateInterest(10000d,3d));
        System.out.println("10,000 at 4% interest = " + ForLoops.calculateInterest(10000d,4d));
        System.out.println("10,000 at 5% interest = " + ForLoops.calculateInterest(10000d,5d));

        System.out.println();
        System.out.println("Using ForLoop");
        // Using the for statement, call the calculate interest method
        // with the amount of 10,000 with an interestRate of 2,3,4,5,6,7 and 8
        // and print the results ot the console window

        // My first solution
        /*for (int i = 0; i < 7; i++) {
            System.out.println("10,000 at " + (2+ i)+"%" + " interest = " + ForLoops.calculateInterest(10000d,2d + i));
        }*/

        for (int i = 2; i < 9; i++) {
            System.out.println("10,000 at " + (int) i +"%" + " interest = "
                    + String.format("%.2f",ForLoops.calculateInterest(10000d,(double) i)));
        }

        // How would you modify the for loop above to do the same thing
        // as shown but in reverse from 8% to 2%

        System.out.println();
        System.out.println("Using ForLoop in reverse");
        for (int i = 8; i > 1; i--) {
            System.out.println("10,000 at " + (int) i +"%" + " interest = "
                    + String.format("%.2f",ForLoops.calculateInterest(10000d,(double) i)));
        }
        
        // Prime numbers Challenge
        System.out.println();
        System.out.println("Count the prime numbers between\n two any given numbers");
        int count = 0;
        for (int i = 10; i < 50; i++) {
            System.out.println("Looped through " + i);
            if (ForLoops.isPrime(i)) {
                count++;
                System.out.println("You found a prime number = " + i + " . Great work!" );
                if (count == 11){
                    System.out.println("Found all primes, exiting now!");
                    break;
                }
            }

        }

        System.out.println();
        System.out.println("Optimized prime search that finds all the primes");
        int countOptimized = 0;
        for (int i = 10; i < 50; i++) {
            System.out.println("Looped through " + i);
            if (ForLoops.isPrimeOptimized(i)) {
                count++;
                System.out.println(i + " is Prime!");
            }
        }
        System.out.println("Found them all:)");

        for (int number = 100; number < 130; number += 10) {
            System.out.println("Number = " + number);
        }


        System.out.println("The sum of numbers that divide by 3 and 5 is = " + ForLoops.sum3And5());

        System.out.println("Sum of all odd numbers between 2 ranges");
        System.out.println("Odd numbers sum = " + ForLoops.sumOdd(1,5));

        System.out.println(ForLoops.isOdd(24));

    }
}
