package com.example.programs;

import java.util.Scanner;

public class TSAC {
	public static void main(String args[]) {
		Double pi = 3.14;
		double R, H, tsac;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of radious : ");
		R = sc.nextDouble();
		System.out.println("Enter the value of height : ");
		H = sc.nextDouble();
		tsac = (2 * pi * R * H) + (2 * pi * R * R);
		System.out.println("Result of TSAC : " + tsac);
	}

}
