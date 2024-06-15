package BasicPrograms;

public class Swapping2numbers 
{
	static void case1()
	{
		int a=10, b=20;
		System.out.println("Before Swapping a :"+a+" and b: "+b);	
		//using third variable to swap two numbers
		int t=a;
		a=b;
		b=t;
		System.out.println("After Swapping a :"+a+" and b: "+b);		
	}
	static void case2()
	{
		int a=10, b=20;
		System.out.println("Before Swapping a :"+a+" and b: "+b);	
		// using + and - operators without using third variable
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("After Swapping a :"+a+" and b: "+b);		
	}
	static void case3()
	{
		int a=10, b=20;
		System.out.println("Before Swapping a :"+a+" and b: "+b);	
		// using * and / operators without using third variable
		//is this case work only two values are not zero 
		//two values are zero do not work this case
		a=a*b;
		b=a/b;
		a=a/b;
		System.out.println("After Swapping a :"+a+" and b: "+b);		
	}
	static void case4()
	{
		int a=10, b=20;
		System.out.println("Before Swapping a :"+a+" and b: "+b);	
		// using bitwise XOR(^) operator
		a=a^b;
		b=a^b;
		a=a^b;
		System.out.println("After Swapping a :"+a+" and b: "+b);		
	}
	static void case5()
	{
		int a=10, b=20;
		System.out.println("Before Swapping a :"+a+" and b: "+b);	
		//single statement using to swap two numbers
		b=a+b-(a=b);
		System.out.println("After Swapping a :"+a+" and b: "+b);		
	}
	public static void main(String[] args) 
	{
		case5();
	}
}
