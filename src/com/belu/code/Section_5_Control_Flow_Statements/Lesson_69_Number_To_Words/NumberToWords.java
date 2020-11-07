package com.belu.code.Section_5_Control_Flow_Statements.Lesson_69_Number_To_Words;
public class NumberToWords {
    public static void numberToWords(int number) {
        if (number < 0) {
            System.out.println("Invalid Value");
        }
        int originalDigitCount = getDigitCount(number);
        number = reverse(number);
        int reversedNumberDigitCount = getDigitCount(number);

        int remainder = 0;
        do {
            remainder = number % 10;
            switch (remainder) {
                case 0:
                    System.out.println("Zero");
                    break;
                case 1:
                    System.out.println("One");
                    break;
                case 2:
                    System.out.println("Two");
                    break;
                case 3:
                    System.out.println("Three");
                    break;
                case 4:
                    System.out.println("Four");
                    break;
                case 5:
                    System.out.println("Five");
                    break;
                case 6:
                    System.out.println("Six");
                    break;
                case 7:
                    System.out.println("Seven");
                    break;
                case 8:
                    System.out.println("Eight");
                    break;
                case 9:
                    System.out.println("Nine");
                    break;
                default:
                    break;
            }
            number /= 10;
        } while (number > 0);

        if (originalDigitCount != reversedNumberDigitCount) {
            for (int i = 0; i < originalDigitCount - reversedNumberDigitCount; i++) {
                System.out.println("Zero");
            }
        }
    }

    public static int reverse(int number) {
        int remainder = 0;
        int reversedNumber = 0;

        if (number < 0) {
            while (number < 0) {

                remainder = number % 10;
                number /= 10;
                reversedNumber = remainder + reversedNumber * 10;
            }
        }
        else{
            while (number > 0) {

                remainder = number % 10;
                number /= 10;
                reversedNumber = remainder + reversedNumber * 10;
            }
        }

        return reversedNumber;
    }

    public static int getDigitCount(int number) {
        int count = 0;
        if (number < 0) {
            return -1;
        }
        else if (number < 10) {
            count = 1;
        }
        else {
            while (number > 0) {
                number /= 10;
                count++;
            }
        }
        return count;
    }
}
