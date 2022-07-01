package com.example.programs;

public class StringEmptyNull {
	public static void main(String args[]) {
		String str1 = null;
		String str2 = "";
		if (isNullOrEmpty(str1))
			System.out.println("First String is Empty or null");
		else
			System.out.println("First String is not null or Empty");
		if (isNullOrEmpty(str2))
			System.out.println("First String is Empty or null");
		else
			System.out.println("First String is not null or Empty");
	}

	public static boolean isNullOrEmpty(String str) {
		if (str != null && !str.isEmpty())
			return false;
		return true;
	}

}
