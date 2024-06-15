package com.sa.numbers;

public class PrimeFactorsNumber {
	public static boolean isPrimeFactor(int n)
	{
		boolean flag=false;
		int count=0;
		for(int i=1;i<=n;i++)
		{
			if(n%i==0)
				count++;
		}
		if(count ==2)
			flag=true;
		return flag;
	}
	public static void main(String[] args) {
		int n=48;
		for(int i=1;i<=n;i++)
		{
			if(n%i==0)
			{
				if(isPrimeFactor(i)) {
					int x = n;
		            while(x%i==0){
		               System.out.print(i + " ");
		                x /= i;
		            }
				}
				
			}
		}

	}
}
