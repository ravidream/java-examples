package com.example.programs;

import java.util.Scanner;

public class CalculatePowerofNumber {
	public static void main(String args[]) {
		int num, p;
		long result = 1;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter num : ");
		num = sc.nextInt();
		System.out.println("Enter Power : ");
		p = sc.nextInt();
		int i = p;
		while (i != 0) {
			result *= num;
			--i;
		}
		System.out.println(num + "^" + p + "=" + result);
	}

}
