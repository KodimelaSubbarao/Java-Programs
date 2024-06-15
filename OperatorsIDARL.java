package practice;

public class OperatorsIDARL
{
	void meth1()
	{
		int a=10;
		int b=20;
		a=a++;
		a=a++;
		System.out.println(a);
//		System.out.println(a++);
//		System.out.println(++a);
//		System.out.println(b--);
//		System.out.println(--b);
//		meth2();
	}
	void meth2()
	{
		System.out.println("\n");
		System.out.println(10+120);
		System.out.println(123-7643);
		System.out.println(12*346);
		System.out.println(54/5);
		System.out.println((2+34)-(9*9));
		System.out.println(24+3-4*5/65);
	}
	void meth3(int a)
	{
		if(a==10)
		{
			System.out.println("a is "+a);
		}
		else if(a>=16 && a<=20)
		{
			System.out.println("given number is 16 to 20 ");
		}
		else if(a<30)
		{
			System.out.println("given number is less than 30 ");
		}
		else if(a>100)
		{
			System.out.println("given number is greate then 100");
		}
		else if(a!=50)
		{
			System.out.println("given number is not equal to 50");
		}
		else
		{
			System.out.println("all conditions are failed");
		}
	}
	void meth4(int a, int b, int c)
	{
		if(a>b && a>c)
			System.out.println("a is big");
		else if(b>c)
			System.out.println("b is big");
		else
			System.out.println("c is big");

		if(a==b || b==c)
			System.out.println("two values are equal");
		else if(!(a>b))
			System.out.println("not condition");
	}
	public static void main(String[] args)
	{
		new OperatorsIDARL().meth1();
	}
}
