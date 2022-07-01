package com.example.programs;

import java.util.Scanner;

public class Lcm {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int x = 1;
		System.out.println("Enter two numbers : ");
		int firstNo = s.nextInt();
		int secondNo = s.nextInt();
		int d = GCD(firstNo, secondNo);
		System.out.println("Lcm  : " + (Math.abs(firstNo) * Math.abs(secondNo)) / d);

	}

	static int GCD(int p, int q) {
		int c = 0;
		for (int i = 1; i <= ((p < q) ? p : q); i++) {

			if (p % i == 0 && q % i == 0) {
				c = i;
			}
		}
		return c;
	}

}
