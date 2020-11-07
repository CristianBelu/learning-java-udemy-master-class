package com.belu.code.Section_7_OOP_Composition_Encapsulation_Polymorphism.Lesson_92_Encapsulation;

public class Main {

    public static void main(String[] args) {

//        Player player = new Player();
//
//        player.fullName = "Cristi";
//        player.health = 20;
//        player.weapon = "Gun"   ;
//
//        int damage = 10;
//        player.looseHealth(damage);
//        System.out.println("Remaining health = " + player.healthRemaining());
//
//        damage = 11;
//        player.health = 200;
//        player.looseHealth(damage);
//        System.out.println("Remaining health = " + player.healthRemaining());

        EnhancedPlayer enhancedPlayer = new EnhancedPlayer("Cristi", 55, "Gun");
        System.out.println("Initial health is " + enhancedPlayer.getHealth());
    }
}
