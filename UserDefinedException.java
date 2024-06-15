package Exception;

public class UserDefinedException 
{
	static int amount =1000;
	void meth1(int withdraw)
	{
		try
		{
			if(amount<withdraw)
			{
				throw new MinBalance("Insufficent Balance...! please deposit amount after try to withdeaw it.");
			}
			else
			{
				System.out.println("Take Your Amount is "+withdraw);
			}
		}
		catch(MinBalance m)
		{
			m.printStackTrace();
			System.out.println(m.toString());
		}
	}
	void meth1()
	{
//		try {
//			if(age>=18)
//			{
//				System.out.println("your are eligible for votting plese goahead");
//			}
//			else 
//			{
//				throw new InvalidAgeException("your age is below 18 so your are not eligible for votting");
//			}
//			
//		}
//		catch(InvalidAgeException e)
//		{
//			e.printStackTrace();
//		}

	}
	public static void main(String[] args) 
	{
		new UserDefinedException().meth1(2000);
	}
}
