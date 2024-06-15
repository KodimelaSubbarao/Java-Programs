package com.sa.numbers;

public class Ptint_F_of_NthTerm 
{
	public static void main(String[] args) 
	{
		int n=4;
		int k=1;
		int sum=0;
		
		for(int i=0;i<n;i++)
		{
			int cal=1;
			for(int j=0;j<=i;j++,k++)
			{				
				cal*=k;
			}
			sum+=cal;
		}
		System.out.println(sum);
	}
}
