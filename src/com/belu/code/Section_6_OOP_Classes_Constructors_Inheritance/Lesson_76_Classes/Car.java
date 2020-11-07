package com.belu.code.Section_6_OOP_Classes_Constructors_Inheritance.Lesson_76_Classes;

public class Car {

    private int doors;
    private int wheels;
    private String model;
    private String engine;
    private String color;


    public void setModel(String model) {
        String validModel = model.toLowerCase();
        if (validModel.equals("carrera") || validModel.equals("comodore")) {

            this.model = model;
        } else {
            this.model = "unknown";
        }
    }

    public String getModel() {
        return this.model;
    }

}
