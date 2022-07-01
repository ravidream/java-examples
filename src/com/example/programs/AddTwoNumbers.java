package com.example.programs;

import java.util.Scanner;

public class AddTwoNumbers {
	public static void main(String args[]) {
		int a, b, sum;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 1st no : ");
		a = sc.nextInt();
		System.out.println("Enter 2nd no : ");
		b = sc.nextInt();
		sum = a + b;
		System.out.println("Result : " + sum);
	}

}
