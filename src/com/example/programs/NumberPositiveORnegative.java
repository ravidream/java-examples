package first15;

import java.util.Scanner;

public class NumberPositiveORnegative {

	public static void main(String[] args) {
		Scanner s =new Scanner(System.in);
		int a= s.nextInt();
		if(a>=0) {
			System.out.println(a + " is positive");
			
		}
		else
		{
			System.out.println(a + " is negative");

		}

	}

}
