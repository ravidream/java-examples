package com.example.programs;

import java.util.Scanner;

public class PrimeNumber {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int flag = 0;
		System.out.println("Enter the number : ");
		int n = s.nextInt();
		if (n == 0 || n == 1) {
			System.out.println(" not prime");
		}
		if (n == 2) {
			System.out.println("prime");
		} else {
			for (int i = 2; i < n; i++) {
				if (n % i == 0) {
					System.out.println(" not prime");
					flag = 1;
					break;
				}
			}
			if (flag == 0) {

				System.out.println(" prime");
			}
		}

	}

}
