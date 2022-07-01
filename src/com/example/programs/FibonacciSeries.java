package com.example.programs;

import java.util.Scanner;

public class FibonacciSeries {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int fact0 = 0;
		int fact1 = 1;
		int fact2;
		System.out.println("How many fibonacci numbers do you want ? ");
		int a = s.nextInt();

		for (int i = 1; i <= a; i++) {
			fact2 = fact0 + fact1;

			System.out.println(fact2 + "  ");
			fact0 = fact1;
			fact1 = fact2;
		}

	}

}
