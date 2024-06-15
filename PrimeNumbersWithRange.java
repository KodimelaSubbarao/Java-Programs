package com.sa.numbers;

public class PrimeNumbersWithRange 
{	public static void approach1()
	{
		int start=2;
		int end=30;
		
		for(int i=start;i<=end;i++)
		{
			for(int j=2;j<=i;j++)
			{
				if(i==j)
				{
					System.out.println(i);
					break;
				}
				if(i%j==0)
					break;
			}
		}
	}
	public static boolean isPrime(int n)
	{
		if(n<2)
			return false;
		for(int i=2;i<n;i++)
		{
			if(n%i==0)
				return false;
		}
		return true;
	}
	public static void approach2()
	{
		int low=5;
		int up=25;
		
		for(int i=low;i<=up;i++)
		{
			if(isPrime(i))
				System.out.println(i);
		}
	}
	public static void main(String[] args) 
	{
		approach2();
	}
}
