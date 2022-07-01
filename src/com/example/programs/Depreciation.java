package com.example.programs;

public class Depreciation {
	public static void main(String args[]) {
		long amount, deppercent, year, afterdep, temp;
		amount = 100000;
		deppercent = 10;
		year = 3;
		temp = amount;
		for (int i = 0; i < year; i++)
			System.out.println("After depreciation : " + temp);
	}

}
