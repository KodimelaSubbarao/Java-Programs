package Conditions;

public class While 
{
	void meth1(int a, int b)
	{
		System.out.println("Find the even numbers in 0 to 100 numbers");
		int n=b;
		int i=++a;
		while(i<=n)
		{
			System.out.println(++i);
			i++; //++i it is work
		}
		System.out.println("largest number is "+n);
		
	}
	void meth2(int i, int b)
	{
		System.out.println("Find the odd numbers in 0 to 100 numbers");
		int n=b;
		while(i<n)
		{
			System.out.println(++i);
			i++;
		}
		System.out.println("largest number is "+n);
	}
	public static void main(String[] args) 
	{
		System.out.println("enter the range numbers(0 to n) to find even numbers");
		new While().meth1(0,100);
		System.out.println("\nenter the range numbers(0 to n) to find odd numbers");
		new While().meth2(0, 100);
		
	}
}
