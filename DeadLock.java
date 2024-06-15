package MultiThreading;

public class DeadLock 
{
	public static void main(String[] args) 
	{
		final String a="Java";
		final String b="Python";
		Thread t1=new Thread()
				{
					public void run()
					{
						synchronized(a)
						{
							System.out.println("Thread 1 locked on A");
							try {
								Thread.sleep(100);
							}
							catch(Exception e)
							{
								e.printStackTrace();
							}
							synchronized(b)
							{
								System.out.println("Thread 1 locked on B");
							}
							System.out.println("no dead lock");
						}
					}
				};
				
				Thread t2=new Thread()
					{
						public void run()
						{
							synchronized(b)
							{
								System.out.println("Thread 1 locked on B");
								try {
									Thread.sleep(100);
								}
								catch(Exception e)
								{
									e.printStackTrace();
								}
								synchronized(a)
								{
									System.out.println("Thread 1 locked on A");
								}
								
							}
							System.out.println("no dead lock");
						}
					};
				t1.start();
				t2.start();
	}
}
