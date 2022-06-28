package com.example.programs;

/**
 * 
 * @author ravid
 *
 */
class CharacterToString {
	public static void main(String args[]) {
		char ch = 'A';
		// String st=Character.toString(ch);
		String st = String.valueOf(ch);
		System.out.println("The String is : " + st);
	}
}