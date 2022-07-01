package com.example.programs;

import java.util.Scanner;

public class SumOfNumbers {
	public static void main(String args[]) {
		int i, n, sum = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter N number : ");
		n = sc.nextInt();
		for (i = 0; i <= n; i++) {
			sum = sum + i;
		}
		System.out.println("Result of N numbers is : " + sum);
	}

}
