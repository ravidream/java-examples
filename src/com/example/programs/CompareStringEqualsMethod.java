package com.example.programs;

/**
 * 
 * @author ravid
 *
 */

public class CompareStringEqualsMethod {
	public static void main(String args[]) {
		String str = new String("Bold");
		String str2 = new String("Bold");

		if (str.equals(str2))
			System.out.println("Equal");
		else
			System.out.println("Not equal");
	}
}