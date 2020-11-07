package com.belu.code.Section_8_Arrays_Lists_Autoboxing_Unboxing.Lesson_105_ArrayList_Challenge;

import java.util.Scanner;

public class Main {
	private static Scanner scanner = new Scanner(System.in);
	private static MobilePhone mobilePhone = new MobilePhone("0731890414");
	
	public static void main(String[] args) {
		boolean quit = false;
		startPhone();
		printAction();
		while (!quit) {
          System.out.println("\nEnter action: (Press 6 - to show available actions)");
          int action = scanner.nextInt();
          scanner.nextLine();
          
          switch (action) {
              case 0:
                  System.out.println("\nShutting down");
                  quit = true;
                  break;
              case 1:
                  mobilePhone.printContacts();
                  break;
              case 2:
                  addNewContact();
                  break;
              case 3:
                  updateContact();
                  break;
              case 4:
                  removeContact();
                  break;
              case 5:
                  queryContact();
                  break;
              case 6:
                  printAction();
                  break;
          }
		}
	}
	
	private static void addNewContact() {
       System.out.println("Enter new contact name:");
       String name = scanner.nextLine();
       System.out.println("Enter phone number:");
       String phone = scanner.nextLine();
       Contact newContact = Contact.createContact(name,phone);
       if (mobilePhone.addNewContact(newContact)) {
           System.out.println("New Contact added: name = " + name + ", phone = " + phone );
       }
       else {
           System.out.println("Can't add, " + name + " already on file.");
       }
   }
   
   private static void updateContact() {
       System.out.println("Enter existing Contact name: ");
       String name = scanner.nextLine();
       Contact existingContactRecord = mobilePhone.queryContact(name);
       if (existingContactRecord == null) {
           System.out.println("Contact not found!");
           return;
       }
       System.out.println("Enter new Contact name: ");
       String newName = scanner.nextLine();
       System.out.println("Enter new Contact phone number: ");
       String newPhoneNumber = scanner.nextLine();
       Contact newContact = Contact.createContact(newName,newPhoneNumber);
       if(mobilePhone.updateContact(existingContactRecord,newContact)){
           System.out.println("Successfully updated record!");
       }
       else {
           System.out.println("Error updating record.");
       }
       
   }
    
    private static void removeContact() {
        System.out.println("Enter existing Contact name: ");
        String name = scanner.nextLine();
        Contact existingContactRecord = mobilePhone.queryContact(name);
        if (existingContactRecord == null) {
            System.out.println("Contact not found!");
            return;
        }
        if(mobilePhone.removeContact(existingContactRecord)) {
            System.out.println("Successfully deleted Contact.");
        }
        else {
            System.out.println("Error deleting Contact.");
        }
        
    }
    
    private static void queryContact() {
        System.out.println("Enter existing Contact name: ");
        String name = scanner.nextLine();
        Contact existingContactRecord = mobilePhone.queryContact(name);
        if (existingContactRecord == null) {
            System.out.println("Contact not found!");
            return;
        }
    
        System.out.println("Name: " + existingContactRecord.getName() +
                           " phone number is: " + existingContactRecord.getPhoneNumber());
        
    }
	
	private static void startPhone() { System.out.println("Starting phone..."); }
	
	private static void printAction() {
		System.out.println("\nAvailable actions:\nPress");
		System.out.println("0 - to shut down\n" +
                         "1 - to print contacts\n" +
                         "2 - to add existing contact\n" +
                         "3 - to update an existing contact\n" +
								 "4 - to remove existing contact\n" +
								 "5 - to search for an existing contact\n" +
								 "6 - to print a list of available actions\n");
       System.out.println("Choose your action: ");
	}
}
