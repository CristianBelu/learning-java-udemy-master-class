package com.belu.code.Section_5_Control_Flow_Statements.Lesson_70_Parsing_Value_From_A_String;

public class Main {

    public static void main(String[] args) {
	    String numberAsString = "2018.125";
        System.out.println("numberAsString = " + numberAsString);

//        int number = Integer.parseInt(numberAsString);
//        System.out.println("number = " + number);
        double numberDouble = Double.parseDouble(numberAsString);
        System.out.println("number = " + numberDouble);

        numberAsString += 1;
//        number += 1;
        numberDouble += 1;
//        System.out.println("numberAsString = " + numberAsString);
//        System.out.println("number = " + number);
        System.out.println("numberAsString = " + numberAsString);
        System.out.println("number = " + numberDouble);
    }
}
