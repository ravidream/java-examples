package  com.example.programs;

import java.util.*;

class QuotientReminder {
	public static void main(String args[]) {
		int dividend, divisor;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter dividend no : ");
		dividend = sc.nextInt();
		System.out.println("Enter divisor no : ");
		divisor = sc.nextInt();
		int quotient = dividend / divisor;
		int remainder = dividend % divisor;
		System.out.println("Result of Quotient : " + quotient);
		System.out.println("Result of remainder : " + remainder);
	}
}