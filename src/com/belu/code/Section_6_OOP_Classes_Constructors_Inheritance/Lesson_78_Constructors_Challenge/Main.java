package com.belu.code.Section_6_OOP_Classes_Constructors_Inheritance.Lesson_78_Constructors_Challenge;

public class Main {

    public static void main(String[] args) {
        // create a new class VipCustomer
        // it should have 3 parameters(fields - instance variables) : name, creditLimit, email
        // create 3 constructors
        // 1st constructor empty should call the constructor with 3 parameters with default values
        // 2nd constructor should pass on the 2 values it receives and add a default value for the 3rd
        // 3rd constructor should save all fields
        // create getters only for this using code generation of intelliJ, setters won't be needed
        // test and confirm it works

        VipCustomer customer1 = new VipCustomer();
        System.out.println(customer1.getName());
        VipCustomer customer2 = new VipCustomer("Belu", "cristi.belu@autoliv.com");
        System.out.println(customer2.getName());
        VipCustomer customer3 = new VipCustomer("George","george.opris@gemail.com",100000);
        System.out.println(customer3.getName());
        System.out.println(customer3.getCreditLimit());
    }
}
