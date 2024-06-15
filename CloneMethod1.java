package Class;

public class CloneMethod1 implements Cloneable
{
	int a=10;
	int b=20;
	public CloneMethod1 meth1() throws CloneNotSupportedException
	{
		CloneMethod1 c=(CloneMethod1)super.clone();
		return c;
	}
}
