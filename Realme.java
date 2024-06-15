package Interfaces;

public class Realme extends AbstractClass
{

	@Override
	public void price() 
	{
		System.out.println("price() called in Realme");
		
	}

	@Override
	public void features() 
	{
		System.out.println("features() called in Realme");
		
	}
	static void capture()
	{
		System.out.println("capture() called in Realme");
	}
	
	public void stock()
	{
		System.out.println("stock() called in Realme");
	}
}
