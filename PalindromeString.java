package com.sa.string;

public class PalindromeString 
{
	public static void approach1()
	{
		String s="amma";
		StringBuffer sb=new StringBuffer(s);
		String rev=sb.reverse().toString();
		if(s.equals(rev))
			System.out.println("Palindrome");
		else
			System.out.println("Not Palindrome");
	}
	public static void approach2()
	{
		String s="dad";
		StringBuffer sb=new StringBuffer();
		for(int i=s.length()-1;i>=0;i--)
		{
			sb.append(s.charAt(i));
		}
		String rev=sb.toString();
		if(s.equals(rev))
			System.out.println("Palindrome");
		else
			System.out.println("Not Palindrome");
	}
	public static void main(String[] args) 
	{
		approach2();
	}
}
