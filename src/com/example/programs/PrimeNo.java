package com.example.programs;

import java.util.Scanner;

public class PrimeNo {
	public static void main(String args[]) {
		int no, temp = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any no : ");
		no = sc.nextInt();
		for (int i = 2; i <= no - 1; i++) {
			if (no % i == 2) {
				temp = temp + 1;
			}
		}
		if (temp > 0) {
			System.out.println("Number is not prime");
		} else {
			System.out.println("Number is prime");
		}
	}
	

}
