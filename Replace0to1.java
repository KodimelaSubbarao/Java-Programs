package com.sa.numbers;

public class Replace0to1 {

	public static void main(String[] args)
	{
		int n=2034030000;
		String s=String.valueOf(n);
		String result=s.replace('0', '1');
		System.out.println(result);
	}

}
