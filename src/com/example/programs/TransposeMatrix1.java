package com.example.programs;

public class TransposeMatrix1 {
	public static void main(String args[])
	  {
	      int original[][]={{1,2,3},{4,5,6},{7,8,9}};
	      int transpose[][]=new int[3][3];
	      for(int i=0;i<3;i++)
	        {
	            for(int j=0;j<3;j++)
	              {
	                transpose[j][i]=original[i][j];
	              }
	        }
	        System.out.println("Printing matrix without transpose");
	        for(int i=0;i<3;i++)
	        {
	          for(int j=0;j<3;j++)
	            {
	                System.out.print(original[i][j]+" ");
	            }
	            System.out.println();
	        }
	        System.out.println("Printing Matrix After Transpose");
	        {
	          for(int i=0;i<3;i++)
	           {
	              for(int j=0;j<3;j++)
	                {
	                    System.out.print(transpose[i][j]+" ");
	                }
	                System.out.println();
	           }
	        }
	  }

}
