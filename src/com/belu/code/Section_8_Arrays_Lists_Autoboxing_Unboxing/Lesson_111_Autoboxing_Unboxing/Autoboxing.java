package com.belu.code.Section_8_Arrays_Lists_Autoboxing_Unboxing.Lesson_111_Autoboxing_Unboxing;

import java.util.ArrayList;

public class Autoboxing {
	public static void main(String[] args) {
		String[] stringArray = new String[10];
		int[] intArray = new int[10];
		
		
		ArrayList<String> stringArrayList = new ArrayList<String>();
		stringArrayList.add("Cristi");
		
		//ArrayList<int> intArrayList = new ArrayList<int>();
		ArrayList<IntClass> intClassArrayList = new ArrayList<IntClass>();
		intClassArrayList.add(new IntClass(54));
		
		ArrayList<Integer> intArrayList = new ArrayList<>();
		
//		for (int i = 0; i <= 10; i++) {
//			intArrayList.add(Integer.valueOf(i));
//		}
//		
//		for (int i = 0; i <= 10; i++) {
//			System.out.println(i + " --> " + intArrayList.get(i).intValue());
//		}
		
		Integer myIntValue = 56; // Integer.valueOf(56);
		int myInt = myIntValue; // myInt.intValue();
		
		ArrayList<Double> myDoubleValue = new ArrayList<>();
		
		for(double dbl = 0.0; dbl <= 10.0; dbl +=0.5) {
			myDoubleValue.add(Double.valueOf(dbl));
			//myDoubleValue.add(dbl);
		}
		
		for (int i = 0; i < myDoubleValue.size(); i++) {
			double value = myDoubleValue.get(i).doubleValue();
			//double value = myDoubleValue.get(i);
			System.out.println(i + " --> " + value);
		}
		
		
		
		
	}

}

class IntClass {
	private int myValue;
	
	public IntClass(int myValue) {
		this.myValue = myValue;
	}

	public int getMyValue() {
		return myValue;
	}

	public void setMyValue(int myValue) {
		this.myValue = myValue;
	}
	
	
}
