package practice;

public class TypeCasting
{
	void implictTypeCast()
	{
		//process of converting smaller DataType to larger DataType
		//byte-short,int,long,float,double
		byte b=127;
		short s=b; int i=b;long l=b;float f=b;double d=b;
		System.out.println(b+" "+s+" "+i+" "+l+" "+f+" "+d+" ");

		//short-int,long,float,double
		short s1=9763;
		int i1=s1;
		long l1=s1;
		float f1=s1;
		double d1=s1;
		System.out.println(s1+" "+i1+" "+l1+" "+f1+" "+d1);

		//char-int,long,float,double
		char c=55;
		int i2=c;
		long l2=c;
		float f2=c;
		double d2=c;
		System.out.println(c+" "+i2+" "+l2+" "+f2+" "+d2);

		//int-long,fl0at,double
		int i3=68546899;
		long l3=i3;
		float f3=i3;
		double d3=i3;
		System.out.println(i3+" "+l3+" "+f3+" "+d3);

		//long-float,double
		long l4=8977634598665567887L;
		float f4=l4;
		double d4=l4;
		System.out.println(l4+" "+f4+" "+d4);

		//float-double
		float f5=7836.6789767f;
		double d5=f5;
		System.out.println(f5+" "+d5);
	}
	static void explictTypeCast()
	{
		System.out.println("\n");
		//Process of Converting larger data type to smaller data type
		//formula minimumrange +(value-maximumrange-1)
		//byte-char
		byte b=127;
		char c=(char)b;
		System.out.println(b+" "+c);

		//short- byte , char
		short s=159;
		byte b1=(byte)s;
		System.out.println(-128+(159-127-1));
		char c1=(char)s;
		System.out.println(s+" "+b1+" "+c1);

		//int - byte,short,char
		int i=67453;
		byte b2=(byte)i;
		short s2=(short)i;
		char c2=(char)i;
		System.out.println(i+" "+b2+" "+s2+" "+c2);

		//long-int,char,short,byte
		long l=67235467423L;
		byte b3=(byte)l;
		short s3=(short)l;
		char c3=(char)l;
		int i3=(int)l;
		System.out.println(l+" "+b3+" "+s3+" "+c3+" "+i3);

		//float - long,int,char,short,byte
		float f=73.2365f;
		byte b4=(byte)f;
		short s4=(short)f;
		char c4=(char)f;
		int i4=(int)f;
		long l4=(long)f;
		System.out.println(f+" "+b4+" "+s4+" "+c4+" "+i4+" "+l4);

		//double-float,long,int,char,short,byte
		double d=2376.876867;
		byte b5=(byte)d;
		short s5=(short)d;
		char c5=(char)d;
		int i5=(int)d;
		long l5=(long)d;
		float f5=(float)d;
		System.out.println(d+" "+b5+" "+s5+" "+c5+" "+i5+" "+l5+" "+f5);
	}
	public static void main(String[] args)
	{
		new TypeCasting().implictTypeCast();
		explictTypeCast();
	}
}
