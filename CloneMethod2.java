package Class;

public class CloneMethod2 
{
	public static void main(String[] args) throws CloneNotSupportedException
	{
		CloneMethod1 c=new CloneMethod1();
		System.out.println(c.a+" "+c.b);
		
//		CloneMethod1 c2=c;
//		c2.b=2000;
//		System.out.println(c.a+" "+c.b+" "+c2.b);
//		System.out.println(c2.equals(c));
		
		CloneMethod1 c1=c.meth1();
		c1.a=1000;
		System.out.println(c.a+" "+c.b+" "+c1.a);
		System.out.println(c1.equals(c));
	}
}
