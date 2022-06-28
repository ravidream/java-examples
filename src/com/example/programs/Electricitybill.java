package com.example.programs;

import java.util.*;

class Electricitybill {
	public static void main(String args[]) {
		long units;
		double billpay = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of units : ");
		units = sc.nextLong();
		if (units < 100)
			billpay = units * 1.20;
		else if (units < 300)
			billpay = 100 * 1.20 + (units - 100) * 2;
		else if (units > 300)
			billpay = 100 * 1.20 + 200 * 2 + (units - 300) * 3;
		System.out.println("Bill to pay : " + billpay);
	}
}