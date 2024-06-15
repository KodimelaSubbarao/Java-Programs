package com.sa.patterns;

public class RhombusStar {

	public static void main(String[] args) {
		int n=5;
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=i;j++)
				System.out.print(" ");
			for(int k=1;k<=n;k++)
				System.out.print(" *");
			System.out.println();
		}
		
		System.out.println();
		
		for(int i=n;i>=1;i--)
		{
			for(int j=1;j<=i;j++)
				System.out.print(" ");
			for(int k=1;k<=n;k++)
				System.out.print(" *");
			System.out.println();
		}

	}

}
