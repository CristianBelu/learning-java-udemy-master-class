package com.belu.code.Section_4_Expressions_Statements_CodeBlocks_Methods.Lesson_54_Leap_Year_Calculator;
public class LeapYear {

    public static boolean isLeapYear(int year) {
        if (year < 1 || year > 9999) {
            return false;
        }

        if (year % 4 == 0) {
            if (year % 100 == 0){
                if (year % 400 == 0){
                    return true;
                }

                else {
                    return false;
                }
            }
            else{
                return true;
            }
        }
        else return false;
    }
}
