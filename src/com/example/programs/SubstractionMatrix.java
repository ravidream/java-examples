package com.example.programs;

public class SubstractionMatrix {
	public static void main(String args[]) {
		int i, j;
		int a[][] = { { 1, 3, 4 }, { 2, 4, 3 }, { 3, 4, 5 } };
		int b[][] = { { 1, 3, 4 }, { 2, 4, 3 }, { 1, 2, 4 } };
		int c[][] = new int[3][3];
		System.out.println("Matrix a[3][3] is");
		for (i = 0; i < 3; i++) {
			for (j = 0; j < 3; j++) {
//	    	System.out.println("Matrix a[3][3] is");
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println("Matrix b[3][3] is");
		for (i = 0; i < 3; i++) {
			for (j = 0; j < 3; j++) {
//	    	System.out.println("Matrix b[3][3] is");
				System.out.print(b[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println("Matrix after Substraction is");
		for (i = 0; i < 3; i++) {
			for (j = 0; j < 3; j++) {
//	    	 System.out.println("Matrix after Subtraction is");
				c[i][j] = a[i][j] - b[i][j];
				System.out.print(c[i][j] + " ");
			}
			System.out.println();
		}
	}

}
