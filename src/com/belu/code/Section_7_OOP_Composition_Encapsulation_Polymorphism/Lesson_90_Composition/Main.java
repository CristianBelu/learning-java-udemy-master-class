package com.belu.code.Section_7_OOP_Composition_Encapsulation_Polymorphism.Lesson_90_Composition;

public class Main {
	
	public static void main(String[] args) {
		
		double beerNum = 99;
		String word = "bottles";
		
		while (true) {
			if (beerNum == 1) {
				word = "bottle";
			}
			System.out.printf("%.0f %s of beer on the wall, ", beerNum, word);
			System.out.printf("%.0f %s of beer.%n", beerNum, word);
			System.out.printf("Take one down and pass it around, ");
			beerNum = beerNum - 1;
			if (beerNum > 0) {
				System.out.printf("%.0f %s of beer on the wall.%n%n", beerNum, word);
			} else {
				System.out.printf("no more bottles of beer on the wall.%n%n");
				System.out.printf("No more bottles of beer on the wall, ");
				System.out.printf("no more bottles of beer.%n");
				System.out.printf("Go to the store and buy some more, ");
				beerNum = 99;
				System.out.printf("%.0f %s of beer on the wall.%n%n", beerNum, word);
				break;
			}
		}
		
		Ildiko cuca = new Ildiko("Rosie", 170, 55);
		Ildiko cucocica = new Ildiko("Albastru", 250, 35);
		System.out.println("Ildiko are parul de culoarea: " + cuca.getHairColor());
		System.out.println("Ildiko are o inaltime de: " + cuca.getHeight() + " cm");
		System.out.println("Ildiko este subtirica si are o greutate de: " + cuca.getWeight() + " kg");
		
		cuca.vorbeste(7);

//		for (int i = 0; i < 12; i++) {
//			System.out.printf("End of the story! Good Night!%n");
//		}

//        Dimensions dimensions = new Dimensions(20,20,5);
//        Case theCase = new Case("220B","Dell","240",dimensions);
//        Monitor monitor = new Monitor("27inch Beast","Acer",27,new Resolution(2540,1440));
//
//        Motherboard motherboard = new Motherboard("83-200","Asus",4,6,"v2.44");
//
//        PC pc = new PC(theCase,monitor,motherboard);
////        pc.getMonitor().drawPixelAt(1500,1200,"red");
////        pc.getMotherboard().loadProgram("Windows 1.0");
////        pc.getTheCase().pressPowerButton();
//
//        pc.powerUp();
//
//
//        // Challenge !!!
//        // Create a simple room of a house using composition
//        // Think about the things that should be included in the room.
//        // Maybe physical parts of the house but also furniture
//        // Add at least one method to access an object using getter
//        // then that object's public method as you saw in the previous video
//        // then add at least one method to hide the object e.g. not using getter
//        // but to access the object used in composition within the main class
//        // like you saw in the video
//
//        Wall wall1 = new Wall("West");
//        Wall wall2 = new Wall("East");
//        Wall wall3 = new Wall("South");
//        Wall wall4 = new Wall("North");
//
//        Ceiling ceiling = new Ceiling(12,55);
//        Bed bed = new Bed("Modern",4,3,2,1);
//
//        Lamp lamp = new Lamp("Yogurt",true,100);
//
//        BedRoom bedRoom = new BedRoom("Cristian's",wall1,wall2,wall3,wall4,ceiling,bed,lamp);
//
//        bedRoom.makeBad();
//        bedRoom.getLamp().turnOn();
	
	
	}
}
