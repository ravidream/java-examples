package com.example.programs;

import java.util.Scanner;

public class Factor {
	public static void main(String args[]) {
		int number;
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter number : ");
		number = sc.nextInt();

		System.out.println("Factors of " + number + " are : ");

		for (int i = 1; i <= number; i++) {
			if (number % i == 0) {
				System.out.println(i + " ");
			}
		}
	}

}
