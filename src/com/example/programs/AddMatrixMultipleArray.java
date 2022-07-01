package com.example.programs;

import java.util.Scanner;

public class AddMatrixMultipleArray {
	public static void main(String args[]) {
		int row, col, i, j;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no of rows : ");
		row = sc.nextInt();
		System.out.println("Enter the no of columns : ");
		col = sc.nextInt();
		int Matrix1[][] = new int[row][col];
		int Matrix2[][] = new int[row][col];
		int res[][] = new int[row][col];
		System.out.println("Enter the elements of matrix1 : ");
		for (i = 0; i < row; i++) {
			for (j = 0; j < col; j++) {
				Matrix1[i][j] = sc.nextInt();
//	      System.out.print(" ");
			}
			System.out.println();
		}
		System.out.println("Enter the elements of Matrix2 : ");
		for (i = 0; i < row; i++) {
			for (j = 0; j < col; j++) {
				Matrix2[i][j] = sc.nextInt();
//	      System.out.print(" ");
			}
			System.out.println();
		}
		for (i = 0; i < row; i++)
			for (j = 0; j < col; j++)
				res[i][j] = Matrix1[i][j] + Matrix2[i][j];
		System.out.println("sum of Matrixs :");
		for (i = 0; i < row; i++) {
			for (j = 0; j < col; j++)
				System.out.print(res[i][j] + "\t");
			System.out.println();
		}
	}

}
