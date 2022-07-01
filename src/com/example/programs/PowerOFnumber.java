package com.example.programs;

import java.util.Scanner;

public class PowerOFnumber {
	public static void main(String[] args) {
		Scanner s =new Scanner(System.in);
		int total =1;
		int exponant = 3;
		System.out.println("Enter the number " );
		int num= s.nextInt();
		
		
		for(int i=1;i<=exponant;i++) {
			total = total*num;
			
		}
		System.out.println("Total is " + total );

	}

}
