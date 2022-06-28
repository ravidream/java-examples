package com.example.programs;

import java.util.*;

class PalindromNo {
	public static void main(String args[]) {
		int r, sum = 0, n, temp;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter r value : ");
		r = sc.nextInt();
		System.out.println("Enter n value : ");
		n = sc.nextInt();
		temp = n;
		while (n > 0) {
			r = n % 10;
			sum = (sum * 10) + r;
			n = n / 10;
		}
		if (temp == sum)
			System.out.println("Palindrom number");
		else
			System.out.println("Not Palindrom");
	}
}