package com.belu.code.Section_5_Control_Flow_Statements.Lesson_62_The_Switch_Statement;

public class Main {

    public static void main(String[] args) {
        /*int value = 1;

        if (value == 1) {
            System.out.println("Value was 1");
        } else if (value == 2) {
            System.out.println("Value was 2");
        } else {
            System.out.println("Value vas not 1 or 2");
        }*/
/*        int switchValue = 3;

        switch (switchValue) {
            case 1:
                System.out.println("Value was 1");
                break;
            case 2:
                System.out.println("Value was 2");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Was 3, 4 or 5");
                System.out.println("Actualy it was a " + switchValue);
            default:
                System.out.println("Value was not 1 or 2");
                break;
        }*/


        char letter = 'E';

        switch (letter) {
            case 'A':
                System.out.println("The letter is A");
                break;
            case 'B':
                System.out.println("The letter is B");
                break;
            case 'C': case 'D': case 'E':
                System.out.println("The letter is " + letter);
                break;
            /*case 'D':
                System.out.println("The letter is D");
                break;
            case 'E':
                System.out.println("The letter is E");
                break;*/
            default:
                System.out.println("Not Found");
                break;
        }


        String month = "JAnUaRy";

        switch (month.toLowerCase()) {
            case "january":
                System.out.println("Jan");
                break;
            case "december":
                System.out.println("Dec");
                break;
            default:
                System.out.println("Not sure");
                break;
        }


        // more code here
    }
}
