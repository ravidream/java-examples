package com.example.programs;

import java.util.Scanner;

public class VowelAndConsonant {
	public static void main(String args[]) {
		int vCount = 0, cCount = 0;
		Scanner sc = new Scanner(System.in);
//		String str1 = sc.next().toString();
		String str = "Aeroplane is Flying in the Sky";
		str = str.toLowerCase();
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o'
					|| str.charAt(i) == 'u') {
				vCount++;
			} else if (str.charAt(i) >= 'a' && str.charAt(i) <= 'z') {
				cCount++;
			}
		}
		System.out.println("Number of Vowels are : " + vCount);
		System.out.println("number of Consonant are : " + cCount);
	}

}
