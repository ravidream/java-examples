package com.example.programs;

import java.util.Scanner;

public class VariableToChar {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any numerical value");
		int a = sc.nextInt();
		char c = (char) a;
		System.out.println("the character value corrosponding to numerical value is " + c);
	}

}
