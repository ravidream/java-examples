package com.example.programs;

import java.util.Scanner;

public class AlbhabetORnot {
	public static void main(String[] args) {
		Scanner s =new Scanner(System.in);
		System.out.println("enter a character");
		char a= s.next().charAt(0);
		if((a>='a' && a<='z') || (a>='A' && a<='Z')) {
			System.out.println(a + " is alfabet");
			
		}
		else
		{
			System.out.println(a + " is not alfabet");

		}
	}

}
