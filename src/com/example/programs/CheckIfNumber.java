package com.example.programs;

import java.util.Scanner;

public class CheckIfNumber {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string : ");
		String str = sc.next();
		boolean number = str.matches("-?\\d+(\\.\\d+)?");

		if (number) {
			System.out.println("Given string is a number");
		} else {
			System.out.println("Given string is not number");
		}
	}

}
