package com.example.programs;

import java.util.*;

class PerfectNo {
	public static void main(String args[]) {
		int n, sum = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any integer no : ");
		n = sc.nextInt();
		for (int i = 1; i < n; i++) {
			if (n % i == 0) {
				sum = sum + i;
			}
		}
		if (sum == n) {
			System.out.println("Given no is perfect");
		} else {
			System.out.println("Given no is not perfect");
		}

	}

	int divisor(int x) {
		return x;
	}
}