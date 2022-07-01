package com.example.programs;

import java.util.Scanner;

public class Gcd {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int x = 1;
		System.out.println("Enter two numbers : ");
		int firstNo = s.nextInt();
		int secondNo = s.nextInt();
		for (int i = 1; i <= ((firstNo < secondNo) ? firstNo : secondNo); i++) {

			if (firstNo % i == 0 && secondNo % i == 0) {
				x = i;
			}
		}
		System.out.println(x + " is the gcd ");

	}

}
