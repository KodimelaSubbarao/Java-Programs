package com.sa.string;

public class ReplaceString 
{
	public static void main(String[] args)
	{
		String s="Java is Awesome";
		String s1="Java";
		String s2="Subbu";
		
		s=s.replaceAll(s1, s2);
		System.out.println(s);
	}

}
