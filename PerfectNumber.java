package com.sa.numbers;

public class PerfectNumber {

	public static void main(String[] args) {
		int n=28;
		int sum=0;
		for(int i=1;i<n;i++)
		{
			if(n%i==0) {
				System.out.print(i+" ");
				sum+=i;
			}
		}
		System.out.println();
		if(n==sum)
			System.out.println("Perfect Number");
		else
			System.out.println("Not Perfect Number");
	}
}
