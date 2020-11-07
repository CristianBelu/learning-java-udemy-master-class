package com.belu.code.Section_6_OOP_Classes_Constructors_Inheritance.Lesson_78_Carpet_Cost;

public class Carpet {
    private double cost;

    public Carpet(double cost) {
        if (cost < 0){
            this.cost = 0;
        }
        else {
            this.cost = cost;
        }
    }

    public double getCost() {
        return cost;
    }
}
