package com.belu.code.Section_6_OOP_Classes_Constructors_Inheritance.Lesson_78_Constructors_Challenge;

public class VipCustomer {
    private String name;
    private String email;
    private double creditLimit;

    public VipCustomer() {
        this("Cristian Belu","belucristianalin@gmail.com",525.25);
    }

    public VipCustomer(String name, String email) {
        this(name, email, 1000.525);
    }

    public VipCustomer(String name, String email, double creditLimit) {
        this.name = name;
        this.email = email;
        this.creditLimit = creditLimit;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public double getCreditLimit() {
        return creditLimit;
    }
}
