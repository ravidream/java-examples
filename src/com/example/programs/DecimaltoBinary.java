package com.example.programs;

import java.util.Scanner;

public class DecimaltoBinary {
	public static void main(String args[]) {
		int num;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a decimal number : ");
		num = sc.nextInt();
		int bin[] = new int[100];
		int i = 0;
		while (num > 0) {
			bin[i++] = num % 2;
			num = num / 2;
		}
		System.out.println("Binary no is : ");
		for (int j = i - 1; j >= 0; j--) {
			System.out.println(bin[j]);
		}
	}

}
