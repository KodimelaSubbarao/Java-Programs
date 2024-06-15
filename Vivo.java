package Interfaces;

public class Vivo implements Mobile
{

	@Override
	public void ram() 
	{
		System.out.println("ram() called");
	}

	@Override
	public void storage() 
	{
		System.out.println("storage() called");
	}

	@Override
	public void price() 
	{
		System.out.println("price() called");
	}

	@Override
	public void features() 
	{
		System.out.println("features() called");
	}
	

}
