package com.belu.code.Section_5_Control_Flow_Statements.Lesson_70_Flour_Pack_Problem;

public class Main {
	public static void main(String[] args) {
		System.out.println(FlourPacker.canPack(1, 0, 4));
		System.out.println(FlourPacker.canPack(1, 0, 5));
		System.out.println(FlourPacker.canPack(0, 5, 4));
		System.out.println(FlourPacker.canPack(2, 2, 11));
		System.out.println(FlourPacker.canPack(-3, 2, 11));
		System.out.println(FlourPacker.canPack(3, 2, -11));
	}
}
