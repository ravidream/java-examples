package com.example.programs;

public class CompoundIntrest {
	public static void main(String args[]) {
		double amount = 0, principle = 1000, rate = 10, time = 3, ci;

		System.out.println("Principle : " + principle);

		System.out.println("Rate : " + rate);

		System.out.println("Time : " + time);

		amount = principle * ((1 + rate / 100) * (1 + rate / 100) * (1 + rate / 100));

		System.out.println("Amount : " + amount);

		ci = amount - principle;

		System.out.println("Compound intrest : " + ci);
	}

}
