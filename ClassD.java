package MultiThreading;

public class ClassD 
{
	public static void main(String[] args) 
	{
		ClassC cobj=new ClassC();
		new Thread()
		{
			@Override
			public void run()
			{
				try {
					cobj.wihdraw(20000);
				}
				catch(Exception e)
				{
					e.printStackTrace();
				}
			}
		}
		.start();
		
		new Thread()
		{
			@Override
			public void run()
			{
				try {
					cobj.deposit(90000);
				}
				catch(Exception e)
				{
					e.printStackTrace();
				}
			}
		}
		.start();
	}
}
