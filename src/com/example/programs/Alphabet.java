package com.example.programs;

import java.util.Scanner;

public class Alphabet {
	public static void main(String args[]) {
		char ch;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter an Alphabet : ");
		
		ch = sc.next().charAt(0);
		
		if ((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z')) {
			System.out.println("'" + ch + "' is an Alphabet.");
		} else {
			System.out.println("'" + ch + "'  is not an Alphabet.");
		}
	}

}