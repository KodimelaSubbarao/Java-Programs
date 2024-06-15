package com.sa.string;

public class AllPermutationsOfString 
{
	public static void printpermutations(String s,String ans)
	{
		if(s.length()==0) {
			System.out.println(ans+"");
			return;
		}
		for(int i=0;i<s.length();i++)
		{
			char ch=s.charAt(i);
			String s1=s.substring(0,i)+s.substring(i+1);
			printpermutations(s1, ans+ch);
		}
	}
	public static void main(String[] args) 
	{
		String s="abcde";
		printpermutations(s, "");
	}
}
