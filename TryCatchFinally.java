package Exception;

public class TryCatchFinally 
{
	void meth1(int a,int b)
	{
		System.out.println("meth1() called");
		try
		{
			int c=a/b;
			System.out.println("Divison value c: "+c);
		}
		catch(Exception e)
		{
			System.out.println(e.toString());
			System.out.println(e.hashCode());
			System.out.println("\n printStackTrace() ");
			e.printStackTrace();
//			System.out.println("\n setStackTrace(null) ");
//			e.setStackTrace(null);
//			System.out.println("\n addSuppressed()");
//			e.addSuppressed(e);
			
			System.out.println("\n get message() "+e.getMessage());
			System.out.println("\n getLocalizedMessage() "+e.getLocalizedMessage());
			System.out.println("\n getCause() "+e.getCause());
			System.out.println("\n getStackTrace() "+e.getStackTrace().toString());
			System.out.println("\n getSuppressed() "+e.getSuppressed().toString());
			System.out.println("\n fillInStackTrace() "+e.fillInStackTrace());
			System.out.println("\n initCause(e) "+e.initCause(e));
			
//			System.out.println("\n printStackTrace() ");
//			e.printStackTrace();
		}
	}
	public static void main(String[] args) 
	{
		TryCatchFinally obj=new TryCatchFinally();
		obj.meth1(10, 0);
	}
}
