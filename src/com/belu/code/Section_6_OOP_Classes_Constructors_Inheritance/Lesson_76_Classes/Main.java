package com.belu.code.Section_6_OOP_Classes_Constructors_Inheritance.Lesson_76_Classes;

public class Main {

    public static void main(String[] args) {

        Car porsche = new Car();
        Car holden = new Car();
        porsche.setModel("911");

        System.out.println("Model is " + porsche.getModel());


    }
}
