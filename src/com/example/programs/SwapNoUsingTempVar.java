package com.example.programs;

import java.util.Scanner;

public class SwapNoUsingTempVar {
	public static void main(String args[]) {
		int firstNo, secondNo, temp;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of x and y ");
		firstNo = sc.nextInt();
		secondNo = sc.nextInt();
		System.out.println("Before swapping number : " + firstNo + " " + secondNo);
		temp = firstNo;
		firstNo = secondNo;
		secondNo = temp;
		System.out.println("After swapping : " + firstNo + " " + secondNo);
		System.out.println();
	}

}
