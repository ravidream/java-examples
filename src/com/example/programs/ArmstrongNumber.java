package com.example.programs;

import java.util.Scanner;

public class ArmstrongNumber {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int sum = 0;
		System.out.println("Enter the number : ");
		int n = s.nextInt();
		int r;

		int num = n;
		for (int i = 0;; i++) {
			r = num % 10;
			sum = sum + r * r * r;
			num = num / 10;
			if (num == 0) {
				break;
			}
		}
		if (n == sum) {
			System.out.println("This is Armstong Number ");
		} else {
			System.out.println("This is not Armstong Number ");
		}

	}

}
