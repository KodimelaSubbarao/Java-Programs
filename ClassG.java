package Class;

public class ClassG extends ClassF
{
	void display()
	{
		System.out.println("hi");
		super.meth4();
	}
	static int show(int a) //DC called a=50
	{
		System.out.println(a+a); //100
		return a+a++; //50+50=100
	}
	ClassG() //1st main()
	{
		this(show(50)); //this(100)
		for(int i=1;;i++)
		{
			super.meth4();
			break;
		}
		System.out.println("hi");
		System.out.println(show(50));
	}
	ClassG(int a) //DC Called  a=100
	{
		//super() //internally called them parent class Default Constructor
		System.out.println("===>"+a+++show(50));//100+100=200
	}
	public static void main(String[] args) 
	{
		new ClassG().display();
	}
}
/*
 100
 59
10
75
96
74
92
38
85
100
56
hi
100
100
hi
56
===>100100
 */
