package Class;

public class ClassF 
{
	void meth1() //DC called
	{
		System.out.println(10);
		System.out.println(this.meth2()+56); //-18+56=38
	}
	int meth2() //meth1() called
	{
		System.out.println(75);
		System.out.println(96);
		return this.meth3(); //-18
	}
	int meth3() //meth2() called
	{
		System.out.println(74);
		System.out.println(92);
		return 74-92; //-18
	}
	void meth4()
	{
		System.out.println(56);
	}
	ClassF()
	{
		this(52);
		this.meth1();
		System.out.println(85);
	}
	ClassF(int a) //DC called a=52
	{
		System.out.println(a+7); //52+7
	}
}
/*
59
10
75
96
74
92
38
85
*/