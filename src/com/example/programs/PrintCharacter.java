package com.example.programs;

import java.util.Scanner;

public class PrintCharacter {
	public static void main(String args[]) {
	    char ch;
	    Scanner sc=new Scanner(System.in);
	    for(ch='A'; ch <= 'Z'; ++ch) {
	      System.out.println("Print the character : "+ch);
	    }
	  }

}
