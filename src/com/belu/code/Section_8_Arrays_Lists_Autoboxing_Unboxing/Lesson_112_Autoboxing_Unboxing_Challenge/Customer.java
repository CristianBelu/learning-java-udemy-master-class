package com.belu.code.Section_8_Arrays_Lists_Autoboxing_Unboxing.Lesson_112_Autoboxing_Unboxing_Challenge;

import java.util.ArrayList;

public class Customer {

	private String name;
	private ArrayList<Double> transactions;

	public Customer(String name, double initialAmount) {
		this.name = name;
		this.transactions = new ArrayList<Double>();
		addTransaction(initialAmount);
	}

	public void addTransaction(double amount) {
		this.transactions.add(amount);
	}

	public String getName() {
		return name;
	}

	public ArrayList<Double> getTransactions() {
		return transactions;
	}

}
