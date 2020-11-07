package com.belu.code.Section_8_Arrays_Lists_Autoboxing_Unboxing.Lesson_102_Minimum_Element_Challenge;

import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        // Tim's solution :
        // System.out.println("Enter number:");
        // int count = scanner.nextInt();
        // scanner.nextLine();
        //
        // int[] returnedArray = readIntegers(count);
        // int returnedMin = findMin(returnedArray);
        // System.out.println("min = " + returnedMin)
        
        
        System.out.printf("The minimum number from the array is %s",findMin(readIntegers(5)));
        scanner.close();
    }
    
    public static int[] readIntegers(int count) {
        // Tim's solution :
        // int[] array = new int[count];
        // for (int i = 0; i < array.length; i++) {
        //      System.out.println("Enter a number:");
        //      int number = scanner.nextInt();
        //      scanner.nextLine();
        //      array[i] = number;
        // }
        // return array;
        
        
        
        int[] myArray = new int[count];
        while (count > 0) {
            for (int i = 0; i < myArray.length; i++) {
                System.out.printf("Enter number #%s%n",i + 1);
                myArray[i] = scanner.nextInt();
                count--;
            }
        }
        
        return myArray;
    }
    
    public static int findMin(int[] array) {
        // Tim's solution:
        // int min = Integer.MAX_VALUE;
        // for (int i = 0; i < array.length; i++) {
        //      int value = array[i];
        //      if(value < min) {
        //          min = value;
        //      }
        // }
        
        
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (min > array[i]) {
                min = array[i];
            }
        }
        return min;
    }
}
