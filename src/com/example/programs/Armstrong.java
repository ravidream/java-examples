package com.example.programs;

import java.util.Scanner;

public class Armstrong {
	public static void main(String args[]) {
	    int num,number,temp,total=0;
	    Scanner sc=new Scanner(System.in);
	    System.out.println("Enter three digit no: ");
	    num=sc.nextInt();
	    
	    number=num;
	    for(;number != 0; number /=10)    {
	      temp=number % 10;
	      total=total+(temp*temp*temp);
	    }
	    
	    if(total==num)
	      System.out.println("This is an Armstrong No");
	    else
	      System.out.println("This is not an Armstrong No");
	  }

}
