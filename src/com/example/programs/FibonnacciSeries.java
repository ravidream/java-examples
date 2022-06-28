package com.example.programs;

import java.util.*;

class FibonnacciSeries {
	public static void main(String args[]) {
		int n, n1 = 0, n2 = 0, sum = 1;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any no : ");
		n = sc.nextInt();
		for (int i = 1; i <= n; i++) {
			n1 = n2;
			n2 = sum;
			sum = n1 + n2;
			System.out.println(n1 + " ");
		}
	}
}