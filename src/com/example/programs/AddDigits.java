package com.example.programs;

import java.util.Scanner;

public class AddDigits {
	public static void main(String args[]) {
		int n, s = 0, r;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any no : ");
		n = sc.nextInt();
		while (n != 0) {
			r = n % 10;
			s = s + r;
			n = n / 10;
		}
		System.out.println("Result : " + s);
	}

}
