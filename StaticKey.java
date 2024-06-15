package practice;

public class StaticKey
{
	static int i=new StaticKey().meth2();
	int meth2()
	{
		System.out.println("meth2() ");
		return 10;
	}
	static{
		System.out.println(i);
		System.out.println("static block");
	}
	{
		System.out.println("Instance block");
	}
	StaticKey()
	{
		System.out.println("constructor ");
	}
	static void meth1()
	{
		System.out.println("Static meth1() ");
	}
	public static void main(String[] args)
	{
		//var obj=new StaticKey();
		//obj.main(args);
		meth1();
	}
	static {
		System.out.println("2nd static block");
	}
	{
		System.out.println("2nd Instance block");
	}
}
