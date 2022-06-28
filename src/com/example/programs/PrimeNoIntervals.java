package com.example.programs;

import java.util.*;

class PrimeNoIntervals {
	public static void main(String args[]) {
		int start, end;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter start value : ");
		start = sc.nextInt();
		System.out.println("Enter end value : ");
		end = sc.nextInt();
		while (start < end) {
			boolean flag = false;
			for (int i = 2; i <= start / 2; i++) {
				if (start % i == 0) {
					flag = true;
					break;
				}
			}
			if (!flag)
				System.out.println(start + " ");
			++start;
		}
	}
}