package Class;

public class GrbageCollecter 
{
	void meth1()
	{
		GrbageCollecter obj=new GrbageCollecter();
		System.out.println("meth1() called");
	}
	protected void finalize()
	{
		System.out.println("gc() called");
	}
	public static void main(String[] args) 
	{
		GrbageCollecter obj1=new GrbageCollecter();
		GrbageCollecter obj2=new GrbageCollecter();
		GrbageCollecter obj3=new GrbageCollecter();
		obj2=obj1; //re-assign the another refrence
		System.out.println(obj1.hashCode());
		System.out.println(obj2.hashCode());
		obj2.meth1();
		obj3=null;
		//System.gc();
		Runtime r=Runtime.getRuntime();
		r.gc();
	}
}
