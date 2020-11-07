package com.belu.code.Section_7_OOP_Composition_Encapsulation_Polymorphism.Lesson_96_OOP_Master_Challenge;

public class Main {

    public static void main(String[] args) {

        Bread classicBread = new Bread("Flower", new Price(1.00));
        Meat classicMeat = new Meat("Beef", new Price(9.90));
        Salad classicSalad = new Salad("Raccoon", new Price(2.99));
        Sos classicSos = new Sos("BBQ", new Price(1.89));

        Burger classicBurger = new Burger(classicSalad,classicMeat,classicBread,classicSos);






//        Burger classicBurger = new Burger
//                (
//                        new Price(16.25),
//                        new Salad("Rucola", new Price(2.23)),
//                        new Meat("Beef", new Price(9.99)),
//                        new Bread("Flower", new Price(1.00)),
//                        new Sos("Soia", new Price(3.03))
//                );


        classicBurger.createBurger();
    }
}
