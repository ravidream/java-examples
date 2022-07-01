package com.example.programs;

import java.util.Scanner;

public class DiscountProduct {
	public static void main(String args[]) {
		double dis, amount, marketprice, s;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter marketprice : ");
		marketprice = sc.nextInt();
		System.out.println("Enter discount percentage : ");
		dis = sc.nextInt();
		s = 100 - dis;
		amount = (s * marketprice) / 100;
		System.out.println("Amount after discount : " + amount);
	}

}
