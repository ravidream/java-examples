package com.example.programs;

import java.util.Scanner;

public class PowerUsingRecursion {
	public static int power(int base, int exp) {
		if (exp != 0) {
			return (base * power(base, exp - 1));
		} else {
			return 1;
		}
	}

	public static void main(String args[]) {
		int base, exp;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the base number : ");
		base = sc.nextInt();
		System.out.println("Enter the exp number : ");
		exp = sc.nextInt();
		System.out.println(power(base, exp));
	}

}
