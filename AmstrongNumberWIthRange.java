package com.sa.numbers;

public class AmstrongNumberWIthRange 
{
	public static int getLength(int num)
	{
		
		int len=0;		
		while(num>0)
		{
			len++;
			num/=10;
		}
		return len;
	}
	public static int getAmstrongValue(int num,int len)
	{
		int sum=0;
		while(num>0)
		{
			sum=sum+(int)Math.pow(num%10, len);
			num/=10;
		}
		return sum;
	}
	public static void main(String[] args) 
	{
		int low=1;
		int high=1000;
		System.out.println(low+" to "+high+" Amstrong Numbers:");
		for(int i=low;i<=high;i++)
		{
			int len=getLength(i);
			//int aom=getAmstrongValue(i, len);
			if(i==getAmstrongValue(i, len))
				System.out.println(i);
			
		}
	}
}
