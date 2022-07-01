package com.example.programs;

import java.util.Scanner;

public class Calculator {
	public static void main(String args[])  {
	    double first,second;
	    char operator;
	    Scanner sc=new Scanner(System.in);
	    System.out.println("Enter two numbers : ");
	    
	    first=sc.nextDouble();
	    second=sc.nextDouble();
	    
	    System.out.println("Enter operator (+,-,*,/) : ");
	    operator=sc.next().charAt(0);
	    
	    double result;
	    
	    switch(operator) {
	      case'+':
	         result=first+second;
	         break;
	      case'-':
	         result=first-second;
	         break;
	      case'*':
	         result=first*second;
	         break;
	      case'/':
	         result=first/second;
	         break;
	      default:
	         System.out.println("Error ! operator is not correct");
	         return;
	    }
	    System.out.printf("%.1f %c %.1f = %.1f", first, operator, second, result);
	  }

}
