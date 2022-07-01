package com.example.programs;

public class ReverseString2 {
	public static void main(String args[]) {
		String name = "Ravi";
		int length = name.length();
		String rev = " ";
		for (int i = 0; i <= length -1; i--) {
			rev = rev + name.charAt(i);
		}
		System.out.println("Result : " + rev);
	}

}
