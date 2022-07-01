package com.example.programs;

public class AddMatrixsArray {
	public static void main(String args[])
	  {
	    int rows=2,columns=3,n;
	    int[][] firstMatrix={{2,4,6},{4,6,8}};
	    int[][] secondMatrix={{-4,2,5},{3,5,8}};
	    int[][] sum=new int[rows][columns];
	    for(int i=0;i<2;i++)
	    {
	        for(int j=0;j<3;j++)
	        {
	            sum[i][j]=firstMatrix[i][j]+secondMatrix[i][j];
	        }
	    }
	    System.out.println("sum of two Matrixs is:=");
	    for(int i=0;i<2;i++)
	    {
	      for(int j=0;j<3;j++)
	      {
	          System.out.print(sum[i][j] + "   ");
	      }
	       System.out.println();
	    }
	  }

}
