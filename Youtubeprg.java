package BasicPrograms;

public class Youtubeprg 
{
	void meth()
	{
		/*
		 * WAJP to print the English Alphabet in
		 * Upper case(A to Z) and Lower case(a to z)
		 */
		System.out.println("Alphabet in Upper case are:");
		for(char ch = 'A'; ch<='Z'; ch++) {
			System.out.print(ch + " ");
		}
		
		System.out.println("\n");
		
		System.out.println("Alphabet in Lower case are:");
		for(char ch = 'a'; ch<='z'; ch++) {
			System.out.print(ch + " ");
		}
	}
	void meth1()
	{
		// WAJP to print the factors of a given number
		int number = 80;
		
		System.out.println("Factors are:");
		for(int i=1; i<=number; i++) {
			if(number%i == 0)
				System.out.println(i);
		}
	}
	void meth2()
	{
		// WAJP to print the factorial of a given number
		int number = 10;
		int factorial = 1;
		
		for(int i = 1; i<= number; i++) {
			factorial = factorial * i;
			//can also be written as factorial *= i
		}
		
		System.out.println("Factorial is: "+factorial);
	}
	void meth3()
	{
		/*
		 * WAJP to print the sum of the Even numbers 
		 * ranging from 80 to 250 using for loop
		 */
		int sNumber = 80;
		int eNumber = 250;
		int sum = 0;
		
		for(int i = sNumber; i<=eNumber; i++) {
			if(i % 2 == 0)
				sum = sum + i;
		}
		
		System.out.println("Sum is: "+sum);
	}
	
	void meth4()
	{
		/*
		 * WAJP to print multiplication table 
		 * of a given number
		 */
        int number = 3;
		
		for(int i=1; i<=20; i++) {
			System.out.printf("%d * %d = %d \n", number, i, (number*i) );
		}
	}
	void meth5()
	{
		for(int i=0;i<=5;i++)
		{
			//System.out.print(i+" ");
			for(int j=i;j>=0;j--)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
	void meth6()
	{
		for(int i=5;i>=0;i--)
		{
			//System.out.print(" ");
			for(int j=i;j>=0;j--)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
	void meth7()
	{
		for(int i=5;i>=1;i--)
		{
			System.out.print(" ");
			for(int j=i;j>=1;)
			{
				System.out.print("* ");
				j--;
				for(int k=i;k>i-2;k--)
				{
					
				}
			}
			System.out.println();
			
			
		}
	}
	void meth8()
	{
		
	}
	void meth9()
	{
		
	}
	public static void main(String[] args) 
	{
		Youtubeprg obj=new Youtubeprg();
		obj.meth7();
	}
}
