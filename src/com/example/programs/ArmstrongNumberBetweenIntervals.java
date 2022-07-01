package com.example.programs;

import java.util.Scanner;

public class ArmstrongNumberBetweenIntervals {
	public static void main(String args[]) {
		int start, end, n, sum;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter starting number : ");
		start = sc.nextInt();
		System.out.println("Enter end number : ");
		end = sc.nextInt();
		for (int i = start; i <= end; i++) {
			n = i;
			sum = 0;
			while (n != 0) {
				int pick_last = n % 10;
				sum = sum + (pick_last * pick_last * pick_last);
				n = n / 10;
			}

			if (sum == i) {
				System.out.println("Armstrong number between provided range is");
				System.out.println(i);
			}
		}
		sc.close();
	}

}
