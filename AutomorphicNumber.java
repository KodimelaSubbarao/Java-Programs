package com.sa.numbers;

 class AutomorphicNumber 
{
	public static void main(String[] args) 
	{
		int n=376;
		int sqr=n*n;
		String s1=String.valueOf(n);
		String s2=String.valueOf(sqr);
		System.out.println(s1+" "+s2);
		String s3=s2.substring(s2.length()-s1.length());
		System.out.println(s3);
		if(s1.endsWith(s3))
			System.out.println("AutomorphicNumber");
		else
			System.out.println("Not AutomorphicNumber");
	}
}
 