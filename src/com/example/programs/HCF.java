package com.example.programs;

import java.util.*;

class HCF {
	int temp;

	int highest(int a, int b) {
		if (a != b) {
			if (a > b)
				a = a - b;
			else
				b = b - a;
			return highest(a, b);
		}
		return a;
	}

	public static void main(String args[]) {
		HCF h = new HCF();
		int n1, n2;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 1st no : ");
		n1 = sc.nextInt();
		System.out.println("Enter 2nd no : ");
		n2 = sc.nextInt();
		System.out.println("HCF of two numbers is : " + h.highest(n1, n2));
	}
}