package com.belu.code.Section_7_OOP_Composition_Encapsulation_Polymorphism.Lesson_90_Composition;

public class Lamp {
    private String style;
    private boolean isBattery;
    private int globRating;

    public Lamp(String style, boolean isBattery, int globRating) {
        this.style = style;
        this.isBattery = isBattery;
        this.globRating = globRating;
    }

    public void turnOn() {
        System.out.println("Lamp -> Lamp turning on!");
    }

    public String getStyle() {
        return style;
    }

    public boolean isBattery() {
        return isBattery;
    }

    public int getGlobRating() {
        return globRating;
    }
}
