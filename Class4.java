package Classes;

public class Class4 extends Class3
{
	public void meth1()
	{
		System.out.println("Class3 Meth1()");
	}
	@Override
	protected void meth2()
	{
		System.out.println("Class4 Meth1()");
	}
	public static void main(String[] args) 
	{
		Class3 obj=new Class3();
		obj.meth1();
		obj.meth2();
	}
}
