package com.example.programs;

import java.util.Scanner;

public class OddEven {
	public static void main(String args[]) {
		int num;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any no : ");
		num = sc.nextInt();
		if (num % 2 == 0)
			System.out.println("Enter no is Even");
		else
			System.out.println("Enter no is Odd");
	}

}
