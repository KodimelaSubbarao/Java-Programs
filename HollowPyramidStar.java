package com.sa.patterns;

public class HollowPyramidStar 
{

	public static void main(String[] args)
	{

		int n=5;
		for(int i=1;i<=n;i++)
		{
			for(int j=i;j<n;j++)
				System.out.print(" ");
			 for (int j = 1; j <= (2 * i - 1); j++) {
                if (j == 1 || j == (2 * i - 1) || i == n) { // Condition to print stars
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
			System.out.println();
		}
		
	}

}
