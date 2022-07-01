package com.example.programs;

import java.util.Scanner;

public class PositiveNegative {
	public static void main(String args[]) {
		int number;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no : ");
		number = sc.nextInt();
		if (number > 0) {
			System.out.println("No is Positive");
		} else {
			System.out.println("No is Negative");
		}
	}

}
