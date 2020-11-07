package com.belu.code.Section_6_OOP_Classes_Constructors_Inheritance.Lesson_78_Wall_Area_And_Point;

public class Main {

    public static void main(String[] args) {
	// Wall exercise testing
        Wall wall1 = new Wall();
        System.out.println("area = " + wall1.getArea());

        Wall wall2 = new Wall(5,4);
        System.out.println("area = " + wall2.getArea());
        System.out.println("new try");
        System.out.println();

        wall2.setHeight(-1.5);
        System.out.println("width = " + wall2.getWidth());
        System.out.println("height = " + wall2.getHeight());
        System.out.println("area = " + wall2.getArea());

        Wall wall = new Wall(-1.25,-1.25);
        System.out.println(wall.getHeight());
        System.out.println(wall.getWidth());

    // Point exercise

        Point first = new Point(6,5);
        Point second = new Point(3,1);
        System.out.println("distance(0,0)= " + first.distance());
        System.out.println("distance(0,0)= " + first.distance(second));
        System.out.println("distance(2,2)= " + first.distance(2,2));
        Point point = new Point();
        System.out.println("distance()= " + point.distance());


    }

    public static boolean hasTeen(int param1, int param2, int param3) {


        return true;
    }
}
