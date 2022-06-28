package com.example.programs;

import java.util.Scanner;

public class ASCIIVal {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.println("Enter the A-Z or a-z : ");
		char a = s.next().charAt(0);
		int b = (int) a;
		System.out.println("ASCII value = " + b);

	}

}
