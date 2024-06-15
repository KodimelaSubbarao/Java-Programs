package practice;

public class VariableTypes
{
	int id=10;
	static String name="KSR";
	void meth1()
	{
		char c='A';
		System.out.println(id);
		System.out.println(name);
		System.out.println(c);
		//meth2();
	}

	static void meth2()
	{
		//System.out.println(c);
		System.out.println(new VariableTypes().id);
		System.out.println(name);
		new VariableTypes().meth1();
	}
	public static void main(String[] args)
	{
		VariableTypes obj=new VariableTypes();
		obj.meth1();
		meth2();
	}
}
