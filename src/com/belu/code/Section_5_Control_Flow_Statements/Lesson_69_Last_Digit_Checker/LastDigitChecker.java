package com.belu.code.Section_5_Control_Flow_Statements.Lesson_69_Last_Digit_Checker;
public class LastDigitChecker {
    public static boolean hasSameLastDigit(int firstNumber, int secondNumber, int thirdNumber) {
        if (isValid(firstNumber) && isValid(secondNumber) && isValid(thirdNumber)) {
            int firstNumberRemainder = firstNumber % 10;
            int secondNumberRemainder = secondNumber % 10;
            int thirdNumberRemainder = thirdNumber % 10;

            if (firstNumberRemainder == secondNumberRemainder ||
                    firstNumberRemainder == thirdNumberRemainder ||
                    secondNumberRemainder == thirdNumberRemainder) {
                return true;
            }
            else {
                return false;
            }
        }
        else {
            return false;
        }
    }

    public static boolean isValid(int number) {
        if (number >= 10 && number <= 1000) {
            return true;
        }
        else {
            return false;
        }
    }
}
