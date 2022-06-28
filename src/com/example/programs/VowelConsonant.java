package com.example.programs;

import java.util.*;

class VowelConsonant {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a character : ");
		char ch = sc.next().charAt(0);
		if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == ' ') {
			System.out.println("Given character is Vowel");
		} else {
			System.out.println("Given character is Consonant");
		}
	}
}