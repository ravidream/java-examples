package com.example.programs;

import java.util.Scanner;

public class Palindrome {
	public static void main(String[] args) {
		Scanner s =new Scanner(System.in);
		int sum=0;
		System.out.println("Enter the number " );
		int n = s.nextInt();
		int r ;
		
		int num =n;
		for(int i=0;;i++) {
			r=num%10;
			sum=(sum*10)+r;
			num =num/10;
			if(num==0) {
				break;
			}
		}System.out.println(sum);
		if (n==sum) {
			System.out.println("Palindrome");	
		}
		else {
				System.out.println("Not palindrome");	
			}
		
		
	}

}
