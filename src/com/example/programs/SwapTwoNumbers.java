package com.example.programs;

import java.util.Scanner;

public class SwapTwoNumbers {

	public static void main(String[] args) {
		System.out.println("Please enter two numbers for swap :");
		Scanner s =new Scanner(System.in);
		int a= s.nextInt();
		int b = s.nextInt();
		System.out.println("Before Swap a is "+ a + " And b is "+ b);
		
		int c = a;
		a=b;
		b=c;
		System.out.println("After Swap a is "+ a + " And b is "+ b);

	}

}
