class ClassNotFoundExpDemo 
{
	public ClassNotFoundExpDemo ()
		{
		Class c;
		try { 
				c = Class.forName("TestClass"); 
			} 
		catch (ClassNotFoundException e) { 
				e.printStackTrace(); 
			} 
		}
	public static void main(String[] args) 
	{
		ClassNotFoundExpDemo cnfd=new ClassNotFoundExpDemo();
	}
}
