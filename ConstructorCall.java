package practice;

public class ConstructorCall
{
	int a;
	ConstructorCall()
	{
		System.out.println(a);
	}
	public ConstructorCall(int a)
	{
		this.a=a;
		System.out.println(a);
	}
	private ConstructorCall(int a,int b)
	{
		System.out.println(this.a+b);
	}
	protected ConstructorCall(String s)
	{
		System.out.println(a+s);
	}
	public static void main(String[] args)
	{
		new ConstructorCall();
		new ConstructorCall(10);
		new ConstructorCall(10,20);
		new ConstructorCall("sa");
	}

}
