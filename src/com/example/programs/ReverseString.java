package com.example.programs;

import java.util.*;

class ReverseString {
	public static void main(String args[]) {
		String original, reverse = "";
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any reverse string : ");
		original = sc.next();
		int length = sc.nextInt();
		for (int i = length - 1; i >= 0; i--) {
			reverse = reverse + original.charAt(i);
		}
		System.out.println("Result : " + reverse);
	}
}