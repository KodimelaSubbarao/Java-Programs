package com.sa.numbers;

public class HCFTwoNumbers 
{
	public static void main(String[] args) 
	{
		int n1=36,n2=60,HCF=0;
		for(int i=1;i<=n1 || i<=n2;i++)
		{
			if(n1%i==0 && n2%i==0)
				HCF=i;
		}
		System.out.println(HCF);
		
		int lcm=(n1*n2)/HCF;
		System.out.println(lcm);
	}
}
