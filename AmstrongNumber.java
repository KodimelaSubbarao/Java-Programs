package com.sa.numbers;

public class AmstrongNumber 
{
	public static void main(String[] args) 
	{
		// 1.Find the LENGTH of the Number
		// 2. Find the each digit power separately 
		// and add the calculate power values
		
		int n=371;
		int n1=n;
		int sum=0;
		int n2=n;
		int len=0;
		while(n1>0)
		{
			len++;
			n1/=10;			
		}
		while(n2>0)
		{
			sum=(int) (sum+Math.pow(n2%10, len));
			n2/=10;	
		}
		System.out.println(sum);
		if(n==sum)
			System.out.println("AmstrongNumber");
		else
			System.out.println("not AmstrongNumber");
	}
}
