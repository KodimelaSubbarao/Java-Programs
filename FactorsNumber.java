package com.sa.numbers;

public class FactorsNumber 
{
	public static void main(String[] args) 
	{
		int n=87478;
		for(int i=1;i<=n;i++)
		{
			if(n%i==0)
				System.out.println(i);
		}
		//System.out.println(n/2);
		
	/*	
		for(int i=1;i<=n/2;i++)
		{
			if(n%i==0)
				System.out.println(i);
		}
		System.out.println(n);
	*/
	}
}
