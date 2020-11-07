package com.belu.code.Section_5_Control_Flow_Statements.Lesson_70_Flour_Pack_Problem;
public class FlourPacker {

	public static boolean canPack(int bigCount, int smallCount, int goal) {

		int bigBags = 5;
		
		if (bigCount < 0 || smallCount < 0 || goal < 0) {
			return false;
		}
		
		if (bigCount * bigBags > goal && goal % bigBags <= smallCount) {
			return true;
		} else if (bigCount * bigBags < goal && goal - bigCount * bigBags <= smallCount) {
			return true;
		} else if (bigCount * bigBags == goal) {
			return true;
		} else {
			return false;
		}
	}
}