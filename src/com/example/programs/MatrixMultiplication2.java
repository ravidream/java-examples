class MatrixMultiplication2
{
  //creating two matrices
  public static void main(String args[])
  {
    int i,j,k;
    int a[][]={{1,1,1},{2,2,2},{3,3,3}};
    int b[][]={{1,1,1},{2,2,2},{3,3,3}};
    //creating another matrix to store the multiplication of two matrices
    int c[][]=new int[3][3];//3rows and 3 columns
    //multiplying and printing multiplication of 2 matrices
    for(Ni=0;i<3;i++)
      {
        for(j=0;j<3;j++)
        {
          c[i][j]=0;
          for(k=0;k<3;k++)
          {
            c[i][j]+=a[i][k]*b[k][j];
          }
          System.out.println(c[i][j]+"");
        }
        System.out.println();
      }
      
    
  }
}