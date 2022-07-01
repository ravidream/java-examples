package com.example.programs;

public class CountNumberDigit {
	public static void main(String args[]) {
		int count = 0, num = 678392;
		while (num != 0) {
			num /= 10;
			++count;
		}
		System.out.println("Number of digits : " + count);
	}

}
