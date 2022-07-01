package com.example.programs;

import java.util.Scanner;

public class QuadraticEquation {
	public static void main(String args[]) {
		double a, b, c;
		double root1 = 0, root2 = 0, imaginary, discriminant;
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the value of a, b, c of Quadratic Equation");
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		discriminant = (b * b) - (4 * a * c);
		if (discriminant > 0) {
			root1 = (-b + Math.sqrt(discriminant) / (2 * a));
			root1 = (-b - Math.sqrt(discriminant) / (2 * a));
			System.out.println("Two Roots : root1 : " + root1 + " and root2 : " + root2);
		} else if (discriminant == 0) {
			root1 = root2 = -b / (2 * a);
			System.out.println("Two equal and real root exits::root1=" + root1 + "and root2=" + root2);
		} else if (discriminant < 0) {
			root1 = root2 = -b / (2 * a);
			imaginary = Math.sqrt(-discriminant) / (2 * a);
			System.out.println("The two complex roots exits : root1 : " + root1 + "+" + imaginary + "and root2 : "
					+ root2 + " - " + imaginary);
		}
	}

}
