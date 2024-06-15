package practice;

public class Variables {

	byte b1;
	short s1;
	int i1;
	long l1;
	float f1;
	double d1;
	char c1;
	boolean flag1;

	void meth1()
	{
		System.out.println(b1+" "+s1+" "+i1+" "+l1+" "+f1+" "+d1+" "+c1+" "+flag1);
	}
	public static void main(String[] args)
	{
		byte b=10;
		short s=20;
		int i=30;
		long l=40;
		float f=10.6f;
		double d=1.23;
		char c='A';
		boolean flag=true;
		boolean flag1=(b==i);
		System.out.println(b+" "+s+" "+i+" "+l+" "+f+" "+d+" "+c+" "+flag);
		System.out.println(flag1);

		Variables v1=new Variables();
		v1.meth1();
		v1.meth2();
		v1.meth3();
	}

	void meth3()
	{
		System.out.println("\n");
		System.out.println("============Meth3()==========");
		int a=20;//2147483647
		byte b=3;
		short s=5;
		long l=8236678776867766L;
		float f=11.2429f;
		double d=53.76367556439;
		char c='f';
		byte b1=(byte) ((byte)6/0);
		float f1;
		boolean bool=true;
		System.out.println(bool);
	}
	void meth2()
	{
		System.out.println("\n");
		System.out.println("============Meth2()==========");
		//System.out.println(10/0); //Runtime Exception ArithmeticException

		//System.out.println('a'/0); //Runtime Exception ArithmeticException

		System.out.println(12.2/0); //Infinity no Exception

		//System.out.println(true/0); //compile time error
	}

}
