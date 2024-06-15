package com.sa.numbers;

public class NumberIsPalindrome 
{
	public static void main(String[] args) 
	{
		int num=1212121;
		int temp=num;
		int rev=0;
		 
		while(temp>0)
		{
			rev=rev*10+temp%10;
			temp /=10;
		}
		if(num==rev)
			System.out.println("Palindrome");
		else 
			System.out.println("Not a Palindrome");
	}
}
