package com.example.programs;

import java.util.Scanner;

public class Factorial {
	public static void main(String[] args) {
		Scanner s =new Scanner(System.in);
		int fact=1;
		System.out.println("Enter the number");
		int a= s.nextInt();
		
		
		for(int i= 1; i<=a;i++) {
			fact=fact*i;
		}
		System.out.println("Factorial of "+a+" is " + fact);

	}

}
