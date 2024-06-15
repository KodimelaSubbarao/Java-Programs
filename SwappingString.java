package BasicPrograms;

import java.util.Arrays;

public class SwappingString 
{
	static int k=0;
	static void meth1()
	{
		String s="Java is Awesome and Java is Object Oriented Programming";
		String []s1=s.split(" ");
		System.out.println(s1.length);
		String s2[]=s1;
		System.out.println(Arrays.toString(s2));
		for(int i=0;i<s2.length;i++)
		{
			for(int j=i+1;j<s2.length;j++)
			{
				if(s2[i].length()>s2[j].length())
				{
					String temp=s2[i];
					s2[i]=s2[j];
					s2[j]=temp;
					i=0;
				}
			}
		}
		System.out.println(Arrays.toString(s2));
	}
	static void meth2()
	{
		String s="Java is Awesome and Java is Object Oriented Programming";
		String []s1=s.split(" ");
		System.out.println(s1.length);
		String s2[]=s1;
		String s11[]=new String[s1.length];
		
//			int x=s2[i].length();
			

		for(int j=65;j<92;j++)
		{
			char c=(char)j;
			String s9=""+c;
			for(int i=0;i<s2.length;i++)
			{
				if(s2[i].substring(0, 1).equalsIgnoreCase(s9))
				{
					
					s11[k]=s2[i];
					k++;
				}
			}	
		}
			
				
			
			
		
		System.out.println(Arrays.toString(s11));
	}
				
//				int a=65;
//				char c=(char)a;
//				String s3=""+c;
//				int b=97;
//				char c1=(char)b;
//				String s4=""+c1;
//				for(int k=a;k<=90;k++,b++)
//				{
//					if(s2[i].startsWith(s3) || s2[i].startsWith(s4))
//					{
//						s2[i]=s2[j];
//						i=0;
//					}
//				}
			
	
	static void meth3(int x)
	{
		for(int i=1;i<=x;i++)
		{
			for(int j=1;j<=i;j++)
				System.out.print("*");
			System.out.println();
				
		}
	}
	public static void main(String[] args) 
	{
		meth3(5);
	}

}
