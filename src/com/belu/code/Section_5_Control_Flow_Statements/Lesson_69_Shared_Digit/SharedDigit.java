package com.belu.code.Section_5_Control_Flow_Statements.Lesson_69_Shared_Digit;
public class SharedDigit {
    public static boolean hasSharedDigit(int start, int end) {
        if (start >= 10 && start <= 99 && end >= 10 && end <= 99) {
            int temp = end;
            int startRemainder = 0;
            int endRemainder = 0;

            do {
                startRemainder = start % 10;
                start /= 10;
                while (end > 0) {
                    endRemainder = end % 10;
                    if (startRemainder == endRemainder) {
                        return true;
                    }
                    end /= 10;
                }
                end = temp;
            } while (start > 0);
        }
        return false;
    }
}
