package com.sa.patterns;

public class HalfDiamondStar {

	public static void main(String[] args) {
		int n=10;
		
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=i;j++)
				System.out.print("* ");
			System.out.println();
		}
		for(int i=n-1;i>=1;i--)
		{
			for(int j=1;j<=i;j++)
				System.out.print("* ");
			System.out.println();
		}
		
		System.out.println();
		
		for(int i=1;i<=n;i++)
		{
			for(int j=n;j>i;j--) {
				System.out.print("  ");
			}
			for(int k=1;k<=i;k++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		for(int i=n-1;i>=1;i--)
		{
			for(int j=n;j>i;j--) {
				System.out.print("  ");
			}
			for(int k=1;k<=i;k++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
		/*for (int i = 1; i <= n; i++) {
            for (int j = n; j > i; j--) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
		 for (int i = n - 1; i > 0; i--) {
	            for (int j = n; j > i; j--) {
	                System.out.print(" ");
	            }
	            for (int k = 1; k <= i; k++) {
	                System.out.print("*");
	            }
	            System.out.println();
	        }*/
	}

}
