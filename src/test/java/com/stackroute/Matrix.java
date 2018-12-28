package com.stackroute;

public class Matrix

{
public int[][] addMatrix(int[][]a,int[][]b) // for the time being it;s datatype is void
{
    int[][] c=new int[3][2];

    for(int i=0;i<3;i++)
    {
        for(int j=0;j<2;j++)
        {
            c[i][j]=a[i][j]+b[i][j];
        }
    }
return c;
}
}
