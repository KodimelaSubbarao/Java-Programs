package com.sa.numbers;

public class SumOfNaturalNumsUsingRecursion {

	public static void main(String[] args) 
	{
		System.out.println(getSum(5));
	}
	public static int getSum(int i)
	{
		if(i==0)
			return 0;
		return i+getSum(i-1);//5+4+3+2+1+0
	}
}
