package Exception;

public class MinBalance extends Exception
{
	String message;
	public MinBalance(String message)
	{
		this.message=message;
	}
	@Override
	public String toString()
	{
		return message;
	}
	
}
