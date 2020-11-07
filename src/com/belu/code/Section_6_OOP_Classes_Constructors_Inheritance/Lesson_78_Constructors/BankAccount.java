package com.belu.code.Section_6_OOP_Classes_Constructors_Inheritance.Lesson_78_Constructors;

public class BankAccount {
    private int accountNumber;
    private double balance;
    private String customerName;
    private String email;
    private String phoneNumber;


    public BankAccount() {
        this(445,102.45,"Alin","alin@gmail.com","098313434 ");
    }

    public BankAccount(int accountNumber, double balance, String customerName, String email, String phoneNumber) {
        System.out.println("BankAccount Constructor with parameters called");
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.customerName = customerName;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public BankAccount(String customerName, String email, String phoneNumber) {
        this(9999,1453.45,customerName,email,phoneNumber);
    }

    public void withdrawFunds(double withdrawAmount) {
        if (withdrawAmount > this.balance){
            System.out.println("Sorry, you don't have sufficient funds, " +
                    "the withdrawn amount is: " + withdrawAmount + ", " +
                    "and your current balance is = " + balance);
        }
        else {
            this.balance -= withdrawAmount;
            System.out.println("You have withdrawn = " + withdrawAmount + ". Your new balance is: " + balance);
        }
    }

    public void depositFunds(double depositAmount) {
        this.balance += depositAmount;
        System.out.println("You have successfully deposited = " + depositAmount + ". Your balance is: " + getBalance());
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
