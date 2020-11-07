package com.belu.code.Section_9_Inner_Abstract_Classes_Interfaces.Lesson_126_Inner_Classes;

import java.util.Scanner;


public class Main {

	private static Scanner scanner = new Scanner(System.in);
	private static Button buttonPrint = new Button("Print");

	private static void listen() {
		boolean quit = false;
		while (!quit) {
			int choice = scanner.nextInt();
			scanner.nextLine();
			switch (choice) {
			case 0:
				quit = true;
				break;
			case 1:
				buttonPrint.onClick();
			}
		}
	}

	public static void main(String[] args) {

//		class ClickListner implements Button.OnClickListner {
//			public ClickListner() {
//				System.out.println("Clicked");
//			}
//
//			@Override
//			public void onClick(String tittle) {
//				System.out.println(tittle + " clicked");
//			}
//		}
//
//		buttonPrint.setOnClickListner(new ClickListner());
		
		buttonPrint.setOnClickListner(new  Button.OnClickListner() {
			
			@Override
			public void onClick(String tittle) {
				System.out.println(tittle + " clicked");
			}
		});
		listen();

//		GearBox mcLaren = new GearBox(6);

//		GearBox.Gear first = mcLaren.new Gear(1,  12.3);
//		These 2 example are NOK, you can not instantiate a inner class using the 2 methods below 		
//		GearBox.Gear second = new GearBox.Gear(2,  15.4);
//		GearBox.Gear third = new mcLaren.Gear(3, 17.8)
//		System.out.println(first.driveSpeed(1000));

//		mcLaren.addGear(1,  5.3);
//		mcLaren.addGear(2,  10.6);
//		mcLaren.addGear(3,  15.9);

//		Commented this to use other example		
//  	mcLaren.operateClutch(true);
//		mcLaren.changeGear(1);
//		mcLaren.operateClutch(false);
//		System.out.println(mcLaren.wheelSpeed(1000));
//		mcLaren.changeGear(2);
//		System.out.println(mcLaren.wheelSpeed(3000));
//		mcLaren.operateClutch(true);
//		mcLaren.changeGear(3);
//		mcLaren.operateClutch(false);
//		System.out.println(mcLaren.wheelSpeed(6000));

	}
}
