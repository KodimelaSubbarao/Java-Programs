package Conditions;

public class IfCondition
{
	void meth1(int i)
	{
		if(i<=100)
		{
			System.out.println("meth1() called");
			System.out.println(i);
		}
	}
	void meth2(int i)
	{
		if(i==10)
			//int a=10;//The left-hand side of an assignment must be a variable
			System.out.println("meth2() called");
		System.out.println(i);
	}
	void meth3(int a)
	{
		System.out.println("meth3() called");
		if(a>10)
			System.out.println("if block");
		//System.out.println("Hello");
		else
			System.out.println("else block");
	}
	void meth4(int b)
	{
		System.out.println("meth4() called");
		if(b==10)
		{
			System.out.println("if block");
			System.out.println("hello");
		}
		else
		{
			System.out.println("else block");
			System.out.println("hi");
		}
		
	}
	void meth5()
	{
		System.out.println("meth5() called");
		if(false)
		{
			System.out.println("if block");// dead code
			System.out.println("hi");
		}
		else
		{
			System.out.println("else block");
			System.out.println("hello");
		}
	}
	int meth6()
	{
		if(false)
			return 100;
		return 200;
	}
	void meth7()
	{
		int i;
		if((i=new IfCondition().meth6())>=200)
		{
			System.out.println("meth7() called");
		}
		
	}
	void meth8(int i)
	{
		if(i>0)
			System.out.println(i+"is positive");
		else if(i<0)
			System.out.println(i+"is negative");
		else
			System.out.println(i+"is equals to 0");
	}
	public static void main(String[] args) 
	{
		IfCondition obj=new IfCondition();
		//obj.meth1(10);
		//obj.meth2(10);
		//obj.meth3(1);
		//obj.meth4(1);
		//int i=obj.meth6();
		//System.out.println(i);
		//obj.meth7();
		obj.meth8(-1);
	}

}
