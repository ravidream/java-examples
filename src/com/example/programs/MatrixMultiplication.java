package com.example.programs;


import java.util.*;
class MatrixMultiplication
{
  public static void main(String args[])
  {
    int m,n,p,q,sum=0,c,d,k;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the rows and coloum of 1st matrix : ");
    m=sc.nextInt();
    n=sc.nextInt();
    int first[][]=new int[m][n];
    System.out.println("Enter elements of 1st matrix : ");
     for(c=0;c<m;c++)
     {
     for(d=0;d<n;d++)
     first[c][d]=sc.nextInt();
     {
     System.out.println("Enter the no of rows and coloum of second matrix : ");
     }
     }
     p=sc.nextInt();
     q=sc.nextInt();
     if(n!=p)
     {
      System.out.println("The matrix can't be muliplied with each other");
     }
     else {
     int second[][]=new int[p][q];
     int multiply[][]=new int[m][q];
     System.out.println("Enter elements of second matrix");
     for(c=0;c<p;c++);
     for(d=0;d<q;d++);
     second[c][d]=sc.nextInt();
     for(c=0;c<m;c++)
     {
     for(d=0;d<q;d++)
     {
      sum=sum+first[c][k]*second[k][d];
      multiply[c][d]=sum;
      sum=0;
     }
     }
  }
}