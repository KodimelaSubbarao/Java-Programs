class Test12
{
	public static void main(String[] args) 
	{
		System.out.println("M");
		Alpha.val=100;
		System.out.println("F");
		Alpha a = new Alpha();
	}
}
class Beta
{
	static 
	{
		System.out.println("Q");
		
	}
	Beta()
	{
		System.out.println("D");
	}
}
class Alpha extends Beta
{
	static int val;
	static 
	{
		System.out.println("W");
		val=1000;
	}
	
	Alpha()
	{
		System.out.println("C");
	}

	static 
	{
		System.out.println("R");
		val=1000;
	}
}
