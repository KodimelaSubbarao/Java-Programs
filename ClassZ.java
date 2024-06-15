package Exception;

public class ClassZ extends Thread
{
	public void run()
	{
		System.out.println("I am Ready to Interview");
		for(int i=1;i<=5;i++)
			System.out.println("This is my "+i+" Interview");
		try {
			Thread.sleep(5000);
		}
		catch(Exception e)
		{
			System.out.println("My Sleeping Distrubed");
		}
		System.out.println("I got Job, I am realx");
	}
	public static void main(String[] args) throws InterruptedException
	{
		ClassZ zobj=new ClassZ();
		ClassX xobj=new ClassX();
//		xobj.join();
		
//		xobj.join();
//		xobj.sleep(5000);
//		Thread.sleep(5000,1000);
		
		xobj.start();
		//xobj.join();
		//Thread.sleep(1000);
		Thread.yield();
		zobj.start();
		zobj.interrupt();
//		for(int i=0;i<5;i++)
//			System.out.println("ClassZ main() : "+i);
		
		
	}
}
