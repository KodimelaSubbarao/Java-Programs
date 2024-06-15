package com.sa.numbers;

public class StrongNumber 
{
	public static void main(String[] args)
	{
		int num=145;
		int sum=0;
		int n=num;
		while(n>0)
		{
			int digit=n%10;
			int fact=1;
			for(int i=1;i<=digit;i++)
			{
				fact*=i;
			}
			sum+=fact;
			n/=10;
		}
		System.out.println(sum);
		if(num==sum)
			System.out.println("Strong number");
		else
			System.out.println("not strong");
	}
}
