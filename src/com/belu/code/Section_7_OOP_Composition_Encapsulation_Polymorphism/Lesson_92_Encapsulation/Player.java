package com.belu.code.Section_7_OOP_Composition_Encapsulation_Polymorphism.Lesson_92_Encapsulation;

public class Player {

    public String fullName;
    public int health;
    public String weapon;

    public void looseHealth(int damage) {
        this.health = this.health - damage;
        if (this.health <= 0) {
            System.out.println("Player knocked out");
            // TODO: 11/2/2019
            // reduce number of lives remaining for the player
        }
    }

    public int healthRemaining() {
        return this.health;
    }
}
