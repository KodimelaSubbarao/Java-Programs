package Interfaces;

public interface Mobile 
{
	public void ram();
	
	public void storage();
	
	public void price();
	
	public void features();
	
	public default void model()
	{
		battery();
		System.out.println("model() called in Mobile");
	}
	
	static void capture()
	{
		battery();
		System.out.println("Cature() called in Mobile");
	}
	
	private static void battery()
	{
		System.out.println("battery() called in Mobile");
	}
}
