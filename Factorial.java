package com.sa.numbers;

public class Factorial 
{
	public static int factorial(int n)
	{
		if(n==0)
			return 1;
		return n * factorial(n-1);
	}
	public static void main(String[] args) {
		int n=5;
		int fact=1;
		for(int i=1;i<=n;i++)
		{
			fact*=i;
		}
		System.out.println(factorial(n));
	}
}
