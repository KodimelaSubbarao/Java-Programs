package com.sa.numbers;

public class ReverseNumber
{
	public static void approach1()
	{
		int n=12345;
		int rev=0;
		
		while(n>0)
		{
			rev=(rev*10)+n%10;
			n=n/10;
		}
		System.out.println(rev);
	}
	public static int approach2(int n,int rev)
	{
		if(n==0)
			return rev;
		int rem=n%10;
		rev=rev*10+rem;
		return approach2(n/10,rev);
	}
	public static void main(String[] args) {
		approach1();
		System.out.println(approach2(12345,0));
	}
}
