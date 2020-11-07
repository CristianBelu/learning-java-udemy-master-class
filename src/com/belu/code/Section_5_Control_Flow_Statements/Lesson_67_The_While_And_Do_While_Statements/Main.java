package com.belu.code.Section_5_Control_Flow_Statements.Lesson_67_The_While_And_Do_While_Statements;

public class Main {

    public static void main(String[] args) {
//        int count = 1;
//        System.out.println("First While statement is executing");
//        while (count != 6) {
//            System.out.println("Count value is " + count);
//            count++;
//        }
//
//        System.out.println("Second While statement is executing");
//        count = 1;
//        while (true) {
//            if (count == 6){
//                break;
//            }
//            System.out.println("Count value is " + count);
//            count++;
//        }
//
//        System.out.println("Do-While statement is executing");
//        count = 6;
//        do {
//            System.out.println("Count value was " + count);
//            count++;
//            if (count > 100) {
//                break;
//            }
//        } while (count !=6);

        int startNumber = 4;
        int endNumber = 20;

//        while (startNumber <= endNumber) {
//            startNumber++;
//            if (!isEvenNumber(startNumber)) {
//                continue;
//            }
//            System.out.println("Even number " + startNumber);
//        }


        // Modify the while code above
        // Make it also record the total number of even numbers it has found
        // and break once 5 are found
        // and at the end, display the total number of even numbers found
        System.out.println("Challenge is executing here!");

        startNumber = 5;
        endNumber = 22;
        int count = 0;
        while (startNumber <= endNumber) {
            startNumber++;
            if (!isEvenNumber(startNumber)) {
                continue;
            }
            System.out.println("Even number " + startNumber);
            count++;
            if (count == 5){
                break;
            }

        }
        System.out.println("Total even numbers found = " + count);

        count = 0;
        while (count <= 5){
            System.out.println("count = " + count);
            count++;
        }
        for (int i = 0; i <= 5; i++) {
            System.out.println("i = " + i);
        }




//        System.out.println(isEvenNumber(24));
//        System.out.println(isEvenNumber(23));
    }
    // Create a method isEvenNumber that takes a parameter of type int
    // Its purpose is to determine if the argument passed to the method is
    // an even number or not
    // return true if an even number, otherwise return false;


    public static boolean isEvenNumber(int number) {
        if (number % 2 == 0) {
            return true;
        }
        else{
            return false;
        }
    }
}
