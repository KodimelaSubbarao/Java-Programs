package com.sa.string;

import java.util.Arrays;
import java.util.Scanner;
public class MatrixAntiClockwise 
{
	public static int[][] turnMatrixAnticlockwise(int[][]arr,int r,int c)
	{
		int[][] array=new int[r][c];
		int m=0,n;
		for(int i=r-1;i>=0;i--) 
		{
			n=0;
			for(int j=0;j<c;j++) 
			{
				array[m][n]=arr[j][i];
				n++;
			}
			m++;
		}
		return array;
	}
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no of row: ");
		int r=sc.nextInt();
		System.out.println("Enter no of column: ");
		int c= sc.nextInt();
		int[][] arr = new int[r][c];
		for(int i=0;i<r;i++)
		{
			System.out.println("Enter row element: ");
			for(int j=0;j<c;j++)
			{
				arr[i][j]=sc.nextInt();
			}
		}
		System.out.println(Arrays.deepToString(turnMatrixAnticlockwise(arr,r,c)));
		sc.close();
	}
}