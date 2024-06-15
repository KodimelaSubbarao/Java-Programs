package com.sa.string;

public class RemoveAllCharsExcpetAlphabets {

	public static void main(String[] args) {
		String s="S@178Subbu^5543((&&%^";
		String result="";
		
		for(int i=0;i<s.length();i++)
		{
			char ch=s.charAt(i);
			if(ch>='A' && ch<='Z' || ch>='a' && ch<='z')
				result+=ch;
		}
		System.out.println(result);
		int i='0';
		System.out.println(("9".charAt(0)-'0')+("5".charAt(0)-'0'));
		System.out.println(i);
	}

}



