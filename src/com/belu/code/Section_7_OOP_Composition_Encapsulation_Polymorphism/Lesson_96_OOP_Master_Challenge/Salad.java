package com.belu.code.Section_7_OOP_Composition_Encapsulation_Polymorphism.Lesson_96_OOP_Master_Challenge;

public class Salad {
    private String name;
    private Price saladPrice;

    public Salad(String name, Price price) {
        this.name = name;
        this.saladPrice = price;
    }

    public String getName() {
        return name;
    }

    public Price getSaladPrice() {
        return saladPrice;
    }
}
