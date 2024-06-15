package com.sa.string;

public class CountNumberOfVowels {

	public static void main(String[] args) {
		String s="Kodimela Subbarao";
		int count=0;
		
		for(int i=0;i<s.length();i++ )
		{
			char ch=s.charAt(i);
			if(ch!=' ')
			{
				if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
				{
					count++;
				}
			}
		}
		System.out.println(count);
	}

}
