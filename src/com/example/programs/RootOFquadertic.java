package com.example.programs;

import java.util.Scanner;

public class RootOFquadertic {
	public static void main(String[] args) {
		Scanner s =new Scanner(System.in);
		int sum=0;
		int x;
		int root1;
		int root2;
		
		System.out.println("Enter cofficient of x^2" );
		int a = s.nextInt();
		System.out.println("Enter cofficient of x" );
		int b = s.nextInt();
		System.out.println("Enter constant" );
		int c = s.nextInt();
		
		x=(b*b)-4*a*c;
		if(x>=0) {
			root1=(int) (((-b)+Math.sqrt(x))/(2*a));
			root2=(int) (((-b)-Math.sqrt(x))/(2*a));
			
			System.out.println(root1+"  "+ root2 );
			
		}
		else {
			System.out.println("Root is complex " );
		}
		

	}

}
