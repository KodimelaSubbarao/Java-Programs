package com.sa.numbers;

public class FibonacciSeries
{
	public static void main(String[] args)
	{
		int f1=0,f2=1,num=5;
		System.out.print(f1+"," +f2);
		for(int i=2;i<num;i++)
		{
			int next=f1+f2;
			f1=f2;
			f2=next;
			
			System.out.print(","+next);
		}
	}
}
