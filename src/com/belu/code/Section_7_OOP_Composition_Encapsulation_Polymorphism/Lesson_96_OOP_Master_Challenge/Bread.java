package com.belu.code.Section_7_OOP_Composition_Encapsulation_Polymorphism.Lesson_96_OOP_Master_Challenge;

public class Bread {
    private String name;
    private Price price;

    public Bread(String name, Price price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public Price getPrice() {
        return price;
    }
}
