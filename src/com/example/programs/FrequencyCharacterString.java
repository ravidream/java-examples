package com.example.programs;

import java.util.*;

class FrequencyCharacterString {
	public static void main(String args[]) {
		char character;
		String str;
		int i;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string : ");
		str = sc.nextLine();
		System.out.println("Enter a perticular character : ");
		character = sc.nextLine().charAt(0);
		int count = 0;
		for (i = 0; i < str.length(); i++) {
			if (character == str.charAt(i)) {
				count++;
			}
		}
		System.out.println("Frequency of the given character : " + count);
	}
}