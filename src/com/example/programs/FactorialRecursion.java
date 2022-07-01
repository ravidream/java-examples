package com.example.programs;

import java.util.Scanner;

public class FactorialRecursion {
	public static void main(String args[]) {
		int num, factorial;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number : ");
		num = sc.nextInt();
		factorial = fact(num);
		System.out.println("Factorial of entered number is : " + factorial);
	}

	static int fact(int n) {
		int output;
		if (n == 1) {
			return 1;
		}
		output = fact(n - 1) * n;
		return output;
	}

}
