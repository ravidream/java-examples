package com.example.programs;

import java.util.*;

class CurvedSurfaceAreaOfCube {
	public static void main(String args[]) {
		double side;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the side of cube : ");
		side = sc.nextDouble();
		double surfaceAread = 4 * side * side;
		System.out.println("Result of CurvedSurfaceAreaOfCube : " + surfaceAread);
	}
}