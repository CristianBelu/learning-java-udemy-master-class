package com.belu.code.Section_8_Arrays_Lists_Autoboxing_Unboxing.Lesson_103_Reverse_Array_Challenge;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	     int[] array = new int[]{1,2,3,4,5,6,7,8,9};
	     
//        System.out.println("The array is: ");
//        printArray(array);
//        System.out.println();
//        System.out.println("The reversed array is: ");
//        printArray(reverseArray(array));
    
        System.out.println("Array = " + Arrays.toString(array));
        System.out.println("Reversed Array = " + Arrays.toString(reverseArray(array)));
    }
    
//    public static void printArray(int[] array) {
//        for (int i = 0; i < array.length; i++) {
//            System.out.print(array[i] + " ");
//        }
//    }
    
    public static int[] reverseArray(int[] array) {
        int[] reversedArray = new int[array.length];
        for (int i = 0; i < array.length ; i++) {
            reversedArray[array.length - 1 - i] = array[i];
        }
        return reversedArray;
    }
}
