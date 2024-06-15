package practice;

public class StringHandle
{
	static void meth1()
	{
		//StringBuffer sb="sa"; CE
		StringBuffer sb=new StringBuffer("sa");
		System.out.println(sb.capacity());
	}
	public static void main(String[] args) {
		meth1();
	}
}
