package com.belu.code.Section_5_Control_Flow_Statements.Lesson_74_Min_And_Max_Challenge;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int min = 0;
        int max = 0;
//        int minInt = Integer.MAX_VALUE;
//        int maxInt = Integer.MIN_VALUE;
        int order = 0;
//         boolean first = true; // - using a flag to assign first value to min and max

        while (true) {
            System.out.println("Enter number:");
            boolean isAnInt = scanner.hasNextInt();

            if (isAnInt) {
//                int number = scanner.nextInt();
//
//                if (number > maxInt) {
//                    maxInt = number;
//                }
//                if (number < minInt) {
//                    minInt = number;
//                }
//            }
            // my solution
                order +=1;
                int number = scanner.nextInt();
//                if (first) {
//                    first = false;
//                    min = number;
//                    max = number;
//                }

                if (order == 1) {
                    min = number;
                    max = number;
                }
                else if (order > 1) {

                    if (min > number) {
                        min = number;
                    }
                    else if (max < number) {
                        max = number;
                    }
                }
            }
            else {
                System.out.println("The program is exiting, you have entered an invalid value");
                break;
            }
//            else {
//                break;
//            }

            scanner.nextLine(); // to handle enter key
        }
//        System.out.println("min = " + minInt + ", max = " + maxInt);
        System.out.println("The minimum number entered is = " + min + ", and the maximum number entered is = " + max);

        scanner.close();
    }
}
