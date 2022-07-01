package com.example.programs;

import java.util.Scanner;

public class FactorialNo {
	public static void main(String args[]) {
		int i, mul = 1, n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any Factorial no : ");
		n = sc.nextInt();
		for (i = 1; i <= n; i++) {
			mul = mul * i;
		}
		System.out.println("Result of Factorial : " + mul);
	}

}
