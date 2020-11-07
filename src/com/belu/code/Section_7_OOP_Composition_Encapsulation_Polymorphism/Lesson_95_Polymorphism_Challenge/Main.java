package com.belu.code.Section_7_OOP_Composition_Encapsulation_Polymorphism.Lesson_95_Polymorphism_Challenge;

class Car {
    private boolean isGasolineEngine;
    private int cylinders;
    private String name;
    private int wheels;

    public Car(int cylinders, String name) {
        this.cylinders = cylinders;
        this.name = name;
        this.wheels = 4;
        this.isGasolineEngine = true;
    }

    public int getCylinders() {
        return cylinders;
    }

    public String getName() {
        return name;
    }

    public String startEngine() {
         return getClass().getSimpleName() + " -> startEngine()";
    }

    public String accelerate() {
        return getClass().getSimpleName() + " -> accelerate()";
    }

    public String breaking() {
        return getClass().getSimpleName() + " -> breaking()";
    }

}

class Mitsubishi extends Car {
    public Mitsubishi(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public String startEngine() {
        return getClass().getSimpleName() + " -> startEngine()";
    }

    @Override
    public String accelerate() {
        return getClass().getSimpleName() + " -> accelerate()";
    }

    @Override
    public String breaking() {
        return getClass().getSimpleName() + " -> breaking()";
    }
}
class Ford extends Car {
    public Ford(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public String startEngine() {
        return getClass().getSimpleName() + " -> startEngine()";
    }

    @Override
    public String accelerate() {
        return getClass().getSimpleName() + " -> accelerate()";
    }

    @Override
    public String breaking() {
        return getClass().getSimpleName() + " -> breaking()";
    }
}
class Dacia extends Car {
    public Dacia(int cylinders, String name) {
        super(cylinders, name);
    }
//
//    @Override
//    public String startEngine() {
//        return getClass().getSimpleName() + " -> startEngine()";
//    }
//
//    @Override
//    public String accelerate() {
//        return getClass().getSimpleName() + " -> accelerate()";
//    }

//    @Override
//    public String breaking() {
//        return getClass().getSimpleName() + " -> breaking()";
//    }
}

public class Main {

    public static void main(String[] args) {
        // We are going to ga back to the car analogy
        // Create a base class called Car
        // It should have a few fields that are appropriate for the generic car class:
        // engine, cylinders, wheels etc.
        // Constructor should initialize cylinders(number of) and name, and set wheels to 4
        // and engine to true. Cylinders and name would be passed parameters
        //
        // Create appropriate getters
        //
        // Create some methods like startEngine, accelerate, and break
        //
        // show a message for each in the base class
        // Now create 3 subclasses for your favorite vehicles
        // Override the appropriate methods to demonstrate polymorphism in use
        // put all classes in one java file (this one)

        Car car = new Car(8, "Base Car");
        System.out.println(car.startEngine());
        System.out.println(car.accelerate());
        System.out.println(car.breaking());


        Mitsubishi mitsubishi = new Mitsubishi(6,"Evolution 8");
        System.out.println(mitsubishi.startEngine());
        System.out.println(mitsubishi.accelerate());
        System.out.println(mitsubishi.breaking());

        Ford ford = new Ford(4,"Focus");
        System.out.println(ford.startEngine());
        System.out.println(ford.accelerate());
        System.out.println(ford.breaking());

        Dacia dacia = new Dacia(4,"1310");
        System.out.println(dacia.startEngine());
        System.out.println(dacia.accelerate());
        System.out.println(dacia.breaking());

    }


}
