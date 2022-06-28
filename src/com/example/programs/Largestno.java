package com.example.programs;

import java.util.*;

class Largestno {
	public static void main(String args[]) {
		int firstNo, secondNo, thirdNo;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 1st no : ");
		firstNo = sc.nextInt();
		System.out.println("Enter 2nd no : ");
		secondNo = sc.nextInt();
		System.out.println("Enter 3rd no : ");
		thirdNo = sc.nextInt();
		if (firstNo > secondNo && firstNo > thirdNo) {
			System.out.println("Largest no is : " + firstNo);
		} else if (secondNo > thirdNo) {
			System.out.println("Largest no is : " + secondNo);
		} else {
			System.out.println("Largest no is : " + thirdNo);
		}
	}
}