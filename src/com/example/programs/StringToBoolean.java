package com.example.programs;

public class StringToBoolean {
	public static void main(String args[]) {
		String s1 = "true";
		String s2 = "TRue";
		String s3 = "ok";
		String s4 ="Right";
		String s5 ="FAlse";
		boolean b1 = Boolean.parseBoolean(s1);
		boolean b2 = Boolean.parseBoolean(s2);
		boolean b3 = Boolean.parseBoolean(s3);
		boolean b4 = Boolean.parseBoolean(s4);
		boolean b5 = Boolean.parseBoolean(s5);
		System.out.println(b1);
		System.out.println(b2);
		System.out.println(b3);
		System.out.println(b4);
		System.out.println(b5);
	}

}
