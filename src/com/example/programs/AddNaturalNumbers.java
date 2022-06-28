package first15;

import java.util.Scanner;

public class AddNaturalNumbers {

	public static void main(String[] args) {
		Scanner s =new Scanner(System.in);
		int add=0;
		System.out.println("Enter the last number");
		int a= s.nextInt();
		
		
		for(int i= 1; i<=a;i++) {
			add=add+i;
		}
		System.out.println("Addition of numbers is " + add);
		
	}

}
