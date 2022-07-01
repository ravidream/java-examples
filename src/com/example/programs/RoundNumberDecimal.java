package com.example.programs;

import java.util.Scanner;

public class RoundNumberDecimal {
	public static void main(String args[]) {
		double num;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any number value : ");
		num = sc.nextDouble();
		System.out.format("%.4f", num);
	}

}
