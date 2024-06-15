package com.sa.string;

public class Toggle_LowertoUpper
{
	public static void main(String[] args) 
	{
		String s="SkjgSHHJKds";
		String s1="";
		
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)>='A' && s.charAt(i)<='Z')
			{
				String t=""+s.charAt(i);
				s1=s1+t.toLowerCase();
			}
			else if(s.charAt(i)>='a' && s.charAt(i)<='z')
			{
				String t=""+s.charAt(i);
				s1=s1+t.toUpperCase();
			}
			else
			{
				String t=""+s.charAt(i);
				s1=s1+t;
			}
		}
		System.out.println(s1);
				
	}
}
