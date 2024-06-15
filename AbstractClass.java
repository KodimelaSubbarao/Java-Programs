package Interfaces;

public abstract class AbstractClass implements Mobile
{
	public void ram()
	{
		System.out.println("ram() called in AC");
	}
	public void storage()
	{
		System.out.println("storage() called in AC");
	}
	
	static void capture()
	{
		System.out.println("capture() called in AC");
	}
	public void ac()
	{
		System.out.println("ac() called in AC");
	}
}
