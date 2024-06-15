package com.sa.string;

public class PalindromeORNotString {

	public static void main(String[] args) {
		String s="amma";
		String result="";
	
		for(int i=s.length()-1;i>=0;i--)
		{
			result+=s.charAt(i);
		}
		if(s.equals(result))
			System.out.println("Palindrome");
		else
			System.out.println("Not Palindrome");

	}

}
