class Test
{
 public void accept(int x, long y)
	 {
		 System.out.println("int-long");
	 }
	 public void accept(long x, int y)
	 {
		 System.out.println("long-int");
	 }
}

public class MethodOverloading 
{
	public static void main(String[] args) 
	{
		Test t1 = new Test();  
		t1.accept(29,29);	
	}
}