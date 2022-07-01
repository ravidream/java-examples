package com.example.programs;

import java.util.Scanner;

public class ASCIINO {
	public static void main(String args[]) {
		int chr;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Ascii character : ");
		chr = sc.nextInt();
		char chr1 = (char) chr;
		System.out.println("The Ascii value of Z is : " + chr1);
	}

}
