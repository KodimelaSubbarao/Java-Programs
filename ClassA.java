package Subbarao;

public class ClassA {
	void meth1()
	{
		int a=34;
		int b=21;
		int c=a++ + ++b;//c=34+22=56   a=35 b=22
		int d=--a + --b + c--; //d=34+21+56=111  a=34  b=21  c=55
		int e=a + +b + +c +d--;//e=34+21+55+111=221 d=110
		int f=-a + b-- + -c - d++;//f=-34+21-55-110= -178    b=20  d=111
		int sum= a+b+c+d+e+f;
		System.out.println("Sum = "+sum);
	}
	

	public static void main(String[] args) 
	{
		ClassA aobj=new ClassA();
		aobj.meth1();
	}

}
