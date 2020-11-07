package com.belu.code.Section_6_OOP_Classes_Constructors_Inheritance.Lesson_78_Constructors;

public class Main {

    public static void main(String[] args) {
	    BankAccount bankAccount = new BankAccount();
	    BankAccount bankAccount2 = new BankAccount(
                123,
                5000,
                "Cristi Belu",
                "belucristianalin2018@outlook.com",
                "+40 731 890 414");

        System.out.println(bankAccount2.getAccountNumber());
        System.out.println(bankAccount2.getBalance());
        System.out.println(bankAccount2.getCustomerName());

        bankAccount2.withdrawFunds(5000.0); // work's perfect
        System.out.println(bankAccount2.getBalance());

        BankAccount crisAccount = new BankAccount("Cristi","cristi@gmail.com","12356");
        System.out.println(crisAccount.getAccountNumber() + " name " + crisAccount.getCustomerName());
        /*bankAccount.setAccountNumber(12345);
        bankAccount.setBalance(500);
        bankAccount.setCustomerName("Cristian Belu");
        bankAccount.setEmail("belucristianalin@gmail.com");
        bankAccount.setPhoneNumber("+40 731 890 414");

        System.out.println("accountNumber = " + bankAccount.getAccountNumber());
        System.out.println("balance = " + bankAccount.getBalance());
        System.out.println("Customer Name: " + bankAccount.getCustomerName());
        System.out.println("Customer email: " + bankAccount.getEmail());
        System.out.println("Customer phone number: " + bankAccount.getPhoneNumber());

        bankAccount.depositFunds(350);
        System.out.println("Your balance is = " + bankAccount.getBalance());

        bankAccount.withdrawFunds(450);
        System.out.println("Your balance is = " + bankAccount.getBalance());

        bankAccount.withdrawFunds(450);
        System.out.println("Your balance is = " + bankAccount.getBalance());
*/
    }
}
