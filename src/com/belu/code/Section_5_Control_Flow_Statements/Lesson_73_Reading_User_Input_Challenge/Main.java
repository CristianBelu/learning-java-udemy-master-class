package com.belu.code.Section_5_Control_Flow_Statements.Lesson_73_Reading_User_Input_Challenge;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    // Read 10 numbers from the console by the user
        // and print the sum of those numbers

        Scanner scanner = new Scanner(System.in);

        int counter = 0;
        int sum = 0;

        while (counter < 10) {
//        while (true) {
            int order = counter + 1;
            System.out.println("Enter number# " + order + ":");

            boolean isAnInt = scanner.hasNextInt();

            if (isAnInt) {
                int number = scanner.nextInt();
                counter++;
                sum += number;
//                if (counter == 10) {
//                    break;
//                }
            }
            else {
                System.out.println("Invalid number");
            }

            scanner.nextLine(); // handle end of line enter key
        }

        System.out.println("sum = " + sum);
        scanner.close();
    }
}
