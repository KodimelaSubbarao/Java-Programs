package com.sa.numbers;

public class SumOfDigitsOfaNumber
{
	public static void approach1()
	{
		int num=12345;
		int sum=0;
		while(num>0)
		{
			sum+=num%10;
			num=num/10;
		}
		System.out.println(sum);
	}
	public static long approach2(long n)
	{
		if(n==0)
			return 0;
		return n%10+approach2(n/10);
	}
	public static void main(String[] args) 
	{
		//approach1();
		System.out.println("Sum of digits :: "+approach2(1235777777777777745L));
	}
}
