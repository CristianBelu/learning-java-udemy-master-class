package com.belu.code.Section_4_Expressions_Statements_CodeBlocks_Methods.Lesson_59_Playing_Cat;
public class PlayingCat {
    public static boolean isCatPlaying(boolean summer, int temperature) {

        if (temperature >= 25 && temperature <= 45 && summer) {
            return true;
        }
        else if (temperature >= 25 && temperature <= 35 && !summer) {
            return true;
        }
        else {
            return false;
        }
    }
}
