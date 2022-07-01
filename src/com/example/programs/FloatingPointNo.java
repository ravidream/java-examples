package com.example.programs;

import java.util.Scanner;

public class FloatingPointNo {
	public static void main(String args[]) {
		float a, b, mul;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 1st no : ");
		a = sc.nextFloat();
		System.out.println("Enter 2nd no : ");
		b = sc.nextFloat();
		mul = a * b;
		System.out.println("Result : " + mul);
	}

}
