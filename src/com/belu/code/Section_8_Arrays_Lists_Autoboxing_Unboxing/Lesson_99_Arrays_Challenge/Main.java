package com.belu.code.Section_8_Arrays_Lists_Autoboxing_Unboxing.Lesson_99_Arrays_Challenge;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int[] myIntegers = getIntegers(5);
        
        int[] sorted = sortIntegers(myIntegers);
        printArray(sorted);
    }
    
    private static int[] getIntegers(int capacity) {
        int[] array = new int[capacity];
        System.out.printf("Enter %s integer values%n",capacity);
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }
        
        return array;
    }
    
    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.printf("Element %s contents %s%n",i,array[i]);
        }
    }
    
    public static int[] sortIntegers(int[] array) {
//        int[] sortedArray = new int[array.length];
//        for (int i = 0; i < array.length; i++) {
//            sortedArray[i] = array[i];
//        }
        int[] sortedArray = Arrays.copyOf(array,array.length);
        
        Arrays.sort(sortedArray);
        int[] backwardsArray = new int[sortedArray.length];
        for (int i = 0; i < sortedArray.length; i++) {
            backwardsArray[sortedArray.length - i - 1] = sortedArray[i];
        }
//        boolean flag= true;
//        int temp;
//        while (flag) {
//            flag = false;
//            for (int i = 0; i < sortedArray.length-1; i++) {
//                if (sortedArray[i] < sortedArray[i+1]) {
//                    temp = sortedArray[i];
//                    sortedArray[i] = sortedArray[i+1];
//                    sortedArray[i+1] = temp;
//                    flag = true;
//                }
//            }
//        }
        return backwardsArray;
    }
}
