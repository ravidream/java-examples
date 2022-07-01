package com.example.programs;

import java.util.Scanner;

public class LeapYear {
	public static void main(String[] args) {
		Scanner s =new Scanner(System.in);
		System.out.println("Enter the  Year in YYYY format : ");
		int numbVal= s.nextInt();
		
		if(numbVal % 4 == 0) {
			System.out.println(numbVal + " is leap year");
			
		}
		else
		{
			System.out.println(numbVal + " is not leap year");

		}
	}

}
