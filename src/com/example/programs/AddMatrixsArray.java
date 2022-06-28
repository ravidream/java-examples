class AddMatrixsArray
{
  public static void main(String args[])
  {
    int rows=2,columns=3,n;
    int[][] firstMatrix={{2,4,6},{4,6,8}};
    int[][] secondMatrix={{-4,2,5},{3,5,8}};
    int[][] sum=new int[rows][columns];
    for(int i=0;i<n;i++)
    {
        for(int j=0;j<n;j++)
        {
            sum[i][j]=firstMatrix[i][j]+secondMatrix[i][j];
        }
    }
    System.out.println("sum of two Matrixs is:=");
    for(int[] rows: sum)
    {
      for(int column:rows)
      {
          System.out.print(column + "    ");
      }
       System.out.println();
    }
  }
}