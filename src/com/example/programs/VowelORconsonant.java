package com.example.programs;

import java.util.Scanner;

public class VowelORconsonant {
	public static void main(String[] args) {

		Scanner s =new Scanner(System.in);
		
		
		System.out.println("Enter any character :");
		char a= s.next().charAt(0);
		if(a=='a'|| a=='e'|| a=='i' || a=='o' || a=='u'|| a=='A'|| a=='E'|| a=='I' || a=='O' || a=='U') {
			System.out.println("Character is vowel");
			
		}
		else
		{
			System.out.println("Character is consonant");

		}
	}

}
