package com.example.programs;

import java.util.Scanner;

public class CountNumbersINdigits {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int x = 0; // digits
		System.out.println("Enter the number :");
		int num = s.nextInt();

		for (int i = 0;; i++) {
			x = x + 1;
			num = num / 10;
			if (num == 0) {
				break;
			}
		}
		System.out.println("Total digits " + x);

	}

}
