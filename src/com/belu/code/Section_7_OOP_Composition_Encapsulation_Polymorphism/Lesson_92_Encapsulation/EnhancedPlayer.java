package com.belu.code.Section_7_OOP_Composition_Encapsulation_Polymorphism.Lesson_92_Encapsulation;

public class EnhancedPlayer {
    private String name;
    private int hitPoints = 100;
    private String weapon;

    public EnhancedPlayer(String name, int health, String weapon) {
        this.name = name;
        if (health > 0 && health <= 100){
            this.hitPoints = health;
        }
        this.weapon = weapon;
    }

    public void looseHealth(int damage) {
        this.hitPoints = this.hitPoints - damage;
        if (this.hitPoints <= 0) {
            System.out.println("Player knocked out");
            // TODO: 11/2/2019
            // reduce number of lives remaining for the player
        }
    }

    public int getHealth() {
        return hitPoints;
    }
}
