package com.sa.patterns;

public class PyramidStar {

	public static void main(String[] args) 
	{
		int n=5;
		
		for(int i=1;i<=5;i++)
		{
			for(int j=n-i;j>0;j--)
				System.out.print(" ");
			for(int k=1;k<=i;k++)
				System.out.print(" *");
			System.out.println();
		}
	}

}
