package Classes;

public class Class2 {
//static {
//	System.out.println("hi");
//}
	
	int a=10;
	static int b=20;
	void meth1()
	{
		System.out.println(a);
		System.out.println(b);
	}
	static void meth2() 
	{
		
		System.out.println(b);
		System.out.println(new Class2().a);
	}
public static void main(String[] args) {
	//Class1 a1=null;
	Class2 a2=new Class2();
	a2.meth1();
	a2.meth2();
}
}
