package com.example.programs;

import java.util.Scanner;

public class CalculateSumAverage {
	public static void main(String args[]) {
		int n, sum = 0;
		float average;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no of elements you want in array : ");
		n = sc.nextInt();
		int a[] = new int[n];
		System.out.println("Enter all the elements : ");
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
			sum = sum + a[i];
		}

		System.out.println("sum : " + sum);
		average = (float) sum / n;
		System.out.println("Average : " + average);
	}

}
