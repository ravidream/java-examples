package com.example.programs;

public class ReverseNumber1 {
	public static void main(String args[]) {
		int n = 123, s = 0, r;
		r = n % 10;
		s = s * 10 + r;
		n = n / 10;
		r = n % 10;
		s = s * 10 + r;
		n = n / 10;
		r = n % 10;
		s = s * 10 + r;
		System.out.println("Result  : " + s);
	}

}
