package com.belu.code.Section_6_OOP_Classes_Constructors_Inheritance.Lesson_77_Person;

public class Main {

    public static void main(String[] args) {
        Person person = new Person();

        person.setFirstName("");
        person.setLastName("");
        person.setAge(10);
        System.out.println("fullName = " + person.getFullName());
        System.out.println("teen = " + person.isTeen());

        person.setFirstName("John");
        person.setAge(18);

        System.out.println("fullName = " + person.getFullName());
        System.out.println("teen = " + person.isTeen());

        person.setLastName("Smith");
        System.out.println("fullName = " + person.getFullName());

        person.setAge(-5);
        System.out.println("age = " + person.getAge());
    }
}
