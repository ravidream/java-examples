package com.example.programs;

import java.util.Scanner;

public class MultiplicationTable {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int fact = 1;
		System.out.println("Enter the number : ");
		int a = s.nextInt();

		for (int i = 1; i <= 10; i++) {
			System.out.println(a + " * " + i + " = " + (a * i));
		}

	}

}
