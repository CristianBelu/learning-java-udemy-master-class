package com.belu.code.Section_4_Expressions_Statements_CodeBlocks_Methods.Lesson_59_Playing_Cat;
public class Main {
    public static void main(String[] args) {
        System.out.println(PlayingCat.isCatPlaying(true,10)); // false
        System.out.println(PlayingCat.isCatPlaying(true,25)); // true
        System.out.println(PlayingCat.isCatPlaying(true,45)); // true
        System.out.println(PlayingCat.isCatPlaying(true,50)); // false
        System.out.println(PlayingCat.isCatPlaying(false,10)); // false
        System.out.println(PlayingCat.isCatPlaying(false,25)); // true
        System.out.println(PlayingCat.isCatPlaying(false,35)); // true
        System.out.println(PlayingCat.isCatPlaying(false,40)); // false
    }
}
