package com.example.programs;

import java.util.Scanner;

public class QuotientRemainder {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int quotient;
		int remainder;
		System.out.println("enter number");
		int val = s.nextInt();
		System.out.println("Divisor");
		int dev = s.nextInt();

		// quotient
		quotient = (int) (val / dev);
		System.out.print("the value of quotient is: ");
		System.out.println(quotient);

		// remainder
		remainder = (int) (val % dev);
		System.out.print("the value of remainder is: ");
		System.out.println(remainder);

	}

}
