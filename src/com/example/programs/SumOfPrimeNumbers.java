package com.example.programs;

import java.util.*;

class SumOfPrimeNumbers {
	public static void main(String args[]) {
		int number, x = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");
		number = sc.nextInt();
		for (int i = 2; i <= number / 2; i++) {
			if (primeOrNot(i) == 1) {
				if (primeOrNot(number - i) == 1) {
					System.out.println(number + " = " + i + " + " + (number - i));
					x = 1;
				}
			}
		}
		if (x == 0)
			System.out.println(+number + "Cannot be express as a sum of two prime numbers");
	}

	public static int primeOrNot(int n) {
		int c = 1;
		for (int i = 2; i < n; i++) {
			if (n % i == 0) {
				c = 0;
				break;
			}
		}
		return c;
	}
}