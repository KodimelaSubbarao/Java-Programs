package com.sa.numbers;

public class PrimeOrNotRecursion 
{
	public static boolean isPrime(int n,int i)
	{
		if(n<2)
			return false;
		else if(n==i)
			return true;
		else if(n%i==0)
			return false;
		i++;
		return isPrime(n,i);
	}
	public static void main(String[] args) 
	{
		String result=isPrime(11,2)?"Prime Number":"Not Prime";
		System.out.println(result);
	}
}
